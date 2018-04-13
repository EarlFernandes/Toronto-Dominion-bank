package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
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

public class Currency extends _CommonPage {

	private static Currency currency;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeNavigationBar/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement cancel_currency_button;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title_text']")
	private List<MobileElement> currency_list;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeNavigationBar/XCUIElementTypeOther")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement currency_header;

	public synchronized static Currency get() {
		if (currency == null) {
			currency = new Currency();
		}
		return currency;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void VerifyCurrencyPageHeader() {
		Decorator();
		try {
			String titleText = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				titleText = getTextInCurrentLocale(StringArray.ARRAY_OFX_CURRENCY_TITLE_IOS);
			} else {
				titleText = getTextInCurrentLocale(StringArray.ARRAY_OFX_CURRENCY_TITLE);
			}

			mobileAction.verifyElementTextIsDisplayed(currency_header, titleText);
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void randomSelectCurrency() {
		Decorator();
		try {
			int list_size = currency_list.size();
			System.out.println("List size:" + list_size);
			if (list_size == 0) {
				mobileAction.Report_Fail("Failed...No Currency in list");
				System.out.println("Failed...No Currency in list");
				return;
			}

			int randonm = getRandomInRange(0, list_size - 1);
			System.out.println("Random index is:" + randonm);
			String selectedCurrency = mobileAction.getValue(currency_list.get(randonm));
			System.out.println("Currency is selected:" + selectedCurrency);
			// Save to Description for further verification
			CL.getTestDataInstance().TCParameters.put("Description", selectedCurrency);
			
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String expectedXpath ="//XCUIElementTypeStaticText[@label='"+selectedCurrency+"']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(expectedXpath, true, 20, "up");
			} else {
				mobileAction.FuncSwipeWhileElementNotFound(currency_list.get(randonm), true, 20, "up");
			}


//			mobileAction.FuncClick(currency_list.get(randonm), selectedCurrency);

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

	public void cancelSelection() {
		Decorator();
		try {
			mobileAction.FuncClick(cancel_currency_button, "X - Cancel Selection");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
