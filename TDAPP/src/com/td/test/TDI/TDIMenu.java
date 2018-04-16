package com.td.test.TDI;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TDIMenu extends _CommonPage {

	private static TDIMenu TDIMenu;

	@iOSXCUITFindBy(xpath = "//*[(@label='Transfers' or @label='Virements' or @label='转账' or @label='轉賬') and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_TRANSFERS']")
	@AndroidFindBy(xpath = "//*[(@text='Transfers' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/textview_flyout_menu_item' or @resource-id='com.td:id/navText')]")
	private MobileElement transfers;

	@iOSXCUITFindBy(xpath = "//*[(@label='Bills' or @label='Factures' or @label='账单' or @label='賬單')  and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_BILLS']")
	@AndroidFindBy(xpath = "//*[(@text='Bills' or @text='Factures' or @text='账单' or @text='賬單') and (@resource-id='com.td:id/textview_flyout_menu_item' or @resource-id='com.td:id/navText')]")
	private MobileElement bills;

	@iOSXCUITFindBy(xpath = "//*[(@label='TD MySpend' or @label='Dépense TD') and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_MOVEN']")
	@AndroidFindBy(xpath = "//*[(@text='TD MySpend' or @text='Dépense TD') and (@resource-id='com.td:id/textview_flyout_menu_item' or @resource-id='com.td:id/navText')]")
	private MobileElement tdMySpend;

	@iOSXCUITFindBy(xpath = "//*[(@label='TD for Me' or @label='TD et Moi' or @label='TD for Me' or @label='TD for Me') and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_menu_icon_locations']")
	@AndroidFindBy(xpath = "//*[@text='TD for Me' or @text='TD et Moi' or @text='TD for Me' or @text='TD for Me']")
	private MobileElement tdForMe;

	@iOSXCUITFindBy(xpath = "//*[(@label='Cross-Border Banking' or @label='Services bancaires transfrontaliers' or @label='跨境理财服务' or @label='跨國理財服務') and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_CROSSBORDER']")
	@AndroidFindBy(xpath = "//*[@text='Cross-Border Banking' or @text='Services bancaires transfrontaliers' or @text='跨境理财服务' or @text='跨國理財服務']")
	private MobileElement crossBorder;

	@iOSXCUITFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_menu_icon_investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Investing Accounts' or @text='Comptes Placements directs TD')]")
	private MobileElement investing;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Comptes Placements directs TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Comptes Placements directs TD']")
	private MobileElement investingFRE;

	@iOSXCUITFindBy(xpath = "//*[(@label='FAQ' or @label='Foire aux questions' or @label='常见问答' or @label='常見問題') and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_QUESTIONS']")
	@AndroidFindBy(xpath = "//*[@text='FAQ' or @text='Foire aux questions' or @text='常见问答' or @text='常見問題']")
	private MobileElement faq;

	@iOSXCUITFindBy(xpath = "//*[@label='Give Feedback'' or @label='Fournir des commentaires' or @label='提供意见反馈' or @label='提供意見回饋']")
	@AndroidFindBy(xpath = "//*[@text='Give Feedback' or @text='Fournir des commentaires' or @text='提供意见反馈' or @text='提供意見回饋']")
	private MobileElement feedback;

	@iOSXCUITFindBy(xpath = "//*[@label='Mobile Deposit' or @label='Dépôt mobile' or @label='移动存款服务' or @label='流動存款']")
	@AndroidFindBy(xpath = "//*[@text='Mobile Deposit' or @text='Dépôt mobile' or @text='移动存款服务' or @text='流動存款']")
	private MobileElement mobile_Deposit_button;

	@iOSXCUITFindBy(xpath = "//*[@label='My Accounts' or @label='Mes comptes' or @label='我的账户' or @label='我的賬戶']")
	@AndroidFindBy(xpath = "//*[@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶']")
	private MobileElement accounts_button;

	@iOSXCUITFindBy(xpath = "//*[@label='Contact Us' or @label='Contactez-nous' or @label='联系我们' or @label='聯絡我們']")
	@AndroidFindBy(xpath = "//*[@text='Contact Us' or @text='Contactez-nous' or @text='联系我们' or @text='聯絡我們']")
	private MobileElement contactUs;

	@iOSXCUITFindBy(xpath = "//*[(@label='Home' or @label='Accueil' or @label='主页' or @label='首頁') and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_HOME']")
	@AndroidFindBy(xpath = "//*[@text='Home' or @text='Accueil' or @text='主页' or @text='首頁']")
	private MobileElement home_button;

	@iOSXCUITFindBy(xpath = "//*[@label='Privacy, Security & Legal' or @label='Confidentialité, sécurité et avis juridique' or @label='隐私、安全与法律声明' or @label='私隱政策、安全性和法律聲明']")
	@AndroidFindBy(xpath = "//*[@text='Privacy, Security & Legal' or @text='Confidentialité, sécurité et avis juridique' or @text='隐私、安全与法律声明' or @text='私隱政策、安全性和法律聲明']")
	private MobileElement privacy;

	@iOSXCUITFindBy(xpath = "//*[@label='Trade' or contains(@label,'Négociation') or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[@text='Trade' or contains(@text,'Négociation') or @text='交易' or @text='交易']")
	private MobileElement trade;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD Mobile Payment']")
	@AndroidFindBy(xpath = "//*[@text='TD Mobile Payment' or @text='Paiement mobile TD' or @text='道明移动支付' or @text='道明移動支付']")
	private MobileElement mobilePayment;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Apple Pay']")
	private MobileElement applePay;

	@iOSXCUITFindBy(xpath = "//*[@label='Locations' or @label='Succursales' or @label='分行网点' or @label='分行']")
	@AndroidFindBy(xpath = "//*[@text='Locations' or @text='Succursales' or @text='分行网点' or @text='分行']")
	private MobileElement locations;

	// Profile and preference
	@iOSXCUITFindBy(xpath = "//*[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Profil et paramètres' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement profile_and_settings;

	// customer feedback
	@iOSXCUITFindBy(xpath = "//*[@label='Give Feedback' or @label='Fournir des commentaires' or @label='提供意见反馈' or @label='提供意見回饋']")
	@AndroidFindBy(xpath = "//*[@text='Give Feedback' or @text='Fournir des commentaires' or @text='提供意见反馈' or @text='提供意見回饋']")
	private MobileElement give_feedback;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Manage Policies' or @label='TBD' or @label='TBD' or @label='TBD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Policies' or @text='TBD' or @text='TBD' or @text='TBD']")
	private MobileElement managePolicies;
	
	//vishal------
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Homepage']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='Homepage']")
	private MobileElement homePage;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Start a Claim']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='Start a Claim']")
	private MobileElement startClaim;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Get a Quote']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='Get A Quote']")
	private MobileElement getQuote;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='TD MyAdvantage']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='TD MyAdvantage']")
	private MobileElement advantage;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='My Accident Reports']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='My Accident Reports']")
	private MobileElement ac_report;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Preferred Auto Shops']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='Preferred Auto Shops']")
	private MobileElement autoShops;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Insurance Card']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='Insurance Card']")
	private MobileElement insuranceCard;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Insurance FAQs']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='Insurance FAQs']")
	private MobileElement menu_faq;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Contact Us']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='Contact Us']")
	private MobileElement contactUS;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label= 'Logout']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='Logout']")
	private MobileElement logout;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='My Policies']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/navText' and @text='My Policies']")
	private MobileElement policies;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='My Billing']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/navText' and @text='My Billing']")
	private MobileElement billing;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='My Claims']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/navText' and @text='My Claims']")
	private MobileElement claims;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Inbox']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/navText' and @text='Inbox']")
	private MobileElement inbox;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='My Profile']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/navText' and @text='My Profile']")
	private MobileElement profile;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Info Centre']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/navText' and @text='Info Centre']")
	private MobileElement infoCenter;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@label='Give Feedback']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/navText' and @text='Give Feedback']")
	private MobileElement giveFeedback;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[contains(@value,'Toronto-Dominion Bank') and @label='Address' and @name='URL']")
	//TODO@AndroidFindBy(xpath="")
	private MobileElement webPage;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@label='Return to TD Insurance']")
	private MobileElement returntoQuote;
	

	public synchronized static TDIMenu get() {
		if (TDIMenu == null) {
			TDIMenu = new TDIMenu();
		}
		return TDIMenu;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	public void managePolicies() {
		Decorator();
		try {

			mobileAction.FuncClick(managePolicies, "Manage Policies");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}
	
	//vishal------
	/**
	 * This method will click on the home screen in the menu.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuHomeScreen(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(homePage, "Menu Home Page");

		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on start a claim in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuStartclaim(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(startClaim, "Menu Start a claim");

		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on manage policies in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuManagePolicies(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(managePolicies, "Menu Manage Policies");
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on the get a quote in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuGetQuote(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(getQuote, "Menu get a quote");
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on the TD Advantage on the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuTDAdvantage(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(advantage, "Menu TD Advantage");
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on the accident report on the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuAccidentReport(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(ac_report, "Menu Accident Report");
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on the auto shops in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuAutoShops(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(autoShops, "Menu Auto shops");
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on the insurance card in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuInsuranceCard(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(insuranceCard, "Menu Insurance Card");
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on the frequently asked questions in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuFAQ(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(menu_faq, "Menu FAQs");
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on contact us in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void menuContactUs(){
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(contactUS, "Menu Contact us");
		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	
	/**
	 * This method will click on My Policies in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void myPolicies(){
		Decorator();
		try{
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(policies, "My Policies");
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on My Billing in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void myBilling(){
		Decorator();
		try{
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(billing, "My billing");
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on My claims in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void myClaims(){
		Decorator();
		try{
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(claims, "My Claims");
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on inbox in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void inbox(){
		Decorator();
		try{
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(inbox, "Inbox");
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on My Profile in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void myProfile(){
		Decorator();
		try{
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(profile, "profile");
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on info center in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void infoCenter(){
		Decorator();
		try{
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(infoCenter, "info center");
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
	/**
	 * This method will click on give feedback in the menu bar.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void giveFeedback(){
		Decorator();
		try{
			TDIHomescreen.get().clickMenu();
			mobileAction.FuncClick(giveFeedback, "give feedback");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
				mobileAction.waitForElement(webPage);
				mobileAction.verifyElementIsDisplayed(webPage,"URL header");
				mobileAction.FuncClick(returntoQuote, "return to quote page");
			}
			else
				//TODO::Android verification
				mobileAction.FuncClickBackButton();

		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}
}
