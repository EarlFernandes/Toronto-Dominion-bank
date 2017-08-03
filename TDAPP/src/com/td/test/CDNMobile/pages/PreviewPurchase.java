package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.EnglishStrings;
import com.td.FrenchStrings;
import com.td.StringArray;
import com.td.StringLookup;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PreviewPurchase extends _CommonPage {

	private static PreviewPurchase previewPurchase;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement page_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Phone Number']/../android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement phone_number;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email']/../android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement email;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email']")
	private MobileElement email_label;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Phone Number']")
	private MobileElement phone_label;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='CONTACT INFORMATION']")
	private MobileElement contact_label;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/../XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue']")
	private MobileElement purchase_now_button;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/../XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel']")
	private MobileElement cancel_button;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement alert_info;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeStaticText[1]")
	private MobileElement disclaimer_info;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Amount']/../android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amount_value;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[2]")
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='" + EnglishStrings.MF_ACCEPTED_FUND_DETAIL_FEE
//			+ "' or @text='" + FrenchStrings.MF_ACCEPTED_FUND_DETAIL_FEE
//			+ "']/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement fund_facts_acknowledgement;

	String phoneReg = "\\(\\d{3}\\)\\s*\\d{3}\\s*-\\s*\\d{4}";
	String phoneRegFR = "\\(\\d{3}\\)\\s*\\d{3}\\s*–\\s*\\d{4}";

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_icon;

	public synchronized static PreviewPurchase get() {
		if (previewPurchase == null) {
			previewPurchase = new PreviewPurchase();
		}
		return previewPurchase;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	public void VerifyPreviewPurchasePageHeader() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(page_title,
					getTextInCurrentLocale(StringArray.ARRAY_MF_PREVIEW_PURCHASE_HEADER));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyPreviewPurchasePhoneFormat() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView", 2, "down");
				phone_number = mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@text='" + mobileAction.getAppString("label_phone_number")
										+ "']/../android.widget.RelativeLayout/android.widget.TextView",
								"Phone Number");
			} else {

			}

			String phoneNumber = mobileAction.getValue(phone_number);
			if (phoneNumber.isEmpty()) {
				System.out.println("Phone number is empty");
				mobileAction.Report_Pass_Verified("Empty phone number");
				return;
			}
			System.out.println("Phone number:" + phoneNumber);

			if (phoneNumber.matches(phoneReg)) {
				mobileAction.Report_Pass_Verified("Phone format (111) 1111-1111");
			} else {
				mobileAction.Report_Fail_Not_Verified("Phone format (111) 1111-1111");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyPreviewPurchasePhoneNotMasked() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView",
				// 2, "down");
				String phoneNumberxpath = "//android.widget.TextView[@text='"
						+ mobileAction.getAppString("label_phone_number")
						+ "']/../android.widget.RelativeLayout/android.widget.TextView";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(phoneNumberxpath, false, 10, "up");
				phone_number = mobileAction.verifyElementUsingXPath(phoneNumberxpath, "Phone Number");

			} else {
				mobileAction.FuncSwipeWhileElementNotFound(phone_number, false, 10, "up");
			}

			String phoneNumber = mobileAction.getValue(phone_number);
			if (phoneNumber.isEmpty()) {
				System.out.println("Phone number is empty");
				mobileAction.Report_Pass_Verified("Empty phone number");
				return;
			}
			System.out.println("Phone number:" + phoneNumber);

			if (phoneNumber.matches(phoneReg) || phoneNumber.matches(phoneRegFR)) {
				mobileAction.Report_Pass_Verified("Phone " + phoneNumber + " not masked");
			} else {
				mobileAction.Report_Fail("Phone " + phoneNumber + " is masked");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyPreviewPurchaseContentInChinese() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(page_title, getTextInCurrentLocale(StringArray.ARRAY_MF_PREVIEW_PURCHASE_HEADER));
			String banner_info = getTextInCurrentLocale(StringArray.ARRAY_MF_BANNER_INFO);					
			mobileAction.verifyElementTextIsDisplayed(alert_info, banner_info);

			String[] expectedList = { getTextInCurrentLocale(StringArray.ARRAY_MF_FUNDS), getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT), 
					getTextInCurrentLocale(StringArray.ARRAY_MF_FROM_ACCOUNT),getTextInCurrentLocale(StringArray.ARRAY_MF_TO_ACCOUNT) };
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncSwipeOnce("up");

				List<MobileElement> previewList = ((MobileDriver) CL.GetDriver())
						.findElementsByXPath("//android.widget.TextView[@resource-id='com.td:id/preview_row_label']");

				for (int i = 0; i < expectedList.length; i++) {
					mobileAction.verifyElementTextIsDisplayed(previewList.get(i), expectedList[i]);
				}

			} else {
				for (int i = 0; i < expectedList.length; i++) {
					MobileElement element = (MobileElement) ((MobileDriver) CL.GetDriver()).findElementByXPath(
							"//XCUIElementTypeTable/XCUIElementTypeCell[" + (i + 2) + "]/XCUIElementTypeStaticText[1]");
					mobileAction.verifyElementTextIsDisplayed(element, expectedList[i]);
				}
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				
				contact_label = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("contact_information") + "']",
						"Contact Information");				
				email_label = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + StringLookup.lookupString(currentLocale, StringLookup.FM_EMAIL) + "']",
						"Email");
				phone_label = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + StringLookup.lookupString(currentLocale, StringLookup.FM_PHONE) + "']",
						"Phone Number");
				disclaimer_info = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + StringLookup.lookupString(currentLocale, StringLookup.FM_PHONE) + "']"
								+ "/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/timestampContainer']/android.widget.TextView",
						"Disclaimer Information");

			} else {
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
				mobileAction.FuncSwipeOnce("up");
			}
			mobileAction.verifyElementTextIsDisplayed(contact_label, getTextInCurrentLocale(StringArray.ARRAY_MF_CONTACT_INFO));
			mobileAction.verifyElementTextIsDisplayed(email_label, getTextInCurrentLocale(StringArray.ARRAY_MF_EMAIL));
			mobileAction.verifyElementTextIsDisplayed(phone_label, getTextInCurrentLocale(StringArray.ARRAY_MF_PHONE));
			String disclaimerInfo =getTextInCurrentLocale(StringArray.ARRAY_MF_DISCLAIMER_INFO);
			String capturedText = mobileAction.getValue(disclaimer_info);
			capturedText = capturedText.trim().replaceAll("\n", "");
			capturedText = capturedText.replaceAll(" ", "");
			capturedText = capturedText.replaceAll(" ", "");//empty space of Chinese char
			System.out.println("Captured:" + capturedText);
			mobileAction.verifyTextEquality(capturedText, disclaimerInfo);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyWarningMessageContent() {
		Decorator();
		try {
			String banner_info = getTextInCurrentLocale(StringArray.ARRAY_MF_BANNER_INFO);
			mobileAction.verifyElementTextIsDisplayed(alert_info, banner_info);
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void savePhoneInforForPFVerification() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				String phoneNumberxpath = "//XCUIElementTypeStaticText[@label='"
						+ mobileAction.getAppString("label_phone_number")
						+ "']/following-sibling::XCUIElementTypeStaticText";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(phoneNumberxpath, false, 10, "up");
				phone_number = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("label_phone_number")
								+ "']/following-sibling::XCUIElementTypeStaticText",
						"Email");
			} else {
				String phoneNumberxpath = "//android.widget.TextView[@text='"
						+ mobileAction.getAppString("label_phone_number")
						+ "']/../android.widget.RelativeLayout/android.widget.TextView";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(phoneNumberxpath, false, 10, "up");
				phone_number = mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@text='" + mobileAction.getAppString("label_phone_number")
										+ "']/../android.widget.RelativeLayout/android.widget.TextView",
								"Phone Number");
				// mobileAction.FuncSwipeWhileElementNotFound(phone_number,
				// false, 10, "up");
			}
			String phoneinfo = mobileAction.getValue(phone_number);
			System.out.println("phone got:" + phoneinfo);
			if (!phoneinfo.isEmpty()) {
				CL.getTestDataInstance().TCParameters.put("PhoneProfile", phoneinfo);
				mobileAction.Report_Pass_Verified("phone:" + phoneinfo);
			} else {
				mobileAction.Report_Pass_Verified("Phone is empty");
			}
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void ClickPurchaseNowBtn() {
		Decorator();
		try {
			mobileAction.FuncClick(purchase_now_button, "Purchase");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void ClickCancelMFpurchase() {
		Decorator();
		try {
			mobileAction.FuncClick(cancel_button, "Cancel");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void VerifyUSDAmount() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				amount_value = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_amount")
								+ "']/../android.widget.RelativeLayout/android.widget.TextView",
						"Amount");
			} else {
				amount_value = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ mobileAction.getAppString("str_Amount") + "']/../XCUIElementTypeStaticText[2]", "Amount");
			}

			String amountValue = mobileAction.getValue(amount_value);
			System.out.println("Amount:" + amountValue);
			if (amountValue.toLowerCase().contains("us")) {
				mobileAction.Report_Pass_Verified("USD amount found:" + amountValue);
			} else {
				mobileAction.Report_Fail("USD Amount not found:" + amountValue);
			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void VerifyFundfactsAcknowledgement() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {		
				fund_facts_acknowledgement = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + StringLookup.lookupString(currentLocale, StringLookup.MF_ACCEPTED_FUND_DETAIL) + "']",
						"Accept_Fund_Detail_Fee");
			}
			if (!mobileAction.verifyElementIsPresent(fund_facts_acknowledgement)) {
				mobileAction.FuncSwipeWhileElementNotFound(fund_facts_acknowledgement, false, 5, "up");
			}
			String acknowlegmentText = mobileAction.getValue(fund_facts_acknowledgement);
			System.out.println("acknowlegmentText:" + acknowlegmentText);
			if (acknowlegmentText.toLowerCase().contains("yes") || acknowlegmentText.toLowerCase().contains("oui")) {
				mobileAction.Report_Pass_Verified("Fund acknowledgement is " + acknowlegmentText);
			} else {
				mobileAction.Report_Fail("Fund acknowledgement is " + acknowlegmentText);
			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void GoBackToHomePage() {
		Decorator();
		int count = 10;
		String homeText = getTextInCurrentLocale(StringArray.ARRAY_HOME_HEADER);
		try {
			while (mobileAction.verifyElementIsPresent(back_icon) && count != 0) {
				String pageText = mobileAction.getValue(page_title);
				if(pageText.equalsIgnoreCase(homeText)){
					break;
				}
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncClickBackButton();
				} else {
					mobileAction.FuncClick(back_icon, "<");
				}
				count--;
			}
			System.out.println("Go back to home already");
		} catch (Exception e) {
			System.out.println("Exception: back to home");
		}
	}

}
