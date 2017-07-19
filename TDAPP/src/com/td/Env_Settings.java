package com.td;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile.pages.CMOB_InitialSwipe;

import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Env_Settings extends _CommonPage {

	private static Env_Settings Env_Settings;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Banking Service Configuration']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Network Settings']")
	private MobileElement network_settings;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/preference_summary_text'and @index='1']")
	private MobileElement env_set;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='Network Settings']")
	private MobileElement env_need_to_set;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/preference_title_text'and @text='Configuration']")
	private MobileElement configuration;

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

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Allow']")
	private MobileElement allow;

	String env_need_set = getTestdata("Env");

	@iOSFindBy(xpath = "//XCUIElementTypeSwitch[@label='Enable MIT Phase4' or @value='false']")
	private MobileElement enableMITPhase4;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'SYS70']")
	private MobileElement environment;

	String env = "//XCUIElementTypeStaticText[@label='" + env_need_set + "']";

	// @resource-id='com.td:id/title' and
	String env_Set = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String networkSet = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='Network Settings']";
	String cnfgrn = "//android.widget.TextView[contains(@text,'" + env_need_set + "')]";

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

	public Env_Settings() {

		Decorator();
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

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
		boolean flag = true;
		boolean boolEnv = true;
		int count = 0;

		try {

			if (platformName.equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementVisible(menu, "Menu")) {
					mobileAction.FuncClick(menu, "Menu");
					mobileAction.FunCSwipeandScroll(network_settings, true);
					Thread.sleep(2000);
					// mobileAction.FuncClick(enableMITPhase4, "Enable MIT
					// Phase4");
					// mobileAction.FunCSwipeandScroll(network_settings, true);
					MobileElement envt = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(env));
					mobileAction.FunCSwipeandScroll(envt, true);
					/*
					 * while(flag && count<10){
					 * if(mobileAction.verifyElementVisible(envt,
					 * "Environment")){ mobileAction.FuncClick(envt,
					 * "Environment"); flag=false; }else{
					 * mobileAction.FunctionSwipe("Up", 200, 200); count++; } }
					 */
					// mobileAction.FuncSelectElementInTable(env_Set, Firstpart,
					// Secondpart, env_need_set);

				} else {
					mobileAction.FuncClick(allow, "Allow");
					CMOB_InitialSwipe.get().InitialSwipe();
				}

			} else {
				if (mobileAction.verifyElementVisible(menu, "Menu")) {

				} else {
					CMOB_InitialSwipe.get().InitialSwipe();
				}
				mobileAction.FuncClick(menu, "Menu");
				// mobileAction.FunCSwipeandScroll(network_settings, true);
				// mobileAction.FuncElementSwipeWhileNotFound(envList, cnfgrn,
				// 5, "down", true);
				// mobileAction.FuncSwipeWhileElementNotFoundByxpath(networkSet,
				// true, 7, "Up");
				while (flag && count < 5) {
					if (mobileAction.verifyElementVisible(network_settings, "Network Settings")) {
						mobileAction.FuncClick(network_settings, "Networksettings");
						flag = false;
					} else {
						mobileAction.FunctionSwipe("Up", 100, 100);
						count++;
					}
				}
				// mobileAction.FunCnewSwipe(network_settings, true, 3);
				String env_exist = mobileAction.getText(env_set);
				if (env_exist.equalsIgnoreCase(env_need_set)) {

				} else {
					mobileAction.FuncClick(configuration, "Configuration");
					mobileAction.FunctionSwipe("Up", 150, 150);
					MobileElement config = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(cnfgrn));
					mobileAction.FuncClick(config, "Environment");
					/*
					 * while(boolEnv && count<10){
					 * //mobileAction.FunctionSwipe("Up", 200, 200);
					 * MobileElement config = (MobileElement) ((AppiumDriver)
					 * CL.GetDriver()) .findElement(By.xpath(cnfgrn));
					 * 
					 * 
					 * if(mobileAction.verifyElementVisible(config,
					 * "Environment")){ mobileAction.FuncClick(config,
					 * "Environment"); boolEnv=false; }else{
					 * mobileAction.FunctionSwipe("Up", 200, 200); count++; } }
					 */
					// mobileAction.FunCSwipeandScroll(config, true);
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
		try {

			mobileAction.FunCSwipeandScroll(network_settings, true);
			if (enableMobilePaymentSwitch.getAttribute("value").equals("false")) {
				mobileAction.FuncClick(enableMobilePaymentSwitch, "Enable mobile Payment Switch");
			} else {
				mobileAction.FuncClick(enableMobilePaymentTextField, "Enable mobile Payment TextField");

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

	public void clearSavedCards() throws Exception {
		try {

			mobileAction.FunCSwipeandScroll(network_settings, true);
			if (enableMobilePaymentSwitch.getAttribute("value").equals("false")) {
				mobileAction.FuncClick(enableMobilePaymentSwitch, "Enable mobile Payment Switch");
			} else {
				mobileAction.FuncClick(enableMobilePaymentTextField, "Enable mobile Payment TextField");
				enableMobilePaymentTextField.clear();

				mobileAction.FuncClick(enableMobilePaymentSaveButton, "Enable mobile Payment SaveButton");
				mobileAction.FuncClick(okButton, "OK");

			}
			MobileElement envt = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(env));
			mobileAction.FunCSwipeandScroll(envt, true);
			mobileAction.FunCSwipeandScroll(environment, true);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void deleteDefaultCard() throws Exception {
		try {

			mobileAction.FunCSwipeandScroll(network_settings, true);
			if (enableMobilePaymentSwitch.getAttribute("value").equals("false")) {
				mobileAction.FuncClick(enableMobilePaymentSwitch, "Enable mobile Payment Switch");
			} else {
				mobileAction.FuncClick(enableMobilePaymentTextField, "Enable mobile Payment TextField");
				String savedCards = mobileAction.getText(enableMobilePaymentTextField);
				if (savedCards.contains(":")) {
					enableMobilePaymentTextField.clear();
					String noneDefaultCard = savedCards.substring(0, savedCards.indexOf(","));
					System.out.println(noneDefaultCard);
					mobileAction.FuncSendKeys(noneDefaultCard);
					mobileAction.FuncClick(enableMobilePaymentSaveButton, "Enable mobile Payment SaveButton");
					mobileAction.FuncClick(okButton, "OK");
				}
			}

			mobileAction.FunCSwipeandScroll((MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(env)), true);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
