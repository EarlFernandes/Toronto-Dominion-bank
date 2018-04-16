package com.td.test.TDI;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TDIContactUs extends _CommonPage {

	private static TDIContactUs TDIContactUs;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar//following-sibling::XCUIElementTypeStaticText[@label='Contact Us']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Contact Us']")
	private MobileElement header;
	
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeCell//following-sibling::XCUIElementTypeButton)[1]")
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text='University Students')]")
	private MobileElement univStud;
	
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeCell//following-sibling::XCUIElementTypeButton)[2]")
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text='Not Part of a Group?')]")
	private MobileElement notGrp;

		public synchronized static TDIContactUs get(){
			if(TDIContactUs == null){
				TDIContactUs = new TDIContactUs();
			}
			return TDIContactUs;
		}
		
		private void Decorator() {
			PageFactory.initElements(
					new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
		}
		/**
		 * This method will verify contact us header.
		 * 
		 * @throws InterruptedException
		 *             In case an exception occurs while clicking over the element.
		 * @throws IOException
		 *             If there is problem while reporting.
		 * @throws NoSuchElementException
		 *             In case the element is not found over the screen.
		 * 
		 */
		public void contactUsHeader(){
			Decorator();
			try{
				mobileAction.waitTDIProgressBarVanish();
				mobileAction.verifyElementIsDisplayed(header, "contact us header");
				
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
		 * This method will click on university students.
		 * 
		 * @throws InterruptedException
		 *             In case an exception occurs while clicking over the element.
		 * @throws IOException
		 *             If there is problem while reporting.
		 * @throws NoSuchElementException
		 *             In case the element is not found over the screen.
		 * 
		 */
		public void UnivStudents(){
			Decorator();
			try{
				mobileAction.FuncClick(univStud, "University Students alumini");
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
		 * This method will verify and click on university students.
		 * 
		 * @throws InterruptedException
		 *             In case an exception occurs while clicking over the element.
		 * @throws IOException
		 *             If there is problem while reporting.
		 * @throws NoSuchElementException
		 *             In case the element is not found over the screen.
		 * 
		 */
		public void notGroup(){
			Decorator();
			try{
				mobileAction.FuncClick(notGrp,"not a part of Professional group");
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
