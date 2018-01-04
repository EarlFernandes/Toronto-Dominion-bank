package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
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

public class Review extends _CommonPage {
	private static Review Review;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText | //XCUIElementTypeNavigationBar/XCUIElementTypeOther")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement reviewHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel']")
	private MobileElement cancelBtn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue']")
	private MobileElement payBillBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay Now']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Pay Now']")
	private MobileElement payNowBtn;
	
	@iOSFindBy(accessibility = "TDVIEW_MESSAGE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement review_banner_info;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/review_row_label']")
	private List<MobileElement> review_info_list;

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
			mobileAction.verifyElementTextIsDisplayed(reviewHeader, getTextInCurrentLocale(StringArray.ARRAY_REVIEW_HEADER));
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
	
	
	public void verifyReviewContent() {
		Decorator();
		String[] expectedReviewInfo = { getTextInCurrentLocale(StringArray.ARRAY_PAYEE_CAPTION),
				getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT),
				getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_START_DATE),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_END_DATE) +"|" +getTextInCurrentLocale(StringArray.ARRAY_RBP_NUMBER_OF_PAYMENTS)			
		};
		try {
			mobileAction.verifyElementTextIsDisplayed(review_banner_info, getTextInCurrentLocale(StringArray.ARRAY_RBP_REVIEW_BANNER));
			int sizeOfInfo = review_info_list.size();
			if (sizeOfInfo > expectedReviewInfo.length) {
				System.out.println("Failing........");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
			for ( int i=0; i< sizeOfInfo; i ++) {
				mobileAction.verifyElementTextIsDisplayed(review_info_list.get(i), expectedReviewInfo[i]);
			}
			

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}
	
	public void verifyAndClickCancelButton() {
		Decorator();
		try {
			verifyReviewHeader();
			mobileAction.FuncClick(cancelBtn, "Cancel Button Clicked");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		} 		
	}
	
	public void verifyAndClickPayBillButton() {
		Decorator();
		try {
			verifyReviewHeader();
			mobileAction.FuncClick(payBillBtn, "Pay Bill Button Clicked");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		} 		
	}
	
}