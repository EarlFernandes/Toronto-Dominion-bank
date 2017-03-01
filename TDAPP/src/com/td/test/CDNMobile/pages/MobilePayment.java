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

	@iOSFindBy(xpath = " //*[label='Mobile Payment']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Mobile Payment']")
	private MobileElement mobilePayment_header;

	@iOSFindBy(xpath = " //*[label='Manage TD Mobile Payment']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage TD Mobile Payment']")
	private MobileElement manage_cards_header;

	@iOSFindBy(xpath = " //*[label='Simplify the Way you Pay']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/feature_header1' and @text='Simplify the Way you Pay']")
	private MobileElement feature_header1;

	@iOSFindBy(xpath = " //*[label='Pay Safely and Securely']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/feature_header2' and @text='Pay Safely and Securely']")
	private MobileElement feature_header2;

	@iOSFindBy(xpath = " //*[label='Continue']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_continue' and @text='Continue']")
	private MobileElement continue_button;

	@iOSFindBy(xpath = " //*[label='Add a Card']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_add_card' and @text='Add a Card']")
	private MobileElement add_card_button;

	@iOSFindBy(xpath = " //*[label='Add a Card']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Add a Card']")
	private MobileElement add_card_header;

	@iOSFindBy(xpath = " //*[label='Add to TD Mobile Payment']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/add_cards_button' and @text='Add to TD Mobile Payment']")
	private MobileElement add_to_mobilePayment_button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/setup_passcode']")
	private MobileElement setup_passcode;

	@iOSFindBy(xpath = " //*[label='OFF']")
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.td:id/enable_passcode_switch']")
	private MobileElement enable_passcode;

	@iOSFindBy(xpath = " //*[label='Manage Settings']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/manage_settings_text_view' and @text='Manage Settings']")
	private MobileElement manage_settings_button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/nickname']")
	private MobileElement card_no_element;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/card_num_or_nick']")
	private MobileElement card_no_mobilepayment;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/action_my_settings']")
	private MobileElement setting_button;

	@iOSFindBy(xpath = " //*[label='Add a Card']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/carousel_card_nickname' and @text='Add a Card']")
	private MobileElement add_card_mobile_payment;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	private MobileElement progresssBar;

	@iOSFindBy(xpath = " //*[label='Set up Passcode']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Set up Passcode']")
	private MobileElement setup_passcode_header;

	@iOSFindBy(xpath = " //*[label='Skip this step']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_skip_forgot_passcode' and @text='Skip this step']")
	private MobileElement skip_passcode_setup;

	@iOSFindBy(xpath = " //*[label='Save']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/button_save' and @text='Save']")
	private MobileElement save_button;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	private MobileElement change_default_card;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/set_default_card_image_view_off']")
	private MobileElement set_default_card;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/default_card_image_view']")
	private MobileElement default_card_image_view;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/nickname_box']")
	private MobileElement nickname_edit_text;

	@iOSFindBy(xpath = "//*[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement backButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/pay_button']")
	private MobileElement Pay_button;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/single_mode_timer_value' and @text=':0']")
	private MobileElement timer_time;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/single_mode_timer_message' and @text='Seconds Remaining']")
	private MobileElement timer_text;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_cancel' and @text='Cancel']")
	private MobileElement cancel_button;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/action_my_settings']")
	private MobileElement settings_icon;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_restart_timer' and @text='Restart timer']")
	private MobileElement restart_timer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/card_type_text_view']")
	private MobileElement card_name;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/card_number_text_view' and contains(@text,'**** **** ****')]")
	private MobileElement card_number;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/default_card_image_view' and @index = '1']")
	private MobileElement default_card;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_continue' and @text='Continue']")
	private MobileElement mobilePaymentContinue;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_add_card' and @text='Add a Card']")
	private MobileElement mobilePaymentAddACard;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/add_cards_button' and @text='Add to TD Mobile Payment']")
	private MobileElement addMobilePayment;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@AndroidFindBy(xpath = "//android.widget.ProgressBar[@resource-id='com.td:id/content_loader']")
	private MobileElement progressBarAddCard;

	@AndroidFindBy(xpath = "//android.widget.ProgressBar[@resource-id='com.td:id/progressbar']")
	private MobileElement progressBarCompatabilityCheck;

	@iOSFindBy(xpath = "//*[@label='Security Question']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Security Question']")
	private MobileElement securityQuestionHeader;

	@iOSFindBy(xpath = "//*[@value='Enter your answer']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/mfa_answer']")
	private MobileElement enterAnswer;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[@label='Login']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/mfa_login_btn' and @text='Login']")
	private MobileElement securityLogin;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/action_my_settings']")
	private MobileElement settings;

	String cardname = getTestdata("CardName");
	String selectcard = "//android.widget.TextView[@resource-id='com.td:id/card_type_text_view' and @text='" + cardname
			+ "')]";

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/manage_settings_text_view' and @text='Manage Settings']")
	private MobileElement managesettingicon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/card_type_text_view' and contains(@text,'AEROPLAN')]")
	private MobileElement clickcard;

	@iOSFindBy(id = "//*[@label='']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/action_my_settings' and @content-desc='Manage TD Mobile Payment']")
	private MobileElement settingicon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/setup_passcode' and @text='Set Up Passcode']")
	private MobileElement setuppasscode;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/setup_passcode_input1']")
	private MobileElement sendppasscode;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/setup_passcode_input1']")
	private MobileElement reenterppasscode;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/cardImg']")
	private MobileElement verifydefaultcard;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button_login' and @text='Login']")
	private MobileElement login;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='android:id/action_bar']")
	private MobileElement landingpageheader;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button' and @text='Continue']")
	private MobileElement continuebtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/carousel_card_image' and @content-desc='Add a Card']")
	private MobileElement addicon;


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

			if (mobilePayment_header.isDisplayed()) {
				mobileAction.FuncClick(continue_button, "Continue");
				Thread.sleep(2000);
				mobileAction.FuncClick(add_card_button, "Add a Card");
				Thread.sleep(2000);
				mobileAction.waitForElementToVanish(progresssBar);
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void addToTDMobilePayment() {

		try {
			Decorator();
			Thread.sleep(8000);

			String add_to_mobilePayment_path = "//*[label='Add to TD Mobile Payment']";
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.waitForElementToAppear(add_to_mobilePayment_path, "Add To Mobile Payment");
			mobileAction.FuncClick(add_to_mobilePayment_button, "Add to TD Mobile Payment");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void changeDefaultCard() {

		try {
			Decorator();
			Thread.sleep(4000);

			if (mobilePayment_header.isDisplayed()) {
				mobileAction.FuncClick(setting_button, "Setting");
				if (manage_cards_header.isDisplayed()) {
					mobileAction.FuncClick(change_default_card, "Change Default Card");
					Decorator();
					Thread.sleep(4000);
					mobileAction.FuncClick(set_default_card, "Set As Default Card");
					mobileAction.FuncClick(save_button, "Save");
					mobileAction.FuncClick(backButton, "Back");

				}

			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyNickName() {
		try {
			Decorator();
			Thread.sleep(5000);
			if (setup_passcode_header.isDisplayed()) {
				CharSequence passcode = getTestdata("Passcode");
				mobileAction.FuncSendKeys(passcode);
				Thread.sleep(2000);
				mobileAction.FuncSendKeys(passcode);
			}
			Thread.sleep(2000);
			mobileAction.FuncClick(manage_settings_button, "Setting");

			mobileAction.FuncClick(default_card_image_view, "Default Card");

			mobileAction.FuncClick(nickname_edit_text, "Default Card");
			mobileAction.FuncSendKeys(nickname_edit_text, "");
			mobileAction.FuncHideKeyboard();

			mobileAction.FuncSendKeys(nickname_edit_text,
					"The nickname can be only upto 25 characters. It will erase the remaining");
			mobileAction.FuncClick(save_button, "Save");
			Thread.sleep(2000);
			String nickname = nickname_edit_text.getText();
			if (nickname.length() <= 20) {
				CL.GetReporting().FuncReport("PASS", "The Nickname box accepts only 20 characters");
			} else {
				CL.GetReporting().FuncReport("FAIL", "The Nickname box accepts more than 20 characters");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void setupWalletPasscode() {
		try {
			Decorator();
			Thread.sleep(8000);

			String add_to_mobilePayment_path = "//*[label='Add to TD Mobile Payment']";
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.waitForElementToAppear(add_to_mobilePayment_path, "Add To Mobile Payment");
			mobileAction.FuncClick(add_to_mobilePayment_button, "Add to TD Mobile Payment");

			Thread.sleep(2000);
			Decorator();

			Thread.sleep(2000);
			if (setup_passcode_header.isDisplayed()) {
				CharSequence passcode = getTestdata("Passcode");
				mobileAction.FuncSendKeys(passcode);
				Thread.sleep(2000);
				mobileAction.FuncSendKeys(passcode);
			} else {
				mobileAction.FuncClick(continue_button, "Continue");
				mobileAction.FuncClick(setting_button, "Setting");
				Thread.sleep(2000);
				mobileAction.FuncClick(manage_settings_button, "Setting");
				Thread.sleep(2000);
				mobileAction.FuncClick(enable_passcode, "Enable passcode");
				mobileAction.FuncClick(setup_passcode, "Setup Passcode");
				Thread.sleep(4000);
				CharSequence passcode = getTestdata("Passcode");
				mobileAction.FuncSendKeys(passcode);
				Thread.sleep(2000);
				mobileAction.FuncSendKeys(passcode);
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void validate_walletOwner() {

		try {
			Decorator();
			Thread.sleep(4000);

			if (mobilePayment_header.isDisplayed()) {
				CharSequence passcode = getTestdata("Passcode");
				mobileAction.FuncSendKeys(passcode);
				Thread.sleep(2000);
				mobileAction.FuncClick(setting_button, "Setting");
				Thread.sleep(2000);
				mobileAction.FuncClick(add_card_button, "Add a Card");
				Thread.sleep(2000);
				mobileAction.waitForElementToVanish(progresssBar);

			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void Pay_expire() throws IOException, NoSuchElementException, InterruptedException {
		Decorator();
		try {
			mobileAction.FuncClick(Pay_button, "Pay Button");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

		mobileAction.waitForElementToVanish(cancel_button);
		mobileAction.verifyElementIsDisplayed(timer_text, msg);
		mobileAction.verifyElementIsDisplayed(timer_time, time);
		mobileAction.FuncClick(restart_timer, "Restart timer");
	}

	public void verify_card() throws IOException {
		Decorator();
		try {
			mobileAction.FuncClick(settings_icon, "Settings icon");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.verifyElementIsDisplayed(card_name, card_nm);
			mobileAction.verifyElementIsDisplayed(card_number, card_no);
			mobileAction.verifyElementIsDisplayed(default_card, def_card);
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
	 */
	public void swipeMobilePayment() throws InterruptedException, IOException {

		try {
			Decorator();
			mobileAction.FuncClick(mobilePaymentContinue, "Continue");
			mobileAction.FuncClick(mobilePaymentAddACard, "Add A Card");

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void securityQuestion() throws InterruptedException, IOException {
		Decorator();
		try {

			if (securityQuestionHeader.isDisplayed() == true) {
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
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void addACard() throws InterruptedException, IOException {

		try {
			Decorator();

			mobileAction.waitForElementToVanish(progressBarCompatabilityCheck);
			mobileAction.FuncClick(addMobilePayment, "Add To Mobile Payment");
			mobileAction.waitForElementToVanish(progressBarAddCard);

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void clickSettings() throws InterruptedException, IOException {

		try {
			Decorator();

			mobileAction.FuncClick(settings, "Settings");

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	/**
	* This method will add card
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
	public void addacard() throws InterruptedException, IOException {

	try {
	Decorator();

	mobileAction.FuncClick(addicon, "Click Add Icon");

	} catch (NoSuchElementException e) {
	System.err.println("TestCase has failed.");
	CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void clickcard() {

		Decorator();
		try {
			mobileAction.FuncClick(clickcard, "Click  Card");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void managesettings() {

		Decorator();
		try {
			mobileAction.FuncClick(managesettingicon, "Click Manage Settings");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void selectcard() {

		Decorator();
		try {
			MobileElement cardVal = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(selectcard));
			mobileAction.FuncClick(cardVal, "Select the card");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
			Thread.sleep(1000);
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
		} catch (InterruptedException e) {
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
	 */
	public void clicksettingsicon() {

		Decorator();
		try {
			mobileAction.FuncClick(settingicon, "Click Settings icon");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void verifydefaultcard() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(verifydefaultcard, "Verify Default Card");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void click_enablepasscode() {

		Decorator();
		try {

			// mobileAction.FuncClick(setuppasscode, "Click Setup Passcode");
			mobileAction.FuncSendKeys(sendppasscode, passcode);
			mobileAction.FuncHideKeyboard();

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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
	 */
	public void IncorrectPasscode_Ntimes() {

		Decorator();
		try {
			String passcode = getTestdata("Passcode");
			String passcodevalue[] = passcode.split(",");
			for (int i = 0; i < passcodevalue.length; i++) {
				mobileAction.FuncClick(sendppasscode, "Click Passcode");
				mobileAction.FuncSendKeys(sendppasscode, passcodevalue[i]);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(login, "Click Login Button");
				Login.get().login();
				// mobileAction.FuncClick(sendppasscode, "Click Passcode");
				mobileAction.FuncSendKeys(sendppasscode, newpasscode);
				mobileAction.FuncSendKeys(reenterppasscode, newpasscode);
				mobileAction.FuncHideKeyboard();
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}