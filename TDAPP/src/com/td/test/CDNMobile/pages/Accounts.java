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

	@iOSFindBy(xpath = "//*[@label='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Accounts']")
	private MobileElement txtMy_Account_Header;

	@iOSFindBy(xpath = "//*[@label='CREDIT']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1'and @text='Total']")
	private MobileElement txtCredit;

	@iOSFindBy(xpath = "//*[contains(@label,'$')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[text='$') and @resource-id='com.td:id/canTotal']")
	private MobileElement txtCan_account_total;

	@iOSFindBy(xpath = "//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up' and @index='0']")
	private MobileElement btnHome;

	@iOSFindBy(xpath = "//*[@label='Preferences']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Preferences']")
	private MobileElement txtPreferences;

	@iOSFindBy(xpath = "//*[@label='BANKING']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='BANKING']")
	private MobileElement txtAccount_Banking_header;

	@iOSFindBy(xpath = "//*[@label='INVESTING']")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/classificationTexView'
	// and @text='INVESTING']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Investing']")
	private MobileElement txtAccount_Investing_header;

	@iOSFindBy(xpath = "//*[contains@(label,'USD $')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[text='USD $'and @resource-id='com.td:id/usTotal')]")
	private MobileElement us_account_total;

	@iOSFindBy(xpath = "//*[@label='Back']")
	private MobileElement ios_back_button;

	@iOSFindBy(xpath = "//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement btnMenu;

	@iOSFindBy(xpath = "//*[@label='Investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='Investing']")
	private MobileElement txtInvesting;

	@iOSFindBy(xpath = "//*[@label='Investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title'and @text='Investing']")
	private MobileElement txtInvesting_Header;

	@iOSFindBy(xpath = "//*[@label='Go to WebBroker']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_launch_browser'and @text='Go to WebBroker']")
	private MobileElement txtWebBroker;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	private MobileElement progresssBar;

	@iOSFindBy(xpath = "//*[@label='Activity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='INVESTING']")
	private MobileElement txtActivity;

	@iOSFindBy(xpath = "//*[@label='Session Expired']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle' and @text='Session Expired']")
	private MobileElement txtSessionOut;

	@iOSFindBy(xpath = "//*[@label='No Activity to display in this account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='INVESTING']")
	private MobileElement txtNo_activity;

	String sessionOutIos = "//*[@label='Session Expired']";
	String sessionOutAndroid = "//android.widget.TextView[@resource-id='android:id/alertTitle' and @text='Session Expired']";

	String accountsPage_Table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
			+ "XCUIElementTypeOther[1]/XCUIElementTypeTable[1]";

	@iOSFindBy(xpath = "//*[contains(@label,'Summary')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/summaryTab' and @text='Summary']")
	private MobileElement summaryButton;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/current_balance']")
	private MobileElement current_balance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/account_desc']")
	private MobileElement account_desc;

	@iOSFindBy(xpath = "//*[contains(@label,'Account #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accountNumber']")
	private MobileElement account_no;

	@iOSFindBy(xpath = "//*[contains(@label,'Avaliable Balance')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/availableBalance']")
	private MobileElement available_balance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	private MobileElement currencyCheck;

	String from_account = getTestdata("FromAccount");
	String verify_Acnt = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='" + from_account
			+ "']";

	String account_value = "//*[contains(@label,'" + from_account + "')]";

	int i = 1;

	String Firstpart = "//XCUIElementTypeCell[";
	String accountsSecondPart = "]/XCUIElementTypeStaticText[2]";
	String Account_header = "My Accounts";
	String ios_Account_header = "Accounts";
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

			Thread.sleep(4000);
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, Account_header);

			// mobileAction.FuncSelectElementInTable(accountsPage_Table,
			// Firstpart, accountsSecondPart, from_account);
			mobileAction.waitForElementToVanish(progresssBar);
			Thread.sleep(4000);
			mobileAction.FuncClick(summaryButton, "Summary");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.verifyElementIsDisplayed(current_balance, "Current balance");
			mobileAction.verifyElementIsDisplayed(account_desc, "Account Description");
			mobileAction.verifyElementIsDisplayed(available_balance, "Available balance");
			mobileAction.verifyElementIsDisplayed(account_no, "Account No");
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
			mobileAction.FunCnewSwipe(txtCredit, false, 2);
			Thread.sleep(5000);
			String multiCurencyCheck = currencyCheck.getText();
			if (us_Account_value.contains(multiCurencyCheck)) {
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

			mobileAction.verifyElement(txtMy_Account_Header, Account_header);
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
			mobileAction.FuncClick(ios_back_button, "Back_Button");
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
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, Account_header);
			// mobileAction.FuncSelectElementInTable(accountsPage_Table,
			// Firstpart, accountsSecondPart, from_account);
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.FuncClick(txtActivity, "Activity");
			mobileAction.waitForElementToVanish(progresssBar);

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
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, Account_header);
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
			mobileAction.FunCnewSwipe(txtAccount_Investing_header, false, 4);
			mobileAction.verifyElementIsDisplayed(txtAccount_Investing_header, t_investing);

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

			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, Account_header);

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
			mobileAction.verifyElementIsDisplayed(txtNo_activity, "No Activity");

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
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(account, true);
			} else {
				MobileElement account = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(verify_Acnt));
				mobileAction.FunCSwipeandScroll(account, true);
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
