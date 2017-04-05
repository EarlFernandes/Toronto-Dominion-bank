package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AddPayee extends _CommonPage {
	
	private static AddPayee AddPayee;
	
	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;
	
	@iOSFindBy(xpath = "//*[@label='Search for Canadian payees']")
	private MobileElement searchForCanadianPayee ;
	
	@iOSFindBy(xpath = "//*[contains(@label,'found any matches. Please try again.')]")
	private MobileElement errorMessage;
	
	//String selectVal=getTestdata("Search");
	String selectVal=getTestdata("Search");
	
	
	
	public synchronized static AddPayee get() {
		if (AddPayee == null) {
			AddPayee = new AddPayee();
		}
		return AddPayee;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will click on add payee button
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


	public void searchPayee(){
	Decorator();
	try{
			
			mobileAction.FuncClick(searchForCanadianPayee, "Search For Canadian Payee");
			mobileAction.FuncSendKeys(searchForCanadianPayee,selectVal);
			mobileAction.verifyElementIsDisplayed(errorMessage,"We haven't found any matches. Please try again.");
			
		
	
	}catch (NoSuchElementException | InterruptedException | IOException e) {
		System.err.println("TestCase has failed.");
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	}
}
	

	/**
	 * This method will verify text within elements for the add payee review screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddPayeeReviewTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement searchForPayee = mobileAction.verifyWebElementUsingXPath("//input[@ng-model='searchText']", "Search for payee");
				searchForPayee.sendKeys(getTestdata("Payee"));
				mobileAction.waitForElementToVanish(progressBar);
				final WebElement payee = mobileAction.verifyWebElementUsingXPath("//a[@id='result0']", "click payee");
				payee.click();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("add_cdn_payee_title") + "']", "Add Canadian Payee title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement payeeName= mobileAction.verifyWebElementUsingXPath("(//label[@class='drop-down-label ng-binding'])[1]", "Payee Name");
				final WebElement payeeAccount = mobileAction.verifyWebElementUsingXPath("//label[@id='accountNumber_label']", "Payee Account");
				// FIXME: Check why hint is not seen
				//final WebElement payeeAccountHint = mobileAction.verifyWebElementUsingXPath("//input[@id='accountNumber']", "Payee account hint");
				final WebElement warningMsg = mobileAction.verifyWebElementUsingXPath("//div[@class='placeholder ng-binding']", "warning msg");
				final WebElement description = mobileAction.verifyWebElementUsingXPath("//label[@id='description_label']", "Description");
				//final WebElement descriptionHint = mobileAction.verifyWebElementUsingXPath("//input[@name='description']", "Description hint");
				final WebElement continueButton = mobileAction.verifyWebElementUsingXPath("//button[@class='primary-button ng-binding disable']", "Continue button");

				if (!mobileAction.verifyTextEquality(payeeName.getText().trim(), mobileAction.getAppString("str_payee_name")) ||
						!mobileAction.verifyTextEquality(payeeAccount.getText().trim(), mobileAction.getAppString("str_payee_account")) || 
						//!mobileAction.verifyTextEquality(payeeAccountHint.getText().trim(), mobileAction.getAppString("add_cdn_payee_dtl_hint")) ||
						!mobileAction.verifyTextEquality(warningMsg.getText().trim(), mobileAction.getAppString("add_cdn_payee_dtl_copy")) ||
						!mobileAction.verifyTextEquality(description.getText().trim(), mobileAction.getAppString("str_Description_cml_case")) ||
						//!mobileAction.verifyTextEquality(descriptionHint.getText().trim(), mobileAction.getAppString("str_optional")) ||
						!mobileAction.verifyTextEquality(continueButton.getText().trim(), mobileAction.getAppString("str_continue"))){
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
	 * This method will verify text within elements for the add payee confirmation screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddPayeeConfirmationTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement searchForPayee = mobileAction.verifyWebElementUsingXPath("//input[@ng-model='searchText']", "Search for payee");
				searchForPayee.sendKeys(getTestdata("Payee"));
				mobileAction.waitForElementToVanish(progressBar);
				final WebElement payee = mobileAction.verifyWebElementUsingXPath("//a[@id='result0']", "click payee");
				payee.click();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				//System.out.println("source : "+ ((AppiumDriver) CL.GetDriver()).getPageSource());
				final WebElement payeeAccount = mobileAction.verifyWebElementUsingXPath("//input[@id='accountNumber']", "Payee Account");
				final WebElement continueButton = mobileAction.verifyWebElementUsingXPath("//button[@class='primary-button ng-binding disable']", "Continue button");
				payeeAccount.sendKeys(getTestdata("FromAccount"));
				continueButton.click();
				mobileAction.waitForElementToVanish(progressBar);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("review_details_title") + "']", "Confirm");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement confirmMsg= mobileAction.verifyWebElementUsingXPath("//div[@class='message-holder ng-binding ng-scope']", "Confirmation Msg");
				final WebElement payeeName2= mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding ng-scope'])[1]", "Payee Name");
				final WebElement payeeAccount2 = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[2]", "Payee Account");
				final WebElement description2 = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[3]", "description msg");
				final WebElement addPayeeButton = mobileAction.verifyWebElementUsingXPath("//button[@class='primary-button green-button ng-binding']", "Continue button");

				if (!mobileAction.verifyTextEquality(payeeName2.getText().trim(), mobileAction.getAppString("str_payee_name")) ||
						!mobileAction.verifyTextEquality(confirmMsg.getText().trim(), mobileAction.getAppString("add_payee_confirm_message")) || 
						!mobileAction.verifyTextEquality(payeeAccount2.getText().trim(), mobileAction.getAppString("str_payee_account")) || 
						!mobileAction.verifyTextEquality(description2.getText().trim(), mobileAction.getAppString("str_description")) ||
						!mobileAction.verifyTextEquality(addPayeeButton.getText().trim(), mobileAction.getAppString("btn_add_payee"))){
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
	 * This method will verify text within elements for the add payee success screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddPayeeSuccessTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement searchForPayee = mobileAction.verifyWebElementUsingXPath("//input[@ng-model='searchText']", "Search for payee");
				searchForPayee.sendKeys(getTestdata("Payee"));
				mobileAction.waitForElementToVanish(progressBar);
				final WebElement payee = mobileAction.verifyWebElementUsingXPath("//a[@id='result0']", "click payee");
				payee.click();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				System.out.println("source : "+ ((AppiumDriver) CL.GetDriver()).getPageSource());
				final WebElement payeeAccount = mobileAction.verifyWebElementUsingXPath("//input[@id='accountNumber']", "Payee Account");
				final WebElement continueButton = mobileAction.verifyWebElementUsingXPath("//button[@class='primary-button ng-binding disable']", "Continue button");
				payeeAccount.sendKeys(getTestdata("FromAccount"));
				continueButton.click();
				mobileAction.waitForElementToVanish(progressBar);

				mobileAction.switchAppiumContext("NATIVE_APP");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement addPayeeButton = mobileAction.verifyWebElementUsingXPath("//button[@class='primary-button green-button ng-binding']", "Continue button");
				addPayeeButton.click();
				mobileAction.waitForElementToVanish(progressBar);

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("add_payee_success_title") + "']", "Success title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.waitForElementToVanish(progressBar);

				final WebElement thankYou = mobileAction.verifyWebElementUsingXPath("//div[@class='thank-you ng-binding']", "Thank you");
				final WebElement successMsg = mobileAction.verifyWebElementUsingXPath("//div[@class='copy ng-binding']", "Success Msg");
				final WebElement payeeName = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding ng-scope'])[1]", "Payee Name");
				final WebElement payeeAccount2 = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[2]", "Payee Account");
				final WebElement description = mobileAction.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[3]", "description msg");
				final WebElement home = mobileAction.verifyWebElementUsingXPath("//button[@class='home ng-binding']", "home button");
				final WebElement addAnother = mobileAction.verifyWebElementUsingXPath("//button[@class='add-payee ng-binding']", "add payee button");
				final WebElement payPayee = mobileAction.verifyWebElementUsingXPath("//button[@class='pay-payee ng-binding']", "pay payee button");

				if (!mobileAction.verifyTextEquality(thankYou.getText().trim(), mobileAction.getAppString("str_thank_you")) ||
						!mobileAction.verifyTextEquality(successMsg.getText().trim(), mobileAction.getAppString("add_cdn_payee_success_copy")) || 
						!mobileAction.verifyTextEquality(payeeName.getText().trim(), mobileAction.getAppString("str_payee_name")) || 
						!mobileAction.verifyTextEquality(payeeAccount2.getText().trim(), mobileAction.getAppString("str_payee_account")) ||
						!mobileAction.verifyTextEquality(description.getText().trim(), mobileAction.getAppString("str_description")) ||
						!mobileAction.verifyTextEquality(home.getText().trim(), mobileAction.getAppString("btn_go_back_home")) ||
						!mobileAction.verifyTextEquality(addAnother.getText().trim(), mobileAction.getAppString("btn_add_another_payee")) ||
						!mobileAction.verifyTextEquality(payPayee.getText().trim(), mobileAction.getAppString("btn_payee_this_payee"))){
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
