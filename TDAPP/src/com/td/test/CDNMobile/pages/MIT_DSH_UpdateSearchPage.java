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

import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSH_UpdateSearchPage extends _CommonPage {

	private static MIT_DSH_UpdateSearchPage MIT_DSH_UpdateSearchPage;

	public synchronized static MIT_DSH_UpdateSearchPage get() {
		if (MIT_DSH_UpdateSearchPage == null) {
			MIT_DSH_UpdateSearchPage = new MIT_DSH_UpdateSearchPage();
		}
		return MIT_DSH_UpdateSearchPage;

	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSFindBy(accessibility = "SearchBarWidget")

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Search or add symbols' or @text='Rechercher ou ajouter des symboles' or @text='搜索或添加股票代码' or @text='搜尋或添加股票代號']")
	private MobileElement searchBar;

	@iOSFindBy(xpath = "//*[@label='Enter name or symbol' or contains(@label,'Entrez le')]")
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;

	@iOSFindBy(xpath = "//*[@label='Symbol then month or strike' or contains(@label,'Entrez le')]")
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol_option;

	String xpathSymbolFlag = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and (@content-desc='U S' or @content-desc='CAD' or @content-desc='CAN' or @content-desc='CA' or @content-desc='C A' or @content-desc='加拿大' or @content-desc='美国' or @content-desc='加拿大' or @content-desc='美國')]";

	String xpathSymbolFlag_ios = "//XCUIElementTypeCell[contains(@label,'US') or contains(@label,'U S') or contains(@label,'CAD') or contains(@label,'CAN') or contains(@label,'CA')  or contains(@label,'C A') or contains(@label,'加拿大') or contains(@label,'美国') or contains(@label,'加拿大') or contains(@label,'美國')]";

	@iOSFindBy(xpath = "//*[@name='CodeSearchHeaderCellTitleLabel']/../following-sibling::XCUIElementTypeCell[1]/*[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'The symbol you entered is not valid') or contains(@text,'Le symbole entr? nest pas valide; veuillez lentrer')]")
	private MobileElement info;

	@iOSFindBy(xpath = "//*[@label='RESULTS' or @label='RÉSULTATS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@resource-id='com.td:id/classificationTexView' or @resource-id='com.td:id/txt_results') and (@text='RESULTS' or @text='RÉSULTATS' or @text='结果' or @text='結果')]")
	private MobileElement hdrRESULTS;

	@iOSFindBy(xpath = "//*[@label='Watchlist Button' or contains(@label,'Entrez le')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement WatchlistButton;

	@iOSFindBy(xpath = "(//*[@name='codeSearchButton'])[1]")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.td:id/img_added_in_watchlist'])[1]")
	private MobileElement AddWatchlistButton;

	@iOSXCUITFindBy(accessibility = "actionSheetCancelButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button']")
	private MobileElement CancelButton;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSFindBy(xpath = "//*[@label='banner' or contains(@label,'Entrez le')]/*[1]")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back1;

	@iOSFindBy(xpath = "//*[@label='RECENT SEARCHES' or @label='RÉSULTATS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and (@text='RECENT SEARCHES' or @text='RECHERCHES RÉCENTES' or @text='最近的搜索' or @text='最近的搜尋')]")
	private MobileElement hdrRECENT;

	@iOSFindBy(xpath = "//*[@label='Clear text' or contains(@label,'Entrez le')]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/btn_clear_search_text']")
	private MobileElement btnClear;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Indices' or contains(@label,'Entrez le')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Indices']")
	private MobileElement btnIndices;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Mutual Funds' or contains(@label,'Entrez le')]")
	// @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mutual ?
	// Funds']")
	@AndroidFindBy(id = "com.td:id/txt_tradeMutualFund")
	private MobileElement btnMF;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Options' or contains(@label,'Entrez le')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Options']")
	private MobileElement btnOption;

	@iOSFindBy(xpath = "//*[@label='Watchlist Button' or contains(@label,'Entrez le')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement symHeader;

	@iOSFindBy(xpath = "//*[@label='ADD TO OR REMOVE FROM WATCHLIST' or @label='RÉSULTATS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/dialog_title' and (@text='Add to or remove from watchlist' or @text='Ajouter ou supprimer de la liste de surveillance' or @text='添加至自选股观察名单或从自选股观察名单中移除' or @text='新增至或從自選股觀察名單中移除')]")
	private MobileElement lblAddWatchlist;

	@iOSXCUITFindBy(accessibility = "Button_0")
	@AndroidFindBy(id = "com.td:id/btn_cancel")
	private MobileElement BT_CancelHome;

	@iOSFindBy(xpath = "//*[@name='QuickLinkLeftNavButton']/following-sibling::XCUIElementTypeImage[1]")
	@AndroidFindBy(id = "com.td:id/logo")
	private MobileElement hdrHome;

	By WatchlistButtonMod = By.xpath("//*[@class='btn btn-default add-to-td-watchlist icon pull-left icon-star']");

	private By BTN_BackMod = By.xpath("//*[@class='sprite sprite-back']");

	public void verifyUpdateSearch() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));

			verifySymbolUSCAD();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyUpdateSearchInvalid() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			mobileAction.FuncClick(search_symbol, "search_symbol");

			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));

			mobileAction.verifyElementIsDisplayed(info, "info on invalid symbol" + info.getText());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyHeaderResult() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));

			verifySymbolUSCAD();

			mobileAction.verifyElementIsDisplayed(hdrRESULTS, "hdrRESULTS");

			mobileAction.FuncClick(btnClear, "btnClear");

			mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");

			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));

			clickFirstSymbolUSCAD(getTestdata("Symbol", "UserIDs"));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(WatchlistButtonMod),
						"WatchlistButtonMod");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			}

			else {

				mobileAction.verifyElementIsDisplayed(WatchlistButton, "WatchlistButton");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNavigateQuoteSummaryIndices() {
		Decorator();

		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.FuncClick(btnIndices, "btnIndices");

			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			// String sStock = aSymbolArray[0];

			for (int i = 0; i < aSymbolArray.length; i++)

			{

				enterSymbol(search_symbol, aSymbolArray[i]);

				clickFirstSymbolUSCAD(aSymbolArray[i]);

				// String sXPath = "//XCUIElementTypeStatictext[@label='" +
				// aSymbolArray[i] + "' or @text='" + aSymbolArray[i] + "']";

				Thread.sleep(4000);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_BackMod), "BTN_BackMod");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				}

				else {

					mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNavigateQuoteSummaryMF() {
		Decorator();

		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.FuncClick(btnMF, "btnMF");

			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			String sXPathios = null;
			String sXPathAnd = null;

			for (int i = 0; i < aSymbolArray.length; i++)

			{

				enterSymbol(search_symbol, aSymbolArray[i]);

				clickOtherSymbolUSCAD(aSymbolArray[i]);

				Thread.sleep(4000);

				sXPathios = "//XCUIElementTypeOther[@label='" + aSymbolArray[i] + "' or @text='" + aSymbolArray[i]
						+ "']/*[1]";

				sXPathAnd = "//*[@class='text-prominent symbol']";

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathAnd, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_BackMod), "BTN_BackMod");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				}

				else

				{
					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathios, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");

					mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");

				}
				clickOtherSymbolUSCAD(aSymbolArray[i]);

				Thread.sleep(4000);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathAnd, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_BackMod), "BTN_BackMod");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				}

				else {

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathios, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNavigateQuoteSummaryETF() {
		Decorator();

		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			String sXPathiOS = null;
			String sXPathAnd = null;

			for (int i = 0; i < aSymbolArray.length; i++)

			{

				enterSymbol(search_symbol, aSymbolArray[i]);

				clickFirstSymbolUSCAD(aSymbolArray[i]);

				Thread.sleep(4000);

				sXPathiOS = "//XCUIElementTypeOther[@label='" + aSymbolArray[i] + "' or @text='" + aSymbolArray[i]
						+ "']/*[1]";
				sXPathAnd = "//*[@class='text-prominent symbol']";

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{

					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathAnd, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_BackMod), "BTN_BackMod");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

					mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");

					clickFirstSymbolUSCAD(aSymbolArray[i]);

					Thread.sleep(4000);

					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathAnd, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_BackMod), "BTN_BackMod");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				}

				else {

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathiOS, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");

					mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");

					clickFirstSymbolUSCAD(aSymbolArray[i]);

					Thread.sleep(4000);

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathiOS, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNavigateQuoteSummaryOption() {
		Decorator();

		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.FuncClick(btnOption, "btnOption");

			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			String sXPathiOS = null;
			String sXPathAnd = null;

			for (int i = 0; i < aSymbolArray.length; i++)

			{
				enterSymbol(search_symbol_option, aSymbolArray[i]);

				clickOtherSymbolUSCAD(aSymbolArray[i]);

				Thread.sleep(4000);

				sXPathiOS = "//XCUIElementTypeOther[@label='" + aSymbolArray[i] + "' or @text='" + aSymbolArray[i]
						+ "']/*[1]";
				sXPathAnd = "//*[@class='text-prominent symbol']";

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{

					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathAnd, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_BackMod), "BTN_BackMod");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				}

				else {

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathiOS, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNavigateQuoteSummaryStocks() {
		Decorator();

		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			String sXPathiOS = null;
			String sXPathAnd = null;

			for (int i = 0; i < aSymbolArray.length; i++)

			{

				enterSymbol(search_symbol, aSymbolArray[i]);

				clickFirstSymbolUSCAD(aSymbolArray[i]);

				Thread.sleep(4000);

				sXPathiOS = "//XCUIElementTypeOther[@label='" + aSymbolArray[i] + "' or @text='" + aSymbolArray[i]
						+ "']/*[1]";
				sXPathAnd = "//*[@class='text-prominent symbol']";

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{

					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathAnd, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_BackMod), "BTN_BackMod");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

					mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");

					clickFirstSymbolUSCAD(aSymbolArray[i]);

					Thread.sleep(4000);

					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathAnd, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_BackMod), "BTN_BackMod");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				}

				else {

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathiOS, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");

					mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");

					clickFirstSymbolUSCAD(aSymbolArray[i]);

					Thread.sleep(4000);

					mobileAction.verifyElementIsDisplayed(
							(mobileAction.verifyElementUsingXPath(sXPathiOS, aSymbolArray[i])), aSymbolArray[i]);

					mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyAddWatchlistIndices() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			mobileAction.FuncClick(btnIndices, "btnIndices");

			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			for (int i = 0; i < aSymbolArray.length; i++)

			{

				enterSymbol(search_symbol, aSymbolArray[i]);

				mobileAction.verifyElementIsDisplayed(hdrRESULTS, "hdrRESULTS");

				mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");

				mobileAction.verifyElementIsDisplayed(lblAddWatchlist, "lblAddWatchlist");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncClick(CancelButton, "CancelButton");

					mobileAction.FuncClick(btnClear, "btnClear");
				}

				else {

					mobileAction.FuncClick(CancelButton, "CancelButton");

					mobileAction.FuncClick(btnClear, "btnClear");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyAddWatchlistMF() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			mobileAction.FuncClick(btnMF, "btnMF");

			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			for (int i = 0; i < aSymbolArray.length; i++)

			{

				enterSymbol(search_symbol, aSymbolArray[i]);

				mobileAction.verifyElementIsDisplayed(hdrRESULTS, "hdrRESULTS");

				mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");

				mobileAction.verifyElementIsDisplayed(lblAddWatchlist, "lblAddWatchlist");

				mobileAction.FuncClick(CancelButton, "CancelButton");

				mobileAction.FuncClick(btnClear, "btnClear");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyAddWatchlistStocksETF() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			for (int i = 0; i < aSymbolArray.length; i++)

			{

				enterSymbol(search_symbol, aSymbolArray[i]);

				mobileAction.verifyElementIsDisplayed(hdrRESULTS, "hdrRESULTS");

				mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");

				mobileAction.verifyElementIsDisplayed(lblAddWatchlist, "lblAddWatchlist");

				mobileAction.FuncClick(CancelButton, "CancelButton");

				mobileAction.FuncClick(btnClear, "btnClear");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNavigateUnAuthenticated() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			mobileAction.verifyElementIsDisplayed(BT_CancelHome, "BT_CancelHome");

			mobileAction.verifyElementIsDisplayed(btnMF, "btnMF");
			mobileAction.verifyElementIsDisplayed(btnOption, "btnOption");

			mobileAction.verifyElementIsDisplayed(btnIndices, "btnIndices");

			mobileAction.FuncClick(BT_CancelHome, "BT_CancelHome");

			mobileAction.verifyElementIsDisplayed(hdrHome, "hdrHome");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyAddWatchlistOption() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");

			mobileAction.FuncClick(btnOption, "btnOption");

			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			for (int i = 0; i < aSymbolArray.length; i++)

			{

				enterSymbol(search_symbol_option, aSymbolArray[i]);

				mobileAction.verifyElementIsDisplayed(hdrRESULTS, "hdrRESULTS");

				mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");

				mobileAction.verifyElementIsDisplayed(lblAddWatchlist, "lblAddWatchlist");

				mobileAction.FuncClick(CancelButton, "CancelButton");

				mobileAction.FuncClick(btnClear, "btnClear");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifySymbolUSCAD() throws Exception {

		Decorator();
		int i, temp;
		String sSymbolName = "";
		String property = "";
		try {

			String xpathFlag = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				xpathFlag = xpathSymbolFlag;
				temp = 0;
				if (CL.getTestDataInstance().getMobilePlatFormVersion().contains("7"))
					property = "contentDescription";
				else
					property = "name";
			} else {
				xpathFlag = xpathSymbolFlag_ios;
				temp = 0;

				property = "label";

			}

			List<MobileElement> listItem = (List<MobileElement>) (CL.GetAppiumDriver())
					.findElements(By.xpath(xpathFlag));

			for (i = temp; i < listItem.size(); i++) {
				if (listItem.get(i).getAttribute(property).contains("U S")
						|| listItem.get(i).getAttribute(property).contains("C A")
						|| listItem.get(i).getAttribute(property).contains("C A N")
						|| listItem.get(i).getAttribute(property).contains("加拿大")
						|| listItem.get(i).getAttribute(property).contains("美国")
						|| listItem.get(i).getAttribute(property).contains("加拿大")
						|| listItem.get(i).getAttribute(property).contains("美國"))

				{
					sSymbolName = CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']"))
							.get(i).getText();
					CL.GetReporting().FuncReport("Pass", "Option found in search list. Item :" + sSymbolName);
				} else if (listItem.get(i).getAttribute("name").contains("US")
						|| listItem.get(i).getAttribute("name").contains("CA")
						|| listItem.get(i).getAttribute("name").contains("CAN")
						|| listItem.get(i).getAttribute("name").contains("加拿大")
						|| listItem.get(i).getAttribute("name").contains("美国")
						|| listItem.get(i).getAttribute("name").contains("加拿大")
						|| listItem.get(i).getAttribute("name").contains("美國")) {

					CL.GetReporting().FuncReport("Pass",
							"Option found in search list. Item :" + listItem.get(i).getAttribute("name"));
				} else
					CL.GetReporting().FuncReport("Fail", "Incorrect option found in search list.");
			}

		} catch (Exception e) {
			CL.GetReporting().FuncReport("Fail", "Incorrect option found in search list.");
			e.printStackTrace();
		}
	}

	public void clickFirstSymbolUSCAD(String sSymbol) {
		Decorator();
		try {
			String xpathFlag = "";
			int temp = 0;

			boolean bFound = false;
			String sProperty = "";
			String sSymbolName = "";
			boolean bSymbolText = false;

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				xpathFlag = xpathSymbolFlag;
				sProperty = "text";

				try {
					CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
					CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
				} catch (Exception e) {
					e.printStackTrace();
					CL.GetReporting().FuncReport("Fail", "Symbol <b> " + sSymbol + "</b> not Clicked.");
				}
			} else {
				xpathFlag = xpathSymbolFlag_ios;

				sProperty = "label";
				do {
					try {

						if (CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).isDisplayed()
								&& CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).getAttribute(sProperty)
										.contains(sSymbol)) {
							bFound = true;
							CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
							CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
						} else
							temp++;
					} catch (Exception e) {

						temp++;
					}
				} while (!bFound && temp < CL.GetDriver().findElements(By.xpath(xpathFlag)).size());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOtherSymbolUSCAD(String sSymbol) {
		Decorator();
		try {
			String xpathFlag = "";
			int temp = 0;
			boolean bFound = false;
			String sProperty = "";
			String sSymbolName = "";
			boolean bSymbolText = false;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				xpathFlag = "//android.widget.TextView[@resource-id='com.td:id/market_name' and (@content-desc='"
						+ sSymbol + "' or contains(@text,'" + sSymbol + "'))]";

				sProperty = "text";

				try {
					CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
					CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
				} catch (Exception e) {
					e.printStackTrace();
					CL.GetReporting().FuncReport("Fail", "Symbol <b> " + sSymbol + "</b> not Clicked.");
				}
			} else {

				xpathFlag = "//XCUIElementTypeCell[contains(@label,'" + sSymbol + "') or contains(@text,'" + sSymbol
						+ "')]";

				sProperty = "label";
				do {
					try {

						if (CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).isDisplayed()
								&& CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).getAttribute(sProperty)
										.contains(sSymbol)) {
							bFound = true;
							CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
							CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
						} else
							temp++;
					} catch (Exception e) {

						temp++;
					}
				} while (!bFound && temp < CL.GetDriver().findElements(By.xpath(xpathFlag)).size());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSymbol(MobileElement mEle, String symbol) {
		try {

			if (CL.getTestDataInstance().getMobilePlatFormVersion().contains("6")
					|| CL.getTestDataInstance().getMobilePlatFormVersion().contains("7")) {
				mobileAction.FuncSendKeys(mEle, symbol + " ");
			} else {
				mobileAction.FuncSendKeys(mEle, symbol + " ");
				((RemoteWebDriver) CL.GetDriver()).getKeyboard().pressKey(Keys.BACK_SPACE);
			}

			TradeMultiLeg.get().handleKeyboard();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				CL.GetReporting().FuncReport("Fail", "Symbol not entered.");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
