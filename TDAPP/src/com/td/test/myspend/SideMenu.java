package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SideMenu extends com.td._CommonPage {

	private static SideMenu SideMenu;

	public synchronized static SideMenu get() {
		if (SideMenu == null) {
			SideMenu = new SideMenu();
		}
		return SideMenu;
	}

	String platform = null;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[contains(@label,'Preferences') or contains(@label,'Préférences')]")
	private MobileElement preferences;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[contains(@name,'Spending Spikes') or contains(@label,'Pics de dépenses')]")
	private MobileElement spendingSpikes;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[contains(@name,'Daily Digest') or contains(@label,'Sommaire quotidien')]")
	private MobileElement dailyDigest;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[contains(@name,'Spending History') or contains(@name,'Historique de dépenses')]")
	private MobileElement spendingHistory;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[contains(@label,'Transaction History') or contains(@label,'Historique des opérations')]")
	private MobileElement transactionHistory;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[contains(@label,'My Accounts') or contains(@label,'Mes comptes')]")
	private MobileElement myAccounts;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[contains(@label,'Transfers') or contains(@label,'Virements')]")
	private MobileElement transfers;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[contains(@label,'Bills') or contains(@label,'Factures')]")
	private MobileElement bills;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[contains(@label,'Spending by Category') or contains(@label,'Dépenses par catégorie')]")
	private MobileElement spendingByCategory;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[contains(@label,'Spending Insights') or contains(@label,'Aperçu des dépenses')]")
	private MobileElement spendingInsights;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Go back to TD MySpend') or contains(@label,'Go back') or contains(@label,'Retourner à Dépense TD')]")
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'Go back to TD MySpend') or contains(@content-desc,'Retourner à Dépense TD')]")
	private MobileElement quickLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Get the TD app' or contains(@label,'Obtenir l')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Get the TD app') or contains(@content-desc,'Obtenir l')]")
	private MobileElement getTDApp;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Featured']")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Featured')]")
	private MobileElement featuresBtn;

	@FindBy(xpath = "(//*[contains(@href,'spendHistoryOverview')])[2]")
	private WebElement spendingHistoryAndroid;

	@FindBy(xpath = "(//*[contains(@href,'home')])[2]")
	private WebElement spendingInsightsAndroid;

	@FindBy(xpath = "(//*[contains(@href,'categories')])[2]")
	private WebElement spendingByCategoryAndroid;

	@FindBy(xpath = "(//*[contains(@href,'spikeHistory')])[2]")
	private WebElement spendingSpikesAndroid;

	@FindBy(xpath = "(//*[contains(@href,'transactions')])[2]")
	private WebElement transactionHistoryAndroid;

	@FindBy(xpath = "(//*[contains(@href,'accountSettings') or contains(@href,'settings')])[2]")
	private WebElement preferencesAndroid;

	@FindBy(xpath = "//*[contains(@ng-click,'accounts')]")
	private WebElement accountsAndroid;

	@FindBy(xpath = "//*[contains(@ng-click,'transfer')]")
	private WebElement transfersAndroid;

	@FindBy(xpath = "//*[contains(@ng-click,'billpay')]")
	private WebElement billsAndroid;
	
	@FindBy(xpath = "(//*[contains(@href,'dailyDigest')])[2]")
	private WebElement dailyDigestAndroid;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	/**
	 * This method will click on the preferences button and verify the page
	 * header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickPreferences() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(preferencesAndroid, "Preferences");
			} else {
				mobileAction.FuncClick(preferences, "Preferences");

			}
			MyspendPreferences.get().verifyPageHeader();
		}catch (Exception e) {
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
	 * This method will click on the Spending Spike button and verify the page
	 * header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickSpendingSpikes() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(spendingSpikesAndroid, "Spending Spike");
			} else {
				mobileAction.FuncClick(spendingSpikes, "Spending Spike");
			}
			SpendingSpikes.get().verifyPageheader();
		}catch (Exception e) {
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
	 * This method will click on the Spending By Category button and verify the
	 * page header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */

	public void clickSpendingByCategory() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(spendingByCategoryAndroid, "Spending By Category");
			} else {
				mobileAction.FuncClick(spendingByCategory, "Spending By Category");
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
	 * This method will click on the Spending Insights button and verify the
	 * page header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickSpendingInsights() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(spendingInsightsAndroid, "Spending Insights");

			} else {
				mobileAction.FuncClick(spendingInsights, "Spending Insights");
			}
			Thread.sleep(2000);

		}catch (Exception e) {
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
	 * This method will click on the Spending History button and verify the page
	 * header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickSpendingHistory() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(spendingHistoryAndroid, "Spending History");
			} else {
				mobileAction.FuncClick(spendingHistory, "Spending History");

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
	 * This method will click on the Transaction History button and verify the
	 * page header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickTransactionHistory() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(transactionHistoryAndroid, "Transaction History");
			} else {
				mobileAction.FuncClick(transactionHistory, "Transaction History");
			}
		}catch (Exception e) {
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
	 * This method will click on the My Accounts button and verify the page
	 * header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */

	public void clickMyAccounts() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(accountsAndroid, "My Accounts");
				CL.GetAppiumDriver().context("NATIVE_APP");
			} else {
				mobileAction.FuncClick(myAccounts, "My Accounts");
			}
		}catch (Exception e) {
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
	 * This method will click on the Transfers button and verify the page
	 * header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickTransfers() {
		Decorator();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.FuncClick(transfersAndroid, "Transfers");
				CL.GetAppiumDriver().context("NATIVE_APP");
			} else {
				mobileAction.FuncClick(transfers, "Transfers");
			}
		}catch (Exception e) {
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
	 * This method will click on the Bills button and verify the page header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickBills() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(billsAndroid, "Bills");
				CL.GetAppiumDriver().context("NATIVE_APP");
			} else {
				mobileAction.FuncClick(bills, "Bills");
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
	 * This method will verify the deep links functionality in the app.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void verifyDeepLinks() {
		Decorator();

		try {
			clickPreferences();
			MyspendPreferences.get().verifyPageHeader();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
			}
			Spending_Insight.get().clickSideMenuButton();
			clickMyAccounts();
			mobileAction.FuncClick(quickLink, "Quick Link");
			Spending_Insight.get().clickSideMenuButton();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.FunctionSwipe("Up", 200, 200);
			}
			clickTransfers();
			mobileAction.FuncClick(quickLink, "Quick Link");
			Spending_Insight.get().clickSideMenuButton();
			clickBills();
			mobileAction.FuncClick(quickLink, "Quick Link");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
			}
			MyspendPreferences.get().verifyPageHeader();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
			}

		}catch (Exception e) {
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
	 * This method will click on 'Get The TD App' button if TDAPP is not
	 * installed.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */

	public void clickGetTDAppButton() {
		Decorator();

		try {
			mobileAction.FuncClick(getTDApp, "Get the TD app");
		}catch (Exception e) {
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
	 * This method will click on the Daily Digest button and verify the page
	 * header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickDailyDigest() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(dailyDigestAndroid, "Daily Digest");
			} else {
				mobileAction.FuncClick(dailyDigest, "Daily Digest");
			}
			DailyDigest.get().verifyPageheader();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
			}
			
		}catch (Exception e) {
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
	 * This method will click on the Side Menu twice
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickSideMenu() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				Spending_Insight.get().clickSideMenuButton();
				CL.GetAppiumDriver().context("NATIVE_APP");
				Spending_Insight.get().clickSideMenuButton();

			} else {
				
				Spending_Insight.get().clickSideMenuButton();
				Spending_Insight.get().clickSideMenuButton();
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
