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

public class SpendingByCategory extends _CommonPage {

	private static SpendingByCategory SpendingByCategory;

	public synchronized static SpendingByCategory get() {
		if (SpendingByCategory == null) {
			SpendingByCategory = new SpendingByCategory();
		}
		return SpendingByCategory;
	}

	String platform = null;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	@iOSFindBy(xpath = "//*[contains(@label,'Spending by Category') or contains(@label,'Dépenses par catégorie')]")
	private MobileElement pageHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'ALL') or contains(@label,'Toutes')]")
	private MobileElement all;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'WANTS') or contains(@label,'Souhaits')]")
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='wantsFilter']")
	private MobileElement wants;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'NEEDS') or contains(@label,'Besoins')]")
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='needsFilter']")
	private MobileElement needs;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'All Categories. You') or contains(@label,'Toutes les catégories. Vous')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'All Categories. You') or contains(@content-desc,'Toutes les catégories. Vous')]")
	private MobileElement allCategoriesInfo;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'All Categories') or contains(@label,'Toutes les catégories')]")
	private MobileElement allCategories;

	@iOSFindBy(xpath = "//*[contains(@label,'Wants') or contains(@label,'Souhaits')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Wants') or contains(@content-desc,'Souhaits')]")
	private MobileElement wantsCategories;

	@iOSFindBy(xpath = "//*[contains(@label,'Needs') or contains(@label,'Besoins')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Needs') or contains(@content-desc,'Besoins')]")
	private MobileElement needsCategories;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'currently spending') or contains(@label,'êtes actuellement')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'currently spending') or contains(@content-desc,'êtes actuellement')]")
	private MobileElement youAreCurrentlySpending;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'typical spending') or contains(@label,'vos dépenses habituelles')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'typical spending') or contains(@content-desc,'vos dépenses habituelles')]")
	private MobileElement typicalSpending;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'You have spent') or contains(@label,'Vous avez dépensé')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'You have spent') or contains(@content-desc,'Vous avez dépensé')]")
	private MobileElement YouHaveSpent;

	@iOSFindBy(xpath = "//*[contains(@label,'change category') or contains(@name,'change category')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'change category')]")
	private MobileElement transactionCategory;

	@iOSFindBy(xpath = "//*[contains(@label,'All Categories Spending Details') or contains(@label,'Wants Spending Details') or contains(@label,'Needs Spending Details')]/following-sibling::XCUIElementTypeOther[3]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'change category')]/following-sibling::android.view.View")
	private MobileElement transactionName;

	@iOSFindBy(xpath = "//*[contains(@label,'All Categories Spending Details') or contains(@label,'Wants Spending Details') or contains(@label,'Needs Spending Details')]/following-sibling::XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'change category')]/following-sibling::android.view.View/android.view.View[contains(@content-desc,'$')]")
	private MobileElement amount;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='changeCategoryHeader' or contains(@content-desc,'Change Category')]")
	private MobileElement changeCategoryHeader;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'category')]")
	private List<MobileElement> categories;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Spending History') or contains(@label,'Historique de dépenses')]")
	private MobileElement historicalInsightBtn;

	@FindBy(id = "categoriesHeader")
	private WebElement pageHeaderAndroid;

	@FindBy(id = "allFilter")
	private WebElement allAndroid;

	@FindBy(id = "wantsFilter")
	private WebElement wantsAndroid;

	@FindBy(id = "needsFilter")
	private WebElement needsAndroid;

	@FindBy(xpath = "//*[text()='All Categories' or contains(text(),'Toutes les catégories')]")
	private WebElement allCategoriesAndroid;

	@FindBy(xpath = "(//*[contains(text(),'currently spending') or contains(text(),'êtes actuellement')])[1]")
	private WebElement youAreCurrentlySpendingAndroid;

	@FindBy(xpath = "//*[text()='Wants' or text()='Souhaits']")
	private WebElement wantsCategoriesAndroid;

	@FindBy(xpath = "//*[text()='Needs' or text()='Besoins']")
	private WebElement needsCategoriesAndroid;

	@FindBy(id = "homeButton")
	private WebElement historicalInsightBtnAndroid;

	/**
	 * This method will verify the 'Spending By Category' header page.
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
	public void verifyPageHeader() {

		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(pageHeaderAndroid, "Spending By Category Page Header");
			} else {
				mobileAction.verifyElementIsDisplayed(pageHeader, "Spending By Category Page Header");
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
	 * This method will verify All category tab and all spending details.
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
	public void verifyAllCategory() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(allAndroid, "All Tab");
				mobileAction.verifyElementIsDisplayed(allCategoriesAndroid, "All Categories Heading");
				mobileAction.verifyElementIsDisplayed(youAreCurrentlySpendingAndroid, "You're currently spending");
				verifyTransactions("All");
			} else {
				mobileAction.verifyElementIsDisplayed(all, "All Tab");
				mobileAction.verifyElementIsDisplayed(allCategories, "All Categories Heading");
				mobileAction.verifyElementIsDisplayed(youAreCurrentlySpending, "You're currently spending");
				mobileAction.verifyElementIsDisplayed(typicalSpending, "Typical Spending Bar");
				mobileAction.verifyElementIsDisplayed(YouHaveSpent, "Current Spending Bar");

				verifyTransactions("All");
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
	 * This method will verify whether the transactions are present on the
	 * specified Category.
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
	public boolean verifyTransactions(String categoryType) {
		Decorator();
		boolean flag = true;
		try {

			boolean transactionpresent = mobileAction.verifyElementIsPresent(transactionCategory);
			if (transactionpresent) {

				String category = transactionCategory.getAttribute("name");
				System.out.println("verifyTransactions Text----> " + category);
				String[] catArr = category.split(". ");

				mobileAction.verifyElementIsDisplayed(transactionCategory, "Transaction Category: " + catArr[0]);

				String TransName = transactionName.getAttribute("name");

				mobileAction.verifyElementIsDisplayed(transactionName, "Transaction: " + TransName);

				String amountText = amount.getAttribute("name");

				mobileAction.verifyElementIsDisplayed(amount, "Amount: " + amountText);

				flag = true;

			} else {
				mobileAction.stringToReport("Pass",
						"No Transactions Found in spending by Category <b>" + categoryType + "</b>");

				flag = false;
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
		return flag; // Flag is being returned. Don't forget to add this line

	}

	/**
	 * This method will verify whether the transactions are present on the
	 * specified Category.
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
	public void changeCategory() {
		Decorator();
		try {

			boolean transactionpresent = mobileAction.verifyElementIsPresent(transactionCategory);
			if (transactionpresent) {

				String category = transactionCategory.getAttribute("name");
				System.out.println("click to Change Category Text----> " + category);
				String[] catArr = category.split(". ");
				String oldCat = catArr[0];

				int i = 0;
				int count = 0;
				while (count < 2) {

					mobileAction.FuncTapCord(transactionCategory, catArr[0]);
					mobileAction.FuncWaitForElement(categories.get(0), 5, "Categories");
					if (categories.size() != 0) {
						String categoryName = categories.get(i).getAttribute("name");
						System.out.println((i + 1) + "th Category to change: " + categoryName);
						String[] nameArr = categoryName.split(" ");
						if (!nameArr[0].equalsIgnoreCase(catArr[0])) {
							mobileAction.FuncClickTap(categories.get(i), nameArr[0]);
							// mobileAction.switchContext("NATIVE_APP");
							category = transactionCategory.getAttribute("name");
							System.out.println(i + "th selected category: " + category);
							catArr = category.split(". ");
							if (nameArr[0].equalsIgnoreCase(catArr[0])) {
								mobileAction.stringToReport("Pass", "Transaction Category changed from <b>" + oldCat
										+ "</b> to <b>" + nameArr[0] + "</b>");
							} else {
								mobileAction.stringToReport("Fail", "Transaction Category did not Change from <b>"
										+ oldCat + "</b> to <b>" + nameArr[0] + "</b>");
							}

							count++;
							i++;
						}

						i++;
					} else {
						mobileAction.stringToReport("Fail", "Failed to identify the Categories.");
					}
				}

				count = 0;
				i = 0;

			} else {
				mobileAction.stringToReport("Pass", "No Transactions Found in spending by Category");
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
	 * This method will click on every Tab, verify the details and change
	 * Transactions category for all Tabs - ALL,WANTS,NEEDS.
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
	public void changeCategoryForAllTabs() {
		Decorator();
		try {

			verifyAllCategory();
			changeCategory();
			verifyWantsCategory();
			changeCategory();
			verifyNeedsCategory();
			changeCategory();

		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will verify Wants category tab and all spending details.
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
	public void verifyWantsCategory() {
		Decorator();
		try {
			mobileAction.FuncClick(wants, "WANTS Tab");
			mobileAction.verifyElementIsDisplayed(wants, "WANTS Tab");
			mobileAction.verifyElementIsDisplayed(wantsCategories, "Wants Categories Heading");
			mobileAction.verifyElementIsDisplayed(youAreCurrentlySpending, "You're currently spending");
			mobileAction.verifyElementIsDisplayed(typicalSpending, "Typical Spending Bar");
			mobileAction.verifyElementIsDisplayed(YouHaveSpent, "Current Spending Bar");

			verifyTransactions("Wants");

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
	 * This method will verify Needs category tab and all spending details.
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
	public void verifyNeedsCategory() {
		Decorator();
		try {
			mobileAction.FuncClick(needs, "NEEDS Tab");
			mobileAction.verifyElementIsDisplayed(needs, "NEEDS Tab");
			mobileAction.verifyElementIsDisplayed(needsCategories, "Needs Categories Heading");
			mobileAction.verifyElementIsDisplayed(youAreCurrentlySpending, "You're currently spending");
			mobileAction.verifyElementIsDisplayed(typicalSpending, "Typical Spending Bar");
			mobileAction.verifyElementIsDisplayed(YouHaveSpent, "Current Spending Bar");

			verifyTransactions("Needs");

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
	 * This method will verify All category tabs and all spendings details.
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
	public void verifySpendingByCategories() {

		Decorator();

		try {

			verifyAllCategory();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
			}
			verifyWantsCategory();
			verifyNeedsCategory();

		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will click on the historical insight button on the top right
	 * corner of spending by category page
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
	public void clickHistoricalInsightsBtn() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(historicalInsightBtnAndroid, "Historical Insight Button");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				}
			} else {

				mobileAction.FuncClick(historicalInsightBtn, "Historical Insight Button");
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
