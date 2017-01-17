package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Managee_Payee extends _CommonPage { 

	private static Managee_Payee Managee_Payee;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
	private MobileElement accesscard;
	
	
	//@iOSFindBy(xpath="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeLink/XCUIElementTypeStaticText")
	@iOSFindBy(xpath="//*[@label='MY PAYEES']")
	private MobileElement myPayees;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	private MobileElement secondAccessCard;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
	private MobileElement thirdAccessCard;
	
	@iOSFindBy(xpath="//*[@label='Add Canadian Payees Now']")
	private MobileElement addCanadianPayee;
	
	@iOSFindBy(xpath="//*[@label='Manage Payees']")
	private MobileElement managePayeeHeader;
	
	@iOSFindBy(xpath="//*[@label='Manage Payees']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Payees']")
	private MobileElement managePayees;
	
	@iOSFindBy(xpath="//*[@label='Add Canadian Payee']")
	@AndroidFindBy(xpath = "//[@content-desc='Add Canadian Payee']")
	private MobileElement addPayee;
	
	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	
	
	public synchronized static Managee_Payee get() {
		if (Managee_Payee == null) {
			Managee_Payee = new Managee_Payee();
		}
		return Managee_Payee;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}
	

	/**
	 * This method will verifyMultipleAccessCards in ManagePayee
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


	public void verifyMultipleAccessCard(){
	Decorator();
	try{
	boolean flag=accesscard.isDisplayed();
	
	if(flag){
			mobileAction.verifyElementIsDisplayed(myPayees,"My Payees");
			mobileAction.FuncClick(accesscard, "Accesscard");
			mobileAction.FuncClick(secondAccessCard, "Second Access Card");
			Thread.sleep(2000);
			mobileAction.verifyElementIsDisplayed(myPayees,"My Payees");
			mobileAction.FuncClick(accesscard, "Accesscard");
			mobileAction.FuncClick(thirdAccessCard, "Second Access Card");
			Thread.sleep(2000);
			mobileAction.verifyElementIsDisplayed(addCanadianPayee, "Add Canadian Payee");
		
		
	}
	}catch (NoSuchElementException | InterruptedException | IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}
	
	/**
	 * This method verify the Add canadian Payee Now button
	 * 
	 * 
	 *
	 * In case an exception occurs while clicking over the element.
	 * @throws InterruptedException 
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyAddCanadianPayeeButton()  {
		Decorator();
		try {
			
			mobileAction.verifyElementIsDisplayed(managePayeeHeader, "Manage Payees");
			mobileAction.verifyElementIsDisplayed(addCanadianPayee, "Add Canadian Payee");
			
		} catch (NoSuchElementException | IOException   e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
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


	public void addPayee(){
	Decorator();
	try{
		
			mobileAction.verifyElementIsDisplayed(managePayees,"Manage Payees");
			mobileAction.FuncClick(addPayee,"Add Canadian Payee");
			mobileAction.waitForElementToVanish(progressBar);
			
		
	
	}catch (NoSuchElementException | InterruptedException | IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}

	

}






