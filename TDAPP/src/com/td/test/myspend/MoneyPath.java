package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import com.td.test.CDNMobile.pages.GetDate;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MoneyPath extends _CommonPage {

	private static MoneyPath MoneyPath;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'typical spending') or contains(@label,'vos dépenses moyennes')]")
	private MobileElement spendingDetailsFromGraph;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Spending Details') or contains(@label,'Détail des dépenses')]")
	private MobileElement spendingDetailsHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'No transactions found') or contains(@label,'Aucune opération trouvée')]")
	private MobileElement noTransactions;

	@FindBy(xpath = "//*[contains(@class,'spendingDetailsTitle')]")
	private WebElement spendingDetailsHeaderAndroid;

	@FindBy(xpath = "//*[contains(@class,'noTransactionsMsg')]")
	private WebElement noTransactionsAndroid;

	public synchronized static MoneyPath get() {
		if (MoneyPath == null) {
			MoneyPath = new MoneyPath();
		}
		return MoneyPath;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will verify the MoneyPath header
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
		String header = "";
		String currentMonth = GetDate.getCurrentMonth();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				header = "//*[@id='moneyPathHeader']";
			} else {
				header = "//*[contains(@label,'" + currentMonth + " Spending') or contains(@label,'Aperçu de')]";
			}
			MobileElement moneyPathHeader = mobileAction.mobileElementUsingXPath(header);
			mobileAction.verifyElementIsDisplayed(moneyPathHeader, "MoneyPath Header");

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
	 * This method will verify the MoneyPath Functionality
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
	public void moneyPathFunctionality() throws InterruptedException {

		Decorator();
		String details = ""; // As of today, you are $400 below your typical
								// spending of $400.
								// You have spent $0. Your typical spending at
								// end of the month is $2,046
		try {
			verifyPageHeader();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(spendingDetailsHeaderAndroid, "Spending Details Header");
				if (mobileAction.verifyElementIsPresent(noTransactionsAndroid)) {
					mobileAction.verifyElementIsDisplayed(noTransactionsAndroid, "No Transactions Found");
				}
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.TapCoOrdinates(30, 141, "Side Menu Bar");
			} else {
				details = mobileAction.FuncGetElementText(spendingDetailsFromGraph);
				System.out.println(details);
				String[] value = details.split(",");
				for (int i = 0; i < value.length; i++) {
					System.out.println("Split value: " + value[i]);
				}
				// mobileAction.verifyElementIsDisplayed(spendingDetailsFromGraph,
				// "Spending Details from graph");
				mobileAction.verifyElementIsDisplayed(spendingDetailsHeader, "Spending Details Header");
				if (mobileAction.verifyElementIsPresent(noTransactions)) {
					mobileAction.verifyElementIsDisplayed(noTransactions, "No Transactions Found");
				}
				Spending_Insight.get().clickSideMenuButton();
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
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
