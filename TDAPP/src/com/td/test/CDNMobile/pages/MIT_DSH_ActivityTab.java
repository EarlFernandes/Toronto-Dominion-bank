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

public class MIT_DSH_ActivityTab  extends _CommonPage  {
	
	private static MIT_DSH_ActivityTab MIT_DSH_ActivityTab;
	
	public synchronized static MIT_DSH_ActivityTab get() {
		if (MIT_DSH_ActivityTab == null) {
			MIT_DSH_ActivityTab = new MIT_DSH_ActivityTab();
		}
		return MIT_DSH_ActivityTab;
	
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;
	
	@iOSFindBy(xpath = "//*[@label='My Accounts' or @label='Mes comptes' or @label='我的账户' or @label='我的賬戶']")
	@AndroidFindBy(xpath = "//*[@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶']")
	private MobileElement flyoutMyAccountLink;
	
	@iOSFindBy(xpath = " //*[contains(@label,'ACCOUNTS') or contains(@label,'COMPTES')]") // @Author
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView']")
    private MobileElement defaultTradeAccount;
	
	
	String accNumber = getTestdata("Accounts", "UserIDs").trim();// @Author -

    String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Activity' or contains(@label,'Activité')]") // @Author
	@AndroidFindBy(id = "com.td:id/activityTab")
	private MobileElement activityTab;
	
	
	
	@iOSXCUITFindBy(accessibility = "Button_0")
	@AndroidFindBy(id = "com.td:id/textview_left")
	private MobileElement lblDateSettle;
	
	
	@iOSXCUITFindBy(accessibility = "Button_0")
	@AndroidFindBy(id = "com.td:id/textview_center")
	private MobileElement lblDetails;
	
	
	@iOSXCUITFindBy(accessibility = "Button_0")
	@AndroidFindBy(id = "com.td:id/textview_right")
	private MobileElement lblAmount;
	
	
	
	@iOSXCUITFindBy(accessibility = "Button_0")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement description;
	
	
	
	
	
	
	public void verifyActivityDetailsUI() {
		Decorator();
		try {
	
			MIT_DSHQuickLinks.get().goToDashboardHome();
		
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
            mobileAction.FuncClick(flyoutMyAccountLink, "My Accounts Flyout Menu");
						

			mobileAction.waitForElement(defaultTradeAccount);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");

			mobileAction.verifyElementIsDisplayed(activityTab, "activityTab");
			mobileAction.FuncClick(activityTab, "activityTab");
			
			mobileAction.verifyElementIsDisplayed(lblDateSettle, "lblDateSettle");
			
			mobileAction.verifyElementIsDisplayed(lblDetails, "lblDetails");
			
			
			mobileAction.verifyElementIsDisplayed(lblAmount, "lblAmount");
			
			mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(description), "([0-9]+[@])");
			
			
			//mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(description), "([0-9]+)");
			
			
			
			
			
			
			
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
