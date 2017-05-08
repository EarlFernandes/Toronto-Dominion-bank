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

public class ContactUs extends _CommonPage {

	private static ContactUs ContactUs;

	@iOSFindBy(xpath = "//*[@label='Contact Us']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Contact Us']")
	private MobileElement contactUs;

	@iOSFindBy(xpath = "//*[contains(@label,'TD Direct Investing')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvTDWealthDINumberLabel' and @text='TD Direct Investing']")
	private MobileElement tdDirectInvesting;
	
	@iOSFindBy(xpath = "//*[@label='Call']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/ivTDWealthDINumberPhone']")
	private MobileElement call_button;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='OK']")
	private MobileElement ok;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	private MobileElement contactUsHeader;
	
	@iOSFindBy(accessibility = "CONTACTUS_HEADER")
	private MobileElement byPhone;
	
	@iOSFindBy(accessibility = "CONTACTUS_CELL_0_PHONE_TITLE")
	private MobileElement tdCT;
	
	@iOSFindBy(accessibility = "CONTACTUS_CELL_1_PHONE_TITLE")
	private MobileElement tdCC;
	
	@iOSFindBy(accessibility = "CONTACTUS_CELL_2_PHONE_TITLE")
	private MobileElement tdSmallBusiness;
	
	@iOSFindBy(accessibility = "CONTACTUS_CELL_3_PHONE_TITLE")
	private MobileElement tdDirectInvs;
	
	@iOSFindBy(accessibility = "CONTACTUS_CELL_4_PHONE_TITLE")
	private MobileElement tdWealthFinancial;
	
	@iOSFindBy(accessibility = "CONTACTUS_CELL_5_PHONE_TITLE")
	private MobileElement tdWealthPrivate;
	
	@iOSFindBy(accessibility = "CONTACTUS_CELL_0_MAIL_TITLE")
	private MobileElement giveFeedback;
	
	String t_call="Call";

	public synchronized static ContactUs get() {
		if (ContactUs == null) {
			ContactUs = new ContactUs();
		}
		return ContactUs;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		
	}
	/**
	 * This method will click on add payee button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyTDInvesting_Contact()  {
		Decorator();
		try {
		if(contactUs.isDisplayed()==true){
			
			mobileAction.verifyElementIsDisplayed(call_button, t_call);
			mobileAction.FuncClick(call_button, "Call");
			mobileAction.FuncClick(ok, "Ok");
		}
		}catch (NoSuchElementException | IOException |InterruptedException e) {
			e.printStackTrace();
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
		}

	/**
	 * This method will verify text within elements for the contact us screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyContactUsTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(contactUsHeader.getText(), mobileAction.getAppString("contactTDHeader"));
				mobileAction.verifyTextEquality(byPhone.getText(), mobileAction.getAppString("contact_us_Header_Title"));
				mobileAction.verifyTextEquality(tdCT.getText(), mobileAction.getAppString("td_contact_str"));
				mobileAction.verifyTextEquality(tdCC.getText().trim(), mobileAction.getAppString("contact_us_TD_Credit_Cards"));
				mobileAction.verifyTextEquality(tdSmallBusiness.getText().trim(), mobileAction.getAppString("contact_us_TD_Small_Business_Banking"));
				mobileAction.verifyTextEquality(tdDirectInvs.getText().trim(), mobileAction.getAppString("direct_investment_str"));
				mobileAction.verifyTextEquality(tdWealthFinancial.getText().trim(), mobileAction.getAppString("contact_us_TD_Wealth_Financial_Planning"));
				mobileAction.verifyTextEquality(tdWealthPrivate.getText().trim(), mobileAction.getAppString("contact_us_TD_Wealth_Private_Investment_Advice"));
				// FIXME: Get correct map string here
				//mobileAction.verifyTextEquality(giveFeedback.getText().trim(), mobileAction.getAppString("give_feedback"));
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("contactTDHeader") + "']", "Contact Us title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("by_phone") + "']", "By phone");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("td_contact_str") + "']", "TD Canada Trust");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("td_contact_credit_card_str") + "']", "TD Credit Card");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("td_contact_small_business_str") + "']", "TD Small business");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("homeDashboardContactTDDirectInvestingTitle") + "']", "TD Direct Investing");
				// Scroll down here
				final String xPathFooter = "//android.widget.RelativeLayout[@resource-id='com.td:id/rlLinks']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 3, "up");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("str_TDWealth_FP").replaceAll("\\<.*?>","") + "']", "Wealth financial");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("str_TDWealth_PIA") + "']", "Wealth private");
				// FIXME: What is the correct string here?
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("give_feedback") + "']", "Give feedback");				
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}

