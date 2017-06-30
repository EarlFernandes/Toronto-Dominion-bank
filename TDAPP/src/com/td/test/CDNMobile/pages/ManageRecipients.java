package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class ManageRecipients extends _CommonPage {

    private static ManageRecipients ManageRecipients;
    @iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Manage Recipients']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Recipients']")
    private MobileElement manageRecipientHeader;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Register']")
    @AndroidFindBy(xpath = "//*[contains(@text,'Register') or contains(@content-desc,'Register')]")
    private MobileElement registerBtn;

    @iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
    private MobileElement progressBar;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeLink[1]/XCUIElementTypeLink/XCUIElementTypeStaticText")
     private MobileElement selectRecipient;


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
    public void verify_RegisterButton(){
	try {
	    Decorator();
	    mobileAction.verifyElementIsDisplayed(manageRecipientHeader, "Manage Recipients");
	    mobileAction.waitForElementToVanish(progressBar);
	    mobileAction.verifyElementIsDisplayed(registerBtn, "Register");
	}  catch (NoSuchElementException e) {
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
//	    Thread.sleep(3000);
//	    mobileAction.FuncClick(selectRecipient, "Select Recipient");
//	    mobileAction.waitForElementToVanish(progressBar);
//	    mobileAction.FuncClick(editRecipient, "Edit Recipient");
//	    mobileAction.waitForElementToVanish(progressBar);
//	    recipientMailAddr.clear();
//	    System.out.println("Edit email:" + recipientMail);
//	    mobileAction.FuncSendKeys(recipientMailAddr, recipientMail);
//	    mobileAction.FuncClick(done, "Done");
//	    mobileAction.FuncClick(enterAnswer, "Enter Answer");
//	    mobileAction.FuncSendKeys(enterAnswer, answer);
//	    mobileAction.FuncClick(reEnterAnswer, "Re Enter your Answer");
//	    mobileAction.FuncSendKeys(reEnterAnswer, answer);
//	    mobileAction.FuncClick(done, "Done");
//	    mobileAction.waitForElementToVanish(progressBar);
    	}
    	else
    		 {
    		//String recipient_saved = "Success Recipient details have been saved.";
    		mobileAction.waitForElementToVanish(progressBar);
    	    mobileAction.verifyElementIsDisplayed(manageRecipientHeader, "Manage Recipients");
//    	    String select_recipient ="//android.view.View[@content-desc='" + sender_SelectSender+ "']";
//		    MobileElement selectRecipient = mobileAction.verifyElementUsingXPath(select_recipient, "Select Recipient");
//    	    mobileAction.FuncClick(selectRecipient, "Select Recipient");
//    	    mobileAction.FuncClick(editRecipient, "Edit Recipient");
//    	    mobileAction.FuncClick(recipientMailAddr,"recipientMail");
//    	    recipientMailAddr.clear();
//    	    mobileAction.FuncSendKeys(recipientMailAddr, recipientMail);
//    	    mobileAction.FuncHideKeyboard();
//    	    mobileAction.FuncClick(enterAnswer, "Enter Answer");
//    	    mobileAction.FuncSendKeys(enterAnswer, answer);
//    	    mobileAction.FuncHideKeyboard();
//    	    mobileAction.FuncClick(reEnterAnswer, "Re Enter your Answer");
//    	    mobileAction.FuncSendKeys(reEnterAnswer, answer);
//    	    mobileAction.FuncHideKeyboard();
//    	    mobileAction.FuncClick(done, "Done"); 
//    	    //mobileAction.verifyElementIsDisplayed(recipient_Changes,"Success Recipient details have been saved");
    		 }

	}  catch (NoSuchElementException e) {
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

}
