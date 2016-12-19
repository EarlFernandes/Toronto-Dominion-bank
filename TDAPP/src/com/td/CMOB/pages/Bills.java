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

public class Bills extends _CommonPage {
	
private static Bills Bills;

@iOSFindBy(xpath="//*[@label='Pay Bill Pay a Canadian bill']")
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay a Canadian bill' and @index='1']")
private MobileElement pay_cananda_bill;

@iOSFindBy(xpath="//*[@label='Manage Payees Add, edit or delete a Canadian or U.S. Payee']")
@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Payees']")
private MobileElement manage_payees;


@iOSFindBy(xpath ="//*[@label='Pay U.S. Bill Pay a U.S. bill']")
@AndroidFindBy(xpath = "//android.widget.TextView[ @text='Pay U.S. Bills' and @index='0']")
private MobileElement pay_us_bills;

@iOSFindBy(xpath = "//*[@label ='Bills']")
@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Bills']")
private MobileElement bills_header;

@iOSFindBy(xpath="//*[@label='In progress']")
private MobileElement progrees_bar;



	public synchronized static Bills get() {
		if (Bills == null) {
			Bills = new Bills();
		}
		return Bills;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");

	}
	
	public void click_pay_canadian_bill() {
		Decorator();
		try {
			Decorator();
			mobileAction.FuncClick(pay_cananda_bill,"Pay Canada Bill");
			mobileAction.waitForElementToVanish(progrees_bar);
		}catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	 * This method will click on the Manage_payees button on Bill page
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
	
	public void click_ManagePayees() {
		Decorator();
		try {
			Decorator();
			mobileAction.FuncClick(manage_payees,"Manage Payees");
			mobileAction.waitForElementToVanish(progrees_bar);
		
			
			
		}catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will click on the Pay Us bill button on Bill page
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
	public void click_pay_US_bill() {

		try {
			Decorator();
			
			String Bill_header ="Verifying Bill Page Header";
			
			//mobileAction.verifyElementIsDisplayed(bills_header, Bill_header);
			mobileAction.FuncClick(pay_us_bills, "Pay US Bills");
			mobileAction.waitForElementToVanish(progrees_bar);
			
			}
		    catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	

}

