package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Interac_e_Transfer extends _CommonPage {
	private static Interac_e_Transfer Interac_e_Transfer;
	

	@iOSFindBy(xpath= "//XCUIElementTypeOther[@label='Add Recipient']")
	private MobileElement addRecipient_Interac;
	

	@iOSFindBy(xpath= "//*[@label='Interac e-Transfer']")
	private MobileElement interac_Header;
	
	@iOSFindBy(xpath="//*[@label='In progress']")
	private MobileElement progrees_bar;
	
	@iOSFindBy(xpath = "//*[@label='Interac e-Transfer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Interac e-Transfer']")
	private MobileElement Interac_Etransfer_Header;
	
	@iOSFindBy(xpath = "//*[@label='Sender, Select sender']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_sender' and @text='Select Sender']")
	private MobileElement selectSender;
	
	//@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField")
	@iOSFindBy(xpath = "//*[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_amount']")
	private MobileElement etransfer_Amount;
	
	@iOSFindBy(xpath = "//*[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer' and @text='Continue']")
	private MobileElement transfer_Continue;
	
	@iOSFindBy(xpath = "//*[@label='Send Money']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_send_money' and @text='Send Money']")
	private MobileElement sendMoney;
	
	@iOSFindBy(xpath = "//*[@label='Interac e-Transfer Sent']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Interac e-Transfer Sent']")
	private MobileElement transferSent;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_val;
	
	@iOSFindBy(xpath = "//*[@label='From account, Select from account']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account']")
	private MobileElement fromAccount;
	
	@iOSFindBy(xpath = "//*[@label='-Balance-']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer']")
	private MobileElement fromAccountVal;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntsList;
	
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/listView']")
	private MobileElement acntsListSender;
	
	
	@iOSFindBy(xpath ="//*[@label='Recipient, Select recipient']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_recipient']")
	private MobileElement recipient;
	
	@iOSFindBy(xpath ="//*[@label='Done']")
	private MobileElement done;
	
	@iOSFindBy(xpath ="//*[@label='PENDING E-TRANSFERS']")
	private MobileElement pendingTransfer;
	
	@iOSFindBy(xpath= "//*[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Close']")
	private MobileElement cancel;

	@iOSFindBy(xpath= "//*[@label='CANCEL']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtSpecialAction' and @text='Cancel']")
	private MobileElement SenderCancel;
	
	@iOSFindBy(xpath= "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account']")
	private MobileElement accountnum;
	
	@iOSFindBy(xpath= "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccountAmountTransfer]")
	private MobileElement totalamount;
	
	@iOSFindBy(xpath= "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account']")
	private MobileElement accountname;
	
	
	String sender_SelectSender = getTestdata("FromAccount", "UserIDs");
	String select_SenderValue = "//android.widget.TextView[starts-with(@text,'" + sender_SelectSender + "')]";
	String t_interacHeader="Interac e-Transfer";

	String transfer_fromAccount = getTestdata("FromAccount", "UserIDs");
	String select_Account = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account' and @text='" + transfer_fromAccount + "')]";
	
	
	String transferRecipient = getTestdata("ToAccount", "UserIDs");
	String select_Recipient = "//android.widget.EditText[@resource-id='com.td:id/edt_etransfer_from_account' and @text='" + transferRecipient + "')]";
	
	
	int i=1;
	String senderTable="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	
	String Firstpart="//XCUIElementTypeCell[";
	String Secondpart="]/XCUIElementTypeStaticText[1]";
	String Finalpart=Firstpart+i+Secondpart;
	
	String ValueofAmount = getTestdata("Amount", "UserIDs");
	
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
	 * 
	 */
	public void verifyInteracHeader() {


		Decorator();
		try {
		mobileAction.verifyElementIsDisplayed(interac_Header,t_interacHeader) ;
		
			
			
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
			
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
				    mobileAction.FuncClick(etransfer_Amount, "Amount");
					mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
					mobileAction.FuncClick(done, "Done");;
					mobileAction.FuncClick(transfer_Continue, "Continue");
					mobileAction.FuncClick(sendMoney, "Send Money");
					String confrmVal= mobileAction.getText(confirmation_val);
					mobileAction.verifyElementIsDisplayed(transferSent, "Interac e-Transfer Sent");
					
					
					
				}else{
					
					mobileAction.verifyElement(Interac_Etransfer_Header, "Interac e-Transfer");
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 0, "down", true);
					
					mobileAction.FuncClick(fromAccount, "From Account");
				    accVal = Double.parseDouble(mobileAction.getText(fromAccountVal));
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Account, 0, "down", true);
					mobileAction.FuncClick(recipient, "Recipient");
					
					mobileAction.FuncElementSwipeWhileNotFound(acntsList,select_Recipient, 0, "down", true);
					String ValueofAmount = getTestdata("Amount", "UserIDs");
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
			
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
					mobileAction.FuncClick(recipient,"Recipient");
				    mobileAction.FuncClick(etransfer_Amount, "Amount");
					mobileAction.FuncSendKeys(etransfer_Amount, ValueofAmount);
					mobileAction.FuncClick(done, "Done");;
					mobileAction.FuncClick(transfer_Continue, "Continue");
					mobileAction.FuncClick(cancel, "Cancel");
					
					}else{
					
					mobileAction.verifyElement(Interac_Etransfer_Header, "Interac e-Transfer");
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 0, "down", true);
					
					mobileAction.FuncClick(fromAccount, "From Account");
				    accVal = Double.parseDouble(mobileAction.getText(fromAccountVal));
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_Account, 0, "down", true);
					mobileAction.FuncClick(recipient, "Recipient");
					
					mobileAction.FuncElementSwipeWhileNotFound(acntsList,select_Recipient, 0, "down", true);
					String ValueofAmount = getTestdata("Amount", "UserIDs");
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
	 * This method will click sender dropdown  and click cancel button in sender dropdown list
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
			
		    mobileAction.FuncClick(selectSender,"ClickSender");
			mobileAction.FuncClick(SenderCancel,"Click Cancel");
	
			} catch (NoSuchElementException |IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will verify the default amount value in Interac_e_transfer page
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * 
	 */
	public void verifyamountfield() {
        Decorator();
		try {

			String val=etransfer_Amount.getAttribute("value");
			String excelVal=getTestdata("Amount","smartPhoneRedesign_IET");
			
				mobileAction.verifyTextEquality(val, excelVal);
			
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
				
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))
				{
					
					mobileAction.FuncClick(selectSender, "Sender");
					mobileAction.FuncSelectElementInTable(senderTable, Firstpart, Secondpart,sender_SelectSender );
					
				}
				else{
				mobileAction.FuncClick(selectSender, "Sender");
				mobileAction.FuncElementSwipeWhileNotFound(acntsListSender, select_SenderValue, 0, "down", true);
				String account_name=accountname.getAttribute("AccountName");
				String excelaccountname=getTestdata("FromAccount","smartPhoneRedesign_IET");
				mobileAction.verifyTextEquality(account_name, excelaccountname);
				String account_num=accountnum.getAttribute("Account Number");
				String excelaccountnum = getTestdata("Accounts","smartPhoneRedesign_IET");
				mobileAction.verifyTextEquality(account_num, excelaccountnum);
				String total_amount=totalamount.getAttribute("Total Amount");
				String excelamount=getTestdata("Amount","smartPhoneRedesign_IET");
				mobileAction.verifyTextEquality(total_amount, excelamount);
				} 
			    }catch (NoSuchElementException | InterruptedException | IOException e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
	}



}
