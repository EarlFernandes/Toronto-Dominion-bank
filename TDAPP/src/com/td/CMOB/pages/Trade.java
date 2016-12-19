package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Trade extends _CommonPage {
	private static Trade Trade;

	@iOSFindBy(xpath = "//*[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
	private MobileElement trade_header;

	@iOSFindBy(xpath = "//*[@label='Stocks & ETFs'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Stocks & ETFs' and @index='1']")
	private MobileElement stocks_ETFs;

	@iOSFindBy(xpath = " //*[contains(@label,'Account')]")
	@AndroidFindBy(xpath = "//android.view.View[@index='2']")
	private MobileElement selectAccount;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement listview;

	String CDNMarginAccountXL = getTestdata("Account", "UserIDs");

	String CDNMarginAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
			+ CDNMarginAccountXL + "']";

	@iOSFindBy(xpath = "//*[contains(@label,'Action')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption'")
	private MobileElement tradeAction;

	String Action = getTestdata("Action", "UserIDs");
	String txtAction = "//android.widget.TextView[@resource-id='com.td:id/txtActionType' and @text='" + Action + "']";

	@iOSFindBy(xpath = "//*[contains(@label,'Price')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Market']")
	private MobileElement selectPrice;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement Pricelistview;

	String selectPriceAsLimitXL = getTestdata("SelectPrice", "UserIDs");

	String selectPriceAsLimitXpath = "//android.widget.TextView[@resource-id='com.td:id/txtOrderType' and @text='"
			+ selectPriceAsLimitXL + "']";

	@iOSFindBy(xpath = "//*[@label='Agree']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Agree']")
	private MobileElement AgreeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Quantity'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/captionTextView' and @text='Quantity']")
	private MobileElement selectQuantity;

	@iOSFindBy(xpath = "//*[@label='Day']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Day']")
	private MobileElement btngood;

	String good = getTestdata("GoodTill", "UserIDs");
	String txtgood = "//android.widget.TextView[@resource-id='com.td:id/txtDateType' and @text='" + good + "']";

	@iOSFindBy(xpath = "//*[@value='Enter your trading password']")
	private MobileElement trading_pwd;
	

	@iOSFindBy(xpath = "//*[@value='Please Select']")
	private MobileElement share_holder;

	@iOSFindBy(xpath = "//*[@label='Preview Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btnContinue' and @text='Preview Order']")
	private MobileElement preview_order;

	@iOSFindBy(xpath = "//*[@label='Send Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Send Order']")
	private MobileElement send_order;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Options']")
	private MobileElement options;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	int i = 1;
	String select_Accounts_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String action_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String price_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String goodtilTable="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String shareHolder_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String platformName = CL.getTestDataInstance().getMobilePlatForm();
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + i + Secondpart;
	String quantity = getTestdata("Quantity", "UserIDs");

	public synchronized static Trade get() {
		if (Trade == null) {
			Trade = new Trade();
		}
		return Trade;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");
	}

	/**
	 * This method will click on the Stock&ETFs on Trade page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickStockETFs() {

		try {
			Decorator();
			mobileAction.FuncClick(stocks_ETFs, "Stocks And EFTs");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the Trade Page Header is present or not
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyTrade() {
		Decorator();
		try {
			String verify_trade = "Verifying Trade Page Header";
			mobileAction.verifyElementIsDisplayed(trade_header, verify_trade);
		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void tradeDetails() throws Exception {
		Decorator();
		try {
			mobileAction.FuncClick(selectAccount, "AccountSelected");
			if (platformName.equalsIgnoreCase("ios")) {

				String trade_account_no = getTestdata("FromAccount", "UserIDs");
				mobileAction.FuncSelectElementInTable(select_Accounts_table, Firstpart, Secondpart, trade_account_no);

				mobileAction.FuncClick(tradeAction, "Action");
				String actionToPerform = getTestdata("Action", "UserIDs");
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);
				mobileAction.FuncClick(selectQuantity, "quantity");
				mobileAction.FuncSendKeys(selectQuantity, quantity);
				mobileAction.FuncClick(done, "Done");

				mobileAction.FuncClick(selectPrice, "Price selected");

				String price_value = getTestdata("Price", "UserIDs");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				
				
				mobileAction.FuncClick(btngood, "Good 'til");
				String goodtil_value=getTestdata("Good'til", "UserIDs");
				mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodtil_value);
				mobileAction.FunCSwipeandScroll(trading_pwd);
				
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

				String trading_pwd_value = getTestdata("Trading_Pwd", "UserIDs");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncClick(done, "Done");

				mobileAction.FuncClick(preview_order, "preview_Order");
				
				
				mobileAction.FuncClick(AgreeButton, "Agree Button");
				mobileAction.FuncClick(send_order, "Send_Order");
				mobileAction.FuncClick(send_order, "Send_Order");
			}else{

			mobileAction.FuncElementSwipeWhileNotFound(listview, CDNMarginAccountXpath, 3, "up", true);
			mobileAction.waitForElementToDisappear(CDNMarginAccountXpath);
			mobileAction.FuncClick(tradeAction, "Action");
			mobileAction.FuncElementSwipeWhileNotFound(listview, txtAction, 1, "down", true);

			mobileAction.FuncSendKeys(selectQuantity, quantity);
			mobileAction.FuncClick(selectPrice, "Price selected");
			mobileAction.FuncClick(btngood, "Good 'til");

			mobileAction.FuncElementSwipeWhileNotFound(listview, txtgood, 1, "down", true);
			mobileAction.FuncClick(preview_order, "preview_Order");

			mobileAction.FuncClick(AgreeButton, "Clicked on agree button");
			mobileAction.FuncClick(send_order, "Send_Order");
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	
	
	
	public void clickOnAgree() {
		Decorator();

		try {
			mobileAction.FuncClick(AgreeButton, "Clicked on agree button");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void selectQuantity() {

		Decorator();

		try {

			mobileAction.FuncSendKeys(selectQuantity, getTestdata("Quantity", "UserIDs"));

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the Stock&ETFs on Trade page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickOptions() {

		try {
			Decorator();
			mobileAction.FuncClick(options, "Options");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void tradeDetails_marginAccount() throws Exception {
		Decorator();
		try {
			
			//String margin_account="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[11]/XCUIElementTypeStaticText[1]";
			mobileAction.FuncClick(selectAccount, "AccountSelected");
			if (platformName.equalsIgnoreCase("ios")) {

				String trade_account_no = getTestdata("FromAccount", "UserIDs");
				mobileAction.FuncSelectElementInTable(select_Accounts_table, Firstpart, Secondpart, trade_account_no);
			
				//CL.GetDriver().findElement(By.xpath(margin_account)).click();
				mobileAction.FuncClick(tradeAction, "Action");
				String actionToPerform = getTestdata("Action", "UserIDs");
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);
				mobileAction.FuncClick(selectQuantity, "quantity");
				mobileAction.FuncSendKeys(selectQuantity, quantity);
				mobileAction.FuncClick(done, "Done");

				mobileAction.FuncClick(selectPrice, "Price selected");

				String price_value = getTestdata("Price", "UserIDs");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				
				
				mobileAction.FuncClick(btngood, "Good 'til");
				String goodtil_value=getTestdata("Good'til", "UserIDs");
				mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodtil_value);
				mobileAction.FunCSwipeandScroll(share_holder);
				mobileAction.FuncClick(share_holder, "Share_Holder");
				String shareHolder_value = getTestdata("Trading_Pwd", "UserIDs");
				mobileAction.FuncSelectElementInTable(shareHolder_table, Firstpart, Secondpart, shareHolder_value);
				
				
				
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

				String trading_pwd_value = getTestdata("Trading_Pwd", "UserIDs");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncClick(done, "Done");

				mobileAction.FuncClick(preview_order, "preview_Order");
				
				
				mobileAction.FuncClick(AgreeButton, "Agree Button");
				

}
		} catch (NoSuchElementException e ) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}

