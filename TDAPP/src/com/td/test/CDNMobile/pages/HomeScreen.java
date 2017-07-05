package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.td.StringLookup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomeScreen extends _CommonPage {

	private static HomeScreen HomeScreen;

	@iOSFindBy(accessibility ="NAVIGATION_ITEM_MENU")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up' and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Bills']")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@resource-id='com.td:id/title' or @resource-id='com.td:id/navText') and @text='Bills']")
	private MobileElement bills;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Open a Bank Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Open a Bank Account']")
	private MobileElement newAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Accounts']")
	private MobileElement my_accounts;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfers' or @text='Virments']")
	private MobileElement transfers;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Markets']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Markets' or @content-desc='Markets']")
	private MobileElement markets;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='TRANSFER']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='TRANSFERS']")
	private MobileElement transfer_button_dashboard;

	@iOSFindBy(accessibility = "NAVIGATION_ITEM_QUICK_ACCESS")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access']")
	private MobileElement quickAccess;

/*	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Investing Accounts']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access' and (@text='Investing Accounts' or @text='Comptes Placements directs TD')]")
	private MobileElement investing_button;*/
	
	@iOSFindBy(xpath = "//*[contains(@label,'Investing') or contains(@label,'Comptes Placements')]") //@Author - Sushil 19-Apr-2017
	@AndroidFindBy(xpath="//android.widget.TextView[(@text='Investing Accounts' or contains(@text,'Comptes Placements')) and @resource-id='com.td:id/navText']")
	MobileElement  investing_button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'TRADE')]")
	@AndroidFindBy(xpath = "//android.widget.TableRow[@text='TRADE']")
	private MobileElement trade;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='VIREMENTS'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='VIREMENTS']")
	private MobileElement french_transfers;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Locations']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Locations']")//Changed by Rashmi
	private MobileElement dashboard_Location;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='TD For Me']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TD for Me']")//Changed by Rashmi
	private MobileElement TD_For_Me;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='DEPOSIT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mrdc_dashboard' and @text='DEPOSIT']")
	private MobileElement deposit;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/your_location_text_view']")
	private MobileElement nearByLoaction;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/viewing_text_view' and @text='Nearby']")
	private MobileElement viewingDetail;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/chevron_button_up']")
	private MobileElement chevron_Button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/zone_name'][1]")
	private MobileElement zone_Name;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @enabled='true']")
	private MobileElement zone_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Investing')]")//@Author - Sushil 21-Apr-2017 modified
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Investing Accounts' or @text='Comptes Placements directs TD')]")
	private MobileElement InvestingHamburgeMenu;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Logout']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement logout;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@value='SEND MONEY']")
	private MobileElement send_money_button;

	@iOSFindBy(accessibility = "QUICK_ACCESS_ITEM_QUOTE")
	private MobileElement quote;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Privacy, Security & Legal') or contains(@value,'Privacy, Security & Legal')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Privacy, Security & Legal']")
	private MobileElement privacy;

	@iOSFindBy(xpath = "//*[@label='背面' or @label='返回' or @label='Back']")
	private MobileElement back_button;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Locations']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Locations']")
	private MobileElement location;

	@iOSFindBy(xpath = "//*[@value='Find Locations']")
	@AndroidFindBy(xpath = "//*[@text='Find Locations']")
	private MobileElement locationheader;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]//XCUIElementTypeCell[1]/XCUIElementTypeButton[7]")
	private MobileElement Watchlists;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Trade']")
	private MobileElement clickmenu_trade;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='PAY NOW']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mpay_dashboard' and @text='PAY NOW']")
	private MobileElement pay_now_button;
	
	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title'and @index='0']")
	private MobileElement home_bar;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Contact Us' or @label='Contactez-nous']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/contact_us_tile']/android.widget.TextView")
	private MobileElement contact_us;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='TD Mobile Payment']")
	private MobileElement tdMobilePayment;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[@label='Apple Pay']")
	private MobileElement applePayBtn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Accounts']")
	private MobileElement accounts;
	
	@iOSFindBy(xpath = "//*[@label='Select AccessCard']")
	//@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @content-desc='Username or Access Card']")
	@AndroidFindBy(id="com.td:id/loginEditText")
	private MobileElement select_accesscard;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/zones_feature_button' and @text='Continue']")
	private MobileElement continueBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/zones_feature_button' and @text='Get Started']")
	private MobileElement get_Started;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/acceptButton' and @text='Accept']")
	private MobileElement accept;
	
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
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

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
			mobileAction.FuncClick(bills, "Bills");
		}catch (NoSuchElementException e) {
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
	public void clickWatchLists()	 {

		try {
			Decorator();

			mobileAction.FuncClick(Watchlists, "Watchlists");
		}catch (NoSuchElementException e) {
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
			mobileAction.FuncClick(menu, "Menu");

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
			mobileAction.FuncClick(menu, "French_Menu");
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
			 if(mobileAction.verifyElementIsPresent(trade)){
	                mobileAction.FuncClick(trade, "Trade");
	            }else{
	                mobileAction.SwipeQuickLinks(200,200);
	                mobileAction.FuncClick(trade, "Trade");
	            }
		}catch (NoSuchElementException e) {
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
			mobileAction.FuncClick(transfer_button_dashboard, "TRANSFER");
		}catch (NoSuchElementException e) {
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
			mobileAction.FuncClick(french_transfers, "VIREMENTS");
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

	public void sendMoney() {
		try {
			Decorator();
			WebDriverWait wait = new WebDriverWait(CL.GetDriver(), 100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[contains(@label,'The right mortgage can save you money')]")));
			mobileAction.FuncClick(send_money_button, "sendMoney");
		}catch (NoSuchElementException e) {
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
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(back_button, "BACK");
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
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(locationheader, "Locations header not present");
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
	 * This method will click on the locations and verify the nearby locations
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
	public void verifyLocations() {
		Decorator();
		try {
			if(mobileAction.verifyElementIsPresent(continueBtn)){
				mobileAction.FuncClick(continueBtn, "Continue Button");
				mobileAction.FuncClick(get_Started, "Get Started");
				mobileAction.FuncClick(accept, "Accept Button");
				mobileAction.waitForElementToVanish(progressBar);
			}
			String location = mobileAction.getText(nearByLoaction);
			mobileAction.verifyElement(viewingDetail, "Nearby");
			mobileAction.FuncClick(chevron_Button, "Chevron Button");
			mobileAction.FunctionSwipe("Up", 100, 0);
			String addr = mobileAction.getText(zone_Name);
			mobileAction.FuncClick(zone_Name, "Zone Name");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElement(zone_Header, addr);

		}catch (NoSuchElementException e) {
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
		}catch (NoSuchElementException e) {
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

				mobileAction.FuncClick(back_button, "Back");
				mobileAction.FuncClick(menu, "Menu");

			} else {
				mobileAction.FuncClick(menu, "Menu");
			}

		}catch (NoSuchElementException e) {
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
				mobileAction.FuncClick(back_button, "Back Button");
			}

			mobileAction.FuncClick(menu, "Menu");
			mobileAction.verifyElementIsDisplayed(logout, "Logout");

		}catch (NoSuchElementException e) {
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

			boolean flag = mobileAction.verifyElementNotPresent(logout, "Logout");

		}catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}catch (Exception e) {
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
	public void clicklocation() {

		Decorator();

		try {

			mobileAction.FuncClick(location, "Location");
			String verifylocation = "Location Header Verified";
			mobileAction.verifyElementIsDisplayed(locationheader, verifylocation);

		}catch (NoSuchElementException e) {
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

	public void clickmenu_trade() {

		Decorator();
		try {
			mobileAction.FuncClick(clickmenu_trade, "Click Menu Trade");
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
		}catch (NoSuchElementException e) {
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
			mobileAction.verifyElementNotPresent(clickmenu_trade, "Menu Trade");
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

		}catch (NoSuchElementException e) {
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

		}catch (NoSuchElementException e) {
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
	public void VerifyHomePageDashBoard(){
		Decorator();
		
//		try{
//			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
//				//for android, keep the home_bar as defined  
//			}else{
//				String xpath = "//*[@label='" + mobileAction.getAppString("home") + "']";
//				System.out.println("xpath:" +  xpath);
//				home_bar = mobileAction.verifyElementUsingXPath(xpath, "Home");
//			}
//		}catch (NoSuchElementException | IOException e) {
//			try {
//				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
//			} catch (IOException ex) {
//				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
//			}
//			System.err.println("TestCase has failed.");
//			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
//			return;
//		}
		
		try{
			String hometitle="";
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				hometitle= mobileAction.getValue(home_bar);
				System.out.println("hometitle:" +  hometitle);
				mobileAction.verifyElementTextIsDisplayed(home_bar, "Home | Accueil");
			}else{
				hometitle = home_bar.getAttribute("name");
				System.out.println("hometitle:" +  hometitle);
				String ExpectedString ="HomeView | HomeView";
				if(ExpectedString.contains(hometitle)){
					mobileAction.Report_Pass_Verified(hometitle);
				}else{
					mobileAction.Report_Fail_Not_Verified(hometitle);
				}
			}
			
		}catch (Exception e){
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
				newAccount = mobileAction.verifyElementUsingXPath("//*[@name='" + mobileAction.getAppString("str_banking_cross_sell_message") + "']", "Opne a bank account");
			} else {
				newAccount = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("str_banking_cross_sell_message") + "']", "Opne a bank account");
			}
			mobileAction.FuncClick(newAccount, "New Bank Account");

		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}
	public void ClickContactUsFromHomePage(){
		Decorator();
		//MobileElement contactUs = null;
		String homeTable ="";
		try{
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){

				mobileAction.SwipeWithinElement("//android.widget.ScrollView",  1, "down");
			}else{
				//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable
				//homeTable = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther";
				mobileAction.FuncSwipeOnce("up");
			}
		}catch ( Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		try{
			String elementText= mobileAction.getValue(contact_us);
			System.out.println("Element Text:" +  elementText);
			mobileAction.FuncClick(contact_us, elementText);
		}catch (Exception e){
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

			mobileAction.FuncClick(accounts, "Accounts");

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
				final String accounts = mobileAction.getAppString("easy_access_accounts").toLowerCase().substring(0,1).toUpperCase() + mobileAction.getAppString("str_Accounts").toLowerCase().substring(1);
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + accounts + "']", "Accounts");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("transfers_str") + "']", "Transfers");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("bills_str") + "']", "Bills");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + StringLookup.lookupString(currentLocale, StringLookup.INVESTING_ACCOUNTS) + "']", "Investing Accounts");
				final String xPathFooter = "//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("contact_str") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 4, "up");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("dashboard_nearest_branch_lbl") + "' or @value='" + mobileAction.getAppString("dashboard_branch_lbl") + "']", "Nearest Branch");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("markets_str") + "']", "Markets");
	
			} else {
				final String accounts = mobileAction.getAppString("easy_access_accounts").toLowerCase().substring(0,1).toUpperCase() + mobileAction.getAppString("easy_access_accounts").toLowerCase().substring(1);
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + accounts + "']", "Accounts");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("transfers_str") + "']", "Transfers");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("bills_str") + "']", "Bills");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("td_moneyfit_header") + "']", "TD My Spend");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("TDZonesNavRowHeader") + "']", "TD For Me");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + StringLookup.lookupString(currentLocale, StringLookup.INVESTING_ACCOUNTS) + "']", "Investing Accounts");
				final String xPathFooter = "//android.widget.TextView[@resource-id='com.td:id/dashboard_terms']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 4, "up");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("contact_str") + "']", "Contact Us");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("terms_of_use") + "']", "Terms of Use");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("dashboard_nearest_branch_lbl") + "' or @text='" + mobileAction.getAppString("dashboard_find_locations") + "']", "Nearest Branch");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("markets_str") + "']", "Markets");
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("trade_str") + "']", "Trade");
			}
		} catch (Exception e) {
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
	 * This method will verify text within elements for the home screen dashboard buttons
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
	//			mobileAction.verifyTextEquality(send_money_button.getText(), mobileAction.getAppString("str_dashboard_quick_link_send_money"));
	//			mobileAction.verifyTextEquality(transfer_button_dashboard.getText(), mobileAction.getAppString("homeDashboardBankingRowTransfersTitle"));
	//			mobileAction.verifyTextEquality(deposit.getText(), mobileAction.getAppString("str_DEPOSIT"));
				mobileAction.SwipeWithinElement("//XCUIElementTypeCell[1]", 2, "left");
				// FIXME: Watchlists is not an accessibility identifier, Ask May
				// FIXME: Quote is not an accessibility id, ask may
				//mobileAction.verifyTextEquality(quote.getText(), mobileAction.getAppString("str_QUOTE"));
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/send_money_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_send_money") + "']", "Send Money Button");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='" + mobileAction.getAppString("str_TRANSFER") + "']", "Transfer Button");
	//			mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/mpay_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_pay_now") + "']", "Pay Now Button");
	//			mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/mrdc_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_deposit") + "']", "Deposit Button");
	//			mobileAction.SwipeWithinElement("//android.widget.HorizontalScrollView", 2, "left");
	//			mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/watchlist_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_watchlist") + "']", "Watchlists Button");
	//			mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/quote_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_quote") + "']", "Quote Button");
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
