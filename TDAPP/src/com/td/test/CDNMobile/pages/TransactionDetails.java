package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TransactionDetails extends _CommonPage{

	private static TransactionDetails Transactiondetails;
	
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transaction Details' or @label='Détails de l'opération']")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	 private MobileElement transactionDetailsHeader;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/date']")
	 private MobileElement transacDate;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/transaction_type']")
	 private MobileElement ptransactionType;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/gross_amount']")
	 private MobileElement grossAmount;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/transaction_charge']")
	 private MobileElement transactionCharge;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/net_amount']")
	 private MobileElement netAmount;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/unit_price']")
	 private MobileElement unitPrice;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/transaction_units']")
	 private MobileElement transactionUnit;
	 	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/date']/../android.widget.TextView[@index='0']")
	 private MobileElement transacDate_title;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/transaction_type']/../android.widget.TextView[@index='0']")
	 private MobileElement ptransactionType_title;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/gross_amount']/../android.widget.TextView[@index='0']")
	 private MobileElement grossAmount_title;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/transaction_charge']/../android.widget.TextView[@index='0']")
	 private MobileElement transactionCharge_title;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/net_amount']/../android.widget.TextView[@index='0']")
	 private MobileElement netAmount_title;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/unit_price']/../android.widget.TextView[@index='0']")
	 private MobileElement unitPrice_title;
	 
	 @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Posted Date')]")
	 @AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td:id/transaction_units']/../android.widget.TextView[@index='0']")
	 private MobileElement transactionUnit_title;
	 
	
	public synchronized static TransactionDetails get() {
		if (Transactiondetails == null) {
			Transactiondetails = new TransactionDetails();
		}
		return Transactiondetails;
	    }

	    private void Decorator() {
		PageFactory.initElements(
			new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
			this);

	    }
	    /**
	     * This method will verify the transaction page
	     * button.
	     * 
	     * @return void
	     * @throws InterruptedException 
	     * 
	     * @throws IOException
	     *             If there is problem while reporting.
	     * @throws NoSuchElementException
	     *             In case the element is not found over the screen.
	     */
	    public void verifyTransactionHeader()  {
			Decorator();
			try {
				mobileAction.verifyElementTextIsDisplayed(transactionDetailsHeader, "Transaction Details | Détails de l'opération");
				
			} catch (NoSuchElementException | IOException e) {
			    System.err.println("TestCase has failed.");
			    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			    System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
	    } 
	    
	    public void verifyTransactionDetails()  {
			Decorator();
			try {
				//mobileAction.verifyElementTextIsDisplayed(transactionDetailsHeader, "Transaction Details | Détails de l'opération");
				String elementText = mobileAction.getValue(transacDate);
				mobileAction.Report_Pass_Verified("transacDate:" + elementText);
				
				elementText = mobileAction.getValue(ptransactionType);
				mobileAction.Report_Pass_Verified("ptransactionType:" + elementText);
				
				elementText = mobileAction.getValue(grossAmount);
				mobileAction.Report_Pass_Verified("grossAmount:" + elementText);

				elementText = mobileAction.getValue(transactionCharge);
				mobileAction.Report_Pass_Verified("transactionCharge:" + elementText);
				
				elementText = mobileAction.getValue(netAmount);
				mobileAction.Report_Pass_Verified("netAmount:" + elementText);
				
				elementText = mobileAction.getValue(unitPrice);
				mobileAction.Report_Pass_Verified("unitPrice:" + elementText);
				
				elementText = mobileAction.getValue(transactionUnit);
				mobileAction.Report_Pass_Verified("transactionUnit:" + elementText);
				
				
			} catch (NoSuchElementException e) {
			    System.err.println("TestCase has failed.");			    
			    System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
	    } 
	    
	    public void verifyTransactionDetailsInChinese()  {
			Decorator();
			try {
				mobileAction.verifyElementTextIsDisplayed(transactionDetailsHeader, "交易详情 | 交易詳情");
				
				mobileAction.verifyElementTextIsDisplayed(transacDate_title, "日期  | 日期 ");
				mobileAction.verifyElementTextIsDisplayed(ptransactionType_title, "交易类型 | 交易類型常 ");
				mobileAction.verifyElementTextIsDisplayed(grossAmount_title, "总金额 | 總金額");
				mobileAction.verifyElementTextIsDisplayed(transactionCharge_title, "交易收费 | 交易費用");
				mobileAction.verifyElementTextIsDisplayed(netAmount_title, "净额 | 淨額 ");
				mobileAction.verifyElementTextIsDisplayed(unitPrice_title, "单位价格 | 單位價格");
				mobileAction.verifyElementTextIsDisplayed(transactionUnit_title, "交易单位数量 | 交易單位數");
								
			} catch (NoSuchElementException | IOException e) {
			    System.err.println("TestCase has failed.");			    
			    System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			    CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
	    } 
	    
}
