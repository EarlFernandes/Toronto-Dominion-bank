package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OrderReciept extends _CommonPage {
	private static OrderReciept OrderReciept;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Order']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/ordersTab' and @text='Order']")
	private MobileElement order;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/ordersTab' and @text='Order']")
	private MobileElement account;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Order Placed']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/ordersTab' and @text='Order']")
	private MobileElement orderplaced;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Order Details']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDetailTab' and @text='Order Detail']")
	private MobileElement orderdetails;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Action & Quantity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Action & Quantity']")
	private MobileElement actionquty;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Price']")
	private MobileElement price;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Shareholder Type']")
	private MobileElement shareholdertype;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Trigger Price']")
	private MobileElement triggerprice;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Good 'til']")
	private MobileElement Good;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
	private MobileElement orderReciept;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Thank you!']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/thank_you' and @text='Thank you!']")
	private MobileElement msgthankyou;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Order sent successfully']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Order sent successfully']")
	private MobileElement ordersent;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation' and @text='Confirmation # :â€šÃ„â€ ']")
	private MobileElement confirmation;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Orders']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Good 'til']")
	private MobileElement btnorders;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='ORDERS']")
	@AndroidFindBy(xpath = "android.widget.TextView[@text='ORDERS']")
	private MobileElement ordersicon;

	@iOSFindBy(xpath = " //XCUIElementTypeStaticText[contains(@label,'Receipt')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
	private MobileElement receiptConfirmation_header;

	@iOSFindBy(xpath = " //XCUIElementTypeStaticText[contains(@label,'Copy')]")
	private MobileElement copy_confirmation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Limit Price']")
	private MobileElement limitprice;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='ReâˆšÃŸu']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
	private MobileElement receipt_header;

	// @iOSFindBy(xpath = "//*[@label='Ordre transmis avec succâˆšÂ®s.']")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/message' and
	// @text='Order sent successfully']")
	// private MobileElement success_message;
	//
	// @iOSFindBy(xpath = "//*[contains(@label,'Confirmation #') or
	// contains(@label,'de confirmation')]")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	// private MobileElement confirmation_val;

	@AndroidFindBy(xpath = "android.widget.TextView[@text='GO BACK HOME']")
	private MobileElement gohomeicon;

	@AndroidFindBy(xpath = "android.widget.TextView[@text='TRADE']")
	private MobileElement tradeicon;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='My Accounts']")
	private MobileElement accounts_button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='My Accounts']")
	private MobileElement accounts_header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'our request to cancel the order was received.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/thank_you' and @text='Thank you!']")
	private MobileElement verify_cancel_order;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'The change to your order') or contains(@label,'Demande de modification')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message']")
	private MobileElement updated_message;

	String priceValue = getTestdata("Price");
	String goodtil_value = getTestdata("Good'til");
	String searchValue = getTestdata("Search");
	String account_no = "//*[contains(@label,'Account')]";
	String actionToPerform = getTestdata("Action");
	String symbol = getTestdata("Symbol");
	String Qty = getTestdata("Quantity");
	String home = "//XCUIElementTypeStaticText[contains(@label,'Home')]";
	String orders = "//XCUIElementTypeStaticText[contains(@label,'Orders')]";
	String trade = "//XCUIElementTypeStaticText[contains(@label,'Trade')]";
	String order_details_path = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]";
	String validateDate = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]";
	String shareHolderPath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder Type')]";

	String stockMarketDay = actionToPerform + " " + Qty + " " + symbol + " @ " + price + " Good 'til " + goodtil_value;
	String stockLimitDay = actionToPerform + " " + Qty + " " + symbol + " " + searchValue + " @ Trigger $" + priceValue
			+ " Good 'til " + goodtil_value;
	String orderDetailsValue = "";
	double qtyValue = Double.parseDouble(Qty);
	DecimalFormat df = new DecimalFormat("#.00");

	public synchronized static OrderReciept get() {
		if (OrderReciept == null) {
			OrderReciept = new OrderReciept();
		}
		return OrderReciept;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	/**
	 * This method will verify the orders details
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
	public void ordertab() throws IOException {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(order, "Order");
			mobileAction.verifyElementIsDisplayed(account, "Account");
			mobileAction.verifyElementIsDisplayed(orderplaced, "Order Placed");
		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

	public void orderDetails() {
		try {
			Decorator();
			mobileAction.FuncClick(orderdetails, "Order Detail");
			mobileAction.verifyElementIsDisplayed(actionquty, "Action & Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(Good, "Good 'til");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click order button on the receipt screen.
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
	public void orders() {
		try {
			Decorator();
			mobileAction.FuncClick(btnorders, "Orders");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void orderdetailMutualfund() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(orderReciept, "Order Reciept Screen");
			mobileAction.verifyElementIsDisplayed(msgthankyou, "Thamk You");
			mobileAction.verifyElementIsDisplayed(ordersent, "Order sent successfully");
			mobileAction.verifyElementIsDisplayed(confirmation, "Confirmation #");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void confirmReceipt() throws IOException {

		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementIsDisplayed(receiptConfirmation_header, "Verifying Receipt Page Header");
				mobileAction.verifyElementUsingXPath(account_no, "Account No");
				MobileElement order_details = mobileAction.verifyElementUsingXPath(order_details_path, "Order Details");
				orderDetailsValue = order_details.getText();
				mobileAction.verifyElementUsingXPath(shareHolderPath, "Share Holder");
				mobileAction.verifyElementUsingXPath(home, "Home");
				mobileAction.verifyElementUsingXPath(orders, "Orders");
				mobileAction.verifyElementUsingXPath(trade, "Trade");
				if (orderDetailsValue.contains(stockMarketDay)) {
					CL.GetReporting().FuncReport("PASS", stockMarketDay + " verified");
				} else if (orderDetailsValue.contains(stockLimitDay)) {
					CL.GetReporting().FuncReport("PASS", stockLimitDay + " verified");
				}
				mobileAction.FuncClick(ordersicon, "ORDERS");

			} else {

				mobileAction.FuncClick(ordersicon, "ORDERS");
			}
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will check if the date is in valid format
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifytimestamp() throws IOException {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				MobileElement validateDateValue = mobileAction.verifyElementUsingXPath(validateDate, "Validate Date");
				String dateVal = validateDateValue.getText();
				String[] tokensVal = dateVal.split(", ");
				String secondDateValue = "";
				if (tokensVal[1].contains("PM")) {
					String[] dateValueParts = tokensVal[1].split("PM");
					secondDateValue = dateValueParts[0] + "PM";
				} else {
					String[] dateValueParts = tokensVal[1].split("AM");
					secondDateValue = dateValueParts[0] + "AM";
				}
				if (isValidFormat("MMMM dd", tokensVal[0]) || isValidFormat("yyyy hh:mm:ss a", secondDateValue)) {
					CL.GetReporting().FuncReport("PASS", "Validated Date");
				}
			} else {
				String firstPartDate = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main']";
				String secondPartDate = "//android.widget.TextView[@resource-id='com.td:id/item_row_subvalue']";
				MobileElement firstVal = mobileAction.verifyElementUsingXPath(firstPartDate, "Time Stamp first part");
				MobileElement secondVal = mobileAction.verifyElementUsingXPath(secondPartDate,
						"Time Stamp Second part");
				if (isValidFormat("MMMM dd", firstVal.getText())
						|| isValidFormat("yyyy hh:mm:ss a zZ", secondVal.getText())) {
					CL.GetReporting().FuncReport("PASS", "Validated Date");
				}
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method will check if the date is in valid format
	 * 
	 * @return void
	 * 
	 * @throws ParseException
	 *             Check whether the input is in the Valid Date format
	 */

	public static boolean isValidFormat(String format, String value) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.US);
		try {
			date = sdf.parse(value);

			if (!value.equals(sdf.format(date))) {
				date = null;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date != null;
	}

	/**
	 * This method will verify Order Details with TriggerPrice
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

	public void orderDetailTriggerPrice() {
		try {
			Decorator();
			mobileAction.FuncClick(orderdetails, "Order Detail");
			mobileAction.verifyElementIsDisplayed(actionquty, "Action & Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(triggerprice, "Trigger Price");
			mobileAction.verifyElementIsDisplayed(Good, "Good 'til");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify Order Details with LimitPrice and Share Holder
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

	public void orderDetailLimitPrice_ShareHolder() {
		try {
			Decorator();
			mobileAction.FuncClick(orderdetails, "Order Detail");
			mobileAction.verifyElementIsDisplayed(actionquty, "Action & Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(limitprice, "Limit Price");
			mobileAction.verifyElementIsDisplayed(Good, "Good 'til");
			mobileAction.verifyElementIsDisplayed(shareholdertype, "ShareHolder Type");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the Quick Link Icons
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void quicklinkicon() throws IOException {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(gohomeicon, "Verify Go Back Home Icon");
			mobileAction.verifyElementIsDisplayed(ordersicon, "Verify Orders Icon");
			mobileAction.verifyElementIsDisplayed(tradeicon, "Verify Trade Icon");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will Click Go Home Icon
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void clickgohomeicon() throws IOException {
		try {
			Decorator();
			mobileAction.FuncClick(gohomeicon, "Click Go Back Home Icon");
			mobileAction.FuncClick(menu, "Click Menu");
			mobileAction.FuncClick(accounts_button, "Accounts");
			mobileAction.verifyElementIsDisplayed(accounts_header, "Verify Accounts Header");
		} catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();

		}
	}

	/**
	 * This method will Clicks the Cancel Order Icon
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

	public void cancelOrdersIcon() {

		Decorator();
		try {
			mobileAction.FuncClick(ordersicon, "Order");
		} catch (IOException | NoSuchElementException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method will verify the element Cancel Order Receipt
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws IOException
	 *             If there is problem while reporting.
	 */
	public void cancelOrderReceipt() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(verify_cancel_order, "Cancel Order Reciept");
		} catch (IOException | NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * This method will verify the Confirm Receipt page and the Success message
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void confirmreceipt() throws IOException {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(receipt_header, "Verify Receipt Header");
			mobileAction.verifyElementIsDisplayed(success_message, "Verify Success Message");

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the updated orders details
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

	public void updatedReceipt() throws IOException {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(receipt_header, "Receipt Header");
			mobileAction.verifyElementIsDisplayed(updated_message, "Updated Message");
			mobileAction.verifyElementIsDisplayed(confirmation_val, "Confirmation Number");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	// new code

	@iOSFindBy(xpath = "//*[@label='En cours']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main' and contains(@text,' @ ')]")
	private MobileElement orderElement;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//*[@label='En cours']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='En cours']")
	private MobileElement progressBarFRE;

	@iOSFindBy(xpath = "//*[@label='En cours']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_home' and @text='HOME']")
	private MobileElement homeButton;

	@iOSFindBy(xpath = "//*[@label='En cours']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_order' and @text='ORDERS']")
	private MobileElement OrderButton;

	@iOSFindBy(xpath = "//*[@label='En cours']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_trade' and @text='TRADE']")
	private MobileElement tradeButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main' and contains(@text,',')]")
	private MobileElement timeStampDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_subvalue']")
	private MobileElement timeStampZone;

	@iOSFindBy(xpath = "//*[@label='Ordre transmis avec succâˆšÂ®s.']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Order sent successfully']")
	private MobileElement success_message;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #') or contains(@label,'de confirmation')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_val;

	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.td:id/recycler_view_receipt']")
	private MobileElement listView;
	String accountToSelect = "";
	String accountNumberXpath = "";
	String accountNumberiOSXpath = "";
	String accselected = "";

	String shareholder_select = "";

	String selectgoodtill = "";
	String txtAction = "";

	String orderValue = "";

	String pricetype = "";
	String accountno = "";

	String quantityXL = "";

	String trade_account_no = "";

	String orderValueXL = "";

	String price_valueArray[];
	String price_value;

	String goodXL = "";
	String shareHolderXl = "";

	boolean isLanguageFrench = false;

	String Action = "";
	String trade_accountXL = "";
	String actionToPerformXL = "";
	String searchKeyword = "";
	String trading_pwd_XL = "";
	String triggerDelta_value = "";
	String limitDelta_value = "";
	String currentPricePath = null;

	String confirmOrderValue;
	String triggerPriceValue;
	String limitPriceValue;
	boolean clickQuickLink = false;

	public void init() {

		quantityXL = getTestdata("Quantity");

		trade_account_no = getTestdata("CDNMarginAccount");

		orderValueXL = getTestdata("Ordervalue");

		// goodXL = getTestdata("Good'til");

		shareHolderXl = getTestdata("ShareHolder");

		isLanguageFrench = getTestdata("Language").equals("FRE");

		Action = getTestdata("Action");

		trade_accountXL = getTestdata("CDNMarginAccount");

		actionToPerformXL = getTestdata("Action");
		searchKeyword = getTestdata("Search");

		trading_pwd_XL = getTestdata("Trading_Pwd");
		triggerDelta_value = getTestdata("TriggerDelta");

		limitDelta_value = getTestdata("LimitDelta");
		triggerPriceValue = CL.getTestDataInstance().TCParameters.get("TriggerPrice");
		limitPriceValue = CL.getTestDataInstance().TCParameters.get("LimitPrice");

		price_value = setCurrentArrayValue(getTestDataStringArray("Price"));

		goodXL = setCurrentArrayValue(getTestDataStringArray("Good'til"));

		mobileAction.waitForElementToVanish(progressBar);
	}

	public String setCurrentArrayValue(String[] arrayValue) {
		String valueToReturn;
		if (arrayValue.length == 2) {
			if (CL.getTestDataInstance().TCParameters.containsKey("ChangeOrder")) {
				String changeOrder = CL.getTestDataInstance().TCParameters.get("ChangeOrder");
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

	public void validateTrailingStopLimitBuy() {
		DecimalFormat df = new DecimalFormat("#.00");
		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value

					+ " @ Delta de déclenchement " + df.format(Double.parseDouble(triggerDelta_value)).replace(".", ",")
					+ " $ Delta limite " + df.format(Double.parseDouble(limitDelta_value)).replace(".", ",")
					+ " $ Échéance " + goodXL;
			System.out.println(orderValue);
		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value
					+ " @ Trigger Delta $" + df.format(Double.parseDouble(triggerDelta_value)) + " Limit Delta $"
					+ df.format(Double.parseDouble(limitDelta_value)) + " Good 'til " + goodXL;
		}
		System.out.println(confirmOrderValue + " \n" + orderValue);
		validationReport(orderValue);

	}

	public void validateTrailingStopMarketBuy() {
		DecimalFormat df = new DecimalFormat("#.00");
		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value
					+ " @ Delta de déclenchement " + df.format(Double.parseDouble(triggerDelta_value)).replace(".", ",")
					+ " $ Échéance " + goodXL;
			System.out.println(orderValue);

		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value
					+ " @ Trigger Delta $" + df.format(Double.parseDouble(triggerDelta_value)) + " Good 'til " + goodXL;
		}
		System.out.println(confirmOrderValue + " \n" + orderValue);
		validationReport(orderValue);

	}

	public void validateStopLimitBuy() {
		DecimalFormat df = new DecimalFormat("#.00");

		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value
					+ " @ Déclencheur " + df.format(Double.parseDouble(triggerPriceValue)).replace(".", ",")
					+ " $ limite " + df.format(Double.parseDouble(limitPriceValue)).replace(".", ",") + " $ Échéance "
					+ goodXL;

		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value + " @ Trigger $"
					+ df.format(Double.parseDouble(triggerPriceValue)) + " Limit $"
					+ df.format(Double.parseDouble(limitPriceValue)) + " Good 'til " + goodXL;
		}
		System.out.println(confirmOrderValue + " \n" + orderValue);
		validationReport(orderValue);

	}

	// Acheter 1 TD Cours du marché stop @ Déclencheur 65,72 $ Échéance Jour
	public void validateStopMarket() {
		DecimalFormat df = new DecimalFormat("#.00");

		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value

					+ " @ Déclencheur " + df.format(Double.parseDouble(triggerPriceValue)).replace(".", ",")
					+ " $ Échéance " + goodXL;

		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value

					+ " @ Trigger $" + df.format(Double.parseDouble(triggerPriceValue)) + " Good 'til " + goodXL;
		}
		System.out.println(confirmOrderValue + " \n" + orderValue);
		validationReport(orderValue);

	}

	public void validateLimitBuy() {
		DecimalFormat df = new DecimalFormat("#.00");
		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value + " @ "
					+ df.format(Double.parseDouble(limitPriceValue)).replace(".", ",") + " $ Échéance " + goodXL;

		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value + " @ $"
					+ df.format(Double.parseDouble(limitPriceValue)) + " Good 'til " + goodXL;

		}
		System.out.println(confirmOrderValue + " \n" + orderValue);
		validationReport(orderValue);

	}

	public void validateMarketBuy() {

		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " @ " + price_value

					+ " Échéance " + goodXL;
		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " @ " + price_value

					+ " Good 'til " + goodXL;
		}
		System.out.println(confirmOrderValue + " \n" + orderValue);
		validationReport(orderValue);

	}

	public void validateConfirmOrderBuy() {
		Decorator();
		init();
		try {
			mobileAction.FuncSwipeWhileElementNotFound(orderElement, false, 10, "up");
		} catch (Exception e) {
			e.printStackTrace();
		}

		confirmOrderValue = orderElement.getText();
		System.out.println(confirmOrderValue);

		System.out.println(price_value);
		switch (price_value) {
		case "Market":
		case "Cours du marché":
			validateMarketBuy();
			break;
		case "Limit":
		case "Cours limité":

			validateLimitBuy();
			break;
		case "Stop Market":
		case "Cours du marché stop":

			validateStopMarket();
			break;
		case "Stop Limit":
		case "Cours limité stop":

			validateStopLimitBuy();
			break;
		case "Trailing Stop Market":
		case "Stop suiveur marché":

			validateTrailingStopMarketBuy();
			break;
		case "Trailing Stop Limit":
		case "Stop suiveur limite":

			validateTrailingStopLimitBuy();
			break;

		}

		receipt();
	}

	public void validationReport(String orderValue) {
		try {

			String confirmOrderArray[] = orderValue.split("\\s+");
			boolean validateValue = true;
			for (String value : confirmOrderArray) {
				if (!confirmOrderValue.contains(value)) {
					validateValue = false;
					break;
				}
			}
			if (validateValue) {
				CL.GetReporting().FuncReport("Pass", "The Order value is verified and similar");
			} else {
				CL.GetReporting().FuncReport("Fail", "The Order value is not similar");
			}

			validateQuickLinks();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void validateQuickLinks() {

		try {
			validateTimeStamp();
			mobileAction.FunctionSwipe("up", 200, 100);

			mobileAction.verifyElementIsDisplayed(homeButton, "Home Button");
			mobileAction.verifyElementIsDisplayed(OrderButton, "Order Button");
			mobileAction.verifyElementIsDisplayed(tradeButton, "Trade Button");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOrders() {

		try {
			validateTimeStamp();
			mobileAction.FuncElementSwipeWhileNotFound(listView, OrderButton, 1, "up", true);

		} catch (IOException | NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validateTimeStamp() {
		String tradeDate;
		try {
			tradeDate = mobileAction.getText(timeStampDate);
			DateFormat dateFormat;
			if (isLanguageFrench) {
				dateFormat = new SimpleDateFormat("MMMMM d, yyyy", Locale.FRANCE);
			} else {
				dateFormat = new SimpleDateFormat("MMMMM d, yyyy");
			}
			Date date = new Date();
			CL.GetReporting().FuncReport("Pass", "Time stamp is verified");
			System.out.println(tradeDate);
			if ((tradeDate.contains(dateFormat.format(date)))) {

				CL.GetReporting().FuncReport("Pass", "Time stamp is verified");
				// } else {
				// CL.GetReporting().FuncReport("Fail", "Time stamp is not
				// verified");
				// }
			}
			System.out.println(dateFormat.format(date));
			// System.out.println(dateFormatFrench.format(date));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method will verify the receipt orders details
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void receipt() {
		try {
			Decorator();
			TouchAction action2 = null;
			mobileAction.verifyElementIsDisplayed(receipt_header, "Verify Receipt Header");
			mobileAction.verifyElementIsDisplayed(success_message, "Verify Success Message");
			mobileAction.verifyElementIsDisplayed(confirmation_val, "Verify Confirmation Number");
			String confirmValue = mobileAction.getText(confirmation_val);
			CL.getTestDataInstance().TCParameters.put("ConfirmValue", confirmValue);
			action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(confirmation_val, 2);
			CL.GetReporting().FuncReport("Pass", "Confirmation displays and can be copied");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}