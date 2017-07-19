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

public class Review extends _CommonPage {
	private static Review Review;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Review']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Review']")
	private MobileElement reviewHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Cancel']")
	private MobileElement cancelBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay Now']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Pay Now']")
	private MobileElement payNowBtn;

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

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}

	}
}