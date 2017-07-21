package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PendingInteracTransfer extends _CommonPage {

	private static PendingInteracTransfer PendingInteracTransfer;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Pending Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and contains(@text,'Pending Interac')]") // changed
																																			// by
																																			// rashmi
	private MobileElement pending_Interace_Transfer_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='-sender' or @label='-Sender']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/layout_etransfer_sender_layout' or @resource-id='com.td:id/layout_etransfer_sender']")
	private MobileElement sender;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='-sender']")
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement senderList;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Pending Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pending Interac e-Transfer']")
	private MobileElement pendingTransfer_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'Select sender')]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/layout_etransfer_sender_layout']")
	private MobileElement selectSender;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='-Balance-' or @label='-Balance'][1]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	private MobileElement selectTransaction;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Cancel Interac e-Transfer']")
	private MobileElement cancelTransfer;

	// for android only
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSpecialAction']")
	private MobileElement cancelSender;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'Deposit To')]") // Need
																				// to
																				// change
																				// account
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/deposit_account']")
	private MobileElement depositToAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Continue']")
	private MobileElement depositToContinue;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Close']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/entransfer_btn_cancel' and @text='Close']")
	private MobileElement close;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2' and @text='Close']")
	private MobileElement cancel;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Don')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text=\"Don't Cancel\"]")
	private MobileElement dontCancel;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement transferHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
	private MobileElement receiptHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Home']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and and @text='Home']")
	private MobileElement home;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Quick Access']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title'and @text='Home']")
	private MobileElement dashboard;

	// @iOSFindBy(id =
	// "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2][@label='Confirm']")
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Confirm']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/entransfer_btn_finish' and @text='Confirm']")
	private MobileElement cnfrmCancellation;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@label='PENDING E-TRANSFERS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/pending_transfers']")
	private MobileElement clickPendingIcon;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation']")
	private MobileElement confirmation_Val;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Interac e-Transfer reclaimed and deposited successfully']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Interac e-Transfer reclaimed and deposited successfully']")
	private MobileElement cancelSuccessMsg;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_Val']")
	private MobileElement cancelCnfrmnVal;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntsList;

	@AndroidFindBy(xpath = "//android.widget.ScrollView[@index='0']")
	private MobileElement pendingIEMTList;

	@iOSFindBy(id = "//XCUIElementTypeStaticText[@label='-sender']")
	private MobileElement verifySender;

	@iOSFindBy(id = "//XCUIElementTypeStaticText[@label='Processing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Processing']")
	private MobileElement verifyStatus;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation']")
	private MobileElement confirm_Val;

	@iOSFindBy(id = "//XCUIElementTypeStaticText[@label='-Title']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/pending_transfers' and @text='PENDING E-TRANSFERS']")
	private MobileElement verifyDepositAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/entransfer_recipient_name']")
	private MobileElement recipientName;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/etransfer_recipient_email']")
	private MobileElement recipientEmailId;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-Recipient']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/entransfer_recipient_name']")
	private MobileElement verifyAccountName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/etransfer_recipient_email']")
	private MobileElement verifyAccountEmailId;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-Deposit To']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/entransfer_deposit_account']")
	private MobileElement verifyAccountNum;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_amount_header']")
	private MobileElement verifyAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	private MobileElement selectSenderVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'-Balance')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer']")
	private MobileElement Balance;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='My Accounts']")
	private MobileElement my_Accounts;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer']")
	private MobileElement balanceNew;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'GO BACK HOME')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/home']")
	private MobileElement gobackhomeButton;

	public synchronized static PendingInteracTransfer get() {
		if (PendingInteracTransfer == null) {
			PendingInteracTransfer = new PendingInteracTransfer();
		}
		return PendingInteracTransfer;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	/**
	 * This method will click on Pending Interac_e transfer in Transfer Screen
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * @return void
	 * 
	 */
	public void pending_interac_transfer() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(pending_Interace_Transfer_Header,
					"Pending Interac Transfer Landing Page verified");

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
	 * This method will verify the sender profile Pending e Transfers list is
	 * not displayed until the sender is selected
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifysender() {
		Decorator();
		try {
			String Sender = "Verifying sender";
			mobileAction.verifyElementIsDisplayed(sender, Sender);

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
	 * This method will verify sender dropdown list of senders profiles on
	 * Pending Interac_e transfer Page
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void * @throws Exception If there is problem while finding that
	 *         element.
	 * 
	 */

	public void verifylistofsender() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				WebDriverWait wait = new WebDriverWait(CL.GetAppiumDriver(), 60);

				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[@label='-sender' or @label='-Sender']")));

				mobileAction.FuncClick(selectSender, "sender");
				String senderVal = getTestdata("Sender");
				System.out.println("Sender:" + senderVal);
				String selectSender = selectSenderVal.getAttribute("label");
				mobileAction.verifyTextEquality(senderVal, selectSender);

			} else {
				String listofsender = "Verifying List Of sender";
				mobileAction.FuncClick(sender, "Clicksender");
				mobileAction.verifyElementIsDisplayed(senderList, listofsender);

			}
		} catch (NoSuchElementException | IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will cancel the interac e transfer and deposit the the amount
	 * to the account
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
	 * 
	 */
	public void cancelPendingTransfer() {
		Decorator();

		String sender_selectSender = getTestdata("Sender");
		String select_senderValue = "//android.widget.TextView[contains(@text,'" + sender_selectSender + "')]"; // changed
																												// by
																												// rashmi

		String transfer_fromAccount = getTestdata("FromAccount");

		String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";

		String firstPart = "//XCUIElementTypeCell[";
		String secondPart = "]/XCUIElementTypeStaticText[1]";

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_selectSender);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount, transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(cancelSuccessMsg,
						"Interac e-Transfer reclaimed and deposited successfully");
				String conf_val = mobileAction.getText(cancelCnfrmnVal);

			} else {

				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.waitForElementToVanish(progressBar);
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 1, "down", true);
					mobileAction.waitForElementToVanish(progressBar);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(cancelSuccessMsg,
						"Interac e-Transfer reclaimed and deposited successfully");
				String conf_val = mobileAction.getText(cancelCnfrmnVal);
			}
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
	 * This method will cancel the pending interac e transfer and deposit the
	 * the amount to the account and verify the popup
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
	 * 
	 * @return void
	 * 
	 */
	public void confirmscreen_cancelbutton() {
		Decorator();

		String sender_selectSender = getTestdata("Sender");
		String select_senderValue = "//android.widget.TextView[contains(@text,'" + sender_selectSender + "')]"; // changed
																												// by
																												// rashmi

		String transfer_fromAccount = getTestdata("FromAccount");

		String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";

		String firstPart = "//XCUIElementTypeCell[";
		String secondPart = "]/XCUIElementTypeStaticText[1]";

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_selectSender);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount, transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(close, "Click Close");
				mobileAction.verifyElementIsDisplayed(cancel, "Popup is displayed with cancel option");
				mobileAction.verifyElementIsDisplayed(dontCancel, "Popup is displayed with Don't cancel option");

			} else {

				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.waitForElementToVanish(progressBar);
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(select_senderValue, true, 2, "Up");
					mobileAction.waitForElementToVanish(progressBar);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(close, "Click Close");
				mobileAction.verifyElementIsDisplayed(cancel, "Popup is displayed with cancel option");
				mobileAction.verifyElementIsDisplayed(dontCancel, "Popup is displayed with Don't cancel option");

			}
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
	 * This method will verify the cancelled pending interac e transfer list not
	 * displayed on Pending Interac e transfer page
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void verifylist() {
		Decorator();

		String sender_selectSender = getTestdata("Sender");
		String select_senderValue = "//android.widget.TextView[contains(@text,'" + sender_selectSender + "')]"; // changed
																												// by
																												// rashmi

		String transfer_fromAccount = getTestdata("FromAccount");

		String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";

		String firstPart = "//XCUIElementTypeCell[";
		String secondPart = "]/XCUIElementTypeStaticText[1]";

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectSender, "sender");
				mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_selectSender);
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount, transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				mobileAction.FuncClick(clickPendingIcon, "Click Pending Interac e-Transfer Icon");
				mobileAction.FuncClick(selectSender, "sender");
				mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_selectSender);
				mobileAction.verifyElementIsDisplayed(pendingTransfer_Header,
						"The Cancelled pending interac e list is not appearing in pending interac transfer page");

			} else {

				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				mobileAction.FuncClick(selectSender, "sender");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 5, "down", true);
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				mobileAction.FuncClick(clickPendingIcon, "Click Pending Interac e-Transfer Icon");
				mobileAction.FuncClick(selectSender, "sender");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 5, "down", true);
				mobileAction.verifyElementIsDisplayed(pendingTransfer_Header,
						"The Cancelled pending interac e list is not appearing in pending interac transfer page");

			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will verify the pending interac e transfer list is displaying
	 * on Pending Interac Receipt page
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void canceltransfer() {
		Decorator();

		String sender_selectSender = getTestdata("Sender");
		String select_senderValue = "//android.widget.TextView[contains(@text,'" + sender_selectSender + "')]"; // changed
																												// by
																												// rashmi

		String transfer_fromAccount = getTestdata("FromAccount");

		String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";

		String firstPart = "//XCUIElementTypeCell[";
		String secondPart = "]/XCUIElementTypeStaticText[1]";

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				TouchAction action2 = null;
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_selectSender);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount, transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				String confrmVal = mobileAction.getText(confirmation_Val);
				System.out.println("Confirmation:" + confrmVal);
				// MobileElement cnfmVal=(MobileElement) ((AppiumDriver)
				// CL.GetDriver())
				// .findElement(By.xpath(confrmVal));

				action2 = new TouchAction((CL.GetAppiumDriver())).longPress(confirmation_Val, 2);

				CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");

			} else {
				TouchAction action2 = null;
				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.waitForElementToVanish(progressBar);

					// mobileAction.FuncElementSwipeWhileNotFound(acntsList,
					// select_senderValue, 0, "up", true);
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(select_senderValue, true, 5, "up");
					// add click cancel when cancel is still present, this is an
					// issue for android
					if (mobileAction.verifyElementIsPresent(cancelSender)) {
						mobileAction.FuncClick(cancelSender, "Cancel");
					}

					mobileAction.waitForElementToVanish(progressBar);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				Thread.sleep(3000);
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				String confrmVal = mobileAction.getText(confirmation_Val);

				action2 = new TouchAction((CL.GetAppiumDriver())).longPress(confirmation_Val, 2);

				CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");

			}
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
	 * This method will confirm the pending interac e transfer and deposit the
	 * the amount to the account
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void confirmbutton() {
		Decorator();

		String sender_selectSender = getTestdata("Sender");
		String select_senderValue = "//android.widget.TextView[contains(@text,'" + sender_selectSender + "')]"; // changed
																												// by
																												// rashmi

		String transfer_fromAccount = getTestdata("FromAccount");

		String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";

		String firstPart = "//XCUIElementTypeCell[";
		String secondPart = "]/XCUIElementTypeStaticText[1]";

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_selectSender);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount, transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue, "Continue");

				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(home, "Home Button Clicked");
				// mobileAction.FuncClick(gobackhomeButton,"Go Back Home Button
				// Clicked");
				mobileAction.verifyElementIsDisplayed(dashboard, "Dashboard Page Opened");

			} else {

				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					MobileElement sender = mobileAction.verifyElementUsingXPath(select_senderValue, "Sender");
					mobileAction.FuncClick(sender, "Sender");
					mobileAction.waitForElementToDisappear(select_senderValue);
				}
				// mobileAction.FuncElementSwipeWhileNotFound(acntsList,
				// select_senderValue, 3, "down", true);
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				Thread.sleep(3000);
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(home, "Home Button Clicked");
				mobileAction.verifyElementIsDisplayed(dashboard, "Dashboard Page Opened");

			}
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
	 * This method will cancel the pending interac e transfer and deposit the
	 * the amount to the account
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void cancelbutton() {
		Decorator();

		String sender_selectSender = getTestdata("Sender");
		String select_senderValue = "//android.widget.TextView[contains(@text,'" + sender_selectSender + "')]"; // changed
																												// by
																												// rashmi

		String transfer_fromAccount = getTestdata("FromAccount");

		String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";

		String firstPart = "//XCUIElementTypeCell[";
		String secondPart = "]/XCUIElementTypeStaticText[1]";

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_selectSender);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount, transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(close, "Click Close");
				mobileAction.verifyElementIsDisplayed(cancel, "Popup is displayed");
				mobileAction.FuncClick(cancel, "Cancel");
				mobileAction.verifyElementIsDisplayed(transferHeader, "Transfer Landing Page is displayed");

			} else {

				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.waitForElementToVanish(progressBar);
					MobileElement Sender = mobileAction.verifyElementUsingXPath(select_senderValue, "Sender");
					mobileAction.FuncClick(Sender, "Sender");
					mobileAction.waitForElementToDisappear(select_senderValue);
					// mobileAction.FuncElementSwipeWhileNotFound(acntsList,
					// select_senderValue, 1, "down", true);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(close, "Click Close");
				mobileAction.verifyElementIsDisplayed(cancel, "Popup is displayed");
				mobileAction.FuncClick(cancel, "Cancel");
				mobileAction.verifyElementIsDisplayed(transferHeader, "Transfer Landing Page is displayed");

			}
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
	 * This method will confirm the pending interac e transfer and deposit the
	 * the amount to the account
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void confirmstatus() {
		Decorator();

		String sender_selectSender = getTestdata("Sender");
		String select_senderValue = "//android.widget.TextView[contains(@text,'" + sender_selectSender + "')]"; // changed
																												// by
																												// rashmi

		String transfer_fromAccount = getTestdata("FromAccount");

		String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";

		String firstPart = "//XCUIElementTypeCell[";
		String secondPart = "]/XCUIElementTypeStaticText[1]";

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_selectSender);

				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount, transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				mobileAction.verifyElementIsDisplayed(cancelSuccessMsg,
						"Interac e-Transfer reclaimed and deposited successfully");

			} else {

				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");

				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				mobileAction.verifyElementIsDisplayed(cancelSuccessMsg,
						"Interac e-Transfer reclaimed and deposited successfully");

			}
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
	 * This method will verify the pending interac e transfer list is displaying
	 * on Pending Interac Receipt page
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void verifyconfirmation() {
		Decorator();

		String sender_selectSender = getTestdata("Sender");
		String select_senderValue = "//android.widget.TextView[contains(@text,'" + sender_selectSender + "')]"; // changed
																												// by
																												// rashmi

		String transfer_fromAccount = getTestdata("FromAccount");

		String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";

		String firstPart = "//XCUIElementTypeCell[";
		String secondPart = "]/XCUIElementTypeStaticText[1]";

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_selectSender);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");

				mobileAction.verifyElementIsDisplayed(confirm_Val, transfer_fromAccount);

				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount, transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.verifyElementIsDisplayed(recipientName, transfer_fromAccount);
				mobileAction.verifyElementIsDisplayed(recipientEmailId, transfer_fromAccount);

				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				mobileAction.verifyElementIsDisplayed(verifyAccountName, "Verifying Accout Name and Email Id");
				mobileAction.verifyElementIsDisplayed(verifyAccountNum, "Verifying Account Number");
				mobileAction.verifyElementIsDisplayed(verifyAmount, "Verifying Amount");

			} else {
				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				if (mobileAction.verifyElementIsPresent(selectSender)) {
					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.waitForElementToVanish(progressBar);
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 2, "down", true);
					mobileAction.waitForElementToVanish(progressBar);
				}
				mobileAction.FuncClick(selectTransaction, "Select Transaction");

				mobileAction.verifyElementIsDisplayed(confirm_Val, transfer_fromAccount);

				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount, transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue, "Continue");
				mobileAction.verifyElementIsDisplayed(recipientName, transfer_fromAccount);
				mobileAction.verifyElementIsDisplayed(recipientEmailId, transfer_fromAccount);

				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
				mobileAction.verifyElementIsDisplayed(verifyAccountName, "Verifying Accout Name");
				mobileAction.verifyElementIsDisplayed(verifyAccountEmailId, "Verifying Email Id");
				mobileAction.verifyElementIsDisplayed(verifyAccountNum, "Verifying Account Number");
				mobileAction.verifyElementIsDisplayed(verifyAmount, "Verifying Amount");

			}
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
	 * This method will cancel the interac e transfer and deposit the the amount
	 * to the account
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void verify_CancelPendingTransfer() {

		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				// mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
				// //get deposit to account
				// String deposit_account_Info =
				// mobileAction.getValue(depositToAccount);
				// String deposit_to_account =
				// mobileAction.FuncGetValByRegx(deposit_account_Info, "\\d+");
				// String balance = Balance.getAttribute("value");
				// System.out.println("Old Balance:" + balance);
				// mobileAction.FuncClick(depositToContinue,"Continue");
				// mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				// mobileAction.verifyElementIsDisplayed(cancelSuccessMsg,
				// "Interac e-Transfer reclaimed and deposited successfully");
				// String conf_val = mobileAction.getText(cancelCnfrmnVal);
				// mobileAction.FuncClick(menu, "Menu");
				// mobileAction.FuncClick(my_Accounts, "My Accounts");
				// System.out.println("From account:" + from_account);
				// mobileAction.FuncSelectElementInTable(accountsPage_Table,firstPart,accountssecondPart,deposit_to_account);
				// String balancenew = balanceNew.getAttribute("value");
				// System.out.println("New Balance:" + balancenew);
				//
				// if(balance.equalsIgnoreCase(balancenew)){
				// System.err.println("TestCase has failed.");
				// }
				// else{
				// //no home button can be found at this page
				// //mobileAction.FuncClick(home, "home button");
				// }

			} else {

				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				// Thread.sleep(2000);
				// String balance = Balance.getAttribute("value");
				// mobileAction.FuncClick(depositToContinue,"Continue");
				// mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				// mobileAction.verifyElementIsDisplayed(cancelSuccessMsg,
				// "Interac e-Transfer reclaimed and deposited successfully");
				// String conf_val = mobileAction.getText(cancelCnfrmnVal);
				// mobileAction.FuncClick(menu, "Menu");
				// mobileAction.FuncClick(my_Accounts, "My Accounts");
				// mobileAction.FuncSelectElementInTable(accountsPage_Table,firstPart,accountssecondPart,from_account);
				// String balancenew = balanceNew.getAttribute("value");
				//
				// if(balance.equalsIgnoreCase(balancenew)){
				// System.err.println("TestCase has failed.");
				// }
				// else{
				// //no home button can be found at this page
				// //mobileAction.FuncClick(home, "home button");
				// }
			}
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
}
