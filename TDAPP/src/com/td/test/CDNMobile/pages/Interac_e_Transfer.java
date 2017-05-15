package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
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

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Interac e-Transfer']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
    private MobileElement interac_Header;

    @iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
    private MobileElement progrees_Bar;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Interac e-Transfer']")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Interac e-Transfer')]")
    private MobileElement interac_Etransfer_Header;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender']")
   // @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_sender' and @text='Select Sender']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sender']")
    private MobileElement selectSender;

    // @iOSFindBy(xpath =
    // "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField")
    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name='-Amount']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_amount']")
    private MobileElement etransfer_Amount;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer' and @text='Continue']")
    private MobileElement transfer_Continue;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Send Money']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_send_money' and @text='Send Money']")
    private MobileElement sendMoney;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Interac e-Transfer Sent']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Interac e-Transfer Sent']")
    private MobileElement transferSent;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
    private MobileElement confirmation_Val;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From account']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_title']")
    private MobileElement fromAccount;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='-Balance-']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer']")
    private MobileElement fromAccountVal;

    @AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
    private MobileElement acntsList;

    @AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/listView']")
    private MobileElement acntsListSender;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/recipient_title' and @text='Recipient']")
    private MobileElement recipient;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_recipient_name']")
    private MobileElement first_recipient;    
    
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
    private MobileElement done;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Close']")
    private MobileElement cancel;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='CANCEL']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSpecialAction' and @text='Cancel']")
    private MobileElement senderCancel;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account']")
    private MobileElement accountNum;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer]")
    private MobileElement totalAmount;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account']")
    private MobileElement accountName;

    String sender_SelectSender = getTestdata("FromAccount");
    String select_SenderValue = "//android.widget.TextView[contains(@text,'" + sender_SelectSender + "')]";
    String t_interacHeader = "Interac e-Transfer";

    String transfer_fromAccount = getTestdata("FromAccount");
    String select_Account = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account' and @text='"
	    + transfer_fromAccount + "')]";

    String transferRecipient = getTestdata("RecipientName");
    String select_Recipient = "//android.widget.TextView[@resource-id='com.td:id/txt_recipient_email' and contains(@text,'"
    	    + transferRecipient + "')]";
    
    
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From account, Select from account']")
    private MobileElement fromAccountData;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Message, Optional']")
    private MobileElement Message;

    int i = 1;
    String senderTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]";

    String firstPart = "//XCUIElementTypeCell[";
    String secondPart = "]/XCUIElementTypeStaticText[1]";
    String finalPart = firstPart + i + secondPart;

    String ValueofAmount = getTestdata("Amount");

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
		new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
		this);

    }

    public void verify_interacTransfer() {
	double accVal = 0.00;
	Decorator();
	try {
	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			    
	    String sendermail= getTestdata("Sender");
	    System.out.println("Sender:" +sendermail );
	    String senderXpath = "//XCUIElementTypeStaticText[contains(@label,'" + sendermail + "')]";
		MobileElement senderval = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(senderXpath));
		if(!mobileAction.verifyElementIsPresent(senderval)){
			mobileAction.FuncClick(selectSender, "Sender");
			mobileAction.FunCSwipeandScroll(senderval, true);
		}
		
		String fromacc = getTestdata("FromAccount");
		System.out.println("From account:" +fromacc);
		
		String fromAccXpath = "//XCUIElementTypeStaticText[contains(@label,'" + fromacc + "')]";
		MobileElement fromAccval = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(fromAccXpath));
		if(!mobileAction.verifyElementIsPresent(fromAccval)){
			mobileAction.FuncClick(fromAccount, "From Account");
			mobileAction.FunCSwipeandScroll(fromAccval, true);
		}
		
		String recipientmail = getTestdata("RecipientMail");
		System.out.println("Recipient:"+recipientmail);
		mobileAction.FuncClick(recipient, "Recipient");
		String recipientXpath = "//XCUIElementTypeStaticText[contains(@label,'" + recipientmail + "')]";
		MobileElement recipientval = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(recipientXpath));
		mobileAction.FunCSwipeandScroll(recipientval, true);		
		//mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_SelectSender);
	    
	    	//mobileAction.FuncClick(recipient, "Recipient");
	    	
		mobileAction.FuncClick(etransfer_Amount, "Amount");
		System.out.println("Amount:" + ValueofAmount);
		//String fromAccountMoney = fromAccountData.getAttribute("value");
		mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
		mobileAction.FuncClick(done, "Done");
		//mobileAction.FuncClick(Message, "Message");
		//mobileAction.FuncSendKeys(Message, "Transfering Amount");
		mobileAction.FuncClick(transfer_Continue, "Continue");
		mobileAction.FuncClick(sendMoney, "Send Money");
		String confrmVal = mobileAction.getText(confirmation_Val);
		mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");

	    } else {
		mobileAction.verifyElement(interac_Etransfer_Header, "Interac e-Transfer");
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
     *@throws InterruptedException
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
	try {

	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
	    	Thread.sleep(10000);
		//mobileAction.FuncClick(selectSender, "Sender");
		//mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_SelectSender);
	    Thread.sleep(10000);
	    	mobileAction.FuncClick(recipient, "Recipient");
	    String selectRecipient="//XCUIElementTypeStaticText[contains(@label,'"+ transferRecipient +"')]";
	    MobileElement recipientVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(selectRecipient));
	    mobileAction.FuncClick(recipientVal, "Recipient");
		mobileAction.FuncClick(etransfer_Amount, "Amount");
		mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
		mobileAction.FuncClick(done, "Done");
		mobileAction.FuncClick(transfer_Continue, "Continue");
		mobileAction.FuncClick(sendMoney, "Send Money");
		String confrmVal = mobileAction.getText(confirmation_Val);
		mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");

	    } else {

		/*mobileAction.verifyElement(interac_Etransfer_Header, "Interac e-Transfer");
		mobileAction.FuncClick(selectSender, "Sender");
		mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 0, "down", true);

		mobileAction.FuncClick(fromAccount, "From Account");
		accVal = Double.parseDouble(mobileAction.getText(fromAccountVal));
		mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Account, 0, "down", true);*/
	    	mobileAction.FuncClick(recipient, "Recipient");

			MobileElement Recipient = (MobileElement) ((AppiumDriver) CL.GetDriver())
					.findElement(By.xpath(select_Recipient));

			mobileAction.FunCnewSwipe(Recipient, true, 2);

			mobileAction.waitForElementToDisappear(select_Recipient);

			// mobileAction.FuncElementSwipeWhileNotFound(acntsList,
			// select_Recipient, 1, "up", true);

			mobileAction.FuncClick(etransfer_Amount, "Amount");
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
    	try {

    	    if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
    		mobileAction.FuncClick(selectSender, "Sender");
    		sender_SelectSender = getTestdata("FromAccount");
    		System.out.println("Select Sender:" + sender_SelectSender);
    		mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart, sender_SelectSender);
    		mobileAction.FuncClick(recipient, "Recipient");
//    		String first_reci= mobileAction.getValue(first_recipient);
//    		System.out.println("First recipient:" +first_reci );
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
    		mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 1, "down", true);

    		mobileAction.FuncClick(recipient, "Recipient");

    		mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Recipient, 2, "down", true);
    		String ValueofAmount = getTestdata("Amount");
    		mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
    		mobileAction.FuncClickBackButton();
    		mobileAction.FuncClick(transfer_Continue, "Continue");
    		mobileAction.FuncClick(cancel, "Cancel");
    	    }
    	}catch (NoSuchElementException e) {
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
//	    	String excelVal = getTestdata("Amount");
	    	//default amount is '0.00'
    		String val = mobileAction.getValue(etransfer_Amount);
    		System.out.println("Amount value:" + val);
  		
    		mobileAction.verifyTextEquality(val, "$0.00");

	    } else {
//	    	String excelVal = getTestdata("Amount");
	    	String val = etransfer_Amount.getText();
	    	mobileAction.verifyTextEquality(val, "$0.00");
	    }
	}  catch (NoSuchElementException e) {
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
	double accVal = 0.00;
	Decorator();
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
	}  catch (NoSuchElementException e) {
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
     * @author Ashraf
     * This method will verify The Registration Page and click on continue button.
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
     * @author Ashraf
     * This method will verify The Registration Page and click on continue button.
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
     * @author Ashraf
     * This method will verify The error message on registration Page.
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
     * @author Ashraf
     * This method will enter the email address for registration and click on continue.
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

		String email=getTestdata("Email");
		String nameText=getTestdata("Name");
		
	mobileAction.verifyTextEquality(name.getText(), nameText);
	mobileAction.FuncClick(emailId, "Email");
	mobileAction.FuncSendKeys(emailId,email);
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
     * @author Ashraf
     * This method will verify the registration details for review and click on continue button.
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
		String nameText=getTestdata("Name");
		String email=getTestdata("Email");
		
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
     * @author Ashraf
     * This method will verify the success message after registration.
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
    
    
}
