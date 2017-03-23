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

	@iOSFindBy(xpath = "//*[contains(@label,'Pending Interac e-Transfer')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pending Interac e-Transfer']")
	private MobileElement pending_transfer;


	@iOSFindBy(xpath= "//*[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement transfers_header;
	

	@iOSFindBy(xpath = "//*[@label='Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TableRow[@resource-id='com.td:id/tableRow2']")
	private MobileElement Interac_e_Transfer_button;
	
	@iOSFindBy(xpath= "//*[@label='Between My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TableRow[@resource-id='com.td:id/tableRow1']")
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
			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer");
			mobileAction.FuncClick(btw_my_accnts, "Between my Accounts");
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
			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer");
			mobileAction.FuncClick(pending_transfer, "Pending Transfers");
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
			
			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer");
			
		} catch (NoSuchElementException   | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the transfer page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyTransferTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// FIXME: Header is not detected?
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/action_bar_title' and @text='" + mobileAction.getAppString("transfers_str") + "']", "Transfers title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfersTransfersNavRowHeaderBetweenMyAccounts") + "']", "Between My accounts");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfersTransfersHintTextBetweenMyAccounts") + "']", "Move money quickly");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfersTransfersHintTextInteracETransfer") + "']", "Email money quickly");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("imtNavRowManageRecipients") + "']", "Manage recipients");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfer_faq_question") + "']", "Transfer faq");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("imtHintTextManageRecipients").replaceAll("\\<.*?>","") + "']", "Add, edit or delete");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfersTransfersHintTextPendingInteracETransfer").replaceAll("\\<.*?>","") + "']", "View pending");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfersTransfersNavRowHeaderPendingInteracETransfer").replaceAll("\\<.*?>","") + "']", "Pending interact");				
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfersTransfersNavRowHeaderInteracETransfer").replaceAll("\\<.*?>","") + "']", "Interac e-transfer");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	

}
