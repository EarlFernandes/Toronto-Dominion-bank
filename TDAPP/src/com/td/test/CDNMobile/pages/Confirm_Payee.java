package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Confirm_Payee extends _CommonPage{

	
	private static Confirm_Payee Confirm_Payee;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[@label='Confirm']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Confirm']")
	private MobileElement confirm_Header;

	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@label='Payee Name']")
	private MobileElement payee_Name;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@label='Access Card']")
	private MobileElement access_Card;

	@iOSFindBy(xpath="//XCUIElementTypeButton[@label='Add Payee']")
	private MobileElement addPayee_Btn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay This Payee']")
	private MobileElement payThisPayee;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Thank You!')]")
	private MobileElement successMsg;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Pay Bill']")
	private MobileElement payBill_Header;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Select Payee']")
	private MobileElement select_Payee;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue'and @text='Pay Bill']")
	private MobileElement pay_Bill;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Invalid transaction amount.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement errorMsg;
	
	String accountNoXL=getTestdata("Payee");
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[3]")
	private MobileElement payee_Table;
	
	public synchronized static Confirm_Payee get() {
		if (Confirm_Payee == null) {
			Confirm_Payee = new Confirm_Payee();
		}
		return Confirm_Payee;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		
	}

	
	
	
	/**
	 * This method will confirms the canadian payee is added
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
	 */
	
	public void verifyConfirmPage(){
		try {
			Decorator();
		mobileAction.verifyElementIsDisplayed(confirm_Header, "Confirm");
		//mobileAction.verifyElementIsDisplayed(payee_Name, "Payee Name");
		//mobileAction.verifyElementIsDisplayed(access_card, "Access Card");	
		mobileAction.FuncClick(addPayee_Btn, "AddPayee");
		mobileAction.waitForElementToVanish(progressBar);
		
		//mobileAction.verifyElementIsDisplayed(successMsg, "Thank You!");
		mobileAction.FuncClick(payThisPayee, "Pay This Payee");
		mobileAction.waitForElementToVanish(progressBar);
		boolean flag=mobileAction.FuncIsDisplayed(payBill_Header);
		if(flag)
		{
			String addedPayee=payee_Table.getAttribute("label");
			mobileAction.verifyTextEquality(addedPayee, accountNoXL);
		}
		
	}catch (NoSuchElementException | InterruptedException | IOException e) {
	
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

	
}
	
	/**
	 * This method will verify the error message when invalid amount is entered
	 * 
	 * 
	 * 
	 */
	
	public void ConfirmPayee_InvalidAmount() throws Exception {

		try {
			Decorator();
			
			mobileAction.verifyElementIsDisplayed(confirm_Header, "Confirm");
			mobileAction.FuncClick(pay_Bill, "Pay Bill");
			mobileAction.waitForElementToVanish(progressBar);
			String err = mobileAction.getValue(errorMsg);
			mobileAction.verifyElementIsDisplayed(errorMsg, err);
				
			
		} catch (NoSuchElementException | InterruptedException | IOException e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	
}
