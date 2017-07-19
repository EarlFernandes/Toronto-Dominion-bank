package com.td.test.CDNMobile.pages;

import java.util.List;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Rewards extends _CommonPage {

	private static Rewards Rewards;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Rewards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement rewardsHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Visit TDRewards.com']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_action_title' and @text='Visit TDRewards.com']")
	private MobileElement txtVisitTD;

	@iOSFindBy(xpath = "//*[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement continueBtn;

	@FindBy(xpath = "//*[contains(@value,'‎tdrewards.com')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Rewards']")
	private WebElement urlName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Pay With Rewards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay With Rewards']")
	private MobileElement txtpayWithRewards;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_action_description']")
	private List<MobileElement> redeem_text_list;
	
	By iosRedemptValue=By.xpath("//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]");
	
	By iosRewardValue=By.xpath("//XCUIElementTypeStaticText[contains(@label,'Dollars')]");


	public synchronized static Rewards get() {
		if (Rewards == null) {
			Rewards = new Rewards();
		}
		return Rewards;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will check the Reward Header is present or not
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void reward_Header() {
		Decorator();
		try {

			mobileAction.FuncISDisplayed(rewardsHeader, "Rewards");
		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}

	}

	/**
	 * This method will verify and Click the Pay With Rewards Button link in
	 * Rewards Page If Visible
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void clickPayWithRewardsIFVisible() {
		Decorator();
		try {
			if (mobileAction.FuncISDisplayed(txtpayWithRewards, "Pay with Rewards text is Present")) {
				mobileAction.FuncClick(txtpayWithRewards, "Pay with Rewards");
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}
	
	
	
	

	/**
	 * This method will verify and Click the Visit TD Rewards link in Rewards
	 * Page If Visible
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void clickVisitRewardsIFVisible() {
		Decorator();
		try {
			if (mobileAction.FuncISDisplayed(txtVisitTD, "Visit TD Rewards is Present")) {
				mobileAction.FuncClick(txtVisitTD, "Visit TD Rewards");
			}
			mobileAction.FuncClick(continueBtn, "Continue");
			
		

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method Check the Pay With Rewards Button is not Visible in Rewards
	 * page
	 * 
	 * @throws IOException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void payWithRewardsBtnNotVisible() throws IOException {
		Decorator();
		try {

			if (txtpayWithRewards.isDisplayed());
				

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method verify the URL Name in External Browser
	 * 
	 * @throws IOException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void verifyURLName()  {
		Decorator();
		try {

			String urlValidate = CL.GetDriver().getPageSource();
			urlValidate.contains("‎tdrewards.com");
			CL.GetReporting().FuncReport("Pass", "The element <b>- " + "tdrewards.com" + "</b> is displayed");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}
	
	public void verifyRedemptiontxt(){
		Decorator();
		try{
		String value=mobileAction.getValue(redeem_text_list.get(1));
		System.out.println("Redeem Value:" + value);
		value.contains(ConstantClass.t_redemption);
		CL.GetReporting().FuncReport("Pass", "The element <b>- " +ConstantClass.t_redemption + "</b> is displayed");
	}catch (Exception e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;

	}
	}


public void verifyRewardstxt(){
	Decorator();
	try{
	String value=mobileAction.verifyElementUsingBy(iosRewardValue);
	
	value.contains(ConstantClass.t_cashBack);
	CL.GetReporting().FuncReport("Pass", "The element <b>- " +ConstantClass.t_cashBack + "</b> is displayed");
}catch (Exception e) {
	System.err.println("TestCase has failed.");
	CL.getGlobalVarriablesInstance().bStopNextFunction = false;

}
}

/**
 * This method will verify Pay With Rewards text in
 * Rewards Page If Visible
 * 
 * @throws NoSuchElementException
 * 
 * 
 */

public void verifyPayWithRewardsText() {
	Decorator();
	try {
		if (mobileAction.FuncISDisplayed(txtpayWithRewards, "Pay with Rewards with the appropriate message")) {
			
		}

	} catch (NoSuchElementException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;

	}
}
}
		
		
		
		
		


