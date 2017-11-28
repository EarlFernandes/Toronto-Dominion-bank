package com.td.test.CDNMobile.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TradeMultiLeg extends _CommonPage {
	private static TradeMultiLeg TradeMultiLeg;

	public synchronized static TradeMultiLeg get() {
		if (TradeMultiLeg == null) {
			TradeMultiLeg = new TradeMultiLeg();
		}
		return TradeMultiLeg;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[@label='Enter name or symbol' or contains(@label,'Entrez le')]") // @Author
																														// -
																														// Sushil
																														// 16-Feb-2017
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;

	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell/*") // @Author
																															// -
																															// Sushil
																															// 16-Feb-2017
	@AndroidFindBy(id = "com.td:id/ticker")
	private MobileElement stockSymbol;

	// @iOSFindBy(xpath = "//*[contains(@label,'1st') or
	// contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell/*")
	// //@Author - Sushil 16-Feb-2017
	@iOSFindBy(xpath = "//*[@name='MULTILEG_CELL_2']/*[1]")

	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/multi_leg1_ticker']/android.widget.TextView")

	private MobileElement leg1Option;

	// @iOSFindBy(xpath = "//*[contains(@label,'1st') or
	// contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[2]/*[2]")
	// //@Author - Sushil 17-Feb-2017
	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_2']/*[2]")
	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*[@resource-id='com.td:id/edtSpinner']/*/*[2]")
	private MobileElement leg1Action;

	// @iOSFindBy(xpath = "//*[contains(@label,'2nd') or
	// contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[2]/*[2]")
	// //@Author - Sushil 17-Feb-2017
	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_3']/*[2]")
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*[@resource-id='com.td:id/edtSpinner']/*/*[2]")
	private MobileElement leg2Action;

	// @iOSFindBy(xpath = "//*[contains(@label,'1st') or

	// contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[2]/*[2]")
	// //@Author - Sushil 17-Feb-2017
	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[contains(@text,'Action') or contains(@text,'Action')]")
	private MobileElement action;

	// @iOSFindBy(xpath = "//*[contains(@label,'1st') or

	// contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[3]/*[2]")
	// //@Author - Sushil 17-Feb-2017
	@iOSFindBy(xpath = "//*[@name='ACTION_QTY_CELL_2']/*[2]")
	// @AndroidFindBy(xpath =
	// "//*[contains(@resource-id,'com.td:id/amountEditText')]")
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::*/*[@resource-id='com.td:id/amountField']/*/*/*/*[@resource-id='com.td:id/amountEditText']")
	// //Tablet 5.x

	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*[@resource-id='com.td:id/amountField']/*/*[2]/*[1]") // Tablet
																																								// 5.x
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::*/*[@resource-id='com.td:id/amountField']/*/*[@resource-id='com.td:id/amountEditText']")//@Author
	// - Sushil 10-May-2017
	/// @AndroidFindBy(xpath =
	// "//*[@resource-id='com.td:id/multi_leg1_quantity']/*/*/*[2]") //Phone
	// @AndroidFindBy(xpath =
	// "//*[@resource-id='com.td:id/amountEditText']/ancestor::*[@resource-id='com.td:id/multi_leg1_quantity']")
	// //Phone
	// @AndroidFindBy(xpath =
	// "//*[@resource-id='com.td:id/amountEditText']/ancestor::*[contains(@text,'1st')
	// or contains(@text,'1re')]") //Phone

	private MobileElement leg1Quantity;

	// @iOSFindBy(xpath = "//*[contains(@label,'2nd') or
	// contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[3]/*[2]")
	// //@Author - Sushil 17-Feb-2017
	@iOSFindBy(xpath = "//*[@name='ACTION_QTY_CELL_3']/*[2]")
	// @AndroidFindBy(xpath =
	// "(//*[contains(@resource-id,'com.td:id/amountEditText')])[2]")
	// @AndroidFindBy(xpath = "//*[contains(@text,'2nd') or
	// contains(@text,'2e')]/../following-sibling::*/*[@resource-id='com.td:id/amountField']/*/*/*/*[@resource-id='com.td:id/amountEditText']")
	// //Tablet 5.x

	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*[@resource-id='com.td:id/amountField']/*/*[2]/*[1]") // Tablet
																																								// 5.x
	// @AndroidFindBy(xpath = "//*[contains(@text,'2nd') or
	// contains(@text,'2e')]/../following-sibling::*/*[@resource-id='com.td:id/amountField']/*/*[@resource-id='com.td:id/amountEditText']")//@Author
	// - Sushil 10-May-2017
	/// @AndroidFindBy(xpath =
	// "//*[@resource-id='com.td:id/multi_leg2_quantity']/*/*/*[2]") //Phone

	private MobileElement leg2Quantity;

	// @iOSFindBy(xpath = "//*[contains(@label,'2nd') or
	// contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell/*")
	// //@Author - Sushil 17-Feb-2017
	@iOSFindBy(xpath = "//*[@name='MULTILEG_CELL_3']/*[1]")
	// @AndroidFindBy(xpath = "//*[contains(@text,'2nd') or
	// contains(@text,'2e')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/multi_leg2_ticker']/android.widget.TextView")
	private MobileElement leg2Option;

	@iOSFindBy(xpath = "//*[@label='RESULTS' or @label='RÉSULTATS']") // @Author
																		// -
																		// Sushil
																		// 17-Feb-2017
	@AndroidFindBy(id = "android:id/content")
	private MobileElement tradeFrame;

	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'CALLS Bid') or contains(@label,'ACHAT Acheteur')])[1]") // @Author
																															// -
																															// Sushil
																															// 17-Feb-2017
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=2]")
	private MobileElement firstStrikeCALLS;

	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'PUTS Bid') or contains(@label,'VENTE Acheteur')])[4]") // @Author
																														// -
																														// Sushil
																														// 17-Feb-2017
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=17]")
	private MobileElement firstStrikePUTS;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Expires in') or contains(@label,'Expire dans')]") // @Author
																														// -
																														// Sushil
																														// 17-Feb-2017
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/selectedText' and @index=0]")
	private MobileElement expiryDate;

	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'CALLS Bid') or contains(@label,'ACHAT Acheteur')])[1]") // @Author
																															// -
																															// Sushil
																															// 17-Feb-2017
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=0]")
	private MobileElement firstBidCALLS;

	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'PUTS Bid') or contains(@label,'VENTE Acheteur')])[4]") // @Author
																														// -
																														// Sushil
																														// 17-Feb-2017

	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=3]")

	private MobileElement firstBidPUTS;

	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'CALLS Ask') or contains(@label,'ACHAT Vendeur')])[1]") // @Author
																														// -
																														// Sushil
																														// 17-Feb-2017
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=1]")
	private MobileElement firstAskCALLS;

	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'PUTS Ask') or contains(@label,'VENTE Vendeur')])[4]") // @Author
																														// -
																														// Sushil
																														// 17-Feb-2017

	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=4]")

	private MobileElement firstAskPUTS;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue')]") // @Author
																				// -
																				// Sushil
																				// 17-Feb-2017
	@AndroidFindBy(id = "com.td:id/button_select_option_continue")
	private MobileElement Continue;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]") // @Author
																				// -
																				// Sushil
																				// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/symbol")
	private MobileElement Quote_Symbol;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Mid Price') or contains(@label,'Prix Milieu')]/../XCUIElementTypeStaticText[2]") // @Author
																																						// -
																																						// Sushil
																																						// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/midPrice")
	private MobileElement midPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Natural') or contains(@label,'Naturel')]/../XCUIElementTypeStaticText[4]") // @Author
																																				// -
																																				// Sushil
																																				// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/naturalPrice")
	private MobileElement naturalPrice;

	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']") // @Author -
																	// Sushil
																	// 08-Feb-2017
	@AndroidFindBy(id = "android:id/button2")
	private MobileElement cancelButton;

	@iOSFindBy(xpath = "//*[@label='Do not agree' or contains(@label,'accepte pas')]") // @Author
																						// -
																						// Sushil
																						// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/negativeButton")
	private MobileElement doNotAgreeButton;

	@iOSFindBy(xpath = "//*[@label='Agree' or @label='Accepte']") // @Author -
																	// Sushil
																	// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/positiveButton")
	private MobileElement agreeButton;

	@iOSFindBy(xpath = "//*[@label='Agree' or @label='Accepte']") // @Author -
																	// Sushil
																	// 08-Feb-2017
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement acceptButton;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") // @Author -
																// Sushil
																// 08-Feb-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement titleTrade;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Confirm Order' or contains(@label,'Confirmer l')]") // @Author
																											// -
																											// Sushil
																											// 08-Feb-2017
	@AndroidFindBy(xpath = "//*[(@text='Confirm Order' or contains(@text,'Confirmer l')) and @resource-id='android:id/action_bar_title']")
	private MobileElement titleConfirmOrder;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") // @Author -
																// Sushil
																// 07-Mar-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//*[@label='OK' or @label='Done' or @name='Go' or @name='Search']") // @Author
																							// -
																							// Sushil
	// 08-Feb-2017
	// @AndroidFindBy(id="android:id/button1")
	private MobileElement iOSKybdOKButton;

	@iOSFindBy(xpath = "//*[@label='OK']") // @Author - Sushil 08-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@index=0]")
	private MobileElement TradeFrame;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good') or contains(@label,'Échéance')]/../*[2]") // @Author
																														// -
																														// Sushil
																														// 08-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Good') or contains(@text,'Échéance')]/../android.widget.TextView[@index=1]")
	private MobileElement goodTill;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']/../*[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']/../android.widget.TextView[@index=1]")
	private MobileElement price;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='CANCEL' or @label='ANNULER']") // @Author
																						// -
																						// Sushil
																						// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/dialog_button")
	private MobileElement goodTillCancel;

	@iOSFindBy(xpath = " //*[contains(@label,'Account') or contains(@label,'Compte')]") // @Author
																						// -
																						// Sushil
																						// 06-Feb-2017
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/selectedText' and
	// @index='0']")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/selectedText']")//@Author
	// - Sushil 13-Jun-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText2']/../*[@resource-id='com.td:id/selectedValue']") // @Author
																																				// -
																																				// Sushil
																																				// 16-Jun-2017

	private MobileElement defaultTradeAccount;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement listview;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trading Password' or @label='Mot de passe de négociation']") // @Author
																															// -
																															// Sushil
																															// 06-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trading Password' or @text='Mot de passe de négociation']")
	private MobileElement labelTradingPassword;

	@iOSFindBy(xpath = "//*[@label='Commission Schedule' or @label='Barème des commissions']") // @Author
																								// -
																								// Sushil
																								// 02-Mar-2017
	@AndroidFindBy(id = "com.td:id/commissionLink")
	private MobileElement commissionLink;

	@iOSFindBy(xpath = "//*[@label='Important Information' or @label='Renseignements importants']") // @Author
																									// -
																									// Sushil
																									// 02-Mar-2017
	@AndroidFindBy(id = "com.td:id/importantInfoLink")
	private MobileElement importantInfoLink;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'close x')]/../XCUIElementTypeStaticText[1]") // @Author
																												// -
																												// Sushil
																												// 06-Feb-2017
	@AndroidFindBy(id = "com.td:id/urlTitle")
	private MobileElement urlTitle;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'close x')]") // @Author
																				// -
																				// Sushil
																				// 06-Feb-2017
	@AndroidFindBy(id = "com.td:id/btnDone")
	private MobileElement btnDone;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trading Password' or @label='Mot de passe de négociation']/../XCUIElementTypeSecureTextField[1]") // @Author
																																								// -
																																								// Sushil
																																								// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/editTextPassword")
	private MobileElement editTextPassword;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Trading Password is turned off') or contains(@label,'Votre mot de passe est inactif')]") // @Author
																																								// -
																																								// Sushil
																																								// 03-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Trading Password is turned off') or contains(@text,'Votre mot de passe est inactif')]")
	private MobileElement tradingPwdDisableMsg;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder') or contains(@label,'actionnaire')]/../*[2]") // @Author
																																// -
																																// Sushil
																																// 03-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Shareholder') or contains(@text,'actionnaire')]/../android.widget.TextView[@index=1]")
	private MobileElement shareholderType;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Preview Order') or contains(@label,'Aperçu de')]") // @Author
																													// -
																													// Sushil
																													// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/orderEntryPreviewButton")
	private MobileElement previewOrderButton;

	@iOSFindBy(xpath = "//XCUIElementTypeTextView[contains(@value,'want to go back?') or contains(@value,'vraiment revenir en arrière?')]") // @Author
																																			// -
																																			// Sushil
																																			// 03-Mar-2017
	@AndroidFindBy(id = "android:id/message")
	private MobileElement messageBackButton;

	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']") // @Author
																		// -
																		// Sushil
																		// 07-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation']")
	private MobileElement Investing_Trade;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Refresh' or @label='Actualiser']") // @Author
																							// -
																							// Sushil
																							// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/refresh_menu")
	private MobileElement refreshButton;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[3]") // @Author
																				// -
																				// Sushil
																				// 10-Mar-2017
	@AndroidFindBy(id = "com.td:id/txt_price")
	private MobileElement Quote_price;

	@iOSFindBy(xpath = "//*[contains(@label,'Limit Price') or contains(@label,'Cours limit')]/../*[2]") // @Author
																										// -
																										// Sushil
																										// 08-Feb-2017

	/// @AndroidFindBy(xpath =
	/// "//*[@resource-id='com.td:id/limit_price']/*/*/*[2]")
	@AndroidFindBy(xpath = "//*[contains(@text,'Limit Price') or contains(@text,'Cours limit')]/../*[2]/*[@resource-id='com.td:id/amountEditText']") // Tablet
																																						// 5.x

	private MobileElement LimitPrice;

	@iOSFindBy(xpath = "//*[contains(@label,'Date')]/../*[2]") // @Author -
																// Sushil
																// 13-Mar-2017
	@AndroidFindBy(id = "com.td:id/selectedDate")
	private MobileElement DateSpecify;

	@iOSFindBy(xpath = "//*[@label='Important Information' or @label='Renseignements importants']") // @Author
																									// -
																									// Sushil
																									// 02-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.Button[@NAF='true' and @index=2]")
	private MobileElement monthNextButton;

	@iOSFindBy(xpath = "//*[contains(@label,'Expires in') or contains(@label,'Expire dans')]") // @Author
																								// -
																								// Sushil
																								// 17-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Expires in') or contains(@text,'Expire dans')]")
	private MobileElement selectedExpiryListItem;

	@iOSFindBy(xpath = "//*[contains(@label,'Expires in 183 days') or contains(@label,'Expire dans 183 jours')]") // @Author
																													// -
																													// Sushil
																													// 17-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Expires in 183 days') or contains(@text,'Expire dans 183 jours')]")
	private MobileElement expiryItem183Days;

	@iOSFindBy(xpath = "//*[contains(@label,'Expires in 36 days') or contains(@label,'Expire dans 36 jours')]") // @Author
																												// -
																												// Sushil
																												// 17-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Expires in 36 days') or contains(@text,'Expire dans 36 jours')]")
	private MobileElement expiryItem36Days;

	@iOSFindBy(xpath = "//*[contains(@label,'name or symbol') or contains(@label,'nom ou le symbole')]") // @Author
																											// -
																											// Sushil
																											// 07-Feb-2017
	@AndroidFindBy(id = "com.td:id/txtSearchTitle")
	private MobileElement search_txtSearchTitle;

	@iOSFindBy(xpath = "//*[contains(@label,'name or symbol') or contains(@label,'nom ou symbole')]") // @Author
																										// -
																										// shahbaaz
	@AndroidFindBy(id = "com.td:id/txtSearchTitle")
	private MobileElement search_txtSearchTitlediff;

	@iOSFindBy(xpath = "//*[contains(@label,'Type')]/../*[2]") // @Author -
																// Sushil
																// 20-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Type')]/../*[@resource-id='com.td:id/selectedText']")
	private MobileElement selectedOrderType;

	@iOSFindBy(xpath = " //*[contains(@label,'Account') or contains(@label,'Compte')]/../*[3]") // @Author
																								// -
																								// Sushil
																								// 28-Mar-2017
	// @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/selectedValue'
	// and @index=1]")
	// @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/selectedValue']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText2]/../*[@resource-id='com.td:id/selectedValue']") // @Author
																																			// -
																																			// Sushil
																																			// 16-Jun-2017
	private MobileElement selectedAccountValue;

	@iOSFindBy(xpath = "//*[@label='Enter name or symbol' or contains(@label,'Entrez le')]") // @Author
																								// -
																								// Sushil
																								// 28-Feb-2017
	@AndroidFindBy(id = "com.td:id/txtSearchTitle")
	private MobileElement searchBar;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation']") // @Author
																							// -
																							// Sushil
																							// 29-Mar-2017
	@AndroidFindBy(xpath = "//*[(@text='Trade' or @text='Négociation') and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrTrade;

	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]") // @Author
																				// -
																				// Sushil
																				// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/timestamp")
	private MobileElement timestamp;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[2]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'Account') or
	// contains(@text,'Compte')]/../*[2]/*[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText2']/../*[@resource-id='com.td:id/selectedText']") // @Author
																																			// -
																																			// Sushil
																																			// 16-Jun-2017
	private MobileElement account_type;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[3]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'Account') or
	// contains(@text,'Compte')]/../*[2]/*[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText2']/../*[@resource-id='com.td:id/selectedValue']") // @Author
																																				// -
																																				// Sushil
																																				// 16-Jun-2017
	private MobileElement account_number;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[4]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'Account') or
	// contains(@text,'Compte')]/../*[2]/*[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText2']") // @Author
																								// -
																								// Sushil
																								// 16-Jun-2017
	private MobileElement lblCash;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[5]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'Account') or
	// contains(@text,'Compte')]/../*[2]/*[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedValue2']") // @Author
																									// -
																									// Sushil
																									// 16-Jun-2017
	private MobileElement cashAmount;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[6]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'Account') or
	// contains(@text,'Compte')]/../*[2]/*[5]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText3']") // @Author
																								// -
																								// Sushil
																								// 16-Jun-2017
	private MobileElement lblbuyingPower;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[7]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'Account') or
	// contains(@text,'Compte')]/../*[2]/*[6]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedValue3']") // @Author
																									// -
																									// Sushil
																									// 16-Jun-2017
	private MobileElement buyingPowerAmount;

	@iOSFindBy(xpath = "//*[contains(@label,'Stocks') or contains(@label,'Actions et FNB')] ")
	@AndroidFindBy(xpath = "//*[contains(@text,'Stocks') or contains(@text,'Actions et FNB')]")
	private MobileElement stocks_ETFs;

	@iOSFindBy(xpath = "//*[contains(@label,'Options') or contains(@label,'Options')] ")
	@AndroidFindBy(xpath = "//*[contains(@text,'Options') or contains(@text,'Options')]")
	private MobileElement Options;

	@iOSFindBy(xpath = "//*[contains(@label,'1st Leg') or contains(@label,'1re Volet')]") // @Author
																							// -
																							// Sushil
																							// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re Volet')]")
	private MobileElement lbl1stLeg;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]") // @Author
																				// -
																				// Sushil
																				// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]")
	private MobileElement lbl2ndLeg;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Mid Price') or contains(@label,'Prix Milieu')]/../XCUIElementTypeStaticText[2]") // @Author
																																						// -
																																						// Sushil
																																						// 08-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Mid Price') or contains(@text,'Prix Milieu')]")
	private MobileElement lblmidPrice;

	/*
	 * @iOSFindBy(xpath =
	 * "//XCUIElementTypeStaticText[contains(@label,'Natural Price') or contains(@label,'Prix naturel')]/../XCUIElementTypeStaticText[4]"
	 * ) //@Author - Sushil 08-Feb-2017
	 * 
	 * @AndroidFindBy(xpath =
	 * "//*[contains(@text,'Natural Price') or contains(@text,'Prix naturel')]")
	 * private MobileElement lblnaturalPrice;
	 */

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Natural') or contains(@label,'naturel')]/../XCUIElementTypeStaticText[4]") // @Author
																																				// -
																																				// Sushil
																																				// 08-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Natural') or contains(@text,'naturel')]")
	private MobileElement lblnaturalPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']")
	private MobileElement lblprice;

	@iOSFindBy(xpath = "//*[contains(@label,'Limit Price') or contains(@label,'Cours limit')]") // @Author
																								// -
																								// Sushil
																								// 08-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Limit Price') or contains(@text,'Cours limit')]")
	private MobileElement lblLimitPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good') or contains(@label,'Échéance')]") // @Author
																												// -
																												// Sushil
																												// 08-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Good') or contains(@text,'Échéance')]")
	private MobileElement lblgoodTill;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder Type') or contains(@label,'actionnaire')]") // @Author
																																// -
																																// Sushil
																																// 03-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Shareholder Type') or contains(@text,'actionnaire')]")
	private MobileElement lblshareholderType;

	@iOSFindBy(xpath = "//XCUIElementTypeImage[contains(@name,'error')]/../*[1]") // @Author
																					// -
																					// Sushil
																					// 29-Mar-2017
	@AndroidFindBy(id = "com.td:id/error_text")
	private MobileElement error_text;

	@iOSFindBy(xpath = "//[contains(@label,'Strikes') or contains(@label,'Levée')]/../parent::Other/../*[1]/*[2]") // @Author
																													// -
																													// Sushil
																													// 17-Feb-2017
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=1]")
	private MobileElement firstAskCALLSMUL;

	By Text_Condition = By.xpath("//*[@class='sprite flag flag-us']/../*[@class='symbol']/*[1]");

	By Option_Bid = By.xpath("(//*[@class='standard'])[1]");

	String xpathSymbolFlag = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and @content-desc='U S']";
	String xpathSymbolFlag_ios = "//XCUIElementTypeCell[contains(@label,'US')]";
	String sSymbolVal = "";

	/*
	 * String xpathExpiryItem =
	 * "//android.widget.TextView[@resource-id='com.td:id/txtItemValue']";
	 * String xpathExpiryItem_iOS =
	 * "//*[contains(@label,'Expires in') or contains(@label,'Expire dans')]";
	 */

	String xpathExpiryItem = "//*[contains(@label,'Expires in') or contains(@label,'Expire dans') or contains(@text,'Expires in') or contains(@text,'Expire dans')]";

	public void verifyStockOptionContents() {
		Decorator();
		String defaultQtyVal = "";
		try {
			SearchPageMIT.get().clickFirstSymbol();

			// mobileAction.FunCnewSwipe(leg1Quantity,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(leg1Quantity, false, 7, "up");

			mobileAction.verifyElement(stockSymbol, getTestdata("Symbol", XLSheetUserIDs));
			mobileAction.verifyElement(leg1Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.FuncVerifyBlankValue(leg1Quantity, "leg1Quantity");

			/// mobileAction.FunCnewSwipe(leg2Quantity,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 7, "up");
			mobileAction.verifyElement(leg2Option, getTestdata("OptionDefault", XLSheetUserIDs));
			mobileAction.verifyElement(leg2Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.FuncVerifyBlankValue(leg2Quantity, "leg2Quantity");

			String[] sUrlTitle = getTestdata("urlTitle", XLSheetUserIDs).split(";");

			// mobileAction.FuncSwipeWhileElementNotFound(commissionLink, false,
			// 7, "up");
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(commissionLink);

			mobileAction.verifyElement(tradingPwdDisableMsg, getTestdata("TradingPassword", XLSheetUserIDs));

			mobileAction.FuncClick(importantInfoLink, "importantInfoLink");
			mobileAction.verifyElement(urlTitle, sUrlTitle[0]);
			mobileAction.FuncClick(btnDone, "btnDone");

			/// mobileAction.FuncSwipeWhileElementNotFound(commissionLink,
			/// false, 7, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(commissionLink, "commissionLink");
			mobileAction.verifyElement(urlTitle, sUrlTitle[1]);
			mobileAction.FuncClick(btnDone, "btnDone");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionContents() {
		Decorator();
		String defaultQtyVal = "";
		try {
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FuncSwipeWhileElementNotFound(leg1Quantity, false, 5, "up");
			mobileAction.verifyElement(leg1Option, getTestdata("OptionDefault", XLSheetUserIDs));
			mobileAction.verifyElement(leg1Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.verifyElement(leg1Quantity, defaultQtyVal);

			/// mobileAction.FunCnewSwipe(leg2Option,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 7, "up");
			// mobileAction.FunCnewSwipe(leg2Quantity,false,5);
			mobileAction.verifyElement(leg2Option, getTestdata("OptionDefault", XLSheetUserIDs));
			mobileAction.verifyElement(leg2Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.verifyElement(leg2Quantity, defaultQtyVal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySelectOption() {
		Decorator();
		String sExpFormat = "";
		try {
			SearchPageMIT.get().clickFirstSymbol();
			sSymbolVal = mobileAction.FuncGetText(Quote_Symbol);

			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, false, 5, "up");
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");

			mobileAction.FuncSwipeUpTillScreenBottom(firstBidCALLS);
			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");
			sExpFormat = getOptionFormat(expiryDate, "CALLS");
			mobileAction.FuncClick(Continue, "Continue");

			mobileAction.verifyElement(leg1Option, sExpFormat);

			//
			mobileAction.FunCnewSwipe(leg2Option, false, 5);
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			/// mobileAction.FunCnewSwipe(firstStrikePUTS,false,5);
			mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncClick(firstBidPUTS, "firstBidPUTS");

			sExpFormat = getOptionFormat(expiryDate, "PUTS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.verifyElement(leg2Option, sExpFormat);
			mobileAction.verifyElement(leg2Action, getTestdata("Leg2Action2", XLSheetUserIDs));

			////
			mobileAction.FunCnewSwipe(leg1Option, false, 5);
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");
			/// mobileAction.FunCnewSwipe(firstStrikeCALLS,false,5);
			mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncClick(firstAskCALLS, "firstAskCALLS");

			sExpFormat = getOptionFormat(expiryDate, "CALLS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.verifyElement(leg1Option, sExpFormat);
			mobileAction.verifyElement(leg1Action, getTestdata("Leg1Action2", XLSheetUserIDs));
			//
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			/// mobileAction.FunCnewSwipe(firstStrikePUTS,false,5);
			mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncClick(firstAskPUTS, "firstBidPUTS");
			sExpFormat = getOptionFormat(expiryDate, "PUTS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.verifyElement(leg2Option, sExpFormat);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getOptionFormat(MobileElement objExpiryDate, String Calls) {
		String sExpMthDay = "";
		String sExpYear = "";
		String sExpMth = "";
		String sExpDay = "";
		String sExpFormat = "";
		try {
			sExpMthDay = mobileAction.FuncGetText(objExpiryDate).split("-")[0].split(",")[0];
			sExpYear = mobileAction.FuncGetText(objExpiryDate).split("-")[0].split(",")[1];
			sExpYear = sExpYear.split(" ")[1].substring(2, 4);
			sExpMth = sExpMthDay.split(" ")[0];
			sExpDay = sExpMthDay.split(" ")[1];
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (Calls.equalsIgnoreCase("CALLS"))
					sExpFormat = sSymbolVal + " C " + sExpDay + sExpMth.toUpperCase() + sExpYear + " "
							+ getPrice(firstStrikeCALLS.getText());
				else if (Calls.equalsIgnoreCase("PUTS"))
					sExpFormat = sSymbolVal + " P " + sExpDay + sExpMth.toUpperCase() + sExpYear + " "
							+ getPrice(firstStrikePUTS.getText());
				else
					CL.GetReporting().FuncReport("Fail", "Value other than CALLS or PUTS selected." + Calls);
			} else {
				if (Calls.equalsIgnoreCase("CALLS"))
					sExpFormat = sSymbolVal + " C " + sExpDay + sExpMth.toUpperCase() + sExpYear + " "
							+ getPrice(firstStrikeCALLS.getAttribute("label"));
				else if (Calls.equalsIgnoreCase("PUTS"))
					sExpFormat = sSymbolVal + " P " + sExpDay + sExpMth.toUpperCase() + sExpYear + " "
							+ getPrice(firstStrikePUTS.getAttribute("label"));
				else
					CL.GetReporting().FuncReport("Fail", "Value other than CALLS or PUTS selected." + Calls);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sExpFormat;
	}

	public String getPrice(String sPrice) {
		String sReturnPrice = "";
		try {
			/*
			 * if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase(
			 * "Android")) { if(sPrice.contains(",")) sReturnPrice =
			 * sPrice.replaceAll(",", ".").trim(); else sReturnPrice =
			 * sPrice.trim(); } else
			 */
			// {
			if (sPrice.equalsIgnoreCase("Even") || sPrice.equalsIgnoreCase("Pair")) {
				sReturnPrice = sPrice;
			} else {
				Pattern p = Pattern.compile("([0-9]+)([.|,])([0-9]+)");
				Matcher m = p.matcher(sPrice);

				// if an occurrence if a pattern was found in a given string...
				if (m.find()) {
					// ...then you can use group() methods.
					// System.out.println(m.group(0)); // whole matched
					// expression
					if (m.group(0).contains(","))
						sReturnPrice = m.group(0).replaceAll(",", ".").trim();
					else
						sReturnPrice = m.group(0).trim();
				}
			}
		}
		// }
		catch (Exception e) {
			e.printStackTrace();
		}
		return sReturnPrice;
	}

	public void verifyStockMidNaturalPrice() {
		Decorator();
		try {
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FunCnewSwipe(leg1Action, false, 5);
			mobileAction.selectItemFromList(leg1Action, getTestdata("Action", XLSheetUserIDs));
			enterQuantity(leg1Quantity, "1");
			mobileAction.FunCnewSwipe(leg2Option, false, 5);
			mobileAction.waitForElement(leg2Option);
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if (mobileAction.isObjExists(leg2Option))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FunCnewSwipe(firstBidCALLS, false, 5);
			/// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.FunCnewSwipe(leg2Quantity, false, 5);
			enterQuantity(leg2Quantity, "1");
			/// mobileAction.FunCnewSwipe(midPrice,false,5);
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(naturalPrice);

			mobileAction.verifyElementTextContains(midPrice, getTestdata("TextCredit", XLSheetUserIDs));
			mobileAction.verifyElementTextContains(naturalPrice, getTestdata("TextCredit", XLSheetUserIDs));
			verifyMidNaturalVarience();
			//
			mobileAction.FuncClick(titleTrade, "titleTrade");
			mobileAction.FuncClick(acceptButton, "agreeButton");
			TradeMIT.get().clickInvestingTrade();
			TradeMIT.get().selectTradeAccount_OrderType();
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FunCnewSwipe(leg1Action, false, 5);
			mobileAction.selectItemFromList(leg1Action, getTestdata("Action", XLSheetUserIDs));
			enterQuantity(leg1Quantity, "1");
			mobileAction.FunCnewSwipe(leg2Option, false, 5);
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if (mobileAction.isObjExists(leg2Option))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FunCnewSwipe(firstAskCALLS, false, 5);
			/// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncClick(firstAskCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.FunCnewSwipe(leg2Quantity, false, 5);
			enterQuantity(leg2Quantity, "1");
			mobileAction.FunCnewSwipe(midPrice, false, 5);
			/// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.verifyElementTextContains(midPrice, getTestdata("TextDebit", XLSheetUserIDs));
			mobileAction.verifyElementTextContains(naturalPrice, getTestdata("TextDebit", XLSheetUserIDs));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMidNaturalVarience() {
		String sMidPrice = "";
		String sNaturalPrice = "";
		try {
			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 5, "down");
			/// mobileAction.FunctionSwipe("down", 200, 200);
			mobileAction.selectItemFromList(leg1Action, getTestdata("Leg1Action2", XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(naturalPrice, false, 5, "up");
			verifyPriceVarience(mobileAction.FuncGetText(midPrice), sMidPrice, "midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice), sNaturalPrice, "naturalPrice");
			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncSwipeWhileElementNotFound(leg1Quantity, false, 5, "down");
			enterQuantity(leg1Quantity, "2");
			mobileAction.FuncClick(titleTrade, "titleTrade");
			mobileAction.FuncClick(cancelButton, "cancelButton");
			mobileAction.FuncSwipeWhileElementNotFound(naturalPrice, false, 5, "up");
			verifyPriceVarience(mobileAction.FuncGetText(midPrice), sMidPrice, "midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice), sNaturalPrice, "naturalPrice");
			//
			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncSwipeWhileElementNotFound(leg2Action, false, 5, "down");
			mobileAction.selectItemFromList(leg2Action, getTestdata("Leg2Action2", XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(naturalPrice, false, 5, "up");
			verifyPriceVarience(mobileAction.FuncGetText(midPrice), sMidPrice, "midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice), sNaturalPrice, "naturalPrice");
			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "down");
			enterQuantity(leg2Quantity, "2");
			mobileAction.FuncClick(titleTrade, "titleTrade");
			mobileAction.FuncClick(cancelButton, "cancelButton");
			mobileAction.FuncSwipeWhileElementNotFound(midPrice, false, 5, "up");
			verifyPriceVarience(mobileAction.FuncGetText(midPrice), sMidPrice, "midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice), sNaturalPrice, "naturalPrice");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPriceVarience(String sCurrentPrice, String sPreviousPrice, String desc) {
		try {
			if (!getPrice(sCurrentPrice).equalsIgnoreCase(sPreviousPrice)) {
				CL.GetReporting().FuncReport("Pass",
						desc + " price updated.CurrentPrice:" + sCurrentPrice + " PreviousPrice:" + sPreviousPrice);
			} else
				CL.GetReporting().FuncReport("Fail",
						desc + " price not updated.CurrentPrice:" + sCurrentPrice + " PreviousPrice:" + sPreviousPrice);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionMidNaturalPrice() {
		Decorator();
		try {
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, false, 5, "up");
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");
			// mobileAction.FunCnewSwipe(firstBidCALLS,false,5);
			/// mobileAction.FuncSwipeWhileElementNotFound(firstBidCALLS, false,
			// 5, "up");
			/// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstBidCALLS);

			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			// mobileAction.FuncSendKeys(leg1Quantity,"1");
			mobileAction.FuncSwipeWhileElementNotFound(leg1Quantity, false, 5, "up");
			enterQuantity(leg1Quantity, "1");

			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, false, 5, "up");
			// mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if (mobileAction.isObjExists(leg2Option))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			// mobileAction.FunCnewSwipe(firstBidCALLS,false,5);
			/// mobileAction.FuncSwipeWhileElementNotFound(firstBidCALLS, false,
			// 5, "up");
			/// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstBidCALLS);

			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			// mobileAction.FunCnewSwipe(leg2Quantity,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "up");
			// mobileAction.FuncSendKeys(leg2Quantity,"1");
			enterQuantity(leg2Quantity, "1");

			// mobileAction.FunCnewSwipe(midPrice,false,5);
			/// mobileAction.FuncSwipeWhileElementNotFound(midPrice, false, 5,
			// "up");
			/// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(naturalPrice);

			mobileAction.verifyElementTextContains(midPrice, getTestdata("TextCredit", XLSheetUserIDs));
			mobileAction.verifyElementTextContains(naturalPrice, getTestdata("TextCredit", XLSheetUserIDs));
			verifyMidNaturalVarience();
			//
			mobileAction.FuncClick(titleTrade, "titleTrade");
			mobileAction.FuncClick(acceptButton, "acceptButton");
			TradeMIT.get().clickInvestingTrade();
			TradeMIT.get().selectTradeAccount_OrderType();
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FunCnewSwipe(leg1Option, false, 5);
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");
			/// mobileAction.FunCnewSwipe(firstStrikeCALLS,false,5);
			/// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskCALLS);

			mobileAction.FuncClick(firstAskCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");

			enterQuantity(leg1Quantity, "1");
			mobileAction.FunCnewSwipe(leg2Option, false, 5);
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if (mobileAction.isObjExists(leg2Option))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");

			/// mobileAction.FunCnewSwipe(firstAskCALLS,false,5);
			/// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskCALLS);

			mobileAction.FuncClick(firstAskCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			/// mobileAction.FunCnewSwipe(leg2Quantity,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "up");

			enterQuantity(leg2Quantity, "1");
			// mobileAction.FunCnewSwipe(midPrice,false,5);
			/// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(naturalPrice);

			mobileAction.verifyElementTextContains(midPrice, getTestdata("TextDebit", XLSheetUserIDs));
			mobileAction.verifyElementTextContains(naturalPrice, getTestdata("TextDebit", XLSheetUserIDs));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void handleKeyboard() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				(CL.GetAppiumDriver()).hideKeyboard();
			} else if (mobileAction.isObjExists(iOSKybdOKButton))
				mobileAction.FuncClick(iOSKybdOKButton, "iOSKybdOKButton");
			else

				mobileAction.HideKeyBoard_IOS();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterQuantity(MobileElement objEle, String sQty) {
		try {

			// Thread.sleep(5000);
			objEle.click();
			objEle.clear();
			Thread.sleep(2000);
			mobileAction.FuncSendKeys(objEle, sQty);
			// objEle.setValue(sQty);

			/*
			 * final String command = "adb -s " +
			 * CL.getTestDataInstance().getDeviceUdid() +
			 * " input keyevent KEYCODE_1"; //final String command = "adb -s " +
			 * CL.getTestDataInstance().getDeviceUdid() + "input keyevent " +
			 * sQty; Runtime.getRuntime().exec(command);
			 */

			/*
			 * mobileAction.FuncClick(objEle, "Quantity"); ((RemoteWebDriver)
			 * CL.GetDriver()).getKeyboard().sendKeys(sQty);
			 */
			// ((RemoteWebDriver) CL.GetDriver()).getKeyboard().pressKey(sQty);
			// Thread.sleep(2000);
			handleKeyboard();

			// if(objEle.getText()==null || objEle.getText().length()<1)
			if (mobileAction.FuncGetText(objEle).length() < 1) {

				objEle.click();

				objEle.clear();
				Thread.sleep(2000);
				mobileAction.FuncSendKeys(objEle, sQty);
				// objEle.setValue(sQty);

				handleKeyboard();
			}

			// Thread.sleep(5000);

		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail", "Quantity not entered.");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	public void FuncEnterText(MobileElement objEle, String sText) {
		try {

			Thread.sleep(5000);
			objEle.click();
			Thread.sleep(2000);

			mobileAction.FuncSendKeys(objEle, sText);
			handleKeyboard();

			if (mobileAction.FuncGetText(objEle).length() < 1)
			// if(mobileAction.FuncGetText(objEle).equals("") ||
			// mobileAction.FuncGetText(objEle)==null )
			{

				mobileAction.FuncSendKeys(objEle, sText);
				handleKeyboard();
			}

			Thread.sleep(5000);

		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail", "<b> " + sText + "</b> not entered.");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	public void verifyGoodTill() {
		Decorator();
		try {
			String[] sGoodTillValues = getTestdata("GoodTillValues", XLSheetUserIDs).split(";");
			String accNumber = getTestdata("Account2", XLSheetUserIDs);
			String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";

			/// mobileAction.FuncSwipeWhileElementNotFound(goodTill, false, 7,
			/// "up");
			mobileAction.FuncSwipeUpTillScreenBottom(goodTill);

			mobileAction.verifyElement(goodTill, sGoodTillValues[0]);
			mobileAction.selectItemFromList(price, sGoodTillValues[1]);

			/// mobileAction.FuncSwipeWhileElementNotFound(goodTill, false, 7,
			/// "up");
			mobileAction.FuncSwipeUpTillScreenBottom(goodTill);

			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[2]);
			mobileAction.verifyItemInList(sGoodTillValues[3]);
			mobileAction.verifyItemInList(sGoodTillValues[4]);
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");
			mobileAction.selectItemFromList(price, sGoodTillValues[5]);
			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[6]);
			mobileAction.verifyItemInList(sGoodTillValues[7]);
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");

			/// mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount,
			/// false, 5, "down");
			mobileAction.FuncSwipeDownTillScreenTop(defaultTradeAccount);

			mobileAction.FuncClick(defaultTradeAccount, "defaultTradeAccount");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 10, "up");

			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 7, "up");
			mobileAction.selectItemFromList(leg1Action, sGoodTillValues[8]);

			/// mobileAction.FuncSwipeWhileElementNotFound(goodTill, false, 7,
			/// "up");
			mobileAction.FuncSwipeUpTillScreenBottom(goodTill);

			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[9]);
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");

			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 5, "down");
			/// mobileAction.FuncSwipeDownTillScreenTop(leg1Action);

			mobileAction.selectItemFromList(leg1Action, sGoodTillValues[10]);

			// mobileAction.FuncSwipeWhileElementNotFound(goodTill, false, 7,
			// "up");
			mobileAction.FuncSwipeUpTillScreenBottom(goodTill);

			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[11]);
			mobileAction.verifyItemInList(sGoodTillValues[12]);
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");
			mobileAction.selectItemFromList(price, sGoodTillValues[13]);

			/// mobileAction.FuncSwipeWhileElementNotFound(labelTradingPassword,
			/// false, 7, "up");
			mobileAction.FuncSwipeUpTillScreenBottom(labelTradingPassword);

			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[14]);
			mobileAction.verifyItemInList(sGoodTillValues[15]);
			mobileAction.verifyItemInList(sGoodTillValues[16]);
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyBackButton() {
		Decorator();
		try {

			String[] sOrderTypeValues = getTestdata("OrderTypeList", XLSheetUserIDs).split(";");

			mobileAction.selectItemFromList(stocks_ETFs, sOrderTypeValues[0]);

			mobileAction.FuncClick(searchBar, "searchBar");

			SearchPageMIT.get().clickFirstSymbol("TD");

			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.verifyElement(messageBackButton, getTestdata("WarningMessage", XLSheetUserIDs));
			mobileAction.FuncClick(cancelButton, "cancelButton");

			String accNumber = "";
			String xpathAccount = "";

			accNumber = getTestdata("Accounts", "UserIDs").trim();// @Author -
																	// Sushil
																	// 06-Feb-2017

			xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";

			mobileAction.waitForElement(defaultTradeAccount);
			mobileAction.FuncClick(defaultTradeAccount, "defaultTradeAccount");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");

			mobileAction.selectItemFromList(stocks_ETFs, sOrderTypeValues[1]);

			mobileAction.FuncClick(searchBar, "searchBar");

			SearchPageMIT.get().clickFirstSymbol("TD");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td"); // switch
																// context
																// to
																// WebView
																// to
																// get
																// the
																// HTML
																// DOM

				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(Option_Bid), "Option_Bid");

				CL.GetAppiumDriver().context("NATIVE_APP");

			} else {
				mobileAction.FuncClick(firstAskCALLSMUL, "firstAskCALLSMUL");
			}

			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.verifyElement(messageBackButton, getTestdata("WarningMessage", XLSheetUserIDs));
			mobileAction.FuncClick(cancelButton, "cancelButton");

			mobileAction.selectItemFromList(Options, sOrderTypeValues[2]);

			mobileAction.selectItemFromList(action, getTestdata("Action", XLSheetUserIDs));

			mobileAction.FuncClick(searchBar, "searchBar");

			SearchPageMIT.get().clickFirstSymbol("TDB093");

			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.verifyElement(messageBackButton, getTestdata("WarningMessage", XLSheetUserIDs));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySharehoderType() {

		Decorator();
		String accNumber2 = getTestdata("Account2", XLSheetUserIDs);
		String xpathAccount2 = "//*[contains(@text,'" + accNumber2 + "') or contains(@label,'" + accNumber2 + "')]";

		String accNumber3 = getTestdata("Account3", XLSheetUserIDs);
		String xpathAccount3 = "//*[contains(@text,'" + accNumber3 + "') or contains(@label,'" + accNumber3 + "')]";

		try {
			String[] aShareholderType = getTestdata("ShareHolder", XLSheetUserIDs).split(";");

			/// mobileAction.FuncSwipeWhileElementNotFound(labelTradingPassword,
			/// false, 7, "up");
			mobileAction.FuncSwipeUpTillScreenBottom(labelTradingPassword);

			mobileAction.verifyElement(shareholderType, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.FuncClick(shareholderType, "shareholderType");
			for (int i = 0; i < aShareholderType.length; i++) {
				if (aShareholderType[i].contains("autre"))
					mobileAction.verifyItemInListContains("autre");
				else
					mobileAction.verifyItemInList(aShareholderType[i]);
			}

			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");

			/// mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount,
			/// true, 7, "down");
			mobileAction.FuncSwipeDownTillScreenTop(defaultTradeAccount);
			mobileAction.FuncClick(defaultTradeAccount, "defaultTradeAccount");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount2, true, 60, "up");

			/// mobileAction.FuncSwipeWhileElementNotFound(labelTradingPassword,
			/// false, 7, "up");
			mobileAction.FuncSwipeUpTillScreenBottom(labelTradingPassword);
			mobileAction.verifyElement(shareholderType, getTestdata("TextDefaultListItem", XLSheetUserIDs));

			/// mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount,
			/// true, 7, "down");
			mobileAction.FuncSwipeDownTillScreenTop(defaultTradeAccount);
			mobileAction.FuncClick(defaultTradeAccount, "defaultTradeAccount");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount3, true, 60, "up");

			fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskPUTS, "firstAskPUTS");

			if (mobileAction.isObjExists(shareholderType, 2)) {
				CL.GetReporting().FuncReport("Fail",
						"Please correct test data.Shareholder should not be displayed for non shareholder account:"
								+ accNumber3);
			} else
				CL.GetReporting().FuncReport("Pass",
						"Sharehoder not displayed for non shareholder account:" + accNumber3);

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fillStockOptionOrder(MobileElement objSelectOption, String sOptionDesc) {
		Decorator();
		try {
			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 7, "up");
			mobileAction.selectItemFromList(leg1Action, getTestdata("Action", XLSheetUserIDs));
			mobileAction.FuncSwipeOnce("up");
			enterQuantity(leg1Quantity, getTestdata("Leg1Qunatity", XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
				if (mobileAction.isObjExists(leg2Option, 2))
					mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			} else
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");

			if (getTestdata("Good'til", XLSheetUserIDs).equalsIgnoreCase("Cancel")
					|| getTestdata("Good'til", XLSheetUserIDs).equalsIgnoreCase("Annuler")) {

				selectGoodTillCancel();

			} else {

				mobileAction.FuncClick(selectedExpiryListItem, "selectedExpiryListItem");

				try {
					CL.GetDriver().findElements(By.xpath(xpathExpiryItem)).get(1).click();
					CL.GetReporting().FuncReport("Pass", "Expiry list 2nd item selected.");
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Expiry list 2nd item not selected.");

				}

			}

			mobileAction.FunCnewSwipe(objSelectOption, false, 5);
			mobileAction.FuncClick(objSelectOption, sOptionDesc);
			mobileAction.FuncClick(Continue, "Continue");

			if (!getTestdata("Leg2Action2", XLSheetUserIDs).equalsIgnoreCase(""))
				mobileAction.selectItemFromList(leg2Action, getTestdata("Leg2Action2", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			enterQuantity(leg2Quantity, getTestdata("Leg2Qunatity", XLSheetUserIDs));

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(commissionLink,false,5
			 * ,"up"); mobileAction.FuncSwipeOnce("up");
			 */
			mobileAction.FuncSwipeUpTillScreenBottom(commissionLink);

			String tempPrice = getTestdata("Price", XLSheetUserIDs);
			mobileAction.selectItemFromList(price, tempPrice);
			if (tempPrice.equalsIgnoreCase("Net Debit") || tempPrice.equalsIgnoreCase("Net Credit")
					|| tempPrice.equalsIgnoreCase("Débit net") || tempPrice.equalsIgnoreCase("Crédit net")) {
				FuncEnterText(LimitPrice, getTestdata("SelectLimitPrice", XLSheetUserIDs));
			}

			String sShareHolder = getTestdata("ShareHolder", XLSheetUserIDs).trim();
			if (mobileAction.isObjExists(shareholderType, 2) && sShareHolder != "") {
				if (!sShareHolder.contains("autre"))
					mobileAction.selectItemFromList(shareholderType, sShareHolder);
				else
					selectShareholderNeitherFR();
				mobileAction.FuncSwipeOnce("up");
			}

			String tempGoodTill = getTestdata("Good'til", XLSheetUserIDs);
			mobileAction.selectItemFromList(goodTill, tempGoodTill);
			mobileAction.FuncSwipeOnce("up");

			if (tempGoodTill.equalsIgnoreCase("Specify") || tempGoodTill.equalsIgnoreCase("Préciser")) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
					selectDateSpecify_Android(leg2Option);
			}
			if (mobileAction.isObjExists(editTextPassword, 2)) {

				mobileAction.FuncSendKeys(editTextPassword, getTestdata("TradingPassword", XLSheetUserIDs));
				handleKeyboard();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fillOptionOptionOrder(MobileElement objLeg1SelectOption, String sLeg1OptionDesc,
			MobileElement objLeg2SelectOption, String sLeg2OptionDesc) {
		Decorator();
		try {
			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");

			if (getTestdata("Good'til", XLSheetUserIDs).equalsIgnoreCase("Cancel")
					|| getTestdata("Good'til", XLSheetUserIDs).equalsIgnoreCase("Annuler")) {

				selectGoodTillCancel();

			} else {

				mobileAction.FuncClick(selectedExpiryListItem, "selectedExpiryListItem");
				/*
				 * if(CL.getTestDataInstance().getMobilePlatForm().
				 * 
				 * equalsIgnoreCase("Android")) {
				 */
				try {
					CL.GetDriver().findElements(By.xpath(xpathExpiryItem)).get(1).click();
					CL.GetReporting().FuncReport("Pass", "Expiry list 2nd item selected.");
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Expiry list 2nd item not selected.");

				}

			}

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(objLeg1SelectOption,
			 * false, 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			mobileAction.FuncSwipeUpTillScreenBottom(objLeg1SelectOption);

			mobileAction.FuncClick(objLeg1SelectOption, sLeg1OptionDesc);
			mobileAction.FuncClick(Continue, "Continue");

			if (!getTestdata("Leg1Action2", XLSheetUserIDs).equalsIgnoreCase(""))
				mobileAction.selectItemFromList(leg1Action, getTestdata("Leg1Action2", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(leg1Quantity, false, 5, "up");
			// mobileAction.FuncSwipeOnce("up");

			enterQuantity(leg1Quantity, getTestdata("Leg1Qunatity", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
				if (mobileAction.isObjExists(leg2Option, 2))
					mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			} else
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");

			if (getTestdata("Good'til", XLSheetUserIDs).equalsIgnoreCase("Cancel")
					|| getTestdata("Good'til", XLSheetUserIDs).equalsIgnoreCase("Annuler")) {

				selectGoodTillCancel();

			} else {

				mobileAction.FuncClick(selectedExpiryListItem, "selectedExpiryListItem");

				try {
					CL.GetDriver().findElements(By.xpath(xpathExpiryItem)).get(1).click();
					CL.GetReporting().FuncReport("Pass", "Expiry list 2nd item selected.");
				} catch (Exception e) {
					CL.GetReporting().FuncReport("Fail", "Expiry list 2nd item not selected.");
				}

			}

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(objLeg2SelectOption,
			 * false, 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			mobileAction.FuncSwipeUpTillScreenBottom(objLeg2SelectOption);

			mobileAction.FuncClick(objLeg2SelectOption, sLeg2OptionDesc);
			mobileAction.FuncClick(Continue, "Continue");

			if (!getTestdata("Leg2Action2", XLSheetUserIDs).equalsIgnoreCase(""))
				mobileAction.selectItemFromList(leg2Action, getTestdata("Leg2Action2", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "up");
			// mobileAction.FuncSwipeOnce("up");
			enterQuantity(leg2Quantity, getTestdata("Leg2Qunatity", XLSheetUserIDs));

			/// mobileAction.FuncSwipeWhileElementNotFound(commissionLink,false,5,"up");
			mobileAction.FuncSwipeUpTillScreenBottom(commissionLink);

			String tempPrice = getTestdata("Price", XLSheetUserIDs);
			mobileAction.selectItemFromList(price, tempPrice);
			if (tempPrice.equalsIgnoreCase("Net Debit") || tempPrice.equalsIgnoreCase("Net Credit")
					|| tempPrice.equalsIgnoreCase("Débit net") || tempPrice.equalsIgnoreCase("Crédit net")) {
				FuncEnterText(LimitPrice, getTestdata("SelectLimitPrice", XLSheetUserIDs));
			}

			String sShareHolder = getTestdata("ShareHolder", XLSheetUserIDs).trim();
			if (mobileAction.isObjExists(shareholderType, 2) && sShareHolder != "") {
				if (!sShareHolder.contains("autre"))
					mobileAction.selectItemFromList(shareholderType, sShareHolder);
				else
					selectShareholderNeitherFR();
				mobileAction.FuncSwipeOnce("up");
			}

			String tempGoodTill = getTestdata("Good'til", XLSheetUserIDs);
			mobileAction.selectItemFromList(goodTill, tempGoodTill);
			mobileAction.FuncSwipeOnce("up");

			if (tempGoodTill.equalsIgnoreCase("Specify") || tempGoodTill.equalsIgnoreCase("Préciser")) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
					selectDateSpecify_Android(leg2Option);
			}
			if (mobileAction.isObjExists(editTextPassword, 2)) {

				mobileAction.FuncSendKeys(editTextPassword, getTestdata("TradingPassword", XLSheetUserIDs));
				handleKeyboard();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStockOptionBackButton() {
		Decorator();
		String sMidPrice = "";
		String sNaturalPrice = "";
		try {
			fillStockOptionOrder(firstBidCALLS, "firstBidCALLS");

			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncClick(refreshButton, "refreshButton");
			Thread.sleep(7000);
			verifyPriceVarience(mobileAction.FuncGetText(midPrice), sMidPrice, "midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice), sNaturalPrice, "naturalPrice");

			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.verifyElement(messageBackButton, getTestdata("WarningMessage", XLSheetUserIDs));
			mobileAction.FuncClick(cancelButton, "cancelButton");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			mobileAction.FuncIsElementEnabled(Investing_Trade, "Investing_Trade");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionBackButton() {
		Decorator();
		String sMidPrice = "";
		String sNaturalPrice = "";
		try {
			fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS", firstBidPUTS, "firstBidPUTS");

			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncClick(refreshButton, "refreshButton");
			Thread.sleep(7000);
			verifyPriceVarience(mobileAction.FuncGetText(midPrice), sMidPrice, "midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice), sNaturalPrice, "naturalPrice");

			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.verifyElement(messageBackButton, getTestdata("WarningMessage", XLSheetUserIDs));
			mobileAction.FuncClick(cancelButton, "cancelButton");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.FuncClick(acceptButton, "acceptButton");
			mobileAction.FuncIsElementEnabled(Investing_Trade, "Investing_Trade");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionPreviewOrderButton() {
		Decorator();
		String sPreviousQuotePrice = "";
		String sCurrentQuatePrice = "";
		try {
			mobileAction.waitForElement(previewOrderButton);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (!previewOrderButton.isEnabled()) {
					CL.GetReporting().FuncReport("Pass", "previewOrderButton should be disabled");
				} else
					CL.GetReporting().FuncReport("Fail", "previewOrderButton should not enabled");
			}

			fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskPUTS, "firstAskPUTS");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");

			mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount, false, 7, "down");
			sPreviousQuotePrice = getPrice(mobileAction.FuncGetText(Quote_price)).trim();
			mobileAction.FuncClick(refreshButton, "refreshButton");
			Thread.sleep(7000);
			sCurrentQuatePrice = getPrice(mobileAction.FuncGetText(Quote_price)).trim();
			verifyPriceVarience(sCurrentQuatePrice, sPreviousQuotePrice, "Quote");

			mobileAction.FuncSwipeWhileElementNotFound(naturalPrice, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncVerifyNonBlankValue(midPrice, "midPrice");
			mobileAction.FuncVerifyNonBlankValue(naturalPrice, "naturalPrice");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");

			mobileAction.FuncClick(doNotAgreeButton, "doNotAgreeButton");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			// mobileAction.verifyElement(titleConfirmOrder,
			// getTestdata("urlTitle",XLSheetUserIDs));
			mobileAction.verifyElementIsDisplayed(titleConfirmOrder, "titleConfirmOrder");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void submitStockOptionOrder() {
		Decorator();
		try {
			String sLeg2OptionChainVal = getTestdata("Leg2OptionChainVal", XLSheetUserIDs);

			if (sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillStockOptionOrder(firstAskCALLS, "firstAskCALLS");
			else if (sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillStockOptionOrder(firstAskPUTS, "firstAskPUTS");
			else if (sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillStockOptionOrder(firstBidCALLS, "firstBidCALLS");
			else if (sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillStockOptionOrder(firstBidPUTS, "firstBidPUTS");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			// mobileAction.verifyElement(titleConfirmOrder,
			// getTestdata("urlTitle",XLSheetUserIDs));
			mobileAction.verifyElementIsDisplayed(titleConfirmOrder, "titleConfirmOrder");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void submitOptionOptionOrder() {
		Decorator();
		try {
			String sLeg1OptionChainVal = getTestdata("Leg1OptionChainVal", XLSheetUserIDs);
			String sLeg2OptionChainVal = getTestdata("Leg2OptionChainVal", XLSheetUserIDs);

			if (sLeg1OptionChainVal.equalsIgnoreCase("AskCALLS") && sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskCALLS, "firstAskCALLS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("AskCALLS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskPUTS, "firstAskPUTS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("AskCALLS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstBidCALLS, "firstBidCALLS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("AskCALLS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstBidPUTS, "firstBidPUTS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("AskPUTS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillOptionOptionOrder(firstAskPUTS, "firstAskPUTS", firstAskCALLS, "firstAskCALLS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("AskPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillOptionOptionOrder(firstAskPUTS, "firstAskPUTS", firstAskPUTS, "firstAskPUTS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("AskPUTS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillOptionOptionOrder(firstAskPUTS, "firstAskPUTS", firstBidCALLS, "firstBidCALLS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("AskPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillOptionOptionOrder(firstAskPUTS, "firstAskPUTS", firstBidPUTS, "firstBidPUTS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("BidCALLS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS", firstBidCALLS, "firstBidCALLS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("BidCALLS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS", firstBidPUTS, "firstBidPUTS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("BidCALLS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS", firstAskCALLS, "firstAskCALLS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("BidCALLS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS", firstAskPUTS, "firstAskPUTS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("BidPUTS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillOptionOptionOrder(firstBidPUTS, "firstBidPUTS", firstBidCALLS, "firstBidCALLS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("BidPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillOptionOptionOrder(firstBidPUTS, "firstBidPUTS", firstBidPUTS, "firstBidPUTS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("BidPUTS")
					&& sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillOptionOptionOrder(firstBidPUTS, "firstBidPUTS", firstAskCALLS, "firstAskCALLS");

			else if (sLeg1OptionChainVal.equalsIgnoreCase("BidPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillOptionOptionOrder(firstBidPUTS, "firstBidPUTS", firstAskPUTS, "firstAskPUTS");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			mobileAction.verifyElementIsDisplayed(titleConfirmOrder, "titleConfirmOrder");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStockOptionFieldsReset() {
		Decorator();
		try {
			fillStockOptionOrder(firstBidCALLS, "firstBidCALLS");

			mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount, false, 7, "down");

			mobileAction.FuncClick(search_txtSearchTitlediff, "search_txtSearchTitlediff");

			SearchPageMIT.get().clickFirstSymbol("AAPL");

			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 7, "up");
			mobileAction.verifyElement(leg1Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncVerifyBlankValue(leg1Quantity, "leg1Quantity");
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.verifyElement(leg2Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncVerifyBlankValue(leg2Quantity, "leg2Quantity");

			mobileAction.FuncSwipeWhileElementNotFound(commissionLink, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");

			if (mobileAction.isObjExists(midPrice, 2))
				CL.GetReporting().FuncReport("Fail", "Mid & Natural price should not be displayed");
			else
				CL.GetReporting().FuncReport("Pass", "Mid & Natural price removed.");

			mobileAction.verifyElement(price, getTestdata("TextDefaultListItem", XLSheetUserIDs));

			if (mobileAction.isObjExists(shareholderType, 2)) {
				mobileAction.verifyElement(shareholderType, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			}

			mobileAction.verifyElement(goodTill, getTestdata("Good'til", XLSheetUserIDs));

			if (mobileAction.isObjExists(editTextPassword, 2)) {
				mobileAction.FuncVerifyNonBlankValue(editTextPassword, "editTextPassword");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionFieldsReset() {
		Decorator();
		try {
			fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskPUTS, "firstAskPUTS");

			mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount, false, 7, "down");

			mobileAction.FuncClick(search_txtSearchTitlediff, "search_txtSearchTitlediff");

			SearchPageMIT.get().clickFirstSymbol("AAPL");
			//
			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 7, "up");
			mobileAction.verifyElement(leg1Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncVerifyBlankValue(leg1Quantity, "leg1Quantity");
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.verifyElement(leg2Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncVerifyBlankValue(leg2Quantity, "leg2Quantity");

			mobileAction.FuncSwipeWhileElementNotFound(commissionLink, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");

			if (mobileAction.isObjExists(midPrice, 2))
				CL.GetReporting().FuncReport("Fail", "Mid & Natural price should not be displayed");
			else
				CL.GetReporting().FuncReport("Pass", "Mid & Natural price removed.");

			mobileAction.verifyElement(price, getTestdata("TextDefaultListItem", XLSheetUserIDs));

			if (mobileAction.isObjExists(shareholderType, 2)) {
				mobileAction.verifyElement(shareholderType, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			}

			mobileAction.verifyElement(goodTill, getTestdata("Good'til", XLSheetUserIDs));

			if (mobileAction.isObjExists(editTextPassword, 2)) {
				mobileAction.FuncVerifyNonBlankValue(editTextPassword, "editTextPassword");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionFieldResetOrderTypeChanged() {
		Decorator();
		try {
			String[] aOrderTypeList = getTestdata("OrderTypeList", XLSheetUserIDs).split(";");

			mobileAction.selectItemFromList(selectedOrderType, aOrderTypeList[0]);

			mobileAction.verifyElement(selectedAccountValue, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(searchBar, "searchBar");

			mobileAction.FuncClick(searchBar, "searchBar");

			SearchPageMIT.get().clickFirstSymbol("G");

			mobileAction.selectItemFromList(selectedOrderType, aOrderTypeList[1]);

			mobileAction.verifyElement(selectedAccountValue, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(searchBar, "searchBar");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStockOptionFieldResetOrderTypeChanged() {
		Decorator();
		try {
			String[] aOrderTypeList = getTestdata("OrderTypeList", XLSheetUserIDs).split(";");

			mobileAction.selectItemFromList(selectedOrderType, aOrderTypeList[0]);

			mobileAction.verifyElement(selectedAccountValue, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(searchBar, "searchBar");

			mobileAction.FuncClick(searchBar, "searchBar");

			SearchPageMIT.get().clickFirstSymbol("G");

			mobileAction.selectItemFromList(selectedOrderType, aOrderTypeList[1]);

			mobileAction.verifyElement(selectedAccountValue, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(searchBar, "searchBar");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTradeOrderFormContent() {
		Decorator();
		try {
			Calendar now = Calendar.getInstance();
			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			String sCurrentDate = format2.split(";")[1];

			mobileAction.verifyElementIsDisplayed(hdrTrade, "hdrTrade");
			mobileAction.verifyElementTextContains(timestamp, sCurrentDate);
			mobileAction.FuncVerifyNonBlankValue(account_type, "account_type");
			mobileAction.FuncVerifyNonBlankValue(account_number, "account_number");
			mobileAction.verifyElementIsDisplayed(lblCash, "lblCash");
			mobileAction.FuncVerifyNonBlankValue(cashAmount, "cashAmount");
			if (mobileAction.isObjExists(lblbuyingPower)) {
				mobileAction.verifyElementIsDisplayed(lblbuyingPower, "lblbuyingPower");
				mobileAction.FuncVerifyNonBlankValue(buyingPowerAmount, "buyingPowerAmount");
			}

			mobileAction.verifyElementIsDisplayed(stocks_ETFs, "stocks_ETFs");
			mobileAction.verifyElementIsDisplayed(searchBar, "searchBar");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyEntryOrderFormContent() {
		Decorator();
		try {
			fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskPUTS, "firstAskPUTS");

			mobileAction.FuncSwipeWhileElementNotFound(search_txtSearchTitle, false, 7, "down");

			mobileAction.FuncVerifyNonBlankValue(search_txtSearchTitle, "Search for different symbol");

			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 7, "up");

			mobileAction.verifyElementIsDisplayed(lbl1stLeg, "lbl1stLeg");

			mobileAction.FuncSwipeWhileElementNotFound(leg2Action, false, 7, "up");

			mobileAction.verifyElementIsDisplayed(lbl2ndLeg, "lbl2ndLeg");

			mobileAction.FuncSwipeWhileElementNotFound(price, false, 7, "up");

			mobileAction.verifyElementIsDisplayed(lblmidPrice, "lblmidPrice");
			mobileAction.verifyElementIsDisplayed(lblnaturalPrice, "lblnaturalPrice");

			mobileAction.FuncSwipeWhileElementNotFound(labelTradingPassword, false, 7, "up");

			mobileAction.verifyElementIsDisplayed(lblprice, "lblprice");
			if (mobileAction.isObjExists(lblLimitPrice))
				mobileAction.verifyElementIsDisplayed(lblLimitPrice, "lblLimitPrice");
			if (mobileAction.isObjExists(lblshareholderType))
				mobileAction.verifyElementIsDisplayed(lblshareholderType, "lblshareholderType");

			mobileAction.verifyElementIsDisplayed(labelTradingPassword, "labelTradingPassword");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyWarningMsgExchangeAgrNotSigned() {
		Decorator();
		try {
			mobileAction.verifyElement(error_text, getTestdata("WarningMessage", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, true, 7, "up");

			mobileAction.FuncSwipeWhileElementNotFound(firstBidCALLS, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeWhileElementNotFound(selectedExpiryListItem, false, 7, "down");
			mobileAction.FuncVerifyNonBlankValue(selectedExpiryListItem, "default expiry date");
			mobileAction.verifyElementTextContains(firstBidCALLS, "-");
			mobileAction.verifyElementTextContains(firstAskPUTS, "-");
			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");
			// System.out.println("hi");
			mobileAction.FuncClick(Continue, "Continue");

			mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount, false, 7, "down");

			mobileAction.selectItemFromList(selectedOrderType, getTestdata("OrderTypeList", XLSheetUserIDs));

			mobileAction.FuncClick(search_txtSearchTitle, "search_txtSearchTitle");

			String xpathFlag = "";
			int temp = 0;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				xpathFlag = xpathSymbolFlag;
			} else {
				xpathFlag = xpathSymbolFlag_ios;
			}
			mobileAction.FuncClick(search_symbol, "search_symbol");
			SearchPageMIT.get().enterSymbol(search_symbol, "AAPL");
			try {
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp),
						"First Symbol");
			} catch (Exception e) {
				CL.GetReporting().FuncReport("Fail", "First Symbol not selected.");
			}

			mobileAction.verifyElement(error_text, getTestdata("WarningMessage", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, true, 7, "up");

			mobileAction.FuncSwipeWhileElementNotFound(firstBidPUTS, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.verifyElementTextContains(firstBidPUTS, "-");
			mobileAction.verifyElementTextContains(firstAskCALLS, "-");
			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");

			mobileAction.FuncClick(Continue, "Continue");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectDateSpecify_Android(MobileElement objOption) {
		Decorator();
		try {
			Calendar now = Calendar.getInstance();

			// System.out.println(now.getTime());
			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			String sCurrentMonth = format2.split(";")[2];

			mobileAction.FuncSwipeWhileElementNotFound(objOption, false, 7, "down");
			String sExpiryDate = mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(objOption), "([0-9]+)");
			int iSelectDate = 1;
			String xpathDate = "";

			mobileAction.FuncSwipeWhileElementNotFound(DateSpecify, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(DateSpecify, "DateSpecify");

			if (sCurrentDate.equalsIgnoreCase(sExpiryDate)) {
				xpathDate = "//android.view.View[@content-desc='" + sCurrentDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)), sCurrentDate);
			} else if ((now.getActualMaximum(Calendar.DAY_OF_MONTH) == Integer.parseInt(sCurrentDate))) {
				mobileAction.FuncClick(monthNextButton, "monthNextButton");
				iSelectDate = 3;
				xpathDate = "//android.view.View[@content-desc='" + iSelectDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),
						Integer.toString(iSelectDate));
			}
			// else if((Integer.parseInt(sCurrentDate) <
			// Integer.parseInt(sExpiryDate)) &&
			// !sCurrentDay.equalsIgnoreCase("FRI"))
			else if (!sCurrentDay.equalsIgnoreCase("FRI")) {
				iSelectDate = Integer.parseInt(sCurrentDate) + 1;
				xpathDate = "//android.view.View[@content-desc='" + iSelectDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),
						Integer.toString(iSelectDate));
			}
			// else if((Integer.parseInt(sCurrentDate) <
			// Integer.parseInt(sExpiryDate)) &&
			// sCurrentDay.equalsIgnoreCase("FRI"))
			else if (sCurrentDay.equalsIgnoreCase("FRI")) {
				iSelectDate = Integer.parseInt(sCurrentDate) + 3;
				xpathDate = "//android.view.View[@content-desc='" + iSelectDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),
						Integer.toString(iSelectDate));
			}
			/*
			 * else if((now.getActualMaximum(Calendar.DAY_OF_MONTH) ==
			 * Integer.parseInt(sCurrentDate))) {
			 * mobileAction.FuncClick(monthNextButton, "monthNextButton");
			 * iSelectDate = 3; xpathDate =
			 * "//android.view.View[@content-desc='"+ iSelectDate + "']";
			 * mobileAction.FuncClick((MobileElement)
			 * CL.GetDriver().findElement(By.xpath(xpathDate)),Integer.toString(
			 * iSelectDate)); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectShareholderNeitherFR() {
		boolean Err = false;
		String xpathExpression = "";
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			xpathExpression = "//*[contains(@text,'autre')]";
		else
			xpathExpression = "//*[contains(@label,'autre')]";
		try {
			mobileAction.waitForElement(shareholderType);
			mobileAction.FuncClick(shareholderType, "shareholderType");
			if (CL.GetDriver().findElement(By.xpath(xpathExpression)).isDisplayed())
				CL.GetDriver().findElement(By.xpath(xpathExpression)).click();
		} catch (Exception e1) {
			Err = true;
		}
		try {
			if (!Err)
				CL.GetReporting().FuncReport("Pass",
						String.format("<b> %s </b> list item selected", "Ni l’un, ni l’autre"));
			else
				CL.GetReporting().FuncReport("Fail",
						String.format("<b> %s </b> list item not selected", "Ni l’un, ni l’autre"));
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	}

	public void selectGoodTillCancel() {
		Decorator();
		try {
			mobileAction.FuncClick(selectedExpiryListItem, "selectedExpiryListItem");
			try {
				String sixmonth = "";
				boolean bFlag = false;
				int size1 = CL.GetDriver().findElements(By.xpath(xpathExpiryItem)).size();
				// int size1 = 100;
				for (int j = 1; j < 5; j++) {
					Thread.sleep(2000);
					for (int i = 0; i < size1; i++) {
						// CL.GetDriver().findElements(By.xpath(xpathExpiryItem)).get(i).getText();

						sixmonth = mobileAction.FuncGetValByRegx(
								CL.GetDriver().findElements(By.xpath(xpathExpiryItem)).get(i).getText().split("-")[1],
								"([0-9]+)");

						/*
						 * if(i>=5) mobileAction.FuncSwipeOnce("up");
						 */

						if (Integer.parseInt(sixmonth) >= 183) {
							CL.GetDriver().findElements(By.xpath(xpathExpiryItem)).get(i).click();
							CL.GetReporting().FuncReport("Pass", "Expiry list item greater than 183 days selected.");
							bFlag = true;
							break;
						}
					}
					if (bFlag)
						break;

					mobileAction.FuncSwipeOnce("up");
				}

			} catch (Exception e) {
				CL.GetReporting().FuncReport("Fail", "Expiry list item greater than 183 days not selected.");
			}
			// mobileAction.FuncClick(expiryItem183Days, "expiryItem183Days");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
