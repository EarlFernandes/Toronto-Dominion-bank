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

public class TDForMe extends _CommonPage {

	private static TDForMe Tdforme;

	@iOSFindBy(xpath = "//*[@label='TD for Me Settings' or @label='Paramètres TD et moi']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement tdforme_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progress_bar;

	@iOSFindBy(xpath = "//*[@label='Enable TD for Me' or @label='Activer TD et moi']/../XCUIElementTypeSwitch")
	@AndroidFindBy(xpath = "//android.widget.Switch[@content-desc='TD for Me' or @content-desc='TD et moi']")
	private MobileElement tdforme_enable_switch;

	@iOSFindBy(xpath = "//*[@label='Display French TD for Me' or @label='Afficher TD et moi en Anglais']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@content-desc='English-only TD for Me content' or @content-desc='%1$s seulement pour TD et moi']")
	private MobileElement tdforme_displayfrench_switch;

	@iOSFindBy(xpath = "//*[@name='PRESERVE BATTERY' or @name='PRÉSERVATION DE LA PILE']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@content-desc='battery saver' or @content-desc='préservation de la pile']")
	private MobileElement tdforme_batterysave_switch;

	@iOSFindBy(xpath = "//*[@label='Customize Notifications' or @label='Personnaliser les avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/nav_row_title']")
	private MobileElement tdforme_Customize_Notifications;

	@iOSFindBy(xpath = "//*[@label='TD for Me Notifications' or @label='Avis TD et moi']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement tdforme_Notification_title;

	public synchronized static TDForMe get() {
		if (Tdforme == null) {
			Tdforme = new TDForMe();
		}
		return Tdforme;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	private void reDecoratorWhenswitchIsToggledtoEnable() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

			System.out.println("Swipe down");
			mobileAction.SwipeWithinElement("//android.widget.ScrollView[@index='0']", 1, "down");
		}
		Decorator();
	}

	public void VerifyTDForMeSettingsHeader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(tdforme_title, "TD for Me Settings | Paramètres TD et moi");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyTDForMeDisableSwitchFunction() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(tdforme_enable_switch, "TD for Me Enable-Disable Switch");
			// Check the switch status
			String switchCheckStatus = mobileAction.getSwitchStatus(tdforme_enable_switch);
			System.out.println("Status :" + switchCheckStatus);

			if (switchCheckStatus.equalsIgnoreCase("true")) {

				reDecoratorWhenswitchIsToggledtoEnable();

				mobileAction.verifyElementIsDisplayed(tdforme_displayfrench_switch, "TD for Me display french Switch");
				mobileAction.verifyElementIsDisplayed(tdforme_batterysave_switch, "TD for Me battary saver Switch");

				// Toggle the switch to disable
				System.out.println("Toggle to disable");
				mobileAction.FuncClick(tdforme_enable_switch, "TD for Me Enable-Disable Switch");
				mobileAction.waitForElementToVanish(progress_bar);

				switchCheckStatus = mobileAction.getSwitchStatus(tdforme_enable_switch);
				if (!switchCheckStatus.equalsIgnoreCase("false")) {
					mobileAction.Report_Fail_Not_Verified("Toggle switch to disable");
					System.err.println("TestCase has failed to toggle the TD for me switch");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					return;
				}

				// verify page collapses for displaying french Switch and
				// battary saver Switch
				if (mobileAction.isObjExists(tdforme_displayfrench_switch)) {
					mobileAction.Report_Fail_Not_Verified("Collapses french display switch ");
					return;
				} else {
					System.out.println("French display switch not diaplayed");
				}

				if (mobileAction.isObjExists(tdforme_batterysave_switch)) {
					mobileAction.Report_Fail_Not_Verified("Collapses battary saver switch ");
					return;
				} else {
					System.out.println("battary saver switch not diaplayed");
				}

				mobileAction.Report_Pass_Verified("Page Collapsed ");

			} else {// disabled:
					// verify page collapses for displaying french Switch and
					// battary saver Switch
				if (mobileAction.isObjExists(tdforme_displayfrench_switch)) {
					mobileAction.Report_Fail_Not_Verified("Collapses french display switch ");
					return;
				} else {
					System.out.println("French display switch not diaplayed");
				}

				if (mobileAction.isObjExists(tdforme_batterysave_switch)) {
					mobileAction.Report_Fail_Not_Verified("Collapses battery saver switch ");
					return;
				} else {
					System.out.println("battary saver switch not diaplayed");
				}

				mobileAction.Report_Pass_Verified("Page Collapsed ");

			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyTDForMeEnableSwitchFunction() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(tdforme_enable_switch, "TD for Me Enable-Disable Switch");
			// Check the switch status
			String switchCheckStatus = mobileAction.getSwitchStatus(tdforme_enable_switch);
			System.out.println("Status :" + switchCheckStatus);

			if (switchCheckStatus.equalsIgnoreCase("true")) {
				reDecoratorWhenswitchIsToggledtoEnable();

				mobileAction.verifyElementIsDisplayed(tdforme_displayfrench_switch, "TD for Me display french Switch");
				mobileAction.verifyElementIsDisplayed(tdforme_batterysave_switch, "TD for Me battary saver Switch");

				mobileAction.Report_Pass_Verified("Page expanded");
			} else {// disabled:
					// Toggle the switch to Enble
				System.out.println("Toggle to Enable");
				mobileAction.FuncClick(tdforme_enable_switch, "TD for Me Enable-Disable Switch");
				mobileAction.waitForElementToVanish(progress_bar);

				switchCheckStatus = mobileAction.getSwitchStatus(tdforme_enable_switch);
				System.out.println("Switch Status:" + switchCheckStatus);
				if (!switchCheckStatus.equalsIgnoreCase("true")) {
					mobileAction.Report_Fail_Not_Verified("Toggle switch to enable");
					System.err.println("TestCase has failed to toggle the TD for me switch");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					return;
				}

				reDecoratorWhenswitchIsToggledtoEnable();

				// verify page expands for displaying french Switch and battary
				// saver Switch
				if (!mobileAction.isObjExists(tdforme_displayfrench_switch)) {
					mobileAction.Report_Fail_Not_Verified("Expands french display switch ");
					return;
				} else {
					System.out.println("French display switch displayed");
				}

				if (!mobileAction.isObjExists(tdforme_batterysave_switch)) {
					mobileAction.Report_Fail_Not_Verified("Expends Battary saver switch ");
					return;
				} else {
					System.out.println("Battary saver switch displayed");
				}

				mobileAction.Report_Pass_Verified("Page Expanded ");

			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void ClickCustomizeNotificationlink() {
		Decorator();
		try {
			mobileAction.FuncClick(tdforme_Customize_Notifications, "Customeize Notification");
			mobileAction.waitForElementToVanish(progress_bar);

		} catch (Exception e) {
			System.err.println("TestCase has failed to ClickCustomizeNotificationlink.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyTDForMeNotificationPageHeader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(tdforme_Notification_title,
					"TD for Me Notifications | Avis TD et moi");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
