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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Money Sent' or @label='Fonds virés']/following-sibling::XCUIElementTypeButton[@label='See all' or @label='Tout afficher']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Money Sent' or @text='Fonds virés']/following-sibling::android.widget.TextView[@text='See all' or @text='Tout afficher']")
	private MobileElement moneySentSeeAll;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Money Received' or @label='Fonds reçus']/following-sibling::XCUIElementTypeButton[@label='See all']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Money Received' or @text='Fonds reçus']/following-sibling::android.widget.TextView[@text='See all']")
	private MobileElement moneyReceivedSeeAll;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='PENDING' or @label='EN ATTENTE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyHeadingTextView' and (@text='PENDING' or @text='EN ATTENTE')]")
	private MobileElement pendingCategory;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'View Details') or contains(@label,'Détails')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (@text='View Details' or @text='Détails')]")
	private MobileElement viewDetailsHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Money Sent' or @label='Fonds virés']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement transactionStatus;

	@iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Money Received' or @label='Fonds reçus']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement receivedTransactionStatus;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header' and @text='Money sent - sent']")
	private MobileElement moneySentStatus;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='PENDING' or @label='EN ATTENTE']/../following-sibling::XCUIElementTypeCell")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sent' or @text='Envoyé']")
	private List<MobileElement> pendingTransactions;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='COMPLETED' or @label='EFFECTUÉS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='COMPLETED' or @text='EFFECTUÉS']")
	private MobileElement completedCategory;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='COMPLETED' or @label='EFFECTUÉS']/../following-sibling::XCUIElementTypeCell")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cancelled' or @text='Deposited' or @text='Annulé' or @text='Déposé']")
	private List<MobileElement> completedTransactions;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' or contains(@resource-id,'com.td:id/sendMoneyCard')]")
	private MobileElement transaction;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Money Received' or @label='Fonds reçus']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' or contains(@resource-id,'com.td:id/transfersReceivedCard')]")
	private MobileElement receivedTransaction;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Transfer' or @label='Annuler le virement']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/history_details_footer_button']")
	private MobileElement cancelTransferBtn;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement cancelTransferHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Choose an account' or @label='Choisir un compte']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label']/following-sibling::android.widget.TextView")
	private MobileElement depositToDropDown;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='DEPOSIT TO' or @label='Compte de destination' or @label='COMPTE DE DESTINATION']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_action_sheet_title']/following-sibling::android.widget.ListView/android.widget.RelativeLayout")
	private MobileElement depositToAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='DEPOSIT TO' or @label='Compte de destination' or @label='COMPTE DE DESTINATION']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_sub_heading']")
	private MobileElement depositToAccountNumber;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done' or @text='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/cancel_send_money_reason_edit_text']")
	private MobileElement messageField;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue' or @label='Continuer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_footer']")
	private MobileElement continueBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Transfer' or @label='Annuler le virement']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button']")
	private MobileElement cancelTransfer;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date Sent' or @label='Date du virement']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Sent' or @text='Date du virement']")
	private MobileElement dateSent;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date Sent' or @label='Date du virement']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Sent' or @text='Date du virement']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement dateSentVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date Deposited' or @label='Date du dépôt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Deposited' or @text='Date du dépôt']")
	private MobileElement dateDeposited;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date Deposited' or @label='Date du dépôt']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Deposited' or @text='Date du dépôt']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement dateDepositedVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account' or @label='Compte de provenance']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='From Account' or @text='Compte de provenance']")
	private MobileElement fromAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account' or @label='Compte de provenance']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='From Account' or @text='Compte de provenance']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement fromAccountVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount' or @text='Montant']")
	private MobileElement amount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount' or @text='Montant']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amountVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit To' or @label='Compte de destination']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposited To' or @text='Compte de destination']")
	private MobileElement depositedTo;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit To' or @label='Compte de destination']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposited To' or @text='Compte de destination']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement depositedToVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirmation #' or @label='N° de confirmation']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation #' or @text='N° de confirmation']")
	private MobileElement confirmationNumber;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirmation #' or @label='N° de confirmation']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation #' or @text='N° de confirmation']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement confirmationNumberVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient' or @label='Destinataire']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Recipient' or @text='Destinataire']")
	private MobileElement recipient;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient' or @label='Destinataire']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Recipient' or @text='Destinataire']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement recipientVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender' or @label='Expéditeur']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sender' or @text='Expéditeur']")
	private MobileElement sender;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender' or @label='Expéditeur']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sender' or @text='Expéditeur']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement senderVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount' or @text='Montant']")
	private MobileElement amountRecip;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount' or @text='Montant']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amountRecipVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit To' or @label='Compte de destination']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposit To' or @text='Compte de destination']")
	private MobileElement depositTo;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit To' or @label='Compte de destination']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposit To' or @text='Compte de destination']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement depositToVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Message']")
	private MobileElement message;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Message']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement messageVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transfer Cancelled' or @label='[FR]Transfer Cancelled']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement cancelConfirmationMsg;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #') or contains(@label,'N° de confirmation')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subSubHeader']")
	private MobileElement confirmationCode;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@value='1']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	String platform = CL.getTestDataInstance().getMobilePlatForm();

	MobileElement initialsCircle = null;
	MobileElement receiverName = null;
	MobileElement amountSent = null;
	MobileElement transacStatus = null;
	MobileElement transacCategory = null;

	MobileElement senderName = null;

	String transStatus = null;

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
	 * @author Ashraf This method will verify the send money card.
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

			getTransactionStatus();

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
								+ "']/following-sibling::android.widget.TextView[@text='" + transStatus + "' or @text='"
								+ transStatus.toUpperCase() + "']");

				mobileAction.verifyElementIsDisplayed(initialsCircle, "Initials: " + initials);
				mobileAction.verifyElementIsDisplayed(receiverName, "Receiver Name: " + receiver);
				mobileAction.verifyTextEquality(receiver, receiverName.getText());
				mobileAction.verifyElementIsDisplayed(amountSent, "Amount sent: " + amountSent.getText());

				mobileAction.verifyTextEquality(transacStatus.getText(), transStatus);

			} else {

				initialsCircle = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeButton[contains(@label,'" + initials + "')]");
				receiverName = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeButton[contains(@label,'" + receiver + "')]");
				amountSent = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeButton[contains(@label,'" + receiver + "') and contains(@label,'$')]");
				transacStatus = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeButton[contains(@label,'" + receiver + "') and (contains(@label,'"
								+ transStatus + "') or contains(@label,'" + transStatus.toUpperCase() + "'))]");

				mobileAction.verifyElementIsDisplayed(initialsCircle, "Initials: " + initials);
				mobileAction.verifyElementIsDisplayed(receiverName, "Receiver Name: " + receiver);
				mobileAction.verifyTextContains(receiverName.getText(), receiver);
				mobileAction.verifyElementIsDisplayed(amountSent, "Amount sent: " + amountSent.getText());
				mobileAction.verifyTextContains(transacStatus.getText(), transStatus);
			}

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf Mulla This method will return the transaction status as
	 *         per the value entered in test data file and assign it to the
	 *         global variable 'transStatus'. You only need to call this method
	 *         in your methods.
	 */
	public void getTransactionStatus() {
		// transfers_str
		String androidKey = mobileAction.getAppString("transfers_str");
		String iOSKey = mobileAction.getAppString("transfers_str");
		String language = null;

		if (androidKey.equalsIgnoreCase("Transfers") || iOSKey.equalsIgnoreCase("Transfers")) {
			language = "en";
		} else {
			language = "fr";
		}

		switch (getTestdata("TransactionStatus")) {
		case "Sent":

			transStatus = (language.equalsIgnoreCase("en")) ? "Sent" : "Envoyé";

			break;
		case "Deposited":

			transStatus = (language.equalsIgnoreCase("en")) ? "Deposited" : "Déposé";

			break;
		case "Cancelled":

			transStatus = (language.equalsIgnoreCase("en")) ? "Cancelled" : "Annulé";

			break;
		case "Declined":

			transStatus = (language.equalsIgnoreCase("en")) ? "Declined" : "Refusé";

			break;
		case "Received":

			transStatus = (language.equalsIgnoreCase("en")) ? "Received" : "Reçus";

			break;
		}

	}

	/**
	 * @author Ashraf This method will click on See All button for Money sent
	 *         transactions.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickMoneySentSeeAll() {

		int counter = 0;

		Decorator();
		try {

			while (!mobileAction.verifyElementIsPresent(getReceiver()) && counter < 3) {
				mobileAction.FunctionSwipe("left", 200, 200);
				mobileAction.waitForElementToVanish(progressBar);
				counter++;
			}
			counter = 0;
			mobileAction.FuncClick(moneySentSeeAll, "See All");
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
	 * @author Ashraf This method will click on See All button for receive money
	 *         transactions.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickMoneyReceivedSeeAll() {

		Decorator();
		try {

			mobileAction.FuncClick(moneyReceivedSeeAll, "See All");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the Pending transaction on Money
	 *         sent activity page.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyPendingTransaction() {

		Decorator();
		try {

			getTransactionStatus();

			String receiver = getTestdata("ToAccount");

			mobileAction.verifyElementIsDisplayed(pendingCategory, "PENDING");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				receiverName = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' and @text='"
								+ receiver + "']");
				transacStatus = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' and @text='"
								+ receiver + "']/following-sibling::android.widget.TextView[1]");

				mobileAction.verifyElementIsDisplayed(receiverName, "Receiver Name: " + receiver);
				mobileAction.verifyTextEquality(receiver, receiverName.getText());
				mobileAction.verifyTextEquality(transStatus, transacStatus.getText());

			} else {
				receiverName = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeButton[contains(@label,'" + receiver + "')]");
				transacStatus = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeButton[contains(@label,'" + receiver + "') and (contains(@label,'"
								+ transStatus + "') or contains(@label,'" + transStatus.toUpperCase() + "'))]");

				mobileAction.verifyElementIsDisplayed(receiverName, "Receiver Name: " + receiver);
				mobileAction.verifyTextContains(receiverName.getText(), receiver);
				mobileAction.verifyTextContains(transacStatus.getText(), transStatus);

			}

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the send money transaction
	 *         details.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyTransactionDetails() {

		Decorator();
		try {

			getTransactionStatus();

			mobileAction.verifyElementIsDisplayed(viewDetailsHeader, "View Details page header");
			mobileAction.verifyElementIsDisplayed(transactionStatus, transactionStatus.getText());

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

			if (!(transStatus.equalsIgnoreCase("Deposited") || transStatus.equalsIgnoreCase("Cancelled")
					|| transStatus.equalsIgnoreCase("Déposé") || transStatus.equalsIgnoreCase("Annulé"))) {
				mobileAction.verifyElementIsDisplayed(cancelTransferBtn, "Cancel Transfer Button");
			}

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will click on the specified transaction
	 *         sent/Received.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickTransaction() {

		Decorator();
		try {

			String receiver = getTestdata("ToAccount");

			if (StringUtils.isEmpty(receiver)) {
				mobileAction.FuncClick(transaction, "Transaction");
			} else {

				mobileAction.FuncClick(getReceiver(), "Receiver: " + receiver);
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
	 * @author Ashraf This method will return the receiver name in a send money
	 *         or receive money card.
	 * @return
	 */
	public MobileElement getReceiver() {

		Decorator();
		String receiver = getTestdata("ToAccount");
		getTransactionStatus();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				receiverName = mobileAction
						.mobileElementUsingXPath("//android.widget.TextView[@text='" + transStatus + "' or @text='"
								+ transStatus.toUpperCase() + "']/preceding-sibling::android.widget.TextView[@text='"
								+ receiver + "' or @text='" + receiver.toUpperCase() + "']");
			} else {

				receiverName = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeButton[contains(@label,'" + receiver + "') and (contains(@label,'"
								+ transStatus + "') or contains(@label,'" + transStatus.toUpperCase() + "'))]");

			}
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}

		return receiverName;
	}

	/**
	 * @author Ashraf This method will verify the details present on money sent
	 *         activity page.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyActivityPage() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(pendingCategory, "PENDING");

			for (int i = 0; i < pendingTransactions.size() && i < 3; i++) {
				mobileAction.verifyElementIsDisplayed(pendingTransactions.get(i), "Pending Transaction " + i);
			}

			mobileAction.FunCnewSwipe(completedCategory, false, 4);

			if (mobileAction.verifyElementIsPresent(completedCategory)) {
				mobileAction.verifyElementIsDisplayed(completedCategory, "COMPLETE");

				mobileAction.FunctionSwipe("up", 2000, 200);

				for (int i = 0; i < completedTransactions.size() && i < 3; i++) {
					mobileAction.verifyElementIsDisplayed(completedTransactions.get(i), "Completed Transaction " + i);
				}
			} else {

				for (int i = 0; i < 4; i++)
					mobileAction.FunctionSwipe("down", 200, 200);
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
	 * @author Ashraf This method will click on the first received money card.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickReceivedTransaction() {

		int counter = 0;

		Decorator();
		try {

			String sender = getTestdata("FromAccount");

			mobileAction.FunctionSwipe("up", 200, 200);

			if (StringUtils.isEmpty(sender)) {
				mobileAction.FuncClick(receivedTransaction, "Received Transaction");
			} else {

				while (!mobileAction.verifyElementIsPresent(getSender()) && counter < 3) {
					mobileAction.FunctionSwipe("left", 200, 200);
					mobileAction.waitForElementToVanish(progressBar);
					mobileAction.FunctionSwipe("up", 200, 200);
					counter++;
				}

				counter = 0;
				mobileAction.FuncClick(getSender(), "Sender: " + sender);

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
	 * @author Ashraf This method will return the sender element.
	 * @return
	 */
	public MobileElement getSender() {

		Decorator();

		String sender = getTestdata("FromAccount");
		getTransactionStatus();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				senderName = mobileAction
						.mobileElementUsingXPath("//android.widget.TextView[@text='" + transStatus + "' or @text='"
								+ transStatus.toUpperCase() + "']/preceding-sibling::android.widget.TextView[@text='"
								+ sender + "' or @text='" + sender.toUpperCase() + "']");

			} else {
				senderName = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeButton[contains(@label,'" + sender + "')]");
			}

		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}

		return senderName;
	}

	/**
	 * @author Ashraf This method will verify the received transaction details.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyReceivedTransDetails() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(viewDetailsHeader, "View Details page header");
			mobileAction.verifyElementIsDisplayed(receivedTransactionStatus, receivedTransactionStatus.getText());

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
	 * @author Ashraf This method will click on the cancel transfer button.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickCancelTransferBtn() {

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
	 * @author Ashraf This method will perform the cancel transfer transaction.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void cancelTransfer() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(cancelTransferHeader, "Cancel Transfer header");
			mobileAction.FuncClick(depositToDropDown, "Deposit to dropdown");
			mobileAction.FuncClick(depositToAccount, depositToAccountNumber.getText());

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

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
	 * @author Ashraf This method will verify the cancel transfer details.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyCancelDetails() {

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
	 * @author Ashraf This method will verify the cancel transfer success
	 *         message.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyCancelConfirmation() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(cancelConfirmationMsg, "Transfer Cancelled");
			mobileAction.verifyElementIsDisplayed(confirmationCode, confirmationCode.getText());
			mobileAction.verifyElementIsDisplayed(recipient, "Recipient");
			mobileAction.verifyElementIsDisplayed(recipientVal, recipientVal.getText());
			mobileAction.verifyElementIsDisplayed(amountRecip, "Amount");
			mobileAction.verifyElementIsDisplayed(amountRecipVal, amountRecipVal.getText());
			mobileAction.verifyElementIsDisplayed(depositTo, "Deposit To");
			mobileAction.verifyElementIsDisplayed(depositToVal, depositToVal.getText());

			if (mobileAction.verifyElementIsPresent(message)) {
				mobileAction.verifyElementIsDisplayed(message, "Message");
				mobileAction.verifyElementIsDisplayed(messageVal, "Message: " + messageVal.getText());
			}

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify all the transactions present on
	 *         the activity page.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyTransactionOnActivity() {

		Decorator();
		try {

			String receiver = getTestdata("ToAccount");
			String TransacStatusXL = getTestdata("TransactionStatus");
			getTransactionStatus();
			String transactionCategory = null;

			if (TransacStatusXL.equalsIgnoreCase("Declined") || TransacStatusXL.equalsIgnoreCase("Sent")) {

				if (_CommonPage.currentLocale.equalsIgnoreCase("en"))
					transactionCategory = "PENDING";
				else
					transactionCategory = "EN ATTENTE";

			} else {

				if (_CommonPage.currentLocale.equalsIgnoreCase("en"))
					transactionCategory = "COMPLETED";
				else
					transactionCategory = "EFFECTUÉS";
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				receiverName = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='" + receiver
						+ "' or @text='" + receiver.toUpperCase() + "']");
				transacStatus = mobileAction
						.mobileElementUsingXPath("//android.widget.TextView[@text='" + receiver + "' or @text='"
								+ receiver.toUpperCase() + "']/following-sibling::android.widget.TextView[@text='"
								+ transStatus + "' or @text='" + transStatus.toUpperCase() + "']");
				transacCategory = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='"
						+ transactionCategory + "' or @text='" + transactionCategory.toUpperCase() + "']");

				mobileAction.verifyElementIsDisplayed(receiverName, "Receiver Name: " + receiver);
				mobileAction.verifyTextEquality(transacStatus.getText(), transStatus);
				mobileAction.verifyElementIsDisplayed(transacCategory, "Transaction Category: " + transactionCategory);

			} else {

				receiverName = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeButton[contains(@label,'" + receiver + "')]");
				transacStatus = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeButton[contains(@label,'" + receiver + "') and (contains(@label,'"
								+ transStatus + "') or contains(@label,'" + transStatus.toUpperCase() + "'))]");
				transacCategory = mobileAction.mobileElementUsingXPath("//XCUIElementTypeStaticText[contains(@label,'"
						+ transactionCategory + "') or contains(@label,'" + transactionCategory.toUpperCase() + "')]");

				mobileAction.verifyElementIsDisplayed(receiverName, "Receiver Name: " + receiver);
				mobileAction.verifyTextContains(transacStatus.getText(), transStatus);
				mobileAction.verifyElementIsDisplayed(transacCategory, "Transaction Category: " + transactionCategory);

			}

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
