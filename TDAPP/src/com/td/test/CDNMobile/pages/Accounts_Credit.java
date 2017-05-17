package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Accounts_Credit extends _CommonPage {
	private static Accounts_Credit Accounts_Credit;

	@iOSFindBy(xpath = "//*[@label='PAY BILL']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payBill' and @text='PAY BILL']")
	private MobileElement payBill_Btn;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progresssBar;

	@iOSFindBy(xpath = "//*[@label='Activity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/activityTab' and @text='Activity']")
	private MobileElement activityTab;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/description' and @index='0']")
	private MobileElement lastStatement;

	// FIXME: Ask may to add this
	@iOSFindBy(xpath = "//*[@label='Summary']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/summaryTab']")
	private MobileElement summaryTab;

	@iOSFindBy(xpath = "//*[contains(@label,'Current Balance,')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Current Balance']")
	private MobileElement currentBalance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/currentCredit']")
	private MobileElement currentAmount;

	@iOSFindBy(xpath = "//*[contains(@label,'Available Credit')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Available Credit']")
	private MobileElement availableBalance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/availableCredit']")
	private MobileElement availableAmount;

	@iOSFindBy(xpath = "//*[contains(@label,'Credit Limit,')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit Limit']")
	private MobileElement creditLimit;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/creditLimit']")
	private MobileElement creditAmount;

	@iOSFindBy(xpath = "//*[@label='Statements']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/statementTab']")
	private MobileElement statementTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/date']")
	private List<MobileElement> dateHeaders;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/last_statement']")
	private MobileElement latestStatement;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/two_statements_ago']")
	private MobileElement twoStatementAgo;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/three_statements_ago']")
	private MobileElement threeStatementAgo;

	@iOSFindBy(xpath = "//*[@label='TRANSFER']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transferTo' and @text='TRANSFERS']")
	private MobileElement Transfer_btn;
	
	@iOSFindBy(xpath = "//*[@label='In Progress']")
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
			// FIXME: Temporary, once may adds id, delete
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				summaryTab = mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@name='" + mobileAction.getAppString("str_summary") + "']", "Summary Tab");
			}
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
			mobileAction.FuncClick(Transfer_btn, "Transfer");
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the accounts activity tab
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyActivityTabTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity") + "']", "activity Tab");
//				final String postedTransactions = "//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_posted_transactions") + "']";
//				mobileAction.FuncSwipeWhileElementNotFoundByxpath(postedTransactions, false, 2, "up");
//				final String lastStatement  ="//android.widget.TextView[@text='" + mobileAction.getAppString("last_statement") + "' or @text='" + mobileAction.getAppString("str_2_STATEMENTS") + "']";
//				mobileAction.FuncSwipeWhileElementNotFoundByxpath(lastStatement, false, 2, "up");
//				// Scroll down here
				final String xPathFooter = "//XCUIElementTypeStaticText[@name='RVB_DETAIL_FOOTER_DES']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 6, "up");
				// Verify select date headers at the bottom
				for(MobileElement m : dateHeaders) {
					mobileAction.verifyDateFormat(m.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
				}
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/activityTab' and @text='" + mobileAction.getAppString("str_Activity") + "']", "activity Tab");
				//mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_authorized_transactions_header") + "']", "Pending Transactions");
				final String postedTransactions = "//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_posted_transactions") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(postedTransactions, false, 2, "up");
				final String lastStatement  ="//android.widget.TextView[@text='" + mobileAction.getAppString("last_statement") + "' or @text='" + mobileAction.getAppString("str_2_STATEMENTS") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(lastStatement, false, 2, "up");
				// Scroll down here
				final String xPathFooter = "//android.widget.TextView[@text='" + mobileAction.getAppString("str_no_more_activity_footer") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 4, "up");
				// Verify select date headers at the bottom
				for(MobileElement m : dateHeaders) {
					mobileAction.verifyDateFormat(m.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
				}
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the credit screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyCreditTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("credit_str") + "']", "Credit title");
				// FIXME: Get proper app strings here
//				mobileAction.verifyElementUsingXPath("//XCUIElementTypeCell[@label='" + mobileAction.getAppString("str_PayBillsMakePayment") + " or @text='" + mobileAction.getAppString("str_PAY_BILL") + "']", "Pay button");
//				mobileAction.verifyElementUsingXPath("//XCUIElementTypeCell[@label='" + mobileAction.getAppString("str_TRANSFER") + "']", "transfer button");
//				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity") + "']", "activity tab");
//				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_summary") + "']", "summary tab");
//				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='" + mobileAction.getAppString("rtb_statements") + "']", "statements tab");
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("str_Credit") + "']", "Credit title");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='" + mobileAction.getAppString("rtb_pay_now") + "']", "Pay button");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='" + mobileAction.getAppString("str_TRANSFER") + "']", "transfer button");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("str_Activity") + "']", "activity tab");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("str_summary") + "']", "summary tab");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_statements") + "']", "statements tab");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the accounts summary tab
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifySummaryTabTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_summary") + "']", "Summary Tab");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_Account_number") + "']", "Account #");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_Available_Balance") + "']", "Available Balance");

			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/summaryTab' and @text='" + mobileAction.getAppString("str_summary") + "']", "Summary Tab");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("str_Account_number") + "']", "Account #");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("str_Available_Balance") + "']", "Available Balance");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within the tabs in a credit card account
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyCCTabTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_summary") + "']", "Summary Tab");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity") + "']", "Activity Tab");
				// FIXME: Where is the string for this?
				//mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='" + mobileAction.getAppString("rtb_statements") + "']", "Statements Tab");

			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/summaryTab' and @text='" + mobileAction.getAppString("str_summary") + "']", "Activity Tab");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("str_Activity") + "']", "Summary Tab");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_statements") + "']", "Statements Tab");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
