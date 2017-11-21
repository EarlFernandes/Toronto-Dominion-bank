package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.StringUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSHQuickLinks extends _CommonPage {

	private static MIT_DSHQuickLinks MIT_DSHQuickLinks;

	public synchronized static MIT_DSHQuickLinks get() {
		if (MIT_DSHQuickLinks == null) {
			MIT_DSHQuickLinks = new MIT_DSHQuickLinks();
		}
		return MIT_DSHQuickLinks;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_HamburgerMenu;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@label='Password']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSFindBy(xpath = "//*[@label='Home' or @label='Accueil' or @label='主页' or @label='首頁']")
	@AndroidFindBy(xpath = "//*[@text='Home' or @text='Accueil' or @text='主页' or @text='首頁']")
	private MobileElement FLY_Home;

	@iOSFindBy(xpath = "//*[@label='My Accounts' or @label='Mes comptes' or @label='我的账户' or @label='我的賬戶']")
	@AndroidFindBy(xpath = "//*[@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶']")
	private MobileElement flyoutMyAccountLink;

	@iOSFindBy(xpath = "//*[@label='Investing Accounts' or @label='Comptes Placements directs TD' or @label='投资账户' or @label='投資賬戶']")
	@AndroidFindBy(xpath = "//*[(@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶') and @resource-id='com.td:id/textview_flyout_menu_item']")
	MobileElement InvestingAccount;

	@iOSFindBy(xpath = "//*[@label='SEND MONEY' or @label='ENVOI DE FONDS' or @label='汇款' or @label='匯款']")
	@AndroidFindBy(xpath = "//*[@text='SEND MONEY' or contains(@text,'ENVOI') or @text='汇款' or @text='匯款']")
	private MobileElement QL_SENDMONEY;

	@iOSFindBy(xpath = "//*[@label='TRANSFER' or @label='VIREMENT' or @label='转账' or @label='轉賬']")
	@AndroidFindBy(xpath = "//*[@text='TRANSFER' or @text='VIREMENT' or @text='转账' or @text='轉賬']")
	private MobileElement QL_TRANSFER;

	@AndroidFindBy(xpath = "//*[@text='PAY NOW' or @text='PAYER MAINTENANT' or @text='马上付款' or @text='即刻付款']")
	private MobileElement QL_PAYNOW;

	@iOSFindBy(xpath = "//*[@label='Apple Pay' or @label='APPLE PAY']") // French/CH_SM/CH_TD
																		// APPLE
																		// PAY
																		// ??
																		// Verify
																		// >>
																		// APPLE
																		// PAY
																		// is
																		// same
																		// for
																		// all
																		// <<
	private MobileElement QL_APPLEPAY;

	@iOSFindBy(xpath = "//*[@label='DEPOSIT' or @label='DÉPÔT' or @label='存款' or @label='存款']")
	@AndroidFindBy(xpath = "//*[@text='DEPOSIT' or @text='DÉPÔT' or @text='存款' or @text='存款']")
	private MobileElement QL_DEPOSIT;

	@iOSFindBy(xpath = "//*[@label='WATCHLISTS' or @label='LISTES DE SURVEILLANCE' or @label='自选股观察名单' or @label='自選股觀察名單']")
	@AndroidFindBy(xpath = "//*[@text='WATCHLISTS' or @text='LISTES DE SURVEILLANCE' or @text='自选股观察名单' or @text='自選股觀察名單']")
	private MobileElement QL_WATCHLISTS;

	@iOSFindBy(xpath = "//*[@label='QUOTE' or @label='COTE' or @label='报价' or @label='報價']")
	@AndroidFindBy(xpath = "//*[@text='QUOTE' or @text='COTE' or @text='报价' or @text='報價']")
	private MobileElement QL_QUOTE;

	@iOSFindBy(xpath = "//*[@label='PAY BILL' or @label='PAIEMENT DE FACTURES' or @label='支付账单' or @label='支付賬單']")
	@AndroidFindBy(xpath = "//*[@text='PAY BILL' or @text='PAIEMENT DE FACTURES' or @text='支付账单' or @text='支付賬單']")
	private MobileElement QL_PAY_BILL;

	@iOSFindBy(xpath = "//*[@label='TRADE' or @label='NÉGOCIATION' or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation' or @text='交易' or @text='交易']")
	private MobileElement QL_TRADE;

	@AndroidFindBy(xpath = "//*[@text='Mobile Payment' or @text='Paiement mobile' or @text='移动支付' or @text='流動付款']")
	private MobileElement HDR_MobilePayment;

	@iOSFindBy(xpath = "//*[@label='Apple Pay' or @label='Paiement mobile' or @label='移动支付' or @label='流動付款']")
	private MobileElement HDR_ApplePay;

	@iOSFindBy(xpath = "//*[@label='Pay Bill' or @label='Payer une facture' or @label='支付账单' or @label='支付賬單']")
	@AndroidFindBy(xpath = "//*[@text='Pay Bill' or @text='Payer une facture' or @text='支付账单' or @text='支付賬單']")
	private MobileElement HDR_PayBills;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation' or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[(@text='Trade' or @text='Négociation' or @text='Négociation' or @text='交易' or @label='交易') and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrTrade;

	@iOSFindBy(xpath = "//*[@label='Interac e-Transfer' or @label='Virement Interac' or @label='Interac E-TRANSFER' or @label='Interac e-Transfer']")
	@AndroidFindBy(xpath = "//*[@text='Interac e-Transfer' or @text='Virement Interac' or @text='Interac e-Transfer' or @text='Interac e-Transfer']")
	private MobileElement HDR_Interac_e_Transfer;

	@iOSFindBy(xpath = "//*[@label='Between My Accounts' or @label='Entre mes comptes' or @label='在我的账户间转账' or @label='在賬戶之間轉賬']")
	@AndroidFindBy(xpath = "//*[@text='Between My Accounts' or @text='Entre mes comptes' or @text='在我的账户间转账' or @text='我的賬戶之間']")
	private MobileElement HDR_Between_My_Accounts;

	@iOSFindBy(xpath = "//*[@label='Banking' or @label='Services bancaires' or @label='理财' or @label='理財']")
	@AndroidFindBy(xpath = "//*[@text='Banking' or @text='Services bancaires' or @text='理财' or @text='理財']")
	private MobileElement HDR_Banking;

	@iOSFindBy(xpath = "//*[@label='Mobile Deposit' or @label='Dépôt mobile' or @label='移动存款服务' or @label='流動存款']")
	@AndroidFindBy(xpath = "//*[@text='Mobile Deposit' or @text='Dépôt mobile' or @text='移动存款服务' or @text='流動存款']")
	private MobileElement HDR_Mobile_Deposit;

	@iOSFindBy(xpath = "//*[@label='Watchlists' or @label='Listes de surveillance' or @label='自选股观察名单' or @label='自選股觀察名單']")
	@AndroidFindBy(xpath = "//*[@text='Watchlists' or @text='Listes de surveillance' or @text='自选股观察名单' or @text='自選股觀察名單']")
	private MobileElement HDR_Watchlists;

	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[contains(@label,'Add symbol') or @label='Ajouter un symbole à la liste' or @label='将代号添加至自选股观察名单' or @label='新增代號至自選股觀察名單']")
	@AndroidFindBy(xpath = "//*[@text='Add symbol to watchlist' or @text='Ajouter un symbole à la liste' or @text='将代号添加至自选股观察名单' or @text='新增代號至自選股觀察名單']")
	private MobileElement ED_AddSymbolToWatchlist;

	private By ED_Quote_Search_Symbol = By.id("symbol-search");

	private By BTN_Back = By.xpath("//*[@class='sprite sprite-back']");

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter name or symbol' or @value='Entrez un nom ou un symbole' or @value='输入名称或代号' or @value='輸入名稱或代號']")
	private MobileElement ED_Quote_Search_Symbol_iOS;

	@iOSFindBy(xpath = "//XCUIElementTypeLink[@label='Back' or @label='Listes' or @label='自选股观察名单' or @label='自選股觀察名單']")
	private MobileElement LK_Back_QuoteSearchSymbolScreen;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel' or @label='Listes' or @label='自选股观察名单' or @label='自選股觀察名單']")
	private MobileElement BT_Cancel_QuoteSearchSymbolScreen;

	public void verifyQuickLinksUnAuthenicatedUser() {
		Decorator();
		try {

			/*
			 * String lang = (String) ((AppiumDriver)
			 * CL.GetDriver()).getCapabilities().getCapability( "language");
			 */
			verifyQL_SENDMONEY(false);

			verifyQL_TRANSFER(false);

			verifyQL_PAYNOW(false);

			verifyQL_APPLEPAY(false);

			verifyQL_DEPOSIT(false);

			verifyQL_WATCHLISTS(false);

			verifyQL_QUOTE(false);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQuickLinksBankingOnlyUser() {
		Decorator();
		try {

			verifyQL_SENDMONEY(true);

			verifyQL_TRANSFER(true);

			verifyQL_PAYNOW(true);

			verifyQL_APPLEPAY(true);

			verifyQL_DEPOSIT(true);

			verifyQL_PAY_BILL(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQuickLinksInvestingOnlyUser() {
		Decorator();
		try {

			verifyQL_TRANSFER(true);

			verifyQL_TRADE(true);

			verifyQL_WATCHLISTS(true);

			verifyQL_QUOTE(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQuickLinksBlendedUser() {
		Decorator();
		try {

			verifyQL_SENDMONEY(true);

			verifyQL_TRANSFER(true);

			verifyQL_PAYNOW(true);

			verifyQL_APPLEPAY(true);

			verifyQL_DEPOSIT(true);

			verifyQL_PAY_BILL(true);

			verifyQL_TRADE(true);

			verifyQL_WATCHLISTS(true);

			verifyQL_QUOTE(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickQuickLink(MobileElement mElement, String sDesc) {
		Decorator();
		try {
			// CL.getTestDataInstance().getMobileDeviceType();
			if (mobileAction.isObjExists(mElement)) {
				mobileAction.FuncClick(mElement, sDesc);
			} else {
				// mobileAction.FunctionSwipe("Left", 200, 100);
				mobileAction.SwipeQuickLinks(200, 100);
				mobileAction.FuncClick(mElement, sDesc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean verifyQuickLinkExists(MobileElement mElement, String sDesc) {
		Decorator();
		boolean bFlag = false;
		try {

			if (!mobileAction.isObjExists(mElement)) {
				// mobileAction.FunctionSwipe("Left", 200, 100);
				mobileAction.SwipeQuickLinks(200, 100);
				if (mobileAction.isObjExists(mElement))
					bFlag = true;
			} else
				bFlag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (bFlag) {
			try {
				CL.GetReporting().FuncReport("Pass", sDesc + " Quick Link is present.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				CL.GetReporting().FuncReport("Fail", sDesc + " Quick Link does not exist.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return bFlag;
	}

    public void goToDashboardHome() {
        Decorator();
        try {
        	Thread.sleep(1000);
               mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
               mobileAction.FuncClick(flyoutMyAccountLink, "My Accounts Flyout Menu");
               LoginMIT.get().MITLogin();
               if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
                      mobileAction.FuncClick(BT_HamburgerMenu, "BT_HamburgerMenu");
                      mobileAction.FuncClick(FLY_Home, "Home Flyout Menu");
               }
               else{
               mobileAction.FuncClick(BT_Back, "< Button");
               }
        } catch (Exception e) {
               e.printStackTrace();
        }

  }


    
    
    

	public void verifyQL_SENDMONEY(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			// System.out.println("hi");
			if (verifyQuickLinkExists(QL_SENDMONEY, "SEND MONEY")) {
				mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_SENDMONEY));

				clickQuickLink(QL_SENDMONEY, "SEND MONEY");
				if (!bIsAuthenticatedUser) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					mobileAction.verifyElementIsDisplayed(HDR_Interac_e_Transfer, "HDR_Interac_e_Transfer");
					mobileAction.FuncClick(BT_Back, "< Button");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_TRANSFER(boolean bIsAuthenticatedUser) {
		Decorator();
		String sUserType = getTestdata("UserRole", XLSheetUserIDs);
		try {
			if (verifyQuickLinkExists(QL_TRANSFER, "TRANSFER")) {
				mobileAction.FuncVerifyTextEquals(QL_TRANSFER,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRANSFER));

				clickQuickLink(QL_TRANSFER, "TRANSFER");
				if (!bIsAuthenticatedUser) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					if (sUserType.equalsIgnoreCase("Investing")) {
						mobileAction.verifyElementIsDisplayed(HDR_Banking, "HDR_Banking");
						mobileAction.FuncClick(BT_Back, "< Button");
					} else {
						mobileAction.verifyElementIsDisplayed(HDR_Between_My_Accounts, "HDR_Between_My_Accounts");
						mobileAction.FuncClick(BT_Back, "< Button");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_PAYNOW(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (verifyQuickLinkExists(QL_PAYNOW, "PAY NOW")) {
					mobileAction.FuncVerifyTextEquals(QL_PAYNOW,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_PAYNOW));

					clickQuickLink(QL_PAYNOW, "PAY NOW");
					mobileAction.verifyElementIsDisplayed(HDR_MobilePayment, "Header:Mobile Payment");
					mobileAction.FuncClick(BT_HamburgerMenu, "Hamburger Menu");
					mobileAction.FuncClick(FLY_Home, "Home Flyout Menu");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_APPLEPAY(boolean bIsAuthenticatedUser) {// FIX
		Decorator();
		try {
			if (!CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
					&& CL.getTestDataInstance().getMobileDeviceType().equalsIgnoreCase("Smartphone")) {

				if (verifyQuickLinkExists(QL_APPLEPAY, "APPLE PAY")) {
					mobileAction.FuncVerifyTextEquals(QL_APPLEPAY,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_APPLEPAY));

					clickQuickLink(QL_APPLEPAY, "APPLE PAY");
					mobileAction.verifyElementIsDisplayed(HDR_ApplePay, "HDR_Apple Pay");
					mobileAction.FuncClick(BT_Back, "< Button");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_DEPOSIT(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_DEPOSIT, "DEPOSIT")) {
				mobileAction.FuncVerifyTextEquals(QL_DEPOSIT,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_DEPOSIT));

				clickQuickLink(QL_DEPOSIT, "DEPOSIT");
				if (!bIsAuthenticatedUser) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					mobileAction.verifyElementIsDisplayed(HDR_Mobile_Deposit, "HDR_Mobile_Deposit");
					mobileAction.FuncClick(BT_HamburgerMenu, "Hamburger Menu");
					mobileAction.FuncClick(FLY_Home, "Home Flyout Menu");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_WATCHLISTS(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_WATCHLISTS, "WATCHLISTS")) {
				mobileAction.FuncVerifyTextEquals(QL_WATCHLISTS,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_WATCHLISTS));

				clickQuickLink(QL_WATCHLISTS, "WATCHLISTS");
				if (!bIsAuthenticatedUser) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					if (mobileAction.isObjExists(HDR_Watchlists)) {
						mobileAction.verifyElementIsDisplayed(HDR_Watchlists, "HDR_Watchlists");
						mobileAction.FuncClick(BT_Back, "< Button");
					} else {
						mobileAction.verifyElementIsDisplayed(ED_AddSymbolToWatchlist, "ED_AddSymbolToWatchlist");
						mobileAction.FuncClick(BT_Back, "< Button");
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_QUOTE(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_QUOTE, "QUOTE")) {
				mobileAction.FuncVerifyTextEquals(QL_QUOTE,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_QUOTE));

				clickQuickLink(QL_QUOTE, "QUOTE");

				Thread.sleep(10000);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					// Quote page WEBVIEW
					MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());
					mobileAction.verifyElementIsDisplayed(getMobileElement(ED_Quote_Search_Symbol),
							"ED_Quote_Search_Symbol");
					// Thread.sleep(10000);
					mobileAction.FuncClick(getMobileElement(BTN_Back), "BTN_Back");
					MIT_PNSAccessAlerts.get().FuncSwitchContext("NATIVE_APP");
				} else {
					mobileAction.verifyElementIsDisplayed(ED_Quote_Search_Symbol_iOS, "ED_Quote_Search_Symbol_iOS");
					mobileAction.FuncClick(BT_Cancel_QuoteSearchSymbolScreen, "BT_Cancel_QuoteSearchSymbolScreen");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_PAY_BILL(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_PAY_BILL, "PAY BILL")) {
				mobileAction.FuncVerifyTextEquals(QL_PAY_BILL,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_PAYBILL));

				clickQuickLink(QL_PAY_BILL, "PAY BILL");
				mobileAction.verifyElementIsDisplayed(HDR_PayBills, "Header: Pay Bills"); // FIX
																							// -
																							// Android
																							// &
																							// iOS
																							// has
																							// different
																							// header
				mobileAction.FuncClick(BT_Back, "< Button");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_TRADE(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_TRADE, "TRADE")) {
				mobileAction.FuncVerifyTextEquals(QL_TRADE,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRADE));

				clickQuickLink(QL_TRADE, "TRADE");
				mobileAction.verifyElementIsDisplayed(hdrTrade, "Header: Trade");
				mobileAction.FuncClick(BT_Back, "< Button");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MobileElement getMobileElement(By element) {
		try {
			return (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(element);
		} catch (Exception e) {
			return null;
		}
	}

}
