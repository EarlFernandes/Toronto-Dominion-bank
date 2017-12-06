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

public class MIT_DSH_EditWatclist extends _CommonPage {

	private static MIT_DSH_EditWatclist MIT_DSH_EditWatclist;

	public synchronized static MIT_DSH_EditWatclist get() {
		if (MIT_DSH_EditWatclist == null) {
			MIT_DSH_EditWatclist = new MIT_DSH_EditWatclist();
		}
		return MIT_DSH_EditWatclist;

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

	@iOSXCUITFindBy(accessibility = "SearchBarWidget")

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Search or add symbols' or @text='Rechercher ou ajouter des symboles' or @text='搜索或添加股票代码' or @text='搜尋或添加股票代號']")
	private MobileElement searchBar;

	@iOSXCUITFindBy(accessibility = "expandButton")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_more_footer")
	private MobileElement btnMore;

	@iOSXCUITFindBy(accessibility = "menuButton")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/iv_watchlist_dot_header']")
	private MobileElement BT_MoreOptions;

	@iOSXCUITFindBy(xpath = "//*[@label='Edit watchlist' or @label='Modifier la liste de surveillance' or @label='编辑自选股观察名单' or @label='編輯自選股觀察名單']")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/tv_item_more_option_name'])[2]")
	private MobileElement EditCollapse;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/toolbar_back_button']")
	private MobileElement BackButtonExpand;

	@iOSXCUITFindBy(xpath = "//*[@label='Edit watchlist' or @label='Modifier la liste de surveillance' or @label='编辑自选股观察名单' or @label='編輯自選股觀察名單']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/toolbar_title']")
	private MobileElement EditWLTitle;

	@iOSXCUITFindBy(xpath = "//*[@label='Cancel' or @label='Annuler' or @label='致电' or @label='致電']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/watchlist_edit_button']")
	private MobileElement EditWLCancel;

	@iOSXCUITFindBy(xpath = "//*[@label='Delete All' or @label='Supprimer tout' or @label='删除全部' or @label='刪除全部']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/delete_all']")
	private MobileElement EditWLDeleteAll;

	@iOSXCUITFindBy(xpath = "//*[@label='Delete' or @label='Supprimer' or @label='删除' or @label='删除']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/delete_selected']")
	private MobileElement EditWLDelete;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/toolbar_back_button']")
	private MobileElement EditWLBckBtn;

	@iOSXCUITFindBy(xpath = "//*[@label='Enter name or symbol' or contains(@label,'Entrez le')]")
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;

	@iOSXCUITFindBy(xpath = "(//*[@name='codeSearchButton'])[1]")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.td:id/img_added_in_watchlist'])[1]")
	private MobileElement AddWatchlistButton;

	@iOSXCUITFindBy(xpath = "//*[@label='Clear text' or contains(@label,'Entrez le')]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/btn_clear_search_text']")
	private MobileElement btnClear;

	@iOSXCUITFindBy(accessibility = "Button_0")
	@AndroidFindBy(id = "com.td:id/btn_cancel")
	private MobileElement BT_CancelHome;

	/*
	 * @iOSXCUITFindBy(xpath =
	 * "(//XCUIElementTypeStaticText[@label='List 01' or @label='Liste 01' or @label='名单 01' or @label='名單 01'])[1]"
	 * )
	 * 
	 * @AndroidFindBy(xpath =
	 * "//android.widget.TextView[@resource-id='com.td:id/watchlist_name' and (@text='List 01' or @text='Liste 01' or @text='名单 01' or @text='名單 01')]"
	 * ) private MobileElement ListViewExpand01;
	 */

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@label,'01'))[1]")
	@AndroidFindBy(xpath = "//*[contains(@text,'01')]")
	private MobileElement ListViewExpand01;

	@iOSXCUITFindBy(xpath = "(//*[@name='codeSearchButton'])[1]")
	@AndroidFindBy(xpath = "(//android.widget.CheckBox[@resource-id='com.td:id/checkbox_item_watchlist_selected'])[1]")
	private MobileElement SymblchckBox;

	@iOSXCUITFindBy(xpath = "//*[@label='Are you sure you want to delete all of the symbols?' or @label='Voulez-vous vraiment supprimer tous les symboles?' or @label='您确定要删除所有代号？' or @label='確定要刪除全部代號？']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement warningMsg;

	@iOSXCUITFindBy(accessibility = "alert_ok_button")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement okButton;

	@iOSXCUITFindBy(accessibility = "WatchListWidgetOverlayViewAction")
	@AndroidFindBy(id = "com.td:id/watchlist_empty_card_secondmessage")
	private MobileElement LinkEmptyWLAddSymbol;

	public void verifyUIEditWL() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			mobileAction.FuncClick(BT_MoreOptions, "BT_MoreOptions");

			mobileAction.FuncClick(EditCollapse, "EditCollapse");

			mobileAction.FuncVerifyTextEquals(EditWLTitle, getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EDITWL));

			mobileAction.verifyElementIsDisplayed(EditWLCancel, "EditWLCancel");

			mobileAction.FuncVerifyTextEquals(EditWLDeleteAll,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EDITWLDELETEALL));

			mobileAction.FuncVerifyTextEquals(EditWLDelete,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EDITWLDELETE));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyBackButtonEditWL() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			mobileAction.FuncClick(BT_MoreOptions, "BT_MoreOptions");

			mobileAction.FuncClick(EditCollapse, "Edit watchlist");
			mobileAction.verifyElementIsDisplayed(EditWLBckBtn, "EditWLBckBtn");
			mobileAction.FuncClick(EditWLBckBtn, "EditWLBckBtn");

			mobileAction.verifyElementIsDisplayed(btnMore, "btnMore");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyCancelButtonEditWL() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			mobileAction.FuncClick(BT_MoreOptions, "BT_MoreOptions");

			mobileAction.FuncClick(EditCollapse, "EditCollapse");

			mobileAction.verifyElementIsDisplayed(EditWLCancel, "EditWLCancel");

			mobileAction.FuncClick(EditWLCancel, "EditWLCancel");

			mobileAction.verifyElementIsDisplayed(btnMore, "btnMore");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyDeleteButtonEditWL() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			String sSymbol = getTestdata("Symbol", "UserIDs").split(":")[0];

			MIT_DSH_UpdateSearchPage.get().enterSymbol(search_symbol, sSymbol);

			mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");
			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");

			mobileAction.FuncClick(btnClear, "btnClear");

			String sSymbol1 = getTestdata("Symbol", "UserIDs").split(":")[1];

			MIT_DSH_UpdateSearchPage.get().enterSymbol(search_symbol, sSymbol1);

			mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");
			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");
			mobileAction.FuncClick(BT_CancelHome, "BT_CancelHome");

			mobileAction.FuncClick(BT_MoreOptions, "BT_MoreOptions");

			mobileAction.FuncClick(EditCollapse, "EditCollapse");
			mobileAction.FuncClick(SymblchckBox, "SymblchckBox");

			mobileAction.FuncClick(EditWLDelete, "EditWLDelete");

			mobileAction.FuncClick(EditWLBckBtn, "EditWLBckBtn");

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncSwipeWhileElementNotFound(btnMore, false, 4, "up");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyDeleteAllButtonEditWL() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			String sSymbol = getTestdata("Symbol", "UserIDs").split(":")[0];

			MIT_DSH_UpdateSearchPage.get().enterSymbol(search_symbol, sSymbol);

			mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");

			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");

			mobileAction.FuncClick(btnClear, "btnClear");

			String sSymbol1 = getTestdata("Symbol", "UserIDs").split(":")[1];

			MIT_DSH_UpdateSearchPage.get().enterSymbol(search_symbol, sSymbol1);

			mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");
			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");
			mobileAction.FuncClick(BT_CancelHome, "BT_CancelHome");

			mobileAction.FuncClick(BT_MoreOptions, "BT_MoreOptions");

			mobileAction.FuncClick(EditCollapse, "EditCollapse");

			mobileAction.FuncClick(EditWLDeleteAll, "EditWLDeleteAll");

			mobileAction.verifyElementIsDisplayed(warningMsg, "warningMsg");

			mobileAction.FuncVerifyTextEquals(warningMsg,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EDITWLWARNINGMESSAGE));

			mobileAction.FuncClick(okButton, "okButton");

			mobileAction.verifyElementIsDisplayed(LinkEmptyWLAddSymbol, "LinkEmptyWLAddSymbol");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
