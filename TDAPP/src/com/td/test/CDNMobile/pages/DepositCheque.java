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

public class DepositCheque  extends _CommonPage{
	private static DepositCheque DepositCheque;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Deposit Cheque']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Mobile Deposit']")
	private MobileElement depositCheque_Header;
	
	String t_DepositCheque_Header="Deposit Cheque";
	
	public synchronized static DepositCheque get() {
		if (DepositCheque == null) {
			DepositCheque = new DepositCheque();
		}
		return DepositCheque;
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(10, TimeUnit.SECONDS)),
				this);
		

	}
	
	/**
	 * This method is verify the DepositCheque Header
	 * 
	 * @return void
	 * @throws IOException 
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 *
	 */
	public void verifyDepositCheque()  {

	
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(depositCheque_Header, t_DepositCheque_Header);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
		
	}
}
