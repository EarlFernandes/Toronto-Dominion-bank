package com.td;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;

import com.td.mainframe.Executor;
import com.td.test.CDNMobile.pages.Accounts;
import com.td.test.CDNMobile.pages.Accounts_Credit;
import com.td.test.CDNMobile.pages.AddCanadian_Payee;
import com.td.test.CDNMobile.pages.AddPayee;
import com.td.test.CDNMobile.pages.AddRecipient;
import com.td.test.CDNMobile.pages.ApplePay;
import com.td.test.CDNMobile.pages.Between_My_accounts;
import com.td.test.CDNMobile.pages.Bill_PayCanada;
import com.td.test.CDNMobile.pages.Bills;
import com.td.test.CDNMobile.pages.CardDetails;
import com.td.test.CDNMobile.pages.ConfirmOrder;
import com.td.test.CDNMobile.pages.Confirm_Payee;
import com.td.test.CDNMobile.pages.ContactUs;
import com.td.test.CDNMobile.pages.Credit;
import com.td.test.CDNMobile.pages.DepositCheque;
import com.td.test.CDNMobile.pages.FindLocations;
import com.td.test.CDNMobile.pages.HoldingDetails;
import com.td.test.CDNMobile.pages.HomeScreen;
import com.td.test.CDNMobile.pages.Interac_e_Registration;
import com.td.test.CDNMobile.pages.Interac_e_Transfer;
import com.td.test.CDNMobile.pages.Investing;
import com.td.test.CDNMobile.pages.InvestingAccountSummary;
import com.td.test.CDNMobile.pages.Login;
import com.td.test.CDNMobile.pages.LoginMIT;
import com.td.test.CDNMobile.pages.LoginPNP;
import com.td.test.CDNMobile.pages.Logout;
import com.td.test.CDNMobile.pages.MFA_ChangeAnswer;
import com.td.test.CDNMobile.pages.MLCancelOrderReceipt;
import com.td.test.CDNMobile.pages.MLChangeOrder;
import com.td.test.CDNMobile.pages.MLConfirmOrder;
import com.td.test.CDNMobile.pages.MLConfirmOrderReceipt;
import com.td.test.CDNMobile.pages.MLEnterOrderNegative;
import com.td.test.CDNMobile.pages.MLOptionChainTable;
import com.td.test.CDNMobile.pages.MLOrderDetails;
import com.td.test.CDNMobile.pages.ManageContacts;
import com.td.test.CDNMobile.pages.ManageRecipients;
import com.td.test.CDNMobile.pages.ManageSettings;
import com.td.test.CDNMobile.pages.Managee_Payee;
import com.td.test.CDNMobile.pages.MenuPage;
import com.td.test.CDNMobile.pages.MobileDeposit;
import com.td.test.CDNMobile.pages.MobilePayment;
import com.td.test.CDNMobile.pages.Multitasking_System;
import com.td.test.CDNMobile.pages.MutualFunds;
import com.td.test.CDNMobile.pages.Notifications;
import com.td.test.CDNMobile.pages.OrderDetails;
import com.td.test.CDNMobile.pages.OrderReciept;
import com.td.test.CDNMobile.pages.PayWithRewards;
import com.td.test.CDNMobile.pages.Pay_US_Bill;
import com.td.test.CDNMobile.pages.PendingInteracTransfer;
import com.td.test.CDNMobile.pages.Preferences;
import com.td.test.CDNMobile.pages.Profile;
import com.td.test.CDNMobile.pages.Profile_And_Settings;
import com.td.test.CDNMobile.pages.QuickAccess;
import com.td.test.CDNMobile.pages.QuickAccessPage;
import com.td.test.CDNMobile.pages.QuickAccessSettings;
import com.td.test.CDNMobile.pages.Receipt;
import com.td.test.CDNMobile.pages.Review;
import com.td.test.CDNMobile.pages.Rewards;
import com.td.test.CDNMobile.pages.SearchPage;
import com.td.test.CDNMobile.pages.SearchPageMIT;
import com.td.test.CDNMobile.pages.Security_Questions;
import com.td.test.CDNMobile.pages.StatementBalance;
import com.td.test.CDNMobile.pages.TDForMe;
import com.td.test.CDNMobile.pages.MoodSelectorScreen;
import com.td.test.CDNMobile.pages.Trade;
import com.td.test.CDNMobile.pages.TradeMIT;
import com.td.test.CDNMobile.pages.TradeMultiLeg;
import com.td.test.CDNMobile.pages.Transaction;
import com.td.test.CDNMobile.pages.Transfers;
import com.td.test.CDNMobile.pages.WatchLists;
import com.td.test.CDNMobile.pages.WhatsNew;

public class EventCase {

	private enum functionNames {

		Account_Home_Button, Account_Prefer_Button, Accounts_EW_WB_Functionality, Accounts_Header, Accounts_sessionTimedOut,

		Accounts_Verify_Page, Accounts_VerifyAccountsPage, Accounts_VerifyTFSA_Activity,AddVaildEmail,

		Add_Recipient_ErrorPage, AddCanadianPayee, AddPayee_SearchPayee, AddCard_MobilePayment, AddToTDMobilePayment, ApplePay_AddCard, ApplePay_SelectACard, ApplePay_CheckEligibleCard, ApplePay_ChangeDefaultCard, ApplePay_CheckPersonalCard, ApplePay_CheckBusinessCard,ApplePay_CheckDefaultCard,ApplePay_AddAllCards,ApplePay_OtherEligibleCards,Accounts_Credit_clickTransfer,

		Banking_Header,Bill_PayCanada_Pay_Bill,Between_My_Accounts_RTB_permissible_transfer,

		Between_My_accounts, Between_My_accounts_CanadianToUS, Between_My_accounts_exchange_rate_expired, Between_My_accounts_Exchange_Rate_Expired, Between_My_Accounts_LIRA, Between_My_accounts_Mobile_Rate_Expiry, Between_My_Accounts_Permissible_Transfer, Between_My_accounts_transfer, Between_My_Accounts_Transfer_less, Between_My_accounts_transfer_verify_receipt, Between_My_accounts_VerifyFromAccounts,

		BetweenMyAccounts_CADTFSA_TDCTTFSA, BetweenMyAccounts_MobileRateExpiryOnSmartphones, BetweenMyAccounts_NegativeTestingTransferFunds, BetweenMyAccounts_permissible_transfer_on_mobile, BetweenMyAccounts_TDCTTFSA_CADTFSA, BetweenMyAccounts_TDCTTFSAMessage, BetweenMyAccounts_TransferNotSupported, BetweenMyAccounts_TransferTDCTCADUSDVISA,

		Bill_PayCanada_AmountSelection, Bill_PayCanada_BillPaymentCurrentDate, Bill_PayCanada_PayBillCancel, Bill_PayCanada_VerifyBackButton, Bill_PayCanada_VerifyQuickAccess, Bills_ScheduledPayments, BillsHeader, BetweenMyAccounts_TFSAUSD_TFSACAD(),

		CanadianPayee_ConfirmPage, Cancel,

		CDNCash, CDNCash_Sell_StopMarket, CDNMargin_Buy, CDNMargin_Buy_TriggerDelta, CDNMargin_Sell_TrailingStopLimit, CDNMargin_Sell_TrailingStopMarket, CDNMarginLimit, CDNMarginLimitTradePreviewOrder,

		Check_Remember_Me_Default, ClickBack, clickChangeOrder, clickChangeorder_MarketToLimit, ClickContact, ClickDepositCheque, CardDetails_save,

		ClickMenu, ClickMenu_French, ClickMenuHome, clickMenuTrade, Confirm_order, Confirm_order_French, ClickPrivacy,ClickSave,ClickPhoneNumber,ClickClearText,ClickAddressDetail,ClickPopupGoBackButton,

		ConfirmOrderCancel, ConfirmOrderReciept, ConfirmOrderSendOrder, ConfirmOrderSendOrder_French, ConfirmPayee, ChangeDefaultCard, CardDetails_deleteicon, ConfirmPayee_InvalidAmount,EditEmailAddressWithInvalidChar,

		Dashboard_Authentication, Dashboard_UnAuthentication,

		Delete_usr, Deposit_Header, DepositChequeHeader, END,

		Env_set, Env_EnableMobilePayment,EditEmailAddressWithNonAformat,EditEmailAddressWithlonger60Char,EditEmailAddressWithNolonger60Char,EditEmailAddressWithoutSave,EditPhoneNumber,Env_DeleteDefaultCard,
		
		getProfileInformation,GetEmailAndPhoneNumber,ClickFeedback,	ClickContactUs_CF,VerifyMoodSelectorScreen,	VerifyEmotionsAnimateFromTopToBottom,ClickGreatLink,VerifyPostSurveyScreen,ClickCouldvebeenBetterLink,ClickItwasntWorkingLink,ClickBackFromMoodSelector, VerifyHomePageDashBoard, ClickContactUsFromHomePage, ClickSendFeedbackNow, ClickRateUsOnGooglePlay, VerifyGooglePlayRatePage, ClickBackFromPostSurvey, VerifyContactUsPageHeader,

		FlyOut_HOME, Flyout_Location, HoldingDetails_click_BuyButton, HoldingDetails_verify_Account_CADCash, HoldingDetails_verify_Account_US_MarginShort,

		HomeScreen_ClickAccounts, HomeScreen_ClickBills, HomeScreen_ClickDeposit, HomeScreen_clickInvestingFromHamburger, HomeScreen_ClickMarkets, HomeScreen_ClickQuickAccess, HomeScreen_ClickTrade, HomeScreen_clickTradeDashboard, HomeScreen_ClickTransfers, HomeScreen_ClickTransfersFrench, HomeScreen_clickWatchLists, HomeScreen_Investing, HomeScreen_Location_Details, HomeScreen_Transfer_Button, HomeScreen_WatchLists, HomeScreen_PayNow, Homescreen_ApplePay, HomeScreen_ClickTDMobilePayment,

		Interac_AddRecipient, Interac_e_Transfer_verify_interacTransfer, Interac_Header, InteracTransfer_Cancel, InteracTransfer_VerifyAmount,

		Investing_clickBackbtn, Investing_clickHoldings, Investing_clickInvestingAccount, Investing_clickInvestingAccounts,

		Investing_clickMarkets, Investing_clickOrderTab, Investing_clickPlacedorder, Investing_clickTrade, Investing_clickTrade_French, Investing_clickWatchLists, Investing_Header, Investing_verifyAdvanceorderdetails, Investingacc_verifySummary, InvestingHeader, IOS_Account_Home_Button,

		Login, Login_and_Logout, Login_clearPasswordField, Login_Error, Login_Ntimes, Login_PasswordFieldDelete, Login_usernameFieldDelete, Login_verifyPasswordField, Login_verifyUsernameField, login_without_tandc, LoginFrench, Loginverify, LoginWithRemember, Logout, LogoutFrench,LoginPNP,

		ManagePayee_AddCanadianPayee, ManagePayee_MutlipleAccesscard, ManagePayee_VerifyAddCanadianPayeeBtn, ManagePayees_Button, ManageRecipient_EditManageRecipient, ManageRecipient_ModifyRecipient, ManageRecipients_VerifyRegisterButton, mask_user,

		Menu_Accounts, Menu_ClickTransfersFrench, Menu_Investing, Menu_Investing_French, Menu_Location, Menu_Mobile_deposit, MenuBills, MenuTrade, MenuTradeEasyWebCustomer, MenuTransfer, Menu_ClickMobilePayment, MobilePayment_SwipeMobilePayment, MobilePayment_AddACard, MobilePayment_ClickSettings, ManagePayment_ManageSettings, ManageSettings_Changepasscode, ManageTDMobilePayment_Selectcard, CardDetails_ToggleButton, MobilePayment_InitialSwipe, MobilePayment_SecurityQuestion, MW_verifycard, MW_expire, MobilePayment_Settingsicon, MobilePayment_SetPasscode, ManagePayment_clickcard, MenuApplePay, MenuPage_FindLocations,Menu_Profile_And_Settings,

		MFA_Change, Mobile_Deposit, Multitasking_System,

		NavigationBackToProfileandSettingPage,NavigationToHomePage,
		
		OpenApp, OrderDetails_CancelOrder, OrderDetails_clickChangeorder, OrderDetailsLimitPrice, OrderDetailsPage_orderConfirmDetails, OrderDetailsPage_verifyStockChangeorderConfirmScreen, OrderDetailsTriggerPrice, OrderReciept_CancelOrderReceipt, OrderReciept_French, OrderReciept_orderdetailMutualfund, OrderReciept_orderDetails, OrderReciept_orders, OrderReciept_OrdersIcon, OrderReciept_ordertab, OrderReciept_updatemsg, OrderReciept_verifyOrderScreen, Ordertype_Cancel,OpenAppPNP,
		
		Pay_US_bill_From_US_Account, Pay_US_bill_FromCanada_Account, PayBill_Canada_Button, PayBill_US_Button, PayBill_VerifyAddCanadianPayeeBtn, PayBillCanada_Add_Canadian_Payee, PayCanada_NegativeTestingBillPayment, PayCanadaBill_Post_Dated, PayCanadaBillP_Pay_Candadian_Bill, PayCanadianBill_InvalidAmount,

		PendingInterac_e_Transfer, PendingInterac_e_Transfer_cancel, PendingInterac_e_Transfer_canceltransfer, PendingInterac_e_Transfer_confirm, PendingInterac_e_Transfer_confirmscreen, PendingInterac_e_Transfer_verifyconfirmation, PendingInterac_e_Transfer_verifylist, PendingInterac_e_Transfer_verifystatus, PendingInteracTransfer_verify_CancelPendingTransfer, passcode_Ntimes, Addicon,

		PermissibleTransfer, Preferences_Update_Question, QuickAccess, SearchPage_searchBar, Select_Account, SenderList_Cancel, Session_expired, SetupWalletPasscode,

		TDDirectInvestingContact, Trade_changeAccountTypeLongtoShortFre_French, Trade_clickAction, Trade_clickCross, Trade_clickFundFactLink, Trade_clickMutualFunds, Trade_clickMutualPreviewOrder, Trade_clickOnAgree, Trade_clickOnPreviewOrderBtn, Trade_clickOptions, Trade_clickOrderType, Trade_clickOrderType_French, Trade_clickQuantity, Trade_clickStockETFs, Trade_clickSymbol, Trade_clickSymbol_French, Trade_confirmCancelOrder, Trade_ConfirmSendOrder, Trade_createMutualfund, Trade_Details, Trade_enterAmount, Trade_enterAndSearch, Trade_enterTradingPassword, Trade_includesComission, Trade_Limit, Trade_nosearch, Trade_placeStockOrder, Trade_selectAccount, Trade_selectAcknowledgement, Trade_selectDividendOption, Trade_selectMutualQuantity, Trade_selectMutualSymbol, Trade_selectQuantity, Trade_sendOrder, Trade_trade_account, Trade_Trigger, Trade_verifyMutualConfirmDetails, Trade_verifymutualconfirmsell, Trade_verifyRelaventMatchInResult, Trade_verifysearchbar, Trade_verifySendOrderDisplayed, Trade_verifySendOrderState, Trade_verifySuccessMessage, Trade_verifySwitchMutualConfirmDetails, Trade_verifySymbol, Trade_verifyTrade, Trade_verifyTradeActionShortAccountFre_French, TradeAccount, TradeAccount_French, TradeAction, TradeAction_French, TradeAgree, TradeAgree_French, TradeDate, TradeGoodTill, TradeGoodTill_French, TradeHeader, TradeIcon, TradeLimitPrice, TradeMarginAccount, TradePreviewOrder, TradePreviewOrder_French, TradePrice, TradePrice_French, TradeQuantity, TradeQuantity_French, TradeShareHolder, TradeTriggerDelta, TradeTriggerPrice, TradeTriggerPrice_French, TradingPassword, TradingPassword_French,

		Trans_TFSA_To_Othr_Accounts, Transfer_InteracTransfer, TransferHeader, Transfers, Transfers_Click_Between_My_Accounts, Transfers_clickInterac_e_Transfer, Transfers_clickPendingInterac_e_Transfer, Transfers_ManageRecipients,
		
		Trade_click_MutualFunds,

		USMarAccLongToShort, USMarginShort_Buy_Market,

		verify_access_to_WB, Verify_account_activity_credit, Verify_Combined_Account, Verify_FP_Account, verify_login_5_times, Verify_PIA_Account, VerifyAccessCard, VerifyAccessCardDetails, VerifyActionFields, verifybill_landingpage, VerifyCombinedAccounts, verifyconfirm_order, VerifyDIAccounts, verifyErrorMessage, VerifyFPAccounts, VerifyIconDetails, VerifyInvestingScreen, VerifyNoEligibleAccounts, VerifyNoTradingAccounts, VerifyPIAAccounts, VerifyQuickIcons, VerifyReceipt, VerifySender, VerifySenderList, VerifyShareholderType, Verifytimestamp, VerifyTwoAccessCardDetails, VerifyUser, VerifyNickName, verifydefaultcard,View_profile,VerifyProfileHeader,VerifyContactInformationHeader,VerifyInitialNameforIndividual,VerifyInitialNameforBusinessUser,VerifyInitialNameInUpperCase,VerifyHomePhoneMasked,VerifyExtensionNotMasked,verifyProfileandSettingLandingPage,VerifyProfileNameLength,VerifyErrorMessage,VerifySecurityQuestionButton,VeirfySecuirtyQuestionPageheader,VerifyNotificationsButton,VeirfyNotificationsPageheader,VerifyQuickAccessSettings,VerifyQuickAccessSettingsHeader,VerifyTDForMeSettings,VerifyTDForMeSettingsHeader,VerifyWhatsNew,VerifyWhatsNewPageHeader,VerifyProfileAndSettingslink,VerifyEmailFormat,VerifyEmailIDLength,VerifyBlankEmailNotSuccesful,VerifyErrorMessageOrLength,VerifyEmailIDBlankorNot,VerifyEmailAddedSuccesful,VerifyPopUpWithCancelButton,VerifyClearTextIconDisplayed,VerifyPhoneNumberIsEmpty,VerifyTDForMeDisableSwitchFunction,VerifyTDForMeEnableSwitchFunction,ClickCustomizeNotificationlinkFromTDforMe, VerifyTDForMeNotificationPageHeader,VerifyQuickAccessSwitchWork,
		
		VerifyPlaceHolderDisplayed,VerifyToastmessageDisplayed,VerifyPhoneEmailNotChanged,verifyQuickAccessBillPaidUpdate,ClickBackFromAppOrGooglePage,Verify_quick_link_go_back_home, Verify_quick_link_view_myaccounts, Verify_error_screen, ClickCustomizeNotificationsLinkFromNotifications, VerififyTdforMeNotificationsHeader,VerifyEnableNotificationsSwitchFunction,
		

		WatchLists_addSymbolToWatchLists, WatchLists_clickSearchBar, WatchLists_Header, Watchlists_verify_newOrderFlow_Watchlists, WatchLists_verifyRecentSearches, WatchLists_verifySymbol, WatchLists_verifySymbolAdded,

		FindLoactions_VerifyFindlocations, BetweenMyAccounts_TransferChequeAccount, TradeLimitAndTriggerPrice,

		Accounts_SelectAccount, AccountsCredit_ClickPayBill, AccountsCredit_verifyLastTranaction, AccountsCredit_clickLastTranaction, Transaction_VerifyTransac, AccountsCredit_clickSummaryTab, AccountsCredit_VerifySummaryDetails, AccountsCredit_clickStatementTab, AccountsCredit_VeifyStatementDetails, StatementBalance_VerifyBalanceDetails, Bill_PayCanada_verifyCurrentBalance, Bill_PayCanada_PayBill, AccountsCredit_ClickTransfers

		// trade,
		, clickChangeorder_TSM_to_TSL, TradeTrailingStopMarket, TradeStopMarket, TradeStopMarketSell, TradeLimitDAYEXT, ClickWatchList, TradeStopLimit, OrderRecieptValidateBuy, Investing_ClickPlacedOrder, OrderDetails_Changeorder, TradeMarket, clickChangeorder_LimitToMarket, TradeLimit, TradeLimitAndTriggerDelta, TradeOrderType, TradeSymbol, TradeTrailingStopLimit, ConfirmOrderValidateBuy, verifyEmptyWatchList, ClickOrders, clickChangeorder_SM_to_SL, verifyShareHolder, confirmOrder_ClickBack, verifyBuyToCover, TradeStopLimitSell, ConfirmOrderDoNotCancel, ConfirmOrderImpInformation, ClickHoldingAndSymbol, changeOrderLimitDayToDayEXT,
		
		//MIT Multi-Leg
		OpenAppMIT,LoginMIT,
		tapInvesting,verifyDefaultStrategies,navigateToSearchScreen,selectTradeAccount_OrderType,verifySymbolUS,
		verifySymbolSearchResults,clickInvestingTrade,tapTradeSearchBar,clickFirstSymbol,
		verifyStockOptionContents,verifyOptionOptionContents,verifySelectOption,verifyStockMidNaturalPrice,verifyOptionMidNaturalPrice,
		verifyGoodTill,verifyGoodTillExpiryDate,verifySharehoderType,verifyStockOptionBackButton,verifyOptionOptionBackButton,
		verifyOptionOptionPreviewOrderButton,searchAndSelectAccount,submitStockOptionOrder,selectDateSpecify_Android,
		searchAndSelectAccountRapcode,verifyStockOptionFieldsReset,verifyOptionOptionFieldsReset,
		verifyOptionOptionFieldResetOrderTypeChanged,verifyStockOptionFieldResetOrderTypeChanged,verifyStockOptionConfirmOrder,
		verifyOptionOptionConfirmOrder,submitOptionOptionOrder,verifyStockOptionCancelOrderReceipt,verifyOptionOptionCancelOrderReceipt,
		verifyTradeOrderFormContent,verifyEntryOrderFormContent,verifyWarningMsgExchangeAgrNotSigned,
		verifyStockOptionConfirmOrderReceipt,verifyOptionOptionConfirmOrderReceipt,clickPostorderMyAccount,
		clickPostorderTrade,clickQuickLinkHome,clickQuickLinkTrade,clickQuickLinkOrder,verifyOptionOptionChainTableSubmit,
		verifyStockOptionChainTableSubmit,verifyStockOptionChainTableCancel,verifyOptionOptionChainTableCancel,
		verifyInvalidTradingPassword,verifyStockOptionChangeOrder,verifyOptionOptionChangeOrder,verifyStockOptionOrderDetails,verifyOptionOptionOrderDetails,
		Test,
		
		//P2P
		Transfers_clickManageContactsLink,
		ManageContacts_verifyPageHEader,
		Interac_e_Registration_clickContinueButton,
		Profile_And_Settings_clickPaymentsAndTransfers,
		Interac_e_Registration_verifyErrorText,
		Interac_e_Registration_registerPersonalUser,
		Interac_e_Registration_registerBusinessUser,
		Interac_e_Registration_registerMultiProfileUser,
		Interac_e_Registration_clickGoBackHome,
		Interac_e_Registration_verifyDetails,
		Interac_e_Registration_verifyBusinessDetails,
		Interac_e_Registration_verifyRegSuccessMessage,
		Interac_e_Registration_clickRegisterAnotherProfile,
		Executor_createPersonalProfile,
		Executor_createBusinessProfile,
		Executor_createMultiProfile,
		
		//Tetris Loyalty
		CreditHeader,
		ClickAccount,
		VerifyPayWithRewards,
		ClickStatementTab,
		Env_ClearSavedCards,
		ClickReward,
		RewardHeader,
		ClickPayWithRewards,
		PayWithRewardsHeader,
		ClickStatement,
		VerifyStatementBalanceHeader,
		VerifyAndClickPayWithRewardsBtn,
		ValidateAmount,
		VerifyMinAndMaxPaymentBtn,
		PayWithRewardsNotVisible,
		ValidateMinPayment,
		VerifyReviewHeader,
		ClickPayNowButton,
		ClickCancelButton,
		VerifyReceiptHeader,
		VerifyAmountRedeem,
		ClickSummaryTab,
		ClickVisitRewards,
		VerifyURL,
		VerifyRedemptionText,
		VerifyNoRewards,
		VerifyRewardsText,
		VerifyCashbackText,
		VerifyRewardsBtn,
		VerifyTextcashBack,
		VerifyEarnedAndRedeemed,
		VerifyNoRewardsInQuickAccess,
		ClickQuickAccessSettings,
		DisableCardInQuickAccess,
		VerifyNoCardInQuickAccess,
		VerifyDollarRewardBalance,
		VerifyNoEarnedAndRedeemed,
		VerifyDollarDecimalValue,
		VerifyAmountAndContinueIsDisabled,
		VerifyPayWithRewardsText,
		VerifyRewardPointstxt,
		VerifyRewardPayee,
		VerifyRedemptionDetails,
		VerifyCashBack
		
		
		
		
		
	}

	public void FuncCOREEventCase(String sFunctionname)
			throws IOException, NoSuchElementException, InterruptedException, Exception {

		switch (functionNames.valueOf(sFunctionname)) {
		case OpenApp:
			MainScreen.get().Splash_Conitnue();
			break;

		//// case USMarAccLongToShort:
		//// Trade.get().trade_USMarginAccountLongToShort();
		//// break;
		////
		//// case VerifyShareholderType:
		//// Trade.get().verifyShareHolderWithDiffAcc();
		//// break;
		////
		//// case VerifyActionFields:
		//// Trade.get().verifyActionShortSellandBuyToCover();
		//// break;
		//
		case CDNCash_Sell_StopMarket:
			ConfirmOrder.get().cdncash_sell_stopmarket();
			break;

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
		//
		//// case TradeHeader:
		//// Trade.get().verifyTrade();
		//// break;

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

		// case Trade_Trigger:
		// Trade.get().tradeDetails_TriggerDelta();
		// break;

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
			
		case ManageContacts_verifyPageHEader:
			ManageContacts.get().verifyPageHeader();
			break;
			
		case Interac_e_Registration_clickContinueButton:
			Interac_e_Registration.get().clickContinueButton();
			break;
			
		case Interac_e_Registration_verifyErrorText:
			Interac_e_Registration.get().verifyErrorMessage();
			break;

		case Interac_e_Registration_registerPersonalUser:
			Interac_e_Registration.get().registerPersonalUser();
			break;
			
		case Interac_e_Registration_registerBusinessUser:
			Interac_e_Registration.get().registerBusinessUser();
			break;
			
		case Interac_e_Registration_registerMultiProfileUser:
			Interac_e_Registration.get().registerMultiProfileUser();
			break;
			
		case Interac_e_Registration_clickGoBackHome:
			Interac_e_Registration.get().clickGoBackHome();
			break;
			
		case Interac_e_Registration_clickRegisterAnotherProfile:
			Interac_e_Registration.get().clickRegisterAnotherProfile();
			break;
			
		case Executor_createPersonalProfile:
			Executor.get().createPersonalProfile();
			break;
			
		case Executor_createBusinessProfile:
			Executor.get().createBusinessProfile();
			break;
			
		case Executor_createMultiProfile:
			Executor.get().createMultiProfile();
			break;
			
		case Interac_e_Registration_verifyDetails:
			Interac_e_Registration.get().verifyDetails();
			break;
			
		case Interac_e_Registration_verifyBusinessDetails:
			Interac_e_Registration.get().verifyBusinessDetails();
			break;
			
		case Interac_e_Registration_verifyRegSuccessMessage:
			Interac_e_Registration.get().verifyRegSuccessMsg();
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

		/*
		 * case OrderDetails_clickChangeorder:
		 * OrderDetails.get().performChangeorder(); break;
		 */

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
			// Trade.get().tradeDetails_marginAccount();
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
			// Trade.get().clickStockETFs();
			break;

		case Trade_Details:
			// Trade.get().tradeDetails();
			break;

		case Trade_clickOnAgree:
			 Trade.get().clickAgree();
			break;

		case Trade_verifyTrade:
			// Trade.get().verifyTrade();
			break;

		case Trade_selectQuantity:
			Trade.get().selectQuantity();
			break;

		case Transfers_clickInterac_e_Transfer:
			Transfers.get().clickInterac_e_Transfer();
			break;
			
		case Transfers_clickManageContactsLink:
			Transfers.get().clickManageContactsLink();
			break;

		case Interac_AddRecipient:
			Interac_e_Transfer.get().addRecipient();
			break;

		case Trade_clickOptions:
			// Trade.get().clickOptions();
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
			// Trade.get().clickMutualFunds();
			break;

		case Trade_Limit:
			// Trade.get().tradeDetails_Limit();
			break;

		case Trade_createMutualfund:
			// Trade.get().createMutualfund();
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

		case PermissibleTransfer:
			Between_My_accounts.get().permissible_transfer();
			break;

		case OrderReciept_OrdersIcon:
			OrderReciept.get().cancelOrdersIcon();
			break;

		/*
		 * case OrderDetails_CancelOrder:
		 * OrderDetails.get().performCancelOrder(); break;
		 */

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
			Investing.get().verifyPIAOrFPAccount();
			break;

		case Verify_FP_Account:
			Investing.get().verifyPIAOrFPAccount();
			break;

		case Verify_Combined_Account:
			Investing.get().verifyCombinedAccount();
			break;

		case verifyErrorMessage:
			Investing.get().verifyErrorMessage();
			break;

		case Trade_verifyRelaventMatchInResult:
			// Trade.get().verifyRelaventMatchInResult();
			break;

		case Trade_verifySymbol:
			// Trade.get().verifySymbol();
			break;

		case clickMenuTrade:
			MenuPage.get().clickMenuTrade();
			break;

		// added today
		case CDNMargin_Sell_TrailingStopMarket:
			ConfirmOrder.get().cdnmargin_sell_trailingstopmarket();
			break;

		case USMarginShort_Buy_Market:
			ConfirmOrder.get().usmarginshort_buytocover_market();
			break;

		case CDNMargin_Sell_TrailingStopLimit:
			ConfirmOrder.get().cdncash_sell_trailingstoplimit();
			break;

		// case clickChangeorder_MarketToLimit:
		//// Trade.get().clickChangeorder_MarketToLimit();
		// break;

		case Trade_changeAccountTypeLongtoShortFre_French:
			// Trade.get().changeAccountTypeLongtoShortFre();
			break;

		// case OrderDetailsPage_verifyStockChangeorderConfirmScreen:
		// OrderDetails.get().verifyStockChangeorderConfirmScreen();
		// break;

		case HoldingDetails_click_BuyButton:
			HoldingDetails.get().click_BuyButton();
			break;

		case Trade_placeStockOrder:
			// Trade.get().placeStockOrder();
			break;

		case HomeScreen_clickWatchLists:
			HomeScreen.get().clickWatchLists();
			break;

		case HomeScreen_Investing:
			HomeScreen.get().clickInvesting();
			break;

		case Watchlists_verify_newOrderFlow_Watchlists:
			WatchLists.get().verify_newOrderFlow_Watchlists();
			break;

		case Trade_clickQuantity:
			// Trade.get().clickQuantity();
			break;

		case TradeIcon:
			Investing.get().clickTradeIcon();
			break;

		case Ordertype_Cancel:
			// Trade.get().cancel_ordertype();
			break;

		case Cancel:
			// Trade.get().cancelbutton();
			break;

		case MenuTrade:
			HomeScreen.get().clickmenu_trade();
			break;

		case MenuTradeEasyWebCustomer:
			HomeScreen.get().menuTradeEasyWebCustomer();
			break;

		// case Trade_verifySuccessMessage:
		// Trade.get().verifySuccessMessage();
		// break;
		//
		// case Trade_selectAcknowledgement:
		// Trade.get().selectAcknowledgement();
		// break;
		//
		// case Trade_clickFundFactLink:
		// Trade.get().clickFundFactLink();
		// break;
		//
		// case Trade_verifySendOrderState:
		// Trade.get().verifySendOrderState();
		// break;
		//
		// case Trade_verifySendOrderDisplayed:
		// Trade.get().verifySendOrderDisplayed();
		// break;
		//
		// case Trade_verifymutualconfirmsell:
		// Trade.get().verifymutualconfirmsell();
		// break;
		//
		// case Trade_verifySwitchMutualConfirmDetails:
		// Trade.get().verifySwitchMutualConfirmDetails();
		// break;

		case PendingInteracTransfer_verify_CancelPendingTransfer:
			PendingInteracTransfer.get().verify_CancelPendingTransfer();
			break;

		case BetweenMyAccounts_MobileRateExpiryOnSmartphones:
			Between_My_accounts.get().mobileRateExpiryOnSmartphones();
			break;

		case BetweenMyAccounts_permissible_transfer_on_mobile:
			Between_My_accounts.get().permissible_transfer_on_mobile();
			break;

		// case Trade_verifysearchbar:
		// Trade.get().verifysearchbar();
		// break;
		//
		// case Trade_enterAndSearch:
		// Trade.get().enterAndSearch();
		// break;
		//
		// case Trade_nosearch:
		// Trade.get().nosearch();
		// break;

		case Investingacc_verifySummary:
			InvestingAccountSummary.get().verifySummaryScenario();
			break;

		case Investing_clickBackbtn:
			Investing.get().clickBackbtn();
			break;

		case HomeScreen_clickTradeDashboard:
			HomeScreen.get().clickTrade();
			break;

		// case Trade_clickCross:
		// Trade.get().clickCross();
		// break;

		case OrderReciept_updatemsg:
			OrderReciept.get().updatedReceipt();
			break;

		case ClickPrivacy:
			HomeScreen.get().clickPrivacy_Security();
			break;

		case HomeScreen_PayNow:
			HomeScreen.get().clickPayNow();
			break;

		case AddCard_MobilePayment:
			MobilePayment.get().addCard_MobilePayment();
			break;

		case AddToTDMobilePayment:
			MobilePayment.get().addToTDMobilePayment();
			break;

		case SetupWalletPasscode:
			MobilePayment.get().setupWalletPasscode();
			break;

		case VerifyNickName:
			MobilePayment.get().verifyNickName();
			break;

		case ChangeDefaultCard:
			MobilePayment.get().changeDefaultCard();
			break;

		case MW_verifycard:
			MobilePayment.get().verify_card();
			break;

		case MW_expire:
			MobilePayment.get().Pay_expire();
			break;

		case Menu_ClickMobilePayment:
			MenuPage.get().clickMobilePayment();
			break;

		case MobilePayment_SwipeMobilePayment:
			MobilePayment.get().swipeMobilePayment();
			break;

		case MobilePayment_SecurityQuestion:
			MobilePayment.get().securityQuestion();
			break;

		case MobilePayment_AddACard:
			MobilePayment.get().addACard();
			break;

		case MobilePayment_ClickSettings:
			MobilePayment.get().clickSettings();
			break;

		case ManagePayment_ManageSettings:
			MobilePayment.get().managesettings();
			break;

		case ManageSettings_Changepasscode:
			ManageSettings.get().changePasscode();
			break;

		case ManageTDMobilePayment_Selectcard:
			MobilePayment.get().selectcard();
			break;

		case CardDetails_ToggleButton:
			CardDetails.get().enableToggleButton();
			break;

		case MobilePayment_InitialSwipe:
			MobilePayment.get().InitialSwipe();
			break;

		case HomeScreen_ClickTDMobilePayment:
			HomeScreen.get().clickt_tdmobilepayment();
			break;

		case MobilePayment_Settingsicon:
			MobilePayment.get().clicksettingsicon();
			break;

		case MobilePayment_SetPasscode:
			MobilePayment.get().click_enablepasscode();
			break;

		case verifydefaultcard:
			MobilePayment.get().verifydefaultcard();
			break;

		case passcode_Ntimes:
			MobilePayment.get().IncorrectPasscode_Ntimes();
			break;

		case CardDetails_deleteicon:
			CardDetails.get().deletecard();
			break;

		case Homescreen_ApplePay:
			HomeScreen.get().clickApplePay();
			break;

		case MenuApplePay:
			MenuPage.get().clickApplePay();
			break;

		case Env_EnableMobilePayment:
			Env_Settings.get().enableMobilePayment();
			break;

		case ApplePay_AddCard:
			ApplePay.get().clickAddCard();
			break;

		case ApplePay_SelectACard:
			ApplePay.get().selectCard();
			break;

		case ApplePay_CheckEligibleCard:
			ApplePay.get().checkEligibleCard();
			break;
		case ApplePay_ChangeDefaultCard:
			ApplePay.get().changeDefaultCard();
			break;

		case ApplePay_CheckPersonalCard:
			ApplePay.get().checkPersonalCard();
			break;

		case Env_ClearSavedCards:
			Env_Settings.get().clearSavedCards();
			break;
				

		case ApplePay_CheckBusinessCard:
			ApplePay.get().checkBusinessCard();
			break;

		case PayCanadianBill_InvalidAmount:
			Bill_PayCanada.get().payCanadianBill_InvalidAmount();
			break;

		case ConfirmPayee_InvalidAmount:
			Confirm_Payee.get().ConfirmPayee_InvalidAmount();
			break;

		case MenuPage_FindLocations:
			MenuPage.get().clickFindLocations();
			break;

		case FindLoactions_VerifyFindlocations:
			FindLocations.get().verifyFindLocations();
			break;

		case BetweenMyAccounts_TransferTDCTCADUSDVISA:
			Between_My_accounts.get().transferTDCTCad_USDVisa();
			break;

		case BetweenMyAccounts_TFSAUSD_TFSACAD:
			Between_My_accounts.get().transfer_TFSAUSD_TFSACAD();
			break;

		case Addicon:
			MobilePayment.get().addacard();
			break;

		case Accounts_SelectAccount:
			Accounts.get().selectAccount();
			break;

		case AccountsCredit_ClickPayBill:
			Accounts_Credit.get().clickPayBill();
			break;

		case AccountsCredit_verifyLastTranaction:
			Accounts_Credit.get().verifyLatestTransactions();
			break;

		case AccountsCredit_clickLastTranaction:
			Accounts_Credit.get().clickLastTransac();
			break;

		case Transaction_VerifyTransac:
			Transaction.get().verifyTransac();
			break;

		case AccountsCredit_clickSummaryTab:
			Accounts_Credit.get().clickSummary();
			break;

		case AccountsCredit_VerifySummaryDetails:
			Accounts_Credit.get().verifySummaryDetails();
			break;

		case AccountsCredit_clickStatementTab:
			Accounts_Credit.get().clickStatement();
			break;

		case AccountsCredit_VeifyStatementDetails:
			Accounts_Credit.get().verifyStatementDetails();
			break;

		case StatementBalance_VerifyBalanceDetails:
			StatementBalance.get().verifyStatementBalanceDetails();
			break;

		case Bill_PayCanada_verifyCurrentBalance:
			Bill_PayCanada.get().verifyCurrentBalance();
			break;

		// case Bill_PayCanada_PayBill:
		// Bill_PayCanada.get().payBill();
		// break;

		case AccountsCredit_ClickTransfers:
			Accounts_Credit.get().clickTransfer();
			break;

		// case BetweenMyAccounts_TransferChequeAccount:
		// Between_My_accounts.get().transferChequeAccount();
		// break;

		case TradeOrderType:
			Trade.get().selectOrderType();
			break;

		case TradeSymbol:
			Trade.get().selectAndEnterSymbol();
			break;
		case TradeAccount:
			Trade.get().selectAccount();
			break;

		case TradeAction:
			Trade.get().selectAction();
			break;

		case TradeQuantity:
			Trade.get().selectQuantity();
			break;

		case TradePrice:
			Trade.get().selectPrice();
			break;

		case TradeGoodTill:
			Trade.get().selectGoodTill();
			break;

		case TradeShareHolder:
			Trade.get().selectShareHolder();
			break;

		case TradingPassword:
			Trade.get().enterTradingPassword();
			break;

		case TradePreviewOrder:
			Trade.get().clickPreviewOrder();
			break;

		case TradeAgree:
			Trade.get().clickAgree();
			break;

		case TradeTriggerDelta:
			Trade.get().enterTriggerDelta();
			break;

		case TradeLimitPrice:
			Trade.get().enterLimitPrice();
			break;

		case TradeLimitAndTriggerDelta:
			Trade.get().enterLimitAndTriggerDelta();
			break;

		case TradeTriggerPrice:
			Trade.get().enterTriggerPrice();
			break;

		case TradeLimitAndTriggerPrice:
			Trade.get().enterlimitAndTriggerPrice();
			break;

		case TradeLimitDAYEXT:
			Trade.get().limitDAYEXT();
			break;

		case TradeStopLimit:
			Trade.get().stopLimit();
			break;
		case TradeTrailingStopLimit:
			Trade.get().trailingStopLimit();
			break;

		case TradeTrailingStopMarket:
			Trade.get().trailingStopMarket();
			break;

		case TradeStopMarket:
			Trade.get().stopMarket();
			break;

		case TradeStopMarketSell:
			Trade.get().stopMarketSell();
			break;

		case TradeStopLimitSell:
			Trade.get().stopMarketSell();
			break;
		case TradeMarket:
			Trade.get().market();
			break;

		case TradeLimit:
			Trade.get().limit();
			break;

		case ConfirmOrderCancel:
			ConfirmOrder.get().clickCancel();
			break;

		case ConfirmOrderDoNotCancel:
			ConfirmOrder.get().clickDoNotCancel();
			break;

		case ConfirmOrderImpInformation:
			ConfirmOrder.get().checkImpInformation();
			break;

		case ConfirmOrderValidateBuy:
			ConfirmOrder.get().validateConfirmOrderBuy();
			break;

		case OrderRecieptValidateBuy:
			OrderReciept.get().validateConfirmOrderBuy();
			break;

		case clickChangeorder_MarketToLimit:
			Trade.get().changeOrderMarketToLimit();
			break;

		case clickChangeorder_LimitToMarket:
			Trade.get().changeOrderLimitToMarket();
			break;

		case clickChangeorder_TSM_to_TSL:
			Trade.get().changeOrderTSM_To_TSL();
			break;

		case clickChangeorder_SM_to_SL:
			Trade.get().changeOrderSM_To_SL();
			break;

		case Investing_ClickPlacedOrder:
			Investing.get().clickPlacedOrder();
			break;

		case OrderDetails_Changeorder:
			OrderDetails.get().performChangeorder();
			break;

		case verifyEmptyWatchList:
			Investing.get().verifyEmptyWatchLists();
			break;

		case ClickOrders:
			OrderReciept.get().clickOrders();
			break;

		case verifyShareHolder:
			Trade.get().verifyShareHolder();
			break;

		case confirmOrder_ClickBack:
			ConfirmOrder.get().confirmOrderClickBack();
			break;

		case verifyBuyToCover:
			Trade.get().verifyBuyToCover();
			break;

		case ClickHoldingAndSymbol:
			Investing.get().clickHoldingAndSymbol();
			break;

		case changeOrderLimitDayToDayEXT:
			Trade.get().changeOrderLimitDayToDayEXT();
			break;
			
			
			//Mutual Funds
			
		case Trade_click_MutualFunds:
			MutualFunds.get().clickMutualFunds();
			break;

		case Trade_trade_account:
			MutualFunds.get().trade_account();
			break;

		case Trade_clickAction:
			MutualFunds.get().clickAction();
			break;

		case Trade_selectMutualSymbol:
			MutualFunds.get().selectMutualSymbol();
			break;

		case Trade_selectMutualQuantity:
			MutualFunds.get().selectMutualQuantity();
			break;

		case Trade_enterAmount:
			MutualFunds.get().enterAmount();
			break;

		case Trade_includesComission:
			MutualFunds.get().includesComission();
			break;

		case Trade_selectDividendOption:
			MutualFunds.get().selectDividendOption();
			break;

		case Trade_enterTradingPassword:
			MutualFunds.get().enterTradingPassword();
			break;

		case Trade_clickMutualPreviewOrder:
			MutualFunds.get().clickMutualPreviewOrder();
			break;

		case Trade_verifyMutualConfirmDetails:
			MutualFunds.get().verifyMutualConfirmDetails();
			break;

		case Trade_ConfirmSendOrder:
			MutualFunds.get().ConfirmSendOrder();
			break;

		case Trade_confirmCancelOrder:
			MutualFunds.get().confirmCancelOrder();
			break;

		case Trade_verifySuccessMessage:
			MutualFunds.get().verifySuccessMessage();
			break;

		case Trade_selectAcknowledgement:
			MutualFunds.get().selectAcknowledgement();
			break;

		case Trade_clickFundFactLink:
			MutualFunds.get().clickFundFactLink();
			break;

		case Trade_verifySendOrderState:
			MutualFunds.get().verifySendOrderState();
			break;

		case Trade_verifySendOrderDisplayed:
			MutualFunds.get().verifySendOrderDisplayed();
			break;
			
		case Trade_clickOrderType:
			Trade.get().selectOrderType();
			break;

		case Trade_clickSymbol:
			Trade.get().selectAndEnterSymbol();
			break;
		
			//profile and preference

		case OpenAppPNP:
			MainScreenPNP.get().Splash_Conitnue();
		    break;
		    
		case LoginPNP:
		    LoginPNP.get().PNPLogin();
		    break;
		    
		case Menu_Profile_And_Settings:
		    MenuPage.get().clickProfileAndSettings();
		    break;	    

		case Profile_And_Settings_clickPaymentsAndTransfers:
		    Profile_And_Settings.get().clickPaymentsAndTransfers();
		    break;
		    
	    case View_profile:
		    Profile_And_Settings.get().view_profile();
		    break;	 	    
			
	    case VerifyProfileHeader:
		    Profile.get().verify_profile_header();
		    break;	

	    case VerifyContactInformationHeader:
		    Profile.get().verify_contact_information_header();
		    break;	
		    
	    case getProfileInformation:
		    Profile.get().get_profile_info();
		    break;	

	    case VerifyInitialNameforIndividual:
		    Profile.get().VerifyInitialNameforIndividual();
		    break;
		    
	    case VerifyInitialNameforBusinessUser:
		    Profile.get().VerifyInitialNameforBusinessUser();
		    break;
		    
	    case VerifyInitialNameInUpperCase:
		    Profile.get().VerifyInitialNameInUpperCase();
		    break;	
		    	    
	    case VerifyHomePhoneMasked:
		    Profile.get().VerifyHomePhoneMasked();
		    break;	

	    case VerifyExtensionNotMasked:
		    Profile.get().VerifyExtensionNotMasked();
		    break;	
		    
	    case verifyProfileandSettingLandingPage:
	    	Profile_And_Settings.get().verifyProfileandSettingLandingPage();
		    break;	

	    case VerifyProfileNameLength:
	    	Profile.get().VerifyProfileNameLength();
		    break;	
		    
	    case EditEmailAddressWithInvalidChar:
	    	Profile.get().EditEmailAddressWithInvalidChar();
		    break;	

		    
	    case VerifyErrorMessage:
	    	Profile.get().VerifyErrorMessage();
		    break;	
		   	    
	    case VerifySecurityQuestionButton:
	    	Profile_And_Settings.get().VerifySecurityQuestionButton();
		    break;	
		
	    case VeirfySecuirtyQuestionPageheader:
	    	Security_Questions.get().VerifySecurityQuestionHeader();
		    break;
		    
		    
	    case VerifyNotificationsButton:
	    	Profile_And_Settings.get().VerifyNotificationsButton();
		    break;		    

	    case VeirfyNotificationsPageheader:
	    	Notifications.get().VerifyNotificationsPageHeader();
		    break;
		    
	    case ClickCustomizeNotificationsLinkFromNotifications:
	    	Notifications.get().ClickCustomizeNotificationsLink();
		    break;

	    case VerififyTdforMeNotificationsHeader:
	    	Notifications.get().VerififyTdforMeNotificationsHeader();
		    break;

	    case VerifyEnableNotificationsSwitchFunction:
	    	Notifications.get().VerifyEnableNotificationsSwitchFunction();
		    break;
		    		    
	    case VerifyQuickAccessSettings:
	    	Profile_And_Settings.get().VerifyQuickAccessSettings();
		    break;		    

	    case VerifyQuickAccessSettingsHeader:
	    	QuickAccess.get().VerifyQuickAccessSettingsHeader();
		    break;	
		    
	    case VerifyQuickAccessSwitchWork:
	    	QuickAccess.get().VerifyQuickAccessSwitchWork();
		    break;	
		    
	    case VerifyTDForMeSettings:
	    	Profile_And_Settings.get().VerifyTDForMeSettings();
		    break;		    

	    case VerifyTDForMeSettingsHeader:
	    	TDForMe.get().VerifyTDForMeSettingsHeader();
		    break;

		    
	    case VerifyTDForMeDisableSwitchFunction:
	    	TDForMe.get().VerifyTDForMeDisableSwitchFunction();
		    break;

	    case VerifyTDForMeEnableSwitchFunction:
	    	TDForMe.get().VerifyTDForMeEnableSwitchFunction();
		    break;

	    case ClickCustomizeNotificationlinkFromTDforMe:
	    	TDForMe.get().ClickCustomizeNotificationlink();
		    break;
		    
	    case VerifyTDForMeNotificationPageHeader:
	    	TDForMe.get().VerifyTDForMeNotificationPageHeader();
		    break;
		    
	    case VerifyWhatsNew:
	    	Profile_And_Settings.get().VerifyWhatsNew();
		    break;		    

	    case VerifyWhatsNewPageHeader:
	    	WhatsNew.get().VerifyWhatsNewPageHeader();
		    break;	
		    
	    case VerifyProfileAndSettingslink:
	    	MenuPage.get().VerifyProfileAndSettingslink();
		    break;	
		            
	    case VerifyEmailFormat:
	    	Profile.get().VerifyEmailFormat();
		    break;	

	    case VerifyEmailIDLength:
	    	Profile.get().VerifyEmailIDLength();
		    break;

	    case VerifyBlankEmailNotSuccesful:
	    	Profile.get().VerifyBlankEmailNotSuccesful();
		    break;	
		    
	    case NavigationBackToProfileandSettingPage:
	    	Profile.get().NavigationBackToProfileandSettingPage();
	    	//mobileAction.FuncClickBackButton();
		    break;	
		       
	    case EditEmailAddressWithNonAformat:
	    	Profile.get().EditEmailAddressWithNonAformat();
		    break;	
		    
	    case EditEmailAddressWithlonger60Char:
	    	Profile.get().EditEmailAddressWithlonger60Char();
		    break;	    

	    case EditEmailAddressWithNolonger60Char:
	    	Profile.get().EditEmailAddressWithNolonger60Char();
		    break;  
		    
		    
	    case VerifyErrorMessageOrLength:
	    	Profile.get().VerifyErrorMessageOrLength();
		    break; 
		    
	    case VerifyEmailIDBlankorNot:
	    	Profile.get().VerifyEmailIDBlankorNot();
		    break;	

	    case VerifyEmailAddedSuccesful:
	    	Profile.get().VerifyEmailAddedSuccesful();
		    break;	
		    
	    case VerifyPopUpWithCancelButton:
	    	Profile.get().VerifyPopUpWithCancelButton();
		    break;
		    
	    case EditEmailAddressWithoutSave:
	    	Profile.get().EditEmailAddressWithoutSave();
		    break;
		    
	    case NavigationToHomePage:
	    	Accounts.get().NavigationToHomePage();
		    break;
		    		    
	    case ClickSave:
	    	Profile.get().pressSaveButton();
		    break;	
		    
	    case AddVaildEmail:
	    	Profile.get().AddVaildEmail();
		    break;
		    
	    case ClickPhoneNumber:
	    	Profile.get().ClickPhoneNumber();
		    break;

	    case VerifyClearTextIconDisplayed:
	    	Profile.get().VerifyClearTextIconDisplayed();
		    break;

	    case ClickClearText:
	    	Profile.get().ClickClearText();
		    break;

	    case VerifyPhoneNumberIsEmpty:
	    	Profile.get().VerifyPhoneNumberIsEmpty();
		    break;		    
		    
	    case VerifyPlaceHolderDisplayed:
	    	Profile.get().VerifyPlaceHolderDisplayed();
		    break;

	    case EditPhoneNumber:
	    	Profile.get().EditPhoneNumber();
		    break;
		      
	    case ClickAddressDetail:
	    	Profile.get().ClickAddressDetail();
		    break;		    
		    
	    case VerifyToastmessageDisplayed:
	    	Profile.get().VerifyToastmessageDisplayed();
		    break;		    
		    
	    case GetEmailAndPhoneNumber:
	    	Profile.get().GetEmailAndPhoneNumber();
		    break;		    
		    
	    case ClickPopupGoBackButton:
	    	Profile.get().ClickPopupGoBackButton();
		    break;		    
		    
	    case VerifyPhoneEmailNotChanged:
	    	Profile.get().VerifyPhoneEmailNotChanged();
		    break;		    

	    case  ClickFeedback:
	    	MenuPage.get().ClickFeedback();
		    break;			    
		    		
	    case  ClickContactUs_CF:
	    	MenuPage.get().ClickContactUs_CF();
		    break;	
		    		    
	    case  VerifyMoodSelectorScreen:
	    	MoodSelectorScreen.get().VerifyMoodSelectorScreen();
		    break;   
		    
	    case  VerifyEmotionsAnimateFromTopToBottom:
	    	MoodSelectorScreen.get().VerifyEmotionsAnimateFromTopToBottom();
		    break; 
		    
	    case  ClickGreatLink:
	    	MoodSelectorScreen.get().ClickGreatLink();
		    break; 
		    
	    case  VerifyPostSurveyScreen:
	    	MoodSelectorScreen.get().VerifyPostSurveyScreen();
		    break; 
		    
	    case  ClickCouldvebeenBetterLink:
	    	MoodSelectorScreen.get().ClickCouldvebeenBetterLink();
		    break; 		    
		    
	    case  ClickItwasntWorkingLink:
	    	MoodSelectorScreen.get().ClickItwasntWorkingLink();
		    break; 	
		    
		    
	    case  ClickBackFromMoodSelector:
	    	MoodSelectorScreen.get().ClickBackFromMoodSelector();
		    break; 
		    
	    case  VerifyHomePageDashBoard:
	    	HomeScreen.get().VerifyHomePageDashBoard();
		    break;

	    case  ClickContactUsFromHomePage:
	    	HomeScreen.get().ClickContactUsFromHomePage();
		    break;
		        

	    case  ClickSendFeedbackNow:
	    	MoodSelectorScreen.get().ClickSendFeedbackNow();
		    break; 

	    case  ClickRateUsOnGooglePlay:
	    	MoodSelectorScreen.get().ClickRateUsOnGooglePlayOrAppStore();
		    break; 

	    case  VerifyGooglePlayRatePage:
	    	MoodSelectorScreen.get().VerifyGooglePlayRatePage();
		    break; 

	    case  ClickBackFromPostSurvey:
	    	MoodSelectorScreen.get().ClickBackFromPostSurvey();
		    break;		    
		        
	    case  VerifyContactUsPageHeader:
	    	ContactUs.get().VerifyContactUsPageHeader();
		    break;	
		    		    
	    case  ClickBackFromAppOrGooglePage:
	    	MoodSelectorScreen.get().ClickBackFromAppOrGooglePage();
		    break;	
		    		    
	    case  Verify_quick_link_go_back_home:
	    	MoodSelectorScreen.get().Verify_quick_link_go_back_home();
		    break;	

	    case  Verify_quick_link_view_myaccounts:
	    	MoodSelectorScreen.get().Verify_quick_link_view_myaccounts();
		    break;	

	    case  Verify_error_screen:
	    	MoodSelectorScreen.get().Verify_error_screen();
		    break;	
		    
		//end of profile and preference

	    case Trade_clickCross:
			//Trade.get().clickCross();
			break;

		//MIT Multi-Leg switch cases START
		case OpenAppMIT:
			MainScreenMIT.get().OpenApp();
		break;
	
		case LoginMIT:
			LoginMIT.get().MITLogin();
		break;	
		
		case tapInvesting:
			MainScreenMIT.get().tapInvesting();
		break;
		case clickInvestingTrade:
			TradeMIT.get().clickInvestingTrade();
		break;	

		case verifyDefaultStrategies:
			TradeMIT.get().verifyDefaultStrategies();
		break;	
		
		case selectTradeAccount_OrderType:
			TradeMIT.get().selectTradeAccount_OrderType();
		break;	
		case navigateToSearchScreen:
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().verifySearchScreen();
		break;				
		
		case verifySymbolUS:
			SearchPageMIT.get().verifySymbolUS();
		break;	
		case verifySymbolSearchResults:
			SearchPageMIT.get().verifySymbolSearchResults();
		break;
		
		case verifyStockOptionContents:
			TradeMIT.get().tapTradeSearchBar();
			TradeMultiLeg.get().verifyStockOptionContents();
		break;	
		case verifyOptionOptionContents:
			TradeMIT.get().tapTradeSearchBar();
			TradeMultiLeg.get().verifyOptionOptionContents();
		break;	
		
		case verifySelectOption:
			TradeMIT.get().tapTradeSearchBar();
			TradeMultiLeg.get().verifySelectOption();
		break;	
		
		case verifyStockMidNaturalPrice:
			TradeMIT.get().tapTradeSearchBar();
			TradeMultiLeg.get().verifyStockMidNaturalPrice();
		break;	
		
		case verifyOptionMidNaturalPrice:
			TradeMIT.get().tapTradeSearchBar();
			TradeMultiLeg.get().verifyOptionMidNaturalPrice();
		break;	
		
		case tapTradeSearchBar:
			TradeMIT.get().tapTradeSearchBar();
		break;	
		
		case clickFirstSymbol:
			SearchPageMIT.get().clickFirstSymbol();
		break;	

		case verifyGoodTill:
			TradeMultiLeg.get().verifyGoodTill();
		break;	
		
		case verifyGoodTillExpiryDate:
			TradeMultiLeg.get().verifyGoodTillExpiryDate();
		break;
		case verifySharehoderType:
			TradeMultiLeg.get().verifySharehoderType();
		break;
		
		case verifyStockOptionBackButton:
			TradeMultiLeg.get().verifyStockOptionBackButton();
		break;
		
		case verifyOptionOptionBackButton:
			TradeMultiLeg.get().verifyOptionOptionBackButton();
		break;
		
		case verifyOptionOptionPreviewOrderButton:
			TradeMultiLeg.get().verifyOptionOptionPreviewOrderButton();
		break;
		case searchAndSelectAccountRapcode:
			MLEnterOrderNegative.get().searchAndSelectAccountRapcode();
		break;
		case submitStockOptionOrder:
			TradeMultiLeg.get().submitStockOptionOrder();
		break;
		
		case submitOptionOptionOrder:
			TradeMultiLeg.get().submitOptionOptionOrder();
		break;
		
		case verifyStockOptionFieldsReset:
			TradeMultiLeg.get().verifyStockOptionFieldsReset();
		break;
		
		case verifyOptionOptionFieldsReset:
			TradeMultiLeg.get().verifyOptionOptionFieldsReset();
		break;
		
		case verifyOptionOptionFieldResetOrderTypeChanged:
			TradeMultiLeg.get().verifyOptionOptionFieldResetOrderTypeChanged();
		break;
		
		case verifyStockOptionFieldResetOrderTypeChanged:
			TradeMultiLeg.get().verifyStockOptionFieldResetOrderTypeChanged();
		break;
		
		case verifyStockOptionConfirmOrder:
			MLConfirmOrder.get().verifyStockOptionConfirmOrder();
		break;
		
		case verifyOptionOptionConfirmOrder:
			MLConfirmOrder.get().verifyOptionOptionConfirmOrder();
		break;
		
		case verifyStockOptionCancelOrderReceipt:
			MLCancelOrderReceipt.get().verifyStockOptionCancelOrderReceipt();
		break;
		
		case verifyOptionOptionCancelOrderReceipt:
			MLCancelOrderReceipt.get().verifyOptionOptionCancelOrderReceipt();
		break;	
		
		case verifyTradeOrderFormContent:
			TradeMultiLeg.get().verifyTradeOrderFormContent();
		break;
		
		case verifyEntryOrderFormContent:
			TradeMultiLeg.get().verifyEntryOrderFormContent();
		break;
		
		case verifyWarningMsgExchangeAgrNotSigned:
			TradeMultiLeg.get().verifyWarningMsgExchangeAgrNotSigned();
		break;
		
		case verifyStockOptionConfirmOrderReceipt:
			MLConfirmOrderReceipt.get().verifyStockOptionConfirmOrderReceipt();
		break;
		
		case verifyOptionOptionConfirmOrderReceipt:
			MLConfirmOrderReceipt.get().verifyOptionOptionConfirmOrderReceipt();
		break;
		
		case clickPostorderMyAccount:
			MLConfirmOrderReceipt.get().clickPostorderMyAccount();
		break;
	
		case clickPostorderTrade:
			MLConfirmOrderReceipt.get().clickPostorderTrade();
		break;
		
		case clickQuickLinkHome:
			MLConfirmOrderReceipt.get().clickQuickLinkHome();
		break;
		
		case clickQuickLinkTrade:
			MLConfirmOrderReceipt.get().clickQuickLinkTrade();
		break;
		
		case clickQuickLinkOrder:
			MLConfirmOrderReceipt.get().clickQuickLinkOrder();
		break;
		
		case verifyOptionOptionChainTableSubmit:
			MLOptionChainTable.get().verifyOptionOptionChainTableSubmit();
		break;
		
		case verifyStockOptionChainTableSubmit:
			MLOptionChainTable.get().verifyStockOptionChainTableSubmit();
		break;
		
		case verifyOptionOptionChainTableCancel:
			MLOptionChainTable.get().verifyOptionOptionChainTableCancel();
		break;
		
		case verifyStockOptionChainTableCancel:
			MLOptionChainTable.get().verifyStockOptionChainTableCancel();
		break;
		
		case verifyInvalidTradingPassword:
			MLEnterOrderNegative.get().verifyInvalidTradingPassword();
		break;
		
		case verifyStockOptionChangeOrder:
			MLChangeOrder.get().verifyStockOptionChangeOrder();
		break;
		
		case verifyOptionOptionChangeOrder:
			MLChangeOrder.get().verifyOptionOptionChangeOrder();
		break;
		
		case verifyStockOptionOrderDetails:
			MLOrderDetails.get().verifyStockOptionOrderDetails();
		break;
		
		case verifyOptionOptionOrderDetails:
			MLOrderDetails.get().verifyOptionOptionOrderDetails();
		break;
		
		case Test:
			MLConfirmOrder.get().Test();
		break;
		//MIT Multi-Leg Switch Cases END
		
		case Env_DeleteDefaultCard:
			Env_Settings.get().deleteDefaultCard();
			break;
			
		case ApplePay_CheckDefaultCard:
			ApplePay.get().checkDefaultCard();
			break;
			
		case ApplePay_AddAllCards:
			ApplePay.get().addAllCards();
			break;
			
		case ApplePay_OtherEligibleCards:
			ApplePay.get().otherEligibleCards();
			break;
	
		case Bill_PayCanada_Pay_Bill:
			Bill_PayCanada.get().pay_bill();
			break;	
			
		case Accounts_Credit_clickTransfer:
			Accounts_Credit.get().clickTransfer();
			break;

		case Between_My_Accounts_RTB_permissible_transfer:
			Between_My_accounts.get().RTB_permissible_transfer();
			break;
			
		case verifyQuickAccessBillPaidUpdate:
			QuickAccessPage.get().verifyQuickAccessBillPaidUpdate();
			break;	
			
		
		case OrderDetails_CancelOrder:
			//OrderDetails.get().cancelOrder();
			break;

		case OrderDetails_clickChangeorder:
			//OrderDetails.get().clickChangeorder();
			break;

		case TradeHeader:
			//Trade.get().verifyTrade();
			break;

		case Trade_Trigger:
			//Trade.get().tradeDetails_TriggerDelta();
			break;
			
	//Tetris start
			
		case VerifyPayWithRewards:
			Bill_PayCanada.get().verifyPayWithRewards();
			break;
			
		case ClickAccount:
			Accounts.get().selectAccountInAccountSheet();
			break;
			
		case CreditHeader:
			Credit.get().credit_Header();
			break;
			
			
		case ClickStatementTab:
			Credit.get().clickStatmentTab();
			break;
			
		case ClickReward:
			Credit.get().clickReward();
			break;
			
		case RewardHeader:
			Rewards.get().reward_Header();
			break;
			
		case ClickPayWithRewards:
			Rewards.get().clickPayWithRewardsIFVisible();
			break;
			
		case PayWithRewardsHeader:
			PayWithRewards.get().verifyPayWithRewardsHeader();
		break;
		
		case ClickStatement:
			Credit.get().clickStatment();
			break;

		case VerifyStatementBalanceHeader:
			StatementBalance.get().verifyStatementBalanceHeader();
			break;
			
		case VerifyAndClickPayWithRewardsBtn:
			StatementBalance.get().verifyAndClickPayWithRewardsButton();
			break;
			
		case ValidateAmount:
			PayWithRewards.get().validateAndEnterAmount();
			break;
			
		case VerifyMinAndMaxPaymentBtn:
			PayWithRewards.get().validateMinAndMaxButton();
			break;
			
		case PayWithRewardsNotVisible:
			Rewards.get().payWithRewardsBtnNotVisible();
			break;
			
		case ValidateMinPayment:
			PayWithRewards.get().validateMinimumPayment();
			break;
			
		case VerifyReviewHeader:
			Review.get().verifyReviewHeader();
			break;
			
		case ClickPayNowButton:
			Review.get().payNowButton();
			break;
			
		case ClickCancelButton:
			Review.get().cancelButton();
			break;
			
		case VerifyReceiptHeader:
			Receipt.get().verifyReceiptHeader();
			break;
		
		case VerifyAmountRedeem:
			Receipt.get().verifyAmountRedeemed();
			break;
			
		case ClickSummaryTab:
			Credit.get().clickSummaryTab();
			break;
			
		case ClickVisitRewards:
			Rewards.get().clickVisitRewardsIFVisible();
			break;
			
		case VerifyURL:
			Rewards.get().verifyURLName();
			break;
			
		case  VerifyRedemptionText:
			Rewards.get().verifyRedemptiontxt();
			break;
			
		case VerifyNoRewards:
			Credit.get().rewardsNotVisible();
			break;
			
		case VerifyRewardsText:
			Rewards.get().verifyRewardstxt();
			break;
			
		case VerifyCashbackText:
			Credit.get().verifyCashbackTxt();
			break;
			
		case VerifyRewardsBtn:
			Credit.get().rewardVisible();
			break;
			
		case VerifyTextcashBack:
			Credit.get().verifyCashBack();
			break;
			
		case VerifyEarnedAndRedeemed:
			StatementBalance.get().verifyDollarsEarnedAndRedeemed();
			break;
			
		case VerifyNoRewardsInQuickAccess:
			QuickAccessPage.get().verifyNoRewards();
			break;
			
		case ClickQuickAccessSettings:
			QuickAccessPage.get().clickQuickAccessSettings();
			break;
			
		case DisableCardInQuickAccess:
			QuickAccessSettings.get().disableToggleCard();
			break;
			
		case VerifyNoCardInQuickAccess:
			QuickAccessSettings.get().verifyCardNotDisplayed();
			break;
			
		case VerifyDollarRewardBalance:
			Credit.get().verifyDollarRewardBalance();
			break;
			
		case VerifyNoEarnedAndRedeemed:
			StatementBalance.get().verifyNoDollarsEarnedAndRedeemed();
			break;
			
		case  VerifyDollarDecimalValue:
			Credit.get().verifyDollarDecimalValue();
			break;
			
		case VerifyAmountAndContinueIsDisabled:
			PayWithRewards.get().verifyAmountAndContinueIsDisabled();
			break;
			
		case VerifyPayWithRewardsText:
			Rewards.get().verifyPayWithRewardsText();
			break;
			
		case VerifyRewardPointstxt:
			QuickAccessPage.get().verifyRewardPointstxt();
			break;
			
		case VerifyRewardPayee:
			PayWithRewards.get().verifyRewardPayee();
			break;
			
		case VerifyRedemptionDetails:
			Receipt.get().verifyRedemptionDetails();
			break;
			
		case VerifyCashBack:
			QuickAccessPage.get().verifyCashBack();
			break;
			
			//Tetris End

		} 	
	}

	public void generateReport() {
	}

}
