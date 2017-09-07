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

public class Interac_Send_Money extends _CommonPage {

	private static Interac_Send_Money Interac_Send_Money;

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	public synchronized static Interac_Send_Money get() {
		if (Interac_Send_Money == null) {
			Interac_Send_Money = new Interac_Send_Money();
		}
		return Interac_Send_Money;
	}

	// TODO::use mobileAction.mobileElementUsingXPath(element); method for
	// converting all xpaths to elements

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Send Money') or contains(@label,'Virer des fonds')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement sendMoneyHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Select Recipient' or @label='Sélectionnez le destinataire']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/middle_textview' and (@text='Select Recipient' or @text='Sélectionnez le destinataire')]")
	private MobileElement selectRecipient;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done' or @text='Done']")
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done' or @label='OK' or @label='Ok']")
	private MobileElement done;

	//@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']/../following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/send_money_amount_value_view']")
	private MobileElement amount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue' or @label='Send Money' or @label='Continuer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button' or @resource-id='com.td:id/btn_footer' or @text='Continue' or @text='Continuer']")
	private MobileElement continueButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info' and @text='Please enter a security question.']")
	private MobileElement errorMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Security Question' or @label='Question de sécurité']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/send_money_security_question_edit_text']")
	private MobileElement securityQuestion;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Answer' or @label='Réponse']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/send_money_security_answer_edit_text']")
	private MobileElement securityAnswer;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirm Answer' or @label='Confirmation de la réponser']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/send_money_security_confirm_answer_edit_text']")
	private MobileElement confirmAnswer;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender' or @label='Expéditeur']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Sender' or @text='Expéditeur')]")
	private MobileElement sender;

	//@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender']/../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender' or @label='Expéditeur']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Sender' or @text='Expéditeur')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement senderName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account' or @label='Compte de provenance']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='From Account' or @text='Compte de provenance')]")
	private MobileElement fromAccount;

	//@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account']/../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account' or @label='Compte de provenance']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='From Account' or @text='Compte de provenance')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement fromAccountName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient' or @label='Destinataire']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Recipient' or @text='Destinataire')]")
	private MobileElement recipient;

	//@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient']/../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient' or @label='Destinataire']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Recipient' or @text='Destinataire')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement recipientVal;

	//@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient']/../preceding-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient' or @label='Destinataire']/following-sibling::XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Recipient' or @text='Destinataire')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView[2]")
	private MobileElement recipientEmail;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Security Question' or @label='Question de sécurité']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Security Question' or @text='Question de sécurité')]")
	private MobileElement securityQuestionLbl;

	//@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Security Question']/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Security Question' or @label='Question de sécurité']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Security Question' or @text='Question de sécurité')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement securityQuestionVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Answer' or @label='Réponse']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Answer' or @text='Réponse')]")
	private MobileElement securityAnswerLbl;

	//@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Answer']/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Answer' or @label='Réponse']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Answer' or @text='Réponse')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement securityAnswerVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Amount' or @text='Montant')]")
	private MobileElement amountLbl;

	//@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Amount' or @text='Montant')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amountVal;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In Progress' or @label='en cours']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and (@text='Loading' or @text='Chargement')]")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Thank you') or contains(@label,'Merci!')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header' and (@text='Thank You!' or @text='Merci!')]")
	private MobileElement thankYou;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'The money has been sent') or contains(@label,'Les fonds ont été virés')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subHeader' and (contains(@text,'The money has been sent') or contains(@text,'Les fonds ont été virés'))]")
	private MobileElement successMessage;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * @author Ashraf This method will check if the error message is displayed
	 *         then will transfer the money on Send Money Page.
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

			mobileAction.verifyElementIsDisplayed(sendMoneyHeader, "Send Money Header"); 
			mobileAction.FuncClick(selectRecipient, "Select Recipient");

			if (platformName.equalsIgnoreCase("Android")) {
				String recipientXpath = "//android.widget.TextView[@text='" + getTestdata("ToAccount")
						+ "']/preceding-sibling::android.widget.RadioButton";
				MobileElement recipient = mobileAction.mobileElementUsingXPath(recipientXpath);
				mobileAction.FuncClick(recipient, "Recipient " + recipient.getText());
				mobileAction.FuncClickDone();
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
			} else {
				String recipientXpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'"
						+ getTestdata("ToAccount") + "')]";
				MobileElement recipient = mobileAction.mobileElementUsingXPath(recipientXpath);
				mobileAction.FuncClick(recipient, "Recipient " + recipient.getText());
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(amount, "Amount");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(continueButton, "ContinueButton");
				mobileAction.FunctionSwipe("down", 200, 200);
				mobileAction.verifyElementIsDisplayed(errorMessage, "Please enter a security question"); // TODO::Take
																											// xpath
																											// for
																											// ios
																											// element
																											// not
																											// present
																											// currenltly
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(securityQuestion, "Security Question");
				mobileAction.FuncSendKeys(securityQuestion, getTestdata("SecurityQuestion"));
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(securityAnswer, "Enter A security answer");
				mobileAction.FuncSendKeys(securityAnswer, getTestdata("SecurityAnswer"));
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(confirmAnswer, "Confirm security answer");
				mobileAction.FuncSendKeys(confirmAnswer, getTestdata("SecurityAnswer"));
				mobileAction.FuncClickDone();

			}

			mobileAction.FuncClick(continueButton, "ContinueButton");

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will check if the error message is displayed
	 *         then will transfer the money on Send Money Page.
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

			mobileAction.waitForElementToVanish(progressBar);

			mobileAction.verifyElementIsDisplayed(sendMoneyHeader, "Header " + sendMoneyHeader.getText());
			mobileAction.FuncClick(selectRecipient, "Select Recipient");

			
			if(platformName.equalsIgnoreCase("Android")){
			/*String recipientXpath = "//android.widget.TextView[@text='" + getTestdata("ToAccount")
					+ "']/preceding-sibling::android.widget.RadioButton";*/
			
			String recipientXpath = "//android.widget.TextView[@text='" + getTestdata("ToAccount")
			+ "']";
			MobileElement recipient = mobileAction.mobileElementUsingXPath(recipientXpath);
			mobileAction.FuncClick(recipient, "Recipient " + recipient.getText());
			//mobileAction.FuncClickDone();
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
			}else{
				
				String recipientXpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'"
						+ getTestdata("ToAccount") + "')]";
				MobileElement recipient = mobileAction.mobileElementUsingXPath(recipientXpath);
				mobileAction.FuncClick(recipient, "Recipient " + recipient.getText());
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(securityQuestion, "Security Question");
				mobileAction.FuncSendKeys(securityQuestion, getTestdata("SecurityQuestion"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(securityAnswer, "Enter A security answer");
				mobileAction.FuncSendKeys(securityAnswer, getTestdata("SecurityAnswer"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(confirmAnswer, "Confirm security answer");
				mobileAction.FuncSendKeys(confirmAnswer, getTestdata("SecurityAnswer"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(amount, "Amount");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(continueButton, "ContinueButton");
				
			}

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will check if the error message is displayed
	 *         then will transfer the money on Send Money Page.
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
			mobileAction.verifyElementIsDisplayed(amountVal, "Amount " + amountVal.getText());
			mobileAction.FuncClick(continueButton, "Continue Button");

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will check if the error message is displayed
	 *         then will transfer the money on Send Money Page.
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

			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(thankYou, "Thank You!");
			mobileAction.verifyElementIsDisplayed(successMessage,
					"The money has been sent. The recipient will be sent an email notification.");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	
	/**
	 * @author Ashraf This method will check if the error message is displayed
	 *         then will transfer the money on Send Money Page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void quickSendMoney(){
		
		Decorator();
		
		try {
			Transfers.get().clickInterac_e_Transfer();
			sendMoney();
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(continueButton, "Continue Button");
			mobileAction.waitForElementToVanish(progressBar);
			Interac_e_Registration.get().clickGoBackHome();
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
		
		
	}

}
