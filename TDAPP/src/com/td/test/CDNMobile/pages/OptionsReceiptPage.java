package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OptionsReceiptPage extends _CommonPage {

	private static OptionsReceiptPage OptionsReceiptPage;

	public synchronized static OptionsReceiptPage get() {
		if (OptionsReceiptPage == null) {
			OptionsReceiptPage = new OptionsReceiptPage();
		}
		return OptionsReceiptPage;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(7, TimeUnit.SECONDS)),
				this);

	}

	@iOSFindBy(xpath = "//*[@label='Orders' or @label='Ordres']") // @Author -
																	// Sushil
																	// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_order")
	private MobileElement btn_ORDERS;

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

	@iOSFindBy(xpath = "//*[contains(@label,'Receipt') or contains(@label,'Reçu')]") // @Author
																						// -
																						// Sushil
																						// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Receipt') or contains(@text,'Reçu')]")
	private MobileElement hdrReceipt;

	@iOSFindBy(xpath = "//*[@label='Send Order' or contains(@label,'Envoyer l')]") // @Author
																					// -
																					// Sushil
																					// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement btnSendOrder;

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

	@iOSFindBy(xpath = "//*[@label='Your request to cancel the order was received.' or contains(@label,'Demande')]") // @Author
																														// -
																														// Sushil
																														// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='Your request to cancel the order was received.' or contains(@text,'Demande')]")
	private MobileElement orderCanceldMsg;

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

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation') or contains(@label,'confirmation')]") // @Author
																									// -
																									// Sushil
																									// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='Confirmation' or contains(@text,'confirmation')]")
	private MobileElement ConfirmationNumber;

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
	private MobileElement OrderPlaced;

	@iOSFindBy(xpath = "//*[contains(@label,'Order Placed') or contains(@label,'Ordre pass')]/../*[2]") // @Author
																										// -
																										// Sushil
																										// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Order Placed') or contains(@text,'Ordre pass')]/../*[2]/*[1]")
	private MobileElement OrderPlacedDetails;

	@iOSFindBy(xpath = "//*[contains(@label,'Order') or contains(@label,'ordre')]") // @Author
																					// -
																					// Sushil
																					// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Order') or contains(@text,'ordre')]")
	private MobileElement Order;

	@iOSFindBy(xpath = "//*[@label='Order' or @label='ordre']/../*[2]") // @Author
																		// -
																		// Sushil
																		// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='Order' or @text='ordre']/../*[2]/*[1]")
	private MobileElement OrderDetails;

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

	@iOSFindBy(xpath = "//*[contains(@label,'Order') or contains(@label,'ordre')]") // @Author
																					// -
																					// Sushil
																					// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Order') or contains(@text,'ordre')]")
	private MobileElement lbl1stLeg;

	@iOSFindBy(xpath = "//*[@label='Order' or @label='ordre']/../*[2]") // @Author
																		// -
																		// Sushil
																		// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='Order' or @text='ordre']/../*[2]/*[1]")
	private MobileElement leg1Details;

	@iOSFindBy(xpath = "//*[contains(@label,'Order Placed') or contains(@label,'Ordre pass')]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Order Placed') or contains(@text,'Ordre pass')]")
	private MobileElement lblOrderPlaced;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Cancel Order') or contains(@label,'Annuler l')]") // @Author
																													// -
																													// Sushil
																													// 21-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Cancel Order') or contains(@text,'Annuler l')]")
	private MobileElement btnCancelOrder;

	public void verifyOptionOrderReceipt() {
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
			mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(ConfirmationNumber), "([A-Z]+)(-)([0-9]+)");

			mobileAction.verifyElementIsDisplayed(lblOrderDetails, "Order Details Header");

			mobileAction.verifyElementTextContains(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(OrderPlaced, "Order Placed");
			mobileAction.verifyElementTextContains(OrderPlacedDetails, sCurrentDate);

			mobileAction.verifyElementIsDisplayed(Order, "1st Leg");
			mobileAction.verifyElementTextContains(OrderDetails, getTestdata("Action", XLSheetUserIDs) + " "
					+ getTestdata("Quantity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(btn_ORDERS, false, 5, "up");
			/*
			 * String sTempPrice =
			 * TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			 * if(sTempPrice!="")
			 * mobileAction.verifyElementTextContains(price,getTestdata(
			 * "SelectLimitPrice",XLSheetUserIDs));
			 */

			/*
			 * mobileAction.verifyElementIsDisplayed(lblGoodTill, "Good till");
			 * mobileAction.FuncVerifyNonBlankValue(goodTill, "goodTill");
			 */

			// String sShareHolder =
			// getTestdata("ShareHolder",XLSheetUserIDs).trim();
			/*
			 * if(mobileAction.isObjExists(ShareholderType, 2) &&
			 * sShareHolder!="") {
			 * mobileAction.verifyElementIsDisplayed(lblShareholderType,
			 * "Shareholder Type"); if(!sShareHolder.contains("autre"))
			 * mobileAction.verifyElement(ShareholderType, sShareHolder); else
			 * mobileAction.verifyElementTextContains(ShareholderType, "autre");
			 * }
			 */

			mobileAction.verifyElementIsDisplayed(btn_home, "Home Button");

			mobileAction.verifyElementIsDisplayed(btn_trade, "Trade Button");

			mobileAction.verifyElementIsDisplayed(btn_ORDERS, "Orders Button");
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

	public void verifyOptionCancelOrderReceipt() {
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

			mobileAction.FuncClick(btnCancelOrder, "btnCancelOrder");

			mobileAction.verifyElementIsDisplayed(hdrReceipt, "Header Reciept");

			mobileAction.verifyElementIsDisplayed(lblThankYou, "label ThankYou");

			mobileAction.verifyElementIsDisplayed(orderCanceldMsg, "Order placed");
			mobileAction.verifyElementIsDisplayed(lblOrderDetails, "Order Details Header");

			mobileAction.verifyElementTextContains(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(OrderPlaced, "Order Placed");
			mobileAction.verifyElementTextContains(OrderPlacedDetails, sCurrentDate);

			mobileAction.verifyElementIsDisplayed(Order, "1st Leg");
			mobileAction.verifyElementTextContains(OrderDetails, getTestdata("Action", XLSheetUserIDs) + " "
					+ getTestdata("Quantity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.FuncSwipeWhileElementNotFound(btn_ORDERS, false, 5, "up");
			/*
			 * String sTempPrice =
			 * TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			 * if(sTempPrice!="")
			 * mobileAction.verifyElementTextContains(price,getTestdata(
			 * "SelectLimitPrice",XLSheetUserIDs));
			 */

			/*
			 * mobileAction.verifyElementIsDisplayed(lblGoodTill, "Good till");
			 * mobileAction.FuncVerifyNonBlankValue(goodTill, "goodTill");
			 */

			// String sShareHolder =
			// getTestdata("ShareHolder",XLSheetUserIDs).trim();
			/*
			 * if(mobileAction.isObjExists(ShareholderType, 2) &&
			 * sShareHolder!="") {
			 * mobileAction.verifyElementIsDisplayed(lblShareholderType,
			 * "Shareholder Type"); if(!sShareHolder.contains("autre"))
			 * mobileAction.verifyElement(ShareholderType, sShareHolder); else
			 * mobileAction.verifyElementTextContains(ShareholderType, "autre");
			 * }
			 */

			mobileAction.verifyElementIsDisplayed(btn_home, "Home Button");

			mobileAction.verifyElementIsDisplayed(btn_trade, "Trade Button");

			mobileAction.verifyElementIsDisplayed(btn_ORDERS, "Orders Button");
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

	public void verifyOptionConfirmOrderReceipt() {
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
				mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(ConfirmationNumber), "([A-Z]+)(-)([0-9]+)");

			mobileAction.verifyElementIsDisplayed(lblOrderDetails, "Order Details Header");

			mobileAction.verifyElementTextContains(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblOrderPlaced, "Order Placed");
			mobileAction.verifyElementTextContains(OrderPlacedDetails, sCurrentDate);

			mobileAction.verifyElementIsDisplayed(lbl1stLeg, "1st Leg");
			mobileAction.verifyElementTextContains(leg1Details, getTestdata("Action", XLSheetUserIDs) + " "
					+ getTestdata("Leg1Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			/*
			 * mobileAction.verifyElementIsDisplayed(lbl2ndLeg, "2nd Leg");
			 * mobileAction.verifyElementTextContains(leg2Details,
			 * getTestdata("Leg2Action2",XLSheetUserIDs) + " " +
			 * getTestdata("Leg2Qunatity",XLSheetUserIDs) + " " +
			 * getTestdata("Symbol",XLSheetUserIDs));
			 */

			mobileAction.FuncSwipeWhileElementNotFound(btn_ORDERS, false, 5, "up");
			/*
			 * String sTempPrice =
			 * TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			 * if(sTempPrice!="")
			 * mobileAction.verifyElementTextContains(price,getTestdata(
			 * "SelectLimitPrice",XLSheetUserIDs));
			 */

			/*
			 * mobileAction.verifyElementIsDisplayed(lblGoodTill, "Good till");
			 * mobileAction.FuncVerifyNonBlankValue(goodTill, "goodTill");
			 */

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
}