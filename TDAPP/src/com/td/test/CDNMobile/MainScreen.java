package com.td.test.CDNMobile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MainScreen extends _CommonPage {

	@AndroidFindBy(className = "android.widget.Button")
	private MobileElement btnContinue;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/laterButton")
	private MobileElement btnLater;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/loginEditText")
	private MobileElement EditUser;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/password_input")
	private MobileElement Password;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/remember_switch")
	private MobileElement RememberME;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/loginBtnText")
	private MobileElement btnLogin;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement tapHome;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Accounts']")
	private MobileElement accountBtn;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.tdbank:id/core_clearable_edit_text' and @index='0']")

	private MobileElement password;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	public void Splash_Conitnue() throws IOException {

		CL.getTestDataInstance().Initialize(CL.getTestDataInstance().getMasterTestData());
		String udid = CL.getTestDataInstance().getDeviceUdid();
		CL.getTestDataInstance().setALMUser("dharmm2");
		CL.getTestDataInstance().setALMUserpwd("");
		CL.getTestDataInstance().setALMDomain("");
		CL.getTestDataInstance().setALMProject("");
		CL.getTestDataInstance().setALMHost("");
		
		
		
		
		
		
		
		
		
		
		
		

		if (udid.equalsIgnoreCase("ce0716070dbb753003")) {

			try {
				if (CL.getTestDataInstance().getAppFilePath() == null
						|| CL.getTestDataInstance().getAppFilePath().length() < 1) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_ANDROID"));
					else
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_IOS"));
				}
				CL.mobileApp("http://0.0.0.0:4723/wd/hub");
				Decorator();
			} catch (Exception e) {
				System.err.println("Unable to load APP file Path Exiting");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;

			}
		} else {

			try {
				if (CL.getTestDataInstance().getAppFilePath() == null
						|| CL.getTestDataInstance().getAppFilePath().length() < 1) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_Android"));
					else
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_IOS"));
				}
				CL.mobileApp("http://127.0.0.1:4725/wd/hub");
				// Decorator();
			} catch (Exception e) {
				System.err.println("Unable to load APP file Path Exiting");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;

			}
		}
	}

	/*
	 * 
	 * 
	 * Object Model Components supporting the Java singleton pattern for the
	 * Page
	 * 
	 */
	// Singleton object of self
	private static MainScreen MainScreen;

	/**
	 * <p>
	 * Getter method for singleton instance.
	 * </p>
	 * 
	 * @return singleton instance of <b>this</b>
	 */
	public synchronized static MainScreen get() {
		if (MainScreen == null) {
			MainScreen = new MainScreen();
		}
		return MainScreen;
	}

}
