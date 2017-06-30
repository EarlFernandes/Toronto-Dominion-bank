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

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Contact Us' or @label='Contactez-nous']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (@text='Contact Us' or @text='Contactez-nous')]")
	private MobileElement contactUs;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'TD Direct Investing')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvTDWealthDINumberLabel' and @text='TD Direct Investing']")
	private MobileElement tdDirectInvesting;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'TD Direct Investing')]/../XCUIElementTypeButton")
	//@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/ivTDWealthDINumberPhone']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/rlTDMainNumber']")  //changed by rashmi
	private MobileElement call_Button;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Call' or @label='Continue Call']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/continue_call_button']")
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
	 *             
	 *  @throws Exception
	 *  		If there is problem while finding that element.
	 */

	public void verifyTDInvesting_Contact()  {
		Decorator();
		try {
		if(mobileAction.verifyElementIsPresent(contactUs)){
			
			mobileAction.verifyElementIsDisplayed(call_Button, t_call);
			mobileAction.FuncClick(call_Button, "Call Button");
			mobileAction.FuncClick(callNow, "Call");
		}
		}catch (NoSuchElementException e) {
            CL.getGlobalVarriablesInstance().bStopNextFunction = false;
            System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
     } catch (InterruptedException e) {
            CL.getGlobalVarriablesInstance().bStopNextFunction = false;
            System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
     } catch (IOException e) {
            CL.getGlobalVarriablesInstance().bStopNextFunction = false;
            System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
     } catch (Exception e) {
            CL.getGlobalVarriablesInstance().bStopNextFunction = false;
            System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
     }
	}
	
	public void VerifyContactUsPageHeader(){
		Decorator();
		try{
			mobileAction.verifyElementTextIsDisplayed(contactUs, "Contact Us | Contactez-nous");
		}catch( Exception e){
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}

