package com.td;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;

import com.td.CMOB.pages.Accounts;
import com.td.CMOB.pages.AddCanadian_Payee;
import com.td.CMOB.pages.AddRecipient;
import com.td.CMOB.pages.Between_My_accounts;
import com.td.CMOB.pages.Bill_PayCanada;
import com.td.CMOB.pages.Bills;
import com.td.CMOB.pages.ConfirmOrder;
import com.td.CMOB.pages.Confirm_Payee;
import com.td.CMOB.pages.HomeScreen;
import com.td.CMOB.pages.Interac_e_Transfer;
import com.td.CMOB.pages.Investing;
import com.td.CMOB.pages.Login;
import com.td.CMOB.pages.Logout;
import com.td.CMOB.pages.MFA_ChangeAnswer;
import com.td.CMOB.pages.ManageRecipients;
import com.td.CMOB.pages.Managee_Payee;
import com.td.CMOB.pages.MenuPage;
import com.td.CMOB.pages.Mobile_Deposit_Page;
import com.td.CMOB.pages.Multitasking_System;
import com.td.CMOB.pages.OrderDetails;
import com.td.CMOB.pages.OrderReciept;
import com.td.CMOB.pages.Pay_US_Bill;
import com.td.CMOB.pages.Preferences;
import com.td.CMOB.pages.QuickAccessPage;
import com.td.CMOB.pages.SearchPage;
import com.td.CMOB.pages.Trade;
import com.td.CMOB.pages.Transfers;
import com.td.CMOB.pages.WatchLists;
import com.td.test.CDNMobile.Env_Settings;
import com.td.test.CDNMobile.MainScreen;

public class EventCase {

	private enum functionNames {
		OpenApp, 
		Login, QuickAccess,  
		Account_Home_Button, 
		Account_Prefer_Button, 
		Add_Recipient_ErrorPage,
		AddCanadianPayee,
		
		Menu_Mobile_deposit, 
		Mobile_Deposit, Preferences_Update_Question, HomeScreen_Transfer_Button, Trans_TFSA_To_Othr_Accounts, MFA_Change, 
		
		 Banking_Header, 
		 Between_My_Accounts_LIRA, 
		 
		 ClickMenu,
		 ClickMenuTransfer, 
		Investing_Header, Between_My_Accounts_Permissible_Transfer, Between_My_accounts_transfer, 
		Between_My_accounts_Exchange_Rate_Expired, Between_My_accounts_Mobile_Rate_Expiry, 
		Multitasking_System, Transfers, BetweenMyAccounts_TransferNotSupported, 
		IOS_Account_Home_Button, Between_My_accounts, Accounts_Verify_Page, 
		Transfers_Click_Between_My_Accounts, 
		HomeScreen_ClickTransfers, Env_set, 
		
		HomeScreen_ClickQuickAccess,
		HomeScreen_ClickBills, 
		HomeScreen_ClickAccounts,
		HomeScreen_ClickTransfersFrench, 
		LoginFrench, 
		LogoutFrench, 
		MenuBills, 
		Menu_Investing,
		ManagePayee_MutlipleAccesscard,
		Transfers_click_Interac_eTransfer,
		ManagePayees_Button,
		
		PayBill_Canada_Button, 
		PayCanadaBillP_Pay_Candadian_Bill, 
		PayBillCanada_Add_Canadian_Payee,
		PayBill_US_Button,
		Pay_US_bill_FromCanada_Account,
		Pay_US_bill_From_US_Account,
		CanadianPayee_ConfirmPage,
		
		Between_My_accounts_exchange_rate_expired, PayCanadaBill_Post_Dated, ClickMenu_French, 
		VerifyUser, Logout, Loginverify,LoginWithRemember,Menu_Accounts,
		
		Menu_ClickTransfersFrench,
		
		
		Investing_clickTrade,
		Investing_clickPlacedorder,
		Investing_clickInvestingAccount,
		Investing_clickOrdertab,
		Investing_verifyAdvanceorderdetails,
		Interac_AddRecipient,
		
		Trade_clickStockETFs,
		Trade_selectAccount,
		Trade_Details,
		Trade_clickOnAgree,
		Trade_verifyTrade,
		Trade_clickOnPreviewOrderBtn,
		Trade_selectQuantity,
	
	
		Trade_clickOptions,
		Trade_sendOrder,
		ClickBack,
		ConfirmPayee,
		Confirm_order,
		TradeMarginAccount,
		
		OrderReciept_ordertab,
		OrderReciept_orderDetails,
		OrderReciept_orders,
		OrderReciept_verifyOrderScreen,
		
		OrderDetails_clickChangeorder,
		
		Investing_clickWatchLists,
		WatchLists_clickSearchBar,
		WatchLists_verifySymbol,
		WatchLists_addSymbolToWatchLists,
		WatchLists_verifySymbolAdded,
		WatchLists_verifyRecentSearches,
		Flyout_Location,
		Accounts_EW_WB_Functionality,
		HomeScreen_Location_Details,
		Login_Ntimes,
		ManageRecipients_VerifyRegisterButton,	
		Transfers_ManageRecipients,
		
		
		SearchPage_searchBar,
		SendMoneyLogin,
		SendMoneyButton,
		
		END,
	}

	// @Override
	public void FuncCOREEventCase(String sFunctionname)
			throws IOException, NoSuchElementException, InterruptedException, Exception {

		switch (functionNames.valueOf(sFunctionname)) {
		case OpenApp:
			MainScreen.get().Splash_Conitnue();
			break;
			
		case Banking_Header:
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

		case IOS_Account_Home_Button:
			Accounts.get().ios_account_Home_Btn_click();
			break;

		

		case Mobile_Deposit:
			Mobile_Deposit_Page.get().mobile_Dpst_Validation_Page();
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
		case Env_set:
			Env_Settings.get().set_environment();
			break;

		case ClickMenu:
			HomeScreen.get().clickMenu();
			break;
			
			
		case Add_Recipient_ErrorPage:
			AddRecipient.get().addRecipient_ErrorMessage();
			break;

		case ClickMenu_French:
			HomeScreen.get().clickMenu_french();
			break;

		case ClickMenuTransfer:
			MenuPage.get().clickMenuTransfer();
			break;

		case HomeScreen_ClickBills:
			HomeScreen.get().clickBill();
			break;

		case HomeScreen_ClickAccounts:
			HomeScreen.get().clickMyAccounts();
			break;

		case Accounts_Verify_Page:
			Accounts.get().verifyAccountPage();
			break;

		case Login:
			Login.get().login();
			break;

		case HomeScreen_ClickTransfers:
			HomeScreen.get().clickTransfers();
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
			
			Logout.get().logout();

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
			
		case TradeMarginAccount:
			Trade.get().tradeDetails_marginAccount();
			break;
	

		case PayBill_Canada_Button:
			Bills.get().click_pay_canadian_bill();
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
			AddCanadian_Payee.get().addCanadianPayee();
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

		case VerifyUser:
			Login.get().verifyMostUser();
			break;
			
		case ManagePayee_MutlipleAccesscard:
			Managee_Payee.get().verifyMultipleAccessCard();
			break;
			
		case Confirm_order:

			ConfirmOrder.get().clickconfirm_order();

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
				
				
			
			case Transfers_click_Interac_eTransfer:
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
				
			case SendMoneyLogin:
				Login.get().sendMoneyLogin();
				break;
			
			case SendMoneyButton:
				HomeScreen.get().sendMoney();
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
		}
	}
	
	public void generateReport(){
	}
	

}
