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

public class QuickAccess  extends _CommonPage {

	private static QuickAccess Quickaccess;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeOther")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement quickaccess_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progrees_bar;

	@iOSFindBy(accessibility = "QUICKBALANCE_ONBOARDING_VIEW_TITLE")
	private MobileElement title;
	
	@iOSFindBy(accessibility = "QUICKBALANCE_ONBOARDING_DES")
	private MobileElement msg;
	
	@iOSFindBy(accessibility = "QUICKBALANCE_ONBOARDING_START_BUTTON")
	private MobileElement getStartedButton;
	
	public synchronized static QuickAccess get() {
		if (Quickaccess == null) {
			Quickaccess = new QuickAccess();
		}
		return Quickaccess;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	public void VerifyQuickAccessSettingsHeader() {
		Decorator();
		try {

			mobileAction.verifyHeaderIsDisplayed(quickaccess_title, "Quick Access");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the FTE quick access page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyFTEQuickAccessText() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(quickaccess_title.getText(), mobileAction.getAppString("easy_access_tc_title"));
				mobileAction.verifyTextEquality(title.getText().trim(), mobileAction.getAppString("easy_access_enroll_text1").trim());
				// FIXME: What is the correct string message here?
				//mobileAction.verifyTextEquality(msg.getText(), mobileAction.getAppString("watch_toggle_footer"));
				mobileAction.verifyTextEquality(getStartedButton.getText(), mobileAction.getAppString("btn_get_started"));
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("easy_access_enroll_title") + "']", "Welcome to quick access title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("easy_access_enroll_text1") + "']", "Account balances on the go");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text=\"" + mobileAction.getAppString("easy_access_enroll_text2").replace("\"", "") + "\"]", "Tap the quick access message");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@resource-id='com.td:id/btn_easy_access_enroll' and @text='" + mobileAction.getAppString("easy_access_success_start") + "']", "Get Started");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the activate quick access page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyActivateQuickAccessText() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("easy_access") + "']", "Easy Access title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("easy_access_visit_text1") + "']", "Please visit message");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("easy_access_settings") + "']", "Quick Access Settings");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
