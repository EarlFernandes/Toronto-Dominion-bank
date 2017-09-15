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

public class AutoDepositPage extends _CommonPage {

	private static AutoDepositPage AutoDepositPage;

	public synchronized static AutoDepositPage get() {
		if (AutoDepositPage == null) {
			AutoDepositPage = new AutoDepositPage();
		}
		return AutoDepositPage;
	}

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Manage Autodeposit']") // TODO::IOSXpath
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/auto_deposit_add_button']")
	private MobileElement setupAutoDepositBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Manage Autodeposit']") // TODO::IOSXpath
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_value_item1']")
	private MobileElement myName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Manage Autodeposit']") // TODO::IOSXpath
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/add_auto_deposit_email_edit']")
	private MobileElement emailIdTxt;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Manage Autodeposit']") // TODO::IOSXpath
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/add_auto_deposit_confirm_email_edit']")
	private MobileElement confirmEmailIdTxt;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Manage Autodeposit']") // TODO::IOSXpath
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/add_auto_deposit_account_selection']")
	private MobileElement chooseAccDropDown;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will click on 'Set up autodeposit' button present on
	 * Autodeposit screen.
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
	public void clickSetUpAutoDepositBtn() {

		Decorator();
		try {

			mobileAction.FuncClick(setupAutoDepositBtn, "Set up Autodeposit Button");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will fill the autodeposit required fields and press continue
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
	public void setupAutoDeposit() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(myName, "Profile Name: " + myName.getText());
			mobileAction.FuncClick(emailIdTxt, "Email ID textfiled");
			mobileAction.FuncSendKeys(emailIdTxt, getTestdata("Email"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(confirmEmailIdTxt, "Confirm Email ID");
			mobileAction.FuncSendKeys(confirmEmailIdTxt, getTestdata("Email"));
			mobileAction.FuncHideKeyboard();
			mobileAction.FuncClick(chooseAccDropDown, "Choose Account Drop Down");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
}
