package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LogoutMySpend extends _CommonPage {
	private static LogoutMySpend Logout;

	@iOSFindBy(xpath = "//XCUIElementTypeLink[contains(@label,'Logout') or contains(@label,'Fermer la session')]")
	private MobileElement logout;

	@iOSFindBy(xpath = "//*[@label='Logged Out' or @label='Terminé']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement loggedOutHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Success' or contains(@label,'Votre session a été fermée avec succès')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/success']")
	private MobileElement successMsg;

	@FindBy(id = "firstMenuItem")
	private WebElement logoutBtnAndroid;

	public synchronized static LogoutMySpend get() {
		if (Logout == null) {
			Logout = new LogoutMySpend();
		}
		return Logout;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will click on the Logout button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void logoutMySpend() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(logoutBtnAndroid, "Logout");
				CL.GetAppiumDriver().context("NATIVE_APP");
			} else {
				mobileAction.FuncClick(logout, "Logout");
			}
			mobileAction.verifyElementIsDisplayed(loggedOutHeader, "LoggedOut Header");
			mobileAction.verifyElementIsDisplayed(successMsg, "Success Message");

		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "InterruptedException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "IOException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
}
