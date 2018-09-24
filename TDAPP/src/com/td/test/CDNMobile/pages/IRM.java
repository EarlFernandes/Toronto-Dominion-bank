/**
 * 
 */
package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/**
 * @author FERNE97
 *
 */
public class IRM extends _CommonPage {
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='International']")
	@AndroidFindBy(xpath = "//*[(@text='International') and (@resource-id='com.td:id/right_button_text' or @resource-id='com.td:id/right_button')]")
	private MobileElement IntTab;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Get Started']")
	@AndroidFindBy(xpath = "//*[(@text='Get started') and (@resource-id='com.td:id/btn_done' or @resource-id='com.td:id/btn_done_text')]")
	private MobileElement GetStarted;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
	@AndroidFindBy(xpath = "//*[(@text='Continue') and (@resource-id='com.td:id/right_button' or @resource-id='com.td:id/right_button_text')]")
	private MobileElement Continue_Btn_right;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I have read and agree to the above Terms & Conditions.']")
	@AndroidFindBy(xpath = "//*[(@text='Agree to Terms & Conditions') and (@resource-id='com.td:id/checkbox_btn' or @resource-id='com.td:id/checkbox_btn_text')]")
	private MobileElement Checkbox;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Accept']")
	@AndroidFindBy(xpath = "//*[(@text='Accept') and (@resource-id='com.td:id/right_button' or @resource-id='com.td:id/right_button_text')]")
	private MobileElement Accept_Btn;
	
	//@iOSXCUITFindBy(accessibility = "TDTERMS_BASE_ACCEPT_BTN")
	//@AndroidFindBy(xpath = "//*[(@text='Agree') and (@resource-id='com.td:id/btn_continue' or @resource-id='com.td:id/btn_continue_text')]")
	//private MobileElement Agree_Btn;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Edit'])[2]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView[2]")
	private MobileElement Contact_edit;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Edit'])[1]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView[2]")
	private MobileElement Address_edit;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Not Now']")
	@AndroidFindBy(xpath = "//*[(@text='Not Now') and (@resource-id='com.td:id/btn_cancel' or @resource-id='com.td:id/btn_cancel_text')]")
	private MobileElement Not_now_btn;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Continue'])[2]")
	@AndroidFindBy(xpath = "//*[(@text='CONTINUE') and (@resource-id='android:id/button1' or @resource-id='android:id/button1_text')]")
	private MobileElement Continue_btn_popup_after_notnow;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
	@AndroidFindBy(xpath = "//*[(@text='CONTINUE') and (@resource-id='android:id/button1' or @resource-id='android:id/button1_text')]")
	private MobileElement Continue_btn_popup_on_decline;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Yes']")
	@AndroidFindBy(xpath = "//*[(@text='Yes') and (@resource-id='com.td:id/primary_button')]")
	private MobileElement Yes_btn_popup_on_decline;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirm']")
	@AndroidFindBy(xpath = "//*[(@text='Confirm') and (@resource-id='android:id/button1' or @resource-id='android:id/button1_text')]")
	private MobileElement Confirm_btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='QuickLinkLeftNavButton']")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/hamburger' or @resource-id='com.td:id/menu_layout']")
	private MobileElement Hamburger_btn;
	
	@iOSXCUITFindBy(xpath = "//*[@label='Profile & Settings']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings']")
	private MobileElement profile_and_settings;
	
	/*@iOSXCUITFindBy(accessibility = "New Security Setup")
	@AndroidFindBy(xpath = "//*[(@text='New Security Setup') and (@resource-id='com.td:id/profile_landing_nav_security' or @resource-id='com.td:id/nav_row_profile_title')]")
	private MobileElement New_Security_Setup;*/
	
	/*@iOSXCUITFindBy(accessibility = "Continue")
	@AndroidFindBy(xpath = "//*[(@text='Continue') or (@resource-id='com.td:id/btn_primary' or @resource-id='com.td:id/btn_primary_text')]")
	private MobileElement Continue_btn;*/
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Open Link']")
	@AndroidFindBy(xpath = "//*[(@text='Continue') or (@resource-id='com.td:id/btn_primary' or @resource-id='com.td:id/btn_primary_text')]")
	private MobileElement Continue_popup_for_addressedit;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Decline']")
	@AndroidFindBy(xpath = "//*[(@text='Decline') and (@resource-id='com.td:id/btn_cancel' or @resource-id='com.td:id/left_button')]")
	private MobileElement Decline_btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD CANADA']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
	private MobileElement NameLocator;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD CANADA']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.TextView[3]")
	private MobileElement AddressLocator;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD CANADA']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[6]/android.widget.TextView[2]")
	private MobileElement PhoneLocator;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD CANADA']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[5]/android.widget.TextView[2]")
	private MobileElement HomePhoneLocator;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD CANADA']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.TextView[2]")
	private MobileElement EmailLocator;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='You are not eligible to use this service']")
	@AndroidFindBy(xpath = "//*[(@resource-id='com.td:id/tv_common_title')]")
	private MobileElement Ineligible_msg;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Something went wrong']")
	@AndroidFindBy(xpath = "//*[(@resource-id='com.td:id/error_title')]")
	private MobileElement Generic_Error;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please read the following terms and conditions and accept them below' or @name='Please accept the terms and conditions']")
	@AndroidFindBy(xpath = "//*[(@resource-id='com.td:id/alert_text')]")
	private MobileElement TermsConditionserror;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Term & Condition' or @name='Term & Conditions']")
	@AndroidFindBy(xpath = "//*[(@resource-id='com.td:id/irm_tandc_title_view')]")
	private MobileElement TermsConditionspagecontent;
	
	//@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='flyout_title'])[22]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Banking Service Configuration']")
	@AndroidFindBy(xpath = "//*[(@text='Cancel') and (@resource-id='com.td:id/left_button' or @resource-id='com.td:id/left_button_text')]")
	private MobileElement Banking_config;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Feature Flags']")
	@AndroidFindBy(xpath = "//*[(@text='Cancel') and (@resource-id='com.td:id/left_button' or @resource-id='com.td:id/left_button_text')]")
	private MobileElement Feature_flag;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@name='Stubbing, Enable stubbed mode']")
	@AndroidFindBy(xpath = "//*[(@text='Cancel') and (@resource-id='com.td:id/left_button' or @resource-id='com.td:id/left_button_text')]")
	private MobileElement Stubbing_flag;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='header caret' or @name='Back' or @name='NAVIGATION_ITEM_BACK' or @name='No' or @name='Return to TD Canada']")
	@AndroidFindBy(xpath = "//*[(@resource-id='android:id/up')]")
	private MobileElement Back_btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
	@AndroidFindBy(xpath = "//*[(@text='Cancel') and (@resource-id='com.td:id/left_button' or @resource-id='com.td:id/left_button_text' or @resource-id='com.td:id/secondary_button')]")
	private MobileElement Cancel_btn;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Cancel'])[2]")
	@AndroidFindBy(xpath = "//*[(@text='Cancel') and (@resource-id='com.td:id/left_button' or @resource-id='com.td:id/left_button_text' or @resource-id='com.td:id/secondary_button')]")
	private MobileElement Cancel_btn_for_iOS_popup;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Download the terms of use']")
	@AndroidFindBy(xpath = "//*[(@text='Download Terms & Conditions') and (@resource-id='com.td:id/terms_download_btn')]")
	private MobileElement DownloadTermsConditions;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='flyout_title'])[3]")
	@AndroidFindBy(xpath = "//*[(@text='Home') and (@resource-id='com.td:id/foundation_flyout_profile_home_tile')]")
	private MobileElement Home_btn;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='flyout_title'])[2]")
	@AndroidFindBy(xpath = "//*[(@text='Logout') and (@resource-id='com.td:id/foundation_flyout_profile_login_logout_tile')]")
	private MobileElement Logout_btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='Transfers' or @name='Send Money']")
	@AndroidFindBy(xpath = "//*[(@text='Transfers' or @text='Send Money') and (@resource-id='android:id/action_bar_title')]")
	private MobileElement TransfersOrSendMoney_page;
	
	/*@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='Logged Out' or @name='Send Money']")
	@AndroidFindBy(xpath = "//*[(@text='Transfers' or @text='Send Money') and (@resource-id='android:id/action_bar_title')]")
	private MobileElement Logged_out;*/
	
	private static IRM IRM;
	public synchronized static IRM get() {
		if (IRM == null) {
			IRM = new IRM();
		}
		return IRM;
	}
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}
		
	public void internationalTab_click() {
		Decorator();
		try
		{
			////mobileAction.verifyElementIsDisplayed(IntTab, "International Tab");
			mobileAction.FuncClick(IntTab, "International Tab");
			//mobileAction.waitProgressBarVanish();

		}
		catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void Continue_click() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Continue_Btn_right, "Continue Button");
			mobileAction.FuncClick(Continue_Btn_right, "Continue Button");
			//mobileAction.waitProgressBarVanish();
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void checkbox_click() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Checkbox, "Checkbox Flag");
			mobileAction.FuncClick(Checkbox, "Checkbox Flag");
			//mobileAction.waitProgressBarVanish();
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void accept_click() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Accept_Btn, "Accept Button");
			mobileAction.FuncClick(Accept_Btn, "Accept Button");
			//mobileAction.waitProgressBarVanish();	
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void TandC_content_verify() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Accept_Btn, "Accept Button");
			mobileAction.FuncClick(TermsConditionspagecontent, "Terms and Conditions content displayed");
			//mobileAction.waitProgressBarVanish();	
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/*public void Agree_click() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Agree_Btn, "Accept Button");
			mobileAction.FuncClick(Agree_Btn, "Accept Button");
			//mobileAction.waitProgressBarVanish();	
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}*/
	
	public void getStarted_click() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(GetStarted, "Get Started Button");
			mobileAction.FuncClick(GetStarted, "Get Started Button");
			//mobileAction.waitProgressBarVanish();	
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	
	public void Validate_Register_screen() {
		Decorator();
		String title = "Registration, Register";
		String[] title1 = title.split(",");
		
		try
		{
			for (int i=0; i<title1.length; i++) {
				
			MobileElement CSTPROFHDR = PageHeader.get().getHeaderTextElement();
			if (title1[i].contains(CSTPROFHDR.getText())){
				//mobileAction.verifyElementIsDisplayed(CSTPROFHDR, title1[i]);
				break;
			}
			
			System.out.println("Customer and account eligibility check is done");
			}	
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void contact_info_edit_click() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Contact_edit, "Edit contact information button");
			mobileAction.FuncClick(Contact_edit, "Contact information edit button");
			
			//mobileAction.waitProgressBarVanish();
			System.out.println("Contact information edit button is present");
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void Customer_profile_changes_validated() {
		Decorator();
		try
		{
			MobileElement header = PageHeader.get().getHeaderTextElement();
			//mobileAction.verifyElementIsDisplayed(header, "Profile");
			mobileAction.verifyElementTextContains(header,
					this.getTextInCurrentLocale(StringArray.ARRAY_IRM_CUSTOMERPROFILE));
			//mobileAction.waitProgressBarVanish();
			System.out.println("Customer profile is validated");
			
			
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/*public void Not_now_btn() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Not_now_btn, "Not Now Button");
			mobileAction.FuncClick(Not_now_btn, "Not Now Button");
			//mobileAction.waitProgressBarVanish();
		}
		
	catch (Exception e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		try {
			mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
		} catch (IOException ex) {
			System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
	}*/
	
	/*public void Continue_popup_after_notnow() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Continue_btn_popup_after_notnow, "Continue popup Button");
			mobileAction.FuncClick(Continue_btn_popup_after_notnow, "Continue Popup Button");
			//mobileAction.waitProgressBarVanish();
		}
		
	catch (Exception e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		try {
			mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
		} catch (IOException ex) {
			System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
	}*/
	
	/*public void Confirm_btn() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Confirm_btn, "Confirm popup Button");
			mobileAction.FuncClick(Confirm_btn, "Confirm Popup Button");
			//mobileAction.waitProgressBarVanish();
		}
		
	catch (Exception e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		try {
			mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
		} catch (IOException ex) {
			System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
	}*/
	
	public void Continue_btn_popup_on_decline() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Continue_btn_popup_on_decline, "Continue popup Button");
			mobileAction.FuncClick(Continue_btn_popup_on_decline, "Continue Popup Button");
			//mobileAction.waitProgressBarVanish();
		}
		
	catch (Exception e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		try {
			mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
		} catch (IOException ex) {
			System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
	}
	
	public void Hamburger_button() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Hamburger_btn, "Hamburger Button");
			mobileAction.FuncClick(Hamburger_btn, "Hamburger Button");
			//mobileAction.waitProgressBarVanish();
		}
		
	catch (Exception e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		try {
			mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
		} catch (IOException ex) {
			System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
	}
	
	/*public void Profile_Settings() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(profile_and_settings, "Profile and Settings tab");
			mobileAction.FuncClick(profile_and_settings, "Profile and Settings tab");
			//mobileAction.waitProgressBarVanish();
		}
		
	catch (Exception e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		try {
			mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
		} catch (IOException ex) {
			System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
	}*/
	
	/*public void New_Security_settings() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(New_Security_Setup, "New Security button");
			mobileAction.FuncClick(New_Security_Setup, "New Security Button");
			//mobileAction.waitProgressBarVanish();
		}
		
	catch (Exception e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		try {
			mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
		} catch (IOException ex) {
			System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
	}*/
	
	/*public void Continue_btn() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Continue_btn, "Main Continue button");
			mobileAction.FuncClick(Continue_btn, "Main Continue button");
			//mobileAction.waitProgressBarVanish();
		}
		
	catch (Exception e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		try {
			mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
		} catch (IOException ex) {
			System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
	}*/
	
	public void Decline_btn() {
		Decorator();
		try
		{
			//mobileAction.verifyElementIsDisplayed(Decline_btn, "Decline button");
			mobileAction.FuncClick(Decline_btn, "Decline button");
			//mobileAction.waitProgressBarVanish();
		}
		
	catch (Exception e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		try {
			mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
		} catch (IOException ex) {
			System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
	}
	
	/*public void Profile_Settings_Validate() {
		Decorator();
		try
		{
			MobileElement CSTPROFHDR = PageHeader.get().getHeaderTextElement();
			//mobileAction.verifyElementIsDisplayed(CSTPROFHDR, "Profile & Settings");
			mobileAction.verifyElementTextContains(CSTPROFHDR,
					this.getTextInCurrentLocale(StringArray.ARRAY_IRM_PROFILE_SETTINGS));
			//mobileAction.waitProgressBarVanish();
			System.out.println("Provile & Settings screen validated");
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void Security_Setup_Validate() {
		Decorator();
		try
		{
			MobileElement CSTPROFHDR = PageHeader.get().getHeaderTextElement();
			//mobileAction.verifyElementIsDisplayed(CSTPROFHDR, "Success");
			mobileAction.verifyElementTextContains(CSTPROFHDR,
					this.getTextInCurrentLocale(StringArray.ARRAY_IRM_SECURITY_SETTINGS));
			//mobileAction.waitProgressBarVanish();
			System.out.println("Security setup is done");
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}*/
	
	public void Verify_Sender_info() {
		String NameProfile = getTestdata("NameProfile");
		String AddressProfile = getTestdata("AddressProfile");
		String PhoneProfile = getTestdata("PhoneProfile");
		String HomePhoneProfile = getTestdata("HomePhoneProfile");
		String EmailProfile = getTestdata("EmailProfile");
		mobileAction.sleep(5000);
		Decorator();
		try
		{
			mobileAction.verifyElement(NameLocator, NameProfile);
			mobileAction.verifyElement(AddressLocator, AddressProfile);
			mobileAction.verifyElement(PhoneLocator, PhoneProfile);
			mobileAction.verifyElement(HomePhoneLocator, HomePhoneProfile);
			mobileAction.verifyElement(EmailLocator, EmailProfile);

			System.out.println("Customer Information has been verified");
		}
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
		}
		
		public void Verify_ineligible_msg() {
			
			String IneligibleMsg = getTestdata("IneligibleMsg");
			String GenericError = getTestdata("GenericError");
			mobileAction.sleep(5000);
			Decorator();
			try
			{
				if(mobileAction.FuncIsDisplayed(Ineligible_msg) == true) {
				mobileAction.verifyElement(Ineligible_msg, IneligibleMsg);
		
				System.out.println("Ineligible message displayed has been verified");
			
				}
				else {
				mobileAction.verifyElement(Generic_Error, GenericError);
				
				System.out.println("Generic error displayed has been verified");
				}
			}
			catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				try {
					mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
				} catch (IOException ex) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
	}
		
		public void Stubbing_enable() {
			Decorator();
			try
			{
				Thread.sleep(2000);
				mobileAction.FuncSwipeUpTillScreenBottom(Banking_config);
					mobileAction.FuncClick(Banking_config, "Banking configuration tab");
				//mobileAction.verifyElementIsDisplayed(Feature_flag, "Feature flag tab");
				mobileAction.FuncClick(Feature_flag, "Feature flag tab");
				
				//mobileAction.verifyElementIsDisplayed(Stubbing_flag, "Stubbing flag");
				mobileAction.FuncClick(Stubbing_flag, "Stubbing flag");
				
				//mobileAction.verifyElementIsDisplayed(Back_btn, "Back Button");
				mobileAction.FuncClick(Back_btn, "Back Button");
				//mobileAction.waitProgressBarVanish();
			}
			
		catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
		}
			
			public void Back_click() {
				Decorator();
				try
				{
					//mobileAction.verifyElementIsDisplayed(Back_btn, "Back Button");
					mobileAction.FuncClick(Back_btn, "Back Button");
					//mobileAction.waitProgressBarVanish();
				}
				
			catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				try {
					mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
				} catch (IOException ex) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
			
			public void Cancel_click() {
				Decorator();
				try
				{
					//mobileAction.verifyElementIsDisplayed(Cancel_btn, "Cancel Button");
					mobileAction.FuncClick(Cancel_btn, "Cancel Button");
					//mobileAction.waitProgressBarVanish();
				}
				
			catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				try {
					mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
				} catch (IOException ex) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
			
			
			public void Address_Edit() {
				Decorator();
				try
				{
					
					//mobileAction.verifyElementIsDisplayed(Address_edit, "Address edit Button");
					mobileAction.FuncClick(Address_edit, "Address edit Button");
					//mobileAction.waitProgressBarVanish();
					Thread.sleep(2000);
					mobileAction.FuncClickBackButton();
				}
				
			catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				try {
					mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
				} catch (IOException ex) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
			
			
			public void Verify_address_edit_session_out() {
				Decorator();
				try
				{
					
					//mobileAction.verifyElementIsDisplayed(Address_edit, "Address edit Button");
					mobileAction.FuncClick(Address_edit, "Address edit Button");
					//mobileAction.waitProgressBarVanish();
					
					
					if(mobileAction.FuncIsDisplayed(Cancel_btn) == true) {
					//mobileAction.verifyElementIsDisplayed(Address_edit, "Address edit Button");
					mobileAction.FuncClick(Cancel_btn, "Cancel Button");
					//mobileAction.waitProgressBarVanish();
					}
					else
					{
						//mobileAction.verifyElementIsDisplayed(Address_edit, "Address edit Button");
						mobileAction.FuncClick(Cancel_btn_for_iOS_popup, "Cancel Button for popup on iOS");
						//mobileAction.waitProgressBarVanish();
					}
					//mobileAction.verifyElementIsDisplayed(Address_edit, "Address edit Button");
					mobileAction.FuncClick(Address_edit, "Address edit Button");
					//mobileAction.waitProgressBarVanish();
					
					//mobileAction.verifyElementIsDisplayed(Continue_popup_for_addressedit, "Continue pop Button");
					mobileAction.FuncClick(Continue_popup_for_addressedit, "Continue pop Button");
					Thread.sleep(10000);
					try {
					if (mobileAction.FuncIsDisplayed(Back_btn) == true) {
						mobileAction.FuncClick(Back_btn, "Back Button");
					}
					else {
					mobileAction.FuncClickBackButton();
					}
					Thread.sleep(10000);
					}
					catch(Exception E) {
						
					}
				
					/*MobileElement CSTPROFHDR = PageHeader.get().getHeaderTextElement();
					//mobileAction.verifyElementIsDisplayed(CSTPROFHDR, "Logged Out");
					mobileAction.verifyElementTextContains(CSTPROFHDR,
							this.getTextInCurrentLocale(StringArray.ARRAY_IRM_SESSION_OUT));
					//mobileAction.waitProgressBarVanish();
					System.out.println("Session logged out successfully");*/
					
				}
				
			catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				try {
					mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
				} catch (IOException ex) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
			
			public void Verify_TermsConditions_Error() {
				
				String TermsConditionsError = getTestdata("Terms&ConditionsError");
				mobileAction.sleep(5000);
				Decorator();
				try
				{
					//mobileAction.verifyElementIsDisplayed(TermsConditionserror, "Terms and conditions error message");
					mobileAction.verifyElement(TermsConditionserror, TermsConditionsError);
					Thread.sleep(2000);
					System.out.println("Terms & Conditions error has been verified");
					
					mobileAction.FuncClick(DownloadTermsConditions, "Download T & C Button");
				
					try {
						Thread.sleep(10000);
						if(mobileAction.FuncIsDisplayed(Cancel_btn) == true) {
							mobileAction.FuncClick(Cancel_btn, "Cancel Button");
						}
						else {
							mobileAction.FuncClickBackButton();
						}
						Thread.sleep(10000);
					}
					catch(Exception E) {
						
					}
					
					mobileAction.FuncClick(Decline_btn, "Decline Button");
					mobileAction.FuncClick(Yes_btn_popup_on_decline, "Yes button on decline popup");
					Thread.sleep(5000);
				}
				catch (Exception e) {
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					try {
						mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
					} catch (IOException ex) {
						System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
					System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
				}
			}
				public void Test_ids () {
					
					Transfers trnsfr = new Transfers();
					MenuPage menu = new MenuPage();
					Login login = new Login();
					String TestData = getTestdata("ID");


					Decorator();
					try
					{
						Thread.sleep(20000);

						for (int i=0; i<TestData.length(); i++) {
							String[] TestData1 = TestData.split(",");
							
						CL.getTestDataInstance().TCParameters.put("UserID", TestData1[i]);
						menu.clickMenuTransfer();
						login.login();
						trnsfr.clickInterac_e_Transfer();
						IRM.internationalTab_click();
						IRM.Verify_ineligible_msg();
						IRM.Back_click();
						try {
							if(TransfersOrSendMoney_page.isDisplayed()) {
								IRM.Back_click();
							}
						}
						catch (Exception E) {
							
						}
						mobileAction.FuncClick(Logout_btn, "Logout Button");
						IRM.Back_click();
						mobileAction.FuncClick(Home_btn, "Home Button");
						}
						
					}
					catch (Exception e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						try {
							mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
						} catch (IOException ex) {
							System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
						}
						System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
					}
		}
				
public void Test_eligible_ids () {
					
					Transfers trnsfr = new Transfers();
					MenuPage menu = new MenuPage();
					Login login = new Login();
					String TestData = getTestdata("ID");

					Decorator();
					try
					{
						Thread.sleep(20000);

						for (int i=0; i<=TestData.length(); i++) {
							String[] TestData1 = TestData.split(",");
							
						CL.getTestDataInstance().TCParameters.put("UserID", TestData1[i]);
						menu.clickMenuTransfer();
						login.login();
						trnsfr.clickInterac_e_Transfer();
						IRM.internationalTab_click();
						IRM.getStarted_click();
						IRM.Validate_Register_screen();
						IRM.Back_click();
						IRM.Back_click();
						try {
							if(TransfersOrSendMoney_page.isDisplayed()) {
								IRM.Back_click();
							}
						}
						catch (Exception E) {
							
						}
						mobileAction.FuncClick(Logout_btn, "Logout Button");
						IRM.Back_click();
						mobileAction.FuncClick(Home_btn, "Home Button");
						}
					}
					catch (Exception e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						try {
							mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
						} catch (IOException ex) {
							System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
						}
						System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
					}
		}
			
			
}
