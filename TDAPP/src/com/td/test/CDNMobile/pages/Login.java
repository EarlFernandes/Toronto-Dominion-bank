package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import com.td.StringArray;
import com.td._CommonPage;
import com.td.mainframe.Executor;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Login extends _CommonPage {

	private static Login Login;

	/*
	 * This progressbar is special for P2P tests only, do not delete, it is
	 * called from p2p tests
	 */
	@iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeActivityIndicator[@value='1']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' or @resource-id='com.td:id/loading_indicator_textview']")
	public MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Remember me on']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/remember_switch' and @index='1']")
	private MobileElement rememberMe;

	@iOSFindBy(xpath = "//*[contains(@label,'Username or Access Card') or contains(@value,'Username or Access Card') or contains(@label,'Access Card or Username') or @name='LOGIN_USERNAME']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
	private MobileElement username;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@label='Nom d’utilisateur ou numéro de carte Accès']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
	private MobileElement usernameFRE;

	@iOSFindBy(accessibility = "LOGIN_PASSWORD")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSFindBy(accessibility = "LOGIN_FORGOTPASS")
	private MobileElement forgotPassword;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@label='Mot de passe']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement passwordFRE;

	@iOSFindBy(accessibility = "LOGIN_LOGINBUTTON")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement login;

	@iOSFindBy(accessibility = "LOGIN_USERNAME")
	@AndroidFindBy(id = "com.td:id/loginEditText")
	private MobileElement loginTextField;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement loginFRE;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'android:id/button2' and @index='0']")
	private MobileElement install;

	@iOSFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/loginEditText")
	private MobileElement select_accesscard;

	@iOSXCUITFindBy(accessibility = "ACTION_SHEET_LOGIN_DATA_CELL_0")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/txtAccessCard'])[1]")
	private MobileElement addUser;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Ajouter un nom d’utilisateur ou un numéro de carte Accès']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard' and @text='Add Username or Access Card']")
	private MobileElement addUserFRE;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@label='Username or Access Card']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
	private MobileElement username_InFrench;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@label='Password']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password_InFrench;

	// @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Login']")
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Login' or contains(@label,'Ouvrir une session')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText' and @text='Ouvrir une session']")
	private MobileElement login_InFrench;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Select AccessCard']")
	private MobileElement french_select_accesscard;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Ajouter un nom d’utilisateur ou un numéro de carte Accès']")
	private MobileElement french_addUser;

	@iOSFindBy(xpath = "//*[@name='LOGIN_USERNAME' or contains(@label,'Username or Access Card') or contains(@value,'Username or Access Card') or contains(@label,'Access Card or Username')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'***')and @resource-id='com.td:id/txtAccessCard']")
	private MobileElement Mostusername_Displayedfirst;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Remember me on']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'com.td:id/remember_switch' and @text='YES']")
	private MobileElement rememberMe_button;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@label='Username or Access Card']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @text='Username or Access Card']")
	private MobileElement verify_No_Username;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Thanks, I'll do this later on my computer']")
	private MobileElement terms_Conditions_Msg;

	@iOSFindBy(xpath = "//*[(@name='NAV_DRAWER_ITEMS_LOGOUT' or @name='flyout_title') and (@label='Logout' or @label='Fermer la session' or @label='退出' or @label='登出')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@resource-id='com.td:id/navText' or @resource-id='com.td:id/textview_flyout_menu_item') and @text='Logout']")
	private MobileElement logout;

	@iOSFindBy(xpath = "//*[@label='Logged Out']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Logged Out']")
	private MobileElement logoutHeader;

	@iOSFindBy(xpath = "//*[contains(@label,'Cannot add additional Access Cards.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Cannot add additional Access Cards.')]")
	private MobileElement lblWarning;

	// FIXME: What is the identifier for this?
	private MobileElement securityQuestionHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[1]")
	@AndroidFindBy(id = "com.td:id/mfa_answer")
	private MobileElement enterAnswer;

	@iOSFindBy(xpath = "//XCUIElementTypeToolbar/XCUIElementTypeButton")
	private MobileElement done;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/mfa_login_btn")
	private MobileElement securityLogin;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/mfa_question")
	private MobileElement mfaQuestion;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]")
	@AndroidFindBy(id = "TBD")
	private MobileElement loginFailAlert;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "TBD")
	private MobileElement loginFailAlertOK;

	// FIXME: What is the identifier for this?
	// @iOSFindBy(xpath = "//*[contains(@label,'Something went wrong on') or
	// contains(@label, 'MPAM') or contains(@label, 'request timed out') or
	// contains(@label, 'setup failed')]")
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='OK' or @label='确定' or @label='確定']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement errorText;

	@iOSFindBy(xpath = "//*[contains(@label,'Session Expired')]")
	@AndroidFindBy(xpath = "//*[contains(@text,'Session Expired')")
	private MobileElement sessionTimeout;

	// FIXME: What is the identifier for this?
	@iOSFindBy(xpath = " //*[contains(@label,'Conditions')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Terms & Conditions']")
	private MobileElement TermsAndCondition_header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'do this later on my computer')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'do this later on my computer')]")
	private MobileElement thanks_button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Clear text']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement clearText;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Remember')]")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'com.td:id/remember_switch' and @text='YES']")
	private MobileElement rememberMe_button_on;

	// String verifyLogin_ios =
	// "//XCUIElementTypeStaticText[contains(@label,'Your Login Info Please')]";
	String verifyLogin_ios = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]";
	String verifyLogin_android = "//*[contains(@text,'Your Login Info Please')]";
	String login_password = getTestdata("Password");

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1] | "
			+ "//XCUIElementTypeNavigationBar[@name='TDOCAErrorWithCTAView']/../XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text'] | //android.widget.TextView[@resource-id='com.td:id/error_message']")
	private MobileElement login_error;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Investing')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Investing Accounts']")
	private MobileElement investing;

	String[] passwordArray = login_password.split(",");
	static int count = 0;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'OK')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and contains(@text,'do this later on my computer')]")
	private MobileElement popup_ok_button;

	String platFormName = CL.getTestDataInstance().getMobilePlatForm();

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'actionsheet delete account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard' and contains(@text,'*')]")
	private List<MobileElement> user;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/layout_cross")
	private MobileElement cross;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/confirm_delete']")
	private MobileElement deluser;

	@iOSXCUITFindBy(xpath = "//*[@name='TDVIEW_TITLE' or @name='TD MySpend' or @name='Dépense TD'] | //XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1] | //XCUIElementTypeNavigationBar[1]/XCUIElementTypeOther[1]")
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/action_bar_title' or @resource-id='android:id/content']")
	private MobileElement logined_page_Header;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1] | "
			+ "//XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
	@AndroidFindBy(id = "com.td:id/remember_switch")
	private MobileElement rememberMeSwitch;

	@iOSXCUITFindBy(accessibility = "actionSheetCancelButton")
	@AndroidFindBy(id = "com.td:id/dialog_button")
	private MobileElement cancelActionList;

	// @iOSXCUITFindBy(xpath =
	// "//XCUIElementTypeImage[@name='OTPNewCustomerWelcomePage']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Welcome to TD' or @name='Bienvenue à la TD' or @name='欢迎使用道明' or @name='歡迎使用道明']")
	@AndroidFindBy(id = "com.td:id/image")
	private MobileElement otpWelcomeImage;

	@iOSFindBy(xpath = "//XCUIElementTypeImage[@name='OTPLandingPage1']")
	@AndroidFindBy(id = "com.td:id/image")
	private MobileElement otpWelcomeImageExisting;

	@iOSXCUITFindBy(accessibility = "descriptionLabel")
	@AndroidFindBy(id = "com.td:id/accountCaption")
	private MobileElement accountNameTradePerf;

	@iOSXCUITFindBy(accessibility = "CREDIT")
	@AndroidFindBy(id = "com.td:id/classificationTexView")
	private MobileElement bankingTitlePerf;

	String session = "//XCUIElementTypeStaticText[@label='Session Expired']";
	String session1 = "//android.widget.TextView[contains(@text,'Session Expired')]";
	String message = "Session Expired";

	final int REPEAT_TIMES = 4;

	public synchronized static Login get() {
		if (Login == null) {
			Login = new Login();
		}
		return Login;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);

	}

	public boolean verifyAccessCard() {
		boolean flag = false;
		try {
			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					try {
						mobileAction.FuncClick(select_accesscard, "Select Accesscard");
						mobileAction.FuncClick(addUser, "AddUser");
						flag = true;
					} catch (NoSuchElementException e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " "
								+ e.getCause());
					} catch (InterruptedException e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						System.out.println(
								"InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
					} catch (IOException e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					} catch (Exception e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Exception select_accesscard: " + e.getStackTrace());
		}

		return flag;
	}

	public boolean verifyAccessCardFRE() {
		boolean flag = false;
		try {
			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					try {
						mobileAction.FuncClick(select_accesscard, "Select Accesscard");
						mobileAction.FuncClick(addUser, "AddUser");
						flag = true;
					} catch (NoSuchElementException e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " "
								+ e.getCause());
					} catch (InterruptedException e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						System.out.println(
								"InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
					} catch (IOException e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					} catch (Exception e) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
						System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
			} else {
				flag = false;
			}
		} catch (Exception e) {
			System.out.println("Exception for no select_accesscard found for FRE");
		}
		return flag;
	}

	public boolean verifySystemError() {
		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(errorText)) {
				// will repeat, so remove error report
				return true;
			}
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception for no System Error ");
			return false;
		}
		return false;
	}

	public boolean verifySessionTimeout() {
		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(sessionTimeout)) {
				mobileAction.GetReporting().FuncReport("Fail", "Session Timeout during login");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return true;
			}
		} catch (Exception e) {
			System.out.println("No session timeout found");
			return false;
		}
		return false;
	}

	public void verifySecurityQuestion() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				/*
				 * securityQuestionHeader =
				 * mobileAction.verifyElementUsingXPath(
				 * "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
				 * + mobileAction.getAppString("securityQuestionPageHeader") +
				 * "']", "Security Page Header!");
				 */

				securityQuestionHeader = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ getTextInCurrentLocale(StringArray.ARRAY_LOGIN_SECURITY_QUESTION) + "']",
						"Security Page Header!");
			} else {
				securityQuestionHeader = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
								+ getTextInCurrentLocale(StringArray.ARRAY_LOGIN_SECURITY_QUESTION) + "']",
						"Security Page Header");

				securityLogin = mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_SECURITY_LOGIN) + "']", "Login");
			}

			if (mobileAction.verifyElementIsPresent(securityQuestionHeader)) {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
					enterAnswer = mobileAction.verifyElementUsingXPath(
							"//XCUIElementTypeSecureTextField[@value='"
									+ getTextInCurrentLocale(StringArray.ARRAY_MFA_ENTER_ANSWER) + "']",
							"Enter your answer");
				}
				mobileAction.FuncSendKeys(enterAnswer, getTestdata("SecurityAnswer"));
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClickDone();
				} else {
					mobileAction.FuncHideKeyboard();
				}
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
					securityLogin = mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
							+ getTextInCurrentLocale(StringArray.ARRAY_SECURITY_LOGIN) + "']", "Login");
				}
				mobileAction.FuncClick(securityLogin, "Login");
				mobileAction.waitProgressBarVanish();
			}
		} catch (Exception e) {
			System.out.println("No Security Question found");
		}
	}

	public void verifyTandC() {
		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(TermsAndCondition_header)) {
				String verify_terms = "Verifying TermsAndCondition Page Header";
				mobileAction.verifyElementIsDisplayed(TermsAndCondition_header, verify_terms);
				String button_clicked = "Thanks Button is clicked";
				mobileAction.FuncClick(thanks_button, button_clicked);
			} else {

			}
		} catch (Exception e) {
			System.out.println("Exception for no T&C found ");
		}
	}

	private boolean verifyIsLoginErrorSystemError() {
		if (verifySystemError()) {
			System.out.println("Failed with system error");
			return true;
		} else if (verifySessionTimeout()) {
			System.out.println("Failed with Session Expired");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return false;
		} else {
			System.out.println("Unknown login issue");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return false;
		}
	}

	private boolean isSystemErrorStillFound() {

		if (mobileAction.verifyElementIsPresent(otpWelcomeImage)) {
			// OTP New Customer Welcome page
			return false;

		} else if (!mobileAction.verifyElementIsPresent(logined_page_Header)) {
			// No screen header
			return verifyIsLoginErrorSystemError();

		} else {
			// Has screen header
			MobileElement screenheader = PageHeader.get().getHeaderTextElement();
			String securityQuestionTitle = getTextInCurrentLocale(StringArray.ARRAY_LOGIN_SECURITY_QUESTION);
			String pageTitle = mobileAction.getValue(logined_page_Header);
			String addLoginTitle = getTextInCurrentLocale(StringArray.ARRAY_ADD_LOGIN);
			if (pageTitle.contentEquals(securityQuestionTitle)) {
				System.out.println("Security Question page");
				verifySecurityQuestion();
				return false;
			} else if (pageTitle.contentEquals(addLoginTitle)) {
				// still in login page
				return verifyIsLoginErrorSystemError();
			} else if (screenheader.getText()
					.contains(getTextInCurrentLocale(StringArray.ARRAY_OTP_CHALLENGE_HEADER_TEXT))) {
				// OTP Challenge page
				return false;
			} else if (screenheader.getText()
					.contains(getTextInCurrentLocale(StringArray.ARRAY_PREFERENCE_SECURITY_SETTINGS))) {
				// OTP Update page
				return false;

			} else {
				System.out.println("Login successfully to page " + pageTitle);
				return false;
			}
		}
	}

	public void enterPwdifSystemError() {
		Decorator();

		try {
			int iCnt = 1;
			if (isSystemErrorStillFound()) {
				do {

					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
						mobileAction.FuncClick(errorText, "System Error Button");
					}
					mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
						mobileAction.FuncHideKeyboard();
					}
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitProgressBarVanish();
					iCnt++;

				} while (isSystemErrorStillFound() && iCnt <= REPEAT_TIMES);

				if (iCnt > REPEAT_TIMES) {
					try {
						System.out.println("Failed to try maximum " + (REPEAT_TIMES + 1) + " times");
						CL.GetReporting().FuncReport("Fail", "Login Failed");
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				CL.GetReporting().FuncReport("Fail", "Login Failed");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * This method will login the application
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void login() {

		Decorator();
		try {
			Thread.sleep(2000);
			verifyAccessCard();

			if (StringUtils.isEmpty(CL.getTestDataInstance().Userid)) {

				if (!StringUtils.isEmpty(Executor.acsNo)) {

					mobileAction.FuncSendKeys(username, Executor.acsNo);

				} else {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
			} else {

				// mobileAction.FuncSendKeys(username,
				// CL.getTestDataInstance().Userid);
				mobileAction.FuncSendKeys(getTestdata("UserID"));
			}
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			}

			String toRemember = getTestdata("Search");
			if (toRemember != null && toRemember.equalsIgnoreCase("rememberOff")) {
				setRememberMe(false);
			} else if (toRemember != null && toRemember.equalsIgnoreCase("rememberOn")) {
				setRememberMe(true);
			}

			// Even in Landscape mode, the login button is visible
			mobileAction.FuncClick(login, "Login");
			mobileAction.waitProgressBarVanish();
			enterPwdifSystemError();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will login the application in French Language
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void login_French() {

		Decorator();
		try {
			Thread.sleep(2000);
			verifyAccessCardFRE();
			mobileAction.FuncClick(username_InFrench, "username");
			mobileAction.FuncSendKeys(username_InFrench, CL.getTestDataInstance().Userid);
			mobileAction.FuncClick(password_InFrench, "Password");
			mobileAction.FuncSendKeys(password_InFrench, CL.getTestDataInstance().UserPassword);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(login_InFrench, "Login");
			mobileAction.waitProgressBarVanish();
			verifySystemError();
			verifySecurityQuestion();
			verifyTandC();

			mobileAction.waitProgressBarVanish();
			mobileAction.waitProgressBarVanish();
			// verifySecurityQuestion();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will login the application in French Language
	 * 
	 * @return void
	 * 
	 * 
	 * @throws Exception
	 *             If there is problem while reporting.
	 * 
	 */

	public void verifyBlankPage() {
		try {
			Decorator();
			String verify_blank_page = "Verify The Blank Username and Password";
			mobileAction.verifyElementIsDisplayed(verify_No_Username, verify_blank_page);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will login with rememberMeButton
	 * 
	 * @return void
	 * 
	 * 
	 * @throws NoSuchElementException
	 *             .
	 * 
	 */

	public void rememberClick() {
		Decorator();
		try {

			mobileAction.FuncClick(username, "Username");
			mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
			mobileAction.FuncClick(password, "Password");
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
			if (platFormName.equalsIgnoreCase("ios")) {
				Thread.sleep(1000);
				mobileAction.FuncClick(rememberMe_button, "Remember Yes");
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitProgressBarVanish();
			} else {
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(rememberMe_button, "Remember Yes");
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitProgressBarVanish();
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyMostUser() {
		try {
			Decorator();

			String userID = CL.getTestDataInstance().Userid;
			String maskedChars = userID.substring(2, 5);
			String maskeduserID = userID.replace(maskedChars, "***");
			System.out.println("Verify masked user:" + maskeduserID);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(select_accesscard, "Select AccessCard");
				mobileAction.verifyElementUsingXPath("//*[@label='" + maskeduserID + "']", maskeduserID);
			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.verifyElementUsingXPath(
						"//*[@text='" + maskeduserID + "' and @resource-id='com.td:id/txtAccessCard']", maskeduserID);
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void logout() {
		try {
			Decorator();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.ClickBackButton();
				Thread.sleep(1000);
				mobileAction.clickMenuButton();
				mobileAction.FuncClick(logout, "Logout");
				mobileAction.ClickBackButton();
				Thread.sleep(1000);
			} else {
				mobileAction.clickMenuButton();
				logout = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[(@resource-id='com.td:id/navText' or @resource-id='com.td:id/textview_flyout_menu_item') and @text='"
								+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_LOGOUT) + "']",
						"Logout");
				mobileAction.FuncClick(logout, "Logout");
			}
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void loginVerify() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(username, "no user name");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * Function to login 'N' times
	 *
	 * @return nothing
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws NoSuchElementException
	 */
	public void loginNTimes() {

		Decorator();
		try {

			String connectIDs = getTestdata("ConnectID");
			String userid[] = connectIDs.split(",");

			for (int i = 0; i < userid.length; i++) {
				// boolean flag = select_accesscard.isDisplayed();
				// if (flag) {
				//
				// mobileAction.FuncClick(select_accesscard, "Select
				// Accesscard");
				// mobileAction.FuncClick(addUser, "AddUser");
				// }
				verifyAccessCard();
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, userid[i]);
				mobileAction.FuncClick(password, "Password");
				String passwords = getTestdata("Password");

				mobileAction.FuncSendKeys(password, passwords);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
				}
				mobileAction.FuncClick(login, "Login");
				Thread.sleep(3000);
				mobileAction.waitProgressBarVanish();
				verifySecurityQuestion();
				verifyTandC();// Changed by Rashmi
				clickLogoutLnk();
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void clickLogoutLnk() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.ClickBackButton();
				mobileAction.clickMenuButton();
				mobileAction.FuncClick(logout, "Logout");
				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
				mobileAction.ClickBackButton();
				mobileAction.clickMenuButton();
				HomeScreen.get().clickBill();

			} else {
				mobileAction.clickMenuButton();
				mobileAction.FuncClick(logout, "Logout");
				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
				Thread.sleep(1000);
				HomeScreen.get().clickMenu();
				HomeScreen.get().clickBill();
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify whether the delete button is present for password
	 * field
	 *
	 * @return nothing
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws NoSuchElementException
	 */
	public void passwordFieldDelete() {

		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					mobileAction.FuncClick(select_accesscard, "Select Accesscard");
					mobileAction.FuncClick(addUser, "AddUser");
					mobileAction.FuncClick(username, "Username");
					mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
					mobileAction.FuncClick(password, "Password");
					mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
					mobileAction.FuncClick(clearText, "Clear Text");
					mobileAction.verifyElementIsDisplayed(password, "Password Field");
				} else {
					login_without_ID_remembered();
				}

			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify whether the delete button is present for Username
	 * field
	 *
	 * @return nothing
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws NoSuchElementException
	 */
	public void usernameFieldDelete() {

		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					mobileAction.FuncClick(select_accesscard, "Select Accesscard");
					mobileAction.FuncClick(addUser, "AddUser");
					mobileAction.FuncClick(username, "Username");
					mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
					mobileAction.FuncClick(clearText, "Clear Text");
					mobileAction.verifyElementIsDisplayed(username, "Username Field");
				}
			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);

			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clearPasswordField() {
		try {
			Decorator();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
				mobileAction.FuncClick(clearText, "passwordCleared");
				mobileAction.verifyElementIsDisplayed(password, "Password Field");

			} else {

				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
				mobileAction.FuncClick(clearText, "password cleared");
				mobileAction.verifyElementIsDisplayed(password, "Password Field");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void verifyUsernameField() {
		try {
			Decorator();

			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					mobileAction.FuncClick(select_accesscard, "Select Accesscard");
					mobileAction.FuncClick(addUser, "AddUser");
					mobileAction.FuncClick(username, "Username");
					mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				}
			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void verifyPasswordField() {
		try {
			Decorator();
			mobileAction.FuncClick(password, "Password");
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/*
	 * 
	 * This method will Check if that the Remember
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException In case an exception occurs while clicking
	 * over the element.
	 * 
	 * @throws IOException If there is problem while reporting.
	 * 
	 * @throws NoSuchElementException In case the element is not found over the
	 * screen.
	 */

	public void checkRememberMeByDefault() {

		Decorator();
		if (platFormName.equalsIgnoreCase("ios")) {
			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					try {
						mobileAction.FuncClick(select_accesscard, "Select Accesscard");
						mobileAction.FuncClick(addUser, "AddUser");
						mobileAction.verifyElementIsDisplayed(rememberMe_button_on, "Remember is ON");

					} catch (NoSuchElementException e) {
						System.err.println("TestCase has failed.");
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					} catch (InterruptedException e) {
						System.err.println("TestCase has failed.");
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					} catch (IOException e) {
						System.err.println("TestCase has failed.");
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					}
				}

			}
		}
	}

	/**
	 * This method will verify login for 5 times
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifylogin5times() {

		Decorator();
		int size = passwordArray.length;
		try {

			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					login_with_ID_remembered();
				} else {
					login_without_ID_remembered();
				}
			} else {

				login_without_ID_remembered();
			}

			try {
				if (mobileAction.verifyElementIsPresent(login_error)) {
					String loginerrorMessage = mobileAction.getValue(login_error);
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
						if (loginerrorMessage.contains("Your Login Info Please")) {
							mobileAction.FuncClick(popup_ok_button, "OK Button");

							if (count < size - 1) {

								count++;
								verifylogin5times();
							}
						} else {
							// login ID is locked

							System.err
									.println("TestCase has failed with unexpected error message:" + loginerrorMessage);
							CL.getGlobalVarriablesInstance().bStopNextFunction = false;
							mobileAction.Report_Fail(loginerrorMessage);
							return;
						}
					} else {
						if (loginerrorMessage.contains("Please try again")) {

							if (count < size - 1) {

								count++;
								verifylogin5times();
							}
						} else {
							System.err
									.println("TestCase has failed with unexpected error message:" + loginerrorMessage);
							CL.getGlobalVarriablesInstance().bStopNextFunction = false;
							mobileAction.Report_Fail(loginerrorMessage);
							return;
						}
					}

				}

			} catch (Exception e) {
				System.out.println("No login error.");
			}

			// try {
			// if (errorText.isDisplayed() == true) {
			//
			// }
			// } catch (Exception e) {
			// System.err.println("TestCase has failed.");
			// CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			// }

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

		try {
			if (mobileAction.verifyElementIsPresent(securityQuestionHeader)) {
				mobileAction.FuncClick(enterAnswer, "Enter your Answer");
				mobileAction.FuncSendKeys(enterAnswer, "abcd");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClickDone();
				} else {
					mobileAction.FuncHideKeyboard();
				}
				mobileAction.FuncClick(securityLogin, "Login");
				// mobileAction.waitForElementToVanish(progressBar);
			}

		} catch (Exception e) {
			System.out.println("NO Secuirity Question found.");
		}

		try {
			if (mobileAction.verifyElementIsPresent(TermsAndCondition_header)) {
				String verify_terms = "Verifying TermsAndCondition Page Header";
				mobileAction.verifyElementIsDisplayed(TermsAndCondition_header, verify_terms);
				String button_clicked = "Thanks Button is clicked";
				mobileAction.FuncClick(thanks_button, button_clicked);
			}
		} catch (Exception e) {
			// System.err.println("TestCase has failed.");
			// CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NO T&C found.");
		}

	}

	public void loginAndLogout() throws SystemException {

		Decorator();
		try {

			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					login_with_ID_remembered();
				} else {
					login_without_ID_remembered();
				}
			} else {

				login_without_ID_remembered();
			}
			enterPwdifSystemError();
			Thread.sleep(5000);

			logout();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will login the application
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void loginWithoutTandC() {

		Decorator();
		try {

			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					login_with_ID_remembered();
				}
			} else {

				login_without_ID_remembered();
			}
			Thread.sleep(2000);

			try {
				if (mobileAction.verifyElementIsPresent(errorText)) {

				}
			} catch (Exception e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

			try {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					securityQuestionHeader = mobileAction.verifyElementUsingXPath(
							"XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
									+ mobileAction.getAppString("securityQuestionPageHeader") + "']",
							"Security Page Header");
				} else {
					securityQuestionHeader = mobileAction.verifyElementUsingXPath(
							"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
									+ mobileAction.getAppString("securityQuestionPageHeader") + "']",
							"Security Page Header!");
				}

				if (mobileAction.verifyElementIsPresent(securityQuestionHeader)) {
					mobileAction.FuncClick(enterAnswer, "Enter your Answer");
					mobileAction.FuncSendKeys(enterAnswer, "abcd");
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						mobileAction.FuncClickDone();
					} else {
						mobileAction.FuncHideKeyboard();
					}
					mobileAction.FuncClick(securityLogin, "Login");
					mobileAction.waitProgressBarVanish();
				}

			} catch (Exception e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

			try {
				if (mobileAction.verifyElementIsPresent(TermsAndCondition_header)) {
					String verify_terms = "Verifying TermsAndCondition Page Header";
					mobileAction.verifyElementIsDisplayed(TermsAndCondition_header, verify_terms);
					Thread.sleep(4000);
					Decorator();
					Thread.sleep(4000);
					mobileAction.ClickBackButton();
					Thread.sleep(2000);
					mobileAction.clickMenuButton();
					Thread.sleep(2000);
					mobileAction.FuncClick(investing, "Investing");
					mobileAction.waitProgressBarVanish();

					Thread.sleep(2000);
				}
			} catch (NoSuchElementException | InterruptedException e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	// This method verifies the expired session dialog box appearing after 10
	// minutes of inactivity
	public void expired_session() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				mobileAction.waitForElementToAppear(session1, message);
			else
				mobileAction.waitForElementToAppear(session, message);
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (TimeoutException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("TimeoutException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	// this method will delete the user present in the access card
	public void delete_user() {
		try {
			Decorator();

			mobileAction.FuncClick(select_accesscard, "Select Accesscard");
			mobileAction.FuncClick(cross, "Cross ");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				mobileAction.FuncClickTap(deluser, "AcessCard deleted");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	// This method will count the number of users present in the access card

	public void verify_user() {
		Decorator();
		try {
			mobileAction.FuncClick(select_accesscard, "Access Card");
			int count = user.size();
			for (int i = 0; i < count; i++) {
				if (mobileAction.verifyElementIsPresent(user.get(i))) {
					if (platFormName.equalsIgnoreCase("Android")) {
						mobileAction.verifyElementTextContains(user.get(i), "*");
					} else if (platFormName.equalsIgnoreCase("iOS")) {
						mobileAction.FunCSwipeandScroll(user.get(i), false);
						mobileAction.verifyElementIsDisplayed(user.get(i), "actionsheet delete account");
					}
				}
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	private void login_with_ID_remembered() {
		try {
			mobileAction.FuncClick(select_accesscard, "Select Accesscard");
			mobileAction.FuncClick(addUser, "AddUser");
			mobileAction.FuncClick(username, "Username");
			mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
			mobileAction.FuncClick(password, "Password");
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(login, "Login");
			mobileAction.waitProgressBarVanish();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	private void login_without_ID_remembered() {
		try {
			mobileAction.FuncClick(username, "Username");
			mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);

			mobileAction.FuncClick(password, "Password");
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(login, "Login");
			mobileAction.waitProgressBarVanish();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void login_errorMsg() {

		Decorator();
		try {

			if (mobileAction.verifyElementIsPresent(select_accesscard)) {
				if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")
						&& StringUtils.contains(loginTextField.getAttribute("value"), "**"))
						|| (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
								&& StringUtils.contains(select_accesscard.getText(), "**"))) {
					login_with_ID_remembered();
				} else {
					login_without_ID_remembered();
				}
			} else {

				login_without_ID_remembered();
			}
			Thread.sleep(2000);
			if (mobileAction.verifyElementIsPresent(login_error)) {
				String errorMsg = mobileAction.getValue(login_error);
				System.out.println("Got error Msg:" + errorMsg);
				CL.GetReporting().FuncReport("Pass", errorMsg);
			} else {
				CL.GetReporting().FuncReport("Fail", "Your login information does not match info is not shown");

			}
			// if
			// (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))
			// {
			// //if (mobileAction.verifyLoginErrorOccured(verifyLogin_ios)) {
			// if(login_error.isDisplayed()){
			// String errorMsg= mobileAction.getValue(login_error);
			// CL.GetReporting().FuncReport("Pass",errorMsg);
			//
			// } else {
			// CL.GetReporting().FuncReport("Fail", "Your login information does
			// not match info is not shown");
			//
			// }
			// } else {
			// if (mobileAction.verifyLoginErrorOccured(verifyLogin_android)) {
			// CL.GetReporting().FuncReport("Pass",
			// "Your login information does not match what we have on file
			// message is shown");
			//
			// } else {
			// CL.GetReporting().FuncReport("Fail", "Your login information does
			// not match info is not shown");
			//
			// }
			// }
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify text within elements for the login page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyLoginScreenTextElements() {
		Decorator();
		try {
			verifyAccessCard();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(username.getText(),
						mobileAction.getAppString("str_UsernameAndAccesscard"));
				mobileAction.verifyTextEquality(password.getText(), mobileAction.getAppString("password_str"));
				// mobileAction.verifyTextEquality(rememberMe.getText(),
				// mobileAction.getAppString("remember_str"));
				mobileAction.verifyTextEquality(login.getText(), mobileAction.getAppString("secureLoginButton"));
				mobileAction.verifyTextEquality(forgotPassword.getText().trim(),
						getTextInCurrentLocale(StringArray.ARRAY_FORGOT_PASSWORD));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @text='"
								+ mobileAction.getAppString("username_str") + "']",
						"Username");
				// mobileAction.verifyElementUsingXPath(
				// "//android.widget.EditText[@resource-id=
				// 'com.td:id/password_input' and @content-desc='"
				// + mobileAction.getAppString("password_str") + "']",
				// "Password");
				mobileAction.FuncHideKeyboard();
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id=
				// 'com.td:id/remember_text' and @text='" +
				// mobileAction.getAppString("remember_str") + "']", "Remember
				// Me");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/loginBtnText' and @text='"
								+ mobileAction.getAppString("login_str") + "']",
						"Login");
				if (!Boolean.parseBoolean(rememberMe.getAttribute("checked"))) {
					mobileAction.FuncClick(rememberMe, "Remember Me Switch");
				}
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Switch[@resource-id='com.td:id/remember_switch' and @index='1' and @text='"
								+ mobileAction.getAppString("yes_str") + "']",
						"Yes");
				if (Boolean.parseBoolean(rememberMe.getAttribute("checked"))) {
					mobileAction.FuncClick(rememberMe, "Remember Me Switch");
				}
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Switch[@resource-id='com.td:id/remember_switch' and @index='1' and @text='"
								+ mobileAction.getAppString("no_str") + "']",
						"No");
				// Check it again for easier automation
				if (!Boolean.parseBoolean(rememberMe.getAttribute("checked"))) {
					mobileAction.FuncClick(rememberMe, "Remember Me Switch");
				}
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void setRememberMe(boolean turnOn) {
		Decorator();
		try {
			if (turnOn) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					if (!Boolean.parseBoolean(rememberMeSwitch.getAttribute("checked"))) {
						mobileAction.FuncClick(rememberMeSwitch, "Remember Me Switch ON");
					}
				} else {
					String currentState = mobileAction.FuncGetText(rememberMeSwitch);
					if (currentState
							.equalsIgnoreCase(getTextInCurrentLocale(StringArray.ARRAY_LOGIN_REMEMBER_ME_OFF))) {
						mobileAction.FuncClick(rememberMeSwitch, "Remember Me Switch ON");
					}
				}
			} else {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					if (Boolean.parseBoolean(rememberMeSwitch.getAttribute("checked"))) {
						mobileAction.FuncClick(rememberMeSwitch, "Remember Me Switch OFF");
					}
				} else {
					String currentState = mobileAction.FuncGetText(rememberMeSwitch);
					System.out.println(currentState);
					if (currentState.contains("Remember me")
							|| currentState.contains(getTextInCurrentLocale(StringArray.ARRAY_LOGIN_REMEMBER_ME_ON))) {
						mobileAction.FuncClick(rememberMeSwitch, "Remember Me Switch OFF");
					}
				}
			}
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void verifyUserNotRemembered() {
		Decorator();
		try {
			mobileAction.FuncClick(select_accesscard, "Select Accesscard");

			boolean hasCardList = mobileAction.verifyElementIsPresent(cancelActionList);
			MobileElement cardFound = null;
			String userID = getTestdata("UserID");
			String maskedCard = userID.substring(0, 2) + "***" + userID.substring(userID.length() - 3, userID.length());

			if (hasCardList) {
				String xpath = "";
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					xpath = "//android.widget.TextView[@text='" + maskedCard + "']";
				} else {
					xpath = "//XCUIElementTypeStaticText[@label='" + maskedCard + "']";
				}
				cardFound = mobileAction.swipeAndSearchByxpath(xpath, false, 5, "up");
			}

			if (cardFound != null) {
				CL.GetReporting().FuncReport("Pass", "The card <b>- " + maskedCard + "</b> is not remembered.");
			} else {
				CL.GetReporting().FuncReport("Fail", "The card <b> " + maskedCard + "</b> is remembered");
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void loginUsingAccessCardNumber() {
		Decorator();
		try {

			String connectID = getTestdata("UserID");
			// Save connectID to Accounts column for restore later
			CL.getTestDataInstance().TCParameters.put("Accounts", connectID);

			String accessCardNumber = getTestdata("Action");
			// Save accessCardNumber to UserID column for use in next Login
			CL.getTestDataInstance().TCParameters.put("UserID", accessCardNumber);

			login();

			connectID = getTestdata("Accounts");
			// Restore connectID to UserID column
			CL.getTestDataInstance().TCParameters.put("UserID", connectID);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void loginUsingAlias() {
		Decorator();
		try {

			String connectID = getTestdata("UserID");
			// Save connectID to Accounts column for restore later
			CL.getTestDataInstance().TCParameters.put("Accounts", connectID);

			String alias = getTestdata("Transfers");
			// Save accessCardNumber to UserID column for use in next Login
			CL.getTestDataInstance().TCParameters.put("UserID", alias);

			login();

			connectID = getTestdata("Accounts");
			// Restore connectID to UserID column
			CL.getTestDataInstance().TCParameters.put("UserID", connectID);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void deleteAllRememberedIDs() {
		Decorator();
		try {
			mobileAction.FuncClick(select_accesscard, "Select Accesscard");

			boolean hasIDs = mobileAction.verifyElementIsPresent(cross);
			while (hasIDs) {
				mobileAction.FuncClick(cross, "Delete Remembered ID");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncClick(deluser, "Delete Confirmed");
				}

				mobileAction.sleep(500);
				hasIDs = mobileAction.verifyElementIsPresent(cross);
			}

			boolean hasActionList = mobileAction.verifyElementIsPresent(cancelActionList);
			if (hasActionList) {
				mobileAction.FuncClick(cancelActionList, "Cancel Action List");
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void verifyAllRememberedIDsDeleted() {
		Decorator();
		try {
			mobileAction.FuncClick(select_accesscard, "Select Accesscard");

			boolean hasIDs = mobileAction.verifyElementIsPresent(cross);
			if (!hasIDs) {
				CL.GetReporting().FuncReport("Pass", "All Remembered IDs deleted");
			} else {
				CL.GetReporting().FuncReport("Fail", "Not all Remembered IDs deleted");
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void verifyRememberedIDs() {
		Decorator();
		try {
			String connectID = getTestdata("UserID");
			String accessCardNumber = getTestdata("Action");
			String alias = getTestdata("Transfers");
			String[] cardList = { connectID, accessCardNumber, alias };

			MobileElement cardFound = null;
			for (int i = 0; i < cardList.length; i++) {
				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				String card = cardList[i];
				String maskedCard = card.substring(0, 2) + "***" + card.substring(card.length() - 3, card.length());
				String xpath = "";
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					xpath = "//android.widget.TextView[@text='" + maskedCard + "']";
				} else {
					xpath = "//XCUIElementTypeStaticText[@label='" + maskedCard + "']";
				}
				cardFound = mobileAction.swipeAndSearchByxpath(xpath, false, 5, "up");
				// mobileAction.FuncClick(cancelActionList, "Cancel Action
				// List");
				mobileAction.FuncClickBackButton();

				if (cardFound == null) {
					break;
				}

			}

			if (cardFound != null) {
				CL.GetReporting().FuncReport("Pass", "All IDs remembered");
			} else {
				CL.GetReporting().FuncReport("Fail", "Not all IDs remembered");
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void verifyLoginMFA() {
		Decorator();
		try {
			int attempts = 0;
			boolean isMFA = false;

			while (!isMFA && (attempts < 10)) {
				// any ID between T0C5A[1 - 8][01 - 99]
				int digit1 = (int) (Math.random() * 8 + 1);
				int digit2 = (int) (Math.random() * 99 + 1);
				String randomID = "T0C5A" + digit1 + digit2;
				if (digit2 < 10) {
					randomID = "T0C5A" + digit1 + "0" + digit2;
				}
				System.out.println("RandomID: " + randomID);

				enterLoginCredentials(randomID);

				isMFA = mobileAction.verifyElementIsPresent(enterAnswer);
				if (isMFA) {
					String mfaQ1 = mobileAction.FuncGetText(mfaQuestion);

					for (int i = 0; i < 3; i++) {
						enterMFAAnswer("1111");
					}

					String mfaQ2 = mobileAction.FuncGetText(mfaQuestion);
					if (!mfaQ1.equalsIgnoreCase(mfaQ2)) {
						// enterMFAAnswer(getTestdata("SecurityAnswer"));
						// mobileAction.waitProgressBarVanish();
						CL.GetReporting().FuncReport("Pass", "Login MFA changed after 3 incorrect answers");

					} else {
						CL.GetReporting().FuncReport("Fail",
								"Login MFA Question did not change after 3 incorrect answers");
					}
					break;

				} else {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						boolean isFailAlert = mobileAction.verifyElementIsPresent(loginFailAlert);
						if (isFailAlert) {
							// login error alert
							mobileAction.FuncClick(this.loginFailAlertOK, "Login Fail Alert OK button");
						} else {
							// OTP screen
							mobileAction.ClickBackButton();
						}
					} else {
						// Non-home screen
						mobileAction.ClickBackButton();
						boolean isLoginScreen = mobileAction.verifyElementIsPresent(select_accesscard);
						if (!isLoginScreen) {
							HomeScreen.get().clickMenu();
							HomeScreen.get().clickMyAccounts();
						}
					}
					attempts++;
				}
			}

			if (!isMFA) {
				CL.GetReporting().FuncReport("Fail", "Login MFA did not appear");
			}

		} catch (

		Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void enterLoginCredentials(String ID) {
		Decorator();
		try {
			mobileAction.FuncClick(select_accesscard, "Select Accesscard");
			mobileAction.FuncClick(addUser, "AddUser");
			mobileAction.FuncSendKeys(username, ID);
			mobileAction.FuncClick(password, "Password");
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(login, "Login");
			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void enterMFAAnswer(String answer) {
		Decorator();
		try {
			mobileAction.FuncClick(enterAnswer, "Security Answer field");
			mobileAction.FuncSendKeys(enterAnswer, answer);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(securityLogin, "Login");
			mobileAction.sleep(2000);
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void loginTradePERF() {

		Decorator();
		try {
			Thread.sleep(2000);
			verifyAccessCard();

			mobileAction.FuncSendKeys(getTestdata("UserID"));
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			}

			// Even in Landscape mode, the login button is visible
			performance.click(login, "Login");
			performance.verifyElementIsDisplayed(accountNameTradePerf, "Account Name in Trade");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void loginAccountPERF() {

		Decorator();
		try {
			Thread.sleep(2000);
			verifyAccessCard();

			mobileAction.FuncSendKeys(getTestdata("UserID"));
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			}

			// Even in Landscape mode, the login button is visible
			performance.click(login, "Login");
			performance.verifyElementIsDisplayed(bankingTitlePerf, "CREDIT title in Accounts");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
