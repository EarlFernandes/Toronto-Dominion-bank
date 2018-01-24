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

public class MLConfirmOrder extends _CommonPage {
	private static MLConfirmOrder MLConfirmOrder;

	public synchronized static MLConfirmOrder get() {
		if (MLConfirmOrder == null) {
			MLConfirmOrder = new MLConfirmOrder();
		}
		return MLConfirmOrder;
	}

	private void Decorator() {
		PageFactory.initElements(

				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") // @Author -
																// Sushil
																// 21-Mar-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") // @Author -
																// Sushil
																// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/warning_text")
	private MobileElement warning_text;

	@iOSFindBy(xpath = "(//*[contains(@label,'EDT') or contains(@label,'EST') or contains(@label,'HNE') or contains(@label,'HAE')])[1]") // @Author
																				// -
																				// Sushil
																				// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/timestamp")
	private MobileElement timestamp;

	@iOSFindBy(xpath = " //*[contains(@label,'Account') or contains(@label,'Compte')]/../*[3]") // @Author
																								// -
																								// Sushil
																								// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/textview_account_number")
	private MobileElement account_number;

	@iOSFindBy(xpath = "//*[contains(@label,'1st Leg') or contains(@label,'1re Volet')]") // @Author
																							// -
																							// Sushil
																							// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re Volet')]")
	private MobileElement lbl1stLeg;

	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../*[2]") // @Author
																						// -
																						// Sushil
																						// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../*[2]/*[1]")
	private MobileElement leg1Details;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]") // @Author
																				// -
																				// Sushil
																				// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]")
	private MobileElement lbl2ndLeg;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../*[2]") // @Author
																						// -
																						// Sushil
																						// 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]/../*[2]/*[1]")
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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Estimated Principal') or contains(@label,'Principal estimé')]") // @Author
																																		// -
																																		// Sushil
																																		// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Estimated Principal') or contains(@text,'Principal estimé')]")
	private MobileElement lblEstimatedPrincipal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Estimated Principal') or contains(@label,'Principal estimé')]/../*[2]") // @Author
																																				// -
																																				// Sushil
																																				// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Principal')]/../*[2]/*[1]")
	private MobileElement estimatedPrincipal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Commission')]") // @Author
																						// -
																						// Sushil
																						// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Commission')]")
	private MobileElement lblCommission;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Commission')]/../*[2]") // @Author
																								// -
																								// Sushil
																								// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Commission')]/../*[2]/*[1]")
	private MobileElement Commission;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Estimated Total') or contains(@label,'Total estimé')]") // @Author
																																// -
																																// Sushil
																																// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Total') or contains(@label,'Total estimé')]")
	private MobileElement lblestimatedTotal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Total')]/../*[2]") // @Author
																						// -
																						// Sushil
																						// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Total')]/../*[2]/*[1]")
	private MobileElement estimatedTotal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Buying Power Required') or contains(@label,'Pouvoir d')]") // @Author
																																// -
																																// Sushil
																																// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Buying Power Required') or contains(@text,'Pouvoir d')]")
	private MobileElement lblPowerRequired;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Buying Power') or contains(@label,'Pouvoir d')]/../*[2]") // @Author
																																// -
																																// Sushil
																																// 21-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Buying Power') or contains(@text,'Pouvoir d')]/../*[2]/*[1]")
	private MobileElement buyingPowerRequired;

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

	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']") // @Author -
																	// Sushil
																	// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_cancel")
	private MobileElement btn_cancel;

	@iOSFindBy(xpath = "//*[@label='Send Order' or contains(@label,'Envoyer l')]") // @Author
																					// -
																					// Sushil
																					// 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement btnSendOrder;

	@iOSFindBy(xpath = "//*[@label='Important Information' or @label='Renseignements importants']") // @Author
																									// -
																									// Sushil
																									// 02-Mar-2017
	@AndroidFindBy(id = "com.td:id/importantInfoLink")
	private MobileElement importantInfoLink;

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
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=18]")
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
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=19]")
	private MobileElement firstAskPUTS;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Preview Order') or contains(@label,'Aperçu de')]") // @Author
																													// -
																													// Sushil
																													// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/orderEntryPreviewButton")
	private MobileElement previewOrderButton;

	@iOSFindBy(xpath = "//*[@label='Agree' or @label='Accepte']") // @Author -
																	// Sushil
																	// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/positiveButton")
	private MobileElement agreeButton;

	@iOSFindBy(xpath = "//*[@label='Agree' or @label='Accepte']") // @Author -
	// Sushil
	// 08-Feb-2017
	@AndroidFindBy(id = "com.tdbank:id/quick_link_item_layout_button")
	private MobileElement usQLAccounts;

	public void verifyStockOptionConfirmOrder() {
		Decorator();
		try {
			Calendar now = Calendar.getInstance();

			// System.out.println(now.getTime());
			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			// String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			/*
			 * String sCurrentMonth = format2.split(";")[2]; String sCurrentYear
			 * = format2.split(";")[3];
			 */

			mobileAction.verifyElementIsDisplayed(backButton, "backButton");
			// mobileAction.verifyElementTextContains(timestamp, sCurrentMonth +
			// " " + sCurrentDate + "," + sCurrentYear);

			mobileAction.verifyElementTextContains(timestamp, sCurrentDate);
			mobileAction.verifyElementTextContains(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lbl1stLeg, "1st Leg");
			mobileAction.verifyElement(leg1Details, getTestdata("Action", XLSheetUserIDs) + " "
					+ getTestdata("Leg1Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lbl2ndLeg, "2nd Leg");
			mobileAction.verifyElement(leg2Details, getTestdata("Leg2Action2", XLSheetUserIDs) + " "
					+ getTestdata("Leg2Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblPrice, "Price");
			mobileAction.verifyElementTextContains(price, getTestdata("Price", XLSheetUserIDs));

			String sTempPrice = TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			if (sTempPrice != "")
				mobileAction.verifyElementTextContains(price, getTestdata("SelectLimitPrice", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblGoodTill, "Good till");
			mobileAction.FuncVerifyNonBlankValue(goodTill, "goodTill");

			// mobileAction.FuncSwipeWhileElementNotFound(importantInfoLink,false,7,"up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.verifyElementIsDisplayed(lblEstimatedPrincipal, "Estimated Principal");
			mobileAction.FuncVerifyNonBlankValue(estimatedPrincipal, "estimatedPrincipal");

			mobileAction.verifyElementIsDisplayed(lblCommission, "Commission");
			mobileAction.FuncVerifyNonBlankValue(Commission, "Commission");

			mobileAction.verifyElementIsDisplayed(lblestimatedTotal, "Estimated Total");
			mobileAction.FuncVerifyNonBlankValue(estimatedTotal, "estimatedTotal");

			// Shareholder
			String sShareHolder = getTestdata("ShareHolder", XLSheetUserIDs).trim();
			if (mobileAction.isObjExists(ShareholderType, 2) && sShareHolder != "") {
				mobileAction.verifyElementIsDisplayed(lblShareholderType, "Shareholder Type");
				if (!sShareHolder.contains("autre"))
					mobileAction.verifyElement(ShareholderType, sShareHolder);
				else
					mobileAction.verifyElementTextContains(ShareholderType, "autre");
			}

			if (mobileAction.isObjExists(buyingPowerRequired, 2)) {
				mobileAction.verifyElementIsDisplayed(lblPowerRequired, "Buying Power Required");
				mobileAction.FuncVerifyNonBlankValue(buyingPowerRequired, "buyingPowerRequired");
			}

			mobileAction.verifyElementIsDisplayed(btn_cancel, "btn_cancel");
			mobileAction.verifyElementIsDisplayed(btnSendOrder, "btnSendOrder");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionConfirmOrder() {
		Decorator();
		try {
			Calendar now = Calendar.getInstance();

			// System.out.println(now.getTime());
			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			/*
			 * String sCurrentMonth = format2.split(";")[2]; String sCurrentYear
			 * = format2.split(";")[3];
			 */
			// Thread.sleep(100000);

			mobileAction.verifyElementIsDisplayed(backButton, "backButton");
			// mobileAction.verifyElementTextContains(timestamp, sCurrentMonth +
			// " " + sCurrentDate + "," + sCurrentYear);
			mobileAction.verifyElementTextContains(timestamp, sCurrentDate);
			mobileAction.verifyElementTextContains(account_number, getTestdata("Accounts", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lbl1stLeg, "1st Leg");
			mobileAction.verifyElementTextContains(leg1Details, getTestdata("Leg1Action2", XLSheetUserIDs) + " "
					+ getTestdata("Leg1Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lbl2ndLeg, "2nd Leg");
			mobileAction.verifyElementTextContains(leg2Details, getTestdata("Leg2Action2", XLSheetUserIDs) + " "
					+ getTestdata("Leg2Qunatity", XLSheetUserIDs) + " " + getTestdata("Symbol", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblPrice, "Price");
			mobileAction.verifyElementTextContains(price, getTestdata("Price", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblPrice, "Price");
			mobileAction.verifyElementTextContains(price, getTestdata("Price", XLSheetUserIDs));

			String sTempPrice = TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			if (sTempPrice != "")
				mobileAction.verifyElementTextContains(price, getTestdata("SelectLimitPrice", XLSheetUserIDs));

			mobileAction.verifyElementIsDisplayed(lblGoodTill, "Good till");
			mobileAction.FuncVerifyNonBlankValue(goodTill, "goodTill");

			// mobileAction.FuncSwipeWhileElementNotFound(importantInfoLink,false,7,"up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");

			mobileAction.verifyElementIsDisplayed(lblEstimatedPrincipal, "Estimated Principal");
			mobileAction.FuncVerifyNonBlankValue(estimatedPrincipal, "estimatedPrincipal");

			mobileAction.verifyElementIsDisplayed(lblCommission, "Commission");
			mobileAction.FuncVerifyNonBlankValue(Commission, "Commission");

			mobileAction.verifyElementIsDisplayed(lblestimatedTotal, "Estimated Total");
			mobileAction.FuncVerifyNonBlankValue(estimatedTotal, "estimatedTotal");

			// Shareholder
			String sShareHolder = getTestdata("ShareHolder", XLSheetUserIDs).trim();
			if (mobileAction.isObjExists(ShareholderType, 2) && sShareHolder != "") {
				mobileAction.verifyElementIsDisplayed(lblShareholderType, "Shareholder Type");
				if (!sShareHolder.contains("autre"))
					mobileAction.verifyElement(ShareholderType, sShareHolder);
				else
					mobileAction.verifyElementTextContains(ShareholderType, "autre");
			}

			if (mobileAction.isObjExists(buyingPowerRequired, 2)) {
				mobileAction.verifyElementIsDisplayed(lblPowerRequired, "Buying Power Required");
				mobileAction.FuncVerifyNonBlankValue(buyingPowerRequired, "buyingPowerRequired");
			}

			mobileAction.verifyElementIsDisplayed(btn_cancel, "btn_cancel");
			mobileAction.verifyElementIsDisplayed(btnSendOrder, "btnSendOrder");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Test() {
		Decorator();
		try {
			usQLAccounts.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println(CL.GetDriver().getPageSource());

	}
}
