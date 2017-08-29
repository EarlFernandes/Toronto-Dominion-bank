package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FindLocations extends _CommonPage {

	private static FindLocations FindLocations;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement findLocations_Header;
	
	@iOSFindBy(xpath = "//*[@label='Find Locations']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_search_location']")
	private MobileElement searchLocation;

	public synchronized static FindLocations get() {
		if (FindLocations == null) {
			FindLocations = new FindLocations();
		}
		return FindLocations;
	}

	private void Decorator() {

		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);		
	}

	/**
	 * This method will verify the find locations header
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyFindLocations() {

		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(findLocations_Header,
					getTextInCurrentLocale(StringArray.ARRAY_FIND_LOCATION));
			Thread.sleep(2000);
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
	
	public void SelectBranchLocation(){
		Decorator();
		String locationAddress = CL.getTestDataInstance().TCParameters.get("Search");
		System.out.println("Location address:"+locationAddress);
		String locationXpath ="";
		try{

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				locationXpath = "//*[@label='"+ locationAddress +"']";
				
			}else{
				//For android, change address to upper letters.
				locationAddress= locationAddress.toUpperCase();
				mobileAction.FuncClick(searchLocation, "Search Location");
				
				mobileAction.FuncSendKeys(locationAddress);
				mobileAction.FuncHideKeyboard();
				locationXpath = "//android.widget.TextView[@text='"+ locationAddress +"']";
			}
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(locationXpath, true, 20, "up");
		}catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
}
