package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.MainScreenMIT;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MLOptionChainTable extends _CommonPage {
	private static MLOptionChainTable MLOptionChainTable;

	public synchronized static MLOptionChainTable get() {
		if (MLOptionChainTable == null) {
			MLOptionChainTable = new MLOptionChainTable();
		}
		return MLOptionChainTable;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

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

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Expiry Type,Monthly' or contains(@label,'Chaque mois')]") // @Author
																													// -
																													// Sushil
																													// 03-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Monthly' or @text='Chaque mois']")
	private MobileElement defaultExpiryType;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Strikes,6' or @label='Levées,6']") // @Author
																							// -
																							// Sushil
																							// 03-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='6']")
	private MobileElement defaultStrikes;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='All' or @label='Tous']") // @Author
																						// -
																						// Sushil
																						// 03-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='All' or @text='Tous']")
	private MobileElement defaultOptionType;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Expiry Type') or contains(@label,'expiration')]") // @Author
																														// -
																														// Sushil
																														// 03-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Expiry Type' or contains(@text,'expiration')]/../*[2]")
	private MobileElement ExpiryType;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Strikes') or contains(@label,'Levées')]") // @Author
																												// -
																												// Sushil
																												// 03-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Strikes' or @text='Levées']/../*[2]")
	private MobileElement Strikes;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='All' or @label='Tous']") // @Author
																						// -
																						// Sushil
																						// 03-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='All' or @text='Tous']")
	private MobileElement OptionType;

	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell/*") // @Author
																															// -
																															// Sushil
																															// 16-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	private MobileElement leg1Option;

	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell/*") // @Author
																															// -
																															// Sushil
																															// 17-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	private MobileElement leg2Option;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue')]") // @Author
																				// -
																				// Sushil
																				// 17-Feb-2017
	@AndroidFindBy(id = "com.td:id/button_select_option_continue")
	private MobileElement Continue;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Preview Order') or contains(@label,'Aperçu de')]") // @Author
																													// -
																													// Sushil
																													// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/orderEntryPreviewButton")
	private MobileElement previewOrderButton;

	@iOSFindBy(xpath = "//*[@label='Agree' or @label='Accepte']") // @Author -
																	// Sushil
																	// 08-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Agree' or @text='Accepte']")
	private MobileElement agreeButton;

	@iOSFindBy(xpath = "//*[@label='Do not agree' or contains(@label,'accepte pas')]") // @Author
																						// -
																						// Sushil
																						// 08-Feb-2017
	@AndroidFindBy(id = "com.td:id/negativeButton")
	private MobileElement doNotAgreeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Confirm Order' or contains(@label,'Confirmer l')]") // @Author
																											// -
																											// Sushil
																											// 08-Feb-2017
	@AndroidFindBy(xpath = "//*[(@text='Confirm Order' or contains(@text,'Confirmer l')) and @resource-id='android:id/action_bar_title']")
	private MobileElement titleConfirmOrder;

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

	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']") // @Author
																		// -
																		// Sushil
																		// 23-Mar-2017
	@AndroidFindBy(id = "com.td:id/btn_trade")
	private MobileElement btn_trade;

	@iOSFindBy(xpath = "//*[contains(@label,'Type')]/../*[2]") // @Author -
																// Sushil
																// 20-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Type')]/../*[@resource-id='com.td:id/selectedText']")
	private MobileElement selectedOrderType;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back' or @label='Retour']") // @Author
																					// -
																					// Sushil
																					// 07-Mar-2017
	@AndroidFindBy(id = "android:id/up")
	private MobileElement backButtonOptionTable;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Refresh' or @label='Actualiser']") // @Author
																							// -
																							// Sushil
																							// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/refresh_menu")
	private MobileElement refreshButton;

	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']") // @Author -
																	// Sushil
																	// 08-Feb-2017
	@AndroidFindBy(id = "android:id/button2")
	private MobileElement cancelButton;

	public void verifyStockOptionChainTableSubmit() {
		String sPreviousVal = "";
		String sCurrentVal = "";
		Decorator();
		try {
			String arrExpiryType = getTestdata("ExpiryType", XLSheetUserIDs);
			String arrOptionType = getTestdata("OptionType", XLSheetUserIDs);
			String arrStrikes = getTestdata("Strikes", XLSheetUserIDs);

			TradeMultiLeg.get().fillStockOptionOrder(firstAskPUTS, "firstAskPUTS");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// Do nothing
			} else {
				mobileAction.FuncClick(refreshButton, "refreshButton");
				mobileAction.FuncClick(refreshButton, "refreshButton");
			}

			// Leg2 Option Table Display
			Decorator();
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, true, 5, "down");

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(firstAskPUTS, false,
			 * 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskPUTS);

			sPreviousVal = mobileAction.FuncGetText(firstAskPUTS);
			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(defaultExpiryType,
			 * false, 5, "down"); mobileAction.FuncSwipeOnce("down");
			 */
			// mobileAction.FunctionSwipe("down", 200, 200);
			mobileAction.FuncSwipeDownTillScreenTop(defaultExpiryType);

			mobileAction.selectItemFromList(defaultExpiryType, arrExpiryType);
			mobileAction.selectItemFromList(defaultOptionType, arrOptionType);
			mobileAction.selectItemFromList(defaultStrikes, arrStrikes);

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(firstAskPUTS, false,
			 * 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskPUTS);

			sCurrentVal = mobileAction.FuncGetText(firstAskPUTS);
			mobileAction.FuncClick(firstAskPUTS, "firstAskPUTS");

			TradeMultiLeg.get().verifyPriceVarience(sCurrentVal, sPreviousVal, "firstAskPUTS");

			mobileAction.FuncClick(Continue, "Continue");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			mobileAction.verifyElementIsDisplayed(titleConfirmOrder, "titleConfirmOrder");

			mobileAction.FuncClick(btnSendOrder, "btnSendOrder");

			mobileAction.FuncSwipeWhileElementNotFound(btn_trade, false, 7, "up");
			mobileAction.FuncClick(btn_trade, "Trade Button");

			// Select TradeAccount,OrderType & Symbol
			TradeMIT.get().selectTradeAccount_OrderType();
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().clickFirstSymbol();
			Decorator();
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, true, 5, "up");
			mobileAction.FuncVerifyNonBlankValue(defaultExpiryType, "Leg2 defaultExpiryType");
			mobileAction.FuncVerifyNonBlankValue(defaultOptionType, "Leg2 defaultOptionType");
			mobileAction.FuncVerifyNonBlankValue(defaultStrikes, "Leg2 defaultStrikes");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionChainTableSubmit() {
		String sPreviousVal = "";
		String sCurrentVal = "";
		Decorator();
		try {
			String[] arrExpiryType = getTestdata("ExpiryType", XLSheetUserIDs).split(";");
			String[] arrOptionType = getTestdata("OptionType", XLSheetUserIDs).split(";");
			String[] arrStrikes = getTestdata("Strikes", XLSheetUserIDs).split(";");

			TradeMultiLeg.get().fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskPUTS, "firstAskPUTS");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// Do nothing
			} else {
				mobileAction.FuncClick(refreshButton, "refreshButton");
				mobileAction.FuncClick(refreshButton, "refreshButton");
			}

			// Leg1 Option Table Display
			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, true, 5, "down");

			/// mobileAction.FuncSwipeWhileElementNotFound(firstAskCALLS, false,
			/// 5, "up");
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskCALLS);

			sPreviousVal = mobileAction.FuncGetText(firstAskCALLS);
			mobileAction.FuncSwipeDownTillScreenTop(defaultExpiryType);

			mobileAction.selectItemFromList(defaultExpiryType, arrExpiryType[0]);
			mobileAction.selectItemFromList(defaultOptionType, arrOptionType[0]);
			mobileAction.selectItemFromList(defaultStrikes, arrStrikes[0]);

			mobileAction.FuncSwipeWhileElementNotFound(firstAskCALLS, true, 5, "up");
			sCurrentVal = mobileAction.FuncGetText(firstAskCALLS);
			// mobileAction.getTimeStamp();

			TradeMultiLeg.get().verifyPriceVarience(sCurrentVal, sPreviousVal, "firstAskCALLS");

			mobileAction.FuncClick(Continue, "Continue");

			// Leg2 Option Table Display
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, true, 5, "up");

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(firstAskPUTS, false,
			 * 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskPUTS);

			sPreviousVal = mobileAction.FuncGetText(firstAskPUTS);
			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(defaultExpiryType,
			 * false, 5, "down"); mobileAction.FuncSwipeOnce("down");
			 */
			// mobileAction.FunctionSwipe("down", 200, 200);
			mobileAction.FuncSwipeDownTillScreenTop(defaultExpiryType);

			mobileAction.selectItemFromList(defaultExpiryType, arrExpiryType[1]);
			mobileAction.selectItemFromList(defaultOptionType, arrOptionType[1]);
			mobileAction.selectItemFromList(defaultStrikes, arrStrikes[1]);

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(firstAskPUTS, false,
			 * 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskPUTS);

			sCurrentVal = mobileAction.FuncGetText(firstAskPUTS);
			mobileAction.FuncClick(firstAskPUTS, "firstAskPUTS");

			TradeMultiLeg.get().verifyPriceVarience(sCurrentVal, sPreviousVal, "firstAskPUTS");

			mobileAction.FuncClick(Continue, "Continue");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			mobileAction.verifyElementIsDisplayed(titleConfirmOrder, "titleConfirmOrder");

			mobileAction.FuncClick(btnSendOrder, "btnSendOrder");

			mobileAction.FuncSwipeWhileElementNotFound(btn_trade, false, 7, "up");
			mobileAction.FuncClick(btn_trade, "Trade Button");

			// Select TradeAccount,OrderType & Symbol
			TradeMIT.get().selectTradeAccount_OrderType();
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().clickFirstSymbol();

			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, true, 5, "up");
			mobileAction.FuncVerifyNonBlankValue(defaultExpiryType, "Leg1 defaultExpiryType");
			mobileAction.FuncVerifyNonBlankValue(defaultOptionType, "Leg1 defaultOptionType");
			mobileAction.FuncVerifyNonBlankValue(defaultStrikes, "Leg1 defaultStrikes");

			mobileAction.FuncClick(backButtonOptionTable, "backButtonOptionTable");

			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, true, 5, "up");
			mobileAction.FuncVerifyNonBlankValue(defaultExpiryType, "Leg2 defaultExpiryType");
			mobileAction.FuncVerifyNonBlankValue(defaultOptionType, "Leg2 defaultOptionType");
			mobileAction.FuncVerifyNonBlankValue(defaultStrikes, "Leg2 defaultStrikes");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyOptionOptionChainTableCancel() {
		String sPreviousVal = "";
		String sCurrentVal = "";
		Decorator();
		try {
			String[] arrExpiryType = getTestdata("ExpiryType", XLSheetUserIDs).split(";");
			String[] arrOptionType = getTestdata("OptionType", XLSheetUserIDs).split(";");
			String[] arrStrikes = getTestdata("Strikes", XLSheetUserIDs).split(";");

			TradeMultiLeg.get().fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskPUTS, "firstAskPUTS");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// Do nothing
			} else {
				mobileAction.FuncClick(refreshButton, "refreshButton");
				mobileAction.FuncClick(refreshButton, "refreshButton");
			}

			// Leg1 Option Table Display
			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, true, 5, "down");

			/// mobileAction.FuncSwipeWhileElementNotFound(firstBidCALLS, false,
			/// 5, "up");
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstBidCALLS);

			sPreviousVal = mobileAction.FuncGetText(firstBidCALLS);
			mobileAction.selectItemFromList(defaultExpiryType, arrExpiryType[0]);
			mobileAction.selectItemFromList(defaultOptionType, arrOptionType[0]);
			mobileAction.selectItemFromList(defaultStrikes, arrStrikes[0]);

			mobileAction.FuncSwipeWhileElementNotFound(firstAskCALLS, true, 5, "up");
			sCurrentVal = mobileAction.FuncGetText(firstBidCALLS);

			TradeMultiLeg.get().verifyPriceVarience(sCurrentVal, sPreviousVal, "firstBidCALLS");

			mobileAction.FuncClick(Continue, "Continue");

			// Leg2 Option Table Display
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, true, 5, "up");

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(firstAskPUTS, false,
			 * 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskPUTS);

			sPreviousVal = mobileAction.FuncGetText(firstBidPUTS);
			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(defaultExpiryType,
			 * false, 5, "down"); mobileAction.FuncSwipeOnce("down");
			 */
			// mobileAction.FunctionSwipe("down", 200, 200);
			mobileAction.FuncSwipeDownTillScreenTop(defaultExpiryType);

			mobileAction.selectItemFromList(defaultExpiryType, arrExpiryType[1]);
			mobileAction.selectItemFromList(defaultOptionType, arrOptionType[1]);
			mobileAction.selectItemFromList(defaultStrikes, arrStrikes[1]);

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(firstAskPUTS, false,
			 * 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskPUTS);

			sCurrentVal = mobileAction.FuncGetText(firstBidPUTS);
			mobileAction.FuncClick(firstAskPUTS, "firstAskPUTS");

			TradeMultiLeg.get().verifyPriceVarience(sCurrentVal, sPreviousVal, "firstBidPUTS");

			mobileAction.FuncClick(Continue, "Continue");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(doNotAgreeButton, "doNotAgreeButton");
			// mobileAction.verifyElementIsDisplayed(titleConfirmOrder,
			// "titleConfirmOrder");

			mobileAction.FuncClick(backButtonOptionTable, "backButtonOptionTable");
			mobileAction.FuncClick(agreeButton, "agreeButton");

			TradeMIT.get().clickInvestingTrade();
			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(btn_trade, false, 7,
			 * "up"); mobileAction.FuncClick(btn_trade, "Trade Button");
			 */

			// Select TradeAccount,OrderType & Symbol
			TradeMIT.get().selectTradeAccount_OrderType();
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().clickFirstSymbol();

			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, true, 5, "up");
			mobileAction.FuncVerifyNonBlankValue(defaultExpiryType, "Leg1 defaultExpiryType");
			mobileAction.FuncVerifyNonBlankValue(defaultOptionType, "Leg1 defaultOptionType");
			mobileAction.FuncVerifyNonBlankValue(defaultStrikes, "Leg1 defaultStrikes");

			mobileAction.FuncClick(backButtonOptionTable, "backButtonOptionTable");

			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, true, 5, "up");
			mobileAction.FuncVerifyNonBlankValue(defaultExpiryType, "Leg2 defaultExpiryType");
			mobileAction.FuncVerifyNonBlankValue(defaultOptionType, "Leg2 defaultOptionType");
			mobileAction.FuncVerifyNonBlankValue(defaultStrikes, "Leg2 defaultStrikes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyStockOptionChainTableCancel() {
		String sPreviousVal = "";
		String sCurrentVal = "";
		Decorator();
		try {
			String arrExpiryType = getTestdata("ExpiryType", XLSheetUserIDs);
			String arrOptionType = getTestdata("OptionType", XLSheetUserIDs);
			String arrStrikes = getTestdata("Strikes", XLSheetUserIDs);

			TradeMultiLeg.get().fillStockOptionOrder(firstBidPUTS, "firstBidPUTS");

			// Leg2 Option Table Display
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, true, 5, "down");

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(firstAskPUTS, false,
			 * 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstAskPUTS);

			sPreviousVal = mobileAction.FuncGetText(firstBidPUTS);
			/// mobileAction.FuncSwipeWhileElementNotFound(defaultExpiryType,
			/// false, 5, "down");
			// mobileAction.FunctionSwipe("down", 200, 200);
			mobileAction.FuncSwipeDownTillScreenTop(defaultExpiryType);

			mobileAction.selectItemFromList(defaultExpiryType, arrExpiryType);
			mobileAction.selectItemFromList(defaultOptionType, arrOptionType);
			mobileAction.selectItemFromList(defaultStrikes, arrStrikes);

			/*
			 * mobileAction.FuncSwipeWhileElementNotFound(firstBidPUTS, false,
			 * 5, "up"); mobileAction.FuncSwipeOnce("up");
			 */
			// mobileAction.FunctionSwipe("up", 200, 100);
			mobileAction.FuncSwipeUpTillScreenBottom(firstBidPUTS);

			sCurrentVal = mobileAction.FuncGetText(firstBidPUTS);
			mobileAction.FuncClick(firstAskPUTS, "firstAskPUTS");

			TradeMultiLeg.get().verifyPriceVarience(sCurrentVal, sPreviousVal, "firstBidPUTS");

			mobileAction.FuncClick(Continue, "Continue");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(doNotAgreeButton, "doNotAgreeButton");
			// mobileAction.verifyElementIsDisplayed(titleConfirmOrder,
			// "titleConfirmOrder");

			mobileAction.FuncClick(backButtonOptionTable, "backButtonOptionTable");
			mobileAction.FuncClick(agreeButton, "agreeButton");

			TradeMIT.get().clickInvestingTrade();

			// Select TradeAccount,OrderType & Symbol
			TradeMIT.get().selectTradeAccount_OrderType();
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().clickFirstSymbol();

			mobileAction.FuncClick(backButtonOptionTable, "backButtonOptionTable");
			mobileAction.FuncClick(cancelButton, "cancelButton");

			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, true, 5, "up");
			mobileAction.FuncVerifyNonBlankValue(defaultExpiryType, "Leg2 defaultExpiryType");
			mobileAction.FuncVerifyNonBlankValue(defaultOptionType, "Leg2 defaultOptionType");
			mobileAction.FuncVerifyNonBlankValue(defaultStrikes, "Leg2 defaultStrikes");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
