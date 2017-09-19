package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Bill_PayCanada extends _CommonPage {

	private static Bill_PayCanada Bill_PayCanada;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
	private MobileElement from_account_post;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber']")
	private MobileElement frm_acnt_post;

	@iOSFindBy(accessibility = "PAYBILL_VIEW_PAYEE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee']")
	private MobileElement to_account_post;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee']")
	private MobileElement to_acnt_post;

	@iOSFindBy(accessibility = "PAYBILL_VIEW_FROM")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount']")
	private MobileElement from_account;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement accountListView;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_paydate']")
	private MobileElement payDate;

	@iOSFindBy(xpath = "//[@label='From Account, Select from account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc']")
	private MobileElement select_from_acnt;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button' and @text='Cancel']")
	private MobileElement clickCancle;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='From Account, Select from account']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee' and @text='Select Payee']")
	private MobileElement to_account;

	String t_select_to_account = "//android.widget.TextView[@resource-id='com.td:id/edtPayee' and @text='Select Payee']";

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='TD CLASSIC TRAVEL VIS... 4520020000005323']")
	private MobileElement select_to_account;

	@iOSFindBy(xpath = "//*[@name='PAYBILL_VIEW_AMOUNT']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edtAmt' and @index='1']")
	private MobileElement amount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[ @text='Pay Bills']")
	private MobileElement pay_bills;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label, 'Invalid transaction amount')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text' and contains(@text,'Invalid transaction amount')]")
	private MobileElement verify_msg;

	@iOSFindBy(accessibility = "PAYBILL_VIEW_CONTINUE")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue']")
	private MobileElement continue_pay;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue'and @text='Pay Bill']")
	private MobileElement pay_bill;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeSegmentedControl[1]/XCUIElementTypeButton[3]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'com.td:id/buttonPayFullAmt']")
	private MobileElement currBal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_val;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement menu;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement payBill_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title'and @text='My Accounts']")
	private MobileElement my_accounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntDescrSum' and @text='PREFERRED CHEQUING ACCOUNT']")
	private MobileElement verify_from_account;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@text='' and @index='0']//android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement last_transaction;

	@iOSFindBy(xpath = "//*[@label='Done' or @label='完成']")
	private MobileElement done;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Add Canadian Payee']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee'and @text='Add Canadian Payee']")
	private MobileElement addCanada_Payee;

	// @iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In
	// progress']")
	// private MobileElement progrees_bar;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@label='Search for Canadian payees']")
	@AndroidFindBy(xpath = "//*[@text='Search for Canadian payees']")
	private MobileElement search_bar;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Add Payee']")
	private MobileElement addCanada_Payee_header;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/amountLabel' and @text='Amount']")
	private MobileElement amountHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/lblDate' and @text='Date']")
	private MobileElement date;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation # :' and @resource-id='com.td:id/confirmation']")
	private MobileElement confirmation_text;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='PAYBILL_VIEW_PAYEE' or @label='Select Payee']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee']")
	private MobileElement select_payee;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']")
	private MobileElement homeBtn;

	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement ListViewToAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtDate']")
	private MobileElement currDate;

	String Conf = "Confirmation";

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Thank you!']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/thank_you']")
	private MobileElement confirmationText;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtAccessCard']")
	private MobileElement accesscard;

	@iOSFindBy(xpath = "//*[@name='PAYBILL_VIEW_FROM']/../XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount']")
	private MobileElement AcntVal;

	@iOSFindBy(xpath = "//*[@name='PAYBILL_VIEW_PAYEE']/../XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee']")
	private MobileElement PayeVal;

	@iOSFindBy(xpath = "//*[@name='PAYBILL_VIEW_PAYEE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee']")
	private MobileElement PaySelection;

	@iOSFindBy(xpath = "//*[@label='PAYEE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/dialog_title']")
	private MobileElement PayeePopUp;

	@iOSFindBy(xpath = "//*[@label='CANCEL']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button']")
	private MobileElement PayeePopUp_Cancel;

	@iOSFindBy(xpath = " //XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText[@label='ACCESS CARD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/dialog_title' and @text='Access Card']")
	private MobileElement accesscardTableHeader;

	@iOSFindBy(xpath = "//*[@label='ACCESS CARD']/../../XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/txtAccessCard' and
	// @index='1']/following::@index='0'[1]")
	@AndroidFindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[@index=1]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement selectSecondAccessCard;

	String SelectSecondAccessCard = "//android.widget.ListView/android.widget.LinearLayout[@index=1]/android.widget.LinearLayout/android.widget.TextView";

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_cancel' and @text='Cancel']")
	private MobileElement cancelBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label ='Bills']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Bills']")
	private MobileElement bills_header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']")
	private MobileElement back_button;

	@iOSFindBy(accessibility = "NAVIGATION_ITEM_QUICK_ACCESS")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Home']")
	private MobileElement home;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@label='PAY ANOTHER BILL']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/paybill' and @text='PAY ANOTHER BILL']")
	private MobileElement PayBillQuickAccess;

	@iOSFindBy(xpath = "//*[@label='Add Canadian Payee']")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Add Canadian Payee')] | //android.widget.TextView[contains(@content-desc,'Add Canadian Payee')]")
	private MobileElement addCanadianPayee;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Pay With Rewards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/textview_action_title']")
	private MobileElement txtPaywithRewards;

	@iOSFindBy(xpath = "//*[@name='PAYBILL_VIEW_PAYEE']/following-sibling::XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee']")
	private MobileElement payeeValue;

	String accesscardTable = " //XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + 1 + Secondpart;

	String txtconfirmationText = "Thank you!";

	String merchant_name = "//XCUIElementTypeStaticText[contains(@label,'";

	String payee_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";

	public synchronized static Bill_PayCanada get() {
		if (Bill_PayCanada == null) {
			Bill_PayCanada = new Bill_PayCanada();
		}
		return Bill_PayCanada;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);

	}

	private void selectPayee() {

		String payeeAccount = getTestdata("Payee");
		System.out.println("Payee account:" + payeeAccount);
		try {
			String payeeNumber = mobileAction.FuncGetValByRegx(payeeAccount, "\\d+");
			String payeeName = payeeAccount.replaceAll(payeeNumber, "").trim();
			System.out.println("Payee name:" + payeeName);
			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
			// select payee
			mobileAction.FuncClick(select_payee, "Select Payee");
			String payeeAccountxpath;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				payeeAccountxpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//*[contains(@label, '" + payeeName + "')]";
			} else {
				payeeAccountxpath = "//android.widget.TextView[contains(@text,'" + payeeName + "')]";
			}
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(payeeAccountxpath, true, 10, "up");
		} catch (Exception e) {
			System.out.println("Failed to select payee:" + payeeAccount);
		}

	}

	public void pay_candadian_bill() {

		try {
			Decorator();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				selectPayee();
				Decorator();
				Thread.sleep(2000);
				mobileAction.FuncClick(amount, "Amount button clicked");
				String Amount = getTestdata("Amount");
				// mobileAction.FuncSendKeys(amount, Amount);
				Decorator();
				Thread.sleep(2000);
				amount.sendKeys(Amount);
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(confirmationText, "Thank You!");
				mobileAction.verifyElementIsDisplayed(confirmation_val, "Confirmation Value");

				String conf_val = mobileAction.getText(confirmation_val);
				String[] confmVal = conf_val.split(":");

				CL.getTestDataInstance().TCParameters.put("confirmation_val", confmVal[1].trim());

			}

			else {

				// String payee=getTestdata("Payee");
				// String ToPostAccountXpath =
				// "//android.widget.TextView[@resource-id='com.td:id/txtPayee'
				// and contains(@text,'"
				// + payee + "')]";
				//
				// if (mobileAction.verifyElementIsPresent(payeeValue)) {
				//
				// } else {
				// mobileAction.FuncClick(to_account_post, "Select Payee");
				// mobileAction.FuncElementSwipeWhileNotFound(ListViewToAccount,
				// ToPostAccountXpath, 1, "up", true);
				// mobileAction.waitForElementToDisappear(t_select_to_account);
				// }
				selectPayee();
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.verifyElement(confirmationText, txtconfirmationText);

				String conf_val = mobileAction.getText(confirmation_val);
				CL.getTestDataInstance().TCParameters.put("confirmation_val", conf_val);
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
	 * This method will verify text within elements for the canadian bills
	 * confirmation page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyPayCanadianBillConfirmationTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				payCanadianBillToConfirmation();
				// final MobileElement header =
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE']",
				// "confirm header");
				// final MobileElement warningMsg =
				// mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@name='TDVIEW_MESSAGE']",
				// "warning note");
				final MobileElement fromAccount = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='PAYBILL_CONFIRMVIEW_FROM']", "from account");
				final MobileElement payeeTo = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='PAYBILL_CONFIRMVIEW_TO']", "to payee");
				final MobileElement amount = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='PAYBILL_CONFIRMVIEW_AMOUNT']", "amount");
				final MobileElement date = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='PAYBILL_CONFIRMVIEW_DATE']", "date");
				final MobileElement dateVal = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@name='PAYBILL_CONFIRMVIEW_DATE']/following-sibling::XCUIElementTypeStaticText[1]",
						"date val");
				final MobileElement cancelBtn = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@name='PAYBILL_CONFIRMVIEW_CANCEL']", "cancel");
				final MobileElement payButton = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@name='PAYBILL_CONFIRMVIEW_CONTINUE']", "pay bill");

				// mobileAction.verifyTextEquality(header.getText(),
				// mobileAction.getAppString("confirm_title"));
				// mobileAction.verifyTextEquality(warningMsg.getText(),
				// mobileAction.getAppString("payBillConfirmCopyTop"));
				// mobileAction.verifyTextEquality(fromAccount.getText(),
				// mobileAction.getAppString("payBillReceiptFieldHeaderFromAccount"));
				mobileAction.verifyTextEquality(payeeTo.getText(),
						mobileAction.getAppString("payBillDropdownHeaderPayee"));
				mobileAction.verifyTextEquality(amount.getText(),
						mobileAction.getAppString("payBillReceiptFieldHeaderAmount"));
				mobileAction.verifyTextEquality(date.getText(),
						mobileAction.getAppString("payBillReceiptFieldHeaderDate"));
				mobileAction.verifyTextEquality(cancelBtn.getText(), mobileAction.getAppString("btn_cancel"));
				mobileAction.verifyTextEquality(payButton.getText(),
						mobileAction.getAppString("payBillConfirmButtonPayBill"));
				mobileAction.verifyDateFormat(dateVal.getText(), MobileAction2.TYPE_YYYY_MM_DD);
			} else {
				payCanadianBillToConfirmation();
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("review_details_title") + "']",
						"Confirm title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("receipt_from") + "']", "From");
				// mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
				// + mobileAction.getAppString("payBillDropdownHeaderPayee") +
				// "']", "To");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("date") + "']", "Date");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("payBillConfirmFieldHeaderAmount") + "']", "Amount");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.Button[@text='" + mobileAction.getAppString("str_cancel") + "']", "Cancel");
				mobileAction.verifyElementUsingXPath("//android.widget.Button[@text='"
						+ mobileAction.getAppString("payBillConfirmButtonPayBill") + "']", "Pay Bill");
				mobileAction.verifyDateFormat(payDate.getText(), MobileAction2.TYPE_YYYY_MM_DD);
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void payCanadianBillToConfirmation() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(from_account, "From Account");
				String from_accountNo = "//XCUIElementTypeStaticText[contains(@value, '" + getTestdata("FromAccount")
						+ "')]";

				MobileElement fromAccountval = (MobileElement) (CL.GetAppiumDriver())
						.findElement(By.xpath(from_accountNo));
				mobileAction.FunCSwipeandScroll(fromAccountval, true);
				mobileAction.FuncClick(to_account_post, "To Payee");
				String to_accountNo = "//XCUIElementTypeStaticText[contains(@value, '" + getTestdata("Payee") + "')]";

				MobileElement toAccountval = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(to_accountNo));

				mobileAction.FunCSwipeandScroll(toAccountval, true);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClickDone();
				} else {
					mobileAction.FuncHideKeyboard();
				}
				mobileAction.FuncClick(continue_pay, "Continue_pay");
			} else {
				// Seems like selector for from account/payee do not work here
				// We just need to get to confirmation page, so select default
				// fields
				// TODO: We should read from test data excel sheet to get From
				// Account value
				mobileAction.FuncClick(from_account, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(ListViewToAccount,
						"//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @index='0']", 4, "down",
						true);
				mobileAction.FuncClick(to_account_post, "Select Payee");
				mobileAction.FuncElementSwipeWhileNotFound(ListViewToAccount,
						"//android.widget.TextView[@text='" + getTestdata("Payee") + "']", 4, "down", true);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify the Payee Access card DropDown is present or Not
	 *
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyAccessCard_dropdown() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(payBill_Header, "PayBillHeader");
			Thread.sleep(2000);
			mobileAction.FuncClick(accesscard, "Accesscard");
			mobileAction.verifyElementIsDisplayed(accesscardTableHeader, "ACCESS CARD");

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
	 * This method will verify the Payee Access card all Details
	 * 
	 * @throws NoSuchElementException
	 *             and IOException
	 */
	public void verifyAccessCardDetails() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(payBill_Header, "PayBillHeader");
			mobileAction.verifyElementIsDisplayed(from_account, "From_Account");
			mobileAction.verifyElementIsDisplayed(amountHeader, "amount");
			mobileAction.verifyElementIsDisplayed(date, "Date");
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
	 * This method will verify both First and Second Access cards having Payee
	 * and accounts details.
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
	public void accesscardsWithPayeeandAccounts() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(payBill_Header, "PayBillHeader");
			String accountVal = getTestdata("FromAccount");
			String[] accountValue = accountVal.split(":");
			String payee = getTestdata("Payee");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				for (int i = 0; i < accountValue.length; i++) {
					String AccountVal = AcntVal.getAttribute("label");
					System.out.println("AccountVal:" + AccountVal);
					mobileAction.verifyTextEquality(accountValue[i], AccountVal);
					// Verify Payee dropdown
					mobileAction.FuncClick(PaySelection, "Payee");
					mobileAction.verifyElementIsDisplayed(PayeePopUp, "Payee drop Down");
					if (mobileAction.verifyElementIsPresent(PayeePopUp_Cancel)) {
						mobileAction.FuncClick(PayeePopUp_Cancel, "Payee Popup Cancel");
					} else {
						// This is just for iPad
						System.out.println("Click Back for iPAD to Cancel the Popup window");
						mobileAction.FuncClickBackButton();
					}
					mobileAction.FuncClick(accesscard, "Access Card");
					mobileAction.FuncClick(selectSecondAccessCard, "Select Access Card from Access card table");

				}

			} else {

				for (int i = 0; i < accountValue.length; i++) {
					String AccountVal = AcntVal.getText();
					System.out.println("AccountVal:" + AccountVal);
					mobileAction.verifyElementTextContains(AcntVal, accountValue[i]);
					// Verify Payee dropdown
					mobileAction.FuncClick(PaySelection, "Payee");
					mobileAction.verifyElementIsDisplayed(PayeePopUp, "Payee drop Down");
					if (mobileAction.verifyElementIsPresent(PayeePopUp_Cancel)) {
						mobileAction.FuncClick(PayeePopUp_Cancel, "Payee Popup Cancel");
					} else {
						// This is just for tablet
						System.out.println("Click Back for tablet to Cancel the Popup window");
						mobileAction.FuncClickBackButton();
					}
					mobileAction.FuncClick(accesscard, "Access Card");
					mobileAction.FuncClick(selectSecondAccessCard, "Select Access Card from Access card table");
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

	public void pay_candadian_bill_post_dated() {

		Decorator();
		try {
			mobileAction.FuncClick(from_account_post, "From Account");
			String transfer_fromAccount = getTestdata("FromAccount");
			System.out.println("From Account:" + transfer_fromAccount);
			String account_value = "";

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				account_value = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[contains(@label,'"
						+ transfer_fromAccount + "')]";

			} else {
				account_value = "//*[contains(@text,'" + transfer_fromAccount + "') or contains(@content-desc,'"
						+ transfer_fromAccount + "')]";
			}

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
			// mobileAction.FuncClick(frm_acnt_post, "fromAccountPost");

			mobileAction.FuncClick(to_account_post, "Select Payee");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				account_value = "//*[contains(@label, '" + getTestdata("ToAccount") + "')]";
			} else {
				account_value = "//*[contains(@text,'" + getTestdata("ToAccount") + "') or contains(@content-desc,'"
						+ getTestdata("ToAccount") + "')]";
			}

			MobileElement toAccountval = (MobileElement) (CL.GetAppiumDriver()).findElement(By.xpath(account_value));

			mobileAction.FunCSwipeandScroll(toAccountval, true);

			// mobileAction.FuncClick(to_acnt_post, "toAccountPost");
			// mobileAction.waitForElementToDisappear(t_select_to_account);

			mobileAction.FuncClick(amount, "Amount");
			String ValueofAmount = getTestdata("Amount");
			mobileAction.FuncSendKeys(amount, ValueofAmount);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(date, "Date");

			String date1 = String.valueOf(GetDate.get().getTomorrowsDate());
			System.out.println("Tomorrow is:" + date1);

			// String post_date = "//android.view.View[@content-desc='" + date +
			// "']";
			// mobileAction.findElementByXpathAndClick(post_date);
			mobileAction.FuncSendKeys(date, date1);
			// mobileAction.FuncClick(select_post_date);
			mobileAction.FuncClick(continue_pay, "Continue Pay");
			mobileAction.FuncClick(pay_bill, "Pay bill");

			// mobileAction.verifyTextContains(confirmation_text, Conf);
			mobileAction.verifyElement(confirmationText, txtconfirmationText);

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (NullPointerException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NullPointerException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void addCanadianPayee() {
		Decorator();
		try {

			Thread.sleep(5000);
			mobileAction.FuncClick(to_account_post, "Select Payee");
			mobileAction.FuncClick(addCanada_Payee, "Add CanadaPayee");
			mobileAction.waitForElementToVanish(progressBar);
			Thread.sleep(5000);
			mobileAction.FuncClick(search_bar, "SearchforCanadianPayees");
			String search_bar_value = getTestdata("Search");
			System.out.println("search_bar_value:" + search_bar_value);

			mobileAction.FuncSendKeys(search_bar, search_bar_value);

			mobileAction.waitForElementToVanish(progressBar);

			String merchant_value = getTestdata("MerchantName");
			String merchant_name_value = merchant_name + merchant_value + "')]";
			CL.GetDriver().findElement(By.xpath(merchant_name_value)).click();
			Thread.sleep(5000);

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
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will cancel the pay bill
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

	public void payBillCancel() {
		Decorator();
		try {

			selectPayee();
			Decorator();
			mobileAction.FuncClick(amount, "Amount button clicked");
			String Amount = getTestdata("Amount");
			System.out.println("Amount:" + Amount);
			Thread.sleep(2000);
			Decorator();
			// mobileAction.FuncSendKeys(amount, Amount); //very strange, not
			// clear why this doesn't work fro IOS at this case
			amount.sendKeys(Amount);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(continue_pay, "Continue_pay");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(cancelBtn, "Cancel");
			Bills.get().verifyBillHeader();

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
	 * This method will verify the default value of the amount
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

	public void amountSelection() {
		Decorator();
		try {

			String payeeAccount = getTestdataOtherSheet("FromAccount", "Payment");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				String amountVal = amount.getAttribute("value");
				String Amount = getTestdata("Amount");
				String[] amtVal = Amount.split(":");
				mobileAction.verifyTextEquality(amountVal, amtVal[0]);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, amtVal[1]);
				mobileAction.FuncClickDone();

			}

			else {

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				String amountVal = amount.getText();
				String Amount = getTestdata("Amount");
				String[] amtVal = Amount.split(":");
				mobileAction.verifyTextEquality(amountVal, amtVal[0]);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, amtVal[1]);
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

	/**
	 * This method will verify the Back button on the Pay Bill landing page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             If there is problem while reporting.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void verifyBackButton() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(backButton, "Back Button");
			} else {
				mobileAction.FuncClickBackButton();
			}
			Bills.get().verifyBillHeader();

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
	 * This method will verify the the Add canadian Payee Now button
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyAddCanadianPayeeButton() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
			mobileAction.verifyElementIsDisplayed(addCanadianPayee, "Add Canadian Payee");

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
	 * This method will click on the Pay Bill Quick Access In Receipt Page
	 * 
	 * @throws IOException
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

	public void payBillQuickAccessBtn() {

		Decorator();
		try {
			// mobileAction.FunCnewSwipe(PayBillQuickAccess, false, 1);
			mobileAction.FunCSwipeandScroll(PayBillQuickAccess, false);
			mobileAction.FuncClick(PayBillQuickAccess, "Pay Bill Quick Access Button");
			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");

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

	public void negativeTestingBillPayment() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				selectPayee();
				Decorator();
				mobileAction.FuncClick(amount, "Amount button clicked");
				// mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				String Amount = getTestdata("Amount");
				Decorator();
				Thread.sleep(2000);
				amount.sendKeys(Amount);
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(bills_header, "Bills");
				mobileAction.FuncClick(back_button, "Back");
				mobileAction.verifyElementIsDisplayed(home, "Home");

			}

			else {
				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				selectPayee();
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(bills_header, "Bills");
				mobileAction.FuncClick(menu, "Menu");
				mobileAction.FuncClick(homeBtn, "Home Button");
				mobileAction.verifyElementIsDisplayed(home, "Home");

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
	 * This method will enter all the fields in pay bill page
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
	 * 
	 * 
	 */
	public void payCanadianBill_InvalidAmount() {

		try {
			Decorator();

			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
			selectPayee();
			Decorator();
			mobileAction.FuncClick(amount, "Amount button clicked");
			String Amount = getTestdata("Amount");
			// mobileAction.FuncSendKeys(amount, Amount);
			Decorator();
			Thread.sleep(2000);
			amount.sendKeys(Amount);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}
			mobileAction.FuncClick(continue_pay, "Continue_pay");
			mobileAction.waitForElementToVanish(progressBar);
			Thread.sleep(2000);
			mobileAction.FuncClick(pay_bill, "Pay Bill");
			mobileAction.waitForElementToVanish(progressBar);
			Thread.sleep(2000);
			mobileAction.verifyElementIsDisplayed(verify_msg, "Invalid amount error message");
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
	 * This method will click on the Pay Bill Quick Access In Receipt Page
	 * 
	 * @throws IOException
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

	public void billPaymentCurrentDate() {

		Decorator();
		try {

			String payeeAccount = getTestdataOtherSheet("FromAccount", "Payment");

			Decorator();
			selectPayee();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				mobileAction.FuncClick(amount, "Amount button clicked");
				Thread.sleep(10000);
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncClickDone();

				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				// mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(confirmationText, "Thank You!");
				mobileAction.verifyElementIsDisplayed(confirmation_val, "Confirmation Value");

			}

			else {
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				String PaybillDate = mobileAction.getText(currDate);
				// boolean validateDate=!PaybillDate.isEmpty();//
				// String dateValue=validateDate?"Same":"Not Same";
				// mobileAction.verifyTextEquality(dateValue, "Same");
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitForElementToVanish(progressBar);
				Thread.sleep(2000);
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.verifyElement(confirmationText, txtconfirmationText);
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
	 * This method will verify the current Balance button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             If there is problem while reporting.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyCurrentBalance() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(currBal, "Current Balance");
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

	public void pay_bill() {
		Decorator();
		try {
			String payeeAccount = getTestdataOtherSheet("FromAccount", "Payment");
			// String account_value = "//*[contains(@label,'" + from_account +
			// "')]";
			String account_value = getTestdata("Payee");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				mobileAction.FuncClick(from_account, "From_Account");
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
				Thread.sleep(3000);
				mobileAction.FuncClick(amount, "Amount button clicked");
				String Amount = getTestdata("Amount");
				mobileAction.FuncSendKeys(amount, Amount);
				mobileAction.FuncClickDone();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				Thread.sleep(3000);
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(confirmationText, "Thank You!");
				mobileAction.verifyElementIsDisplayed(confirmation_val, "Confirmation Value");

				String conf_val = mobileAction.getText(confirmation_val);
				String[] confmVal = conf_val.split(":");

				CL.getTestDataInstance().TCParameters.put("confirmation_val", confmVal[1].trim());
				// String Balance = mobileAction.getText(from_account);

			}

			else {
				String ToPostAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/txtPayee' and @text='"
						+ payeeAccount + "']";
				mobileAction.FuncClick(to_account_post, "Select Payee");
				mobileAction.FuncElementSwipeWhileNotFound(ListViewToAccount, ToPostAccountXpath, 1, "up", true);
				mobileAction.waitForElementToDisappear(t_select_to_account);
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.verifyElement(confirmationText, txtconfirmationText);

				String conf_val = mobileAction.getText(confirmation_val);
				CL.getTestDataInstance().TCParameters.put("confirmation_val", conf_val);
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

	public void verifyPayWithRewards() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
			Thread.sleep(2000);
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(from_account, "From account");

			String accountXL = "//*[contains(@text,'" + CL.getTestDataInstance().getPrimaryAccount()
					+ "') or contains(@label,'" + CL.getTestDataInstance().getPrimaryAccount() + "') ]";

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(accountXL, true, 10, "up");
			// mobileAction.FuncClick(select_payee,"Selectpayee");
			String payeeXL = "//*[contains(@text,'" + CL.getTestDataInstance().getPrimaryCreditCard()
					+ "') or contains(@label,'" + CL.getTestDataInstance().getPrimaryCreditCard() + "') ]";
			System.out.println(payeeXL);

			mobileAction.FuncClick(payeeValue, "Payee");
			CL.GetDriver().findElement(By.xpath(payeeXL)).click();

			// CL.GetDriver().findElement(By.xpath(payeeXL)).click();
			CL.GetReporting().FuncReport("Pass", "<b>" + payeeXL + "</b> is Clicked.");

			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(txtPaywithRewards, "Pay With Rewards ");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

}
