package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class QuickAccessPage extends _CommonPage {

	private static QuickAccessPage QuickAccessPage;

	@iOSFindBy(xpath = "//*[@label='Quick Access']")
	@AndroidFindBy(xpath = "//android.widget.TextView[ends-with(@text,'Quick Access']")
	private MobileElement Access_header;

	@iOSFindBy(xpath= "//*[@label='Get Started']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_easy_access_enroll' and @text='Get Started']")
	private MobileElement get_started;

	public synchronized static QuickAccessPage get() {
		if (QuickAccessPage == null) {
			QuickAccessPage = new QuickAccessPage();
		}
		return QuickAccessPage;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	
	}

	/**
	 * This method will verify the Quick Access Page and Get Started Element on
	 * the page
	 * 
	 * @return void
	 * 
	 */
	public void quickAccess() {
		Decorator();

		String t_getStarted="Get Started";
		
		try {
			boolean flag=Access_header.isDisplayed();
			if(flag){
			mobileAction.verifyElementIsDisplayed(get_started,t_getStarted);
			mobileAction.quitDriver();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
