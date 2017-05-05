package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
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
    private MobileElement addRecipient_Interac;

    @iOSFindBy(accessibility = "TDVIEW_TITLE")
    private MobileElement interac_Header;

    @iOSFindBy(accessibility = "-Title")
    private List<MobileElement> pendingETransfers;

    // FIXME: Ask may to add this
    @iOSFindBy(accessibility = "FIXME")
    private MobileElement optional;
 
	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@value='1']")
    private MobileElement progrees_bar;

    @iOSFindBy(accessibility = "TDVIEW_TITLE")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
    private MobileElement Interac_Etransfer_Header;

    @iOSFindBy(accessibility = "INTERACSEND_VIEW_SENDER")
   // @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_sender' and @text='Select Sender']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/sender_title']")
    private MobileElement selectSender;

    // @iOSFindBy(xpath =
    // "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField")
    @iOSFindBy(accessibility = "-Amount")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_amount']")
    private MobileElement etransfer_Amount;

    @iOSFindBy(accessibility = "INTERACSEND_VIEW_AMOUNT")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
    private MobileElement amountLbl;
    
    @iOSFindBy(accessibility = "INTERACSEND_VIEW_CONTINUE")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer']")
    private MobileElement transfer_Continue;

    @iOSFindBy(xpath = "//*[@label='Send Money']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_send_money']")
    private MobileElement sendMoney;

    @iOSFindBy(xpath = "//*[@label='Interac e-Transfer Sent']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Interac e-Transfer Sent']")
    private MobileElement transferSent;

    @iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
    private MobileElement confirmation_val;

    @iOSFindBy(accessibility = "INTERACSEND_VIEW_FROM")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_title']")
    private MobileElement fromAccount;

    @iOSFindBy(xpath = "//*[@label='-Balance-']")
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

    @iOSFindBy(xpath = "//*[@label='Done']")
    private MobileElement done;

    @iOSFindBy(xpath = "//*[@label='PENDING E-TRANSFERS']")
    private MobileElement pendingTransfer;

    @iOSFindBy(xpath = "//*[@label='Cancel']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Close']")
    private MobileElement cancel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/entransfer_cancel_payment_date']")
    private MobileElement payDate;

    // FIXME: What is the correct accessibility id?
	@iOSFindBy(xpath ="//*[@label='Cancel Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel']")
	private MobileElement cancelTransfer;

    @iOSFindBy(xpath = "//*[@label='CANCEL']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSpecialAction' and @text='Cancel']")
    private MobileElement SenderCancel;

    @iOSFindBy(xpath = "//*[@label='']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account']")
    private MobileElement accountnum;

    @iOSFindBy(xpath = "//*[@label='']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer]")
    private MobileElement totalamount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/date']")
    private List<MobileElement> dateHeaders;
    
    @iOSFindBy(xpath = "//*[@label='']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account']")
    private MobileElement accountname;

    String sender_SelectSender = getTestdata("Sender");
    String select_SenderValue = "//android.widget.TextView[starts-with(@text,'" + sender_SelectSender + "')]";
    String t_interacHeader = "Interac e-Transfer";

    String transfer_fromAccount = getTestdata("FromAccount");
    String select_Account = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account' and @text='"
	    + transfer_fromAccount + "')]";

    String transferRecipient = getTestdata("Accounts");
    String select_Recipient = "//android.widget.TextView[@resource-id='com.td:id/txt_recipient_email' and @text='"
    	    + transferRecipient + "']";
    
    
    @iOSFindBy(xpath = "//*[@label='From account, Select from account']")
    private MobileElement fromAccountData;

    @iOSFindBy(accessibility = "INTERACSEND_VIEW_MESSAGE")
    private MobileElement Message;

    int i = 1;
    String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";

    String Firstpart = "//XCUIElementTypeCell[";
    String Secondpart = "]/XCUIElementTypeStaticText[1]";
    String Finalpart = Firstpart + i + Secondpart;

    String ValueofAmount = getTestdata("Amount");

    public synchronized static Interac_e_Transfer get() {
	if (Interac_e_Transfer == null) {
	    Interac_e_Transfer = new Interac_e_Transfer();
	}
	return Interac_e_Transfer;
    }

    private void Decorator() {
	PageFactory.initElements(
		new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
		this);

    }

    public void verify_interacTransfer() {
	double accVal = 0.00;
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		mobileAction.FuncClick(selectSender, "Sender");
		mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart, sender_SelectSender);
		mobileAction.FuncClick(etransfer_Amount, "Amount");
		String fromAccountMoney = fromAccountData.getAttribute("value");
		mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
		mobileAction.FuncClick(done, "Done");
		mobileAction.FuncClick(Message, "Message");
		mobileAction.FuncSendKeys(Message, "Transfering Amount");
		mobileAction.FuncClick(transfer_Continue, "Continue");
		mobileAction.FuncClick(sendMoney, "Send Money");
		String confrmVal = mobileAction.getText(confirmation_val);
		mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");

	    } else {
			mobileAction.verifyElement(Interac_Etransfer_Header, "Interac e-Transfer");
			mobileAction.FuncClick(selectSender, "Sender");
			mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 0, "down", true);

			mobileAction.FuncClick(fromAccount, "From Account");
			mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Account, 0, "down", true);
			mobileAction.FuncClick(recipient, "Recipient");

			mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Recipient, 0, "down", true);
			String ValueofAmount = getTestdata("Amount");
			mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
			mobileAction.FuncClickBackButton();
			mobileAction.FuncClick(transfer_Continue, "Continue");
		mobileAction.FuncClick(sendMoney, "Send Money");
		String conf_val = mobileAction.getText(confirmation_val);
		mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");
		mobileAction.FuncClickBackButton();
	    }

	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	} catch (Exception e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

    }

    /**
     * This method will click on AddRecipient in Interac e-transfers Screen
     * 
     * 
     * @return void
     * 
     */
    public void addRecipient() {

	Decorator();
	try {
	    interac_Header.isDisplayed();
	    mobileAction.FuncClick(addRecipient_Interac, "AddRecipient");
	    mobileAction.waitForElementToVanish(progrees_bar);

	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will click on AddRecipient in Interac e-transfers Screen
     * 
     * @throws IOException
     * @throws NoSuchElementException
     */
    public void verifyInteracHeader() {

Decorator();
try {
   mobileAction.verifyElementIsDisplayed(Interac_Etransfer_Header, t_interacHeader);

} catch (NoSuchElementException | IOException e) {
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
     */
    public void interacTransfer() {
	double accVal = 0.00;
	Decorator();
	try {

	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		mobileAction.FuncClick(selectSender, "Sender");
		mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart, sender_SelectSender);
		mobileAction.FuncClick(etransfer_Amount, "Amount");
		mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
		mobileAction.FuncClick(done, "Done");
		;
		mobileAction.FuncClick(transfer_Continue, "Continue");
		mobileAction.FuncClick(sendMoney, "Send Money");
		String confrmVal = mobileAction.getText(confirmation_val);
		mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");

	    } else {

		mobileAction.verifyElement(Interac_Etransfer_Header, "Interac e-Transfer");
		mobileAction.FuncClick(selectSender, "Sender");
		mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 0, "down", true);

		mobileAction.FuncClick(fromAccount, "From Account");
		accVal = Double.parseDouble(mobileAction.getText(fromAccountVal));
		mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Account, 0, "down", true);
		mobileAction.FuncClick(recipient, "Recipient");

		mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Recipient, 0, "down", true);
		String ValueofAmount = getTestdata("Amount");
		mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
		mobileAction.FuncClickBackButton();
		mobileAction.FuncClick(transfer_Continue, "Continue");
		mobileAction.FuncClick(sendMoney, "Send Money");
		String conf_val = mobileAction.getText(confirmation_val);
		mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");
		mobileAction.FuncClickBackButton();
	    }

	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	} catch (Exception e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

    }

	public void verifyInteracETransferConfirmationPageTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				fillInInteracETransferForm();
			} else {
				fillInInteracETransferForm();
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferConfirmNotice").replaceAll("\\<.*?>","") + "']", "Notice");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransfersReceiveAnswerSender") + "']", "Sender");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferConfirmFrom") + "']", "From");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferConfirmRecipient") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferAmountLabel") + "']", "Amount");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferMessageLabel") + "']", "Message");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/txt_etransfer_warning' and @text='" + mobileAction.getAppString("etransfer_warning_label") + "']", "Warning");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferMessageLabel") + "']", "Message");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='" + mobileAction.getAppString("eTransferConfirmCancelButton") + "']", "Close button");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@resource-id='com.td:id/btn_send_money' and @text='" + mobileAction.getAppString("eTransferConfirmSendMoneyButton") + "']", "Send button");
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

	private void fillInInteracETransferForm() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(fromAccount, "From Account");
				String from_accountNo = getTestdata("FromAccount");
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
                        .findElement(By.xpath(from_accountNo));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
				mobileAction.FuncClick(recipient, "recipient");
				String to_accountNo = getTestdata("RecipientName");
				MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
                        .findElement(By.xpath(to_accountNo));
				mobileAction.FunCSwipeandScroll(toAccountval, true);
				
				String ValueofAmount = getTestdata("Amount");
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(transfer_Continue, "Continue");
				mobileAction.verifyTextEquality(interac_Header.getText(), mobileAction.getAppString("transfersBetweenMyAccountsConfirmPageHeader"));
			} else {
				// Seems like selector for from account/recipient do not work here
				// We just need to get to confirmation page, so select default fields
				mobileAction.FuncClick(fromAccount, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @index='0']", 1, "down", true);
				mobileAction.FuncClick(recipient, "Recipient");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, "//android.widget.TextView[@resource-id='com.td:id/txt_recipient_name' and @index='0']", 1, "down", true);
				String ValueofAmount = getTestdata("Amount");
				mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(transfer_Continue, "Continue");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("transfersBetweenMyAccountsConfirmPageHeader") + "']", "Confirm title");
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
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
				// TODO: iOS elements
			} else {
				fillInInteracETransferForm();
				sendInteracETransfer();
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/thank_you' and @text='" + mobileAction.getAppString("receipt_thankyou") + "']", "Thank you!");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/message' and @text='" + mobileAction.getAppString("eTransferReceiptTransferSent").replaceAll("\\<.*?>","") + "']", "Interac e-transfer sent");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/confirmation' and @text='" + mobileAction.getAppString("receipt_confirmation") + "']", "Confirmation");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/sender' and @text='" + mobileAction.getAppString("eTransfersReceiveAnswerSender") + "']", "Sender");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/from_account' and @text='" + mobileAction.getAppString("eTransferConfirmFrom") + "']", "From");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/amount' and @text='" + mobileAction.getAppString("eTransferAmountLabel") + "']", "Amount");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/receipient' and @text='" + mobileAction.getAppString("eTransferConfirmRecipient") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/security_question' and @text='" + mobileAction.getAppString("eTransferReceiptQuestion") + "']", "Security Question");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/message' and @text='" + mobileAction.getAppString("eTransferMessageLabel") + "']", "Message");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/home' and @text='" + mobileAction.getAppString("receipt_home") + "']", "HOME button");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/etransfers' and @text='" + mobileAction.getAppString("receipt_another_etransfer") + "']", "ETRANSFERS button");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/transfers' and @text='" + mobileAction.getAppString("receipt_transfers") + "']", "TRANSFERS button");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/pending_transfers' and @text='" + mobileAction.getAppString("receipt_pending_transfers") + "']", "PENDING TRANSFERS button");
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

	private void sendInteracETransfer() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.FuncClick(sendMoney, "Send Money");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("eTransferReceiveReceiptHeaderTitle") + "']", "Receipt title");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
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
     */
    public void interacTransfer_cancel() {
    	double accVal = 0.00;
    	Decorator();
    	try {

    	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
    		mobileAction.FuncClick(selectSender, "Sender");
    		mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart, sender_SelectSender);
    		mobileAction.FuncClick(recipient, "Recipient");
    		mobileAction.FuncClick(etransfer_Amount, "Amount");
    		mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
    		mobileAction.FuncClick(done, "Done");
    		mobileAction.FuncClick(transfer_Continue, "Continue");
    		mobileAction.FuncClick(cancel, "Cancel");

    	    } else {

    		mobileAction.verifyElement(Interac_Etransfer_Header, "Interac e-Transfer");
    		mobileAction.FuncClick(selectSender, "Sender");
    		mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 1, "down", true);

    		mobileAction.FuncClick(recipient, "Recipient");

    		mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Recipient, 2, "down", true);
    		String ValueofAmount = getTestdata("Amount");
    		mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
    		mobileAction.FuncClickBackButton();
    		mobileAction.FuncClick(transfer_Continue, "Continue");
    		mobileAction.FuncClick(cancel, "Cancel");
    	    }
    	} catch (NoSuchElementException | InterruptedException | IOException e) {
    	    System.err.println("TestCase has failed.");
    	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
    	} catch (Exception e) {
    	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	    mobileAction.FuncClick(SenderCancel, "Click Cancel");

	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will verify the default amount value in Interac_e_transfer
     * page
     * 
     * @throws NoSuchElementException
     *             In case the element is not found over the screen
     * @return void
     * 
     */
    public void verifyamountfield() {
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
		String val = etransfer_Amount.getAttribute("value");
		String excelVal = getTestdata("Amount");

		mobileAction.verifyTextEquality(val, excelVal);

	    } else {
		String val = etransfer_Amount.getText();
		String excelVal = getTestdata("Amount");

		mobileAction.verifyTextEquality(val, excelVal);
	    }
	} catch (NoSuchElementException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
    public void verifyaccountdetails() throws Exception {
	double accVal = 0.00;
	Decorator();
	try {

	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

		mobileAction.FuncClick(selectSender, "Sender");
		mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart, sender_SelectSender);

	    } else {
		mobileAction.FuncClick(selectSender, "Sender");
		mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 0, "down", true);
		String account_name = accountname.getAttribute("AccountName");
		String excelaccountname = getTestdataOtherSheet("FromAccount", "smartPhoneRedesign_IET");
		mobileAction.verifyTextEquality(account_name, excelaccountname);
		String account_num = accountnum.getAttribute("Account Number");
		String excelaccountnum = getTestdataOtherSheet("Accounts", "smartPhoneRedesign_IET");
		mobileAction.verifyTextEquality(account_num, excelaccountnum);
		String total_amount = totalamount.getAttribute("Total Amount");
		String excelamount = getTestdataOtherSheet("Amount", "smartPhoneRedesign_IET");
		mobileAction.verifyTextEquality(total_amount, excelamount);
	    }
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
				// FIXME: This is returned as italics on ios
				//mobileAction.verifyTextEquality(Interac_Etransfer_Header.getText(), mobileAction.getAppString("eTransferHeaderLabel"));
				mobileAction.verifyTextEquality(selectSender.getText(), mobileAction.getAppString("str_sender"));
				mobileAction.verifyTextEquality(fromAccount.getText(), mobileAction.getAppString("str_transfers_from_account"));
				mobileAction.verifyTextEquality(recipient.getText(), mobileAction.getAppString("eTransferConfirmRecipient"));
				mobileAction.verifyTextEquality(amountLbl.getText(), mobileAction.getAppString("eTransferAmountLabel"));
				mobileAction.verifyTextEquality(Message.getText(), mobileAction.getAppString("eTransferReceiptMessage"));
				// FIXME: Once May adds it, uncomment
				//mobileAction.verifyTextEquality(optional.getText(), mobileAction.getAppString("str_optional"));
				mobileAction.verifyTextEquality(transfer_Continue.getText(), mobileAction.getAppString("Continue"));
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("transfersTransfersNavRowHeaderInteracETransfer").replaceAll("\\<.*?>","") + "']", "Interac e-transfer title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/sender_title' and @text='" + mobileAction.getAppString("eTransferSenderLabel") + "']", "Sender");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/from_account_title' and @text='" + mobileAction.getAppString("eTransferFromAccountLabel") + "']", "From Account");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/recipient_title' and @text='" + mobileAction.getAppString("eTransferRecipientLabel") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/amount_label' and @text='" + mobileAction.getAppString("eTransferAmountLabel") + "']", "Amount");
				final String xPathFooter = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_message']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 3, "up");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferMessageLabel") + "']", "Message");
				mobileAction.verifyElementUsingXPath("//android.widget.EditText[@text='" + mobileAction.getAppString("optional") + "']", "Optional");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/button_footer' and @text='" + mobileAction.getAppString("btn_continue") + "']", "Continue");
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
				MobileElement desc = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='INTERAC_RECLAIM_DES']", "Reclaim description");
				MobileElement depositTo = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='INTERAC_RECLAIM_DEPOSIT']", "Deposit To");
				MobileElement continueBtn = mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@name='INTERAC_RECLAIM_CONTINUE']", "Continue");
				mobileAction.verifyTextEquality(desc.getText(), mobileAction.getAppString("TransfersReclaimDepositToHeaderMessage"));
				mobileAction.verifyTextEquality(depositTo.getText(), mobileAction.getAppString("TransfersReclaimDepositToDepositTo"));
				mobileAction.verifyTextEquality(continueBtn.getText(), mobileAction.getAppString("Continue"));
			} else {
				cancelFirstInteracETransfer();
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("TransfersReclaimDepositToHeaderMessage").replaceAll("\\<.*?>","") + "']", "Reclaim message");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("TransfersReclaimDepositToDepositTo") + "']", "Deposit To");
				mobileAction.verifyElementUsingXPath("//android.widget.EditText[@resource-id='com.td:id/deposit_account' and @text='" + mobileAction.getAppString("TransfersReclaimDepositToHint") + "']", "Deposit To hint");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='" + mobileAction.getAppString("TransfersReclaimDepositToContinueButton") + "']", "Continue");
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

	private void cancelFirstInteracETransfer(){
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// Get to cancel e-transfer screen, choose first interac e-transfer to cancel
				mobileAction.FuncClick(mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@text='" + getTestdata("RecipientName") + "']", ""), "Recipient to cancel");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@text='" + mobileAction.getAppString("eTransferViewCancelCancelButton").replaceAll("\\<.*?>","") + "']", "Cancel interac e-transfer title");
			} else {
				// Get to cancel e-transfer screen, choose first interac e-transfer to cancel
				mobileAction.FuncClick(mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + getTestdata("RecipientName") + "']", ""), "Recipient to cancel");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("eTransferViewCancelCancelButton").replaceAll("\\<.*?>","").replace("&lt;i>", "").replace("&lt;/i>", "") + "']", "Cancel Interac e-transfer title");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for confirmation screen cancel e transfer
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
				// Get to cancel e-transfer screen, choose first interac e-transfer to cancel
				mobileAction.FuncClick(mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + getTestdata("RecipientName") + "']", ""), "Recipient to cancel");
				Thread.sleep(1000);
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='" + mobileAction.getAppString("interacEtransferCancelHeader").replaceAll("\\<.*?>","") + "']", "Transfer Details title");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("e_transfer_str").replaceAll("\\<.*?>","") + "']", "Interac e-Transfers title");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("IMT_SNT") + "']", "Sent");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("receipt_confirmation") + "']", "Confirmation #");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("eTransferViewCancelPaymentDate") + "']", "Date Sent");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("eTransferViewCancelRecipient") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("eTransfersReceiveAnswerAmount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("etransfer_cancellation_fee_warning") + "']", "Please note");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='" + mobileAction.getAppString("eTransferViewCancelCancelButton").replaceAll("\\<.*?>","") + "']", "Cancel");
				// FIXME: How to get date headers here?
				//				mobileAction.verifyDateFormat(payDate.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);

			} else {
				// Get to cancel e-transfer screen, choose first interac e-transfer to cancel
				mobileAction.FuncClick(mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + getTestdata("RecipientName") + "']", ""), "Recipient to cancel");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("interacEtransferCancelHeader").replaceAll("\\<.*?>","") + "']", "Transfer Details title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("e_transfer_str").replaceAll("\\<.*?>","") + "']", "Interac e-Transfers title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("IMT_SNT") + "']", "Sent");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("receipt_confirmation") + "']", "Confirmation #");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferViewCancelPaymentDate") + "']", "Date Sent");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransferViewCancelRecipient") + "']", "Recipient");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("eTransfersReceiveAnswerAmount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("etransfer_cancellation_fee_warning") + "']", "Please note");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='" + mobileAction.getAppString("eTransferViewCancelCancelButton").replaceAll("\\<.*?>","") + "']", "Cancel");
				mobileAction.verifyDateFormat(payDate.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for pending interac e-transfer
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyPendingETransfersTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(interac_Header.getText(), mobileAction.getAppString("str_pending_interact_etransfer").replaceAll("\\<.*?>",""));
//				for(MobileElement m : dateHeaders) {
//					mobileAction.verifyDateFormat(m.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
//				}
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("transfersTransfersNavRowHeaderPendingInteracETransfer").replaceAll("\\<.*?>","") + "']", "Pending Interac e-transfer title");
				for(MobileElement m : dateHeaders) {
					mobileAction.verifyDateFormat(m.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
				}
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
