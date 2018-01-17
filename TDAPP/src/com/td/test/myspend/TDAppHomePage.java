package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TDAppHomePage extends _CommonPage {

	private static TDAppHomePage TDAppHomePage;

	public synchronized static TDAppHomePage get() {
		if (TDAppHomePage == null) {
			TDAppHomePage = new TDAppHomePage();
		}
		return TDAppHomePage;
	}

	String platform = null;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'TD for Me')]")
	private MobileElement homePageheader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'TD MySpend')]")
	private MobileElement tdMySpend;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Menu') or contains(@name,'Menu')]")
	private MobileElement menu;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Home') or contains(@name,'Home')]")
	private MobileElement home;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	/**
	 * This method will verify the 'TD App' header page.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void verifyPageHeader() throws InterruptedException {

		Decorator();

		try {

			mobileAction.FuncClick(menu, "Side Menu Bar");
			mobileAction.FuncClick(home, "Home");
			

			mobileAction.verifyElementIsDisplayed(homePageheader, "Home Page Header");

		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}

	/**
	 * This method will verify the 'TD App' header page.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickTDMySpend() throws InterruptedException {

		Decorator();

		try {
			mobileAction.FuncClick(tdMySpend, "TD My Spend");

		} catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		
		}
	}

}
