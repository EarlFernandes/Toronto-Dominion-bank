package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.sun.jna.Platform;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Money Received' or @label='Fonds reçus']/following-sibling::XCUIElementTypeButton[@label='See all']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Money Received' or @text='Fonds reçus']/following-sibling::android.widget.TextView[@text='See all']")
	private MobileElement moneyReceivedSeeAll;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='PENDING' OR label=='EN ATTENTE'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyHeadingTextView' and (@text='PENDING' or @text='EN ATTENTE')]")
	private MobileElement pendingCategory;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label CONTAINS[cd] 'View Details' or label CONTAINS[cd] 'Détails'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (@text='View Details' or @text='Détails')]")
	private MobileElement viewDetailsHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Money Sent' or @label='Fonds virés']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement transactionStatus;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Request Updated' OR label=='Demande mis à jour'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement updateTransactionStatus;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Request Cancelled' OR label=='Demande annulée'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement cancelledTransactionStatus;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Money Received' or @label='Fonds reçus']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement receivedTransactionStatus;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header' and @text='Money sent - sent']")
	private MobileElement moneySentStatus;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='PENDING' or @label='EN ATTENTE']/../following-sibling::XCUIElementTypeCell")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sent' or @text='Envoyé']")
	private List<MobileElement> pendingTransactions;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='COMPLETED' OR label=='EFFECTUÉS'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='COMPLETED' or @text='EFFECTUÉS']")
	private MobileElement completedCategory;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='COMPLETED' or @label='EFFECTUÉS']/../following-sibling::XCUIElementTypeCell")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cancelled' or @text='Deposited' or @text='Annulé' or @text='Déposé']")
	private List<MobileElement> completedTransactions;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' or contains(@resource-id,'com.td:id/sendMoneyCard')]")
	private MobileElement transaction;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Money Received' or @label='Fonds reçus']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' or contains(@resource-id,'com.td:id/transfersReceivedCard')]")
	private MobileElement receivedTransaction;

	//@iOSXCUITFindBy(accessibility = "CTA_CANCEL")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Request']")//TODO::FrenchText
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/history_details_footer_button']")
	private MobileElement cancelTransferBtn;

	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement cancelTransferHeader;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeImage[`name=='td_iemt_arrow_down'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/amount_textview']")
	private MobileElement depositToDropDown;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='DEPOSIT TO' or @label='Compte de destination' or @label='COMPTE DE DESTINATION']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_action_sheet_title']/following-sibling::android.widget.ListView/android.widget.RelativeLayout")
	private MobileElement depositToAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_sub_heading']")
	private MobileElement depositToAccountNumber;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Done' or @label='Terminé']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done' or @text='Done']")
	private MobileElement done;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/cancel_send_money_reason_edit_text']")
	private MobileElement messageField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Continue' or @label='Continuer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_footer']")
	private MobileElement continueBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Transfer' or @label='Annuler le virement']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button']")
	private MobileElement cancelTransfer;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Date Sent' OR label=='Date du virement'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Sent' or @text='Date du virement']")
	private MobileElement dateSent;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date Sent' or @label='Date du virement']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Sent' or @text='Date du virement']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement dateSentVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date Deposited' or @label='Date du dépôt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Deposited' or @text='Date du dépôt']")
	private MobileElement dateDeposited;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date Deposited' or @label='Date du dépôt']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date Deposited' or @text='Date du dépôt']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement dateDepositedVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account' or @label='Compte de provenance']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='From Account' or @text='Compte de provenance']")
	private MobileElement fromAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account' or @label='Compte de provenance']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='From Account' or @text='Compte de provenance']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement fromAccountVal;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Amount' OR label=='Montant'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount' or @text='Montant']")
	private MobileElement amount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount' or @text='Montant']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amountVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit To' or @label='Compte de destination']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposited To' or @text='Compte de destination']")
	private MobileElement depositedTo;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit To' or @label='Compte de destination']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposited To' or @text='Compte de destination']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement depositedToVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirmation' or @label='N° de confirmation']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation #' or @text='N° de confirmation']")
	private MobileElement confirmationNumber;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirmation' or @label='N° de confirmation']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation #' or @text='N° de confirmation']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement confirmationNumberVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient' or @label='Destinataire']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Recipient' or @text='Destinataire']")
	private MobileElement recipient;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient' or @label='Destinataire']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Recipient' or @text='Destinataire']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement recipientVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender' or @label='Expéditeur']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sender' or @text='Expéditeur']")
	private MobileElement sender;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender' or @label='Expéditeur']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sender' or @text='Expéditeur']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement senderVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount' or @text='Montant']")
	private MobileElement amountRecip;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount' or @text='Montant']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amountRecipVal;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Deposit To' OR label=='Compte de destination'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposit To' or @text='Compte de destination']")
	private MobileElement depositTo;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit To' or @label='Compte de destination']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deposit To' or @text='Compte de destination']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement depositToVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Message']")
	private MobileElement message;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Message']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement messageVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transfer Cancelled' or @label='[FR]Transfer Cancelled']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement cancelConfirmationMsg;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label contains[cd] 'Confirmation #' or label contains[cd] 'N° de confirmation'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subSubHeader']")
	private MobileElement confirmationCode;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeActivityIndicator[`value=='1'")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Money Requested' or @label='Fonds virés']/following-sibling::XCUIElementTypeButton[@label='See all' or @label='Tout afficher']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Money Requested' or @text='Fonds virés']/following-sibling::android.widget.TextView[@text='See all' or @text='Tout afficher']")
	private MobileElement moneyRequestSeeAll;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Money Requested' or @label='Fonds reçus']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/historyTransferItemName' or contains(@resource-id,'com.td:id/requestMoneyCard')]")
	private MobileElement requestedTransaction;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement requestTransactionStatus;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Requested From' or label=='Demandé à'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Requested From' or @text='Demandé à']")
	private MobileElement requestedFrom;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Requested From' or @label='Demandé à']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Requested From' or @text='Demandé à']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement requestedFromVal;

	@iOSXCUITFindBy(accessibility = "CTA_SEND_REMINDER")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_access_money_request_remind']")
	private MobileElement sendAReminder;

	@iOSXCUITFindBy(accessibility = "CTA_CANCEL")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_access_money_request_cancel']")
	private MobileElement cancelRequest;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name=='alert_ok_button'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/positive_button']")
	private MobileElement cancelRequestConfirm;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Update' or label=='Mise à jour'`]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/updateButtonView']")
	private MobileElement updateRequest;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value contains[cd] '$'`]")
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private MobileElement amountField;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Continue' or label=='Continuer'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/update_money_request_continue_button']")
	private MobileElement MoneyRequestContinueBtn;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Finish' or label=='Terminer'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button']")
	private MobileElement finishBtn;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label contains[cd] 'Your request has been updated' or label contains[cd] 'Votre demande a été modifiée'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subHeader']")
	private MobileElement requestUpdateMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label='Money Requested' or @label='Fonds demandés']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeButton[contains(@label,'$')]")
	private List<MobileElement> requestMoneyCardIOS;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Message']/following-sibling::android.widget.EditText")
	private MobileElement messageRqstMoney;

	String platform = CL.getTestDataInstance().getMobilePlatForm();

	MobileElement initialsCircle = null;
	MobileElement receiverName = null;
	MobileElement amountSent = null;
	MobileElement transacStatus = null;
	MobileElement transacCategory = null;

	MobileElement senderName = null;

	String transStatus = null;
	private boolean cancelFlag = false;
	private int statusCounter = 0;

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

		switch (getTestdata("TransactionStatus")) {
		case "Sent":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Sent" : "Envoyé";

			break;
		case "Deposited":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Deposited" : "Déposé";

			break;
		case "Cancelled":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Cancelled" : "Annulé";

			break;
		case "Declined":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Declined" : "Refusé";

			break;
		case "Received":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Received" : "Reçus";

			break;
		case "Invalid Email Address":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Invalid Email Address"
					: "Adresse courriel non valide";

			break;
		}

	}

	/**
	 * @author Ashraf Mulla This method will return the transaction status as
	 *         per the value entered in test data file and assign it to the
	 *         global variable 'transStatus'. You only need to call this method
	 *         in your methods.
	 */
	public void getTransactionStatusParameters(String TransactionStatus) {

		switch (TransactionStatus) {
		case "Sent":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Sent" : "Envoyé";

			break;
		case "Deposited":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Deposited" : "Déposé";

			break;
		case "Cancelled":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Cancelled" : "Annulé";

			break;
		case "Declined":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Declined" : "Refusé";

			break;
		case "Received":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Received" : "Reçus";

			break;
		case "Invalid Email Address":

			transStatus = (currentLocale.equalsIgnoreCase("en")) ? "Invalid Email Address"
					: "Adresse courriel non valide";

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

			MobileElement moneySentSeeAll = null;

			while (!mobileAction.verifyElementIsPresent(getReceiver()) && counter < 3) {
				mobileAction.FunctionSwipe("left", 200, 200);
				mobileAction.waitForElementToVanish(progressBar);
				counter++;
			}
			counter = 0;

			if (platform.equalsIgnoreCase("Android")) {

				moneySentSeeAll = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@text='" + getTextInCurrentLocale(StringArray.MONEY_SENT_LBL)
								+ "']/following-sibling::android.widget.TextView[@text='"
								+ getTextInCurrentLocale(StringArray.SEE_ALL_LBL) + "']");

			} else {
				moneySentSeeAll = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + getTextInCurrentLocale(StringArray.MONEY_SENT_LBL)
								+ "']/following-sibling::XCUIElementTypeButton[@label='"
								+ getTextInCurrentLocale(StringArray.SEE_ALL_LBL) + "']");

			}

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
	 * @author Ashraf This method will click on the specified transaction
	 *         sent/Received.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickRequestTransaction() {

		Decorator();
		try {

			String receiver = getTestdata("ToAccount");

			if (StringUtils.isEmpty(receiver)) {
				mobileAction.FuncClick(requestedTransaction, "Transaction");
			} else {

				mobileAction.FuncClick(getRequester(), "Receiver: " + receiver);
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
				mobileAction.verifyElementIsDisplayed(pendingTransactions.get(i), "Pending Transaction " + (i + 1));
			}

			mobileAction.FunCnewSwipe(completedCategory, false, 4);

			if (mobileAction.verifyElementIsPresent(completedCategory)) {
				mobileAction.verifyElementIsDisplayed(completedCategory, "COMPLETE");

				mobileAction.FunctionSwipe("up", 2000, 200);

				for (int i = 0; i < completedTransactions.size() && i < 3; i++) {
					mobileAction.verifyElementIsDisplayed(completedTransactions.get(i),
							"Completed Transaction " + (i + 1));
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
			mobileAction.verifyTextEquality(cancelConfirmationMsg.getText(),
					getTextInCurrentLocale(StringArray.SEND_MONEY_TRANSFER_CANCELLED_RECEIPT));
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

				if (currentLocale.equalsIgnoreCase("en"))
					transactionCategory = "PENDING";
				else
					transactionCategory = "EN ATTENTE";

			} else {

				if (currentLocale.equalsIgnoreCase("en"))
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

	/**
	 * @author Ashraf This method will verify the cancel transfer success
	 *         message.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyRequestMoneyCards() {

		MobileElement requestMoneyCard = null;

		Decorator();
		try {

			for (int i = 0; i < 3; i++) {
				if (platform.equalsIgnoreCase("Android")) {
					requestMoneyCard = mobileAction.mobileElementUsingXPath(
							"//android.widget.FrameLayout[@resource-id='com.td:id/requestMoneyCard" + (i + 1) + "']");
					mobileAction.verifyElementIsDisplayed(requestMoneyCard, "Request Money Card " + (i + 1));
				} else {
					mobileAction.verifyElementIsDisplayed(requestMoneyCardIOS.get(i), "Request Money Card: " + (i + 1));
				}

			}
		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void clickRequestMoneySeeAll() {
		int counter = 0;

		Decorator();
		try {

			MobileElement requestMoneySentSeeAll = null;

			while (!mobileAction.verifyElementIsPresent(getRequester()) && counter < 3) {
				mobileAction.FunctionSwipe("left", 200, 200);
				mobileAction.waitForElementToVanish(progressBar);
				counter++;
			}
			counter = 0;

			if (platform.equalsIgnoreCase("Android")) {

				requestMoneySentSeeAll = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@text='" + getTextInCurrentLocale(StringArray.MONEY_REQUESTED_LBL)
								+ "']/following-sibling::android.widget.TextView[@text='"
								+ getTextInCurrentLocale(StringArray.SEE_ALL_LBL) + "']");

			} else {

				requestMoneySentSeeAll = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeOther[@label='" + getTextInCurrentLocale(StringArray.MONEY_REQUESTED_LBL)
								+ "']/following-sibling::XCUIElementTypeButton[@label='"
								+ getTextInCurrentLocale(StringArray.SEE_ALL_LBL) + "']");

			}

			mobileAction.FuncClick(requestMoneySentSeeAll, "See All");
			// mobileAction.waitForElementToVanish(progressBar);

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
	public MobileElement getRequester() {

		Decorator();
		String receiver = getTestdata("ToAccount");
		String transactionStatusXL = getTestdata("TransactionStatus");

		String[] transactionStatusArr = transactionStatusXL.split(": ");

		if (transactionStatusArr.length == 1) {
			statusCounter = 0;
		}

		getTransactionStatusParameters(transactionStatusArr[statusCounter]);

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				receiverName = mobileAction
						.mobileElementUsingXPath("//android.widget.TextView[@text='" + transStatus + "' or @text='"
								+ transStatus.toUpperCase() + "']/preceding-sibling::android.widget.TextView[@text='"
								+ receiver + "' or @text='" + receiver.toUpperCase() + "']");
			} else {

				receiverName = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeCell/XCUIElementTypeButton[contains(@label,'"
								+ receiver + "') and (contains(@label,'" + transStatus + "') or contains(@label,'"
								+ transStatus.toUpperCase() + "'))]");

			}

			statusCounter++;
			if (statusCounter == transactionStatusArr.length) {
				statusCounter = 0;
			}

		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}

		return receiverName;

	}

	/**
	 * @author Ashraf This method will verify the received transaction details.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyRequestedTransDetails() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(viewDetailsHeader, "View Details page header");

			if (platform.equalsIgnoreCase("iOS")) {

				requestTransactionStatus = mobileAction
						.mobileElementUsingIOSClassChain("**/XCUIElementTypeStaticText[`label=='"
								+ getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_MONEY_REQUESTED) + "'`]");
				confirmationCode = mobileAction
						.mobileElementUsingIOSClassChain("**/XCUIElementTypeStaticText[`label CONTAINS[cd] '"
								+ getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_CANCELLED_STATUS) + "'`]");
			}
			mobileAction.verifyElementIsDisplayed(requestTransactionStatus, requestTransactionStatus.getText());
			if (platform.equalsIgnoreCase("Android")) {
				mobileAction.verifyTextEquality(requestTransactionStatus.getText(),
						mobileAction.getAppString("history_details_money_request_title"));
			}

			if (cancelFlag) {
				getTransactionStatusParameters("Cancelled");
				mobileAction.verifyTextContains(confirmationCode.getText(), transStatus);
			}

			mobileAction.verifyElementIsDisplayed(dateSent, "Date Deposited");
			mobileAction.verifyElementIsDisplayed(dateSentVal, "Date value " + dateSentVal.getText());

			mobileAction.verifyElementIsDisplayed(requestedFrom, "Sender");
			mobileAction.verifyElementIsDisplayed(requestedFromVal, "Sender value " + requestedFromVal.getText());

			mobileAction.verifyElementIsDisplayed(amount, "Amount");
			mobileAction.verifyElementIsDisplayed(amountVal, "Amount value " + amountVal.getText());

			mobileAction.verifyElementIsDisplayed(depositTo, "Deposited To");
			mobileAction.verifyElementIsDisplayed(depositToVal, "Recipient value " + depositToVal.getText());

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
	 * @author Ashraf This method will click on the specified transaction
	 *         sent/Received.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickWrongEmailTransaction() {

		Decorator();
		try {

			MobileElement wrongEmailTransaction = null;

			if (platform.equalsIgnoreCase("iOS")) {

				wrongEmailTransaction = mobileAction.mobileElementUsingXPath("//XCUIElementTypeButton[contains(@label,'"
						+ getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_WRONG_EMAIL_STR)
						+ "') or contains(@label,'"
						+ getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_WRONG_EMAIL_STR).toUpperCase()
						+ "')]");

			} else {
				wrongEmailTransaction = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/historyTransferItemStatus' and (@text='"
								+ getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_WRONG_EMAIL_STR)
								+ "' or @text='"
								+ getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_WRONG_EMAIL_STR).toUpperCase()
								+ "')]");
			}
			mobileAction.FuncClick(wrongEmailTransaction, "Invalid Email Transaction");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the received transaction details.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void verifyWrongEmailTransDetails() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(viewDetailsHeader, "View Details page header");

			if (platform.equalsIgnoreCase("iOS")) {
				requestTransactionStatus = mobileAction.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_MONEY_REQUESTED) + "']");
			}

			mobileAction.verifyElementIsDisplayed(requestTransactionStatus, requestTransactionStatus.getText());

			if (platform.equalsIgnoreCase("Android")) {
				mobileAction.verifyTextEquality(requestTransactionStatus.getText(),
						mobileAction.getAppString("history_request_money"));
			}

			mobileAction.verifyElementIsDisplayed(cancelTransferBtn, "Cancel Transfer Button");
			mobileAction.verifyElementNotPresent(sendAReminder, "Send A reminder Button");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the received transaction details.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void cancelrequest() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(viewDetailsHeader, "View Details page header");
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(cancelRequest, "cancel Request");
			mobileAction.FuncClick(cancelRequestConfirm, "Cancel Request Confirm button");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(cancelledTransactionStatus,
					"Transaction Status: " + cancelledTransactionStatus.getText());

			mobileAction.verifyTextEquality(cancelledTransactionStatus.getText(),
					getTextInCurrentLocale(StringArray.CANCEL_MONEY_RECEIPT_HEADER));

			mobileAction.verifyElementIsDisplayed(confirmationCode, "confirmation Code " + confirmationCode.getText());

			cancelFlag = true;

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void verifyCancelledTransOnActivity() {

		MobileElement cancelledTransaction = null;

		Decorator();
		try {

			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(completedCategory, "Completed Category");

			if (platform.equalsIgnoreCase("Android")) {
				cancelledTransaction = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("history_money_request_cancelled")
						+ "']/preceding-sibling::android.widget.TextView[@text='" + getTestdata("ToAccount") + "']");

			} else {

				cancelledTransaction = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeCell/XCUIElementTypeButton[contains(@label,'"
								+ getTestdata("ToAccount") + "') and contains(@label,'CANCELLED')]"); // TODO::IOS:
																										// CANCELLED:french
			}

			mobileAction.verifyElementIsDisplayed(cancelledTransaction, "Cancelled Transaction");
			mobileAction.FuncClick(cancelledTransaction, "Cancelled Transaction");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void clickUpdateRequestOnActivity() {

		Decorator();
		try {

			mobileAction.FuncClick(updateRequest, "Update");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void updateMoneyRequest() {

		Decorator();
		try {

			mobileAction.FuncClick(amountField, "Amount");
			mobileAction.FuncSendKeys(amountField, getTestdata("Amount"));

			if (platform.equalsIgnoreCase("Android")) {

				mobileAction.FuncHideKeyboard();

				mobileAction.FuncClick(depositToDropDown, "Deposit To drop Down");
				mobileAction.FuncClick(depositToAccountNumber, depositToAccountNumber.getText());
				mobileAction.FuncHideKeyboard();

				mobileAction.FuncClick(messageRqstMoney, "Message Field");
				mobileAction.FuncSendKeys(messageRqstMoney, getTestdata("Message"));
				mobileAction.FuncHideKeyboard();

			} else {

				mobileAction.FuncClickDone();
				mobileAction.FuncClick(depositToDropDown, "Deposit To drop Down");
				mobileAction.FuncClick(depositToAccountNumber, depositToAccountNumber.getText());

				messageRqstMoney = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='Message']/following-sibling::XCUIElementTypeTextField");

				mobileAction.FuncClick(messageRqstMoney, "Message Field");
				mobileAction.FuncSendKeys(messageRqstMoney, getTestdata("Message"));
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncClick(MoneyRequestContinueBtn, "Continue Button");
			mobileAction.FuncClick(finishBtn, "Finish");
			// mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void verifyRequestUpdateSuccessMsg() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(updateTransactionStatus, updateTransactionStatus.getText());
			mobileAction.verifyElementIsDisplayed(requestUpdateMsg, requestUpdateMsg.getText());

			if (platform.equalsIgnoreCase("Android")) {
				mobileAction.verifyTextEquality(transactionStatus.getText(),
						mobileAction.getAppString("update_money_request_confirmation_header"));
				mobileAction.verifyTextEquality(requestUpdateMsg.getText(),
						mobileAction.getAppString("update_money_request_confirmation_sub_header"));
			}

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on the
	 * Menu-->MenuTransfer-->TransfersHistory-->RequestMoneySeeAll and go back
	 * to activity page
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
	public void clickBackToActivity() {

		Decorator();
		try {

			HomeScreen.get().clickMenu();
			MenuPage.get().clickMenuTransfer();
			Transfers.get().clickTransferHistoryLink();
			clickRequestMoneySeeAll();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
