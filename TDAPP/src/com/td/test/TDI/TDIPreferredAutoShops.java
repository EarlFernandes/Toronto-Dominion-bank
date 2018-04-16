package com.td.test.TDI;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.aspectj.weaver.ast.Call;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TDIPreferredAutoShops extends _CommonPage {

	private static TDIPreferredAutoShops TDIPreferredAutoShops;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name='Preferred Auto Shops']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Preferred Auto Shops']")
	private MobileElement autoheader;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='Cancel']")
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button2']")
	private MobileElement cancelBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='Call']")
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement CallBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='icon_call']/..//XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/coll_repair_phone']")
	private List<MobileElement> Callnos;
	

		public synchronized static TDIPreferredAutoShops get(){
			if(TDIPreferredAutoShops == null){
				TDIPreferredAutoShops = new TDIPreferredAutoShops();
			}
			return TDIPreferredAutoShops;
		}
		
		private void Decorator() {
			PageFactory.initElements(
					new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
		}
	
		/**
		 * This method will verify the autoheader page and click on the collision repair number to call and verify call and cancel button .
		 * 
		 * @throws InterruptedException
		 *             In case an exception occurs while clicking over the element.
		 * @throws IOException
		 *             If there is problem while reporting.
		 * @throws NoSuchElementException
		 *             In case the element is not found over the screen.
		 * 
		 * 
		 */
		public void collisionRepair(){
			Decorator();
			try{
				mobileAction.waitProgressBarVanish();
				mobileAction.verifyElementIsDisplayed(autoheader,"Preferred auto shops");
				mobileAction.FuncGetText(Callnos.get(0));
				//for(int i = 0 ; i < Callnos.size() ; i++)
				//	System.out.println(Callnos.get(i).getText().toString());
				mobileAction.FuncClick(Callnos.get(0), "collision repair");
				mobileAction.verifyElementIsDisplayed(cancelBtn, "cancel button");
				mobileAction.verifyElementIsDisplayed(CallBtn, "call button");
				String callingOption = getTestdata("CallingOption","UserIDs");
				System.out.println(callingOption);
				if(callingOption.equalsIgnoreCase("Call")){
				mobileAction.FuncClick(CallBtn, "call collision repair");
				//mobileAction.FuncClick(CallBtn, "call collision repair");
				}
				else
					mobileAction.FuncClick(cancelBtn, "cancel button clicked");
				
			}catch (Exception e) {
				try {
					CL.GetReporting().FuncReport("Fail",
							"NoSuchElementException from Method " + this.getClass().toString());
				} catch (IOException e1) {
					System.err.println("Failed to write in report.");
				}
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			
			}
		} 
		/**
		 * This method will verify the autoheader page and click on the tow truck number to call and verify call and cancel button .
		 * 
		 * @throws InterruptedException
		 *             In case an exception occurs while clicking over the element.
		 * @throws IOException
		 *             If there is problem while reporting.
		 * @throws NoSuchElementException
		 *             In case the element is not found over the screen.
		 * 
		 * 
		 */
		public void towTruck(){
			Decorator();
			try{
				mobileAction.verifyElementIsDisplayed(autoheader,"Preferred auto shops");
				mobileAction.FuncGetText(Callnos.get(1));
				mobileAction.FuncClick(Callnos.get(1), "tow a truck");
				mobileAction.verifyElementIsDisplayed(cancelBtn, "cancel button");
				mobileAction.verifyElementIsDisplayed(CallBtn, "call button");
				String callingOption = getTestdata("CallingOption","UserIDs");
				System.out.println(callingOption);
				if(callingOption.equalsIgnoreCase("Call")){
				mobileAction.FuncClick(CallBtn, "call collision repair");
				//mobileAction.FuncClick(CallBtn, "call collision repair");
				//mobileAction.getPageSource();
				}
				else
					mobileAction.FuncClick(cancelBtn, "cancel button clicked");
				
			}catch (Exception e) {
				try {
					CL.GetReporting().FuncReport("Fail",
							"NoSuchElementException from Method " + this.getClass().toString());
				} catch (IOException e1) {
					System.err.println("Failed to write in report.");
				}
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			
			}
		} 
		/**
		 * This method will verify the autoheader page and click on the enterprise car rental
		 * number to call and verify call and cancel button .
		 * 
		 * @throws InterruptedException
		 *             In case an exception occurs while clicking over the element.
		 * @throws IOException
		 *             If there is problem while reporting.
		 * @throws NoSuchElementException
		 *             In case the element is not found over the screen.
		 * 
		 * 
		 */
		public void eCarRental(){
			Decorator();
			try{
				mobileAction.verifyElementIsDisplayed(autoheader,"Preferred auto shops");
				mobileAction.FuncGetText(Callnos.get(2));
				mobileAction.FuncClick(Callnos.get(2), "e car rental");
				mobileAction.verifyElementIsDisplayed(cancelBtn, "cancel button");
				mobileAction.verifyElementIsDisplayed(CallBtn, "call button");
				String callingOption = getTestdata("CallingOption","UserIDs");
				System.out.println(callingOption);
				if(callingOption.equalsIgnoreCase("Call")){
				mobileAction.FuncClick(CallBtn, "call collision repair");
				//mobileAction.FuncClick(CallBtn, "call collision repair");
				}
				else
					mobileAction.FuncClick(cancelBtn, "cancel button clicked");
				
			}catch (Exception e) {
				try {
					CL.GetReporting().FuncReport("Fail",
							"NoSuchElementException from Method " + this.getClass().toString());
				} catch (IOException e1) {
					System.err.println("Failed to write in report.");
				}
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			
			}
		} 
}
 
