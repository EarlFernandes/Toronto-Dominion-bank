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

public class Bill_PayCanada extends _CommonPage {

	private static Bill_PayCanada Bill_PayCanada;

	@iOSFindBy(xpath = "//*[@label='Transfers']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
	private MobileElement from_account_post;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber'and @text='6450943']")
	private MobileElement frm_acnt_post;

	@iOSFindBy(xpath = "//*[@label='Payee, Select Payee']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee' and @text='Select Payee']")
	private MobileElement to_account_post;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='GLOBE & MAIL 123456789012']")
	private MobileElement to_acnt_post;

	@iOSFindBy(xpath = "//*[@label='From Account, Select from account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
	private MobileElement from_account;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement accountListView;

	String FromAccountXL = getTestdata("FromAccount", "UserIDs");

	String FromAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='"
			+ FromAccountXL + "']";

	@iOSFindBy(xpath = "//*[@label='From Account, Select from account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='PREFERRED CHEQUING ACCOUNT']")
	private MobileElement select_from_acnt;

	String t_select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='PREFERRED CHEQUING ACCOUNT']";

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button' and @text='Cancel']")
	private MobileElement clickCancle;

	@iOSFindBy(xpath = "//*[@label='From Account, Select from account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee' and @text='Select Payee']")
	private MobileElement to_account;

	String t_select_to_account = "//android.widget.TextView[@resource-id='com.td:id/edtPayee' and @text='Select Payee']";

	String ToAccountXL = getTestdata("ToAccount", "UserIDs");

	String ToAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='"
			+ ToAccountXL + "']";

	@iOSFindBy(xpath = "//")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='TD CLASSIC TRAVEL VIS... 4520020000005323']")
	private MobileElement select_to_account;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/edtAmt'and @index='1']")
	private MobileElement amount;

	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/edtAmount' and
	// @text='$0.00']")
	// private MobileElement amount;
	// String t_amount = "$0.00";

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtDate' and @index='1']")
	private MobileElement date;

	@iOSFindBy(xpath = "//*[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Continue']")
	private MobileElement continue_pay;

	@iOSFindBy(xpath = "//*[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue'and @text='Pay Bill']")
	private MobileElement pay_bill;

	@iOSFindBy(xpath = "//*[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_val;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//*[@label='Pay Bill']")
	private MobileElement payBill_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title'and @text='My Accounts']")
	private MobileElement my_accounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntDescrSum' and @text='PREFERRED CHEQUING ACCOUNT']")
	private MobileElement verify_from_account;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@text='' and @index='0']//android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement last_transaction;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[@label='Add Canadian Payee']")
	private MobileElement addCanada_Payee;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	private MobileElement progrees_bar;

	@iOSFindBy(xpath = "//*[@label='Search for Canadian payees']")
	private MobileElement search_bar;

	@iOSFindBy(xpath = "//*[@label='Add Canadian Payee']")
	private MobileElement addCanada_Payee_header;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation # :' and @resource-id='com.td:id/confirmation']")
	private MobileElement confirmation_text;

	@iOSFindBy(xpath = "//*[@label='Select Payee']")
	private MobileElement select_payee;
	

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement ListViewToAccount;

	int m = 1;
	String Conf = "Confirmation";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + m + Secondpart;

	@iOSFindBy(xpath = "//*[@label=Thank you!']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Thank you!' and @resource-id='com.td:id/thank_you']")
	private MobileElement confirmationText;
	
	
	String t_confirmationText = "Thank you!";

	String t_frm_acnt_post = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber'and @text='6450943']";

	String t_to_acnt_post = "////android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='GLOBE & MAIL 123456789012']";
	
	

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	String merchant_name = "//*[contains(@label,'";

	String payee_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";

	public synchronized static Bill_PayCanada get() {
		if (Bill_PayCanada == null) {
			Bill_PayCanada = new Bill_PayCanada();
		}
		return Bill_PayCanada;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");
	}

	public void pay_candadian_bill() throws Exception {

		try {
			String payeeAccount = getTestdata("FromAccount", "UserIDs");
			String ToPostAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='"
					+ payeeAccount + "']";
			Decorator();

			if (platformName.equalsIgnoreCase("ios")) {

				payBill_Header.isDisplayed();
				

				mobileAction.FuncClick(select_payee, "SelectPayee");
				mobileAction.FuncSelectElementInTable(payee_table, Firstpart, Secondpart, payeeAccount);

				mobileAction.FuncClick(amount, "Amount button clicked");
				System.out.println("Amount has been clicked");
				String Amount = getTestdata("Amount", "UserIDs");
				System.out.println(Amount);
				mobileAction.FuncSendKeys(amount, Amount);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				System.out.println("Pay bill done");
				
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(confirmationText, "Thank You!");
				System.out.println("Verified Text");
				mobileAction.verifyElementIsDisplayed(confirmation_val, "Confirmation Value");
				System.out.println("Verified Confirmation Value");
				

			}

			else {
				
				mobileAction.FuncClick(to_account_post, "Select Payee");
				mobileAction.FuncElementSwipeWhileNotFound(ListViewToAccount, ToPostAccountXpath, 1, "up", true);
				mobileAction.waitForElementToDisappear(t_select_to_account);
				
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount", "UserIDs"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.verifyElement(confirmationText, t_confirmationText);
				
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {

			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void pay_candadian_bill_post_dated() {

		Decorator();
		try {

			if (platformName.equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(from_account_post, "From Account");

				mobileAction.FuncClick(to_account_post, "Select Payee");

				System.out.println(CL.GetDriver().getPageSource());

				System.out.println(CL.GetDriver().getPageSource());

				mobileAction.FuncClick(done, "Done");

			}

			mobileAction.FuncClick(from_account_post, "From Account");
			mobileAction.FuncClick(frm_acnt_post, "6450943");
			mobileAction.waitForElementToDisappear(t_frm_acnt_post);

			mobileAction.FuncClick(to_account_post, "Select Payee");
			mobileAction.FuncClick(to_acnt_post, "GLOBE & MAIL 123456789012");
			mobileAction.waitForElementToDisappear(t_select_to_account);

			mobileAction.FuncClick(amount, "Amount");
			String ValueofAmount = getTestdata("Amount", "UserIDs");
			mobileAction.FuncSendKeys(amount, ValueofAmount);
			System.out.println("amount entered" + ValueofAmount);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(date, "Date");

			String date = String.valueOf(GetDate.get().getTomorrowsDate());
			String post_date = "//android.view.View[@content-desc='" + date + "']";
			mobileAction.findElementByXpathAndClick(post_date);
			// mobileAction.FuncClick(select_post_date);
			mobileAction.FuncClick(continue_pay, "Continue Pay");
			mobileAction.FuncClick(pay_bill, "Pay bill");

			// mobileAction.verifyTextContains(confirmation_text, Conf);
			mobileAction.verifyElement(confirmationText, t_confirmationText);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void addCanadianPayee() {
		Decorator();
		try {

			Thread.sleep(15000);
			mobileAction.FuncClick(addCanada_Payee, "CanadaPayee");
			mobileAction.waitForElementToVanish(progrees_bar);
			mobileAction.FuncClick(search_bar, "SearchforCanadianPayees");
			String search_bar_value = getTestdata("Search", "UserIDs");
			System.out.println(search_bar_value);
			mobileAction.FuncSendKeys(search_bar, search_bar_value);

			mobileAction.waitForElementToVanish(progrees_bar);

			String merchant_value = getTestdata("MerchantName", "UserIDs");
			System.out.println(merchant_value);
			String merchant_name_value = merchant_name + merchant_value + "')]";
			CL.GetDriver().findElement(By.xpath(merchant_name_value)).click();

			mobileAction.waitForElementToVanish(progrees_bar);

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
}
