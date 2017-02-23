package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class ManageTDMobilePayment extends _CommonPage{
	
	private static ManageTDMobilePayment ManageTDMobilePayment;
	
	String cardname = getTestdata("CardName");
	String selectcard = "//android.widget.TextView[@resource-id='com.td:id/card_type_text_view' and @text='" + cardname + "')]";
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/manage_settings_text_view' and @text='Manage Settings']")
	private MobileElement managesettingicon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/card_type_text_view' and contains(@text,'AEROPLAN')]")
	private MobileElement 	clickcard;
	
	

	
	
	
	public synchronized static  ManageTDMobilePayment get() {
		if ( ManageTDMobilePayment == null) {
			 ManageTDMobilePayment = new  ManageTDMobilePayment();
		}
		return  ManageTDMobilePayment;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}
	/**
	 * This method will click manage settings
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
		 * @throws Exception
		 * 
		 * @throws InterruptedException
		 *             In case an exception occurs while clicking over the element.
		 * @throws IOException
		 *             If there is problem while reporting.
		 * @throws NoSuchElementException
		 *             In case the element is not found over the screen.
		 */
	public void clickcard() {


		Decorator();
		try {
			mobileAction.FuncClick(clickcard, "Click  Card");
			} catch (NoSuchElementException|InterruptedException |IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	 * This method will click manage settings
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
		 * @throws Exception
		 * 
		 * @throws InterruptedException
		 *             In case an exception occurs while clicking over the element.
		 * @throws IOException
		 *             If there is problem while reporting.
		 * @throws NoSuchElementException
		 *             In case the element is not found over the screen.
		 */
	public void managesettings() {


		Decorator();
		try {
			mobileAction.FuncClick(managesettingicon, "Click Manage Settings");
			} catch (NoSuchElementException|InterruptedException |IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
/**
 * This method will click on the added card
 * @throws NoSuchElementException
 *             In case the element is not found over the screen
 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
public void selectcard() {


	Decorator();
	try {
		MobileElement cardVal=(MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(selectcard));
		mobileAction.FuncClick(cardVal, "Click the card");
		} catch (NoSuchElementException|InterruptedException |IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}
	
}
