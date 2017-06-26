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

public class Popupwindow extends _CommonPage {

	private static Popupwindow popup;

	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private MobileElement cancel_button;	

	@iOSFindBy(xpath = "//*[@label='Yes, go back' or @label='Oui' or @name='alert_ok_button']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement goback_button;

	@iOSFindBy(xpath = "//*[@name='alert_ok_button']/../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeTextView")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement popup_message;
	
	@iOSFindBy(xpath = "//*[@label='Allow' or @label='Oui']")
	//@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement allow_send_notification;

	public synchronized static Popupwindow get() {
		if (popup == null) {
			popup = new Popupwindow();
		}
		return popup;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}


	public void VerifyPopUpWithCancelButton(){
		
		Decorator();
		try{
			mobileAction.verifyElementIsDisplayed(cancel_button, "Cancel");

		}catch (NoSuchElementException | IOException e) {
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;			
	    }  
	}
	
	public void ClickPopupGoBackButton(){
		Decorator();
		try{
			mobileAction.FuncClick(goback_button, "Yes, Go Back");
		}catch (Exception e){
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;	
	        return;	
		}
	}
	
	public void VerifyCancelPopUpMessage(){
		Decorator();
		try{
//			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
//				popup_message = mobileAction.verifyElementUsingXPath("//XCUIElementTypeTextView[@label='" + mobileAction.getAppString(" str_cancel_order_button") + "']", "Cancel order prompt");
//			}
			String expectedMsg= "Are you sure you want to cancel this order? | Êtes-vous certain de vouloir annuler cet ordre? |您确定要取消该订单？ | 確定要取消此訂單？";
			mobileAction.verifyElementTextIsDisplayed(popup_message, expectedMsg);
		}catch (Exception e){
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;	
	        return;	
		}		
	}
	
	
	
}
