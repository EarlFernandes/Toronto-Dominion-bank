package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Legal extends _CommonPage{
private static Legal Legal;
	
	@iOSFindBy(xpath ="//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Legal']")
	private MobileElement legal_header;
	
	@iOSFindBy(xpath ="//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_button;
	
	
	@iOSFindBy(xpath ="//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvPrivacy' and @text='Mobile Privacy']")
	private MobileElement mobile_privacy;
	
	@iOSFindBy(xpath ="//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvSecurity' and @text='Privacy & Security']")
	private MobileElement privacy_security;
	
	@iOSFindBy(xpath ="//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvLegal' and @text='Legal']")
	private MobileElement legal;
	
	@iOSFindBy(xpath ="//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Legal']")
	private MobileElement legal_page_header;

	
	@iOSFindBy(xpath ="//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms of Use']")
	private MobileElement termsofuse;
	
	@iOSFindBy(xpath ="//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Terms of Use']")
	private MobileElement termsofuse_header;
	
	public synchronized static Legal get() {
		if (Legal == null) {
			Legal = new Legal();
		}
		return Legal;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		
	}
	/**
	 * This method will click on the Trade button on Investing page
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
	public void verifylegalpage() {

		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(legal_header, "Verifying Legal Header");
			
			mobileAction.FuncClick(legal, "Click Legal");
			mobileAction.verifyElementIsDisplayed(legal_page_header, "Verifying Legal Page Header");
			mobileAction.FuncClick(back_button, "Back");

			mobileAction.FuncClick(termsofuse, "Click Terms Of Use");
			mobileAction.verifyElementIsDisplayed(termsofuse_header, "Verifying Terms Of Use");
			mobileAction.FuncClick(back_button, "Back");
			
			mobileAction.verifyElementIsDisplayed(mobile_privacy, "Click Mobile Privacy");
			
			mobileAction.verifyElementIsDisplayed(privacy_security, "Click Privacy And Security");
			
			} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
