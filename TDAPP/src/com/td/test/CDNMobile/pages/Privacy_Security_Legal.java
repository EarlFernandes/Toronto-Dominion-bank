package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/**
 * @author akkins9
 *
 */
public class Privacy_Security_Legal extends _CommonPage {
	private static Privacy_Security_Legal Privacy_Security_Legal;

	// Elements of Privacy Security and Legal Page.
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement titleLegal;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	private MobileElement HamMenu;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	private MobileElement backButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	@AndroidFindBy(id = "com.td:id/tvPrivacy")
	private MobileElement mobilePrivacy;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='How we handle the information we collect when you use our mobile apps']")
	@AndroidFindBy(id = "com.td:id/tvPrivacyDesc")
	private MobileElement mobilePrivacyText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
	@AndroidFindBy(id = "com.td:id/tvSecurity")
	private MobileElement privacyAndSecurity;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Bank & invest with confidence']")
	@AndroidFindBy(id = "com.td:id/tvSecurityDesc")
	private MobileElement privacyAndSecurityText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
	@AndroidFindBy(id = "com.td:id/tvLegal")
	private MobileElement legal;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Terms & Conditions']")
	@AndroidFindBy(id = "com.td:id/tvLegalDesc")
	private MobileElement legalText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Manage Cookies']")
	@AndroidFindBy(id = "com.td:id/managecookieTitle")
	private MobileElement manageCookies;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TD Canada\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeTextView")
	@AndroidFindBy(id = "com.td:id/managecookieDesc")
	private MobileElement textData;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms of Use']")
	private MobileElement termsOfUse;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='The terms of use you agree to by using EasyWeb or the TD app.']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='The terms of use you agree to by using EasyWeb or the TD app']")
	private MobileElement termsOfUseText;

	// Elements of Mobile Privacy Page

	@AndroidFindBy(id = "com.td:id/webVeiw")
	private MobileElement mobilePrivacyWebView;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='TD Online Privacy | TD Bank Group' or @name = 'Confidentialité en ligne de TD | Groupe Banque TD']")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement mobilePrivacyContent;

	@AndroidFindBy(id = "com.td:id/drawer_layout")
	private MobileElement mobilePrivacyContentLayout;

	/*
	 * // Elements of Mobile Privacy Page used to Validate in IOS
	 * 
	 * // banner element where menu id present
	 * 
	 * @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='banner']") private
	 * MobileElement mobilePrivacyBanner;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeStaticText[@name='How to Contact Us']") private
	 * MobileElement mobilePrivacyHowToContactUs;
	 * 
	 * @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Telephone:']")
	 * private MobileElement mobilePrivacyTelephone;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeStaticText[@name='1-800-430-6095']") private MobileElement
	 * mobilePrivacyHowToContactUsNumber;
	 * 
	 * @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Email Us*:'] ")
	 * private MobileElement mobilePrivacyemailUS;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeStaticText[@name='Questions related to TD Auto Finance (Canada):'] "
	 * ) private MobileElement mobilePrivacyQuestionsRelated;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeStaticText[@name='1-866-694-4392'] ") private MobileElement
	 * mobilePrivacyQuestionsRelatedNumber;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeStaticText[@name='customerfeedback@td.com'] ") private
	 * MobileElement mobilePrivacyemailUsID;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeStaticText[@name='Questions related to TD Insurance:'] ")
	 * private MobileElement mobilePrivacyTDInsurance;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeStaticText[@name='1-888-791-5346'] ") private MobileElement
	 * mobilePrivacyTDInsuranceNumber;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeStaticText[@name='Mail: Customer Feedback, Toronto Dominion Centre,']"
	 * ) private MobileElement mobilePrivacyMail1;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeStaticText[@name='P.O. Box 193, Toronto, ON M5K 1H6']")
	 * private MobileElement mobilePrivacyMail2;
	 * 
	 * @iOSXCUITFindBy(accessibility = "//XCUIElementTypeStaticText[@name='Fax:']")
	 * private MobileElement mobilePrivacyFax;
	 * 
	 * @iOSXCUITFindBy(accessibility =
	 * "//XCUIElementTypeStaticText[@name='1-877-983-2932']") private MobileElement
	 * mobilePrivacyFaxNumber;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Our Privacy Code']") private
	 * MobileElement mobilePrivacyExpandButton1;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Why we ask for your information']")
	 * private MobileElement mobilePrivacyExpandButton2;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand How we obtain your consent']") private
	 * MobileElement mobilePrivacyExpandButton3;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Why we share your information']")
	 * private MobileElement mobilePrivacyExpandButton4;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Why we ask others for information about you']"
	 * ) private MobileElement mobilePrivacyExpandButton5;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand When we release your information']")
	 * private MobileElement mobilePrivacyExpandButton6;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand How we protect your information']")
	 * private MobileElement mobilePrivacyExpandButton7;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Your right to access your information']"
	 * ) private MobileElement mobilePrivacyExpandButton8;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Keeping your information accurate']")
	 * private MobileElement mobilePrivacyExpandButton9;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Respecting your preference']") private
	 * MobileElement mobilePrivacyExpandButton10;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Addressing your concerns']") private
	 * MobileElement mobilePrivacyExpandButton11;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Our Online Privacy Code']") private
	 * MobileElement mobilePrivacyExpandButton12;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Expand Our Mobile Apps Privacy Code']") private
	 * MobileElement mobilePrivacyExpandButton13;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Our Privacy Code']") private
	 * MobileElement mobilePrivacycollapseButton1;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Why we ask for your information']")
	 * private MobileElement mobilePrivacycollapseButton2;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse How we obtain your consent']") private
	 * MobileElement mobilePrivacycollapseButton3;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Why we share your information']")
	 * private MobileElement mobilePrivacycollapseButton4;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Why we ask others for information about you']"
	 * ) private MobileElement mobilePrivacycollapseButton5;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse When we release your information']")
	 * private MobileElement mobilePrivacycollapseButton6;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse How we protect your information']")
	 * private MobileElement mobilePrivacycollapseButton7;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Your right to access your information']"
	 * ) private MobileElement mobilePrivacycollapseButton8;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Keeping your information accurate']")
	 * private MobileElement mobilePrivacycollapseButton9;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Respecting your preference']") private
	 * MobileElement mobilePrivacycollapseButton10;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Addressing your concerns']") private
	 * MobileElement mobilePrivacycollapseButton11;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Our Online Privacy Code']") private
	 * MobileElement mobilePrivacycollapseButton12;
	 * 
	 * @iOSXCUITFindBy(xpath =
	 * "//XCUIElementTypeLink[@name='Collapse Our Mobile Apps Privacy Code']")
	 * private MobileElement mobilePrivacycollapseButton13;
	 */
	// Menu Button in Mobile Privacy Page
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Menu']")
	private MobileElement mobilePrivacyPageMenuButton;

	// // Mobile Privacy Page Header
	// @iOSXCUITFindBy(accessibility = "Mobile Privacy")
	// private MobileElement mobilePrivacyPageHeader;

	// page header of the page loaded when clicked on Menu
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Other TD Sites']")
	private MobileElement mobilePrivacyMenuPageTitle;

	// Mobile Privacy menu page close menu button
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Close Menu']")
	private MobileElement mobilePrivacyCloseMenu;

	// Elements of Privacy and Security Page

	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement titlePrivacyAndSecurity;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Our Online Banking Security Guarantee | TD Bank Group' or @name = 'Notre garantie de sécurité bancaire en ligne | Groupe Banque TD']")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement privacyAndSecurityView;

	// Elements of Legal Page
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement titleLegalPage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='TD Bank Group - Legal Notices and Disclaimers of Liability' or @name = 'Groupe Banque TD - Mentions légales et clauses de non-responsabilité']")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement legalView;

	// Elements of Terms of use page

	// @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='info-circle']")
	// @AndroidFindBy(id = "info icon")
	// private MobileElement termsOfUseISymbolInfo;
	//
	// @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='By using Easy Web
	// or the TDapp, offered by TD Canada Trust and its affiliates, you agree to the
	// terms and conditions of the:']")
	// @AndroidFindBy(xpath =
	// "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
	// private MobileElement termsOfUseInfoMessage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
	private MobileElement termsOfUseInfoMessage;

	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement titleTermsOfUse;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	@AndroidFindBy(id = "com.td:id/financial_service_terms")
	private MobileElement financialServicesTerms;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
	@AndroidFindBy(id = "com.td:id/cardholder_efs_terms")
	private MobileElement cardHolderEFSTerms;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
	@AndroidFindBy(id = "com.td:id/bas_schedule")
	private MobileElement businessAccessServicesSchedule;

	// @iOSXCUITFindBy(accessibility = "Terms and Agreement")
	// @AndroidFindBy(id = "com.td:id/terms_and_agreement")
	// private MobileElement termsAndAgreement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms and Agreement' or @text='Termes et Accord']")
	private MobileElement termsAndAgreement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Disclosure' or @text='Divulgation']")
	private MobileElement disclosure;

	// @AndroidFindBy(xpath = "//android.widget.TextView[@text='for mutual fund
	// accounts held with TD Investment Services Inc.']")
	// private MobileElement disclosureText;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "Navigate up")
	private MobileElement pdfNavigateUP;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	@AndroidFindBy(id = "com.google.android.apps.docs:id/pdf_view")
	private MobileElement FSTContent;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	@AndroidFindBy(id = "com.google.android.apps.docs:id/pdf_view")
	private MobileElement EFSContent;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='TD Canada Trust - EasyWeb - Help']")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement BASCContent;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement TermsAndAgreementContent;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther")
	@AndroidFindBy(id = "android:id/content")
	private MobileElement disclosureContent;

	public synchronized static Privacy_Security_Legal get() {
		if (Privacy_Security_Legal == null) {
			Privacy_Security_Legal = new Privacy_Security_Legal();
		}
		return Privacy_Security_Legal;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	public void verifyPrivacySecurityLegal() {
		try {
			Decorator();
			mobileAction.waitProgressBarVanish();
			// Below code Validates the elements in Privacy Security Legal Page
			mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Legal Title");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(HamMenu, "Verifying Navigation Menu");
			} else {
				mobileAction.verifyElementIsDisplayed(backButton, "Verifying back Button");
			}
			mobileAction.verifyElementIsDisplayed(mobilePrivacy, "Verifying MobilePrivacy");
			// mobileAction.verifyElementIsDisplayed(mobilePrivacyText, "Verifying
			// MobilePrivacy Text");
			mobileAction.verifyElementIsDisplayed(privacyAndSecurity, "Verifying privacy and security");
			// mobileAction.verifyElementIsDisplayed(privacyAndSecurityText, "Verifying
			// privacy and security text");
			mobileAction.verifyElementIsDisplayed(legal, "Verifying legal");
			mobileAction.verifyElementIsDisplayed(termsOfUse, "Verifying terms of use");
			// mobileAction.verifyElementIsDisplayed(termsOfUseText, "Verifying terms of use
			// text");
			mobileAction.verifyElementIsDisplayed(manageCookies, "Verifying Manage Cookies");
			mobileAction.verifyElementIsDisplayed(textData, "Verifying text below Manage cookies");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}

		catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	// Mobile Privacy page validation
	public void verifyMobilePrivacy() {

		try {
			Decorator();

			/*
			 * if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
			 * // Validates Mobile Privacy Page for IOS
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyBanner,
			 * "Verifying Banner is displayed");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyPageMenuButton,
			 * "Verifying Menu button is present or not");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyHowToContactUs,
			 * "Verifying contact us text"); // Swipe up
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyTelephone,
			 * "Verifying telephone ");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyHowToContactUsNumber,
			 * "Verifying telephone number ");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyMail1,
			 * "Verifying mail 1 line");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyMail2,
			 * "Verifying mail 2 line");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyFax,
			 * "Verifying Fax text");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyFaxNumber,
			 * "Verifying Fax Number"); // Swipe up
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyemailUS,
			 * "Verifying Email us text");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyemailUsID,
			 * "Verifying email ID");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyQuestionsRelated,
			 * "Verifying questions text");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyQuestionsRelatedNumber,
			 * "Verifying questions number");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyTDInsurance,
			 * "Verifying TD Insurance");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyTDInsuranceNumber,
			 * "Verifying TD Insurance Number"); // swipe up
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton1,
			 * "Verifying Button 1 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton1,
			 * "Clicking Button1 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton1,
			 * "Verifying Button 1 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton1,
			 * "Clicking on button 1 collapse");
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton2,
			 * "Verifying Button 2 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton2,
			 * "Clicking Button2 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton2,
			 * "Verifying Button 2 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton2,
			 * "Clicking on button 2 collapse");
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton3,
			 * "Verifying Button 3 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton3,
			 * "Clicking Button3 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton3,
			 * "Verifying Button 3 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton3,
			 * "Clicking on button 3 collapse"); // Swipe up
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton4,
			 * "Verifying Button 4 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton4,
			 * "Clicking Button4 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton4,
			 * "Verifying Button 4 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton4,
			 * "Clicking on button 4 collapse");
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton5,
			 * "Verifying Button 5 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton5,
			 * "Clicking Button5 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton5,
			 * "Verifying Button 5 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton5,
			 * "Clicking on button 5 collapse");
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton6,
			 * "Verifying Button 6 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton6,
			 * "Clicking Button6 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton6,
			 * "Verifying Button 6 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton6,
			 * "Clicking on button 6 collapse");
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton7,
			 * "Verifying Button 7 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton7,
			 * "Clicking Button7 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton7,
			 * "Verifying Button 7 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton7,
			 * "Clicking on button 7 collapse");
			 * 
			 * // Swipe UP mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton8,
			 * "Verifying Button 8 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton8,
			 * "Clicking Button8 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton8,
			 * "Verifying Button 8 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton8,
			 * "Clicking on button 8 collapse");
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton9,
			 * "Verifying Button 9 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton9,
			 * "Clicking Button9 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton9,
			 * "Verifying Button 9 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton9,
			 * "Clicking on button 9 collapse");
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton10,
			 * "Verifying Button 10 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton10,
			 * "Clicking Button10 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton10,
			 * "Verifying Button 10 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton10,
			 * "Clicking on button 10 collapse");
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton11,
			 * "Verifying Button 11 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton11,
			 * "Clicking Button 11 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton11,
			 * "Verifying Button 11 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton11,
			 * "Clicking on button 11 collapse"); // Swipe up
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton12,
			 * "Verifying Button 12 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton12,
			 * "Clicking Button 12 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton12,
			 * "Verifying Button 12 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton12,
			 * "Clicking on button 12 collapse");
			 * 
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacyExpandButton13,
			 * "Verifying Button 13 expand");
			 * mobileAction.FuncClick(mobilePrivacyExpandButton13,
			 * "Clicking Button 13 expand");
			 * mobileAction.verifyElementIsDisplayed(mobilePrivacycollapseButton13,
			 * "Verifying Button 13 collapse");
			 * mobileAction.FuncClick(mobilePrivacycollapseButton13,
			 * "Clicking on button 13 collapse");
			 * 
			 * } else {
			 */
			mobileAction.FuncClick(mobilePrivacy, "Click Mobile Privacy Button");
			mobileAction.waitProgressBarVanish();
			// mobileAction.verifyElementIsDisplayed(mobilePrivacyWebView, "Verifying Mobile
			// Privacy WebView");
			mobileAction.verifyElementIsDisplayed(mobilePrivacyContent,
					"Verifying Mobile Privacy Content is present or not");
			mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Title Header Legal");
			mobileAction.ClickBackButton();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyPrivacyAndSecurity() {
		try {
			Decorator();

			// the below code clicks on Privacy and Security and validates the page
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(privacyAndSecurity, "Click Privacy and Security");
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(titlePrivacyAndSecurity, "Verifying Privacy and Security Title");
			mobileAction.verifyElementIsDisplayed(privacyAndSecurityView,
					"Verifying Privacy and Security Page Content");
			mobileAction.ClickBackButton();
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

	public void verifyLegal() {
		try {
			Decorator();

			// the below code clicks on Legal and validates the page
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(legal, "Click Legal");
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(titleLegalPage, "Verifying Legal Title");
			mobileAction.verifyElementIsDisplayed(legalView, "Verifying Legal Content");
			mobileAction.ClickBackButton();
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

	public void verify_Terms_Of_Use() {
		try {
			Decorator();

			// the below code clicks on Terms Of Use and validates the page
			mobileAction.waitProgressBarVanish();
			mobileAction.waitForElement(termsOfUse);
			mobileAction.FuncClick(termsOfUse, "Click Terms Of Use");
			mobileAction.waitProgressBarVanish();
			// mobileAction.verifyElementIsDisplayed(termsOfUseISymbolInfo, "Verifying I
			// symbol is displayed or not");
			mobileAction.verifyElementIsDisplayed(termsOfUseInfoMessage, "Verifying Info Message is Displayed or not");
			mobileAction.verifyElementIsDisplayed(titleTermsOfUse, "Verifying Terms Of Use Title");
			mobileAction.verifyElementIsDisplayed(financialServicesTerms, "Verifying Financial Services Terms");
			mobileAction.verifyElementIsDisplayed(cardHolderEFSTerms, "Verifying cardHolder EFS Terms");
			mobileAction.verifyElementIsDisplayed(businessAccessServicesSchedule,
					"Verifying Business Access Services Schedule");
			mobileAction.waitForElement(termsAndAgreement);
			mobileAction.verifyElementIsDisplayed(termsAndAgreement, "Verifying Terms and Agreement");
			mobileAction.verifyElementIsDisplayed(disclosure, "Verifying Disclosure");

			// below functions clicks for the above elements and verify whether associated
			// pages were loading or not.

			mobileAction.FuncClick(financialServicesTerms, "Clicking on Financial Services Terms");
			mobileAction.verifyElementIsDisplayed(FSTContent,
					"Verifying Financial Services Terms PDF Document is loaded");
			mobileAction.ClickBackButton();
			// mobileAction.waitForElement(pdfNavigateUP);
			// mobileAction.FuncClick(pdfNavigateUP, "Clicking Back Button");

			mobileAction.FuncClick(cardHolderEFSTerms, "Clicking on cardHolder EFS Terms");
			mobileAction.verifyElementIsDisplayed(EFSContent, "Verifying Card Holder and EFS PDF is loaded ");
			mobileAction.ClickBackButton();
			// mobileAction.FuncClick(pdfNavigateUP, "Clicking back Button");

			mobileAction.FuncClick(businessAccessServicesSchedule, "Clicking on business access services schedule");
			mobileAction.verifyElementIsDisplayed(BASCContent, "expected pdf is displayed");
			mobileAction.verifyElementIsDisplayed(backButton, "verifying back Button is present");
			mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Action Bar title is present");
			mobileAction.ClickBackButton();

			mobileAction.waitProgressBarVanish();
			mobileAction.waitForElement(termsAndAgreement);
			mobileAction.FuncClick(termsAndAgreement, "Clicking on Terms and agreement");
			mobileAction.verifyElementIsDisplayed(TermsAndAgreementContent, "Verifying Terms and Agreement Content");
			mobileAction.verifyElementIsDisplayed(backButton, "verifying back Button is present");
			mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Action Bar title is present");
			mobileAction.ClickBackButton();

			mobileAction.FuncClick(disclosure, "Clicking on Disclosure");
			mobileAction.verifyElementIsDisplayed(disclosureContent, "Verifying Terms and Agreement Content");
			mobileAction.verifyElementIsDisplayed(backButton, "verifying back Button is present");
			mobileAction.verifyElementIsDisplayed(titleLegal, "Verifying Action Bar title is present");
			mobileAction.ClickBackButton();

			mobileAction.ClickBackButton();

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

}
