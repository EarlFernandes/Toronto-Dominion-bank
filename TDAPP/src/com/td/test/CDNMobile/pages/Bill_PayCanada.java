package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

public class Bill_PayCanada extends _CommonPage {

	private static Bill_PayCanada Bill_PayCanada;

	@iOSFindBy(xpath = "//*[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
	private MobileElement from_account_post;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber'and @text='6450943']")
	private MobileElement frm_acnt_post;

	@iOSFindBy(xpath = "//*[@label='Payee, Select Payee']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee']")
	private MobileElement to_account_post;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee']")
	private MobileElement to_acnt_post;

	@iOSFindBy(xpath = "//*[contains(@label,'From Account, Select from account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
	private MobileElement from_account;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement accountListView;

	String FromAccountXL = MainScreen.valueMap.get("FromAccount");

	String FromAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='"
			+ FromAccountXL + "']";

	@iOSFindBy(xpath = "//*[@label='From Account, Select from account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='PREFERRED CHEQUING ACCOUNT']")
	private MobileElement select_from_acnt;

	String t_select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='PREFERRED CHEQUING ACCOUNT']";

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button' and @text='Cancel']")
	private MobileElement clickCancle;

	@iOSFindBy(xpath = "//*[@label='From Account, Select from account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee' and @text='Select Payee']")
	private MobileElement to_account;

	String t_select_to_account = "//android.widget.TextView[@resource-id='com.td:id/edtPayee' and @text='Select Payee']";

	String ToAccountXL = MainScreen.valueMap.get("ToAccount");

	String ToAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='"
			+ ToAccountXL + "']";

	@iOSFindBy(xpath = "//")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='TD CLASSIC TRAVEL VIS... 4520020000005323']")
	private MobileElement select_to_account;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/edtAmt'and @index='1']")
	private MobileElement amount;

	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/edtAmount' and
	// @text='$0.00']")
	// private MobileElement amount;
	// String t_amount = "$0.00";

	

	@iOSFindBy(xpath = "//*[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Continue']")
	private MobileElement continue_pay;

	@iOSFindBy(xpath = "//*[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue'and @text='Pay Bill']")
	private MobileElement pay_bill;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_val;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//*[@label='Pay Bill']")
	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pay Bill']")
	private MobileElement payBill_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title'and @text='My Accounts']")
	private MobileElement my_accounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntDescrSum' and @text='PREFERRED CHEQUING ACCOUNT']")
	private MobileElement verify_from_account;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@text='' and @index='0']//android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement last_transaction;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[@label='Add Canadian Payee']")
	private MobileElement addCanada_Payee;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	private MobileElement progrees_bar;

	@iOSFindBy(xpath = "//*[@label='Search for Canadian payees']")
	private MobileElement search_bar;

	@iOSFindBy(xpath = "//*[@label='Add Canadian Payee']")
	private MobileElement addCanada_Payee_header;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	
	@iOSFindBy(xpath = "//*[@label='Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement amountHeader;

	@iOSFindBy(xpath = "//*[@label='Date']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement date;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation # :' and @resource-id='com.td:id/confirmation']")
	private MobileElement confirmation_text;

	@iOSFindBy(xpath = "//*[@label='Select Payee']")
	private MobileElement select_payee;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']")
	private MobileElement homeBtn;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement ListViewToAccount;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = " ")
	private MobileElement currDate;

	int m = 1;
	String Conf = "Confirmation";
	
	
	String fromAccountPost="6450943";
	String toAccountPost = "GLOBE & MAIL 123456789012";

	@iOSFindBy(xpath = "//*[@label='Thank you!']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Thank you!' and @resource-id='com.td:id/thank_you']")
	private MobileElement confirmationText;
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtAccessCard']")
	private MobileElement accesscard;
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount']")
	private MobileElement AcntVal;
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee']")
	private MobileElement PayeVal;
	
	@iOSFindBy(xpath = " //XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText[1][@label='ACCESS CARD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Bills']")
	private MobileElement accesscardTableHeader;
	
	@iOSFindBy(xpath = " //XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard' and @index='1']/following::@index='0'[1]")
	private MobileElement selectSecondAccessCard;
	
	@iOSFindBy(xpath="//*[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Cancel']")
	private MobileElement cancelBtn;
	
	@iOSFindBy(xpath = "//*[@label ='Bills']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Bills']")
	private MobileElement bills_header;

	@iOSFindBy(xpath ="//*[@label='Back']")
	private MobileElement back_button; 
	
	@iOSFindBy(xpath= "//*[@label='Quick Access']")
	@AndroidFindBy(xpath = "//*[@resource-id = 'android:id/action_bar_title']")
	private MobileElement home;
	
	@iOSFindBy(xpath = "//*[@label='Back']")
	private MobileElement backButton;
	
	@iOSFindBy(xpath = "//*[@label='PAY ANOTHER BILL']")
	private MobileElement PayBillQuickAccess;
	
	@iOSFindBy(xpath="//*[@label='Add Canadian Payees Now']")
	private MobileElement addCanadianPayee;
	
	String accesscardTable=" //XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + m + Secondpart;
	
	
	String t_confirmationText = "Thank you!";

	String t_frm_acnt_post = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber'and @text='6450943']";

	String t_to_acnt_post = "////android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='GLOBE & MAIL 123456789012']";
	
	

	

	String merchant_name = "//*[contains(@label,'";

	String payee_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";

	public synchronized static Bill_PayCanada get() {
		if (Bill_PayCanada == null) {
			Bill_PayCanada = new Bill_PayCanada();
		}
		return Bill_PayCanada;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)),
				this);

	}

	public void pay_candadian_bill() throws Exception {

		try {
			String payeeAccount = getTestdata("FromAccount", "Payment");
		
			Decorator();

			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				mobileAction.FuncClick(amount, "Amount button clicked");
				String Amount = MainScreen.valueMap.get("Amount");
				mobileAction.FuncSendKeys(amount, Amount);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(confirmationText, "Thank You!");
				mobileAction.verifyElementIsDisplayed(confirmation_val, "Confirmation Value");

			}

			else {
				String ToPostAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='"
						+ payeeAccount + "']";
				mobileAction.FuncClick(to_account_post, "Select Payee");
				mobileAction.FuncElementSwipeWhileNotFound(ListViewToAccount, ToPostAccountXpath, 1, "up", true);
				mobileAction.waitForElementToDisappear(t_select_to_account);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, MainScreen.valueMap.get("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.verifyElement(confirmationText, t_confirmationText);
				
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {

			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}
	
	/**
	 * This method will verify the Payee Access card DropDown is present or Not
	 * 
	 * @throws NoSuchElementException and IOException
	 */
	
	public void verifyAccessCard_dropdown(){
		
		Decorator();
		try{
			mobileAction.verifyElementIsDisplayed(payBill_Header, "PayBillHeader");
			Thread.sleep(2000);
			mobileAction.FuncClick(accesscard, "Accesscard");
			mobileAction.verifyElementIsDisplayed(accesscardTableHeader, "ACCESS CARD");

			
		}catch(NoSuchElementException |IOException  |InterruptedException e){
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will verify the Payee Access card all Details
	 * 
	 * @throws NoSuchElementException and IOException
	 */
	public void verifyAccessCardDetails(){
		
		Decorator();
		try{
			mobileAction.verifyElementIsDisplayed(payBill_Header, "PayBillHeader");
			
			mobileAction.verifyElementIsDisplayed(from_account,"From_Account");
			mobileAction.verifyElementIsDisplayed(amountHeader, "amount");
			mobileAction.verifyElementIsDisplayed(date, "Date");
			}catch(NoSuchElementException |IOException e){
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	 * This method will verify both First and Second  Access cards having Payee and accounts details.
	 * @throws Exception 
	 * @throws InterruptedException 
	 * 
	 * @throws NoSuchElementException and IOException
	 */
	public void accesscardsWithPayeeandAccounts() throws Exception {
		
		Decorator();
		try{
			mobileAction.verifyElementIsDisplayed(payBill_Header, "PayBillHeader");
			String accountVal=MainScreen.valueMap.get("FromAccount");
			String[] accountValue=accountVal.split(":");
			String payee = MainScreen.valueMap.get("Payee");
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				for(int i=0;i<accountValue.length;i++){
					String AccountVal=AcntVal.getAttribute("label");
					mobileAction.verifyTextEquality(accountValue[i], AccountVal);
					String payeeValue=PayeVal.getAttribute("label");
					mobileAction.verifyTextEquality(payee, payeeValue);
					mobileAction.FuncClick(accesscard, "Access Card");
					mobileAction.FuncClick(selectSecondAccessCard,"Select Access Card from Access card table");
				}
			
			}else{
				
				for(int i=0;i<accountValue.length;i++){
					String AccountVal=AcntVal.getText();
					mobileAction.verifyTextEquality(accountValue[i], AccountVal);
					String payeeValue=PayeVal.getText();
					mobileAction.verifyTextEquality(payee, payeeValue);
					mobileAction.FuncClick(accesscard, "Access Card");
					mobileAction.FuncClick(selectSecondAccessCard,"Select Access Card from Access card table");//check the xpath
				}
			}
			
			}catch(NoSuchElementException |IOException  | InterruptedException e){
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	

	public void pay_candadian_bill_post_dated() {

		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(from_account_post, "From Account");
				mobileAction.FuncClick(to_account_post, "Select Payee");
				mobileAction.FuncClick(done, "Done");

			}

			mobileAction.FuncClick(from_account_post, "From Account");
			mobileAction.FuncClick(frm_acnt_post,fromAccountPost);
			mobileAction.waitForElementToDisappear(t_frm_acnt_post);

			mobileAction.FuncClick(to_account_post, "Select Payee");
			mobileAction.FuncClick(to_acnt_post,toAccountPost);
			mobileAction.waitForElementToDisappear(t_select_to_account);

			mobileAction.FuncClick(amount, "Amount");
			String ValueofAmount = MainScreen.valueMap.get("Amount");
			mobileAction.FuncSendKeys(amount, ValueofAmount);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(date, "Date");

			String date = String.valueOf(GetDate.get().getTomorrowsDate());
			String post_date = "//android.view.View[@content-desc='" + date + "']";
			mobileAction.findElementByXpathAndClick(post_date);
			// mobileAction.FuncClick(select_post_date);
			mobileAction.FuncClick(continue_pay, "Continue Pay");
			mobileAction.FuncClick(pay_bill, "Pay bill");

			// mobileAction.verifyTextContains(confirmation_text, Conf);
			mobileAction.verifyElement(confirmationText, t_confirmationText);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void addCanadianPayee() {
		Decorator();
		try {

			Thread.sleep(5000);
			mobileAction.FuncClick(addCanada_Payee, "CanadaPayee");
			mobileAction.waitForElementToVanish(progrees_bar);
			mobileAction.FuncClick(search_bar, "SearchforCanadianPayees");
			String search_bar_value = MainScreen.valueMap.get("Search");
		
			mobileAction.FuncSendKeys(search_bar, search_bar_value);

			mobileAction.waitForElementToVanish(progrees_bar);

			String merchant_value = MainScreen.valueMap.get("MerchantName");
			String merchant_name_value = merchant_name + merchant_value + "')]";
			CL.GetDriver().findElement(By.xpath(merchant_name_value)).click();
			Thread.sleep(5000);

			mobileAction.waitForElementToVanish(progrees_bar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will cancel the pay bill 
	 * @throws Exception 
	 * @throws InterruptedException 
	 * 
	 * @throws NoSuchElementException and IOException
	 */
	
	public void payBillCancel() {
		Decorator();
		try {

			String payeeAccount = getTestdata("FromAccount", "Payment");
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				mobileAction.FuncClick(amount, "Amount button clicked");
				String Amount = MainScreen.valueMap.get("Amount");
				mobileAction.FuncSendKeys(amount, Amount);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(cancelBtn, "Cancel");
				Bills.get().verifyBillHeader();

			}

			else {
				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, MainScreen.valueMap.get("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(cancelBtn, "Cancel");
				Bills.get().verifyBillHeader();
				
				
				
				
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will verify the default value of the amount
	 * @throws Exception 
	 * @throws InterruptedException 
	 * 
	 * @throws NoSuchElementException and IOException
	 */
	
	public void amountSelection() {
		Decorator();
		try {

			String payeeAccount =getTestdata("FromAccount", "Payment");
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				String amountVal=amount.getAttribute("value");
				String Amount = MainScreen.valueMap.get("Amount");
				String[] amtVal = Amount.split(":");
				mobileAction.verifyTextEquality(amountVal, amtVal[0]);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, amtVal[1]);
				mobileAction.FuncClick(done, "Done");
				
			}

			else {
				
				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				String amountVal=amount.getText();
				String Amount = MainScreen.valueMap.get("Amount");
				String[] amtVal = Amount.split(":");
				mobileAction.verifyTextEquality(amountVal,amtVal[0]);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, amtVal[1]);
				mobileAction.FuncHideKeyboard();
				
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will verify the Back button on the Pay Bill landing page
	 * 
	 * @throws NoSuchElementException and IOException
	 */
	
	public void verifyBackButton(){
		
		Decorator();
		try{
			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				mobileAction.FuncClick(backButton, "Back Button");
			}else{
				mobileAction.FuncHideKeyboard();
			}
			Bills.get().verifyBillHeader();
			

			
		}catch(NoSuchElementException |IOException  |InterruptedException e){
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will verify the the Add canadian Payee Now button
	 * 
	 * @throws NoSuchElementException and IOException
	 */
	
	public void verifyAddCanadianPayeeButton(){
		
		Decorator();
		try{
			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
			mobileAction.verifyElementIsDisplayed(addCanadianPayee, "Add Canadian Payee");
			

			
		}catch(NoSuchElementException |IOException e){
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will click on the Pay Bill Quick Access In Receipt Page
	 * @throws IOException 
	 * @throws InterruptedException 
	 * 
	 * @throws NoSuchElementException and IOException
	 */
	
	public void payBillQuickAccessBtn() throws InterruptedException, IOException{
		
		Decorator();
		try{
			
			mobileAction.FuncClick(PayBillQuickAccess, "Pay Bill Quick Access Button");
			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");

			
		}catch(NoSuchElementException e){
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void negativeTestingBillPayment() throws Exception {
		Decorator();
		try {

			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, MainScreen.valueMap.get("Amount"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(bills_header,"Bills");
				mobileAction.FuncClick(back_button,"Back");
				mobileAction.verifyElementIsDisplayed(home,"Home");
				
			}

			else {
				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, MainScreen.valueMap.get("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(bills_header,"Bills");
				mobileAction.FuncClick(menu,"Menu");
				mobileAction.FuncClick(homeBtn, "Home Button");
				mobileAction.verifyElementIsDisplayed(home,"Home");
				
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {

			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}
	
	/**
	 * This method will click on the Pay Bill Quick Access In Receipt Page
	 * @throws IOException 
	 * @throws InterruptedException 
	 * 
	 * @throws NoSuchElementException and IOException
	 */
	
	public void billPaymentCurrentDate() throws InterruptedException, IOException{
		
		Decorator();
		try{
			
			String payeeAccount = getTestdata("FromAccount", "Payment");
			 
			Decorator();

			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){

			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
			mobileAction.FuncClick(amount, "Amount button clicked");
			String Amount = getTestdata("Amount", "Payment");
			mobileAction.FuncSendKeys(amount, Amount);
			mobileAction.FuncClick(done, "Done");
			String PaybillDate = currDate.getAttribute("Date");
			String timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
			mobileAction.verifyTextEquality(PaybillDate, timeStamp);
			mobileAction.FuncClick(continue_pay, "Continue_pay");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(pay_bill, "Pay Bill");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(confirmationText, "Thank You!");
			mobileAction.verifyElementIsDisplayed(confirmation_val, "Confirmation Value");

			}

			else {
				String ToPostAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='"
				+ payeeAccount + "']";
				mobileAction.FuncClick(to_account_post, "Select Payee");
				mobileAction.FuncElementSwipeWhileNotFound(ListViewToAccount, ToPostAccountXpath, 1, "up", true);
				mobileAction.waitForElementToDisappear(t_select_to_account);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount", "Payment"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.verifyElement(confirmationText, t_confirmationText);
			} 
		
			
		}catch(NoSuchElementException e){
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	
	}
	
	
}
