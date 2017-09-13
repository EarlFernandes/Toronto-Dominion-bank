package com.td.test.CDNMobile.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.DoubleToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import com.td.test.framework.MobileAction;
import com.td.test.framework.Reporting;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MIT_PNSCreateNewAlert extends _CommonPage {

	private static MIT_PNSCreateNewAlert MIT_PNSCreateNewAlert;

	public synchronized static MIT_PNSCreateNewAlert get() {
		if (MIT_PNSCreateNewAlert == null) {
			MIT_PNSCreateNewAlert = new MIT_PNSCreateNewAlert();
		}
		return MIT_PNSCreateNewAlert;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation']")
	private MobileElement Investing_Trade;

	@iOSFindBy(xpath = "//*[contains(@label,'Investing') or contains(@label,'Comptes Placements')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Investing Accounts' or contains(@text,'Comptes Placements')) and @resource-id='com.td:id/navText']")
	MobileElement InvestingAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='NAV_DRAWER_ITEMS_LOGOUT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement Logout;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='Alerts' or contains(@name,'Alertes')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Alerts' or @text='Alertes']")
	private MobileElement Alerts;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']")
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='BackButton']")
	// @AndroidFindBy(id="android:id/action_bar_title")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	// @AndroidFindBy(id="android:id/action_bar_title")
	private MobileElement backButton2;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Back']")
	// @AndroidFindBy(id="android:id/action_bar_title")
	private MobileElement backButton1;

	// @iOSFindBy(xpath = "//XCUIElementTypeImage[@label='Home' or
	// @label='Accueil']")
	@iOSFindBy(xpath = "//*[contains(@label,'Menu')]")
	@AndroidFindBy(xpath = "//*[(@text='Home' or @text='Accueil') and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrHome;

	@iOSFindBy(xpath = "//*[contains(@label,'Menu')]")
	@AndroidFindBy(id = "android:id/up")
	MobileElement MenuUp;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Alert Delivery Prefrences' or @label='Accueil']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='DeliveryPrefrencesButton']")
	private MobileElement gearIcon;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Delivery Preferences' or @name='Accueil']")
	// @iOSFindBy(xpath="//*[contains(@label,'Menu')]")
	// @AndroidFindBy(xpath = "//*[(@text='Home' or @text='Accueil') and
	// @resource-id='android:id/action_bar_title']")
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='BackButton']")
	private MobileElement txtdelivery;

	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[@label='Enter name or symbol' or contains(@label,'Entrez le')]")
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Search' or contains(@label,'Recherche')]")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Back']")
	private MobileElement hdrSearch;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Price rises above' or contains(@name,'Hausse de cours au-dessus de')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
	private MobileElement btnRisesAbove;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='52 week high or low price' or contains(@name,'haut ou bas sur 52 semaines')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='3']")
	private MobileElement btn52Week;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Price change on heavy volume' or contains(@name,'fort volume')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Price change on heavy volume')]")
	// @AndroidFindBy(xpath = "//android.widget.Button[@index='3']")
	private MobileElement btnHeavyVol;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Fund price drops below' or contains(@name,'fort volume')]")
	// @AndroidFindBy(xpath =
	// "//android.widget.Button[contains(@content-desc,'Fund price drops
	// below')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
	private MobileElement btnDropBelow;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Price drops below' or contains(@name,'Baisse de cours sous')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Price drops below')]")
	// @AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
	private MobileElement btnStockDropBelow;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Price changes from previous close' or contains(@name,'Hausse du cours du fonds')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Price changes from previous close') or contains(@content-desc,'Hausse du cours du fonds')]")
	// @AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
	private MobileElement btnFundRisesAbove;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Fund price rises above' or contains(@name,'Variation de cours depuis la')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Fund price drops below') or contains(@content-desc,'Variation de cours depuis la')]")
	// @AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
	private MobileElement btnFundPriceChangeFromPrevious;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Price gap at opening trade' or contains(@name,'écart de cours �')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Price gap at opening trade ') or contains(@content-desc,'écart de cours �')]")
	// @AndroidFindBy(xpath = "//android.widget.Button[@index='6']")
	private MobileElement btnETFPriceGap;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Price rises faster than index' or contains(@name,'�cart de cours �')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Price rises faster than index') or contains(@content-desc,'écart de cours �')]")
	// @AndroidFindBy(xpath = "//android.widget.Button[@index='6']")
	private MobileElement btnETFPriceRisesfaster;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Price changes from previous close' or contains(@name,'écart de cours �')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Price changes from previous close') or contains(@content-desc,'écart de cours �')]")
	// @AndroidFindBy(xpath = "//android.widget.Button[@index='4']")
	private MobileElement btnETFPriceChangesfrom;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Price changes from previous close' or contains(@name,'écart de cours �')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Price changes from previous close') or contains(@content-desc,'écart de cours �')]")
	// @AndroidFindBy(xpath = "//android.widget.Button[@index='4']")
	private MobileElement btnStockPriceChangesfrom;

	By btnStockPriceDropsBelow = By.xpath("(//*[@class='condition-row'])[1]");

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='SELECT DELIVERY PREFERENCES' or contains(@name,'S�LECTIONNER LE MODE')]")
	// @iOSFindBy(xpath="//*[contains(@label,'Menu')]")
	// @AndroidFindBy(xpath = "//*[(@text='Home' or @text='Accueil') and
	// @resource-id='android:id/action_bar_title']")
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private MobileElement txtdeliverypreferences;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Mid Price') or contains(@label,'Prix Milieu')]/../XCUIElementTypeStaticText[2]") // need
																																						// to
																																						// be
																																						// fix
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='Price' or contains(@resource-id,'Prix')]")
	private MobileElement editAmount;

	By editAmountWeb = By.xpath("//*[@id='Price']");

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'The price you entered') or contains(@name,'The price you entered')]")
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private MobileElement error_text;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'If you would like') or contains(@name,'Pour recevoir des alertes courriel')]")
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private MobileElement error_textGreater;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Create Alert' or contains(@name,'une alerte')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Create Alert' or @content-desc='Cr�er une alerte']")
	private MobileElement btnCreateAlert;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'New Alert Created For') or contains(@name,'Nouvelle alerte cr')]")
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private MobileElement txt_AlertCreatedfor;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Create Similar Alert') or contains(@name,'une alerte similaire')]")
	@AndroidFindBy(xpath = "//android.view.View[@index='2']")
	private MobileElement txt_CreateSimilar;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'New alert using the same symbol') or contains(@name,'Nouvelle alerte avec le')]")
	@AndroidFindBy(xpath = "//android.view.View[@index='3']")
	private MobileElement txt_Alertsamesymbol;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'DONE') or contains(@name,'TERMIN�')]")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='DONE' or @content-desc='TERMIN�']")
	private MobileElement btnDone;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter name or symbol' or contains(@value,'Entrez le')]")
	// @AndroidFindBy(id="com.td:id/edt_search_field_search_mode")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='symbol-search']")
	private MobileElement search_symbolPNS;

	String xpathSymbolFlag = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and @content-desc='U S']";
	// String xpathSymbolFlag =
	// "//android.widget.ImageView[(@resource-id='com.td:id/market_symbol' and
	// @content-desc='U S')] or //XCUIElementTypeCell[contains(@label,'US')]";
	// String xpathSymbolFlag_ios =
	// "//XCUIElementTypeStaticText[contains(@label,'RESULTS')]/../XCUIElementTypeCell[contains(@label,'US')]";
	String xpathSymbolFlag_ios = "//XCUIElementTypeCell[contains(@label,'US')]";
	String xpathSymbolName = "//*[@id='com.td:id/market_name']";

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[4]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*[1]/*[1]/*[2]")
	private MobileElement Quote_Symbol;

	// String xpathQuote = "//XCUIElementTypeStaticText[@label='Search for a
	// different name or symbol']/../following-sibling";
	// @iOSFindBy(xpath =
	// "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='TD']")
	@AndroidFindBy(xpath = "//android.view.View[@index='1']")
	private MobileElement Quote_Symbol1;

	// @iOSFindBy(xpath = "//XCUIElementTypeOther[@name='TORONTO-DOMINION
	// BANK']")
	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[5]/*")
	// @AndroidFindBy(xpath = "//android.view.View[@index='2']")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*[1]/*[1]/*[3]")
	private MobileElement txtCompanyName;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[8]/*[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*/*[2]")
	private MobileElement txtCurrentPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[7]/*/*/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.view.View[@index='4']")
	private MobileElement txtLowPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[7]/*[3]/*/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.view.View[@index='5']")
	private MobileElement txtHighPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[9]/*[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*/*[3]/*[2]")
	private MobileElement txtChangeAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[9]/*[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*/*[3]/*[4]")
	private MobileElement txtChangePercent;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[10]/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]") // @Author
																																								// -
																																								// Sushil
																																								// 08-Feb-2017
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*/*[4]/*[1]")
	private MobileElement txtVolume;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[10]/*[1]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*/*[4]/*[2]")
	private MobileElement txtAvgVolume;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[10]/*[3]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*/*[4]/*[3]")
	private MobileElement txtPERatio;

	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'EDT')]")
	private MobileElement timestamp;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Create New Alert' or contains(@name,'Créer une nouvelle alerte')]")
	// @iOSFindBy(xpath="//*[contains(@label,'Menu')]")
	// @AndroidFindBy(xpath = "//*[(@text='Home' or @text='Accueil') and
	// @resource-id='android:id/action_bar_title']")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Create New Alert') or contains(@content-desc,'Créer une nouvelle alerte')]")
	private MobileElement btncreateAlert;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Push Notification' or contains(@name,'Notification')]/../following-sibling::XCUIElementTypeOther[1]/*/*[1]")
	// @AndroidFindBy(xpath =
	// "//android.widget.CheckBox[@resource-id='DeliverPns']")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Push Notification') or contains(@content-desc,'Notification')]/../*[2]/*[1]")
	private MobileElement checkBoxPush;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Push Notification' or contains(@name,'Notification')]/../following-sibling::XCUIElementTypeOther[1]/*/*[1]")
	// @AndroidFindBy(xpath =
	// "//android.widget.CheckBox[@resource-id='DeliverPns']")
	// @AndroidFindBy(xpath =
	// "(//android.widget.Switch[@resource-id='com.td:id/nav_row_switch'])[2]")
	@AndroidFindBy(xpath = "(//android.widget.Switch[@resource-id='com.td:id/nav_row_switch'])[2]")
	private MobileElement togglePush;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Primary Email' or contains(@name,'Adresse principale')]/../following-sibling::XCUIElementTypeOther[1]/*/*[1]")
	// @AndroidFindBy(xpath =
	// "//android.widget.CheckBox[@resource-id='DeliverPrimary']")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Primary Email') or contains(@content-desc,'Adresse principale')]/../*[2]/*[1]")
	private MobileElement checkBoxPrimaryEmail;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Secondary Email' or contains(@name,'Adresse secondaire')]/../following-sibling::XCUIElementTypeOther[1]/*/*[1]")
	// @AndroidFindBy(xpath =
	// "//android.widget.CheckBox[@resource-id='DeliverSecondary']")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Secondary Email') or contains(@content-desc,'Adresse secondaire')]/../*[2]/*[1]")
	private MobileElement checkBoxSecondaryEmail;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select Change Percent' or contains(@name,'variation en pourcentage ')]")
	@AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id='VolumePercentChange']")
	private MobileElement spinnerPercent;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select price gap direction' or contains(@name,'S�lectionnez la direction de')]")
	@AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id='Direction']")
	private MobileElement spinnerPriceGap;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select price gap direction' or contains(@name,'S�lectionnez la direction de')]")
	// @AndroidFindBy(xpath =
	// "//android.widget.Spinner[@resource-id='Direction']")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Select Change Percent')]/../*[2]")
	private MobileElement spinnerChangePercent;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select Index' or contains(@name,'S�lectionnez la direction de')]")
	// @AndroidFindBy(xpath =
	// "//android.widget.Spinner[@resource-id='Direction']")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Select Index')]/../*[2]")
	private MobileElement spinnerETFIndex;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Select Time Period' or contains(@name,'S�lectionnez la direction de')]")
	// @AndroidFindBy(xpath =
	// "//android.widget.Spinner[@resource-id='Direction']")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Select Time Period')]/../*[2]")
	private MobileElement spinnerTimePeriod;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='main']/XCUIElementTypeOther[9]/*[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'To receive push notifications')]")
	private MobileElement txtFooterWarning;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") // @Author -
																// Sushil
																// 07-Mar-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButtons6;

	By LBL_CreateSimilarAlert = By.xpath("//*[@class='heading-4 create-similar-title']");

	By ERR_SecondaryEmail = By.xpath("//*[@class='alert-warning alert']/*/*[1]");

	By VAL_Price = By.xpath("//*[@class='lastPrice']");

	By Text_Condition = By.xpath("//*[@class='module enter-condition-module']/*[1]");

	By Link_ChangeCondition = By.xpath("//*[@class='symbol pull-left']");

	By BTN_Refresh = By.xpath("//*[@class='sprite sprite-refresh']");

	By Edit_Symbol = By.xpath("//*[@id='symbol-search']");

	By LBL_Symbol_CA = By.xpath("//*[@class='sprite flag flag-ca']/../*[@class='symbol']/*[1]");

	By LBL_Symbol_US = By.xpath("//*[@class='sprite flag flag-us']/../*[@class='symbol']/*[1]");

	By BTN_EditPush = By.xpath("//*[@class='email-row push-notifications-row top-row']");

	By TXT_Warningmsg = By.xpath("//*[@class='suspend-message']");

	By LINK_Settings = By.xpath("//*[@class='resume-delivery']");

	By BTN_Gear = By.xpath("//*[@class='sprite sprite-gear']");

	By BTN_Back = By.xpath("//*[@class='sprite sprite-back']");

	By BTN_Suspend = By.xpath("//*[@class='pull-left']");

	By BTN_RadioMid = By.xpath("(//*[@class='radio-label'])[1]");

	By BTN_Resume_Delivery = By.xpath("//*[@class='resume-delivery']");

	By BTN_x = By.xpath("//*[@class='icon icon-x-sign']");

	By BTN_Cancel = By.xpath("//*[@class='btn btn-cancel']");

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'Alerts') or contains(@label,'Alertes')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and (contains(@text,'Alerts') or contains(@text,'Alertes'))]")
	private MobileElement LBL_Alerts;
	// *[@class='sprite sprite-gear']

	// *[@class='resume-delivery']

	// *[@class='suspend-message ']

	// *[@class='sprite sprite-refresh']

	// *[@class='lastPrice']

	// By VAL_Price = By.class("lastPrice");

	// *[@class='lastPrice']

	// (MobileElement) ((AppiumDriver)
	// GetDriver().findElement(LBL_CreateSimilarAlert));

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'%') or contains(@name,'%')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'%')]")
	private MobileElement txtPercent;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Mid Price') or contains(@label,'Prix Milieu')]/../XCUIElementTypeStaticText[2]") // need
																																						// to
																																						// be
																																						// fix
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='Percentage' or contains(@resource-id,'Percentage')]")
	private MobileElement editPriceGap;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Please enter a % equal or less than 100') or contains(@name,'Entrez un % �gal ou inf�rieur � 100')]")
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private MobileElement error_textPriceGap;

	String sSymbol = getTestdata("Symbol", XLSheetUserIDs).trim();
	String currentPricePath = null;
	String currentPriceValue = null;
	String pricelessthancurrent = null;
	String pricegreaterthancurrent = null;

	String sSymbolType = getTestdata("SymbolType", XLSheetUserIDs).trim();

	public void tapAlerts() {
		try {
			// System.out.println(CL.GetDriver().getPageSource());
			Decorator();

			Set<String> contextNames = ((AppiumDriver) CL.GetDriver()).getContextHandles();
			for (String contextName : contextNames) {
				System.out.println(contextNames);
			}

			// Thread.sleep(1000);
			// mobileAction.FuncClick(MenuUp, "MenuUp");
			// mobileAction.FuncClick(Home, "Home");
			// System.out.println(CL.GetDriver().getPageSource());
			mobileAction.FuncClick(Alerts, "Alerts");
			// CL.GetDriver().getPageSource();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBackandGearIcon() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.verifyElementIsDisplayed(hdrHome, "Home widget");

			mobileAction.FuncClick(Alerts, "Alerts");

			mobileAction.FuncClick(gearIcon, "gearIcon");
			mobileAction.verifyElementIsDisplayed(txtdelivery, "delivery");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyxCancelbutton() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");

			mobileAction.verifyElementIsDisplayed(hdrSearch, "hdrSearch");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

			{
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");
				enterSymbol((MobileElement) CL.GetDriver().findElement(Edit_Symbol), sSymbol);

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_x), "BTN_x");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Cancel), "BTN_Cancel");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			}

			mobileAction.verifyElementIsDisplayed(btncreateAlert, "createAlert");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifycreateAlertConditionPriceRises() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");
			mobileAction.verifyElementIsDisplayed(hdrSearch, "hdrSearch");

			// SearchPageMIT.get().clickFirstSymbolPNS();

			selectPNSUSSymbol("TD");

			mobileAction.FuncClick(btnRisesAbove, "btnRisesAbove");

			mobileAction.FuncClick(editAmount, "editAmount");

			pricelessthancurrent = GetSmallerPrice();

			TradeMultiLeg.get().FuncEnterText(editAmount, pricelessthancurrent);

			mobileAction.verifyElementIsDisplayed(error_text, "error_text");

			mobileAction.FuncIsElementEnabled(btnCreateAlert, "btnCreateAlert");

			mobileAction.FuncClick(editAmount, "editAmount");

			pricegreaterthancurrent = GetGreaterPrice();
			TradeMultiLeg.get().FuncEnterText(editAmount, pricegreaterthancurrent);

			mobileAction.FuncIsElementEnabled(btnCreateAlert, "btnCreateAlert");

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCreateAlertConditionPricehit52Week() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");
			mobileAction.verifyElementIsDisplayed(hdrSearch, "hdrSearch");

			// SearchPageMIT.get().clickFirstSymbolPNS();

			selectPNSUSSymbol("TD");

			mobileAction.FuncClick(btn52Week, "btn52Week");

			mobileAction.verifyElementIsDisplayed(txtdeliverypreferences, "txtdeliverypreferences");

			mobileAction.FuncIsElementEnabled(btnCreateAlert, "btnCreateAlert");

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQuoteInformation() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");

			String[] total = getTestdata("Symbol", XLSheetUserIDs).split(";");

			for (int i = 0; i < 2; i++) {

				// clickFirstSymbolPNS(getTestdata("Symbol",
				// XLSheetUserIDs).split(";")[i], getTestdata("Symbol",
				// XLSheetUserIDs).split(";")[i+1]);

				selectPNSCanadaSymbol(getTestdata("Symbol", XLSheetUserIDs).split(";")[i]);

				mobileAction.verifyElementIsDisplayed(Quote_Symbol, "Quote_Symbol");
				mobileAction.verifyElementIsDisplayed(txtCompanyName, "txtCompanyName");
				mobileAction.verifyElementIsDisplayed(txtCurrentPrice, "txtCurrentPrice");
				mobileAction.verifyElementIsDisplayed(txtLowPrice, "txtLowPrice");
				mobileAction.verifyElementIsDisplayed(txtHighPrice, "txtHighPrice");
				mobileAction.verifyElementIsDisplayed(txtChangeAmount, "txtChangeAmount");
				mobileAction.verifyElementIsDisplayed(txtChangePercent, "txtChangePercent");
				mobileAction.verifyElementIsDisplayed(txtVolume, "txtVolume");
				mobileAction.verifyElementIsDisplayed(txtAvgVolume, "txtAvgVolume");
				mobileAction.verifyElementIsDisplayed(txtPERatio, "txtPERatio");
				mobileAction.verifyElementIsDisplayed(timestamp, "timestamp");
				mobileAction.FuncClick(backButton, "backButton");
			}

			for (int i = 3; i < total.length; i++)

			{

				selectPNSUSSymbol(getTestdata("Symbol", XLSheetUserIDs).split(";")[i]);

				mobileAction.verifyElementIsDisplayed(Quote_Symbol, "Quote_Symbol");
				mobileAction.verifyElementIsDisplayed(txtCompanyName, "txtCompanyName");
				mobileAction.verifyElementIsDisplayed(txtCurrentPrice, "txtCurrentPrice");
				mobileAction.verifyElementIsDisplayed(txtLowPrice, "txtLowPrice");
				mobileAction.verifyElementIsDisplayed(txtHighPrice, "txtHighPrice");
				mobileAction.verifyElementIsDisplayed(txtChangeAmount, "txtChangeAmount");
				mobileAction.verifyElementIsDisplayed(txtChangePercent, "txtChangePercent");
				mobileAction.verifyElementIsDisplayed(txtVolume, "txtVolume");
				mobileAction.verifyElementIsDisplayed(txtAvgVolume, "txtAvgVolume");
				mobileAction.verifyElementIsDisplayed(txtPERatio, "txtPERatio");
				mobileAction.verifyElementIsDisplayed(timestamp, "timestamp");
				mobileAction.FuncClick(backButton, "backButton");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyPriceChangesOnHeavyVolume() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");
			// clickFirstSymbolPNS(getTestdata("Symbol",
			// XLSheetUserIDs),"CA");tdtddckjdc

			// mobileAction.FuncSwipeWhileElementNotFound(btnHeavyVol, false, 4,
			// "up");

			selectPNSCanadaSymbol("ZQQ");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(btnHeavyVol, "btnHeavyVol");

			mobileAction.FuncSwipeOnce("up");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPush.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is clickable : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not clickable : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			}

			else {

				if (mobileAction.getText(checkBoxPush).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is clickable : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not clickable : <b> " + "</b>");
				}

			}

			mobileAction.FuncSwipeOnce("down");
			mobileAction.FuncSwipeOnce("down");
			mobileAction.FuncSwipeOnce("down");

			String pricelessthancurrent = GetSmallerPrice();

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(editAmount, "editAmount");

			TradeMultiLeg.get().FuncEnterText(editAmount, pricelessthancurrent);

			mobileAction.verifyElementIsDisplayed(error_text, "error_text");

			mobileAction.FuncIsElementNotEnabled(btnCreateAlert, "btnCreateAlert");

			String pricegreaterthancurrent = GetGreaterPrice();

			mobileAction.FuncClick(editAmount, "editAmount");

			TradeMultiLeg.get().FuncEnterText(editAmount, pricegreaterthancurrent);

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncIsElementNotEnabled(btnCreateAlert, "btnCreateAlert");

			mobileAction.FuncSwipeOnce("down");

			mobileAction.selectItemFromList(spinnerPercent, "5");

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerifyPrimaryEmailDeliveryPreferences() {
		try {

			Decorator();
			tapAlert();

			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			selectPNSCanadaSymbol("TDB093");

			mobileAction.FuncClick(btnDropBelow, "btnDropBelow");

			mobileAction.FuncSwipeOnce("down");

			String GreaterPrice = GetGreaterPrice();

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(editAmount, "editAmount");

			TradeMultiLeg.get().FuncEnterText(editAmount, GreaterPrice);

			mobileAction.verifyElementIsDisplayed(error_text, "error_text");

			String SmallerPrice = GetSmallerPrice();

			mobileAction.FuncClick(editAmount, "editAmount");

			TradeMultiLeg.get().FuncEnterText(editAmount, SmallerPrice);

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(checkBoxPush, "checkBoxPush");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPush.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPush).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxPrimaryEmail, "checkBoxPrimaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPrimaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPrimaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxPrimaryEmail, "checkBoxPrimaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPrimaryEmail.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPrimaryEmail).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifySecondaryEmailDeliveryPreferences() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			selectPNSCanadaSymbol("TDB093");

			mobileAction.FuncClick(btnFundRisesAbove, "btnFundRisesAbove");

			mobileAction.FuncSwipeOnce("down");

			String SmallerPrice = GetSmallerPrice();

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(editAmount, "editAmount");

			TradeMultiLeg.get().FuncEnterText(editAmount, SmallerPrice);

			mobileAction.verifyElementIsDisplayed(error_text, "error_text");

			mobileAction.FuncSwipeOnce("down");

			String GreaterPrice = GetGreaterPrice();

			mobileAction.FuncClick(editAmount, "editAmount");

			TradeMultiLeg.get().FuncEnterText(editAmount, GreaterPrice);

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(checkBoxPush, "checkBoxPush");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPush.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			}

			else {

				if (mobileAction.getText(checkBoxPush).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxSecondaryEmail, "checkBoxSecondaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxSecondaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxSecondaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxSecondaryEmail, "checkBoxSecondaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxSecondaryEmail.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxSecondaryEmail).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyEnablingAllDeliveryPreferences() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			selectPNSCanadaSymbol("TDB093");

			mobileAction.FuncClick(btnFundPriceChangeFromPrevious, "btnFundPriceChangeFromPrevious");

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(checkBoxPush, "checkBoxPush");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPush.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			}

			else {

				if (mobileAction.getText(checkBoxPush).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxPrimaryEmail, "checkBoxPrimaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPrimaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPrimaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxPrimaryEmail, "checkBoxPrimaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPrimaryEmail.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPrimaryEmail).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxSecondaryEmail, "checkBoxSecondaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxSecondaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxSecondaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxSecondaryEmail, "checkBoxSecondaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxSecondaryEmail.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxSecondaryEmail).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.selectItemFromList(spinnerPercent, "5");

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyAlertConditionPriceGapAtOpeningTrade() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			selectPNSCanadaSymbol("ZQQ");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(btnETFPriceGap, "btnETFPriceGap");

			mobileAction.selectItemFromList(spinnerPriceGap, "Down");

			// mobileAction.selectItemFromList(spinnerPriceGap, "en baisse");

			mobileAction.verifyElementIsDisplayed(txtPercent, "txtPercent");

			TradeMultiLeg.get().FuncEnterText(editPriceGap, "200");

			mobileAction.FuncSwipeOnce("down");
			mobileAction.FuncSwipeOnce("down");

			mobileAction.verifyElementIsDisplayed(error_textPriceGap, "error_textPriceGap");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			TradeMultiLeg.get().FuncEnterText(editPriceGap, "100");

			mobileAction.verifyElementIsDisplayed(error_textPriceGap, "error_textPriceGap");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(checkBoxPush, "checkBoxPush");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPush.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			}

			else {

				if (mobileAction.getText(checkBoxPush).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxPrimaryEmail, "checkBoxPrimaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPrimaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPrimaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxSecondaryEmail, "checkBoxSecondaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxSecondaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxSecondaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyCreateSimilarAlertConditionPriceRisesFasterThanIndex() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			selectPNSCanadaSymbol("ZQQ");

			// mobileAction.FuncSwipeWhileElementNotFound(btnETFPriceRisesfaster,
			// false, 5, "up");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(btnETFPriceRisesfaster, "btnETFPriceRisesfaster");

			mobileAction.FuncClick(spinnerChangePercent, "spinnerChangePercent");

			String[] ipercent = getTestdata("ETFChangePercent", XLSheetUserIDs).split(";");
			// String xpatPercent = "";
			for (int i = 0; i < ipercent.length; i++)

			{
				String xpathPercent = "//*[contains(@text,'" + ipercent[i] + "')]";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathPercent, false, 5, "up");
				mobileAction.verifyItemInList(ipercent[i]);

			}
			int iLen = ipercent.length;
			String xpathPercent = "//*[contains(@text,'" + ipercent[iLen - 1] + "')]";
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathPercent, true, 5, "up");
			// Thread.sleep(1000);

			mobileAction.FuncClick(spinnerETFIndex, "spinnerETFIndex");

			String[] index = getTestdata("ETFIndex", XLSheetUserIDs).split(";");

			for (int i = 0; i < index.length; i++)

			{
				String xpathIndex = "//*[contains(@text,'" + index[i] + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathIndex, false, 5, "up");
				mobileAction.verifyItemInList(index[i]);

			}
			int iLen1 = index.length;
			String xpathIndex = "//*[contains(@text,'" + index[iLen1 - 1] + "')]";
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathIndex, true, 5, "up");
			// Thread.sleep(1000);

			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(spinnerTimePeriod, "spinnerTimePeriod");

			String[] period = getTestdata("ETFPeriod", XLSheetUserIDs).split(";");

			for (int i = 0; i < period.length; i++)

			{
				String xpathperiod = "//*[contains(@text,'" + period[i] + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathperiod, false, 5, "up");
				mobileAction.verifyItemInList(period[i]);

			}
			int iLen2 = period.length;
			String xpathperiod = "//*[contains(@text,'" + period[iLen2 - 1] + "')]";
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathperiod, true, 5, "up");

			// mobileAction.FuncSwipeWhileElementNotFound(btnCreateAlert, false,
			// 5, "up");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(checkBoxPush, "checkBoxPush");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPush.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			}

			else {

				if (mobileAction.getText(checkBoxPush).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxPrimaryEmail, "checkBoxPrimaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPrimaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPrimaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxSecondaryEmail, "checkBoxSecondaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxSecondaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxSecondaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");

			((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																		// context
																		// to
																		// WebView
																		// to
																		// get
																		// the
																		// HTML
																		// DOM

			mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(LBL_CreateSimilarAlert), "dfd");

			// PerformAction.FuncClick(LBL_CreateSimilarAlert);

			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP"); // remember
																	// to switch
																	// back when
																	// done
																	// (back to
																	// inspecting
																	// native
																	// android
																	// components)

			mobileAction.verifyElementIsDisplayed(txtdeliverypreferences, "txtdeliverypreferences");

			mobileAction.FuncClick(backButton, "backButton");

			mobileAction.verifyElementIsDisplayed(search_symbolPNS, "search_symbolPNS");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyDoneConditionPriceChangesFromPreviousClose() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			selectPNSCanadaSymbol("ZQQ");

			// mobileAction.FuncSwipeWhileElementNotFound(btnETFPriceChangesfrom,
			// false, 5, "up");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(btnETFPriceChangesfrom, "btnETFPriceRisesfaster");

			mobileAction.FuncClick(spinnerChangePercent, "spinnerChangePercent");

			String[] ipercent = getTestdata("ETFChangePercent", XLSheetUserIDs).split(";");
			// String xpatPercent = "";
			for (int i = 0; i < ipercent.length; i++)

			{
				String xpathPercent = "//*[contains(@text,'" + ipercent[i] + "')]";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathPercent, false, 5, "up");
				mobileAction.verifyItemInList(ipercent[i]);

			}
			int iLen = ipercent.length;
			String xpathPercent = "//*[contains(@text,'" + ipercent[iLen - 1] + "')]";
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathPercent, true, 5, "up");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(checkBoxPush, "checkBoxPush");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPush.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			}

			else {

				if (mobileAction.getText(checkBoxPush).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxSecondaryEmail, "checkBoxSecondaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxSecondaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxSecondaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");

			// ((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");
			// //switch context to WebView to get the HTML DOM

			// mobileAction.FuncClick((MobileElement)
			// CL.GetDriver().findElement(LBL_CreateSimilarAlert),"dfd");

			// PerformAction.FuncClick(LBL_CreateSimilarAlert);

			// ((AppiumDriver) CL.GetDriver()).context("NATIVE_APP"); //remember
			// to switch back when done (back to inspecting native android
			// components)

			mobileAction.FuncClick(btnDone, "btnDone");

			mobileAction.verifyElementIsDisplayed(btncreateAlert, "btncreateAlert");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyErrorConditionPriceDropsBelowStocks() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");

			selectPNSCanadaSymbol("TD");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			// mobileAction.FuncClick(btnStockDropBelow,"btnStockDropBelow");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(btnStockPriceDropsBelow),
						"btnStockPriceDropsBelow");

				// mobileAction.verifyElement((MobileElement)
				// CL.GetDriver().findElement(ERR_SecondaryEmail),getTestdata("TextDefaultListItem",XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				mobileAction.FuncClick(btnStockDropBelow, "btnStockPriceDropsBelow");

			}

			/*
			 * Set<String> contextNames = ((AppiumDriver)
			 * CL.GetDriver()).getContextHandles(); for (String contextName :
			 * contextNames) { System.out.println(contextNames); }
			 */

			mobileAction.FuncSwipeOnce("down");

			String GreaterPrice = GetGreaterPrice();

			mobileAction.FuncSwipeOnce("up");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(editAmountWeb), "editAmountWeb");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");
			}

			else {

				mobileAction.FuncClick(editAmount, "editAmount");

			}

			((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

			TradeMultiLeg.get().FuncEnterText((MobileElement) CL.GetDriver().findElement(editAmountWeb), GreaterPrice);

			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			// TradeMultiLeg.get().FuncEnterText(editAmount, GreaterPrice);

			mobileAction.verifyElementIsDisplayed(error_text, "error_text");

			String SmallerPrice = GetSmallerPrice();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(editAmountWeb), "editAmountWeb");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {
				mobileAction.FuncClick(editAmount, "editAmount");
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

				TradeMultiLeg.get().FuncEnterText((MobileElement) CL.GetDriver().findElement(editAmountWeb),
						SmallerPrice);

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			}

			else {

				TradeMultiLeg.get().FuncEnterText(editAmount, SmallerPrice);
			}
			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(checkBoxPush, "checkBoxPush");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPush.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPush).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxPrimaryEmail, "checkBoxPrimaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPrimaryEmail.getAttribute("checked").equalsIgnoreCase("true"))

						CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPrimaryEmail).equalsIgnoreCase("true"))

					CL.GetReporting().FuncReport("Pass", "The Element is Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is not Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxPrimaryEmail, "checkBoxPrimaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPrimaryEmail.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			} else {

				if (mobileAction.getText(checkBoxPrimaryEmail).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(checkBoxSecondaryEmail, "checkBoxSecondaryEmail");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.verifyElement((MobileElement) CL.GetDriver().findElement(ERR_SecondaryEmail),
						getTestdata("WarningMessage", XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				mobileAction.verifyElement(error_textGreater, getTestdata("WarningMessage", XLSheetUserIDs));

			}

			// Thread.sleep(1000);

			mobileAction.FuncSwipeWhileElementNotFound(checkBoxSecondaryEmail, false, 5, "up");

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void CreateAlertConditionPriceChangesFromPrevious() {
		try {

			Decorator();
			tapAlert();
			Thread.sleep(1000);

			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			// mobileAction.FuncClick(btnStockDropBelow,"btnStockDropBelow");

			selectPNSCanadaSymbol("TD");

			// mobileAction.FuncSwipeWhileElementNotFound(btnStockPriceChangesfrom,
			// false, 5, "up");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(btnStockPriceChangesfrom, "btnEStockPriceChangesfrom");

			mobileAction.FuncClick(spinnerChangePercent, "spinnerChangePercent");

			String[] ipercent = getTestdata("ETFChangePercent", XLSheetUserIDs).split(";");
			// String xpatPercent = "";
			for (int i = 0; i < ipercent.length; i++)

			{
				String xpathPercent = "//*[contains(@text,'" + ipercent[i] + "')]";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathPercent, false, 5, "up");
				mobileAction.verifyItemInList(ipercent[i]);

			}
			int iLen = ipercent.length;
			String xpathPercent = "//*[contains(@text,'" + ipercent[iLen - 1] + "')]";
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathPercent, true, 5, "up");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.FuncClick(checkBoxPush, "checkBoxPush");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					if (checkBoxPush.getAttribute("checked").equalsIgnoreCase("false"))

						CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

					else {
						CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
					}
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}

			}

			else {

				if (mobileAction.getText(checkBoxPush).equalsIgnoreCase("false"))

					CL.GetReporting().FuncReport("Pass", "The Element is not Enabled : <b> " + "</b>");

				else {
					CL.GetReporting().FuncReport("Fail", "The Element is Enabled : <b> " + "</b>");
				}

			}

			mobileAction.FuncClick(btnCreateAlert, "btnCreateAlert");

			mobileAction.verifyElementIsDisplayed(txt_AlertCreatedfor, "txt_AlertCreatedfor");
			mobileAction.verifyElementIsDisplayed(txt_CreateSimilar, "txt_CreateSimilar");
			mobileAction.verifyElementIsDisplayed(txt_Alertsamesymbol, "txt_Alertsamesymbol");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");

			mobileAction.FuncClick(btnDone, "btnDone");

			mobileAction.verifyElementIsDisplayed(btncreateAlert, "btncreateAlert");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyBackButtonOnCreateNewAlertpage() {
		try {

			Decorator();
			tapAlert();
			Thread.sleep(1000);

			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			// mobileAction.FuncClick(btnStockDropBelow,"btnStockDropBelow");

			selectPNSCanadaSymbol("TD");

			mobileAction.FuncSwipeWhileElementNotFound(btnStockPriceChangesfrom, false, 5, "up");
			mobileAction.FuncClick(btnStockPriceChangesfrom, "btnStockPriceChangesfrom");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(Text_Condition),
						"Text_Condition");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Back), "BTN_Back");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				// Need ios object

			}

			// mobileAction.FuncClick(backButton,"backButton");

			mobileAction.verifyElementIsDisplayed(hdrSearch, "hdrSearch");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyChangeConditionCreateNewAlertPage() {
		try {

			Decorator();
			tapAlert();
			Thread.sleep(1000);

			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"CA");

			selectPNSCanadaSymbol("TD");

			Set<String> contextNames = ((AppiumDriver) CL.GetDriver()).getContextHandles();
			for (String contextName : contextNames) {
				System.out.println(contextNames);
			}

			mobileAction.FuncSwipeWhileElementNotFound(btnStockPriceChangesfrom, false, 5, "up");
			mobileAction.FuncClick(btnStockPriceChangesfrom, "btnStockPriceChangesfrom");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(Text_Condition),
						"Text_Condition");

				// mobileAction.verifyElement((MobileElement)
				// CL.GetDriver().findElement(ERR_SecondaryEmail),getTestdata("TextDefaultListItem",XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				// Need ios object

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(Link_ChangeCondition),
						"Link_ChangeCondition");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(Link_ChangeCondition),
						"Link_ChangeCondition");

				// mobileAction.verifyElement((MobileElement)
				// CL.GetDriver().findElement(ERR_SecondaryEmail),getTestdata("TextDefaultListItem",XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			}

			else {

				// Need ios object

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(btnStockPriceDropsBelow),
						"btnStockPriceDropsBelow");

				// mobileAction.verifyElement((MobileElement)
				// CL.GetDriver().findElement(ERR_SecondaryEmail),getTestdata("TextDefaultListItem",XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				mobileAction.FuncClick(btnStockDropBelow, "btnStockPriceDropsBelow");

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(Text_Condition),
						"Text_Condition");

				// mobileAction.verifyElement((MobileElement)
				// CL.GetDriver().findElement(ERR_SecondaryEmail),getTestdata("TextDefaultListItem",XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				// Need ios object

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyRefreshButtonOnCreateNewAlertPage() {
		try {

			Decorator();
			tapAlert();
			mobileAction.FuncClick(btncreateAlert, "createAlert");

			// clickFirstSymbolPNS(getTestdata("Symbol", XLSheetUserIDs),"ca");

			selectPNSCanadaSymbol("TD");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(btnStockPriceDropsBelow),
						"btnStockPriceDropsBelow");

				// mobileAction.verifyElement((MobileElement)
				// CL.GetDriver().findElement(ERR_SecondaryEmail),getTestdata("TextDefaultListItem",XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				mobileAction.FuncClick(btnStockDropBelow, "btnStockPriceDropsBelow");

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(Text_Condition),
						"Text_Condition");

				// mobileAction.verifyElement((MobileElement)
				// CL.GetDriver().findElement(ERR_SecondaryEmail),getTestdata("TextDefaultListItem",XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				// Need ios object

			}

			String SmallerPrice = GetSmallerPrice();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(editAmountWeb), "editAmountWeb");

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {
				mobileAction.FuncClick(editAmount, "editAmount");
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

				TradeMultiLeg.get().FuncEnterText((MobileElement) CL.GetDriver().findElement(editAmountWeb),
						SmallerPrice);

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			}

			else {

				TradeMultiLeg.get().FuncEnterText(editAmount, SmallerPrice);
			}
			mobileAction.FuncSwipeOnce("down");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Refresh), "BTN_Refresh");

				// mobileAction.verifyElement((MobileElement)
				// CL.GetDriver().findElement(ERR_SecondaryEmail),getTestdata("TextDefaultListItem",XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				// Need ios object

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(Text_Condition),
						"Text_Condition");

				// mobileAction.verifyElement((MobileElement)
				// CL.GetDriver().findElement(ERR_SecondaryEmail),getTestdata("TextDefaultListItem",XLSheetUserIDs));

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				// Need ios object

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFuncFlow() {
		try {
			// System.out.println(CL.GetDriver().getPageSource());
			Decorator();

			mobileAction.FuncClick(gearIcon, "gearIcon");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_EditPush), "BTN_EditPush");

				// ((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_EditPush), "BTN_EditPush");

			} else {

			}

			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.verifyElementIsDisplayed(hdrHome, "Home widget");

			mobileAction.FuncClick(Alerts, "Alerts");

			mobileAction.verifyElementIsDisplayed(txtdelivery, "delivery");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyClientNavigateInvestingAlertsNotifcationOFF() {
		try {

			Decorator();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Gear), "BTN_Gear");

			} else {
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_EditPush), "BTN_EditPush");

			} else {

			}

			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			mobileAction.FuncClick(togglePush, "togglePush");

			mobileAction.FuncClick(backButton2, "backButton2");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Back), "BTN_Back");
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Gear), "BTN_Gear");

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(TXT_Warningmsg),
						"TXt_Warningmsg");

			} else {

			}

			mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(LINK_Settings), "LINK_Settings");

			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			mobileAction.FuncSwipeOnce("up");

			mobileAction.verifyElementIsDisplayed(txtFooterWarning, "txtFooterWarning");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public void VerifyClientNavigateInvestingPNSAndAlertsNotifcationOFF() {
	 * try{
	 * 
	 * Decorator();
	 * 
	 * if
	 * (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
	 * ) { ((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); //switch
	 * context to WebView to get the HTML DOM
	 * 
	 * mobileAction.FuncClick((MobileElement)
	 * CL.GetDriver().findElement(BTN_Gear), "BTN_Gear");
	 * 
	 * } else { }
	 * 
	 * 
	 * 
	 * if
	 * (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
	 * ) { ((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); //switch
	 * context to WebView to get the HTML DOM
	 * 
	 * mobileAction.FuncClick((MobileElement)
	 * CL.GetDriver().findElement(BTN_EditPush), "BTN_EditPush");
	 * 
	 * 
	 * } else {
	 * 
	 * }
	 * 
	 * 
	 * ((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");
	 * 
	 * mobileAction.FuncClick(togglePush,"togglePush");
	 * 
	 * mobileAction.FuncClick(backButton2,"backButton2");
	 * 
	 * 
	 * if
	 * (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
	 * ) { ((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); //switch
	 * context to WebView to get the HTML DOM
	 * 
	 * mobileAction.FuncClick((MobileElement)
	 * CL.GetDriver().findElement(BTN_Back), "BTN_Back");
	 * mobileAction.FuncClick((MobileElement)
	 * CL.GetDriver().findElement(BTN_Gear), "BTN_Gear");
	 * 
	 * 
	 * mobileAction.verifyElementIsDisplayed((MobileElement)
	 * CL.GetDriver().findElement(TXT_Warningmsg), "TXt_Warningmsg");
	 * 
	 * 
	 * } else {
	 * 
	 * }
	 * 
	 * mobileAction.FuncClick((MobileElement)
	 * CL.GetDriver().findElement(LINK_Settings), "LINK_Settings");
	 * 
	 * 
	 * ((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");
	 * 
	 * 
	 * mobileAction.FuncSwipeOnce("up");
	 * 
	 * 
	 * mobileAction.verifyElementIsDisplayed(txtFooterWarning,
	 * "txtFooterWarning");
	 * 
	 * 
	 * } catch(Exception e) { e.printStackTrace(); } }
	 */

	public void VerifyClientNavigateInvestingPNSAndAlertsNotifcationON() {
		try {

			Decorator();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Gear), "BTN_Gear");

			} else {
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_EditPush), "BTN_EditPush");

			} else {

			}

			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			if (togglePush.getAttribute("checked").equalsIgnoreCase("false")) {
				mobileAction.FuncClick(togglePush, "togglePush");
			}
			mobileAction.FuncClick(backButton2, "backButton2");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Back), "BTN_Back");
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Gear), "BTN_Gear");

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(TXT_Warningmsg),
						"TXt_Warningmsg");

			} else {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerifyClientNavigateInvestingAlertsNotifcationSuspended() {
		try {

			Decorator();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Suspend), "BTN_Suspend");

			} else {
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_RadioMid), "BTN_RadioMid");

				mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(TXT_Warningmsg),
						"TXt_Warningmsg");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Back), "BTN_Back");

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(BTN_Resume_Delivery),
						"BTN_Resume_Delivery");

			} else {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectPNSCanadaSymbol(String sSymbol) {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(Edit_Symbol), "Edit_Symbol");

				// ((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {
				// Need ios object

			}
			// mobileAction.FuncClick(search_symbolPNS, "search_symbolPNS");
			enterSymbol((MobileElement) CL.GetDriver().findElement(Edit_Symbol), sSymbol);

			Thread.sleep(3000);
			for (WebElement symbol : CL.GetDriver().findElements(LBL_Symbol_CA)) {
				if (symbol.getText().equalsIgnoreCase(sSymbol)) {
					Thread.sleep(1000);
					mobileAction.FuncClick((MobileElement) symbol, "Canada Symbol " + sSymbol);
					break;
				}
			}
			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectPNSUSSymbol(String sSymbol) {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(Edit_Symbol), "Edit_Symbol");

				// ((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {
				// Need ios object

			}
			// mobileAction.FuncClick(search_symbolPNS, "search_symbolPNS");
			enterSymbol((MobileElement) CL.GetDriver().findElement(Edit_Symbol), sSymbol);
			Thread.sleep(3000);
			for (WebElement symbol : CL.GetDriver().findElements(LBL_Symbol_US)) {
				if (symbol.getText().equalsIgnoreCase(sSymbol)) {
					Thread.sleep(1000);
					mobileAction.FuncClick((MobileElement) symbol, "US Symbol " + sSymbol);
					break;
				}
			}
			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickFirstSymbolPNS(String sSymbolName, String sSymbolType)// @Author
																			// -
																			// Sushil
																			// 08-Feb-2017
	{
		Decorator();
		try {
			String xpathFlag = "";
			String xpathFlag1 = "";
			int temp = 0;
			// String sSymbol = getTestdata("Symbol", XLSheetUserIDs).trim();
			boolean bFound = false;
			String sProperty = "";
			// String sSymbolName = "";
			boolean bSymbolText = false;
			String xpathSymbolFlag_ios = "";
			String xpathSymbolFlag = "";

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																			// context
																			// to
																			// WebView
																			// to
																			// get
																			// the
																			// HTML
																			// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(Edit_Symbol), "Edit_Symbol");

				// ((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			} else {

				// Need ios object

			}

			// mobileAction.FuncClick(search_symbolPNS, "search_symbolPNS");

			enterSymbol((MobileElement) CL.GetDriver().findElement(Edit_Symbol), sSymbolName);
			// Thread.sleep(1000);
			// ((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

			if (sSymbolType.equalsIgnoreCase("CAN") || sSymbolType.equalsIgnoreCase("CA")) {

				// xpathSymbolFlag =
				// "//android.view.View[contains(@content-desc,'RESULTS')/../*/*[2]/*/*/*[1]
				// and @content-desc='CA flag icon']";
				// xpathSymbolFlag =
				// "//android.view.View[@resource-id='com.td:id/market_symbol'
				// and @content-desc='C A']";
				xpathSymbolFlag = "(//*[@class='sprite flag flag-ca'])[1]";

				// xpathSymbolFlag =
				// "//android.widget.ImageView[@resource-id='com.td:id/market_symbol'
				// and @content-desc='C A']";
				// String xpathSymbolFlag_ios =
				// "//XCUIElementTypeCell[contains(@label,'CAN') or
				// contains(@label,'CAD') or contains(@label,'CA')]";
				// xpathSymbolFlag_ios =
				// "//XCUIElementStaticText[contains(@label,'CAN') or
				// contains(@label,'CAD') or contains(@label,'CA'))]";
				xpathSymbolFlag_ios = "//XCUIElementStaticText[contains(@label,'CAN') or contains(@label,'CAD') or contains(@label,'CA')]";
				// xpathSymbolFlag_ios =
				// "//XCUIElementStaticText[contains(@label,'CA')]";
			} else {
				xpathSymbolFlag = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and @content-desc='U S']";
				xpathSymbolFlag_ios = "//XCUIElementTypeCell[contains(@label,'US')]";
			}

			// Thread.sleep(1000);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				xpathFlag = xpathSymbolFlag;
				xpathFlag1 = "(//*[@class='symbol']/*[1])[1]";
				sProperty = "text";
				// sSymbolName =
				// CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']")).get(i).getText();

				do {

					try {
						// CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
						// if(CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).isDisplayed()
						// &&
						// CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).getAttribute(sProperty).equalsIgnoreCase(sSymbolName))

						if (CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).isDisplayed()
								&& CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).getAttribute(sProperty)
										.contains(sSymbolType)
								&& CL.GetDriver().findElements(By.xpath(xpathFlag1)).get(temp).getAttribute(sProperty)
										.contains(sSymbolName))

						{
							bFound = true;
							CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
							CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
						} else
							temp++;
					} catch (Exception e) {
						e.printStackTrace();
						CL.GetReporting().FuncReport("Fail", "Symbol <b> " + sSymbol + "</b> not Clicked.");
						temp++;
					}
				} while (!bFound && temp < CL.GetDriver().findElements(By.xpath(xpathFlag)).size());
			}

			else {
				xpathFlag = xpathSymbolFlag_ios;
				// temp =0;
				sProperty = "label";
				do {
					try {
						/*
						 * try{ bSymbolText =
						 * CL.GetDriver().findElements(By.xpath(
						 * "//*[@resource-id='com.td:id/market_name']")).get(
						 * temp).getText().contains(sSymbol); } catch(ex)
						 */
						if (CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).isDisplayed()
								&& CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).getAttribute(sProperty)
										.equalsIgnoreCase(sSymbolName)) {
							bFound = true;
							CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
							CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
						} else
							temp++;
					} catch (Exception e) {
						/*
						 * if(CL.GetDriver().findElements(By.xpath(xpathFlag)).
						 * get(1).isDisplayed()) {
						 * CL.GetDriver().findElements(By.xpath(xpathFlag)).get(
						 * 1).click(); CL.GetReporting().FuncReport("Pass",
						 * "Symbol <b> "+ sSymbol + "</b> Clicked."); }
						 */
						temp++;
					}
				} while (!bFound && temp < CL.GetDriver().findElements(By.xpath(xpathFlag)).size());
			}
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterSymbol(MobileElement mEle, String symbol) {
		try {
			mobileAction.FuncSendKeys(mEle, symbol + " ");
			((RemoteWebDriver) CL.GetDriver()).getKeyboard().pressKey(Keys.BACK_SPACE);

			// mobileAction.FuncSendKeys(mEle,"\u0008");
			// mEle.sendKeys(Keys.DELETE);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String GetGreaterPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			// currentPricePath = "//*[@text='" + searchKeyword + "']/../*[1]";
			// currentPricePath="//XCUIElementTypeCell[contains(@label,'CA')]/XCUIElementTypeStaticText[2]";
			currentPricePath = "//XCUIElementTypeStaticText[contains(@label,'name or symbol') or contains(@label,'autre nom ou symbole')]/../following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]";// @Author
																																																						// -
																																																						// Shahbaaz
																																																						// 17-Apr-2017
			System.out.println("CurrentPricePath  " + currentPricePath);
		} else {
			// currentPricePath =
			// "//android.widget.TextView[@resource-id='com.td:id/txt_price']";
			// currentPricePath = "//android.view.View[@content-desc='Last Price
			// --']";
			// currentPricePath =
			// "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*/*/*[4]/*[3]/*[1]";
		}

		// MobileElement pricePath = (MobileElement) ((AppiumDriver)
		// CL.GetDriver()).findElement(VAL_Price);
		// System.out.println(pricePath.getText());

		// currentPriceValue = pricePath.getText();

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																		// context
																		// to
																		// WebView
																		// to
																		// get
																		// the
																		// HTML
																		// DOM

			currentPriceValue = CL.GetDriver().findElement(VAL_Price).getText();

			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

		}

		else

		{

			currentPriceValue = currentPricePath;

		}

		Double PriceValue = Double.parseDouble(mobileAction.FuncGetValByRegx(currentPriceValue, "([0-9]+)"));

		// Double PriceValue = dollarStringToDouble(currentPriceValue);

		Double pricelessthancurrent = PriceValue - 1.0;

		Double pricegreaterthancurrent = PriceValue + 1;

		String pricegreaterthancurrent1 = String.valueOf(pricegreaterthancurrent);

		/*
		 * Double marketPrice = dollarStringToDouble(pricePath); Double
		 * triggerPrice = marketPrice - 0.5;
		 */

		// CL.getTestDataInstance().TCParameters.put("CurrentPrice",
		// pricePath.getText());

		return pricegreaterthancurrent1;

	}

	public String GetSmallerPrice() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			// currentPricePath = "//*[@text='" + searchKeyword + "']/../*[1]";
			// currentPricePath="//XCUIElementTypeCell[contains(@label,'CA')]/XCUIElementTypeStaticText[2]";
			currentPricePath = "//XCUIElementTypeStaticText[contains(@label,'name or symbol') or contains(@label,'autre nom ou symbole')]/../following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]";// @Author
																																																						// -
																																																						// Shahbaaz
																																																						// 17-Apr-2017
			System.out.println("CurrentPricePath  " + currentPricePath);
		} else {
			// currentPricePath =
			// "//android.widget.TextView[@resource-id='com.td:id/txt_price']";
			// currentPricePath = "//android.view.View[@content-desc='Last Price
			// --']";
			// currentPricePath =
			// "//android.view.View[contains(@content-desc,'EDT')]/../*[3]/*/*/*[4]/*[3]/*[1]";

		}

		// MobileElement pricePath = (MobileElement) ((AppiumDriver)
		// CL.GetDriver()).findElement(By.xpath(currentPricePath));
		// System.out.println(pricePath.getText());

		// currentPriceValue = pricePath.getText();
		// currentPriceValue = pricePath.getAttribute("name");

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); // switch
																		// context
																		// to
																		// WebView
																		// to
																		// get
																		// the
																		// HTML
																		// DOM

			currentPriceValue = CL.GetDriver().findElement(VAL_Price).getText();

			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

		}

		else

		{

			currentPriceValue = currentPricePath;

		}

		Double PriceValue = Double.parseDouble(mobileAction.FuncGetValByRegx(currentPriceValue, "([0-9]+)"));

		// Double PriceValue = dollarStringToDouble(currentPriceValue);

		Double pricelessthancurrent = PriceValue - 1.0;

		Double pricegreaterthancurrent = PriceValue + 1;

		String pricelessthancurrent1 = String.valueOf(pricelessthancurrent);

		/*
		 * Double marketPrice = dollarStringToDouble(pricePath); Double
		 * triggerPrice = marketPrice - 0.5;
		 */

		// CL.getTestDataInstance().TCParameters.put("CurrentPrice",
		// pricePath.getText());

		return pricelessthancurrent1;

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

	public void tapAlert() {
		Decorator();
		try {
			mobileAction.FuncClick(backButtons6, "backButton");
			mobileAction.FuncClick(LBL_Alerts, "Alerts");

			Thread.sleep(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
