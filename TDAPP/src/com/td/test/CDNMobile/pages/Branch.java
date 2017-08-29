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

public class Branch extends _CommonPage {

	private static Branch branch;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement branch_header;

	private MobileElement book_appointment_icon;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/text_branch_address']")
	private MobileElement brancn_address;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/text_branch_number']")
	private MobileElement brancn_number;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/text_branch_wheelchair']")
	private MobileElement brancn_wheelchair_access;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/text_branch_hours']")
	private MobileElement brancn_working_hour;


	public synchronized static Branch get() {
		if (branch == null) {
			branch = new Branch();
		}
		return branch;
	}

	private void Decorator() {

		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void verifyBranchHeader() {
		Decorator();
		String expectedText = getTextInCurrentLocale(StringArray.ARRAY_BRABCH_HEADER);
		try {
			mobileAction.verifyElementTextIsDisplayed(branch_header, expectedText);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will verify the location details
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
	public void verifyLocationDetails() {
		Decorator();
		try {
			
			verifyBranchHeader();
			String branchAddress = mobileAction.getValue(brancn_address);			
			mobileAction.Report_Pass_Verified("Branch address:"+ branchAddress);
			
			String branchNumber = mobileAction.getValue(brancn_number);			
			mobileAction.Report_Pass_Verified("Branch number:"+ branchNumber);
			
			String branchWheelChairAccess = mobileAction.getValue(brancn_wheelchair_access);			
			mobileAction.Report_Pass_Verified("Branch wheel chair access:"+ branchWheelChairAccess);
			
			String branchWorkingHour = mobileAction.getValue(brancn_working_hour);			
			mobileAction.Report_Pass_Verified("Branch working hour:"+ branchWorkingHour);
			
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("NoSuchElementException:Failed to verify branch details");
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception:Failed to verify branch details");
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void verifyBranchBookAppointmentContent() {
		Decorator();
		String expectedText = "";
		try {
			mobileAction.FuncSwipeOnce("up");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				expectedText = getTextInCurrentLocale(StringArray.ARRAY_BOOKING_APPOINTMENT_IOS);
				book_appointment_icon = mobileAction.verifyElementUsingXPath("//*[@label='" + expectedText + "']",
						"Book a Visit");
			} else {
				expectedText = getTextInCurrentLocale(StringArray.ARRAY_BOOKING_APPOINTMENT_AND);
				book_appointment_icon = mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='" + expectedText + "']", "Book an Appointment");
			}
			String capturedText = mobileAction.getValue(book_appointment_icon);
			System.out.println("CapturedText:" + capturedText);
			mobileAction.verifyTextEquality(capturedText, expectedText);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void clickBranchBookAppointmentIcon() {
		Decorator();
		String expectedText = "";
		try {
			mobileAction.FuncSwipeOnce("up");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				expectedText = getTextInCurrentLocale(StringArray.ARRAY_BOOKING_APPOINTMENT_IOS);
				book_appointment_icon = mobileAction.verifyElementUsingXPath("//*[@label='" + expectedText + "']",
						"Book a Visit");
			} else {
				expectedText = getTextInCurrentLocale(StringArray.ARRAY_BOOKING_APPOINTMENT_AND);
				book_appointment_icon = mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='" + expectedText + "']", "Book an Appointment");
			}

			mobileAction.FuncClick(book_appointment_icon, expectedText);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
}
