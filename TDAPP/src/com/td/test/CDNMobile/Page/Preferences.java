package com.td.test.CDNMobile.Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.framework.CommonLib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class Preferences extends _CommonPage{

private static Preferences Preferences;


@AndroidFindBy(
    xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Preferences']")
private MobileElement preferences_Header;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='What's New']")
private MobileElement what_New_Btn;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Update Security Questions']")
private MobileElement secret_Question_button;

public synchronized static Preferences get() {
  if (Preferences == null) {
    Preferences = new Preferences();
  }
  return Preferences;
}

private void Decorator() {
  PageFactory.initElements(
          new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
          this);
  System.out.println("Decorator method has been finished");
  
}

public void prefernces_What_New_btn() {

  System.out.println("Trial for Page factory class");
  Decorator();
  try {

    System.out.println("Preferences Header is Verified:"+preferences_Header.isDisplayed());
     mobileAction.FuncClick(what_New_Btn,"What_New_Button");
  }catch(Exception e){
    
  }
}


public void prefernces_Update_Security_Question() {

  System.out.println("Trial for Page factory class");
  Decorator();
  try {
  mobileAction.FuncClick(secret_Question_button,"Secret_Question_button");

  System.out.println("Clicked:"+secret_Question_button);


    System.out.println("Preferences Header is Verified:"+preferences_Header.isDisplayed());
  }catch(Exception e){
    
  }
}

}

