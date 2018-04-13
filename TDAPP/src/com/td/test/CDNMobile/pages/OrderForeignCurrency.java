package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='I want' or @label='Je veux' or @label='我要兑换' or @label='我要兌換']/../XCUIElementTypeStaticText[5]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/toCurrencyDesc']")
	private MobileElement min_max_value;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='I want' or @label='Je veux' or @label='我要兑换' or @label='我要兌換']/../XCUIElementTypeStaticText[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/fromCurrencyDesc']")
	private MobileElement exchange_rate;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='I want' or @label='Je veux' or @label='我要兑换' or @label='我要兌換']/../XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/destCD']")
	private MobileElement dest_currency;

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
				mobileAction.verifyElementTextIsDisplayed(contact_info_caption,
						getTextInCurrentLocale(StringArray.ARRAY_OFX_CONTACT_INFO));

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
				String contactText = getTextInCurrentLocale(StringArray.ARRAY_OFX_CONTACT_INFO);
				String contactInfoxpath = "//XCUIElementTypeStaticText[@label='" + contactText + "']";
				String phoneText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + phoneText + "']";
				String emailText = getTextInCurrentLocale(StringArray.ARRAY_OFX_EMAIL);
				String emailxpath = "//XCUIElementTypeStaticText[@label='" + emailText + "']";
				String contactCopylText = getTextInCurrentLocale(StringArray.ARRAY_OFX_CONTACT_COPY_TEXT);
				String contactcopyxpath = "//XCUIElementTypeStaticText[@label='" + contactCopylText + "']";

				mobileAction.verifyElementUsingXPath(fromAccountXpath, fromAccountText);
				mobileAction.verifyElementUsingXPath(pickupLocation, pickupLocationText);
				mobileAction.verifyElementUsingXPath(contactInfoxpath, contactText);
				mobileAction.verifyElementUsingXPath(phonexpath, phoneText);
				mobileAction.verifyElementUsingXPath(emailxpath, emailText);
				mobileAction.verifyElementUsingXPath(contactcopyxpath, contactCopylText);
			}

			mobileAction.verifyElementTextIsDisplayed(preview_currency_order_button,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_CURRENCY_ORDER));

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
			emailtexe = mobileAction.getValue(email_text);

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
			;

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
			;

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				mobileAction.FuncSwipeOnce("up");

			} else {

				String phoneText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE);
				String phonexpath = "//XCUIElementTypeStaticText[@label='" + phoneText
						+ "']/../XCUIElementTypeTextField";

				email_text = mobileAction.verifyElementUsingXPath(phonexpath, phoneText);

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
				mobileAction.Report_Fail(
						"Error message found:" + mobileAction.getValue(order_foreign_currency_Banner_Info));
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

			mobileAction.FuncSendKeys(from_currency_amount, "129");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_MIN_AMOUNT_ERROR);
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

			mobileAction.FuncSendKeys(from_currency_amount, "5000.5");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_MAX_AMOUNT_ERROR);
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

			mobileAction.FuncSendKeys(to_currency_amount, "3850.5");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_OFX_MAX_AMOUNT_ERROR);
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
			// mobileAction.verifyElementTextIsDisplayed(dest_currency,
			// expectedCurrency);
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

			mobileAction.FuncSendKeys(to_currency_amount, "3500");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			if (mobileAction.verifyElementIsPresent(order_foreign_currency_Banner_Info)) {
				String incrementBanner = mobileAction.getValue(order_foreign_currency_Banner_Info);
				System.out.println("Increment banner:" + incrementBanner);
				mobileAction.Report_Pass_Verified(incrementBanner);
			} else {
				mobileAction.Report_Fail("No increment banner found");
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

	public void verifyIncrementBannerforCADUpdate() {
		Decorator();
		try {

			mobileAction.FuncSendKeys(from_currency_amount, "3500");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.FuncSwipeOnce("down");
			if (mobileAction.verifyElementIsPresent(order_foreign_currency_Banner_Info)) {
				String incrementBanner = mobileAction.getValue(order_foreign_currency_Banner_Info);
				System.out.println("Increment banner:" + incrementBanner);
				mobileAction.Report_Pass_Verified(incrementBanner);
			} else {
				mobileAction.Report_Fail("No increment banner found");
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

	public void VerifyRateAndMinMaxValueFormat() {
		Decorator();
		try {

			String capturedCurrency = mobileAction.getValue(exchange_rate);
			if (capturedCurrency.matches("1\\s*CAD\\s*=\\s*\\d+\\.\\d+.*")) {
				mobileAction.Report_Pass_Verified("Exchange Rate format 1 CAD = X");
			} else {
				mobileAction.Report_Fail("Failed to verify exchange Rate format:" + capturedCurrency);
			}

			String capturedMinMaxValue = mobileAction.getValue(min_max_value);
			System.out.println("capturedMinMaxValue:"+capturedMinMaxValue);
			
			if(capturedMinMaxValue.matches("Min:\\s*\\d+(,\\d+)*\\s*Max:\\s*\\d+(,\\d+)*")) {
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

}
