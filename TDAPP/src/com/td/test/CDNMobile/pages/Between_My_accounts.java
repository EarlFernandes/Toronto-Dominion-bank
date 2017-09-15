package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td._CommonPage;

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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'This amount is either below')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement errorMsg;

	@iOSFindBy(accessibility = "BETWEENMYACCOUNTS_FROM0")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount']")
	private MobileElement txtFrom_acnt;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement generalerrorMsg;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/second_amount_val']")
	private MobileElement amountSent;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'To Account') or contains(@label, '转入账户') or contains(@label, '轉入賬戶')]")
	// FIXME: This is a bug, not seen in 17.5.1+ builds
	// @iOSFindBy(accessibility = "BETWEENMYACCOUNTS_TO1")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtToAccount']")
	private MobileElement txtto_Acnt;

	@iOSFindBy(accessibility = "BETWEENMYACCOUNTS_AMOUNT")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/edtAmount']")
	private MobileElement txtAmount;

	@iOSFindBy(accessibility = "BETWEEN_ACCOUNTS__CONFIRM_FINISH_BUTTON")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'com.td:id/myaccounts_entry_btn_confirm']")
	private MobileElement btnFinish_transfer;

	@iOSFindBy(accessibility = "BETWEENMYACCOUNTS_CONTINUE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/button_footer']")
	private MobileElement btncontinue_Transfer;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_Val;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement btnMenu;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='My Accounts']")
	private MobileElement txtMy_Accounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/current_balance']")
	private MobileElement balance;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/description']")
	private List<MobileElement> last_Transaction_List;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='CAD']")
	@AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.td:id/buttonCAD' and @text='CAD']")
	private MobileElement cad_Button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='USD']")
	@AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.td:id/buttonUSD' and @text='USD']")
	private MobileElement usd_Button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='OK']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='OK']")
	private MobileElement ok_Button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/amount']")
	private List<MobileElement> amt_Trnsfrd;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Logout']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Logout']")
	private MobileElement btnLogout;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Logged Out']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Logged Out']")
	private MobileElement logoutHeader;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntsList;

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/summaryContent']")
	private MobileElement acntSummaryList;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transfer successful']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Transfer Successful']")
	private MobileElement txtTrnsfrSucssfl;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Withdrawals may impact your annual TFSA contribution limit.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Withdrawals may impact your annual TFSA contribution limit.')]")
	private MobileElement verify_Message;

	@iOSFindBy(xpath = "//*[@label='Done' or @label='完成']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement backBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel' or @label='CANCEL']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/myaccounts_entry_btn_cancel' and @text='Cancel']")
	private MobileElement cancelBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement txtProgressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Confirm']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Confirm']")
	private MobileElement txtConfirmHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement txtTransfers_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@value, 'Quick Access') or contains(@label,'Quick Access')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Home']")
	private MobileElement quickAccess;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']")
	private MobileElement homeBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='CANCEL']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button' and @text='Cancel']")
	private MobileElement btnCancel;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'When making deposits to this account, please ensure that you are')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/txt_Deposit'and contains(@text,'When making deposits to this account')]")
	private MobileElement TDCT_TFSAMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'android:id/action_bar_title'and @text='Receipt']")
	private MobileElement receiptHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Finish Transfer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'com.td:id/myaccounts_entry_btn_confirm'and @text='Finish Transfer']")
	private MobileElement finish_Transfer;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-From Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/from_account_bal']")
	private MobileElement fromAccountValue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/account_desc']")
	private MobileElement fromAccountNumber;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/current_balance']")
	private MobileElement fromAccountbal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/account_desc']")
	private MobileElement toAccountNumber;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/current_balance']")
	private MobileElement toAccountbal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-To Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/to_account_bal']")
	private MobileElement ToAccountValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transfer successful']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/confirmation_val']")
	private MobileElement cnfrDetail;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/amount_val']")
	private MobileElement amountValue;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-Exchange Rate']")
	private MobileElement exchangeRate;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/current_balance']")
	private MobileElement verifyAmount;

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id= 'com.td:id/summaryContent']")
	private MobileElement acntsListNew;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@label='MAKE ANOTHER TRANSFER']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/transfers_make_another' and @text='MAKE ANOTHER TRANSFER']")
	private MobileElement makeAnthTran_Button;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/button_footer' and @text='Continue']")
	private MobileElement continue_Transfer;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='-Amount']")
	@AndroidFindBy(id = "com.td:id/edtAmount")
	private MobileElement amount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'To Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtToAccount' and @text='Select To Account']")
	private MobileElement to_Acnt;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Between My Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Between My Accounts']")
	private MobileElement btw_My_Accounts_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'From Account, Select from account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
	private MobileElement fromAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	private MobileElement activityConfText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2] ")
	private MobileElement lastTransacAmt;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'From Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount']")
	private MobileElement from_acnt;
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc']")
	private MobileElement fromAccountName;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountBalance']")
	private MobileElement fromAccountBalance;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
	private MobileElement accountVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='--From']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_from_account_bal']")
	private MobileElement fromAccountValue_review;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='--To']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_to_account_bal']")
	private MobileElement toAccountValue_review;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_amount_value']")
	private MobileElement amount_review_main;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='--Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_amount_second_value']")
	private MobileElement amount_review_second;

	@iOSFindBy(xpath = "//*[@name='COMMON_RECEIPT_CELL_TITLE_0']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_bal']")
	private MobileElement fromAccountValue_receipt;

	@iOSFindBy(xpath = "//*[@name='COMMON_RECEIPT_CELL_TITLE_1']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/to_account_bal']")
	private MobileElement toAccountValue_receipt;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Activity']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/activityTab']")
	private MobileElement activity_tab;
	
	@iOSFindBy(accessibility = "TDVIEW_MESSAGE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement transfer_error_message;

	private void Decorator() {
		PageFactory.initElements(new AppiumFieldDecorator((CL.GetDriver()), new TimeOutDuration(10, TimeUnit.SECONDS)),
				this);

	}

	private double verifyAccountbalanceAndConfirmationNumber() {
		Decorator();
		String fromAccountValueBefore = mobileAction.getValue(fromAccountValue_review);
		String toAccountValueBefore = mobileAction.getValue(toAccountValue_review);
		String transferValueMain = mobileAction.getValue(amount_review_main);
		String transferValueUS = "";
		String transferValueCAD ="";

		boolean is_fromaccount_usd = false;
		boolean is_toaccount_usd = false;
		if (fromAccountValueBefore.contains("USD")) {
			is_fromaccount_usd = true;
		}

		if (toAccountValueBefore.contains("USD")) {
			is_toaccount_usd = true;
		}
			
		if(is_fromaccount_usd && is_toaccount_usd) {
			transferValueUS = transferValueMain;
		}else if(!is_fromaccount_usd && !is_toaccount_usd) {
			transferValueCAD = transferValueMain;
		} else if(is_fromaccount_usd && !is_toaccount_usd) {
			transferValueUS = transferValueMain;
			transferValueCAD = mobileAction.getValue(amount_review_second);
		} else {
			transferValueCAD = transferValueMain;
			transferValueUS = mobileAction.getValue(amount_review_second);
		}

		double fromAccountValueBefore_d, toAccountValueBefore_d, transferValueCAN_d=0.0, transferValueUS_d = 0.0;
		fromAccountValueBefore_d = mobileAction.convertStringAmountTodouble(fromAccountValueBefore);
		System.out.println("From account value before transfer:" + fromAccountValueBefore_d);
		toAccountValueBefore_d = mobileAction.convertStringAmountTodouble(toAccountValueBefore);
		System.out.println("To account value before transfer:" + toAccountValueBefore_d);
		
		if(!transferValueCAD.isEmpty()) {
			transferValueCAN_d = mobileAction.convertStringAmountTodouble(transferValueCAD);
			System.out.println("transfer amount CAN:" + transferValueCAN_d);
		}
		
		if (!transferValueUS.isEmpty()) {
			transferValueUS_d = mobileAction.convertStringAmountTodouble(transferValueUS);
			System.out.println("transfer amount USA:" + transferValueUS_d);
		}

		if(!FinishButton()) {
			mobileAction.Report_Fail("Failed to transfer");
			return 0.00;
		}
		// Verify amount in Receipt
		String fromAccountValueAfter = mobileAction.getValue(fromAccountValue_receipt);
		String toAccountValueAfter = mobileAction.getValue(toAccountValue_receipt);
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			fromAccountValueAfter = mobileAction.FuncGetValByRegx(fromAccountValueAfter, "\\$\\d+,*\\d+\\.\\d+");
			toAccountValueAfter = mobileAction.FuncGetValByRegx(toAccountValueAfter, "\\$\\d+,*\\d+\\.\\d+");
		}
		double fromAccountValueAfter_d = mobileAction.convertStringAmountTodouble(fromAccountValueAfter);
		double toAccountValueAfter_d = mobileAction.convertStringAmountTodouble(toAccountValueAfter);
		System.out.println("From account value after transfer:" + fromAccountValueAfter_d);
		System.out.println("To account value after transfer:" + toAccountValueAfter_d);

		if (is_fromaccount_usd) {
			System.out.println("From account is USD account");
			if (fromAccountValueBefore_d == fromAccountValueAfter_d + transferValueUS_d) {
				mobileAction.Report_Pass_Verified("From account balance:" + fromAccountValueAfter);
			} else {
				mobileAction.Report_Fail("From account balance not match after transfer:" + fromAccountValueAfter);
			}
		} else {
			System.out.println("From account is CAN account");
			if (fromAccountValueBefore_d == fromAccountValueAfter_d + transferValueCAN_d) {
				mobileAction.Report_Pass_Verified("From account balance:" + fromAccountValueAfter);
			} else {
				mobileAction.Report_Fail("From account balance not match after transfer:" + fromAccountValueAfter);
			}
		}

		if (is_toaccount_usd) {
			System.out.println("To account is USD account");
			if (toAccountValueBefore_d == toAccountValueAfter_d - transferValueUS_d) {
				mobileAction.Report_Pass_Verified("To account balance:" + toAccountValueAfter);
			} else {
				mobileAction.Report_Fail("To account balance does't match after transfer:" + toAccountValueAfter);
			}
		} else {
			System.out.println("To account is CAN account");
			if (toAccountValueBefore_d == toAccountValueAfter_d - transferValueCAN_d) {
				mobileAction.Report_Pass_Verified("To account balance:" + toAccountValueAfter);
			} else {
				mobileAction.Report_Fail("To account balance does't match after transfer:" + toAccountValueAfter);
			}
		}

		// Verify confirmation number
		if (!is_fromaccount_usd && !is_toaccount_usd) {
			String from_AccountNo = getTestdata("FromAccount");
			String to_accountNo = getTestdata("ToAccount");
			String conf_val = mobileAction.getText(confirmation_Val);
			String confirmationValue[] = conf_val.split(":");
			String confirmationNum = confirmationValue[0].trim();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				confirmationNum = confirmationValue[1].trim();
			}

			System.out.println("Confirmation num:" + confirmationNum);
			try {
				mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(txtMy_Accounts, "My Accounts");
				mobileAction.waitForElementToVanish(txtProgressBar);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

					String account_value = "//XCUIElementTypeStaticText[contains(@value,'" + from_AccountNo + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");

					mobileAction.FuncClick(activity_tab, "Activity Tab");
					String confirmationXpath = "//XCUIElementTypeStaticText[contains(@label,'" + confirmationNum
							+ "')]";
					mobileAction.verifyElementUsingXPath(confirmationXpath, confirmationNum);

				} else {

					String account_value = "//*[contains(@text,'" + from_AccountNo + "') or contains(@content-desc,'"
							+ from_AccountNo + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
					mobileAction.FuncClick(activity_tab, "Activity Tab");
					String confirmationXpath = "//android.widget.TextView[contains(@text,'" + confirmationNum + "')]";
					mobileAction.verifyElementUsingXPath(confirmationXpath, confirmationNum);
				}
				mobileAction.ClickBackButton();
				mobileAction.waitForElementToVanish(txtProgressBar);
				// Verify to account
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

					String account_value = "//XCUIElementTypeStaticText[contains(@value,'" + to_accountNo + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");

					mobileAction.FuncClick(activity_tab, "Activity Tab");
					String confirmationXpath = "//XCUIElementTypeStaticText[contains(@label,'" + confirmationNum
							+ "')]";
					mobileAction.verifyElementUsingXPath(confirmationXpath, confirmationNum);

				} else {

					String account_value = "//*[contains(@text,'" + to_accountNo + "') or contains(@content-desc,'"
							+ to_accountNo + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
					mobileAction.FuncClick(activity_tab, "Activity Tab");
					String confirmationXpath = "//android.widget.TextView[contains(@text,'" + confirmationNum + "')]";
					mobileAction.verifyElementUsingXPath(confirmationXpath, confirmationNum);
				}

			} catch (Exception e) {
				System.out.println("Exception in verifyAccountbalanceAndConfirmationNumber");
				mobileAction.Report_Fail("Exception in verifyAccountbalanceAndConfirmationNumber");
			}
		}
		return fromAccountValueAfter_d;
	}
	
	public void perFormTransfer() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_AccountNo = getTestdata("FromAccount");
				System.out.println("From account:" + from_AccountNo);
				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");
				System.out.println("To account:" + to_accountNo);
				account_value = "//XCUIElementTypeStaticText[contains(@label,'" + to_accountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
			} else {
				String from_Account = getTestdata("FromAccount");

				String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
						+ from_Account + "']";
				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 10, "down", true);
				mobileAction.waitForElementToDisappear(select_from_acnt);

				mobileAction.FuncClick(txtto_Acnt, "To Account");
				String to_account = getTestdata("ToAccount");
				String select_to_Acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
						+ to_account + "']";
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_Acnt, 10, "down", true);
				mobileAction.waitForElementToDisappear(select_to_Acnt);

			}

			mobileAction.FuncClick(txtAmount, "Amount");
			mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void anyAccount_TDCTTFSA_Message() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_AccountNo = getTestdata("FromAccount");

				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");

				String toAccount_value = "//XCUIElementTypeStaticText[contains(@label,'" + to_accountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(toAccount_value, true, 25, "Up");
				mobileAction.verifyElementIsDisplayed(TDCT_TFSAMessage,
						"When making deposits to this account, please ensure that you are");

			} else {
				String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
						+ getTestdata("FromAccount") + "')]";
				String select_to_Acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
						+ getTestdata("ToAccount") + "')]";

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(select_from_acnt, true, 25, "up");
				mobileAction.waitForElementToDisappear(select_from_acnt);
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(select_to_Acnt, true, 25, "up");
				mobileAction.waitForElementToDisappear(select_to_Acnt);
				mobileAction.verifyElementIsDisplayed(TDCT_TFSAMessage,
						"When making deposits to this account, please ensure that you are");
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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void CADTFSA_TDCTTFSA() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_AccountNo = getTestdata("FromAccount");
				System.out.println("From account:" + from_AccountNo);
				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");
				System.out.println("To account:" + to_accountNo);
				String toAccount_value = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'"
						+ to_accountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(toAccount_value, true, 25, "Up");

			} else {
				String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
						+ getTestdata("FromAccount") + "')]";

				String select_to_Acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
						+ getTestdata("ToAccount") + "')]";
				mobileAction.FuncClick(txtFrom_acnt, "From Account");

				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 10, "down", true);
				mobileAction.waitForElementToDisappear(select_from_acnt);
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_Acnt, 3, "down", true);
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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void canadianCash_To_USCash() {

		Decorator();
		try {
			perFormTransfer();
			mobileAction.FuncClick(usd_Button, "USD");
			mobileAction.FuncClick(btncontinue_Transfer, "Continue");
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.waitForElementToVanish(txtProgressBar);
			}
			mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(btnLogout, "Logout");
			mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
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

	public void CanadianToUS() {
		Decorator();
		try {
			perFormTransfer();
			mobileAction.FuncClick(btncontinue_Transfer, "Continue");
			/*
			 * int timeout = Integer.valueOf(getTestdata("Timeout")); int
			 * Sndtimeout = Integer.valueOf(getTestdata("SecondTimeout"));
			 * mobileAction.FuncWaitForElement(ok_Button, timeout, "Ok");
			 * mobileAction.FuncClick(ok_Button, "OK");
			 * mobileAction.FuncWaitForElement(ok_Button, Sndtimeout, "Ok");
			 * mobileAction.FuncClick(ok_Button, "OK");
			 */
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.waitForElementToVanish(txtProgressBar);
			}
			mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(btnLogout, "Logout");
			mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");

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

	public void performTransferToConfirmationPage() throws Exception {
		try {
			perFormTransfer();
			continueButton();
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void performTransferToSuccessPage() throws Exception {
		try {
			perFormTransfer();
			continueButton();
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void continueButton() {
		Decorator();
		try {
			mobileAction.FuncClick(btncontinue_Transfer, "Continue");
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

	public void exchange_rate_expired() {
		Decorator();
		
		perFormTransfer();
		continueButton();
		
		try {
			System.out.println("Wait rate exchange expires:122s");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				WebDriverWait wait = new WebDriverWait(CL.GetAppiumDriver(), 122);
				wait.until(ExpectedConditions.visibilityOf(ok_Button));
				mobileAction.FuncClick(ok_Button, "OK");
	
			} else {
				mobileAction.FuncWaitForElement(ok_Button, 122, "Ok");
				mobileAction.FuncClick(ok_Button, "OK");
			}
		}catch (Exception e ){
			System.out.println("Failed to wait rate exchange expired");
			mobileAction.Report_Fail("Failed to wait rate exchange expired");
			return;
		}
		verifyAccountbalanceAndConfirmationNumber();
	}

	public boolean FinishButton() {
		Decorator();
		try {
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
			mobileAction.waitForElementToVanish(txtProgressBar);
			try {
				String errorMessage = mobileAction.getValue(transfer_error_message);
				if(!errorMessage.isEmpty()) {
					System.out.println("Error:"+errorMessage);
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					return false;
				}
			} catch (Exception e1) {
				return true;
			}
			
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			return false;
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			return false;
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			return false;
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			return false;
		}
		return true;
	}

	/**
	 * This method will transfer from LIRA(S) to US LIRA(U) account - Amount
	 * less than $1 CAD or USD
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
	public void lira_US_to_UU() {

		Decorator();
		String error_txt = "This amount is either below the minimum or above the maximum foreign exchange limit. Please enter a different amount. (BQ15)";
		String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("FromAccount") + "')]";
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String accountNo = getTestdata("FromAccount");
				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + accountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
				mobileAction.FuncClick(txtAmount, "Amount");
				mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(usd_Button, "USD");
				mobileAction.FuncClick(btncontinue_Transfer, "Continue");
				mobileAction.verifyElementIsDisplayed(errorMsg, error_txt);

			} else {
				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 5, "down", true);
				mobileAction.FuncClick(txtAmount, "Amount");
				mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(btncontinue_Transfer, "Continue");
				String error_actual = mobileAction.getText(errorMsg);
				mobileAction.verifyTextEquality(error_actual, error_txt);
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
	 * This method will verify Mobile Rate Expiry on SmartPhones and Tablets
	 * when amount greater than $35,000 USD
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
	public void mobile_expiry_rate() {

		Decorator();
		String from_Accounts_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]";
		String Firstpart = "//XCUIElementTypeCell[";
		String Secondpart = "]/XCUIElementTypeStaticText[1]";

		String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("FromAccount") + "')]";

		String select_to_Acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("ToAccount") + "')]";

		String verify_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
				+ getTestdata("FromAccount") + "']";

		try {

			mobileAction.FuncClick(txtFrom_acnt, "From Account");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncSelectElementInTable(from_Accounts_table, Firstpart, Secondpart,
						getTestdata("FromAccount"));
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				mobileAction.FuncSelectElementInTable(from_Accounts_table, Firstpart, Secondpart,
						getTestdata("ToAccount"));
			} else {

				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 3, "down", true);
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_Acnt, 3, "down", true);
			}

			mobileAction.FuncClick(txtAmount, "Amount");
			mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {

				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(btncontinue_Transfer, "Continue");
			int timeout = Integer.valueOf(getTestdata("Timeout"));
			mobileAction.FuncWaitForElement(ok_Button, timeout, "Ok");
			mobileAction.FuncClick(ok_Button, "OK");
			mobileAction.FuncWaitForElement(ok_Button, timeout, "Ok");
			mobileAction.FuncClick(ok_Button, "OK");
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
			String conf_val = mobileAction.getText(confirmation_Val);
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(txtMy_Accounts, "My Accounts");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + getTestdata("FromAccount")
						+ "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
				Thread.sleep(3000);

			} else {
				mobileAction.FuncElementSwipeWhileNotFound(acntSummaryList, verify_from_acnt, 5, "down", true);
				mobileAction.verifyTextContains(last_Transaction_List.get(0), conf_val);
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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void negativerTestingTransferFunds() {

		Decorator();

		String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("FromAccount") + "')]";

		String select_to_Acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("ToAccount") + "')]";

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_AccountNo = getTestdata("FromAccount");

				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");

				String toAccount_value = "//XCUIElementTypeStaticText[contains(@label,'" + to_accountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(toAccount_value, true, 25, "Up");
				mobileAction.FuncClick(txtAmount, "Amount");
				mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(btncontinue_Transfer, "Continue");
				mobileAction.waitForElementToVanish(txtProgressBar);
				mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "Confirm Page");
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(txtTransfers_Header, "Transfers");
				mobileAction.FuncClick(backBtn, "Back");
				mobileAction.verifyElementIsDisplayed(quickAccess, "Home Page");

			} else {
				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 3, "down", true);
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_Acnt, 3, "down", true);
				mobileAction.FuncClick(txtAmount, "Amount");
				mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(btncontinue_Transfer, "Continue");
				mobileAction.waitForElementToVanish(txtProgressBar);
				mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "Confirm Page");
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(txtTransfers_Header, "Transfers");
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(homeBtn, "Home");
				mobileAction.verifyElementIsDisplayed(quickAccess, "Home Page");
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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void TDCTTFSA_CADTFSA() {

		Decorator();

		String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("FromAccount") + "')]";

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_AccountNo = getTestdata("FromAccount");
				System.out.println("From_AccountNo:" + from_AccountNo);
				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");

			} else {
				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 8, "down", true);
				mobileAction.waitForElementToDisappear(select_from_acnt);
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
	 * This method will transfer money from one account to another and check if
	 * it is successful.
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
	public void transfer_between_my_accounts() {

		Decorator();
		try {
			perFormTransfer();
			continueButton();
			verifyAccountbalanceAndConfirmationNumber();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void transfer_between_my_accounts_verify_receipt() {

		Decorator();

		String verify_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum' and @text='"
				+ getTestdata("FromAccount") + "']";

		try {
			perFormTransfer();
			mobileAction.FuncClick(btncontinue_Transfer, "Continue");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(btnFinish_transfer, "Finish");
				mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");

				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + getTestdata("FromAccount")
						+ "')]";
				mobileAction.verifyElementIsDisplayed(confirmation_Val, "Confirmation Value");
				mobileAction.verifyElementUsingXPath(account_value, "Account");
			} else {
				mobileAction.FuncClick(btnFinish_transfer, "Finish");
				String conf_val = mobileAction.getText(confirmation_Val);
				mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
				mobileAction.FuncClick(btnMenu, "Menu");
				mobileAction.FuncClick(txtMy_Accounts, "My Accounts");
				mobileAction.waitForElementToVanish(txtProgressBar);
				// mobileAction.FuncElementSwipeWhileNotFound(acntsListNew,
				// verify_from_acnt, 5, "down", true);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(verify_from_acnt, true, 25, "Up");
				mobileAction.verifyTextContains(last_Transaction_List.get(0), conf_val);
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
	 * This method will transfer from Canadian Account to US account and
	 * validate Withdrawals may impact your annual TFSA contribution limit
	 * message
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

	public void transfer_NotSupported() throws Exception {
		Decorator();
		String toAcc = getTestdata("ToAccount");
		System.out.println("To account:" + toAcc);
		String toAccount = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='" + toAcc
				+ "']";
		boolean flag = false;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String accounts = getTestdata("FromAccount");
				String accountsList[] = accounts.split(":");
				for (int i = 0; i < accountsList.length && flag == false; i++) {
					System.out.println("accountsList[" + i + "]:" + accountsList[i]);
					mobileAction.FuncClick(txtFrom_acnt, "From Account");
					String accountno = "//XCUIElementTypeStaticText[contains(@label,'" + accountsList[i] + "')]";

					mobileAction.FuncSwipeWhileElementNotFoundByxpath(accountno, true, 25, "Up");
					mobileAction.FuncClick(txtto_Acnt, "To Account");
					String toAccountNo = "//XCUIElementTypeStaticText[contains(@label,'" + toAcc + "')]";
					mobileAction.FuncElementNotInListSwipe(acntsList, toAccountNo, 25, "Down");
				}
			} else {

				String accounts = getTestdata("FromAccount");
				String accountsList[] = accounts.split(":");
				for (int i = 0; i < accountsList.length && flag == false; i++) {
					mobileAction.FuncClick(txtFrom_acnt, "Select From Account");
					String accNo = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
							+ accountsList[i] + "']";
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, accNo, 25, "Down", true);
					mobileAction.FuncClick(txtto_Acnt, "To Account");
					mobileAction.FuncElementNotInListSwipe(acntsList, toAccount, 25, "Down");
				}
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
	 * This method will transfer from Canadian Account to US account and
	 * validate Withdrawals may impact your annual TFSA contribution limit
	 * message
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
	public void transferBtw_tfsa_other_Acct() {
		Decorator();

		String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("FromAccount") + "')]";

		String select_to_Acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("ToAccount") + "')]";

		String validate_message = "Withdrawals may impact your annual TFSA contribution limit.";
		String iosFromAccount = "//XCUIElementTypeStaticText[contains(@label,'" + getTestdata("FromAccount") + "')]";

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementIsDisplayed(btw_My_Accounts_Header, "betweenMyAccountsHeader");
				mobileAction.FuncClick(txtFrom_acnt, "from_Account");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(iosFromAccount, true, 25, "Up");
				mobileAction.verifyElementIsDisplayed(verify_Message, validate_message);
			} else {
				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 10, "down", true);
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_Acnt, 10, "down", true);
				mobileAction.verifyElementIsDisplayed(verify_Message, validate_message);
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

	public void transferLessAmount() {
		Decorator();
		try {
			perFormTransfer();
			mobileAction.FuncClick(btncontinue_Transfer, "Continue");
			int timeout = Integer.valueOf(getTestdata("Timeout"));
			System.out.println("Wait for " + timeout + "s until rate exchange expires");
			mobileAction.FuncWaitForElement(ok_Button, timeout, "Ok");
			mobileAction.FuncClick(ok_Button, "OK");
			System.out.println("Wait for " + timeout + "s again until rate exchange expires");
			mobileAction.FuncWaitForElement(ok_Button, timeout, "Ok");
			mobileAction.FuncClick(ok_Button, "OK");
			mobileAction.FuncClick(btnFinish_transfer, "Finish");
			mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
			mobileAction.FuncClick(btnMenu, "Menu");
			mobileAction.FuncClick(btnLogout, "Logout");
			mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
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

	public void verifyFromAccounts() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String accountsList[] = getTestdata("FromAccount").split(",");
				for (int i = 0; i < accountsList.length; i++) {
					mobileAction.FuncClick(from_acnt, "From Account");
					String accountno = "//XCUIElementTypeStaticText[contains(@label,'" + accountsList[i] + "')]";

					MobileElement fromAccountval = (MobileElement) (CL.GetAppiumDriver())
							.findElement(By.xpath(accountno));
					mobileAction.FunCSwipeandScroll(fromAccountval, true);

					fromAccountval = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(accountno));

					mobileAction.verifyElementIsDisplayed(fromAccountval, "From Account Number");
					mobileAction.verifyElementIsDisplayed(fromAccountName, "From Account Name");
					mobileAction.verifyElementIsDisplayed(fromAccountBalance, "From Account Balance");

				}
				mobileAction.FuncClick(backBtn, "BackButton");
				Login.get().logout();
			} else {

				String accountsList[] = getTestdata("FromAccount").split(":");
				mobileAction.FuncClick(from_acnt, "From Account");
				for (int i = 0; i < accountsList.length; i++) {
					String accountno = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
							+ accountsList[i] + "']";

					MobileElement fromAccountval = mobileAction.verifyElementUsingXPath(accountno, "Account");
					mobileAction.FunCSwipeandScroll(fromAccountval, false);
					mobileAction.verifyElementIsDisplayed(fromAccountval, "From Account Number");
					mobileAction.verifyElementIsDisplayed(fromAccountName, "From Account Name");
					mobileAction.verifyElementIsDisplayed(fromAccountBalance, "From Account Balance");
					// mobileAction.FuncClick(fromAccountval, "From Account");
				}
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClickBackButton();
				Login.get().logout();

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

	public void permissible_transfer() {
		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(btw_My_Accounts_Header)) {
				// \mobileAction.FuncClick(txtFrom_Acnt, "From Account");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

					mobileAction.FuncClick(txtFrom_acnt, "From Account");
					String from_AccountNo = getTestdata("FromAccount");
					System.out.println("From Account:" + from_AccountNo);
					String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
					mobileAction.FuncClick(txtto_Acnt, "To Account");
					String to_accountNo = getTestdata("ToAccount");
					System.out.println("To Account:" + to_accountNo);
					String toAccount_value = "//XCUIElementTypeStaticText[contains(@label,'" + to_accountNo + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(toAccount_value, true, 25, "Up");
					String amountXL = getTestdata("Amount");
					mobileAction.FuncSendKeys(txtAmount, amountXL);
					mobileAction.FuncClickDone();
					mobileAction.FuncClick(btncontinue_Transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");

					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					Thread.sleep(5000);

					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					// mobileAction.verifyElementIsDisplayed(exchangeRate,
					// "Exchange Rate");
					mobileAction.verifyElementIsDisplayed(makeAnthTran_Button, "MAKE ANOTHER Transfer");
					// mobileAction.FuncClick(btnMenu, "Menu");
					// mobileAction.FuncClick(btnLogout, "Logout");
					// mobileAction.verifyElementIsDisplayed(logoutHeader,
					// "Logged Out");
				} else {
					perFormTransfer();
					mobileAction.FuncClick(btncontinue_Transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.FunCnewSwipe(makeAnthTran_Button, false, 1);
					mobileAction.verifyElementIsDisplayed(makeAnthTran_Button, "MAKE ANOTHER Transfer");

					// mobileAction.FuncClick(btnMenu, "Menu");
					// mobileAction.FuncClick(btnLogout, "Logout");
					// mobileAction.verifyElementIsDisplayed(logoutHeader,
					// "Logged Out");

				}
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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void mobileRateExpiryOnSmartphones() {

		Decorator();
		try {
			perFormTransfer();
			mobileAction.FuncClick(btncontinue_Transfer, "Continue");
			mobileAction.waitForElementToVanish(txtProgressBar);
			mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				WebDriverWait wait = new WebDriverWait(CL.GetAppiumDriver(), 122);
				wait.until(ExpectedConditions.visibilityOf(ok_Button));
				mobileAction.FuncClick(ok_Button, "OK");

			} else {
				mobileAction.FuncWaitForElement(ok_Button, 122, "Ok");
				mobileAction.FuncClick(ok_Button, "OK");
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
	 * This method will transfer on mobile from C10 to U04 && U02 to C06 && U03
	 * to C16.
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

	public void permissible_transfer_on_mobile() {
		Decorator();

		String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("FromAccount") + "')]";

		String select_to_Acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'"
				+ getTestdata("ToAccount") + "')]";

		try {
			if (mobileAction.verifyElementIsPresent(btw_My_Accounts_Header)) {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClick(from_acnt, "From Account");
					String from_AccountNo = getTestdata("FromAccount");
					String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
					mobileAction.FuncClick(to_Acnt, "To Account");
					String to_accountNo = getTestdata("ToAccount");
					String toAccount_value = "//XCUIElementTypeStaticText[contains(@label,'" + to_accountNo + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(toAccount_value, true, 25, "Up");
					String amountXL = getTestdata("Amount");
					mobileAction.FuncSendKeys(amount, amountXL);
					mobileAction.FuncClickDone();
					mobileAction.FuncClick(btncontinue_Transfer, "Continue");
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.verifyElementIsDisplayed(exchangeRate, "Exchange Rate");
					mobileAction.FuncClick(btnMenu, "Menu");
					mobileAction.FuncClick(btnLogout, "Logout");
				} else {

					mobileAction.FuncClick(txtFrom_acnt, "From Account");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 2, "down", true);
					mobileAction.FuncClick(txtto_Acnt, "To Account");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_Acnt, 10, "down", true);
					mobileAction.FuncClick(txtAmount, "Amount");
					mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(btncontinue_Transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.FuncClick(btnMenu, "Menu");
					mobileAction.FuncClick(btnLogout, "Logout");
					mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
				}
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
	 * This method will perform the transfer and get the amount of the from
	 * account
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

	public double transferTDCTCad_USDVisa() {
		Decorator();
		// String verify_from_acnt =
		// "//android.widget.TextView[@resource-id='com.td:id/accntNumberSum'
		// and @text='"
		// + getTestdata("FromAccount") + "']";
		double fromAccountval = 0.00;
		try {
			perFormTransfer();
			continueButton();
			fromAccountval = verifyAccountbalanceAndConfirmationNumber();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
		return fromAccountval;
	}

	/**
	 * This method will perform the transfer and get the amount of the from
	 * account
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

	public void transfer_TFSAUSD_TFSACAD() {
		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(btw_My_Accounts_Header)) {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClick(txtFrom_acnt, "From Account");
					String from_AccountNo = getTestdata("FromAccount");
					String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
					mobileAction.FuncClick(to_Acnt, "To Account");
					String to_accountNo = getTestdata("ToAccount");
					String toAccount_value = "//XCUIElementTypeStaticText[contains(@label,'" + to_accountNo + "')]";
					if (!mobileAction.FuncSwipeEnsureElementNotFoundByxpath(toAccount_value, 25, "Up")) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					}

				} else {
					String from_Account = getTestdata("FromAccount");

					String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
							+ from_Account + "']";
					mobileAction.FuncClick(txtFrom_acnt, "From Account");
					mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 10, "down", true);
					mobileAction.waitForElementToDisappear(select_from_acnt);

					mobileAction.FuncClick(txtto_Acnt, "To Account");
					String to_account = getTestdata("ToAccount");
					String select_to_Acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
							+ to_account + "']";

					if (!mobileAction.FuncElementNotInListSwipe(acntsList, select_to_Acnt, 12, "down")) {
						CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					}

					// perFormTransfer() ;
					// mobileAction.FuncClick(btncontinue_Transfer, "Continue");
					// mobileAction.verifyElementIsDisplayed(txtConfirmHeader,
					// "ConfirmHeader");
					// mobileAction.FuncClick(btnFinish_Transfer, "Finish
					// Transfer");
					// mobileAction.verifyElementIsDisplayed(receiptHeader,
					// "ReceiptHeader");
					// mobileAction.verifyElementIsDisplayed(cnfrDetail,
					// "Confirm Details");
					// mobileAction.FuncClick(btnMenu, "Menu");
					// mobileAction.FuncClick(txtMy_Accounts, "My Accounts");
					// mobileAction.FuncElementSwipeWhileNotFound(acntsListNew,
					// account_verify_from_acnt, 10, "down", true);
					// mobileAction.verifyElementIsDisplayed(fromAccountNumber,
					// "From Account Number");
					// mobileAction.verifyElementIsDisplayed(fromAccountbal,
					// "From Account Balance Displayed");
					// mobileAction.FuncClick(backBtn, "Back");
					// mobileAction.FuncElementSwipeWhileNotFound(acntsListNew,
					// account_verify_to_Acnt, 10, "down", true);
					// mobileAction.verifyElementIsDisplayed(toAccountNumber,
					// "From Account Number");
					// mobileAction.verifyElementIsDisplayed(toAccountbal, "From
					// Account Balance Displayed");

				}
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

	public void verify_permissible_transfer() {
		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(btw_My_Accounts_Header)) {
				// \mobileAction.FuncClick(txtFrom_Acnt, "From Account");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

					String from_AccountNo = getTestdata("Payee");
					String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
					// String account_value = "//*[contains(@label,'" +
					// from_AccountNo + "')]";
					// MobileElement fromAccountval = (MobileElement)
					// ((AppiumDriver) CL.GetDriver())
					// .findElement(By.xpath(account_value));
					// mobileAction.FunCSwipeandScroll(fromAccountval, true);
					mobileAction.FuncClick(fromAccount, "fromAccountNo");
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 10, "up");
					String amountXL = getTestdata("Amount");
					mobileAction.FuncSendKeys(txtAmount, amountXL);
					mobileAction.FuncClickDone();
					mobileAction.FuncClick(btncontinue_Transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");

					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");

					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.FuncClick(btnMenu, "Menu");
				} else {
					/*
					 * String select_fromaccountvalue =
					 * "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
					 * + from_Account+ "']"; MobileElement fromAccountval =
					 * (MobileElement) ((AppiumDriver) CL.GetDriver())
					 * .findElement(By.xpath(select_fromaccountvalue));
					 * mobileAction.FunCnewSwipe(fromAccountval, false, 7);
					 * //mobileAction.FunCSwipeandScroll(fromAccountval, true);
					 * mobileAction.FuncElementSwipeWhileNotFound(acntsList,
					 * select_fromaccountvalue, 6, "down", true);
					 * mobileAction.waitForElementToDisappear(
					 * select_fromaccountvalue);
					 * mobileAction.FuncClick(txtto_Acnt, "To Account");
					 * mobileAction.FuncElementSwipeWhileNotFound(acntsList,
					 * select_toaccountvalue, 6, "down", true); String amountXL
					 * = getTestdata("Amount");
					 * mobileAction.FuncSendKeys(txtAmount, amountXL);
					 * mobileAction.FuncHideKeyboard();
					 */
					perFormTransfer();
					mobileAction.FuncClick(btncontinue_Transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.FunCnewSwipe(makeAnthTran_Button, false, 1);
					mobileAction.verifyElementIsDisplayed(makeAnthTran_Button, "MAKE ANOTHER Transfer");
					mobileAction.FuncClick(btnMenu, "Menu");
					mobileAction.FuncClick(btnLogout, "Logout");
					mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
				}
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

	public void RTB_permissible_transfer() {
		Decorator();
		try {
			if (mobileAction.verifyElementIsPresent(btw_My_Accounts_Header)) {
				// \mobileAction.FuncClick(txtFrom_Acnt, "From Account");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					String from_AccountNo = getTestdata("Payee");
					String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
					// String account_value = "//*[contains(@label,'" +
					// from_AccountNo + "')]";
					// MobileElement fromAccountval = (MobileElement)
					// ((AppiumDriver) CL.GetDriver())
					// .findElement(By.xpath(account_value));
					// mobileAction.FunCSwipeandScroll(fromAccountval, true);
					mobileAction.FuncClick(fromAccount, "fromAccountNo");
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 10, "up");
					String amountXL = getTestdata("Amount");
					mobileAction.FuncSendKeys(txtAmount, amountXL);
					mobileAction.FuncClickDone();
					mobileAction.FuncClick(btncontinue_Transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");

					// Thread.sleep(105000);
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");

					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.FuncClick(btnMenu, "Menu");
				} else {
					perFormTransfer();
					mobileAction.FuncClick(btncontinue_Transfer, "Continue");
					mobileAction.verifyElementIsDisplayed(txtConfirmHeader, "ConfirmHeader");
					mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
					mobileAction.verifyElementIsDisplayed(receiptHeader, "ReceiptHeader");
					mobileAction.verifyElementIsDisplayed(cnfrDetail, "Confirm Details");
					mobileAction.verifyElementIsDisplayed(fromAccountValue, "From Account Value");
					mobileAction.verifyElementIsDisplayed(ToAccountValue, "To Account Value");
					mobileAction.verifyElementIsDisplayed(amountValue, "Amount Value");
					mobileAction.FunCnewSwipe(makeAnthTran_Button, false, 1);
					mobileAction.verifyElementIsDisplayed(makeAnthTran_Button, "MAKE ANOTHER Transfer");
					mobileAction.FuncClick(btnMenu, "Menu");
					mobileAction.FuncClick(btnLogout, "Logout");
					mobileAction.verifyElementIsDisplayed(logoutHeader, "Logged Out");
				}
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
	 * This method will verify text within elements for transfer between
	 * accounts
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyBetweenMyAccountsTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='BETWEENMYACCOUNTS_FROM'
				// and @label='" +
				// mobileAction.getAppString("transfersBetweenMyAccountsConfirmFromAccount")
				// + "']", "from account");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("from_account_hint") + "']",
				// "from account hint");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='"
								+ mobileAction.getAppString("transfersBetweenMyAccountsConfirmToAccount") + "']",
						"to account");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='"
								+ mobileAction.getAppString("str_transfers_select_to_account") + "']",
						"to account hint");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='"
								+ mobileAction.getAppString("transfersBetweenMyAccountsFieldTitleAmount") + "']",
						"amount");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("btn_continue") + "']",
						"continue");
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("transfersTransfersNavRowHeaderBetweenMyAccounts") + "']",
						"Between My accounts title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/fromLabel' and @text='"
								+ mobileAction.getAppString("from") + "']",
						"From");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='"
								+ mobileAction.getAppString("from_account_hint") + "']",
						"Select From Account");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/toLabel' and @text='"
								+ mobileAction.getAppString("to") + "']",
						"To");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/edtToAccount' and @text='"
								+ mobileAction.getAppString("to_account_hint") + "']",
						"Select To Account");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/amount_label' and @text='"
								+ mobileAction.getAppString("transfersBetweenMyAccountsConfirmAmount") + "']",
						"Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/button_footer' and (@text='"
								+ mobileAction.getAppString("btn_continue") + "' or @text='"
								+ mobileAction.getAppString("str_continue") + "')]",
						"Continue");
			}
		} catch (NoSuchElementException | IOException e) {
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
	 * This method will verify text within elements for transfer confirmation
	 * page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyConfirmationTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("review_details_title") + "']", "Confirm title");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='"
								+ mobileAction.getAppString("transfersBetweenMyAccountsConfirmNotice") + "']",
						"Please review message");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_From") + "']", "From");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_To") + "']", "To");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='"
								+ mobileAction.getAppString("transfersBetweenMyAccountsConfirmAmount") + "']",
						"Amount");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("transfersFXExchangeRate") + "']", "Exchange Rate");

				mobileAction
						.verifyElementUsingXPath(
								"//XCUIElementTypeStaticText[contains(@value, '" + mobileAction.getAppString(
										"transfersBetweenMyAccountsConfirmFXTransferFeeValidStart") + "')]",
								"Exchange Rate is valid for message");
				mobileAction
						.verifyElementUsingXPath(
								"//XCUIElementTypeStaticText[contains(@value, '" + mobileAction
										.getAppString("transfersBetweenMyAccountsConfirmFXTransferFeeValidEnd") + "')]",
								"Minutes message");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("btn_cancel") + "']", "Cancel");
				mobileAction
						.verifyElementUsingXPath(
								"//XCUIElementTypeButton[@label='" + mobileAction
										.getAppString("transfersBetweenMyAccountsConfirmButtonFinishTransfer") + "']",
								"Finish Transfer");

			} else {
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("ActionBar_Deposit_Confirm") + "']",
								"Confirm title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("transfersBetweenMyAccountsConfirmNotice") + "']",
						"Please review message");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("from") + "']", "From");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("to") + "']", "To");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("transfersBetweenMyAccountsConfirmAmount") + "']",
						"Amount");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("transfersFXExchangeRate") + "']", "Exchange Rate");

				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@text='" + mobileAction.getAppString(
										"transfersBetweenMyAccountsConfirmFXTransferFeeValidStart") + "']",
								"Exchange Rate is valid for message");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@text='" + mobileAction.getAppString(
										"transfersBetweenMyAccountsConfirmFXTransferFeeValidStart") + "']",
								"Exchange Rate is valid for message");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[contains(@text, '" + mobileAction
										.getAppString("transfersBetweenMyAccountsConfirmFXTransferFeeValidEnd") + "')]",
								"Minutes message");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='" + mobileAction.getAppString("btn_cancel") + "']", "Cancel");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.Button[@text='" + mobileAction
										.getAppString("transfersBetweenMyAccountsConfirmButtonFinishTransfer") + "']",
								"Finish Transfer");

			}
		} catch (NoSuchElementException | IOException e) {
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
	 * This method will verify text within elements for transfer success page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifySuccessPageTextElements() throws InterruptedException, IOException {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("actionBarHeadingReceipt") + "']", "Receipt title");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("thank_you") + "']",
						"Thank you!");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("receipt_transfer_msg") + "']", "transfer successful");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[contains(@value, '"
						+ mobileAction.getAppString("receipt_confirmation") + "')]", "confirmation number");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("receipt_from") + "']",
						"Receipt from");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='"
								+ mobileAction.getAppString("transfersBetweenMyAccountsConfirmToAccount") + "']",
						"Receipt To");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[contains(@value, '"
						+ mobileAction.getAppString("receipt_amount") + "')]", "amount");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[contains(@value, '"
						+ mobileAction.getAppString("transfersFXExchangeRate") + "')]", "exchange rate");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeCell[@label='" + mobileAction.getAppString("receipt_home") + "']", "Cancel");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeCell[@label='" + mobileAction.getAppString("receipt_another_transfer") + "']",
						"Make another transfer");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeCell[@label='" + mobileAction.getAppString("receipt_transfers") + "']",
						"Finish Transfer");
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("actionBarHeadingReceipt") + "']",
						"Receipt title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/thank_you' and @text='"
								+ mobileAction.getAppString("receipt_thankyou") + "']",
						"Thank you!");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/message' and @text='"
										+ mobileAction.getAppString("receipt_transfer_msg") + "']",
								"Transfer Successful");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/confirmation' and @text='"
								+ mobileAction.getAppString("receipt_confirmation") + "']",
						"Confirmation");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/from_account' and @text='"
								+ mobileAction.getAppString("receipt_from") + "']",
						"From");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/to_account' and @text='"
								+ mobileAction.getAppString("receipt_to") + "']",
						"To");
				mobileAction
						.verifyElementUsingXPath("//android.widget.TextView[@resource-id='com.td:id/amount' and @text='"
								+ mobileAction.getAppString("receipt_amount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("transfersFXExchangeRate") + "']", "Exchange Rate");

				// final String xPathFooter =
				// "//android.widget.TableRow[@resource-id='tableRow1']";
				// mobileAction.FuncSwipeWhileElementNotFoundByxpath(xPathFooter,
				// false, 4, "up");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='home'
				// and @text='" + mobileAction.getAppString("receipt_home") +
				// "']", "HOME button");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='etransfers'
				// and @text='" +
				// mobileAction.getAppString("receipt_another_transfer") + "']",
				// "MAKE ANOTHER TRANSFER button");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='transfers'
				// and @text='" + mobileAction.getAppString("receipt_transfers")
				// + "']", "TRANSFERS button");

			}
		} catch (NoSuchElementException | IOException e) {
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
