package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class QuickAccessSettings extends _CommonPage {
	private static QuickAccessSettings QuickAccessSettings;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement QuickAccessSettingsHeader;

	@iOSFindBy(xpath = "//*[@label='Turn Quick Access on or off']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/easy_access_switch']")
	private MobileElement QuickAccessToggle;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/easy_access_rewards_on_off_switch']")
	private MobileElement rewardsBalanceToggle;

	String cardToggle = "//XCUIElementTypeSwitch[contains(@label,'";
	String accountXL = CL.getTestDataInstance().getPrimaryAccount();

	@iOSFindBy(xpath = "//*[@label='Turn Quick Access on or off']") // TBD
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/easy_access_account_on_off_switch'][1]")
	private MobileElement firstAcctToggle;

	@iOSFindBy(xpath = "//*[@label='Turn Quick Access on or off']") // TBD
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/easy_access_account_name_on_off'][1]")
	private MobileElement firstAcctName;

	public synchronized static QuickAccessSettings get() {
		if (QuickAccessSettings == null) {
			QuickAccessSettings = new QuickAccessSettings();
		}
		return QuickAccessSettings;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	/**
	 * This method will verify the header in Quick Access Settings Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyQuickAccessSettingsHeader() {
		Decorator();
		try {
			String titleText = getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS);
			mobileAction.verifyElementTextIsDisplayed(QuickAccessSettingsHeader, titleText);

		} catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify that Quick Access is turned on in Quick Access
	 * Settings Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyAndEnableQuickAccess() {
		Decorator();
		try {

			if (mobileAction.getSwitchStatus(QuickAccessToggle).equalsIgnoreCase("false")) {
				mobileAction.FuncClick(QuickAccessToggle, "Quick Access Toggle ON");
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

	/**
	 * This method will verify that Reward Balance Toggle is turned on in Quick
	 * Access Settings Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyAndEnableRewardsBalance() {
		Decorator();
		try {

			if (rewardsBalanceToggle.isEnabled())
				System.out.println("Toggle is enabled");
			else
				mobileAction.FuncClick(rewardsBalanceToggle, "Reward Balance Toggle");

		} catch (InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify that TD Classic Travel Card Toggle is turned on
	 * in Quick Access Settings Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void disableToggleCard() {
		Decorator();
		try {

			accountXL = CL.getTestDataInstance().getPrimaryAccount();
			System.out.println("Account:" + accountXL);
			String rewardValue = cardToggle + accountXL + "')]";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				rewardValue = "//*[contains(@label,'" + accountXL + "')]/following-sibling::XCUIElementTypeSwitch";
				// CL.GetDriver().findElement(By.xpath(rewardValue)).isEnabled();
			} else {
				rewardValue = "//*[contains(@text,'" + accountXL + "')]/following-sibling::android.widget.Switch";
				// CL.GetDriver().findElement(By.xpath(rewardValue)).click();
			}

			MobileElement cardToggleBtn = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(rewardValue));

			if (mobileAction.getSwitchStatus(cardToggleBtn).equalsIgnoreCase("true")) {
				mobileAction.FuncClick(cardToggleBtn, "Switch toggle to disable");
			} else {
				System.out.println("Already disabled");
			}

			// mobileAction.FuncClick(cardToggleBtn, "cardTogglebutton
			// clicked");
			System.out.println("Clicked");

		} catch (Exception e) {

			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify that TD Classic Travel Card Toggle is turned on
	 * in Quick Access Settings Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyCardNotDisplayed() {
		Decorator();
		try {

			String accountXL = "//*[contains(@text,'" + CL.getTestDataInstance().getPrimaryAccount()
					+ "') or contains(@label,'" + CL.getTestDataInstance().getPrimaryAccount() + "')  ]";

			MobileElement accountValue = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(accountXL));

			if (mobileAction.verifyElementIsPresent(accountValue))
				;

		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("PASS", "The '" + "REWARDS value" + "' is not displayed");
			} catch (IOException e1) {
				System.out.println("IOException from Method" + this.getClass().toString() + " " + e.getCause());

			}
		}
	}

	public void toggleSpecificAccount() {

		Decorator();
		try {
			String card = getTestdata("ToAccount");
			String xpath = "";

			if (currentLocale.equalsIgnoreCase("fr")) {
				// Acct names translated in FR
				card = getTestdata("FromAccount");
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'" + card + "')]";
			} else {
				xpath = "//android.widget.TextView[contains(@text,'" + card + "')]";
			}

			MobileElement accountFound = mobileAction.swipeAndSearchByxpath(xpath, false, 5, "up");
			if (accountFound != null) {

				String accountSwitchXpath = "";
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
					accountSwitchXpath = xpath + "/parent::XCUIElementTypeCell/XCUIElementTypeSwitch[1]";
				} else {
					accountSwitchXpath = xpath + "//following-sibling::android.widget.Switch";
				}

				MobileElement accountSwitch = mobileAction.verifyElementUsingXPath(accountSwitchXpath,
						"Account Switch");
				String switchCheckStatus = mobileAction.getSwitchStatus(accountSwitch);
				if (switchCheckStatus.equalsIgnoreCase("true")) {
					// Toggle to disable it
					mobileAction.FuncClick(accountSwitch, "Quick Access Switch Toggle - Disabled");
					// Save current acct balance for late verification
					CL.getTestDataInstance().TCParameters.put("AccessCard", "OFF");

				} else {
					// Toggle to enable it
					mobileAction.FuncClick(accountSwitch, "Quick Access Switch Toggle - Enabled");
					// Save current acct balance for late verification
					CL.getTestDataInstance().TCParameters.put("AccessCard", "ON");
				}
				mobileAction.sleep(2000);
			} else {
				mobileAction.GetReporting().FuncReport("Fail", "Cannot find specified account: " + card);
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

	public void verifyAccountExists() {

		Decorator();
		try {
			String card = getTestdata("ToAccount");
			String xpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'" + card + "')]";
			} else {
				xpath = "//android.widget.TextView[contains(@text,'" + card + "')]";
			}

			MobileElement accountFound = mobileAction.swipeAndSearchByxpath(xpath, false, 5, "up");
			if (accountFound != null) {
				mobileAction.GetReporting().FuncReport("Pass", "Specified account exists: " + card);
			} else {
				mobileAction.GetReporting().FuncReport("Fail", "Cannot find specified account: " + card);
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

	public void verifyNoAccount() {

		Decorator();
		try {
			String card = getTestdata("ToAccount");
			String xpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'" + card + "')]";
			} else {
				xpath = "//android.widget.TextView[contains(@text,'" + card + "')]";
			}

			MobileElement accountFound = mobileAction.swipeAndSearchByxpath(xpath, false, 5, "up");
			if (accountFound == null) {
				mobileAction.GetReporting().FuncReport("Pass", "Specified account does not exist: " + card);
			} else {
				mobileAction.GetReporting().FuncReport("Fail", "Specified account exists: " + card);
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

	public void testSecondUser() {
		Decorator();
		try {

			String alias = getTestdata("Transfers");
			// Save 2nd ConnectID to UserID column for use in next Login
			CL.getTestDataInstance().TCParameters.put("UserID", alias);

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

}
