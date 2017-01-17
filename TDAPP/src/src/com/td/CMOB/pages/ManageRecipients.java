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

public class ManageRecipients extends _CommonPage{
	
	private static ManageRecipients ManageRecipients;
	
	
	@iOSFindBy(xpath ="//*[@label='Manage Recipients']")
	@AndroidFindBy(xpath = " ")
	private MobileElement manageRecipientHeader;
	
	@iOSFindBy(xpath ="//*[@label='Register']")
	@AndroidFindBy(xpath = " ")
	private MobileElement registerBtn;
	
	@iOSFindBy(xpath="//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	
	
	public synchronized static ManageRecipients get() {
		if (ManageRecipients == null) {
			ManageRecipients = new ManageRecipients();
		}
		return ManageRecipients;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}
	
	
	
	/**
	 * This method will Verify the Register Button in the Manage Recipient page
	 * 
	 * 
	 * @return void
	 * @throws IOException 
	 * 
	 */
	public void verify_RegisterButton() throws IOException {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(manageRecipientHeader, "Manage Recipients");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(registerBtn,"Register");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	


	
}
