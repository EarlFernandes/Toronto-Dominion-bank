package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PurchaseMutualFunds extends _CommonPage {

	private static PurchaseMutualFunds purchaseMutualFunds;

	@iOSFindBy(xpath = "//*[@label='Purchase Mutual Funds' or @label='Achat de fonds communs de placement']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement purchaseMF_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;
	
	@iOSFindBy(xpath = "//*[@label='Purchase Mutual Funds' or @label='Sélectionner un fonds']")
	@AndroidFindBy(id = "com.td:id/selectedText")
	private MobileElement fund_dropdown_list;
	
	@iOSFindBy(xpath = "//*[@label='Mutual Funds' or @label='Sélectionner un fonds']")
	@AndroidFindBy(id = "com.td:id/caption")
	private MobileElement fund_dropdown_caption;
	
	@iOSFindBy(xpath = "//*[@label='Mutual Funds' or @label='Sélectionner un fonds']")
	@AndroidFindBy(id = "com.td:id/captionTextView")
	private MobileElement amount_caption;
	
	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button']")
	private MobileElement cancel_button;
	
	@iOSFindBy(xpath = "//*[@label='From Account' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mf_label' and @text='From Account']/..//android.widget.TextView[@resource-id='com.td:id/mf_account_name']")
	private MobileElement from_account_name;
	
	@iOSFindBy(xpath = "//*[@label='From Account' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mf_label' and @text='From Account']")
	private MobileElement from_account_caption;
	
	@iOSFindBy(xpath = "//*[@label='From Account' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mf_label' and @text='To Account']")
	private MobileElement to_account_caption;
	
	@iOSFindBy(xpath = "//*[@label='From Account' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/custom_text']")
	private MobileElement contact_caption;
	
	@iOSFindBy(xpath = "//*[@label='From Account' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label']")
	private MobileElement email_caption;
	
	@iOSFindBy(xpath = "//*[@label='From Account' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label']")
	private MobileElement phone_caption;
	
	@iOSFindBy(xpath = "//*[contains(@label,'View Fund Facts') or contains(@label,'Veuillez consulter')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main']")
	private MobileElement view_fundFacts;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Email' or @label='Adresse courriel']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/description']")
	private MobileElement email_info;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mobile Phone' or @label='N° de tél. (cell.)']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement phone_info;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText']")
	private MobileElement amount;
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mobile Phone' or @label='N° de tél. (cell.)']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/purchasePreviewButton']")
	private MobileElement preview_Purchase_button;
	
	String emailPlaceHolder = "example@address.com | exemple@adresse.com";
	String phonePlaceHolder ="Enter number | Entrer le numéro";
	String purchaseListView = "//android.support.v7.widget.RecyclerView[@resource-id='com.td:id/purchaseListView']";
	String androidphoneReg ="\\(\\•{3}\\)\\•{3}-\\d{4}";
	String iosphoneReg = "\\(\\•{3}\\) \\•{3} - \\d{4}";
	String emailReg ="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}";

	@iOSFindBy(xpath = "//*[@label='Preview Purchase' or @label='Avis']")
	@AndroidFindBy(id = "com.td:id/purchasePreviewButton")
	private MobileElement preview_purchase_button;
	
	@iOSFindBy(xpath = "//*[@label='Done' or @label='OK']")
	private MobileElement done;

	

	public synchronized static PurchaseMutualFunds get() {
		if (purchaseMutualFunds == null) {
			purchaseMutualFunds = new PurchaseMutualFunds();
		}
		return purchaseMutualFunds;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}
	
	private String replacePlaceholderToNothing(String text, String placeHolder){
		String [] replaceHolderList = placeHolder.split("\\|");
		String returnedStr = text;
		for (int i=0; i< replaceHolderList.length; i++){
			returnedStr = returnedStr.replaceAll(replaceHolderList[i].trim(), "");
		}
		return returnedStr;
	}
	
	private String getPhoneNumber(){
		try {
			
			String phoneNumber = mobileAction.getValue(phone_info);
			
			phoneNumber = replacePlaceholderToNothing(phoneNumber, phonePlaceHolder);
			if (phoneNumber.isEmpty()){
				System.out.println("phoneNumber is empty");
				return "";
			}
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				phoneNumber = mobileAction.FuncGetValByRegx(phoneNumber, androidphoneReg);
			}else{
				phoneNumber = mobileAction.FuncGetValByRegx(phoneNumber, iosphoneReg);
			}
			System.out.println("phoneNumber :" +phoneNumber);
			return phoneNumber;
			
		} catch (NoSuchElementException e) {
			System.out.println("phoneNumber is empty");
		}
		return "";
	}
	
	private String getEmailInfo(){
		try {

			String emailInfo = mobileAction.getValue(email_info);			
			emailInfo =  replacePlaceholderToNothing(emailInfo,emailPlaceHolder); 
			if(emailInfo.isEmpty()){
				System.out.println("Email is empty");
				return "";
			}
			emailInfo = mobileAction.FuncGetValByRegx(emailInfo, emailReg);
			System.out.println("email:" + emailInfo);
			return emailInfo;


		} catch (NoSuchElementException e) {
			System.out.println("email is empty");
		}
		return "";
	}
	
	public void VerifyPurchaseMFPageHeader() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(purchaseMF_title, "Purchase Mutual Funds | Achat de fonds communs de placement | 购买互惠基金|購買互惠基金");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void VerifyFundDropdownList() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(fund_dropdown_list, "Fund Dropdown");
			mobileAction.FuncClick(fund_dropdown_list, "Fund Dropdown");
			mobileAction.waitForElementToVanish(progress_bar);
			mobileAction.FuncClick(cancel_button,"Cancel Button");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed to VerifyFundDropdownList.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyFundDropdownList");
		}
	}
	
	
	public void VerifyFromAccountBeStaticAndLinked() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(from_account_name, "From Account name");
			mobileAction.FuncClick(from_account_name, "From Account name");
			mobileAction.verifyElementIsDisplayed(from_account_name, "From Account name");

			String accountName = mobileAction.getValue(from_account_name);

			
			System.out.println("From Account Name:" + accountName);

			if(!accountName.isEmpty()){
				mobileAction.Report_Pass_Verified("From Account is linked");
			}else{
				mobileAction.Report_Fail_Not_Verified("From Account is linked");
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed to VerifyFromAccountBeStaticAndLinked.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyFromAccountBeStaticAndLinked");
		}
	}
	
	public void ClickBackFromMFPurchase(){
		Decorator();

		String back_xpath ="";

		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			try{
				mobileAction.FuncClickBackButton();
				return;
			}catch (Exception e){
				back_xpath = "//android.widget.ImageView[@resource-id='android:id/up']";
			}
			
		}else{
			back_xpath = "//*[@label='Back' or @label='Retour']";
		}
		try{
			MobileElement back_arrow = (MobileElement)CL.GetDriver().findElement(By.xpath(back_xpath));
			mobileAction.FuncClick(back_arrow, "<");
				
		}catch (Exception e) {
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	    } 
		
	}
	
	public void VerifyPhoneFormat() {
		Decorator();
		try {
			
			String phoneNum = getPhoneNumber();
			if(phoneNum.isEmpty()){
				mobileAction.Report_Pass_Verified("Empty Phone ");
				return;
			}
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				
				if(phoneNum.matches(androidphoneReg)){
					mobileAction.Report_Pass_Verified("Phone format ");
				}else{
					mobileAction.Report_Fail_Not_Verified("Phone format ");
				}
			}else{

				if(phoneNum.matches(iosphoneReg)){
					mobileAction.Report_Pass_Verified("Phone format ");
				}else{
					mobileAction.Report_Fail_Not_Verified("Phone format ");
				}
			}
			
		} catch (NoSuchElementException  e) {
			System.err.println("TestCase has failed to VerifyPhoneFormat.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyPhoneFormat");
		}
	}
	
	public void VerifyPhoneNotMasked() {
		Decorator();
		try {
			
			String phoneNum = getPhoneNumber();
			if(phoneNum.isEmpty()){
				mobileAction.Report_Pass_Verified("Empty Phone ");
				return;
			}
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				
				if(phoneNum.matches(androidphoneReg)){
					mobileAction.Report_Pass_Verified("Phone not masked ");
				}else{
					mobileAction.Report_Fail_Not_Verified("Phone not masked ");
				}
			}else{

				if(phoneNum.matches(iosphoneReg)){
					mobileAction.Report_Pass_Verified("Phone not masked ");
				}else{
					mobileAction.Report_Fail_Not_Verified("Phone not masked ");
				}
			}
			
		} catch (NoSuchElementException  e) {
			System.err.println("TestCase has failed to VerifyPhoneNotMasked.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyPhoneNotMasked");
		}
	}
	
	public void VerifyPurchaseMFPageInChinese() {
		Decorator();
		try {
			
			mobileAction.verifyElementTextIsDisplayed(purchaseMF_title, "购买互惠基金 | 購買互惠基金");
			mobileAction.verifyElementTextIsDisplayed(fund_dropdown_caption, "基金 |基金");
			mobileAction.verifyElementTextIsDisplayed(fund_dropdown_list, "选择基金|選擇基金 ");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				from_account_caption = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/mf_label' and @text='" + mobileAction.getAppString("MF_from_account") + "']", "From Account");
				to_account_caption = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/mf_label' and @text='" + mobileAction.getAppString("MF_to_mf_account") + "']", "To Account");
				contact_caption = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/custom_text' and @text='" + mobileAction.getAppString("MF_contact_information") + "']", "Contact Information");
				
			}
			mobileAction.verifyElementTextIsDisplayed(from_account_caption, "转出账户|轉出賬戶 ");
			mobileAction.verifyElementTextIsDisplayed(to_account_caption, "转入互惠基金账户|轉入互惠基金賬戶");
			mobileAction.verifyElementTextIsDisplayed(contact_caption, "联系方式|聯絡資訊 ");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView",  1, "down");
			}
			mobileAction.verifyElementTextIsDisplayed(email_caption, "电子邮件|電郵地址");
			mobileAction.verifyElementTextIsDisplayed(phone_caption, "电话号码|電話號碼");
			mobileAction.verifyElementTextIsDisplayed(view_fundFacts, " 查看基金概况（表现和费用）|查看基金概況（表現和費用）"
					+ "");
			
			
			
		} catch (NoSuchElementException | IOException  e) {
			System.err.println("TestCase has failed to VerifyPhoneNotMasked.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyPhoneNotMasked");
		}
	}
	
	private boolean fillPurchaseForm() {
		String selectedFund = CL.getTestDataInstance().TCParameters.get("Accounts");
		String user_email = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		String user_phone = CL.getTestDataInstance().TCParameters.get("PhoneProfile");
		String amount_selected = CL.getTestDataInstance().TCParameters.get("Amount");
		System.out.println("selected funds:" + selectedFund);
		System.out.println("amount::" + amount_selected);
		System.out.println("Email:" + user_email);
		System.out.println("Phone:" + user_phone);
		try{
			mobileAction.FuncClick(fund_dropdown_list, "Funds dorpdown list");
						
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				MobileElement FundsInList = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + selectedFund + "']", selectedFund);
				mobileAction.FuncClick(FundsInList, selectedFund);
			}else{
				
			}
			//MobileElement FundsInList = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='" + selectedFund + "']", selectedFund);
			mobileAction.FuncSendKeys(amount, amount_selected);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				done = mobileAction.verifyElementUsingXPath("//*[@label='" + mobileAction.getAppString(locale_used, "secureLoginEditButtonDone") + "']", "Done");
				mobileAction.FuncClick(done, "Done");
			} else {
				mobileAction.FuncHideKeyboard();
			}
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){			
				//mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView",  1, "down");
				mobileAction.FuncSwipeWhileElementNotFound(phone_info, false, 3, "up");
			}
			mobileAction.FuncSendKeys(email_info, user_email);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncSendKeys(phone_info, user_phone);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				done = mobileAction.verifyElementUsingXPath("//*[@label='" + mobileAction.getAppString(locale_used, "secureLoginEditButtonDone") + "']", "Done");
				mobileAction.FuncClick(done, "Done");
			} else {
				mobileAction.FuncHideKeyboard();
			}
					
		}catch (Exception e){
			return false;
		}
		return true;
	}
	
	public void ClickPreviewPurchase() {
		Decorator();
		try {
			if(!fillPurchaseForm()){
				mobileAction.Report_Fail("Failed to fill purchase form");
				return;
			}

			String enableStatus= preview_purchase_button.getAttribute("enabled");
			int count=0;
			
			while(enableStatus.equalsIgnoreCase("false") && count <10){
				mobileAction.FuncSwipeOnce("down");
				enableStatus= preview_purchase_button.getAttribute("enabled");
				count++;
			}
			if(count>=10){
				mobileAction.Report_Fail("PreviewPurchase button is disabled");
				return;
			}
			
			String elementText = mobileAction.getValue(preview_purchase_button);
			mobileAction.FuncClick(preview_purchase_button, elementText);
			mobileAction.waitForElementToVanish(progress_bar);

		} catch (NoSuchElementException | InterruptedException | IOException  e) {
			System.err.println("TestCase has failed to ClickPreviewPurchase.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for ClickPreviewPurchase");
		}
	}
	
}