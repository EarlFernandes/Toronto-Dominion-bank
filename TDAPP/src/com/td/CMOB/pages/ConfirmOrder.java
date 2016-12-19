package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ConfirmOrder extends _CommonPage{
	private static  ConfirmOrder  ConfirmOrder;
	
	@iOSFindBy(xpath="//*[@label='Confirm Order']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Confirm Order']")
	private MobileElement cofirmorder_header;
	
	@iOSFindBy(xpath="//*[@label='Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account']")
	private MobileElement verifyaccount;
	
	@iOSFindBy(xpath = "//*[@label='Action & Quantity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Action & Quantity']")
	private MobileElement action_quantity;
	
	@iOSFindBy(xpath = "//*[@label='Price']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price']")
	private MobileElement price;
	
	@iOSFindBy(xpath = "//*[contains(@label='Good')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Good')]")
	private MobileElement goodtill;
	
	
	@iOSFindBy(xpath = "//*[@label='Shareholder Type']")
	@AndroidFindBy(xpath = "//android.widget.TextView(@text,'Shareholder Type')]")
	private MobileElement shareholdertype;
	
	
	@iOSFindBy(xpath = "//*[@label='Buying Power Required']")
	@AndroidFindBy(xpath = "//android.widget.TextView(@text,'Buying Power Required')]")
	private MobileElement buyingpower_required;
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Estimated Principal Value']")
	private MobileElement estimate_principle_value;
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Estimated Commission']")
	private MobileElement estimate_comission;
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/estTotalCostLabel' and @text='Estimated Total Cost']")
	private MobileElement estimated_total_cost;
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Send Order']")
	private MobileElement send_order;
	
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
		System.out.println("Decorator method has been finished");
	}
	/**
	 * This method will click on the Trade button on Investing page
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
	public void clickconfirm_order() throws InterruptedException{

		try {
			Decorator();
			
			String verify_confirm_order_header = "Verifying Confirm Order Page Header";
			mobileAction.verifyElementIsDisplayed(cofirmorder_header,verify_confirm_order_header);
			
			String verify_account = "account verified";
			mobileAction.verifyElementIsDisplayed(verifyaccount,verify_account);
			
			String actionquantity = "Action And Quantity";
			mobileAction.verifyElementIsDisplayed(action_quantity,actionquantity );
			
			String Price = "Price";
			mobileAction.verifyElementIsDisplayed(price,Price);
			
			String GoodTill = "GoodTill";
			mobileAction.verifyElementIsDisplayed(goodtill,GoodTill);
			
			String Shareholdertype = "Shareholder Type";
			mobileAction.FuncScrollToText(Shareholdertype);
			mobileAction.verifyElementIsDisplayed(shareholdertype, "Verify Shareholder Type");
			
			String buyingpower = "Buying Power Required";
			mobileAction.verifyElementIsDisplayed(buyingpower_required,buyingpower);
			
			/*String estimatedprinciple = "Estimated Principal Value";
			mobileAction.FuncScrollToText(estimatedprinciple);
			mobileAction.verifyElementIsDisplayed(estimate_principle_value, "Verify Estimated Principal Value");
			
			String EstimatedCommission = "Estimated Commission";
			mobileAction.verifyElementIsDisplayed(estimate_comission,EstimatedCommission);
			
			String EstimatedTotalCost = "Estimated Total Cost";
			mobileAction.verifyElementIsDisplayed(estimated_total_cost,EstimatedTotalCost);
			
			mobileAction.FuncClick(send_order, "Click Send Order Button");*/
			
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}	
}

