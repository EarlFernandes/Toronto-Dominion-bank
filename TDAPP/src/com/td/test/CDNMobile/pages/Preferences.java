package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Preferences extends _CommonPage {

	private static Preferences Preferences;

	String preferences = "Profile & Settings";

	@iOSFindBy(xpath = "//*[@label='Profile & Settings']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Preferences']")
	private MobileElement preferences_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='What's New, Learn about new app features']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='What's New']")
	private MobileElement what_New_Btn;

	@iOSFindBy(xpath = "//*[@label='Security Questions']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_security']/android.widget.TextView")
	private MobileElement secret_Question_Button;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_security']/android.widget.TextView")
	private MobileElement first_secret_Question;

	public synchronized static Preferences get() {
		if (Preferences == null) {
			Preferences = new Preferences();
		}
		return Preferences;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void prefernces_What_New_btn() {
		Decorator();
		try {

			mobileAction.FuncClick(what_New_Btn, "What_New_Button");
		} catch (Exception e) {

		}
	}

	/**
	 * This method will verify the preferences header and click on the update
	 * security question button.
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
	public void prefernces_Update_Security_Question() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(preferences_Header, preferences);
			mobileAction.FuncClick(secret_Question_Button, "Secret_Question_button");
			mobileAction.FuncClick(first_secret_Question, "First Secret Question");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
