
package com.td.test.CDNMobile;

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
	protected com.td.test.CDNMobile.MobileAction2 mobileAction = new com.td.test.CDNMobile.MobileAction2();
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
	public static final String commonpassword = "abcde123";
	// success/fail status
	public String overallSuccess = PASS;

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
	 * <p>
	 * Handle an Exception
	 * </p>
	 * 
	 * @param e
	 *            the Exception to handle
	 */
	protected static void handleException(Exception e) {
		System.err.println(e.getLocalizedMessage());
		// e.printStackTrace();

	}

	public String getTestdata(String aColumn, String aSheetName) {
		return CL.LoadData(aColumn, CL.getTestDataInstance().getMasterTestData(), aSheetName, "UserType",
				CL.getTestDataInstance().TestCaseID);
				
				//CL.getTestDataInstance().TestCaseID);
	}
	
	

}
