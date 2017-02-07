package com.td;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;

import com.td.test.CDNMobile.pages.Accounts;
import com.td.test.CDNMobile.pages.AddCanadian_Payee;
import com.td.test.CDNMobile.pages.AddPayee;
import com.td.test.CDNMobile.pages.AddRecipient;
import com.td.test.CDNMobile.pages.Between_My_accounts;
import com.td.test.CDNMobile.pages.Bill_PayCanada;
import com.td.test.CDNMobile.pages.Bills;
import com.td.test.CDNMobile.pages.ConfirmOrder;
import com.td.test.CDNMobile.pages.Confirm_Payee;
import com.td.test.CDNMobile.pages.ContactUs;
import com.td.test.CDNMobile.pages.DepositCheque;
import com.td.test.CDNMobile.pages.HoldingDetails;
import com.td.test.CDNMobile.pages.HomeScreen;
import com.td.test.CDNMobile.pages.Interac_e_Transfer;
import com.td.test.CDNMobile.pages.Investing;
import com.td.test.CDNMobile.pages.Login;
import com.td.test.CDNMobile.pages.Logout;
import com.td.test.CDNMobile.pages.MFA_ChangeAnswer;
import com.td.test.CDNMobile.pages.ManageRecipients;
import com.td.test.CDNMobile.pages.Managee_Payee;
import com.td.test.CDNMobile.pages.MenuPage;
import com.td.test.CDNMobile.pages.MobileDeposit;
import com.td.test.CDNMobile.pages.Multitasking_System;
import com.td.test.CDNMobile.pages.OrderDetails;
import com.td.test.CDNMobile.pages.OrderReciept;
import com.td.test.CDNMobile.pages.Pay_US_Bill;
import com.td.test.CDNMobile.pages.PendingInteracTransfer;
import com.td.test.CDNMobile.pages.Preferences;
import com.td.test.CDNMobile.pages.QuickAccessPage;
import com.td.test.CDNMobile.pages.SearchPage;
import com.td.test.CDNMobile.pages.Trade;
import com.td.test.CDNMobile.pages.Transfers;
import com.td.test.CDNMobile.pages.WatchLists;

public class EventCase {

	private enum functionNames {

		Account_Home_Button, 
		Account_Prefer_Button, 
		Accounts_EW_WB_Functionality, 
		Accounts_Header, 
		Accounts_sessionTimedOut, 
		Accounts_Verify_Page, 
		Accounts_VerifyAccountsPage, 
		Accounts_VerifyTFSA_Activity, 
		Add_Recipient_ErrorPage, 
		AddCanadianPayee, 
		AddPayee_SearchPayee,

		Banking_Header, 
		
		Between_My_accounts, 
		Between_My_accounts_CanadianToUS, 
		Between_My_accounts_exchange_rate_expired, 
		Between_My_accounts_Exchange_Rate_Expired, 
		Between_My_Accounts_LIRA, 
		Between_My_accounts_Mobile_Rate_Expiry, 
		Between_My_Accounts_Permissible_Transfer, 
		Between_My_accounts_transfer, 
		Between_My_Accounts_Transfer_less, 
		Between_My_accounts_transfer_verify_receipt, 
		Between_My_accounts_VerifyFromAccounts, 
		BetweenMyAccounts_CADTFSA_TDCTTFSA, 
		BetweenMyAccounts_NegativeTestingTransferFunds, 
		BetweenMyAccounts_TDCTTFSA_CADTFSA, 
		BetweenMyAccounts_TDCTTFSAMessage, 
		BetweenMyAccounts_TransferNotSupported,

		Bill_PayCanada_AmountSelection, 
		Bill_PayCanada_BillPaymentCurrentDate, 
		Bill_PayCanada_PayBillCancel, 
		Bill_PayCanada_VerifyBackButton, 
		Bill_PayCanada_VerifyQuickAccess, 
		Bills_ScheduledPayments, 
		BillsHeader,

		CanadianPayee_ConfirmPage, 
		
		CDNCash, 
		CDNCash_Sell_StopMarket, 
		CDNMargin_Buy, 
		CDNMargin_Buy_TriggerDelta, 
		CDNMarginLimit, 
		CDNMarginLimitTradePreviewOrder, 
		Check_Remember_Me_Default,

		ClickBack, 
		ClickContact, 
		ClickDepositCheque, 
		ClickMenu, 
		ClickMenu_French, 
		ClickMenuHome,

		Confirm_order, 
		ConfirmOrderCancel, 
		ConfirmOrderSendOrder, 
		ConfirmPayee,

		Dashboard_Authentication, 
		Dashboard_UnAuthentication, 
		Delete_usr, 
		Deposit_Header, 
		DepositChequeHeader,

		END, 
		
		Env_set, 
		FlyOut_HOME, 
		Flyout_Location,

		HoldingDetails_verify_Account_CADCash, 
		HoldingDetails_verify_Account_US_MarginShort,

		HomeScreen_ClickAccounts, 
		HomeScreen_ClickBills, 
		HomeScreen_ClickDeposit, 
		HomeScreen_clickInvestingFromHamburger, 
		HomeScreen_ClickMarkets, 
		HomeScreen_ClickQuickAccess, 
		HomeScreen_ClickTrade, 
		HomeScreen_ClickTransfers, 
		HomeScreen_ClickTransfersFrench, 
		HomeScreen_Location_Details, 
		HomeScreen_Transfer_Button, 
		HomeScreen_WatchLists,

		Interac_AddRecipient, 
		Interac_e_Transfer_verify_interacTransfer, 
		Interac_Header, InteracTransfer_Cancel, 
		InteracTransfer_VerifyAmount,

		Investing_clickHoldings, 
		Investing_clickInvestingAccount, 
		Investing_clickInvestingAccounts, 
		Investing_clickOrderTab, 
		Investing_clickPlacedorder, 
		Investing_clickTrade, 
		Investing_clickWatchLists, 
		Investing_clickMarkets, 
		Investing_Header, 
		Investing_verifyAdvanceorderdetails, 
		InvestingHeader,

		IOS_Account_Home_Button,

		Login, 
		Login_and_Logout, 
		Login_clearPasswordField, 
		Login_Error, 
		Login_Ntimes, 
		Login_PasswordFieldDelete, 
		Login_usernameFieldDelete, 
		Login_verifyPasswordField, 
		Login_verifyUsernameField, 
		login_without_tandc, 
		LoginFrench, 
		Loginverify, 
		LoginWithRemember, 
		Logout, 
		LogoutFrench,

		ManagePayee_AddCanadianPayee, 
		ManagePayee_MutlipleAccesscard, 
		ManagePayee_VerifyAddCanadianPayeeBtn, 
		ManagePayees_Button, 
		ManageRecipient_EditManageRecipient, 
		ManageRecipient_ModifyRecipient, 
		ManageRecipients_VerifyRegisterButton,

		mask_user, 
		Menu_Accounts, 
		Menu_ClickTransfersFrench, 
		Menu_Investing, 
		Menu_Location, 
		Menu_Mobile_deposit, 
		MenuBills, 
		MenuTransfer,

		MFA_Change, 
		Mobile_Deposit, 
		Multitasking_System,

		OpenApp,

		OrderDetails_clickChangeorder, 
		OrderDetailsLimitPrice, 
		OrderDetailsPage_orderConfirmDetails, 
		OrderDetailsTriggerPrice, 
		OrderDetails_CancelOrder,

		OrderReciept_orderdetailMutualfund, 
		OrderReciept_orderDetails, 
		OrderReciept_orders, 
		OrderReciept_ordertab, 
		OrderReciept_verifyOrderScreen, 
		OrderReciept_OrdersIcon, 
		OrderReciept_CancelOrderReceipt,

		Pay_US_bill_From_US_Account, 
		Pay_US_bill_FromCanada_Account, 
		PayBill_Canada_Button, 
		PayBill_US_Button, 
		PayBill_VerifyAddCanadianPayeeBtn, 
		PayBillCanada_Add_Canadian_Payee, 
		PayCanada_NegativeTestingBillPayment, 
		PayCanadaBill_Post_Dated, 
		PayCanadaBillP_Pay_Candadian_Bill,

		PendingInterac_e_Transfer, 
		PendingInterac_e_Transfer_cancel, 
		PendingInterac_e_Transfer_canceltransfer, 
		PendingInterac_e_Transfer_confirm, 
		PendingInterac_e_Transfer_confirmscreen, 
		PendingInterac_e_Transfer_verifyconfirmation, 
		PendingInterac_e_Transfer_verifylist, 
		PendingInterac_e_Transfer_verifystatus, 
		PermissibleTransfer_C04_To_U05, 
		PermissibleTransfer_C05_To_U02, 
		PermissibleTransfer_C07_To_U05, 
		PermissibleTransfer_C08_To_U03, 
		PermissibleTransfer_C09_To_U01, 
		PermissibleTransfer_C11_To_U04, 
		PermissibleTransfer_C11_To_U06, 
		PermissibleTransfer_U04_To_C18, 
		PermissibleTransfer_U05_To_C16, 
		PermissibleTransfer_U06_To_C09,

		Preferences_Update_Question,

		QuickAccess,

		SearchPage_searchBar,

		Select_Account,

		SenderList_Cancel, Session_expired,

		TDDirectInvestingContact,

		Trade_clickMutualFunds, 
		Trade_clickOnAgree, 
		Trade_clickOnPreviewOrderBtn, 
		Trade_clickOptions, 
		Trade_clickOrderType, 
		Trade_clickStockETFs, 
		Trade_clickSymbol, 
		Trade_createMutualfund, 
		Trade_Details, 
		Trade_Limit, 
		Trade_selectAccount, 
		Trade_selectQuantity, 
		Trade_sendOrder, 
		Trade_Trigger, 
		Trade_verifyTrade, 
		TradeAccount, 
		TradeAction, 
		TradeAgree, 
		TradeDate, 
		TradeGoodTill, 
		TradeHeader, 
		TradeLimitPrice, 
		TradeMarginAccount, 
		TradePreviewOrder, 
		TradePrice, 
		TradeQuantity, 
		TradeShareHolder, 
		TradeTriggerDelta, 
		TradeTriggerPrice, 
		TradingPassword,
		

		Trans_TFSA_To_Othr_Accounts, 
		Transfer_InteracTransfer, 
		TransferHeader, 
		Transfers, 
		Transfers_Click_Between_My_Accounts, 
		Transfers_clickInterac_e_Transfer, 
		Transfers_clickPendingInterac_e_Transfer, 
		Transfers_ManageRecipients,

		USMarAccLongToShort, 
		
		verify_access_to_WB, 
		Verify_account_activity_credit, 
		verify_login_5_times, 
		VerifyAccessCard, 
		VerifyAccessCardDetails, 
		VerifyActionFields, 
		verifybill_landingpage, 
		VerifyIconDetails, 
		VerifyQuickIcons, 
		VerifyReceipt, 
		VerifySender, 
		VerifySenderList, 
		VerifyShareholderType, 
		Verifytimestamp, 
		VerifyTwoAccessCardDetails, 
		VerifyUser,
		VerifyDIAccounts,
		VerifyPIAAccounts,
		VerifyCombinedAccounts,
		VerifyNoTradingAccounts,
		VerifyNoEligibleAccounts,
		VerifyInvestingScreen,
		VerifyFPAccounts,
		Verify_PIA_Account,
		Verify_FP_Account,
		Verify_Combined_Account,
		verifyErrorMessage,

		WatchLists_addSymbolToWatchLists, 
		WatchLists_clickSearchBar, 
		WatchLists_Header, 
		WatchLists_verifyRecentSearches, 
		WatchLists_verifySymbol,
		WatchLists_verifySymbolAdded,

		Menu_Investing_French, 
		Investing_clickTrade_French, 
		Trade_clickOrderType_French, 
		Trade_clickSymbol_French, 
		TradeAction_French, 
		TradeQuantity_French, 
		TradePrice_French, 
		TradeGoodTill_French, 
		TradeTriggerPrice_French, 
		TradingPassword_French, 
		TradePreviewOrder_French, 
		TradeAgree_French, 
		Trade_verifyRelaventMatchInResult,
		Trade_verifySymbol,
		Confirm_order_French, 
		ConfirmOrderSendOrder_French, 
		OrderReciept_French,
		TradeAccount_French,
		ConfirmOrderReciept
	}

	// @Override
	public void FuncCOREEventCase(String sFunctionname)
			throws IOException, NoSuchElementException, InterruptedException, Exception {

		switch (functionNames.valueOf(sFunctionname)) {
		case OpenApp:
			MainScreen.get().Splash_Conitnue();
			break;

		case USMarAccLongToShort:
			Trade.get().trade_USMarginAccountLongToShort();
			break;

		case VerifyShareholderType:
			Trade.get().verifyShareHolderWithDiffAcc();
			break;

		case Trade_clickOrderType:
			Trade.get().clickOrderType();
			break;

		case Trade_clickSymbol:
			Trade.get().clickSymbol();
			break;

		case VerifyActionFields:
			Trade.get().verifyActionShortSellandBuyToCover();
			break;

		case CDNCash_Sell_StopMarket:
			ConfirmOrder.get().cdncash_sell_stopmarket();
			break;

		case TradeAccount:
			Trade.get().CDNAccount();
			break;

		case TradeAction:
			Trade.get().clickAction();
			break;

		case TradeQuantity:
			Trade.get().clickQuantity();
			break;

		case TradePrice:
			Trade.get().clickPrice();
			break;

		case TradeGoodTill:
			Trade.get().clickGoodTill();
			break;

		case TradeShareHolder:
			Trade.get().clickShareHolder();
			break;

		case TradingPassword:
			Trade.get().tradingPassword();
			break;

		case TradePreviewOrder:
			Trade.get().clickPreviewOrder();
			break;

		case TradeAgree:
			Trade.get().clickOnAgree();
			break;

		case TradeTriggerDelta:
			Trade.get().triggerDelta();
			break;

		case TradeLimitPrice:
			Trade.get().limitPrice();
			break;

		case TradeTriggerPrice:
			Trade.get().triggerPrice();
			break;

//		case TradeDate:
//			Trade.get().date();
//			break;

		case CDNMargin_Buy:
			ConfirmOrder.get().verifycdnmargin_buy();
			break;

		case VerifyReceipt:
			OrderReciept.get().receipt();
			break;

		case VerifyQuickIcons:
			OrderReciept.get().quicklinkicon();
			break;

		case VerifyIconDetails:
			OrderReciept.get().clickgohomeicon();
			break;

		case CDNMargin_Buy_TriggerDelta:
			ConfirmOrder.get().verifycancel_cdnmargin_buy_triggerdelta();
			break;

		case ConfirmOrderCancel:
			ConfirmOrder.get().clickcancel();
			break;

		case ConfirmOrderSendOrder:
			ConfirmOrder.get().clicksendorder();
			break;

		case CDNCash:
			ConfirmOrder.get().verifycdncash();
			break;

		case CDNMarginLimit:
			ConfirmOrder.get().verifycdnmargin_limit();
			break;

		case HoldingDetails_verify_Account_CADCash:
			HoldingDetails.get().verify_Account_CADCash();
			break;

		case HoldingDetails_verify_Account_US_MarginShort:
			HoldingDetails.get().verify_Account_CADCash();
			break;

		case Investing_clickHoldings:
			Investing.get().clickHoldings();
			break;

		case Login_Error:
			Login.get().login_errorMsg();
			break;

		case Session_expired:
			Login.get().expired_session();
			break;

		case Delete_usr:
			Login.get().delete_user();
			break;

		case mask_user:
			Login.get().verify_user();
			break;

		case Interac_e_Transfer_verify_interacTransfer:
			Interac_e_Transfer.get().verify_interacTransfer();
			break;

		case verify_access_to_WB:
			Investing.get().verifyAccessToWBfunctionality();
			break;

		case Between_My_accounts_transfer_verify_receipt:
			Between_My_accounts.get().transfer_between_my_accounts_verify_receipt();
			break;

		case login_without_tandc:
			Login.get().loginWithoutTandC();
			break;

		case Select_Account:
			Accounts.get().selectItemFromList();
			break;

		case Banking_Header:
			Accounts.get().verify_Banking_Header();
			break;

		case HomeScreen_ClickMarkets:
			Accounts.get().verify_Banking_Header();
			break;

		case Account_Home_Button:
			Accounts.get().account_Home_Btn_click();
			break;

		case Investing_Header:
			Accounts.get().verify_Investing_Header();
			break;
		case Menu_Mobile_deposit:
			MenuPage.get().mobile_Deposit_click();
			break;

		case Accounts_Header:
			Accounts.get().verify_accounts_Header();
			break;

		case IOS_Account_Home_Button:
			Accounts.get().ios_account_Home_Btn_click();
			break;

		case Deposit_Header:
			MobileDeposit.get().verifyDepositHeader();
			break;

		case InvestingHeader:
			Investing.get().verifyInvestingHeader();
			break;

		case TradeHeader:
			Trade.get().verifyTrade();
			break;

		case Mobile_Deposit:
			MobileDeposit.get().mobile_Dpst_Validation_Page();
			break;

		case VerifyAccessCard:
			Bill_PayCanada.get().verifyAccessCard_dropdown();
			break;

		case VerifyAccessCardDetails:
			Bill_PayCanada.get().verifyAccessCardDetails();
			break;

		case ClickDepositCheque:
			MobileDeposit.get().depositCheque();
			break;

		case DepositChequeHeader:
			DepositCheque.get().verifyDepositCheque();
			break;

		case Account_Prefer_Button:
			Accounts.get().account_Prefernces_button();
			break;

		case MFA_Change:
			MFA_ChangeAnswer.get().mfa_update();
			break;

		case Trans_TFSA_To_Othr_Accounts:
			Between_My_accounts.get().transferBtw_tfsa_other_Acct();
			break;

		case Menu_ClickTransfersFrench:
			MenuPage.get().clickTransfers_InFrench();
			break;

		case HomeScreen_WatchLists:
			HomeScreen.get().clickWatchLists();
			break;
		case Env_set:
			Env_Settings.get().set_environment();
			break;

		case FlyOut_HOME:
			HomeScreen.get().verifyFlyOut_Home();
			break;

		case ClickMenu:
			HomeScreen.get().clickMenu();
			break;

		case Trade_Trigger:
			Trade.get().tradeDetails_TriggerDelta();
			break;

		case Add_Recipient_ErrorPage:
			AddRecipient.get().addRecipient_ErrorMessage();
			break;

		case ClickContact:
			MenuPage.get().clickContactUs();
			break;

		case TDDirectInvestingContact:
			ContactUs.get().verifyTDInvesting_Contact();
			break;

		case ClickMenu_French:
			HomeScreen.get().clickMenu_french();
			break;

		case MenuTransfer:
			MenuPage.get().clickMenuTransfer();
			break;

		case HomeScreen_ClickBills:
			HomeScreen.get().clickBill();
			break;

		case TransferHeader:
			Transfers.get().verifyTransferHeader();
			break;

		case HomeScreen_ClickAccounts:
			HomeScreen.get().clickMyAccounts();
			break;

		case Accounts_Verify_Page:
			Accounts.get().verifyAccountPage();
			break;
			

		case VerifyDIAccounts:
			Investing.get().verifyDIAccounts();
			break;

		case Login:
			Login.get().login();
			break;

		case HomeScreen_ClickTransfers:
			HomeScreen.get().clickTransfers();
			break;

		case HomeScreen_ClickTrade:
			HomeScreen.get().clickTrade();
			break;

		case HomeScreen_ClickDeposit:
			HomeScreen.get().clickDeposit();
			break;

		case Between_My_accounts_Mobile_Rate_Expiry:
			Between_My_accounts.get().mobile_expiry_rate();
			break;

		case Transfers_Click_Between_My_Accounts:
			Transfers.get().clickBetweenMyAccountsTransfers();
			break;

		case Between_My_accounts_transfer:
			Between_My_accounts.get().transfer_between_my_accounts();
			break;

		case HomeScreen_Transfer_Button:
			HomeScreen.get().clickDashboardTransfers();
			break;

		case Multitasking_System:
			Multitasking_System.get().multitasking();
			break;

		case Between_My_Accounts_LIRA:
			Between_My_accounts.get().lira_US_to_UU();
			break;

		case HomeScreen_ClickQuickAccess:
			HomeScreen.get().clickQuickAccess();
			break;

		case ClickMenuHome:
			MenuPage.get().clickMenuHome();
			break;

		case Menu_Accounts:
			MenuPage.get().clickMenuAccounts();
			break;

		case Menu_Investing:
			MenuPage.get().clickMenuInvesting();
			break;

		case Pay_US_bill_FromCanada_Account:
			Pay_US_Bill.get().pay_US_bill_ErrorMsg();
			break;

		case Pay_US_bill_From_US_Account:
			Pay_US_Bill.get().verifyCurrencyDropDown();
			break;

		case QuickAccess:
			QuickAccessPage.get().quickAccess();
			break;

		case Between_My_Accounts_Permissible_Transfer:
			Between_My_accounts.get().canadianCash_To_USCash();
			break;

		case Preferences_Update_Question:
			Preferences.get().prefernces_Update_Security_Question();
			break;

		case BetweenMyAccounts_TransferNotSupported:
			Between_My_accounts.get().transfer_NotSupported();
			break;

		case HomeScreen_ClickTransfersFrench:
			HomeScreen.get().clickTransfers_InFrench();
			break;

		case LoginFrench:
			Login.get().login_French();
			break;

		case LogoutFrench:
			Logout.get().french_clickMenuButton();
			Logout.get().clickLogoutFrench();
			break;

		case Between_My_accounts_exchange_rate_expired:
			Between_My_accounts.get().exchange_rate_expired();
			break;

		case Logout:
			Login.get().logout();
			break;

		case ClickBack:
			HomeScreen.get().back_button();
			break;

		case OrderReciept_ordertab:
			OrderReciept.get().ordertab();
			break;

		case OrderReciept_orderDetails:
			OrderReciept.get().orderDetails();
			break;

		case OrderReciept_orders:
			OrderReciept.get().orders();
			break;

		case OrderDetails_clickChangeorder:
			OrderDetails.get().clickChangeorder();
			break;

		case OrderDetailsLimitPrice:
			OrderReciept.get().orderDetailLimitPrice_ShareHolder();
			break;

		case OrderDetailsTriggerPrice:
			OrderReciept.get().orderDetailTriggerPrice();
			break;

		case Verifytimestamp:
			OrderReciept.get().verifytimestamp();
			break;

		case TradeMarginAccount:
			Trade.get().tradeDetails_marginAccount();
			break;

		case PayBill_Canada_Button:
			Bills.get().clickPayCanadianBill();
			break;

		case ManageRecipient_ModifyRecipient:
			ManageRecipients.get().modifyRecipient();
			break;

		case CanadianPayee_ConfirmPage:
			Confirm_Payee.get().verifyConfirmPage();
			break;

		case PayBill_US_Button:
			Bills.get().click_pay_US_bill();
			break;

		case ManagePayees_Button:
			Bills.get().click_ManagePayees();
			break;

		case PayBillCanada_Add_Canadian_Payee:
			Bill_PayCanada.get().addCanadianPayee();
			break;

		case PayCanadaBillP_Pay_Candadian_Bill:
			Bill_PayCanada.get().pay_candadian_bill();
			break;

		case AddCanadianPayee:
			AddCanadian_Payee.get().addCanadianPayee_page();
			break;

		case ConfirmPayee:
			Confirm_Payee.get().verifyConfirmPage();
			break;

		case PayCanadaBill_Post_Dated:
			Bill_PayCanada.get().pay_candadian_bill_post_dated();
			break;

		case MenuBills:
			MenuPage.get().clickMenuBills();
			break;

		case BillsHeader:
			Bills.get().verifyBillHeader();
			break;

		case Interac_Header:
			Interac_e_Transfer.get().verifyInteracHeader();
			break;

		case VerifyUser:
			Login.get().verifyMostUser();
			break;

		case ManagePayee_MutlipleAccesscard:
			Managee_Payee.get().verifyMultipleAccessCard();
			break;

		case Confirm_order:
			ConfirmOrder.get().verifyconfirm_order();
			break;

		case Loginverify:
			Login.get().verifyBlankPage();
			break;

		case LoginWithRemember:
			Login.get().rememberClick();
			break;

		case SearchPage_searchBar:
			SearchPage.get().searchBar();
			break;

		case Trade_clickStockETFs:
			Trade.get().clickStockETFs();
			break;

		case Trade_Details:
			Trade.get().tradeDetails();
			break;

		case Trade_clickOnAgree:
			Trade.get().clickOnAgree();
			break;

		case Trade_verifyTrade:
			Trade.get().verifyTrade();
			break;

		case Trade_selectQuantity:
			Trade.get().selectQuantity();
			break;

		case Transfers_clickInterac_e_Transfer:
			Transfers.get().clickInterac_e_Transfer();
			break;

		case Interac_AddRecipient:
			Interac_e_Transfer.get().addRecipient();
			break;

		case Trade_clickOptions:
			Trade.get().clickOptions();
			break;

		case Investing_clickTrade:
			Investing.get().clickTrade();
			break;

		case Investing_clickPlacedorder:
			Investing.get().clickPlacedorder();
			break;

		case Investing_clickWatchLists:
			Investing.get().clickWatchLists();
			break;

		case WatchLists_clickSearchBar:
			WatchLists.get().clickSearchBar();
			break;

		case WatchLists_verifySymbol:
			WatchLists.get().verifySymbol();
			break;

		case WatchLists_verifyRecentSearches:
			WatchLists.get().verifyRecentSearches();
			break;

		case WatchLists_addSymbolToWatchLists:
			WatchLists.get().AddSymbolToWatchListSymbol();
			break;

		case WatchLists_verifySymbolAdded:
			WatchLists.get().verifySymbolAdded();
			break;

		case Flyout_Location:
			HomeScreen.get().flyoutMenu_Locations();
			break;

		case Accounts_EW_WB_Functionality:
			Accounts.get().veify_EW_WB_Functionality();
			break;

		case HomeScreen_Location_Details:
			HomeScreen.get().verifyLocations();
			break;

		case Login_Ntimes:
			Login.get().loginNTimes();
			break;

		case ManageRecipients_VerifyRegisterButton:
			ManageRecipients.get().verify_RegisterButton();
			break;

		case Transfers_ManageRecipients:
			Transfers.get().clickManageRecipients();
			break;

		case HomeScreen_clickInvestingFromHamburger:
			HomeScreen.get().clickInvestingFromHamburger();
			break;

		case Trade_clickMutualFunds:
			Trade.get().clickMutualFunds();
			break;

		case Trade_Limit:
			Trade.get().tradeDetails_Limit();
			break;

		case Trade_createMutualfund:
			Trade.get().createMutualfund();
			break;

		case OrderReciept_orderdetailMutualfund:
			OrderReciept.get().orderdetailMutualfund();
			break;

		case Investing_clickInvestingAccounts:
			Investing.get().clickInvestingAccounts();
			break;

		case Investing_clickOrderTab:
			Investing.get().clickOrder();
			break;

		case OrderDetailsPage_orderConfirmDetails:
			ConfirmOrder.get().orderConfirmDetails();
			break;

		case Investing_verifyAdvanceorderdetails:
			Investing.get().verifyAdvanceorderdetails();
			break;

		case Accounts_VerifyTFSA_Activity:
			Accounts.get().verify_TFS_ACC_ISPresent();
			break;

		case Transfer_InteracTransfer:
			Interac_e_Transfer.get().interacTransfer();
			break;

		case VerifyTwoAccessCardDetails:
			Bill_PayCanada.get().accesscardsWithPayeeandAccounts();
			break;

		case WatchLists_Header:
			WatchLists.get().verifyWatchListHeader();
			break;

		case Bill_PayCanada_PayBillCancel:
			Bill_PayCanada.get().payBillCancel();
			break;

		case Bill_PayCanada_AmountSelection:
			Bill_PayCanada.get().amountSelection();
			break;

		case Login_PasswordFieldDelete:
			Login.get().passwordFieldDelete();
			break;

		case Login_usernameFieldDelete:
			Login.get().usernameFieldDelete();
			break;

		case Bill_PayCanada_VerifyBackButton:
			Bill_PayCanada.get().verifyBackButton();
			break;

		case ManagePayee_VerifyAddCanadianPayeeBtn:
			Managee_Payee.get().verifyAddCanadianPayeeButton();
			break;

		case PayBill_VerifyAddCanadianPayeeBtn:
			Bill_PayCanada.get().verifyAddCanadianPayeeButton();
			break;

		case Bill_PayCanada_VerifyQuickAccess:
			Bill_PayCanada.get().payBillQuickAccessBtn();
			break;

		case Between_My_Accounts_Transfer_less:
			Between_My_accounts.get().transferLessAmount();
			break;

		case Between_My_accounts_VerifyFromAccounts:
			Between_My_accounts.get().verifyFromAccounts();
			break;

		case Between_My_accounts_CanadianToUS:
			Between_My_accounts.get().CanadianToUS();
			break;

		case Login_clearPasswordField:
			Login.get().clearPasswordField();
			break;

		case Login_verifyUsernameField:
			Login.get().verifyUsernameField();
			break;
			
		case Investing_clickMarkets:
			Investing.get().clickMarkets();
			break;

		case Login_verifyPasswordField:
			Login.get().verifyPasswordField();
			break;

		case Accounts_VerifyAccountsPage:
			Accounts.get().verifyAccountsPage();
			break;

		case ManagePayee_AddCanadianPayee:
			Managee_Payee.get().addPayee();
			break;

		case AddPayee_SearchPayee:
			AddPayee.get().searchPayee();
			break;

		case BetweenMyAccounts_NegativeTestingTransferFunds:
			Between_My_accounts.get().negativerTestingTransferFunds();
			break;

		case Bills_ScheduledPayments:
			Bills.get().scheduledPayments();
			break;

		case PayCanada_NegativeTestingBillPayment:
			Bill_PayCanada.get().negativeTestingBillPayment();
			break;

		case BetweenMyAccounts_TDCTTFSAMessage:
			Between_My_accounts.get().anyAccount_TDCTTFSA_Message();
			break;

		case BetweenMyAccounts_TDCTTFSA_CADTFSA:
			Between_My_accounts.get().TDCTTFSA_CADTFSA();
			break;

		case BetweenMyAccounts_CADTFSA_TDCTTFSA:
			Between_My_accounts.get().CADTFSA_TDCTTFSA();
			break;

		case Dashboard_Authentication:
			HomeScreen.get().dashboardAuthentication();
			break;

		case Dashboard_UnAuthentication:
			HomeScreen.get().dashboardUnAuthentication();
			break;

		case Accounts_sessionTimedOut:
			Accounts.get().sessionTimedOut();
			break;

		case Bill_PayCanada_BillPaymentCurrentDate:
			Bill_PayCanada.get().billPaymentCurrentDate();
			break;

		case Transfers_clickPendingInterac_e_Transfer:
			Transfers.get().clickPendingTransfers();
			break;

		case Check_Remember_Me_Default:
			Login.get().checkRememberMeByDefault();
			break;

		case Verify_account_activity_credit:
			Accounts.get().verifyCreditAccountActivity();
			break;

		case verify_login_5_times:
			Login.get().verifylogin5times();
			break;

		case Login_and_Logout:
			Login.get().loginAndLogout();
			break;

		case verifybill_landingpage:
			Bills.get().bill_landingpage();
			break;

		case PendingInterac_e_Transfer_canceltransfer:
			PendingInteracTransfer.get().verifyconfirmation();
			break;

		case Menu_Location:
			HomeScreen.get().clicklocation();
			break;

		case SenderList_Cancel:
			Interac_e_Transfer.get().clickcancel();
			break;

		case VerifySenderList:
			PendingInteracTransfer.get().verifylistofsender();
			break;

		case VerifySender:
			PendingInteracTransfer.get().verifysender();
			break;

		case PendingInterac_e_Transfer:
			PendingInteracTransfer.get().pending_interac_transfer();
			break;

		case InteracTransfer_Cancel:
			Interac_e_Transfer.get().interacTransfer_cancel();
			break;

		case InteracTransfer_VerifyAmount:
			Interac_e_Transfer.get().verifyamountfield();
			break;

		case PendingInterac_e_Transfer_confirm:
			PendingInteracTransfer.get().confirmbutton();
			break;

		case PendingInterac_e_Transfer_cancel:
			PendingInteracTransfer.get().cancelbutton();
			break;

		case PendingInterac_e_Transfer_confirmscreen:
			PendingInteracTransfer.get().confirmscreen_cancelbutton();
			break;

		case PendingInterac_e_Transfer_verifystatus:
			PendingInteracTransfer.get().confirmstatus();
			break;

		case PendingInterac_e_Transfer_verifyconfirmation:
			PendingInteracTransfer.get().canceltransfer();
			break;

		case PendingInterac_e_Transfer_verifylist:
			PendingInteracTransfer.get().verifylist();
			break;

		case PermissibleTransfer_C04_To_U05:
			Between_My_accounts.get().transferCAD04ToU05_chequingAmount();
			break;

		case PermissibleTransfer_C07_To_U05:
			Between_My_accounts.get().transferCAD07ToU05_chequingAmount();
			break;

		case PermissibleTransfer_C05_To_U02:
			Between_My_accounts.get().transferCAD05ToU02_chequingAmount();
			break;

		case PermissibleTransfer_C08_To_U03:
			Between_My_accounts.get().transferCAD08ToU03_chequingAmount();
			break;

		case PermissibleTransfer_C09_To_U01:
			Between_My_accounts.get().transferCAD09ToU01_chequingAmount();
			break;

		case PermissibleTransfer_U06_To_C09:
			Between_My_accounts.get().transferU06ToCAD09_chequingAmount();
			break;

		case PermissibleTransfer_C11_To_U06:
			Between_My_accounts.get().transferCAD11ToU06_chequingAmount();
			break;

		case PermissibleTransfer_U04_To_C18:
			Between_My_accounts.get().transferU04ToC18_chequingAmount();
			break;

		case PermissibleTransfer_C11_To_U04:
			Between_My_accounts.get().transferCAD11ToU04_chequingAmount();
			break;

		case PermissibleTransfer_U05_To_C16:
			Between_My_accounts.get().transferU05ToCAD16_chequingAmount();
			break;

		case OrderReciept_OrdersIcon:
			OrderReciept.get().cancelOrdersIcon();
			break;

		case OrderDetails_CancelOrder:
			OrderDetails.get().cancelOrder();
			break;


		case ConfirmOrderReciept:
			OrderReciept.get().receipt();
			break;
			
		case VerifyPIAAccounts:
			Investing.get().verifyPIAAccounts();
			break;
			
		case VerifyCombinedAccounts:
			Investing.get().verifyCombinedAccounts();
			break;
			
		case VerifyNoTradingAccounts:
			Investing.get().verifyNoTradingAccounts();
			break;
			
		case VerifyNoEligibleAccounts:
			Investing.get().verifynoEligibleAccounts();
			break;
			
		case VerifyInvestingScreen:
			Investing.get().verifyInvestingScreen();
			break;
			
		case VerifyFPAccounts:
			Investing.get().verifyFPAccounts();
			break;
			
			

		case Verify_PIA_Account:
			Investing.get().verifyPIAorFPaccount();
			break;


		case Verify_FP_Account:
			Investing.get().verifyPIAorFPaccount();
			break;


		case Verify_Combined_Account:
			Investing.get().verifyCombinedAccount();
			break;
		
		case verifyErrorMessage:
			Investing.get().verifyErrorMessage();
			break;
			
			
		case Trade_verifyRelaventMatchInResult:
			Trade.get().verifyRelaventMatchInResult();
			break;
			

		case Trade_verifySymbol:
			Trade.get().verifySymbol();
			break;
			


		}

	}

	public void generateReport() {
	}

}
