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

	@AndroidFindBy(id = "com.td:id/balancesTab")
	private MobileElement balanceTab;

	@AndroidFindBy(id = "com.td:id/holdingsTab")
	private MobileElement HoldingsTab;

	@AndroidFindBy(id = "com.td:id/activityTab")
	private MobileElement activityTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Orders button']")
	// @AndroidFindBy(id = "com.td:id/ordersTab")
	private MobileElement ordersTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cash']")
	private MobileElement cash;

	@AndroidFindBy(id = "com.td:id/cashBalance")
	private MobileElement cashValue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Book Value']")
	private MobileElement bookValues;

	@AndroidFindBy(id = "com.td:id/bookValue")
	private MobileElement bookValuesValue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Investments']")
	private MobileElement investments;

	@AndroidFindBy(id = "com.td:id/investments")
	private MobileElement investmentsValue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gain/Loss']")
	private MobileElement gainLoss;

	@AndroidFindBy(id = "com.td:id/gainLoss")
	private MobileElement gainLossValue;

	@AndroidFindBy(id = "com.td:id/gainLossPercent")
	private MobileElement gainLossPrecentage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Unrealized']")
	private MobileElement unrealized;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Total Value']")
	private MobileElement totalValue;

	@AndroidFindBy(id = "com.td:id/totalValue")
	private MobileElement totalValue_Value;

	@AndroidFindBy(id = "com.td:id/textview_left")
	private MobileElement symbol;

	@AndroidFindBy(id = "com.td:id/textview_center")
	private MobileElement price_chg;

	@AndroidFindBy(id = "com.td:id/textview_right")
	private MobileElement gain_loss_holdings;

	@AndroidFindBy(id = "com.td:id/date_settle")
	private MobileElement activity_Transaction;

	@AndroidFindBy(id = "com.td:id/status")
	private MobileElement as_of_timeStamp;

	@AndroidFindBy(id = "com.td:id/symbol")
	private MobileElement ordersSymbol;
	
	@AndroidFindBy(id = "com.td:id/current_balance")
	private MobileElement currentBalance;
	
	@AndroidFindBy(id = "com.td:id/buyBtn")
	private MobileElement buyETF;
	

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
					&& !mobileAction.verifyElementIsPresent(as_of_timeStamp)) {

				activityTransactionCounter++;
				mobileAction.FunctionSwipe("up", 1000, 200);
			}

			mobileAction.verifyElementIsDisplayed(activity_Transaction,
					activityTransactionCounter + " Activity Transactions");

			
			while(mobileAction.verifyElementIsPresent(currentBalance)){
				mobileAction.FunctionSwipe("down", 200, 200);
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
	public void verifOrdersTab() {

		int OrdersCounter = 0;

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");

			while (mobileAction.verifyElementIsPresent(ordersSymbol)
					&& !mobileAction.verifyElementIsPresent(as_of_timeStamp)) {

				OrdersCounter++;
				mobileAction.FunctionSwipe("up", 1000, 200);
			}

			mobileAction.verifyElementIsDisplayed(ordersSymbol, OrdersCounter + " Orders");

			while(mobileAction.verifyElementIsPresent(currentBalance)){
				mobileAction.FunctionSwipe("down", 200, 200);
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

			if(platform.equalsIgnoreCase("Android")){
				
				ETF = "//android.widget.TextView[@text='SPY']";
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
	

}
