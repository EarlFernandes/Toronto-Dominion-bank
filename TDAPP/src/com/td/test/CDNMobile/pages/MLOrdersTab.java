package com.td.test.CDNMobile.pages;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class MLOrdersTab extends _CommonPage {
	
	
	private static MLOrdersTab MLOrdersTab;
	
	public synchronized static MLOrdersTab get() {
		if (MLOrdersTab == null) {
			MLOrdersTab = new MLOrdersTab();
		}
		return MLOrdersTab;
	}
	private void Decorator()
		{
		PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver)CL.GetDriver()),new TimeOutDuration(15,TimeUnit.SECONDS)),this);	
	}
	
	@iOSFindBy(xpath = " //*[contains(@label,'ACCOUNTS') or contains(@label,'COMPTES')]")//@Author - Sushil 06-Feb-2017
	//@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @index='0']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView']")
	private MobileElement lblACCOUNTS;
	
	
	String accNumber = getTestdata("Accounts", "UserIDs").trim();// @Author - Sushil 06-Feb-2017
	//String xpathAccount = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'" + accNumber + "']";
	String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Orders' or contains(@label,'Ordres')]") //@Author - Sushil 23-Mar-2017
	@AndroidFindBy(id="com.td:id/ordersTab")
	private MobileElement ordersTab;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(id="com.td:id/txtTimeStamp")
	private MobileElement lbltimestamp;
	
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../following-sibling::XCUIElementTypeCell[1]/*[1]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/order_type")
	private MobileElement lblMultiLeg;
	
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[1]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='1st Leg' or @text='1re Volet']")
	private MobileElement lbl1stleg;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[2]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='1st Leg' or @text='1re Volet']/../*[2]/*[@resource-id='com.td:id/symbol']")
	private MobileElement leg1Details;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[4]") 
	//@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[2]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re Volet')]")
	private MobileElement us;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[3]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='1st Leg' or @text='1re Volet']/../*[3]/*[@resource-id='com.td:id/txtFilledQty']")
	private MobileElement leg1QuantityFilled;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[4]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='2nd Leg' or @text='2e Volet']")
	private MobileElement lbl2ndleg;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[5]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='2nd Leg' or @text='2e Volet']/../*[2]/*[@resource-id='com.td:id/symbol']")
	private MobileElement leg2Details;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[6]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='2nd Leg' or @text='2e Volet']/../*[3]/*[@resource-id='com.td:id/txtFilledQty']")
	private MobileElement leg2QuantityFilled;
	
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[7]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/txtOrderType")
	private MobileElement price;
	
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[8]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re volet')]")
	private MobileElement goodtill;
	
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[9]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/txtOrderStatus']")
	private MobileElement orderStatus;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[10]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]")
	private MobileElement lbllegNumber1;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[11]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]")
	private MobileElement lbllegNumber2;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[12]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/txtOrderActionLeg1")
	private MobileElement leg1Action;
	
	@iOSFindBy(xpath = "//*[contains(@label,'EDT') or contains(@label,'HAE')]/../*[4]/*[13]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(id = "com.td:id/txtOrderActionLeg2")
	private MobileElement leg2Action;
	

	
//	public void verifyOptionOptionOrdersTabDetails()
	public void verifyMLOrdersTabDetails()	
	{
		Decorator();
		try{
	
			Calendar now = Calendar.getInstance();
			
			
			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
//			String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			String sCurrentMonth = format2.split(";")[2];
			String sCurrentYear = format2.split(";")[3];
	
			
			mobileAction.waitForElement(lblACCOUNTS);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
			
			mobileAction.verifyElementIsDisplayed(ordersTab, "Orders Tab");
			
			mobileAction.FuncClick(ordersTab, "Orders Tab");
			
			mobileAction.verifyElementTextContains(lbltimestamp,sCurrentDate);
			
			mobileAction.verifyElementIsDisplayed(lblMultiLeg, "lblMultiLeg");
				Thread.sleep(1000);
			mobileAction.verifyElementIsDisplayed(lbl1stleg, "lbl1stleg");
			
			mobileAction.verifyElementTextContains(leg1Details, getTestdata("Symbol",XLSheetUserIDs));
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
				//Do nothing
			}
			else
			mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg1Details),"US");
			
			
			mobileAction.FuncVerifyNonBlankValue(leg1QuantityFilled, "leg1QuantityFilled");
			
			mobileAction.FuncSwipeWhileElementNotFound(price, false, 5, "up");
						
			mobileAction.verifyElementIsDisplayed(lbl2ndleg, "lbl2ndleg");
			
			mobileAction.verifyElementTextContains(leg2Details, getTestdata("Symbol",XLSheetUserIDs));
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
				//Do nothing
			}
			else
			mobileAction.verifyElementTextContains(leg2Details, "US");
			
			//mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(leg2Details),"US");
			
			mobileAction.FuncVerifyNonBlankValue(leg2QuantityFilled, "leg2QuantityFilled");
	
			mobileAction.verifyElementTextContains(price,getTestdata("Price",XLSheetUserIDs));
			
			String sTempPrice = "";
			if(mobileAction.FuncGetText(price).equalsIgnoreCase("Even") || mobileAction.FuncGetText(price).equalsIgnoreCase("Pair"))
			{
				//Do nothing
			}
			else
			{
			sTempPrice = TradeMultiLeg.get().getPrice(mobileAction.FuncGetText(price));
			if(sTempPrice!="")
				mobileAction.verifyElementTextContains(price,getTestdata("SelectLimitPrice",XLSheetUserIDs));
			}
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				mobileAction.FuncGetTextByxpath("//*[contains(@text,'" + getTestdata("OrderStatus",XLSheetUserIDs) + "')]");
			else
			mobileAction.verifyElementTextContains(orderStatus, getTestdata("OrderStatus",XLSheetUserIDs));
			
			mobileAction.verifyElementIsDisplayed(lbllegNumber1, "legNumber1");
			
			mobileAction.verifyElementIsDisplayed(lbllegNumber2, "legNumber2");
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
				//Do Nothing
			}
			else
			{
			mobileAction.verifyElementTextContainsReverse(leg1Action,getTestdata("Leg1Action2",XLSheetUserIDs));
			
			mobileAction.verifyElementTextContainsReverse(leg2Action,getTestdata("Leg2Action2",XLSheetUserIDs));
			}
						
		}
		catch(Exception e)
		{
		
			e.printStackTrace();
		
		}	
		
	}
	
	
	
	
	
	
	
	

}
