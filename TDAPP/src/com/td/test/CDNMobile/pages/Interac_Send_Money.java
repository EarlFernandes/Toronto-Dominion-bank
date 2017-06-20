package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Interac_Send_Money extends _CommonPage{

	private static Interac_Send_Money Interac_Send_Money;
	
	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	public synchronized static Interac_Send_Money get() {
		if (Interac_Send_Money == null) {
			Interac_Send_Money = new Interac_Send_Money();
		}
		return Interac_Send_Money;
	}

	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Send Money']")
	private MobileElement sendMoneyHeader;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/middle_textview' and @text='Select Recipient']")
	private MobileElement selectRecipient;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done' or @text='Done']")
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	private MobileElement done;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/send_money_amount_value_view']")
	private MobileElement amount;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button' or @resource-id='com.td:id/btn_footer' or @text='Continue']")
	private MobileElement continueButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info' and @text='Please enter a security question.']")
	private MobileElement errorMessage;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/send_money_security_question_edit_text' and @text='Enter a security question']")
	private MobileElement securityQuestion;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/send_money_security_answer_edit_text']")
	private MobileElement securityAnswer;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/send_money_security_confirm_answer_edit_text']")
	private MobileElement confirmAnswer;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Sender']")
	private MobileElement sender;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Sender']/following-sibling::android.widget.TextView")
	private MobileElement senderName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='From Account']")
	private MobileElement fromAccount;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='From Account']/following-sibling::android.widget.TextView")
	private MobileElement fromAccountName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Recipient']")
	private MobileElement recipient;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Recipient']/following-sibling::android.widget.TextView")
	private MobileElement recipientVal;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Recipient']/following-sibling::android.widget.TextView[2]")
	private MobileElement recipientEmail;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Security Question']")
	private MobileElement securityQuestionLbl;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Security Question']/following-sibling::android.widget.TextView")
	private MobileElement securityQuestionVal;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Answer']")
	private MobileElement securityAnswerLbl;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Answer']/following-sibling::android.widget.TextView")
	private MobileElement securityAnswerVal;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Amount']")
	private MobileElement amountLbl;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and @text='Amount']/following-sibling::android.widget.TextView")
	private MobileElement amountVal;
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}
	
	
	
	/**
	 * @author Ashraf This method will check if the error message is displayed then will transfer the money on Send Money Page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void sendMoneyWithError() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(sendMoneyHeader, "Header " + sendMoneyHeader.getText());
			mobileAction.FuncClick(selectRecipient, "Select Recipient");

			String recipientXpath = "//android.widget.TextView[@text='" + getTestdata("ToAccount")
					+ "']/preceding-sibling::android.widget.RadioButton";
			MobileElement recipient = (MobileElement) ((AppiumDriver) CL.GetDriver())
					.findElement(By.xpath(recipientXpath));
			mobileAction.FuncClick(recipient, "Recipient " + recipient.getText());
			mobileAction.FuncClick(done, "Done Button");
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(amount, "Amount");
			mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(continueButton, "ContinueButton");
			mobileAction.FunctionSwipe("down", 200, 200);
			mobileAction.verifyElementIsDisplayed(errorMessage, "Please enter a security question");
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(securityQuestion, "Security Question");
			mobileAction.FuncSendKeys(securityQuestion, getTestdata("SecurityQuestion"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(securityAnswer, "Enter A security answer");
			mobileAction.FuncSendKeys(securityAnswer, getTestdata("SecurityAnswer"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(confirmAnswer, "Confirm security answer");
			mobileAction.FuncSendKeys(confirmAnswer, getTestdata("SecurityAnswer"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(continueButton, "ContinueButton");

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	
	
	/**
	 * @author Ashraf This method will check if the error message is displayed then will transfer the money on Send Money Page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void sendMoney() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(sendMoneyHeader, "Header " + sendMoneyHeader.getText());
			mobileAction.FuncClick(selectRecipient, "Select Recipient");

			String recipientXpath = "//android.widget.TextView[@text='" + getTestdata("ToAccount")
					+ "']/preceding-sibling::android.widget.RadioButton";
			MobileElement recipient = (MobileElement) ((AppiumDriver) CL.GetDriver())
					.findElement(By.xpath(recipientXpath));
			mobileAction.FuncClick(recipient, "Recipient " + recipient.getText());
			mobileAction.FuncClick(done, "Done Button");
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(securityQuestion, "Security Question");
			mobileAction.FuncSendKeys(securityQuestion, getTestdata("SecurityQuestion"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(securityAnswer, "Enter A security answer");
			mobileAction.FuncSendKeys(securityAnswer, getTestdata("SecurityAnswer"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(confirmAnswer, "Confirm security answer");
			mobileAction.FuncSendKeys(confirmAnswer, getTestdata("SecurityAnswer"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(amount, "Amount");
			mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(continueButton, "ContinueButton");


		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	
	
	/**
	 * @author Ashraf This method will check if the error message is displayed then will transfer the money on Send Money Page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void sendMoneyVerifyDetails() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(sender, "Sender");
			mobileAction.verifyElementIsDisplayed(senderName, senderName.getText());
			mobileAction.verifyElementIsDisplayed(fromAccount, "From Account");
			mobileAction.verifyElementIsDisplayed(fromAccountName, fromAccountName.getText());
			mobileAction.verifyElementIsDisplayed(recipient, "Recipient");
			mobileAction.verifyTextEquality(recipientVal.getText(), getTestdata("ToAccount"));
			mobileAction.verifyElementIsDisplayed(recipientEmail, recipientEmail.getText());
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(securityQuestionLbl, "Security Question");
			mobileAction.verifyTextEquality(securityQuestionVal.getText(), getTestdata("SecurityQuestion"));
			mobileAction.verifyElementIsDisplayed(securityAnswerLbl, "Security Answer");
			mobileAction.verifyTextEquality(securityAnswerVal.getText(), getTestdata("SecurityAnswer"));
			mobileAction.verifyElementIsDisplayed(amountLbl, "Amount");
			mobileAction.verifyElementIsDisplayed(amountVal, "Amount "+amountVal.getText());
			mobileAction.FuncClick(continueButton, "Continue Button");
	

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	
	/**
	 * @author Ashraf This method will check if the error message is displayed then will transfer the money on Send Money Page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void sendMoneyVerifySuccessMsg() {
		Decorator();
		try {

			//TODO::ANDOID and IOS
	

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	

}
