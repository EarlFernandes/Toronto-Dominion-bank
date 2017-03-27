package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Bills extends _CommonPage {

	private static Bills Bills;

	@iOSFindBy(xpath = "//*[@label='Pay Bill Pay a Canadian bill']")
	@AndroidFindBy(xpath = "//android.widget.TableRow[@resource-id='com.td:id/tableRow1']")
	private MobileElement pay_cananda_bill;

	@iOSFindBy(xpath = "//*[@label='Manage Payees Add, edit or delete a Canadian or U.S. Payee']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Payees']")
	private MobileElement manage_payees;

	@iOSFindBy(xpath = "//*[@label='Pay U.S. Bill Pay a U.S. bill']")
	@AndroidFindBy(xpath = "//android.widget.TableRow[@resource-id='com.td:id/tableRow3']")
	private MobileElement pay_us_bills;

	@iOSFindBy(xpath = "//*[@label ='Bills']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Bills']")
	private MobileElement bills_header;
	
	@iOSFindBy(xpath="//*[contains(@label,'Scheduled Payments View and cancel pending Canadian payments or')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Scheduled Payments']")
	private MobileElement scheduledPayments;

	@iOSFindBy(xpath="//*[@label='No Upcoming Bills to display in this account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1' and @text='No Upcoming Bills to display in this account']")
	private MobileElement paymentMessage;
	
	@iOSFindBy(xpath ="//*[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[ @text='Pay Bills']")
	private MobileElement pay_bills;

	@iOSFindBy(xpath ="//*[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pay Bill']")
	private MobileElement pay_bills_header;
	
	@iOSFindBy(xpath ="//*[@label='Manage Payees']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Payees']")
	private MobileElement manage_payees_header;

	@iOSFindBy(xpath ="//*[@label='Pay U.S. Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay U.S. Bills']")
	private MobileElement pay_us_bills_header;
	
	@iOSFindBy(xpath ="//*[@label='Scheduled Payments']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Scheduled Payments']")
	private MobileElement scheduled_payments_header;

	@iOSFindBy(xpath="//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;
	
	@iOSFindBy(xpath ="//*[@label='Logout']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement logout;
	
	@iOSFindBy(xpath ="//*[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_button;  


	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progrees_bar;

	public synchronized static Bills get() {
		if (Bills == null) {
			Bills = new Bills();
		}
		return Bills;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	public void clickPayCanadianBill() {
		Decorator();
		try {

			mobileAction.FuncClick(pay_cananda_bill, "Pay Canada Bill");
			mobileAction.waitForElementToVanish(progrees_bar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the Manage_payees button on Bill page
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

	public void click_ManagePayees() {
		Decorator();
		try {
			Decorator();
			mobileAction.FuncClick(manage_payees, "Manage Payees");
			Thread.sleep(2000);
			mobileAction.waitForElementToVanish(progrees_bar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the Manage_payees button on Bill page
	 * 
	 * 
	 *
	 * In case an exception occurs while clicking over the element.
	 * @throws InterruptedException 
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyBillHeader()  {
		Decorator();
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(bills_header, "Bills_header");
			
		} catch (NoSuchElementException | IOException   e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void click_pay_US_bill() {

		try {
			Decorator();

			String Bill_header = "Verifying Bill Page Header";

			// mobileAction.verifyElementIsDisplayed(bills_header, Bill_header);
			mobileAction.FuncClick(pay_us_bills, "Pay US Bills");
			mobileAction.waitForElementToVanish(progrees_bar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	
	public void scheduledPayments() {
		Decorator();
		try {
			Decorator();
			mobileAction.FuncClick(scheduledPayments,"Scheduled Payments");
			mobileAction.waitForElementToVanish(progrees_bar);
			mobileAction.verifyElementIsDisplayed(paymentMessage,"No Upcoming Bills to display in this account");
		
			
			
		}catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	* This method will verify Bill Payment landing page is accessed from menu Bill Payment
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
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
		mobileAction.verifyElementIsDisplayed(bills_header, "Verifyipay_us_bills_headerng Bill Page Header");
		mobileAction.FuncClick(pay_bills, "Pay Bills");
		mobileAction.verifyElementIsDisplayed(pay_bills_header, "Pay Bill Functionality Page Displayed");
		mobileAction.FuncClick(back_button, "Back");
		mobileAction.FuncClick(pay_us_bills, "Pay US Bills");
		mobileAction.verifyElementIsDisplayed(pay_us_bills_header, "Pay US Bill Functionality Page Displayed");
		mobileAction.FuncClick(back_button, "Back");
		mobileAction.FuncClick(scheduledPayments, "Scheduled Payments");
		mobileAction.verifyElementIsDisplayed(scheduled_payments_header, "Scheduled Payments Functionality Page Displayed");
		mobileAction.FuncClick(back_button, "Back");
		mobileAction.FuncClick(back_button, "Back");
		}else{
		Thread.sleep(10000);
		mobileAction.verifyElementIsDisplayed(bills_header, "Verifying Bill Page Header");
		mobileAction.FuncClick(pay_bills, "Pay Bills");
		mobileAction.verifyElementIsDisplayed(pay_bills_header, "Pay Bill Functionality Page Displayed");
		mobileAction.FuncClick(back_button,"back arrow button clicked");
		mobileAction.FuncClick(pay_us_bills, "Pay US Bills");
		mobileAction.verifyElementIsDisplayed(pay_us_bills_header, "Pay US Bill Functionality Page Displayed");
		mobileAction.FuncClick(back_button,"back arrow button clicked");
		mobileAction.FuncClick(manage_payees, "Manage Payees");


		mobileAction.verifyElementIsDisplayed(manage_payees_header, "Manage Payees Page Displayed");
		mobileAction.FuncClick(back_button,"back arrow button clicked");
		mobileAction.FuncClick(scheduledPayments, "Scheduled Payments");
		mobileAction.verifyElementIsDisplayed(scheduled_payments_header, "Scheduled Payments Functionality Page Displayed");
		}
		mobileAction.FuncClick(menu, "Click Menu");
		mobileAction.FuncClick(logout,"Logout");
		mobileAction.waitForElementToVanish(progrees_bar);
		}
	    catch (NoSuchElementException | InterruptedException | IOException e) {
	System.err.println("TestCase has failed.");
	CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
	}



	/**
	* This method will click on the Back  button 
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
	public void back_button() {

	Decorator();
	try {
	if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
	mobileAction.FuncClick(back_button, "BACK");
	}

	mobileAction.FuncHideKeyboard();
	} catch (NoSuchElementException | InterruptedException | IOException e) {
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
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("bills_str") + "']", "Bills title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("billsNavRowPayBill") + "']", "Pay bills");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("billsHintTextPayBill") + "']", "Pay a Canadian Bill");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("billsNavRowPayUSBill") + "']", "Pay U.S. Bills");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("billsHintTextPayUSBill") + "']", "Pay a U.S. Bill");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("billsNavRowManagePayee") + "']", "Manage Payees");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("billsHintTextManagePayee") + "']", "Add, edit or delete");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("billsNavRowUpcomingBills") + "']", "Scheduled Payments");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("usbp_schedule_payment_hint_message") + "']", "View/Cancel pending");				
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
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
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("payBillPageHeader") + "']", "Pay Bills title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/lblAmount' and @text='" + mobileAction.getAppString("payBillConfirmFieldHeaderFromAccount") + "']", "From Account");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/payeeLabel' and @text='" + mobileAction.getAppString("payBillConfirmFieldHeaderPayee") + "']", "Payee");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/amountLabel' and @text='" + mobileAction.getAppString("payBillDropdownHeaderAmount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/lblDate' and @text='" + mobileAction.getAppString("payBillConfirmFieldHeaderDate") + "']", "Date");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='" + mobileAction.getAppString("payBillButtonContinue") + "']", "Continue");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
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
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("pay_us_bill_page_title") + "']", "Pay Bill US title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/disclaimer' and @text='" + mobileAction.getAppString("disclaimer") + "']", "Disclaimer");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/from_label' and @text='" + mobileAction.getAppString("payBillDropdownHeaderFromAccount").replace(" ", "\n") + "']", "From Account");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/from_account_name' and @text='" + mobileAction.getAppString("payBillFieldTextFromAccount") + "']", "From Account Name");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/payee_label' and @text='" + mobileAction.getAppString("payBillConfirmFieldHeaderPayee") + "']", "Payee");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/payee_name' and @text='" + mobileAction.getAppString("payee_hint") + "']", "Payee name");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/amount_label' and @text='" + mobileAction.getAppString("str_Amount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/currency_lbl' and @text='" + mobileAction.getAppString("usd") + "']", "USD label");
				mobileAction.verifyElementUsingXPath("//android.widget.RadioButton[@resource-id='com.td:id/button_left' and @text='" + mobileAction.getAppString("usd") + "']", "USD");
				mobileAction.verifyElementUsingXPath("//android.widget.RadioButton[@resource-id='com.td:id/button_right' and @text='" + mobileAction.getAppString("cad") + "']", "CAD");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/reason_label' and @text='" + mobileAction.getAppString("reason_for_payment_label") + "']", "Reason for payment");
				mobileAction.verifyElementUsingXPath("//android.widget.EditText[@resource-id='com.td:id/reason_for_payment' and @text='" + mobileAction.getAppString("reason_for_payment_hint") + "']", "Reason for payment hint");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/button_footer' and @text='" + mobileAction.getAppString("str_continue") + "']", "Continue Button");
				//FIXME: Need to scroll down here
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/reason_for_payment_layout' and @text='" + mobileAction.getAppString("reason_for_payment_rule") + "']", "Reason for payment rule");
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/reason_for_payment_rule' and @text='" + mobileAction.getAppString("learn_more") + "']", "Learn more");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
