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

public class ContactUs extends _CommonPage {

	private static ContactUs ContactUs;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Contact Us']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Contact Us']")
	private MobileElement contactUs;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'TD Direct Investing')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvTDWealthDINumberLabel' and @text='TD Direct Investing']")
	private MobileElement tdDirectInvesting;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Call']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/ivTDWealthDINumberPhone']")
	private MobileElement call_Button;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Call']")
	private MobileElement callNow;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='OK']")
	private MobileElement ok;

	
	String t_call="Call";

	public synchronized static ContactUs get() {
		if (ContactUs == null) {
			ContactUs = new ContactUs();
		}
		return ContactUs;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		
	}
	/**
	 * This method will click on add payee button
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

	public void verifyTDInvesting_Contact()  {
		Decorator();
		try {
		if(contactUs.isDisplayed()==true){
			
			mobileAction.verifyElementIsDisplayed(call_Button, t_call);
			mobileAction.FuncClick(call_Button, "Call Button");
			mobileAction.FuncClick(callNow, "Call");
			mobileAction.FuncClick(ok, "Ok");
		}
		}catch (NoSuchElementException | IOException |InterruptedException e) {
			e.printStackTrace();
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
		}
}

