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

public class Pay_US_Bill extends _CommonPage {

	private static Pay_US_Bill Pay_US_Bill;

	@iOSFindBy(xpath = "//*[contains(@label,'Select from account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_name' and @text='Select From Account']")
	private MobileElement from_account;

	String already_selected_from_account = "//*[contains(@label,'";
	// private MobileElement already_selected_from_account;

	@iOSFindBy(xpath = "//*[@label='Pay U.S. Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pay U.S. Bill']")
	private MobileElement US_Bill_Header;

	@iOSFindBy(xpath = "//*[contains(@label,'Select U.S. payee')]")
	private MobileElement select_account;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amount']")
	private MobileElement amount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer' and @text='Continue']")
	private MobileElement Continue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payee_name' and @text='Select U.S. Payee']")
	private MobileElement select_payee_account;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.td:id/button_left' and @text='USD']")
	private MobileElement select_usd;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@name='-Reason']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/reason_for_payment' and @text='Required (e.g. bill payment)']")
	private MobileElement reasonForPayment;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Important Note: As this involves a large amount in foreign exchange, please ensure the Amount is correct.']")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Important Note')]")
	private MobileElement verify_message;

	@iOSFindBy(xpath = "//*[@label='Currency']")
	private MobileElement currency_switchbox;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='2']")
	private MobileElement acntList;

	@iOSFindBy(xpath = "//*[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer' and @text='Pay Bill')]")
	private MobileElement pay_bill_button;

	int i = 1;
	String select_account_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";

	String to_account_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + i + Secondpart;

	String to_accountno = MainScreen.valueMap.get("ToAccount");
	String to_account = "//android.widget.TextView[@resource-id='com.td:id/subtitle' and @text='" + to_accountno + "']";
	String us_accountno = MainScreen.valueMap.get("USAccount");
	String select_from_account = "//android.widget.TextView[starts-with(@text,'" + us_accountno + "']";

	public synchronized static Pay_US_Bill get() {
		if (Pay_US_Bill == null) {
			Pay_US_Bill = new Pay_US_Bill();
		}
		return Pay_US_Bill;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	/**
	 * This method will Pay the US bills
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
	public void pay_US_bill_ErrorMsg() throws Exception {

		try {
			Decorator();
			String verification_message = "As this involves a large amount in foreign exchange, please ensure the Amount is correct";
			String paybill = "Verification Page Is Dispalyed with PayBill Button";

			String amount_value = MainScreen.valueMap.get("Amount");
			String reason_value = MainScreen.valueMap.get("Reason");

			String to_accountno = MainScreen.valueMap.get("ToAccount");
			String to_account = "//android.widget.TextView[@resource-id='com.td:id/subtitle' and @text='" + to_accountno
					+ "']";
			if (platformName.equalsIgnoreCase("ios")) {
				boolean flag = US_Bill_Header.isDisplayed();
				if (flag)
				mobileAction.FuncClick(from_account, "From_Account");
				String select_accountno = MainScreen.valueMap.get("FromAccount");
				mobileAction.FuncSelectElementInTable(select_account_table, Firstpart, Secondpart, select_accountno);

				mobileAction.FuncClick(select_account, "Select_Account");

				mobileAction.FuncSelectElementInTable(to_account_table, Firstpart, Secondpart, to_accountno);
				mobileAction.FuncClick(amount, "Amount");

				mobileAction.FuncSendKeys(amount, amount_value);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(reasonForPayment, "Reason");

				mobileAction.FuncSendKeys(reasonForPayment, reason_value);

				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(Continue, "continue");

				mobileAction.verifyElementIsDisplayed(pay_bill_button, paybill);
				mobileAction.verifyElementIsDisplayed(verify_message, verification_message);
				
			} else {

				

				String PayUSBill_header = "Verifying Pay US Bill Page Header";
				mobileAction.verifyElementIsDisplayed(US_Bill_Header, PayUSBill_header);

				mobileAction.FuncClick(from_account, "Select From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList, from_account, 0, "down", true);

				mobileAction.FuncClick(select_payee_account, "Select Payee Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList, to_account, 0, "down", true);

				mobileAction.FuncClick(amount, "Amount");
				mobileAction.FuncSendKeys(amount, amount_value);

				mobileAction.FuncClick(reasonForPayment, "Reason");
				mobileAction.FuncSendKeys(reasonForPayment, reason_value);
				mobileAction.FuncClick(Continue, "continue");
				mobileAction.verifyElementIsDisplayed(pay_bill_button, paybill);
				mobileAction.verifyElementIsDisplayed(verify_message, verification_message);
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the currency drop down in PAY US bill page.
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

	public void verifyCurrencyDropDown() throws Exception {
		try {
			String t_currencyswitchbox="The currency switchbox is displayed";
			Decorator();
			if (platformName.equalsIgnoreCase("ios")) {
				boolean flag = US_Bill_Header.isDisplayed();

				if (flag)
				mobileAction.FuncClick(from_account, "From_Account");
				String us_accountno = MainScreen.valueMap.get("USAccount");
				mobileAction.FuncSelectElementInTable(select_account_table, Firstpart, Secondpart, us_accountno);
				boolean elementExists = currency_switchbox.isDisplayed();
				mobileAction.verifyElementIsDisplayed(currency_switchbox, "");
				if (!elementExists) {
					String Finalpart = already_selected_from_account + us_accountno + "')]";

					CL.GetDriver().findElement(By.xpath(Finalpart)).click();;

					String from_accountno = MainScreen.valueMap.get("FromAccount");
					mobileAction.FuncSelectElementInTable(select_account_table, Firstpart, Secondpart, from_accountno);
					mobileAction.verifyElementIsDisplayed(currency_switchbox, "t_currencyswitchbox");
				

				}
			} else {
				mobileAction.FuncClick(from_account, "Select From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList, select_from_account, 0, "down", true);

				if (select_from_account.equalsIgnoreCase("US")) {
					boolean switchBox = mobileAction.verifyElement(select_usd, "USD");
					if (!switchBox){}
						
				} else {

					mobileAction.verifyElementIsDisplayed(select_usd, "USD");
				}

			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
}
