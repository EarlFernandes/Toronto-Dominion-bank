package com.td.test.myspend;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
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
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'OFF')]")
	private List<MobileElement> offButtons;

	@iOSFindBy(xpath = "//*[contains(@label,'Account Preferences') or contains(@label,'Paramètres du compte') or contains(@label,'Preferences') or contains(@label,'Préférences')]")
	private MobileElement pageHeader;

	@FindBy(xpath = "//*[contains(@ng-model,'isFWMOn')]")
	private List<WebElement> onButtonsAndroid;

	@FindBy(xpath = "//*[contains(@ng-model,'isFWMOn')]")
	private List<WebElement> offButtonsAndroid;

	@FindBy(xpath = "//*[text()='Account Preferences' or text()='Paramètres du compte' or text()='Preferences']")
	private WebElement pageHeaderAndroid;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Active Accounts') or contains(@label,'Comptes Actifs')]")
	private MobileElement activeAccounts;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Real Time Notifications') or contains(@label,'Avis en temps réel')]")
	private MobileElement realTimeNotifications;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Daily Digest Notifications') or contains(@label,'Avis pour le sommaire quotidien')]")
	private MobileElement dailyDigestNotifications;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Notification Settings') or contains(@label,'Paramètres pour les avis')]")
	private MobileElement notificationSettingsHeader;
	
	@iOSFindBy(xpath = "//XCUIElementTypeSwitch[(contains(@label,'Spending Notifications') or contains(@label,'Désactiver les avis sur les dépenses')) and @value='0']")
	private MobileElement spendingNotificationsBtnOff;
	
	@iOSFindBy(xpath = "//XCUIElementTypeSwitch[(contains(@label,'Spending Notifications') or contains(@label,'Désactiver les avis sur les dépenses')) and @value='1']")
	private MobileElement spendingNotificationsBtnOn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeSwitch[(contains(@label,'Daily Digest Notifications') or contains(@label,'Désactiver les avis pour le sommaire quotidien')) and @value='0']")
	private MobileElement dailyDigestNotificationsBtnOff;
	
	@iOSFindBy(xpath = "//XCUIElementTypeSwitch[(contains(@label,'Daily Digest Notifications') or contains(@label,'Désactiver les avis pour le sommaire quotidien')) and @value='1']")
	private MobileElement dailyDigestNotificationsBtnOn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Send Daily' or contains(@label,'Envoyer chaque jour')]/../following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther")
	private MobileElement sendDailyTime;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Send Daily' or contains(@label,'Envoyer chaque jour')]")
	private MobileElement sendDaily;
	
	@FindBy(xpath = "(//*[@id='firstMenuItem'])[1]")
	private WebElement activeAccountsAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Real Time Notifications')]")
	private WebElement realTimeNotificationsAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Daily Digest Notifications')]")
	private WebElement dailyDigestNotificationsAndroid;
	
	@FindBy(xpath = "//*[@ng-model='notificationSettings.isNotifOn']")
	private WebElement spendingNotificationsBtnOnAndroid;
	
	@FindBy(xpath = "//*[@ng-model='notificationSettings.isNotifOff']")
	private WebElement spendingNotificationsBtnOffAndroid;
	
	@FindBy(xpath = "//*[@ng-model='notificationSettings.isDailyDigestOn']")
	private WebElement dailyDigestNotificationsBtnOnAndroid;
	
	@FindBy(xpath = "//*[@ng-model='notificationSettings.isDailyDigestOff']")
	private WebElement dailyDigestNotificationsBtnOffAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Notification Settings')]")
	private WebElement notificationSettingsHeaderAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Send Daily')]")
	private WebElement sendDailyAndroid;
	
	@FindBy(xpath = "//*[@ng-model='dailyNotifDate']")
	private WebElement sendDailyTimeAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Active Accounts')]")
	private WebElement activeAccountsHeaderAndroid;
	
	
	@FindBy(xpath = "(//*[@ng-click='goMainPageBack()'])[1]")
	private WebElement clickBackAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Save')]")
	private WebElement saveBtnAndroid;
	

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
				// mobileAction.FuncClickBackButton();
				CL.GetAppiumDriver().context("NATIVE_APP");
				Spending_Insight.get().clickSideMenuButton();
				SideMenu.get().clickSpendingInsights();
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
				if (offButtons.isEmpty()) {
					disableAllAccounts();
					Spending_Insight.get().clickSideMenuButton();
					SideMenu.get().clickPreferences();
				}
				System.out.println(offButtons.size());
				while (offButtons.size() != 0) {
					mobileAction.FuncClick(offButtons.get(0), "Toggle button OFF");
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
				// mobileAction.FuncClickBackButton();
				CL.GetAppiumDriver().context("NATIVE_APP");
				Spending_Insight.get().clickSideMenuButton();

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

	/**
	 * This method will enable the accounts in the preference page
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
	public void enableAccountsInPreferencePage() throws InterruptedException {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				enableAllAccounts();
				CL.GetAppiumDriver().context("NATIVE_APP");

			} else {
				Spending_Insight.get().clickSideMenuButton();
				Spending_Insight.get().clickSideMenuButton();
				SideMenu.get().clickSpendingByCategory();
				SpendingHistory.get().clickPreferencesLink();
				enableAllAccounts();
			}
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {

				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail", "Exception from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will verify the different tabs in the preference page
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
	public void verifyPreferenceTabs() throws InterruptedException {

		Decorator();

		try {
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
					
					mobileAction.verifyElementIsDisplayed(activeAccountsAndroid, "Active Accounts");
					mobileAction.FuncClick(activeAccountsAndroid, "Active Accounts");
					mobileAction.verifyElementIsDisplayed(activeAccountsHeaderAndroid, "Active Accounts");
					CL.GetAppiumDriver().context("NATIVE_APP");
					Spending_Insight.get().clickSideMenuButton();
					
					mobileAction.verifyElementIsDisplayed(realTimeNotificationsAndroid, "Real Time Notifications");
					mobileAction.FuncClick(realTimeNotificationsAndroid, "Real Time Notifications");
					mobileAction.verifyElementIsDisplayed(notificationSettingsHeaderAndroid, "Notification Settings");
					CL.GetAppiumDriver().context("NATIVE_APP");
					Spending_Insight.get().clickSideMenuButton();
					
					mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsAndroid, "Daily Digest Notifications");
					mobileAction.FuncClick(dailyDigestNotificationsAndroid, "Daily Digest Notifications");
					mobileAction.verifyElementIsDisplayed(notificationSettingsHeaderAndroid, "Notification Settings");
					CL.GetAppiumDriver().context("NATIVE_APP");
					Spending_Insight.get().clickSideMenuButton();
					
				}else{
			
					mobileAction.verifyElementIsDisplayed(activeAccounts, "Active Accounts");
					mobileAction.FuncClick(activeAccounts, "Active Accounts");
					mobileAction.verifyElementIsDisplayed(activeAccounts, "Active Accounts");
					Spending_Insight.get().clickSideMenuButton();
					
					mobileAction.verifyElementIsDisplayed(realTimeNotifications, "Real Time Notifications");
					mobileAction.FuncClick(realTimeNotifications, "Real Time Notifications");
					mobileAction.verifyElementIsDisplayed(notificationSettingsHeader, "Notification Settings");
					Spending_Insight.get().clickSideMenuButton();
					
					mobileAction.verifyElementIsDisplayed(dailyDigestNotifications, "Daily Digest Notifications");
					mobileAction.FuncClick(dailyDigestNotifications, "Daily Digest Notifications");
					mobileAction.verifyElementIsDisplayed(notificationSettingsHeader, "Notification Settings");
					Spending_Insight.get().clickSideMenuButton();
				}
			
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {

				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail", "Exception from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will verify the Real Time Transactions page
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
	public void realTimeNotifications() throws InterruptedException {

		Decorator();
		

		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				
				mobileAction.FuncClick(realTimeNotificationsAndroid, "Real Time Notification");
				mobileAction.verifyElementIsDisplayed(notificationSettingsHeaderAndroid, "Notification Settings");
				
				mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOnAndroid, "Spending Notifications Switch");
				mobileAction.FuncClick(spendingNotificationsBtnOnAndroid, "Spending Notification Button OFF");
				mobileAction.FuncClick(spendingNotificationsBtnOnAndroid, "Spending Notification Button ON");
				
				mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOnAndroid, "Daily Digest Notifications Switch");
				mobileAction.FuncClick(dailyDigestNotificationsBtnOnAndroid, "Daily Digest Notification Button OFF");
				mobileAction.FuncClick(dailyDigestNotificationsBtnOnAndroid, "Daily Digest Notifications ON");
				
				
				mobileAction.FuncClick(sendDailyTimeAndroid, "Select Time");
				Select notiTime=new Select(sendDailyTimeAndroid);
				notiTime.selectByVisibleText(getTestdata("Time"));
				mobileAction.FuncClick(saveBtnAndroid, "Save Button");
				CL.GetAppiumDriver().context("NATIVE_APP");
				
				
			
			}else{
			
				mobileAction.FuncClick(realTimeNotifications, "Real Time Notification");
				mobileAction.verifyElementIsDisplayed(notificationSettingsHeader, "Notification Settings");
				mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOn, "Spending Notifications Switch");
				mobileAction.FuncClick(spendingNotificationsBtnOn, "Spending Notification Button ON");
				mobileAction.FuncClick(spendingNotificationsBtnOff, "Spending Notification Button OFF");
				
				mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOn, "Daily Digest Notifications Switch");
				mobileAction.FuncClick(dailyDigestNotificationsBtnOn, "Daily Digest Notification Button ON");
				mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOff, "Daily Digest Notifications OFF");
				
				mobileAction.FuncClick(sendDailyTime, "Select Time");
				MobileElement pickerWheel = mobileAction.mobileElementUsingXPath("//XCUIElementTypeOther/XCUIElementTypePickerWheel");
				pickerWheel.setValue(getTestdata("Time"));
				mobileAction.FuncClick(sendDaily, "Send daily");
				Spending_Insight.get().clickSideMenuButton();
			}
			
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {

				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail", "Exception from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify the Daily Digest Notification Page
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
	public void dailyDigestNotifications() throws InterruptedException {

		Decorator();

		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.FuncClick(dailyDigestNotificationsAndroid, "Daily Digest Notification");
				mobileAction.verifyElementIsDisplayed(notificationSettingsHeaderAndroid, "Notification Settings");
				
				mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOnAndroid, "Spending Notifications Switch");
				mobileAction.FuncClick(spendingNotificationsBtnOnAndroid, "Spending Notification Button OFF");
				mobileAction.FuncClick(spendingNotificationsBtnOnAndroid, "Spending Notification Button ON");
				
				mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOnAndroid, "Daily Digest Notifications Switch");
				mobileAction.FuncClick(dailyDigestNotificationsBtnOnAndroid, "Daily Digest Notification Button OFF");
				mobileAction.FuncClick(dailyDigestNotificationsBtnOnAndroid, "Daily Digest Notifications ON");
				
				
				mobileAction.FuncClick(sendDailyTimeAndroid, "Select Time");
				Select notiTime=new Select(sendDailyTimeAndroid);
				notiTime.selectByVisibleText(getTestdata("Time"));
				//mobileAction.FuncClick(saveBtnAndroid, "Save Button");
				CL.GetAppiumDriver().context("NATIVE_APP");
				Spending_Insight.get().clickSideMenuButton();
				CL.GetAppiumDriver().context("NATIVE_APP");
			//	SideMenu.get().clickSpendingInsights();
				//CL.GetAppiumDriver().context("NATIVE_APP");
			
			}else{
			
				mobileAction.FuncClick(dailyDigestNotifications, "Daily Digest Notification");
				mobileAction.verifyElementIsDisplayed(notificationSettingsHeader, "Notification Settings");
				mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOn, "Spending Notifications Switch");
				mobileAction.FuncClick(spendingNotificationsBtnOn, "Spending Notification Button ON");
				mobileAction.FuncClick(spendingNotificationsBtnOff, "Spending Notification Button OFF");
				
				mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOn, "Daily Digest Notifications Switch");
				mobileAction.FuncClick(dailyDigestNotificationsBtnOn, "Daily Digest Notification Button ON");
				mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOff, "Daily Digest Notifications OFF");
				
				mobileAction.FuncClick(sendDailyTime, "Select Time");
				MobileElement pickerWheel = mobileAction.mobileElementUsingXPath("//XCUIElementTypeOther/XCUIElementTypePickerWheel");
				pickerWheel.setValue(getTestdata("Time"));
				Thread.sleep(5000);
				mobileAction.FuncClick(sendDaily, "Send daily");
				Spending_Insight.get().clickSideMenuButton();
			}
			
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {

				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail", "Exception from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}


}
