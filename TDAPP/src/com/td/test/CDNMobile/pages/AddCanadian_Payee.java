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
import io.appium.java_client.pagefactory.iOSFindBy;

public class AddCanadian_Payee extends _CommonPage{
	
	private static AddCanadian_Payee AddCanadian_Payee;
	
	@iOSFindBy(xpath="//*[@label='Add Canadian Payee']")
	private MobileElement addCanadianPayee_header;
	
	@iOSFindBy(xpath="//*[@value='Enter your payee account number']")
	private MobileElement payee_accountno;
	
	@iOSFindBy(xpath="//*[@value='Optional']")
	private MobileElement description;

	@iOSFindBy(xpath="//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath="//XCUIElementTypeButton[@label='Continue']")
	private MobileElement continue_button;
	
	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	
	


	
	public synchronized static AddCanadian_Payee get() {
		if (AddCanadian_Payee == null) {
			AddCanadian_Payee = new AddCanadian_Payee();
		}
		return AddCanadian_Payee;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(20, TimeUnit.SECONDS)),
				this);
		
	}
	
	/**s
	 * This method will add canadian payee
	 * 
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
	public void addCanadianPayee_page() throws Exception {
		try {
			Decorator();
		
			String payee_value=getTestdata("Payee", "UserIDs");
			mobileAction.FuncClick(payee_accountno, "PayeeAccount");
			mobileAction.FuncSendKeys(payee_accountno, payee_value);
			
			
			String description_value=getTestdata("Description", "UserIDs");
			mobileAction.FuncClick(description, "Description");
			mobileAction.FuncSendKeys(description, description_value);
			
			mobileAction.FuncClick(done, "Done");
			mobileAction.FuncClick(continue_button, "Continue");
			Thread.sleep(5000);
			mobileAction.waitForElementToVanish(progressBar);
			
			
			
			}catch (NoSuchElementException | InterruptedException | IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}


}
}
