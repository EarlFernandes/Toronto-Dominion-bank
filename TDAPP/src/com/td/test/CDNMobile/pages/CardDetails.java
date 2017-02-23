package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class CardDetails extends _CommonPage {

private static CardDetails CardDetails;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/action_delete']")
	private MobileElement deleteicon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle' and @text='Delete Card']")
	private MobileElement popup;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Confirm']")
	private MobileElement confirmdelete;
	
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/always_on_switch' and @text='No']")
	private MobileElement enableon;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_save' and @text='Save']")
	private MobileElement save;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/enable_always_on_text_view' and @text='Enable Always On']")
	private MobileElement verifypayment;
	
	
	
	
	
	public synchronized static  CardDetails get() {
		if ( CardDetails == null) {
			CardDetails = new  CardDetails();
		}
		return CardDetails;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}
	

/**
 * This method will click the delete icon
 * @throws NoSuchElementException
 *             In case the element is not found over the screen
 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
public void deletecard() {


	Decorator();
	try {
		mobileAction.FuncClick(deleteicon, "Click Delete Card");
		mobileAction.verifyElementIsDisplayed(popup,"PopUp Diplayed");
		mobileAction.FuncClick(confirmdelete, "Click Confirm Delete");
		} catch (NoSuchElementException|InterruptedException |IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}
/**
 * This method will save default card details
 * @throws NoSuchElementException
 *             In case the element is not found over the screen
 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
public void enableToggleButton() {


	Decorator();
	try {
		mobileAction.verifyElementIsDisplayed(verifypayment, "Verify Payment Mode");
		mobileAction.FuncClick(enableon, "Enable On");
		mobileAction.FuncClick(save, "Click Save Button");
		} catch (NoSuchElementException|InterruptedException |IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}




}
