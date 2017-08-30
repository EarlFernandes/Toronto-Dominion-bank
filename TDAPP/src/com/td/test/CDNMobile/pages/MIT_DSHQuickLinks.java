package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

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

	@iOSFindBy(xpath = "//*[contains(@label,'Menu')]")
	@AndroidFindBy(id = "android:id/up")
	MobileElement MenuUp;

	@iOSFindBy(xpath = "//*[contains(@label,'Menu')]")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@label='Password']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/navText' and (@text='Home' or @text='Accueil' or @text='主页' or @text='首頁')]")
	private MobileElement FLY_Home;

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@text='SEND MONEY' or @text='ENVOI DE FONDS' or @text='汇款' or @text='匯款']")
	private MobileElement QL_SENDMONEY;

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@text='TRANSFER' or @text='VIREMENTS' or @text='转账' or @text='轉賬']")
	private MobileElement QL_TRANSFER;

	@AndroidFindBy(xpath = "//*[@text='PAY NOW' or @text='PAYER MAINTENANT' or @text='马上付款' or @text='即刻付款']") // FIX
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

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@text='DEPOSIT' or @text='DÉPÔT' or @text='存款' or @text='存款']")
	private MobileElement QL_DEPOSIT;

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@text='WATCHLISTS' or @text='LISTES DE SURVEILLANCE' or @text='自选股观察名单' or @text='自選股觀察名單']")
	private MobileElement QL_WATCHLISTS;

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@text='QUOTE' or @text='Cote' or @text='报价' or @text='報價']")
	private MobileElement QL_QUOTE;

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@text='PAY BILL' or @text='PAIEMENT DE FACTURES' or @text='支付账单' or @text='支付賬單']")
	private MobileElement QL_PAY_BILL;

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation' or @text='交易' or @text='交易']")
	private MobileElement QL_TRADE;

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@text='Mobile Payment' or @text='Paiement mobile' or @text='移动支付' or @text='流動付款']")
	private MobileElement HDR_MobilePayment;

	@iOSFindBy(xpath = "//*[@name='ACTION_CELL_0']/*[2]")
	@AndroidFindBy(xpath = "//*[@text='Pay Bills' or @text='Payer les factures' or @text='支付帐单' or @text='支付帳單']")
	private MobileElement HDR_PayBills;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//*[(@text='Trade' or @text='Négociation') and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrTrade;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//*[@text='Interac e-Transfer' or @text='Virement Interac' or @text='互联电子转帐' or @text='互聯電子轉帳']")
	private MobileElement HDR_Interac_e_Transfer;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//*[@text='Between My Accounts' or @text='Entre mes comptes' or @text='互联电子转帐' or @text='互聯電子轉帳']")
	private MobileElement HDR_Between_My_Accounts;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//*[@text='Mobile Deposit' or @text='Dépôt mobile' or @text='移动存款' or @text='移動存款']")
	private MobileElement HDR_Mobile_Deposit;

	private By ED_Quote_Search_Symbol = By.id("symbol-search");

	private By BTN_Back = By.xpath("//*[@class='sprite sprite-back']");

	public void verifyQuickLinksUnAuthenicatedUser() {
		Decorator();
		try {
			String[] arrQuickLinks = getTestdata("QuickLinks", XLSheetUserIDs).split(";");
			for (String sQuickLink : arrQuickLinks) {
				switch (sQuickLink) {
				case "SEND MONEY":
					/*
					 * String lang = (String) ((AppiumDriver)
					 * CL.GetDriver()).getCapabilities().getCapability(
					 * "language");
					 */
					verifyQL_SENDMONEY(false);
					break;

				case "TRANSFER":
					verifyQL_TRANSFER(false);
					break;

				case "PAY NOW":
					verifyQL_PAYNOW(false);
					break;

				case "APPLE PAY":
					verifyQL_APPLEPAY(false);
					break;

				case "DEPOSIT":
					verifyQL_DEPOSIT(false);
					break;

				case "WATCHLISTS":
					verifyQL_WATCHLISTS(false);
					break;

				case "QUOTE":
					verifyQL_QUOTE(false);
					break;

				default:
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQuickLinksBankingOnlyUser() {
		Decorator();
		try {

			String[] arrQuickLinks = getTestdata("QuickLinks", XLSheetUserIDs).split(";");
			for (String sQuickLink : arrQuickLinks) {
				switch (sQuickLink) {
				case "SEND MONEY":
					verifyQL_SENDMONEY(false);
					break;

				case "TRANSFER":
					verifyQL_TRANSFER(true);
					break;

				case "PAY NOW":
					verifyQL_PAYNOW(true);
					break;

				case "APPLE PAY":
					verifyQL_APPLEPAY(true);
					break;

				case "DEPOSIT":
					verifyQL_DEPOSIT(true);
					break;

				case "PAY BILL":
					verifyQL_PAY_BILL(true);
					break;

				default:
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQuickLinksInvestingOnlyUser() {
		Decorator();
		try {

			String[] arrQuickLinks = getTestdata("QuickLinks", XLSheetUserIDs).split(";");
			for (String sQuickLink : arrQuickLinks) {
				switch (sQuickLink) {

				case "TRANSFER":
					verifyQL_TRANSFER(true);
					break;

				case "TRADE":
					verifyQL_TRADE(true);
					break;

				case "WATCHLISTS":
					verifyQL_WATCHLISTS(true);
					break;

				case "QUOTE":
					verifyQL_QUOTE(true);
					break;
				default:
					break;
				}
			}

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
				mobileAction.FunctionSwipe("Left", 200, 100);
				mobileAction.FuncClick(mElement, sDesc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean verifyQuickLinkExists(MobileElement mElement) {
		Decorator();
		boolean bFlag = false;
		try {
			// CL.getTestDataInstance().getMobileDeviceType();
			if (!mobileAction.isObjExists(mElement)) {
				mobileAction.FunctionSwipe("Left", 200, 100);
				if (mobileAction.isObjExists(mElement))
					bFlag = true;
			} else
				bFlag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bFlag;

	}

	public void goToDashboardHome() {
		Decorator();
		try {
			mobileAction.FuncClick(BT_Back, "< Button");
			mobileAction.FuncClick(FLY_Home, "Home Flyout Menu");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyQL_SENDMONEY(boolean bIsAuthenticated) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_SENDMONEY)) {
				mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

				clickQuickLink(QL_SENDMONEY, "SEND MONEY");
				if (!bIsAuthenticated) {
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

	public void verifyQL_TRANSFER(boolean bIsAuthenticated) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_TRANSFER)) {
				mobileAction.FuncVerifyTextEquals(QL_TRANSFER,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TRANSFER));

				clickQuickLink(QL_TRANSFER, "TRANSFER");
				if (!bIsAuthenticated) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					mobileAction.verifyElementIsDisplayed(HDR_Between_My_Accounts, "HDR_Between_My_Accounts");
					mobileAction.FuncClick(BT_Back, "< Button");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_PAYNOW(boolean bIsAuthenticated) {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (verifyQuickLinkExists(QL_PAYNOW)) {
					mobileAction.FuncVerifyTextEquals(QL_PAYNOW,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_PAYNOW));

					clickQuickLink(QL_PAYNOW, "PAY NOW");
					mobileAction.verifyElementIsDisplayed(HDR_MobilePayment, "Header:Mobile Payment");
					mobileAction.FuncClick(MenuUp, "Hamburger Menu");
					mobileAction.FuncClick(FLY_Home, "Home Flyout Menu");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_APPLEPAY(boolean bIsAuthenticated) { // FIX
		Decorator();
		try {
			if (!CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				if (verifyQuickLinkExists(QL_APPLEPAY)) {
					mobileAction.FuncVerifyTextEquals(QL_APPLEPAY,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_APPLEPAY));

					clickQuickLink(QL_APPLEPAY, "APPLE PAY");
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_DEPOSIT(boolean bIsAuthenticated) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_DEPOSIT)) {
				mobileAction.FuncVerifyTextEquals(QL_DEPOSIT,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_DEPOSIT));

				clickQuickLink(QL_DEPOSIT, "DEPOSIT");
				if (!bIsAuthenticated) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					mobileAction.verifyElementIsDisplayed(HDR_Mobile_Deposit, "HDR_Mobile_Deposit");
					mobileAction.FuncClick(MenuUp, "Hamburger Menu");
					mobileAction.FuncClick(FLY_Home, "Home Flyout Menu");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_WATCHLISTS(boolean bIsAuthenticated) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_WATCHLISTS)) {
				mobileAction.FuncVerifyTextEquals(QL_WATCHLISTS,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_WATCHLISTS));

				clickQuickLink(QL_WATCHLISTS, "WATCHLISTS");
				mobileAction.verifyElementIsDisplayed(password, "Login Screen");
				mobileAction.FuncClick(BT_Back, "< Button");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_QUOTE(boolean bIsAuthenticated) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_QUOTE)) {
				mobileAction.FuncVerifyTextEquals(QL_QUOTE, getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUOTE));

				clickQuickLink(QL_QUOTE, "QUOTE");

				Thread.sleep(10000);

				// Quote page WEBVIEW
				MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());
				mobileAction.verifyElementIsDisplayed(getMobileElement(ED_Quote_Search_Symbol),
						"ED_Quote_Search_Symbol");
				Thread.sleep(10000);
				mobileAction.FuncClick(getMobileElement(BTN_Back), "BTN_Back");
				MIT_PNSAccessAlerts.get().FuncSwitchContext("NATIVE_APP");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_PAY_BILL(boolean bIsAuthenticated) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_PAY_BILL)) {
				mobileAction.FuncVerifyTextEquals(QL_PAY_BILL,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_PAYBILL));

				clickQuickLink(QL_PAY_BILL, "PAY BILL");
				mobileAction.verifyElementIsDisplayed(HDR_PayBills, "Header: Pay Bills");
				mobileAction.FuncClick(BT_Back, "< Button");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQL_TRADE(boolean bIsAuthenticated) {
		Decorator();
		try {
			if (verifyQuickLinkExists(QL_TRADE)) {
				mobileAction.FuncVerifyTextEquals(QL_TRADE, getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TRADE));

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
