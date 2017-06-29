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

	@iOSFindBy(xpath = "//*[@label='CREDIT']")
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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Investing')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and (@text='Investing' or @text='Investing Accounts')]")
	private MobileElement txtInvesting;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Investing']")
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
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='No Activity to display in this account']")
	private MobileElement txtNo_Activity;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/summaryContent']")
	private MobileElement 	acntsListnew;
	
	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_button;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/account_desc']")
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
   
    //@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Account #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accountNumber']")
	private MobileElement account_Num;

	//@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Available Balance')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/availableBalance']")
	private MobileElement available_Balance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	private MobileElement currencyCheck;
	
	@iOSFindBy(xpath = "//*[@label='Retour' or @label='Back']")
	private MobileElement back_Btn;

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
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void selectItemFromList() {

		Decorator();

		String from_Account = getTestdata("FromAccount");
		String verify_Acnt = "//android.widget.TextView[contains(@text,'" + from_Account + "')]";  
		try {

			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, account_Header);
			System.out.println("From Account:"+ from_Account);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String account_value = "//XCUIElementTypeStaticText[contains(@value,'" + from_Account + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
			} else {
				mobileAction.FuncElementSwipeWhileNotFound(acntsListnew, verify_Acnt, 25, "down", true);

			}
			mobileAction.FuncClick(summaryBtn, "Summary");
			mobileAction.verifyElementIsDisplayed(current_Balance, "Current balance");
			mobileAction.verifyElementIsDisplayed(account_Desc, "Account Description");
			mobileAction.verifyElementIsDisplayed(available_Balance, "Available balance");
			CL.GetReporting().FuncReport("PASS",
					" Current Balance,Account Desc, Available Balance is verified");

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
	 * This method will verify the Account page and checks the US and Canada
	 * account is present.
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
	public void verifyAccountPage()  {
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
	 * This method will verify the Account page and click the preferences
	 * button.
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
	public void account_Prefernces_button() {
		Decorator();
		try {
			mobileAction.FuncClick(txtPreferences, prefernces);
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
	 * This method will verify the Account page and click the account home
	 * button.
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
	public void account_Home_Btn_click() {

		Decorator();
		try {
			mobileAction.verifyElement(txtMy_Account_Header, account_Header);
			mobileAction.FuncClick(btnHome, "HOMEBUTTON");
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
	 * This method will verify the Account page and click the account home
	 * button.
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
	public void ios_account_Home_Btn_click() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "My Accounts");
			mobileAction.FuncClick(ios_Back_Button, "Back_Button");
			mobileAction.FuncClick(btnHome, "HOMEBUTTON");
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
	 * This method will verify the Account page and checks the US_TFSA is
	 * present .
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
	public void verify_TFS_ACC_ISPresent() {

		Decorator();

		String from_Account = getTestdata("FromAccount");
		String verify_Acnt = "//android.widget.TextView[contains(@text,'" + from_Account + "')]";  

		String account_Value = "//XCUIElementTypeStaticText[contains(@label,'" + from_Account + "')]";
		try {
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "Accounts");
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				String account_value = "//XCUIElementTypeStaticText[contains(@value,'" + from_Account + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 30, "Up");
			}else{
				mobileAction.FuncElementSwipeWhileNotFound(acntsListnew, verify_Acnt, 25, "down", true);
			}
						
			mobileAction.FuncClick(txtActivity, "Activity");
			mobileAction.verifyElementIsDisplayed(txtActivity, "Activity");
			mobileAction.verifyElementIsDisplayed(account, "Account Number Displayed");

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
	 * This method will verify the Account page and banking Header is present .
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verify_Banking_Header() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, account_Header);
			mobileAction.verifyElementIsDisplayed(txtAccount_Banking_header, "BANKING");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify the Account page and Investing Header is present
	 * .
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verify_Investing_Header()  {
		 Decorator();

			String from_Account = getTestdata("FromAccount");
			String verify_Acnt = "//android.widget.TextView[contains(@text,'" + from_Account + "')]";  

			String account_Value = "//XCUIElementTypeStaticText[contains(@label,'" + from_Account + "')]";
		try {
				
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String account_value = "//XCUIElementTypeStaticText[contains(@value,'" + from_Account + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
			} else {
				mobileAction.FuncElementSwipeWhileNotFound(acntsListnew, verify_Acnt, 25, "down", true);

			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify the Account page and Investing Header is present
	 * .
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verify_accounts_Header() {
		 Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, account_Header);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void veify_EW_WB_Functionality() {
		Decorator();
		try {
			mobileAction.verifyElement(txtAccount_Banking_header, "BANKING");
			Thread.sleep(1000);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))
				mobileAction.FuncClick(back_Btn, "Back button");
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(txtInvesting, "Investing");
			mobileAction.verifyElementIsPresent(txtInvesting_Header);
			mobileAction.verifyElement(txtWebBroker, "Go to WebBroker");
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
	 * This method will verify the Account page Header
	 * 
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyAccountsPage() {
		 Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "Accounts");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify the session expired after 10 mins
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

	public void verifyCreditAccountActivity()  {

		Decorator();

		String from_Account = getTestdata("FromAccount");
		String verify_Acnt = "//android.widget.TextView[contains(@text,'" + from_Account + "')]";  

		String account_Value = "//XCUIElementTypeStaticText[contains(@value,'" + from_Account + "')]";
		try {
			Thread.sleep(2000);
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "Accounts");
			//mobileAction.FunCnewSwipe(txtCredit, false, 2);
			//Thread.sleep(5000);

			// mobileAction.FuncSelectElementInTable(accountsPage_Table,
			// Firstpart, accountsSecondPart, from_account);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_Value, true, 30, "Up");
			}else{
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(verify_Acnt, true, 30, "Up");
			}
			mobileAction.waitForElementToVanish(progresssBar);

			mobileAction.FuncClick(txtActivity, "Activity");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.verifyElementIsDisplayed(txtNo_Activity, "No Activity");

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
	 * This method will select the account from the Accounts page
	 *
	 * @return void
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void selectAccount()  {
	 Decorator();

		String from_Account = getTestdata("FromAccount");
		String verify_Acnt = "//android.widget.TextView[contains(@text,'" + from_Account + "')]";  

		String account_Value = "//XCUIElementTypeStaticText[contains(@label,'" + from_Account + "')]";
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_Value, true, 30, "Up");
			} else {
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(verify_Acnt, true, 30, "Up");
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
	 * This method will navigate to home page
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
	public void NavigationToHomePage(){
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				
				Thread.sleep(5000);
				mobileAction.FuncClick(back_button, "<");
				
			} else {
				//For android doing nothing				
			}

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
			System.out.println("Account selected:" + CL.getTestDataInstance().getPrimaryAccount());
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
		
		
		mobileAction.FuncSwipeWhileElementNotFoundByxpath(accountXL, true,40, "up");
		mobileAction.waitForElementToVanished(progresssBar);
		

		}catch(Exception e){
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}



