package com.td.test.CDNMobile.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class MIT_DSH_TermsOfUse extends _CommonPage  {
	
	
	private static MIT_DSH_TermsOfUse MIT_DSH_TermsOfUse;

	public synchronized static MIT_DSH_TermsOfUse get() {
		if (MIT_DSH_TermsOfUse == null) {
			MIT_DSH_TermsOfUse = new MIT_DSH_TermsOfUse();
		}
		return MIT_DSH_TermsOfUse;
	
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	@iOSFindBy(xpath = "//*[@label='Terms of Use' or contains(@label,'Conditions') or @label='使用条款' or @label='使用條款']")
	@AndroidFindBy(xpath = "//*[@text='Terms of Use' or contains(@text,'Conditions') or @text='使用条款' or @text='使用條款']")
	private MobileElement btnTermsofUse;
	
	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//*[(@text='Terms of Use' or @text='Conditions d'utilisation' or @text='使用条款' or @text='使用條款') and @resource-id='android:id/action_bar_title']")
	private MobileElement lblTermsofUse;
	
		
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']/../following-sibling::XCUIElementTypeOther[1]/*/*/*/*[1]")
	//@AndroidFindBy(xpath = "//*[(@text='Terms of Use' or @text='Conditions d’utilisation' or @text='使用条款' or @text='使用條款') and @resource-id='android:id/action_bar_title']/../following-sibling::XCUIElementTypeOther[1]/*/*/*/*[3]/*[1]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='info icon' or @content-desc='icône info']/../*[2]")
	private MobileElement info;
	
	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']/../following-sibling::XCUIElementTypeOther[1]/*/*/*/*[1]/*[1]")
	//@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='android:id/action_bar_title']")
	@AndroidFindBy(id = "com.td:id/financial_service_terms")
	private MobileElement financial;
	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']/../following-sibling::XCUIElementTypeOther[1]/*/*/*/*[2]/*[1]")
	//@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='android:id/action_bar_title']")
	@AndroidFindBy(id = "com.td:id/cardholder_efs_terms")
	private MobileElement cardHolder;
	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']/../following-sibling::XCUIElementTypeOther[1]/*/*/*/*[3]/*[1]")
	//@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='android:id/action_bar_title']")
	@AndroidFindBy(id = "com.td:id/bas_schedule")
	private MobileElement business;
	
	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']/../following-sibling::XCUIElementTypeOther[1]/*/*/*/*[4]/*[1]")
	//@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='android:id/action_bar_title']")
	@AndroidFindBy(id = "com.td:id/terms_and_ageement")
	private MobileElement terms;
	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']/../following-sibling::XCUIElementTypeOther[1]/*/*/*/*[5]/*[1]")
	@AndroidFindBy(xpath = "//*[@text='Disclosure' or @text='Déclaration' or @text='道明投资服务有限公司' or @text='道明投資服務有限公司']")
	//@AndroidFindBy(id = "com.td:id/cardholder_efs_terms")
	private MobileElement discloser;
	
	
	@iOSFindBy(xpath = "//*[@name='TDVIEW_TITLE']/../following-sibling::XCUIElementTypeOther[1]/*/*/*/*[5]/*[2]")
//	@AndroidFindBy(xpath = "//*[(@text='Contact Us' or @text='Contacter nous' or @text='联系我们' or @text='聯絡我們') and @resource-id='android:id/action_bar_title']")
	//@AndroidFindBy(id = "com.td:id/cardholder_efs_terms")
	@AndroidFindBy(xpath = "//*[contains(@text,'for mutual') or contains(@text,'relative aux') or @text='所持互惠基金账户声明披露' or @text='所持互惠基金賬戶之聲明披露']")
	private MobileElement mutual;
	
	@iOSFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	MobileElement BT_Back;
	
	
	
	public void verifyTermsOfUse() {
		Decorator();
		try {
					Thread.sleep(1000);	
			
			mobileAction.FuncSwipeWhileElementNotFound(btnTermsofUse, false, 10, "up");
			mobileAction.FuncVerifyTextEquals(btnTermsofUse,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_TERMSOFUSE));
						
			mobileAction.FuncClick(btnTermsofUse, "btnTermsofUse");
			
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) 
			{
				
				mobileAction.verifyElementIsDisplayed(BT_Back, "on clicking terms of use on homepage title terms of use is displayed");	
		
				
			}
			
			else{
				
				mobileAction.verifyElementIsDisplayed(lblTermsofUse, "lblTermsofUse");		
			}
			
			
			
			
			mobileAction.verifyElementIsDisplayed(info, "info");		
			//mobileAction.FuncVerifyTextEquals(info,
					//getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_INFO));
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncVerifyTextEquals(financial,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_FINANCIALLINK));	
		
			}
			else{
				mobileAction.FuncVerifyTextEquals(financial,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_FINANCIALLINK));			
				mobileAction.FuncClick(financial, "financial");			
				mobileAction.verifyElementIsDisplayed(lblTermsofUse, "lblTermsofUse");			
				mobileAction.FuncClick(BT_Back, "< Button");	
			}
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			
				mobileAction.FuncVerifyTextEquals(cardHolder,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_CARDHOLDERLINK));
			
			}
			
			
			else{
				mobileAction.FuncVerifyTextEquals(cardHolder,
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_CARDHOLDERLINK));		
				mobileAction.FuncClick(cardHolder, "cardHolder");			
				mobileAction.verifyElementIsDisplayed(lblTermsofUse, "lblTermsofUse");			
				mobileAction.FuncClick(BT_Back, "< Button");
				
			}
			
			
			
			mobileAction.FuncVerifyTextEquals(business,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_BUSINESSLINK));
			mobileAction.FuncClick(business, "business");
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) 
			{
				mobileAction.FuncClick(BT_Back, "< Back Button on business page clicked");
				
			}
			
			else{
			mobileAction.verifyElementIsDisplayed(lblTermsofUse, "lblTermsofUse");
			mobileAction.FuncClick(BT_Back, "< Button");
			
			}
			mobileAction.FuncVerifyTextEquals(terms,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_TERMSLINK));			
			mobileAction.FuncClick(terms, "terms");	
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) 
			{
				mobileAction.FuncClick(BT_Back, "< Back Button on terms page clicked");
				
			}
			
			else{
			
			
			mobileAction.verifyElementIsDisplayed(lblTermsofUse, "lblTermsofUse");			
			mobileAction.FuncClick(BT_Back, "< Button");
			}
			
			mobileAction.FuncVerifyTextEquals(discloser,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_DISCLOSURELINK));		
			mobileAction.FuncClick(discloser, "discloser");	
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) 
			{
				mobileAction.FuncClick(BT_Back, "< Back Button on discloser page clicked");
				
			}
			
			
			
			else
			{
			mobileAction.verifyElementIsDisplayed(lblTermsofUse, "lblTermsofUse");			
			mobileAction.FuncClick(BT_Back, "< Button");
			
			}
			mobileAction.FuncVerifyTextEquals(mutual,
					getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_TERMS_MUTUALLINK));
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
