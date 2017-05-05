package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	
	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@value='1']")
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
	 * This method will verify text within elements for the add US payee select address screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddUSPayeeSelectAddressTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				searchForPayee();
				clickOnFirstUSPayeeFound();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement searchHint = mobileAction.verifyWebElementUsingXPath("//input[@placeholder='" + mobileAction.getAppString("search_address_hint") + "']", "Search address hint");

				final WebElement msg = mobileAction.verifyWebElementUsingXPath("//div[@class='placeholder ng-binding']", "Select the payee address");
				final WebElement msg2 = mobileAction.verifyWebElementUsingXPath("//span[@class='ng-binding ng-scope']", "To add an address");

				final WebElement tapHere = mobileAction.verifyWebElementUsingXPath("//div[@class='custom_action ng-binding']", "Tap here");

				if (!mobileAction.verifyTextEquality(msg.getText().trim(), mobileAction.getAppString("please_select_payee_address") + " " + mobileAction.getAppString("str_add_address")) ||
						!mobileAction.verifyTextEquality(tapHere.getText().trim(), mobileAction.getAppString("tap_here_to_add_address"))){
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
	 * This method will verify text within elements for the add US payee review screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddUSPayeeReviewTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				searchForPayee();
				clickOnFirstUSPayeeFound();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.verifyWebElementUsingXPath("//div[@class='message-holder ng-binding ng-scope']", "Note");

				final WebElement payeeMailing = mobileAction.verifyWebElementUsingXPath("(//span[@class='ng-binding'])[1]", "Payee mailing");
				final WebElement payeeName = mobileAction.verifyWebElementUsingXPath("(//label[@class='drop-down-label ng-binding'])[1]", "Payee name");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder='" + mobileAction.getAppString("str_payee_address_1_hint") + "']", "Payee address hint");
				final WebElement payeeAddress = mobileAction.verifyWebElementUsingXPath("//label[@id='addressLine1_label']", "Payee address");
				final WebElement city = mobileAction.verifyWebElementUsingXPath("//label[@id='city_label']", "city");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder='" + mobileAction.getAppString("str_city_hint") + "']", "city hint");
				final WebElement state = mobileAction.verifyWebElementUsingXPath("//label[@id='state_label']", "state");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder='"+ mobileAction.getAppString("str_state_hint") + "']", "state hint");
				final WebElement zip = mobileAction.verifyWebElementUsingXPath("//label[@id='zipcode_label']", "zip");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder='" + mobileAction.getAppString("str_zip_code_hint") + "']", "zip hint");
				final WebElement account = mobileAction.verifyWebElementUsingXPath("//label[@id='accountNumber_label']", "account");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder='" + mobileAction.getAppString("str_enter_payee_account_number") + "']", "account hint");
				final WebElement desc = mobileAction.verifyWebElementUsingXPath("//label[@id='description_label']", "description");
				// FIXME: This is not seen, why?
				//mobileAction.verifyWebElementUsingXPath("//input[@placeholder='" + mobileAction.getAppString("optional") + "']", "description hint");
				final WebElement payeeAccountInfo = mobileAction.verifyWebElementUsingXPath("(//span[@class='ng-binding'])[2]", "payee account info header");
				final WebElement enterAccNumber = mobileAction.verifyWebElementUsingXPath("//div[@class='placeholder ng-binding ng-scope']", "enter your account");

				final WebElement continueButton = mobileAction.verifyWebElementUsingXPath("//button[@id='btn']", "Continue button");

				if (!mobileAction.verifyTextEquality(payeeMailing.getText().trim(), mobileAction.getAppString("str_payee_mailing_address")) ||
						!mobileAction.verifyTextEquality(payeeName.getText().trim(), mobileAction.getAppString("str_payee_name")) || 
						!mobileAction.verifyTextEquality(payeeAddress.getText().trim(), mobileAction.getAppString("str_payee_address")) ||
						!mobileAction.verifyTextEquality(city.getText().trim(), mobileAction.getAppString("str_city")) ||
						!mobileAction.verifyTextEquality(state.getText().trim(), mobileAction.getAppString("str_state")) ||
						!mobileAction.verifyTextEquality(zip.getText().trim(), mobileAction.getAppString("str_zip_code")) ||
						!mobileAction.verifyTextEquality(account.getText().trim(), mobileAction.getAppString("str_payee_account")) ||
						!mobileAction.verifyTextEquality(desc.getText().trim(), mobileAction.getAppString("str_Description_cml_case")) ||
						!mobileAction.verifyTextEquality(payeeAccountInfo.getText().trim(), mobileAction.getAppString("str_payee_account_info")) ||
						!mobileAction.verifyTextEquality(enterAccNumber.getText().trim(), mobileAction.getAppString("str_us_accountnumber_hint")) ||
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
				searchForPayee();
				clickOnFirstCanadianPayeeFound();
			} else {
				searchForPayee();
				clickOnFirstCanadianPayeeFound();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement payeeName= mobileAction.verifyWebElementUsingXPath("(//label[@class='drop-down-label ng-binding'])[1]", "Payee Name");
				final WebElement payeeAccount = mobileAction.verifyWebElementUsingXPath("//label[@id='accountNumber_label']", "Payee Account");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder='" + mobileAction.getAppString("add_cdn_payee_dtl_hint") + "']", "Payee account hint");
				final WebElement warningMsg = mobileAction.verifyWebElementUsingXPath("//div[@class='placeholder ng-binding']", "warning msg");
				final WebElement description = mobileAction.verifyWebElementUsingXPath("//label[@id='description_label']", "Description");
				mobileAction.verifyWebElementUsingXPath("//input[@placeholder='" + mobileAction.getAppString("str_optional") + "']", "Description hint");
				final WebElement continueButton = mobileAction.verifyWebElementUsingXPath("//button[@class='primary-button ng-binding disable']", "Continue button");

				if (!mobileAction.verifyTextEquality(payeeName.getText().trim(), mobileAction.getAppString("str_payee_name")) ||
						!mobileAction.verifyTextEquality(payeeAccount.getText().trim(), mobileAction.getAppString("str_payee_account")) || 
						!mobileAction.verifyTextEquality(warningMsg.getText().trim(), mobileAction.getAppString("add_cdn_payee_dtl_copy")) ||
						!mobileAction.verifyTextEquality(description.getText().trim(), mobileAction.getAppString("str_Description_cml_case")) ||
						!mobileAction.verifyTextEquality(continueButton.getText().trim(), mobileAction.getAppString("btn_continue"))){
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

	private void clickOnFirstUSPayeeFound() {
		try {
			final WebElement payee = mobileAction.verifyWebElementUsingXPath("//a[@id='result0']", "click payee");
			payee.click();
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("add_us_payee_title") + "']", "Add U.S. Payee title");
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
	
	private void clickOnFirstCanadianPayeeFound() {
		try {
			final WebElement payee = mobileAction.verifyWebElementUsingXPath("//a[@id='result0']", "click payee");
			payee.click();
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.switchAppiumContext("NATIVE_APP");
			mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("add_cdn_payee_title") + "']", "Add Canadian Payee title");
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
				searchForPayee();
				clickOnFirstCanadianPayeeFound();
				addPayeeReview();
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

	private void addPayeeReview() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				//System.out.println("source : "+ ((AppiumDriver) CL.GetDriver()).getPageSource());
				final WebElement payeeAccount = mobileAction.verifyWebElementUsingXPath("//input[@id='accountNumber']", "Payee Account");
				payeeAccount.sendKeys(getTestdata("FromAccount"));
				//FIXME: This does not work
				final WebElement continueButton =(WebElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.id("btn"));
				mobileAction.verifyElementIsDisplayed(continueButton, "Continue");
				continueButton.click();
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("review_details_title") + "']", "Confirm");
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
				searchForPayee();
				clickOnFirstCanadianPayeeFound();
				addPayeeReview();
				addPayeeConfirm();
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

	private void addPayeeConfirm() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement addPayeeButton = (WebElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.id("btn"));
				mobileAction.verifyElementIsDisplayed(addPayeeButton, "Add Payee button");
				addPayeeButton.click();
				mobileAction.waitForElementToVanish(progressBar);
				Thread.sleep(25000);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='" + mobileAction.getAppString("add_payee_success_title") + "']", "Success title");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
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

	private void searchForPayee() throws IOException {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			try {
				final MobileElement searchForPayee = mobileAction.verifyElementUsingXPath("//XCUIElementTypeTextField[@name='" + mobileAction.getAppString("add_cdn_payee_hint") + "']", "Search for payee");
				mobileAction.FuncSendKeys(searchForPayee, getTestdata("Payee"));
				mobileAction.FuncHideKeyboard();
			} catch (NoSuchElementException | InterruptedException | IOException e) {
				try {
					mobileAction.GetReporting().FuncReport("Fail", "No such element was found on screen: " + e.getMessage());
				} catch (IOException ex) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
		} else {
			// Switching to webview
			mobileAction.switchAppiumContext("WEBVIEW_com.td");
			final WebElement searchForPayee = mobileAction.verifyWebElementUsingXPath("//input[@ng-model='searchText']", "Search for payee");
			searchForPayee.sendKeys(getTestdata("Payee"));
			mobileAction.waitForElementToVanish(progressBar);
		}
	}
}
