package com.td.test.CDNMobile.Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Transfer_Btw_My_Accounts extends _CommonPage {
  private static Transfer_Btw_My_Accounts Transfer_Btw_My_Accounts;


  private void Decorator() {
    PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()),
        new TimeOutDuration(15, TimeUnit.SECONDS)), this);
  }

  @iOSFindBy(xpath = "//*[label='Between My Accounts']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfer_Btw_My_Accounts']")
  private MobileElement btw_My_Account_Header;
  
  
  @iOSFindBy(xpath = "//*[label='Between My Accounts']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Between My Accounts']")
  private MobileElement btw_Two_Accounts_Header;
  
  @iOSFindBy(xpath = "//*[label='From Account, Select from acco']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount' and @text='Select From Account']")
  private MobileElement from_Account;

  @iOSFindBy(xpath = "//*[label='To Account, Select to account']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/edtToAccount' and @text='Select To Account']")
  private MobileElement to_Account;
  
  @iOSFindBy(xpath ="//*[label='HIGH INTEREST TFSA SAVINGS ACCOUNT 6403147']")
  @AndroidFindBy(
     xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='HIGH INTEREST TFSA SAVINGS ACCOUNT']")
  private MobileElement tfsa_Account_Click;
  
  @iOSFindBy(xpath = "//*[label='TD BASIC BUSINESS PLAN']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/txtAccountDesc' and @text='TD BASIC BUSINESS PLAN']")
  private MobileElement other_Account;
  
  @iOSFindBy(xpath = "")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_Deposit' and @text='Withdrawals may impact your annual TFSA contribution limit. For more info, please refer to www.tdcanadatrust.com/tfsa.']")
  private MobileElement verify_Message;
  
  @iOSFindBy(xpath = "//*[label='Transfers']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1'and @text='Total']")
  private MobileElement accounts_total;

  
  @iOSFindBy(xpath = "//*[label='Transfers']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[text='$') and @resource-id='com.td:id/canTotal']")
  private MobileElement can_account_total;
  

  
  @iOSFindBy(xpath = "//*[label='Transfers']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[text='USD $'and @resource-id='com.td:id/usTotal')]")
  private MobileElement us_account_total;
  
  
  String validate_message="Withdrawals may impact your annual TFSA contribution limit. For more info, please refer to www.tdcanadatrust.com/tfsa.";
  String tfsa_Account="HIGH INTEREST TFSA SAVINGS ACCOUNT";
  
  public synchronized static Transfer_Btw_My_Accounts get() {
    if (Transfer_Btw_My_Accounts == null) {
      Transfer_Btw_My_Accounts = new Transfer_Btw_My_Accounts();
    }
    return Transfer_Btw_My_Accounts;
  }

 
  public void verifyBtw_My_Accounts() {
    Decorator();
    try {

      
      System.out.println("Account header has been verified :"+btw_My_Account_Header.isDisplayed());
      mobileAction.FuncScrollToText("Total");


    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
    
    public void transferBtw_tfsa_other_Acct_click() {
      Decorator();
      try {

        System.out.println("Between My Accounts header has been verified :"+btw_Two_Accounts_Header.isDisplayed());
        mobileAction.FuncClick(from_Account,"From_Account");
        mobileAction.FuncScrollToText(tfsa_Account);
        mobileAction.FuncClick(tfsa_Account_Click,"TFSA_ACCOUNT_CLICK");
        mobileAction.FuncClick(to_Account,"To_Account");
        mobileAction.FuncClick(other_Account,"Other_Account");
        mobileAction.verifyElement(verify_Message,validate_message);
        System.out.println("verify the message successfully!!!");


      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  }

}


