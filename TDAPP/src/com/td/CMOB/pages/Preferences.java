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

public class Preferences extends _CommonPage {

	private static Preferences Preferences;

	String preferences = "Preferences";
	
	@iOSFindBy(xpath = "//*[@label='Preferences']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Preferences']")
	private MobileElement preferences_Header;

	@iOSFindBy(xpath = "//*[@label='What's New, Learn about new app features']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='What's New']")
	private MobileElement what_New_Btn;
	
	
	//@iOSFindBy(xpath = "//*[contains(@label,'Update Security Questions']")

	@iOSFindBy(xpath = "//*[@label='Keep your info safe']")
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Update Security Questions']")
	private MobileElement secret_Question_button;

	public synchronized static Preferences get() {
		if (Preferences == null) {
			Preferences = new Preferences();
		}
		return Preferences;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");

	}

	public void prefernces_What_New_btn() {

		System.out.println("Trial for Page factory class");
		Decorator();
		try {

			System.out.println("Preferences Header is Verified:" + preferences_Header.isDisplayed());
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
			System.out.println(preferences_Header.isDisplayed());
			System.out.println(CL.GetDriver().getPageSource());
			//mobileAction.verifyElementIsDisplayed(preferences_Header, preferences);
			mobileAction.FuncClick(secret_Question_button, "Secret_Question_button");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
