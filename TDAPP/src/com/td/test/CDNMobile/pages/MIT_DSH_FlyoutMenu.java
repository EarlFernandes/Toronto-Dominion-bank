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
	
    @iOSFindBy(xpath = "//*[@name='QuickLinkLeftNavButton']")
    @AndroidFindBy(id = "com.td:id/hamburger")
    MobileElement BT_Home_HamburgerMenu;

@iOSFindBy(xpath = "//*[@label='Investing Accounts' or @label='Comptes Placements directs TD' or @label='投资账户' or @label='投資賬戶']")
    @AndroidFindBy(xpath = "//*[(@text='Investing Accounts' or @text='Comptes Placements directs TD' or @text='投资账户' or @text='投資賬戶') and @resource-id='com.td:id/navText']")
    MobileElement InvestingAccount;

    @iOSFindBy(xpath = "//*[@name='NAVIGATION_ITEM_BACK']")
    @AndroidFindBy(id = "android:id/up")
    MobileElement BT_Back;

	
	
	
	
	
	
	
	
	

	@iOSFindBy(xpath = "//XCUIElementTypeCell[@name='Alerts' or contains(@name,'Alertes')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='Alerts' or @text='Alertes']")
	private MobileElement Alerts;

	@iOSFindBy(xpath = "//*[contains(@label,'Home')]")
	// @iOSFindBy(xpath = "//*[contains(@label,'Menu')]")
	@AndroidFindBy(id = "android:id/up")
	// @AndroidFindBy(xpath =
	// "//android.widget.ImageView[@resource-id=com.td:id/hamburger']")
	// @iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Menu' OR value
	// CONTAINS[cd] 'Username or Access Card' OR value CONTAINS[cd] 'Access Card
	// or Username'`]")
	private MobileElement MenuUp;

	@iOSFindBy(xpath = "//*[contains(@label,'Home')]")
	// @iOSFindBy(xpath = "//*[contains(@label,'Menu')]")
	// @AndroidFindBy(id = "android:id/up")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=com.td:id/hamburger']")
	// @iOSXCUITFindBy(iOSClassChain = "**/*[`label CONTAINS[cd] 'Menu' OR value
	// CONTAINS[cd] 'Username or Access Card' OR value CONTAINS[cd] 'Access Card
	// or Username'`]")
	private MobileElement MenuUp1;

	@iOSFindBy(xpath = "//XCUIElementTypeImage[@name='logo_home.png']")
	@AndroidFindBy(xpath = "//*[(@text='Home' or @text='Accueil') and @resource-id='android:id/action_bar_title']")
	private MobileElement hdrHome;

	@iOSFindBy(xpath = "//*[@label='Login' or contains(@label,'Ouvrir')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText']")
	private MobileElement login;

	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@label='Password']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
	private MobileElement password;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cross-Border Banking' or @label='Services bancaires transfrontaliers']")
	// @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=
	// 'com.td:id/loginBtnText']")
	@AndroidFindBy(xpath = "//*[@text='Cross-Border Banking' or @text='Services bancaires transfrontaliers' or @text='跨境理财服务' or @text='跨國理財服務']")
	private MobileElement lblCrossBorder;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Cross-Border Banking' or @label='Services bancaires transfrontaliers']")
	// @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=
	// 'com.td:id/loginBtnText']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Services bancaires transfrontaliers' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement lblProfileSettings;

	@iOSFindBy(xpath = "//XCUIElementTypeSwitch[1]")
	// @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=
	// 'com.td:id/loginBtnText']")
	@AndroidFindBy(xpath = "//*[@text='Apple Watch' or @text='Services bancaires transfrontaliers']")
	private MobileElement lblAppleWatch;

	By Text_Condition = By.xpath("//*[@class='module enter-condition-module']/*[1]");

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Find Locations' or @text='']")
	private MobileElement lblFindLocation;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='How was your TD app experience today?' or @label='Services bancaires transfrontaliers']")
	// @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=
	// 'com.td:id/loginBtnText']")
	@AndroidFindBy(xpath = "//*[@text='How was your TD app experience today?' or @text='']")
	private MobileElement lblExperience;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contactez-nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblContactUs;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='FAQs' or @text='Foire aux questions') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblFAQs;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Logged Out' or @text='Fermer la session' or @text='退出' or @text='登出') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblLoggedOut;

	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Trade' or @text='Négociation'  or @text='交易'  or @text='交易') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblTrade;
	
	
	
	
	
	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButton;

	// @iOSFindBy(xpath = "//*[contains(@label,Home') or
	// contains(@label,Accueil')]")
	// @iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_HOME']/*[1]")
	@iOSFindBy(xpath = "//*[@label='Logout' or @label='Accueil']")
	@AndroidFindBy(xpath = "//*[@text='Logout' or contains(@text,'Accueil')]")
	// @AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement flyoutLogOut;

	
	
	// @iOSFindBy(xpath = "//*[contains(@label,Home') or
	// contains(@label,Accueil')]")
	// @iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_HOME']/*[1]")
	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Accueil']")
	@AndroidFindBy(xpath = "//*[@text='Trade' or contains(@text,'Accueil')]")
	// @AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement flyoutTrade;

	// @iOSFindBy(xpath = "//*[contains(@label,Home') or
	// contains(@label,Accueil')]")
	// @iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_HOME']/*[1]")
	@iOSFindBy(xpath = "//*[@label='Home' or @label='Accueil' or @label='主页' or @label='首頁']")
	@AndroidFindBy(xpath = "//*[@text='Home' or contains(@text,'Accueil')]")
	// @AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement flyoutHomeLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_ACCOUNTS']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶']")
	private MobileElement flyoutMyAccountLink;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblMyAccounts;

	@iOSFindBy(xpath = "//*[@label='Login' or contains(@label,'Ouvrir')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/accntDescrSumt']")
	private MobileElement accountList1;

	String accountList = "//android.widget.TextView[@resource-id= 'com.td:id/accntDescrSumt']";

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Transfers' or @text='Virements' @text='转账' or @text='轉賬') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblTransfers;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Bills' or @text='Factures' @text='账单' or @text='賬單') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblBill;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Apple Pay' or @text='Foire aux questions') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblApplePay;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='TD MySpend' or @text='Dépense TD') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblTDMySpend;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Mobile Payment' or @text='Foire aux questions') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblMobilePayment;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Mobile Deposit' or @text='Foire aux questions') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblMobileDepositBanking;

	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Mobile Deposit' or @text='Foire aux questions') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblMobileDepositInvesting;
	
	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='TD for Me' or @text='TD et moi' @text='TD for Me' or @text='TD et moi') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblTDforMe;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[(@text='Investing' or @text='' @text='' or @text='') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblInvestingAccounts;

	@iOSFindBy(xpath = "//*[@name='Transfers']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Transfers' or contains(@text,'Virements') or contains(@text,'转账') or contains(@text,'轉賬')]")
	private MobileElement flyoutTransfersLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_BILLS']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Bills' or @text='Factures' or @text='账单' or @text,'賬單']")
	private MobileElement flyoutBillsLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_BILLS']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Apple Pay' or @text='Factures')]")
	private MobileElement flyoutApplePay;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_BILLS']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='TD MySpend' or @text='Dépense TD']")
	private MobileElement flyoutTDMySpend;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_BILLS']/*[1]")
	@AndroidFindBy(xpath = "//*[conatins(@text,'Mobile Payment') or contains(@text,'Factures')]")
	private MobileElement flyoutMobilePayment;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_MOVEN']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='TD MySpend' or contains(@text,'Dépense TD')]")
	private MobileElement flyoutTDMySpendLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_DEPOSIT']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='TD Mobile Deposit' or contains(@text,'Dépôt mobile') or contains(@text,'移动存款服务') or contains(@text,'流動存款')]")
	private MobileElement flyoutMobileDepositLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_menu_icon_locations']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='TD for Me' or contains(@text,'TD et moi')]")
	private MobileElement flyoutTDforMeLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_menu_icon_investing']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Investing Accounts' or contains(@text,'Comptes Placements directs TD') or contains(@text,'投资账户') or contains(@text,'投資賬戶')]")
	private MobileElement flyoutInvestingAccountsLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_CROSSBORDER']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Cross-Border Banking' or contains(@text,'Services bancaires transfrontaliers') or contains(@text,'跨境理财服务') or contains(@text,'跨國理財服務')]")
	private MobileElement flyoutCrossBorderBankingLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_CROSSBORDER']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Settings' or contains(@text,'Profil et paramètres') or contains(@text,'个人资料和设置') or contains(@text,'個人資料和設定')]")
	private MobileElement flyoutProfileSettings;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_CROSSBORDER']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Apple Watch' or contains(@text,'Services bancaires transfrontaliers')]")
	private MobileElement flyoutAppleWatch;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_LOCATIONS']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Locations' or contains(@text,'Succursales') or contains(@text,'分行网点') or contains(@text,'分行')]")
	private MobileElement flyoutLocationsLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_FEEDBACK']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Give Feedback' or contains(@text,'Fournir des commentaires') contains(@text,'发送意见反馈') contains(@text,'發送意見')]")
	private MobileElement flyoutGiveFeedbackLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_CONTACT']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Contact Us' or contains(@text,'Contactez-nous') or contains(@text,'联系我们') or contains(@text,'聯絡我們')]")
	private MobileElement flyoutContactUsLink;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Canada Trust' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDWealthFPNumberLabele']")
	private MobileElement contactusTD;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_1_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Credit Card' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDCreditNumberLabel']")
	private MobileElement contactusCC;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_2_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Small Business Banking' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDSmallBusinessNumberLabel']")
	private MobileElement contactusBB;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_3_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Direct Investing' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDWealthDINumberLabel']")
	private MobileElement contactusDI;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_4_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD Wealth Financial Planning' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvTDWealthFPNumberLabele']")
	private MobileElement contactusFP;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Using TD Mobile Payment' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/faq_category_item_name']")
	private MobileElement TDMobilePayment;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Miscellaneous' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/faq_category_item_name']")
	private MobileElement Miscellaneous;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Getting Started' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/faq_category_item_name']")
	private MobileElement GettingStarted;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='TD MySpend' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/faq_category_item_name']")
	private MobileElement TDMySpend;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Mobile Privacy' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvPrivacy']")
	private MobileElement mobilePrivacy;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Privacy & Security' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvSecurity']")
	private MobileElement privacySecurity;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Legal' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/tvLegal']")
	private MobileElement legal;

	@iOSFindBy(xpath = "//*[@name='CONTACTUS_CELL_0_PHONE_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Terms of Use' or contains(@text,'Communiquez avec nous')]")
	private MobileElement terms;

	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//*[@text='Legal' or (contains@text,'juridique') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblLegal;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_QUESTIONS']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Frequently Asked Questions' or contains(@text,'Foire aux questions') or contains(@text,'常见问答') or contains(@text,'常見問題')]")
	private MobileElement flyoutFAQLink;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_PRIVACY']/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Privacy, Security & Legal' or contains(@text,'Confidentialité, sécurité et avis juridique') or contains(@text,'隐私、安全与法律声明') or contains(@text,'私隱政策、安全性和法律聲明')]")
	private MobileElement flyoutPrivacySecurityLink;

	public void verifyFlyoutUnauthenticated() {
		Decorator();

		try {
			Thread.sleep(1000);

			// Thread.sleep(1000);
			// Set<String> contextNames = ((AppiumDriver)
			// CL.GetDriver()).getContextHandles();
			// for (String contextName : contextNames) {
			// System.out.println(contextNames);
			// }

			/*
			 * try {
			 * 
			 * if (MenuUp.isDisplayed()) CL.GetReporting().FuncReport("Pass",
			 * "The element MenuUp  is displayed."); else
			 * CL.GetReporting().FuncReport("Fail",
			 * "The element MenuUp is not displayed"); } catch (Exception e) {
			 * CL.GetReporting().FuncReport("Fail",
			 * "The element MenuUp is not displayed"); // e.printStackTrace();
			 * //commented throw e; }
			 */

			mobileAction.verifyElementIsDisplayed(MenuUp, "Flyout Menu displayed at the Top left corner");

			// mobileAction.FuncClick(MenuUp,"MenuUp");

			// CL.getTestDataInstance().getDeviceName()

			// CL.getTestDataInstance().setMobileDeviceType(id);

			verifyHome();

			verifyMyAccounts(false);

			verifyTransfers(false);

			verifyBills(false);

			verifyTDMySpend(false);

			verifyMobileDeposit(false);

			verifyTDforMe(false);

			verifyInvestingAccounts(false);

			verifyCrossBorderBanking(false);

			verifyLocations(false);

			verifyGiveFeedback(false);

			verifyContactUs(false);

			verifyFAQ(false);

			verifyPrivacySecurity(false);

		}

		// clickFlyout(CL.GetAppiumDriver().findElement(By.xpath(xpathFlyoutLink3)),
		// xpathFlyoutLink3);

		/*
		 * String[] flyoutLinksList = getTestdata("FlyoutLinksList",
		 * XLSheetUserIDs).split(";");
		 * 
		 * for (int i = 0; i < flyoutLinksList.length; i++)
		 * 
		 * {
		 * 
		 * String xpathFlyoutLink = "//*[contains(@text,'" + flyoutLinksList[i]
		 * + "') or contains(@label,'" + flyoutLinksList[i] + "')]";
		 * mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathFlyoutLink,
		 * false, 5, "up");
		 * 
		 * mobileAction.verifyItemInList(flyoutLinksList[i]);
		 * 
		 * }
		 * 
		 * int iLen = flyoutLinksList.length;
		 * 
		 * String xpathFlyoutLink1 = "//*[contains(@text,'" +
		 * flyoutLinksList[iLen - (iLen)] + "') or contains(@label,'" +
		 * flyoutLinksList[iLen - (iLen)] + "') ]";
		 * mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathFlyoutLink1,
		 * true, 5, "up");
		 * 
		 * mobileAction.verifyElementIsDisplayed(hdrHome, "hdrHome");
		 * 
		 * mobileAction.FuncClick(MenuUp, "MenuUp");
		 * 
		 * String xpathFlyoutLink2 = "//*[contains(@text,'" +
		 * flyoutLinksList[iLen - (iLen - 1)] + "') or contains(@label,'" +
		 * flyoutLinksList[iLen - (iLen - 1)] + "') ]";
		 * 
		 * mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathFlyoutLink2,
		 * true, 5, "up");
		 * 
		 * mobileAction.verifyElementIsDisplayed(login, "login");
		 * 
		 * mobileAction.FuncClick(backButton, "backButton");
		 * 
		 * mobileAction.FuncClick(MenuUp, "MenuUp");
		 */

		/*
		 * for(int j=0; j<flyoutLinksList.length; j++)
		 * 
		 * { if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase(
		 * "Android")) { String xpathFlyoutLinksList = "//*[contains(@text,'" +
		 * flyoutLinksList[j] + "')]";
		 * 
		 * mobileAction.FuncSwipeWhileElementNotFoundByxpath(
		 * xpathFlyoutLinksList, true, 5, "up");
		 * 
		 * mobileAction.verifyElementIsDisplayed(hdrHome, "hdrHome");
		 * 
		 * mobileAction.FuncClick(MenuUp,"MenuUp");
		 * 
		 * 
		 * } else {
		 * 
		 * String xpathFlyoutLinksList = "//*[contains(@label,'" +
		 * flyoutLinksList[j] + "')]";
		 * 
		 * mobileAction.FuncSwipeWhileElementNotFoundByxpath(
		 * xpathFlyoutLinksList, true, 5, "up"); }
		 * 
		 * }
		 */

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFlyoutBankingOnlyUser() {
		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(MenuUp, "Flyout Menu displayed at the Top left corner");

			verifyLoggedOut(true);

			verifyHome();

			verifyMyAccounts(true);

			verifyTransfers(true);

			verifyBills(true);

			verifyApplePay(true);

			verifyTDMySpend(true);

			verifyMobilePayment(true);

			verifyMobileDeposit(true);

			verifyTDforMe(true);

			verifyInvestingAccounts(true);

			verifyCrossBorderBanking(true);

			verifyProfileSettings(true);

			verifyAppleWatch(true);

			verifyLocations(true);

			verifyGiveFeedback(true);

			verifyContactUs(true);

			verifyFAQ(true);

			verifyPrivacySecurity(true);

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFlyoutInvestingOnlyUser() {
		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(MenuUp, "Flyout Menu displayed at the Top left corner");

			verifyLoggedOut(true);

			verifyHome();

			verifyMyAccounts(true);

			verifyTransfers(true);

			verifyBills(true);

			verifyTDMySpend(true);
						
			verifyMobileDeposit(true);
			
			verifyTDforMe(true);
			
			verifyInvestingAccounts(true);
		
			verifyTrade(true);
			
			verifyCrossBorderBanking(true);

			verifyProfileSettings(true);

			verifyAppleWatch(true);

			verifyLocations(true);

			verifyGiveFeedback(true);

			verifyContactUs(true);

			verifyFAQ(true);

			verifyPrivacySecurity(true);

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void verifyFlyoutBlendedyUser() {
		Decorator();

		try {

			mobileAction.verifyElementIsDisplayed(MenuUp, "Flyout Menu displayed at the Top left corner");

			verifyLoggedOut(true);

			verifyHome();

			verifyMyAccounts(true);

			verifyTransfers(true);

			verifyBills(true);

			verifyApplePay(true);

			verifyTDMySpend(true);

			verifyMobilePayment(true);

			verifyMobileDeposit(true);

			verifyTDforMe(true);

			verifyInvestingAccounts(true);

			verifyTrade(true);
			
			verifyCrossBorderBanking(true);

			verifyProfileSettings(true);

			verifyAppleWatch(true);

			verifyLocations(true);

			verifyGiveFeedback(true);

			verifyContactUs(true);

			verifyFAQ(true);

			verifyPrivacySecurity(true);

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
               mobileAction.FuncClick(BT_Back, "< Button");
               clickFlyout(flyoutHomeLink, "homeLink");
               
        } catch (Exception e) {
               e.printStackTrace();
        }

  }

	
	public void verifyHome() {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(flyoutHomeLink,
					getTextInCurrentLocale(StringArray.ARRAY_HOME_HEADER));

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
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutMyAccountLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutMyAccountLink, "flyoutMyAccountLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.FuncClick(backButton, "backButton");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {

				clickFlyout(flyoutMyAccountLink, "flyoutMyAccountLink");

				mobileAction.verifyElementIsDisplayed(lblMyAccounts, "lblMyAccounts");

				int numbr = CL.GetAppiumDriver().findElements(By.xpath(accountList)).size();

				CL.GetReporting().FuncReport("Pass", "Total Number of Account Displayed" + numbr);

				mobileAction.FuncClick(lblMyAccounts, "lblMyAccounts");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
				
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTransfers(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutTransfersLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutTransfersLink, "flyoutTransfersLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.FuncClick(backButton, "backButton");

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
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutBillsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutBillsLink, "flyoutBillsLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.FuncClick(backButton, "backButton");

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
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutTDMySpendLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutTDMySpendLink, "flyoutTDMySpendLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.FuncClick(backButton, "backButton");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {

				clickFlyout(flyoutTDMySpendLink, "flyoutMobilePayment");

				mobileAction.verifyElementIsDisplayed(lblTDMySpend, "lblTDMySpend");

				mobileAction.FuncClick(lblTDMySpend, "lblTDMySpend");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyMobileDeposit(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutMobileDepositLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutMobileDepositLink, "flyoutMobileDepositLink");

				mobileAction.verifyElementIsDisplayed(password, "password");
				
				mobileAction.FuncClick(backButton, "backButton");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {

				clickFlyout(flyoutMobileDepositLink, "flyoutMobileDepositLink");

			
				
			String userType = getTestdata("UserType", XLSheetUserIDs);
				
			switch (userType)
			{
			case "Banking":
			
				mobileAction.verifyElementIsDisplayed(lblMobileDepositBanking, "lblMobileDeposit");

				mobileAction.FuncClick(lblMobileDepositBanking, "lblMobileDeposit");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			
			case "Investing":
				
				mobileAction.verifyElementIsDisplayed(lblMobileDepositInvesting, "lblMobileDeposit");

				mobileAction.FuncClick(lblMobileDepositInvesting, "lblMobileDeposit");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			
				
			case "Blended":
				
				mobileAction.verifyElementIsDisplayed(lblMobileDepositBanking, "lblMobileDeposit");

				mobileAction.FuncClick(lblMobileDepositBanking, "lblMobileDeposit");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
				
				
				
				
				
				
				
				
			
			}
			
			
			
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void verifyTDforMe(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutTDforMeLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutTDforMeLink, "flyoutTDforMeLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.FuncClick(backButton, "backButton");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {
				clickFlyout(flyoutTDforMeLink, "flyoutTDforMeLink");

				mobileAction.verifyElementIsDisplayed(lblTDforMe, "lblTDforMe");

				mobileAction.FuncClick(lblTDforMe, "lblTDforMe");

				

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyInvestingAccounts(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutInvestingAccountsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutInvestingAccountsLink, "flyoutInvestingAccountsLink");

				mobileAction.verifyElementIsDisplayed(password, "password");

				mobileAction.FuncClick(backButton, "backButton");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {
				clickFlyout(flyoutInvestingAccountsLink, "flyoutInvestingAccountsLink");

				mobileAction.verifyElementIsDisplayed(lblInvestingAccounts, "lblInvestingAccounts");

				mobileAction.FuncClick(lblInvestingAccounts, "lblInvestingAccounts");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCrossBorderBanking(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutInvestingAccountsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutCrossBorderBankingLink, "flyoutCrossBorderBankingLink");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					// Fix needed for lblCrossBorder mod page android object
					mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(Text_Condition),
							"Text_Condition");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				}

				else

				{
					mobileAction.verifyElementIsDisplayed(lblCrossBorder, "lblCrossBorder");
				}
				mobileAction.FuncClick(backButton, "backButton");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
				
			} else 
			{
				clickFlyout(flyoutCrossBorderBankingLink, "flyoutCrossBorderBankingLink");

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))

				{
					((AppiumDriver) CL.GetDriver()).context("WEBVIEW_com.td");

					// Fix needed for lblCrossBorder mod page android object
					mobileAction.verifyElementIsDisplayed((MobileElement) CL.GetDriver().findElement(Text_Condition),
							"Text_Condition");

					((AppiumDriver) CL.GetDriver()).context("NATIVE_APP");

				}

				else

				{
					mobileAction.verifyElementIsDisplayed(lblCrossBorder, "lblCrossBorder");
				}
				mobileAction.FuncClick(backButton, "backButton");
				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyLocations(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutLocationsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutLocationsLink, "flyoutLocationsLink");

				mobileAction.verifyElementIsDisplayed(lblFindLocation, "lblFindLocation");

				mobileAction.FuncClick(lblFindLocation, "lblFindLocation");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			} else {
				clickFlyout(flyoutLocationsLink, "flyoutLocationsLink");

				mobileAction.verifyElementIsDisplayed(lblFindLocation, "lblFindLocation");

				mobileAction.FuncClick(lblFindLocation, "lblFindLocation");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyGiveFeedback(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutLocationsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutGiveFeedbackLink, "flyoutGiveFeedbackLink");

				mobileAction.verifyElementIsDisplayed(lblExperience, "lblExperience");

				mobileAction.FuncClick(backButton, "backButton");

				
			} else {
				clickFlyout(flyoutGiveFeedbackLink, "flyoutGiveFeedbackLink");

				mobileAction.verifyElementIsDisplayed(lblExperience, "lblExperience");

				mobileAction.FuncClick(backButton, "backButton");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyContactUs(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutContactUsLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutContactUsLink, "flyoutContactUsLink");

				mobileAction.verifyElementIsDisplayed(lblContactUs, "lblContactUs");

				mobileAction.verifyElementIsDisplayed(contactusTD, "contactusTD");

				mobileAction.verifyElementIsDisplayed(contactusCC, "contactusCC");

				mobileAction.verifyElementIsDisplayed(contactusBB, "contactusBB");

				mobileAction.verifyElementIsDisplayed(contactusDI, "contactusDI");

				mobileAction.verifyElementIsDisplayed(contactusFP, "contactusFP");

				mobileAction.FuncClick(backButton, "backButton");

			
			} else {
				clickFlyout(flyoutContactUsLink, "flyoutContactUsLink");

				mobileAction.verifyElementIsDisplayed(lblContactUs, "lblContactUs");

				mobileAction.verifyElementIsDisplayed(contactusTD, "contactusTD");

				mobileAction.verifyElementIsDisplayed(contactusCC, "contactusCC");

				mobileAction.verifyElementIsDisplayed(contactusBB, "contactusBB");

				mobileAction.verifyElementIsDisplayed(contactusDI, "contactusDI");

				mobileAction.verifyElementIsDisplayed(contactusFP, "contactusFP");

				mobileAction.FuncClick(backButton, "backButton");

				

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFAQ(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutFAQLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutFAQLink, "flyoutFAQLink");

				mobileAction.verifyElementIsDisplayed(lblFAQs, "lblFAQs");

				mobileAction.verifyElementIsDisplayed(TDMobilePayment, "TDMobilePayment");

				mobileAction.verifyElementIsDisplayed(Miscellaneous, "Miscellaneous");

				mobileAction.verifyElementIsDisplayed(GettingStarted, "GettingStarted");

				mobileAction.FuncSwipeWhileElementNotFound(TDMySpend, false, 10, "up");

				mobileAction.verifyElementIsDisplayed(TDMySpend, "TDMySpend");

				mobileAction.FuncClick(backButton, "backButton");

				mobileAction.FuncClick(MenuUp, "MenuUp");

				mobileAction.FuncClick(flyoutHomeLink, "flyoutHomeLink");
			} else {
				clickFlyout(flyoutFAQLink, "flyoutFAQLink");

				mobileAction.verifyElementIsDisplayed(lblFAQs, "lblFAQs");

				mobileAction.verifyElementIsDisplayed(TDMobilePayment, "TDMobilePayment");

				mobileAction.verifyElementIsDisplayed(Miscellaneous, "Miscellaneous");

				mobileAction.verifyElementIsDisplayed(GettingStarted, "GettingStarted");

				mobileAction.FuncSwipeWhileElementNotFound(TDMySpend, false, 10, "up");

				mobileAction.verifyElementIsDisplayed(TDMySpend, "TDMySpend");

				mobileAction.FuncClick(lblFAQs, "lblFAQs");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPrivacySecurity(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutPrivacySecurityLink, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				clickFlyout(flyoutPrivacySecurityLink, "flyoutPrivacySecurityLink");

				mobileAction.verifyElementIsDisplayed(lblLegal, "lblLegal");

				mobileAction.verifyElementIsDisplayed(mobilePrivacy, "mobilePrivacy");

				mobileAction.verifyElementIsDisplayed(privacySecurity, "privacySecurity");

				mobileAction.verifyElementIsDisplayed(legal, "legal");

				mobileAction.verifyElementIsDisplayed(terms, "terms");

				mobileAction.FuncClick(backButton, "backButton");

				mobileAction.FuncClick(MenuUp, "MenuUp");

				mobileAction.FuncClick(flyoutHomeLink, "flyoutHomeLink");
			} else {
				clickFlyout(flyoutPrivacySecurityLink, "flyoutPrivacySecurityLink");

				mobileAction.verifyElementIsDisplayed(lblLegal, "lblLegal");

				mobileAction.verifyElementIsDisplayed(mobilePrivacy, "mobilePrivacy");

				mobileAction.verifyElementIsDisplayed(privacySecurity, "privacySecurity");

				mobileAction.verifyElementIsDisplayed(legal, "legal");

				mobileAction.verifyElementIsDisplayed(terms, "terms");

				mobileAction.FuncClick(lblLegal, "lblLegal");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyApplePay(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutApplePay, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
					{
						clickFlyout(flyoutApplePay, "flyoutApplePay");

						mobileAction.verifyElementIsDisplayed(lblApplePay, "lblApplePay");

						mobileAction.FuncClick(MenuUp, "MenuUp");

						mobileAction.FuncClick(flyoutHomeLink, "flyoutHomeLink");
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
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutMobilePayment, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

					{
						clickFlyout(flyoutMobilePayment, "flyoutMobileDepositLink");

						mobileAction.verifyElementIsDisplayed(lblMobilePayment, "lblMobilePayment");

						mobileAction.FuncClick(lblMobilePayment, "lblMobilePayment");

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
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutProfileSettings, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				clickFlyout(flyoutProfileSettings, "flyoutProfileSettings");

				mobileAction.verifyElementIsDisplayed(lblProfileSettings, "lblProfileSettings");

				mobileAction.FuncClick(lblProfileSettings, "lblProfileSettings");

				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyAppleWatch(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutAppleWatch, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				clickFlyout(flyoutAppleWatch, "flyoutAppleWatch");

				mobileAction.verifyElementIsDisplayed(lblAppleWatch, "lblAppleWatch");

				mobileAction.FuncClick(MenuUp, "MenuUp");

				mobileAction.FuncClick(flyoutHomeLink, "flyoutHomeLink");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTrade(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutLogOut, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				clickFlyout(flyoutTrade, "flyoutTrade");

				mobileAction.verifyElementIsDisplayed(lblTrade, "lblTrade");
				
				mobileAction.FuncClick(lblTrade, "lblTrade");
				
				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void verifyLoggedOut(boolean bIsAuthenticated) {

		Decorator();

		try {
			mobileAction.FuncClick(MenuUp, "MenuUp");
			mobileAction.FuncSwipeWhileElementNotFound(flyoutLogOut, false, 10, "up");

			mobileAction.FuncVerifyTextEquals(QL_SENDMONEY,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_SENDMONEY));

			if (!bIsAuthenticated) {

				// do nothing
			} else {

				clickFlyout(flyoutLogOut, "flyoutLogOut");

				mobileAction.verifyElementIsDisplayed(lblLoggedOut, "lblLoggedOut");
				
				mobileAction.FuncClick(lblLoggedOut, "lblLoggedOut");
				
				mobileAction.FuncSwipeWhileElementNotFound(flyoutHomeLink, true, 10, "down");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickFlyout(MobileElement objElement, String text) {

		Decorator();

		try {
			Thread.sleep(1000);
			// mobileAction.FuncClick(MenuUp, "MenuUp");

			CL.getTestDataInstance().getMobileDeviceType();

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
