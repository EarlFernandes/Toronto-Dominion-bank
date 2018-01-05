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

public class MIT_DSH_Contact_Location extends _CommonPage {

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

	@iOSXCUITFindBy(xpath = "//*[@name='QuickLinkLeftNavButton' or @name='NAVIGATION_ITEM_MENU']")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;

	@iOSXCUITFindBy(xpath = "//*[(@label='Investing Accounts' or @label='Comptes Placements directs TD' or @label='投资账户' or @label='投資賬戶' or @label='Trade' or contains(@label,'Négociation') or @label='交易' or @label='交易' or @label='My Accounts' or @label='Mes comptes' or @label='我的账户' or @label='我的賬戶') and @name='Label_0']")
	@AndroidFindBy(xpath = "//*[(@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶' or @text='Trade' or contains(@text,'Négociation') or @text='交易' or @text='交易' or @text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶') and @resource-id='com.td:id/textview_flyout_menu_item']")
	MobileElement InvestingAccount;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSXCUITFindBy(xpath = "(//*[@label='Contact Us' or @label='Contactez-nous' or @label='联系我们' or @label='聯絡我們'])[2]")
	@AndroidFindBy(xpath = "//*[@text='Contact Us' or @text='Contactez-nous' or @text='联系我们' or @text='聯絡我們']")

	private MobileElement btnContactUs;

	// @iOSXCUITFindBy(xpath = "//*[@label='Contact Us' or @label='Contacter
	// nous' or
	// @label='联系我们' or @label='聯絡我們']")
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contactez-nous' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblContactUs;

	@iOSXCUITFindBy(xpath = "//*[@label='Contact Us' or @label='Contactez-nous' or @label='联系我们' or @label='聯絡我們']")
	@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contactez-nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutContactUsLink;

	// @iOSXCUITFindBy(accessibility = "NearestBranchContactUsWidget")///*/*[1]
	@iOSXCUITFindBy(xpath = "//*[@label='Nearest Branch' or @label='Find Locations' or @label='Succursale' or @label='最近的分行' or @label='最近分行']")
	// @AndroidFindBy(xpath = "//*[@text='Nearest Branch' or @text='Find
	// Locations' or @text='Succursale' or @text='Succursale la plus proche' or
	// @text='联系我们' or @text='聯絡我們']")
	@AndroidFindBy(id = "com.td:id/locationText")
	private MobileElement btnNearestBranch;

	@iOSXCUITFindBy(xpath = "//*[@label='Find Locations' or @label='Trouver une succursale' or @label='查找分行' or @label='查找分行']")
	// @AndroidFindBy(xpath = "//*[@text='Find Locations' or @text='Trouver une
	// succursale' or @text='查找分行' or @text='查找分行']")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement lblFindLocation;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Filter Locations') or contains(@name,'Filtrer les succursales') or contains(@name,'筛选分行网点') or contains(@name,'篩選分行')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Filter Locations' or @content-desc='Filtrer les succursales' or @content-desc='筛选分行网点' or @content-desc='篩選分行' or @content-desc='篩選分行地點']")
	private MobileElement btnFilter;

	@iOSXCUITFindBy(xpath = "//*[@name='actionSheetDoneButton']/../following-sibling::XCUIElementTypeCell[1]/*[1]")
	// @iOSFindBy(xpath = "//*[@label='Branches' or @label='Succursales' or
	// @label='分行' or @label='分行']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/filter_multi_select_row_textview' and (@text='Branches' or @text='Succursales' or @text='Branches' or @text='分行')]")
	private MobileElement filterOptions1;

	@iOSXCUITFindBy(xpath = "//*[@name='actionSheetDoneButton']/../following-sibling::XCUIElementTypeCell[2]/*[1]")
	// @iOSFindBy(xpath = "//*[@label='ATMs' or @label='GAB' or @label='自动柜员机'
	// or @label='自動櫃員機']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/filter_multi_select_row_textview' and (@text='ATMs' or @text='GAB' or @text='ATMs' or @text='自動櫃員機')]")
	private MobileElement filterOptions2;

	@iOSXCUITFindBy(xpath = "//*[@name='actionSheetDoneButton']/../following-sibling::XCUIElementTypeCell[3]/*[1]")
	// @iOSFindBy(xpath = "//*[@label='Investor Centres' or @label='Centres
	// d’investissement' or @label='道明自管投资服务中心' or @label='道明自管投資服務中心']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/filter_multi_select_row_textview' and (@text='Investor Centres' or @text='Centres dinvestissement' or @text='Investor Centres' or @text='道明自管投資服務中心')]")
	private MobileElement filterOptions3;

	@iOSXCUITFindBy(accessibility = "actionSheetDoneButton")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/filter_multi_select_done' and @text='Done']")
	private MobileElement btnDone;
	
	

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

			MIT_DSHQuickLinks.get().goToDashboardHome();
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

			MIT_DSHQuickLinks.get().goToDashboardHome();

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

			// mobileAction.FuncVerifyTextEquals(btnNearestBranch,
			// getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_LOCATIONNEAREST));

			mobileAction.FuncClick(btnNearestBranch, "btnNearestBranch");

			mobileAction.verifyElementIsDisplayed(lblFindLocation, "lblFindLocation");

			/*mobileAction.verifyElementIsDisplayed(btnFilter, "btnFilter");
			mobileAction.FuncClick(btnFilter, "btnFilter");
*/
			mobileAction.verifyElementIsDisplayed(filterOptions1, "filterOptions1");
			mobileAction.verifyElementIsDisplayed(filterOptions2, "filterOptions2");

			mobileAction.verifyElementIsDisplayed(filterOptions3, "filterOptions3");

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyLocationLandingAuthenticated() {

		Decorator();

		try {

			MIT_DSHQuickLinks.get().goToDashboardHome();

			mobileAction.FuncSwipeWhileElementNotFound(btnNearestBranch, false, 10, "up");
			// mobileAction.FuncVerifyTextEquals(btnNearestBranch,
			// getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_LOCATIONNEAREST));
			mobileAction.FuncClick(btnNearestBranch, "btnNearestBranch");
			mobileAction.verifyElementIsDisplayed(lblFindLocation, "lblFindLocation");

			mobileAction.verifyElementIsDisplayed(btnFilter, "btnFilter");
			mobileAction.FuncClick(btnFilter, "btnFilter");

			mobileAction.verifyElementIsDisplayed(filterOptions1, "filterOptions1");
			mobileAction.verifyElementIsDisplayed(filterOptions2, "filterOptions2");

			mobileAction.verifyElementIsDisplayed(filterOptions3, "filterOptions3");

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
