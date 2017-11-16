package com.td.test.myspend;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import com.td.test.CDNMobile.pages.HomeScreen;

import gherkin.lexer.Th;
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
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[contains(@name,'Home') or contains(@name,'Accueil')])[2]")
	private MobileElement homeBtn;
	
	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_QUICK_ACCESS")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access']")
	private MobileElement quickAccess;
	
	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up' and @index='0']")
	private MobileElement menu;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD MySpend' or @label='Dépense TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='TD MySpend' or @text='Dépense TD')]")
	private MobileElement TDMySpend;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[contains(@name,'Daily Digest') or contains(@label,'Sommaire quotidien')]")
	private MobileElement dailyDigest;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[contains(@label,'Logout') or contains(@label,'Fermer la session')]")
	private MobileElement logoutBtn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Summary') or contains(@name,'Résumé')]/../XCUIElementTypeStaticText[1]")
	private MobileElement yesterdaySpending;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Summary') or contains(@name,'Résumé')]/../XCUIElementTypeStaticText[2]")
	private MobileElement analyzeSpending;
	
	//@iOSXCUITFindBy(iOSClassChain = "**/*[`name=='TRANSFERVIEW_ETRANSFER' and label=='Request Money'`]")
	@iOSXCUITFindBy(iOSClassChain = "**/*[`name=='ANALYZE YOUR SPENDING'`]")
	private MobileElement analyzeYourSpending;
	
	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Spent Yesterday')]")
	private MobileElement billerInfo;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Summary') or contains(@name,'Résumé')]/following-sibling::XCUIElementTypeOther")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Double tap to change category') or contains(@content-desc,'Tapez deux fois pour changer de catégorie') or contains(@text,'Double tap to change category')]")
	private MobileElement changeCategory;
	
	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Spent Yesterday')]")
	private MobileElement categorySpikeMessage;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Summary') or contains(@name,'Résumé')]")
	@AndroidFindBy(xpath="//android.view.View[contains(@content-desc,'Summary') or contains(@content-desc,'Résumé') or contains(@text,'Summary')]")
	private MobileElement summaryTab;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Summary') or contains(@name,'Résumé')]/following-sibling::XCUIElementTypeButton")
	@AndroidFindBy(xpath="//android.view.View[contains(@content-desc,'Summary') or contains(@content-desc,'Résumé') or contains(@text,'Summary')]/following-sibling::*")
	private List<MobileElement> categoryTab;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Summary') or contains(@name,'Résumé')]/following-sibling::XCUIElementTypeStaticText[1]")
	private MobileElement currentCategory;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Summary') or contains(@name,'Résumé')]/following-sibling::XCUIElementTypeOther[2]")
	private MobileElement currentCategoryDetails;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Category Spikes')]")
	@AndroidFindBy(xpath="//android.view.View[contains(@content-desc,'Category Spikes') or contains(@text,'Category Spikes')]")
	private MobileElement categorySpike;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@name,'Double tap to open Spending by Category')]")
	@AndroidFindBy(xpath="//android.view.View[contains(@content-desc,'Double tap to open Spending by Category') or contains(@text,'Double tap to open Spending by Category')]")
	private MobileElement spendingByCategory;
	
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
	
	//@FindBy(xpath = "(//*[contains(@id,'topSlide')])[1]/*")
	@FindBy(xpath = "//*[contains(@class,'summary')]/../../*[1]")
	private WebElement summaryTabAndroid;
	
	//@FindBy(xpath = "(//*[contains(@id,'topSlide')])[2]/*")
	@FindBy(xpath = "(//*[contains(@class,'categoryIcons')]/../*[4])[1]")
	private WebElement categoryTabAndroid;
	
	@FindBy(xpath = "//*[text()='Spent Yesterday' or contains(text(),'Hier')]/..//*[text()='Yesterday' or text()='Hier']/preceding-sibling::*[1]")
	private WebElement yesterdaySpendingAndroid;
	
	@FindBy(xpath = "//*[text()='Spent Yesterday' or contains(text(),'Hier')]/..//*[text()='Usual' or text()='Habituel']/preceding-sibling::*[1]")
	private WebElement usualSpendingAndroid;
	
	@FindBy(xpath = "(//*[contains(@href,'dailyDigest')])[2]")
	private WebElement billerInfoAndroid;
	
	//@FindBy(xpath = "(//*[contains(@id,'tag-box')])[2]")
	@FindBy(xpath = "(//*[contains(@class,'transaction-header')])[1]/following::*[4]")
	private WebElement changeCategoryAndroid;
	
	@FindBy(xpath = "//*[contains(text(),'SPENDING SPIKE IN')]")
	private WebElement categorySpikeMessageAndriod;
	
	@FindBy(xpath = "(//*[contains(@id,'topSlide')])[2]")
	private WebElement currentCategoryAndroid;
	
	@FindBy(xpath = "(//*[contains(@id,'topSlide')])[3]")
	private WebElement currentCategoryDetailsAndroid;
	
	
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
				mobileAction.verifyElementIsDisplayed(homeBtn, "HomePage");
				mobileAction.FuncClick(homeBtn, "Home Button");
				mobileAction.verifyElementIsDisplayed(quickAccess, "Home Page");
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(TDMySpend, "TD My Spend");
				
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
				Thread.sleep(2000);
				Spending_Insight.get().clickSideMenuButton();
				mobileAction.verifyElementIsDisplayed(logoutBtn, "Menu Page");
				mobileAction.FuncClick(dailyDigest, "Daily Digest");
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
		int count=0;

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.verifyElementIsDisplayed(summaryTab, "Summary tab");
				for(int i=0;i<categoryTab.size();i++){
					String categoryName=categoryTab.get(i).getText();
					String[] category=categoryName.split("-");
					//mobileAction.FunctionSwipe("Left", 200, 200);
					count++;
					mobileAction.verifyElementIsDisplayed(categoryTab.get(i),"Category: "+category[0]);
				}
				/*for(int i=0;i<count;i++){
					mobileAction.FunctionSwipe("Right", 200, 200);
				}
				if(!mobileAction.verifyElementIsPresent(categorySpike)){
					mobileAction.FunctionSwipe("Right", 200, 200);
				}*/
				if(mobileAction.verifyElementIsPresent(categorySpike)){
					mobileAction.verifyElementIsDisplayed(categorySpike, "Category Spike");
					mobileAction.FuncClick(spendingByCategory, "Spending By Category");
					CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
					SpendingByCategory.get().verifySpendingByCategories();
					Spending_Insight.get().clickSideMenuButton();
					CL.GetAppiumDriver().context("NATIVE_APP");
				}
			} else {
				mobileAction.verifyElementIsDisplayed(summaryTab, "Summary tab");
				for(int i=0;i<categoryTab.size();i++){
					String categoryName=categoryTab.get(i).getText();
					String[] category=categoryName.split("-");
						mobileAction.FunctionSwipe("Left", 200, 200);
						count++;
					mobileAction.verifyElementIsDisplayed(categoryTab.get(i),"Category: "+category[0]);
				}
				for(int i=0;i<count;i++){
					mobileAction.FunctionSwipe("Right", 200, 200);
				}
				if(!mobileAction.verifyElementIsPresent(categorySpike)){
					mobileAction.FunctionSwipe("Right", 200, 200);
				}
				if(mobileAction.verifyElementIsPresent(categorySpike)){
					mobileAction.verifyElementIsDisplayed(categorySpike, "Category Spike");
					mobileAction.FuncClick(spendingByCategory, "Spending By Category");
					SpendingByCategory.get().verifySpendingByCategories();
					Spending_Insight.get().clickSideMenuButton();
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
				mobileAction.FuncClick(categoryTab.get(0),"Category: "+categoryTab.get(0).getText());
			} else {
				mobileAction.FuncClick(categoryTab.get(0),"Category: "+categoryTab.get(0).getText());
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
				CL.GetAppiumDriver().context("WEBVIEW_com.td.myspend");
				mobileAction.verifyElementIsDisplayed(currentCategoryAndroid, currentCategoryAndroid.getText());
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.verifyElementIsDisplayed(changeCategory, "Change category");
				
				
			} else {
				
				mobileAction.verifyElementIsDisplayed(currentCategory,mobileAction.getText(currentCategory) );
				mobileAction.verifyElementIsDisplayed(currentCategoryDetails, mobileAction.getText(currentCategoryDetails));
				//mobileAction.verifyElementIsDisplayed(billerInfo, "Biller Information");
				mobileAction.verifyElementIsDisplayed(changeCategory, "Category");
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
				
				mobileAction.verifyElementIsDisplayed(yesterdaySpendingAndroid, "Yesterday Spending" + yesterdaySpendingAndroid.getText());
				mobileAction.verifyElementIsDisplayed(usualSpendingAndroid, "Usual Spending" +usualSpendingAndroid.getText());
			
			} else {
					
					mobileAction.verifyElementIsDisplayed(yesterdaySpending, "Yesterday Spending" + mobileAction.getText(yesterdaySpending));
					mobileAction.verifyElementIsDisplayed(analyzeSpending, "Analyze Your Spending"+ mobileAction.getText(analyzeSpending));
			
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
				//mobileAction.verifyElementIsDisplayed(categorySpikeMessageAndriod, "Category Spike Message");
			} else {
				mobileAction.verifyElementIsDisplayed(yesterdaySpending, "Yesterday Spending" + mobileAction.getText(yesterdaySpending));
				mobileAction.verifyElementIsDisplayed(analyzeSpending, "Analyze Your Spending"+ mobileAction.getText(analyzeSpending));
				//mobileAction.verifyElementIsDisplayed(categorySpikeMessage, "Category Spike Message");
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
	 * This method will change the category for a particular category in Daily Digest Page
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
	public void changeCategory() throws InterruptedException {

		Decorator();
		String category=null;
		String categoryVal=getTestdata("Category");
		String[] categoryValue=categoryVal.split(":");

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(changeCategory, "Category");
				if(currentLocale.equalsIgnoreCase("EN")){
					category="//*[contains(@content-desc,'"+ categoryValue[0] +"')]";
				}else{
					category="//*[contains(@content-desc,'"+ categoryValue[1] +"')]";
				}
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(category, true, 5, "Up");
				
				
			} else {
				
				mobileAction.FuncClick(changeCategory, "Category");
				if(currentLocale.equalsIgnoreCase("EN")){
					category="//XCUIElementTypeOther[contains(@name,'"+ categoryValue[0] +"')]";
				}else{
					category="//XCUIElementTypeOther[contains(@name,'"+ categoryValue[1] +"')]";
				}
				
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(category, true, 5, "Up");
			}
		} catch (Exception e) {
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
	
}
