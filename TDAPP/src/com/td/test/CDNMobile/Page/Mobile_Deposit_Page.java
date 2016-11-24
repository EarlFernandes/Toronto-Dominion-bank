package com.td.test.CDNMobile.Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class Mobile_Deposit_Page extends _CommonPage {
  private static Mobile_Deposit_Page Mobile_Deposit_Page;

  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Mobile Deposit']")
  private MobileElement mobile_deposit_header;


  @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up' and @index='0']")
  private MobileElement menu_button;

  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Mobile Deposit']")
  private MobileElement mobile_Deposit_button;

  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/enrollment_headertitle1']")
  private MobileElement validation_firstLine;

  @AndroidFindBy(
      xpath = "//android.widget.TextView[@resource-id='com.td:id/enrollment_headertitle_subtitle_1']")
  private MobileElement validation_secondLine;


  @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'To deposit a cheque')]")
  private MobileElement validation_thirdLine;

  @AndroidFindBy(
      xpath = "//android.widget.TextView[starts-with(@text,'Be a TD Canada Trust customer')]")
  private MobileElement validationfourthLine;

  @AndroidFindBy(
      xpath = "//android.widget.TextView[starts-with(@text,'Have at least one eligible Chequing or Savings account')]")
  private MobileElement validation_fifthLine;

  @AndroidFindBy(
      xpath = "//android.widget.TextView[starts-with(@text,'To make a deposit')]")
  private MobileElement validation_sixthLine;

  public synchronized static Mobile_Deposit_Page get() {
    if (Mobile_Deposit_Page == null) {
      Mobile_Deposit_Page = new Mobile_Deposit_Page();
    }
    return Mobile_Deposit_Page;
  }


  private void Decorator() {
    PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()),
        new TimeOutDuration(15, TimeUnit.SECONDS)), this);
    System.out.println("Decorator method has been finished");


  }

  /**
   * This method is used for Verify eligibility declined error message is displayed when customers
   * Access Card type is not 000, 001, 032. 033 or 037
   */
  public void mobile_Dpst_Validation_Page() {

    System.out.println("Trial for Page factory class");
    Decorator();
    try {
      String mobile_Header_value = "Mobile Deposit";

      String firstLine_Value = "We";
      String secondLine_Value = "eligible to use TD Mobile";
      String thirdLine_Value = "To deposit a cheque using the TD app, you must";
      String fourthLine_Value = "Be a TD Canada";
      String fifthLine_Value = "Have at least one eligible";
      String sixthLine_Value = "To make a deposit";

      mobileAction.verifyElement(mobile_deposit_header, mobile_Header_value);
      System.out.println("Mobile Deposit Header:" + mobile_deposit_header.isDisplayed());

      mobileAction.verifyElement(validation_firstLine, firstLine_Value);
      System.out.println(validation_firstLine.isDisplayed());

      mobileAction.verifyElement(validation_secondLine, secondLine_Value);
      System.out.println("You're not eligible to use TD Mobile Deposit at this time:"
          + validation_secondLine.isDisplayed());



      System.out.println(
          "To deposit a cheque using the TD app, you must:" + validation_thirdLine.isDisplayed());
      mobileAction.verifyElement(validationfourthLine, fourthLine_Value);
      System.out.println("Be a TD Canada Trust customer:" + validationfourthLine.isDisplayed());
      System.out.println("Have at least one eligible Chequing or Savings account:"
          + validation_fifthLine.isDisplayed());
      System.out.println(
         "To make a deposit, please visit a Branch:" + validation_sixthLine.isDisplayed());

      mobileAction.verifyElement(validation_sixthLine, sixthLine_Value);



    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();

    }
  }
}
