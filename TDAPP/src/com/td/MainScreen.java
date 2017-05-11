package com.td;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
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

	String fieldsArray[] = { "UserType", "UserID", "Password", "SecurityAnswer", "Reason", "Accounts", "Env", "Amount",
			"Search", "Good'til", "Action", "Transfers", "USAccount", "FromAccount", "ToAccount", "AccessCard",
			"Description", "Payee", "Timeout", "SecondTimeout", "MerchantName", "Price", "Quantity",
			"Security_Question", "RecipientName", "RecipientMail", "Trading_Pwd", "Symbol", "ShareHolder",
			"SecurityPassword", "TriggerDelta", "CDNMarginAccount", "QuantityType", "Dividend", "SelectLimitPrice",
			"ConnectID", "Sender", "Ordervalue", "LimitDelta", "TriggerPrice", "Language", "Commission", "CardName", "Passcode" ,"NewPasscode"};


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
		CL.getTestDataInstance().DriversCapability.put("recreateChromeDriverSessions", "true");
		CL.getTestDataInstance().DriversCapability.put("appActivity", "com.td.mobile.controllers.MainController");
		CL.getTestDataInstance().DriversCapability.put("nativeWebScreenshot", "true");

		readSheet();

		String udid = CL.getTestDataInstance().getDeviceUdid();
		String AppiumPath="";
        if (CL.getTestDataInstance().targetEnvironment.length()>5) { // jenkins 
		   System.out.println("DEBUG : Jenkins parameters detected ");
		       CL.getTestDataInstance().SetAppFilePath(CL.getTestDataInstance().targetEnvironment); // application package with path via jenkins
		   AppiumPath=CL.getTestDataInstance().getAppiumPath(); //Jenkins parameters
		   System.out.println("DEBUG : Loading Application file package information from Setup file " + CL.getTestDataInstance().getSetupFile() );
		   if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
		          CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
		                       CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_Android"));
		   else
		          CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
		                       CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_IOS"));
		   CL.getTestDataInstance().setAppiumPath(AppiumPath);
		   CL.mobileApp();
        } else {
			//Samsung phone - dda65bdf tablet - 9d0f2a81032ca237 - ipad air e054ae65ead3aba183484acc611497ef06a47741
			// iphone 6 - 5ad12dcc0df2f1b65956f22e91035b8a0d288cd3
			if (udid.equalsIgnoreCase("5ad12dcc0df2f1b65956f22e91035b8a0d288cd3")) {
	
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
	
					// Freddy's computer: http://49.16.220.107:4725/wd/hub
					// MACbook pro: http://49.21.140.61:4723/wd/hub
					// Appium MAC MINI 1: http://49.21.141.201:4723/wd/hub
					// Appium MAC MINI 2: http://49.21.141.104:4723/wd/hub
					CL.mobileApp("http://49.21.140.61:4728/wd/hub");
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
					// Freddy's computer: http://49.16.220.107:4725/wd/hub
					// MACbook pro: http://49.21.140.61:4723/wd/hub
					// Appium MAC MINI 1: http://49.21.141.201:4723/wd/hub
					// Appium MAC MINI 2: http://49.21.141.104:4723/wd/hub
					CL.mobileApp("http://49.21.140.61:4728/wd/hub");
					Decorator();
				} catch (Exception e) {
					System.err.println("Unable to load APP file Path Exiting");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	
				}
			}
        }
		// Initialize App String map
		final String locale =  CL.LoadData("Value", CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "LOCALE");
		
		if (StringUtils.isEmpty(locale)) {
			appStringMap = ((AppiumDriver) CL.GetDriver()).getAppStringMap();
		} else {
			appStringMap = ((AppiumDriver) CL.GetDriver()).getAppStringMap(locale);
		}
	}

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
