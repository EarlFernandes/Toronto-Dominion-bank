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

	@iOSXCUITFindBy(accessibility = "QuickLinkRightNavButton")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_name_header")
	private MobileElement LT_Watchlist;

	@iOSXCUITFindBy(accessibility = "QuickLinkRightNavButton")
	@AndroidFindBy(id = "com.td:id/iv_watchlist_dot_header")
	private MobileElement BT_MoreOptions;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_more_footer")
	private MobileElement BT_More;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/iv_item_more_option'])[1]")
	private MobileElement BT_Refresh;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_name'])[1]")
	private MobileElement LBL_RefreshCardContent;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_desp'])[1]")
	private MobileElement LBL_UpdateQuotes;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/iv_item_more_option'])[2]")
	private MobileElement BT_EditWatchlist;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_name'])[2]")
	private MobileElement LBL_EditWatchlist;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_desp'])[2]")
	private MobileElement LBL_ManageRename;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/iv_item_more_option'])[2]")
	private MobileElement BT_Settings;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_name'])[2]")
	private MobileElement LBL_Settings;

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(xpath = "(//*[@resource-id='com.td:id/tv_item_more_option_desp'])[2]")
	private MobileElement LBL_SwitchBetween;

	@iOSXCUITFindBy(xpath = "//*[@label='Edit watchlist' or @label='Modifier la liste de surveillance' or @label='编辑自选股观察名单' or @label='編輯自選股觀察名單']")
	@AndroidFindBy(xpath = "//*[@text='Edit watchlist' or @text='Modifier la liste de surveillance' or @text='编辑自选股观察名单' or @text='編輯自選股觀察名單']")
	private MobileElement HDR_EditWatchlist;
	
	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;
	
	@iOSFindBy(xpath = "//*[@label='Home Screen Settings' or @label='Paramètres de l’écran d’accueil' or @label='主屏幕设置' or @label='主屏幕設置']")
	@AndroidFindBy(xpath = "//*[@text='Home Screen Settings' or @text='Paramètres de l’écran d’accueil' or @text='主屏幕设置' or @text='主屏幕設置']")
	private MobileElement LBL_HomeScreenSettings;

	public void verifyWLCollapsedViewUI() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(LT_Watchlist, "Watchlist Dropdown");
			mobileAction.verifyElementIsDisplayed(BT_MoreOptions, "More Options button");

			mobileAction.FuncSwipeOnce("up");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (CL.GetAppiumDriver().findElements(By.id("com.td:id/tv_item_watchlist_name")).size() <= 3) {
					CL.GetReporting().FuncReport(PASS, "Max 3 symbols are displayed in watchlist collapsed view.");
				} else
					CL.GetReporting().FuncReport(FAIL, "Max 3 symbols are allowed in watchlist collapsed view.");

			} else {

			}

			mobileAction.verifyElementIsDisplayed(BT_More, "More button");

			mobileAction.FuncClick(BT_MoreOptions, "More Options button");

			mobileAction.FuncVerifyTextEquals(LBL_RefreshCardContent,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_REFRESHCARDCONTENT));

			mobileAction.FuncVerifyTextEquals(LBL_UpdateQuotes,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_UPDATEQUOTES));

			mobileAction.FuncVerifyTextEquals(LBL_RefreshCardContent,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_REFRESHCARDCONTENT));

			mobileAction.FuncVerifyTextEquals(LBL_EditWatchlist,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EDITWATCHLIST));

			mobileAction.FuncVerifyTextEquals(LBL_ManageRename,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_MANAGERENAME));
			mobileAction.FuncVerifyTextEquals(LBL_Settings,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SETTINGS));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWLMoreOptions() {
		Decorator();
		try {
			mobileAction.FuncClick(BT_MoreOptions, "More Options button");

			mobileAction.FuncClick(BT_Refresh, "More Options button");

			mobileAction.FuncClick(BT_MoreOptions, "More Options button");

			mobileAction.FuncClick(BT_EditWatchlist, "More Options button");
			
			mobileAction.FuncVerifyTextEquals(LBL_EditWatchlist,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EDITWATCHLIST));
			
			mobileAction.FuncClick(BT_Back, "< Button");
			
			mobileAction.FuncClick(BT_Back, "< Button");
			
			mobileAction.FuncClick(BT_MoreOptions, "More Options button");

			mobileAction.FuncClick(BT_Settings, "More Options button");
			
			mobileAction.FuncVerifyTextEquals(LBL_HomeScreenSettings,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_HOMESCREENSETTINGS));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
