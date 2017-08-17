package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MobilePayment extends _CommonPage {

	private static MobilePayment mobile_payment;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Mobile Payment']")
	private MobileElement mobilepayment_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage TD Mobile Payment']")
	private MobileElement manage_Cards_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/feature_Header' and @text='Simplify the Way you Pay']")
	private MobileElement feature_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/feature_HeaderNew' and @text='Pay Safely and Securely']")
	private MobileElement feature_HeaderNew;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_continue' and @text='Continue']")
	private MobileElement continue_Button;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_add_card' and @text='Add a Card']")
	private MobileElement add_Card_Button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Add a Card']")
	private MobileElement add_Card_Header;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/add_cards_button' and @text='Add to TD Mobile Payment']")
	private MobileElement add_To_MobilePayment_Button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/setup_passcode']")
	private MobileElement setup_Passcode;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/enable_passcode_switch']")
	private MobileElement enable_Passcode;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/manage_settings_text_view' and @text='Manage Settings']")
	private MobileElement manage_Settings_Button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/nickname']")
	private MobileElement card_No_Element;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/card_num_or_nick']")
	private MobileElement card_No_MobilePayment;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/action_my_settings']")
	private MobileElement setting_Button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/carousel_card_nickname' and @text='Add a Card']")
	private MobileElement add_Card_Mobile_Payment;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	private MobileElement progresssBar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Set up Passcode']")
	private MobileElement setup_Passcode_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_skip_forgot_passcode' and @text='Skip this step']")
	private MobileElement skip_Passcode_Setup;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_save' and @text='Save']")
	private MobileElement save_Button;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	private MobileElement change_Default_Card;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/set_default_card_image_view_off']")
	private MobileElement set_Default_Card;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/default_card_image_view']")
	private MobileElement default_Card_Image_View;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/nickname_box']")
	private MobileElement nickname_Edit_Text;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement backButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/pay_button']")
	private MobileElement pay_Button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/single_mode_timer_value' and @text=':0']")
	private MobileElement timer_Time;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/single_mode_timer_message' and @text='Seconds Remaining']")
	private MobileElement timer_Text;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_cancel' and @text='Cancel']")
	private MobileElement cancel_Button;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/action_my_settings']")
	private MobileElement settings_Icon;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_restart_timer' and @text='Restart timer']")
	private MobileElement restart_Timer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/card_type_text_view']")
	private MobileElement card_Name;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/card_number_text_view' and contains(@text,'**** **** ****')]")
	private MobileElement card_Number;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/default_card_image_view' and @index = '1']")
	private MobileElement default_Card;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_continue' and @text='Continue']")
	private MobileElement mobilePaymentContinue;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_add_card' and @text='Add a Card']")
	private MobileElement mobilePaymentAddACard;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/add_cards_button' and @text='Add to TD Mobile Payment']")
	private MobileElement addMobilePayment;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@AndroidFindBy(xpath = "//android.widget.ProgressBar[@resource-id='com.td:id/content_loader']")
	private MobileElement progressBarAddCard;

	@AndroidFindBy(xpath = "//android.widget.ProgressBar[@resource-id='com.td:id/progressbar']")
	private MobileElement progressBarCompatabilityCheck;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Security Question']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Security Question']")
	private MobileElement securityQuestionHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter your answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_answer']")
	private MobileElement enterAnswer;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/mfa_login_btn' and @text='Login']")
	private MobileElement securityLogin;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/action_my_settings']")
	private MobileElement settings;

	String cardname = getTestdata("CardName");
	String selectcard = "//android.widget.TextView[@resource-id='com.td:id/card_type_text_view' and @text='" + cardname
			+ "')]";

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/manage_settings_text_view' and @text='Manage Settings']")
	private MobileElement manageSettingIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/card_type_text_view' and contains(@text,'AEROPLAN')]")
	private MobileElement clickCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/action_my_settings' and @content-desc='Manage TD Mobile Payment']")
	private MobileElement settingIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/setup_passcode' and @text='Set Up Passcode']")
	private MobileElement setupPasscode;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/setup_passcode_input1']")
	private MobileElement sendPasscode;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/setup_passcode_input1']")
	private MobileElement reenterppasscode;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/cardImg']")
	private MobileElement verifyDefaultCard;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_login' and @text='Login']")
	private MobileElement login;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='android:id/action_bar']")
	private MobileElement landingPageHeader;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button' and @text='Continue']")
	private MobileElement continueBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/carousel_card_image' and @content-desc='Add a Card']")
	private MobileElement addIcon;

	String passcode = getTestdata("Passcode");

	String newpasscode = getTestdata("NewPasscode");

	String cancel = "Cancel";
	String time = ":0";
	String msg = "Seconds Remaining";
	String card_nm = "Card name";
	String card_no = "Card number";
	String def_card = "Default card";

	public synchronized static MobilePayment get() {
		if (mobile_payment == null) {
			mobile_payment = new MobilePayment();
		}
		return mobile_payment;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	public void addCard_MobilePayment() {

		try {
			Decorator();

			if (mobileAction.verifyElementIsPresent(mobilepayment_Header)) {
				mobileAction.FuncClick(continue_Button, "Continue");
				mobileAction.FuncClick(add_Card_Button, "Add a Card");
				mobileAction.waitForElementToVanish(progresssBar);
			}

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

	public void addToTDMobilePayment() {

		try {
			Decorator();

			String add_to_mobilePayment_path = "//*[label='Add to TD Mobile Payment']";
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.waitForElementToAppear(add_to_mobilePayment_path, "Add To Mobile Payment");
			mobileAction.FuncClick(add_To_MobilePayment_Button, "Add to TD Mobile Payment");

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

	public void changeDefaultCard() {

		try {
			Decorator();

			if (mobileAction.verifyElementIsPresent(mobilepayment_Header)) {
				mobileAction.FuncClick(setting_Button, "Setting");
				if (mobileAction.verifyElementIsPresent(manage_Cards_Header)) {
					mobileAction.FuncClick(change_Default_Card, "Change Default Card");
					Decorator();
					mobileAction.FuncClick(set_Default_Card, "Set As Default Card");
					mobileAction.FuncClick(save_Button, "Save");
					mobileAction.FuncClick(backButton, "Back");

				}

			}

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

	public void verifyNickName() {
		try {
			Decorator();
			if (mobileAction.verifyElementIsPresent(setup_Passcode_Header)) {
				CharSequence passcode = getTestdata("Passcode");
				mobileAction.FuncSendKeys(passcode);
				mobileAction.FuncSendKeys(passcode);
			}
			mobileAction.FuncClick(manage_Settings_Button, "Setting");

			mobileAction.FuncClick(default_Card_Image_View, "Default Card");

			mobileAction.FuncClick(nickname_Edit_Text, "Default Card");
			mobileAction.FuncSendKeys(nickname_Edit_Text, "");
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncSendKeys(nickname_Edit_Text,
					"The nickname can be only upto 25 characters. It will erase the remaining");
			mobileAction.FuncClick(save_Button, "Save");
			String nickname = nickname_Edit_Text.getText();
			if (nickname.length() <= 20) {
				CL.GetReporting().FuncReport("PASS", "The Nickname box accepts only 20 characters");
			} else {
				CL.GetReporting().FuncReport("FAIL", "The Nickname box accepts more than 20 characters");
			}
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

	public void setupWalletPasscode() {
		try {
			Decorator();

			String add_to_mobilePayment_path = "//XCUIElementTypeStaticText[label='Add to TD Mobile Payment']";
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.waitForElementToAppear(add_to_mobilePayment_path, "Add To Mobile Payment");
			mobileAction.FuncClick(add_To_MobilePayment_Button, "Add to TD Mobile Payment");

			Decorator();

			if (mobileAction.verifyElementIsPresent(setup_Passcode_Header)) {
				CharSequence passcode = getTestdata("Passcode");
				mobileAction.FuncSendKeys(passcode);
				mobileAction.FuncSendKeys(passcode);
			} else {
				mobileAction.FuncClick(continue_Button, "Continue");
				mobileAction.FuncClick(setting_Button, "Setting");
				mobileAction.FuncClick(manage_Settings_Button, "Setting");
				mobileAction.FuncClick(enable_Passcode, "Enable passcode");
				mobileAction.FuncClick(setup_Passcode, "Setup Passcode");
				CharSequence passcode = getTestdata("Passcode");
				mobileAction.FuncSendKeys(passcode);
				mobileAction.FuncSendKeys(passcode);
			}
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

	public void validate_walletOwner() {

		try {
			Decorator();

			if (mobileAction.verifyElementIsPresent(mobilepayment_Header)) {
				CharSequence passcode = getTestdata("Passcode");
				mobileAction.FuncSendKeys(passcode);
				mobileAction.FuncClick(setting_Button, "Setting");
				mobileAction.FuncClick(add_Card_Button, "Add a Card");
				mobileAction.waitForElementToVanish(progresssBar);

			}

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

	public void Pay_expire() throws IOException, NoSuchElementException, InterruptedException {
		Decorator();
		try {
			mobileAction.FuncClick(pay_Button, "Pay Button");
			mobileAction.waitForElementToVanish(cancel_Button);
			mobileAction.verifyElementIsDisplayed(timer_Text, msg);
			mobileAction.verifyElementIsDisplayed(timer_Time, time);
			mobileAction.FuncClick(restart_Timer, "Restart timer");
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

	public void verify_card() throws IOException {
		Decorator();
		try {
			mobileAction.FuncClick(settings_Icon, "Settings icon");
			mobileAction.verifyElementIsDisplayed(card_Name, card_nm);
			mobileAction.verifyElementIsDisplayed(card_Number, card_no);
			mobileAction.verifyElementIsDisplayed(default_Card, def_card);
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
	 * This method will swipe on the Mobile Payment
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void swipeMobilePayment() {

		try {
			Decorator();
			mobileAction.FuncClick(mobilePaymentContinue, "Continue");
			mobileAction.FuncClick(mobilePaymentAddACard, "Add A Card");

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
	 * This method will enter the answer for the security question
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void securityQuestion() {
		Decorator();
		try {

			if (mobileAction.verifyElementIsPresent(securityQuestionHeader)) {
				mobileAction.FuncClick(enterAnswer, "Enter your Answer");
				mobileAction.FuncSendKeys(enterAnswer, getTestdata("SecurityAnswer"));
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClick(done, "Done");

				} else {
					mobileAction.FuncHideKeyboard();
				}
				mobileAction.FuncClick(securityLogin, "Login");
				mobileAction.waitForElementToVanish(progressBar);
			}

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
	 * This method will add a card to the wallet
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void addACard() {

		try {
			Decorator();

			mobileAction.waitForElementToVanish(progressBarCompatabilityCheck);
			mobileAction.FuncClick(addMobilePayment, "Add To Mobile Payment");
			mobileAction.waitForElementToVanish(progressBarAddCard);

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
	 * This method will click on the settings icon the mobile payment page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickSettings() {

		try {
			Decorator();

			mobileAction.FuncClick(settings, "Settings");

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
	 * This method will add card
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
	 */
	public void addacard() {

		try {
			Decorator();

			mobileAction.FuncClick(addIcon, "Click Add Icon");

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
	 * This method will click manage settings
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickcard() {

		Decorator();
		try {
			mobileAction.FuncClick(clickCard, "Click  Card");
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
	 * This method will click manage settings
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void managesettings() {

		Decorator();
		try {
			mobileAction.FuncClick(manageSettingIcon, "Click Manage Settings");
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
	 * This method will click on the added card
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void selectcard() {

		Decorator();
		try {
			MobileElement cardVal = mobileAction.verifyElementUsingXPath(selectcard, "Select Card");
			mobileAction.FuncClick(cardVal, "Select the card");
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
	 * This method will do the initial swipe for the mobile payment page
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void InitialSwipe() {
		try {
			Decorator();
			mobileAction.FunctionSwipe("left", 2000, 30);
			int[] screensize = mobileAction.FuncScreenSize();
			int x = screensize[0];
			int y = screensize[1];
			try {
				mobileAction.FuncClickCoordinates(x / 2, y - 10, 1);
				mobileAction.FuncClickCoordinates(x / 2, y - 200, 1);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will click on setting icon in Mobile Payment Page
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clicksettingsicon() {

		Decorator();
		try {
			mobileAction.FuncClick(settingIcon, "Click Settings icon");
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
	 * This method will verify default card
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifydefaultcard() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(verifyDefaultCard, "Verify Default Card");
		} catch (NoSuchElementException e) {
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
	 * This method will click the enable passcode
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void click_enablepasscode() {

		Decorator();
		try {

			// mobileAction.FuncClick(setuppasscode, "Click Setup Passcode");
			mobileAction.FuncSendKeys(sendPasscode, passcode);
			mobileAction.FuncHideKeyboard();

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
	 * Enter Incorrect Passcode N Times
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void IncorrectPasscode_Ntimes() {

		Decorator();
		try {
			String passcode = getTestdata("Passcode");
			String passcodevalue[] = passcode.split(",");
			for (int i = 0; i < passcodevalue.length; i++) {
				mobileAction.FuncClick(sendPasscode, "Click Passcode");
				mobileAction.FuncSendKeys(sendPasscode, passcodevalue[i]);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(login, "Click Login Button");
				Login.get().login();
				// mobileAction.FuncClick(sendPasscode, "Click Passcode");
				mobileAction.FuncSendKeys(sendPasscode, newpasscode);
				mobileAction.FuncSendKeys(reenterppasscode, newpasscode);
				mobileAction.FuncHideKeyboard();
			}
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
}