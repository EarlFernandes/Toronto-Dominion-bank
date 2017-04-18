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

public class MutualFunds extends _CommonPage {
	
	private static MutualFunds MutualFunds;
	
	
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/balanceText']")
	private MobileElement balancesTab;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/holdingText']")
	private MobileElement holdingsTab;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/timestamp']")
	private MobileElement timeStamp;
	
	public synchronized static MutualFunds get() {
		if (MutualFunds == null) {
			MutualFunds = new MutualFunds();
		}
		return MutualFunds;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(7, TimeUnit.SECONDS)),
				this);

	}
	
	
	
	/**
	 * @author Ashraf This method will verify the mutual fund details on Investing 
	 *         page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyMutualFundDetails() {

		Decorator();
		String text=null;

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS Elements
			} else {

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Investing") + "']",
						"Investing Header");
				
				mobileAction.verifyElementIsDisplayed(balancesTab, "Balances Tab");
				mobileAction.verifyElementIsDisplayed(holdingsTab, "Holdings Tab");
				
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("str_Total_Market_Value") + "']",
						"Total Market Value");
				
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("str_Total_Book_Value") + "']",
						"Total Book Value");
				text=timeStamp.getText();
				mobileAction.verifyElementIsDisplayed(timeStamp, text);
				

			}
		}

		catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	
	
	

}
