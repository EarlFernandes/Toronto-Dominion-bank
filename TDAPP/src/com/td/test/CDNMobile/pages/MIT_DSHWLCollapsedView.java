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

public class MIT_DSHWLCollapsedView extends _CommonPage {

	private static MIT_DSHWLCollapsedView MIT_DSHWLCollapsedView;

	public synchronized static MIT_DSHWLCollapsedView get() {
		if (MIT_DSHWLCollapsedView == null) {
			MIT_DSHWLCollapsedView = new MIT_DSHWLCollapsedView();
		}
		return MIT_DSHWLCollapsedView;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSXCUITFindBy(accessibility = "dropdownButton")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_name_header")
	private MobileElement LT_Watchlist;

	@iOSXCUITFindBy(accessibility = "menuButton")
	@AndroidFindBy(id = "com.td:id/iv_watchlist_dot_header")
	private MobileElement BT_MoreOptions;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_more_footer")
	private MobileElement BT_More;

	@iOSXCUITFindBy(xpath = "//*[@label='Refresh' or @label='Rafraîchir' or @label='刷新' or @label='刷新']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/iv_item_more_option'])[1]")
	private MobileElement BT_Refresh;

	@iOSXCUITFindBy(xpath = "//*[@label='Refresh' or @label='Rafraîchir' or @label='刷新' or @label='刷新']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_name'])[1]")
	private MobileElement LBL_RefreshCardContent;

	@iOSXCUITFindBy(xpath = "//*[@label='Update the quotes for your symbols' or @label='Mettre à jour les cotes associées à vos symboles' or @label='更新股票代码的报价' or @label='更新股票代號的報價']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_desp'])[1]")
	private MobileElement LBL_UpdateQuotes;

	@iOSXCUITFindBy(xpath = "//*[@label='Edit watchlist' or @label='Modifier la liste de surveillance' or @label='编辑自选股观察名单' or @label='編輯自選股觀察名單']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/iv_item_more_option'])[2]")
	private MobileElement BT_EditWatchlist;

	@iOSXCUITFindBy(xpath = "//*[@label='Edit watchlist' or @label='Modifier la liste de surveillance' or @label='编辑自选股观察名单' or @label='編輯自選股觀察名單']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_name'])[2]")
	private MobileElement LBL_EditWatchlist;

	@iOSXCUITFindBy(xpath = "//*[@label='Manage, rename, and add or remove symbols' or @label='Gérer, renommer, ajouter ou supprimer des symboles' or @label='管理、重命名、添加或移除股票代码' or @label='管理、重新命名、新增或移除股票代號']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_desp'])[2]")
	private MobileElement LBL_ManageRename;

	@iOSXCUITFindBy(xpath = "//*[@label='Settings' or @label='Paramètres' or @label='设置' or @label='設定']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/iv_item_more_option'])[3]")
	private MobileElement BT_Settings;

	@iOSXCUITFindBy(xpath = "//*[@label='Settings' or @label='Paramètres' or @label='设置' or @label='設定']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_name'])[3]")
	private MobileElement LBL_Settings;

	@iOSXCUITFindBy(xpath = "//*[@label='Switch between a banking or investing view' or @label='Passer de l’affichage bancaire à l’affichage de placements' or @label='切换理财或投资视图' or @label='切換理財或投資視圖']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_desp'])[3]")
	private MobileElement LBL_SwitchBetween;

	@iOSXCUITFindBy(xpath = "//*[@label='Edit watchlist' or @label='Modifier la liste de surveillance' or @label='编辑自选股观察名单' or @label='編輯自選股觀察名單']")
	@AndroidFindBy(xpath = "//*[@text='Edit watchlist' or @text='Modifier la liste de surveillance' or @text='编辑自选股观察名单' or @text='編輯自選股觀察名單']")
	private MobileElement HDR_EditWatchlist;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "com.td:id/toolbar_back_button")
	MobileElement BT_EditWatchlist_Back;

	@iOSXCUITFindBy(xpath = "//*[@label='Home Screen Settings' or @label='Paramètres de l’écran d’accueil' or @label='主屏幕设置' or @label='主屏幕設置']")
	@AndroidFindBy(xpath = "//*[@text='Home Screen Settings' or @text='Paramètres de l’écran d’accueil' or @text='主屏幕设置' or @text='主屏幕設置']")
	private MobileElement LBL_HomeScreenSettings;

	@iOSXCUITFindBy(xpath = "//*[@label='Search or add symbols' or @label='Rechercher ou ajouter des symboles' or @label='搜索或添加股票代码' or @label='搜尋或添加股票代號']")
	@AndroidFindBy(xpath = "//*[@text='Search or add symbols' or @text='Rechercher ou ajouter des symboles' or @text='搜索或添加股票代码' or @text='搜尋或添加股票代號']")
	private MobileElement LBL_Searchoraddsymbols;

	@iOSXCUITFindBy(accessibility = "alert_ok_button")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement BT_AlertAgree;

	public void verifyWLCollapsedViewUI() {
		Decorator();
		try {
			MIT_DSHQuickLinks.get().turnInvestingFocusOn();
			mobileAction.verifyElementIsDisplayed(LT_Watchlist, "Watchlist Dropdown");
			mobileAction.verifyElementIsDisplayed(BT_MoreOptions, "More Options button");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncSwipeOnce("up");
				if (CL.GetAppiumDriver().findElements(By.id("com.td:id/tv_item_watchlist_name")).size() == 3) {
					CL.GetReporting().FuncReport(PASS, "Max 3 symbols are displayed in watchlist collapsed view.");
				} else if (CL.GetAppiumDriver().findElements(By.id("com.td:id/tv_item_watchlist_name")).size() < 3)
					CL.GetReporting().FuncReport(FAIL, "Less than 3 symbols,Correct Test Data.");
				else
					CL.GetReporting().FuncReport(FAIL, "Max 3 symbols are allowed in watchlist collapsed view.");

			} else {

			}

			mobileAction.verifyElementIsDisplayed(BT_More, "More button");

			mobileAction.FuncClick(BT_MoreOptions, "More Options button");

			mobileAction.FuncVerifyTextEquals(LBL_RefreshCardContent,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_REFRESH));

			mobileAction.FuncVerifyTextEquals(LBL_UpdateQuotes,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_UPDATEQUOTES));

			mobileAction.FuncVerifyTextEquals(LBL_EditWatchlist,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EDITWATCHLIST));

			mobileAction.FuncVerifyTextEquals(LBL_ManageRename,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_MANAGERENAME));

			mobileAction.FuncVerifyTextEquals(LBL_Settings,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SETTINGS));

			mobileAction.FuncVerifyTextEquals(LBL_SwitchBetween,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SWITCHBETWEEN));

			mobileAction.FuncClick(BT_Refresh, "Refresh Button");

			mobileAction.FuncClick(BT_More, "More button");

			mobileAction.verifyElementIsDisplayed(LBL_Searchoraddsymbols, "Search or add symbols");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWLMoreOptions() {
		Decorator();
		try {
			MIT_DSHQuickLinks.get().turnInvestingFocusOn();

			mobileAction.FuncClick(BT_MoreOptions, "More Options button");

			mobileAction.FuncClick(BT_Refresh, "Refresh button");

			mobileAction.FuncClick(BT_MoreOptions, "More Options button");

			mobileAction.FuncClick(BT_EditWatchlist, "Edit Watchlist button");

			mobileAction.FuncVerifyTextEquals(HDR_EditWatchlist,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EDITWATCHLIST));

			mobileAction.FuncClick(BT_EditWatchlist_Back, "< Button");

			/*
			 * if
			 * (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase(
			 * "Android")) // BA accepts the
			 * mobileAction.FuncClick(BT_EditWatchlist_Back, "< Button");
			 */

			mobileAction.FuncClick(BT_MoreOptions, "More Options button");

			mobileAction.FuncClick(BT_Settings, "Settings button");

			mobileAction.FuncVerifyTextEquals(LBL_HomeScreenSettings,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_HOMESCREENSETTINGS));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBuySellWLCollapsedView() {
		Decorator();
		try {
			/*
			 * String sCurrentWatchlist = "Auto1";
			 * 
			 * String xpathWatchlistItem = "//*[@text='" + sCurrentWatchlist +
			 * "' or @label='" + sCurrentWatchlist + "']";
			 * 
			 * mobileAction.FuncClick(LT_Watchlist, "Watchlist Dropdown");
			 * 
			 * mobileAction.FuncSwipeWhileElementNotFoundByxpath(
			 * xpathWatchlistItem, false, 10, "up");
			 */
			MIT_DSHQuickLinks.get().turnInvestingFocusOn();
			if (!CL.getTestDataInstance().getMobileDeviceType().equalsIgnoreCase("Tablet")) {
				mobileAction.FuncSwipeOnce("up");
			}

			String sSymbol = getTestdata("Symbol", XLSheetUserIDs);

			MIT_DSHWLPopulateData.get().clickWLSymbolBuyButton(sSymbol);

			MIT_DSHWLPopulateData.get().verifyStockOrderEntryScreen(sSymbol, "Buy");

			mobileAction.FuncClick(BT_Back, "< Button");

			mobileAction.FuncClick(BT_AlertAgree, "Agree Button");

			MIT_DSHWLPopulateData.get().clickWLSymbolSellButton(sSymbol);

			MIT_DSHWLPopulateData.get().verifyStockOrderEntryScreen(sSymbol, "Sell");

			mobileAction.FuncClick(BT_Back, "< Button");

			mobileAction.FuncClick(BT_AlertAgree, "Agree Button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
