package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
	private MobileElement trade_header;

	@iOSFindBy(xpath = "//*[@label='%']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
	private MobileElement trigger_type;

	@iOSFindBy(xpath = "//*[@label='%']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Trigger Delta']")
	private MobileElement trigger_Delta;

	@iOSFindBy(xpath = "//*[@label='Stocks & ETFs'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Stocks & ETFs' and @index='1']")
	private MobileElement stocks_ETFs;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and contains(@text,'Limit Delta)']")
	private MobileElement btnLimitDelta;

	@iOSFindBy(xpath = " //*[contains(@label,'Account') or contains(@label,'Compte')]")
	@AndroidFindBy(xpath = "//android.view.View[@index='2']")
	private MobileElement selectAccount;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement listview;

	@iOSFindBy(xpath = "//*[contains(@label,'Limit Price')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and @index='0']")
	private MobileElement selectLimitPrice;

	String CDNMarginAccountXL = getTestdata("CDNMarginAccount");

	String CDNMarginAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
			+ CDNMarginAccountXL + "']";

	@iOSFindBy(xpath = "//*[contains(@label,'Action')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption'")
	private MobileElement tradeAction;

	String Action = getTestdata("Action");
	String txtAction = "//android.widget.TextView[@resource-id='com.td:id/txtActionType' and @text='" + Action + "']";

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement Pricelistview;

	@iOSFindBy(xpath = "//*[@label='Agree' or @label='Accepte']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Agree']")
	private MobileElement AgreeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Quantity'] or XCUIElementTypeStaticText[contains(@label,'Quantit') ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/captionTextView' and @text='Quantity']")
	private MobileElement selectQuantity;

	@iOSFindBy(xpath = "//*[@label='Day' or @label='Jour']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Day']")
	private MobileElement btngood;

	String good = getTestdata("Good'til");
	String txtgood = "//android.widget.TextView[@resource-id='com.td:id/txtDateType' and @text='" + good + "']";

	@iOSFindBy(xpath = "//*[@value='Enter your trading password' or @value='Entrer votre mot de passe de négociation']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/txt_tradingPassword' and @content-desc='Enter your trading password']")
	private MobileElement trading_pwd;

	@iOSFindBy(xpath = "//*[@value='Please Select']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption' and @text='Shareholder Type']")
	private MobileElement share_holder;

	@iOSFindBy(xpath = "//*[@label='Preview Order' or contains(@label,'Aperçu de l')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btnContinue' and @text='Preview Order']")
	private MobileElement preview_order;

	@iOSFindBy(xpath = "//*[@label='Send Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Send Order']")
	private MobileElement send_order;

	@iOSFindBy(xpath = "//*[@label='CANCEL']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Cancel']")
	private MobileElement cancelbutton;

	@iOSFindBy(xpath = "//*[@label='Back']")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//*[contains(@label,'Price')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']")
	private MobileElement selectPrice;

	@iOSFindBy(xpath = "//*[contains(@label,'Cours')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']")
	private MobileElement selectPriceFRE;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Options']")
	private MobileElement options;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[@label='OK']")
	private MobileElement ok;

	@iOSFindBy(xpath = "//*[@label='Trigger Delta']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Trigger Delta']")
	private MobileElement btnTriggerDelta;

	@iOSFindBy(xpath = "//*[@label='Mutual Funds']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Mutual Funds']")
	private MobileElement mutualfunds;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progresssBar;

	@iOSFindBy(xpath = "//*[contains(@label,'Action')]")
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='com.td:id/spinnerLine' and @index='3']")
	private MobileElement selectAction;

	@iOSFindBy(xpath = "//*[@value='Choisissez']")
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='com.td:id/spinnerLine' and @index='3']")
	private MobileElement selectActionFRE;

	@iOSFindBy(xpath = "//*[@label='Enter name or symbol' or contains(@label,'Chercher un nom de')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSearchTitle' and @text='Enter name or symbol']")
	private MobileElement symbol;

	@iOSFindBy(xpath = "//*[@label='Search']")
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='com.td:id/btn_clear_search_text' and @index='2']")
	private MobileElement CancelSearchbtn;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSearchField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_search_field_search_mode' and @text='Enter name or symbol']")
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

	@iOSFindBy(xpath = "//*[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
	private MobileElement receiptheader;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText'and @index='1']")
	private MobileElement order_Type;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement list;

	String txtscroll = "Important Information";

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption'and @text='Account'")
	private MobileElement txtaction;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/market_name'][1]")
	private MobileElement selectTD;

	@iOSFindBy(xpath = "//*[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.view.Button[@text='Cancel']")
	private MobileElement searchCancel;

	@iOSFindBy(xpath = "//*[@label='Preview Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btnContinue' and @text='Preview Order']")
	private MobileElement ClickOnPreviewOrderBtn;

	@iOSFindBy(xpath = "//*[@label='Send Order']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Send Order']")
	private MobileElement Send_Order;

	@iOSFindBy(xpath = "//*[@label='Change Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/action_bar_title' and @text='Change Order']")
	private MobileElement btnchangeorder;

	@iOSFindBy(xpath = "//*[@label='Important Information']")
	private MobileElement importantInfo;

	String TriggerPrice = getTestdata("TriggerPrice");
	@iOSFindBy(xpath = "//*[contains(@label,'Trigger Price')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and contains(@text,'Trigger Price')]")
	private MobileElement selectTriggerPrice;

	@iOSFindBy(xpath = "//*[contains(@label,'I consent to receiving the Fund Facts electronically')]")
	private MobileElement confirmMessage;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntLists;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	private MobileElement insider;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtActionType' and @text='Short Sell']")
	private MobileElement shortSell;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtActionType' and @text='Buy to Cover']")
	private MobileElement buyToCover;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	private MobileElement significant;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
	private MobileElement neither;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/captionTextView' and @text='Quantité']")
	private MobileElement quantity;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and @index='0']")
	private MobileElement trigger_price;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Trigger Delta']")
	private MobileElement triggerDelta;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]/XCUIElementTypeTextField[1]")
	private MobileElement limitDelta;

	String progressBar = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']";

	String trade_accountXL = getTestdata("CDNMarginAccount");
	String accselected = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
			+ trade_accountXL + "']";
	String actionToPerform = getTestdata("Action");
	String actionselected = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
			+ actionToPerform + "']";
	String strSelect = getTestdata("Symbol");
	String selectSymbol = "//*[contains(@label,'" + strSelect + "')]";
	String quantityType = getTestdata("QuantityType");
	String dividendOption = getTestdata("Dividend");
	String trading_pwd_value = getTestdata("Trading_Pwd");
	String Qty = getTestdata("QuantityType");
	String qtyselected = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + Qty + "']";
	String div = getTestdata("Dividend");
	String dividentopt = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + div + "']";
	String limitPrice = getTestdata("SelectLimitPrice");

	String findaccount = getTestdata("FromAccount");
	String find_account = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
			+ findaccount + "')]";

	String price_value = getTestdata("Price");
	String pricetype = "//android.widget.TextView[@resource-id='com.td:id/txtOrderType' and @text='" + price_value
			+ "']";

	String shareHolderXl = getTestdata("ShareHolder");
	String shareholder_select = "//android.widget.TextView[@resource-id='com.td:id/txtShareHolderType' and @text='"
			+ shareHolderXl + "']";

	String goodXL = getTestdata("Good'til");
	String selectgoodtill = "//android.widget.TextView[@resource-id='com.td:id/txtDateType' and @text='" + goodXL
			+ "']";

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation']")
	private MobileElement confirmation_val;

	int i = 1;

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

	String platformName = CL.getTestDataInstance().getMobilePlatForm();
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + i + Secondpart;
	String quantityXL = getTestdata("Quantity");

	@iOSFindBy(xpath = "//*[contains(@label,'CA, AR, ARGONAUT GOLD INC')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CA, AR, ARGONAUT GOLD INC']")
	private MobileElement ARSymbol;

	String trade_account_no = getTestdata("CDNMarginAccount");
	String accountToSelect = "//*[contains(@label,'" + trade_account_no + "')]";

	/***************************************************************
	 * Mutual Fund
	 **********************************************/
	String searchSymbolXL = getTestdata("Search");
	String strSymbol[] = searchSymbolXL.split(":");

	@iOSFindBy(xpath = "//*[@label='Enter name or symbol' or @label='Chercher un nom de société ou un symbole']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSearchTitle'and @text='Enter name or symbol' or @text='Chercher un nom de société ou un symbole']")
	private MobileElement enterNameOrSymbol;

	@iOSFindBy(xpath = "//*[@label='Search']")
	private MobileElement btnSearch;

	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[@name='Enter name or symbol' or @value='Entrez le nom ou le symbole' or @label='Entrez le nom ou le symbole' or @label='Enter name or symbol' or @value='Enter name or symbol']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_search_field_search_mode']")
	private MobileElement enterNameOrSymbolSearch;

	String searchKeywordXpath = "//android.widget.TextView[@resource-id='com.td:id/market_name' and @text='"
			+ searchSymbolXL + "']";
	String iOSSearchSymbol = "//*[contains(@label,'" + searchSymbolXL + "')]";

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/lv_searchList']")
	private MobileElement listView;

	@iOSFindBy(xpath = "//*[contains(@label,'Quantity Type') or contains(@label,'Type de quantité')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption' or @text='Quantity Type' or @text='Type de quantité']")
	private MobileElement mutualQuantity;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/zonesCTA']")
	private MobileElement relativeLayout;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Amount') or contains(@label,'Montant')]/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText']")
	private MobileElement amount;

	@iOSFindBy(xpath = "//*[@value='0']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText']")
	private MobileElement amountZero;

	String comissionXL = getTestdata("Comission");
	String comissionXpath = "//android.widget.RadioButton[@text='" + comissionXL + "']";
	String comissionXpathiOS = "//*[@label='" + comissionXL + "']";

	String amountXL = getTestdata("Amount");
	@iOSFindBy(xpath = "//*[contains(@label,'Dividend Option') or contains(@label,'Option de dividendes') or contains(@label,'Option dividendes')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Dividend Option']/following-sibling::android.widget.TextView[@text='Please Select' or @text='Choisissez']")
	private MobileElement dividendOptions;

	String dividendOptionValue = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
			+ dividendOption + "']";

	@iOSFindBy(xpath = "//*[contains(@label,'Trading Password') or contains(@label,'Mot de passe de négociation')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/editTextPassword']")
	private MobileElement tradingPassword;

	String quantityXpath = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + quantity
			+ "']";

	@iOSFindBy(xpath = "//*[contains(@label,'Preview Order') or contains(@label,'Aperçu de')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/orderEntryPreviewButton']")
	private MobileElement previewOrderBtn;

	@iOSFindBy(xpath = "//*[contains(@label,'Agree') or contains(@label,'Accepte')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Agree' or @text='Accepte']")
	private MobileElement AgreeCondition;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Account') or contains(@label,'Compte')]/following-sibling::XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_account_description']")
	private MobileElement accountName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Account') or contains(@label,'Compte')]/following-sibling::XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_account_number']")
	private MobileElement accountNumber;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Account') or contains(@label,'Compte')]/following-sibling::XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_cash_value']")
	private MobileElement cashValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Order') or contains(@label,'Ordre')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Order']/following-sibling::android.widget.TextView")
	private MobileElement orderValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Switch From')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_account_number']")
	private MobileElement strSwitchFrom;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Switch To')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_account_number']")
	private MobileElement strSwitchTo;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Dividend Option') or contains(@label,'Option dividendes')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Dividend Option']/following-sibling::android.widget.TextView")
	private MobileElement dividendOptionsValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Includes Commission?') or contains(@label,'Inclure commissions')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Includes Commission?' or @text='Commissions incluses?']/following-sibling::android.widget.TextView")
	private MobileElement includesComissionValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Estimated Principal') or contains(@label,'Principal estimé')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Estimated Principal' or @text='Principal estimé']/following-sibling::android.widget.TextView")
	private MobileElement estimatedPrincipal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Estimated Commission') or contains(@label,'Commission estimée')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Estimated Commission']/following-sibling::android.widget.TextView")
	private MobileElement estimatedComission;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Estimated Total') or contains(@label,'Total estimé')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Estimated Total']/following-sibling::android.widget.TextView")
	private MobileElement estimatedTotal;

	@iOSFindBy(xpath = "//*[contains(@label,'Important Information') or contains(@value,'Important Information') or contains(@label,'Renseignements importants')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/importantInfoLink' and @text='Important Information']")
	private MobileElement importantInformation;

	@iOSFindBy(xpath = "//*[contains(@label,'Send Order') or contains(@label,'Envoyer l’ordre')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Send Order' or @text='Envoyer l’ordre']")
	private MobileElement sendOrderBtn;

	@iOSFindBy(xpath = "//*[contains(@label,'Cancel')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Cancel']")
	private MobileElement cancelBtn;

	@iOSFindBy(xpath = "//*[contains(@label,'Thank you!') or contains(@label,'Merci!')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/thank_you' and @text='Thank you!']")
	private MobileElement thankYou;

	@iOSFindBy(xpath = "//*[contains(@label,'Order sent successfully') or contains(@label,'Ordre transmis avec succès')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Order sent successfully' or @text='Ordre transmis avec succès']")
	private MobileElement msgSuccessFul;

	@iOSFindBy(xpath = "//*[contains(@label,'I consent to receiving the Fund Facts electronically') or contains(@label,'Je consens à recevoir l’aperçu du fonds en format électronique')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtWatchlistName' and contains(@text,'I consent to receiving the Fund Facts electronically') or contains(@text,'Je consens à recevoir l’aperçu du fonds en format électronique')]")
	private MobileElement acknowledgement;

	@iOSFindBy(xpath = "//*[contains(@label,'Veuillez consulter')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and contains(@text,'Please View The Fund Facts for') or contains(@text,'Veuillez consulter l’Aperçu du fonds de')]")
	private MobileElement fundFacts;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Send Order') or contains(@label,'Envoyer') or @enabled='false']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Send Order' or @text='Envoyer' or @enabled='false']")
	private MobileElement sendOrderDisabled;

	@iOSFindBy(xpath = "//*[@label='Accueil']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='GO BACK HOME']")
	private MobileElement home_widget;

	String strQuantity = getTestdata("Quantity");

	@iOSFindBy(xpath = "//*[@label='Ordres']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ORDERS']")
	private MobileElement order_widget;

	@iOSFindBy(xpath = "//*[@label='Négociation']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TRADE']")
	private MobileElement trade_widget;

	String appLanguage = getTestdata("Language");

	@iOSFindBy(xpath = "//*[@label='Retour' or @label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back;

	String progressBar1 = "//android.widget.TextView[@resource-id='android:id/message' or @text='Loading']";
	String iOSProgressBar = "//*[@label='In Progress']";

	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[@label='Enter name or symbol' or contains(@label,'Chercher un nom de')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement enterSymbol;

	@iOSFindBy(xpath = "//*[@label='The symbol you entered is not valid']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/no_search_result' and @index='0']")
	private MobileElement nosearch;

	@iOSFindBy(xpath = "//*[@label='The symbol you entered is not valid']")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'The symbol you entered is not valid') and @index='1']")
	private MobileElement searchmsg;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeTextField[1]")
	private MobileElement quantityVal;

	String dividendXpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='"
			+ dividendOption + "']";

	String amountXpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and contains(@text,'"
			+ amountXL + "')]";

	String quantityxpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='" + quantity
			+ "' ]";

	String actionXpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='" + actionToPerform
			+ "']";

	String accountNumberXpath = "//android.widget.TextView[@resource-id='com.td:id/selectedValue' and @text='"
			+ trade_account_no + "']";

	String dividendiOSXpath = "//*[@label='" + dividendOption + "']";

	String amountiOSXpath = "//*[contains(@label,'" + amountXL + "')]";

	String quantityiOSxpath = "//*[@label='" + quantity + "' ]";

	String actioniOSXpath = "//*[@label='" + actionToPerform + "']";

	String accountNumberiOSXpath = "//*[@label='" + trade_account_no + "']";

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

			mobileAction.verifyElementIsDisplayed(trade_header, t_verifyTrade);
		} catch (NoSuchElementException e) {

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
			mobileAction.waitForElementToDisappear(progressBar);

			mobileAction.waitForElementToDisappear(progressBar);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				MobileElement OrderType = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(orderType));

				mobileAction.FuncClick(OrderType, "OrderType");
				String orderValueXL = getTestdata("Ordervalue");
				String orderValue = "//*[contains(@label,'" + orderValueXL + "')]";
				MobileElement ordertypeval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(orderValue));
				mobileAction.FunCSwipeandScroll(ordertypeval, true);
			} else {
				mobileAction.FuncClick(order_Type, "OrderType");
				String orderValueXL = getTestdata("Ordervalue");
				String orderValue = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and contains(@text,'"
						+ orderValueXL + "')]";
				MobileElement ordertypeval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(orderValue));
				mobileAction.FunCSwipeandScroll(ordertypeval, true);
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {

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

	public void tradeDetails() throws Exception {
		Decorator();
		try {
			mobileAction.FuncClick(selectAccount, "AccountSelected");
			if (platformName.equalsIgnoreCase("ios")) {

				String trade_account_no = getTestdata("FromAccount");
				mobileAction.FuncSelectElementInTable(select_Accounts_table, Firstpart, Secondpart, trade_account_no);

				mobileAction.FuncClick(tradeAction, "Action");
				String actionToPerform = getTestdata("Action");
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);
				mobileAction.FuncClick(selectQuantity, "quantity");
				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
				mobileAction.FuncClick(done, "Done");

				mobileAction.FuncClick(selectPrice, "Price selected");

				String price_value = getTestdata("Price");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);

				mobileAction.FuncClick(btngood, "Good 'til");
				String goodtil_value = getTestdata("Good'til");
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

				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
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
	//
	public void tradeDetails_Limit() throws Exception {
		Decorator();
		try {
			mobileAction.FuncClick(selectAccount, "AccountSelected");
			if (platformName.equalsIgnoreCase("ios")) {

				String trade_account_no = getTestdata("FromAccount");
				mobileAction.FuncSelectElementInTable(select_Accounts_table, Firstpart, Secondpart, trade_account_no);

				mobileAction.FuncClick(tradeAction, "Action");
				String actionToPerform = getTestdata("Action");
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);
				mobileAction.FuncClick(selectQuantity, "quantity");
				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
				mobileAction.FuncClick(done, "Done");

				mobileAction.FuncClick(selectPrice, "Price selected");

				String price_value = getTestdata("Price");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				mobileAction.FuncClick(selectLimitPrice, "Limit price selected");
				mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);
				mobileAction.FuncClick(done, "Done");

				mobileAction.FuncClick(btngood, "Good 'til");
				String goodtil_value = getTestdata("Good'til");
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

				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
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
	 * This method is used to click agree button on Trade page.
	 *
	 * @throws NoSuchElementException
	 *
	 * @throws InterruptedException
	 *
	 *
	 */

	public void clickOnAgree() {
		Decorator();

		try {

			mobileAction.FuncClick(AgreeButton, "Clicked on agree button");

			mobileAction.waitForElementToDisappear(progressBar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method is used to Select agree button on Trade page.
	 *
	 * @throws NoSuchElementException
	 *
	 * @throws InterruptedException
	 *
	 *
	 */

	public void selectQuantity() {

		Decorator();

		try {

			mobileAction.FuncSendKeys(selectQuantity, getTestdata("Quantity"));

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

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

			mobileAction.FuncClick(selectAccount, "AccountSelected");
			if (platformName.equalsIgnoreCase("ios")) {

				String trade_account_no = getTestdata("FromAccount");
				mobileAction.FuncSelectElementInTable(select_Accounts_table, Firstpart, Secondpart, trade_account_no);

				// CL.GetDriver().findElement(By.xpath(margin_account)).click();
				mobileAction.FuncClick(tradeAction, "Action");
				String actionToPerform = getTestdata("Action");
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);
				mobileAction.FuncClick(selectQuantity, "quantity");
				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
				mobileAction.FuncClick(done, "Done");

				mobileAction.FuncClick(selectPrice, "Price selected");

				String price_value = getTestdata("Price");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);

				mobileAction.FuncClick(btngood, "Good 'til");
				String goodtil_value = getTestdata("Good'til");
				mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodtil_value);
				mobileAction.FunCSwipeandScroll(share_holder, true);
				mobileAction.FuncClick(share_holder, "Share_Holder");
				String shareHolder_value = getTestdata("Trading_Pwd");
				mobileAction.FuncSelectElementInTable(shareHolder_table, Firstpart, Secondpart, shareHolder_value);

				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

				String trading_pwd_value = getTestdata("Trading_Pwd");
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

				String trade_account_no = getTestdata("FromAccount");
				mobileAction.FuncSelectElementInTable(select_Accounts_table, Firstpart, Secondpart, trade_account_no);

				mobileAction.FuncClick(tradeAction, "Action");
				String actionToPerform = getTestdata("Action");
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);
				mobileAction.FuncClick(selectQuantity, "quantity");
				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
				mobileAction.FuncClick(done, "Done");

				mobileAction.FuncClick(selectPrice, "Price selected");

				String price_value = getTestdata("Price");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);

				String triggerDelta_value = getTestdata("TriggerDelta");
				mobileAction.FunCSwipeandScroll(btngood, true);
				mobileAction.FuncClick(btnTriggerDelta, "TriggerDelta");
				mobileAction.FuncSendKeys(btnTriggerDelta, triggerDelta_value);

				mobileAction.FuncClick(btngood, "Good 'til");
				String goodtil_value = getTestdata("Good'til");
				mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodtil_value);

				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

				String trading_pwd_value = getTestdata("Trading_Pwd");
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

				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
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
				String searchKeyword = getTestdata("Search");

				mobileAction.waitForElementToVanish(progresssBar);
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				String accountno = "//*[contains(@label,'" + trade_accountXL + "')]";

				MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(accountno));
				mobileAction.FunCSwipeandScroll(marginAccVal, true);

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

				mobileAction.FuncClick(quantityVal, "Quantity");
				mobileAction.FuncSendKeys(quantityVal, getTestdata("Amount"));
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

				mobileAction.FuncClick(send_order, "Send Order");
				mobileAction.waitForElementToVanish(progresssBar);

			} else {

				mobileAction.FuncClick(txtaccount, "Account");
				mobileAction.FuncElementSwipeWhileNotFound(list, accselected, 7, "up", true);
				mobileAction.FuncClick(txtaction, "Action");
				mobileAction.FuncElementSwipeWhileNotFound(list, actionselected, 1, "up", true);
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbol, getTestdata("Search"));
				String selectedTD = mobileAction.getText(selectTD);
				mobileAction.FuncClick(selectTD, selectedTD);
				mobileAction.FunctionSwipe("Up", 200, 200);
				mobileAction.FuncClick(txtqnt, "Quantity Type");
				mobileAction.FuncElementSwipeWhileNotFound(list, qtyselected, 1, "down", true);
				mobileAction.FuncSendKeys(txtamount, getTestdata("Amount"));
				mobileAction.FuncClick(txtdividendopt, "Dividend Option");
				mobileAction.FuncElementSwipeWhileNotFound(list, dividentopt, 1, "down", true);
				mobileAction.FuncClick(preview_order, "Preview order button clicked");
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
				String trade_account_no = getTestdata("CDNMarginAccount");
				String[] trade_accountValue = trade_account_no.split(":");

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
				String price_value = getTestdata("Price");
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
				mobileAction.verifyElementNotPresent(share_holder, "ShareHolder is not	 Present");

			} else {

			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {

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
		boolean isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement doneOK = isLanguageFrench ? ok : done;

		try {
			mobileAction.FunCSwipeandScroll(trading_pwd, false);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String trading_pwd_XL = getTestdata("Trading_Pwd");
				mobileAction.FuncClick(trading_pwd, "Trading Password");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_XL);

				Thread.sleep(1000);
				mobileAction.FuncClick(doneOK, "Done");
			} else {
				mobileAction.FuncClick(trading_pwd, "Trading Password");
				mobileAction.FuncSendKeys(trading_pwd, getTestdata("Trading_Pwd"));
				mobileAction.FuncHideKeyboard();
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {

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

				String searchKeyword = getTestdata("Search");
				String accountno = "//*[contains(@label,'" + trade_accountXL + "')]";
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

				String price_value = getTestdata("Price");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);

				String limitDataXL = getTestdata("LimitDelta");

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

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
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String searchKeyword = getTestdata("Search");
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbol1, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbol1, searchKeyword);

				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.FuncClick(selectTD, "Symbol");
			} else {
				String searchKeyword = getTestdata("Search");
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbol1, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbol1, searchKeyword);
				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.FuncClick(selectTD, "Symbol");
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {

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
			mobileAction.waitForElementToDisappear(progressBar);

			mobileAction.waitForElementToDisappear(progressBar);

		} catch (NoSuchElementException | IOException | InterruptedException e) {

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
				String goodXL = getTestdata("Good'til");
				mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodXL);
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {
				mobileAction.FuncClick(btngood, "Good 'til");
				mobileAction.FuncElementSwipeWhileNotFound(acntLists, selectgoodtill, 1, "down", true);
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void clickQuantity() {
		Decorator();

		boolean isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(quantity, "Quantity");
				mobileAction.FuncSendKeys(quantity, getTestdata("Quantity"));
				mobileAction.FuncClick(doneOK, "Done");

			} else {
				mobileAction.FuncClick(selectQuantity, "quantity");
				mobileAction.FuncSendKeys(selectQuantity, getTestdata("Quantity"));
				mobileAction.FuncHideKeyboard();

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void triggerPrice() {

		Decorator();
		boolean isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement doneOK = isLanguageFrench ? ok : done;
		String bidPrice = CL.GetDriver()
				.findElement(By
						.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]"))
				.getText();
		String triggerPriceValue = String.valueOf(Integer.parseInt(bidPrice.replaceAll("\\D+", "") + 5));
		System.out.println(bidPrice + " added value" + triggerPriceValue);
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(trigger_price, "TriggerPrice");
				mobileAction.FuncSendKeys(trigger_price, triggerPriceValue);
				mobileAction.FuncClick(doneOK, "Done");
			} else {
				mobileAction.FuncClick(trigger_price, "Trigger Price");
				mobileAction.FuncSendKeys(trigger_price, triggerPriceValue);
				mobileAction.FuncHideKeyboard();
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void limitPrice() {

		Decorator();

		boolean isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectPrice, "Limit Price");
				mobileAction.FuncSendKeys(selectPrice, limitPrice);
				mobileAction.FuncClick(doneOK, "Done");
			} else {
				mobileAction.FuncClick(selectLimitPrice, "Limit Price");
				mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);
				mobileAction.FuncHideKeyboard();
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void triggerDelta() {

		Decorator();

		boolean isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(triggerDelta, "Trigger Delta");
				mobileAction.FuncSendKeys(triggerDelta, getTestdata("TriggerDelta"));
				mobileAction.FuncClick(doneOK, "Done");
			} else {
				mobileAction.FuncClick(triggerDelta, "Trigger Delta");
				mobileAction.FuncSendKeys(triggerDelta, getTestdata("TriggerDelta"));
				mobileAction.FuncHideKeyboard();
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void limitDelta() {

		Decorator();
		boolean isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement doneOK = isLanguageFrench ? ok : done;

		try {
			mobileAction.FuncClick(limitDelta, "Limit Delta");
			mobileAction.FuncSendKeys(limitDelta, getTestdata("LimitDelta"));
			mobileAction.FuncClick(doneOK, "Done");

		} catch (NoSuchElementException | IOException | InterruptedException e) {

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

		boolean isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement priceElement = isLanguageFrench ? selectPriceFRE : selectPrice;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(priceElement, "Price Selected");
				String price_value = getTestdata("Price");

				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {
				mobileAction.FuncClick(priceElement, "Price Selected");
				mobileAction.FuncElementSwipeWhileNotFound(acntLists, pricetype, 1, "down", true);

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void clickShareHolder() throws Exception {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String shareHolderXl = getTestdata("ShareHolder");
				mobileAction.FuncClick(share_holder, "ShareHolder");
				mobileAction.FuncSelectElementInTable(shareHolder_table, Firstpart, Secondpart, shareHolderXl);
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {
				mobileAction.FuncClick(share_holder, "ShareHolder");
				mobileAction.FuncElementSwipeWhileNotFound(acntLists, shareholder_select, 1, "down", true);
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void clickAction() throws Exception {
		Decorator();

		boolean isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement actionElement = isLanguageFrench ? selectActionFRE : selectAction;
		String bidPrice = CL.GetDriver()
				.findElement(By
						.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]"))
				.getText();
		String triggerPriceValue = String.valueOf(Integer.parseInt(bidPrice.replaceAll("\\D+", "") + 5));
		System.out.println(bidPrice + " added value" + triggerPriceValue);

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				String actionToPerformXL = getTestdata("Action");
				mobileAction.FuncClick(actionElement, "Action clicked");
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerformXL);

			} else {
				mobileAction.FuncClick(actionElement, "Click Action");
				mobileAction.FuncElementSwipeWhileNotFound(acntLists, txtAction, 1, "down", true);

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

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

				String accountno = "//*[contains(@label,'" + trade_accountXL + "')]";
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(accountno));
				mobileAction.FunCSwipeandScroll(marginAccVal, true);

				mobileAction.FuncClick(selectAction, "Action clicked");
				mobileAction.verifyElementIsDisplayed(shortSell, "Short Sell is Displayed");
				mobileAction.verifyElementIsDisplayed(buyToCover, "Buy to Cover is Displayed");

			} else {
				mobileAction.FuncClick(selectAccount, "Click Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntLists, find_account, 2, "down", true);
				mobileAction.FunCnewSwipe(selectAction, false, 1);
				mobileAction.FuncClick(selectAction, "Click Action");
				mobileAction.verifyElementIsDisplayed(shortSell, "Short Sell is Displayed");
				mobileAction.verifyElementIsDisplayed(buyToCover, "Buy to Cover is Displayed");
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

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

		boolean flag = true;
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String accountno = "//*[contains(@label,'" + trade_accountXL + "')]";
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(accountno));
				mobileAction.FunCSwipeandScroll(marginAccVal, true);
				Thread.sleep(3000);

			} else {
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				while (flag) {
					try {
						String accountno = "//android.widget.TextView[contains(@text,'" + trade_account_no + "')]";

						MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
								.findElement(By.xpath(accountno));
						if (marginAccVal.isDisplayed()) {
							mobileAction.FuncClick(marginAccVal, trade_account_no);
							flag = false;
						} else {
							mobileAction.FunctionSwipe("up", 100, 200);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("up", 100, 200);
					}
				}
			}

		} catch (InterruptedException | NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

		mobileAction.waitForElementToDisappear(progressBar);
	}

	public void clickChangeorder_LimitToMarket() throws Exception {

		try {
			Decorator();
			clickAction();
			mobileAction.FunCSwipeandScroll(trading_pwd, true);
			String actionToPerformXL = getTestdata("Action");
			mobileAction.FuncClick(selectAction, "Action clicked");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerformXL);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncClick(done, "Done");
			} else {
				mobileAction.FuncClick(selectAction, "Click Action");
				mobileAction.FuncElementSwipeWhileNotFound(acntLists, txtAction, 1, "down", true);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(preview_order, "preview_Order");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.FuncClick(AgreeButton, "Agree Button");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}
	}

	public void clickChangeorder_ChangeQuantity() throws Exception {

		try {
			Decorator();
			mobileAction.FunCSwipeandScroll(trading_pwd, true);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(quantity, "Quantity");
				quantity.clear();
				mobileAction.FuncSendKeys(quantity, quantityXL);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				String trading_pwd_value = getTestdata("Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncClick(done, "Done");
			} else {

				mobileAction.FuncClick(selectQuantity, "quantity");
				selectQuantity.clear();
				mobileAction.FuncSendKeys(selectQuantity, quantityXL);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(preview_order, "preview_Order");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.FuncClick(AgreeButton, "Agree Button");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}
	}

	public void clickChangeorder_MarketToLimit() throws Exception {

		try {
			Decorator();
			mobileAction.FunCSwipeandScroll(trading_pwd, true);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(selectPrice, "Price Selected");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				mobileAction.FuncClick(selectLimitPrice, "Limit Price");
				mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncClick(done, "Done");
			} else {

				mobileAction.FuncClick(selectPrice, "Price Selected");
				mobileAction.FuncElementSwipeWhileNotFound(acntLists, pricetype, 1, "down", true);
				mobileAction.FuncClick(selectLimitPrice, "Limit Price");
				mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);
				mobileAction.FuncHideKeyboard();
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(preview_order, "preview_Order");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.FuncClick(AgreeButton, "Agree Button");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}
	}

	public void clickChangeorder_StopMarketToStopLimit() throws Exception {

		try {
			Decorator();
			mobileAction.FunCSwipeandScroll(trading_pwd, true);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectPrice, "Price Selected");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				mobileAction.FuncClick(selectLimitPrice, "Limit Price");
				mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(trigger_price, "Trigger Price");
				mobileAction.FuncSendKeys(trigger_price, getTestdata("TriggerPrice"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncClick(done, "Done");
				mobileAction.waitForElementToVanish(progresssBar);
			} else {
				mobileAction.FuncClick(selectPrice, "Price Selected");
				mobileAction.FuncElementSwipeWhileNotFound(acntLists, pricetype, 1, "down", true);
				mobileAction.FuncClick(selectLimitPrice, "Limit Price");
				mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);
				mobileAction.FuncHideKeyboard();
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(preview_order, "preview_Order");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.FuncClick(AgreeButton, "Agree Button");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}
	}

	public void clickChangeorder_TrailingStopMarketToTrailingStopLimit() throws Exception {

		try {
			Decorator();
			mobileAction.FunCSwipeandScroll(trading_pwd, true);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectPrice, "Price Selected");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				mobileAction.FuncClick(triggerDelta, "Trigger Delta");
				mobileAction.FuncSendKeys(triggerDelta, getTestdata("TriggerDelta"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(limitDelta, "Trigger Delta");
				mobileAction.FuncSendKeys(limitDelta, getTestdata("LimitDelta"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncClick(done, "Done");
			} else {
				mobileAction.FuncClick(selectPrice, "Price Selected");
				mobileAction.FuncElementSwipeWhileNotFound(acntLists, pricetype, 1, "down", true);
				mobileAction.FuncClick(selectLimitPrice, "Limit Price");
				mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);
				mobileAction.FuncHideKeyboard();
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(preview_order, "preview_Order");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.FuncClick(AgreeButton, "Agree Button");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}
	}

	public void verifyRelaventMatchInResult() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String searchKeyword = getTestdata("Search");
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbol1, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbol1, searchKeyword);

				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.verifyElementIsDisplayed(ARSymbol, "ARSymbol");
			} else {
				String searchKeyword = getTestdata("Search");
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbol1, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbol1, searchKeyword);
				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.verifyElementIsDisplayed(ARSymbol, "ARSymbol");
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void verifySymbol() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String searchKeyword = getTestdata("Search");
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbol1, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbol1, searchKeyword);

				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.verifyElementIsDisplayed(selectTD, "Specified Symbol");
				mobileAction.FuncClick(searchCancel, "Cancel");

			} else {
				String searchKeyword = getTestdata("Search");
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbol1, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbol1, searchKeyword);
				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.verifyElementIsDisplayed(selectTD, "Specified Symbol");

				mobileAction.FuncClick(searchCancel, "Cancel");
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void verifyFifoLogic() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				String searchKeyword = getTestdata("Search");
				String searchKeyword_List[] = searchKeyword.split(":");
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				for (int i = 0; i < 12; i++) {

					mobileAction.FuncClick(symbol1, "Enter name or symbol");
					mobileAction.FuncSendKeys(symbol1, searchKeyword_List[i]);

					mobileAction.waitForElementToDisappear(progressBar);
					mobileAction.verifyElementIsDisplayed(selectTD, "Symbol " + searchKeyword_List[i]);
				}
				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.FuncClick(selectTD, "Symbol");
				mobileAction.FuncClickBackButton();

			} else {
				String searchKeyword = getTestdata("Search");
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbol1, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbol1, searchKeyword);
				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.FuncClick(selectTD, "Symbol");
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void changeAccountTypeLongtoShortFre() throws Exception {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String accountno = "//*[contains(@label,'" + trade_accountXL + "')]";
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				MobileElement marginAccVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(accountno));
				mobileAction.FunCSwipeandScroll(marginAccVal, true);
				mobileAction.verifyElementTextContains(selectQuantity, quantityXL);
				mobileAction.verifyElementTextContains(btngood, goodXL);

			} else {

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void verifyTradeActionShortAccountFre() throws Exception {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				String trade_account_no = getTestdata("FromAccount");
				mobileAction.FuncSelectElementInTable(select_Accounts_table, Firstpart, Secondpart, trade_account_no);
				mobileAction.verifyElementTextContains(btngood, goodXL);

			} else {

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	/**
	 * This method will place the stockOrder in Trade page.
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
	public void placeStockOrder() throws Exception {
		Decorator();
		try {
			TouchAction action2 = null;
			mobileAction.verifyElementIsDisplayed(trade_header, t_verifyTrade);
			mobileAction.verifyElementUsingXPath(selectgoodtill, "Good 'til, Day");
			mobileAction.FuncClick(selectQuantity, "quantity");

			mobileAction.FuncSendKeys(selectQuantity, quantityXL);
			mobileAction.FuncClick(done, "Done");
			mobileAction.FunCSwipeandScroll(trading_pwd, true);
			mobileAction.FuncClick(trading_pwd, "Trading_Pwd");
			mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
			mobileAction.FuncClick(done, "Done");
			mobileAction.FuncClick(preview_order, "preview_Order");
			mobileAction.waitForElementToDisappear(progressBar);
			mobileAction.FuncClick(AgreeButton, "Agree Button");
			mobileAction.FuncClick(send_order, "Send_Order");
			mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
			String confrmVal = mobileAction.getText(confirmation_val);
			MobileElement cnfmVal = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(confrmVal));

			action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(cnfmVal, 2);

		} catch (NoSuchElementException | IOException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void cancel_ordertype() {

		Decorator();

		try {
			mobileAction.FuncClick(cancelbutton, "Click Cancel");
			mobileAction.FuncClick(backButton, "Click Back Button");
			mobileAction.FuncClick(backButton, "Click Back Button");
			mobileAction.FuncClick(backButton, "Click Back Button");

		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void cancelbutton() {

		Decorator();

		try {
			mobileAction.FuncClick(cancelbutton, "Click Cancel");

		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	/**
	 * This method will click on the account and select the account.
	 */
	public void trade_account() {
		Decorator();
		boolean flag = true;
		try {
			mobileAction.FuncClick(txtaccount, "Account");
			if (platformName.equalsIgnoreCase("Android")) {
				mobileAction.FuncElementSwipeWhileNotFound(list, accselected, 7, "up", true);
			} else {
				while (flag) {
					try {
						MobileElement accountToSelected = (MobileElement) ((AppiumDriver) CL.GetDriver())
								.findElement(By.xpath(accountToSelect));
						if (accountToSelected.isDisplayed()) {
							mobileAction.FuncClick(accountToSelected, trade_account_no);
							flag = false;
						} else {
							mobileAction.FunctionSwipe("up", 100, 200);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("up", 100, 200);
					}
				}
			}
			mobileAction.waitForElementToDisappear(progressBar);
		} catch (Exception e1) {
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

	public void selectMutualSymbol() {
		Decorator();

		try {
			for (int i = 0; i < strSymbol.length; i++) {
				mobileAction.FuncClick(enterNameOrSymbol, "Enter name or symbol");
				mobileAction.FuncClick(enterNameOrSymbolSearch, "Enter name or symbol search field");

				mobileAction.FuncSendKeys(enterNameOrSymbolSearch, strSymbol[i]);
				Thread.sleep(2000);
				if (platformName.equalsIgnoreCase("Android")) {
					mobileAction.FuncClick(btnSearch, "Search Button");
					MobileElement selectSearchedSymbol = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(searchKeywordXpath));
					mobileAction.FuncElementSwipeWhileNotFound(listView, selectSearchedSymbol, 3, "down", true);
				} else {
					mobileAction.FuncClick(btnSearch, "Search Button");
					String iOSSearchSymbol = "//*[contains(@label,'" + strSymbol[i] + "')]";
					MobileElement selectSearchedSymbol = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(iOSSearchSymbol));
					mobileAction.FuncClick(selectSearchedSymbol, searchSymbolXL);

				}
				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.FunctionSwipe("up", 100, 200);
			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	/**
	 * This method will verify switch mututal fund details.
	 */

	public void verifySwitchMutualConfirmDetails() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(accountName, "Account Name");
			mobileAction.verifyElementIsDisplayed(accountNumber, "Account Number");
			mobileAction.verifyElementIsDisplayed(strSwitchFrom, "Cash Value");
			mobileAction.verifyElementIsDisplayed(strSwitchTo, "Order Value");
			mobileAction.verifyElementIsDisplayed(dividendOptionsValue, "Dividend Option Value");
			mobileAction.verifyElementIsDisplayed(includesComissionValue, "Includes Comission");
			mobileAction.verifyElementIsDisplayed(estimatedPrincipal, "Estimated Principal");
			mobileAction.verifyElementIsDisplayed(estimatedComission, "Estimated Comission");
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(estimatedTotal, "Estimated Total");
			mobileAction.verifyElementIsDisplayed(importantInformation, "Important Information");
		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify mututal fund details.
	 */

	public void verifyMutualFundDetails() {

		Decorator();

		try {

			if (platformName.equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(back, "Back button");

				MobileElement dividendoption = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(dividendXpath));

				mobileAction.verifyElementIsDisplayed(dividendoption, dividendOption);

				MobileElement quanty = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(quantityxpath));

				mobileAction.verifyElementIsDisplayed(quanty, "Quantity");

				MobileElement amount = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(amountXpath));

				mobileAction.verifyElementIsDisplayed(amount, amountXL);

				mobileAction.FunctionSwipe("down", 200, 200);

				MobileElement action = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(actionXpath));

				mobileAction.verifyElementIsDisplayed(action, actionToPerform);

				MobileElement accountNumber = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(accountNumberXpath));

				mobileAction.verifyElementIsDisplayed(accountNumber, trade_account_no);
			} else {

				mobileAction.FuncClick(back, "Back button");

				MobileElement dividendoption = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(dividendiOSXpath));

				mobileAction.verifyElementIsDisplayed(dividendoption, dividendOption);

				MobileElement quanty = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(quantityiOSxpath));

				mobileAction.verifyElementIsDisplayed(quanty, "Quantity");

				MobileElement amount = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(amountiOSXpath));

				mobileAction.verifyElementIsDisplayed(amount, amountXL);

				mobileAction.FunctionSwipe("down", 200, 200);

				MobileElement action = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(actioniOSXpath));

				mobileAction.verifyElementIsDisplayed(action, actionToPerform);

				MobileElement accountNumber = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(accountNumberiOSXpath));

				mobileAction.verifyElementIsDisplayed(accountNumber, trade_account_no);

			}

		}

		catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {

			e.printStackTrace();
		} catch (InterruptedException e) {

		}

	}

	/**
	 * This method will verify mututal sell details.
	 */
	public void verifymutualconfirmsell() throws Exception {
		Decorator();
		Thread.sleep(3000);
		mobileAction.verifyElementIsDisplayed(accountName, "Account Name");
		mobileAction.verifyElementIsDisplayed(accountNumber, "Account Number");
		mobileAction.verifyElementIsDisplayed(cashValue, "Cash Value");
		mobileAction.verifyElementIsDisplayed(estimatedPrincipal, "Estimated Principal");
		mobileAction.verifyElementIsDisplayed(estimatedComission, "Estimated Comission");
		mobileAction.verifyElementIsDisplayed(estimatedTotal, "Estimated Total");
		mobileAction.verifyElementIsDisplayed(importantInformation, "Important Information");
	}

	/**
	 * This method will select the mutual quantity
	 */
	public void selectMutualQuantity() {

		Decorator();

		try {

			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(mutualQuantity, "Mutual Quantity");
			if (platformName.equalsIgnoreCase("Android")) {
				MobileElement selectQuantity = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(quantityXpath));
				mobileAction.FuncClick(selectQuantity, strQuantity);
			} else {
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, strQuantity);
			}

			mobileAction.waitForElementToVanish(progresssBar);

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will enter the amount.
	 */
	public void enterAmount() {

		Decorator();

		try {

			mobileAction.FuncClick(amount, "Amount");
			mobileAction.FuncSendKeys(amount, amountXL);
			if (platformName.equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClick(done, "Done");
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
	 * This method will select commision.
	 */
	public void includesComission() {
		Decorator();
		try {
			if (platformName.equalsIgnoreCase("Android")) {
				MobileElement comission = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(comissionXpath));
				mobileAction.FuncClick(comission, comissionXpath);
			} else {
				MobileElement comission = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(comissionXpathiOS));
				mobileAction.FuncClick(comission, comissionXpath);
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
	 * This method will select the divdent option.
	 */
	public void selectDividendOption() {

		Decorator();

		try {

			mobileAction.FuncClick(dividendOptions, "Dividend Option");
			if (platformName.equalsIgnoreCase("Android")) {
				MobileElement dividentOptionElement = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(dividendOptionValue));
				mobileAction.FuncClick(dividentOptionElement, dividendOption);
			} else {
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, dividendOption);
				mobileAction.FunctionSwipe("up", 200, 200);
			}

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will enter the password.
	 */
	public void enterTradingPassword() {

		Decorator();

		try {
			mobileAction.FuncClick(tradingPassword, "Trading Password");
			mobileAction.FuncSendKeys(tradingPassword, trading_pwd_value);
			if (platformName.equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClick(done, "Done");
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
	 * This method will click on the preview button.
	 */
	public void clickMutualPreviewOrder() {

		Decorator();

		try {
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(previewOrderBtn, "Preview Order");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.FuncClick(AgreeCondition, "Agree button");
			mobileAction.waitForElementToVanish(progresssBar);

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the mutual details.
	 */
	public void verifyMutualConfirmDetails() {

		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(accountName, "Account Name");
			mobileAction.verifyElementIsDisplayed(accountNumber, "Account Number");
			mobileAction.verifyElementIsDisplayed(cashValue, "Cash Value");
			mobileAction.verifyElementIsDisplayed(orderValue, "Order Value");
			mobileAction.verifyElementIsDisplayed(dividendOptionsValue, "Dividend Option Value");
			mobileAction.verifyElementIsDisplayed(includesComissionValue, "Includes Comission");
			mobileAction.verifyElementIsDisplayed(estimatedPrincipal, "Estimated Principal");
			mobileAction.verifyElementIsDisplayed(estimatedComission, "Estimated Comission");
			mobileAction.verifyElementIsDisplayed(estimatedTotal, "Estimated Total");
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(importantInformation, "Important Information");

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the Acknowledgement.
	 */
	public void selectAcknowledgement() {

		Decorator();

		try {

			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(acknowledgement, "Acknowledgement");
			mobileAction.FuncClick(acknowledgement, "Acknowledgement");

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the Fund Facts link and back button.
	 */
	public void clickFundFactLink() {
		// need to add iOS xpath and back button.

		Decorator();

		try {
			if (platformName.equalsIgnoreCase("Android")) {
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(fundFacts, "Fund Facts");
				mobileAction.waitForElementToVanish(progresssBar);
				mobileAction.FuncClickBackButton();
			} else {
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(fundFacts, "Fund Facts");
				mobileAction.waitForElementToVanish(progresssBar);
				mobileAction.FuncClick(backButton, "Back Button");
			}

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the send order button status.
	 */
	public void verifySendOrderState() {

		Decorator();

		try {
			mobileAction.verifyElementIsDisplayed(sendOrderDisabled, "Send Order is Disabled");

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the send order button.
	 */
	public void verifySendOrderDisplayed() {

		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(sendOrderBtn, "Send Order");

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the send order button.
	 */
	public void ConfirmSendOrder() {

		Decorator();

		try {

			mobileAction.FuncClick(sendOrderBtn, "Send Order");
			mobileAction.waitForElementToVanish(progresssBar);

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the cancel order button.
	 */
	public void confirmCancelOrder() {

		Decorator();

		try {

			mobileAction.FuncClick(cancelBtn, "Cancel Order");

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the success message.
	 */

	public void verifySuccessMessage() {

		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(thankYou, "Thank you");
			mobileAction.verifyElementIsDisplayed(msgSuccessFul, "Order sent successfully");

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the widget present on the screen.
	 */

	public void order_tabs() throws Exception {
		mobileAction.verifyElementIsDisplayed(home_widget, "Home widget");
		mobileAction.verifyElementIsDisplayed(order_widget, "Order widget");
		mobileAction.verifyElementIsDisplayed(trade_widget, "Trade widget");
		mobileAction.FuncClick(home_widget, "Home Screen");
	}

	public void Limit() throws Exception, InterruptedException, IOException {
		Decorator();
		mobileAction.FuncClick(selectLimitPrice, "Limit price selected");
		mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);

	}

	public void Trigger() throws Exception, InterruptedException, IOException {
		Decorator();
		mobileAction.FuncClick(selectTriggerPrice, "Trigger price selected");
		mobileAction.FuncSendKeys(selectTriggerPrice, TriggerPrice);
	}

	public void stoplimit() throws Exception, InterruptedException, IOException {
		Decorator();
		mobileAction.FuncClick(selectLimitPrice, "Limit price selected");
		mobileAction.FuncSendKeys(selectLimitPrice, limitPrice);

		mobileAction.FuncClick(selectTriggerPrice, "Trigger price selected");
		mobileAction.FuncSendKeys(selectTriggerPrice, TriggerPrice);
	}

	public void clickSendOrder() {
		Decorator();
		try {
			mobileAction.FuncClick(send_order, "Send Order");
			mobileAction.waitForElementToVanish(progresssBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
			mobileAction.FuncClick(preview_order, "Preview Order");

		} catch (NoSuchElementException | IOException | InterruptedException e) {

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
	public void TrailingStopLimit() throws Exception {
		Decorator();
		String triggerDelta_value = getTestdata("TriggerDelta");
		mobileAction.FuncClick(btnTriggerDelta, "TriggerDelta");
		mobileAction.FuncSendKeys(btnTriggerDelta, triggerDelta_value);

		String limitDelta_value = getTestdata("LimitDelta");
		mobileAction.FuncClick(btnLimitDelta, "LimitDelta");
		mobileAction.FuncSendKeys(btnLimitDelta, limitDelta_value);

	}

	public void verifysearchbar() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(symbol, "Enter name or symbol");
		} catch (IOException e) {
		}
	}

	public void clickCross() {
		Decorator();

		try {
			String searchKeyword = getTestdata("Search");
			mobileAction.FuncClick(symbol, "Enter name or symbol");
			mobileAction.waitForElementToDisappear(progressBar1);
			mobileAction.FuncSendKeys(symbol, searchKeyword);
			Thread.sleep(2000);
			mobileAction.FuncClick(CancelSearchbtn, "Cancel button");
			mobileAction.waitForElementToDisappear(progressBar1);
		} catch (NoSuchElementException | IOException | InterruptedException e) {

		}
	}

	public void enterAndSearch() {
		Decorator();
		try {
			String searchKeyword = getTestdata("Search");
			mobileAction.FuncClick(symbol, "Enter name or symbol");
			if (platformName.equalsIgnoreCase("Android")) {
				mobileAction.waitForElementToDisappear(progressBar1);
			} else {
				mobileAction.waitForElementToDisappear(iOSProgressBar);
			}
			mobileAction.FuncSendKeys(enterSymbol, searchKeyword);
			Thread.sleep(2000);
			if (platformName.equalsIgnoreCase("Android")) {
				mobileAction.waitForElementToDisappear(progressBar1);
			} else {
				mobileAction.waitForElementToDisappear(iOSProgressBar);
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {
		}
	}

	public void nosearch() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(nosearch, "No search layout");
			mobileAction.verifyElementIsDisplayed(searchmsg, "Search message");

		} catch (IOException e) {
		}
	}

}
