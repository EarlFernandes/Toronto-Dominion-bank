package com.td.test.CDNMobile.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.TimeOutDuration;
//import io.appium.java_client.pagefactory.iOSFindBy;

public class WebViewPage extends _CommonPage {

	private static WebViewPage webViewpage;

	String webViewContext = "NATIVE_APP";

	// @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='TD Credit
	// Card Limit Increase Request']")
	// @AndroidFindBy(xpath =
	// "//android.widget.EditText[@resource-id='com.td:id/amountEditText' or
	// (@resource-id='com.td:id/edtAmt' and @index='1')]")
	// private MobileElement TD_CLI_Request;
	//
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@label='Yes, I want to cancel']/XCUIElementTypeStaticText[@label='Yes, I want to cancel']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/amountEditText' or (@resource-id='com.td:id/edtAmt' and @index='1')]")
	private MobileElement TD_Web_Confirm_Cancel;

	public synchronized static WebViewPage get() {
		if (webViewpage == null) {
			webViewpage = new WebViewPage();
		}
		return webViewpage;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);
	}

	public boolean setWebViewContext() {
		try {
			Thread.sleep(20000); // Wait 20 second for web page to load
		} catch (Exception e) {

		}
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

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}

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

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}

		if (setWebViewContext()) {
			try {

				final WebElement form_Title = CL.GetDriver().findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
				String capturedText = form_Title.getText();
				System.out.println("Captured title:" + capturedText);
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
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}

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
				mobileAction.verifyTextEquality(capturedText, formtitle);
				final WebElement personal_info = CL.GetDriver()
						.findElement(By.xpath("//h3[@translate='ABOUT_YOU.PERSONAL_TITLE']/strong"));
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
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}
		String CLIP_Form_Title = getTextInCurrentLocale(StringArray.ARRAY_CLIP_FORM_TITLE);
		if (verifyFormInfo(CLIP_Form_Title)) {
			mobileAction.Report_Pass_Verified("CLIP Prefilled Form");
		} else {
			mobileAction.Report_Fail_Not_Verified("CLIP prefilled Form");
		}
	}

	public void verifyDamagedCardForm() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}
		String DC_Form_Title = getTextInCurrentLocale(StringArray.ARRAY_DM_REQUEST_FORM_TITLE);
		if (verifyFormInfo(DC_Form_Title)) {
			mobileAction.Report_Pass_Verified("DC Prefilled Form");
		} else {
			mobileAction.Report_Fail_Not_Verified("DC prefilled Form");
		}
	}

	public void verifyCreditLimitIncreaseWebpageAndCancel() {
		
		WebDriver driver;
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if(!setWebViewContext()) {
					System.out.println("Failed to set web view context");
					mobileAction.Report_Fail("Failed to set web view context");
					return;
				} else {
					driver = CL.GetDriver();
				}
		} else {
			driver = webDriver;
		}
		try {

			final WebElement form_Title = driver.findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
			String capturedText = form_Title.getText();
			// CL.GetAppiumDriver().context("NATIVE_APP");
			mobileAction.verifyTextEquality(capturedText,
					getTextInCurrentLocale(StringArray.ARRAY_CLIP_FORM_TITLE));
			WebElement cancel_btn = driver.findElement(By.xpath("//div[@class='td-col-xs-12']/a[@id='cancel-app']"));
			Actions action = new Actions(driver);
			action.moveToElement(cancel_btn).build().perform();

			mobileAction.javaScriptClick(driver,cancel_btn);
			//CL.GetAppiumDriver().context("NATIVE_APP");

		} catch (Exception e) {
			e.printStackTrace();
			CL.GetAppiumDriver().context("NATIVE_APP");
			mobileAction.Report_Fail("Failed to click cancel");
			return;
		}
		 
	}

	public void confirmCancel() {
		WebDriver driver;
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			driver = CL.GetDriver();
		} else {
			driver = webDriver;
		}

		WebElement cancelApp = driver.findElement(By.id("cancelApp"));
		Actions action = new Actions(driver);
		action.moveToElement(cancelApp).build().perform();
		mobileAction.javaScriptClick(driver,cancelApp);

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			WebElement returnToTDApp = driver.findElement(By.linkText("Return to TD app"));
			action = new Actions(driver);
			action.moveToElement(returnToTDApp).build().perform();
			mobileAction.javaScriptClick(driver,returnToTDApp);
		} else {
			WebElement yesTolaunchTDApp = driver.findElement(By.linkText("Yes"));
			WebElement noTolaunchTDApp = driver.findElement(By.linkText("No thanks"));
			mobileAction.javaScriptClick(driver,yesTolaunchTDApp);
		}

	}
	
	public void verifyDamageCardWebpageAndCancel() {
		
		WebDriver driver;
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				if(!setWebViewContext()) {
					System.out.println("Failed to set web view context");
					mobileAction.Report_Fail("Failed to set web view context");
					return;
				} else {
					driver = CL.GetDriver();
				}
		} else {
			driver = webDriver;
		}
		try {

			final WebElement form_Title = driver.findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
			String capturedText = form_Title.getText();
			// CL.GetAppiumDriver().context("NATIVE_APP");
			mobileAction.verifyTextEquality(capturedText,
					getTextInCurrentLocale(StringArray.ARRAY_DM_REQUEST_FORM_TITLE));
			WebElement cancel_btn = driver.findElement(By.xpath("//div[@class='td-col-xs-12']/a[@id='cancel-app']"));
			Actions action = new Actions(driver);
			action.moveToElement(cancel_btn).build().perform();

			mobileAction.javaScriptClick(driver,cancel_btn);
			//CL.GetAppiumDriver().context("NATIVE_APP");

		} catch (Exception e) {
			e.printStackTrace();
			CL.GetAppiumDriver().context("NATIVE_APP");
			mobileAction.Report_Fail("Failed to click cancel");
			return;
		}
		 
	}

}