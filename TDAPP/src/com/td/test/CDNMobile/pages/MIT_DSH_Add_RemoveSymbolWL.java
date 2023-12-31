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

public class MIT_DSH_Add_RemoveSymbolWL extends _CommonPage {

	private static MIT_DSH_Add_RemoveSymbolWL MIT_DSH_Add_RemoveSymbolWL;

	public synchronized static MIT_DSH_Add_RemoveSymbolWL get() {
		if (MIT_DSH_Add_RemoveSymbolWL == null) {
			MIT_DSH_Add_RemoveSymbolWL = new MIT_DSH_Add_RemoveSymbolWL();
		}
		return MIT_DSH_Add_RemoveSymbolWL;

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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@label='Search or add symbols' or contains(@label,'des symboles') or @label='搜索或添加股票代码' or @label='搜尋或添加股票代號']")
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;

	@iOSXCUITFindBy(xpath = "//*[@label='Watchlist Button' or contains(@label,'Entrez le')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement WatchlistButton;

	@iOSXCUITFindBy(xpath = "//*[@label='Watchlist Button' or contains(@label,'Entrez le')]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/btn_watchlist']")
	private MobileElement WatchlistButtonHoldings;

	@iOSXCUITFindBy(xpath = "//*[@label='ADD TO OR REMOVE FROM WATCHLIST' or @label='AJOUTER OU SUPPRIMER DE LA LISTE DE SURVEILLANCE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/dialog_title' and (@text='Add to or remove from watchlist' or @text='Ajouter ou supprimer de la liste de surveillance' or @text='添加至自选股观察名单或从自选股观察名单中移除' or @text='新增至或從自選股觀察名單中移除')]")
	private MobileElement lblAddWatchlist;

	/*
	 * @iOSXCUITFindBy(xpath =
	 * "(//XCUIElementTypeStaticText[@label='List 03' or @label='Liste 03' or @label='名单 03' or @label='名單 03'])[1]"
	 * )
	 * 
	 * @AndroidFindBy(xpath =
	 * "//android.widget.TextView[@resource-id='com.td:id/watchlist_name' and (@text='List 03' or @text='Liste 03' or @text='名单 03' or @text='名單 03')]"
	 * ) private MobileElement ListViewExpand03;
	 */

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@label,'03')])[1]")
	@AndroidFindBy(xpath = "//*[contains(@text,'03')]")
	private MobileElement ListViewExpand03;

	/*
	 * @iOSXCUITFindBy(xpath =
	 * "(//XCUIElementTypeStaticText[@label='List 01' or @label='Liste 01' or @label='名单 01' or @label='名單 01'])[1]"
	 * )
	 * 
	 * @AndroidFindBy(xpath =
	 * "//android.widget.TextView[@resource-id='com.td:id/watchlist_name' and (@text='List 01' or @text='Liste 01' or @text='名单 01' or @text='名單 01')]"
	 * ) private MobileElement ListViewExpand01;
	 */

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[contains(@label,'01')])[1]")
	@AndroidFindBy(xpath = "//*[contains(@text,'01')]")
	private MobileElement ListViewExpand01;

	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;

	@iOSXCUITFindBy(xpath = "//*[@label='My Accounts' or @label='Mes comptes' or @label='我的账户' or @label='我的賬戶']")
	@AndroidFindBy(xpath = "//*[@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶']")
	private MobileElement flyoutMyAccountLink;

	@iOSXCUITFindBy(xpath = " //*[contains(@label,'ACCOUNTS') or contains(@label,'COMPTES')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView']")
	private MobileElement defaultTradeAccount;

	String accNumber = getTestdata("Accounts", "UserIDs").trim();

	String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Holdings' or @label='Avoirs' or @label='持有投资' or @label='持有投資']")
	@AndroidFindBy(id = "com.td:id/holdingsTab")
	private MobileElement holdingsTab;

	@iOSXCUITFindBy(xpath = "(//*[@name='codeSearchButton'])[1]")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.td:id/img_added_in_watchlist'])[1]")
	private MobileElement AddWatchlistButton;

	By WatchlistButtonMod = By.xpath("//*[@class='btn btn-default add-to-td-watchlist icon pull-left icon-star']");

	/*
	 * @iOSXCUITFindBy(xpath =
	 * "(//XCUIElementTypeImage[@name='actionsheet_checkmark'])[1]")
	 * 
	 * @AndroidFindBy(xpath =
	 * "(//android.widget.ImageView[@resource-id='com.td:id/watchlist_selected_image_view'])[1]")
	 * private MobileElement checkMark;
	 */

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='actionsheet_checkmark'])[1]")
	@AndroidFindBy(xpath = "//*[contains(@text,'01')]/../android.widget.ImageView[@resource-id='com.td:id/imgActionCheckMark']")
	private MobileElement checkMark;

	public void verifyActionSheetUIMOD() {
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

			if (mobileAction.isObjExists(searchBar, 2)) {
				mobileAction.FuncClick(searchBar, "searchBar");

			} else

			{

				mobileAction.FuncSwipeWhileElementNotFound(searchBar, true, 7, "up");

			}

			MIT_DSH_UpdateSearchPage.get().enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));

			MIT_DSH_UpdateSearchPage.get().clickFirstSymbolUSCAD(getTestdata("Symbol", "UserIDs"));

			Thread.sleep(500);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(WatchlistButtonMod),
						"WatchlistButtonMod");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				mobileAction.FuncVerifyTextEquals(lblAddWatchlist,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ADDTOWATCHLISTAND));

			}

			else {

				mobileAction.FuncClick(WatchlistButton, "WatchlistButton");

				mobileAction.FuncVerifyTextEquals(lblAddWatchlist,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ADDTOWATCHLIST));

			}

			for (int i = 1; i <= 10; i++)

			{
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					String sXpathiAnd = "(//android.widget.TextView[@resource-id='com.td:id/txtWatchlistName' and contains(@text,'"
							+ i + "')])[i]";

					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiAnd, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiAnd)),
							"List Number is Displayed " + i);

					//String sXpathiAndSymbolNumber = "(//android.widget.TextView[@resource-id='com.td:id/txtWatchlistCount' and (contains(@text,'symbols') or contains(@text,'symbole') or contains(@text,'/'))])[1]";
					String sXpathiAndSymbolNumber = "(//android.widget.TextView[@resource-id='com.td:id/txtWatchlistCount' and (contains(@text,'symbols') or contains(@text,'symbole') or contains(@text,'symboles') or contains(@text,'/'))])[i]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiAndSymbolNumber, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiAndSymbolNumber)),
							"Symbol number for list displayed " + i);

				}

				else {

					String sXpathiOS = "(//XCUIElementTypeStaticText[contains(@label,'" + i + "')])[i]";

					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiOS, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiOS)),
							"List Number is Displayed" + i);

					//String sXpathiOSSymbolNumber = "(//XCUIElementTypeStaticText[contains(@label,'" + i + "')])[2]";
					String sXpathiOSSymbolNumber = "(//XCUIElementTypeStaticText[contains(@label,'symbols') or contains(@label,'symbole') or contains(@label,'symboles') or contains(@label,'/')])[i]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiOSSymbolNumber, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiOSSymbolNumber)),
							"Symbol number for list displayed" + i);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyCheckMarkMOD() {
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

			MIT_DSH_UpdateSearchPage.get().enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));

			MIT_DSH_UpdateSearchPage.get().clickFirstSymbolUSCAD(getTestdata("Symbol", "UserIDs"));

			Thread.sleep(5000);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(WatchlistButtonMod),
						"WatchlistButtonMod");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			}

			else {

				mobileAction.FuncClick(WatchlistButton, "WatchlistButton");

			}

			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(WatchlistButtonMod),
						"WatchlistButtonMod");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			}

			else {

				mobileAction.FuncClick(WatchlistButton, "WatchlistButton");

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkMark.getAttribute("enabled").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is selected : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not selected : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {
				if (mobileAction.isObjExists(checkMark, 2))

					CL.GetReporting().FuncReport("Pass", "The Element is selected : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not selected : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyActionSheetUIHoldings() {
		Decorator();
		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			if (mobileAction.isObjExists(btnSwitchNow, 2)) {
				mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");

				mobileAction.FuncClick(InvestingToggle, "InvestingToggle");

				mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");

			}

			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
			mobileAction.FuncClick(flyoutMyAccountLink, "My Accounts Flyout Menu");

			mobileAction.waitForElement(defaultTradeAccount);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");

			mobileAction.verifyElementIsDisplayed(holdingsTab, "holdingsTab");
			mobileAction.FuncClick(holdingsTab, "holdingsTab");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{
				String sXpathAndHoldings = "(//*[@text='AAPL'])[1]";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathAndHoldings, true, 10, "up");
			}

			else {
				String sXpathiOSHoldings = "(//XCUIElementTypeStaticText[@label='AAPL'])[1]";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiOSHoldings, true, 10, "up");

			}
			Thread.sleep(5000);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{

				mobileAction.FuncClick(WatchlistButtonHoldings, "WatchlistButton");

				mobileAction.FuncVerifyTextEquals(lblAddWatchlist,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ADDTOWATCHLISTAND));
			}

			else {

				mobileAction.FuncClick(WatchlistButtonHoldings, "WatchlistButton");

				mobileAction.FuncVerifyTextEquals(lblAddWatchlist,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ADDTOWATCHLIST));

			}

			for (int i = 1; i <= 10; i++)

			{
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					String sXpathiAnd = "(//android.widget.TextView[@resource-id='com.td:id/txtWatchlistName' and contains(@text,'"
							+ i + "')])[i]";

					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiAnd, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiAnd)),
							"List Number is Displayed" + i);

					//String sXpathiAndSymbolNumber = "(//android.widget.TextView[@resource-id='com.td:id/txtWatchlistCount' and (contains(@text,'symbols') or contains(@text,'symbole') or contains(@text,'/'))])[1]";
					String sXpathiAndSymbolNumber = "(//android.widget.TextView[@resource-id='com.td:id/txtWatchlistCount' and (contains(@text,'symbols') or contains(@text,'symbole') or contains(@text,'symboles') or contains(@text,'/'))])[i]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiAndSymbolNumber, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiAndSymbolNumber)),
							"Symbol number for list displayed" + i);

				}

				else {

					String sXpathiOS = "(//XCUIElementTypeStaticText[contains(@label,'" + i + "')])[i]";

					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiOS, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiOS)),
							"List Number is Displayed" + i);

					//String sXpathiOSSymbolNumber = "(//XCUIElementTypeStaticText[contains(@label,'" + i + "')])[2]";
					String sXpathiOSSymbolNumber = "(//XCUIElementTypeStaticText[contains(@label,'symbols') or contains(@label,'symbole') or contains(@label,'symboles') or contains(@label,'/')])[i]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiOSSymbolNumber, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiOSSymbolNumber)),
							"Symbol number for list displayed" + i);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyCheckMarkHoldings() {
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
			mobileAction.FuncClick(flyoutMyAccountLink, "My Accounts Flyout Menu");

			mobileAction.waitForElement(defaultTradeAccount);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");

			mobileAction.verifyElementIsDisplayed(holdingsTab, "holdingsTab");
			mobileAction.FuncClick(holdingsTab, "holdingsTab");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{
				String sXpathAndHoldings = "(//*[@text='AAPL'])[1]";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathAndHoldings, true, 10, "up");
			}

			else {
				String sXpathiOSHoldings = "(//XCUIElementTypeStaticText[@label='AAPL'])[1]";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiOSHoldings, true, 10, "up");

			}
			Thread.sleep(5000);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(WatchlistButtonMod),
						"WatchlistButtonMod");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			}

			else {

				mobileAction.FuncClick(WatchlistButton, "WatchlistButton");

			}

			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(WatchlistButtonMod),
						"WatchlistButtonMod");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			}

			else {

				mobileAction.FuncClick(WatchlistButton, "WatchlistButton");

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkMark.getAttribute("enabled").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is selected : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not selected : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.isObjExists(checkMark, 2))

					CL.GetReporting().FuncReport("Pass", "The Element is selected : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not selected : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyActionSheetUIWLSymbolSearch() {
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

			MIT_DSH_UpdateSearchPage.get().enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));

			mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.FuncVerifyTextEquals(lblAddWatchlist,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ADDTOWATCHLISTAND));
			} else {
				mobileAction.FuncVerifyTextEquals(lblAddWatchlist,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ADDTOWATCHLIST));

			}
			for (int i = 1; i <= 10; i++)

			{
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					String sXpathiAnd = "(//android.widget.TextView[@resource-id='com.td:id/txtWatchlistName' and contains(@text,'"
							+ i + "')])[i]";

					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiAnd, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiAnd)),
							"List Number is Displayed" + i);

					//String sXpathiAndSymbolNumber = "(//android.widget.TextView[@resource-id='com.td:id/txtWatchlistCount' and (contains(@text,'symbols') or contains(@text,'symbole') or contains(@text,'/'))])[1]";
					String sXpathiAndSymbolNumber = "(//android.widget.TextView[@resource-id='com.td:id/txtWatchlistCount' and (contains(@text,'symbols') or contains(@text,'symbole') or contains(@text,'symboles') or contains(@text,'/'))])[i]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiAndSymbolNumber, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiAndSymbolNumber)),
							"Symbol number for list displayed" + i);

				}

				else {

					String sXpathiOS = "(//XCUIElementTypeStaticText[contains(@label,'" + i + "')])[i]";

					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiOS, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiOS)),
							"List Number is Displayed" + i);

				//	String sXpathiOSSymbolNumber = "(//XCUIElementTypeStaticText[contains(@label,'" + i + "')])[2]";
					String sXpathiOSSymbolNumber = "(//XCUIElementTypeStaticText[contains(@label,'symbols') or contains(@label,'symbole') or contains(@label,'/')])[i]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXpathiOSSymbolNumber, false, 5, "up");

					mobileAction.verifyElementIsDisplayed(
							(MobileElement) CL.GetDriver().findElement(By.xpath(sXpathiOSSymbolNumber)),
							"Symbol number for list displayed" + i);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyCheckMarkWLSymbolSearch() {
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

			MIT_DSH_UpdateSearchPage.get().enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));

			mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");

			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");

			mobileAction.FuncClick(AddWatchlistButton, "AddWatchlistButton");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkMark.getAttribute("enabled").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is selected : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not selected : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.isObjExists(checkMark, 2))

					CL.GetReporting().FuncReport("Pass", "The Element is selected : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not selected : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(ListViewExpand01, "ListViewExpand01");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
