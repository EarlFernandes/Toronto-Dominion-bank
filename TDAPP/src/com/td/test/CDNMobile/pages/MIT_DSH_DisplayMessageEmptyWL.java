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

public class MIT_DSH_DisplayMessageEmptyWL extends _CommonPage {

	private static MIT_DSH_DisplayMessageEmptyWL MIT_DSH_DisplayMessageEmptyWL;

	public synchronized static MIT_DSH_DisplayMessageEmptyWL get() {
		if (MIT_DSH_DisplayMessageEmptyWL == null) {
			MIT_DSH_DisplayMessageEmptyWL = new MIT_DSH_DisplayMessageEmptyWL();
		}
		return MIT_DSH_DisplayMessageEmptyWL;

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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'06')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tv_watchlist_name_header' and contains(@text,'06')]")
	private MobileElement FilledListCollapse;

	@iOSXCUITFindBy(accessibility = "expandButton")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_more_footer")
	private MobileElement btnMore;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='List 06']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/watchlist_name_drop_down' and @text='List 06']")
	private MobileElement FilledListExpand;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='List 01']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/watchlist_name' and @text='List 01']")
	private MobileElement ListView;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='List 01']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/watchlist_name_drop_down' and @text='List 01']")
	private MobileElement EmptyListExpand;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='List 01']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tv_watchlist_name_header' and @text='List 01']")
	private MobileElement EmptyListCollapse;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='List 01']")
	@AndroidFindBy(id = "com.td:id/watchlist_empty_card_star")
	private MobileElement EmptyWLStar;

	@iOSXCUITFindBy(accessibility = "WatchListWidgetOverlayViewMessage")
	@AndroidFindBy(id = "com.td:id/watchlist_empty_card_firstmessage")
	private MobileElement EmptyWLDesc;

	@iOSXCUITFindBy(accessibility = "WatchListWidgetOverlayViewAction")
	@AndroidFindBy(id = "com.td:id/watchlist_empty_card_secondmessage")
	private MobileElement LinkEmptyWLAddSymbol;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@label='Search or add symbols' or contains(@label,'des symboles') or @label='搜索或添加股票代码' or @label='搜尋或添加股票代號']")
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;

	@iOSXCUITFindBy(accessibility = "dropdownButton")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/watchlist_name_drop_down_button']")
	MobileElement btnDropDown;

	public void verifyCollapseEmptyWL() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			mobileAction.verifyElementIsDisplayed(FilledListCollapse, "FilledListCollapse");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyExpandEmptyWL() {
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

			mobileAction.verifyElementIsDisplayed(FilledListCollapse, "FilledListCollapse");

			mobileAction.FuncClick(btnMore, "btnMore");

			mobileAction.verifyElementIsDisplayed(FilledListExpand, "FilledListExpand");

			mobileAction.FuncClick(FilledListExpand, "FilledListExpand");

			mobileAction.FuncClick(ListView, "ListView");

			mobileAction.verifyElementIsDisplayed(EmptyListExpand, "EmptyListExpand");

			mobileAction.FuncClick(BT_Back, "BT_Back");

			mobileAction.verifyElementIsDisplayed(EmptyListCollapse, "EmptyListCollapse");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyAddButtonEmptyWL() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
					if (mobileAction.isObjExists(AccessoryGoHome)) {
						mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");
					}
				}

			}

			mobileAction.FuncVerifyTextEquals(EmptyWLDesc,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EmptyWLDesc));

			mobileAction.FuncVerifyTextEquals(LinkEmptyWLAddSymbol,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_AddSymbolLink));

			mobileAction.FuncClick(LinkEmptyWLAddSymbol, "LinkEmptyWLAddSymbol");

			mobileAction.verifyElementIsDisplayed(search_symbol, "search_symbol");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyUIEmptyWLExpand() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			Thread.sleep(1000);
/*			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}*/
			
			MIT_DSHQuickLinks.get().turnInvestingFocusOn();

			mobileAction.FuncVerifyTextEquals(EmptyWLDesc,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EmptyWLDesc));

			mobileAction.FuncVerifyTextEquals(LinkEmptyWLAddSymbol,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_AddSymbolLink));

			mobileAction.FuncClick(btnMore, "btnMore");

			mobileAction.FuncVerifyTextEquals(EmptyWLDesc,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EmptyWLDesc));

			mobileAction.FuncVerifyTextEquals(LinkEmptyWLAddSymbol,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_AddSymbolLink));

			for (int i = 1; i <= 10; i++)

			{
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					mobileAction.FuncClick(btnDropDown, "btnDropDown");

					String sXpathiAnd = "(//android.widget.TextView[@resource-id='com.td:id/watchlist_name' and contains(@text,'"
							+ i + "')])[1]";

					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiAnd, false, 5, "up");

					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiAnd)),
							"Empy List Number clicked" + i);

					mobileAction.FuncVerifyTextEquals(EmptyWLDesc,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EmptyWLDesc));

					mobileAction.FuncVerifyTextEquals(LinkEmptyWLAddSymbol,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_AddSymbolLink));

				}

				else {

					mobileAction.FuncClick(btnDropDown, "btnDropDown");

					String sXpathiOS = "(//XCUIElementTypeStaticText[contains(@label,'" + i + "')])[1]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiOS, false, 5, "up");
					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiOS)),
							"Empy List Number clicked" + i);

					mobileAction.FuncVerifyTextEquals(EmptyWLDesc,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EmptyWLDesc));

					mobileAction.FuncVerifyTextEquals(LinkEmptyWLAddSymbol,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_AddSymbolLink));

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
