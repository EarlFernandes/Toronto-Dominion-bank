package com.td.test.CDNMobile.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSHWLTopNav extends _CommonPage {
	private static MIT_DSHWLTopNav MIT_DSHWLTopNav;

	public synchronized static MIT_DSHWLTopNav get() {
		if (MIT_DSHWLTopNav == null) {
			MIT_DSHWLTopNav = new MIT_DSHWLTopNav();
		}
		return MIT_DSHWLTopNav;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSFindBy(xpath = "//*[@label='Search or add symbols' or @label='Rechercher ou ajouter des symboles' or @label='支付账单' or @label='支付賬單']")
	@AndroidFindBy(xpath = "//*[@text='Search or add symbols' or @text='Rechercher ou ajouter des symboles' or @text='支付账单' or @text='支付賬單']")
	private MobileElement ED_Searchoraddsymbols;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "com.td:id/toolbar_back_button")
	private MobileElement BT_WatchListBack;

	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/hamburger")
	private MobileElement BT_Home_HamburgerMenu;

	@iOSXCUITFindBy(xpath = "//*[@label='WATCHLISTS' or @label='LISTES DE SURVEILLANCE' or @label='自选股观察名单' or @label='自選股觀察名單']")
	@AndroidFindBy(xpath = "//*[@text='WATCHLISTS' or @text='LISTES DE SURVEILLANCE' or @text='自选股观察名单' or @text='自選股觀察名單']")
	private MobileElement QL_WATCHLISTS;

	@iOSXCUITFindBy(xpath = "//*[@label='Edit']/../*[1]")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_name_header")
	private MobileElement LT_WatchListDropDown;

	@iOSXCUITFindBy(accessibility = "actionSheetCancelButton")
	@AndroidFindBy(id = "com.td:id/cancel_button")
	private MobileElement BT_WatchListCancel;

	@iOSXCUITFindBy(xpath = "//*[@name='actionSheetCancelButton']/../../XCUIElementTypeCell/*[1]")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/watchlist_name']")
	private List<MobileElement> LBL_WatchListItems;

	@iOSXCUITFindBy(xpath = "//*[@label='Edit' or @label='LISTES DE SURVEILLANCE' or @label='自选股观察名单' or @label='自選股觀察名單']")
	@AndroidFindBy(id = "com.td:id/watchlist_edit_button")
	private MobileElement BT_Watchlist_Edit;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_more_footer")
	private MobileElement BT_More;

	public void verifyWatchlistHeaderUI() {
		Decorator();
		try {

			mobileAction.FuncClick(BT_More, "More Button");

			mobileAction.verifyElementIsDisplayed(BT_WatchListBack, "Back");
			mobileAction.verifyElementIsDisplayed(ED_Searchoraddsymbols, "Search or add symbols");
			mobileAction.FuncClick(BT_WatchListBack, "< Button");
			mobileAction.verifyElementIsDisplayed(BT_Home_HamburgerMenu, "Dashboard Home Screen");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMenuBarWatchlistDropDown() {
		Decorator();
		String sCurrentWatchlist = null;
		String sNewWatchList = null;
		try {
			mobileAction.FuncClick(BT_More, "More Button");

			sCurrentWatchlist = mobileAction.FuncGetText(LT_WatchListDropDown);
			mobileAction.FuncClick(LT_WatchListDropDown, "LT_WatchListDropDown");

			String xpathWatchlistItem = "//*[@text='" + sCurrentWatchlist + "' or @label='" + sCurrentWatchlist + "']";

			mobileAction.FuncClick(BT_WatchListCancel, "CANCEL Button");

			mobileAction.verifyElement(LT_WatchListDropDown, sCurrentWatchlist);

			mobileAction.FuncClick(LT_WatchListDropDown, "LT_WatchListDropDown");

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathWatchlistItem, false, 10, "up");

			for (MobileElement sWatchListItem : LBL_WatchListItems) {
				sNewWatchList = mobileAction.FuncGetElementText(sWatchListItem);
				if (!sNewWatchList.equals(sCurrentWatchlist)) {
					mobileAction.FuncClick(sWatchListItem, sNewWatchList);
					break;
				}
			}

			mobileAction.verifyElement(LT_WatchListDropDown, sNewWatchList);

			mobileAction.verifyElementIsDisplayed(BT_Watchlist_Edit, "Watchlist Menu Bar Edit Button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
