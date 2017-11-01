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
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SpendingSpikes extends _CommonPage {

	private static SpendingSpikes SpendingSpikes;

	public synchronized static SpendingSpikes get() {
		if (SpendingSpikes == null) {
			SpendingSpikes = new SpendingSpikes();
		}
		return SpendingSpikes;
	}

	String platform = null;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'Spending Spikes') or contains(@label,'Pics de dépenses')]")
	private MobileElement pageHeader;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Current Month') or contains(@label,'Mois en cours')]")
	private MobileElement currentMonth;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Previous Months') or contains(@label,'Mois précédents')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Spending Spikes')]")
	private MobileElement previousMonth;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='homeButton' or contains(@content-desc,'Home')]")
	private MobileElement homeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Current Month') or contains(@label,'Mois en cours')]/following-sibling::XCUIElementTypeOther[4]")
	@AndroidFindBy(xpath = "//*[contains(@content-desc,'Current Month') or contains(@content-desc,'Mois en cours')]/../following-sibling::android.view.View[2]")
	private MobileElement currentMonthSpending;
	
	@FindBy(xpath="//*[text()='Spending Spikes' or text()='Pics de dépenses']")
	private WebElement pageHeaderAndroid;

	@FindBy(xpath="//*[text()='Current Month' or text()='Mois en cours']")
	private WebElement currentMonthAndroid;
	
	@FindBy(xpath="//*[text()='Previous Months' or text()='Mois précédents']")
	private WebElement previousMonthAndroid;
	
	@FindBy(xpath="(//*[@class='col listItemTextBigWrap ng-binding'])[1]")
	private WebElement currentMonthSpendingAndroid;
	
	/**
	 * This method will verify the Spending Spike page header.
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
	public void verifyPageheader() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(pageHeaderAndroid, "Spending Spike Page Header");
			} else {
				mobileAction.verifyElementIsDisplayed(pageHeader, "Spending Spike Page Header");
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
		}catch (IOException e) {
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
	 * This method will verify the Spending Spike page header.
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
	public void clickHomeLink() {
		Decorator();

		try {
			mobileAction.FuncClick(homeButton, "Home button");

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
	 * This method will click on the current month spending and verify the graph
	 * details.
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
	public void clickCurrentMonthSpending() {
		Decorator();

		try {
			String spendingText = currentMonthSpending.getAttribute("name");
			String[] arrText = spendingText.split(". ");
			mobileAction.FuncClickTap(currentMonthSpending, arrText[0]);
			SpendingGraph.get().verifySpendingGraphPageDetails();

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
	 * This method will verify the spending spikes page with different spikes categories in a list view according to the date
	 * details.
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
	public void verifySpikesCategories() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				
				mobileAction.verifyElementIsDisplayed(currentMonthAndroid, "Current Month");
				mobileAction.verifyElementIsDisplayed(previousMonthAndroid, "Previous Month");
				String currentMonthCategory = mobileAction.FuncGetElementText(currentMonthSpendingAndroid);
				System.out.println("Current month category :"+currentMonthCategory);
				String[] arrText = currentMonthCategory.split("-");
				for(int i=0;i<arrText.length;i++){
					System.out.println("Category :"+arrText[i]);
				}
				//mobileAction.verifyElementTextContains(currentMonthSpending, message);
				mobileAction.verifyElementIsDisplayed(currentMonthSpendingAndroid,currentMonthCategory);
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.FuncClick(currentMonthSpending, "Spending with spike");
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
			}else{
				mobileAction.verifyElementIsDisplayed(currentMonth, "Current Month");
				mobileAction.verifyElementIsDisplayed(previousMonth, "Previous Month");
				String currentMonthCategory = mobileAction.FuncGetElementText(currentMonthSpending);
				System.out.println("Current month category :"+currentMonthCategory);
				String[] arrText = currentMonthCategory.split("-");
				System.out.println("Category :"+arrText[0]);
				mobileAction.verifyElementIsDisplayed(currentMonthSpending,currentMonthCategory);
				mobileAction.FuncClick(currentMonthSpending, "Spending with spike");
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
		} catch (InterruptedException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "InterruptedException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will verify the spending spikes page messages in the spending spike page
	 * details.
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
	public void spendingSpikePageMessages() {
		Decorator();
		int currDate=GetDate.get().getTodaysDate();
		int currYear=GetDate.currentYear();
		String currMonth=GetDate.getCurrentMonth();
		// Entertainment - well over your typical spend. August 4, 2017 . Double tap to open spending by Category
		// Loisirs - Dépenses beaucoup plus élevées que d’habitude.
		try {
			System.out.println(currDate);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(currentMonthAndroid, "Current Month");
				//mobileAction.verifyElementIsDisplayed(previousMonthAndroid, "Previous Month");
				String currentMonthCategory = mobileAction.FuncGetElementText(currentMonthSpendingAndroid);
				System.out.println("Current month category :"+currentMonthCategory);
				String[] arrText = currentMonthCategory.split("-");
				for(int i=0;i<arrText.length;i++){
					System.out.println("Category :"+arrText[i]);
				}
				String message=arrText[0] +"- well over your typical spend. "+currMonth;
				System.out.println(message);
				
				
				//mobileAction.verifyElementTextContains(currentMonthSpending, message);
				mobileAction.verifyElementIsDisplayed(currentMonthSpendingAndroid,currentMonthCategory);
				CL.GetAppiumDriver().context("NATIVE_APP");
			}else{
				mobileAction.verifyElementIsDisplayed(currentMonth, "Current Month");
				mobileAction.verifyElementIsDisplayed(previousMonth, "Previous Month");
				String currentMonthCategory = mobileAction.FuncGetElementText(currentMonthSpending);
				System.out.println("Current month category :"+currentMonthCategory);
				String[] arrText = currentMonthCategory.split("-");
				for(int i=0;i<arrText.length;i++){
					System.out.println("Category :"+arrText[i]);
				}
				String message=arrText[0] +"- well over your typical spend. "+currMonth;
				System.out.println(message);
				
				
				//mobileAction.verifyElementTextContains(currentMonthSpending, message);
				mobileAction.verifyElementIsDisplayed(currentMonthSpending,currentMonthCategory);
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

}
