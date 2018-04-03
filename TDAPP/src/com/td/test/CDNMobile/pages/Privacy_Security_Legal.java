/**
 * 
 */
package com.td.test.CDNMobile.pages;

/**
 * @author akkins9
 *
 */
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class Privacy_Security_Legal extends _CommonPage
{
	private static Privacy_Security_Legal Privacy_Security_Legal;
	
	// Elements of Privacy Security and Legal Page.
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement titleLegal;
	
	
	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	private MobileElement backButton;
	
	@iOSXCUITFindBy(accessibility = "Mobile Privacy")
	@AndroidFindBy(id = "com.td:id/tvPrivacy")
	private MobileElement mobilePrivacy;
	
	@iOSXCUITFindBy(accessibility = "How we handle the information we collect when you use our mobile apps")
	@AndroidFindBy(id = "com.td:id/tvPrivacyDesc")
	private MobileElement mobilePrivacyText;
	
	@iOSXCUITFindBy(accessibility = "Privacy & Security")
	@AndroidFindBy(id = "com.td:id/tvSecurity")
	private MobileElement privacyAndSecurity;
	
	@iOSXCUITFindBy(accessibility = "Bank & invest with confidence")
	@AndroidFindBy(id = "com.td:id/tvSecurityDesc")
	private MobileElement privacyAndSecurityText;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Legal']")
	@AndroidFindBy(id = "com.td:id/tvLegal")
	private MobileElement legal;
	
	@iOSXCUITFindBy(accessibility = "Terms & Conditions")
	@AndroidFindBy(id = "com.td:id/tvLegalDesc")
	private MobileElement legalText;
	
	@iOSXCUITFindBy(accessibility = "Manage Cookies")
	@AndroidFindBy(id = "com.td:id/managecookieTitle")
	private MobileElement manageCookies;
	
	@iOSXCUITFindBy(accessibility = "www.tdcanadatrust.com")
	@AndroidFindBy(id = "com.td:id/managecookieDesc")
	private MobileElement textData;
	
		
	@iOSXCUITFindBy(accessibility = "Terms of Use")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms of Use']")
	private MobileElement termsOfUse;
	
	@iOSXCUITFindBy(accessibility = "The terms of use you agree to by using EasyWeb or the TD app.")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='The terms of use you agree to by using EasyWeb or the TD app']")
	private MobileElement termsOfUseText;
	
	
	// Elements of Mobile Privacy Page
	
	
	
	@AndroidFindBy(id = "com.td:id/webVeiw")
	private MobileElement mobilePrivacyWebView;
	
    
	@iOSXCUITFindBy(accessibility = "main")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement mobilePrivacyContent;
	
	
	@AndroidFindBy(id = "com.td:id/drawer_layout")
	private MobileElement mobilePrivacyContentLayout;
	
	
	// Elements of Mobile Privacy Page used to Validate in IOS
	
	    // banner element where menu id present
		@iOSXCUITFindBy(accessibility = "banner")
		private MobileElement mobilePrivacyBanner;
		
		// Menu Button in Mobile Privacy Page
		@iOSXCUITFindBy(accessibility = "Menu")
		private MobileElement mobilePrivacyPageMenuButton;
		
		//Mobile Privacy Page Header
		@iOSXCUITFindBy(accessibility = "Mobile Privacy")
		private MobileElement mobilePrivacyPageHeader;
		
		// page header of the page loaded when clicked on Menu
		@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Other TD Sites']")
		private MobileElement mobilePrivacyMenuPageTitle;
		
		//Mobile Privacy menu page close menu button
				@iOSXCUITFindBy(accessibility = "Close Menu")
				private MobileElement mobilePrivacyCloseMenu;
	
		
		
		
		// Elements of Privacy and Security Page
	
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement titlePrivacyAndSecurity;
	
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement privacyAndSecurityView;
	
	// Elements of Legal Page
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement titleLegalPage;
	
	@iOSXCUITFindBy(accessibility = "TD Bank Group - Legal Notices and Disclaimers of Liability")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement legalView;
	
	// Elements of Terms of use page
	
	
	@iOSXCUITFindBy(accessibility = "info-circle")
	@AndroidFindBy(id = "info icon")
	private MobileElement termsOfUseISymbolInfo;
	
	// get the xpath for this in android
	@iOSXCUITFindBy(accessibility = "By using Easy Web or the TDapp, offered by TD Canada Trust and its affiliates, you agree to the terms and conditions of the:")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
	private MobileElement termsOfUseInfoMessage;
	
	
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement titleTermsOfUse;
	
	@iOSXCUITFindBy(accessibility = "Financial Services Terms")
	@AndroidFindBy(id = "com.td:id/financial_service_terms")
	private MobileElement financialServicesTerms;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='NAV_DRAWER_ITEMS_4']/XCUIElementTypeOther[1]")
	@AndroidFindBy(id = "com.td:id/cardholder_efs_terms")
	private MobileElement cardHolderEFSTerms;
	
	@iOSXCUITFindBy(accessibility = "Business Access Services Schedule")
	@AndroidFindBy(id = "com.td:id/bas_schedule")
	private MobileElement businessAccessServicesSchedule;
	
//	@iOSXCUITFindBy(accessibility = "Terms and Agreement")
//	@AndroidFindBy(id = "com.td:id/terms_and_agreement")
//	private MobileElement termsAndAgreement;
	
	@iOSXCUITFindBy(accessibility = "Terms and Agreement")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms and Agreement' or @text='Termes et Accord']")
	private MobileElement termsAndAgreement;
	
	@iOSXCUITFindBy(accessibility = "Disclosure")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Disclosure' or @text='Divulgation']")
	private MobileElement disclosure;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='for mutual fund accounts held with TD Investment Services Inc.']")
	private MobileElement disclosureText;
	
	
	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "Navigate up")
	private MobileElement pdfNavigateUP;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TD Canada\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	@AndroidFindBy(id = "com.google.android.apps.docs:id/pdf_view")
	private MobileElement FSTContent;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TD Canada\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	@AndroidFindBy(id = "com.google.android.apps.docs:id/pdf_view")
	private MobileElement EFSContent;
	
	@iOSXCUITFindBy(accessibility = "TD Canada Trust - EasyWeb - Help")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement BASCContent;
	
	@iOSXCUITFindBy(accessibility = "EasyWeb Terms & Conditions")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement TermsAndAgreementContent;
	
	@iOSXCUITFindBy(accessibility = "The TD Bank Financial Group means The")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement disclosureContent;
	
	
	
	
	public synchronized static Privacy_Security_Legal get() {
		if (Privacy_Security_Legal == null) {
			Privacy_Security_Legal = new Privacy_Security_Legal();
		}
		return Privacy_Security_Legal;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}
	
		
	public void verifyPrivacySecurityLegal()
	{
		try {
			Decorator();
			mobileAction.waitProgressBarVanish();
			 // Below code Validates the elements in Privacy Security Legal Page
			mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Legal Title");
			mobileAction.verifyElementIsDisplayed(backButton, "Verifying back Button");
			mobileAction.verifyElementIsDisplayed(mobilePrivacy, "Verifying MobilePrivacy");
			mobileAction.verifyElementIsDisplayed(mobilePrivacyText, "Verifying MobilePrivacy Text");
			mobileAction.verifyElementIsDisplayed(privacyAndSecurity, "Verifying privacy and security");
			mobileAction.verifyElementIsDisplayed(privacyAndSecurityText, "Verifying privacy and security text");
			mobileAction.verifyElementIsDisplayed(legal, "Verifying legal");
			mobileAction.verifyElementIsDisplayed(termsOfUse, "Verifying terms of use");
			mobileAction.verifyElementIsDisplayed(termsOfUseText, "Verifying terms of use text");
			mobileAction.verifyElementIsDisplayed(manageCookies, "Verifying Manage Cookies");
			mobileAction.verifyElementIsDisplayed(textData, "Verifying text below Manage cookies");
			}
		catch (NoSuchElementException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} 

		catch (IOException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (Exception e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	// Mobile Privacy page validation
	public void verifyMobilePrivacy() {

		try {
			Decorator();
			mobileAction.FuncClick(mobilePrivacy, "Click Mobile Privacy Button");
			mobileAction.waitProgressBarVanish();
			//mobileAction.verifyElementIsDisplayed(mobilePrivacyWebView, "Verifying Mobile Privacy WebView");
			mobileAction.verifyElementIsDisplayed(mobilePrivacyContent, "Verifying Mobile Privacy Content is present or not");
			mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Title Header Legal");
			mobileAction.ClickBackButton();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}  catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (InterruptedException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void verifyPrivacyAndSecurity()
	{
		try {
			Decorator();
			
			// the below code clicks on Privacy and Security and validates the page
			    mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(privacyAndSecurity, "Click Privacy and Security");
				mobileAction.waitProgressBarVanish();
				mobileAction.verifyElementIsDisplayed(titlePrivacyAndSecurity, "Verifying Privacy and Security Title");	
				mobileAction.verifyElementIsDisplayed(privacyAndSecurityView, "Verifying Privacy and Security Page Content");
				mobileAction.ClickBackButton();
				mobileAction.waitProgressBarVanish();
		    }
		catch (NoSuchElementException e)
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (InterruptedException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (IOException e)
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (Exception e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void verifyLegal()
	{
		try {
			Decorator();
			
			// the below code clicks on Legal and validates the page
			            mobileAction.waitProgressBarVanish();
						mobileAction.FuncClick(legal, "Click Legal");
						mobileAction.waitProgressBarVanish();
						mobileAction.verifyElementIsDisplayed(titleLegalPage, "Verifying Legal Title");
						mobileAction.verifyElementIsDisplayed(legalView, "Verifying Legal Content");
						mobileAction.ClickBackButton();
						mobileAction.waitProgressBarVanish();
		   }
		catch (NoSuchElementException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (InterruptedException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (IOException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (Exception e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void verify_Terms_Of_Use()
	{
		try {
			Decorator();
			
			// the below code clicks on Terms Of Use and validates the page
			    mobileAction.waitProgressBarVanish();
                mobileAction.waitForElement(termsOfUse);
			    mobileAction.FuncClick(termsOfUse, "Click Terms Of Use");
				mobileAction.waitProgressBarVanish();
				mobileAction.verifyElementIsDisplayed(termsOfUseISymbolInfo, "Verifying I symbol is displayed or not");
				mobileAction.verifyElementIsDisplayed(termsOfUseInfoMessage, "Verifying Info Message is Displayed or not");
				mobileAction.verifyElementIsDisplayed(titleTermsOfUse, "Verifying Terms Of Use Title");
				mobileAction.verifyElementIsDisplayed(financialServicesTerms, "Verifying Financial Services Terms");
				mobileAction.verifyElementIsDisplayed(cardHolderEFSTerms, "Verifying cardHolder EFS Terms");
				mobileAction.verifyElementIsDisplayed(businessAccessServicesSchedule, "Verifying Business Access Services Schedule");
				mobileAction.waitForElement(termsAndAgreement);
				mobileAction.verifyElementIsDisplayed(termsAndAgreement, "Verifying Terms and Agreement");
				mobileAction.verifyElementIsDisplayed(disclosure, "Verifying Disclosure");
				
				// below functions clicks for the above elements and verify whether associated pages were loading or not.
				
				mobileAction.FuncClick(financialServicesTerms, "Clicking on Financial Services Terms");
				mobileAction.verifyElementIsDisplayed(FSTContent, "Verifying Financial Services Terms PDF Document is loaded");
				mobileAction.FuncClick(pdfNavigateUP, "Clicking Back Button");
				
				mobileAction.FuncClick(cardHolderEFSTerms, "Clicking on cardHolder EFS Terms");
				mobileAction.verifyElementIsDisplayed(EFSContent, "Verifying Card Holder and EFS PDF is loaded ");
				mobileAction.FuncClick(pdfNavigateUP, "Clicking back Button");
				
				
				mobileAction.FuncClick(businessAccessServicesSchedule, "Clicking on business access services schedule");
				mobileAction.verifyElementIsDisplayed(BASCContent, "expected pdf is displayed");
				mobileAction.verifyElementIsDisplayed(backButton, "verifying back Button is present");
				mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Action Bar title is present");
				mobileAction.ClickBackButton();
				
				mobileAction.waitProgressBarVanish();
				mobileAction.waitForElement(termsAndAgreement);
				mobileAction.FuncClick(termsAndAgreement, "Clicking on Terms and agreement");
				mobileAction.verifyElementIsDisplayed(TermsAndAgreementContent, "Verifying Terms and Agreement Content");
				mobileAction.verifyElementIsDisplayed(backButton, "verifying back Button is present");
				mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Action Bar title is present");
				mobileAction.ClickBackButton();
				
				mobileAction.FuncClick(disclosure, "Clicking on Disclosure");
				mobileAction.verifyElementIsDisplayed(disclosureContent, "Verifying Terms and Agreement Content");
				mobileAction.verifyElementIsDisplayed(backButton, "verifying back Button is present");
				mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Action Bar title is present");
				mobileAction.ClickBackButton();
				
				mobileAction.ClickBackButton();
				
				mobileAction.waitProgressBarVanish();
		    }
		catch (NoSuchElementException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		catch (InterruptedException e)
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (IOException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (Exception e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void verify_Mobile_Privacy_IOS()
	{
		try
		{
			Decorator();
			mobileAction.FuncClick(mobilePrivacy, "Click Mobile Privacy Button");
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsPresent(mobilePrivacyPageMenuButton);
			mobileAction.FuncClick(mobilePrivacyPageMenuButton, "Clicking on the Mobile Privacy Menu Button");
		}
		catch (NoSuchElementException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		catch (InterruptedException e)
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (IOException e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} 
		catch (Exception e) 
		{
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
		
	}
	
}
