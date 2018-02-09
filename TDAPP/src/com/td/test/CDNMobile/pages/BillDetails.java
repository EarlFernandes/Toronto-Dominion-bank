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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class BillDetails extends _CommonPage {

	private static BillDetails billDetails;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/review_row_label']")
	private List<MobileElement> bill_details_caption_list;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/review_row_primary_text']")
	private List<MobileElement> bill_details_info_list;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeTable/following-sibling::XCUIElementTypeOther//XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/bottom_button']")
	private MobileElement Cancel_Bill_Payment;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/main_header']")
	private MobileElement bill_details_payee_name;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/sub_header']")
	private MobileElement bill_details_payee_account;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message_1_val']")
	private MobileElement bill_details_confirmation_num;

	public synchronized static BillDetails get() {
		if (billDetails == null) {
			billDetails = new BillDetails();
		}
		return billDetails;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void verifyBillDetailsPageHeader() {
		Decorator();
		try {
			String titleText = getTextInCurrentLocale(StringArray.ARRAY_BILL_DETAILS);

			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(), titleText);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyBillDetailsContent() {
		Decorator();
		try {
			String payeeName = mobileAction.getValue(bill_details_payee_name);
			mobileAction.Report_Pass_Verified("Payee Name:"+payeeName);
			String payeeNum = mobileAction.getValue(bill_details_payee_account);
			if(payeeNum.matches("\\•{4}\\s{1}\\d{4}")) {
				mobileAction.Report_Pass_Verified("Payee account masked:"+payeeNum);
			} else {
				mobileAction.Report_Fail("Payee account not masked:"+payeeNum);
			}

			String confirmationNum = mobileAction.getValue(bill_details_confirmation_num);
			mobileAction.Report_Pass_Verified("confirmation #:"+confirmationNum);
			
			String[] expectedReviewInfo = { getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_FROM_ACCOUNT),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_START_DATE),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYMENTS_REMAINING),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_END_DATE) };

			mobileAction.FuncSwipeOnce("up");
			
			//check payment is once or ongoing
			String paymentType = mobileAction.getValue(bill_details_info_list.get(2));
			if(paymentType.equals(getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONCE))) {
				expectedReviewInfo[3] = getTextInCurrentLocale(StringArray.ARRAY_RBP_ONCE_DATE);
			}
			int sizeOfInfo = bill_details_caption_list.size();
			if (sizeOfInfo > expectedReviewInfo.length) {
				System.out.println("Failing........");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
			for (int i = 0; i < sizeOfInfo; i++) {
				mobileAction.verifyElementTextIsDisplayed(bill_details_caption_list.get(i), expectedReviewInfo[i]);
			}

			mobileAction.verifyElementTextIsDisplayed(Cancel_Bill_Payment,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_CANCEL_BILL_PAYMENT));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyCancelButtonDisplayed() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(Cancel_Bill_Payment,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_CANCEL_BILL_PAYMENT));
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyCancelButtonNotDisplayed() {
		Decorator();
		try {
			mobileAction.verifyElementNotPresent(Cancel_Bill_Payment,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_CANCEL_BILL_PAYMENT));
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void clickRBPCancelButton() {
		Decorator();
		try {
			mobileAction.FuncClick(Cancel_Bill_Payment, "Cancel Bill Payment");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
}
