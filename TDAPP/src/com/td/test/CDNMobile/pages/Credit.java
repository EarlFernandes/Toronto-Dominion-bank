package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Credit extends _CommonPage {

	private static Credit Credit;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Credit']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Credit']")
	private MobileElement creditHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@label='REWARDS']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='REWARDS']")
	private MobileElement rewardBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Statements']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/statementTab' and @text='Statements']")
	private MobileElement stmtBtn;

	@iOSFindBy(xpath = "//*[@label='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/last_statement_details']")
	private MobileElement stmtDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Summary']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/summaryTab']")
	private MobileElement summaryDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='cash back rewards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='cash back rewards']")
	private MobileElement txtCashBackRwd;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Cash Back Dollars')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/account_rewards_balance']")
	private MobileElement dollarSign;

	// By dollarSign=By.xpath("//XCUIElementTypeStaticText[contains(@label,'Cash
	// Back Dollars')]");
	// By androidDollarSign=
	// By.xpath("//android.widget.TextView[@resource-id='com.td:id/account_rewards_balance");

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Activity']")
	// @AndroidFindBy(xpath =
	// "//android.widget.RelativeLayout[@resource-id='com.td:id/last_statement_details']")
	private MobileElement activityDetails;

	By iosStmtDetails = By
			.xpath("//XCUIElementTypeTable[1]//XCUIElementTypeCell[2][contains(@label,'Minimum Payment')]");

	By iosSummaryDetails = By.xpath("//*[@label='Summary']");

	By iosActivityDetails = By.xpath("//XCUIElementTypeOther[@label='Activity']");

	By iosVerifyLang = By.xpath("//XCUIElementTypeStaticText[contains(@label,'Dollars')]");

	public synchronized static Credit get() {
		if (Credit == null) {
			Credit = new Credit();
		}
		return Credit;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will check the credit Header is present or not
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void credit_Header() {
		Decorator();
		try {

			mobileAction.FuncISDisplayed(creditHeader, "Credit");

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will click the Rewards Button in Credit Page
	 * 
	 * @throws NoSuchElementException
	 * @
	 * 
	 */

	public void clickReward() {
		Decorator();
		try {
			if (rewardBtn.isDisplayed())
				mobileAction.FuncClick(rewardBtn, "Rewards");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}

	}

	/**
	 * This method will click the Statements button in Credit Page
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void clickStatment() {
		Decorator();
		try {
			Thread.sleep(2000);
			mobileAction.FuncClick(stmtBtn, "Statements");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * 
	 * This method will click the Statements last generated in Credit Page
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void clickStatmentTab() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				CL.GetDriver().findElement(iosStmtDetails).click();

			} else {
				mobileAction.FuncClick(stmtDetails, "Last Statement Details ");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	public void clickSummaryTab() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				CL.GetDriver().findElement(iosSummaryDetails).click();
			} else {
				mobileAction.FuncClick(summaryDetails, "Summary Details ");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}
	}

	public void clickActivityTab() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				CL.GetDriver().findElement(iosActivityDetails).click();
			} else {
				mobileAction.FuncClick(activityDetails, "Activity Details ");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}

	}

	public void rewardsNotVisible() {
		Decorator();
		try {
			rewardBtn.isDisplayed();
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("PASS", "The '" + "REWARDS button" + "' is not displayed");
			} catch (IOException e1) {
				System.out.println("IOException from Method" + this.getClass().toString() + " " + e.getCause());
			}
		}
	}

	public void verifyCashbackTxt() {
		Decorator();
		try {
			String value = mobileAction.verifyElementUsingBy(iosVerifyLang);
			System.out.println(value);
			value.contains(ConstantClass.t_cashBack);
			CL.GetReporting().FuncReport("Pass", "The element <b>- " + ConstantClass.t_cashBack + "</b> is displayed");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}

	}

	/**
	 * This method will verify the rewards button in Credit Page
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */
	public void rewardVisible() {
		Decorator();
		try {

			mobileAction.FuncISDisplayed(rewardBtn, "Rewards");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}

	}

	/**
	 * This method will verify the cash back rewards text under Summary tab in
	 * Credit Page
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */
	public void verifyCashBack() {
		Decorator();
		try {

			mobileAction.FuncISDisplayed(txtCashBackRwd, "Cash back rewards");

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will verify the dollar reward balance in Credit Page
	 * 
	 * @throws IOException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void verifyDollarRewardBalance() {
		Decorator();
		try {
			String verifydollarSign = mobileAction.getValue(dollarSign);

			if (verifydollarSign.startsWith(ConstantClass.dollarSign)) {
				CL.GetReporting().FuncReport("Pass",
						"The element <b>- " + ConstantClass.dollarSign + "</b> is present in Cash back dollar ");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will verify the currency value has not exceeded two decimals
	 * in Credit Page
	 * 
	 * @throws IOException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void verifyDollarDecimalValue() {

		Decorator();
		String decimalValue = "";
		try {
			decimalValue = mobileAction.getValue(dollarSign);
			// if
			// (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))
			// {
			// decimalValue=mobileAction.verifyElementUsingBy(dollarSign);
			// }else{
			// decimalValue=mobileAction.verifyElementUsingBy(androidDollarSign);
			// }
			String decVal[] = decimalValue.split(" ");
			System.out.println(decVal[0]);
			String decVal1 = decVal[0].replaceAll("[$,]", "");
			System.out.println(decVal1);

			if (String.valueOf(decVal1).split("\\.")[1].length() == 2) {
				CL.GetReporting().FuncReport("PASS", "The Currency value has not exceeded two decimals");
			}
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

}
