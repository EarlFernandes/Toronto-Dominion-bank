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

public class QuickAccess  extends _CommonPage {

	private static QuickAccess Quickaccess;

	@iOSFindBy(xpath = "//*[@label='Quick Access' or @label='Accès rapide']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement quickaccess_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;

	@iOSFindBy(xpath = "//*[@label='Quick Access' or @label='Accès rapide']/../XCUIElementTypeSwitch")
	@AndroidFindBy(xpath = "//android.widget.Switch[@content-desc='Quick Access' or @content-desc='Accès rapide']")
	private MobileElement quickaccess_switch;	
	
	@iOSFindBy(xpath = "//*[@label='ACCOUNTS' or @label='COMPTES']")
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
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	public void VerifyQuickAccessSettingsHeader() {
		Decorator();
		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.verifyElementTextIsDisplayed(quickaccess_title, "Quick Access Settings | Paramètres Accès rapide");
			}else{
				mobileAction.verifyElementTextIsDisplayed(quickaccess_title, "Quick Access | Accès rapide");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void VerifyQuickAccessSwitchWork() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(quickaccess_switch, "Quick Access");
			String switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch); 
			System.out.println("Checked Status :" + switchCheckStatus);
			if(switchCheckStatus.equalsIgnoreCase("true")){
				//Enabled
				mobileAction.verifyElementTextIsDisplayed(indiviual_accounts, "ACCOUNTS | COMPTES ");
				//Toggle to disable it
				mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");
				System.out.println("Toggle Switch");
				mobileAction.waitForElementToVanish(progress_bar);
				switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);
				System.out.println("Checked status now :" + switchCheckStatus);
				
				if(mobileAction.isObjExists(indiviual_accounts)){
					mobileAction.Report_Fail("Account still exists even when switch toggle to disable");
				}else{
					mobileAction.Report_Pass_Verified("Accounts no displaying ");
				}
				
			}else{
				//Disabled
				if(mobileAction.isObjExists(indiviual_accounts)){
					mobileAction.Report_Fail("Account still exists when switch status  is false");
				}else{
					mobileAction.Report_Pass_Verified("Accounts no displaying ");
					// Toggle to Enable it
					mobileAction.FuncClick(quickaccess_switch, "Quick Access Switch Toggle");
					System.out.println("Toggle Switch");
					mobileAction.waitForElementToVanish(progress_bar);
					switchCheckStatus = mobileAction.getSwitchStatus(quickaccess_switch);
					System.out.println("Checked now :" + switchCheckStatus);
					mobileAction.verifyElementTextIsDisplayed(indiviual_accounts, "ACCOUNTS | COMPTES ");
				}
			}
			

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
}
