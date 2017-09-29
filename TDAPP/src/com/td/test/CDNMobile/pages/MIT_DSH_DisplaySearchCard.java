package com.td.test.CDNMobile.pages;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
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


public class MIT_DSH_DisplaySearchCard  extends _CommonPage{
	
	
	private static MIT_DSH_DisplaySearchCard MIT_DSH_DisplaySearchCard;

	public synchronized static MIT_DSH_DisplaySearchCard get() {
		if (MIT_DSH_DisplaySearchCard == null) {
			MIT_DSH_DisplaySearchCard = new MIT_DSH_DisplaySearchCard();
		}
		return MIT_DSH_DisplaySearchCard;
	
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
@AndroidFindBy(id = "com.td:id/txtSearchTitle")//Rechercher ou ajouter des symboles
private MobileElement searchBar;
	
	
	
	
	@iOSFindBy(xpath = "//*[@label='Enter name or symbol' or contains(@label,'Entrez le')]") //@Author - Sushil 03-Feb-2017
	//@iOSFindBy(xpath = "//*[@name='TextField_0']") // @Author - Sushil
													// 03-Feb-2017
	@AndroidFindBy(id = "com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;
	
	//@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@iOSFindBy(xpath = "//*[@label='Cancel' or contains(@label,'Annuler')]")
	@AndroidFindBy(id = "android:id/up")
	MobileElement btnCancel;
	
	@iOSFindBy(xpath = "//*[@name='QuickLinkLeftNavButton']/following-sibling::XCUIElementTypeImage[1]")
	@AndroidFindBy(id = "com.td:id/logo")
	private MobileElement hdrHome;
	
	public void verifyDisplaySearchCard() {
		Decorator();
		try {
												
			MIT_DSHQuickLinks.get().goToDashboardHome();
			
			if(mobileAction.isObjExists(searchBar, 2))
			{
				
				mobileAction.verifyElementIsDisplayed(searchBar, "searchBar");
				
				
			}
			else			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, false,7, "up");
			
			mobileAction.verifyElementIsDisplayed(searchBar, "searchBar");
			
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	public void verifyDisplaySearchCardUnAuthenticated() {
		Decorator();
		try {
			
			if(mobileAction.isObjExists(searchBar, 2))
			{
				
				mobileAction.verifyElementIsDisplayed(searchBar, "searchBar");
				
				mobileAction.FuncClick(searchBar, "searchBar");
			}
			else
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, false,7, "up");
			mobileAction.verifyElementIsDisplayed(searchBar, "searchBar");
			mobileAction.FuncClick(searchBar, "searchBar");
			}
			
			 LoginMIT.get().MITLogin();
		
			 
			 mobileAction.verifyElementIsDisplayed(search_symbol, "Landed on Watchlist Search Screen");
			 
			 
             
             mobileAction.FuncClick(btnCancel, "< btnCancel");
			
             mobileAction.verifyElementIsDisplayed(hdrHome, "hdrHome on Dashboard");
		
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	public void verifyDisplaySearchCardAuthenticated() {
		Decorator();
		try {
												
			MIT_DSHQuickLinks.get().goToDashboardHome();
			
			if(mobileAction.isObjExists(searchBar, 2))
			{
				
				
				 mobileAction.FuncClick(searchBar, "< searchBar");
				
			}
			else
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFound(searchBar, false,7, "up");
			
			 mobileAction.FuncClick(searchBar, "< searchBar");
			
			}
			
			   mobileAction.FuncClick(btnCancel, "< btnCancel");
				
	           mobileAction.verifyElementIsDisplayed(hdrHome, "hdrHome on Dashboard");
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
