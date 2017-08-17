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

public class AddCanadian_Payee extends _CommonPage {

	private static AddCanadian_Payee AddCanadian_Payee;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Add Canadian Payee']")
	private MobileElement addCanadianPayee_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Enter your payee account number']")
	private MobileElement payee_AccountNum;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='Optional']")
	private MobileElement description;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	private MobileElement continue_Button;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
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

	/**
	 * This method will add canadian payee
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
	public void addCanadianPayee_page() {
		try {
			Decorator();

			// String payee_value=getTestdata("Payee");
			String payee_value = getTestdata("Payee");
			mobileAction.FuncClick(payee_AccountNum, "PayeeAccount");
			mobileAction.FuncSendKeys(payee_AccountNum, payee_value);

			// String description_value=getTestdata("Description");
			String description_value = getTestdata("Description");
			mobileAction.FuncClick(description, "Description");
			mobileAction.FuncSendKeys(description, description_value);

			mobileAction.FuncClick(done, "Done");
			mobileAction.FuncClick(continue_Button, "Continue");
			Thread.sleep(5000);
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
