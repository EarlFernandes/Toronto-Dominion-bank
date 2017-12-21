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

public class MIT_DSH_WLErrorState2 extends _CommonPage {

	private static MIT_DSH_WLErrorState2 MIT_DSH_WLErrorState2;

	public synchronized static MIT_DSH_WLErrorState2 get() {
		if (MIT_DSH_WLErrorState2 == null) {
			MIT_DSH_WLErrorState2 = new MIT_DSH_WLErrorState2();
		}
		return MIT_DSH_WLErrorState2;

	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSFindBy(xpath = "//*[@label='TRADE' or @label='NÉGOCIATION' or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[(@text='TRADE' or @text='NÉGOCIATION' or @text='交易' or @text='交易') and @resource-id='com.td:id/text_view']")
	private MobileElement QL_TRADE;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='icon_lrg_legal']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/img_alert']")
	private MobileElement TandCicon;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='icon_lrg_legal']/../XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message2']")
	private MobileElement TandCMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='icon_lrg_legal']/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message3']")
	private MobileElement TandCTDApp;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='icon_lrg_legal']/../XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_postpone']")
	private MobileElement CTAbutton;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSXCUITFindBy(accessibility = "expandButton")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_more_footer")
	private MobileElement btnMore;

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

	@iOSXCUITFindBy(accessibility = "WatchListWidgetOverlayViewMessage")
	@AndroidFindBy(id = "com.td:id/watchlist_empty_card_firstmessage")
	private MobileElement EmptyWLDesc;

	public void verifyWLErrorWBTCNotSigned() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			// mobileAction.verifyElementIsDisplayed(EmptyWLDesc,"EmptyWLDesc");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				mobileAction.FuncSwipeWhileElementNotFound(btnMore, true, 3, "up");
			}

			mobileAction.verifyElementIsDisplayed(TandCicon, "TandCicon");

			mobileAction.FuncVerifyTextEquals(TandCMsg, getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_WLERRORMSG));

			mobileAction.FuncVerifyTextEquals(TandCTDApp,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_WLERRORTC));
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(CTAbutton, "CTAbutton");

				mobileAction.FuncClick(BT_Back, "BT_Back");
			}

			mobileAction.FuncClick(QL_TRADE, "QL_TRADE");

			mobileAction.verifyElementIsDisplayed(TandCicon, "TandCicon");

			mobileAction.FuncVerifyTextEquals(TandCMsg, getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_WLERRORMSG));

			mobileAction.FuncVerifyTextEquals(TandCTDApp,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_WLERRORTC));

			mobileAction.verifyElementIsDisplayed(CTAbutton, "CTAbutton");

			mobileAction.FuncClick(BT_Back, "BT_Back");

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(TandCicon, "TandCicon");

			mobileAction.FuncVerifyTextEquals(TandCMsg, getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_WLERRORMSG));

			mobileAction.FuncVerifyTextEquals(TandCTDApp,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_WLERRORTC));

			mobileAction.verifyElementIsDisplayed(CTAbutton, "CTAbutton");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
