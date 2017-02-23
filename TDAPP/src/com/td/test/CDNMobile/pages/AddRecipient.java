package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AddRecipient extends _CommonPage {

	private static AddRecipient AddRecipient;

	@iOSFindBy(xpath = "//*[@label='Add Recipient']")
	private MobileElement addRecipient_Interac_header;

	@iOSFindBy(xpath = "//*[contains(@value,'name')]")
	private MobileElement recipient_name;

	@iOSFindBy(xpath = "//*[contains(@value,'email address')]")
	private MobileElement recipient_Email;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Create a security question']")
	private MobileElement security_Question;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter the answer']")
	private MobileElement answer;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Re-enter your answer']")
	private MobileElement confirm_answer;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Review']")
	private MobileElement review_button;

	@iOSFindBy(xpath = "//*[contains(@label,'Error You must enter a valid answer to your security question.')]")
	private MobileElement verify_msg;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	public synchronized static AddRecipient get() {
		if (AddRecipient == null) {
			AddRecipient = new AddRecipient();
		}
		return AddRecipient;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will click on AddRecipient in Interac e-transfers Screen
	 * 
	 * 
	 * @return void
	 * 
	 */
	public void addRecipient_ErrorMessage() {

		Decorator();
		try {
			addRecipient_Interac_header.isDisplayed();
			// String
			// recipient_name_value=getTestdata("RecipientName" );
			String recipient_name_value = getTestdata("RecipientName");

			mobileAction.FuncClick(recipient_name, "Recipient_Name");
			mobileAction.FuncSendKeys(recipient_name, recipient_name_value);

			// String
			// recipient_Email_value=getTestdata("RecipientMail" );
			String recipient_Email_value = getTestdata("RecipientMail");
			mobileAction.FuncClick(recipient_Email, "Recipient_Email");

			mobileAction.FuncSendKeys(recipient_Email, recipient_Email_value);
			mobileAction.FuncClick(done, "Done");

			mobileAction.FuncClick(security_Question, "Security_Question");
			// String security_Question_value
			// =getTestdata("Security_Question" );
			String security_Question_value = getTestdata("Security_Question");

			mobileAction.FuncSendKeys(security_Question, security_Question_value);
			mobileAction.FuncClick(done, "Done");

			mobileAction.FuncClick(answer, "Answer");
			String answer_value = getTestdata("SecurityAnswer");

			mobileAction.FuncSendKeys(answer, answer_value);
			mobileAction.FuncClick(done, "Done");

			mobileAction.FuncClick(confirm_answer, "Confirm_Answer");

			mobileAction.FuncSendKeys(confirm_answer, answer_value);
			mobileAction.FuncClick(done, "Done");

			mobileAction.FuncClick(review_button, "Review_button");
			verify_msg.isDisplayed();
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
