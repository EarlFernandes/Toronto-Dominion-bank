package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
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

public class Receipt extends _CommonPage {
	private static Receipt Receipt;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement receiptHeader;

	@iOSFindBy(accessibility = "QUICKACCESS_CELL_MENU_ICON_HOME")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='GO BACK HOME']")
	private MobileElement homeBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmationNo;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'REWARDS REDEMPTION')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='REWARDS REDEMPTION']")
	private MobileElement from_PayWithRewards;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'To')]/../XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='To']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@resource-id='com.td:id/item_row_subvalue']")
	private MobileElement payeeAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Amount')]/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'$')]")
	private MobileElement paymentAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Amount')]/../XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'TD Points')]")
	private MobileElement redeemedPoints;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Date')]/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@resource-id='com.td:id/item_row_value_main']")
	private MobileElement date;

	@iOSFindBy(accessibility = "QUICKACCESS_CELL_MENU_ICON_ACCOUNTS")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='VIEW MY ACCOUNTS']")
	private MobileElement viewMyAccounts_Btn;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/thank_you']")
	private MobileElement subheader_thanksyou;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message']")
	private MobileElement reply_message;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[12]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/footer_txt_note']")
	private MobileElement foot_note;

	@AndroidFindBy(id = "com.td:id/thank_you")
	private MobileElement thankYouTitle;

	@AndroidFindBy(id = "com.td:id/confirmation_val")
	private MobileElement cnfrDetail;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/from_account_bal")
	private MobileElement fromAccountValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/to_account_bal")
	private MobileElement ToAccountValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2] | "
			+ "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/amount_val")
	private MobileElement amountValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/amount_val")
	private MobileElement amountValueCB;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/payee_val")
	private MobileElement payeeValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/date_val")
	private MobileElement dateValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/date_val")
	private MobileElement dateValueCB;

	@iOSXCUITFindBy(accessibility = "QUICKACCESS_CELL_UPCOMINGBILLS_OFF")
	@AndroidFindBy(id = "com.td:id/upcomingbills")
	private MobileElement scheduledPaymentsBtn;

	@iOSXCUITFindBy(xpath = "//*[@name='QUICKACCESS_CELL_BACKHOME_ON' or @name='QUICKACCESS_CELL_QUICKLINKS_BACKHOME_ON']")
	@AndroidFindBy(id = "com.td:id/home")
	private MobileElement goBackHomeButton;

	@iOSXCUITFindBy(accessibility = "QUICKACCESS_CELL_QUICKLINKS_TRANSFER")
	@AndroidFindBy(id = "com.td:id/transfers_make_another")
	private MobileElement makeAnthTran_Button;

	@AndroidFindBy(id = "com.td:id/confirmation_no")
	private MobileElement confirmNumberUS;

	@iOSXCUITFindBy(accessibility = "COMMON_RECEIPT_CELL_TITLE_0")
	@AndroidFindBy(id = "com.td:id/account_name")
	private MobileElement fromAccountUS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/amount")
	private MobileElement fromAccountValueUS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/payee_details")
	private MobileElement payeeDetailsUS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/confirm_amount")
	private MobileElement amountValueUS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/total_amount")
	private MobileElement amountTotalValueUS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/reason_for_payment")
	private MobileElement paymentReasonUS;

	@iOSXCUITFindBy(accessibility = "automation_title_0")
	@AndroidFindBy(id = "com.td:id/thank_you_label")
	private MobileElement thankYouTitleUS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]//XCUIElementTypeLink[1]")
	@AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.view.View")
	private MobileElement bannerImage;

	@iOSXCUITFindBy(accessibility = "RECEIPTHEADER_CONFIRM")
	@AndroidFindBy(id = "com.td:id/confirmation_val")
	private MobileElement cnfrDetailRewards;

	public synchronized static Receipt get() {
		if (Receipt == null) {
			Receipt = new Receipt();
		}
		return Receipt;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);

	}

	public void verifyReceiptHeader() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(receiptHeader, "Cancel Button");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyAmountRedeemed() {
		Decorator();
		try {
			mobileAction.FuncClick(homeBtn, "Go Back Home Button");
			HomeScreen.get().clickAccountsTab();
			Accounts.get().verifyAccountsPage();
			Accounts.get().selectAccountInAccountSheet();

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public boolean verifyCurrentDate() {
		Decorator();
		String dt = "";
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd,yyyy"); //
		dt = mobileAction.getValue(date);
		// if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
		// dt = date.getAttribute("label");//"Apr 21,2017";
		// }else{
		// dt = date.getAttribute("text");
		// }
		Date d = null;
		Date d1 = null;
		String today = new SimpleDateFormat("MMMM dd,yyyy").format(new Date());
		try {
			// System.out.println("expdate>> "+date);
			System.out.println("Date captured >> " + dt);
			System.out.println("today>> " + today + "\n\n");
			d = sdf.parse(dt);
			d1 = sdf.parse(today);
			if (d1.compareTo(d) == 0) {// not expired
				System.out.println("true");
				return true;
			} else {
				System.out.println("false");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void verifyRedemptionDetails() {
		Decorator();
		String payee = "";
		try {
			verifyReceiptHeader();
			mobileAction.verifyElementIsDisplayed(confirmationNo, "Confirmation Number");
			mobileAction.verifyElementIsDisplayed(from_PayWithRewards, "Pay With Rewards");
			mobileAction.verifyElementIsDisplayed(payeeAccount, "Payee Account");
			payee = mobileAction.getValue(payeeAccount);
			// if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
			// payee=payeeAccount.getAttribute("label");
			// }else{
			// payee=payeeAccount.getAttribute("text");
			// }

			String maskedCreditCardNo = payee.substring(0, 4);
			System.out.println("maskedCreditCardNo:" + maskedCreditCardNo);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyTextEquality(maskedCreditCardNo, ConstantClass.maskedValue_Android);
			} else {
				mobileAction.verifyTextEquality(maskedCreditCardNo, ConstantClass.maskedValue_iOS);
			}
			mobileAction.verifyElementTextContains(paymentAmount, ConstantClass.dollarSign);
			mobileAction.verifyElementTextContains(redeemedPoints, ConstantClass.points);
			if (verifyCurrentDate()) {
				mobileAction.Report_Pass_Verified("Date");
			} else {
				mobileAction.Report_Fail("Fail: date is not verified");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void clickGoBackHomeBtn() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String homeBtnxpath = "//android.widget.Button[@text='"
						+ mobileAction.getAppString("quick_links_go_back_home") + "']";
				System.out.println("Go back home:" + homeBtnxpath);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(homeBtnxpath, true, 10, "up");

			} else {
				mobileAction.FuncSwipeWhileElementNotFound(homeBtn, true, 10, "up");
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

	public void clickViewMyAccountsBtn() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				String viewMyAccountXpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
						+ mobileAction.getAppString("feedback_quick_link_my_accounts") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(viewMyAccountXpath, true, 10, "up");

			} else {
				mobileAction.FuncSwipeWhileElementNotFound(viewMyAccounts_Btn, true, 10, "up");
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

	public void verifyConfirmationPageHeader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(receiptHeader,
					getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_HEADER));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_MF_THANKYOU);
				thankYouTitle = mobileAction.verifyElementUsingXPath("//*[@label='" + labelText + "']",
						"Thank You title");
			}
			mobileAction.verifyElementIsDisplayed(thankYouTitle, "Thank You title");
			mobileAction.verifyElementTextIsDisplayed(thankYouTitle,
					getTextInCurrentLocale(StringArray.ARRAY_MF_THANKYOU));

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

	public void VerifyReceiptDetailChineseContent() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(receiptHeader,
					getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_HEADER));
			mobileAction.verifyElementTextIsDisplayed(subheader_thanksyou,
					getTextInCurrentLocale(StringArray.ARRAY_MF_THANKYOU));
			mobileAction.verifyElementTextIsDisplayed(reply_message,
					getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_REPLY));
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String[] detailInfomation = { getTextInCurrentLocale(StringArray.ARRAY_MF_NEXT_HAPPEN),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_BEFORE3),
						getTextInCurrentLocale(StringArray.ARRAY_MF_CONTENT_BEFORE3),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_AFTER3),
						getTextInCurrentLocale(StringArray.ARRAY_MF_CONTENT_AFTER3),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_CONFIRM),
						getTextInCurrentLocale(StringArray.ARRAY_MF_CONFIRM_DESCRIPTION),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_DETAILS),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_DETAILS),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_REF_NUM),
						getTextInCurrentLocale(StringArray.ARRAY_MF_FUNDS),
						getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_REQUEST_TIME),
						getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT),
						getTextInCurrentLocale(StringArray.ARRAY_MF_TO_ACCOUNT)

				};
				List<MobileElement> detailList = ((MobileDriver) (CL.GetAppiumDriver())).findElementsByXPath(
						"//android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView");

				int size = detailList.size();
				if (size > detailInfomation.length) {
					System.out.println("Detail info is not completed, need double check");
					mobileAction.Report_Fail("Detail info doesn't match");
					return;
				}
				for (int i = 0; i < size; i++) {
					String textInfo = mobileAction.getValue(detailList.get(i));
					System.out.println("Text " + i + " " + textInfo);
					mobileAction.verifyTextEquality(textInfo, detailInfomation[i]);
				}
				mobileAction.FuncSwipeWhileElementNotFound(foot_note, false, 5, "up");
				if (currentLocale.equalsIgnoreCase("fr")) {
					mobileAction.FuncSwipeOnce("down");
				}
				detailList = ((MobileDriver) (CL.GetAppiumDriver())).findElementsByXPath(
						"//android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView");

				int size1 = detailList.size();
				if (size1 != detailInfomation.length - size) {
					System.out.println("Remaining info doesn't match");
					for (int i = 0; i < size1; i++) {
						String textInfo = mobileAction.getValue(detailList.get(i));
						System.out.println("Text " + i + " " + textInfo);
					}
					return;
				}
				for (int i = 1; i < size1; i++) {
					mobileAction.verifyElementTextIsDisplayed(detailList.get(i), detailInfomation[i + size]);
				}
			} else {
				List<MobileElement> detailList = ((MobileDriver) (CL.GetAppiumDriver()))
						.findElementsByXPath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText");
				String[] detailInfomation = { getTextInCurrentLocale(StringArray.ARRAY_MF_NEXT_HAPPEN),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_BEFORE3),
						getTextInCurrentLocale(StringArray.ARRAY_MF_CONTENT_BEFORE3),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_AFTER3),
						getTextInCurrentLocale(StringArray.ARRAY_MF_CONTENT_AFTER3),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_CONFIRM),
						getTextInCurrentLocale(StringArray.ARRAY_MF_CONFIRM_DESCRIPTION),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_DETAILS),
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_REF_NUM), "ignore",
						getTextInCurrentLocale(StringArray.ARRAY_MF_FUNDS), "ignore", "ignore",
						getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT), "ignore",
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_REQUEST_TIME), "ignore", "ignore",
						"ignore", getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT), "ignore", "ignore",
						getTextInCurrentLocale(StringArray.ARRAY_MF_TO_ACCOUNT), "ignore", "ignore", "ignore",
						getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_BALANCE_NOTE) };
				int size = detailList.size();
				System.out.println("size of data:" + size);
				for (int i = 0; i < size; i++) {
					// if(i>=15 ) {
					// String capturedText =
					// mobileAction.getValue(detailList.get(i));
					// System.out.println("Captured text "+ i+
					// ":"+capturedText);
					// }
					if (detailInfomation[i].equalsIgnoreCase("ignore")) {
						continue;
					} else {
						if (!mobileAction.verifyElementIsPresent(detailList.get(i))) {
							mobileAction.FuncSwipeWhileElementNotFound(detailList.get(size - 1), false, 10, "up");
						}
						String capturedText = mobileAction.getValue(detailList.get(i));
						if (currentLocale.equalsIgnoreCase("fr")) {
							String unkownEmptySpace = " "; // for french only
							capturedText = capturedText.trim().replaceAll(unkownEmptySpace, " ");
						}
						// mobileAction.verifyElementTextIsDisplayed(detailList.get(i),
						// detailInfomation[i]);
						System.out.println("Captured text " + i + ":" + capturedText);
						mobileAction.verifyTextEquality(capturedText, detailInfomation[i]);
					}
				}
			}
			mobileAction.FuncSwipeWhileElementNotFound(foot_note, false, 5, "up");
			String footnote = getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_BALANCE_NOTE);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementTextIsDisplayed(foot_note, footnote);
			}
			mobileAction.FuncSwipeUpTillScreenBottom(homeBtn);
			String[] button_text = { getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_GO_HOME_BTN),
					getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_VIEW_ACCOUNT_BTN) };
			List<MobileElement> btnList = null;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				btnList = ((MobileDriver) (CL.GetAppiumDriver())).findElementsByXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button']");
			} else {
				btnList = ((MobileDriver) (CL.GetAppiumDriver()))
						.findElementsByXPath("//XCUIElementTypeCollectionView/XCUIElementTypeCell");
			}

			int size = btnList.size();
			if (size < button_text.length) {
				System.out.println("Failed due to button not match");
				mobileAction.Report_Fail("Bottom Button number doesn't match");
				return;
			}
			for (int i = 0; i < button_text.length; i++) {
				mobileAction.verifyElementTextIsDisplayed(btnList.get(i), button_text[i]);
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyTransferReceipt() {
		Decorator();
		try {

			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Receipt Header");
			mobileAction.verifyElementTextContains(pageHeader,
					getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_HEADER));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				cnfrDetail = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RECEIPT_DETAIL) + "']", "Confirm text");
			}

			mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
			mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
			mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
			mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");

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

	public void verifyBillReceipt() {
		Decorator();
		try {
			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Receipt Header");
			mobileAction.verifyElementTextContains(pageHeader,
					getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_HEADER));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				cnfrDetail = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RECEIPT_DETAIL) + "']", "Confirm text");
			}

			mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
			mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
			mobileAction.verifyElementIsDisplayed(payeeValue, "Payee Value");
			mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
			mobileAction.verifyElementIsDisplayed(dateValue, "Date Value");

			// For bill payment, takes some time to update acct balance
			String specificAccts = getTestdata("Description");
			if (specificAccts != null && specificAccts.equalsIgnoreCase("specified")) {
				mobileAction.sleep(60000);
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

	public void verifyUSBillReceipt() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(thankYouTitleUS, "Thank You title");
			mobileAction.verifyElementTextContains(thankYouTitleUS,
					getTextInCurrentLocale(StringArray.ARRAY_MF_THANKYOU));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				confirmNumberUS = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RECEIPT_DETAIL) + "']", "Confirm text");
			}

			mobileAction.verifyElementIsDisplayed(confirmNumberUS, "Confirm Details");
			mobileAction.verifyElementIsDisplayed(fromAccountUS, "From Account US");
			mobileAction.verifyElementIsDisplayed(fromAccountValueUS, "From Account Value US");
			mobileAction.verifyElementIsDisplayed(payeeDetailsUS, "Payee Details US");
			mobileAction.verifyElementIsDisplayed(amountValueUS, "Amount Value US");

			mobileAction.FunctionSwipe("up", 2000, 0);
			mobileAction.verifyElementIsDisplayed(amountTotalValueUS, "Amount Total Value US");
			mobileAction.verifyElementIsDisplayed(paymentReasonUS, "Payment Reason US");

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

	public void verifyCancelledBillReceipt() {
		Decorator();
		try {
			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Receipt Header");
			mobileAction.verifyElementTextContains(pageHeader,
					getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_HEADER));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				cnfrDetail = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RECEIPT_DETAIL) + "']", "Confirm text");
			}

			mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
			mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
			mobileAction.verifyElementIsDisplayed(payeeValue, "Payee Value");
			mobileAction.verifyElementIsDisplayed(amountValueCB, "Amount Value");
			mobileAction.verifyElementIsDisplayed(dateValueCB, "Date Value");

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

	public void clickGoBackHome() {
		Decorator();
		try {
			mobileAction.FuncSwipeWhileElementNotFound(goBackHomeButton, false, 10, "up");
			mobileAction.FuncClick(goBackHomeButton, "Go Back Home button");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void clickMakeAnotherTransfer() {
		Decorator();
		try {

			mobileAction.FuncClick(makeAnthTran_Button, "Make Another Transfer button");
			mobileAction.waitProgressBarVanish();

			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Confirm Header");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementTextContains(pageHeader,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TRANSFERS));
			} else {
				mobileAction.verifyElementTextContains(pageHeader,
						getTextInCurrentLocale(StringArray.ARRAY_BETWEEN_MY_ACCOUNTS_HEADER));
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void clickScheduledPaymentsBtn() {
		Decorator();
		try {

			mobileAction.FuncSwipeWhileElementNotFound(scheduledPaymentsBtn, true, 10, "up");
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

	public void verifyReceiptBanner() {
		Decorator();
		try {

			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Receipt Header");

			boolean hasBanner = mobileAction.verifyElementIsPresent(bannerImage);
			if (hasBanner) {
				mobileAction.verifyElementIsDisplayed(bannerImage, "Receipt Banner");
			} else {
				mobileAction.GetReporting().FuncReport("Pass", "No receipt banner in this device");
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

	public void verifyPayWithRewardsReceipt() {
		Decorator();
		try {
			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Receipt Header");
			mobileAction.verifyElementTextContains(pageHeader,
					getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_HEADER));

			mobileAction.verifyElementIsDisplayed(cnfrDetailRewards, "Confirm Details");
			mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
			mobileAction.verifyElementIsDisplayed(payeeValue, "Payee Value");
			mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
			mobileAction.verifyElementIsDisplayed(dateValue, "Date Value");

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
