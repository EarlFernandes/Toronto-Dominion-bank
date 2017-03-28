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

public class StatementBalance extends _CommonPage{
	private static StatementBalance StatementBalance;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay']") 
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.td:id/btn_pay']")
	 private MobileElement payBtn;
	
	public synchronized static StatementBalance get() {
		if (StatementBalance == null) {
			StatementBalance = new StatementBalance();
		}
		return StatementBalance;
	    }

	    private void Decorator() {
		PageFactory.initElements(
			new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
			this);

	    }
	    
	    /**
	     * This method will verify the statement Balance Details
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
	    public void verifyStatementBalanceDetails() throws InterruptedException {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(payBtn, "Pay Button");
			mobileAction.FuncClick(payBtn, "pay Button");
			Thread.sleep(3000);
			
		} catch (NoSuchElementException | IOException e) {
		    System.err.println("TestCase has failed.");
		    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	    } 
}
