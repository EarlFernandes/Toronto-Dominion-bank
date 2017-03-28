package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MobileDeposit extends _CommonPage {
	private static MobileDeposit MobileDeposit;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Mobile Deposit']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Mobile Deposit']")
	private MobileElement mobile_Deposit_Header;
	
	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Deposit Cheque']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/MobileDeposit_DepositCheque_Header_TextView' and @text='Deposit Cheque']")
	private MobileElement dpstCheque_Btn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'We')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/enrollment_headertitle1' and starts-with(@text,'We')]")
	private MobileElement validation_FirstLine;
	

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'not eligible to use TD Mobile Deposit at this time.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/enrollment_headertitle_subtitle_1' and contains(@text,'not eligible to use TD Mobile Deposit at this time')]")
	private MobileElement validation_SecondLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'To deposit a cheque using the TD')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'To deposit a cheque using the TD')]")
	private MobileElement validation_ThirdLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Be a TD Canada Trust customer')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text,'Be a TD Canada Trust customer')]")
	private MobileElement validationFourthLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Have at least one eligible Chequing or Savings account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Have at least one eligible Chequing')]")
	private MobileElement validation_FifthLine;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[starts-with(@label,'To make a deposit, please visit a Branch or ATM')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'To make a deposit')]")
	private MobileElement validation_SixthLine;

	
	String mobile_Header_value = "Mobile Deposit";

	public synchronized static MobileDeposit get() {
		if (MobileDeposit == null) {
			MobileDeposit = new MobileDeposit();
		}
		return MobileDeposit;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(10, TimeUnit.SECONDS)),
				this);
		

	}

	/**
	 * This method is used for Verify eligibility declined error message is
	 * displayed when customers Access Card type is not 000, 001, 032. 033 or
	 * 037
	 * 
	 * @return void
	 * @throws IOException 
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 *
	 */
	public void mobile_Dpst_Validation_Page() throws IOException {

	
		Decorator();
		try {
			
			mobileAction.verifyElementIsDisplayed(mobile_Deposit_Header, mobile_Header_value);
			mobileAction.verifyElementIsDisplayed(validation_FirstLine, ConstantClass.firstLine_Value);
			mobileAction.verifyElementIsDisplayed(validation_SecondLine,ConstantClass.secondLine_Value);
			mobileAction.verifyElementIsDisplayed(validation_ThirdLine, ConstantClass.t_thirdLine_Value);
			//mobileAction.verifyElementIsDisplayed(validationfourthLine, ConstantClass.t_fourthLine_Value);
			mobileAction.verifyElementIsDisplayed(validation_FifthLine, ConstantClass.t_fifthLine_Value);
			mobileAction.verifyElementIsDisplayed(validation_SixthLine, ConstantClass.t_sixthLine_Value);

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will verify the Mobile_Deposit_Header
	 * 
	 * @return void
	 * @throws IOException 
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 *
	 */
	public void verifyDepositHeader() throws IOException {

	
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(mobile_Deposit_Header, mobile_Header_value);
		}
		catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
}
	
	/**
	 * This method will Click the DepositCheque
	 * 
	 * @return void
	 * @throws IOException 
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 *
	 */
	public void depositCheque()  {

	
		Decorator();
		try {
			mobileAction.FuncClick(dpstCheque_Btn, "DepositCheque");
		}
		catch (NoSuchElementException  | IOException  |InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
}
}
