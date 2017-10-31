package com.td.test.CDNMobile.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreenMIT;
import com.td._CommonPage;

import cucumber.api.java.hu.De;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MIT_PNSAccessAlerts extends _CommonPage {

	private static MIT_PNSAccessAlerts MIT_PNSAccessAlerts;

	public synchronized static MIT_PNSAccessAlerts get() {
		if (MIT_PNSAccessAlerts == null) {
			MIT_PNSAccessAlerts = new MIT_PNSAccessAlerts();
		}
		return MIT_PNSAccessAlerts;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") // @Author -
																// Sushil
																// 07-Mar-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//*[contains(@label,'Menu')]")
	@AndroidFindBy(id = "android:id/up")
	MobileElement MenuUp;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='NAV_DRAWER_ITEMS_LOGOUT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement Logout;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@name,'GO BACK') or contains(@name,'')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'GO BACK') or contains(@text,'')]")
	private MobileElement BTN_GOBACKHOME;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'Alerts') or contains(@label,'Alertes')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and (contains(@text,'Alerts') or contains(@text,'Alertes'))]")
	private MobileElement LBL_Alerts;

	// @iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Balances')
	// or contains(@label,'Soldes')]")
	@iOSFindBy(xpath = "//*[@name='HMSEGMENT_TITLE_0']")
	@AndroidFindBy(id = "com.td:id/balancesTab")
	private MobileElement LBL_balancesTab;

	// @iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Holdings') or
	// contains(@name,'Des placements')]")
	@iOSFindBy(xpath = "//*[@name='HMSEGMENT_TITLE_1']")
	@AndroidFindBy(id = "com.td:id/holdingsTab")
	private MobileElement LBL_holdingsTab;

	@iOSFindBy(xpath = "(//XCUIElementTypeCell[@name='priceChangeLabel' and contains(@label,'+')])[0]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/price_change' and contains(@text,'-')])[1]")
	private MobileElement VAL_price_change;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'quote')]")
	@AndroidFindBy(id = "com.td:id/quoteBtn")
	private MobileElement BTN_Quote;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'quote')]")
	@AndroidFindBy(id = "com.td:id/alertsBtn")
	private MobileElement BTN_alertsBtn;

	/*
	 * @iOSFindBy(xpath="//XCUIElementTypeButton[contains(@name,'quote')]")
	 * 
	 * @AndroidFindBy(xpath="//*[@class='sprite sprite-back']") private By
	 * BTN_Back;
	 */

	private By BTN_Back = By.xpath("//*[@class='sprite sprite-back']");

	private By HDR_CreateAlert = By.xpath("//*[@title='Create Alert' or @title='Cr�er une alerte']");

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'Markets') or contains(@label,'March�s')]")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/title' and
	// (contains(@text,'Markets') or contains(@text,'March�s'))]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Markets') or contains(@text,'March�s')]")
	private MobileElement LBL_Markets;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'Markets') or contains(@label,'March�s')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (contains(@text,'Notifications') or contains(@text,'Notifications'))]")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[contains(@text,'Notifications') or
	// contains(@text,'Notifications')]")
	private MobileElement HDR_Notifications;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'Markets') or contains(@label,'March�s')]")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='android:id/action_bar_title' and
	// (contains(@text,'Notifications') or contains(@text,'Notifications'))]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Notifications') or contains(@text,'Notifications')]")
	private MobileElement LBL_Notifications;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='NAV_DRAWER_ITEMS_LOGOUT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Settings' or @text='Param�tres')]")
	private MobileElement MN_Settings;

	By ED_Markets_symbolSearch = By.id("symbol-search");

	By LBL_Symbol_CA = By.xpath("//*[@class='sprite flag flag-ca']/../*[@class='symbol']/*[1]");

	By LBL_Symbol_US = By.xpath("//*[@class='sprite flag flag-us']/../*[@class='symbol']/*[1]");

	By ICN_Alert_MOD = By.xpath("//button[@class='btn btn-default create-alert glyphicon glyphicon-bell']");

	By BTN_SettingsGear = By.xpath("//*[@class='sprite sprite-gear']");

	By HDR_Alerts_DeliveryPref = By.xpath("//*[@title='Alerts']");

	By LBL_EditPushNotification = By.xpath("//*[@class='email-row push-notifications-row top-row']");

	private By TAB_ActiveAlerts = By.xpath("//*[text()='Active Alerts' or text()='Alertes actives']");

	public void logout() {
		Decorator();
		try {
			mobileAction.FuncClick(MenuUp, "Hamburger Menu");
			mobileAction.FuncClick(Logout, "Logout");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPreLoginDashboardAlerts() {
		Decorator();
		try {
			mobileAction.FuncClick(backButton, "backButton");
			logout();
			mobileAction.FuncClick(BTN_GOBACKHOME, "BTN_GOBACKHOME");
			mobileAction.verifyElementIsDisplayed(LBL_Alerts, "Alerts");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAlertUI() {
		String xpathAccount = "";
		String accNumber = "";

		Decorator();
		try {
			accNumber = getTestdata("Accounts", "UserIDs").trim();// @Author -
																	// Sushil
																	// 02-Jun-2017

			xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");

			mobileAction.FuncIsDisplayed(LBL_balancesTab, "LBL_balancesTab");

			mobileAction.FuncClick(LBL_holdingsTab, "LBL_holdingsTab");

			mobileAction.FunCnewSwipe(VAL_price_change, false, 20);

			mobileAction.FuncClick(VAL_price_change, "VAL_price_change");

			mobileAction.FuncClick(BTN_Quote, "BTN_Quote");

			// Handle webview
			/*
			 * if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase(
			 * "Android")) {
			 */
			// System.out.println("ji");
			/*
			 * FuncSwitchContext("NATIVE_APP"); Set<String> contextNames =
			 * ((AppiumDriver) CL.GetDriver()).getContextHandles(); for (String
			 * contextName : contextNames) { System.out.println(contextNames);
			 * //prints out something like [NATIVE_APP, WEBVIEW_<APP_PKG_NAME>]
			 * }
			 */ // For Ios FIX
				// FuncSwitchContext("WEBVIEW_10"); //switch context to WebView
				// to get the HTML DOM
			FuncSwitchContext(getWebViewContextString());
			// System.out.println(((AppiumDriver)
			// CL.GetDriver()).getPageSource());
			mobileAction.verifyElementUsingXPath(
					"//button[@class='btn btn-default create-alert glyphicon glyphicon-bell']", "Alert Icon");
			// PerformAction.FuncClick(BTN_Back);
			mobileAction.FuncClick(getMobileElement(BTN_Back), "BTN_Back");
			// mobileAction.FuncClick(BTN_Back, "Back Button");
			FuncSwitchContext("NATIVE_APP"); // remember to switch back when
												// done (back to inspecting
												// native android components)

			// 01.13 FRE_Alerts PNS-Access Alerts_3919_3945_Verify if alert icon
			// is displayed on Holding details page.
			mobileAction.FuncClick(BTN_alertsBtn, "BTN_alertsBtn");

			// FuncSwitchContext("WEBVIEW_com.td");
			FuncSwitchContext(getWebViewContextString());

			// mobileAction.verifyElementIsDisplayed(getMobileElement(HDR_CreateAlert),
			// "HDR_CreateAlert");
			verifyAlertLandingPage();
			// PerformAction.FuncVerify(HDR_CreateAlert);
			// }
			/*
			 * else {
			 * 
			 * }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 01.14 ENG_Alerts PNS-Access Alerts_3919_3945_Verify if alert icon is
	// displayed on MOD quotes page.

	public void verifyAlertIconMODQuotesPage() {
		Decorator();
		try {
			mobileAction.FuncClick(LBL_Markets, "LBL_Markets");

			String[] sSymbolList = getTestdata("Symbol", XLSheetUserIDs).split(";");
			for (int i = 0; i < sSymbolList.length; i++) {
				String symbolName = sSymbolList[i];

				FuncSwitchContext(getWebViewContextString()); // switch context
																// to WebView to
																// get the HTML
																// DOM
				mobileAction.FuncSendKeys(getMobileElement(ED_Markets_symbolSearch), symbolName);
				selectPNSCanadaSymbol(symbolName);
				mobileAction.FuncClick(getMobileElement(ICN_Alert_MOD), "Alert Icon");

				/*
				 * Set<String> contextNames = ((AppiumDriver)
				 * CL.GetDriver()).getContextHandles(); for (String contextName
				 * : contextNames) { System.out.println(contextNames); //prints
				 * out something like [NATIVE_APP, WEBVIEW_<APP_PKG_NAME>] }
				 */
				// FuncSwitchContext(getWebViewContextString());
				verifyAlertLandingPage();
				Thread.sleep(7000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNotificationPrefMOD() {
		Decorator();
		try {
			mobileAction.FuncClick(backButton, "backButton");

			mobileAction.FuncClick(LBL_Alerts, "Alerts");

			FuncSwitchContext(getWebViewContextString());

			mobileAction.FuncClick(getMobileElement(BTN_SettingsGear), "Settings Gear");

			mobileAction.verifyElementIsDisplayed(getMobileElement(HDR_Alerts_DeliveryPref), "Delivery Preferences");

			mobileAction.FuncClick(getMobileElement(LBL_EditPushNotification), "Edit Push Notofications");

			FuncSwitchContext("NATIVE_APP");

			mobileAction.verifyElementIsDisplayed(HDR_Notifications, "Notifications");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNotificationPrefFlyMenu() {
		Decorator();
		try {
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.FuncClick(MenuUp, "Hamburger Manu");
			mobileAction.FuncSwipeWhileElementNotFound(MN_Settings, true, 5, "up");
			mobileAction.FuncClick(LBL_Notifications, "Notifications");
			mobileAction.verifyElementIsDisplayed(HDR_Notifications, "Notifications");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void FuncSwitchContext(String sContext) {
		try {
			((AppiumDriver) CL.GetDriver()).context(sContext); // switch context
																// to WebView to
																// get the HTML
																// DOM
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getWebViewContextString() {
		String sWebViewContext = "";
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				sWebViewContext = "WEBVIEW_com.td";
			else {
				/*
				 * Set<String> contextNames = ((AppiumDriver)
				 * CL.GetDriver()).getContextHandles(); ((AppiumDriver)
				 * CL.GetDriver()).context("NATIVE_APP"); for(String contextes :
				 * contextNames) { System.out.println(contextNames);
				 * ((AppiumDriver) CL.GetDriver()).context(contextes);
				 * System.out.println("hi"); if(contextes.contains("WEBVIEW")) {
				 * ((AppiumDriver) CL.GetDriver()).context(contextes);
				 * System.out.println(CL.GetDriver().getPageSource());
				 * if(((AppiumDriver)
				 * CL.GetDriver()).getPageSource().contains("Active Alerts")) {
				 * sWebViewContext = contextes; //break; } // } }
				 */
				/*
				 * final String text = ((AppiumDriver) CL.GetDriver())
				 * .findElement(By.cssSelector("body")).getText();
				 * System.out.print("Body: " +text);
				 */
				/*
				 * System.out.println("hi"); Set<String> contextNames =
				 * ((AppiumDriver) CL.GetDriver()).getContextHandles();
				 * ((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");
				 * for(String contextes : contextNames) {
				 * System.out.println(contextes); ((AppiumDriver)
				 * CL.GetDriver()).context(contextes); if(((AppiumDriver)
				 * CL.GetDriver()).getPageSource().contains("trackCustomLink"))
				 * { break; }
				 */
				Set<String> contextNames = ((AppiumDriver) CL.GetDriver()).getContextHandles();

				List<String> listcontext = new ArrayList(contextNames);

				((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				for (String ss : listcontext) {

					System.out.println(ss);

					((AppiumDriver) CL.GetDriver()).context(ss);
					Thread.sleep(10000);

					// if(((AppiumDriver)
					// CL.GetDriver()).getPageSource().contains("trackCustomLink"))
					if (((AppiumDriver) CL.GetDriver()).getPageSource().contains("Active Alerts")) {
						sWebViewContext = ss;
						break;

					}

					// }

					/*
					 * final String text = ((AppiumDriver) CL.GetDriver())
					 * 
					 * .findElement(By.cssSelector("body")).getText();
					 * 
					 * System.out.print("Body: " +text);
					 */

				}
				/*
				 * final String text = ((AppiumDriver) CL.GetDriver())
				 * .findElement(By.cssSelector("body")).getText();
				 * System.out.print("Body: " +text);
				 */
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sWebViewContext;
	}

	public void verifyModPagesLoaded() {
		Decorator();
		int cnt = 1;
		try {

			MIT_PNSViewAlertsLandingPage.get().tapAlert();

			FuncSwitchContext(getWebViewContextString());

			mobileAction.verifyElementIsDisplayed(getMobileElement(TAB_ActiveAlerts), "Active Alerts");

			do {
				Thread.sleep(15000);
				cnt++;
			} while (!CL.GetDriver().findElement(TAB_ActiveAlerts).isDisplayed() || cnt >= 6);
			// Thread.sleep(90000);
			CL.GetReporting().FuncReport("Pass", "Waits for max 90 Seconds");

			mobileAction.verifyElementIsDisplayed(getMobileElement(TAB_ActiveAlerts), "Active Alerts");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MobileElement getMobileElement(By element) {
		try {
			return (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(element);
		} catch (Exception e) {
			return null;
		}
	}

	public void verifyAlertLandingPage() {
		try {
			Thread.sleep(7000);
			mobileAction.verifyElementIsDisplayed(getMobileElement(HDR_CreateAlert), "HDR_CreateAlert");
			mobileAction.FuncClick(getMobileElement(BTN_Back), "BTN_Back");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectPNSCanadaSymbol(String sSymbol) {
		try {
			for (WebElement symbol : CL.GetDriver().findElements(LBL_Symbol_CA)) {
				if (symbol.getText().equalsIgnoreCase(sSymbol)) {
					mobileAction.FuncClick((MobileElement) symbol, "Canada Symbol " + sSymbol);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectPNSUSSymbol(String sSymbol) {
		try {
			for (WebElement symbol : CL.GetDriver().findElements(LBL_Symbol_US)) {
				if (symbol.getText().equalsIgnoreCase(sSymbol)) {
					mobileAction.FuncClick((MobileElement) symbol, "US Symbol " + sSymbol);
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
