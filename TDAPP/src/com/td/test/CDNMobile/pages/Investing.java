package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Investing extends _CommonPage {
	private static Investing Investing;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='TRADE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TRADE']")
	private MobileElement tradeicon;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Investing']")
	private MobileElement investing_header;

	@iOSFindBy(accessibility = "CROSSSELL_VIEWTITLE")
	private MobileElement investing_body_title;

	@iOSFindBy(accessibility = "CROSSSELL_MESSAGE")
	private MobileElement investing_body_msg;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Trade' or @text='Négociation') and @index='0']")
	private MobileElement trade;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Markets']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade' and @index='0']")
	private MobileElement markets;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Orders']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade' and @index='0']")
	private MobileElement order;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/contentLayout' and @index='0']")
	private MobileElement placedorder;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and (@text='Loading' or @text='Chargement')]")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Watchlists')]")
	@AndroidFindBy(xpath = "//android.widget.TableRow[@resource-id='com.td:id/watchlistRow']")
	private MobileElement watchLists;

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/summaryContent' and @index='0']")
	private MobileElement investingListView;

	@iOSFindBy(accessibility = "CROSSSELL_GOTO")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and contains(@text,'do this later on my computer')]")
	private MobileElement go_to_webbroker_button;

	@iOSFindBy(accessibility = "CROSSSELL_CALL")
	private MobileElement call_button;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Holdings']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade' and @index='0']")
	private MobileElement Holdings;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Go to WebBroker']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and @text='Go to WebBroker']")
	private MobileElement webBroker;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Open an account today for fast and convenient access to cash')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Open an account today for fast and convenient access to cash')]")
	private MobileElement errorMsg;

/*	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']")
	private MobileElement backButton;*/
	
	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") //@Author - Sushil 07-Mar-2017
	@AndroidFindBy(id="android:id/action_bar_title")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='My Accounts]")
	private MobileElement my_accounts;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Menu' or @label='Menu en en-tête']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='BANKING']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='BANKING']")
	private MobileElement account_Banking_header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
	private MobileElement trade_header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Watchlists']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Watchlists']")
	private MobileElement watchlists_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Markets']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Markets']")
	private MobileElement markets_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='My Accounts']")
	private MobileElement accounts_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement Backbtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Open an account today for fast and convenient access to cash whe')]")
	// @AndroidFindBy(xpath =
	// "//android.widget.TableRow[@resource-id='com.td:id/watchlistRow']")
	private MobileElement ErrorMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Watchlists')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Watchlists']")
	private MobileElement watchListsButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Your Watchlist is empty')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/first_line' and @text='Your Watchlist is empty.']")
	private MobileElement watchListsEmpty;
	
	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']") //@Author - Sushil 20-Apr-2017
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation']")
	private MobileElement Investing_Trade;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Investing') or contains(@label,'Placements directs')]") //@Author - Sushil 20-Apr-2017
	@AndroidFindBy(xpath = "//*[(contains(@text,'Investing') or contains(@text,'Placements directs')) and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrInvesting;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Home') or contains(@label,'Accueil')]") //@Author - Sushil 20-Apr-2017
	@AndroidFindBy(xpath = "//*[(contains(@text,'Home') or contains(@text,'Accueil')) and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrHome;
	
	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']") //@Author - Sushil 20-Apr-2017
	@AndroidFindBy(id = "com.td:id/trade_dashboard")
	private MobileElement trade_dashboard;
	

	String Investing_Table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]";
	String order_value = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/ XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + 1 + Secondpart;

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum']")
	private List <MobileElement> accountDefinition;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/footer_text']")
	private MobileElement mutualFundOfferedBy;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mf_link']")
	private MobileElement tdInvestmentServices;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/disclaimer_link']")
	private MobileElement tdDirectInvestment;
	
	public synchronized static Investing get() {
		if (Investing == null) {
			Investing = new Investing();
		}
		return Investing;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(7, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will click on the Trade button on Investing page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickTrade() {

		try {
			Decorator();
			mobileAction.waitForElementToVanish(progressBar);
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

	/**
	 * This method will click on the Markets button on Investing page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMarkets() {

		try {
			Decorator();
			Thread.sleep(2000);
			mobileAction.FunCnewSwipe(markets, false, 2);
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
	 * This method will verify the Investing Header is present or not
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyInvestingHeader()  {
		Decorator();
		try {
			String verify_investing = "Verifying Investing Page Header";
			mobileAction.verifyElementIsDisplayed(investing_header, verify_investing);
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
	 * This method will click on place order 
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void clickPlacedorder() {

		try {
			Decorator();

			if (platformName.equalsIgnoreCase("ios")) {
				String placeorder = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]";

				CL.GetDriver().findElement(By.xpath(placeorder)).click();
			} else {
				mobileAction.FuncClick(placedorder, "Placed order");
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
	 * This method will click the investing account from the investing page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void clickInvestingAccounts() {

		Decorator();

		try {
			String InvestingAccountsXL = getTestdata("FromAccount");
			String InvestingAccountsXpath = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
					+ InvestingAccountsXL + "')]";
			if (platformName.equalsIgnoreCase("ios")) {

				String investingacc_value = "//*[contains(@label,'" + InvestingAccountsXL + "')]";
				CL.GetDriver().findElement(By.xpath(investingacc_value)).click();
				mobileAction.waitForElementToVanish(progressBar);

			} else {

				mobileAction.FuncElementSwipeWhileNotFound(investingListView, InvestingAccountsXpath, 10, "down", true);
				mobileAction.waitForElementToVanish(progressBar);
			}
		}

		catch (NoSuchElementException e) {
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
	 * This method will click on the order 
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void clickOrder() {
		Decorator();
		try {

			mobileAction.FuncClick(order, "order");
			mobileAction.waitForElementToVanish(progressBar);
			MobileElement OrderVal = mobileAction.verifyElementUsingXPath(order_value,"Order");
			mobileAction.FuncClick(OrderVal, "ordervalue");
			mobileAction.waitForElementToVanish(progressBar);

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
	 * This method will click on the WatchList 
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void clickWatchLists() {
		Decorator();
		try {
			mobileAction.FuncClick(watchLists, "watchLists");
			mobileAction.waitForElementToVanish(progressBar);
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
	 * This method will click on the place order button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyAdvanceorderdetails() {

		try {
			Decorator();
			mobileAction.FuncClick(placedorder, "Placed order");
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
	 * This method will verify the WebBroker in investing page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyAccessToWBfunctionality() {
		try {
			Decorator();
			Thread.sleep(2000);
			String webbroker_button = "Go to Web Broker";
			mobileAction.verifyElementIsDisplayed(go_to_webbroker_button, webbroker_button);
			CL.GetReporting().FuncReport("Pass", "NO access to WB functionalities");
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
	 * This method will click on the Holdings Tab
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void clickHoldings()  {
		try {
			Decorator();
			mobileAction.FuncClick(Holdings, "Holdings");
			mobileAction.waitForElementToVanish(progressBar);
			//mobileAction.FunCSwipeandScroll(AAVSymbol, true);

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
	 * This method will verify the DI Accounts
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyDIAccounts() {
		try {
			Decorator();
			String diAccountXL = null;
			String diAccountXL2 = null;

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				diAccountXL = "//*[contains(@label,'" + CL.getTestDataInstance().getPrimaryAccount() + "')]";
				diAccountXL2 = "//*[contains(@label,'" + CL.getTestDataInstance().getSecondryAccount() + "')]";
			} else {
				diAccountXL = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
						+ CL.getTestDataInstance().getPrimaryAccount() + "']";
				diAccountXL2 = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
						+ CL.getTestDataInstance().getSecondryAccount() + "']";
			}
			mobileAction.verifyElementUsingXPath(diAccountXL, "The first DI Account");
			mobileAction.verifyElementUsingXPath(diAccountXL2, "The Second DI Account");

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
	 * This method will verify the PIA Accounts
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyPIAAccounts() {
		try {
			Decorator();
			String diAccountXL = null;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				diAccountXL = "//*[contains(@label,'" + CL.getTestDataInstance().getPrimaryAccount() + "')]";
			} else {
				diAccountXL = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
						+ CL.getTestDataInstance().getPrimaryAccount() + "']";
			}
			mobileAction.verifyElementUsingXPath(diAccountXL, "The PIA Account");

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
	 * This method will verify the Combined Accounts
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyCombinedAccounts() {
		try {
			Decorator();
			String diAccountXL = null;
			String diAccountXL2 = null;
			String diAccountXL3 = null;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				diAccountXL = "//*[contains(@label,'" + CL.getTestDataInstance().getPrimaryAccount() + "')]";
				diAccountXL2 = "//*[contains(@label,'" + CL.getTestDataInstance().getSecondryAccount() + "')]";
				diAccountXL3 = "//*[contains(@label,'" + getTestdata("FromAccount") + "')]";
			} else {
				diAccountXL = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
						+ CL.getTestDataInstance().getPrimaryAccount() + "']";
				diAccountXL2 = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
						+ CL.getTestDataInstance().getSecondryAccount() + "']";
				diAccountXL3 = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
						+ getTestdata("FromAccount") + "']";
			}

			mobileAction.verifyElementUsingXPath(diAccountXL, "The DI Account");
			mobileAction.changeToMobileElementAndSwipe(diAccountXL2, false);
			mobileAction.verifyElementUsingXPath(diAccountXL2, "The PIA Account");
			mobileAction.changeToMobileElementAndSwipe(diAccountXL3, false);
			mobileAction.verifyElementUsingXPath(diAccountXL2, "The FP Account");

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
	 * This method will verify no trading accounts
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyNoTradingAccounts() 
	{
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(webBroker, "Go to WebBroker");
			mobileAction.verifyElementIsDisplayed(errorMsg, "Message");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(backButton, "BackButton");
			} else {
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(menu, "Menu");
			mobileAction.FuncClick(my_accounts, "My Accounts");
			mobileAction.verifyElementIsDisplayed(accounts_Header, "Accounts");

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
	 * This method will verify no eligible accounts for the trading
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifynoEligibleAccounts()  {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(webBroker, "Go to WebBroker");
			mobileAction.verifyElementIsDisplayed(errorMsg, "Error Message");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(backButton, "BackButton");
			} else {
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(menu, "Menu");
			mobileAction.FuncClick(my_accounts, "My Accounts");
			mobileAction.verifyElementIsDisplayed(accounts_Header, "Accounts");
			
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
	 * This method will verify the Investing screens in trading Page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyInvestingScreen() {
		try {
			Decorator();
			mobileAction.FuncClick(trade, "Trade");
			mobileAction.verifyElementIsDisplayed(trade_header, "Trade");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				mobileAction.FuncClick(backButton, "BackButton");
			}else{
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(watchLists, "WatchLists");
			mobileAction.verifyElementIsDisplayed(watchlists_Header, "WatchList");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				mobileAction.FuncClick(backButton, "BackButton");
			}else{
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(markets, "Markets");
			mobileAction.verifyElementIsDisplayed(markets_Header, "Markets");

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
	 * This method will verify the FPA Accounts
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyFPAccounts() {
		try {
			Decorator();
			String diAccountXL = null;
			String diAccountXL2 = null;

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				diAccountXL = "//*[contains(@label,'" + CL.getTestDataInstance().getPrimaryAccount() + "')]";
				diAccountXL2 = "//*[contains(@label,'" + CL.getTestDataInstance().getSecondryAccount() + "')]";
			} else {
				diAccountXL = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
						+ CL.getTestDataInstance().getPrimaryAccount() + "']";
				diAccountXL2 = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
						+ CL.getTestDataInstance().getSecondryAccount() + "']";
			}
			mobileAction.verifyElementUsingXPath(diAccountXL, "The first FP Account");
			mobileAction.verifyElementUsingXPath(diAccountXL2, "The Second FP Account");

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
	 * This method will verify the PIA or FPA Account
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyPIAOrFPAccount() {//@Author - Sushil 20-Apr-2017 modified
		try {
			Decorator();
			String diAccountXL = null;
			String diAccountXL2 = null;
			//mobileAction.waitForElementToVanish(progressBar);
			String fromAccount = getTestdata("FromAccount");
			String fromAccountArr[] = fromAccount.split(",");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				diAccountXL = "//*[contains(@label,'" + fromAccountArr[0] + "')]";
				diAccountXL2 = "//*[contains(@label,'" + fromAccountArr[1] + "')]";
			} else {
				diAccountXL = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ fromAccountArr[0] + "')]";
				diAccountXL2 = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ fromAccountArr[1] + "')]";
			}
			mobileAction.verifyElementUsingXPath(diAccountXL, "The first PIA/FP Account");
			mobileAction.verifyElementUsingXPath(diAccountXL2, "The Second PIA/FP Account");
			MobileElement accountVal = mobileAction.verifyElementUsingXPath(diAccountXL2,"DI Account");
			mobileAction.FuncClick(accountVal, "PIA/FP");
			if(mobileAction.isObjExists(Investing_Trade)) //@Author - Sushil 20-Apr-2017
				CL.GetReporting().FuncReport("Fail", "Trade option should not be displayed on the Investing landing page for connectID with only PIA/FP accounts");
			else
				CL.GetReporting().FuncReport("Pass", "Trade option is not displayed on the Investing landing page for connectID with only PIA/FP accounts");

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
	 * This method will verify the combined Accounts
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyCombinedAccount() {
		try {
			Decorator();
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(hdrInvesting, "hdrInvesting");
			mobileAction.FuncClick(backButton, "Back");
			mobileAction.verifyElementIsDisplayed(hdrHome, "hdrHome");
			mobileAction.verifyElementIsDisplayed(trade_dashboard, "trade_dashboard");
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
	 * This method will verify the Error Message
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	
	public void verifyErrorMessage() {
		try {
			Decorator();
			mobileAction.verifyElementTextContains(ErrorMessage, "error message");
			mobileAction.FuncClick(backButton, "Back");
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
	 * This method will verify the Error Message
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void clickTradeIcon() {
		Decorator();
		try {
			mobileAction.FuncClick(tradeicon, "Click Trade Icon");
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
	 * This method will click on the backbutton
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */


	public void clickBackbtn() {

		Decorator();
		try {
			Thread.sleep(5000);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(Backbtn, "BACK");
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

	// new code

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/contentLayout' and @index='0']")
	private MobileElement firstPlacedOrderElement;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/ordersTab' and @text='Orders']")
	private MobileElement ordersButton;
	
	/**
	 * This method will click on the Place order
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */


	public void clickPlacedOrder() {
		Decorator();
		try {
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(ordersButton, "Order Clicked");

			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(firstPlacedOrderElement, "Order Clicked");
			mobileAction.waitForElementToVanish(progressBar);
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
	 * This method will verify the EmptyWatchLists
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */


	public void verifyEmptyWatchLists() {
		try {
			Decorator();
			Thread.sleep(5000);
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(watchListsButton, "Watch List");
			mobileAction.verifyElementIsDisplayed(watchListsEmpty, "Watch List Empty");

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
		try {
			mobileAction.FuncClick(watchListsButton, "Click Trade Icon");
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
	 * This method will Click on Holdings and Symbol
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */


	public void clickHoldingAndSymbol(){
		try {
			Decorator();
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(Holdings, "Holdings");
			mobileAction.waitForElementToVanish(progressBar);
			String symbolValue=getTestdata("Search");
			String symbolXpath = "//android.widget.TextView[@resource-id='com.td:id/symbol' and @text='"+ symbolValue + "')]";
			
			
			try {
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(symbolXpath, true, 15, "up");
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}

			mobileAction.waitForElementToVanish(progressBar);

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
		try {
			mobileAction.FuncClick(watchListsButton, "Click Trade Icon");
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
	 * This method will verify text within elements for open a new account page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyOpenNewAccountTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(investing_header.getText(), mobileAction.getAppString("Investing"));
				mobileAction.verifyTextEquality(investing_body_title.getText(), mobileAction.getAppString("investing_open_account"));
				mobileAction.verifyTextEquality(investing_body_msg.getText(), mobileAction.getAppString("str_investing_cross_sell_message_detail"));
				mobileAction.verifyTextEquality(go_to_webbroker_button.getText(), mobileAction.getAppString("str_go_to_webbroker"));
				mobileAction.verifyTextEquality(call_button.getText().split(" ")[0], mobileAction.getAppString("call_phone").replace(" %1$s", ""));
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("str_Investing") + "']", "Investing title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("str_investing_cross_sell_message") + "']", "Open a direct investing account");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text=\"" + mobileAction.getAppString("str_investing_cross_sell_message_detail") + "\"]", "Open a bank account msg body");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='" + mobileAction.getAppString("str_go_to_webbroker") + "']", "Go to webbroker");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[contains(@text, '" + mobileAction.getAppString("str_call_phone").replace(" %1$s", "") + "')]", "call 1-800");
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
	
	
	/**
	 * @author Ashraf This method will verify the details on investing page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyInvestingPageDetails() {

		Decorator();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				final MobileElement investingHeader = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeOther[@name='TDVIEW_TITLE']",
						"Investing Header");
				mobileAction.containsHanScript(investingHeader.getText());
				final MobileElement searchHint = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeSearchField",
						"Search Hint");
				mobileAction.containsHanScript(searchHint.getText());
				final MobileElement trade = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_TITLE0']",
						"trade");
				mobileAction.containsHanScript(trade.getText());
				final MobileElement tradeHint = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_DES0']",
						"trade hint");
				mobileAction.containsHanScript(tradeHint.getText());
				final MobileElement watchList = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_TITLE1']",
						"watchList");
				mobileAction.containsHanScript(watchList.getText());
				final MobileElement watchListHint = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_DES1']",
						"watchListHint");
				mobileAction.containsHanScript(watchListHint.getText());
				final MobileElement markets = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_TITLE2']",
						"watchList");
				mobileAction.containsHanScript(markets.getText());
				final MobileElement marketsHint = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_DES2']",
						"watchListHint");
				mobileAction.containsHanScript(marketsHint.getText());
				final MobileElement accountSummary = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_ACCOUNT']",
						"accountSummary");
				mobileAction.containsHanScript(accountSummary.getText());
				final MobileElement accountDetails1 = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_DETAILCELL_1']",
						"accountDetails1");
				mobileAction.containsHanScript(accountDetails1.getText());
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Investing") + "']",
						"Investing Header");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='"
										+ mobileAction.getAppString("str_search_for_a_symbol") + "']",
								"Enter name or symbol");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("trade_str") + "']", "Trade");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("str_BuySellEquityOptionSecurities_hint") + "']",
						"Buy and Sell securities and equities");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("watchlists_str") + "']",
						"WatchLists");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("str_CreateManageTrackWatchlist_hint") + "']",
						"Create and Manage your watchlists");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("markets_str") + "']",
						"Markets");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("str_ViewCurrentMarketTrendCondition_hint") + "']",
						"View current market trends");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='"
								+ mobileAction.getAppString("str_Accounts") + "']",
						"Accounts");
				
//				for(int i=0;i<accountDefinition.size();i++){
//					
//					mobileAction.verifyElementIsDisplayed(accountDefinition.get(i), "Account Definition "+(i+1));
//				}
//				for(int i=0;i<20;i++){
//					mobileAction.FunctionSwipe("up", 50, 200);
//				}
//				mobileAction.verifyElementUsingXPath(
//						"//android.widget.TextView[@resource-id='com.td:id/textView1' and @text='"
//								+ mobileAction.getAppString("str_Total") + "']",
//						"Total");
//				
//				mobileAction.verifyElementUsingXPath(
//						"//android.widget.TextView[@text='"
//								+ mobileAction.getAppString("str_td_mutual_funds_offered") + "']",
//						"Mutual Funds offered by:");
			}
		}

		 catch (NoSuchElementException | IOException e) {
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
	 * @author Ashraf This method will click on first investing account on
	 *         investing page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void clickAccount() {

		Decorator();
		boolean flag=true;
		int count=0;
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String from_accountNo = "//XCUIElementTypeStaticText[contains(@name, 'INVESTING_ACCOUNT_SUMMARY_DETAILCELL_') and contains(@value, '" + getTestdata("FromAccount") + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
                        .findElement(By.xpath(from_accountNo));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
			} else {
				String accountNum = getTestdata("FromAccount");
				String accountNumXpath="//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"+accountNum+"')]";
				
				while(flag&&count<5)
				{
					try{
				MobileElement account = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(accountNumXpath));
				if(account.isDisplayed()){
					mobileAction.FuncClick(account, "Account Number");
					flag=false;
				}else{
					mobileAction.FunctionSwipe("up", 1000, 200);
					count++;
				}
					}catch(NoSuchElementException | InterruptedException e){
						mobileAction.FunctionSwipe("up", 1000, 200);
						count++;
						if(count == 5) {
							throw e;
						}
					}
					}
				
			}

		}

		 catch (Exception e) {
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
