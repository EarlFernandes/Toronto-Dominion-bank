package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;


public class PendingInteracTransfer extends _CommonPage{
	
	private static PendingInteracTransfer PendingInteracTransfer;
	
	@iOSFindBy(xpath= "//XCUIElementTypeOther[@label='Pending Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pending Interac e-Transfer']")
	private MobileElement pending_Interace_Transfer_Header; 
	
	@iOSFindBy(xpath= "//XCUIElementTypeStaticText[@label='-sender' or @label='-Sender']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/layout_etransfer_sender_layout']")
	private MobileElement sender;
	
	@iOSFindBy(xpath= "//XCUIElementTypeStaticText[@label='']")
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement senderList;
	
	@iOSFindBy(xpath ="//XCUIElementTypeOther[@label='Pending Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pending Interac e-Transfer']")
	private MobileElement pendingTransfer_Header;
	
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[contains(@value,'Select sender')]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/layout_etransfer_sender_layout']")
	private MobileElement selectSender;
	
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label='-Balance'][1]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	private MobileElement selectTransaction;
	
	@iOSFindBy(xpath ="//XCUIElementTypeButton[@label='Cancel Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Cancel Interac e-Transfer']")
	private MobileElement cancelTransfer;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'-Balance')]")// Need to change account
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
	@AndroidFindBy(xpath = "//android.widget.Button@resource-id='android:id/button1' and @text='Don't Cancel']")
	private MobileElement dontCancel;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement transferHeader;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
	private MobileElement receiptHeader;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@label='Home']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and and @text='Home']")
	private MobileElement home;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@label='Quick Access']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title'and @text='Home']")
	private MobileElement dashboard;
	
	//@iOSFindBy(id = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2][@label='Confirm']")
	@iOSFindBy(xpath="//XCUIElementTypeButton[@label='Confirm']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/entransfer_btn_finish' and @text='Confirm']")
	private MobileElement cnfrmCancellation;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell[@label='PENDING E-TRANSFERS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/pending_transfers' and @text='PENDING E-TRANSFERS']")
	private MobileElement clickPendingIcon;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation']")
	private MobileElement confirmation_Val;
	
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label='Interac e-Transfer reclaimed and deposited successfully']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Interac e-Transfer reclaimed and deposited successfully']")
	private MobileElement cancelSuccessMsg;
	
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_Val']")
	private MobileElement cancelCnfrmnVal;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntsList;
	
	@iOSFindBy(id = "//XCUIElementTypeStaticText[@label='-sender']")
	private MobileElement  verifySender;
	
	
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
	
	@iOSFindBy(xpath="//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "")
	private MobileElement selectSenderVal;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'-Balance')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer']")
	private MobileElement Balance;
	
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@value='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='My Accounts']")
	private MobileElement my_Accounts;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'-Balance')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer']")
	private MobileElement balanceNew;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'GO BACK HOME')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/home']")
	private MobileElement gobackhomeButton;

	String accountsPage_Table="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
			+ "XCUIElementTypeOther[1]/XCUIElementTypeTable[1]";
	String accountssecondPart = "]/XCUIElementTypeStaticText[2]";
	String from_account = getTestdata("FromAccount");
	
	
	


	
	
	
	
	
	String sender_selectSender = getTestdata("sender");
	String select_senderValue = "//android.widget.TextView[starts-with(@text,'" + sender_selectSender+ "')]";
	
	String transferRecipient = getTestdata("FromAccount");
	String select_Recipient = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account' and @text='" + transferRecipient + "')]";
	
	String platformName=CL.getTestDataInstance().getMobilePlatForm();
	String transfer_fromAccount = getTestdata("FromAccount");
	
	int i=1;
	String senderTable="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";
	
	String firstPart="//XCUIElementTypeCell[";
	String secondPart="]/XCUIElementTypeStaticText[1]";
	String finalPart=firstPart+i+secondPart;
	
	
	

	
	
	

	public synchronized static PendingInteracTransfer get() {
		if (PendingInteracTransfer == null) {
			PendingInteracTransfer = new PendingInteracTransfer();
		}
		return PendingInteracTransfer;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	/**
	 * This method will click on Pending Interac_e transfer in Transfer Screen
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * 
	 */
	public void pending_interac_transfer() {


		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(pending_Interace_Transfer_Header, "Pending Interac Transfer Landing Page verified");
			
			} catch (NoSuchElementException|IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	 * This method will verify the sender profile Pending e Transfers list is not displayed until the sender is selected
	 * 
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
	
			} catch (NoSuchElementException |IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	 * This method will verify sender dropdown list of senders profiles on Pending Interac_e transfer Page
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * @throws Exception 
	 * 
	 */
	
	public void verifylistofsender() throws Exception {
        Decorator();
		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				
				WebDriverWait wait = new WebDriverWait((AppiumDriver) CL.GetDriver(),60);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@label='-sender' or @label='-Sender']")));
				
				mobileAction.FuncClick(selectSender, "sender");
				String senderVal=getTestdata("Sender");
				System.out.println("Sender:"+senderVal);
				String selectSender=selectSenderVal.getAttribute("label");
				mobileAction.verifyTextEquality(senderVal, selectSender);
				
				
			}
			else
			{
			String listofsender = "Verifying List Of sender";
			mobileAction.FuncClick(sender,"Clicksender");
			mobileAction.verifyElementIsDisplayed(senderList, listofsender);
	
			}
		}catch (NoSuchElementException |IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	 * This method will cancel the interac e transfer and deposit the the amount to the account
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void cancelPendingTransfer() {
		Decorator();
		try {
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				mobileAction.FuncClick(selectSender, "sender");
				mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue,"Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(cancelSuccessMsg, "Interac e-Transfer reclaimed and deposited successfully");
				String conf_val = mobileAction.getText(cancelCnfrmnVal);
				
			}else{
			
				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				mobileAction.FuncClick(selectSender, "sender");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.FuncClick(depositToContinue,"Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(cancelSuccessMsg, "Interac e-Transfer reclaimed and deposited successfully");
				String conf_val = mobileAction.getText(cancelCnfrmnVal);
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
		 * This method will cancel the pending interac e transfer and deposit the the amount to the account and verify the popup
		 * 
		 * 
		 * @return void
		 * 
		 */
		public void confirmscreen_cancelbutton() {
			Decorator();
			try {
				
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
//					mobileAction.FuncClick(selectSender, "sender");
//					mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
					mobileAction.FuncClick(selectTransaction, "Select Transaction");
					mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
					mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
					mobileAction.FuncClick(depositToContinue,"Continue");
					mobileAction.FuncClick(close, "Click Close");
					mobileAction.verifyElementIsDisplayed(cancel,"Popup is displayed with cancel option");
					mobileAction.verifyElementIsDisplayed(dontCancel,"Popup is displayed with Don't cancel option");
					
				}else{
				
					mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
//					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
					mobileAction.FuncClick(selectTransaction, "Select Transaction");
					mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
					mobileAction.FuncClick(depositToContinue,"Continue");
					mobileAction.FuncClick(close, "Click Close");
					mobileAction.verifyElementIsDisplayed(cancel,"Popup is displayed with cancel option");
					mobileAction.verifyElementIsDisplayed(dontCancel,"Popup is displayed with Don't cancel option");
					
					
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
			 	 * This method will verify the cancelled pending interac e transfer list not displayed on Pending Interac e transfer page
			 * 
			 * 
			 * @return void
			 * 
			 */
			public void verifylist() {
				Decorator();
				try {
					
					if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
//						mobileAction.FuncClick(selectSender, "sender");
//						mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
						mobileAction.FuncClick(clickPendingIcon, "Click Pending Interac e-Transfer Icon");
//						mobileAction.FuncClick(selectSender, "sender");
//						mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
						mobileAction.verifyElementIsDisplayed(pendingTransfer_Header,"The Cancelled pending interac e list is not appearing in pending interac transfer page");
						
					}else{
					
						mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
//						mobileAction.FuncClick(selectSender, "sender");
						mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
						mobileAction.FuncClick(clickPendingIcon, "Click Pending Interac e-Transfer Icon");
//						mobileAction.FuncClick(selectSender, "sender");
						mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
						mobileAction.verifyElementIsDisplayed(pendingTransfer_Header,"The Cancelled pending interac e list is not appearing in pending interac transfer page");
						
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
		 	 * This method will verify the pending interac e transfer list is displaying on Pending Interac Receipt page
		 * 
		 * 
		 * @return void
		 * 
		 */
		public void canceltransfer() {
			Decorator();
			
			try {
				
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
					TouchAction action2 = null;
//					mobileAction.FuncClick(selectSender, "sender");
//					mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
					mobileAction.FuncClick(selectTransaction, "Select Transaction");
					mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
					mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
					mobileAction.FuncClick(depositToContinue,"Continue");
					mobileAction.FuncClick(cnfrmCancellation, "Confirm");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
                    String confrmVal= mobileAction.getText(confirmation_Val);
                    System.out.println("Confirmation:"+ confrmVal);
//					MobileElement cnfmVal=(MobileElement) ((AppiumDriver) CL.GetDriver())
//							.findElement(By.xpath(confrmVal));
					
				    action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(confirmation_Val, 2);
					
					CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");
					
					
				}else{
					TouchAction action2 = null;
					mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
//					mobileAction.FuncClick(selectSender, "sender");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
					mobileAction.FuncClick(selectTransaction, "Select Transaction");
					mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
					mobileAction.FuncClick(depositToContinue,"Continue");
					mobileAction.FuncClick(cnfrmCancellation, "Confirm");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
					String confrmVal= mobileAction.getText(confirmation_Val);
					System.out.println("Confirmation:"+ confrmVal);
//					MobileElement cnfmVal=(MobileElement) ((AppiumDriver) CL.GetDriver())
//							.findElement(By.xpath(confrmVal));
					
				    action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(confirmation_Val, 2);
					
					CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");
					
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
				 * This method will confirm the pending interac e transfer and deposit the the amount to the account
				 * 
				 * 
				 * @return void
				 * 
				 */
				public void confirmbutton() {
					Decorator();
					try {
						
						if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
							
//							mobileAction.FuncClick(selectSender, "sender");
//							mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
							mobileAction.FuncClick(depositToContinue,"Continue");
						
							mobileAction.FuncClick(cnfrmCancellation, "Confirm");
							mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
//							mobileAction.FuncClick(menu, "Menu");
//							mobileAction.FuncClick(home,"Home Button Clicked");
							mobileAction.FuncClick(gobackhomeButton,"Go Back Home Button Clicked");
							mobileAction.verifyElementIsDisplayed(dashboard,"Dashboard Page Opened");
							
						}else{
						
//							mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
//							mobileAction.FuncClick(selectSender, "sender");
							mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(cnfrmCancellation, "Confirm");
							mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
							mobileAction.FuncClick(menu, "Menu");
							mobileAction.FuncClick(home,"Home Button Clicked");
							mobileAction.verifyElementIsDisplayed(dashboard,"Dashboard Page Opened");
							
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
				 * This method will cancel the pending interac e transfer and deposit the the amount to the account
				 * 
				 * 
				 * @return void
				 * 
				 */
				public void cancelbutton() {
					Decorator();
					try {
						
						if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
//							mobileAction.FuncClick(selectSender, "sender");
//							mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(close, "Click Close");
							mobileAction.verifyElementIsDisplayed(cancel,"Popup is displayed");
							mobileAction.FuncClick(cancel,"Cancel");
							mobileAction.verifyElementIsDisplayed(transferHeader, "Transfer Landing Page is displayed");
							
							
						}else{
						
//							mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
//							mobileAction.FuncClick(selectSender, "sender");
							mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(close, "Click Close");
							mobileAction.verifyElementIsDisplayed(cancel,"Popup is displayed");
							mobileAction.FuncClick(cancel,"Cancel");
							mobileAction.verifyElementIsDisplayed(transferHeader, "Transfer Landing Page is displayed");
							
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
				 * This method will confirm the pending interac e transfer and deposit the the amount to the account
				 * 
				 * 
				 * @return void
				 * 
				 */
				public void confirmstatus() {
					Decorator();
					try {
						
						if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
//							mobileAction.FuncClick(selectSender, "sender");
//							mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(cnfrmCancellation, "Confirm");
							mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
							mobileAction.verifyElementIsDisplayed(cancelSuccessMsg,"Interac e-Transfer reclaimed and deposited successfully");
							
						}else{
						
							mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
//							mobileAction.FuncClick(selectSender, "sender");
							mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(cnfrmCancellation, "Confirm");
							mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
							mobileAction.verifyElementIsDisplayed(cancelSuccessMsg,"Interac e-Transfer reclaimed and deposited successfully");
							
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
			 	 * This method will verify the pending interac e transfer list is displaying on Pending Interac Receipt page
			 * 
			 * 
			 * @return void
			 * 
			 */
			public void verifyconfirmation() {
				Decorator();
				
				
				try {
					
					if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
						TouchAction action2 = null;
//						mobileAction.FuncClick(selectSender, "sender");
//						mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						//mobileAction.verifyElementIsDisplayed(verifyStatus,transfer_fromAccount);
						mobileAction.verifyElementIsDisplayed(confirm_Val,transfer_fromAccount);
						
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.verifyElementIsDisplayed(recipientName,transfer_fromAccount);
						mobileAction.verifyElementIsDisplayed(recipientEmailId,transfer_fromAccount);
						
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
	                    String confrmVal= mobileAction.getText(confirmation_Val);
//						MobileElement cnfmVal=(MobileElement) ((AppiumDriver) CL.GetDriver())
//								.findElement(By.xpath(confrmVal));
						
					    action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(confirmation_Val,2);
						
						CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");
						mobileAction.verifyElementIsDisplayed(verifyAccountName, "Verifying Accout Name and Email Id");
						mobileAction.verifyElementIsDisplayed(verifyAccountNum, "Verifying Account Number");
						mobileAction.verifyElementIsDisplayed(verifyAmount, "Verifying Amount");
						
						
					}else{
						TouchAction action2 = null;
						mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
//						mobileAction.FuncClick(selectSender, "sender");
						mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						
						//mobileAction.verifyElementIsDisplayed(verifyStatus,transfer_fromAccount);
						mobileAction.verifyElementIsDisplayed(confirm_Val,transfer_fromAccount);
						
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.verifyElementIsDisplayed(recipientName,transfer_fromAccount);
						mobileAction.verifyElementIsDisplayed(recipientEmailId,transfer_fromAccount);
						
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(receiptHeader, "Receipt Page Opens");
						String confrmVal= mobileAction.getText(confirmation_Val);
//						MobileElement cnfmVal=(MobileElement) ((AppiumDriver) CL.GetDriver())
//								.findElement(By.xpath(confrmVal));
						
					    action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(confirmation_Val, 2);
						
						CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");
						mobileAction.verifyElementIsDisplayed(verifyAccountName, "Verifying Accout Name");
						mobileAction.verifyElementIsDisplayed(verifyAccountEmailId, "Verifying Email Id");
						mobileAction.verifyElementIsDisplayed(verifyAccountNum, "Verifying Account Number");
						mobileAction.verifyElementIsDisplayed(verifyAmount, "Verifying Amount");
						
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
			 * This method will cancel the interac e transfer and deposit the the amount to the account
			 * 
			 * 
			 * @return void
			 * 
			 */
			public void verify_CancelPendingTransfer() {
			
				Decorator();
				try {
					
					if(platformName.equalsIgnoreCase("ios")){
						mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
						mobileAction.FuncClick(selectSender, "sender");
						mobileAction.FuncSelectElementInTable(senderTable, firstPart, secondPart,sender_selectSender );
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
						String balance = Balance.getAttribute("value");
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(cancelSuccessMsg, "Interac e-Transfer reclaimed and deposited successfully");
						String conf_val = mobileAction.getText(cancelCnfrmnVal);
						mobileAction.FuncClick(menu, "Menu");
						mobileAction.FuncClick(my_Accounts, "My Accounts");
						mobileAction.FuncSelectElementInTable(accountsPage_Table,firstPart,accountssecondPart,from_account);
						String balancenew = balanceNew.getAttribute("value");
						
						if(balance.equalsIgnoreCase(balancenew)){
							System.err.println("TestCase has failed.");
						}
						else{
							mobileAction.FuncClick(home, "home button");
						}
						
						
					}else{
					
						mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
						mobileAction.FuncClick(selectSender, "sender");
						mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_senderValue, 0, "down", true);
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						String balance = Balance.getAttribute("value");
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(cancelSuccessMsg, "Interac e-Transfer reclaimed and deposited successfully");
						String conf_val = mobileAction.getText(cancelCnfrmnVal);
						mobileAction.FuncClick(menu, "Menu");
						mobileAction.FuncClick(my_Accounts, "My Accounts");
						mobileAction.FuncSelectElementInTable(accountsPage_Table,firstPart,accountssecondPart,from_account);
						String balancenew = balanceNew.getAttribute("value");
						
						if(balance.equalsIgnoreCase(balancenew)){
							System.err.println("TestCase has failed.");
						}
						else{
							mobileAction.FuncClick(home, "home button");
						}
					}
				} catch (NoSuchElementException | InterruptedException | IOException e) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				} catch (Exception e) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
			}
}

