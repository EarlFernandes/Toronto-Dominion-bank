package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.http.entity.mime.Header;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Receipt extends _CommonPage{
	private static Receipt Receipt;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Receipt']")
	private MobileElement receiptHeader;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'HOME')]") 
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='GO BACK HOME']")
	private MobileElement homeBtn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmationNo;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'PAY WITH REWARDS')]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PAY WITH REWARDS']")
	private MobileElement from_PayWithRewards;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'To')]/../XCUIElementTypeStaticText[3]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_subvalue']")
	private MobileElement payeeAccount;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Amount')]/../XCUIElementTypeStaticText[2]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'$')]")
	private MobileElement paymentAmount;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Amount')]/../XCUIElementTypeStaticText[3]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'TD Points')]")
	private MobileElement redeemedPoints;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Date')]/../XCUIElementTypeStaticText[2]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main']")
	private MobileElement date;
	
	public synchronized static Receipt get() {
		if (Receipt == null) {
			Receipt = new Receipt();
		}
		return Receipt;
	}
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)),
				this);

	}
	
	public void verifyReceiptHeader() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(receiptHeader, "Cancel Button");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void verifyAmountRedeemed()   {
		Decorator();
		try {
			mobileAction.FuncClick(homeBtn, "Go Back Home Button");
			HomeScreen.get().clickAccountsTab();
			Accounts.get().verifyAccountsPage();
			Accounts.get().selectAccountInAccountSheet();

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	
	public void verifyCurrentDate()   {
		Decorator();
		String dt="";
		SimpleDateFormat sdf =  new SimpleDateFormat("MMMMM dd,yyyy"); //
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
			 dt = date.getAttribute("label");//"Apr 21,2017";
		}else{
			dt = date.getAttribute("text");
		}
               Date d= null;
               Date d1= null;
            String today=   new SimpleDateFormat("MMMMM dd,yyyy").format(new Date());
            try {
                //System.out.println("expdate>> "+date);
                System.out.println("today>> "+today+"\n\n");
                d = sdf.parse(dt);
                d1 = sdf.parse(today);
                if(d1.compareTo(d) == 0){// not expired
                    System.out.println("false");
                 }
                 else
                  System.out.println("true");
            }
            catch(Exception e) {
             e.printStackTrace();
           }
     }



	
	public void verifyRedemptionDetails()   {
		Decorator();
		String payee="";
		try {
			verifyReceiptHeader();
			mobileAction.verifyElementIsDisplayed(confirmationNo, "Confirmation Number");
			mobileAction.verifyElementIsDisplayed(from_PayWithRewards, "Pay With Rewards");
			mobileAction.verifyElementIsDisplayed(payeeAccount, "Payee Account");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				 payee=payeeAccount.getAttribute("label");
			}else{
				payee=payeeAccount.getAttribute("text");
			}
			
			String maskedCreditCardNo=payee.substring(0,4);
			mobileAction.verifyTextEquality(maskedCreditCardNo, ConstantClass.maskedValue);
			mobileAction.verifyElementTextContains(paymentAmount,ConstantClass.dollarSign);
			mobileAction.verifyElementTextContains(redeemedPoints, ConstantClass.points);
			verifyCurrentDate();
			
			
			

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}


}
