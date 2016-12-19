package com.td.CMOB.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Mobile_Deposit_Page extends _CommonPage {
	private static Mobile_Deposit_Page Mobile_Deposit_Page;

	@iOSFindBy(xpath = "//*[@label='Mobile Deposit']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Mobile Deposit']")
	private MobileElement mobile_deposit_header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'We')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'We']")
	private MobileElement validation_firstLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'not eligible to use TD Mobile Deposit at this time.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[ends-with(@text,'not eligible to use TD Mobile Deposit at this time')]")
	private MobileElement validation_secondLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'To deposit a cheque using the TD')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'To deposit a cheque using the TD')]")
	private MobileElement validation_thirdLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Be a TD Canada Trust customer')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Be a TD Canada Trust customer')]")
	private MobileElement validationfourthLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Have at least one eligible Chequing or Savings account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Have at least one eligible Chequing or Savings account')]")
	private MobileElement validation_fifthLine;

	@iOSFindBy(xpath = "//*[starts-with(@label,'To make a deposit, please visit a Branch or ATM')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'To make a deposit, please visit a Branch or ATM')]")
	private MobileElement validation_sixthLine;

	public synchronized static Mobile_Deposit_Page get() {
		if (Mobile_Deposit_Page == null) {
			Mobile_Deposit_Page = new Mobile_Deposit_Page();
		}
		return Mobile_Deposit_Page;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");

	}

	/**
	 * This method is used for Verify eligibility declined error message is
	 * displayed when customers Access Card type is not 000, 001, 032. 033 or
	 * 037
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 *
	 */
	public void mobile_Dpst_Validation_Page() {

		System.out.println("Trial for Page factory class");
		Decorator();
		try {
			String mobile_Header_value = "Mobile Deposit";

			String firstLine_Value = "We";
			String secondLine_Value = "not eligible to use TD Mobile Deposit at this time";
			String t_thirdLine_Value = "To deposit a cheque using the TD";
			String t_fourthLine_Value = "Be a TD Canada Trust customer";
			String t_fifthLine_Value = "Have at least one eligible Chequing or Savings account";
			String t_sixthLine_Value = "To make a deposit,please visit a Branch or ATM";

			mobileAction.verifyElementIsDisplayed(mobile_deposit_header, mobile_Header_value);
			System.out.println(mobile_deposit_header.isDisplayed());
			// System.out.println(CL.GetDriver().getPageSource());

			mobileAction.verifyElementIsDisplayed(validation_firstLine, firstLine_Value);
			System.out.println(validation_firstLine.isDisplayed());

			mobileAction.verifyElementIsDisplayed(validation_secondLine, secondLine_Value);

			System.out.println(validation_secondLine.isDisplayed());

			mobileAction.verifyElementIsDisplayed(validation_thirdLine, t_thirdLine_Value);

			mobileAction.verifyElementIsDisplayed(validationfourthLine, t_fourthLine_Value);

			mobileAction.verifyElementIsDisplayed(validation_fifthLine, t_fifthLine_Value);

			mobileAction.verifyElementIsDisplayed(validation_sixthLine, t_sixthLine_Value);

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
