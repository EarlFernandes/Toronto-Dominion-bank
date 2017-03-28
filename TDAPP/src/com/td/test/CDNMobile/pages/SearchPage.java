package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SearchPage extends _CommonPage {
	private static SearchPage SearchPage;
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_quote' and @text='Enter name or symbol']")
	private MobileElement searchBar;
	String t_searchBar = "Search";
	
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1][@label='Toronto Dominion Bank']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tdticker' and @text='	TORONTO DOMINION BANK']")
	private MobileElement selectTD;
	String t_selectTD = "TD selected";
	
	
	
	
	public synchronized static SearchPage get() {
		if (SearchPage == null) {
			SearchPage = new SearchPage();
		}
		return SearchPage;
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
			
			String searchBar_Value= getTestdata("Search");
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
}

