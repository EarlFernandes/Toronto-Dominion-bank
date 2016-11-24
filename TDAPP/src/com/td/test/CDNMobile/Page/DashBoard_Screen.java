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

public class DashBoard_Screen extends _CommonPage {

  private static DashBoard_Screen DashBoard_Screen;


  private void Decorator() {
    PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()),
        new TimeOutDuration(15, TimeUnit.SECONDS)), this);
    System.out.println("Decorator method has been finished");

  }
  @iOSFindBy(xpath="//*[label='My Accounts']") 
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='My Accounts']")
  private MobileElement account_button;
  
  @iOSFindBy(xpath="//*[label='Transfers']") 
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/transfers_dashboard' and @text='TRANSFERS']")
  private MobileElement transfer_button;
  
  @iOSFindBy(xpath="//*[label='Transfers']") 
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Bills']")
  private MobileElement bills_button;
 

  public synchronized static DashBoard_Screen get() {
    if (DashBoard_Screen == null) {
    	DashBoard_Screen = new DashBoard_Screen();
    }
    return DashBoard_Screen;
  }


  public void accounts_Click() {
    Decorator();
    try {
      mobileAction.FuncClick(account_button,"MY ACCOUNTS");
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
    public void transfer_Click() {
      Decorator();
      try {
        mobileAction.FuncClick(transfer_button,"TRANSFER");
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  
}
    public void bills_Click() {
        Decorator();
        try {
          mobileAction.FuncClick(bills_button,"Bills");
        } catch (Exception e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
    
  }
}
