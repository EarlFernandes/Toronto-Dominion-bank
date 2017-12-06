package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSH_QuickAccess extends _CommonPage {

	private static MIT_DSH_QuickAccess MIT_DSH_QuickAccess;

	public synchronized static MIT_DSH_QuickAccess get() {
		if (MIT_DSH_QuickAccess == null) {
			MIT_DSH_QuickAccess = new MIT_DSH_QuickAccess();
		}
		return MIT_DSH_QuickAccess;

	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSXCUITFindBy(xpath = "//*[@name='QuickLinkLeftNavButton' or @name='NAVIGATION_ITEM_MENU']")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;

	@iOSXCUITFindBy(xpath = "//*[@label='Investing Accounts' or @label='Comptes Placements directs TD' or @label='投资账户' or @label='投資賬戶' or @label='Trade' or contains(@label,'Négociation') or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[(@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶' or @label='Trade' or contains(@label,'Négociation') or @label='交易' or @label='交易') and @resource-id='com.td:id/textview_flyout_menu_item']")
	MobileElement InvestingAccount;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSXCUITFindBy(xpath = "//*[@label='Home' or @label='Accueil' or @label='主页' or @label='首頁']")
	@AndroidFindBy(xpath = "//*[@text='Home' or @text='Accueil' or @text='主页' or @text='首頁']")
	private MobileElement flyoutHomeLink;

	@iOSXCUITFindBy(accessibility = "QuickLinkRightNavButton")
	@AndroidFindBy(id = "com.td:id/easy_access_button")
	MobileElement BT_Home_QuickAccess;

	@iOSXCUITFindBy(accessibility = "QUICKACCESS_ACTIVATE_TITLE")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement lblQuickAccessTitle;

	@iOSXCUITFindBy(xpath = "//*[@label='Quick Access close' or @label='Accueil' or @label='主页' or @label='首頁']")
	@AndroidFindBy(xpath = "//*[@text='Home' or @text='Accueil' or @text='主页' or @text='首頁']")
	private MobileElement btnQuickAccessClose;

	@iOSXCUITFindBy(accessibility = "QUICKACCESS_ACTIVATE_BUTTON_SETTING")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BtnQuickAccessSettings;

	private MobileElement quickaccess_switch;

	private MobileElement quickaccess_AccountToggleSwitch;

	@iOSXCUITFindBy(xpath = "//*[@label='ACCOUNTS' or @label='COMPTES' or @label='账户' or @label='賬戶']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title_text']")
	private MobileElement indiviual_accounts;

	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement QuickAccessTitle;

	@iOSXCUITFindBy(xpath = "//*[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Profil et paramètres' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement flyoutProfileSettings;

	@iOSXCUITFindBy(xpath = "//*[@label='Investing Accounts' or @label='Comptes Placements directs TD' or @label='投资账户' or @label='投資賬戶' or @label='Trade' or contains(@label,'Négociation') or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[(@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶' or @label='Trade' or contains(@label,'Négociation') or @label='交易' or @label='交易') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutInvestingAccountsLink;

	@iOSXCUITFindBy(xpath = "//*[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Profil et paramètres' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement lblProfileSettings;

	@iOSXCUITFindBy(xpath = "//*[@label='Quick Access Settings' or @label='Paramètres Accès rapide' or @label='特快结余查询' or @label='特快結餘查詢設定']")
	@AndroidFindBy(xpath = "//*[@text='Quick Access Settings' or @text='Paramètres Accès rapide' or @text='特快结余查询' or @text='特快結餘查詢設定']")
	private MobileElement QuickAccessSettingsNav;

	@iOSXCUITFindBy(xpath = "(//*[contains(@label,'US MARGIN') or contains(@label,'CDN MARGIN') or contains(@label,'CDN MARGIN SHORT') or contains(@label,'US MARGIN SHORT') or contains(@label,'CANADIAN MARGIN') or contains(@label,'MARGE EN $CDN') or contains(@label,'MARGE EN $US')])[1]")
	@AndroidFindBy(xpath = "(//*[contains(@text,'US MARGIN') or contains(@text,'CDN MARGIN') or contains(@text,'CDN MARGIN SHORT') or contains(@text,'US MARGIN SHORT') or contains(@text,'CANADIAN MARGIN') or contains(@text,'MARGE EN $CDN') or contains(@text,'MARGE EN $US')])[1]")
	private MobileElement QuickAccessUserInvestment;

	@iOSXCUITFindBy(xpath = "(//*[contains(@label,'CHEQUING ACCOUNT') or contains(@label,'Paramètres Accès rapide')])[1]")
	@AndroidFindBy(xpath = "(//*[contains(@text,'CHEQUING ACCOUNT') or contains(@text,'Paramètres Accès rapide')])[1]")
	private MobileElement QuickAccessUserChequing;

	@iOSXCUITFindBy(xpath = "(//*[contains(@label,'CREDIT CARD') or contains(@label,'Paramètres Accès rapide')])[1]")
	@AndroidFindBy(xpath = "(//*[contains(@text,'CREDIT CARD') or contains(@text,'Paramètres Accès rapide')])[1]")
	private MobileElement QuickAccessUserCreditCard;

	@iOSXCUITFindBy(xpath = "(//*[contains(@label,'LINE OF CREDIT') or contains(@label,'LIGNE DE CREDIT')])[1]")
	@AndroidFindBy(xpath = "(//*[contains(@text,'LINE OF CREDIT') or contains(@text,'LIGNE DE CREDIT')])[1]")
	private MobileElement QuickAccessUserLineOfCredit;

	@iOSXCUITFindBy(xpath = "(//*[contains(@label,'SAVINGS ACCOUNT') or contains(@label,'Paramètres Accès rapide')])[1]")
	@AndroidFindBy(xpath = "(//*[contains(@text,'SAVINGS ACCOUNT') or contains(@text,'Paramètres Accès rapide')])[1]")
	private MobileElement QuickAccessUserSavingAccount;

	@iOSXCUITFindBy(xpath = "(//*[contains(@label,'BUSINESS - CHEQUING') or contains(@label,'COMPTE-CHEQUES')])[1]")
	@AndroidFindBy(xpath = "(//*[contains(@text,'BUSINESS - CHEQUING') or contains(@text,'COMPTE-CHEQUES')])[1]")
	private MobileElement QuickAccessUserSmallBusiness;

	@iOSXCUITFindBy(xpath = "(//*[contains(@label,'US DOLLAR CARD') or contains(@label,'Paramètres Accès rapide')])[1]")
	@AndroidFindBy(xpath = "(//*[contains(@text,'SAVINGS ACCOUNT') or contains(@text,'Paramètres Accès rapide')])[1]")
	private MobileElement QuickAccessUserUSAccount;

	// @iOSFindBy(xpath = "//*[@label='Get Started' or @label='Compte' or
	// @label='Get Started' or @label='Compte']")
	@iOSXCUITFindBy(accessibility = "QUICKBALANCE_ONBOARDING_START_BUTTON")
	@AndroidFindBy(xpath = "//*[@text='Get Started' or @text='Get Started' or @text='主页' or @text='首頁']")
	private MobileElement btnGetStarted;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Agree' or @label='Compte' or @label='同意' or @label='同意']")
	@AndroidFindBy(xpath = "//*[@text='Agree' or @text='Accepte' or @text='同意' or @text='同意']")
	private MobileElement btnAgree;

	@iOSFindBy(xpath = "//*[@label='Get Started' or @label='Compte' or @label='Get Started' or @label='Compte']")
	@AndroidFindBy(xpath = "//*[@text='Get Started' or @text='Get Started' or @text='主页' or @text='首頁']")
	private MobileElement btnGetStartedSuccess;

	public void goToDashboardHome() {
		Decorator();
		try {
			MIT_DSHQuickLinks.get().goToDashboardHome();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyQuickAccessHome() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(BT_Home_QuickAccess,
					"QuickAccess is displayed at the Top Right corner");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyQuickAccessMenu() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(BT_Home_QuickAccess,
					"QuickAccess Menu displayed at the Top Right corner");

			mobileAction.FuncClick(BT_Home_QuickAccess, "BT_Home_QuickAccess");

			mobileAction.verifyElementIsDisplayed(lblQuickAccessTitle, "lblQuickAccessTitle");

			mobileAction.FuncVerifyTextEquals(lblQuickAccessTitle,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDMYSPEND));

			mobileAction.verifyElementIsDisplayed(btnQuickAccessClose, "btnQuickAccessClose");

			mobileAction.verifyElementIsDisplayed(BtnQuickAccessSettings, "BtnQuickAccessSettings");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyQuickAccessSettings() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(BT_Home_QuickAccess,
					"QuickAccess Menu displayed at the Top Right corner");

			mobileAction.FuncClick(BT_Home_QuickAccess, "BT_Home_QuickAccess");

			mobileAction.verifyElementIsDisplayed(lblQuickAccessTitle, "lblQuickAccessTitle");

			mobileAction.FuncVerifyTextEquals(lblQuickAccessTitle,
					getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND));

			mobileAction.verifyElementIsDisplayed(btnQuickAccessClose, "btnQuickAccessClose");

			mobileAction.verifyElementIsDisplayed(BtnQuickAccessSettings, "BtnQuickAccessSettings");

			mobileAction.FuncVerifyTextEquals(BtnQuickAccessSettings,
					getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS));

			mobileAction.FuncClick(BtnQuickAccessSettings, "BtnQuickAccessSettings");

			mobileAction.verifyElementIsDisplayed(QuickAccessTitle, "QuickAccessTitle");

			mobileAction.FuncVerifyTextEquals(QuickAccessTitle,
					getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS));

			mobileAction.verifyElementIsDisplayed(BT_Back, "BT_Back");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//android.widget.Switch[@content-desc='"
								+ getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND) + "']",
						"Quick Access Switch");
			} else {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS)
								+ "']/../XCUIElementTypeSwitch",
						"Quick Access Switch");
			}

			mobileAction.verifyElementIsDisplayed(quickaccess_switch, "Quick Access Switch");
			String switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);

			if (switchCheckStatus.equalsIgnoreCase("true"))

			{

				// Enabled
				mobileAction.verifyElementTextIsDisplayed(indiviual_accounts, "ACCOUNTS | COMPTES ");
				// Toggle to disable it
				mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");

				switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);

				if (mobileAction.isObjExists(indiviual_accounts)) {
					CL.GetReporting().FuncReport("Fail", "Account still exists even when switch toggle to disable");

				} else {

					CL.GetReporting().FuncReport("Pass", "Accounts Not displaying ");
				}

			} else {
				// Disabled
				if (mobileAction.isObjExists(indiviual_accounts)) {

					CL.GetReporting().FuncReport("Fail", "Account still exists when switch status is false");
				} else {
					CL.GetReporting().FuncReport("Pass", "Accounts displaying ");
					// Toggle to Enable it
					mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");

					switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);

					if (mobileAction.isObjExists(indiviual_accounts))

					{
						CL.GetReporting().FuncReport("Pass", "Accounts not displaying");
					}

					else {
						CL.GetReporting().FuncReport("Pass", "Account still exists when switch status  is false");
					}

				}
			}

			mobileAction.FuncClick(BT_Back, "BT_Back");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyPreferenceQuickAccess() {
		Decorator();
		try {
			Thread.sleep(1000);
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutProfileSettings, false, 10, "up");

			clickFlyout(flyoutProfileSettings, "flyoutProfileSettings");

			mobileAction.FuncClick(QuickAccessSettingsNav, "QuickAccessSettingsNav");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//android.widget.Switch[@content-desc='"
								+ getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND) + "']",
						"Quick Access Switch");
			} else {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS)
								+ "']/../XCUIElementTypeSwitch",
						"Quick Access Switch");
			}
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				quickaccess_AccountToggleSwitch = mobileAction.verifyElementUsingXPath(
						"//android.widget.Switch[@content-desc='"
								+ getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_ACCOUNTS) + "']",
						"Quick Access Switch");
			} else {
				quickaccess_AccountToggleSwitch = mobileAction
						.verifyElementUsingXPath(
								"//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_ACCOUNTS)
										+ "']/../following-sibling::XCUIElementTypeCell[1]/*[3]",
								"Account Toggle Switch");
			}
			String switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);

			if (switchCheckStatus.equalsIgnoreCase("true"))

			{

				// Enabled
				mobileAction.verifyElementTextIsDisplayed(indiviual_accounts, "ACCOUNTS | COMPTES | 账户 | 賬戶");
				// Toggle to disable it
				mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");

				switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);

				if (mobileAction.isObjExists(indiviual_accounts)) {
					CL.GetReporting().FuncReport("Fail", "Account still exists even when switch toggle to disable");

				} else {

					CL.GetReporting().FuncReport("Pass", "Accounts not displaying ");
				}

				mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");

			} else {
				// Disabled
				if (mobileAction.isObjExists(indiviual_accounts)) {

					CL.GetReporting().FuncReport("Fail", "Account still exists when switch status is false");
				} else {
					CL.GetReporting().FuncReport("Pass", "Accounts not displaying ");
					// Toggle to Enable it
					mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");

					switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);

					if (mobileAction.isObjExists(indiviual_accounts))

					{
						CL.GetReporting().FuncReport("Pass", "Accounts not displaying");
					}

					else {
						CL.GetReporting().FuncReport("Fail", "Account still exists when switch status  is false");
					}

				}
			}

			mobileAction.FuncClick(BT_Back, "BT_Back");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyQuickAccessUnauthenticated() {
		Decorator();
		try {

			mobileAction.FuncClick(BT_Home_QuickAccess, "BT_Home_QuickAccess");
			if (mobileAction.isObjExists(btnGetStarted, 2)) {
				mobileAction.FuncClick(btnGetStarted, "btnGetStarted");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncClick(btnAgree, "btnAgree");

				mobileAction.FuncClick(btnGetStartedSuccess, "btnGetStartedSuccess");
				mobileAction.FuncClick(BT_Home_QuickAccess, "BT_Home_QuickAccess");
			}

			mobileAction.FuncClick(BtnQuickAccessSettings, "BtnQuickAccessSettings");

			LoginMIT.get().MITLogin();
			Thread.sleep(10000);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//android.widget.Switch[@content-desc='"
								+ getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND) + "']",
						"Quick Access Switch");
			} else {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS)
								+ "']/../XCUIElementTypeSwitch",
						"Quick Access Switch");
			}

			mobileAction.verifyElementTextIsDisplayed(indiviual_accounts, "ACCOUNTS | COMPTES | 账户 | ACCOUNTS");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				quickaccess_AccountToggleSwitch = mobileAction.verifyElementUsingXPath(
						"//android.widget.Switch[@content-desc='"
								+ getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_ACCOUNTS) + "']",
						"Quick Access Switch");
			} else {
				quickaccess_AccountToggleSwitch = mobileAction
						.verifyElementUsingXPath(
								"//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_ACCOUNTS)
										+ "']/../following-sibling::XCUIElementTypeCell[1]/*[3]",
								"Account Toggle Switch");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyQuickAccessUserType() {
		Decorator();
		try {
			//mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");

			MIT_DSHQuickLinks.get().goToDashboardHome();

			mobileAction.FuncClick(BT_Home_QuickAccess, "BT_Home_QuickAccess");

			if (mobileAction.isObjExists(btnGetStarted, 2)) {
				mobileAction.FuncClick(btnGetStarted, "btnGetStarted");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncClick(btnAgree, "btnAgree");

				mobileAction.FuncClick(btnGetStartedSuccess, "btnGetStartedSuccess");
				mobileAction.FuncClick(BT_Home_QuickAccess, "BT_Home_QuickAccess");
			}

			String UserRole = getTestdata("UserRole", XLSheetUserIDs);

			switch (UserRole) {

			case "Investment":

				mobileAction.FuncSwipeWhileElementNotFound(QuickAccessUserInvestment, true, 20, "up");

				break;

			case "Chequing":

				mobileAction.FuncSwipeWhileElementNotFound(QuickAccessUserChequing, false, 20, "up");

				break;

			case "Credit Card":

				mobileAction.FuncSwipeWhileElementNotFound(QuickAccessUserCreditCard, false, 20, "up");

				break;

			case "Line Of Credit":

				mobileAction.FuncSwipeWhileElementNotFound(QuickAccessUserLineOfCredit, false, 20, "up");

				break;

			case "Saving Account":

				mobileAction.FuncSwipeWhileElementNotFound(QuickAccessUserSavingAccount, false, 20, "up");

				break;

			case "Small Business":

				mobileAction.FuncSwipeWhileElementNotFound(QuickAccessUserSmallBusiness, false, 20, "up");

				break;

			case "US Account":

				mobileAction.FuncSwipeWhileElementNotFound(QuickAccessUserUSAccount, false, 20, "up");

				break;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickFlyout(MobileElement objElement, String text) {

		Decorator();

		try {

			for (int i = 0; i < 5; i++) {
				if (mobileAction.isObjExists(objElement, 2)) {
					mobileAction.FuncClick(objElement, "" + objElement.getText());
					break;
				}

				else {
					mobileAction.FuncSwipeOnce("up");
				}

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
