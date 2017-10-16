package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSHHomeScreenSettings extends _CommonPage {
	private static MIT_DSHHomeScreenSettings MIT_DSHHomeScreenSettings;

	public synchronized static MIT_DSHHomeScreenSettings get() {
		if (MIT_DSHHomeScreenSettings == null) {
			MIT_DSHHomeScreenSettings = new MIT_DSHHomeScreenSettings();
		}
		return MIT_DSHHomeScreenSettings;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSFindBy(xpath = "//*[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Profil et paramètres' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement flyoutProfileSettings;

	@iOSFindBy(xpath = "//*[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Profil et paramètres' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement lblProfileSettings;

	@iOSFindBy(xpath = "//*[@label='Home Screen Settings' or @label='Paramètres de l’écran d’accueil' or @label='主屏幕设置' or @label='主屏幕設置']")
	@AndroidFindBy(xpath = "//*[@text='Home Screen Settings' or @text='Paramètres de l’écran d’accueil' or @text='主屏幕设置' or @text='主屏幕設置']")
	private MobileElement LBL_HomeScreenSettings;

	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/hamburger")
	private MobileElement BT_Home_HamburgerMenu;

	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/settings_header_icon")
	private MobileElement ICON_Home;

	@iOSXCUITFindBy(accessibility = "PROFILE_HEADER_DES")
	@AndroidFindBy(id = "com.td:id/settings_header_description")
	private MobileElement LBL_HomeSettingsHeaderDescription;

	@iOSXCUITFindBy(accessibility = "ProfilePreferencesToggleTableViewCell_Title_Label")
	@AndroidFindBy(id = "com.td:id/nav_row_title")
	private MobileElement LBL_EnableInvestingView;

	@iOSXCUITFindBy(accessibility = "ProfilePreferencesToggleTableViewCell_Description_Label")
	@AndroidFindBy(id = "com.td:id/nav_row_desc")
	private MobileElement LBL_EnableInvestingViewDescription;

	@iOSXCUITFindBy(accessibility = "ProfilePreferencesToggleTableViewCell_Toggle_Switch")
	@AndroidFindBy(id = "com.td:id/nav_row_switch")
	private MobileElement BT_EnableInvestingViewSwitch;

	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/nav_row_left_icon")
	private MobileElement ICON_MarketRise;

	@iOSXCUITFindBy(accessibility = "ProfilePreferencesSubtitleTableViewCell_Title_Label")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/nav_row_left_icon']/following-sibling::*/*[@resource-id='com.td:id/nav_row_title']")
	private MobileElement LBL_InvestingViewIsNowOn;

	@iOSXCUITFindBy(accessibility = "ProfilePreferencesSubtitleTableViewCell_Subtitle_Label")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/nav_row_left_icon']/following-sibling::*/*[@resource-id='com.td:id/nav_row_description']")
	private MobileElement LBL_GoHome;

	@iOSXCUITFindBy(accessibility = "ProfilePreferencesSubtitleTableViewCell_Accessory_Button")
	@AndroidFindBy(id = "com.td:id/nav_row_right_icon")
	private MobileElement ICON_Chevron;

	public void verifyHomeScreenSettingsUI() {
		Decorator();
		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "Home HamburgerMenu");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutProfileSettings, true, 5, "up");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(lblProfileSettings, "Profile & Settings");
			}
			/*
			 * } else { if (mobileAction.isObjExists(lblProfileSettings)) {
			 * CL.GetReporting().FuncReport(PASS,
			 * "Profile & Settings is displayed."); } else
			 * CL.GetReporting().FuncReport(FAIL,
			 * "Profile & Settings is not displayed."); }
			 */

			mobileAction.FuncVerifyTextEquals(LBL_HomeScreenSettings,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_HOMESCREENSETTINGS));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyHomeScreenSettingsInvestingUser() {
		Decorator();
		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "Home HamburgerMenu");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutProfileSettings, true, 5, "up");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(lblProfileSettings, "Profile & Settings");
			}
			if (!mobileAction.isObjExists(LBL_HomeScreenSettings)) {
				CL.GetReporting().FuncReport(PASS,
						"As expected 'Home Screen Settings' is not displayed for Investing User.");
			} else {
				CL.GetReporting().FuncReport(FAIL, "'Home Screen Settings' should not display for Investing User.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyHomeScreenSettingsPageUI() {
		Decorator();
		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "Home HamburgerMenu");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutProfileSettings, true, 5, "up");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(lblProfileSettings, "Profile & Settings");
			}
			mobileAction.FuncClick(LBL_HomeScreenSettings, "Home Screen Settings");
			mobileAction.FuncVerifyTextEquals(LBL_HomeScreenSettings,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_HOMESCREENSETTINGS));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				mobileAction.verifyElementIsDisplayed(ICON_Home, "Home Icon");

			mobileAction.FuncVerifyTextEquals(LBL_HomeSettingsHeaderDescription,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_HOMESCREENSETTINGSHEADERDESCRIPTION));

			mobileAction.FuncVerifyTextEquals(LBL_EnableInvestingView,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ENABLEINVESTINGVIEW));

			mobileAction.FuncVerifyTextEquals(LBL_EnableInvestingViewDescription,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ENABLEINVESTINGVIEWDESCRIPTION));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (!BT_EnableInvestingViewSwitch.isSelected()) {
					CL.GetReporting().FuncReport(PASS, "Enable Investing View is bydefault OFF.");
				} else {
					CL.GetReporting().FuncReport(FAIL, "Enable Investing View is bydefault should be OFF.");
				}
			} else {
				if (!mobileAction.isObjExists(LBL_InvestingViewIsNowOn)) {
					CL.GetReporting().FuncReport(PASS, "Enable Investing View is bydefault OFF.");
				} else {
					CL.GetReporting().FuncReport(FAIL, "Enable Investing View is bydefault should be OFF.");
				}

			}

			mobileAction.FuncClick(BT_EnableInvestingViewSwitch, "BT_EnableInvestingViewSwitch");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				mobileAction.verifyElementIsDisplayed(ICON_MarketRise, "MarketRise Icon");

			mobileAction.FuncVerifyTextEquals(LBL_InvestingViewIsNowOn,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_INVESTINGVIEWISON));

			mobileAction.FuncVerifyTextEquals(LBL_GoHome, getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_GOHOME));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (!mobileAction.isObjExists(ICON_Chevron)) {
					CL.GetReporting().FuncReport(PASS, "Chevron Icon should not display.");
				} else {
					CL.GetReporting().FuncReport(FAIL, "Chevron Icon should not be displayed.");
				}
			} else {
				mobileAction.verifyElementIsDisplayed(ICON_Chevron, "> Icon");
			}

			mobileAction.FuncClick(BT_EnableInvestingViewSwitch, "BT_EnableInvestingViewSwitch");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
