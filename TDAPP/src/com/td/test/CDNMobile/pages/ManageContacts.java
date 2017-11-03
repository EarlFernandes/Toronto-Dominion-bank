package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.sun.jna.Platform;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ManageContacts extends _CommonPage {

	private static ManageContacts ManageContacts;

	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[contains(@name,'Search') or contains(@name,'Rechercher')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/manage_contacts_search_field']")
	private MobileElement searchTextFiled;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='Manage Contacts' or @name='Gestion des destinataires']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement pageHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='add recipient hdr']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/menu_item_add_contact']")
	private MobileElement addContactSign;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Name' or @label='Nom']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amend_contacts_name_edit_text']")
	private MobileElement contactName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Email' or @label='Courriel']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amend_contacts_email_edit_text_field']")
	private MobileElement email;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirm Email Address' or @label='Confirmation de l’adresse courriel']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amend_contacts_email_confirm_edit_text_field']")
	private MobileElement confirmEmail;

	// @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Email Language
	// Preference' or @label='Langue de
	// préférence']/following-sibling::XCUIElementTypeStaticText")
	@iOSFindBy(xpath = "//XCUIElementTypeImage[@name='td_iemt_arrow_down']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/add_contacts_language_selection']")
	private MobileElement languageSpinner;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue' or @label='Continuer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_footer' or @text='Continue' or @text='Continuer']")
	private MobileElement continueButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")
	private MobileElement allowBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Thank you!' or @label='Merci!']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subHeader' or @text='Thank you!' or @text='Merci']")
	private MobileElement thankYou;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Add Contact' or @label='Ajouter un destinataire']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/manage_contacts_add_contact_button']")
	private MobileElement addContactButton;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/list_item_recipient_name']")
	private MobileElement mobileContact;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/list_item_recipient_email']")
	private MobileElement mobileEmail;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/list_item_recipient_name']")
	private MobileElement contact;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Edit' or @label='Modifier']")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/delete_menu_edit']")
	private MobileElement editContact;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Security Question' or @label='Question de sécurité']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amend_contacts_security_question_text_field']") // updated
	private MobileElement securityQuestion;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Security Answer' or @label='Réponse à la question de sécurité']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amend_contacts_security_answer_text_field']") // updated
	private MobileElement securityAns;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Confirm Answer' or @label='Confirmation de la réponser']/following-sibling::XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amend_contacts_security_answer_confirm_text_field']") // updated
	private MobileElement confirmAnswer;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done' or @text='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeOther/following-sibling::XCUIElementTypeButton[@label='Done' or @label='OK' or @label='Ok']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_footer' or @text='Done' or @text='Terminé']")
	private List<MobileElement> editDone;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Delete' or @label='Supprimer']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/detail_menu_delete']")
	private MobileElement deleteOption;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='No' or @label='Non']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private MobileElement noOption;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Yes' or @label='Oui']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement yesOption;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Are you sure you want to delete') or contains(@label,'Voulez-vous vraiment supprimer')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/delete_contact_body_text_view']")
	private MobileElement deleteWarning;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText/following-sibling::XCUIElementTypeButton[@label='Continue' or @label='Continuer']")
	private MobileElement alertContinue;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Allow' or @label='Autoriser']")
	private MobileElement alertAllow;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Settings')]")
	private MobileElement settings;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeActivityIndicator[`value=='1'")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_heading']")
	private List<MobileElement> language;

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	int contactCounter = 0;

	public synchronized static ManageContacts get() {
		if (ManageContacts == null) {
			ManageContacts = new ManageContacts();
		}
		return ManageContacts;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * @author Ashraf This method will verify Search Button and textField on
	 *         Manage Contacts
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyPageHeader() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(pageHeader, "Manage Contacts Header");
			mobileAction.verifyElementIsDisplayed(searchTextFiled, "Search Text Filed");

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
	 * @author Ashraf This method will click on Add contact Plus sign on Manage
	 *         Contacts
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickAddContactPlusSign() {
		Decorator();
		try {

			mobileAction.FuncClick(addContactSign, "Add Contacts Sign");

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
	 * @author Ashraf This method will click on Add contact button on Manage
	 *         Contacts
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickAddContactButton() {
		Decorator();
		try {

			if (mobileAction.verifyElementIsPresent(addContactButton)) {
				mobileAction.FuncClick(addContactButton, "Add Contacts Button");
			} else {
				mobileAction.FuncClick(addContactSign, "Add contact plus button");
			}

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
	 * @author Ashraf This method will fill the contact details and add a
	 *         contact on Manage Contacts page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void addContact() {
		Decorator();

		String contactNameXL = getTestdata("Name");
		String[] contactNameTxt = contactNameXL.split(": ");

		if (contactNameTxt.length == 1) {
			contactCounter = 0;
		}

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {

				mobileAction.FuncClick(contactName, "Contact Name");
				mobileAction.FuncSendKeys(contactName, contactNameTxt[contactCounter]);
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(email, "Email");
				mobileAction.FuncSendKeys(email, getTestdata("Email"));
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(confirmEmail, "Confirm Email");
				mobileAction.FuncSendKeys(confirmEmail, getTestdata("Email"));
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(languageSpinner, "Language Drop Down");

			} else {
				mobileAction.FuncClick(contactName, "Contact Name");
				mobileAction.FuncSendKeys(contactName, contactNameTxt[contactCounter]);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(email, "Email");
				mobileAction.FunctionSwipe("up", 200, 1000);
				mobileAction.FuncSendKeys(email, getTestdata("Email"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(confirmEmail, "Confirm Email");
				mobileAction.FunctionSwipe("up", 200, 1000);
				mobileAction.FuncSendKeys(confirmEmail, getTestdata("Email"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(languageSpinner, "Language Drop Down");

			}

			if (getTestdata("Language").equalsIgnoreCase("English")) {
				mobileAction.FuncClick(language.get(0), language.get(0).getText());
			} else if (getTestdata("Language").equalsIgnoreCase("French")) {
				mobileAction.FuncClick(language.get(1), language.get(1).getText());
			}

			mobileAction.FuncClick(continueButton, "Continue Button");

			contactCounter++;
			if (contactCounter >= 3) {
				contactCounter = 0;
			}

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
	 * @author Ashraf This method will verify the success message on after
	 *         creating a contact.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifySuccessMessage() {
		Decorator();
		try {

			MobileElement contactCreated = null;

			mobileAction.verifyElementIsDisplayed(thankYou, "Thank you!");

			if (platformName.equalsIgnoreCase("Android")) {

				contactCreated = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/receipt_subSubHeader' and contains(@text,'"
								+ getTextInCurrentLocale(StringArray.CONTACT_ADDED_SUCCESS_MSG) + "')]");

			} else {
				contactCreated = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@label,'"
								+ getTextInCurrentLocale(StringArray.CONTACT_ADDED_SUCCESS_MSG) + "')]");

			}

			mobileAction.verifyElementIsDisplayed(contactCreated, "The contact has been added successfully.");

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
	 * @author Ashraf This method will click on Add contact button on Manage
	 *         Contacts
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickAddContactfromPhone() {
		Decorator();
		try {

			MobileElement addContactFromPhone = null;

			if (platformName.equalsIgnoreCase("Android")) {
				addContactFromPhone = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/add_contacts_row_title' or contains(@text,'"
								+ getTextInCurrentLocale(StringArray.ADD_CONTACT_FROM_PHONE_MSG) + "')]");
			} else {
				addContactFromPhone = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@label,'"
								+ getTextInCurrentLocale(StringArray.ADD_CONTACT_FROM_PHONE_MSG) + "')]");
			}

			mobileAction.FuncClick(addContactFromPhone, "Add Contacts From Phone");

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
	 * @author Ashraf This method will add contact from phone.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void AddContactfromPhone() {
		Decorator();
		try {

			if (platformName.equalsIgnoreCase("Android")) {

				if (mobileAction.verifyElementIsPresent(continueButton)) {
					mobileAction.FuncClick(continueButton, "Continue Button");
					mobileAction.FuncClick(allowBtn, "Allow Button");
				}

				String contactNme = mobileContact.getText();
				String contactMail = mobileEmail.getText();
				mobileAction.FuncClick(mobileContact, "Phone Contact");
				mobileAction.verifyTextEquality(contactName.getText(), contactNme);
				mobileAction.verifyTextEquality(email.getText(), contactMail);
				mobileAction.FuncClick(languageSpinner, "Language Drop Down");

				if (getTestdata("Language").equalsIgnoreCase("English")) {
					mobileAction.FuncClick(language.get(0), language.get(0).getText());
				} else if (getTestdata("Language").equalsIgnoreCase("French")) {
					mobileAction.FuncClick(language.get(1), language.get(1).getText());
				}

				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(continueButton, "Continue Button");
			} else {

				if (mobileAction.verifyElementIsPresent(alertContinue)) {
					mobileAction.FuncClick(alertContinue, "Continue");
					mobileAction.FuncClick(alertAllow, "Allow");

					mobileAction.FuncClick(settings, "Settings");
				}

				String contactNme = mobileContact.getText();
				String contactMail = mobileEmail.getText();
				mobileAction.FuncClick(mobileContact, "Phone Contact");
				mobileAction.verifyTextEquality(contactName.getText(), contactNme);
				mobileAction.verifyTextEquality(email.getText(), contactMail);
				mobileAction.FuncClick(languageSpinner, "Language Drop Down");

				String languageXL = "//XCUIElementTypeCell/XCUIElementTypeStaticText[@label='" + getTestdata("Language")
						+ "']";
				MobileElement language = mobileAction.mobileElementUsingXPath(languageXL);
				mobileAction.FuncClick(language, "Language " + getTestdata("Language"));
				mobileAction.FuncClick(continueButton, "Continue Button");

			}

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
	 * @author Ashraf This method will click on a contact on Manage Contacts
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickContact() {
		Decorator();
		try {

			mobileAction.FuncClick(contact, "Contact: " + contact.getText());

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
	 * @author Ashraf This method will edit the contact and put the new values.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void editContact() {
		Decorator();
		try {

			if (platformName.equalsIgnoreCase("Android")) {
				mobileAction.FuncClick(editContact, "Edit Contact Button");
				mobileAction.FuncClick(contactName, "Contact Name");
				mobileAction.FuncSendKeys(contactName, getTestdata("Name"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(email, "Contact Email");
				mobileAction.FuncSendKeys(email, getTestdata("Email"));
				mobileAction.FuncHideKeyboard();

				if (mobileAction.verifyElementIsPresent(securityQuestion)) {
					mobileAction.FuncClick(securityQuestion, "SecurityQuestion");
					mobileAction.FuncSendKeys(securityQuestion, getTestdata("SecurityQuestion"));
					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(securityAns, "Security Answer");
					mobileAction.FuncSendKeys(securityAns, getTestdata("SecurityAnswer"));
					mobileAction.FuncHideKeyboard();
					mobileAction.FuncClick(confirmAnswer, "Confirm Answer");
					mobileAction.FuncSendKeys(confirmAnswer, getTestdata("SecurityAnswer"));
					mobileAction.FuncHideKeyboard();
				}

				mobileAction.FuncClick(languageSpinner, "Language Drop Down");

				if (getTestdata("Language").equalsIgnoreCase("English")) {
					mobileAction.FuncClick(language.get(0), language.get(0).getText());
				} else if (getTestdata("Language").equalsIgnoreCase("French")) {
					mobileAction.FuncClick(language.get(1), language.get(1).getText());
				}

				mobileAction.FuncClick(editDone.get(0), "Done Button");

			} else {

				mobileAction.FuncClick(editContact, "Edit Contact Button");
				mobileAction.FuncClick(contactName, "Contact Name");
				mobileAction.FuncSendKeys(contactName, getTestdata("Name"));
				mobileAction.FuncClick(editDone.get(1), "Done");
				mobileAction.FuncClick(email, "Contact Email");
				mobileAction.FuncSendKeys(email, getTestdata("Email"));
				mobileAction.FuncClick(editDone.get(1), "Done");

				if (mobileAction.verifyElementIsPresent(securityQuestion)) {
					mobileAction.FuncClick(securityQuestion, "SecurityQuestion");
					mobileAction.FuncSendKeys(securityQuestion, getTestdata("SecurityQuestion"));
					mobileAction.FuncClick(editDone.get(1), "Done");
					mobileAction.FuncClick(securityAns, "Security Answer");
					mobileAction.FuncSendKeys(securityAns, getTestdata("SecurityAnswer"));
					mobileAction.FuncClick(editDone.get(1), "Done");
					mobileAction.FuncClick(confirmAnswer, "Security Answer");
					mobileAction.FuncSendKeys(confirmAnswer, getTestdata("SecurityAnswer"));
					mobileAction.FuncClick(editDone.get(1), "Done");

				}

				mobileAction.FuncClick(languageSpinner, "Language Drop Down");

				if (getTestdata("Language").equalsIgnoreCase("English")) {
					mobileAction.FuncClick(language.get(0), language.get(0).getText());
				} else if (getTestdata("Language").equalsIgnoreCase("French")) {
					mobileAction.FuncClick(language.get(1), language.get(1).getText());
				}

				mobileAction.FuncClickDone();
			}

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
	 * @author Ashraf This method will verify the edit contact success message
	 *         on success screen.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyContactEditSuccessMsg() {
		Decorator();
		try {

			MobileElement editContactSuccessMsg = null;

			if (platformName.equalsIgnoreCase("Android")) {
				editContactSuccessMsg = mobileAction
						.mobileElementUsingXPath("//android.widget.TextView[contains(@text,'"
								+ getTextInCurrentLocale(StringArray.CONTACT_EDIT_SUCCESS_MSG) + "')]");
			} else {
				editContactSuccessMsg = mobileAction
						.mobileElementUsingXPath("//XCUIElementTypeOther/XCUIElementTypeStaticText[contains(@label,'"
								+ getTextInCurrentLocale(StringArray.CONTACT_EDIT_SUCCESS_MSG) + "')]");
			}

			mobileAction.verifyElementIsDisplayed(editContactSuccessMsg, "Your Contact Has been Edited Successfully");

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
	 * @author Ashraf This method will click on delete contact icon but will not
	 *         delete the contact.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void noDeleteContact() {
		Decorator();
		try {

			mobileAction.FuncClick(deleteOption, "Delete Contact");
			mobileAction.verifyElementIsDisplayed(deleteWarning, "Warning: Are you sure you want to delete");
			mobileAction.verifyElementIsDisplayed(noOption, "No");
			mobileAction.verifyElementIsDisplayed(yesOption, "Yes");
			mobileAction.FuncClick(noOption, "No");

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
	 * @author Ashraf This method will click on delete contact icon and will
	 *         delete the contact.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void deleteContact() {
		Decorator();
		try {

			mobileAction.FuncClick(deleteOption, "Delete Contact");
			mobileAction.FuncClick(yesOption, "Yes");

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
	 * @author Ashraf This method will verify the delete contact success
	 *         message.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyContactDeleteSuccessMsg() {
		Decorator();
		try {

			MobileElement contactDeletSuccMsg = null;

			if (platformName.equalsIgnoreCase("Android")) {
				contactDeletSuccMsg = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/banner_info' and contains(@text,'"
								+ getTextInCurrentLocale(StringArray.CONTACT_DELETE_SUCCESS_MSG) + "')]");
			} else {
				contactDeletSuccMsg = mobileAction.mobileElementUsingXPath("//XCUIElementTypeButton[contains(@label,'"
						+ getTextInCurrentLocale(StringArray.CONTACT_DELETE_SUCCESS_MSG) + "')]");
			}

			mobileAction.verifyElementIsDisplayed(contactDeletSuccMsg, "Contact Has been deleted successfully");

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
	 * @author Ashraf This method will edit the multiprofile contact.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void MultiProfileEditContact() {
		Decorator();
		try {

			String profileTypesXL = getTestdata("UserProfileType");
			String[] profiles = profileTypesXL.split(": ");

			for (int i = 0; i < profiles.length; i++) {

				clickContact();
				editContact();
				verifyContactEditSuccessMsg();
				mobileAction.waitForElementToVanish(progressBar);

				if (i != 2) {
					for (int m = 0; m <= i; m++) {
						mobileAction.FunctionSwipe("left", 200, 200);
						Thread.sleep(2000);
					}
				}

			}

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
	 * @author Ashraf This method will delete the multiprofile contacts.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void MultiProfileDeleteContact() {
		Decorator();
		try {

			String profileTypesXL = getTestdata("UserProfileType");
			String[] profiles = profileTypesXL.split(": ");

			for (int i = 0; i < profiles.length; i++) {

				clickContact();
				noDeleteContact();
				deleteContact();
				verifyContactDeleteSuccessMsg();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FunctionSwipe("left", 200, 200);

			}

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
	 * @author Ashraf This method will add contact to each profile for
	 *         multiprofile.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void MultiProfileAddContact() {
		Decorator();
		try {

			String profileTypesXL = getTestdata("UserProfileType");
			String[] profiles = profileTypesXL.split(": ");

			for (int i = 0; i < profiles.length; i++) {

				clickAddContactPlusSign();
				addContact();
				verifySuccessMessage();
				// Interac_e_Registration.get().clickGoBackHome();

				if (platformName.equalsIgnoreCase("Android")) {
					mobileAction.FuncClickBackButton();
				} else {
					HomeScreen.get().clickMenu();
					MenuPage.get().clickMenuTransfer();
					Transfers.get().clickManageContactsLink();
				}

				if (i != 2) {
					for (int m = 0; m <= i; m++) {
						mobileAction.FunctionSwipe("left", 200, 100);
						mobileAction.waitForElementToVanish(progressBar);
					}
				}

			}

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
}
