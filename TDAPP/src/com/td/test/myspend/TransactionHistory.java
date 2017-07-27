package com.td.test.myspend;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TransactionHistory extends _CommonPage {

	private static TransactionHistory TransactionHistory;

	public synchronized static TransactionHistory get() {
		if (TransactionHistory == null) {
			TransactionHistory = new TransactionHistory();
		}
		return TransactionHistory;
	}

	String platform = null;

	@iOSFindBy(xpath = "//*[contains(@value,'No transactions found') or contains(@label,'No transactions found')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'No transactions found')]")
	private MobileElement noTransactionFound;

	@iOSFindBy(xpath = "//*[contains(@value,'All Accounts') or contains(@label,'All Accounts')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement allAccounts;

	@iOSFindBy(xpath = "//*[contains(@value,'Account Transfers') or contains(@label,'Account Transfers')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement accountTransfers;

	@iOSFindBy(xpath = "//*[contains(@value,'Income') or contains(@label,'Income')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement income;

	@iOSFindBy(xpath = "//*[contains(@value,'Fees') or contains(@label,'Fees')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement fees;

	@iOSFindBy(xpath = "//*[contains(@value,'Uncategorized') or contains(@label,'Uncategorized')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement unCategorized;

	@iOSFindBy(xpath = "//*[contains(@label,'Uncategorized') or contains(@label,'Account Transfers') or contains(@label,'Income') or contains(@label,'Fees')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Uncategorized') or contains(@content-desc,'Fees') or contains(@content-desc,'Payments') or contains(@content-desc,'Income')]")
	private MobileElement presentAccounts;

	@iOSFindBy(xpath = "//*[contains(@label,'Transaction History') or contains(@label,'Historique des opérations')]")
	private MobileElement pageHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Filter by Accounts') or contains(@label,'Filtrer par compte')]")
	private MobileElement filterAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Filter by Category') or contains(@label,'Filtrer par catégorie')]")
	private MobileElement filterCategory;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'No transactions found') or contains(@label,'No transactions found')]")
	private MobileElement noTransac;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Home') or contains(@label,'Home')]")
	private MobileElement homeBtn;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Filter by Accounts')]/../following-sibling::android.view.View[contains(@content-desc,'ON')]")
	private List<MobileElement> filteredAccountss;

	@FindBy(xpath = "//*[text()='Transaction History' or text()='Historique des opérations']")
	private WebElement pageHeaderAndroid;

	@FindBy(xpath = "//*[text()='Filter by Accounts' or text()='Filtrer par compte']")
	private WebElement filterAccountAndroid;

	@FindBy(xpath = "//*[text()='Filter by Category' or text()='Filtrer par catégorie']")
	private WebElement filterCategoryAndroid;

	@FindBy(xpath = "//*[contains(@class,'noTransactionsMsg')]")
	private WebElement noTransacAndroid;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	public void verifyPageHeader() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(pageHeaderAndroid, "Transaction History Page Header");
			} else {
				mobileAction.verifyElementIsDisplayed(pageHeader, "Transaction History Page Header");
			}
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "IOException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyNoTransactionsFound() {

		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(noTransactionFound, "No Transactions Found");
			mobileAction.FuncClick(allAccounts, "All Accounts");
			mobileAction.verifyElementIsDisplayed(noTransactionFound, "No Transactions Found");

			if (platform.equalsIgnoreCase("Android")) {
				mobileAction.FuncClickBackButton();
			} else {
				Spending_Insight.get().clickSideMenuButton();
				SideMenu.get().clickSpendingInsights();
			}
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "InterruptedException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "IOException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyTransactions() {

		Decorator();

		try {

			boolean presentAccountsPresent = mobileAction.verifyElementIsPresent(presentAccounts);

			try {
				if (presentAccountsPresent) {
					mobileAction.verifyElementIsDisplayed(presentAccounts, "Transactions");
				} else {
					mobileAction.stringToReport("Fail", "No Transactions Found");
				}
			} catch (Exception e) {
				mobileAction.stringToReport("Fail", "No Transactions Found");
			}

			if (platform.equalsIgnoreCase("Android")) {
				mobileAction.FuncClickBackButton();
			} else {
				Spending_Insight.get().clickSideMenuButton();
				SideMenu.get().clickSpendingInsights();
			}
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "IOException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify the Transaction History Page functionality by
	 * selecting the category and account
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

	public void transactionHistoryPageFunctionality() {

		Decorator();
		String account = "";
		String filteredAccount = "";
		String filteredCategory = "";
		String category = "";
		String accountVal = getTestdata("Accounts");
		String categoryVal = getTestdata("Category");
		try {
			verifyPageHeader();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// Verify by Filtering Account
				mobileAction.FuncClick(filterAccountAndroid, "Filter Account");
				account = "//*[contains(text(),'" + accountVal + "')]";
				MobileElement selectAccount = mobileAction.mobileElementUsingXPath(account);
				mobileAction.FuncClick(selectAccount, "Account");
				filteredAccount = "//*[contains(text(),'" + accountVal + "')]";
				MobileElement filteredAccounts = mobileAction.mobileElementUsingXPath(filteredAccount);
				mobileAction.verifyElementIsDisplayed(filteredAccounts, "Filtered Account");

				// Verify by Filtering Categoty

				mobileAction.FuncClick(filterCategoryAndroid, "Filter Category");
				category = "//*[contains(text(),'" + categoryVal + "')]";
				MobileElement selectCategory = mobileAction.mobileElementUsingXPath(category);
				mobileAction.FuncClick(selectCategory, "Category");
				filteredCategory = "//*[contains(text(),'" + categoryVal + "')]";
				MobileElement filterCategory = mobileAction.mobileElementUsingXPath(filteredCategory);
				if (mobileAction.verifyElementIsPresent(filterCategoryAndroid)) {
					mobileAction.verifyElementIsDisplayed(filterCategoryAndroid, "Filtered Category");
				} else {
					mobileAction.verifyElementIsDisplayed(noTransacAndroid, "No Transactions Found");
				}

			} else {
				// Verify by Filtering Account
				mobileAction.FuncClick(filterAccount, "Filter Account");
				account = "//*[contains(@label,'" + accountVal + "') or contains(@name,'" + accountVal + "')]";
				MobileElement selectAccount = mobileAction.mobileElementUsingXPath(account);
				mobileAction.FuncClick(selectAccount, "Account");
				filteredAccount = "//XCUIElementTypeOther[contains(@label,'Filter by Accounts') or contains(@label,'Filtrer par compte')]/following-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther[3]";
				MobileElement filteredAccounts = mobileAction.mobileElementUsingXPath(filteredAccount);
				mobileAction.verifyElementIsDisplayed(filteredAccounts, "Filtered Account");

				// Verify by Filtering Categoty

				mobileAction.FuncClick(filterCategory, "Filter Category");
				category = "//*[contains(@label,'" + categoryVal + "') or contains(@name,'" + categoryVal + "')]";
				MobileElement selectCategory = mobileAction.mobileElementUsingXPath(category);
				mobileAction.FuncClick(selectCategory, "Category");
				filteredCategory = "//XCUIElementTypeOther[contains(@label,'Filter by Category') or contains(@label,'Filtrer par catégorie')]/following-sibling::XCUIElementTypeOther[3]/XCUIElementTypeOther[2]";
				MobileElement filterCategory = mobileAction.mobileElementUsingXPath(filteredCategory);
				if (mobileAction.verifyElementIsPresent(filterCategory)) {
					mobileAction.verifyElementIsDisplayed(filterCategory, "Filtered Category");
				} else {
					mobileAction.verifyElementIsDisplayed(noTransac, "No Transactions Found");
				}
			}

		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "InterruptedException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "IOException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
