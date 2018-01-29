package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Investing extends _CommonPage {
	private static Investing Investing;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='TRADE'] | //XCUIElementTypeButton[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TRADE'] | //android.widget.Button[@text='TRADE']")
	private MobileElement tradeicon;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE'] | //XCUIElementTypeOther[@label='Investing'] | //XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement investing_header;

	@iOSFindBy(accessibility = "CROSSSELL_VIEWTITLE")
	private MobileElement investing_body_title;

	@iOSFindBy(accessibility = "CROSSSELL_MESSAGE")
	private MobileElement investing_body_msg;

	@iOSXCUITFindBy(accessibility = "INVESTING_ACCOUNT_SUMMARY_TABLECELL_TITLE0")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@text='Trade' or @text='Négociation') and @index='0']")
	private MobileElement trade;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Markets']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Markets' and @index='0']")
	private MobileElement markets;

	@iOSFindBy(xpath = "//*[@label='Orders']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade' and @index='0']")
	private MobileElement order;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/contentLayout' and @index='0']")
	private MobileElement placedorder;

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

	// @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Holdings']")
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Holdings' or @label='Avoirs']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/holdingsTab' and (@text='Holdings' or @text='Avoirs')]")
	private MobileElement Holdings;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Go to WebBroker']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and @text='Go to WebBroker']")
	private MobileElement webBroker;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Open a TD Direct Investing Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Open a TD Direct Investing Account')]")
	private MobileElement errorMsg;

	/*
	 * @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']") private
	 * MobileElement backButton;
	 */

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") // @Author -
																// Sushil
																// 07-Mar-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[(@content-desc='Trade, Navigate up') or (@content-desc='Négociation, Revenir en haut de la page')]")
	private MobileElement backBtn;

	@iOSFindBy(xpath = "//*[@label='Agree' or @label='Accepte']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and (@text = 'Agree' or @text='Accepte')]")
	private MobileElement agreeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@resource-id='com.td:id/navText' or @resource-id='com.td:id/textview_flyout_menu_item') and @text='My Accounts']")
	private MobileElement my_accounts;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='BANKING']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='BANKING']")
	private MobileElement account_Banking_header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
	private MobileElement trade_header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Watchlists']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Watchlists']")
	private MobileElement watchlists_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Markets'] | //XCUIElementTypeStaticText[@label='Markets']")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Markets']")
	private MobileElement markets_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='My Accounts']")
	private MobileElement accounts_Header;

	@iOSFindBy(xpath = "//*[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement Backbtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Open a TD Direct Investing Account')]")
	// @AndroidFindBy(xpath =
	// "//android.widget.TableRow[@resource-id='com.td:id/watchlistRow']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_main_text']")
	private MobileElement ErrorMessage;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeStaticText[contains(@label,'Watchlists')]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Watchlists') or contains(@label,'Listes de surveillance')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Watchlists' or @text='Listes de surveillance']")
	private MobileElement watchListsButton;

	@iOSFindBy(xpath = "//*[contains(@label,'CA') or contains(@label,'CAN')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/symbol']")
	private MobileElement stocksSymbol;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Buy' or @label='Acheter' or @label='Achat']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Buy_Entity_Button']")
	private MobileElement buyBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Sell' or @label='Vendre' or @label='Vente']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Sell_Entity_Button']")
	private MobileElement sellBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='accountNumberLabel']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accountCaption' and (@text='Account' or @text='Compte')]//following::android.widget.TextView[@resource-id='com.td:id/selectedValue']")
	private MobileElement defaultAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Buy' or @label='Acheter']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption']//following::android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private MobileElement actionBuy;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Day' or @label='Jour']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and (contains(@text,'Good') or contains(@text,'Échéance')) ]//following::android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private MobileElement goodTilDay;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Your Watchlist is empty')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Welcome to the new Watchlist']") // @resource-id='com.td:id/first_line'
	private MobileElement watchListsEmpty;

	@iOSFindBy(xpath = "//*[@label='TRADE' or @label='Négociation']") // @Author
																		// -
																		// Sushil
																		// 20-Apr-2017
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation']")
	private MobileElement Investing_Trade;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Investing') or contains(@label,'Placements directs')]") // @Author
																														// -
																														// Sushil
																														// 20-Apr-2017
	@AndroidFindBy(xpath = "//*[(contains(@text,'Investing') or contains(@text,'Placements directs')) and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrInvesting;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Home') or contains(@label,'Accueil')]") // @Author
																										// -
																										// Sushil
																										// 20-Apr-2017
	@AndroidFindBy(xpath = "//*[(contains(@text,'Home') or contains(@text,'Accueil')) and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrHome;

	@iOSFindBy(xpath = "//*[@label='TRADE' or @label='Négociation']") // @Author
																		// -
																		// Sushil
																		// 20-Apr-2017
	@AndroidFindBy(id = "com.td:id/trade_dashboard")
	private MobileElement trade_dashboard;

	String Investing_Table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]";
	String order_value = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/ XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]";
	String order_value_Android = "//android.widget.LinearLayout[contains(@text,'Awaiting Review') and @index='2']";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + 1 + Secondpart;

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	@iOSFindBy(accessibility = "QUICKACCESS_CELL_FUND-PURCHASE-ICON")
	@AndroidFindBy(id = "com.td:id/quick_link_item_layout_button")
	private MobileElement purchase_MF_button;

	@iOSFindBy(xpath = "//*[@name='HMSEGMENT_TITLE_0']") // fengfr6 added
	@AndroidFindBy(id = "com.td:id/balanceText")
	private MobileElement balance_tab;

	@iOSFindBy(xpath = "//*[@name='HMSEGMENT_TITLE_1']")
	@AndroidFindBy(id = "com.td:id/holdingText")
	private MobileElement funds_tab;

	@iOSFindBy(xpath = "//*[@name='HMSEGMENT_TITLE_2']")
	@AndroidFindBy(id = "com.td:id/activityText")
	private MobileElement activity_tab;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/symbol' and @index='0']")
	private MobileElement first_fund;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label, 'USD $') or contains(@label, '$ US')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/symbol' and (contains(@text, 'USD $') or contains(@text,'$ US'))]")
	private MobileElement first_usd_fund;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/activityContent']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout/android.widget.TextView[@index='1']")
	private MobileElement first_transaction;

	@iOSFindBy(xpath = "//*[@name='TD_ACCOUNT_FOOTER_VIEW_LABEL']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/timestamp']")
	private MobileElement foot_note;

	@iOSFindBy(xpath = "//*[@name='TD_ACCOUNT_FOOTER_VIEW_LABEL']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/canadianDollarNote']")
	private MobileElement transaction_foot_note;

	@iOSFindBy(xpath = "//*[@name='FOUND_HOLDING_FUND']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_left']")
	private MobileElement table_heading_left;

	@iOSFindBy(xpath = "//*[@name='FOUND_HOLDING_MARKET']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_center']")
	private MobileElement table_heading_middle;

	// for Android only
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_right']")
	private MobileElement table_heading_right;

	@iOSFindBy(xpath = "//*[@name='FOUND_HOLDING_UNIT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_units']")
	private MobileElement table_heading_unit;

	@iOSFindBy(xpath = "//*[@name='FOUND_HOLDING_UNIT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_price_per_unit']")
	private MobileElement table_heading_unit_price;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/account_value']")
	private MobileElement account_balance;

	@iOSFindBy(xpath = "//*[@name='TD_ACCOUNT_FOOTER_VIEW_LABEL']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tradingFeeDisclaimer']")
	private MobileElement usd_disclaimer_foot;

	@iOSFindBy(xpath = "//*[@name='FUND_BALANCE_MARKET_VALUE']/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/totalMarketValue']")
	private MobileElement total_market_value;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum']")
	private List<MobileElement> accountDefinition;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/footer_text']")
	private MobileElement mutualFundOfferedBy;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mf_link']")
	private MobileElement tdInvestmentServices;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/disclaimer_link']")
	private MobileElement tdDirectInvestment;

	@iOSFindBy(accessibility = "TD_ACCOUNT_FOOTER_VIEW_LABEL")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/canadianDollarNote']")
	private MobileElement tradingFeeDisclaimer;

	public synchronized static Investing get() {
		if (Investing == null) {
			Investing = new Investing();
		}
		return Investing;
	}

	private void Decorator() {
		PageFactory.initElements(

				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(7, TimeUnit.SECONDS)), this);

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
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(trade, "Trade");

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
	public void verifyInvestingHeader() {
		Decorator();
		try {
			mobileAction.verifyTextEquality(mobileAction.getValue(investing_header),
					mobileAction.getAppString("str_Investing"));
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
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
				// MobileElement
				// investingAccountVal=mobileAction.mobileElementUsingXPath(investingacc_value);
				// CL.GetDriver().findElement(By.xpath(investingacc_value)).click();
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(investingacc_value, true, 25, "Up");
				// mobileAction.FuncClick(investingAccountVal, "Investing
				// Account value");
				mobileAction.waitProgressBarVanish();

			} else {

				mobileAction.FuncElementSwipeWhileNotFound(investingListView, InvestingAccountsXpath, 10, "down", true);
				mobileAction.waitProgressBarVanish();
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

			MobileElement OrderVal = null;

			// mobileAction.FuncClick(order, "order");
			mobileAction.waitProgressBarVanish();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				OrderVal = mobileAction.verifyElementUsingXPath(order_value, "Order");
			} else {
				OrderVal = mobileAction.verifyElementUsingXPath(order_value_Android, "Order");
			}
			mobileAction.FuncClick(OrderVal, "ordervalue");
			mobileAction.waitProgressBarVanish();

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
			mobileAction.waitProgressBarVanish();
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

	public void clickHoldings() {
		try {
			Decorator();
			mobileAction.FuncClick(Holdings, "Holdings");
			mobileAction.waitProgressBarVanish();
			// mobileAction.FunCSwipeandScroll(AAVSymbol, true);

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
				diAccountXL = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ CL.getTestDataInstance().getPrimaryAccount() + "')]";

				diAccountXL2 = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ CL.getTestDataInstance().getSecondryAccount() + "')]";
			}
			mobileAction.verifyElementUsingXPath(diAccountXL, "The first DI Account");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(diAccountXL2, false, 30, "Up");
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
				diAccountXL = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ CL.getTestDataInstance().getPrimaryAccount() + "')]";
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
				diAccountXL = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ CL.getTestDataInstance().getPrimaryAccount() + "')]";
				diAccountXL2 = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ CL.getTestDataInstance().getSecondryAccount() + "')]";
				diAccountXL3 = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ getTestdata("FromAccount") + "')]";
			}

			mobileAction.verifyElementUsingXPath(diAccountXL, "The DI Account");
			// mobileAction.changeToMobileElementAndSwipe(diAccountXL2, false);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(diAccountXL2, false, 50, "Up");
			mobileAction.verifyElementUsingXPath(diAccountXL2, "The PIA Account");
			// mobileAction.changeToMobileElementAndSwipe(diAccountXL3, false);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(diAccountXL3, false, 30, "Up");
			mobileAction.verifyElementUsingXPath(diAccountXL3, "The FP Account");

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

	public void verifyNoTradingAccounts() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(webBroker, "Go to WebBroker");
			mobileAction.verifyElementIsDisplayed(errorMsg, "Message");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(backButton, "BackButton");
			} else {
				// mobileAction.FuncHideKeyboard();
				mobileAction.FuncClickBackButton();
			}
			mobileAction.clickMenuButton();
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

	public void verifynoEligibleAccounts() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(webBroker, "Go to WebBroker");
			mobileAction.verifyElementIsDisplayed(errorMsg, "Error Message");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(backButton, "BackButton");
			} else {
				// mobileAction.FuncHideKeyboard();
				mobileAction.FuncClickBackButton();
			}
			mobileAction.clickMenuButton();
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
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(backButton, "BackButton");
			} else {
				mobileAction.FuncClickBackButton();
			}
			mobileAction.FuncClick(watchLists, "WatchLists");
			mobileAction.verifyElementIsDisplayed(watchlists_Header, "WatchList");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(backButton, "BackButton");
			} else {
				mobileAction.FuncClickBackButton();
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
				diAccountXL = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ CL.getTestDataInstance().getPrimaryAccount() + "')]";
				diAccountXL2 = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ CL.getTestDataInstance().getSecondryAccount() + "')]";
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
	public void verifyPIAOrFPAccount() {// @Author - Sushil 20-Apr-2017 modified
		try {
			Decorator();
			String diAccountXL = null;
			String diAccountXL2 = null;
			// mobileAction.waitForElementToVanish(progressBar);
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
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(diAccountXL2, false, 25, "Up");
			mobileAction.verifyElementUsingXPath(diAccountXL2, "The Second PIA/FP Account");
			MobileElement accountVal = mobileAction.verifyElementUsingXPath(diAccountXL2, "DI Account");
			mobileAction.FuncClick(accountVal, "PIA/FP");
			if (mobileAction.isObjExists(Investing_Trade)) // @Author - Sushil
															// 20-Apr-2017
				CL.GetReporting().FuncReport("Fail",
						"Trade option should not be displayed on the Investing landing page for connectID with only PIA/FP accounts");
			else
				CL.GetReporting().FuncReport("Pass",
						"Trade option is not displayed on the Investing landing page for connectID with only PIA/FP accounts");

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
			mobileAction.waitProgressBarVanish();
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
			mobileAction.verifyElementIsDisplayed(ErrorMessage, "Error Message");
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
			Thread.sleep(2000);
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

	@iOSFindBy(xpath = "//XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/contentLayout' and @index='0']")
	private MobileElement firstPlacedOrderElement;

	@iOSFindBy(xpath = "//*[@label='Orders' or @label='Ordres']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/ordersTab']")
	private MobileElement ordersButton;

	@iOSXCUITFindBy(accessibility = "Orders")
	@AndroidFindBy(id = "com.td:id/ordersTab")
	private MobileElement ordersButtonPerf;

	@iOSXCUITFindBy(accessibility = "COMPLEX_ORDER_CELL_SYMBOL_NAME")
	@AndroidFindBy(id = "com.td:id/symbol")
	private MobileElement ordersFirstSymbolPerf;

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
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(ordersButton, "Order Clicked");

			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(firstPlacedOrderElement, "Order Clicked");
			mobileAction.waitProgressBarVanish();
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

	/*
	 * public void verifyEmptyWatchLists() { try { Decorator();
	 * Thread.sleep(5000); mobileAction.waitForElementToVanish(progressBar);
	 * mobileAction.FuncClick(watchListsButton, "Watch List");
	 * mobileAction.verifyElementIsDisplayed(watchListsEmpty, "Watch List Empty"
	 * );
	 * 
	 * } catch (NoSuchElementException e) {
	 * CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 * System.out.println("NoSuchElementException from Method " +
	 * this.getClass().toString() + " " + e.getCause()); } catch
	 * (InterruptedException e) {
	 * CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 * System.out.println("InterruptedException from Method " +
	 * this.getClass().toString() + " " + e.getCause()); } catch (IOException e)
	 * { CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 * System.out.println("IOException from Method " +
	 * this.getClass().toString() + " " + e.getCause()); } catch (Exception e) {
	 * CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 * System.out.println("Exception from Method " + this.getClass().toString()
	 * + " " + e.getCause()); } try { mobileAction.FuncClick(watchListsButton,
	 * "Click Trade Icon"); } catch (NoSuchElementException e) {
	 * CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 * System.out.println("NoSuchElementException from Method " +
	 * this.getClass().toString() + " " + e.getCause()); } catch
	 * (InterruptedException e) {
	 * CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 * System.out.println("InterruptedException from Method " +
	 * this.getClass().toString() + " " + e.getCause()); } catch (IOException e)
	 * { CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 * System.out.println("IOException from Method " +
	 * this.getClass().toString() + " " + e.getCause()); } catch (Exception e) {
	 * CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	 * System.out.println("Exception from Method " + this.getClass().toString()
	 * + " " + e.getCause()); } }
	 */

	public void verifyWatchLists() {
		String verifyAction = null;
		try {
			Decorator();

			Thread.sleep(2000);
			mobileAction.waitProgressBarVanish();

			mobileAction.FuncClick(watchListsButton, "Watch List");
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(stocksSymbol, "Stocks Symbol");
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(buyBtn, "Buy Button");
			mobileAction.verifyElementIsDisplayed(sellBtn, "Sell Button");
			mobileAction.FuncClick(buyBtn, "Click Buy");
			mobileAction.waitProgressBarVanish();
			Thread.sleep(2000);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

			} else {
				for (int i = 0; i < 2; i++) {
					mobileAction.FunctionSwipe("up", 100, 100);
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						verifyAction = "//XCUIElementTypeStaticText[@label='" + getTestdata("Action", i) + "']";
					} else {
						verifyAction = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='"
								+ getTestdata("Action", i) + "']";
					}

					MobileElement actionVerify = mobileAction.mobileElementUsingXPath(verifyAction);
					mobileAction.verifyElementIsDisplayed(actionVerify, "Action Verified");
					mobileAction.FunctionSwipe("down", 200, 200);
					mobileAction.verifyElementIsDisplayed(defaultAccount, "Default Account");
					mobileAction.FunctionSwipe("up", 200, 200);
					mobileAction.verifyElementIsDisplayed(goodTilDay, "Good'til Day");
					if (getTestdata("Action", i).equalsIgnoreCase("Buy")
							|| getTestdata("Action", i).equalsIgnoreCase("Acheter")) {
						mobileAction.FuncClick(backBtn, "Back");
						mobileAction.FuncClick(agreeButton, "Agree Button");
						Thread.sleep(3000);
						mobileAction.FuncClick(sellBtn, "Click Sell");
						mobileAction.waitProgressBarVanish();
					}
				}
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

	public void clickHoldingAndSymbol() {
		String symbolXpath = null;
		try {
			Decorator();

			mobileAction.waitProgressBarVanish();
			// mobileAction.FuncClick(Holdings, "Holdings");
			String symbolValue = getTestdata("Search");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				symbolXpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[@label='" + symbolValue + "']";

			} else {
				symbolXpath = "//android.widget.TextView[@resource-id='com.td:id/symbol' and @text='" + symbolValue
						+ "']";
			}
			try {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

					MobileElement symbolPath = mobileAction.mobileElementUsingXPath(symbolXpath);
					System.out.println(mobileAction.verifyElementIsPresent(symbolPath));
					mobileAction.FuncClick(symbolPath, "symbolPath");

				} else {
					mobileAction.changeToMobileElementAndSwipe(symbolXpath, true);
				}
				// mobileAction.FuncSwipeWhileElementNotFoundByxpath(symbolXpath,
				// true, 15, "up");
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}

			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void ClickPurchaseMF() {
		Decorator();
		try {
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(purchase_MF_button, "Purchase Mutual Funds");
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void ClickBalanceTab() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				balance_tab = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Balances") + "']",
						"Balance Tab");
			}
			mobileAction.FuncClick(balance_tab, "balance tab");
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void ClickFundsTab() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				funds_tab = mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
						+ mobileAction.getAppString("str_Balances") + "']/following-sibling::XCUIElementTypeButton",
						"Funds Tab");
			}
			mobileAction.FuncClick(funds_tab, "Funds tab");
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void ClickActivityTab() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				activity_tab = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity") + "']",
						"Activity Tab");
			}
			mobileAction.FuncClick(activity_tab, "Activity tab");
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void SelectFirstFund() {
		Decorator();
		try {

			String firstFundName = mobileAction.getValue(first_fund);
			System.out.println("Fund:" + firstFundName);
			mobileAction.FuncClick(first_fund, firstFundName);
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
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

				mobileAction.verifyTextEquality(investing_header.getAttribute("label"),
						mobileAction.getAppString("Investing"));
				mobileAction.verifyTextEquality(investing_body_title.getText(),
						getTextInCurrentLocale(StringArray.ARRAY_INVESTING_OPEN_ACCOUNT));
				mobileAction.verifyTextEquality(investing_body_msg.getText(),
						getTextInCurrentLocale(StringArray.ARRAY_INVESTING_CROSS_MSG));
				mobileAction.verifyTextEquality(go_to_webbroker_button.getText(),
						mobileAction.getAppString("str_go_to_webbroker"));
				mobileAction.verifyTextEquality(call_button.getText().split(" ")[0],
						// mobileAction.getAppString("call_phone").replace("
						// %1$s", ""));
						mobileAction.getAppString("str_Call").replace(" %1$s", ""));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Investing") + "']",
						"Investing title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("str_investing_cross_sell_message") + "']",
						"Open a direct investing account");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text=\""
								+ mobileAction.getAppString("str_investing_cross_sell_message_detail") + "\"]",
						"Open a bank account msg body");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='" + mobileAction.getAppString("str_go_to_webbroker") + "']",
						"Go to webbroker");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[contains(@text, '"
								+ mobileAction.getAppString("str_call_phone").replace(" %1$s", "") + "')]",
						"call 1-800");
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

	public void SelectUSDFunds() {
		Decorator();
		try {

			mobileAction.FuncSwipeWhileElementNotFound(first_usd_fund, false, 10, "up");
			String firstFundName = mobileAction.getValue(first_usd_fund);
			System.out.println("Fund:" + firstFundName);
			mobileAction.FuncClick(first_usd_fund, firstFundName);
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void randomlySelectOneFund() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (!mobileAction.verifyElementIsPresent(foot_note)) {
					int randSwipe = (int) (Math.random() * 5 + 1);
					System.out.println("Randomly swipe times:" + (randSwipe - 1));
					for (int i = 1; i < randSwipe; i++) {
						if (mobileAction.verifyElementIsPresent(foot_note)) {
							break;
						} else {
							mobileAction.FuncSwipeOnce("up");
						}
					}
				}
			}
			List<MobileElement> fundsList = null;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				fundsList = ((MobileDriver) (CL.GetAppiumDriver())).findElementsByXPath(
						"//android.widget.ListView[@resource-id='com.td:id/holdings_list']//android.widget.TextView[@resource-id='com.td:id/symbol']");
			} else {
				fundsList = ((MobileDriver) (CL.GetAppiumDriver()))
						.findElementsByXPath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]");
			}
			int size = fundsList.size();
			System.out.println("Funds List:" + size);
			if (size == 0) {
				System.out.println("TestCase has failed for no funds in list.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
			int randFund = (int) (Math.random() * size);
			if (randFund >= size) {
				randFund = size - 1;
			}
			System.out.println("Funds index selected:" + randFund);
			if (!mobileAction.verifyElementIsPresent(fundsList.get(randFund))) {
				mobileAction.FuncSwipeWhileElementNotFound(fundsList.get(randFund), false, 20, "up");
			}
			if (randFund != 0) {
				randFund = randFund - 1;
			}
			String fundName = mobileAction.getValue(fundsList.get(randFund));
			System.out.println("Name of the selected fund:" + fundName);
			mobileAction.FuncClick(fundsList.get(randFund), fundName);
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void SelectFirstTransaction() {
		Decorator();
		try {

			String firstTransacName = mobileAction.getValue(first_transaction);
			System.out.println("Transaction:" + firstTransacName);
			mobileAction.FuncClick(first_transaction, firstTransacName);
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void SelectPreviousTransaction() {
		Decorator();
		try {
			LocalDate localDate = LocalDate.now();
			String currentDate = DateTimeFormatter.ofPattern("MMM dd, yyyy").format(localDate);
			System.out.println("Today is:" + currentDate);
			List<MobileElement> transactionListDate = null;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				transactionListDate = ((MobileDriver) (CL.GetAppiumDriver())).findElementsByXPath(
						"//android.widget.ListView[@resource-id='com.td:id/activityContent']//android.widget.TextView[@resource-id='com.td:id/date']");
			} else {
				transactionListDate = ((MobileDriver) (CL.GetAppiumDriver()))
						.findElementsByXPath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]");
			}

			int size = transactionListDate.size();
			for (int i = 0; i < size; i++) {
				String transactionDate = mobileAction.getValue(transactionListDate.get(i));
				System.out.println("Transaction date:" + transactionDate);
				if (!transactionDate.equalsIgnoreCase(currentDate)) {
					mobileAction.FuncSwipeWhileElementNotFound(transactionListDate.get(i), true, 10, "up");
					// mobileAction.FuncClick(transactionListDate.get(i),
					// "Transaction on " +transactionDate);
					mobileAction.waitProgressBarVanish();
					break;
				}
				if (i == size) {
					mobileAction.Report_Fail("No previous transaction found");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void SelectLastTransaction() {
		Decorator();
		try {
			mobileAction.FuncSwipeWhileElementNotFound(transaction_foot_note, false, 50, "up");
			List<MobileElement> transactionListContent = null;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				transactionListContent = ((MobileDriver) (CL.GetAppiumDriver())).findElementsByXPath(
						"//android.widget.ListView[@resource-id='com.td:id/activityContent']//android.widget.TextView[@resource-id='com.td:id/transaction_fund_name']");
			} else {
				transactionListContent = ((MobileDriver) (CL.GetAppiumDriver()))
						.findElementsByXPath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]");
			}

			int size = transactionListContent.size();
			if (size == 0) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				mobileAction.Report_Fail("Failed:No transaction found");
				return;
			}

			String lastTransacName = mobileAction.getValue(transactionListContent.get(size - 1));
			System.out.println("Transaction:" + lastTransacName);
			mobileAction.FuncClick(transactionListContent.get(size - 1), lastTransacName);
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyMFChineseContent() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(investing_header, mobileAction.getAppString("str_Investing"));
			mobileAction.verifyElementTextIsDisplayed(balance_tab,
					getTextInCurrentLocale(StringArray.ARRAY_TAB_BALANCE));
			mobileAction.verifyElementTextIsDisplayed(funds_tab, getTextInCurrentLocale(StringArray.ARRAY_TAB_FUND));
			mobileAction.verifyElementTextIsDisplayed(activity_tab,
					getTextInCurrentLocale(StringArray.ARRAY_TAB_ACTIVITY));
			String strFundTabLeft = mobileAction.getValue(table_heading_left).replaceAll(" ¹", "").trim();
			System.out.println("strFundTabLeft:" + strFundTabLeft);
			mobileAction.verifyTextEquality(strFundTabLeft, getTextInCurrentLocale(StringArray.ARRAY_FUND_TAB_LEFT));
			String strFundTabMiddle = mobileAction.getValue(table_heading_middle).replaceAll(" ²", "").trim();
			System.out.println("strFundTabMiddle:" + strFundTabMiddle);
			mobileAction.verifyTextEquality(strFundTabMiddle,
					getTextInCurrentLocale(StringArray.ARRAY_TABLE_MARKET_VALUE));
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementTextIsDisplayed(table_heading_unit,
						getTextInCurrentLocale(StringArray.ARRAY_TABLE_UNIT) + " "
								+ getTextInCurrentLocale(StringArray.ARRAY_TABLE_PRICE_PER_UINT));
			} else {
				mobileAction.verifyElementTextIsDisplayed(table_heading_unit,
						getTextInCurrentLocale(StringArray.ARRAY_TABLE_UNIT));
				mobileAction.verifyElementTextIsDisplayed(table_heading_unit_price,
						getTextInCurrentLocale(StringArray.ARRAY_TABLE_PRICE_PER_UINT));
			}

			mobileAction.FuncSwipeWhileElementNotFound(tradingFeeDisclaimer, false, 20, "up");
			String capturedtext = mobileAction.getValue(tradingFeeDisclaimer);
			if (currentLocale.equalsIgnoreCase("fr")) {
				capturedtext = capturedtext.replaceAll("2 %", "2 %");
			}
			System.out.println("Captured:" + capturedtext);

			if (capturedtext.contains(getTextInCurrentLocale(StringArray.ARRAY_MF_TRADE_FEE_DISCLAIMER))) {
				mobileAction.Report_Pass_Verified(getTextInCurrentLocale(StringArray.ARRAY_MF_TRADE_FEE_DISCLAIMER));
			} else {
				mobileAction
						.Report_Fail_Not_Verified(getTextInCurrentLocale(StringArray.ARRAY_MF_TRADE_FEE_DISCLAIMER));
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyMFActivityChineseContent() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(investing_header, mobileAction.getAppString("str_Investing"));
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				activity_tab = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity") + "']",
						"Activity Tab");
				table_heading_left = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity")
								+ "']/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[1]",
						"left head");
				table_heading_middle = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity")
								+ "']/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[2]",
						"Center head");
				table_heading_right = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity")
								+ "']/following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[3]",
						"Rifht head");
			}
			mobileAction.verifyElementTextIsDisplayed(activity_tab,
					getTextInCurrentLocale(StringArray.ARRAY_TAB_ACTIVITY));
			mobileAction.verifyElementTextIsDisplayed(table_heading_left,
					getTextInCurrentLocale(StringArray.ARRAY_TABLE_DATE));
			mobileAction.verifyElementTextContains(table_heading_middle,
					getTextInCurrentLocale(StringArray.ARRAY_TABLE_TRANSACTION));
			mobileAction.verifyElementTextContains(table_heading_right,
					getTextInCurrentLocale(StringArray.ARRAY_TABLE_AMOUNT));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyQuickLinkPurchaseChineseContent() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(purchase_MF_button,
					getTextInCurrentLocale(StringArray.ARRAY_MF_PURCHASE_BUTTON));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyQuickLinkDisplayed() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(purchase_MF_button, "Purchase Mutual Funds");
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

	public void VerifyZeroBalance() {
		try {
			Decorator();
			String balance = mobileAction.getValue(total_market_value);
			System.out.println("Balance:" + balance);
			if (balance.contentEquals("$0.00") || balance.contentEquals("0,00 $")) {
				mobileAction.Report_Pass_Verified("Zero balance");
			} else {
				mobileAction.Report_Fail("Non Zero balance:" + balance);
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyUSDDisclaimer() {
		try {
			Decorator();
			mobileAction.FuncSwipeWhileElementNotFound(usd_disclaimer_foot, false, 20, "up");
			String usDisclaimerText = mobileAction.getValue(usd_disclaimer_foot);
			String expectedText = getTextInCurrentLocale(StringArray.ARRAY_MF_CANADIAN_DOLLAR_NOTE);

			if (usDisclaimerText.contains(expectedText)) {
				System.out.println(expectedText);
				mobileAction.Report_Pass_Verified(expectedText);
			} else {
				mobileAction.Report_Fail("Failed: US disclaimer note not found");
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void VerifyUSDConversionRate() {
		try {
			Decorator();
			String selectedFund = CL.getTestDataInstance().TCParameters.get("Accounts");
			String[] selectedFundArray = selectedFund.split("\\|");
			int lengthOfArray = selectedFundArray.length;
			String USD_MarketValue, CAN_MarketValue;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				USD_MarketValue = "//android.widget.TextView[@resource-id='com.td:id/usd_market_value']";
				CAN_MarketValue = "//android.widget.TextView[@resource-id='com.td:id/usd_market_value']/../*[@resource-id='com.td:id/market_value']";
				
			} else {
				USD_MarketValue = "//XCUIElementTypeStaticText[@label='";
				for (int i = 0; i < lengthOfArray; i++) {
					USD_MarketValue = USD_MarketValue + selectedFundArray[i].trim() + "'";
					if (i < lengthOfArray - 1) {
						USD_MarketValue = USD_MarketValue + " or @label='";
					}
				}
				USD_MarketValue = USD_MarketValue + "]/../XCUIElementTypeStaticText[contains(@label, 'USD $')]";
				
				CAN_MarketValue = "//XCUIElementTypeStaticText[@label='";
				for (int i = 0; i < lengthOfArray; i++) {
					CAN_MarketValue = CAN_MarketValue + selectedFundArray[i].trim() + "'";
					if (i < lengthOfArray - 1) {
						CAN_MarketValue = CAN_MarketValue + " or @label='";
					}
				}
				CAN_MarketValue = CAN_MarketValue + "]/../XCUIElementTypeStaticText[1]";
			}
			
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(USD_MarketValue, false, 10, "up");
			mobileAction.verifyElementUsingXPath(USD_MarketValue, "USD market value");
			mobileAction.verifyElementUsingXPath(CAN_MarketValue, "CAN market value");
			
			

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
				final MobileElement investingHeader = mobileAction
						.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE']", "Investing Header");
				mobileAction.containsHanScript(investingHeader.getText());
				final MobileElement searchHint = mobileAction.verifyElementUsingXPath("//XCUIElementTypeSearchField",
						"Search Hint");
				mobileAction.containsHanScript(searchHint.getText());
				final MobileElement trade = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_TITLE0']", "trade");
				mobileAction.containsHanScript(trade.getText());
				final MobileElement tradeHint = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_DES0']", "trade hint");
				mobileAction.containsHanScript(tradeHint.getText());
				final MobileElement watchList = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_TITLE1']", "watchList");
				mobileAction.containsHanScript(watchList.getText());
				final MobileElement watchListHint = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_DES1']",
						"watchListHint");
				mobileAction.containsHanScript(watchListHint.getText());
				final MobileElement markets = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_TITLE2']", "watchList");
				mobileAction.containsHanScript(markets.getText());
				final MobileElement marketsHint = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_TABLECELL_DES2']",
						"watchListHint");
				mobileAction.containsHanScript(marketsHint.getText());
				final MobileElement accountSummary = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='INVESTING_ACCOUNT_SUMMARY_ACCOUNT']", "accountSummary");
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

				// for(int i=0;i<accountDefinition.size();i++){
				//
				// mobileAction.verifyElementIsDisplayed(accountDefinition.get(i),
				// "Account Definition "+(i+1));
				// }
				// for(int i=0;i<20;i++){
				// mobileAction.FunctionSwipe("up", 50, 200);
				// }
				// mobileAction.verifyElementUsingXPath(
				// "//android.widget.TextView[@resource-id='com.td:id/textView1'
				// and @text='"
				// + mobileAction.getAppString("str_Total") + "']",
				// "Total");
				//
				// mobileAction.verifyElementUsingXPath(
				// "//android.widget.TextView[@text='"
				// + mobileAction.getAppString("str_td_mutual_funds_offered") +
				// "']",
				// "Mutual Funds offered by:");
			}
		}

		catch (NoSuchElementException | IOException e) {
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
		boolean flag = true;
		int count = 0;
		try {

			String fromAccount = getTestdata("FromAccount");
			System.out.println("Account:" + fromAccount);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String from_accountNo = "//XCUIElementTypeStaticText[contains(@label, '" + fromAccount + "')]";

				// MobileElement fromAccountval = (MobileElement)
				// (CL.GetAppiumDriver())
				//
				// .findElement(By.xpath(from_accountNo));
				// mobileAction.FunCSwipeandScroll(fromAccountval, true);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(from_accountNo, true, 10, "up");
			} else {

				String accountNum = getTestdata("FromAccount");
				String accountNumXpath = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and contains(@text,'"
						+ accountNum + "')]";

				while (flag && count < 5) {
					try {

						MobileElement account = (MobileElement) (CL.GetAppiumDriver())
								.findElement(By.xpath(accountNumXpath));
						if (account.isDisplayed()) {
							mobileAction.FuncClick(account, "Account Number");
							flag = false;
						} else {
							mobileAction.FunctionSwipe("up", 1000, 200);
							count++;
						}
					} catch (NoSuchElementException | InterruptedException e) {
						mobileAction.FunctionSwipe("up", 1000, 200);
						count++;
						if (count == 5) {
							throw e;
						}
					}
				}

			}

		}

		catch (Exception e) {
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

	public void clickOrdersPERF() {

		Decorator();
		try {
			performance.click(ordersButtonPerf, "Orders tab");
			performance.verifyElementIsDisplayed(ordersFirstSymbolPerf, "Metric - Orders tab");

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

}
