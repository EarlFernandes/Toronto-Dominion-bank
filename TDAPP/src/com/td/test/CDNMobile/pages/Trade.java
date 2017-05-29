package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Trade extends _CommonPage {
	private static Trade Trade;

	// redone

	String orderType = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]";
	String orderType_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";
	String select_Accounts_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";

	String action_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]";

	String price_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]";
	String goodtilTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]";

	String shareHolder_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]";
	String quantity_TypeTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String dividend_Table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String t_verifyTrade = "Verifying Trade Page Header";

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='OK']")
	private MobileElement ok;

	int i = 1;
	String platformName = CL.getTestDataInstance().getMobilePlatForm();
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + i + Secondpart;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Action')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption' and @text='Action' and @index='0']")
	private MobileElement selectAction;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Choisissez']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption' and @text='Action' and @index='0']")
	private MobileElement selectActionFRE;

	@iOSFindBy(xpath = " //XCUIElementTypeStaticText[contains(@label,'Account') or contains(@label,'Compte')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption' and (@text='Account' or @text='Compte')]")
	private MobileElement selectAccount;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement list;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and (@text='Loading' or @text='Chargement')]")
	private MobileElement progressBar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption' and (contains(@text,'ordre') or @text='Order Type')]")
	private MobileElement order_Type;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (@text='Trade' or @text='Négociation')]")
	private MobileElement trade_header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Enter name or symbol' or contains(@label,'nom ou le symbole')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSearchTitle' and (@text='Enter name or symbol' or @text='Entrez le nom ou le symbole')]")
	private MobileElement symbol;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSearchField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_search_field_search_mode' and (@text='Enter name or symbol' or @text='Entrez le nom ou le symbole')]")
	private MobileElement symbolEditText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/market_name'][1]")
	private MobileElement selectSymbolValue;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeTextField[1]")
//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and (contains(@text,'Trigger Price ($)') or contains(@text,'Dï¿½clenchement'))]")
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.td:id/amountEditText'])[2]")//@Author - Sushil 17-Apr-2017
	private MobileElement triggerPriceEditText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeTextField[1]")
//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and (contains(@text,'Limit Price ($)')or contains(@text,'Cours limite'))]")
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.td:id/amountEditText'])[2]")//@Author - Sushil 17-Apr-2017
	private MobileElement limitPriceEditText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeTextField[1]")
//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and (contains(@text,'Limit Price ($)')or contains(@text,'Cours limite'))]")
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.td:id/amountEditText'])[3]")//@Author - Sushil 17-Apr-2017
	private MobileElement limitPriceEditTextWithTrigger;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Day' or @label='Jour']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and (@text='Day' or @text='Jour')]")
	private MobileElement btngood;

//	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Enter your trading password' or @value='Entrer votre mot de passe de Négociation']")
	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Enter your trading password' or @value='Entrer votre mot de passe de négociation']")//@Author - Shahbaaz 17-Apr-2017
//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/editTextPassword' and (@content-desc='Enter your trading password' or @content-desc='Entrer votre mot de passe')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/editTextPassword']")
	private MobileElement trading_pwd;
	// for french
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Please Select']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption' and @text='Shareholder Type']")
	private MobileElement share_holder;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeTextField[1]")
//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and (contains(@text,'Trigger Delta')or contains(@text,'dï¿½clenchement'))]")
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.td:id/amountEditText'])[2]")//@Author - Sushil 17-Apr-2017
	private MobileElement triggerDelta;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeTextField[1]")
//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and (contains(@text,'Limit Delta ($)')or contains(@text,'$ Delta limite,'))]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Limit Delta') or contains(@text,'Delta limite')]/../*[1]") //@Author - Sushil 17-Apr-2017
	private MobileElement limitDelta;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]/XCUIElementTypeTextField[1]")
	//@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and (contains(@text,'Limit Delta ($)')or contains(@text,'$ Delta limite,'))]")
	//@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Limit Delta') or contains(@text,'Delta limite')]/../*[1]") //@Author - Sushil 17-Apr-2017
	@AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id='com.td:id/amountEditText'])[3]") //@Author - Sushil 17-Apr-2017
	private MobileElement limitDeltaWithTrigger;

	//@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Preview Order' or contains(@label,'Aperï¿½u de')]")Aperçu de l'ordre
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Preview Order' or contains(@label,'ordre')]")//@Author - Shahbaaz 25-May-2017
	
//	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/orderEntryPreviewButton' and (@text='Preview Order' or contains(@text,'Aperï¿½u de'))]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/orderEntryPreviewButton']") //@Author - Sushil 18-Apr-2017
	private MobileElement preview_order;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Agree' or @label='Accepte']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Agree' or @text='Accepte']")
	private MobileElement agreeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Do not agree' or contains(@label='accepte pas')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Do not agree' or contains(@text='accepte pas')]")
	private MobileElement doNotAgreeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[@label='Quantity' or contains(@label,'Quantit')]/../XCUIElementTypeTextField")
	//@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and (contains(@text,'Quantity') or contains(@text,'Quantitï¿½'))]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText']")
	private MobileElement selectQuantity;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Price')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Market' or @text='Cours du marché')and @resource-id='com.td:id/selectedText']")
	private MobileElement selectPrice;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Cours')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Market' or @text='Cours du marché') and @resource-id='com.td:id/selectedText']")
	private MobileElement selectPriceFRE;

	@AndroidFindBy(xpath = "//android.widget.Button[(@text='Cancel' or @text='Annuler') and @resource-id='android:id/button2']")
	private MobileElement ignoreBackButton;
	String accountToSelect = "";
	String accountNumberXpath = "";
	String accountNumberiOSXpath = "";
	String accselected = "";

	String shareholder_select = "";

	String selectgoodtill = "";
	String txtAction = "";

	String orderValue = "";

	String pricetype = "";
	String accountno = "";

	String quantityXL = "";

	String trade_account_no = "";

	String orderValueXL = "";

	String price_value = "";

	String goodXL = "";
	String shareHolderXl = "";

	boolean isLanguageFrench = false;

	String Action = "";
	String actionToPerformXL = "";
	String searchKeyword = "";
	String trading_pwd_XL = "";
	String triggerDelta_value = "";
	String limitDelta_value = "";
	String currentPricePath = null;
	String selectPriceChangeOrder = "";

	MobileElement priceTypeChangeOrderElement;
	String priceTypeChangeOrderValue;

	public synchronized static Trade get() {
		if (Trade == null) {
			Trade = new Trade();
		}
		return Trade;
	}

	public Trade() {
		Decorator();
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)),
				this);
	}

	public void init() {

		quantityXL = getTestdata("Quantity");
		trade_account_no = setCurrentArrayValue(getTestDataStringArray("CDNMarginAccount"));

		orderValueXL = getTestdata("Ordervalue");

		price_value = getTestdata("Price", 0);

		goodXL = getTestdata("Good'til", 0);

		shareHolderXl = getTestdata("ShareHolder");

		isLanguageFrench = getTestdata("Language").equals("FRE");

		Action = getTestdata("Action");

		actionToPerformXL = getTestdata("Action");
		searchKeyword = getTestdata("Search");

		trading_pwd_XL = getTestdata("Trading_Pwd");
		triggerDelta_value = getTestdata("TriggerDelta");

		limitDelta_value = getTestdata("LimitDelta");

		accountToSelect = "//*[contains(@label,'" + trade_account_no + "')]";
		accountNumberXpath = "//android.widget.TextView[@resource-id='com.td:id/selectedValue' and @text='"
				+ trade_account_no + "']";

		accountNumberiOSXpath = "//*[@label='" + trade_account_no + "']";

		accselected = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
				+ trade_account_no + "']";

		shareholder_select = "//android.widget.TextView[@text='" + shareHolderXl + "']";
		
		/*shareholder_select = "@text='"
				+ shareHolderXl + "']";*/

		selectgoodtill = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + goodXL + "']";
		txtAction = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + Action + "']";

		orderValue = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and contains(@text,'"
				+ orderValueXL + "')]";
		pricetype = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + price_value + "']";
		accountno = "//*[contains(@label,'" + trade_account_no + "')]";
		CL.getTestDataInstance().TCParameters.put("FirstOverExecution", "TRUE");
	}

	public String setCurrentArrayValue(String[] arrayValue) {
		String valueToReturn;
		if (arrayValue.length == 2) {
			if (CL.getTestDataInstance().TCParameters.containsKey("FirstOverExecution")) {
				String changeOrder = CL.getTestDataInstance().TCParameters.get("FirstOverExecution");
				if (changeOrder.equals("TRUE")) {
					valueToReturn = arrayValue[1];
				} else {
					valueToReturn = arrayValue[0];
				}
			} else {
				valueToReturn = arrayValue[0];
			}
		} else {
			valueToReturn = arrayValue[0];
		}
		return valueToReturn;
	}

	public void selectAccount() {

		try {
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(trade_header, t_verifyTrade);
			//mobileAction.FunctionSwipe("up", 200, 200);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				//MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
					//	.findElement(By.xpath(accountno));
				
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(accountno, true, 60, "Up");
				//mobileAction.FunCSwipeandScroll(marginAccVal, true);
			} else {
				mobileAction.FuncClick(selectAccount, "Account Selected");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(accselected, true, 60, "up");
			}
			mobileAction.waitForElementToVanish(progressBar);
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void selectAccountShareHolder() {
		//
		try {
			trade_account_no = getTestdata("CDNMarginAccount", 1);
			accselected = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
					+ trade_account_no + "']";

			mobileAction.FunctionSwipe("down", 200, 200);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(accountno));
				mobileAction.FunCSwipeandScroll(marginAccVal, true);
			} else {
				mobileAction.FuncClick(selectAccount, "Account Selected");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(accselected, true, 60, "up");
			}
			mobileAction.waitForElementToVanish(progressBar);

			mobileAction.FunctionSwipe("up", 200, 200);
			if (!mobileAction.FuncIsDisplayed(share_holder)) {
				CL.GetReporting().FuncReport("Pass", "The ShareHolder is verified for both the Accounts");

			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void selectOrderType() {
		//
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				MobileElement OrderType = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(orderType));

				mobileAction.FuncClick(OrderType, "OrderType");
				String orderValue = "//XCUIElementTypeStaticText[contains(@label,'" + orderValueXL + "')]";
				MobileElement ordertypeval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(orderValue));
				mobileAction.FunCSwipeandScroll(ordertypeval, true);
			} else {
				mobileAction.FuncClick(order_Type, "OrderType");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(orderValue, true, 1, "up");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void selectAction() {
		//

		MobileElement actionElement = isLanguageFrench ? selectActionFRE : selectAction;

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(actionElement, "Action clicked");
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerformXL);

			} else {
				// mobileAction.FunctionSwipe("up", 200, 50);
				//mobileAction.FuncClick(actionElement, "Action");
				mobileAction.FuncSwipeWhileElementNotFound(actionElement, true, 1, "up");
				MobileElement actionList = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(txtAction));
				mobileAction.verifyElementIsDisplayed(actionList, actionList.getText());
				mobileAction.FuncClick(actionList, "Action value clicked");

			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void selectAndEnterSymbol() {
		//

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				/*mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbolEditText, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
				mobileAction.FuncClick(selectSymbolValue, "Symbol");
				*/
				
				/*mobileAction.FuncClick(symbol, "Enter name or symbol");
				//mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
				SearchPageMIT.get().enterSymbol(symbolEditText, searchKeyword);
				//SearchPageMIT.get().clickFirstSymbol(searchKeyword);
				mobileAction.waitForElementToVanish(progressBar);
				//Thread.sleep(2000);*/	
			try{
				String xpathSymbolFlag_ios="//XCUIElementTypeCell[contains(@label,'CA') or contains(@label,'Comptant CAN']";
				SearchPageMIT.get().clickFirstSymbol1(searchKeyword);
			Thread.sleep(1000);
				//mobileAction.FuncClick((MobileElement) CL.GetDriver().findElements(By.xpath(xpathSymbolFlag_ios)).get(0),"First Symbol");
			//	Thread.sleep(1000);
				
				}catch(Exception e){
					e.printStackTrace();
					System.out.println(e.getMessage());
				}

			} else {

				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbolEditText, "Enter name or symbol");
			//	mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
				SearchPageMIT.get().enterSymbol(symbolEditText, searchKeyword);
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(selectSymbolValue, "Symbol");

				mobileAction.waitForElementToVanish(progressBar);

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void limitPrice(String limitPrice, boolean isOption) {

		//

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {

			CL.getTestDataInstance().TCParameters.put("LimitPrice", limitPrice);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunCSwipeandScroll(limitPriceEditText, true);
				if (isOption) {
					limitPriceEditText.clear();
				}
				mobileAction.FuncSendKeys(limitPriceEditText, limitPrice);
				mobileAction.FuncClick(doneOK, "Done");
			} else {

				mobileAction.FunctionSwipe("up", 200, 100);

				mobileAction.FuncClick(limitPriceEditText, "Limit Price");
				// mobileAction.FuncSwipeWhileElementNotFound(limitPriceEditText,
				// false, 5, "up");

				mobileAction.FuncClick(limitPriceEditText, "Limit Price EditText");
				if (isOption) {
					limitPriceEditText.clear();
				}
				mobileAction.FuncSendKeys(limitPriceEditText, limitPrice);
				mobileAction.FuncHideKeyboard();
				if (mobileAction.FuncIsDisplayed(ignoreBackButton)) {
					mobileAction.FuncClick(ignoreBackButton, "ignore back");
				}
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			e.printStackTrace();
		}
	}

	public void limitPriceWithTrigger(String limitPrice) {

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {

			CL.getTestDataInstance().TCParameters.put("LimitPrice", limitPrice);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunCSwipeandScroll(limitPriceEditTextWithTrigger, true);
				mobileAction.FuncSendKeys(limitPriceEditTextWithTrigger, limitPrice);
				mobileAction.FuncClick(doneOK, "Done");
			} else {

				mobileAction.FunctionSwipe("up", 200, 100);

				mobileAction.FuncClick(limitPriceEditTextWithTrigger, "Limit Price");
				// mobileAction.FuncSwipeWhileElementNotFound(limitPriceEditTextWithTrigger,
				// false, 5, "up");

				mobileAction.FuncClick(limitPriceEditTextWithTrigger, "Limit Price EditText");
				mobileAction.FuncSendKeys(limitPriceEditTextWithTrigger, limitPrice);
				mobileAction.FuncHideKeyboard();
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			e.printStackTrace();
		}
	}

	public void triggerPrice(String triggerPriceValue) {

		//

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {

			CL.getTestDataInstance().TCParameters.put("TriggerPrice", triggerPriceValue);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(triggerPriceEditText, "TriggerPrice");
				mobileAction.FuncSendKeys(triggerPriceEditText, triggerPriceValue);
				mobileAction.FuncClick(doneOK, "Done");
			} else {

				mobileAction.FunctionSwipe("up", 200, 100);
				Thread.sleep(1000);

				mobileAction.FuncClick(triggerPriceEditText, "Trigger Price");
				// mobileAction.FuncSwipeWhileElementNotFound(triggerPriceEditText,
				// false, 5, "up");
				mobileAction.FuncClick(triggerPriceEditText, "Trigger Price EditText");
				mobileAction.FuncSendKeys(triggerPriceEditText, triggerPriceValue);
				mobileAction.FuncHideKeyboard();
			}

		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void enterLimitPrice() {

		DecimalFormat df = new DecimalFormat("#.##");
		Double marketPrice = null;
		try {
			String pricePath = CL.getTestDataInstance().TCParameters.get("CurrentPrice");
			// if (!isLanguageFrench) {
			System.out.println(pricePath);
			marketPrice = dollarStringToDouble(pricePath);

			System.out.println(marketPrice);
			System.out.println("Market Price is old value" + marketPrice);
			// } else {
			// marketPrice = Double.parseDouble(pricePath.replace("$", ""));
			//
			// }
			marketPrice = marketPrice + 0.5;
			System.out.println("Market Price is " + df.format(marketPrice));

		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			e.printStackTrace();
		}

		limitPrice(df.format(marketPrice).toString(), false);
	}

	public void enterLimitPriceDAYEXT() {

		DecimalFormat df = new DecimalFormat("#.##");
		Double marketPrice = null;
		try {
			String pricePath = CL.getTestDataInstance().TCParameters.get("CurrentPrice");
			// if (!isLanguageFrench) {
			marketPrice = dollarStringToDouble(pricePath);

			System.out.println("Market Price is old value" + marketPrice);
			// } else {
			// marketPrice = Double.parseDouble(pricePath.replace("$", ""));
			//
			// }
			marketPrice = marketPrice - 0.5;
			System.out.println("Market Price is " + df.format(marketPrice));

		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			e.printStackTrace();
		}

		limitPrice(df.format(marketPrice).toString(), false);
	}

	public void enterTriggerPrice() {
		Double marketPrice = null;

		DecimalFormat df = new DecimalFormat("#.##");
		try {
			String pricePath = CL.getTestDataInstance().TCParameters.get("CurrentPrice");

			// if (!isLanguageFrench) {
			marketPrice = dollarStringToDouble(pricePath);

			System.out.println("Market Price is old value" + marketPrice);
			// } else {
			// marketPrice = Double.parseDouble(pricePath.replace("$", ""));
			//
			// }
			marketPrice += 1;
			System.out.println("Market Price is " + df.format(marketPrice));

		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

		triggerPrice(df.format(marketPrice).toString());
	}

	public void enterTriggerPriceSell() {
		Double marketPrice = null;

		DecimalFormat df = new DecimalFormat("#.##");
		try {
			String pricePath = CL.getTestDataInstance().TCParameters.get("CurrentPrice");

			// if (!isLanguageFrench) {
			marketPrice = dollarStringToDouble(pricePath);

			System.out.println("Market Price is old value" + marketPrice);
			// } else {
			// marketPrice = Double.parseDouble(pricePath.replace("$", ""));
			//
			// }
			marketPrice = marketPrice - 0.5;
			;
			System.out.println("Market Price is " + df.format(marketPrice));

		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

		triggerPrice(df.format(marketPrice).toString());
	}

	public void enterlimitAndTriggerPrice() {

		String pricePath = CL.getTestDataInstance().TCParameters.get("CurrentPrice");

		Double marketPrice = dollarStringToDouble(pricePath);
		Double limitPrice = marketPrice + 0.5;
		Double triggerPrice = (marketPrice + limitPrice) / 2;
		System.out.println("Limit Price is " + limitPrice);

		triggerPrice(triggerPrice.toString());
		limitPriceWithTrigger(limitPrice.toString());
	}

	public void enterlimitAndTriggerPriceSell() {

		String pricePath = CL.getTestDataInstance().TCParameters.get("CurrentPrice");

		Double marketPrice = dollarStringToDouble(pricePath);
		Double triggerPrice = marketPrice - 0.5;
		Double limitPrice = marketPrice - 0.8;
		System.out.println("Limit Price is " + limitPrice);

		triggerPrice(triggerPrice.toString());
		limitPriceWithTrigger(limitPrice.toString());
	}

	public double dollarStringToDouble(String dollarString) {
		// Enable French amount validation
		String pattern = "(\\d.\\$)";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(dollarString);
		if (m.find()) {
			String str = dollarString.replaceAll("[^\\d,]", "");
			str = str.replaceAll(",", ".");
			return Double.parseDouble(str);
		} else {
			return Double.parseDouble(dollarString.replace("$", "").replace(",", "").replace("USD", ""));
		}
	}

	public void selectPrice() {
		//

		MobileElement priceElement = isLanguageFrench ? selectPriceFRE : selectPrice;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(priceElement, "Price Selected");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {

				// if (!mobileAction.FuncIsDisplayed(priceElement)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				mobileAction.FuncClick(priceElement, "Price");
				// mobileAction.FuncSwipeWhileElementNotFound(priceElement,
				// true, 5, "up");
				MobileElement priceType = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(pricetype));
				mobileAction.FuncClick(priceType, "Price");
			}
		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void selectGoodTill() {
		//

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(btngood, "Good 'til");
				mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodXL);
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {

				// if (!mobileAction.FuncIsDisplayed(btngood)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				mobileAction.FuncClick(btngood, "Good Till");
				// mobileAction.FuncSwipeWhileElementNotFound(btngood, true, 1,
				// "up");
				MobileElement actionList = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(selectgoodtill));

				mobileAction.FuncClick(actionList, "Good'Till value");
			}

		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void selectGoodTillChangeOrder() {
		//

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(btngood, "Good 'til");
				mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodXL);
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {

				// if (!mobileAction.FuncIsDisplayed(btngood)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				mobileAction.FuncClick(btngood, "Good Till");
				// mobileAction.FuncSwipeWhileElementNotFound(btngood, true, 1,
				// "up");
				MobileElement actionList = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(selectgoodtill));

				mobileAction.FuncClick(actionList, "Good'Till value");
			}

		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void enterTradingPassword() {
		//
		MobileElement doneOK = isLanguageFrench ? ok : done;

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FunctionSwipe("up", 200, 100);
				mobileAction.FuncClick(trading_pwd, "Trading Password");
				// mobileAction.FuncSwipeWhileElementNotFound(trading_pwd, true,
				// 1,
				// "up");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_XL);
				Thread.sleep(1000);
				mobileAction.FuncClick(doneOK, "Done");
			} else {
				mobileAction.FunctionSwipe("up", 200, 100);
				mobileAction.FuncClick(trading_pwd, "Trading Password");
				mobileAction.verifyElementIsDisplayed(trading_pwd, "Trading Password");

				// mobileAction.FuncSwipeWhileElementNotFound(trading_pwd, true,
				// 1,
				// "up");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_XL);
				mobileAction.FuncHideKeyboard();
				if (mobileAction.FuncIsDisplayed(ignoreBackButton)) {
					mobileAction.FuncClick(ignoreBackButton, "ignore back");
				}
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void selectQuantity() {
		//

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
				mobileAction.FuncClick(doneOK, "Done");

			} else {

				// if (!mobileAction.FuncIsDisplayed(selectQuantity)) {
				// mobileAction.FunctionSwipe("up", 200, 100);
				// }
				// mobileAction.FuncClick(selectQuantity, "Quantity");
				try {
					mobileAction.FuncSwipeWhileElementNotFound(selectQuantity, true, 1, "up");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
				mobileAction.FuncHideKeyboard();
				if (mobileAction.FuncIsDisplayed(ignoreBackButton)) {
					mobileAction.FuncClick(ignoreBackButton, "ignore back");
				}

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	public void enterTriggerDelta() {

		//

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(triggerDelta, "Trigger Delta");
				mobileAction.FuncSendKeys(triggerDelta, triggerDelta_value);
				mobileAction.FuncClick(doneOK, "Done");
			} else {

				// if (!mobileAction.FuncIsDisplayed(triggerDelta)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				mobileAction.FuncClick(triggerDelta, "Trigger Delta");
				// mobileAction.FuncSwipeWhileElementNotFound(triggerDelta,
				// true, 1, "up");
				mobileAction.FuncSendKeys(triggerDelta, triggerDelta_value);
				mobileAction.FuncHideKeyboard();
				if (mobileAction.FuncIsDisplayed(ignoreBackButton)) {
					mobileAction.FuncClick(ignoreBackButton, "ignore back");
				}
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void enterLimitDelta() {

		//

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(limitDelta, "Limit Delta");
				mobileAction.FuncSendKeys(limitDelta, limitDelta_value);
				mobileAction.FuncClick(doneOK, "Done");
			} else {

				// if (!mobileAction.FuncIsDisplayed(limitDelta)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				mobileAction.FuncClick(limitDelta, "Limit Delta");
				// mobileAction.FuncSwipeWhileElementNotFound(limitDelta, true,
				// 1, "up");
				mobileAction.FuncSendKeys(limitDelta, limitDelta_value);
				mobileAction.FuncHideKeyboard();
				if (mobileAction.FuncIsDisplayed(ignoreBackButton)) {
					mobileAction.FuncClick(ignoreBackButton, "ignore back");
				}
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void enterLimitDeltaWithTrigger() {

		//

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(limitDeltaWithTrigger, "Limit Delta");
				mobileAction.FuncSendKeys(limitDeltaWithTrigger, limitDelta_value);
				mobileAction.FuncClick(doneOK, "Done");
			} else {
				// if (!mobileAction.FuncIsDisplayed(limitDeltaWithTrigger)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				mobileAction.FuncClick(limitDeltaWithTrigger, "Limit Delta");
				// mobileAction.FuncSwipeWhileElementNotFound(limitDeltaWithTrigger,
				// true, 1, "up");
				mobileAction.FuncSendKeys(limitDeltaWithTrigger, limitDelta_value);
				mobileAction.FuncHideKeyboard();
				if (mobileAction.FuncIsDisplayed(ignoreBackButton)) {
					mobileAction.FuncClick(ignoreBackButton, "ignore back");
				}
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void enterLimitAndTriggerDelta() {

		enterTriggerDelta();
		enterLimitDeltaWithTrigger();
	}

	public void selectShareHolder() {//************************************JA
		//
		try {
			if (!shareHolderXl.isEmpty()) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

					mobileAction.FuncClick(share_holder, "ShareHolder");
					mobileAction.FuncSelectElementInTable(shareHolder_table, Firstpart, Secondpart, shareHolderXl);
					mobileAction.FunCSwipeandScroll(trading_pwd, false);
				} else {
					// if (!mobileAction.FuncIsDisplayed(share_holder)) {
					mobileAction.FunctionSwipe("up", 200, 100);
					// }
					mobileAction.FuncClick(share_holder, "Share holder");
					// mobileAction.FuncSwipeWhileElementNotFound(share_holder,
					// true, 1, "up");
					MobileElement actionList = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(shareholder_select));

					mobileAction.FuncClick(actionList, "Share Holder value");
				}
			}
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickPreviewOrder() {

		try {

			Thread.sleep(1000);
			mobileAction.FuncClick(preview_order, "Preview Order");
			mobileAction.waitForElementToVanish(progressBar);

			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickAgree() {
		//

		try {
			if (mobileAction.FuncIsDisplayed(agreeButton)) {
				mobileAction.FuncClick(agreeButton, "agree");
				Thread.sleep(5000);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void clickDoNotAgree() {
		//

		try {

			mobileAction.FuncClick(doNotAgreeButton, "Do Not Agree");
			mobileAction.waitForElementToVanish(progressBar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void trailingStopLimit() {
		init();
		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getStockPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterLimitAndTriggerDelta();
		selectShareHolder();
		selectGoodTill();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void trailingStopMarket() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getStockPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterTriggerDelta();
		selectGoodTill();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();

	}

	public void stopLimitSell() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getLimitAndTriggerPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterlimitAndTriggerPriceSell();
		selectGoodTill();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void stopLimit() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getLimitAndTriggerPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterlimitAndTriggerPrice();
		selectGoodTill();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void stopMarket() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getStockPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterTriggerPrice();
		selectGoodTill();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void stopMarketSell() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getStockPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterTriggerPriceSell();
		selectGoodTill();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void limit() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getStockPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterLimitPrice();

		selectGoodTill();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void limitDAYEXT() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getStockPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterLimitPriceDAYEXT();

		selectGoodTill();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void market() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getStockPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		selectGoodTill();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void verifyShareHolder() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getStockPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		selectGoodTill();
		enterTradingPassword();
		selectShareHolder();
		selectAccountShareHolder();
	}

	public void verifyBuyToCover() {
		init();

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		selectAction();

		try {
			CL.GetReporting().FuncReport("Pass", "The element <b>  " + Action + " </b> Clicked");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void getStockPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			//currentPricePath = "//*[@text='" + searchKeyword + "']/../*[1]";
			//currentPricePath="//XCUIElementTypeCell[contains(@label,'CA')]/XCUIElementTypeStaticText[2]";
			currentPricePath="//XCUIElementTypeStaticText[contains(@label,'name or symbol') or contains(@label,'autre nom ou symbole')]/../following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]";//@Author - Shahbaaz 17-Apr-2017
			System.out.println("CurrentPricePath  "+currentPricePath);
		} else {
			
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/txt_price']";

		}

		MobileElement pricePath = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(currentPricePath));
		System.out.println(pricePath.getText());
		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getOptionPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			currentPricePath = "//*[@text='" + searchKeyword + "']/../../following-sibling::*[1]/*[1]/*[1]/*[2]";
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/optionPrice']";

		}

		MobileElement pricePath = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getShortSellPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			currentPricePath = "//*[@text='Ask (Lots)']/following-sibling::*[1]";
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/txt_price']";
		}

		MobileElement pricePath = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getShortSellLimitAndTriggerPrice() {

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			currentPricePath = "//*[@text='Ask (Lots)']/following-sibling::*[1]";
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/bidPrice'] | android.widget.TextView[@resource-id='com.td:id/price']";
		}
		MobileElement pricePath = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getOptionLimitAndTriggerPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			currentPricePath = "xpath=//*[@text='" + searchKeyword + "']/../../following-sibling::*[1]/*[1]/*[1]/*[2]";
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/askPrice']";
		}

		MobileElement pricePath = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getSellLimitAndTriggerPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			currentPricePath = "xpath=//*[@text='" + searchKeyword + "']/../../following-sibling::*[1]/*[1]/*[1]/*[2]";
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/bidPrice']";
		}

		MobileElement pricePath = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getLimitAndTriggerPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			//currentPricePath = "xpath=//*[@text='" + searchKeyword + "']/../*[1]";
			currentPricePath="//XCUIElementTypeStaticText[contains(@label,'name or symbol') or contains(@label,'autre nom ou symbole')]/../following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]";//@Author - Shahbaaz 17-Apr-2017
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/txt_price'] |android.widget.TextView[@resource-id='com.td:id/price']";

		}

		MobileElement pricePath = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

		System.out.println(CL.getTestDataInstance().TCParameters.get("CurrentPrice"));
	}

	// options

	public void enterLimitPriceOption() {

		DecimalFormat df = new DecimalFormat("#.##");
		Double marketPrice = null;
		try {
			String pricePath = CL.getTestDataInstance().TCParameters.get("CurrentPrice");
			// if (!isLanguageFrench) {
			marketPrice = dollarStringToDouble(pricePath);

			System.out.println("Market Price is old value" + marketPrice);
			// } else {
			// marketPrice = Double.parseDouble(pricePath.replace("$", ""));
			//
			// }
			marketPrice = marketPrice + 0.5;
			System.out.println("Market Price is " + df.format(marketPrice));

		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			e.printStackTrace();
		}

		limitPrice(df.format(marketPrice).toString(), true);
	}

	public void enterTriggerPriceShortSell() {
		Matcher m;
		String pattern = "(\\$\\d*.\\d*)\\s\\(\\d*\\)";
		Pattern r = Pattern.compile(pattern);

		String pricePath = CL.getTestDataInstance().TCParameters.get("CurrentPrice");

		m = r.matcher(pricePath);
		if (m.find()) {
			System.out.println("Bid Price --" + m.group(1));
			pricePath = m.group(1);
		} else {
		}
		Double marketPrice = dollarStringToDouble(pricePath);
		marketPrice--;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Market Price is " + marketPrice);

		triggerPrice(df.format(marketPrice).toString());
	}

	public void enterTriggerPriceOption() {

		String pricePath = CL.getTestDataInstance().TCParameters.get("CurrentPrice");

		Double marketPrice = dollarStringToDouble(pricePath);
		marketPrice = marketPrice + 0.2;
		System.out.println("Market Price is " + marketPrice);

		triggerPrice(marketPrice.toString());
	}

	public void enterLimitandTriggerPriceShortSell() {
		Matcher m;
		String pattern = "(\\$\\d*.\\d*)\\s\\(\\d*\\)";
		Pattern r = Pattern.compile(pattern);
		DecimalFormat df = new DecimalFormat("#.##");
		String currentPrice = CL.getTestDataInstance().TCParameters.get("CurrentPrice");
		System.out.println("Bid price is " + currentPrice);
		m = r.matcher(currentPrice);
		if (m.find()) {
			System.out.println("Bid Price --" + m.group(1));
			currentPrice = m.group(1);
		} else {
		}
		Double marketPrice = dollarStringToDouble(currentPrice);
		Double limitPrice = marketPrice - 0.5;
		Double triggerPrice = (marketPrice + limitPrice) / 2;
		System.out.println("Limit Price is " + limitPrice);
		limitPriceWithTrigger(df.format(limitPrice).toString());
		triggerPrice(df.format(triggerPrice).toString());
	}

	public void enterLimitandTriggerPriceOption() {

		String currentPrice = CL.getTestDataInstance().TCParameters.get("CurrentPrice");
		Double marketPrice = dollarStringToDouble(currentPrice);
		Double limitPrice = marketPrice + 0.5;
		Double triggerPrice = (marketPrice + limitPrice) / 2;
		System.out.println("Limit Price is " + limitPrice);
		limitPrice(limitPrice.toString(), true);

		triggerPrice(triggerPrice.toString());

	}

	public void enterLimitandTriggerPriceOptionSell() {
		String currentPrice = CL.getTestDataInstance().TCParameters.get("CurrentPrice");

		Double marketPrice = dollarStringToDouble(currentPrice);
		Double limitPrice = marketPrice - 0.5;
		Double triggerPrice = (marketPrice + limitPrice) / 2;
		System.out.println("Limit Price is " + limitPrice);
		limitPrice(limitPrice.toString(), true);
		triggerPrice(triggerPrice.toString());

	}

	// change order Market to limit

	public void changeOrderMarketToLimit() {

		init();
		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitForElementToVanish(progressBar);

		mobileAction.waitForElementToVanish(progressBar);
		getStockPrice();
		selectPriceChangeOrder();
		enterLimitPrice();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void changeOrderLimitDayToDayEXT() {

		init();
		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitForElementToVanish(progressBar);

		mobileAction.waitForElementToVanish(progressBar);

		selectGoodTillChangeOrder();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void changeOrderLimitToMarket() {

		init();
		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitForElementToVanish(progressBar);

		mobileAction.waitForElementToVanish(progressBar);
		selectPriceChangeOrder();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void changeOrderTSM_To_TSL() {

		init();
		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitForElementToVanish(progressBar);

		mobileAction.waitForElementToVanish(progressBar);
		selectPriceChangeOrder();
		enterLimitAndTriggerDelta();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void changeOrderSM_To_SL() {

		init();
		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitForElementToVanish(progressBar);

		mobileAction.waitForElementToVanish(progressBar);
		selectPriceChangeOrder();
		getLimitAndTriggerPrice();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void selectPriceChangeOrder() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(priceTypeChangeOrderElement, "Price Selected");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, getTestdata("Price", 1));
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {

				// if (!mobileAction.FuncIsDisplayed(priceElement)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				selectPriceChangeOrder = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='"
						+ getTestdata("Price", 0) + "']";
				priceTypeChangeOrderElement = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(selectPriceChangeOrder));

				mobileAction.FuncClick(priceTypeChangeOrderElement, "Price");
				// mobileAction.FuncSwipeWhileElementNotFound(priceElement,
				// true, 5, "up");
				priceTypeChangeOrderValue = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
						+ getTestdata("Price", 1) + "']";
				MobileElement priceType = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(priceTypeChangeOrderValue));
				mobileAction.FuncClick(priceType, "Price");
			}
		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
