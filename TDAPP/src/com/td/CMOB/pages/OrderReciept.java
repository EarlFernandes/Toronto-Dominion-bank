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

public class OrderReciept extends _CommonPage  {
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
	
	
	@iOSFindBy(xpath = "//*[@label='Orders']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and @text='Good 'til']")
	private MobileElement btnorders;
	
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
		System.out.println("Decorator method has been finished");
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
   public void ordertab()
   { 
	   try{
		   Decorator();
		   mobileAction.verifyElementIsDisplayed(order, "Order");
		   mobileAction.verifyElementIsDisplayed(account, "Account");
		   mobileAction.verifyElementIsDisplayed(orderplaced, "Order Placed");
	   }
	   catch (NoSuchElementException e) {
			e.printStackTrace();
			
	 }
   }
   
   public void orderDetails()
   { 
	   try{
		   Decorator();
		   mobileAction.FuncClick(orderdetails, "Order Detail");
		   mobileAction.verifyElementIsDisplayed(actionquty, "Action & Quantity");
		   mobileAction.verifyElementIsDisplayed(price, "Price");
		   mobileAction.verifyElementIsDisplayed(Good,"Good 'til");
	   }
	   catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 }
	   catch (InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 }
	   catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 }
   }
   
   /**
	 * This method will click order button on the receipt screen.
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
   public void orders()
   { 
	   try{
		   Decorator();
		   mobileAction.FuncClick(btnorders, "Orders");
	   }
	   catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 } catch (InterruptedException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	   
   }
}
