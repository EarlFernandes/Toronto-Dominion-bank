package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Trade_MIT_REF extends _CommonPage {

	private static Trade_MIT_REF Trade_MIT_REF;

	public synchronized static Trade_MIT_REF get() {
		if (Trade_MIT_REF == null) {
			Trade_MIT_REF = new Trade_MIT_REF();
		}
		return Trade_MIT_REF;
	}

	String platform = CL.getTestDataInstance().getMobilePlatForm();

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement tradeHeader;

	@iOSXCUITFindBy(accessibility = "ACCOUNT_HEADER_TEXT")
	@AndroidFindBy(id = "com.td:id/timestamp")
	private MobileElement timestamp;

	@iOSXCUITFindBy(accessibility = "FROM_ACCOUNT_CELL_0")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accountCaption']/following-sibling::android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private MobileElement accountFieldTxt;

	@iOSXCUITFindBy(accessibility = "SELECT_ORDER_TYPE_0")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption']/following-sibling::android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private MobileElement orderTypeFiledTxt;

	@iOSXCUITFindBy(accessibility = "SYMBOL_SEARCH_CELL_1")
	@AndroidFindBy(id = "com.td:id/txtSearchTitle")
	private MobileElement trade_enter_Name_or_symbol;

	@iOSXCUITFindBy(accessibility = "SYMBOL_SEARCH_CELL_1")
	@AndroidFindBy(id = "symbol-search")
	private MobileElement quote_enter_Name_or_symbol;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField")
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement searchSymbolField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='tradingSymbol']")
	@AndroidFindBy(id = "com.td:id/symbol")
	private MobileElement symbol;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='stockDescription']")
	@AndroidFindBy(id = "com.td:id/description")
	private MobileElement companyName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='tradePrice']")
	@AndroidFindBy(id = "com.td:id/txt_price")
	private MobileElement lastPrice;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='valueChange']")
	@AndroidFindBy(id = "com.td:id/quote_profloss")
	private MobileElement dollarChange;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='valueChange']")
	@AndroidFindBy(id = "com.td:id/quote_profloss_percent")
	private MobileElement dollarChangePercent;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='bid']")
	@AndroidFindBy(id = "com.td:id/bidPrice")
	private MobileElement bidPrice;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='bid']")
	@AndroidFindBy(id = "com.td:id/bidLot")
	private MobileElement bidSize;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ask']")
	@AndroidFindBy(id = "com.td:id/askPrice")
	private MobileElement askPrice;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ask']")
	@AndroidFindBy(id = "com.td:id/askLot")
	private MobileElement askSize;

	@iOSXCUITFindBy(accessibility = "ACTION_CELL_1")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Action']/following-sibling::android.widget.TextView")
	private MobileElement actionDropDown;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name='inputTextField']")
	@AndroidFindBy(id = "com.td:id/amountEditText")
	private MobileElement amountField;

	@iOSXCUITFindBy(accessibility = "PRICE_ACTION_CELL_1")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']/following-sibling::android.widget.TextView")
	private MobileElement price;

	@iOSXCUITFindBy(accessibility = "GOOD_TIL_CELL_2")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Good') or @text='Échéance']/following-sibling::android.widget.TextView")
	private MobileElement goodTill;

	@iOSXCUITFindBy(accessibility = "passwordTextField")
	@AndroidFindBy(id = "com.td:id/editTextPassword")
	private MobileElement tradingPassword;

	@iOSXCUITFindBy(accessibility = "passwordTextField")
	@AndroidFindBy(id = "com.td:id/editTextPassword")
	private MobileElement tradingPasswordCancelPage;

	@iOSXCUITFindBy(accessibility = "previewOrderButton")
	// @iOSXCUITFindBy(xpath =
	// "//XCUIElementTypeButton[@name='previewOrderButton']")
	@AndroidFindBy(id = "com.td:id/orderEntryPreviewButton")
	private MobileElement previewOrder;

	@iOSXCUITFindBy(accessibility = "sendOrderButton")
	// @iOSXCUITFindBy(xpath =
	// "//XCUIElementTypeButton[@name='sendOrderButton']")
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement sendOrder;

	@iOSXCUITFindBy(accessibility = "titleLabel")
	// @iOSXCUITFindBy(xpath =
	// "//XCUIElementTypeStaticText[@name='titleLabel']")
	@AndroidFindBy(id = "com.td:id/thank_you")
	private MobileElement thankYou;

	@iOSXCUITFindBy(accessibility = "confirmationNumberLabel")
	// @iOSXCUITFindBy(xpath =
	// "//XCUIElementTypeStaticText[@name='confirmationNumberLabel']")
	@AndroidFindBy(id = "com.td:id/confirmation")
	private MobileElement confirmation;

	@iOSXCUITFindBy(accessibility = "confirmationNumberLabel")
	// @iOSXCUITFindBy(xpath =
	// "//XCUIElementTypeStaticText[@name='confirmationNumberLabel']")
	@AndroidFindBy(id = "com.td:id/confirmation_val")
	private MobileElement confirmationVal;

	@iOSXCUITFindBy(accessibility = "QUICKLINKS_ORDER_OFF")
	@AndroidFindBy(id = "com.td:id/btn_order")
	private MobileElement ordersLink;

	@iOSXCUITFindBy(accessibility = "COMPLEX_ORDER_CELL_SYMBOL_NAME")
	@AndroidFindBy(id = "com.td:id/symbol")
	private MobileElement firstOrder;

	@iOSXCUITFindBy(accessibility = "INVESTING_COMPLEXT_ORDER_DETAIL_CHANGE_BUTTON")
	@AndroidFindBy(id = "com.td:id/change_order_btn")
	private MobileElement changeOrderBtn;

	@iOSXCUITFindBy(accessibility = "inputTextField")
	// @iOSXCUITFindBy(xpath =
	// "//XCUIElementTypeTextField[@name='inputTextField']")
	@AndroidFindBy(id = "com.td:id/amountEditText")
	private MobileElement quantity;

	@iOSXCUITFindBy(accessibility = "INVESTING_COMPLEXT_ORDER_DETAIL_CANCEL_BUTTON")
	@AndroidFindBy(id = "com.td:id/cancel_order_btn")
	private MobileElement cancelOrder;

	@iOSXCUITFindBy(accessibility = "cancelOrderButton")
	// @iOSXCUITFindBy(xpath =
	// "//XCUIElementTypeButton[@name='cancelOrderButton']")
	@AndroidFindBy(id = "com.td:id/orderEntryPreviewButton")
	private MobileElement cancelOrderConfirm;

	@iOSXCUITFindBy(accessibility = "alert_ok_button")
	@AndroidFindBy(id = "com.td:id/positiveButton")
	private MobileElement acceptBtn;

	@iOSXCUITFindBy(accessibility = "alert_cancel_button")
	@AndroidFindBy(id = "com.td:id/btn_cancel")
	private MobileElement cancelbtn;

	@iOSXCUITFindBy(accessibility = "alert_ok_button")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement agreebtnTradeBack;

	@iOSFindBy(xpath = "//*[@label='Accounts' or @label='Comptes' or @label='汇款' or @label='匯款']")
	@AndroidFindBy(xpath = "//*[@text='Accounts' or @text='Comptes' or @text='汇款' or @text='匯款']")
	private MobileElement my_accounts;

	int quoteCounter = 0;

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void verifyTradeHeader() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(tradeHeader, "Trade Header");
			String trade_str = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_TRADE);
			mobileAction.verifyTextEquality(tradeHeader.getText(), trade_str);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void verifyTradeElements() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(timestamp, "Time stamp : " + timestamp.getText());
			mobileAction.verifyElementIsDisplayed(accountFieldTxt, "Account Field : " + accountFieldTxt.getText());
			mobileAction.verifyElementIsDisplayed(orderTypeFiledTxt, "Order Type: " + orderTypeFiledTxt.getText());

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void ClickEnterNameOrSymbol() {

		Decorator();
		try {

			mobileAction.FuncClick(trade_enter_Name_or_symbol, "Enter name or symbol");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void EnterNameOrSymbol() {

		Decorator();
		try {

			MobileElement symbol = null;
			String symbolImgStr = null;
			String symbolShortName = getTestdata("SymbolShortName");
			mobileAction.FuncClick(trade_enter_Name_or_symbol, "Enter name or symbol");
			mobileAction.FuncClick(searchSymbolField, "Search symbol field");
			mobileAction.FuncSendKeys(searchSymbolField, getTestdata("Symbol") + " ");
			mobileAction.waitP2PProgressBarVanish();

			if (platform.equalsIgnoreCase("Android")) {

				symbol = mobileAction.mobileElementUsingXPath("//android.widget.ImageView[@content-desc='"
						+ getTestdata("SymbolImage") + "']/following-sibling::android.widget.TextView[@text='"
						+ getTestdata("Symbol") + "' or @text='" + symbolShortName + "']");
			} else {

				symbolImgStr = getTestdata("SymbolImage").replaceAll("\\s+", "");
				symbol = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeCell[(contains(@name,'" + getTestdata("Symbol") + "') or contains(@name,'"
								+ symbolShortName + "')) and contains(@name,'" + symbolImgStr + "')]");
			}

			mobileAction.FuncClick(symbol, "Symbol: " + getTestdata("Symbol"));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void goBackToHome() {

		Decorator();
		try {

			if (mobileAction.verifyElementIsPresent(cancelbtn))
				mobileAction.FuncClick(cancelbtn, "Cancel");

			while (!mobileAction.verifyElementIsPresent(my_accounts)) {
				mobileAction.ClickBackButton();
				if (mobileAction.verifyElementIsPresent(agreebtnTradeBack))
					mobileAction.FuncClick(agreebtnTradeBack, "Agree Button");
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void verifyRecentSearchSymbol() {

		Decorator();
		try {

			MobileElement symbol = null;
			String symbolImgStr = null;
			String nxtSymbol = getTestdata("NxtSymbol");
			String nxtSymbolImageArr = getTestdata("NxtSymbolImage");
			String[] nxtSymbolImage = nxtSymbolImageArr.split(": ");
			String quoteNameSaver = null;

			mobileAction.waitP2PProgressBarVanish();

			if (platform.equalsIgnoreCase("Android")) {

				symbol = mobileAction.mobileElementUsingXPath("//android.widget.ImageView[@content-desc='"
						+ getTestdata("SymbolImage") + "']/following-sibling::android.widget.TextView[@text='"
						+ getTestdata("Symbol") + "']");
			} else {

				symbolImgStr = getTestdata("SymbolImage").replaceAll("\\s+", "");
				symbol = mobileAction.mobileElementUsingXPath("//XCUIElementTypeCell[contains(@name,'"
						+ getTestdata("Symbol") + "') and contains(@name,'" + symbolImgStr + "')]");
			}

			mobileAction.verifyElementIsDisplayed(symbol, "Symbol: " + getTestdata("Symbol"));

			for (int i = 0; i < nxtSymbolImage.length; i++) {

				mobileAction.FuncClick(searchSymbolField, "Search symbol field");

				quoteNameSaver = nxtSymbolImage[quoteCounter].replaceAll("\\s+", "");
				nxtSymbol = nxtSymbol + " " + quoteNameSaver;
				mobileAction.FuncSendKeys(searchSymbolField, nxtSymbol);

				if (platform.equalsIgnoreCase("Android")) {

					symbol = mobileAction.mobileElementUsingXPath("//android.widget.ImageView[@content-desc='"
							+ nxtSymbolImage[quoteCounter] + "']/following-sibling::android.widget.TextView[@text='"
							+ getTestdata("nxtSymbol") + "']");
				} else {

					symbolImgStr = nxtSymbolImage[quoteCounter].replaceAll("\\s+", "");
					symbol = mobileAction.mobileElementUsingXPath("//XCUIElementTypeCell[contains(@name,'"
							+ getTestdata("nxtSymbol") + "') and contains(@name,'" + symbolImgStr + "')]");
				}

				mobileAction.verifyElementIsDisplayed(symbol, "Symbol: " + getTestdata("nxtSymbol"));

				mobileAction.FuncClick(symbol, "Symbol: " + getTestdata("nxtSymbol"));

				HomeScreen.get().back_button();

				verifyQuoteSymbol();
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void verifyQuoteDetails() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(symbol, "Symbol " + symbol.getText());
			mobileAction.verifyElementIsDisplayed(companyName, "Company name " + companyName.getText());
			mobileAction.verifyElementIsDisplayed(lastPrice, "Last Price " + lastPrice.getText());
			mobileAction.verifyElementIsDisplayed(dollarChange, "Dollar Change " + dollarChange.getText());
			mobileAction.verifyElementIsDisplayed(dollarChangePercent,
					"Dollar Change Percent " + dollarChangePercent.getText());
			mobileAction.verifyElementIsDisplayed(bidPrice, "Bid Price " + bidPrice.getText());
			mobileAction.verifyElementIsDisplayed(bidSize, "Bid Size " + bidSize.getText());
			mobileAction.verifyElementIsDisplayed(askPrice, "Ask Price " + askPrice.getText());
			mobileAction.verifyElementIsDisplayed(askSize, "Ask Size " + askSize.getText());

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void sendStockOrder() {

		Decorator();
		try {

			MobileElement actionElement = null;
			String arrayStr[] = null;
			String actionToPerform = null;
			MobileElement priceElement = null;
			MobileElement goodTillElement = null;

			if (platform.equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(accountFieldTxt, "Account drop down");

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(
						"//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
								+ getTestdata("AccountNumber") + "']",
						true, 60, "up");

				mobileAction.FunctionSwipe("up", 2000, 200);
				mobileAction.FuncClick(actionDropDown, "Action Drop Down");

				actionToPerform = getTestdata("Action");

				if (actionToPerform.equalsIgnoreCase("Buy"))
					arrayStr = StringArray.ARRAY_DASHBOARD_ACTIONBUY;
				else
					arrayStr = StringArray.ARRAY_DASHBOARD_ACTIONSELL;

				actionElement = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@text='" + getTextInCurrentLocale(arrayStr) + "']");

				mobileAction.FuncClick(actionElement, "Action " + actionElement.getText());

				mobileAction.FuncClick(amountField, "Amount");
				mobileAction.FuncSendKeys(amountField, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();

				mobileAction.FuncClick(price, "price");

				priceElement = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='"
						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_PRICEMARKET) + "']");

				mobileAction.FuncClick(priceElement, priceElement.getText());

				mobileAction.FuncClick(goodTill, "Good Till");

				goodTillElement = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='"
						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_GOODTILLDAY) + "']");

				mobileAction.FuncClick(goodTillElement, goodTillElement.getText());

				mobileAction.FunctionSwipe("up", 200, 200);

				mobileAction.FuncClick(tradingPassword, "Trading Password");
				mobileAction.FuncSendKeys(tradingPassword, getTestdata("Trading_Pwd"));
				mobileAction.FuncHideKeyboard();

				mobileAction.FuncClick(previewOrder, "Preview Order Button");

			} else {

				mobileAction.FuncClick(accountFieldTxt, "Account drop down");

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(
						"//XCUIElementTypeStaticText[contains(@value,'" + getTestdata("AccountNumber") + "')]", true,
						60, "up");

				mobileAction.FunctionSwipe("up", 2000, 200);
				mobileAction.FuncClick(actionDropDown, "Action Drop Down");

				actionToPerform = getTestdata("Action");

				if (actionToPerform.equalsIgnoreCase("Buy"))
					arrayStr = StringArray.ARRAY_DASHBOARD_ACTIONBUY;
				else
					arrayStr = StringArray.ARRAY_DASHBOARD_ACTIONSELL;

				actionElement = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeCell/XCUIElementTypeStaticText[@value='"
								+ getTextInCurrentLocale(arrayStr) + "']");

				mobileAction.FuncClick(actionElement, "Action " + actionElement.getText());

				mobileAction.FuncClick(amountField, "Amount");
				mobileAction.FuncSendKeys(amountField, getTestdata("Amount"));
				mobileAction.getPageSource();
				mobileAction.FuncClickDone();

				mobileAction.FuncClick(price, "price");

				priceElement = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeCell/XCUIElementTypeStaticText[@value='"
								+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_PRICEMARKET) + "']");

				mobileAction.FuncClick(priceElement, priceElement.getText());

				mobileAction.FuncClick(goodTill, "Good Till");

				goodTillElement = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeCell/XCUIElementTypeStaticText[@value='"
								+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_GOODTILLDAY) + "']");

				mobileAction.FuncClick(goodTillElement, goodTillElement.getText());

				mobileAction.FunctionSwipe("up", 200, 200);

				mobileAction.FuncClick(tradingPassword, "Trading Password");
				mobileAction.FuncSendKeys(tradingPassword, getTestdata("Trading_Pwd"));
				mobileAction.FuncClickDone();

				mobileAction.FuncClick(previewOrder, "Preview Order Button");

			}

			if (mobileAction.verifyElementIsPresent(acceptBtn)) {

				mobileAction.FuncClick(acceptBtn, "Agree Button");
			}

			mobileAction.waitP2PProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void sendETFOrder() {

		Decorator();
		try {

			MobileElement actionElement = null;
			String arrayStr[] = null;
			String actionToPerform = null;
			MobileElement priceElement = null;
			MobileElement goodTillElement = null;

			if (platform.equalsIgnoreCase("Android")) {

				mobileAction.FunctionSwipe("up", 2000, 200);
				mobileAction.FuncClick(actionDropDown, "Action Drop Down");

				actionToPerform = getTestdata("Action");

				if (actionToPerform.equalsIgnoreCase("Buy"))
					arrayStr = StringArray.ARRAY_DASHBOARD_ACTIONBUY;
				else
					arrayStr = StringArray.ARRAY_DASHBOARD_ACTIONSELL;

				actionElement = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@text='" + getTextInCurrentLocale(arrayStr) + "']");

				mobileAction.FuncClick(actionElement, "Action " + actionElement.getText());

				mobileAction.FuncClick(amountField, "Amount");
				mobileAction.FuncSendKeys(amountField, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();

				mobileAction.FuncClick(price, "price");

				priceElement = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='"
						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_PRICEMARKET) + "']");

				mobileAction.FuncClick(priceElement, priceElement.getText());

				mobileAction.FuncClick(goodTill, "Good Till");

				goodTillElement = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='"
						+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_GOODTILLDAY) + "']");

				mobileAction.FuncClick(goodTillElement, goodTillElement.getText());

				mobileAction.FunctionSwipe("up", 200, 200);

				mobileAction.FuncClick(tradingPassword, "Trading Password");
				mobileAction.FuncSendKeys(tradingPassword, getTestdata("Trading_Pwd"));
				mobileAction.FuncHideKeyboard();

			} else {

				mobileAction.FunctionSwipe("up", 2000, 200);
				mobileAction.FuncClick(actionDropDown, "Action Drop Down");

				actionToPerform = getTestdata("Action");

				if (actionToPerform.equalsIgnoreCase("Buy"))
					arrayStr = StringArray.ARRAY_DASHBOARD_ACTIONBUY;
				else
					arrayStr = StringArray.ARRAY_DASHBOARD_ACTIONSELL;

				actionElement = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeCell/XCUIElementTypeStaticText[@value='"
								+ getTextInCurrentLocale(arrayStr) + "']");

				mobileAction.FuncClick(actionElement, "Action " + actionElement.getText());

				mobileAction.FuncClick(amountField, "Amount");
				mobileAction.FuncSendKeys(amountField, getTestdata("Amount"));
				mobileAction.FuncClickDone();

				mobileAction.FuncClick(price, "price");

				priceElement = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeCell/XCUIElementTypeStaticText[@value='"
								+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_PRICEMARKET) + "']");

				mobileAction.FuncClick(priceElement, priceElement.getText());

				mobileAction.FuncClick(goodTill, "Good Till");

				goodTillElement = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeCell/XCUIElementTypeStaticText[@value='"
								+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_GOODTILLDAY) + "']");

				mobileAction.FuncClick(goodTillElement, goodTillElement.getText());

				mobileAction.FunctionSwipe("up", 200, 200);

				mobileAction.FuncClick(tradingPassword, "Trading Password");
				mobileAction.FuncSendKeys(tradingPassword, getTestdata("Trading_Pwd"));
				mobileAction.FuncClickDone();

			}

			mobileAction.FuncClick(previewOrder, "Preview Order Button");

			if (mobileAction.verifyElementIsPresent(previewOrder)) {

				mobileAction.FuncClick(previewOrder, "Preview Order Button");
			}

			if (mobileAction.verifyElementIsPresent(acceptBtn)) {

				mobileAction.FuncClick(acceptBtn, "Agree Button");
			}

			mobileAction.waitP2PProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void clickSendOrder() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(timestamp, "Time Stamp");
			String thisDate = Integer.toString(GetDate.get().getTodaysDate());
			String thisMonth = GetDate.get().getCurrentMonthShort();

			mobileAction.verifyElementTextContains(timestamp, thisDate);
			mobileAction.verifyElementTextContains(timestamp, thisMonth);

			mobileAction.FuncClick(sendOrder, "Send Order Button");
			mobileAction.waitP2PProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void verify_StockOrderSent_Msg() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(thankYou, "Thank You");
			mobileAction.verifyElementIsDisplayed(confirmation, "Confirmation #");
			mobileAction.verifyElementIsDisplayed(confirmationVal, "Confirmation Code " + confirmationVal.getText());

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void click_Orders_Link() {

		Decorator();
		try {

			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(ordersLink, "Orders Link");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void click_RecentOrder() {

		Decorator();
		try {

			mobileAction.FuncClick(firstOrder, "Recent Order");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void verifyFirstOrderPlaced() {

		Decorator();
		try {

			String symbol = getTestdata("Symbol");
			String symbolShortName=getTestdata("SymbolShortName");
			String symbolImage=getTestdata("SymbolImage");
			
			MobileElement placedOrder = null;

			if (platform.equalsIgnoreCase("Android")) {

				placedOrder = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/symbol' and (@text='" + symbol
								+ "' or @text='" + symbolShortName + "')]");

			} else {

				symbolImage = symbolImage.replaceAll("\\s+", "");
				placedOrder = mobileAction.mobileElementUsingXPath("//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@value,'"+symbolShortName+"') and contains(@value,'"+symbolImage+"')]");
			}

			mobileAction.verifyElementIsDisplayed(placedOrder, "Recent order: " + placedOrder.getText());

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void changeOrder() {

		Decorator();
		try {

			mobileAction.FuncClick(changeOrderBtn, "Change Order");
			mobileAction.waitP2PProgressBarVanish();
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(quantity, "Quantity Field");
			mobileAction.FuncSendKeys(quantity, getTestdata("Quantity"));
			mobileAction.FuncHideKeyboard();

			mobileAction.FunctionSwipe("up", 200, 200);

			mobileAction.FuncClick(tradingPassword, "Trading Password");
			mobileAction.FuncSendKeys(tradingPassword, getTestdata("Trading_Pwd"));
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(previewOrder, "Preview Order Button");
			if (mobileAction.verifyElementIsPresent(previewOrder)) {

				mobileAction.FuncClick(previewOrder, "Preview Order Button");
			}

			if (mobileAction.verifyElementIsPresent(acceptBtn))
				mobileAction.FuncClick(acceptBtn, "Agree Button");

			mobileAction.waitP2PProgressBarVanish();

			mobileAction.FuncClick(sendOrder, "Send Order");

			verify_StockOrderSent_Msg();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void cancelOrder() {

		Decorator();
		try {

			mobileAction.FuncClick(cancelOrder, "Cancel Order");
			mobileAction.waitP2PProgressBarVanish();
			mobileAction.FunctionSwipe("up", 200, 200);

			mobileAction.FuncClick(tradingPasswordCancelPage, "Trading Password");
			mobileAction.FuncSendKeys(tradingPasswordCancelPage, getTestdata("Trading_Pwd"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(cancelOrderConfirm, "Cancel Order Confirm");
			mobileAction.waitP2PProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(thankYou, "Thank You");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void verifyQuoteSymbol() {

		Decorator();
		try {

			MobileElement symbol = null;
			String symbolImgStr = null;
			String nxtSymbol = getTestdata("NxtSymbol");
			String nxtSymbolImageArr = getTestdata("NxtSymbolImage");
			String[] nxtSymbolImage = nxtSymbolImageArr.split(": ");
			String quoteNameSaver = null;

			mobileAction.waitP2PProgressBarVanish();
			if (platform.equalsIgnoreCase("Android")) {

				symbol = mobileAction.mobileElementUsingXPath("//android.widget.ImageView[@content-desc='"
						+ getTestdata("SymbolImage") + "']/following-sibling::android.widget.TextView[@text='"
						+ getTestdata("Symbol") + "']");
			} else {

				symbolImgStr = getTestdata("SymbolImage").replaceAll("\\s+", "");
				symbol = mobileAction.mobileElementUsingXPath("//XCUIElementTypeCell[contains(@name,'"
						+ getTestdata("Symbol") + "') and contains(@name,'" + symbolImgStr + "')]");
			}

			mobileAction.verifyElementIsDisplayed(symbol, "Symbol: " + getTestdata("Symbol"));

			quoteNameSaver = nxtSymbolImage[quoteCounter].replaceAll("\\s+", "");
			nxtSymbol = nxtSymbol + " " + quoteNameSaver;
			mobileAction.FuncSendKeys(searchSymbolField, nxtSymbol);

			if (platform.equalsIgnoreCase("Android")) {

				symbol = mobileAction.mobileElementUsingXPath("//android.widget.ImageView[@content-desc='"
						+ nxtSymbolImage[quoteCounter] + "']/following-sibling::android.widget.TextView[@text='"
						+ getTestdata("nxtSymbol") + "']");
			} else {

				symbolImgStr = nxtSymbolImage[quoteCounter].replaceAll("\\s+", "");
				symbol = mobileAction.mobileElementUsingXPath("//XCUIElementTypeCell[contains(@name,'"
						+ getTestdata("nxtSymbol") + "') and contains(@name,'" + symbolImgStr + "')]");
			}

			mobileAction.verifyElementIsDisplayed(symbol, "Symbol: " + getTestdata("nxtSymbol"));

			quoteCounter++;
			if (quoteCounter >= nxtSymbolImage.length)
				quoteCounter = 0;

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void QuoteverifyRecentSearchSymbol() {

		Decorator();
		try {

			MobileElement symbol = null;
			String symbolImgStr = getTestdata("SymbolImage").replaceAll("\\s+", "");
			String nxtSymbol = getTestdata("NxtSymbol");
			String nxtSymbolImageArr = getTestdata("NxtSymbolImage");
			String[] nxtSymbolImage = nxtSymbolImageArr.split(": ");
			String quoteNameSaver = nxtSymbolImage[quoteCounter].replaceAll("\\s+", "");

			mobileAction.waitP2PProgressBarVanish();

			if (platform.equalsIgnoreCase("Android")) {

				symbol = mobileAction.mobileElementUsingXPath("//android.view.View[contains(@text,'" + quoteNameSaver
						+ "')]/following-sibling::android.view.View[@text='" + getTestdata("Symbol") + "']");
			} else {

				symbol = mobileAction.mobileElementUsingXPath("//XCUIElementTypeCell[contains(@name,'"
						+ getTestdata("Symbol") + "') and contains(@name,'" + quoteNameSaver + "')]");
			}

			mobileAction.verifyElementIsDisplayed(symbol, "Symbol: " + getTestdata("Symbol"));

			// Entering second symbol

			mobileAction.FuncClick(quote_enter_Name_or_symbol, "Search symbol field");

			nxtSymbol = nxtSymbol + " ";
			mobileAction.FuncSendKeys(quote_enter_Name_or_symbol, nxtSymbol);

			if (platform.equalsIgnoreCase("Android")) {

				symbol = mobileAction.mobileElementUsingXPath("//android.view.View[contains(@text,'" + quoteNameSaver
						+ "')]/following-sibling::android.view.View[@text='" + getTestdata("Symbol") + "']");
			} else {

				symbol = mobileAction.mobileElementUsingXPath("//XCUIElementTypeCell[contains(@name,'"
						+ getTestdata("nxtSymbol") + "') and contains(@name,'" + quoteNameSaver + "')]");
			}

			mobileAction.verifyElementIsDisplayed(symbol, "Symbol: " + getTestdata("nxtSymbol"));

			mobileAction.FuncClick(symbol, "Symbol: " + getTestdata("nxtSymbol"));

			HomeScreen.get().back_button();

			verifyQuoteSymbol();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

}
