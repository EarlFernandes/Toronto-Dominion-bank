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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'From Account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_name' and @text='Select From Account']")
	private MobileElement from_Account;

	String already_selected_from_Account = "//XCUIElementTypeStaticText[contains(@label,'";
	// private MobileElement already_selected_from_Account;

	@iOSFindBy(xpath = "//*[@label='Pay U.S. Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pay U.S. Bill']")
	private MobileElement us_Bill_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Payee')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payee_name' and @text='Select U.S. Payee']")
	private MobileElement select_Account;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amount']")
	private MobileElement amount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer' and @text='Continue']")
	private MobileElement Continue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/payee_name' and @text='Select U.S. Payee']")
	private MobileElement select_Payee_Account;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.td:id/button_left' and @text='USD']")
	private MobileElement select_Usd;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Required (e.g. bill payment)']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/reason_for_payment' and @text='Required (e.g. bill payment)']")
	private MobileElement reasonForPayment;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Important Note: As this involves a large amount in foreign exchange, please ensure the Amount is correct.']")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Important Note')]")
	private MobileElement verify_Message;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Currency']")
	private MobileElement currency_Switchbox;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='2']")
	private MobileElement acntList;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_footer' and @text='Pay Bill')]")
	private MobileElement pay_Bill_Button;

	int i = 1;
	String select_account_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";

	String to_account_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String firstPart = "//XCUIElementTypeCell[";
	String secondPart = "]/XCUIElementTypeStaticText[1]";
	String finalPart = firstPart + i + secondPart;

	String to_accountno = getTestdata("ToAccount");
	String to_account = "//android.widget.TextView[@resource-id='com.td:id/subtitle' and @text='" + to_accountno + "']";
	String us_accountno = getTestdata("USAccount");
	String select_from_Account = "//android.widget.TextView[starts-with(@text,'" + us_accountno + "']";

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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void pay_US_bill_ErrorMsg()  {

		try {
			Decorator();
			String verification_message = "As this involves a large amount in foreign exchange, please ensure the Amount is correct";
			String paybill = "Verification Page Is Dispalyed with PayBill Button";

			String amount_value = getTestdata("Amount");
			String reason_value = getTestdata("Reason");

			String to_accountno = getTestdata("ToAccount");
			System.out.println("To Account:" + to_accountno);
			System.out.println("Amount:" + amount_value);
			System.out.println("reason:" + reason_value);
			String to_account = "//android.widget.TextView[@resource-id='com.td:id/subtitle' and @text='" + to_accountno
					+ "']";
			if (platformName.equalsIgnoreCase("ios")) {
				boolean flag = us_Bill_Header.isDisplayed();
				if (flag){
					mobileAction.FuncClick(from_Account, "from_Account");
					String select_accountno = getTestdata("FromAccount");
					System.out.println("From Account:" + select_accountno);
					//mobileAction.FuncSelectElementInTable(select_account_table, firstPart, secondPart, select_accountno);
					String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + select_accountno + "')]";
					MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(account_value));
					mobileAction.FunCSwipeandScroll(fromAccountval, true);
					
					mobileAction.FuncClick(select_Account, "Select_Account");
					String to_account_value = "//XCUIElementTypeStaticText[contains(@label,'" + to_accountno + "')]";
					MobileElement toAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(to_account_value));
					mobileAction.FunCSwipeandScroll(toAccountval, true);	
					//mobileAction.FuncSelectElementInTable(to_account_table, firstPart, secondPart, to_accountno);
					
					mobileAction.FuncClick(amount, "Amount");
	
					mobileAction.FuncSendKeys(amount, amount_value);
					mobileAction.FuncClick(done, "Done");
					mobileAction.FuncClick(reasonForPayment, "Reason");
	
					mobileAction.FuncSendKeys(reasonForPayment, reason_value);
	
					mobileAction.FuncClick(done, "Done");
					mobileAction.FuncClick(Continue, "continue");
	
					mobileAction.verifyElementIsDisplayed(pay_Bill_Button, paybill);
					mobileAction.verifyElementIsDisplayed(verify_Message, verification_message);
				}
				
			} else {

				

				String PayUSBill_header = "Verifying Pay US Bill Page Header";
				mobileAction.verifyElementIsDisplayed(us_Bill_Header, PayUSBill_header);

				mobileAction.FuncClick(from_Account, "Select From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList, from_Account, 0, "down", true);

				mobileAction.FuncClick(select_Payee_Account, "Select Payee Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList, to_account, 0, "down", true);

				mobileAction.FuncClick(amount, "Amount");
				mobileAction.FuncSendKeys(amount, amount_value);

				mobileAction.FuncClick(reasonForPayment, "Reason");
				mobileAction.FuncSendKeys(reasonForPayment, reason_value);
				mobileAction.FuncClick(Continue, "continue");
				mobileAction.verifyElementIsDisplayed(pay_Bill_Button, paybill);
				mobileAction.verifyElementIsDisplayed(verify_Message, verification_message);
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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyCurrencyDropDown() {
		try {
			String t_currencyswitchbox="The currency switchbox is displayed";
			Decorator();
			if (platformName.equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(us_Bill_Header))
					mobileAction.FuncClick(from_Account, "from_Account");
					String us_accountno = getTestdata("USAccount");
					System.out.println("us_accountno" + us_accountno);
					String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + us_accountno + "')]";
					MobileElement fromAccountval = (MobileElement) ((AppiumDriver) CL.GetDriver())
							.findElement(By.xpath(account_value));
					mobileAction.FunCSwipeandScroll(fromAccountval, true);
					
					//mobileAction.FuncSelectElementInTable(select_account_table, firstPart, secondPart, us_accountno);
					boolean elementExists = currency_Switchbox.isDisplayed();
					mobileAction.verifyElementIsDisplayed(currency_Switchbox, "");
					if (!elementExists) {
						String finalPart = already_selected_from_Account + us_accountno + "')]";
	
						CL.GetDriver().findElement(By.xpath(finalPart)).click();;
	
						String from_Accountno = getTestdata("FromAccount");
						mobileAction.FuncSelectElementInTable(select_account_table, firstPart, secondPart, from_Accountno);
						mobileAction.verifyElementIsDisplayed(currency_Switchbox, "t_currencyswitchbox");
					
	
					}
				
			} else {
				mobileAction.FuncClick(from_Account, "Select From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntList, select_from_Account, 0, "down", true);

				if (select_from_Account.equalsIgnoreCase("US")) {
					boolean switchBox = mobileAction.verifyElement(select_Usd, "USD");
					if (!switchBox){}
						
				} else {

					mobileAction.verifyElementIsDisplayed(select_Usd, "USD");
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
}
