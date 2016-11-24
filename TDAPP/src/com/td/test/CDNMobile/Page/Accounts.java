package com.td.test.CDNMobile.Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Accounts extends _CommonPage {

  private static Accounts Accounts;


  private void Decorator() {
    PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()),
        new TimeOutDuration(15, TimeUnit.SECONDS)), this);
  }

  @iOSFindBy(xpath = "//*[label='My Accounts']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@text='My Accounts']")
  private MobileElement my_Account_Header;

  @iOSFindBy(xpath = "//*[label='Transfers']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/textView1'and @text='Total']")
  private MobileElement accounts_total;

  
  @iOSFindBy(xpath = "//*[label='Transfers']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[text='$') and @resource-id='com.td:id/canTotal']")
  private MobileElement can_account_total;
  

  @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up' and @index='0']")
  private MobileElement homeButton;
  
  
  @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Preferences']")
  private MobileElement preferences;
  
  @iOSFindBy(xpath = "//*[label='BANKING']")
  @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='BANKING']")
  private MobileElement account_Banking_header;
 
  @iOSFindBy(xpath = "//*[label='INVESTING']")
  @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='INVESTING']")
  private MobileElement account_Investing_header;
  
  
  
  @iOSFindBy(xpath = "//*[label='US TFSA, TD Direct Investing  3294']")
  @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='INVESTING']")
  private MobileElement US_TFSA_Account;
  
  @iOSFindBy(xpath = "//*[label='Activity']")
  @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='INVESTING']")
  private MobileElement US_TFSA_ACC_Activity;

  
  @iOSFindBy(xpath = "//*[label='Transfers']")
  @AndroidFindBy(
      xpath = "//android.widget.TextView[text='USD $'and @resource-id='com.td:id/usTotal')]")
  private MobileElement us_account_total;

  public synchronized static Accounts get() {
    if (Accounts == null) {
      Accounts = new Accounts();
    }
    return Accounts;
  }

  String Account_header = "My Accounts";
  String can_account_value="$";
  String us_Account_value="USD $";
  public void verifyAccountPage() {
    Decorator();
    try {
     
      mobileAction.verifyElement(my_Account_Header, Account_header);
      
      System.out.println("Account header has been verified :"+my_Account_Header.isDisplayed());
      mobileAction.FuncScrollToText("Total");
      mobileAction.verifyElement(can_account_total, can_account_value);
      System.out.println("Account header has been verified :"+can_account_total.isDisplayed());
      mobileAction.verifyElement(us_account_total, us_Account_value);

    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
    
    public void account_Prefernces_button(){
      Decorator();
      try{
        String prefernces = "Preferences";
        System.out.println("Account header has been verified :"+my_Account_Header.isDisplayed());
        mobileAction.FuncScrollToText(prefernces);
        mobileAction.FuncClick(preferences,prefernces);


      }catch(Exception ex){
        
      }
    }
    
  
  public void account_Home_Btn_click(){
    
    Decorator();
  try {
    mobileAction.verifyElement(my_Account_Header, Account_header);
    System.out.println("Account header has been verified :"+my_Account_Header.isDisplayed());
    mobileAction.FuncClick(homeButton,"HOMEBUTTON");
  } catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  } 
  
 }
  
  public void verify_TFS_ACC_ISPresent(){
    
    Decorator();
  try {
    
    String t_US_TFSA="US TFSA";
    mobileAction.verifyElement(my_Account_Header, Account_header);
    System.out.println("Account header has been verified :"+my_Account_Header.isDisplayed());
    mobileAction.FuncScrollToText(t_US_TFSA);
    mobileAction.FuncClick(US_TFSA_Account,t_US_TFSA);
    mobileAction.FuncClick(US_TFSA_ACC_Activity,"US_TFSA_ACTIVITY");
   
  } catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  } 
  
  
  
 }
  
  public void verify_Banking_Header(){
    Decorator();
    try {
      System.out.println("Account header has been verified :"+my_Account_Header.isDisplayed());
      String t_banking="Banking";
      mobileAction.verifyElement(account_Banking_header, t_banking);
      System.out.println("Banking header has been verified :"+account_Banking_header.isDisplayed());

  }catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  } 
  }
  
  

  
  public void verify_Investing_Header(){
    Decorator();
    try {
      String t_investing="INVESTING";
      mobileAction.FuncScrollToText(t_investing);
      mobileAction.verifyElement(account_Investing_header, t_investing);
      System.out.println(" Brokerage header has been verified :"+account_Investing_header.isDisplayed());

  }catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  } 
}
}
