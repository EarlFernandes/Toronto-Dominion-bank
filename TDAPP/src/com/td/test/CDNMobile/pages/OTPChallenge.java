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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/**
 * OTP challenge is a webview, try not use native components, instead use
 * webview components to identify key components
 * 
 * @author taydav5
 *
 */
public class OTPChallenge extends _CommonPage {

	private static OTPChallenge OneTimePasswordChallenge;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[2]")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('text')\"]")
	private WebElement textOption;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('voice')\"]")
	private WebElement voiceOption;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(id = "getCode")
	private WebElement getCodeButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(id = "phone_0")
	private WebElement firstPhoneNumber;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextField[1] | //XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeTextField[1]")
	@FindBy(id = "secretCode")
	private WebElement securityCodeField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(id = "enter")
	private WebElement submitCodeButton;

	@iOSXCUITFindBy(xpath = "/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='server-validation']/span[2]")
	private WebElement cannotVerifySecurityCodeMsg;

	@iOSXCUITFindBy(xpath = "/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='server-validation']/span[2]")
	private WebElement tooManySecurityCodesRequestedMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/error_message")
	private WebElement accountDisabledMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]//XCUIElementTypeButton[1]")
	@FindBy(xpath = "//a[contains(@ng-click,'ec.redirect')]")
	private WebElement resendCodeLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button3")
	private MobileElement resendCodeText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]//XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement sessionExpiredOK;

	private String GOOGLE_VOICE_URL = "http://voice.google.com";
	private String GOOGLE_VOICE_login = "tdmobileqa1@gmail.com";
	private String GOOGLE_VOICE_password = "mobileqa1234";

	public synchronized static OTPChallenge get() {
		if (OneTimePasswordChallenge == null) {
			OneTimePasswordChallenge = new OTPChallenge();
		}
		return OneTimePasswordChallenge;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}

	public void clickTextOption() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}

			mobileAction.FuncClick(textOption, "Text option");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickVoiceOption() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}

			mobileAction.FuncClick(voiceOption, "Voice option");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickGetCodeButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}
			mobileAction.FuncClick(getCodeButton, "Get Code Button");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void enterSecurityCode() {
		Decorator();

		try {
			String securityCode = getTestdata("OTPSecurityCode");
			if (securityCode.equalsIgnoreCase("GoogleVoiceRetrieve")) {
				securityCode = this.retrievePasscode();
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}

			mobileAction.FuncClick(securityCodeField, "Security Code Field");
			mobileAction.FuncSendKeys(securityCodeField, securityCode);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone(); // hide iOS keyboard
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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void enterIncorrectSecurityCode() {
		Decorator();

		try {
			String securityCode = "1111";

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}

			mobileAction.FuncClick(securityCodeField, "Security Code Field");
			mobileAction.FuncSendKeys(securityCodeField, securityCode);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone(); // hide iOS keyboard
			}

			clickSubmitCodeButton();

		} catch (Exception e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickSubmitCodeButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}
			mobileAction.FuncClick(submitCodeButton, "submit code button");
			mobileAction.waitForElementToVanish(PageHeader.get().getProgressBar());

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickFirstPhoneNumber() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}

			mobileAction.FuncClick(firstPhoneNumber, "First phone number");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void requestMaxPassCodes() {
		Decorator();
		try {

			for (int i = 0; i < 5; i++) {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
					mobileAction.switchAppiumContext("WEBVIEW_com.td");
				}

				boolean hasMsg = mobileAction.verifyElementIsPresent(tooManySecurityCodesRequestedMsg);
				if (hasMsg) {
					String msgText = mobileAction.FuncGetElementText(tooManySecurityCodesRequestedMsg);
					if (!msgText.contains(getTextInCurrentLocale(
							StringArray.ARRAY_OTP_CHALLENGE_TOO_MANY_SECURITY_CODES_REQUESTED))) {
						clickResendCode();
					} else {
						break;
					}
				} else {
					clickResendCode();
				}
				
				// Doesn't allow immediate code requests, needs to wait some time
				Thread.sleep(30000);

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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickResendCode() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}
			mobileAction.FuncClick(resendCodeLink, "Resend Code button");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				clickTextOption();
				clickGetCodeButton();
			} else {
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(resendCodeText, "Resend Code Dialog, Text button");

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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public String retrievePasscode() {
		String passcode = "";

		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-notifications");
			options.addArguments("disable-infobars");
			options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			WebDriver driver = new ChromeDriver(options);
			driver.get(GOOGLE_VOICE_URL);

			GoogleVoiceWebPage gvPage = new GoogleVoiceWebPage(driver);
			gvPage.clickSignIn();

			gvPage.login(GOOGLE_VOICE_login, GOOGLE_VOICE_password);

			passcode = gvPage.getFirstMessage();
			System.out.println("Lastest passcode: " + passcode);

			driver.close();
			driver.quit();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
		return passcode;
	}

	public void idleTillLoggedOut() {
		Decorator();
		try {
			// Need to wait 2mins for session timeout, but Appium doesn't allow
			// 2mins of inactivity
			for (int i = 0; i < 2; i++) {
				Thread.sleep(1000 * 60);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
					mobileAction.switchAppiumContext("WEBVIEW_com.td");
				} else {
					mobileAction.switchAppiumContext("NATIVE_APP");
				}
			}

			mobileAction.FuncClick(submitCodeButton, "Submit Code button click");

			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.verifyElementIsDisplayed(sessionExpiredOK, "Session Expired dialog, OK button");
			mobileAction.FuncClick(sessionExpiredOK, "Session Expired dialog, OK button");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void verifyInvalidSecurityCodeMsg() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}

			mobileAction.verifyElementIsDisplayed(cannotVerifySecurityCodeMsg, "Cannot verify security message");
			mobileAction.verifyElementTextContains(cannotVerifySecurityCodeMsg,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_CHALLENGE_UNABLE_TO_VERIFY_CODE));
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void verifyTooManySecurityCodesRequestedMsg() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}

			mobileAction.verifyElementIsDisplayed(tooManySecurityCodesRequestedMsg,
					"Too many security codes requested dialog");
			mobileAction.verifyElementTextContains(tooManySecurityCodesRequestedMsg,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_CHALLENGE_TOO_MANY_SECURITY_CODES_REQUESTED));
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void verifyAccountDisabledMsg() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(accountDisabledMsg, "Account Disabled screen");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementTextContains(accountDisabledMsg,
						getTextInCurrentLocale(StringArray.ARRAY_OTP_CHALLENGE_ONLINE_ACCESS_DISABLED));
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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

}
