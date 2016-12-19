package com.td.CMOB.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Between_My_accounts extends _CommonPage {

	private static Between_My_accounts Between_My_accounts;

	String from_account = getTestdata("FromAccount", "UserIDs");

	String to_account = getTestdata("ToAccount", "UserIDs");

	String platforName = CL.getTestDataInstance().getMobilePlatForm();

	String progressBar = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']";

	String verify_to_acnt = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='" + to_account
			+ "']";

	int i = 1;
	String from_accounts_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + i + Secondpart;

	@iOSFindBy(xpath = "//*[contains(@label='This amount is either below the minimum or above the maximum for')")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement error_msg;

	// xpath("//*[@label='From Account, Select from account']")).click();
	@iOSFindBy(xpath = "//*[@label='From Account, Select from account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
	private MobileElement from_acnt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/second_amount_val']")
	private MobileElement amount_sent;

	@iOSFindBy(xpath = "//*[@label='To Account, Select to account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtToAccount' and @text='Select To Account']")
	private MobileElement to_acnt;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='-Amount']")
	@AndroidFindBy(id = "com.td:id/edtAmount")
	private MobileElement amount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/button_footer'and @text='Continue']")
	private MobileElement continue_transfer;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Finish Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'com.td:id/myaccounts_entry_btn_confirm'and @text='Finish Transfer']")
	private MobileElement finish_transfer;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_val;

	@iOSFindBy(xpath = "//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//*[@label='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='My Accounts']")
	private MobileElement my_accounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/description']")
	private List<MobileElement> last_transaction;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='CAD']")
	@AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.td:id/buttonCAD' and @text='CAD']")
	private MobileElement cad_button;

	@iOSFindBy(xpath = "//*[@label='USD']")
	@AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.td:id/buttonUSD' and @text='USD']")
	private MobileElement usd_button;

	@iOSFindBy(xpath = "//*[@label='OK']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='OK']")
	private MobileElement ok_button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/amount']")
	private List<MobileElement> amt_trnsfrd;

	@iOSFindBy(xpath = "//*[@label='Transfer successful']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement logout;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Logged Out']")
	private MobileElement logoutHeader;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntsList;

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/summaryContent']")
	private MobileElement acntsummaryList;

	@iOSFindBy(xpath = "//*[@label='Transfer successful']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Transfer Successful']")
	private MobileElement trnsfrSucssfl;

	String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
			+ from_account + "']";

	String select_to_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
			+ to_account + "']";

	String verify_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/accntDescrSum' and @text='"
			+ from_account + "']";

	String validate_message = "Withdrawals may impact your annual TFSA contribution limit.";

	@iOSFindBy(xpath = "//*[contains(@label,'Withdrawals may impact your annual TFSA contribution limit.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Withdrawals may impact your annual TFSA contribution limit.')]")
	private MobileElement verify_Message;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label='$U.S. MONEY MARKET ACCOUNT')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='TD BASIC BUSINESS PLAN']")
	private MobileElement other_Account;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'HIGH INTEREST TFSA SAVINGS ACCOUNT')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='HIGH INTEREST TFSA SAVINGS ACCOUNT']")
	private MobileElement tfsa_account;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	String tfsa_Account = "HIGH INTEREST TFSA SAVINGS ACCOUNT";

	@iOSFindBy(xpath = "//*[@label='Between My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Between My Accounts']")
	private MobileElement btw_Two_Accounts_Header;

	String error_txt = "This amount is either below the minimum or above the maximum foreign exchange limit. Please enter a different amount. (BQ15)";
	String ios_error_txt = "This amount is either below the minimum or above the maximum for";

	String ValueofAmount = getTestdata("Amount", "UserIDs");

	public synchronized static Between_My_accounts get() {
		if (Between_My_accounts == null) {
			Between_My_accounts = new Between_My_accounts();
		}
		return Between_My_accounts;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will transfer money from one account to another and check if
	 * it is successful.
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void transfer_between_my_accounts() throws Exception {

		System.out.println("Trial for Page factory class");
		Decorator();
		try {
			if (platforName.equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(from_acnt, "From Account");
				String from_accountNo = getTestdata("FromAccount", "UserIDs");

				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, from_accountNo);
				mobileAction.FuncClick(to_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount", "UserIDs");
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, to_accountNo);
				mobileAction.FuncClick(amount, "Amount");
				System.out.println("Amount has been selected");

				mobileAction.FuncSendKeys(amount, ValueofAmount);
				System.out.println(ValueofAmount);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(continue_transfer, "Continue");
				mobileAction.FuncClick(finish_transfer, "Finish");

				mobileAction.verifyElementIsDisplayed(trnsfrSucssfl, "Transfer Successful");
				System.out.println(CL.GetDriver().getPageSource());
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(my_accounts, "My Accounts");

			} else {
				mobileAction.FuncClick(from_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 3, "down", true);
				mobileAction.FuncClick(to_acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_acnt, 3, "down", true);
				mobileAction.FuncClick(amount, "Amount");

				mobileAction.FuncSendKeys(amount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(continue_transfer, "Continue");
				mobileAction.FuncClick(finish_transfer, "Finish");
				String conf_val = mobileAction.getText(confirmation_val);
				mobileAction.verifyElementIsDisplayed(trnsfrSucssfl, "Transfer Successful");
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(my_accounts, "My Accounts");
				mobileAction.FuncElementSwipeWhileNotFound(acntsummaryList, verify_from_acnt, 3, "down", true);
				mobileAction.verifyTextContains(last_transaction.get(0), conf_val);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will transfer money from Canadian account to US account and
	 * log out.
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
	public void canadianCash_To_USCash() throws Exception {
		System.out.println("Trial for Page factory class");
		Decorator();
		try {

			if (platforName.equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(from_acnt, "From Account");
				String accountNo = getTestdata("FromAccount", "UserIDs");
				System.out.println(accountNo);

				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, accountNo);
				mobileAction.FuncClick(to_acnt, "To Account");
				String to_accountNo = getTestdata("FromAccount", "UserIDs");
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, to_accountNo);
				mobileAction.FuncClick(amount, "Amount");

				mobileAction.FuncSendKeys(amount, ValueofAmount);
				mobileAction.FuncClick(done, "Done");
				System.out.println("Done button has been clicked");
				mobileAction.FuncClick(usd_button, "USD");
				System.out.println("USD button has been clicked");
				mobileAction.FuncClick(continue_transfer, "Continue");
				System.out.println("Continue button has been clicked");
				int timeout = Integer.valueOf(getTestdata("Timeout", "UserIDs"));
				mobileAction.waitForSeconds(timeout);
				mobileAction.FuncClick(finish_transfer, "Finish");
				mobileAction.verifyElementIsDisplayed(trnsfrSucssfl, "Transfer Successful");
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(logout, "Logout");
				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");

			} else {
				mobileAction.FuncClick(from_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 2, "down", true);
				mobileAction.FuncClick(to_acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_acnt, 2, "down", true);
				mobileAction.FuncClick(amount, "Amount");

				mobileAction.FuncSendKeys(amount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(usd_button, "USD");
				mobileAction.FuncClick(continue_transfer, "Continue");
				int timeout = Integer.valueOf(getTestdata("Timeout", "UserIDs"));
				mobileAction.waitForSeconds(timeout);
				mobileAction.FuncClick(finish_transfer, "Finish");
				mobileAction.verifyElementIsDisplayed(trnsfrSucssfl, "Transfer Successful");
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(logout, "Logout");
				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will verify Mobile Rate Expiry on SmartPhones and Tablets
	 * when amount greater than $35,000 USD
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void mobile_expiry_rate() throws Exception {
		System.out.println("Trial for Page factory class");
		Decorator();
		try {

			mobileAction.FuncClick(from_acnt, "From Account");
			System.out.println("From Account" + from_account);

			if (platforName.equalsIgnoreCase("ios")) {

				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, from_account);
				System.out.println("Clicked on from account");

				mobileAction.FuncClick(to_acnt, "To Account");
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, to_account);
			} else {

				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 3, "down", true);
				mobileAction.FuncClick(to_acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_acnt, 3, "down", true);
			}

			mobileAction.FuncClick(amount, "Amount");
			mobileAction.FuncSendKeys(amount, ValueofAmount);

			if (platforName.equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(done, "Done");
			} else {
				mobileAction.FuncClickBackButton();
			}

			mobileAction.FuncClick(continue_transfer, "Continue");
			int timeout = Integer.valueOf(getTestdata("Timeout", "UserIDs"));
			mobileAction.FuncWaitForElement(ok_button, timeout, "Ok");
			mobileAction.FuncClick(ok_button, "OK");
			mobileAction.FuncWaitForElement(ok_button, timeout, "Ok");
			mobileAction.FuncClick(ok_button, "OK");
			mobileAction.FuncClick(finish_transfer, "Finish");
			String conf_val = mobileAction.getText(confirmation_val);
			mobileAction.FuncClick(menu, "Menu");
			mobileAction.FuncClick(my_accounts, "My Accounts");
			mobileAction.FuncElementSwipeWhileNotFound(acntsummaryList, verify_from_acnt, 3, "down", true);
			mobileAction.verifyTextContains(last_transaction.get(0), conf_val);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will transfer from LIRA(S) to US LIRA(U) account - Amount
	 * less than $1 CAD or USD
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void lira_US_to_UU() throws Exception {

		Decorator();
		try {

			if (platforName.equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(from_acnt, "From Account");
				String accountNo = getTestdata("FromAccount", "UserIDs");

				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, accountNo);
				mobileAction.FuncClick(amount, "Amount");

				mobileAction.FuncSendKeys(amount, ValueofAmount);

				mobileAction.FuncClick(usd_button, "USD");

				mobileAction.verifyElement(error_msg, ios_error_txt);

				// System.out.println(CL.GetDriver().getPageSource());
				// mobileAction.FuncElementSwipeWhileNotFound(swipeWithinElement,
				// xpathOfElement, maxSwipes, direction, clickOnElement);
			} else {
				mobileAction.FuncClick(from_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 5, "down", true);
				mobileAction.FuncClick(amount, "Amount");

				mobileAction.FuncSendKeys(amount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(usd_button, "USD");
				mobileAction.FuncClick(continue_transfer, "Continue");
				String error_actual = mobileAction.getText(error_msg);
				mobileAction.verifyTextEquality(error_actual, error_txt);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will transfer from Canadian Account to US account and
	 * validate Withdrawals may impact your annual TFSA contribution limit
	 * message
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void transferBtw_tfsa_other_Acct() throws Exception {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(btw_Two_Accounts_Header, "Between My Accounts header");

			System.out.println(btw_Two_Accounts_Header.isDisplayed());
			System.out.println(CL.GetDriver().getPageSource());
			mobileAction.FuncClick(from_acnt, "From_Account");
			// System.out.println(CL.GetDriver().getPageSource());

			// mobileAction.FuncScrollToText(tfsa_Account);
			// mobileAction.FuncClick(tfsa_Account_Click, "TFSA_ACCOUNT_CLICK");
			mobileAction.FunCSwipeandScroll(tfsa_account);
			mobileAction.FuncClick(to_acnt, "To_Account");
			mobileAction.FuncClick(other_Account, "Other_Account");
			System.out.println("Verified");
			mobileAction.verifyElement(verify_Message, validate_message);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will transfer from Canadian Account to US account and
	 * validate Withdrawals may impact your annual TFSA contribution limit
	 * message
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void transfer_NotSupported() throws Exception {
		Decorator();
		String toAcc = getTestdata("ToAccount", "UserIDs");
		String toAccount = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='" + toAcc
				+ "']";
		boolean flag = false;
		try {
			if (platforName.equalsIgnoreCase("ios")) {
				String accounts = getTestdata("FromAccount", "UserIDs");
				String accountsList[] = accounts.split(",");

				for (int i = 0; i < accountsList.length && flag == false; i++) {
					mobileAction.FuncClick(from_acnt, "From Account");
					System.out.println(accountsList[i]);

					mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, accountsList[i]);
					System.out.println("Account has been selected");
					mobileAction.FuncClick(to_acnt, "To Account");
					try {
						mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, toAcc);
						flag = true;

					} catch (Exception e) {
						flag = false;
					}
				}
			} else {

				String accounts = getTestdata("FromAccount", "UserIDs");
				String accountsList[] = accounts.split(",");
				System.out.println("List of Accounts:" + accountsList);
				for (int i = 0; i < accountsList.length && flag == false; i++) {
					mobileAction.FuncClick(from_acnt, "Select From Account");
					String accNo = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
							+ accountsList[i] + "']";
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, accNo, 13, "Down", true);
					mobileAction.FuncClick(to_acnt, "To Account");
					try {
						mobileAction.FuncElementSwipeWhileNotFound(acntsList, toAccount, 12, "Down", false);
						flag = true;

					} catch (Exception e) {
						flag = false;
					}
				}
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			e.printStackTrace();
		}
	}

	public void exchange_rate_expired() throws Exception {
		System.out.println("Trial for Page factory class");
		Decorator();
		try {

			mobileAction.FuncClick(from_acnt, "From Account");

			if (platforName.equalsIgnoreCase("ios")) {
				String accountNo = getTestdata("FromAccount", "UserIDs");
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, accountNo);

				mobileAction.FuncClick(to_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount", "UserIDs");
				System.out.println(to_accountNo);
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, to_accountNo);
				mobileAction.FuncClick(cad_button, "CAD");
				mobileAction.FuncClick(usd_button, "USD");
				mobileAction.FuncClick(amount, "Amount");
				String ValueofAmount = getTestdata("Amount", "UserIDs");
				mobileAction.FuncSendKeys(amount, ValueofAmount);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(continue_transfer, "Continue");
				mobileAction.FuncWaitForElement(ok_button, 120, "Ok");
				Thread.sleep(105000);
				mobileAction.FuncClick(finish_transfer, "Finish");

				String conf_val = mobileAction.getText(confirmation_val);
				String[] confmVal = conf_val.split(":");
				String confirmationVal = confmVal[1];

				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(my_accounts, "My Accounts");
				mobileAction.FuncClick(done, "done");

			} else {

				mobileAction.FuncClick(from_acnt, "From Account");
				// mobileAction.FuncClick(select_usd_acnt, "Selected USD
				// Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 5, "down", true);
				mobileAction.waitForElementToDisappear(select_from_acnt);
				mobileAction.FuncClick(to_acnt, "To Account");
				// mobileAction.FuncClick(select_cad_acnt, "Selected CAD
				// Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_acnt, 2, "down", true);
				mobileAction.waitForElementToDisappear(select_to_acnt);

				mobileAction.FuncClick(cad_button, "CAD");
				mobileAction.FuncClick(usd_button, "USD");
				mobileAction.FuncClick(amount, "Amount");
				String ValueofAmount = getTestdata("Amount", "UserIDs");
				mobileAction.FuncSendKeys(amount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(continue_transfer, "Continue");
				mobileAction.FuncWaitForElement(ok_button, 120, "Ok");
				mobileAction.FuncClick(ok_button, "OK");
				Thread.sleep(105000);
				mobileAction.FuncClick(finish_transfer, "Finish");

				String conf_val = mobileAction.getText(confirmation_val);

				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(my_accounts, "My Accounts");
				mobileAction.waitForElementToDisappear(progressBar);

				mobileAction.FuncElementSwipeWhileNotFound(acntsummaryList, verify_from_acnt, 1, "down", true);
				mobileAction.verifyTextContains(last_transaction.get(0), conf_val);

				String amt_sent = mobileAction.getText(amt_trnsfrd.get(0));
				if (mobileAction.verifySymbol(amt_sent, "-")) {
					String amount[] = amt_sent.split("$");

					for (int i = 0; i < amount.length; i++)
						System.out.println("first=" + amount[i]);
					String org_amt[] = amount[1].split(".");

					for (int i = 0; i < org_amt.length; i++)
						System.out.println("second=" + org_amt[i]);
					mobileAction.verifyTextEquality(org_amt[0], ValueofAmount);
				}
				mobileAction.FuncClickBackButton();
				// mobileAction.FuncClick(verify_cad_acnt, "To Account
				// Selected");
				mobileAction.FuncElementSwipeWhileNotFound(acntsummaryList, verify_to_acnt, 1, "down", true);
				String amt_recvd = mobileAction.getText(amt_trnsfrd.get(0));
				String amt_sent_after_exchange = mobileAction.getText(amount_sent);
				mobileAction.verifyTextEquality(amt_recvd, amt_sent_after_exchange);
				mobileAction.verifyTextContains(last_transaction.get(1), conf_val);
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(logout, "Logout");

				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
