package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Logout extends _CommonPage {
	private static Logout Logout;

	@iOSFindBy(xpath = "//*[(@name='NAV_DRAWER_ITEMS_LOGOUT' or @name='flyout_title') and (@label='Logout' or @label='Fermer la session' or @label='退出' or @label='登出')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@resource-id='com.td:id/navText' or @resource-id='com.td:id/textview_flyout_menu_item') and @text='Logout']")
	private MobileElement logout;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Fermer la session']")
	@AndroidFindBy(xpath = "//android.widget.TextView[(@resource-id='com.td:id/navText' or @resource-id='com.td:id/textview_flyout_menu_item') and @text='Fermer la session']")
	private MobileElement logout_French;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "android.widget.TextView//[@resource-id='android:id/action_bar_title' and @text='Logged Out']")
	private MobileElement logoutHeader;

	@iOSFindBy(accessibility = "LOGOUT_SUC")
	private MobileElement successTitle;

	@iOSFindBy(accessibility = "LOGOUT_SUC_MESSAGE")
	private MobileElement successMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	private MobileElement goBackHome;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	private MobileElement contactUs;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
	private MobileElement locations;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Terminé']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/success' and @text='Terminé']")
	private MobileElement logoutHeaderFrench;

	@iOSXCUITFindBy(xpath = "//*[@label='Logout' or @label='Fermer la session' or @label='退出' or @label='登出']")
	// @iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Logout' OR
	// label CONTAINS[cd] 'Fermer la session' OR label CONTAINS[cd] '退出'` OR
	// label CONTAINS[cd] '登出'`]")
	@AndroidFindBy(xpath = "//*[(@text='Logout' or @text='Fermer la session' or @text='退出' or @text='登出') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement FLY_Logout;

	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_HamburgerMenu;

	@iOSFindBy(xpath = "//*[@label='Home' or @label='Accueil' or @label='主页' or @label='首頁']")
	@AndroidFindBy(xpath = "//*[@text='Home' or @text='Accueil' or @text='主页' or @text='首頁']")
	private MobileElement FLY_Home;

	// @iOSFindBy(xpath = "//*[contains(@label,'Username or Access Card') or
	// contains(@value,'Username or Access Card') or contains(@label,'Access
	// Card or Username')]")
	// Use this one now!
	// @iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Username or
	// Access Card' OR value CONTAINS[cd] 'Username or Access Card' OR value
	// CONTAINS[cd] 'Access Card or Username'`]")

	// By.classChain('**/XCUIElementTypeTable[`name ==
	// "table"`]/XCUIElementTypeCell[`visible == 1`]')

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	public synchronized static Logout get() {
		if (Logout == null) {
			Logout = new Logout();
		}
		return Logout;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will click on the Menu button on home page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void french_clickMenuButton() {

		try {
			Decorator();

			if (platformName.equalsIgnoreCase("ios")) {
				mobileAction.clickMenuButton();
				mobileAction.ClickBackButton();
			} else {
				mobileAction.clickMenuButton();
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will click on the Loggedout French button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickLogoutFrench() {

		String Logged_Out_French = "Terminé";
		Decorator();
		try {
			mobileAction.FuncClick(logout_French, "Logout French");
			mobileAction.verifyElementIsDisplayed(logoutHeaderFrench, Logged_Out_French);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on the Logout French button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void logout() {

		Decorator();
		try {

			mobileAction.clickMenuButton();
			mobileAction.sleep(1000);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				logout = mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[(@resource-id='com.td:id/navText' or @resource-id='com.td:id/textview_flyout_menu_item') and @text='"
										+ getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_LOGOUT) + "']",
								"Logout");
			}

			mobileAction.FuncClick(logout, "Logout");
			mobileAction.waitP2PProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify text within elements for the logout page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyLogoutScreenTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				// mobileAction.verifyTextEquality(logoutHeader.getText(),
				// mobileAction.getAppString("logoutSuccessPageHeader"));
				// mobileAction.verifyTextEquality(successMsg.getText(),
				// mobileAction.getAppString("logoutSuccessCopy"));
				// mobileAction.verifyTextEquality(successTitle.getText(),
				// mobileAction.getAppString("success"));
				// mobileAction.verifyTextEquality(goBackHome.getText(),
				// mobileAction.getAppString("btn_go_back_home"));
				// mobileAction.verifyTextEquality(contactUs.getText(),
				// mobileAction.getAppString("logoutSuccessQuickTaskContact"));
				// mobileAction.verifyTextEquality(locations.getText(),
				// mobileAction.getAppString("logoutSuccessQuickTaskFindLocations"));

			} else {

				// mobileAction.verifyElementUsingXPath("//android.widget.RelativeLayout[@resource-id='com.td:id/receipt_info_layout']/android.widget.TextView[@text='"
				// + mobileAction.getAppString("success") + "']", "Success");
				// mobileAction.verifyElementUsingXPath("//android.widget.RelativeLayout[@resource-id='com.td:id/receipt_info_layout']/android.widget.TextView[@text='"
				// + mobileAction.getAppString("logoutSuccessCopy") + "']",
				// "Success Message");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title'
				// and @text='" +
				// mobileAction.getAppString("logoutSuccessPageHeader") + "']",
				// "Logged Out header");
				// mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='"
				// +
				// mobileAction.getAppString("quick_links_go_back_home").toUpperCase()
				// + "']", "Go back home");
				// mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='"
				// + mobileAction.getAppString("contact_str").toUpperCase() +
				// "']", "Contact us");
				// mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='"
				// + mobileAction.getAppString("find_locations").toUpperCase() +
				// "']", "Locations");

			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void logoutFromDashboard() {
		Decorator();
		try {

			mobileAction.FuncSwipeWhileElementNotFound(FLY_Logout, true, 10, "down");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(BT_HamburgerMenu, "Hamburger Menu");

				mobileAction.FuncSwipeWhileElementNotFound(FLY_Home, true, 10, "down");
			}

			else {

				mobileAction.ClickBackButton();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void goBackHome() {
		Decorator();

		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				String xpath = "//android.widget.Button[contains(@text,'"
						+ getTextInCurrentLocale(StringArray.ARRAY_LOGOUT_GO_BACK_HOME) + "')]";
				goBackHome = mobileAction.verifyElementUsingXPath(xpath, "Go Back Home button");
			}

			mobileAction.FuncClick(goBackHome, "Go Back Home button");
			mobileAction.sleep(2000);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
