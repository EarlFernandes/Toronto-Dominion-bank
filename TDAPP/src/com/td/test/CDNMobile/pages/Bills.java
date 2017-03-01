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
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay a Canadian bill' and @index='1']")
	private MobileElement pay_cananda_bill;

	@iOSFindBy(xpath = "//*[@label='Manage Payees Add, edit or delete a Canadian or U.S. Payee']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Payees']")
	private MobileElement manage_payees;

	@iOSFindBy(xpath = "//*[@label='Pay U.S. Bill Pay a U.S. bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[ @text='Pay U.S. Bills' and @index='0']")
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
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
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

}
