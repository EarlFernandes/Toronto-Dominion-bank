package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InvestingAccountSummary extends _CommonPage {
	private static InvestingAccountSummary InvestingAccountSummary;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Balances']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/balancesTab' and @text='Balances']")
	private MobileElement llbBalance;

	String progressBar = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']";

	String iOSProgressBar = "//XCUIElementTypeActivityIndicator[@label='In progress' or @label='En cours']";

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/gainLoss']/following-sibling::android.widget.TextView")
	private MobileElement unrealized;

	@AndroidFindBy(xpath = "//android.widget.TextView[@index='10']")
	private MobileElement totalValue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/status' or @index='12']")
	private MobileElement timeStamp;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/activityTab']")
	private MobileElement activityTab;

	String strAccount = getTestdata("Accounts");
	String strAcc[] = strAccount.split(":");

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/summaryTab']")
	private MobileElement summaryTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/statementTab']")
	private MobileElement statementTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/holdingsTab']")
	private MobileElement holdingsTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/amount']")
	private MobileElement amount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transaction_date_val']")
	private MobileElement transactionDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/posted_date_val']")
	private MobileElement postedDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/last_statement']")
	private MobileElement CClastStatement;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/current_balance']")
	private MobileElement currentBalance;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/statement_period']")
	private MobileElement statementPeriod;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/dueDate']")
	private MobileElement paymentDueDate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/date']")
	private MobileElement dateOfStatement;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_pay']")
	private MobileElement payButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/last_statement_balance_header']")
	private MobileElement statementBalance;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/last_statement_balance_title' or @resource-id='com.td:id/statement_balance_title']")
	private MobileElement statementBalanceDateRange;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/minimum_payment_header']")
	private MobileElement minimumPayment;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payment_due_date_header']")
	private MobileElement paymentDue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_left']")
	private MobileElement symbol;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_center']")
	private MobileElement priceCHG;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_right']")
	private MobileElement gainLossUnrealized;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/symbol']")
	private MobileElement holdingName;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/buyBtn']")
	private MobileElement buy;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/sellBtn']")
	private MobileElement sell;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/timestamp']")
	private MobileElement holdingTimeStamp;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/profitLostLabel']")
	private MobileElement holdingGainLoss;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/unrealizedLabel']")
	private MobileElement holdingUnrealized;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/average_cost_desc']")
	private MobileElement averageCost;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/book_value_desc']")
	private MobileElement bookValue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/market_value_desc']")
	private MobileElement marketValue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/status']")
	private MobileElement footerStatus;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/ordersTab']")
	private MobileElement ordersTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/symbol']")
	private MobileElement order;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/timestamp']")
	private MobileElement orderTimeStamp;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/footer_txt_note']")
	private MobileElement ordersFooter;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/callBtn']")
	private MobileElement callBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_account_label']")
	private MobileElement orderAccount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtTimeStamp']")
	private MobileElement ordersBeginningTime;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/status']")
	private MobileElement ordersEndTime;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_label']")
	private List<MobileElement> ordersLabels;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_left']")
	private MobileElement dateSettle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_center']")
	private MobileElement details;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_right']")
	private MobileElement activityAmount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/status']")
	private MobileElement activityTimeStamp;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'statements_ago')]")
	private List<MobileElement> statementsAgo;

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	public synchronized static InvestingAccountSummary get() {
		if (InvestingAccountSummary == null) {
			InvestingAccountSummary = new InvestingAccountSummary();
		}
		return InvestingAccountSummary;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will click on the Logout French button
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
	public void verifySummaryScenario() {
		Decorator();
		String strAccount = getTestdata("Account");
		String strAcc[] = strAccount.split(":");
		boolean flag = true;
		try {

			if (platformName.equalsIgnoreCase("Android")) {

				while (flag) {
					try {
						String accountToSelect = "//*[contains(@text,'" + strAcc[0] + "')]";
						MobileElement accountToSelected = (MobileElement) (CL.GetAppiumDriver())
								.findElement(By.xpath(accountToSelect));
						if (mobileAction.verifyElementIsPresent(accountToSelected)
								&& mobileAction.verifyElementIsPresent(llbBalance)) {
							flag = false;
							break;
						} else {
							mobileAction.FunctionSwipe("left", 2000, 30);
							mobileAction.waitForElementToDisappear(progressBar);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("left", 2000, 30);
						mobileAction.waitForElementToDisappear(progressBar);
					}
				}
				flag = true;
				while (flag) {

					try {
						String accountToSelect = "//*[contains(@text,'" + strAcc[1] + "')]";
						MobileElement accountToSelected = (MobileElement) (CL.GetAppiumDriver())
								.findElement(By.xpath(accountToSelect));
						if (mobileAction.verifyElementIsPresent(accountToSelected)
								&& mobileAction.verifyElementIsPresent(llbBalance)) {
							flag = false;
							break;
						} else {
							mobileAction.FunctionSwipe("right", 2000, 30);
							mobileAction.waitForElementToDisappear(progressBar);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("right", 2000, 30);
						mobileAction.waitForElementToDisappear(progressBar);
					}
				}

			} else {

				while (flag) {
					try {
						String accountToSelect = "//*[contains(@label,'" + strAcc[0] + "')]";
						MobileElement accountToSelected = (MobileElement) (CL.GetAppiumDriver())
								.findElement(By.xpath(accountToSelect));
						if (mobileAction.verifyElementIsPresent(accountToSelected)
								&& mobileAction.verifyElementIsPresent(llbBalance)) {
							flag = false;
							break;
						} else {
							mobileAction.FunctionSwipe("left", 2000, 30);
							mobileAction.waitForElementToDisappear(iOSProgressBar);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("left", 2000, 30);
						mobileAction.waitForElementToDisappear(iOSProgressBar);
					}
				}
				flag = true;
				while (flag) {

					try {
						String accountToSelect = "//*[contains(@label,'" + strAcc[1] + "')]";
						MobileElement accountToSelected = (MobileElement) (CL.GetAppiumDriver())
								.findElement(By.xpath(accountToSelect));
						if (mobileAction.verifyElementIsPresent(accountToSelected)
								&& mobileAction.verifyElementIsPresent(llbBalance)) {
							flag = false;
							break;
						} else {
							mobileAction.FunctionSwipe("right", 2000, 30);
							mobileAction.waitForElementToDisappear(iOSProgressBar);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("right", 2000, 30);
						mobileAction.waitForElementToDisappear(iOSProgressBar);
					}
				}
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the details on Investing Account
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

	public void verifyInvestingAccountDetails() {

		Decorator();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

			} else {

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Investing") + "']",
						"Investing Header");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_Transfer") + "']",
						"Transfer");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_TRADE") + "']",
						"Trade");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_QUOTE") + "']",
						"Quote");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/balancesTab' and @text='"
								+ mobileAction.getAppString("str_Balances") + "']",
						"Balances Tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/holdingsTab' and @text='"
								+ mobileAction.getAppString("str_Holdings") + "']",
						"Holdings Tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/activityTab' and @text='"
								+ mobileAction.getAppString("str_Activity") + "']",
						"Activity Tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/ordersTab' and @text='"
								+ mobileAction.getAppString("globalStaticContentQuickLinksOrders") + "']",
						"Orders Tab");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_Cash") + "']", "Cash");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/bookValueDesc' and contains(@text,'"
								+ mobileAction.getAppString("str_BookValue") + "')]",
						"Book Value");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_Investments") + "']",
						"Investments");
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/gainLossDesc' or @index='6']", "Gain/Loss");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_unrealized") + "']",
						"Unrealized");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_TotalValue") + "']",
						"Total Val");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[contains(@text, '"
								+ mobileAction.getAppString("str_Cash_Balance_Footnote") + "')]",
						"Cash balance footnote");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[contains(@text, '" + mobileAction
										.getAppString("common_str_Time_Stamp_substition").replace(" %1$s", "") + "')]",
								"time stamp substituion");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[contains(@text, '"
						+ mobileAction.getAppString("str_Insufficient_Information") + "')]", "Insufficient");

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
	 * @author Ashraf This method will verify the summary details on credit card
	 *         account page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyCrediCardSummaryDetails() {

		Decorator();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(summaryTab, "Summary Tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/current_balance']", "Current Balance");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_PAY") + "']",
						"Pay bills quick link");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_TRANSFER") + "']",
						"Transfer quick link");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/activityTab']",
						"Activity Tab");
				mobileAction.verifyElementIsDisplayed(summaryTab, "Summary Tab");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/statementTab']",
						"Statements Tab");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("str_Account_number") + "']", "Account #");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("str_Current_Balance") + "']", "Current Balance");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("rtb_authorized_transactions") + "']",
						"Pending Transactions");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("str_Available_Credit") + "']", "Available Credit");
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/title' and @text='"
								+ mobileAction.getAppString("rtb_credit_limit") + "']", "Credit Limit");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@text='"
										+ mobileAction.getAppString("rtb_summary_tab_line_1") + "']",
								"Current Balance includes all Posted Transactions.");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/rtb_summary_tab_first_faq']",
						"Summary Tab First Faq");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@text='"
										+ mobileAction.getAppString("rtb_summary_tab_line_3") + "']",
								"Current Balance includes all Posted Transactions.");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/rtb_summary_tab_second_faq']",
						"Summary Tab Second Faq");

			}
		}

		catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the Activity details on credit
	 *         card account page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyCrediCardActivityDetails() {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(activityTab, "Activity Tab");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/current_balance']", "Current Balance");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_PAY") + "']",
						"Pay bills quick link");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_TRANSFER") + "']",
						"Transfer quick link");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/activityTab']",
						"Activity Tab");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/summaryTab']",
						"Summary Tab");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/statementTab']",
						"Statements Tab");
				// mobileAction
				// .verifyElementUsingXPath(
				// "//android.widget.TextView[@resource-id='com.td:id/sectionTitle'
				// and @text='"
				// + mobileAction.getAppString("rtb_posted_transactions") +
				// "']",
				// "Posted Transactions");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/date']",
				// "Transaction date");
			}

		}

		catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the payment details on credit card
	 *         account page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyCrediCardPaymentDetails() {

		Decorator();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(activityTab, "Activity Tab");

				String pendingTransactionStr = "//android.widget.TextView[@text='"
						+ mobileAction.getAppString("rtb_authorized_transactions_header")
						+ "']/../following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
				MobileElement pendingTransaction = (MobileElement) (CL.GetAppiumDriver())
						.findElement(By.xpath(pendingTransactionStr));

				if (mobileAction.verifyElementIsPresent(pendingTransaction)) {
					mobileAction.FuncClick(pendingTransaction, "Pending Transaction");
				} else {
					mobileAction.FunctionSwipe("up", 5000, 200);

					String otherTransactionStr = "//android.widget.TextView[@resource-id='com.td:id/date']/../../following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
					MobileElement otherTransaction = (MobileElement) (CL.GetAppiumDriver())
							.findElement(By.xpath(otherTransactionStr));
					mobileAction.FuncClick(otherTransaction, "Transaction");

				}

				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("rtb_transaction_title") + "']",
								"Transactions header");
				mobileAction.verifyElementIsDisplayed(amount, "Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_transaction_date") + "']",
						"Transaction Date");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_posted_date") + "']",
						"Posted Date");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_card_no") + "']",
						"Card #");

				mobileAction.verifyDateFormat(transactionDate.getText(), MobileAction2.TYPE_YYYY_MM_DD);
				mobileAction.verifyDateFormat(postedDate.getText(), MobileAction2.TYPE_YYYY_MM_DD);

			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the payment purchased details on
	 *         credit card account page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyCrediCardPaymentPurchaseDetails() {

		Decorator();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(activityTab, "Activity Tab");

				String pendingTransactionStr = "//android.widget.TextView[@text='"
						+ mobileAction.getAppString("rtb_authorized_transactions_header")
						+ "']/../following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
				MobileElement pendingTransaction = (MobileElement) (CL.GetAppiumDriver())
						.findElement(By.xpath(pendingTransactionStr));

				if (mobileAction.verifyElementIsPresent(pendingTransaction)) {
					mobileAction.FuncClick(pendingTransaction, "Pending Transaction");
				} else {
					mobileAction.FunctionSwipe("up", 5000, 200);

					String otherTransactionStr = "//android.widget.TextView[@resource-id='com.td:id/date']/../../following-sibling::android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView";
					MobileElement otherTransaction = (MobileElement) (CL.GetAppiumDriver())
							.findElement(By.xpath(otherTransactionStr));
					mobileAction.FuncClick(otherTransaction, "Transaction");

				}

				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("rtb_transaction_title") + "']",
								"Transactions header");
				mobileAction.verifyElementIsDisplayed(amount, "Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_transaction_date") + "']",
						"Transaction Date");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_posted_date") + "']",
						"Posted Date");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_card_no") + "']",
						"Card #");

				mobileAction.verifyDateFormat(transactionDate.getText(), MobileAction2.TYPE_YYYY_MM_DD);
				mobileAction.verifyDateFormat(postedDate.getText(), MobileAction2.TYPE_YYYY_MM_DD);

			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the credit card statement details.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyCreditCardStatementDetails() {

		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(statementTab, "Statement Tab");
				mobileAction.FuncClick(CClastStatement, "Last Statement");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Statement_Balance") + "']",
						"Statement Balance Header");
				mobileAction.verifyElementIsDisplayed(currentBalance, "Current Balance");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_payment_due_date") + "']",
						"Payment Due");
				mobileAction.verifyDateFormat(paymentDueDate.getText(), MobileAction2.TYPE_YYYY_MM_DD);
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_minimum_payment") + "']",
						"Minimum Payment");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_minimum_payment")
								+ "']/following-sibling::android.widget.TextView[@resource-id='com.td:id/amount']",
						"Minimum Payment Amount");
				mobileAction.verifyDateFormat(dateOfStatement.getText(), MobileAction2.TYPE_YYYY_MM_DD_WEEKDATE);
				mobileAction.verifyDateFormat(statementBalanceDateRange.getText(), MobileAction2.TYPE_YYYY_MM_DD_RANGE);
				// mobileAction.verifyElementIsDisplayed(payButton, "Pay
				// Button");
			}
		}

		catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the credit card statement Tab
	 *         details.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyCreditCardStatementTabDetails() {

		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(statementTab, "Statement Tab");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Credit") + "']",
						"Credit Header");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_PAY") + "']",
						"Pay bills quick link");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_TRANSFER") + "']",
						"Transfer quick link");
				// mobileAction.verifyElementIsDisplayed(statementTab,
				// "Statement Tab");
				// mobileAction.verifyElementIsDisplayed(CClastStatement, "Last
				// Statement");

				mobileAction.verifyDateFormat(CClastStatement.getText(), MobileAction2.TYPE_YYYY_MM_DD_RANGE);

				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("rtb_last_statement_balance") + "']", "Statement Balance");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("str_Minimum_Payment") + "']",
						"Minimum payment");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("rtb_payment_due_date") + "']",
						"Payment due");

				mobileAction.FunctionSwipe("up", 200, 200);

				for (int i = 0; i < statementsAgo.size(); i++) {
					mobileAction.verifyDateFormat(statementsAgo.get(i).getText(), MobileAction2.TYPE_YYYY_MM_DD_RANGE);
				}

			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the holdings details on Investing
	 *         Account page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyInvestingHoldingDetails() {

		Decorator();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(holdingsTab, "Holdings tab");
				mobileAction.FuncClick(holdingsTab, "Holdings Tab");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Investing") + "']",
						"Investing Header");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_Transfer") + "']",
						"Transfer");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_QUOTE") + "']",
						"Quote");

				mobileAction.verifyTextEquality(symbol.getText(), mobileAction.getAppString("str_Symbol"));
				mobileAction.verifyTextEquality(priceCHG.getText(), mobileAction.getAppString("str_PriceChange"));
				mobileAction.verifyTextEquality(gainLossUnrealized.getText(),
						mobileAction.getAppString("str_GainLoss") + "\n" + mobileAction.getAppString("str_unrealized"));
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the Listed holdings details on
	 *         Holding Details page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyListedHoldingDetails() {

		Decorator();
		boolean flag = true;
		int count = 0;
		String text = null;

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(holdingsTab, "Holdings tab");
				mobileAction.FuncClick(holdingsTab, "Holdings Tab");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Investing") + "']",
						"Investing Header");

				while (flag && count < 5) {
					try {

						if (holdingName.isDisplayed()) {
							mobileAction.FuncClick(holdingName, "Holding Symbol");
							flag = false;
						} else {
							mobileAction.FunctionSwipe("up", 200, 200);
							count++;
						}

					} catch (Exception e) {
						mobileAction.FunctionSwipe("up", 200, 200);
						count++;
					}
				}

				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Holding_Detail") + "']",
						"Holding Details");

				mobileAction.verifyElementIsDisplayed(buy, "Buy Button");
				mobileAction.verifyTextEquality(buy.getText(), mobileAction.getAppString("str_BUY"));
				mobileAction.verifyElementIsDisplayed(sell, "Sell Button");
				mobileAction.verifyTextEquality(sell.getText(), mobileAction.getAppString("str_SELL"));
				text = holdingTimeStamp.getText();
				mobileAction.verifyElementIsDisplayed(holdingTimeStamp, text);
				mobileAction.verifyDateFormat(holdingTimeStamp.getText(), MobileAction2.TYPE_YYYY_MM_DD_HOUR);

				// mobileAction.verifyElementIsDisplayed(holdingGainLoss,
				// "GAIN/LOSS");
				// mobileAction.verifyTextEquality(holdingGainLoss.getText(),
				// mobileAction.getAppString("str_GainLoss_lower"));
				// mobileAction.verifyElementIsDisplayed(holdingUnrealized,
				// "Unrealized");
				// mobileAction.verifyTextEquality(holdingUnrealized.getText(),
				// mobileAction.getAppString("str_unrealized"));
				//
				// mobileAction.verifyElementUsingXPath(
				// "//android.widget.TextView[@text='"
				// + mobileAction.getAppString("str_Quantity") + "']",
				// "Quantity");
				//
				// mobileAction.verifyElementIsDisplayed(averageCost, "Average
				// Cost");
				// mobileAction.verifyTextEquality(averageCost.getText(),
				// mobileAction.getAppString("str_AverageCost"));
				//
				// mobileAction.FunctionSwipe("up", 200, 200);
				//
				// mobileAction.verifyElementIsDisplayed(bookValue, "Book
				// Value");
				// mobileAction.verifyTextEquality(bookValue.getText(),
				// mobileAction.getAppString("str_BookValue"));
				// mobileAction.verifyElementIsDisplayed(marketValue, "Market
				// Value");
				// mobileAction.verifyTextEquality(marketValue.getText(),
				// mobileAction.getAppString("str_MarketValue"));
				// mobileAction.verifyElementIsDisplayed(footerStatus, "Amount
				// converted to the currency of the account.");
				// mobileAction.verifyTextEquality(footerStatus.getText().replace("1.",
				// "").trim(),
				// mobileAction.getAppString("str_Amt_Conv_To_Act_Curr_Footnote"));

			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the Orders Tab details on
	 *         Investing page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyInvestingOrderDetails() {

		Decorator();
		boolean flagOpen = true, flagSwitch = true, flagPricedClosed = true;
		String text = null;

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Investing") + "']",
						"Investing Header");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_Transfer") + "']",
						"Transfer");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_TRADE") + "']",
						"Trade");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_QUOTE") + "']",
						"Quote");

				mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");
				mobileAction.FuncClick(ordersTab, "Orders Tab");
				text = ordersBeginningTime.getText();
				mobileAction.verifyElementIsDisplayed(ordersBeginningTime, text);
				// mobileAction.verifyDateFormat(ordersBeginningTime.getText(),
				// MobileAction2.TYPE_YYYY_MM_DD_HOUR);

				while (!mobileAction.verifyElementIsPresent(ordersEndTime)) {
					try {

						if (flagOpen) {
							String openXpath = "//android.widget.TextView[contains(@text,'"
									+ mobileAction.getAppString("open_string") + "')]";

							MobileElement openStatus = (MobileElement) (CL.GetAppiumDriver())
									.findElement(By.xpath(openXpath));

							if (openStatus.isDisplayed()) {
								mobileAction.verifyElementIsDisplayed(openStatus, "Open Order Status");
								flagOpen = false;
							}
						}

						if (flagPricedClosed) {
							String pricedMarketXpath = "//android.widget.TextView[contains(@text,'"
									+ mobileAction.getAppString("mutual_funds_pricing") + "')]";

							MobileElement pricedMarket = (MobileElement) (CL.GetAppiumDriver())
									.findElement(By.xpath(pricedMarketXpath));

							if (pricedMarket.isDisplayed()) {
								mobileAction.verifyElementIsDisplayed(pricedMarket, "Priced at market close");
								flagSwitch = false;
							}
						}

						if (flagSwitch) {
							String switchOptXpath = "//android.widget.TextView[contains(@text,'"
									+ mobileAction.getAppString("str_Switch") + "')]";

							MobileElement switchOpt = (MobileElement) (CL.GetAppiumDriver())
									.findElement(By.xpath(switchOptXpath));

							if (switchOpt.isDisplayed()) {
								mobileAction.verifyElementIsDisplayed(switchOpt, "Switch");
								flagSwitch = false;
							}
						}

						mobileAction.FunctionSwipe("up", 2000, 200);

					} catch (Exception e) {
						mobileAction.FunctionSwipe("up", 2000, 200);
					}

				}

				text = ordersEndTime.getText();
				mobileAction.verifyElementIsDisplayed(ordersEndTime, text);

			}
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
	 * @author Ashraf This method will verify the Orders details on 'Order
	 *         Details' page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyOrderDetails() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Investing") + "']",
						"Investing Header");

				mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");
				mobileAction.FuncClick(ordersTab, "Orders Tab");

			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
	 * @author Ashraf This method will verify the Activity Tab details on
	 *         'Investing' page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyActivityTabDetails() {

		Decorator();
		String text = null;
		boolean flag = true;
		int count = 0;

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Investing") + "']",
						"Investing Header");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_Transfer") + "']",
						"Transfer");

				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
								+ mobileAction.getAppString("str_QUOTE") + "']",
						"Quote");

				mobileAction.verifyElementIsDisplayed(activityTab, "Activity Tab");
				mobileAction.verifyTextEquality(activityTab.getText(), mobileAction.getAppString("str_Activity"));
				mobileAction.FuncClick(activityTab, "Activity Tab");
				mobileAction.verifyElementIsDisplayed(dateSettle, "DATE/SETTLE");
				mobileAction.verifyTextEquality(dateSettle.getText(), mobileAction.getAppString("date_settle_str"));
				mobileAction.verifyElementIsDisplayed(details, "DETAILS");
				mobileAction.verifyTextEquality(details.getText(), mobileAction.getAppString("details"));
				mobileAction.verifyElementIsDisplayed(activityAmount, "AMOUNT");
				mobileAction.verifyTextEquality(activityAmount.getText(), mobileAction.getAppString("str_AMOUNT"));

				while (flag && count < 6) {

					try {

						if (activityTimeStamp.isDisplayed()) {
							text = activityTimeStamp.getText();
							mobileAction.verifyElementIsDisplayed(activityTimeStamp, text);
							flag = false;
						} else {

							mobileAction.FunctionSwipe("up", 200, 200);
							count++;
						}

					} catch (Exception e) {

						mobileAction.FunctionSwipe("up", 200, 200);
						count++;
					}
				}

			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
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
