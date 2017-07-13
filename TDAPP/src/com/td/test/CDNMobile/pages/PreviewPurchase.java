package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PreviewPurchase extends _CommonPage {

	private static PreviewPurchase previewPurchase;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement previewPurchase_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Phone Number']/../android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement phone_number;	
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email']/../android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement email;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email']")
	private MobileElement email_label;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Phone Number']")
	private MobileElement phone_label;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CONTACT INFORMATION']")
	private MobileElement contact_label;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/../XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue']")
	private MobileElement purchase_now_button;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/../XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel']")
	private MobileElement cancel_button;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement alert_info;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/custom_text']")
	private MobileElement disclaimer_info;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount']/../android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amount_value;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Accepted Fund Details & Fees']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement fund_facts_acknowledgement;
	
	String phoneReg ="\\(\\d{3}\\)\\s*\\d{3}\\s*-\\s*\\d{4}";
	
	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_icon;

	public synchronized static PreviewPurchase get() {
		if (previewPurchase == null) {
			previewPurchase = new PreviewPurchase();
		}
		return previewPurchase;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}
	
	public void VerifyPreviewPurchasePageHeader() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(previewPurchase_title, "Preview Purchase | Aperçu | 预览购买 | 預覽購買 ");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void VerifyPreviewPurchasePhoneFormat() {
		Decorator();
		try {

			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView", 2, "down");
				phone_number = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("label_phone_number") + "']/../android.widget.RelativeLayout/android.widget.TextView", "Phone Number");
			}else{
				
			}
			
			String phoneNumber= mobileAction.getValue(phone_number);
			if(phoneNumber.isEmpty()){
				System.out.println("Phone number is empty");
				mobileAction.Report_Pass_Verified("Empty phone number");
				return;
			}
			System.out.println("Phone number:" + phoneNumber);
			
			if(phoneNumber.matches(phoneReg)){
				mobileAction.Report_Pass_Verified("Phone format (111) 1111-1111"); 
			}else{
				mobileAction.Report_Fail_Not_Verified("Phone format (111) 1111-1111");
			}
				

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void VerifyPreviewPurchasePhoneNotMasked() {
		Decorator();
		try {

			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView", 2, "down");
				phone_number = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("label_phone_number") + "']/../android.widget.RelativeLayout/android.widget.TextView", "Phone Number");
			}else{
				
			}
			
			String phoneNumber= mobileAction.getValue(phone_number);
			if(phoneNumber.isEmpty()){
				System.out.println("Phone number is empty");
				mobileAction.Report_Pass_Verified("Empty phone number");
				return;
			}
			System.out.println("Phone number:" + phoneNumber);
			
			if(phoneNumber.matches(phoneReg)){
				mobileAction.Report_Pass_Verified("Phone "+ phoneNumber +" not masked"); 
			}else{
				mobileAction.Report_Fail("Phone "+ phoneNumber +" is masked");
			}
				

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void VerifyPreviewPurchaseContentInChinese() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(previewPurchase_title, "预览购买 | 預覽購買");
			String banner_info = "每周七天、每天 24 小时，您都可以进行购买。如果在工作日东部时间下午 3 点之前购买，将按当天价格交易。如果在东部时间下午 3 点之后或在周末购买，将按照下一个工作日的收市价交易。所有购买通常均需要数天的时间进行确认。" 
			                 + "| 每週七天、每天 24 小時，您都可以購買。如果在工作日的東部時間下午 3 時之前購買，將按當天價格交易。如果在東部時間下午 3 時之後或在週末購買，將按下一個工作日的收市價交易。所有購買通常均需要數天的時間進行確認。";
			mobileAction.verifyElementTextIsDisplayed(alert_info, banner_info);
					
			String[] expectedList={ "基金", "金额 |金額 " , "转出账户|轉出賬戶", "转入互惠基金账户|轉入互惠基金賬戶"};
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.FuncSwipeOnce("up");
				
				List<MobileElement> previewList = ((MobileDriver) CL.GetDriver()).findElementsByXPath("//android.widget.TextView[@resource-id='com.td:id/preview_row_label']");
				
				for (int i=0; i< expectedList.length; i++){
					mobileAction.verifyElementTextIsDisplayed(previewList.get(i), expectedList[i]);
				}
				
			}else{
				for (int i=0; i< expectedList.length; i++){
					MobileElement element = (MobileElement)((MobileDriver) CL.GetDriver()).findElementByXPath("//XCUIElementTypeTable/XCUIElementTypeCell[" + (i+2) + "]/XCUIElementTypeStaticText[1]");
					mobileAction.verifyElementTextIsDisplayed(element, expectedList[i]);
				}
			}
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				
				contact_label = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("MF_contact_information") + "']", "Contact Information");
				email_label= mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("MF_email") + "']", "Email");
				phone_label= mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("MF_phone") + "']", "Phone Number");
				disclaimer_info= mobileAction.verifyElementUsingXPath("//android.widget.TextView[contains(@text, '" + mobileAction.getAppString("MF_use_of_information_disclaimer") + "')]", "Disclaimer Information");
				
			}else{
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
			}
			mobileAction.verifyElementTextIsDisplayed(contact_label, "联系方式|聯絡資訊");
			mobileAction.verifyElementTextIsDisplayed(email_label, "电子邮件|電郵地址");
			mobileAction.verifyElementTextIsDisplayed(phone_label, "电话号码|電話號碼");
			String disclaimerInfo = "您的个人信息仅用于我们就您的基金购买情况与您联络。道明资产管理有限公司（TDAM）在您持有道明互惠基金单位期间向道明投资服务有限公司（TDIS）支付尾随佣金，作为其向您提供服务和咨询的费用。有关详细信息，请参阅基金概况。(simp)If a trade is rejected for any reason, we'll cancel it and notify you via email within one business day.";
			mobileAction.verifyElementTextIsDisplayed(disclaimer_info, disclaimerInfo);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	
	public void VerifyWarningMessageContent() {
		Decorator();
		try {
			String banner_info = "每周七天、每天 24 小时，您都可以进行购买。如果在工作日东部时间下午 3 点之前购买，将按当天价格交易。如果在东部时间下午 3 点之后或在周末购买，将按照下一个工作日的收市价交易。所有购买通常均需要数天的时间进行确认。" 
			                 + "| 每週七天、每天 24 小時，您都可以購買。如果在工作日的東部時間下午 3 時之前購買，將按當天價格交易。如果在東部時間下午 3 時之後或在週末購買，將按下一個工作日的收市價交易。所有購買通常均需要數天的時間進行確認。"
			                 +"|You can make a purchase 24-hours a day, 7 days a week.Purchases made before 3:00PM EST on a business day will be processed at that day's rate.If you make a purchase after 3:00PM EST, or on the weekend, it will be processed at the next business day's closing price.All purchases usually take a few days to confirm."
			                 +"|Vous pouvez effectuer un achat en tout temps. Les achats effectués avant 15 h (HE) un jour ouvrable seront traitées au prix en vigueur à cette date. Les achats effectués après 15 h (HE) ou la fin de semaine seront traités au prix de clôture du jour ouvrable suivant. La confirmation des achats prend normalement quelques jours.";
			mobileAction.verifyElementTextIsDisplayed(alert_info, banner_info);
		}catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void savePhoneInforForPFVerification(){
		try{
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")){
				String phoneNumberxpath = "//XCUIElementTypeStaticText[@label='" +mobileAction.getAppString("label_phone_number") +"']/following-sibling::XCUIElementTypeStaticText";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(phoneNumberxpath, false, 10, "up");
				phone_number = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("label_phone_number") +"']/following-sibling::XCUIElementTypeStaticText", "Email");
			}else{
				mobileAction.FuncSwipeWhileElementNotFound(phone_number, false, 10, "up");
			}
			String phoneinfo = mobileAction.getValue(phone_number);
			System.out.println("phone got:"+phoneinfo );
			if(!phoneinfo.isEmpty()){
				CL.getTestDataInstance().TCParameters.put("PhoneProfile", phoneinfo);
				mobileAction.Report_Pass_Verified("phone:" + phoneinfo);
			}else{
				mobileAction.Report_Pass_Verified("Phone is empty");
			}
		}catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void ClickPurchaseNowBtn(){
		Decorator();
		try{
			mobileAction.FuncClick(purchase_now_button, "Purchase Now");
		}catch (Exception e){
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;	
	        return;	
		}		
	}
	
	public void ClickCancelMFpurchase(){
		Decorator();
		try{
			mobileAction.FuncClick(cancel_button, "Cancel");
		}catch (Exception e){
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;	
	        return;	
		}		
	}
	
	public void VerifyUSDAmount(){
		Decorator();
		try{
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				amount_value = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_amount") + "']/../android.widget.RelativeLayout/android.widget.TextView", "Amount");
			}else{				
				amount_value = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_Amount") + "']/../XCUIElementTypeStaticText[2]", "Amount");				
			}

			String amountValue= mobileAction.getValue(amount_value);
			System.out.println("Amount:" +amountValue);
			if(amountValue.toLowerCase().contains("usd")){
				mobileAction.Report_Pass_Verified("USD amount found:"+amountValue);
			}else{
				mobileAction.Report_Fail("USD Amount not found:"+amountValue);
			}
		}catch (Exception e){
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;	
	        return;	
		}		
	}
	
	public void VerifyFundfactsAcknowledgement(){
		Decorator();
		try{
			if(!mobileAction.verifyElementIsPresent(fund_facts_acknowledgement)){
				mobileAction.FuncSwipeWhileElementNotFound(fund_facts_acknowledgement, false, 5, "up");
			}
			String acknowlegmentText= mobileAction.getValue(fund_facts_acknowledgement);
			System.out.println("acknowlegmentText:" +acknowlegmentText);
			if(acknowlegmentText.toLowerCase().contains("yes") || acknowlegmentText.toLowerCase().contains("oui") ){
				mobileAction.Report_Pass_Verified("Fund acknowledgement is "+acknowlegmentText);
			}else{
				mobileAction.Report_Fail("Fund acknowledgement is "+ acknowlegmentText);
			}
		}catch (Exception e){
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;	
	        return;	
		}			
	}
	
	public void GoBackToHomePage(){
		Decorator();
		int count=10;
		try{
			while(mobileAction.verifyElementIsPresent(back_icon) && count!=0){
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
					mobileAction.FuncClickBackButton();
				}else{
					mobileAction.FuncClick(back_icon, "<");
				}
				count--;
			}
			System.out.println("Go back to home already");
		}catch(Exception e){
			System.out.println("Exception: back to home");
		}
	}

}
