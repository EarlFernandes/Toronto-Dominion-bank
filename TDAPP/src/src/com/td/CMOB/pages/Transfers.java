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

public class Transfers extends _CommonPage {

	private static Transfers Transfers;

	/*@iOSFindBy(xpath = "//*[@label='Pending Interac e-Transfer View pending and cancelled Interac e-']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/canTotal' and @text='View pending and cancelled Interac e-Transfers']")
	private MobileElement pending_transfer;*/
	
	@iOSFindBy(xpath = "//*[contains(@label,'Pending Interac e-Transfer')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/canTotal' and @text='View pending and cancelled Interac e-Transfers']")
	private MobileElement pending_transfer;

	@iOSFindBy(xpath= "//*[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement transfers_header;

	@iOSFindBy(xpath = "//*[@label='Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
	private MobileElement Interac_e_Transfer_button;
	

	@iOSFindBy(xpath= "//*[@label='Between My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1' and @text='Move money quickly and easily']")
	private MobileElement btw_my_accnts;
	
	@iOSFindBy(xpath="//*[@label='In progress']")
	private MobileElement progrees_bar;
	
	@iOSFindBy(xpath= "//*[contains(@label,'Manage Recipients Add, edit or delete Interac e-Transfer recipie')]")
	//@AndroidFindBy(xpath = " ")
	private MobileElement manageRecipient;
	
	@iOSFindBy(xpath="//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	String transfer_Header_Value = "Transfers";
	String confirm_Header = "Confirm";
	String confirm_transfer_value = "Thank you!";

	public synchronized static Transfers get() {
		if (Transfers == null) {
			Transfers = new Transfers();
		}
		return Transfers;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
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
			Thread.sleep(5000);
			transfers_header.isDisplayed();
			mobileAction.FuncClick(Interac_e_Transfer_button, "Interac e_Transfer");
			mobileAction.waitForElementToVanish(progrees_bar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
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
			
			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer");
			
		} catch (NoSuchElementException   | IOException e) {
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
			mobileAction.FuncClick(pending_transfer, "Pending Transfers");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

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
			mobileAction.FuncClick(btw_my_accnts, "Between my Accounts");
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

	

}
