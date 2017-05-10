package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class AddPayee extends _CommonPage {
	
	private static AddPayee AddPayee;
	
	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@label='Search for Canadian payees']")
	private MobileElement searchForCanadianPayee ;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'found any matches. Please try again.')]")
	private MobileElement errorMessage;
	
	String selectVal=getTestdata("Search");
	
	
	
	public synchronized static AddPayee get() {
		if (AddPayee == null) {
			AddPayee = new AddPayee();
		}
		return AddPayee;
	}
	
	

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will click on add payee button
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


	public void searchPayee(){
	Decorator();
	try{
			
			mobileAction.FuncClick(searchForCanadianPayee, "Search For Canadian Payee");
			mobileAction.FuncSendKeys(searchForCanadianPayee,selectVal);
			mobileAction.verifyElementIsDisplayed(errorMessage,"We haven't found any matches. Please try again.");
			
		
	
	}catch (NoSuchElementException e) {
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
	
}
