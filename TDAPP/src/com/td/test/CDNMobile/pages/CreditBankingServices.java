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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CreditBankingServices extends _CommonPage {

	private static CreditBankingServices creditBankingService;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/landing_row_title']")
	private MobileElement order_foreign_currency_link;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/landing_row_description']")
	private MobileElement order_foreign_currency_copy;

	public synchronized static CreditBankingServices get() {
		if (creditBankingService == null) {
			creditBankingService = new CreditBankingServices();
		}
		return creditBankingService;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);

	}

	public void VerifyCreditBankingServicePageHeader() {
		Decorator();
		try {

			String titleText = getTextInCurrentLocale(StringArray.ARRAY_OFX_TITLE);
			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(), titleText);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyCreditBankingServicesContent() {
		Decorator();
		try {

			VerifyCreditBankingServicePageHeader();

			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_link,
					getTextInCurrentLocale(StringArray.ARRAY_ORDER_FOREIGN_CURRENCY));
			mobileAction.verifyElementTextIsDisplayed(order_foreign_currency_copy,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_COPY_TEXT));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void clickOrderForeignCurrency() {
		Decorator();
		try {

			mobileAction.FuncClick(order_foreign_currency_link,
					getTextInCurrentLocale(StringArray.ARRAY_ORDER_FOREIGN_CURRENCY));

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
