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

public class MIT_DSH_WLErrorState1 extends _CommonPage {

	private static MIT_DSH_WLErrorState1 MIT_DSH_WLErrorState1;

	public synchronized static MIT_DSH_WLErrorState1 get() {
		if (MIT_DSH_WLErrorState1 == null) {
			MIT_DSH_WLErrorState1 = new MIT_DSH_WLErrorState1();
		}
		return MIT_DSH_WLErrorState1;

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

	@iOSXCUITFindBy(accessibility = "dropdownButton")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/watchlist_name_drop_down']")
	MobileElement btnDropDown;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='List 02']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/watchlist_name' and @text='List 02']")
	private MobileElement ListExpiredCollapse;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Liste 09']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/watchlist_name' and @text='Liste 09']")
	private MobileElement ListEACollapse;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='名單 10']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/watchlist_name' and @text='名單 10']")
	private MobileElement ListEACollapseView;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='errorButton'])[1]")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.td:id/watchlist_symbol_error'])[1]")
	MobileElement errorSymbol;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='errorButton']/../../following-sibling::*[1]/*[1]/XCUIElementTypeStaticText[1])[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/watchlist_name' and @text='List 01']")
	private MobileElement price;

	public void verifyErrorExpiredSymbol() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			mobileAction.FuncClick(btnDropDown, "btnDropDown");

			mobileAction.FuncClick(ListExpiredCollapse, "ListExpiredCollapse");

			mobileAction.verifyElementIsDisplayed(errorSymbol, "errorSymbol");

			mobileAction.FuncVerifyTextEquals(errorSymbol,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ExpiredSymbolError));

			mobileAction.FuncClick(errorSymbol, "errorSymbol");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyErrorEANotSigned() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			mobileAction.FuncClick(btnDropDown, "btnDropDown");

			mobileAction.FuncClick(ListEACollapse, "ListEACollapse");

			mobileAction.verifyElementIsDisplayed(errorSymbol, "errorSymbol");

			mobileAction.FuncVerifyTextEquals(errorSymbol,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EAnotSignedError));

			mobileAction.FuncClick(errorSymbol, "errorSymbol");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyErrorEANotSignedCollapse() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			mobileAction.FuncClick(btnDropDown, "btnDropDown");

			mobileAction.FuncClick(ListEACollapseView, "ListEACollapseView");

			mobileAction.verifyElementIsDisplayed(errorSymbol, "errorSymbol");

			mobileAction.FuncVerifyTextEquals(errorSymbol,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EAnotSignedError));

			mobileAction.FuncClick(errorSymbol, "errorSymbol");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
