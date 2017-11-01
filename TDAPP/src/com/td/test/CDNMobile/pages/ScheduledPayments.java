package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ScheduledPayments extends _CommonPage {
	private static ScheduledPayments scheduledPayments;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mainText'][1]")
	private MobileElement firstPayment;

	@iOSXCUITFindBy(accessibility = "ENHANCED_RECEIPT_BUTTON")
	@AndroidFindBy(id = "com.td:id/cancelBtn")
	private MobileElement cancelPaymentBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement cancelPaymentDialogYesBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	private MobileElement cancelPaymentDialogYesBtnFR;

	public synchronized static ScheduledPayments get() {
		if (scheduledPayments == null) {
			scheduledPayments = new ScheduledPayments();
		}
		return scheduledPayments;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);
	}

	public void cancelLastPayment() {
		Decorator();
		try {
			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Scheduled Payments");

			String lastPaymentTitleXpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				Calendar cal = Calendar.getInstance();
				String amt = String.valueOf(cal.get(Calendar.MONTH) + cal.get(Calendar.DATE)) + "."
						+ String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
				lastPaymentTitleXpath = "//android.widget.TextView[@resource-id='com.td:id/amountText' and contains(@text,'"
						+ amt + "')]";

			} else {
				String paymentCell = "//XCUIElementTypeTable[1]/XCUIElementTypeCell";
				List<MobileElement> paymentList = (List<MobileElement>) mobileAction.getElementsList(paymentCell);

				int lastPaymentIndex = paymentList.size() - 1;
				lastPaymentTitleXpath = "//XCUIElementTypeStaticText[@name='UPCOMING_BILLS_DETAIL_TITLE_0"
						+ lastPaymentIndex + "']";
			}
			mobileAction.swipeAndSearchByxpath(lastPaymentTitleXpath, true, 10, "Up");
			mobileAction.FuncClick(cancelPaymentBtn, "Cancel Payment Button");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
					&& currentLocale.equalsIgnoreCase("fr")) {
				cancelPaymentDialogYesBtn = cancelPaymentDialogYesBtnFR;
			}
			mobileAction.FuncClick(cancelPaymentDialogYesBtn, "Cancel Payment Dialog Yes Button");
			mobileAction.verifyElementIsPresent(PageHeader.get().getProgressBar());

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

	public void verifyScheduledPayments() {
		Decorator();
		try {

			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Scheduled Payments");

			String fromAccount = getTestdata("FromAccount");
			String toAccount = getTestdata("ToAccount");
			Calendar cal = Calendar.getInstance();
			String amt = String.valueOf(cal.get(Calendar.MONTH) + 1 + cal.get(Calendar.DATE)) + "."
					+ String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
			String amtLastHr = String.valueOf(cal.get(Calendar.MONTH) + 1 + cal.get(Calendar.DATE)) + "."
					+ String.valueOf(cal.get(Calendar.HOUR_OF_DAY) - 1);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				String paymentDescription = "";
				if (cal.get(Calendar.MINUTE) > 1) {
					paymentDescription = "//android.widget.TextView[@resource-id='com.td:id/amountText' and contains(@text,'"
							+ amt + "')]";
				} else {
					paymentDescription = "//android.widget.TextView[@resource-id='com.td:id/amountText' and contains(@text,'"
							+ amtLastHr + "')]";
				}
				mobileAction.swipeAndSearchByxpath(paymentDescription, false, 10, "Up");

			} else {
				String paymentCell = "//XCUIElementTypeTable[1]/XCUIElementTypeCell";
				List<MobileElement> paymentList = (List<MobileElement>) mobileAction.getElementsList(paymentCell);

				int lastPaymentIndex = paymentList.size();
				String lastPaymentTitleXpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[" + (lastPaymentIndex)
						+ "]/XCUIElementTypeStaticText[1]";
				String lastPaymentDescXpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[" + (lastPaymentIndex)
						+ "]/XCUIElementTypeStaticText[2]";
				String lastPaymentAmtXpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[" + (lastPaymentIndex)
						+ "]/XCUIElementTypeStaticText[3]";

				mobileAction.swipeAndSearchByxpath(lastPaymentTitleXpath, false, 10, "Up");
				MobileElement lastPaymentTitle = mobileAction.verifyElementUsingXPath(lastPaymentTitleXpath,
						"Last Payment Title");
				mobileAction.verifyElementTextContains(lastPaymentTitle, toAccount);
				MobileElement lastPaymentDesc = mobileAction.verifyElementUsingXPath(lastPaymentDescXpath,
						"Last Payment Description");
				mobileAction.verifyElementTextContains(lastPaymentDesc, fromAccount);
				MobileElement lastPaymentAmt = mobileAction.verifyElementUsingXPath(lastPaymentAmtXpath,
						"Last Payment Amt");
				if (cal.get(Calendar.MINUTE) > 1) {
					mobileAction.verifyElementTextContains(lastPaymentAmt, amt);
				} else {
					mobileAction.verifyElementTextContains(lastPaymentAmt, amtLastHr);
				}

			}

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
