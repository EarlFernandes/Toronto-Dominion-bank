package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Logout extends _CommonPage {
	private static Logout Logout;
	
	@iOSFindBy(xpath ="//*[@label='Menu en en-tête']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement french_Menu_button;
	
	@iOSFindBy(xpath ="//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement Menu_button;
	
	@iOSFindBy(accessibility = "NAV_DRAWER_ITEMS_LOGOUT")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement logout;
	
	@iOSFindBy(xpath ="//*[@label='Fermer la session']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Fermer la session']")
	private MobileElement logout_French;
	
	@iOSFindBy(xpath ="//XCUIElementTypeNavigationBar/XCUIElementTypeOther")
	@AndroidFindBy(xpath = "android.widget.TextView//[@resource-id='android:id/action_bar_title' and @text='Logged Out']")
	private MobileElement logoutHeader; 
	
	@iOSFindBy(xpath ="//*[@label='Retour']")
	private MobileElement french_back_button; 
	
	@iOSFindBy(accessibility = "LOGOUT_SUC")
	private MobileElement successTitle; 
	
	@iOSFindBy(accessibility = "LOGOUT_SUC_MESSAGE")
	private MobileElement successMsg; 

	@iOSFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	private MobileElement goBackHome;

	@iOSFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	private MobileElement contactUs;

	@iOSFindBy(xpath = "//XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
	private MobileElement locations;
 
	
	@iOSFindBy(xpath ="//*[@label='Terminé']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/success' and @text='Terminé']")
	private MobileElement logoutHeaderFrench;
	
	String platformName=CL.getTestDataInstance().getMobilePlatForm();
	
	
	public synchronized static Logout get() {
		if (Logout == null) {
			Logout  = new Logout ();
		}
		return Logout ;
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		
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
	 */
	public void french_clickMenuButton() {
		
		try {
			Decorator();
			
			if(platformName.equalsIgnoreCase("ios")){
				mobileAction.FuncClick(french_back_button, "BACK");
				mobileAction.FuncClick(french_Menu_button, "French_Menu");
			}else{	
			mobileAction.FuncClick(french_Menu_button, "French_Menu");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void clickLogoutFrench() {
		
		
		String Logged_Out_French = "Terminé";
		Decorator();
		try {
			mobileAction.FuncClick(logout_French, "Logout French");
			mobileAction.verifyElementIsDisplayed(logoutHeaderFrench, Logged_Out_French);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
		 */
		public void logout() {

			Decorator();
			try {
				
				String Log_Out = "Logged Out";
				mobileAction.FuncClick(logout, "Logout");
				
				
					
}
			
			 catch (NoSuchElementException | InterruptedException | IOException e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
				mobileAction.verifyTextEquality(logoutHeader.getText(), mobileAction.getAppString("logoutSuccessPageHeader"));
				mobileAction.verifyTextEquality(successMsg.getText(), mobileAction.getAppString("logoutSuccessCopy"));
				mobileAction.verifyTextEquality(successTitle.getText(), mobileAction.getAppString("success"));
				mobileAction.verifyTextEquality(goBackHome.getText(), mobileAction.getAppString("btn_go_back_home"));
				mobileAction.verifyTextEquality(contactUs.getText(), mobileAction.getAppString("logoutSuccessQuickTaskContact"));
				mobileAction.verifyTextEquality(locations.getText(), mobileAction.getAppString("logoutSuccessQuickTaskFindLocations"));
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.RelativeLayout[@resource-id='com.td:id/receipt_info_layout']/android.widget.TextView[@text='" + mobileAction.getAppString("success") + "']", "Success");
				mobileAction.verifyElementUsingXPath("//android.widget.RelativeLayout[@resource-id='com.td:id/receipt_info_layout']/android.widget.TextView[@text='" + mobileAction.getAppString("logoutSuccessCopy") + "']", "Success Message");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("logoutSuccessPageHeader") + "']", "Logged Out header");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='" + mobileAction.getAppString("quick_links_go_back_home").toUpperCase() + "']", "Go back home");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='" + mobileAction.getAppString("contact_str").toUpperCase() + "']", "Contact us");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='" + mobileAction.getAppString("find_locations").toUpperCase() + "']", "Locations");
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

			
}

