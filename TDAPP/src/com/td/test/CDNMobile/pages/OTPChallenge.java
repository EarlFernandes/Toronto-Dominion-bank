package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

/**
 * OTP challenge is a webview, try not use native components, instead use
 * webview components to identify key components
 * 
 * @author taydav5
 *
 */
public class OTPChallenge extends _CommonPage {

	private static OTPChallenge OneTimePasswordChallenge;

	//@FindBy(id = "method-sms")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('text')\"]")
	private WebElement textOption;

	//@FindBy(id = "method-voice")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('voice')\"]")
	private WebElement voiceOption;

	@FindBy(id = "getCode")
	private WebElement getCodeButton;

	@AndroidFindBy(id = "com.td:id/loading_indicator_textview")
	private MobileElement progressBar;

	@FindBy(id = "phone_0")
	private WebElement firstPhoneNumber;

	@FindBy(id = "secretCode")
	private WebElement securityCodeField;

	@FindBy(id = "enter")
	private WebElement submitCodeButton;

	@FindBy(xpath = "//div[@id='server-validation']/span[2]")
	private WebElement cannotVerifySecurityCodeMsg;

	@FindBy(xpath = "//div[@id='server-validation']/span[2]")
	private WebElement tooManySecurityCodesRequestedMsg;

	@FindBy(xpath = "//a[@ng-click='ec.resendCode()']")
	private WebElement resendCodeLink;

	@AndroidFindBy(id = "android:id/button3")
	private MobileElement resendCodeDialogTextButton;

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

	public void waitForOTPProgressBarToVanish() {
		Decorator();
		try {
			mobileAction.waitForElementToVanish(progressBar);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void clickTextOption() {
		Decorator();
		try {
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(textOption, "Text option");
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

	public void clickTextVoice() {
		Decorator();
		try {
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(voiceOption, "Voice option");
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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(getCodeButton, "Get Code Button");
			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.waitForElementToVanish(progressBar);
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
		String securityCode = getTestdata("OTPSecurityCode");
		try {
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(securityCodeField, "Security Code Field");
			securityCodeField.sendKeys(securityCode);
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

	public void clickSubmitCodeButton() {
		Decorator();
		try {
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(submitCodeButton, "submit code button");
			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.waitForElementToVanish(progressBar);
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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(firstPhoneNumber, "First phone number");
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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(resendCodeLink, "First phone number");
			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.FuncClick(resendCodeDialogTextButton, "Resend code confirmation dialog, TEXT button");
			mobileAction.waitForElementToVanish(progressBar);
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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
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
}
