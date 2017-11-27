package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class Pay_US_Bill extends _CommonPage {

	private static Pay_US_Bill Pay_US_Bill;

	@iOSFindBy(accessibility = "PAYUSBILL_VIEW_FROM")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_name']")
	private MobileElement from_account;

	String already_selected_from_Account = "//XCUIElementTypeStaticText[contains(@label,'";
	// private MobileElement already_selected_from_Account;

	@iOSFindBy(xpath = "//*[@label='Pay U.S. Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and contains(@text,'Pay U.S. Bill')]")
	private MobileElement us_Bill_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Payee')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payee_name' and @text='Select U.S. Payee']")
	private MobileElement select_Account;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='PAYUSBILL_VIEW_AMOUNT']/../XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amount']")
	private MobileElement amount;

	@iOSFindBy(accessibility = "PAYUSBILL_VIEW_CONTINUE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer']")
	private MobileElement Continue;

	@iOSFindBy(accessibility = "PAYUSBILL_VIEW_PAYEE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payee_name']")
	private MobileElement select_payee_account;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.td:id/button_left' and @text='USD']")
	private MobileElement select_Usd;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/reason_for_payment']")
	private MobileElement reasonForPayment;

	@iOSFindBy(xpath = "//*[@label='Done' or @label='完成']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Important Note: As this involves a large amount in foreign exchange, please ensure the Amount is correct.']")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Important Note')]")
	private MobileElement verify_Message;

	// FIXME: What is the accessibility id for this?
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/estimated_delivery_date']")
	private MobileElement estDate;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Currency']")
	private MobileElement currency_Switchbox;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='2']")
	private MobileElement acntList;

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/listView']")
	private MobileElement payeeList;

	@iOSFindBy(xpath = "//*[@name='PAYBILLUS_PAY_BILL' or @name='PAYUSBILL_CONFIRM_PAYBILL']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer']")
	private MobileElement pay_bill_button;

	public synchronized static Pay_US_Bill get() {
		if (Pay_US_Bill == null) {
			Pay_US_Bill = new Pay_US_Bill();
		}
		return Pay_US_Bill;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	/**
	 * This method will Pay the US bills
	 * 
	 * @return void
	 * @throws Exception
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
	public void pay_US_bill_ErrorMsg() {

		try {
			Decorator();
			String verification_message = "As this involves a large amount in foreign exchange, please ensure the Amount is correct";
			String paybill = "Verification Page Is Dispalyed with PayBill Button";

			String amount_value = getTestdata("Amount");
			String reason_value = getTestdata("Reason");

			String to_accountno = getTestdata("ToAccount");
			System.out.println("To Account:" + to_accountno);
			System.out.println("Amount:" + amount_value);
			System.out.println("reason:" + reason_value);
			String to_account = "//android.widget.TextView[@resource-id='com.td:id/subtitle' and @text='" + to_accountno
					+ "']";
			if (platformName.equalsIgnoreCase("ios")) {
				boolean flag = us_Bill_Header.isDisplayed();
				if (flag) {
					mobileAction.FuncClick(from_account, "from_Account");
					String select_accountno = getTestdata("FromAccount");
					System.out.println("From Account:" + select_accountno);
					// mobileAction.FuncSelectElementInTable(select_account_table,
					// firstPart, secondPart, select_accountno);
					String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + select_accountno + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");

					mobileAction.FuncClick(select_Account, "Select_Account");
					String to_account_value = "//XCUIElementTypeStaticText[contains(@label,'" + to_accountno + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(to_account_value, true, 25, "Up");

					// mobileAction.FuncSelectElementInTable(to_account_table,
					// firstPart, secondPart, to_accountno);

					mobileAction.FuncClick(amount, "Amount");

					mobileAction.FuncSendKeys(amount, amount_value);
					mobileAction.FuncClickDone();
					mobileAction.FuncClick(reasonForPayment, "Reason");

					mobileAction.FuncSendKeys(reasonForPayment, reason_value);

					mobileAction.FuncClickDone();
					mobileAction.FuncClick(Continue, "continue");

					mobileAction.verifyElementIsDisplayed(pay_bill_button, paybill);
					mobileAction.verifyElementIsDisplayed(verify_Message, verification_message);
				}

			} else {

				String PayUSBill_header = "Verifying Pay US Bill Page Header";
				mobileAction.verifyElementIsDisplayed(us_Bill_Header, PayUSBill_header);

				mobileAction.FuncClick(from_account, "Select From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList, from_account, 0, "down", true);

				mobileAction.FuncClick(select_payee_account, "Select Payee Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList, to_account, 0, "down", true);

				mobileAction.FuncClick(amount, "Amount");
				mobileAction.FuncSendKeys(amount, amount_value);

				mobileAction.FuncClick(reasonForPayment, "Reason");
				mobileAction.FuncSendKeys(reasonForPayment, reason_value);
				mobileAction.FuncClick(Continue, "continue");
				mobileAction.verifyElementIsDisplayed(pay_bill_button, paybill);
				mobileAction.verifyElementIsDisplayed(verify_Message, verification_message);
			}

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
	 * This method will verify the currency drop down in PAY US bill page.
	 * 
	 * @return void
	 * @throws Exception
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

	public void verifyCurrencyDropDown() {

		String select_account_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
		String firstPart = "//XCUIElementTypeCell[";
		String secondPart = "]/XCUIElementTypeStaticText[1]";
		String finalPart = firstPart + 1 + secondPart;

		String us_accountno = getTestdata("USAccount");
		String select_from_Account = "//android.widget.TextView[starts-with(@text,'" + us_accountno + "']";
		try {
			Decorator();
			if (platformName.equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(us_Bill_Header))

					mobileAction.FuncClick(from_account, "from_Account");

				System.out.println("us_accountno" + us_accountno);
				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + us_accountno + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");

				// mobileAction.FuncSelectElementInTable(select_account_table,
				// firstPart, secondPart, us_accountno);
				boolean elementExists = currency_Switchbox.isDisplayed();
				mobileAction.verifyElementIsDisplayed(currency_Switchbox, "");
				if (!elementExists) {

					CL.GetDriver().findElement(By.xpath(finalPart)).click();
					;

					String from_Accountno = getTestdata("FromAccount");
					mobileAction.FuncSelectElementInTable(select_account_table, firstPart, secondPart, from_Accountno);
					mobileAction.verifyElementIsDisplayed(currency_Switchbox, "t_currencyswitchbox");

				}

			} else {
				mobileAction.FuncClick(from_account, "Select From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList, select_from_Account, 0, "down", true);

				if (select_from_Account.equalsIgnoreCase("US")) {
					boolean switchBox = mobileAction.verifyElement(select_Usd, "USD");
					if (!switchBox) {
					}

				} else {

					mobileAction.verifyElementIsDisplayed(select_Usd, "USD");
				}

			}

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
	 * This method will verify text within elements for the US bills page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyPayUSBillWelcomeTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("billsNavRowPayUSBill") + "']",
								"Pay Bills US title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement header = mobileAction.verifyWebElementUsingXPath(
						"//h2[@class='limited-accounts-heading ng-binding']", "Welcome to Us bill pay");
				final WebElement msg1 = mobileAction.verifyWebElementUsingXPath(
						"(//span[@class='limited-accounts-message ng-binding'])[1]", "With U.S. msg");
				final WebElement msg2 = mobileAction.verifyWebElementUsingXPath(
						"(//span[@class='limited-accounts-message ng-binding'])[2]", "Your payment is withdrawn msg");
				final WebElement button = mobileAction.verifyWebElementUsingXPath(
						"//button[@class='primary-button ng-binding']", "Get Started button");
				if (!mobileAction.verifyTextEquality(msg1.getText().trim(),
						mobileAction.getAppString("USBillPayCustomerNotRegisteredDescription1"))
						|| !mobileAction.verifyTextEquality(button.getText().trim(),
								mobileAction.getAppString("btn_get_started"))
						|| !mobileAction.verifyTextEquality(msg2.getText().trim(),
								mobileAction.getAppString("USBillPayCustomerNotRegisteredDescription2") + "\n"
										+ mobileAction.getAppString("learn_more_us_bill_pay"))) {
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
			} catch (Exception ex) {
				System.out.print("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the US bills success
	 * page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyPayUSBillSuccessTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				payUSBillToConfirmation();
				mobileAction.FuncClick(pay_bill_button, "Pay bill");
				mobileAction.waitProgressBarVanish();
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_PAY_US_BILL_TITLE) + "']", "Pay US Bill title");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("receipt_thankyou") + "']",
						"Thank you!");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[contains(@value,'"
						+ mobileAction.getAppString("bill_paid_successfully") + "')]", "Payment Submitted");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("note") + "']", "Note");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[starts-with(@value, '"
				// +
				// mobileAction.getAppString("confirmation_no").replace("%1$s",
				// "") + "')]",
				// "Confirmation #");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// +
				// mobileAction.getAppString("payBillConfirmFieldHeaderFromAccount").replace("
				// ", "\n") + "']",
				// "From Account");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// +
				// mobileAction.getAppString("payBillConfirmFieldHeaderAmount")
				// + "']", "Amount");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("estimated_delivery_date") +
				// "']", "Est delivery date");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='"
				// +
				// mobileAction.getAppString("transfersFXExchangeRate").replace("
				// ", "\n") + "']",
				// "Exchange Rate");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("payBillConfirmFieldHeaderPayee")
				// + "']", "Payee");
				// final String xPathQuickActionBar =
				// "//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("str_HOME") + "']";
				// mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathQuickActionBar,
				// false, 4, "up");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("service_fee") + "']",
				// "Service Fee");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("total_amount") + "']",
				// "Total Amount");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("reason_for_payment_label") +
				// "']", "Reason for payment");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("pay_another_bill") + "']",
				// "PAY ANOTHER BILL");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("receipt_scheduledpayments") +
				// "']", "SCHEDULED PAYMENTS");
				// mobileAction.verifyDateFormat(estDate.getText(),
				// MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
			} else {
				payUSBillToConfirmation();
				mobileAction.FuncClick(pay_bill_button, "Pay bill");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("pay_us_bill_page_title") + "']",
								"Pay US Bill title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/thank_you_label' and @text='"
								+ mobileAction.getAppString("receipt_thankyou") + "']",
						"Thank you!");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/label' and contains(@text,'"
										+ mobileAction.getAppString("bill_paid_successfully") + "')]",
								"Payment Submitted");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/note' and @text='"
								+ mobileAction.getAppString("note") + "']", "Note");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[starts-with(@text, '"
								+ mobileAction.getAppString("confirmation_no").replace("%1$s", "") + "')]",
						"Confirmation #");

				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@text='" + mobileAction
										.getAppString("payBillDropdownHeaderFromAccount").replace(" ", "\n") + "']",
								"From Account");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("payBillConfirmFieldHeaderAmount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("estimated_delivery_date") + "']", "Est delivery date");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("transfersFXExchangeRate").replace(" ", "\n") + "']",
						"Exchange Rate");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/payee_label' and @text='"
								+ mobileAction.getAppString("payBillDropdownHeaderPayee") + "']",
						"Payee");
				final String xPathQuickActionBar = "//android.widget.HorizontalScrollView[@resource-id='com.td:id/quick_action_bar']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathQuickActionBar, false, 4, "up");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("service_fee") + "']",
						"Service Fee");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("total_amount") + "']",
						"Total Amount");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("reason_for_payment_label") + "']", "Reason for payment");
				// mobileAction.verifyElementUsingXPath(
				// "//android.widget.TextView[@text='" +
				// mobileAction.getAppString("str_HOME") + "']", "HOME");
				// mobileAction.verifyElementUsingXPath(
				// "//android.widget.TextView[@text='" +
				// mobileAction.getAppString("pay_another_bill") + "']",
				// "PAY ANOTHER BILL");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
				// + mobileAction.getAppString("receipt_scheduledpayments") +
				// "']", "SCHEDULED PAYMENTS");
				mobileAction.verifyDateFormat(estDate.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
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
	 * This method will verify text within elements for the US bills
	 * confirmation page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyPayUSBillConfirmationTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				payUSBillToConfirmation();
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("usbp_legal_notes")
				// .replace("#LINK#",
				// mobileAction.getAppString("usbp_legal_notes_link")) + "']",
				// "Terms and conditions");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// +
				// mobileAction.getAppString("payBillDropdownHeaderFromAccount").replace("
				// ", "\n") + "']",
				// "From Account");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("payBillConfirmFieldHeaderPayee")
				// + "']", "Payee");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("estimated_delivery_date") + "']", "Est delivery date");
				final String xPathReason = "//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("reason_for_payment_label") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathReason, false, 3, "up");
				// mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathReason,
				// false, 4, "up");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='"
				// +
				// mobileAction.getAppString("transfersFXExchangeRate").replace("
				// ", "\n") + "']",
				// "Exchange Rate");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("payBillConfirmButtonPayBill") +
				// "']", "Pay Bill");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("service_fee") + "']",
				// "Service Fee");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// +
				// mobileAction.getAppString("payBillConfirmFieldHeaderAmount")
				// + "']", "Amount");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("total_amount") + "']",
				// "Total Amount");
				mobileAction.verifyElementUsingXPath(xPathReason, "Reason for payment");
				// mobileAction.verifyDateFormat(estDate.getText(),
				// MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
			} else {
				payUSBillToConfirmation();
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/terms_conditions' and @text='"
								+ mobileAction.getAppString("usbp_legal_notes").replace("#LINK#",
										mobileAction.getAppString("usbp_legal_notes_link"))
								+ "']",
						"Terms and conditions");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/from_label' and @text='"
								+ mobileAction.getAppString("payBillDropdownHeaderFromAccount").replace(" ", "\n")
								+ "']",
						"From Account");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/payee_label' and @text='"
								+ mobileAction.getAppString("payBillDropdownHeaderPayee") + "']",
						"Payee");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("estimated_delivery_date") + "']", "Est delivery date");
				final String xPathReason = "//android.widget.TextView[@text='"
						+ mobileAction.getAppString("reason_for_payment_label") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathReason, false, 4, "up");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("transfersFXExchangeRate").replace(" ", "\n") + "']",
						"Exchange Rate");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("payBillConfirmButtonPayBill") + "']", "Pay Bill");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("service_fee") + "']",
						"Service Fee");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("payBillConfirmFieldHeaderAmount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("total_amount") + "']",
						"Total Amount");
				mobileAction.verifyElementUsingXPath(xPathReason, "Reason for payment");
				mobileAction.verifyDateFormat(estDate.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
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

	private void payUSBillToConfirmation() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(from_account, "From Account");
				String from_accountNo = "//XCUIElementTypeStaticText[contains(@value, '" + getTestdata("FromAccount")
						+ "')]";

				MobileElement fromAccountval = (MobileElement) (CL.GetAppiumDriver())
						.findElement(By.xpath(from_accountNo));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
				mobileAction.FuncClick(select_payee_account, "Select Payee");
				String to_accountNo = "//XCUIElementTypeStaticText[contains(@value, '" + getTestdata("Payee") + "')]";

				MobileElement toAccountval = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(to_accountNo));
				mobileAction.FunCSwipeandScroll(toAccountval, true);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncClickDone();
				MobileElement memo = (MobileElement) (CL.GetAppiumDriver()).findElement(
						By.xpath("//*[@name='PAYUSBILL_VIEW_REASON']/../XCUIElementTypeTextField[1]"));
				mobileAction.FuncClick(memo, "US memo clicked");
				mobileAction.FuncSendKeys(memo, "us test bill pay");
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(Continue, "Continue_pay");
			} else {
				// Seems like selector for from account/payee do not work here
				// We just need to get to confirmation page, so select default
				// fields
				mobileAction.FuncClick(from_account, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList,
						"//android.widget.TextView[@resource-id='com.td:id/name' and @index='0']", 1, "down", true);
				mobileAction.FuncClick(select_payee_account, "Select Payee");
				mobileAction.FuncElementSwipeWhileNotFound(payeeList,
						"//android.widget.TextView[@text='" + getTestdata("Payee") + "']", 1, "down", true);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(reasonForPayment, "reason for payment clicked");
				mobileAction.FuncSendKeys(reasonForPayment, getTestdata("Reason"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(Continue, "Continue_pay");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("pay_us_bill_page_title") + "']",
								"Pay US Bill title");
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
}
