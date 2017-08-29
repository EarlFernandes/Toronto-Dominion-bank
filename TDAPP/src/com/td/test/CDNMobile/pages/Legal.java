package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Legal extends _CommonPage {
	private static Legal Legal;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Legal']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Legal']")
	private MobileElement legal_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Back']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_Button;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mobile Privacy, How we handle the information we collect when yo']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvPrivacy' and @text='Mobile Privacy']")
	private MobileElement mobile_Privacy;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Privacy & Security, Bank & invest with confidence']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvSecurity' and @text='Privacy & Security']")
	private MobileElement privacy_Security;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Legal, Terms & Conditions']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/tvLegal' and @text='Legal']")
	private MobileElement legal;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Terms of Use, The terms of use you agree to by using EasyWeb or ']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms of Use']")
	private MobileElement termsofuse;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Terms of Use']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Terms of Use']")
	private MobileElement termsofuse_Header;

	public synchronized static Legal get() {
		if (Legal == null) {
			Legal = new Legal();
		}
		return Legal;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	/**
	 * This method will click on the Trade button on Investing page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifylegalpage() {

		try {
			Decorator();
			mobileAction.verifyElementIsDisplayed(legal_Header, "Verifying Legal Header");

			mobileAction.FuncClick(legal, "Click Legal");
			mobileAction.verifyElementIsDisplayed(legal_Header, "Verifying Legal Page Header");
			mobileAction.FuncClick(back_Button, "Back");

			mobileAction.FuncClick(termsofuse, "Click Terms Of Use");
			mobileAction.verifyElementIsDisplayed(termsofuse_Header, "Verifying Terms Of Use");
			mobileAction.FuncClick(back_Button, "Back");

			mobileAction.verifyElementIsDisplayed(mobile_Privacy, "Click Mobile Privacy");

			mobileAction.verifyElementIsDisplayed(privacy_Security, "Click Privacy And Security");

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
}
