package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSH_Contact_Location  extends _CommonPage{
	
	private static MIT_DSH_Contact_Location MIT_DSH_Contact_Location;

	public synchronized static MIT_DSH_Contact_Location get() {
		if (MIT_DSH_Contact_Location == null) {
			MIT_DSH_Contact_Location = new MIT_DSH_Contact_Location();
		}
		return MIT_DSH_Contact_Location;
	
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	
	@iOSFindBy(xpath = "//*[@name='QuickLinkLeftNavButton' or @name='NAVIGATION_ITEM_MENU']")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;
	
	@iOSFindBy(xpath = "//*[(@label='Investing Accounts' or @label='Comptes Placements directs TD' or @label='投资账户' or @label='投資賬戶' or @label='Trade' or contains(@label,'Négociation') or @label='交易' or @label='交易') and @name='Label_0']")
	@AndroidFindBy(xpath = "//*[(@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶') and @resource-id='com.td:id/textview_flyout_menu_item']")
	MobileElement InvestingAccount;
	
	
	@iOSFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;
	
	@iOSFindBy(xpath = "(//*[@label='Contact Us' or @label='Contactez-nous' or @label='联系我们' or @label='聯絡我們'])[2]")
	@AndroidFindBy(xpath = "//*[(@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement btnContactUs;
	
	
	//@iOSFindBy(xpath = "//*[@label='Contact Us' or @label='Contacter nous' or @label='联系我们' or @label='聯絡我們']")
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblContactUs;
	
	@iOSFindBy(xpath = "//*[@label='Contact Us' or @label='Contactez-nous' or @label='联系我们' or @label='聯絡我們']")
	@AndroidFindBy(xpath = "//*[@text='Contact Us' or @text='Contactez-nous' or @text='联系我们' or @text='聯絡我們']")
	private MobileElement flyoutContactUsLink;
	
	//@iOSXCUITFindBy(accessibility = "NearestBranchContactUsWidget")///*/*[1]
	@iOSFindBy(xpath = "//*[@label='Nearest Branch' or @label='Succursale' or @label='最近的分行' or @label='最近分行']")
	@AndroidFindBy(xpath = "//*[@text='Nearest Branch' or @text='Succursale' or @text='联系我们' or @text='聯絡我們']")
	private MobileElement btnNearestBranch;
	
	
	@iOSFindBy(xpath = "//*[@label='Find Locations' or @label='Trouver une succursale' or @label='查找分行' or @label='查找分行']")
	@AndroidFindBy(xpath = "//*[@text='Find Locations' or @text='Trouver une succursale' or @text='查找分行' or @text='查找分行']")
	private MobileElement lblFindLocation;
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Filter Locations') or contains(@name,'Filtrer les succursales') or contains(@name,'筛选分行网点') or contains(@name,'篩選分行')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Alerts' or @text='Alertes']")
	private MobileElement btnFilter;
	
	
	
	@iOSFindBy(xpath = "//*[@name='actionSheetDoneButton']/../following-sibling::XCUIElementTypeCell[1]/*[1]")
	//@iOSFindBy(xpath = "//*[@label='Branches' or @label='Succursales' or @label='分行' or @label='分行']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Alerts' or @text='Alertes']")
	private MobileElement filterOptions1;
	
	@iOSFindBy(xpath = "//*[@name='actionSheetDoneButton']/../following-sibling::XCUIElementTypeCell[2]/*[1]")
	//@iOSFindBy(xpath = "//*[@label='ATMs' or @label='GAB' or @label='自动柜员机' or @label='自動櫃員機']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Alerts' or @text='Alertes']")
	private MobileElement filterOptions2;
	
	@iOSFindBy(xpath = "//*[@name='actionSheetDoneButton']/../following-sibling::XCUIElementTypeCell[3]/*[1]")
	//@iOSFindBy(xpath = "//*[@label='Investor Centres' or @label='Centres d’investissement' or @label='道明自管投资服务中心' or @label='道明自管投資服務中心']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Alerts' or @text='Alertes']")
	private MobileElement filterOptions3;
	
	@iOSXCUITFindBy(accessibility = "actionSheetDoneButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Alerts' or @text='Alertes']")
	private MobileElement btnDone;
	
	public void goToDashboardHome() {
		Decorator();
		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
			mobileAction.FuncClick(InvestingAccount, "Investing Accounts Flyout Menu");
			LoginMIT.get().MITLogin();
			mobileAction.FuncClick(BT_Back, "< Button");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	public void verifyContactUsHomeUnAuthenticated() {
		Decorator();
		try {
			
			mobileAction.FuncSwipeWhileElementNotFound(btnContactUs, false, 10, "up");
			mobileAction.FuncVerifyTextEquals(btnContactUs,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_CONTACTUS));
			
		
			
			mobileAction.FuncClick(btnContactUs, "btnContactUs");
			
			mobileAction.verifyElementIsDisplayed(lblContactUs, "lblContactUs");
			
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void verifyContactUsHomeAuthenticated() {
		Decorator();
		try {
			
			
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
			mobileAction.FuncClick(InvestingAccount, "Investing Accounts Flyout Menu");
			LoginMIT.get().MITLogin();
			
			
			mobileAction.FuncClick(BT_Back, "< Button");			
			
			mobileAction.FuncSwipeWhileElementNotFound(btnContactUs, false, 10, "up");
			mobileAction.FuncVerifyTextEquals(btnContactUs,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_CONTACTUS));
			mobileAction.FuncClick(btnContactUs, "btnContactUs");
			
			mobileAction.verifyElementIsDisplayed(lblContactUs, "lblContactUs");
			
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	

	public void verifyFlyoutContactUs() {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
			mobileAction.FuncClick(InvestingAccount, "Investing Accounts Flyout Menu");
			LoginMIT.get().MITLogin();
			mobileAction.FuncClick(BT_Back, "< Button");
			
						
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutContactUsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutContactUsLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_CONTACTUS));

			
			clickFlyout(flyoutContactUsLink, "flyoutContactUsLink");
			
			mobileAction.verifyElementIsDisplayed(lblContactUs, "lblContactUs");

	}
	
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void verifyLocationLandingUnAuthenticated() {

		Decorator();

		try {	
			
			
			
			mobileAction.FuncSwipeWhileElementNotFound(btnNearestBranch, false, 10, "up");
			
			mobileAction.FuncVerifyTextEquals(btnNearestBranch,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_LOCATIONNEAREST));
			
			
			
			
			
			mobileAction.FuncClick(btnNearestBranch, "btnNearestBranch");
			
			mobileAction.verifyElementIsDisplayed(lblFindLocation, "lblFindLocation");
			
			mobileAction.verifyElementIsDisplayed(btnFilter, "btnFilter");
			mobileAction.FuncClick(btnFilter, "btnFilter");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");
			
			mobileAction.verifyElementIsDisplayed(filterOptions1, "filterOptions1");
			mobileAction.verifyElementIsDisplayed(filterOptions2, "filterOptions2");
			
			mobileAction.verifyElementIsDisplayed(filterOptions3, "filterOptions3");
			
			mobileAction.FuncClick(btnDone, "btnDone");
			
	}
	
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void verifyLocationLandingAuthenticated() {

		Decorator();

		try {
			
Thread.sleep(1000);
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
			mobileAction.FuncClick(InvestingAccount, "Investing Accounts Flyout Menu");
			LoginMIT.get().MITLogin();
			mobileAction.FuncClick(BT_Back, "< Button");
			
			
			mobileAction.FuncSwipeWhileElementNotFound(btnNearestBranch, false, 10, "up");
			mobileAction.FuncVerifyTextEquals(btnNearestBranch,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_LOCATIONNEAREST));
			mobileAction.FuncClick(btnNearestBranch, "btnNearestBranch");
			mobileAction.verifyElementIsDisplayed(lblFindLocation, "lblFindLocation");
			
			mobileAction.verifyElementIsDisplayed(btnFilter, "btnFilter");
			mobileAction.FuncClick(btnFilter, "btnFilter");
			mobileAction.verifyElementIsDisplayed(btnDone, "btnDone");
			
			mobileAction.verifyElementIsDisplayed(filterOptions1, "filterOptions1");
			mobileAction.verifyElementIsDisplayed(filterOptions2, "filterOptions2");
			
			mobileAction.verifyElementIsDisplayed(filterOptions3, "filterOptions3");
			
			mobileAction.FuncClick(btnDone, "btnDone");
			
	}
	
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickFlyout(MobileElement objElement, String text) {

		Decorator();

		try {

			for (int i = 0; i < 5; i++) {
				if (mobileAction.isObjExists(objElement, 2)) {
					mobileAction.FuncClick(objElement, "" + objElement.getText());
					break;
				}

				else {
					mobileAction.FuncSwipeOnce("up");
				}

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


