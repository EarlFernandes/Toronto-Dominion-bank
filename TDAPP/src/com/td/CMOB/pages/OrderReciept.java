package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.util.Date;
import java.util.Locale;
import com.td.test.CDNMobile._CommonPage;

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

    @iOSFindBy(xpath = "//*[@label='']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Limit Price']")
    private MobileElement limitprice;

    @iOSFindBy(xpath = "//*[@label='']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Trigger Price']")
    private MobileElement triggerprice;

    @iOSFindBy(xpath = "//*[@label='']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Shareholder Type']")
    private MobileElement shareholdertype;

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
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Good 'til']")
    private MobileElement btnorders;

    @iOSFindBy(id = " ")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
    private MobileElement receipt_header;

    @iOSFindBy(id = " ")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Order sent successfully']")
    private MobileElement success_message;

    @iOSFindBy(id = " ")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
    private MobileElement confirmation_val;

    @iOSFindBy(id = " ")
    @AndroidFindBy(xpath = "android.widget.TextView[@text='GO BACK HOME']")
    private MobileElement gohomeicon;

    @iOSFindBy(id = " ")
    @AndroidFindBy(xpath = "android.widget.TextView[@text='ORDERS']")
    private MobileElement ordersicon;

    @iOSFindBy(id = " ")
    @AndroidFindBy(xpath = "android.widget.TextView[@text='TRADE']")
    private MobileElement tradeicon;

    @iOSFindBy(xpath = "//*[@label='Menu']")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
    private MobileElement menu;

    @iOSFindBy(xpath = "//*[@label='My Accounts']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='My Accounts']")
    private MobileElement accounts_button;

    @iOSFindBy(xpath = "//*[@label='']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='My Accounts']")
    private MobileElement accounts_header;

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
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	} catch (IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

    public void receipt() throws IOException {
	try {
	    Decorator();
	    TouchAction action2 = null;
	    mobileAction.verifyElementIsDisplayed(receipt_header, "Verify Receipt Header");
	    mobileAction.verifyElementIsDisplayed(success_message, "Verify Success Message");
	    mobileAction.verifyElementIsDisplayed(confirmation_val, "Verify Confirmation Number");
	    String confrmVal = mobileAction.getText(confirmation_val);
	    action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(confirmation_val, 2);
	    CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");
	} catch (NoSuchElementException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
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
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will verify the Quick Link Icons
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
     * This method will Click Any Quick Link Icons and Verify the respective
     * details
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
     * This method will verify Order Details with LimitPrice
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
     * This method will verify Time Stamp Details
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

    public void verifytimestamp() throws IOException {
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

		String validateDate = "//*[contains(@label,'Order Placed,')]";
		MobileElement validateDateValue = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(validateDate));
		String dateVal = validateDateValue.getText();
		String[] tokensVal = dateVal.split(", ");
		if (isValidFormat("MMMM dd", tokensVal[1]) || isValidFormat("yyyy hh:mm:ss a zZ", tokensVal[2])) {
		    CL.GetReporting().FuncReport("PASS", "Validated Date");
		}
	    } else {
		String firstPartDate = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main']";
		String secondPartDate = "//android.widget.TextView[@resource-id='com.td:id/item_row_subvalue']";
		MobileElement firstVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(firstPartDate));
		MobileElement secondVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(secondPartDate));
		if (isValidFormat("MMMM dd", firstVal.getText())
			|| isValidFormat("yyyy hh:mm:ss a zZ", secondVal.getText())) {
		    CL.GetReporting().FuncReport("PASS", "Validated Date");
		}
	    }
	} catch (NoSuchElementException e) {
	    e.printStackTrace();
	}

    }

}
