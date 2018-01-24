package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Chatbot extends _CommonPage {

	private static Chatbot Chatbot;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	private MobileElement inputField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeKeyboard//XCUIElementTypeButton[4]")
	private MobileElement keyboardSend;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	private MobileElement errorMsg;

	public synchronized static Chatbot get() {
		if (Chatbot == null) {
			Chatbot = new Chatbot();
		}
		return Chatbot;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}

	public void enterQuestion() {
		Decorator();
		try {
			mobileAction.FuncClick(inputField, "Question Input field");
			mobileAction.FuncSendKeys(inputField, "how are you?");
			mobileAction.FuncClick(keyboardSend, "Keyboard Send");
			mobileAction.sleep(5000);

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

	public void verifyHeader() {
		Decorator();
		try {

			MobileElement header = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(header, "Chatbot Header");
			mobileAction.verifyElementTextContains(header,
					this.getTextInCurrentLocale(StringArray.ARRAY_CHATBOT_HEADER));

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

	public void verifyIneligibleUser() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(errorMsg, "Chatbot Error msg");
			mobileAction.verifyElementTextContains(errorMsg,
					this.getTextInCurrentLocale(StringArray.ARRAY_CHATBOT_ERROR_INELIGIBLE));

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

}
