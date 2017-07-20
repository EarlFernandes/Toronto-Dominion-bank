package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Interac_e_Registration extends _CommonPage {

	private static Interac_e_Registration Interac_e_Registration;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Interac e-Transfer® - Registration']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and contains(@text,'Interac e-Transfer') and contains(@text,'Registration')]")
	private MobileElement registrationPageHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button' or @resource-id='com.td:id/btn_footer' or @text='Continue']")
	private MobileElement continueButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Name']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_name']")
	private MobileElement name;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter email address']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_interac_registration_email']")
	private MobileElement emailId;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Should match email address above']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_interac_registration_confirm_email']")
	private MobileElement confirmEmailId;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Name']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Name']")
	private MobileElement myName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Name']/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
	private MobileElement myNameVal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Name']/following-sibling::android.widget.TextView[1]")
	private MobileElement reviewName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Business Name']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Business Name']")
	private MobileElement BusinessName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Business Name']/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
	private MobileElement BusinessNameVal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trade Name']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade Name']")
	private MobileElement tradeNameReview;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trade Name']/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade Name']")
	private MobileElement tradeNameReviewVal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_value_item1']")
	private List<MobileElement> confirmationRowValues;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Email Address')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email Address for Interac e-Transfer']")
	private MobileElement emailAddress;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Email Address')]/../following-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText")
	private MobileElement emailAddressVal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email Address for Interac e-Transfer']/following-sibling::android.widget.TextView[3]")
	private MobileElement reviewEmailId;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Thank you!']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header' or @text='Thank You!']")
	private MobileElement thankYou;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'now registered for')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subHeader' or contains(@text,'registered for Interac e-Transfer')]")
	private MobileElement successMag;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'Please choose which profile')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_multi_profile']")
	private MobileElement chooseProfile;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Business Name:']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_name']")
	private MobileElement businessName;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Registered Trade Name']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_trade_name']")
	private MobileElement tradeName;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[contains(@value,'I acknowledge the trade name displayed')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_trade_name_response']")
	private MobileElement tradeResponse;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done' or @text='Done']")
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Interac e-Transfer is a great way to send money')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/errorMessage']")
	private MobileElement errorText;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Find a Branch')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/errorButton2' or @text='Find a Branch']")
	private MobileElement findABranch;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Open an Account Online')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/errorButton1' or @text='Open an Account']")
	private MobileElement openAnAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Go Back Home')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/quick_access_go_home' or @text='Go Back Home']")
	private MobileElement goBackHome;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Register anohter profile')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_payments_and_transfers_register_account' or @text='Register another account']")
	private MobileElement registerAnotherProfile;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Send Money')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Send Money']")
	private MobileElement sendMoney;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@content-desc,'Navigate up')]")
	private MobileElement backButton;

	int profileCount = 0;

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	public synchronized static Interac_e_Registration get() {
		if (Interac_e_Registration == null) {
			Interac_e_Registration = new Interac_e_Registration();
		}
		return Interac_e_Registration;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * @author Ashraf This method will verify The Registration Page and click on
	 *         continue button.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickContinueButton() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(registrationPageHeader, "Interac e-Transfer® - Registration");
			mobileAction.FuncClick(continueButton, "Continue");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will enter the email address for registration
	 *         and click on continue.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void registerPersonalUser() {
		Decorator();

		try {

			String email = getTestdata("Email");

			if (platformName.equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(name, name.getText());
				mobileAction.FuncClick(emailId, "Email");
				mobileAction.FuncSendKeys(emailId, email);
				mobileAction.FuncClick(done, "Done Button");
				mobileAction.FuncClick(confirmEmailId, "Confirm Email");
				mobileAction.FuncSendKeys(confirmEmailId, email);
				mobileAction.FuncClick(done, "Done Button");
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(continueButton, "Continue Button");

			} else {

				mobileAction.verifyElementIsDisplayed(name, name.getText());
				mobileAction.FuncClick(emailId, "Email");
				mobileAction.FuncSendKeys(emailId, email);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(confirmEmailId, "Confirm Email");
				mobileAction.FuncSendKeys(confirmEmailId, email);
				mobileAction.FuncHideKeyboard();
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(continueButton, "Continue Button");

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
	 * @author Ashraf This method will verify the registration details for
	 *         review and click on continue button.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyDetails() {
		Decorator();
		try {

			if (platformName.equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(myName, "My Name");
				mobileAction.verifyElementIsDisplayed(myNameVal, myNameVal.getText());
				mobileAction.verifyElementIsDisplayed(emailAddress, "Email Address for Interac e-Transfer");
				mobileAction.verifyElementIsDisplayed(emailAddressVal, emailAddressVal.getText());

			} else {

				mobileAction.verifyElementIsDisplayed(myName, "My Name");
				mobileAction.verifyElementIsDisplayed(confirmationRowValues.get(0),
						confirmationRowValues.get(0).getText());
				mobileAction.verifyElementIsDisplayed(emailAddress, "Email Address for Interac e-Transfer");
				mobileAction.verifyElementIsDisplayed(confirmationRowValues.get(1),
						confirmationRowValues.get(1).getText());
			}

			mobileAction.FuncClick(continueButton, "Continue Button");
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify the success message after
	 *         registration.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyRegSuccessMsg() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(thankYou, "Thank You");
			mobileAction.verifyElementIsDisplayed(successMag, "You're now registered for Interac e-Transfer");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will enter the email address for registration
	 *         and click on continue.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void registerBusinessUser() {
		Decorator();

		try {

			String email = getTestdata("Email");

			if (platformName.equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(businessName, businessName.getText());
				mobileAction.verifyElementIsDisplayed(tradeName, tradeName.getText());
				mobileAction.FuncClick(tradeResponse, "Trade Response");
				String response = "//XCUIElementTypeStaticText[contains(@name,'" + getTestdata("Response") + "')]";
				MobileElement tradeResponse = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(response));
				mobileAction.FuncClick(tradeResponse, "Trade Response Option");
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(emailId, "Email");
				mobileAction.FuncSendKeys(emailId, email);
				mobileAction.FuncClick(done, "Done Button");
				mobileAction.FuncClick(confirmEmailId, "Confirm Email");
				mobileAction.FuncSendKeys(confirmEmailId, email);
				mobileAction.FuncClick(done, "Done Button");
				mobileAction.FuncClick(continueButton, "Continue Button");
			} else {

				mobileAction.verifyElementIsDisplayed(businessName, businessName.getText());
				mobileAction.verifyElementIsDisplayed(tradeName, tradeName.getText());
				mobileAction.FuncClick(tradeResponse, "Trade Response");
				String response = "//android.widget.TextView[@text='" + getTestdata("Response")
						+ "']/preceding-sibling::android.widget.RadioButton";
				MobileElement tradeResponse = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(response));
				mobileAction.FuncClick(tradeResponse, "Trade Response Option");
				mobileAction.FuncClick(done, "Done Button");

				mobileAction.FunctionSwipe("up", 200, 200);

				mobileAction.FuncClick(emailId, "Email");
				mobileAction.FuncSendKeys(emailId, email);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(confirmEmailId, "Confirm Email");
				mobileAction.FuncSendKeys(confirmEmailId, email);
				mobileAction.FuncHideKeyboard();
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(continueButton, "Continue Button");

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
	 * @author Ashraf This method will verify the registration details for
	 *         review and click on continue button.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyBusinessDetails() {
		Decorator();
		try {

			if (platformName.equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(BusinessName, "Business Name");
				mobileAction.verifyElementIsDisplayed(BusinessNameVal, BusinessNameVal.getText());
				mobileAction.verifyElementIsDisplayed(tradeNameReview, "Trade Name");
				mobileAction.verifyElementIsDisplayed(tradeNameReviewVal, tradeNameReviewVal.getText());
				mobileAction.verifyElementIsDisplayed(emailAddress, "Email Address for Interac e-Transfer");
				mobileAction.verifyElementIsDisplayed(emailAddressVal, emailAddressVal.getText());

			} else {

				mobileAction.verifyElementIsDisplayed(BusinessName, "Business Name");
				mobileAction.verifyElementIsDisplayed(confirmationRowValues.get(0),
						confirmationRowValues.get(0).getText());
				mobileAction.verifyElementIsDisplayed(tradeNameReview, "Trade Name");
				mobileAction.verifyElementIsDisplayed(confirmationRowValues.get(1),
						confirmationRowValues.get(1).getText());
				mobileAction.verifyElementIsDisplayed(emailAddress, "Email Address for Interac e-Transfer");
				mobileAction.verifyElementIsDisplayed(confirmationRowValues.get(2),
						confirmationRowValues.get(2).getText());

			}

			mobileAction.FuncClick(continueButton, "Continue Button");
			mobileAction.waitForElementToVanish(progressBar);

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will register the Multiprofile Users.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void registerMultiProfileUser() {
		Decorator();

		try {
			String nameText = getTestdata("Name");
			String[] nameArr = nameText.split(": ");
			String profileType = getTestdata("ProfileType");
			String[] profileArr = profileType.split(": ");

			for (int i = 0; i < nameArr.length; i++) {

				if (platformName.equalsIgnoreCase("iOS")) {

					if (i != (nameArr.length - 1)) {
						mobileAction.FuncClick(chooseProfile, "Select Profile");
						String profileStr = "//XCUIElementTypeStaticText[@label='" + nameArr[i] + "']";
						MobileElement profile = (MobileElement) (CL.GetAppiumDriver())
								.findElement(By.xpath(profileStr));
						mobileAction.FuncClick(profile, "Profile Name " + nameArr[i]);
					}

					if (profileArr[i].equalsIgnoreCase("Business")) {

						registerBusinessUser();
						verifyBusinessDetails();
						verifyRegSuccessMsg();

					} else {

						registerPersonalUser();
						verifyDetails();
						verifyRegSuccessMsg();
					}

				} else {

					if (i != (nameArr.length - 1)) {
						mobileAction.FuncClick(chooseProfile, "Select Profile");
						String profileStr = "//android.widget.TextView[@text='" + nameArr[i]
								+ "']/preceding-sibling::android.widget.RadioButton";
						MobileElement profile = (MobileElement) (CL.GetAppiumDriver())
								.findElement(By.xpath(profileStr));
						mobileAction.FuncClick(profile, nameArr[i]);
						mobileAction.FuncClick(done, "Done");
					}

					if (profileArr[i].equalsIgnoreCase("Business")) {

						registerBusinessUser();
						verifyBusinessDetails();
						verifyRegSuccessMsg();

					} else {

						registerPersonalUser();
						verifyDetails();
						verifyRegSuccessMsg();
					}

				}

				if (i != (nameArr.length - 1)) {

					clickGoBackHome();

					if (platformName.equalsIgnoreCase("Android")) {
						if (i < 1 && !mobileAction.verifyElementIsPresent(registerAnotherProfile)) {

							if (platformName.equalsIgnoreCase("iOS")) {

								if (mobileAction.verifyElementIsPresent(backButton)) {
									mobileAction.FuncClick(backButton, "Back Button");
								}
							}

							HomeScreen.get().clickMenu();
							MenuPage.get().clickProfileAndSettings();
							Profile_And_Settings.get().clickPaymentsAndTransfers();
						}
					} else {
						Transfers.get().clickInterac_e_Transfer();
					}
					clickRegisterAnotherProfile();
				}

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
	 * @author Ashraf This method will verify The error message on registration
	 *         Page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyErrorMessage() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(errorText, "Error Message");
			mobileAction.verifyElementIsDisplayed(openAnAccount, "Open An Account");
			mobileAction.verifyElementIsDisplayed(findABranch, "Find A Branch");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify The error message on registration
	 *         Page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickGoBackHome() {
		Decorator();
		try {

			mobileAction.FuncClick(goBackHome, "Go Back Home");

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will verify The error message on registration
	 *         Page.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void clickRegisterAnotherProfile() {
		Decorator();
		try {

			if (platformName.equalsIgnoreCase("Android")) {
				if (mobileAction.verifyElementIsPresent(sendMoney)) {
					mobileAction.FuncClick(backButton, "Back Button");
					HomeScreen.get().clickMenu();
					MenuPage.get().clickProfileAndSettings();
					Profile_And_Settings.get().clickPaymentsAndTransfers();
				}
			}

			mobileAction.FuncClick(registerAnotherProfile, "Register Another Profile");

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
