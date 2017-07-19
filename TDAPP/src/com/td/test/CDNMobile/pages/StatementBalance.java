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

public class StatementBalance extends _CommonPage {
	private static StatementBalance StatementBalance;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_pay']")
	private MobileElement payBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cash Back Dollars Earned']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/points_earned_title']")
	private MobileElement txtearned;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cash Back Dollars Redeemed']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/rewards_redeemed_title']")
	private MobileElement txtRedeemed;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Statement Balance']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Statement Balance']")
	private MobileElement stmtBalHeader;

	@iOSFindBy(xpath = "//*[@label='PAY WITH REWARDS']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='PAY WITH REWARDS']")
	private MobileElement payWithRewardsBtn;

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
			mobileAction.verifyElementIsDisplayed(payBtn, "Pay Button");
			mobileAction.FuncClick(payBtn, "pay Button");
			Thread.sleep(3000);

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
}
