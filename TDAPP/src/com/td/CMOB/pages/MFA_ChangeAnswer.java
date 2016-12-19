package com.td.CMOB.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MFA_ChangeAnswer extends _CommonPage {

	private static MFA_ChangeAnswer MFA_ChangeAnswer;

	String platformName=null;;
	
	@iOSFindBy(xpath="//*[@label='Update Security Questions']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Update Security Questions' and @resource-id='android:id/action_bar_title']")
	private MobileElement security_Question_header;
	
	@iOSFindBy(xpath="//XCUIElementTypeSecureTextField [@value='Enter your answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_answer' and @index='1']")
	private MobileElement security_Answer;

	@iOSFindBy(xpath="//XCUIElementTypeSecureTextField[@value='Re-enter your answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_confirm_answer' and @index='3']")
	private MobileElement confirm_security_Answer;

	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@value='What is your favourite pizza place?']")
	//@iOSFindBy(xpath="//*[@label='What is the name of your elementary school?']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mfa_question' and @index='0']")
	private MobileElement security_Question;
	
	@iOSFindBy(xpath="//*[@label='Save Changes']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/btn_save' and @text='Save Changes']")
	private MobileElement save_Changes;
	
	@iOSFindBy(xpath="//*[@label='Done']")
	private MobileElement done;

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
		platformName=CL.getTestDataInstance().getMobilePlatForm();

	}

	/**
	 * This method will update the Security questions for a specific user
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

	public void mfa_update() {
		Decorator();
		String security_header = "Update Security Questions";
		String security_ans_updated = "The security question was updated successfully";
		try {
			
			
			//mobileAction.verifyElement(security_Question_header, security_header);
			System.out.println(security_Question_header.isDisplayed());
			//System.out.println(CL.GetDriver().getPageSource());
			mobileAction.FuncClick(security_Question, "Security_Question");
			System.out.println("Security Question has been clicked");
			//System.out.println(CL.GetDriver().getPageSource());
			
			//System.out.println(CL.GetDriver().getPageSource());
			mobileAction.FuncClick(security_Answer, "security_Answer");
			//System.out.println(CL.GetDriver().getPageSource());
			String secret_Answer_value = getTestdata("SecurityAnswer", "UserIDs");
		
			mobileAction.FuncSendKeys(security_Answer, secret_Answer_value);
			
			
			//System.out.println(CL.GetDriver().getPageSource());
			
			if(platformName.equalsIgnoreCase("ios")){
				System.out.println("Confirm ");
				mobileAction.FuncClick(confirm_security_Answer, "Confirm_Security_Answer");
			
				mobileAction.FuncSendKeys(confirm_security_Answer, secret_Answer_value);
			
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(save_Changes, "Save_Changes");
				System.out.println(CL.GetDriver().getPageSource());
				mobileAction.verifyElement(secret_answer_updated, security_ans_updated);
			}
			else{
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(confirm_security_Answer, "Confirm_Security_Answer");
				String confirm_Sec_Answer_value = getTestdata("SecurityAnswer", "UserIDs");
				mobileAction.FuncSendKeys(confirm_security_Answer, confirm_Sec_Answer_value);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(save_Changes, "Save_Changes");
				mobileAction.verifyElement(secret_answer_updated, security_ans_updated);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

}
