package com.td;

import java.io.IOException;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

import com.td.mainframe.Executor;

import io.appium.java_client.AppiumDriver;

public class MainScreen extends _CommonPage {

	// ***** LOCAL EXECUTION PARAMETERS *****
	// Change this parameter if doing local execution to point to your appium
	// server instance
	private static final String LOCAL_EXECUTION_APPIUM_SERVER = "http://49.21.141.201:4760/wd/hub/";
	// Change this parameter to point to the correct apk in Setup.xls for
	// Android
	private static final String APP_ANDROID = "APP_ANDROID_ZH";
	// Change this parameter to point to the correct ipa in Setup.xls for ios
	private static final String APP_IOS = "APP_IOS_ZH";

	public String fieldsArray[] = { "UserType", "UserID", "Password", "SecurityAnswer", "Reason", "Accounts", "Env",
			"Amount", "Search", "Good'til", "Action", "Transfers", "USAccount", "FromAccount", "ToAccount",
			"AccessCard", "Description", "Payee", "Timeout", "SecondTimeout", "MerchantName", "Price", "Quantity",
			"Security_Question", "RecipientName", "RecipientMail", "Trading_Pwd", "Symbol", "ShareHolder",
			"SecurityPassword", "TriggerDelta", "CDNMarginAccount", "QuantityType", "Dividend", "SelectLimitPrice",
			"ConnectID", "Sender", "Ordervalue", "LimitDelta", "TriggerPrice", "Language", "Commission", "CardName",
			"Passcode", "NewPasscode", "Email", "Name", "EmailProfile", "PhoneProfile", "PostSurveyText", "Response",
			"ProfileType" };

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

	public String p2pArray[] = { "HostPath", "HostUserName", "HostPassword", "ProfileType", "ProfileName", "ShortName",
			"FirstName", "Sirname", "Title", "GroupUser", "GroupPassword", "TestSet", "PersonalAccountACS",
			"PersonalAccountName", "BusinessAccountACSFirst", "BusinessFirstName", "BusinessAccountACSSecond",
			"BusinessSecondName", "MultiGroupUser", "BusinessEmailID" };

	public void readP2PSheet() {
		String inputValue = "";
		for (String columnName : p2pArray) {
			inputValue = CL.LoadData(columnName, CL.getTestDataInstance().getMasterTestData(), "P2P", "CustomerID",
					CL.getTestDataInstance().TcCustomerID);
			if (!inputValue.equals("") || columnName.equals("Language")) {
				CL.getTestDataInstance().TCParameters.put(columnName, inputValue);

			}
		}
	}

	public void Splash_Conitnue() throws IOException {
		CL.getTestDataInstance().Initialize(CL.getTestDataInstance().getMasterTestData());
		readSheet();
		readP2PSheet();

		if (getTestdata("ProfileType").equalsIgnoreCase("Personal")) {
			System.out.println("ProfileType: " + getTestdata("ProfileType"));
			Executor.get().createPersonalProfile();
		} else if (getTestdata("ProfileType").equalsIgnoreCase("Business")) {
			Executor.get().createBusinessProfile();
		} else if (getTestdata("ProfileType").equalsIgnoreCase("Multi")) {
			Executor.get().createMultiProfile();
		}

		final String udid = CL.getTestDataInstance().getDeviceUdid();
		// Jenkins only params

		final String appiumPath = CL.getTestDataInstance().getAppiumPath();
		final String targetEnv = CL.getTestDataInstance().targetEnvironment;
		final String[] targetEnvVars;

		if (!StringUtils.isEmpty(appiumPath) && !StringUtils.isEmpty(targetEnv)) { // Jenkins
																					// execution
			targetEnvVars = StringUtils.split(targetEnv, ":::");
			if (CL.getTestDataInstance().getAppFilePath() == null
					|| CL.getTestDataInstance().getAppFilePath().length() < 1) {
				CL.getTestDataInstance().SetAppFilePath(targetEnvVars[0]);
			}

			// If length is 2, then second token is the locale
			if (targetEnvVars.length == 2) {
				appStringMap = ((AppiumDriver) CL.GetDriver()).getAppStringMap(targetEnvVars[1]);
			}

			CL.mobileApp(appiumPath);
		} else { // Local execution
			try { // Set udid explicitly for local execution, to handle udid
					// with all caps, when reading from excel sheet // it seems
					// that framework forces to lower case
				CL.getTestDataInstance().DriversCapability.put("udid", udid);
				if (CL.getTestDataInstance().getAppFilePath() == null
						|| CL.getTestDataInstance().getAppFilePath().length() < 1) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", APP_ANDROID));
						currentLocale = CL.LoadData("Language",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", APP_ANDROID);
					} else if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", APP_IOS));
						currentLocale = CL.LoadData("Language",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", APP_IOS);
					}
				}
				CL.mobileApp(LOCAL_EXECUTION_APPIUM_SERVER);
				if (StringUtils.isEmpty(currentLocale)) {
					appStringMap = ((AppiumDriver) CL.GetDriver()).getAppStringMap();
				} else {
					appStringMap = ((AppiumDriver) CL.GetDriver()).getAppStringMap(currentLocale);
				}


			} catch (Exception e) {
				System.err.println("Unable to load APP file Path Exiting");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;

			}

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
