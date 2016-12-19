package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HomeScreen extends _CommonPage {

	private static HomeScreen HomeScreen;

	@iOSFindBy(xpath="//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath="//*[@label='Bills']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Bills']")
	private MobileElement bills;

	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@value='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='My Accounts']")
	private MobileElement my_accounts;

	@iOSFindBy(xpath="//*[@label='TRANSFERS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Transfers']")
	private MobileElement transfers;

	@iOSFindBy(xpath = "//*[@label='TRANSFERS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='TRANSFERS']")
	private MobileElement transfer_button_dashboard;

	@iOSFindBy(xpath ="//*[@label='Quick Access']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access']")
	private MobileElement quickAccess;
	
	@iOSFindBy(xpath ="//*[@label='Investing']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/easy_access']")
	private MobileElement investing_button;

	
	@iOSFindBy(xpath = "//*[@label='VIREMENTS'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='VIREMENTS']")
	private MobileElement french_transfers;
	
	@iOSFindBy(xpath ="//*[@label='Menu en en-tête']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement Menu_button;
	
	@iOSFindBy(xpath="//*[@label='TD FOR ME'] ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/td_zones_dashboard' and @text='TD FOR ME']")
	private MobileElement dashboard_Location;
	
	@iOSFindBy(xpath ="//*[@label='TD For Me']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='TD for Me']")
	private MobileElement TD_For_Me ;
	
	@iOSFindBy(xpath="//*[@label='In progress'] ")
	private MobileElement progressBarIos;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/your_location_text_view']")
	private MobileElement nearByLoaction;
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/viewing_text_view' and @text='Nearby']")
	private MobileElement viewingDetail;
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/chevron_button_up']")
	private MobileElement chevron_Button;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/zone_name'][1]")
	private MobileElement zone_Name;
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @enabled='true']")
	private MobileElement zone_Header;
	
	String progressBar = "//android.widget.ProgressBar[@resource-id='android:id/progress' and @enabled='true']";

	@iOSFindBy(xpath ="//*[@value='SEND MONEY']")
	private MobileElement send_money_button;
	
	@iOSFindBy(xpath ="//*[@label='Back']")
	private MobileElement back_button; 
	
	
	public synchronized static HomeScreen get() {
		if (HomeScreen == null) {
			HomeScreen = new HomeScreen();
		}
		return HomeScreen;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");
	}

	String platformName=CL.getTestDataInstance().getMobilePlatForm();
	/**
	 * This method will click on the bill button on home page
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
	public void clickBill() {

		try {
			Decorator();
			mobileAction.FuncClick(bills, "Bills");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the quick access button on home page
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
	public void clickQuickAccess() {

		try {
			Decorator();
			mobileAction.FuncClick(quickAccess, "Quick Access");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the My Accounts button on home page
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
	public void clickMyAccounts() {
		try {
			Decorator();
		
			//System.out.println(CL.GetDriver().getPageSource());
			mobileAction.FuncClick(my_accounts, "My Accounts");
			
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
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
	public void clickMenu() {
		try {
			Decorator();
			mobileAction.FuncClick(menu, "Menu");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

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
	public void clickMenu_french() {
		try {
			Decorator();
			mobileAction.FuncClick(Menu_button, "French_Menu");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the Transfers button on home page
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
	public void clickTransfers() {
		try {
			Decorator();
			mobileAction.FuncClick(transfers, "Transfers");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will click on the Transfers button on dashboard page
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
	public void clickDashboardTransfers() {
		Decorator();
		try {
			mobileAction.FuncClick(transfer_button_dashboard, "TRANSFER");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	

	/**
	 * This method will click on the Transfers button on dashboard page
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
	public void clickInvesting() {
		Decorator();
		try {
			mobileAction.FuncClick(investing_button, "Investing");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	/**
	 * This method will click on the Transfers button on home page in French language
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
	public void clickTransfers_InFrench() {
		try {
			Decorator();
			mobileAction.FuncClick(french_transfers, "VIREMENTS");
			mobileAction.FuncClickBackButton();
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

}
	public void sendMoney() {
		try {
			Decorator();
			WebDriverWait wait = new WebDriverWait(CL.GetDriver(), 100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@label,'The right mortgage can save you money')]")));
			mobileAction.FuncClick(send_money_button, "sendMoney");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

}
	
	/**
	 * This method will click on the Back  button 
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
	public void back_button() {

		Decorator();
		try {
			
			
			if(platformName.equalsIgnoreCase("ios")){
				mobileAction.FuncClick(back_button, "BACK");
			}

			mobileAction.FuncClickBackButton();
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}


}
	
	/**
	 * This method will click on the locations from the flyout menu
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
	
	public void flyoutMenu_Locations() {
		Decorator();
		try {
			
				String PlatformName=getTestdata("MobilePlatform", "Batch Run");
			if(PlatformName.equalsIgnoreCase("ios")){
				
				mobileAction.FuncClick(dashboard_Location, "TD Zone Dashboard");
				System.out.println("Clicked on TD Dashboard");
				mobileAction.waitForElementToVanish(progressBarIos);
				mobileAction.verifyElement(TD_For_Me,"TD for Me");
				System.out.println("Verified TDForMe");
				
			}else{
			
			AppiumDriver<WebElement> driver = ((AppiumDriver<WebElement>) CL.GetDriver());
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='com.td:id/td_zones_dashboard' and @text='TD FOR ME']")));
			mobileAction.FuncClick(dashboard_Location, "TD Zone Dashboard");
			System.out.println("Clicked on TD Dashboard");
			
			//mobileAction.waitForElementToVanish(progressBarIos);a
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='TD for Me']")));
			mobileAction.verifyElement(TD_For_Me,"TD for Me");
			System.out.println("Verified TDForMe");
			}	
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	
	/**
	 * This method will click on the locations and verify the nearby locations
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
	public void verifyLocations() {
		Decorator();
		try {
			String location = mobileAction.getText(nearByLoaction);
			System.out.println("Location Value = " + location);
			mobileAction.verifyElement(viewingDetail, "Nearby");
			mobileAction.FuncClick(chevron_Button, "Chevron Button");
			mobileAction.FunctionSwipe("Up", 100, 0);			
			String addr =mobileAction.getText(zone_Name);
			System.out.println("Location Name = " + addr);
			mobileAction.FuncClick(zone_Name, "Zone Name");						
			mobileAction.waitForElementToDisappear(progressBar);
			System.out.println("Waiting Completed");
			mobileAction.verifyElement(zone_Header,addr);
			
			
			
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}


	
}
