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

/**
 * OTP Setup is a webview, try not use native components, instead use webview
 * components to identify key components
 * 
 * @author hochil5
 *
 */
public class OTPSetup extends _CommonPage {

	private static OTPSetup OneTimePasswordSetup;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/btn_primary")
	private MobileElement getStartedNewButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement getStartedExistingButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/btn_cancel")
	private MobileElement notnowButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement securitySettingsOK;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/btn_primary")
	private MobileElement continueButton;

	@iOSXCUITFindBy(accessibility = "TDTERMS_BASE_ACCEPT_BTN")
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement agreeButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'Phone number') or contains(@value,'Numéro de téléphone') or contains(@value,'电话号码') or contains(@value,'電話號碼') ]")
	@FindBy(id = "numberPhone")
	private WebElement editPhoneField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]")
	@FindBy(id = "nickname")
	private WebElement editNicknameField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "addPhoneEnter")
	private WebElement addPhoneButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement confirmButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Add Another Number') or contains(@label,'Ajouter un autre téléphone') or contains(@label,'添加其他号码') or contains(@label,'新增另一個號碼') ]")
	@FindBy(xpath = "//a[contains(@ng-click,'add-phone')]")
	private WebElement addAnotherPhoneButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "addPhoneSubmit")
	private WebElement addPhoneContinueButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/alertTitle")
	private MobileElement addAnotherPhoneDialogTitle;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_0']/div/div/div[1]")
	private WebElement phoneCard1Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_0']/div/div/div[2]")
	private WebElement phoneCard1Nickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_1']/div/div/div[1]")
	private WebElement phoneCard2Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_1']/div/div/div[2]")
	private WebElement phoneCard2Nickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_2']/div/div/div[1]")
	private WebElement phoneCard3Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_2']/div/div/div[2]")
	private WebElement phoneCard3Nickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[7]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_3']/div/div/div[1]")
	private WebElement phoneCard4Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[8]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_3']/div/div/div[2]")
	private WebElement phoneCard4Nickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[9]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_4']/div/div/div[1]")
	private WebElement phoneCard5Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeOther[10]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_4']/div/div/div[2]")
	private WebElement phoneCard5Nickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeButton[2]")
	@FindBy(xpath = "//span[@ng-click='sp.deleteRecord($index)' and @tabindex='0']")
	private WebElement deletePhone1Button;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/alertTitle")
	private MobileElement deletePhoneFailTitle;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "android:id/message")
	private MobileElement deletePhoneFailMessage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//a[@ng-click='sp.testPhone(phone)' and @tabindex='0']")
	private WebElement firstPhoneNumber;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[5]/XCUIElementTypeButton[2]")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('text')\"]")
	private WebElement textOption;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[5]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('voice')\"]")
	private WebElement voiceOption;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "getCode")
	private WebElement getCodeButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "getCode")
	private WebElement testPhonesContinueButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeTextField[1]")
	@FindBy(id = "secretCode")
	private WebElement securityCodeField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='server-validation']/span[2]")
	private WebElement cannotVerifySecurityCodeMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='server-validation']/span[2]")
	private WebElement expiredSecurityCodeMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='number-ids']/span[2]")
	private WebElement invalidPasscodeFormatMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[1]")
	@FindBy(id = "enter")
	private WebElement submitCodeButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Verified') or contains(@label,'Validé') or contains(@label,'验证成功') or contains(@label,'驗證成功') ]")
	@FindBy(xpath = "//div[@id='phone_0']//span[@ng-if='!!phone.verified'][2]")
	private WebElement securityCodeVerifedField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "getCode")
	private WebElement passcodeContinueButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeTextField[1]")
	@FindBy(id = "securityEmail")
	private WebElement securityEmailField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "enter")
	private WebElement emailContinueButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//enter-security-email//span")
	private WebElement securityEmailHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[4]/XCUIElementTypeStaticText[1]")
	@FindBy(id = "checkBox_0")
	private WebElement securityCodeFrequencyRadioButton1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "getCode")
	private WebElement codeFrequencyContinueButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/thank_you")
	private MobileElement setupCompleteHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeSecureTextField[1]")
	@FindBy(id = "TBD")
	private WebElement tempPasswordField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeSecureTextField[2]")
	@FindBy(id = "TBD")
	private WebElement newPasswordField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeToolbar[1]/XCUIElementTypeButton[3]")
	@AndroidFindBy(id = "TBD")
	private MobileElement doneKey;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[3]")
	@FindBy(id = "TBD")
	private WebElement passwordGoButton;

	private String GOOGLE_VOICE_URL = "https://voice.google.com";
	private String GOOGLE_VOICE_login = "tdmobileqa1@gmail.com";
	private String GOOGLE_VOICE_password = "mobileqa1234";

	public synchronized static OTPSetup get() {
		if (OneTimePasswordSetup == null) {
			OneTimePasswordSetup = new OTPSetup();
		}
		return OneTimePasswordSetup;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}

	public void acceptWelcomeTCScreens() {
		Decorator();
		try {
			String acctType = getTestdata("Accounts");
			if (acctType.equalsIgnoreCase("new")) {
				mobileAction.FuncClick(getStartedNewButton, "Get started button");
				mobileAction.FuncClick(continueButton, "Continue button");
			} else {
				mobileAction.FuncClick(getStartedExistingButton, "Get started button");
			}

			mobileAction.FuncClick(agreeButton, "AGREE/Accept button");
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
		}
	}

	public void continueNotNowScreen() {
		Decorator();
		try {
			// mobileAction.FuncClick(continueButton, "Continue button");
			mobileAction.FuncClick(notnowButton, "Not Now button");
			mobileAction.FuncClick(securitySettingsOK, "Security Settings, OK button");

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

	public void acceptTCScreen() {
		Decorator();
		try {
			mobileAction.FuncClick(getStartedExistingButton, "Get started button");
			mobileAction.FuncClick(agreeButton, "AGREE/Accept button");
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
		}
	}

	public void addSinglePhoneNumber() {
		String phoneNumber = getTestdata("PhoneProfile");
		String nickname = getTestdata("Nickname");

		addPhoneNumber(phoneNumber, nickname);

	}

	public void addMaxPhoneNumbers() {
		try {
			String phoneNumbers[] = getTestdata("PhoneProfile").replaceAll(" ", "").split(",");

			for (int i = 0; i < phoneNumbers.length; i++) {
				String phoneNumber = phoneNumbers[i];
				String nickname = getTestdata("Nickname");

				if (i > 0) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
						mobileAction.switchToWebView();
						mobileAction.FuncScrollIntoView(addAnotherPhoneButton, "Add Another Phone Button");
					} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						mobileAction.FunctionSwipe("up", 100, 0);
					}

					mobileAction.FuncClick(addAnotherPhoneButton, "Add Another Phone Button");
				}
				addPhoneNumber(phoneNumber, nickname);
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

	public void addPhoneNumber(String phoneNumber, String nickname) {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.sleep(5000); 	//Webview needs time to load
				mobileAction.switchToWebView();
				mobileAction.FuncClickWithActions(editPhoneField, "Edit Phone Number");
				editPhoneField.sendKeys(phoneNumber);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();
				mobileAction.sleep(2000);

				mobileAction.switchToWebView();
				mobileAction.FuncClickWithActions(editNicknameField, "Edit Nickname");
				editNicknameField.sendKeys(nickname);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();
				mobileAction.sleep(2000);

				mobileAction.switchToWebView();
				mobileAction.FuncScrollIntoView(addPhoneButton, "Add Phone button");
				mobileAction.FuncClick(addPhoneButton, "Add Phone button");

			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(editPhoneField, "Edit Phone Number");
				mobileAction.FuncSendKeys(editPhoneField, phoneNumber);
				mobileAction.FuncClickDone(); // hide iOS keyboard

				mobileAction.FuncClick(editNicknameField, "Edit Nickname");
				mobileAction.FuncSendKeys(editNicknameField, nickname);
				mobileAction.FuncClickDone(); // hide iOS keyboard
				mobileAction.sleep(2000);

				mobileAction.FuncClick(addPhoneButton, "Add Phone button");

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
			//mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void testPhoneContinue() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.FuncClick(testPhonesContinueButton, "Add Phone Continue button");

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

	public void deleteFirstPhoneNumber() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.FuncClick(deletePhone1Button, "Delete first phone number");

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
				mobileAction.switchToWebView();
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
			//mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickVoiceOption() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
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

	public void clickTextOption() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.sleep(4000); // WebView needs time to load
				mobileAction.switchToWebView();
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
			//mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickGetCodeButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.sleep(5000 ); 		//Webview needs time to load
				mobileAction.switchToWebView();
			}
			mobileAction.FuncClick(getCodeButton, "Get Code Button");
			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			//mobileAction.switchAppiumContext("NATIVE_APP");
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
				mobileAction.sleep(5000); 	//Webview needs time to load
				mobileAction.switchToWebView();
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
			//mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void enterIncorrectSecurityCode() {
		Decorator();

		try {
			String securityCode = "1111";

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.sleep(2000);
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

	public void enterNonNumericSecurityCode() {
		Decorator();

		try {
			String securityCode = "abcde";

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.FuncClick(securityCodeField, "Security Code Field");
			mobileAction.FuncSendKeys(securityCodeField, securityCode);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone(); // hide iOS keyboard
			} else {
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();
			}

		} catch (Exception e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			//mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void enterExpiredSecurityCode() {
		Decorator();

		try {
			// Enter incorrect passcode every 60s to prevent session expiration
			// after
			// 2min of inactivity
			for (int i = 0; i < 5; i++) {
				enterIncorrectSecurityCode();
				mobileAction.sleep(1000 * 60);
			}

			// Passcode expires after 5mins, enter incorrect passcode after 300s
			enterIncorrectSecurityCode();

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
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.FuncClick(submitCodeButton, "submit code button");

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

	public void enterSecurityEmail() {
		Decorator();
		try {
			String email = getTestdata("EmailProfile");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.sleep(5000);
				mobileAction.switchToWebView();
				mobileAction.FuncClick(securityEmailField, "Enter Security Email");
				mobileAction.FuncSendKeys(securityEmailField, email);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.switchToWebView();
				mobileAction.FuncClick(emailContinueButton, "Email Continue button");

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(confirmButton, "Email Confirm button");

			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(securityEmailField, "Enter Security Email");
				mobileAction.FuncSendKeys(securityEmailField, email);

				mobileAction.FuncClickDone(); // hide iOS keyboard

				mobileAction.FuncClick(emailContinueButton, "Email Continue button");

				mobileAction.FuncClick(confirmButton, "Email Confirm button");

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
			//mobileAction.switchAppiumContext("NATIVE_APP");
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
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Tools\\Browser_drivers\\chromedriver.exe");
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
		} finally {

		}
		return passcode;
	}

	public void codeFrequencyContinue() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.FuncClick(this.codeFrequencyContinueButton, "Passcode Frequency Continue button");
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

	public void createNewPassword() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();

				String tempPassword = this.getTestdata("Password");
				mobileAction.FuncClick(tempPasswordField, "Temporary Password field");
				mobileAction.FuncSendKeys(tempPasswordField, tempPassword);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				String newPassword = this.getTestdata("Env");
				mobileAction.switchToWebView();
				mobileAction.FuncClick(newPasswordField, "New Password field");
				mobileAction.FuncSendKeys(newPasswordField, newPassword);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.switchToWebView();
				mobileAction.FuncClick(passwordGoButton, "Password GO button");

			} else {

				String tempPassword = this.getTestdata("Password");
				mobileAction.FuncClick(tempPasswordField, "Temporary Password field");
				mobileAction.FuncSendKeys(tempPasswordField, tempPassword);
				// need to use separate key to hide keyboard
				mobileAction.FuncClick(doneKey, "Done keyboard button");

				String newPassword = this.getTestdata("Env");
				mobileAction.FuncClick(newPasswordField, "New Password field");
				mobileAction.FuncSendKeys(newPasswordField, newPassword);
				mobileAction.FuncClick(doneKey, "Done keyboard button");

				mobileAction.FuncClick(passwordGoButton, "Password GO button");
			}

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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void verifyDeletePhoneNumberFail() {
		Decorator();
		try {
			// Verify new phone numbers in Phone Card section
			String phoneNumber = getTestdata("PhoneProfile");
			phoneNumber = "1 (" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + " - "
					+ phoneNumber.substring(6);
			String nickname = getTestdata("Nickname");

			mobileAction.verifyElementTextContains(deletePhoneFailTitle,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_UNABLE_DELETE_PHONE));

			mobileAction.verifyElementTextContains(deletePhoneFailMessage, phoneNumber);
			mobileAction.verifyElementTextContains(deletePhoneFailMessage, nickname);
			mobileAction.verifyElementTextContains(deletePhoneFailMessage,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_UNABLE_DELETE_PHONE_MSG));

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

	public void verifyAddedPhoneNumber() {
		Decorator();
		try {
			// Verify new phone numbers in Phone Card section
			String phoneNumber = getTestdata("PhoneProfile");
			phoneNumber = "1 (" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + " - "
					+ phoneNumber.substring(6);
			String nickname = getTestdata("Nickname");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.verifyElementIsDisplayed(phoneCard1Phone, "Phone number");
			mobileAction.verifyElementTextContains(phoneCard1Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard1Nickname, "Phone nickname");
			mobileAction.verifyElementTextContains(phoneCard1Nickname, nickname);

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

	public void verifyAddAnotherPhoneNumberDialog() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(addAnotherPhoneDialogTitle, "Add Another Phone number dialog");
			mobileAction.verifyElementTextContains(addAnotherPhoneDialogTitle,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_ADD_ANOTHER_PHONE));

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

	public void verifyGetStartedOptionOnly() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(getStartedNewButton, "Get Started button");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.verifyElementTextContains(getStartedNewButton,
						getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_GET_STARTED));
			} else {
				mobileAction.verifyElementTextContains(getStartedNewButton,
						getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_CONTINUE));
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
		}
	}

	public void verifyMaxPhoneNumbers() {
		Decorator();
		try {
			// Verify new phone numbers in Phone Card section
			String phoneNumbers[] = getTestdata("PhoneProfile").replaceAll(" ", "").split(",");
			String nickname = getTestdata("Nickname");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			String phoneNumber = "1 (" + phoneNumbers[0].substring(0, 3) + ") " + phoneNumbers[0].substring(3, 6)
					+ " - " + phoneNumbers[0].substring(6);
			mobileAction.verifyElementIsDisplayed(phoneCard1Phone, "Phone number 1");
			mobileAction.verifyElementTextContains(phoneCard1Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard1Nickname, "Phone nickname 1");
			mobileAction.verifyElementTextContains(phoneCard1Nickname, nickname);

			phoneNumber = "1 (" + phoneNumbers[1].substring(0, 3) + ") " + phoneNumbers[1].substring(3, 6) + " - "
					+ phoneNumbers[1].substring(6);
			mobileAction.verifyElementIsDisplayed(phoneCard2Phone, "Phone number 2");
			mobileAction.verifyElementTextContains(phoneCard2Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard2Nickname, "Phone nickname 2");
			mobileAction.verifyElementTextContains(phoneCard2Nickname, nickname);

			phoneNumber = "1 (" + phoneNumbers[2].substring(0, 3) + ") " + phoneNumbers[2].substring(3, 6) + " - "
					+ phoneNumbers[2].substring(6);
			mobileAction.verifyElementIsDisplayed(phoneCard3Phone, "Phone number 3");
			mobileAction.verifyElementTextContains(phoneCard3Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard3Nickname, "Phone nickname 3");
			mobileAction.verifyElementTextContains(phoneCard3Nickname, nickname);

			phoneNumber = "1 (" + phoneNumbers[3].substring(0, 3) + ") " + phoneNumbers[3].substring(3, 6) + " - "
					+ phoneNumbers[3].substring(6);
			mobileAction.verifyElementIsDisplayed(phoneCard4Phone, "Phone number 4");
			mobileAction.verifyElementTextContains(phoneCard4Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard4Nickname, "Phone nickname 4");
			mobileAction.verifyElementTextContains(phoneCard4Nickname, nickname);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.FuncScrollIntoView(phoneCard5Phone, "Scroll last phone");
			} else {
				mobileAction.FunctionSwipe("up", 100, 0);
			}

			phoneNumber = "1 (" + phoneNumbers[4].substring(0, 3) + ") " + phoneNumbers[4].substring(3, 6) + " - "
					+ phoneNumbers[4].substring(6);
			mobileAction.verifyElementIsDisplayed(phoneCard5Phone, "Phone number 5");
			mobileAction.verifyElementTextContains(phoneCard5Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard5Nickname, "Phone nickname 5");
			mobileAction.verifyElementTextContains(phoneCard5Nickname, nickname);

			// Verify Add Phone button not displayed
			mobileAction.verifyElementNotPresent(addAnotherPhoneButton, "Add Another Phone button");

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

	public void verifySecurityCodeSent() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.verifyElementIsDisplayed(securityCodeField, "Security Code field present");

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

	public void verifyCorrectSecurityCode() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.verifyElementIsDisplayed(securityCodeVerifedField, "Security Code Verified field");
			mobileAction.verifyElementTextContains(securityCodeVerifedField,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_PASSCODE_VERIFIED));

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
				mobileAction.switchToWebView();
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

	public void verifyExpiredSecurityCodeMsg() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.verifyElementIsDisplayed(expiredSecurityCodeMsg, "Expired security message");
			mobileAction.verifyElementTextContains(expiredSecurityCodeMsg,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_EXPIRED_PASSCODE));
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

	public void verifyInvalidSecurityCodeFormatMsg() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.verifyElementIsDisplayed(invalidPasscodeFormatMsg, "Invalid passcode format - numbers only");
			mobileAction.verifyElementTextContains(invalidPasscodeFormatMsg,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_INVALID_PASSCODE_FORMAT));
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

	public void verifySecurityEmailScreen() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.sleep(3000);
				mobileAction.switchToWebView();
			}

			mobileAction.verifyElementIsDisplayed(securityEmailHeader, "Security Email screen header");
			mobileAction.verifyElementTextContains(securityEmailHeader,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_SECURITY_EMAIL_HEADER));
			mobileAction.verifyElementIsDisplayed(securityEmailField, "Security Email field");

			boolean buttonIsDisabled = false;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				buttonIsDisabled = emailContinueButton.getAttribute("disabled").equalsIgnoreCase("true");
			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				buttonIsDisabled = emailContinueButton.getAttribute("enabled").equalsIgnoreCase("false");
			}

			if (buttonIsDisabled) {
				mobileAction.GetReporting().FuncReport("Pass",
						"The element - <b>Email Continue button</b> is disabled");
			} else {
				mobileAction.GetReporting().FuncReport("Fail",
						"The element - <b>Email Continue button</b> is not disabled");
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
			//mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void verifySecurityCodeFrequencyScreen() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.sleep(5000);
				mobileAction.switchToWebView();
			}
			mobileAction.verifyElementIsDisplayed(securityCodeFrequencyRadioButton1,
					"Security Code Frequency radio button 1");

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

	public void verifySetupComplete() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_SETUP_COMPLETE_HEADER);
				setupCompleteHeader = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[contains(@label,'" + labelText + "')]",
						"OTP Setup complete screen header");
			}
			mobileAction.verifyElementIsDisplayed(setupCompleteHeader, "OTP Update complete screen header");
			mobileAction.verifyElementTextContains(setupCompleteHeader,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_SETUP_COMPLETE_HEADER));

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
