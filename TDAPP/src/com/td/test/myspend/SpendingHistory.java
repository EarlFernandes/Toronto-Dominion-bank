package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import com.td.test.CDNMobile.pages.GetDate;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SpendingHistory extends _CommonPage {

	private static SpendingHistory SpendingHistory;

	public synchronized static SpendingHistory get() {
		if (SpendingHistory == null) {
			SpendingHistory = new SpendingHistory();
		}
		return SpendingHistory;
	}

	String platform = null;

	@iOSFindBy(xpath = "//*[contains(@value,'There is no spending history to display') or contains(@label,'There is no spending history to display')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'no spending history')]")
	private MobileElement noSpendingHistory;

	@iOSFindBy(xpath = "//*[@label='Spending History' or @label='Historique de dépenses']")
	private MobileElement spendingHistoryHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Spending Insights' or @label='Aperçu des dépenses']")
	private MobileElement spendingInsightsTab;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='MONEY PATH' or @label='Trajectoire financière']")
	private MobileElement moneyPathTab;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Spending by Category' or @label='Dépenses par catégorie']")
	private MobileElement spendingByCategoryTab;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Previous Month' or @label='Mois précédent']")
	private MobileElement leftArrow;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Next Month' or @label='Mois suivant']")
	private MobileElement RightArrow;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Spending History Dashboard' or @label='Historique de dépenses']")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Spending History Dashboard') or contains(@content-desc,'Historique de dépenses')]")
	private MobileElement spendingHistoryBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Home' or @label='Accueil']")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Home') or contains(@content-desc,'Accueil')]")
	private MobileElement homeBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Quick Access Settings' or @label='Paramètres Accès rapide']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access' or @content-desc='Quick Access enroll']")
	private MobileElement TDAppHomePage;

	@iOSFindBy(xpath = "//*[contains(@label,'Preferences') or contains(@label,'Préférences') or contains(@label,'préférences')]")
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'Preferences') or contains(@content-desc,'Préférences.')]")
	private MobileElement preferencesLink;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Home']/../following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
	private MobileElement currentMonthElement;

	@FindBy(id = "spendingHistoryOverviewHeader")
	private WebElement spendingHistoryHeaderAndroid;

	@FindBy(xpath = "//*[@aria-label='Spending Insights' or @aria-label='Aperçu des dépenses']")
	private WebElement spendingInsightsTabAndroid;

	@FindBy(xpath = "//*[contains(@class,'moneyPath')]")
	private WebElement moneyPathTabAndroid;

	@FindBy(xpath = "//*[contains(@class,'categories')]")
	private WebElement spendingByCategoryTabAndroid;

	@FindBy(xpath = "//*[contains(@class,'arrow-back')]")
	private WebElement leftArrowAndroid;

	@FindBy(xpath = "//*[contains(@class,'title-month')]")
	private WebElement currentMonthElementAndroid;

	@FindBy(xpath = "//*[contains(@class,'arrow-forward')]")
	private WebElement RightArrowAndroid;

	@FindBy(xpath = "//*[@id='homeButton']")
	private WebElement homeBtnAndroid;

	@FindBy(xpath = "//*[contains(text(),'Preferences') or text()='Préférences.']")
	private WebElement preferencesLinkAndroid;

	@FindBy(xpath = "//*[contains(@class='spend-history')]")
	private WebElement spendingHistoryBtnAndroid;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	/**
	 * This method will verify the Spending History Header
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
	public void verifySpendingHistoryHeader() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(spendingHistoryHeaderAndroid, "Spending History");
			} else {

				mobileAction.verifyElementIsDisplayed(spendingHistoryHeader, "Spending History");
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

	public void verifyNoSpendingHistory() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(noSpendingHistory, "No Spending History");

			mobileAction.FuncClickBackButton();
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

	public void verifySpendingHistory() {
		Decorator();
		int currentYear = GetDate.currentYear();
		int lastYear = currentYear - 1;
		String yearCategoryXpath = "//android.view.View[@content-desc='" + currentYear + "' or @content-desc='"
				+ lastYear + "']";
		try {

			MobileElement yearCategory = (MobileElement) (CL.GetAppiumDriver())
					.findElement(By.xpath(yearCategoryXpath));

			String value = yearCategory.getAttribute("name");

			mobileAction.verifyElementIsDisplayed(yearCategory, value);

			mobileAction.FuncClickBackButton();
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
	 * This method will click on any month icon
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
	public void clickMonthIcon() {
		Decorator();
		int currentYear = GetDate.currentYear();
		String monthIcon = "";
		try {
			verifySpendingHistoryHeader();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				monthIcon = "(//*[@class='spend-meter-icon'])[2]";
			} else {
				monthIcon = "//*[contains(@label,'" + currentYear + " Monthly Spending') or contains(@label,'"
						+ currentYear + " Dépenses mensuelles')]/following-sibling::XCUIElementTypeButton[2]";
			}
			MobileElement selectMonthIcon = mobileAction.mobileElementUsingXPath(monthIcon);
			mobileAction.FuncClick(selectMonthIcon, "Month Icon");
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
	 * This method will verify the tabs in the Spending History Page of a month
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
	public void verifyTabs() {
		Decorator();
		String currentMonth = GetDate.getCurrentMonth();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(spendingInsightsTabAndroid, "Spending Insights Tab");
				mobileAction.verifyElementIsDisplayed(moneyPathTabAndroid, "MoneyPath Tab");
				mobileAction.verifyElementIsDisplayed(spendingByCategoryTabAndroid, "Spending by Category Tab");
				mobileAction.verifyElementIsDisplayed(leftArrowAndroid, "Left Arrow");
				System.out.println(currentMonthElementAndroid.getText());
				if (mobileAction.verifyTextIsContained(currentMonthElementAndroid, currentMonth)) {
					mobileAction.stringToReport("Pass", "Next Month is not Enabled");
				} else {
					mobileAction.verifyElementIsDisplayed(RightArrowAndroid, "Right Arrow");
				}
			} else {
				mobileAction.verifyElementIsDisplayed(spendingInsightsTab, "Spending Insights Tab");
				mobileAction.verifyElementIsDisplayed(moneyPathTab, "MoneyPath Tab");
				mobileAction.verifyElementIsDisplayed(spendingByCategoryTab, "Spending by Category Tab");
				mobileAction.verifyElementIsDisplayed(leftArrow, "Left Arrow");
				mobileAction.FuncClick(leftArrow, "Previous Month");
				if (mobileAction.verifyTextIsContained(currentMonthElement, currentMonth)) {
					mobileAction.stringToReport("Pass", "Next Month is not Enabled");
				} else {
					mobileAction.verifyElementIsDisplayed(RightArrow, "Right Arrow");
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
	 * This method will click on the home button
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
	public void clickHomeButton() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
			}
			mobileAction.FuncClick(homeBtn, "Home Button");
			mobileAction.verifyElementIsDisplayed(TDAppHomePage, "Home Page");
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
	 * This method will click on preferences link
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
	public void clickPreferencesLink() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.FuncClick(preferencesLink, "Preferences Link");
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
			} else {
				mobileAction.FuncClick(preferencesLink, "Preferences Link");
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
	 * This method will verify the Spending History Header
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
	public void clickSpendingHistory() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
			}
			mobileAction.FuncClick(spendingHistoryBtn, "Spending History Button");

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

}
