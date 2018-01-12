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

public class Investing_MIT_REF extends _CommonPage {

	private static Investing_MIT_REF Investing_MIT_REF;

	public synchronized static Investing_MIT_REF get() {
		if (Investing_MIT_REF == null) {
			Investing_MIT_REF = new Investing_MIT_REF();
		}
		return Investing_MIT_REF;
	}

	String platform = CL.getTestDataInstance().getMobilePlatForm();

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Balances']")
	@AndroidFindBy(id = "com.td:id/balancesTab")
	private MobileElement balanceTab;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Holdings']")
	@AndroidFindBy(id = "com.td:id/holdingsTab")
	private MobileElement HoldingsTab;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Activity']")
	@AndroidFindBy(id = "com.td:id/activityTab")
	private MobileElement activityTab;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Orders']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Orders button']")
	// @AndroidFindBy(id = "com.td:id/ordersTab")
	private MobileElement ordersTab;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cash']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cash']")
	private MobileElement cash;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cash']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(id = "com.td:id/cashBalance")
	private MobileElement cashValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Book Value']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Book Value']")
	private MobileElement bookValues;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Book Value']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(id = "com.td:id/bookValue")
	private MobileElement bookValuesValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Investments']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Investments']")
	private MobileElement investments;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Investments']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(id = "com.td:id/investments")
	private MobileElement investmentsValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Gain/Loss']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gain/Loss']")
	private MobileElement gainLoss;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Gain/Loss']/following-sibling::XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/gainLoss")
	private MobileElement gainLossValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Gain/Loss']/following-sibling::XCUIElementTypeStaticText[3]")
	@AndroidFindBy(id = "com.td:id/gainLossPercent")
	private MobileElement gainLossPrecentage;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Unrealized']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Unrealized']")
	private MobileElement unrealized;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Total Value']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Total Value']")
	private MobileElement totalValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Total Value']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(id = "com.td:id/totalValue")
	private MobileElement totalValue_Value;

	@iOSFindBy(accessibility = "INVESTING_HOKDING_TABLE_SYMBOL_BUTTON")
	@AndroidFindBy(id = "com.td:id/textview_left")
	private MobileElement symbol;

	@iOSFindBy(accessibility = "INVESTING_HOKDING_TABLE_PRICE_BUTTON")
	@AndroidFindBy(id = "com.td:id/textview_center")
	private MobileElement price_chg;

	@iOSFindBy(accessibility = "INVESTING_HOKDING_TABLE_GAINLOSS_BUTTON")
	@AndroidFindBy(id = "com.td:id/textview_right")
	private MobileElement gain_loss_holdings;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[@name='Label_2' or @name='Label_0' or @name='Label_1' or @name='Label_3']")
	@AndroidFindBy(id = "com.td:id/date_settle")
	private MobileElement activity_Transaction;

	@iOSFindBy(accessibility = "TD_ACCOUNT_FOOTER_VIEW_LABEL")
	@AndroidFindBy(id = "com.td:id/status")
	private MobileElement as_of_timeStamp;

	@iOSFindBy(accessibility = "COMPLEX_ORDER_CELL_SYMBOL_NAME")
	@AndroidFindBy(id = "com.td:id/symbol")
	private MobileElement ordersSymbol;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Orders']")
	@AndroidFindBy(id = "com.td:id/current_balance")
	private MobileElement currentBalance;

	@iOSFindBy(id = "INVESTING_QUOTE_BASE_BUY")
	@AndroidFindBy(id = "com.td:id/buyBtn")
	private MobileElement buyETF;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='TRADE']")
	private MobileElement tradeQuickLink;

	@iOSFindBy(id = "NAVIGATION_ITEM_RIGHT_MENU")
	@AndroidFindBy(id = "com.td:id/refresh_menu")
	private MobileElement refreshBtn;

	int accountCounter = 0;

	/**
	 * This method will verify
	 * 
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             If there is problem while reporting. In case the element is
	 *             not found over the screen.
	 */
	public void verifyTabs() {

		Decorator();
		try {

			verifyBalanceTab();
			mobileAction.FuncClick(HoldingsTab, "Holdings Tab");
			verifyHoldingsTab();
			mobileAction.FuncClick(activityTab, "Activity Tab");
			verifActivityTab();
			mobileAction.FuncClick(ordersTab, "Orders Tab");
			verifOrdersTab();

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
	public void verifyBalanceTab() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(balanceTab, "Balance Tab");
			mobileAction.verifyElementIsDisplayed(cash, "Cash");
			mobileAction.verifyElementIsDisplayed(cashValue, "Cash value: " + cashValue.getText());
			mobileAction.verifyElementIsDisplayed(bookValues, "Book Values");
			mobileAction.verifyElementIsDisplayed(bookValuesValue, "Book Values: " + bookValuesValue.getText());
			mobileAction.verifyElementIsDisplayed(investments, "Investments");
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(investmentsValue, "Investments: " + investmentsValue.getText());
			mobileAction.verifyElementIsDisplayed(gainLoss, "Gain/Loss");
			mobileAction.verifyElementIsDisplayed(gainLossValue, "Gain/Loss value: " + gainLossValue.getText());
			mobileAction.verifyElementIsDisplayed(gainLossPrecentage,
					"Gain/Loss precentage: " + gainLossPrecentage.getText());
			mobileAction.verifyElementIsDisplayed(unrealized, "Unrealized");
			mobileAction.verifyElementIsDisplayed(totalValue, "Total Value");
			mobileAction.verifyElementIsDisplayed(totalValue_Value, "Total Value: " + totalValue_Value.getText());
			mobileAction.FunctionSwipe("up", 200, 200);

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
	public void clickHoldingsTab() {

		Decorator();
		try {

			mobileAction.FuncClick(HoldingsTab, "Holdings Tab");

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
	public void verifyHoldingsDetails() {

		String ETF = null;
		String symbol = getTestdata("Symbol");
		String[] symbolArr = symbol.split(": ");
		Decorator();
		try {

			for (int i = 0; i < symbolArr.length; i++) {

				Investing_MIT_REF.clickAccount_Multiple();
				mobileAction.waitP2PProgressBarVanish();
				mobileAction.FunctionSwipe("down", 200, 200);
				mobileAction.FunctionSwipe("down", 200, 200);

				if (platform.equalsIgnoreCase("Android")) {

					ETF = "//android.widget.TextView[@resource-id='com.td:id/symbol' and @text='" + symbolArr[i] + "']";
				} else {
					ETF = "//XCUIElementTypeStaticText[@value='" + symbolArr[i] + "']";
				}

				mobileAction.FuncClick(HoldingsTab, "Holdings Tab");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(ETF, true, 30, "Up");

				Trade_MIT_REF.get().verifyQuoteDetails();

				mobileAction.verifyElementIsDisplayed(refreshBtn, "Refresh");

				HomeScreen.get().back_button();

				// Alternative Solution
				HomeScreen.get().back_button();
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
	public void verifyHoldingsTab() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(HoldingsTab, "Holdings Tab");
			mobileAction.verifyElementIsDisplayed(symbol, "Symbol");
			mobileAction.verifyElementIsDisplayed(price_chg, "PRICE/CHG");
			mobileAction.verifyElementIsDisplayed(gain_loss_holdings, "GAIN/LOSS Unrealized");

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
	public void verifActivityTab() {

		int activityTransactionCounter = 0;

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(activityTab, "Activity Tab");

			while (mobileAction.verifyElementIsPresent(activity_Transaction)
					&& !mobileAction.verifyElementIsPresent(as_of_timeStamp) && activityTransactionCounter < 3) {

				activityTransactionCounter++;
				mobileAction.FunctionSwipe("up", 1000, 200);
			}

			mobileAction.stringToReport("PASS", activityTransactionCounter + " Transactions verified");

			while (!mobileAction.verifyElementIsPresent(currentBalance)) {
				mobileAction.FunctionSwipe("down", 200, 200);
			}
			mobileAction.FunctionSwipe("down", 200, 200);

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
	public void verifOrdersTab() {

		int OrdersCounter = 0;

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");

			while (mobileAction.verifyElementIsPresent(ordersSymbol)
					&& !mobileAction.verifyElementIsPresent(as_of_timeStamp) && OrdersCounter < 3) {

				OrdersCounter++;
				mobileAction.FunctionSwipe("up", 1000, 200);
			}

			mobileAction.stringToReport("PASS", OrdersCounter + " Orders");

			// mobileAction.verifyElementIsDisplayed(ordersSymbol, OrdersCounter
			// + " Orders");

			while (!mobileAction.verifyElementIsPresent(currentBalance)) {
				mobileAction.FunctionSwipe("down", 200, 200);
			}
			mobileAction.FunctionSwipe("down", 200, 200);

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
	public void clickAccount_Multiple() {

		Decorator();

		String account = getTestdata("AccountNumber");
		String[] accountArr = account.split(": ");

		String verify_Acnt = "//android.widget.TextView[contains(@text,'" + accountArr[accountCounter] + "')]";
		String account_Value = "//XCUIElementTypeStaticText[contains(@label,'" + accountArr[accountCounter] + "')]";
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_Value, true, 30, "Up");
			} else {
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(verify_Acnt, true, 30, "Up");
			}

			accountCounter++;
			if (accountCounter >= accountArr.length) {
				accountCounter = 0;
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
	public void clickHoldingsETF() {

		String ETF = null;

		Decorator();
		try {

			if (platform.equalsIgnoreCase("Android")) {

				ETF = "//android.widget.TextView[@text='" + getTestdata("Symbol") + "']";
			} else {
				ETF = "//XCUIElementTypeStaticText[@value='" + getTestdata("Symbol") + "']";
			}

			mobileAction.FuncClick(HoldingsTab, "Holdings Tab");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(ETF, true, 30, "Up");

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
	public void buyHoldingsETF() {

		String ETF = null;

		Decorator();
		try {

			mobileAction.FuncClick(buyETF, "BUY");
			mobileAction.waitP2PProgressBarVanish();
			mobileAction.FunctionSwipe("up", 200, 200);

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

			Trade_MIT_REF.get().sendETFOrder();
			Trade_MIT_REF.get().clickSendOrder();
			Trade_MIT_REF.get().verify_StockOrderSent_Msg();

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
	public void clickTradeQuickLink() {

		Decorator();
		try {

			mobileAction.FuncClick(tradeQuickLink, "Trade Quick Link");

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
