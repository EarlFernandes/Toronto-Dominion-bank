package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Bills extends _CommonPage {

	private static Bills Bills;

	@iOSFindBy(accessibility = "BILLVIEW_PAYBILL_DES")
	private MobileElement pay_cananda_bill_desc;

	@iOSFindBy(accessibility = "BILLVIEW_PAYEE_DES")
	private MobileElement manage_payees_desc;

	@iOSFindBy(accessibility = "BILLVIEW_PAYUSBILL_DES")
	private MobileElement pay_us_bills_desc;

	@iOSXCUITFindBy(accessibility = "BILLVIEW_PAYBILL")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay a Canadian bill' and @index='1']")
	private MobileElement pay_Cananda_Bill;

	@iOSXCUITFindBy(accessibility = "BILLVIEW_PAYEE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Payees']")
	private MobileElement managePayees;

	@iOSFindBy(accessibility = "BILLVIEW_PAYUSBILL")
	@AndroidFindBy(xpath = "//android.widget.TextView[ @text='Pay U.S. Bills' and @index='0']")
	private MobileElement pay_US_Bills;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label ='Bills' or @name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Bills']")
	private MobileElement bills_Header;

	@iOSFindBy(accessibility = "BILLVIEW_SCHEDULE")
	@AndroidFindBy(xpath = "//*[@text='Scheduled Payments']")
	private MobileElement scheduledPayments;

	@iOSFindBy(accessibility = "BILLVIEW_SCHEDULE_DES")
	private MobileElement scheduledPaymentsDes;

	@iOSFindBy(accessibility = "PAYBILL_VIEW_FROM")
	private MobileElement fromAccountPayBillCad;

	@iOSFindBy(accessibility = "PAYBILL_VIEW_PAYEE")
	private MobileElement payeePayBillCad;

	@iOSFindBy(accessibility = "PAYBILL_VIEW_CONTINUE")
	private MobileElement continuePayBillCad;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='No Upcoming Bills to display in this account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1' and @text='No Upcoming Bills to display in this account']")
	private MobileElement paymentMessage;

	@iOSFindBy(accessibility = "BILLVIEW_PAYBILL")
	@AndroidFindBy(xpath = "//android.widget.TextView[ @text='Pay Bills']")
	private MobileElement pay_Bills;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pay Bill']")
	private MobileElement pay_Bills_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Manage Payees']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Payees']")
	private MobileElement manage_Payees_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Pay U.S. Bill' or @label='Pay U.S. bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay U.S. Bills' or @text='Pay U.S. bill']")
	private MobileElement pay_US_Bills_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Scheduled Payments']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Scheduled Payments']")
	private MobileElement scheduled_Payments_Header;

	@iOSFindBy(accessibility = "PAYBILL_VIEW_DATE_VALUE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtDate']")
	private MobileElement datePicker;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Logout']")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@resource-id='com.td:id/navText' or @resource-id='com.td:id/textview_flyout_menu_item') and @text='Logout']")
	private MobileElement logout;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/upcomingbill_date_value']")
	private MobileElement upcomingBillDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/headerDate']")
	private List<MobileElement> dateHeaders;

	@iOSFindBy(accessibility = "PAYBILL_VIEW_PAYEE")
	@AndroidFindBy(id = "com.td:id/payeeLabel")
	private MobileElement payeePerf;

	public synchronized static Bills get() {
		if (Bills == null) {
			Bills = new Bills();
		}
		return Bills;
	}

	private void initElementPayUSBill() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				pay_US_Bills = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("billsNavRowPayUSBill").replaceAll("\\<.*?>", "") + "']",
						"Pay US bills");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void initElementManagePayees() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				managePayees = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("billsNavRowManagePayee") + "']", "Manage Payees");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void initElementScheduledPayments() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				scheduledPayments = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text = '" + mobileAction.getAppString("str_Scheduled_Bills")
								+ "' or " + "@text='" + mobileAction.getAppString("billsNavRowUpcomingBills") + "']",
						"Scheduled Payments");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	public void clickPayCanadianBill() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				pay_Cananda_Bill = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("billsNavRowPayBill") + "']",
						"Pay Canada bill");
			}

			mobileAction.FuncClick(pay_Cananda_Bill, "Pay Canada Bill");

			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on the manage_Payees button on Bill page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void clickManagePayees() {
		Decorator();
		try {
			Decorator();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				managePayees = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("billsNavRowManagePayee") + "']", "Manage Payees");
			}

			mobileAction.FuncClick(managePayees, "Manage Payees");
			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on the manage_Payees button on Bill page
	 * 
	 * 
	 *
	 * In case an exception occurs while clicking over the element.
	 * 
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyBillHeader() {
		Decorator();
		try {

			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();

			mobileAction.verifyElementIsDisplayed(pageHeader, "Bills Header");
			mobileAction.verifyElementTextContains(pageHeader,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_BILLS));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on the Pay Us bill button on Bill page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickPayUSBill() {

		try {
			Decorator();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				pay_US_Bills = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("billsNavRowPayUSBill").replaceAll("\\<.*?>", "") + "']",
						"Pay US bills");
			}

			mobileAction.FuncClick(pay_US_Bills, "Pay US Bills");
			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on the Scheduled Payments button on Bills page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void scheduledPayments() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				scheduledPayments = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text = '" + mobileAction.getAppString("str_Scheduled_Bills")
								+ "' or " + "@text='" + mobileAction.getAppString("billsNavRowUpcomingBills") + "']",
						"Scheduled Payments");
			}

			mobileAction.FuncClick(scheduledPayments, "Scheduled Payments");
			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify Bill Payment landing page is accessed from menu
	 * Bill Payment
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void bill_landingpage() {

		try {
			Decorator();
			initElementPayUSBill();
			initElementManagePayees();
			initElementScheduledPayments();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementIsDisplayed(bills_Header, "Verifyipay_US_Bills_Headerng Bill Page Header");
				mobileAction.FuncClick(pay_Bills, "Pay Bills");
				mobileAction.verifyElementIsDisplayed(pay_Bills_Header, "Pay Bill Functionality Page Displayed");
				mobileAction.ClickBackButton();
				mobileAction.FuncClick(pay_US_Bills, "Pay US Bills");
				mobileAction.verifyElementIsDisplayed(pay_US_Bills_Header, "Pay US Bill Functionality Page Displayed");
				mobileAction.ClickBackButton();
				mobileAction.FuncClick(scheduledPayments, "Scheduled Payments");
				mobileAction.verifyElementIsDisplayed(scheduled_Payments_Header,
						"Scheduled Payments Functionality Page Displayed");
				// mobileAction.FuncClick(back_Button, "Back");
				// mobileAction.FuncClick(back_Button, "Back");
			} else {
				Thread.sleep(10000);
				mobileAction.verifyElementIsDisplayed(bills_Header, "Verifying Bill Page Header");
				mobileAction.FuncClick(pay_Bills, "Pay Bills");
				mobileAction.verifyElementIsDisplayed(pay_Bills_Header, "Pay Bill Functionality Page Displayed");
				mobileAction.ClickBackButton();
				mobileAction.FuncClick(pay_US_Bills, "Pay US Bills");
				mobileAction.verifyElementIsDisplayed(pay_US_Bills_Header, "Pay US Bill Functionality Page Displayed");

				mobileAction.ClickBackButton();
				mobileAction.FuncClick(managePayees, "Manage Payees");

				mobileAction.verifyElementIsDisplayed(manage_Payees_Header, "Manage Payees Page Displayed");
				mobileAction.ClickBackButton();
				mobileAction.FuncClick(scheduledPayments, "Scheduled Payments");
				mobileAction.verifyElementIsDisplayed(scheduled_Payments_Header,
						"Scheduled Payments Functionality Page Displayed");
			}

			// mobileAction.FuncClick(menu, "Click Menu");
			// mobileAction.FuncClick(logout,"Logout");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on the Back button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void back_Button() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.ClickBackButton();
			} else {
				mobileAction.FuncHideKeyboard();
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will verify text within elements for confirm cancel scheduled
	 * payment screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyConfirmCancelScheduledPaymentTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				final MobileElement scheduledPayment = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[contains(@value, '" + getTestdata("Payee") + "')]",
						"Scheduled payment");
				scheduledPayment.click();
				// final MobileElement header =
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE']",
				// "Bill Details title");
				// mobileAction.verifyTextEquality(header.getText(),
				// mobileAction.getAppString(""));
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='ENHANCED_RECEIPT_TITLE'
				// and @label='" +
				// mobileAction.getAppString("billsNavRowUpcomingBills") + "']",
				// "Upcoming Payment");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='ENHANCED_RECEIPT_MESSAGE'
				// and @value='" + mobileAction.getAppString("str_Active") +
				// "']", "Active");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[contains(@value,
				// '" + mobileAction.getAppString("receipt_confirmation") +
				// "')]", "Confirmation #");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@label='" + mobileAction
				// .getAppString("payBillConfirmFieldHeaderFromAccount").replaceAll("
				// ", "\n") + "']",
				// "From Account");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
				// + mobileAction.getAppString("payBillConfirmFieldHeaderPayee")
				// + "']", "Payee");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
				// + mobileAction.getAppString("payBillConfirmFieldHeaderDate")
				// + "']", "Date");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("str_Amount") + "']",
				// "Amount");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
				// +
				// mobileAction.getAppString("upcomingBillDetailsButtonCancelBillPayment")
				// + "']", "Cancel Payment");

			} else {
				final MobileElement scheduledPayment = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/mainText' and @text='" + getTestdata("Payee")
								+ "']",
						"Scheduled payment");
				scheduledPayment.click();
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Bill_Details") + "']",
						"Bill Details title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_Scheduled_Payment") + "']",
						"Scheduled Payment");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_pending") + "']",
						"Pending");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("order_receipt_confirmation") + "']", "Confirmation #");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("payBillDropdownHeaderFromAccount").replaceAll(" ", "\n") + "']",
						"From Account");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("payBillDropdownHeaderPayee") + "']", "Payee");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("payBillConfirmFieldHeaderDate") + "']", "Date");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_Amount") + "']", "Amount");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.Button[@resource-id='com.td:id/cancelBtn' and @text='"
										+ mobileAction.getAppString("cancel_scheduled_payment") + "']",
								"Cancel Payment");
				mobileAction.verifyDateFormat(upcomingBillDate.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the bills page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyBillsTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(bills_Header.getText(), mobileAction.getAppString("billsPageHeader"));
				mobileAction.verifyTextEquality(pay_Bills.getText(), mobileAction.getAppString("billsNavRowPayBill"));
				mobileAction.verifyTextEquality(pay_cananda_bill_desc.getText(),
						mobileAction.getAppString("billsHintTextPayBill"));
				mobileAction.verifyTextEquality(pay_US_Bills.getText(), mobileAction.getAppString("usbpNavRowTitle"));
				mobileAction.verifyTextEquality(pay_us_bills_desc.getText(),
						mobileAction.getAppString("usbpNavRowHint"));
				mobileAction.verifyTextEquality(managePayees.getText(),
						mobileAction.getAppString("manage_payees_title"));
				mobileAction.verifyTextEquality(manage_payees_desc.getText(),
						mobileAction.getAppString("billsHintTextManagePayee"));
				mobileAction.verifyTextEquality(scheduledPayments.getText(),
						mobileAction.getAppString("str_Scheduled_Bills"));
				mobileAction.verifyTextEquality(scheduledPaymentsDes.getText(),
						mobileAction.getAppString("schedulePaymentRowHint"));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("bills_str") + "']",
						"Bills title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("billsNavRowPayBill") + "']",
						"Pay bills");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("billsHintTextPayBill") + "']",
						"Pay a Canadian Bill");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("billsNavRowPayUSBill") + "']",
						"Pay U.S. Bills");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("billsHintTextPayUSBill") + "']", "Pay a U.S. Bill");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("billsNavRowManagePayee") + "']", "Manage Payees");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("billsHintTextManagePayee") + "']", "Add, edit or delete");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("billsNavRowUpcomingBills")
								+ "' or @text='" + mobileAction.getAppString("str_Scheduled_Bills") + "']",
						"Scheduled Payments");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("usbp_schedule_payment_hint_message") + "']",
						"View/Cancel pending");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements in scheduled payments
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyScheduledPaymentsTextElements() {
		Decorator();
		try {
			initElementScheduledPayments();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(scheduledPayments, "Scheduled Payments");
				mobileAction.waitProgressBarVanish();
				MobileElement header = mobileAction
						.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE']", "header");
				mobileAction.verifyTextEquality(header.getText(),
						mobileAction.getAppString("billsNavRowUpcomingBills"));
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
						+ mobileAction.getAppString("upcomingBillDetailsFieldHeaderDate") + "']", "Date tab");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
						+ mobileAction.getAppString("upcomingBillDetailsFieldHeaderPayee") + "']", "Payee");

			} else {
				mobileAction.FuncClick(scheduledPayments, "Scheduled Payments");
				mobileAction.waitProgressBarVanish();
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("str_Scheduled_Bills") + "']",
								"Scheduled Payments title");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/date' and @text='"
								+ mobileAction.getAppString("date") + "']", "Date tab");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/payee' and @text='"
								+ mobileAction.getAppString("payee") + "']", "Payee");
				for (MobileElement m : dateHeaders) {
					mobileAction.verifyDateFormat(m.getText(), MobileAction2.TYPE_MM_YYYY);
				}
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements when there are no payees
	 * when attempting to pay a bill
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyNoPayeesPayBillTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("billsNavRowPayBill") + "']", "Pay bills title");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("msg_no_payee_all") + "']",
						"You have not added msg");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
						+ mobileAction.getAppString("btn_add_canadian_payees_now") + "']", "Add canadian payee button");
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("billsNavRowPayBill") + "']",
						"Pay Bills title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				// System.out.println("source : "+ ((AppiumDriver)
				// CL.GetDriver()).getPageSource());
				final WebElement msg = mobileAction.verifyWebElementUsingXPath(
						"//span[@class='text-message ng-binding ng-scope']", "You have not added msg");
				final WebElement button = mobileAction.verifyWebElementUsingXPath(
						"//button[@class='primary-button ng-binding ng-scope']", "Add canadian payee button");
				if (!mobileAction.verifyTextEquality(msg.getText().trim(),
						mobileAction.getAppString("msg_no_payee_all"))
						|| !mobileAction.verifyTextEquality(button.getText().trim().replace("\"", ""),
								mobileAction.getAppString("btn_add_canadian_payees_now"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the canadian bills page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyPayCanadianBillTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(bills_Header.getText(), mobileAction.getAppString("pay_bill"));
				mobileAction.verifyTextEquality(payeePayBillCad.getText(), mobileAction.getAppString("payee"));

				mobileAction.verifyTextEquality(fromAccountPayBillCad.getText(),
						mobileAction.getAppString("payBillConfirmFieldHeaderFromAccount"));
				mobileAction.verifyTextEquality(continuePayBillCad.getText(), mobileAction.getAppString("Continue"));

			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("payBillPageHeader") + "']",
						"Pay Bills title");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/lblAmount' and @text='"
										+ mobileAction.getAppString("payBillDropdownHeaderFromAccount") + "']",
								"From Account");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/payeeLabel' and @text='"
								+ mobileAction.getAppString("payBillDropdownHeaderPayee") + "']",
						"Payee");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/amountLabel' and @text='"
								+ mobileAction.getAppString("payBillDropdownHeaderAmount") + "']",
						"Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/lblDate' and @text='"
								+ mobileAction.getAppString("payBillConfirmFieldHeaderDate") + "']",
						"Date");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='"
								+ mobileAction.getAppString("payBillButtonContinue") + "']",
						"Continue");
				mobileAction.verifyDateFormat(datePicker.getText(), MobileAction2.TYPE_YYYY_MM_DD_TODAY);
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the US bills page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyPayUSBillTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("pay_us_bill_page_title") + "']", "Pay Bill US title");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("disclaimer") + "']",
						"Disclaimer");

				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("payBillDropdownHeaderFromAccount").replace(" ", "\n") + "']",
						"From Account");

				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("payBillConfirmFieldHeaderPayee") + "']", "Payee");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("amount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("usbpCurrencyField") + "']",
						"currency");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("reason_for_payment_label") + "']", "Reason for payment");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("reason_for_payment_hint") +
				// "']", "Reason for payment hint");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("Continue") + "']",
						"Continue Button");
				final String xPathLearnMore = "//XCUIElementTypeStaticText[@name='PAYUSBILL_VIEW_FOOTER']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathLearnMore, false, 4, "up");
			} else {
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("pay_us_bill_page_title") + "']",
								"Pay Bill US title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/disclaimer' and @text='"
								+ mobileAction.getAppString("disclaimer") + "']",
						"Disclaimer");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/from_label' and @text='"
								+ mobileAction.getAppString("payBillDropdownHeaderFromAccount").replace(" ", "\n")
								+ "']",
						"From Account");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/from_account_name' and @text='"
										+ mobileAction.getAppString("payBillFieldTextFromAccount") + "']",
								"From Account Name");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/payee_label' and @text='"
								+ mobileAction.getAppString("payBillDropdownHeaderPayee") + "']",
						"Payee");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/payee_name' and @text='"
								+ mobileAction.getAppString("payee_hint") + "']",
						"Payee name");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/amount_label' and @text='"
								+ mobileAction.getAppString("amount") + "']",
						"Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/currency_lbl' and @text='"
								+ mobileAction.getAppString("usd") + "']",
						"USD label");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.RadioButton[@resource-id='com.td:id/button_left' and @text='"
								+ mobileAction.getAppString("usd") + "']",
						"USD");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.RadioButton[@resource-id='com.td:id/button_right' and @text='"
								+ mobileAction.getAppString("cad") + "']",
						"CAD");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/reason_label' and @text='"
										+ mobileAction.getAppString("reason_for_payment_label") + "']",
								"Reason for payment");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.EditText[@resource-id='com.td:id/reason_for_payment' and @text='"
								+ mobileAction.getAppString("reason_for_payment_hint") + "']",
						"Reason for payment hint");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/button_footer' and @text='"
								+ mobileAction.getAppString("str_continue") + "']",
						"Continue Button");
				final String xPathLearnMore = "//android.widget.TextView[@text='"
						+ mobileAction.getAppString("learn_more") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathLearnMore, false, 4, "up");
				mobileAction.verifyElementUsingXPath(xPathLearnMore, "Learn more");
				final MobileElement footerNote = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/reason_for_payment_rule']",
						"Reason for payment rule");
				final String footerNoteString = footerNote.getText();
				mobileAction.verifyTextEquality(footerNoteString.replace("??", " ").replaceAll("\n", " "), mobileAction
						.getAppString("reason_for_payment_rule").replaceAll("\"", "").replaceAll("\n", " "));
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickPayCanadianBillPERF() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				pay_Cananda_Bill = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("billsNavRowPayBill") + "']",
						"Pay Canada bill");
			}

			performance.click(pay_Cananda_Bill, "Pay Canada Bill");
			performance.verifyElementIsDisplayed(payeePerf, "Payee label");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
