package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
 * OTP Setup is a webview, try not use native components, instead use
 * webview components to identify key components
 * 
 * @author hochil5
 *
 */
public class OTPSetup extends _CommonPage {

	private static OTPSetup OneTimePasswordSetup;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[2]") //TBD
	@AndroidFindBy(id = "com.td:id/btn_primary")	
	private MobileElement continueButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Get Started']") //TBD
	@AndroidFindBy(id = "com.td:id/btn_primary")	
	private MobileElement getStartedNewButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Get Started']") //TBD
	@AndroidFindBy(id = "com.td:id/btn_continue")	
	private MobileElement getStartedExistingButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='AGREE']") //TBD
	@AndroidFindBy(id = "com.td:id/btn_cancel")	
	private MobileElement notNowButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='AGREE']") //TBD
	@AndroidFindBy(id = "com.td:id/btn_continue")	
	private MobileElement agreeButton;
	
	@FindBy(id = "numberPhone")	
	private WebElement editPhoneField;
	
	@FindBy(id = "nickname")	
	private WebElement editNicknameField;
	
	@FindBy(id = "addPhoneEnter")	
	private WebElement addPhoneButton;
	
	@iOSFindBy  //TBD
	@AndroidFindBy(id = "android:id/button1")	
	private MobileElement confirmButton;
	
	@FindBy(id = "addPhoneSubmit")	
	private WebElement addPhoneContinueButton;
	
	@iOSFindBy  //TBD
	@AndroidFindBy(id = "com.td:id/alertTitle")	
	private MobileElement addAnotherPhoneDialogTitle;
	
	@iOSFindBy  //TBD
	@AndroidFindBy(id = "android:id/button2")	
	private MobileElement anotherPhoneYesButton;
	
	@iOSFindBy //TBD
	@AndroidFindBy(id = "android:id/button1")	
	private MobileElement anotherPhoneNoButton;
	
	@FindBy(xpath = "//div[@id='phone_0']/div/div[2]/div[1]")	
	private WebElement phoneCard1Phone;
	
	@FindBy(xpath = "//div[@id='phone_0']/div/div[2]/div[2]")	
	private WebElement phoneCard1Nickname;
	
	@FindBy(xpath = "//div[@id='phone_1']/div/div[2]/div[1]")	
	private WebElement phoneCard2Phone;
	
	@FindBy(xpath = "//div[@id='phone_1']/div/div[2]/div[2]")	
	private WebElement phoneCard2Nickname;
	
	@FindBy(xpath = "//div[@id='phone_2']/div/div[2]/div[1]")	
	private WebElement phoneCard3Phone;
	
	@FindBy(xpath = "//div[@id='phone_2']/div/div[2]/div[2]")	
	private WebElement phoneCard3Nickname;
	
	@FindBy(xpath = "//div[@id='phone_3']/div/div[2]/div[1]")	
	private WebElement phoneCard4Phone;
	
	@FindBy(xpath = "//div[@id='phone_3']/div/div[2]/div[2]")	
	private WebElement phoneCard4Nickname;
	
	@FindBy(xpath = "//div[@id='phone_4']/div/div[2]/div[1]")	
	private WebElement phoneCard5Phone;
	
	@FindBy(xpath = "//div[@id='phone_4']/div/div[2]/div[2]")	
	private WebElement phoneCard5Nickname;
	
	@FindBy(xpath = "//div[@id='phone_0']//span[@aria-label='Delete phone number']")
	private WebElement deletePhone1Button;
	
	@iOSFindBy //TBD
	@AndroidFindBy(id = "com.td:id/alertTitle")	
	private MobileElement deletePhoneFailTitle;
	
	@iOSFindBy //TBD
	@AndroidFindBy(id = "android:id/message")	
	private MobileElement deletePhoneFailMessage;
	
	@iOSFindBy //TBD
	@AndroidFindBy(id = "com.td:id/loading_indicator_textview")
	private MobileElement progressBar;

	@FindBy(xpath = "//a[@ng-click='sp.testPhone(phone)' and @tabindex='0']")
	private WebElement firstPhoneNumber;
	
	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('text')\"]")
	private WebElement textOption;

	@FindBy(xpath = "//button[@ng-click=\"sp.changeOptions('voice')\"]")
	private WebElement voiceOption;
	
	@FindBy(id = "getCode")
	private WebElement getCodeButton;

	@FindBy(id = "secretCode")
	private WebElement securityCodeField;
	
	@FindBy(xpath = "//div[@id='server-validation']/span[2]")
	private WebElement cannotVerifySecurityCodeMsg;
	
	@FindBy(xpath = "//div[@id='number-ids']/span[2]")
	private WebElement invalidPasscodeFormatMsg;

	@FindBy(id = "enter")
	private WebElement submitCodeButton;
	
	@FindBy(id = "securityEmail")
	private WebElement securityEmailField;
	
	@FindBy(id = "enter")	
	private WebElement emailContinueButton;
	
	@FindBy(xpath = "//enter-security-email//span")	
	private WebElement securityEmailHeader;
	
	@FindBy(id = "checkBox_0")	
	private WebElement securityCodeFrequencyRadioButton1;
	
	private String GOOGLE_VOICE_URL = "http://voice.google.com";
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

	
	
	public void acceptWelcomeTCScreens() {
		Decorator();
		try {
			String acctType = getTestdata("Accounts");
			if (acctType.equalsIgnoreCase("new")) {
				mobileAction.FuncClick(this.getStartedNewButton, "Get started button"); //only shows for new customer IDs
			}
			mobileAction.FuncClick(continueButton, "Continue button");
			if (acctType.equalsIgnoreCase("new")) {
				mobileAction.FuncClick(getStartedNewButton, "Get started button");
			}else if (acctType.equalsIgnoreCase("existing")) {
				mobileAction.FuncClick(getStartedExistingButton, "Get started button");
			}
			mobileAction.FuncClick(agreeButton, "AGREE button");
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
		}
	}
	
	public void addPhoneNumber() {
		Decorator();
		try {		
			String phoneNumber = getTestdata("PhoneProfile");
			String nickname = getTestdata("Nickname");
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
			mobileAction.FuncClick(addPhoneButton, "Add Phone button");
			
			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.FuncClick(confirmButton, "Confirm button" );
			
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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(addPhoneContinueButton, "Add Phone Continue button");

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
	
	public void clickAnotherPhoneNo() {
		Decorator();
		try {
			mobileAction.FuncClick(anotherPhoneNoButton, "Add Another Phone No button");

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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(getCodeButton, "Test Phones Continue button");

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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(deletePhone1Button, "Delete first phone number");
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
			//mobileAction.waitForElement(firstPhoneNumber);
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
		
		try {
			String securityCode = getTestdata("OTPSecurityCode");
			if (securityCode.equalsIgnoreCase("GoogleVoiceRetrieve")) {
				securityCode = this.retrievePasscode();
			}
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
	
	public void enterSecurityEmail() {
		Decorator();
		try {		
			String email = getTestdata("EmailProfile");
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClickWithActions(securityEmailField, "Enter Security Email");
			securityEmailField.sendKeys(email);
			
			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.FuncHideKeyboard();	
			
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.FuncClick(emailContinueButton, "Email Continue button" );
			
			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.FuncClick(confirmButton, "Email Confirm button" );

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
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
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

	
	public void verifyDeletePhoneNumberFail() {
		Decorator();
		try {
			//Verify new phone numbers in Phone Card section
			String phoneNumber = getTestdata("PhoneProfile");
			phoneNumber = "1"+phoneNumber;
			String nickname = getTestdata("Nickname");
			//String errorMsg = "Before you can delete this phone, you must add another number so you can always get your security codes.";
			
			//mobileAction.verifyElementTextContains(deletePhoneFailTitle, "Unable to delete phone.");
			mobileAction.verifyElementTextContains(deletePhoneFailTitle,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_UNABLE_DELETE_PHONE));

			mobileAction.verifyElementTextContains(deletePhoneFailMessage, phoneNumber);
			mobileAction.verifyElementTextContains(deletePhoneFailMessage, nickname);
			//mobileAction.verifyElementTextContains(deletePhoneFailMessage, errorMsg);
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
			//Verify new phone numbers in Phone Card section
			String phoneNumber = getTestdata("PhoneProfile");
			phoneNumber = "1 (" + phoneNumber.substring(0, 3) + ") " + 
							phoneNumber.substring(3, 6) + " - " + phoneNumber.substring(6); 
			String nickname = getTestdata("Nickname");
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
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
			//mobileAction.verifyElementTextContains(addAnotherPhoneDialogTitle, "Add another phone?");
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

			String acctType = getTestdata("Accounts");
			if (acctType.equalsIgnoreCase("new")) {
				mobileAction.verifyElementIsDisplayed(getStartedNewButton, "Get Started button");
				mobileAction.verifyElementNotPresent(notNowButton, "Not Now button not present"); //For new customer IDs
			}
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementTextContains(getStartedNewButton,
						getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_GET_STARTED_IOS));
			}else {
				mobileAction.verifyElementTextContains(getStartedNewButton,
						getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_GET_STARTED));

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
			//Verify new phone numbers in Phone Card section
			String phoneNumber = getTestdata("PhoneProfile");
			phoneNumber = "1 (" + phoneNumber.substring(0, 3) + ") " + 
							phoneNumber.substring(3, 6) + " - " + phoneNumber.substring(6); 
			String nickname = getTestdata("Nickname");
			
			//Verify all phone numbers and nicknames added
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.verifyElementIsDisplayed(phoneCard1Phone, "Phone number 1");
			mobileAction.verifyElementTextContains(phoneCard1Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard1Nickname, "Phone nickname 1");
			mobileAction.verifyElementTextContains(phoneCard1Nickname, nickname);

			mobileAction.verifyElementIsDisplayed(phoneCard2Phone, "Phone number 2");
			mobileAction.verifyElementTextContains(phoneCard2Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard2Nickname, "Phone nickname 2");
			mobileAction.verifyElementTextContains(phoneCard2Nickname, nickname);
			
			mobileAction.verifyElementIsDisplayed(phoneCard3Phone, "Phone number 3");
			mobileAction.verifyElementTextContains(phoneCard3Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard3Nickname, "Phone nickname 3");
			mobileAction.verifyElementTextContains(phoneCard3Nickname, nickname);
			
			mobileAction.verifyElementIsDisplayed(phoneCard4Phone, "Phone number 4");
			mobileAction.verifyElementTextContains(phoneCard4Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard4Nickname, "Phone nickname 4");
			mobileAction.verifyElementTextContains(phoneCard4Nickname, nickname);
			
			mobileAction.verifyElementIsDisplayed(phoneCard5Phone, "Phone number 5");
			mobileAction.verifyElementTextContains(phoneCard5Phone, phoneNumber);
			mobileAction.verifyElementIsDisplayed(phoneCard5Nickname, "Phone nickname 5");
			mobileAction.verifyElementTextContains(phoneCard5Nickname, nickname);
			
			//Verify Add Phone button not displayed
			mobileAction.verifyElementNotPresent(addPhoneButton, "Add Phone button");
			
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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
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
	
	public void verifyInvalidSecurityCodeFormatMsg() {
		Decorator();
		try {
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.verifyElementIsDisplayed(invalidPasscodeFormatMsg, "Invalid passcode format - numbers only");
			//mobileAction.verifyElementTextContains(invalidPasscodeFormatMsg, "Please enter numbers only");
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
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.verifyElementIsDisplayed(securityEmailHeader, "Security Email screen header");
			//mobileAction.verifyElementTextContains(securityEmailHeader, "Please provide an email address to get security alerts.");
			mobileAction.verifyElementTextContains(securityEmailHeader,
					getTextInCurrentLocale(StringArray.ARRAY_OTP_SETUP_SECURITY_EMAIL_HEADER));

			mobileAction.verifyElementIsDisplayed(securityEmailField, "Security Email field");
			

			if(emailContinueButton.getAttribute("disabled").equalsIgnoreCase("true")){
				mobileAction.GetReporting().FuncReport("Pass", "The element - <b>Email Continue button</b> is disabled");
			}else {
				mobileAction.GetReporting().FuncReport("Fail", "The element - <b>Email Continue button</b> is not disabled");
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
	
	public void verifySecurityCodeFrequencyScreen() {
		Decorator();
		try {
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			mobileAction.verifyElementIsDisplayed(securityCodeFrequencyRadioButton1, "Security Code Frequency radio button 1");
			
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
