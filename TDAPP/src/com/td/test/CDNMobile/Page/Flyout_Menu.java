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

public class Flyout_Menu extends _CommonPage {

  private static Flyout_Menu Flyout_Menu;

  
  @iOSFindBy(xpath="//*[label='Menu']") 
  @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
  private MobileElement flyout_Menu_button;
  
  
  @iOSFindBy(xpath="//*[label='Mobile Deposit']") 
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Mobile Deposit']")
  private MobileElement mobile_Deposit_button;

  @iOSFindBy(xpath="//*[label='Transfers']") 
  @AndroidFindBy(
      xpath = "//android.widget.TextView[@text='Transfers']")
  private MobileElement transfers_button;


  public synchronized static Flyout_Menu get() {
    if (Flyout_Menu == null) {
    	Flyout_Menu = new Flyout_Menu();
    }
    return Flyout_Menu;
  }


  private void Decorator() {
    PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()),
        new TimeOutDuration(15, TimeUnit.SECONDS)), this);


  }

  public void mobile_Deposit_click() {

    System.out.println("Trial for Page factory class");
    Decorator();
    try {
      String mobile_Deposit = "Mobile Deposit";
      mobileAction.FuncClick(flyout_Menu_button,"FlyOut_Menu_button");
      System.out.println("The menu button has been clicked");
      mobileAction.FuncScrollToText(mobile_Deposit);
      mobileAction.FuncClick(mobile_Deposit_button,"Mobile_Deposit_Button");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void transfer_click() {

    System.out.println("Trial for Page factory class");
    Decorator();
    try {
 

  
      mobileAction.FuncClick(flyout_Menu_button,"Menu_Button");
      System.out.println("The menu button has been clicked");

      mobileAction.FuncClick(transfers_button,"Transfer_Button");

    }


    catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();

    }
  }
}
