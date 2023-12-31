package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

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

	@iOSXCUITFindBy(xpath = "//*[@label='Amount' or @label='Montant' or @label='金额' or @label='金額']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' or (@resource-id='com.td:id/edtAmt' and @index='1')]")
	private MobileElement amount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[ @text='Pay Bills']")
	private MobileElement pay_bills;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label, 'Invalid transaction amount')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text' and contains(@text,'Invalid transaction amount')]")
	private MobileElement verify_msg;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/../XCUIElementTypeOther[1]//XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' or @resource-id='com.td:id/continue_button']")
	private MobileElement continue_pay;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Pay Bill']")
	private MobileElement pay_bill;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeSegmentedControl[1]/XCUIElementTypeButton[3]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'com.td:id/buttonPayFullAmt']")
	private MobileElement currBal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_val;

	// @AndroidFindBy(xpath =
	// "//android.widget.ImageView[@resource-id='android:id/up']")
	// private MobileElement menu;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText | //XCUIElementTypeNavigationBar/XCUIElementTypeOther")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement payBill_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title'and @text='My Accounts']")
	private MobileElement my_accounts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/accntDescrSum' and @text='PREFERRED CHEQUING ACCOUNT']")
	private MobileElement verify_from_account;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@text='' and @index='0']//android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement last_transaction;

	// @iOSFindBy(xpath = "//*[@label='Done' or @label='完成']")
	// private MobileElement done;

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

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/amountLabel' and @text='Amount']")
	private MobileElement amountHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Date']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/lblDate' and @text='Date']")
	private MobileElement date;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation # :' and @resource-id='com.td:id/confirmation']")
	private MobileElement confirmation_text;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='PAYBILL_VIEW_PAYEE' or @label='Select Payee']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee' or (@resource-id='com.td:id/selectedText' and @text='Select Payee')]")
	private MobileElement select_payee;

	@AndroidFindBy(xpath = "//android.widget.TextView[(@resource-id='com.td:id/navText' or @resource-id='com.td:id/textview_flyout_menu_item') and @text='Home']")
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

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
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

	@iOSFindBy(accessibility = "NAVIGATION_ITEM_QUICK_ACCESS")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/dashboard_scroll_view' or @resource-id='com.td:id/toolbar_dashboard']")
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

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Select from account'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Select From Account']")
	private MobileElement from_account_dropdown;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtDescriptionValue']")
	private List<MobileElement> from_account_dropdown_list;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='From Account'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and @text='From Account']")
	private MobileElement from_account_caption;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Payee'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and @text='Payee']")
	private MobileElement payee_caption;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Select Payee'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Select Payee']")
	private MobileElement payee_dropdown;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='Amount'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/captionTextView' and @text='Amount']")
	private MobileElement amount_caption;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label=='How Often' OR label=='Type de paiement' OR label='次数' OR label='次數'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and (@text='How Often' or @text='Type de paiement' or @text='次数' or @text='次數')]")
	private MobileElement howOften;

	// @iOSXCUITFindBy(iOSClassChain =
	// "**/XCUIElementTypeStaticText[`label=='How Often' OR label=='Type de
	// paiement' OR label='次数' OR label='次數'`]")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption'
	// and (@text='How Often' or @text='Type de Paiement' or @text='次数' or
	// @text='次數')]")
	// private MobileElement howOften;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable//XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/dialog_title']")
	private MobileElement howOften_dropdown_title;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable//XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/dialog_button']")
	private MobileElement howOften_dropdown_cancel_button;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable//XCUIElementTypeStaticText[@label='Once' or @label='Unique' or @label='一次']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Once' or @text='Unique' or @text='一次']")
	private MobileElement howOften_dropdown_once_option;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue']")
	private List<MobileElement> howOften_dropdown_option_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Start Date' or @label='Date de début' or @label='起始日期' or @label='開始日期' or @label='End Date' or @label='Date de fin' or @label='结束日期' or @label='結束日期']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/date_Label']")
	private List<MobileElement> start_end_Date_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Start Date' or @label='Date de début' or @label='起始日期' or @label='開始日期' or @label='End Date' or @label='Date de fin' or @label='结束日期' or @label='結束日期']/../XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/dateText']")
	private List<MobileElement> dateText_List;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label='Frequency' OR label='Fréquence' OR label='频次' OR label='頻次'`]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/orderDropdownCaption' and (@text='Frequency' or @text='Fréquence' or @text='频次' or @text='頻次')]")
	private MobileElement frequency;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.RadioGroup[@resource-id='com.td:id/radioGroup']/android.widget.RadioButton")
	private List<MobileElement> payment_end_list;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView//android.widget.TextView[@index='0']")
	private List<MobileElement> paybill_caption_list;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private List<MobileElement> paybill_placeHolder_list;

	// @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label='On a
	// specific date'`]")
	// private MobileElement on_a_specific_date;
	//
	// @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label='After a
	// number of payments'`]")
	// private MobileElement after_a_number_of_payments;
	//
	// @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label='When I
	// decide to cancel'`]")
	// private MobileElement when_I_decide_to_cancel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='actionsheet_checkmark']/../XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/imgActionCheckMark']/../android.widget.TextView")
	private MobileElement checked_howoften_selection;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText']")
	private List<MobileElement> prefilled_text_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedSubText']")
	private List<MobileElement> prefilled_digit_List;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[4]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/footer_text']")
	private MobileElement footer_text;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/background_view']/android.widget.LinearLayout/android.widget.TextView[@index='0']")
	private MobileElement rewards_banner;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/background_view']/android.widget.LinearLayout/android.widget.TextView[@index='1']")
	private MobileElement rewards_content;

	String[] paymentOption = { getTextInCurrentLocale(StringArray.ARRAY_RBP_SPECIFIC_DATE),
			getTextInCurrentLocale(StringArray.ARRAY_RBP_AFTER_NEMBER_PAYMENT),
			getTextInCurrentLocale(StringArray.ARRAY_RBP_DECIDE_CANCEL) };

	MobileElement[] Payment_End_Item = { null, null, null };
	MobileElement[] Date_text_Item = { null, null };

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Number of Payments' or @label='Nombre de paiements' or @label='付款次数' or @label='付款次數']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Number of Payments' or @text='Nombre de paiements' or @text='付款次数' or @text='付款次數']/..//android.widget.EditText")
	private MobileElement numer_of_payment;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/following-sibling::XCUIElementTypeOther[1]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement rbp_error_message;

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

	private void init_Add_Canadian_Payee() {
		try {
			String addCanadianPayeetext = getTextInCurrentLocale(StringArray.ARRAY_ADD_CANADIAN_PAYEE);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				addCanadianPayee = mobileAction.verifyElementUsingXPath("//*[@label='" + addCanadianPayeetext + "']",
						"Add Canadian Payee");

			} else {
				addCanadianPayee = mobileAction
						.verifyElementUsingXPath("//android.widget.Button[contains(@content-desc,'"
								+ addCanadianPayeetext + "')] | //android.widget.TextView[contains(@content-desc,'"
								+ addCanadianPayeetext + "')]", "Add Canadian Payee");
			}
		} catch (Exception e) {

		}
	}

	private void init_Payment_End_Item() {
		mobileAction.FuncSwipeOnce("up");
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				Payment_End_Item[0] = mobileAction.verifyElementUsingXPath("//XCUIElementTypeButton[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RBP_SPECIFIC_DATE) + "']", "On a specific date ");

				Payment_End_Item[1] = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='"
								+ getTextInCurrentLocale(StringArray.ARRAY_RBP_AFTER_NEMBER_PAYMENT) + "']",
						"After a number of payments");

				Payment_End_Item[2] = mobileAction
						.verifyElementUsingXPath(
								"//XCUIElementTypeButton[@label='"
										+ getTextInCurrentLocale(StringArray.ARRAY_RBP_DECIDE_CANCEL) + "']",
								"When I decide to cancel");
			} else {
				Payment_End_Item[0] = payment_end_list.get(0);
				Payment_End_Item[1] = payment_end_list.get(1);
				Payment_End_Item[2] = payment_end_list.get(2);
			}
		} catch (Exception e) {

		}
	}

	private void init_dateText_Item(int index) {
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				if (index == 0) {
					Date_text_Item[0] = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
							+ getTextInCurrentLocale(StringArray.ARRAY_RBP_START_DATE)
							+ "']/following-sibling::XCUIElementTypeStaticText | //XCUIElementTypeStaticText[@label='"
							+ getTextInCurrentLocale(StringArray.ARRAY_RBP_START_DATE)
							+ "']/preceding-sibling::XCUIElementTypeStaticText", "Start date content ");
					return;
				}
				Date_text_Item[0] = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RBP_START_DATE)
						+ "']/following-sibling::XCUIElementTypeStaticText | //XCUIElementTypeStaticText[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RBP_START_DATE)
						+ "']/preceding-sibling::XCUIElementTypeStaticText", "Start date content ");

				Date_text_Item[1] = mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RBP_END_DATE)
						+ "']/following-sibling::XCUIElementTypeStaticText | //XCUIElementTypeStaticText[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RBP_END_DATE)
						+ "']/preceding-sibling::XCUIElementTypeStaticText", "END date content ");

			}
		} catch (Exception e) {

		}
	}

	private String selectPayee() {

		String defaultPayeeXpath = "";
		boolean isPayeePrefilled = false;
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			defaultPayeeXpath = "//XCUIElementTypeStaticText[@label='"
					+ getTextInCurrentLocale(StringArray.ARRAY_PAYBILL_DEFAULT[0]) + "']";
		} else {
			defaultPayeeXpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='"
					+ getTextInCurrentLocale(StringArray.ARRAY_PAYBILL_DEFAULT[0]) + "']";
		}
		try {
			select_payee = (MobileElement) CL.GetAppiumDriver().findElement(By.xpath(defaultPayeeXpath));
		} catch (Exception e) {
			isPayeePrefilled = true;
		}

		String payeeAccount = getTestdata("Payee");
		System.out.println("Payee account:" + payeeAccount);
		String payeeNumber = "";
		if (payeeAccount.matches(".*\\d+RP\\d+")) {
			payeeNumber = mobileAction.FuncGetValByRegx(payeeAccount, "\\d+RP\\d+");
		} else if (payeeAccount.matches(".*\\d+")) {
			payeeNumber = mobileAction.FuncGetValByRegx(payeeAccount, "\\d+");
		}
		String payeeName = payeeAccount.replaceAll(payeeNumber, "").trim();
		if (payeeName.contains("|")) {
			if (currentLocale.equalsIgnoreCase("fr")) {
				payeeName = payeeName.split("\\|")[1].trim();
			} else {
				payeeName = payeeName.split("\\|")[0].trim();
			}
		}
		System.out.println("Payee name:" + payeeName);
		try {
			if (isPayeePrefilled) {
				System.out.println("Payee is prefilled");
				return payeeName;
			}

			mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
			// select payee
			mobileAction.FuncClick(select_payee, "Select Payee");
			String payeeAccountxpath;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				payeeAccountxpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//*[contains(@label, '"
						+ payeeName + "')]";
			} else {
				payeeAccountxpath = "//android.widget.TextView[contains(@text,'" + payeeName + "')]";
			}
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(payeeAccountxpath, true, 10, "up");
			return payeeName;
		} catch (Exception e) {
			System.out.println("Failed to select payee:" + payeeAccount);
			return "";
		}

	}

	private String fillAmount() {
		// Fill amount
		String amount_num = getTestdata("Amount");
		try {
			String defaultAmount = mobileAction.getValue(amount);
			System.out.println("defaultAmount:" + defaultAmount);
			// if (!defaultAmount.equals("$0.00") && !defaultAmount.equals("0,00
			// $") && !defaultAmount.contains("Amount")
			// && !defaultAmount.contains("Montant")) {
			// System.out.println("Amount is prefilled");
			// return defaultAmount;
			// }
			mobileAction.FuncClick(amount, "Amount button clicked");
			amount.clear();
			amount.sendKeys(amount_num);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}
			return amount_num;
		} catch (Exception e) {
			System.out.println("Failed to fill amount:" + amount_num);
			return "";
		}
	}

	private String selectFromAccount() {

		String defaultFromAccountXpath = "";
		boolean isFromAccountPrefilled = false;
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			defaultFromAccountXpath = "//XCUIElementTypeStaticText[@label='"
					+ getTextInCurrentLocale(StringArray.ARRAY_PAYBILL_DEFAULT[1]) + "']";
		} else {
			defaultFromAccountXpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='"
					+ getTextInCurrentLocale(StringArray.ARRAY_PAYBILL_DEFAULT[1]) + "']";
		}
		try {
			from_account_dropdown = (MobileElement) CL.GetAppiumDriver().findElement(By.xpath(defaultFromAccountXpath));
		} catch (Exception e) {
			isFromAccountPrefilled = true;
		}

		// select from account
		String from_Account = getTestdata("FromAccount");
		// in case from account include account name
		if (isFromAccountPrefilled && !from_Account.matches(".*\\d+")) {
			System.out.println("From account is re-used. must be prefilled");
			return from_Account;
		} else if (!isFromAccountPrefilled && !from_Account.matches(".*\\d+")) {
			// randomly select the first one from account
			try {
				mobileAction.FuncClick(from_account_dropdown, "From Account clicked");
				from_Account = mobileAction.getValue(from_account_dropdown_list.get(0));
				mobileAction.FuncClick(from_account_dropdown_list.get(0), "First From Account");
				if (from_Account.matches(".*\\d+")) {
					String AccountNum = mobileAction.FuncGetValByRegx(from_Account, "\\d+");
					String accountName = from_Account.replaceAll(AccountNum, "").trim();
					return accountName;
				} else {
					return from_Account;
				}
			} catch (Exception e) {
				System.out.println("Failed to select first from account");
				return "";
			}

		}
		String AccountNum = mobileAction.FuncGetValByRegx(from_Account, "\\d+");

		String accountName = from_Account.replaceAll(AccountNum, "").trim();

		if (accountName.contains("\\|")) {
			String[] s_AccountName = accountName.split("\\|");
			if (currentLocale.equalsIgnoreCase("fr")) {
				accountName = s_AccountName[1];
			} else {
				accountName = s_AccountName[0];
			}
		}

		try {
			if (!isFromAccountPrefilled) {

				mobileAction.FuncClick(from_account_dropdown, "From Account clicked");
				String fromAccountxPath = "";
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					fromAccountxPath = "//XCUIElementTypeStaticText[contains(@label,'" + AccountNum + "')]";
				} else {
					fromAccountxPath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNoValue' and @text='"
							+ AccountNum + "']";
				}
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(fromAccountxPath, true, 10, "up");
				if (!accountName.isEmpty()) {
					return accountName;
				} else {
					return AccountNum;
				}

			} else {
				System.out.println("From Account is prefilled");
				return accountName;
			}
		} catch (Exception e) {
			System.out.println("Failed to select account:" + from_Account);
			return "";
		}
	}

	public void verifyPayBillHeader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(payBill_Header,
					getTextInCurrentLocale(StringArray.ARRAY_PAY_CANDIAN_BILL_TITLE));
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void pay_candadian_bill() {

		try {
			Decorator();
			selectPayee();
			fillAmount();
			selectFromAccount();

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(pay_bill, "Pay Bill");
				mobileAction.waitProgressBarVanish();
				mobileAction.verifyElementIsDisplayed(confirmationText, "Thank You!");
				mobileAction.verifyElementIsDisplayed(confirmation_val, "Confirmation Value");

				String conf_val = mobileAction.getText(confirmation_val);
				String[] confmVal = conf_val.split(":");

				CL.getTestDataInstance().TCParameters.put("confirmation_val", confmVal[1].trim());

			}

			else {

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
	 * This method will verify both First and Second Access cards having Payee and
	 * accounts details.
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
			mobileAction.waitProgressBarVanish();
			Thread.sleep(5000);
			mobileAction.FuncClick(search_bar, "SearchforCanadianPayees");
			String search_bar_value = getTestdata("Search");
			System.out.println("search_bar_value:" + search_bar_value);

			mobileAction.FuncSendKeys(search_bar, search_bar_value);

			mobileAction.waitProgressBarVanish();

			String merchant_value = getTestdata("MerchantName");
			String merchant_name_value = merchant_name + merchant_value + "')]";
			CL.GetDriver().findElement(By.xpath(merchant_name_value)).click();
			Thread.sleep(5000);

			mobileAction.waitProgressBarVanish();

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
			mobileAction.waitProgressBarVanish();
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
			init_Add_Canadian_Payee();
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
				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(bills_header, "Bills");
				mobileAction.ClickBackButton();
				mobileAction.verifyElementIsDisplayed(home, "Home");

			}

			else {
				mobileAction.verifyElementIsDisplayed(payBill_Header, "Pay Bill");
				selectPayee();
				mobileAction.FuncClick(amount, "Amount button clicked");
				mobileAction.FuncSendKeys(amount, getTestdata("Amount"));
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(continue_pay, "Continue_pay");
				mobileAction.waitProgressBarVanish();
				mobileAction.FuncClick(cancelBtn, "Cancel");
				mobileAction.verifyElementIsDisplayed(bills_header, "Bills");
				mobileAction.clickMenuButton();
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
			mobileAction.waitProgressBarVanish();
			Thread.sleep(2000);
			mobileAction.FuncClick(pay_bill, "Pay Bill");
			mobileAction.waitProgressBarVanish();
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
				mobileAction.waitProgressBarVanish();
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
				mobileAction.waitProgressBarVanish();
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
				mobileAction.waitProgressBarVanish();
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
			mobileAction.waitProgressBarVanish();
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

			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(txtPaywithRewards, "Pay With Rewards ");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void clickStartDate() {
		Decorator();
		try {
			mobileAction.FuncClick(start_end_Date_List.get(0), "Start Date");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyPayCanadianBillContent() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(payBill_Header,
					getTextInCurrentLocale(StringArray.ARRAY_PAY_CANDIAN_BILL_TITLE));

			// verify howoften dropdown
			mobileAction.FuncClick(howOften, "How Often");
			String expectedHowOften = (getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN)).toUpperCase();
			String expectedCancelButton = getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYEE_FILTER_CANCEL_BUTTON);

			mobileAction.verifyElementTextIsDisplayed(howOften_dropdown_title, expectedHowOften);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if (mobileAction.verifyElementIsPresent(howOften_dropdown_cancel_button)) {
					mobileAction.verifyElementTextIsDisplayed(howOften_dropdown_cancel_button,
							expectedCancelButton.toUpperCase());
				}

			} else {
				mobileAction.verifyElementTextIsDisplayed(howOften_dropdown_cancel_button, expectedCancelButton);
			}

			String[] expectedOption = { getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONCE),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONGOING) };
			for (int i = 0; i < howOften_dropdown_option_List.size(); i++) {
				mobileAction.verifyElementTextIsDisplayed(howOften_dropdown_option_List.get(i), expectedOption[i]);
			}
			// for iPad, there is no Cancel Button
			mobileAction.FuncClick(howOften_dropdown_once_option, "Once");

			String[] expectedCaption = { getTextInCurrentLocale(StringArray.ARRAY_RBP_ACESS_CARD),
					getTextInCurrentLocale(StringArray.ARRAY_PAYEE_CAPTION),
					getTextInCurrentLocale(StringArray.ARRAY_MF_AMOUNT),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_FROM_ACCOUNT),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_START_DATE),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY),
					getTextInCurrentLocale(StringArray.ARRAY_RBP_PAYMENT_END), };
			selectOngoingFromHowOftenDropDown();

			// verify default text
			int defaultSize = StringArray.ARRAY_PAYBILL_DEFAULT.length;
			for (int i = 0; i < defaultSize; i++) {
				if (i == 3) {
					mobileAction.FuncSwipeOnce("up");
				}
				String defaultText = getTextInCurrentLocale(StringArray.ARRAY_PAYBILL_DEFAULT[i]);
				String xpath = "";
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					xpath = "//XCUIElementTypeStaticText[@label='" + defaultText + "']";
				} else {
					xpath = "//android.widget.TextView[@text='" + defaultText + "']";
				}
				try {
					CL.GetAppiumDriver().findElement(By.xpath(xpath));
					mobileAction.Report_Pass_Verified(defaultText);
				} catch (Exception e1) {
					mobileAction.Report_Fail("Failed to find:" + defaultText);
				}
			}
			// swipe to the top again
			mobileAction.FuncSwipeOnce("down");

			int expectedSize = expectedCaption.length;
			boolean isAccessFound = false;
			String thefirstCaption = mobileAction.getValue(paybill_caption_list.get(0));
			if (thefirstCaption.equals(expectedCaption[0])) {
				isAccessFound = true;
			} else {
				expectedSize = expectedSize - 1; // no access card displayed
			}
			String xpath = "";
			if (!isAccessFound) {
				for (int i = 0; i < expectedSize; i++) {
					if (i == 5) {
						mobileAction.FuncSwipeOnce("up");
					}
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						xpath = "//XCUIElementTypeStaticText[@label='" + expectedCaption[i + 1] + "']";
						// mobileAction.verifyElementUsingXPath(xpath,
						// expectedCaption[i + 1]);
					} else {
						xpath = "//android.widget.TextView[@text='" + expectedCaption[i + 1] + "']";
						// mobileAction.verifyElementTextIsDisplayed(paybill_caption_list.get(i),
						// expectedCaption[i + 1]);
					}
					mobileAction.verifyElementUsingXPath(xpath, expectedCaption[i + 1]);

				}
			} else {
				for (int i = 0; i < expectedSize; i++) {
					if (i == 5) {
						mobileAction.FuncSwipeOnce("up");
					}
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						xpath = "//XCUIElementTypeStaticText[@label='" + expectedCaption[i] + "']";
						// mobileAction.verifyElementUsingXPath(xpath,
						// expectedCaption[i]);
					} else {
						xpath = "//android.widget.TextView[@text='" + expectedCaption[i] + "']";
						// mobileAction.verifyElementTextIsDisplayed(paybill_caption_list.get(i),
						// expectedCaption[i]);
					}
					mobileAction.verifyElementUsingXPath(xpath, expectedCaption[i]);
				}

			}

			init_Payment_End_Item();

			if (!mobileAction.verifyElementIsPresent(payment_end_list.get(0))) {
				mobileAction.FuncSwipeWhileElementNotFound(payment_end_list.get(0), false, 3, "up");
			}

			mobileAction.verifyElementTextIsDisplayed(Payment_End_Item[0],
					getTextInCurrentLocale(StringArray.ARRAY_RBP_SPECIFIC_DATE));
			mobileAction.verifyElementTextIsDisplayed(Payment_End_Item[1],
					getTextInCurrentLocale(StringArray.ARRAY_RBP_AFTER_NEMBER_PAYMENT));
			mobileAction.verifyElementTextIsDisplayed(Payment_End_Item[2],
					getTextInCurrentLocale(StringArray.ARRAY_RBP_DECIDE_CANCEL));

			mobileAction.verifyElementTextIsDisplayed(continue_pay,
					getTextInCurrentLocale(StringArray.ARRAY_RBP_CONTINUE_BUTTON));
			// verify continue button

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyHowOftenDropdownDefault() {
		Decorator();
		try {
			mobileAction.FuncClick(howOften, "How Often");
			if (mobileAction.verifyElementIsPresent(checked_howoften_selection)) {
				mobileAction.verifyElementTextIsDisplayed(checked_howoften_selection,
						getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONCE));
			} else {
				mobileAction.Report_Fail("Failed to find checked howoften selection");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyStartDateDefaultToToday() {
		Decorator();
		try {
			LocalDate localDate = LocalDate.now();
			String currentDate = DateTimeFormatter.ofPattern("MMM dd, yyyy").format(localDate);
			currentDate = currentDate.replace(" 0", " ");
			System.out.println("Today is:" + currentDate);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='" + currentDate + "']",
						"Default Start Date");
			} else {
				if (mobileAction.verifyElementIsPresent(dateText_List.get(0))) {
					mobileAction.verifyElementTextIsDisplayed(dateText_List.get(0), currentDate);
				} else {
					mobileAction.Report_Fail("Failed to default Start Date");
				}
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void selectOngoingFromHowOftenDropDown() {
		Decorator();
		try {
			mobileAction.FuncClick(howOften, "How Often");
			// select ongoing
			String ongoingXpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				ongoingXpath = "//XCUIElementTypeStaticText[@label='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONGOING) + "']";
			} else {
				ongoingXpath = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
						+ getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONGOING) + "']";
			}
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(ongoingXpath, true, 5, "up");

		} catch (Exception e) {
			System.err.println("TestCase has failed to selectOngoingFromHowOftenDropDown.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyFieldsArePrefilledAfterBackFromAddPayee() {
		Decorator();
		try {
			String payeeText = selectPayee();
			String amount_num = fillAmount();
			String from_Account = selectFromAccount();

			if (payeeText.isEmpty() || amount_num.isEmpty() || from_Account.isEmpty()) {
				mobileAction.Report_Fail("Failed to fill pay bill");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}

			// clicking add payee button
			init_Add_Canadian_Payee();
			mobileAction.FuncClick(addCanadianPayee, "Add Payee button clicked");
			mobileAction.waitProgressBarVanish();
			mobileAction.ClickBackButton();

			// verify prefilled text

			String capturedPayee = mobileAction.getValue(prefilled_text_List.get(0));
			// String capturedPayee_num =
			// mobileAction.getValue(prefilled_digit_List.get(0));
			if (payeeText.contains(capturedPayee)) {
				mobileAction.Report_Pass_Verified(payeeText);
			} else {
				mobileAction.Report_Fail(payeeText + " is not prefilled");
			}

			String capturedAmount = mobileAction.getValue(amount);
			if(currentLocale.equalsIgnoreCase("fr")) {
				capturedAmount = capturedAmount.replace(",", ".");
			}		
			if (capturedAmount.contains(amount_num)) {
				mobileAction.Report_Pass_Verified(capturedAmount);
			} else {
				mobileAction.Report_Fail(amount_num + " is not prefilled");
			}
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String accountPath = "//XCUIElementTypeStaticText[@label='" + from_Account + "']";
				mobileAction.verifyElementUsingXPath(accountPath, "From Account");
			} else {
				mobileAction.verifyElementTextIsDisplayed(prefilled_text_List.get(1), from_Account);
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyFrequencyOptions() {
		Decorator();
		try {
			selectOngoingFromHowOftenDropDown();

			if (mobileAction.verifyElementIsPresent(frequency)) {

				mobileAction.FuncClick(frequency, "Frequency");
				int frequencySize = StringArray.ARRAY_RBP_FREQUENCY_OPTION.length;
				System.out.println("Number of frequency option:" + frequencySize);
				String optionXpath = "";
				for (int i = 0; i < frequencySize; i++) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
						optionXpath = "//XCUIElementTypeStaticText[@label='"
								+ getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY_OPTION[i]) + "']";
					} else {
						optionXpath = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
								+ getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY_OPTION[i]) + "']";
					}
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(optionXpath, false, 5, "up");
				}

			} else {
				mobileAction.Report_Fail("Frequency is not present");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyRBPFootNoteContent() {
		Decorator();
		try {
			selectOngoingFromHowOftenDropDown();

			init_Payment_End_Item();
			if (mobileAction.verifyElementIsPresent(Payment_End_Item[0])) {

				mobileAction.FuncClick(Payment_End_Item[0], "'On a specific date' is clicked");
				mobileAction.verifyElementTextIsDisplayed(footer_text,
						getTextInCurrentLocale(StringArray.ARRAY_RBP_ON_SPECIFIC_DATE_FOOTNOTE));

			} else {
				mobileAction.Report_Fail("'On a specific date' is not present");
			}

			init_Payment_End_Item();
			if (mobileAction.verifyElementIsPresent(Payment_End_Item[2])) {

				mobileAction.FuncClick(Payment_End_Item[2], "'When I decide to cancel' is clicked");
				mobileAction.verifyElementTextIsDisplayed(footer_text,
						getTextInCurrentLocale(StringArray.ARRAY_RBP_DECIDE_TO_CANCEL_FOOTNOTE));

			} else {
				mobileAction.Report_Fail("'When I decide to cancel' is not present");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyAndClickRewardBanner() {
		Decorator();
		try {
			selectPayee();
			//
			if (mobileAction.verifyElementIsPresent(rewards_banner)) {
				mobileAction.FuncClick(rewards_banner, "Pay With Rewards clicked");
				mobileAction.waitProgressBarVanish();
			} else {
				mobileAction.Report_Fail("Rewards banner is not present");
			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyRewardsContent() {
		Decorator();
		try {
			selectPayee();
			//
			if (mobileAction.verifyElementIsPresent(rewards_banner)) {
				mobileAction.verifyElementTextIsDisplayed(rewards_content,
						getTextInCurrentLocale(StringArray.ARRAY_RBP_REWARDS_CONTENT));
			} else {
				mobileAction.Report_Fail("Rewards banner is not present");
			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private String getFrequencymapping(String freqencyInDataSheet) {
		// freqencyInDataSheet : fre-0, ... frq-5
		if (!freqencyInDataSheet.matches("fre\\-\\d{1}")) {
			System.out.println("Frequency format is wrong...:" + freqencyInDataSheet);
			return "";
		}
		int index = Integer.parseInt(freqencyInDataSheet.substring(4, 5));
		if (index > 6) {
			index = index % 6;
		}
		String realFreq = "";
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			realFreq = getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY_OPTION[index]);
		} else {
			realFreq = getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY_OPTION[index]);
		}
		System.out.println("Frequency mapping:" + realFreq);
		return realFreq;
	}

	public void FillPayBillWithOnce() {
		Decorator();
		String payeeText = selectPayee();
		String amount_num = fillAmount();
		String from_Account = selectFromAccount();

		// Save how often in "Price"
		CL.getTestDataInstance().TCParameters.put("Price", getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONCE));

		// Save start date in "Timeout"
		try {
			String startDate_text = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				init_dateText_Item(0);
				startDate_text = mobileAction.getValue(Date_text_Item[0]);
			} else {
				startDate_text = mobileAction.getValue(dateText_List.get(0));
			}

			System.out.println("Start Date:" + startDate_text);
			CL.getTestDataInstance().TCParameters.put("Timeout", startDate_text);
		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to get 'start date'");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		if (payeeText.isEmpty() || amount_num.isEmpty() || from_Account.isEmpty()) {
			mobileAction.Report_Fail("Failed to fill pay bill");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		} else {
			CL.getTestDataInstance().TCParameters.put("Payee", payeeText);
			CL.getTestDataInstance().TCParameters.put("Amount", amount_num);
			CL.getTestDataInstance().TCParameters.put("FromAccount", from_Account);
			mobileAction.Report_Pass_Verified("Pay bill is filled");
		}
	}

	public void continuePayBill() {
		Decorator();
		try {
			mobileAction.FuncClick(continue_pay, "Continue_pay");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void selectFrequency(String frequencyOption) {
		try {
			mobileAction.FuncClick(frequency, "Frequency");

			String optionXpath = "";

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				optionXpath = "//XCUIElementTypeStaticText[@label='" + frequencyOption + "']";
			} else {
				optionXpath = "//android.widget.TextView[@resource-id='com.td:id/txtItemValue' and @text='"
						+ frequencyOption + "']";
			}
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(optionXpath, true, 5, "up");

		} catch (Exception e) {

		}
	}

	private String randomSelectFrequency() {
		int frequencySize = StringArray.ARRAY_RBP_FREQUENCY_OPTION.length;
		int randFund = getRandomInRange(0, frequencySize - 1);
		String freqOption = "";

		freqOption = getTextInCurrentLocale(StringArray.ARRAY_RBP_FREQUENCY_OPTION[randFund]);

		System.out.println("Selected frequency: " + freqOption);
		selectFrequency(freqOption);
		return freqOption;
	}

	public void FillPayBillWithOngoingRandomly(boolean noStartDateSelected) {
		Decorator();
		String payeeText = selectPayee();
		String amount_num = fillAmount();
		String from_Account = selectFromAccount();

		if (payeeText.isEmpty() || amount_num.isEmpty() || from_Account.isEmpty()) {
			mobileAction.Report_Fail("Failed to fill pay bill");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		CL.getTestDataInstance().TCParameters.put("Payee", payeeText);
		CL.getTestDataInstance().TCParameters.put("Amount", amount_num);
		CL.getTestDataInstance().TCParameters.put("FromAccount", from_Account);

		selectOngoingFromHowOftenDropDown();
		init_Payment_End_Item();
		// Save how often in "Price"
		CL.getTestDataInstance().TCParameters.put("Price",
				getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONGOING));

		// get current date
		LocalDate localDate = LocalDate.now();
		String currentDate = DateTimeFormatter.ofPattern("MMM dd, yyyy").format(localDate);
		currentDate = currentDate.replace(" 0", " ");
		currentDate = currentDate.replace(",", "");
		System.out.println("Today is:" + currentDate);
		String[] todayStr = currentDate.split(" ");
		String yearOfDay = todayStr[2];
		String monthOfDay = todayStr[0];
		String dayOfDay = todayStr[1];

		if (!noStartDateSelected) {

			String startdate_input = CL.getTestDataInstance().TCParameters.get("Timeout");
			String startDate_day = "";
			if (startdate_input != null && startdate_input.equals("Holiday")) {
				startDate_day = MyCalendar.get().selectTodaysFollowingHoliday();
			} else {
				startDate_day = MyCalendar.get().selectTodaysFollowingWorkDay();
			}

			System.out.println("Today's following working day:" + startDate_day);
			try {
				mobileAction.FuncClick(start_end_Date_List.get(0), "Start Date");
			} catch (Exception e) {
				mobileAction.Report_Fail("Failed to click 'Start Date'");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
			String[] startDate_day_Array = startDate_day.replace(",", "").split(" ");
			yearOfDay = startDate_day_Array[2];
			monthOfDay = startDate_day_Array[0];
			dayOfDay = startDate_day_Array[1];

			// Save start date in "Timeout"
			CL.getTestDataInstance().TCParameters.put("Timeout", monthOfDay + " " + dayOfDay + ", " + yearOfDay);
			MyCalendar.get().selectDate(yearOfDay, monthOfDay, dayOfDay);
		}
		String freq = randomSelectFrequency();
		CL.getTestDataInstance().TCParameters.put("MerchantName", freq);

		init_Payment_End_Item();
		// RandomSelect on option of "Payment will end"
		int paymentSize = payment_end_list.size();
		System.out.println("Payment size:" + paymentSize);
		int randFund = getRandomInRange(0, paymentSize - 1);
		System.out.println("Payment Will End is selected:" + paymentOption[randFund]);
		try {
			mobileAction.FuncClick(Payment_End_Item[randFund], paymentOption[randFund]);
		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to click '" + paymentOption[randFund] + "'");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		try {
			switch (randFund) {
			case 0:
				mobileAction.FuncClick(start_end_Date_List.get(1), "End Date");
				String endDate_day = MyCalendar.get().selectRandomDayInXmonthLater(yearOfDay, monthOfDay, dayOfDay, 4);
				System.out.println("Random working day:" + endDate_day);
				String[] endDate_day_Array = endDate_day.replaceAll(",", "").split(" ");
				yearOfDay = endDate_day_Array[2];
				monthOfDay = endDate_day_Array[0];
				dayOfDay = endDate_day_Array[1];
				MyCalendar.get().selectDate(yearOfDay, monthOfDay, dayOfDay);
				CL.getTestDataInstance().TCParameters.put("SecondTimeout",
						monthOfDay + " " + dayOfDay + ", " + yearOfDay);
				break;
			case 1:
				mobileAction.FuncSwipeWhileElementNotFound(numer_of_payment, true, 3, "up");
				numer_of_payment.clear();
				String numpayments = "4";
				numer_of_payment.sendKeys(numpayments);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClickDone();
				} else {
					mobileAction.FuncHideKeyboard();
				}
				CL.getTestDataInstance().TCParameters.put("SecondTimeout", numpayments);
				// workaround: click start date to get Continue button
				// highlighted
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
					try {
						mobileAction.FuncClick(start_end_Date_List.get(0), "Start Date");
						MyCalendar.get().clickCalendarCancel();
					} catch (Exception e) {

					}
				}
				break;
			case 2:

				break;
			}

		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to click 'End Date'");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		mobileAction.Report_Pass_Verified("Pay bill is filled");

	}

	private void selectStartDate() {
		String startDate_day = getTestdata("Timeout");

		if (startDate_day == null || startDate_day.isEmpty()) {
			System.out.println("Start Date is not configured in data sheet");
			mobileAction.Report_Fail("'Start Date' is not configured in data sheet");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		try {
			mobileAction.FuncClick(start_end_Date_List.get(0), "Start Date");
		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to click 'Start Date'");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		String startDateDay = "";
		if (startDate_day.equals("Holiday")) {
			startDateDay = MyCalendar.get().selectTodaysFollowingHoliday();
		} else if (startDate_day.matches("randomly \\d+ months later")) {
			try {
				String xMonthLater = mobileAction.FuncGetValByRegx(startDate_day, "\\d+");

				int xMonthLater_int = Integer.parseInt(xMonthLater);
				// get current date
				LocalDate localDate = LocalDate.now();
				String currentDate = DateTimeFormatter.ofPattern("MMM dd, yyyy").format(localDate);
				currentDate = currentDate.replace(" 0", " ");
				currentDate = currentDate.replace(",", "");
				System.out.println("Today is:" + currentDate);
				String[] todayStr = currentDate.split(" ");
				String yearOfToday = todayStr[2];
				String monthOfToday = todayStr[0];
				String dayOfToday = todayStr[1];

				startDateDay = MyCalendar.get().selectRandomDayInXmonthLater(yearOfToday, monthOfToday, dayOfToday,
						xMonthLater_int);

			} catch (Exception e) {

			}
		} else if (startDate_day.matches("[a-zA-Z]{3} //d{1,2}, //d{4}")) {
			startDateDay = startDate_day;

		} else {
			System.out.println("Start Date format is wrong");
			mobileAction.Report_Fail("'Start Date' format is wrong");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		System.out.println("Random working day:" + startDateDay);
		String[] startDate_day_Array = startDateDay.replaceAll(",", "").split(" ");
		String yearOfDay = startDate_day_Array[2];
		String monthOfDay = startDate_day_Array[0];
		String dayOfDay = startDate_day_Array[1];
		MyCalendar.get().selectDate(yearOfDay, monthOfDay, dayOfDay);
		CL.getTestDataInstance().TCParameters.put("Timeout", monthOfDay + " " + dayOfDay + ", " + yearOfDay);
	}

	// startDate_day: Mar 3, 2018
	public void FillPayBillWithOngoing(String startDate_day, String frequency, String endDateOrnumberOfPayment,
			boolean noStartDateSelected) {
		Decorator();
		String payeeText = selectPayee();
		String amount_num = fillAmount();
		String from_Account = selectFromAccount();

		if (payeeText.isEmpty() || amount_num.isEmpty() || from_Account.isEmpty()) {
			mobileAction.Report_Fail("Failed to fill pay bill");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		CL.getTestDataInstance().TCParameters.put("Payee", payeeText);
		CL.getTestDataInstance().TCParameters.put("Amount", amount_num);
		CL.getTestDataInstance().TCParameters.put("FromAccount", from_Account);

		selectOngoingFromHowOftenDropDown();
		init_Payment_End_Item();
		// Save how often in "Price"
		CL.getTestDataInstance().TCParameters.put("Price",
				getTextInCurrentLocale(StringArray.ARRAY_RBP_HOWOFTEN_ONGOING));

		if (!noStartDateSelected) {
			selectStartDate();
		}

		String realFrequency = getFrequencymapping(frequency);
		selectFrequency(realFrequency);
		CL.getTestDataInstance().TCParameters.put("MerchantName", realFrequency);

		init_Payment_End_Item();
		// RandomSelect on option of "Payment will end"
		int randFund = 0;
		if (endDateOrnumberOfPayment.contains("cancel")) {
			// When I decide to cancel selected
			randFund = 2;
		} else if (endDateOrnumberOfPayment.matches("\\d+")) {
			// number of payment is selected
			randFund = 1;
		} else if (endDateOrnumberOfPayment.matches("randomly \\d+ months later")) {
			randFund = 0;
		} else {
			System.out.println("Wrong format:" + endDateOrnumberOfPayment);
			return;
		}

		System.out.println("Payment Will End is selected:" + paymentOption[randFund]);
		try {
			mobileAction.FuncClick(Payment_End_Item[randFund], paymentOption[randFund]);
		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to click '" + paymentOption[randFund] + "'");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		try {
			switch (randFund) {
			case 0:
				mobileAction.FuncClick(start_end_Date_List.get(1), "End Date");

				try {
					String xMonthLater = mobileAction.FuncGetValByRegx(endDateOrnumberOfPayment, "\\d+");

					int xMonthLater_int = Integer.parseInt(xMonthLater);

					// get current date
					LocalDate localDate = LocalDate.now();
					String currentDate = DateTimeFormatter.ofPattern("MMM dd, yyyy").format(localDate);
					currentDate = currentDate.replace(" 0", " ");
					currentDate = currentDate.replace(",", "");
					System.out.println("Today is:" + currentDate);
					String[] todayStr = currentDate.split(" ");
					String yearOfToday = todayStr[2];
					String monthOfToday = todayStr[0];
					String dayOfToday = todayStr[1];

					String endDateDay = MyCalendar.get().selectRandomDayInXmonthLater(yearOfToday, monthOfToday,
							dayOfToday, xMonthLater_int);
					System.out.println("Random working day:" + endDateDay);
					String[] endDate_day_Array = endDateDay.replaceAll(",", "").split(" ");
					String yearOfDay = endDate_day_Array[2];
					String monthOfDay = endDate_day_Array[0];
					String dayOfDay = endDate_day_Array[1];
					MyCalendar.get().selectDate(yearOfDay, monthOfDay, dayOfDay);
					CL.getTestDataInstance().TCParameters.put("SecondTimeout",
							monthOfDay + " " + dayOfDay + ", " + yearOfDay);

				} catch (Exception e) {

				}

				// String[] endDate_day_Array =
				// endDateOrnumberOfPayment.split("-");
				// yearOfDay = endDate_day_Array[2];
				// monthOfDay = endDate_day_Array[1];
				// dayOfDay = endDate_day_Array[0];
				// Calendar.get().selectDate(yearOfDay, monthOfDay, dayOfDay);
				// CL.getTestDataInstance().TCParameters.put("SecondTimeout",
				// monthOfDay + " " + dayOfDay + ", " + yearOfDay);
				break;
			case 1:
				// mobileAction.FuncClick(numer_of_payment, "Number of
				// payment");
				mobileAction.FuncSwipeWhileElementNotFound(numer_of_payment, true, 3, "up");
				numer_of_payment.clear();
				numer_of_payment.sendKeys(endDateOrnumberOfPayment);
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClickDone();
				} else {
					mobileAction.FuncHideKeyboard();
				}
				Thread.sleep(1000);
				CL.getTestDataInstance().TCParameters.put("SecondTimeout", endDateOrnumberOfPayment);
				// workaround: click start date to get Continue button
				// highlighted
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
					try {
						mobileAction.FuncClick(start_end_Date_List.get(0), "Start Date");
						MyCalendar.get().clickCalendarCancel();
					} catch (Exception e) {

					}
				}
				break;
			case 2:

				break;
			}

		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to click 'End Date'");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		mobileAction.Report_Pass_Verified("Pay bill is filled");
	}

	public void FillPayBillWithOngoing() {
		String startDate_day = getTestdata("Timeout");
		String endDateOrNumPayment = getTestdata("SecondTimeout");
		String freq = getTestdata("MerchantName");

		if (startDate_day == null || endDateOrNumPayment == null || freq == null) {
			FillPayBillWithOngoingRandomly(false);
		} else {
			System.out.println("Start Date:" + startDate_day);
			System.out.println("Frequency:" + freq);
			System.out.println("endDateOrNumPayments:" + endDateOrNumPayment);
			FillPayBillWithOngoing(startDate_day, freq, endDateOrNumPayment, false);
		}

	}

	public void FillPayBillWithOngoingWithoutStartDate() {
		String startDate_day = getTestdata("Timeout");
		String endDateOrNumPayment = getTestdata("SecondTimeout");
		String freq = getTestdata("MerchantName");

		if (startDate_day == null || endDateOrNumPayment == null || freq == null) {
			FillPayBillWithOngoingRandomly(true);
		} else {
			System.out.println("Start Date:" + startDate_day);
			System.out.println("Frequency:" + freq);
			System.out.println("endDateOrNumPayments:" + endDateOrNumPayment);
			FillPayBillWithOngoing(startDate_day, freq, endDateOrNumPayment, true);
		}

	}

	private String getErrorMapping(String errorSheet) {

		// if
		// (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))
		// {
		// return
		// getTextInCurrentLocale(StringArray.ARRAY_RBP_PAY_BILL_ERROR_MSG);
		// }

		if (!errorSheet.matches("error\\-fre\\-\\d{1}") && !errorSheet.matches("error\\-ccra")) {
			System.out.println("Error data from sheet is wrong:" + errorSheet);
			return "";
		}

		switch (errorSheet) {
		case "error-fre-0":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_PAY_BILL_ERROR_MSG_WEEKLY);
		case "error-fre-1":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_PAY_BILL_ERROR_MSG_BI_WEEKLY);
		case "error-fre-2":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_PAY_BILL_ERROR_MSG_MONTHEND);
		case "error-fre-3":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_PAY_BILL_ERROR_MSG_MONTHLY_);
		case "error-fre-4":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_PAY_BILL_ERROR_MSG_SEMIMONTHLY);
		case "error-fre-5":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_PAY_BILL_ERROR_MSG_QUARTERLY);
		case "error-ccra":
			return getTextInCurrentLocale(StringArray.ARRAY_RBP_CCRA_ERROR_MESSAGE);
		}
		return "";
	}

	public void VerifyRBPErrorMessage() {
		Decorator();

		String errorSheet = getTestdata("Security_Question");

		try {
			String expectedError = getErrorMapping(errorSheet);
			if (expectedError.isEmpty()) {
				mobileAction.Report_Fail("Failed to verify error message since data sheet is not correct");
				return;
			}

			mobileAction.verifyElementTextIsDisplayed(rbp_error_message, expectedError);

		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to verify error message");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyRBP1NumberOfPaymentErrorMessage() {
		Decorator();
		try {
			String expectedError = getTextInCurrentLocale(StringArray.ARRAY_RBP_1_NUM_PAYMENT_ERROR_MSG);
			mobileAction.verifyElementTextIsDisplayed(rbp_error_message, expectedError);

		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to verify error message");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void selectStartdateAgain() {
		Decorator();
		selectStartDate();
	}

	public void VerifyEndOfDateIsBlank() {
		Decorator();
		String endDate_day = getTestdata("SecondTimeout");
		System.out.println("Previous end of date:" + endDate_day);
		try {
			String currentEndOfdate = "";
			if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))) {
				init_dateText_Item(1);
				currentEndOfdate = mobileAction.getValue(Date_text_Item[1]);
			} else {
				currentEndOfdate = mobileAction.getValue(dateText_List.get(1));
			}
			currentEndOfdate = mobileAction.getValue(dateText_List.get(1));
			if (currentEndOfdate.equals(getTextInCurrentLocale(StringArray.ARRAY_RBP_END_DATE_PLACEHOLDER))) {
				mobileAction.Report_Pass_Verified("End of date is blank");
			} else {
				System.out.println("Current end of date:" + currentEndOfdate);
				mobileAction.Report_Fail_Not_Verified("End of date is blank");
			}

		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to VerifyEndOfDateIsBlank");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyEndOfDateReamins() {
		Decorator();
		String endDate_day = getTestdata("SecondTimeout");
		if (endDate_day.contains(" 0")) {
			endDate_day = endDate_day.replace(" 0", " ");
		}
		System.out.println("Previous end of date:" + endDate_day);
		try {
			String currentEndOfdate = "";
			if ((CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))) {
				init_dateText_Item(1);
				currentEndOfdate = mobileAction.getValue(Date_text_Item[1]);
			} else {
				currentEndOfdate = mobileAction.getValue(dateText_List.get(1));
			}

			//endDate_day is in English format, so need to convert to current language format
			String endDate_day_currentLocale = MyCalendar.get().convertEnglishDateToOther(endDate_day);
			if (currentEndOfdate.equals(endDate_day_currentLocale)) {
				mobileAction.Report_Pass_Verified("End of date remains");
			} else {
				System.out.println("Current end of date:" + currentEndOfdate);
				mobileAction.Report_Fail_Not_Verified("End of date remains");
			}

		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to VerifyEndOfDateReamins");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyRBPScreen() {
		Decorator();

		try {
			mobileAction.verifyElementTextIsDisplayed(payBill_Header,
					getTextInCurrentLocale(StringArray.ARRAY_PAY_CANDIAN_BILL_TITLE));
			selectOngoingFromHowOftenDropDown();

			mobileAction.verifyElementIsDisplayed(frequency, "Frequency");

		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to verifyRBPScreen");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void SelectCCRAPayee() {
		Decorator();
		try {
			selectPayee();

		} catch (Exception e) {
			mobileAction.Report_Fail("Failed to verifyRBPScreen");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
