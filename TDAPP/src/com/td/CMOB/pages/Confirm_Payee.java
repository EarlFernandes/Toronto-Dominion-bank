package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Confirm_Payee extends _CommonPage{

	
	private static Confirm_Payee Confirm_Payee;
	
	@iOSFindBy(xpath="//*[@label='Confirm']")
	private MobileElement confirm_header;
	
	
	
	@iOSFindBy(xpath="//*[@label='Payee Name']")
	private MobileElement payee_Name;
	
	
	@iOSFindBy(xpath="//*[@label='Access Card']")
	private MobileElement access_card;

	@iOSFindBy(xpath="//*[@label='Add Payee']")
	private MobileElement addPayee_button;
	
	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	
	@iOSFindBy(xpath = "//*[@label='PAY THIS PAYEE']")
	@AndroidFindBy(xpath = "")
	private MobileElement payThisPayee;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Thank You!')]")
	@AndroidFindBy(xpath = "")
	private MobileElement successMsg;
	
	
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
	//	mobileAction.verifyElementIsDisplayed(confirm_header, "Confirm");
	//	mobileAction.verifyElementIsDisplayed(payee_Name, "Payee Name");
	//	mobileAction.verifyElementIsDisplayed(access_card, "Access Card");	
		mobileAction.FuncClick(addPayee_button, "AddPayee");
		mobileAction.waitForElementToVanish(progressBar);
		mobileAction.verifyElementIsDisplayed(successMsg, "Thank You!");
		mobileAction.FuncClick(payThisPayee, "Pay This Payee");
		
		
	}catch (NoSuchElementException | InterruptedException | IOException e) {
	
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

	
}
}
