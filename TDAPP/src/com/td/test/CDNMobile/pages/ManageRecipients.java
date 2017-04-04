package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td.MobileAction2;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ManageRecipients extends _CommonPage {

    private static ManageRecipients ManageRecipients;
    @iOSFindBy(xpath = "//*[@label='Manage Recipients']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Recipients']")
    private MobileElement manageRecipientHeader;

    @iOSFindBy(xpath = "//*[@label='Register']")
    private MobileElement registerBtn;

    @iOSFindBy(xpath = "//*[@label='In progress']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
    private MobileElement progressBar;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeLink[1]/XCUIElementTypeLink/XCUIElementTypeStaticText")
     private MobileElement selectRecipient;


    @iOSFindBy(xpath = "//*[@label='Edit']")
    @AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
    private MobileElement editRecipient;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Email')]/following-sibling::android.view.View/android.widget.EditText")
    private MobileElement recipientMailAddr;

    @iOSFindBy(xpath = "//*[@label='Done']")
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Done']")
    private MobileElement done;

    @iOSFindBy(xpath = "//*[@label='Enter the answer']")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Answer']")
    private MobileElement enterAnswer;

    @iOSFindBy(xpath = "//*[@label='Re-enter your answer']")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Confirm Answer']")
    private MobileElement reEnterAnswer;
    
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Success Recipient details have been saved.']")
    private MobileElement recipient_changes;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
    private MobileElement addRecipient;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progress_bar;

    String recipientMail = getTestdata("RecipientMail");
    String answer = getTestdata("SecurityAnswer");
    
    String sender_SelectSender = getTestdata("Sender");

    public synchronized static ManageRecipients get() {
	if (ManageRecipients == null) {
	    ManageRecipients = new ManageRecipients();
	}
	return ManageRecipients;
    }

    private void Decorator() {
	PageFactory.initElements(
		new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
		this);

    }

	public void clickAddRecipient() {
		Decorator();
		try {

			mobileAction.FuncClick(addRecipient, "Add Recipient");
			mobileAction.waitForElementToVanish(progress_bar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickEditRecipient() {
		Decorator();
		try {

			mobileAction.FuncClick(editRecipient, "Edit Recipient");
			mobileAction.waitForElementToVanish(progress_bar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}		
	}

    /**
     * This method will Verify the Register Button in the Manage Recipient page
     * 
     * 
     * @return void
     * @throws IOException
     * 
     */
    public void verify_RegisterButton() throws IOException {
	try {
	    Decorator();
	    mobileAction.verifyElementIsDisplayed(manageRecipientHeader, "Manage Recipients");
	    mobileAction.waitForElementToVanish(progressBar);
	    mobileAction.verifyElementIsDisplayed(registerBtn, "Register");
	} catch (NoSuchElementException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
    }

    /**
     * This method will modify the email address of a recipient
     * 
     * 
     * @return void
     * @throws IOException
     * @throws InterruptedException
     * 
     */
    public void modifyRecipient() throws IOException, InterruptedException {
    	 Decorator();
    	 try {
    		 if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
	    mobileAction.waitForElementToVanish(progressBar);
	    mobileAction.verifyElementIsDisplayed(manageRecipientHeader, "Manage Recipients");
	    Thread.sleep(3000);
	    mobileAction.FuncClick(selectRecipient, "Select Recipient");
	    mobileAction.waitForElementToVanish(progressBar);
	    mobileAction.FuncClick(editRecipient, "Edit Recipient");
	    mobileAction.waitForElementToVanish(progressBar);
	    recipientMailAddr.clear();
	    mobileAction.FuncSendKeys(recipientMailAddr, recipientMail);
	    mobileAction.FuncClick(done, "Done");
	    mobileAction.FuncClick(enterAnswer, "Enter Answer");
	    mobileAction.FuncSendKeys(enterAnswer, answer);
	    mobileAction.FuncClick(reEnterAnswer, "Re Enter your Answer");
	    mobileAction.FuncSendKeys(reEnterAnswer, answer);
	    mobileAction.FuncClick(done, "Done");
	    mobileAction.waitForElementToVanish(progressBar);
    	}
    	else
    		 {
    		//String recipient_saved = "Success Recipient details have been saved.";
    		mobileAction.waitForElementToVanish(progressBar);
    	    mobileAction.verifyElementIsDisplayed(manageRecipientHeader, "Manage Recipients");
    	    Thread.sleep(3000);
    	    String select_recipient ="//android.view.View[@content-desc='" + sender_SelectSender+ "']";
		    MobileElement selectRecipient = (MobileElement) ((AppiumDriver) CL.GetDriver())
					.findElement(By.xpath(select_recipient));
    	    mobileAction.FuncClick(selectRecipient, "Select Recipient");
    	    mobileAction.FuncClick(editRecipient, "Edit Recipient");
    	    mobileAction.FuncClick(recipientMailAddr,"recipientMail");
    	    recipientMailAddr.clear();
    	    mobileAction.FuncSendKeys(recipientMailAddr, recipientMail);
    	    mobileAction.FuncHideKeyboard();
    	    mobileAction.FuncClick(enterAnswer, "Enter Answer");
    	    mobileAction.FuncSendKeys(enterAnswer, answer);
    	    mobileAction.FuncHideKeyboard();
    	    mobileAction.FuncClick(reEnterAnswer, "Re Enter your Answer");
    	    mobileAction.FuncSendKeys(reEnterAnswer, answer);
    	    mobileAction.FuncHideKeyboard();
    	    mobileAction.FuncClick(done, "Done"); 
    	    mobileAction.verifyElementIsDisplayed(recipient_changes,"Success Recipient details have been saved");
    		 }

	} catch (NoSuchElementException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

    }
	/**
	 * This method will verify text within elements for the manage recipients page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyMyRecipientsTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("manage_rcp_title") + "']", "Manage Recipients title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				// FIXME: How to get text of partial hidden field here?
				//final WebElement hint = mobileAction.verifyWebElementUsingXPath("//label[@id='searchLabel']", "Search for recipient");
				final WebElement myRecipients = mobileAction.verifyWebElementUsingXPath("//a[@id='myRecipients']", "My Recipients");
				if (!mobileAction.verifyTextEquality(myRecipients.getText(), mobileAction.getAppString("str_my_recipients"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the view a recipient's info page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyViewRecipientInfoTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("manage_rcp_title") + "']", "Manage Recipients title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement firstRecipient = mobileAction.verifyWebElementUsingXPath("//div[@ng-model='searchExpression' and text()='" + getTestdata("RecipientName") + "']", "Recipient Name");
				firstRecipient.click();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("mng_payee_view_title") + "']", "View title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement name = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[1]", "Name");
				final WebElement email = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[2]", "email");
				final WebElement emailLang = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[3]", "email lang");
				final WebElement securityQ = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[4]", "security q");
				if (!mobileAction.verifyTextEquality(name.getText(), mobileAction.getAppString("str_rcp_name").replaceAll("\"", "")) || 
						!mobileAction.verifyTextEquality(email.getText(), mobileAction.getAppString("str_rcp_email1")) ||
						!mobileAction.verifyTextEquality(emailLang.getText(), mobileAction.getAppString("str_rcp_language")) ||
						!mobileAction.verifyTextEquality(securityQ.getText(), mobileAction.getAppString("str_security_question"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the view a recipient's info page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyEditRecipientInfoTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("manage_rcp_title") + "']", "Manage Recipients title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement firstRecipient = mobileAction.verifyWebElementUsingXPath("//div[@ng-model='searchExpression' and text()='" + getTestdata("RecipientName") + "']", "Recipient Name");
				firstRecipient.click();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.switchAppiumContext("NATIVE_APP");
				clickEditRecipient();
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("mng_payee_modify_title") + "']", "View title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement update = mobileAction.verifyWebElementUsingXPath("//div[@class='add-recipient']/div[@class='heading ng-binding']", "Update");
				final WebElement name = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[1]", "Name");
				final WebElement email = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[2]", "email");
				final WebElement securityQ = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[3]", "security q");
				final WebElement answer = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[4]", "answer");
				final WebElement answerConfirm = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[5]", "answer confirm");
				// FIXME: hints are not seen
				if (!mobileAction.verifyTextEquality(answer.getText(), mobileAction.getAppString("str_security_answer")) ||
						!mobileAction.verifyTextEquality(answerConfirm.getText(), mobileAction.getAppString("str_confirm_answer")) ||
						!mobileAction.verifyTextEquality(update.getText(), mobileAction.getAppString("modify_phonecontacts_heading")) ||
						!mobileAction.verifyTextEquality(name.getText(), mobileAction.getAppString("str_rcp_name").replaceAll("\"", "")) || 
						!mobileAction.verifyTextEquality(email.getText(), mobileAction.getAppString("str_rcp_email1")) ||
						!mobileAction.verifyTextEquality(securityQ.getText(), mobileAction.getAppString("str_security_question"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will verify text within elements for the add recipients page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddRecipientTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("add_rcp_title") + "']", "Add Recipients title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement addRecipientFromContact = mobileAction.verifyWebElementUsingXPath("//div[@class='add-recipient']/div[@class='heading ng-binding']", "Add Recipient");
				final WebElement name = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[1]", "Name");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder=\"" + mobileAction.getAppString("str_rcp_name_copy").replaceAll("\"", "") + "\"]", "Name sub");
				final WebElement email = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[2]", "Email");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder=\"" + mobileAction.getAppString("str_rcp_email_hint").replaceAll("\"", "") + "\"]", "Email sub");
				final WebElement note = mobileAction.verifyWebElementUsingXPath("(//span[@class='ng-binding'])[1]", "Note");
				final WebElement emailLang = mobileAction.verifyWebElementUsingXPath("(//label[@class=\"drop-down-label ng-binding\"])[2]", "Email lang");
				// FIXME: Need to change to french and test that too
//				final WebElement emailLangSub = mobileAction.verifyWebElementUsingXPath("//div[@class='add-recipient']/div[@class='heading ng-binding']", "Add Recipient");
				final WebElement securityQ = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[3]", "Security Questions");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder=\"" + mobileAction.getAppString("str_enter_security_question").replaceAll("\"", "") + "\"]", "Create a security question");
				final WebElement answer = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[4]", "Answer");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder=\"" + mobileAction.getAppString("str_enter_the_answer").replaceAll("\"", "") + "\"]", "Enter the answer");
				final WebElement answerConfirm = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[5]", "Enter Answer");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder=\"" + mobileAction.getAppString("str_reenter_the_answer").replaceAll("\"", "") + "\"]", "ReEnter the answer");
				final WebElement toCollectNote = mobileAction.verifyWebElementUsingXPath("(//text[@class='ng-binding'])[1]", "To collect note");
				mobileAction.verifyWebElementUsingXPath("//a[@aria-label=\"" + mobileAction.getAppString("rcp_how_to_link").replaceAll("\"", "") + "\"]", "Create an effective message");
				final WebElement review = mobileAction.verifyWebElementUsingXPath("//button[@aria-label=\"" + mobileAction.getAppString("btn_review_details") + "\"]", "Review");

				if (!mobileAction.verifyTextEquality(addRecipientFromContact.getText(), mobileAction.getAppString("phonecontacts_heading")) ||
						!mobileAction.verifyTextEquality(name.getText(), mobileAction.getAppString("str_rcp_name1")) || 
						!mobileAction.verifyTextEquality(email.getText(), mobileAction.getAppString("str_rcp_email")) ||
						!mobileAction.verifyTextEquality(note.getText(), mobileAction.getAppString("str_rcp_email_copy")) ||
						!mobileAction.verifyTextEquality(emailLang.getText(), mobileAction.getAppString("str_rcp_language")) ||
						!mobileAction.verifyTextEquality(securityQ.getText(), mobileAction.getAppString("str_security_question")) ||
						!mobileAction.verifyTextEquality(answer.getText(), mobileAction.getAppString("str_security_answer")) ||
						!mobileAction.verifyTextEquality(answerConfirm.getText(), mobileAction.getAppString("str_confirm_answer")) ||
						!mobileAction.verifyTextEquality(toCollectNote.getText().replaceAll("\\<.*?>",""), mobileAction.getAppString("rcp_answer_copy").replaceAll("&lt;em>", "").replaceAll("&lt;/em>", "").replaceAll("&lt;i>", "").replaceAll("&lt;/i>", "")) || 
						!mobileAction.verifyTextEquality(review.getText(), mobileAction.getAppString("btn_review_details"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
