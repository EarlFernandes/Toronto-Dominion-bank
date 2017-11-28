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

	@iOSFindBy(xpath = "//*[@label='Accounts' or @label='Comptes' or @label='账户' or @label='賬戶']")
	@AndroidFindBy(xpath = "//*[@text='Accounts' or @text='Comptes' or @text='账户' or @text='賬戶']")
	private MobileElement NR_Accounts;

	@iOSFindBy(xpath = "//*[@label='Transfers' or @label='Virements' or @label='转账' or @label='轉賬']")
	@AndroidFindBy(xpath = "//*[@text='Transfers' or @text='Virements' or @text='转账' or @text='轉賬']")
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

	@iOSFindBy(xpath = "//*[@label='Accounts' or @label='Comptes' or @label='我的账户' or @label='我的賬戶']")
	@AndroidFindBy(xpath = "//*[@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶']")
	private MobileElement HDR_MyAccounts;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_HamburgerMenu;

	@iOSFindBy(xpath = "//*[@label='Home' or @label='Accueil' or @label='主页' or @label='首頁']")
	@AndroidFindBy(xpath = "//*[@text='Home' or @text='Accueil' or @text='主页' or @text='首頁']")
	private MobileElement FLY_Home;

	@iOSFindBy(xpath = "//*[@label='Transfers' or @label='Virements' or @label='转账' or @label='轉賬']")
	@AndroidFindBy(xpath = "//*[@text='Transfers' or @text='Virements' or @text='转账' or @text='轉賬']")
	private MobileElement HDR_Transfers;

	@iOSFindBy(xpath = "//*[(@label='Bills' or @label='Factures' or @label='账单' or @label='賬單') and @name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Bills' or @text='Factures' or @text='账单' or @text='賬單']")
	private MobileElement HDR_Bills;

	@iOSFindBy(xpath = "//*[@label='Open a Direct Investing Account' or @label='Ouvrir un compte Placements directs TD' or @label='投资账户' or @label='投資賬戶']")
	@AndroidFindBy(xpath = "//*[@text='Open a TD Direct Investing Account' or @text='Ouvrir un compte Placements directs TD' or @text='投资账户' or @text='投資賬戶']")
	private MobileElement NR_TDDirectInvestingAccounts;

	@iOSFindBy(xpath = "//*[@label='Investing' or @label='Placements' or @label='投资' or @label='投資']")
	@AndroidFindBy(xpath = "//*[@text='Investing' or @text='Placements' or @text='投资' or @text='投資']")
	private MobileElement HDR_Investing;

	@iOSFindBy(xpath = "//*[@label='Quote' or @label='Cote' or @label='报价' or @label='報價']")
	@AndroidFindBy(xpath = "//*[@text='Quote' or @text='Cote' or @text='报价' or @text='報價']")
	private MobileElement NR_Quote;

	@iOSFindBy(xpath = "//*[@label='Alerts' or @label='Alertes' or @label='提醒' or @label='提醒']")
	@AndroidFindBy(xpath = "//*[@text='Alerts' or @text='Alertes' or @text='提醒' or @text='提醒']")
	private MobileElement NR_Alerts;

	@iOSFindBy(xpath = "//*[@label='Open a Bank Account' or @label='Ouvrir un compte bancaire' or @label='开设银行账户' or @label='開設銀行賬戶']")
	@AndroidFindBy(xpath = "//*[@text='Open a Bank Account' or @text='Ouvrir un compte bancaire' or @text='开设银行账户' or @text='開設銀行賬戶']")
	private MobileElement NR_OpenBankAccount;

	@iOSFindBy(xpath = "//*[@label='Banking' or @label='Services bancaires' or @label='理财' or @label='理財']")
	@AndroidFindBy(xpath = "//*[@text='Banking' or @text='Services bancaires' or @text='理财' or @text='理財']")
	private MobileElement HDR_Banking;

	@iOSFindBy(xpath = "//*[@label='Alerts' or @label='Alertes' or @label='提醒' or @label='提醒']")
	@AndroidFindBy(xpath = "//*[@text='Alerts' or @text='Alertes' or @text='提醒' or @text='提醒']")
	private MobileElement HDR_Alerts;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter name or symbol' or @value='Entrez un nom ou un symbole' or @value='输入名称或代号' or @value='輸入名稱或代號']")
	private MobileElement ED_Quote_Search_Symbol_iOS;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel' or @label='Listes' or @label='自选股观察名单' or @label='自選股觀察名單']")
	private MobileElement BT_Cancel_QuoteSearchSymbolScreen;

	private By ED_Markets_symbolSearch = By.id("symbol-search");

	private By ED_Quote_Search_Symbol = By.id("symbol-search");

	private By BTN_Back = By.xpath("//*[@class='sprite sprite-back']");

	public void verifyNavRowsUnAuthenicatedUser() {
		Decorator();
		try {

			verifyNR_Accounts(false);

			verifyNR_Transfers(false);

			verifyNR_Bills(false);

			// verifyNR_InvestingAccounts(false); //Investing Accounts removed
			// from Nav Rows as per new requirement

			verifyNR_Trade(false);

			verifyNR_Markets(false);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNavRowsBankingOnlyUser() {
		Decorator();
		try {

			verifyNR_Accounts(true);

			verifyNR_Transfers(true);

			verifyNR_Bills(true);

			// verifyNR_InvestingAccounts(false); //Investing Accounts removed
			// from Nav Rows as per new requirement

			verifyNR_OpenTDDirectInvestingAccount(true);

			verifyNR_Quote(true);

			verifyNR_Markets(true);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNavRowsInvestingOnlyUser() {
		Decorator();
		try {

			// verifyNR_InvestingAccounts(false); //Investing Accounts removed
			// from Nav Rows as per new requirement

			verifyNR_Accounts(true);
			
			verifyNR_Alerts(true);

			verifyNR_Markets(true);

			verifyNR_OpenBankAccount(true);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyNavRowsBlendedUser() {
		Decorator();
		try {

			verifyNR_Accounts(true);

			verifyNR_Transfers(true);

			verifyNR_Bills(true);

			// verifyNR_InvestingAccounts(false); //Investing Accounts removed
			// from Nav Rows as per new requirement

			verifyNR_Alerts(true);

			verifyNR_Markets(true);

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
					mobileAction.verifyElementIsDisplayed(HDR_MyAccounts, "HDR_MyAccounts");
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
						mobileAction.FuncClick(BT_HamburgerMenu, "BT_Home_HamburgerMenu");
						mobileAction.FuncClick(FLY_Home, "Home Flyout Menu");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_Transfers(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (verifyNavRowExists(NR_Transfers, "Transfers")) {
					mobileAction.FuncVerifyTextEquals(NR_Transfers,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_TRANSFERES));

					clickNavRow(NR_Transfers, "Transfers");

					if (!bIsAuthenticatedUser) {
						mobileAction.verifyElementIsDisplayed(password, "Login Screen");
						mobileAction.FuncClick(BT_Back, "< Button");
					} else {
						mobileAction.verifyElementIsDisplayed(HDR_Transfers, "Transfers");
						mobileAction.FuncClick(BT_HamburgerMenu, "BT_Home_HamburgerMenu");
						mobileAction.FuncClick(FLY_Home, "Home Flyout Menu");
					}
				}
			} else {
				if (NR_Transfers.getAttribute("label")
						.equals(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_TRANSFERES))) {
					CL.GetReporting().FuncReport(PASS, "Transfers Nav row present.");
					// NR_Transfers.click();
					/*
					 * if (!bIsAuthenticatedUser) {
					 * mobileAction.verifyElementIsDisplayed(password,
					 * "Login Screen"); mobileAction.FuncClick(BT_Back,
					 * "< Button"); } else {
					 * mobileAction.verifyElementIsDisplayed(HDR_Transfers,
					 * "Transfers"); mobileAction.FuncClick(BT_HamburgerMenu,
					 * "BT_Home_HamburgerMenu");
					 * mobileAction.FuncClick(FLY_Home, "Home Flyout Menu"); }
					 */
				}
				else
				{
					CL.GetReporting().FuncReport(FAIL, "Transfers Nav row not present.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_Bills(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (verifyNavRowExists(NR_Bills, "Bills")) {
					mobileAction.FuncVerifyTextEquals(NR_Bills,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_BILLS));

					clickNavRow(NR_Bills, "Bills");
					if (!bIsAuthenticatedUser) {
						mobileAction.verifyElementIsDisplayed(password, "Login Screen");
						mobileAction.FuncClick(BT_Back, "< Button");
					} else {
						mobileAction.verifyElementIsDisplayed(HDR_Bills, "HDR_Bills");
						mobileAction.FuncClick(BT_HamburgerMenu, "BT_Home_HamburgerMenu");
						mobileAction.FuncClick(FLY_Home, "Home Flyout Menu");
					}
				}
			} else {
				if (NR_Bills.getAttribute("label")
						.equals(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_BILLS))) {
					CL.GetReporting().FuncReport(PASS, "Bills Nav row present.");
					/*
					 * NR_Bills.click();
					 * mobileAction.verifyElementIsDisplayed(HDR_Bills,
					 * "HDR_Bills"); mobileAction.FuncClick(BT_Back,
					 * "< Button");
					 */
				}
				else
				{
					CL.GetReporting().FuncReport(FAIL, "Bills Nav row not present.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_OpenTDDirectInvestingAccount(boolean bIsAuthenticatedUser) {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String sUserType = getTestdata("UserRole", XLSheetUserIDs);
				if (verifyNavRowExists(NR_TDDirectInvestingAccounts, "Open a TD Direct Investing Account")) {
					mobileAction.FuncVerifyTextEquals(NR_TDDirectInvestingAccounts,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_OPENTDDIRECTINVESTINGACCOUNT));

					clickNavRow(NR_TDDirectInvestingAccounts, "Open a TD Direct Investing Account");
					/*
					 * if (!bIsAuthenticatedUser) {
					 * mobileAction.verifyElementIsDisplayed(password,
					 * "Login Screen"); mobileAction.FuncClick(BT_Back,
					 * "< Button"); } else {
					 */
					if (sUserType.equalsIgnoreCase("Banking")) {
						mobileAction.verifyElementIsDisplayed(HDR_Investing, "HDR_Investing");
						mobileAction.FuncClick(BT_Back, "< Button");
					}

				}
			} else {
				if (NR_TDDirectInvestingAccounts.getAttribute("label").equals(
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_OPENTDDIRECTINVESTINGACCOUNT))) {
					CL.GetReporting().FuncReport(PASS, "Open a TD Direct Investing Account Nav row present.");
				}
				else
				{
					CL.GetReporting().FuncReport(FAIL, "Open a TD Direct Investing Account Nav row not present.");
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
					mobileAction.verifyElementIsDisplayed(ED_Quote_Search_Symbol_iOS, "ED_Quote_Search_Symbol_iOS");
					mobileAction.FuncClick(BT_Cancel_QuoteSearchSymbolScreen, "BT_Cancel_QuoteSearchSymbolScreen");

				}

				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_Quote(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyNavRowExists(NR_Quote, "Quote")) {
				mobileAction.FuncVerifyTextEquals(NR_Quote,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_QUOTE));

				clickNavRow(NR_Quote, "Quote");

				Thread.sleep(10000);

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					// Quote page WEBVIEW
					MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());
					mobileAction.verifyElementIsDisplayed(mobileAction.getMobileElement(ED_Quote_Search_Symbol),
							"ED_Quote_Search_Symbol");

					mobileAction.FuncClick(mobileAction.getMobileElement(BTN_Back), "BTN_Back");
					MIT_PNSAccessAlerts.get().FuncSwitchContext("NATIVE_APP");
				} else {
					mobileAction.verifyElementIsDisplayed(ED_Quote_Search_Symbol_iOS, "ED_Quote_Search_Symbol_iOS");
					mobileAction.FuncClick(BT_Cancel_QuoteSearchSymbolScreen, "BT_Cancel_QuoteSearchSymbolScreen");

				}

				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_Alerts(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyNavRowExists(NR_Alerts, "Alerts")) {
				mobileAction.FuncVerifyTextEquals(NR_Alerts,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_ALERTS));

				clickNavRow(NR_Alerts, "Alerts");
				/*
				 * if (!bIsAuthenticatedUser) {
				 * mobileAction.verifyElementIsDisplayed(password,
				 * "Login Screen"); mobileAction.FuncClick(BT_Back, "< Button");
				 * } else {
				 */
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					if (mobileAction.isObjExists(HDR_Alerts)) {
						mobileAction.verifyElementIsDisplayed(HDR_Alerts, "Alerts");
						mobileAction.FuncClick(BT_Back, "< Button");
					} else {
						MIT_PNSAccessAlerts.get()
								.FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());
						MIT_PNSAccessAlerts.get().verifyAlertLandingPage();
						mobileAction.switchAppiumContext("NATIVE_APP");
					}
				} else {
					if (mobileAction.isObjExists(HDR_Alerts)) {
						mobileAction.verifyElementIsDisplayed(HDR_Alerts, "Alerts");
						mobileAction.FuncClick(BT_Back, "< Button");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyNR_OpenBankAccount(boolean bIsAuthenticatedUser) {
		Decorator();
		try {
			if (verifyNavRowExists(NR_OpenBankAccount, "Open a Bank Account")) {
				mobileAction.FuncVerifyTextEquals(NR_OpenBankAccount,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_NAVROW_OPENABANKACCOUNT));

				clickNavRow(NR_OpenBankAccount, "Open a Bank Account");
				/*
				 * if (!bIsAuthenticatedUser) {
				 * mobileAction.verifyElementIsDisplayed(password,
				 * "Login Screen"); mobileAction.FuncClick(BT_Back, "< Button");
				 * } else {
				 */
				mobileAction.verifyElementIsDisplayed(HDR_Banking, "HDR_Banking");
				mobileAction.FuncClick(BT_Back, "< Button");
				// }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
