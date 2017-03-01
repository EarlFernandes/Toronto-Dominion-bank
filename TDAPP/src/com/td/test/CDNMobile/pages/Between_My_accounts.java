package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Between_My_accounts extends _CommonPage {

	private static Between_My_accounts Between_My_accounts;

	public synchronized static Between_My_accounts get() {
		if (Between_My_accounts == null) {
			Between_My_accounts = new Between_My_accounts();
		}
		return Between_My_accounts;
	}
    
	@iOSFindBy(xpath = "//*[contains(@label,'This amount is either below the minimum or above the maximum foreign exchange limit. "
			+ "Please enter a different amount. (BQ15)')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement error_msg;

	@iOSFindBy(xpath = "//*[contains(@label,'From Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
	private MobileElement txtFrom_acnt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/second_amount_val']")
	private MobileElement amount_sent;

	@iOSFindBy(xpath = "//*[@label='To Account, Select to account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtToAccount' and @text='Select To Account']")
	private MobileElement txtTo_acnt;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/edtAmount']")
	private MobileElement txtAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/button_footer'and @text='Continue']")
	private MobileElement btnContinue_transfer;

	@iOSFindBy(xpath = "//*[@label='Finish Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'com.td:id/myaccounts_entry_btn_confirm'and @text='Finish Transfer']")
	private MobileElement btnFinish_transfer;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_val;

	@iOSFindBy(xpath = "//*[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement btnMenu;

	@iOSFindBy(xpath = "//*[@label='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='My Accounts']")
	private MobileElement txtMy_accounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/description']")
	private List<MobileElement> last_transaction_list;

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

	@iOSFindBy(xpath = "//*[@label='Logout']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement btnLogout;

	@iOSFindBy(xpath = "//*[@label='Logged Out']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Logged Out']")
	private MobileElement logoutHeader;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntsList;

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/summaryContent']")
	private MobileElement acntsummaryList;

	@iOSFindBy(xpath = "//*[@label='Transfer successful']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Transfer Successful']")
	private MobileElement txtTrnsfrSucssfl;

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

	@iOSFindBy(xpath ="//*[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_button; 

	@iOSFindBy(xpath = "//*[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/myaccounts_entry_btn_cancel' and @text='Cancel']")
	private MobileElement cancelBtn;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement txtProgresssBar;

	@iOSFindBy(xpath = "//*[@label='Confirm']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Confirm']")
	private MobileElement txtConfirmHeader;

	@iOSFindBy(xpath = "//*[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement txtTransfers_header;

	@iOSFindBy(xpath = "//*[@label='Quick Access']")
	@AndroidFindBy(xpath = "//*[@resource-id = 'android:id/action_bar_title']")
	private MobileElement btnHome;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']")
	private MobileElement homeBtn;

	@iOSFindBy(xpath = "//*[@label='CANCEL']")
	private MobileElement btnCancel;

	@iOSFindBy(xpath = "//*[contains(@label,'When making deposits to this account, please ensure that you are')]")
	private MobileElement TDCT_TFSAMessage;

	@iOSFindBy(xpath = "//*[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'android:id/action_bar_title'and @text='Receipt']")
	private MobileElement receiptHeader;


	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Finish Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'com.td:id/myaccounts_entry_btn_confirm'and @text='Finish Transfer']")
	private MobileElement finish_transfer;
	
	@iOSFindBy(xpath = "//*[@name='-From Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/from_account_bal']")
	private MobileElement fromAccountValue;
	

	@iOSFindBy(xpath = "//*[@name='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/account_desc']")
	private MobileElement fromAccountNumber;
	
	@iOSFindBy(xpath = "//*[@name='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/current_balance']")
	private MobileElement fromAccountbal;
	
	@iOSFindBy(xpath = "//*[@name='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/account_desc']")
	private MobileElement toAccountNumber;
	
	@iOSFindBy(xpath = "//*[@name='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/current_balance']")
	private MobileElement toAccountbal;

	@iOSFindBy(xpath = "//*[@name='-To Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/to_account_bal']")
	private MobileElement ToAccountValue;

	@iOSFindBy(xpath = "//*[@name='-Detail']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/confirmation_val']")
	private MobileElement cnfrDetail;

	@iOSFindBy(xpath = "//*[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/amount_val']")
	private MobileElement amountValue;

	@iOSFindBy(xpath = "//*[@name='-Exchange Rate']")
	private MobileElement exchangeRate;

	@iOSFindBy(xpath = "//*[@name='MAKE ANOTHER TRANSFER']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/transfers_make_another' and @text='MAKE ANOTHER TRANSFER']")
	private MobileElement makeAnthTran_button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/button_footer' and @text='Continue']")
	private MobileElement continue_transfer;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='-Amount']")
	@AndroidFindBy(id = "com.td:id/edtAmount")
	private MobileElement amount;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progresssBar;

	@iOSFindBy(xpath = "//*[contains(@label,'To Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtToAccount' and @text='Select To Account']")
	private MobileElement to_acnt;

	String tfsa_Account = "HIGH INTEREST TFSA SAVINGS ACCOUNT";

	@iOSFindBy(xpath = "//*[@label='Between My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Between My Accounts']")
	private MobileElement btw_My_Accounts_Header;

	String error_txt = "This amount is either below the minimum or above the maximum foreign exchange limit. Please enter a different amount. (BQ15)";

	String accountsPage_Table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/"
			+ "XCUIElementTypeOther[1]/XCUIElementTypeTable[1]";
	String ValueofAmount = getTestdata("Amount");
	String from_account = getTestdata("FromAccount");

	String to_account = getTestdata("ToAccount");

	String progressBar = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']";

	String verify_to_acnt = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='" + to_account
			+ "']";
	int i = 1;
	String from_accounts_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";

	String Finalpart = Firstpart + i + Secondpart;

	String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
			+ from_account + "']";

	String select_to_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
			+ to_account + "']";

	String verify_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
			+ from_account + "']";

	String validate_message = "Withdrawals may impact your annual TFSA contribution limit.";
	String iosFromAccount = "//*[contains(@label,'" + from_account + "')]";

	String iosToAccount = "//*[contains(@label,'" + to_account + "')]";

	String accountsSecondPart = "]/XCUIElementTypeStaticText[2]";
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	private MobileElement activityConfText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2] ")
	private MobileElement lastTransacAmt;

	@iOSFindBy(xpath = "//*[contains(@label,'From Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount']")
	private MobileElement from_acnt;
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc']")
	private MobileElement fromAccountName;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountBalance']")
	private MobileElement fromAccountBalance;
	
	String select_fromaccountvalue ="//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='" + from_account+ "']";
	
	String select_toaccountvalue ="//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"+ to_account+ "']";
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
	@AndroidFindBy(xpath = "")
	private MobileElement accountVal;
	
	public void perFormTransfer() throws Exception {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_accountNo = getTestdata("FromAccount");
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, from_accountNo);
				mobileAction.FuncClick(txtTo_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, to_accountNo);
			} else {
				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 10, "down", true);
				mobileAction.FuncClick(txtTo_acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_acnt, 10, "down", true);
			}

			mobileAction.FuncClick(txtAmount, "Amount");
			mobileAction.FuncSendKeys(txtAmount, ValueofAmount);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(done, "Done");
			} else {
				mobileAction.FuncHideKeyboard();
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {

		}

	}

	/**
	 * This method will give warning message when TDCT to TFSA Account is
	 * selected
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

	public void anyAccount_TDCTTFSA_Message() throws Exception {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_accountNo = getTestdata("FromAccount");

				String account_value = "//*[contains(@label,'" + from_accountNo + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
				mobileAction.FuncClick(txtTo_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");

				String toAccount_value = "//*[contains(@label,'" + to_accountNo + "')]";
				MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(toAccount_value));
				mobileAction.FunCSwipeandScroll(toAccountval, true);
				mobileAction.verifyElementIsDisplayed(TDCT_TFSAMessage,
						"When making deposits to this account, please ensure that you are");

			} else {

			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will verify whether the TDCT TFSA Account is present for the
	 * selected CAD TFSA(J) Account
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

	public void CADTFSA_TDCTTFSA() throws Exception {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_accountNo = getTestdata("FromAccount");
				String account_value = "//*[contains(@label,'" + from_accountNo + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);

				mobileAction.FuncClick(txtTo_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");
				String toAccount_value = "//*[contains(@label,'" + to_accountNo + "')]";
				MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(toAccount_value));
				mobileAction.FunCSwipeandScroll(toAccountval, false);
				mobileAction.FuncClick(btnCancel, "Cancel");

			} else {

			}
		} catch (Exception e) {
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

		Decorator();
		try {
			perFormTransfer();
			mobileAction.FuncClick(usd_button, "USD");
			mobileAction.FuncClick(btnContinue_transfer, "Continue");
			Thread.sleep(105000);
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.waitForElementToVanish(txtProgresssBar);
			}
			mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(btnLogout, "Logout");
			mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void CanadianToUS() throws Exception {
		Decorator();
		try {
			perFormTransfer();
			mobileAction.FuncClick(btnContinue_transfer, "Continue");
			/*int timeout = Integer.valueOf(getTestdata("Timeout"));
			int Sndtimeout = Integer.valueOf(getTestdata("SecondTimeout"));
			mobileAction.FuncWaitForElement(ok_button, timeout, "Ok");
			mobileAction.FuncClick(ok_button, "OK");
			mobileAction.FuncWaitForElement(ok_button, Sndtimeout, "Ok");
			mobileAction.FuncClick(ok_button, "OK");*/
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.waitForElementToVanish(txtProgresssBar);
			}
			mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(btnLogout, "Logout");
			mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void continueButton() {
		Decorator();
		try {
			mobileAction.FuncClick(btnContinue_transfer, "Continue");
		} catch (NoSuchElementException | InterruptedException | IOException e) {

		}

	}

	private void Decorator() {
		PageFactory.initElements(new AppiumFieldDecorator((CL.GetDriver()), new TimeOutDuration(10, TimeUnit.SECONDS)),
				this);

	}

	public void exchange_rate_expired() throws Exception {
		Decorator();
		try {

			mobileAction.FuncClick(txtFrom_acnt, "From Account");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String accountNo = getTestdata("FromAccount");
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, accountNo);

				mobileAction.FuncClick(txtTo_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, to_accountNo);
				mobileAction.FuncClick(usd_button, "USD");
				mobileAction.FuncClick(txtAmount, "Amount");
				String ValueofAmount = getTestdata("Amount");
				mobileAction.FuncSendKeys(txtAmount, ValueofAmount);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(btnContinue_transfer, "Continue");
				mobileAction.waitForElementToVanish(txtProgresssBar);
				mobileAction.FuncWaitForElement(ok_button, 120, "Ok");
				mobileAction.FuncClick(ok_button, "OK");
				Thread.sleep(105000);
				mobileAction.FuncClick(btnFinish_transfer, "Finish");
				mobileAction.waitForElementToVanish(txtProgresssBar);

				String conf_val = mobileAction.getText(confirmation_val);
				String[] confmVal = conf_val.split(":");
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(txtMy_accounts, "My Accounts");
				mobileAction.waitForElementToDisappear(progressBar);
				mobileAction.FuncSelectElementInTable(accountsPage_Table, Firstpart, Secondpart, accountNo);
				mobileAction.verifyElementTextContains(activityConfText, confmVal[1].trim());
				String amt_sent = lastTransacAmt.getAttribute("label");
				if (mobileAction.verifySymbol(amt_sent, "-")) {
					String amount[] = amt_sent.split("-");
					mobileAction.verifyTextEquality(amount[1], ValueofAmount);
				}
				mobileAction.FuncClick(back_button, "Back");
				mobileAction.FuncSelectElementInTable(accountsPage_Table, Firstpart, Secondpart, to_accountNo);
				String amt_recvd = lastTransacAmt.getAttribute("label");
				String amt_sent_after_exchange = mobileAction.getText(amount_sent);
				mobileAction.verifyTextEquality(amt_recvd, amt_sent_after_exchange);
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(btnLogout, "Logout");
				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
			} else {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 5, "down", true);
				mobileAction.waitForElementToDisappear(select_from_acnt);
				mobileAction.FuncClick(txtTo_acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_acnt, 2, "down", true);
				mobileAction.waitForElementToDisappear(select_to_acnt);

				mobileAction.FuncClick(cad_button, "CAD");
				mobileAction.FuncClick(usd_button, "USD");
				mobileAction.FuncClick(txtAmount, "Amount");
				String ValueofAmount = getTestdata("Amount");
				mobileAction.FuncSendKeys(txtAmount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(btnContinue_transfer, "Continue");
				mobileAction.FuncWaitForElement(ok_button, 120, "Ok");
				mobileAction.FuncClick(ok_button, "OK");
				Thread.sleep(105000);
				mobileAction.FuncClick(btnFinish_transfer, "Finish");

				String conf_val = mobileAction.getText(confirmation_val);

				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(txtMy_accounts, "My Accounts");
				mobileAction.waitForElementToDisappear(progressBar);

				mobileAction.FuncElementSwipeWhileNotFound(acntsummaryList, verify_from_acnt, 1, "down", true);
				mobileAction.verifyTextContains(last_transaction_list.get(0), conf_val);

				String amt_sent = mobileAction.getText(amt_trnsfrd.get(0));
				if (mobileAction.verifySymbol(amt_sent, "-")) {
					String amount[] = amt_sent.split("$");

					String org_amt[] = amount[1].split(".");

					for (int i = 0; i < org_amt.length; i++)
						mobileAction.verifyTextEquality(org_amt[0], ValueofAmount);
				}
				mobileAction.FuncClickBackButton();
				;
				mobileAction.FuncElementSwipeWhileNotFound(acntsummaryList, verify_to_acnt, 1, "down", true);
				String amt_recvd = mobileAction.getText(amt_trnsfrd.get(0));
				String amt_sent_after_exchange = mobileAction.getText(amount_sent);
				mobileAction.verifyTextEquality(amt_recvd, amt_sent_after_exchange);
				mobileAction.verifyTextContains(last_transaction_list.get(1), conf_val);
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(btnLogout, "Logout");

				mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void FinishButton() {
		Decorator();
		try {
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
		} catch (NoSuchElementException | InterruptedException | IOException e) {

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

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String accountNo = getTestdata("FromAccount");
				String account_value = "//*[contains(@label,'" + accountNo + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
				mobileAction.FuncClick(txtAmount, "Amount");
				mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(usd_button, "USD");
				mobileAction.FuncClick(btnContinue_transfer, "Continue");
				mobileAction.verifyElementIsDisplayed(error_msg, error_txt);

			} else {
				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 5, "down", true);
				mobileAction.FuncClick(txtAmount, "Amount");
				mobileAction.FuncSendKeys(txtAmount, ValueofAmount);
				mobileAction.FuncClickBackButton();
				mobileAction.FuncClick(usd_button, "USD");
				mobileAction.FuncClick(btnContinue_transfer, "Continue");
				String error_actual = mobileAction.getText(error_msg);
				mobileAction.verifyTextEquality(error_actual, error_txt);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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

		Decorator();
		try {

			mobileAction.FuncClick(txtFrom_acnt, "From Account");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, from_account);
				mobileAction.FuncClick(txtTo_acnt, "To Account");
				mobileAction.FuncSelectElementInTable(from_accounts_table, Firstpart, Secondpart, to_account);
			} else {

				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 3, "down", true);
				mobileAction.FuncClick(txtTo_acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_acnt, 3, "down", true);
			}

			mobileAction.FuncClick(txtAmount, "Amount");
			mobileAction.FuncSendKeys(txtAmount, ValueofAmount);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(done, "Done");
			} else {

				mobileAction.FuncClickBackButton();
			}

			mobileAction.FuncClick(btnContinue_transfer, "Continue");
			int timeout = Integer.valueOf(getTestdata("Timeout"));
			mobileAction.FuncWaitForElement(ok_button, timeout, "Ok");
			mobileAction.FuncClick(ok_button, "OK");
			mobileAction.FuncWaitForElement(ok_button, timeout, "Ok");
			mobileAction.FuncClick(ok_button, "OK");
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
			String conf_val = mobileAction.getText(confirmation_val);
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(txtMy_accounts, "My Accounts");
			mobileAction.FuncElementSwipeWhileNotFound(acntsummaryList, verify_from_acnt, 3, "down", true);
			mobileAction.verifyTextContains(last_transaction_list.get(0), conf_val);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will give negative Testing Transfer Funds
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
	public void negativerTestingTransferFunds() throws Exception {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_accountNo = getTestdata("FromAccount");

				String account_value = "//*[contains(@label,'" + from_accountNo + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);

				mobileAction.FuncClick(txtTo_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");

				String toAccount_value = "//*[contains(@label,'" + to_accountNo + "')]";
				MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(toAccount_value));
				mobileAction.FunCSwipeandScroll(toAccountval, true);

				mobileAction.FuncClick(txtAmount, "Amount");
				mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(btnContinue_transfer, "Continue");
				mobileAction.waitForElementToVanish(txtProgresssBar);
				mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "Confirm Page");
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(txtTransfers_header, "Transfers");
				mobileAction.FuncClick(back_button, "Back");
				mobileAction.verifyElementIsDisplayed(btnHome, "Home Page");

			} else {
				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_accountNo = getTestdata("FromAccount");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 3, "down", true);
				mobileAction.FuncClick(txtTo_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_acnt, 3, "down", true);
				mobileAction.FuncClick(txtAmount, "Amount");
				mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(btnContinue_transfer, "Continue");
				mobileAction.waitForElementToVanish(txtProgresssBar);
				mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "Confirm Page");
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(txtTransfers_header, "Transfers");
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(homeBtn, "Home");
				mobileAction.verifyElementIsDisplayed(btnHome, "Home Page");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will verify whether the TFSA(J) Account is present for the
	 * selected TDCT TFSA Account
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

	public void TDCTTFSA_CADTFSA() throws Exception {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_accountNo = getTestdata("FromAccount");
				String account_value = "//*[contains(@label,'" + from_accountNo + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);

				mobileAction.FuncClick(txtTo_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");

				String toAccount_value = "//*[contains(@label,'" + to_accountNo + "')]";
				MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(toAccount_value));
				mobileAction.FunCSwipeandScroll(toAccountval, false);
				mobileAction.FuncClick(btnCancel, "Cancel");

			} else {

			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
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

		Decorator();
		try {
			perFormTransfer();
			continueButton();
			Thread.sleep(2000);
			FinishButton();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				String from_accountNo = getTestdata("FromAccount");

				Thread.sleep(5000);
				String conf_val = mobileAction.getText(confirmation_val);
				String confirmationValue[] = conf_val.split(":");
				mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(txtMy_accounts, "My Accounts");
				mobileAction.waitForElementToVanish(txtProgresssBar);

				String account_value = "//*[contains(@label,'" + from_accountNo + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);

				Thread.sleep(2000);
				mobileAction.verifyElementTextContains(activityConfText, confirmationValue[1].trim());

			} else {

				String conf_val = mobileAction.getText(confirmation_val);
				mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(txtMy_accounts, "My Accounts");
				mobileAction.waitForElementToVanish(txtProgresssBar);
				MobileElement accountVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(verify_from_acnt));
				mobileAction.FunCSwipeandScroll(accountVal, true);
				mobileAction.verifyTextContains(last_transaction_list.get(0), conf_val);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void transfer_between_my_accounts_verify_receipt() throws Exception {

		Decorator();
		try {
			perFormTransfer();
			mobileAction.FuncClick(btnContinue_transfer, "Continue");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				Thread.sleep(5000);
				mobileAction.FuncClick(btnFinish_transfer, "Finish");
				Thread.sleep(5000);
				mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");

				String account_value = "//*[contains(@label,'" + from_account + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.verifyElementIsDisplayed(confirmation_val, "Confirmation Value");

				mobileAction.verifyElementIsDisplayed(fromAccountval, "From Account");

			} else {
				mobileAction.FuncClick(btnFinish_transfer, "Finish");
				String conf_val = mobileAction.getText(confirmation_val);
				mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(txtMy_accounts, "My Accounts");
				mobileAction.waitForElementToVanish(txtProgresssBar);
				MobileElement accountVal = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(verify_from_acnt));

				mobileAction.FunCSwipeandScroll(accountVal, true);
				mobileAction.verifyTextContains(last_transaction_list.get(0), conf_val);
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

	public void transfer_NotSupported() throws Exception {
		Decorator();
		String toAcc = getTestdata("ToAccount");
		String toAccount = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='" + toAcc
				+ "']";
		boolean flag = false;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String accounts = getTestdata("FromAccount");
				String accountsList[] = accounts.split(":");
				for (int i = 0; i < accountsList.length && flag == false; i++) {

					mobileAction.FuncClick(txtFrom_acnt, "From Account");
					String accountno = "//*[contains(@label,'" + accountsList[i] + "')]";

					MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(accountno));
					mobileAction.FunCSwipeandScroll(fromAccountval, true);
					mobileAction.FuncClick(txtTo_acnt, "To Account");
					try {
						String toAccountNo = "//*[contains(@label,'" + toAcc + "')]";
						MobileElement toAccountValue = (MobileElement) ((AppiumDriver) CL.GetDriver())
								.findElement(By.xpath(toAccountNo));

						mobileAction.FunCnewSwipe(toAccountValue, false, 6);
						flag = true;

					} catch (Exception e) {
						flag = false;
						mobileAction.FuncClick(cancelBtn, "Cancel");
					}
				}
			} else {

				String accounts = getTestdata("FromAccount");
				String accountsList[] = accounts.split(",");
				for (int i = 0; i < accountsList.length && flag == false; i++) {
					mobileAction.FuncClick(txtFrom_acnt, "Select From Account");
					String accNo = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
							+ accountsList[i] + "']";
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, accNo, 13, "Down", true);
					mobileAction.FuncClick(txtTo_acnt, "To Account");
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
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				btw_My_Accounts_Header.isDisplayed();
				mobileAction.FuncClick(txtFrom_acnt, "From_Account");
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(iosFromAccount));

				mobileAction.FunCSwipeandScroll(fromAccountval, true);
				Thread.sleep(3000);

				mobileAction.verifyElementIsDisplayed(verify_Message, validate_message);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void transferLessAmount() throws Exception {
		Decorator();
		try {
			perFormTransfer();
			mobileAction.FuncClick(cad_button, "CAD");
			mobileAction.FuncClick(btnContinue_transfer, "Continue");
			int timeout = Integer.valueOf(getTestdata("Timeout"));
			mobileAction.FuncWaitForElement(ok_button, timeout, "Ok");
			mobileAction.FuncClick(ok_button, "OK");
			mobileAction.FuncWaitForElement(ok_button, timeout, "Ok");
			mobileAction.FuncClick(ok_button, "OK");
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
			mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(btnLogout, "Logout");
			mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyFromAccounts() throws Exception {
		Decorator();
		boolean flag = false;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String accountsList[] = from_account.split(",");
				for (int i = 0; i < accountsList.length; i++) {
					mobileAction.FuncClick(from_acnt, "From Account");
					String accountno = "//*[contains(@label,'" + accountsList[i] + "')]";

					MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(accountno));
					mobileAction.FunCSwipeandScroll(fromAccountval, true);
					mobileAction.verifyElementIsDisplayed(fromAccountval, "From Account Number");
					mobileAction.verifyElementIsDisplayed(fromAccountName, "From Account Name");
					mobileAction.verifyElementIsDisplayed(fromAccountBalance, "From Account Balance");

				}
				mobileAction.FuncClick(back_button, "BackButton");
				Login.get().logout();
			} else {

				String accountsList[] = from_account.split(",");
				for (int i = 0; i < accountsList.length; i++) {
					mobileAction.FuncClick(from_acnt, "From Account");
					String accountno = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
							+ accountsList[i] + "']";

					MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(accountno));
					mobileAction.FunCSwipeandScroll(fromAccountval, false);
					mobileAction.verifyElementIsDisplayed(fromAccountval, "From Account Number");
					mobileAction.verifyElementIsDisplayed(fromAccountName, "From Account Name");
					mobileAction.verifyElementIsDisplayed(fromAccountBalance, "From Account Balance");
					mobileAction.FuncClick(fromAccountval, "From Account");
				}
				mobileAction.FuncHideKeyboard();
				Login.get().logout();

			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void permissible_transfer() throws Exception {
		Decorator();
		try {
			if (btw_My_Accounts_Header.isDisplayed() == true) {
				//\mobileAction.FuncClick(txtFrom_acnt, "From Account");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

					String from_accountNo = getTestdata("FromAccount");
					String account_value = "//*[contains(@label,'" + from_accountNo + "')]";
					MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(account_value));
					mobileAction.FunCSwipeandScroll(fromAccountval, true);

					mobileAction.FuncClick(txtTo_acnt, "To Account");
					String to_accountNo = getTestdata("ToAccount");
					String toAccount_value = "//*[contains(@label,'" + to_accountNo + "')]";
					MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(toAccount_value));
					mobileAction.FunCSwipeandScroll(toAccountval, true);
					String amountXL = getTestdata("Amount");
					mobileAction.FuncSendKeys(txtAmount, amountXL);
					mobileAction.FuncClick(done, "Done");
					mobileAction.FuncClick(btnContinue_transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");

					//Thread.sleep(105000);
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");

					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.verifyElementIsDisplayed(exchangeRate, "Exchange Rate");
					mobileAction.verifyElementIsDisplayed(makeAnthTran_button, "MAKE ANOTHER Transfer");
					mobileAction.FuncClick(btnMenu, "Menu");
					mobileAction.FuncClick(btnLogout, "Logout");
					mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
				} else {
					/*String select_fromaccountvalue ="//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='" + from_account+ "']";
				    MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(select_fromaccountvalue));
				    mobileAction.FunCnewSwipe(fromAccountval, false, 7);
					//mobileAction.FunCSwipeandScroll(fromAccountval, true);
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_fromaccountvalue, 6, "down", true);
					mobileAction.waitForElementToDisappear(select_fromaccountvalue);
					mobileAction.FuncClick(txtTo_acnt, "To Account");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList,select_toaccountvalue, 6, "down", true);
					String amountXL = getTestdata("Amount");
					mobileAction.FuncSendKeys(txtAmount, amountXL);
					mobileAction.FuncHideKeyboard();*/
					perFormTransfer() ;
					mobileAction.FuncClick(btnContinue_transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.FunCnewSwipe(makeAnthTran_button, false, 1);
					mobileAction.verifyElementIsDisplayed(makeAnthTran_button, "MAKE ANOTHER Transfer");
					mobileAction.FuncClick(btnMenu, "Menu");
					mobileAction.FuncClick(btnLogout, "Logout");
					mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
					}
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the mobile Rate Expiry on Smartphones and Tablets
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

	public void mobileRateExpiryOnSmartphones() throws Exception {

		Decorator();
		try {
			mobileAction.FuncClick(from_acnt, "From Account");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				String from_accountNo = getTestdata("FromAccount");
				String account_value = "//*[contains(@label,'" + from_accountNo + "')]";
				MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(account_value));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
				mobileAction.FuncClick(to_acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");
				String accountValue = "//*[contains(@label,'" + to_accountNo + "')]";
				MobileElement ToAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(accountValue));
				mobileAction.FunCSwipeandScroll(ToAccountval, true);
				mobileAction.FuncClick(cad_button, "CAD");
				mobileAction.FuncClick(amount, "Amount");
				mobileAction.FuncSendKeys(amount, ValueofAmount);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(continue_transfer, "Continue");
				mobileAction.waitForElementToVanish(progresssBar);
				WebDriverWait wait = new WebDriverWait((AppiumDriver) CL.GetDriver(), 60);
				wait.until(ExpectedConditions.visibilityOf(ok_button));
				mobileAction.FuncClick(ok_button, "OK");

			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will transfer on mobile from C10 to U04 && U02 to C06 && U03
	 * to C16.
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

	public void permissible_transfer_on_mobile() throws Exception {
		Decorator();
		try {
			if (btw_My_Accounts_Header.isDisplayed() == true) {
				mobileAction.FuncClick(from_acnt, "From Account");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					String from_accountNo = getTestdata("FromAccount");
					String account_value = "//*[contains(@label,'" + from_accountNo + "')]";
					MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(account_value));
					mobileAction.FunCSwipeandScroll(fromAccountval, true);

					mobileAction.FuncClick(to_acnt, "To Account");
					String to_accountNo = getTestdata("ToAccount");
					String toAccount_value = "//*[contains(@label,'" + to_accountNo + "')]";
					MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(toAccount_value));
					mobileAction.FunCSwipeandScroll(toAccountval, true);
					String amountXL = getTestdata("Amount");
					mobileAction.FuncSendKeys(amount, amountXL);
					mobileAction.FuncClick(done, "Done");
					mobileAction.FuncClick(btnContinue_transfer, "Continue");
					Thread.sleep(105000);
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElement(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.verifyElementIsDisplayed(exchangeRate, "Exchange Rate");
					mobileAction.FuncClick(btnMenu, "Menu");
					mobileAction.FuncClick(btnLogout, "Logout");
				} else {
				}
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
		}
	}
	/**
	 * This method will perform the transfer and get the amount of the from account
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

	public double transferTDCTCad_USDVisa() throws Exception {
		double fromAccountval=0.00;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) 
			{
			perFormTransfer();
			fromAccountval = Double.parseDouble(accountVal.getAttribute("value"));
			System.out.println("Account Value" +fromAccountval);
			continueButton();
			FinishButton();
			}
			else
			{
				perFormTransfer();
				MobileElement accountValue = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(select_fromaccountvalue));
				fromAccountval = Double.parseDouble(mobileAction.getText(accountValue));
				continueButton();
				FinishButton();
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(txtMy_accounts, "My Accounts");
				mobileAction.FuncElementSwipeWhileNotFound(acntsummaryList, verify_from_acnt, 3, "down", true);
				String conf_val = mobileAction.getText(confirmation_val);
				mobileAction.verifyTextContains(last_transaction_list.get(0), conf_val);
				}
			
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
		return fromAccountval;
	}
	/**
	 * This method will perform the transfer and get the amount of the from account
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

	public void transfer_TFSAUSD_TFSACAD() throws Exception {
		Decorator();
		try {
			if (btw_My_Accounts_Header.isDisplayed() == true) {
				mobileAction.FuncClick(from_acnt, "From Account");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					String from_accountNo = getTestdata("FromAccount");
					String account_value = "//*[contains(@label,'" + from_accountNo + "')]";
					MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(account_value));
					mobileAction.FunCSwipeandScroll(fromAccountval, true);

					mobileAction.FuncClick(to_acnt, "To Account");
					String to_accountNo = getTestdata("ToAccount");
					String toAccount_value = "//*[contains(@label,'" + to_accountNo + "')]";
					MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(toAccount_value));
					mobileAction.FunCSwipeandScroll(toAccountval, true);
					String amountXL = getTestdata("Amount");
					mobileAction.FuncSendKeys(amount, amountXL);
					mobileAction.FuncClick(done, "Done");
					mobileAction.FuncClick(btnContinue_transfer, "Continue");
					Thread.sleep(105000);
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElement(cnfrDetail, "Confirm Details");
					mobileAction.FuncClick(btnMenu, "Menu");
					mobileAction.FuncClick(txtMy_accounts, "My Accounts");
					
				} else 
				{
					perFormTransfer() ;
					mobileAction.FuncClick(btnContinue_transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.FuncClick(btnMenu, "Menu");
					mobileAction.FuncClick(txtMy_accounts, "My Accounts");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 10, "down", true);
					mobileAction.verifyElementIsDisplayed(fromAccountNumber, "From Account Number");
					mobileAction.verifyElementIsDisplayed(fromAccountbal, "From Account Balance Displayed");
					mobileAction.FuncClick(back_button, "Back");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_acnt, 10, "down", true);
					mobileAction.verifyElementIsDisplayed(toAccountNumber, "From Account Number");
					mobileAction.verifyElementIsDisplayed(toAccountbal, "From Account Balance Displayed");
					
				}
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
		}
	}
}


