package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Review extends _CommonPage {
	private static Review Review;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Review']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Review']")
	private MobileElement reviewHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[TBD]")
	private MobileElement cancelBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[TBD]")
	private MobileElement payNowBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[TBD]")
	private MobileElement fromAcctValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[TBD]")
	private MobileElement toCardName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.Button[TBD]")
	private MobileElement toCardNum;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[TBD]")
	private MobileElement amtValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[TBD]")
	private MobileElement dateValue;

	public synchronized static Review get() {
		if (Review == null) {
			Review = new Review();
		}
		return Review;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);

	}

	public void verifyReviewHeader() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(reviewHeader, "Cancel Button");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click the Cancel button in Review Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void cancelButton() {
		Decorator();
		try {
			mobileAction.FuncClick(cancelBtn, "Cancel Button");
			StatementBalance.get().verifyStatementBalanceHeader();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click the pay Now in statement Balance Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void payNowButton() {
		Decorator();
		try {
			mobileAction.FuncClick(payNowBtn, "Pay Now Button");
			mobileAction.waitProgressBarVanish();

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

	public void verifyRedemptionReview() {
		Decorator();
		try {

			String amt = "25";
			mobileAction.verifyElementIsDisplayed(fromAcctValue, "From Account Value");
			mobileAction.verifyElementIsDisplayed(toCardName, "To Card Name");
			mobileAction.verifyElementIsDisplayed(toCardNum, "To Card Number");
			mobileAction.verifyElementIsDisplayed(amtValue, "Amount Value");
			mobileAction.verifyElementTextContains(amtValue, amt);
			mobileAction.verifyElementIsDisplayed(dateValue, "Date Value");

			mobileAction.verifyElementIsDisplayed(cancelBtn, "Cancel button");
			mobileAction.verifyElementIsDisplayed(payNowBtn, "Pay Now button");

			mobileAction.sleep(2000);

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