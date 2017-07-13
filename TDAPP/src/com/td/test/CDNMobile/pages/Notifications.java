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

public class Notifications extends _CommonPage {

	private static Notifications Notifications;

	@iOSFindBy(xpath = "//*[@label='Notifications' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement notification_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;
	
	@iOSFindBy(xpath = "//*[@label='Customize Notifications' or @label='Personnaliser les avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Customize Notifications' or @text='Personnaliser les avis']")
	private MobileElement customize_notification_link;	
	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement TDforme_notification_Header;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Enable Notifications' or @label='Activer les notifications']/../XCUIElementTypeSwitch")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/nav_row_switch']")
	private MobileElement enable_notification_switch;

	public synchronized static Notifications get() {
		if (Notifications == null) {
			Notifications = new Notifications();
		}
		return Notifications;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	public void VerifyNotificationsPageHeader() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(notification_title, "Notifications | Avis");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void ClickCustomizeNotificationsLink() {
		Decorator();
		try {

			String elementText = mobileAction.getValue(customize_notification_link);
			mobileAction.FuncClick(customize_notification_link, elementText);
			mobileAction.waitForElementToVanish(progress_bar);

		} catch (Exception e) {
			System.err.println("TestCase has failed to click customize_notification_link.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void VerifyTdforMeNotificationsHeader() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(TDforme_notification_Header, "TD for Me Notifications | Avis TD et moi |TD for Me | TD et moi");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed to VerififyTdforMeNotificationsHeader.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void VerifyEnableNotificationsSwitchFunction() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(enable_notification_switch, "Notifications Enable-Disable Switch");
			//Check the switch status
			
			String switchCheckStatus = mobileAction.getSwitchStatus(enable_notification_switch); 
			System.out.println("isEnabled status :" + switchCheckStatus);

			if(switchCheckStatus.equalsIgnoreCase("false")){
				// Enable it
				System.out.println("Toggle to enable it");
				mobileAction.FuncClick(enable_notification_switch, "Toggle Switch");
				switchCheckStatus = mobileAction.getSwitchStatus(enable_notification_switch);
				if(switchCheckStatus.equalsIgnoreCase("true")){
					mobileAction.Report_Pass_Verified("Toggle to enable the switch");
				}else{
					mobileAction.Report_Fail("Failed to toggle the switch");
				}
			}else{//Enabled
				//Toggle the switch to disable it
				System.out.println("Toggle to disable it");
				mobileAction.FuncClick(enable_notification_switch, "Toggle Switch");
				switchCheckStatus = mobileAction.getSwitchStatus(enable_notification_switch);
				if(switchCheckStatus.equalsIgnoreCase("false")){
					mobileAction.Report_Pass_Verified("Toggle to disable the switch");
				}else{
					mobileAction.Report_Fail("Failed to toggle the switch");
				}
			}


		} catch (Exception e) {
			System.err.println("TestCase has failed to VerifyEnableNotificationsSwitchFunction.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
	
}
