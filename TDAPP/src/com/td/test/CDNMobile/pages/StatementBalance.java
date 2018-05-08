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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class StatementBalance extends _CommonPage {
	private static StatementBalance StatementBalance;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cash Back Dollars Earned']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/points_earned_title']")
	private MobileElement txtearned;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cash Back Dollars Redeemed']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/rewards_redeemed_title']")
	private MobileElement txtRedeemed;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Statement Balance']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Statement Balance']")
	private MobileElement stmtBalHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeColletionView[1]/XCUIElementTypeCell[2]")
	@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button'])[2]")
	private MobileElement payWithRewardsBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/current_balance")
	private MobileElement statementBalanceValue;

	@iOSXCUITFindBy(accessibility = "RVB_DETAIL_HEADER_DATE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/statement_period' or @resource-id='com.td:id/statement_balance_title']")
	private MobileElement statementDateRange;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/btn_pay")
	private MobileElement statementPayButton;

	public synchronized static StatementBalance get() {
		if (StatementBalance == null) {
			StatementBalance = new StatementBalance();
		}
		return StatementBalance;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will verify the statement Balance Details button.
	 * 
	 * @return void
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
	public void verifyStatementBalanceDetails() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(statementBalanceValue, "Statement Balance value");
			mobileAction.verifyElementIsDisplayed(statementDateRange, "Statement Date range");
			mobileAction.verifyElementIsDisplayed(statementPayButton, "Statement Pay Button");
			mobileAction.FuncClick(statementPayButton, "pay Button");
			Thread.sleep(3000);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify the Earned and Redeemed is not displayed in
	 * statement Balance Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyNoDollarsEarnedAndRedeemed() {
		Decorator();
		try {
			if ((mobileAction.verifyElementIsPresent(txtearned))
					&& (mobileAction.verifyElementIsPresent(txtRedeemed))) {

			}
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("PASS",
						"The '" + "Cash Back Earned and Cash Back Redeemed" + "' are not dispalyed");
			} catch (IOException e1) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;

			}
		}
	}

	/**
	 * This method will verify the Earned and Redeemed in statement Balance Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyDollarsEarnedAndRedeemed() {
		Decorator();

		try {
			mobileAction.verifyElementIsDisplayed(txtearned, "The earned text is displayed");
			mobileAction.verifyElementIsDisplayed(txtRedeemed, "The Redeemed text is displayed");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the header in statement Balance Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyStatementBalanceHeader() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(stmtBalHeader, "Statment Balance Header");

		} catch (NoSuchElementException | IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will verify the Pay with rewards and click the same in
	 * statement Balance Page
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAndClickPayWithRewardsButton() {

		Decorator();
		try {

			mobileAction.FuncClick(payWithRewardsBtn, "Pay With Rewards button");

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void verifyPayWithRewardEligibility() {
		Decorator();
		try {

			String ptsBalance = getTestdata("Amount");
			if (ptsBalance.equals(" ")) {
				ptsBalance = "0";
			}
			boolean hasPayWithRewards = mobileAction.verifyElementIsPresent(payWithRewardsBtn);

			if (!ptsBalance.contains("$")) {
				int travelBalance = parseRewardsPoints(ptsBalance);
				if ((travelBalance < 10000) && hasPayWithRewards) {
					CL.GetReporting().FuncReport("Fail",
							"Pay With Rewards button incorrectly appeared for less than 10000 pts");
				} else if ((travelBalance < 10000) && !hasPayWithRewards) {
					CL.GetReporting().FuncReport("Pass",
							"Pay With Rewards button should not appear for less than 10000 pts");
				} else if ((travelBalance >= 10000) && hasPayWithRewards) {
					CL.GetReporting().FuncReport("Pass", "Pay With Rewards button appears if more than 10000 pts");
				} else if ((travelBalance >= 10000) && !hasPayWithRewards) {
					CL.GetReporting().FuncReport("Fail",
							"Pay With Rewards button should not appear if more than 10000 pts");
				}
			} else {
				double cbDollarsBalance = parseCashBackDollars(ptsBalance);
				if ((cbDollarsBalance < 25.00) && hasPayWithRewards) {
					CL.GetReporting().FuncReport("Fail",
							"Pay With Rewards button incorrectly appeared for less than $25");
				} else if ((cbDollarsBalance < 25.00) && !hasPayWithRewards) {
					CL.GetReporting().FuncReport("Pass", "Pay With Rewards button should not appear for less than $25");
				} else if ((cbDollarsBalance >= 25.00) && hasPayWithRewards) {
					CL.GetReporting().FuncReport("Pass", "Pay With Rewards button appears for more than $25");
				} else if ((cbDollarsBalance >= 25.00) && !hasPayWithRewards) {
					CL.GetReporting().FuncReport("Fail", "Pay With Rewards button should not appear for more than $25");
				}

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

	private double parseCashBackDollars(String rewardText) {
		double result = 0.00;

		if (currentLocale.equalsIgnoreCase("fr")) {
			rewardText = rewardText.substring(0, rewardText.indexOf("$")).trim();
			rewardText = rewardText.replace(",", ".");
			rewardText = rewardText.replace(" ", "");
		} else {
			// en, chinese have same format
			rewardText = rewardText.substring(0, rewardText.indexOf(" "));
			rewardText = rewardText.replace(",", "");
			rewardText = rewardText.replace("$", "");
		}
		result = Double.parseDouble(rewardText);

		return result;

	}

	private int parseRewardsPoints(String rewardText) {
		int result = 0;

		if (currentLocale.equalsIgnoreCase("fr")) {
			rewardText = rewardText.substring(0, rewardText.indexOf("Points")).trim();
			rewardText = rewardText.replace(" ", "");
		} else {
			// en, chinese have same format
			rewardText = rewardText.substring(0, rewardText.indexOf("TD")).trim();
			rewardText = rewardText.replace(",", "");
		}
		result = Integer.parseInt(rewardText);

		return result;

	}

}
