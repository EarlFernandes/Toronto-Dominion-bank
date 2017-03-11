package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreenMIT;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class MLEnterOrderNegative extends _CommonPage{
	
    private static MLEnterOrderNegative MLEnterOrderNegative;
    
	public synchronized static MLEnterOrderNegative get() {
		if (MLEnterOrderNegative == null) {
			MLEnterOrderNegative = new MLEnterOrderNegative();
		}
		return MLEnterOrderNegative;
	}
	private void Decorator()
		{
		PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver)CL.GetDriver()),new TimeOutDuration(15,TimeUnit.SECONDS)),this);	
	}

	public void searchAndSelectAccount()
	{
		String sRapcode = "P";
		String xpathAccount = "";
		boolean flag = false;
		String sAccount="";
		int sCount = 0;
		int sSwipeCount = 0;
		int sSwipes = 60;
		try
		{
			
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
		xpathAccount = "//*[@resource-id='com.td:id/txtAccountNumber']";
		else
		xpathAccount = "//XCUIElementTypeStaticText[@label='ACCOUNT']/../following-sibling::XCUIElementTypeCell/XCUIElementTypeStaticText";
		
		while(!flag && sSwipeCount < sSwipes )
		{
			for(int i=0;i< CL.GetDriver().findElements(By.xpath(xpathAccount)).size();i++)
			{
				sAccount = CL.GetDriver().findElements(By.xpath(xpathAccount)).get(i).getText();
				if(getMatchedAccount(sAccount,sRapcode).length() > 0)
				{
					flag = true;
					CL.GetDriver().findElements(By.xpath(xpathAccount)).get(i).click();
					break;
				}
				sCount = i;

			}
			if(sCount+1 >= CL.GetDriver().findElements(By.xpath(xpathAccount)).size())
			{
				mobileAction.FuncSwipeOnce("up");
				sSwipeCount++;
			}
		}
		if(flag)
			CL.GetReporting().FuncReport("Pass", sAccount + " with rapcode <b>" + sRapcode + "</b> selected." );
		else
			CL.GetReporting().FuncReport("Fail", "No account with rapcode <b>" + sRapcode + "</b> found." );
		}
		catch(Exception e)
		{
			try
			{
				CL.GetReporting().FuncReport("Fail", "Exception.No account with rapcode <b>" + sRapcode + "</b> found." );
				e.printStackTrace();
			}
			catch(Exception e1)
			{
				
			}

		}
	}
	public String getMatchedAccount(String sAccountNum,String sRapCode)
	{
		String sReturnPrice = "";
		String sPattern = "";
		try
		{
				sPattern = sRapCode + "$";
				Pattern p = Pattern.compile("(" + sPattern + ")");
			    Matcher m = p.matcher(sAccountNum);

			    // if an occurrence if a pattern was found in a given string...
			    if (m.find()) {
			        // ...then you can use group() methods.
			        //System.out.println(m.group(0)); // whole matched expression
/*					if(m.group(0).contains(","))
						sReturnPrice = m.group(0).replaceAll(",", ".").trim();
					else*/
						sReturnPrice = m.group(0).trim();
					}
			    }
		//}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sReturnPrice;
	}

/*public static void main(String args[]){
	//MainScreenMIT.get().OpenApp();
	Test();*/
	
//}
}