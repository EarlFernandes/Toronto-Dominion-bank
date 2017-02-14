package com.td.test.CDNMobile.pages;

import java.io.IOException;
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

public class MenuPage extends _CommonPage {

	private static MenuPage MenuPage;

	@iOSFindBy(xpath= "//*[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Transfers']")
	private MobileElement transfers;


	@iOSFindBy(xpath= "//*[@label='Bills']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Bills']")
	private MobileElement bills;
	
	
	@iOSFindBy(xpath= "//*[contains(@label,'Investing') or @label='Comptes Placements directs TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Investing']")
	private MobileElement investing;

	@iOSFindBy(xpath= "//*[@label='Comptes Placements directs TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Investing']")
	private MobileElement investingFRE;
	
	@iOSFindBy(xpath ="//*[@label='Mobile Deposit']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Mobile Deposit']")
	private MobileElement mobile_Deposit_button;
	
	
	@iOSFindBy(xpath ="//*[@label='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='My Accounts']")
	private MobileElement accounts_button;
	
	@iOSFindBy(xpath = "//*[@label='Virements'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard'and @text='VIREMENTS']")
	private MobileElement french_transfers;
	
	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	
	@iOSFindBy(xpath = "//*[@label='Contact Us']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Contact Us']")
	private MobileElement contactUs;
	
	@iOSFindBy(xpath = "//*[@label='Home']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']")
	private MobileElement home_button;

	@iOSFindBy(xpath = "//*[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
	private MobileElement trade;
	
	//French
	
//	@iOSFindBy(xpath = "//*[@label='Comptes Placements directs TD']")
//	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Comptes Placements directs TD']")
//	private MobileElement investing_FRE;
	
	public synchronized static MenuPage get() {
		if (MenuPage == null) {
			MenuPage = new MenuPage();
		}
		return MenuPage;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	/**
	 * This method will click on the Transfers button on menu page
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
	public void clickMenuTransfer() {

		Decorator();
		try {
			mobileAction.FuncClick(transfers, "Transfers");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	/**
	 * This method will click on the Home button on menu page
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
	public void clickMenuHome() {

		Decorator();
		try {
			mobileAction.FuncClick(home_button, "Home");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	
	
	/**
	 * This method will click on the Transfers button on menu page
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
	public void clickTransfers_InFrench() {

		Decorator();
		try {
			mobileAction.FuncClick(french_transfers, "Transfers");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	/**
	 * This method will click on the Transfers button on menu page
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
	public void clickMenuAccounts() {

		Decorator();
		try {
			mobileAction.FuncClick(accounts_button, "Accounts");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	
	/**
	 * This method will click on the Investing button on menu page
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
	public void clickMenuInvesting() {

		Decorator();
		try {

			boolean isLanguageFrench = MainScreen.valueMap.get("Language").equals("FRE");


			MobileElement investingElement = isLanguageFrench ? investingFRE : investing;
			mobileAction.FuncClick(investingElement, "Investing");
			mobileAction.waitForElementToVanish(progressBar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the Contact us button on menu page
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
	public void clickContactUs() {

		Decorator();
		try {
			mobileAction.FuncClick(contactUs, "contactUs");
			
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	/**
	 * This method will click on the Transfers button on menu page
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
	public void clickMenuBills() {

		Decorator();
		try {
			mobileAction.FuncClick(bills, "Bills");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the mobile deposit button on menu page
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
	public void mobile_Deposit_click() {
		Decorator();
		try {
			String mobile_Deposit = "Mobile Deposit";
			
			mobileAction.FuncClick(mobile_Deposit_button, "Mobile_Deposit_Button");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
//	public void clickMenuInvestingFRE() {
//
//		
//		
//		Decorator();
//		try {
//			mobileAction.FuncClick(investing_FRE, "Investing");
//			mobileAction.waitForElementToVanish(progressBar);
//		} catch (NoSuchElementException | InterruptedException | IOException e) {
//			System.err.println("TestCase has failed.");
//			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
//		}
//
//	}

	public void clickMenuTrade() {

		Decorator();
		try {
			mobileAction.FuncClick(trade, "Trade");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	
}
