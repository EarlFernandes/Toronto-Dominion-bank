package com.td.test.TDI;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import com.td.test.CDNMobile.pages.GoogleVoiceWebPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TDILogin extends _CommonPage {

	private static TDILogin TDILogin;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[(@label='Manage Policies' or @label='TBD' or @label='TBD' or @label='TBD')]")
	@AndroidFindBy(id = "com.td.insurance:id/img_login_myinsurance")
	private MobileElement managePolicies;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@FindBy(id = "username101")
	private WebElement username;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField[1]")
	@FindBy(id = "password")
	private WebElement password;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//button[contains(@data-ng-click,'loginForm')]")
	private WebElement loginBtn;

	public synchronized static TDILogin get() {
		if (TDILogin == null) {
			TDILogin = new TDILogin();
		}
		return TDILogin;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}

	public void login() {
		Decorator();
		try {

			String usernameLogin = getTestdata("UserID");
			String passwordLogin = getTestdata("Password");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.FuncClick(username, "Username");
			mobileAction.FuncSendKeys(username, usernameLogin);
			mobileAction.FuncClick(password, "Password");
			mobileAction.FuncSendKeys(password, passwordLogin);
			mobileAction.FuncClick(loginBtn, "Login");
			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}
	}

}
