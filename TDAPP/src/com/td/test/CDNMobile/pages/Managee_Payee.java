package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

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
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Add Canadian Payee']")
	private MobileElement addCanadianPayee;
	
	@iOSFindBy(xpath="//*[@label='Manage Payees']")
	private MobileElement managePayeeHeader;
	
	@iOSFindBy(xpath="//*[@label='Manage Payees']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement managePayees;
	
	@iOSFindBy(xpath="//*[@label='Add Canadian Payee']")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
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
	 * This method will verify text within elements for the manage payees page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyMyPayeesTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("billsNavRowManagePayee") + "']", "Manage Payees title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				//System.out.println("source : "+ ((AppiumDriver) CL.GetDriver()).getPageSource());
				// FIXME: Hint is not seen
				//final WebElement searchForPayee = mobileAction.verifyWebElementUsingXPath("//label[@id='searchLabel']", "Search for payee");
				final WebElement all = mobileAction.verifyWebElementUsingXPath("(//li[@ng-repeat='label in labels'])[1]", "All");
				final WebElement canada = mobileAction.verifyWebElementUsingXPath("(//li[@ng-repeat='label in labels'])[2]", "Canada");
				final WebElement us = mobileAction.verifyWebElementUsingXPath("(//li[@ng-repeat='label in labels'])[3]", "US");
				final WebElement myPayees = mobileAction.verifyWebElementUsingXPath("//a[@id='myPayees']", "My payees");
				if (!mobileAction.verifyTextEquality(all.getText().trim(), mobileAction.getAppString("str_all")) ||
						!mobileAction.verifyTextEquality(canada.getText().trim(), mobileAction.getAppString("ca")) || 
						!mobileAction.verifyTextEquality(us.getText().trim(), mobileAction.getAppString("us")) ||
						!mobileAction.verifyTextEquality(myPayees.getText().trim(), mobileAction.getAppString("str_my_payees"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for a specific payee page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifySpecificPayeeTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement firstPayee = mobileAction.verifyWebElementUsingXPath("//div[@ng-if='payee.AccountNO' and text()='" + getTestdata("Payee") + "']", "Payee");
				firstPayee.click();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("mng_payee_view_title") + "']", "View title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement name = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[1]", "name");
				final WebElement address = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[2]", "address");
				final WebElement account = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[4]", "account");
				final WebElement description = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[5]", "description");
				if (!mobileAction.verifyTextEquality(name.getText().trim(), mobileAction.getAppString("str_payee_name")) ||
						!mobileAction.verifyTextEquality(address.getText().trim(), mobileAction.getAppString("str_payee_address")) || 
						!mobileAction.verifyTextEquality(account.getText().trim(), mobileAction.getAppString("str_payee_account")) ||
						!mobileAction.verifyTextEquality(description.getText().trim(), mobileAction.getAppString("str_description"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the search payees page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifySearchPayeesTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("add_payee_title") + "']", "Add Payee title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				//System.out.println("source : "+ ((AppiumDriver) CL.GetDriver()).getPageSource());
				// FIXME: Hint is not seen
				//final WebElement searchForPayee = mobileAction.verifyWebElementUsingXPath("//label[@id='searchLabel']", "Search for payee");
				final WebElement payeeCountry = mobileAction.verifyWebElementUsingXPath("//div[@class='switch-title ng-binding']", "Payee Country");
				final WebElement canada = mobileAction.verifyWebElementUsingXPath("(//li[@ng-repeat='label in labels'])[1]", "Canada");
				final WebElement us = mobileAction.verifyWebElementUsingXPath("(//li[@ng-repeat='label in labels'])[2]", "US");
				final WebElement note = mobileAction.verifyWebElementUsingXPath("//div[@class='placeholder ng-binding']", "My payees");
				if (!mobileAction.verifyTextEquality(payeeCountry.getText().trim(), mobileAction.getAppString("payee_country")) ||
						!mobileAction.verifyTextEquality(canada.getText().trim(), mobileAction.getAppString("ca")) || 
						!mobileAction.verifyTextEquality(us.getText().trim(), mobileAction.getAppString("us")) ||
						!mobileAction.verifyTextEquality(note.getText().trim(), mobileAction.getAppString("add_payee_search_instruction"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
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
		mobileAction.verifyElementIsDisplayed(managePayees, "Manage Payees");
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
			Thread.sleep(10000);
	
	}catch (NoSuchElementException | InterruptedException | IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}

	

}






