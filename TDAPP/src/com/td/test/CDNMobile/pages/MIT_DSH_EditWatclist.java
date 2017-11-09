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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSH_EditWatclist extends _CommonPage     {
	
private static MIT_DSH_EditWatclist MIT_DSH_EditWatclist;
	
	public synchronized static MIT_DSH_EditWatclist get() {
		if (MIT_DSH_EditWatclist == null) {
			MIT_DSH_EditWatclist = new MIT_DSH_EditWatclist();
		}
		return MIT_DSH_EditWatclist;
	
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	
	@iOSXCUITFindBy(accessibility = "switchNowButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/investing_welcome_switch']")
	private MobileElement btnSwitchNow;
	
	@iOSXCUITFindBy(accessibility = "ProfilePreferencesToggleTableViewCell_Toggle_Switch")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/nav_row_switch']")
	private MobileElement InvestingToggle;
	
	@iOSXCUITFindBy(accessibility = "ProfilePreferencesSubtitleTableViewCell_Accessory_Button")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/nav_row_left_icon']")
	private MobileElement AccessoryGoHome;
	

	@iOSXCUITFindBy(accessibility = "SearchBarWidget")
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Search or add symbols' or @text='Rechercher ou ajouter des symboles' or @text='搜索或添加股票代码' or @text='搜尋或添加股票代號']")
    private MobileElement searchBar;
	
	@iOSXCUITFindBy(accessibility = "expandButton")
	@AndroidFindBy(id = "com.td:id/tv_watchlist_more_footer")
	private MobileElement btnMore;
	
	
	@iOSXCUITFindBy(accessibility = "ProfilePreferencesSubtitleTableViewCell_Accessory_Button")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/iv_watchlist_dot_header']")
	private MobileElement ThreeDots;
	
	@iOSXCUITFindBy(accessibility = "ProfilePreferencesSubtitleTableViewCell_Accessory_Button")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.td:id/tv_item_more_option_name'])[2]")
	private MobileElement EditCollapse;
	
	
	@iOSXCUITFindBy(accessibility = "ProfilePreferencesSubtitleTableViewCell_Accessory_Button")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/toolbar_back_button']")
	private MobileElement BackButtonExpand;
	
	@iOSXCUITFindBy(accessibility = "ProfilePreferencesSubtitleTableViewCell_Accessory_Button")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/toolbar_title']")
	private MobileElement EditWLTitle;
	
	
	
	public void verifyUIEditWL() {
		Decorator();
		try {
	
		//	 MIT_DSHQuickLinks.get().goToDashboardHome();
			
			
			 if (mobileAction.isObjExists(btnSwitchNow, 2)) 
			 {
					mobileAction.FuncClick(btnSwitchNow, "btnSwitchNow");
					
					mobileAction.FuncClick(InvestingToggle, "InvestingToggle");
					
					mobileAction.FuncClick(AccessoryGoHome, "AccessoryGoHome");
					
					
				}
			 
			 
			 mobileAction.FuncClick(ThreeDots, "ThreeDots"); 
			 
			 
			 mobileAction.FuncClick(btnMore, "btnMore");
			 
			 
			 mobileAction.FuncClick(EditCollapse, "EditCollapse");
			 
		
				
			 
			 mobileAction.FuncVerifyTextEquals(EditWLTitle,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_EDITWL));
				
		
			 
				 
	
		}
			catch (Exception e) {
				e.printStackTrace();
			}

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
