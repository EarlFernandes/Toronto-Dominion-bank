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

public class Interac_e_Transfer extends _CommonPage {
	private static Interac_e_Transfer Interac_e_Transfer;
	

	@iOSFindBy(xpath= "//XCUIElementTypeOther[@label='Add Recipient']")
	private MobileElement addRecipient_Interac;
	

	@iOSFindBy(xpath= "//*[@label='Interac e-Transfer']")
	private MobileElement interac_Header;
	
	@iOSFindBy(xpath="//*[@label='In progress']")
	private MobileElement progrees_bar;
	
	public synchronized static Interac_e_Transfer get() {
		if (Interac_e_Transfer == null) {
			Interac_e_Transfer = new Interac_e_Transfer();
		}
		return Interac_e_Transfer;
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	

	}
	
	/**
	 * This method will click on AddRecipient in Interac e-transfers Screen
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void addRecipient() {


		Decorator();
		try {
			interac_Header.isDisplayed();
			mobileAction.FuncClick(addRecipient_Interac, "AddRecipient");
			mobileAction.waitForElementToVanish(progrees_bar);
			
			
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
