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

/**
 * OTP Update is a webview, try not use native components, instead use webview
 * components to identify key components
 * 
 * @author hochil5
 *
 */
public class OTPUpdate extends _CommonPage {

	private static OTPUpdate OneTimePasswordUpdate;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//section[contains(@ng-if,'fromUpdateState')]/span")
	private WebElement otpUpdateHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Add Phone') or contains(@label,'Ajouter un téléphone') or contains(@label,'添加电话号码') or contains(@label,'新增電話號碼') ]")
	@FindBy(xpath = "//div[contains(@ng-click,'add-phone')]")
	private WebElement addPhoneUpdateButton;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Add Another Phone') or contains(@label,'Ajouter un autre téléphone') or contains(@label,'添加其他电话号码') or contains(@label,'新增更多電話號碼') ]")
	@FindBy(xpath = "//a[contains(@ng-click,'displayAddPhoneForm')]")
	private WebElement addAnotherPhoneButton;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'Phone Number') or contains(@value,'Numéro de téléphone') or contains(@value,'电话号码') or contains(@value,'電話號碼') ]")
	@FindBy(id = "numberPhone")
	private WebElement editPhoneField;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'Nickname') or contains(@value,'Description') or contains(@value,'电话昵称') or contains(@value,'電話暱稱') ]")
	@FindBy(id = "nickname")
	private WebElement editNicknameField;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "addPhoneSubmit")
	private WebElement addPhoneContinueButton;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[8]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//section[@ng-if='spc.savedPhones.length > 0'][2]//div[@class='td-row'][1]//div[2]/span")
	private WebElement addedPhoneNumber;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[9]/XCUIElementTypeStaticText[2]")
	@FindBy(xpath = "//section[@ng-if='spc.savedPhones.length > 0'][2]//div[@class='td-row-white'][2]//span[2]")
	private WebElement addedNickname;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[6]/XCUIElementTypeStaticText[1] |"
			+ "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_1']/div/div/div[1]")
	private WebElement phoneCard2Phone;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[7]/XCUIElementTypeStaticText[1] |"
			+ "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_1']/div/div/div[2]")
	private WebElement phoneCard2Nickname;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_2']/div/div/div[1]")
	private WebElement phoneCard3Phone;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_2']/div/div/div[2]")
	private WebElement phoneCard3Nickname;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[8]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_3']/div/div/div[1]")
	private WebElement phoneCard4Phone;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_3']/div/div/div[2]")
	private WebElement phoneCard4Nickname;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[10]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_4']/div/div/div[1]")
	private WebElement phoneCard5Phone;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[11]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_4']/div/div/div[2]")
	private WebElement phoneCard5Nickname;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Test Phone') or contains(@label,'Tester un téléphone') or contains(@label,'测试电话') or contains(@label,'測試電話') ]")
	@FindBy(xpath = "//div[contains(@ng-click,'test-phone')]")
	private WebElement testPhoneUpdateButton;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement testPhoneHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement loginOptionHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement changeEmailHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//span[@ng-click='spc.deleteRecord($index)' and @tabindex='0']")
	private WebElement deletePhone1UpdateButton;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Change Email') or contains(@label,'Modifier l’adresse courriel') or contains(@label,'更改邮箱地址') or contains(@label,'變更收件箱地址') ]")
	@FindBy(xpath = "//div[contains(@ng-click,'enter-security-email')]")
	private WebElement changeEmailUpdateButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Security Email') or contains(@label,'Adresse courriel de sécurité') or contains(@label,'安全信息邮箱') or contains(@label,'安全性資訊收件箱')]/parent::XCUIElementTypeOther/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[contains(@class,'email-field')]/span")
	private WebElement emailUpdateField;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[10]/XCUIElementTypeStaticText[1]")
	private WebElement emailUpdateField_ios_zh;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Change Login Option') or contains(@label,'Modifier l’option d’ouverture de session') or contains(@label,'更改登录选项') or contains(@label,'變更登入選項') ]")
	@FindBy(xpath = "//div[contains(@href,'secure-login-option')]")
	private WebElement changeLoginOptionUpdateButton;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue') or contains(@label,'Continuer') or contains(@label,'继续') or contains(@label,'繼續') ]")
	@FindBy(id = "getCode")
	private WebElement otpUpdateContinueButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Thanks') or contains(@label,'Merci') or contains(@label,'谢谢') or contains(@label,'謝謝') ]")
	@AndroidFindBy(id = "com.td:id/notice_header")
	private MobileElement otpUpdateCompleteHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement confirmButton;

	@iOSFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]//XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button2")
	private MobileElement testPHoneNoButton;

	@iOSFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/alertTitle")
	private MobileElement deletePhoneFailTitle;

	@iOSFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "android:id/message")
	private MobileElement deletePhoneFailMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//a[@ng-click='sp.testPhone(phone)' and @tabindex='0']")
	private WebElement firstPhoneNumber;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[4]//XCUIElementTypeButton[1]")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('text')\"]")
	private WebElement textOption;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('voice')\"]")
	private WebElement voiceOption;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
	@FindBy(id = "getCode")
	private WebElement getCodeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]")
	@FindBy(id = "getCode")
	private WebElement testPhonesContinueButton;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeTextField[1]")
	@FindBy(id = "secretCode")
	private WebElement securityCodeField;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[1]")
	@FindBy(id = "enter")
	private WebElement submitCodeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[5]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@id='phone_0']//span[@ng-if='!!phone.verified'][2]")
	private WebElement securityCodeVerifedField;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
	@FindBy(id = "getCode")
	private WebElement passcodeContinueButton;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeTextField[1]")
	@FindBy(id = "securityEmail")
	private WebElement securityEmailField;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(id = "enter")
	private WebElement emailContinueButton;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//enter-security-email//span")
	private WebElement securityEmailHeader;

	private String GOOGLE_VOICE_URL = "https://voice.google.com";
	private String GOOGLE_VOICE_login = "tdmobileqa1@gmail.com";
	private String GOOGLE_VOICE_password = "mobileqa1234";

	public synchronized static OTPUpdate get() {
		if (OneTimePasswordUpdate == null) {
			OneTimePasswordUpdate = new OTPUpdate();
		}
		return OneTimePasswordUpdate;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}

	public void waitForOTPProgressBarToVanish() {
		Decorator();
		try {
			mobileAction.waitProgressBarVanish();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void deleteFirstPhoneNumber() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}
			mobileAction.FuncClick(deletePhone1UpdateButton, "Delete first phone number");

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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.FuncScrollIntoView(addPhoneUpdateButton, "Add Phone Update Button");

			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (!addPhoneUpdateButton.isDisplayed()) {
					mobileAction.FunctionSwipe("up", 100, 0);
				}
			}

			mobileAction.FuncClick(addPhoneUpdateButton, "Add Phone Update Button");
			mobileAction.FuncClick(addAnotherPhoneButton, "Add Another Phone Button");

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

	public void addMaxPhoneNumbers() {
		String phoneNumbers[] = getTestdata("PhoneProfile").split(",");

		for (int i = 0; i < phoneNumbers.length; i++) {
			String phoneNumber = phoneNumbers[i].trim();
			String nickname = getTestdata("Nickname");

			clickAddPhoneUpdateButton();
			addPhoneNumber(phoneNumber, nickname);
		}

	}

	public void addPhoneNumber(String phoneNumber, String nickname) {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {

				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.FuncClickWithActions(editPhoneField, "Edit Phone Number");
				editPhoneField.sendKeys(phoneNumber);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.FuncClickWithActions(editNicknameField, "Edit Nickname");
				editNicknameField.sendKeys(nickname);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.FuncClick(addPhoneContinueButton, "Add Phone Continue button");

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(confirmButton, "Confirm button");
				mobileAction.FuncClick(testPHoneNoButton, "Test Phone No button");

			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				if (!editPhoneField.isDisplayed()) {
					mobileAction.FunctionSwipe("up", 100, 0);
				}

				mobileAction.FuncClick(editPhoneField, "Edit Phone Number");
				mobileAction.FuncSendKeys(editPhoneField, phoneNumber);
				mobileAction.FuncClickDone(); // hide iOS keyboard

				mobileAction.FuncClick(editNicknameField, "Edit Nickname");
				mobileAction.FuncSendKeys(editNicknameField, nickname);
				mobileAction.FuncClickDone(); // hide iOS keyboard

				mobileAction.FuncClick(addPhoneContinueButton, "Add Phone Continue button");

				mobileAction.FuncClick(confirmButton, "Confirm button");
				mobileAction.FuncClick(testPHoneNoButton, "Test Phone No button");

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

	public void addPhoneContinue() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.FuncScrollIntoView(changeEmailUpdateButton, "Change Email Button");
			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunctionSwipe("up", 100, 0);
			}
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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}
			mobileAction.FuncClick(testPhoneUpdateButton, "Test Phone Button");

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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.FuncScrollIntoView(changeLoginOptionUpdateButton, "Change Login Option Button");
			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunctionSwipe("up", 100, 0);
			}
			mobileAction.FuncClick(changeLoginOptionUpdateButton, "Change Login Option Button");

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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.FuncClick(securityEmailField, "Enter Security Email");
				mobileAction.FuncSendKeys(securityEmailField, email);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.switchAppiumContext("WEBVIEW_com.td");
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

	public void clickOTPUpdateContinueButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}
			mobileAction.FuncClick(otpUpdateContinueButton, "OTP Update Continue Button");

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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
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

	public void clickGetCodeButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}
			mobileAction.FuncClick(getCodeButton, "Get Code Button");

			// mobileAction.switchAppiumContext("NATIVE_APP");
			// mobileAction.waitForElementToVanish(progressBar);
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

	public void clickSubmitCodeButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}
			mobileAction.FuncClick(submitCodeButton, "submit code button");

			// mobileAction.switchAppiumContext("NATIVE_APP");
			// mobileAction.waitForElementToVanish(progressBar);
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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.FuncClick(securityEmailField, "Enter Security Email");
				mobileAction.FuncSendKeys(securityEmailField, email);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.switchAppiumContext("WEBVIEW_com.td");
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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
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

	public void verifyCorrectSecurityCode() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
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

	public void verifySecurityEmailScreen() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
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

			mobileAction.verifyElementIsDisplayed(testPhoneHeader, "OTP Update Test Phone screen header");
			mobileAction.verifyElementTextContains(testPhoneHeader,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_UPDATE_TEST_PHONE_HEADER));

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

			mobileAction.verifyElementIsDisplayed(loginOptionHeader, "OTP Update Login Option screen header");
			mobileAction.verifyElementTextContains(loginOptionHeader,
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

			mobileAction.verifyElementIsDisplayed(changeEmailHeader, "OTP Update Change Email screen header");
			mobileAction.verifyElementTextContains(changeEmailHeader,
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
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.FuncScrollIntoView(emailUpdateField, "Security Email field");
			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FunctionSwipe("up", 100, 0);
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
					&& currentLocale.startsWith("zh")) {
				mobileAction.verifyElementIsDisplayed(emailUpdateField_ios_zh, "Security Email field");
				mobileAction.verifyElementTextContains(emailUpdateField_ios_zh, email);
			} else {
				mobileAction.verifyElementIsDisplayed(emailUpdateField, "Security Email field");
				mobileAction.verifyElementTextContains(emailUpdateField, email);
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

	public void verifyAddedPhoneNumber() {
		Decorator();
		try {
			// Verify new phone numbers in Phone Card section
			String phoneNumber = "1" + getTestdata("PhoneProfile");
			String nickname = getTestdata("Nickname");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
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
			String phoneNumbers[] = getTestdata("PhoneProfile").split(",");
			String nickname = getTestdata("Nickname");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
			}

			String phoneNumber = "1" + phoneNumbers[0].trim();
			mobileAction.verifyElementIsDisplayed(phoneCard2Phone, "Phone number 2");
			mobileAction.verifyElementTextContains(phoneCard2Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard2Nickname, "Phone nickname 2");
			mobileAction.verifyElementTextContains(phoneCard2Nickname, nickname);

			phoneNumber = "1" + phoneNumbers[1].trim();
			mobileAction.verifyElementIsDisplayed(phoneCard3Phone, "Phone number 3");
			mobileAction.verifyElementTextContains(phoneCard3Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard3Nickname, "Phone nickname 3");
			mobileAction.verifyElementTextContains(phoneCard3Nickname, nickname);

			phoneNumber = "1" + phoneNumbers[2].trim();
			mobileAction.verifyElementIsDisplayed(phoneCard4Phone, "Phone number 4");
			mobileAction.verifyElementTextContains(phoneCard4Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard4Nickname, "Phone nickname 4");
			mobileAction.verifyElementTextContains(phoneCard4Nickname, nickname);

			phoneNumber = "1" + phoneNumbers[3].trim();
			mobileAction.verifyElementIsDisplayed(phoneCard5Phone, "Phone number 5");
			mobileAction.verifyElementTextContains(phoneCard5Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard5Nickname, "Phone nickname 5");
			mobileAction.verifyElementTextContains(phoneCard5Nickname, nickname);

			boolean buttonIsDisabled = false;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				buttonIsDisabled = addPhoneContinueButton.getAttribute("disabled").equalsIgnoreCase("true");
			} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				buttonIsDisabled = addPhoneContinueButton.getAttribute("enabled").equalsIgnoreCase("false");
			}

			if (buttonIsDisabled) {
				mobileAction.GetReporting().FuncReport("Pass",
						"The element - <b>Add Phone Continue button</b> is disabled");
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
