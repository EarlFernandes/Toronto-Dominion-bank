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

public class Popupwindow extends _CommonPage {

	private static Popupwindow popup;

	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private MobileElement cancel_button;

	@iOSFindBy(xpath = "//*[@label='Yes, go back' or @label='Oui']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement goback_button;

	@iOSFindBy(xpath = "//*[@name='alert_ok_button']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private MobileElement back_button;

	@iOSFindBy(xpath = "//*[@name='alert_ok_button']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement cancel_order_button;

	@iOSFindBy(xpath = "//*[@name='alert_ok_button']/../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' or @resource-id='com.td:id/dialog_message']")
	private MobileElement popup_message;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' or @resource-id='com.td:id/dialog_message']")
	private MobileElement rbp_popup_message;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel' or @label='Annuler' or @label='取消']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/positive_button']")
	private MobileElement bill_cancel_button;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Order' or @label='Annuler la commande' or @label='取消订单' or @label='取消訂單']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/positive_button']")
	private MobileElement ofx_cancel_button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label=\"Don't Cancel\" or @label='Ne pas annuler' or @label='不取消']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/negative_button']")
	private MobileElement bill_dont_cancel_button;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label=\"Don't Cancel\" or @label='Ne pas annuler' or @label='不要取消']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/negative_button']")
	private MobileElement ofx_dont_cancel_button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Order' or @label='Annuler la commande' or @label='取消订单' or @label='取消訂單']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/positive_button']")
	private MobileElement order_cancel_button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label=\"Don't Cancel\" or @label='Ne pas annuler' or @label='不要取消']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/negative_button']")
	private MobileElement order_dont_cancel_button;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/dialog_title']")
	private MobileElement popup_message_title;

	public synchronized static Popupwindow get() {
		if (popup == null) {
			popup = new Popupwindow();
		}
		return popup;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	public void VerifyPopUpWithCancelButton() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(cancel_button, "Cancel");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void ClickPopupGoBackButton() {
		Decorator();
		try {
			mobileAction.FuncClick(goback_button, "Yes, Go Back");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void ClickPopupCancelOrderButton() {
		Decorator();
		try {
			mobileAction.FuncClick(cancel_order_button, "Cancel Order");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void VerifyCancelPopUpMessage() {
		Decorator();
		try {
			String expectedMsg = "Are you sure you want to cancel this order? |Êtes-vous certain de vouloir annuler cet ordre? |您确定要取消该订单？ | 確定要取消此訂單？";
			mobileAction.verifyElementTextIsDisplayed(popup_message, expectedMsg);
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void ClickRBPPopupCancelButton() {
		Decorator();
		try {
			mobileAction.FuncClick(bill_cancel_button, "Cancel Bill");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void ClickRBPPopupDontCancelButton() {
		Decorator();
		try {
			mobileAction.FuncClick(bill_dont_cancel_button, "Don't Cancel Bill");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void verifyPopupCancelPayment() {
		Decorator();
		try {
			String expectedMsg = getTextInCurrentLocale(StringArray.ARRAY_RBP_POPUP_CANCEL_PAYMENT);
			mobileAction.verifyElementTextIsDisplayed(rbp_popup_message, expectedMsg);
			mobileAction.verifyElementTextIsDisplayed(bill_cancel_button,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYEE_FILTER_CANCEL_BUTTON));
			mobileAction.verifyElementTextIsDisplayed(bill_dont_cancel_button,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_POPUP_DONT_CANCEL));

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void verifyPopupCancelCurrencyOrder() {
		Decorator();
		try {
			String expectedTitle = getTextInCurrentLocale(StringArray.ARRAY_OFX_POPUP_CANCEL_TITLE);
			String expectedMsg = getTextInCurrentLocale(StringArray.ARRAY_OFX_POPUP_CANCEL_ORDER);
			mobileAction.verifyElementTextIsDisplayed(popup_message_title, expectedTitle);
			mobileAction.verifyElementTextIsDisplayed(rbp_popup_message, expectedMsg);
			mobileAction.verifyElementTextIsDisplayed(order_cancel_button,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_POPUP_CANCEL));
			mobileAction.verifyElementTextIsDisplayed(order_dont_cancel_button,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_POPUP_DONT_CANCEL));

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}
	
	public void ClickOFXPopupCancelButton() {
		Decorator();
		try {
			mobileAction.FuncClick(ofx_cancel_button, "Cancel Order");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}
	
	public void ClickOFXPopupDontCancelButton() {
		Decorator();
		try {
			mobileAction.FuncClick(ofx_dont_cancel_button, "Don't Cancel Order");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}
}
