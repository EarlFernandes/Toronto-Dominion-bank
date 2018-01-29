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

public class TDIHomescreen extends _CommonPage {

	private static TDIHomescreen TDIHomescreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[(@label='Manage Policies' or @label='TBD' or @label='TBD' or @label='TBD')]")
	@AndroidFindBy(id = "com.td.insurance:id/img_login_myinsurance")
	private MobileElement managePolicies;

	public synchronized static TDIHomescreen get() {
		if (TDIHomescreen == null) {
			TDIHomescreen = new TDIHomescreen();
		}
		return TDIHomescreen;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}

	public void clickManagePolicies() {
		Decorator();
		try {

			mobileAction.FuncClick(managePolicies, "Manage Policies");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

}
