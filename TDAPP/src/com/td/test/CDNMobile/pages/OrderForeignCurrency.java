package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OrderForeignCurrency extends _CommonPage {

	private static OrderForeignCurrency orderforeignCurrency;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement order_foreign_currency_Banner_Info;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell/XCUIElementTypeStaticText[@label='I have' or @label='J’ai' or @label='现有货币' or @label='現有貨幣']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/converter_container']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='0']")
	private MobileElement currency_I_have;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell/XCUIElementTypeStaticText[@label='I want' or @label='Je veux' or @label='我要兑换' or @label='我要兌換']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/converter_container']/android.widget.LinearLayout[@index='1']/android.widget.TextView[@index='0']")
	private MobileElement currency_I_want;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption']")
	private List<MobileElement> order_dropdown_caption;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/custom_text']")
	private MobileElement contact_info_caption;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label']")
	private List<MobileElement> phone_email_list;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button']")
	private MobileElement preview_currency_order_button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/footer_text']")
	private MobileElement contact_foot_text;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement phone_text;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/description']")
	private MobileElement email_text;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='I want' or @label='Je veux' or @label='我要兑换' or @label='我要兌換']/../XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/fromCurrencyET']//android.widget.EditText[@resource-id='com.td:id/currencyVal']")
	private MobileElement from_currency_amount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='I want' or @label='Je veux' or @label='我要兑换' or @label='我要兌換']/../XCUIElementTypeTextField[2]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/toCurrencyET']//android.widget.EditText[@resource-id='com.td:id/currencyVal']")
	private MobileElement to_currency_amount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='I want' or @label='Je veux' or @label='我要兑换' or @label='我要兌換']/../XCUIElementTypeStaticText[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/fromCurrencyDesc']")
	private MobileElement min_max_value;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='I want' or @label='Je veux' or @label='我要兑换' or @label='我要兌換']/../XCUIElementTypeStaticText[5]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/toCurrencyDesc']")
	private MobileElement exchange_rate;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='I want' or @label='Je veux' or @label='我要兑换' or @label='我要兌換']/../XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/destCD']")
	private MobileElement dest_currency;

	// @iOSXCUITFindBy(iOSClassChain =
	// "**/XCUIElementTypeStaticText[`label=='Select account'`]")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/selectedText' and
	// @text='Select account']")
	private MobileElement from_account_dropdown;

	// @iOSXCUITFindBy(iOSClassChain =
	// "**/XCUIElementTypeStaticText[`label=='Select a branch'`]")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/selectedText' and
	// @text='Select a branch']")
	private MobileElement select_branch_dropdown;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert//XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/oneBtnDialogTitle']")
	private MobileElement rate_expired_text;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert//XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/oneBtnDialogDesc']")
	private MobileElement rate_expired_copy;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert//XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement rate_expired_ok_btn;

	public synchronized static OrderForeignCurrency get() {
		if (orderforeignCurrency == null) {
			orderforeignCurrency = new OrderForeignCurrency();
		}
		return orderforeignCurrency;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);

	}

	public void VerifyOrderForeignCurrencyPageHeader() {
		Decorator();
		try {

			String titleText = getTextInCurrentLocale(StringArray.ARRAY_ORDER_FOREIGN_CURRENCY);
			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(), titleText);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyOrderForeignCurrencyContent() {
		Decorator();
		try {

			VerifyOrderForeignCurrencyPageHeader();

			// if
			// (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android"))
			// {
			// mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info,
			// getTextInCurrentLocale(StringArray.ARRAY_OFX_WARNING_MSG));
			// }

			mobileAction.verifyElementTextIsDisplayed(currency_I_have,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_FORM_I_HAVE));

			mobileAction.verifyElementTextIsDisplayed(currency_I_want,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_FORM_I_WANT));
			mobileAction.FuncSwipeOnce("up");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.verifyElementTextIsDisplayed(order_dropdown_caption.get(0),
						getTextInCurrentLocale(StringArray.ARRAY_RBP_FROM_ACCOUNT));

				mobileAction.verifyElementTextIsDisplayed(order_dropdown_caption.get(1),
						getTextInCurrentLocale(StringArray.ARRAY_OFX_PICKUP_LOCATION));
				// mobileAction.verifyElementTextIsDisplayed(contact_info_caption,
				// getTextInCurrentLocale(StringArray.ARRAY_OFX_CONTACT_INFO));

				mobileAction.verifyElementTextIsDisplayed(phone_email_list.get(0),
						getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE));

				mobileAction.verifyElementTextIsDisplayed(phone_email_list.get(1),
						getTextInCurrentLocale(StringArray.ARRAY_OFX_EMAIL));

				mobileAction.verifyElementTextIsDisplayed(contact_foot_text,
						getTextInCurrentLocale(StringArray.ARRAY_OFX_CONTACT_COPY_TEXT));
			} else {
				String fromAccountText = getTextInCurrentLocale(StringArray.ARRAY_RBP_FROM_ACCOUNT);
				String fromAccountXpath = "//XCUIElementTypeStaticText[@label='" + fromAccountText + "']";
				String pickupLocationText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PICKUP_LOCATION);
				String pickupLocation = "//XCUIElementTypeStaticText[@label='" + pickupLocationText + "']";
				// String contactText =
				// getTextInCurrentLocale(StringArray.ARRAY_OFX_CONTACT_INFO);
				// String contactInfoxpath = "//XCUIElementTypeStaticText[@label='" +
				// contactText + "']";
				String phoneText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + phoneText + "']";
				String emailText = getTextInCurrentLocale(StringArray.ARRAY_OFX_EMAIL);
				String emailxpath = "//XCUIElementTypeStaticText[@label='" + emailText + "']";
				String contactCopylText = getTextInCurrentLocale(StringArray.ARRAY_OFX_CONTACT_COPY_TEXT);
				String contactcopyxpath = "//XCUIElementTypeStaticText[@label='" + contactCopylText + "']";

				mobileAction.verifyElementUsingXPath(fromAccountXpath, fromAccountText);
				mobileAction.verifyElementUsingXPath(pickupLocation, pickupLocationText);
				// mobileAction.verifyElementUsingXPath(contactInfoxpath, contactText);
				mobileAction.verifyElementUsingXPath(phonexpath, phoneText);
				mobileAction.verifyElementUsingXPath(emailxpath, emailText);
				mobileAction.verifyElementUsingXPath(contactcopyxpath, contactCopylText);
			}

			mobileAction.verifyElementTextIsDisplayed(preview_currency_order_button,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_CONTINUE));

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

	public void verifyPhoneIsPrefilledWithProfileMobile() {
		Decorator();
		try {
			String phonetexe = "";
			String expectedPhone = CL.getTestDataInstance().TCParameters.get("PhoneProfile");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {

				String phoneText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + phoneText
						+ "']/../XCUIElementTypeTextField";

				phone_text = mobileAction.verifyElementUsingXPath(phonexpath, phoneText);
			}
			phonetexe = mobileAction.getValue(phone_text);
			System.out.println("Captured phone:" + phonetexe);
			System.out.println("Expected phone:" + expectedPhone);
			if (phonetexe.contentEquals(expectedPhone)) {
				mobileAction.Report_Pass_Verified("Phone is prefilled with profile mobile phone number");
			} else {
				mobileAction.Report_Fail("Phone is NOT prefilled with profile mobile phone number");
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

	public void verifyPhoneIsPrefilledWithProfileHome() {
		Decorator();
		try {
			String phonetexe = "";
			String expectedPhone = CL.getTestDataInstance().TCParameters.get("PhoneProfile");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {

				String phoneText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + phoneText
						+ "']/../XCUIElementTypeTextField";

				phone_text = mobileAction.verifyElementUsingXPath(phonexpath, phoneText);
			}
			phonetexe = mobileAction.getValue(phone_text);

			if (phonetexe.contentEquals(expectedPhone)) {
				mobileAction.Report_Pass_Verified("Phone is prefilled with profile Home phone number");
			} else {
				mobileAction.Report_Fail("Phone is NOT prefilled with profile Home phone number");
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

	public void verifyPhoneIsPrefilledWithNothing() {
		Decorator();
		try {
			String phonetexe = "";
			String expectedPhone = getTextInCurrentLocale(StringArray.ARRAY_MF_PHONE_PLACEHOLDER);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {

				String phoneText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + phoneText
						+ "']/../XCUIElementTypeTextField";

				phone_text = mobileAction.verifyElementUsingXPath(phonexpath, phoneText);

			}

			phonetexe = mobileAction.getValue(phone_text);

			if (phonetexe.isEmpty() || phonetexe.contentEquals(expectedPhone)) {
				mobileAction.Report_Pass_Verified("Phone is prefilled with nothing");
			} else {
				mobileAction.Report_Fail("Phone is prefilled with number:" + phonetexe);
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

	public void verifyemailIsPrefilledWithProfileEmail() {
		Decorator();
		try {
			String emailtexe = "";
			String expectedEmail = CL.getTestDataInstance().TCParameters.get("EmailProfile");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				mobileAction.FuncSwipeOnce("up");

			} else {

				String emailText = getTextInCurrentLocale(StringArray.ARRAY_OFX_EMAIL);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + emailText
						+ "']/../XCUIElementTypeTextField";

				email_text = mobileAction.verifyElementUsingXPath(phonexpath, emailText);

			}
			emailtexe = mobileAction.getValue(email_text);

			if (emailtexe.contentEquals(expectedEmail)) {
				mobileAction.Report_Pass_Verified("Email is prefilled with profile email");
			} else {
				mobileAction.Report_Fail("Email is NOT prefilled with profile email");
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

	public void verifyEmailCanBeEdited() {
		Decorator();
		try {
			String emailtexe = "";

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				mobileAction.FuncSwipeOnce("up");

			} else {

				String emailText = getTextInCurrentLocale(StringArray.ARRAY_OFX_EMAIL);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + emailText
						+ "']/../XCUIElementTypeTextField";

				email_text = mobileAction.verifyElementUsingXPath(phonexpath, emailText);

			}
			
			mobileAction.FuncSendKeys(email_text, "abcd1234_new@td.com");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}
			emailtexe = mobileAction.getValue(email_text);
			if(emailtexe.contentEquals("abcd1234_new@td.com")) {
				mobileAction.Report_Pass_Verified("Email address can be edited");
			} else {
				mobileAction.Report_Fail("Failed to edit email address");
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

	public void verifyErrorWithInvalidEmail() {
		Decorator();
		try {
			String emailtexe = getTestdata("EmailProfile");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				mobileAction.FuncSwipeOnce("up");

			} else {

				String emailText = getTextInCurrentLocale(StringArray.ARRAY_OFX_EMAIL);
				String emailxpath = "//XCUIElementTypeStaticText[@label='" + emailText
						+ "']/../XCUIElementTypeTextField";

				email_text = mobileAction.verifyElementUsingXPath(emailxpath, emailText);

			}
			mobileAction.FuncSendKeys(email_text, emailtexe);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			// String capturedError = mobileAction.getValue(error_message);
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_INVALID_EMAIL_ERROR);
			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info, expectedError);

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

	public void verifyErrorWithInvalidPhone() {
		Decorator();
		try {
			String phonetext = getTestdata("PhoneProfile");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				mobileAction.FuncSwipeOnce("up");

			} else {

				String phoneText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + phoneText
						+ "']/../XCUIElementTypeTextField";

				phone_text = mobileAction.verifyElementUsingXPath(phonexpath, phoneText);

			}
			mobileAction.FuncSendKeys(phone_text, phonetext);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			// String capturedError = mobileAction.getValue(error_message);
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_INVALID_PHONE_ERROR);
			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info, expectedError);

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

	public void verifyInsufficientFundError() {
		Decorator();
		try {
			Fill_OFX_Form();

			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_ERROR_AMOUNT_GREATER_BALANCE);
			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info, expectedError);
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

	public void verifyNoErrorWithEmptyEmail() {
		Decorator();
		try {
			String emailtexe = "";

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				mobileAction.FuncSwipeOnce("up");

			} else {

				String emailText = getTextInCurrentLocale(StringArray.ARRAY_OFX_EMAIL);
				String emailxpath = "//XCUIElementTypeStaticText[@label='" + emailText
						+ "']/../XCUIElementTypeTextField";

				email_text = mobileAction.verifyElementUsingXPath(emailxpath, emailText);

			}
			mobileAction.FuncSendKeys(email_text, emailtexe);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			// String capturedError = mobileAction.getValue(error_message);
			// String expectedError =
			// getTextInCurrentLocale(StringArray.ARRAY_OFX_INVALID_EMAIL_ERROR);
			// mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info,
			// expectedError);

			if (mobileAction.verifyElementIsPresent(order_foreign_currency_Banner_Info)) {
				String errorMsg = mobileAction.getValue(order_foreign_currency_Banner_Info);
				if (errorMsg.equalsIgnoreCase("canadian_dollar")) {
					mobileAction.Report_Pass_Verified("No error message found for empty email");
				} else {
					mobileAction.Report_Fail(
							"Error message found:" + mobileAction.getValue(order_foreign_currency_Banner_Info));
				}

			} else {
				mobileAction.Report_Pass_Verified("No error message found for empty email");
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

	public void verifyMinErrorWithCADAmount() {
		Decorator();
		try {

			mobileAction.FuncSendKeys(from_currency_amount, "99");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_MIN_CAD_AMOUNT_ERROR);
			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info, expectedError);

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

	public void verifyMaxErrorWithCADAmount() {
		Decorator();
		try {

			mobileAction.FuncSendKeys(from_currency_amount, "595959");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_MAX_CAD_AMOUNT_ERROR);
			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info, expectedError);

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

	public void verifyMaxErrorWithForignAmount() {
		Decorator();
		try {

			mobileAction.FuncSendKeys(to_currency_amount, "35001.5");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_MAX_DES_AMOUNT_ERROR);
			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info, expectedError);

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

	public void clickCurrencySelection() {
		Decorator();
		try {
			mobileAction.FuncClick(dest_currency, "Currency Selection Button");

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

	public void verifyCurrencyUpdatedAsSelected() {
		Decorator();
		try {
			String expectedCurrency = CL.getTestDataInstance().TCParameters.get("Description");
			String capturedCurrency = mobileAction.getValue(dest_currency);
			if(capturedCurrency.contains(" ")) {
				capturedCurrency = capturedCurrency.split(" ")[1].trim();
			}
			if (expectedCurrency.contains(capturedCurrency)) {
				mobileAction.Report_Pass_Verified("Currency:" + capturedCurrency + " is the selected");
			} else {
				mobileAction
						.Report_Fail("Currency:" + capturedCurrency + " is not the selected one:" + expectedCurrency);
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

	public void verifycurrencyRateUpdatedtoSelectedCurrency() {
		Decorator();
		try {
			String expectedCurrency = CL.getTestDataInstance().TCParameters.get("Description");
			if (!expectedCurrency.matches(".*\\(.*\\)")) {
				System.out.println("No currency symbol found:" + expectedCurrency);
				mobileAction.Report_Fail("No currency symbol found");
				return;
			}
			String newCurrency = mobileAction.FuncGetValByRegx(expectedCurrency, "\\(.*\\)");
			newCurrency = newCurrency.replace("(", "").replace(")", "").trim();

			System.out.println("New Currency:" + newCurrency);
			String capturedCurrency = mobileAction.getValue(exchange_rate);
			if (capturedCurrency.matches("1\\s*CAD\\s*=\\s*\\d+\\.\\d+\\s*" + newCurrency)) {
				mobileAction.Report_Pass_Verified("Exchange Rate is updated to new currency:" + newCurrency);
			} else {
				mobileAction.Report_Fail("Exchange Rate is not updated to new currency:" + newCurrency);
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

	public void verifyIncrementBannerforCurrencyUpdate() {
		Decorator();
		try {

			mobileAction.FuncSendKeys(to_currency_amount, "3511.25");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");

			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_CURRENCY_ADJUST_WARNING));

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

	public void verifyIncrementBannerforCADUpdate() {
		Decorator();
		try {

			mobileAction.FuncSendKeys(from_currency_amount, "120");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");

			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_CURRENCY_ADJUST_WARNING));
			// if
			// (mobileAction.verifyElementIsPresent(order_foreign_currency_Banner_Info))
			// {
			// String incrementBanner =
			// mobileAction.getValue(order_foreign_currency_Banner_Info);
			// System.out.println("Increment banner:" + incrementBanner);
			// mobileAction.Report_Pass_Verified(incrementBanner);
			// } else {
			// mobileAction.Report_Fail("No increment banner found");
			// }

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

	public void VerifyRateAndMinMaxValueFormat() {
		Decorator();
		try {

			String capturedCurrency = mobileAction.getValue(exchange_rate);
			String rateFormat = getTextInCurrentLocale(StringArray.ARRAY_OFX_RATE_FORMAT);
			if (capturedCurrency.matches(rateFormat)) {
				mobileAction.Report_Pass_Verified("Exchange Rate format 1 CAD = X");
			} else {
				mobileAction.Report_Fail("Failed to verify exchange Rate format:" + capturedCurrency);
			}

			String capturedMinMaxValue = mobileAction.getValue(min_max_value);
			System.out.println("capturedMinMaxValue:" + capturedMinMaxValue);
			String minmaxFormat = getTextInCurrentLocale(StringArray.ARRAY_OFX_MIN_MAX_FORMAT);
			if (capturedMinMaxValue.matches(minmaxFormat)) {
				mobileAction.Report_Pass_Verified("Min Max without decimal");
			} else {
				mobileAction.Report_Fail("Failed to verify Min Max format:" + capturedMinMaxValue);
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

	private void init_from_account_dropdown() {
		String xpath = "";
		String fromaccountText = getTextInCurrentLocale(StringArray.ARRAY_OFX_SELECT_ACCOUNT_DEFAULT);
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			xpath = "//XCUIElementTypeStaticText[@label='" + fromaccountText + "']";
		} else {
			xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='" + fromaccountText
					+ "']";
		}
		try {
			from_account_dropdown = mobileAction.verifyElementUsingXPath(xpath, "From Account Dropdown");
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Failed to init from account dropdown");
		}

	}

	private void init_pickup_location_dropdown() {
		String xpath = "";
		String pickLocationText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_PICKUP_LOCATION_DEFAULT);
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			xpath = "//XCUIElementTypeStaticText[@label='" + pickLocationText + "']";
		} else {
			xpath = "//android.widget.TextView[@text='" + pickLocationText + "']";
		}
		try {
			select_branch_dropdown = mobileAction.verifyElementUsingXPath(xpath, "Pickup Location Dropdown");
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Failed to init Pickup Location dropdown");
		}

	}

	private String selectFromAccount() {

		String from_Account = getTestdata("FromAccount");

		String AccountNum = mobileAction.FuncGetValByRegx(from_Account, "\\d+");

		String accountName = from_Account.replaceAll(AccountNum, "").trim();

		if (accountName.contains("\\|")) {
			String[] s_AccountName = accountName.split("\\|");
			if (currentLocale.equalsIgnoreCase("fr")) {
				accountName = s_AccountName[1];
			} else {
				accountName = s_AccountName[0];
			}
		}

		try {
			init_from_account_dropdown();
			mobileAction.FuncClick(from_account_dropdown, "From Account clicked");
			String fromAccountxPath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				fromAccountxPath = "//XCUIElementTypeStaticText[contains(@label,'" + AccountNum + "')]";
			} else {
				fromAccountxPath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNoValue' and @text='"
						+ AccountNum + "']";
			}
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(fromAccountxPath, true, 10, "up");
			if (!accountName.isEmpty()) {
				return accountName;
			} else {
				return AccountNum;
			}

		} catch (Exception e) {
			System.out.println("Failed to select account:" + from_Account);
			return "";
		}
	}

	private void fillPhoneIfnotprefilled() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				if (!mobileAction.verifyElementIsPresent(phone_text))
					mobileAction.FuncSwipeOnce("up");

			} else {

				String phoneText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + phoneText
						+ "']/../XCUIElementTypeTextField";

				phone_text = mobileAction.verifyElementUsingXPath(phonexpath, phoneText);

			}

			String prefilledPhone = mobileAction.getValue(phone_text);
			String defaultPhone = getTextInCurrentLocale(StringArray.ARRAY_MF_PHONE_PLACEHOLDER);
			if (prefilledPhone == null || prefilledPhone.contentEquals(defaultPhone)) {
				System.out.println("Phone is empty");
				mobileAction.FuncSendKeys(phone_text, "4239877687");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
				} else {
					mobileAction.FuncClickDone();
				}
			} else {
				System.out.println("Phone is prefilled with:" + prefilledPhone);
			}

		} catch (Exception e) {

		}
	}

	private void fillEmailIfnotprefilled() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				if (!mobileAction.verifyElementIsPresent(email_text))
					mobileAction.FuncSwipeOnce("up");

			} else {

				String emailText = getTextInCurrentLocale(StringArray.ARRAY_OFX_EMAIL);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + emailText
						+ "']/../XCUIElementTypeTextField";

				email_text = mobileAction.verifyElementUsingXPath(phonexpath, emailText);

			}

			String prefilledEmail = mobileAction.getValue(email_text);
			String defaultPhone = getTextInCurrentLocale(StringArray.ARRAY_MF_EMAIL_PLACEHOLDER);
			if (prefilledEmail == null || prefilledEmail.contains(defaultPhone)) {
				System.out.println("Email is empty");
				mobileAction.FuncSendKeys(email_text, "abcde@td.com");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
				} else {
					mobileAction.FuncClickDone();
				}
			} else {
				System.out.println("Email is prefilled with:" + prefilledEmail);
			}

		} catch (Exception e) {

		}
	}

	public void Fill_OFX_Form() {
		Decorator();
		try {

			String USD_value = CL.getTestDataInstance().TCParameters.get("Amount");
			mobileAction.FuncSendKeys(to_currency_amount, USD_value);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			selectFromAccount();
			init_pickup_location_dropdown();
			mobileAction.FuncClick(select_branch_dropdown, "Select a branch");

			FindLocations.get().SelectBranchLocation();
			Branch.get().clickSendMyCurrencyHereButton();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncSwipeOnce("up");
			}
			fillPhoneIfnotprefilled();
			fillEmailIfnotprefilled();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncSwipeOnce("down");
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

	public void ClickPreviewCurrencyOrder() {
		Decorator();
		try {
			mobileAction.FuncClick(preview_currency_order_button, "Preview Currency Order Button");

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

	public void waitForRateTimerExpired() {
		Decorator();
		boolean toScrollUp = false;
		try {
			for (int i = 0; i < 16; i++) {
				Thread.sleep(60000);
				if (toScrollUp) {
					mobileAction.FuncSwipeOnce("up");
					toScrollUp = false;
				} else {
					mobileAction.FuncSwipeOnce("down");
					toScrollUp = true;
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

	public void verifyRateExpiredContent() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(rate_expired_text,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_RATE_EXPIRED));
			mobileAction.verifyElementTextIsDisplayed(rate_expired_copy,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_RATE_EXPIRED_COPY));
			mobileAction.verifyElementTextIsDisplayed(rate_expired_ok_btn,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_RATE_EXPIRED_OK));

			mobileAction.FuncClick(rate_expired_ok_btn, "OK");
			// VerifyOrderForeignCurrencyPageHeader();

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

	public void verifyMinErrorWhileUpdateCurrency() {
		Decorator();
		try {
			mobileAction.FuncSendKeys(from_currency_amount, "59");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_MIN_CAD_AMOUNT_ERROR);
			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info, expectedError);

			mobileAction.FuncClick(dest_currency, "Currency Selection Button");
			Currency.get().randomSelectCurrency();
			mobileAction.FuncSwipeOnce("down");
			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_Banner_Info, expectedError);

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

	public void verifyConversionRateWithoutTrailing0() {
		Decorator();
		try {

			String capturedCurrency = mobileAction.getValue(exchange_rate);
			if (capturedCurrency.matches(".*\\.\\d+.*")) {
				String ratedecimal = mobileAction.FuncGetValByRegx(capturedCurrency, "\\.\\d+");
				if (ratedecimal.matches("\\.\\d*0+")) {
					mobileAction.Report_Fail("Failed rate contains trailing 0:" + capturedCurrency);
				} else {
					mobileAction.Report_Pass_Verified("Exchange Rate without trailing 0");
				}
			} else {
				mobileAction.Report_Pass_Verified("Exchange Rate without trailing 0");
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
