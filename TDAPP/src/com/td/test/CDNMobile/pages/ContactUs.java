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
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ContactUs extends _CommonPage {

	private static ContactUs ContactUs;

	// @iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Contact Us' or
	// @label='Contactez-nous']")
	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement contactUs;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'TD Direct Investing')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvTDWealthDINumberLabel' and @text='TD Direct Investing']")
	private MobileElement tdDirectInvesting;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'TD Direct Investing')]/../XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/rlTDMainNumber']")

	private MobileElement call_Button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Call' or @label='Continue Call']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/continue_call_button']")
	private MobileElement callNow;

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

	@iOSFindBy(accessibility = "CONTACTUS_CELL_0_MAIL_TITLE")
	private MobileElement giveFeedback;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/locationText']")
	private MobileElement appointment_booking;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	private MobileElement optionChatbot;

	String t_call = "Call";

	public synchronized static ContactUs get() {
		if (ContactUs == null) {
			ContactUs = new ContactUs();
		}
		return ContactUs;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyTDInvesting_Contact() {
		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(contactUs)) {

				mobileAction.verifyElementIsDisplayed(call_Button, t_call);

				// mobileAction.FuncClick(call_Button, "Call Button");
				// mobileAction.FuncClick(callNow, "Call");
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} /*
			 * catch (InterruptedException e) {
			 * CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			 * System.out.println("InterruptedException from Method " +
			 * this.getClass().toString() + " " + e.getCause()); }
			 */ catch (IOException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyContactUsPageHeader() {
		Decorator();
		try {
			String contactUsText = getTextInCurrentLocale(StringArray.ARRAY_CONTACT_US_HEADER);
			mobileAction.verifyElementTextIsDisplayed(contactUs, contactUsText);
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
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
				mobileAction.verifyTextEquality(contactUsHeader.getText(),
						mobileAction.getAppString("contactTDHeader"));
				mobileAction.verifyTextEquality(byPhone.getText(),
						mobileAction.getAppString("contact_us_Header_Title"));
				mobileAction.verifyTextEquality(tdCT.getText(), mobileAction.getAppString("td_contact_str"));
				mobileAction.verifyTextEquality(tdCC.getText().trim(),
						mobileAction.getAppString("contact_us_TD_Credit_Cards"));
				mobileAction.verifyTextEquality(tdSmallBusiness.getText().trim(),
						mobileAction.getAppString("contact_us_TD_Small_Business_Banking"));
				mobileAction.verifyTextEquality(tdDirectInvs.getText().trim(),
						mobileAction.getAppString("direct_investment_str"));
				mobileAction.verifyTextEquality(tdWealthFinancial.getText().trim(),
						mobileAction.getAppString("contact_us_TD_Wealth_Financial_Planning"));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("contactTDHeader") + "']",
						"Contact Us title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("by_phone") + "']", "By phone");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("td_contact_str") + "']",
						"TD Canada Trust");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("td_contact_credit_card_str") + "']", "TD Credit Card");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("td_contact_small_business_str") + "']", "TD Small business");
				// mobileAction.verifyElementUsingXPath(
				// "//android.widget.TextView[@text='"
				// +
				// mobileAction.getAppString("homeDashboardContactTDDirectInvestingTitle")
				// + "']",
				// "TD Direct Investing");
				// Scroll down here
				final String xPathFooter = "//android.widget.RelativeLayout[@resource-id='com.td:id/rlLinks']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 3, "up");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("str_TDWealth_FP").replaceAll("\\<.*?>", "") + "']",
						"Wealth financial");

				// mobileAction.verifyElementUsingXPath(
				// "//android.widget.TextView[@text='" +
				// mobileAction.getAppString("give_feedback") + "']",
				// "Give feedback");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyContactUsMABContent() {
		Decorator();
		String contentText = getTextInCurrentLocale(StringArray.ARRAY_APPOINTMENT_BOOKING);
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				appointment_booking = mobileAction.verifyElementUsingXPath("//*[@label='" + contentText + "']",
						contentText);
			}
			mobileAction.FuncSwipeWhileElementNotFound(appointment_booking, false, 5, "up");
			mobileAction.verifyElementTextIsDisplayed(appointment_booking, contentText);

		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void ClickAppointmentBooking() {
		Decorator();
		String contentText = getTextInCurrentLocale(StringArray.ARRAY_APPOINTMENT_BOOKING);
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				appointment_booking = mobileAction.verifyElementUsingXPath("//*[@label='" + contentText + "']",
						contentText);
			}
			mobileAction.FuncSwipeWhileElementNotFound(appointment_booking, false, 5, "up");
			mobileAction.FuncClick(appointment_booking, contentText);
			mobileAction.sleep(3000);

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void clickChatbot() {
		Decorator();
		try {

			mobileAction.FuncClick(optionChatbot, "Chatbot option");

		} catch (Exception e) {
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
