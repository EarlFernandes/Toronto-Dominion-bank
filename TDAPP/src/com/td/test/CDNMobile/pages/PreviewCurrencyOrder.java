package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PreviewCurrencyOrder extends _CommonPage {

	private static PreviewCurrencyOrder previewCurrencyOrder;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement preview_warning;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue']")
	private MobileElement order_now_button;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel']")
	private MobileElement Cancel_currency_order;

	public synchronized static PreviewCurrencyOrder get() {
		if (previewCurrencyOrder == null) {
			previewCurrencyOrder = new PreviewCurrencyOrder();
		}
		return previewCurrencyOrder;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void VerifyPreviewCurrencyOrderPageHeader() {
		Decorator();
		try {
			String titleText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_CURRENCY_ORDER);
			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(), titleText);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyPreviewCurrencyOrderContent() {
		Decorator();
		try {
			VerifyPreviewCurrencyOrderPageHeader();
			mobileAction.verifyElementTextIsDisplayed(preview_warning,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_WARNING));
			String[] expectedTextArray = { getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_CURRENCY),
					getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_EXCHANGE_RATE),
					getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_AMOUNT),
					getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_DEBIT_AMOUNT),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_FROM_ACCOUNT),
					getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_PICKUP_LOCATION),
					getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE),
					getTextInCurrentLocale(StringArray.ARRAY_OFX_PREVIEW_EMAIL)

			};
			String elementXpath = "";
			for (int i = 0; i < expectedTextArray.length; i++) {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					elementXpath = "//android.widget.TextView[@text='" + expectedTextArray[i] + "']";
				} else {
					elementXpath = "//XCUIElementTypeStaticText[@label='" + expectedTextArray[i] + "']";
				}

				if (mobileAction.verifyElementIsPresentByXpath(elementXpath)) {
					mobileAction.Report_Pass_Verified(expectedTextArray[i]);
				} else {
					mobileAction.FuncSwipeOnce("up");
					mobileAction.verifyElementUsingXPath(elementXpath, expectedTextArray[i]);
				}
			}
						
			mobileAction.verifyElementTextIsDisplayed(order_now_button,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_ORDER_NOW));
			mobileAction.verifyElementTextIsDisplayed(Cancel_currency_order,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYEE_FILTER_CANCEL_BUTTON));

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickOrderNow() {
		Decorator();
		try {

			mobileAction.FuncClick(order_now_button, "Order Now");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyOFXPhoneisMasked() {
		Decorator();
		try {
			
			String phoneXpath = "";
			String phoneText = getTextInCurrentLocale(StringArray.ARRAY_OFX_PHONE);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				phoneXpath = "//android.widget.TextView[@text='" + phoneText
						+ "']/../android.widget.RelativeLayout/android.widget.TextView";
			} else {
				phoneXpath = "//XCUIElementTypeStaticText[@label='" + phoneText
						+ "']/following-sibling::XCUIElementTypeStaticText";
			}
			//mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(phoneXpath, false, 2, "up");
			MobileElement phoneItem = mobileAction.verifyElementUsingXPath(phoneXpath, "Phone Info");
			String phonInfo = mobileAction.getValue(phoneItem);
			if (phonInfo.matches("\\(•{3}\\)\\s*•{3}\\s*-\\s*\\d{4}")) {
				mobileAction.Report_Pass_Verified("Phone masked");
			} else {
				mobileAction.Report_Fail("Phone is not masked:" + phonInfo);
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void clickOFXCancelButton() {
		Decorator();
		try {
			mobileAction.FuncClick(Cancel_currency_order, "Cancel Currency Order");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
