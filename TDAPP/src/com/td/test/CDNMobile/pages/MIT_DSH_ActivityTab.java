package com.td.test.CDNMobile.pages;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import com.td.test.framework.MobileAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSH_ActivityTab  extends _CommonPage  {
	
	private static MIT_DSH_ActivityTab MIT_DSH_ActivityTab;
	
	public synchronized static MIT_DSH_ActivityTab get() {
		if (MIT_DSH_ActivityTab == null) {
			MIT_DSH_ActivityTab = new MIT_DSH_ActivityTab();
		}
		return MIT_DSH_ActivityTab;
	
	}
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;
	
	@iOSFindBy(xpath = "//*[@label='My Accounts' or @label='Mes comptes' or @label='我的账户' or @label='我的賬戶']")
	@AndroidFindBy(xpath = "//*[@text='My Accounts' or @text='Mes comptes' or @text='我的账户' or @text='我的賬戶']")
	private MobileElement flyoutMyAccountLink;
	
	@iOSFindBy(xpath = " //*[contains(@label,'ACCOUNTS') or contains(@label,'COMPTES')]") // @Author
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView']")
    private MobileElement defaultTradeAccount;
	
	
	String accNumber = getTestdata("Accounts", "UserIDs").trim();// @Author -

    String xpathAccount = "//*[contains(@text,'" + accNumber + "') or contains(@label,'" + accNumber + "')]";
	
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Activity' or contains(@label,'Activité')]") // @Author
	@AndroidFindBy(id = "com.td:id/activityTab")
	private MobileElement activityTab;
	
	
	
	@iOSXCUITFindBy(accessibility = "INVESTING_ACTIVITY_DATE_BUTTON")
	@AndroidFindBy(id = "com.td:id/textview_left")
	private MobileElement lblDateSettle;
	
	
	@iOSXCUITFindBy(accessibility = "INVESTING_ACTIVITY_DES_BUTTON")
	@AndroidFindBy(id = "com.td:id/textview_center")
	private MobileElement lblDetails;
	
	
	@iOSXCUITFindBy(accessibility = "INVESTING_ACTIVITY_AMOUNT_BUTTON")
	@AndroidFindBy(id = "com.td:id/textview_right")
	private MobileElement lblAmount;
	
	
	
	@iOSXCUITFindBy(accessibility = "Button_0")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement description;
	
	
	
	
	
	
	public void verifyActivityDetailsUI() {
		Decorator();
		try {
			
			int iCnt=0;
			String sXPathAnd = null;
			String descReg = null;
			String desc = null;
			String sXPathAndAmount = null;
			String sXPathAnddate = null;
			String sXPathiOS = null;
			String sXPathiOSAmount = null;
			String sXPathiOSdate = null;
			
			
			
	
	
	
		    MIT_DSHQuickLinks.get().goToDashboardHome();
 
		
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
            mobileAction.FuncClick(flyoutMyAccountLink, "My Accounts Flyout Menu");
						

			mobileAction.waitForElement(defaultTradeAccount);
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccount, true, 60, "up");

			mobileAction.verifyElementIsDisplayed(activityTab, "activityTab");
			mobileAction.FuncClick(activityTab, "activityTab");
			
			mobileAction.verifyElementIsDisplayed(lblDateSettle, "lblDateSettle");
			
			mobileAction.verifyElementIsDisplayed(lblDetails, "lblDetails");
			
			
			mobileAction.verifyElementIsDisplayed(lblAmount, "lblAmount");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//sXPathAnd = "//android.widget.TextView[@resource-id='com.td:id/description']";
			

	/*		
			for (WebElement meSymbol : CL.GetDriver().findElements(By.id("com.td:id/description"))) {

                if ((mobileAction.FuncGetValByRegx(mobileAction.FuncGetElementText(meSymbol), "([0-9]+[' ']+[@])").length()>0)) {

                	               	
                       break;

                } else
                {
                         
						iCnt++;
                mobileAction.FuncSwipeOnce("up");
                }
				}
			*/
			
			
			
			
			
			sXPathAnd = "//android.widget.TextView[@resource-id='com.td:id/description' and contains(@text,' @')]";
			sXPathAndAmount = "//android.widget.TextView[@resource-id='com.td:id/amount' and contains(@text,'$')]";
			sXPathAnddate = "//android.widget.TextView[@resource-id='com.td:id/date_settle' and contains(@text,'/')]";
			
			sXPathiOS = "//XCUIElementTypeStaticText[contains(@label,' @')]";
			sXPathiOSAmount = "//XCUIElementTypeStaticText[contains(@label,'$')]";
			sXPathiOSdate = "//XCUIElementTypeStaticText[contains(@label,'/')]";
			
			
			
			
			
			
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			
			{
			
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXPathAnd, false, 20, "up");
			
			
			
			String saction = CL.GetDriver().findElement(By.xpath(sXPathAnd)).getText().split("@")[0];
	    	String sprice = CL.GetDriver().findElement(By.xpath(sXPathAnd)).getText().split("@")[1];
	    	
	    	
	    	String sbuy = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY);
	    	String ssell = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL);
	    	
	    	
	    	
	    	
	    	
	    	if((mobileAction.FuncGetValByRegx(saction, "(([" + sbuy + "]+)|([" + ssell +"]+))([' ']+)([0-9]+)([' ']+)").length()>=1)&&(sprice.contains("$")))
	    		//if((saction.contains(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY))||saction.contains(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL)))&&((mobileAction.FuncGetValByRegx(saction, "(([' ']+)([0-9]+)([' ']+))").length()>=1))&&(sprice.contains("$")))																																																	
	    	//if((saction.contains(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY))||saction.contains(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL)))&&((mobileAction.FuncGetValByRegx(saction, "(' ')+([0-9]+)+(' ')").length()>=1))&&(sprice.contains("$")))    
	    	{ 		
	    		
	    		mobileAction.verifyTextContains((MobileElement)CL.GetDriver().findElement(By.xpath(sXPathAndAmount)),"$");
	    		mobileAction.verifyTextContains((MobileElement)CL.GetDriver().findElement(By.xpath(sXPathAnddate)),"/");
	    		CL.GetReporting().FuncReport("Pass", "Action and price is present, Amount is displayed and date/settle is displayed");
	    		
	    		}
	    		
	    	else{
	    		
	    		CL.GetReporting().FuncReport("Fail", "Action and price not present, Amount is not displayed and date/settle is not displayed");
	    		
	    	}
	    	
	    	
	    	
			}
			
			else{
				
				
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXPathiOS, false, 5, "up");
				
				
				
				String saction = CL.GetDriver().findElement(By.xpath(sXPathiOS)).getText().split("@")[0];
		    	String sprice = CL.GetDriver().findElement(By.xpath(sXPathiOS)).getText().split("@")[1];
		    	
		    	
		    	String sbuy = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY);
		    	String ssell = getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL);
		    	
		    	
		    	
		    	
		    	
		    	if((mobileAction.FuncGetValByRegx(saction, "(([" + sbuy + "]+)|([" + ssell +"]+))([' ']+)([0-9]+)([' ']+)").length()>=1)&&(sprice.contains("$")))
		    		//if((saction.contains(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY))||saction.contains(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL)))&&((mobileAction.FuncGetValByRegx(saction, "(([' ']+)([0-9]+)([' ']+))").length()>=1))&&(sprice.contains("$")))																																																	
		    	//if((saction.contains(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONBUY))||saction.contains(getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_ACTIONSELL)))&&((mobileAction.FuncGetValByRegx(saction, "(' ')+([0-9]+)+(' ')").length()>=1))&&(sprice.contains("$")))    
		    	{ 		
		    		
		    		mobileAction.verifyTextContains((MobileElement)CL.GetDriver().findElement(By.xpath(sXPathiOSAmount)),"$");
		    		mobileAction.verifyTextContains((MobileElement)CL.GetDriver().findElement(By.xpath(sXPathiOSdate)),"/");
		    		CL.GetReporting().FuncReport("Pass", "Action and price is present, Amount is displayed and date/settle is displayed");
		    		
		    		}
		    		
		    	else{
		    		
		    		CL.GetReporting().FuncReport("Fail", "Action and price not present, Amount is not displayed and date/settle is not displayed");
		    		
		    	}
		    	
		    	
		    	
				}
				
				
				
				
				
				
				
				
			}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		/*	//////////////////////////////////////////////////////////
			
			for (int i=0; i < 10; i++)
			{
				sXPathAnd = "//android.widget.TextView[@resource-id='com.td:id/description']";
				sXPathAndAmount = "//android.widget.TextView[@resource-id='com.td:id/amount']";
				sXPathAnddate = "//android.widget.TextView[@resource-id='com.td:id/date_settle']";
		    if(mobileAction.verifyTextContains((MobileElement)CL.GetDriver().findElements(By.xpath(sXPathAnd)).get(i)," @"))
		    {
		    	
		    	String saction = CL.GetDriver().findElements(By.xpath(sXPathAnd)).get(i).getText().split("@")[0];
		    	String sprice = CL.GetDriver().findElements(By.xpath(sXPathAnd)).get(i).getText().split("@")[1];
		    	
		    	if(saction.contains("BUY")||saction.contains("SELL")&&(sprice.contains("$")))
		    		
		    		
		    	{
		    		
		    		
		    		mobileAction.verifyTextContains((MobileElement)CL.GetDriver().findElements(By.xpath(sXPathAndAmount)).get(i),"$");
		    		mobileAction.verifyTextContains((MobileElement)CL.GetDriver().findElements(By.xpath(sXPathAnddate)).get(i),"/");
		    		CL.GetReporting().FuncReport("Pass", "Action and price is present, Amount is displayed and date/settle is displayed");
		    		
		    		
		    		
		    		break;
		    		
		    	}
		    		
		    		
		    	else{
		    		
		    		CL.GetReporting().FuncReport("Fail", "Action and price not present, Amount is not displayed and date/settle is not displayed");
		    		
		    	}
		    		
		    				    	
		    }		
		    
		    else  {
		    	
		    	 mobileAction.FuncSwipeOnce("up");
		    }
			
			
		    
			}
		    
		    
		    
		    ///////////////////////////////////////////////
		    
		    
		    */
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		/*	
			//sXPathAnd = "//android.widget.TextView[@resource-id='com.td:id/description' and contains(@text,'" + des +"')]";
			
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXPathAnd, true, 60, "up");
			
			}		
			descReg = mobileAction.FuncGetValByRegx(mobileAction.FuncGetText(description), "([0-9]+[@])");
			
			sXPathAnd = "//android.widget.TextView[@resource-id='com.td:id/description' and contains(@text,'" + descReg +"')]";
						
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(sXPathAnd, true, 60, "up");
			
			
			*/
			
			
			
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}
		

}
