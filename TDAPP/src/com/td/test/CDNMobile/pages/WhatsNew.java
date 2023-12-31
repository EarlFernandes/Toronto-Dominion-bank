package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class WhatsNew extends _CommonPage {

	private static WhatsNew whatsnew;
	// String Whatsnew = "What\'s new | Nouveautés";

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement whatsnew_title;

	public synchronized static WhatsNew get() {
		if (whatsnew == null) {
			whatsnew = new WhatsNew();
		}
		return whatsnew;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void VerifyWhatsNewPageHeader() {
		Decorator();
		try {
			String titleText = getTextInCurrentLocale(StringArray.ARRAY_PREFERENCE_WAHTS_NEW);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementTextIsDisplayed(whatsnew_title, titleText);
			} else {
				// do nothing. IOS not implement it yet.
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
