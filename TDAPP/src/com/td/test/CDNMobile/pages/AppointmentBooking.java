package com.td.test.CDNMobile.pages;

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

public class AppointmentBooking extends _CommonPage {

	private static AppointmentBooking appointmentBooking;
	
	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement appointmentbooking_header;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mab_description_text']")
	private MobileElement copy_text;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/mab_book_button']")
	private MobileElement book_appointment_now_btn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.android.chrome:id/url_bar']")
	private MobileElement cancel_change_appointment_link;
	
	@iOSFindBy(xpath = "//*[@name='URL']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']")
	private MobileElement appointment_url_link;
	
	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;
	
	public synchronized static AppointmentBooking get() {
		if (appointmentBooking == null) {
			appointmentBooking = new AppointmentBooking();
		}
		return appointmentBooking;
	}

	private void Decorator() {

		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}
	
	public void verifyAppointmentBookingHeader() {
		Decorator();
		String expectedText=getTextInCurrentLocale(StringArray.ARRAY_APPOINTMENT_BOOKING);
		try {
			mobileAction.verifyTextEquality(mobileAction.getValue(appointmentbooking_header),expectedText);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void verifyMABLandingPageContent() {
		Decorator();
		
		String expectedText="";
		try {

			expectedText= getTextInCurrentLocale(StringArray.ARRAY_MAB_COPY_TEXT);
			mobileAction.verifyElementTextIsDisplayed(copy_text, expectedText);
			
			expectedText = getTextInCurrentLocale(StringArray.ARRAY_BOOKING_APPOINTMENT_BTN);
			mobileAction.verifyElementTextIsDisplayed(book_appointment_now_btn, expectedText);
			
			expectedText = getTextInCurrentLocale(StringArray.ARRAY_CHANGE_CANCEl_LINK);
			mobileAction.verifyElementTextIsDisplayed(cancel_change_appointment_link, expectedText);
			
//			expectedText = getTextInCurrentLocale(StringArray.ARRAY_MAB_FAQ);
//			mobileAction.verifyElementTextIsDisplayed(cancel_change_appointment_link, expectedText);
//			
//			expectedText = getTextInCurrentLocale(StringArray.ARRAY_MAB_FAQ_LINK);
//			mobileAction.verifyElementTextIsDisplayed(cancel_change_appointment_link, expectedText);
			
			
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void clickBookAppointmentNowbtn() {
		Decorator();
		
		try {
			mobileAction.FuncClick(book_appointment_now_btn, "Book Appointment Now");
			mobileAction.waitForElementToVanish(progress_bar);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void verifyAppointmentURLLink() {
		Decorator();
		String expectedText=getTextInCurrentLocale(StringArray.ARRAY_MAB_URL_LINK);
		try {
			String capturedText;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
				capturedText = appointment_url_link.getAttribute("value");
			}else{
				capturedText = mobileAction.getValue(appointment_url_link);
			}
			System.out.println("Captured text:"+capturedText);
			mobileAction.verifyTextEquality(capturedText, expectedText);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
}
