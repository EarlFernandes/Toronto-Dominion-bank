package com.td.test.CDNMobile.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

	@iOSXCUITFindBy(xpath = "//*[@label='More' or @label='Plus' or @label='显示更多' or @label='顯示更多']")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_more_footer")
	private MobileElement BT_More;

	@iOSFindBy(xpath = "//*[@label='WATCHLISTS' or @label='LISTES DE SURVEILLANCE' or @label='自选股观察名单' or @label='自選股觀察名單']")
	@AndroidFindBy(xpath = "//*[@text='WATCHLISTS' or @text='LISTES DE SURVEILLANCE' or @text='自选股观察名单' or @text='自選股觀察名單']")
	private MobileElement QL_WATCHLISTS;

	@iOSXCUITFindBy(accessibility = "accountNumberLabel")
	@AndroidFindBy(id = "com.td:id/selectedValue")
	private MobileElement VAL_AccountNumber;

	@iOSXCUITFindBy(xpath = "//*[@name='SELECT_ORDER_TYPE_0']/*[@name='valueLeftLabel']")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/order_type']/*[1]/*[1]/*[2]")
	private MobileElement VAL_OrderType;

	@iOSXCUITFindBy(accessibility = "tradingSymbol")
	@AndroidFindBy(id = "com.td:id/symbol")
	private MobileElement VAL_TradingSymbol;

	@iOSXCUITFindBy(accessibility = "symbolNameLabel")
	@AndroidFindBy(id = "com.td:id/symbol_name")
	private MobileElement VAL_TradingSymbolMF;

	@iOSXCUITFindBy(xpath = "//*[@name='ACTION_CELL_1']/*[@name='valueLeftLabel']")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/order_action']/*[1]/*[1]/*[2]")
	private MobileElement VAL_Action;

	@iOSXCUITFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[@name='valueLeftLabel']")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/order_action']/*[1]/*[1]/*[2]")
	private MobileElement VAL_ActionMF;

	@iOSXCUITFindBy(xpath = "//*[@name='PRICE_ACTION_CELL_1']/*[@name='valueLeftLabel']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours' or @text='价格' or @text='價格']/../android.widget.TextView[@index=1]")
	private MobileElement VAL_Price;

	@iOSXCUITFindBy(xpath = "//*[@name='GOOD_TIL_CELL_2']/*[@name='valueLeftLabel']")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Good') or @text='Échéance' or @text='有效期' or @text='有效期']/../android.widget.TextView[@index=1]")
	private MobileElement VAL_GoodTill;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	private MobileElement BT_Back;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "com.td:id/toolbar_back_button")
	private MobileElement BT_WLBack;	

	@iOSXCUITFindBy(accessibility = "alert_ok_button")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement BT_AlertAgree;

	@iOSXCUITFindBy(xpath = "//*[@name='toggleSegmentedControl']/*[1]")
	@AndroidFindBy(id = "com.td:id/button_left")
	private MobileElement BT_IncludeCommissionYes;

	@iOSXCUITFindBy(xpath = "//*[@name='DIVIDEND_OPTION_CELL_2']/*[@name='valueLeftLabel']")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/dividend_type']/*[1]/*[1]/*[2]")
	private MobileElement VAL_DividendOption;

	private By LBL_Symbol_QuotePage = By.xpath("//*[@class='text-prominent symbol']");

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

			String xpathWLSymbol = "//*[contains(@label,'" + sSymbol + "') or @text='" + sSymbol + "']";
			String xpathWLSymbolQuotePage = "//*[contains(@label,'" + sSymbol + "')]";

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathWLSymbol, true, 4, "up");

			Thread.sleep(10000);
			if (!CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementTextContainsReverse(
						mobileAction.mobileElementUsingXPath(xpathWLSymbolQuotePage), sSymbol);
			} else {
				MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());

				mobileAction.verifyElementTextContainsReverse(mobileAction.getMobileElement(LBL_Symbol_QuotePage),
						sSymbol);
				MIT_PNSAccessAlerts.get().FuncSwitchContext("NATIVE_APP");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickWLSymbolBuyButton(String sSymbol) {
		Decorator();
		try {
			int iRow = 0;

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				iRow = getWLSymbolRowNumber_Android(sSymbol);
				String xpathWLSymbolBuyButton = "(//*[@text='"
						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY) + "'])[1]";
				mobileAction.FuncSwipeOnce("left");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathWLSymbolBuyButton, false, 10, "left");
				mobileAction.FuncClick(
						(MobileElement) CL.GetDriver().findElements(By.id("com.td:id/button_buy")).get(iRow),
						"Buy Button");

			} else {
//				String xpathWLSymbolBuyButton = "(//*[@label='" + sSymbol
//						+ "']/../../following-sibling::*/*[1]/*[@label='"
//						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY) + "'])[1]";
				mobileAction.FuncSwipeOnce("left");				
				String xpathWLSymbolBuyButton = "(//*[contains(@label,'" + sSymbol
						+ "')]/../../../../following-sibling::*/*[1]/*[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY) + "'])[1]";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathWLSymbolBuyButton, true, 10, "left");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickWLSymbolSellButton(String sSymbol) {
		Decorator();
		try {

			int iRow = 0;

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				iRow = getWLSymbolRowNumber_Android(sSymbol);
				String xpathWLSymbolSellButton = "(//*[@text='"
						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL) + "'])[1]";
				mobileAction.FuncSwipeOnce("left");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathWLSymbolSellButton, false, 10, "left");
				mobileAction.FuncClick(
						(MobileElement) CL.GetDriver().findElements(By.id("com.td:id/button_sell")).get(iRow),
						"Sell Button");

			} else {
//				String xpathWLSymbolSellButton = "(//*[@label='" + sSymbol
//						+ "']/../../following-sibling::*/*[1]/*[@label='"
//						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL) + "'])[1]";
				mobileAction.FuncSwipeOnce("left");
				String xpathWLSymbolSellButton = "(//*[contains(@label,'" + sSymbol
						+ "')]/../../../../following-sibling::*/*[1]/*[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL) + "'])[1]";
				
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathWLSymbolSellButton, true, 5, "left");
			}
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

	public void goToWLExpandedView() {
		Decorator();
		try {
			/*
			 * if
			 * (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase(
			 * "Android")) {
			 * MIT_DSHQuickLinks.get().clickQuickLink(QL_WATCHLISTS,
			 * "WATCHLISTS"); } else {
			 */
			MIT_DSHQuickLinks.get().turnInvestingFocusOn();
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeWhileElementNotFound(BT_More, false, 4, "up");
			mobileAction.FuncClick(BT_More, "More Button");
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTappingWLOptionSymbol() {
		Decorator();
		try {
			String sSymbol = getTestdata("Symbol", XLSheetUserIDs);
			selectWLSymbol(sSymbol);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTappingWLMutualFundSymbol() {
		Decorator();
		try {
			String sSymbol = getTestdata("Symbol", XLSheetUserIDs);
			selectWLSymbol(sSymbol);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWLOptionSymbolSellButton() {
		Decorator();
		try {
			String sSymbol = getTestdata("Symbol", XLSheetUserIDs);

			clickWLSymbolSellButton(sSymbol);

			verifyOptionOrderEntryScreen(sSymbol, "Sell");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOrderEntryScreen(String sSymbol, String sAction) {
		Decorator();
		try {

			String accNumber = getTestdata("Accounts", "UserIDs").trim();

			String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";

			// mobileAction.FuncVerifyNonBlankValue(VAL_AccountNumber, "Account
			// Number");
			if (mobileAction.FuncGetValByRegx(mobileAction.FuncGetElementText(VAL_AccountNumber), "[0-9]+")
					.length() > 1) {
				CL.GetReporting().FuncReport(PASS, "Account number is pre-populated.");
			} else {
				CL.GetReporting().FuncReport(FAIL, "Account number is not pre-populated.");
			}

			mobileAction.FuncClick(VAL_AccountNumber, "Account Number");

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 30, "up");

			mobileAction.FuncVerifyTextEquals(VAL_OrderType,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_OPTIONS));

			mobileAction.verifyElementTextContainsReverse(VAL_TradingSymbol, sSymbol);

			mobileAction.FuncSwipeWhileElementNotFound(VAL_Action, false, 4, "up");
			if (sAction.equalsIgnoreCase("Buy"))
				mobileAction.FuncVerifyTextEquals(VAL_Action,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUYTOOPEN));
			else
				mobileAction.FuncVerifyTextEquals(VAL_Action,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELLTOCLOSE));

			mobileAction.FuncSwipeWhileElementNotFound(VAL_Price, false, 4, "up");
			mobileAction.FuncVerifyTextEquals(VAL_Price,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_PRICELIMIT));

			mobileAction.FuncSwipeWhileElementNotFound(VAL_GoodTill, false, 4, "up");
			mobileAction.FuncVerifyTextEquals(VAL_GoodTill,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_GOODTILLDAY));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWLMutualFundSymbolBuyButton() {
		Decorator();
		try {
			String sSymbol = getTestdata("Symbol", XLSheetUserIDs);

			clickWLSymbolBuyButton(sSymbol);

			verifyMutualFundOrderEntryScreen(sSymbol, "Buy");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMutualFundOrderEntryScreen(String sSymbol, String sAction) {
		Decorator();
		try {
			if (mobileAction.FuncGetValByRegx(mobileAction.FuncGetElementText(VAL_AccountNumber), "[0-9]+")
					.length() > 1) {
				CL.GetReporting().FuncReport(PASS, "Account number is pre-populated.");
			} else {
				CL.GetReporting().FuncReport(FAIL, "Account number is not pre-populated.");
			}

			mobileAction.FuncVerifyTextEquals(VAL_OrderType,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_MUTUALFUNDS));

			mobileAction.FuncVerifyTextEquals(VAL_TradingSymbolMF, sSymbol);

			mobileAction.FuncSwipeWhileElementNotFound(VAL_ActionMF, false, 4, "up");
			if (sAction.equalsIgnoreCase("Buy"))
				mobileAction.FuncVerifyTextEquals(VAL_ActionMF,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY));
			else
				mobileAction.FuncVerifyTextEquals(VAL_ActionMF,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL));

			mobileAction.FuncSwipeWhileElementNotFound(BT_IncludeCommissionYes, false, 4, "up");
			mobileAction.verifyElementIsDisplayed(BT_IncludeCommissionYes, "Include Commission Yes Button");

			mobileAction.FuncSwipeWhileElementNotFound(VAL_DividendOption, false, 4, "up");
			mobileAction.FuncVerifyTextEquals(VAL_DividendOption,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_MF_REINVESTED));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWLOptionSymbolBuyButton() {
		Decorator();
		try {
			String sSymbol = getTestdata("Symbol", XLSheetUserIDs);

			clickWLSymbolBuyButton(sSymbol);

			verifyOptionOrderEntryScreen(sSymbol, "Buy");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWLETFSymbolSellButton() {
		Decorator();
		try {
			String sSymbol = getTestdata("Symbol", XLSheetUserIDs);

			clickWLSymbolSellButton(sSymbol);

			verifyStockOrderEntryScreen(sSymbol, "Sell");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWLIndicesSymbolBuySellButton() {
		Decorator();
		try {
			String sSymbol = getTestdata("Symbol", XLSheetUserIDs);

			mobileAction.SwipeQuickLinks(200, 100);

			String xpathWLSymbolBuyButton = "(//*[@label='" + sSymbol + "']/../../following-sibling::*/*[1]/*[@label='"
					+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY) + "'])[1]";

			String xpathWLSymbolSellButton = "(//*[@label='" + sSymbol + "']/../../following-sibling::*/*[1]/*[@label='"
					+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL) + "'])[1]";

			if (!mobileAction
					.isObjExists((MobileElement) CL.GetDriver().findElement(By.xpath(xpathWLSymbolBuyButton)))) {
				CL.GetReporting().FuncReport(PASS, "Buy button not displayed for Indices.");

			} else {
				CL.GetReporting().FuncReport(FAIL, "Buy button should not display for Indices.");
			}

			if (!mobileAction
					.isObjExists((MobileElement) CL.GetDriver().findElement(By.xpath(xpathWLSymbolSellButton)))) {
				CL.GetReporting().FuncReport(PASS, "Sell button not displayed for Indices.");

			} else {
				CL.GetReporting().FuncReport(FAIL, "Sell button should not display for Indices.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getWLSymbolRowNumber_Android(String sSymbol) {
		Decorator();
		int iCnt = 0;
		try {
			String xpathWLSymbol = "//*[@label='" + sSymbol + "' or @text='" + sSymbol + "']";
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathWLSymbol, false, 4, "up");

			for (WebElement meSymbol : CL.GetDriver().findElements(By.id("com.td:id/tv_item_watchlist_name"))) {
				if (mobileAction.FuncGetElementText(meSymbol).equals(sSymbol)) {
					break;
				} else
					iCnt++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return iCnt;
	}

	public void verifyWLBackButton() {
		Decorator();
		try {
			mobileAction.FuncClick(BT_WLBack, "< Button");
			mobileAction.FuncSwipeWhileElementNotFound(BT_More, false, 4, "up");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyWLSymbolFlagCompanyName() {
		Decorator();
		try {

			String[] aSymbolList = getTestdata("Symbol", XLSheetUserIDs).split(",");

			for (String sSymbol : aSymbolList) {
				String xpathWLSymbol = "//*[@label='" + sSymbol + "' or @text='" + sSymbol + "']";
				String xpathWLSymbolFlag = "//*[@label='" + sSymbol + "' or @text='" + sSymbol
						+ "']/../*[@name='flagImageView' or @resource-id='com.td:id/iv_item_watchlist_flag']";
				String xpathWLSymbolCompanyName = "//*[@label='" + sSymbol + "' or @text='" + sSymbol
						+ "']/../*[@name='companyLabel' or @resource-id='com.td:id/tv_item_watchlist_desp']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathWLSymbol, false, 10, "up");

				mobileAction.verifyElementUsingXPath(xpathWLSymbolFlag, "Country Flag");
				if (!sSymbol.contains(" ")) {
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathWLSymbolCompanyName, false, 4, "up");
					String sCompanyName = mobileAction.FuncGetTextByxpath(xpathWLSymbolCompanyName);
					CL.GetReporting().FuncReport(PASS, sSymbol + " company name : " + sCompanyName);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
