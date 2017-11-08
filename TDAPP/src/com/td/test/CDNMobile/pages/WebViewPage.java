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

	public void verifyLimitIncreaseForm() {
		if (setWebViewContext()) {
			mobileAction.Report_Pass_Verified("prefilled Form Verified");
		} else {
			mobileAction.Report_Fail_Not_Verified("prefilled Form Verified");
		}
	}

}