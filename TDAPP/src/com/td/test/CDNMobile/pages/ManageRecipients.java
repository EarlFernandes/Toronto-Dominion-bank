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

public class ManageRecipients extends _CommonPage {

    private static ManageRecipients ManageRecipients;
    @iOSFindBy(xpath = "//*[@label='Manage Recipients']")
    private MobileElement manageRecipientHeader;

    @iOSFindBy(xpath = "//*[@label='Register']")
    private MobileElement registerBtn;

    @iOSFindBy(xpath = "//*[@label='In progress']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
    private MobileElement progressBar;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeLink[1]/XCUIElementTypeLink/XCUIElementTypeStaticText")
    private MobileElement selectRecipient;

    @iOSFindBy(xpath = "//*[@label='Edit']")
    private MobileElement editRecipient;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeTextField")
    private MobileElement recipientMailAddr;

    @iOSFindBy(xpath = "//*[@label='Done']")
    private MobileElement done;

    @iOSFindBy(xpath = "//*[@label='Enter the answer']")
    private MobileElement enterAnswer;

    @iOSFindBy(xpath = "//*[@label='Re-enter your answer']")
    private MobileElement reEnterAnswer;

    String recipientMail = getTestdata("RecipientMail", "UserIDs");
    String answer = getTestdata("SecurityAnswer", "UserIDs");

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
	try {
	    Decorator();
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

	} catch (NoSuchElementException e) {
	    System.err.println("TestCase has failed.");
	    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}

    }

}
