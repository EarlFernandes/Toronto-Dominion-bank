package com.td.test.myspend;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.td.test.CDNMobile.pages.HomeScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MyspendPreferences extends com.td._CommonPage {

	private static MyspendPreferences Preferences;

	public synchronized static MyspendPreferences get() {
		if (Preferences == null) {
			Preferences = new MyspendPreferences();
		}
		return Preferences;
	}

	String platform = null;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'SELECT ACCOUNTS') or contains(@label,'CHOISIR DES COMPTES')]/following-sibling::XCUIElementTypeOther[contains(@label,'ON') or contains(@name,'ON')]")
	private List<MobileElement> onButtons;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'SELECT ACCOUNTS') or contains(@label,'CHOISIR DES COMPTES')]/following-sibling::XCUIElementTypeOther[contains(@label,'OFF') or contains(@name,'OFF')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'OFF')] | //android.widget.CheckBox[contains(@text,'OFF')]")
	private List<MobileElement> offButtons;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Account Preferences') or contains(@label,'Paramètres du compte') or contains(@label,'Preferences') or contains(@label,'Préférences')]")
	private MobileElement pageHeader;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@name,'Home') or contains(@name,'Accueil')])[2]")
	private MobileElement homeBtn;
	
	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_QUICK_ACCESS")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access'] | //android.widget.TextView[@resource-id='com.td:id/easy_access']")
	private MobileElement quickAccess;
	
	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up' and @index='0']")
	private MobileElement menu;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD MySpend' or @label='Dépense TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='TD MySpend' or @text='Dépense TD')]")
	private MobileElement TDMySpend;

	@FindBy(xpath = "//*[contains(@ng-model,'isFWMOn')]")
	private List<WebElement> onButtonsAndroid;

	@FindBy(xpath = "//*[contains(@ng-model,'isFWMOn')]")
	private List<WebElement> offButtonsAndroid;

	@FindBy(xpath = "//*[text()='Account Preferences' or text()='Paramètres du compte' or text()='Preferences' or text()='Préférences']")
	private WebElement pageHeaderAndroid;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Active Accounts') or contains(@label,'Comptes actifs')]")
	private MobileElement activeAccounts;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Real Time Notifications') or contains(@label,'Avis en temps réel')]")
	private MobileElement realTimeNotifications;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Daily Digest Notifications') or contains(@label,'Avis pour le sommaire quotidien')]")
	private MobileElement dailyDigestNotifications;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Notification Settings') or contains(@label,'Paramètres pour les avis')]")
	private MobileElement notificationSettingsHeader;
	
	//@iOSFindBy(xpath = "//XCUIElementTypeSwitch[(contains(@label,'Spending Notifications') or contains(@label,'les avis sur les dépenses')) and @value='0']")
	@iOSXCUITFindBy(xpath = "//*[(contains(@label,'Spending Notifications') or contains(@label,'les avis sur les dépenses')) and (contains(@name,'Disabled') or contains(@name,'Désactiver'))]")
	private MobileElement spendingNotificationsBtnOff;
	
	//@iOSFindBy(xpath = "//XCUIElementTypeSwitch[(contains(@label,'Spending Notifications') or contains(@label,'les avis sur les dépenses')) and @value='1']")
	@iOSXCUITFindBy(xpath = "//*[(contains(@label,'Spending Notifications') or contains(@label,'les avis sur les dépenses')) and (contains(@name,'Enabled') or contains(@name,'Activer'))]")
	private MobileElement spendingNotificationsBtnOn;
	
	//@iOSFindBy(xpath = "//XCUIElementTypeSwitch[(contains(@label,'Daily Digest Notifications') or contains(@label,'les avis pour le sommaire quotidien')) and @value='0']")
	@iOSXCUITFindBy(xpath = "//*[(contains(@label,'Daily Digest Notifications') or contains(@label,'les avis pour le sommaire quotidien')) and (contains(@name,'Disabled') or contains(@name,'Désactiver'))]")
	private MobileElement dailyDigestNotificationsBtnOff;
	
	//@iOSFindBy(xpath = "//XCUIElementTypeSwitch[(contains(@label,'Daily Digest Notifications') or contains(@label,'les avis pour le sommaire quotidien')) and @value='1']")
	@iOSXCUITFindBy(xpath = "//*[(contains(@label,'Daily Digest Notifications') or contains(@label,'les avis pour le sommaire quotidien')) and (contains(@name,'Enabled') or contains(@name,'Activer'))]")
	private MobileElement dailyDigestNotificationsBtnOn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Send Daily' or contains(@label,'Envoyer chaque jour')]/../following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther")
	private MobileElement sendDailyTime;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[(contains(@name,'Send Daily') or contains(@label,'Envoyer chaque jour')) and @enabled='true']")
	private MobileElement sendDailyTimeEnabled;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[(contains(@name,'Send Daily') or contains(@label,'Envoyer chaque jour')) and @enabled='false']")
	private MobileElement sendDailyTimeDisabled;
	
	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Send Daily') or contains(@label,'Envoyer chaque jour')]")
	private MobileElement sendDaily;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SELECT ACCOUNTS' or contains(@label,'CHOISIR DES COMPTES')]/following-sibling::XCUIElementTypeOther[contains(@name,'ON')]")
	private List<MobileElement> activeAccountsOn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='SELECT ACCOUNTS' or contains(@label,'CHOISIR DES COMPTES')]/following-sibling::XCUIElementTypeOther[contains(@name,'OFF')]")
	private List<MobileElement> activeAccountsOff;
	
	@iOSXCUITFindBy(iOSClassChain = "**/*[`name=='Save' or name=='Enregistrer'`]")
	private MobileElement saveBtn;
	
	@FindBy(xpath = "(//*[@id='firstMenuItem'])[1]")
	private WebElement activeAccountsAndroid;
	
	@FindBy(xpath = "(//*[@id='firstMenuItem'])[1]/*[3]")    
	private WebElement activeAccountsNoAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Real Time Notifications') or contains(text(),'Avis en temps réel')]")
	private WebElement realTimeNotificationsAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Real Time Notifications') or contains(text(),'Avis en temps réel')]/../*[3]")
	private WebElement realTimeNotificationStatusAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Daily Digest Notifications') or contains(text(),'Avis pour le sommaire quotidien')]")
	private WebElement dailyDigestNotificationsAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Daily Digest Notifications') or contains(text(),'Avis pour le sommaire quotidien')]/../*[3]")
	private WebElement dailyDigestNotificationStatusAndroid;
	
	@FindBy(xpath = "//*[@ng-model='notificationSettings.isNotifOn']")
	private WebElement spendingNotificationsBtnOnAndroid;
	
	@FindBy(xpath = "//*[@ng-model='notificationSettings.isNotifOff']")
	private WebElement spendingNotificationsBtnOffAndroid;
	
	@FindBy(xpath = "//*[@ng-model='notificationSettings.isDailyDigestOn']")
	private WebElement dailyDigestNotificationsBtnOnAndroid;
	
	@FindBy(xpath = "//*[@ng-model='notificationSettings.isDailyDigestOff']")
	private WebElement dailyDigestNotificationsBtnOffAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Notification Settings') or contains(text(),'Paramètres pour les avis')]")
	private WebElement notificationSettingsHeaderAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Send Daily') or contains(text(),'Envoyer chaque jour')]")
	private WebElement sendDailyAndroid;
	
	@FindBy(xpath = "//*[@ng-model='dailyNotifDate']")
	private WebElement sendDailyTimeAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Active Accounts') or contains(text(),'Comptes actifs')]")
	private WebElement activeAccountsHeaderAndroid;
	
	
	@FindBy(xpath = "(//*[@ng-click='goMainPageBack()'])[1]")
	private WebElement clickBackAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Save') or contains(text(),'Enregistrer')]")
	private WebElement saveBtnAndroid;
	
	@FindBy(xpath="(//*[@id='homeButton'])[2]")
	private WebElement homeBtnAndroid;
	

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
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
				
				System.out.println(onButtons.size());

				while (onButtons.size() != 0) {
					mobileAction.FuncClick(onButtons.get(0), "Clicked on toggle Button");
				}
			}

			if (platform.equalsIgnoreCase("Android")) {
				// mobileAction.FuncClickBackButton();
				CL.GetAppiumDriver().context("NATIVE_APP");
				Spending_Insight.get().clickSideMenuButton();
				if(mobileAction.verifyElementIsPresent(activeAccountsNoAndroid)){
					CL.GetAppiumDriver().context("NATIVE_APP");
					Spending_Insight.get().clickSideMenuButton();
				}
				SideMenu.get().clickSpendingInsights();
			} else {
				Spending_Insight.get().clickSideMenuButton();
				if(mobileAction.verifyElementIsPresent(activeAccounts)){
					Spending_Insight.get().clickSideMenuButton();
				}
				SideMenu.get().clickSpendingInsights();
			}

		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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

		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
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
		String accountText="";
		 String accountTextReplaceSpace="";
		 String accountTextOne="";
		 String[] accountTextSplit = null;
		 String[] accountNumberSplit = null;
		 

		try {
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
					mobileAction.verifyElementIsDisplayed(activeAccountsAndroid, "Active Accounts");
					
					  accountText=activeAccountsNoAndroid.getText();
					    String[] activeAccSize=accountText.split("/");
					    int activeAcc=Integer.parseInt(activeAccSize[0]);
					    
					mobileAction.FuncClick(activeAccountsAndroid, "Active Accounts");
					mobileAction.verifyElementIsDisplayed(activeAccountsHeaderAndroid, "Active Accounts");
					
					int onSize=activeAcc;
				    if( activeAcc==onSize){
				    	CL.GetReporting().FuncReport("Pass", "Active Accounts Verified: "+onSize+ "  Active Accounts");
				    }else{
				    	CL.GetReporting().FuncReport("Fail", "Active Acconts not verified");
				    }
					
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
				     accountText=activeAccounts.getText();
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
			
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
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
		String notificationStatus="";
		String[] notificationStat=null;
		String notiStatus=null;
		String[] status=null;
		String realTimeStatus=null;

		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				
				mobileAction.FuncClick(realTimeNotificationsAndroid, "Real Time Notification");
				mobileAction.verifyElementIsDisplayed(notificationSettingsHeaderAndroid, "Notification Settings");
				
				if(mobileAction.verifyElementIsPresent(spendingNotificationsBtnOffAndroid)){
					mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOffAndroid, "Spending Notifications is OFF");
					mobileAction.FuncClick(spendingNotificationsBtnOffAndroid, "Spending Notification Button OFF");
					mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOffAndroid, "Spending Notification Button ON");
					notificationStatus=spendingNotificationsBtnOffAndroid.getText();
					
				}else{
					mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOnAndroid, "Spending Notifications is ON");
					mobileAction.FuncClick(spendingNotificationsBtnOnAndroid, "Spending Notification Button ON");
					mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOnAndroid, "Spending Notification Button OFF");
					notificationStatus=spendingNotificationsBtnOnAndroid.getText();
					
				}
				 if(currentLocale.equalsIgnoreCase("EN")){
					  notificationStat=notificationStatus.split("Notifications ");
					  notiStatus=notificationStat[1];
				     }else{
				    	 notificationStat=notificationStatus.split(" les");
				    	 notiStatus=notificationStat[0];
				     }
				
				
				mobileAction.FuncClick(saveBtnAndroid, "Save Button");
				mobileAction.verifyTextContains(realTimeNotificationStatusAndroid, notiStatus);
				CL.GetAppiumDriver().context("NATIVE_APP");
				
				
			
			}else{
			
				mobileAction.FuncClick(realTimeNotifications, "Real Time Notification");
				mobileAction.verifyElementIsDisplayed(notificationSettingsHeader, "Notification Settings");
				
				if(mobileAction.verifyElementIsPresent(spendingNotificationsBtnOff)){
					mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOff, "Spending Notifications is OFF");
					mobileAction.FuncClick(spendingNotificationsBtnOff, "Spending Notification Button OFF");
					mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOn, "Spending Notifications is ON");
					notificationStatus=spendingNotificationsBtnOn.getAttribute("name");
				}else{
					mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOn, "Spending Notifications is ON");
					mobileAction.FuncClick(spendingNotificationsBtnOn, "Spending Notification Button ON");
					mobileAction.verifyElementIsDisplayed(spendingNotificationsBtnOff, "Spending Notifications is oFF");
					notificationStatus=spendingNotificationsBtnOff.getAttribute("name");
				}
				
				  if(currentLocale.equalsIgnoreCase("EN")){
					  notificationStat=notificationStatus.split("Notifications ");
					  notiStatus=notificationStat[1];
					  status =notiStatus.split(",");
					  realTimeStatus=status[0];
				     }else{
				    	 notificationStat=notificationStatus.split(" les");
				    	 realTimeStatus=notificationStat[0];
				     }
				
				
				mobileAction.FuncClick(saveBtn, "Save");
				
				System.out.println("realTimeNotifications: "+realTimeNotifications.getText() +" notiStatus:" +notiStatus);
				mobileAction.verifyTextContains(realTimeNotifications,realTimeStatus);
				
			}
			
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
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
		String notificationStatus="";
		String[] notificationStat=null;
		String notiStatus=null;
		String time=getTestdata("Time");
		String[] timeVal=time.split(",");
		String[] status=null;
		String realTimeStatus=null;
		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.FuncClick(dailyDigestNotificationsAndroid, "Daily Digest Notification");
				mobileAction.verifyElementIsDisplayed(notificationSettingsHeaderAndroid, "Notification Settings");
				if(mobileAction.verifyElementIsPresent(dailyDigestNotificationsBtnOnAndroid)){
					
					mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOnAndroid, "Daily Digest Notifications ON");
					mobileAction.FuncClick(dailyDigestNotificationsBtnOnAndroid, "Daily Digest Notification Button ON");
					mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOnAndroid, "Daily Digest Notifications OFF");
					notificationStatus=dailyDigestNotificationsBtnOnAndroid.getText();
					
					System.out.println("dailyDigestNotificationsBtnOnAndroid: "+notificationStatus);
				}else{
					mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOffAndroid, "Daily Digest Notifications OFF");
					mobileAction.FuncClick(dailyDigestNotificationsBtnOffAndroid, "Daily Digest Notifications OFF");
					mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOffAndroid, "Daily Digest Notifications ON");
					notificationStatus=dailyDigestNotificationsBtnOffAndroid.getText();
					
					System.out.println("dailyDigestNotificationsBtnOffAndroid: "+notificationStatus);
					mobileAction.FuncClick(sendDailyTimeAndroid, "Select Time");
					Select notiTime=new Select(sendDailyTimeAndroid);
					if(currentLocale.equalsIgnoreCase("EN")){
						notiTime.selectByVisibleText(timeVal[0]);
					}else{
						notiTime.selectByVisibleText(timeVal[1]);
					}
				}
				
				  if(currentLocale.equalsIgnoreCase("EN")){
					  notificationStat=notificationStatus.split("Notifications ");
					  notiStatus=notificationStat[1];
					  System.out.println("notiStatus: "+notiStatus);
				     }else{
				    	 notificationStat=notificationStatus.split(" les");
				    	 notiStatus=notificationStat[0];
				     }
				
				mobileAction.FuncClick(saveBtnAndroid, "Save Button");
				System.out.println("dailyDigestNotificationStatusAndroid: "+dailyDigestNotificationStatusAndroid.getText());
				mobileAction.verifyTextContains(dailyDigestNotificationStatusAndroid,notiStatus);
				CL.GetAppiumDriver().context("NATIVE_APP");
				Spending_Insight.get().clickSideMenuButton();
				SideMenu.get().clickSpendingInsights();
				CL.GetAppiumDriver().context("NATIVE_APP");
			//	SideMenu.get().clickSpendingInsights();
				//CL.GetAppiumDriver().context("NATIVE_APP");
			
			}else{
			
				mobileAction.FuncClick(dailyDigestNotifications, "Daily Digest Notification");
				mobileAction.verifyElementIsDisplayed(notificationSettingsHeader, "Notification Settings");
				
				if(mobileAction.verifyElementIsPresent(dailyDigestNotificationsBtnOn)){
					mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOn, "Daily Digest Notifications ON");
					mobileAction.FuncClick(dailyDigestNotificationsBtnOn, "Daily Digest Notification Button ON");
					mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOff, "Daily Digest Notifications OFF");
					mobileAction.verifyElementIsDisplayed(sendDailyTimeEnabled, "Send Daily Time Disabled");
					notificationStatus=dailyDigestNotificationsBtnOff.getAttribute("name");
				}else{
					mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOff, "Daily Digest Notifications OFF");
				}
					mobileAction.FuncClick(dailyDigestNotificationsBtnOff, "Daily Digest Notification Button OFF");
					mobileAction.verifyElementIsDisplayed(dailyDigestNotificationsBtnOn, "Daily Digest Notifications ON");
					mobileAction.verifyElementIsDisplayed(sendDailyTimeEnabled, "Send Daily Time Enabled");
					mobileAction.FuncClick(sendDailyTimeEnabled, "Select Time");
						MobileElement pickerWheel = mobileAction.mobileElementUsingXPath("//XCUIElementTypeOther/XCUIElementTypePickerWheel");
						
						 if(currentLocale.equalsIgnoreCase("EN")){
							 pickerWheel.setValue(timeVal[0]);
						 }else{
							 pickerWheel.setValue(timeVal[1]);
						 }
						
						//mobileAction.FuncClick(sendDaily, "Send daily");
						mobileAction.FuncClick(notificationSettingsHeader, "Send daily");
					
					
					//Spending_Insight.get().clickSideMenuButton();
						notificationStatus=dailyDigestNotificationsBtnOn.getAttribute("name");
				
						  if(currentLocale.equalsIgnoreCase("EN")){
							  notificationStat=notificationStatus.split("Notifications ");
							  notiStatus=notificationStat[1];
							  status =notiStatus.split(",");
							  realTimeStatus=status[0];
						     }else{
						    	 notificationStat=notificationStatus.split(" les");
						    	 realTimeStatus=notificationStat[0];
						     }
				mobileAction.FuncClick(saveBtn, "Save");
				mobileAction.verifyTextContains(dailyDigestNotifications,realTimeStatus);
				
				
				
			}
			
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify the Home page in the Preference Page.Clicking on Home page should navigate user to TDAPP.
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
	public void verifyHomePage() throws InterruptedException {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.FuncClick(homeBtnAndroid, "Home Button");
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.verifyElementIsDisplayed(quickAccess, "Home Page");
				HomeScreen.get().clickMenu();
				mobileAction.FuncClick(TDMySpend, "TD My Spend");
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
			} else {
				mobileAction.verifyElementIsDisplayed(homeBtn, "HomePage");
				mobileAction.FuncClick(homeBtn, "Home Button");
				mobileAction.verifyElementIsDisplayed(quickAccess, "Home Page");
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(TDMySpend, "TD My Spend");
				
			}
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will click on the Active Accounts
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
	public void clickActiveAccounts() throws InterruptedException {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if(mobileAction.verifyElementIsPresent(activeAccountsAndroid)){
					mobileAction.FuncClick(activeAccountsAndroid, "Active Accounts");
				}
				
			} else {
				if(mobileAction.verifyElementIsPresent(activeAccounts)){
					mobileAction.FuncClick(activeAccounts, "Active Accounts");
				}
				
			}
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
}
