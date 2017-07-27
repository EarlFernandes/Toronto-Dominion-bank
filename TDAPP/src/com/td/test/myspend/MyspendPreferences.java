package com.td.test.myspend;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MyspendPreferences extends com.td._CommonPage {

	private static MyspendPreferences Preferences;

	public synchronized static MyspendPreferences get() {
		if (Preferences == null) {
			Preferences = new MyspendPreferences();
		}
		return Preferences;
	}

	String platform = null;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'SELECT ACCOUNTS') or contains(@label,'CHOISIR DES COMPTES')]/following-sibling::XCUIElementTypeOther[contains(@label,'ON') or contains(@name,'ON')]")
	private List<MobileElement> onButtons;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'SELECT ACCOUNTS') or contains(@label,'CHOISIR DES COMPTES')]/following-sibling::XCUIElementTypeOther[contains(@label,'OFF') or contains(@name,'OFF')]")
	private List<MobileElement> offButtons;

	@iOSFindBy(xpath = "//*[contains(@label,'Account Preferences') or contains(@label,'Paramètres du compte')]")
	private MobileElement pageHeader;

	@FindBy(xpath = "//*[contains(@ng-model,'isFWMOn')]")
	private List<WebElement> onButtonsAndroid;

	@FindBy(xpath = "//*[contains(@ng-model,'isFWMOff')]")
	private List<WebElement> offButtonsAndroid;

	@FindBy(xpath = "//*[@class='title header-item title-left']")
	private WebElement pageHeaderAndroid;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	/**
	 * This method will verify the 'Preferences' header page.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void verifyPageHeader() throws InterruptedException {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(pageHeaderAndroid, "Preferences Page Header");
			} else {
				mobileAction.verifyElementIsDisplayed(pageHeader, "Preferences Page Header");
			}
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void disableAllAccounts() {
		Decorator();
		int accSize = 0;

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (onButtonsAndroid.isEmpty()) {
					enableAllAccounts();
					Spending_Insight.get().clickSideMenuButton();
					SideMenu.get().clickPreferences();
				}
				System.out.println(onButtonsAndroid.size());
				for (int i = 0; i < onButtonsAndroid.size(); i++) {
					mobileAction.FuncClick(onButtonsAndroid.get(i), "Clicked on toggle Button");
				}
			} else {
				if (onButtons.isEmpty()) {
					enableAllAccounts();
					Spending_Insight.get().clickSideMenuButton();
					SideMenu.get().clickPreferences();
				}

				while (onButtons.size() != 0) {
					mobileAction.FuncClick(onButtons.get(0), "Clicked on toggle Button");
				}
			}

			if (platform.equalsIgnoreCase("Android")) {
				mobileAction.FuncClickBackButton();
			} else {
				Spending_Insight.get().clickSideMenuButton();
				SideMenu.get().clickSpendingInsights();
			}

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

	public void enableAllAccounts() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (offButtonsAndroid.isEmpty()) {
					disableAllAccounts();
					Spending_Insight.get().clickSideMenuButton();
					SideMenu.get().clickPreferences();
				}

				for (int i = 0; i < offButtonsAndroid.size(); i++) {
					mobileAction.FuncClick(offButtonsAndroid.get(i), "Clicked OFF toggle Button");
				}

			} else {
				if (offButtons.isEmpty()) {
					disableAllAccounts();
					Spending_Insight.get().clickSideMenuButton();
					SideMenu.get().clickPreferences();
				}

				while (offButtons.size() != 0) {
					mobileAction.FuncClick(offButtons.get(0), "Toggle button OFF");
				}
			}

			if (platform.equalsIgnoreCase("Android")) {
				mobileAction.FuncClickBackButton();

			} else {
				Spending_Insight.get().clickSideMenuButton();
				Spending_Insight.get().clickSideMenuButton();
				SideMenu.get().clickSpendingInsights();
			}

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
