package com.td.test.CDNMobile.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.TimeOutDuration;
//import io.appium.java_client.pagefactory.iOSFindBy;

public class WebViewPage extends _CommonPage {

	private static WebViewPage webViewpage;

	String webViewContext = "NATIVE_APP";

	public synchronized static WebViewPage get() {
		if (webViewpage == null) {
			webViewpage = new WebViewPage();
		}
		return webViewpage;
	}

	// private void Decorator() {
	//
	// PageFactory.initElements(
	// new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15,
	// TimeUnit.SECONDS)), this);
	//
	// }

	public boolean setWebViewContext() {
		Set<String> allContexthandles = (Set<String>) CL.GetAppiumDriver().getContextHandles();
		System.out.println("Context:" + allContexthandles.toString());
		boolean isSetcontextDone = false;
		for (String contextFound : allContexthandles) {
			if (contextFound.contains("NATIVE")) {
				continue;
			}
			try {

				CL.GetAppiumDriver().context(contextFound);
				String myURL = CL.GetAppiumDriver().getCurrentUrl();
				if (!myURL.isEmpty()) {
					System.out.println("MyURL:" + myURL);
					isSetcontextDone = true;
					webViewContext = contextFound;
					System.out.println("Set context to:" + webViewContext);
					break;
				}
			} catch (Exception e) {
				System.out.println("Failed to set context to:" + contextFound);
			}
		}
		return isSetcontextDone;
	}

	public void verifyCreditLimitIncreaseFormTitle() {
		mobileAction.sleep(10000); 	//Browser loading time
		if (setWebViewContext()) {
			try {

				final WebElement form_Title = CL.GetDriver().findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
				String capturedText = form_Title.getText();
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.verifyTextEquality(capturedText,
						getTextInCurrentLocale(StringArray.ARRAY_CLIP_FORM_TITLE));
			} catch (Exception e) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.Report_Fail("Failed to find Form Title");
				return;
			}
		} else {
			mobileAction.Report_Fail("Failed to set context");
		}
	}

	public void verifyDamagedCardReplacementFormTitle() {

		if (setWebViewContext()) {
			try {

				final WebElement form_Title = CL.GetDriver().findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
				String capturedText = form_Title.getText();
				System.out.println("Captured title:"+ capturedText);
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.verifyTextEquality(capturedText,
						getTextInCurrentLocale(StringArray.ARRAY_DM_REQUEST_FORM_TITLE));
			} catch (Exception e) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.Report_Fail("Failed to find Form Title");
				return;
			}
		} else {
			mobileAction.Report_Fail("Failed to set context");
		}
	}

	public void Click_GetStarted() {

		try {
			CL.GetAppiumDriver().context(webViewContext);
			final WebElement get_started = CL.GetDriver().findElement(By.id("before-app-btn"));
			Actions action = new Actions(CL.GetDriver());
			action.moveToElement(get_started).build().perform();
			get_started.click();
			CL.GetAppiumDriver().context("NATIVE_APP");
		} catch (Exception e) {
			CL.GetAppiumDriver().context("NATIVE_APP");
			mobileAction.Report_Fail("Failed to find Get_Started Button");
			return;
		}
	}
	
	private boolean verifyFormInfo(String formtitle) {
		if (setWebViewContext()) {
			try {
				final WebElement form_Title = CL.GetDriver().findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
				String capturedText = form_Title.getText();				
				mobileAction.verifyTextEquality(capturedText,formtitle);
				final WebElement personal_info = CL.GetDriver().findElement(By.xpath("//h3[@translate='ABOUT_YOU.PERSONAL_TITLE']/strong"));
				capturedText = personal_info.getText();
				mobileAction.verifyTextEquality(capturedText,
						getTextInCurrentLocale(StringArray.ARRAY_FORM_INFORMATION));
				CL.GetAppiumDriver().context("NATIVE_APP");
				return true;
			} catch (Exception e) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.Report_Fail("Failed to find Form Title");
				return false;
			}
		} else {
			System.out.println("Failed to set context");
			return false;
		}
	}

	public void verifyLimitIncreaseForm() {
		String CLIP_Form_Title = getTextInCurrentLocale(StringArray.ARRAY_CLIP_FORM_TITLE);
		if(verifyFormInfo(CLIP_Form_Title)) {
			mobileAction.Report_Pass_Verified("CLIP Prefilled Form");
		} else {
			mobileAction.Report_Fail_Not_Verified("CLIP prefilled Form");
		}		
	}
	
	public void verifyDamagedCardForm() {
		String DC_Form_Title = getTextInCurrentLocale(StringArray.ARRAY_DM_REQUEST_FORM_TITLE);
		if(verifyFormInfo(DC_Form_Title)) {
			mobileAction.Report_Pass_Verified("DC Prefilled Form");
		} else {
			mobileAction.Report_Fail_Not_Verified("DC prefilled Form");
		}		
	}

}