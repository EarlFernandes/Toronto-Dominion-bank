package com.td.test.TDI;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;
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
import com.td.test.CDNMobile.pages.GoogleVoiceWebPage;
import com.td.test.CDNMobile.pages.PageHeader;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/**
 * OTP Update is a webview, try not use native components, instead use webview
 * components to identify key components
 * 
 * @author hochil5
 *
 */
public class TDIOTPUpdate extends _CommonPage {

	private static TDIOTPUpdate OneTimePasswordUpdate;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//section[contains(@ng-if,'fromUpdateState')]/span")
	private WebElement otpUpdateHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Add Phone') or contains(@label,'Ajouter un téléphone') or contains(@label,'添加电话号码') or contains(@label,'新增電話號碼') ]")
	@FindBy(xpath = "//div[contains(@ng-click,'add-phone')]")
	private WebElement addPhoneUpdateButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'area code') or contains(@value,'indicatif régional') or contains(@value,'包含区号') or contains(@value,'包含區號') ]")
	@FindBy(id = "numberPhone")
	private WebElement editPhoneField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'My Phone') or contains(@value,'Mon téléphone') or contains(@value,'我的电话') or contains(@value,'我的電話') ]")
	@FindBy(id = "nickname")
	private WebElement editNicknameField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "addPhoneEnter")
	private WebElement addPhoneContinueButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[8]/XCUIElementTypeStaticText[1] | "
			+ "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@ng-repeat='phone in spc.savedPhones'][2]//div[@class='td-row'][1]//div[2]/span | "
			+ "//div[@ng-repeat='phone in spc.savedPhones'][2]//div[@class='td-row'][1]/a/div[1]")
	private WebElement addedPhoneNumber;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[9]/XCUIElementTypeStaticText[2] | "
			+ "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@ng-repeat='phone in spc.savedPhones'][2]//div[@class='td-row-white'][2]//span[2] | "
			+ "//div[@ng-repeat='phone in spc.savedPhones'][2]//div[@class='td-row'][1]/div/span")
	private WebElement addedNickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1] | "
			+ "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "(//div[@class='td-row-white'])[1]")
	private WebElement phoneCard1Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeStaticText[1] | "
			+ "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_1']/div/div/div[1]")
	private WebElement phoneCard2Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[7]/XCUIElementTypeStaticText[1] | "
			+ "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_1']/div/div/div[2]")
	private WebElement phoneCard2Nickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_2']/div/div/div[1]")
	private WebElement phoneCard3Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_2']/div/div/div[2]")
	private WebElement phoneCard3Nickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_3']/div/div/div[1]")
	private WebElement phoneCard4Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_3']/div/div/div[2]")
	private WebElement phoneCard4Nickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[8]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_4']/div/div/div[1]")
	private WebElement phoneCard5Phone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[8]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_4']/div/div/div[2]")
	private WebElement phoneCard5Nickname;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Test Phone') or contains(@label,'Tester un téléphone') or contains(@label,'测试电话') or contains(@label,'測試電話') ]")
	@FindBy(xpath = "//div[contains(@ng-click,'test-phone')]")
	private WebElement testPhoneUpdateButton;

	@FindBy(xpath = "//div/a[contains(@ng-click,'pd.testPhone')]")
	private WebElement verifyNumberButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//span[@ng-click='pd.deletePhone()' and @tabindex='0']")
	private WebElement deletePhoneUpdateButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[2]")
	@FindBy(xpath = "//div[contains(@ng-click,'enter-security-email')]")
	private WebElement changeEmailUpdateButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Security Email') or contains(@label,'Adresse courriel de sécurité') or contains(@label,'安全信息邮箱') or contains(@label,'安全性資訊收件箱')]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[contains(@ng-click,'enter-security-email')]")
	private WebElement emailUpdateField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[10]/XCUIElementTypeStaticText[1]")
	private WebElement emailUpdateField_ios_zh;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[3]")
	@FindBy(xpath = "//div[contains(@href,'secure-login-option')]")
	private WebElement changeLoginOptionUpdateButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "getCode")
	private WebElement otpUpdateContinueButton;

	@AndroidFindBy(id = "com.td:id/thank_you")
	private MobileElement otpUpdateCompleteHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement confirmButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]//XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement deletePhoneOKButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/alertTitle")
	private MobileElement deletePhoneFailTitle;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "android:id/message")
	private MobileElement deletePhoneFailMessage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//a[@ng-click='sp.testPhone(phone)' and @tabindex='0']")
	private WebElement firstPhoneNumber;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[5]//XCUIElementTypeButton[2]")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('text')\"]")
	private WebElement textOption;

	@AndroidFindBy(id = "com.td:id/text_button")
	private WebElement textOptionNative;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[5]//XCUIElementTypeButton[1]")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('voice')\"]")
	private WebElement voiceOption;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
	@FindBy(id = "getCode")
	private WebElement getCodeButton;

	@AndroidFindBy(id = "com.td:id/btn_continue")
	private WebElement getCodeButtonNative;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]")
	@FindBy(id = "getCode")
	private WebElement testPhonesContinueButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeTextField[1]")
	@FindBy(id = "secretCode")
	private WebElement securityCodeField;

	@AndroidFindBy(id = "com.td:id/enter_code")
	private WebElement securityCodeFieldNative;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[1]")
	@FindBy(id = "enter")
	private WebElement submitCodeButton;

	@AndroidFindBy(id = "com.td:id/btn_primary")
	private WebElement submitCodeButtonNative;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "(//div[@ng-show='!!phone.verified']/span)[2]")
	private WebElement securityCodeVerifedField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
	@FindBy(id = "getCode")
	private WebElement passcodeContinueButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeTextField[1]")
	@FindBy(id = "securityEmail")
	private WebElement securityEmailField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(id = "enter")
	private WebElement emailContinueButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//enter-security-email//span")
	private WebElement securityEmailHeader;

	private String GOOGLE_VOICE_URL = "https://voice.google.com";
	private String GOOGLE_VOICE_login = "tdmobileqa1@gmail.com";
	private String GOOGLE_VOICE_password = "mobileqa1234";

	public synchronized static TDIOTPUpdate get() {
		if (OneTimePasswordUpdate == null) {
			OneTimePasswordUpdate = new TDIOTPUpdate();
		}
		return OneTimePasswordUpdate;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}

	public void deleteFirstPhoneNumber() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.FuncClick(phoneCard1Phone, "First phone number");
			mobileAction.sleep(2000);
			mobileAction.FuncClick(deletePhoneUpdateButton, "Delete first phone number");

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

	public void deleteSecondPhoneNumber() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.FuncClick(addedPhoneNumber, "2nd Phone Number");
			mobileAction.sleep(2000);
			mobileAction.FuncClick(deletePhoneUpdateButton, "Delete Phone Number");

			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.FuncClick(confirmButton, "Confirm Delete phone number");

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

	public void clickAddPhoneUpdateButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
				mobileAction.FuncScrollIntoView(addPhoneUpdateButton, "Add Phone Update Button");

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (!addPhoneUpdateButton.isDisplayed()) {
					mobileAction.FunctionSwipe("up", 100, 0);
				}
			}

			mobileAction.FuncClick(addPhoneUpdateButton, "Add Phone Update Button");

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

	public void addSinglePhoneNumber() {
		String phoneNumber = getTestdata("PhoneProfile");
		String nickname = getTestdata("Nickname");

		clickAddPhoneUpdateButton();
		addPhoneNumber(phoneNumber, nickname);

	}

	public void addSinglePhoneNumberWithPasscode() {
		Decorator();
		try {
			String phoneNumber = getTestdata("PhoneProfile");
			String nickname = getTestdata("Nickname");

			clickAddPhoneUpdateButton();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				TDIOTPChallenge.get().clickTextOption();
				TDIOTPChallenge.get().clickGetCodeButton();
				TDIOTPChallenge.get().enterSecurityCode();
				TDIOTPChallenge.get().clickSubmitCodeButton();
			} else {
				// Native screens only for this OTP Challenge screen
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(textOptionNative, "Text option Native");
				mobileAction.FuncClick(getCodeButtonNative, "Get Code option Native");

				String securityCode = retrievePasscode();

				mobileAction.FuncClick(securityCodeFieldNative, "Security Code Field Native");
				mobileAction.FuncSendKeys(securityCodeFieldNative, securityCode);
				mobileAction.FuncHideKeyboard();

				mobileAction.FuncClick(submitCodeButtonNative, "Submit Code Native");

			}
			mobileAction.sleep(4000);
			addPhoneNumber(phoneNumber, nickname);

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

	public void addMaxPhoneNumbers() {
		String phoneNumbers[] = getTestdata("PhoneProfile").replaceAll(" ", "").split(",");

		for (int i = 0; i < phoneNumbers.length; i++) {
			String phoneNumber = phoneNumbers[i];
			String nickname = getTestdata("Nickname");

			clickAddPhoneUpdateButton();
			addPhoneNumber(phoneNumber, nickname);
		}

	}

	public void addPhoneNumber(String phoneNumber, String nickname) {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				mobileAction.switchToWebView();
				mobileAction.FuncClickWithActions(editPhoneField, "Edit Phone Number");
				editPhoneField.sendKeys(phoneNumber);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.switchToWebView();
				mobileAction.FuncClickWithActions(editNicknameField, "Edit Nickname");
				editNicknameField.sendKeys(nickname);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.switchToWebView();
				mobileAction.FuncClick(addPhoneContinueButton, "Add Phone Continue button");

			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				if (!editPhoneField.isDisplayed()) {
					mobileAction.FunctionSwipe("up", 1000, 0);
				}

				mobileAction.FuncClick(editPhoneField, "Edit Phone Number");
				mobileAction.FuncSendKeys(editPhoneField, phoneNumber);
				mobileAction.FuncClickDone(); // hide iOS keyboard

				mobileAction.FuncClick(editNicknameField, "Edit Nickname");
				mobileAction.FuncSendKeys(editNicknameField, nickname);
				mobileAction.FuncClickDone(); // hide iOS keyboard

				mobileAction.FuncClick(addPhoneContinueButton, "Add Phone Continue button");

			}
			mobileAction.sleep(4000);

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

	public void addPhoneContinue() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.FuncClick(addPhoneContinueButton, "Add Phone Continue button");

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

	public void clickChangeEmailButton() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
				mobileAction.sleep(3000); // Webview needs time to load
				mobileAction.FuncScrollIntoView(changeEmailUpdateButton, "Change Email Button");
			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunctionSwipe("up", 100, 0);

			}

			mobileAction.sleep(3000);
			mobileAction.FuncClick(changeEmailUpdateButton, "Change Email Button");

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

	public void clickTestPhoneButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.FuncClick(phoneCard1Phone, "First Phone Button");
			mobileAction.sleep(3000);

			String xpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				xpath = "//XCUIElementTypeButton[contains(@label,'"
						+ this.getTextInCurrentLocale(StringArray.ARRAY_OTP_UPDATE_VERIFY_NUMBER) + "')]";
				verifyNumberButton = mobileAction.mobileElementUsingXPath(xpath);
			}
			if (mobileAction.verifyElementIsPresent(verifyNumberButton)) {
				mobileAction.FuncClick(verifyNumberButton, "Verify Number button");
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

	public void clickLoginOptionButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
				mobileAction.sleep(3000); // Webview needs time to load
				mobileAction.FuncScrollIntoView(changeLoginOptionUpdateButton, "Change Login Option Button");
			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunctionSwipe("up", 100, 0);
			}
			mobileAction.FuncClick(changeLoginOptionUpdateButton, "Change Login Option Button");
			mobileAction.sleep(3000);

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

	public void updateSecurityEmail() {
		Decorator();
		try {
			String email = getTestdata("EmailProfile");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickOTPUpdateContinueButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.FuncClick(otpUpdateContinueButton, "OTP Update Continue Button");
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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void testPhonesContinue() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.FuncClick(testPhonesContinueButton, "Test Phones Continue button");

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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickTextOption() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void clickGetCodeButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
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
		} finally {

		}
		return passcode;
	}

	public void passcodeContinue() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.FuncClick(passcodeContinueButton, "Passcode Verified Continue button");

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
			if (getTestdata("Accounts").equalsIgnoreCase("masked")) {
				phoneNumber = getTestdata("EmailProfile");
			}

			phoneNumber = "(•••) ••• - " + phoneNumber.substring(6);
			String nickname = getTestdata("Nickname");

			mobileAction.verifyElementTextContains(deletePhoneFailTitle,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_UNABLE_DELETE_PHONE));

			mobileAction.verifyElementTextContains(deletePhoneFailMessage, phoneNumber);
			mobileAction.verifyElementTextContains(deletePhoneFailMessage, nickname);
			mobileAction.verifyElementTextContains(deletePhoneFailMessage,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_UNABLE_DELETE_PHONE_MSG));

			mobileAction.FuncClick(deletePhoneOKButton, "Cannot delete phone OK button");
			mobileAction.sleep(3000);

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

	public void verifyDeleteSecondPhoneNumber() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			String phoneNumber = getTestdata("PhoneProfile").substring(6);
			String deletedPhoneXpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				deletedPhoneXpath = "//android.widget.TextView[contains(@text,'" + phoneNumber + "')]";

			} else {
				deletedPhoneXpath = "//XCUIElementTypeStaticText[contains(@label,'" + phoneNumber + "')]";
			}

			boolean isExist = mobileAction.verifyElementIsPresentByXpath(deletedPhoneXpath);
			if (!isExist) {
				mobileAction.GetReporting().FuncReport("Pass", "2nd phone number is deleted");
			} else {
				mobileAction.GetReporting().FuncReport("Fail", "2nd phone number is not deleted");
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

	public void verifyCorrectSecurityCode() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String xpath = "//XCUIElementTypeStaticText[contains(@label,'"
						+ this.getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_PASSCODE_VERIFIED) + "')]";
				securityCodeVerifedField = mobileAction.verifyElementUsingXPath(xpath, "Verified text");
			}

			mobileAction.sleep(2000); // Wait for Verified text to appear
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

	public void verifySecurityEmailScreen() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

	public void verifyOTPUpdateScreen() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.verifyElementIsDisplayed(otpUpdateHeader, "OTP Update screen header");
			mobileAction.verifyElementTextContains(otpUpdateHeader,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_UPDATE_HEADER));

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

	public void verifyTestPhoneUpdateScreen() {
		Decorator();
		try {
			MobileElement screenheader = PageHeader.get().getHeaderTextElement();
			String headerText = mobileAction.FuncGetText(screenheader);
			mobileAction.verifyElementIsDisplayed(screenheader, "OTP Update Test Phone screen header");
			if (headerText.contains(getTextInCurrentLocale(StringArray.ARRAY_OTP_UPDATE_VERIFY_NUMBER_SCREEN))) {
				mobileAction.verifyElementTextContains(screenheader,
						getTextInCurrentLocale(StringArray.ARRAY_OTP_UPDATE_VERIFY_NUMBER_SCREEN));
			} else {
				mobileAction.GetReporting().FuncReport("Pass", "Phone Number is Verified");
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

	public void verifyLoginOptionUpdateScreen() {
		Decorator();
		try {

			MobileElement screenHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(screenHeader, "OTP Update Login Option screen header");
			mobileAction.verifyElementTextContains(screenHeader,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_UPDATE_LOGIN_OPTION_HEADER));

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

	public void verifyChangeEmailScreen() {
		Decorator();
		try {

			MobileElement screenHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(screenHeader, "OTP Update Change Email screen header");
			mobileAction.verifyElementTextContains(screenHeader,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_UPDATE_CHANGE_EMAIL_HEADER));

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

	public void verifyUpdatedSecurityEmail() {
		Decorator();
		try {

			String email = getTestdata("EmailProfile");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
				mobileAction.sleep(3000); // Webview needs time to load
				mobileAction.FuncScrollIntoView(changeEmailUpdateButton, "Security Email field");
			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunctionSwipe("up", 100, 0);
			}

			mobileAction.verifyElementIsDisplayed(changeEmailUpdateButton, "Security Email field");
			mobileAction.verifyElementTextContains(changeEmailUpdateButton, email);

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
			String phoneNumber = "1" + getTestdata("PhoneProfile");
			if (getTestdata("Accounts").equalsIgnoreCase("masked")) {
				phoneNumber = "(•••) ••• - " + phoneNumber.substring(7);
			}
			String nickname = getTestdata("Nickname");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.verifyElementIsDisplayed(addedPhoneNumber, "Phone number");
			mobileAction.verifyElementTextContains(addedPhoneNumber, phoneNumber);
			mobileAction.verifyElementIsDisplayed(addedNickname, "Phone nickname");
			mobileAction.verifyElementTextContains(addedNickname, nickname);

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

	public void verifyMaxPhoneNumbers() {
		Decorator();
		try {
			// Verify new phone numbers in Phone Card section
			String phoneNumbers[] = getTestdata("PhoneProfile").replaceAll(" ", "").split(",");
			String nickname = getTestdata("Nickname");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			String phoneNumber = "(•••) ••• - " + phoneNumbers[0].trim().substring(6);
			mobileAction.verifyElementIsDisplayed(phoneCard2Phone, "Phone number 2");
			mobileAction.verifyElementTextContains(phoneCard2Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard2Nickname, "Phone nickname 2");
			mobileAction.verifyElementTextContains(phoneCard2Nickname, nickname);

			phoneNumber = "(•••) ••• - " + phoneNumbers[1].trim().substring(6);
			mobileAction.verifyElementIsDisplayed(phoneCard3Phone, "Phone number 3");
			mobileAction.verifyElementTextContains(phoneCard3Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard3Nickname, "Phone nickname 3");
			mobileAction.verifyElementTextContains(phoneCard3Nickname, nickname);

			phoneNumber = "(•••) ••• - " + phoneNumbers[2].trim().substring(6);
			mobileAction.verifyElementIsDisplayed(phoneCard4Phone, "Phone number 4");
			mobileAction.verifyElementTextContains(phoneCard4Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard4Nickname, "Phone nickname 4");
			mobileAction.verifyElementTextContains(phoneCard4Nickname, nickname);

			phoneNumber = "(•••) ••• - " + phoneNumbers[3].trim().substring(6);
			mobileAction.verifyElementIsDisplayed(phoneCard5Phone, "Phone number 5");
			mobileAction.verifyElementTextContains(phoneCard5Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard5Nickname, "Phone nickname 5");
			mobileAction.verifyElementTextContains(phoneCard5Nickname, nickname);

			boolean hasAddPhoneButton = mobileAction.verifyElementIsPresent(addPhoneUpdateButton);
			if (!hasAddPhoneButton) {
				mobileAction.GetReporting().FuncReport("Pass", "The element - <b>Add Phone button</b> is disabled");
			} else {
				mobileAction.GetReporting().FuncReport("Fail", "The element - <b>Add Phone button</b> is not disabled");
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

	public void verifyOTPUpdateCompleteScreen() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_OTP_UPDATE_COMPLETE_HEADER);
				otpUpdateCompleteHeader = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[contains(@label,'" + labelText + "')]",
						"OTP Update complete screen header");
			}
			mobileAction.verifyElementIsDisplayed(otpUpdateCompleteHeader, "OTP Update complete screen header");
			mobileAction.verifyElementTextContains(otpUpdateCompleteHeader,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_UPDATE_COMPLETE_HEADER));

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
