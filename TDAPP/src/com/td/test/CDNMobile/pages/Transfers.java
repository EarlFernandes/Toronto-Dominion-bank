package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Transfers extends _CommonPage {

	private static Transfers Transfers;

	/*@iOSFindBy(xpath = "//*[@label='Pending Interac e-Transfer View pending and cancelled Interac e-']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/canTotal' and @text='View pending and cancelled Interac e-Transfers']")
	private MobileElement pending_transfer;*/
	
	public synchronized static Transfers get() {
		if (Transfers == null) {
			Transfers = new Transfers();
		}
		return Transfers;
	}

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Pending Interac e-Transfer')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pending Interac e-Transfer']")
	private MobileElement pending_Transfer;


	@iOSFindBy(xpath= "//XCUIElementTypeOther[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement transfers_Header;
	

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
	private MobileElement Interac_e_Transfer_Button;
	
	@iOSFindBy(xpath= "//XCUIElementTypeStaticText[@label='Between My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1' and @text='Move money quickly and easily']")
	private MobileElement btw_My_Accnts;
	
	@iOSFindBy(xpath="//XCUIElementTypeActivityIndicator[@label='In progress']")
	private MobileElement progrees_Bar;
	
	@iOSFindBy(xpath= "//XCUIElementTypeStaticText[contains(@label,'Manage Recipients Add, edit or delete Interac e-Transfer recipie')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Recipients']")
	private MobileElement manageRecipient;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='com.td' and @instance='2']")
	private MobileElement TD;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Always']")
	private MobileElement alwaysBtn;

	@iOSFindBy(xpath="//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	String transfer_Header_Value = "Transfers";
	String confirm_Header = "Confirm";

	String confirm_transfer_value = "Thank you!";

	/**
	 * This method will click on Between my accounts button
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void clickBetweenMyAccountsTransfers() {
		try {
			Decorator();
			//mobileAction.FuncClick(TD, "TDAPP");
			//mobileAction.FuncClick(alwaysBtn, "Always");
			mobileAction.verifyElementIsDisplayed(transfers_Header, "Transfer");
			mobileAction.FuncClick(btw_My_Accnts, "Between my Accounts");
			mobileAction.waitForElementToVanish(progressBar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on Interac e-transfers button
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void clickInterac_e_Transfer() {
		Decorator();
		try {
			//Thread.sleep(5000);
			transfers_Header.isDisplayed();
			mobileAction.FuncClick(Interac_e_Transfer_Button, "Interac e_Transfer");
			mobileAction.waitForElementToVanish(progrees_Bar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	

	/**
	 * This method will click on Manage Recipients
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void clickManageRecipients() {
		try {
			Decorator();
			mobileAction.FuncClick(manageRecipient, "Manage Recipients");
			mobileAction.waitForElementToVanish(progressBar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on Pending Transfers button
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void clickPendingTransfers() {
		try {
			Decorator();
			//mobileAction.FuncClick(TD, "TDAPP");
			//mobileAction.FuncClick(alwaysBtn, "Always");
			mobileAction.verifyElementIsDisplayed(transfers_Header, "Transfer");
			mobileAction.FuncClick(pending_Transfer, "Pending Transfers");
			Thread.sleep(5000);
			
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	/**
	 * This method will click on verify the Transfer Header
	 * 
	 * 
	 * @return  NoSuchElementException
	 * @return  IOException
	 */
	public void verifyTransferHeader() {

	
		Decorator();
		try {
			
			mobileAction.verifyElementIsDisplayed(transfers_Header, "Transfer");
			
		} catch (NoSuchElementException   | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	

}
