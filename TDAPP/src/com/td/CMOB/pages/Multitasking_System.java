package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Multitasking_System extends _CommonPage {

	private static Multitasking_System Multitasking_System;

	public synchronized static Multitasking_System get() {
		if (Multitasking_System == null) {
			Multitasking_System = new Multitasking_System();
		}
		return Multitasking_System;
	}

	@iOSFindBy(xpath= "//*[@label='Quick Access']")
	@AndroidFindBy(xpath = "//*[@resource-id = 'android:id/action_bar_title']")
	private MobileElement home;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	/**
	 * This function will verify the app is in home page and makes the app to
	 * run in background for less 10 minutes and comes to foreground after that
	 * and application will display the page where the user left off and allows
	 * the user to continue using the app if the user resumes the app and it has
	 * not expired.
	 * 
	 * @return void
	 * @throws IOException
	 *             if there is a problem in reporting.
	 */
	public void multitasking() throws IOException {
		Decorator();

		mobileAction.verifyElementIsDisplayed(home, "Home");
		try {
			mobileAction.FuncRunAppInBackground(120);
			mobileAction.verifyElementIsDisplayed(home, "Home");
			mobileAction.quitDriver();
		} catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

}
