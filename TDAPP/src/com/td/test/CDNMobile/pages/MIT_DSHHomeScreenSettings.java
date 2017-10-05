package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

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

	public void verifyHomeScreenSettingsUI() {
		Decorator();
		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "Home HamburgerMenu");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutProfileSettings, true, 5, "up");
			mobileAction.verifyElementIsDisplayed(lblProfileSettings, "Profile & Settings");
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
			mobileAction.verifyElementIsDisplayed(lblProfileSettings, "Profile & Settings");
			if (!mobileAction.isObjExists(LBL_HomeScreenSettings)) {
				CL.GetReporting().FuncReport(PASS,
						"As expected 'Home Screen Settings' is not displayed for Investing User.");
			} else {
				CL.GetReporting().FuncReport(PASS, "'Home Screen Settings' should not display for Investing User.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
