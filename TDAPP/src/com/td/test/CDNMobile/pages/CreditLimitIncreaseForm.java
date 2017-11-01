package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CreditLimitIncreaseForm extends _CommonPage {

	private static CreditLimitIncreaseForm creditLimitIncrease;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement creditLimitIncrease_header;

	String webViewContext = "NATIVE_APP";

	public synchronized static CreditLimitIncreaseForm get() {
		if (creditLimitIncrease == null) {
			creditLimitIncrease = new CreditLimitIncreaseForm();
		}
		return creditLimitIncrease;
	}

	private void Decorator() {

		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void verifyCreditLimitIncreaseFormTitle() {
		
		Set<String> allContexthandles = (Set<String>) CL.GetAppiumDriver().getContextHandles();
		System.out.println("Context:"+ allContexthandles.toString());
		boolean isSetcontextDone = false;
		for (String contextFound : allContexthandles ) {
			if(contextFound.contains("NATIVE")) {
				continue;
			}
			try {
				//Thread.sleep(10000);
//				ChromeOptions myChromOptions= new ChromeOptions();
//				myChromOptions.addArguments("--whitelisted-ips=''");
//				ChromeDriver driver = new ChromeDriver(myChromOptions);
				CL.GetAppiumDriver().context(contextFound);
				String myURL = CL.GetAppiumDriver().getCurrentUrl();
				if (!myURL.isEmpty()) {
					System.out.println("MyURL:"+myURL);
					isSetcontextDone = true;
					webViewContext = contextFound;
					System.out.println("Set context to:" + webViewContext);
					break;
				}
			} catch (Exception e) {
				System.out.println("Failed to set context to:" + contextFound);
			}
		}
		
		if (isSetcontextDone) {
			try {

				final WebElement form_Title = CL.GetDriver().findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
				String capturedText = form_Title.getText();
//				final WebElement form_Title = CL.GetDriver().findElement(By.xpath("//div[@class='td-layout-fluidrow td-margin-bottom-large width-btn']/a"));
//				String capturedText = form_Title.getText();
//				System.out.println(capturedText);
//				form_Title.click();
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

}