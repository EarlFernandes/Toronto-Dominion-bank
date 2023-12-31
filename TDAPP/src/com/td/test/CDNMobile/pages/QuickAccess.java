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

public class QuickAccess extends _CommonPage {

	private static QuickAccess Quickaccess;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement quickaccess_title;

	@iOSFindBy(accessibility = "QUICKBALANCE_ONBOARDING_VIEW_TITLE")
	private MobileElement title;

	@iOSFindBy(accessibility = "QUICKBALANCE_ONBOARDING_DES")
	private MobileElement msg;

	@iOSFindBy(accessibility = "QUICKBALANCE_ONBOARDING_START_BUTTON")
	private MobileElement getStartedButton;

	private MobileElement quickaccess_switch;

	// @iOSFindBy(xpath = "//*[@label='ACCOUNTS' or @label='COMPTES']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title_text']")
	private MobileElement indiviual_accounts;

	public synchronized static QuickAccess get() {
		if (Quickaccess == null) {
			Quickaccess = new QuickAccess();
		}
		return Quickaccess;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void VerifyQuickAccessSettingsHeader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(quickaccess_title,

					getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyQuickAccessSwitchWork() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//android.widget.Switch[@content-desc='"
								+ getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND) + "']",
						"Quick Access Switch");
			} else {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS)
								+ "']/../XCUIElementTypeSwitch",
						"Quick Access Switch");
			}

			mobileAction.verifyElementIsDisplayed(quickaccess_switch, "Quick Access Switch");
			String switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);
			System.out.println("Checked Status :" + switchCheckStatus);

			String accountString = getTextInCurrentLocale(StringArray.ARRAY_PREFERENCE_ACCOUNTS);
			String indiviual_accounts_xpath = "//*[@label='" + accountString + "']";

			if (switchCheckStatus.equalsIgnoreCase("true")) {
				// Enabled
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
					indiviual_accounts = mobileAction.verifyElementUsingXPath(indiviual_accounts_xpath, "ACCOUNTS");
				}
				mobileAction.verifyElementTextIsDisplayed(indiviual_accounts, accountString);
				// Toggle to disable it
				mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");
				System.out.println("Toggle Switch");
				mobileAction.waitProgressBarVanish();
				switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);
				System.out.println("Checked status now :" + switchCheckStatus);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
					try {
						indiviual_accounts = (MobileElement) CL.GetAppiumDriver()
								.findElement(By.xpath(indiviual_accounts_xpath));
						mobileAction.Report_Fail("Account still exists even when switch toggle to disable");
					} catch (Exception e1) {
						mobileAction.Report_Pass_Verified("Accounts no displaying ");
					}
				} else {
					if (mobileAction.verifyElementIsPresent(indiviual_accounts)) {
						mobileAction.Report_Fail("Account still exists even when switch toggle to disable");
					} else {
						mobileAction.Report_Pass_Verified("Accounts no displaying ");
					}
				}

			} else {
				// Disabled
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
					try {
						indiviual_accounts = mobileAction.verifyElementUsingXPath(indiviual_accounts_xpath, "ACCOUNTS");
						mobileAction.Report_Fail("Account still exists when switch status  is false");
					} catch (Exception e1) {
						mobileAction.Report_Pass_Verified("Accounts no displaying ");
						// Toggle to Enable it
						mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");
						System.out.println("Toggle Switch");
						mobileAction.waitProgressBarVanish();
						switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);
						System.out.println("Checked now :" + switchCheckStatus);
						indiviual_accounts = mobileAction.verifyElementUsingXPath(indiviual_accounts_xpath, "ACCOUNTS");
						mobileAction.verifyElementTextIsDisplayed(indiviual_accounts, accountString);
					}
				} else {
					if (mobileAction.verifyElementIsPresent(indiviual_accounts)) {
						mobileAction.Report_Fail("Account still exists when switch status  is false");
					} else {
						mobileAction.Report_Pass_Verified("Accounts no displaying ");
						// Toggle to Enable it
						mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");
						System.out.println("Toggle Switch");
						mobileAction.waitProgressBarVanish();
						switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);
						System.out.println("Checked now :" + switchCheckStatus);
						mobileAction.verifyElementTextIsDisplayed(indiviual_accounts, accountString);
					}
				}
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyAndEnableQuickAccess() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//android.widget.Switch[@content-desc='"
								+ getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND) + "']",
						"Quick Access Switch");
			} else {
				quickaccess_switch = mobileAction.verifyElementUsingXPath(
						"//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_QUICK_ACCESS_SETTINGS)
								+ "']/../XCUIElementTypeSwitch",
						"Quick Access Switch");
			}
			mobileAction.verifyElementIsDisplayed(quickaccess_switch, "Quick Access");
			String switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);
			System.out.println("Checked Status :" + switchCheckStatus);
			if (switchCheckStatus.equalsIgnoreCase("true")) {
				// Enabled
				System.out.println("Switch is on");
				mobileAction.Report_Pass_Verified("QuickAccess Enabled");

			} else {
				mobileAction.Report_Pass_Verified("Accounts no displaying ");
				// Toggle to Enable it
				mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");
				System.out.println("Toggle Switch");
				mobileAction.waitProgressBarVanish();
				switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);
				System.out.println("Checked now :" + switchCheckStatus);
				if (switchCheckStatus.equalsIgnoreCase("true")) {
					mobileAction.Report_Pass_Verified("QuickAccess Enabled");
				} else {
					mobileAction.Report_Pass_Verified("Failed to enable QuickAccess");
				}
			}

		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
	}

	/**
	 * This method will verify text within elements for the FTE quick access
	 * page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyFTEQuickAccessText() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.verifyTextEquality(title.getText().trim(),
						mobileAction.getAppString("easy_access_enroll_text1").trim());

				mobileAction.verifyTextEquality(getStartedButton.getText(),
						mobileAction.getAppString("btn_get_started"));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("easy_access_enroll_title") + "']",
						"Welcome to quick access title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("easy_access_enroll_text1") + "']", "Account balances on the go");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text=\""
								+ mobileAction.getAppString("easy_access_enroll_text2").replace("\"", "") + "\"]",
						"Tap the quick access message");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/btn_easy_access_enroll' and @text='"
								+ mobileAction.getAppString("easy_access_enroll_start") + "']",
						"Get Started");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the activate quick
	 * access page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyActivateQuickAccessText() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title'
				// and @text='" + mobileAction.getAppString("easy_access") +
				// "']", "Easy Access title");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
				// + mobileAction.getAppString("easy_access_visit_text1") +
				// "']", "Please visit message");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
				// + mobileAction.getAppString("easy_access_settings") + "']",
				// "Quick Access Settings");
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
	}

}
