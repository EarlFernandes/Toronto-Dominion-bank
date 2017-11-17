package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MenuPage extends _CommonPage {

	private static MenuPage MenuPage;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_TRANSFERS']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_TRANSFERS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Transfers' or @text='Virements')]")
	private MobileElement transfers;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_BILLS']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_BILLS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Bills']")
	private MobileElement bills;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_MOVEN']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_MOVEN']")
	private MobileElement tdMySpend;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_CROSSBORDER']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_CROSSBORDER']")
	private MobileElement crossBorder;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeCell/XCUIElementTypeStaticText[@label='Investing
	// Accounts' or @label='Comptes Placements directs TD' or @label= '"
	// + ChineseStrings.Simplified.FLYOUT_MENU_INVESTING_ACCOUNTS + "' or
	// @label='"
	// + ChineseStrings.Traditional.FLYOUT_MENU_INVESTING_ACCOUNTS + "']")
	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_menu_icon_investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Investing Accounts' or @text='Comptes Placements directs TD')]")

	private MobileElement investing;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Comptes Placements directs TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Comptes Placements directs TD']")
	private MobileElement investingFRE;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_QUESTIONS']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_QUESTIONS']")
	private MobileElement faq;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_FEEDBACK']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_FEEDBACK']")
	private MobileElement feedback;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_DEPOSIT']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_DEPOSIT'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Mobile Deposit']")
	private MobileElement mobile_Deposit_button;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_ACCOUNTS']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_ACCOUNTS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='My Accounts' or @text='Mes comptes')]")
	private MobileElement accounts_button;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Virements'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard'and @text='VIREMENTS']")
	private MobileElement french_transfers;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_CONTACT']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_CONTACT'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Contact Us' or @text='Contactez-nous')]")
	private MobileElement contactUs;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_HOME']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_HOME']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']")
	private MobileElement home_button;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_PRIVACY']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_PRIVACY']")
	private MobileElement privacy;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Trade' or @text='Négociation')]")
	private MobileElement trade;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD Mobile Payment']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='TD Mobile Payment']")
	private MobileElement mobilePayment;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Apple Pay']")
	private MobileElement applePay;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_LOCATIONS']/XCUIElementTypeStaticText | //*[@name='NAV_DRAWER_ITEMS_LOCATIONS']")
	private MobileElement locations;

	// Profile and preference
	@iOSXCUITFindBy(accessibility = "NAV_DRAWER_ITEMS_PREFERENCES")
	private MobileElement profile_and_settings;

	// customer feedback
	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_FEEDBACK']/XCUIElementTypeStaticText | //*@name='NAV_DRAWER_ITEMS_FEEDBACK']")
	private MobileElement give_feedback;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_MAIL_TITLE']")
	private MobileElement give_feedback_contact_us;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText']")
	private List<MobileElement> menuOpts;

	@iOSXCUITFindBy(accessibility = "NAV_DRAWER_ITEMS_ACCOUNTS")
	private MobileElement menuAccounts;

	public synchronized static MenuPage get() {
		if (MenuPage == null) {
			MenuPage = new MenuPage();
		}
		return MenuPage;
	}

	private void initElementContactUs() {
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				contactUs = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("contact_str") + "']",
						"Contact Us");
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

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	/**
	 * This method will click on the Transfers button on menu page
	 * 
	 * @return void
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuTransfer() {

		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				transfers = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("transfers_str") + "']",
						"Transfers");
			} else {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TRANSFERS);
				transfers = mobileAction.verifyElementUsingXPath("//*[@label='" + labelText + "']",
						"Menu Transfer button");
			}
			mobileAction.FuncClick(transfers, "Menu Transfer button");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuHome() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_HOME);
				home_button = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + labelText + "']",
						"Menu Home button");

			}
			mobileAction.FuncClick(home_button, "Menu Home button clicked");
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickTransfers_InFrench() {

		Decorator();
		try {
			mobileAction.FuncClick(transfers, "Transfers");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuAccounts() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				accounts_button = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("str_My_Accounts") + "']",
						"My Accounts");
			} else {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_MYACCOUNTS);
				accounts_button = mobileAction.verifyElementUsingXPath("//*[@label='" + labelText + "']",
						"Menu My Accounts button");
			}

			mobileAction.FuncClick(accounts_button, "Menu My Accounts button");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuInvesting() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				investing = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ getTextInCurrentLocale(StringArray.ARRAY_INVESTING_ACCOUNTS) + "']",
						"Investing menu element");

			}
			boolean isLanguageFrench = getTestdata("Language").equals("FRE");
			MobileElement investingElement = isLanguageFrench ? investingFRE : investing;
			mobileAction.FuncClick(investingElement, "Investing");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickContactUs() {

		Decorator();
		initElementContactUs();
		try {
			mobileAction.FuncClick(contactUs, "contactUs");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuBills() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				bills = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("bills_str") + "']",
						"Menu Bills button");
			} else {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_BILLS);
				bills = mobileAction.verifyElementUsingXPath("//*[@label='" + labelText + "']", "Menu Bills button");
			}

			mobileAction.FuncClick(bills, "Bills");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void mobile_Deposit_click() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobile_Deposit_button = mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
										+ mobileAction.getAppString("ActionBar_MobileDeposit") + "']",
								"Mobile Deposit");
			}
			mobileAction.FuncClick(mobile_Deposit_button, "Mobile_Deposit_Button");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void clickMenuTrade() {

		Decorator();
		try {
			mobileAction.FuncClick(trade, "Trade");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void clickMenuCrossBorder() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				crossBorder = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_CrossBorder") + "']",
						"Cross Border");
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMobilePayment() {

		try {
			Decorator();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_APPLEPAY);
				mobilePayment = mobileAction.verifyElementUsingXPath("//*[@label='" + labelText + "']",
						"Mobile Payment Menu button");
			} else {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_MOBILEPAYMENT);
				mobilePayment = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + labelText + "']",
						"Mobile Payment Menu button");
			}

			mobileAction.FuncClick(mobilePayment, "Mobile Payment Menu button clicked");
			mobileAction.waitProgressBarVanish();
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickApplePay() {

		try {
			Decorator();
			mobileAction.FuncClick(applePay, "Apple Pay");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickFindLocations() {

		Decorator();
		try {
			mobileAction.FuncClick(locations, "Locations");
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	// For profile and preference

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

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_PROFILE_AND_PREFERENCE);
				profile_and_settings = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + labelText + "']",
						"Profile & Settings Menu button");
			}
			mobileAction.FuncSwipeWhileElementNotFound(profile_and_settings, true, 10, "Up");
			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void VerifyProfileAndSettingslink() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_PROFILE_AND_PREFERENCE);
				profile_and_settings = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='" + labelText + "']",
						"Profile & Settings Menu button");
			}
			mobileAction.FuncSwipeWhileElementNotFound(profile_and_settings, false, 10, "Up");
			mobileAction.verifyElementIsDisplayed(profile_and_settings, "Profile & Settings Menu item");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	// Customer feedback
	public void ClickFeedback() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.SwipeWithinElement("//android.support.v4.widget.DrawerLayout", 1, "down");
				String xpath = "//android.widget.TextView[@text='" + mobileAction.getAppString("give_feedback") + "']";
				System.out.println("xpath:" + xpath);
				give_feedback = mobileAction.verifyElementUsingXPath(xpath, "Give Feedback");
				give_feedback_contact_us = mobileAction.verifyElementUsingXPath(xpath, "Give Feedback_contact_us");
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
			return;
		}
		try {
			String elementText = mobileAction.getValue(give_feedback);
			System.out.println("elementText:" + elementText);
			mobileAction.FuncClick(give_feedback, elementText);
			mobileAction.waitProgressBarVanish();
		} catch (Exception e) {
			try {
				String elementText = mobileAction.getValue(give_feedback_contact_us);
				System.out.println("elementText:" + elementText);
				mobileAction.FuncClick(give_feedback_contact_us, elementText);
				mobileAction.waitProgressBarVanish();
			} catch (Exception e1) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
		}
	}

	public void ClickContactUs_CF() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.SwipeWithinElement("//android.support.v4.widget.DrawerLayout", 1, "down");
				String xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
						+ mobileAction.getAppString("contact_str") + "']";
				System.out.println("xpath:" + xpath);
				contactUs = mobileAction.verifyElementUsingXPath(xpath, "Contact Us");
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
			return;
		}
		try {
			String elementText = mobileAction.getValue(contactUs);
			System.out.println("Element Text:" + elementText);
			mobileAction.FuncClick(contactUs, elementText);
			mobileAction.waitProgressBarVanish();
		} catch (Exception e) {
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
				mobileAction.verifyTextEquality(home_button.getText(),
						mobileAction.getAppString("flyoutNavigationHeader"));
				mobileAction.verifyTextEquality(accounts_button.getText(),
						mobileAction.getAppString("str_My_Accounts"));
				mobileAction.verifyTextEquality(transfers.getText(),
						mobileAction.getAppString("flyoutNavigationLinkTransfers"));
				mobileAction.verifyTextEquality(bills.getText(),
						mobileAction.getAppString("flyoutNavigationLinkBills"));
				mobileAction.verifyTextEquality(tdMySpend.getText(),
						mobileAction.getAppString("nav_drawer_items_moven"));
				mobileAction.verifyTextEquality(mobile_Deposit_button.getText(),
						mobileAction.getAppString("flyoutNavigationLinkMobileDeposit"));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("str_HOME") + "']",
						"Home");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("contact_str") + "']",
						"Contact Us");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
										+ mobileAction.getAppString("ActionBar_MobileDeposit") + "']",
								"Mobile Deposit");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("str_CrossBorder") + "']",
						"Cross Border Banking");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("str_My_Accounts") + "']",
						"My Accounts");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("bills_str") + "']",
						"Bills");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("transfers_str") + "']",
						"Transfers");
			}
		} catch (IOException | NoSuchElementException e) {
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
	 * @author Ashraf This method will click on the Investing Accounts button on
	 *         menu page
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

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}

	}

}
