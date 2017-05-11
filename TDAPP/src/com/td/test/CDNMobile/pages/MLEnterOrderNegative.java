package com.td.test.CDNMobile.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreenMIT;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

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
	
	@iOSFindBy(xpath = "//*[@label='Important Information' or @label='Renseignements importants']")//@Author - Sushil 02-Mar-2017
	@AndroidFindBy(xpath="//android.widget.Button[@NAF='true' and @index=2]")
	private MobileElement monthNextButton;

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
	
	public void selectDateSpecify_Android()
	{
		Decorator();
		try
		{
			Calendar now = Calendar.getInstance();

			//System.out.println(now.getTime());
			String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
			String sCurrentDay = format2.split(";")[0];
			String sCurrentDate = format2.split(";")[1];
			String sCurrentMonth = format2.split(";")[2];
			System.out.println(sCurrentDay);
			//System.out.println(now.getActualMaximum(Calendar.MONTH));
			
			String sExpiryDate = "17";
			int iSelectDate = 1;
			String xpathDate = "";

			if((now.getActualMaximum(Calendar.DAY_OF_MONTH) == Integer.parseInt(sCurrentDate)))
			{
					mobileAction.FuncClick(monthNextButton, "monthNextButton");
					iSelectDate = 3;
					xpathDate = "//android.view.View[@content-desc='"+ iSelectDate + "']";
					mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),Integer.toString(iSelectDate));
			}
			else if((Integer.parseInt(sCurrentDate) < Integer.parseInt(sExpiryDate)) && !sCurrentDay.equalsIgnoreCase("FRI"))
			{
				iSelectDate = Integer.parseInt(sCurrentDate) + 1;
				xpathDate = "//android.view.View[@content-desc='"+ iSelectDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),Integer.toString(iSelectDate));
			}
			else if((Integer.parseInt(sCurrentDate) < Integer.parseInt(sExpiryDate)) && sCurrentDay.equalsIgnoreCase("FRI"))
			{
				iSelectDate = Integer.parseInt(sCurrentDate) + 3;
				xpathDate = "//android.view.View[@content-desc='"+ iSelectDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),Integer.toString(iSelectDate));
			}
			else if(sCurrentDate.equalsIgnoreCase(sExpiryDate))
			{
				xpathDate = "//android.view.View[@content-desc='"+ sCurrentDate + "']";
				mobileAction.FuncClick((MobileElement) CL.GetDriver().findElement(By.xpath(xpathDate)),sCurrentDate);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

/*public static void main(String args[])
	{
	//MainScreenMIT.get().OpenApp();
	//Test();
	
	Calendar now = Calendar.getInstance();

	//System.out.println(now.getTime());
	String format2 = new SimpleDateFormat("EE;d;MMM;yyyy", Locale.ENGLISH).format(now.getTime());
	String sCurrentDay = format2.split(";")[0];
	String sCurrentDate = format2.split(";")[1];
	String sCurrentMonth = format2.split(";")[2];
	System.out.println(sCurrentDay);
	//System.out.println(now.getActualMaximum(Calendar.MONTH));
	
	String sExpiryDate = "17";
	int iSelectDate = 1;
	String xpathDate = "";

	if((now.getActualMaximum(Calendar.DAY_OF_MONTH) == Integer.parseInt(sCurrentDate)))
	{
			mobileAction.FuncClick(monthNextButton, "monthNextButton");
			iSelectDate = 3;
			xpathDate = "//android.view.View[@content-desc='"+ iSelectDate + "']";
			CL.GetDriver().findElement(By.xpath(xpathDate));
	}
	else if((Integer.parseInt(sCurrentDate) < Integer.parseInt(sExpiryDate)) && !sCurrentDay.equalsIgnoreCase("FRI"))
	{
		iSelectDate = Integer.parseInt(sCurrentDate) + 1;
		xpathDate = "//android.view.View[@content-desc='"+ iSelectDate + "']";
		CL.GetDriver().findElement(By.xpath(xpathDate));
	}
	else if((Integer.parseInt(sCurrentDate) < Integer.parseInt(sExpiryDate)) && sCurrentDay.equalsIgnoreCase("FRI"))
	{
		iSelectDate = Integer.parseInt(sCurrentDate) + 3;
		xpathDate = "//android.view.View[@content-desc='"+ iSelectDate + "']";
		CL.GetDriver().findElement(By.xpath(xpathDate));
	}
	else if(sCurrentDate.equalsIgnoreCase(sExpiryDate))
	{
		xpathDate = "//android.view.View[@content-desc='"+ sCurrentDate + "']";
		CL.GetDriver().findElement(By.xpath(xpathDate));
	}

	}*/


}