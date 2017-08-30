package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.sun.jna.Platform;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TransfersHistory extends _CommonPage {

	private static TransfersHistory TransfersHistory;

	public synchronized static TransfersHistory get() {
		if (TransfersHistory == null) {
			TransfersHistory = new TransfersHistory();
		}
		return TransfersHistory;
	}

	// TODO:: use mobileElementUsingXPath for converting elements

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='History']")
	private MobileElement pageHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Money Sent']/following-sibling::XCUIElementTypeStaticText[@label='See all']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Money Sent']/following-sibling::android.widget.TextView[@text='See all']")
	private MobileElement moneySentSeeAll;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='PENDING']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyHeadingTextView' and @text='PENDING']")
	private MobileElement pendingCategory;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'View Details')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='View Details']")
	private MobileElement viewDetailsHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Money Sent']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement transactionStatus;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header' and @text='Money sent - sent']")
	private MobileElement moneySentStatus;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='PENDING']/../following-sibling::XCUIElementTypeCell")
	//@AndroidFindBy(xpath = "//android.widget.TextView[@text='PENDING']/../following-sibling::android.widget.LinearLayout/android.widget.TextView[@resource-id='com.td:id/historyTransferItemName']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sent']")
	private List<MobileElement> pendingTransactions;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='COMPLETED']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='COMPLETED']")
	private MobileElement completedCategory;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='COMPLETED']/../following-sibling::XCUIElementTypeCell")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cancelled' or @text='Deposited']")
	private List<MobileElement> completedTransactions;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' or contains(@resource-id,'com.td:id/sendMoneyCard')]")
	private MobileElement transaction;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Money Received']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' or contains(@resource-id,'com.td:id/transfersReceivedCard')]")
	private MobileElement receivedTransaction;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/history_details_footer_button' and @text='Cancel Transfer']")
	private MobileElement cancelTransferBtn;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Cancel Transfer']")
	private MobileElement cancelTransferHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Choose an account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' or @text='Deposit To']/following-sibling::android.widget.TextView")
	private MobileElement depositToDropDown;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='DEPOSIT TO']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose an account']/following-sibling::android.widget.ListView/android.widget.RelativeLayout")
	private MobileElement depositToAccount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_sub_heading']")
	private MobileElement depositToAccountNumber;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done' or @text='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/cancel_send_money_reason_edit_text']")
	private MobileElement messageField;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_footer' and @text='Continue']")
	private MobileElement continueBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button' and @text='Cancel Transfer']")
	private MobileElement cancelTransfer;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date Sent']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Sent']")
	private MobileElement dateSent;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date Sent']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Sent']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement dateSentVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date of Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Deposited']")
	private MobileElement dateDeposited;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date of Transfer']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Deposited']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement dateDepositedVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='From Account']")
	private MobileElement fromAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='From Account']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement fromAccountVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount']")
	private MobileElement amount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amountVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposited To']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposited To']")
	private MobileElement depositedTo;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposited To']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposited To']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement depositedToVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirmation #']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation #']")
	private MobileElement confirmationNumber;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirmation #']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation #']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement confirmationNumberVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Recipient']")
	private MobileElement recipient;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Recipient']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement recipientVal;
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sender']")
	private MobileElement sender;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sender']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement senderVal;
	

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount']")
	private MobileElement amountRecip;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amountRecipVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit To']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposit To']")
	private MobileElement depositTo;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit To']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposit To']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement depositToVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Message']")
	private MobileElement message;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Message']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement messageVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transfer Cancelled']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header' and contains(@text,'Transfer Cancelled')]")
	private MobileElement cancelConfirmationMsg;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subSubHeader' and contains(@text,'Confirmation')]")
	private MobileElement confirmationCode;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@value='1']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;
	
	MobileElement initialsCircle = null;
	MobileElement receiverName = null;
	MobileElement amountSent = null;
	MobileElement transacStatus = null;
	MobileElement transacCategory = null;

	MobileElement senderName = null;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyPageHeader() { 

		Decorator();
		try {

			mobileAction.FuncClick(pageHeader, "Transfer History page header");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifySentMoneyCard() {

		Decorator();
		try {

			String receiver = getTestdata("ToAccount");
			String[] toAccArr = receiver.toUpperCase().split(" ");
			String initials = "";

			for (int i = 0; i < toAccArr.length; i++) {

				initials = initials.concat("" + toAccArr[i].charAt(0));
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				initialsCircle = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/contactInitials' and @text='" + initials
								+ "']");
				receiverName = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/contactName' and @text='" + receiver + "']");
				amountSent = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/contactName' and @text='" + receiver
								+ "']/following-sibling::android.widget.TextView[2]");
				transacStatus = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/contactName' and @text='" + receiver
								+ "']/following-sibling::android.widget.TextView[@text='"+getTestdata("TransactionStatus")+"' or @text='"+getTestdata("TransactionStatus").toUpperCase()+"']");
			} else {
				initialsCircle = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + initials + "']");
				receiverName = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + receiver + "']");
				amountSent = mobileAction.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + receiver
						+ "']/following-sibling::XCUIElementTypeStaticText[2]");
				transacStatus = mobileAction.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + receiver
						+ "']/following-sibling::XCUIElementTypeStaticText[@label='"+getTestdata("TransactionStatus")+"' or @label='"+getTestdata("TransactionStatus").toUpperCase()+"']");
			}
			mobileAction.verifyElementIsDisplayed(initialsCircle, "Initials: " + initials);
			mobileAction.verifyElementIsDisplayed(receiverName, "Receiver Name: " + receiver);
			mobileAction.verifyTextEquality(receiver, receiverName.getText());
			mobileAction.verifyElementIsDisplayed(amountSent, "Amount sent: " + amountSent.getText());
		
			mobileAction.verifyTextEquality(transacStatus.getText(), getTestdata("TransactionStatus"));

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickMoneySentSeeAll() { // new Updated

		Decorator();
		try {

			mobileAction.FuncClick(moneySentSeeAll, "See All");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyPendingTransaction() { 

		Decorator();
		try {

			String receiver = getTestdata("ToAccount");

			mobileAction.verifyElementIsDisplayed(pendingCategory, "PENDING");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				receiverName = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' and @text='"
								+ receiver + "']");
				transacStatus = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' and @text='"
								+ receiver + "']/following-sibling::android.widget.TextView[1]");
			} else {
				receiverName = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + receiver + "']");
				transacStatus = mobileAction.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + receiver
						+ "']/following-sibling::XCUIElementTypeStaticText");

			}
			mobileAction.verifyElementIsDisplayed(receiverName, "Receiver Name: " + receiver);
			mobileAction.verifyTextEquality(receiver, receiverName.getText());
			mobileAction.verifyTextEquality(getTestdata("TransactionStatus"), transacStatus.getText());

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyTransactionDetails() { 

		Decorator();
		try {

			String transactionStatusXL=getTestdata("TransactionStatus");
			
			mobileAction.verifyElementIsDisplayed(viewDetailsHeader, "View Details page header");
			mobileAction.verifyElementIsDisplayed(transactionStatus, transactionStatus.getText());
			
			//mobileAction.verifyTextEquality(transactionStatus.getText(), getTestdata("TransactionStatus"));
			
			mobileAction.verifyElementIsDisplayed(dateSent, "Date sent");
			mobileAction.verifyElementIsDisplayed(dateSentVal, "Date value " + dateSentVal.getText());

			mobileAction.verifyElementIsDisplayed(fromAccount, "From Account");
			mobileAction.verifyElementIsDisplayed(fromAccountVal, "From Account value " + fromAccountVal.getText());

			mobileAction.verifyElementIsDisplayed(amount, "Amount");
			mobileAction.verifyElementIsDisplayed(amountVal, "Amount value " + amountVal.getText());

			mobileAction.verifyElementIsDisplayed(recipient, "Recipient");
			mobileAction.verifyElementIsDisplayed(recipientVal, "Recipient value " + recipientVal.getText());

			mobileAction.FunctionSwipe("up", 200, 200);
			
			mobileAction.verifyElementIsDisplayed(confirmationNumber, "Confirmation #");
			mobileAction.verifyElementIsDisplayed(confirmationNumberVal,
					"Confirmation number value " + confirmationNumberVal.getText());

			if (!(transactionStatusXL.equalsIgnoreCase("Deposited") || transactionStatusXL.equalsIgnoreCase("Cancelled"))) {
				mobileAction.verifyElementIsDisplayed(cancelTransferBtn, "Cancel Transfer Button");
			}

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickTransaction() { // new Updated

		Decorator();
		try {

			String receiver = getTestdata("ToAccount");
			String transactionStatus=getTestdata("TransactionStatus");

			if (StringUtils.isEmpty(receiver)) {
				mobileAction.FuncClick(transaction, "Transaction");
			} else {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					receiverName = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='"+transactionStatus+"' or @text='"+transactionStatus.toUpperCase()+"']/preceding-sibling::android.widget.TextView[@text='"+receiver+"' or @text='"+receiver.toUpperCase()+"']");
				} else {
					receiverName = mobileAction
							.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + receiver + "' or @label='" + receiver.toUpperCase() + "']");

				}
				mobileAction.FuncClick(receiverName, "Receiver: " + receiver);

			}
		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyActivityPage() { // new Updated

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(pendingCategory, "PENDING");

			for (int i = 0; i < pendingTransactions.size(); i++) {
				mobileAction.verifyElementIsDisplayed(pendingTransactions.get(i), "Pending Transaction " + i);
			}

			
			mobileAction.FunCnewSwipe(completedCategory, false, 6);
			
			if(mobileAction.verifyElementIsPresent(completedCategory)){
			mobileAction.verifyElementIsDisplayed(completedCategory, "COMPLETE");

			mobileAction.FunctionSwipe("up", 2000, 200);

			for (int i = 0; i < completedTransactions.size(); i++) {
				mobileAction.verifyElementIsDisplayed(completedTransactions.get(i), "Completed Transaction " + i);
			}
			}

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickReceivedTransaction() { // new Updated

		Decorator();
		try {

			String sender = getTestdata("FromAccount");
			String transactionStatus=getTestdata("TransactionStatus");
			mobileAction.FunctionSwipe("up", 200, 200);
			
			if (StringUtils.isEmpty(sender)) {
				mobileAction.FuncClick(receivedTransaction, "Received Transaction");
			} else {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					senderName = mobileAction.mobileElementUsingXPath(
							"//android.widget.TextView[@text='"+transactionStatus+"' or @text='"+transactionStatus.toUpperCase()+"']/preceding-sibling::android.widget.TextView[@text='"+sender+"' or @text='"+sender.toUpperCase()+"']");
				} else {
					senderName = mobileAction
							.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + sender + "' or @label='" + sender.toUpperCase() + "']");
				}

				mobileAction.FuncClick(senderName, "Sender: " + sender);

			}
		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyReceivedTransDetails() { // new Updated

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(viewDetailsHeader, "View Details page header");
			mobileAction.verifyElementIsDisplayed(transactionStatus, transactionStatus.getText());

			mobileAction.verifyElementIsDisplayed(dateDeposited, "Date Deposited");
			mobileAction.verifyElementIsDisplayed(dateDepositedVal, "Date value " + dateDepositedVal.getText());

			mobileAction.verifyElementIsDisplayed(sender, "Sender");
			mobileAction.verifyElementIsDisplayed(senderVal, "Sender value " + senderVal.getText());

			mobileAction.verifyElementIsDisplayed(amount, "Amount");
			mobileAction.verifyElementIsDisplayed(amountVal, "Amount value " + amountVal.getText());

			mobileAction.verifyElementIsDisplayed(depositedTo, "Deposited To");
			mobileAction.verifyElementIsDisplayed(depositedToVal, "Recipient value " + depositedToVal.getText());

			mobileAction.FunctionSwipe("up", 200, 200);
			
			mobileAction.verifyElementIsDisplayed(confirmationNumber, "Confirmation #");
			mobileAction.verifyElementIsDisplayed(confirmationNumberVal,
					"Confirmation number value " + confirmationNumberVal.getText());

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickCancelTransferBtn() { // new Updated

		Decorator();
		try {

			mobileAction.FuncClick(cancelTransferBtn, "Cancel Transfer Button");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void cancelTransfer() { // new Updated

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(cancelTransferHeader, "Cancel Transfer header");
			mobileAction.FuncClick(depositToDropDown, "Deposit to dropdown");
			mobileAction.FuncClick(depositToAccount, depositToAccountNumber.getText());

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				//mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(messageField, "Message");
				mobileAction.FuncSendKeys(messageField, getTestdata("Message"));
				mobileAction.FuncHideKeyboard();

			} else {

				mobileAction.FuncClick(messageField, "Message");
				mobileAction.FuncSendKeys(messageField, getTestdata("Message"));
				mobileAction.FuncClick(done, "Done");
			}

			mobileAction.FuncClick(continueBtn, "Continue Button");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyCancelDetails() { // new Updated

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(recipient, "Recipient");
			mobileAction.verifyElementIsDisplayed(recipientVal, recipientVal.getText());
		
			mobileAction.verifyElementIsDisplayed(amountRecip, "Amount");
			mobileAction.verifyElementIsDisplayed(amountRecipVal, amountRecipVal.getText());
			mobileAction.verifyElementIsDisplayed(depositTo, "Deposit To");
			mobileAction.verifyElementIsDisplayed(depositToVal, depositToVal.getText());

			if (mobileAction.verifyElementIsPresent(message)) {
				mobileAction.verifyElementIsDisplayed(message, "Message");
				mobileAction.verifyElementIsDisplayed(messageVal, messageVal.getText());
			}

			mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");

			mobileAction.waitForElementToVanish(progressBar);
			
		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyCancelConfirmation() { // new Updated

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(cancelConfirmationMsg,
					"Transfer Cancelled");
			mobileAction.verifyElementIsDisplayed(confirmationCode, confirmationCode.getText());
			mobileAction.verifyElementIsDisplayed(recipient, "Recipient");
			mobileAction.verifyElementIsDisplayed(recipientVal, recipientVal.getText());
			mobileAction.verifyElementIsDisplayed(amountRecip, "Amount");
			mobileAction.verifyElementIsDisplayed(amountRecipVal, amountRecipVal.getText());
			mobileAction.verifyElementIsDisplayed(depositTo, "Deposit To");
			mobileAction.verifyElementIsDisplayed(depositToVal, depositToVal.getText());
			
			if(mobileAction.verifyElementIsPresent(message)){
				mobileAction.verifyElementIsDisplayed(message, "Message");
				mobileAction.verifyElementIsDisplayed(messageVal, "Message: "+messageVal.getText());
			}
			

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	
	/**
	 * @author Ashraf This method will verify the page header.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyTransactionOnActivity() { // new Updated

		Decorator();
		try {

			String receiver=getTestdata("ToAccount");
			String transactionStatus=getTestdata("TransactionStatus");
			String transactionCategory=null;
			if(transactionStatus.equalsIgnoreCase("declined") || transactionStatus.equalsIgnoreCase("sent")){
				transactionCategory="PENDING";
			}else{
				transactionCategory="COMPLETED";
			}
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				receiverName = mobileAction
						.mobileElementUsingXPath("//android.widget.TextView[@text='" + receiver + "' or @text='" + receiver.toUpperCase() + "']");
				transacStatus = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='"+receiver+"' or @text='" + receiver.toUpperCase() + "']/following-sibling::android.widget.TextView[@text='"+transactionStatus+"' or @text='"+transactionStatus.toUpperCase()+"']");
				transacCategory=mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='" + transactionCategory
						+ "']");
			}else{
			receiverName = mobileAction
					.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + receiver + "' or @label='" + receiver.toUpperCase() + "']");
			transacStatus = mobileAction.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + receiver
					+ "' or @label='" + receiver.toUpperCase() + "']/following-sibling::XCUIElementTypeStaticText");
			transacCategory=mobileAction.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='" + transactionCategory
					+ "']");
			}
			
			mobileAction.verifyElementIsDisplayed(receiverName, "Receiver Name: "+receiver);
			mobileAction.verifyTextEquality(transacStatus.getText(), transactionStatus);
			mobileAction.verifyElementIsDisplayed(transacCategory, "Transaction Category: "+transactionCategory);
			
		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	
}
