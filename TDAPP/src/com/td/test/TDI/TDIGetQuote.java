package com.td.test.TDI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TDIGetQuote extends _CommonPage{
	
private static TDIGetQuote TDIGetQuote;
	
@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Get a Quote']")
@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Get A Quote']")
private MobileElement quoteHeader;

@iOSXCUITFindBy(xpath="//XCUIElementTypeImage/following::XCUIElementTypeStaticText[@label='ATV']")
@AndroidFindBy(xpath="//android.widget.TextView[@text='ATV']")
private MobileElement atvQuote;

@iOSXCUITFindBy(xpath="//XCUIElementTypeImage/following::XCUIElementTypeStaticText[@label='Motorcycle']")
@AndroidFindBy(xpath="//android.widget.TextView[@text='Motorcycle']")
private MobileElement motorQuote;
	
@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/following-sibling::XCUIElementTypeAlert[@label='Get A Quote']")
@AndroidFindBy(id="com.td.insurance:id/get_a_quote_action_btn")
private MobileElement quoteNotifi;	

@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/following::XCUIElementTypeButton[contains(@label,'Continue')]")
@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.td.insurance:id/get_a_quote_action_btn']")
private MobileElement continueBtn;	

@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='Return to TD Insurance']")
private MobileElement returntoQuote;

@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[contains(@value,'Toronto-Dominion Bank') and @label='Address' and @name='URL']")
@AndroidFindBy(xpath="//android.view.View[contains(@text,'recreational vehicle insurance') or contains(@text,'Motorcycle insurance quote')]")
private MobileElement webPage;

	public synchronized static TDIGetQuote get(){
		if(TDIGetQuote == null){
			TDIGetQuote = new TDIGetQuote();
		}
		return TDIGetQuote;
	}
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}
	/**
	 * This method will verify the quote page and click on the ATV quote .
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void getATVQuote(){
		Decorator();
		try{
			mobileAction.verifyElementIsDisplayed(quoteHeader, "get a quote page");
			mobileAction.FuncSwipeWhileElementNotFound(atvQuote, true, 2, "up");
			mobileAction.verifyElementIsDisplayed(quoteNotifi, "quoteNotifi");
			mobileAction.FuncClick(continueBtn, "continue to my quote");
			Thread.sleep(3000);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
				mobileAction.waitForElement(webPage);
				mobileAction.verifyElementIsDisplayed(webPage,"web page");
				mobileAction.FuncClick(returntoQuote, "return to quote page");
			}
			else{
				mobileAction.waitForElement(webPage);
				mobileAction.verifyElementIsDisplayed(webPage,"web page");
				mobileAction.FuncClickBackButton();
			}
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will verify the quote page and click on the motor cycle quote .
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void getMotorCycleQuote(){
		Decorator();
		try{
			mobileAction.verifyElementIsDisplayed(quoteHeader, "get a quote page");
			mobileAction.FuncSwipeWhileElementNotFound(motorQuote, true, 2, "up");
			mobileAction.verifyElementIsDisplayed(quoteNotifi, "quoteNotifi");
			mobileAction.FuncClick(continueBtn, "continue to my quote");
			Thread.sleep(3000);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
				mobileAction.waitForElement(webPage);
				mobileAction.verifyElementIsDisplayed(webPage,"URL header");
				mobileAction.FuncClick(returntoQuote, "return to quote page");
				}
				else{
					mobileAction.waitForElement(webPage);
					mobileAction.verifyElementIsDisplayed(webPage,"web page");
					mobileAction.FuncClickBackButton();
					}
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
}
