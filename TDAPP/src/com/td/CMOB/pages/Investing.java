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

public class Investing extends _CommonPage{
	private static Investing Investing;
	
	@iOSFindBy(xpath = " //*[label='Investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Investing']")
	private MobileElement investing_header;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Trade')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade' and @index='0']")
	private MobileElement trade;
	
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/contentLayout' and @index='0']")
	private MobileElement placedorder;
	
	@iOSFindBy(xpath = "//*[@label='Trade']")
	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Watchlists')]")
	@AndroidFindBy(xpath = "//android.widget.TableRow[@resource-id='com.td:id/watchlistRow']")
	private MobileElement watchLists;
	
	String platformName=CL.getTestDataInstance().getMobilePlatForm();
	
	
	public synchronized static Investing get() {
		if (Investing == null) {
			Investing = new Investing();
		}
		return Investing;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");
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
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyInvesting() {
	Decorator();
		try {
			String verify_investing = "Verifying Investing Page Header";
			mobileAction.verifyElementIsDisplayed(investing_header,verify_investing);
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
		

	}
	
	public void clickPlacedorder() {

		try {
			Decorator();
			
			if(platformName.equalsIgnoreCase("ios")){
				String placeorder="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]"
						+ "/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]";
				
				CL.GetDriver().findElement(By.xpath(placeorder)).click();
				}else{
			mobileAction.FuncClick(placedorder, "Placed order");
		} 
		}catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	


	public void clickWatchLists(){
	
	try {
		mobileAction.FuncClick(watchLists, "watchLists");
		mobileAction.waitForElementToVanish(progressBar);
	} catch (NoSuchElementException | InterruptedException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}

}

