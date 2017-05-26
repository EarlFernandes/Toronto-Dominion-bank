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

//import bsh.Capabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MainScreen extends _CommonPage {

	// ***** LOCAL EXECUTION PARAMETERS *****
	// Change this parameter if doing local execution to point to your appium server instance
	private static final String LOCAL_EXECUTION_APPIUM_SERVER = "http://49.27.23.62:4734/wd/hub";
	// Change this parameter to point to the correct apk in Setup.xls for Android
	private static final String APP_ANDROID = "APP_ANDROID";
	// Change this parameter to point to the correct ipa in Setup.xls for ios
	private static final String APP_IOS = "APP_IOS";
	
	String fieldsArray[] = { "UserType", "UserID", "Password", "SecurityAnswer", "Reason", "Accounts", "Env", "Amount",
			"Search", "Good'til", "Action", "Transfers", "USAccount", "FromAccount", "ToAccount", "AccessCard",
			"Description", "Payee", "Timeout", "SecondTimeout", "MerchantName", "Price", "Quantity",
			"Security_Question", "RecipientName", "RecipientMail", "Trading_Pwd", "Symbol", "ShareHolder",
			"SecurityPassword", "TriggerDelta", "CDNMarginAccount", "QuantityType", "Dividend", "SelectLimitPrice",
			"ConnectID", "Sender", "Ordervalue", "LimitDelta", "TriggerPrice", "Language", "Commission", "CardName",
			"Passcode", "NewPasscode", "Email", "Name", "EmailProfile","PhoneProfile", "PostSurveyText"};

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
		String udid = CL.getTestDataInstance().getDeviceUdid();
		readSheet();
		// CL.getTestDataInstance().TCParameters.put("DeviceOrientation",CL.LoadData("DeviceOrientation",
		// CL.getTestDataInstance().getMasterTestData(), "Batch Run", "TCtoRun",
		// CL.getTestDataInstance().TestCaseID));

		// Jenkins only params
		final String appiumPath = CL.getTestDataInstance().getAppiumPath();
		final String targetEnv = CL.getTestDataInstance().targetEnvironment;

		if (!StringUtils.isEmpty(appiumPath) && !StringUtils.isEmpty(targetEnv)) { // Jenkins execution
			if (CL.getTestDataInstance().getAppFilePath() == null
					|| CL.getTestDataInstance().getAppFilePath().length() < 1) {
				CL.getTestDataInstance().SetAppFilePath(
						CL.LoadData("Value", CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", targetEnv));
			}
			CL.mobileApp(appiumPath);
		} else { // Local execution
			try {
				if (CL.getTestDataInstance().getAppFilePath() == null
						|| CL.getTestDataInstance().getAppFilePath().length() < 1) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", APP_ANDROID));
					} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", APP_IOS));
					}
				}
				CL.mobileApp(LOCAL_EXECUTION_APPIUM_SERVER); 

			} catch (Exception e) {
				System.err.println("Unable to load APP file Path Exiting");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;

			}

		}
	}

	// Decorator();

	/*
	 * if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase(
	 * "Android")) { //CL.getTestDataInstance().SetAppFilePath(
	 * "C:/Users/baraps2/MIT_Builds/Android/banking-wealth-17.3.1-20170130.145242-90-debug.apk"
	 * );
	 * CL.getTestDataInstance().SetAppFilePath("/opt/app/Android_Gold_43.apk");
	 * //path at simulator server
	 * CL.mobileApp("http://49.27.22.144:4724/wd/hub");; // android }
	 * CL.getTestDataInstance().SetAppFilePath("/opt/app/Android_Gold_43.apk");
	 * CL.mobileApp("http://49.27.22.144:4724/wd/hub");
	 * 
	 * } catch (Exception e) {
	 * System.err.println("Unable to load APP file Path Exiting");
	 * CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 * 
	 * } }
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
