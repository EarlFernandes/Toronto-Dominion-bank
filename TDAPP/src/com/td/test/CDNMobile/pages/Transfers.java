package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Transfers extends _CommonPage {

	private static Transfers Transfers;

	/*@iOSFindBy(xpath = "//*[@label='Pending Interac e-Transfer View pending and cancelled Interac e-']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/canTotal' and @text='View pending and cancelled Interac e-Transfers']")
	private MobileElement pending_transfer;*/
	
	public synchronized static Transfers get() {
		if (Transfers == null) {
			Transfers = new Transfers();
		}
		return Transfers;
	}

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Pending Interac e-Transfer')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'View pending and cancelled Interac e-Transfers')]")  //changed by rashmi
	private MobileElement pending_Transfer;


	@iOSFindBy(xpath= "//XCUIElementTypeOther[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement transfers_Header;
	

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Interac e-Transfer')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Interac e-Transfer')]")
	private MobileElement Interac_e_Transfer_Button;
	
	@iOSFindBy(xpath= "//XCUIElementTypeStaticText[@label='Between My Accounts']")  //changed by rashmi
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Between My Accounts')]")
	private MobileElement btw_My_Accnts;
	
	@iOSFindBy(xpath="//XCUIElementTypeActivityIndicator[@label='In progress']")
	private MobileElement progrees_Bar;
	
	@iOSFindBy(xpath= "//XCUIElementTypeStaticText[contains(@label,'Manage Recipients')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Recipients']")
	private MobileElement manageRecipient;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='com.td' and @instance='2']")
	private MobileElement TD;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Always']")
	private MobileElement alwaysBtn;

	@iOSFindBy(xpath="//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	String transfer_Header_Value = "Transfers";
	String confirm_Header = "Confirm";

	String confirm_transfer_value = "Thank you!";
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@label='Manage Contacts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Contacts']")
	private MobileElement manageContacts;
	
	

	/**
	 * This method will click on Between my accounts button
	 * 
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 */
	public void clickBetweenMyAccountsTransfers() {
		try {
			Decorator();
			//mobileAction.FuncClick(TD, "TDAPP");
			//mobileAction.FuncClick(alwaysBtn, "Always");
			mobileAction.verifyElementIsDisplayed(transfers_Header, "Transfer");
			mobileAction.FuncClick(btw_My_Accnts, "Between my Accounts");
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

	/**
	 * This method will click on Interac e-transfers button
	 * 
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 */
	public void clickInterac_e_Transfer() {
		Decorator();
		try {
			Thread.sleep(5000);
			mobileAction.verifyElementIsDisplayed(transfers_Header, "Transfer Header");	//added by Ashraf
			mobileAction.FuncClick(Interac_e_Transfer_Button, "Interac e_Transfer");
			//mobileAction.waitForElementToVanish(progrees_Bar);
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
	 * This method will click on Manage Recipients
	 * 
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
	 * 
	 */
	public void clickManageRecipients() {
		try {
			Decorator();
			mobileAction.FuncClick(manageRecipient, "Manage Recipients");
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

	/**
	 * This method will click on Pending Transfers button
	 * 
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
	 * 
	 */
	public void clickPendingTransfers() {
		try {
			Decorator();
			//mobileAction.FuncClick(TD, "TDAPP");
			//mobileAction.FuncClick(alwaysBtn, "Always");
			mobileAction.verifyElementIsDisplayed(transfers_Header, "Transfer");
			mobileAction.FuncClick(pending_Transfer, "Pending Transfers");
			Thread.sleep(5000);
			
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

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	/**
	 * This method will click on verify the Transfer Header
	 * 
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
	public void verifyTransferHeader() {

	
		Decorator();
		try {
			
			mobileAction.verifyElementIsDisplayed(transfers_Header, "Transfer");
			
		}catch (NoSuchElementException e) {
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
	 * @author Ashraf
	 * This method will click on Manage Contacts Link.
	 * 
	 * 
	 * @return  NoSuchElementException
	 * @return  IOException
	 */
	public void clickManageContactsLink() {
	
		Decorator();
		try {
			
			mobileAction.verifyElementIsDisplayed(transfers_Header, "Transfer Header");
			mobileAction.FuncClick(manageContacts, "Manage Contacts Link");
			
		} catch (NoSuchElementException   | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
