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

public class MLOrderDetails extends _CommonPage {

	private static MLOrderDetails MLOrderDetails;

	public synchronized static MLOrderDetails get() {
		if (MLOrderDetails == null) {
			MLOrderDetails = new MLOrderDetails();
		}
		return MLOrderDetails;
	}

	private void Decorator() {
		PageFactory.initElements(

				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	@iOSFindBy(xpath = " //*[contains(@label,'ACCOUNTS') or contains(@label,'COMPTES')]") // @Author
																							// -
																							// Sushil
																							// 06-Feb-2017
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/selectedText' and
	// @index='0']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView']")
	private MobileElement lblACCOUNTS;

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

	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[1]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re Volet')]")
	private MobileElement latestOrder;

	@iOSFindBy(xpath = "//*[@label='Change Order' or contains(@label,'Modifier')]") // @Author
																					// -
																					// Sushil
																					// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/change_order_btn")
	private MobileElement btn_change;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trading Password' or @label='Mot de passe de négociation']/../XCUIElementTypeSecureTextField[1]") // @Author
																																								// -
																																								// Sushil
																																								// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/editTextPassword")
	private MobileElement editTextPassword;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Précédent']") // @Author -
																	// Sushil
																	// 07-Mar-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButton;

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

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Order Details' or contains(@label,'Détails de')]") // @Author
																											// -
																											// Sushil
																											// 29-Mar-2017
	@AndroidFindBy(xpath = "//*[(@text='Order Details' or contains(@text,'Détails de')) and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrOrderDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Refresh' or @label='Actualiser']") // @Author
																							// -
																							// Sushil
																							// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/refresh_menu")
	private MobileElement refreshButton;

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

	@iOSFindBy(xpath = "//*[contains(@label,'1st Leg') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[1]/*[1]") // @Author
																																		// -
																																		// Sushil
																																		// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re')]/../following-sibling::*/*/*[1]")
	private MobileElement lbl1stLegActQnt;

	@iOSFindBy(xpath = "//*[@label='1st Leg' or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[1]/*[2]") // @Author
																															// -
																															// Sushil
																															// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='1st Leg' or @text='1re Volet']/../following-sibling::*/*/*[2]/*[1]")
	private MobileElement leg1ActQntDetails;

	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[2]/*[1]") // @Author
																																	// -
																																	// Sushil
																																	// 16-Feb-2017
	@AndroidFindBy(xpath = "(//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*/*[1])[2]")
	private MobileElement lblleg1QuantityFilled;

	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[2]/*[2]") // @Author
																																	// -
																																	// Sushil
																																	// 16-Feb-2017
	@AndroidFindBy(xpath = "(//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*/*[2]/*[1])[2]")
	private MobileElement leg1QuantityFilled;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation') or contains(@label,'confirmation')]/../following-sibling::XCUIElementTypeCell[3]/*[1]") // @Author
																																					// -
																																					// Sushil
																																					// 21-Mar-2017
	@AndroidFindBy(xpath = "(//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*/*[1])[3]")
	private MobileElement lblleg1ConfirmationNumber;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation') or contains(@label,'confirmation')]/../following-sibling::XCUIElementTypeCell[3]/*[2]") // @Author
																																					// -
																																					// Sushil
																																					// 21-Mar-2017
	@AndroidFindBy(xpath = "(//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*/*[2]/*[1])[3]")
	private MobileElement leg1ConfirmationNumberDeatils;

	@iOSFindBy(xpath = "//*[@label='2nd Leg' or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[1]/*[1]") // @Author
																															// -
																															// Sushil
																															// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='2nd Leg' or @text='2e Volet']/../following-sibling::*/*/*[1]")
	private MobileElement lbl2ndlegActQnt;

	@iOSFindBy(xpath = "//*[@label='2nd Leg' or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[1]/*[2]") // @Author
																															// -
																															// Sushil
																															// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='2nd Leg' or @text='2e Volet']/../following-sibling::*/*/*[2]/*[1]")
	private MobileElement leg2ActQntDetails;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[2]/*[1]") // @Author
																																	// -
																																	// Sushil
																																	// 16-Feb-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "(//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*/*[1])[2]")
	private MobileElement lblleg2QuantityFilled;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[2]/*[2]") // @Author
																																	// -
																																	// Sushil
																																	// 16-Feb-2017
	// @AndroidFindBy(xpath = "//*[contains(@text,'1st') or
	// contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	@AndroidFindBy(xpath = "(//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*/*[2]/*[1])[2]")
	private MobileElement leg2QuantityFilled;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation') or contains(@label,'confirmation')]") // @Author
																									// -
																									// Sushil
																									// 21-Mar-2017
	@AndroidFindBy(xpath = "(//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*/*[1])[3]")
	// @AndroidFindBy(id = "com.td:id/confirmation2_val")
	private MobileElement lblleg2ConfirmationNumber;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation') or contains(@label,'confirmation')]/../following-sibling::XCUIElementTypeCell[3]/*[2]") // @Author
																																					// -
																																					// Sushil
																																					// 21-Mar-2017
	@AndroidFindBy(xpath = "(//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*/*[2]/*[1])[3]")
	// @AndroidFindBy(id = "com.td:id/confirmation2_val")
	private MobileElement leg2ConfirmationNumber;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']/../*[2]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']/../*[2]/*[1]")
	private MobileElement price;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder Type') or contains(@label,'Type d')]/../*[2]") // @Author
																																// -
																																// Sushil
																																// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Shareholder Type') or contains(@text,'Type d')]/../*[2]/*[1]")
	private MobileElement ShareholderType;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder Type') or contains(@label,'Type d')]") // @Author
																														// -
																														// Sushil
																														// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Shareholder Type') or contains(@text,'Type d')]")
	private MobileElement lblShareholderType;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']/../*[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']")
	// @AndroidFindBy(xpath="//android.widget.TextView[@text='Price' or
	// @text='Cours']/../android.widget.TextView[@index=1]")
	private MobileElement lblprice;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']/../*[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price' or @text='Cours']/../android.widget.TextView[@index=1]")
	private MobileElement priceDetails;

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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Status') or contains(@label,'État')]") // @Author
																											// -
																											// Sushil
																											// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Status') or contains(@text,'État')]")
	private MobileElement lblOrderStatus;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Status') or contains(@label,'État')]/../*[2]") // @Author
																													// -
																													// Sushil
																													// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Status') or contains(@text,'État')]/../*[2]/*[1]")
	private MobileElement OrderStatus;

	@iOSFindBy(xpath = "//*[contains(@label,'Order Placed') or contains(@label,'Ordre pass')]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Order Placed') or contains(@text,'Ordre pass')]")
	private MobileElement lblOrderPlaced;

	// XCUIElementTypeStaticText[contains(@label,'Good') or
	// contains(@label,'Échéance')]/../*[2]
	@iOSFindBy(xpath = "//*[contains(@label,'Order Placed') or contains(@label,'Ordre passé')]/../*[2]") // @Author
																											// -
																											// Sushil
																											// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Order Placed') or contains(@text,'Ordre pass')]/../*[2]/*[1]")
	private MobileElement OrderPlacedDetails;

	@iOSFindBy(xpath = "//*[@label='Cancel Order' or contains(@label,'Annuler')]") // @Author
																					// -
																					// Sushil
																					// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/change_order_btn")
	private MobileElement btn_cancel;

	public void verifyStockOptionOrderDetails()

	{
		Decorator();
		try {

			Calendar now = Calendar.getInstance();

			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			// String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			String sCurrentMonth = format2.split(";")[2];
			// String sCurrentYear = format2.split(";")[3];

			/*
			 * mobileAction.waitForElement(lblACCOUNTS);
			 * mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,
			 * true,60,"up");
			 */

			/*
			 * mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");
			 * mobileAction.FuncClick(ordersTab, "Orders Tab");
			 */

			mobileAction.FuncSwipeWhileElementNotFound(latestOrder, false, 7, "up");
			mobileAction.FuncClick(latestOrder, "Select latest Order");

			mobileAction.verifyElementIsDisplayed(backButton, "Back Button");

			mobileAction.verifyElementIsDisplayed(hdrOrderDetails, "Title Trade");

			mobileAction.verifyElementIsDisplayed(refreshButton, "Refresh Button");

			mobileAction.FuncClick(refreshButton, "Refresh Button");
			mobileAction.verifyElementTextContains(timestamp, sCurrentDate);

			mobileAction.FuncVerifyNonBlankValue(account_type, "account_type");

			mobileAction.FuncVerifyNonBlankValue(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(Quote_Symbol, "Quote_Symbol");
			mobileAction.verifyElementIsDisplayed(Quote_description, "Quote_description");
			mobileAction.verifyElementTextContains(Quote_txt_price, "$");
			mobileAction.verifyElementTextContains(quote_profloss, "$");
			mobileAction.verifyElementTextContains(quote_profloss_percent, "%");

			mobileAction.FuncSwipeWhileElementNotFound(lbl1stLegActQnt, false, 5, "up");

			mobileAction.verifyElementIsDisplayed(lbl1stLegActQnt, "lbl1stLegActQnt");
			mobileAction.verifyElementTextContains(leg1ActQntDetails, getTestdata("Action", XLSheetUserIDs) + " "
					+ getTestdata("Leg1Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblleg1QuantityFilled, "lblleg1QuantityFilled");
			mobileAction.FuncVerifyNonBlankValue(leg1QuantityFilled, "leg1QuantityFilled");

			mobileAction.FuncSwipeWhileElementNotFound(lblleg1ConfirmationNumber, false, 5, "up");

			mobileAction.verifyElementIsDisplayed(lblleg1ConfirmationNumber, "lblleg1ConfirmationNumber");

			mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg1ConfirmationNumberDeatils),
					"([A-Z]+)(-)([0-9]+)");

			/*
			 * String scomfr =
			 * mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(
			 * leg1ConfirmationNumberDeatils),"([A-Z])(-)([0-9])");
			 * 
			 * String snum = format2.split("-")[2];
			 * mobileAction.verifyElementTextContains(OrderPlacedDetails,
			 * sCurrentDate);
			 */

			mobileAction.FuncSwipeWhileElementNotFound(leg2ConfirmationNumber, false, 5, "up");
			mobileAction.verifyElementIsDisplayed(lbl2ndlegActQnt, "lbl2ndlegActQnt");
			mobileAction.verifyElementTextContains(leg2ActQntDetails, getTestdata("Leg2Action2", XLSheetUserIDs) + " "
					+ getTestdata("Leg2Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblleg2QuantityFilled, "lblleg2QuantityFilled");
			mobileAction.FuncVerifyNonBlankValue(leg2QuantityFilled, "leg2QuantityFilled");

			mobileAction.verifyElementIsDisplayed(lblleg2ConfirmationNumber, "lblleg2ConfirmationNumber");
			mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg2ConfirmationNumber), "([A-Z]+)(-)([0-9]+)");

			mobileAction.FuncSwipeWhileElementNotFound(price, false, 5, "up");
			/*
			 * String sTempPrice =
			 * TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			 * if(sTempPrice!="")
			 * mobileAction.verifyElementTextContains(price,getTestdata(
			 * "SelectLimitPrice",XLSheetUserIDs));
			 */

			String sTempPrice = "";
			if (mobileAction.FuncGetText(price).equalsIgnoreCase("Even")
					|| mobileAction.FuncGetText(price).equalsIgnoreCase("Pair")) {
				// Do nothing
			} else {
				sTempPrice = TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
				if (sTempPrice != "")
					mobileAction.verifyElementTextContains(price, getTestdata("SelectLimitPrice", XLSheetUserIDs));
			}

			mobileAction.FuncSwipeWhileElementNotFound(OrderPlacedDetails, false, 5, "up");
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

			mobileAction.FuncSwipeOnce("up");
			mobileAction.verifyElementIsDisplayed(lblOrderStatus, "lblOrderStatus");
			// mobileAction.FuncVerifyNonBlankValue(OrderStatus, "OrderStatus");
			mobileAction.verifyElementTextContains(OrderStatus, getTestdata("OrderStatus", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblOrderPlaced, "Order Placed");
			mobileAction.verifyElementTextContains(OrderPlacedDetails, sCurrentDate);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void verifyOptionOptionOrderDetails()

	{
		Decorator();
		try {

			Calendar now = Calendar.getInstance();

			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			// String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			String sCurrentMonth = format2.split(";")[2];
			String sCurrentYear = format2.split(";")[3];

			/*
			 * mobileAction.waitForElement(lblACCOUNTS);
			 * mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,
			 * true,60,"up");
			 * 
			 * mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");
			 * mobileAction.FuncClick(ordersTab, "Orders Tab");
			 */

			mobileAction.FuncSwipeWhileElementNotFound(latestOrder, false, 7, "up");
			mobileAction.FuncClick(latestOrder, "Select latest Order");

			mobileAction.verifyElementIsDisplayed(backButton, "Back Button");

			mobileAction.verifyElementIsDisplayed(hdrOrderDetails, "Title Trade");

			mobileAction.verifyElementIsDisplayed(refreshButton, "Refresh Button");

			mobileAction.FuncClick(refreshButton, "Refresh Button");
			mobileAction.verifyElementTextContains(timestamp, sCurrentDate);

			mobileAction.FuncVerifyNonBlankValue(account_type, "account_type");

			mobileAction.FuncVerifyNonBlankValue(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(Quote_Symbol, "Quote_Symbol");
			mobileAction.verifyElementIsDisplayed(Quote_description, "Quote_description");
			mobileAction.verifyElementTextContains(Quote_txt_price, "$");
			mobileAction.verifyElementTextContains(quote_profloss, "$");
			mobileAction.verifyElementTextContains(quote_profloss_percent, "%");

			mobileAction.FuncSwipeWhileElementNotFound(lbl1stLegActQnt, false, 5, "up");

			mobileAction.verifyElementIsDisplayed(lbl1stLegActQnt, "lbl1stLegActQnt");
			mobileAction.verifyElementTextContains(leg1ActQntDetails, getTestdata("Leg1Action2", XLSheetUserIDs) + " "
					+ getTestdata("Leg1Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblleg1QuantityFilled, "lblleg1QuantityFilled");
			mobileAction.FuncVerifyNonBlankValue(leg1QuantityFilled, "leg1QuantityFilled");

			mobileAction.FuncSwipeWhileElementNotFound(lblleg1ConfirmationNumber, false, 5, "up");

			mobileAction.verifyElementIsDisplayed(lblleg1ConfirmationNumber, "lblleg1ConfirmationNumber");

			mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg1ConfirmationNumberDeatils),
					"([A-Z]+)(-)([0-9]+)");

			/*
			 * String scomfr =
			 * mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(
			 * leg1ConfirmationNumberDeatils),"([A-Z])(-)([0-9])");
			 * 
			 * String snum = format2.split("-")[2];
			 * mobileAction.verifyElementTextContains(OrderPlacedDetails,
			 * sCurrentDate);
			 */

			mobileAction.FuncSwipeWhileElementNotFound(leg2ConfirmationNumber, false, 5, "up");
			mobileAction.verifyElementIsDisplayed(lbl2ndlegActQnt, "lbl2ndlegActQnt");
			mobileAction.verifyElementTextContains(leg2ActQntDetails, getTestdata("Leg2Action2", XLSheetUserIDs) + " "
					+ getTestdata("Leg2Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblleg2QuantityFilled, "lblleg2QuantityFilled");
			mobileAction.FuncVerifyNonBlankValue(leg2QuantityFilled, "leg2QuantityFilled");

			mobileAction.verifyElementIsDisplayed(lblleg2ConfirmationNumber, "lblleg2ConfirmationNumber");
			mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg2ConfirmationNumber), "([A-Z]+)(-)([0-9]+)");

			mobileAction.FuncSwipeWhileElementNotFound(price, false, 5, "up");
			/*
			 * String sTempPrice =
			 * TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			 * if(sTempPrice!="")
			 * mobileAction.verifyElementTextContains(price,getTestdata(
			 * "SelectLimitPrice",XLSheetUserIDs));
			 */

			String sTempPrice = "";
			if (mobileAction.FuncGetText(price).equalsIgnoreCase("Even")
					|| mobileAction.FuncGetText(price).equalsIgnoreCase("Pair")) {
				// Do nothing
			} else {
				sTempPrice = TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
				if (sTempPrice != "")
					mobileAction.verifyElementTextContains(price, getTestdata("SelectLimitPrice", XLSheetUserIDs));
			}

			mobileAction.FuncSwipeWhileElementNotFound(OrderPlacedDetails, false, 5, "up");
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

			mobileAction.FuncSwipeOnce("up");
			mobileAction.verifyElementIsDisplayed(lblOrderStatus, "lblOrderStatus");
			mobileAction.FuncVerifyNonBlankValue(OrderStatus, "OrderStatus");

			mobileAction.verifyElementIsDisplayed(lblOrderPlaced, "Order Placed");
			mobileAction.verifyElementTextContains(OrderPlacedDetails, sCurrentDate);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void verifyChangeCancelButton()

	{
		Decorator();
		try {

			mobileAction.waitForElement(lblACCOUNTS);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");

			mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");
			mobileAction.FuncClick(ordersTab, "Orders Tab");

			mobileAction.FuncSwipeWhileElementNotFound(latestOrder, false, 7, "up");
			mobileAction.FuncClick(latestOrder, "Select latest Order");

			mobileAction.verifyElementIsDisplayed(backButton, "");

		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

}
