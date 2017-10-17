package com.td;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;

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
import com.td.test.CDNMobile.pages.CrossBorder;
import com.td.test.CDNMobile.pages.DepositCheque;
import com.td.test.CDNMobile.pages.FindLocations;
import com.td.test.CDNMobile.pages.HoldingDetails;
import com.td.test.CDNMobile.pages.HomeScreen;
import com.td.test.CDNMobile.pages.Interac_Send_Money;
import com.td.test.CDNMobile.pages.Interac_e_Registration;
import com.td.test.CDNMobile.pages.Interac_e_Transfer;
import com.td.test.CDNMobile.pages.Investing;
import com.td.test.CDNMobile.pages.InvestingAccountSummary;
import com.td.test.CDNMobile.pages.Login;
import com.td.test.CDNMobile.pages.LoginMIT;
import com.td.test.CDNMobile.pages.Logout;
import com.td.test.CDNMobile.pages.MFA_ChangeAnswer;
import com.td.test.CDNMobile.pages.MIT_DSHHomeScreenSettings;
import com.td.test.CDNMobile.pages.MIT_DSHNavRows;
import com.td.test.CDNMobile.pages.MIT_DSHQuickLinks;
import com.td.test.CDNMobile.pages.MIT_DSHWLPopulateData;
import com.td.test.CDNMobile.pages.MIT_DSHWLTopNav;
import com.td.test.CDNMobile.pages.MIT_PNSAccessAlerts;
import com.td.test.CDNMobile.pages.MIT_PNSCreateNewAlert;
import com.td.test.CDNMobile.pages.MIT_PNSManageAlerts;
import com.td.test.CDNMobile.pages.MIT_PNSViewAlertsLandingPage;
import com.td.test.CDNMobile.pages.MLCancelOrderReceipt;
import com.td.test.CDNMobile.pages.MLChangeOrder;
import com.td.test.CDNMobile.pages.MLConfirmOrder;
import com.td.test.CDNMobile.pages.MLConfirmOrderReceipt;
import com.td.test.CDNMobile.pages.MLEnterOrderNegative;
import com.td.test.CDNMobile.pages.MLOptionChainTable;
import com.td.test.CDNMobile.pages.MLOrderDetails;
import com.td.test.CDNMobile.pages.MLOrdersTab;
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
import com.td.test.CDNMobile.pages.OTPChallenge;
import com.td.test.CDNMobile.pages.Options;
import com.td.test.CDNMobile.pages.OptionsReceiptPage;
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
import com.td.test.CDNMobile.pages.PurchaseMutualFunds;
import com.td.test.CDNMobile.pages.FundDetails;
import com.td.test.CDNMobile.pages.TransactionDetails;
import com.td.test.CDNMobile.pages.PreviewPurchase;
import com.td.test.CDNMobile.pages.Popupwindow;
import com.td.test.CDNMobile.pages.FundFacts;
import com.td.test.myspend.LogoutMySpend;
import com.td.test.myspend.MoneyPath;
import com.td.test.myspend.MyspendPreferences;
import com.td.test.myspend.SideMenu;
import com.td.test.myspend.SpendingByCategory;
import com.td.test.myspend.SpendingHistory;
import com.td.test.myspend.SpendingSpikes;
import com.td.test.myspend.Spending_Insight;
import com.td.test.myspend.TDAppHomePage;
import com.td.test.myspend.TourPage;
import com.td.test.myspend.TransactionHistory;
import com.td.test.CDNMobile.pages.Branch;

public class EventCase {

	private enum functionNames {

		Account_Home_Button, Account_Prefer_Button, Accounts_EW_WB_Functionality, Accounts_Header, Accounts_sessionTimedOut,

		Accounts_Verify_Page, Accounts_VerifyAccountsPage, Accounts_VerifyTFSA_Activity, AddVaildEmail,

		Add_Recipient_ErrorPage, AddCanadianPayee, AddPayee_SearchPayee, AddCard_MobilePayment, AddToTDMobilePayment, ApplePay_AddCard, ApplePay_SelectACard, ApplePay_CheckEligibleCard, ApplePay_ChangeDefaultCard, ApplePay_CheckPersonalCard, ApplePay_CheckBusinessCard, ApplePay_CheckDefaultCard, ApplePay_AddAllCards, ApplePay_OtherEligibleCards, Accounts_Credit_clickTransfer,

		Banking_Header, Bill_PayCanada_Pay_Bill, Between_My_Accounts_RTB_permissible_transfer,

		Between_My_accounts, Between_My_accounts_CanadianToUS, Between_My_accounts_exchange_rate_expired, Between_My_accounts_Exchange_Rate_Expired, Between_My_Accounts_LIRA, Between_My_accounts_Mobile_Rate_Expiry, Between_My_Accounts_Permissible_Transfer, Between_My_accounts_transfer, Between_My_Accounts_Transfer_less, Between_My_accounts_transfer_verify_receipt, Between_My_accounts_VerifyFromAccounts,

		BetweenMyAccounts_CADTFSA_TDCTTFSA, BetweenMyAccounts_MobileRateExpiryOnSmartphones, BetweenMyAccounts_NegativeTestingTransferFunds, BetweenMyAccounts_permissible_transfer_on_mobile, BetweenMyAccounts_TDCTTFSA_CADTFSA, BetweenMyAccounts_TDCTTFSAMessage, BetweenMyAccounts_TransferNotSupported, BetweenMyAccounts_TransferTDCTCADUSDVISA,

		Bill_PayCanada_AmountSelection, Bill_PayCanada_BillPaymentCurrentDate, Bill_PayCanada_PayBillCancel, Bill_PayCanada_VerifyBackButton, Bill_PayCanada_VerifyQuickAccess, Bills_ScheduledPayments, BillsHeader, BetweenMyAccounts_TFSAUSD_TFSACAD(),

		CanadianPayee_ConfirmPage, Cancel, VerifyAndEnableQuickAccess,

		CDNCash, CDNCash_Sell_StopMarket, CDNMargin_Buy, CDNMargin_Buy_TriggerDelta, CDNMargin_Sell_TrailingStopLimit, CDNMargin_Sell_TrailingStopMarket, CDNMarginLimit, CDNMarginLimitTradePreviewOrder,

		Check_Remember_Me_Default, ClickBack, ClickBackBtn_Lnk, clickChangeOrder, clickChangeorder_MarketToLimit, ClickContact, ClickDepositCheque, CardDetails_save,

		ClickMenu, ClickMenu_French, ClickMenuHome, clickMenuTrade, Confirm_order, Confirm_order_French, ClickPrivacy, ClickSave, ClickPhoneNumber, ClickClearText, ClickAddressDetail, ClickPopupGoBackButton,

		ConfirmOrderCancel, ConfirmOrderReciept, ConfirmOrderSendOrder, ConfirmOrderSendOrder_French, ConfirmPayee, ChangeDefaultCard, CardDetails_deleteicon, ConfirmPayee_InvalidAmount, EditEmailAddressWithInvalidChar,

		Dashboard_Authentication, Dashboard_UnAuthentication, selectFirstLocation,

		Delete_usr, Deposit_Header, DepositChequeHeader, END,

		Env_set, Env_EnableMobilePayment, EditEmailAddressWithNonAformat, EditEmailAddressWithlonger60Char, EditEmailAddressWithNolonger60Char, EditEmailAddressWithoutSave, EditPhoneNumber, Env_DeleteDefaultCard,

		getProfileInformation, GetEmailAndPhoneNumber, ClickFeedback, ClickContactUs_CF, VerifyMoodSelectorScreen, VerifyEmotionsAnimateFromTopToBottom, ClickGreatLink, VerifyPostSurveyScreen, ClickCouldvebeenBetterLink, ClickItwasntWorkingLink, ClickBackButton, VerifyHomePageDashBoard, ClickContactUsFromHomePage, ClickSendFeedbackNow, VerifyRateUsOnGooglePlayButton, VerifyGooglePlayRatePage, ClickBackFromPostSurvey, VerifyContactUsPageHeader,

		FlyOut_HOME, Flyout_Location, Fill_OptionOrder, HoldingDetails_click_BuyButton, HoldingDetails_verify_Account_CADCash, HoldingDetails_verify_Account_US_MarginShort,

		HomeScreen_ClickAccounts, HomeScreen_ClickBills, HomeScreen_ClickDeposit, HomeScreen_clickInvestingFromHamburger, HomeScreen_ClickMarkets, HomeScreen_ClickQuickAccess, HomeScreen_ClickTrade, HomeScreen_clickTradeDashboard, HomeScreen_ClickTransfers, HomeScreen_ClickTransfersFrench, HomeScreen_clickWatchLists, HomeScreen_Investing, HomeScreen_Location_Details, HomeScreen_Transfer_Button, HomeScreen_WatchLists, HomeScreen_PayNow, Homescreen_ApplePay, HomeScreen_ClickTDMobilePayment,

		Interac_AddRecipient, Interac_e_Transfer_verify_interacTransfer, Interac_Header, InteracTransfer_Cancel, InteracTransfer_VerifyAmount,

		Investing_clickBackbtn, Investing_clickHoldings, Investing_clickInvestingAccount, Investing_clickInvestingAccounts,

		Investing_clickMarkets, Investing_clickOrderTab, Investing_clickPlacedorder, Investing_clickTrade, Investing_clickTrade_French, Investing_clickWatchLists, Investing_Header, Investing_verifyAdvanceorderdetails, Investingacc_verifySummary, InvestingHeader, IOS_Account_Home_Button,

		Login, Login_and_Logout, Login_clearPasswordField, Login_Error, Login_Ntimes, Login_PasswordFieldDelete, Login_usernameFieldDelete, Login_verifyPasswordField, Login_verifyUsernameField, login_without_tandc, LoginFrench, Loginverify, LoginWithRemember, Logout, LogoutFrench,

		ManagePayee_AddCanadianPayee, ManagePayee_MutlipleAccesscard, ManagePayee_VerifyAddCanadianPayeeBtn, ManagePayees_Button, ManageRecipient_EditManageRecipient, ManageRecipient_ModifyRecipient, ManageRecipients_VerifyRegisterButton, mask_user,

		Menu_Accounts, Menu_ClickTransfersFrench, Menu_Investing, Menu_Investing_French, Menu_Location, Menu_Mobile_deposit, MenuBills, MenuTrade, MenuTradeEasyWebCustomer, MenuTransfer, Menu_ClickMobilePayment, MobilePayment_SwipeMobilePayment, MobilePayment_AddACard, MobilePayment_ClickSettings, ManagePayment_ManageSettings, ManageSettings_Changepasscode, ManageTDMobilePayment_Selectcard, CardDetails_ToggleButton, MobilePayment_InitialSwipe, MobilePayment_SecurityQuestion, MW_verifycard, MW_expire, MobilePayment_Settingsicon, MobilePayment_SetPasscode, ManagePayment_clickcard, MenuApplePay, MenuPage_FindLocations, Menu_Profile_And_Settings,

		MFA_Change, Mobile_Deposit, Multitasking_System,

		NavigationBackToProfileandSettingPage, NavigationToHomePage,

		OpenApp, OrderDetails_CancelOrder, OrderDetails_clickChangeorder, OrderDetailsLimitPrice, OrderDetailsPage_orderConfirmDetails, OrderDetailsPage_verifyStockChangeorderConfirmScreen, OrderDetailsTriggerPrice, OrderReciept_CancelOrderReceipt, OrderReciept_French, OrderReciept_orderdetailMutualfund, OrderReciept_orderDetails, OrderReciept_orders, OrderReciept_OrdersIcon, OrderReciept_ordertab, OrderReciept_updatemsg, OrderReciept_verifyOrderScreen, Ordertype_Cancel, OptionOrderChangeQuantity, Options_verifyOptionsForNewOrder, Options_Changeprice, Options_ChangeGoodTil, Options_CancelOrder, Options_CancelOrderConfirmScreen, Options_VerifytradingPassword, Options_Verifybackbutton, Options_VerifyImportantInformation, Options_VerifyCancelReceipt,

		Pay_US_bill_From_US_Account, Pay_US_bill_FromCanada_Account, PayBill_Canada_Button, PayBill_US_Button, PayBill_VerifyAddCanadianPayeeBtn, PayBillCanada_Add_Canadian_Payee, PayCanada_NegativeTestingBillPayment, PayCanadaBill_Post_Dated, PayCanadaBillP_Pay_Candadian_Bill, PayCanadianBill_InvalidAmount,

		PendingInterac_e_Transfer, PendingInterac_e_Transfer_cancel, PendingInterac_e_Transfer_canceltransfer, PendingInterac_e_Transfer_confirm, PendingInterac_e_Transfer_confirmscreen, PendingInterac_e_Transfer_verifyconfirmation, PendingInterac_e_Transfer_verifylist, PendingInterac_e_Transfer_verifystatus, PendingInteracTransfer_verify_CancelPendingTransfer, passcode_Ntimes, Addicon,

		PermissibleTransfer, Preferences_Update_Question, PendingTransfer_Cancel, PlaceHolderText, QuickAccess, SearchPage_searchBar, Select_Account, SenderList_Cancel, Session_expired, SetupWalletPasscode,

		TDDirectInvestingContact, Trade_changeAccountTypeLongtoShortFre_French, Trade_clickAction, Trade_clickCross, Trade_clickFundFactLink, Trade_clickMutualFunds, Trade_clickMutualPreviewOrder, Trade_clickOnAgree, Trade_clickOnPreviewOrderBtn, Trade_clickOptions, Trade_clickOrderType, Trade_clickOrderType_French, Trade_clickQuantity, Trade_clickStockETFs, Trade_clickSymbol, Trade_clickSymbol_French, Trade_confirmCancelOrder, Trade_ConfirmSendOrder, Trade_createMutualfund, Trade_Details, Trade_enterAmount, Trade_enterAndSearch, Trade_enterTradingPassword, Trade_includesComission, Trade_Limit, Trade_nosearch, Trade_placeStockOrder, Trade_selectAccount, Trade_selectAcknowledgement, Trade_selectDividendOption, Trade_selectMutualQuantity, Trade_selectMutualSymbol, Trade_selectQuantity, Trade_sendOrder, Trade_trade_account, Trade_Trigger, Trade_verifyMutualConfirmDetails, Trade_verifymutualconfirmsell, Trade_verifyRelaventMatchInResult, Trade_verifysearchbar, Trade_verifySendOrderDisplayed, Trade_verifySendOrderState, Trade_verifySuccessMessage, Trade_verifySwitchMutualConfirmDetails, Trade_verifySymbol, Trade_verifyTrade, Trade_verifyTradeActionShortAccountFre_French, TradeAccount, TradeAccount_French, TradeAction, TradeAction_French, TradeAgree, TradeAgree_French, TradeDate, TradeGoodTill, TradeGoodTill_French, TradeHeader, TradeIcon, TradeLimitPrice, TradeMarginAccount, TradePreviewOrder, TradePreviewOrder_French, TradePrice, TradePrice_French, TradeQuantity, TradeQuantity_French, TradeShareHolder, TradeTriggerDelta, TradeTriggerPrice, TradeTriggerPrice_French, TradingPassword, TradingPassword_French,

		Trans_TFSA_To_Othr_Accounts, Transfer_InteracTransfer, TransferHeader, Transfers, Transfers_Click_Between_My_Accounts, Transfers_clickInterac_e_Transfer, Transfers_clickPendingInterac_e_Transfer, Transfers_ManageRecipients,

		Trade_click_MutualFunds, Transfers_Click_PendingTransfer,

		USMarAccLongToShort, USMarginShort_Buy_Market,

		verify_access_to_WB, Verify_account_activity_credit, Verify_Combined_Account, Verify_FP_Account, verify_login_5_times, Verify_PIA_Account, VerifyAccessCard, VerifyAccessCardDetails, VerifyActionFields, verifybill_landingpage, VerifyCombinedAccounts, verifyconfirm_order, VerifyDIAccounts, verifyErrorMessage, VerifyFPAccounts, VerifyIconDetails, VerifyInvestingScreen, VerifyNoEligibleAccounts, VerifyNoTradingAccounts, VerifyPIAAccounts, VerifyQuickIcons, VerifyReceipt, VerifySender, VerifySenderList, VerifyShareholderType, Verifytimestamp, VerifyTwoAccessCardDetails, VerifyUser, VerifyNickName, verifydefaultcard, View_profile, VerifyProfileHeader, VerifyContactInformationHeader, VerifyInitialNameforIndividual, VerifyInitialNameforBusinessUser, VerifyInitialNameInUpperCase, VerifyHomePhoneMasked, VerifyExtensionNotMasked, verifyProfileandSettingLandingPage, VerifyProfileNameLength, VerifyErrorMessage, VerifySecurityQuestionButton, VeirfySecuirtyQuestionPageheader, VerifyNotificationsButton, VeirfyNotificationsPageheader, VerifyQuickAccessSettings, VerifyQuickAccessSettingsHeader, VerifyTDForMeSettings, VerifyTDForMeSettingsHeader, VerifyWhatsNew, VerifyWhatsNewPageHeader, VerifyProfileAndSettingslink, VerifyEmailFormat, VerifyEmailIDLength, VerifyBlankEmailNotSuccesful, VerifyErrorMessageOrLength, VerifyEmailIDBlankorNot, VerifyEmailAddedSuccesful, VerifyPopUpWithCancelButton, VerifyClearTextIconDisplayed, VerifyPhoneNumberIsEmpty, VerifyTDForMeDisableSwitchFunction, VerifyTDForMeEnableSwitchFunction, ClickCustomizeNotificationlinkFromTDforMe, VerifyTDForMeNotificationPageHeader, VerifyQuickAccessSwitchWork,

		VerifyPlaceHolderDisplayed, VerifyToastmessageDisplayed, VerifyPhoneEmailNotChanged, verifyQuickAccessBillPaidUpdate, ClickBackFromAppOrGooglePage, Verify_quick_link_go_back_home, Verify_quick_link_view_myaccounts, Verify_error_screen, VerifyFIFOLogic, VerifyEquityAndETFs, VerifyTradeOnLandingPage, Verify_flyoutMenu, VerfiyOptionConfirmOrderScreen, verifyOptionConfirmOrderReceipt, ClickCustomizeNotificationsLinkFromNotifications, VerifyTdforMeNotificationsHeader, VerifyEnableNotificationsSwitchFunction,

		ClickActivityTab, SelectFirstTransaction, VerifyTransactionDetailHeader, VerifyTransactionDetails, SelectPreviousTransaction, VerifyMFChineseContent, VerifyPurchaseMFPageInChinese, VerifyMFActivityChineseContent, VerifyFundDetailsInformationInChinese, verifyTransactionDetailsInChinese, ClickPreviewPurchase, VerifyPreviewPurchasePageHeader, VerifyPreviewPurchasePhoneFormat, VerifyPreviewPurchasePhoneNotMasked, VerifyPreviewPurchaseContentInChinese, VerifyMinimumAmount, VerifyMaximumAmount, savePhoneInforForMFVerification, saveEmailInforForMFVerification, VerifyPhoneIsPopulatedWithProfilePhone, VerifyEmailIsPopulatedWithProfileEmail, SelectLastTransaction, VerifyZeroBalance, VerifyPurchaseButtonNotpresent, VerifyUSDDisclaimer, VerifyPrepopulatedInformatiom, ClickTDForMe_Flyout, VerifyCADValueForMarketAndBookValue, VerifyUSDAmount, ClickMobilePhoneNumber, VerifyBorrowMoneyYesButton, VerifyClosingDayDisclaimer, VerifyFundfactsAcknowledgement, clickpreviewButtonWithNoForm, VerifyErrorMessageForClosedFund, VerifyErrorMessageWithoutFundSelected,

		ClickPopupCancelOrderButton, VerifyFromCADAccountToUSDMFAccountIsNotAllowed, VerifyFromUSDAccountToCADMFAccountIsNotAllowed, ClickViewfundFacts, VerifyFundfactsPageheader, GoBackToHomePage, SelectIneligibleFund, VerifyErrorMessageForIneligibleFund, ClickfundFacts, ClickBalanceTab, VerifyUSDConversionRatePresent, ClickCancelMFpurchase, VerifyCancelPopUpMessage, VerifyWarningMessageContent,

		EditMobilePhoneNumber, VerifyPurchaseMFPageHeader, VerifyEmailAddressIsEditable, SelectAccountUsingAccountName, VerifyFundDropdownList, VerifyFromAccountBeStaticAndLinked, ClickFundsTab, SelectFirstFund, SelectUSDFunds, VerifyNoMutualFundAccounts, VerifyQuickLinkDisplayed, randomlySelectOneFund, VerifyFundDetailsPageHeader, VerifyFundCategory, ClickPurchaseButton,

		savePhoneInforForPFVerification, VerifyPhoneIsNotUpdatedAsMFChanges, VerifyConfirmationPageHeader, ClickPurchaseNowBtn, ClickGoBackHomeBtn, ClickViewMyAccountsBtn, VerifyQuickLinkPurchaseChineseContent, VerifyReceiptDetailChineseContent, VerifyFeedBackNTimes, VerifyCallFuntionality, ClickPurchaseMF,

		WatchLists_addSymbolToWatchLists, WatchLists_clickSearchBar, WatchLists_Header, Watchlists_verify_newOrderFlow_Watchlists, WatchLists_verifyRecentSearches, WatchLists_verifySymbol, WatchLists_verifySymbolAdded,

		FindLoactions_VerifyFindlocations, BetweenMyAccounts_TransferChequeAccount, TradeLimitAndTriggerPrice,

		Accounts_SelectAccount, AccountsCredit_ClickPayBill, AccountsCredit_verifyLastTranaction, AccountsCredit_clickLastTranaction, Transaction_VerifyTransac, AccountsCredit_clickSummaryTab, AccountsCredit_VerifySummaryDetails, AccountsCredit_clickStatementTab, AccountsCredit_VeifyStatementDetails, StatementBalance_VerifyBalanceDetails, Bill_PayCanada_verifyCurrentBalance, Bill_PayCanada_PayBill, AccountsCredit_ClickTransfers

		// trade,
		, clickChangeorder_TSM_to_TSL, TradeTrailingStopMarket, TradeStopMarket, MenumenuTradePresent, TradeStopMarketSell, TradeLimitDAYEXT, ClickWatchList, TradeStopLimit, OrderRecieptValidateBuy, Investing_ClickPlacedOrder, OrderDetails_Changeorder, TradeMarket, clickChangeorder_LimitToMarket, TradeLimit, TradeLimitAndTriggerDelta, TradeOrderType, TradeSymbol, TradeTrailingStopLimit, ConfirmOrderValidateBuy, verifyEmptyWatchList, ClickOrders, clickChangeorder_SM_to_SL, verifyShareHolder, confirmOrder_ClickBack, verifyBuyToCover, TradeStopLimitSell, ConfirmOrderDoNotCancel, ConfirmOrderImpInformation, ClickHoldingAndSymbol, changeOrderLimitDayToDayEXT,

		// MIT Multi-Leg

		OpenAppMIT, LoginMIT, tapInvesting, verifyDefaultStrategies, navigateToSearchScreen, selectTradeAccount_OrderType, verifySymbolUS, verifySymbolSearchResults, clickInvestingTrade, tapTradeSearchBar, clickFirstSymbol, verifyStockOptionContents, verifyOptionOptionContents, verifySelectOption, verifyStockMidNaturalPrice, verifyOptionMidNaturalPrice, verifyGoodTill, verifyGoodTillExpiryDate, verifySharehoderType, verifyStockOptionBackButton, verifyOptionOptionBackButton, verifyOptionOptionPreviewOrderButton, searchAndSelectAccount, submitStockOptionOrder, selectDateSpecify_Android, searchAndSelectAccountRapcode, verifyStockOptionFieldsReset, verifyOptionOptionFieldsReset, verifyOptionOptionFieldResetOrderTypeChanged, verifyStockOptionFieldResetOrderTypeChanged, verifyStockOptionConfirmOrder, verifyOptionOptionConfirmOrder, submitOptionOptionOrder, verifyStockOptionCancelOrderReceipt, verifyOptionOptionCancelOrderReceipt, verifyTradeOrderFormContent, verifyEntryOrderFormContent, verifyWarningMsgExchangeAgrNotSigned, verifyStockOptionConfirmOrderReceipt, verifyOptionOptionConfirmOrderReceipt, clickPostorderMyAccount, clickPostorderTrade, clickQuickLinkHome, clickQuickLinkTrade, clickQuickLinkOrder, verifyOptionOptionChainTableSubmit, verifyStockOptionChainTableSubmit, verifyStockOptionChainTableCancel, verifyOptionOptionChainTableCancel, verifyInvalidTradingPassword, verifyStockOptionChangeOrder, verifyOptionOptionChangeOrder, verifyStockOptionOrderDetails, verifyOptionOptionOrderDetails, verifyMLOrdersTabDetails, Test, verifyBackButton, searchAndSelectAccountRapcodeWZXY,

		// MIT PNS Alerts

		verifyPreLoginDashboardAlerts, verifyAlertUI, tapAlerts, verifyBackandGearIcon, verifyxCancelbutton, verifycreateAlertConditionPriceRises, verifyCreateAlertConditionPricehit52Week, verifyQuoteInformation, VerifyPriceChangesOnHeavyVolume, VerifyPrimaryEmailDeliveryPreferences, VerifySecondaryEmailDeliveryPreferences, VerifyEnablingAllDeliveryPreferences, VerifyCreateSimilarAlertConditionPriceRisesFasterThanIndex, VerifyAlertConditionPriceGapAtOpeningTrade, verifyAlertIconMODQuotesPage, verifyNotificationPrefMOD, verifyNotificationPrefFlyMenu, verifyPriceDropsBelow, verifyPriceRisesAbove, verifyEditAlertUI, verifyDefaultWhenAlertConditionChange, verifyPriceChangesFromPreviousClose, verifyPriceEarningRatioDropsBelow, verifyModPagesLoaded, verifyExceedDailyVolume, navigateToQuotePage, navigateToOrderForm, VerifyDoneConditionPriceChangesFromPreviousClose, VerifyErrorConditionPriceDropsBelowStocks, CreateAlertConditionPriceChangesFromPrevious, VerifyBackButtonOnCreateNewAlertpage, VerifyChangeConditionCreateNewAlertPage, VerifyRefreshButtonOnCreateNewAlertPage, verifyFuncFlow, VerifyClientNavigateInvestingAlertsNotifcationOFF, VerifyClientNavigateInvestingPNSAndAlertsNotifcationON, VerifyClientNavigateInvestingAlertsNotifcationSuspended,

		// MIT Dashboard

		verifyQuickLinksUnAuthenicatedUser, goToDashboardHome, verifyQuickLinksBankingOnlyUser, verifyQuickLinksInvestingOnlyUser, verifyQuickLinksBlendedUser, verifyNavRowsUnAuthenicatedUser, verifyNavRowsBankingOnlyUser, verifyNavRowsInvestingOnlyUser, verifyNavRowsBlendedUser, verifyWatchlistHeaderUI, verifyMenuBarWatchlistDropDown, verifyHomeScreenSettingsUI, verifyHomeScreenSettingsInvestingUser, verifyHomeScreenSettingsPageUI, verifyStockETFsWLSymbolRow, verifyTappingWLOptionSymbol, goToWLExpandedView,verifyTappingWLMutualFundSymbol,

		// P2P

		Transfers_clickManageContactsLink, ManageContacts_verifyPageHEader, Interac_e_Transfer_clickContinueButton, Profile_And_Settings_clickPaymentsAndTransfers, Interac_e_Transfer_verifyErrorText, Interac_e_Transfer_registerUser, Interac_e_Transfer_verifyDetails, Interac_e_Transfer_verifyRegSuccessMessage,

		// Tetris Loyalty
		CreditHeader, ClickAccount, VerifyPayWithRewards, ClickStatementTab, Env_ClearSavedCards, ClickReward, RewardHeader, ClickPayWithRewards, PayWithRewardsHeader, ClickStatement, VerifyStatementBalanceHeader, VerifyAndClickPayWithRewardsBtn, ValidateAmount, VerifyMinAndMaxPaymentBtn, PayWithRewardsNotVisible, ValidateMinPayment, VerifyReviewHeader, ClickPayNowButton, ClickCancelButton, VerifyReceiptHeader, VerifyAmountRedeem, ClickSummaryTab, ClickVisitRewards, VerifyURL, VerifyRedemptionText, VerifyNoRewards, VerifyRewardsText, VerifyCashbackText, VerifyRewardsBtn, VerifyTextcashBack, VerifyEarnedAndRedeemed, VerifyNoRewardsInQuickAccess, ClickQuickAccessSettings, DisableCardInQuickAccess, VerifyNoCardInQuickAccess, VerifyDollarRewardBalance, VerifyNoEarnedAndRedeemed, VerifyDollarDecimalValue, VerifyAmountAndContinueIsDisabled, VerifyPayWithRewardsText, VerifyRewardPointstxt, VerifyRewardPayee, VerifyRedemptionDetails, VerifyCashBack,

		// Chinese on Mobile

		AccountsCredit_VerifyActivityText, AccountsCredit_VerifyCreditText, AccountsCredit_VerifySummaryText, Accounts_VerifyTextOpenNewAccount, AccountsCredit_VerifyTabTextElements, AddPayee_VerifyTextReview, AddPayee_VerifyTextReviewUS, AddPayee_VerifyTextConfirmation, AddPayee_VerifyTextSuccess, AddPayee_VerifyTextSelectUSAddress, Between_My_accounts_VerifyTextElements, Between_My_accounts_performTransferToConfirmation, Between_My_accounts_performTransferToSuccess, Between_My_accounts_VerifyConfirmationText, Between_My_accounts_VerifySuccessText, Bills_ScheduledPayments_VerifyText, Bills_VerifyTextElements, Bills_VerifyTextConfirmCancelScheduledPayment, Bills_VerifyTextNoCanadianPayeesAdded, CrossBorderBanking_ClickLogin, CrossBorderBanking_VerifyTextLoginPopup, CrossBorderBanking_VerifyTextWelcomePage, ClickCrossBorderBanking, ClickTDForMe, ClickTDMySpend, ClickChequeDepositHistory, ClickAddRecipientFromContactsList, ContactUs_VerifyTextElements, HomeScreen_VerifyTextElements, HomeScreen_ClickOpenNewAccount, LoginScreen_VerifyTextElements, HomeScreenDashboardButtons_VerifyTextEelements, Interac_VerifyTextElements, Interac_e_Transfer_VerifyConfirmationText, PendingInterac_e_Transfer_cancel_confirmation_VerifyText, Interac_e_Transfer_VerifySuccessText, Investing_VerifyTextOpenNewAccount, Logout_VerifyTextElements, ManagePayee_AddUSPayee, ManagePayee_VerifyTextSearchPayee, ManagePayees_VerifySpecificPayeeTextElements, ManagePayees_VerifyTextElements, ManageRecipient_ClickAddRecipient, ManageRecipient_VerifyTextEditRecipientInfo, ManageRecipient_VerifyTextAddRecipientConfirmation, ManageRecipient_VerifyTextAddRecipientSuccess, ManageRecipient_ClickYesAddRecipientFromContacts, ManageRecipient_VerifyTextAddRecipientFromContactsList, ManageRecipients_VerifyTextElements, ManageRecipient_VerifyTextAddRecipient, ManageRecipient_VerifyTextRecipientInfo, ManageRecipient_VerifyTextContactsPopUp, Menu_VerifyTextElements, MobileDeposit_VerifyTextElements, MobileDeposit_VerifyTextElementsIneligible, MobileDeposit_VerifyTextDepositCheque, MobileDeposit_VerifyTextDepositChequeHistory, MobileDeposit_VerifyTextChequeDetails, PayBill_US_VerifyTextElements, PayBill_US_VerifyTextElementsNeverRegistered, PayBill_US_VerifyTextElementsSuccess, PayBill_Canada_VerifyTextElementsConfirmation, PayBill_US_VerifyTextElementsConfirmation, PayBill_Canada_VerifyTextElements, PendingInterac_e_Transfer_VerifyText, PendingInterac_e_Transfer_cancel_deposit_to_VerifyText, QuickAccess_VerifyActivateText, QuickAccess_VerifyFTEText, Transfer_VerifyTextElements, InvestingAccountSummary_verifyDetails, InvestingAccountSummary_verifyCreditCardSummaryDetails, InvestingAccountSummary_verifyCreditCardActivityDetails, InvestingAccountSummary_verifyCreditCardPaymentDetails, InvestingAccountSummary_verifyCreditCardPaymentPurchaseDetails, InvestingAccountSummary_verifyCreditCardStatementDetails, InvestingAccountSummary_verifyCreditCardStatementTabDetails, InvestingAccountSummary_verifyHoldingsDetails, InvestingAccountSummary_verifyListedHoldingsDetails, InvestingAccountSummary_verifyInvestingOrderDetails, InvestingAccountSummary_verifyOrdersDetails, InvestingAccountSummary_verifyActivityTabDetails, Investing_verifyPageDetails, Investing_clickAccount, MutualFunds_verifyMutualFundDetails, clickInvestingAccounts,

		// P2P EUF
		ManageContacts_verifyContactDeleteSuccessMsg, ManageContacts_noDeleteContact, ManageContacts_deleteContact, ManageContacts_clickContact, ManageContacts_AddContactfromPhone, ManageContacts_clickAddContactfromPhone, ManageContacts_MultiProfileDeleteContact, Interac_e_Registration_clickContinueButton, ManageContacts_verifySuccessMessage, ManageContacts_clickAddContactPlusSign, ManageContacts_clickAddContactButton, ManageContacts_editContact, ManageContacts_verifyContactEditSuccessMsg, ManageContacts_MultiProfileAddContact, ManageContacts_addContact, ManageContacts_MultiProfileEditContact, HomeScreen_clickSendMoney, Interac_Send_Money_sendMoneyVerifyDetails, Interac_Send_Money_sendMoney, Interac_Send_Money_sendMoneyVerifySuccessMsg, Interac_Send_Money_sendMoneyWithError, Interac_e_Registration_verifyDetails, Interac_e_Registration_verifyBusinessDetails, Interac_e_Registration_verifyRegSuccessMessage,

		// OTP

		OTP_Challenge_ClickTextOption, OTP_Challenge_ClickVoiceOption, OTP_Challenge_ClickFirstPhoneNumber, OTP_Challenge_ClickGetCodeButton, OTP_Challenge_ClickSubmitCodeButton, OTP_Challenge_EnterSecurityCode, OTP_Challenge_WaitForOTPProgressBarToVanish, OTP_Challenge_VerifyInvalidSecurityCode, OTP_Challenge_ResendCode, OTP_Challenge_VerifyTooManySecurityCodesRequested,

		// myspend
		Logout_logout, MySpend_RegistrationFlow, MoneyPath_moneyPathFunctionality, TourPage_clickConnectTDApp, Spending_Insight_verifyPageHeader, Spending_Insight_clickMenuButton, SideMenu_clickPreferences, SideMenu_clickSpendingByCategory, SideMenu_verifyDeepLinks, SpendingSpike_verifySpikesCategories, SpendingByCategory_verifySpikes, SpendingSpike_pageMessages, Preferences_verifyPageHeader, Preferences_enableAccounts, Preferences_EnableAllAccounts, Preferences_DisableAllAccounts, Spending_Insight_verifyPreferencesDisabled, Spending_Insight_verifyPreferencesEnabled, SideMenu_clickSpendingHistory, SideMenu_clickSpendingSpikes, SideMenu_clickSpendingInsights, SideMenu_clickTransactionHistory, SpendingHistory_verifyNoSpendingHistory, SpendingHistory_verifySpendingHistory, SpendingHistory_clickMonthIcon, SpendingHistory_verifyTabs, SpendingHistory_clickHomeButton, SpendingHistory_verifySpendingHistoryHeader, spendingByCategory_verifyPageHeader, Spending_Insight_logoutTDMySpend, Spending_Insight_clickAndVerifyLogout, Spending_Insight_clickMoneyPathButton, SpendingInsights_verifySpendingInsightsPage, SpendingHistory_clickSpendingHistory, spendingByCategory_verifyCategories, spendingByCategory_changeCategoryForAllTabs, SpendingByCategory_clickHistoricalInsightBtn, SpendingSpike_verifyCurrentMonthSpending, spendingByCategory_changeCategory, TransactionHistory_verifyNoTransactionsFound, TransactionHistory_verifyTransactions, TransactionHistory_verifyPageHeader, TransactionHistory_transacHistoryFunctionality, TDAppHomePage_verifyPageHeader, TDAppHomePage_clickTDMySpend, SideMenu_clickMyAccounts, SideMenu_clickGetTDAppButton, click_PreferencesLink

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

		case ClickPurchaseMF:
			Investing.get().ClickPurchaseMF();
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

		case selectFirstLocation:
			FindLocations.get().selectFirstLocation();
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

		case ManageContacts_verifyContactDeleteSuccessMsg:
			ManageContacts.get().verifyContactDeleteSuccessMsg();
			break;

		case ManageContacts_noDeleteContact:
			ManageContacts.get().noDeleteContact();
			break;

		case ManageContacts_deleteContact:
			ManageContacts.get().deleteContact();
			break;

		case ManageContacts_clickAddContactPlusSign:
			ManageContacts.get().clickAddContactPlusSign();
			break;

		case ManageContacts_clickAddContactButton:
			ManageContacts.get().clickAddContactButton();
			break;

		case ManageContacts_addContact:
			ManageContacts.get().addContact();
			break;

		case ManageContacts_clickAddContactfromPhone:
			ManageContacts.get().clickAddContactfromPhone();
			break;

		case ManageContacts_AddContactfromPhone:
			ManageContacts.get().AddContactfromPhone();
			break;

		case ManageContacts_clickContact:
			ManageContacts.get().clickContact();
			break;

		case ManageContacts_editContact:
			ManageContacts.get().editContact();
			break;

		case ManageContacts_verifyContactEditSuccessMsg:
			ManageContacts.get().verifyContactEditSuccessMsg();
			break;

		case ManageContacts_MultiProfileEditContact:
			ManageContacts.get().MultiProfileEditContact();
			break;

		case ManageContacts_MultiProfileDeleteContact:
			ManageContacts.get().MultiProfileDeleteContact();
			break;

		case ManageContacts_MultiProfileAddContact:
			ManageContacts.get().MultiProfileAddContact();
			break;

		case ManageContacts_verifySuccessMessage:
			ManageContacts.get().verifySuccessMessage();
			break;

		case Interac_e_Registration_clickContinueButton:
			Interac_e_Registration.get().clickContinueButton();
			break;

		case Interac_e_Transfer_clickContinueButton:
			Interac_e_Transfer.get().clickContinueButton();
			break;

		case Interac_e_Transfer_verifyErrorText:
			Interac_e_Transfer.get().verifyErrorMessage();
			break;

		case Interac_e_Transfer_registerUser:
			Interac_e_Transfer.get().registerUser();
			break;

		case Interac_e_Transfer_verifyDetails:
			Interac_e_Transfer.get().verifyDetails();
			break;

		case HomeScreen_clickSendMoney:
			HomeScreen.get().sendMoney();
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

		case Interac_e_Transfer_verifyRegSuccessMessage:
			Interac_e_Transfer.get().verifyRegSuccessMsg();
			break;

		case Interac_Send_Money_sendMoneyWithError:
			Interac_Send_Money.get().sendMoneyWithError();
			break;

		case Interac_Send_Money_sendMoney:
			Interac_Send_Money.get().sendMoney();
			break;

		case Interac_Send_Money_sendMoneyVerifyDetails:
			Interac_Send_Money.get().sendMoneyVerifyDetails();
			break;

		case Interac_Send_Money_sendMoneyVerifySuccessMsg:
			Interac_Send_Money.get().sendMoneyVerifySuccessMsg();
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

		case ClickBackBtn_Lnk:
			HomeScreen.get().clickbackBtnLnk();
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
			Branch.get().verifyLocationDetails();
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
			Trade.get().verifyRelaventMatchInResult();
			break;

		case Trade_verifySymbol:
			Trade.get().verifySymbol();
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
			Trade.get().cancel_ordertype();
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
		case Trade_nosearch:
			Trade.get().noSearch();
			break;

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
			// Trade.get().stopMarketSell();
			Trade.get().stopLimitSell();// @Author - Shahbaaz 02-June-2017
			break;
		case TradeMarket:
			Trade.get().market();
			break;

		case MenumenuTradePresent:
			HomeScreen.get().menuTradePresent();
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

		// Mutual Funds

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

		// profile and preference

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

		case VerifyTdforMeNotificationsHeader:
			Notifications.get().VerifyTdforMeNotificationsHeader();
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

		case ClickFeedback:
			MenuPage.get().ClickFeedback();
			break;

		case ClickContactUs_CF:
			MenuPage.get().ClickContactUs_CF();
			break;

		case VerifyMoodSelectorScreen:
			MoodSelectorScreen.get().VerifyMoodSelectorScreen();
			break;

		case VerifyEmotionsAnimateFromTopToBottom:
			MoodSelectorScreen.get().VerifyEmotionsAnimateFromTopToBottom();
			break;

		case ClickGreatLink:
			MoodSelectorScreen.get().ClickGreatLink();
			break;

		case VerifyPostSurveyScreen:
			MoodSelectorScreen.get().VerifyPostSurveyScreen();
			break;

		case ClickCouldvebeenBetterLink:
			MoodSelectorScreen.get().ClickCouldvebeenBetterLink();
			break;

		case ClickItwasntWorkingLink:
			MoodSelectorScreen.get().ClickItwasntWorkingLink();
			break;

		case VerifyHomePageDashBoard:
			HomeScreen.get().VerifyHomePageDashBoard();
			break;

		case ClickContactUsFromHomePage:
			HomeScreen.get().ClickContactUsFromHomePage();
			break;

		case ClickSendFeedbackNow:
			MoodSelectorScreen.get().ClickSendFeedbackNow();
			break;

		case VerifyRateUsOnGooglePlayButton:
			MoodSelectorScreen.get().VerifyRateUsOnGooglePlayButton();

			break;

		case VerifyGooglePlayRatePage:
			MoodSelectorScreen.get().VerifyGooglePlayRatePage();
			break;

		case ClickBackFromPostSurvey:
			MoodSelectorScreen.get().ClickBackFromPostSurvey();
			break;

		case VerifyContactUsPageHeader:
			ContactUs.get().VerifyContactUsPageHeader();
			break;

		case ClickBackFromAppOrGooglePage:
			MoodSelectorScreen.get().ClickBackFromAppOrGooglePage();
			break;

		case Verify_quick_link_go_back_home:
			MoodSelectorScreen.get().Verify_quick_link_go_back_home();
			break;

		case Verify_quick_link_view_myaccounts:
			MoodSelectorScreen.get().Verify_quick_link_view_myaccounts();
			break;

		case Verify_error_screen:
			MoodSelectorScreen.get().Verify_error_screen();
			break;

		// end of profile and preference

		case Trade_clickCross:
			// Trade.get().clickCross();
			break;

		// MIT Multi-Leg switch cases START
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

		case verifyBackButton:
			TradeMultiLeg.get().verifyBackButton();
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

		case verifyMLOrdersTabDetails:
			MLOrdersTab.get().verifyMLOrdersTabDetails();
			break;

		case Test:
			MLConfirmOrder.get().Test();
			break;

		case searchAndSelectAccountRapcodeWZXY:
			MLEnterOrderNegative.get().searchAndSelectAccountRapcodeWZXY();
			break;

		// MIT Multi-Leg Switch Cases END

		// MIT PNS Alerts START
		case verifyPreLoginDashboardAlerts:
			MIT_PNSAccessAlerts.get().verifyPreLoginDashboardAlerts();
			break;

		case verifyAlertUI:
			MIT_PNSAccessAlerts.get().verifyAlertUI();
			break;

		case verifyModPagesLoaded:
			MIT_PNSAccessAlerts.get().verifyModPagesLoaded();
			break;

		case verifyAlertIconMODQuotesPage:
			MIT_PNSAccessAlerts.get().verifyAlertIconMODQuotesPage();
			break;

		case verifyNotificationPrefMOD:
			MIT_PNSAccessAlerts.get().verifyNotificationPrefMOD();
			break;

		case verifyNotificationPrefFlyMenu:
			MIT_PNSAccessAlerts.get().verifyNotificationPrefFlyMenu();
			break;

		case verifyPriceDropsBelow:
			MIT_PNSViewAlertsLandingPage.get().verifyPriceDropsBelow();
			break;

		case verifyPriceRisesAbove:
			MIT_PNSViewAlertsLandingPage.get().verifyPriceRisesAbove();
			break;

		case verifyEditAlertUI:
			MIT_PNSManageAlerts.get().verifyEditAlertUI();
			break;

		case verifyDefaultWhenAlertConditionChange:
			MIT_PNSManageAlerts.get().verifyDefaultWhenAlertConditionChange();
			break;

		case verifyPriceChangesFromPreviousClose:
			MIT_PNSManageAlerts.get().verifyPriceChangesFromPreviousClose();
			break;

		case verifyPriceEarningRatioDropsBelow:
			MIT_PNSManageAlerts.get().verifyPriceEarningRatioDropsBelow();
			break;

		case verifyExceedDailyVolume:
			MIT_PNSManageAlerts.get().verifyExceedDailyVolume();
			break;

		case navigateToQuotePage:
			MIT_PNSManageAlerts.get().navigateToQuotePage();
			break;

		case navigateToOrderForm:
			MIT_PNSManageAlerts.get().navigateToOrderForm();
			break;

		case tapAlerts:
			MIT_PNSCreateNewAlert.get().tapAlerts();
			break;

		case verifyBackandGearIcon:
			MIT_PNSCreateNewAlert.get().verifyBackandGearIcon();
			break;

		case verifyxCancelbutton:
			MIT_PNSCreateNewAlert.get().verifyxCancelbutton();
			break;

		case verifycreateAlertConditionPriceRises:
			MIT_PNSCreateNewAlert.get().verifycreateAlertConditionPriceRises();
			break;

		case verifyCreateAlertConditionPricehit52Week:
			MIT_PNSCreateNewAlert.get().verifyCreateAlertConditionPricehit52Week();
			break;

		case verifyQuoteInformation:
			MIT_PNSCreateNewAlert.get().verifyQuoteInformation();
			break;

		case VerifyPriceChangesOnHeavyVolume:
			MIT_PNSCreateNewAlert.get().VerifyPriceChangesOnHeavyVolume();
			break;

		case VerifyPrimaryEmailDeliveryPreferences:
			MIT_PNSCreateNewAlert.get().VerifyPrimaryEmailDeliveryPreferences();
			break;

		case VerifySecondaryEmailDeliveryPreferences:
			MIT_PNSCreateNewAlert.get().VerifySecondaryEmailDeliveryPreferences();
			break;

		case VerifyEnablingAllDeliveryPreferences:
			MIT_PNSCreateNewAlert.get().VerifyEnablingAllDeliveryPreferences();
			break;

		case VerifyAlertConditionPriceGapAtOpeningTrade:
			MIT_PNSCreateNewAlert.get().VerifyAlertConditionPriceGapAtOpeningTrade();
			break;

		case VerifyCreateSimilarAlertConditionPriceRisesFasterThanIndex:
			MIT_PNSCreateNewAlert.get().VerifyCreateSimilarAlertConditionPriceRisesFasterThanIndex();
			break;

		case VerifyDoneConditionPriceChangesFromPreviousClose:
			MIT_PNSCreateNewAlert.get().VerifyDoneConditionPriceChangesFromPreviousClose();
			break;

		case VerifyErrorConditionPriceDropsBelowStocks:
			MIT_PNSCreateNewAlert.get().VerifyErrorConditionPriceDropsBelowStocks();
			break;
		case CreateAlertConditionPriceChangesFromPrevious:
			MIT_PNSCreateNewAlert.get().CreateAlertConditionPriceChangesFromPrevious();
			break;

		case VerifyBackButtonOnCreateNewAlertpage:
			MIT_PNSCreateNewAlert.get().VerifyBackButtonOnCreateNewAlertpage();
			break;
		case VerifyChangeConditionCreateNewAlertPage:
			MIT_PNSCreateNewAlert.get().VerifyChangeConditionCreateNewAlertPage();
			break;

		case VerifyRefreshButtonOnCreateNewAlertPage:
			MIT_PNSCreateNewAlert.get().VerifyRefreshButtonOnCreateNewAlertPage();
			break;

		case verifyFuncFlow:
			MIT_PNSCreateNewAlert.get().verifyFuncFlow();
			break;

		case VerifyClientNavigateInvestingAlertsNotifcationOFF:
			MIT_PNSCreateNewAlert.get().VerifyClientNavigateInvestingAlertsNotifcationOFF();
			break;

		case VerifyClientNavigateInvestingPNSAndAlertsNotifcationON:
			MIT_PNSCreateNewAlert.get().VerifyClientNavigateInvestingPNSAndAlertsNotifcationON();
			break;

		case VerifyClientNavigateInvestingAlertsNotifcationSuspended:
			MIT_PNSCreateNewAlert.get().VerifyClientNavigateInvestingAlertsNotifcationSuspended();
			break;

		// MIT PNS Alerts END

		// MIT Dashboard START

		case verifyQuickLinksUnAuthenicatedUser:
			MIT_DSHQuickLinks.get().verifyQuickLinksUnAuthenicatedUser();
			break;

		case goToDashboardHome:
			MIT_DSHQuickLinks.get().goToDashboardHome();
			break;

		case verifyQuickLinksBankingOnlyUser:
			MIT_DSHQuickLinks.get().verifyQuickLinksBankingOnlyUser();
			break;

		case verifyQuickLinksInvestingOnlyUser:
			MIT_DSHQuickLinks.get().verifyQuickLinksInvestingOnlyUser();
			break;

		case verifyQuickLinksBlendedUser:
			MIT_DSHQuickLinks.get().verifyQuickLinksBlendedUser();
			break;

		case verifyNavRowsUnAuthenicatedUser:
			MIT_DSHNavRows.get().verifyNavRowsUnAuthenicatedUser();
			break;

		case verifyNavRowsBankingOnlyUser:
			MIT_DSHNavRows.get().verifyNavRowsBankingOnlyUser();
			break;

		case verifyNavRowsInvestingOnlyUser:
			MIT_DSHNavRows.get().verifyNavRowsInvestingOnlyUser();
			break;

		case verifyNavRowsBlendedUser:
			MIT_DSHNavRows.get().verifyNavRowsBlendedUser();
			break;

		case verifyWatchlistHeaderUI:
			MIT_DSHWLTopNav.get().verifyWatchlistHeaderUI();
			break;

		case verifyMenuBarWatchlistDropDown:
			MIT_DSHWLTopNav.get().verifyMenuBarWatchlistDropDown();
			break;

		case verifyHomeScreenSettingsUI:
			MIT_DSHHomeScreenSettings.get().verifyHomeScreenSettingsUI();
			break;

		case verifyHomeScreenSettingsInvestingUser:
			MIT_DSHHomeScreenSettings.get().verifyHomeScreenSettingsInvestingUser();
			break;

		case verifyHomeScreenSettingsPageUI:
			MIT_DSHHomeScreenSettings.get().verifyHomeScreenSettingsPageUI();
			break;

		case verifyStockETFsWLSymbolRow:
			MIT_DSHWLPopulateData.get().verifyStockETFsWLSymbolRow();
			break;

		case verifyTappingWLOptionSymbol:
			MIT_DSHWLPopulateData.get().verifyTappingWLOptionSymbol();
			break;
			
		case verifyTappingWLMutualFundSymbol:
			MIT_DSHWLPopulateData.get().verifyTappingWLMutualFundSymbol();
			break;
			
		case goToWLExpandedView:
			MIT_DSHWLPopulateData.get().goToWLExpandedView();
			break;

		// MIT Dashboard END

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
			OrderDetails.get().performCancelOrder();
			break;

		case OrderDetails_clickChangeorder:
			// OrderDetails.get().clickChangeorder();
			break;

		case TradeHeader:
			Trade.get().verifyTradeHeader();
			break;

		case Trade_Trigger:
			// Trade.get().tradeDetails_TriggerDelta();
			break;

		// Tetris start

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

		case ClickMobilePhoneNumber:
			Profile.get().ClickMobilePhoneNumber();
			break;

		case EditMobilePhoneNumber:
			Profile.get().EditMobilePhoneNumber();
			break;

		case ClickBackButton:
			(new com.td.MobileAction2()).ClickBackButton();
			break;

		case VerifyFeedBackNTimes:
			MoodSelectorScreen.get().VerifyFeedBackNTimes();
			break;

		// end of profile and preference

		// Start of Purchase Mutual funds
		case VerifyPurchaseMFPageHeader:
			PurchaseMutualFunds.get().VerifyPurchaseMFPageHeader();
			break;

		case clickpreviewButtonWithNoForm:
			PurchaseMutualFunds.get().clickpreviewButtonWithNoForm();
			break;

		case VerifyErrorMessageForClosedFund:
			PurchaseMutualFunds.get().VerifyErrorMessageForClosedFund();
			break;

		case VerifyErrorMessageWithoutFundSelected:
			PurchaseMutualFunds.get().VerifyErrorMessageWithoutFundSelected();
			break;

		case VerifyEmailAddressIsEditable:
			PurchaseMutualFunds.get().VerifyEmailAddressIsEditable();
			break;

		case SelectAccountUsingAccountName:
			Accounts.get().SelectAccountUsingAccountNameAndAccountNum();
			break;

		case VerifyFundDropdownList:
			PurchaseMutualFunds.get().VerifyFundDropdownList();
			break;

		case VerifyFromAccountBeStaticAndLinked:
			PurchaseMutualFunds.get().VerifyFromAccountBeStaticAndLinked();
			break;

		case ClickFundsTab:
			Investing.get().ClickFundsTab();
			break;

		case SelectFirstFund:
			Investing.get().SelectFirstFund();
			break;

		case SelectUSDFunds:
			Investing.get().SelectUSDFunds();
			break;

		case VerifyNoMutualFundAccounts:
			Accounts.get().VerifyNoMutualFundAccounts();
			break;

		case VerifyQuickLinkDisplayed:
			Investing.get().VerifyQuickLinkDisplayed();
			break;

		case randomlySelectOneFund:
			Investing.get().randomlySelectOneFund();
			break;

		case VerifyFundDetailsPageHeader:
			FundDetails.get().VerifyFundDetailsPageHeader();
			break;

		case VerifyFundCategory:
			FundDetails.get().VerifyFundCategory();
			break;

		case ClickPurchaseButton:
			FundDetails.get().click_PurchaseButton();
			break;

		case ClickActivityTab:
			Investing.get().ClickActivityTab();
			break;

		case SelectLastTransaction:
			Investing.get().SelectLastTransaction();
			break;

		case SelectFirstTransaction:
			Investing.get().SelectFirstTransaction();
			break;

		case VerifyTransactionDetailHeader:
			TransactionDetails.get().verifyTransactionHeader();
			break;

		case VerifyTransactionDetails:
			TransactionDetails.get().verifyTransactionDetails();
			break;

		case SelectPreviousTransaction:
			Investing.get().SelectPreviousTransaction();
			break;

		case VerifyMFChineseContent:
			Investing.get().VerifyMFChineseContent();
			break;

		case ClickPopupCancelOrderButton:
			Popupwindow.get().ClickPopupCancelOrderButton();
			break;

		case VerifyPurchaseMFPageInChinese:
			PurchaseMutualFunds.get().VerifyPurchaseMFPageInChinese();
			break;

		case VerifyFromCADAccountToUSDMFAccountIsNotAllowed:
			PurchaseMutualFunds.get().VerifyFromCADAccountToUSDMFAccountIsNotAllowed();
			break;

		case VerifyFromUSDAccountToCADMFAccountIsNotAllowed:
			PurchaseMutualFunds.get().VerifyFromUSDAccountToCADMFAccountIsNotAllowed();
			break;

		case ClickViewfundFacts:
			PurchaseMutualFunds.get().ClickViewfundFacts();
			break;

		case VerifyBorrowMoneyYesButton:
			PurchaseMutualFunds.get().VerifyBorrowMoneyYesButton();
			break;

		case VerifyFundfactsPageheader:
			FundFacts.get().VerifyFundfactsPageheader();
			break;

		case VerifyMFActivityChineseContent:
			Investing.get().VerifyMFActivityChineseContent();
			break;

		case VerifyFundDetailsInformationInChinese:
			FundDetails.get().VerifyFundDetailsInformationInChinese();
			break;

		case verifyTransactionDetailsInChinese:
			TransactionDetails.get().verifyTransactionDetailsInChinese();
			break;

		case ClickPreviewPurchase:
			PurchaseMutualFunds.get().ClickPreviewPurchase();
			break;

		case VerifyPreviewPurchasePageHeader:
			PreviewPurchase.get().VerifyPreviewPurchasePageHeader();
			break;

		case VerifyPreviewPurchasePhoneFormat:
			PreviewPurchase.get().VerifyPreviewPurchasePhoneFormat();
			break;

		case GoBackToHomePage:
			PreviewPurchase.get().GoBackToHomePage();
			break;

		case VerifyPreviewPurchasePhoneNotMasked:
			PreviewPurchase.get().VerifyPreviewPurchasePhoneNotMasked();
			break;

		case VerifyPreviewPurchaseContentInChinese:
			PreviewPurchase.get().VerifyPreviewPurchaseContentInChinese();
			break;

		case VerifyMinimumAmount:
			PurchaseMutualFunds.get().VerifyMinimumAmount();
			break;

		case VerifyMaximumAmount:
			PurchaseMutualFunds.get().VerifyMaximumAmount();
			break;

		case savePhoneInforForMFVerification:
			Profile.get().savePhoneInforForMFVerification();
			break;

		case saveEmailInforForMFVerification:
			Profile.get().saveEmailInforForMFVerification();
			break;

		case VerifyPhoneIsPopulatedWithProfilePhone:
			PurchaseMutualFunds.get().VerifyPhoneIsPopulatedWithProfilePhone();
			break;

		case SelectIneligibleFund:
			PurchaseMutualFunds.get().SelectIneligibleFund();
			break;

		case VerifyErrorMessageForIneligibleFund:
			PurchaseMutualFunds.get().VerifyErrorMessageForIneligibleFund();
			break;

		case VerifyEmailIsPopulatedWithProfileEmail:
			PurchaseMutualFunds.get().VerifyEmailIsPopulatedWithProfileEmail();
			break;

		case savePhoneInforForPFVerification:
			PreviewPurchase.get().savePhoneInforForPFVerification();
			break;

		case VerifyPhoneIsNotUpdatedAsMFChanges:
			Profile.get().VerifyPhoneIsNotUpdatedAsMFChanges();
			break;

		case VerifyConfirmationPageHeader:
			Receipt.get().VerifyConfirmationPageHeader();
			break;

		case ClickPurchaseNowBtn:
			PreviewPurchase.get().ClickPurchaseNowBtn();
			break;

		case ClickGoBackHomeBtn:
			Receipt.get().ClickGoBackHomeBtn();
			break;

		case ClickViewMyAccountsBtn:
			Receipt.get().ClickViewMyAccountsBtn();
			break;

		case VerifyQuickLinkPurchaseChineseContent:
			Investing.get().VerifyQuickLinkPurchaseChineseContent();
			break;

		case VerifyReceiptDetailChineseContent:
			Receipt.get().VerifyReceiptDetailChineseContent();
			break;

		case ClickfundFacts:
			FundDetails.get().ClickfundFacts();
			break;

		case VerifyCallFuntionality:
			FundDetails.get().VerifyCallFuntionality();
			break;

		case VerifyZeroBalance:
			Investing.get().VerifyZeroBalance();
			break;

		case ClickBalanceTab:
			Investing.get().ClickBalanceTab();
			break;

		case VerifyUSDConversionRatePresent:
			FundDetails.get().VerifyUSDConversionRatePresent();
			break;

		case VerifyCADValueForMarketAndBookValue:
			FundDetails.get().VerifyCADValueForMarketAndBookValue();
			break;
		case VerifyUSDDisclaimer:
			Investing.get().VerifyUSDDisclaimer();
			break;

		case VerifyPurchaseButtonNotpresent:
			FundDetails.get().VerifyPurchaseButtonNotpresent();
			break;

		case ClickCancelMFpurchase:
			PreviewPurchase.get().ClickCancelMFpurchase();
			break;

		case VerifyUSDAmount:
			PreviewPurchase.get().VerifyUSDAmount();
			break;

		case VerifyCancelPopUpMessage:
			Popupwindow.get().VerifyCancelPopUpMessage();
			break;

		case VerifyPrepopulatedInformatiom:
			PurchaseMutualFunds.get().VerifyPrepopulatedInformatiom();
			break;

		case VerifyWarningMessageContent:
			PreviewPurchase.get().VerifyWarningMessageContent();
			break;

		case VerifyClosingDayDisclaimer:
			FundDetails.get().VerifyClosingDayDisclaimer();
			break;

		case VerifyFundfactsAcknowledgement:
			PreviewPurchase.get().VerifyFundfactsAcknowledgement();
			break;

		// End of Purchase Mutual funds

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

		case VerifyRedemptionText:
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

		case VerifyDollarDecimalValue:
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

		case VerifyAndEnableQuickAccess:
			QuickAccess.get().VerifyAndEnableQuickAccess();
			break;
		// Tetris End

		case VerifyFIFOLogic:
			Trade.get().verifyFIFOLogic();
			break;

		case OrderReciept_CancelOrderReceipt:
			OrderReciept.get().cancelOrderReceipt();
			break;

		case VerifyEquityAndETFs:
			Trade.get().verifyEquityAndETFs();
			break;

		case VerifyTradeOnLandingPage:
			Trade.get().verifyTradeOnLandingPage();
			break;

		case Transfers_Click_PendingTransfer:
			Transfers.get().clickPendingTransfers();
			break;

		case PendingTransfer_Cancel:
			PendingInteracTransfer.get().cancelPendingTransfer();
			break;

		case PlaceHolderText:
			Trade.get().placeHolderText();
			break;

		case Verify_flyoutMenu:
			Options.get().verifyOptionFlyoutMenu();
			break;

		case Fill_OptionOrder:
			Options.get().fillOptionOrder();
			break;

		case VerfiyOptionConfirmOrderScreen:
			Options.get().verifyOptionConfirmOrder();
			break;

		case OptionOrderChangeQuantity:
			Options.get().changeQuantity();
			;
			break;

		case Options_verifyOptionsForNewOrder:
			Options.get().verifyOptionsForNewOrder();
			break;

		case verifyOptionConfirmOrderReceipt:
			OptionsReceiptPage.get().verifyOptionConfirmOrderReceipt();
			break;

		case Options_Changeprice:
			Options.get().changePrice();
			break;

		case Options_ChangeGoodTil:
			Options.get().changeGoodtil();
			break;

		case Options_CancelOrder:
			Options.get().cancelOrder();
			break;

		case Options_CancelOrderConfirmScreen:
			Options.get().verifyOptionCancelConfirmOrder();
			break;

		case Options_VerifytradingPassword:
			Options.get().verifyTradingPassword();
			break;

		case Options_Verifybackbutton:
			Options.get().verifybackButton();
			break;

		case Options_VerifyImportantInformation:
			Options.get().verifyImportantinformation();
			break;

		case Options_VerifyCancelReceipt:
			OptionsReceiptPage.get().verifyOptionCancelOrderReceipt();
			;
			break;

		// Chinese on Mobile
		case MobileDeposit_VerifyTextElements:
			MobileDeposit.get().verifyOptionsTextElements();
			break;

		case MobileDeposit_VerifyTextChequeDetails:
			MobileDeposit.get().verifyChequeDetailsTextElements();
			break;

		case MobileDeposit_VerifyTextDepositChequeHistory:
			MobileDeposit.get().verifyDepositChequeHistoryTextElements();
			break;

		case MobileDeposit_VerifyTextDepositCheque:
			MobileDeposit.get().verifyDepositChequeTextElements();
			break;

		case MobileDeposit_VerifyTextElementsIneligible:
			MobileDeposit.get().verifyIneligibleTextElements();
			break;
		case ClickChequeDepositHistory:
			MobileDeposit.get().chequeDepositHistory();
			break;
		case Menu_VerifyTextElements:
			MenuPage.get().verifyMenuTextElements();
			break;

		case LoginScreen_VerifyTextElements:
			Login.get().verifyLoginScreenTextElements();
			break;

		case HomeScreen_VerifyTextElements:
			HomeScreen.get().verifyHomeScreenTextElements();
			break;

		case HomeScreenDashboardButtons_VerifyTextEelements:
			HomeScreen.get().verifyHomeScreenDashboardButtonsTextElements();
			break;

		case ClickAddRecipientFromContactsList:
			ManageRecipients.get().clickAddRecipientFromContactsList();
			break;

		case ContactUs_VerifyTextElements:
			ContactUs.get().verifyContactUsTextElements();
			break;

		case HomeScreen_ClickOpenNewAccount:
			HomeScreen.get().clickOpenNewAccount();
			break;

		case Between_My_accounts_performTransferToConfirmation:
			Between_My_accounts.get().performTransferToConfirmationPage();
			break;

		case Between_My_accounts_performTransferToSuccess:
			Between_My_accounts.get().performTransferToSuccessPage();
			break;

		case Between_My_accounts_VerifyConfirmationText:
			Between_My_accounts.get().verifyConfirmationTextElements();
			break;

		case Between_My_accounts_VerifySuccessText:
			Between_My_accounts.get().verifySuccessPageTextElements();
			break;

		case Transfer_VerifyTextElements:
			Transfers.get().verifyTransferTextElements();
			break;

		case Between_My_accounts_VerifyTextElements:
			Between_My_accounts.get().verifyBetweenMyAccountsTextElements();
			break;
		case QuickAccess_VerifyActivateText:
			QuickAccess.get().verifyActivateQuickAccessText();
			break;

		case QuickAccess_VerifyFTEText:
			QuickAccess.get().verifyFTEQuickAccessText();
			break;
		case Logout_VerifyTextElements:
			Logout.get().verifyLogoutScreenTextElements();
			break;
		case PayBill_Canada_VerifyTextElements:
			Bills.get().verifyPayCanadianBillTextElements();
			break;

		case PayBill_US_VerifyTextElements:
			Bills.get().verifyPayUSBillTextElements();
			break;

		case PayBill_US_VerifyTextElementsSuccess:
			Pay_US_Bill.get().verifyPayUSBillSuccessTextElements();
			break;

		case PayBill_US_VerifyTextElementsNeverRegistered:
			Pay_US_Bill.get().verifyPayUSBillWelcomeTextElements();
			break;

		case PayBill_Canada_VerifyTextElementsConfirmation:
			Bill_PayCanada.get().verifyPayCanadianBillConfirmationTextElements();
			break;

		case PayBill_US_VerifyTextElementsConfirmation:
			Pay_US_Bill.get().verifyPayUSBillConfirmationTextElements();
			break;
		case ManageRecipient_ClickAddRecipient:
			ManageRecipients.get().clickAddRecipient();
			break;

		case ManageRecipient_VerifyTextAddRecipientConfirmation:
			ManageRecipients.get().verifyAddRecipientConfirmationTextElements();
			break;

		case ManageRecipient_VerifyTextAddRecipientFromContactsList:
			ManageRecipients.get().verifyAddRecipientFromContactsListTextElements();
			break;

		case ManageRecipient_VerifyTextAddRecipientSuccess:
			ManageRecipients.get().verifyAddRecipientSuccessTextElements();
			break;

		case ManageRecipient_VerifyTextAddRecipient:
			ManageRecipients.get().verifyAddRecipientTextElements();
			break;

		case ManageRecipient_ClickYesAddRecipientFromContacts:
			ManageRecipients.get().addRecipientFromContactList();
			break;

		case ManageRecipient_VerifyTextRecipientInfo:
			ManageRecipients.get().verifyViewRecipientInfoTextElements();
			break;

		case ManageRecipient_VerifyTextEditRecipientInfo:
			ManageRecipients.get().verifyEditRecipientInfoTextElements();
			break;

		case ManagePayees_VerifyTextElements:
			Managee_Payee.get().verifyMyPayeesTextElements();
			break;
		case ManagePayees_VerifySpecificPayeeTextElements:
			Managee_Payee.get().verifySpecificPayeeTextElements();
			break;
		case Interac_VerifyTextElements:
			Interac_e_Transfer.get().verifyInteracETransferTextElements();
			break;

		case Interac_e_Transfer_VerifyConfirmationText:
			Interac_e_Transfer.get().verifyInteracETransferConfirmationPageTextElements();
			break;

		case Interac_e_Transfer_VerifySuccessText:
			Interac_e_Transfer.get().verifyInteracETransferSuccessTextElements();
			break;
		case Investing_VerifyTextOpenNewAccount:
			Investing.get().verifyOpenNewAccountTextElements();
			break;
		case ManageRecipients_VerifyTextElements:
			ManageRecipients.get().verifyMyRecipientsTextElements();
			break;
		case ManagePayee_AddUSPayee:
			Managee_Payee.get().addUSPayee();
			break;

		case ManagePayee_VerifyTextSearchPayee:
			Managee_Payee.get().verifySearchPayeesTextElements();
			break;

		case Accounts_VerifyTextOpenNewAccount:
			Accounts.get().verifyOpenNewAccountTextElements();
			break;
		case AddPayee_VerifyTextReview:
			AddPayee.get().verifyAddPayeeReviewTextElements();
			break;

		case AddPayee_VerifyTextReviewUS:
			AddPayee.get().verifyAddUSPayeeReviewTextElements();
			break;

		case AddPayee_VerifyTextSelectUSAddress:
			AddPayee.get().verifyAddUSPayeeSelectAddressTextElements();
			break;

		case AddPayee_VerifyTextConfirmation:
			AddPayee.get().verifyAddPayeeConfirmationTextElements();
			break;

		case AddPayee_VerifyTextSuccess:
			AddPayee.get().verifyAddPayeeSuccessTextElements();
			break;
		case Bills_VerifyTextConfirmCancelScheduledPayment:
			Bills.get().verifyConfirmCancelScheduledPaymentTextElements();
			break;

		case Bills_VerifyTextNoCanadianPayeesAdded:
			Bills.get().verifyNoPayeesPayBillTextElements();
			break;

		case Bills_ScheduledPayments_VerifyText:
			Bills.get().verifyScheduledPaymentsTextElements();
			break;

		case Bills_VerifyTextElements:
			Bills.get().verifyBillsTextElements();
			break;
		case PendingInterac_e_Transfer_cancel_confirmation_VerifyText:
			Interac_e_Transfer.get().verifyCancelETransferConfirmationTextElements();
			break;
		case PendingInterac_e_Transfer_cancel_deposit_to_VerifyText:
			Interac_e_Transfer.get().verifyCancelETransferTextElements();
			break;

		case PendingInterac_e_Transfer_VerifyText:
			Interac_e_Transfer.get().verifyPendingETransfersTextElements();
			break;
		case ClickCrossBorderBanking:
			MenuPage.get().clickMenuCrossBorder();
			break;

		case CrossBorderBanking_VerifyTextLoginPopup:
			CrossBorder.get().verifyCrossBorderLoginPopupTextElements();
			break;

		case CrossBorderBanking_ClickLogin:
			CrossBorder.get().clickLogin();
			break;

		case ManageRecipient_VerifyTextContactsPopUp:
			ManageRecipients.get().verifyAddRecipientFromContactsPopupTextElements();
			break;

		case AccountsCredit_VerifySummaryText:
			Accounts_Credit.get().verifySummaryTabTextElements();
			break;

		case AccountsCredit_VerifyActivityText:
			Accounts_Credit.get().verifyActivityTabTextElements();
			break;

		case AccountsCredit_VerifyCreditText:
			Accounts_Credit.get().verifyCreditTextElements();
			break;

		case AccountsCredit_VerifyTabTextElements:
			Accounts_Credit.get().verifyCCTabTextElements();
			break;
		case CrossBorderBanking_VerifyTextWelcomePage:
			CrossBorder.get().verifyCrossBorderWelcomeTextElements();
			break;
		case clickInvestingAccounts:
			MenuPage.get().clickInvestingAccounts();
			;
			break;

		case InvestingAccountSummary_verifyDetails:
			InvestingAccountSummary.get().verifyInvestingAccountDetails();
			break;

		case InvestingAccountSummary_verifyCreditCardSummaryDetails:
			InvestingAccountSummary.get().verifyCrediCardSummaryDetails();
			break;

		case InvestingAccountSummary_verifyCreditCardActivityDetails:
			InvestingAccountSummary.get().verifyCrediCardActivityDetails();
			break;

		case InvestingAccountSummary_verifyCreditCardPaymentDetails:
			InvestingAccountSummary.get().verifyCrediCardPaymentDetails();
			break;

		case InvestingAccountSummary_verifyCreditCardPaymentPurchaseDetails:
			InvestingAccountSummary.get().verifyCrediCardPaymentPurchaseDetails();
			break;

		case InvestingAccountSummary_verifyCreditCardStatementDetails:
			InvestingAccountSummary.get().verifyCreditCardStatementDetails();
			break;

		case InvestingAccountSummary_verifyCreditCardStatementTabDetails:
			InvestingAccountSummary.get().verifyCreditCardStatementTabDetails();
			break;

		case InvestingAccountSummary_verifyHoldingsDetails:
			InvestingAccountSummary.get().verifyInvestingHoldingDetails();
			break;

		case InvestingAccountSummary_verifyListedHoldingsDetails:
			InvestingAccountSummary.get().verifyListedHoldingDetails();
			break;

		case InvestingAccountSummary_verifyInvestingOrderDetails:
			InvestingAccountSummary.get().verifyInvestingOrderDetails();
			break;

		case MutualFunds_verifyMutualFundDetails:
			MutualFunds.get().verifyMutualFundDetails();
			break;

		case InvestingAccountSummary_verifyOrdersDetails:
			InvestingAccountSummary.get().verifyOrderDetails();
			break;

		case InvestingAccountSummary_verifyActivityTabDetails:
			InvestingAccountSummary.get().verifyActivityTabDetails();
			break;
		case Investing_verifyPageDetails:
			Investing.get().verifyInvestingPageDetails();
			break;

		case Investing_clickAccount:
			Investing.get().clickAccount();
			break;

		case OTP_Challenge_ClickTextOption:
			OTPChallenge.get().clickTextOption();
			break;

		case OTP_Challenge_ClickVoiceOption:
			OTPChallenge.get().clickTextVoice();
			break;

		case OTP_Challenge_ClickFirstPhoneNumber:
			OTPChallenge.get().clickFirstPhoneNumber();
			break;

		case OTP_Challenge_EnterSecurityCode:
			OTPChallenge.get().enterSecurityCode();
			break;

		case OTP_Challenge_ClickGetCodeButton:
			OTPChallenge.get().clickGetCodeButton();
			break;

		case OTP_Challenge_ClickSubmitCodeButton:
			OTPChallenge.get().clickSubmitCodeButton();
			break;

		case OTP_Challenge_VerifyInvalidSecurityCode:
			OTPChallenge.get().verifyInvalidSecurityCodeMsg();
			break;

		case OTP_Challenge_WaitForOTPProgressBarToVanish:
			OTPChallenge.get().waitForOTPProgressBarToVanish();
			break;

		case OTP_Challenge_ResendCode:
			OTPChallenge.get().clickResendCode();
			break;

		case OTP_Challenge_VerifyTooManySecurityCodesRequested:
			OTPChallenge.get().verifyTooManySecurityCodesRequestedMsg();
			break;

		// MySpend

		case TourPage_clickConnectTDApp:
			TourPage.get().clickConnectTDApp();
			break;

		case Spending_Insight_verifyPageHeader:
			Spending_Insight.get().verifyPageHeader();
			break;

		case Spending_Insight_clickMenuButton:
			Spending_Insight.get().clickSideMenuButton();
			break;

		case SideMenu_clickPreferences:
			SideMenu.get().clickPreferences();
			break;

		case SideMenu_clickSpendingByCategory:
			SideMenu.get().clickSpendingByCategory();
			break;

		case SideMenu_verifyDeepLinks:
			SideMenu.get().verifyDeepLinks();
			break;

		case Preferences_verifyPageHeader:
			MyspendPreferences.get().verifyPageHeader();
			break;

		case Preferences_EnableAllAccounts:
			MyspendPreferences.get().enableAllAccounts();
			break;

		case Preferences_DisableAllAccounts:
			MyspendPreferences.get().disableAllAccounts();
			break;

		case Spending_Insight_verifyPreferencesDisabled:
			Spending_Insight.get().verifyPreferencesDisabled();
			break;

		case Spending_Insight_logoutTDMySpend:
			Spending_Insight.get().logoutApplication();
			break;

		case Spending_Insight_verifyPreferencesEnabled:
			Spending_Insight.get().verifyPreferencesEnabled();
			break;

		case SideMenu_clickSpendingHistory:
			SideMenu.get().clickSpendingHistory();
			break;

		case SideMenu_clickSpendingSpikes:
			SideMenu.get().clickSpendingSpikes();
			break;

		case SideMenu_clickSpendingInsights:
			SideMenu.get().clickSpendingInsights();
			break;

		case SideMenu_clickTransactionHistory:
			SideMenu.get().clickTransactionHistory();
			break;

		case SpendingHistory_verifyNoSpendingHistory:
			SpendingHistory.get().verifyNoSpendingHistory();
			break;

		case click_PreferencesLink:
			SpendingHistory.get().clickPreferencesLink();
			break;

		case SpendingHistory_verifySpendingHistory:
			SpendingHistory.get().verifySpendingHistory();
			break;

		case spendingByCategory_verifyPageHeader:
			SpendingByCategory.get().verifyPageHeader();
			break;

		case spendingByCategory_verifyCategories:
			SpendingByCategory.get().verifySpendingByCategories();
			break;

		case spendingByCategory_changeCategoryForAllTabs:
			SpendingByCategory.get().changeCategoryForAllTabs();
			break;

		case spendingByCategory_changeCategory:
			SpendingByCategory.get().changeCategory();
			break;

		case SpendingSpike_verifyCurrentMonthSpending:
			SpendingSpikes.get().clickCurrentMonthSpending();
			break;

		case TransactionHistory_verifyNoTransactionsFound:
			TransactionHistory.get().verifyNoTransactionsFound();
			break;

		case TransactionHistory_verifyTransactions:
			TransactionHistory.get().verifyTransactions();
			break;

		case TransactionHistory_verifyPageHeader:
			TransactionHistory.get().verifyPageHeader();
			break;

		case TDAppHomePage_verifyPageHeader:
			TDAppHomePage.get().verifyPageHeader();
			break;

		case TDAppHomePage_clickTDMySpend:
			TDAppHomePage.get().clickTDMySpend();
			break;

		case SideMenu_clickMyAccounts:
			SideMenu.get().clickMyAccounts();
			break;

		case SideMenu_clickGetTDAppButton:
			SideMenu.get().clickGetTDAppButton();
			break;

		case SpendingHistory_clickMonthIcon:
			SpendingHistory.get().clickMonthIcon();
			break;

		case SpendingHistory_verifyTabs:
			SpendingHistory.get().verifyTabs();
			break;

		case SpendingHistory_clickHomeButton:
			SpendingHistory.get().clickHomeButton();
			break;

		case Spending_Insight_clickAndVerifyLogout:
			LogoutMySpend.get().logoutMySpend();
			break;

		case Spending_Insight_clickMoneyPathButton:
			Spending_Insight.get().clickMoneyPathButton();
			break;

		case MySpend_RegistrationFlow:
			TourPage.get().registrationFlow();
			break;

		case SpendingByCategory_clickHistoricalInsightBtn:
			SpendingByCategory.get().clickHistoricalInsightsBtn();
			break;

		case SpendingHistory_verifySpendingHistoryHeader:
			SpendingHistory.get().verifySpendingHistoryHeader();
			break;

		case TransactionHistory_transacHistoryFunctionality:
			TransactionHistory.get().transactionHistoryPageFunctionality();
			break;

		case MoneyPath_moneyPathFunctionality:
			MoneyPath.get().moneyPathFunctionality();
			break;

		case SpendingInsights_verifySpendingInsightsPage:
			Spending_Insight.get().verifySpendingInsightsPage();
			break;

		case Logout_logout:
			Logout.get().logout();
			break;

		case SpendingHistory_clickSpendingHistory:
			SpendingHistory.get().clickSpendingHistory();
			break;

		case Preferences_enableAccounts:
			MyspendPreferences.get().enableAccountsInPreferencePage();
			break;

		case SpendingSpike_verifySpikesCategories:
			SpendingSpikes.get().verifySpikesCategories();
			break;

		case SpendingByCategory_verifySpikes:
			SpendingByCategory.get().verifySpikes();
			break;

		case SpendingSpike_pageMessages:
			SpendingSpikes.get().spendingSpikePageMessages();
			break;

		}
	}

	public void generateReport() {
	}

	public void beforeTest() {
	}

}
