package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileBy.ByIosClassChain;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PageHeader extends _CommonPage {

	private static PageHeader pageHeader;

	// @iOSXCUITFindBy(iOSClassChain = "**/*[`name == 'TDVIEW_TITLE'`]")
	@iOSXCUITFindBy(xpath = "//*[@name='TDVIEW_TITLE'] | //XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement screenHeader;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	private MobileElement menuButton;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	private MobileElement backButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeActivityIndicator[1]")
	@AndroidFindBy(id = "android:id/progress")
	private MobileElement progressBar;

	public synchronized static PageHeader get() {
		if (pageHeader == null) {
			pageHeader = new PageHeader();
		}
		return pageHeader;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void clickBackButton() {
		Decorator();

		try {

			mobileAction.FuncClick(backButton, "Back button clicked");
			mobileAction.waitForElementToVanish(progressBar);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void goHome() {
		Decorator();

		try {

			boolean hasMenu = mobileAction.verifyElementIsPresent(menuButton);
			while (!hasMenu) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
					mobileAction.FuncClickBackButton();
					String headerText = mobileAction.FuncGetText(screenHeader);
					hasMenu = headerText.equalsIgnoreCase(getTextInCurrentLocale(StringArray.ARRAY_HOME_HEADER));
				} else {
					mobileAction.FuncClick(backButton, "Back button clicked");
					hasMenu = mobileAction.verifyElementIsPresent(menuButton);
				}
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public MobileElement getHeaderTextElement() {
		Decorator();

		return screenHeader;
	}

	public MobileElement getProgressBar() {
		Decorator();

		return progressBar;

	}

}