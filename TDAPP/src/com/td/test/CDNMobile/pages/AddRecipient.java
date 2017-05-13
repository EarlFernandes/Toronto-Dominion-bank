package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class AddRecipient extends _CommonPage {

	private static AddRecipient AddRecipient;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Add Recipient']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement addRecipient_Interac_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'name')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'name')]")
	private MobileElement recipient_Name;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'email address')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'email address')]")
	private MobileElement recipient_Email;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Create a security question']")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Create a security question')]")
	private MobileElement security_Question;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter the answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Enter the answer')]")
	private MobileElement answer;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Re-enter your answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Re-enter your answer')]")
	private MobileElement confirm_Answer;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Review']")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Review')]")
	private MobileElement review_Button;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'Error You must enter a valid answer to your security question.')]")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Error You must enter a valid answer')]")
	private MobileElement verify_Msg;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
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
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 */
	public void addRecipient_ErrorMessage() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(addRecipient_Interac_Header, "Add Recipient");
			// String
			// recipient_Name_value=getTestdata("RecipientName" );
			String recipient_Name_value = getTestdata("RecipientName");

			mobileAction.FuncClick(recipient_Name, "recipient_Name");
			mobileAction.FuncSendKeys(recipient_Name, recipient_Name_value);

			// String
			// recipient_Email_value=getTestdata("RecipientMail" );
			String recipient_Email_value = getTestdata("RecipientMail");
			mobileAction.FuncClick(recipient_Email, "Recipient_Email");

			mobileAction.FuncSendKeys(recipient_Email, recipient_Email_value);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
	        	mobileAction.FuncClick(done, "Done");
		            }
		        else
		        	{
		        		mobileAction.FuncHideKeyboard();
		        	}

			mobileAction.FuncClick(security_Question, "Security_Question");
			// String security_Question_value
			// =getTestdata("Security_Question" );
			String security_Question_value = getTestdata("Security_Question");

			mobileAction.FuncSendKeys(security_Question, security_Question_value);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
	        	mobileAction.FuncClick(done, "Done");
					}
					else
						{
							mobileAction.FuncHideKeyboard();
						}
			mobileAction.FuncClick(answer, "Answer");
			String answer_value = getTestdata("SecurityAnswer");

			mobileAction.FuncSendKeys(answer, answer_value);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
	        	mobileAction.FuncClick(done, "Done");
						}
					else
						{
								mobileAction.FuncHideKeyboard();
						}

			mobileAction.FuncClick(confirm_Answer, "Confirm_Answer");

			mobileAction.FuncSendKeys(confirm_Answer, answer_value);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
		        	mobileAction.FuncClick(done, "Done");
					}
					else
						{
							mobileAction.FuncHideKeyboard();
						}
			mobileAction.FuncClick(review_Button, "Review_button");
			mobileAction.verifyElementIsDisplayed(verify_Msg,"Error Message");
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
