package com.td.test.CDNMobile.pages;

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

public class MLConfirmOrderReceipt extends _CommonPage {

	private static MLConfirmOrderReceipt MLConfirmOrderReceipt;

	public synchronized static MLConfirmOrderReceipt get() {
		if (MLConfirmOrderReceipt == null) {
			MLConfirmOrderReceipt = new MLConfirmOrderReceipt();
		}
		return MLConfirmOrderReceipt;
	}

	private void Decorator() {
		PageFactory.initElements(

				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	@iOSFindBy(xpath = "//*[@label='Orders' or @label='Ordres']") // @Author -
																	// Sushil
																	// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_order")
	private MobileElement btn_ORDERS;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Multi-Leg') or contains(@label,'Composantes multiples')]") // @Author
																																// -
																																// Sushil
																																// 23-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Multi-Leg') or contains(@text,'Composantes multiples')]")
	private MobileElement lblOrderMultiLeg;

	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[1]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re Volet')]")
	private MobileElement latestOrder;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Cancel Order') or contains(@label,'Annuler l')]") // @Author
																													// -
																													// Sushil
																													// 21-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Cancel Order') or contains(@text,'Annuler l')]")
	private MobileElement btnCancelOrder;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trading Password' or @label='Mot de passe de négociation']/../XCUIElementTypeSecureTextField[1]") // @Author
																																								// -
																																								// Sushil
																																								// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/editTextPassword")
	private MobileElement editTextPassword;

	@iOSFindBy(xpath = "//*[contains(@label,'Receipt') or contains(@label,'Reçu')]") // @Author
																						// -
																						// Sushil
																						// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Receipt') or contains(@text,'Reçu')]")
	private MobileElement hdrReceipt;

	@iOSFindBy(xpath = "//*[contains(@label,'Menu')]")
	@AndroidFindBy(id = "android:id/up")
	MobileElement MenuUp;

	@iOSFindBy(xpath = "//*[contains(@label,'Thank you!') or contains(@label,'Merci!')]") // @Author
																							// -
																							// Sushil
																							// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Thank you!') or contains(@text,'Merci!')]")
	private MobileElement lblThankYou;

	@iOSFindBy(xpath = "//*[@label='Order sent successfully' or contains(@label,'Ordre transmis avec')]") // @Author
																											// -
																											// Sushil
																											// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='Order sent successfully' or contains(@text,'Ordre transmis avec')]")
	private MobileElement orderPlacedMsg;

	@iOSFindBy(xpath = "//*[contains(@label,'Leg Confirmation') or contains(@label,'de confirmation')]") // @Author
																											// -
																											// Sushil
																											// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='Leg Confirmation' or contains(@text,'de confirmation')]")
	private MobileElement legConfirmationNumber;

	@iOSFindBy(xpath = "//*[contains(@label,'Leg Confirmation') or contains(@label,'Commande')]") // @Author
																									// -
																									// Sushil
																									// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/confirmation_val")
	private MobileElement leg1ConfirmationNumber;

	@iOSFindBy(xpath = "//*[contains(@label,'Leg Confirmation') or contains(@label,'Commande')]") // @Author
																									// -
																									// Sushil
																									// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/confirmation2_val")
	private MobileElement leg2ConfirmationNumber;

	@iOSFindBy(xpath = "//*[@label='ORDER DETAILS' or contains(@label,'DÉTAILS DE')]") // @Author
																						// -
																						// Sushil
																						// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/custom_text")
	private MobileElement lblOrderDetails;

	@iOSFindBy(xpath = "//*[@label='Account' or @label='Compte']/../*[3]") // @Author
																			// -
																			// Sushil
																			// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/textview_account_number")
	private MobileElement account_number;

	@iOSFindBy(xpath = "//*[contains(@label,'Order Placed') or contains(@label,'Ordre pass')]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Order Placed') or contains(@text,'Ordre pass')]")
	private MobileElement lblOrderPlaced;

	@iOSFindBy(xpath = "//*[contains(@label,'Order Placed') or contains(@label,'Ordre pass')]/../*[2]") // @Author
																										// -
																										// Sushil
																										// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Order Placed') or contains(@text,'Ordre pass')]/../*[2]/*[1]")
	private MobileElement OrderPlacedDetails;

	@iOSFindBy(xpath = "//*[contains(@label,'1st Leg') or contains(@label,'1re Volet')]") // @Author
																							// -
																							// Sushil
																							// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re Volet')]")
	private MobileElement lbl1stLeg;

	@iOSFindBy(xpath = "//*[@label='1st Leg' or @label='1re Volet']/../*[2]") // @Author
																				// -
																				// Sushil
																				// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='1st Leg' or @text='1re Volet']/../*[2]/*[1]")
	private MobileElement leg1Details;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]") // @Author
																				// -
																				// Sushil
																				// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]")
	private MobileElement lbl2ndLeg;

	@iOSFindBy(xpath = "//*[@label='2nd Leg' or @label='2e Volet']/../*[2]") // @Author
																				// -
																				// Sushil
																				// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='2nd Leg' or @text='2e Volet']/../*[2]/*[1]")
	private MobileElement leg2Details;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']") // @Author
																						// -
																						// Sushil
																						// 21-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']")
	private MobileElement lblPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']/../*[2]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']/../*[2]/*[1]")
	private MobileElement price;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good') or contains(@label,'Échéance')]") // @Author
																												// -
																												// Sushil
																												// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Good') or contains(@text,'Échéance')]")
	private MobileElement lblGoodTill;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good') or contains(@label,'Échéance')]/../*[2]") // @Author
																														// -
																														// Sushil
																														// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Good') or contains(@text,'Échéance')]/../*[2]/*[1]")
	private MobileElement goodTill;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder Type') or contains(@label,'Type d')]") // @Author
																														// -
																														// Sushil
																														// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Shareholder Type') or contains(@text,'Type d')]")
	private MobileElement lblShareholderType;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder Type') or contains(@label,'Type d')]/../*[2]") // @Author
																																// -
																																// Sushil
																																// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Shareholder Type') or contains(@text,'Type d')]/../*[2]/*[1]")
	private MobileElement ShareholderType;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'All change and cancel') or contains(@label,'Toute demande de modification')]") // @Author
																																					// -
																																					// Sushil
																																					// 03-Mar-2017
	// @AndroidFindBy(id="android:id/message")
	@AndroidFindBy(id = "com.td:id/footer_txt_note")
	private MobileElement messageWarning;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Home' or @label='Accueil']") // @Author
																						// -
																						// Sushil
																						// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_home")
	private MobileElement btn_home;

	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']") // @Author
																		// -
																		// Sushil
																		// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_trade")
	private MobileElement btn_trade;

	@iOSFindBy(xpath = "//*[@label='My Accounts' or @label='Mes comptes']") // @Author
																			// -
																			// Sushil
																			// 23-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='My Accounts' or contains(@text,'Mes comptes')) and @resource-id='com.td:id/navText']")
	private MobileElement myAccounts;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Accounts' or @label='Comptes']") // @Author
																						// -
																						// Sushil
																						// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/classificationTexView")
	private MobileElement lblBanking;

	@iOSFindBy(xpath = "//*[@label='Investing Accounts' or contains(@label='Mes comptes)']") // @Author
																								// -
																								// Sushil
																								// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_order")
	private MobileElement inVestingAccounts;

	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']") // @Author
																		// -
																		// Sushil
																		// 23-Mar-2017
	@AndroidFindBy(xpath = "//*[(@text='Trade' or @text='Négociation') and @resource-id='com.td:id/navText']")
	private MobileElement trade;

	@iOSFindBy(xpath = "//*[@label='Account' or @label='Compte']") // @Author -
																	// Sushil
																	// 23-Mar-2017
	@AndroidFindBy(xpath = "//*[(@text='Account' or @text='Compte') and @resource-id='com.td:id/caption']")
	private MobileElement lblAccount;

	// @iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Home' or
	// @label='Accueil']") //@Author - Sushil 29-Mar-2017
	@iOSFindBy(xpath = "//XCUIElementTypeImage[@name='logo_home.png']")
	@AndroidFindBy(xpath = "//*[(@text='Home' or @text='Accueil') and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrHome;

	@iOSFindBy(xpath = "//*[@label='Send Order' or contains(@label,'Envoyer l')]") // @Author
																					// -
																					// Sushil
																					// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement btnSendOrder;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Orders' or contains(@label,'Ordres')]") // @Author
																								// -
																								// Sushil
																								// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/ordersTab")
	private MobileElement ordersTab;

	public void verifyStockOptionConfirmOrderReceipt() {
		Decorator();
		try {
			// mobileAction.FuncGetValByRegx("1st Leg Confirmation # : QS-020043
			// 2nd Leg Confirmation # : QS-020044","([A-Z]+)(-)([0-9]+)");
			// Thread.sleep(30000);

			Calendar now = Calendar.getInstance();

			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			// String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			/*
			 * String sCurrentMonth = format2.split(";")[2]; String sCurrentYear
			 * = format2.split(";")[3];
			 */

			mobileAction.FuncClick(btnSendOrder, "btnSendOrder");

			mobileAction.verifyElementIsDisplayed(hdrReceipt, "Header Reciept");

			mobileAction.verifyElementIsDisplayed(lblThankYou, "label ThankYou");

			mobileAction.verifyElementIsDisplayed(orderPlacedMsg, "Order placed");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg1ConfirmationNumber), "([A-Z]+)(-)([0-9]+)");
				mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg2ConfirmationNumber), "([A-Z]+)(-)([0-9]+)");
			} else
				mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(legConfirmationNumber), "([A-Z]+)(-)([0-9]+)");

			mobileAction.verifyElementIsDisplayed(lblOrderDetails, "Order Details Header");

			mobileAction.verifyElementTextContains(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblOrderPlaced, "Order Placed");
			mobileAction.verifyElementTextContains(OrderPlacedDetails, sCurrentDate);

			mobileAction.verifyElementIsDisplayed(lbl1stLeg, "1st Leg");
			mobileAction.verifyElementTextContains(leg1Details, getTestdata("Action", XLSheetUserIDs) + " "
					+ getTestdata("Leg1Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lbl2ndLeg, "2nd Leg");
			mobileAction.verifyElementTextContains(leg2Details, getTestdata("Leg2Action2", XLSheetUserIDs) + " "
					+ getTestdata("Leg2Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(btn_ORDERS, false, 5, "up");
			String sTempPrice = TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			if (sTempPrice != "")
				mobileAction.verifyElementTextContains(price, getTestdata("Price", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblGoodTill, "Good till");
			mobileAction.FuncVerifyNonBlankValue(goodTill, "goodTill");

			String sShareHolder = getTestdata("ShareHolder", XLSheetUserIDs).trim();
			if (mobileAction.isObjExists(ShareholderType, 2) && sShareHolder != "") {
				mobileAction.verifyElementIsDisplayed(lblShareholderType, "Shareholder Type");
				if (!sShareHolder.contains("autre"))
					mobileAction.verifyElement(ShareholderType, sShareHolder);
				else
					mobileAction.verifyElementTextContains(ShareholderType, "autre");
			}

			mobileAction.verifyElementIsDisplayed(btn_home, "Home Button");

			mobileAction.verifyElementIsDisplayed(btn_trade, "Trade Button");

			mobileAction.verifyElementIsDisplayed(btn_ORDERS, "Orders Button");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionConfirmOrderReceipt() {
		Decorator();
		try {
			// mobileAction.FuncGetValByRegx("1st Leg Confirmation # : QS-020043
			// 2nd Leg Confirmation # : QS-020044","([A-Z]+)(-)([0-9]+)");
			// Thread.sleep(30000);

			Calendar now = Calendar.getInstance();

			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			// String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			/*
			 * String sCurrentMonth = format2.split(";")[2]; String sCurrentYear
			 * = format2.split(";")[3];
			 */
			mobileAction.FuncClick(btnSendOrder, "btnSendOrder");

			mobileAction.verifyElementIsDisplayed(hdrReceipt, "Header Reciept");

			mobileAction.verifyElementIsDisplayed(lblThankYou, "label ThankYou");

			mobileAction.verifyElementIsDisplayed(orderPlacedMsg, "Order placed");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg1ConfirmationNumber), "([A-Z]+)(-)([0-9]+)");
				mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg2ConfirmationNumber), "([A-Z]+)(-)([0-9]+)");
			} else
				mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(legConfirmationNumber), "([A-Z]+)(-)([0-9]+)");

			mobileAction.verifyElementIsDisplayed(lblOrderDetails, "Order Details Header");

			mobileAction.verifyElementTextContains(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblOrderPlaced, "Order Placed");
			mobileAction.verifyElementTextContains(OrderPlacedDetails, sCurrentDate);

			mobileAction.verifyElementIsDisplayed(lbl1stLeg, "1st Leg");
			mobileAction.verifyElementTextContains(leg1Details, getTestdata("Leg1Action2", XLSheetUserIDs) + " "
					+ getTestdata("Leg1Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lbl2ndLeg, "2nd Leg");
			mobileAction.verifyElementTextContains(leg2Details, getTestdata("Leg2Action2", XLSheetUserIDs) + " "
					+ getTestdata("Leg2Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(btn_ORDERS, false, 5, "up");
			String sTempPrice = TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			if (sTempPrice != "")
				mobileAction.verifyElementTextContains(price, getTestdata("Price", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblGoodTill, "Good till");
			mobileAction.FuncVerifyNonBlankValue(goodTill, "goodTill");

			String sShareHolder = getTestdata("ShareHolder", XLSheetUserIDs).trim();
			if (mobileAction.isObjExists(ShareholderType, 2) && sShareHolder != "") {
				mobileAction.verifyElementIsDisplayed(lblShareholderType, "Shareholder Type");
				if (!sShareHolder.contains("autre"))
					mobileAction.verifyElement(ShareholderType, sShareHolder);
				else
					mobileAction.verifyElementTextContains(ShareholderType, "autre");
			}

			mobileAction.verifyElementIsDisplayed(btn_home, "Home Button");

			mobileAction.verifyElementIsDisplayed(btn_trade, "Trade Button");

			mobileAction.verifyElementIsDisplayed(btn_ORDERS, "Orders Button");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickPostorderMyAccount() {

		Decorator();
		try {
			Thread.sleep(40000);
			mobileAction.FuncClick(MenuUp, "Menu Button");
			mobileAction.FuncClick(myAccounts, "My Accounts");

			mobileAction.verifyElementIsDisplayed(lblBanking, "On Clicking My Account Label Banking");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickPostorderTrade() {

		Decorator();
		try {

			mobileAction.FuncClick(MenuUp, "Menu Button");
			mobileAction.FuncClick(trade, "Trade");

			mobileAction.verifyElementIsDisplayed(lblAccount, "On Clicking Trade Label Account");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickQuickLinkHome() {

		Decorator();
		try {
			// Thread.sleep(40000);
			mobileAction.FuncSwipeWhileElementNotFound(btn_home, false, 5, "up");
			mobileAction.FuncClick(btn_home, "Home Button");
			mobileAction.verifyElementIsDisplayed(hdrHome, "On Clicking Quick Home Link Money button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickQuickLinkTrade() {

		Decorator();
		try {
			// Thread.sleep(40000);
			mobileAction.FuncSwipeWhileElementNotFound(btn_trade, false, 5, "up");
			mobileAction.FuncClick(btn_trade, "Trade Button");
			mobileAction.verifyElementIsDisplayed(lblAccount, " On Clicking Quick Trade Link Label Account");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickQuickLinkOrder() {

		Decorator();
		try {
			// Thread.sleep(40000);
			mobileAction.FuncSwipeWhileElementNotFound(btn_ORDERS, false, 5, "up");
			mobileAction.FuncClick(btn_ORDERS, "Trade Button");
			mobileAction.verifyElementIsDisplayed(ordersTab, " On Clicking Quick Order Link Orders Tab");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
