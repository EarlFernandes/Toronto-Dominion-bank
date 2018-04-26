/**
 * 
 */
package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/**
 * @author akkins9
 *
 */
public class Locations extends _CommonPage {
	private static Locations Locations;
	private String location1 = "100 Wellington Street West, Toronto";
	private String location2 = "Ontario";
	private String location3 = "ON";
	// Elements of Locations Page

	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement title;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	@AndroidFindBy(id = "android:id/up")
	private MobileElement hamMenu;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
	@AndroidFindBy(id = "com.td:id/imageView1")
	private MobileElement SearchIcon;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
	@AndroidFindBy(id = "com.td:id/edit_search_location")
	private MobileElement searchTextBox;

	@AndroidFindBy(id = "com.td:id/show_my_location_btn")
	private MobileElement mapView;

	@AndroidFindBy(id = "com.td:id/map_layout_view")
	private MobileElement showMyLocations;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
	@AndroidFindBy(id = "com.td:id/list_find_locations")
	private MobileElement locationsList;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name='Filter Locations, button' or @name= 'Filtrer les emplacements, bouton' or @name='過濾器位置，按鈕' or @name='过滤器位置，按钮']")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[2]")
	private MobileElement filterLocationsicon;

	@iOSXCUITFindBy(xpath =" //XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeButton")
	@AndroidFindBy(id = "com.td:id/filter_multi_select_done")
	private MobileElement filterLocationsDone;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]")
	private MobileElement firstLocationStreet;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]")
	private MobileElement firstLocationCity;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]")
	private MobileElement firstLocationType;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")
	private MobileElement firstLocationdistance;

	@iOSXCUITFindBy(xpath =" //XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView")
	private MobileElement filterLocations_Investor;

	@iOSXCUITFindBy(xpath ="  //XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText/XCUIElementTypeImage")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.ImageView")
	private MobileElement filterLocations_InvestorCheckMark;

	// Elements of Second Page After Clicking on 100 Wellington

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	private MobileElement backButton;

	@AndroidFindBy(id = "com.td:id/fragment_location_map")
	private MobileElement mapViewSecondPage;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
	@AndroidFindBy(id = "com.td:id/scrollView1")
	private MobileElement SecondPageScrollView;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/label_branch_address")
	private MobileElement branchAddress;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/text_branch_address")
	private MobileElement branchAddressText;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/label_branch_number")
	private MobileElement branchNumber;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/text_branch_number")
	private MobileElement branchNumberText;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/label_branch_wheelchair")
	private MobileElement wheelChairLabel;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/text_branch_wheelchair")
	private MobileElement wheelChairtext;

	@AndroidFindBy(id = "com.td:id/label_branch_hours")
	private MobileElement branchHoursLabel;

	@AndroidFindBy(id = "com.td:id/text_branch_hours")
	private MobileElement branchHourstext;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")
	private MobileElement getDirectionsLink;

	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4] /XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]")
	private MobileElement goBackHomeLink;
	// END of Elements of Second Page After Clicking on 100 Wellington

	// Elements of Locations Page END

	public synchronized static Locations get() {
		if (Locations == null) {
			Locations = new Locations();
		}
		return Locations;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);

	}

	// Actions of Locations Page

	public void verifyLocationsPage() {
		Decorator();
		try {
			// After clickLocations this function call it starts execution

			mobileAction.verifyElementIsDisplayed(title, "Verifying page Header");
			mobileAction.verifyElementIsDisplayed(hamMenu, "Verifying menu icon ");
			mobileAction.verifyElementIsDisplayed(SearchIcon, "Verifying Search Icon");
			mobileAction.verifyElementIsDisplayed(searchTextBox, "Verifying Search textBox");
			mobileAction.verifyElementIsDisplayed(filterLocationsicon, "Verifying Filter Locations Icon");
			mobileAction.FuncClick(filterLocationsicon, "Clicking on Filter Locations Icon");
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(filterLocations_Investor, "Verifying investor");
			if (mobileAction.verifyElementIsPresent(filterLocations_InvestorCheckMark)) {
				mobileAction.FuncClick(filterLocations_Investor, "Clicking on Investor to uncheck");
			} else {
				mobileAction.FuncClick(filterLocations_Investor, "Clicking on Investor to check");
			}
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(filterLocationsDone, "Verifying done button ");
			mobileAction.FuncClick(filterLocationsDone, "Clicking on Filter Locations Done");
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncSendKeys(searchTextBox, location1);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {

				mobileAction.HideKeyBoard_IOS();
			} else {
				mobileAction.FuncHideKeyboard();
			}
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.verifyElementIsDisplayed(mapView, "Verifying map view");
			mobileAction.verifyElementIsDisplayed(showMyLocations, "Verifying Show my locations Button");
			}
			mobileAction.verifyElementIsDisplayed(locationsList, "Verifying Locations List ");
			
			
			mobileAction.FuncSendKeys(searchTextBox, location2);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {

				mobileAction.HideKeyBoard_IOS();
			} else {
				mobileAction.FuncHideKeyboard();
			}
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.verifyElementIsDisplayed(mapView, "Verifying map view");
			mobileAction.verifyElementIsDisplayed(showMyLocations, "Verifying Show my locations Button");
			}
			mobileAction.FuncSendKeys(searchTextBox, location3);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {

				mobileAction.HideKeyBoard_IOS();
			} else {
				mobileAction.FuncHideKeyboard();
			}
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.verifyElementIsDisplayed(mapView, "Verifying map view");
			mobileAction.verifyElementIsDisplayed(showMyLocations, "Verifying Show my locations Button");
			}
			mobileAction.verifyElementIsDisplayed(locationsList, "Verifying Locations List ");

			mobileAction.verifyElementIsDisplayed(locationsList, "Verifying Locations List ");
			mobileAction.verifyElementIsDisplayed(firstLocationStreet, "Verifying first Location Street Name");
			String streetName = firstLocationStreet.getText();
			mobileAction.verifyElementIsDisplayed(firstLocationCity, "Verifying first Location City");
			String city = firstLocationCity.getText();
			// city.equalsIgnoreCase();
			mobileAction.verifyElementIsDisplayed(firstLocationType, "Verifying first location Type");
			mobileAction.verifyElementIsDisplayed(firstLocationdistance, "Verifying first location Distance");
			mobileAction.FuncClick(firstLocationStreet, "Clicking on first location in the field ");
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(backButton, "Verifying bcak button ");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.verifyElementIsDisplayed(mapViewSecondPage, "Verifying map view in branch page");
			}
			mobileAction.verifyElementIsDisplayed(branchAddress, "Verifying branch address label");
			mobileAction.verifyElementIsDisplayed(branchAddressText, "Verifying branch address text");
			mobileAction.verifyElementIsDisplayed(branchNumber, "Verifying branch Number label");
			mobileAction.verifyElementIsDisplayed(branchNumberText, "Verifying branch Number Text");
			mobileAction.verifyElementIsDisplayed(wheelChairLabel, "Verifying wheel chair label");
			mobileAction.verifyElementIsDisplayed(wheelChairtext, "Verifying wheel chair text");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			mobileAction.verifyElementIsDisplayed(branchHoursLabel, "Verifying branch hours label");
			mobileAction.verifyElementIsDisplayed(branchHourstext, "Verifying branch hours text");
			}
			mobileAction.FuncSwipeUpTillScreenBottom(getDirectionsLink);
			mobileAction.verifyElementIsDisplayed(getDirectionsLink, "Verifying ");
			mobileAction.verifyElementIsDisplayed(goBackHomeLink, "Verifying ");
			mobileAction.FuncClick(goBackHomeLink, "Clicking on Go Back Home");

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

	// Actions of Locations Page END

}
