package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MutualFunds extends _CommonPage {

	private static MutualFunds mutualFunds;

	public synchronized static MutualFunds get() {
		if (mutualFunds == null) {
			mutualFunds = new MutualFunds();
		}
		return mutualFunds;
	}

	public MutualFunds() {
		Decorator();
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)),
				this);
	}

	/***************************************************************
	 * Mutual Fund
	 **********************************************/

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
	private MobileElement trade_header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done' or @label='OK']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mutual Funds' or @label='Fonds mutuels']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Mutual Funds' or @text='Fonds mutuels']")
	private MobileElement mutualfunds;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Order Type') or contains(@label,'ordre')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Order Type' or @text='Type d’ordre']")
	private MobileElement orderTypeElement;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Action') or contains(@label,'Action')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Please Select' or @text='Choisissez']")
	private MobileElement selectAction;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Enter name or symbol']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Enter name or symbol']")
	private MobileElement symbol;
	
	//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']
	String searchKeyword = getTestdata("Search");
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSearchField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_search_field_search_mode' and (@text='Enter name or symbol' or @text='Entrez le nom ou le symbole')]")
	private MobileElement symbolEditText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	//@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/market_name'][1]")
	private MobileElement selectSymbolValue;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSearchField[@label='Enter name or symbol']")
	// @iOSFindBy(xpath = "//*[@value='Enter name or symbol']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement symbol1;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Quantity Type')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Quantity Type']")
	private MobileElement txtqnt;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Amount']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement txtamount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton [@label='No']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement includesCommissionNo;

	@iOSFindBy(xpath = "//XCUIElementTypeButton [@label='Yes']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement includesCommissionYes;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Dividend Option')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Dividend Option']")
	private MobileElement txtdividendopt;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Account') or contains(@label,'Compte')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption'and @text='Account' or @text='Compte']")
	private MobileElement txtaccount;

	@AndroidFindBy(xpath = "//android.widget.ScrollView[@resource-id='com.td:id/order_entry_scroll']")
	private MobileElement list1;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement list;

	String txtscroll = "Important Information";

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/caption'and @text='Account']")
	private MobileElement txtaction;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1][@label='TORONTO DOMINION BANK']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tdticker' and @text='TORONTO DOMINION BANK']")
	private MobileElement selectTD;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Preview Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btnContinue' and @text='Preview Order']")
	private MobileElement ClickOnPreviewOrderBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Send Order']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tdticker' and @text='TORONTO DOMINION BANK']")
	private MobileElement Send_Order;

	@iOSFindBy(xpath = "//XCUIElementTypeLink[@label='Important Information']")
	private MobileElement importantInfo;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'I consent to receiving the Fund Facts electronically')]")
	private MobileElement confirmMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	private MobileElement insider;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@label='Short Sell']")
	private MobileElement shortSell;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[@label='Short Sell']")
	private MobileElement buyToCover;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	private MobileElement significant;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
	private MobileElement neither;

	String quant = "//android.widget.EditText[@resource-id='com.td:id/amountEditText'and @text='Quantity,']";

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress' or @label='En cours']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading' or @text='En cours']")
	private MobileElement progressBar;
	

	String actionToPerform = getTestdata("Action");
	String actionselected = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
			+ actionToPerform + "']";
	
	//android.widget.TextView[@resource-id='com.td:id/txtActionType' and @text='
	String trade_account_no = getTestdata("CDNMarginAccount");
	String appLanguage = getTestdata("Language");
	String CDNMarginAccountXL = getTestdata("Account");
	String TriggerPrice = getTestdata("TriggerPrice");
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
	String Action = getTestdata("Action");
	String selectPriceAsLimitXL = getTestdata("Price");

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
	/***************************************************************
	 * Mutual Fund
	 **********************************************/
	String searchSymbolXL = getTestdata("Search");
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Enter name or symbol' or @label='Chercher un nom de société ou un symbole']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSearchTitle'and @text='Enter name or symbol' or @text='Chercher un nom de société ou un symbole']")
	private MobileElement enterNameOrSymbol;

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

	String quantity = getTestdata("Quantity");
	String quantityXpath = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + quantity
			+ "']";

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/zonesCTA']")
	private MobileElement relativeLayout;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Amount') or contains(@label,'Montant')]/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText']")
	private MobileElement amount;


	String comissionXL = getTestdata("Comission");
	String comissionXpath = "//android.widget.RadioButton[@text='" + comissionXL + "']";
	String comissionXpathiOS = "//*[@label='" + comissionXL + "']";

	String amountXL = getTestdata("Amount");
	@iOSFindBy(xpath = "//*[contains(@label,'Dividend Option') or contains(@label,'Option de dividendes') or contains(@label,'Option dividendes')]")
	//@iOSFindBy(xpath ="//XCUIElementTypeCell/XCUIElementTypeStaticText[@label='Dividend Option']/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Dividend Option']/following-sibling::android.widget.TextView[@resource-id='com.td:id/selectedText']")
	//@AndroidFindBy(xpath = "//android.widget.TextView[@text='Dividend Option']/following-sibling::android.widget.TextView[@text='Please Select' or @text='Choisissez']")
	private MobileElement dividendOptions;

	String dividendOptionValue = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
			+ dividendOption + "']";

	//@iOSFindBy(xpath = "//*[contains(@label,'Trading Password') or contains(@label,'Mot de passe de négociation')]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trading Password' or @label='Mot de passe de négociation']")//@Author - Sushil 06-Feb-2017
	//@iOSFindBy(xpath="//XCUIElementTypeSecureTextField[@value='Enter your trading password' or contains(@label,'Mot de passe de négociation')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/editTextPassword']")
	private MobileElement tradingPassword;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Preview Order') or contains(@label,'Aperçu de')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Preview Order']")
	private MobileElement previewOrderBtn;
	//@resource-id='com.td:id/orderEntryPreviewButton'
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Agree') or contains(@label,'Accepte')]")
	//@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Agree' or @text='Accepte']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Agree']")
	//@resource-id='com.td:id/positiveButton' and 
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

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Send Order') or contains(@label,'Envoyer l’ordre')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Send Order' or @text='Envoyer l’ordre']")
	private MobileElement sendOrderBtn;

	@iOSFindBy(xpath = "//*[contains(@label,'Accueil') or contains(@label,'HOME')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_home' and contains(@text,'HOME')]")
	private MobileElement home_widget;

	@iOSFindBy(xpath = "//*[contains(@label,'Ordres') or  contains(@label,'ORDERS')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_order' and contains(@text,'ORDERS')]")
	private MobileElement order_widget;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Négociation') or  contains(@label,'TRADE')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_trade' and contains(@text,'TRADE')]")
	private MobileElement trade_widget;

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

	@iOSFindBy(xpath = "//*[@label='Retour' or @label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_Btn;

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

	String quantityiOSxpath = "//*[@label='" + quantity + "']";

	String actioniOSXpath = "//*[@label='" + actionToPerform + "']";

	String accountNumberiOSXpath = "//*[@label='" + trade_account_no + "']";
	
	String selectSymbolVal="//android.widget.TextView[@resource-id='com.td:id/market_name' and @text='" + searchKeyword +"']";
	
	String CDNMarginAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
			+ CDNMarginAccountXL + "')]";
	
	String accselected = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
			+ trade_account_no + "']";
	
	String txtAction = "//android.widget.TextView[@resource-id='com.td:id/txtActionType' and @text='" + Action + "']";
	
	String accountToSelect = "//*[contains(@label,'" + trade_account_no + "')]";
	

	String selectPriceAsLimitXpath = "//android.widget.TextView[@resource-id='com.td:id/txtOrderType' and @text='"
			+ selectPriceAsLimitXL + "']";


	/*****************************************************
	 * Create Mutual Fund
	 *************************************************/

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
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(orderTypeElement, "Order Type");
			if (platformName.equalsIgnoreCase("iOS")) {
				
				if (appLanguage.equalsIgnoreCase("FRE")) {

					mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, "Fonds mutuels");
				} else {
					mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, "Mutual Funds");
				}
			} else {
				mobileAction.FuncClick(mutualfunds, "Mutual Funds");
			}
			mobileAction.waitForElementToVanish(progressBar);

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the account and select the account.
	 */
	public void trade_account() {
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
				// mobileAction.FuncSelectElementInTable(action_table,
				// Firstpart, Secondpart, trade_account_no);
			}
			mobileAction.waitForElementToVanish(progressBar);
		} catch (Exception e1) {
		}

	}

	/**
	 * This method will select the action specified.
	 *
	 * @throws Exception
	 */
	public void clickAction() {
		try {
			mobileAction.FuncClick(selectAction, "Action");
			if (platformName.equalsIgnoreCase("Android")) {
				mobileAction.FuncElementSwipeWhileNotFound(list, actionselected, 1, "down", true);
			} else {
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerform);
			}
		} catch (Exception e) {

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

		//

		try {
			// mobileAction.waitForElementToVanish(progressBar);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
				mobileAction.waitForElementToVanish(progressBar);
				Thread.sleep(2000);
				try {
					String xpathSymbolFlag_ios = "//XCUIElementTypeStaticText [contains(@label,'"+ searchKeyword +"')]";
					MobileElement selectSymbol = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(xpathSymbolFlag_ios));
					mobileAction.FuncClick(selectSymbol,"Symbol");
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			} else {

				mobileAction.FuncClick(symbol, "Enter name or symbol");
				//mobileAction.FuncClick(symbolEditText, "Enter name or symbol");
				mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
				mobileAction.waitForElementToVanish(progressBar);
				
				MobileElement selectSymbolValue = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(selectSymbolVal));
				
				mobileAction.FuncClick(selectSymbolValue, "Symbol");

				mobileAction.waitForElementToVanish(progressBar);

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify switch mututal fund details.
	 */

	public void verifySwitchMutualConfirmDetails() {
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

		try {

			if (platformName.equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(back_Btn, "Back button");

				MobileElement dividendoption = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(dividendXpath));

				mobileAction.verifyElementIsDisplayed(dividendoption, dividendOption);

				MobileElement quanty = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(quantityxpath));

				mobileAction.verifyElementIsDisplayed(quanty, quantity);

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

				mobileAction.FuncClick(back_Btn, "Back button");

				MobileElement dividendoption = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(dividendiOSXpath));

				mobileAction.verifyElementIsDisplayed(dividendoption, dividendOption);

				MobileElement quanty = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(quantityiOSxpath));

				mobileAction.verifyElementIsDisplayed(quanty, quantity);

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

		try {
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(mutualQuantity, "Mutual Quantity");
			if (platformName.equalsIgnoreCase("Android")) {
				MobileElement selectQuantity = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(quantityXpath));
				mobileAction.FuncClick(selectQuantity, quantity);
			} else {
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, quantity);
			}

			mobileAction.waitForElementToVanish(progressBar);

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

		try {
			Thread.sleep(2000);
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

		try {
			//mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(previewOrderBtn, "Preview Order");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(AgreeCondition, "Agree button");
			mobileAction.waitForElementToVanish(progressBar);

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

		try {
			if (platformName.equalsIgnoreCase("Android")) {
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(fundFacts, "Fund Facts");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClickBackButton();
			} else {
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(fundFacts, "Fund Facts");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(back_Btn, "Back Button");
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

		try {

			mobileAction.FuncClick(sendOrderBtn, "Send Order");
			mobileAction.waitForElementToVanish(progressBar);

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

}
