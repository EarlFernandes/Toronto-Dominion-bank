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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class QuickAccessPage extends _CommonPage {

	private static QuickAccessPage QuickAccessPage;

	@iOSFindBy(xpath = "//*[contains(@label, 'Quick Access')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement Access_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Get Started']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_easy_access_enroll' and @text='Get Started']")
	private MobileElement get_Started;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'From Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
	private MobileElement from_Account;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cash Back Dollars']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cash Back Dollars']")
	private MobileElement cashBack;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Rewards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/easy_access_rewards_balance_currency_name']")
	private MobileElement txtRewards;

	@iOSFindBy(xpath = "//*[@label='Quick Access Settings']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Quick Access Settings']")
	private MobileElement quickAccessSettings;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/easy_access_image")
	private MobileElement quickAccessClose;

	By androidRewardstxt = By
			.xpath("//android.widget.TextView[@resource-id='com.td:id/easy_access_rewards_balance_currency_name']");

	By iosRewardstxt = By.xpath("//XCUIElementTypeStaticText[@label='Cash Back Dollars']");

	public synchronized static QuickAccessPage get() {
		if (QuickAccessPage == null) {
			QuickAccessPage = new QuickAccessPage();
		}
		return QuickAccessPage;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will verify the Quick Access Page and Get Started Element on
	 * the page
	 * 
	 * @return void
	 * 
	 */
	public void quickAccess() {
		Decorator();

		try {
			mobileAction.verifyElementIsDisplayed(Access_Header, "Quick Access");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyQuickAccessBillPaidUpdate() {
		Decorator();
		try {
			boolean flag = Access_Header.isDisplayed();
			if (flag) {
				// mobileAction.verifyElementIsDisplayed(get_started,t_getStarted);
				// mobileAction.FuncClick(Access_header, "QuickAccess");
				mobileAction.verifyElement(from_Account, "Account");
				mobileAction.quitDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method will verify the CashBack on Quick access page
	 * 
	 * @throws InterruptedException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void verifyCashBack() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(cashBack, "Cash Back Dollars");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will verify the Reward text is in English in fly out menu of
	 * Quick Access page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyRewardPointstxt() {
		Decorator();
		try {
			String value = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				value = mobileAction.verifyElementUsingBy(iosRewardstxt);
			} else {
				value = mobileAction.verifyElementUsingBy(androidRewardstxt);
			}
			if (value.contains(ConstantClass.t_rewardtxt)) {
				CL.GetReporting().FuncReport("Pass",
						"The element <b>- " + ConstantClass.t_rewardtxt + "</b> is displayed");
			} else {
				CL.GetReporting().FuncReport("Fail", "The element <b>- " + " Continue" + "</b> is not displayed");
			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	public void verifyNoRewards() {
		Decorator();

		try {
			if (txtRewards.isDisplayed()) {
			}
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("PASS", "The '" + "REWARDS value" + "' is not displayed");
			} catch (IOException e1) {
				System.out.println("IOException from Method" + this.getClass().toString() + " " + e.getCause());
			}
		}
	}

	/**
	 * This method will click the Quick access settings button in Quick Access
	 * Fly out menu
	 * 
	 * @throws InterruptedException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void clickQuickAccessSettings() {
		Decorator();
		try {
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(quickAccessSettings, "Quick Access Settings");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	public void verifyTDRewardsPoints() {
		Decorator();
		try {
			String xpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_TD_REWARDS_POINTS) + "']";
			} else {
				xpath = "//android.widget.TextView[@text='"
						+ getTextInCurrentLocale(StringArray.ARRAY_TD_REWARDS_POINTS) + "']";
			}

			MobileElement rewardsPtsFound = mobileAction.swipeAndSearchByxpath(xpath, false, 10, "up");
			mobileAction.verifyElementTextContains(rewardsPtsFound,
					getTextInCurrentLocale(StringArray.ARRAY_TD_REWARDS_POINTS));

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

	public void verifyEligibleTDPoints() {
		Decorator();
		try {

			String card = getTestdata("ToAccount");
			String xpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'" + card + "')]";
			} else {
				xpath = "//android.widget.TextView[contains(@text,'" + card + "')]";
			}

			MobileElement rewardsPtsFound = mobileAction.swipeAndSearchByxpath(xpath, false, 10, "up");
			if (rewardsPtsFound != null) {
				String tdPointsXpath = "";
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
					tdPointsXpath = xpath
							+ "/following-sibling::XCUIElementTypeStaticText/following-sibling::XCUIElementTypeStaticText";
				} else {
					tdPointsXpath = xpath
							+ "/following-sibling::android.widget.TextView/following-sibling::android.widget.TextView";
				}
				MobileElement tdPoints = mobileAction.verifyElementUsingXPath(tdPointsXpath, "TD Points element");
				mobileAction.verifyElementIsDisplayed(tdPoints, "TD Points element");
				String TDPointsText = tdPoints.getText();
				if (TDPointsText.contains(getTextInCurrentLocale(StringArray.ARRAY_TD_POINTS))) {
					mobileAction.verifyElementTextContains(tdPoints,
							getTextInCurrentLocale(StringArray.ARRAY_TD_POINTS));
				} else {
					mobileAction.verifyElementTextContains(tdPoints,
							getTextInCurrentLocale(StringArray.ARRAY_TD_REWARDS_POINTS));
				}

			} else {
				mobileAction.GetReporting().FuncReport("Fail", "Cannot find specified card: " + card);
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

	public void verifyIneligibleTDPoints() {
		Decorator();
		try {

			String card = getTestdata("AccessCard");
			String xpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'" + card + "')]";
			} else {
				xpath = "//android.widget.TextView[contains(@text,'" + card + "')]";
			}

			MobileElement rewardsPtsFound = mobileAction.swipeAndSearchByxpath(xpath, false, 10, "up");
			if (rewardsPtsFound != null) {
				String tdPointsXpath = "";
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
					tdPointsXpath = xpath
							+ "/following-sibling::XCUIElementTypeStaticText/following-sibling::XCUIElementTypeStaticText";
				} else {
					tdPointsXpath = xpath
							+ "/following-sibling::android.widget.TextView/following-sibling::android.widget.TextView";
				}

				boolean hasTDPoints = mobileAction.verifyElementIsPresentByXpath(tdPointsXpath);
				if (!hasTDPoints) {
					mobileAction.GetReporting().FuncReport("Pass", "No TD Points for ineligible card: " + card);
				} else {
					mobileAction.GetReporting().FuncReport("Fail",
							"TD Points should not appear for ineligible card: " + card);
				}

			} else {
				mobileAction.GetReporting().FuncReport("Fail", "Cannot find specified card: " + card);
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

	public void verifyAccountVisibility() {
		Decorator();
		try {

			String visibility = getTestdata("AccessCard");
			String account = getTestdata("ToAccount");
			String xpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'" + account + "')]";
			} else {
				xpath = "//android.widget.TextView[contains(@text,'" + account + "')]";
			}

			mobileAction.swipeAndSearchByxpath(xpath, false, 5, "up");
			boolean accountFound = mobileAction.verifyElementIsPresentByXpath(xpath);
			if (accountFound && visibility.equalsIgnoreCase("on")) {
				mobileAction.GetReporting().FuncReport("Pass", "Account is visible: " + account);
			} else if (accountFound && visibility.equalsIgnoreCase("off")) {
				mobileAction.GetReporting().FuncReport("Fail", "Account should not be visible: " + account);
			} else if (!accountFound && visibility.equalsIgnoreCase("on")) {
				mobileAction.GetReporting().FuncReport("Fail", "Account should not be visible: " + account);
			} else if (!accountFound && visibility.equalsIgnoreCase("off")) {
				mobileAction.GetReporting().FuncReport("Pass", "Account is invisible: " + account);
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
	
	public void closeQuickAccess() {
		Decorator();
		try {

			mobileAction.FuncClick(quickAccessClose, "Quick Access Close button");
			mobileAction.sleep(5000);

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
