package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Accounts_Credit extends _CommonPage {
	private static Accounts_Credit Accounts_Credit;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='PAY BILL']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payBill' and @text='PAY BILL']")
	private MobileElement payBill_Btn;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progresssBar;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Activity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/activityTab' and @text='Activity']")
	private MobileElement activityTab;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/description' and @index='0']")
	private MobileElement lastStatement;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Summary']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/summaryTab']")
	private MobileElement summaryTab;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Current Balance,')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Current Balance']")
	private MobileElement currentBalance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/currentCredit']")
	private MobileElement currentAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Available Credit')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Available Credit']")
	private MobileElement availableBalance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/availableCredit']")
	private MobileElement availableAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Credit Limit,')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit Limit']")
	private MobileElement creditLimit;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/creditLimit']")
	private MobileElement creditAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Statements']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/statementTab']")
	private MobileElement statementTab;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/last_statement']")
	private MobileElement latestStatement;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/two_statements_ago']")
	private MobileElement twoStatementAgo;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/three_statements_ago']")
	private MobileElement threeStatementAgo;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='TRANSFER']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transferTo' and @text='TRANSFERS']")
	private MobileElement transfer_Btn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;


	
	public synchronized static Accounts_Credit get() {
		if (Accounts_Credit == null) {
			Accounts_Credit = new Accounts_Credit();
		}
		return Accounts_Credit;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will click on the Pay Bill Button button.
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickPayBill() {
		Decorator();
		try {
			mobileAction.FuncClick(payBill_Btn, "Pay Bill");
			mobileAction.waitForElementToVanish(progresssBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the latest transactions button.
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyLatestTransactions() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String lastTransac = "//*[@label(contains," + getTestdata("confirmation_val") + "')]";
				MobileElement lastTransaction = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(lastTransac));
				mobileAction.verifyElementIsDisplayed(activityTab, "Activity");
				mobileAction.verifyElementIsDisplayed(lastTransaction, "Last Transactions");
			} else {
				String lastTransac = "//android.widget.TextView[@resource-id='com.td:id/description' and contains(@text,'"
						+ getTestdata("confirmation_val") + "']";
				MobileElement lastTransaction = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(lastTransac));
				mobileAction.verifyElementIsDisplayed(activityTab, "Activity");
				mobileAction.verifyElementIsDisplayed(lastTransaction, "Last Transactions");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the latest transactions button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickLastTransac() throws InterruptedException {
		Decorator();
		try {

			mobileAction.FuncClick(lastStatement, "Last Statement");
			Thread.sleep(3000);
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the summary tab button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickSummary() throws InterruptedException {
		Decorator();
		try {

			mobileAction.FuncClick(summaryTab, "Summary tab");
			Thread.sleep(3000);
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the summary details button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifySummaryDetails() throws InterruptedException {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(currentBalance, "Current Balance");
			mobileAction.verifyElementIsDisplayed(currentAmount, "Current Amount");
			mobileAction.verifyElementIsDisplayed(availableBalance, "Available Balance");
			mobileAction.verifyElementIsDisplayed(availableAmount, "Available Amount");
			mobileAction.verifyElementIsDisplayed(creditLimit, "Credit Limit");
			mobileAction.verifyElementIsDisplayed(creditAmount, "credit amount");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the Statement tab button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickStatement() throws InterruptedException {
		Decorator();
		try {

			mobileAction.FuncClick(statementTab, "Statement tab");
			Thread.sleep(3000);
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the statement details button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyStatementDetails() throws InterruptedException {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(latestStatement, "Last Statement");
			mobileAction.verifyElementIsDisplayed(twoStatementAgo, "Two Statement Ago");
			mobileAction.verifyElementIsDisplayed(threeStatementAgo, "Three Statements Ago");
			mobileAction.FuncClick(latestStatement, "Last Statement");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void clickTransfer() {
		Decorator();
		try {
			mobileAction.FuncClick(transfer_Btn, "Transfer");
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}


}
