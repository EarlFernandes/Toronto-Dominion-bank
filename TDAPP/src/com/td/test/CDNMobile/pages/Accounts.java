package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Accounts extends _CommonPage {

	private static Accounts MyAccounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntBalanceSum']")
	private MobileElement txtBalance;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
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
	@AndroidFindBy(xpath = "//android.widget.TextView[(@resource-id='com.td:id/navText' or @resource-id='com.td:id/textview_flyout_menu_item') and @text='Profile & Settings']")
	private MobileElement txtPreferences;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='BANKING']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='BANKING']")
	private MobileElement txtAccount_Banking_header;

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
	private MobileElement acntsListnew;

	@iOSFindBy(xpath = "//*[@name='QUICKLINKS_TRANSFER']/../preceding-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/account_desc']")
	private MobileElement account;

	String sessionOutIos = "//XCUIElementTypeStaticText[@label='Session Expired']";
	String sessionOutAndroid = "//android.widget.TextView[@resource-id='android:id/alertTitle' and @text='Session Expired']";

	String accountsPage_Table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
			+ "XCUIElementTypeOther[1]/XCUIElementTypeTable[1]";

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/current_balance']")
	private MobileElement current_Balance;

	@iOSFindBy(accessibility = "ACCOUNT_DETAIL_SUMMARY_ACCOUNT")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/account_desc']")
	private MobileElement account_Desc;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Summary')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/summaryTab' and @text='Summary']")
	private MobileElement summaryBtn;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Account #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accountNumber']")
	private MobileElement account_Num;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	@iOSFindBy(accessibility = "ACCOUNT_DETAIL_SUMMARY_AVAILABLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/availableBalance']")
	private MobileElement available_Balance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
	private MobileElement currencyCheck;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	private MobileElement investingHeader;

	@iOSFindBy(accessibility = "CROSSSELL_VIEWTITLE")
	private MobileElement openADirectInvestingAccount;

	@iOSFindBy(accessibility = "CROSSSELL_GOTO")
	private MobileElement goToWebBroker;

	@iOSFindBy(accessibility = "CROSSSELL_CALL")
	private MobileElement callNumber;

	@iOSFindBy(accessibility = "CROSSSELL_MESSAGE")
	private MobileElement messageBody;

	@iOSFindBy(xpath = "//*[@label='Retour' or @label='Back']")
	private MobileElement back_Btn;

	@iOSFindBy(xpath = "//*[@name='ACCOUNT_SUMMARY_BALANCE_FOOTER_TITLE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/footer_text']")
	private MobileElement foot_text;

	private MobileElement total_accounts_and_cad;
	private MobileElement total_accounts_and_usd;

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
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

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
			System.out.println("From Account:" + from_Account);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				String account_value = "//XCUIElementTypeStaticText[contains(@value,'" + from_Account + "')]";

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");

			} else {
				mobileAction.FuncElementSwipeWhileNotFound(acntsListnew, verify_Acnt, 25, "down", true);
			}

			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(summaryBtn, "Summary");
			// mobileAction.verifyElementIsDisplayed(current_Balance, "Current
			// balance");
			mobileAction.verifyElementIsDisplayed(account_Desc, "Account Description");
			mobileAction.verifyElementIsDisplayed(available_Balance, "Available balance");

			CL.GetReporting().FuncReport("PASS", "Account Desc, Available Balance is verified");

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
	public void verifyAccountPage() {
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
			mobileAction.ClickBackButton();
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

		try {
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "Accounts");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String account_value = "//XCUIElementTypeStaticText[contains(@value,'" + from_Account + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 30, "Up");
			} else {
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
	public void verify_Investing_Header() {
		Decorator();

		String from_Account = getTestdata("FromAccount");
		String verify_Acnt = "//android.widget.TextView[contains(@text,'" + from_Account + "')]";

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

			mobileAction.waitProgressBarVanish();
			String myAccountText;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				myAccountText = mobileAction.getAppString("str_My_Accounts");
			} else {
				myAccountText = mobileAction.getAppString("accountsPageHeader");
			}
			System.out.println("myAccountText:" + myAccountText);
			mobileAction.verifyTextEquality(mobileAction.getValue(txtMy_Account_Header), myAccountText);

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
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
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))
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

	public void verifyCreditAccountActivity() {

		Decorator();

		String from_Account = getTestdata("FromAccount");
		String verify_Acnt = "//android.widget.TextView[contains(@text,'" + from_Account + "')]";

		String account_Value = "//XCUIElementTypeStaticText[contains(@value,'" + from_Account + "')]";
		try {
			Thread.sleep(2000);
			mobileAction.verifyElementIsDisplayed(txtMy_Account_Header, "Accounts");
			// mobileAction.FunCnewSwipe(txtCredit, false, 2);
			// Thread.sleep(5000);

			// mobileAction.FuncSelectElementInTable(accountsPage_Table,
			// Firstpart, accountsSecondPart, from_account);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_Value, true, 30, "Up");
			} else {
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(verify_Acnt, true, 30, "Up");
			}
			mobileAction.waitProgressBarVanish();

			mobileAction.FuncClick(txtActivity, "Activity");
			mobileAction.waitProgressBarVanish();
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

	public void selectAccount() {
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
	public void NavigationToHomePage() {
		Decorator();
		try {
			// mobileAction.waitForElementToVanish(progressBar);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.ClickBackButton();
			} else {
				// For android doing nothing
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/***
	 * This method will click the account from the Accounts page
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

	public void selectAccountInAccountSheet() {

		Decorator();
		try {

			System.out.println("Account selected:" + CL.getTestDataInstance().getPrimaryAccount());
			String accountXL = "//*[contains(@text,'" + CL.getTestDataInstance().getPrimaryAccount()
					+ "') or contains(@label,'" + CL.getTestDataInstance().getPrimaryAccount() + "')  ]";

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(accountXL, true, 40, "up");
			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void SelectAccountUsingAccountNameAndAccountNum() {
		Decorator();
		try {
			String from_Account = getTestdata("FromAccount");

			String Acnt_Description = "";
			System.out.println("From Account:" + from_Account);
			String from_Account_des, from_Account_num;
			from_Account_num = mobileAction.FuncGetValByRegx(from_Account, "\\d+");
			from_Account_des = from_Account.replaceAll(from_Account_num, "").trim();

			if (from_Account_num.isEmpty()) {
				System.out.println("Failed:Account number is NOT configured, account cannot be selected");
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}

			String[] from_Account_des_option = from_Account_des.split("\\|");

			int lengthOfArray = from_Account_des_option.length;

			if (lengthOfArray == 0) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					Acnt_Description = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
							+ from_Account_num + "']";
				} else {
					Acnt_Description = "//*[@label='" + from_Account_num + "']";
				}
			} else {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					Acnt_Description = "//android.widget.TextView[@text='";
					for (int i = 0; i < lengthOfArray; i++) {
						Acnt_Description = Acnt_Description + from_Account_des_option[i].trim() + "'";
						if (i < lengthOfArray - 1) {
							Acnt_Description = Acnt_Description + " or @text='";
						}
					}
					Acnt_Description = Acnt_Description + "]/../../android.widget.TextView[@text='" + from_Account_num
							+ "']";
				} else {
					Acnt_Description = "//XCUIElementTypeStaticText[@label='";
					for (int i = 0; i < lengthOfArray; i++) {
						Acnt_Description = Acnt_Description + from_Account_des_option[i].trim() + "'";
						if (i < lengthOfArray - 1) {
							Acnt_Description = Acnt_Description + " or @label='";
						}
					}
					Acnt_Description = Acnt_Description + "]/../XCUIElementTypeStaticText[@label='" + from_Account_num
							+ "']";
				}
			}

			System.out.println("Acnt_Description:" + Acnt_Description);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(Acnt_Description, true, 100, "up", true);
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyNoMutualFundAccounts() {
		Decorator();
		try {

			List<MobileElement> accountList = null;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				accountList = ((MobileDriver) CL.GetDriver())
						.findElementsByXPath("//android.widget.TextView[@resource-id='com.td:id/accntDescrSum']");
			} else {
				accountList = ((MobileDriver) CL.GetDriver())
						.findElementsByXPath("//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]");
			}
			int count = 20;
			while (true) {
				int size = accountList.size();
				System.out.println("Account size:" + size);
				for (int i = 0; i < size; i++) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
						if (!mobileAction.verifyElementIsPresent(accountList.get(i))) {
							mobileAction.FuncSwipeWhileElementNotFound(accountList.get(i), false, 2, "up");
							accountList = ((MobileDriver) CL.GetDriver()).findElementsByXPath(
									"//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]");
						}
					}
					String accounttext = mobileAction.getValue(accountList.get(i));
					System.out.println("Account " + (i + 1) + ":" + accounttext);
					if (accounttext.toLowerCase().contains("mutual fund") || accounttext.contains("FONDS COMM.")) {
						mobileAction.Report_Fail("Mutual fund account found");
						return;
					}
				}
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					if (!mobileAction.verifyElementIsPresent(foot_text)) {
						mobileAction.FuncSwipeOnce("up");
						count--;
						accountList = ((MobileDriver) CL.GetDriver()).findElementsByXPath(
								"//android.widget.TextView[@resource-id='com.td:id/accntDescrSum']");
					} else {
						break;
					}
				} else {
					// For ios, accountlist will list all of the account, don't
					// need to swipe to the bottom
					break;
				}
				if (count == 0) {
					break;
				}
			}
			mobileAction.Report_Pass_Verified("No mutual funds found for closed account");

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify text within elements for open a new account page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyOpenNewAccountTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(investingHeader.getText(), mobileAction.getAppString("str_Banking"));
				mobileAction.verifyTextEquality(openADirectInvestingAccount.getText(),
						mobileAction.getAppString("str_banking_cross_sell_message"));
				mobileAction.verifyTextEquality(messageBody.getText(),
						mobileAction.getAppString("str_banking_cross_sell_message_detail"));
				mobileAction.verifyTextEquality(goToWebBroker.getText(),
						mobileAction.getAppString("securityQuestionMFASetupRequiredButtonGoToEW"));
				mobileAction.verifyTextContains(callNumber, mobileAction.getAppString("call"));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_Banking") + "']",
						"Banking title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("str_banking_cross_sell_message") + "']",
						"Open a bank account");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text=\""
								+ mobileAction.getAppString("str_banking_cross_sell_message_detail") + "\"]",
						"Open a bank account msg body");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[contains(@text, '"
								+ mobileAction.getAppString("str_call_phone").replace(" %1$s", "") + "')]",
						"call 1-800");
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for open a new account page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyCAD_USD_AccountsInTotal() {
		Decorator();
		try {
			String total_xpath = "";
			String totalStr = getTextInCurrentLocale(StringArray.ARRAY_ACCOUNT_TOTAL);
			String total_Account_value_cad = "";
			String total_Account_value_usd = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				total_xpath = "//*[@label='" + totalStr.toUpperCase() + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(total_xpath, false, 20, "up");

				List<MobileElement> total_List = CL.GetAppiumDriver().findElements(
						By.xpath("//*[@label='" + totalStr.toUpperCase() + "']/../XCUIElementTypeStaticText"));
				String TotalAccountValue = "";
				boolean isUSDFound = false;
				for (int i = 0; i < total_List.size(); i++) {
					TotalAccountValue = mobileAction.getValue(total_List.get(i));
					if (TotalAccountValue.contains("USD")) {
						System.out.println("USD account in TOTAL was found");
						isUSDFound = true;
						break;
					}
				}

				if (isUSDFound) {
					total_Account_value_usd = mobileAction.FuncGetValByRegx(TotalAccountValue, "USD *.*");
					total_Account_value_cad = TotalAccountValue.replace(total_Account_value_usd, "").trim();
				} else {
					mobileAction.Report_Fail("Failed to find USD account in Total");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					return;
				}

			} else {

				total_xpath = "//android.widget.TextView[@text='" + totalStr + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(total_xpath, false, 20, "up");

				total_accounts_and_cad = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + totalStr
								+ "']/../following-sibling::android.widget.LinearLayout/*[@resource-id='com.td:id/canTotal']",
						"Total Account CAD");
				total_accounts_and_usd = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + totalStr
								+ "']/../following-sibling::android.widget.LinearLayout/*[@resource-id='com.td:id/usTotal']",
						"Total Account USD");
				total_Account_value_cad = mobileAction.getValue(total_accounts_and_cad);
				total_Account_value_usd = mobileAction.getValue(total_accounts_and_usd);
			}
			System.out.println("total_Account_value_cad:" + total_Account_value_cad);
			System.out.println("total_Account_value_usd:" + total_Account_value_usd);

			if (!total_Account_value_cad.isEmpty() && !total_Account_value_usd.isEmpty()) {
				mobileAction.Report_Pass_Verified("Total account for both CAD and USD");
			} else if (total_Account_value_cad.isEmpty()) {
				mobileAction.Report_Fail("Total account CAD is empty");
			} else {
				mobileAction.Report_Fail("Total account USD is empty");
			}

		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}