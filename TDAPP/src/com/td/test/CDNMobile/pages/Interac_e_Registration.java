package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Interac_e_Registration extends _CommonPage {

	private static Interac_e_Registration Interac_e_Registration;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Interac e-Transfer' OR label CONTAINS[cd] 'Registration' OR label CONTAINS[cd] 'Inscription'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement registrationPageHeader;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Continue' OR label=='Continuer'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button' or @resource-id='com.td:id/btn_footer']")
	private MobileElement continueButton;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Accept'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/acceptButton']")
	private MobileElement acceptBtn;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Choose an account'`]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/auto_deposit_account_selection']")
	private MobileElement autodepositDropDown;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_sub_heading']")
	private MobileElement autodepositAcc;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'TEST' OR label CONTAINS[cd] 'TEST'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_name']")
	private MobileElement name;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`value=='Enter email address' or value=='Entrer l’adresse courriel'`]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_interac_registration_email']")
	private MobileElement emailId;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value=='Re-enter email address' or value=='Entrez l’adresse à nouveau'`]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_interac_registration_confirm_email']")
	private MobileElement confirmEmailId;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='My Name' OR label=='Mon nom'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Name' or @text='Mon nom']")
	private MobileElement myName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Name' or @label='Mon nom']/following-sibling::XCUIElementTypeStaticText")
	private MobileElement myNameVal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Name']/following-sibling::android.widget.TextView[1]")
	private MobileElement reviewName;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Business Name' or label=='Nom d’entreprise'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Business Name' or @text='Nom d’entreprise']")
	private MobileElement BusinessName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Business Name' or @label='Nom d’entreprise']/following-sibling::XCUIElementTypeStaticText")
	private MobileElement BusinessNameVal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trade Name' or @label='Nom commercial']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade Name' or @text='Nom commercial']")
	private MobileElement tradeNameReview;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trade Name' or @label='Nom commercial']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trade Name']")
	private MobileElement tradeNameReviewVal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_value_item1']")
	private List<MobileElement> confirmationRowValues;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Email Address' OR label CONTAINS[cd] 'Adresse courriel pour Virement Interac'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Email Address for Interac') or contains(@text,'Adresse courriel pour Virement')]")
	private MobileElement emailAddress;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Email Address') or @label='Adresse courriel pour Virement Interac']/following-sibling::XCUIElementTypeStaticText")
	private MobileElement emailAddressVal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email Address for Interac e-Transfer']/following-sibling::android.widget.TextView[3]")
	private MobileElement reviewEmailId;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Thank you!' OR label=='Merci!'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement thankYou;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'now registered for' or label CONTAINS[cd] 'Vous êtes maintenant inscrit au service Virement Interac'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subHeader']")
	private MobileElement successMag;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeActivityIndicator[`value=='1'")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@value,'Please choose which profile')]")
	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Please choose which profile' or label CONTAINS[cd] 'Veuillez choisir un profil pour l’inscription'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_multi_profile']")
	private MobileElement chooseProfile;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Business Name') or contains(@label,'Nom d’entreprise')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_name']")
	private MobileElement businessName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Trade Name') or contains(@label,'Nom commercial')]/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_trade_name']")
	private MobileElement tradeName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Confirm Trade Name']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_interac_registration_trade_name_response']")
	private MobileElement tradeResponse;

	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_done' or @text='Done']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	private MobileElement done;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Interac e‑Transfer is a great way to send money') or contains(@label,'excellent moyen')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/errorMessage']")
	private MobileElement errorText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Find a Branch') or contains(@label,'Trouver une succursale')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/errorButton2' or @text='Find a Branch' or @text='Trouver une succursale']")
	private MobileElement findABranch;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Open an Account') or contains(@label,'Ouvrir un compte')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/errorButton1' or @text='Open an Account' or @text='Ouvrir un compte']")
	private MobileElement openAnAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Go Back Home')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/quick_access_go_home' or @text='Go Back Home']")
	private MobileElement goBackHome;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[@label='Register another profile' or @label='Ajouter un autre profil']")
	//@iOSXCUITFindBy(iOSClassChain = "**/*[`name CONTAINS[cd] 'Register anohter profile' or name CONTAINS[cd] 'Ajouter un autre profil'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_payments_and_transfers_register_account']")
	private MobileElement registerAnotherProfile;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Send Money') or contains(@label,'Virer des fonds')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Send Money' or @text='Virer des fonds']")
	private MobileElement sendMoney;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Back' or @label='Retour']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@content-desc,'Navigate up') or contains(@content-desc,'Parcourir vers le haut') or contains(@content-desc,'Revenir en haut de la page')]")
	private MobileElement backButton;

	@AndroidFindBy(xpath = "//*[@text='Done' or @text='Annuler']")
	private MobileElement doneButton;

	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Send Money')]")
	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Check your email for instructions from'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement autoDepositSuccmsg;

	String tradeResponseTxt = null;
	boolean AutoDepositDoneWhileReg = false;
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
			mobileAction.waitForElementToVanish(progressBar);

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
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(confirmEmailId, "Confirm Email");
				mobileAction.FuncSendKeys(confirmEmailId, email);
				mobileAction.FuncClickDone();

			} else {

				mobileAction.verifyElementIsDisplayed(name, name.getText());
				mobileAction.FuncClick(emailId, "Email");
				mobileAction.FuncSendKeys(emailId, email);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(confirmEmailId, "Confirm Email");
				mobileAction.FuncSendKeys(confirmEmailId, email);
				mobileAction.FuncHideKeyboard();

			}

			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FuncClick(autodepositDropDown, "Auto Deposit Drop down");
			mobileAction.FuncClick(autodepositAcc, autodepositAcc.getText());
			mobileAction.FuncClick(continueButton, "Continue Button");
			mobileAction.FuncClick(acceptBtn, "Accept Button");

			AutoDepositDoneWhileReg = true;

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

				myName = mobileAction.mobileElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("interac_registration_confirmation_personal_name") + "']");
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

			mobileAction.getPageSource();
			
			if (AutoDepositDoneWhileReg) {
				
				mobileAction.verifyElementIsDisplayed(autoDepositSuccmsg, "Auto Deposit Success Message");
				
				mobileAction.verifyTextContains(autoDepositSuccmsg.getText(),
						getTextInCurrentLocale(StringArray.ARRAY_AUTODEPOSIT_EMAIL_SENT_MSG));
				
				AutoDepositDoneWhileReg=false;
			}

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will enter the email address for business
	 *         registration and click on continue.
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
			getTradeResponse();

			if (platformName.equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(businessName, businessName.getText());
				mobileAction.verifyElementIsDisplayed(tradeName, tradeName.getText());
				mobileAction.FuncClick(tradeResponse, "Trade Response");

				/*String response = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@name,'" + tradeResponseTxt
						+ "')]";*/
				
				String response ="**/*[`label CONTAINS[cd] '"+tradeResponseTxt+"' OR name CONTAINS[cd] '"+tradeResponseTxt+"' OR value CONTAINS[cd] '"+tradeResponseTxt+"'`]";
				//MobileElement tradeResponse = mobileAction.mobileElementUsingXPath(response);
				MobileElement tradeResponse = mobileAction.mobileElementUsingIOSClassChain(response);

				mobileAction.FuncClick(tradeResponse, "Trade Response Option");
				mobileAction.FunctionSwipe("up", 200, 200);
				mobileAction.FuncClick(emailId, "Email");
				mobileAction.FuncSendKeys(emailId, email);
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(confirmEmailId, "Confirm Email");
				mobileAction.FuncSendKeys(confirmEmailId, email);
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(continueButton, "Continue Button");

			} else {

				mobileAction.verifyElementIsDisplayed(businessName, businessName.getText());
				mobileAction.verifyElementIsDisplayed(tradeName, tradeName.getText());
				mobileAction.FunctionSwipe("up",9000, 600);
				mobileAction.FuncClick(tradeResponse, "Trade Response");
				String response = "//android.widget.TextView[contains(@text,'" + tradeResponseTxt + "')]";

				MobileElement tradeResponse = mobileAction.mobileElementUsingXPath(response);

				mobileAction.FuncClick(tradeResponse, "Trade Response Option");
				//mobileAction.FuncClick(doneButton, "Done");

				mobileAction.FunctionSwipe("up",8000, 600);

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
	 * @author Ashraf Mulla This method will get the appropriate response from
	 *         the excel and assign it to the 'tradeResponseTxt' variable that
	 *         can be used in your method directly.
	 */
	public void getTradeResponse() {

		switch (getTestdata("Response")) {
		case "I acknowledge the trade name displayed above is the trade name of the business":
			tradeResponseTxt = getTextInCurrentLocale(StringArray.TRADE_RESPONSE_1);
			break;

		case "I acknowledge the trade name displayed above is not the trade name of the business":
			tradeResponseTxt = getTextInCurrentLocale(StringArray.TRADE_RESPONSE_2);
			break;

		case "I acknowledge the business does not operate under a trade name":
			tradeResponseTxt = getTextInCurrentLocale(StringArray.TRADE_RESPONSE_3);
			break;

		default:
			break;
		}
	}

	/**
	 * @author Ashraf This method will verify the business registration details
	 *         for review and click on continue button.
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
			String profileText = null;
			String nameText = getTestdata("Name");
			String[] nameArr = nameText.split(": ");

			String profileType = getTestdata("UserProfileType");

			String[] profileArr = profileType.split(": ");

			for (int i = 0; i < nameArr.length; i++) {

				if (profileArr[i].equalsIgnoreCase("Business")) {
					profileText = " INC";
				} else {
					profileText = "TEST ";
				}

				if (platformName.equalsIgnoreCase("iOS")) {

					if (i != (nameArr.length - 1)) {

						mobileAction.FuncClick(chooseProfile, "Select Profile");
						String profileStr = "//XCUIElementTypeStaticText[@label='" + nameArr[i]
								+ "' or contains(@label,'" + profileText + "')]";
						MobileElement profile = mobileAction.mobileElementUsingXPath(profileStr);

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

					if (i != (nameArr.length - 1) || i == 0) {
						mobileAction.FuncClick(chooseProfile, "Select Profile");
						String profileStr = "//android.widget.TextView[@text='" + nameArr[i] + "' or contains(@text,'"
								+ profileText + "')]";

						MobileElement profile = mobileAction.mobileElementUsingXPath(profileStr);

						mobileAction.FuncClick(profile, nameArr[i]);
						// mobileAction.FuncClick(doneButton, "Done");
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
	 * @author Ashraf This method will register the Multiprofile Users.
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void registerMultiProfileNoCondition() {
		Decorator();

		try {
			String profileText = null;
			String nameText = getTestdata("Name");
			String[] nameArr = nameText.split(": ");

			String profileType = getTestdata("UserProfileType");

			String[] profileArr = profileType.split(": ");

			for (int i = 0; i < nameArr.length; i++) {

				if (profileArr[i].equalsIgnoreCase("Business")) {
					profileText = " INC";
				} else {
					profileText = "TEST ";
				}

				if (platformName.equalsIgnoreCase("iOS")) {

					mobileAction.FuncClick(chooseProfile, "Select Profile");
					String profileStr = "//XCUIElementTypeStaticText[@label='" + nameArr[i] + "' or contains(@label,'"
							+ profileText + "')]";
					MobileElement profile = mobileAction.mobileElementUsingXPath(profileStr);

					mobileAction.FuncClick(profile, "Profile Name " + nameArr[i]);

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

					mobileAction.FuncClick(chooseProfile, "Select Profile");
					String profileStr = "//android.widget.TextView[@text='" + nameArr[i] + "' or contains(@text,'"
							+ profileText + "')]";
					MobileElement profile = mobileAction.mobileElementUsingXPath(profileStr);

					mobileAction.FuncClick(profile, nameArr[i]);
					// mobileAction.FuncClick(doneButton, "Done");

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
	 * @author Ashraf This method will go back to the transfers page by clicking
	 *         on menu and transfers link present in hamburgers menu.
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

			HomeScreen.get().clickMenu();
			MenuPage.get().clickMenuTransfer();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will click on the register Another Profile
	 *         link present on the Payments and Transfers Page.
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


				if (mobileAction.verifyElementIsPresent(sendMoney)) {
					
					if(platformName.equalsIgnoreCase("Android")){
					mobileAction.FuncClick(backButton, "Back Button");
					}
					HomeScreen.get().clickMenu();
					MenuPage.get().clickProfileAndSettings();
					Profile_And_Settings.get().clickPaymentsAndTransfers();
				}
		

			mobileAction.FuncClick(registerAnotherProfile, "Register Another Profile");

		} catch (NoSuchElementException | IOException | InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
