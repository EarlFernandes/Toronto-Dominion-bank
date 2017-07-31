package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td._CommonPage;

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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Current Balance')]")
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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Credit Limit')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit Limit']")
	private MobileElement creditLimit;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/creditLimit']")
	private MobileElement creditAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Statements']")
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
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will click on the Pay Bill Button button.
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickPayBill() {
		Decorator();
		try {
			mobileAction.FuncClick(payBill_Btn, "Pay Bill");
			mobileAction.waitForElementToVanish(progresssBar);

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
	 * This method will verify the latest transactions button.
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyLatestTransactions() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String lastTransac = "//*[@label(contains,'" + getTestdata("confirmation_val") + "')]";
				mobileAction.verifyElementIsDisplayed(activityTab, "Activity");
				mobileAction.verifyElementUsingXPath(lastTransac, "Confirmation Value");

			} else {
				String lastTransac = "//android.widget.TextView[@resource-id='com.td:id/description' and contains(@text,'"
						+ getTestdata("confirmation_val") + "']";
				mobileAction.verifyElementIsDisplayed(activityTab, "Activity");
				mobileAction.verifyElementUsingXPath(lastTransac, "Confirmation Value");
			}

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

	/**
	 * This method will click on the latest transactions button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickLastTransac() {
		Decorator();
		try {
			mobileAction.FuncClick(lastStatement, "Last Statement");
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
	 * This method will click on the summary tab button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickSummary() {
		Decorator();
		try {
			mobileAction.FuncClick(summaryTab, "Summary tab");
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
	 * This method will verify the summary details button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifySummaryDetails() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(currentBalance, "Current Balance");
			mobileAction.verifyElementIsDisplayed(currentAmount, "Current Amount");
			mobileAction.verifyElementIsDisplayed(availableBalance, "Available Balance");
			mobileAction.verifyElementIsDisplayed(availableAmount, "Available Amount");
			mobileAction.verifyElementIsDisplayed(creditLimit, "Credit Limit");
			mobileAction.verifyElementIsDisplayed(creditAmount, "credit amount");
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

	/**
	 * This method will click on the Statement tab button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickStatement() {
		Decorator();
		try {
			mobileAction.FuncClick(statementTab, "Statement tab");
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
	 * This method will verify the statement details button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyStatementDetails() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(latestStatement, "Last Statement");
			mobileAction.verifyElementIsDisplayed(twoStatementAgo, "Two Statement Ago");
			mobileAction.verifyElementIsDisplayed(threeStatementAgo, "Three Statements Ago");
			mobileAction.FuncClick(latestStatement, "Last Statement");
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

	public void clickTransfer() {
		Decorator();
		try {
			mobileAction.FuncClick(transfer_Btn, "Transfer");
			mobileAction.waitForElementToVanish(progressBar);
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
	 * This method will verify text within elements for the accounts activity
	 * tab
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
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity") + "']",
						"activity Tab");
				// final String postedTransactions =
				// "//android.widget.TextView[@text='" +
				// mobileAction.getAppString("rtb_posted_transactions") + "']";
				// mobileAction.FuncSwipeWhileElementNotFoundByxpath(postedTransactions,
				// false, 2, "up");
				// final String lastStatement
				// ="//android.widget.TextView[@text='" +
				// mobileAction.getAppString("last_statement") + "' or @text='"
				// + mobileAction.getAppString("str_2_STATEMENTS") + "']";
				// mobileAction.FuncSwipeWhileElementNotFoundByxpath(lastStatement,
				// false, 2, "up");
				// // Scroll down here
				// final String xPathFooter =
				// "//XCUIElementTypeStaticText[@name='RVB_DETAIL_FOOTER_DES']";
				// mobileAction.FuncSw(xPathFooter, false, 6, "up");
				// // Verify select date headers at the bottom
				// for(MobileElement m : dateHeaders) {
				// mobileAction.verifyDateFormat(m.getText(),
				// MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
				// }
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/activityTab' and @text='"
								+ mobileAction.getAppString("str_Activity") + "']",
						"activity Tab");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
				// +
				// mobileAction.getAppString("rtb_authorized_transactions_header")
				// + "']", "Pending Transactions");
				final String postedTransactions = "//android.widget.TextView[@text='"
						+ mobileAction.getAppString("rtb_posted_transactions") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(postedTransactions, false, 2, "up");
				// final String lastStatement
				// ="//android.widget.TextView[@text='" +
				// mobileAction.getAppString("last_statement") + "' or @text='"
				// + mobileAction.getAppString("str_2_STATEMENTS") + "']";
				// mobileAction.FuncSwipeWhileElementNotFoundByxpath(lastStatement,
				// false, 2, "up");
				// Scroll down here
				final String xPathFooter = "//android.widget.TextView[@text='"
						+ mobileAction.getAppString("str_no_more_activity_footer") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter, false, 4, "up");
				// Verify select date headers at the bottom
				for (MobileElement m : dateHeaders) {
					mobileAction.verifyDateFormat(m.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
				}
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
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
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("credit_str") + "']",
						"Credit title");
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Credit") + "']",
						"Credit title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='" + mobileAction.getAppString("rtb_pay_now") + "']",
						"Pay button");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='" + mobileAction.getAppString("str_TRANSFER") + "']",
						"transfer button");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_Activity") + "']",
						"activity tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_summary") + "']",
						"summary tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_last_statements_header") + "']",
						"statements tab");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
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
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
				// + mobileAction.getAppString("str_summary") + "']", "Summary
				// Tab");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("str_Account_number") + "']",
				// "Account #");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("str_Available_Balance") + "']",
				// "Available Balance");

			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/summaryTab' and @text='"
								+ mobileAction.getAppString("str_summary") + "']",
						"Summary Tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_Account_number") + "']",
						"Account #");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_Available_Balance") + "']",
						"Available Balance");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
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

				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_Activity") + "']",
						"Activity Tab");
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/summaryTab' and @text='"
								+ mobileAction.getAppString("str_summary") + "']",
						"Activity Tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_Activity") + "']",
						"Summary Tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_statements") + "']",
						"Statements Tab");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
