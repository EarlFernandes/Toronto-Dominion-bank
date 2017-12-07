package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.td.StringArray;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeScreen extends _CommonPage {

	private static HomeScreen HomeScreen;

	@iOSFindBy(xpath = "//*[@name='NavRowsWidgetTableViewCell_0_1']/*[@label='Bills' or @label='Factures' or @label='账单' or @label='賬單']")
	@AndroidFindBy(xpath = "//*[@text='Bills' or @text='Factures' or @text='账单' or @text='賬單']")
	private MobileElement bills;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Bills' or @label='Factures' or @label='账单' or @label='賬單']")
	@AndroidFindBy(xpath = "//*[@text='Bills' or @text='Factures' or @text='账单' or @text='賬單']")
	private MobileElement bills_182;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Open a Bank Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Open a Bank Account']")
	private MobileElement newAccount;

	@iOSFindBy(xpath = "//*[@label='Accounts' or @label='Comptes' or @label='汇款' or @label='匯款']")
	@AndroidFindBy(xpath = "//*[@text='Accounts' or @text='Comptes' or @text='汇款' or @text='匯款']")
	private MobileElement my_accounts;

	@iOSFindBy(xpath = "//*[@name='NavRowsWidgetTableViewCell_0_0']/*[@label='Transfers' or @label='Virements' or @label='转账' or @label='轉賬']")
	@AndroidFindBy(xpath = "//*[@text='Transfers' or @text='Virements' or @text='转账' or @text='轉賬']")
	private MobileElement transfers;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transfers' or @label='Virements' or @label='转账' or @label='轉賬']")
	@AndroidFindBy(xpath = "//*[@text='Transfers' or @text='Virements' or @text='转账' or @text='轉賬']")
	private MobileElement transfers_182;

	@iOSFindBy(xpath = "//*[@name='NavRowsWidgetTableViewCell_0_1']/*[@label='Markets' or @label='Marchés' or @label='市场' or @label='市場']")
	@AndroidFindBy(xpath = "//*[@text='Markets' or @text='Marchés' or @text='市场' or @text='市場']")
	private MobileElement markets;

	@iOSFindBy(xpath = "//*[@label='TRANSFER' or @label='VIREMENT' or @label='转账' or @label='轉賬']")
	@AndroidFindBy(xpath = "//*[@text='TRANSFER' or @text='VIREMENT' or @text='转账' or @text='轉賬']")
	private MobileElement transfer_button_dashboard;

	@iOSFindBy(xpath = "//*[@name='NAVIGATION_ITEM_QUICK_ACCESS' or @name='QuickLinkRightNavButton']")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/easy_access' or @resource-id='com.td:id/easy_access_button']")
	private MobileElement quickAccess;

	@iOSFindBy(xpath = "//*[contains(@label,'Investing') or contains(@label,'Comptes Placements')]") // @Author
																										// -
																										// Sushil
																										// 19-Apr-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Investing Accounts' or contains(@text,'Comptes Placements')) and @resource-id='com.td:id/navText']")
	MobileElement investing_button;

	@iOSFindBy(xpath = "//*[@label='TRADE' or @label='NÉGOCIATION' or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[@text='TRADE' or @text='Négociation' or @text='交易' or @text='交易']")
	private MobileElement trade;

	@iOSFindBy(xpath = "//*[@label='Find Locations' or @label='Trouver une succursale' or @label='查找分行' or @label='查找分行']")
	@AndroidFindBy(xpath = "//*[@text='Find Locations' or @text='Trouver une succursale' or @text='查找分行' or @text='查找分行']")
	private MobileElement locations;
	private MobileElement dashboard_Location;

	@iOSFindBy(xpath = "//*[@label='DEPOSIT' or @label='DÉPÔT' or @label='存款' or @label='存款']")
	@AndroidFindBy(xpath = "//*[@text='DEPOSIT' or @text='DÉPÔT' or @text='存款' or @text='存款']")
	private MobileElement deposit;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Investing')]") // @Author
																					// -
																					// Sushil
																					// 21-Apr-2017
																					// modified
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Investing Accounts' or @text='Comptes Placements directs TD')]")
	private MobileElement InvestingHamburgeMenu;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Logout']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Logout']")
	private MobileElement logout;

	@iOSFindBy(xpath = "//*[@label='SEND MONEY' or @label='ENVOI DE FONDS' or @label='汇款' or @label='匯款']")
	@AndroidFindBy(xpath = "//*[@text='SEND MONEY' or contains(@text,'ENVOI') or @text='汇款' or @text='匯款']")
	private MobileElement send_money_button;

	@iOSFindBy(xpath = "//*[@label='QUOTE' or @label='COTE' or @label='报价' or @label='報價']")
	@AndroidFindBy(xpath = "//*[@text='QUOTE' or @text='COTE' or @text='报价' or @text='報價']")
	private MobileElement quote;

	@iOSFindBy(xpath = "//*[@label='Privacy, Security & Legal' or @label='Confidentialité, sécurité et avis juridique' or @label='隐私、安全与法律声明' or @label='私隱政策、安全性和法律聲明']")
	@AndroidFindBy(xpath = "//*[@text='Privacy, Security & Legal' or @text='Confidentialité, sécurité et avis juridique' or @text='隐私、安全与法律声明' or @text='私隱政策、安全性和法律聲明']")
	private MobileElement privacy;

	@iOSFindBy(xpath = "//*[@label='Find Locations' or @label='Trouver une succursale' or @label='查找分行' or @label='查找分行']")
	@AndroidFindBy(xpath = "//*[@text='Find Locations' or @text='Trouver une succursale' or @text='查找分行' or @text='查找分行']")
	private MobileElement locationheader;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]//XCUIElementTypeCell[1]/XCUIElementTypeButton[7]")
	private MobileElement Watchlists;

	@iOSFindBy(xpath = "//*[@label='Trade' or @label='NÉGOCIATION' or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation' or @text='交易' or @text='交易']")
	private MobileElement clickmenu_trade;

	@iOSXCUITFindBy(accessibility = "QUICKLINKS_MOBILEPAYMENT")
	@AndroidFindBy(id = "com.td:id/mpay_dashboard")
	private MobileElement pay_now_button;

	@iOSFindBy(xpath = "//*[@name='NAVIGATION_ITEM_QUICK_ACCESS' or @name='QuickLinkRightNavButton']")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/easy_access' or @resource-id='com.td:id/easy_access_button']")
	private MobileElement home_bar; // use quickaccess button to verify homepage

	@iOSFindBy(xpath = "//*[@label='Contact Us' or @label='Contacter nous' or @label='联系我们' or @label='聯絡我們']")
	@AndroidFindBy(xpath = "//*[@text='Contact Us' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們']")
	private MobileElement contact_us;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='TD Mobile Payment']")
	private MobileElement tdMobilePayment;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[@label='Apple Pay']")
	private MobileElement applePayBtn;

	int i = 1;
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeButton[1]";
	String Finalpart = Firstpart + i + Secondpart;

	public synchronized static HomeScreen get() {
		if (HomeScreen == null) {
			HomeScreen = new HomeScreen();
		}
		return HomeScreen;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	/**
	 * This method will click on the bill button on home page
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
	public void clickBill() {

		try {
			Decorator();
			if (mobileAction.verifyElementIsPresent(bills)) {
				mobileAction.FuncClick(bills, "Bills");
			} else {
				mobileAction.FuncClick(bills_182, "Bills");
			}
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
	 * This method will click on the bill button on home page
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
	public void clickAccounts() {

		try {
			Decorator();
			mobileAction.FuncClick(bills, "Bills");
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
	 * This method will click on the Market button on home page
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
	public void clickMarkets() {

		try {
			Decorator();
			mobileAction.FuncClick(markets, "Markets");
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
	 * This method will click on the Watchlists button on home page
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
	public void clickWatchLists() {

		try {
			Decorator();

			mobileAction.FuncClick(Watchlists, "Watchlists");
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
	 * This method will click on the quick access button on home page
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
	public void clickQuickAccess() {

		try {
			Decorator();
			mobileAction.FuncClick(quickAccess, "Quick Access");
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
	 * This method will click on the My Accounts button on home page
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
	public void clickMyAccounts() {
		try {
			Decorator();

			mobileAction.FuncClick(my_accounts, "My Accounts");

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

	String accountno = "//*[contains(@label,'" + "AS12345" + "')]";

	/**
	 * This method will click on the Menu button on home page
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
	public void clickMenu() {
		try {
			Decorator();

			// FIXED removed back button
			mobileAction.clickMenuButton();

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
	 * This method will click on the Menu button on home page
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
	public void clickMenu_french() {
		try {
			Decorator();
			mobileAction.clickMenuButton();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on the Transfers button on home page
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
	public void clickTransfers() {
		try {
			Decorator();
			if (mobileAction.verifyElementIsPresent(transfers)) {
				mobileAction.FuncClick(transfers, "Transfers");
			} else {
				mobileAction.FuncClick(transfers_182, "Transfers");
			}

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
	 * This method will click on the Deposit button on home page
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
	public void clickDeposit() {
		try {
			Decorator();
			mobileAction.FuncClick(deposit, "Deposit");
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
	 * This method will click on the Trade button on home page
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
	public void clickTrade() {
		try {
			Decorator();
			if (mobileAction.verifyElementIsPresent(trade)) {
				mobileAction.FuncClick(trade, "Trade");
			} else {
				mobileAction.SwipeQuickLinks(200, 200);
				mobileAction.FuncClick(trade, "Trade");
			}
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
	 * This method will click on the Transfers button on dashboard page
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
	public void clickDashboardTransfers() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				String labelText = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRANSFER);
				transfer_button_dashboard = mobileAction.verifyElementUsingXPath("//*[@label='" + labelText + "']",
						"Transfer Quick Link");
			}

			mobileAction.FuncClick(transfer_button_dashboard, "TRANSFER");
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
	 * This method will click on the Transfers button on dashboard page
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
	public void clickInvesting() {
		Decorator();
		try {
			mobileAction.FuncClick(investing_button, "Investing");
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
	 * This method will click on the Transfers button on home page in French
	 * language
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
		try {
			Decorator();
			mobileAction.FuncClick(transfers, "VIREMENTS");
			mobileAction.FuncClickBackButton();
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
	 * This method will click on the send money quick link present on the
	 * homescreen.
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
	public void sendMoney() {
		try {
			Decorator();
			mobileAction.FuncClick(send_money_button, "sendMoney");
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
	 * This method will click on the Back button
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
	public void back_button() {

		Decorator();
		try {
			Thread.sleep(2500);
			mobileAction.ClickBackButton();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on the Back button
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
	public void clickbackBtnLnk() {
		int symbolMiddleY = 0;
		Decorator();
		try {
			Thread.sleep(5000);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String symbolSearch = "//XCUIElementTypeStaticText[contains(@label,'" + getTestdata("Search") + "')]";
				MobileElement symbolSearchVal = mobileAction.mobileElementUsingXPath(symbolSearch);
				int leftX = symbolSearchVal.getLocation().getX();
				int rightX = leftX + symbolSearchVal.getSize().getWidth();
				int middleX = (rightX + leftX) / 2;
				int upperY = symbolSearchVal.getLocation().getY();
				int lowerY = upperY + symbolSearchVal.getSize().getHeight();
				int middleY = (upperY + lowerY) / 2;
				symbolMiddleY = middleY;
				mobileAction.TapCoOrdinates(30, symbolMiddleY, "Back Button");
			} else {

				mobileAction.FuncClickBackButton();
			}

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
	 * This method will click on the locations from the flyout menu
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

	public void flyoutMenu_Locations() {
		Decorator();
		try {
			mobileAction.FuncClick(dashboard_Location, "Locations");
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(locationheader, "Find Locations header present");
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
	 * This method will click investing button from the hamburger menu. language
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
	public void clickInvestingFromHamburger() {

		Decorator();

		try {

			mobileAction.FuncClick(InvestingHamburgeMenu, "Investing button clicked");
			Thread.sleep(1000);
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
	 * This method will click investing button from the hamburger menu. language
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
	public void verifyFlyOut_Home() {

		Decorator();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.ClickBackButton();
			}
			mobileAction.clickMenuButton();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify the Dashboard Authentication
	 * 
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
	public void dashboardAuthentication() {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.ClickBackButton();
			}

			mobileAction.clickMenuButton();
			mobileAction.verifyElementIsDisplayed(logout, "Logout");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will verify whether the user is unauntheticated
	 * 
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
	public void dashboardUnAuthentication() {

		Decorator();

		try {

			mobileAction.verifyElementNotPresent(logout, "Logout");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will click on the Privacy,Security and Legal button on home
	 * page
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
	public void clickPrivacy_Security() {
		try {
			Decorator();
			mobileAction.FunCnewSwipe(privacy, false, 1);
			mobileAction.FuncClick(privacy, "Privacy,Security and Legal");
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

	public void menuTradeEasyWebCustomer() throws Exception {

		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(clickmenu_trade)) {
				try {
					CL.GetReporting().FuncReport("Fail", "Trade is Present");
				} catch (IOException e) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
			} else {
				try {
					CL.GetReporting().FuncReport("Pass", "Trade is not Present");
				} catch (IOException e) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
			}
			// mobileAction.verifyElementNotPresent(clickmenu_trade, "Menu
			// Trade");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void menuTradePresent() throws Exception {

		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(clickmenu_trade)) {
				try {
					CL.GetReporting().FuncReport("Pass", "Trade is Present");
				} catch (IOException e) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
			} else {
				try {
					CL.GetReporting().FuncReport("Fail", "Trade is not Present");
				} catch (IOException e) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
			}
			// mobileAction.verifyElementNotPresent(clickmenu_trade, "Menu
			// Trade");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void clickPayNow() {
		try {
			Decorator();
			mobileAction.FuncClick(pay_now_button, "Pay Now");
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

	/**
	 * This method will click TD Mobile Payment button from the menu. language
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
	public void clickt_tdmobilepayment() {

		Decorator();

		try {

			mobileAction.FuncClick(tdMobilePayment, "TD Mobile Payment clicked");

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
	 * This method will click Apple Pay Button on the dashboard page
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

		Decorator();

		try {
			mobileAction.FuncClick(applePayBtn, "Apple Pay");

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
	 * This method will verify the Home title on the dashboard page
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
	public void VerifyHomePageDashBoard() {
		Decorator();

		try {
			/*
			 * if
			 * (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase(
			 * "android")) {
			 * 
			 * mobileAction.FuncScrollIntoView(pay_now_button,
			 * "Pay Now button");
			 * mobileAction.verifyElementIsDisplayed(pay_now_button,
			 * "Pay Now button");
			 * mobileAction.verifyElementTextContains(pay_now_button,
			 * getTextInCurrentLocale(StringArray.
			 * ARRAY_HOMESCREEN_DASHBOARD_PAYNOW)); } else {
			 * 
			 * mobileAction.verifyElementIsDisplayed(pay_now_button,
			 * "Apple Pay button");
			 * mobileAction.verifyElementTextContains(pay_now_button,
			 * getTextInCurrentLocale(StringArray.
			 * ARRAY_DASHBOARD_FLYOUT_APPLEPAY)); }
			 */

			if (mobileAction.verifyElementIsPresent(home_bar)) {
				mobileAction.Report_Pass_Verified("Home View");
			} else {
				mobileAction.Report_Fail("Home View not verified");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
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

	/**
	 * This method will click on the open new account button on home page
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
	public void clickOpenNewAccount() {
		try {
			Decorator();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				newAccount = mobileAction.verifyElementUsingXPath(
						"//*[@name='" + mobileAction.getAppString("str_banking_cross_sell_message") + "']",
						"Opne a bank account");
			} else {
				newAccount = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("str_banking_cross_sell_message") + "']",
						"Opne a bank account");
			}
			mobileAction.FuncClick(newAccount, "New Bank Account");

		} catch (Exception e) {
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
	}

	public void ClickContactUsFromHomePage() {
		Decorator();

		try {
			mobileAction.FuncSwipeWhileElementNotFound(contact_us, true, 5, "up");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the Menu button on home page
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

	public void clickAccountsTab() {
		try {
			Decorator();

			mobileAction.FuncClick(my_accounts, "Accounts");

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
	 * This method will verify text within elements for the home screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyHomeScreenTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				final String accounts = mobileAction.getAppString("easy_access_accounts").toLowerCase().substring(0, 1)
						.toUpperCase() + mobileAction.getAppString("str_Accounts").toLowerCase().substring(1);
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + accounts + "']",
						"Accounts");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("transfers_str") + "']",
				// "Transfers");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("bills_str") + "']",
				// "Bills");
				if (mobileAction.verifyElementIsPresent(transfers)) {
					mobileAction.Report_Pass_Verified("Transfer");
				} else if (mobileAction.verifyElementIsPresent(transfers_182)) {
					mobileAction.Report_Pass_Verified("Transfer");
				} else {
					mobileAction.Report_Fail_Not_Verified("Transfer");
				}

				if (mobileAction.verifyElementIsPresent(bills)) {
					mobileAction.Report_Pass_Verified("Bills");
				} else if (mobileAction.verifyElementIsPresent(bills_182)) {
					mobileAction.Report_Pass_Verified("Bills");
				} else {
					mobileAction.Report_Fail_Not_Verified("Bills");
				}

				final String xPathFooter = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("contact_str") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 4, "up");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("dashboard_nearest_branch_lbl") + "' or @value='"
						+ mobileAction.getAppString("dashboard_branch_lbl") + "']", "Nearest Branch");

				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("markets_str") + "']",
				// "Markets");

			} else {
				final String accounts = mobileAction.getAppString("easy_access_accounts").toLowerCase().substring(0, 1)
						.toUpperCase() + mobileAction.getAppString("easy_access_accounts").toLowerCase().substring(1);
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + accounts + "']",
						"Accounts");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("transfers_str") + "']", "Transfers");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("bills_str") + "']", "Bills");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("td_moneyfit_header") + "']", "TD My Spend");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("TDZonesNavRowHeader") + "']", "TD For Me");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ getTextInCurrentLocale(StringArray.ARRAY_INVESTING_ACCOUNTS) + "']",
						"Investing Accounts");
				final String xPathFooter = "//android.widget.TextView[@resource-id='com.td:id/dashboard_terms']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 4, "up");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("contact_str") + "']",
						"Contact Us");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("terms_of_use") + "']",
						"Terms of Use");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("dashboard_nearest_branch_label") + "' or @text='"
						+ mobileAction.getAppString("dashboard_find_locations") + "']", "Nearest Branch");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("markets_str") + "']", "Markets");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title'
				// and @text='" + mobileAction.getAppString("trade_str") + "']",
				// "Trade");
			}
		} catch (Exception e) {
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
	 * This method will verify text within elements for the home screen
	 * dashboard buttons
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyHomeScreenDashboardButtonsTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// mobileAction.verifyTextEquality(send_money_button.getText(),
				// mobileAction.getAppString("str_dashboard_quick_link_send_money"));
				// mobileAction.verifyTextEquality(transfer_button_dashboard.getText(),
				// mobileAction.getAppString("homeDashboardBankingRowTransfersTitle"));
				// mobileAction.verifyTextEquality(deposit.getText(),
				// mobileAction.getAppString("str_DEPOSIT"));
				mobileAction.SwipeWithinElement("//XCUIElementTypeCell[1]", 2, "left");

			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/send_money_dashboard' and @text='"
								+ mobileAction.getAppString("str_dashboard_quick_link_send_money") + "']",
						"Send Money Button");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='"
								+ mobileAction.getAppString("str_TRANSFER") + "']",
						"Transfer Button");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/mpay_dashboard'
				// and @text='" +
				// mobileAction.getAppString("str_dashboard_quick_link_pay_now")
				// + "']", "Pay Now Button");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/mrdc_dashboard'
				// and @text='" +
				// mobileAction.getAppString("str_dashboard_quick_link_deposit")
				// + "']", "Deposit Button");
				// mobileAction.SwipeWithinElement("//android.widget.HorizontalScrollView",
				// 2, "left");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/watchlist_dashboard'
				// and @text='" +
				// mobileAction.getAppString("str_dashboard_quick_link_watchlist")
				// + "']", "Watchlists Button");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/quote_dashboard'
				// and @text='" +
				// mobileAction.getAppString("str_dashboard_quick_link_quote") +
				// "']", "Quote Button");
			}
		} catch (Exception e) {
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

}
