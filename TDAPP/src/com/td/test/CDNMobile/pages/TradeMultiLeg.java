package com.td.test.CDNMobile.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TradeMultiLeg extends _CommonPage{
    private static TradeMultiLeg TradeMultiLeg;
    
	public synchronized static TradeMultiLeg get() {
		if (TradeMultiLeg == null) {
			TradeMultiLeg = new TradeMultiLeg();
		}
		return TradeMultiLeg;
	}
	private void Decorator()
		{
		PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver)CL.GetDriver()),new TimeOutDuration(15,TimeUnit.SECONDS)),this);	
	}
	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[@label='Enter name or symbol' or contains(@label,'Entrez le')]") //@Author - Sushil 16-Feb-2017
	@AndroidFindBy(id="com.td:id/edt_search_field_search_mode")
	private MobileElement search_symbol;
	
	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell/*") //@Author - Sushil 16-Feb-2017
	@AndroidFindBy(id="com.td:id/ticker")
	private MobileElement stockSymbol;
	
	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell/*") //@Author - Sushil 16-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	private MobileElement leg1Option;
	
	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[2]/*[2]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*[@resource-id='com.td:id/edtSpinner']/*/*[2]")
	private MobileElement leg1Action;
	
	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[2]/*[2]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*[@resource-id='com.td:id/edtSpinner']/*/*[2]")
	private MobileElement leg2Action;
	
	@iOSFindBy(xpath = "//*[contains(@label,'1st') or contains(@label,'1re')]/../following-sibling::XCUIElementTypeCell[3]/*[2]") //@Author - Sushil 17-Feb-2017
	//@AndroidFindBy(xpath = "//*[contains(@resource-id,'com.td:id/amountEditText')]")
	@AndroidFindBy(xpath = "//*[contains(@text,'1st') or contains(@text,'1re')]/../following-sibling::*/*[@resource-id='com.td:id/amountField']/*/*/*[@resource-id='com.td:id/amountEditText']")
	private MobileElement leg1Quantity;
	
	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell[3]/*[2]") //@Author - Sushil 17-Feb-2017
	//@AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.td:id/amountEditText')])[2]")
	@AndroidFindBy(xpath = 	"//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::*/*[@resource-id='com.td:id/amountField']/*/*/*[@resource-id='com.td:id/amountEditText']")
	private MobileElement leg2Quantity;
	
	@iOSFindBy(xpath = "//*[contains(@label,'2nd') or contains(@label,'2e')]/../following-sibling::XCUIElementTypeCell/*") //@Author - Sushil 17-Feb-2017
	///@AndroidFindBy(xpath = "(//*[contains(@resource-id,'com.td:id/ticker')])[4]")
	@AndroidFindBy(xpath = "//*[contains(@text,'2nd') or contains(@text,'2e')]/../following-sibling::android.widget.LinearLayout[@resource-id='com.td:id/ticker_layout']/android.widget.TextView")
	private MobileElement leg2Option;
	
	@iOSFindBy(xpath = "//*[@label='RESULTS' or @label='R�SULTATS']") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(id="android:id/content")
	private MobileElement tradeFrame;
	
	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'CALLS Bid') or contains(@label,'ACHAT Acheteur')])[1]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath="//*[@resource-id='com.td:id/textview_info' and @index=2]")
	private MobileElement firstStrikeCALLS;
	
	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'PUTS Bid') or contains(@label,'VENTE Acheteur')])[4]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath="//*[@resource-id='com.td:id/textview_info' and @index=17]")
	private MobileElement firstStrikePUTS;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Expires in') or contains(@label,'Expire dans')]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath="//*[@resource-id='com.td:id/selectedText' and @index=0]")
	private MobileElement expiryDate;
	
	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'CALLS Bid') or contains(@label,'ACHAT Acheteur')])[1]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath="//*[@resource-id='com.td:id/textview_info' and @index=0]")
	private MobileElement firstBidCALLS;
	
	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'PUTS Bid') or contains(@label,'VENTE Acheteur')])[4]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath="//*[@resource-id='com.td:id/textview_info' and @index=18]")
	private MobileElement firstBidPUTS;
	
	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'CALLS Ask') or contains(@label,'ACHAT Vendeur')])[1]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath="//*[@resource-id='com.td:id/textview_info' and @index=1]")
	private MobileElement firstAskCALLS;
	
	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'PUTS Ask') or contains(@label,'VENTE Vendeur')])[4]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath="//*[@resource-id='com.td:id/textview_info' and @index=19]")
	private MobileElement firstAskPUTS;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Continue')]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(id="com.td:id/button_select_option_continue")
	private MobileElement Continue;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/symbol")
	private MobileElement Quote_Symbol;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Mid Price') or contains(@label,'Prix Milieu')]/../XCUIElementTypeStaticText[2]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/midPrice")
	private MobileElement midPrice;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Natural') or contains(@label,'Naturel')]/../XCUIElementTypeStaticText[4]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/naturalPrice")
	private MobileElement naturalPrice;
	
	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="android:id/button2")
	private MobileElement cancelButton;
	
	@iOSFindBy(xpath = "//*[@label='Do not agree' or contains(@label,'accepte pas')]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/negativeButton")
	private MobileElement doNotAgreeButton;

	@iOSFindBy(xpath = "//*[@label='Agree' or @label='Accepte']") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/positiveButton")
	private MobileElement agreeButton;
	
	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="android:id/action_bar_title")
	private MobileElement titleTrade;
	
	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="android:id/action_bar_title")
	private MobileElement titleConfirmOrder;
	
	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") //@Author - Sushil 07-Mar-2017
	@AndroidFindBy(id="android:id/action_bar_title")
	private MobileElement backButton;
	
	@iOSFindBy(xpath = "//*[@label='OK' or @label='Done']") //@Author - Sushil 08-Feb-2017
	//@AndroidFindBy(id="android:id/button1")
	private MobileElement iOSKybdOKButton;
	
	@iOSFindBy(xpath = "//*[@label='OK']") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@index=0]")
	private MobileElement TradeFrame;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good') or contains(@label,'�ch�ance')]/../*[2]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Good') or contains(@text,'�ch�ance')]/../android.widget.TextView[@index=1]")
	private MobileElement goodTill;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']/../*[2]")
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Price' or @text='Cours']/../android.widget.TextView[@index=1]")
	private MobileElement price;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='CANCEL' or @label='ANNULER']") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(id="com.td:id/dialog_button")
	private MobileElement goodTillCancel;
	
	@iOSFindBy(xpath = " //*[contains(@label,'Account') or contains(@label,'Compte')]")//@Author - Sushil 06-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @index='0']")
	private MobileElement defaultTradeAccount;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement listview;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trading Password' or @label='Mot de passe de n�gociation']")//@Author - Sushil 06-Feb-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trading Password' or @text='Mot de passe de n�gociation']")
	private MobileElement labelTradingPassword;	
	
	@iOSFindBy(xpath = "//*[@label='Commission Schedule' or @label='Bar�me des commissions']")//@Author - Sushil 02-Mar-2017
	@AndroidFindBy(id="com.td:id/commissionLink")
	private MobileElement commissionLink;
	
	@iOSFindBy(xpath = "//*[@label='Important Information' or @label='Renseignements importants']")//@Author - Sushil 02-Mar-2017
	@AndroidFindBy(id="com.td:id/importantInfoLink")
	private MobileElement importantInfoLink;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'close x')]/../XCUIElementTypeStaticText[1]")//@Author - Sushil 06-Feb-2017
	@AndroidFindBy(id="com.td:id/urlTitle")
	private MobileElement urlTitle;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'close x')]")//@Author - Sushil 06-Feb-2017
	@AndroidFindBy(id="com.td:id/btnDone")
	private MobileElement btnDone;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trading Password' or @label='Mot de passe de n�gociation']/XCUIElementTypeSecureTextField[1]")//@Author - Sushil 03-Mar-2017
	@AndroidFindBy(id="com.td:id/editTextPassword")
	private MobileElement editTextPassword;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@label,'Trading Password is turned off') or contains(@label,'Votre mot de passe est inactif')]")//@Author - Sushil 03-Mar-2017
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Trading Password is turned off') or contains(@text,'Votre mot de passe est inactif')]")
	private MobileElement tradingPwdDisableMsg;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder') or contains(@label,'actionnaire')]/../*[2]") //@Author - Sushil 03-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Shareholder') or contains(@text,'actionnaire')]/../android.widget.TextView[@index=1]")
	private MobileElement shareholderType;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Preview Order') or contains(@label,'Aper�u de')]")//@Author - Sushil 03-Mar-2017
	@AndroidFindBy(id="com.td:id/orderEntryPreviewButton")
	private MobileElement previewOrderButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeTextView[contains(@value,'want to go back?') or contains(@value,'vraiment revenir en arri�re?')]")//@Author - Sushil 03-Mar-2017
	@AndroidFindBy(id="android:id/message")
	private MobileElement messageBackButton;
	
	@iOSFindBy(xpath = "//*[@label='Trade' or @label='N�gociation']") //@Author - Sushil 07-Mar-2017
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='N�gociation']")
	private MobileElement Investing_Trade;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Refresh' or @label='Actualiser']")//@Author - Sushil 03-Mar-2017
	@AndroidFindBy(id="com.td:id/refresh_menu")
	private MobileElement refreshButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[3]") //@Author - Sushil 10-Mar-2017
	@AndroidFindBy(id="com.td:id/txt_price")
	private MobileElement Quote_price;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Limit Price') or contains(@label,'Cours limit�')]/../*[2]") //@Author - Sushil 08-Feb-2017
	@AndroidFindBy(xpath = "//*[contains(@text,'Limit Price') or contains(@text,'Cours limit�')]/../*[@resource-id='com.td:id/amountEditText']")
	private MobileElement LimitPrice;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Date')]/../*[2]") //@Author - Sushil 13-Mar-2017
	@AndroidFindBy(id="com.td:id/selectedDate")
	private MobileElement DateSpecify;
	
	@iOSFindBy(xpath = "//*[@label='Important Information' or @label='Renseignements importants']")//@Author - Sushil 02-Mar-2017
	@AndroidFindBy(xpath="//android.widget.Button[@NAF='true' and @index=2]")
	private MobileElement monthNextButton;
	
	String xpathSymbolFlag = "//android.widget.ImageView[@resource-id='com.td:id/market_symbol' and @content-desc='U S']";
	String xpathSymbolFlag_ios = "//XCUIElementTypeCell[contains(@label,'US')]";
	String sSymbolVal = "";
	

	public void verifyStockOptionContents()
	{
		Decorator();
		String defaultQtyVal="";
		try
		{
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FunCnewSwipe(stockSymbol,false,5);
			mobileAction.verifyElement(stockSymbol, getTestdata("Symbol", XLSheetUserIDs));
			mobileAction.verifyElement(leg1Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.verifyElement(leg1Quantity, defaultQtyVal);

			mobileAction.FunCnewSwipe(leg2Option,false,5);	
			mobileAction.verifyElement(leg2Option, getTestdata("OptionDefault", XLSheetUserIDs));
			mobileAction.verifyElement(leg2Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.verifyElement(leg2Quantity, defaultQtyVal);
			
			
			
			String[] sUrlTitle= getTestdata("urlTitle", XLSheetUserIDs).split(";");
			
			mobileAction.FuncSwipeWhileElementNotFound(commissionLink, false, 7, "up");
			
			mobileAction.verifyElement(tradingPwdDisableMsg, getTestdata("TradingPassword", XLSheetUserIDs));
			
			mobileAction.FuncClick(importantInfoLink, "importantInfoLink");
			mobileAction.verifyElement(urlTitle, sUrlTitle[0]);
			mobileAction.FuncClick(btnDone, "btnDone");
			
			mobileAction.FuncSwipeWhileElementNotFound(commissionLink, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(commissionLink, "commissionLink");
			mobileAction.verifyElement(urlTitle, sUrlTitle[1]);
			mobileAction.FuncClick(btnDone, "btnDone");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void verifyOptionOptionContents()
	{
		Decorator();
		String defaultQtyVal="";
		try
		{
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FunCnewSwipe(leg1Option,false,5);
			mobileAction.verifyElement(leg1Option, getTestdata("OptionDefault", XLSheetUserIDs));
			mobileAction.verifyElement(leg1Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.verifyElement(leg1Quantity, defaultQtyVal);

			mobileAction.FunCnewSwipe(leg2Option,false,5);	
			mobileAction.verifyElement(leg2Option, getTestdata("OptionDefault", XLSheetUserIDs));
			mobileAction.verifyElement(leg2Action, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.verifyElement(leg2Quantity, defaultQtyVal);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void verifySelectOption()
	{
		Decorator();
		String sExpFormat = "";
		try
		{
			SearchPageMIT.get().clickFirstSymbol();
			sSymbolVal = mobileAction.FuncGetText(Quote_Symbol);
			mobileAction.FunCnewSwipe(leg1Option,false,5);
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");
			mobileAction.FunCnewSwipe(firstStrikeCALLS,false,5);
			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");
			sExpFormat = getOptionFormat(expiryDate,"CALLS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.verifyElement(leg1Option,sExpFormat);

			//
			mobileAction.FunCnewSwipe(leg2Option,false,5);
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FunCnewSwipe(firstStrikePUTS,false,5);
			mobileAction.FuncClick(firstBidPUTS, "firstBidPUTS");
			mobileAction.verifyElement(leg2Action, getTestdata("Leg2Action2", XLSheetUserIDs));
			sExpFormat = getOptionFormat(expiryDate,"PUTS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.verifyElement(leg2Option,sExpFormat);
			
			////
			mobileAction.FunCnewSwipe(leg1Option,false,5);
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");
			mobileAction.FunCnewSwipe(firstStrikeCALLS,false,5);
			mobileAction.FuncClick(firstAskCALLS, "firstBidCALLS");
			mobileAction.verifyElement(leg1Action, getTestdata("Leg1Action2", XLSheetUserIDs));
			sExpFormat = getOptionFormat(expiryDate,"CALLS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.verifyElement(leg1Option,sExpFormat);
			//
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FunCnewSwipe(firstStrikePUTS,false,5);
			mobileAction.FuncClick(firstAskPUTS, "firstBidPUTS");
			sExpFormat = getOptionFormat(expiryDate,"PUTS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.verifyElement(leg2Option,sExpFormat);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getOptionFormat(MobileElement objExpiryDate,String Calls)
	{
		String sExpMthDay="";
		String sExpYear="";
		String sExpMth="";
		String sExpDay="";
		String sExpFormat = "";
		try
		{
			sExpMthDay  = mobileAction.FuncGetText(objExpiryDate).split("-")[0].split(",")[0];
			sExpYear  = mobileAction.FuncGetText(objExpiryDate).split("-")[0].split(",")[1];
			sExpYear = sExpYear.split(" ")[1].substring(2, 4);
			sExpMth = sExpMthDay.split(" ")[0];
			sExpDay = sExpMthDay.split(" ")[1];
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
				if(Calls.equalsIgnoreCase("CALLS"))
					sExpFormat = sSymbolVal + " C " + sExpDay + sExpMth.toUpperCase() + sExpYear + " " + getPrice(firstStrikeCALLS.getText());
				else if(Calls.equalsIgnoreCase("PUTS"))
					sExpFormat = sSymbolVal + " P " + sExpDay + sExpMth.toUpperCase() + sExpYear + " " + getPrice(firstStrikePUTS.getText());
				else
					CL.GetReporting().FuncReport("Fail", "Value other than CALLS or PUTS selected." + Calls);
			}
			else
			{
				if(Calls.equalsIgnoreCase("CALLS"))
					sExpFormat = sSymbolVal + " C " + sExpDay + sExpMth.toUpperCase() + sExpYear + " " + getPrice(firstStrikeCALLS.getAttribute("label"));
				else if(Calls.equalsIgnoreCase("PUTS"))
					sExpFormat = sSymbolVal + " P " + sExpDay + sExpMth.toUpperCase() + sExpYear + " " + getPrice(firstStrikePUTS.getAttribute("label"));
				else
					CL.GetReporting().FuncReport("Fail", "Value other than CALLS or PUTS selected." + Calls);
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sExpFormat;
	}
	
	public String getPrice(String sPrice)
	{
		String sReturnPrice = "";
		try
		{
/*			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
			if(sPrice.contains(","))
				sReturnPrice = sPrice.replaceAll(",", ".").trim();
			else
				sReturnPrice = sPrice.trim();
			}
			else*/
			//{
				Pattern p = Pattern.compile("([0-9]+)([.|,])([0-9]+)");
			    Matcher m = p.matcher(sPrice);

			    // if an occurrence if a pattern was found in a given string...
			    if (m.find()) {
			        // ...then you can use group() methods.
			        //System.out.println(m.group(0)); // whole matched expression
					if(m.group(0).contains(","))
						sReturnPrice = m.group(0).replaceAll(",", ".").trim();
					else
						sReturnPrice = m.group(0).trim();
					}
			    }
		//}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sReturnPrice;
	}
	
	public void verifyStockMidNaturalPrice()
	{
		Decorator();
		try
		{
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FunCnewSwipe(leg1Action,false,5);
			mobileAction.selectItemFromList(leg1Action, getTestdata("Action", XLSheetUserIDs));
			enterQuantity(leg1Quantity,"1");
			mobileAction.FunCnewSwipe(leg2Option,false,5);
			mobileAction.waitForElement(leg2Option);
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if(mobileAction.isObjExists(leg2Option))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FunCnewSwipe(firstBidCALLS,false,5);
			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.FunCnewSwipe(leg2Quantity,false,5);
			enterQuantity(leg2Quantity,"1");
			mobileAction.FunCnewSwipe(midPrice,false,5);
			mobileAction.verifyElementTextContains(midPrice, getTestdata("TextCredit", XLSheetUserIDs));
			mobileAction.verifyElementTextContains(naturalPrice, getTestdata("TextCredit", XLSheetUserIDs));
			verifyMidNaturalVarience();
//
			mobileAction.FuncClick(titleTrade, "titleTrade");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			TradeMIT.get().clickInvestingTrade();
			TradeMIT.get().selectTradeAccount_OrderType();
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FunCnewSwipe(leg1Action,false,5);
			mobileAction.selectItemFromList(leg1Action, getTestdata("Action", XLSheetUserIDs));
			enterQuantity(leg1Quantity,"1");
			mobileAction.FunCnewSwipe(leg2Option,false,5);
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if(mobileAction.isObjExists(leg2Option))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FunCnewSwipe(firstAskCALLS,false,5);
			mobileAction.FuncClick(firstAskCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.FunCnewSwipe(leg2Quantity,false,5);
			enterQuantity(leg2Quantity,"1");
			mobileAction.FunCnewSwipe(midPrice,false,5);
			mobileAction.verifyElementTextContains(midPrice, getTestdata("TextDebit", XLSheetUserIDs));
			mobileAction.verifyElementTextContains(naturalPrice, getTestdata("TextDebit", XLSheetUserIDs));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void verifyMidNaturalVarience()
	{
		String sMidPrice="";
		String sNaturalPrice="";
		try
		{
			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 5, "down");
			mobileAction.selectItemFromList(leg1Action, getTestdata("Leg1Action2", XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(naturalPrice, false, 5, "up");
			verifyPriceVarience(mobileAction.FuncGetText(midPrice),sMidPrice,"midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice),sNaturalPrice,"naturalPrice");
			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncSwipeWhileElementNotFound(leg1Quantity, false, 5, "down");
			enterQuantity(leg1Quantity,"2");
			mobileAction.FuncSwipeWhileElementNotFound(naturalPrice, false, 5, "up");
			verifyPriceVarience(mobileAction.FuncGetText(midPrice),sMidPrice,"midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice),sNaturalPrice,"naturalPrice");
			//
			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncSwipeWhileElementNotFound(leg2Action, false, 5, "down");
			mobileAction.selectItemFromList(leg2Action, getTestdata("Leg2Action2", XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(naturalPrice, false, 5, "up");
			verifyPriceVarience(mobileAction.FuncGetText(midPrice),sMidPrice,"midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice),sNaturalPrice,"naturalPrice");	
			sMidPrice = getPrice(mobileAction.FuncGetText(midPrice));
			sNaturalPrice = getPrice(mobileAction.FuncGetText(naturalPrice));
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "down");
			enterQuantity(leg2Quantity,"2");
			mobileAction.FuncSwipeWhileElementNotFound(midPrice, false, 5, "up");
			verifyPriceVarience(mobileAction.FuncGetText(midPrice),sMidPrice,"midPrice");
			verifyPriceVarience(mobileAction.FuncGetText(naturalPrice),sNaturalPrice,"naturalPrice");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void verifyPriceVarience(String sCurrentPrice,String sPreviousPrice, String desc)
	{
		try
		{
			if(!getPrice(sCurrentPrice).equalsIgnoreCase(sPreviousPrice))
			{
				CL.GetReporting().FuncReport("Pass", desc + " price updated.CurrentPrice:"+sCurrentPrice+" PreviousPrice:"+sPreviousPrice);
			}
			else
				CL.GetReporting().FuncReport("Fail", desc + " price not updated.CurrentPrice:"+sCurrentPrice+" PreviousPrice:"+sPreviousPrice);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void verifyOptionMidNaturalPrice()
	{
		Decorator();
		try
		{
			SearchPageMIT.get().clickFirstSymbol();
			//mobileAction.FunCnewSwipe(leg1Option,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, false, 5, "up");
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");
			//mobileAction.FunCnewSwipe(firstBidCALLS,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(firstBidCALLS, false, 5, "up");
			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			//mobileAction.FuncSendKeys(leg1Quantity,"1");
			mobileAction.FuncSwipeWhileElementNotFound(leg1Quantity, false, 5, "up");
			enterQuantity(leg1Quantity,"1");
/*			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			mobileAction.FuncHideKeyboard();
			else
				mobileAction.FuncClick(iOSKybdOKButton, "OK");*/
			//mobileAction.FunCnewSwipe(leg2Option,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, false, 5, "up");
			//mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if(mobileAction.isObjExists(leg2Option))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			//mobileAction.FunCnewSwipe(firstBidCALLS,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(firstBidCALLS, false, 5, "up");
			mobileAction.FuncClick(firstBidCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			//mobileAction.FunCnewSwipe(leg2Quantity,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "up");			
			//mobileAction.FuncSendKeys(leg2Quantity,"1");
			enterQuantity(leg2Quantity,"1");
/*			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			mobileAction.FuncHideKeyboard();
			else
				mobileAction.FuncClick(iOSKybdOKButton, "OK");*/
			//mobileAction.FunCnewSwipe(midPrice,false,5);
			mobileAction.FuncSwipeWhileElementNotFound(midPrice, false, 5, "up");	
			mobileAction.verifyElementTextContains(midPrice, getTestdata("TextCredit", XLSheetUserIDs));
			mobileAction.verifyElementTextContains(naturalPrice, getTestdata("TextCredit", XLSheetUserIDs));
			verifyMidNaturalVarience();
//
			mobileAction.FuncClick(titleTrade, "titleTrade");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			TradeMIT.get().clickInvestingTrade();
			TradeMIT.get().selectTradeAccount_OrderType();
			TradeMIT.get().tapTradeSearchBar();
			SearchPageMIT.get().clickFirstSymbol();
			mobileAction.FunCnewSwipe(leg1Option,false,5);
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");
			mobileAction.FunCnewSwipe(firstStrikeCALLS,false,5);
			mobileAction.FuncClick(firstAskCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
/*			mobileAction.FuncSendKeys(leg1Quantity,"1");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			mobileAction.FuncHideKeyboard();
			else
				mobileAction.FuncClick(iOSKybdOKButton, "OK");*/
			enterQuantity(leg1Quantity,"1");
			mobileAction.FunCnewSwipe(leg2Option,false,5);
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if(mobileAction.isObjExists(leg2Option))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FunCnewSwipe(firstAskCALLS,false,5);
			mobileAction.FuncClick(firstAskCALLS, "firstBidCALLS");
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.FunCnewSwipe(leg2Quantity,false,5);
/*			mobileAction.FuncSendKeys(leg2Quantity,"1");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			mobileAction.FuncHideKeyboard();
			else
				mobileAction.FuncClick(iOSKybdOKButton, "OK");*/
			enterQuantity(leg2Quantity,"1");
			mobileAction.FunCnewSwipe(midPrice,false,5);
			mobileAction.verifyElementTextContains(midPrice, getTestdata("TextDebit", XLSheetUserIDs));
			mobileAction.verifyElementTextContains(naturalPrice, getTestdata("TextDebit", XLSheetUserIDs));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void handleKeyboard()
	{
		try
		{
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
				mobileAction.FuncHideKeyboard();
			if(mobileAction.isObjExists(cancelButton,2))
				mobileAction.FuncClick(cancelButton, "cancelButton");
			}
			else if(mobileAction.isObjExists(iOSKybdOKButton))
				mobileAction.FuncClick(iOSKybdOKButton, "iOSKybdOKButton");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void enterQuantity(MobileElement objEle, String sQty)
	{
		try
		{
			mobileAction.FuncSendKeys(objEle,sQty);
			handleKeyboard();
			if(objEle.getText()==null || objEle.getText()=="")
			{
				mobileAction.FuncSendKeys(objEle,sQty);	
			}
		}
		catch(Exception e)
		{
			try
			{
			CL.GetReporting().FuncReport("Fail", "Quantity not entered.");
			}
			catch(Exception e1)
			{
			e1.printStackTrace();
			}
		}
	}
	public void FuncEnterText(MobileElement objEle, String sText)
	{
		try
		{
			mobileAction.FuncSendKeys(objEle,sText);
			handleKeyboard();
			if(objEle.getText()==null || objEle.getText()=="")
			{
				mobileAction.FuncSendKeys(objEle,sText);	
			}
		}
		catch(Exception e)
		{
			try
			{
			CL.GetReporting().FuncReport("Fail", "<b> "+ sText + "</b> not entered.");
			}
			catch(Exception e1)
			{
			e1.printStackTrace();
			}
		}
	}
	public void verifyGoodTill()
	{
		Decorator();
		try
		{
			String[] sGoodTillValues = getTestdata("GoodTillValues", XLSheetUserIDs).split(";");
			String accNumber = getTestdata("Account2", XLSheetUserIDs);
			String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";
			mobileAction.FuncSwipeWhileElementNotFound(goodTill, false, 7, "up");
			mobileAction.verifyElement(goodTill, sGoodTillValues[0]);
			mobileAction.selectItemFromList(price,sGoodTillValues[1]);
			mobileAction.FuncSwipeWhileElementNotFound(goodTill, false, 7, "up");
			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[2]);
			mobileAction.verifyItemInList(sGoodTillValues[3]);
			mobileAction.verifyItemInList(sGoodTillValues[4]);
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");
			mobileAction.selectItemFromList(price,sGoodTillValues[5]);	
			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[6]);
			mobileAction.verifyItemInList(sGoodTillValues[7]);	
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");
			mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount, false, 5, "down");
			mobileAction.FuncClick(defaultTradeAccount, "defaultTradeAccount");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,10,"up");

			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 7, "up");
			mobileAction.selectItemFromList(leg1Action, sGoodTillValues[8]);
			mobileAction.FuncSwipeWhileElementNotFound(goodTill, false, 7, "up");
			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[9]);
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");
			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 5, "down");
			mobileAction.selectItemFromList(leg1Action, sGoodTillValues[10]);
			mobileAction.FuncSwipeWhileElementNotFound(goodTill, false, 7, "up");
			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[11]);
			mobileAction.verifyItemInList(sGoodTillValues[12]);	
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");
			mobileAction.selectItemFromList(price,sGoodTillValues[13]);
			mobileAction.FuncSwipeWhileElementNotFound(labelTradingPassword, false, 7, "up");			
			mobileAction.FuncClick(goodTill, "goodTill");
			mobileAction.verifyItemInList(sGoodTillValues[14]);
			mobileAction.verifyItemInList(sGoodTillValues[15]);
			mobileAction.verifyItemInList(sGoodTillValues[16]);
			mobileAction.FuncClick(goodTillCancel, "goodTillCancel");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void verifyGoodTillExpiryDate()
	{
		try
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void verifySharehoderType()
	{

		Decorator();
		String accNumber2 = getTestdata("Account2", XLSheetUserIDs);
		String xpathAccount2 = "//*[contains(@text,'" + accNumber2 + "') or contains(@label,'" + accNumber2 + "')]";
		
		String accNumber3 = getTestdata("Account3", XLSheetUserIDs);
		String xpathAccount3 = "//*[contains(@text,'" + accNumber3 + "') or contains(@label,'" + accNumber3 + "')]";
		
		try
		{
			String[] aShareholderType = getTestdata("ShareHolder", XLSheetUserIDs).split(";");
			
			mobileAction.FuncSwipeWhileElementNotFound(labelTradingPassword, false, 7, "up");
			mobileAction.verifyElement(shareholderType, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			mobileAction.FuncClick(shareholderType, "shareholderType");
			for(int i=0;i < aShareholderType.length;i++)
			{
			mobileAction.verifyItemInList(aShareholderType[i]);
			}
			
			mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount, true, 7, "down");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount2,true,60,"up");
			
			mobileAction.FuncSwipeWhileElementNotFound(labelTradingPassword, false, 7, "up");
			mobileAction.verifyElement(shareholderType, getTestdata("TextDefaultListItem", XLSheetUserIDs));
			
			mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount, true, 7, "down");
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount3,true,60,"up");
			
			fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskPUTS, "firstAskPUTS");
			
			if(mobileAction.isObjExists(shareholderType, 2))
			{
				CL.GetReporting().FuncReport("Fail", "Please correct test data.Shareholder should not be displayed for non shareholder account:" + accNumber3);
			}
			else
				CL.GetReporting().FuncReport("Pass", "Sharehoder not displayed for non shareholder account:" + accNumber3);
			
			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void fillStockOptionOrder(MobileElement objSelectOption,String sOptionDesc)
	{
		Decorator();
		try
		{
			mobileAction.FuncSwipeWhileElementNotFound(leg1Action, false, 7, "up");
			mobileAction.selectItemFromList(leg1Action, getTestdata("Action",XLSheetUserIDs));
			mobileAction.FuncSwipeOnce("up");
			enterQuantity(leg1Quantity,getTestdata("Leg1Qunatity",XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option,false,7,"up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if(mobileAction.isObjExists(leg2Option,2))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FunCnewSwipe(objSelectOption,false,5);
			mobileAction.FuncClick(objSelectOption, sOptionDesc);
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity,false,5,"up");
			mobileAction.FuncSwipeOnce("up");
			enterQuantity(leg2Quantity,getTestdata("Leg2Qunatity",XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(commissionLink,false,5,"up");
			mobileAction.FuncSwipeOnce("up");
			String tempPrice = getTestdata("Price",XLSheetUserIDs);
			mobileAction.selectItemFromList(price,tempPrice);
			if(tempPrice.equalsIgnoreCase("Net Debit") || tempPrice.equalsIgnoreCase("Net Credit") || tempPrice.equalsIgnoreCase("D�bit net") || tempPrice.equalsIgnoreCase("Cr�dit net"))
			{
				FuncEnterText(LimitPrice, "10");
			}
			
			if(mobileAction.isObjExists(shareholderType, 2) && getTestdata("ShareHolder",XLSheetUserIDs)!="")
			{
				mobileAction.selectItemFromList(shareholderType, getTestdata("ShareHolder",XLSheetUserIDs));
				mobileAction.FuncSwipeOnce("up");
			}
			
			String tempGoodTill = getTestdata("Good'til",XLSheetUserIDs);
			mobileAction.selectItemFromList(goodTill,tempGoodTill);
			mobileAction.FuncSwipeOnce("up");
			
			if(tempGoodTill.equalsIgnoreCase("Specify") || tempGoodTill.equalsIgnoreCase("Pr�ciser"))
			{
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				selectDateSpecify_Android(leg2Option);
			}
			if(mobileAction.isObjExists(editTextPassword, 2))
			{
				FuncEnterText(editTextPassword, getTestdata("TradingPassword",XLSheetUserIDs));
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void fillOptionOptionOrder(MobileElement objLeg1SelectOption,String sLeg1OptionDesc,MobileElement objLeg2SelectOption,String sLeg2OptionDesc)
	{
		Decorator();
		try
		{
			mobileAction.FuncSwipeWhileElementNotFound(leg1Option, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(leg1Option, "Select Option Leg1");
			mobileAction.FuncSwipeWhileElementNotFound(objLeg1SelectOption, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(objLeg1SelectOption, sLeg1OptionDesc);
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.FuncSwipeWhileElementNotFound(leg1Quantity, false, 5, "up");
			//mobileAction.FuncSwipeOnce("up");
			enterQuantity(leg1Quantity,"1");
			
			mobileAction.FuncSwipeWhileElementNotFound(leg2Option, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			if(mobileAction.isObjExists(leg2Option))
				mobileAction.FuncClick(leg2Option, "Select Option Leg2");
			mobileAction.FuncSwipeWhileElementNotFound(objLeg2SelectOption, false, 5, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(objLeg2SelectOption, sLeg2OptionDesc);
			mobileAction.FuncClick(Continue, "Continue");
			mobileAction.FuncSwipeWhileElementNotFound(leg2Quantity, false, 5, "up");	
			//mobileAction.FuncSwipeOnce("up");
			enterQuantity(leg2Quantity,"1");
			mobileAction.FuncSwipeWhileElementNotFound(commissionLink,false,5,"up");
			
			String tempPrice = getTestdata("Price",XLSheetUserIDs);
			mobileAction.selectItemFromList(price,tempPrice);
			if(tempPrice.equalsIgnoreCase("Net Debit") || tempPrice.equalsIgnoreCase("Net Credit") || tempPrice.equalsIgnoreCase("D�bit net") || tempPrice.equalsIgnoreCase("Cr�dit net"))
			{
				FuncEnterText(LimitPrice, "10");
			}
			
			if(mobileAction.isObjExists(shareholderType, 2) && getTestdata("ShareHolder",XLSheetUserIDs)!="")
			{
				mobileAction.selectItemFromList(shareholderType, getTestdata("ShareHolder",XLSheetUserIDs));
				mobileAction.FuncSwipeOnce("up");
			}
			
			String tempGoodTill = getTestdata("Good'til",XLSheetUserIDs);
			mobileAction.selectItemFromList(goodTill,tempGoodTill);
			mobileAction.FuncSwipeOnce("up");
			
			if(tempGoodTill.equalsIgnoreCase("Specify") || tempGoodTill.equalsIgnoreCase("Pr�ciser"))
			{
				if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				selectDateSpecify_Android(leg2Option);
			}
			if(mobileAction.isObjExists(editTextPassword, 2))
			{
				FuncEnterText(editTextPassword, getTestdata("TradingPassword",XLSheetUserIDs));
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void verifyStockOptionBackButton()
	{
		Decorator();
		try
		{
			fillStockOptionOrder(firstBidCALLS, "firstBidCALLS");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.verifyElement(messageBackButton,getTestdata("WarningMessage",XLSheetUserIDs));
			mobileAction.FuncClick(cancelButton, "cancelButton");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			mobileAction.FuncIsElementEnabled(Investing_Trade, "Investing_Trade");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void verifyOptionOptionBackButton()
	{
		Decorator();
		try
		{
			fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS", firstBidPUTS, "firstBidPUTS");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.verifyElement(messageBackButton,getTestdata("WarningMessage",XLSheetUserIDs));
			mobileAction.FuncClick(cancelButton, "cancelButton");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			mobileAction.FuncIsElementEnabled(Investing_Trade, "Investing_Trade");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void verifyOptionOptionPreviewOrderButton()
	{
		Decorator();
		String sPreviousQuotePrice ="";
		String sCurrentQuatePrice = "";
		try
		{
			mobileAction.waitForElement(previewOrderButton);
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			{
			if(!previewOrderButton.isEnabled())
			{
				CL.GetReporting().FuncReport("Pass","previewOrderButton should be disabled" );
			}
			else
				CL.GetReporting().FuncReport("Fail","previewOrderButton should not enabled" );
			}
			
			fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS", firstAskPUTS, "firstAskPUTS");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");

			mobileAction.FuncSwipeWhileElementNotFound(defaultTradeAccount, false, 7, "down");
			sPreviousQuotePrice = getPrice(mobileAction.FuncGetText(Quote_price)).trim();
			mobileAction.FuncClick(refreshButton, "refreshButton");
			Thread.sleep(7000);
			sCurrentQuatePrice = getPrice(mobileAction.FuncGetText(Quote_price)).trim();
			verifyPriceVarience(sCurrentQuatePrice, sPreviousQuotePrice, "Quote");
			
			mobileAction.FuncSwipeWhileElementNotFound(naturalPrice, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncVerifyNonBlankValue(midPrice, "midPrice");
			mobileAction.FuncVerifyNonBlankValue(naturalPrice, "naturalPrice");
			
			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			
			mobileAction.FuncClick(doNotAgreeButton, "doNotAgreeButton");
			mobileAction.FuncIsElementEnabled(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			mobileAction.verifyElement(titleConfirmOrder, getTestdata("urlTitle",XLSheetUserIDs));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void submitStockOptionOrder()
	{
		Decorator();
		try
		{
			String sLeg2OptionChainVal = getTestdata("Leg2OptionChainVal",XLSheetUserIDs);
			
			if(sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillStockOptionOrder(firstAskCALLS, "firstAskCALLS");
			else if(sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillStockOptionOrder(firstAskPUTS, "firstAskPUTS");
			else if(sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillStockOptionOrder(firstBidCALLS, "firstBidCALLS");
			else if(sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillStockOptionOrder(firstBidPUTS, "firstBidPUTS");
							
			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			mobileAction.verifyElement(titleConfirmOrder, getTestdata("urlTitle",XLSheetUserIDs));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void submitOptionOptionOrder()
	{
		Decorator();
		try
		{
			String sLeg1OptionChainVal = getTestdata("Leg1OptionChainVal",XLSheetUserIDs);
			String sLeg2OptionChainVal = getTestdata("Leg2OptionChainVal",XLSheetUserIDs);
			
			if(sLeg1OptionChainVal.equalsIgnoreCase("AskCALLS") && sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS",firstAskCALLS, "firstAskCALLS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("AskCALLS") && sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS",firstAskPUTS, "firstAskPUTS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("AskCALLS") && sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS",firstBidCALLS, "firstBidCALLS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("AskCALLS") && sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillOptionOptionOrder(firstAskCALLS, "firstAskCALLS",firstBidPUTS, "firstBidPUTS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("AskPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillOptionOptionOrder(firstAskPUTS, "firstAskPUTS",firstAskCALLS, "firstAskCALLS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("AskPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillOptionOptionOrder(firstAskPUTS, "firstAskPUTS",firstAskPUTS, "firstAskPUTS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("AskPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillOptionOptionOrder(firstAskPUTS, "firstAskPUTS",firstBidCALLS, "firstBidCALLS");

			else if(sLeg1OptionChainVal.equalsIgnoreCase("AskPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillOptionOptionOrder(firstAskPUTS, "firstAskPUTS",firstBidPUTS, "firstBidPUTS");
			
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("BidCALLS") && sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS",firstBidCALLS, "firstBidCALLS");

			else if(sLeg1OptionChainVal.equalsIgnoreCase("BidCALLS") && sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS",firstBidPUTS, "firstBidPUTS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("BidCALLS") && sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS",firstAskCALLS, "firstAskCALLS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("BidCALLS") && sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillOptionOptionOrder(firstBidCALLS, "firstBidCALLS",firstAskPUTS, "firstAskPUTS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("BidPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("BidCALLS"))
				fillOptionOptionOrder(firstBidPUTS, "firstBidPUTS",firstBidCALLS, "firstBidCALLS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("BidPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("BidPUTS"))
				fillOptionOptionOrder(firstBidPUTS, "firstBidPUTS",firstBidPUTS, "firstBidPUTS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("BidPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("AskCALLS"))
				fillOptionOptionOrder(firstBidPUTS, "firstBidPUTS",firstAskCALLS, "firstAskCALLS");
			
			else if(sLeg1OptionChainVal.equalsIgnoreCase("BidPUTS") && sLeg2OptionChainVal.equalsIgnoreCase("AskPUTS"))
				fillOptionOptionOrder(firstBidPUTS, "firstBidPUTS",firstAskPUTS, "firstAskPUTS");
							
			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			mobileAction.verifyElement(titleConfirmOrder, getTestdata("urlTitle",XLSheetUserIDs));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void verifyStockOptionFieldsReset()
	{
		try
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void selectDateSpecify_Android(MobileElement objOption)
	{
		Decorator();
		try
		{
			Calendar now = Calendar.getInstance();

			//System.out.println(now.getTime());
			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			String sCurrentMonth = format2.split(";")[2];
			
			mobileAction.FuncSwipeWhileElementNotFound(objOption, false, 7, "down");
			String sExpiryDate = mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(objOption),"([0-9]+)");
			int iSelectDate = 1;
			String xpathDate = "";
			
			mobileAction.FuncSwipeWhileElementNotFound(DateSpecify, false, 7, "up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncClick(DateSpecify, "DateSpecify");

			if(sCurrentDate.equalsIgnoreCase(sExpiryDate))
			{
				xpathDate = "//android.view.View[@content-desc='"+ sCurrentDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),sCurrentDate);
			}
			else if((Integer.parseInt(sCurrentDate) < Integer.parseInt(sExpiryDate)) && !sCurrentDay.equalsIgnoreCase("FRI"))
			{
				iSelectDate = Integer.parseInt(sCurrentDate) + 1;
				xpathDate = "//android.view.View[@content-desc='"+ iSelectDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),Integer.toString(iSelectDate));
			}
			else if((Integer.parseInt(sCurrentDate) < Integer.parseInt(sExpiryDate)) && sCurrentDay.equalsIgnoreCase("FRI"))
			{
				iSelectDate = Integer.parseInt(sCurrentDate) + 3;
				xpathDate = "//android.view.View[@content-desc='"+ iSelectDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),Integer.toString(iSelectDate));
			}
			else if((now.getActualMaximum(Calendar.DAY_OF_MONTH) == Integer.parseInt(sCurrentDate)))
			{
				mobileAction.FuncClick(monthNextButton, "monthNextButton");
				iSelectDate = 3;
				xpathDate = "//android.view.View[@content-desc='"+ iSelectDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),Integer.toString(iSelectDate));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}