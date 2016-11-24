package com.td;

import java.io.IOException;

import com.td.test.CDNMobile.Page.*;

public class EventCase {

  private enum functionNames {
    OpenApp,

    Login, DashBoard_Account_Button, 
    DashBoard_Bills_Button,
    DashBoard_Transfer_Button, 
    MFA_Change, 
    Interac_e_Transfer, 
    Transfer_Interac_E, 
    Transfer_Btw_My_Accounts, 
    Account_Prefer_Button, 
    Accounts_Verify_Page, 
    Menu_Mobile_deposit, 
    Menu_Transfers, USA_TFSA_Account, 
    Mobile_Deposit, 
    Trans_btw_My_Accounts, 
    Trans_To_Any_Accounts,
    Account_Home_Button, 
    Preferences_Update_Question,Banking_Header,
    Investing_Header, 
    Transfer_Manage_Recip_Button,
    CMOB_InitialSwipe,CMOB_Env_set,Logout,LoginNtimesAndLogout,
    END
    
    
  }

  // @Override
  public void FuncCOREEventCase(String sFunctionname) throws IOException {

    switch (functionNames.valueOf(sFunctionname)) {
      case OpenApp:
        MainScreen.get().Splash_Conitnue();
        break;

      case Login:
        Login.get().login();
        break;
      case Preferences_Update_Question:
        Preferences.get().prefernces_Update_Security_Question();
        break;
        
      case Logout:
    	  Logout.get().logout();
    	  break;
    
      case LoginNtimesAndLogout:
    	  Login.get().loginNTimes();
    	  break;
    	  
      case Account_Home_Button:
        Accounts.get().account_Home_Btn_click();
        break;
        
      case Banking_Header:
        Accounts.get().verify_Banking_Header();
        break;
        
      case CMOB_InitialSwipe:

        CMOB_InitialSwipe.get().InitialSwipe();
        break;

        case CMOB_Env_set:
        CMOB_Env_Settings.get().set_environment();
        break;

      case DashBoard_Account_Button:
        DashBoard_Screen.get().accounts_Click();
        break;
        
      case DashBoard_Bills_Button:
    	  DashBoard_Screen.get().bills_Click();
    	  break;


      case DashBoard_Transfer_Button:
        DashBoard_Screen.get().transfer_Click();
        break;
        
      case Investing_Header:
        Accounts.get().verify_Investing_Header();
        break;

      case MFA_Change:
        MFA_ChangeAnswer.get().mfa_update();
        break;

      case Transfer_Interac_E:
        Transfers.get().Interac_E_button();
        break;

      case Menu_Mobile_deposit:
        Flyout_Menu.get().mobile_Deposit_click();
        break;

      case USA_TFSA_Account:
        Accounts.get().verify_TFS_ACC_ISPresent();
        break;
      case Transfer_Btw_My_Accounts:
        Transfers.get().btw_My_Accounts_btn();
        break;

      case Trans_btw_My_Accounts:
        Transfer_Btw_My_Accounts.get().verifyBtw_My_Accounts();
        break;
        
      case Trans_To_Any_Accounts:
        Transfer_Btw_My_Accounts.get().transferBtw_tfsa_other_Acct_click();
        break;
        
      

      case Menu_Transfers:
        Flyout_Menu.get().transfer_click();
        break;

      case Mobile_Deposit:
        Mobile_Deposit_Page.get().mobile_Dpst_Validation_Page();
        break;


      case Accounts_Verify_Page:
        Accounts.get().verifyAccountPage();
        break;

      case Interac_e_Transfer:
        Interac_E_Transfer.get().interac_e_Transfer();;
        break;

      case Account_Prefer_Button:
        Accounts.get().account_Prefernces_button();;
        break;

      case Transfer_Manage_Recip_Button:
        Transfers.get().manage_Recipients_btn(); 
        break;

    }
  }

  public void generateReport() {}

}
