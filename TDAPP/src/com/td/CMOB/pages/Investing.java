package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Investing extends _CommonPage {
    private static Investing Investing;

    @iOSFindBy(xpath = " //*[@label='Investing']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Investing']")
    private MobileElement investing_header;

    @iOSFindBy(xpath = "//*[contains(@label,'Trade')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade' and @index='0']")
    private MobileElement trade;

    @iOSFindBy(xpath = "//*[@label='Orders']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade' and @index='0']")
    private MobileElement order;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/contentLayout' and @index='0']")
    private MobileElement placedorder;

    @iOSFindBy(xpath = "//*[@label='In Progress']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
    private MobileElement progressBar;

    @iOSFindBy(xpath = "//*[contains(@label,'Watchlists')]")
    @AndroidFindBy(xpath = "//android.widget.TableRow[@resource-id='com.td:id/watchlistRow']")
    private MobileElement watchLists;

    @AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/summaryContent' and @index='0']")
    private MobileElement investingListView;

    @iOSFindBy(xpath = "//*[contains(@label,'Go to WebBroker')]")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and contains(@text,'do this later on my computer')]")
    private MobileElement go_to_webbroker_button;

    @iOSFindBy(xpath = "//*[@label='Holdings']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade' and @index='0']")
    private MobileElement Holdings;

    @iOSFindBy(xpath = "//*[contains(@label,'ADVANTAGE OIL & GAS LTD, ')]")
    @AndroidFindBy(xpath = "//android.widget.TableRow[@resource-id='com.td:id/watchlistRow']")
    private MobileElement AAVSymbol;

    String Investing_Table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]";
    String order_value = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/ XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]";

    int i = 1;

    String Firstpart = "//XCUIElementTypeCell[";
    String Secondpart = "]/XCUIElementTypeStaticText[1]";
    String Finalpart = Firstpart + i + Secondpart;

    String platformName = CL.getTestDataInstance().getMobilePlatForm();
    String InvestingAccountsXL = getTestdata("FromAccount", "UserIDs");
    String InvestingAccountsXpath = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
	    + InvestingAccountsXL + "']";

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
     */
    public void clickTrade() {

	try {
	    Decorator();
	    mobileAction.FuncClick(trade, "Trade");
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
     */
    public void verifyInvestingHeader() throws IOException {
	Decorator();
	try {
	    String verify_investing = "Verifying Investing Page Header";
	    mobileAction.verifyElementIsDisplayed(investing_header, verify_investing);
	} catch (NoSuchElementException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

    }

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
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
     */

    public void clickInvestingAccounts() {

	Decorator();

	try {

	    if (platformName.equalsIgnoreCase("ios")) {

		String investingacc_value = "//*[contains(@label,'" + InvestingAccountsXL + "')]";
		CL.GetDriver().findElement(By.xpath(investingacc_value)).click();
		mobileAction.waitForElementToVanish(progressBar);

	    } else {

		mobileAction.FuncElementSwipeWhileNotFound(investingListView, InvestingAccountsXpath, 3, "down", true);
		mobileAction.waitForElementToVanish(progressBar);
	    }
	}

	catch (NoSuchElementException e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	} catch (IOException e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;

	} catch (Exception e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

    }

    public void clickOrder() {

	try {
	    mobileAction.FuncClick(order, "order");
	    mobileAction.waitForElementToVanish(progressBar);
	    MobileElement OrderVal = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(order_value));
	    mobileAction.FuncClick(OrderVal, "ordervalue");
	    mobileAction.waitForElementToVanish(progressBar);

	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    public void clickWatchLists() {

	try {
	    mobileAction.FuncClick(watchLists, "watchLists");
	    mobileAction.waitForElementToVanish(progressBar);
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    public void verifyAdvanceorderdetails() {

	try {
	    Decorator();
	    mobileAction.FuncClick(placedorder, "Placed order");
	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    public void verifyAccessToWBfunctionality() {
	try {
	    Decorator();
	    Thread.sleep(2000);
	    String webbroker_button = "Go to Web Broker";
	    mobileAction.verifyElementIsDisplayed(go_to_webbroker_button, webbroker_button);
	    CL.GetReporting().FuncReport("Pass", "NO access to WB functionalities");
	} catch (NoSuchElementException | IOException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    public void clickHoldings() throws Exception {
	try {
	    Decorator();
	    mobileAction.FuncClick(Holdings, "Holdings");
	    mobileAction.waitForElementToVanish(progressBar);
	    mobileAction.FunCSwipeandScroll(AAVSymbol, true);

	} catch (NoSuchElementException | InterruptedException | IOException e) {
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

}
