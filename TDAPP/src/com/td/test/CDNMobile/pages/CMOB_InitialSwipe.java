package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class CMOB_InitialSwipe extends _CommonPage {

	private static CMOB_InitialSwipe CMOB_InitialSwipe;

	@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='com.td:id/whatsnew_continue_button'])[2]")
	private MobileElement lets_Go_In;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']")
	private MobileElement home;

	String t_home = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']";

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Continue']")
	private MobileElement continue_Screen;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_deny_button' and @text='Deny']")
	private MobileElement deny;

	public synchronized static CMOB_InitialSwipe get() {
		if (CMOB_InitialSwipe == null) {
			CMOB_InitialSwipe = new CMOB_InitialSwipe();
		}
		return CMOB_InitialSwipe;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	public void InitialSwipe() {
		try {
			Decorator();
			mobileAction.FunctionSwipe("left", 2000, 30);
			Thread.sleep(1000);
			int[] screensize = mobileAction.FuncScreenSize();
			int x = screensize[0];
			int y = screensize[1];
			try {
				mobileAction.FuncClickCoordinates(x / 2, y - 10, 1);

				// Thread.sleep(5000);

				mobileAction.FuncClickCoordinates(x / 2, y - 200, 1);
				String version = (getTestdataOtherSheet("MobilePlatformVersion", "Batch Run"));
				if (version.equals("6.0.1")) {
					mobileAction.FuncClickAllow();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// mobileAction.waitForElementToAppear(t_home);
			// mobileAction.FuncClick(home,"Home");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
