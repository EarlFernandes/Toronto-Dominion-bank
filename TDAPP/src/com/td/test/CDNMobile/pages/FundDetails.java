package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FundDetails extends _CommonPage {
    private static FundDetails fundDetails;

	@iOSFindBy(xpath = "//*[@label='Fund Details']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement FundDetails_header;
	
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Purchase']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/purchaseBtn']")
    private MobileElement Purchase;
    
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Call']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/callBtn']")
    private MobileElement CallBtn;
    
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Quote']")
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quoteBtn']")
    private MobileElement QuoteBtn;
    
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Good 'til, Day')]")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/fund_facts_view']//android.widget.TextView")
    private MobileElement fund_facts_view_text;
//
//    @iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Agree']")
//    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Agree']")
//    private MobileElement AgreeButton;

    @iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
    private MobileElement progressBar;

    public synchronized static FundDetails get() {
		if (fundDetails == null) {
		    fundDetails = new FundDetails();
		}
		return fundDetails;
    }

    private void Decorator() {
	PageFactory.initElements(
		new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)),
		this);
    }


    /**
     * This method will click Purchase button in FundDetails page.
     * 
     * @return void
     * @throws InterruptedException 
     *             In case an exception occurs while clicking over the element.
     * @throws IOException
     *             If there is problem while reporting.
     * @throws NoSuchElementException
     *             In case the element is not found over the screen.
     */
    public void click_PurchaseButton(){
    	
    	Decorator();
    	try {
    		mobileAction.FuncClick(Purchase, "Purchase");
    		mobileAction.waitForElementToVanish(progressBar);
    		
    	}catch (IOException | NoSuchElementException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
    	}
    	
    }
    
    public void VerifyFundDetailsPageHeader(){
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(FundDetails_header, "Fund Details | Avis");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}    	
    }
    
    public void VerifyFundDetailsInformationInChinese(){
		Decorator();
		try {

			//mobileAction.verifyElementTextIsDisplayed(FundDetails_header, "Fund Details | Avis");
			
			mobileAction.verifyElementTextIsDisplayed(Purchase, "买入| 買入");
			mobileAction.verifyElementTextIsDisplayed(CallBtn, "致电 | 致電 ");
			mobileAction.verifyElementTextIsDisplayed(QuoteBtn, "报价| 報價 ");
			
			String []expectedText = {"市场价值 |市場價值", "帐面价值 | 賬面價值", "此帐户的投资组合百分比 | 此賬戶的投資組合百分比", 
					"所持单位数 |所持單位數","单位价格 | 單位價格","未实现收益/亏损 | 未實現收益/虧損 "};
			int lengthOfText = expectedText.length;
			System.out.println("Expected fund details number:" + lengthOfText);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				List<MobileElement> InfoList = ((MobileDriver) CL.GetDriver()).findElementsByXPath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[@index='1']/android.widget.LinearLayout/android.widget.TextView");
				int size = InfoList.size();
				System.out.println("Capture fund details number:" + (size+1));
				if(size != lengthOfText-1){
					System.out.println("The number of fund details not match");
					mobileAction.Report_Fail("Fun Details not match");
				}
				for(int i=0; i<size; i++){
					mobileAction.verifyElementTextIsDisplayed(InfoList.get(i), expectedText[i]);
				}
			}			
			mobileAction.verifyElementTextIsDisplayed(fund_facts_view_text, "查看基金概況（表现和費用| 查看基金概況（表現和費用 ");
			
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}    	
    }


}
