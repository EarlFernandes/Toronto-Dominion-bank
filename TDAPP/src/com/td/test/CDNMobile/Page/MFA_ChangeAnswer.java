package com.td.test.CDNMobile.Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MFA_ChangeAnswer extends _CommonPage {

	private static MFA_ChangeAnswer MFA_ChangeAnswer;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.tdbank:id/core_clearable_edit_text' and @index='0']")
	// @AndroidFindBy(name="123")
	private MobileElement SavingAccount;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.tdbank:id/core_clearable_edit_text' and @index='0']")
	// @AndroidFindBy(name="123")
	private MobileElement CheckingAccount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='My Accounts']")
	private MobileElement accounts_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Preferences']")
	private MobileElement preferences_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Preferences']")
	private MobileElement preferences;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Update Security Questions' and @resource-id='android:id/action_bar_title']")
	private MobileElement security_Question_header;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_answer' and @index='1']")
	private MobileElement security_Answer;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_confirm_answer' and @index='3']")
	private MobileElement confirm_security_Answer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mfa_question' and @index='0']")
	private MobileElement security_Question;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/btn_save' and @text='Save Changes']")
	private MobileElement save_Changes;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/questionTextView' and @text='The security question was updated successfully']")
	private MobileElement secret_answer_updated;

	public synchronized static MFA_ChangeAnswer get() {
		if (MFA_ChangeAnswer == null) {
			MFA_ChangeAnswer = new MFA_ChangeAnswer();
		}
		return MFA_ChangeAnswer;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");

	}

	public void mfa_update() {
		Decorator();

		String security_header = "Update Security Questions";
		String security_ans_updated = "The security question was updated successfully";
		try {

			mobileAction.verifyElement(security_Question_header, security_header);
			System.out.println("security_Question_header:" + security_Question_header.isDisplayed());

			mobileAction.FuncClick(security_Question, "Security_Question");

			mobileAction.FuncClick(security_Answer, "security_Answer");
			String secret_Answer_value = getTestdata("SecurityAnswer", "UserIDs");
			System.out.println("secret_Answer_value:" + secret_Answer_value);
			mobileAction.FuncSendKeys(security_Answer, secret_Answer_value);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(confirm_security_Answer, "Confirm_Security_Answer");
			String confirm_Sec_Answer_value = getTestdata("SecurityAnswer", "UserIDs");
			mobileAction.FuncSendKeys(confirm_security_Answer, confirm_Sec_Answer_value);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(save_Changes, "Save_Changes");

			mobileAction.verifyElement(secret_answer_updated, security_ans_updated);
			System.out.println("The security question was updated successfully:" + secret_answer_updated.isDisplayed());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
