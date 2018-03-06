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

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText | //XCUIElementTypeNavigationBar/XCUIElementTypeOther")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement receiptHeader;

	@iOSXCUITFindBy(xpath = "//*[@name='QUICKACCESS_CELL_MENU_ICON_HOME' or @name='QUICKACCESS_CELL_QUICKLINKS_BACKHOME_ON']")
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

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/review_row_label']")
	private List<MobileElement> rbp_receipt_caption_list;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/review_row_primary_text']")
	private List<MobileElement> rbp_receipt_info_list;

	private MobileElement payee_account_number;
	private MobileElement frome_account_number;

	@iOSXCUITFindBy(accessibility = "QUICKACCESS_CELL_PAYANOTHERBILL_ICON")
	private MobileElement quickLink_payAnotherBillBtn;

	@iOSXCUITFindBy(accessibility = "QUICKACCESS_CELL_UPCOMINGBILLS_OFF")
	private MobileElement quickLink_scheduledPaymentsBtn;

	@iOSXCUITFindBy(accessibility = "QUICKACCESS_CELL_QUICKLINKS_PAYBILLS")
	private MobileElement quickLink_BillsBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button']")
	private List<MobileElement> quickLink_Btn_List;

	@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView[@resource-id='com.td:id/quick_links']")
	private MobileElement quickLinks_view;

	String accountReg = "\\•{4}\\s?\\d{4}";

	@AndroidFindBy(id = "com.td:id/thank_you")
	private MobileElement thankYouTitle;

	@AndroidFindBy(id = "com.td:id/confirmation_val")
	private MobileElement cnfrDetail;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_bal'] | "
			+ "(//android.widget.TextView[@resource-id='com.td:id/item_row_value_main'])[1]")
	private MobileElement fromAccountValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/to_account_bal")
	private MobileElement ToAccountValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2] | "
			+ "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/amount_val'] | "
			+ "(//android.widget.TextView[@resource-id='com.td:id/item_row_value_main'])[3]")
	private MobileElement amountValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/second_amount_val")
	private MobileElement amountValueBank;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/amount_val")
	private MobileElement amountValueCB;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payee_val'] | "
			+ "(//android.widget.TextView[@resource-id='com.td:id/item_row_value_main'])[2]")
	private MobileElement payeeValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/date_val'] | "
			+ "(//android.widget.TextView[@resource-id='com.td:id/item_row_value_main'])[4]")
	private MobileElement dateValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/date_val")
	private MobileElement dateValueCB;

	@iOSXCUITFindBy(accessibility = "QUICKACCESS_CELL_UPCOMINGBILLS_OFF")
	@AndroidFindBy(id = "com.td:id/upcomingbills")
	private MobileElement scheduledPaymentsBtn;

	@iOSXCUITFindBy(xpath = "//*[@name='QUICKACCESS_CELL_BACKHOME_ON' or @name='QUICKACCESS_CELL_QUICKLINKS_BACKHOME_ON']")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/home' or @resource-id='com.td:id/quick_link_item_layout_button']")
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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_bal' or @resource-id='com.td:id/review_row_tertiary_text']")
	private MobileElement fromBankAccountValueUS;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_bal' or @resource-id='com.td:id/review_row_tertiary_text']")
	private MobileElement fromAccountValue_Receipt;

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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[1]//XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/thank_you']")
	private MobileElement rbp_thankyou;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[1]//XCUIElementTypeStaticText[2] | //XCUIElementTypeStaticText[@name='-Message']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message']")
	private MobileElement receipt_message;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[1]//XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation']")
	private MobileElement confirmation_label;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[2]//XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/custom_text']")
	private MobileElement rbp_copy_text;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='How Often' or @label='Type de paiement' or @label='次数' or @label='次數']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='How Often' or @text='Type de paiement' or @text='次数' or @text='次數']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement rbp_howoften_selection;

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
			mobileAction.FuncSwipeOnce("up");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncSwipeWhileElementNotFound(quickLink_Btn_List.get(0), true, 10, "up");
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
			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(),
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

	public void verifyRBPReceiptContent() {
		Decorator();
		boolean isPaymentOnce = false;

		// check payment is once or ongoing
		String paymentType = mobileAction.getValue(rbp_howoften_selection);
		if (paymentType.equals(getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONCE))) {
			isPaymentOnce = true;
		}
		// Verify Thank you message
		mobileAction.verifyElementTextContains(rbp_thankyou, getTextInCurrentLocale(StringArray.ARRAY_RBP_THANKYOU));
		mobileAction.verifyElementTextContains(receipt_message,
				getTextInCurrentLocale(StringArray.ARRAY_RBP_RECEIPT_MESSAGE));
		mobileAction.verifyElementTextContains(confirmation_label,
				getTextInCurrentLocale(StringArray.ARRAY_RBP_RECEIPT_CONFIRMATION));

		if (!isPaymentOnce) {
			mobileAction.verifyElementTextContains(rbp_copy_text,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_RECEIPT_COPY));
		}

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.FuncSwipeOnce("up");
		}
		int caption_size = rbp_receipt_caption_list.size();

		if (caption_size != 5 && caption_size != 6 && caption_size != 8) {
			System.out.println("Something wrong..., receipt caption_size:" + caption_size + " not 5, or 6, or 8");
			return;
		}
		String[] expectedInfo = { getTextInCurrentLocale(StringArray.ARRAY_PAYEE_CAPTION),
				getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_FROM_ACCOUNT),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_START_DATE),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_NUMBER_OF_PAYMENTS),
				getTextInCurrentLocale(StringArray.ARRAY_RBP_END_DATE) };

		// check payment is once or ongoing

		if (isPaymentOnce) {
			expectedInfo[4] = getTextInCurrentLocale(StringArray.ARRAY_RBP_ONCE_DATE);
		}

		for (int i = 0; i < caption_size; i++) {
			try {
				if(!mobileAction.verifyElementIsPresent(rbp_receipt_caption_list.get(i))) {
					mobileAction.FuncSwipeOnce("up");
				}
				mobileAction.verifyElementTextIsDisplayed(rbp_receipt_caption_list.get(i), expectedInfo[i]);
			} catch (Exception e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
		}
	}

	public void VerifyRBPReceipt() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncSwipeOnce("up");
			}
			
		} catch (Exception e) {

		}
		int caption_size = rbp_receipt_caption_list.size();
		int info_size = rbp_receipt_info_list.size();
		if (info_size != caption_size) {
			System.out.println("Something wrong..., caption_size:" + caption_size + ",info_size:" + info_size);
			return;
		}
		if (info_size != 5 && info_size != 6 && info_size != 8) {
			System.out.println("Something wrong..., info_size:" + info_size + " not 5, or 6, or 8");
			return;
		}
		String expectedPayee = CL.getTestDataInstance().TCParameters.get("Payee");
		String expectedAmount = CL.getTestDataInstance().TCParameters.get("Amount");
		String expectedAccount = CL.getTestDataInstance().TCParameters.get("FromAccount");
		String expectedHowOften = CL.getTestDataInstance().TCParameters.get("Price");
		String inputStartdate = CL.getTestDataInstance().TCParameters.get("Timeout");
		String expectedFrequency = CL.getTestDataInstance().TCParameters.get("MerchantName");
		String secondTimeout = CL.getTestDataInstance().TCParameters.get("SecondTimeout");
		String expectedStartOfDate = "";
		int expectedNumberOfpayments = 0;
		String expectedEndOfDate = "";

		String[] expectedInfo = { expectedPayee, "$" + expectedAmount, expectedAccount, expectedHowOften,
				inputStartdate, expectedFrequency, Integer.toString(expectedNumberOfpayments), expectedEndOfDate };

		// How often is Once
		if (info_size == 5) {

			for (int i = 0; i < info_size; i++) {
				try {
					if(!mobileAction.verifyElementIsPresent(rbp_receipt_info_list.get(i))) {
						mobileAction.FuncSwipeOnce("up");
					}
					mobileAction.verifyElementTextIsDisplayed(rbp_receipt_info_list.get(i), expectedInfo[i]);
				} catch (Exception e) {

				}
			}
			return;
		}

		// How often is Ongoing and "When I decide to cancel" is selected
		if (info_size == 6) {
			expectedStartOfDate = MyCalendar.get().getStartDateInAnyCase(inputStartdate, expectedFrequency);
			expectedInfo[4] = expectedStartOfDate;
			for (int i = 0; i < info_size; i++) {
				try {
					if(!mobileAction.verifyElementIsPresent(rbp_receipt_info_list.get(i))) {
						mobileAction.FuncSwipeOnce("up");
					}
					mobileAction.verifyElementTextIsDisplayed(rbp_receipt_info_list.get(i), expectedInfo[i]);
				} catch (Exception e) {

				}
			}
			return;
		}

		if (info_size == 8) {
			// Need to calculate number of payments and end date,
			if (secondTimeout.matches("\\d+")) {
				// End of payment is select: number of payments
				expectedNumberOfpayments = Integer.parseInt(secondTimeout);
				expectedStartOfDate = MyCalendar.get().getStartDateInAnyCase(inputStartdate, expectedFrequency);
				expectedEndOfDate = MyCalendar.get().getEndOfDateWhenNumberOfPaymentSelected(expectedStartOfDate,
						expectedNumberOfpayments, expectedFrequency);
			} else {
				// End of payment is select: On a specific day
				String inputEndOfDate = secondTimeout;

				expectedStartOfDate = MyCalendar.get().getStartDateInAnyCase(inputStartdate, expectedFrequency);
				expectedNumberOfpayments = MyCalendar.get().getNumberOfpaymentsWhenOnSpecificDayClicked(inputStartdate,
						inputEndOfDate, expectedFrequency);
				expectedEndOfDate = MyCalendar.get().geEndOfDateWhenOnSpecificDayClicked(expectedStartOfDate,
						inputEndOfDate, expectedFrequency);
			}

			// update expected Info array
			expectedInfo[4] = expectedStartOfDate;
			expectedInfo[6] = Integer.toString(expectedNumberOfpayments);
			expectedInfo[7] = expectedEndOfDate;
			for (int i = 0; i < info_size; i++) {
				try {
					if(!mobileAction.verifyElementIsPresent(rbp_receipt_info_list.get(i))) {
						mobileAction.FuncSwipeOnce("up");
					}
					mobileAction.verifyElementTextIsDisplayed(rbp_receipt_info_list.get(i), expectedInfo[i]);
				} catch (Exception e) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
			}
			return;
		}
	}

	public void verifyPayee_FromAccountMaskedInReceipt() {
		Decorator();

		String payeeCaption = getTextInCurrentLocale(StringArray.ARRAY_PAYEE_CAPTION);
		String from_account = getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT);
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				payee_account_number = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + payeeCaption
								+ "']/following-sibling::android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.td:id/review_row_secondary_text']",
						"Payee number");
				frome_account_number = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + from_account
								+ "']/following-sibling::android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.td:id/review_row_secondary_text']",
						"From Account number");
			} else {
				payee_account_number = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ payeeCaption + "']/following-sibling::XCUIElementTypeStaticText[2]", "Payee number");
				frome_account_number = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ from_account + "']/following-sibling::XCUIElementTypeStaticText[2]", "From Account number");
			}
			String capturedPayeeNumber = mobileAction.getValue(payee_account_number);
			String capturedFromAccount = mobileAction.getValue(frome_account_number);

			System.out.println("capturedPayeeNumber:" + capturedPayeeNumber);
			System.out.println("capturedFromAccount:" + capturedFromAccount);
			if (capturedPayeeNumber.matches(accountReg)) {
				mobileAction.Report_Pass_Verified("Masked Payee account:" + capturedPayeeNumber);
			} else {
				mobileAction.Report_Fail_Not_Verified("Masked Payee account:" + capturedPayeeNumber);
			}

			if (capturedFromAccount.matches(accountReg)) {
				mobileAction.Report_Pass_Verified("Masked From account:" + capturedFromAccount);
			} else {
				mobileAction.Report_Fail_Not_Verified("Masked From account:" + capturedFromAccount);
			}

		} catch (Exception e) {

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

	public void ClickPayAnotherBillBtn() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.FuncSwipeWhileElementNotFound(quickLinks_view, false, 3, "up");
				mobileAction.FuncClick(quickLink_Btn_List.get(1), "Quick Link Pay another Bill");

			} else {
				mobileAction.FuncSwipeWhileElementNotFound(quickLink_payAnotherBillBtn, true, 3, "up");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickGoBackHome() {
		Decorator();
		try {
			mobileAction.FunctionSwipe("up", 1000, 0);
			mobileAction.sleep(2000);
			mobileAction.FuncClick(goBackHomeButton, "Go Back Home button");
			mobileAction.sleep(3000);

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

			mobileAction.FunctionSwipe("up", 100, 100);
			mobileAction.FuncSwipeWhileElementNotFound(scheduledPaymentsBtn, true, 10, "up");
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

	public void ClickSchedulePaymentsBtn() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncSwipeWhileElementNotFound(quickLinks_view, false, 3, "up");
				mobileAction.FuncClick(quickLink_Btn_List.get(2), "Quick Link Schedule Payments");

			} else {
				mobileAction.FuncSwipeWhileElementNotFound(quickLink_scheduledPaymentsBtn, true, 3, "up");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

	public void ClickQuickLinkBillsBtn() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncSwipeWhileElementNotFound(quickLinks_view, false, 3, "up");
				mobileAction.FuncClick(quickLink_Btn_List.get(3), "Quick Link Bills");

			} else {
				mobileAction.FuncSwipeWhileElementNotFound(quickLink_BillsBtn, true, 3, "up");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

	public void saveReceiptInfoUSTransfer() {
		Decorator();
		try {
			String fromBalance = mobileAction.FuncGetElementText(fromBankAccountValueUS);
			String toBalance = mobileAction.FuncGetElementText(ToAccountValue);
			String fxamt = mobileAction.FuncGetElementText(amountValueBank);

			fromBalance = fromBalance.substring(fromBalance.lastIndexOf(" ") + 1);
			toBalance = toBalance.substring(toBalance.lastIndexOf(" ") + 1);
			fxamt = fxamt.substring(fxamt.lastIndexOf(" ") + 1);

			System.out.println(fromBalance + " " + toBalance + " " + fxamt);

			CL.getTestDataInstance().TCParameters.put("Timeout", fromBalance);
			CL.getTestDataInstance().TCParameters.put("SecondTimeout", toBalance);
			CL.getTestDataInstance().TCParameters.put("MerchantName", fxamt);

			// Takes time to update bank accts after transactions
			// mobileAction.sleep(10000);

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

	public void verifyBalanceInReceipt() {
		Decorator();
		try {
			Boolean isTransfer = false;
			String receiptMsg = mobileAction.getValue(receipt_message);
			System.out.println("Receipt message:" + receiptMsg);
			if (receiptMsg.contains("Transfer")) {
				System.out.println("Transfer receipt");
				isTransfer = true;
			} else {
				System.out.println("Pay bill receipt");
				isTransfer = false;
			}

			if (!isTransfer) {
				String fromBalance = mobileAction.getValue(fromAccountValue_Receipt);
				System.out.println(fromBalance);
				double fromaccountCaptured = mobileAction.convertStringAmountTodouble(fromBalance);
				double fromAccountExpected = Double.parseDouble(CL.getTestDataInstance().TCParameters.get("Dividend"));
				if (fromaccountCaptured == fromAccountExpected) {
					mobileAction.Report_Pass_Verified("From Account balance");
				} else {
					mobileAction.Report_Fail("Failed to verify from account balance");
				}
				clickGoBackHome();
				return;
			}

			String fromBalance = mobileAction.getValue(fromBankAccountValueUS);
			String toBalance = mobileAction.getValue(ToAccountValue);
			String fxamt = mobileAction.getValue(amountValue);

			fromBalance = fromBalance.substring(fromBalance.lastIndexOf(" ") + 1);
			toBalance = toBalance.substring(toBalance.lastIndexOf(" ") + 1);
			fxamt = fxamt.substring(fxamt.lastIndexOf(" ") + 1);

			System.out.println(fromBalance + " " + toBalance + " " + fxamt);

			double fromaccountCaptured = mobileAction.convertStringAmountTodouble(fromBalance);
			double toAccountCaptured = mobileAction.convertStringAmountTodouble(toBalance);

			double fromAccountExpected = Double.parseDouble(CL.getTestDataInstance().TCParameters.get("Dividend"));
			double toAccountExpected = Double.parseDouble(CL.getTestDataInstance().TCParameters.get("Quantity"));

			if (fromaccountCaptured == fromAccountExpected) {
				mobileAction.Report_Pass_Verified("From Account balance");
			} else {
				mobileAction.Report_Fail("Failed to verify from account balance");
			}

			if (toAccountCaptured == toAccountExpected) {
				mobileAction.Report_Pass_Verified("To Account balance");
			} else {
				mobileAction.Report_Fail("Failed to verify to account balance");
			}

			clickGoBackHome();

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
