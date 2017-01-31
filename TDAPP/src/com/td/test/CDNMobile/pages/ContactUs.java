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

	@iOSFindBy(xpath = "//*[@label='Contact Us']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Contact Us']")
	private MobileElement contactUs;

	@iOSFindBy(xpath = "//*[contains(@label,'TD Direct Investing')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvTDWealthDINumberLabel' and @text='TD Direct Investing']")
	private MobileElement tdDirectInvesting;
	
	@iOSFindBy(xpath = "//*[@label='Call']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntBalanceSum']")
	private MobileElement call_button;
	
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

	public void verifyTDInvesting_Contact()  {
		Decorator();
		try {
		if(contactUs.isDisplayed()==true){
			mobileAction.FuncClick(tdDirectInvesting, "tdDirectInvesting");
			
			mobileAction.verifyElementIsDisplayed(call_button, t_call);
			mobileAction.FuncClick(call_button, "Call");
		}
		}catch (NoSuchElementException | IOException |InterruptedException e) {
			e.printStackTrace();
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
		}
}
