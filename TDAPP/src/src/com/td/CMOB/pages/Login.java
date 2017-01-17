package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.naming.NameNotFoundException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Login extends _CommonPage {

	private static Login Login;

	@iOSFindBy(xpath = "//*[@label='Remember me on']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/remember_switch' and @index='1']")
	private MobileElement rememberMe;

	@iOSFindBy(xpath = "//*[@label='Username or Access Card']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
	private MobileElement username;

	@iOSFindBy(xpath = "//*[@label='Password']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSFindBy(xpath = "//*[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement login;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'android:id/button2' and @index='0']")
	private MobileElement install;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//*[@label='Progression interrompue']")
	@AndroidFindBy(xpath = "//android.widget.ProgressBar[@resource-id='android:id/progress']")
	private MobileElement french_progressBar;

	@iOSFindBy(xpath = "//*[@label='Select AccessCard']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @content-desc='Username or Access Card']")
	private MobileElement select_accesscard;

	@iOSFindBy(xpath = "//*[@label='Add Username or Access Card']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard' and @text='Add Username or Access Card']")
	private MobileElement addUser;

	@iOSFindBy(xpath = "//*[@label='Username or Access Card']")
	// @iOSFindBy(xpath = "//*[@value='Nom d’utilisateur ou numéro de carte
	// Accès']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
	private MobileElement username_InFrench;

	// @iOSFindBy(xpath = "//*[@value='Mot de passe']")
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

	@iOSFindBy(xpath = "//*[@value='Enter your answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_answer']")
	private MobileElement enterAnswer;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mfa_login_btn_txt' and @text='Login']")
	private MobileElement securityLogin;

	@iOSFindBy(xpath = "//*[contains(@label,'System Error')]")
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
	
	String verifyLogin_ios = "//*[contains(@label,'Your Login Info Please')]";
	String verifyLogin_android = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']";
	String login_password = getTestdata("Password", "UserIDs");
	String[] passwordArray = login_password.split(",");
	static int count = 0;
	
	@iOSFindBy(xpath = "//*[contains(@label,'OK')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and contains(@text,'do this later on my computer')]")
	private MobileElement popup_ok_button;

	String securityPassword = getTestdata("SecurityPassword", "UserIDs");

	String passwords = getTestdata("Password", "Payment");
	String platFormName = CL.getTestDataInstance().getMobilePlatForm();
	String progressBarFrench = "//android.widget.ProgressBar[@resource-id='android:id/progress']";

	public synchronized static Login get() {
		if (Login == null) {
			Login = new Login();
		}
		return Login;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)),
				this);

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

	public void login() throws SystemException {

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
					mobileAction.waitForElementToVanished(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanished(progressBar);
				}
			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);

				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, passwords);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
				}
			}
			try {
				if (errorText.isDisplayed() == true) {

				}
			} catch (Exception e) {

			}
			/*try {
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

			}*/
			try {
				if (TermsAndCondition_header.isDisplayed() == true) {
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

			mobileAction.FuncClick(select_accesscard, "Select Accesscard");
			mobileAction.FuncClick(french_addUser, "AddUser");

			mobileAction.FuncClearUsername(username_InFrench, "Username");
			mobileAction.FuncSendKeys(username_InFrench, CL.getTestDataInstance().Userid);

			mobileAction.FuncClick(password_InFrench, "Password In French");
			mobileAction.FuncSendKeys(password_InFrench, CL.getTestDataInstance().UserPassword);
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(login_InFrench, "Login In French");
			mobileAction.waitForElementToDisappear(progressBarFrench);
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

			if (platFormName.equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
				Thread.sleep(1000);
				mobileAction.FuncClick(rememberMe_button, "Remember Yes");
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitForElementToVanish(progressBar);

			} else {

				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(rememberMe_button, "Remember Yes");
				mobileAction.FuncClick(login, "Login");
				Thread.sleep(20000);
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
			Thread.sleep(2000);
			mobileAction.FuncClick(backButton, "BackButton");
			mobileAction.FuncClick(menu, "Menu");
			mobileAction.FuncClick(logout, "Logout");
			mobileAction.FuncClick(backButton, "BackButton");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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

	public void sendMoneyLogin() {
		try {
			Decorator();
			mobileAction.FuncClick(username_login, "Username");

			String userId = getTestdata("UserID", "UserIDs");

			mobileAction.FuncSendKeys(username_login, userId);

			mobileAction.FuncClick(password_sendMoney, "Password");
			String passwords = getTestdata("Password", "UserIDs");
			mobileAction.FuncSendKeys(password_sendMoney, passwords);

			mobileAction.FuncClick(login_sendMoney, "Login");
			Thread.sleep(10000);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
				String connectIDs = getTestdata("ConnectID", "UserIDs");
				String userid[] = connectIDs.split(",");


				
				for (int i = 0; i < userid.length; i++) {
					boolean flag = select_accesscard.isDisplayed();
					if (flag) {

						mobileAction.FuncClick(select_accesscard, "Select Accesscard");
						mobileAction.FuncClick(addUser, "AddUser");
						mobileAction.FuncClick(username, "Username");
						mobileAction.FuncSendKeys(username, userid[i]);
						mobileAction.FuncClick(password, "Password");
						mobileAction.FuncSendKeys(password, passwords);

						if (platFormName.equalsIgnoreCase("Android")) {
							mobileAction.FuncHideKeyboard();
						}
						mobileAction.FuncClick(login, "Login");
						Thread.sleep(3000);
						mobileAction.waitForElementToVanish(progressBar);
					} else if (!flag) {

						mobileAction.FuncClick(username, "Username");
						mobileAction.FuncSendKeys(username, userid[i]);

						mobileAction.FuncClick(password, "Password");
						mobileAction.FuncSendKeys(password, passwords);

						if (platFormName.equalsIgnoreCase("Android")) {
							mobileAction.FuncHideKeyboard();
						}
						mobileAction.FuncClick(login, "Login");
						mobileAction.waitForElementToVanish(progressBar);
					}
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
				// mobileAction.FuncClick(gohome, "GO BACK HOME");
				HomeScreen.get().clickMenu();
				HomeScreen.get().clickBill();
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
	/**
	 * This method will verify whether the delete button is present for password field
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
				//take xpath for Android
				
			}
			
			
			
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will verify whether the delete button is present for Username field
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
				
				//take xpath for Android
				
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
				mobileAction.FuncSendKeys(password,CL.getTestDataInstance().UserPassword );
				mobileAction.FuncClick(clearText, "passwordCleared");
				mobileAction.verifyElementIsDisplayed(password, "Password Field"); 
				
			} else {

				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password,CL.getTestDataInstance().UserPassword );
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
				mobileAction.FuncSendKeys(password,CL.getTestDataInstance().UserPassword );
			
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
	

	// Added by saravanan
	public void verifylogin5times() throws SystemException {

		Decorator();
		try {

			if (select_accesscard.isDisplayed() == true) {

				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
				mobileAction.FuncClick(password, "Password");
				// mobileAction.FuncSendKeys(password,
				// CL.getTestDataInstance().UserPassword);
				mobileAction.FuncSendKeys(password, passwordArray[count]);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanished(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanished(progressBar);
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

			// verify login

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

			}
			try {
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
					mobileAction.waitForElementToVanished(progressBar);
				} else {
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanished(progressBar);
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
			try {
				if (errorText.isDisplayed() == true) {

				}
			} catch (Exception e) {

			}
			Thread.sleep(5000);

			logout();

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
