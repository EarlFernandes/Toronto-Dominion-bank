package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HoldingDetails extends _CommonPage {
    private static HoldingDetails HoldingDetails;

    @iOSFindBy(xpath = "//*[@label='Buy']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement Buy;

    @iOSFindBy(xpath = "//*[@label='Sell']")
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement Sell;

    @iOSFindBy(xpath = "//*[@label='Trade']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
    private MobileElement trade_header;

	@iOSFindBy(xpath = "//*[@label='Holding Details']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Holding Details']")
	private MobileElement HoldingDetails_header;

    @iOSFindBy(xpath = "//*[contains(@label,'Good 'til, Day')]")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Trade']")
    private MobileElement Good;

    @iOSFindBy(xpath = "//*[@label='Agree']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Agree']")
    private MobileElement AgreeButton;

    @iOSFindBy(xpath = "//*[@label='In progress']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
    private MobileElement progressBar;

    public synchronized static HoldingDetails get() {
	if (HoldingDetails == null) {
	    HoldingDetails = new HoldingDetails();
	}
	return HoldingDetails;
    }

    private void Decorator() {
	PageFactory.initElements(
		new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)),
		this);
    }

    public void verify_Account_CADCash() {
	try {
	    Decorator();
	    mobileAction.FuncClick(Buy, "Buy");
	    Thread.sleep(3000);
	    String verify_trade = "Verifying Trade Page Header";
	    mobileAction.verifyElementIsDisplayed(trade_header, verify_trade);
	    mobileAction.verifyElementIsDisplayed(Good, "Good 'til, Day");
	    mobileAction.FuncClickBackButton();
	    mobileAction.FuncClick(AgreeButton, "Agree");
	    mobileAction.waitForElementToVanish(progressBar);
	    mobileAction.FuncClick(Sell, "Sell");
	    Thread.sleep(3000);
	} catch (IOException | NoSuchElementException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

    }

    public void verify_Account_US_MarginShort() {
	try {
	    Decorator();
	    mobileAction.FuncClick(Buy, "Buy");
	    Thread.sleep(3000);
	    String verify_trade = "Verifying Trade Page Header";
	    mobileAction.verifyElementIsDisplayed(trade_header, verify_trade);
	    mobileAction.verifyElementIsDisplayed(Good, "Good 'til, Day");
	    mobileAction.FuncClickBackButton();
	    mobileAction.FuncClick(AgreeButton, "Agree");
	    mobileAction.waitForElementToVanish(progressBar);
	    mobileAction.FuncClick(Sell, "Sell");
	    Thread.sleep(3000);
	} catch (IOException | NoSuchElementException | InterruptedException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

	
    }
    /**
     * This method will click Buy button in HoldingDetails page.
     * 
     * @return void
     * @throws InterruptedException 
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */
    public void click_BuyButton(){
    	
    	
    	try {
    		Decorator();
    		String verify_HoldingDetails = "Verifying HoldingDetails Page Header";
    		mobileAction.verifyElementIsDisplayed(HoldingDetails_header, verify_HoldingDetails);
    		mobileAction.FuncClick(Buy, "Buy");
    		
    		}
    	 catch (IOException | NoSuchElementException | InterruptedException e) {
    			e.printStackTrace();
    	}
    	
    }


}
