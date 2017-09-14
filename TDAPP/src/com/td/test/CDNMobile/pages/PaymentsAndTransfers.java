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

public class PaymentsAndTransfers extends _CommonPage{

	private static PaymentsAndTransfers PaymentsAndTransfers;
	
	public synchronized static PaymentsAndTransfers get() {
		if (PaymentsAndTransfers == null) {
			PaymentsAndTransfers = new PaymentsAndTransfers();
		}
		return PaymentsAndTransfers;
	}

	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Manage Autodeposit']") //TODO::IOSXpath
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payments_and_transfers_auto_deposit_title']")
	private MobileElement autoDepositLnk;
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	
	/**
	 * This method will verify click personal profile Details button then go to
	 * personal profile details page
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
	public void clickManageAutoDeposit() {

		Decorator();
		try {

			mobileAction.FuncClick(autoDepositLnk, "Manage Autodeposit Link");
		
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
}
