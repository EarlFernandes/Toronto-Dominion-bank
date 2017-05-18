package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Accounts extends _CommonPage {

	private static Accounts MyAccounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntBalanceSum']")
	private MobileElement txtBalance;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Accounts' or @label='Comptes']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Accounts' or @text='Mes comptes']")
	private MobileElement txtMy_Account_Header;
	
	@iOSFindBy(xpath = "//*[@label='INVESTING' or @label='Investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Investing' or @text='INVESTING']")
	private MobileElement txtAccount_Investing_header;


	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='CREDIT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1'and @text='Total']")
	private MobileElement txtCredit;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up' and @index='0']")
	private MobileElement btnHome;

	@iOSFindBy(xpath = "//*[@label='Profile & Settings']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Profile & Settings']")
	private MobileElement txtPreferences;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='BANKING']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='BANKING']")
	private MobileElement txtAccount_Banking_header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']")
	private MobileElement ios_Back_Button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement btnMenu;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='Investing']")
	private MobileElement txtInvesting;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title'and @text='Investing']")
	private MobileElement txtInvesting_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Go to WebBroker']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and @text='Go to WebBroker']")
	private MobileElement txtWebBroker;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	private MobileElement progresssBar;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Activity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/activityTab' and @text='Activity']")
	private MobileElement txtActivity;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Session Expired']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle' and @text='Session Expired']")
	private MobileElement txtSessionOut;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='No Activity to display in this account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='INVESTING']")
	private MobileElement txtNo_Activity;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id= 'com.td:id/summaryContent']")
	private MobileElement 	acntsListnew;
	
	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_button;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/account_Desc']")
	private MobileElement account;


	String sessionOutIos = "//XCUIElementTypeStaticText[@label='Session Expired']";
	String sessionOutAndroid = "//android.widget.TextView[@resource-id='android:id/alertTitle' and @text='Session Expired']";

	String accountsPage_Table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
			+ "XCUIElementTypeOther[1]/XCUIElementTypeTable[1]";

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/current_balance']")
	private MobileElement current_Balance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/account_desc']")
	private MobileElement account_Desc;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Summary')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/summaryTab' and @text='Summary']")
	private MobileElement summaryBtn;
   
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accountNumber']")
	private MobileElement account_Num;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/availableBalance']")
	private MobileElement available_Balance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	private MobileElement currencyCheck;

	String from_Account = getTestdata("FromAccount");
	String verify_Acnt = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='" + from_Account
			+ "']";
	
	String Acnt_Description = "//android.widget.TextView[@resource-id='com.td:id/accntDescrSum' and @text='" + from_Account
			+ "']";

	String account_Value = "//XCUIElementTypeStaticText[contains(@label,'" + from_Account + "')]";

	int i = 1;

	String firstPart = "//XCUIElementTypeCell[";
	String accountsSecondPart = "]/XCUIElementTypeStaticText[2]";
	String account_Header = "My Accounts";
	String ios_Account_Header = "Accounts";
	String can_Account_Value = "$";
	String us_Account_Value = "USD $";
	String prefernces = "Preferences";
	String t_Banking = "Banking";
	String t_US_TFSA = "US TFSA";
	String t_Investing = "INVESTING";

	public synchronized static Accounts get() {
		if (MyAccounts == null) {
			MyAccounts = new Accounts();
		}
		return MyAccounts;
	}
	
	public Accounts(){
		Decorator();
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will get Available Balance from summary page.
	 * 
	 * @return String
	 */
	public String getAvailableBalance() {
		Decorator();
		String bal = mobileAction.getText(txtBalance);
		if (bal != null)
			return bal;
		else
			return null;
	}

	/**
	 * This method will verify the Account page and checks the US_TFSA is
	 * present .
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void selectItemFromList() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, account_Header);
			System.out.println("From Account:"+ from_Account);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				//mobileAction.FuncSelectElementInTable(accountsPage_Table, firstPart , accountsSecondPart, from_Account);
				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_Account + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
			} else {
				mobileAction.FuncElementSwipeWhileNotFound(acntsListnew, verify_Acnt, 10, "down", true);

			}

			mobileAction.FuncClick(summaryBtn, "Summary");
			mobileAction.verifyElementIsDisplayed(current_Balance, "Current balance");
			mobileAction.verifyElementIsDisplayed(account_Desc, "Account Description");
			mobileAction.verifyElementIsDisplayed(available_Balance, "Available balance");
			mobileAction.verifyElementIsDisplayed(account_Num, "Account No");
			CL.GetReporting().FuncReport("PASS",
					"Account No, Current Balance,Account Desc, Available Balance is verified");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
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

			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "Accounts");
			mobileAction.FunCnewSwipe(txtCredit, false, 5);
			Thread.sleep(5000);
			String multiCurencyCheck = currencyCheck.getText();
			System.out.println("multiCurencyCheck:" + multiCurencyCheck);
			System.out.println("us_Account_Value:" + us_Account_Value);
			if (us_Account_Value.contains(multiCurencyCheck)) {
				CL.GetReporting().FuncReport("Pass", "The test is verified");
			}
		} catch (NoSuchElementException e) {
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

			mobileAction.FuncClick(txtPreferences, prefernces);
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

			mobileAction.verifyElement(txtMy_Account_Header, account_Header);
			mobileAction.FuncClick(btnHome, "HOMEBUTTON");
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
			txtMy_Account_Header.isDisplayed();
			mobileAction.FuncClick(ios_Back_Button, "Back_Button");
			mobileAction.FuncClick(btnHome, "HOMEBUTTON");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will verify the Account page and checks the US_TFSA is
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
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "Accounts");
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){

				System.out.println("Verify account:" + from_Account);
				//mobileAction.FuncSelectElementInTable(from_Accounts_table, Firstpart, Secondpart, from_AccountNo);
				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_Account + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
			}else{
				mobileAction.FuncElementSwipeWhileNotFound(acntsListnew, verify_Acnt, 10, "down", true);
			}
						
			mobileAction.FuncClick(txtActivity, "Activity");
			mobileAction.verifyElementIsDisplayed(txtActivity, "Activity");
			mobileAction.verifyElementIsDisplayed(account, "Account Number Displayed");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (Exception e) {
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
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, account_Header);
			mobileAction.verifyElementIsDisplayed(txtAccount_Banking_header, "BANKING");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (IOException e) {
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
			//mobileAction.FunCnewSwipe(txtAccount_Investing_header, false, 4);
			
			//mobileAction.FunCSwipeandScroll(txtAccount_Investing_header, false);
			mobileAction.verifyElementIsDisplayed(txtAccount_Investing_header, t_Investing);

		} catch (NoSuchElementException | IOException e) {
			e.printStackTrace();
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
	public void verify_accounts_Header() throws Exception {
		Decorator();
		try {
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String myAccountText= mobileAction.getAppString("str_My_Accounts");
				System.out.println("myAccountText:"+myAccountText);
				//myAccountText ="我的賬戶";
				txtMy_Account_Header = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + myAccountText + "']", "My Accounts");
			}
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, account_Header);

		} catch (NoSuchElementException | IOException e) {
			e.printStackTrace();
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the EW and WB Functionality. EW functionalities
	 * displays and Investing accounts are displayed but user can not drill down
	 * the WB accounts.
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
			mobileAction.verifyElement(txtAccount_Investing_header, "BANKING");
			Thread.sleep(1000);
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(txtInvesting, "Investing");
			boolean flag = txtInvesting_Header.isDisplayed();
			if (flag)
				mobileAction.verifyElement(txtWebBroker, "Go to WebBroker");

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the Account page Header
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAccountsPage() throws Exception {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "Accounts");

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the session expired after 10 mins
	 *
	 * 
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void sessionTimedOut() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.waitForElementToAppear(sessionOutIos, "Session Out");
				mobileAction.verifyElementIsDisplayed(txtSessionOut, "Session Expired");
			} else {
				mobileAction.waitForElementToAppear(sessionOutAndroid, "Session Out");
				mobileAction.verifyElementIsDisplayed(txtSessionOut, "Session Expired");
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyCreditAccountActivity() throws Exception {

		Decorator();
		try {

			Thread.sleep(2000);
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "Accounts");
			mobileAction.FunCnewSwipe(txtCredit, false, 2);
			Thread.sleep(5000);

			// mobileAction.FuncSelectElementInTable(accountsPage_Table,
			// Firstpart, accountsSecondPart, from_account);
			mobileAction.waitForElementToVanish(progresssBar);

			mobileAction.FuncClick(txtActivity, "Activity");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.verifyElementIsDisplayed(txtNo_Activity, "No Activity");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will select the account from the Accounts page
	 *
	 * 
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void selectAccount() throws Exception {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				MobileElement account = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_Value));
				mobileAction.FunCSwipeandScroll(account, true);
			} else {
				MobileElement account = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(verify_Acnt));
				mobileAction.FunCSwipeandScroll(account, true);
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will navigate to home page
	 *
	 * 
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void NavigationToHomePage(){
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				
				Thread.sleep(5000);
				mobileAction.FuncClick(back_button, "<");
				
			} else {
				//For android doing nothing				
			}

		} catch (Exception e  ) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/***
	This method will click the account from the Accounts page
	 *
	 * 
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	
	public void selectAccountInAccountSheet(){
		
		Decorator();
		try{
			boolean flag=true;
			int count=0;
		String accountXL = "//*[contains(@text,'" + CL.getTestDataInstance().getPrimaryAccount() + "') or contains(@label,'" + CL.getTestDataInstance().getPrimaryAccount() + "')  ]";

		/*MobileElement accountValue=(MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(accountXL));
		while(flag && count<26){
			
			if(mobileAction.verifyElementVisible(accountValue, "Account Value")){
			mobileAction.FuncClick(accountValue, "Account");
			flag=false;
			}else{
			mobileAction.FunctionSwipe("Up", 200, 200);
			count++;
			}}*/
		
		
		mobileAction.FuncSwipeWhileElementNotFoundByxpath(accountXL, true,10, "up");
		mobileAction.waitForElementToVanished(progresssBar);
		

		}catch(Exception e){
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void SelectAccountUsingAccountNameAndAccountNum() throws Exception {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				MobileElement account = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_Value));
				mobileAction.FunCSwipeandScroll(account, true);
			} else {
				System.out.println("Account Des:" + from_Account);
				String from_Account_des,  from_Account_num;
				from_Account_num = mobileAction.FuncGetValByRegx(from_Account, "\\d+");
				from_Account_des = from_Account.replaceAll(from_Account_num, "").trim();
				
				Acnt_Description = "//android.widget.TextView[@resource-id='com.td:id/accntDescrSum' and @text='" + from_Account_des
						+ "']";
				
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(Acnt_Description, false, 10, "up");
				
				String Acnt_num = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='" + from_Account_num
						+ "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(Acnt_num, true, 10, "up");
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}



