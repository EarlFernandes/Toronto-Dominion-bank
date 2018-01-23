package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and @text='Action']")
	private MobileElement selectAction;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and @text='Action']")
	private MobileElement selectActionMF;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and @text='Action']")
	private MobileElement selectActionOptions;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeStaticText[contains(@label,'Action')]")//Need to check
	// for iOS
	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Back')]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@text,'Navigate up') or contains(@content-desc,'Navigate up')]")
	private MobileElement txtNavigateButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Choisissez']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Choisissez']")
	private MobileElement selectActionFRE;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/accountCaption")
	private MobileElement selectAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and (contains(@text,'ordre') or @text='Order Type')]")
	private MobileElement selectOrderType;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement list;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and (contains(@text,'ordre') or @text='Order Type')]")
	private MobileElement order_Type;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (@text='Trade' or @text='Négociation')]")
	private MobileElement trade_header;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/txtSearchTitle")
	private MobileElement symbol;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/txtSearchTitle")
	private MobileElement symbolMF;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/txtSearchTitle")
	private MobileElement symbolOptions;

	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[@label='Enter name or symbol' or contains(@label,'Entrez le')]") // @Author
																														// -
																														// Sushil
																														// 03-Feb-2017
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement symbolEditText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/market_name'])[1]")
	private MobileElement selectSymbolValue;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeTextField[1]")
	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and
	// (contains(@text,'Trigger Price ($)') or
	// contains(@text,'D�clenchement'))]")
	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='PRICE_TRIGGER_PRICE_CELL_1']/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Trigger Price') or contains(@text,'Déclenchement')]") // /../*[1]
																															// @Author
																															// -
																															// Sushil
																															// 17-Apr-2017
	private MobileElement triggerPriceEditText;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeTextField[1]")
	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and
	// (contains(@text,'Limit Price ($)')or contains(@text,'Cours limite'))]")
	// @AndroidFindBy(xpath =
	// "(//android.widget.EditText[@resource-id='com.td:id/amountEditText'])[3]")//@Author
	// - Sushil 17-Apr-2017
	// @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Limit
	// Price') or contains(@text,'Cours limite')]/../*[2]/*[1]")//@Author -
	// Shahbaaz 30-May-2017
	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='PRICE_LIMIT_PRICE_CELL_1']/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Limit Price') or contains(@text,'Cours limite')]") // /../*[1]
	private MobileElement limitPriceEditText;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeTextField[1]")
	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and
	// (contains(@text,'Limit Price ($)')or contains(@text,'Cours limite'))]")
	// @AndroidFindBy(xpath =
	// "(//android.widget.EditText[@resource-id='com.td:id/amountEditText'])[3]")//@Author
	// - Sushil 17-Apr-2017
	// @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Limit
	// Price') or contains(@text,'Cours limite')]/../*[2]/*[1]")//@Author -
	// Shahbaaz 30-May-2017
	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='PRICE_LIMIT_PRICE_CELL_1']/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Limit Price') or contains(@text,'Cours limite')]") // /../*[1]
	private MobileElement limitPriceEditTextWithTrigger;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and (@text='Day' or @text='Jour')]")
	private MobileElement btngood;

	// @iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Enter your
	// trading password' or @value='Entrer votre mot de passe de N�gociation']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeSecureTextField[1]")
	// -
	// Shahbaaz
	// 17-Apr-2017
	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/editTextPassword' and
	// (@content-desc='Enter your trading password' or @content-desc='Entrer
	// votre mot de passe')]")
	@AndroidFindBy(id = "com.td:id/editTextPassword")
	private MobileElement trading_pwd;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[10]/XCUIElementTypeSecureTextField[1]")
	@AndroidFindBy(id = "com.td:id/editTextPassword")
	private MobileElement trading_pwdMF;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[11]/XCUIElementTypeSecureTextField[1]")
	@AndroidFindBy(id = "com.td:id/editTextPassword")
	private MobileElement trading_pwdOptions;

	// for french
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Please Select']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and @text='Shareholder Type']")
	private MobileElement share_holder;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Trigger Delta') or contains(@text,'déclenchement')]") // /../*[1]
	private MobileElement triggerDelta;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeTextField[1]")
	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and
	// (contains(@text,'Limit Delta ($)')or contains(@text,'$ Delta
	// limite,'))]")
	// @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Limit
	// Delta') or contains(@text,'Delta limite')]/../*[1]") //@Author - Sushil
	// 17-Apr-2017
	// @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Limit
	// Delta') or contains(@text,'Delta limite')]/../*[2]/*[1]")//@Author -
	// Shahbaaz 30-May-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Limit Delta') or contains(@text,'Delta limite')]/../*[1]")
	private MobileElement limitDelta;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]/XCUIElementTypeTextField[1]")
	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/amountEditText' and
	// (contains(@text,'Limit Delta ($)')or contains(@text,'$ Delta
	// limite,'))]")
	// @AndroidFindBy(xpath =
	// "(//android.widget.EditText[@resource-id='com.td:id/amountEditText'])[3]")
	// //@Author - Sushil 17-Apr-2017
	// @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Limit
	// Delta') or contains(@text,'Delta limite')]/../*[2]/*[1]")//@Author -
	// Shahbaaz 30-May-2017
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Limit Delta') or contains(@text,'Delta limite')]") // /../*[1]
																															// @Author
																															// -
																															// Sushil
																															// 17-Apr-2017
	private MobileElement limitDeltaWithTrigger;

	@iOSXCUITFindBy(accessibility = "previewOrderButton") // @Author
															// -
															// Shahbaaz
															// 25-May-2017
	@AndroidFindBy(id = "com.td:id/orderEntryPreviewButton") // @Author
																// -
																// Sushil
																// 18-Apr-2017
	private MobileElement preview_order;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Agree' or @label='Accepte']")
	@AndroidFindBy(id = "com.td:id/positiveButton")
	private MobileElement agreeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Do not agree' or contains(@label='accepte pas')]")
	@AndroidFindBy(id = "com.td:id/negativeButton")
	private MobileElement doNotAgreeButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(id = "com.td:id/amountEditText")
	private MobileElement selectQuantity;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(id = "com.td:id/amountEditText")
	private MobileElement selectQuantityMF;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Market' or @text='Cours du marché')and @resource-id='com.td:id/selectedText']")
	private MobileElement selectPrice;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Quantity Type')and @resource-id='com.td:id/orderDropdownCaption']")
	private MobileElement quantityTypeMF;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Cours')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Market' or @text='Cours du marché') and @resource-id='com.td:id/selectedText']")
	private MobileElement selectPriceFRE;
	@iOSFindBy(xpath = "//*[contains(@label,'Stocks') or contains(@label,'Actions et FNB')] ")
	// @AndroidFindBy(xpath = + "xpath_stocks_ETFs + ")
	@AndroidFindBy(xpath = "//*[contains(@text,'Stocks') or contains(@text,'Actions et FNB')]")
	private MobileElement stocks_ETFs;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'The symbol entered is not valid, please re-enter the symbol')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'The symbol you entered is not valid, please re-enter the symbol')]")
	private MobileElement errorMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Cancel')]")
	@AndroidFindBy(xpath = "//*[@text='Cancel']")
	private MobileElement cancelBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Clear text']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/btn_clear_search_text' and @content-desc='Delete text']")
	private MobileElement clearText;

	@iOSFindBy(xpath = " //*[contains(@label,'Account') or contains(@label,'Compte')]") // @Author
																						// -
																						// Sushil
																						// 06-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private MobileElement defaultTradeAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back' or @label='Retour']") // @Author
																					// -
																					// Sushil
																					// 07-Mar-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedDate']")
	private MobileElement Date;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Confirm Order, Navigate up']")
	private MobileElement backbtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='tradingSymbol']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/investing_holding_details_header_layout']")
	private MobileElement symbol_present;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='accountNumberLabel']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accountCaption' and (@text='Account' or @text='Compte')]//following-sibling::android.widget.TextView[@resource-id='com.td:id/selectedValue']")
	private MobileElement accountval;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='GOOD_TIL_CELL_2']/XCUIElementTypeStaticText[@name='valueLeftLabel']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and contains(@text,'Good')]//following-sibling::android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private MobileElement goodtilval;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='ACTION_CELL_1']/XCUIElementTypeStaticText[@name='valueLeftLabel']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and @text='Action']//following-sibling::android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private MobileElement actionval;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='PRICE_ACTION_CELL_1']/XCUIElementTypeStaticText[@name='valueLeftLabel']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and @text='Price']//following-sibling::android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private MobileElement priceval;

	@AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
	private MobileElement navigateBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Watchlists')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Watchlists']")
	private MobileElement watchListsButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Welcome to the new Watchlist')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Welcome to the new Watchlist']")
	private MobileElement watchListScreen;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	private MobileElement continueBtn;

	@iOSFindBy(xpath = "//*[@value='Add symbol to watchlist']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_search_field_view_mode' and @content-desc='Add symbol to watchlist']")
	private MobileElement addSymbolToWatchlist;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Options')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_tradeOptions' and @text='Options']")
	private MobileElement options;

	@AndroidFindBy(xpath = "//android.widget.Button[(@text='Cancel' or @text='Annuler') and @resource-id='android:id/button2']")
	private MobileElement ignoreBackButton;

	String xpathSymbolFlag = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and @content-desc='U S']";
	String xpathSymbolFlag_ios = "//XCUIElementTypeCell[contains(@label,'US')]";
	String orderValueXL = getTestdata("Ordervalue");

	String price_value = getTestdata("Price", 0);

	String goodXL = getTestdata("Good'til", 0);

	String shareHolderXl = getTestdata("ShareHolder");

	boolean isLanguageFrench = false;
	String Action = getTestdata("Action");
	String actionToPerformXL = getTestdata("Action");
	String searchKeyword = getTestdata("Search");
	String trading_pwd_XL = getTestdata("Trading_Pwd");
	String triggerDelta_value = getTestdata("TriggerDelta");
	String limitDelta_value = getTestdata("LimitDelta");
	String tradeAccount = getTestdata("CDNMarginAccount");
	String currentPricePath = null;
	String trade_account_no = setCurrentArrayValue(getTestDataStringArray("CDNMarginAccount"));
	String accountToSelect = "//*[contains(@label,'" + trade_account_no + "')]";
	String accountNumberXpath = "//android.widget.TextView[@resource-id='com.td:id/selectedValue' and @text='"
			+ trade_account_no + "']";
	String accountNumberiOSXpath = "//*[@label='" + trade_account_no + "']";
	String accselected = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
			+ trade_account_no + "']";

	String shareholder_select = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
			+ shareHolderXl + "']";

	String selectgoodtill = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + goodXL
			+ "']";
	String txtAction = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + Action + "']";

	String orderValue = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and contains(@text,'"
			+ orderValueXL + "')]";

	String pricetype = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + price_value
			+ "']";
	String accountno = "//*[contains(@label,'" + trade_account_no + "')]";

	MobileElement priceTypeChangeOrderElement;
	String priceTypeChangeOrderValue;
	String xpathSymbolFlag_ios1 = "//XCUIElementTypeCell[contains(@label,'CA') or @label='Comptant CAN']";

	@iOSXCUITFindBy(accessibility = "ACCOUNT_HEADER_TEXT")
	@AndroidFindBy(id = "com.td:id/timestamp")
	private MobileElement timeHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStatusBar[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]")
	@AndroidFindBy(id = "TBD")
	private MobileElement statusTime;

	@iOSXCUITFindBy(accessibility = "descriptionLabel")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/selectedText'])[1]")
	private MobileElement accountName;

	@iOSXCUITFindBy(accessibility = "accountNumberLabel")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/selectedValue'])[1]")
	private MobileElement accountNumber;

	@iOSXCUITFindBy(accessibility = "valueLeftLabel")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/selectedText'])[2]")
	private MobileElement tradeOrderType;

	@iOSXCUITFindBy(accessibility = "tradingSymbol")
	@AndroidFindBy(id = "com.td:id/symbol_layout")
	private MobileElement tradingSymbolPerf;

	@iOSXCUITFindBy(accessibility = "td_investing_account_0_0")
	@AndroidFindBy(id = "com.td:id/accountRow2")
	private MobileElement investingAccMFPerf;

	@iOSXCUITFindBy(accessibility = "TBD")
	@AndroidFindBy(id = "com.td:id/selected_icon")
	private MobileElement consentMF;

	@iOSXCUITFindBy(accessibility = "sendOrderButton")
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement send_order;

	@iOSXCUITFindBy(accessibility = "confirmationNumberLabel")
	@AndroidFindBy(id = "com.td:id/confirmation_val")
	private MobileElement tradeConfirmationNumberPerf;

	@iOSXCUITFindBy(accessibility = "ACCOUNT")
	@AndroidFindBy(id = "com.td:id/dialog_title")
	private MobileElement acctListHeaderPerf;

	@iOSXCUITFindBy(accessibility = "TextField_0")
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement symbolEditFieldPerf;

	@iOSXCUITFindBy(accessibility = "tradePrice")
	@AndroidFindBy(id = "com.td:id/txt_price")
	private MobileElement symbolTradePricePerf;

	@iOSXCUITFindBy(accessibility = "lastPriceLabel")
	@AndroidFindBy(id = "com.td:id/current_price")
	private MobileElement symbolLastPricePerf;

	@iOSXCUITFindBy(accessibility = "MARKET")
	@AndroidFindBy(id = "com.td:id/dialog_title")
	private MobileElement tradePriceTypePerf;

	@iOSXCUITFindBy(accessibility = "Bid (Lots)")
	@AndroidFindBy(id = "com.td:id/optionDescription")
	private MobileElement bidLotsPerf;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[12]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc,'In The Money')])[2]")
	private MobileElement firstAskCallOption;

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
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)), this);
	}

	/**
	 * This method will verify the Trade Header is present or not
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyTradeHeader() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(trade_header, "Trade");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

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
		Decorator();
		try {
			mobileAction.waitProgressBarVanish();
			// mobileAction.verifyElementIsDisplayed(trade_header,t_verifyTrade);
			mobileAction.FunctionSwipe("down", 200, 200);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				// MobileElement marginAccVal = (MobileElement) ((AppiumDriver)
				// CL.GetDriver())
				// .findElement(By.xpath(accountno));
				Thread.sleep(2000);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(accountno, true, 60, "Up");
				// mobileAction.FunCSwipeandScroll(marginAccVal, true);
			} else {
				mobileAction.FuncClick(selectAccount, "Account Selected");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(accselected, true, 60, "up");
			}
			mobileAction.waitProgressBarVanish();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void selectAccountShareHolder() {
		Decorator();
		try {
			trade_account_no = getTestdata("CDNMarginAccount", 1);
			accselected = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
					+ trade_account_no + "']";

			mobileAction.FunctionSwipe("down", 200, 200);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(accountno, true, 25, "Up");
			} else {
				mobileAction.FuncClick(selectAccount, "Account Selected");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(accselected, true, 60, "up");
			}
			mobileAction.waitProgressBarVanish();

			mobileAction.FunctionSwipe("up", 200, 200);
			if (!mobileAction.FuncIsDisplayed(share_holder)) {
				CL.GetReporting().FuncReport("Pass", "The ShareHolder is verified for both the Accounts");

			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void selectOrderType() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				MobileElement OrderType = mobileAction.verifyElementUsingXPath(orderType, "Order Type");

				mobileAction.FuncClick(OrderType, "OrderType");
				String orderValue = "//XCUIElementTypeStaticText[contains(@label,'" + orderValueXL + "')]";
				mobileAction.selectItemFromList(stocks_ETFs, getTestdata("Ordervalue"));
			} else {
				mobileAction.FuncClick(order_Type, "OrderType");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(orderValue, true, 1, "up");
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void selectAction() {
		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement actionElement = isLanguageFrench ? selectActionFRE : selectAction;

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(actionElement, "Action clicked");
				mobileAction.FuncSelectElementInTable(action_table, Firstpart, Secondpart, actionToPerformXL);

			} else {
				// mobileAction.FunctionSwipe("up", 200, 50);
				// mobileAction.FuncClick(actionElement, "Action");
				mobileAction.FuncSwipeWhileElementNotFound(actionElement, true, 1, "up");
				MobileElement actionList = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(txtAction));
				mobileAction.verifyElementIsDisplayed(actionList, actionList.getText());
				mobileAction.FuncClick(actionList, "Action value clicked");

			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void selectAndEnterSymbol() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				/*
				 * mobileAction.FuncClick(symbol, "Enter name or symbol");
				 * mobileAction.FuncClick(symbolEditText, "Enter name or symbol"
				 * ); mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
				 * mobileAction.FuncClick(selectSymbolValue, "Symbol");
				 */

				/*
				 * mobileAction.FuncClick(symbol, "Enter name or symbol");
				 * //mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
				 * SearchPageMIT.get().enterSymbol(symbolEditText,
				 * searchKeyword);
				 * //SearchPageMIT.get().clickFirstSymbol(searchKeyword);
				 * mobileAction.waitForElementToVanish(progressBar);
				 * //Thread.sleep(2000);
				 */
				try {
					// String
					// xpathSymbolFlag_ios="//XCUIElementTypeCell[contains(@label,'CA')
					// or contains(@label,'Comptant CAN']";
					// String xpathSymbolFlag_ios =
					// "//XCUIElementTypeCell[contains(@label,'US') or
					// contains(@label,'Comptant CAN']";
					SearchPageMIT.get().clickFirstSymbol1(searchKeyword);
					Thread.sleep(1000);
					// mobileAction.FuncClick((MobileElement)
					// CL.GetDriver().findElements(By.xpath(xpathSymbolFlag_ios)).get(0),"First
					// Symbol");
					// Thread.sleep(1000);

				} catch (Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			} else {

				mobileAction.FuncClick(symbol, "Enter name or symbol");
				mobileAction.FuncClick(symbolEditText, "Enter name or symbol");

				// mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
				SearchPageMIT.get().enterSymbol(symbolEditText, searchKeyword);

				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(selectSymbolValue, "Symbol");

				mobileAction.waitProgressBarVanish();

			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void limitPrice(String limitPrice, boolean isOption) {

		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");

		try {

			CL.getTestDataInstance().TCParameters.put("LimitPrice", limitPrice);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunCSwipeandScroll(limitPriceEditText, true);
				if (isOption) {
					limitPriceEditText.clear();
				}
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					if (getTestdata("Language").equalsIgnoreCase("FRE")) {
						String limitPriceFRE = limitPrice.replace(".", ",");
						mobileAction.FuncSendKeys(limitPriceEditText, limitPriceFRE);
					} else {
						mobileAction.FuncSendKeys(limitPriceEditText, limitPrice);

					}
					mobileAction.FuncClickDone();
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
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void limitPriceWithTrigger(String limitPrice) {
		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {

			CL.getTestDataInstance().TCParameters.put("LimitPrice", limitPrice);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunCSwipeandScroll(limitPriceEditTextWithTrigger, true);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					if (isLanguageFrench) {
						String limitPriceFRE = limitPrice.replace(".", ",");
						mobileAction.FuncSendKeys(limitPriceEditTextWithTrigger, limitPriceFRE);

					} else {
						mobileAction.FuncSendKeys(limitPriceEditTextWithTrigger, limitPrice);
					}
					mobileAction.FuncClickDone();
				} else {

					mobileAction.FunctionSwipe("up", 200, 100);

					mobileAction.FuncClick(limitPriceEditTextWithTrigger, "Limit Price");
					// mobileAction.FuncSwipeWhileElementNotFound(limitPriceEditTextWithTrigger,
					// false, 5, "up");

					mobileAction.FuncClick(limitPriceEditTextWithTrigger, "Limit Price EditText");
					mobileAction.FuncSendKeys(limitPriceEditTextWithTrigger, limitPrice);
					mobileAction.FuncHideKeyboard();
				}
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void triggerPrice(String triggerPriceValue) {

		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {

			CL.getTestDataInstance().TCParameters.put("TriggerPrice", triggerPriceValue);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(triggerPriceEditText, "TriggerPrice");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					if (isLanguageFrench) {
						String triggerPriceFRE = triggerPriceValue.replace(".", ",");
						mobileAction.FuncSendKeys(triggerPriceEditText, triggerPriceFRE);
					} else {
						mobileAction.FuncSendKeys(triggerPriceEditText, triggerPriceValue);
					}
					mobileAction.FuncClickDone();
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
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement priceElement = isLanguageFrench ? selectPriceFRE : selectPrice;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(priceElement, "Price Selected");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				// mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {

				// if (!mobileAction.FuncIsDisplayed(priceElement)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				mobileAction.FuncClick(priceElement, "Price");
				// mobileAction.FuncSwipeWhileElementNotFound(priceElement,
				// true, 5, "up");
				MobileElement priceType = mobileAction.verifyElementUsingXPath(pricetype, "Price Type");
				mobileAction.FuncClick(priceType, "Price");
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void ConfirmOrder_ClickBack() {
		Decorator();
		try {
			mobileAction.FuncClick(backbtn, "back");

			// mobileAction.FuncClick(CL.GetDriver().findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Confirm
			// Order, Navigate up']")), "Back Button");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectGoodTill() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(btngood, "Good 'til");
				mobileAction.FuncSelectElementInTable(goodtilTable, Firstpart, Secondpart, goodXL);
				// mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {

				// if (!mobileAction.FuncIsDisplayed(btngood)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				mobileAction.FuncClick(btngood, "Good Till");
				// mobileAction.FuncSwipeWhileElementNotFound(btngood, true, 1,
				// "up");
				MobileElement actionList = mobileAction.verifyElementUsingXPath(selectgoodtill, "Good Till");

				mobileAction.FuncClick(actionList, "Good'Till value");
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void selectGoodTillChangeOrder() {
		Decorator();

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
				MobileElement actionList = mobileAction.verifyElementUsingXPath(selectgoodtill, "Good Till");

				mobileAction.FuncClick(actionList, "Good'Till value");
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void enterTradingPassword() {
		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");
		MobileElement doneOK = isLanguageFrench ? ok : done;

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(trading_pwd)) {
					mobileAction.FunctionSwipe("up", 200, 100);
					mobileAction.FuncClick(trading_pwd, "Trading Password");
					// mobileAction.FuncSwipeWhileElementNotFound(trading_pwd,
					// true,
					// 1,
					// "up");
					mobileAction.FuncSendKeys(trading_pwd, trading_pwd_XL);
					Thread.sleep(1000);
					mobileAction.FuncClickDone();
				}
			} else {
				mobileAction.FunctionSwipe("up", 200, 100);
				if (mobileAction.verifyElementIsPresent(trading_pwd)) {
					mobileAction.FuncClick(trading_pwd, "Trading Password");
					mobileAction.verifyElementIsDisplayed(trading_pwd, "Trading Password");

					// mobileAction.FuncSwipeWhileElementNotFound(trading_pwd,
					// true,
					// 1,
					// "up");
					mobileAction.FuncSendKeys(trading_pwd, trading_pwd_XL);
					mobileAction.FuncHideKeyboard();
					if (mobileAction.FuncIsDisplayed(ignoreBackButton)) {
						mobileAction.FuncClick(ignoreBackButton, "ignore back");
					}
				}
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void selectQuantity() {
		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			String quantity = getTestdata("Quantity");
			String[] Quantity = quantity.split(":");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncSendKeys(selectQuantity, Quantity[0]);
				mobileAction.FuncClickDone();

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
				mobileAction.FuncSendKeys(selectQuantity, Quantity[0]);
				mobileAction.FuncHideKeyboard();
				if (mobileAction.FuncIsDisplayed(ignoreBackButton)) {
					mobileAction.FuncClick(ignoreBackButton, "ignore back");
				}

			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());

		}
	}

	public void enterTriggerDelta() {

		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(triggerDelta, "Trigger Delta");
				mobileAction.FuncSendKeys(triggerDelta, triggerDelta_value);
				mobileAction.FuncClickDone();
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
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void enterLimitDelta() {

		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(limitDelta, "Limit Delta");
				mobileAction.FuncSendKeys(limitDelta, limitDelta_value);
				mobileAction.FuncClickDone();
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
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void enterLimitDeltaWithTrigger() {

		Decorator();
		isLanguageFrench = getTestdata("Language").equals("FRE");

		MobileElement doneOK = isLanguageFrench ? ok : done;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(limitDeltaWithTrigger, "Limit Delta");
				mobileAction.FuncSendKeys(limitDeltaWithTrigger, limitDelta_value);
				mobileAction.FuncClickDone();
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
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void enterLimitAndTriggerDelta() {

		enterTriggerDelta();
		enterLimitDeltaWithTrigger();
	}

	public void selectShareHolder() {
		Decorator();
		try {
			// if (!shareHolderXl.isEmpty())
			if (mobileAction.verifyElementIsPresent(share_holder)) {
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
					MobileElement actionList = mobileAction.verifyElementUsingXPath(shareholder_select, "ShareHolder");

					mobileAction.FuncClick(actionList, "Share Holder value");
				}
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void clickPreviewOrder() {
		Decorator();
		try {

			Thread.sleep(1000);
			mobileAction.FuncClick(preview_order, "Preview Order");
			mobileAction.waitProgressBarVanish();

			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void clickAgree() {
		Decorator();

		try {
			if (mobileAction.FuncIsDisplayed(agreeButton)) {
				mobileAction.FuncClick(agreeButton, "agree");

			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void clickDoNotAgree() {
		Decorator();

		try {

			mobileAction.FuncClick(doNotAgreeButton, "Do Not Agree");
			mobileAction.waitProgressBarVanish();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void trailingStopLimit() {

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

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getLimitAndTriggerPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterlimitAndTriggerPrice();
		selectGoodTill();
		if (goodXL.equalsIgnoreCase("Specify") || goodXL.equalsIgnoreCase("Préciser")) {
			try {
				mobileAction.FuncClick(Date, "Click Date");
				int current_date = GetDate.get().getTodaysDate();
				String DateToClick = "//android.view.View[@content-desc='" + current_date + "']";
				MobileElement Date_Click = mobileAction.mobileElementUsingXPath(DateToClick);
				mobileAction.FuncClick(Date_Click, "Date clicked");

			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void stopMarket() {

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

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		getStockPrice();
		selectAction();
		selectQuantity();
		selectPrice();
		enterTriggerPriceSell();
		selectGoodTill();
		if (goodXL.equalsIgnoreCase("Specify")) {
			try {
				mobileAction.FuncClick(Date, "Click Date");
				int current_date = GetDate.get().getTodaysDate();
				String DateToClick = "//android.view.View[@content-desc='" + current_date + "']";
				MobileElement Date_Click = mobileAction.mobileElementUsingXPath(DateToClick);
				mobileAction.FuncClick(Date_Click, "Date clicked");

			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	/*
	 * public void stopMarketSell_Date(){ selectAccount(); selectOrderType();
	 * selectAndEnterSymbol(); getStockPrice(); selectAction();
	 * selectQuantity(); selectPrice(); enterTriggerPriceSell();
	 * selectGoodTill();
	 * 
	 * enterTradingPassword(); clickPreviewOrder(); clickAgree(); }
	 */

	public void verifyTrade() {
		try {
			selectQuantity();
			enterTradingPassword();
			String ac_no = getTestdata("CDNMarginAccount");
			String action = getTestdata("Action");
			String price = getTestdata("Price");
			String goodtil = getTestdata("Good'til");
			mobileAction.FuncSwipeWhileElementNotFound(selectAccount, false, 5, "down");
			mobileAction.verifyElementTextContains(accountval, ac_no);
			mobileAction.verifyElementIsDisplayed(symbol_present, "Symbol");
			mobileAction.FuncSwipeWhileElementNotFound(btngood, false, 5, "up");
			mobileAction.verifyElementTextContains(actionval, action);
			mobileAction.verifyElementTextContains(priceval, price);
			mobileAction.verifyElementTextContains(goodtilval, goodtil);
			clickPreviewOrder();
			clickAgree();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void limit() {

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

		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();
		selectAction();

		try {
			CL.GetReporting().FuncReport("Pass", "The element <b>  " + Action + " </b> Clicked");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void getStockPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			// currentPricePath = "//*[@text='" + searchKeyword + "']/../*[1]";
			// currentPricePath="//XCUIElementTypeCell[contains(@label,'CA')]/XCUIElementTypeStaticText[2]";
			// currentPricePath =
			// "//XCUIElementTypeStaticText[contains(@label,'name or symbol') or
			// contains(@label,'autre nom ou
			// symbole')]/../following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]";//
			// @Author
			// -
			// Shahbaaz
			// 17-Apr-2017
			currentPricePath = "//XCUIElementTypeCell[contains(@label,'" + getTestdata("Search")
					+ "')]/XCUIElementTypeStaticText[@name='tradePrice']";
			System.out.println("CurrentPricePath  " + currentPricePath);
		} else {

			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/txt_price']";

		}

		MobileElement pricePath = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(currentPricePath));
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

		MobileElement pricePath = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getShortSellLimitAndTriggerPrice() {

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			currentPricePath = "//*[@text='Ask (Lots)']/following-sibling::*[1]";
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/bidPrice'] | android.widget.TextView[@resource-id='com.td:id/price']";
		}
		MobileElement pricePath = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getOptionLimitAndTriggerPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			currentPricePath = "xpath=//*[@text='" + searchKeyword + "']/../../following-sibling::*[1]/*[1]/*[1]/*[2]";
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/askPrice']";
		}

		MobileElement pricePath = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getSellLimitAndTriggerPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			currentPricePath = "xpath=//*[@text='" + searchKeyword + "']/../../following-sibling::*[1]/*[1]/*[1]/*[2]";
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/bidPrice']";
		}

		MobileElement pricePath = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(currentPricePath));

		CL.getTestDataInstance().TCParameters.put("CurrentPrice", pricePath.getText());

	}

	public void getLimitAndTriggerPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			// currentPricePath = "xpath=//*[@text='" + searchKeyword +
			// "']/../*[1]";
			currentPricePath = "//XCUIElementTypeCell[contains(@label,'" + getTestdata("Search")
					+ "')]/XCUIElementTypeStaticText[2]";// @Author
															// -
															// Shahbaaz
															// 17-Apr-2017
		} else {
			currentPricePath = "//android.widget.TextView[@resource-id='com.td:id/txt_price'] |android.widget.TextView[@resource-id='com.td:id/price']";

		}

		MobileElement pricePath = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(currentPricePath));

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

		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitProgressBarVanish();

		mobileAction.waitProgressBarVanish();
		getStockPrice();
		selectPriceChangeOrder();
		enterLimitPrice();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void ChangeQuantity() {
		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitProgressBarVanish();

		String quantity = getTestdata("Quantity");
		String[] Quantity = quantity.split(":");
		try {
			mobileAction.FuncSwipeWhileElementNotFound(selectQuantity, true, 1, "up");

			mobileAction.FuncSendKeys(selectQuantity, Quantity[1]);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();

			} else {
				mobileAction.FuncHideKeyboard();
			}
			enterTradingPassword();
			clickPreviewOrder();
			clickAgree();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void changeOrderLimitDayToDayEXT() {

		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitProgressBarVanish();

		mobileAction.waitProgressBarVanish();

		selectGoodTillChangeOrder();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void changeOrderLimitToMarket() {

		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitProgressBarVanish();

		mobileAction.waitProgressBarVanish();
		selectPriceChangeOrder();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void changeOrderTSM_To_TSL() {

		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitProgressBarVanish();

		mobileAction.waitProgressBarVanish();
		selectPriceChangeOrder();
		enterLimitAndTriggerDelta();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void change_Account() {
		Decorator();
		try {
			mobileAction.waitProgressBarVanish();
			mobileAction.FunctionSwipe("down", 200, 200);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectAccount, "AccountSelected");
				Thread.sleep(2000);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(accountno, true, 60, "Up");
			} else {
				String trade_account_no2 = getTestdata("CDNMarginAccount", 1);
				String acc_selected = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
						+ trade_account_no2 + "']";
				mobileAction.FuncClick(selectAccount, "Account Selected");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(acc_selected, true, 60, "up");
			}
			mobileAction.waitProgressBarVanish();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void changeOrderSM_To_SL() {

		CL.getTestDataInstance().TCParameters.put("ChangeOrder", "TRUE");

		mobileAction.waitProgressBarVanish();

		mobileAction.waitProgressBarVanish();
		selectPriceChangeOrder();
		getLimitAndTriggerPrice();
		selectPriceChangeOrder();
		enterlimitAndTriggerPrice();
		enterTradingPassword();
		clickPreviewOrder();
		clickAgree();
	}

	public void selectPriceChangeOrder() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FunctionSwipe("up", 200, 100);

				String selectPriceChangeOrder = "//XCUIElementTypeStaticText[@label='" + getTestdata("Price", 0) + "']";
				priceTypeChangeOrderElement = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(selectPriceChangeOrder));

				mobileAction.FuncClick(priceTypeChangeOrderElement, "Price Selected");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, getTestdata("Price", 1));
				mobileAction.FunCSwipeandScroll(trading_pwd, false);
			} else {

				// if (!mobileAction.FuncIsDisplayed(priceElement)) {

				mobileAction.FunctionSwipe("up", 200, 100);

				// }
				String selectPriceChangeOrder = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='"
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
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyFIFOLogic() {
		Decorator();
		try {

			String xpathFlag = "";
			String accNumber = getTestdata("CDNMarginAccount");
			String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";
			// mobileAction.waitForElement(defaultTradeAccount);
			mobileAction.FuncClick(defaultTradeAccount, "defaultTradeAccount");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");
			mobileAction.selectItemFromList(stocks_ETFs, getTestdata("Ordervalue"));

			String search[] = searchKeyword.split(":");
			for (int i = 0; i <= search.length; i++) {
				TradeMIT.get().tapTradeSearchBar();
				SearchPageMIT.get().enterSymbol(symbolEditText, search[i]);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					xpathFlag = xpathSymbolFlag;
				} else {
					xpathFlag = xpathSymbolFlag_ios;

				}
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElements(By.xpath(xpathFlag)).get(0),
						"First Symbol");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClick(backButton, "BackButton");
				} else {
					mobileAction.FuncHideKeyboard();
				}

			}
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(backButton, "BackButton");
			} else {
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(watchListsButton, "WatchList");
			if (mobileAction.verifyElementIsPresent(watchListScreen)) {
				mobileAction.FuncClick(continueBtn, "Continue");
			}
			mobileAction.FuncClick(addSymbolToWatchlist, "Add Symbol To Watchlist");
			mobileAction.FuncClick(options, "Options");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	@SuppressWarnings("unchecked")
	public void verifyRelaventMatchInResult() {
		Decorator();

		List<MobileElement> relevantMatches = null;
		int relevantMatchesElements = 0;
		selectAccount();
		selectOrderType();
		TradeMIT.get().tapTradeSearchBar();
		SearchPageMIT.get().enterSymbol(symbolEditText, getTestdata("Search"));
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			relevantMatches = ((AppiumDriver) CL.GetDriver())
					.findElements(By.xpath("//XCUIElementTypeTable[@name='Search results']/XCUIElementTypeCell"));
			relevantMatchesElements = relevantMatches.size();
		} else {
			relevantMatches = ((AppiumDriver) CL.GetDriver()).findElements(By.xpath(
					"//android.widget.ListView[@resource-id='com.td:id/lv_searchList']/android.widget.RelativeLayout[@resource-id='com.td:id/root_layout']"));
			relevantMatchesElements = relevantMatches.size();
		}
		try {
			CL.GetReporting().FuncReport("Pass",
					"The number of elements <b>  " + relevantMatchesElements + " </b> displayed");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (NullPointerException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NullPointerException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void verifySymbol() {
		Decorator();
		selectAccount();
		selectOrderType();
		selectAndEnterSymbol();

	}

	public void cancel_ordertype() {
		Decorator();

		selectOrderType();

		try {
			mobileAction.FuncClick(txtNavigateButton, "Navigate Back");
			mobileAction.FuncClick(txtNavigateButton, "Navigate Back");
			mobileAction.FuncClick(txtNavigateButton, "Navigate Back");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifyEquityAndETFs() {
		Decorator();

		try {

			String Search = getTestdata("Search");
			String[] Symbol = Search.split(":");
			for (int i = 0; i < Symbol.length - 1; i++) {

				TradeMIT.get().tapTradeSearchBar();
				SearchPageMIT.get().enterSymbol(symbolEditText, Symbol[i]);

				mobileAction.verifyElementIsDisplayed(errorMessage, "ErrorMessage");
				mobileAction.FuncClick(cancelBtn, "Cancel");
			}
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().enterSymbol(symbolEditText, Symbol[2]);
			mobileAction.verifyElementIsDisplayed(selectSymbolValue, "Symbol");

		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void verifyTradeOnLandingPage() {
		Decorator();
		try {
			selectAccount();
			String order = getTestdata("Ordervalue");
			String orderType[] = order.split(":");
			for (int i = 0; i <= orderType.length; i++) {
				mobileAction.selectItemFromList(stocks_ETFs, orderType[i]);
				mobileAction.verifyElementIsDisplayed(symbol, "Symbol");

			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void placeHolderText() {
		Decorator();

		try {

			mobileAction.FuncClick(symbol, "Enter name or symbol");
			mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(clearText, "Clear Text");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void noSearch() {
		Decorator();

		try {

			mobileAction.FuncClick(symbol, "Enter name or symbol");
			mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(errorMessage, "Error Message");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void verifyTradePage() {
		Decorator();
		try {

			// Verify Current time
			mobileAction.verifyElementIsDisplayed(timeHeader, "Time header");
			// String date = Calendar.MONTH + " " + Calendar.DATE + "," +
			// Calendar.YEAR;
			// mobileAction.verifyElementTextContains(timeHeader, date);

			// String time = mobileAction.FuncGetText(statusTime);
			// time = time.substring(0, time.indexOf(" "));
			// mobileAction.verifyElementTextContains(timeHeader, time);

			// Verify account name & number is populated
			boolean acctSelected = mobileAction.verifyElementIsPresent(accountNumber);
			if (acctSelected) {
				mobileAction.verifyElementIsDisplayed(accountName, "Account Name");
				mobileAction.verifyElementIsDisplayed(accountNumber, "Account Number");

				String acctName = mobileAction.FuncGetText(accountName);
				String acctNum = mobileAction.FuncGetText(accountNumber);

				if (acctName.length() > 0 && acctNum.length() > 0) {
					CL.GetReporting().FuncReport("Pass",
							"The element <b>- " + acctName + "," + acctNum + "</b> is displayed.");
				} else {
					CL.GetReporting().FuncReport("Fail", "No account name or number is displayed");
				}
			} else {
				mobileAction.verifyElementIsDisplayed(accountName, "Account Name");
				mobileAction.verifyElementTextContains(accountName,
						getTextInCurrentLocale(StringArray.ARRAY_TRADE_SELECT_ACCOUNT));
			}

			// Verify Order Type
			mobileAction.verifyElementIsDisplayed(tradeOrderType, "Order Type");
			mobileAction.verifyElementTextContains(tradeOrderType,
					getTextInCurrentLocale(StringArray.ARRAY_TRADE_ORDER_TYPE_STOCKS_ETF));

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

	public void enterTradePERF() {

		Decorator();
		try {

			String orderValue = "";
			String actionValue = "";
			String priceValue = "";
			String goodTillValue = "";
			tradeAccount = getTestdata("CDNMarginAccount");
			orderValueXL = getTestdata("Ordervalue");
			searchKeyword = getTestdata("Search");
			Action = getTestdata("Action");
			price_value = getTestdata("Price");
			goodXL = getTestdata("Good'til");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				accountno = "//XCUIElementTypeStaticText[contains(@label,'" + tradeAccount + "')]";
				orderValue = "//XCUIElementTypeStaticText[contains(@label,'" + orderValueXL + "')]";
				actionValue = "//XCUIElementTypeStaticText[contains(@label,'" + Action + "')]";
				priceValue = "//XCUIElementTypeStaticText[contains(@label,'" + price_value + "')]";
				goodTillValue = "//XCUIElementTypeStaticText[contains(@label,'" + goodXL + "')]";

			} else {
				accountno = "//android.widget.TextView[contains(@text,'" + tradeAccount + "')]";
				orderValue = "//android.widget.TextView[contains(@text,'" + orderValueXL + "')]";
				actionValue = "//android.widget.TextView[contains(@text,'" + Action + "')]";
				priceValue = "//android.widget.TextView[contains(@text,'" + price_value + "')]";
				goodTillValue = "//android.widget.TextView[contains(@text,'" + goodXL + "')]";
			}

			performance.click(selectAccount, "Account");
			performance.verifyElementIsDisplayed(acctListHeaderPerf, "Account List Header in Trade");
			mobileAction.swipeAndSearchByxpath(accountno, true, 10, "Up");

			mobileAction.FuncClick(selectOrderType, "Order Type");
			mobileAction.swipeAndSearchByxpath(orderValue, true, 1, "Up");

			performance.click(symbol, "Enter name or symbol");
			performance.verifyElementIsDisplayed(symbolEditFieldPerf, "Symbol Search field in Trade");

			mobileAction.FuncClick(symbolEditText, "Enter name or symbol");
			mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
			mobileAction.sleep(3000);
			performance.click(selectSymbolValue, "1st Symbol");
			performance.verifyElementIsDisplayed(symbolTradePricePerf, "Trade Price in Trade");

			mobileAction.FunctionSwipe("up", 500, 0);
			mobileAction.FuncClick(selectAction, "Action");
			mobileAction.swipeAndSearchByxpath(actionValue, true, 1, "Up");

			String quantity = getTestdata("Quantity");
			mobileAction.FuncClick(selectQuantity, "Quantity");
			mobileAction.FuncSendKeys(selectQuantity, quantity);
			mobileAction.FuncHideKeyboard();

			performance.click(selectPrice, "Price Type Selected");
			performance.verifyElementIsDisplayed(tradePriceTypePerf, "Market Price in Trade");
			mobileAction.swipeAndSearchByxpath(priceValue, true, 1, "Up");

			mobileAction.FuncClick(btngood, "Good 'til");
			mobileAction.swipeAndSearchByxpath(goodTillValue, true, 1, "Up");

			mobileAction.FuncClick(trading_pwd, "Trading Password");
			mobileAction.FuncSendKeys(trading_pwd, trading_pwd_XL);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(preview_order, "Preview Order");
			mobileAction.waitProgressBarVanish();

			performance.click(agreeButton, "Agree");
			performance.verifyElementIsDisplayed(tradingSymbolPerf, "Trading Symbol in Confirm Order");

			performance.click(send_order, "Send Order");
			performance.verifyElementIsDisplayed(tradeConfirmationNumberPerf, "Trade Confirmation Number in Receipt");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void enterTradeMFPERF() {

		Decorator();
		try {

			String orderValue = "";
			String actionValue = "";
			String priceValue = "";
			tradeAccount = getTestdata("CDNMarginAccount");
			orderValueXL = getTestdata("Ordervalue");
			searchKeyword = getTestdata("Search");
			Action = getTestdata("Action");
			price_value = getTestdata("Price");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				accountno = "//XCUIElementTypeStaticText[contains(@label,'" + tradeAccount + "')]";
				orderValue = "//XCUIElementTypeStaticText[contains(@label,'" + orderValueXL + "')]";
				actionValue = "//XCUIElementTypeStaticText[contains(@label,'" + Action + "')]";
				priceValue = "//XCUIElementTypeStaticText[contains(@label,'" + price_value + "')]";

			} else {
				accountno = "//android.widget.TextView[contains(@text,'" + tradeAccount + "')]";
				orderValue = "//android.widget.TextView[contains(@text,'" + orderValueXL + "')]";
				actionValue = "//android.widget.TextView[contains(@text,'" + Action + "')]";
				priceValue = "//android.widget.TextView[contains(@text,'" + price_value + "')]";
			}

			performance.click(selectAccount, "Account");
			performance.verifyElementIsDisplayed(acctListHeaderPerf, "Account List Header in Trade");
			mobileAction.swipeAndSearchByxpath(accountno, true, 10, "Up");

			mobileAction.FuncClick(selectOrderType, "Order Type");
			mobileAction.swipeAndSearchByxpath(orderValue, true, 1, "Up");

			mobileAction.FuncClick(selectActionMF, "Action");
			mobileAction.swipeAndSearchByxpath(actionValue, true, 1, "Up");

			performance.click(symbolMF, "Enter name or symbol");
			performance.verifyElementIsDisplayed(symbolEditFieldPerf, "Symbol Search field in Trade");

			mobileAction.FuncClick(symbolEditText, "Enter name or symbol");
			mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
			mobileAction.sleep(3000);
			performance.click(selectSymbolValue, "1st Symbol");
			performance.verifyElementIsDisplayed(symbolLastPricePerf, "Last Trade Price in Trade");

			mobileAction.FunctionSwipe("up", 500, 0);
			mobileAction.FuncClick(quantityTypeMF, "Quantity Type Selected");
			mobileAction.swipeAndSearchByxpath(priceValue, true, 1, "Up");

			String quantity = getTestdata("Quantity");
			mobileAction.FuncClick(selectQuantityMF, "Quantity");
			mobileAction.FuncSendKeys(selectQuantityMF, quantity);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(trading_pwdMF, "Trading Password");
			mobileAction.FuncSendKeys(trading_pwdMF, trading_pwd_XL);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(preview_order, "Preview Order");
			mobileAction.waitProgressBarVanish();

			performance.click(agreeButton, "Agree");
			performance.verifyElementIsDisplayed(investingAccMFPerf, "Account in Confirm Order");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.FunctionSwipe("up", 500, 0);
				mobileAction.FuncClick(consentMF, "Consent in Confirm Order");
			}
			performance.click(send_order, "Send Order");
			performance.verifyElementIsDisplayed(tradeConfirmationNumberPerf, "Trade Confirmation Number in Receipt");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void enterTradeOptionsPERF() {

		Decorator();
		try {

			String orderValue = "";
			String actionValue = "";
			tradeAccount = getTestdata("CDNMarginAccount");
			orderValueXL = getTestdata("Ordervalue");
			searchKeyword = getTestdata("Search");
			Action = getTestdata("Action");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				accountno = "//XCUIElementTypeStaticText[contains(@label,'" + tradeAccount + "')]";
				actionValue = "//XCUIElementTypeStaticText[contains(@label,'" + Action + "')]";
				orderValue = "//XCUIElementTypeStaticText[contains(@label,'" + orderValueXL + "')]";
			} else {
				accountno = "//android.widget.TextView[contains(@text,'" + tradeAccount + "')]";
				actionValue = "//android.widget.TextView[contains(@text,'" + Action + "')]";
				orderValue = "//android.widget.TextView[contains(@text,'" + orderValueXL + "')]";
			}

			performance.click(selectAccount, "Account");
			performance.verifyElementIsDisplayed(acctListHeaderPerf, "Account List Header in Trade");
			mobileAction.swipeAndSearchByxpath(accountno, true, 10, "Up");

			mobileAction.FuncClick(selectOrderType, "Order Type");
			mobileAction.swipeAndSearchByxpath(orderValue, true, 1, "Up");

			performance.click(symbolOptions, "Enter name or symbol");
			performance.verifyElementIsDisplayed(symbolEditFieldPerf, "Symbol Search field in Trade");

			mobileAction.FuncClick(symbolEditText, "Enter name or symbol");
			mobileAction.FuncSendKeys(symbolEditText, searchKeyword);
			mobileAction.sleep(3000);
			mobileAction.FuncClick(selectSymbolValue, "1st Symbol");
			mobileAction.waitProgressBarVanish();
			performance.click(firstAskCallOption, "1st Ask Call Option in Symbol Quotes");
			performance.verifyElementIsDisplayed(bidLotsPerf, "Bid Lots in Symbol Quotes");

			mobileAction.FunctionSwipe("up", 500, 0);
			mobileAction.FuncClick(selectActionOptions, "Action");
			mobileAction.swipeAndSearchByxpath(actionValue, true, 1, "Up");

			String quantity = getTestdata("Quantity");
			mobileAction.FuncClick(selectQuantityMF, "Quantity");
			mobileAction.FuncSendKeys(selectQuantityMF, quantity);
			mobileAction.FuncHideKeyboard();

			mobileAction.FunctionSwipe("up", 500, 0);
			mobileAction.FuncClick(trading_pwdOptions, "Trading Password");
			mobileAction.FuncSendKeys(trading_pwdOptions, trading_pwd_XL);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(preview_order, "Preview Order");
			mobileAction.waitProgressBarVanish();

			performance.click(agreeButton, "Agree");
			performance.verifyElementIsDisplayed(investingAccMFPerf, "Account in Confirm Order");

			performance.click(send_order, "Send Order");
			performance.verifyElementIsDisplayed(tradeConfirmationNumberPerf, "Trade Confirmation Number in Receipt");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

}
