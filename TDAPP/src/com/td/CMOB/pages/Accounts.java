package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Accounts extends _CommonPage  {

	private static Accounts MyAccounts;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntBalanceSum']")
	private MobileElement balance;

	@iOSFindBy(xpath = "//*[@label='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Accounts']")
	private MobileElement my_Account_Header;

	@iOSFindBy(xpath = "//*[@label='CREDIT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1'and @text='Total']")
	private MobileElement credit;

	@iOSFindBy(xpath = "//*[contains(@label,'$')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[text='$') and @resource-id='com.td:id/canTotal']")
	private MobileElement can_account_total;

	@iOSFindBy(xpath = "//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up' and @index='0']")
	private MobileElement homeButton;

	@iOSFindBy(xpath = "//*[@label='Preferences']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Preferences']")
	private MobileElement preferences;

	@iOSFindBy(xpath = "//*[@label='BANKING']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='BANKING']")
	private MobileElement account_Banking_header;

	@iOSFindBy(xpath = "//*[@label='INVESTING']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='INVESTING']")
	private MobileElement account_Investing_header;

	@iOSFindBy(xpath = "//*[@label='US TFSA, TD Direct Investing  3294']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='INVESTING']")
	private MobileElement US_TFSA_Account;

	@iOSFindBy(xpath = "//*[@label='Activity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='INVESTING']")
	private MobileElement US_TFSA_ACC_Activity;

	@iOSFindBy(xpath = "//*[contains@(label,'USD $')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[text='USD $'and @resource-id='com.td:id/usTotal')]")
	private MobileElement us_account_total;

	@iOSFindBy(xpath = "//*[@label='Back']")
	private MobileElement ios_back_button;
	
	@iOSFindBy(xpath="//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;
	
	@iOSFindBy(xpath = "//*[@label='Investing']")
	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.td:id/navText'and @text='Investing']")
	private MobileElement investing;

	@iOSFindBy(xpath = "//*[@label='Investing']")
	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='android:id/action_bar_title'and @text='Investing']")
	private MobileElement investing_Header;
	
	@iOSFindBy(xpath = "//*[@label='Go to WebBroker']")
	@AndroidFindBy(xpath ="//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and @text='Go to WebBroker']")
	private MobileElement webBroker;
	
	String platformName=getTestdata("MobilePlatform", "Batch Run");
	String Account_header = "My Accounts";
	String ios_Account_header="Accounts";
	String can_account_value = "$";
	String us_Account_value = "USD $";
	String prefernces = "Preferences";
	String t_banking = "Banking";
	String t_US_TFSA = "US TFSA";
	String t_investing = "INVESTING";

	public synchronized static Accounts get() {
		if (MyAccounts == null) {
			MyAccounts = new Accounts();
		}
		return MyAccounts;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");
	}

	/**
	 * This method will get Available Balance from summary page.
	 * 
	 * @return String
	 */
	public String getAvailableBalance() {
		Decorator();
		String bal = mobileAction.getText(balance);
		if (bal != null)
			return bal;
		else
			return null;
	}
	

	/**
	 * This method will verify the Account page and checks the US and Canada
	 * account is present.
	 * 
	 * @return void
	 * @throws Exception 
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAccountPage() throws Exception {
		Decorator();
		try {
		
			my_Account_Header.isDisplayed();
			
			String multiCurencyCheck= CL.GetDriver().findElement(By.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")).getText();
			if(us_Account_value.contains(multiCurencyCheck))
			{
				CL.GetReporting().FuncReport("Pass", "The test is verified");
			}
			} catch (NoSuchElementException e){
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	

	/**
	 * This method will verify the Account page and click the preferences
	 * button.
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void account_Prefernces_button() {
		Decorator();
		try {
			
			//mobileAction.FuncScrollToText(prefernces);
			mobileAction.FuncClick(preferences, prefernces);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the Account page and click the account home
	 * button.
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void account_Home_Btn_click() {

		Decorator();
		try {
			
			
			mobileAction.verifyElement(my_Account_Header, Account_header);
			mobileAction.FuncClick(homeButton, "HOMEBUTTON");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	

	/**
	 * This method will verify the Account page and click the account home
	 * button.
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void ios_account_Home_Btn_click() {

		Decorator();
		try {
			my_Account_Header.isDisplayed();
			mobileAction.FuncClick(ios_back_button, "Back_Button");
			mobileAction.FuncClick(homeButton, "HOMEBUTTON");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will verify the Account page and checks tshe US_TFSA is
	 * present .
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verify_TFS_ACC_ISPresent() {

		Decorator();
		try {
			mobileAction.verifyElement(my_Account_Header, Account_header);
			mobileAction.FuncScrollToText(t_US_TFSA);
			mobileAction.FuncClick(US_TFSA_Account, t_US_TFSA);
			mobileAction.FuncClick(US_TFSA_ACC_Activity, "US_TFSA_ACTIVITY");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	

	/**
	 * This method will verify the Account page and banking Header is present .
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verify_Banking_Header() {
		Decorator();
		try {
		
		
		
	
		
			if(platformName.equalsIgnoreCase("ios")){
			System.out.println(my_Account_Header.isDisplayed());
			System.out.println(account_Banking_header.isDisplayed());
			mobileAction.verifyElement(account_Banking_header,t_banking);
		
			}else{
			
			mobileAction.verifyElement(my_Account_Header, Account_header);
			mobileAction.verifyElement(account_Banking_header, t_banking);
			}
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the Account page and Investing Header is present
	 * .
	 * 
	 * @return void
	 * @throws Exception 
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verify_Investing_Header() throws Exception {
		Decorator();
		try {
			mobileAction.FunCSwipeandScroll(account_Investing_header);
			System.out.println(account_Investing_header.isDisplayed());
			mobileAction.verifyElement(account_Investing_header, t_investing);
			
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will verify the EW and WB Functionality.
	 * EW functionalities displays and Investing accounts 
	 * are displayed but user can not drill down the WB accounts.
	 * 
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void veify_EW_WB_Functionality() {
		Decorator();
		try {
			mobileAction.verifyElement(account_Banking_header, "BANKING");
			System.out.println("Verified Banking Header");
			
			mobileAction.FuncClick(ios_back_button, "Back_Button");
			mobileAction.FuncClick(menu,"Menu");
			System.out.println("Clicked on Menu");
			
			mobileAction.FuncClick(investing,"Investing");
			System.out.println("Clicked on Investing");
			boolean flag=investing_Header.isDisplayed();
		   if(flag)
			mobileAction.verifyElement(webBroker, "Go to WebBroker");
			System.out.println("Verified Web Broker Page");
			
		} catch (NoSuchElementException | IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
