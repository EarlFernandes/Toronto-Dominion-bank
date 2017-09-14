package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PurchaseMutualFunds extends _CommonPage {

	private static PurchaseMutualFunds purchaseMutualFunds;

	private static String MIN_AMOUNT = "100.00";
	private static String MAX_AMOUNT = "999999.99";

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement page_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/selectedText")
	private MobileElement fund_dropdown_list;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/orderDropdownCaption")
	private MobileElement fund_dropdown_caption;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(id = "com.td:id/captionTextView")
	private MobileElement amount_caption;

	@iOSFindBy(xpath = "//*[@name='actionSheetCancelButton']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button']")
	private MobileElement cancel_button;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	private MobileElement from_account_name;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	private MobileElement from_account_caption;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
	private MobileElement to_account_caption;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeOther[6]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/custom_text']")
	private MobileElement contact_caption;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label']")
	private MobileElement email_caption;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[7]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/phone_number']/../../android.widget.TextView")
	private MobileElement phone_caption;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main']")
	private MobileElement view_fundFacts;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[6]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/description']")
	private MobileElement email_info;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[7]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement phone_info;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText']")
	private MobileElement amount;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeCell[9]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='com.td:id/checkbox']")
	private MobileElement consent_checkbox;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/checkbox_description']")
	private MobileElement consent_checkbox_description;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeOther[9]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/timestampContainer' and @index='7']/android.widget.TextView")
	private MobileElement legal_text;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/following-sibling::XCUIElementTypeOther[7]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/timestampContainer']/android.widget.TextView")
	private MobileElement copy_text;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/preceding-sibling::XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement error_message;

	String emailPlaceHolder = "example@address.com | exemple@adresse.com";
	String phonePlaceHolder = "Enter number | Entrer le numéro";
	String purchaseListView = "//android.support.v7.widget.RecyclerView[@resource-id='com.td:id/purchaseListView']";
	String phoneReg = "\\(\\d{3}\\)\\s*\\d{3}\\s*-\\s*\\d{4}";
	String emailReg = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}";

	@iOSFindBy(xpath = "//XCUIElementTypeTable/../XCUIElementTypeOther[1]/XCUIElementTypeButton")
	@AndroidFindBy(id = "com.td:id/purchasePreviewButton")
	private MobileElement preview_purchase_button;

	@iOSFindBy(xpath = "//XCUIElementTypeSegmentedControl/XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//XCUIElementTypeSegmentedControl/XCUIElementTypeButton")
	private MobileElement borrow_money_yes_button;

	@iOSFindBy(xpath = "//XCUIElementTypeSegmentedControl/XCUIElementTypeButton[2]")
	@AndroidFindBy(id = "com.td:id/purchasePreviewButton")
	private MobileElement borrow_money_no_button;

	@iOSFindBy(xpath = "//*[@name='TDFundSelectorCellIdentifier']/../XCUIElementTypeCell[6]/XCUIElementTypeStaticText")
	@AndroidFindBy(id = "com.td:id/purchasePreviewButton")
	private MobileElement borrow_money_warning_message;

	@iOSFindBy(xpath = "//*[@label='Done' or @label='OK']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Ineligible') or contains(@label,'Non admissible')]/../XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Ineligible') or contains(@text,'Non admissible')]/../android.widget.TextView[@resource-id='com.td:id/txtItemValue']")
	private MobileElement Ineligible_fund;

	public synchronized static PurchaseMutualFunds get() {
		if (purchaseMutualFunds == null) {
			purchaseMutualFunds = new PurchaseMutualFunds();
		}
		return purchaseMutualFunds;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	private void clickpreview() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			String enableStatus = preview_purchase_button.getAttribute("enabled");

			int count = 0;

			while (enableStatus.equalsIgnoreCase("false") && count < 10) {
				mobileAction.FuncSwipeOnce("down");
				enableStatus = preview_purchase_button.getAttribute("enabled");
				count++;
			}
			if (count >= 10) {
				mobileAction.Report_Fail("PreviewPurchase button is disabled");
				return;
			}
		}
		String elementText = mobileAction.getValue(preview_purchase_button);
		try {
			mobileAction.FuncClick(preview_purchase_button, elementText);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("Failed to click preview purchase button");
		}
		mobileAction.waitForElementToVanish(progress_bar);
	}

	private void enterAmount(String amountentered) {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				amount = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ mobileAction.getAppString("str_Amount") + "']/../XCUIElementTypeTextField", "Amount");
			}
			mobileAction.FuncSendKeys(amount, amountentered);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				done = mobileAction.verifyElementUsingXPath("//*[@label='Done' or @label='OK' or @label='"
						+ mobileAction.getAppString("secureLoginEditButtonDone") + "']", "Done");
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}
		} catch (InterruptedException | IOException e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	private String replacePlaceholderToNothing(String text, String placeHolder) {
		String[] replaceHolderList = placeHolder.split("\\|");
		String returnedStr = text;
		for (int i = 0; i < replaceHolderList.length; i++) {
			returnedStr = returnedStr.replaceAll(replaceHolderList[i].trim(), "");
		}
		return returnedStr;
	}

	private String getPhoneNumber() {
		try {

			String phoneNumber = mobileAction.getValue(phone_info);

			phoneNumber = replacePlaceholderToNothing(phoneNumber, phonePlaceHolder);
			if (phoneNumber.isEmpty()) {
				System.out.println("phoneNumber is empty");
				return "";
			}

			// if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			// phoneNumber = mobileAction.FuncGetValByRegx(phoneNumber,
			// androidphoneReg);
			// }else{
			// phoneNumber = mobileAction.FuncGetValByRegx(phoneNumber,
			// iosphoneReg);
			// }
			System.out.println("phoneNumber :" + phoneNumber);
			return phoneNumber;

		} catch (NoSuchElementException e) {
			System.out.println("phoneNumber is empty");
		}
		return "";
	}

	private String getEmailInfo() {
		try {

			String emailInfo = mobileAction.getValue(email_info);
			emailInfo = replacePlaceholderToNothing(emailInfo, emailPlaceHolder);
			if (emailInfo.isEmpty()) {
				System.out.println("Email is empty");
				return "";
			}
			emailInfo = mobileAction.FuncGetValByRegx(emailInfo, emailReg);
			System.out.println("email:" + emailInfo);
			return emailInfo;

		} catch (NoSuchElementException e) {
			System.out.println("email is empty");
		}
		return "";
	}

	public void VerifyPurchaseMFPageHeader() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(page_title,
					getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_HEADER));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickpreviewButtonWithNoForm() {

		String elementText = mobileAction.getValue(preview_purchase_button);
		try {
			mobileAction.FuncClick(preview_purchase_button, elementText);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("Failed to click preview purchase button");
		}
		mobileAction.waitForElementToVanish(progress_bar);
	}

	public void VerifyFundDropdownList() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(fund_dropdown_list, "Fund Dropdown");
			mobileAction.FuncClick(fund_dropdown_list, "Fund Dropdown");
			mobileAction.waitForElementToVanish(progress_bar);
			mobileAction.FuncClick(cancel_button, "Cancel Button");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed to VerifyFundDropdownList.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyFundDropdownList");
		}
	}

	public void VerifyFromAccountBeStaticAndLinked() {
		Decorator();
		try {
			String selectedFund = CL.getTestDataInstance().TCParameters.get("Accounts");
			SelectFund(selectedFund);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				from_account_name = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT)
								+ "']/..//android.widget.TextView[@resource-id='com.td:id/mf_account_name']",
						"From Account name");
			}

			mobileAction.verifyElementIsDisplayed(from_account_name, "From Account name");
			mobileAction.FuncClick(from_account_name, "From Account name");
			mobileAction.verifyElementIsDisplayed(from_account_name, "From Account name");

			String accountName = mobileAction.getValue(from_account_name);

			System.out.println("From Account Name:" + accountName);

			if (!accountName.isEmpty()) {
				mobileAction.Report_Pass_Verified("From Account is linked");
			} else {
				mobileAction.Report_Fail_Not_Verified("From Account is linked");
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed to VerifyFromAccountBeStaticAndLinked.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyFromAccountBeStaticAndLinked");
		}
	}

	public void VerifyPhoneFormat() {
		Decorator();
		try {

			String phoneNum = getPhoneNumber();
			if (phoneNum.isEmpty()) {
				mobileAction.Report_Pass_Verified("Empty Phone ");
				return;
			}

			if (phoneNum.matches(phoneReg)) {
				mobileAction.Report_Pass_Verified("Phone format ");
			} else {
				mobileAction.Report_Fail_Not_Verified("Phone format ");
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed to VerifyPhoneFormat.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyPhoneFormat");
		}
	}

	public void VerifyPhoneNotMasked() {
		Decorator();
		try {

			String phoneNum = getPhoneNumber();
			if (phoneNum.isEmpty()) {
				mobileAction.Report_Pass_Verified("Empty Phone ");
				return;
			}

			if (phoneNum.matches(phoneReg)) {
				mobileAction.Report_Pass_Verified("Phone not masked ");
			} else {
				mobileAction.Report_Fail_Not_Verified("Phone not masked ");
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed to VerifyPhoneNotMasked.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyPhoneNotMasked");
		}
	}

	// private String get_To_MF_Account_text() {
	// return getTextInCurrentLocale(EnglishStrings.MF_TO_MF_ACCOUNT,
	// FrenchStrings.MF_TO_MF_ACCOUNT,
	// ChineseStrings.Simplified.MF_TO_MF_ACCOUNT,
	// ChineseStrings.Traditional.MF_TO_MF_ACCOUNT );
	// }

	public void VerifyPurchaseMFPageInChinese() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(page_title,
					getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_HEADER));
			mobileAction.verifyElementTextIsDisplayed(fund_dropdown_caption,
					getTextInCurrentLocale(StringArray.ARRAY_MF_FUNDS));
			mobileAction.verifyElementTextIsDisplayed(fund_dropdown_list,
					getTextInCurrentLocale(StringArray.ARRAY_MF_SELECT_FUNDS));
			mobileAction.verifyElementTextIsDisplayed(amount_caption,
					getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				from_account_caption = mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/mf_label' and @text='"
										+ getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT) + "']",
								"From Account");

				to_account_caption = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/mf_label' and @text='"
								+ getTextInCurrentLocale(StringArray.ARRAY_MF_TO_ACCOUNT) + "']",
						"To Account");
				contact_caption = mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/custom_text' and @text='"
										+ mobileAction.getAppString("contact_information") + "']",
								"Contact Information");

			} else {

			}
			mobileAction.verifyElementTextIsDisplayed(from_account_caption,
					getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT));
			mobileAction.verifyElementTextIsDisplayed(to_account_caption,
					getTextInCurrentLocale(StringArray.ARRAY_MF_TO_ACCOUNT));
			mobileAction.verifyElementTextIsDisplayed(contact_caption,
					getTextInCurrentLocale(StringArray.ARRAY_MF_CONTACT_INFO));
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView", 1, "down");
			} else {
				mobileAction.SwipeWithinElement("//XCUIElementTypeTable", 1, "down");
			}
			mobileAction.verifyElementTextIsDisplayed(email_caption,
					getTextInCurrentLocale(StringArray.ARRAY_MF_EMAIL));
			mobileAction.verifyElementTextIsDisplayed(phone_caption,
					getTextInCurrentLocale(StringArray.ARRAY_MF_PHONE));
			if (mobileAction.verifyElementIsPresent(copy_text)) {
				mobileAction.verifyElementTextIsDisplayed(copy_text,
						getTextInCurrentLocale(StringArray.ARRAY_MF_COPY_TEXT));
			}

			mobileAction.verifyElementTextIsDisplayed(view_fundFacts,
					getTextInCurrentLocale(StringArray.ARRAY_MF_VIEW_FUND_FACT));
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementTextIsDisplayed(consent_checkbox_description,
						getTextInCurrentLocale(StringArray.ARRAY_MF_CONTENT_RADIO));
			} else {
				mobileAction.verifyElementTextIsDisplayed(consent_checkbox,
						getTextInCurrentLocale(StringArray.ARRAY_MF_CONTENT_RADIO));
			}
			// String expectedLegalText
			// ="您购买的基金有最短持有期要求。如果您在最短持有期到期之前赎回，则可能需向基金支付最高 2%
			// 的短期交易费，此要求适用于道明互惠基金的所有单位（货币市场基金除外）。详情请参阅相关基金概况。"+
			// "| 您購買的基金有最短持有期要求。如果您在最短持有期到期之前贖回，則可能需向基金支付最高 2%
			// 的短期交易費，此要求適用於道明互惠基金的所有單位（貨幣市場基金除外）。詳情請參閱相關基金概況。";
			// mobileAction.verifyElementTextIsDisplayed(legal_text,
			// expectedLegalText);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed to VerifyPurchaseMFPageInChinese.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyPurchaseMFPageInChinese");
		}
	}

	public void SelectFund(String selectedFund) {
		Decorator();
		try {
			String[] selectedFundArray = selectedFund.split("\\|");
			mobileAction.FuncClick(fund_dropdown_list, "Funds dorpdown list");
			int lengthOfArray = selectedFundArray.length;
			String FundInListText;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				FundInListText = "//android.widget.TextView[@text='";
				for (int i = 0; i < lengthOfArray; i++) {
					FundInListText = FundInListText + selectedFundArray[i].trim() + "'";
					if (i < lengthOfArray - 1) {
						FundInListText = FundInListText + " or @text='";
					}
				}
				FundInListText = FundInListText + "]";
			} else {
				FundInListText = "//XCUIElementTypeStaticText[@label='";
				for (int i = 0; i < lengthOfArray; i++) {
					FundInListText = FundInListText + selectedFundArray[i].trim() + "'";
					if (i < lengthOfArray - 1) {
						FundInListText = FundInListText + " or @label='";
					}
				}
				FundInListText = FundInListText + "]";
			}
			System.out.println("FundInListText:" + FundInListText);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(FundInListText, true, 10, "up");

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

	private boolean fillPurchaseForm() {
		String selectedFund = CL.getTestDataInstance().TCParameters.get("Accounts");
		String user_email = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		String user_phone = CL.getTestDataInstance().TCParameters.get("PhoneProfile");
		String amount_selected = CL.getTestDataInstance().TCParameters.get("Amount");
		System.out.println("selected funds:" + selectedFund);
		System.out.println("amount::" + amount_selected);
		System.out.println("Email:" + user_email);
		System.out.println("Phone:" + user_phone);
		try {
			SelectFund(selectedFund);
			enterAmount(amount_selected);
			if (!mobileAction.verifyElementIsPresent(consent_checkbox)) {
				mobileAction.FuncSwipeWhileElementNotFound(consent_checkbox, false, 5, "up");
			}

			String ori_email = getEmailInfo();
			if (!user_email.isEmpty()) {
				mobileAction.FuncSendKeys(email_info, user_email);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
				} else {
					mobileAction.FuncClickDone();
				}
			} else {
				System.out.println("Email populated:" + ori_email);
			}
			String ori_phone = getPhoneNumber();
			if (!user_phone.isEmpty()) {
				mobileAction.FuncSendKeys(phone_info, user_phone);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClickDone();
				} else {
					mobileAction.FuncHideKeyboard();
				}
			} else {
				System.out.println("Phone populated:" + ori_phone);
			}
			mobileAction.FuncSwipeOnce("up");
			if (!mobileAction.verifyElementIsPresent(consent_checkbox)) {
				mobileAction.FuncSwipeWhileElementNotFound(consent_checkbox, false, 5, "up");
			}
			mobileAction.FuncClick(consent_checkbox, "consent check box");

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	private boolean fillPurchaseForm(String amountEntered) {
		String selectedFund = CL.getTestDataInstance().TCParameters.get("Accounts");
		String user_email = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		String user_phone = CL.getTestDataInstance().TCParameters.get("PhoneProfile");
		String amount_selected = amountEntered;
		System.out.println("selected funds:" + selectedFund);
		System.out.println("amount::" + amount_selected);
		System.out.println("Email:" + user_email);
		System.out.println("Phone:" + user_phone);
		try {
			SelectFund(selectedFund);
			enterAmount(amount_selected);
			mobileAction.FuncSwipeWhileElementNotFound(consent_checkbox, false, 5, "up");

			String ori_email = getEmailInfo();
			if (ori_email.isEmpty()) {
				mobileAction.FuncSendKeys(email_info, user_email);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
				} else {
					mobileAction.FuncClickDone();
				}
			} else {
				System.out.println("Email populated:" + ori_email);
			}
			String ori_phone = getPhoneNumber();
			if (ori_phone.isEmpty()) {
				mobileAction.FuncSendKeys(phone_info, user_phone);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClickDone();
				} else {
					mobileAction.FuncHideKeyboard();
				}
			} else {
				System.out.println("Phone populated:" + ori_phone);
			}

			//mobileAction.FuncSwipeOnce("up");
			//mobileAction.FuncClick(consent_checkbox, "consent check box");
			mobileAction.FuncSwipeWhileElementNotFound(consent_checkbox, true, 5, "up");

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void ClickPreviewPurchase() {
		Decorator();
		try {
			if (!fillPurchaseForm()) {
				mobileAction.Report_Fail("Failed to fill purchase form");
				return;
			}
			clickpreview();

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed to ClickPreviewPurchase.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for ClickPreviewPurchase");
		}
	}

	private String checkErrorMessageIsFound() {
		Decorator();
		String errorMessage = mobileAction.getValue(error_message);
		if (!errorMessage.isEmpty()) {
			errorMessage = errorMessage.replaceAll("\n", "");
			return errorMessage;
		}
		return "";
	}

	public void VerifyMinimumAmount() {
		Decorator();
		try {

			String amountLessthanMinimum = "99.99";
			fillPurchaseForm(amountLessthanMinimum);
			clickpreview();

			if (!mobileAction.verifyElementIsPresent(error_message)) {
				System.out.println("No error message for amount:99.99");
				mobileAction.Report_Fail("Failed to find error message for amount:99.99");
				return;
			}

			String errorMessage = checkErrorMessageIsFound();
			if (errorMessage.isEmpty()) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				mobileAction.Report_Fail("No error message for amount " + amountLessthanMinimum);
				return;
			} else {
				System.out.println("Found error message:" + errorMessage);
				mobileAction.Report_Pass_Verified(errorMessage);
			}

			enterAmount(MIN_AMOUNT);
			clickpreview();

			String pageTitle = mobileAction.getValue(page_title);
			String expectedTitle = getTextInCurrentLocale(StringArray.ARRAY_MF_PREVIEW_PURCHASE_HEADER);

			if (!expectedTitle.contains(pageTitle)) {
				errorMessage = checkErrorMessageIsFound();
				mobileAction.Report_Fail("Error message for min amount " + MIN_AMOUNT);
			} else {
				System.out.println("page display:" + pageTitle);
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed to VerifyMinmumAmount.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyMinmumAmount");
		}
	}

	public void VerifyMaximumAmount() {
		Decorator();
		try {
			String amounGreaterthanMaximum = "1000000.00";
			fillPurchaseForm(amounGreaterthanMaximum);
			clickpreview();

			if (!mobileAction.verifyElementIsPresent(error_message)) {
				System.out.println("No error message for amount:" + amounGreaterthanMaximum);
				mobileAction.Report_Fail("Failed to find error message for amount:" + amounGreaterthanMaximum);
				return;
			}
			String errorMessage = checkErrorMessageIsFound();
			if (errorMessage.isEmpty()) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				mobileAction.Report_Fail("No error message for amount " + amounGreaterthanMaximum);
				return;
			} else {
				System.out.println("Found error message:" + errorMessage);
				mobileAction.Report_Pass_Verified(errorMessage);
			}

			enterAmount(MAX_AMOUNT);
			clickpreview();
			String pageTitle = mobileAction.getValue(page_title);
			String expectedTitle = getTextInCurrentLocale(StringArray.ARRAY_MF_PREVIEW_PURCHASE_HEADER);
			if (!expectedTitle.contains(pageTitle)) {
				errorMessage = checkErrorMessageIsFound();
				mobileAction.Report_Fail("Error message for Max amount " + MAX_AMOUNT);
			} else {
				System.out.println("page display:" + pageTitle);
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed to VerifyMaxmumAmount.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyMaxmumAmount");
		}
	}

	public void VerifyFromCADAccountToUSDMFAccountIsNotAllowed() {
		Decorator();
		try {
			String selectedFund = CL.getTestDataInstance().TCParameters.get("Accounts");
			System.out.println("Fund configured:" + selectedFund);
			SelectFund(selectedFund);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				from_account_name = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT)
								+ "']/..//android.widget.TextView[@resource-id='com.td:id/mf_account_name']",
						"From Account name");

			}
			String fromAccount = mobileAction.getValue(from_account_name);
			System.out.println("From account name:" + fromAccount);

			if (fromAccount.contains("US $") || fromAccount.contains("DOLLARS US")) {
				mobileAction.Report_Pass_Verified("From CAD account to US MF not allowed, from account:" + fromAccount);
			} else {

				mobileAction
						.Report_Fail_Not_Verified("Not allowing from CAD account to US MF,from account:" + fromAccount);
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

	public void VerifyFromUSDAccountToCADMFAccountIsNotAllowed() {
		Decorator();
		try {
			String selectedFund = CL.getTestDataInstance().TCParameters.get("Accounts");
			System.out.println("Fund configured:" + selectedFund);
			SelectFund(selectedFund);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				from_account_name = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT)
								+ "']/..//android.widget.TextView[@resource-id='com.td:id/mf_account_name']",
						"From Account name");

			}

			String fromAccount = mobileAction.getValue(from_account_name);
			System.out.println("From account name:" + fromAccount);

			if (!fromAccount.toLowerCase().contains("us $") && !fromAccount.toLowerCase().contains("dollars us")) {
				mobileAction.Report_Pass_Verified("From USD account to CAD MF not allowed,from account:" + fromAccount);
			} else {

				mobileAction.Report_Fail_Not_Verified(
						"Not allowing from USD account to CAD MF,from account:" + fromAccount);
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

	public void VerifyPhoneIsPopulatedWithProfilePhone() {
		Decorator();
		try {

			mobileAction.FuncSwipeWhileElementNotFound(phone_info, false, 3, "up");

			String phoneInfo = mobileAction.getValue(phone_info);
			System.out.println("Phone now:" + phoneInfo);
			String expectedPhone = CL.getTestDataInstance().TCParameters.get("PhoneProfile");
			System.out.println("Expected:" + expectedPhone);
			String last_4_digit = mobileAction.FuncGetValByRegx(expectedPhone, "\\d+");

			if (phoneInfo.contains(last_4_digit)) {
				mobileAction.Report_Pass_Verified("Phone is populated:" + phoneInfo);
			} else {
				mobileAction.Report_Fail_Not_Verified("Phone is not populated:" + phoneInfo);
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed to VerifyPhoneIsPopulatedWithProfilePhone.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyPhoneIsPopulatedWithProfilePhone");
		}
	}

	public void VerifyEmailIsPopulatedWithProfileEmail() {
		Decorator();
		try {

			mobileAction.FuncSwipeWhileElementNotFound(email_info, false, 3, "up");

			String emialInfo = mobileAction.getValue(email_info);
			System.out.println("Email now:" + emialInfo);
			String expectedEmail = CL.getTestDataInstance().TCParameters.get("EmailProfile");
			System.out.println("Expected:" + expectedEmail);
			if (emialInfo.equalsIgnoreCase(expectedEmail)) {
				mobileAction.Report_Pass_Verified("Email is populated :" + emialInfo);
			} else {
				mobileAction.Report_Fail_Not_Verified("Email is not populated:" + emialInfo);
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed to VerifyEmailIsPopulatedWithProfileEmail.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for VerifyEmailIsPopulatedWithProfileEmail");
		}
	}

	public void ClickViewfundFacts() {
		Decorator();
		try {
			String selectedFund = CL.getTestDataInstance().TCParameters.get("Accounts");
			SelectFund(selectedFund);
			mobileAction.FuncSwipeWhileElementNotFound(view_fundFacts, true, 5, "up");
			// mobileAction.FuncClick(view_fundFacts, "view fund Facts");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed to clickviewfundFacts.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for clickviewfundFacts");
		}
	}

	public void VerifyPrepopulatedInformatiom() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(page_title, "Purchase Mutual Funds");
			if (!mobileAction.verifyElementIsPresent(fund_dropdown_list)) {
				mobileAction.FuncSwipeWhileElementNotFound(fund_dropdown_list, false, 10, "down");
			}
			String fundSelected = mobileAction.getValue(fund_dropdown_list);
			if (fundSelected.isEmpty()) {
				mobileAction.Report_Fail("Fund dropdown is not populated");
				return;
			}
			String amountValue = mobileAction.getValue(amount);
			if (amountValue.isEmpty()) {
				mobileAction.Report_Fail("Amount is not populated");
				return;
			}
			mobileAction.FuncSwipeWhileElementNotFound(consent_checkbox, false, 5, "up");

			String emailInfo = mobileAction.getValue(email_info);
			if (emailInfo.isEmpty()) {
				mobileAction.Report_Fail("Email is not populated");
				return;
			}

			String phoneNum = mobileAction.getValue(phone_info);
			if (phoneNum.isEmpty()) {
				mobileAction.Report_Fail("phoneNum is not populated");
				return;
			}
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String checkedStatus = consent_checkbox.getAttribute("checked");
				if (!checkedStatus.equalsIgnoreCase("true")) {
					mobileAction.Report_Fail("Consent check box is not populated");
					return;
				}
			}
			mobileAction.Report_Pass_Verified("Purchase populated information");

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

	public void SelectIneligibleFund() {
		Decorator();
		try {

			mobileAction.FuncClick(fund_dropdown_list, "Funds dorpdown list");

			if (!mobileAction.verifyElementIsPresent(Ineligible_fund)) {
				mobileAction.FuncSwipeWhileElementNotFound(Ineligible_fund, true, 10, "up");
			} else {
				mobileAction.FuncClick(Ineligible_fund, "Ineligible Fund");
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

	public void VerifyErrorMessageForIneligibleFund() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				from_account_name = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT)
								+ "']/..//android.widget.TextView[@resource-id='com.td:id/mf_account_name']",
						"From Account name");

			}
			if (mobileAction.verifyElementIsPresent(from_account_name)) {
				mobileAction.Report_Fail("Failed:From Account is not blank");
				return;
			}

			// String capturedErrorMsg = mobileAction.getValue(error_message);
			String expectedErrorMsg = "Looks like you're not set up to purchase mutual funds. Let us help you by calling \\d{1}-\\d{3}-\\d{3}-\\d{4}.";
			if (currentLocale.equalsIgnoreCase("fr")) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					expectedErrorMsg = "Il semble que vous ne puissiez pas effectuer d’achats. Pour obtenir de l’aide, composez le \\d{1}–\\d{3}–\\d{3}–\\d{4}.";
				} else {
					expectedErrorMsg = "Il semble que vous ne puissiez pas effectuer d’achats. Pour obtenir de l’aide, composez le \\d{1}-\\d{3}-\\d{3}-\\d{4}.";
				}
			}

			mobileAction.verifyElementTextIsDisplayed(error_message, expectedErrorMsg);

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

	public void VerifyErrorMessageForClosedFund() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				from_account_name = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT)
								+ "']/..//android.widget.TextView[@resource-id='com.td:id/mf_account_name']",
						"From Account name");

			}
			if (mobileAction.verifyElementIsPresent(from_account_name)) {
				mobileAction.Report_Fail("Failed:From Account is not blank");
				return;
			}

			// String capturedErrorMsg = mobileAction.getValue(error_message);
			String expectedErrorMsg = "Looks like the account you are using is closed. Try another fund or let us help you by calling \\d{1}-\\d{3}-\\d{3}-\\d{4}.";
			if (currentLocale.equalsIgnoreCase("fr")) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					expectedErrorMsg = "Il semble que le compte est fermé. Essayez avec un autre fonds, ou appelez-nous au \\d{1}–\\d{3}–\\d{3}–\\d{4} pour obtenir de l’aide.";
				} else {
					expectedErrorMsg = "Il semble que le compte est fermé. Essayez avec un autre fonds, ou appelez-nous au \\d{1}-\\d{3}-\\d{3}-\\d{4} pour obtenir de l’aide.";
				}
			}

			mobileAction.verifyElementTextIsDisplayed(error_message, expectedErrorMsg);

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

	public void VerifyErrorMessageWithoutFundSelected() {
		Decorator();
		try {

			String expectedErrorMsg = getTextInCurrentLocale(StringArray.ARRAY_MF_ERROR_NO_FUND_SELECTED);

			String CapturedString = mobileAction.getValue(error_message);
			System.out.println("Captured message:" + CapturedString);
			if (CapturedString.contains(expectedErrorMsg)) {
				mobileAction.Report_Pass_Verified(expectedErrorMsg);
				return;
			}
			mobileAction.Report_Fail("Error message is not expected:" + CapturedString);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyBorrowMoneyYesButton() {
		Decorator();
		try {
			if (!mobileAction.verifyElementIsPresent(borrow_money_warning_message)) {
				mobileAction.FuncClick(borrow_money_yes_button, "Yes");
				if (mobileAction.verifyElementIsPresent(borrow_money_warning_message)) {
					String warningmsg = mobileAction.getValue(borrow_money_warning_message);
					System.out.println("Warning msg:" + warningmsg);
					mobileAction.Report_Pass_Verified("Warning meesage when borrow money set to yes");
				} else {
					mobileAction.Report_Fail("Fail: No Warning meesage when borrow money set to yes");
				}
			} else {
				mobileAction.Report_Pass_Verified("Warning meesage when borrow money set to yes");
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

	public void VerifyEmailAddressIsEditable() {
		Decorator();
		try {
			mobileAction.FuncSwipeWhileElementNotFound(email_info, false, 3, "up");

			String emialInfo = mobileAction.getValue(email_info);

			if (!emialInfo.isEmpty()) {
				System.out.println("Email now:" + emialInfo);
				mobileAction.FuncSendKeys(email_info, "");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
				} else {
					mobileAction.FuncClickDone();
				}

				emialInfo = mobileAction.getValue(email_info);
				emialInfo = replacePlaceholderToNothing(emialInfo, emailPlaceHolder);
				if (emialInfo.isEmpty()) {
					mobileAction.Report_Pass_Verified("Email is edited to empty");
				} else {
					mobileAction.Report_Fail("Email is not empty as expected");
				}
			} else {
				System.out.println("Email is empty");
				mobileAction.FuncSendKeys(email_info, "test@td.com");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
				} else {
					mobileAction.FuncClickDone();
				}

				emialInfo = mobileAction.getValue(email_info);
				if (emialInfo.equalsIgnoreCase("test@td.com")) {
					mobileAction.Report_Pass_Verified("Email is edited to test@td.com");
				} else {
					mobileAction.Report_Fail("Email is:" + emialInfo + " not as expected");
				}
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

}