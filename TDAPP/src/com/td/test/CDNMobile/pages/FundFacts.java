package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FundFacts extends _CommonPage {

	private static FundFacts Fundfacts;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@package='com.google.android.apps.docs']")
	private MobileElement view_fundFacts_page_header;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;
	
	//@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle']")
	private MobileElement popup_alert;

	public synchronized static FundFacts get() {
		if (Fundfacts == null) {
			Fundfacts = new FundFacts();
		}
		return Fundfacts;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void VerifyFundfactsPageheader() {
		Decorator();
		
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			try{
				if(mobileAction.verifyElementIsPresent(popup_alert)){
					System.out.println("Need to set TD app to access the PDF file manually");
					mobileAction.Report_Pass_Verified("Need to set TD app to access the PDF file manually");
					return;
				}
			}catch(Exception e){
				
			}
		}
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementTextIsDisplayed(view_fundFacts_page_header,
						getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_FACT_PDF));
			}else{
				mobileAction.verifyElementTextIsDisplayed(view_fundFacts_page_header,
						getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_FACT));
			}
			
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
