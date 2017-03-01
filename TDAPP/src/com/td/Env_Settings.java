package com.td;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Env_Settings extends _CommonPage {

	private static Env_Settings Env_Settings;

	@iOSFindBy(xpath = "//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//*[@label='Banking Service Configuration']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='Network Settings']")
	private MobileElement network_settings;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/preference_summary_text'and @index='1']")
	private MobileElement env_set;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='Network Settings']")
	private MobileElement env_need_to_set;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/preference_title_text'and @text='Configuration']")
	private MobileElement configuration;

	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/select_dialog_listview']")
	private MobileElement envList;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title'and @text='sys50_no_macm']")
	private MobileElement envToSetup;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeSwitch[1]")
	private MobileElement enableMobilePaymentSwitch;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeTextField[1]")
	private MobileElement enableMobilePaymentTextField;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeButton[1]")
	private MobileElement enableMobilePaymentSaveButton;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='OK']")
	private MobileElement okButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='TDMobilePayments']")
	private MobileElement TDMobilePaymentsButton;

	String env_need_set = getTestdata("Env");

	String cnfgrn = "//android.widget.TextView[@resource-id='com.td:id/title'and @text='" + env_need_set + "']";
	String env_Set = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";

	int i = 1;
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + i + Secondpart;
	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	public synchronized static Env_Settings get() {
		if (Env_Settings == null) {
			Env_Settings = new Env_Settings();
		}
		return Env_Settings;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will set the environment based on the connect id
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void set_environment() throws Exception {
		Decorator();
		try {

			if (platformName.equalsIgnoreCase("ios")) {

				mobileAction.FunCSwipeandScroll(network_settings, true);
				mobileAction.FuncSelectElementInTable(env_Set, Firstpart, Secondpart, env_need_set);
			} else {

				// mobileAction.FunCSwipeandScroll(network_settings, true);
				mobileAction.FunCnewSwipe(network_settings, false, 1);
				String env_exist = mobileAction.getText(env_set);
				if (env_exist.equalsIgnoreCase(env_need_set)) {

				} else {
					mobileAction.FuncClick(configuration, "Configuration");
					MobileElement config = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(cnfgrn));
					mobileAction.FunCSwipeandScroll(config, true);
					// mobileAction.FuncElementSwipeWhileNotFound(envList,
					// cnfgrn, 5, "down", true);
				}
				mobileAction.FuncClickBackButton();
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will enable the mobile payment
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void enableMobilePayment() throws Exception {
		Decorator();
		try {

			mobileAction.FunCSwipeandScroll(network_settings, true);
			if (enableMobilePaymentSwitch.getAttribute("value").equals("false")) {
				mobileAction.FuncClick(enableMobilePaymentSwitch, "Enable mobile Payment Switch");
			} else {
				mobileAction.FuncClick(enableMobilePaymentTextField, "Enable mobile Payment TextField");

				String textFieldValue = mobileAction.getText(enableMobilePaymentTextField);

				enableMobilePaymentTextField.clear();

				mobileAction.FuncClick(enableMobilePaymentSaveButton, "Enable mobile Payment SaveButton");
				mobileAction.FuncClick(okButton, "OK");

			}
			mobileAction.FunCSwipeandScroll(TDMobilePaymentsButton, true);
			mobileAction.FuncClick(okButton, "OK");
			mobileAction.FuncRunAppInBackground(8);
			((InteractsWithApps) CL.GetDriver()).resetApp();
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
