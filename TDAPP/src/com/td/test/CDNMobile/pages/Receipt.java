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

public class Receipt extends _CommonPage {
	private static Receipt Receipt;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
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

	public void ClickGoBackHomeBtn() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String homeBtnxpath = "//android.widget.Button[@text='RETOURNER À L’ACCUEIL' or @text='"
						+ mobileAction.getAppString("quick_links_go_back_home") + "']";
				System.out.println("Go back home:" + homeBtnxpath);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(homeBtnxpath, true, 10, "up");

			} else {
				mobileAction.FuncSwipeWhileElementNotFound(homeBtn, true, 10, "up");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void ClickViewMyAccountsBtn() {
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
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void VerifyConfirmationPageHeader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(receiptHeader,
					getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_HEADER));
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private String replaceANDFrenchSpace(String text) {
		return text.replaceAll(" ", " ");
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
						replaceANDFrenchSpace(getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_BEFORE3)),
						replaceANDFrenchSpace(getTextInCurrentLocale(StringArray.ARRAY_MF_CONTENT_BEFORE3)),
						replaceANDFrenchSpace(getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_AFTER3)),
						replaceANDFrenchSpace(getTextInCurrentLocale(StringArray.ARRAY_MF_CONTENT_AFTER3)),
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
					mobileAction.verifyElementTextIsDisplayed(detailList.get(i), detailInfomation[i]);
				}
				mobileAction.FuncSwipeWhileElementNotFound(foot_note, false, 5, "up");
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
						getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_REQUEST_TIME), "ignore",
						getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT), "ignore", "ignore", "ignore",
						"ignore", getTextInCurrentLocale(StringArray.ARRAY_MF_TO_ACCOUNT), "ignore", "ignore", "ignore",
						getTextInCurrentLocale(StringArray.ARRAY_MF_RECEIPT_BALANCE_NOTE) };
				int size = detailList.size();
				System.out.println("size of data:" + size);
				for (int i = 0; i < size; i++) {
					if (detailInfomation[i].equalsIgnoreCase("ignore")) {
						continue;
					} else {
						if (!mobileAction.verifyElementIsPresent(detailList.get(i))) {
							mobileAction.FuncSwipeWhileElementNotFound(detailList.get(i), false, 5, "up");
						}
						mobileAction.verifyElementTextIsDisplayed(detailList.get(i), detailInfomation[i]);
					}
				}
			}

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

}
