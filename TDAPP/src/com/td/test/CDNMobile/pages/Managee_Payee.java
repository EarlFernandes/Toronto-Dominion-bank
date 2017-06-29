package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	
	//@iOSFindBy(xpath="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
	@iOSFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Access Card']/../../XCUIElementTypeOther[2]")
	private MobileElement accesscard;
		
	//@iOSFindBy(xpath="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeLink/XCUIElementTypeStaticText")
	@iOSFindBy(xpath="//*[@label='MY PAYEES']")
	private MobileElement myPayees;
	
	//@iOSFindBy(xpath="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@iOSFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText[@label='ACCESS CARD']/../../XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/listView']/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement secondAccessCard;
	
	//@iOSFindBy(xpath="//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
	@iOSFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText[@label='ACCESS CARD']/../../XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/listView']/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement thirdAccessCard;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[contains(@label='Add Canadian')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Add Canadian Payee']")
	private MobileElement addCanadianPayee;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@label='Manage Payees']")
	private MobileElement managePayeeHeader;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@label='Manage Payees']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Payees']")
	private MobileElement managePayees;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@label='Add Canadian Payee']")
	@AndroidFindBy(xpath = "//[@content-desc='Add Canadian Payee']")
	private MobileElement addPayee;
	
	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */


	public void verifyMultipleAccessCard(){
	Decorator();
	try{
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
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
		}else{
			//For android, using webview to handle
			((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); 
			WebElement accessCard = CL.GetDriver().findElement(By.cssSelector("div.dropdown-holder"));
			accessCard.click();
			Thread.sleep(2000);
			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");
			mobileAction.FuncClick(secondAccessCard, "Second Access Card");
			Thread.sleep(2000);
			((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");
			WebElement mypayees_android = CL.GetDriver().findElement(By.id("myPayees"));
			mobileAction.verifyElementIsDisplayed((MobileElement)mypayees_android,"My Payees");
			accessCard = CL.GetDriver().findElement(By.cssSelector("div.dropdown-holder"));
			accessCard.click();
			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");
			mobileAction.FuncClick(thirdAccessCard, "Second Access Card");
			Thread.sleep(2000);
			((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td"); 
			WebElement addCanadianPayeeButton = CL.GetDriver().findElement(By.cssSelector("button.primary-button.ng-binding.ng-scope"));
			mobileAction.verifyElementIsDisplayed((MobileElement)addCanadianPayeeButton, "Add Canadian Payee");
			((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");
		}
	} catch (NoSuchElementException e) {
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyAddCanadianPayeeButton()  {
		Decorator();
		try {
		mobileAction.verifyElementIsDisplayed(managePayees, "Manage Payees");
		mobileAction.verifyElementIsDisplayed(addCanadianPayee, "Add Canadian Payee");
		}  catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */


	public void addPayee(){
	Decorator();
	try{
		
			mobileAction.verifyElementIsDisplayed(managePayees,"Manage Payees");
			mobileAction.FuncClick(addPayee,"Add Canadian Payee");
			mobileAction.waitForElementToVanish(progressBar);
			
		
	
	} catch (NoSuchElementException e) {
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






