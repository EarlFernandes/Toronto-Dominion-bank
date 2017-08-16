package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Spending_Insight extends _CommonPage {

	private static Spending_Insight Spending_Insight;

	public synchronized static Spending_Insight get() {
		if (Spending_Insight == null) {
			Spending_Insight = new Spending_Insight();
		}
		return Spending_Insight;
	}

	String platform = null;

	@iOSFindBy(xpath = "//*[contains(@label,'Spending Insights') or contains(@label,'Aperçu des dépenses')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Spending Insights') or contains(@content-desc,'Aperçu des dépenses')]")
	private MobileElement spendingInsightHeader;

	@AndroidFindBy(xpath = "(//*[@aria-label='Menu'])[1]")
	private MobileElement sideMenuButton;

	@iOSFindBy(xpath = "//*[contains(@label,'0 Accounts Selected') or contains(@label,'0 Comptes sélectionnés')]")
	private MobileElement noAccountSelected;

	@iOSFindBy(xpath = "//*[contains(@label,'Accounts Selected')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Accounts Selected')]")
	private MobileElement accountSelected;

	@iOSFindBy(xpath = "//*[contains(@label,'MONEY PATH') or contains(@label,'Trajectoire financière') or contains(@label,'Money Path')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'MONEY PATH') or contains(@content-desc,'Trajectoire financière') or contains(@content-desc,'Money Path')]")
	private MobileElement moneyPathButton;

	@iOSFindBy(xpath = "//XCUIElementTypeLink[contains(@label,'Logout') or contains(@label,'Fermer la session')]")
	private MobileElement logout;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Spending by Category') or contains(@label,'Dépenses par catégorie')]")
	private MobileElement spendingByCategoryBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Transaction History') or contains(@label,'Historique des opérations')]")
	private MobileElement transactionHistoryBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Spending History') or contains(@label,'Historique de dépenses')]")
	private MobileElement spendingHistoryBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Home') or contains(@label,'Accueil')]")
	private MobileElement homeBtn;

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
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.verifyElementIsDisplayed(spendingInsightHeaderAndroid, "Spending Insight Header");
				CL.GetAppiumDriver().context("NATIVE_APP");
			} else {
				mobileAction.verifyElementIsDisplayed(spendingInsightHeader, "Spending Insight Header");

			}
			int leftX = spendingInsightHeader.getLocation().getX();
			int rightX = leftX + spendingInsightHeader.getSize().getWidth();
			int middleX = (rightX + leftX) / 2;
			int upperY = spendingInsightHeader.getLocation().getY();
			int lowerY = upperY + spendingInsightHeader.getSize().getHeight();
			int middleY = (upperY + lowerY) / 2;
			spendingMiddleY = middleY;

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
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
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
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail", "Exception from Method " + this.getClass().toString());
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
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (NumberFormatException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "NumberFormatException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NumberFormatException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
				mobileAction.FuncClick(logoutBtnAndroid, "Logout Button");
			} else {
				mobileAction.FuncClick(logout, "Logout Button");
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
				mobileAction.verifyElementIsDisplayed(transactionHistoryBtn, "Transaction history Button");
				mobileAction.verifyElementIsDisplayed(moneyPathButton, "MoneyPath Button");
				//mobileAction.verifyElementIsDisplayed(spendingHistoryBtn, "Spending History button");
				mobileAction.FuncClick(homeBtn, "Home Button");
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
