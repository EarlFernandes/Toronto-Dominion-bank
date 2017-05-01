package com.td;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MainScreenPNP extends _CommonPage {

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

	String fieldsArray[] = { "UserType", "UserID", "Password", "SecurityAnswer", "Reason", "Accounts", "Env", "Amount",
			"Search", "Good'til", "Action", "Transfers", "USAccount", "FromAccount", "ToAccount", "AccessCard",
			"Description", "Payee", "Timeout", "SecondTimeout", "MerchantName", "Price", "Quantity",
			"Security_Question", "RecipientName", "RecipientMail", "Trading_Pwd", "Symbol", "ShareHolder",
			"SecurityPassword", "TriggerDelta", "CDNMarginAccount", "QuantityType", "Dividend", "SelectLimitPrice",
			"ConnectID", "Sender", "Ordervalue", "LimitDelta", "TriggerPrice", "Language", "Commission", "CardName", "Passcode" ,"NewPasscode","EmailProfile","PhoneProfile", "PostSurveyText"};


	public void readSheet() {
		CL.getTestDataInstance().TCParameters = new HashMap<String, String>();
		String inputValue = "";
		for (String columnName : fieldsArray) {
			inputValue = CL.LoadData(columnName, CL.getTestDataInstance().getMasterTestData(), "UserIDs", "UserType",
					CL.getTestDataInstance().sUserType);
			if (!inputValue.equals("") || columnName.equals("Language")) {
				CL.getTestDataInstance().TCParameters.put(columnName, inputValue);
				
			}
		}

	}

	public void Splash_Conitnue() throws IOException {

		CL.getTestDataInstance().Initialize(CL.getTestDataInstance().getMasterTestData());
		
		
		readSheet();
        
		String udid = CL.getTestDataInstance().getDeviceUdid();
		String definedUDID = udid;
		//if (udid.equalsIgnoreCase("c52ac686ec37348c007c9b3846d3ad43df2ccc02")) {
		//if (udid.equalsIgnoreCase("f56c9af3")) {
		//if (udid.equalsIgnoreCase(definedUDID)) {

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
				CL.mobileApp("http://49.21.140.61:4723/wd/hub");
				//CL.mobileApp("http://49.21.141.201:4723/wd/hub");
				//CL.mobileApp("http://49.27.23.62:4723/wd/hub");
				//CL.mobileApp("http://0.0.0.0:4725/wd/hub");
				Decorator();
			} catch (Exception e) {
				System.err.println("Unable to load APP file Path Exiting");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;

			}
		//} 
	}
	
	// Singleton object of self
	private static MainScreenPNP MainScreen;

	/**
	 * <p>
	 * Getter method for singleton instance.
	 * </p>
	 * 
	 * @return singleton instance of <b>this</b>
	 */
	public synchronized static MainScreenPNP get() {
		if (MainScreen == null) {
			MainScreen = new MainScreenPNP();
		}
		return MainScreen;
	}

}

