package com.td.test.CDNMobile.pages;

import java.util.List;
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

public class MIT_DSHWLPopulateData extends _CommonPage {
	private static MIT_DSHWLPopulateData MIT_DSHWLPopulateData;

	public synchronized static MIT_DSHWLPopulateData get() {
		if (MIT_DSHWLPopulateData == null) {
			MIT_DSHWLPopulateData = new MIT_DSHWLPopulateData();
		}
		return MIT_DSHWLPopulateData;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSXCUITFindBy(xpath = "//*[@name='actionSheetCancelButton']/../../XCUIElementTypeCell/*[1]")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/watchlist_name']")
	private List<MobileElement> LST_WLStocksETFs;

	// String xpathWLSymbol = "//*[" + sSymbol + "";

	@iOSXCUITFindBy(xpath = "xpathWLSymbol")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/nav_row_left_icon']/following-sibling::*/*[@resource-id='com.td:id/nav_row_title']")
	private MobileElement LBL_WLSymbol;

	@iOSFindBy(xpath = "//*[@label='More' or @label='LISTES DE SURVEILLANCE' or @label='自选股观察名单' or @label='自選股觀察名單']")
	@AndroidFindBy(xpath = "//*[@text='More' or @text='LISTES DE SURVEILLANCE' or @text='自选股观察名单' or @text='自選股觀察名單']")
	private MobileElement BT_More;

	@iOSFindBy(xpath = "//*[@label='WATCHLISTS' or @label='LISTES DE SURVEILLANCE' or @label='自选股观察名单' or @label='自選股觀察名單']")
	@AndroidFindBy(xpath = "//*[@text='WATCHLISTS' or @text='LISTES DE SURVEILLANCE' or @text='自选股观察名单' or @text='自選股觀察名單']")
	private MobileElement QL_WATCHLISTS;

	@iOSXCUITFindBy(accessibility = "accountNumberLabel")
	@AndroidFindBy(id = "com.td:id/nav_row_right_icon")
	private MobileElement VAL_AccountNumber;

	@iOSXCUITFindBy(xpath = "//*[@name='SELECT_ORDER_TYPE_0']/*[@name='valueLeftLabel']")
	@AndroidFindBy(id = "com.td:id/nav_row_right_icon")
	private MobileElement VAL_OrderType;

	@iOSXCUITFindBy(accessibility = "tradingSymbol")
	@AndroidFindBy(id = "com.td:id/nav_row_right_icon")
	private MobileElement VAL_TradingSymbol;

	@iOSXCUITFindBy(xpath = "//*[@name='ACTION_CELL_1']/*[@name='valueLeftLabel']")
	@AndroidFindBy(id = "com.td:id/nav_row_right_icon")
	private MobileElement VAL_Action;

	@iOSXCUITFindBy(xpath = "//*[@name='PRICE_ACTION_CELL_1']/*[@name='valueLeftLabel']")
	@AndroidFindBy(id = "com.td:id/nav_row_right_icon")
	private MobileElement VAL_Price;

	@iOSXCUITFindBy(xpath = "//*[@name='GOOD_TIL_CELL_2']/*[@name='valueLeftLabel']")
	@AndroidFindBy(id = "com.td:id/nav_row_right_icon")
	private MobileElement VAL_GoodTill;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSXCUITFindBy(accessibility = "alert_ok_button")
	@AndroidFindBy(id = "com.td:id/nav_row_right_icon")
	private MobileElement BT_AlertAgree;

	/*
	 * public void test() { String device = (String) ((AppiumDriver)
	 * CL.GetDriver()).getCapabilities().getCapability("deviceName");
	 * 
	 * }
	 */

	public void verifyStockETFsWLSymbolRow() {
		Decorator();
		try {
			String sSymbol = getTestdata("Symbol", XLSheetUserIDs);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				MIT_DSHQuickLinks.get().clickQuickLink(QL_WATCHLISTS, "WATCHLISTS");
			} else {
				mobileAction.FuncClick(BT_More, "More Button");
			}
			clickWLSymbolBuyButton(sSymbol);

			verifyStockOrderEntryScreen(sSymbol, "Buy");

			mobileAction.FuncClick(BT_Back, "< Button");

			mobileAction.FuncClick(BT_AlertAgree, "Agree Button");

			selectWLSymbol(sSymbol);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectWLSymbol(String sSymbol) {
		Decorator();
		try {

			String xpathWLSymbol = "//*[@label='" + sSymbol + "']";
			mobileAction.FuncClick(mobileAction.mobileElementUsingXPath(xpathWLSymbol), sSymbol);
			Thread.sleep(10000);
			if (!CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncVerifyTextEquals(mobileAction.mobileElementUsingXPath(xpathWLSymbol), sSymbol);
			} else {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickWLSymbolBuyButton(String sSymbol) {
		Decorator();
		try {

			String xpathWLSymbolBuyButton = "(//*[@label='" + sSymbol + "']/../../following-sibling::*/*[1]/*[@label='"
					+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY) + "'])[1]";
			mobileAction.FuncClick(mobileAction.mobileElementUsingXPath(xpathWLSymbolBuyButton), "Buy Button");
			// Thread.sleep(15000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStockOrderEntryScreen(String sSymbol, String sAction) {
		Decorator();
		try {
			mobileAction.FuncVerifyNonBlankValue(VAL_AccountNumber, "Account Number");

			mobileAction.FuncVerifyTextEquals(VAL_OrderType,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_STOCKETFs));

			mobileAction.FuncVerifyTextEquals(VAL_TradingSymbol, sSymbol);

			mobileAction.FuncSwipeWhileElementNotFound(VAL_Action, false, 4, "up");
			if (sAction.equalsIgnoreCase("Buy"))
				mobileAction.FuncVerifyTextEquals(VAL_Action,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY));
			else
				mobileAction.FuncVerifyTextEquals(VAL_Action,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL));

			mobileAction.FuncSwipeWhileElementNotFound(VAL_Price, false, 4, "up");
			mobileAction.FuncVerifyTextEquals(VAL_Price,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_PRICEMARKET));

			mobileAction.FuncSwipeWhileElementNotFound(VAL_GoodTill, false, 4, "up");
			mobileAction.FuncVerifyTextEquals(VAL_GoodTill,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_GOODTILLDAY));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
