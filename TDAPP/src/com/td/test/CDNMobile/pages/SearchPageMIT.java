package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

//import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SearchPageMIT extends _CommonPage {
	private static SearchPageMIT SearchPageMIT;
	
	//<Objects>
	//Trade objTrade = PageFactory.initElements(CL.GetDriver(),Trade.class);
	
	@iOSFindBy(xpath = "//*[@label='Enter name or symbol']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement searchBar;
	String t_searchBar = "Search";
	
	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[@label='Enter name or symbol' or contains(@label,'Entrez le')]") //@Author - Sushil 03-Feb-2017
	@AndroidFindBy(id="com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1][@label='Toronto Dominion Bank']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tdticker' and @text='	TORONTO DOMINION BANK']")
	private MobileElement selectTD;
	String t_selectTD = "TD selected";
	
	@iOSFindBy(xpath = "//*[@label='Enter name or symbol']") //@Author - Sushil 03-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and @content-desc='U S']")
	private MobileElement US_Symbol;
	
	String xpathSymbolFlag = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and @content-desc='U S']";
	//String xpathSymbolFlag = "//android.widget.ImageView[(@resource-id='com.td:id/market_symbol' and @content-desc='U S')] or //XCUIElementTypeCell[contains(@label,'US')]";
	//String xpathSymbolFlag_ios = "//XCUIElementTypeStaticText[contains(@label,'RESULTS')]/../XCUIElementTypeCell[contains(@label,'US')]";
	String xpathSymbolFlag_ios = "//XCUIElementTypeCell[contains(@label,'US')]";
	String xpathSymbolName = "//*[@id='com.td:id/market_name']";
	
	@iOSFindBy(xpath = "//*[contains(@label,'name or symbol') or contains(@label,'nom ou symbole')]") //@Author - Sushil 07-Feb-2017
	@AndroidFindBy(id="com.td:id/txtSearchTitle")
	private MobileElement search_txtSearchTitle;
	
	@iOSFindBy(xpath = "//*[@label='RESULTS' or @label='RÉSULTATS']") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/txt_results")
	private MobileElement txt_results;
	
	@iOSFindBy(xpath = "//*[@label='RECENT SEARCHES' or @label='RECHERCHES RÉCENTES']") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/classificationTexView")
	private MobileElement recentSearches;
	
	//String xpathQuote = "//XCUIElementTypeStaticText[@label='Search for a different name or symbol']/../following-sibling";
	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/symbol")
	private MobileElement Quote_Symbol;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/description")
	private MobileElement Quote_description;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[3]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/txt_price")
	private MobileElement Quote_txt_price;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[4]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/quote_profloss")
	private MobileElement quote_profloss;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[4]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/quote_profloss_percent")
	private MobileElement quote_profloss_percent;
	
	public synchronized static SearchPageMIT get() {
		if (SearchPageMIT == null) {
			SearchPageMIT = new SearchPageMIT();
		}
		return SearchPageMIT;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	/**
	 * This method will click on the Stock&ETFs on Trade page
	 * 
	 * @return void
	 * @throws TimeoutException 
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	
	public void searchBar()  {
		
		
		Decorator();
		try{
			
			mobileAction.FuncClick(searchBar, "Clicked on search bar");
			
			String searchBar_Value= getTestdata("Search", "UserIDs");
			mobileAction.FuncSendKeys(searchBar,searchBar_Value );
		
			Thread.sleep(5000);
			
			mobileAction.FuncClick(selectTD, t_selectTD);
			mobileAction.FuncClick(selectTD, t_selectTD);
			Thread.sleep(3000);
			
			
		}
		catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
		
		catch (InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void verifySearchScreen() //@Author - Sushil 03-Feb-2017
	{
		Decorator();
		try
		{
			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void verifySymbolUS() throws Exception//@Author - Sushil 06-Feb-2017
	{
		//List<MobileElement> elementToFind = null;
		Decorator();
		int i,temp;
		String sSymbolName="";
		try
		{
			mobileAction.FuncClick(search_symbol, "search_symbol");
			//mobileAction.FuncSendKeys(search_symbol, getTestdata("Symbol", "UserIDs") + " ");
			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));
			String xpathFlag="";
			String property = "";
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
				xpathFlag = xpathSymbolFlag;
				temp =0;
				property = "text";
			}
			else
			{
				xpathFlag = xpathSymbolFlag_ios;
				temp =0;
				property = "name";
			}
			//US_Symbol.click();
			List<MobileElement> listItem = (List<MobileElement>) ((AppiumDriver) CL.GetDriver()).findElements(By.xpath(xpathFlag));
			//listItem = (List<MobileElement>) ((AppiumDriver) CL.GetDriver()).findElements(By.xpath(xpathSymbol));
			
			 for(i=temp;i< listItem.size();i++)
			 {
				 if(listItem.get(i).getAttribute("name").contains("U S"))
				 //listItem.get(i).findElementByXPath(using)
				 {
					 sSymbolName = CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']")).get(i).getText();
					 CL.GetReporting().FuncReport("Pass","US option found in search list. Item :" + sSymbolName);
				 }
				 else if(listItem.get(i).getAttribute("name").contains("US"))
				 {
					 CL.GetReporting().FuncReport("Pass","US option found in search list. Item :" + listItem.get(i).getAttribute("name"));
				 }
				 else
					 CL.GetReporting().FuncReport("Fail","Incorrect option found in search list."); 
			 }
			 
			 try
			 {
			 CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
			 CL.GetReporting().FuncReport("Pass", listItem.get(temp).getAttribute(property) + " from symbol search list selected."); 
			 }
			 catch(Exception e)
			 {
				CL.GetReporting().FuncReport("Fail", "First Symbol from symbol search list is not selected."); 
			 }
		}
		catch(Exception e)
		{
			CL.GetReporting().FuncReport("Fail","Incorrect option found in search list."); 
			e.printStackTrace();
		}
	}
	
	public void verifySymbolSearchResults()//@Author - Sushil 07-Feb-2017
	{
		Decorator();
		try
		{
/*			String xpathFlag="";
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				xpathFlag = xpathSymbolFlag;
			else
				xpathFlag = xpathSymbolFlag_ios;
			//mobileAction.selectItemFromList(, item);
			mobileAction.FuncClick(search_symbol, "search_symbol");
			//mobileAction.FuncSendKeys(search_symbol,"TD ");
			enterSymbol(search_symbol,"TD");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			mobileAction.FuncHideKeyboard();
			mobileAction.verifyElement(txt_results,getTestdata("RESULTS", XLSheetUserIDs));
			CL.GetDriver().findElements(By.xpath(xpathFlag)).get(0).click();*/
			clickFirstSymbol("TD");
			mobileAction.verifyElementIsDisplayed(Quote_Symbol, "Quote_Symbol");
			mobileAction.verifyElementIsDisplayed(Quote_description, "Quote_description");
			mobileAction.verifyElementTextContains(Quote_txt_price, "$");
			mobileAction.verifyElementTextContains(quote_profloss, "$");
			mobileAction.verifyElementTextContains(quote_profloss_percent, "%");
			//mobileAction.verifyElementIsDisplayed(search_txtSearchTitle, "search_txtSearchTitle");
			mobileAction.waitForElement(search_txtSearchTitle);
			mobileAction.verifyElement(search_txtSearchTitle,getTestdata("TextNameSymbol",XLSheetUserIDs));
			mobileAction.FuncClick(search_txtSearchTitle, "search_txtSearchTitle");
			mobileAction.verifyElement(recentSearches,getTestdata("RECENT_SEARCHES", XLSheetUserIDs));
			verifySymbolUS();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void clickFirstSymbol()//@Author - Sushil 08-Feb-2017
	{
		Decorator();
		try
		{
			String xpathFlag="";
			int temp =0;
			String sSymbol = getTestdata("Symbol", XLSheetUserIDs).trim();
			boolean bFound=false;
			String sProperty = "";
			String sSymbolName = "";
			boolean bSymbolText=false;

			mobileAction.FuncClick(search_symbol, "search_symbol");
			enterSymbol(search_symbol, sSymbol);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
				xpathFlag = xpathSymbolFlag;
				sProperty = "text";
				//sSymbolName = CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']")).get(i).getText();
				try
				{
					CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
					CL.GetReporting().FuncReport("Pass", "Symbol <b> "+ sSymbol + "</b> Clicked.");
				}
				catch(Exception e)
				{
					e.printStackTrace();
					CL.GetReporting().FuncReport("Fail", "Symbol <b> "+ sSymbol + "</b> not Clicked.");
				}
			}
			else
			{
				xpathFlag = xpathSymbolFlag_ios;
				//temp =0;
				sProperty = "label";
			do{
			try{
/*				try{
				bSymbolText = CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']")).get(temp).getText().contains(sSymbol);
				}
				catch(ex)*/
				if(CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).isDisplayed() && CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).getAttribute(sProperty).contains(sSymbol))
				{
					bFound = true;
					CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
					CL.GetReporting().FuncReport("Pass", "Symbol <b> "+ sSymbol + "</b> Clicked.");
				}
				else
					temp++;
			}
			catch(Exception e)
			{
/*				if(CL.GetDriver().findElements(By.xpath(xpathFlag)).get(1).isDisplayed())
				{
					CL.GetDriver().findElements(By.xpath(xpathFlag)).get(1).click();
					CL.GetReporting().FuncReport("Pass", "Symbol <b> "+ sSymbol + "</b> Clicked.");
				}*/
				temp++;
			}
			}while(!bFound && temp < CL.GetDriver().findElements(By.xpath(xpathFlag)).size());
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void enterSymbol(MobileElement mEle,String symbol)
	{
		try
		{
			mobileAction.FuncSendKeys(mEle, symbol + " ");
			((RemoteWebDriver) CL.GetDriver()).getKeyboard().pressKey(Keys.BACK_SPACE);
			
			//mobileAction.FuncSendKeys(mEle,"\u0008");
			//mEle.sendKeys(Keys.DELETE);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickFirstSymbol(String sSymbolName)//@Author - Sushil 05-May-2017
	{
		Decorator();
		try
		{
			String xpathFlag="";
			int temp =0;
			//String sSymbol = getTestdata("Symbol", XLSheetUserIDs).trim();
			boolean bFound=false;
			String sProperty = "";
			//String sSymbolName = "";
			boolean bSymbolText=false;

			mobileAction.FuncClick(search_symbol, "search_symbol");
			enterSymbol(search_symbol, sSymbolName);
			mobileAction.verifyElement(txt_results,getTestdata("RESULTS", XLSheetUserIDs));
			TradeMultiLeg.get().handleKeyboard();
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
				xpathFlag = xpathSymbolFlag;
				sProperty = "text";
				//sSymbolName = CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']")).get(i).getText();
				try
				{
					CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
					CL.GetReporting().FuncReport("Pass", "Symbol <b> "+ sSymbolName + "</b> Clicked.");
				}
				catch(Exception e)
				{
					e.printStackTrace();
					CL.GetReporting().FuncReport("Fail", "Symbol <b> "+ sSymbolName + "</b> not Clicked.");
				}
			}
			else
			{
				xpathFlag = xpathSymbolFlag_ios;
				//temp =0;
				sProperty = "label";
			do{
			try{
				if(CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).isDisplayed() && CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).getAttribute(sProperty).contains(sSymbolName))
				{
					bFound = true;
					CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
					CL.GetReporting().FuncReport("Pass", "Symbol <b> "+ sSymbolName + "</b> Clicked.");
				}
				else
					temp++;
			}
			catch(Exception e)
			{
				temp++;
			}
			}while(!bFound && temp < CL.GetDriver().findElements(By.xpath(xpathFlag)).size());
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

