package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class MIT_DSHNavRows extends _CommonPage {
	private static MIT_DSHNavRows MIT_DSHNavRows;

	public synchronized static MIT_DSHNavRows get() {
		if (MIT_DSHNavRows == null) {
			MIT_DSHNavRows = new MIT_DSHNavRows();
		}
		return MIT_DSHNavRows;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSXCUITFindBy(accessibility = "LOGIN_PASSWORD")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;

	@iOSFindBy(xpath = "//*[@label='Accounts' or @label='ENVOI DE FONDS' or @label='汇款' or @label='匯款']")
	@AndroidFindBy(xpath = "//*[@text='Accounts' or contains(@text,'ENVOI') or @text='汇款' or @text='匯款']")
	private MobileElement NR_Accounts;

	@iOSFindBy(xpath = "//*[@label='Transfers' or @label='Virements' or @label='账单' or @label='轉賬']")
	@AndroidFindBy(xpath = "//*[@text='Transfers' or @text='Virements' or @text='账单' or @text='轉賬']")
	private MobileElement NR_Transfers;

	@iOSFindBy(xpath = "//*[@label='Bills' or @label='Factures' or @label='账单' or @label='賬單']")
	@AndroidFindBy(xpath = "//*[@text='Bills' or @text='Factures' or @text='账单' or @text='賬單']")
	private MobileElement NR_Bills;

	@iOSFindBy(xpath = "//*[@label='Investing Accounts' or @label='Comptes Placements directs TD' or @label='投资账户' or @label='投資賬戶']")
	@AndroidFindBy(xpath = "//*[@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶']")
	private MobileElement NR_InvestingAccounts;

	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation' or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation' or @text='交易' or @text='交易']")
	private MobileElement NR_Trade;

	@iOSFindBy(xpath = "//*[@label='Markets' or @label='Marchés' or @label='市场' or @label='市場']")
	@AndroidFindBy(xpath = "//*[@text='Markets' or @text='Marchés' or @text='市场' or @text='市場']")
	private MobileElement NR_Markets;

	By ED_Markets_symbolSearch = By.id("symbol-search");

	private By BTN_Back = By.xpath("//*[@class='sprite sprite-back']");

	public void verifyNavRowsUnAuthenicatedUser() {
		Decorator();
		try {

			verifyNR_Accounts(false);

			verifyNR_Transfers(false);

			verifyNR_Bills(false);

			verifyNR_InvestingAccounts(false);

			verifyNR_Trade(false);

			verifyNR_Markets(false);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean verifyNavRowExists(MobileElement mElement, String sDesc) {
		Decorator();
		boolean bFlag = false;
		try {

			if (!mobileAction.isObjExists(mElement)) {
				mobileAction.FuncSwipeWhileElementNotFound(mElement, false, 4, "up");
				if (mobileAction.isObjExists(mElement))
					bFlag = true;
			} else
				bFlag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (bFlag) {
			try {
				CL.GetReporting().FuncReport("Pass", "<b>" + sDesc + "</b> Nav Row is present.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				CL.GetReporting().FuncReport("Fail", "<b>" + sDesc + "</b> Nav Row does not exist.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return bFlag;
	}

	public void clickNavRow(MobileElement mElement, String sDesc) {
		Decorator();
		try {
			if (mobileAction.isObjExists(mElement)) {
				mobileAction.FuncClick(mElement, sDesc);
			} else {
				mobileAction.FuncSwipeWhileElementNotFound(mElement, false, 4, "up");
				mobileAction.FuncClick(mElement, sDesc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNR_Accounts(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyNavRowExists(NR_Accounts, "Accounts")) {
				mobileAction.FuncVerifyTextEquals(NR_Accounts,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_ACCOUNTS));

				clickNavRow(NR_Accounts, "Accounts");
				if (!bIsAuthenticatedUser) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					// mobileAction.verifyElementIsDisplayed(HDR_Interac_e_Transfer,
					// "HDR_Interac_e_Transfer");
					// mobileAction.FuncClick(BT_Back, "< Button");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_Transfers(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyNavRowExists(NR_Transfers, "Transfers")) {
				mobileAction.FuncVerifyTextEquals(NR_Transfers,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_TRANSFERES));

				clickNavRow(NR_Transfers, "Transfers");
				if (!bIsAuthenticatedUser) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					// mobileAction.verifyElementIsDisplayed(HDR_Interac_e_Transfer,
					// "HDR_Interac_e_Transfer");
					// mobileAction.FuncClick(BT_Back, "< Button");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_Bills(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyNavRowExists(NR_Bills, "Bills")) {
				mobileAction.FuncVerifyTextEquals(NR_Bills,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_BILLS));

				clickNavRow(NR_Bills, "Bills");
				if (!bIsAuthenticatedUser) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					// mobileAction.verifyElementIsDisplayed(HDR_Interac_e_Transfer,
					// "HDR_Interac_e_Transfer");
					// mobileAction.FuncClick(BT_Back, "< Button");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_InvestingAccounts(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyNavRowExists(NR_InvestingAccounts, "Investing Accounts")) {
				mobileAction.FuncVerifyTextEquals(NR_InvestingAccounts,
						getTextInCurrentLocale(StringArray.ARRAY_INVESTING_ACCOUNTS));

				clickNavRow(NR_InvestingAccounts, "Investing Accounts");
				if (!bIsAuthenticatedUser) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					// mobileAction.verifyElementIsDisplayed(HDR_Interac_e_Transfer,
					// "HDR_Interac_e_Transfer");
					// mobileAction.FuncClick(BT_Back, "< Button");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_Trade(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyNavRowExists(NR_Trade, "Trade")) {
				mobileAction.FuncVerifyTextEquals(NR_Trade,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_TRADE));

				clickNavRow(NR_Trade, "Trade");
				if (!bIsAuthenticatedUser) {
					mobileAction.verifyElementIsDisplayed(password, "Login Screen");
					mobileAction.FuncClick(BT_Back, "< Button");
				} else {
					// mobileAction.verifyElementIsDisplayed(HDR_Interac_e_Transfer,
					// "HDR_Interac_e_Transfer");
					// mobileAction.FuncClick(BT_Back, "< Button");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_Markets(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyNavRowExists(NR_Markets, "Markets")) {
				mobileAction.FuncVerifyTextEquals(NR_Markets,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_MARKETS));

				clickNavRow(NR_Markets, "Markets");

				Thread.sleep(10000);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					// Quote page WEBVIEW
					MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());
					mobileAction.verifyElementIsDisplayed(mobileAction.getMobileElement(ED_Markets_symbolSearch),
							"ED_Markets_symbolSearch");

					mobileAction.FuncClick(mobileAction.getMobileElement(BTN_Back), "BTN_Back");
					MIT_PNSAccessAlerts.get().FuncSwitchContext("NATIVE_APP");
				} else {
					// mobileAction.verifyElementIsDisplayed(ED_Quote_Search_Symbol_iOS,
					// "ED_Quote_Search_Symbol_iOS");
					// mobileAction.FuncClick(BT_Cancel_QuoteSearchSymbolScreen,
					// "BT_Cancel_QuoteSearchSymbolScreen");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
