package com.td.test.CDNMobile.pages;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import com.td.test.framework.MobileAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSH_UpdateSearchPage  extends _CommonPage {
	
	
	
	private static MIT_DSH_UpdateSearchPage MIT_DSH_UpdateSearchPage;

	public synchronized static MIT_DSH_UpdateSearchPage get() {
		if (MIT_DSH_UpdateSearchPage == null) {
			MIT_DSH_UpdateSearchPage = new MIT_DSH_UpdateSearchPage();
		}
		return MIT_DSH_UpdateSearchPage;
	
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	
//	@iOSFindBy(xpath = "//*[@label='Search or add symbols' or contains(@label,'Entrez le')]") // @Author
	// -
	// Sushil
	// 03-Feb-2017
// @AndroidFindBy(xpath =
// "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and
// @text='Enter name or symbol']")
	@iOSFindBy(accessibility = "SearchBarWidget")
@AndroidFindBy(id = "com.td:id/txtSearchTitle")
private MobileElement searchBar;
	
	@iOSFindBy(xpath = "//*[@label='Enter name or symbol' or contains(@label,'Entrez le')]") //@Author - Sushil 03-Feb-2017
	//@iOSFindBy(xpath = "//*[@name='TextField_0']") // @Author - Sushil
													// 03-Feb-2017
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;

	
	String xpathSymbolFlag = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and (@content-desc='U S' or @content-desc='CAD' or @content-desc='CAN' or @content-desc='CA' or @content-desc='C A')]";
	
	String xpathSymbolFlag_ios = "//XCUIElementTypeCell[contains(@label,'US') or contains(@label,'US') or contains(@label,'CAD') or contains(@label,'CAN') or contains(@label,'CA')  or contains(@label,'C A')]";
	
	@iOSFindBy(xpath = "//*[@name='CodeSearchHeaderCellTitleLabel']/../following-sibling::XCUIElementTypeCell[1]/*[1]")
	//@AndroidFindBy(xpath = "//*[(@text='Terms of Use' or @text='Conditions d’utilisation' or @text='使用条款' or @text='使用條款') and @resource-id='android:id/action_bar_title']/../following-sibling::XCUIElementTypeOther[1]/*/*/*/*[3]/*[1]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='info icon' or @content-desc='icône info']/../*[2]")
	private MobileElement info;
	

	@iOSFindBy(xpath = "//*[@label='RESULTS' or @label='RÉSULTATS']")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement hdrRESULTS;
	
	
	@iOSFindBy(xpath = "//*[@label='Watchlist Button' or contains(@label,'Entrez le')]") // @AuthorSushil03-Feb-2017
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement 	WatchlistButton;
	
	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	 MobileElement BT_Back;
	
	
	
	@iOSFindBy(xpath = "//*[@label='banner' or contains(@label,'Entrez le')]/*[1]")
	@AndroidFindBy(id = "android:id/up")
	 MobileElement BT_Back1;
	
	
		
	
	@iOSFindBy(xpath = "//*[@label='RECENT SEARCHES' or @label='RÉSULTATS']")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement hdrRECENT;
	
	
	@iOSFindBy(xpath = "//*[@label='Clear text' or contains(@label,'Entrez le')]") // @AuthorSushil03-Feb-2017
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement 	btnClear;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Indices' or contains(@label,'Entrez le')]") // @AuthorSushil03-Feb-2017
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement 	btnIndices;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Mutual Funds' or contains(@label,'Entrez le')]") // @AuthorSushil03-Feb-2017
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement 	btnMF;
	
	
	
	@iOSFindBy(xpath = "//*[@label='Watchlist Button' or contains(@label,'Entrez le')]") // @AuthorSushil03-Feb-2017
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
    private MobileElement 	symHeader;
	
	
	
	
	
	
	
	
	public void verifyUpdateSearch() {
		Decorator();
		try {
	
			
		
			
						
			MIT_DSHQuickLinks.get().goToDashboardHome();
			
						
			if(mobileAction.isObjExists(searchBar, 2))
			{
				mobileAction.FuncClick(searchBar, "searchBar");
				
			}
			else
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, true,7, "up");
			
			}
			
			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");
			
					
			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));
			
			
			verifySymbolUSCAD();
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void verifyUpdateSearchInvalid() {
		Decorator();
		try {
		
			
			
			
			
			MIT_DSHQuickLinks.get().goToDashboardHome();
			
			
			
			if(mobileAction.isObjExists(searchBar, 2))
			{
				mobileAction.FuncClick(searchBar, "searchBar");
				
			}
			else
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, true,7, "up");
			
			}
			
			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");
			
		
			
			mobileAction.FuncClick(search_symbol, "search_symbol");
			
			
			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));
			
			
			mobileAction.verifyElementIsDisplayed(info, "info on invalid symbol"  + info.getText());
			
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void verifyHeaderResult() {
		Decorator();
		try {					
				Thread.sleep(1000);
			MIT_DSHQuickLinks.get().goToDashboardHome();
			
				
			if(mobileAction.isObjExists(searchBar, 2))
			{
				mobileAction.FuncClick(searchBar, "searchBar");
				
				
			}
			else
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, true,7, "up");
			
			}
			
			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");
			
			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));
			
			verifySymbolUSCAD();
			
			
			mobileAction.verifyElementIsDisplayed(hdrRESULTS, "hdrRESULTS");
			
			
			
			mobileAction.FuncClick(btnClear, "btnClear");
			
			
			
			mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");
			
				
			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));
			
			clickFirstSymbolUSCAD(getTestdata("Symbol", "UserIDs"));
			
						
		
		
			mobileAction.verifyElementIsDisplayed(WatchlistButton, "WatchlistButton");
			
				
				
				/*
				int iAbscissa = BT_Back1.getRect().getHeight();
				int iOrdinate = BT_Back1.getRect().getY();
				
			
				mobileAction.FuncClickCoordinates(iAbscissa, iOrdinate, 1);*/
				
			
			
			
			
		
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	public void verifyNavigateQuoteSummaryIndices() {
		Decorator();
		
		try {				
			
			MIT_DSHQuickLinks.get().goToDashboardHome();
			
				
			if(mobileAction.isObjExists(searchBar, 2))
			{
				mobileAction.FuncClick(searchBar, "searchBar");
				
				
			}
			else
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, true,7, "up");
			
			}
			
			mobileAction.FuncClick(btnIndices, "btnIndices");
			
			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			//String sStock = aSymbolArray[0];
			
			
			
			for(int i=0; i<aSymbolArray.length; i++)
			
			{
				
				
				enterSymbol(search_symbol, aSymbolArray[i]);
				
				clickFirstSymbolUSCAD(aSymbolArray[i]);
				
				
				
				//String sXPath = "//XCUIElementTypeStatictext[@label='" + aSymbolArray[i] + "' or @text='" + aSymbolArray[i] + "']";
								
				
				
				Thread.sleep(4000);
				mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void verifyNavigateQuoteSummaryMF() {
		Decorator();
		
		try {	
					
		MIT_DSHQuickLinks.get().goToDashboardHome();
			
				
			if(mobileAction.isObjExists(searchBar, 2))
			{
				mobileAction.FuncClick(searchBar, "searchBar");
				
				
			}
			else
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, true,7, "up");
			
			}
			
			mobileAction.FuncClick(btnMF, "btnMF");
			
			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			String sXPath = null;
			//String sStock = aSymbolArray[0];
			
			
			
			for(int i=0; i<aSymbolArray.length; i++)
			
			{				
				
				enterSymbol(search_symbol, aSymbolArray[i]);
				
				clickOtherSymbolUSCAD(aSymbolArray[i]);
				
				
				Thread.sleep(4000);
				
		    	sXPath = "//XCUIElementTypeOther[@label='" + aSymbolArray[i] + "' or @text='" + aSymbolArray[i] + "']/*[1]";
		    	//XCUIElementTypeOther[@label='AIM10693' or @text='AIM10693']/*[1]
		    	mobileAction.verifyElementIsDisplayed((mobileAction.verifyElementUsingXPath(sXPath, aSymbolArray[i])), aSymbolArray[i]);
				
					
				mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");
				
				
				mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");
				 	
				
				clickOtherSymbolUSCAD(aSymbolArray[i]);
				
				
				Thread.sleep(4000);
				
				
				mobileAction.verifyElementIsDisplayed((mobileAction.verifyElementUsingXPath(sXPath, aSymbolArray[i])), aSymbolArray[i]);
				
				mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	public void verifyNavigateQuoteSummaryETF() {
		Decorator();
		
		try {	
					
		MIT_DSHQuickLinks.get().goToDashboardHome();
			
				
			if(mobileAction.isObjExists(searchBar, 2))
			{
				mobileAction.FuncClick(searchBar, "searchBar");
				
				
			}
			else
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, true,7, "up");
			
			}
						
			String[] aSymbolArray = getTestdata("Symbol", "UserIDs").split(":");
			String sXPath = null;
			//String sStock = aSymbolArray[0];
			
			
			
			for(int i=0; i<aSymbolArray.length; i++)
			
			{				
				
				enterSymbol(search_symbol, aSymbolArray[i]);
				
				clickFirstSymbolUSCAD(aSymbolArray[i]);
				
				
				Thread.sleep(4000);
				
		    	sXPath = "//XCUIElementTypeOther[@label='" + aSymbolArray[i] + "' or @text='" + aSymbolArray[i] + "']/*[1]";
		    	//XCUIElementTypeOther[@label='AIM10693' or @text='AIM10693']/*[1]
		    	mobileAction.verifyElementIsDisplayed((mobileAction.verifyElementUsingXPath(sXPath, aSymbolArray[i])), aSymbolArray[i]);
				
					
				mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");
				
				
				mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");
				 	
				
				clickFirstSymbolUSCAD(aSymbolArray[i]);
				
				
				Thread.sleep(4000);
				
				
				mobileAction.verifyElementIsDisplayed((mobileAction.verifyElementUsingXPath(sXPath, aSymbolArray[i])), aSymbolArray[i]);
				
				mobileAction.FuncClickElementCoordinates(BT_Back1, "BT_Back1");
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void verifyAddWatchlist() {
		Decorator();
		try {					
				
			MIT_DSHQuickLinks.get().goToDashboardHome();
			
				
			
	
			if(mobileAction.isObjExists(searchBar, 2))
			{
				mobileAction.FuncClick(searchBar, "searchBar");
				
				
			}
			else
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, true,7, "up");
			
			}
			
			mobileAction.verifyElementIsDisplayed(search_symbol, "Search Screen");
			
			
			mobileAction.FuncClick(btnIndices, "btnIndices");
			
			
			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs").split(":")[0]);
			
			
			mobileAction.verifyElementIsDisplayed(hdrRESULTS, "hdrRESULTS");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			verifySymbolUSCAD();
			
			
			mobileAction.verifyElementIsDisplayed(hdrRESULTS, "hdrRESULTS");
			
			
			
			mobileAction.FuncClick(btnClear, "btnClear");
			
			
			
			mobileAction.verifyElementIsDisplayed(hdrRECENT, "hdrRECENT");
			
				
			
			
			//clickFirstSymbolUSCAD();
			
						
		
		
			mobileAction.verifyElementIsDisplayed(WatchlistButton, "WatchlistButton");
			
			
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void verifySymbolUSCAD() throws Exception// @Author - Sushil 06-Feb-2017
	{
		// List<MobileElement> elementToFind = null;
		Decorator();
		int i, temp;
		String sSymbolName = "";
		String property = "";
		try {
			mobileAction.FuncClick(search_symbol, "search_symbol");
			// mobileAction.FuncSendKeys(search_symbol, getTestdata("Symbol",
			// "UserIDs") + " ");
			//enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));
			String xpathFlag = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				xpathFlag = xpathSymbolFlag;
				temp = 0;
				if (CL.getTestDataInstance().getMobilePlatFormVersion().contains("7"))
					property = "contentDescription";
				else
					property = "name";
			} else {
				xpathFlag = xpathSymbolFlag_ios;
				temp = 0;

				// property = "name";
				property = "label";

			}
			// US_Symbol.click();
			List<MobileElement> listItem = (List<MobileElement>) (CL.GetAppiumDriver())
					.findElements(By.xpath(xpathFlag));
			// listItem = (List<MobileElement>) ((AppiumDriver)
			// CL.GetDriver()).findElements(By.xpath(xpathSymbol));

			for (i = temp; i < listItem.size(); i++) {
				if (listItem.get(i).getAttribute(property).contains("U S")||listItem.get(i).getAttribute(property).contains("C A")||listItem.get(i).getAttribute(property).contains("C A N"))
				// listItem.get(i).findElementByXPath(using)
				{
					sSymbolName = CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']"))
							.get(i).getText();
					CL.GetReporting().FuncReport("Pass", "Option found in search list. Item :" + sSymbolName);
				} else if (listItem.get(i).getAttribute("name").contains("US")||listItem.get(i).getAttribute("name").contains("CA")||listItem.get(i).getAttribute("name").contains("CAN")) {

					CL.GetReporting().FuncReport("Pass",
							"Option found in search list. Item :" + listItem.get(i).getAttribute("name"));
				} else
					CL.GetReporting().FuncReport("Fail", "Incorrect option found in search list.");
			}

		/*	try {
				CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
				// CL.GetReporting().FuncReport("Pass",
				// listItem.get(temp).getAttribute(property) + " from symbol
				// search list selected.");
				CL.GetReporting().FuncReport("Pass", "First Symbol from symbol search list selected.");
			} catch (Exception e) {
				CL.GetReporting().FuncReport("Fail", "First Symbol from symbol search list is not selected.");
			}*/
		} catch (Exception e) {
			CL.GetReporting().FuncReport("Fail", "Incorrect option found in search list.");
			e.printStackTrace();
		}
	}
	
	
	
/*	public void verifySymbolCAD() throws Exception// @Author - Sushil 06-Feb-2017
	{
		// List<MobileElement> elementToFind = null;
		Decorator();
		int i, temp;
		String sSymbolName = "";
		String property = "";
		try {
			mobileAction.FuncClick(search_symbol, "search_symbol");
			// mobileAction.FuncSendKeys(search_symbol, getTestdata("Symbol",
			// "UserIDs") + " ");
			enterSymbol(search_symbol, getTestdata("Symbol", "UserIDs"));
			String xpathFlag = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				xpathFlag = xpathSymbolFlag;
				temp = 0;
				if (CL.getTestDataInstance().getMobilePlatFormVersion().contains("7"))
					property = "contentDescription";
				else
					property = "name";
			} else {
				xpathFlag = xpathSymbolFlag_ios;
				temp = 0;

				// property = "name";
				property = "label";

			}
			// US_Symbol.click();
			List<MobileElement> listItem = (List<MobileElement>) (CL.GetAppiumDriver())
					.findElements(By.xpath(xpathFlag));
			// listItem = (List<MobileElement>) ((AppiumDriver)
			// CL.GetDriver()).findElements(By.xpath(xpathSymbol));

			for (i = temp; i < listItem.size(); i++) {
				if (listItem.get(i).getAttribute(property).contains("U S"))
				// listItem.get(i).findElementByXPath(using)
				{
					sSymbolName = CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']"))
							.get(i).getText();
					CL.GetReporting().FuncReport("Pass", "US option found in search list. Item :" + sSymbolName);
				} else if (listItem.get(i).getAttribute("name").contains("US")) {

					CL.GetReporting().FuncReport("Pass",
							"US option found in search list. Item :" + listItem.get(i).getAttribute("name"));
				} else
					CL.GetReporting().FuncReport("Fail", "Incorrect option found in search list.");
			}

			try {
				CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
				// CL.GetReporting().FuncReport("Pass",
				// listItem.get(temp).getAttribute(property) + " from symbol
				// search list selected.");
				CL.GetReporting().FuncReport("Pass", "First Symbol from symbol search list selected.");
			} catch (Exception e) {
				CL.GetReporting().FuncReport("Fail", "First Symbol from symbol search list is not selected.");
			}
		} catch (Exception e) {
			CL.GetReporting().FuncReport("Fail", "Incorrect option found in search list.");
			e.printStackTrace();
		}
	}*/
	
	
	public void clickFirstSymbolUSCAD(String sSymbol)// @Author - Sushil 08-Feb-2017
	{
		Decorator();
		try {
			String xpathFlag = "";
			int temp = 0;
			//String sSymbol = getTestdata("Symbol", XLSheetUserIDs).trim();
			//sSymbol = "";
			boolean bFound = false;
			String sProperty = "";
			String sSymbolName = "";
			boolean bSymbolText = false;

			//mobileAction.FuncClick(search_symbol, "search_symbol");
			//enterSymbol(search_symbol, sSymbol);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				xpathFlag = xpathSymbolFlag;
				sProperty = "text";
				// sSymbolName =
				// CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']")).get(i).getText();
				try {
					CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
					CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
				} catch (Exception e) {
					e.printStackTrace();
					CL.GetReporting().FuncReport("Fail", "Symbol <b> " + sSymbol + "</b> not Clicked.");
				}
			} else {
				xpathFlag = xpathSymbolFlag_ios;
				// temp =0;
				sProperty = "label";
				do {
					try {
						/*
						 * try{ bSymbolText =
						 * CL.GetDriver().findElements(By.xpath(
						 * "//*[@resource-id='com.td:id/market_name']")).get(
						 * temp).getText().contains(sSymbol); } catch(ex)
						 */
						if (CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).isDisplayed() && CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).getAttribute(sProperty).contains(sSymbol))
						{
							bFound = true;
							CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
							CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
						} else
							temp++;
					} catch (Exception e) {
						/*
						 * if(CL.GetDriver().findElements(By.xpath(xpathFlag)).
						 * get(1).isDisplayed()) {
						 * CL.GetDriver().findElements(By.xpath(xpathFlag)).get(
						 * 1).click(); CL.GetReporting().FuncReport("Pass",
						 * "Symbol <b> "+ sSymbol + "</b> Clicked."); }
						 */
						temp++;
					}
				} while (!bFound && temp < CL.GetDriver().findElements(By.xpath(xpathFlag)).size());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickOtherSymbolUSCAD(String sSymbol)// @Author - Sushil 08-Feb-2017
	{
		Decorator();
		try {
			String xpathFlag = "";
			int temp = 0;
			//String sSymbol = getTestdata("Symbol", XLSheetUserIDs).trim();
			//sSymbol = "";
			boolean bFound = false;
			String sProperty = "";
			String sSymbolName = "";
			boolean bSymbolText = false;

			//mobileAction.FuncClick(search_symbol, "search_symbol");
			//enterSymbol(search_symbol, sSymbol);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				//xpathFlag = xpathSymbolFlag;
				
			
				
				xpathFlag = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and (@content-desc='" + sSymbol + "')]";
				
				sProperty = "text";
				// sSymbolName =
				// CL.GetDriver().findElements(By.xpath("//*[@resource-id='com.td:id/market_name']")).get(i).getText();
				try {
					CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
					CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
				} catch (Exception e) {
					e.printStackTrace();
					CL.GetReporting().FuncReport("Fail", "Symbol <b> " + sSymbol + "</b> not Clicked.");
				}
			} else {
				//xpathFlag = xpathSymbolFlag_ios;
				
				
				xpathFlag = "//XCUIElementTypeCell[contains(@label,'" + sSymbol + "') or contains(@text,'" + sSymbol + "')]";
				
				// temp =0;
				sProperty = "label";
				do {
					try {
						/*
						 * try{ bSymbolText =
						 * CL.GetDriver().findElements(By.xpath(
						 * "//*[@resource-id='com.td:id/market_name']")).get(
						 * temp).getText().contains(sSymbol); } catch(ex)
						 */
						if (CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).isDisplayed() && CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).getAttribute(sProperty).contains(sSymbol))
						{
							bFound = true;
							CL.GetDriver().findElements(By.xpath(xpathFlag)).get(temp).click();
							CL.GetReporting().FuncReport("Pass", "Symbol <b> " + sSymbol + "</b> Clicked.");
						} else
							temp++;
					} catch (Exception e) {
						/*
						 * if(CL.GetDriver().findElements(By.xpath(xpathFlag)).
						 * get(1).isDisplayed()) {
						 * CL.GetDriver().findElements(By.xpath(xpathFlag)).get(
						 * 1).click(); CL.GetReporting().FuncReport("Pass",
						 * "Symbol <b> "+ sSymbol + "</b> Clicked."); }
						 */
						temp++;
					}
				} while (!bFound && temp < CL.GetDriver().findElements(By.xpath(xpathFlag)).size());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	public void enterSymbol(MobileElement mEle, String symbol) {
		try {

			// if
			// (Integer.parseInt(CL.getTestDataInstance().getMobilePlatFormVersion())
			// > 6 )//.contains("6")
			if (CL.getTestDataInstance().getMobilePlatFormVersion().contains("6")
					|| CL.getTestDataInstance().getMobilePlatFormVersion().contains("7")) {
				mobileAction.FuncSendKeys(mEle, symbol + " ");
			} else {
				mobileAction.FuncSendKeys(mEle, symbol + " ");
				((RemoteWebDriver) CL.GetDriver()).getKeyboard().pressKey(Keys.BACK_SPACE);
			}
			// mobileAction.FuncSendKeys(mEle,"\u0008");
			// mEle.sendKeys(Keys.DELETE);
			TradeMultiLeg.get().handleKeyboard();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				CL.GetReporting().FuncReport("Fail", "Symbol not entered.");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
