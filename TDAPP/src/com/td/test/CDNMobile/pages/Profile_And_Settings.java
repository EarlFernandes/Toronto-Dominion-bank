package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Profile_And_Settings extends _CommonPage {

	private static Profile_And_Settings ProfileAndSettings;

	String preferences = "Profile & Settings | Profil et paramètres";
	
	@iOSFindBy(xpath = "//*[@label='Profile & Settings' or @label='Profil et paramètres']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement profile_preferences_Header;
	
	@iOSFindBy(xpath = "//*[@label='View profile >' or @label='Consulter le profil >']")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='View profile' or @text='Consulter le profil')]")
	private MobileElement view_profile;
	
	@iOSFindBy(xpath = "//*[@label='View profile']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='0']")
	private MobileElement view_profile_individual;
	
	@iOSFindBy(xpath = "//*[@label='View profile']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	private MobileElement view_profile_business;
	
	@iOSFindBy(xpath = "//*[@label='Click here to go to Business Profile Details :)']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Click here to go to Business Profile Details :)']")
	private MobileElement business_profile_details;
	
	@iOSFindBy(xpath = "//*[@label='Security Questions' or @label ='Questions de sécurité']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_security']/android.widget.TextView")
	private MobileElement security_questions;

	@iOSFindBy(xpath = "//*[@label='Touch ID']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_security']/android.widget.TextView")
	private MobileElement touch_id;
	
	@iOSFindBy(xpath = "//*[@label='Notifications' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_notifications']/android.widget.TextView")
	private MobileElement notifications;
	
	
	@iOSFindBy(xpath = "//*[@label='Quick Access Settings' or @label='Paramètres du Accès rapide']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_quick_access']/android.widget.TextView")
	private MobileElement quickaccesssetting;
	
	@iOSFindBy(xpath = "//*[@label='TD for Me Settings' or @label='Paramètres de TD et moi']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_tdforme']/android.widget.TextView")
	private MobileElement tdformesettings;
	
	@iOSFindBy(xpath = "//*[@label=\"What's New\" or @label='Nouveautés']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/profile_landing_nav_whatsnew']/android.widget.TextView")
	private MobileElement whatsnew;	
		
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Payments & Transfers']")
	private MobileElement paymentsAndTransfers;
	
	
	public synchronized static Profile_And_Settings get() {
		if (ProfileAndSettings == null) {
			ProfileAndSettings = new Profile_And_Settings();
		}
		return ProfileAndSettings;
	}
	
	
	
	
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}


	
	/**
	 * This method will verify click personal profile Details button
	 * then go to personal profile details page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void view_profile() {

		
		Decorator();
		try {

			mobileAction.FuncClick(view_profile, "view profile");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
	
	public void verifyProfileandSettingLandingPage() {

		
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(profile_preferences_Header, preferences);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
	public void VerifySecurityQuestionButton() {
		
		Decorator();
		try {
			
			String security = mobileAction.getValue(security_questions);
			mobileAction.FuncClick(security_questions, security);
			Thread.sleep(2000);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyNotificationsButton() {
		
		Decorator();
		try {

			String notifi = mobileAction.getValue(notifications);
			mobileAction.FuncClick(notifications, notifi);
			Thread.sleep(2000);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyQuickAccessSettings() {
		
		Decorator();
		try {
			String quickSetting = mobileAction.getValue(quickaccesssetting);
			mobileAction.FuncClick(quickaccesssetting, quickSetting);
			Thread.sleep(2000);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyTDForMeSettings() {
		
		Decorator();
		try {

			String tdme = mobileAction.getValue(tdformesettings);
			mobileAction.FuncClick(tdformesettings, tdme);
			Thread.sleep(2000);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyWhatsNew() {
		
		Decorator();
		try {
			
			String whatnew= mobileAction.getValue(whatsnew);
			mobileAction.FuncClick(whatsnew, whatnew);
			Thread.sleep(2000);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
	/**
	 * @author Ashraf
	 * This method will verify Profile and Settings page header and click on 'Payments & Transfers' link.
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickPaymentsAndTransfers() {

		
		Decorator();
		try {

			mobileAction.FuncClick(paymentsAndTransfers, "Payments & Transfers");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	
	
}
