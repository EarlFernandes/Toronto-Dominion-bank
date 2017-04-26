package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td.StringLookup;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MenuPage extends _CommonPage {

	private static MenuPage MenuPage;

	
	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_TRANSFERS']/XCUIElementTypeStaticText")
	private MobileElement transfers;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_BILLS']/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Bills']")
	private MobileElement bills;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_MOVEN']/XCUIElementTypeStaticText")
	private MobileElement tdMySpend;
	
	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_CROSSBORDER']/XCUIElementTypeStaticText")
	private MobileElement crossBorder;
	
	// FIXME: Ask May to add this
	@iOSFindBy(xpath = "//*[@label='投资账户']")
	//@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_INVESTING']/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Investing Accounts']")
	private MobileElement investing;

	@iOSFindBy(xpath = "//*[@label='Comptes Placements directs TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Investing']")
	private MobileElement investingFRE;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_QUESTIONS']/XCUIElementTypeStaticText")
	private MobileElement faq;
	
	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_FEEDBACK']/XCUIElementTypeStaticText")
	private MobileElement feedback;
	
	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_DEPOSIT']/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText']")
	private MobileElement mobile_Deposit_button;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_ACCOUNTS']/XCUIElementTypeStaticText")
	private MobileElement accounts_button;

	// FIXME: Ask May to add this
	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_TDFORME']/XCUIElementTypeStaticText")
	private MobileElement tdForMe;

	@iOSFindBy(xpath = "//*[@label='Virements'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard'and @text='VIREMENTS']")
	private MobileElement french_transfers;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_CONTACT']/XCUIElementTypeStaticText")
	private MobileElement contactUs;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_HOME']/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']")
	private MobileElement home_button;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_PRIVACY']/XCUIElementTypeStaticText")
	private MobileElement privacy;
	
	@iOSFindBy(xpath = "//*[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
	private MobileElement trade;

	@iOSFindBy(xpath = "//*[@label='TD Mobile Payment']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='TD Mobile Payment']")
	private MobileElement mobilePayment;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Apple Pay']")
	private MobileElement applePay;
	
	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_LOCATIONS']/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Locations']")
	private MobileElement locations;
	
	//Profile and preference
	@iOSFindBy(xpath = "//*[@label='Profile & Settings']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Profile and Settings' or @text='Profil et paramètres')]")
	private MobileElement profile_and_settings;


	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText']")
	private List <MobileElement> menuOpts;
	
	@iOSFindBy(accessibility = "NAV_DRAWER_ITEMS_ACCOUNTS")
	private MobileElement menuAccounts;
	
	public synchronized static MenuPage get() {
		if (MenuPage == null) {
			MenuPage = new MenuPage();
		}
		return MenuPage;
	}

	private void initElementContactUs() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				contactUs = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("contact_str") + "']", "Contact Us");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	/**
	 * This method will click on the Transfers button on menu page
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
	public void clickMenuTransfer() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS xpath expression required
			} else {
				transfers = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("transfers_str") + "']", "Transfers");
			}
			mobileAction.FuncClick(transfers, "Transfers");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the Home button on menu page
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
	public void clickMenuHome() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS xpath expression required  //FIXED::not required
			} else {
				home_button = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("logoutSuccessQuickTaskHome") + "']", "Home");
			}
			mobileAction.FuncClick(home_button, "Home");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the Transfers button on menu page
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
	public void clickTransfers_InFrench() {

		Decorator();
		try {
			mobileAction.FuncClick(french_transfers, "Transfers");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the Transfers button on menu page
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
	public void clickMenuAccounts() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				accounts_button = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("str_My_Accounts") + "']", "My Accounts");
			}
			mobileAction.FuncClick(accounts_button, "Accounts");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the Investing button on menu page
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
	public void clickMenuInvesting() {

		Decorator();
		try {

			boolean isLanguageFrench = getTestdata("Language").equals("FRE");

			MobileElement investingElement = isLanguageFrench ? investingFRE : investing;
			mobileAction.FuncClick(investingElement, "Investing");
			mobileAction.waitForElementToVanish(progressBar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the Contact us button on menu page
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
	public void clickContactUs() {

		Decorator();
		initElementContactUs();
		try {
			mobileAction.FuncClick(contactUs, "contactUs");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the Bills button on menu page
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
	public void clickMenuBills() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				bills = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("bills_str") + "']", "Bills");
			}
			mobileAction.FuncClick(bills, "Bills");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the mobile deposit button on menu page
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
	public void mobile_Deposit_click() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobile_Deposit_button = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("ActionBar_MobileDeposit") + "']", "Mobile Deposit");
			}
			String mobile_Deposit = "Mobile Deposit";

			mobileAction.FuncClick(mobile_Deposit_button, "Mobile_Deposit_Button");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickMenuTrade() {

		Decorator();
		try {
			mobileAction.FuncClick(trade, "Trade");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void clickMenuCrossBorder() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS xpath expression required
			} else {
				crossBorder = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("str_CrossBorder") + "']", "Cross Border");
			}
			mobileAction.FuncClick(crossBorder, "Cross Border");
			Thread.sleep(7000);
			} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	
	/**
	 * This method will click on the TD Mobile Payment in the menu page
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
	public void clickMobilePayment() {

		try {
			Decorator();
			mobileAction.FuncClick(mobilePayment, "Mobilepayment");
			mobileAction.waitForElementToVanish(progressBar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
	/**
	 * This method will click on the Apple Pay button in the menu page
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
	public void clickApplePay() {

		try {
			Decorator();
			mobileAction.FuncClick(applePay, "Apple Pay");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	 * This method will click on the Locations on menu page
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
	public void clickFindLocations() {

		Decorator();
		try {
			mobileAction.FuncClick(locations, "Locations");
			Thread.sleep(2000);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	
	//For profile and preference
	
	/**
	 * This method will click on "Profile & Setting" on menu page
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
	public void clickProfileAndSettings() {
		Decorator();
		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.SwipeWithinElement("//android.support.v4.widget.DrawerLayout",  2, "down");
			}
			mobileAction.FuncClick(profile_and_settings, "Profile & Settings");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify "Profile & Setting" is displayed on menu page
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
	public void VerifyProfileAndSettingslink() {
		Decorator();
		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.SwipeWithinElement("//android.support.v4.widget.DrawerLayout",  2, "down");
			}
			mobileAction.verifyElement(profile_and_settings, "Profile & Settings");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the fly out menu
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyMenuTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(home_button.getText(), mobileAction.getAppString("flyoutNavigationHeader"));
				mobileAction.verifyTextEquality(accounts_button.getText(), mobileAction.getAppString("str_My_Accounts"));
				mobileAction.verifyTextEquality(transfers.getText(), mobileAction.getAppString("flyoutNavigationLinkTransfers"));
				mobileAction.verifyTextEquality(bills.getText(), mobileAction.getAppString("flyoutNavigationLinkBills"));
				mobileAction.verifyTextEquality(tdMySpend.getText(), mobileAction.getAppString("nav_drawer_items_moven"));
				mobileAction.verifyTextEquality(mobile_Deposit_button.getText(), mobileAction.getAppString("flyoutNavigationLinkMobileDeposit"));
				// FIXME: Ask may to add investing account identifier
				//mobileAction.verifyTextEquality(investing.getText(), mobileAction.getAppString("investing_accounts_str"));
				// FIXME: Need identifier for tdforme
				//mobileAction.verifyTextEquality(tdForMe.getText(), mobileAction.getAppString("str_dashboard_navigation_row_zones"));
				// FIXME: Need to scroll down here for phones
				mobileAction.verifyTextEquality(crossBorder.getText(), mobileAction.getAppString("nav_drawer_items_crossborder"));
				mobileAction.verifyTextEquality(locations.getText(), mobileAction.getAppString("flyoutNavigationLinkFindLocations"));
				mobileAction.verifyTextEquality(feedback.getText(), mobileAction.getAppString("nav_drawer_items_feedback"));
				mobileAction.verifyTextEquality(contactUs.getText(), mobileAction.getAppString("nav_drawer_items_contact"));
				mobileAction.verifyTextEquality(faq.getText(), mobileAction.getAppString("nav_drawer_items_questions"));
				mobileAction.verifyTextEquality(privacy.getText(), mobileAction.getAppString("nav_drawer_items_privacy"));
			} else {
				final String locale = CL.LoadData("Value", CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "LOCALE");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("logoutSuccessQuickTaskHome") + "']", "Home");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("contact_str") + "']", "Contact Us");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("ActionBar_MobileDeposit") + "']", "Mobile Deposit");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("str_CrossBorder") + "']", "Cross Border Banking");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("logoutSuccessQuickTaskFindLocations") + "']", "Locations");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("str_My_Accounts") + "']", "My Accounts");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("bills_str") + "']", "Bills");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("transfers_str") + "']", "Transfers");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and contains(@text, '" + StringLookup.lookupString(locale, StringLookup.MOBILE_PAYMENT) + "')]", "Mobile Pay");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("tts_td_zones") + "']", "TD for me");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("td_moneyfit_header") + "']", "TD MySpend");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + StringLookup.lookupString(locale, StringLookup.INVESTING_ACCOUNTS) + "']", "Investing Accounts");
				mobileAction.SwipeWithinElement("//android.widget.ListView[@resource-id='com.td:id/list_slidermenu']", 3, "up");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + mobileAction.getAppString("flyoutNavigationLinkFAQ") + "']", "FAQ");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + StringLookup.lookupString(locale, StringLookup.PRIVACY_SECURITY_LEGAL) + "']", "Privacy security and legal");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + StringLookup.lookupString(locale, StringLookup.SEND_FEEDBACK) + "']", "Send feedback");
			}
		} catch (IOException | NoSuchElementException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
	
	/**
	 * @author Ashraf
	 * This method will click on the Investing Accounts button on menu page
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
	public void clickInvestingAccounts() {

		Decorator();
		try {
			
			mobileAction.FuncClick(menuOpts.get(7), "Investing Accounts");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	

}
