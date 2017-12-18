package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginMIT extends _CommonPage {

	@iOSFindBy(xpath = "//*[@label='Remember me on']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/remember_switch' and @index='1']")
	private MobileElement rememberMe;

	@iOSXCUITFindBy(accessibility = "LOGIN_USERNAME")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText']")
	private MobileElement username;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeSecureTextField[@name='LOGIN_PASSWORD']")
	@iOSXCUITFindBy(accessibility = "LOGIN_PASSWORD")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSXCUITFindBy(accessibility = "LOGIN_LOGINBUTTON")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement login;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'android:id/button2' and @index='0']")
	private MobileElement install;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//*[@label='Progression interrompue']")
	@AndroidFindBy(xpath = "//android.widget.ProgressBar[@resource-id='android:id/progress']")
	private MobileElement french_progressBar;

	@iOSFindBy(xpath = "//*[@label='Select AccessCard']")
	@AndroidFindBy(id = "com.td:id/loginEditText")
	private MobileElement select_accesscard;

	@iOSXCUITFindBy(accessibility = "ACTION_SHEET_LOGIN_DATA_CELL_0")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard']")
	private MobileElement addUser;

	@iOSFindBy(xpath = "//*[@label='Username or Access Card']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
	private MobileElement username_InFrench;

	@iOSFindBy(xpath = "//*[@label='Password']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password_InFrench;

	@iOSFindBy(xpath = "//*[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText' and @text='Ouvrir une session']")
	private MobileElement login_InFrench;

	@iOSFindBy(xpath = "//*[@label='Select AccessCard']")
	private MobileElement french_select_accesscard;

	@iOSFindBy(xpath = "//*[@label='Ajouter un nom d’utilisateur ou un numéro de carte Accès']")
	private MobileElement french_addUser;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'***')and @resource-id='com.td:id/txtAccessCard']")
	private MobileElement Mostusername_Displayedfirst;

	@iOSFindBy(xpath = "//*[@label='Remember me on']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'com.td:id/remember_switch' and @text='YES']")
	private MobileElement rememberMe_button;

	@iOSFindBy(xpath = "//*[@value='User name']")
	private MobileElement username_login;

	@iOSFindBy(xpath = "//*[@value='Password']")
	private MobileElement password_sendMoney;

	@iOSFindBy(xpath = "//*[@label='Log in']")
	private MobileElement login_sendMoney;

	@iOSFindBy(xpath = "//*[@label='Username or Access Card']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @text='Username or Access Card']")
	private MobileElement verify_No_Username;

	@iOSFindBy(xpath = "//*[@label='Back']")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//*[@label='Thanks, I'll do this later on my computer']")
	private MobileElement terms_Conditions_Msg;

	@iOSFindBy(xpath = "//*[@label='Logout']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement logout;

	@iOSFindBy(xpath = "//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//*[@label='Logged Out']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Logged Out']")
	private MobileElement logoutHeader;

	@iOSFindBy(xpath = "//*[contains(@label,'Cannot add additional Access Cards.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Cannot add additional Access Cards.')]")
	private MobileElement lblWarning;

	@iOSFindBy(xpath = "//*[@label='Security Question']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Security Question']")
	private MobileElement securityQuestionHeader;

	@iOSFindBy(xpath = "//*[@value='Enter your answer' or contains(@value,'Entrez votre') or @value='输入您的答案' or @value='輸入您的答案']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_answer']")
	private MobileElement enterAnswer;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[@label='Login' or @label='Ouvrir une session']")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/mfa_login_btn_txt' and
	// @text='Login']")
	@AndroidFindBy(id = "com.td:id/mfa_login_btn")
	private MobileElement securityLogin;

	// @iOSFindBy(xpath = "//*[contains(@label,'System Error')]")
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='OK' or @label='确定' or @label='確定']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement errorText;

	@iOSFindBy(xpath = " //*[contains(@label,'Conditions')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Terms & Conditions']")
	private MobileElement TermsAndCondition_header;

	@iOSFindBy(xpath = "//*[contains(@label,'do this later on my computer')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and contains(@text,'do this later on my computer')]")
	private MobileElement thanks_button;

	@iOSFindBy(xpath = "//*[@label='Clear text']")
	@AndroidFindBy(xpath = " ")
	private MobileElement clearText;

	@iOSFindBy(xpath = "//*[contains(@label,'Remember')]")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'com.td:id/remember_switch' and @text='YES']")
	private MobileElement rememberMe_button_on;

	/*
	 * @iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']")
	 * // @Author // - // Sushil // 02-Feb-2017
	 * 
	 * @AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation']")
	 * private MobileElement Investing_Trade;
	 */

	@iOSFindBy(xpath = "//*[(@label='Trade' or @label='Négociation' or @label='交易' or @label='交易') and @name='TDVIEW_TITLE']") // @Author
	// -
	// Sushil
	// 18-Dec-2017
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation' or @text='交易' or @text='交易']")
	private MobileElement Investing_Trade;

	String verifyLogin_ios = "//*[contains(@label,'Your Login Info Please')]";
	String verifyLogin_android = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']";
	String login_password = getTestdata("Password", "UserIDs");
	String[] passwordArray = login_password.split(",");
	static int count = 0;

	@iOSFindBy(xpath = "//*[contains(@label,'OK')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and contains(@text,'do this later on my computer')]")
	private MobileElement popup_ok_button;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement login_error;

	String securityPassword = getTestdata("SecurityPassword", "UserIDs");

	String passwords = getTestdata("Password", "Payment");
	String platFormName = CL.getTestDataInstance().getMobilePlatForm();
	String progressBarFrench = "//android.widget.ProgressBar[@resource-id='android:id/progress']";

	private static LoginMIT LoginMIT;

	public synchronized static LoginMIT get() {
		if (LoginMIT == null) {
			LoginMIT = new LoginMIT();
		}
		return LoginMIT;
	}

	private void Decorator() {
		{
			PageFactory.initElements(
					new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

		}

	}

	public void MITLogin() {
		Decorator();
		try {

			if (mobileAction.isObjExists(select_accesscard)) {
				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
			}
			if (mobileAction.isObjExists(addUser)) {

				mobileAction.FuncClick(addUser, "AddUser");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);

				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
				TradeMultiLeg.get().handleKeyboard();

				mobileAction.FuncClick(login, "Login");

				if (!mobileAction.isObjExists(Investing_Trade))
					enterPwdifError();

			}

			else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);

				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

				TradeMultiLeg.get().handleKeyboard();
				mobileAction.FuncClick(login, "Login");

				if (!mobileAction.isObjExists(Investing_Trade))
					enterPwdifError();

			}

			if (!mobileAction.isObjExists(Investing_Trade)) {
				if (mobileAction.isObjExists(enterAnswer)) {
					mobileAction.FuncSendKeys(enterAnswer, getTestdata("SecurityPassword", XLSheetUserIDs));
					TradeMultiLeg.get().handleKeyboard();

					mobileAction.FuncClick(securityLogin, "Login");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPwdifError() {
		Decorator();

		try {
			int iCnt = 1;
			// if(!mobileAction.isObjExists(Investing_Trade) &&
			// mobileAction.isObjExists(errorText))
			if (mobileAction.isObjExists(errorText)) {
				do {

					mobileAction.FuncClick(errorText, "errorText");

					mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
					TradeMultiLeg.get().handleKeyboard();
					mobileAction.FuncClick(login, "Login");
					iCnt++;
				} while (mobileAction.isObjExists(errorText) || iCnt > 5);

				if (iCnt > 5) {
					try {
						CL.GetReporting().FuncReport("Fail", "Login Failed");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				CL.GetReporting().FuncReport("Fail", "Login Failed");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
