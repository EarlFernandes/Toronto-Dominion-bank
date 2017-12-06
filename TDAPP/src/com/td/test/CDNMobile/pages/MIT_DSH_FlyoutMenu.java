package com.td.test.CDNMobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.DoubleToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td.MobileAction2;
import com.td.StringArray;
import com.td._CommonPage;
import com.td.test.framework.MobileAction;
import com.td.test.framework.Reporting;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSH_FlyoutMenu extends _CommonPage {

	private static MIT_DSH_FlyoutMenu MIT_DSH_FlyoutMenu;

	public synchronized static MIT_DSH_FlyoutMenu get() {
		if (MIT_DSH_FlyoutMenu == null) {
			MIT_DSH_FlyoutMenu = new MIT_DSH_FlyoutMenu();
		}
		return MIT_DSH_FlyoutMenu;

	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSXCUITFindBy(xpath = "//*[@name='QuickLinkLeftNavButton' or @name='NAVIGATION_ITEM_MENU']")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='Alerts' or contains(@name,'Alertes')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Alerts' or @text='Alertes']")
	private MobileElement Alerts;

	@iOSXCUITFindBy(xpath = "//*[@name='QuickLinkLeftNavButton' or @name='NAVIGATION_ITEM_MENU' or @name='Home']")
	@AndroidFindBy(id = "android:id/up")
	private MobileElement MenuUp;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Home')]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=com.td:id/hamburger']")
	private MobileElement MenuUp1;

	@iOSXCUITFindBy(xpath = "//*[@name='QuickLinkLeftNavButton']/following-sibling::XCUIElementTypeImage[1]")
	@AndroidFindBy(id = "com.td:id/logo")
	private MobileElement hdrHome;

	@iOSXCUITFindBy(xpath = "//*[@label='Login' or contains(@label,'Ouvrir')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement login;

	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@label='Password']")
	@iOSXCUITFindBy(accessibility = "LOGIN_PASSWORD")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cross-Border Banking' or @label='Services bancaires transfrontaliers' or @label='跨境理财服务' or @label='跨國理財服務']")
	@AndroidFindBy(xpath = "//*[@text='Cross-Border Banking' or @text='Services bancaires transfrontaliers' or @text='跨境理财服务' or @text='跨國理財服務']")
	private MobileElement lblCrossBorder;

	//@iOSXCUITFindBy(xpath = "//*[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Profil et paramètres' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement lblProfileSettings;

//	@iOSXCUITFindBy(xpath = "//*[@label='Apple Watch' or @label='Services bancaires transfrontaliers'']")
	@iOSXCUITFindBy(accessibility = "TDAppleWatchPreferencesContainerView")
	@AndroidFindBy(xpath = "//*[@text='Apple Watch' or @text='Services bancaires transfrontaliers']")
	private MobileElement lblAppleWatch;

	By Text_Condition = By.xpath("//*[@class='module enter-condition-module']/*[1]");

	@iOSXCUITFindBy(xpath = "//*[@label='Find Locations' or @label='Trouver une succursale' or @label='查找分行' or @label='查找分行']")
	@AndroidFindBy(xpath = "//*[@text='Find Locations' or @text='Trouver une succursale' or @text='查找分行' or @text='查找分行']")
	private MobileElement lblFindLocation;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='How was your TD app experience today?' or @label='Services bancaires transfrontaliers']")
	@AndroidFindBy(xpath = "//*[@text='How was your TD app experience today?' or @text='']")
	private MobileElement lblExperience;

	@iOSXCUITFindBy(xpath = "//*[@label='Contact Us' or @label='Contacter nous' or @label='联系我们' or @label='聯絡我們']")
	@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblContactUs;

	@iOSXCUITFindBy(xpath = "//*[@label='FAQs' or @label='FAQ' or @label='常见问答' or @label='常見問題']")
	@AndroidFindBy(xpath = "//*[(@text='FAQs' or @text='FAQ' or @text='常见问答' or @text='常見問題') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblFAQs;

	@iOSXCUITFindBy(xpath = "//*[@label='Logged Out' or @label='Session fermée' or @label='已退出' or @label='已登出']")
	@AndroidFindBy(xpath = "//*[(@text='Logged Out' or @text='Session fermée' or @text='已退出' or @text='已登出') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblLoggedOut;

	@iOSXCUITFindBy(xpath = "//*[@label='Trade' or @label='Négociation' or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[(@text='Trade' or @text='Négociation' or @text='交易' or @text='交易') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblTrade;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Logout' or@label='Fermer la session' or @label='退出' or @label='登出']")
	@AndroidFindBy(xpath = "//*[@text='Logout' or @text='Fermer la session' or @text='退出' or @text='登出']")
	// @AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement flyoutLogOut;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Home' or @label='Accueil' or @label='主页' or @label='首頁']")
	@AndroidFindBy(xpath = "//*[@text='Home' or @text='Accueil' or @text='主页' or @text='首頁']")
	private MobileElement flyoutHomeLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='My Accounts' or @label='Mes comptes' or @label='我的账户' or @label='我的賬戶']")
	@AndroidFindBy(xpath = "//*[@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶']")
	private MobileElement flyoutMyAccountLink;

	@iOSXCUITFindBy(xpath = "//*[@label='My Accounts' or @label='Mes comptes' or @label='我的账户' or @label='我的賬戶']")
	@AndroidFindBy(xpath = "//*[(@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblMyAccounts;

	@iOSXCUITFindBy(xpath = "//*[@label='Login' or contains(@label,'Ouvrir')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/accntDescrSumt']")
	private MobileElement accountList1;

	String accountList = "//android.widget.TextView[@resource-id= 'com.td:id/accntDescrSumt']";

	@iOSXCUITFindBy(xpath = "//*[@label='Transfers' or @label='Virements' or @label='转账' or @label='轉賬']")
	@AndroidFindBy(xpath = "//*[(@text='Transfers' or @text='Virements' or @text='转账' or @text='轉賬') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblTransfers;

	@iOSXCUITFindBy(xpath = "//*[@label='Bills' or @label='Factures' or @label='账单' or @label='賬單']")
	@AndroidFindBy(xpath = "//*[(@text='Bills' or @text='Factures' or @text='账单' or @text='賬單') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblBill;

	@iOSXCUITFindBy(xpath = "//*[@label='Apple Pay' or @label='Foire aux questions']")
	@AndroidFindBy(xpath = "//*[(@text='Apple Pay' or @text='Foire aux questions') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblApplePay;

	@iOSXCUITFindBy(xpath = "//*[@label='TD MySpend' or @label='Dépense TD']")
	@AndroidFindBy(xpath = "//*[(@text='TD MySpend' or @text='Dépense TD') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblTDMySpend;

	@iOSXCUITFindBy(xpath = "//*[@label='Mobile Payment' or @label='Paiement mobile' or contains(@label,'移动支付') or contains(@label,'流動付款')]")
	@AndroidFindBy(xpath = "//*[(@text='Mobile Payment' or @text='Paiement mobile' or contains(@text,'移动支付') or contains(@text,'流動付款')) and @resource-id='android:id/action_bar_title']")
	private MobileElement lblMobilePayment;

	@iOSXCUITFindBy(xpath = "//*[@label='Mobile Deposit' or @label='Dépôt mobile' or @label='移动存款服务' or @label='流動存款']")
	@AndroidFindBy(xpath = "//*[(@text='Mobile Deposit' or @text='Dépôt mobile' or @text='移动存款服务' or @text='流動存款') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblMobileDepositBanking;

	@iOSXCUITFindBy(xpath = "//*[@label='Banking' or @label='Services bancaires' or @label='理财' or @label='理財']")
	@AndroidFindBy(xpath = "//*[(@text='Banking' or @text='Services bancaires' or @text='理财' or @text='理財') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblMobileDepositInvesting;

	@iOSXCUITFindBy(xpath = "//*[@label='TD for Me' or @label='TD et moi' or @label='TD for Me' or @label='TD et moi']")
	@AndroidFindBy(xpath = "//*[(@text='TD for Me' or @text='TD et moi' or @text='TD for Me' or @text='TD et moi') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblTDforMe;

	@iOSXCUITFindBy(xpath = "//*[@label='Investing' or @label='Placements' or @label='投资' or @label='投資']")
	@AndroidFindBy(xpath = "//*[(@text='Investing' or @text='Placements' or @text='投资' or @text='投資') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblInvestingAccounts;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transfers' or @label='Virements' or @label='转账' or @label='轉賬']")
	@AndroidFindBy(xpath = "//*[(@text='Transfers' or @text='Virements' or @text='转账' or @text='轉賬') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutTransfersLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Bills' or @label='Factures' or @label='账单' or @label='賬單']")
	@AndroidFindBy(xpath = "//*[(@text='Bills' or @text='Factures' or @text='账单' or @text='賬單') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutBillsLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Apple Pay' or @label='Factures']")
	@AndroidFindBy(xpath = "//*[@text='Apple Pay' or @text='Factures')]")
	private MobileElement flyoutApplePay;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD MySpend' or @label='Dépense TD']")
	@AndroidFindBy(xpath = "//*[(@text='TD MySpend' or @text='Dépense TD') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutTDMySpend;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD Mobile Payment' or @label='Paiement mobile TD' or @label='道明移动支付' or @label='道明流動付款']")
	@AndroidFindBy(xpath = "//*[(@text='TD Mobile Payment' or @text='Paiement mobile TD' or @text='道明移动支付' or @text='道明流動付款') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutMobilePayment;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD MySpend' or @label='Dépense TD']")
	@AndroidFindBy(xpath = "//*[(@text='TD MySpend' or @text='Dépense TD') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutTDMySpendLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mobile Deposit' or @label='Dépôt mobile' or @label='移动存款服务' or @label='流動存款']")
	@AndroidFindBy(xpath = "//*[(@text='Mobile Deposit' or @text='Dépôt mobile' or @text='移动存款服务' or @text='流動存款') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutMobileDepositLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD for Me' or @label='TD et Moi']")
	@AndroidFindBy(xpath = "//*[(@text='TD for Me' or @text='TD et Moi') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutTDforMeLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Investing Accounts' or @label='Comptes Placements directs TD' or @label='投资账户' or @label='投資賬戶']")
	@AndroidFindBy(xpath = "//*[(@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutInvestingAccountsLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trade' or contains(@label,'Négociation') or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[(@text='Trade' or contains(@text,'Négociation') or @text='交易' or @text='交易') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement flyoutTrade;

	@iOSXCUITFindBy(xpath = "//*[@label='Investing Accounts' or @label='Comptes Placements directs TD' or @label='投资账户' or @label='投資賬戶']")
	@AndroidFindBy(xpath = "//*[(@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶') and @resource-id='com.td:id/textview_flyout_menu_item']")
	MobileElement InvestingAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@AndroidFindBy(xpath = "//*[@text='Cross-Border Banking' or @text='Services bancaires transfrontaliers' or @text='跨境理财服务' or @text='跨國理財服務']")
	private MobileElement flyoutCrossBorderBankingLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Profil et paramètres' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement flyoutProfileSettings;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Apple Watch')]")
	@AndroidFindBy(xpath = "//*[@text='Apple Watch' or contains(@text,'Services bancaires transfrontaliers')]")
	private MobileElement flyoutAppleWatch;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Locations' or @label='Succursales' or @label='分行网点' or @label='分行']")
	@AndroidFindBy(xpath = "//*[@text='Locations' or @text='Succursales' or @text='分行网点' or @text='分行']")
	private MobileElement flyoutLocationsLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Give Feedback' or @label='Fournir des commentaires' or @label='提供意见反馈' or @label='提供意見回饋']")
	@AndroidFindBy(xpath = "//*[@text='Give Feedback' or @text='Fournir des commentaires' or @text='提供意见反馈' or @text='提供意見回饋']")
	private MobileElement flyoutGiveFeedbackLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Contact Us' or @label='Contactez-nous' or @label='联系我们' or @label='聯絡我們']")
	@AndroidFindBy(xpath = "//*[@text='Contact Us' or @text='Contactez-nous' or @text='联系我们' or @text='聯絡我們']")
	private MobileElement flyoutContactUsLink;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Canada Trust' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDWealthFPNumberLabele']")
	private MobileElement contactusTD;

	// @@iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_1_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Credit Card' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDCreditNumberLabel']")
	private MobileElement contactusCC;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_2_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Small Business Banking' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDSmallBusinessNumberLabel']")
	private MobileElement contactusBB;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_3_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Direct Investing' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDWealthDINumberLabel']")
	private MobileElement contactusDI;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_4_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Wealth Financial Planning' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDWealthFPNumberLabele']")
	private MobileElement contactusFP;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Using TD Mobile Payment' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/faq_category_item_name']")
	private MobileElement TDMobilePayment;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Miscellaneous' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/faq_category_item_name']")
	private MobileElement Miscellaneous;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Getting Started' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/faq_category_item_name']")
	private MobileElement GettingStarted;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD MySpend' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/faq_category_item_name']")
	private MobileElement TDMySpend;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Mobile Privacy' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvPrivacy']")
	private MobileElement mobilePrivacy;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Privacy & Security' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvSecurity']")
	private MobileElement privacySecurity;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Legal' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvLegal']")
	private MobileElement legal;

	// @iOSXCUITFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Terms of Use' or contains(@text,'Communiquez avec nous')]")
	private MobileElement terms;

	@iOSXCUITFindBy(xpath = "//*[@label='Legal' or @label='Avis juridique' or @label='法律声明' or @label='法律聲明']")
	@AndroidFindBy(xpath = "//*[(@text='Legal' or @text='Avis juridique' or @text='法律声明' or @text='法律聲明') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblLegal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='FAQ' or @label='Foire aux questions' or @label='常见问答' or @label='常見問題']")
	@AndroidFindBy(xpath = "//*[@text='FAQ' or @text='Foire aux questions' or @text='常见问答' or @text='常見問題']")
	private MobileElement flyoutFAQLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Privacy, Security & Legal' or @label='Confidentialité, sécurité et avis juridique' or @label='隐私、安全与法律声明' or @label='私隱政策、安全性和法律聲明']")
	@AndroidFindBy(xpath = "//*[@text='Privacy, Security & Legal' or @text='Confidentialité, sécurité et avis juridique' or @text='隐私、安全与法律声明' or @text='私隱政策、安全性和法律聲明']")
	private MobileElement flyoutPrivacySecurityLink;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement backButton;
	
	@AndroidFindBy(id = "android:id/button2")
	MobileElement BT_AppPermissionNotNow;

	private By BTN_Back = By.xpath("//*[@alt='Back' or contains(@src,'/images/mobile/btn_back_arrow_green.png')]");

	public void verifyFlyoutUnauthenticated() {
		Decorator();

		try {
			mobileAction.verifyElementIsDisplayed(BT_Home_HamburgerMenu,
					"Flyout Menu displayed at the Top left corner");

			verifyHome();

			verifyMyAccounts(false);

			verifyTransfers(false);

			verifyBills(false);

			verifyTDMySpend(false);

			verifyMobileDeposit(false);

			verifyTDforMe(false);

			// verifyInvestingAccounts(false);

			verifyCrossBorderBanking(false);

			verifyLocations(false);

			verifyGiveFeedback(false);

			verifyContactUs(false);

			verifyFAQ(false);

			verifyPrivacySecurity(false);

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFlyoutBankingOnlyUser() {
		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(BT_Home_HamburgerMenu,
					"Flyout Menu displayed at the Top left corner");

			verifyHome();

			verifyMyAccounts(true);

			verifyTransfers(true);

			verifyBills(true);

			verifyApplePay(true);

			verifyTDMySpend(true);

			verifyMobilePayment(true);

			verifyMobileDeposit(true);

			verifyTDforMe(true);

			// verifyInvestingAccounts(true);

			verifyCrossBorderBanking(true);

			verifyProfileSettings(true);

			verifyAppleWatch(true);

			verifyLocations(true);

			verifyGiveFeedback(true);

			verifyContactUs(true);

			verifyFAQ(true);

			verifyPrivacySecurity(true);

			verifyLoggedOut(true);

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFlyoutInvestingOnlyUser() {
		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(BT_Home_HamburgerMenu,
					"Flyout Menu displayed at the Top left corner");

			verifyHome();

			verifyMyAccounts(true);

			verifyTransfers(true);

			verifyBills(true);

			verifyTDMySpend(true);

			verifyMobileDeposit(true);

			verifyTDforMe(true);

			// verifyInvestingAccounts(true);

			verifyTrade(true);

			verifyCrossBorderBanking(true);

			verifyProfileSettings(true);

			verifyAppleWatch(true);

			verifyLocations(true);

			verifyGiveFeedback(true);

			verifyContactUs(true);

			verifyFAQ(true);

			verifyPrivacySecurity(true);

			verifyLoggedOut(true);

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFlyoutBlendedyUser() {
		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(BT_Home_HamburgerMenu,
					"Flyout Menu displayed at the Top left corner");

			verifyHome();

			verifyMyAccounts(true);

			verifyTransfers(true);

			verifyBills(true);

			verifyApplePay(true);

			verifyTDMySpend(true);

			verifyMobilePayment(true);

			verifyMobileDeposit(true);

			verifyTDforMe(true);

			// verifyInvestingAccounts(true);

			verifyTrade(true);

			verifyCrossBorderBanking(true);

			verifyProfileSettings(true);

			verifyAppleWatch(true);

			verifyLocations(true);

			
			verifyGiveFeedback(true);

			verifyContactUs(true);

			verifyFAQ(true);

			verifyPrivacySecurity(true);

			verifyLoggedOut(true);

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void goToDashboardHome() {
		Decorator();
		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
			mobileAction.FuncClick(InvestingAccount, "Investing Accounts Flyout Menu");
			LoginMIT.get().MITLogin();
			mobileAction.ClickBackButton();
			clickFlyout(flyoutHomeLink, "homeLink");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyHome() {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutHomeLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_HOME));

			clickFlyout(flyoutHomeLink, "homeLink");

			mobileAction.verifyElementIsDisplayed(hdrHome, "hdrHome");

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyMyAccounts(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutMyAccountLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutMyAccountLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_MYACCOUNTS));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutMyAccountLink, "flyoutMyAccountLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.ClickBackButton();

				//mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {

				clickFlyout(flyoutMyAccountLink, "flyoutMyAccountLink");

				mobileAction.verifyElementIsDisplayed(lblMyAccounts, "lblMyAccounts");

			//	int numbr = CL.GetAppiumDriver().findElements(By.xpath(accountList)).size();

				//CL.GetReporting().FuncReport("Pass", "Total Number of Account Displayed" + numbr);

				
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				{
				mobileAction.FuncClick(lblMyAccounts, "lblMyAccounts");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
				
				}
				else{
					mobileAction.ClickBackButton();
					
				}

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTransfers(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutTransfersLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutTransfersLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TRANSFERS));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutTransfersLink, "flyoutTransfersLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.ClickBackButton();

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {

				clickFlyout(flyoutTransfersLink, "flyoutTransfersLink");

				mobileAction.verifyElementIsDisplayed(lblTransfers, "lblTransfers");

				mobileAction.FuncClick(lblTransfers, "lblTransfers");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyBills(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutBillsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutBillsLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_BILLS));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutBillsLink, "flyoutBillsLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.ClickBackButton();

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {

				clickFlyout(flyoutBillsLink, "flyoutBillsLink");

				mobileAction.verifyElementIsDisplayed(lblBill, "lblBill");

				mobileAction.FuncClick(lblBill, "lblBill");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTDMySpend(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutTDMySpendLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutTDMySpendLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDMYSPEND));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutTDMySpendLink, "flyoutTDMySpendLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.ClickBackButton();

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {

				clickFlyout(flyoutTDMySpendLink, "flyoutMobilePayment");

				mobileAction.verifyElementIsDisplayed(lblTDMySpend, "lblTDMySpend");

				mobileAction.FuncClick(lblTDMySpend, "lblTDMySpend");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyMobileDeposit(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutMobileDepositLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutMobileDepositLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDMOBILEDEPOSIT));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutMobileDepositLink, "flyoutMobileDepositLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.ClickBackButton();

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {

				clickFlyout(flyoutMobileDepositLink, "flyoutMobileDepositLink");

				String UserRole = getTestdata("UserRole", XLSheetUserIDs);

				switch (UserRole) {
				case "Banking":

					mobileAction.verifyElementIsDisplayed(lblMobileDepositBanking, "lblMobileDeposit");

					mobileAction.FuncClick(lblMobileDepositBanking, "lblMobileDeposit");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

					break;

				case "Investing":

					mobileAction.verifyElementIsDisplayed(lblMobileDepositInvesting, "lblMobileDeposit");

					mobileAction.FuncClick(lblMobileDepositInvesting, "lblMobileDeposit");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
					break;

				case "Blended":

					mobileAction.verifyElementIsDisplayed(lblMobileDepositBanking, "lblMobileDeposit");

					mobileAction.FuncClick(lblMobileDepositBanking, "lblMobileDeposit");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

					break;

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTDforMe(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutTDforMeLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutTDforMeLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDFORME));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutTDforMeLink, "flyoutTDforMeLink");

				// mobileAction.verifyElementIsDisplayed(password, "password");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncClick(lblTDforMe, "backButton");

				} else {

					mobileAction.ClickBackButton();

				}

			} else {
				clickFlyout(flyoutTDforMeLink, "flyoutTDforMeLink");

				mobileAction.verifyElementIsDisplayed(lblTDforMe, "lblTDforMe");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncClick(lblTDforMe, "lblTDforMe");

				}

				else {
					mobileAction.ClickBackButton();

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyInvestingAccounts(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutInvestingAccountsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutInvestingAccountsLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_INVESTINGACCOUNTS));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutInvestingAccountsLink, "flyoutInvestingAccountsLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.ClickBackButton();

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {
				clickFlyout(flyoutInvestingAccountsLink, "flyoutInvestingAccountsLink");

				mobileAction.verifyElementIsDisplayed(lblInvestingAccounts, "lblInvestingAccounts");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{

					mobileAction.FuncClick(lblInvestingAccounts, "lblInvestingAccounts");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				} else {

					mobileAction.ClickBackButton();

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCrossBorderBanking(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutCrossBorderBankingLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutCrossBorderBankingLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_CROSSBORDERBANKING));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutCrossBorderBankingLink, "flyoutCrossBorderBankingLink");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					mobileAction.FuncClick(mobileAction.getMobileElement(BTN_Back), "BTN_Back");
					// Fix needed for lblCrossBorder mod page android object
					// mobileAction.FuncClick((MobileElement)
					// CL.GetDriver().findElement(BTN_Back),
					// "BTN_Back");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				}

				else

				{
					mobileAction.verifyElementIsDisplayed(lblCrossBorder, "lblCrossBorder");
					mobileAction.ClickBackButton();

				}

			}

			else {
				clickFlyout(flyoutCrossBorderBankingLink, "flyoutCrossBorderBankingLink");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					// Fix needed for lblCrossBorder mod page android object
					// mobileAction.verifyElementIsDisplayed((MobileElement)
					// CL.GetDriver().findElement(Text_Condition),
					// "Text_Condition");

					mobileAction.FuncClick(mobileAction.getMobileElement(BTN_Back), "BTN_Back");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");
					

				}

				else

				{
					mobileAction.verifyElementIsDisplayed(lblCrossBorder, "lblCrossBorder");
					mobileAction.ClickBackButton();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyLocations(boolean bIsAuthenticated) {

		Decorator();

		try {

			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutLocationsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutLocationsLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_LOCATIONS));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutLocationsLink, "flyoutLocationsLink");

				mobileAction.verifyElementIsDisplayed(lblFindLocation, "lblFindLocation");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{

					mobileAction.FuncClick(backButton, "backButton");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

				else {

					mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

			} else {
				clickFlyout(flyoutLocationsLink, "flyoutLocationsLink");

				mobileAction.verifyElementIsDisplayed(lblFindLocation, "lblFindLocation");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					mobileAction.FuncClick(backButton, "backButton");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

				else {
					mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyGiveFeedback(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutGiveFeedbackLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutGiveFeedbackLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_GIVEFEEDBACK));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutGiveFeedbackLink, "flyoutGiveFeedbackLink");

				// mobileAction.verifyElementIsDisplayed(lblExperience,
				// "lblExperience");

				mobileAction.ClickBackButton();

			} else {
				clickFlyout(flyoutGiveFeedbackLink, "flyoutGiveFeedbackLink");

				// mobileAction.verifyElementIsDisplayed(lblExperience,
				// "lblExperience");

				mobileAction.ClickBackButton();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyContactUs(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutContactUsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutContactUsLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_CONTACTUS));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutContactUsLink, "flyoutContactUsLink");

				mobileAction.verifyElementIsDisplayed(lblContactUs, "lblContactUs");

				/*
				 * mobileAction.verifyElementIsDisplayed(contactusTD,
				 * "contactusTD");
				 * 
				 * mobileAction.verifyElementIsDisplayed(contactusCC,
				 * "contactusCC");
				 * 
				 * mobileAction.verifyElementIsDisplayed(contactusBB,
				 * "contactusBB");
				 * 
				 * mobileAction.verifyElementIsDisplayed(contactusDI,
				 * "contactusDI");
				 * 
				 * mobileAction.verifyElementIsDisplayed(contactusFP,
				 * "contactusFP");
				 */

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					mobileAction.ClickBackButton();

				}

				else {

					mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

			} else {
				clickFlyout(flyoutContactUsLink, "flyoutContactUsLink");

				mobileAction.verifyElementIsDisplayed(lblContactUs, "lblContactUs");
				/*
				 * mobileAction.verifyElementIsDisplayed(contactusTD,
				 * "contactusTD");
				 * 
				 * mobileAction.verifyElementIsDisplayed(contactusCC,
				 * "contactusCC");
				 * 
				 * mobileAction.verifyElementIsDisplayed(contactusBB,
				 * "contactusBB");
				 * 
				 * mobileAction.verifyElementIsDisplayed(contactusDI,
				 * "contactusDI");
				 * 
				 * mobileAction.verifyElementIsDisplayed(contactusFP,
				 * "contactusFP");
				 */

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					mobileAction.ClickBackButton();

				}

				else {

					mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFAQ(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutFAQLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutFAQLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_FAQ));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutFAQLink, "flyoutFAQLink");

				mobileAction.verifyElementIsDisplayed(lblFAQs, "lblFAQs");
				/*
				 * mobileAction.verifyElementIsDisplayed(TDMobilePayment,
				 * "TDMobilePayment");
				 * 
				 * mobileAction.verifyElementIsDisplayed(Miscellaneous,
				 * "Miscellaneous");
				 * 
				 * mobileAction.verifyElementIsDisplayed(GettingStarted,
				 * "GettingStarted");
				 * 
				 * mobileAction.FuncSwipeWhileElementNotFound(TDMySpend, false,
				 * 10, "up");
				 * 
				 * mobileAction.verifyElementIsDisplayed(TDMySpend,
				 * "TDMySpend");
				 */

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					mobileAction.ClickBackButton();

				}

				else {

					mobileAction.FuncClick(MenuUp, "MenuUp");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

			} else {
				clickFlyout(flyoutFAQLink, "flyoutFAQLink");

				mobileAction.verifyElementIsDisplayed(lblFAQs, "lblFAQs");

				/*
				 * mobileAction.verifyElementIsDisplayed(TDMobilePayment,
				 * "TDMobilePayment");
				 * 
				 * mobileAction.verifyElementIsDisplayed(Miscellaneous,
				 * "Miscellaneous");
				 * 
				 * mobileAction.verifyElementIsDisplayed(GettingStarted,
				 * "GettingStarted");
				 * 
				 * mobileAction.FuncSwipeWhileElementNotFound(TDMySpend, false,
				 * 10, "up");
				 * 
				 * mobileAction.verifyElementIsDisplayed(TDMySpend,
				 * "TDMySpend");
				 */
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					mobileAction.FuncClick(lblFAQs, "lblFAQs");

				}

				else {
					mobileAction.FuncClick(MenuUp, "MenuUp");
					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPrivacySecurity(boolean bIsAuthenticated) {

		Decorator();

		try {
			Thread.sleep(1000);

			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutPrivacySecurityLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutPrivacySecurityLink,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_PRIVACYSECURITY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutPrivacySecurityLink, "flyoutPrivacySecurityLink");

				mobileAction.verifyElementIsDisplayed(lblLegal, "lblLegal");

				/*
				 * mobileAction.verifyElementIsDisplayed(mobilePrivacy,
				 * "mobilePrivacy");
				 * 
				 * mobileAction.verifyElementIsDisplayed(privacySecurity,
				 * "privacySecurity");
				 * 
				 * mobileAction.verifyElementIsDisplayed(legal, "legal");
				 * 
				 * mobileAction.verifyElementIsDisplayed(terms, "terms");
				 */
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					mobileAction.ClickBackButton();

					mobileAction.FuncClick(MenuUp, "MenuUp");

					//mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

				else {

					mobileAction.FuncClick(MenuUp, "MenuUp");

					//mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

			} else {
				clickFlyout(flyoutPrivacySecurityLink, "flyoutPrivacySecurityLink");

				mobileAction.verifyElementIsDisplayed(lblLegal, "lblLegal");

				/*
				 * mobileAction.verifyElementIsDisplayed(mobilePrivacy,
				 * "mobilePrivacy");
				 * 
				 * mobileAction.verifyElementIsDisplayed(privacySecurity,
				 * "privacySecurity");
				 * 
				 * mobileAction.verifyElementIsDisplayed(legal, "legal");
				 * 
				 * mobileAction.verifyElementIsDisplayed(terms, "terms");
				 */

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					mobileAction.FuncClick(backButton, "backButton");

					//mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

				else {
					mobileAction.FuncClick(MenuUp, "MenuUp");

					//mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyApplePay(boolean bIsAuthenticated) {

		Decorator();

		try {

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				if (!CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
						&& (CL.getTestDataInstance().getMobileDeviceType().equalsIgnoreCase("smartphone"))) {
					{
						mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
						mobileAction.FuncSwipeWhileElementNotFound(flyoutApplePay, false, 10, "up");

						mobileAction.FuncVerifyTextEquals(flyoutApplePay,
								getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_APPLEPAY));

						clickFlyout(flyoutApplePay, "flyoutApplePay");

						mobileAction.verifyElementIsDisplayed(lblApplePay, "lblApplePay");

						mobileAction.ClickBackButton();

					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyMobilePayment(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutMobilePayment, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutMobilePayment,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_MOBILEPAYMENT));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					{
						clickFlyout(flyoutMobilePayment, "flyoutMobileDepositLink");
						
						if(mobileAction.isObjExists(BT_AppPermissionNotNow))
						{
							mobileAction.FuncClick(BT_AppPermissionNotNow, "Not Now");
						}

						mobileAction.verifyElementIsDisplayed(lblMobilePayment, "lblMobilePayment");

						mobileAction.FuncClick(backButton, "backButton");

						mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyProfileSettings(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutProfileSettings, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutProfileSettings,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_PROFILESETTINGS));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				clickFlyout(flyoutProfileSettings, "flyoutProfileSettings");

				mobileAction.verifyElementIsDisplayed(lblProfileSettings, "lblProfileSettings");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{

					mobileAction.FuncClick(backButton, "backButton");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

				else {

					mobileAction.ClickBackButton();

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAppleWatch(boolean bIsAuthenticated) {

		Decorator();

		try {
			Thread.sleep(1000);

			if (!bIsAuthenticated) {

				// do nothing
			}

			else {
				if (!CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")
						&& (CL.getTestDataInstance().getMobileDeviceType().equalsIgnoreCase("Smartphone"))) {
					mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
					mobileAction.FuncSwipeWhileElementNotFound(flyoutAppleWatch, false, 10, "up");

					mobileAction.FuncVerifyTextEquals(flyoutAppleWatch,
							getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_APPLEWATCH));

					clickFlyout(flyoutAppleWatch, "flyoutAppleWatch");

					mobileAction.verifyElementIsDisplayed(lblAppleWatch, "lblAppleWatch");

					mobileAction.FuncClick(MenuUp, "MenuUp");

					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTrade(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutTrade, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutTrade,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TRADE));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				clickFlyout(flyoutTrade, "flyoutTrade");

				mobileAction.verifyElementIsDisplayed(lblTrade, "lblTrade");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					mobileAction.FuncClick(backButton, "backButton");

					// mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink,
					// true, 10, "down");

				}

				else {
					mobileAction.ClickBackButton();

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyLoggedOut(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutLogOut, false, 10, "down");

			mobileAction.FuncVerifyTextEquals(flyoutLogOut,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_LOGOUT));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				clickFlyout(flyoutLogOut, "flyoutLogOut");

				mobileAction.verifyElementIsDisplayed(lblLoggedOut, "lblLoggedOut");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.FuncClick(lblLoggedOut, "lblLoggedOut");
					mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
				}

				else {

					mobileAction.ClickBackButton();

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickFlyout(MobileElement objElement, String text) {

		Decorator();

		try {

			for (int i = 0; i < 5; i++) {
				if (mobileAction.isObjExists(objElement, 2)) {
					mobileAction.FuncClick(objElement, "" + objElement.getText());
					break;
				}

				else {
					mobileAction.FuncSwipeOnce("up");
				}

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
