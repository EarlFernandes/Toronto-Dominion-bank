package com.td;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.support.PageFactory;

import bsh.Capabilities;
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
			"ConnectID", "Sender", "Ordervalue", "LimitDelta", "TriggerPrice", "Language", "Commission", "CardName",
			"Passcode", "NewPasscode" };

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

		// String
		// orientation=CL.getTestDataInstance().TCParameters.get("DeviceOrientation");

		if (udid.equalsIgnoreCase("1021f602")) {

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
				CL.mobileApp("http://49.27.22.144:4724/wd/hub");
			} catch (Exception e) {
				System.err.println("Unable to load APP file Path Exiting");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;

			}

		} else {

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
				CL.mobileApp("http://49.27.23.62:4734/wd/hub");//Iphone 7 Plus
				//CL.mobileApp("http://49.27.23.62:4764/wd/hub");//Iphone 6s
				//CL.mobileApp("http://49.27.23.62:4744/wd/hub");
				//CL.mobileApp("http://49.27.22.144:4736/wd/hub");//Samsung UDID 988673394d39433156
				
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
