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

public class ManageSettings extends _CommonPage {
	
	private static ManageSettings ManageSettings;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/enable_passcode_switch' and @text='OFF']")
	private MobileElement enablepasscode;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/setup_passcode' and @text='Set Up Passcode']")
	private MobileElement setuppasscode;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/setup_passcode_input1']")
	private MobileElement sendppasscode;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/setup_passcode' and @text='Change Passcode']")
	private MobileElement changePasscode;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Enter New Passcode']")
	private MobileElement newPasscode;
	

	

	String passcode = getTestdata("Passcode");
	
	
	public synchronized static  ManageSettings get() {
		if ( ManageSettings == null) {
			ManageSettings = new  ManageSettings();
		}
		return ManageSettings;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

/**
 * This method will click the enable passcode
 * @throws NoSuchElementException
 *             In case the element is not found over the screen
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
public void click_enablepasscode() {


	Decorator();
	try {
		mobileAction.FuncClick(enablepasscode, "Enable Passcode");
		mobileAction.FuncClick(setuppasscode, "Click Setup Passcode");
		mobileAction.FuncSendKeys(sendppasscode, passcode);
		
		} catch (NoSuchElementException|InterruptedException |IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}

/**
 * This method will change  the existing passcode
 * @throws NoSuchElementException
 *             In case the element is not found over the screen
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
public void changePasscode() {


	Decorator();
	try {
		mobileAction.FuncClick(changePasscode, "Change Passcode");
		mobileAction.FuncSendKeys(passcode);
		mobileAction.verifyElementIsDisplayed(newPasscode, "New Passcode");
		
		
		} catch (NoSuchElementException|InterruptedException |IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}
}


