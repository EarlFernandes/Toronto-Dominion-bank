package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Notifications extends _CommonPage {

	private static Notifications Notifications;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement notification_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;

	// @iOSFindBy(xpath = "//*[@label='Customize Notifications' or
	// @label='Personnaliser les avis']")
	// @AndroidFindBy(xpath = "//android.widget.TextView[@text='Customize
	// Notifications' or @text='Personnaliser les avis']")
	// private MobileElement customize_notification_link;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement TDforme_notification_Header;

//	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Enable Notifications' or @label='Activer les notifications']/../XCUIElementTypeSwitch")
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
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void VerifyNotificationsPageHeader() {
		Decorator();
		try {

			String titleText = getTextInCurrentLocale(StringArray.ARRAY_PREFERENCE_NOTIFICATIONS);
			mobileAction.verifyElementTextIsDisplayed(notification_title, titleText);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void ClickCustomizeNotificationsLink() {
		Decorator();
		try {

			String elementText = getTextInCurrentLocale(StringArray.ARRAY_CUSTOMIZE_NOTIFICATIONS);
			String notification_link_xpath;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				notification_link_xpath = "//*[@label='" + elementText + "']";
			} else {
				notification_link_xpath = "//android.widget.TextView[@text='" + elementText + "']";
			}

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(notification_link_xpath, true, 5, "up");
			mobileAction.waitForElementToVanish(progress_bar);

		} catch (Exception e) {
			System.err.println("TestCase has failed to click customize_notification_link.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyTdforMeNotificationsHeader() {

		Decorator();
		try {
			String titleText;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				titleText = getTextInCurrentLocale(StringArray.ARRAY_PREFERENCE_TD_FOR_ME_SETTINGS);
			}else{
				titleText = getTextInCurrentLocale(StringArray.ARRAY_TD_FOR_ME_NOTIFICATIONS);
			}			
			mobileAction.verifyElementTextIsDisplayed(TDforme_notification_Header, titleText);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed to VerififyTdforMeNotificationsHeader.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyEnableNotificationsSwitchFunction() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				enable_notification_switch = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_ENABLE_NOTIFICATIONS)
						+ "']/../XCUIElementTypeSwitch", "Enable Notifications Switch");
			}
			mobileAction.verifyElementIsDisplayed(enable_notification_switch, "Notifications Enable-Disable Switch");
			// Check the switch status

			String switchCheckStatus = mobileAction.getSwitchStatus(enable_notification_switch);
			System.out.println("isEnabled status :" + switchCheckStatus);

			if (switchCheckStatus.equalsIgnoreCase("false")) {
				// Enable it
				System.out.println("Toggle to enable it");
				mobileAction.FuncClick(enable_notification_switch, "Toggle Switch");
				switchCheckStatus = mobileAction.getSwitchStatus(enable_notification_switch);
				if (switchCheckStatus.equalsIgnoreCase("true")) {
					mobileAction.Report_Pass_Verified("Toggle to enable the switch");
				} else {
					mobileAction.Report_Fail("Failed to toggle the switch");
				}
			} else {// Enabled
					// Toggle the switch to disable it
				System.out.println("Toggle to disable it");
				mobileAction.FuncClick(enable_notification_switch, "Toggle Switch");
				switchCheckStatus = mobileAction.getSwitchStatus(enable_notification_switch);
				if (switchCheckStatus.equalsIgnoreCase("false")) {
					mobileAction.Report_Pass_Verified("Toggle to disable the switch");
				} else {
					mobileAction.Report_Fail("Failed to toggle the switch");
				}
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed to VerifyEnableNotificationsSwitchFunction.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
