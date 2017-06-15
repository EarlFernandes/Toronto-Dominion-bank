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

public class Transaction extends _CommonPage{

	private static Transaction Transaction;
	
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transaction']")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transaction']")
	 private MobileElement transacHeader;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Transaction Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Transaction Date']")
	 private MobileElement transacDate;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@text='Posted Date']")
	 private MobileElement postedDate;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Card')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Card')]")
	 private MobileElement card;
	
	public synchronized static Transaction get() {
		if (Transaction == null) {
			Transaction = new Transaction();
		}
		return Transaction;
	    }

	    private void Decorator() {
		PageFactory.initElements(
			new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
			this);

	    }
	    /**
	     * This method will verify the transaction page
	     * button.
	     * 
	     * @return void
	     * @throws InterruptedException 
	     * 
	     * @throws IOException
	     *             If there is problem while reporting.
	     * @throws NoSuchElementException
	     *             In case the element is not found over the screen.
	     */
	    public void verifyTransac() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(transacHeader, "Transaction Header");
			mobileAction.verifyElementIsDisplayed(transacDate, "Transaction date");
			mobileAction.verifyElementIsDisplayed(postedDate, "Posted Date");
			mobileAction.verifyElementIsDisplayed(card, "Card");

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
	    
	  
}
