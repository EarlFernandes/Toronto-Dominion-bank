package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
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

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Menu' or @label='Menu en en-tête']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//*[@label='Bills']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Bills']")
	private MobileElement bills;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Accounts']")
	private MobileElement my_accounts;

	@iOSFindBy(xpath = "//*[@label='Transfers' or @label='Virments']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' or @text='Transfers' or @text='Virments']")
	private MobileElement transfers;

	@iOSFindBy(xpath = "//*[@label='Markets']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Transfers']")
	private MobileElement markets;

	@iOSFindBy(xpath = "//*[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='TRANSFERS']")
	private MobileElement transfer_button_dashboard;

	@iOSFindBy(xpath = "//*[@label='Quick Access']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access']")
	private MobileElement quickAccess;

	@iOSFindBy(xpath = "//*[@label='Investing Accounts']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access' and @text='Investing Accounts']")
	private MobileElement investing_button;

	@iOSFindBy(xpath = "//*[contains(@label,'TRADE')]")
	@AndroidFindBy(xpath = "//android.widget.TableRow[@text='TRADE']")
	private MobileElement trade;

	@iOSFindBy(xpath = "//*[@label='VIREMENTS'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='VIREMENTS']")
	private MobileElement french_transfers;

	@iOSFindBy(xpath = "//*[@label='TD for Me']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/td_zones_dashboard' and @text='TD FOR ME']")
	private MobileElement dashboard_Location;

	@iOSFindBy(xpath = "//*[@label='TD For Me']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='TD for Me']")
	private MobileElement TD_For_Me;

	@iOSFindBy(xpath = "//*[@label='In progress'] ")
	private MobileElement progressBarIos;

	@iOSFindBy(xpath = "//*[@label='DEPOSIT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mrdc_dashboard' and @text='DEPOSIT']")
	private MobileElement deposit;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/your_location_text_view']")
	private MobileElement nearByLoaction;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/viewing_text_view' and @text='Nearby']")
	private MobileElement viewingDetail;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/chevron_button_up']")
	private MobileElement chevron_Button;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/zone_name'][1]")
	private MobileElement zone_Name;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @enabled='true']")
	private MobileElement zone_Header;

	@iOSFindBy(xpath = "//*[@label='Investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Investing']")
	private MobileElement InvestingHamburgeMenu;

	@iOSFindBy(xpath = "//*[@label='Logout']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement logout;

	String progressBar = "//android.widget.ProgressBar[@resource-id='android:id/progress' and @enabled='true']";

	@iOSFindBy(xpath = "//*[@value='SEND MONEY']")
	private MobileElement send_money_button;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Privacy, Security & Legal']")
	private MobileElement privacy;

	@iOSFindBy(xpath = "//*[@label='Back']")
	private MobileElement back_button;

	@iOSFindBy(xpath = "//*[@label='Locations']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Locations']")
	private MobileElement location;

	@iOSFindBy(xpath = "//*[@label='Find Locations']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Find Locations']")
	private MobileElement locationheader;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]//XCUIElementTypeCell[1]/XCUIElementTypeButton[7]")
	private MobileElement Watchlists;

	@iOSFindBy(xpath = "//*[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='']")
	private MobileElement clickmenu_trade;

	@iOSFindBy(xpath = "//*[@label='PAY NOW']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mpay_dashboard' and @text='PAY NOW']")
	private MobileElement pay_now_button;

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
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	public void clickWatchLists() throws Exception {

		try {
			Decorator();

			mobileAction.FuncClick(Watchlists, "Watchlists");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
	public void clickMenu() {
		try {
			Decorator();
			mobileAction.FuncClick(menu, "Menu");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
	public void clickMenu_french() {
		try {
			Decorator();
			mobileAction.FuncClick(menu, "French_Menu");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
			mobileAction.verifyElementIsDisplayed(trade, "TRADE");
			mobileAction.FuncClick(trade, "Trade");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void sendMoney() {
		try {
			Decorator();
			WebDriverWait wait = new WebDriverWait(CL.GetDriver(), 100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[contains(@label,'The right mortgage can save you money')]")));
			mobileAction.FuncClick(send_money_button, "sendMoney");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
			Thread.sleep(5000);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(back_button, "BACK");
			} else {

				mobileAction.FuncClickBackButton();
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

			String PlatformName = "";
			if (PlatformName.equalsIgnoreCase("")) {

				mobileAction.FuncClick(dashboard_Location, "TD Zone Dashboard");
				mobileAction.waitForElementToVanish(progressBarIos);
				mobileAction.verifyElement(TD_For_Me, "TD for Me");

			} else {

				AppiumDriver<WebElement> driver = ((AppiumDriver<WebElement>) CL.GetDriver());
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"//android.widget.TextView[@resource-id='com.td:id/td_zones_dashboard' and @text='TD FOR ME']")));
				mobileAction.FuncClick(dashboard_Location, "TD Zone Dashboard");
				// mobileAction.waitForElementToVanish(progressBarIos);a
				// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='android:id/action_bar_title'
				// and @text='TD for Me']")));
				mobileAction.verifyElement(TD_For_Me, "TD for Me");

			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
			String location = mobileAction.getText(nearByLoaction);
			mobileAction.verifyElement(viewingDetail, "Nearby");
			mobileAction.FuncClick(chevron_Button, "Chevron Button");
			mobileAction.FunctionSwipe("Up", 100, 0);
			String addr = mobileAction.getText(zone_Name);
			mobileAction.FuncClick(zone_Name, "Zone Name");
			mobileAction.waitForElementToDisappear(progressBar);
			mobileAction.verifyElement(zone_Header, addr);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		}

		catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		}

		catch (NoSuchElementException | InterruptedException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		}

		catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		}

		catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		}

		catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickmenu_trade() {

		Decorator();
		try {
			mobileAction.FuncClick(clickmenu_trade, "Click Menu Trade");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	public void clickPrivacy_Security() throws Exception {
		try {
			Decorator();
			mobileAction.FunCnewSwipe(privacy, false, 1);
			mobileAction.FuncClick(privacy, "Privacy,Security and Legal");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void menuTradeEasyWebCustomer() throws Exception {

		Decorator();
		try {
			mobileAction.verifyElementNotPresent(clickmenu_trade, "Menu Trade");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void clickPayNow() {
		try {
			Decorator();
			mobileAction.FuncClick(pay_now_button, "Pay Now");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		}

		catch (NoSuchElementException|InterruptedException|IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		}

		catch (NoSuchElementException|InterruptedException|IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
				// TODO: iOS elements
			} else {
				final String accounts = mobileAction.getAppString("easy_access_accounts").toLowerCase().substring(0,1).toUpperCase() + mobileAction.getAppString("easy_access_accounts").toLowerCase().substring(1);
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + accounts + "']", "Accounts");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("transfers_str") + "']", "Transfers");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("bills_str") + "']", "Bills");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("td_moneyfit_header") + "']", "TD My Spend");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("TDZonesNavRowHeader") + "']", "TD For Me");
				// FIXME: There is a whitespace in between the text in zh?
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("str_investing_cross_sell_message") + "']", "Open a direct investing account");
				// FIXME: Need to scroll down to see these
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("trade_str") + "']", "Trade");
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("markets_str") + "']", "Markets");
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='" + mobileAction.getAppString("contact_str") + "']", "Contact Us");
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
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/send_money_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_send_money") + "']", "Send Money Button");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='" + mobileAction.getAppString("str_TRANSFER") + "']", "Transfer Button");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/mpay_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_pay_now") + "']", "Pay Now Button");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/mrdc_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_deposit") + "']", "Deposit Button");
				// FIXME: Need to swipe the dashboard to get these elements in view
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/watchlist_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_watchlist") + "']", "Watchlists Button");
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/quote_dashboard' and @text='" + mobileAction.getAppString("str_dashboard_quick_link_quote") + "']", "Quote Button");
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

}
