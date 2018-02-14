package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/caret_view")
	private MobileElement view_payments_for;

	@iOSXCUITFindBy(accessibility = "actionSheetCancelButton")
	@AndroidFindBy(id = "com.td:id/dialog_button")
	private MobileElement cancel_button;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='actionSheetCancelButton']/../XCUIElementTypeStaticText")
	@AndroidFindBy(id = "com.td:id/dialog_title")
	private MobileElement view_payments_for_title;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/imgActionCheckMark']/..//android.widget.TextView[@resource-id='com.td:id/txtDescriptionValue']")
	private MobileElement all_payee_title;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell")
	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.td:id/scheduledPaymentsListView']/android.widget.RelativeLayout")
	private List<MobileElement> scheduled_Payments_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/recurrence']")
	private List<MobileElement> scheduled_Payments_recurrence_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtDescriptionValue']")
	private List<MobileElement> payee_filter_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='actionsheet_checkmark']/../XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/imgActionCheckMark']/..//android.widget.TextView[@resource-id='com.td:id/txtDescriptionValue']")
	private MobileElement default_payee_in_dropdown;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payment_name']")
	private List<MobileElement> payee_name_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable//XCUIElementTypeStaticText[contains(@label,'Any pre-authorized') or contains(@label,'Tout paiement préautorisé') or contains(@label,'定期付款列表不包括')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Any pre-authorized') or contains(@text,'Tout paiement préautorisé') or contains(@text,'定期付款列表不包括')]")
	private MobileElement paymentlist_foot;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/due_date']")
	private List<MobileElement> payments_date_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable")
	@AndroidFindBy(xpath = "//android.support.v4.widget.DrawerLayout[@resource-id='com.td:id/drawer_layout']")
	private MobileElement payments_layout;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/timestampContainer']/android.widget.TextView[@resource-id='com.td:id/custom_text']")
	private MobileElement month_grouping;

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

	public void verifyScheduledPaymentsHeader() {

		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(),
					getTextInCurrentLocale(StringArray.ARRAY_SCHEDULED_PAYMENTS_TITLE));

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
				mobileAction.verifyElementTextContains(lastPaymentAmt, amt);

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

				mobileAction.verifyElementIsDisplayed(lastPaymentTitle, "Last Payment Title");
				mobileAction.verifyElementIsDisplayed(lastPaymentDesc, "Last Payment Description");
				mobileAction.verifyElementIsDisplayed(lastPaymentAmt, "Last Payment Amt");

				/*
				 * mobileAction.verifyElementTextContains(lastPaymentTitle,
				 * toAccount);
				 * mobileAction.verifyElementTextContains(lastPaymentDesc,
				 * fromAccount); if (cal.get(Calendar.MINUTE) <= 1) { amt =
				 * amtLastHr; }
				 * mobileAction.verifyElementTextContains(lastPaymentAmt, amt);
				 */

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

	public void clickViewpaymentFor() {

		Decorator();
		try {

			mobileAction.FuncClick(view_payments_for, "'View Payments For' is clicked");

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

	public void verifyPayeeFilterContents() {

		Decorator();
		try {

			String expected_View_Payments = getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYEE_FILTER_VIEW_PAYMENT_FOR);
			String expected_cancel = getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYEE_FILTER_CANCEL_BUTTON);

			expected_View_Payments = expected_View_Payments.toUpperCase();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {				
				expected_cancel = expected_cancel.toUpperCase();
			}
			mobileAction.verifyElementTextIsDisplayed(view_payments_for_title, expected_View_Payments);
			mobileAction.verifyElementTextIsDisplayed(all_payee_title,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYEE_FILTER_ALL_PAYEE));
			mobileAction.verifyElementTextIsDisplayed(cancel_button, expected_cancel);

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

	public void verifyPayeeOrder() {

		Decorator();
		try {

			int size = payee_filter_List.size();
			String[] payeeName = new String[size - 1];
			for (int i = 1; i < size; i++) {
				payeeName[i - 1] = mobileAction.getValue(payee_filter_List.get(i));
			}
			String[] payeeName_clone = payeeName.clone();
			Arrays.sort(payeeName_clone);

			for (int i = 0; i < payeeName.length; i++) {
				if (!payeeName[i].equals(payeeName_clone[i])) {
					mobileAction.Report_Fail(
							"Payee Name is not sorted:" + payeeName[i] + ", sorted is:" + payeeName_clone[i]);
					return;
				}
			}
			mobileAction.Report_Pass_Verified("Payee names are sorted");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyDefaultPayeeFilter() {

		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(default_payee_in_dropdown,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYEE_FILTER_ALL_PAYEE));

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

	public void clickViewpaymentForSelectPayee() {

		Decorator();
		try {

			mobileAction.FuncClick(view_payments_for, "'View Payments For' is clicked");
			String payeeSelected = getTestdata("Payee");
			String payeeName = "";
			String payeeNo = "";

			if (payeeSelected == null || payeeSelected.trim().isEmpty()) {
				int size = payee_filter_List.size();
				if (size <= 1) {
					System.out.println("No payee filter in dropdown");
					mobileAction.Report_Fail("No payee selected");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					return;
				}
				int randNum = getRandomInRange(1, size - 1);
				payeeSelected = mobileAction.getValue(payee_filter_List.get(randNum));
				mobileAction.FuncClick(payee_filter_List.get(randNum), payeeSelected);
				CL.getTestDataInstance().TCParameters.put("Payee", payeeSelected);
			} else {
				if (payeeSelected.matches(".*\\•{4}\\s{1}\\d{4}")) {
					payeeNo = mobileAction.FuncGetValByRegx(payeeSelected, "\\•{4}\\s{1}\\d{4}");
					payeeName = payeeSelected.replace(payeeNo, "").trim();
				} else if (payeeSelected.matches(".*\\d{4}")) {
					payeeNo = mobileAction.FuncGetValByRegx(payeeSelected, "\\d{4}");
					payeeName = payeeSelected.replace(payeeNo, "").trim();
				}

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					String payeeXpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]//XCUIElementTypeTable//XCUIElementTypeStaticText[@label='"
							+ payeeSelected + "']";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(payeeXpath, true, 3, "up");
				} else {
					String payeeXpath = "//android.widget.TextView[@text='" + payeeName
							+ "']/../android.widget.TextView[@text='" + payeeNo + "']";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(payeeXpath, true, 3, "up");
				}
				CL.getTestDataInstance().TCParameters.put("Payee", payeeName);
			}

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

	public void verifyListOfPaymentsAreWithSamePayee() {

		Decorator();
		String payeeNameExpected = CL.getTestDataInstance().TCParameters.get("Payee");
		if (payeeNameExpected.matches(".*\\•{4}\\s?\\d{4}")) {
			String payeeNum = mobileAction.FuncGetValByRegx(payeeNameExpected, "\\•{4}\\s?\\d{4}");
			payeeNameExpected = payeeNameExpected.replaceAll(payeeNum, "").trim();
		}

		String iosXpath = "//XCUIElementTypeStaticText[@label='" + payeeNameExpected + "']";
		System.out.println("payeeNameExpected:" + payeeNameExpected);
		int iCount=0;
		try {
			do {
				for (int i = 0; i < payee_name_List.size(); i++) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						try {
							MobileElement myPayee = payee_name_List.get(i).findElement(By.xpath(iosXpath));
						} catch (Exception e1) {
							System.out.println("Found Payee name is not the selected in cell[" + i + "]");
							mobileAction.Report_Fail("Found Payee name is not the selected in cell[" + i + "]");
							return;
						}

					} else {
						if (!mobileAction.verifyTextIsContained(payee_name_List.get(i), payeeNameExpected)) {
							System.out.println("Found Payee name is not the selected:"
									+ mobileAction.getValue(payee_name_List.get(i)));
							mobileAction.Report_Fail("Found Payee name is not the selected:"
									+ mobileAction.getValue(payee_name_List.get(i)));
							return;
						}
					}

				}
				if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
					break;
				} else {
					mobileAction.FuncSwipeOnce("up");
					iCount++;
				}
			} while (iCount <20);

			mobileAction.Report_Pass_Verified("All payee are:" + payeeNameExpected);

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyPaymentListByDate() {

		Decorator();
		String oriDate = "";
		String convertedDate = "";
		List<String> dateList = new ArrayList<String>();
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			int dateSize = payments_date_List.size();
			System.out.println("Date size:" + dateSize);
			String xpathExpression = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]";
			for (int i = 1; i < dateSize; i++) {
				// if(!mobileAction.verifyElementIsPresent(payments_date_List.get(i)))
				// {
				// mobileAction.FuncSwipeOneScreenWithInElement(payments_layout,"up");
				// payments_date_List =
				// CL.GetDriver().findElements(By.xpath(xpathExpression));
				// dateSize = payments_date_List.size();
				// }
				try {
					oriDate = mobileAction.getValue(payments_date_List.get(i));
					convertedDate = MyCalendar.get().dateConversion(oriDate);
					dateList.add(convertedDate);
				} catch (Exception e) {
					if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
						break;
					} else {
						mobileAction.FuncSwipeOneScreenWithInElement(payments_layout, "up");
						payments_date_List = CL.GetDriver().findElements(By.xpath(xpathExpression));
						// dateSize = payments_date_List.size();
						i--;
					}
				}
			}
		} else {
			try {
				do {
					for (int i = 0; i < payments_date_List.size(); i++) {
						oriDate = mobileAction.getValue(payments_date_List.get(i));
						convertedDate = MyCalendar.get().dateConversion(oriDate);
						dateList.add(convertedDate);
					}

					if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
						break;
					} else {
						mobileAction.FuncSwipeOneScreenWithInElement(payments_layout, "up");
					}
				} while (true);

				// mobileAction.Report_Pass_Verified("All payee are:"+
				// payeeNameExpected);

			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}

		List<String> sortedDateList = new ArrayList<String>(dateList);
		Collections.sort(sortedDateList);
		System.out.println("Total payments are:" + sortedDateList.size());
		for (int i = 0; i < sortedDateList.size(); i++) {
			if (!sortedDateList.get(i).equals(dateList.get(i))) {
				System.out.println("Date is not sorted:" + dateList.get(i));
				return;
			}
		}
		System.out.println("Pass:Date is sorted");

	}

	public void verifyScheduledPaymentsContent() {

		Decorator();
		boolean isScheduledPaymentFound = false;
		try {
			for (int i = 0; i < scheduled_Payments_List.size(); i++) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					List<MobileElement> staticTextItem = scheduled_Payments_List.get(i)
							.findElements(By.xpath("//XCUIElementTypeStaticText"));
					if (staticTextItem.size() == 5) {
						String paymentDate = staticTextItem.get(0).getText();
						mobileAction.Report_Pass_Verified("Payment date:" + paymentDate);

						String fromAccount = staticTextItem.get(1).getText();
						mobileAction.Report_Pass_Verified("From account:" + fromAccount);

						String frequency = staticTextItem.get(2).getText();
						mobileAction.Report_Pass_Verified("Recurring:" + frequency);

						String payeeAccount = staticTextItem.get(3).getText();
						mobileAction.Report_Pass_Verified("Payee:" + payeeAccount);

						String amountData = staticTextItem.get(4).getText();
						mobileAction.Report_Pass_Verified("Amount:" + amountData);
						isScheduledPaymentFound = true;
						break;
					}
				} else {
					List<MobileElement> staticTextItem = scheduled_Payments_List.get(i)
							.findElements(By.xpath("//android.widget.TextView"));
					if (staticTextItem.size() == 5) {
						String paymentDate = staticTextItem.get(3).getText();
						mobileAction.Report_Pass_Verified("Payment date:" + paymentDate);

						String fromAccount = staticTextItem.get(1).getText();
						mobileAction.Report_Pass_Verified("From account:" + fromAccount);

						String frequency = staticTextItem.get(4).getText();
						mobileAction.Report_Pass_Verified("Recurring:" + frequency);

						String payeeAccount = staticTextItem.get(0).getText();
						mobileAction.Report_Pass_Verified("Payee:" + payeeAccount);

						String amountData = staticTextItem.get(2).getText();
						mobileAction.Report_Pass_Verified("Amount:" + amountData);
						isScheduledPaymentFound = true;
						break;
					}
				}
			}
			if (isScheduledPaymentFound) {
				int swipecount = 0;
				while (!mobileAction.verifyElementIsPresent(paymentlist_foot) && swipecount < 20) {
					mobileAction.FuncSwipeOneScreenWithInElement(payments_layout, "up");
					swipecount++;
				}
				mobileAction.verifyElementTextIsDisplayed(paymentlist_foot,
						getTextInCurrentLocale(StringArray.ARRAY_RBP_SCHEDULED_PAYMENT_COPY_NOTE));
			} else {
				mobileAction.Report_Fail("Failed to verify payment contents");
			}
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyMonthGrouping() {

		Decorator();
		try {
			String monthGroupText = mobileAction.getValue(month_grouping);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (monthGroupText.matches(".*\\s{1}\\d{4}")) {
					String monthInGroup = monthGroupText.split(" ")[0];
					if (MyCalendar.get().monthSet.contains(monthInGroup.toLowerCase())) {
						mobileAction.Report_Pass_Verified("Month grouped in " + monthInGroup);
					} else {
						mobileAction.Report_Fail("Failed to month group:" + monthInGroup);
					}
				} else {
					mobileAction.Report_Fail("Wrong format of month group:" + monthGroupText);
				}
			} else {
				if (monthGroupText.matches("\\d{4}\\-\\d{2}")) {
					String monthInGroup = monthGroupText.split("\\-")[1];
					int month_int = Integer.parseInt(monthInGroup);
					if (month_int > 0 && month_int < 13) {
						monthInGroup = MyCalendar.get().DigitToStr[month_int];
						if (MyCalendar.get().monthSet.contains(monthInGroup.toLowerCase())) {
							mobileAction.Report_Pass_Verified("Month grouped in " + monthInGroup);
						} else {
							mobileAction.Report_Fail("Failed to month group:" + monthInGroup);
						}
					} else {
						mobileAction.Report_Fail("Wrong format of month group:" + month_int);
					}

				} else {
					mobileAction.Report_Fail("Wrong format of month group:" + monthGroupText);
				}
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	private boolean checkDayFormat(String oriDate) {
		if (oriDate.matches("Today")) {
			return true;
		}

		if (oriDate.matches("Tomorrow")) {
			return true;
		}

		if (oriDate.matches("Due in \\d+ days")) {
			System.out.println("Date:" + oriDate);
			String days = mobileAction.FuncGetValByRegx(oriDate, "\\d+");
			int days_int = Integer.parseInt(days);
			if (days_int > 1 && days_int < 8) {
				return true;
			} else {
				System.out.print("Failed to verify 'Due in x days':" + days);
				return false;
			}
		}

		if (oriDate.matches(".*\\s{1}\\d{1,2},\\s{1}\\d{4}")) {
			return true;
		} else {
			System.out.print("Failed to verify format:" + oriDate);
			return false;
		}

	}

	public void verifyPaymentDue7Date() {

		Decorator();
		String oriDate = "";
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			int dateSize = payments_date_List.size();
			System.out.println("Date size:" + dateSize);
			String xpathExpression = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]";
			for (int i = 1; i < dateSize; i++) {

				try {
					oriDate = mobileAction.getValue(payments_date_List.get(i));
					if (!checkDayFormat(oriDate)) {
						mobileAction.Report_Fail("Failed to verify 'Due in 7 days'");
						return;
					}

				} catch (Exception e) {
					if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
						break;
					} else {
						mobileAction.FuncSwipeOneScreenWithInElement(payments_layout, "up");
						payments_date_List = CL.GetDriver().findElements(By.xpath(xpathExpression));
						// dateSize = payments_date_List.size();
						i--;
					}
				}
			}
		} else {
			try {
				do {
					for (int i = 0; i < payments_date_List.size(); i++) {
						oriDate = mobileAction.getValue(payments_date_List.get(i));
						if (!checkDayFormat(oriDate)) {
							mobileAction.Report_Fail("Failed to verify 'Due in 7 days'");
							return;
						}
					}

					if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
						break;
					} else {
						mobileAction.FuncSwipeOneScreenWithInElement(payments_layout, "up");
					}
				} while (true);

			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}

		System.out.println("Pass:Due date is verified");
		mobileAction.Report_Pass_Verified("Due in 7 days");

	}

	public void selectFirstPayment() {

		Decorator();
		try {
			int dateSize = scheduled_Payments_List.size();
			System.out.println("Date size:" + dateSize);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (dateSize > 1) {
					mobileAction.FuncClick(scheduled_Payments_List.get(1), "First Payment Clicked");
				} else {
					mobileAction.Report_Fail("No payment in list");
				}
			} else {
				if (dateSize > 0) {
					mobileAction.FuncClick(scheduled_Payments_List.get(0), "First Payment Clicked");
				} else {
					mobileAction.Report_Fail("No payment in list");
				}
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void selectFirstActivePayment() {

		Decorator();
		try {
			while (true) {
				int dateSize = scheduled_Payments_recurrence_List.size();
				System.out.println("Date size:" + dateSize);
				if (dateSize == 0) {

					if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
						mobileAction.Report_Fail("No active payment found");
						return;
					} else {
						mobileAction.FuncSwipeOnce("up");
					}

				} else {
					for (int i = 0; i < dateSize; i++) {
						try {
							String frencytext = "";
							if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
								frencytext = mobileAction.getValue(scheduled_Payments_List.get(i + 1)
										.findElement(By.xpath("//XCUIElementTypeStaticText[3]")));
							} else {

								frencytext = mobileAction.getValue(scheduled_Payments_recurrence_List.get(i));
							}
							System.out.println("recurrence:" + frencytext);

							if (!frencytext.matches(getTextInCurrentLocale(StringArray.ARRAY_RBP_CANCELLED_BILL))) {
								if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
									// MobileElement FirstActivePayment =
									// scheduled_Payments_recurrence_List.get(i).findElement(By.xpath("/../"));
									mobileAction.FuncClick(scheduled_Payments_List.get(i + 1), "First Active payment");
									return;
								} else {
									mobileAction.FuncClick(scheduled_Payments_recurrence_List.get(i),
											"First Active payment");
									return;
								}

							}
						} catch (Exception e1) {
							if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
								mobileAction.Report_Fail("No active payment found");
								return;
							} else {
								mobileAction.FuncSwipeOnce("up");
							}
						}
					}
				}

				if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
					mobileAction.Report_Fail("No active payment found");
					return;
				} else {
					mobileAction.FuncSwipeOnce("up");
				}

			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void selectFirstCancelledPayment() {

		Decorator();
		try {
			while (true) {
				int dateSize = scheduled_Payments_recurrence_List.size();
				System.out.println("Date size:" + dateSize);
				if (dateSize == 0) {

					if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
						mobileAction.Report_Fail("No active payment found");
						return;
					} else {
						mobileAction.FuncSwipeOnce("up");
					}

				} else {
					for (int i = 0; i < dateSize; i++) {
						try {
							String frencytext = "";
							if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
								frencytext = mobileAction.getValue(scheduled_Payments_List.get(i + 1)
										.findElement(By.xpath("//XCUIElementTypeStaticText[3]")));
							} else {

								frencytext = mobileAction.getValue(scheduled_Payments_recurrence_List.get(i));
							}
							System.out.println("recurrence:" + frencytext);

							if (frencytext.matches(getTextInCurrentLocale(StringArray.ARRAY_RBP_CANCELLED_BILL))) {
								if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
									// MobileElement FirstActivePayment =
									// scheduled_Payments_recurrence_List.get(i).findElement(By.xpath("/../"));
									mobileAction.FuncClick(scheduled_Payments_List.get(i + 1),
											"First Cancelled payment");
									return;
								} else {
									mobileAction.FuncClick(scheduled_Payments_recurrence_List.get(i),
											"First Cancelled payment");
									return;
								}

							}
						} catch (Exception e1) {
							if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
								mobileAction.Report_Fail("No active payment found");
								return;
							} else {
								mobileAction.FuncSwipeOnce("up");
							}
						}
					}
				}

				if (mobileAction.verifyElementIsPresent(paymentlist_foot)) {
					mobileAction.Report_Fail("No Cancelled payment found");
					return;
				} else {
					mobileAction.FuncSwipeOnce("up");
				}

			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
