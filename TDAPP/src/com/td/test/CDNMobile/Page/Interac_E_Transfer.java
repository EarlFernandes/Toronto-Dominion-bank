package com.td.test.CDNMobile.Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.webdriven.commands.GetText;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Interac_E_Transfer extends _CommonPage {

	private static Interac_E_Transfer Interac_E_Transfer;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement transfers_header;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
	private MobileElement Interac_e_Transfer_button;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/from_account_title' and @text='From Account'and @index='3']")
	private MobileElement from_account;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edt_etransfer_recipient' and @index='0' and @text='Select Recipient']")
	private MobileElement Select_Recipient;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/edt_etransfer_amount'and @text='$0.00']")
	private MobileElement amount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/button_footer'and @text='Continue']")
	private MobileElement continue_transfer;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/edt_etransfer_message'and @text='Optional']")
	private MobileElement message;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/button_footer'and @text='Continue']")
	private MobileElement continue_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'android:id/action_bar_title'and @text='Confirm']")
	private MobileElement transfer_confirm_page;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id= 'com.td:id/btn_send_money'and @text='Send Money']")
	private MobileElement send_Money_btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/thank_you'and @text='Thank you!']")
	private MobileElement confirm_transfer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/confirmation_val']")
	private MobileElement Confirmation_Value;

	String transfer_Header_Value = "Transfers";
	String confirm_Header = "Confirm";
	String confirm_transfer_value = "Thank you!";

	public synchronized static Interac_E_Transfer get() {
		if (Interac_E_Transfer == null) {
			Interac_E_Transfer = new Interac_E_Transfer();
		}
		return Interac_E_Transfer;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");

	}

	public void interac_e_Transfer() {

		System.out.println("Trial for Page factory class");
		Decorator();
		try {

			mobileAction.FuncClick(from_account, "FROM ACCOUNT");
			mobileAction.FuncClick(Select_Recipient, "SELECT RECIPIENT");
			mobileAction.FuncClick(amount, "AMOUNT");
			String amount_Value = getTestdata("Amount", "UserIDs");
			mobileAction.FuncSendKeys(amount, amount_Value);
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(message, "MESSAGE");
			String transfer_message = getTestdata("Message", "UserIDs");
			mobileAction.FuncSendKeys(message, transfer_message);
			mobileAction.FuncClick(continue_btn, "CONTINUE_BUTTON");
			mobileAction.verifyElement(transfer_confirm_page, confirm_Header);
			mobileAction.FuncClick(send_Money_btn, "SEND MONEY");
			mobileAction.verifyElement(confirm_transfer, confirm_transfer_value);
			mobileAction.FuncLongPress(Confirmation_Value);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
