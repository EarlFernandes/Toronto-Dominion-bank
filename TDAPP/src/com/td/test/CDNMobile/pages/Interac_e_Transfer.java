package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Interac_e_Transfer extends _CommonPage {
	private static Interac_e_Transfer Interac_e_Transfer;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Add Recipient']")
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Add Recipient' or @text='Add Recipient']")
	private MobileElement addRecipient_Interac;

	@iOSFindBy(accessibility = "MESSAGE_INPUT_PLACEHOLDER")
	private MobileElement optional;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@value='1']")
	private MobileElement progrees_bar;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
	private MobileElement Interac_Etransfer_Header;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
	private MobileElement interac_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	private MobileElement progrees_Bar;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Interac e-Transfer')]")
	private MobileElement interac_Etransfer_Header;

	@iOSFindBy(accessibility = "INTERACSEND_VIEW_SENDER")
	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_sender'
	// and @text='Select Sender']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/sender_title']")
	private MobileElement selectSender;

	// for android only
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSpecialAction']")
	private MobileElement cancelSender;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='INTERACSEND_VIEW_AMOUNT']/following-sibling::XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_amount']")
	private MobileElement etransfer_Amount;

	@iOSFindBy(accessibility = "INTERACSEND_VIEW_AMOUNT")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
	private MobileElement amountLbl;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label = '继续' or @label = 'Continue' or @label = '繼續']")
	// FIXME: This is a bug, not seen in 17.5.1+ builds
	// @iOSFindBy(accessibility = "INTERACSEND_VIEW_CONTINUE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer']")
	private MobileElement transfer_Continue;

	@iOSFindBy(accessibility = "INTERACCONFIRM_VIEW_SENDMONEY")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_send_money']")
	private MobileElement sendMoney;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Interac e-Transfer Sent']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Interac e-Transfer Sent']")
	private MobileElement transferSent;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_Val;

	@iOSFindBy(accessibility = "INTERACSEND_VIEW_FROM")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_title']")
	private MobileElement fromAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='-Balance-']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer']")
	private MobileElement fromAccountVal;

	@iOSFindBy(xpath = "//../XCUIElementTypeTable[2]")
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntsList;

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/listView']")
	private MobileElement acntsListSender;

	@iOSFindBy(accessibility = "INTERACSEND_VIEW_RECIPIENT")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/recipient_title']")
	private MobileElement recipient;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_recipient_name']")
	private MobileElement first_recipient;

	@iOSFindBy(xpath = "//*[@label='Done' or @label='完成']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Close']")
	private MobileElement cancel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/entransfer_cancel_payment_date']")
	private MobileElement payDate;

	@iOSFindBy(accessibility = "ENHANCED_RECEIPT_BUTTON")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel']")
	private MobileElement cancelTransfer;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='CANCEL']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSpecialAction' and @text='Cancel']")
	private MobileElement senderCancel;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account']/following-sibling::XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account']")
	private MobileElement accountNum;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account']/following-sibling::XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer]")
	private MobileElement totalAmount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/date']")
	private List<MobileElement> dateHeaders;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account']/following-sibling::XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account']")
	private MobileElement accountName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From account, Select from account']")
	private MobileElement fromAccountData;

	@iOSFindBy(accessibility = "INTERACSEND_VIEW_MESSAGE")
	private MobileElement Message;

	String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]";

	String firstPart = "//XCUIElementTypeCell[";
	String secondPart = "]/XCUIElementTypeStaticText[1]";
	String finalPart = firstPart + 1 + secondPart;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and contains(@text,'Interac e-Transfer') and contains(@text,'Registration')]")
	private MobileElement registrationPageHeader;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button' or @resource-id='com.td:id/btn_footer' or @text='Continue']")
	private MobileElement continueButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/errorButton1' or @text='Open an Account']")
	private MobileElement openAnAccount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/errorMessage']")
	private MobileElement errorText;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/errorButton2' or @text='Find a Branch']")
	private MobileElement findABranch;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_name']")
	private MobileElement name;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_interac_registration_email']")
	private MobileElement emailId;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Name']")
	private MobileElement myName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Name']/following-sibling::android.widget.TextView")
	private MobileElement reviewName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email Address for Interac e-Transfer']")
	private MobileElement emailAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email Address for Interac e-Transfer']/following-sibling::android.widget.TextView")
	private MobileElement reviewEmailId;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Thank You']")
	private MobileElement thankYou;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'now registered for Interac e-Transfer')]")
	private MobileElement successMag;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	public synchronized static Interac_e_Transfer get() {
		if (Interac_e_Transfer == null) {
			Interac_e_Transfer = new Interac_e_Transfer();
		}
		return Interac_e_Transfer;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void verify_interacTransfer() {
		double accVal = 0.00;
		String sender_SelectSender = getTestdata("Sender");
		System.out.println("Sender:" + sender_SelectSender);
		String select_SenderValue = "//android.widget.TextView[contains(@text,'" + sender_SelectSender + "')]";
		String t_interacHeader = "Interac e-Transfer";

		String transfer_fromAccount = getTestdata("FromAccount");
		String select_Account = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account' and @text='"
				+ transfer_fromAccount + "')]";

		String transferRecipient = getTestdata("RecipientName");
		String select_Recipient = "//android.widget.TextView[@resource-id='com.td:id/txt_recipient_email' and contains(@text,'"
				+ transferRecipient + "')]";

		String ValueofAmount = getTestdata("Amount");
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String sendermail = getTestdata("Sender");
				System.out.println("Sender:" + sendermail);
				String senderXpath = "//XCUIElementTypeStaticText[contains(@label,'" + sendermail + "')]";
				MobileElement senderval = (MobileElement) (CL.GetAppiumDriver())
						.findElement(By.xpath(senderXpath));
				if (!mobileAction.verifyElementIsPresent(senderval)) {
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FunCSwipeandScroll(senderval, true);
				}

				String fromacc = getTestdata("FromAccount");
				System.out.println("From account:" + fromacc);

				String fromAccXpath = "//XCUIElementTypeStaticText[contains(@label,'" + fromacc + "')]";
				MobileElement fromAccval = (MobileElement) (CL.GetAppiumDriver())
						.findElement(By.xpath(fromAccXpath));
				if (!mobileAction.verifyElementIsPresent(fromAccval)) {
					mobileAction.FuncClick(fromAccount, "From Account");
					mobileAction.FunCSwipeandScroll(fromAccval, true);
				}

				String recipientmail = getTestdata("RecipientMail");
				System.out.println("Recipient:" + recipientmail);
				mobileAction.FuncClick(recipient, "Recipient");
				String recipientXpath = "//XCUIElementTypeStaticText[contains(@label,'" + recipientmail + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(recipientXpath, true, 25, "Up");
				// mobileAction.FuncSelectElementInTable(senderTable, firstPart,
				// secondPart, sender_SelectSender);

				// mobileAction.FuncClick(recipient, "Recipient");

				mobileAction.FuncClick(etransfer_Amount, "Amount");
				System.out.println("Amount:" + ValueofAmount);
				// String fromAccountMoney =
				// fromAccountData.getAttribute("value");
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				mobileAction.FuncClick(done, "Done");
				// mobileAction.FuncClick(Message, "Message");
				// mobileAction.FuncSendKeys(Message, "Transfering Amount");
				mobileAction.FuncClick(transfer_Continue, "Continue");
				mobileAction.FuncClick(sendMoney, "Send Money");
				String confrmVal = mobileAction.getText(confirmation_Val);
				mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");

			} else {
				mobileAction.verifyElement(interac_Etransfer_Header, "Interac e-Transfer");
				mobileAction.FuncClick(selectSender, "Sender");
				mobileAction.waitForElementToVanish(progressBar);
				// mobileAction.FuncElementSwipeWhileNotFound(acntsListSender,
				// select_SenderValue, 0, "up", true);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(select_SenderValue, true, 5, "up");
				// add click cancel when cancel is still present, this is an
				// issue for android
				if (mobileAction.verifyElementIsPresent(cancelSender)) {
					mobileAction.FuncClick(cancelSender, "Cancel");
				}
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(fromAccount, "From Account");
				accVal = Double.parseDouble(mobileAction.getText(fromAccountVal));
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Account, 0, "down", true);
				mobileAction.FuncClick(recipient, "Recipient");

				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Recipient, 0, "down", true);
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(transfer_Continue, "Continue");
				mobileAction.FuncClick(sendMoney, "Send Money");
				String conf_val = mobileAction.getText(confirmation_Val);
				mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");
				mobileAction.FuncClickBackButton();
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
	 * This method will click on AddRecipient in Interac e-transfers Screen
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
	public void addRecipient() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(interac_Header, "Interac e-Transfer");
			mobileAction.FuncClick(addRecipient_Interac, "AddRecipient");
			mobileAction.waitForElementToVanish(progrees_Bar);

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
	 * This method will click on AddRecipient in Interac e-transfers Screen
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
	 */
	public void verifyInteracHeader() {

		Decorator();

		String t_interacHeader = "Interac e-Transfer";

		try {
			mobileAction.verifyElementIsDisplayed(interac_Etransfer_Header, t_interacHeader);

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
	 * This method will do the interac e transaction
	 * 
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
	public void interacTransfer() {
		double accVal = 0.00;
		Decorator();
		String sender_SelectSender = getTestdata("Sender");
		String select_SenderValue = "//android.widget.TextView[contains(@text,'" + sender_SelectSender + "')]";
		String t_interacHeader = "Interac e-Transfer";

		String transfer_fromAccount = getTestdata("FromAccount");
		String select_Account = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
				+ transfer_fromAccount + "']";

		String transferRecipient = getTestdata("RecipientName");
		String select_Recipient = "//android.widget.TextView[@resource-id='com.td:id/txt_recipient_email' and contains(@text,'"
				+ transferRecipient + "')]";

		String ValueofAmount = getTestdata("Amount");
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				Thread.sleep(10000);
				// mobileAction.FuncClick(selectSender, "Sender");
				// mobileAction.FuncSelectElementInTable(senderTable, firstPart,
				// secondPart, sender_SelectSender);
				mobileAction.FuncClick(fromAccount, "From Account");
				String fromAcc = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'"
						+ transfer_fromAccount + "')]";
				System.out.println("From account xpath:" + fromAcc);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(fromAcc, true, 5, "Up");

				mobileAction.FuncClick(recipient, "Recipient");
				String selectRecipient = "//XCUIElementTypeStaticText[contains(@label,'" + transferRecipient + "')]";
				MobileElement recipientVal = mobileAction.verifyElementUsingXPath(selectRecipient, "Recipient");
				mobileAction.FuncClick(recipientVal, "Recipient");
				mobileAction.FuncClick(etransfer_Amount, "Amount");
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(transfer_Continue, "Continue");
				mobileAction.FuncClick(sendMoney, "Send Money");
				mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");

			} else {
				mobileAction.FuncClick(recipient, "Recipient");

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(select_Recipient, true, 5, "Up");

				mobileAction.waitForElementToDisappear(select_Recipient);

				mobileAction.FuncClick(fromAccount, "From Account");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(select_Account, true, 5, "up");
				mobileAction.FuncClick(etransfer_Amount, "Amount");
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(transfer_Continue, "Continue");
				mobileAction.FuncClick(sendMoney, "Send Money");
				mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");
			}

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

	public void verifyInteracETransferConfirmationPageTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				fillInInteracETransferForm();
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='"
								+ mobileAction.getAppString("eTransferConfirmNotice").replaceAll("\\<.*?>", "") + "']",
						"Notice");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransfersReceiveAnswerSender") + "']", "Sender");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("from") + "']", "From");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransferConfirmRecipient") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransferAmountLabel") + "']", "Amount");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("eTransferMessageLabel") + "']",
				// "Message");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("etransfer_warning_label") + "']", "Warning");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
						+ mobileAction.getAppString("eTransferConfirmCancelButton") + "']", "Close button");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
						+ mobileAction.getAppString("eTransferConfirmSendMoneyButton") + "']", "Send button");

			} else {
				fillInInteracETransferForm();
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("eTransferConfirmNotice").replaceAll("\\<.*?>", "") + "']",
						"Notice");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("eTransfersReceiveAnswerSender") + "']", "Sender");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferConfirmFrom") + "']",
						"From");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("eTransferConfirmRecipient") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferAmountLabel") + "']",
						"Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferMessageLabel") + "']",
						"Message");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/txt_etransfer_warning' and @text='"
								+ mobileAction.getAppString("etransfer_warning_label") + "']",
						"Warning");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferMessageLabel") + "']",
						"Message");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='"
										+ mobileAction.getAppString("eTransferConfirmCancelButton") + "']",
								"Close button");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.Button[@resource-id='com.td:id/btn_send_money' and @text='"
										+ mobileAction.getAppString("eTransferConfirmSendMoneyButton") + "']",
								"Send button");
			}

		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void fillInInteracETransferForm() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				etransfer_Amount = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeTextField[@name='-"
								+ mobileAction.getAppString("transfersBetweenMyAccountsReceiptAmount") + "']",
						"amount field");
				mobileAction.FuncClick(fromAccount, "From Account");
				String from_accountNo = "//XCUIElementTypeStaticText[contains(@value, '" + getTestdata("FromAccount")
						+ "')]";
				MobileElement fromAccountval = (MobileElement) (CL.GetAppiumDriver())
						.findElement(By.xpath(from_accountNo));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
				mobileAction.FuncClick(recipient, "recipient");
				String to_accountNo = "//XCUIElementTypeStaticText[contains(@value,'" + getTestdata("RecipientName")
						+ "')]";
				MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(to_accountNo));
				mobileAction.FunCSwipeandScroll(toAccountval, true);

				String ValueofAmount = getTestdata("Amount");
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClick(done, "Done");
				} else {
					mobileAction.FuncHideKeyboard();
				}
				mobileAction.FuncClick(transfer_Continue, "Continue");
				// mobileAction.verifyTextEquality(interac_Header.getText(),
				// mobileAction.getAppString("transfersBetweenMyAccountsConfirmPageHeader"));
			} else {
				// Seems like selector for from account/recipient do not work
				// here
				// We just need to get to confirmation page, so select default
				// fields
				mobileAction.FuncClick(fromAccount, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList,
						"//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @index='0']", 1, "down",
						true);
				mobileAction.FuncClick(recipient, "Recipient");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList,
						"//android.widget.TextView[@resource-id='com.td:id/txt_recipient_name' and @index='0']", 1,
						"down", true);
				String ValueofAmount = getTestdata("Amount");
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(transfer_Continue, "Continue");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("transfersBetweenMyAccountsConfirmPageHeader") + "']",
						"Confirm title");
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyInteracETransferSuccessTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				fillInInteracETransferForm();
				sendInteracETransfer();
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("receipt_thankyou") + "']",
						"Thank you!");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransferReceiptTransferSent").replaceAll("\\<.*?>", "") + "']",
						"Interac e-transfer sent");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[contains(@value, '"
						+ mobileAction.getAppString("receipt_confirmation") + "')]", "Confirmation");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransfersReceiveAnswerSender") + "']", "Sender");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("TransfersInteracETransferFrom") + "']", "From");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransferAmountLabel") + "']", "Amount");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransferConfirmRecipient") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransferReceiptQuestion") + "']", "Security Question");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransferMessageLabel") + "']", "Message");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeCell[@label='" + mobileAction.getAppString("receipt_home") + "']",
						"HOME button");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeCell[@label='"
						+ mobileAction.getAppString("receipt_another_etransfer") + "']", "ETRANSFERS button");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeCell[@label='" + mobileAction.getAppString("receipt_transfers") + "']",
						"TRANSFERS button");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeCell[@label='"
								+ mobileAction.getAppString("globalStaticContentQuickLinksViewCancelETransfers") + "']",
						"PENDING TRANSFERS button");

			} else {
				fillInInteracETransferForm();
				sendInteracETransfer();
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/thank_you' and @text='"
								+ mobileAction.getAppString("receipt_thankyou") + "']",
						"Thank you!");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/message' and @text='" + mobileAction
										.getAppString("eTransferReceiptTransferSent").replaceAll("\\<.*?>", "") + "']",
								"Interac e-transfer sent");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/confirmation' and @text='"
								+ mobileAction.getAppString("receipt_confirmation") + "']",
						"Confirmation");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/sender' and @text='"
								+ mobileAction.getAppString("eTransfersReceiveAnswerSender") + "']", "Sender");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/from_account' and @text='"
								+ mobileAction.getAppString("eTransferConfirmFrom") + "']",
						"From");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/amount' and @text='"
								+ mobileAction.getAppString("eTransferAmountLabel") + "']", "Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/receipient' and @text='"
								+ mobileAction.getAppString("eTransferConfirmRecipient") + "']",
						"Recipient");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/security_question' and @text='"
										+ mobileAction.getAppString("eTransferReceiptQuestion") + "']",
								"Security Question");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/message' and @text='"
								+ mobileAction.getAppString("eTransferMessageLabel") + "']",
						"Message");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/home' and @text='"
								+ mobileAction.getAppString("receipt_home") + "']", "HOME button");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/etransfers' and @text='"
										+ mobileAction.getAppString("receipt_another_etransfer") + "']",
								"ETRANSFERS button");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/transfers' and @text='"
								+ mobileAction.getAppString("receipt_transfers") + "']",
						"TRANSFERS button");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/pending_transfers' and @text='"
								+ mobileAction.getAppString("receipt_pending_transfers") + "']",
						"PENDING TRANSFERS button");
			}

		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void sendInteracETransfer() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(sendMoney, "Send Money");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeOther[@name ='TDVIEW_TITLE' and @label='"
								+ mobileAction.getAppString("eTransferReceiveReceiptHeaderTitle") + "']",
						"Receipt title");
			} else {
				mobileAction.FuncClick(sendMoney, "Send Money");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("eTransferReceiveReceiptHeaderTitle") + "']",
						"Receipt title");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will do the interac e transaction
	 * 
	 * 
	 * @return String
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
	public void interacTransfer_cancel() {
		double accVal = 0.00;
		Decorator();
		String sender_SelectSender = getTestdata("Sender");
		String select_SenderValue = "//android.widget.TextView[contains(@text,'" + sender_SelectSender + "')]";
		String t_interacHeader = "Interac e-Transfer";

		String transfer_fromAccount = getTestdata("FromAccount");
		String select_Account = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account' and @text='"
				+ transfer_fromAccount + "')]";

		String transferRecipient = getTestdata("RecipientName");
		String select_Recipient = "//android.widget.TextView[@resource-id='com.td:id/txt_recipient_email' and contains(@text,'"
				+ transferRecipient + "')]";

		String ValueofAmount = getTestdata("Amount");
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(selectSender, "Sender");
				sender_SelectSender = getTestdata("FromAccount");
				System.out.println("Select Sender:" + sender_SelectSender);
				mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_SelectSender);
				mobileAction.FuncClick(recipient, "Recipient");
				// String first_reci= mobileAction.getValue(first_recipient);
				// System.out.println("First recipient:" +first_reci );
				mobileAction.FuncClick(first_recipient, "Select one Recipent");
				//
				mobileAction.FuncClick(etransfer_Amount, "Amount");
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(transfer_Continue, "Continue");
				mobileAction.FuncClick(cancel, "Cancel");

			} else {

				mobileAction.verifyElement(interac_Etransfer_Header, "Interac e-Transfer");
				mobileAction.FuncClick(selectSender, "Sender");
				mobileAction.waitForElementToVanish(progressBar);
				// mobileAction.FuncElementSwipeWhileNotFound(acntsListSender,
				// select_SenderValue, 1, "up", true);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(select_SenderValue, true, 5, "up");
				// add click cancel when cancel is still present, this is an
				// issue for android
				if (mobileAction.verifyElementIsPresent(cancelSender)) {
					mobileAction.FuncClick(cancelSender, "Cancel");
				}

				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(recipient, "Recipient");

				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Recipient, 2, "up", true);
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(transfer_Continue, "Continue");
				mobileAction.FuncClick(cancel, "Cancel");
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
	 * This method will click sender dropdown and click cancel button in sender
	 * dropdown list
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickcancel() {
		Decorator();
		try {

			mobileAction.FuncClick(selectSender, "ClickSender");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(senderCancel, "Click Cancel");

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
	 * This method will verify the default amount value in Interac_e_transfer
	 * page
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 * @return void
	 * @throws IOException
	 * @throws InterruptedException
	 * 
	 */
	public void verifyamountfield() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// String excelVal = getTestdata("Amount");
				// default amount is '0.00'
				String val = mobileAction.getValue(etransfer_Amount);
				System.out.println("Amount value:" + val);

				mobileAction.verifyTextEquality(val, "$0.00");

			} else {
				// String excelVal = getTestdata("Amount");
				String val = etransfer_Amount.getText();
				mobileAction.verifyTextEquality(val, "$0.00");
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will verify the account details in Interac_e_transfer page
	 * 
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
	public void verifyaccountdetails() {
		Decorator();
		String sender_SelectSender = getTestdata("Sender");
		String select_SenderValue = "//android.widget.TextView[contains(@text,'" + sender_SelectSender + "')]";

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(selectSender, "Sender");
				mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_SelectSender);

			} else {
				mobileAction.FuncClick(selectSender, "Sender");
				mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 0, "down", true);
				String account_name = accountName.getAttribute("AccountName");
				String excelaccountname = getTestdataOtherSheet("FromAccount", "smartPhoneRedesign_IET");
				mobileAction.verifyTextEquality(account_name, excelaccountname);
				String account_num = accountNum.getAttribute("Account Number");
				String excelaccountnum = getTestdataOtherSheet("Accounts", "smartPhoneRedesign_IET");
				mobileAction.verifyTextEquality(account_num, excelaccountnum);
				String total_amount = totalAmount.getAttribute("Total Amount");
				String excelamount = getTestdataOtherSheet("Amount", "smartPhoneRedesign_IET");
				mobileAction.verifyTextEquality(total_amount, excelamount);
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
	 * @author Ashraf This method will verify The Registration Page and click on
	 *         continue button.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickContinueButton() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(registrationPageHeader, "Interac e-Transfer® - Registration");
			mobileAction.FuncClick(continueButton, "Continue");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify The Registration Page and click on
	 *         continue button.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickOpenAnAccount() {
		Decorator();
		try {

			mobileAction.FuncClick(openAnAccount, "Open An Account");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify The error message on registration
	 *         Page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyErrorMessage() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(errorText, "Error Message");
			mobileAction.verifyElementIsDisplayed(openAnAccount, "Open An Account");
			mobileAction.verifyElementIsDisplayed(findABranch, "Find A Branch");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will enter the email address for registration
	 *         and click on continue.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void registerUser() {
		Decorator();
		try {

			String email = getTestdata("Email");
			String nameText = getTestdata("Name");

			mobileAction.verifyTextEquality(name.getText(), nameText);
			mobileAction.FuncClick(emailId, "Email");
			mobileAction.FuncSendKeys(emailId, email);
			mobileAction.FuncHideKeyboard();
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(continueButton, "Continue Button");
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
	 * @author Ashraf This method will verify the registration details for
	 *         review and click on continue button.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyDetails() {
		Decorator();
		try {
			String nameText = getTestdata("Name");
			String email = getTestdata("Email");

			mobileAction.verifyElementIsDisplayed(myName, "My Name");
			mobileAction.verifyTextEquality(reviewName.getText(), nameText);
			mobileAction.verifyElementIsDisplayed(emailAddress, "My Name");
			mobileAction.verifyTextEquality(reviewEmailId.getText(), email);

			mobileAction.FuncClick(continueButton, "Continue Button");
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
	 * @author Ashraf This method will verify the success message after
	 *         registration.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyRegSuccessMsg() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(thankYou, "Thank You");
			mobileAction.verifyElementIsDisplayed(successMag, "You're now registered for Interac e-Transfer");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify text within elements for interac e transfer
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyInteracETransferTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(Interac_Etransfer_Header.getText(),
						mobileAction.getAppString("eTransferHeaderLabel").replaceAll("\\<.*?>", ""));
				mobileAction.verifyTextEquality(selectSender.getText(), mobileAction.getAppString("str_sender"));
				mobileAction.verifyTextEquality(fromAccount.getText(),
						mobileAction.getAppString("str_transfers_from_account"));
				mobileAction.verifyTextEquality(recipient.getText(),
						mobileAction.getAppString("eTransferConfirmRecipient"));
				mobileAction.verifyTextEquality(amountLbl.getText(), mobileAction.getAppString("eTransferAmountLabel"));
				mobileAction.verifyTextEquality(Message.getText(),
						mobileAction.getAppString("eTransferReceiptMessage"));
				// mobileAction.verifyTextEquality(optional.getText(),
				// mobileAction.getAppString("str_optional"));
				mobileAction.verifyTextEquality(transfer_Continue.getText(), mobileAction.getAppString("Continue"));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("transfersTransfersNavRowHeaderInteracETransfer")
										.replaceAll("\\<.*?>", "")
								+ "']",
						"Interac e-transfer title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/sender_title' and @text='"
								+ mobileAction.getAppString("eTransferSenderLabel") + "']",
						"Sender");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/from_account_title' and @text='"
										+ mobileAction.getAppString("eTransferFromAccountLabel") + "']",
								"From Account");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/recipient_title' and @text='"
								+ mobileAction.getAppString("eTransferRecipientLabel") + "']",
						"Recipient");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/amount_label' and @text='"
								+ mobileAction.getAppString("eTransferAmountLabel") + "']",
						"Amount");
				final String xPathFooter = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_message']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 3, "up");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferMessageLabel") + "']",
						"Message");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.EditText[@text='" + mobileAction.getAppString("optional") + "']", "Optional");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/button_footer' and (@text='"
								+ mobileAction.getAppString("btn_continue") + "' or @text='"
								+ mobileAction.getAppString("str_continue") + "')]",
						"Continue");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for cancel e transfer
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyCancelETransferTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				cancelFirstInteracETransfer();
				Thread.sleep(1000);
				MobileElement desc = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INTERAC_RECLAIM_DES']", "Reclaim description");
				MobileElement depositTo = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INTERAC_RECLAIM_DEPOSIT']", "Deposit To");
				MobileElement continueBtn = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@name='INTERAC_RECLAIM_CONTINUE']", "Continue");
				mobileAction.verifyTextEquality(desc.getText(),
						mobileAction.getAppString("TransfersReclaimDepositToHeaderMessage").replaceAll("\\<.*?>", ""));
				mobileAction.verifyTextEquality(depositTo.getText(),
						mobileAction.getAppString("TransfersReclaimDepositToDepositTo"));
				mobileAction.verifyTextEquality(continueBtn.getText(), mobileAction.getAppString("Continue"));
			} else {
				cancelFirstInteracETransfer();
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("TransfersReclaimDepositToHeaderMessage").replaceAll("\\<.*?>", "")
						+ "']", "Reclaim message");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("TransfersReclaimDepositToDepositTo") + "']", "Deposit To");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.EditText[@resource-id='com.td:id/deposit_account' and @text='"
										+ mobileAction.getAppString("TransfersReclaimDepositToHint") + "']",
								"Deposit To hint");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='"
								+ mobileAction.getAppString("TransfersReclaimDepositToContinueButton") + "']",
						"Continue");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void cancelFirstInteracETransfer() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// Get to cancel e-transfer screen, choose first interac
				// e-transfer to cancel
				mobileAction.FuncClick(
						mobileAction.verifyElementUsingXPath("//XCUIElementTypeCell[1]", "First iet to cancel"),
						"Recipient to cancel");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@label='"
				// +
				// mobileAction.getAppString("eTransferViewCancelCancelButton")
				// + "']", "Cancel interac e-transfer title");
			} else {
				// Get to cancel e-transfer screen, choose first interac
				// e-transfer to cancel
				mobileAction.FuncClick(
						mobileAction.verifyElementUsingXPath("//android.widget.RelativeLayout[@index='1']", ""),
						"Recipient to cancel");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title'
				// and @text='" +
				// mobileAction.getAppString("eTransferViewCancelCancelButton").replaceAll("\\<.*?>","").replace("&lt;i>",
				// "").replace("&lt;/i>", "") + "']", "Cancel Interac e-transfer
				// title");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for confirmation screen
	 * cancel e transfer
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyCancelETransferConfirmationTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// Get to cancel e-transfer screen, choose first interac
				// e-transfer to cancel
				mobileAction.FuncClick(
						mobileAction.verifyElementUsingXPath(
								"//XCUIElementTypeStaticText[@value='" + getTestdata("RecipientName") + "']", ""),
						"Recipient to cancel");
				Thread.sleep(1000);
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("interacEtransferCancelHeader").replaceAll("\\<.*?>", "") + "']",
						"Transfer Details title");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='"
								+ mobileAction.getAppString("e_transfer_str").replaceAll("\\<.*?>", "") + "']",
						"Interac e-Transfers title");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("IMT_SNT") + "']", "Sent");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[contains(@value, '"
						+ mobileAction.getAppString("receipt_confirmation") + "')]", "Confirmation #");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransferViewCancelPaymentDate") + "']", "Date Sent");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransferViewCancelRecipient") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("eTransfersReceiveAnswerAmount") + "']", "Amount");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("etransfer_cancel_warning") +
				// "']", "Please note");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
						+ mobileAction.getAppString("eTransferViewCancelCancelButton").replaceAll("\\<.*?>", "") + "']",
						"Cancel");
				// FIXME: How to get date headers here?
				// mobileAction.verifyDateFormat(payDate.getText(),
				// MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);

			} else {
				// Get to cancel e-transfer screen, choose first interac
				// e-transfer to cancel
				mobileAction.FuncClick(
						mobileAction.verifyElementUsingXPath("//android.widget.RelativeLayout[@index='1']", ""),
						"Recipient to cancel");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("interacEtransferCancelHeader").replaceAll("\\<.*?>", "")
								+ "']",
						"Transfer Details title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("e_transfer_str").replaceAll("\\<.*?>", "") + "']",
						"Interac e-Transfers title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("IMT_SNT") + "']", "Sent");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("receipt_confirmation") + "']",
						"Confirmation #");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("eTransferViewCancelPaymentDate") + "']", "Date Sent");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("eTransferViewCancelRecipient") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("eTransfersReceiveAnswerAmount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("etransfer_cancellation_fee_warning") + "']",
						"Please note");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='"
						+ mobileAction.getAppString("eTransferViewCancelCancelButton").replaceAll("\\<.*?>", "") + "']",
						"Cancel");
				mobileAction.verifyDateFormat(payDate.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for pending interac
	 * e-transfer
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyPendingETransfersTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("transfersTransfersNavRowHeaderPendingInteracETransfer")
										.replaceAll("\\<.*?>", "")
								+ "']",
						"Pending Interac e-transfer title");
				for (MobileElement m : dateHeaders) {
					mobileAction.verifyDateFormat(m.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
				}
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}