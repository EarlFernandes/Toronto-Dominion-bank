package com.td.test.CDNMobile.pages;

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

public class MenuPage extends _CommonPage {

	private static MenuPage MenuPage;

	@iOSFindBy(xpath = "//*[(@label='Transfers' or @label='Virements' or @label='转账' or @label='轉賬') and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_TRANSFERS']")
	@AndroidFindBy(xpath = "//*[(@text='Transfers' or @text='Virements' or @text='转账' or @text='轉賬') and (@resource-id='com.td:id/textview_flyout_menu_item' or @resource-id='com.td:id/navText')]")
	private MobileElement transfers;

	@iOSFindBy(xpath = "//*[(@label='Bills' or @label='Factures' or @label='账单' or @label='賬單')  and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_BILLS']")
	@AndroidFindBy(xpath = "//*[(@text='Bills' or @text='Factures' or @text='账单' or @text='賬單') and (@resource-id='com.td:id/textview_flyout_menu_item' or @resource-id='com.td:id/navText')]")
	private MobileElement bills;

	@iOSFindBy(xpath = "//*[(@label='TD MySpend' or @label='Dépense TD') and @name='flyout_title'] | /*[@name='NAV_DRAWER_ITEMS_MOVEN'")
	@AndroidFindBy(xpath = "//*[(@text='TD MySpend' or @text='Dépense TD') and (@resource-id='com.td:id/textview_flyout_menu_item' or @resource-id='com.td:id/navText')]")
	private MobileElement tdMySpend;

	@iOSFindBy(xpath = "//*[(@label='Cross-Border Banking' or @label='Services bancaires transfrontaliers' or @label='跨境理财服务' or @label='跨國理財服務') and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_CROSSBORDER']")
	@AndroidFindBy(xpath = "//*[@text='Cross-Border Banking' or @text='Services bancaires transfrontaliers' or @text='跨境理财服务' or @text='跨國理財服務']")
	private MobileElement crossBorder;

	@iOSFindBy(xpath = "//*[@name='NAV_DRAWER_ITEMS_menu_icon_investing']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='Investing Accounts' or @text='Comptes Placements directs TD')]")
	private MobileElement investing;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Comptes Placements directs TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Comptes Placements directs TD']")
	private MobileElement investingFRE;

	@iOSFindBy(xpath = "//*[(@label='FAQs' or @label='FAQ' or @label='常见问答' or @label='常見問題') and @name='flyout_title'] | //*[@name='NAV_DRAWER_ITEMS_QUESTIONS']")
	@AndroidFindBy(xpath = "//*[@text='FAQs' or @text='FAQ' or @text='常见问答' or @text='常見問題']")
	private MobileElement faq;

	@iOSFindBy(xpath = "//*[@label='Give Feedback'' or @label='Fournir des commentaires' or @label='提供意见反馈' or @label='提供意見回饋']")
	@AndroidFindBy(xpath = "//*[@text='Give Feedback' or @text='Fournir des commentaires' or @text='提供意见反馈' or @text='提供意見回饋']")
	private MobileElement feedback;

	@iOSFindBy(xpath = "//*[@label='Mobile Deposit' or @label='Dépôt mobile' or @label='移动存款服务' or @label='流動存款']")
	@AndroidFindBy(xpath = "//*[@text='Mobile Deposit' or @text='Dépôt mobile' or @text='移动存款服务' or @text='流動存款']")
	private MobileElement mobile_Deposit_button;

	@iOSFindBy(xpath = "//*[@label='My Accounts' or @label='Mes comptes' or @label='我的账户' or @label='我的賬戶']")
	@AndroidFindBy(xpath = "//*[@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶']")
	private MobileElement accounts_button;

	@iOSFindBy(xpath = "//*[@label='Contact Us' or @label='Contacter nous' or @label='联系我们' or @label='聯絡我們']")
	@AndroidFindBy(xpath = "//*[@text='Contact Us' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們']")
	private MobileElement contactUs;

	@iOSFindBy(xpath = "//*[@label='Home' or @label='Accueil' or @label='主页' or @label='首頁']")
	@AndroidFindBy(xpath = "//*[@text='Home' or @text='Accueil' or @text='主页' or @text='首頁']")
	private MobileElement home_button;

	@iOSFindBy(xpath = "//*[@label='Privacy, Security & Legal' or @label='Confidentialité, sécurité et avis juridique' or @label='隐私、安全与法律声明' or @label='私隱政策、安全性和法律聲明']")
	@AndroidFindBy(xpath = "//*[@text='Privacy, Security & Legal' or @text='Confidentialité, sécurité et avis juridique' or @text='隐私、安全与法律声明' or @text='私隱政策、安全性和法律聲明']")
	private MobileElement privacy;

	@iOSFindBy(xpath = "//*[@label='Trade' or contains(@label,'Négociation') or @label='交易' or @label='交易']")
	@AndroidFindBy(xpath = "//*[@text='Trade' or contains(@text,'Négociation') or @text='交易' or @text='交易']")
	private MobileElement trade;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD Mobile Payment']")
	@AndroidFindBy(xpath = "//*[@text='Using TD Mobile Payment' or contains(@text,'Communiquez avec nous') and @resource-id='com.td:id/faq_category_item_name']")
	private MobileElement mobilePayment;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Apple Pay']")
	private MobileElement applePay;

	@iOSFindBy(xpath = "//*[@label='Locations' or @label='Succursales' or @label='分行网点' or @label='分行']")
	@AndroidFindBy(xpath = "//*[@text='Locations' or @text='Succursales' or @text='分行网点' or @text='分行']")
	private MobileElement locations;

	// Profile and preference
	@iOSFindBy(xpath = "//*[@label='Profile & Settings' or @label='Profil et paramètres' or @label='个人资料和设置' or @label='個人資料和設定']")
	@AndroidFindBy(xpath = "//*[@text='Profile & Settings' or @text='Profil et paramètres' or @text='个人资料和设置' or @text='個人資料和設定']")
	private MobileElement profile_and_settings;

	// customer feedback
	@iOSFindBy(xpath = "//*[@label='Give Feedback' or @label='Fournir des commentaires' or @label='提供意见反馈' or @label='提供意見回饋']")
	@AndroidFindBy(xpath = "//*[@text='Give Feedback' or @text='Fournir des commentaires' or @text='提供意见反馈' or @text='提供意見回饋']")
	private MobileElement give_feedback;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText']")
	private List<MobileElement> menuOpts;

	public synchronized static MenuPage get() {
		if (MenuPage == null) {
			MenuPage = new MenuPage();
		}
		return MenuPage;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	/**
	 * This method will click on the Transfers button on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuTransfer() {

		Decorator();
		try {
			mobileAction.FuncClick(transfers, "Transfers");

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

	/**
	 * This method will click on the Home button on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuHome() {

		Decorator();
		try {
			mobileAction.FuncClick(home_button, "Home");
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

	/**
	 * This method will click on the Transfers button on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickTransfers_InFrench() {

		Decorator();
		try {
			mobileAction.FuncClick(transfers, "Transfers");
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

	/**
	 * This method will click on the Transfers button on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuAccounts() {

		Decorator();
		try {
			mobileAction.FuncClick(accounts_button, "Accounts");
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
			e.printStackTrace();
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will click on the Investing button on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuInvesting() {

		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				investing = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ getTextInCurrentLocale(StringArray.ARRAY_INVESTING_ACCOUNTS) + "']",
						"Investing menu element");

			}
			boolean isLanguageFrench = getTestdata("Language").equals("FRE");
			MobileElement investingElement = isLanguageFrench ? investingFRE : investing;
			mobileAction.FuncClick(investingElement, "Investing");
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

	/**
	 * This method will click on the Contact us button on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickContactUs() {

		Decorator();
		try {
			mobileAction.FuncClick(contactUs, "contactUs");

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

	/**
	 * This method will click on the Bills button on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMenuBills() {

		Decorator();
		try {
			mobileAction.FuncClick(bills, "Bills");
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

	/**
	 * This method will click on the mobile deposit button on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void mobile_Deposit_click() {
		Decorator();
		try {
			mobileAction.FuncClick(mobile_Deposit_button, "Mobile_Deposit_Button");
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

	public void clickMenuTrade() {

		Decorator();
		try {
			mobileAction.FuncClick(trade, "Trade");
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

	public void clickMenuCrossBorder() {
		Decorator();
		try {
			mobileAction.FuncClick(crossBorder, "Cross Border");
			Thread.sleep(7000);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will click on the TD Mobile Payment in the menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickMobilePayment() {

		try {
			Decorator();
			mobileAction.FuncClick(mobilePayment, "Mobilepayment");
			mobileAction.waitProgressBarVanish();
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

	/**
	 * This method will click on the Apple Pay button in the menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickApplePay() {

		try {
			Decorator();
			mobileAction.FuncClick(applePay, "Apple Pay");
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

	/**
	 * This method will click on the Locations on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void clickFindLocations() {

		Decorator();
		try {
			mobileAction.FuncClick(locations, "Locations");
			Thread.sleep(2000);
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

	// For profile and preference

	/**
	 * This method will click on "Profile & Setting" on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickProfileAndSettings() {
		Decorator();
		try {
			mobileAction.FuncSwipeWhileElementNotFound(profile_and_settings, true, 10, "up");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will verify "Profile & Setting" is displayed on menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void VerifyProfileAndSettingslink() {
		Decorator();
		try {
			String profilepreference = getTextInCurrentLocale(StringArray.ARRAY_PROFILE_AND_PREFERENCE);

			mobileAction.FuncSwipeWhileElementNotFound(profile_and_settings, false, 10, "up");
			if (mobileAction.verifyElementIsPresent(profile_and_settings)) {
				mobileAction.Report_Pass_Verified(profilepreference);
			} else {
				mobileAction.Report_Fail_Not_Verified(profilepreference);
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	// Customer feedback
	public void ClickFeedback() {
		Decorator();

		try {
			mobileAction.FuncSwipeWhileElementNotFound(give_feedback, false, 5, "up");
			String elementText = mobileAction.getValue(give_feedback);
			System.out.println("elementText:" + elementText);
			mobileAction.FuncClick(give_feedback, elementText);
			mobileAction.waitProgressBarVanish();
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void ClickContactUs_CF() {
		Decorator();

		try {
			mobileAction.FuncSwipeWhileElementNotFound(contactUs, true, 10, "up");
			mobileAction.waitProgressBarVanish();
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the fly out menu
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyMenuTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(home_button.getText(),
						mobileAction.getAppString("flyoutNavigationHeader"));
				mobileAction.verifyTextEquality(accounts_button.getText(),
						mobileAction.getAppString("str_My_Accounts"));
				mobileAction.verifyTextEquality(transfers.getText(),
						mobileAction.getAppString("flyoutNavigationLinkTransfers"));
				mobileAction.verifyTextEquality(bills.getText(),
						mobileAction.getAppString("flyoutNavigationLinkBills"));
				mobileAction.verifyTextEquality(tdMySpend.getText(),
						mobileAction.getAppString("nav_drawer_items_moven"));
				mobileAction.verifyTextEquality(mobile_Deposit_button.getText(),
						mobileAction.getAppString("flyoutNavigationLinkMobileDeposit"));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("str_HOME") + "']",
						"Home");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("contact_str") + "']",
						"Contact Us");
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
										+ mobileAction.getAppString("ActionBar_MobileDeposit") + "']",
								"Mobile Deposit");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("str_CrossBorder") + "']",
						"Cross Border Banking");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("str_My_Accounts") + "']",
						"My Accounts");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("bills_str") + "']",
						"Bills");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='com.td:id/navText' and @text='"
								+ mobileAction.getAppString("transfers_str") + "']",
						"Transfers");
			}
		} catch (IOException | NoSuchElementException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * @author Ashraf This method will click on the Investing Accounts button on
	 *         menu page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickInvestingAccounts() {

		Decorator();
		try {

			mobileAction.FuncClick(menuOpts.get(7), "Investing Accounts");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

}
