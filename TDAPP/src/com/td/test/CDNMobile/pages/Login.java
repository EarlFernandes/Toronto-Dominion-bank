package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Login extends _CommonPage {

	private static Login Login;

	@iOSFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/remember_switch' and @index='1']")
	private MobileElement rememberMe;

	@iOSFindBy(accessibility = "LOGIN_USERNAME")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
	private MobileElement username;

	@iOSFindBy(xpath = "//*[@label='Nom d’utilisateur ou numéro de carte Accès']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
	private MobileElement usernameFRE;

	@iOSFindBy(accessibility = "LOGIN_PASSWORD")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSFindBy(accessibility = "LOGIN_FORGOTPASS")
	private MobileElement forgotPassword;
	
	@iOSFindBy(xpath = "//*[@label='Mot de passe']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement passwordFRE;

	@iOSFindBy(accessibility = "LOGIN_LOGINBUTTON")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement login;

	@iOSFindBy(xpath = "//*[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement loginFRE;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'android:id/button2' and @index='0']")
	private MobileElement install;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//*[@label='Progression interrompue']")
	@AndroidFindBy(xpath = "//android.widget.ProgressBar[@resource-id='android:id/progress']")
	private MobileElement french_progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	private MobileElement select_accesscard;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard']")
	private MobileElement addUser;

	@iOSFindBy(xpath = "//*[@label='Ajouter un nom d’utilisateur ou un numéro de carte Accès']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard' and @text='Add Username or Access Card']")
	private MobileElement addUserFRE;

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

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeButton")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//*[@label='Thanks, I'll do this later on my computer']")
	private MobileElement terms_Conditions_Msg;

	@iOSFindBy(accessibility = "NAV_DRAWER_ITEMS_LOGOUT")
	private MobileElement logout;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//*[@label='Logged Out']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Logged Out']")
	private MobileElement logoutHeader;

	@iOSFindBy(xpath = "//*[contains(@label,'Cannot add additional Access Cards.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Cannot add additional Access Cards.')]")
	private MobileElement lblWarning;

	// FIXME: What is the identifier for this?
	@iOSFindBy(xpath = "//*[@label='Security Question']")
	private MobileElement securityQuestionHeader;

	// FIXME: What is the identifier for this?
	@iOSFindBy(xpath = "//*[@value='Enter your answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_answer']")
	private MobileElement enterAnswer;

	// FIXME: What is the identifier for this?
	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/mfa_login_btn']")
	private MobileElement securityLogin;

	// FIXME: What is the identifier for this?
	@iOSFindBy(xpath = "//*[contains(@label,'System Error')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement errorText;

	// FIXME: What is the identifier for this?
	@iOSFindBy(xpath = " //*[contains(@label,'Conditions')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Terms & Conditions']")
	private MobileElement TermsAndCondition_header;

	// FIXME: What is the identifier for this?
	@iOSFindBy(xpath = "//*[contains(@label,'do this later on my computer')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and contains(@text,'do this later on my computer')]")
	private MobileElement thanks_button;

	@iOSFindBy(xpath = "//*[@label='Clear text']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement clearText;

	@iOSFindBy(xpath = "//*[contains(@label,'Remember')]")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id= 'com.td:id/remember_switch' and @text='YES']")
	private MobileElement rememberMe_button_on;

	String verifyLogin_ios = "//*[contains(@label,'Your Login Info Please')]";
	String verifyLogin_android = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']";
	String login_password = getTestdata("Password");

	@iOSFindBy(xpath = "//*[contains(@label,'Investing')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Investing Accounts']")
	private MobileElement investing;

	
	String[] passwordArray = login_password.split(",");
	static int count = 0;

	@iOSFindBy(xpath = "//*[contains(@label,'OK')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and contains(@text,'do this later on my computer')]")
	private MobileElement popup_ok_button;

	String securityPassword = getTestdata("SecurityPassword");

	// String passwords = getTestdata("Password", "Payment");
	String platFormName = CL.getTestDataInstance().getMobilePlatForm();
	String progressBarFrench = "//android.widget.ProgressBar[@resource-id='android:id/progress']";

	@iOSFindBy(xpath = "//*[contains(@label,'actionsheet delete account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard' and contains(@text,'*')]")
	private List<MobileElement> user;

	@iOSFindBy(xpath = "//*[@label='actionsheet delete account']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/layout_cross']")
	private MobileElement cross;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/confirm_delete']")
	private MobileElement deluser;

	String session = "//*[@label='Session Expired']";
	String session1 = "//*[@text='Session Expired']";
	String message = "Session Expired";

	public synchronized static Login get() {
		if (Login == null) {
			Login = new Login();
		}
		return Login;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)),
				this);

	}

	public boolean verifyAccessCard() {
		boolean flag = false;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				select_accesscard = mobileAction.verifyElementUsingXPath("//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @content-desc='" +  mobileAction.getAppString("username_str") + "']", "Username");
			}
			if(mobileAction.FuncISDisplayed(select_accesscard)){
					try {
						mobileAction.FuncClick(select_accesscard, "Select Accesscard");
						mobileAction.FuncClick(addUser, "AddUser");
						flag = true;
					} catch (NoSuchElementException | InterruptedException | IOException e) {
						System.out.print("Exception from Method " + this.getClass().toString());
					}
				} else {
					flag = false;
				}
			} catch (Exception e) {
				System.out.print("Exception from Method " + this.getClass().toString());
			}
		return flag;
	}

	public boolean verifyAccessCardFRE() {
		boolean flag = false;
		try {
			if(mobileAction.FuncISDisplayed(select_accesscard)){
				try {
					mobileAction.FuncClick(select_accesscard, "Select Accesscard");
					mobileAction.FuncClick(addUser, "AddUser");
					flag = true;
				} catch (NoSuchElementException | InterruptedException | IOException e) {
					System.out.print("Exception from Method " + this.getClass().toString());
				}
			} else {
				flag = false;
			}
		} catch (Exception e) {
			System.out.print("Exception from Method " + this.getClass().toString());
		}
		return flag;
	}

	public void verifySystemError() {
		try {
			if (errorText.isDisplayed()) {
				CL.GetReporting().FuncReport("Fail", "System exception occured during login");
			}
		} catch (Exception e) {
			System.out.print("Exception from Method " + this.getClass().toString());
		}

	}

	public void verifySecurityQuestion() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				securityQuestionHeader = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("securityQuestionPageHeader") + "']", "Security Page Header!");
			}
			if (securityQuestionHeader.isDisplayed()) {
				mobileAction.FuncClick(enterAnswer, "Enter your Answer");
				mobileAction.FuncSendKeys(enterAnswer, "abcd");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClick(done, "Done");
				} else {
					mobileAction.FuncHideKeyboard();
				}
				mobileAction.FuncClick(securityLogin, "Login");
				mobileAction.waitForElementToVanish(progressBar);
			} else {

			}

		} catch (Exception e) {

		}
	}

	public void verifyTandC() {

		try {
			if (TermsAndCondition_header.isDisplayed() == true) {
				String verify_terms = "Verifying TermsAndCondition Page Header";
				mobileAction.verifyElementIsDisplayed(TermsAndCondition_header, verify_terms);
				String button_clicked = "Thanks Button is clicked";
				mobileAction.FuncClick(thanks_button, button_clicked);
			} else {

			}
		} catch (Exception e) {
			System.out.print("Exception from Method " + this.getClass().toString());
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

			verifyAccessCard();
			mobileAction.FuncClick(username, "Username");
			mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
			mobileAction.FuncClick(password, "Password");
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitForElementToVanish(progressBar);
				
			} else {
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitForElementToVanish(progressBar);
				//Thread.sleep(5000);
			}
			verifySystemError();
			verifySecurityQuestion();
			verifyTandC();
			Thread.sleep(10000);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

			
			mobileAction.FuncClick(password_InFrench, "Password");
			mobileAction.FuncSendKeys(password_InFrench, CL.getTestDataInstance().UserPassword);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(login_InFrench, "Login");
				mobileAction.waitForElementToDisappear(progressBarFrench);
			} else {
				mobileAction.FuncClick(login_InFrench, "Login");

				mobileAction.waitForElementToDisappear(progressBarFrench);
			}
			verifySystemError();
			verifySecurityQuestion();
			verifyTandC();

			mobileAction.waitForElementToDisappear(progressBarFrench);
			mobileAction.waitForElementToDisappear(progressBarFrench);
			// verifySecurityQuestion();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
				mobileAction.waitForElementToVanish(progressBar);
			} else {
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(rememberMe_button, "Remember Yes");
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitForElementToVanish(progressBar);
			}
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

	public void verifyMostUser() {
		try {
			Decorator();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(select_accesscard, "Select AccessCard");
				String mostUsedUser = Mostusername_Displayedfirst.getAttribute("label");
				String oftenUsedUser = mostUsedUser.replace("***", "C5A");
				mobileAction.verifyTextEquality(oftenUsedUser, CL.getTestDataInstance().Userid);
			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.verifyElementIsDisplayed(Mostusername_Displayedfirst,
						"Verify The Most User Name Displayed First");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void logout() {
		try {
			Decorator();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(backButton, "BackButton");
				Thread.sleep(1000);
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(logout, "Logout");
				//mobileAction.FuncClick(backButton, "BackButton");
			} else {
				mobileAction.FuncClick(menu, "Menu");
				logout = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("logoutConfirmButtonLogout") + "']", "Logout");
				mobileAction.FuncClick(logout, "Logout");
}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void loginVerify() throws IOException {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(username, "no user name");

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String connectIDs = getTestdata("ConnectID");
				String userid[] = connectIDs.split(",");

				for (int i = 0; i < userid.length; i++) {
					boolean flag = select_accesscard.isDisplayed();
					if (flag) {

						mobileAction.FuncClick(select_accesscard, "Select Accesscard");
						mobileAction.FuncClick(addUser, "AddUser");
					}
					mobileAction.FuncClick(username, "Username");
					mobileAction.FuncSendKeys(username, userid[i]);
					mobileAction.FuncClick(password, "Password");
					String passwords = getTestdata("Password");

					mobileAction.FuncSendKeys(password, passwords);
					mobileAction.FuncClick(login, "Login");
					Thread.sleep(3000);
					mobileAction.waitForElementToVanish(progressBar);
					clickLogoutLnk();
				}

			} else {
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(logout, "Logout");
				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
				Thread.sleep(1000);
				HomeScreen.get().clickMenu();
				HomeScreen.get().clickBill();
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickLogoutLnk() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(backButton, "BackButton");
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(logout, "Logout");
				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
				mobileAction.FuncClick(backButton, "BackButton");
				mobileAction.FuncClick(menu, "Menu");
				HomeScreen.get().clickBill();

			} else {
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(logout, "Logout");
				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
				Thread.sleep(1000);
				HomeScreen.get().clickMenu();
				HomeScreen.get().clickBill();
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
			if (select_accesscard.isDisplayed() == true) {

				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
				mobileAction.FuncClick(clearText, "Clear Text");
				mobileAction.verifyElementIsDisplayed(password, "Password Field");

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
			if (select_accesscard.isDisplayed() == true) {

				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				mobileAction.FuncClick(clearText, "Clear Text");
				mobileAction.verifyElementIsDisplayed(username, "Username Field");

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

			if (select_accesscard.isDisplayed() == true) {

				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);

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
			if (select_accesscard.isDisplayed() == true) {

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
	public void verifylogin5times() throws SystemException {

		Decorator();
		try {

			if (select_accesscard.isDisplayed() == true) {

				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, passwordArray[count]);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				}
			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);

				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, passwordArray[count]);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				}
			}

			if (mobileAction.verifyLoginErrorOccured(verifyLogin_ios)) {
				mobileAction.FuncClick(popup_ok_button, "OK Button");

				if (count <= 4) {

					count++;
					verifylogin5times();
				}
			}

			try {
				if (errorText.isDisplayed() == true) {

				}
			} catch (Exception e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
			try {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					// TODO: iOS element
				} else {
					securityQuestionHeader = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("securityQuestionPageHeader") + "']", "Security Page Header!");
				}
				if (securityQuestionHeader.isDisplayed() == true) {
					mobileAction.FuncClick(enterAnswer, "Enter your Answer");
					mobileAction.FuncSendKeys(enterAnswer, "abcd");
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						mobileAction.FuncClick(done, "Done");
					} else {
						mobileAction.FuncHideKeyboard();
					}
					mobileAction.FuncClick(securityLogin, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				}

			} catch (Exception e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

			try {
				if (TermsAndCondition_header.isDisplayed()) {
					String verify_terms = "Verifying TermsAndCondition Page Header";
					mobileAction.verifyElementIsDisplayed(TermsAndCondition_header, verify_terms);
					String button_clicked = "Thanks Button is clicked";
					mobileAction.FuncClick(thanks_button, button_clicked);
				}
			} catch (NoSuchElementException | InterruptedException e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

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

	public void loginAndLogout() throws SystemException {

		Decorator();
		try {

			verifyAccessCard();
			mobileAction.FuncClick(username, "Username");
			mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
			mobileAction.FuncClick(password, "Password");
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitForElementToVanish(progressBar);
				
			} else {
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitForElementToVanish(progressBar);
				Thread.sleep(5000);
			}
			verifySystemError();
			verifySecurityQuestion();
			verifyTandC();
			Thread.sleep(10000);
			logout();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	public void loginWithoutTandC() throws SystemException {

		Decorator();
		try {

			if (select_accesscard.isDisplayed() == true) {

				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				}
			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);

				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);

				}
			}
			Thread.sleep(2000);

			try {
				if (errorText.isDisplayed() == true) {

				}
			} catch (Exception e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

			try {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					// TODO: iOS element
				} else {
					securityQuestionHeader = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("securityQuestionPageHeader") + "']", "Security Page Header!");
				}
				if (securityQuestionHeader.isDisplayed() == true) {
					mobileAction.FuncClick(enterAnswer, "Enter your Answer");
					mobileAction.FuncSendKeys(enterAnswer, "abcd");
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						mobileAction.FuncClick(done, "Done");
					} else {
						mobileAction.FuncHideKeyboard();
					}
					mobileAction.FuncClick(securityLogin, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				}

			} catch (Exception e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

			try {
				if (TermsAndCondition_header.isDisplayed()) {
					String verify_terms = "Verifying TermsAndCondition Page Header";
					mobileAction.verifyElementIsDisplayed(TermsAndCondition_header, verify_terms);
					Thread.sleep(4000);
					Decorator();
					Thread.sleep(4000);
					mobileAction.FuncClick(backButton, "BackButton");
					Thread.sleep(2000);
					mobileAction.FuncClick(menu, "Menu");
					Thread.sleep(2000);
					mobileAction.FuncClick(investing, "Investing");
					mobileAction.waitForElementToVanish(progressBar);

					Thread.sleep(2000);
				}
			} catch (NoSuchElementException | InterruptedException e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

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
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	// This method will count the number of users present in the access card

	public void verify_user() throws IOException {
		Decorator();
		try {
			mobileAction.FuncClick(select_accesscard, "Access Card");
			int count = user.size();
			for (int i = 0; i < count; i++) {
				if (user.get(i).isDisplayed()) {
					if (platFormName.equalsIgnoreCase("Android")) {
						mobileAction.verifyElementTextContains(user.get(i), "*");
					} else if (platFormName.equalsIgnoreCase("iOS")) {
						mobileAction.FunCSwipeandScroll(user.get(i), false);
						mobileAction.verifyElementIsDisplayed(user.get(i), "actionsheet delete account");
					}
				}
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void login_errorMsg() throws SystemException {

		String verifyLogin_ios = "//*[contains(@label,'Your Login Info Please')]";
		String verifyLogin_android = "//android.widget.ImageView[@resource-id= 'com.td:id/imageView1']";

		Decorator();
		try {

			if (select_accesscard.isDisplayed() == true) {

				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				}
			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);

				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);

				}
			}
			Thread.sleep(2000);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (mobileAction.verifyLoginErrorOccured(verifyLogin_ios)) {
					CL.GetReporting().FuncReport("Pass",
							"Your login information does not match what we have on file message is shown");

				} else {
					CL.GetReporting().FuncReport("Fail", "Your login information does not match info is not shown");

				}
			} else {
				if (mobileAction.verifyLoginErrorOccured(verifyLogin_android)) {
					CL.GetReporting().FuncReport("Pass",
							"Your login information does not match what we have on file message is shown");

				} else {
					CL.GetReporting().FuncReport("Fail", "Your login information does not match info is not shown");

				}
			}
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
				mobileAction.verifyTextEquality(username.getText(), mobileAction.getAppString("str_UsernameAndAccesscard"));
				mobileAction.verifyTextEquality(password.getText(), mobileAction.getAppString("password_str"));
				mobileAction.verifyTextEquality(rememberMe.getText(), mobileAction.getAppString("remember_str"));
				mobileAction.verifyTextEquality(login.getText(), mobileAction.getAppString("secureLoginButton"));
				// FIXME: Cannot find forgot password string?
				//mobileAction.verifyTextEquality(forgotPassword.getText(), mobileAction.getAppString(""));
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @text='" + mobileAction.getAppString("username_str") + "']", "Username");
				mobileAction.verifyElementUsingXPath("//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @content-desc='" + mobileAction.getAppString("password_str") + "']", "Password");
				mobileAction.FuncHideKeyboard();
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id= 'com.td:id/remember_text' and @text='" + mobileAction.getAppString("remember_str") + "']", "Remember Me");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/loginBtnText' and @text='" + mobileAction.getAppString("login_str") + "']", "Login");
				if(!Boolean.parseBoolean(rememberMe.getAttribute("checked"))) {
					mobileAction.FuncClick(rememberMe, "Remember Me Switch");
				}
				mobileAction.verifyElementUsingXPath("//android.widget.Switch[@resource-id='com.td:id/remember_switch' and @index='1' and @text='" + mobileAction.getAppString("yes_str") + "']", "Yes");
				if(Boolean.parseBoolean(rememberMe.getAttribute("checked"))) {
					mobileAction.FuncClick(rememberMe, "Remember Me Switch");
				}
				mobileAction.verifyElementUsingXPath("//android.widget.Switch[@resource-id='com.td:id/remember_switch' and @index='1' and @text='" + mobileAction.getAppString("no_str") + "']", "No");
				// Check it again for easier automation
				if(!Boolean.parseBoolean(rememberMe.getAttribute("checked"))) {
					mobileAction.FuncClick(rememberMe, "Remember Me Switch");
				}
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
