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

	@iOSXCUITFindBy(accessibility = "ENHANCED_RECEIPT_MESSAGE")
	@AndroidFindBy(id = "com.td:id/upcomingbill_status_value")
	private MobileElement billStatusCB;

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
			boolean canCancel = false;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				for (int j = 0; j < 5; j++) {

					String paymentCell = "//android.widget.TextView[@resource-id='com.td:id/secondaryText']";
					List<MobileElement> paymentList = (List<MobileElement>) mobileAction.getElementsList(paymentCell);
					for (int i = paymentList.size(); i > 0; i--) {

						for (int k = 0; k < j; k++) {
							mobileAction.FunctionSwipe("up", 2000, 0);
						}

						lastPaymentTitleXpath = "(" + paymentCell + ")" + "[" + (i) + "]";
						MobileElement lastPaymentCell = mobileAction.verifyElementUsingXPath(lastPaymentTitleXpath,
								"Last Payment Cell");
						mobileAction.FuncClick(lastPaymentCell, "Last Payment Cell");

						boolean notCancelled = mobileAction.verifyElementIsPresent(cancelPaymentBtn);
						if (notCancelled) {
							mobileAction.verifyElementIsDisplayed(billStatusCB, "Bill Status");
							mobileAction.verifyElementTextContains(billStatusCB,
									this.getTextInCurrentLocale(StringArray.ARRAY_PENDINGBILL));

							mobileAction.FuncClick(cancelPaymentBtn, "Cancel Payment Button");
							canCancel = true;
							break;
						} else {
							mobileAction.ClickBackButton();
							mobileAction.sleep(1000);
						}
					}

					if (canCancel) {
						break;
					}
				}

			} else {
				String paymentCell = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell";
				List<MobileElement> paymentList = (List<MobileElement>) mobileAction.getElementsList(paymentCell);

				for (int i = paymentList.size(); i > 0; i--) {
					lastPaymentTitleXpath = paymentCell + "[" + (i) + "]";
					mobileAction.swipeAndSearchByxpath(lastPaymentTitleXpath, true, 5, "Up");
					boolean notCancelled = mobileAction.verifyElementIsPresent(cancelPaymentBtn);
					if (notCancelled) {

						mobileAction.verifyElementIsDisplayed(billStatusCB, "Bill Status");
						mobileAction.verifyElementTextContains(billStatusCB,
								this.getTextInCurrentLocale(StringArray.ARRAY_ACTIVEBILL));

						mobileAction.FuncClick(cancelPaymentBtn, "Cancel Payment Button");
						canCancel = true;
						break;
					} else {
						mobileAction.ClickBackButton();
					}
				}

			}

			if (canCancel) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& currentLocale.equalsIgnoreCase("fr")) {
					cancelPaymentDialogYesBtn = cancelPaymentDialogYesBtnFR;
				}
				mobileAction.FuncClick(cancelPaymentDialogYesBtn, "Cancel Payment Dialog Yes Button");
				mobileAction.waitProgressBarVanish();
			} else {
				mobileAction.GetReporting().FuncReport("Fail", "All scheduled payments already cancelled");
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
				if (cal.get(Calendar.MINUTE) <= 1) {
					amt = amtLastHr;
				}
				String paymentDescription = "//android.widget.TextView[@resource-id='com.td:id/amountText' and contains(@text,'"
						+ amt + "')]";
				mobileAction.swipeAndSearchByxpath(paymentDescription, false, 10, "Up");
				MobileElement lastPaymentAmt = mobileAction.verifyElementUsingXPath(paymentDescription,
						"Last Payment Amt");

				if (lastPaymentAmt.getText().contains(amt)) {
					mobileAction.verifyElementTextContains(lastPaymentAmt, amt);
				} else {
					mobileAction.verifyElementTextContains(lastPaymentAmt, amtLastHr);
				}

			} else {
				// Full path to each cell
				String paymentCell = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell";
				List<MobileElement> paymentList = (List<MobileElement>) mobileAction.getElementsList(paymentCell);

				int lastPaymentIndex = paymentList.size();
				String lastPaymentTitleXpath = paymentCell + "[" + (lastPaymentIndex)
						+ "]/XCUIElementTypeStaticText[1]";
				String lastPaymentDescXpath = paymentCell + "[" + (lastPaymentIndex) + "]/XCUIElementTypeStaticText[2]";
				String lastPaymentAmtXpath = paymentCell + "[" + (lastPaymentIndex) + "]/XCUIElementTypeStaticText[3]";

				System.out.println(lastPaymentAmtXpath);
				mobileAction.swipeAndSearchByxpath(lastPaymentTitleXpath, false, 10, "Up");
				MobileElement lastPaymentTitle = mobileAction.verifyElementUsingXPath(lastPaymentTitleXpath,
						"Last Payment Title");
				MobileElement lastPaymentDesc = mobileAction.verifyElementUsingXPath(lastPaymentDescXpath,
						"Last Payment Description");
				MobileElement lastPaymentAmt = mobileAction.verifyElementUsingXPath(lastPaymentAmtXpath,
						"Last Payment Amt");

				String payeeName = getTestdata("USAccount").toUpperCase();
				mobileAction.verifyElementTextContains(lastPaymentTitle, payeeName);
				mobileAction.verifyElementTextContains(lastPaymentTitle, toAccount);
				mobileAction.verifyElementTextContains(lastPaymentDesc, fromAccount);
				if (lastPaymentAmt.getText().contains(amt)) {
					mobileAction.verifyElementTextContains(lastPaymentAmt, amt);
				} else {
					mobileAction.verifyElementTextContains(lastPaymentAmt, amtLastHr);
				}
				mobileAction.verifyElementTextContains(lastPaymentAmt, amt);

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
