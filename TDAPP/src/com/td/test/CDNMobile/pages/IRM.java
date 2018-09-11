/**
 * 
 */
package com.td.test.CDNMobile.pages;

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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/**
 * @author FERNE97
 *
 */
public class IRM extends _CommonPage {
	
	@iOSXCUITFindBy(accessibility = "Transfers - International Transfers - International")
	//@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button'])[2]")
	private MobileElement IntTrnsfrBtn;
	
	@iOSXCUITFindBy(accessibility = "International")
	@AndroidFindBy(xpath = "//*[(@text='International' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/right_button' or @resource-id='com.td:id/right_button_text')]")
	private MobileElement IntTab;
	
	@iOSXCUITFindBy(accessibility = "Get Started")
	@AndroidFindBy(xpath = "//*[(@text='Get started' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/btn_done' or @resource-id='com.td:id/btn_done_text')]")
	private MobileElement GetStarted;
	
	@iOSXCUITFindBy(accessibility = "Name")
	@AndroidFindBy(xpath = "//*[(@text='Name' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/label_textview' or @resource-id='com.td:id/name_textview')]")
	private MobileElement Name_text;
	
	@iOSXCUITFindBy(accessibility = "Continue")
	@AndroidFindBy(xpath = "//*[(@text='Continue' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/right_button' or @resource-id='com.td:id/right_button_text')]")
	private MobileElement Continue_Btn_right;
	
	@iOSXCUITFindBy(accessibility = "term_conditon_checkbox")
	@AndroidFindBy(xpath = "//*[(@text='Agree to Terms & Conditions' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/checkbox_btn' or @resource-id='com.td:id/checkbox_btn_text')]")
	private MobileElement Checkbox;
	
	@iOSXCUITFindBy(accessibility = "Accept")
	@AndroidFindBy(xpath = "//*[(@text='Accept' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/right_button' or @resource-id='com.td:id/right_button_text')]")
	private MobileElement Accept_Btn;
	
	@iOSXCUITFindBy(accessibility = "TDTERMS_BASE_ACCEPT_BTN")
	@AndroidFindBy(xpath = "//*[(@text='Agree' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/btn_continue' or @resource-id='com.td:id/btn_continue_text')]")
	private MobileElement Agree_Btn;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Edit'])[2]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView[2]")
	private MobileElement Contact_edit;
	
	@iOSXCUITFindBy(accessibility = "ADDRESS")
	@AndroidFindBy(xpath = "//*[(@text='Accept' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/right_button' or @resource-id='com.td:id/right_button_text')]")
	private MobileElement Address_check;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Not Now']")
	@AndroidFindBy(xpath = "//*[(@text='Not Now' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/btn_cancel' or @resource-id='com.td:id/btn_cancel_text')]")
	private MobileElement Not_now_btn;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Continue'])[2]")
	@AndroidFindBy(xpath = "//*[(@text='CONTINUE' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='android:id/button1' or @resource-id='android:id/button1_text')]")
	private MobileElement Continue_btn_popup_after_notnow;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
	@AndroidFindBy(xpath = "//*[(@text='CONTINUE' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='android:id/button1' or @resource-id='android:id/button1_text')]")
	private MobileElement Continue_btn_popup_on_decline;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirm']")
	@AndroidFindBy(xpath = "//*[(@text='Confirm' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='android:id/button1' or @resource-id='android:id/button1_text')]")
	private MobileElement Confirm_btn;
	
	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/hamburger' or @resource-id='com.td:id/menu_layout']")
	private MobileElement Hamburger_btn;
	
	@iOSXCUITFindBy(xpath = "//*[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Profil et paramètres' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement profile_and_settings;
	
	@iOSXCUITFindBy(accessibility = "New Security Setup")
	@AndroidFindBy(xpath = "//*[(@text='New Security Setup' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/profile_landing_nav_security' or @resource-id='com.td:id/nav_row_profile_title')]")
	private MobileElement New_Security_Setup;
	
	@iOSXCUITFindBy(accessibility = "Continue")
	@AndroidFindBy(xpath = "//*[(@text='Continue') or (@resource-id='com.td:id/btn_primary' or @resource-id='com.td:id/btn_primary_text')]")
	private MobileElement Continue_btn;
	
	@iOSXCUITFindBy(accessibility = "TDTERMS_BASE_DECLINE_BTN")
	@AndroidFindBy(xpath = "//*[(@text='Decline' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/btn_cancel' or @resource-id='com.td:id/btn_cancel_text')]")
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
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.TextView[2]")
	private MobileElement Ineligible_msg;
	
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
	
	public void InternationalMoneyTransfer() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(IntTrnsfrBtn, "International Transfer Button");
			mobileAction.FuncClick(IntTrnsfrBtn, "International Transfer Button");
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
		
	public void internationalTab_click() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(IntTab, "International Tab");
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
		
			mobileAction.verifyElementIsDisplayed(Continue_Btn_right, "Continue Button");
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
			mobileAction.verifyElementIsDisplayed(Checkbox, "Checkbox Flag");
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
			mobileAction.verifyElementIsDisplayed(Accept_Btn, "Accept Button");
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
	
	public void Agree_click() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(Agree_Btn, "Accept Button");
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
	}
	
	public void getStarted_click() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(GetStarted, "Get Started Button");
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
	
	public void name_validate_iOS() {
		Decorator();
		try
		{
			MobileElement CSTPROFHDR = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(CSTPROFHDR, "Registration");
			mobileAction.verifyElementTextContains(CSTPROFHDR,
					this.getTextInCurrentLocale(StringArray.ARRAY_IRM_ELIGIBILITY_iOS));
			//mobileAction.waitProgressBarVanish();
			System.out.println("Customer eligibility check is done");
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
	
	public void name_validate_Android() {
		Decorator();
		try
		{
			MobileElement CSTPROFHDR = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(CSTPROFHDR, "Registration");
			mobileAction.verifyElementTextContains(CSTPROFHDR,
					this.getTextInCurrentLocale(StringArray.ARRAY_IRM_ELIGIBILITY_Android));
			//mobileAction.waitProgressBarVanish();
			System.out.println("Customer eligibility check is done");
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
			mobileAction.verifyElementIsDisplayed(Contact_edit, "Edit contact information button");
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
	
	public void Customer_profile_validated() {
		Decorator();
		try
		{
			MobileElement header = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(header, "Profile");
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
	
	public void Not_now_btn() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(Not_now_btn, "Not Now Button");
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
	}
	
	public void Continue_popup_after_notnow() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(Continue_btn_popup_after_notnow, "Continue popup Button");
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
	}
	
	public void Confirm_btn() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(Confirm_btn, "Confirm popup Button");
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
	}
	
	public void Continue_btn_popup_on_decline() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(Continue_btn_popup_on_decline, "Continue popup Button");
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
			mobileAction.verifyElementIsDisplayed(Hamburger_btn, "Hamburger Button");
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
	
	public void Profile_Settings() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(profile_and_settings, "Profile and Settings tab");
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
	}
	
	public void New_Security_settings() {
		Decorator();
		try
		{
			
				/*if(mobileAction.FuncIsDisplayed(Not_now_btn, "Not Now Button") == true){
			
				mobileAction.FuncClick(Not_now_btn, "Not Now button clicked");
				mobileAction.FuncClick(Continue_btn_popup, "Continue button popup clicked");
			}
		else {*/
	
			mobileAction.verifyElementIsDisplayed(New_Security_Setup, "New Security button");
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
	}
	
	public void Continue_btn() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(Continue_btn, "Main Continue button");
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
	}
	
	public void Decline_btn() {
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(Decline_btn, "Decline button");
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
	
	public void Profile_Settings_Validate() {
		Decorator();
		try
		{
			MobileElement CSTPROFHDR = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(CSTPROFHDR, "Profile & Settings");
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
			mobileAction.verifyElementIsDisplayed(CSTPROFHDR, "Success");
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
	}
	
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
			mobileAction.sleep(5000);
			Decorator();
			try
			{
				mobileAction.verifyElement(Ineligible_msg, IneligibleMsg);
				

				
				System.out.println("Ineligible message displayed has been verified");
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
