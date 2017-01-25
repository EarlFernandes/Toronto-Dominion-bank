package com.td.CMOB.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

    @iOSFindBy(xpath = "//*[contains(@label,'Limit Price')]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and @index='0']")
    private MobileElement selectLimitPrice;

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

    @iOSFindBy(xpath = "//*[@label='Trigger Delta']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Trigger Delta']")
    private MobileElement btnTriggerDelta;

    @iOSFindBy(xpath = "//*[@label='Mutual Funds']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mutual Funds']")
    private MobileElement mutualfunds;

    @iOSFindBy(xpath = "//*[@label='In Progress']")
    private MobileElement progresssBar;

    @iOSFindBy(xpath = "//*[contains(@label,'Action')]")
    @AndroidFindBy(xpath = "//android.view.View[@resource-id='com.td:id/spinnerLine' and @index='3']")
    private MobileElement selectAction;

    @iOSFindBy(xpath = "//*[@label='Enter name or symbol']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement symbol;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSearchField[@label='Enter name or symbol']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement symbol1;

    @iOSFindBy(xpath = "//*[contains(@label,'Quantity Type')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Quantity Type']")
    private MobileElement txtqnt;

    @iOSFindBy(xpath = "//*[@value='Amount']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement txtamount;

    @iOSFindBy(xpath = "//*[@label='No']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement includesCommissionNo;

    @iOSFindBy(xpath = "//*[@label='Yes']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement includesCommissionYes;

    @iOSFindBy(xpath = "//*[contains(@label,'Dividend Option')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Dividend Option']")
    private MobileElement txtdividendopt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption'and @text='Account'")
    private MobileElement txtaccount;

    @AndroidFindBy(xpath = "//android.widget.ListView[@index='1'")
    private MobileElement list;

    String txtscroll = "Important Information";

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption'and @text='Account'")
    private MobileElement txtaction;

    @iOSFindBy(xpath = "//*[@label='TORONTO DOMINION BANK']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tdticker' and @text='TORONTO DOMINION BANK']")
    private MobileElement selectTD;

    @iOSFindBy(xpath = "//*[@label='Preview Order']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btnContinue' and @text='Preview Order']")
    private MobileElement ClickOnPreviewOrderBtn;

    @iOSFindBy(xpath = "//*[@label='Send Order']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tdticker' and @text='TORONTO DOMINION BANK']")
    private MobileElement Send_Order;

    @iOSFindBy(xpath = "//*[@label='Important Information']")
    private MobileElement importantInfo;

    @iOSFindBy(xpath = "//*[contains(@label,'I consent to receiving the Fund Facts electronically')]")
    private MobileElement confirmMessage;

    @AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
    private MobileElement acntLists;

    @iOSFindBy(xpath = "//*[contains(@label,'')]")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and @index='0']")
    private MobileElement selecttriggerPrice;

    @iOSFindBy(xpath = "//*[contains(@label,'')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption' and @text='Date']")
    private MobileElement date;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@label='Short Sell']")
    private MobileElement shortSell;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@label='Short Sell']")
    private MobileElement buyToCover;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText'and contains(@text,'Delta')]")
    private MobileElement triggerdelta;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
    private MobileElement significant;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
    private MobileElement neither;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
    private MobileElement insider;

    @iOSFindBy(xpath = "//*[@label='%']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
    private MobileElement trigger_type;

    String t_verifyTrade = "Verifying Trade Page Header";

    String progressBar = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']";
    String findaccount = getTestdata("FromAccount", "UserIDs");
    String actions = getTestdata("Action", "UserIDs");
    String goodXL = getTestdata("Good'til", "UserIDs");
    String shareHolderXl = getTestdata("ShareHolder", "UserIDs");
    String price_value = getTestdata("Price", "UserIDs");
    String Triggerdelta = getTestdata("TriggerDelta", "UserIDs");
    String triggerPrice = getTestdata("SelectTriggerPrice", "UserIDs");

    String trade_account_no = getTestdata("CDNMarginAccount", "UserIDs");
    String accselected = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
	    + trade_account_no + "']";
    String actionToPerform = getTestdata("Action", "UserIDs");
    String actionselected = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
	    + actionToPerform + "']";
    String strSelect = getTestdata("Search", "UserIDs");
    String selectSymbol = "//*[contains(@label,'" + strSelect + "')]";
    String quantityType = getTestdata("QuantityType", "UserIDs");
    String dividendOption = getTestdata("Dividend", "UserIDs");
    String trading_pwd_value = getTestdata("Trading_Pwd", "UserIDs");
    String Qty = getTestdata("QuantityType", "UserIDs");
    String qtyselected = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + Qty + "']";
    String div = getTestdata("Dividend", "UserIDs");
    String dividentopt = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + div + "']";
    String limitPrice = getTestdata("SelectLimitPrice", "UserIDs");
    String find_account = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
	    + findaccount + "')]";
    String actiontype = "//android.widget.TextView[@resource-id='com.td:id/txtActionType' and @text='" + actions + "']";

    int i = 1;
    String select_Accounts_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
    String action_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
    String price_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
    String goodtilTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
    String shareHolder_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
    String quantity_TypeTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
    String dividend_Table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
    String orderType = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]";

    String platformName = CL.getTestDataInstance().getMobilePlatForm();
    String Firstpart = "//XCUIElementTypeCell[";
    String Secondpart = "]/XCUIElementTypeStaticText[1]";
    String Finalpart = Firstpart + i + Secondpart;
    String quantity = getTestdata("Quantity", "UserIDs");

    String pricetype = "//android.widget.TextView[@resource-id='com.td:id/txtOrderType' and @text='" + price_value
	    + "']";
    String shareholder_select = "//android.widget.TextView[@resource-id='com.td:id/txtShareHolderType' and @text='"
	    + shareHolderXl + "']";
    String selectgoodtill = "//android.widget.TextView[@resource-id='com.td:id/txtDateType' and @text='" + goodXL
	    + "']";

    public synchronized static Trade get() {
	if (Trade == null) {
	    Trade = new Trade();
	}
	return Trade;
    }

    private void Decorator() {
	PageFactory.initElements(
		new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)),
		this);
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
    public void verifyTrade() throws IOException {
	Decorator();
	try {
	    String t_verifyTrade = "Verifying Trade Page Header";
	    mobileAction.verifyElementIsDisplayed(trade_header, t_verifyTrade);
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
		String goodtil_value = getTestdata("Good'til", "UserIDs");
		mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodtil_value);
		mobileAction.FunCSwipeandScroll(trading_pwd, true);

		mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

		mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
		mobileAction.FuncClick(done, "Done");

		mobileAction.FuncClick(preview_order, "preview_Order");

		mobileAction.FuncClick(AgreeButton, "Agree Button");
		mobileAction.FuncClick(send_order, "Send_Order");
		mobileAction.FuncClick(send_order, "Send_Order");
	    } else {

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

    /**
     * This method is used to tradeDetails with Price as Limit.
     * 
     * @throws Exception
     */

    public void tradeDetails_Limit() throws Exception {
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
		mobileAction.FuncClick(selectLimitPrice, "Limit price selected");
		mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);
		mobileAction.FuncClick(done, "Done");

		mobileAction.FuncClick(btngood, "Good 'til");
		String goodtil_value = getTestdata("Good'til", "UserIDs");
		mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodtil_value);
		mobileAction.FunCSwipeandScroll(trading_pwd, true);

		mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

		mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
		mobileAction.FuncClick(done, "Done");

		mobileAction.FuncClick(preview_order, "preview_Order");

		mobileAction.FuncClick(AgreeButton, "Agree Button");
		mobileAction.FuncClick(send_order, "Send_Order");
		mobileAction.FuncClick(send_order, "Send_Order");
	    } else {

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

	    // String
	    // margin_account="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[11]/XCUIElementTypeStaticText[1]";
	    mobileAction.FuncClick(selectAccount, "AccountSelected");
	    if (platformName.equalsIgnoreCase("ios")) {

		String trade_account_no = getTestdata("FromAccount", "UserIDs");
		mobileAction.FuncSelectElementInTable(select_Accounts_table, Firstpart, Secondpart, trade_account_no);

		// CL.GetDriver().findElement(By.xpath(margin_account)).click();
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
		String goodtil_value = getTestdata("Good'til", "UserIDs");
		mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodtil_value);
		mobileAction.FunCSwipeandScroll(share_holder, true);
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
	} catch (NoSuchElementException e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	} catch (InterruptedException e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	} catch (IOException e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    public void tradeDetails_TriggerDelta() throws Exception {
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

		String triggerDelta_value = getTestdata("TriggerDelta", "UserIDs");
		mobileAction.FunCSwipeandScroll(btngood, true);
		mobileAction.FuncClick(btnTriggerDelta, "TriggerDelta");
		mobileAction.FuncSendKeys(btnTriggerDelta, triggerDelta_value);

		mobileAction.FuncClick(btngood, "Good 'til");
		String goodtil_value = getTestdata("Good'til", "UserIDs");
		mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodtil_value);

		mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

		String trading_pwd_value = getTestdata("Trading_Pwd", "UserIDs");
		mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
		mobileAction.FuncClick(done, "Done");

		mobileAction.FuncClick(preview_order, "preview_Order");

		mobileAction.FuncClick(AgreeButton, "Agree Button");
		mobileAction.FuncClick(send_order, "Send_Order");
		mobileAction.FuncClick(send_order, "Send_Order");
	    } else {

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

    /**
     * This method will click on the MutualFunds on Trade page
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
    public void clickMutualFunds() {

	try {
	    Decorator();
	    mobileAction.FuncClick(mutualfunds, "Mutual Funds");
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will create Mutual Fund
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

    public void createMutualfund() {
	try {
	    Decorator();

	    if (platformName.equalsIgnoreCase("ios")) {
		String searchKeyword = getTestdata("Search", "UserIDs");

		mobileAction.waitForElementToVanish(progresssBar);
		mobileAction.FuncClick(selectAccount, "AccountSelected");
		String accountno = "//*[contains(@label,'" + trade_account_no + "')]";

		MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(accountno));
		mobileAction.FunCSwipeandScroll(marginAccVal, true);
		// mobileAction.FuncSelectElementInTable(select_Accounts_table,
		// Firstpart, Secondpart,trade_account_no );
		mobileAction.waitForElementToDisappear(progressBar);
		mobileAction.FuncClick(selectAction, "Action clicked");
		mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);

		mobileAction.FuncClick(symbol, "Enter name or symbol");
		mobileAction.FuncClick(symbol1, "Enter name or symbol");
		mobileAction.FuncSendKeys(symbol1, searchKeyword);
		MobileElement lstAction = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(selectSymbol));
		lstAction.click();
		mobileAction.FunCSwipeandScroll(trading_pwd, false);

		mobileAction.FuncClick(txtqnt, "Quantity Type");
		mobileAction.FuncSelectElementInTable(quantity_TypeTable, Firstpart, Secondpart, quantityType);

		CL.GetDriver()
			.findElement(By
				.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeTextField[1]"))
			.click();
		CL.GetDriver()
			.findElement(By
				.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeTextField[1]"))
			.sendKeys("10");

		mobileAction.FuncClick(done, "Done");
		if (quantityType.equalsIgnoreCase("Units")) {
		    mobileAction.FuncClick(includesCommissionNo, "Include Commission No");
		} else {

		    mobileAction.FuncClick(includesCommissionYes, "Include Commission Yes");
		}

		mobileAction.FuncClick(txtdividendopt, "Dividend Option");
		mobileAction.FuncSelectElementInTable(dividend_Table, Firstpart, Secondpart, dividendOption);
		mobileAction.FuncClick(trading_pwd, "Trading Password");
		mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
		mobileAction.FuncClick(done, "Done");
		mobileAction.FuncClick(preview_order, "preview_Order");
		mobileAction.waitForElementToVanish(progresssBar);
		mobileAction.FuncClick(AgreeButton, "Clicked on agree button");
		// mobileAction.FunCSwipeandScroll(importantInfo, false);
		// mobileAction.FuncClick(confirmMessage, "Confirm Message");
		mobileAction.FuncClick(Send_Order, "Send Order");
		mobileAction.waitForElementToVanish(progresssBar);

	    } else {

		mobileAction.FuncClick(txtaccount, "Account");
		mobileAction.FuncElementSwipeWhileNotFound(list, accselected, 7, "up", true);
		mobileAction.FuncClick(txtaction, "Action");
		mobileAction.FuncElementSwipeWhileNotFound(list, actionselected, 1, "up", true);
		mobileAction.FuncClick(symbol, "Enter name or symbol");
		mobileAction.FuncSendKeys(symbol, getTestdata("Search", "UserIDs"));
		String selectedTD = mobileAction.getText(selectTD);
		mobileAction.FuncClick(selectTD, selectedTD);
		mobileAction.FunctionSwipe("Up", 200, 200);
		mobileAction.FuncClick(txtqnt, "Quantity Type");
		mobileAction.FuncElementSwipeWhileNotFound(list, qtyselected, 1, "down", true);
		mobileAction.FuncSendKeys(txtamount, getTestdata("Amount", "UserIDs"));
		mobileAction.FuncClick(txtdividendopt, "Dividend Option");
		mobileAction.FuncElementSwipeWhileNotFound(list, dividentopt, 1, "down", true);
		mobileAction.FuncClick(ClickOnPreviewOrderBtn, "Preview order button clicked");
		mobileAction.FuncClick(AgreeButton, "Clicked on agree button");

	    }

	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	} catch (Exception e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click CDN Margin Account
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void CDNAccount() throws Exception {
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		String accountno = "//*[contains(@label,'" + trade_account_no + "')]";
		mobileAction.FuncClick(selectAccount, "AccountSelected");
		MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(accountno));
		mobileAction.FunCSwipeandScroll(marginAccVal, true);
	    } else {
		mobileAction.FuncClick(selectAccount, "Click Account");
		mobileAction.FuncElementSwipeWhileNotFound(acntLists, find_account, 2, "down", true);
	    }

	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will Click on Action Type Cover is Present or Not.
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */
    public void clickAction() throws Exception {
	Decorator();

	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		String actionToPerformXL = getTestdata("Action", "UserIDs");
		mobileAction.FuncClick(selectAction, "Action clicked");
		mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerformXL);
	    } else {
		mobileAction.FuncClick(selectAction, "Click Action");
		mobileAction.FuncElementSwipeWhileNotFound(acntLists, actiontype, 1, "down", true);
	    }
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click Quantity
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */
    public void clickQuantity() {
	Decorator();

	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		CL.GetDriver()
			.findElement(By
				.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeTextField[1]"))
			.click();
		CL.GetDriver()
			.findElement(By
				.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeTextField[1]"))
			.sendKeys("10");

		mobileAction.FuncClick(done, "Done");
	    } else {
		mobileAction.FuncClick(selectQuantity, "quantity");
		mobileAction.FuncSendKeys(selectQuantity, quantity);
		mobileAction.FuncHideKeyboard();
	    }

	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click Limit Price
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void LimitPrice() {
	Decorator();

	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

	    } else {
		mobileAction.FuncClick(selectLimitPrice, "Limit Price");
		mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);
		mobileAction.FuncHideKeyboard();
	    }
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click Limit Price
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void TriggerPrice() {
	Decorator();

	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
	    } else {
		mobileAction.FuncClick(selecttriggerPrice, "Trigger Price");
		mobileAction.FuncSendKeys(selecttriggerPrice, triggerPrice);
		mobileAction.FuncHideKeyboard();
	    }
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will select Date
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void date() {
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

	    } else {
		mobileAction.FuncClick(date, "Date");
		SimpleDateFormat df = new SimpleDateFormat("dd");
		Calendar calobj = Calendar.getInstance();
		String dateVal = df.format(calobj.getTime());
		CL.GetDriver().findElement(By.xpath("//android.widget.TextView[@content-desc='" + dateVal + "']"))
			.click();
	    }
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click the Price and enter the value of the Price
     * 
     * @return void
     * @throws Exception
     * 
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void clickPrice() throws Exception {
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		mobileAction.FuncClick(selectPrice, "Price Selected");
		String price_value = getTestdata("Price", "UserIDs");
		mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
		mobileAction.FunCSwipeandScroll(trading_pwd, false);
	    } else {
		mobileAction.FuncClick(selectPrice, "Price Selected");
		mobileAction.FuncElementSwipeWhileNotFound(acntLists, pricetype, 1, "down", true);
	    }
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    public void clickShareHolder() throws Exception {
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		String shareHolderXl = getTestdata("ShareHolder", "UserIDs");
		mobileAction.FuncClick(share_holder, "ShareHolder");
		mobileAction.FuncSelectElementInTable(shareHolder_table, Firstpart, Secondpart, shareHolderXl);
		mobileAction.FunCSwipeandScroll(trading_pwd, false);
	    } else {
		mobileAction.FuncClick(share_holder, "ShareHolder");
		mobileAction.FuncElementSwipeWhileNotFound(acntLists, shareholder_select, 1, "down", true);
	    }
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click the Preview Order Button
     *
     * @return void
     * @throws Exception
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void clickGoodTill() throws Exception {
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		mobileAction.FuncClick(btngood, "Good 'til");
		String goodXL = getTestdata("GoodTill", "UserIDs");
		mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodXL);
	    } else {
		mobileAction.FuncClick(btngood, "Good 'til");
		mobileAction.FuncElementSwipeWhileNotFound(acntLists, selectgoodtill, 1, "down", true);
	    }
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click the Preview Order Button
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void clickAgreebutton() {
	Decorator();
	try {
	    mobileAction.FuncClick(AgreeButton, "Click Agree");
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click the Preview Order Button
     *
     * @return void
     * @throws Exception
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void clickPreviewOrder() {
	Decorator();
	try {
	    mobileAction.FuncClick(preview_order, "Preview Order");
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click on TriggerDelta
     * 
     * @return void
     * 
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     * 
     */

    public void TriggerDelta() {
	try {
	    Decorator();
	    mobileAction.FuncClick(triggerdelta, "Trigger Delta");
	    mobileAction.FuncSendKeys(triggerdelta, Triggerdelta);
	    mobileAction.FuncHideKeyboard();
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click the trading password field and send the values
     *
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void tradingPassword() throws Exception {
	Decorator();
	try {
	    String trading_pwd_XL = getTestdata("Trading_Pwd", "UserIDs");
	    mobileAction.FuncClick(trading_pwd, "Trading Password");
	    mobileAction.FuncSendKeys(trading_pwd, trading_pwd_XL);
	    mobileAction.FuncClick(done, "Done");
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will verify the Trade Page Header is present or not
     * 
     * @return void
     * @throws Exception
     * 
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */
    public void clickOrderType() throws Exception {
	Decorator();
	try {
	    mobileAction.verifyElementIsDisplayed(trade_header, t_verifyTrade);
	    MobileElement OrderType = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(orderType));

	    mobileAction.FuncClick(OrderType, "OrderType");
	    String orderValueXL = getTestdata("Ordervalue", "UserIDs");
	    String orderValue = "//*[contains(@label,'" + orderValueXL + "')]";
	    MobileElement ordertypeval = (MobileElement) ((AppiumDriver) CL.GetDriver())
		    .findElement(By.xpath(orderValue));
	    mobileAction.FunCSwipeandScroll(ordertypeval, true);
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will Search the symbol and click the searched value
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void clickSymbol() {
	Decorator();

	try {
	    String searchKeyword = getTestdata("Search", "UserIDs");
	    mobileAction.FuncClick(symbol, "Enter name or symbol");
	    mobileAction.FuncClick(symbol1, "Enter name or symbol");
	    mobileAction.FuncSendKeys(symbol1, searchKeyword);
	    Thread.sleep(2000);
	    mobileAction.FuncClick(selectTD, "Symbol");
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will Verify the Actions Fields like Short Sell and Buy To
     * Cover is Present or Not.
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void verifyActionShortSellandBuyToCover() throws Exception {
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

		String accountno = "//*[contains(@label,'" + trade_account_no + "')]";
		mobileAction.FuncClick(selectAccount, "AccountSelected");
		MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(accountno));
		mobileAction.FunCSwipeandScroll(marginAccVal, true);
		mobileAction.FuncClick(selectAction, "Action clicked");
		mobileAction.verifyElementIsDisplayed(shortSell, "Short Sell is Displayed");
		mobileAction.verifyElementIsDisplayed(buyToCover, "Buy to Cover is Displayed");
	    }
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will Form_4537_4541 Verify functionality of Shareholder type
     * field
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void verifyShareHolderWithDiffAcc() throws Exception {
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		mobileAction.FuncClick(selectAccount, "AccountSelected");
		String trade_account_no = getTestdata("CDNMarginAccount", "UserIDs");
		String[] trade_accountValue = trade_account_no.split(":");
		System.out.println(trade_accountValue[0]);

		String accountno = "//*[contains(@label,'" + trade_accountValue[0] + "')]";

		MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(accountno));
		mobileAction.FunCSwipeandScroll(marginAccVal, true);

		MobileElement lstAction = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(selectSymbol));
		lstAction.click();
		mobileAction.FuncClick(selectAction, "Action clicked");
		mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);
		mobileAction.FunCSwipeandScroll(trading_pwd, false);
		CL.GetDriver()
			.findElement(By
				.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeTextField[1]"))
			.click();
		CL.GetDriver()
			.findElement(By
				.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeTextField[1]"))
			.sendKeys("100");
		mobileAction.FuncClick(done, "Done");
		String price_value = getTestdata("Price", "UserIDs");
		mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
		mobileAction.FuncClick(share_holder, "Share_holder");
		mobileAction.verifyElementIsDisplayed(insider, "Insider");
		mobileAction.verifyElementIsDisplayed(significant, "Significant");
		mobileAction.verifyElementIsDisplayed(neither, "Neither");

		mobileAction.FuncClick(marginAccVal, "The First CDN Accout has been clicked");
		String accountno2 = "//*[contains(@label,'" + trade_accountValue[1] + "')]";
		MobileElement marginAccVal2 = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(accountno2));
		mobileAction.FunCSwipeandScroll(marginAccVal2, true);
		mobileAction.verifyElementNotPresent(share_holder, "ShareHolder is not Present");
	    }
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

    }

    /**
     * This method will Form_4537_4551_ENG Customer changes the account type
     * from Long to Short
     * 
     * @return void
     * @throws Exception
     * 
     * @ throws
     * @throws InterruptedException
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */

    public void trade_USMarginAccountLongToShort() throws Exception {
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

		String searchKeyword = getTestdata("Search", "UserIDs");
		String accountno = "//*[contains(@label,'" + trade_account_no + "')]";
		mobileAction.FuncClick(selectAccount, "AccountSelected");
		MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(accountno));
		mobileAction.FunCSwipeandScroll(marginAccVal, true);

		mobileAction.FuncClick(selectAction, "Action clicked");
		mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);
		mobileAction.FunCSwipeandScroll(trading_pwd, false);
		CL.GetDriver()
			.findElement(By
				.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeTextField[1]"))
			.click();
		CL.GetDriver()
			.findElement(By
				.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeTextField[1]"))
			.sendKeys("100");
		mobileAction.FuncClick(done, "Done");
		mobileAction.FuncClick(trigger_type, "Trigger type");

		String price_value = getTestdata("Price", "UserIDs");
		mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);

		String limitDataXL = getTestdata("LimitDelta", "UserIDs");

	    }
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

    }

}
