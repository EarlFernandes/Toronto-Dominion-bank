package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import com.td.test.CDNMobile.pages.HomeScreen;
import com.td.test.CDNMobile.pages.Login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Spending_Insight extends _CommonPage {

	private static Spending_Insight Spending_Insight;

	public synchronized static Spending_Insight get() {
		if (Spending_Insight == null) {
			Spending_Insight = new Spending_Insight();
		}
		return Spending_Insight;
	}

	String platform = null;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Spending Insights') or contains(@label,'Aperçu des dépenses')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Spending Insights') or contains(@content-desc,'Aperçu des dépenses') or contains(@text,'Spending Insights')]")
	private MobileElement spendingInsightHeader;

	@AndroidFindBy(xpath = "(//*[@aria-label='Menu'])[1]")
	private MobileElement sideMenuButton;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'0 Accounts Selected') or contains(@label,'0 Comptes sélectionnés')]")
	private MobileElement noAccountSelected;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Daily Digest') or contains(@label,'Sommaire quotidien')]")
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='Daily Digest' or @content-desc='Sommaire quotidien' or @text='Daily Digest']")
	private MobileElement dailyDigest;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Accounts Selected')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Accounts Selected')]")
	private MobileElement accountSelected;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'MONEY PATH') or contains(@label,'Trajectoire financière') or contains(@label,'Money Path')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'MONEY PATH') or contains(@content-desc,'Trajectoire financière') or contains(@content-desc,'Money Path') or contains(@text,'Money Path')]")
	private MobileElement moneyPathButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[contains(@label,'Logout') or contains(@label,'Fermer la session')]")
	@AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc,'Logout')])[2]")
	private MobileElement logout;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Spending by Category') or contains(@label,'Dépenses par catégorie')]")
	private MobileElement spendingByCategoryBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Transaction History') or contains(@label,'Historique des opérations')]")
	private MobileElement transactionHistoryBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Spending History') or contains(@label,'Historique de dépenses')]")
	private MobileElement spendingHistoryBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Home') or contains(@label,'Accueil')]")
	private MobileElement homeBtn;
	
	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_QUICK_ACCESS")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access'] | //android.widget.TextView[@resource-id='com.td:id/easy_access']")
	private MobileElement quickAccess;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD MySpend' or @label='Dépense TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='TD MySpend' or @text='Dépense TD')]")
	private MobileElement TDMySpend;
	
	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Session Expired')]")
	@AndroidFindBy(xpath = "//*[contains(@text,'Session Expired')]")
	private MobileElement sessionExpired;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'OK')]")
	@AndroidFindBy(xpath = "//*[contains(@text,'OK')]")
	private MobileElement okBtn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Accounts Selected') or contains(@name,'Comptes sélectionnés')]")
	private MobileElement accountsSelected;

	@FindBy(xpath = "//*[text()='Spending Insights' or text()='Aperçu des dépenses']")
	private WebElement spendingInsightHeaderAndroid;

	@FindBy(id = "homeButton")
	private WebElement homeBtnAndroid;

	@FindBy(xpath = "//*[@aria-label='Spending by Category' or @aria-label='Dépenses par catégorie']")
	private WebElement spendingByCategoryBtnAndroid;

	@FindBy(xpath = "//*[@aria-label='Transaction History' or @aria-label='Historique des opérations']")
	private WebElement transactionHistorybtnAndroid;

	@FindBy(xpath = "//*[contains(@class,'money-path')]")
	private WebElement moneyPathBtnAndroid;

	@FindBy(xpath = "//*[contains(@class,'spend-history')]")
	private WebElement spendingHistoryBtnAndroid;

	@FindBy(id = "firstMenuItem")
	private WebElement logoutBtnAndroid;

	@FindBy(xpath = "//*[contains(@class,'numberAccountsText')]")
	private WebElement noAccountSelectedAndroid;
	
	@FindBy(xpath = "//*[@aria-label='Daily Digest']")
	private WebElement dailyDigestAndroid;

	int spendingMiddleY = 0;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	/**
	 * This method will verify the 'Spending Insight' header page.
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
	public void verifyPageHeader() throws InterruptedException {

		Decorator();

		try {
			if(mobileAction.verifyElementIsPresent(sessionExpired)){
				mobileAction.FuncClick(okBtn, "Ok");
			}
			if(mobileAction.verifyElementIsPresent(quickAccess)){
				HomeScreen.get().clickMenu();
				mobileAction.FuncClick(TDMySpend, "TD My Spend");
			}				
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				if(!mobileAction.verifyElementIsPresent(spendingInsightHeaderAndroid)){
					CL.GetAppiumDriver().context("NATIVE_APP");
					Login.get().login();
				}
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.verifyElementIsDisplayed(spendingInsightHeaderAndroid, "Spending Insight Header");
				CL.GetAppiumDriver().context("NATIVE_APP");
			} else {
				if(!mobileAction.verifyElementIsPresent(spendingInsightHeader)){
					Login.get().login();
				}
				mobileAction.verifyElementIsDisplayed(spendingInsightHeader, "Spending Insight Header");

			}
			int leftX = spendingInsightHeader.getLocation().getX();
			int rightX = leftX + spendingInsightHeader.getSize().getWidth();
			int middleX = (rightX + leftX) / 2;
			int upperY = spendingInsightHeader.getLocation().getY();
			int lowerY = upperY + spendingInsightHeader.getSize().getHeight();
			int middleY = (upperY + lowerY) / 2;
			spendingMiddleY = middleY;

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
	 * This method will verify the 'Spending Insight' header page.
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
	public void clickSideMenuButton() {

		Decorator();

		try {

			// mobileAction.FuncClick(sideMenuButton, "Side Menu Button");
			mobileAction.TapCoOrdinates(30, spendingMiddleY, "Side Menu Bar");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
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
	 * This method will verify the 'Spending Insight' header page.
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
	public void verifyPreferencesDisabled() {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(noAccountSelectedAndroid, "0 Accounts Selected");
			} else {
				mobileAction.verifyElementIsDisplayed(noAccountSelected, "0 Accounts Selected");
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
	 * This method will verify the 'Spending Insight' header page.
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
	public void verifyPreferencesEnabled() {

		Decorator();

		try {

			String accountsSelectedText = accountSelected.getAttribute("name");
			String[] accountsSelectedArr = accountsSelectedText.split(" Accounts");
			int accountsCount = Integer.parseInt(accountsSelectedArr[0]);

			if (accountsCount > 0) {
				mobileAction.verifyElementIsDisplayed(accountSelected, accountsCount + " Accounts Selected");
			} else {
				mobileAction.stringToReport("Fail",
						"0 accounts are enabled or accounts are not present in preferences");
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
	 * This method will logout from the application
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
	public void logoutApplication() {

		Decorator();

		try {
			clickSideMenuButton();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.FunctionSwipe("Down", 200, 200);
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.FuncClick(logoutBtnAndroid, "Logout Button");
			} else {
				mobileAction.FuncClick(logout, "Logout Button");
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
	 * This method will click on the money path button
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
	public void clickMoneyPathButton() {

		Decorator();

		try {
			mobileAction.FuncClick(moneyPathButton, "Money Path Button");

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
	 * This method will verify all the buttons of the page
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
	public void verifySpendingInsightsPage() {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.verifyElementIsDisplayed(spendingByCategoryBtnAndroid, "Spending by category button");
				mobileAction.verifyElementIsDisplayed(transactionHistorybtnAndroid, "Transaction history Button");
				mobileAction.verifyElementIsDisplayed(moneyPathBtnAndroid, "MoneyPath Button");
				mobileAction.verifyElementIsDisplayed(spendingHistoryBtnAndroid, "Spending History button");
				mobileAction.FuncClick(homeBtnAndroid, "Home Button");
			} else {
				mobileAction.verifyElementIsDisplayed(spendingByCategoryBtn, "Spending by category button");
				//mobileAction.verifyElementIsDisplayed(transactionHistoryBtn, "Transaction history Button");
				mobileAction.verifyElementIsDisplayed(moneyPathButton, "MoneyPath Button");
				mobileAction.verifyElementIsDisplayed(spendingHistoryBtn, "Spending History button");
				mobileAction.FuncClick(homeBtn, "Home Button");
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
	 * This method will click on the Daily Digest in the Spending Insight Page
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
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.FuncClick(dailyDigest, "Daily Digest");
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				//mobileAction.FuncClick(dailyDigestAndroid, "Daily Digest");
			} else {
				mobileAction.FuncClick(dailyDigest, "Daily Digest");
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
	 * This method will verify the number of accounts selected below the wheel in Spending Insights page
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
	public void verifyAccountSelected() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.FuncClick(dailyDigest, "Daily Digest");
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				//mobileAction.FuncClick(dailyDigestAndroid, "Daily Digest");
			} else {
				mobileAction.FuncClick(dailyDigest, "Daily Digest");
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
	 * This method will verify the number of active accounts
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
	public void verifyActiveAccounts() {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(noAccountSelectedAndroid, "No. of Accounts Selected: " + noAccountSelectedAndroid.getText());
				CL.GetAppiumDriver().context("NATIVE_APP");
			} else {
				mobileAction.verifyElementIsDisplayed(accountsSelected, "No. of Accounts Selected: " + accountsSelected.getText());
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
