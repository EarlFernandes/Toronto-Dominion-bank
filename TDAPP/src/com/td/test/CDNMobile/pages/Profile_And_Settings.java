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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Profile_And_Settings extends _CommonPage {

	private static Profile_And_Settings ProfileAndSettings;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='In progress' OR label=='en cours'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement profile_preferences_Header;

	private MobileElement view_profile;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_security']/android.widget.TextView")
	private MobileElement security_questions;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_notifications']/android.widget.TextView")
	private MobileElement notifications;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_quick_access']/android.widget.TextView")
	private MobileElement quickaccesssetting;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_tdforme']/android.widget.TextView")
	private MobileElement tdformesettings;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_whatsnew']/android.widget.TextView")
	private MobileElement whatsnew;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Payments & Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Payments & Transfers' or @text='Paiements et virements']")
	private MobileElement paymentsAndTransfers;

	public synchronized static Profile_And_Settings get() {
		if (ProfileAndSettings == null) {
			ProfileAndSettings = new Profile_And_Settings();
		}
		return ProfileAndSettings;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will verify click personal profile Details button then go to
	 * personal profile details page
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
	public void view_profile() {

		Decorator();
		try {
			String view_profile_xpath;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				view_profile_xpath = "//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_VIEW_PROFILE_LINK_IOS)
						+ "']";
			} else {
				view_profile_xpath = "//android.widget.TextView[@text='"
						+ getTextInCurrentLocale(StringArray.ARRAY_VIEW_PROFILE_LINK_AND) + "']";
			}
			view_profile = mobileAction.verifyElementUsingXPath(view_profile_xpath, "View Profile");
			mobileAction.FuncClick(view_profile, "view profile");
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyProfileandSettingLandingPage() {

		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(profile_preferences_Header,
					getTextInCurrentLocale(StringArray.ARRAY_PROFILE_AND_PREFERENCE));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifySecurityQuestionButton() {

		Decorator();
		try {
			String security = getTextInCurrentLocale(StringArray.ARRAY_PREFERENCE_SECURITY_QUESTION);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				security_questions = mobileAction.verifyElementUsingXPath("//*[@label='" + security + "']",
						"Secuirty Question");
			}

			mobileAction.FuncClick(security_questions, security);
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyNotificationsButton() {

		Decorator();
		try {
			String notifi = getTextInCurrentLocale(StringArray.ARRAY_PREFERENCE_NOTIFICATIONS);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				notifications = mobileAction.verifyElementUsingXPath("//*[@label='" + notifi + "']", "Notifications");
			}
			mobileAction.FuncClick(notifications, notifi);
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyQuickAccessSettings() {

		Decorator();
		try {
			String quickSetting = getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				quickaccesssetting = mobileAction.verifyElementUsingXPath("//*[@label='" + quickSetting + "']",
						"Quick Access Settings");
			}
			mobileAction.FuncClick(quickaccesssetting, quickSetting);
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyTDForMeSettings() {

		Decorator();
		try {

			String tdme = getTextInCurrentLocale(StringArray.ARRAY_PREFERENCE_TD_FOR_ME_SETTINGS);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				tdformesettings = mobileAction.verifyElementUsingXPath("//*[@label='" + tdme + "']",
						"TD For Me Settings");
			}
			mobileAction.FuncClick(tdformesettings, tdme);
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyWhatsNew() {

		Decorator();
		try {
			String whatnew = getTextInCurrentLocale(StringArray.ARRAY_PREFERENCE_WAHTS_NEW);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				String whatnewXpath = "//*[@label=\"" + whatnew + "\"]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(whatnewXpath, true, 5, "up");
			} else {
				mobileAction.FuncSwipeWhileElementNotFound(whatsnew, true, 5, "up");
			}

			// if (!mobileAction.isObjExists(whatsnew)) {
			// if
			// (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS"))
			// {
			// mobileAction.SwipeWithinElement("//XCUIElementTypeTable", 2,
			// "down");
			// } else {
			// mobileAction.SwipeWithinElement("//android.support.v4.widget.DrawerLayout",
			// 2, "down");
			// }
			//
			// }
			//
			// String whatnew = mobileAction.getValue(whatsnew);
			// mobileAction.FuncClick(whatsnew, whatnew);
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify Profile and Settings page header
	 *         and click on 'Payments & Transfers' link.
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
	public void clickPaymentsAndTransfers() {

		Decorator();
		try {
			String payment_transfer_xpath;
			String paymentTransferText = getTextInCurrentLocale(StringArray.ARRAY_PAYMENT_AND_TRANSFER);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				payment_transfer_xpath = "//*[@label='" + paymentTransferText + "']";
			} else {
				payment_transfer_xpath = "//*[@text='" + paymentTransferText + "']";
			}
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(payment_transfer_xpath, true, 5, "up");
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
