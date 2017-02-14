package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OrderReciept1 extends _CommonPage {
	private static OrderReciept OrderReciept;

	@iOSFindBy(xpath = "//*[@label='Order']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/ordersTab' and @text='Order']")
	private MobileElement order;

	@iOSFindBy(xpath = "//*[@label='From Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/ordersTab' and @text='Order']")
	private MobileElement account;

	@iOSFindBy(xpath = "//*[@label='Order Placed']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/ordersTab' and @text='Order']")
	private MobileElement orderplaced;

	@iOSFindBy(xpath = "//*[@label='Order Details']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDetailTab' and @text='Order Detail']")
	private MobileElement orderdetails;

	@iOSFindBy(xpath = "//*[@label='Action & Quantity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Action & Quantity']")
	private MobileElement actionquty;

	@iOSFindBy(xpath = "//*[@label='Price']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Price']")
	private MobileElement price;

	@iOSFindBy(xpath = "//*[contains(@label,'Good')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Good 'til']")
	private MobileElement Good;

	@iOSFindBy(xpath = "//*[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
	private MobileElement orderReciept;

	@iOSFindBy(xpath = "//*[@label='Thank you!']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/thank_you' and @text='Thank you!']")
	private MobileElement msgthankyou;

	@iOSFindBy(xpath = "//*[@label='Order sent successfully']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Order sent successfully']")
	private MobileElement ordersent;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation' and @text='Confirmation # :†']")
	private MobileElement confirmation;

	@iOSFindBy(xpath = "//*[@label='Orders']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Good 'til']")
	private MobileElement btnorders;

	@iOSFindBy(xpath = "//*[@label='ORDERS']")
	@AndroidFindBy(xpath = "android.widget.TextView[@text='ORDERS']")
	private MobileElement ordersicon;

	@iOSFindBy(xpath = " //*[contains(@label,'Receipt')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
	private MobileElement receiptConfirmation_header;

	@iOSFindBy(xpath = " //*[contains(@label,'Copy')]")
	private MobileElement copy_confirmation;

	String priceValue = MainScreen.valueMap.get("Price");
	String goodtil_value = MainScreen.valueMap.get("Good'til");
	String searchValue = MainScreen.valueMap.get("Search");
	String account_no = "//*[contains(@label,'Account')]";
	String actionToPerform = MainScreen.valueMap.get("Action");
	String symbol = MainScreen.valueMap.get("Symbol");
	String Qty = MainScreen.valueMap.get("Quantity");
	String home = "//*[contains(@label,'Home')]";
	String orders = "//*[contains(@label,'Orders')]";
	String trade = "//*[contains(@label,'Trade')]";
	String order_details_path = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]";
	String validateDate = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]";
	String shareHolderPath = "//*[contains(@label,'Shareholder Type')]";

	String stockMarketDay =actionToPerform + " " + Qty + " " + symbol + " @ " + price + " Good 'til " + goodtil_value;
	String stockLimitDay =actionToPerform + " " + Qty + " " + symbol + " " + searchValue
	+ " @ Trigger $" + priceValue + " Good 'til " + goodtil_value;
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
					CL.GetReporting().FuncReport("PASS", stockMarketDay+" verified");
				} else if (orderDetailsValue.contains(stockLimitDay)) {
					CL.GetReporting().FuncReport("PASS", stockLimitDay+" verified");
				} 
				mobileAction.FuncClick(ordersicon, "ORDERS");

			} else {

				// Android
			}
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

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
				MobileElement secondVal =  mobileAction.verifyElementUsingXPath(secondPartDate, "Time Stamp Second part");
				if (isValidFormat("MMMM dd", firstVal.getText())
						|| isValidFormat("yyyy hh:mm:ss a zZ", secondVal.getText())) {
					CL.GetReporting().FuncReport("PASS", "Validated Date");
				}
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public static boolean isValidFormat(String format, String value) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.US);
		try {
			date = sdf.parse(value);

			if (!value.equals(sdf.format(date))) {
				date = null;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date != null;
	}
}
