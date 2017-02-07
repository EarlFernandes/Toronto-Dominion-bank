package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@iOSFindBy(xpath= "//*[@label='Pending Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pending Interac e-Transfer']")
	private MobileElement pending_interace_transfer_header; 
	
	@iOSFindBy(xpath= "//*[@label='-Sender']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/layout_etransfer_sender_layout']")
	private MobileElement Sender;
	
	@iOSFindBy(xpath= "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement SenderList;
	
	@iOSFindBy(xpath ="//*[@label='Pending Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pending Interac e-Transfer']")
	private MobileElement pendingTransfer_Header;
	
	@iOSFindBy(xpath ="//*[contains(@value,'Select sender')]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/layout_etransfer_sender_layout']")
	private MobileElement selectSender;
	
	@iOSFindBy(xpath ="//*[@label='-Balance-'][1]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	private MobileElement selectTransaction;
	
	@iOSFindBy(xpath ="//*[@label='Cancel Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Cancel Interac e-Transfer']")
	private MobileElement cancelTransfer;
	
	@iOSFindBy(xpath = "//*[contains(@label,'-Balance')]")// Need to change account
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/deposit_account']")
	private MobileElement depositToAccount;
	
	
	@iOSFindBy(xpath = "//*[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Continue']")
	private MobileElement depositToContinue;
	
	@iOSFindBy(xpath = "//*[@label='Close']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/entransfer_btn_cancel' and @text='Close']")
	private MobileElement close;
	
	@iOSFindBy(xpath = "//*[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2' and @text='Close']")
	private MobileElement cancel;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Don')]")
	@AndroidFindBy(xpath = "//android.widget.Button@resource-id='android:id/button1' and @text='Don't Cancel']")
	private MobileElement dontcancel;
	
	@iOSFindBy(xpath = "//*[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement transferheader;
	
	@iOSFindBy(xpath = "//*[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Receipt']")
	private MobileElement receiptheader;
	
	@iOSFindBy(xpath="//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;
	
	@iOSFindBy(xpath="//*[@label='Home']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and and @text='Home']")
	private MobileElement home;
	
	@iOSFindBy(xpath="//*[@label='Quick Access']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title'and @text='Home']")
	private MobileElement dashboard;
	
	//@iOSFindBy(id = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2][@label='Confirm']")
	@iOSFindBy(xpath="//*[@label='Confirm']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/entransfer_btn_finish' and @text='Confirm']")
	private MobileElement cnfrmCancellation;
	
	@iOSFindBy(id = "//*[@label='PENDING E-TRANSFERS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/pending_transfers' and @text='PENDING E-TRANSFERS']")
	private MobileElement clickpendingicon;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation']")
	private MobileElement confirmation_val;
	
	@iOSFindBy(xpath ="//*[@label='Interac e-Transfer reclaimed and deposited successfully']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Interac e-Transfer reclaimed and deposited successfully']")
	private MobileElement cancelSuccessmsg;
	
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement cancelCnfrmnVal;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntsList;
	
	@iOSFindBy(id = "//*[@label='-Sender']")
	private MobileElement  verifysender;
	
	
	@iOSFindBy(id = "//*[@label='Processing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Processing']")
	private MobileElement verifystatus;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation']")
	private MobileElement confirm_val;
	
	@iOSFindBy(id = "//*[@label='-Title']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/pending_transfers' and @text='PENDING E-TRANSFERS']")
	private MobileElement verifydepositaccount;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/entransfer_recipient_name']")
	private MobileElement recipientname;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/etransfer_recipient_email']")
	private MobileElement recipientemailid;
	
	@iOSFindBy(xpath = "//*[@name='-Recipient']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/entransfer_recipient_name']")
	private MobileElement verifyaccountname;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/etransfer_recipient_email']")
	private MobileElement verifyaccountemailid;
	
	@iOSFindBy(xpath = "//*[@name='-Deposit To']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/entransfer_deposit_account']")
	private MobileElement verifyaccountnum;
	
	@iOSFindBy(xpath = "//*[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_amount_header']")
	private MobileElement verifyamount;
	
	@iOSFindBy(xpath="//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "")
	private MobileElement selectSenderVal;
	
	
	String sender_SelectSender = getTestdata("Sender", "UserIDs");
	String select_SenderValue = "//android.widget.TextView[starts-with(@text,'" + sender_SelectSender+ "')]";
	
	String transferRecipient = getTestdata("FromAccount", "UserIDs");
	String select_Recipient = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account' and @text='" + transferRecipient + "')]";
	
	String platformName=CL.getTestDataInstance().getMobilePlatForm();
	String transfer_fromAccount = getTestdata("FromAccount", "UserIDs");
	
	int i=1;
	String senderTable="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";
	
	String Firstpart="//XCUIElementTypeCell[";
	String Secondpart="]/XCUIElementTypeStaticText[1]";
	String Finalpart=Firstpart+i+Secondpart;
	
	
	

	
	
	

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
			mobileAction.verifyElementIsDisplayed(pending_interace_transfer_header, "Pending Interac Transfer Landing Page verified");
			
			} catch (NoSuchElementException|IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	 * This method will verify the Sender profile Pending e Transfers list is not displayed until the Sender is selected
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
			String sender = "Verifying Sender";
			mobileAction.verifyElementIsDisplayed(Sender, sender);
	
			} catch (NoSuchElementException |IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	 * This method will verify Sender dropdown list of senders profiles on Pending Interac_e transfer Page
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
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@label='-Sender']")));
				
				mobileAction.FuncClick(selectSender, "Sender");
				String senderVal=getTestdata("Sender", "UserIDs");
				String selectSender=selectSenderVal.getAttribute("label");
				mobileAction.verifyTextEquality(senderVal, selectSender);
				
				
			}
			else
			{
			String listofsender = "Verifying List Of Sender";
			mobileAction.FuncClick(Sender,"ClickSender");
			mobileAction.verifyElementIsDisplayed(SenderList, listofsender);
	
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
				mobileAction.FuncClick(selectSender, "Sender");
				mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
				mobileAction.FuncClick(depositToContinue,"Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(cancelSuccessmsg, "Interac e-Transfer reclaimed and deposited successfully");
				String conf_val = mobileAction.getText(cancelCnfrmnVal);
				
			}else{
			
				mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
				mobileAction.FuncClick(selectSender, "Sender");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_SenderValue, 0, "down", true);
				mobileAction.FuncClick(selectTransaction, "Select Transaction");
				mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
				mobileAction.FuncClick(depositToContinue,"Continue");
				mobileAction.FuncClick(cnfrmCancellation, "Confirm");
				mobileAction.verifyElementIsDisplayed(cancelSuccessmsg, "Interac e-Transfer reclaimed and deposited successfully");
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
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
					mobileAction.FuncClick(selectTransaction, "Select Transaction");
					mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
					mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
					mobileAction.FuncClick(depositToContinue,"Continue");
					mobileAction.FuncClick(close, "Click Close");
					mobileAction.verifyElementIsDisplayed(cancel,"Popup is displayed with cancel option");
					mobileAction.verifyElementIsDisplayed(dontcancel,"Popup is displayed with Don't cancel option");
					
				}else{
				
					mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_SenderValue, 0, "down", true);
					mobileAction.FuncClick(selectTransaction, "Select Transaction");
					mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
					mobileAction.FuncClick(depositToContinue,"Continue");
					mobileAction.FuncClick(close, "Click Close");
					mobileAction.verifyElementIsDisplayed(cancel,"Popup is displayed with cancel option");
					mobileAction.verifyElementIsDisplayed(dontcancel,"Popup is displayed with Don't cancel option");
					
					
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
						mobileAction.FuncClick(selectSender, "Sender");
						mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
						mobileAction.FuncClick(clickpendingicon, "Click Pending Interac e-Transfer Icon");
						mobileAction.FuncClick(selectSender, "Sender");
						mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
						mobileAction.verifyElementIsDisplayed(pendingTransfer_Header,"The Cancelled pending interac e list is not appearing in pending interac transfer page");
						
					}else{
					
						mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
						mobileAction.FuncClick(selectSender, "Sender");
						mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_SenderValue, 0, "down", true);
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
						mobileAction.FuncClick(clickpendingicon, "Click Pending Interac e-Transfer Icon");
						mobileAction.FuncClick(selectSender, "Sender");
						mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_SenderValue, 0, "down", true);
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
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
					mobileAction.FuncClick(selectTransaction, "Select Transaction");
					mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
					mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
					mobileAction.FuncClick(depositToContinue,"Continue");
					mobileAction.FuncClick(cnfrmCancellation, "Confirm");
					mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
                    String confrmVal= mobileAction.getText(confirmation_val);
					MobileElement cnfmVal=(MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(confrmVal));
					
				    action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(cnfmVal, 2);
					
					CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");
					
					
				}else{
					TouchAction action2 = null;
					mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_SenderValue, 0, "down", true);
					mobileAction.FuncClick(selectTransaction, "Select Transaction");
					mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
					mobileAction.FuncClick(depositToContinue,"Continue");
					mobileAction.FuncClick(cnfrmCancellation, "Confirm");
					mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
					String confrmVal= mobileAction.getText(confirmation_val);
					MobileElement cnfmVal=(MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(confrmVal));
					
				    action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(cnfmVal, 2);
					
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
							
							mobileAction.FuncClick(selectSender, "Sender");
							mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
							mobileAction.FuncClick(depositToContinue,"Continue");
						
							mobileAction.FuncClick(cnfrmCancellation, "Confirm");
							mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
							mobileAction.FuncClick(menu, "Menu");
							mobileAction.FuncClick(home,"Home Button Clicked");
							mobileAction.verifyElementIsDisplayed(dashboard,"Dashboard Page Opened");
							
						}else{
						
							mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
							mobileAction.FuncClick(selectSender, "Sender");
							mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_SenderValue, 0, "down", true);
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(cnfrmCancellation, "Confirm");
							mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
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
							mobileAction.FuncClick(selectSender, "Sender");
							mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(close, "Click Close");
							mobileAction.verifyElementIsDisplayed(cancel,"Popup is displayed");
							mobileAction.FuncClick(cancel,"Cancel");
							mobileAction.verifyElementIsDisplayed(transferheader, "Transfer Landing Page is displayed");
							
							
						}else{
						
							mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
							mobileAction.FuncClick(selectSender, "Sender");
							mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_SenderValue, 0, "down", true);
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(close, "Click Close");
							mobileAction.verifyElementIsDisplayed(cancel,"Popup is displayed");
							mobileAction.FuncClick(cancel,"Cancel");
							mobileAction.verifyElementIsDisplayed(transferheader, "Transfer Landing Page is displayed");
							
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
							mobileAction.FuncClick(selectSender, "Sender");
							mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(cnfrmCancellation, "Confirm");
							mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
							mobileAction.verifyElementIsDisplayed(cancelSuccessmsg,"Interac e-Transfer reclaimed and deposited successfully");
							
						}else{
						
							mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
							mobileAction.FuncClick(selectSender, "Sender");
							mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_SenderValue, 0, "down", true);
							mobileAction.FuncClick(selectTransaction, "Select Transaction");
							mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
							mobileAction.FuncClick(depositToContinue,"Continue");
							mobileAction.FuncClick(cnfrmCancellation, "Confirm");
							mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
							mobileAction.verifyElementIsDisplayed(cancelSuccessmsg,"Interac e-Transfer reclaimed and deposited successfully");
							
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
						mobileAction.FuncClick(selectSender, "Sender");
						mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						mobileAction.verifyElementIsDisplayed(verifystatus,transfer_fromAccount);
						mobileAction.verifyElementIsDisplayed(confirm_val,transfer_fromAccount);
						
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.verifyElementIsDisplayed(recipientname,transfer_fromAccount);
						mobileAction.verifyElementIsDisplayed(recipientemailid,transfer_fromAccount);
						
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
	                    String confrmVal= mobileAction.getText(confirmation_val);
						MobileElement cnfmVal=(MobileElement) ((AppiumDriver) CL.GetDriver())
								.findElement(By.xpath(confrmVal));
						
					    action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(cnfmVal,2);
						
						CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");
						mobileAction.verifyElementIsDisplayed(verifyaccountname, "Verifying Accout Name and Email Id");
						mobileAction.verifyElementIsDisplayed(verifyaccountnum, "Verifying Account Number");
						mobileAction.verifyElementIsDisplayed(verifyamount, "Verifying Amount");
						
						
					}else{
						TouchAction action2 = null;
						mobileAction.verifyElement(pendingTransfer_Header, "Pending Interac e-Transfer");
						mobileAction.FuncClick(selectSender, "Sender");
						mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_SenderValue, 0, "down", true);
						mobileAction.FuncClick(selectTransaction, "Select Transaction");
						
						mobileAction.verifyElementIsDisplayed(verifystatus,transfer_fromAccount);
						mobileAction.verifyElementIsDisplayed(confirm_val,transfer_fromAccount);
						
						mobileAction.FuncClick(cancelTransfer, "Cancel Transfer");
						mobileAction.verifyElementIsDisplayed(depositToAccount,transfer_fromAccount);
						mobileAction.FuncClick(depositToContinue,"Continue");
						mobileAction.verifyElementIsDisplayed(recipientname,transfer_fromAccount);
						mobileAction.verifyElementIsDisplayed(recipientemailid,transfer_fromAccount);
						
						mobileAction.FuncClick(cnfrmCancellation, "Confirm");
						mobileAction.verifyElementIsDisplayed(receiptheader, "Receipt Page Opens");
						String confrmVal= mobileAction.getText(confirmation_val);
						MobileElement cnfmVal=(MobileElement) ((AppiumDriver) CL.GetDriver())
								.findElement(By.xpath(confrmVal));
						
					    action2 = new TouchAction(((MobileDriver) CL.GetDriver())).longPress(cnfmVal, 2);
						
						CL.GetReporting().FuncReport("Pass", "Confirmation displays and selectable");
						mobileAction.verifyElementIsDisplayed(verifyaccountname, "Verifying Accout Name");
						mobileAction.verifyElementIsDisplayed(verifyaccountemailid, "Verifying Email Id");
						mobileAction.verifyElementIsDisplayed(verifyaccountnum, "Verifying Account Number");
						mobileAction.verifyElementIsDisplayed(verifyamount, "Verifying Amount");
						
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

