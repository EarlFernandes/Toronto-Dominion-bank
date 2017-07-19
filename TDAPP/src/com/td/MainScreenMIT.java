package com.td;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.*;

import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class MainScreenMIT extends _CommonPage {

	@iOSFindBy(xpath = "//*[contains(@label,'Menu')]")
	@AndroidFindBy(id = "android:id/up")
	MobileElement MenuUp;

	/*
	 * @iOSFindBy(accessibility="Home")
	 * 
	 * @AndroidFindBy(accessibility="Home") MobileElement HomeLink;
	 */

	@iOSFindBy(xpath = "@label='Home'")
	@AndroidFindBy(id = "android:id/action_bar_title")
	MobileElement Home;

	// @iOSFindBy(accessibility="Investing")
	@iOSFindBy(xpath = "//*[contains(@label,'Investing') or contains(@label,'Comptes Placements')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Investing Accounts' or contains(@text,'Comptes Placements')) and @resource-id='com.td:id/navText']")
	MobileElement InvestingAccount;

	/*
	 * @iOSFindBy(className="") // ipgone locator strat
	 * 
	 * @AndroidFindBy(className="android.widget.Button") private MobileElement
	 * btnContinue;
	 * 
	 * @iOSFindBy(id=" ")
	 * 
	 * @AndroidFindBy(id="com.td:id/laterButton") private MobileElement
	 * btnLater;
	 * 
	 * @iOSFindBy(id=" ")
	 * 
	 * @AndroidFindBy(id="com.td:id/loginEditText") private MobileElement
	 * EditUser;
	 * 
	 * @iOSFindBy(id=" ")
	 * 
	 * @AndroidFindBy(id="com.td:id/password_input") private MobileElement
	 * Password;
	 * 
	 * @iOSFindBy(id=" ")
	 * 
	 * @AndroidFindBy(id="com.td:id/remember_switch") private MobileElement
	 * RememberME;
	 * 
	 * @iOSFindBy(id=" ")
	 * 
	 * @AndroidFindBy(id="com.td:id/loginBtnText") private MobileElement
	 * btnLogin;
	 * 
	 * @iOSFindBy(id=" ")
	 * 
	 * @AndroidFindBy(id="android:id/action_bar_title") private MobileElement
	 * tapHome;
	 */

	// <Objects
	// Login
	@iOSFindBy(xpath = "//*[@label='Select AccessCard']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @content-desc='Username or Access Card']")
	private MobileElement select_accesscard;

	@iOSFindBy(xpath = "//*[@label='Add Username or Access Card']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard' and @text='Add Username or Access Card']")
	private MobileElement addUser;

	@iOSFindBy(xpath = "//*[@label='Username or Access Card']")
	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and
	// @index='1']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText']")
	private MobileElement username;

	@iOSFindBy(xpath = "//*[@label='Password']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(60, TimeUnit.SECONDS)), this);
	}

	public void OpenApp() {
		try {
			// CL.getTestDataInstance().SetMobilePlatFormVersion("5.1");
			CL.getTestDataInstance().Initialize(CL.getTestDataInstance().getMasterTestData());
			// CL.getTestDataInstance().SetAppFilePath("C:\\Tools\\android-sdk-windows\\banking-wealth-16.4.0-20160429.232715-372-sys80-debug.apk");
			// //path at simulator server
			// CL.getTestDataInstance().SetAppFilePath("C:/Users/baraps2/MIT_Builds/Android/banking-wealth-17.3.1-20170130.145242-90-debug.apk");
			// //path at simulator server

			// ANDROID
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.getTestDataInstance().DriversCapability.put("udid", CL.getTestDataInstance().getDeviceUdid());
				// CL.getTestDataInstance().SetAppFilePath("C:/Users/baraps2/MIT_Builds/Android/banking-wealth-17.5.2-20170621.200502-2-debug.apk");
				// CL.getTestDataInstance().SetAppFilePath("C:/Automation/MIT_Builds/Android/banking-wealth-17.5.2-20170628.154723-39-debug.apk");
				// //path at simulator server
				CL.getTestDataInstance()
						.SetAppFilePath("/opt/app/Android/banking-wealth-17.5.2-20170621.200502-2-debug.apk"); // Mac
																												// Pro
				// CL.getTestDataInstance().SetAppFilePath("/Users/mobileqa/builds/banking-wealth-17.5.2-20170621.200502-2-debug.apk");
				// //Appium Lab
				// CL.mobileApp("http://0.0.0.0:4727/wd/hub"); // android Local
				CL.mobileApp("http://49.19.17.226:4760/wd/hub"); // android Mac
																	// Pro
				// CL.mobileApp("http://49.21.141.104:4760/wd/hub"); // Appium
				// Lab
			}
			// iOS
			else {

				CL.getTestDataInstance().SetAppFilePath(
						"/opt/app/banking-wealth-17.4.3-20170627.213247-56-ENTERPRISE-DEBUG-TESTING.ipa"); // path
																											// at
																											// iOS
																											// Mac
																											// Mini
				CL.mobileApp("http://49.19.17.226:4728/wd/hub"); // iOS Mac Pro

				// CL.mobileApp("http://192.168.2.8:4727/wd/hub"); // iOS Mac
				// Mini
			}

			// CL.mobileApp("http://devdx0199.d2-tdbfg.com:4444/wd/hub"); //
			// grid
			// CL.mobileApp("http://49.27.22.144:4723/wd/hub"); //iphone sim web
			// only
			CL.GetReporting().FuncReport(PASS, "Application Opened.");
		} catch (Exception e) {
			/*
			 * try { CL.GetReporting().FuncReport(FAIL,
			 * "Application not Opened."); } catch (IOException e1) {
			 * e1.printStackTrace(); }
			 */
			e.printStackTrace();
		}

		/*
		 * Decorator();
		 * 
		 * MobileAction.FuncClick(btnContinue);
		 * 
		 * btnLater.click();
		 */

		// Decorator wv = new Decorator();
		// System.out.println(CL.GetDriver().getPageSource());

		/*
		 * mobileAction.FuncClick(InvestingAccount,"InvestingAccount");
		 * 
		 * // wv.MyAccount.click();
		 * 
		 * 
		 * mobileAction.FuncClick(select_accesscard,"select_accesscard");
		 * //CL.GetReporting().FuncReport(PASS,String.
		 * format("TD Customer 'select_accesscard' button clicked."));
		 * mobileAction.FuncClick(addUser,"addUser");
		 * //CL.GetReporting().FuncReport(PASS,String.
		 * format("TD Customer 'addUser' button clicked."));
		 * mobileAction.FuncClick(username,"username");
		 * //CL.GetReporting().FuncReport(PASS,String.
		 * format("TD Customer 'username' button clicked."));
		 * mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
		 * //CL.GetReporting().FuncReport(PASS,
		 * String.format("Entered RIBUsername '%s'",
		 * CL.getTestDataInstance().Userid));
		 * mobileAction.FuncClick(password,"password");
		 * //CL.GetReporting().FuncReport(PASS,String.
		 * format("TD Customer 'password' button clicked."));
		 * mobileAction.FuncSendKeys(password,
		 * CL.getTestDataInstance().UserPassword);
		 * //CL.GetReporting().FuncReport(PASS,
		 * String.format("Entered RIBUsername '%s'",
		 * CL.getTestDataInstance().UserPassword));
		 * 
		 * MobileAction.FuncSendKeys(EditUser,CL.getTestDataInstance().Userid);
		 * MobileAction.FuncSendKeys(Password,CL.getTestDataInstance().
		 * UserPassword+"\n");
		 * 
		 * RememberME.click(); ((AppiumDriver) CL.GetDriver()).hideKeyboard();
		 * 
		 * 
		 * btnLogin.click();
		 * 
		 * CL.GetReporting().FuncReport("Pass"," Login Entered");
		 * Thread.sleep(5000); MenuUp.click();
		 * 
		 * 
		 * 
		 * CL.GetReporting().FuncReport("Pass"," User Login");
		 * 
		 * ((AppiumDriver) CL.GetDriver()).closeApp();
		 */
	}

	public void tapInvesting() {
		try {
			// System.out.println(CL.GetDriver().getPageSource());
			Decorator();

			if (CL.getTestDataInstance().getMobilePlatFormVersion().contains("9"))
				mobileAction.FuncClick(InvestingAccount, "InvestingAccount");
			else {
				mobileAction.FuncClick(MenuUp, "MenuUp");
				// mobileAction.FuncClick(Home, "Home");
				// System.out.println(CL.GetDriver().getPageSource());
				mobileAction.FuncClick(InvestingAccount, "InvestingAccount");
				// CL.GetDriver().getPageSource();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * ********* ********* ********* ********* ********* ********* *********
	 * ********* Components supporting the Java singleton pattern for the Page
	 * Object Model ********* ********* ********* ********* ********* *********
	 * ********* *********
	 */
	// Singleton object of self
	private static MainScreenMIT MainScreenMIT;

	/**
	 * <p>
	 * Getter method for singleton instance.
	 * </p>
	 * 
	 * @return singleton instance of <b>this</b>
	 */
	public synchronized static MainScreenMIT get() {
		if (MainScreenMIT == null) {
			MainScreenMIT = new MainScreenMIT();
		}
		return MainScreenMIT;
	}

}
