package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

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
	
	public void verifyCreditLimitIncreaseHeader() {
		Decorator();
		String creditLimitIncreaseText=getTextInCurrentLocale(StringArray.ARRAY_CREDIT_LIMIT_INCREASE_HEADER);
		try {
			mobileAction.verifyTextEquality(mobileAction.getValue(creditLimitIncrease_header),creditLimitIncreaseText);
		}catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	

}