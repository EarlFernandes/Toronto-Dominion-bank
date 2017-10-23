package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MLChangeOrder extends _CommonPage {

	private static MLChangeOrder MLChangeOrder;

	public synchronized static MLChangeOrder get() {
		if (MLChangeOrder == null) {
			MLChangeOrder = new MLChangeOrder();
		}
		return MLChangeOrder;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	@iOSFindBy(xpath = "//*[@label='Send Order' or contains(@label,'Envoyer l')]") // @Author
																					// -
																					// Sushil
																					// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement btnSendOrder;

	@iOSFindBy(xpath = "//*[@label='Orders' or @label='Ordres']") // @Author -
																	// Sushil
																	// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_order")
	private MobileElement btn_ORDERS;

	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[1]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re Volet')]")
	private MobileElement latestOrder;

	@iOSFindBy(xpath = " //*[contains(@label,'ACCOUNTS') or contains(@label,'COMPTES')]") // @Author
																							// -
																							// Sushil
																							// 06-Feb-2017
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/selectedText' and
	// @index='0']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView']")
	private MobileElement defaultTradeAccount;

	String accNumber = getTestdata("Accounts", "UserIDs").trim();// @Author -
																	// Sushil
																	// 06-Feb-2017
	// String xpathAccount =
	// "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and
	// contains(@text,'" + accNumber + "']";
	String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Orders' or contains(@label,'Ordres')]") // @Author
																								// -
																								// Sushil
																								// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/ordersTab")
	private MobileElement ordersTab;

	@iOSFindBy(xpath = "//*[@label='Change Order' or contains(@label,'Modifier')]") // @Author
																					// -
																					// Sushil
																					// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/change_order_btn")
	private MobileElement btn_change;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") // @Author -
																// Sushil
																// 07-Mar-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation']") // @Author
																							// -
																							// Sushil
																							// 29-Mar-2017
	@AndroidFindBy(xpath = "//*[(@text='Trade' or @text='Négociation') and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrTrade;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Refresh' or @label='Actualiser']") // @Author
																							// -
																							// Sushil
																							// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/refresh_menu")
	private MobileElement refreshButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'All change and cancel') or contains(@label,'Toute demande de modification')]") // @Author
																																					// -
																																					// Sushil
																																					// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/warning_text")
	private MobileElement messageWarning;

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
	@AndroidFindBy(xpath = "//*[contains(@text,'Account') or contains(@text,'Compte')]/../*[2]")
	private MobileElement account_type;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[3]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Account') or contains(@text,'Compte')]/../*[3]")
	private MobileElement account_number;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[4]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Account') or contains(@text,'Compte')]/../*[4]")
	private MobileElement lblCash;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[5]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Account') or contains(@text,'Compte')]/../*[5]")
	private MobileElement cashAmount;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[6]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Account') or contains(@text,'Compte')]/../*[6]")
	private MobileElement lblbuyingPower;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]/../*[7]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Account') or contains(@text,'Compte')]/../*[7]")
	private MobileElement buyingPowerAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]") // @Author
																				// -
																				// Sushil
																				// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/symbol")
	private MobileElement Quote_Symbol;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]") // @Author
																				// -
																				// Sushil
																				// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/description")
	private MobileElement Quote_description;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]") // @Author
																				// -
																				// Sushil
																				// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/txt_price")
	private MobileElement Quote_txt_price;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[4]") // @Author
																				// -
																				// Sushil
																				// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/quote_profloss")
	private MobileElement quote_profloss;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[4]") // @Author
																				// -
																				// Sushil
																				// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/quote_profloss_percent")
	private MobileElement quote_profloss_percent;

	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell/*") // @Author
																															// -
																															// Sushil
																															// 16-Feb-2017
//	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/multi_leg1_ticker']/*[1]")
	private MobileElement leg1Option;

	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[2]/*[2]") // @Author
																																	// -
																																	// Sushil
																																	// 17-Feb-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/item_row_value_main']/*[1]")
	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*/*[2]/*[@resource-id='com.td:id/item_row_value_main']")
	private MobileElement leg1Action;

	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[3]/*[2]") // @Author
																																	// -
																																	// Sushil
																																	// 16-Feb-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*/*/*/*[@resource-id='com.td:id/amountEditText']")
	private MobileElement leg1Quantity;

	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[4]/*[2]") // @Author
																																	// -
																																	// Sushil
																																	// 16-Feb-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "(//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*/*[2]/*[1])[2]")
	private MobileElement leg1QuantityFilled;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell/*") // @Author
																															// -
																															// Sushil
																															// 16-Feb-2017
//	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/multi_leg2_ticker']/*[1]")
	private MobileElement leg2Option;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[2]/*[2]") // @Author
																																	// -
																																	// Sushil
																																	// 17-Feb-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/item_row_value_main']/*[1]")
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*/*[2]/*[@resource-id='com.td:id/item_row_value_main']")
	private MobileElement leg2Action;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[3]/*[2]") // @Author
																																	// -
																																	// Sushil
																																	// 16-Feb-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*/*/*/*[@resource-id='com.td:id/amountEditText']")
	private MobileElement leg2Quantity;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[4]/*[2]") // @Author
																																	// -
																																	// Sushil
																																	// 16-Feb-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "(//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*/*[2]/*[1])[2]")
	private MobileElement leg2QuantityFilled;

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

	@iOSFindBy(xpath = "//*[@label='Commission Schedule' or @label='Barème des commissions']") // @Author
																								// -
																								// Sushil
																								// 02-Mar-2017
	@AndroidFindBy(id = "com.td:id/commissionLink")
	private MobileElement commissionLink;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']/../*[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']/../android.widget.TextView[@index=1]")
	private MobileElement price;

	@iOSFindBy(xpath = "//*[contains(@label,'Limit Price') or contains(@label,'Cours limit')]/../*[2]") // @Author
																										// -
																										// Sushil
																										// 08-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Limit Price') or contains(@text,'Cours limit')]/../*[@resource-id='com.td:id/amountEditText']")
	private MobileElement LimitPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder') or contains(@label,'actionnaire')]/../*[2]") // @Author
																																// -
																																// Sushil
																																// 03-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Shareholder') or contains(@text,'actionnaire')]/../android.widget.TextView[@index=1]")
	private MobileElement shareholderType;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good') or contains(@label,'Échéance')]/../*[2]") // @Author
																														// -
																														// Sushil
																														// 08-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Good') or contains(@text,'Échéance')]/../android.widget.TextView[@index=1]")
	private MobileElement goodTill;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trading Password' or @label='Mot de passe de négociation']/../XCUIElementTypeSecureTextField[1]") // @Author
																																								// -
																																								// Sushil
																																								// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/editTextPassword")
	private MobileElement editTextPassword;

	@iOSFindBy(xpath = "//*[@label='Important Information' or @label='Renseignements importants']") // @Author
																									// -
																									// Sushil
																									// 02-Mar-2017
	@AndroidFindBy(id = "com.td:id/importantInfoLink")
	private MobileElement importantInfoLink;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Preview Order') or contains(@label,'Aperçu de')]") // @Author
																													// -
																													// Sushil
																													// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/orderEntryPreviewButton")
	private MobileElement previewOrderButton;

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

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Confirm Order' or contains(@label,'Confirmer l')]") // @Author
																											// -
																											// Sushil
																											// 08-Feb-2017
	@AndroidFindBy(xpath = "//*[(@text='Confirm Order' or contains(@text,'Confirmer l')) and @resource-id='android:id/action_bar_title']")
	private MobileElement titleConfirmOrder;

	String sAction, sLeg1Action2, sLeg2Action2, sLeg1Qunatity, sLeg2Qunatity, sPrice, sGoodTill, sShareHolder;
	String sAction1, sLeg1Action21, sLeg2Action21, sLeg1Qunatity1, sLeg2Qunatity1, sPrice1, sGoodTill1, sShareHolder1;

	public void getStockOptionChangeOrderData() {
		try {
			sAction = getTestdata("Action", XLSheetUserIDs).split(";")[0];
			sLeg2Action2 = getTestdata("Leg2Action2", XLSheetUserIDs).split(";")[0];
			sLeg1Qunatity = getTestdata("Leg1Qunatity", XLSheetUserIDs).split(";")[0];
			sLeg2Qunatity = getTestdata("Leg2Qunatity", XLSheetUserIDs).split(";")[0];
			sPrice = getTestdata("Price", XLSheetUserIDs).split(";")[0];
			sGoodTill = getTestdata("Good'til", XLSheetUserIDs).split(";")[0];
			sShareHolder = getTestdata("ShareHolder", XLSheetUserIDs).split(";")[0];

			// sAction1 = getTestdata("Action",XLSheetUserIDs).split(";")[1];
			// sLeg2Action21 =
			// getTestdata("Leg2Action2",XLSheetUserIDs).split(";")[1];
			sLeg1Qunatity1 = getTestdata("Leg1Qunatity", XLSheetUserIDs).split(";")[1];
			sLeg2Qunatity1 = getTestdata("Leg2Qunatity", XLSheetUserIDs).split(";")[1];
			sPrice1 = getTestdata("Price", XLSheetUserIDs).split(";")[1];
			sGoodTill1 = getTestdata("Good'til", XLSheetUserIDs).split(";")[1];

			// sShareHolder1 =
			// getTestdata("ShareHolder",XLSheetUserIDs).split(";")[1];
			sShareHolder1 = getTestdata("ShareHolder", XLSheetUserIDs);
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail", "Exception in getStockOptionChangeOrderData().");
			} catch (IOException e1) {

				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void getOptionOptionChangeOrderData() {
		try {
			sLeg1Action2 = getTestdata("Leg1Action2", XLSheetUserIDs).split(";")[0];
			sLeg2Action2 = getTestdata("Leg2Action2", XLSheetUserIDs).split(";")[0];
			sLeg1Qunatity = getTestdata("Leg1Qunatity", XLSheetUserIDs).split(";")[0];
			sLeg2Qunatity = getTestdata("Leg2Qunatity", XLSheetUserIDs).split(";")[0];
			sPrice = getTestdata("Price", XLSheetUserIDs).split(";")[0];
			sGoodTill = getTestdata("Good'til", XLSheetUserIDs).split(";")[0];
			sShareHolder = getTestdata("ShareHolder", XLSheetUserIDs).split(";")[0];

			// sLeg1Action21 =
			// getTestdata("Leg1Action2",XLSheetUserIDs).split(";")[1];
			// sLeg2Action21 =
			// getTestdata("Leg2Action2",XLSheetUserIDs).split(";")[1];
			sLeg1Qunatity1 = getTestdata("Leg1Qunatity", XLSheetUserIDs).split(";")[1];
			sLeg2Qunatity1 = getTestdata("Leg2Qunatity", XLSheetUserIDs).split(";")[1];
			sPrice1 = getTestdata("Price", XLSheetUserIDs).split(";")[1];
			sGoodTill1 = getTestdata("Good'til", XLSheetUserIDs).split(";")[1];

			// sShareHolder1 =
			// getTestdata("ShareHolder",XLSheetUserIDs).split(";")[1];
			sShareHolder1 = getTestdata("ShareHolder", XLSheetUserIDs);
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail", "Exception in getOptionOptionChangeOrderData().");
			} catch (IOException e1) {
				// TODO Auto-generated catch block

				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void verifyStockOptionChangeOrder()

	{
		Decorator();

		try {

			getStockOptionChangeOrderData();
			Calendar now = Calendar.getInstance();

			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			// String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			/*
			 * String sCurrentMonth = format2.split(";")[2]; String sCurrentYear
			 * = format2.split(";")[3];
			 */

			mobileAction.waitForElement(defaultTradeAccount);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");

			mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");
			mobileAction.FuncClick(ordersTab, "Orders Tab");

			mobileAction.FuncSwipeWhileElementNotFound(latestOrder, false, 7, "up");
			mobileAction.FuncClick(latestOrder, "Select latest Order");

			mobileAction.FuncClick(btn_change, "Change Order");

			mobileAction.verifyElementIsDisplayed(backButton, "Back Button");

			mobileAction.verifyElementIsDisplayed(hdrTrade, "Title Trade");

			mobileAction.verifyElementIsDisplayed(refreshButton, "Refresh Button");

			mobileAction.verifyElement(messageWarning, getTestdata("WarningMessage", XLSheetUserIDs));

			mobileAction.verifyElementTextContains(timestamp, sCurrentDate);

			mobileAction.FuncVerifyNonBlankValue(account_type, "account_type");

			mobileAction.FuncVerifyNonBlankValue(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblCash, "lblCash");

			mobileAction.FuncVerifyNonBlankValue(cashAmount, "cashAmount");

			{
				mobileAction.verifyElementIsDisplayed(lblbuyingPower, "lblbuyingPower");
				mobileAction.FuncVerifyNonBlankValue(buyingPowerAmount, "buyingPowerAmount");
			}

			mobileAction.verifyElementIsDisplayed(Quote_Symbol, "Quote_Symbol");
			mobileAction.verifyElementIsDisplayed(Quote_description, "Quote_description");
			mobileAction.verifyElementTextContains(Quote_txt_price, "$");
			mobileAction.verifyElementTextContains(quote_profloss, "$");
			mobileAction.verifyElementTextContains(quote_profloss_percent, "%");

			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 7, "up");
			mobileAction.verifyElementTextContains(leg1Option, getTestdata("Symbol", XLSheetUserIDs));
			mobileAction.verifyElement(leg1Action, sAction);
			mobileAction.verifyElement(leg1Quantity, sLeg1Qunatity);
			TradeMultiLeg.get().enterQuantity(leg1Quantity, sLeg1Qunatity1);
			mobileAction.FuncVerifyNonBlankValue(leg1QuantityFilled, "leg1QuantityFilled");

			mobileAction.FuncSwipeWhileElementNotFound(leg2QuantityFilled, false, 7, "up");
			mobileAction.verifyElementTextContains(leg2Option, getTestdata("Symbol", XLSheetUserIDs));
			mobileAction.verifyElement(leg2Action, sLeg2Action2);
			mobileAction.verifyElement(leg2Quantity, sLeg2Qunatity);
			TradeMultiLeg.get().enterQuantity(leg2Quantity, sLeg2Qunatity1);
			mobileAction.FuncVerifyNonBlankValue(leg2QuantityFilled, "leg2QuantityFilled");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncVerifyNonBlankValue(midPrice, "Mid Price");
			mobileAction.FuncVerifyNonBlankValue(naturalPrice, "Mid Price");

			mobileAction.FuncSwipeWhileElementNotFound(commissionLink, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			// String tempPrice = getTestdata("Price",XLSheetUserIDs);
			mobileAction.selectItemFromList(price, sPrice);
			if (sPrice.equalsIgnoreCase("Net Debit") || sPrice.equalsIgnoreCase("Net Credit")
					|| sPrice.equalsIgnoreCase("Débit net") || sPrice.equalsIgnoreCase("Crédit net")) {
				TradeMultiLeg.get().FuncEnterText(LimitPrice, getTestdata("SelectLimitPrice", XLSheetUserIDs));
			}

			// String sShareHolder =
			// getTestdata("ShareHolder",XLSheetUserIDs).trim();
			if (mobileAction.isObjExists(shareholderType, 2) && sShareHolder != "") {
				if (!sShareHolder.contains("autre")) {
					mobileAction.verifyElement(shareholderType, sShareHolder);

					// mobileAction.selectItemFromList(shareholderType,
					// sShareHolder1);
				}
				/*
				 * else {
				 * mobileAction.verifyElementTextContains(shareholderType,
				 * "autre"); TradeMultiLeg.get().selectShareholderNeitherFR(); }
				 */
				mobileAction.FuncSwipeOnce("up");
			}

			// String tempGoodTill = getTestdata("Good'til",XLSheetUserIDs);
			mobileAction.verifyElement(goodTill, sGoodTill);
			mobileAction.selectItemFromList(goodTill, sGoodTill1);
			mobileAction.FuncSwipeOnce("up");

			if (sGoodTill1.equalsIgnoreCase("Specify") || sGoodTill1.equalsIgnoreCase("Préciser")) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
					TradeMultiLeg.get().selectDateSpecify_Android(leg2Option);
			}
			if (mobileAction.isObjExists(editTextPassword, 2)) {
				TradeMultiLeg.get().FuncEnterText(editTextPassword, getTestdata("TradingPassword", XLSheetUserIDs));
			}

			mobileAction.verifyElementIsDisplayed(commissionLink, "commissionLink");
			mobileAction.verifyElementIsDisplayed(importantInfoLink, "importantInfoLink");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");

			if (mobileAction.isObjExists(agreeButton))
				mobileAction.FuncClick(agreeButton, "agreeButton");

			mobileAction.verifyElementIsDisplayed(titleConfirmOrder, "titleConfirmOrder");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionChangeOrder() {
		Decorator();

		try {

			getOptionOptionChangeOrderData();
			Calendar now = Calendar.getInstance();

			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			// String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			/*
			 * String sCurrentMonth = format2.split(";")[2]; String sCurrentYear
			 * = format2.split(";")[3];
			 */

			mobileAction.waitForElement(defaultTradeAccount);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");

			mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");
			mobileAction.FuncClick(ordersTab, "Orders Tab");

			mobileAction.FuncSwipeWhileElementNotFound(latestOrder, false, 7, "up");
			mobileAction.FuncClick(latestOrder, "Select latest Order");

			mobileAction.FuncClick(btn_change, "Change Order");

			mobileAction.verifyElementIsDisplayed(backButton, "Back Button");

			mobileAction.verifyElementIsDisplayed(hdrTrade, "Title Trade");

			mobileAction.verifyElementIsDisplayed(refreshButton, "Refresh Button");

			mobileAction.verifyElement(messageWarning, getTestdata("WarningMessage", XLSheetUserIDs));

			mobileAction.verifyElementTextContains(timestamp, sCurrentDate);

			mobileAction.FuncVerifyNonBlankValue(account_type, "account_type");

			mobileAction.FuncVerifyNonBlankValue(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblCash, "lblCash");

			mobileAction.FuncVerifyNonBlankValue(cashAmount, "cashAmount");

			{
				mobileAction.verifyElementIsDisplayed(lblbuyingPower, "lblbuyingPower");
				mobileAction.FuncVerifyNonBlankValue(buyingPowerAmount, "buyingPowerAmount");
			}

			mobileAction.verifyElementIsDisplayed(Quote_Symbol, "Quote_Symbol");
			mobileAction.verifyElementIsDisplayed(Quote_description, "Quote_description");
			mobileAction.verifyElementTextContains(Quote_txt_price, "$");
			mobileAction.verifyElementTextContains(quote_profloss, "$");
			mobileAction.verifyElementTextContains(quote_profloss_percent, "%");

			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 7, "up");
			mobileAction.verifyElementTextContains(leg1Option, getTestdata("Symbol", XLSheetUserIDs));
			mobileAction.verifyElement(leg1Action, sLeg1Action2);
			// mobileAction.selectItemFromList(leg1Action, sLeg1Action21);
			mobileAction.verifyElement(leg1Quantity, sLeg1Qunatity);
			TradeMultiLeg.get().enterQuantity(leg1Quantity, sLeg1Qunatity1);
			mobileAction.FuncVerifyNonBlankValue(leg1QuantityFilled, "leg1QuantityFilled");

			mobileAction.FuncSwipeWhileElementNotFound(leg2QuantityFilled, false, 7, "up");
			mobileAction.verifyElementTextContains(leg2Option, getTestdata("Symbol", XLSheetUserIDs));
			mobileAction.verifyElement(leg2Action, sLeg2Action2);
			mobileAction.verifyElement(leg2Quantity, sLeg2Qunatity);
			TradeMultiLeg.get().enterQuantity(leg2Quantity, sLeg2Qunatity1);
			mobileAction.FuncVerifyNonBlankValue(leg2QuantityFilled, "leg2QuantityFilled");

			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncVerifyNonBlankValue(midPrice, "Mid Price");
			mobileAction.FuncVerifyNonBlankValue(naturalPrice, "Mid Price");

			mobileAction.FuncSwipeWhileElementNotFound(commissionLink, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			// String tempPrice = getTestdata("Price",XLSheetUserIDs);
			mobileAction.selectItemFromList(price, sPrice);
			if (sPrice.equalsIgnoreCase("Net Debit") || sPrice.equalsIgnoreCase("Net Credit")
					|| sPrice.equalsIgnoreCase("Débit net") || sPrice.equalsIgnoreCase("Crédit net")) {
				TradeMultiLeg.get().FuncEnterText(LimitPrice, getTestdata("SelectLimitPrice", XLSheetUserIDs));
			}

			// String sShareHolder =
			// getTestdata("ShareHolder",XLSheetUserIDs).trim();
			if (mobileAction.isObjExists(shareholderType, 2) && sShareHolder != "") {
				if (!sShareHolder.contains("autre")) {
					mobileAction.verifyElement(shareholderType, sShareHolder);
					// mobileAction.selectItemFromList(shareholderType,
					// sShareHolder1);
				}
				/*
				 * else {
				 * mobileAction.verifyElementTextContains(shareholderType,
				 * "autre"); TradeMultiLeg.get().selectShareholderNeitherFR(); }
				 */
				mobileAction.FuncSwipeOnce("up");
			}

			// String tempGoodTill = getTestdata("Good'til",XLSheetUserIDs);
			mobileAction.verifyElement(goodTill, sGoodTill);
			mobileAction.selectItemFromList(goodTill, sGoodTill1);
			mobileAction.FuncSwipeOnce("up");

			if (sGoodTill1.equalsIgnoreCase("Specify") || sGoodTill1.equalsIgnoreCase("Préciser")) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
					TradeMultiLeg.get().selectDateSpecify_Android(leg2Option);
			}
			if (mobileAction.isObjExists(editTextPassword, 2)) {
				TradeMultiLeg.get().FuncEnterText(editTextPassword, getTestdata("TradingPassword", XLSheetUserIDs));
			}

			mobileAction.verifyElementIsDisplayed(commissionLink, "commissionLink");
			mobileAction.verifyElementIsDisplayed(importantInfoLink, "importantInfoLink");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");

			if (mobileAction.isObjExists(agreeButton))
				mobileAction.FuncClick(agreeButton, "agreeButton");

			mobileAction.verifyElementIsDisplayed(titleConfirmOrder, "titleConfirmOrder");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
