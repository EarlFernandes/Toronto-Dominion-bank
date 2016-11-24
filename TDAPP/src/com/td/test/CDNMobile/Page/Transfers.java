package com.td.test.CDNMobile.Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.webdriven.commands.GetText;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Transfers extends _CommonPage {
	
	private static Transfers Transfers;
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Transfers']")
	private MobileElement transfers_header;
	
	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Between My Accounts']")
	private MobileElement btw_My_Accounts_btn;
	
	
	@iOSFindBy(id = " ")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Interac e-Transfer']")
    private MobileElement Interac_e_Transfer_button;
	
	@iOSFindBy(id = " ")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Recipients']")
    private MobileElement manage_recipient_button;
	
	String transfer_Header_Value="Transfers";
	String confirm_Header="Confirm";
	String confirm_transfer_value="Thank you!";
	
	
	public synchronized static Transfers get() {
		if (Transfers == null) {
		  Transfers = new Transfers();
		}
		return Transfers;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	

	}

	public void Interac_E_button() {

	
		Decorator();
		try {
			
			mobileAction.verifyElement(transfers_header,transfer_Header_Value);
			System.out.println("Transfer Header:"+transfers_header.isDisplayed());
			mobileAction.FuncClick(Interac_e_Transfer_button,"Interac_e_button");
			}catch (Exception e) {
          // TODO Auto-generated catch block
          e.printStackTrace();

	}
	}
		public void btw_My_Accounts_btn() {

		    
	        Decorator();
	        try {
	            
	            mobileAction.verifyElement(transfers_header,transfer_Header_Value);
	            System.out.println("Transfer Header:"+transfers_header.isDisplayed());
	            mobileAction.FuncClick(btw_My_Accounts_btn,"Between_My_Accounts");
	            }catch (Exception e) {
	          // TODO Auto-generated catch block
	          e.printStackTrace();

	    }
	
		}
		

public void manage_Recipients_btn() {

    
    Decorator();
    try {
        
        mobileAction.verifyElement(transfers_header,transfer_Header_Value);
        System.out.println("Transfer Header is Verified:"+transfers_header.isDisplayed());
        mobileAction.FuncClick(manage_recipient_button,"Manage_Recipient");
        }catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();

}
}
}



