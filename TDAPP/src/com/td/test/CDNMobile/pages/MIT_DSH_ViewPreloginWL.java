package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import com.td.test.framework.MobileAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSH_ViewPreloginWL extends _CommonPage {

	private static MIT_DSH_ViewPreloginWL MIT_DSH_ViewPreloginWL;

	public synchronized static MIT_DSH_ViewPreloginWL get() {
		if (MIT_DSH_ViewPreloginWL == null) {
			MIT_DSH_ViewPreloginWL = new MIT_DSH_ViewPreloginWL();
		}
		return MIT_DSH_ViewPreloginWL;

	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSXCUITFindBy(accessibility = "switchNowButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/investing_welcome_switch']")
	private MobileElement btnSwitchNow;

	@iOSXCUITFindBy(accessibility = "ProfilePreferencesToggleTableViewCell_Toggle_Switch")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/nav_row_switch']")
	private MobileElement InvestingToggle;

	@iOSXCUITFindBy(accessibility = "ProfilePreferencesSubtitleTableViewCell_Accessory_Button")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/nav_row_left_icon']")
	private MobileElement AccessoryGoHome;

	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;

	@iOSXCUITFindBy(xpath = "//*[@label='Logout' or@label='Fermer la session' or @label='退出' or @label='登出']")
	@AndroidFindBy(xpath = "//*[@text='Logout' or @text='Fermer la session' or @text='退出' or @text='登出']")
	// @AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement flyoutLogOut;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'GO BACK')]")
	@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button'])[1]")
	private MobileElement btn_home;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'06')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tv_watchlist_name_header' and contains(@text,'06')]")
	private MobileElement FilledListCollapse;

	@iOSXCUITFindBy(accessibility = "expandButton")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_more_footer")
	private MobileElement btnMore;

	@iOSXCUITFindBy(accessibility = "LOGIN_LOGINBUTTON")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement login;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'List 06')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/watchlist_name_drop_down' and contains(@text,'List 06')]")
	private MobileElement FilledListExpand;

	@iOSFindBy(xpath = "//*[@label='Home' or @label='Accueil' or @label='主页' or @label='首頁']")
	@AndroidFindBy(xpath = "//*[@text='Home' or @text='Accueil' or @text='主页' or @text='首頁']")
	private MobileElement FLY_Home;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_HamburgerMenu;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "com.td:id/toolbar_back_button")
	private MobileElement BT_WLBack;

	public void verifyViewPreloginWL() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			/*
			 * if (mobileAction.isObjExists(btnSwitchNow, 2)) {
			 * mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");
			 * 
			 * mobileAction.FuncClick(InvestingToggle, "InvestingToggle");
			 * 
			 * mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");
			 * 
			 * }
			 */

			MIT_DSHQuickLinks.get().turnInvestingFocusOn();

			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");

			mobileAction.FuncClick(flyoutLogOut, "flyoutLogOut");

			mobileAction.FuncSwipeWhileElementNotFound(btn_home, false, 5, "up");

			mobileAction.FuncClick(btn_home, "Home Button");

			mobileAction.verifyElementIsDisplayed(FilledListCollapse, "Filled List is displayed after logged out");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyViewPreloginWLExpandView() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			/*
			 * if (mobileAction.isObjExists(btnSwitchNow, 2)) {
			 * mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");
			 * 
			 * mobileAction.FuncClick(InvestingToggle, "InvestingToggle");
			 * 
			 * mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");
			 * 
			 * }
			 */
			MIT_DSHQuickLinks.get().turnInvestingFocusOn();

			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");

			mobileAction.FuncClick(flyoutLogOut, "flyoutLogOut");

			mobileAction.FuncSwipeWhileElementNotFound(btn_home, false, 5, "up");

			mobileAction.FuncClick(btn_home, "Home Button");

			mobileAction.FuncSwipeWhileElementNotFound(btnMore, false, 3, "up");

			mobileAction.verifyElementIsDisplayed(btnMore, "btnMore");

			mobileAction.FuncClick(btnMore, "btnMore");

			// mobileAction.verifyElementIsDisplayed(login, "Login"); As per new
			// requirement In Pre-logined when tap on More it will go to
			// Expanded mode

			// mobileAction.FuncClick(BT_WLBack, "< Button");

			// LoginMIT.get().MITLogin();

			// MIT_DSHQuickLinks.get().goToDashboardHome();

			/*
			 * if
			 * (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase(
			 * "Android")) { mobileAction.FuncClick(BT_HamburgerMenu,
			 * "BT_HamburgerMenu"); mobileAction.FuncClick(FLY_Home,
			 * "Home Flyout Menu"); } else { mobileAction.FuncClick(BT_Back,
			 * "< Button"); }
			 */
			mobileAction.verifyElementIsDisplayed(FilledListExpand, "FilledListExpand");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
