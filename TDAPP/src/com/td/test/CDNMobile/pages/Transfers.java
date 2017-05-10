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

	@iOSFindBy(accessibility = "TRANSFERVIEW_PENDING")
	private MobileElement pending_transfer;

	// FIXME: Ask may to add this (footer)
	@iOSFindBy(accessibility = "UNKNOWN_ID")
	private MobileElement footer;

	
	@iOSFindBy(accessibility = "TRANSFERVIEW_PENDING_DES")
	private MobileElement pending_transfer_desc;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement transfers_header;
	

	@iOSFindBy(accessibility = "TRANSFERVIEW_ETRANSFER")
	private MobileElement Interac_e_Transfer_button;

	@iOSFindBy(accessibility = "TRANSFERVIEW_ETRANSFER_DES")
	private MobileElement Interac_e_Transfer_button_desc;
	
	@iOSFindBy(accessibility = "TRANSFERVIEW_BETWEENACCOUNTS")
	private MobileElement btw_my_accnts;
	
	@iOSFindBy(accessibility = "TRANSFERVIEW_BETWEENACCOUNTS_DES")
	private MobileElement btw_my_accnts_desc;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progrees_bar;
	
	@iOSFindBy(accessibility = "TRANSFERVIEW_RECIPIENTS")
	private MobileElement manageRecipient;

	@iOSFindBy(accessibility = "TRANSFERVIEW_RECIPIENTS_DES")
	private MobileElement manageRecipientDesc;
	
	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
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
			initElementBetweenMyAccounts();
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
		initElementInteracETransfer();
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
			initElementManageRecipients();
			mobileAction.FuncClick(manageRecipient, "Manage Recipients");
			mobileAction.waitForElementToVanish(progressBar);
			Thread.sleep(10000);
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
			initElementPendingTransfer();
			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer");
			mobileAction.FuncClick(pending_transfer, "Pending Transfers");
			Thread.sleep(5000);
			
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	private void initElementPendingTransfer() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				pending_transfer = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfersTransfersHintTextPendingInteracETransfer").replaceAll("\\<.*?>","") + "']", "Pending and Completed");
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

	private void initElementInteracETransfer() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				Interac_e_Transfer_button = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfersTransfersNavRowHeaderInteracETransfer").replaceAll("\\<.*?>","") + "']", "Send Money");
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

	private void initElementManageRecipients() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				manageRecipient = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("imtNavRowManageRecipients") + "']", "Manage Recipients");
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
	
	private void initElementBetweenMyAccounts() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				btw_my_accnts = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("transfersTransfersNavRowHeaderBetweenMyAccounts") + "']", "Transfer Between");
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
				mobileAction.verifyTextEquality(transfers_header.getText(), mobileAction.getAppString("transfers_str"));
				mobileAction.verifyTextEquality(btw_my_accnts.getText(), mobileAction.getAppString("transfersTransfersNavRowHeaderBetweenMyAccounts"));
				mobileAction.verifyTextEquality(btw_my_accnts_desc.getText(), mobileAction.getAppString("transfersTransfersHintTextBetweenMyAccounts"));
				mobileAction.verifyTextEquality(Interac_e_Transfer_button.getText(), mobileAction.getAppString("e_transfer_str").replaceAll("\\<.*?>",""));
				mobileAction.verifyTextEquality(Interac_e_Transfer_button_desc.getText(), mobileAction.getAppString("transfersTransfersHintTextInteracETransfer").replaceAll("\\<.*?>",""));
				mobileAction.verifyTextEquality(pending_transfer.getText(), mobileAction.getAppString("str_pending_interact_etransfer").replaceAll("\\<.*?>",""));
				mobileAction.verifyTextEquality(pending_transfer_desc.getText(), mobileAction.getAppString("transfersTransfersHintTextPendingInteracETransfer").replaceAll("\\<.*?>",""));
				mobileAction.verifyTextEquality(manageRecipient.getText(), mobileAction.getAppString("imtNavRowManageRecipients"));
				mobileAction.verifyTextEquality(manageRecipientDesc.getText(), mobileAction.getAppString("imtHintTextManageRecipients").replaceAll("\\<.*?>",""));
				// FIXME: Uncomment when may adds the id
				//mobileAction.verifyTextEquality(footer.getText(), mobileAction.getAppString("transfer_faq_question"));
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("transfers_str") + "']", "Transfers title");
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
