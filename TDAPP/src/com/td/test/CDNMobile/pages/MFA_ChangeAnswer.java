package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MFA_ChangeAnswer extends _CommonPage {

	private static MFA_ChangeAnswer MFA_ChangeAnswer;

	String platformName = null;;

	@iOSFindBy(xpath = "//*[@label='Update Security Question']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement security_Question_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField [@value='Enter your answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_answer' and @index='1']")
	private MobileElement security_Answer;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Re-enter your answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_confirm_answer' and @index='3']")
	private MobileElement confirm_Security_Answer;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value='What is your favourite pizza place?']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/mfa_question' and @index='0']")
	private MobileElement security_Question;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Save Changes']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/btn_save' and @text='Save Changes']")
	private MobileElement save_Changes;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'The security question was updated successfully')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/questionTextView' and @text='The security question was updated successfully']")
	private MobileElement secret_Answer_Updated;

	public synchronized static MFA_ChangeAnswer get() {
		if (MFA_ChangeAnswer == null) {
			MFA_ChangeAnswer = new MFA_ChangeAnswer();
		}
		return MFA_ChangeAnswer;
	}

	private void Decorator() {
		PageFactory.initElements(


				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);


		platformName = CL.getTestDataInstance().getMobilePlatForm();

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
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void mfa_update() {
		Decorator();
		String security_header = "Update Security Question";
		String security_ans_updated = "The security question was updated successfully";
		try {

			if (mobileAction.verifyElementIsPresent(security_Question_Header)) {
				// mobileAction.FuncClick(security_Question,
				// "Security_Question");
				mobileAction.FuncClick(security_Answer, "security_Answer");
				String secret_Answer_value = getTestdata("SecurityAnswer");
				mobileAction.FuncSendKeys(security_Answer, secret_Answer_value);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

					mobileAction.FuncClick(confirm_Security_Answer, "Confirm_Security_Answer");
					mobileAction.FuncSendKeys(confirm_Security_Answer, secret_Answer_value);
					mobileAction.FuncClickDone();
					mobileAction.FuncClick(save_Changes, "Save_Changes");

				} else {
					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(confirm_Security_Answer, "Confirm_Security_Answer");
					String confirm_Sec_Answer_value = getTestdata("SecurityAnswer");
					mobileAction.FuncSendKeys(confirm_Security_Answer, confirm_Sec_Answer_value);
					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(save_Changes, "Save_Changes");
					mobileAction.verifyElement(secret_Answer_Updated, security_ans_updated);
				}
			} else {
				System.out.println(security_header + " is not displayed");
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
