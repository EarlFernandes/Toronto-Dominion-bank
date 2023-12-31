package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

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

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Send Money' or label CONTAINS[cd] 'Virer des fonds'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement sendMoneyHeader;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Select Recipient' or label CONTAINS[cd] 'Sélectionnez le destinataire'`]")
	@AndroidFindBy(id = "com.td:id/recipient_view")
	private MobileElement selectRecipient;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done' or @text='Done']")
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done' or @label='OK' or @label='Ok' or @label='Toolbar Done Button']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(id = "com.td:id/send_money_amount_value_view")
	private MobileElement amount;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Continue' or label=='Send Money' or label=='Continuer' or label=='Envoyer ces fonds' or label=='Virer des fonds'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button' or @resource-id='com.td:id/btn_footer' or @text='Continue' or @text='Continuer']")
	private MobileElement continueButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info' and @text='Please enter a security question.']")
	private MobileElement errorMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Security Question' or @label='Question de sécurité']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(id = "com.td:id/send_money_security_question_edit_text")
	private MobileElement securityQuestion;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Answer' or @label='Réponse']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(id = "com.td:id/send_money_security_answer_edit_text")
	private MobileElement securityAnswer;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirm Answer' or @label='Confirmation de la réponse']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(id = "com.td:id/send_money_security_confirm_answer_edit_text")
	private MobileElement confirmAnswer;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Sender' or label=='Expéditeur'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Sender' or @text='Expéditeur')]")
	private MobileElement sender;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Sender' or @label='Expéditeur']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Sender' or @text='Expéditeur')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement senderName;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'From Account' or label CONTAINS[cd] 'Compte de provenance'`]")
	@AndroidFindBy(id = "com.td:id/account_view")
	private MobileElement fromAccount;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'From Account' or label CONTAINS[cd] 'Compte de provenance'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='From Account' or @text='Compte de provenance')]")
	private MobileElement fromAccountVerifyDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account' or @label='Compte de provenance']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='From Account' or @text='Compte de provenance')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement fromAccountName;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Recipient' or label=='Destinataire'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Recipient' or @text='Destinataire')]")
	private MobileElement recipient;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient' or @label='Destinataire']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Recipient' or @text='Destinataire')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement recipientVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Recipient' or @label='Destinataire']/following-sibling::XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Recipient' or @text='Destinataire')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView[2]")
	private MobileElement recipientEmail;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Security Question' or label=='Question de sécurité'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Security Question' or @text='Question de sécurité')]")
	private MobileElement securityQuestionLbl;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Security Question' or @label='Question de sécurité']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Security Question' or @text='Question de sécurité')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement securityQuestionVal;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Answer' or label=='Réponse'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Answer' or @text='Réponse')]")
	private MobileElement securityAnswerLbl;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Answer' or @label='Réponse']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Answer' or @text='Réponse')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement securityAnswerVal;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Amount' or label=='Montant'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Amount' or @text='Montant')]")
	private MobileElement amountLbl;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount' or @label='Montant']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title' and (@text='Amount' or @text='Montant')]/following-sibling::android.widget.RelativeLayout/android.widget.TextView")
	private MobileElement amountVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account' or @label='Compte de provenance']/following-sibling::XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_value_item3']")
	private MobileElement fromAccountVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account' or @label='Compte de provenance']/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_value_item3']")
	private MobileElement fromAccountVal_Confirmation;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Money Sent' or label CONTAINS[cd] 'Fonds virés!'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement thankYou;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'The recipient will be notified by email' or label CONTAINS[cd] 'Le destinataire sera avisé par courriel'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subHeader']")
	private MobileElement successMessage;

	@AndroidFindBy(xpath = "//*[@text='Done' or @text='Annuler']")
	private MobileElement doneButton;

	@iOSFindBy(xpath = "//*[@label='背面' or @label='返回' or @label='Back' or @label='p2p header caret']")
	private MobileElement back_button;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/lv_action_sheet']/android.widget.RelativeLayout[@index='0']")
	private MobileElement firstAcct;

	@iOSXCUITFindBy(accessibility = "Security Question")
	@AndroidFindBy(id = "com.td:id/send_money_security_question")
	private MobileElement securityQuestionPerf;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Send Money'`]")
	@AndroidFindBy(id = "com.td:id/continue_button")
	private MobileElement sendMoney;

	@iOSXCUITFindBy(accessibility = "From Account")
	@AndroidFindBy(id = "com.td:id/receipt_subSubHeader")
	private MobileElement fromAcctReceiptPerf;

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
				mobileAction.FuncClick(doneButton, "Done");
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
				mobileAction.verifyElementIsDisplayed(errorMessage, "Please enter a security question");
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

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * @author Ashraf This method will perform the send money transaction and
	 *         click on continue.
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

			mobileAction.waitP2PProgressBarVanish();

			mobileAction.verifyElementIsDisplayed(sendMoneyHeader, "Header " + sendMoneyHeader.getText());

			if (platformName.equalsIgnoreCase("Android")) {

				mobileAction.FuncClick(fromAccount, "from Account");
				mobileAction.sleep(2000);
				String fromAccountNumXL = "//android.widget.TextView[@text='" + getTestdata("FromAccount") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(fromAccountNumXL, true, 5, "up");
				// MobileElement fromAccountNumber =
				// mobileAction.mobileElementUsingXPath(fromAccountNumXL);
				// mobileAction.FuncClick(fromAccountNumber, "Account Number: "
				// + getTestdata("FromAccount"));

				mobileAction.FuncClick(selectRecipient, "Select Recipient");
				mobileAction.sleep(2000);
				String recipientXpath = "//android.widget.TextView[@text='" + getTestdata("ToAccount") + "']";
				// MobileElement recipient =
				// mobileAction.mobileElementUsingXPath(recipientXpath);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(recipientXpath, true, 5, "up");
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
			} else {

				mobileAction.FuncClick(fromAccount, "from Account");

				String fromAccountNumXL = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@value,'"
						+ getTestdata("FromAccount") + "')]"; // changed by
																// vishal

				mobileAction.FuncSwipeWhileElementNotFoundByxpath(fromAccountNumXL, true, 5, "up");

				mobileAction.FuncClick(selectRecipient, "Select Recipient");

				// String recipientXpath = "**/*[`label CONTAINS[cd]
				// '"+getTestdata("ToAccount")+"'`]";
				// MobileElement recipient =
				// mobileAction.mobileElementUsingIOSClassChain(recipientXpath);

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

			mobileAction.waitP2PProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * @author Ashraf This method will verify the details present on send money
	 *         details verification screen.
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
			mobileAction.verifyElementIsDisplayed(fromAccountVerifyDetails, "From Account");
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
			mobileAction.waitP2PProgressBarVanish();
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * @author Ashraf This method will will verify the success message is
	 *         displayed on Send money transaction success screen.
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

			mobileAction.waitP2PProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(thankYou, thankYou.getText());
			mobileAction.verifyElementIsDisplayed(successMessage, successMessage.getText());

			// mobileAction.verifyTextContains(successMessage.getText(),
			// getTextInCurrentLocale(StringArray.SEND_MONEY_SUCCESS_MSG));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	/**
	 * @author Ashraf This method will perform the quick send money transaction
	 *         without verifying the details.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void quickSendMoney() {

		Decorator();

		try {
			Transfers.get().clickInterac_e_Transfer();
			sendMoney();
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(continueButton, "Continue Button");
			mobileAction.waitP2PProgressBarVanish();
			mobileAction.waitP2PProgressBarVanish();

			// Need to delay till interac trxn is processed and shown in History
			mobileAction.sleep(60000);

			Interac_e_Registration.get().clickGoBackHome();
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}

	}

	/**
	 * This method will click on the Back button
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
	public void iOS_back_button() {

		Decorator();
		try {
			Thread.sleep(2500);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(back_button, "Back Button");
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

	public void payMoneyAndSaveBalance() {
		Decorator();
		try {
			String fromAccountTitle = mobileAction.getValue(fromAccountName);
			System.out.println("fromAccountTitle:" + fromAccountTitle);
			Boolean isFromAccountLOC = false;
			if (fromAccountTitle.contains("LINE OF CREDIT")) {
				isFromAccountLOC = true;
			}
			String fromAccountValue = mobileAction.getValue(fromAccountVal);
			if (!mobileAction.verifyElementIsPresent(amountVal)) {
				mobileAction.FuncSwipeOnce("up");
			}
			String amountValue = mobileAction.getValue(amountVal);
			double d_amountVal = mobileAction.convertStringAmountTodouble(amountValue);
			double d_fromAccountValue = mobileAction.convertStringAmountTodouble(fromAccountValue);
			double d_balance = 0.0;
			if (isFromAccountLOC) {
				d_balance = d_fromAccountValue + d_amountVal;
			} else {
				d_balance = d_fromAccountValue - d_amountVal;
			}
			d_balance = mobileAction.RoundTo2Decimals(d_balance);
			CL.getTestDataInstance().TCParameters.put("Dividend", Double.toString(d_balance));

			mobileAction.FuncClick(continueButton, "Continue Button");
			mobileAction.waitP2PProgressBarVanish();

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

	public void verifyBalanceInConfirmationPage() {

		Decorator();

		try {
			String fromBalanceValue = mobileAction.getValue(fromAccountVal_Confirmation);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (fromBalanceValue.matches(".*\\$.*")) {
					fromBalanceValue = mobileAction.FuncGetValByRegx(fromBalanceValue, "\\$.*");
				} else {
					mobileAction.Report_Fail("Faile to get from account balance");
					return;
				}
			}
			System.out.println(fromBalanceValue);
			double fromaccountCaptured = mobileAction.convertStringAmountTodouble(fromBalanceValue);
			double fromAccountExpected = Double.parseDouble(CL.getTestDataInstance().TCParameters.get("Dividend"));
			double fromaccountCaptured_1 = fromaccountCaptured + 1.5;
			double fromaccountCaptured_2 = fromaccountCaptured + 0.5;
			if (fromaccountCaptured == fromAccountExpected) {
				mobileAction.Report_Pass_Verified("From Account balance");
			} else if (fromaccountCaptured_1 == fromAccountExpected) {
				mobileAction.Report_Pass_Verified("From Account balance with IET fee 1.5");
			} else if (fromaccountCaptured_2 == fromAccountExpected) {
				mobileAction.Report_Pass_Verified("From Account balance with IET fee 0.5");
			} else {
				mobileAction.Report_Fail("Failed to verify from account balance");
			}

			return;

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void sendMoneyPERF() {
		Decorator();
		try {

			mobileAction.FuncClick(fromAccount, "From Account");
			mobileAction.FuncClick(firstAcct, "1st Account in List");

			mobileAction.FuncClick(selectRecipient, "Select Recipient");
			performance.click(firstAcct, "1st Account in List");
			performance.verifyElementIsDisplayed(securityQuestionPerf, "Metric - Recipient Selected screen");

			mobileAction.FuncClick(securityQuestion, "Security Question");
			String question = getTestdata("Security_Question");
			mobileAction.FuncSendKeys(securityQuestion, question);
			mobileAction.FuncHideKeyboard();

			String answer = getTestdata("SecurityAnswer");
			mobileAction.FuncClick(securityAnswer, "Enter A security answer");
			mobileAction.FuncSendKeys(securityAnswer, answer);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(confirmAnswer, "Confirm security answer");
			mobileAction.FuncSendKeys(confirmAnswer, answer);
			mobileAction.FuncHideKeyboard();

			String amt = getTestdata("Amount");
			mobileAction.FuncClick(amount, "Amount");
			mobileAction.FuncSendKeys(amount, amt);
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncClick(continueButton, "Continue button");
			mobileAction.waitProgressBarVanish();

			performance.click(sendMoney, "Send Money button");
			mobileAction.sleep(5000);
			performance.verifyElementIsDisplayed(fromAcctReceiptPerf, "Metric - P2P Receipt screen");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
