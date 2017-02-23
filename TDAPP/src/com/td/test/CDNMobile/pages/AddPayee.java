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
	
	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	
	@iOSFindBy(xpath = "//*[@label='Search for Canadian payees']")
	@AndroidFindBy(xpath = " ")
	private MobileElement searchForCanadianPayee ;
	
	@iOSFindBy(xpath = "//*[contains(@label,'found any matches. Please try again.')]")
	@AndroidFindBy(xpath = "")
	private MobileElement errorMessage;
	
	//String selectVal=getTestdata("Search");
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
	 */


	public void searchPayee(){
	Decorator();
	try{
			
			mobileAction.FuncClick(searchForCanadianPayee, "Search For Canadian Payee");
			mobileAction.FuncSendKeys(searchForCanadianPayee,selectVal);
			mobileAction.verifyElementIsDisplayed(errorMessage,"We haven't found any matches. Please try again.");
			
		
	
	}catch (NoSuchElementException | InterruptedException | IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}
	
}
