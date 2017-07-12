package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ManageContacts extends _CommonPage {

	private static ManageContacts ManageContacts;
	
	@iOSFindBy(xpath="//XCUIElementTypeSearchField[contains(@name,'Search')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/manage_contacts_search_field' and @text='Search']")
	private MobileElement searchTextFiled;
	
	@iOSFindBy(xpath="//XCUIElementTypeNavigationBar[@name='Manage Contacts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Contacts']")
	private MobileElement pageHeader;
	
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/menu_item_add_contact']")
	private MobileElement addContactSign;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/add_contacts_name_edit_text']")
	private MobileElement contactName;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/add_contacts_email_edit_text_field']")
	private MobileElement email;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/add_contacts_email_confirm_edit_text_field']")
	private MobileElement confirmEmail;
	
	@AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id='com.td:id/add_contacts_language_preference_spinner']")
	private MobileElement languageSpinner;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_footer' or @text='Continue']")
	private MobileElement continueButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header' or @text='Thank you!']")
	private MobileElement thankYou;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subHeader' or contains(@text,'The contact has been added successfully')]")
	private MobileElement contactCreated;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/manage_contacts_add_contact_button']")
	private MobileElement addContactButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/add_contacts_row_title' or contains(@text,'Add a contact from your phone')]")
	private MobileElement addContactFromPhone;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.android.contacts:id/cliv_name_textview']")
	private MobileElement mobileContact;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.android.contacts:id/cliv_data_view']")
	private MobileElement mobileEmail;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/list_item_recipient_name']")
	private MobileElement contact;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/delete_menu_edit']")
	private MobileElement editContact;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_contacts_security_question_text_field']")
	private MobileElement securityQuestion;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edit_contacts_security_answer_text_field']")
	private MobileElement securityAns;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done']")
	private MobileElement done;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Contact has been edited successfully')]")   //Xpath not verified due to app issue. Needs to change it. @Ashraf sprint 2
	private MobileElement editContactSuccessMsg;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'The contact has been deleted successfully')]")   
	private MobileElement contactDeletSuccMsg;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/detail_menu_delete']")
	private MobileElement deleteOption;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2' and @text='No']")
	private MobileElement noOption;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Yes']")
	private MobileElement yesOption;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/delete_contact_body_text_view' and contains(@text,'Are you sure you want to delete')]")
	private MobileElement deleteWarning;
	
	int contactCounter=0;
	
	public synchronized static ManageContacts get() {
		if (ManageContacts == null) {
			ManageContacts = new ManageContacts();
		}
		return ManageContacts;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	
	/**
     * @author Ashraf
     * This method will verify Search Button and textField on Manage Contacts
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

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    

    /**
     * @author Ashraf
     * This method will click on Add contact Plus sign on Manage Contacts
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

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (InterruptedException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    /**
     * @author Ashraf
     * This method will click on Add contact button on Manage Contacts
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

		mobileAction.FuncClick(addContactButton, "Add Contacts Button");

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (InterruptedException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    /**
     * @author Ashraf
     * This method will fill the contact details and add a contact on Manage Contacts page.
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
	
	String contactNameXL=getTestdata("Name");
	String [] contactNameTxt=contactNameXL.split(": ");
	
	try {
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
			//TODO::iOS
		}
		else{
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
		String languageXL="//android.widget.CheckedTextView[@text='"+getTestdata("Language")+"']";
		MobileElement language=mobileAction.mobileElementUsingXPath(languageXL);
		mobileAction.FuncClick(language, "Language "+getTestdata("Language"));
		mobileAction.FuncClick(continueButton, "Continue Button");
		}

		contactCounter++;
		if(contactCounter>=3){
			contactCounter=0;
		}
		
	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (InterruptedException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    
    /**
     * @author Ashraf
     * This method will verify the success message on after creating a contact.
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

		mobileAction.verifyElementIsDisplayed(thankYou, "Thank you!");
		mobileAction.verifyElementIsDisplayed(contactCreated, "The contact has been added successfully.");

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    
    /**
     * @author Ashraf
     * This method will click on Add contact button on Manage Contacts
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

		mobileAction.FuncClick(addContactFromPhone, "Add Contacts From Phone");

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (InterruptedException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    /**
     * @author Ashraf
     * This method will click on Add contact button on Manage Contacts
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

		String contactNme=mobileContact.getText();
		String contactMail=mobileEmail.getText();
		mobileAction.FuncClick(mobileContact, "Phone Contact");
		mobileAction.verifyTextEquality(contactName.getText(), contactNme);
		mobileAction.verifyTextEquality(email.getText(), contactMail);
		mobileAction.verifyTextEquality(confirmEmail.getText(), contactMail);
		mobileAction.FuncClick(languageSpinner, "Language Drop Down");
		String languageXL="//android.widget.CheckedTextView[@text='"+getTestdata("Language")+"']";
		MobileElement language=mobileAction.mobileElementUsingXPath(languageXL);
		mobileAction.FuncClick(language, "Language "+getTestdata("Language"));
		mobileAction.FuncClick(continueButton, "Continue Button");
		

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (InterruptedException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    /**
     * @author Ashraf
     * This method will click on a contact on Manage Contacts
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

		mobileAction.FuncClick(contact, "Contact: "+contact.getText());
		

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (InterruptedException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    /**
     * @author Ashraf
     * This method will edit the contact and put the new values.
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

		mobileAction.FuncClick(editContact, "Edit Contact Button");
		mobileAction.FuncClick(contactName, "Contact Name");
		mobileAction.FuncSendKeys(contactName, getTestdata("Name"));
		mobileAction.FuncHideKeyboard();
		mobileAction.FuncClick(email, "Contact Email");
		mobileAction.FuncSendKeys(email, getTestdata("Email"));
		mobileAction.FuncHideKeyboard();
		
		if(mobileAction.verifyElementIsPresent(securityQuestion)){
		mobileAction.FuncClick(securityQuestion, "SecurityQuestion");
		mobileAction.FuncSendKeys(securityQuestion, getTestdata("SecurityQuestion"));
		mobileAction.FuncHideKeyboard();
		mobileAction.FuncClick(securityAns, "Security Answer");
		mobileAction.FuncSendKeys(securityAns,getTestdata("SecurityAnswer"));
		mobileAction.FuncHideKeyboard();
		}
		
		mobileAction.FuncClick(languageSpinner, "Language Drop Down");
		String languageXL="//android.widget.CheckedTextView[@text='"+getTestdata("Language")+"']";
		MobileElement language=mobileAction.mobileElementUsingXPath(languageXL);
		mobileAction.FuncClick(language, "Language "+getTestdata("Language"));
		mobileAction.FuncClick(done, "Done Button");

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (InterruptedException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    /**
     * @author Ashraf
     * This method will click on edit contact icon on Manage Contacts
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

		mobileAction.verifyElementIsDisplayed(editContactSuccessMsg, "Your Contact Has been Edited Successfully");

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    /**
     * @author Ashraf
     * This method will click on edit contact icon on Manage Contacts
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

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (InterruptedException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    /**
     * @author Ashraf
     * This method will click on edit contact icon on Manage Contacts
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
		mobileAction.verifyElementIsDisplayed(deleteWarning, "Warning: Are you sure you want to delete");
		mobileAction.verifyElementIsDisplayed(noOption, "No");
		mobileAction.verifyElementIsDisplayed(yesOption, "Yes");
		mobileAction.FuncClick(yesOption, "Yes");

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (InterruptedException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    
    /**
     * @author Ashraf
     * This method will click on edit contact icon on Manage Contacts
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

		mobileAction.verifyElementIsDisplayed(contactDeletSuccMsg, "Contact Has been deleted successfully");

	} catch (NoSuchElementException | IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    /**
     * @author Ashraf
     * This method will click on edit contact icon on Manage Contacts
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

		String profileTypesXL=getTestdata("UserProfileType");
		String [] profiles=profileTypesXL.split(": ");
		
		for(int i=0;i<profiles.length;i++){
			
			clickContact();
			editContact();
			verifyContactEditSuccessMsg();
			mobileAction.FunctionSwipe("left", 200, 200);
		}
		

	} catch (NoSuchElementException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    /**
     * @author Ashraf
     * This method will click on edit contact icon on Manage Contacts
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

		String profileTypesXL=getTestdata("UserProfileType");
		String [] profiles=profileTypesXL.split(": ");
		
		for(int i=0;i<profiles.length;i++){
			
			clickContact();
			noDeleteContact();
			verifyPageHeader();
			clickContact();
			deleteContact();
			verifyContactDeleteSuccessMsg();
			mobileAction.FunctionSwipe("left", 200, 200);
			
		}
		

	} catch (NoSuchElementException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
    /**
     * @author Ashraf
     * This method will click on edit contact icon on Manage Contacts
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

		String profileTypesXL=getTestdata("UserProfileType");
		String [] profiles=profileTypesXL.split(": ");
		
		for(int i=0;i<profiles.length;i++){
			
			clickAddContactPlusSign();
			addContact();
			verifySuccessMessage();
			Interac_e_Registration.get().clickGoBackHome();
			Transfers.get().clickManageContactsLink();
			
			if(i!=2){
				for(int m=0;m<=i;m++){
			mobileAction.FunctionSwipe("left", 200, 200);
				}
			}
			
		}
		

	} catch (NoSuchElementException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
	} catch (IOException e) {
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
	}
    }
    
    
}
