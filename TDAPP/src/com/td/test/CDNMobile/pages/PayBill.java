package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PayBill extends _CommonPage {

	private static PayBill PayBill;

	@iOSXCUITFindBy(accessibility = "PAYBILL_VIEW_PAYEE")
	@AndroidFindBy(id = "com.td:id/rowPayee")
	private MobileElement to_account_post;

	@iOSXCUITFindBy(accessibility = "PAYBILL_VIEW_FROM")
	@AndroidFindBy(id = "com.td:id/rowFromAccount")
	private MobileElement from_account;

	@iOSXCUITFindBy(accessibility = "PAYBILL_VIEW_DATE_VALUE")
	@AndroidFindBy(id = "com.td:id/edtDate")
	private MobileElement dateValue;

	@iOSXCUITFindBy(accessibility = "PAYUSBILL_VIEW_FROM")
	@AndroidFindBy(id = "com.td:id/from_account_name")
	private MobileElement fromAccountUS;

	@iOSXCUITFindBy(accessibility = "PAYUSBILL_VIEW_PAYEE")
	@AndroidFindBy(id = "com.td:id/payee_name")
	private MobileElement toAccountUS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]//XCUIElementTypeTextField[1]")
	@AndroidFindBy(id = "com.td:id/amount")
	private MobileElement amountUS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]//XCUIElementTypeTextField[1]")
	@AndroidFindBy(id = "com.td:id/edtAmt")
	private MobileElement amount;

	@iOSXCUITFindBy(accessibility = "PAYBILL_VIEW_CONTINUE")
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement continue_pay;

	@iOSXCUITFindBy(accessibility = "PAYBILL_CONFIRMVIEW_CONTINUE")
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement pay_bill;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='2']")
	private MobileElement nextMonthButton;

	@AndroidFindBy(xpath = "Dynamic")
	private MobileElement nextDate;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
	private MobileElement calendarGrid;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeTable[1]//XCUIElementTypeTextField[1])[2]")
	@AndroidFindBy(id = "com.td:id/reason_for_payment")
	private MobileElement reasonField;

	@iOSXCUITFindBy(xpath = "//*[@name='PAYUSBILL_VIEW_CONTINUE' or @name='PAYUSBILL_CONFIRM_PAYBILL']")
	@AndroidFindBy(id = "com.td:id/button_footer")
	private MobileElement payUSbillButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(id = "com.td:id/txtAccountNumber")
	private MobileElement fromAcctNum;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	private MobileElement payeeAcctNum;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']/android.widget.LinearLayout[@index='0']")
	private MobileElement firstAcct;

	public synchronized static PayBill get() {
		if (PayBill == null) {
			PayBill = new PayBill();
		}
		return PayBill;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);

	}

	public void payBill() {
		Decorator();
		try {

			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Pay Bill");

			String specificAccts = getTestdata("Description");
			if (specificAccts.equalsIgnoreCase("specified")) {
				// Use specific accts
				String fromAccount = getTestdata("FromAccount");
				String fromAccountXpath = "";
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
					fromAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
							+ fromAccount + "']";

				} else {
					fromAccountXpath = "//XCUIElementTypeStaticText[contains(@label,'" + fromAccount + "')]";
				}
				mobileAction.FuncClick(from_account, "From Account field");
				mobileAction.swipeAndSearchByxpath(fromAccountXpath, true, 10, "Up");

			} else {
				// Use first acct
				mobileAction.FuncClick(from_account, "From Account field");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
					String acctNum = mobileAction.FuncGetText(fromAcctNum);
					CL.getTestDataInstance().TCParameters.put("FromAccount", acctNum);
				}

				mobileAction.FuncClick(firstAcct, "1st Account in List");

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String acctNum = mobileAction.FuncGetText(fromAcctNum);
				CL.getTestDataInstance().TCParameters.put("FromAccount", acctNum);
			}

			// Android - Payee field is not enabled if it's already populated
			// iOS - Payee field is enabled but empty payee list
			boolean hasPayee = mobileAction.verifyElementIsPresent(payeeAcctNum);
			if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")
					&& to_account_post.isEnabled())
					|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios") && !hasPayee)) {

				if (specificAccts.equalsIgnoreCase("specified")) {
					// Use specific accts
					String toAccount = getTestdata("ToAccount");
					String toAccountXpath = "";
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
						toAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee' and contains(@text,'"
								+ toAccount + "')]";

					} else {
						toAccountXpath = "//XCUIElementTypeStaticText[contains(@label,'" + toAccount + "')]";
					}
					mobileAction.FuncClick(to_account_post, "Select Payee field");
					mobileAction.swipeAndSearchByxpath(toAccountXpath, true, 10, "Up");

				} else {
					// Use first acct
					mobileAction.FuncClick(to_account_post, "Select Payee field");
					mobileAction.FuncClick(firstAcct, "1st Account in List");
					mobileAction.sleep(2000);

				}
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String acctNum = mobileAction.FuncGetText(payeeAcctNum);
				CL.getTestDataInstance().TCParameters.put("ToAccount", acctNum);
			}

			String amt = getTestdata("Amount");
			mobileAction.FuncClick(amount, "Amount button clicked");
			mobileAction.FuncSendKeys(amount, amt);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(continue_pay, "Continue_pay");
			mobileAction.FuncClick(pay_bill, "Pay Bill");

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

	public void payUSBill() {
		Decorator();
		try {
			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Pay Bill");

			mobileAction.FuncClick(fromAccountUS, "From Account field");
			mobileAction.FuncClick(firstAcct, "1st Account in List");

			mobileAction.FuncClick(toAccountUS, "Select Payee field");
			mobileAction.FuncClick(firstAcct, "1st Account in List");

			String amt = getTestdata("Amount");
			mobileAction.FuncClick(amountUS, "Amount button clicked");
			mobileAction.FuncSendKeys(amountUS, amt);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}

			String reason = getTestdata("Reason");
			mobileAction.FuncClick(reasonField, "Reason field clicked");
			mobileAction.FuncSendKeys(reasonField, reason);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(payUSbillButton, "Continue_pay");
			mobileAction.FuncClick(payUSbillButton, "Pay Bill");

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

	public void payFutureBill() {
		Decorator();
		try {

			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Pay Bill");

			mobileAction.FuncClick(from_account, "From Account field");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				String acctNum = mobileAction.FuncGetText(fromAcctNum);
				CL.getTestDataInstance().TCParameters.put("FromAccount", acctNum);
				mobileAction.FuncClick(firstAcct, "1st Account in List");
			} else {
				mobileAction.FuncClick(firstAcct, "1st Account in List");
				String acctNum = mobileAction.FuncGetText(fromAcctNum);
				CL.getTestDataInstance().TCParameters.put("FromAccount", acctNum);
			}

			// Android - Payee field is not enabled if it's already populated
			// iOS - Payee field is enabled but empty payee list
			boolean hasPayee = mobileAction.verifyElementIsPresent(payeeAcctNum);
			if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")
					&& to_account_post.isEnabled())
					|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios") && !hasPayee)) {

				mobileAction.FuncClick(to_account_post, "Select Payee field");
				mobileAction.FuncClick(firstAcct, "1st Account in List");
				mobileAction.sleep(2000);

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String acctNum = mobileAction.FuncGetText(payeeAcctNum);
				CL.getTestDataInstance().TCParameters.put("ToAccount", acctNum);
			}

			String amt = getTestdata("Amount");
			mobileAction.FuncClick(amount, "Amount button clicked");
			mobileAction.FuncSendKeys(amount, amt);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(dateValue, "Date Selector clicked");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				// Select 1st of next month as future payment date
				mobileAction.FuncClick(nextMonthButton, "Calendar Next Month clicked");
				int nextWeekDay = getNextWeekDate();
				nextDate = mobileAction.verifyElementUsingXPath(
						"//android.view.View[@content-desc='" + nextWeekDay + "']", "Next Week Day Calendar button");
				mobileAction.FuncClick(nextDate, "Next Date clicked");
			} else {
				// Click midpoint in next month calendar grid
				mobileAction.FuncClick(nextMonthButton, "Calendar Next Month clicked");
				Point midPoint = calendarGrid.getCenter();
				mobileAction.TapCoOrdinates(midPoint.getX(), midPoint.getY(), "Calendar midpoint");
			}

			mobileAction.FuncClick(continue_pay, "Continue_pay");
			mobileAction.FuncClick(pay_bill, "Pay Bill");
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

	private int getNextWeekDate() {
		int date = 1;
		Calendar cal = Calendar.getInstance();
		int currentMonth = cal.get(Calendar.MONTH);
		int currentYear = cal.get(Calendar.YEAR);

		cal.set(currentYear, currentMonth + 1, date);

		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			date += 2;
		} else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			date += 1;
		}

		return date;
	}

}
