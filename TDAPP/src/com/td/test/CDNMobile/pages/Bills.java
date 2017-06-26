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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Pay a Canadian bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay a Canadian bill' and @index='1']")
	private MobileElement pay_Cananda_Bill;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Manage Payees']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Payees']")
	private MobileElement manage_Payees;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Pay U.S. Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[ @text='Pay U.S. Bills' and @index='0']")
	private MobileElement pay_US_Bills;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label ='Bills']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Bills']")
	private MobileElement bills_Header;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@label,'Scheduled Payments')]")
	@AndroidFindBy(xpath = "//*[@text='Scheduled Payments']")
	private MobileElement scheduledPayments;

	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@label='No Upcoming Bills to display in this account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1' and @text='No Upcoming Bills to display in this account']")
	private MobileElement paymentMessage;
	
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[ @text='Pay Bills']")
	private MobileElement pay_Bills;

	@iOSFindBy(xpath ="//XCUIElementTypeOther[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pay Bill']")
	private MobileElement pay_Bills_Header;
	
	@iOSFindBy(xpath ="//XCUIElementTypeOther[@label='Manage Payees']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Payees']")
	private MobileElement manage_Payees_Header;

	@iOSFindBy(xpath ="//XCUIElementTypeOther[@label='Pay U.S. Bill' or @label='Pay U.S. bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay U.S. Bills']")
	private MobileElement pay_US_Bills_Header;
	
	@iOSFindBy(xpath ="//XCUIElementTypeOther[@label='Scheduled Payments']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Scheduled Payments']")
	private MobileElement scheduled_Payments_Header;

	@iOSFindBy(xpath="//XCUIElementTypeButton[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;
	
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label='Logout']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement logout;
	
	@iOSFindBy(xpath ="//XCUIElementTypeButton[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_Button;  


	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progrees_Bar;

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
			mobileAction.FuncClick(pay_Cananda_Bill, "Pay Canada Bill");
			mobileAction.waitForElementToVanish(progrees_Bar);
			Thread.sleep(2000);
		}catch (NoSuchElementException e) {
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

	public void click_ManagePayees() {
		Decorator();
		try {
			mobileAction.FuncClick(manage_Payees, "Manage Payees");
			Thread.sleep(2000);
			mobileAction.waitForElementToVanish(progrees_Bar);

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
	 * This method will click on the manage_Payees button on Bill page
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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyBillHeader()  {
		Decorator();
		try {
			
			mobileAction.verifyElementIsDisplayed(bills_Header, "bills_Header");

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
	public void click_pay_US_bill() {

		try {
			Decorator();

			String Bill_header = "Verifying Bill Page Header";

			// mobileAction.verifyElementIsDisplayed(bills_Header, Bill_header);
			mobileAction.FuncClick(pay_US_Bills, "Pay US Bills");
			mobileAction.waitForElementToVanish(progrees_Bar);

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
			mobileAction.FuncClick(scheduledPayments,"Scheduled Payments");
			mobileAction.waitForElementToVanish(progrees_Bar);
			mobileAction.verifyElementIsDisplayed(paymentMessage,"No Upcoming Bills to display in this account");
		}catch (NoSuchElementException e) {
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
		mobileAction.verifyElementIsDisplayed(bills_Header, "Verifyipay_US_Bills_Headerng Bill Page Header");
		mobileAction.FuncClick(pay_Bills, "Pay Bills");
		mobileAction.verifyElementIsDisplayed(pay_Bills_Header, "Pay Bill Functionality Page Displayed");
		mobileAction.FuncClick(back_Button, "Back");
		mobileAction.FuncClick(pay_US_Bills, "Pay US Bills");
		mobileAction.verifyElementIsDisplayed(pay_US_Bills_Header, "Pay US Bill Functionality Page Displayed");
		mobileAction.FuncClick(back_Button, "Back");
		mobileAction.FuncClick(scheduledPayments, "Scheduled Payments");
		mobileAction.verifyElementIsDisplayed(scheduled_Payments_Header, "Scheduled Payments Functionality Page Displayed");
//		mobileAction.FuncClick(back_Button, "Back");
//		mobileAction.FuncClick(back_Button, "Back");
		}else{
		Thread.sleep(10000);
		mobileAction.verifyElementIsDisplayed(bills_Header, "Verifying Bill Page Header");
		mobileAction.FuncClick(pay_Bills, "Pay Bills");
		mobileAction.verifyElementIsDisplayed(pay_Bills_Header, "Pay Bill Functionality Page Displayed");
		mobileAction.FuncClick(back_Button,"back arrow button clicked");
		mobileAction.FuncClick(pay_US_Bills, "Pay US Bills");
		mobileAction.verifyElementIsDisplayed(pay_US_Bills_Header, "Pay US Bill Functionality Page Displayed");
		mobileAction.FuncClick(back_Button,"back arrow button clicked");
		mobileAction.FuncClick(manage_Payees, "Manage Payees");


		mobileAction.verifyElementIsDisplayed(manage_Payees_Header, "Manage Payees Page Displayed");
		mobileAction.FuncClick(back_Button,"back arrow button clicked");
		mobileAction.FuncClick(scheduledPayments, "Scheduled Payments");
		mobileAction.verifyElementIsDisplayed(scheduled_Payments_Header, "Scheduled Payments Functionality Page Displayed");
		}
		mobileAction.FuncClick(menu, "Click Menu");
		mobileAction.FuncClick(logout,"Logout");
		mobileAction.waitForElementToVanish(progrees_Bar);
		}catch (NoSuchElementException e) {
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
	public void back_Button() {

	Decorator();
	try {
	if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
	mobileAction.FuncClick(back_Button, "BACK");
	}else{
		mobileAction.FuncHideKeyboard();
	}
	}  catch (NoSuchElementException e) {
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

}
