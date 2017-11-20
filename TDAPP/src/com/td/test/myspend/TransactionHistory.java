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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TransactionHistory extends _CommonPage {

	private static TransactionHistory TransactionHistory;

	public synchronized static TransactionHistory get() {
		if (TransactionHistory == null) {
			TransactionHistory = new TransactionHistory();
		}
		return TransactionHistory;
	}

	String platform = null;

	@iOSXCUITFindBy(xpath = "//*[contains(@value,'No transactions found') or contains(@label,'No transactions found')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'No transactions found')]")
	private MobileElement noTransactionFound;

	@iOSXCUITFindBy(xpath = "//*[contains(@value,'All Accounts') or contains(@label,'All Accounts')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement allAccounts;

	@iOSXCUITFindBy(xpath = "//*[contains(@value,'Account Transfers') or contains(@label,'Account Transfers')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement accountTransfers;

	@iOSXCUITFindBy(xpath = "//*[contains(@value,'Income') or contains(@label,'Income')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement income;

	@iOSXCUITFindBy(xpath = "//*[contains(@value,'Fees') or contains(@label,'Fees')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement fees;

	@iOSXCUITFindBy(xpath = "//*[contains(@value,'Uncategorized') or contains(@label,'Uncategorized')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Accounts')]")
	private MobileElement unCategorized;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Uncategorized') or contains(@label,'Account Transfers') or contains(@label,'Income') or contains(@label,'Fees')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Uncategorized') or contains(@content-desc,'Fees') or contains(@content-desc,'Payments') or contains(@content-desc,'Income')]")
	private MobileElement presentAccounts;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Transaction History') or contains(@label,'Historique des opérations')]")
	private MobileElement pageHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Filter by Accounts') or contains(@label,'Filtrer par compte')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Filter by Accounts') or contains(@content-desc,'Filtrer par compte')]")
	private MobileElement filterAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Filter by Category') or contains(@label,'Filtrer par catégorie')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Filter by Category') or contains(@content-desc,'Filtrer par catégorie')]")
	private MobileElement filterCategory;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'No transactions found') or contains(@label,'No transactions found')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'No transactions found')]")
	private MobileElement noTransac;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Home') or contains(@label,'Home')]")
	private MobileElement homeBtn;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Filter by Accounts')]/../following-sibling::android.view.View[contains(@content-desc,'ON')]")
	private List<MobileElement> filteredAccountss;

	@FindBy(xpath = "//*[text()='Transaction History' or text()='Historique des opérations']")
	private WebElement pageHeaderAndroid;

	@FindBy(id = "accountsFilter")
	private WebElement filterAccountAndroid;

	@FindBy(id = "categoryFilter")
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
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
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
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
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
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
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
		String[] accountValue = accountVal.split(":");
		String[] categoryValue = categoryVal.split(":");
		try {
			verifyPageHeader();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// Verify by Filtering Account
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.FuncClick(filterAccount, "Filter Account");
				if(currentLocale.equalsIgnoreCase("EN")){
					account = "//*[contains(@content-desc,'" + accountValue[0] + "')]";
				}else{
					account = "//*[contains(@content-desc,'" + accountValue[1] + "')]";
				}
				
				MobileElement selectAccount = mobileAction.mobileElementUsingXPath(account);
				mobileAction.FuncClick(selectAccount, "Account");
				
				if(currentLocale.equalsIgnoreCase("EN")){
					filteredAccount = "(//*[contains(@content-desc,'" + accountValue[0] + "')])[1]";
				}else{
					filteredAccount = "(//*[contains(@content-desc,'" + accountValue[1] + "')])[1]";
				}
				MobileElement filteredAccounts = mobileAction.mobileElementUsingXPath(filteredAccount);
				mobileAction.verifyElementIsDisplayed(filteredAccounts, "Filtered Account");

				// Verify by Filtering Categoty
				mobileAction.FuncClick(filterCategory, "Filter Category");
				
				if(currentLocale.equalsIgnoreCase("EN")){
					category = "//*[contains(@content-desc,'" + categoryValue[0] + "')]";
				}else{
					category = "//*[contains(@content-desc,'" + categoryValue[1] + "')]";
				}
				
				MobileElement selectCategory = mobileAction.mobileElementUsingXPath(category);
				mobileAction.FuncClick(selectCategory, "Category");
				
				if(currentLocale.equalsIgnoreCase("EN")){
					filteredCategory = "(//*[contains(@content-desc,'" + categoryValue[0] + "')])[1]";
				}else{
					filteredCategory = "(//*[contains(@content-desc,'" + categoryValue[1] + "')])[1]";
				}
				
				MobileElement filterCategory = mobileAction.mobileElementUsingXPath(filteredCategory);
				if (mobileAction.verifyElementIsPresent(filterCategory)) {
					mobileAction.verifyElementIsDisplayed(filterCategory, "Filtered Category");
				} else {
					mobileAction.verifyElementIsDisplayed(noTransac, "No Transactions Found");
				}

			} else {
				// Verify by Filtering Account
				mobileAction.FuncClick(filterAccount, "Filter Account");
				if(currentLocale.equalsIgnoreCase("EN")){
					account = "//*[contains(@label,'" + accountValue[0] + "') or contains(@name,'" + accountValue[0] + "')]";
				}else{
					account = "//*[contains(@label,'" + accountValue[1] + "') or contains(@name,'" + accountValue[1] + "')]";
				}
				
				MobileElement selectAccount = mobileAction.mobileElementUsingXPath(account);
				mobileAction.FuncClick(selectAccount, "Account");
				filteredAccount = "//XCUIElementTypeOther[contains(@label,'Filter by Accounts') or contains(@label,'Filtrer par compte')]/following-sibling::XCUIElementTypeOther[2]/XCUIElementTypeOther[3]";
				MobileElement filteredAccounts = mobileAction.mobileElementUsingXPath(filteredAccount);
				mobileAction.verifyElementIsDisplayed(filteredAccounts, "Filtered Account");

				// Verify by Filtering Categoty

				mobileAction.FuncClick(filterCategory, "Filter Category");
				if(currentLocale.equalsIgnoreCase("EN")){
					category = "//*[contains(@label,'" + categoryValue[0] + "') or contains(@name,'" + categoryValue[0] + "')]";
				}else{
					category = "//*[contains(@label,'" + categoryValue[1] + "') or contains(@name,'" + categoryValue[1] + "')]";
				}
				
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

		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}

}
