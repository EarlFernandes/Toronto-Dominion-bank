package com.td.test.TDI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TDIStartClaim extends _CommonPage {
 
	private static TDIStartClaim TDIStartClaim;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Start a Claim']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Start a Claim']")
	private MobileElement headClaim;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='I was in an accident']")
	private MobileElement accident;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@label,'hit-and-run')]")
	private MobileElement hitrun;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@label,'car was stolen')]")
	private MobileElement stolenCar;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@label,'another type of incident')]")
	//TODO@AndroidFindBy(xpath="")
	private MobileElement typeIncident;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='quick card']")
	@AndroidFindBy(id="com.td.insurance:id/go_to_insurance_card")
	private MobileElement insuranceCard;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='Call 9 1 1']")
	@AndroidFindBy(xpath="com.td.insurance:id/call_911")
	private MobileElement call911;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='My Accident History']")
	@AndroidFindBy(xpath="com.td.insurance:id/go_to_incident_history")
	private MobileElement acHistory;
	
	
	public synchronized static TDIStartClaim get(){
		if(TDIStartClaim == null){
			TDIStartClaim = new TDIStartClaim();
		}
		return TDIStartClaim;
	}
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}
	/**
	 * This method will verify the start a claim page header.
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
	public void verifyHeader(){
		Decorator();
		try{
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(headClaim, "start a claim");
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
	 * This method will click on i was in a accident.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void accident(){
		Decorator();
		try{
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(accident, "accident");
			mobileAction.FuncClick(accident, "i was in a accident");
			
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
	 * This method will click on hit and run.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void hitRun(){
		Decorator();
		try{
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(hitrun, "accident");
			mobileAction.FuncClick(hitrun, "hit and run");
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
	 * This method will click on my car was stolen.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void carStolen(){
		Decorator();
		try{
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(stolenCar, "accident");
			mobileAction.FuncClick(stolenCar, "car was stolen");
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
	 * This method will click on another type of incident.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void anotherIncident(){
		Decorator();
		try{
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(typeIncident, "accident");
			mobileAction.FuncClick(typeIncident, "car was stolen");
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
	 * This method will click on insurance card.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void insuranceCard(){
		Decorator();
		try{
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(insuranceCard, "accident");
			mobileAction.FuncClick(insuranceCard, "car was stolen");
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
	 * This method will click on call 911.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void callEmergency(){
		Decorator();
		try{
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(call911, "accident");
			mobileAction.FuncClick(call911, "car was stolen");
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
	 * This method will click on account history.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void accountHistory(){
		Decorator();
		try{
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(acHistory, "accident");
			mobileAction.FuncClick(acHistory, "car was stolen");
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
