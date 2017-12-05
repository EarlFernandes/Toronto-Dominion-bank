package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddPayee extends _CommonPage {

	private static AddPayee AddPayee;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@label='Search for Canadian payees']")
	private MobileElement searchForCanadianPayee;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'found any matches. Please try again.')]")
	private MobileElement errorMessage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeTextField[1]")
	@FindBy(xpath = "//input[@ng-model='searchText']")
	private WebElement searchPayeeField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[1]")
	@FindBy(xpath = "//td-switch//li[1]")
	private WebElement tabCanada;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[2]")
	@FindBy(xpath = "//td-switch//li[2]")
	private WebElement tabUS;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1] | "
			+ "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeLink[1]/XCUIElementTypeLink[1]")
	@FindBy(id = "result0")
	private WebElement firstPayeeFound;

	// @iOSXCUITFindBy(xpath =
	// "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeLink[1]/XCUIElementTypeLink[1]")
	// @FindBy(id = "result0")
	// private WebElement firstUSPayeeFound;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[5]/XCUIElementTypeTextField[1] | "
			+ "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[6]/XCUIElementTypeTextField[1]")
	@FindBy(name = "accountNumber")
	private WebElement payeeAcctNumber;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[1]")
	@FindBy(id = "btn")
	private WebElement payeeContinueBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[1]")
	// @FindBy(xpath = "//button[contains(@ng-click,'addPayee')]")
	@FindBy(xpath = "//div[@class='button-row']")
	private WebElement addPayeeBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[1]")
	@FindBy(xpath = "//button[contains(@ng-click,'continuePayee')]")
	private WebElement addPayeeContinueBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]") // TBD
	@FindBy(xpath = "//div[contains(@class,'thank-you')]")
	private WebElement addPayeeReceiptHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//button[contains(@ng-click,'goHome')]")
	private WebElement goHomeBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	@FindBy(xpath = "//button[contains(@ng-click,'addAnotherPayee')]")
	private WebElement addAnotherPayeeBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeKeyboard[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[2]")
	private MobileElement keyboardTypeBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeKeyboard[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[4]")
	private MobileElement keyboardGoBtn;

	public synchronized static AddPayee get() {
		if (AddPayee == null) {
			AddPayee = new AddPayee();
		}
		return AddPayee;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

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
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void searchPayee() {
		Decorator();
		try {
			mobileAction.FuncClick(searchForCanadianPayee, "Search For Canadian Payee");
			mobileAction.FuncSendKeys(searchForCanadianPayee, getTestdata("Search"));
			mobileAction.verifyElementIsDisplayed(errorMessage, "We haven't found any matches. Please try again.");
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

	/**
	 * This method will verify text within elements for the add US payee select
	 * address screen
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
				searchForPayee();
				// clickOnFirstUSPayeeFound();
				// mobileAction.verifyWebElementUsingXPath(
				// "//XCUIElementTypeTextField[@label='" +
				// mobileAction.getAppString("search_address_hint") + "']",
				// "Search address hint");
				// mobileAction.verifyWebElementUsingXPath(
				// "//XCUIElementTypeStaticText[@label='"
				// + mobileAction.getAppString("please_select_payee_address") +
				// "']",
				// "Search address hint");
				// mobileAction.verifyWebElementUsingXPath(
				// "//XCUIElementTypeStaticText[@label='" +
				// mobileAction.getAppString("str_add_address") + "']",
				// "Search address hint");
				// mobileAction.verifyWebElementUsingXPath(
				// "//XCUIElementTypeLink[@label='" +
				// mobileAction.getAppString("tap_here_to_add_address") + "']",
				// "Search address hint");

			} else {
				searchForPayee();
				clickOnFirstUSPayeeFound();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");

				final WebElement msg = mobileAction.verifyWebElementUsingXPath("//div[@class='placeholder ng-binding']",
						"Select the payee address");

				final WebElement tapHere = mobileAction
						.verifyWebElementUsingXPath("//div[@class='custom_action ng-binding']", "Tap here");

				if (!mobileAction.verifyTextEquality(msg.getText().trim(),
						mobileAction.getAppString("please_select_payee_address") + " "
								+ mobileAction.getAppString("str_add_address"))
						|| !mobileAction.verifyTextEquality(tapHere.getText().trim(),
								mobileAction.getAppString("tap_here_to_add_address"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}

				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (Exception ex) {
				System.out.print("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the add US payee review
	 * screen
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
				searchForPayee();
				clickOnFirstUSPayeeFound();
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[contains(@label, '"
						+ mobileAction.getAppString("str_add_us_payee_details_info") + "')]", "Note");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ mobileAction.getAppString("str_payee_mailing_address") + "']", "Payee Mailing");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_payee_name") + "']",
						"Payee Name");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_payee_address") + "']",
						"Payee address");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeTextField[@value='"
						+ mobileAction.getAppString("str_payee_address_1_hint") + "']", "Payee address hint");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_city") + "']", "city");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeTextField[@value='" + mobileAction.getAppString("str_city_hint") + "']",
						"city hint");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_state") + "']",
						"state");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeTextField[@value='" + mobileAction.getAppString("str_state_hint") + "']",
						"state hint");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_zip_code") + "']",
						"zip");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeTextField[@value='" + mobileAction.getAppString("str_zip_code_hint") + "']",
						"zip hint");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ mobileAction.getAppString("str_payee_account_info") + "']", "payee account info");

				MobileElement desc = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(

						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_description") + "']"));
				mobileAction.FunCSwipeandScroll(desc, false);
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeTextField[@value='" + mobileAction.getAppString("str_optional") + "']",
						"optional");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@label='" + mobileAction.getAppString("str_payee_account") + "']",
						"payee account");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeTextField[@value='"
								+ mobileAction.getAppString("str_enter_payee_account_number") + "']",
						"payee account hint");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ mobileAction.getAppString("str_us_accountnumber_hint") + "']", "enter your account");
			} else {
				searchForPayee();
				clickOnFirstUSPayeeFound();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.verifyWebElementUsingXPath("//div[@class='message-holder ng-binding ng-scope']", "Note");

				final WebElement payeeMailing = mobileAction
						.verifyWebElementUsingXPath("(//span[@class='ng-binding'])[1]", "Payee mailing");
				final WebElement payeeName = mobileAction
						.verifyWebElementUsingXPath("(//label[@class='drop-down-label ng-binding'])[1]", "Payee name");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("str_payee_address_1_hint") + "']",
						"Payee address hint");
				final WebElement payeeAddress = mobileAction
						.verifyWebElementUsingXPath("//label[@id='addressLine1_label']", "Payee address");
				final WebElement city = mobileAction.verifyWebElementUsingXPath("//label[@id='city_label']", "city");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("str_city_hint") + "']", "city hint");
				final WebElement state = mobileAction.verifyWebElementUsingXPath("//label[@id='state_label']", "state");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("str_state_hint") + "']", "state hint");
				final WebElement zip = mobileAction.verifyWebElementUsingXPath("//label[@id='zipcode_label']", "zip");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("str_zip_code_hint") + "']", "zip hint");
				final WebElement account = mobileAction.verifyWebElementUsingXPath("//label[@id='accountNumber_label']",
						"account");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("str_enter_payee_account_number") + "']",
						"account hint");
				final WebElement desc = mobileAction.verifyWebElementUsingXPath("//label[@id='description_label']",
						"description");

				final WebElement payeeAccountInfo = mobileAction
						.verifyWebElementUsingXPath("(//span[@class='ng-binding'])[2]", "payee account info header");
				final WebElement enterAccNumber = mobileAction.verifyWebElementUsingXPath(
						"//div[@class='placeholder ng-binding ng-scope']", "enter your account");

				final WebElement continueButton = mobileAction.verifyWebElementUsingXPath("//button[@id='btn']",
						"Continue button");

				if (!mobileAction.verifyTextEquality(payeeMailing.getText().trim(),
						mobileAction.getAppString("str_payee_mailing_address"))
						|| !mobileAction.verifyTextEquality(payeeName.getText().trim(),
								mobileAction.getAppString("str_payee_name"))
						|| !mobileAction.verifyTextEquality(payeeAddress.getText().trim(),
								mobileAction.getAppString("str_payee_address"))
						|| !mobileAction.verifyTextEquality(city.getText().trim(),
								mobileAction.getAppString("str_city"))
						|| !mobileAction.verifyTextEquality(state.getText().trim(),
								mobileAction.getAppString("str_state"))
						|| !mobileAction.verifyTextEquality(zip.getText().trim(),
								mobileAction.getAppString("str_zip_code"))
						|| !mobileAction.verifyTextEquality(account.getText().trim(),
								mobileAction.getAppString("str_payee_account"))
						|| !mobileAction.verifyTextEquality(desc.getText().trim(),
								mobileAction.getAppString("str_Description_cml_case"))
						|| !mobileAction.verifyTextEquality(payeeAccountInfo.getText().trim(),
								mobileAction.getAppString("str_payee_account_info"))
						|| !mobileAction.verifyTextEquality(enterAccNumber.getText().trim(),
								mobileAction.getAppString("str_us_accountnumber_hint"))
						|| !mobileAction.verifyTextEquality(continueButton.getText().trim(),
								mobileAction.getAppString("str_continue"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}

				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (Exception ex) {
				System.out.print("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the add payee review
	 * screen
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
				// clickOnFirstCanadianPayeeFound();
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("str_payee_name") + "']",
				// "Payee Name");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("str_payee_account") + "']",
				// "Payee account");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeTextField[@value='"
				// + mobileAction.getAppString("add_cdn_payee_dtl_hint") + "']",
				// "Payee account hint");
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@value='"
				// + mobileAction.getAppString("add_cdn_payee_dtl_copy") + "']",
				// "warning msg");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeStaticText[@value='" +
				// mobileAction.getAppString("str_Description") + "']",
				// "Description");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeTextField[@value='" +
				// mobileAction.getAppString("str_optional") + "']",
				// "Description hint");
				// mobileAction.verifyElementUsingXPath(
				// "//XCUIElementTypeButton[@label='" +
				// mobileAction.getAppString("btn_continue") + "']",
				// "Continue button");
			} else {
				searchForPayee();
				clickOnFirstCanadianPayeeFound();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement payeeName = mobileAction
						.verifyWebElementUsingXPath("(//label[@class='drop-down-label ng-binding'])[1]", "Payee Name");
				final WebElement payeeAccount = mobileAction
						.verifyWebElementUsingXPath("//label[@id='accountNumber_label']", "Payee Account");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("add_cdn_payee_dtl_hint") + "']",
						"Payee account hint");
				final WebElement warningMsg = mobileAction
						.verifyWebElementUsingXPath("//div[@class='placeholder ng-binding']", "warning msg");
				final WebElement description = mobileAction
						.verifyWebElementUsingXPath("//label[@id='description_label']", "Description");
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("str_optional") + "']",
						"Description hint");
				final WebElement continueButton = mobileAction.verifyWebElementUsingXPath(
						"//button[@class='primary-button ng-binding disable']", "Continue button");

				if (!mobileAction.verifyTextEquality(payeeName.getText().trim(),
						mobileAction.getAppString("str_payee_name"))
						|| !mobileAction.verifyTextEquality(payeeAccount.getText().trim(),
								mobileAction.getAppString("str_payee_account"))
						|| !mobileAction.verifyTextEquality(warningMsg.getText().trim(),
								mobileAction.getAppString("add_cdn_payee_dtl_copy"))
						|| !mobileAction.verifyTextEquality(description.getText().trim(),
								mobileAction.getAppString("str_Description_cml_case"))
						|| !mobileAction.verifyTextEquality(continueButton.getText().trim(),
								mobileAction.getAppString("btn_continue"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}

				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (Exception ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void clickOnFirstUSPayeeFound() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				final MobileElement payee = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeLink[contains(@label, '" + getTestdata("Payee").toUpperCase() + "')]",
						"click payee");
				payee.click();
				mobileAction.waitProgressBarVanish();
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("add_us_payee_title") + "']", "Add U.S. Payee title");
			} else {
				final WebElement payee = mobileAction.verifyWebElementUsingXPath("//a[@id='result0']", "click payee");
				payee.click();
				mobileAction.waitProgressBarVanish();
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("add_us_payee_title") + "']",
								"Add U.S. Payee title");
			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (Exception ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void clickOnFirstCanadianPayeeFound() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				final WebElement payee = mobileAction.verifyWebElementUsingXPath(
						"//XCUIElementTypeButton[contains(@label, '" + getTestdata("Payee").toUpperCase() + "')]",
						"click payee");
				payee.click();
				mobileAction.waitProgressBarVanish();
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("add_cdn_payee_title") + "']", "Add Canadian Payee title");
			} else {
				final WebElement payee = mobileAction.verifyWebElementUsingXPath("//a[@id='result0']", "click payee");
				payee.click();
				mobileAction.waitProgressBarVanish();
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("add_cdn_payee_title") + "']",
								"Add Canadian Payee title");
			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (Exception ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the add payee
	 * confirmation screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddPayeeConfirmationTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				searchForPayee();
				clickOnFirstCanadianPayeeFound();
				addPayeeReview();
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement confirmMsg = mobileAction.verifyWebElementUsingXPath(
						"//div[@class='message-holder ng-binding ng-scope']", "Confirmation Msg");
				final WebElement payeeName2 = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding ng-scope'])[1]", "Payee Name");
				final WebElement payeeAccount2 = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[2]", "Payee Account");
				final WebElement description2 = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[3]", "description msg");
				final WebElement addPayeeButton = mobileAction.verifyWebElementUsingXPath(
						"//button[@class='primary-button green-button ng-binding']", "Continue button");

				if (!mobileAction.verifyTextEquality(payeeName2.getText().trim(),
						mobileAction.getAppString("str_payee_name"))
						|| !mobileAction.verifyTextEquality(confirmMsg.getText().trim(),
								mobileAction.getAppString("add_payee_confirm_message"))
						|| !mobileAction.verifyTextEquality(payeeAccount2.getText().trim(),
								mobileAction.getAppString("str_payee_account"))
						|| !mobileAction.verifyTextEquality(description2.getText().trim(),
								mobileAction.getAppString("str_description"))
						|| !mobileAction.verifyTextEquality(addPayeeButton.getText().trim(),
								mobileAction.getAppString("btn_add_payee"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}

				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (Exception ex) {
				System.out.print("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void addPayeeReview() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.switchAppiumContext("WEBVIEW_com.td");

				final WebElement payeeAccount = mobileAction.verifyWebElementUsingXPath("//input[@id='accountNumber']",
						"Payee Account");
				payeeAccount.sendKeys(getTestdata("FromAccount"));
				Thread.sleep(4000);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.switchAppiumContext("WEBVIEW_com.td");

				final WebElement continueButton = (WebElement) (CL.GetAppiumDriver()).findElement(By.id("btn"));

				mobileAction.verifyElementIsDisplayed(continueButton, "Continue");
				continueButton.click();
				continueButton.click();
				continueButton.click();
				mobileAction.waitProgressBarVanish();
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("review_details_title") + "']",
						"Confirm");
			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (Exception ex) {
				System.out.print("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the add payee success
	 * screen
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyAddPayeeSuccessTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				searchForPayee();
				clickOnFirstCanadianPayeeFound();
				addPayeeReview();

				// addPayeeConfirm();
				// // Switching to webview
				// mobileAction.switchAppiumContext("WEBVIEW_com.td");
				// mobileAction.waitForElementToVanish(progressBar);
				//
				// final WebElement thankYou =
				// mobileAction.verifyWebElementUsingXPath("//div[@class='thank-you
				// ng-binding']", "Thank you");
				// final WebElement successMsg =
				// mobileAction.verifyWebElementUsingXPath("//div[@class='copy
				// ng-binding']", "Success Msg");
				// final WebElement payeeName =
				// mobileAction.verifyWebElementUsingXPath("(//div[@class='column1
				// ng-binding ng-scope'])[1]", "Payee Name");
				// final WebElement payeeAccount2 =
				// mobileAction.verifyWebElementUsingXPath("(//div[@class='column1
				// ng-binding'])[2]", "Payee Account");
				// final WebElement description =
				// mobileAction.verifyWebElementUsingXPath("(//div[@class='column1
				// ng-binding'])[3]", "description msg");
				// final WebElement home =
				// mobileAction.verifyWebElementUsingXPath("//button[@class='home
				// ng-binding']", "home button");
				// final WebElement addAnother =
				// mobileAction.verifyWebElementUsingXPath("//button[@class='add-payee
				// ng-binding']", "add payee button");
				// final WebElement payPayee =
				// mobileAction.verifyWebElementUsingXPath("//button[@class='pay-payee
				// ng-binding']", "pay payee button");
				//
				// if
				// (!mobileAction.verifyTextEquality(thankYou.getText().trim(),
				// mobileAction.getAppString("str_thank_you")) ||
				// !mobileAction.verifyTextEquality(successMsg.getText().trim(),
				// mobileAction.getAppString("add_cdn_payee_success_copy")) ||
				// !mobileAction.verifyTextEquality(payeeName.getText().trim(),
				// mobileAction.getAppString("str_payee_name")) ||
				// !mobileAction.verifyTextEquality(payeeAccount2.getText().trim(),
				// mobileAction.getAppString("str_payee_account")) ||
				// !mobileAction.verifyTextEquality(description.getText().trim(),
				// mobileAction.getAppString("str_description")) ||
				// !mobileAction.verifyTextEquality(home.getText().trim(),
				// mobileAction.getAppString("btn_go_back_home")) ||
				// !mobileAction.verifyTextEquality(addAnother.getText().trim(),
				// mobileAction.getAppString("btn_add_another_payee")) ||
				// !mobileAction.verifyTextEquality(payPayee.getText().trim(),
				// mobileAction.getAppString("btn_payee_this_payee"))){
				// System.err.println("TestCase has failed.");
				// CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				// }

				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");

			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (Exception ex) {
				System.out.print("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void addPayeeConfirm() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement addPayeeButton = (WebElement) (CL.GetAppiumDriver()).findElement(By.id("btn"));
				mobileAction.verifyElementIsDisplayed(addPayeeButton, "Add Payee button");
				addPayeeButton.click();
				mobileAction.waitProgressBarVanish();
				Thread.sleep(25000);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("add_payee_success_title") + "']",
						"Success title");
			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (Exception ex) {
				System.out.print("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void searchForPayee() throws IOException {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			try {
				final MobileElement searchForPayee = mobileAction.verifyElementUsingXPath("//XCUIElementTypeTextField",
						"Search for payee");
				mobileAction.FuncSendKeys(searchForPayee, getTestdata("Payee"));
				mobileAction.FuncClickDone();
			} catch (NoSuchElementException | InterruptedException | IOException e) {
				try {
					mobileAction.GetReporting().FuncReport("Fail",
							"No such element was found on screen: " + e.getMessage());
				} catch (IOException ex) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
		} else {
			try {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement searchForPayee = mobileAction
						.verifyWebElementUsingXPath("//input[@ng-model='searchText']", "Search for payee");
				searchForPayee.sendKeys(getTestdata("Payee"));
				mobileAction.waitProgressBarVanish();
			} catch (Exception e) {
				try {
					// Switch back to native to get proper screenshots
					mobileAction.switchAppiumContext("NATIVE_APP");
					mobileAction.GetReporting().FuncReport("Fail",
							"No such element was found on screen: " + e.getMessage());
				} catch (Exception ex) {
					System.out.print("Exception from Method " + this.getClass().toString() + " " + e.getCause());
				}
			}
		}
	}

	public void searchCdnPayees() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.FuncClick(tabCanada, "Canada tab");

			String payee = getTestdata("Payee");
			mobileAction.FuncClick(searchPayeeField, "Search Payee Field");
			mobileAction.FuncSendKeys(searchPayeeField, payee);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				if (currentLocale.toLowerCase().startsWith("zh")) {
					switchToEnglishKeyboard();
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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void searchUSPayees() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.FuncClick(tabUS, "US tab");

			String payee = getTestdata("USAccount");
			mobileAction.FuncClick(searchPayeeField, "Search Payee Field");
			mobileAction.FuncSendKeys(searchPayeeField, payee);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				if (currentLocale.toLowerCase().startsWith("zh")) {
					switchToEnglishKeyboard();
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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void clickFirstPayeeFound() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}
			mobileAction.FuncClick(firstPayeeFound, "First Payee found");
			mobileAction.waitProgressBarVanish();
			mobileAction.sleep(5000);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void clickFirstUSPayeeFound() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
				mobileAction.FuncClick(firstPayeeFound, "First Payee found");
				mobileAction.sleep(10000);
				mobileAction.FuncClick(firstPayeeFound, "First Payee Address found");
				mobileAction.sleep(10000);
				mobileAction.FuncClick(addPayeeContinueBtn, "Add Payee Continue");

			} else {
				mobileAction.FuncClick(firstPayeeFound, "First Payee found");
				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(firstPayeeFound, "First Payee Address found");
				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(addPayeeContinueBtn, "Add Payee Continue");
				mobileAction.waitProgressBarVanish();

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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void enterPayeeDetails() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			String acctNum = getRandomAccountNumber("Accounts");
			mobileAction.FuncClick(payeeAcctNumber, "Payee Acct Number");
			mobileAction.FuncSendKeys(payeeAcctNumber, acctNum);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.switchToWebView();
				mobileAction.FuncClick(payeeContinueBtn, "Payee Continue button");
				mobileAction.sleep(10000);

				mobileAction.switchToWebView();
				mobileAction.FuncClick(addPayeeBtn, "Add Payee button");
				mobileAction.sleep(10000);

			} else {
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(payeeContinueBtn, "Payee Continue button");
				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(addPayeeBtn, "Add Payee button");
				mobileAction.waitProgressBarVanish();

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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void enterUSPayeeDetails() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.waitProgressBarVanish();
			}

			// String acctNum = getTestdata("FromAccount");
			String acctNum = getRandomAccountNumber("FromAccount");
			mobileAction.FuncClick(payeeAcctNumber, "Payee Acct Number");
			mobileAction.FuncSendKeys(payeeAcctNumber, acctNum);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();

				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(payeeContinueBtn, "Payee Continue button");
				mobileAction.FuncClick(addPayeeBtn, "Add Payee button");

			} else {
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(payeeContinueBtn, "Payee Continue button");
				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(addPayeeBtn, "Add Payee button");
				mobileAction.waitProgressBarVanish();

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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void clickGoBackHomeBtn() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.waitProgressBarVanish();
			}

			mobileAction.FuncClick(goHomeBtn, "Go Back Home btn");
			mobileAction.sleep(5000);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void clickAddAnotherPayeeBtn() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(addAnotherPayeeBtn, "Add Another Payee btn");
			} else {
				mobileAction.FuncClick(addAnotherPayeeBtn, "Add Another Payee btn");
				mobileAction.waitForElementToVanish(PageHeader.get().getProgressBar());
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
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void verifyAddPayeeReceipt() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.waitProgressBarVanish();
			}

			mobileAction.verifyElementIsDisplayed(addPayeeReceiptHeader, "Add Payee Receipt header");
			mobileAction.verifyElementTextContains(addPayeeReceiptHeader,
					getTextInCurrentLocale(StringArray.ARRAY_MF_THANKYOU));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	private String getRandomAccountNumber(String columnName) {
		String currentAcctNum = getTestdata(columnName);

		// generate a random payee number with the given length
		int acctNumLength = currentAcctNum.length();
		String newAcctNum = "";
		for (int i = 0; i < acctNumLength; i++) {
			int digit = (int) (Math.random() * 9);
			newAcctNum += digit;
		}
		System.out.println("New payee number:" + newAcctNum);

		// Save the new payee number for late verification
		CL.getTestDataInstance().TCParameters.put(columnName, newAcctNum);

		return newAcctNum;
	}

	private void switchToEnglishKeyboard() {
		try {
			// Switch to English keyboard for correct text input
			String keyboardGoBtnText = keyboardGoBtn.getAttribute("label");
			if (keyboardGoBtnText.contains("确认")) {
				mobileAction.FuncClick(keyboardTypeBtn, "Switch to English keyboard");
				mobileAction.sleep(500);
			}

		} catch (Exception e) {
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
