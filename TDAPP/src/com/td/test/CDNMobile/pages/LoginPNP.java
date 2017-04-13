package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPNP extends _CommonPage {

	@iOSFindBy(xpath = "//*[@label='Remember me on']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/remember_switch' and @index='1']")
	private MobileElement rememberMe;

	@iOSFindBy(xpath = "//*[@label='Username or Access Card']")
	//@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText']")
	private MobileElement username;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@label='Password']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSFindBy(xpath = "//*[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement login;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'android:id/button2' and @index='0']")
	private MobileElement install;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	//@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//*[@label='Progression interrompue']")
	@AndroidFindBy(xpath = "//android.widget.ProgressBar[@resource-id='android:id/progress']")
	private MobileElement french_progressBar;

	@iOSFindBy(xpath = "//*[@label='Select AccessCard']")
	//@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @content-desc='Username or Access Card']")
	@AndroidFindBy(id="com.td:id/loginEditText")
	private MobileElement select_accesscard;
	
	@iOSFindBy(xpath = "//*[@label='Username or Access Card']")
	//@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @content-desc='Username or Access Card']")
	@AndroidFindBy(id="com.td:id/loginEditText")
	private MobileElement loginTextUsername;

	@iOSFindBy(xpath = "//*[@label='Add Username or Access Card' or contains(@label,'Ajouter un nom')]")
	//@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard' and @text='Add Username or Access Card']")
	@AndroidFindBy(xpath = "//*[contains(@text,'Add Username') or contains(@text,'Ajouter un nom')]")
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

	@iOSFindBy(xpath = "//*[@value='Enter your answer' or contains(@value,'Entrez votre')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_answer']")
	private MobileElement enterAnswer;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/mfa_login_btn']")
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
	String login_password = getTestdata("Password","UserIDs");
	String[] passwordArray = login_password.split(",");
	static int count = 0;
	
	@iOSFindBy(xpath = "//*[contains(@label,'OK')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and contains(@text,'do this later on my computer')]")
	private MobileElement popup_ok_button;

	@iOSFindBy(xpath = "//*[@label='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Accounts']")
	private MobileElement txtMy_Account_Header;
	
	String securityPassword = getTestdata("SecurityPassword","UserIDs");


	String passwords = getTestdata("Password","UserIDs");
	String platFormName = CL.getTestDataInstance().getMobilePlatForm();
	String progressBarFrench = "//android.widget.ProgressBar[@resource-id='android:id/progress']";
	
	private static  LoginPNP LoginPNP;
	public synchronized static LoginPNP get() {
		if (LoginPNP == null) {
			LoginPNP = new LoginPNP();
		}
		return LoginPNP;
	}
	private void Decorator(){
		{
		PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver)CL.GetDriver()),new TimeOutDuration(15,TimeUnit.SECONDS)),this);	
	}
	
	}

	public void PNPLogin()
	{
		Decorator();
		try
		{
			String userName = CL.getTestDataInstance().TCParameters.get("UserID");
			String passWord = CL.getTestDataInstance().TCParameters.get("Password");
			System.out.println("UserName:"+ userName);
			System.out.println("Password:"+passWord);
			Thread.sleep(2000);
			if (loginTextUsername.isDisplayed() == true && (loginTextUsername.getText().contains("***")) ){
				System.out.println("Click dropdown and enter username");
				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				Thread.sleep(2000);
				mobileAction.FuncClick(addUser, "AddUser");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, userName);
				mobileAction.FuncClick(password, "Password");
				mobileAction.FuncSendKeys(password, passWord);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
					mobileAction.FuncHideKeyboard();
				}
				mobileAction.FuncClick(login, "Login");
				
			}else{
				System.out.println("Enter user name");
				mobileAction.FuncClick(username, "Username");
				mobileAction.FuncSendKeys(username, userName);

				mobileAction.FuncClick(password, "Password");
				//mobileAction.FuncSendKeys(password, passwords);
				mobileAction.FuncSendKeys(password, passWord);
				
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
					mobileAction.FuncHideKeyboard();
				}
				mobileAction.FuncClick(login, "Login");
			}
			

			Thread.sleep(25000);
			try{
				String accountHeader = "";
				if (!CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
					accountHeader = "//*[@label='Accounts' or @label='Comptes' or @label='Bills' or @label='Transfers']";
				}else{
					accountHeader = "//android.widget.TextView[@text='My Accounts' or @text ='Mes comptes' or @text='Bills' or @text='Transfers']";
				}
				MobileElement accountHeaderitem =(MobileElement) CL.GetDriver().findElement(By.xpath(accountHeader));
				if(accountHeaderitem.isDisplayed()){
					System.out.println(mobileAction.getValue(accountHeaderitem));
				}else{
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
						if(mobileAction.isObjExists(enterAnswer)){
							String securityAnswer = CL.getTestDataInstance().TCParameters.get("SecurityAnswer");
							System.out.println("Security Answer:" + securityAnswer);
							mobileAction.FuncSendKeys(enterAnswer,securityAnswer);
							mobileAction.FuncClick(enterAnswer, "enterAnswer");
							mobileAction.FuncHideKeyboard();
							mobileAction.FuncClick(securityLogin, "Login");
						}				
					}else{
						verifySystemError();
						verifySecurityQuestion();
						verifyTandC();
					}				
				}
			}catch (Exception e){
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
					if(mobileAction.isObjExists(enterAnswer)){
						String securityAnswer = CL.getTestDataInstance().TCParameters.get("SecurityAnswer");
						System.out.println("Security Answer:" + securityAnswer);
						mobileAction.FuncSendKeys(enterAnswer,securityAnswer);
						mobileAction.FuncClick(enterAnswer, "enterAnswer");
						mobileAction.FuncHideKeyboard();
						mobileAction.FuncClick(securityLogin, "Login");
					}				
				}else{
					verifySystemError();
					verifySecurityQuestion();
					verifyTandC();
				}								
			}
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void verifySystemError() {
		try {
			if (errorText.isDisplayed()) {
				CL.GetReporting().FuncReport("Fail", "System exception occured during login");
			}
		} catch (Exception e) {
			System.out.println("No error message found");
		}

	}

	public void verifySecurityQuestion() {
		try {
			if (securityQuestionHeader.isDisplayed()) {
				mobileAction.FuncClick(enterAnswer, "Enter your Answer");
				String securityAnswer = CL.getTestDataInstance().TCParameters.get("SecurityAnswer");
				System.out.println("Security Answer:" + securityAnswer);
				mobileAction.FuncSendKeys(enterAnswer, securityAnswer);
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
			System.out.println("No T&C found ");
		}
	}
}

