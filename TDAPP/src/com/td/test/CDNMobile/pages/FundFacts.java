package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FundFacts extends _CommonPage{

	private static FundFacts Fundfacts;

	@iOSFindBy(accessibility ="TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@package='com.google.android.apps.docs']")
	private MobileElement view_fundFacts_page_header;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;
	
	public synchronized static FundFacts get() {
		if (Fundfacts == null) {
			Fundfacts = new FundFacts();
		}
		return Fundfacts;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}
	
	public void VerifyFundfactsPageheader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(view_fundFacts_page_header, "Fund Facts | fund facts.pdf |Aperçu du fonds ");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
//	public void VerifyfundfactsDoc(){
//		Decorator();
//		try {
//			mobileAction.verifyElementTextIsDisplayed(fund_facts_page_title, "fund facts.pdf");  			
//		} catch ( Exception  e) {
//			System.err.println("TestCase has failed to verifyfundfactsDoc.");
//			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
//			mobileAction.Report_Fail("Exception for verifyfundfactsDoc");			
//		}	
//	}
}
