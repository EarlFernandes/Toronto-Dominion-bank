package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
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

public class AutoDepositPage extends _CommonPage {

	private static AutoDepositPage AutoDepositPage;

	public synchronized static AutoDepositPage get() {
		if (AutoDepositPage == null) {
			AutoDepositPage = new AutoDepositPage();
		}
		return AutoDepositPage;
	}

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Set up Autodeposit' or label=='Établir Autodépôt'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/menu_item_add_auto_deposit']")
	private MobileElement setupAutoDepositBtn;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Add' or label=='Ajouter'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/auto_deposit_add_button']")
	private MobileElement setAutodepositTopBtn;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'My Name' or label CONTAINS[cd] 'Mon nom'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_value_item1']")
	private MobileElement myName;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`value=='Enter email address' or value=='Entrer l’adresse courriel'`]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/add_auto_deposit_email_edit']")
	private MobileElement emailIdTxt;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`value=='Re-enter email address' or value=='Entrez l’adresse à nouveau'`]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/add_auto_deposit_confirm_email_edit']")
	private MobileElement confirmEmailIdTxt;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Choose an account' or label CONTAINS[cd] 'Choisir un compte'`]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/add_auto_deposit_account_selection']")
	private MobileElement chooseAccDropDown;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Continue' or label=='Continuer'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_footer']")
	private MobileElement continueBtn;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeActivityIndicator[`value=='1'")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Accept' or label=='Accepter'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/acceptButton']")
	private MobileElement acceptBtn;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Almost done!' or label=='Vous avez presque terminé!'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement almostDone;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`value CONTAINS[cd] 'Check your email for instructions' or value CONTAINS[cd] 'Consultez les instructions que vous avez reçues'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subHeader']")
	private MobileElement checkEmailMsg;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Delete' or label=='Supprimer'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/manage_auto_deposit_delete']")
	private MobileElement deleteAutoDepositBtn;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name=='alert_ok_button'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/positive_button']")
	private MobileElement yesBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@name='alert_cancel_button']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/negative_button']")
	private MobileElement noBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement Successmsg;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label CONTAINS[cd] 'Deposit To' or label CONTAINS[cd] 'Compte de destination'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/bottom_textview']")
	private MobileElement autodepositAcc;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_title']")
	private List<MobileElement> rowTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_row_value_item1']")
	private List<MobileElement> rowValue;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label CONTAINS[cd] 'Email Address' or label CONTAINS[cd] 'Adresse courriel'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/manage_auto_deposit_email_title']")
	private MobileElement email;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label CONTAINS[cd] 'My Name' or label CONTAINS[cd] 'Mon nom'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/manage_auto_deposit_email_title']")
	private MobileElement myname;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/manage_auto_deposit_email_value']")
	private MobileElement emailVal;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Done' or label=='Terminé'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_footer']")
	private MobileElement doneButton;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Set up Autodeposit' or label CONTAINS[cd] 'Établir Autodépôt'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/cta_text_view']")
	private MobileElement autoDepositBanner;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`name=='TDVIEW_TITLE'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement pageHeader;

	@iOSXCUITFindBy(iOSClassChain = "**/*[`label=='Select a recipient' or label=='Choisir un destinataire'`]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/request_money_contacts_view']")
	private MobileElement requestMoneyTo;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeTextField[`value CONTAINS[cd] '$'`]")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'$')]")
	private MobileElement amount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Deposit to' or @label='Compte de destination']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/request_money_deposit_to_view']")
	private MobileElement depositTo;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_sub_heading']")
	private MobileElement depositToAccount;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label=='Continue' or label=='Request Money' or label=='Next' or `label=='Continuer' or label=='Demander des fonds' or label=='Suivant'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button']")
	private MobileElement next;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeButton[@label='Next' or @name='Next']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button']")
	private MobileElement nextAutoDep;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeButton[@label='Request Money' or @name='Demander des fonds']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button']")
	private MobileElement nextReqMoney;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/continue_button']")
	private MobileElement requestMoneyBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_header']")
	private MobileElement requestMoneySuccessMsg;

	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Request sent!' or @label='Demande envoyée!']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/receipt_subHeader']")
	private MobileElement requestMoneySubHeader;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement customerEligigbilityFailMsg;

	//@iOSXCUITFindBy(iOSClassChain = "**/[`label=='Requested By' or label=='Demandé par'`]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='Select a profile']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/request_money_requestor_view']")
	private MobileElement requestedBy;

	//@iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Register another profile' or label CONTAINS[cd] 'Ajouter un autre profil'`]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[@label='Register another profile' or @label='Ajouter un autre profil']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Register another profile' or @text='Ajouter un autre profil']")
	private MobileElement registerAnotherProfile;

	@iOSXCUITFindBy(xpath="//*[contains(@label,'Request')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_access_request_money']")
	private MobileElement requestMoneyCTAOption;

	int emailCounter = 0;

	private String platform = CL.getTestDataInstance().getMobilePlatForm();

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
	public void verifyPageheader() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(pageHeader, "Page Header");


		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}

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

			if (mobileAction.verifyElementIsPresent(setupAutoDepositBtn))
				mobileAction.FuncClick(setupAutoDepositBtn, "Set up Autodeposit Button");
			else
				mobileAction.FuncClick(setAutodepositTopBtn, "Set up Autodeposit Button");

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

			String emailXL = getTestdata("Email");
			String[] emailArr = emailXL.split(": ");

			String AccToDeposit = null;

			mobileAction.verifyElementIsDisplayed(myName, "Profile Name: " + myName.getText());
			mobileAction.FuncClick(emailIdTxt, "Email ID textfiled");
			mobileAction.FuncSendKeys(emailIdTxt, emailArr[emailCounter]);

			if (platform.equalsIgnoreCase("iOS")) {

				mobileAction.FuncClickDone();
				mobileAction.FuncClick(confirmEmailIdTxt, "Confirm Email ID");
				mobileAction.FuncSendKeys(confirmEmailIdTxt, emailArr[emailCounter]);
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(chooseAccDropDown, "Choose Account Drop Down");

				AccToDeposit = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'"
						+ getTestdata("ToAccount") + "')]";

			} else {
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(confirmEmailIdTxt, "Confirm Email ID");
				mobileAction.FuncSendKeys(confirmEmailIdTxt, emailArr[emailCounter]);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(chooseAccDropDown, "Choose Account Drop Down");

				AccToDeposit = "//android.widget.TextView[@resource-id='com.td:id/txt_sub_heading' and @text='"
						+ getTestdata("ToAccount") + "']";
			}

			MobileElement accountNumberToDeposit = mobileAction.mobileElementUsingXPath(AccToDeposit);
			mobileAction.FuncClick(accountNumberToDeposit, "Account Number " + getTestdata("ToAccount"));
			mobileAction.FuncClick(continueBtn, "Continue Button");
			mobileAction.waitForElementToVanish(progressBar);

			emailCounter++;
			if (emailCounter == emailArr.length) {
				emailCounter = 0;
			}

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
	public void clickAccept() {

		Decorator();
		try {

			mobileAction.FuncClick(acceptBtn, "Accept Button");

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
	public void verifyAutoDepositSuccessMsg() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(almostDone, "Almost Done header");
			mobileAction.verifyTextEquality(almostDone.getText(),
					getTextInCurrentLocale(StringArray.ADD_AUTODEPOSIT_RECEIPT_HEADER));
			mobileAction.verifyElementIsDisplayed(checkEmailMsg, checkEmailMsg.getText());
			mobileAction.verifyTextContains(checkEmailMsg.getText(),
					getTextInCurrentLocale(StringArray.ADD_AUTODEPOSIT_RECEIPT_SUB_HEADER));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	private String autodepositStatus = null;

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
	public void deleteAutoDeposit() {

		Decorator();
		try {

			String autodepositAccToDelXL = getTestdata("TransactionStatus");
			String[] autodepositAccToDel = autodepositAccToDelXL.split(": ");
			for (int i = 0; i < autodepositAccToDel.length; i++) {

				autodepositStatus = autodepositAccToDel[i];

				clickAutoDeposit();

				mobileAction.FuncClick(deleteAutoDepositBtn, "Delete AutoDeposit Button");
				mobileAction.FuncClick(yesBtn, "Yes Button");

				if (platform.equalsIgnoreCase("iOS")) {
					Successmsg = mobileAction.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='"
							+ getTextInCurrentLocale(StringArray.ARRAY_AUTODEPOSIT_DELETE_MSG) + "']");
					mobileAction.verifyElementIsDisplayed(Successmsg, "The Autodeposit setup was deleted successfully");
				} else {
					mobileAction.verifyElementIsDisplayed(Successmsg, "The Autodeposit setup was deleted successfully");
					mobileAction.verifyTextEquality(Successmsg.getText(),
							mobileAction.getAppString("auto_deposit_deleted"));
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
	public void clickAutoDeposit() {

		Decorator();
		try {

			String autodepositAccToDelXL = getTestdata("TransactionStatus");
			autodepositAccToDelXL.split(": ");
			MobileElement pendingAutoDeposit = null;
			MobileElement activeAutoDeposit = null;

			if (StringUtils.isEmpty(autodepositStatus)) {
				autodepositStatus = getTextInCurrentLocale(StringArray.ARRAY_AUTODEPOSIT_PENDING_STATUS);
			}

			if (platform.equalsIgnoreCase("Android")) {

				if (autodepositStatus
						.equalsIgnoreCase(getTextInCurrentLocale(StringArray.ARRAY_AUTODEPOSIT_PENDING_STATUS))) {

					pendingAutoDeposit = mobileAction.mobileElementUsingXPath(
							"//android.widget.TextView[@resource-id='com.td:id/auto_deposit_list_item_status' and @text='"
									+ mobileAction.getAppString("auto_deposit_status_pending") + "']");
					mobileAction.FuncClick(pendingAutoDeposit, "Pending AutoDeposit");

				} else {

					activeAutoDeposit = mobileAction.mobileElementUsingXPath(
							"//android.widget.TextView[@resource-id='com.td:id/auto_deposit_list_item_status' and @text='"
									+ mobileAction.getAppString("auto_deposit_status_active") + "']");
					mobileAction.FuncClick(activeAutoDeposit, "Active AutoDeposit");
				}

			} else {

				if (autodepositStatus
						.equalsIgnoreCase(getTextInCurrentLocale(StringArray.ARRAY_AUTODEPOSIT_PENDING_STATUS))) {

					pendingAutoDeposit = mobileAction
							.mobileElementUsingXPath("//XCUIElementTypeButton[contains(@label,'"
									+ getTextInCurrentLocale(StringArray.ARRAY_AUTODEPOSIT_PENDING_STATUS) + "')]");
					mobileAction.FuncClick(pendingAutoDeposit, "Pending AutoDeposit");

				} else {

					activeAutoDeposit = mobileAction.mobileElementUsingXPath("//XCUIElementTypeButton[contains(@label,'"
							+ getTextInCurrentLocale(StringArray.ARRAY_AUTODEPOSIT_ACTIVE_STATUS) + "')]");
					mobileAction.FuncClick(activeAutoDeposit, "Active AutoDeposit");
				}

			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void editAutoDeposit() {

		Decorator();
		try {

			String accountsXL = getTestdata("Accounts");
			String[] accounts = accountsXL.split(": ");
			String enterAccount = null;
			MobileElement accountToSelect = null;

			if (autodepositAcc.getText().contains(accounts[0])) {
				enterAccount = accounts[1];
			} else {
				enterAccount = accounts[0];
			}

			if (platform.equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(myname, "My Name");
				String[] mynameArr = myname.getText().split(",");
				mobileAction.verifyElementIsDisplayed(myname, mynameArr[1]);
				mobileAction.verifyElementIsDisplayed(email, "Email");
				String[] emailArr = email.getText().split(",");
				mobileAction.verifyElementIsDisplayed(email, emailArr[1]);
				mobileAction.FuncClick(autodepositAcc, "Deposit To Drop down");

				accountToSelect = mobileAction.mobileElementUsingXPath(
						"//XCUIElementTypeStaticText[contains(@label,'" + enterAccount + "')]");

				mobileAction.FuncClick(accountToSelect, "Account Number: " + enterAccount);
				mobileAction.FuncClick(doneButton, "Done");
				mobileAction.FuncClick(acceptBtn, "Accept Button");

				Successmsg = mobileAction.mobileElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_AUTODEPOSIT_UPDATE_MSG) + "']");

				mobileAction.verifyElementIsDisplayed(Successmsg, Successmsg.getText());

			} else {

				mobileAction.verifyElementIsDisplayed(rowTitle.get(0), "My Name");
				mobileAction.verifyElementIsDisplayed(rowValue.get(0), rowValue.get(0).getText());
				mobileAction.verifyElementIsDisplayed(email, "Email");
				mobileAction.verifyElementIsDisplayed(emailVal, emailVal.getText());
				mobileAction.FuncClick(autodepositAcc, "Deposit To Drop down");

				accountToSelect = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/txt_sub_heading' and @text='" + enterAccount
								+ "']");

				mobileAction.FuncClick(accountToSelect, "Account Number: " + enterAccount);
				mobileAction.FuncClick(doneButton, "Done");
				mobileAction.FuncClick(acceptBtn, "Accept Button");
				mobileAction.verifyElementIsDisplayed(Successmsg, Successmsg.getText());
				mobileAction.verifyTextEquality(Successmsg.getText(),
						mobileAction.getAppString("auto_deposit_updated"));
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
	public void clickAutoDepositBanner() {

		Decorator();
		try {

			mobileAction.FuncClick(autoDepositBanner, "Auto Deposit Banner");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void performRequestMoney() {

		Decorator();
		try {

			if (platform.equalsIgnoreCase("iOS")) {

				mobileAction.FuncClick(requestMoneyTo, "Request Money To DropDown");

				MobileElement requestUser = mobileAction.mobileElementUsingIOSClassChain(
						"**/XCUIElementTypeStaticText[`label CONTAINS[cd] '" + getTestdata("ToAccount") + "'`]");

				mobileAction.FuncClick(requestUser, "User " + getTestdata("ToAccount"));
				mobileAction.FuncClick(amount, "Amount");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(depositTo, "Deposit To Drop Down");
				mobileAction.FuncClick(depositToAccount, "Deposit To Account " + depositToAccount.getText());
				mobileAction.FuncClick(nextAutoDep, "Next Button");

			} else {

				mobileAction.FuncClick(requestMoneyTo, "Request Money From DropDown");
				MobileElement requestUser = mobileAction.mobileElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/txt_heading' and @text='"
								+ getTestdata("ToAccount") + "']");
				mobileAction.FuncClick(requestUser, "User " + getTestdata("ToAccount"));
				mobileAction.FuncClick(amount, "Amount");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(depositTo, "Deposit To Drop Down");
				mobileAction.FuncClick(depositToAccount, "Deposit To Account " + depositToAccount.getText());
				mobileAction.FuncClick(next, "Next Button");
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
	public void requestMoneyRegisterAnotherProfile() {

		Decorator();
		try {

		
			mobileAction.FuncClick(requestedBy, "Requested By DropDown");
			mobileAction.FuncClick(registerAnotherProfile, "Register Another Profile");
		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void clickRequestMoneyCTAOption() {

		Decorator();
		try {

			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.FunctionSwipe("up", 200, 200);
			
			mobileAction.getPageSource();
			
			mobileAction.FuncClick(requestMoneyCTAOption, "Requested By DropDown");		//TODO::IOS
			mobileAction.verifyElementIsDisplayed(pageHeader, "Request Money Page Header");
			mobileAction.verifyTextEquality(pageHeader.getText(),
					getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_HEADER));

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void clickRequestMoneyVerifyScreen() {

		Decorator();
		try {

			mobileAction.FuncClick(nextReqMoney, "Request Money Button");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
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
	public void verifyRequestMoneySuccessMsg() {

		Decorator();
		try {
			
			mobileAction.waitForElementToVanish(progressBar);
			
			if (platform.equalsIgnoreCase("iOS")) {

				requestMoneySuccessMsg = mobileAction.mobileElementUsingIOSClassChain("**/*[`label=='"
						+ getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_REQUEST_SENT) + "'`]");
				requestMoneySubHeader = mobileAction.mobileElementUsingIOSClassChain(
						"**/*[`label=='" + getTextInCurrentLocale(StringArray.ARRAY_REQUEST_MONEY_SUCCESS_MSG) + "'`]");

			}
			mobileAction.verifyElementIsDisplayed(requestMoneySuccessMsg, "Request Sent!");
			mobileAction.verifyElementIsDisplayed(requestMoneySubHeader, "Request Money Success Message");

			if (platform.equalsIgnoreCase("Android")) {
				mobileAction.verifyTextEquality(requestMoneySuccessMsg.getText(),
						mobileAction.getAppString("request_money_recipient_title"));
				mobileAction.verifyTextEquality(requestMoneySubHeader.getText(),
						mobileAction.getAppString("request_money_receipt_sub_header"));
			}

		} catch (NoSuchElementException | IOException e) {
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
	public void setupQuickAutoDeposit() {

		Decorator();
		try {

			String emailXL = getTestdata("Email");
			String[] emailArr = emailXL.split(": ");

			for (int i = 0; i < emailArr.length; i++) {

				HomeScreen.get().clickMenu();
				MenuPage.get().clickProfileAndSettings();
				Profile_And_Settings.get().clickPaymentsAndTransfers();
				PaymentsAndTransfers.get().clickManageAutoDeposit();
				clickSetUpAutoDepositBtn();
				setupAutoDeposit();
				clickAccept();
				verifyAutoDepositSuccessMsg();

			}

		} catch (NoSuchElementException e) {
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
	public void deleteQuickAutodeposit() {

		Decorator();
		try {

			HomeScreen.get().clickMenu();
			MenuPage.get().clickProfileAndSettings();
			Profile_And_Settings.get().clickPaymentsAndTransfers();
			PaymentsAndTransfers.get().clickManageAutoDeposit();
			deleteAutoDeposit();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will fill the customer eligibility fail error message.
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
	public void verifyCustomerEligibilityFailErrorMsg() {

		Decorator();
		try {

			if (platform.equalsIgnoreCase("iOS")) {

				customerEligigbilityFailMsg = mobileAction.mobileElementUsingIOSClassChain("**/*[`label contains[cd] '"+getTextInCurrentLocale(StringArray.ARRAY_CUSTOMER_ELIGIBILITY_ERROR_MSG)+"'`]");

			}

			mobileAction.verifyElementIsDisplayed(customerEligigbilityFailMsg, "Customer Eligibility error message");
			mobileAction.verifyTextContains(customerEligigbilityFailMsg,
					getTextInCurrentLocale(StringArray.ARRAY_CUSTOMER_ELIGIBILITY_ERROR_MSG));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
