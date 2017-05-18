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
	
	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button']")
	private MobileElement cancel_button;
	
	@iOSFindBy(xpath = "//*[@label='From Account' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mf_label' and @text='From Account']/..//android.widget.TextView[@resource-id='com.td:id/mf_account_name']")
	private MobileElement from_account_name;
	
	@iOSFindBy(xpath = "//*[contains(@label,'View Fund Facts') or contains(@label,'Veuillez consulter')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main' and contains(@text,'View Fund Facts') or contains(@text,'Veuillez consulter l�Aper�u du fonds de')]")
	private MobileElement view_fundFacts;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Email' or @label='Adresse courriel']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label' and (@text='Email' or @text='Adresse courriel']/../android.widget.EditText")
	private MobileElement email_info;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mobile Phone' or @label='N° de tél. (cell.)']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement phone_info;
	
	String emailPlaceHolder = "example@address.com | exemple@adresse.com";
	String phonePlaceHolder ="Enter number | Entrer le numéro";
	String purchaseListView = "//android.support.v7.widget.RecyclerView[@resource-id='com.td:id/purchaseListView']";
	String androidphoneReg ="\\(\\•{3}\\)\\•{3}-\\d{4}";
	String iosphoneReg = "\\(\\•{3}\\) \\•{3} - \\d{4}";
	String emailReg ="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}";

	@iOSFindBy(xpath = "//*[@label='Preview Purchase' or @label='Avis']")
	@AndroidFindBy(id = "com.td:id/purchasePreviewButton")
	private MobileElement preview_purchase_button;
	
	
	

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

			mobileAction.verifyElementTextIsDisplayed(purchaseMF_title, "Purchase Mutual Funds | Achat de fonds communs de placement");

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
	
}