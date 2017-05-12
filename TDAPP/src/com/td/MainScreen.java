package com.td;

import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;

public class MainScreen extends _CommonPage {

	String fieldsArray[] = { "UserType", "UserID", "Password", "SecurityAnswer", "Reason", "Accounts", "Env", "Amount",
			"Search", "Good'til", "Action", "Transfers", "USAccount", "FromAccount", "ToAccount", "AccessCard",
			"Description", "Payee", "Timeout", "SecondTimeout", "MerchantName", "Price", "Quantity",
			"Security_Question", "RecipientName", "RecipientMail", "Trading_Pwd", "Symbol", "ShareHolder",
			"SecurityPassword", "TriggerDelta", "CDNMarginAccount", "QuantityType", "Dividend", "SelectLimitPrice",
			"ConnectID", "Sender", "Ordervalue", "LimitDelta", "TriggerPrice", "Language", "Commission", "CardName",
			"Passcode", "NewPasscode", "Email", "Name" };

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

		final String appiumPath = CL.getTestDataInstance().getAppiumPath();

		if (!StringUtils.isEmpty(appiumPath)) { // Jenkins execution
			CL.getTestDataInstance().SetAppFilePath(CL.getTestDataInstance().targetEnvironment);
			CL.mobileApp(appiumPath);
		} else { // Local execution
			try {
				if (CL.getTestDataInstance().getAppFilePath() == null
						|| CL.getTestDataInstance().getAppFilePath().length() < 1) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_ANDROID"));
					} else {
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_IOS"));
					}
				}
				CL.mobileApp("http://49.27.23.62:4734/wd/hub"); // Change this
																// parameter to
																// point to the
																// correct
																// appium server

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
