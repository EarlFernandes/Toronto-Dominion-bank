package com.td.test.CDNMobile.pages;

import java.util.List;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Rewards extends _CommonPage {

	private static Rewards Rewards;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Rewards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement rewardsHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/textview_action_title'])[1]")
	private MobileElement txtVisitTD;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement visitTDContinue;

	@iOSXCUITFindBy(accessibility = "URL")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar' or @resource-id='com.sec.android.app.sbrowser:id/location_bar_edit_text']")
	private MobileElement visitTDUrl;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/textview_action_title'])[2]")
	private MobileElement txtpayWithRewards;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_action_description']")
	private List<MobileElement> redeem_text_list;

	By iosRedemptValue = By.xpath("//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]");

	By iosRewardValue = By.xpath("//XCUIElementTypeStaticText[contains(@label,'Dollars')]");

	public synchronized static Rewards get() {
		if (Rewards == null) {
			Rewards = new Rewards();
		}
		return Rewards;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

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

			if (txtpayWithRewards.isDisplayed())
				;

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

	public void verifyURLName() {
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

	public void verifyRedemptiontxt() {
		Decorator();
		try {
			String value = mobileAction.getValue(redeem_text_list.get(1));
			System.out.println("Redeem Value:" + value);
			value.contains(ConstantClass.t_redemption);
			CL.GetReporting().FuncReport("Pass",
					"The element <b>- " + ConstantClass.t_redemption + "</b> is displayed");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	public void verifyRewardstxt() {
		Decorator();
		try {
			String value = mobileAction.verifyElementUsingBy(iosRewardValue);
			value.contains(ConstantClass.t_cashBack);
			CL.GetReporting().FuncReport("Pass", "The element <b>- " + ConstantClass.t_cashBack + "</b> is displayed");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will verify Pay With Rewards text in Rewards Page If Visible
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

	public void verifyVisitTDRewards() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(txtVisitTD, "Visit TDRewards.com link");
			mobileAction.verifyElementTextContains(txtVisitTD,
					getTextInCurrentLocale(StringArray.ARRAY_REWARDS_VISIT_TDREWARDS));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void verifyPayWithRewards() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(txtpayWithRewards, "Pay With Rewards link");
			mobileAction.verifyElementTextContains(txtpayWithRewards,
					getTextInCurrentLocale(StringArray.ARRAY_REWARDS_PAY_WITH_REWARDS));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void clickVisitTDRewards() {
		Decorator();
		try {
			mobileAction.FuncClick(txtVisitTD, "Visit TDRewards.com link");
			mobileAction.FuncClick(visitTDContinue, "Visit TDRewards.com Continue button");
			mobileAction.sleep(5000);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void clickPayWithRewards() {
		Decorator();
		try {
			mobileAction.FuncClick(txtpayWithRewards, "Pay with Rewards");
			mobileAction.sleep(5000);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void verifyTDRewardsURL() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(visitTDUrl, "Pay With Rewards link");
			String url = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				url = visitTDUrl.getAttribute("value");
			} else {
				url = visitTDUrl.getAttribute("text");
			}

			if (url.contains("tdrewards.com")) {
				CL.GetReporting().FuncReport("Pass", "TDRewards.com loaded in browser");
			} else {
				CL.GetReporting().FuncReport("Fail", "TDRewards.com not loaded in browser");
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

}
