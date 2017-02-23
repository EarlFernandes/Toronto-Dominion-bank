package com.td.test.CDNMobile.pages;

import java.io.IOException;
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

public class ConfirmOrder extends _CommonPage {
	private static ConfirmOrder ConfirmOrder;

	@iOSFindBy(xpath = "//*[@label='Confirm Order' or contains(@label,'Confirmer l')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (@text='Confirm Order' or contains(@text,'Confirmer l'))]")
	private MobileElement confirmorder_header;

	@iOSFindBy(xpath = "//*[@label='Account' or @label='Compte']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account' or @text='Compte']")
	private MobileElement verifyaccount;

	@iOSFindBy(xpath = "//*[@label='Action & Quantity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Action & Quantity']")
	private MobileElement action_quantity;

	@iOSFindBy(xpath = "//*[@label='Price']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price']")
	private MobileElement price;

	@iOSFindBy(xpath = "//*[@label='Price']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price']")
	private MobileElement priceFRE;

	@iOSFindBy(xpath = "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trigger Price']")
	private MobileElement triggerprice;

	@iOSFindBy(xpath = "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Limit Price']")
	private MobileElement limitprice;

	@iOSFindBy(xpath = "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_trigger_delta_title_field' and @text='Trigger Delta']")
	private MobileElement triggerdelta;

	@iOSFindBy(xpath = "//*[@label='Annuler' or @label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and (@text='Cancel' or @text='Annuler')]")
	private MobileElement cancel;

	@iOSFindBy(xpath = "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Cancel']")
	private MobileElement confirmcancel;

	@iOSFindBy(xpath = "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Investing']")
	private MobileElement investingheader;

	@iOSFindBy(xpath = "//*[contains(@label,'Good')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Good')]")
	private MobileElement goodtill;

	@iOSFindBy(xpath = "//*[@label='Shareholder Type']")
	@AndroidFindBy(xpath = "//android.widget.TextView(@text,'Shareholder Type')]")
	private MobileElement shareholdertype;

	@iOSFindBy(xpath = "//*[@label='Buying Power Required']")
	@AndroidFindBy(xpath = "//android.widget.TextView(@text,'Buying Power Required')]")
	private MobileElement buyingpower_required;

	@iOSFindBy(xpath = "//*[@label='Estimated Principal Value' or contains(@label,'Principal estimé')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Estimated Principal Value' or contains(@text,'Principal estimé']")
	private MobileElement estimate_principle_value;

	@iOSFindBy(xpath = "//*[@label='Estimated Commission' or contains(@label,'Commission estimée')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Estimated Commission' or contains(@text,'Commission estimée']")
	private MobileElement estimate_comission;

	@iOSFindBy(xpath = "//*[@label='Estimated Total Cost' or contains(@label,'Total estimé')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/estTotalCostLabel' and (@text='Estimated Total Cost' or contains(@text,'Total estimé'))]")
	private MobileElement estimated_total_cost;

	@iOSFindBy(xpath = "//*[contains(@label,'Send Order') or contains(@label,'Envoyer l')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and (@text='Send Order' or contains(@text,'Envoyer l'))]")
	private MobileElement send_order;

	@iOSFindBy(xpath = "//*[contains(@label,'Account') or contains(@label,'Compte')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_account_label' and (@text='Account' or contains(@text,'Compte'))]")
	private MobileElement OrderAccountName;

	@iOSFindBy(xpath = "//*[contains(@label,'Action & Quantity')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Action & Quantity'] ")
	private MobileElement Action_and_quantity;

	@iOSFindBy(xpath = "//*[contains(@label,'Quantity Filled')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/progress_bar_caption' and @text='Quantity Filled']")
	private MobileElement quantityFiled;

	@iOSFindBy(xpath = "//*[contains(@label,'Price')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Price Type']")
	private MobileElement priceType;

	@iOSFindBy(xpath = "//*[contains(@label,'Limit Price')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and contains(@text,'Limit P']")
	private MobileElement LimitPrice;

	@iOSFindBy(xpath = "//*[contains(@label,'Order Status')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Order Status']")
	private MobileElement order_status;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation Number')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Confirmation Number']")
	private MobileElement confirmation_order;

	@iOSFindBy(xpath = "//*[contains(@label,'Order Placed')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Order Placed']")
	private MobileElement order_placed;

	@iOSFindBy(xpath = "//*[contains(@label,'Good')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and contains(@text,'Good')]")
	private MobileElement goodTil;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//*[@label='En cours']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='En cours']")
	private MobileElement progressBarFRE;

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
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
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
	 */
	public void verifyconfirm_order() throws InterruptedException {
		try {
			Decorator();
			String verify_confirm_order_header = "Verifying Confirm Order Page Header";
			mobileAction.verifyElementIsDisplayed(confirmorder_header, verify_confirm_order_header);
			/*String verify_account = "account verified";
			mobileAction.verifyElementIsDisplayed(verifyaccount, verify_account);
			String actionquantity = "Action And Quantity";
			mobileAction.verifyElementIsDisplayed(action_quantity, actionquantity);
			String Price = "Price";
			mobileAction.verifyElementIsDisplayed(price, Price);
			String GoodTill = "GoodTill";
			mobileAction.verifyElementIsDisplayed(goodtill, GoodTill);
			String Shareholdertype = "Shareholder Type";
			mobileAction.verifyElementIsDisplayed(shareholdertype, "Verify Shareholder Type");*/
			String buyingpower = "Buying Power Required";
			mobileAction.verifyElementIsDisplayed(buyingpower_required, buyingpower);

			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void orderConfirmDetails() throws Exception {
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
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void verifycdnmargin_buy() throws InterruptedException {
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
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void verifySendOrder() throws InterruptedException {
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
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void verifycancel_cdnmargin_buy_triggerdelta() throws InterruptedException {
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
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify CDN Margin Limit in the Confirm Order page
	 * 
	 * @return void
	 * @throws Exception 
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifycdnmargin_limit() throws Exception {

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
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */

	public void cdncash_sell_stopmarket() throws InterruptedException {
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
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void verifycdncash() throws InterruptedException {
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
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
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
	 */

	public void clickcancel() {
		Decorator();
		try {
			mobileAction.FuncClick(cancel, "Cancel");
			mobileAction.FuncClick(confirmcancel, "Confirm Cancel");
			mobileAction.verifyElementIsDisplayed(investingheader, "Verifying Investing Landing Page");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void clicksendorder() {
		Decorator();
		try {
			mobileAction.FuncClick(send_order, "Click Send Order Button");

			mobileAction.waitForElementToVanish(progressBar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will CDN margin sell trailing stop market in the Confirm Order Page
	 * 
	 * @return void
	 * @throws Exception 
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void cdnmargin_sell_trailingstopmarket() throws Exception {

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
			mobileAction.verifyElementIsDisplayed(cancel, "Cancel Button");
			mobileAction.verifyElementIsDisplayed(send_order, "Send Order Button");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will CDN margin sell trailing stop limit in the Confirm Order Page
	 * 
	 * @return void
	 * @throws Exception 
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void cdncash_sell_trailingstoplimit() throws Exception {

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
			mobileAction.verifyElementIsDisplayed(cancel, "Cancel Button");
			mobileAction.verifyElementIsDisplayed(send_order, "Send Order Button");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will US margin short buy to cover market in the confirm order page
	 * 
	 * @return void
	 * @throws Exception 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void usmarginshort_buytocover_market() throws Exception {

		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(confirmorder_header, "Verifying Confirm Order Page Header");
			mobileAction.verifyElementIsDisplayed(verifyaccount, "account verified");
			mobileAction.verifyElementIsDisplayed(action_quantity, "Action And Quantity");
			mobileAction.verifyElementIsDisplayed(price, "Price");
			mobileAction.verifyElementIsDisplayed(goodtill, "GoodTill");
			mobileAction.verifyElementIsDisplayed(shareholdertype, "Verify Shareholder Type");
			mobileAction.verifyElementIsDisplayed(buyingpower_required, "Buying Power Required");
			mobileAction.FunCSwipeandScroll(estimated_total_cost,false);
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			mobileAction.verifyElementIsDisplayed(estimate_comission, "Estimated Commission");
			mobileAction.verifyElementIsDisplayed(estimated_total_cost, "Estimated Total Cost");
			mobileAction.verifyElementIsDisplayed(cancel, "Cancel Button");
			mobileAction.verifyElementIsDisplayed(send_order, "Send Order Button");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
