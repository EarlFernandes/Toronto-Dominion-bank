package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;

public class StockOptionLeg extends _CommonPage{
    private static StockOptionLeg StockOptionLeg;
    public boolean shareholderFlag = false;
    
	public synchronized static StockOptionLeg get() {
		if (StockOptionLeg == null) {
			StockOptionLeg = new StockOptionLeg();
		}
		return StockOptionLeg;
	}
	protected com.td.test.framework.CommonLib CL = new com.td.test.framework.CommonLib();
		
	@iOSFindBy(xpath = "//*[contains(@text,'Enter name or symbol')") 
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Enter name or symbol']) | (//android.widget.TextView[@text='Entrez le nom ou le symbole'])")
	
	private MobileElement symboltext;
	

	@iOSFindBy(xpath = "//*[contains(@text,'Enter name or symbol')") 
	@AndroidFindBy(xpath = "//*[@resource-id = 'com.td:id/edt_search_field_search_mode']")
	
	private MobileElement searchsymbol;
	
	@iOSFindBy(xpath = "//*[@content-desc = 'U S']/following-sibling::*[1]") 
	@AndroidFindBy(xpath = "//*[@content-desc = 'U S']/following-sibling::*[1]")
	
	private MobileElement firstsymbolUS;
	
	@iOSFindBy(xpath = "//*[@text='1st Leg']/../following-sibling::*[4]/*[1]/*[1]/*[2]") 
	@AndroidFindBy(xpath = "(//*[@text='1st Leg']/../following-sibling::*[4]/*[1]/*[1]/*[2]) | (//*[@text='1re Volet']/../following-sibling::*[4]/*[1]/*[1]/*[2])")
	
	private MobileElement leg1action;
	
	@iOSFindBy(xpath = "//*[@text='Buy']") 
	@AndroidFindBy(xpath = "(//*[@text='Buy'and @index='0']) | (//*[@text='Acheter'and @index='0']) ")
	
	private MobileElement actionbuy;
	
	@iOSFindBy(xpath = "//*[@text='Buy to Open']") 
	@AndroidFindBy(xpath = "(//*[@text='Buy to Open'and @index='0']) | (//*[@text='Achat pour ouvrir'and @index='0']) ")
	
	private MobileElement actionbuytoopen;
	
	@iOSFindBy(xpath = "//*[@text='Buy to Close']") 
	@AndroidFindBy(xpath = "(//*[@text='Buy to Close'and @index='0']) | (//*[@text='Achat pour fermer'and @index='0']) ")
	
	private MobileElement actionBuyToclose;
	
	@iOSFindBy(xpath = "//*[@text='Sell to Close']") 
	@AndroidFindBy(xpath = "(//*[@text='Sell to Close'and @index='0']) | (//*[@text='Vente pour fermer'and @index='0']) ")
	
	private MobileElement actionSelltoClose;
	
	@iOSFindBy(xpath = "//*[@text='Sell to Open Covered']") 
	@AndroidFindBy(xpath = "(//*[@text='Sell to Open Covered'and @index='0']) | (//*[@text='Vente pour ouvrir – couvert'and @index='0']) ")
	
	private MobileElement actionSelltoOpenCovered;
	
	@iOSFindBy(xpath = "//*[@text='Sell to Open Uncovered']") 
	@AndroidFindBy(xpath = "(//*[@text='Sell to Open Uncovered'and @index='0']) | (//*[@text='Vente pour ouvrir – non couvert'and @index='0']) ")
	
	private MobileElement actionSelltoOpenUncovered;
	
	
	@iOSFindBy(xpath = "//*[@text='1st Leg']/../following-sibling::*[4]/*[1]/*[1]/*[2]") 
	@AndroidFindBy(xpath = "(//*[@text='1st Leg']/../following-sibling::*[5]/*[1]/*[1]/*[1]/*[1]) | (//*[@text='1re Volet']/../following-sibling::*[5]/*[1]/*[1]/*[1]/*[1])")
	
	private MobileElement leg1quantity;
	
	@iOSFindBy(xpath = "//*[@text='2nd Leg']/../following-sibling::*[4]/*[1]/*[1]/*[2]") 
	@AndroidFindBy(xpath = "(//*[@text='2nd Leg']/../following-sibling::*[5]/*[1]/*[1]/*[1]/*[2]) | (//*[@text='2e Volet']/../following-sibling::*[5]/*[1]/*[1]/*[1]/*[2])")
	
	private MobileElement leg2quantity;	
	
	@iOSFindBy(xpath = "//*[@text='Select Option Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='2nd Leg']/../following-sibling::*[2]/*[1]) | (//*[@text='2e Volet']/../following-sibling::*[2]/*[1])")	
	
	private MobileElement leg2option;
	
	@iOSFindBy(xpath = "//*[@text='Bid']") 
	@AndroidFindBy(xpath = "(//*[@text='Bid' and @index = '0']/../following-sibling::*[2]/*[2]) | (//*[@text='Acheteur' and @index = '0']/../following-sibling::*[2]/*[2])")
	
	private MobileElement leg2optioncall;
	
	@iOSFindBy(xpath = "//*[@text='Continue' and @index='1']") 
	@AndroidFindBy(xpath = "(//*[@text='Continue' and @index='1']) | (//*[@text='Continuer' and @index='1'])")
	
	private MobileElement btncontinue;
	
	@iOSFindBy(xpath = "//*[@text='2nd Leg']/../following-sibling::*[4]/*[1]/*[1]/*[2]") 
	@AndroidFindBy(xpath = "(//*[@text='2nd Leg']/../following-sibling::*[4]/*[1]/*[1]/*[2]) | (//*[@text='2e Volet']/../following-sibling::*[4]/*[1]/*[1]/*[2]) ")
	
	private MobileElement leg2action;
	
	
	@iOSFindBy(xpath = "//*[@text='Price']") 
	@AndroidFindBy(xpath = "(//*[@text='Price' and @index = '0']) | (//*[@text='Cours' and @index = '0'])")
	
	private MobileElement price;
	
	
	@iOSFindBy(xpath = "//*[@text='Net Debit']") 
	@AndroidFindBy(xpath = "(//*[@text='Net Debit' and @index = '0']) | (//*[@text='Débit net' and @index = '0'])")
	
	private MobileElement priceNetDebit;
	
	@iOSFindBy(xpath = "//*[@text='Net Credit']") 
	@AndroidFindBy(xpath = "(//*[@text='Net Credit' and @index = '0']) | (//*[@text='Crédit net' and @index = '0'])")
	
	private MobileElement priceNetCredit;
	
	@iOSFindBy(xpath = "//*[@text='Market']") 
	@AndroidFindBy(xpath = "(//*[@text='Market' and @index = '0']) | (//*[@text='Cours du marché' and @index = '0'])")
	
	private MobileElement priceMarket;
	
	@iOSFindBy(xpath = "//*[@text='Even']") 
	@AndroidFindBy(xpath = "(//*[@text='Even' and @index = '0']) | (//*[@text='Pair' and @index = '0'])")
	
	private MobileElement priceEven;
	
	@iOSFindBy(xpath = "//*[@text='Limit Price ($)']") 
	@AndroidFindBy(xpath = "(//*[@text='Limit Price ($)' and @index = '1']) | (//*[@text='Cours limité ($)' and @index = '1'])")
	
	private MobileElement limitprice;
	
	@iOSFindBy(xpath = "//*[@text='Shareholder Type']") 
	@AndroidFindBy(xpath = "(//*[@text='Shareholder Type' and @index = '0']) | (//*[@text='Type d’actionnaire' and @index = '0'])")
	
	private MobileElement shareholdertype;
	
	@iOSFindBy(xpath = "//*[@text='Insider']") 
	@AndroidFindBy(xpath = "(//*[@text='Insider' and @index = '0']) | (//*[@text='Initié' and @index = '0'])")
	
	private MobileElement shareholderInsider;
	
	@iOSFindBy(xpath = "//*[@text='Neither']") 
	@AndroidFindBy(xpath = "(//*[@text='Neither' and @index = '0']) | (//*[@text='Ni l’un, ni l’autre' and @index = '0'])")
	
	private MobileElement shareholderNeither;
	
	@iOSFindBy(xpath = "//*[@text='Significant']") 
	@AndroidFindBy(xpath = "(//*[@text='Significant' and @index = '0']) | (//*[@text='Important' and @index = '0'])")
	
	private MobileElement shareholderSignificant;
	
	@iOSFindBy(xpath = "//*[@text='Trading Password']") 
	@AndroidFindBy(xpath = "(//*[@text='Trading Password' and @index = '0']) | (//*[@text='Mot de passe de négociation' and @index = '0'])")
	
	private MobileElement password;
	
	@iOSFindBy(xpath = "//*[contains(@text,'Enter password')]") 
	@AndroidFindBy(xpath = "(//*[contains(@text,'Enter') and @index = '0']) | (//*[contains(@text,'Entrez') and @index = '0'])")
	
	private MobileElement passwordtext;
	
	@iOSFindBy(xpath = "//*[@text='Preview Order']") 
	@AndroidFindBy(xpath = "(//*[@text='Preview Order' and @index = '0']) | (//*[@text='Aperçu de l’ordre' and @index = '0'])")
	
	private MobileElement previeworder;
	
	@iOSFindBy(xpath = "//*[@text='Agree']") 
	@AndroidFindBy(xpath = "(//*[@text='Agree' and @index = '1']) | (//*[@text='Accepte' and @index = '1'])")
	
	private MobileElement agree;
	
	@iOSFindBy(xpath = "//*[@text='Do not agree']") 
	@AndroidFindBy(xpath = "(//*[@text='Do not agree' and @index = '1']) | (//*[@text='Accepte' and @index = '1'])")
	
	private MobileElement dontAgree;
	
	
	//Confirm Order labels
	
	@iOSFindBy(xpath = "//*[contains(@text,'')") 
	@AndroidFindBy(xpath = "//*[@resource-id = 'com.td:id/timestamp']")
	
	private MobileElement timestamp;
	
	@iOSFindBy(xpath = "//*[@text='Buying Power']") 
	@AndroidFindBy(xpath = "(//*[@text='Buying Power' and @index = '5']) | (//*[@text='1re Volet' and @index = '0'])")
	
	private MobileElement lblBuyingPower;
	
	@iOSFindBy(xpath = "//*[@text='1st Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='1st Leg' and @index = '0']) | (//*[@text='1re Volet' and @index = '0'])")
	
	private MobileElement lblFirstLeg;
	
	@iOSFindBy(xpath = "//*[@text='1st Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='1st Leg' and @index = '0']../following-sibling::*[1]/*[1]) | (//*[@text='1re Volet' and @index = '0']../following-sibling::*[1]/*[1])")
	
	private MobileElement lblFirstLegValue;
	
	@iOSFindBy(xpath = "//*[@text='2nd Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='2nd Leg' and @index = '0']) | (//*[@text='2e Volet' and @index = '0'])")
	
	private MobileElement lblSecondLeg;
	
	@iOSFindBy(xpath = "//*[@text='2nd Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='2nd Leg' and @index = '0']../following-sibling::*[1]/*[1]) | (//*[@text='2e Volet' and @index = '0']../following-sibling::*[1]/*[1])")
	
	private MobileElement lblSecondLegValue;
	
	@iOSFindBy(xpath = "//*[@text='Price']") 
	@AndroidFindBy(xpath = "(//*[@text='Price' and @index = '0']) | (//*[@text='Cours' and @index = '0'])")
	
	private MobileElement lblPrice;
	
	@iOSFindBy(xpath = "//*[@text='Price']") 
	@AndroidFindBy(xpath = "(//*[@text='Price' and @index = '0']/following-sibling::*[1]) | (//*[@text='Cours' and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblPriceValue;
	
	@iOSFindBy(xpath = "//*[contains(@text,'Good')]") 
	@AndroidFindBy(xpath = "(//*[contains(@text,'Good') and @index = '0']) | (//*[contains(@text,'Échéance') and @index = '0'])")
	
	private MobileElement lblGoodTil;
	
	@iOSFindBy(xpath = "//*[contains(@text,'Good')]") 
	@AndroidFindBy(xpath = "(//*[contains(@text,'Good') and @index = '0']/following-sibling::*[1]) | (//*[contains(@text,'Échéance') and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblGoodTilValue;
	
	@iOSFindBy(xpath = "//*[@text='Estimated Principal']") 
	@AndroidFindBy(xpath = "(//*[@text='Estimated Principal' and @index = '0']) | (//*[@text='Principal estimé' and @index = '0'])")
	
	private MobileElement lblEstimatedPrincipal;
	
	@iOSFindBy(xpath = "//*[@text='Estimated Principal']") 
	@AndroidFindBy(xpath = "(//*[@text='Estimated Principal' and @index = '0']/following-sibling::*[1]) | (//*[@text='Principal estimé' and @index = '0']/following-sibling::*[1]) ")
	
	private MobileElement lblEstimatedPrincipalValue;
	
	@iOSFindBy(xpath = "//*[@text='Commission']") 
	@AndroidFindBy(xpath = "//*[@text='Commission' and @index = '0']")
	
	private MobileElement lblCommission;
	
	@iOSFindBy(xpath = "//*[@text='Commission']") 
	@AndroidFindBy(xpath = "//*[@text='Commission' and @index = '0']/following-sibling::*[1]")
	
	private MobileElement lblCommissionValue;
	
	@iOSFindBy(xpath = "//*[@text='Estimated Total']") 
	@AndroidFindBy(xpath = "(//*[@text='Estimated Total' and @index = '0']) | (//*[@text='Total estimé' and @index = '0'])")
	
	private MobileElement lblEstimatedTotal;
	
	@iOSFindBy(xpath = "//*[@text='Estimated Total']") 
	@AndroidFindBy(xpath = "(//*[@text='Estimated Total' and @index = '0']/following-sibling::*[1]) | (//*[@text='Total estimé' and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblEstimatedTotalValue;
	
	@iOSFindBy(xpath = "//*[@text='Shareholder Type']") 
	@AndroidFindBy(xpath = "(//*[@text='Shareholder Type' and @index = '0']) | (//*[@text='Type d’actionnaire' and @index = '0'])")
	
	private MobileElement lblShareholderType;
	
	@iOSFindBy(xpath = "//*[@text='Shareholder Type']") 
	@AndroidFindBy(xpath = "(//*[@text='Shareholder Type' and @index = '0']/following-sibling::*[1]) | (//*[@text='Type d’actionnaire' and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblShareholderTypeValue;
	
	@iOSFindBy(xpath = "//*[@text='Buying Power Required']") 
	@AndroidFindBy(xpath = "(//*[@text='Buying Power Required' and @index = '0']) | (//*[@text='Pouvoir d’achat requis' and @index = '0'])")
	
	private MobileElement lblBuyingPowerReqd;
	
	@iOSFindBy(xpath = "//*[@text='Buying Power Required']") 
	@AndroidFindBy(xpath = "(//*[@text='Buying Power Required' and @index = '0']/following-sibling::*[1]) | (//*[@text='Pouvoir d’achat requis' and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblBuyingPowerReqdValue;
	
	@iOSFindBy(xpath = "//*[@text='Important Information']") 
	@AndroidFindBy(xpath = "(//*[@text='Important Information' and @index = '0']) | (//*[@text='Renseignements importants' and @index = '0'])")
	
	private MobileElement lblImportantInformation;
	
	@iOSFindBy(xpath = "//*[@text='Cancel']") 
	@AndroidFindBy(xpath = "(//*[@text='Cancel' and @index = '0']) | (//*[@text='Annuler' and @index = '0'])")
	
	private MobileElement btnCancel;
	
	@iOSFindBy(xpath = "//*[@text='Send Order']") 
	@AndroidFindBy(xpath = "(//*[@text='Send Order' and @index = '1']) | (//*[@text='Envoyer l’ordre' and @index = '1'])")
	
	private MobileElement btnSendOrder;
	
	@iOSFindBy(xpath = "//*[@text='Order sent successfully']") 
	@AndroidFindBy(xpath = "(//*[@text='Order sent successfully' and @index = '1']) | (//*[@text='Ordre transmis avec succès.' and @index = '1'])")
	
	private MobileElement btnOrderSent;
	
		
		
	@iOSFindBy(xpath = "//*[@text='HOME']") 
	@AndroidFindBy(xpath = "(//*[@text='HOME' and @index = '0']) | (//*[@text='RETOUR À L’ACCUEIL' and @index = '0'])")
	
	private MobileElement btnHome;
	
	@iOSFindBy(xpath = "//*[@text='ORDERS']") 
	@AndroidFindBy(xpath = "(//*[@text='ORDERS' and @index = '1']) | (//*[@text='ORDRES' and @index = '1'])")
	
	private MobileElement btnOrders;
	
	@iOSFindBy(xpath = "//*[@text='TRADE']") 
	@AndroidFindBy(xpath = "(//*[@text='TRADE' and @index = '2']) | (//*[@text='NÉGOCIATION' and @index = '2'])")
	
	private MobileElement btnTrade;
	
	@iOSFindBy(xpath = "//*[@text='Multi-Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='Multi-Leg' and @index = '1']) | (//*[@text='Composantes multiples' and @index = '1'])")
	
	private MobileElement lnkMultiLeg;
	
	@iOSFindBy(xpath = "//*[@text='Action & Quantity']") 
	@AndroidFindBy(xpath = "(//*[@text='Action & Quantity' and @index = '0']) | (//*[@text='Action et Quantité' and @index = '0'])")
	
	private MobileElement lblActionQuantity;
	
	@iOSFindBy(xpath = "//*[@text='Action & Quantity']") 
	@AndroidFindBy(xpath = "(//*[@text='Action & Quantity' and @index = '0']/following-sibling::*[1]) | (//*[@text='Action et Quantité' and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblActionQuantityValue;
	
	@iOSFindBy(xpath = "//*[@text='Quantity Filled']") 
	@AndroidFindBy(xpath = "(//*[@text='Quantity Filled' and @index = '0']) | (//*[@text='Quantité exécutée' and @index = '0'])")
	
	private MobileElement lblQuantityFilled;
	
	@iOSFindBy(xpath = "//*[@text='Quantity Filled']") 
	@AndroidFindBy(xpath = "(//*[@text='Quantity Filled' and @index = '0']/following-sibling::*[1]) | (//*[@text='Quantité exécutée' and @index = '0']/following-sibling::*[1]) ")
	
	private MobileElement lblQuantityFilledValue;
	
	@iOSFindBy(xpath = "//*[@text='Confirmation Number']") 
	@AndroidFindBy(xpath = "(//*[@text='Confirmation Number' and @index = '0']) | (//*[@text='Numéro de confirmation' and @index = '0'])")
	
	private MobileElement lblConfirmationNumber;
	
	@iOSFindBy(xpath = "//*[@text='Confirmation Number']") 
	@AndroidFindBy(xpath = "(//*[@text='Confirmation Number' and @index = '0']/following-sibling::*[1]) | (//*[@text='Numéro de confirmation' and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblConfirmationNumberValue;
	
	@iOSFindBy(xpath = "//*[@text='Cancel Order']") 
	@AndroidFindBy(xpath = "(//*[@text='Cancel Order' and @index = '0']) | (//*[@text='Annuler l’ordre' and @index = '0'])")
	
	private MobileElement btnCancelOrder;
	
	@iOSFindBy(xpath = "//*[@text='Order Status']") 
	@AndroidFindBy(xpath = "(//*[@text='Order Status' and @index = '0']) | (//*[@text='État de l'ordre' and @index = '0'])")
	
	private MobileElement lblOrderStatus;
	
	@iOSFindBy(xpath = "//*[@text='Order Status']") 
	@AndroidFindBy(xpath = "(//*[@text='Order Status' and @index = '0']/following-sibling::*[1]) | (//*[@text='État de l'ordre' and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblOrderStatusValue;
	
	@iOSFindBy(xpath = "//*[@text='Account']") 
	@AndroidFindBy(xpath = "(//*[@text='Account' and @index = '0']) | (//*[@text='Compte' and @index = '0'])")
	
	private MobileElement lblAccount;
	
	@iOSFindBy(xpath = "//*[@text='Account']") 
	@AndroidFindBy(xpath = "(//*[@text='Account' and @index = '0']/following-sibling::*[1]) | (//*[@text='Compte' and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblAccountType;
	
	@iOSFindBy(xpath = "//*[@text='Account']") 
	@AndroidFindBy(xpath = "(//*[@text='Account' and @index = '0']/following-sibling::*[2]) | (//*[@text='Compte' and @index = '0']/following-sibling::*[2])")
	
	private MobileElement lblAccountNumber;
	
	//Receipt screen objects
	
	@iOSFindBy(xpath = "//*[@text='Thank you!']") 
	@AndroidFindBy(xpath = "(//*[@text='Thank you!' and @index = '0']) | (//*[@text='Merci!' and @index = '0'])")	
	
	private MobileElement lblThankYou;
	
	@iOSFindBy(xpath = "//*[@text='1st Leg Confirmation # : ']") 
	@AndroidFindBy(xpath = "(//*[@text='1st Leg Confirmation # : ' and @index = '0']) | (//*[@text='1re Volet Confirmation # : ' and @index = '0'])")	
	
	private MobileElement lblFirstLegConfirmation;
	
	@iOSFindBy(xpath = "//*[@text='2nd Leg Confirmation # : ']") 
	@AndroidFindBy(xpath = "(//*[@text='2nd Leg Confirmation # : ' and @index = '0']) | (//*[@text='2re Volet Confirmation # : ' and @index = '0'])")
	
	private MobileElement lblSecondLegConfirmation;
	
	@iOSFindBy(xpath = "//*[@text='Order Placed']") 
	@AndroidFindBy(xpath = "(//*[@text='Order Placed' and @index = '0']) | (//*[@text='Ordre passé le' and @index = '0']) ")
	
	private MobileElement lblOrderPlaced;
	
	@iOSFindBy(xpath = "//*[@text='Order sent successfully']") 
	@AndroidFindBy(xpath = "(//*[@text='Order sent successfully' and @index = '1']) | (//*[@text='	Ordre transmis avec succès.' and @index = '1'])")
	
	private MobileElement lblOrderSentMsg;
	
	@iOSFindBy(xpath = "//*[@text='Order Placed']") 
	@AndroidFindBy(xpath = "(//*[@text='Order Placed' and @index = '0']/../following-sibling::*[1]/*[1]) | (//*[@text='Order Placed' and @index = '0']/../following-sibling::*[1]/*[1])")
	
	private MobileElement lblOrderPlacedDate_Receipt;
	
	@iOSFindBy(xpath = "//*[@text='Order Placed']") 
	@AndroidFindBy(xpath = "(//*[@text='Order Placed' and @index = '0']/../following-sibling::*[1]/*[2]) | (//*[@text='Order Placed' and @index = '0']/../following-sibling::*[1]/*[2])")
	
	private MobileElement lblOrderPlacedTime_Receipt;
	
	@iOSFindBy(xpath = "//*[@text='1st Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='1st Leg' and @index = '0']) | (//*[@text='1re Volet' and @index = '0'])")
	
	private MobileElement lblFirstLeg_Receipt;
	
	@iOSFindBy(xpath = "//*[@text='1st Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='1st Leg' and @index = '0']../following-sibling::*[1]/*[1]) | (//*[@text='1re Volet' and @index = '0']../following-sibling::*[1]/*[1])")
	
	private MobileElement lblFirstLegValue_Receipt;
	
	@iOSFindBy(xpath = "//*[@text='2nd Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='2nd Leg' and @index = '0']) | (//*[@text='2e Volet' and @index = '0'])")
	
	private MobileElement lblSecondLeg_Receipt;
	
	@iOSFindBy(xpath = "//*[@text='2nd Leg']") 
	@AndroidFindBy(xpath = "(//*[@text='2nd Leg' and @index = '0']../following-sibling::*[1]/*[1]) | (//*[@text='2e Volet' and @index = '0']../following-sibling::*[1]/*[1])")
	
	private MobileElement lblSecondLegValue_Receipt;
	
	@iOSFindBy(xpath = "//*[@text='Price']") 
	@AndroidFindBy(xpath = "(//*[@text='Price' and @index = '0']) | (//*[@text='Cours' and @index = '0'])")
	
	private MobileElement lblPrice_Receipt;
	
	@iOSFindBy(xpath = "//*[@text='Price']") 
	@AndroidFindBy(xpath = "(//*[@text='Price' and @index = '0']/following-sibling::*[1]) | (//*[@text='Cours' and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblPriceValue_Receipt;
	
	@iOSFindBy(xpath = "//*[contains(@text,'Good')]") 
	@AndroidFindBy(xpath = "(//*[contains(@text,'Good') and @index = '0']) | (//*[contains(@text,'Échéance') and @index = '0'])")
	
	private MobileElement lblGoodTil_Receipt;
	
	@iOSFindBy(xpath = "//*[contains(@text,'Good')]") 
	@AndroidFindBy(xpath = "(//*[contains(@text,'Good') and @index = '0']/following-sibling::*[1]) | (//*[contains(@text,'Échéance') and @index = '0']/following-sibling::*[1])")
	
	private MobileElement lblGoodTilValue_Receipt;
	
	
	//Orders Tab objects
	@iOSFindBy(xpath = "//*[contains(@text,'Multi-Leg')]") 
	@AndroidFindBy(xpath = "(//*[contains(@text,'Multi-Leg') and @index = '1']) | (//*[contains(@text,'Multi-Leg') and @index = '1'])")
	
	private MobileElement lnk_OrdersMultiLeg;
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)),
				this);
	}
	public void tapSymbol()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(symboltext, "Symbol Text");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try
		{
			mobileAction.FuncClick(searchsymbol, "Symbol Search Bar");
			mobileAction.FuncSendKeys(searchsymbol, "TD");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try
		{
			mobileAction.FuncClick(firstsymbolUS, "Symbol");			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void selectLeg1ActionBuy()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(leg1action, "Leg 1 Action");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try
		{
			mobileAction.FuncClick(actionbuy, "Action - Buy");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public void enterLeg1Quantity()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(leg1quantity, "Leg 1 Quantity");
			mobileAction.FuncSendKeys("1");
		}		
		
		catch(Exception e){
			e.printStackTrace();
		}	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			mobileAction.FuncHideKeyboard();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	public void enterLeg2Quantity()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(leg2quantity, "Leg 2 Quantity");
			mobileAction.FuncSendKeys("1");
		}		
		
		catch(Exception e){
			e.printStackTrace();
		}	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*try {
			mobileAction.FuncHideKeyboard();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	}
	
	
	public void swipeDown()
	{
		
		mobileAction.FuncSwipeOnce("up");
	}
	
	public void selectOptionLeg()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(leg2option, "Option Leg");
			mobileAction.FuncClick(leg2option, "Option Leg");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public void selectFirstCallOption()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(leg2optioncall, "Option Call");
			mobileAction.FuncClick(btncontinue, "Continue Button");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public void selectLeg2ActionBuytoOpen()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(leg2action, "Leg 2 Action");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try
		{
			mobileAction.FuncClick(actionbuytoopen, "Action - Buy to Open");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	//Selects Price Type Net Debit from the list of Price types
	public void selectPriceNetDebit()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(price, "Price");
			mobileAction.FuncClick(price, "Price");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try
		{
			mobileAction.FuncClick(priceNetDebit, "Price Type - Net Debit");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	//Selects Price Type Net Credit from the list of Price types
	public void selectPriceNetCredit()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(price, "Price");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try
		{
			mobileAction.FuncClick(priceNetCredit, "Price Type - Net Credit");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	//Selects Price Type Market from the list of Price types
	public void selectPriceMarket()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(price, "Price");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try
		{
			mobileAction.FuncClick(priceMarket, "Price Type - Market");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	//Selects Price Type Even from the list of Price types
	public void selectPriceEven()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(price, "Price");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try
		{
			mobileAction.FuncClick(priceMarket, "Price Type - Even");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public void enterLimitPrice()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(limitprice, "Limit Price for Stock Option Leg");
			mobileAction.FuncSendKeys(limitprice, "10");
		}
		catch(Exception e){
			e.printStackTrace();
		}	
		try {
			mobileAction.FuncHideKeyboard();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Selects the Shareholder Type if the Shareholder field is present
	public void enterShareholderType()
	{
		Decorator();
		
		if (mobileAction.isObjExists(shareholdertype)) {
			
			try
			{  
				mobileAction.FuncClick(shareholdertype, "Shareholder Type");
				this.shareholderFlag = true;				
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			try
			{  
				mobileAction.FuncClick(shareholderNeither, "Shareholder Type - Neither");
				
			}
			catch(Exception e){
				e.printStackTrace();
			}	
		} 	
	}
	
	//Enters Password if prompted
	public void enterPassword()
	{
		Decorator();
		
		if (mobileAction.isObjExists(passwordtext)) {
			
			try
			{  
				mobileAction.FuncClick(password, "Trading Password");
				mobileAction.FuncSendKeys(passwordtext, "1234");
				
			}
			catch(Exception e){
				e.printStackTrace();
			}	
			try {
				mobileAction.FuncHideKeyboard();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 	
	}
	
	//Taps on the Preview Order button
	public void tapPreviewOrder()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(previeworder, "Preview Order");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	//Taps on the Agree button
	public void tapAgree()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(agree, "Pop-up Agree button");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	//Verifies the content of the Confirm Order screen for a Multi-leg Stock/Option order
	
	public void verifyConfirmOrder_ENG() 
	{
		Decorator();
		
		String firstLegDetail = getTestdata("Leg1Action", "UserIDs");
		String firstLegQuantity = getTestdata("Quantity", "UserIDs");
		String secondLegDetail = getTestdata("Leg2Action", "UserIDs");
		String secondLegQuantity = getTestdata("Quantity", "UserIDs");
		String symbol = getTestdata("Symbol", "UserIDs");	
		String priceType = getTestdata("Price", "UserIDs");
		String limitpriceAmt = getTestdata("LimitPrice", "UserIDs");
		String goodtil = getTestdata("Good'til", "UserIDs");
		String shareholderType = getTestdata("ShareHolder", "UserIDs");
		
		String accountNumber = mobileAction.getText(lblAccountNumber);
		
		NumberFormat numberFormatUS = NumberFormat.getNumberInstance(Locale.US);
		NumberFormat numberFormatFR = NumberFormat.getNumberInstance(Locale.FRANCE);
		Locale localeEng = new Locale("en", "US");
		NumberFormat fmtEng = NumberFormat.getCurrencyInstance(localeEng);
		
		Locale localeFr = new Locale("en", "FRANCE");
		NumberFormat fmtFr = NumberFormat.getCurrencyInstance(localeFr);
		
				
		int leg1qty = Integer.parseInt(firstLegQuantity);	  	
	    String leg1qty_ENG = numberFormatUS.format(leg1qty);
	    //System.out.println ("The quantity in English format is " + qty_ENG);
	    //String leg1qty_FRE = numberFormatFR.format(leg1qty);
	    //System.out.println ("The quantity in French format is " + qty_FRE);
	    
	    int leg2qty = Integer.parseInt(secondLegQuantity);	  	
	    String leg2qty_ENG = numberFormatUS.format(leg2qty);
	    //System.out.println ("The quantity in English format is " + qty_ENG);
	    //String leg2qty_FRE = numberFormatFR.format(leg2qty);
	    //System.out.println ("The quantity in French format is " + qty_FRE);
	    
	    double price = Double.parseDouble(limitpriceAmt);
	    String price_ENG = fmtEng.format(price);
	    //String price_FRE = fmtFr.format(price);
	    
		try {
			if (mobileAction.isObjExists(lblFirstLeg) && (mobileAction.getText(lblFirstLegValue).contains(firstLegDetail+" "+leg1qty_ENG + " " + symbol.toUpperCase()))) {			
				CL.GetReporting().FuncReport("Pass","1st Leg order details match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","1st Leg order details DON'T match!!" );
			}	
			
			if (mobileAction.isObjExists(lblSecondLeg) && (mobileAction.getText(lblSecondLegValue).contains(secondLegDetail+" "+leg2qty_ENG + " " + symbol.toUpperCase()))) {			
				CL.GetReporting().FuncReport("Pass","2nd Leg order details match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","2nd Leg order details DON'T match!!" );
			}	
			
			if (mobileAction.isObjExists(lblPrice) && (mobileAction.getText(lblPriceValue).matches(priceType + price_ENG))) {			
				CL.GetReporting().FuncReport("Pass","Price details match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","Price details DON'T match!!" );
			}	
			
			if (mobileAction.isObjExists(lblGoodTil) && (mobileAction.getText(lblGoodTilValue).matches(goodtil))) {			
				CL.GetReporting().FuncReport("Pass","Good Til details match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","Good Til details DON'T match!!" );
			}	
			
			if (mobileAction.isObjExists(lblEstimatedPrincipal) && (mobileAction.isObjExists(lblCommission)) && (mobileAction.isObjExists(lblEstimatedTotal))) {			
				CL.GetReporting().FuncReport("Pass","Labels - Estimated Principal, Commission and Estimated Total match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","Labels - Estimated Principal, Commission and Estimated Total DON'T match!!" );
			}	
			
			if (this.shareholderFlag)
				if (mobileAction.isObjExists(lblShareholderType) && (mobileAction.getText(lblShareholderTypeValue).matches(shareholderType))) {
					CL.GetReporting().FuncReport("Pass","Shareholder Type exists and matches the details on the Confirm page");
				} else { CL.GetReporting().FuncReport("Fail","Shareholder Type DOESN'T exist or not matches the details on the Confirm page"); }
			else
				if (mobileAction.isObjExists(lblShareholderType)) {
					CL.GetReporting().FuncReport("Fail","Shareholder Type exists on the Confirm page - FALSE POSITIVE");
				} else { CL.GetReporting().FuncReport("Pass","Shareholder Type DOESN'T exist on the Confirm page - That's Good"); }
			
			if (accountNumber.matches(".*E$") | accountNumber.matches(".*F$") | accountNumber.matches(".*G$") | accountNumber.matches(".*H$") )
				if (mobileAction.isObjExists(lblBuyingPower)) {
					CL.GetReporting().FuncReport("Pass","Buying Power exists on the Confirm page");
				} else { CL.GetReporting().FuncReport("Fail","Buying Power DOESN'T exist on the Confirm page"); }
			else
				if (mobileAction.isObjExists(lblBuyingPower)) {
					CL.GetReporting().FuncReport("Fail","Buying Power exists on the Confirm page - FALSE POSITIVE");
				} else { CL.GetReporting().FuncReport("Pass","Buying Power DOESN'T exist on the Confirm page - That's Good"); }
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	
	
	public void verifyConfirmOrder_FR() 
	{
		Decorator();
		
		String firstLegDetail = getTestdata("Leg1Action", "UserIDs");
		String firstLegQuantity = getTestdata("Quantity", "UserIDs");
		String secondLegDetail = getTestdata("Leg2Action", "UserIDs");
		String secondLegQuantity = getTestdata("Quantity", "UserIDs");
		String symbol = getTestdata("Symbol", "UserIDs");	
		String priceType = getTestdata("Price", "UserIDs");
		String limitpriceAmt = getTestdata("LimitPrice", "UserIDs");
		String goodtil = getTestdata("Good'til", "UserIDs");
		String shareholderType = getTestdata("ShareHolder", "UserIDs");
		
		String accountNumber = mobileAction.getText(lblAccountNumber);
		
		NumberFormat numberFormatUS = NumberFormat.getNumberInstance(Locale.US);
		NumberFormat numberFormatFR = NumberFormat.getNumberInstance(Locale.FRANCE);
		Locale localeEng = new Locale("en", "US");
		NumberFormat fmtEng = NumberFormat.getCurrencyInstance(localeEng);
		
		Locale localeFr = new Locale("en", "FRANCE");
		NumberFormat fmtFr = NumberFormat.getCurrencyInstance(localeFr);
		
				
		int leg1qty = Integer.parseInt(firstLegQuantity);	  	
	    String leg1qty_ENG = numberFormatUS.format(leg1qty);
	    //System.out.println ("The quantity in English format is " + qty_ENG);
	    String leg1qty_FRE = numberFormatFR.format(leg1qty);
	    //System.out.println ("The quantity in French format is " + qty_FRE);
	    
	    int leg2qty = Integer.parseInt(secondLegQuantity);	  	
	    String leg2qty_ENG = numberFormatUS.format(leg2qty);
	    //System.out.println ("The quantity in English format is " + qty_ENG);
	    String leg2qty_FRE = numberFormatFR.format(leg2qty);
	    //System.out.println ("The quantity in French format is " + qty_FRE);
	    
	    double price = Double.parseDouble(limitpriceAmt);
	    String price_ENG = fmtEng.format(price);
	    String price_FRE = fmtFr.format(price);
	    
		try {
			if (mobileAction.isObjExists(lblFirstLeg) && (mobileAction.getText(lblFirstLegValue).contains(firstLegDetail+" "+leg1qty_FRE + " " + symbol.toUpperCase()))) {			
				CL.GetReporting().FuncReport("Pass","1st Leg order details match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","1st Leg order details DON'T match!!" );
			}	
			
			if (mobileAction.isObjExists(lblSecondLeg) && (mobileAction.getText(lblSecondLegValue).contains(secondLegDetail+" "+leg2qty_FRE + " " + symbol.toUpperCase()))) {			
				CL.GetReporting().FuncReport("Pass","2nd Leg order details match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","2nd Leg order details DON'T match!!" );
			}	
			
			if (mobileAction.isObjExists(lblPrice) && (mobileAction.getText(lblPriceValue).matches(priceType + price_FRE))) {			
				CL.GetReporting().FuncReport("Pass","Price details match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","Price details DON'T match!!" );
			}	
			
			if (mobileAction.isObjExists(lblGoodTil) && (mobileAction.getText(lblGoodTilValue).matches(goodtil))) {			
				CL.GetReporting().FuncReport("Pass","Good Til details match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","Good Til details DON'T match!!" );
			}	
			
			if (mobileAction.isObjExists(lblEstimatedPrincipal) && (mobileAction.isObjExists(lblCommission)) && (mobileAction.isObjExists(lblEstimatedTotal))) {			
				CL.GetReporting().FuncReport("Pass","Labels - Estimated Principal, Commission and Estimated Total match!!" );
			} else {
				CL.GetReporting().FuncReport("Fail","Labels - Estimated Principal, Commission and Estimated Total DON'T match!!" );
			}	
			
			if (this.shareholderFlag)
				if (mobileAction.isObjExists(lblShareholderType) && (mobileAction.getText(lblShareholderTypeValue).matches(shareholderType))) {
					CL.GetReporting().FuncReport("Pass","Shareholder Type exists and matches the details on the Confirm page");
				} else { CL.GetReporting().FuncReport("Fail","Shareholder Type DOESN'T exist or not matches the details on the Confirm page"); }
			else
				if (mobileAction.isObjExists(lblShareholderType)) {
					CL.GetReporting().FuncReport("Fail","Shareholder Type exists on the Confirm page - FALSE POSITIVE");
				} else { CL.GetReporting().FuncReport("Pass","Shareholder Type DOESN'T exist on the Confirm page - That's Good"); }
			
			if (accountNumber.matches(".*E$") | accountNumber.matches(".*F$") | accountNumber.matches(".*G$") | accountNumber.matches(".*H$") )
				if (mobileAction.isObjExists(lblBuyingPower)) {
					CL.GetReporting().FuncReport("Pass","Buying Power exists on the Confirm page");
				} else { CL.GetReporting().FuncReport("Fail","Buying Power DOESN'T exist on the Confirm page"); }
			else
				if (mobileAction.isObjExists(lblBuyingPower)) {
					CL.GetReporting().FuncReport("Fail","Buying Power exists on the Confirm page - FALSE POSITIVE");
				} else { CL.GetReporting().FuncReport("Pass","Buying Power DOESN'T exist on the Confirm page - That's Good"); }
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	//Taps on the button Send Order
	public void tapSendOrder()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(btnSendOrder, "Send Order button");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	//Taps on the button Cancel Order
	public void tapCancelOrder()
	{
		Decorator();
		try
		{
			mobileAction.FuncClick(btnCancelOrder, "Cancel Order button");
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}
	
	public void verifyReceiptScreen() 
	{
		Decorator();
		
		String firstLegDetail = getTestdata("Action", "UserIDs");
		String secondLegDetail = getTestdata("Action1", "UserIDs");
		String accountNumber = mobileAction.getText(lblAccountNumber);
		
		String tradeDate = mobileAction.getText(lblOrderPlacedDate_Receipt);
	  	DateFormat dateFormatEng = new SimpleDateFormat("MMM dd, yyyy");
	  	DateFormat dateFormatFrench = new SimpleDateFormat("MMM dd, yyyy",Locale.FRANCE);
		try{
			if ( mobileAction.isObjExists(lblOrderPlaced) && mobileAction.isObjExists(lblAccount)
				&& 	mobileAction.isObjExists(lblFirstLeg_Receipt) && mobileAction.isObjExists(lblSecondLeg_Receipt)
				&& 	mobileAction.isObjExists(lblPrice_Receipt) && mobileAction.isObjExists(lblGoodTil_Receipt)) {			
				CL.GetReporting().FuncReport("Pass", "All labels are found" );
			} else {
				CL.GetReporting().FuncReport("Fail", "Some labels are missing" );
			}
		} catch(Exception e)
		{			 
			e.printStackTrace();
		}
		
		
		
		
		
		if (mobileAction.isObjExists(lblSecondLeg) && (mobileAction.getText(lblSecondLegValue).matches(secondLegDetail))) {			
			System.out.println("2nd Leg order details match");
		} else {
			System.out.println("2nd Leg order details DON'T match!!");
		}		
		
		if (mobileAction.isObjExists(lblPrice) && (mobileAction.getText(lblPriceValue).matches(secondLegDetail))) {			
			System.out.println("Price details match");
		} else {
			System.out.println("Price details DON'T match!!");
		}	
		
		if (mobileAction.isObjExists(lblGoodTil) && (mobileAction.getText(lblGoodTilValue).matches(secondLegDetail))) {			
			System.out.println("Good til details match");
		} else {
			System.out.println("Good til details DON'T match!!");
		}	
		
		if (mobileAction.isObjExists(lblEstimatedPrincipal) && (mobileAction.isObjExists(lblCommission)) && (mobileAction.isObjExists(lblEstimatedTotal))) {			
			System.out.println("Labels match");
		} else {
			System.out.println("Labels DON'T match!!");
		}	
		
		if (this.shareholderFlag)
			if (mobileAction.isObjExists(lblShareholderType)) {
				System.out.println("Shareholder Type exists on the Confirm page");
			} else { System.out.println("Shareholder Type DOESN'T exist on the Confirm page"); }
		else
			if (mobileAction.isObjExists(lblShareholderType)) {
				System.out.println("Shareholder Type exists on the Confirm page - FALSE POSITIVE");
			} else { System.out.println("Shareholder Type DOESN'T exist on the Confirm page"); }
		
		if (accountNumber.matches(".*E$") | accountNumber.matches(".*F$") | accountNumber.matches(".*G$") | accountNumber.matches(".*H$") )
			if (mobileAction.isObjExists(lblBuyingPower)) {
				System.out.println("Buying Power exists on the Confirm page");
			} else { System.out.println("Buying Power DOESN'T exist on the Confirm page"); }
		try {
			CL.GetReporting().FuncReport("Fail", "abc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
}	
	
	
