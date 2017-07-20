package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td.MobileAction2;
import com.td.StringLookup;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ManageRecipients extends _CommonPage {

	private static ManageRecipients ManageRecipients;
	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Manage Recipients']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Recipients']")
	private MobileElement manageRecipientHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Register']")
	@AndroidFindBy(xpath = "//*[contains(@text,'Register') or contains(@content-desc,'Register')]")
	private MobileElement registerBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@value='1']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeLink[1]/XCUIElementTypeLink/XCUIElementTypeStaticText")
	private MobileElement selectRecipient;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement yesButtonContacts;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Edit']")
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Edit']")
	private MobileElement editRecipient;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Email')]/following-sibling::android.view.View/android.widget.EditText")
	private MobileElement recipientMailAddr;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[2]//XCUIElementTypeButton[@label='Done']")
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter the answer']")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Answer']")
	private MobileElement enterAnswer;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Re-enter your answer']")
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Confirm Answer']")
	private MobileElement reEnterAnswer;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='alertMessage']")
	private MobileElement recipient_Changes;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeButton[2]")
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

	public void clickAddRecipientFromContactsList() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

			} else {
				WebElement contactsRecipients = null;

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					final MobileElement iOSContactsRecipient = mobileAction.verifyElementUsingXPath(
							"//XCUIElementTypeStaticText[@value='"
									+ mobileAction.getAppString("add_contact_alert_title") + "']",
							"Recipients from Contacts button");
					iOSContactsRecipient.click();
				} else {
					mobileAction.switchAppiumContext("WEBVIEW_com.td");
					contactsRecipients = mobileAction.verifyWebElementUsingXPath("//div[@class='add-recipient']",
							"Recipients from Contacts button");
					contactsRecipients.click();
					mobileAction.switchAppiumContext("NATIVE_APP");
				}
			}
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void addRecipientFromContactList() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.FuncClick(yesButtonContacts, "Yes to Add contacts");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickEditRecipient() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				editRecipient = mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label = '"
						+ mobileAction.getAppString("mng_payee_modify_title") + "']", "Edit button");
			}
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
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 */
	public void verify_RegisterButton() {
		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(manageRecipientHeader, "Manage Recipients");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(registerBtn, "Register");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
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
				// Thread.sleep(3000);
				// mobileAction.FuncClick(selectRecipient, "Select Recipient");
				// mobileAction.waitForElementToVanish(progressBar);
				// mobileAction.FuncClick(editRecipient, "Edit Recipient");
				// mobileAction.waitForElementToVanish(progressBar);
				// recipientMailAddr.clear();
				// System.out.println("Edit email:" + recipientMail);
				// mobileAction.FuncSendKeys(recipientMailAddr, recipientMail);
				// mobileAction.FuncClick(done, "Done");
				// mobileAction.FuncClick(enterAnswer, "Enter Answer");
				// mobileAction.FuncSendKeys(enterAnswer, answer);
				// mobileAction.FuncClick(reEnterAnswer, "Re Enter your
				// Answer");
				// mobileAction.FuncSendKeys(reEnterAnswer, answer);
				// mobileAction.FuncClick(done, "Done");
				// mobileAction.waitForElementToVanish(progressBar);
			} else {
				// String recipient_saved = "Success Recipient details have been
				// saved.";
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(manageRecipientHeader, "Manage Recipients");
				// String select_recipient
				// ="//android.view.View[@content-desc='" + sender_SelectSender+
				// "']";
				// MobileElement selectRecipient =
				// mobileAction.verifyElementUsingXPath(select_recipient,
				// "Select Recipient");
				// mobileAction.FuncClick(selectRecipient, "Select Recipient");
				// mobileAction.FuncClick(editRecipient, "Edit Recipient");
				// mobileAction.FuncClick(recipientMailAddr,"recipientMail");
				// recipientMailAddr.clear();
				// mobileAction.FuncSendKeys(recipientMailAddr, recipientMail);
				// mobileAction.FuncHideKeyboard();
				// mobileAction.FuncClick(enterAnswer, "Enter Answer");
				// mobileAction.FuncSendKeys(enterAnswer, answer);
				// mobileAction.FuncHideKeyboard();
				// mobileAction.FuncClick(reEnterAnswer, "Re Enter your
				// Answer");
				// mobileAction.FuncSendKeys(reEnterAnswer, answer);
				// mobileAction.FuncHideKeyboard();
				// mobileAction.FuncClick(done, "Done");
				// //mobileAction.verifyElementIsDisplayed(recipient_Changes,"Success
				// Recipient details have been saved");
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will verify text within elements for the manage recipients
	 * page
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
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("manage_rcp_title") + "']", "Manage Recipients title");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeTextField[@label='"
						+ mobileAction.getAppString("manage_rcp_search_hint") + "']", "Search for recipient");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeOther[@label='" + mobileAction.getAppString("str_my_recipients") + "']",
						"My Recipients");
			} else {
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("manage_rcp_title") + "']",
								"Manage Recipients title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("manage_rcp_search_hint") + "']",
						"Search for recipient");
				final WebElement myRecipients = mobileAction.verifyWebElementUsingXPath("//a[@id='myRecipients']",
						"My Recipients");
				if (!mobileAction.verifyTextEquality(myRecipients.getText(),
						mobileAction.getAppString("str_my_recipients"))) {
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
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for popup dialog for add
	 * recipient from contacts
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddRecipientFromContactsPopupTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// +
				// StringLookup.lookupString(StringLookup.ALLOW_CONTACTS_ACCESS_HEADER,
				// currentLocale) + "']", "dialog title");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// +
				// StringLookup.lookupString(StringLookup.ALLOW_CONTACTS_ACCCESS_BODY,
				// currentLocale) + "']", "dialog msg");
			} else {
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("add_contact_alert_title") + "']", "dialog title");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text=\""
						+ mobileAction.getAppString("add_contact_alert_message") + "\"]", "dialog msg");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='" + mobileAction.getAppString("str_Yes") + "']", "yes");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='" + mobileAction.getAppString("str_No") + "']", "no");

			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the view a recipient's
	 * info page
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
				clickSpecificRecipient();
				mobileAction.verifyWebElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_rcp_name") + "']",
						"Name");
				mobileAction.verifyWebElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_rcp_email1") + "']",
						"email");
				mobileAction.verifyWebElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_rcp_language") + "']",
						"email lang");
				mobileAction.verifyWebElementUsingXPath("//XCUIElementTypeStaticText[@value='"
						+ mobileAction.getAppString("str_security_question") + "']", "security q");

			} else {
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("manage_rcp_title") + "']",
								"Manage Recipients title");
				clickSpecificRecipient();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement name = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[1]", "Name");
				final WebElement email = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[2]", "email");
				final WebElement emailLang = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[3]", "email lang");
				final WebElement securityQ = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[4]", "security q");
				if (!mobileAction.verifyTextEquality(name.getText(),
						mobileAction.getAppString("str_rcp_name").replaceAll("\"", ""))
						|| !mobileAction.verifyTextEquality(email.getText(),
								mobileAction.getAppString("str_rcp_email1"))
						|| !mobileAction.verifyTextEquality(emailLang.getText(),
								mobileAction.getAppString("str_rcp_language"))
						|| !mobileAction.verifyTextEquality(securityQ.getText(),
								mobileAction.getAppString("str_security_question"))) {
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
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void clickSpecificRecipient() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				final MobileElement firstRecipient = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + getTestdata("RecipientName") + "']", "Recipient Name");
				firstRecipient.click();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("mng_payee_view_title") + "']", "View title");
			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement firstRecipient = mobileAction.verifyWebElementUsingXPath(
						"//div[@ng-model='searchExpression' and text()='" + getTestdata("RecipientName") + "']",
						"Recipient Name");
				firstRecipient.click();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("mng_payee_view_title") + "']",
						"View title");
			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the view a recipient's
	 * info page
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
				clickSpecificRecipient();
				clickEditRecipient();
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeOther[@label='" + mobileAction.getAppString("modify_rcp_title") + "']",
						"Edit title");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[contains(@label, '"
						+ mobileAction.getAppString("str_security_answer") + "')]", "Answer");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeTextField[@value='"
						+ mobileAction.getAppString("str_enter_the_answer") + "']", "Answer confirm");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ mobileAction.getAppString("modify_phonecontacts_heading") + "']", "phone contacts");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_rcp_name") + "']",
						"name");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_rcp_email1") + "']",
						"email");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ mobileAction.getAppString("str_security_question") + "']", "security q");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("str_delete_recipient1") + "']",
						"delete button");
			} else {
				clickSpecificRecipient();
				clickEditRecipient();
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("mng_payee_modify_title") + "']",
						"Edit title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement update = mobileAction.verifyWebElementUsingXPath(
						"//div[@class='add-recipient']/div[@class='heading ng-binding']", "Update");
				final WebElement name = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[1]",
						"Name");
				final WebElement email = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[2]",
						"email");
				final WebElement securityQ = mobileAction
						.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[3]", "security q");
				final WebElement answer = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[4]",
						"answer");
				final WebElement answerConfirm = mobileAction
						.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[5]", "answer confirm");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder=\""
								+ mobileAction.getAppString("str_enter_the_answer").replaceAll("\"", "") + "\"]",
						"Enter answer sub");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder=\""
								+ mobileAction.getAppString("str_reenter_the_answer").replaceAll("\"", "") + "\"]",
						"re-enter your answer sub");
				if (!mobileAction.verifyTextEquality(answer.getText(), mobileAction.getAppString("str_security_answer"))
						|| !mobileAction.verifyTextEquality(answerConfirm.getText(),
								mobileAction.getAppString("str_confirm_answer"))
						|| !mobileAction.verifyTextEquality(update.getText(),
								mobileAction.getAppString("modify_phonecontacts_heading"))
						|| !mobileAction.verifyTextEquality(name.getText(),
								mobileAction.getAppString("str_rcp_name").replaceAll("\"", ""))
						|| !mobileAction.verifyTextEquality(email.getText(),
								mobileAction.getAppString("str_rcp_email1"))
						|| !mobileAction.verifyTextEquality(securityQ.getText(),
								mobileAction.getAppString("str_security_question"))) {
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
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the add recipients page
	 * from contacts list
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddRecipientFromContactsListTextElements() {
		Decorator();
		MobileElement recipientTextView = null;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// click on recipient
				recipientTextView = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + getTestdata("RecipientName") + "']",
						"Recipient under test");
				mobileAction.FuncClick(recipientTextView, "Click on recipient in contacts list");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("add_rcp_title") + "']",
						"Add Recipients title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement addRecipientFromContact = mobileAction.verifyWebElementUsingXPath(
						"//div[@class='add-recipient']/div[@class='heading ng-binding']", "Add Recipient");
				final WebElement name = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[1]",
						"Name");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder=\""
						+ mobileAction.getAppString("str_rcp_name_copy").replaceAll("\"", "") + "\"]", "Name sub");
				final WebElement email = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[2]",
						"Email");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder=\""
						+ mobileAction.getAppString("str_rcp_email_hint").replaceAll("\"", "") + "\"]", "Email sub");
				final WebElement note = mobileAction.verifyWebElementUsingXPath("(//span[@class='ng-binding'])[1]",
						"Note");
				final WebElement emailLang = mobileAction.verifyWebElementUsingXPath(
						"(//label[@class=\"drop-down-label ng-binding\"])[2]", "Email lang");
				final WebElement securityQ = mobileAction
						.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[3]", "Security Questions");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder=\""
								+ mobileAction.getAppString("str_enter_security_question").replaceAll("\"", "") + "\"]",
						"Create a security question");
				final WebElement answer = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[4]",
						"Answer");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder=\""
								+ mobileAction.getAppString("str_enter_the_answer").replaceAll("\"", "") + "\"]",
						"Enter the answer");
				final WebElement answerConfirm = mobileAction
						.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[5]", "Enter Answer");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder=\""
								+ mobileAction.getAppString("str_reenter_the_answer").replaceAll("\"", "") + "\"]",
						"ReEnter the answer");
				final WebElement toCollectNote = mobileAction
						.verifyWebElementUsingXPath("(//text[@class='ng-binding'])[1]", "To collect note");
				mobileAction.verifyWebElementUsingXPath("//a[@aria-label=\""
						+ mobileAction.getAppString("rcp_how_to_link").replaceAll("\"", "") + "\"]",
						"Create an effective message");
				final WebElement review = mobileAction.verifyWebElementUsingXPath(
						"//button[@aria-label=\"" + mobileAction.getAppString("btn_review_details") + "\"]", "Review");

				if (!mobileAction.verifyTextEquality(addRecipientFromContact.getText(),
						mobileAction.getAppString("phonecontacts_heading"))
						|| !mobileAction.verifyTextEquality(name.getText(), mobileAction.getAppString("str_rcp_name1"))
						|| !mobileAction.verifyTextEquality(email.getText(), mobileAction.getAppString("str_rcp_email"))
						|| !mobileAction.verifyTextEquality(note.getText(),
								mobileAction.getAppString("str_rcp_email_copy"))
						|| !mobileAction.verifyTextEquality(emailLang.getText(),
								mobileAction.getAppString("str_rcp_language"))
						|| !mobileAction.verifyTextEquality(securityQ.getText(),
								mobileAction.getAppString("str_security_question"))
						|| !mobileAction.verifyTextEquality(answer.getText(),
								mobileAction.getAppString("str_security_answer"))
						|| !mobileAction.verifyTextEquality(answerConfirm.getText(),
								mobileAction.getAppString("str_confirm_answer"))
						|| !mobileAction.verifyTextEquality(toCollectNote.getText().replaceAll("\\<.*?>", ""),
								mobileAction.getAppString("rcp_answer_copy").replaceAll("&lt;em>", "")
										.replaceAll("&lt;/em>", "").replaceAll("&lt;i>", "").replaceAll("&lt;/i>", ""))
						|| !mobileAction.verifyTextEquality(review.getText(),
								mobileAction.getAppString("btn_review_details"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
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
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("add_rcp_title") + "']", "Add Recipients title");
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("add_rcp_title") + "']",
						"Add Recipients title");

				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement addRecipientFromContact = mobileAction.verifyWebElementUsingXPath(
						"//div[@class='add-recipient']/div[@class='heading ng-binding']", "Add Recipient");
				final WebElement name = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[1]",
						"Name");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder=\""
						+ mobileAction.getAppString("str_rcp_name_copy").replaceAll("\"", "") + "\"]", "Name sub");
				final WebElement email = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[2]",
						"Email");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder=\""
						+ mobileAction.getAppString("str_rcp_email_hint").replaceAll("\"", "") + "\"]", "Email sub");
				final WebElement note = mobileAction.verifyWebElementUsingXPath("(//span[@class='ng-binding'])[1]",
						"Note");
				final WebElement emailLang = mobileAction.verifyWebElementUsingXPath(
						"(//label[@class=\"drop-down-label ng-binding\"])[2]", "Email lang");
				final WebElement securityQ = mobileAction
						.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[3]", "Security Questions");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder=\""
								+ mobileAction.getAppString("str_enter_security_question").replaceAll("\"", "") + "\"]",
						"Create a security question");
				final WebElement answer = mobileAction.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[4]",
						"Answer");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder=\""
								+ mobileAction.getAppString("str_enter_the_answer").replaceAll("\"", "") + "\"]",
						"Enter the answer");
				final WebElement answerConfirm = mobileAction
						.verifyWebElementUsingXPath("(//label[@class='ng-binding'])[5]", "Enter Answer");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder=\""
								+ mobileAction.getAppString("str_reenter_the_answer").replaceAll("\"", "") + "\"]",
						"ReEnter the answer");
				final WebElement toCollectNote = mobileAction
						.verifyWebElementUsingXPath("(//text[@class='ng-binding'])[1]", "To collect note");
				mobileAction.verifyWebElementUsingXPath("//a[@aria-label=\""
						+ mobileAction.getAppString("rcp_how_to_link").replaceAll("\"", "") + "\"]",
						"Create an effective message");
				final WebElement review = mobileAction.verifyWebElementUsingXPath(
						"//button[@aria-label=\"" + mobileAction.getAppString("btn_review_details") + "\"]", "Review");

				if (!mobileAction.verifyTextEquality(addRecipientFromContact.getText(),
						mobileAction.getAppString("phonecontacts_heading"))
						|| !mobileAction.verifyTextEquality(name.getText(), mobileAction.getAppString("str_rcp_name1"))
						|| !mobileAction.verifyTextEquality(email.getText(), mobileAction.getAppString("str_rcp_email"))
						|| !mobileAction.verifyTextEquality(note.getText(),
								mobileAction.getAppString("str_rcp_email_copy"))
						|| !mobileAction.verifyTextEquality(emailLang.getText(),
								mobileAction.getAppString("str_rcp_language"))
						|| !mobileAction.verifyTextEquality(securityQ.getText(),
								mobileAction.getAppString("str_security_question"))
						|| !mobileAction.verifyTextEquality(answer.getText(),
								mobileAction.getAppString("str_security_answer"))
						|| !mobileAction.verifyTextEquality(answerConfirm.getText(),
								mobileAction.getAppString("str_confirm_answer"))
						|| !mobileAction.verifyTextEquality(toCollectNote.getText().replaceAll("\\<.*?>", ""),
								mobileAction.getAppString("rcp_answer_copy").replaceAll("&lt;em>", "")
										.replaceAll("&lt;/em>", "").replaceAll("&lt;i>", "").replaceAll("&lt;/i>", ""))
						|| !mobileAction.verifyTextEquality(review.getText(),
								mobileAction.getAppString("btn_review_details"))) {
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
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the add recipients
	 * confirmation page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddRecipientConfirmationTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				addAndReviewRecipient();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement reviewDetails = mobileAction.verifyWebElementUsingXPath(
						"//div[@class='message-holder ng-binding ng-scope']", "Add Recipient");
				final WebElement nameConfirm = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[2]", "Name");
				final WebElement emailConfirm = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[3]", "Email");
				final WebElement langconfirm = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[4]", "email lang");
				final WebElement securityQConfirm = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[5]", "security question");
				final WebElement securityAnswerConfirm = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[6]", "security answer");

				if (!mobileAction.verifyTextEquality(reviewDetails.getText(),
						mobileAction.getAppString("add_rcp_confirm_message"))
						|| !mobileAction.verifyTextEquality(nameConfirm.getText(),
								mobileAction.getAppString("str_rcp_name"))
						|| !mobileAction.verifyTextEquality(emailConfirm.getText(),
								mobileAction.getAppString("str_rcp_email1"))
						|| !mobileAction.verifyTextEquality(langconfirm.getText(),
								mobileAction.getAppString("str_rcp_language"))
						|| !mobileAction.verifyTextEquality(securityQConfirm.getText(),
								mobileAction.getAppString("str_security_question"))
						|| !mobileAction.verifyTextEquality(securityAnswerConfirm.getText(),
								mobileAction.getAppString("str_security_answer1"))) {
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
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the add recipients
	 * success page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddRecipientSuccessTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				addAndReviewRecipient();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement addRecipientButton = mobileAction.verifyWebElementUsingXPath(
						"//button[@class='primary-button green-button ng-binding']", "Add Recipient button");
				addRecipientButton.click();
				mobileAction.waitForElementToVanish(progress_bar);
				// Switch to native
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("str_success") + "']",
						"Success title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement thankYou = mobileAction.verifyWebElementUsingXPath(
						"//div[@class='accessibility-link']/div[@class='thank-you ng-binding']", "Thank you");
				final WebElement successMsg = mobileAction.verifyWebElementUsingXPath(
						"//div[@class='accessibility-link']/div[@class='copy ng-binding']", "Success msg");
				final WebElement name2 = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[2]", "name");
				final WebElement email2 = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[3]", "email");
				final WebElement emailLang2 = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[4]", "email lang");
				final WebElement securityQ2 = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[5]", "security q");
				final WebElement securityAnswer2 = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[6]", "security answer");
				final WebElement home = mobileAction.verifyWebElementUsingXPath("//button[@class='home ng-binding']",
						"home");
				final WebElement addAnother = mobileAction
						.verifyWebElementUsingXPath("//button[@class='add-recipient ng-binding']", "add another");
				final WebElement payRecipient = mobileAction
						.verifyWebElementUsingXPath("//button[@class='pay-recipient ng-binding']", "pay this account");
				if (!mobileAction.verifyTextEquality(thankYou.getText(), mobileAction.getAppString("receipt_thankyou"))
						|| !mobileAction.verifyTextEquality(successMsg.getText(),
								mobileAction.getAppString("add_recipient_success"))
						|| !mobileAction.verifyTextEquality(name2.getText(),
								mobileAction.getAppString("str_rcp_name").replace("\"", ""))
						|| !mobileAction.verifyTextEquality(email2.getText(),
								mobileAction.getAppString("str_rcp_email1").replace("\"", ""))
						|| !mobileAction.verifyTextEquality(emailLang2.getText(),
								mobileAction.getAppString("str_rcp_language"))
						|| !mobileAction.verifyTextEquality(securityQ2.getText(),
								mobileAction.getAppString("str_security_question"))
						|| !mobileAction.verifyTextEquality(securityAnswer2.getText(),
								mobileAction.getAppString("str_security_answer1"))
						|| !mobileAction.verifyTextEquality(home.getText(),
								mobileAction.getAppString("btn_go_back_home"))
						|| !mobileAction.verifyTextEquality(addAnother.getText(),
								mobileAction.getAppString("btn_add_another_recipient"))
						|| !mobileAction.verifyTextEquality(payRecipient.getText(),
								mobileAction.getAppString("btn_pay_this_recipient"))) {
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
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void addAndReviewRecipient() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// Enter details and get to confirmation screen
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement name = mobileAction.verifyWebElementUsingXPath("//input[@name='name']", "Name");
				name.sendKeys(getTestdata("RecipientName"));
				final WebElement email = mobileAction.verifyWebElementUsingXPath("//input[@name='email']", "Email");
				email.sendKeys(UUID.randomUUID().toString().replace("-", "") + "@test.zz");
				final WebElement securityQ = mobileAction.verifyWebElementUsingXPath("//input[@name='question']",
						"Security Questions");
				securityQ.sendKeys(getTestdata("Security_Question"));
				final WebElement answer = mobileAction.verifyWebElementUsingXPath("//input[@name='securityAnswer']",
						"Answer");
				answer.sendKeys(getTestdata("SecurityAnswer"));
				final WebElement answerConfirm = mobileAction
						.verifyWebElementUsingXPath("//input[@name='securityAnswer2']", "Enter Answer");
				answerConfirm.sendKeys(getTestdata("SecurityAnswer"));
				final WebElement review = mobileAction.verifyWebElementUsingXPath(
						"//button[@aria-label=\"" + mobileAction.getAppString("btn_review_details") + "\"]", "Review");
				review.click();
				mobileAction.waitForElementToVanish(progress_bar);
				// Switch to native
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("review_details_title") + "']",
						"Confirm title");
			}
		} catch (NoSuchElementException | IOException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
