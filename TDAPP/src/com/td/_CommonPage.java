
package com.td;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * <p>
 * Super class for all PageObject classes in support of reusable components.
 * </p>
 */
public class _CommonPage {
	// reusable components
	protected com.td.test.framework.CommonLib CL = new com.td.test.framework.CommonLib();
	protected com.td.test.framework.PerformAction PerformAction = new com.td.test.framework.PerformAction();
	protected com.td.MobileAction2 mobileAction = new com.td.MobileAction2();

	// public Reporting report;// = CL.GetReporting();
	// calculated or discovered values
	protected By foundElement = null;
	// public com.td.test.framework.GlobalVariables GV;// =
	// com.td.test.framework.GlobalVariables;
	// public static com.td.test.framework.DriverScript DriverScript;
	// Language map

	public HashMap<String, String> languageMap = new HashMap<String, String>();

	public static final String FAIL = "FAIL";
	public static final String PASS = "PASS";
	public static final String XLSheetUserIDs = "UserIDs";
	public static final String commonpassword = "abcde123";
	// success/fail status
	public String overallSuccess = PASS;
	
	public String locale_used ="FR"; //"zh-rHK"; //"EN";//"zh-Hans" "FR";
	//android //"zh-rHK"; //"EN";//"zh"
    //ios: zh-Hans, zh-Hant
	@iOSFindBy(id = "com.td:id/list_slidermenu")
	@AndroidFindBy(id = "com.td:id/list_slidermenu")
	public class widgetListview {

		@iOSFindBy(id = " ")
		@AndroidFindBy(id = "android:id/up")
		MobileElement MenuUp;

		@iOSFindBy(accessibility = "Home")
		@AndroidFindBy(accessibility = "Home")
		MobileElement HomeLink;

		@iOSFindBy(accessibility = "My Accounts")
		// @AndroidFindBy(xpath="//*[@value='My Accounts']")
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Accounts']")
		MobileElement MyAccount;

		widgetListview() {
			PageFactory.initElements(
					new AppiumFieldDecorator(CL.GetDriver(), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		}
	}

	/**
	 * This method is used to retrieve the values from excel sheet
	 *
	 * 
	 * 
	 * @param key
	 */

	public String getTestdata(String aColumn) {
		return CL.getTestDataInstance().TCParameters.get(aColumn);
	}

	/**
	 * 
	 * @param key
	 */
	public void readVerifyMessages(String key) {
		CL.getTestDataInstance().VerificationStrings.get(key);
	}

	/**
	 * <p>
	 * Handle an Exception
	 * </p>
	 * 
	 * @param e
	 *            the Exception to handle
	 */
	protected static void handleException(Exception e) {
		System.err.println(e.getLocalizedMessage());
	}

	public String getTestdataOtherSheet(String aColumn, String aSheetName) {
		return CL.LoadData(aColumn, CL.getTestDataInstance().getMasterTestData(), aSheetName, "UserType",
				CL.getTestDataInstance().TestCaseID);
	}

	public String getTestdata(String aColumn, int index) {

		String multiValue[] = null;
		String currentCellValue = CL.getTestDataInstance().TCParameters.get(aColumn);

		if (currentCellValue.contains(":")) {
			multiValue = currentCellValue.split(":");
		} else if (currentCellValue.contains(",")) {
			multiValue = currentCellValue.split(",");
		} else {
			return currentCellValue;
		}

		if (index < currentCellValue.length()) {
			return multiValue[index];
		} else {
			return multiValue[0];
		}
	}

	public String[] getTestDataStringArray(String aColumn) {
		String multiValue[] = null;
		String currentCellValue = CL.getTestDataInstance().TCParameters.get(aColumn);

		if (currentCellValue.contains(":")) {
			multiValue = currentCellValue.split(":");

		} else if (currentCellValue.contains(",")) {

			multiValue = currentCellValue.split(",");

		} else {
			String value= currentCellValue;
			multiValue=new String[1];
			multiValue[0]=value;

		}
		return multiValue;
	}

	
	public String getTestdata(String aColumn, String aSheetName) {
		return CL.LoadData(aColumn, CL.getTestDataInstance().getMasterTestData(), aSheetName, "UserType",
				CL.getTestDataInstance().TestCaseID);
	}
	
}
