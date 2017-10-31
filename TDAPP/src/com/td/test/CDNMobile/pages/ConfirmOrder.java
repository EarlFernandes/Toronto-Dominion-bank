package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ConfirmOrder extends _CommonPage {
	private static ConfirmOrder ConfirmOrder;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Confirm Order' or contains(@label,'Confirmer l')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (@text='Confirm Order' or contains(@text,'Confirmer l'))]")
	private MobileElement confirmorder_header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Account' or @label='Compte']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account' or @text='Compte']")
	private MobileElement verifyaccount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Action & Quantity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Action & Quantity']")
	private MobileElement action_quantity;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price']")
	private MobileElement price;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price']")
	private MobileElement priceFRE;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trigger Price']")
	private MobileElement triggerprice;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Limit Price']")
	private MobileElement limitprice;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_trigger_delta_title_field' and @text='Trigger Delta']")
	private MobileElement triggerdelta;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Investing') or contains(@label,'Investir')]") // @Author
																													// -
																													// Shahbaaz
																													// 17-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Investing']")
	private MobileElement investingheader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Good')]")
	private MobileElement goodtill;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Shareholder Type']")
	@AndroidFindBy(xpath = "//android.widget.TextView(@text,'Shareholder Type')]")
	private MobileElement shareholdertype;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Buying Power Required']")
	@AndroidFindBy(xpath = "//android.widget.TextView(@text,'Buying Power Required')]")
	private MobileElement buyingpower_required;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Estimated Principal Value' or contains(@label,'Principal estim')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Estimated Principal') or contains(@text,'Principal estim')]")
	private MobileElement estimate_principle_value;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Estimated Commission' or contains(@label,'Commission estim')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Commission') or contains(@text,'Commission estim')]")
	private MobileElement estimate_comission;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Estimated Total Cost' or contains(@label,'Total estim')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Estimated Total') or contains(@text,'Total estim')]")
	private MobileElement estimated_total_cost;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Account') or contains(@label,'Compte')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_account_label' and (@text='Account' or contains(@text,'Compte'))]")
	private MobileElement OrderAccountName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Action & Quantity')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Action & Quantity'] ")
	private MobileElement Action_and_quantity;

	@iOSFindBy(xpath = "//*[@label='Confirm']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private MobileElement confirmDoNotCancel;

	@iOSFindBy(xpath = "//*[@label='Important Information']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/importantInfoLink' and @text='Important Information']")
	private MobileElement impInformationMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Quantity Filled')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/progress_bar_caption' and @text='Quantity Filled']")
	private MobileElement quantityFiled;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Price')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Price Type']")
	private MobileElement priceType;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Limit Price')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and contains(@text,'Limit P']")
	private MobileElement LimitPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Order Status')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Order Status']")
	private MobileElement order_status;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation Number')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Confirmation Number']")
	private MobileElement confirmation_order;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Order Placed')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Order Placed']")
	private MobileElement order_placed;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and contains(@text,'Good')]")
	private MobileElement goodTil;

	String platFormName = CL.getTestDataInstance().getMobilePlatForm();
	String t_OrderAccountName = "Account";
	String t_priceType = "price type";
	String t_Action_and_quantity = "action and quantity";
	String t_LimitPrice = "limit price";
	String t_quantityFiled = "quantity field";
	String t_order_status = "order status";
	String t_order_placed = "placed order";
	String t_confirmation_order = "confirmation order";
	String t_goodTil = "good til";

	public synchronized static ConfirmOrder get() {
		if (ConfirmOrder == null) {
			ConfirmOrder = new ConfirmOrder();
		}
		return ConfirmOrder;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	/**
	 * This method will click on the confirm order button. Navigates to the Send
	 * Order screen
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyconfirm_order() {
		try {
			Decorator();
			String verify_confirm_order_header = "Verifying Confirm Order Page Header";
			mobileAction.verifyElementIsDisplayed(confirmorder_header, verify_confirm_order_header);
			/*
			 * String verify_account = "account verified";
			 * mobileAction.verifyElementIsDisplayed(verifyaccount,
			 * verify_account); String actionquantity = "Action And Quantity";
			 * mobileAction.verifyElementIsDisplayed(action_quantity,
			 * actionquantity); String Price = "Price";
			 * mobileAction.verifyElementIsDisplayed(price, Price); String
			 * GoodTill = "GoodTill";
			 * mobileAction.verifyElementIsDisplayed(goodtill, GoodTill); String
			 * Shareholdertype = "Shareholder Type";
			 * mobileAction.verifyElementIsDisplayed(shareholdertype,
			 * "Verify Shareholder Type");
			 */
			String buyingpower = "Buying Power Required";
			mobileAction.verifyElementIsDisplayed(buyingpower_required, buyingpower);

			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify order confirm details page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void orderConfirmDetails() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(OrderAccountName, t_OrderAccountName);
			mobileAction.verifyElementIsDisplayed(action_quantity, t_Action_and_quantity);
			mobileAction.verifyElementIsDisplayed(quantityFiled, t_quantityFiled);
			mobileAction.verifyElementIsDisplayed(priceType, t_priceType);
			mobileAction.verifyElementIsDisplayed(LimitPrice, t_LimitPrice);
			mobileAction.verifyElementIsDisplayed(order_status, t_order_status);
			mobileAction.verifyElementIsDisplayed(confirmation_order, t_confirmation_order);
			mobileAction.FunCSwipeandScroll(order_placed, true);
			mobileAction.verifyElementIsDisplayed(goodTil, t_goodTil);
			mobileAction.verifyElementIsDisplayed(order_placed, t_order_placed);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify CDN Margin confirm order details
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifycdnmargin_buy() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(shareholdertype, "Shareholder Type");
			mobileAction.verifyElementIsDisplayed(buyingpower_required, "Buying Power Required");
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify Send order details
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifySendOrder() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(shareholdertype, "Shareholder Type");
			mobileAction.verifyElementIsDisplayed(buyingpower_required, "Buying Power Required");
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify cancel order CDN Margin buy trigger delta details
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifycancel_cdnmargin_buy_triggerdelta() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(triggerdelta, "Trigger Delta");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(shareholdertype, "Shareholder Type");
			mobileAction.verifyElementIsDisplayed(buyingpower_required, "Buying Power Required");
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify CDN Margin Limit in the Confirm Order page
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifycdnmargin_limit() {

		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(limitprice, "Limit Price");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(shareholdertype, "Shareholder Type");
			mobileAction.verifyElementIsDisplayed(buyingpower_required, "Buying Power Required");
			mobileAction.FunCSwipeandScroll(estimated_total_cost, false);
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify CDN cash sell stop market
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void cdncash_sell_stopmarket() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(triggerprice, "Trigger Price");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify CDN cash in the Confirm Order page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifycdncash() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "zVerify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on SendOrder Button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clicksendorder() {
		Decorator();
		try {
			mobileAction.FuncClick(send_order, "Click Send Order Button");

			mobileAction.waitProgressBarVanish();
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

	/**
	 * This method will CDN margin sell trailing stop market in the Confirm
	 * Order Page
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void cdnmargin_sell_trailingstopmarket() {

		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(triggerdelta, "Trigger Delta");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(buyingpower_required, "Buying Power Required");
			mobileAction.FunCSwipeandScroll(estimated_total_cost, false);
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Proceeds");
			mobileAction.verifyElementIsDisplayed(cancelButton, "Cancel Button");
			mobileAction.verifyElementIsDisplayed(send_order, "Send Order Button");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will CDN margin sell trailing stop limit in the Confirm Order
	 * Page
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void cdncash_sell_trailingstoplimit() {

		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(triggerdelta, "Trigger Delta");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(shareholdertype, "Verify Shareholder Type");
			mobileAction.FunCSwipeandScroll(estimated_total_cost, false);
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Proceeds");
			mobileAction.verifyElementIsDisplayed(cancelButton, "Cancel Button");
			mobileAction.verifyElementIsDisplayed(send_order, "Send Order Button");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will US margin short buy to cover market in the confirm order
	 * page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void usmarginshort_buytocover_market() {

		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(shareholdertype, "Verify Shareholder Type");
			mobileAction.verifyElementIsDisplayed(buyingpower_required, "Buying Power Required");
			mobileAction.FunCSwipeandScroll(estimated_total_cost, false);
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");
			mobileAction.verifyElementIsDisplayed(cancelButton, "Cancel Button");
			mobileAction.verifyElementIsDisplayed(send_order, "Send Order Button");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	// new code implemented

	// newConfirmOrder

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

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeCell/XCUIElementTypeStaticText[@label='Order']/../XCUIElementTypeStaticText[2]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Order' or @label='Ordre']/../XCUIElementTypeStaticText[2]") // @Author
																														// -
																														// Shahbaaz
																														// 17-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main' and contains(@text,' @ ')]")
	private MobileElement orderElement;

	@iOSFindBy(xpath = "//*[@label='Annuler' or @label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and (@text='Cancel' or @text='Annuler')]")
	private MobileElement cancelButton;

	@iOSFindBy(xpath = "//*[@label='Annuler' or @label='Cancel']") // @Author -
																	// Shahbaaz
																	// 17-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and (@text='Cancel' or @text='Annuler')]")
	private MobileElement confirmCancel;

	@iOSFindBy(xpath = "//*[@label='En cours']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='En cours']")
	private MobileElement progressBarFRE;

	@iOSFindBy(xpath = "//*[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Confirm Order, Navigate up']")
	// android.widget.ImageView[@resource-id='android:id/up']
	private MobileElement backButton;

	@iOSFindBy(xpath = "//*[contains(@label,'Send Order') or contains(@label,'Envoyer l')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Send Order' or contains(@text,'Envoyer l')]")
	private MobileElement send_order;

	String confirmOrderValue;
	String triggerPriceValue;
	String limitPriceValue;

	public void init() {

		quantityXL = getTestdata("Quantity");

		trade_account_no = getTestdata("CDNMarginAccount");

		orderValueXL = getTestdata("Ordervalue");

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
		price_valueArray = getTestDataStringArray("Price");

		price_value = setCurrentArrayValue(getTestDataStringArray("Price"));

		goodXL = setCurrentArrayValue(getTestDataStringArray("Good'til"));

		mobileAction.waitProgressBarVanish();
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

	/**
	 * This method will click on Cancel Button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void clickCancel() {
		Decorator();
		try {
			mobileAction.FuncClick(cancelButton, "Cancel");
			Thread.sleep(3000);
			mobileAction.FuncClick(confirmCancel, "Confirm Cancel");
			mobileAction.verifyElementIsDisplayed(investingheader, "Verifying Investing Landing Page");
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

	/**
	 * This method will click on Do Not Cancel Button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void clickDoNotCancel() {
		Decorator();
		try {
			mobileAction.FuncClick(cancelButton, "Cancel");
			mobileAction.FuncClick(confirmDoNotCancel, "Do Not Cancel");
			mobileAction.FuncClick(backButton, "Back");
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

	/**
	 * This method will Check for Important Imformation
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void checkImpInformation() {
		Decorator();
		try {
			try {
				mobileAction.FuncSwipeWhileElementNotFound(impInformationMessage, false, 10, "up");
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}

			mobileAction.verifyElementIsDisplayed(impInformationMessage, "Important Message Link");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will validates for PriceType Tailing Stop Limit and Action is
	 * Buy It validates by concatenating the Order Placed
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

	public void validateTrailingStopLimitBuy() {// @Author - Sushil 19-Apr-2017
												// Modified
		DecimalFormat df = new DecimalFormat("#.00");
		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value

					+ " @ Delta de déclenchement" + df.format(Double.parseDouble(triggerDelta_value)).replace(".", ",")
					+ " $ Delta limite " + df.format(Double.parseDouble(limitDelta_value)).replace(".", ",")
					+ " $ Échéance " + goodXL;
		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value
					+ " @ Trigger Delta $" + df.format(Double.parseDouble(triggerDelta_value)) + " Limit Delta $"
					+ df.format(Double.parseDouble(limitDelta_value)) + " Good 'til " + goodXL;
		}
		validationReport(orderValue);

	}

	/**
	 * This method will validates for PriceType Tailing Stop Market and Action
	 * is Buy It validates by concatenating the Order Placed
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

	public void validateTrailingStopMarketBuy() {// @Author - Sushil 19-Apr-2017
													// Modified
		DecimalFormat df = new DecimalFormat("#.00");
		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value
					+ " @ Delta de déclenchement  "
					+ df.format(Double.parseDouble(triggerDelta_value)).replace(".", ",") + " $ Échéance " + goodXL;

		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value
					+ " @ Trigger Delta $" + df.format(Double.parseDouble(triggerDelta_value)) + " Good 'til " + goodXL;
		}
		validationReport(orderValue);

	}

	/**
	 * This method will validates for PriceType Stop Limit and Action is Buy It
	 * validates by concatenating the Order Placed
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
	public void validateStopLimitBuy() {// @Author - Sushil 19-Apr-2017 Modified
		DecimalFormat df = new DecimalFormat("#.00");

		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value
					+ " @ Déclencheur" + df.format(Double.parseDouble(triggerPriceValue)).replace(".", ",")
					+ " $ limite " + df.format(Double.parseDouble(limitPriceValue)).replace(".", ",") + " $ Échéance  "
					+ goodXL;

		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value + " @ Trigger $"
					+ df.format(Double.parseDouble(triggerPriceValue)) + " Limit $"
					+ df.format(Double.parseDouble(limitPriceValue)) + " Good 'til " + goodXL;
		}
		validationReport(orderValue);

	}

	// Acheter 1 TD Cours du marché stop @ Déclencheur 65,72 $ Échéance Jour

	/**
	 * This method will validates for PriceType Stop Market It validates by
	 * concatenating the Order Placed
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
	public void validateStopMarket() {// @Author - Sushil 19-Apr-2017 Modified
		DecimalFormat df = new DecimalFormat("#.00");

		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value

					+ " @ Déclencheur  " + df.format(Double.parseDouble(triggerPriceValue)).replace(".", ",")
					+ " $ Échéance " + goodXL;

		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " " + price_value

					+ " @ Trigger $" + df.format(Double.parseDouble(triggerPriceValue)) + " Good 'til " + goodXL;
		}
		validationReport(orderValue);

	}

	/**
	 * This method will validates for PriceType Limit and Action is Buy It
	 * validates by concatenating the Order Placed
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
		validationReport(orderValue);

	}

	/**
	 * This method will validates for PriceType Market and Action is Buy It
	 * validates by concatenating the Order Placed
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
	public void validateMarketBuy() {

		String orderValue = "";
		if (isLanguageFrench) {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " @ " + price_value

					+ " Échéance " + goodXL;// @Author - Sushil 19-Apr-2017
											// Modified
		} else {
			orderValue = actionToPerformXL + " " + quantityXL + " " + searchKeyword + " @ " + price_value

					+ " Good 'til " + goodXL;
		}
		validationReport(orderValue);

	}

	/**
	 * This method will Click on the Back Button from the Confirm Order Page
	 * 
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void confirmOrderClickBack() {
		Decorator();
		init();
		try {
			mobileAction.FuncClick(backButton, "Back");

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

	/**
	 * This method will validates ConfirmOrder Page where Action is Buy It
	 * validates by concatenating the Order Placed
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
	public void validateConfirmOrderBuy() { // @Author - Sushil 19-Apr-2017
											// Modified
		Decorator();
		init();
		try {
			mobileAction.FuncSwipeWhileElementNotFound(orderElement, false, 10, "up");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		confirmOrderValue = orderElement.getText();

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
	}

	/**
	 * This method will validates the orders and will report for pass or Fail
	 * 
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
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

			clicksendorder();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify confirm Order screen for switch Action
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifySwitchMutualConfirmDetails() {
		try {
			Decorator();
			if (!mobileAction.verifyElementIsPresent(estimated_total_cost)) {
				mobileAction.FunctionSwipe("up", 200, 100);
			}
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}

/*
 * 
 * 
 * 
 * 
 * 
 * import java.text.DecimalFormat;
 * 
 * public class HelloWorld{
 * 
 * public static void main(String []args){
 * 
 * String confirmOrderValue=
 * "Buy 1 TD Trailing Stop Limit @ Trigger Delta $1.00 Limit Delta $1.00 Good 'til Day"
 * ;
 * 
 * String price_value = "Trailing Stop Limit";
 * 
 * String goodXL ="Day";
 * 
 * String searchKeyword = "TD"; String triggerDelta_value = "1";
 * 
 * String limitDelta_value = "1"; String actionToPerformXL="Buy"; String
 * quantityXL="1"; DecimalFormat df = new DecimalFormat("#.00"); String
 * check=actionToPerformXL + " " + quantityXL + " " + searchKeyword + " "
 * +price_value+" @ Trigger Delta $" +
 * df.format(Double.parseDouble(triggerDelta_value)) + " Limit Delta $" +
 * df.format(Double.parseDouble(limitDelta_value)) + " Good 'til " + goodXL;
 * System.out.println(confirmOrderValue+" \n"+check); if
 * (confirmOrderValue.equals(check)) { System.out.println("Same"); }
 * 
 * } }
 * 
 * 
 * 
 * 
 * 
 * 
 */

// code for TSM

// import java.text.DecimalFormat;
//
// public class HelloWorld{
//
// public static void main(String []args){
//
// String confirmOrderValue="Buy 1 TD Trailing Stop Market @ Trigger Delta $1.00
// Good 'til Day";
//
// String price_value = "Trailing Stop Market";
//
// String goodXL ="Day";
//
// String searchKeyword = "TD";
// String triggerDelta_value = "1";
//
// String limitDelta_value = "1";
// String actionToPerformXL="Buy";
// String quantityXL="1";
// DecimalFormat df = new DecimalFormat("#.00");
// String check=actionToPerformXL + " " + quantityXL + " " + searchKeyword
// + " "+price_value+" @ Trigger Delta $" +
// df.format(Double.parseDouble(triggerDelta_value)) + " Good 'til " + goodXL;
// System.out.println(confirmOrderValue+" \n"+check);
// if (confirmOrderValue.equals(check)) {
// System.out.println("Same");
// }
//
// }
// }
