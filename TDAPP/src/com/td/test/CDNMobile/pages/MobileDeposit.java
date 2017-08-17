package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MobileDeposit extends _CommonPage {
	private static MobileDeposit MobileDeposit;

	// Deposit cheque form
	@iOSFindBy(accessibility = "DEPOSIT_CHECK_VIEW_TO")
	private MobileElement toAccount;

	// FIXME: Ask may to add this to hint
	@iOSFindBy(accessibility = "DEPOSIT_CHECK_SELECT_ACCOUNT")
	private MobileElement toAccountHint;

	@iOSFindBy(accessibility = "DEPOSIT_CHECK_VIEW_AMOUNT")
	private MobileElement amount;

	@iOSFindBy(accessibility = "DEPOSIT_CHECK_VIEW_DAILY_LIMIT")
	private MobileElement dailyLimitMsg;

	@iOSFindBy(accessibility = "DEPOSIT_CHECK_VIEW_30DAY_LIMIT")
	private MobileElement thirtyDayLimitMsg;

	@iOSFindBy(accessibility = "DEPOSIT_CHECK_VIEW_MEMO")
	private MobileElement memo;

	@iOSFindBy(accessibility = "DEPOSIT_CHECK_OPTIONAL")
	private MobileElement memoHint;

	@iOSFindBy(accessibility = "DEPOSIT_CHECK_VIEW_CAPTURE")
	private MobileElement captureCheckTitle;

	@iOSFindBy(accessibility = "DEPOSIT_CHECK_VIEW_FRONT")
	private MobileElement frontChequeText;

	@iOSFindBy(accessibility = "DEPOSIT_CHECK_VIEW_BACK")
	private MobileElement backChequeText;

	@iOSFindBy(accessibility = "DEPOSIT_CHECK_VIEW_CONTINUE")
	private MobileElement continueButtonChequeForm;

	// End deposit cheque form

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement mobile_Deposit_Header;

	@iOSFindBy(accessibility = "DEPOSITVIEW_DEPOSIT_DES")
	private MobileElement dpstCheque_btn_desc;

	@iOSFindBy(accessibility = "DEPOSITVIEW_HISTORY")
	private MobileElement chequeHistoryButton;

	@iOSFindBy(accessibility = "DEPOSITVIEW_DEPOSIT")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/MobileDeposit_DepositCheque_Header_TextView']")
	private MobileElement dpstCheque_Btn;

	@iOSFindBy(accessibility = "DEPOSITVIEW_HISTORY_DES")
	private MobileElement chequeHistoryButtonDesc;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'We')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/enrollment_headertitle1' and starts-with(@text,'We')]")
	private MobileElement validation_firstLine;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/MobileDepositReceipts_ViewDetails_Date_TextView']")
	private MobileElement datePicker;

	@iOSFindBy(accessibility = "MRDCNOTELIGIBLE_LABLE1")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/enrollment_headertitle1']")
	private MobileElement validation_FirstLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'not eligible to use TD Mobile Deposit at this time.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/enrollment_headertitle_subtitle_1' and contains(@text,'not eligible to use TD Mobile Deposit at this time')]")
	private MobileElement validation_SecondLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'To deposit a cheque using the TD')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'To deposit a cheque using the TD')]")
	private MobileElement validation_ThirdLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Be a TD Canada Trust customer')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Be a TD Canada Trust customer')]")
	private MobileElement validationFourthLine;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/deposit_date']")
	private List<MobileElement> dateHeaders;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Have at least one eligible Chequing')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Have at least one eligible Chequing')]")
	private MobileElement validation_FifthLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[starts-with(@label,'To make a deposit, please visit a Branch or ATM')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'To make a deposit')]")

	private MobileElement validation_SixthLine;

	String progressBar = "//android.widget.TextView[@resource-id='com.td:id/ProgressBar_TextView']";

	String mobile_Header_value = "Mobile Deposit";

	public synchronized static MobileDeposit get() {
		if (MobileDeposit == null) {
			MobileDeposit = new MobileDeposit();
		}
		return MobileDeposit;
	}

	private void Decorator() {
		PageFactory.initElements(

				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(10, TimeUnit.SECONDS)), this);

	}

	private void initElementDepositChequeButton() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				dpstCheque_Btn = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("MobileDeposit_DepositCheque_Header") + "']",
						"Deposit Cheque");
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

	private void initElementHistoryChequeButton() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				chequeHistoryButton = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("ActionBar_MobileDepositReceipt") + "']",
						"Mobile Deposit History");
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

	/**
	 * This method is used for Verify eligibility declined error message is
	 * displayed when customers Access Card type is not 000, 001, 032. 033 or
	 * 037
	 * 
	 * @return void
	 * @throws IOException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 *
	 */
	public void mobile_Dpst_Validation_Page() {

		Decorator();
		try {
			mobileAction.waitForElementToDisappear(progressBar);
			mobileAction.verifyElementIsDisplayed(mobile_Deposit_Header, mobile_Header_value);

			mobileAction.verifyElementIsPresent(validation_FirstLine);

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify the Mobile_Deposit_Header
	 * 
	 * @return void
	 * @throws IOException
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 *
	 */
	public void verifyDepositHeader() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(mobile_Deposit_Header, mobile_Header_value);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will Click the Cheque Deposit History
	 * 
	 * @return void
	 * @throws IOException
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 *
	 */
	public void chequeDepositHistory() {
		Decorator();
		try {
			initElementHistoryChequeButton();
			mobileAction.FuncClick(chequeHistoryButton, "Cheque History");
		} catch (NoSuchElementException | IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will Click the DepositCheque
	 * 
	 * @return void
	 * @throws IOException
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 *
	 */
	public void depositCheque() {

		Decorator();
		try {

			initElementDepositChequeButton();
			mobileAction.FuncClick(dpstCheque_Btn, "DepositCheque");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will verify text within elements for the deposit cheque
	 * history screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyDepositChequeHistoryTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				dateHeaders = (CL.GetAppiumDriver()).findElements(

						By.xpath("//XCUIElementTypeStaticText[contains(@name, 'DEPOSIT_RECEIPT_VIEW_DATE')]"));
				for (MobileElement m : dateHeaders) {
					mobileAction.verifyDateFormat(m.getText(), MobileAction2.TYPE_YYYY_MM_DD);
				}
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
								+ mobileAction.getAppString("mobiledeposit_successfeature_str_depositreceipts") + "']",
						"Deposit Cheque History");
				mobileAction
						.verifyElementUsingXPath(
								"//XCUIElementTypeStaticText[@name='DEPOSIT_RECEIPT_VIEW_HEADER' and @label='"
										+ mobileAction.getAppString("mobiledeposit_receipt_message") + "']",
								"Warning msg");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='DEPOSIT_RECEIPT_VIEW_FOOTER']",
						"disclaimer");
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("ActionBar_MobileDepositReceipt") + "']",
						"Deposit Cheque History");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("MobileDepositReceipt_Header_Description") + "']",
						"Warning msg");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("MRDC_MOBILE_DEPOSIT_RECEIPT_LIST_DISCLAIMER") + "']",
						"disclaimer");
				for (MobileElement m : dateHeaders) {
					mobileAction.verifyDateFormat(m.getText(), MobileAction2.TYPE_YYYY_MM_DD);
				}
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

	/**
	 * This method will verify text within elements for the deposit cheque
	 * screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyDepositChequeTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE'
				// and @label='" + mobileAction.getAppString("") + "']",
				// "Header");
				mobileAction.verifyTextEquality(amount.getText(),
						mobileAction.getAppString("mobiledeposit_depositcheque_str_amount"));
				mobileAction.verifyTextEquality(toAccount.getText(),
						mobileAction.getAppString("mobiledeposit_depositcheque_str_history_toaccount"));
				mobileAction.verifyTextEquality(toAccountHint.getText(),
						mobileAction.getAppString("mobiledeposit_depositcheque_str_selectAccount"));
				mobileAction.verifyTextEquality(memo.getText(),
						mobileAction.getAppString("mobiledeposit_depositcheque_str_history_memo"));
				mobileAction.verifyTextEquality(memoHint.getText(),
						mobileAction.getAppString("mobiledeposit_depositcheque_str_memo_hint"));
				mobileAction.verifyTextEquality(captureCheckTitle.getText(),
						mobileAction.getAppString("mobiledeposit_depositcheque_str_captureCheque"));
				mobileAction.verifyTextEquality(frontChequeText.getText(),
						mobileAction.getAppString("mobiledeposit_depositcheque_str_front"));
				mobileAction.verifyTextEquality(backChequeText.getText(),
						mobileAction.getAppString("mobiledeposit_depositcheque_str_back"));
				mobileAction.verifyTextEquality(continueButtonChequeForm.getText(),
						mobileAction.getAppString("mobiledeposit_depositcheque_str_continue"));

				if (!dailyLimitMsg.getText()
						.contains(mobileAction.getAppString("mobiledeposit_depositcheque_str_DailyLimit"))
						|| !thirtyDayLimitMsg.getText()
								.contains(mobileAction.getAppString("mobiledeposit_depositcheque_str_30DayLimit"))) {
					throw new NoSuchElementException("Text not found");
				}
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("MobileDeposit_DepositCheque_Header") + "']",
						"Deposit Cheque");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("MRDC_RECEIPTS_DETAILS_ACCOUNT_TO_ACCOUNT") + "']",
						"To Account");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MobileDepositCheque_Account_Hint") + "']", "hint");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MobileDepositCheque_Amount_Label") + "']", "Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("mobile_deposit_cheque_limit_header_1") + "']",
						"daily limit");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("mobile_deposit_cheque_limit_header_2") + "']",
						"30 day limit");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MobileDepositCheque_Memo_Label") + "']", "Memo");
				mobileAction.verifyElementUsingXPath("//android.widget.EditText[@text='"
						+ mobileAction.getAppString("MobileDepositCheque_Memo_Hint").replace("&amp;", "&") + "']",
						"Memo hint");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("MobileDepositCheque_Cheque_Front_Label") + "']",
						"Capture Cheque");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MRDC_MOBILE_DEPOSIT_CHEQUE_FRONT") + "']", "Front");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MRDC_MOBILE_DEPOSIT_CHEQUE_BACK") + "']", "Back");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='"
						+ mobileAction.getAppString("MobileDepositCheque_Continue_Button") + "']", "Continue");
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

	/**
	 * This method will verify text within elements for the mobile deposit
	 * options page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyOptionsTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(dpstCheque_Btn.getText(),
						mobileAction.getAppString("mobiledeposit_successfeature_str_depositacheque"));
				mobileAction.verifyTextEquality(dpstCheque_btn_desc.getText(),
						mobileAction.getAppString("mobiledeposit_successfeature_str_depositacheque_detailText"));
				mobileAction.verifyTextEquality(chequeHistoryButton.getText(),
						mobileAction.getAppString("mobiledeposit_introfeature_str_mobileDepositHistory"));
				mobileAction.verifyTextEquality(chequeHistoryButtonDesc.getText(),
						mobileAction.getAppString("mobiledeposit_successfeature_str_depositreceipts_detailText"));
			} else {
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("ActionBar_MobileDeposit") + "']",
								"Mobile Deposit");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("MobileDeposit_DepositCheque_Header") + "']",
						"Deposit Cheque");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction
								.getAppString("MobileDeposit_DepositCheque_Description").replaceAll("\"", "") + "']",
						"Take a photo message");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("ActionBar_MobileDepositReceipt") + "']",
						"Mobile Deposit History");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MobileDeposit_Receipt_Description").replaceAll("\"", "") + "']",
						"View a recent message");
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

	/**
	 * This method will verify text within elements for the mobile deposit
	 * options page for ineligible customers
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyIneligibleTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
								+ mobileAction.getAppString("mobiledeposit_depositreciept_header") + "']",
						"Mobile Deposit");

				final String xPathLocate = "//XCUIElementTypeButton[@label='"
						+ mobileAction.getAppString("MRDC_DEPOSITCHEQUE_INVALID_ACCOUNT_HYPERLINK2") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathLocate, false, 2, "up");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='"
								+ mobileAction.getAppString("MRDC_DEPOSITCHEQUE_INVALID_ACCOUNT_HYPERLINK1") + "']",
						"Call Us");
				mobileAction.verifyElementUsingXPath(xPathLocate, "Locate a branch");
			} else {
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("ActionBar_MobileDeposit") + "']",
								"Mobile Deposit");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text=\""
								+ mobileAction.getAppString("MRDC_DECLINED_HEADER").replaceAll("\"", "") + "\"]",
						"We're sorry");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text=\""
								+ mobileAction.getAppString("MRDC_DECLINED_SUB_HEADER").replaceAll("\"", "") + "\"]",
						"You're not eligible");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text=\"" + mobileAction
								.getAppString("MRDC_DECLINED_SCREEN_MESSAGE_HEAD_LINE").replaceAll("\"", "") + "\"]",
						"To deposit a cheque");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MRDC_DECLINED_SCREEN_MESSAGE_LINE_2").replaceAll("\"", "") + "']",
						"Have at least");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MRDC_DECLINED_SCREEN_MESSAGE_LINE_3").replaceAll("\"", "") + "']",
						"To make a deposit");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MRDC_DECLINED_SCREEN_MESSAGE_LINE_4").replaceAll("\"", "") + "']",
						"If you have questions");
				final String xPathLocate = "//android.widget.Button[@text='"
						+ mobileAction.getAppString("MRDC_Not_Eligibility_FIND_LOCATION") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathLocate, false, 2, "up");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='"
								+ mobileAction.getAppString("MRDC_MOBILE_DEPOSIT_CHEQUE_SUCCESS_CALL_US") + "']",
						"Call Us");
				mobileAction.verifyElementUsingXPath(xPathLocate, "Locate a branch");
			}
		} catch (Exception e) {
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

	/**
	 * This method will verify text within elements for the mobile deposit
	 * cheque history details page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyChequeDetailsTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				MobileElement chequeToSelect = mobileAction.verifyElementUsingXPath("//XCUIElementTypeCell[1]",
						"Cheque to Select");
				chequeToSelect.click();
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("mobiledeposit_introfeature_str_mobileDepositHistory") + "']",
						"Mobile Deposit History");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='DEPOSIT_RECEIPTS_DETAIL_ACCOUNT' and @label='"
								+ mobileAction.getAppString("mobiledeposit_depositcheque_str_history_toaccount") + "']",
						"To Account");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='DEPOSIT_RECEIPTS_DETAIL_AMOUNT' and @label='"
								+ mobileAction.getAppString("mobiledeposit_depositcheque_str_history_amount") + "']",
						"Amount");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='DEPOSIT_RECEIPTS_DETAIL_DATE' and @label='"
								+ mobileAction.getAppString("mobiledeposit_depositcheque_str_history_DateTime") + "']",
						"Date and time");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='DEPOSIT_RECEIPTS_DETAIL_DATE' and @label='"
								+ mobileAction.getAppString("mobiledeposit_depositcheque_str_history_DateTime") + "']",
						"Date and time");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='DEPOSIT_RECEIPTS_DETAIL_CHEQUE' and @label='"
								+ mobileAction.getAppString("mobiledeposit_depositcheque_str_chequefront") + "']",
						"Cheque Front");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
				// +
				// mobileAction.getAppString("mobiledeposit_depositreciept_viewAccountHistory")
				// + "']", "View acocunt history button");
			} else {
				MobileElement chequeToSelect = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/mobile_deposit_receipt_account_name' and @index='0']",
						"Cheque to Select");
				chequeToSelect.click();
				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("ActionBar_MobileDepositReceipt") + "']",
						"Mobile Deposit History");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("MRDC_RECEIPTS_DETAILS_ACCOUNT_TO_ACCOUNT") + "']",
						"To Account");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MobileDepositCheque_Amount_Label") + "']", "Amount");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
				// + mobileAction.getAppString("MobileDepositCheque_Memo_Label")
				// + "']", "Memo");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("MRDC_RECEIPTS_DETAILS_ACCOUNT_DATE").replace("&amp;", "&") + "']",
						"Date/Time Submitted");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("MRDC_RECEIPTS_DETAILS_ACCOUNT_CHEQUE_IMAGE") + "']",
						"Cheque Front");
				// mobileAction.verifyDateFormat(datePicker.getText(),
				// MobileAction2.TYPE_YYYY_MM_DD_HOUR);
				// FIXME: Uncomment when verified
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
				// + mobileAction.getAppString("MRDC_RECEIPTS_DETAILS_BUTTON") +
				// "']", "View in Account History");
			}
		} catch (Exception e) {
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
}
