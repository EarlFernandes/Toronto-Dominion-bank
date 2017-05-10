package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreenMIT;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Options extends _CommonPage {
	private static Options Options;
	
	String accNumber = getTestdata("Accounts", "UserIDs").trim();
    //String xpathAccount = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and contains(@text,'" + accNumber + "']";
	String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";
	
	@iOSFindBy(xpath = "//*[contains(@label,'Orders') or contains(@label,'Ordres')]")
	@AndroidFindBy(xpath = "//*[contains(@text,'Orders') or contains(@text,'Ordres')]")
	private MobileElement orderstab;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Sell') or contains(@label,'Vendre')]") 
	@AndroidFindBy(xpath = "//*[contains(@text,'Sell') or contains(@text,'Vendre')]")
	private MobileElement placedOrders;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Trading Password') or contains(@label,'Mot de passe de nï¿½gociation')]/../XCUIElementTypeSecureTextField[1]")//@Author - Sushil 03-Mar-2017
	@AndroidFindBy(id="com.td:id/editTextPassword")
	private MobileElement editTextPassword;
	
	@iOSFindBy(xpath = "//*[@label='OK' or @label='Done']")
	//@AndroidFindBy(id="android:id/button1")
	private MobileElement iOSKybdOKButton;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Cancel Order') or contains(@label,'Annuler l')]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Cancel Order') or contains(@text,'Annuler l')]")
	private MobileElement cancel_btn;
	
	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") 
	@AndroidFindBy(id="android:id/action_bar_title")
	private MobileElement backButton;
	
	@iOSFindBy(xpath = "//*[contains(@label,'IST') or contains(@label,'EDT') or contains(@label,'HAE')]") 
	@AndroidFindBy(id="com.td:id/timestamp")
	private MobileElement timestamp;
	
	@iOSFindBy(xpath = " //*[contains(@label,'Account') or contains(@label,'Compte')]/../*[3]") 
	@AndroidFindBy(id="com.td:id/textview_account_number")
	private MobileElement account_number;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Order') or contains(@label,'Ordre')]") 
	@AndroidFindBy(xpath = "//*[contains(@text,'1st Leg') or contains(@text,'1re Volet')]")
	private MobileElement Order;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Order') or contains(@label,'Ordre')]/../*[2]")
	@AndroidFindBy(xpath = "//*[contains(@text,'Order') or contains(@text,'Ordre')]/../*[2]/*[1]")
	private MobileElement Orderdetails;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']") 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Price' or @text='Cours']")
	private MobileElement lblPrice;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Price' or @label='Cours']/../*[2]") 
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Price' or @text='Cours']/../*[2]/*[1]")
	private MobileElement price;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good') or contains(@label,'Échéance')]")
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Good') or contains(@text,'Échéance')]")
	private MobileElement lblGoodTill;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good') or contains(@label,'Échéance')]/../*[2]") 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Good') or contains(@text,'Échéance')]/../*[2]/*[1]")
	private MobileElement goodTill;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Estimated Principal') or contains(@label,'Principal estim')]") 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Estimated Principal') or contains(@text,'Principal estim')]")
	private MobileElement lblEstimatedPrincipal;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Estimated Principal') or contains(@label,'Principal estim')]/../*[2]")
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Principal')]/../*[2]/*[1]")
	private MobileElement estimatedPrincipal;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Commission')]") 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Commission')]")
	private MobileElement lblCommission;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Commission')]/../*[2]")
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Commission')]/../*[2]/*[1]")
	private MobileElement Commission;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Estimated Total') or contains(@label,'Total estim')]")
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Total') or contains(@label,'Total estim')]")
	private MobileElement lblestimatedTotal;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Total')]/../*[2]") 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Total')]/../*[2]/*[1]")
	private MobileElement estimatedTotal;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Buying Power Required') or contains(@label,'Pouvoir d')]") 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Buying Power Required') or contains(@text,'Pouvoir d')]")
	private MobileElement lblPowerRequired;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Buying Power') or contains(@label,'Pouvoir d')]/../*[2]") 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Buying Power') or contains(@text,'Pouvoir d')]/../*[2]/*[1]")
	private MobileElement buyingPowerRequired;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder Type') or contains(@label,'Type d')]") 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Shareholder Type') or contains(@text,'Type d')]")
	private MobileElement lblShareholderType;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder Type') or contains(@label,'Type d')]/../*[2]") 
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Shareholder Type') or contains(@text,'Type d')]/../*[2]/*[1]")
	private MobileElement ShareholderType;
	
	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']") 
	@AndroidFindBy(id="com.td:id/btn_cancel")
	private MobileElement btn_cancel;
	
	@iOSFindBy(xpath = "//*[@label='Send Order' or contains(@label,'Envoyer')]") 
	@AndroidFindBy(id="com.td:id/btn_continue")
	private MobileElement btnSendOrder;
	
	@iOSFindBy(xpath = "//*[@label='Important Information' or @label='Renseignements importants']")
	@AndroidFindBy(id="com.td:id/importantInfoLink")
	private MobileElement importantInfoLink;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Action']/../XCUIElementTypeStaticText[2]") 
	@AndroidFindBy(xpath = "//*[contains(@text,'Action')]")
	private MobileElement action;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Quantity' or contains(@label,'Quantit')]/../XCUIElementTypeTextField") 
	@AndroidFindBy(xpath = "//*[contains(@text,'Quantity') or contains(@text,'Quantit')]/../following-sibling::*/*[@resource-id='com.td:id/amountField']/*/*/*[@resource-id='com.td:id/amountEditText']")
	private MobileElement Quantity;
	
	@iOSFindBy(xpath = "//*[@label='Commission Schedule' or contains(@label,'des commissions')]")
	@AndroidFindBy(id="com.td:id/commissionLink")
	private MobileElement commissionLink;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Limit Price') or contains(@label,'Cours limit')]/../*[2]") 
	@AndroidFindBy(xpath = "//*[contains(@text,'Limit Price') or contains(@text,'Cours limit')]/../*[@resource-id='com.td:id/amountEditText']")
	private MobileElement LimitPrice;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Trigger Price') or contains(@label,'déclench')]/../*[2]") 
	@AndroidFindBy(xpath = "//*[contains(@text,'Trigger  Price') or contains(@text,'déclench')]/../*[@resource-id='com.td:id/amountEditText']")
	private MobileElement TriggerPrice;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Shareholder') or contains(@label,'actionnaire')]/../*[2]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Shareholder') or contains(@text,'actionnaire')]/../android.widget.TextView[@index=1]")
	private MobileElement shareholderType;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Preview Order') or contains(@label,'Aperçu de')]")
	@AndroidFindBy(id="com.td:id/orderEntryPreviewButton")
	private MobileElement previewOrderButton;
	
	@iOSFindBy(xpath = "//*[@label='Agree' or @label='Accepte']") 
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Agree' or @text='Accepte']")
	private MobileElement agreeButton;
	
	//@iOSFindBy(xpath = "(//XCUIElementTypeStaticText[@label='180']/../../XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]") //@Author - Sushil 17-Feb-2017
	@AndroidFindBy(xpath="//*[@resource-id='com.td:id/textview_info' and @index=0]")
	private MobileElement firstBidCALLS;
	
	@iOSFindBy(xpath = "//*[@label='Change Order' or contains(@label,'Modifier')]") //@Author - Sushil 21-Mar-2017
	@AndroidFindBy(id="com.td:id/change_order_btn")
	private MobileElement btn_change;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Account') or contains(@label,'Compte')]/../*[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Account') or contains(@text,'Compte')]/../android.widget.TextView[@index=1]")
	private MobileElement verifyAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Order Type') or contains(@label,'ordre')]/../*[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Order Type') or contains(@text,'ordre')]/../android.widget.TextView[@index=1]")
	private MobileElement verifyOrderType;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/symbol")
	private MobileElement Quote_Symbol;
	/*
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Enter name or symbol' or contains(@label,'nom ou le symbole')]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter name or symbol' or contains(@text,'nom ou le symbole')]")  //changed by rashmi
	private MobileElement searchSymbol;
	*/
	@iOSFindBy(xpath = "//*[contains(@label,'Quantity Filled') or contains(@label,'Quantit')]") 
	@AndroidFindBy(xpath = "//*[contains(@text,'Quantity Filled') or contains(@text,'Quantit')]")
	private MobileElement QuantityFilled;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@label,'Trading Password is turned off') or contains(@label,'Votre mot de passe est inactif')]")//@Author - Sushil 03-Mar-2017
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Trading Password is turned off') or contains(@text,'Votre mot de passe est inactif')]")
	private MobileElement tradingPwdDisableMsg;
	
	@iOSFindBy(xpath = "//*[contains(@label,'Order Details') or contains(@label,'Compte')]") //
	@AndroidFindBy(xpath = "//*[contains(@text,'Order Details') or contains(@text,'Compte')]")
	private MobileElement orderdetails;
	
	@iOSFindBy(xpath = "//*[contains(@label,'IST') or contains(@label,'HAE')]/../*[4]/*[1]") //
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/contentLayout' and @index='0']")
	private MobileElement orders;
	
	@iOSFindBy(xpath = "//*[@label='Options']")
	@AndroidFindBy(xpath = "//android.view.View[@text='Options' or @content-desc='Options']") //changed by rashmi
	private MobileElement clickOptions;
	
	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;
	

	@iOSFindBy(xpath = "//*[@label='Buy' or @label='Achat']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='Buy_Entity_Button' and (@content-desc='Buy' or @content-desc='Achat')]")  //changed by rashmi
	private MobileElement clickBuy;

	@iOSFindBy(xpath = "//*[@label='Enter name or symbol' or contains(@label,'Entrer un nom'))]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='symbol-search' and (@text='Enter name or symbol' or contains(@text,'Entrer un nom'))]")  //changed by rashmi
	private MobileElement searchSymbol;
	
	String symbolXL = getTestdata("Symbol");
	String xpathSymbolFlag = "//android.view.View[@index='1' and @content-desc='"+symbolXL+"']";
	String xpathSymbolFlag_ios = "//XCUIElementTypeCell[contains(@label,'"+symbolXL+"')]";


	



	
	
	
	public synchronized static Options get() {
		if (Options == null) {
			Options = new Options();
		}
		return Options;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)),
				this);
	}
		
   public void verifyOptionFlyoutMenu()
	{
		Decorator();
		try
		{
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
			mobileAction.FuncClick(orderstab, "Orders Tab");
			mobileAction.FuncClick(orders, "Order");
			mobileAction.FuncClick(cancel_btn, "Cancel Order");
			if(mobileAction.isObjExists(editTextPassword, 2))
			{
				TradeMultiLeg.get().FuncEnterText(editTextPassword, getTestdata("TradingPassword",XLSheetUserIDs));
			}
			mobileAction.FuncClick(cancel_btn, "Cancel Order");
			MainScreenMIT.get().tapInvesting();
			Investing.get().verifyInvestingHeader();
	
		}  
		 catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
	}
	
	public void fillOptionOrder(){
		Decorator();
		try{
			Thread.sleep(5000);
	        mobileAction.clickCoOrdinatesPercentage(0.90f,0.80f,1);
			mobileAction.FunCnewSwipe(action,false,5);
			mobileAction.selectItemFromList(action, getTestdata("Action", XLSheetUserIDs));
			TradeMultiLeg.get().FuncEnterText(Quantity,getTestdata("Quantity",XLSheetUserIDs));
			mobileAction.FuncSwipeWhileElementNotFound(commissionLink,false,5,"up");
			mobileAction.FuncSwipeOnce("up");
			String tempPrice = getTestdata("Price",XLSheetUserIDs);
			mobileAction.selectItemFromList(price,tempPrice);
			if(tempPrice.equalsIgnoreCase("Limit") || tempPrice.equalsIgnoreCase("Limite"))
			{
				TradeMultiLeg.get().FuncEnterText(LimitPrice, getTestdata("SelectLimitPrice",XLSheetUserIDs));
				
			}
			if(tempPrice.equalsIgnoreCase("Stop Limit") || tempPrice.equalsIgnoreCase("Stop Limite"))
			{
				TradeMultiLeg.get().FuncEnterText(TriggerPrice, getTestdata("TriggerDelta",XLSheetUserIDs));
				TradeMultiLeg.get().FuncEnterText(LimitPrice, getTestdata("SelectLimitPrice",XLSheetUserIDs));
			}
			
			String sShareHolder = getTestdata("ShareHolder",XLSheetUserIDs).trim();
			if(mobileAction.isObjExists(shareholderType, 2) && sShareHolder!="")
			{
				if(!sShareHolder.contains("autre"))
					mobileAction.selectItemFromList(shareholderType, sShareHolder);
				else
					TradeMultiLeg.get().selectShareholderNeitherFR();
				     mobileAction.FuncSwipeOnce("up");
			}
			
			String tempGoodTill = getTestdata("Good'til",XLSheetUserIDs);
			mobileAction.selectItemFromList(goodTill,tempGoodTill);
			mobileAction.FuncSwipeOnce("up");
			if(mobileAction.isObjExists(editTextPassword, 2))
			{
				TradeMultiLeg.get().FuncEnterText(editTextPassword, getTestdata("TradingPassword",XLSheetUserIDs));
			}
			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
			mobileAction.FuncClick(agreeButton, "agreeButton");
			} catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
	}
	
	
	public void verifyOptionConfirmOrder()
	{
	Decorator();
	  try{
			Calendar now = Calendar.getInstance();

			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			String sCurrentDate = format2.split(";")[1];
			
			mobileAction.verifyElementIsDisplayed(backButton, "backButton");
			
			mobileAction.verifyElementTextContains(timestamp,sCurrentDate);
			mobileAction.verifyElementTextContains(account_number, getTestdata("Accounts",XLSheetUserIDs));
			
			mobileAction.verifyElementIsDisplayed(Order, "Order");
			mobileAction.verifyElement(Orderdetails, getTestdata("Action",XLSheetUserIDs) + " " + getTestdata("Quantity",XLSheetUserIDs) + " " + getTestdata("Symbol",XLSheetUserIDs));
			
			mobileAction.FuncSwipeWhileElementNotFound(importantInfoLink,false,7,"up");
			mobileAction.FuncSwipeOnce("up");
			mobileAction.FuncSwipeOnce("up");
			
			mobileAction.verifyElementIsDisplayed(lblEstimatedPrincipal, "Estimated Principal");
			mobileAction.FuncVerifyNonBlankValue(estimatedPrincipal, "estimatedPrincipal");
			
			mobileAction.verifyElementIsDisplayed(lblCommission, "Commission");
			mobileAction.FuncVerifyNonBlankValue(Commission, "Commission");	
			
			mobileAction.verifyElementIsDisplayed(lblestimatedTotal, "Estimated Total");
			mobileAction.FuncVerifyNonBlankValue(estimatedTotal, "estimatedTotal");
			String sShareHolder = getTestdata("ShareHolder",XLSheetUserIDs).trim();
			if(mobileAction.isObjExists(ShareholderType, 2) && sShareHolder!="")	
			{
				mobileAction.verifyElementIsDisplayed(lblShareholderType, "Shareholder Type");
				if(!sShareHolder.contains("autre"))
					mobileAction.verifyElement(ShareholderType, sShareHolder);
				else
					mobileAction.verifyElementTextContains(ShareholderType, "autre");
			}
			
			if(mobileAction.isObjExists(buyingPowerRequired, 2))
			{
				mobileAction.verifyElementIsDisplayed(lblPowerRequired, "Buying Power Required");
				mobileAction.FuncVerifyNonBlankValue(buyingPowerRequired, "buyingPowerRequired");
			}
			
			mobileAction.verifyElementIsDisplayed(btn_cancel, "btn_cancel");
			mobileAction.verifyElementIsDisplayed(btnSendOrder, "btnSendOrder");
			mobileAction.FuncClick(btnSendOrder, "btnSendOrder");

		}catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	
	public void changeQuantity(){
		Decorator();
		try{
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
				mobileAction.FuncClick(orderstab, "Orders Tab");
				mobileAction.FuncClick(orders, "Order");
				mobileAction.FuncClick(btn_change, "Change Order");
			
				String quantity = getTestdata("Quantity");
			
				if(mobileAction.isObjExists(Quantity, 2) && quantity!="")
					{
						TradeMultiLeg.get().FuncEnterText(Quantity,quantity);
					}
		
				mobileAction.FuncSwipeWhileElementNotFound(commissionLink,false,5,"up");
				mobileAction.FuncSwipeOnce("up");
			
				if(mobileAction.isObjExists(editTextPassword, 2))
					{
						TradeMultiLeg.get().FuncEnterText(editTextPassword, getTestdata("TradingPassword",XLSheetUserIDs));
					}
				mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
				mobileAction.FuncClick(agreeButton, "agreeButton");
			}catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
	}
	
	
	public void changePrice(){
		Decorator();
		try{
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
				mobileAction.FuncClick(orderstab, "Orders Tab");
				mobileAction.FuncClick(orders, "Order");
				mobileAction.FuncClick(btn_change, "Change Order");
			
				String tempPrice = getTestdata("Price");
		      	mobileAction.selectItemFromList(price,tempPrice);
		      
			
		      	if(tempPrice.equalsIgnoreCase("Limit") || tempPrice.equalsIgnoreCase("Limite"))
		      	{
		      		TradeMultiLeg.get().FuncEnterText(LimitPrice, getTestdata("SelectLimitPrice"));
				
		      	}
			
		      	if(tempPrice.equalsIgnoreCase("Stop Limit") || tempPrice.equalsIgnoreCase("Stop Limite"))
		      	{
		      		TradeMultiLeg.get().FuncEnterText(TriggerPrice, getTestdata("TriggerDelta"));
		      		TradeMultiLeg.get().FuncEnterText(LimitPrice, getTestdata("SelectLimitPrice"));
		      	}
                mobileAction.FuncSwipeWhileElementNotFound(commissionLink,false,5,"up");
				mobileAction.FuncSwipeOnce("up");
			
				if(mobileAction.isObjExists(editTextPassword, 2))
					{
						TradeMultiLeg.get().FuncEnterText(editTextPassword, getTestdata("TradingPassword",XLSheetUserIDs));
					}
				mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
				mobileAction.FuncClick(agreeButton, "agreeButton");
			} catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
	}
			
	public void changeGoodtil(){
		Decorator();
		try{
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
				mobileAction.FuncClick(orderstab, "Orders Tab");
				mobileAction.FuncClick(orders, "Order");
				mobileAction.FuncClick(btn_change, "Change Order");
			
				String tempGoodTill = getTestdata("Good'til");
				if(mobileAction.isObjExists(goodTill, 2) && tempGoodTill!="")
				{
			    	mobileAction.selectItemFromList(goodTill,tempGoodTill);
				}
				
                mobileAction.FuncSwipeWhileElementNotFound(commissionLink,false,5,"up");
				mobileAction.FuncSwipeOnce("up");
			
				if(mobileAction.isObjExists(editTextPassword, 2))
					{
						TradeMultiLeg.get().FuncEnterText(editTextPassword, getTestdata("TradingPassword",XLSheetUserIDs));
					}
				mobileAction.FuncClick(previewOrderButton, "previewOrderButton");
				mobileAction.FuncClick(agreeButton, "agreeButton");
			} catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
	}
	
	public void verifyOptionsForNewOrder() {

		Decorator();

		try {

		mobileAction.FuncClick(searchSymbol, "Search symbol");
		enterSymbol(searchSymbol, getTestdata("Symbol", XLSheetUserIDs));
		MobileElement searchSymbol = (MobileElement) ((AppiumDriver) CL.GetDriver())
				.findElement(By.xpath(xpathSymbolFlag));
		mobileAction.FuncClick(searchSymbol, "Search symbol");
		mobileAction.FuncClick(clickOptions, "click on Options");
		mobileAction.waitForElementToVanished(progressBar);
		mobileAction.FuncSwipeOnce("up");
		mobileAction.FuncSwipeOnce("up");
		mobileAction.clickCoOrdinatesPercentage(0.90f,0.70f,1);
		mobileAction.FuncSwipeOnce("down");
		mobileAction.FuncClick(clickBuy, "click on Buy");
		LoginMIT.get().MITLogin();

		mobileAction.verifyElementIsDisplayed(verifyAccount, verifyAccount.getText());

		mobileAction.verifyElementIsDisplayed(verifyOrderType, verifyOrderType.getText());

		mobileAction.verifyElementIsDisplayed(Quote_Symbol, Quote_Symbol.getText());
		}catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
	}

		
		public void enterSymbol(MobileElement mEle,String symbol)
		{
		try
		{
			mobileAction.FuncSendKeys(mEle, symbol + " ");
		//mobileAction.FuncSendKeys(mEle,"\u0008");
		//mEle.sendKeys(Keys.DELETE);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}
		public void cancelOrder()
		{
			Decorator();
			try
			{
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
				mobileAction.FuncClick(orderstab, "Orders Tab");
				mobileAction.FuncClick(orders, "Order");
				mobileAction.FuncClick(cancel_btn, "Cancel Order");
				if(mobileAction.isObjExists(editTextPassword, 2))
				{
					TradeMultiLeg.get().FuncEnterText(editTextPassword, getTestdata("TradingPassword",XLSheetUserIDs));
				}
			} catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
	 
	 public void verifyOptionCancelConfirmOrder()
		{
		Decorator();
		  try{
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
				mobileAction.FuncClick(orderstab, "Orders Tab");
				mobileAction.FuncClick(orders, "Order");
				mobileAction.FuncClick(cancel_btn, "Cancel Order");
				Calendar now = Calendar.getInstance();

				String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
				String sCurrentDate = format2.split(";")[1];
				
				mobileAction.verifyElementIsDisplayed(backButton, "backButton");
				
				mobileAction.verifyElementTextContains(timestamp,sCurrentDate);
				mobileAction.verifyElementTextContains(account_number, getTestdata("Accounts",XLSheetUserIDs));
				
				mobileAction.verifyElementIsDisplayed(Order, "Order");
				mobileAction.verifyElement(Orderdetails, getTestdata("Action",XLSheetUserIDs) + " " + getTestdata("Quantity",XLSheetUserIDs) + " " + getTestdata("Symbol",XLSheetUserIDs));
				
				mobileAction.verifyElementIsDisplayed(QuantityFilled, "Quantity Filled");
				mobileAction.verifyElementIsDisplayed(importantInfoLink,"Important Information Link");
             } catch (NoSuchElementException e) {
     			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
    			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
    		} catch (InterruptedException e) {
    			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
    			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
    		} catch (IOException e) {
    			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
    			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
    		} catch (Exception e) {
    			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
    			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
    		}
		}
	 
	 public void verifyTradingPassword()
		{
			Decorator();
			try
			{
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
				mobileAction.FuncClick(orderstab, "Orders Tab");
				mobileAction.FuncClick(orders, "Order");
				mobileAction.FuncClick(cancel_btn, "Cancel Order");
				if(mobileAction.verifyElementIsPresent(tradingPwdDisableMsg))
				{
					mobileAction.verifyElementIsDisplayed(tradingPwdDisableMsg, "Trading password Disabled.");
				}else{
				   mobileAction.verifyElementIsDisplayed(editTextPassword, "Trading password");
				}
			} catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
	 
	 public void verifybackButton()
		{
			Decorator();
			try
			{
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
				mobileAction.FuncClick(orderstab, "Orders Tab");
				mobileAction.FuncClick(orders, "Order");
				mobileAction.FuncClick(cancel_btn, "Cancel Order");
				verifyOptionCancelConfirmOrder();
				mobileAction.FuncClick(backButton, "backButton");
				mobileAction.verifyElementIsDisplayed(orderdetails, "Order details");
			} catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
	 
	 public void verifyImportantinformation()
		{
			Decorator();
			try
			{
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount,true,60,"up");
				mobileAction.FuncClick(orderstab, "Orders Tab");
				mobileAction.FuncClick(orders, "Order");
				mobileAction.FuncClick(cancel_btn, "Cancel Order");
				mobileAction.verifyElementIsDisplayed(importantInfoLink, "Important Information Link");
			} catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (InterruptedException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
           }


}
			
			