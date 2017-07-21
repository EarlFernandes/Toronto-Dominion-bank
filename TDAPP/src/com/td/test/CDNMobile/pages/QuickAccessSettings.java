package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class QuickAccessSettings extends _CommonPage {
	private static QuickAccessSettings QuickAccessSettings;

	@iOSFindBy(xpath = "//*[@label='Quick Access']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Quick Access Settings']")
	private MobileElement QuickAccessSettingsHeader;

	@iOSFindBy(xpath = "//*[@label='Turn Quick Access on or off']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/easy_access_switch']")
	private MobileElement QuickAccessToggle;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/easy_access_rewards_on_off_switch']")
	private MobileElement rewardsBalanceToggle;

	@iOSFindBy(xpath = "//*[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement quickAccessSettingsBackBtn;

	String cardToggle = "//XCUIElementTypeSwitch[contains(@label,'";
	String accountXL = CL.getTestDataInstance().getPrimaryAccount();

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
			mobileAction.verifyElementIsDisplayed(QuickAccessSettingsHeader, "Quick Access Settings");

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

			if (QuickAccessToggle.isEnabled())
				System.out.println("Toggle is enabled");
			else
				mobileAction.FuncClick(QuickAccessToggle, "Quick Access Toggle");

		} catch (InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

	/**
	 * This method will click the Back Button in Quick Access Settings Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyQuickAccessSettingsBackBtn() {

		Decorator();
		try {
			mobileAction.FuncClick(quickAccessSettingsBackBtn, "Quick Access Settings Back Button");

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
