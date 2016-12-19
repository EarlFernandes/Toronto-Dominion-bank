package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText' and @index='0']")
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
	private MobileElement select_accesscard;

	@iOSFindBy(xpath = "//*[@label='Add Username or Access Card']")
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

	@iOSFindBy(xpath = "//*[@label='']")
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
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");

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
			boolean flag = select_accesscard.isDisplayed();
			if (flag) {

				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");

				mobileAction.FuncClick(username, "Username");
				String userId = getTestdata("UserID", "UserIDs");

				mobileAction.FuncSendKeys(username, userId);

				mobileAction.FuncClick(password, "Password");
				String passwords = getTestdata("Password", "UserIDs");
				mobileAction.FuncSendKeys(password, passwords);

				if (platFormName.equalsIgnoreCase("Android")) {
					mobileAction.FuncHideKeyboard();

				}
				
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitForElementToVanish(progressBar);
			} else {

				mobileAction.FuncClick(username, "Username");
				String userId = getTestdata("UserID", "UserIDs");

				mobileAction.FuncSendKeys(username, userId);

				mobileAction.FuncClick(password, "Password");
				String passwords = getTestdata("Password", "UserIDs");
				mobileAction.FuncSendKeys(password, passwords);

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
	 * This method will login with rememberMeBu
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

			boolean flag = select_accesscard.isDisplayed();
			if (flag == true) {

				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");

				mobileAction.FuncClick(username, "Username");
				String userId = getTestdata("UserID", "UserIDs");

				mobileAction.FuncSendKeys(username, userId);

				mobileAction.FuncClick(password, "Password");
				String passwords = getTestdata("Password", "UserIDs");
				mobileAction.FuncSendKeys(password, passwords);

				if (platFormName.equalsIgnoreCase("Android")) {

					mobileAction.FuncHideKeyboard();

				}
				mobileAction.FuncClick(rememberMe_button, "Remember Me No");
				mobileAction.FuncClick(login, "Login");
				mobileAction.waitForElementToVanish(progressBar);
			} else {

				mobileAction.FuncClick(username, "Username");
				String userId = getTestdata("UserID", "UserIDs");

				mobileAction.FuncSendKeys(username, userId);

				mobileAction.FuncClick(password, "Password");
				String passwords = getTestdata("Password", "UserIDs");
				mobileAction.FuncSendKeys(password, passwords);
				if (platFormName.equalsIgnoreCase("Android")) {

					mobileAction.FuncHideKeyboard();
				}

				mobileAction.FuncClick(rememberMe_button, "Remember Me No");

				mobileAction.FuncClick(login, "Login");
				mobileAction.waitForElementToVanish(progressBar);
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	public void verifyMostUser() {
		try {
			Decorator();

			mobileAction.FuncClick(username, "Username");
			String verify_user_displayed_first = "Verify The Most User Name Displayed First";
			mobileAction.verifyElementIsDisplayed(Mostusername_Displayedfirst, verify_user_displayed_first);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
			// mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	
	/**
	 * Function to login 'N' times
	 *
	 * @return nothing
	 */
	public void loginNTimes() {
		Decorator();
		String connectID = getTestdata("ConnectID", "UserIDs");
		String[] userid = connectID.split(",");
		boolean flagAccessCard=false;
		boolean flagWarningMessage=false;
		for (int i = 1; i < userid.length; i++) {
			try {
				
				try{
					flagAccessCard=select_accesscard.isDisplayed();
					flagAccessCard=true;
				}catch(NoSuchElementException e){
					
					flagAccessCard=false;
				}
				
				System.out.println("access card displayed");
				 if(flagAccessCard==false){
					mobileAction.FuncClick(username, "UserName");
					mobileAction.FuncSendKeys(username, userid[i]);
					mobileAction.FuncClick(password, "PASSWORD");
					mobileAction.FuncSendKeys(password, getTestdata("Password", "UserIDs"));
					if (platFormName.equalsIgnoreCase("Android")) {
						mobileAction.FuncHideKeyboard();
					}else{}
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
					System.out.println("Login has been completed");
					
				} else  if(flagAccessCard==true){
					System.out.println("Accounts" + i);
					mobileAction.FuncClick(select_accesscard, "Select Accesscard");
					mobileAction.FuncClick(addUser, "AddUser");
					mobileAction.FuncClick(username, "UserName");
					mobileAction.FuncSendKeys(username, userid[i]);
					mobileAction.FuncClick(password, "PASSWORD");
					mobileAction.FuncSendKeys(password, getTestdata("Password", "UserIDs"));
					if (platFormName.equalsIgnoreCase("Android")) {
						mobileAction.FuncHideKeyboard();
					} else{}
					mobileAction.FuncClick(login, "Login");
					mobileAction.waitForElementToVanish(progressBar);
					System.out.println("Login has been completed");
				}try{
					flagWarningMessage=lblWarning.isDisplayed();
					flagWarningMessage=true;
					}catch(NoSuchElementException e){
						System.out.println("Exeption Caught and will do logout");
						flagWarningMessage=false;
						
					}
				if(flagWarningMessage==false){
					 clickLogoutLnk();
				}else{
					mobileAction.verifyElementIsDisplayed(lblWarning, "Warning :");
					break;
				}
				
			} 
				catch (NoSuchElementException e) {
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

	public void clickLogoutLnk() {

		Decorator();
		try {
			if (platFormName.equalsIgnoreCase("ios")) {

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

}
