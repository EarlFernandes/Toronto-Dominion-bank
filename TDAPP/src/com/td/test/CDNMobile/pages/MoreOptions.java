package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MoreOptions extends _CommonPage {

	private static MoreOptions moreOptions;
	
	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement moreOptions_header;
	
	@iOSFindBy(xpath = "//XCUIElementTypeImage/../XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/credit_card_name']")
	private MobileElement credit_card_name;
	
	@iOSFindBy(xpath = "//XCUIElementTypeImage/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/credit_card_number']")
	private MobileElement credit_card_number;
	
	@iOSFindBy(xpath = "//XCUIElementTypeImage/../XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/credit_limit']")
	private MobileElement credit_card_limit;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title']")
	private MobileElement limit_increase_request_btn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement limit_increase_direction;
	
	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;
	
	public synchronized static MoreOptions get() {
		if (moreOptions == null) {
			moreOptions = new MoreOptions();
		}
		return moreOptions;
	}

	private void Decorator() {

		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}
	
	public void verifyMoreOptionHeader() {
		Decorator();
		String moreOptionsText=getTextInCurrentLocale(StringArray.ARRAY_MORE_OPTION_HEADER);
		try {
			mobileAction.verifyTextEquality(mobileAction.getValue(moreOptions_header),moreOptionsText);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void verifyCreditCardContent(){
		Decorator();
		String creditCardName = mobileAction.getValue(credit_card_name);
		if(creditCardName != null && !creditCardName.isEmpty()){
			mobileAction.Report_Pass_Verified(creditCardName);
		}else{
			mobileAction.Report_Fail("Credit card nmae is empty");
		}
		
		String creditCardNum = mobileAction.getValue(credit_card_number);
		System.out.println("Credit Card Name:"+creditCardNum);
		if(creditCardNum != null && !creditCardNum.isEmpty()){
			if(creditCardNum.matches("\\•{4}\\s*\\d{4}")){
				mobileAction.Report_Pass_Verified(creditCardNum + " masked");
			}else{
				mobileAction.Report_Fail(creditCardNum +" not masked");
			}
			
		}else{
			mobileAction.Report_Fail("Credit card number is empty");
		}
		
		String creditCardLimit = mobileAction.getValue(credit_card_limit);
		if(creditCardLimit != null && !creditCardLimit.isEmpty()){
			mobileAction.Report_Pass_Verified(creditCardLimit);
		}else{
			mobileAction.Report_Fail("Credit card limit is empty");
		}
	}
	
	public void verifyMoreOptionsDirectionalCopy(){
		Decorator();
	
		String limitIncreaseRequestText=getTextInCurrentLocale(StringArray.ARRAY_CREDIT_LIMIT_INCREASE_REQ);
		try {
			String capturedText = mobileAction.getValue(limit_increase_request_btn);
			System.out.println("capturedText"+ capturedText);
			mobileAction.verifyTextEquality(capturedText,limitIncreaseRequestText);
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
		
		String limitIncreaseDirectionText=getTextInCurrentLocale(StringArray.ARRAY_CREDIT_LIMIT_INCREASE_DIR);;
		try {
			String capturedText = mobileAction.getValue(limit_increase_direction);
			System.out.println("capturedText"+ capturedText);
			mobileAction.verifyTextEquality(capturedText, limitIncreaseDirectionText);
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void ClickCardlimitIncreaseBtn(){
		Decorator();

		String limitIncreaseRequestText=getTextInCurrentLocale(StringArray.ARRAY_CREDIT_LIMIT_INCREASE_REQ);
		try{
			mobileAction.FuncClick(limit_increase_request_btn, limitIncreaseRequestText);
			mobileAction.waitForElementToVanish(progress_bar);
			
		}catch (NoSuchElementException | IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}
	
	
	
}
