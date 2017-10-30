package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import com.td.test.CDNMobile.pages.HomeScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class DailyDigest extends _CommonPage{
	
	private static DailyDigest DailyDigest;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'Daily Digest') or contains(@label,'Sommaire quotidien')]")
	private MobileElement pageHeader;
	
	@iOSFindBy(accessibility = "NAVIGATION_ITEM_QUICK_ACCESS")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/easy_access']") 
	private MobileElement quickAccess;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD MySpend']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='TD MySpend']")
	private MobileElement TDMySpend;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Home']")
	private MobileElement homeBtn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeMenuItem[contains(@name,'Daily Digest') or contains(@label,'Sommaire quotidien')]")
	private MobileElement dailyDigest;
	
	@iOSFindBy(xpath = "//XCUIElementTypeLink[contains(@label,'Logout') or contains(@label,'Fermer la session')]")
	private MobileElement logoutBtn;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Spent Yesterday')]")
	private MobileElement yesterdaySpending;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Spent Yesterday')]")
	private MobileElement usualSpending;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Spent Yesterday')]")
	private MobileElement billerInfo;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Spent Yesterday')]")
	private MobileElement changeCategory;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Spent Yesterday')]")
	private MobileElement categorySpikeMessage;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Summary')]")
	private MobileElement summaryTab;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Category')]")
	private MobileElement categoryTab;
	
	@FindBy(xpath="//*[text()='Daily Digest' or text()='Sommaire quotidien']")
	private WebElement pageHeaderAndroid;
	
	@FindBy(xpath="(//*[@id='homeButton'])[2]")
	private WebElement homeBtnAndroid;
	
	@FindBy(xpath="(//*[@id='menuButtonActive'])[2]")
	private WebElement backBtnAndroid;
	
	@FindBy(id = "firstMenuItem")
	private WebElement logoutBtnAndroid;
	
	@FindBy(xpath = "(//*[contains(@href,'dailyDigest')])[2]")
	private WebElement dailyDigestAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Summary')]")
	private WebElement summaryTabAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'Category')]")
	private WebElement categoryTabAndroid;
	
	@FindBy(xpath = "//*[text()='Spent Yesterday']/..//*[text()='Yesterday']/preceding-sibling::*[1]")
	private WebElement yesterdaySpendingAndroid;
	
	@FindBy(xpath = "//*[text()='Spent Yesterday']/..//*[text()='Usual']/preceding-sibling::*[1]")
	private WebElement usualSpendingAndroid;
	
	@FindBy(xpath = "(//*[contains(@href,'dailyDigest')])[2]")
	private WebElement billerInfoAndroid;
	
	@FindBy(xpath = "(//*[contains(@href,'dailyDigest')])[2]")
	private WebElement changeCategoryAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'SPENDING SPIKE IN')]")
	private WebElement categorySpikeMessageAndriod;
	
	//*[text()='vs Monthly Typical']
	//*[@class='monthly-chart']
	//*[text()='Spent Yesterday']/..//*[text()='Yesterday']  --->
	
	//*[text()='Spent Yesterday']/..//*[text()='Usual']  --->
	

	public synchronized static DailyDigest get() {
		if (DailyDigest == null) {
			DailyDigest = new DailyDigest();
		}
		return DailyDigest;
	}
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	
	/**
	 * This method will verify the Daily Digest page header.
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
				mobileAction.verifyElementIsDisplayed(pageHeaderAndroid, "Daily Digest Page Header");
			} else {
				mobileAction.verifyElementIsDisplayed(pageHeader, "Daily Digest Page Header");
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
	 * This method will verify TDAPP Home Page from the Daily Digest page
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
	public void verifyTDAPPHomePage() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.FuncClick(homeBtnAndroid, "Home Button");
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.verifyElementIsDisplayed(quickAccess, "Home Page");
				HomeScreen.get().clickMenu();
				mobileAction.FuncClick(TDMySpend, "TD My Spend");
				
			} else {
				mobileAction.FuncClick(homeBtn, "Home Button");
				mobileAction.verifyElementIsDisplayed(quickAccess, "Home Page");
				HomeScreen.get().clickMenu();
				mobileAction.FuncClick(TDMySpend, "TD My Spend");
				
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
	 * This method will verify TDAPP Home Page from the Daily Digest page
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
	public void verifyBackButton() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.FuncClick(backBtnAndroid, "Back Button");
				mobileAction.verifyElementIsDisplayed(logoutBtnAndroid, "Menu Page");
				mobileAction.FuncClick(dailyDigestAndroid, "Daily Digest");
				
			} else {
				Spending_Insight.get().clickSideMenuButton();
				mobileAction.verifyElementIsDisplayed(logoutBtn, "Menu Page");
				mobileAction.FuncClick(dailyDigest, "Daily Digest");
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
	 * This method will verify the tabs on the daily digest page.
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
	public void verifyTabs() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(summaryTabAndroid, "Summary tab");
				mobileAction.verifyElementIsDisplayed(categoryTabAndroid, "Category Tab");
			} else {
				mobileAction.verifyElementIsDisplayed(summaryTab, "Summary tab");
				mobileAction.verifyElementIsDisplayed(categoryTab, "Category Tab");
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
	 * This method will click on the Summary tab
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
	public void clickSummaryTab() {
		Decorator();

		try {
				verifyTabs();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(summaryTabAndroid, "Summary tab");
				
			} else {
				mobileAction.FuncClick(summaryTab, "Summary tab");
				
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
		} catch (InterruptedException e) {
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
	 * This method will click on the category tab
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
	public void clickCategoryTab() {
		Decorator();

		try {
			verifyTabs();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(categoryTabAndroid, "Category Tab");
			} else {
				mobileAction.FuncClick(categoryTab, "Category Tab");
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
		}catch (InterruptedException e) {
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
	 * This method will verify the category spending message
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
	public void verifyCategoryMessage() {
		Decorator();

		try {
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				
				mobileAction.verifyElementIsDisplayed(yesterdaySpendingAndroid, "Yesterday Spending");
				mobileAction.verifyElementIsDisplayed(usualSpendingAndroid, "Usual Spending");
				mobileAction.verifyElementIsDisplayed(billerInfoAndroid, "Biller Information");
				mobileAction.verifyElementIsDisplayed(changeCategoryAndroid, "Change category");
				
				
			
			} else {
				
				mobileAction.verifyElementIsDisplayed(yesterdaySpending, "Yesterday Spending");
				mobileAction.verifyElementIsDisplayed(usualSpending, "Usual Spending");
				mobileAction.verifyElementIsDisplayed(billerInfo, "Biller Information");
				mobileAction.verifyElementIsDisplayed(changeCategory, "Change category");
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
	 * This method will verify the Previous Day and Usual Spending 
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
	public void verifySpending() {
		Decorator();

		try {
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			
				mobileAction.verifyElementIsDisplayed(yesterdaySpendingAndroid, "Yesterday Spending");
				mobileAction.verifyElementIsDisplayed(usualSpendingAndroid, "Usual Spending");
			} else {
				mobileAction.verifyElementIsDisplayed(yesterdaySpending, "Yesterday Spending");
				mobileAction.verifyElementIsDisplayed(usualSpending, "Usual Spending");
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
	 * This method will verify the Category Spike
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
	public void verifyCategorySpike() {
		Decorator();

		try {
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			
				mobileAction.verifyElementIsDisplayed(yesterdaySpendingAndroid, "Yesterday Spending");
				mobileAction.verifyElementIsDisplayed(usualSpendingAndroid, "Usual Spending");
				mobileAction.verifyElementIsDisplayed(categorySpikeMessageAndriod, "Category Spike Message");
			} else {
				mobileAction.verifyElementIsDisplayed(yesterdaySpending, "Yesterday Spending");
				mobileAction.verifyElementIsDisplayed(usualSpending, "Usual Spending");
				mobileAction.verifyElementIsDisplayed(categorySpikeMessage, "Category Spike Message");
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
	
	
	
}
