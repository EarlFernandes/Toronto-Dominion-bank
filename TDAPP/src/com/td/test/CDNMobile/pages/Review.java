package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.DecimalFormat;
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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/..//XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel']")
	private MobileElement cancelBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Pay Bill' or @label='Payer' or @label='支付账单' or @label='支付賬單']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue']")
	private MobileElement payBillBtn;

	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[2]")
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement payNowBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement review_banner_info;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/review_row_label']")
	private List<MobileElement> review_info_list;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/item_row_value_main'])[1]")
	private MobileElement fromAcctValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/item_row_value_main'])[2]")
	private MobileElement toCardName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/item_row_subvalue'])[1]")
	private MobileElement toCardNum;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/item_row_value_main'])[3]")
	private MobileElement amtValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/item_row_value_main'])[4]")
	private MobileElement dateValue;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement rbp_error_message;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='How Often' or @label='Type de paiement' or @label='次数' or @label='次數']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='How Often' or @text='Type de paiement' or @text='次数' or @text='次數']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement rbp_howoften_selection;

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
			mobileAction.verifyElementTextIsDisplayed(reviewHeader,
					getTextInCurrentLocale(StringArray.ARRAY_REVIEW_HEADER));
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

	public void verifyReviewContent() {
		Decorator();
		String[] expectedReviewInfo = { getTextInCurrentLocale(StringArray.ARRAY_PAYEE_CAPTION),
				getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_FROM_ACCOUNT),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_START_DATE),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_END_DATE) + "|"
						+ getTextInCurrentLocale(StringArray.ARRAY_RBP_NUMBER_OF_PAYMENTS) };
		try {
			
			//check payment is once or ongoing
			String paymentType = mobileAction.getValue(rbp_howoften_selection);
			if(paymentType.equals(getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONCE))) {
				expectedReviewInfo[4] = getTextInCurrentLocale(StringArray.ARRAY_RBP_ONCE_DATE);
			}
			
			mobileAction.verifyElementTextIsDisplayed(review_banner_info,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_REVIEW_BANNER));

			
			int sizeOfInfo = review_info_list.size();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				sizeOfInfo = sizeOfInfo - 1; // for IOS, the first one is the
												// banner info, so remove it.
			}

			if (sizeOfInfo > expectedReviewInfo.length) {
				System.out.println("Failing........");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
			for (int i = 0; i < sizeOfInfo; i++) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.verifyElementTextIsDisplayed(review_info_list.get(i + 1), expectedReviewInfo[i]);
				} else {
					mobileAction.verifyElementTextIsDisplayed(review_info_list.get(i), expectedReviewInfo[i]);
				}

			}

			mobileAction.verifyElementTextIsDisplayed(cancelBtn,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYEE_FILTER_CANCEL_BUTTON));
			mobileAction.verifyElementTextIsDisplayed(payBillBtn,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYBILL_BTN));

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
			// verifyReviewHeader();
			if(currentLocale.equalsIgnoreCase("en")) {
				saveBalance(); // only for english
			}
			mobileAction.FuncClick(payBillBtn, "Pay Bill Button Clicked");
			mobileAction.waitProgressBarVanish();
			
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}
	


	public void saveBalance() {
		Decorator();
		try {
			String amountPath, fromAccountPath, fromAccountNamePath;
			String amountText = getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT);
			String fromAccountText = getTextInCurrentLocale(StringArray.ARRAY_RBP_FROM_ACCOUNT);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				amountPath = "//XCUIElementTypeStaticText[@label='" + amountText
						+ "']/following-sibling::XCUIElementTypeStaticText";
				fromAccountPath = "//XCUIElementTypeStaticText[@label='" + fromAccountText
						+ "']/following-sibling::XCUIElementTypeStaticText[3]";
				fromAccountNamePath = "//XCUIElementTypeStaticText[@label='" + fromAccountText
						+ "']/following-sibling::XCUIElementTypeStaticText[1]";
			} else {
				amountPath = "//android.widget.TextView[@text='" + amountText
						+ "']/following-sibling::android.widget.RelativeLayout/android.widget.TextView";
				fromAccountPath = "//android.widget.TextView[@text='" + fromAccountText
						+ "']/following-sibling::android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.td:id/review_row_tertiary_text']";
				fromAccountNamePath = "//android.widget.TextView[@text='" + fromAccountText
						+ "']/following-sibling::android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.td:id/review_row_primary_text']";
			}
			MobileElement amountItem = mobileAction.verifyElementUsingXPath(amountPath, "Amount$");
			MobileElement fromAccountItem = mobileAction.verifyElementUsingXPath(fromAccountPath, "Fromaccount$");
			MobileElement fromAccountName = mobileAction.verifyElementUsingXPath(fromAccountNamePath, "Fromaccount name");

			String amountVal = mobileAction.getValue(amountItem);
			String fromAccountValue = mobileAction.getValue(fromAccountItem);
			String fromAccountNameText = mobileAction.getValue(fromAccountName);
			boolean isFromAccountLOC = false;
			if(fromAccountNameText.contains("LINE OF CREDIT")) {
				isFromAccountLOC = true;
			}
			
			double d_amountVal = mobileAction.convertStringAmountTodouble(amountVal);
			double d_fromAccountValue = mobileAction.convertStringAmountTodouble(fromAccountValue);
			double d_balance =0;
			if(isFromAccountLOC ) {
				d_balance = d_fromAccountValue + d_amountVal;
			} else {
				d_balance = d_fromAccountValue - d_amountVal;
			}
			d_balance = mobileAction.RoundTo2Decimals(d_balance);
			
			CL.getTestDataInstance().TCParameters.put("Dividend", Double.toString(d_balance));
//			String receivedBalance = CL.getTestDataInstance().TCParameters.get("Dividend");
//			System.out.println("receivedBalance:" + receivedBalance);
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}
	
	private String getErrorMapping(String errorSheet) {

		switch (errorSheet) {
		case "Max Amount Error":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_MAX_AMOUNT_ERROR);
		case "Amount Greater Than Balance Error":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_ERROR_AMOUNT_GREATER_BALANCE);
		case "Date Range Not Pass One Number of Payment Error":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_ERROR_DATE_RANGE_NOT_PASS_ONE_PAYMENT);			
			
		}
		return "";
	}

		
	public void VerifyRBPErrorMessageInReviewPage() {
		Decorator();
		String errorSheet = getTestdata("Security_Question");

		try {
			String expectedError = getErrorMapping(errorSheet);
			if (expectedError.isEmpty()) {
				mobileAction.Report_Fail("Failed to verify error message since data sheet is not correct");
				return;
			}

			mobileAction.verifyElementTextIsDisplayed(rbp_error_message, expectedError);

		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to verify error message");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
		
	}

}