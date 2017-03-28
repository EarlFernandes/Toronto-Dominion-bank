package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InvestingAccountSummary extends _CommonPage {
	private static InvestingAccountSummary InvestingAccountSummary;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Balances']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/balancesTab' and @text='Balances']")
	private MobileElement llbBalance;

	String progressBar = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']";

	String iOSProgressBar = "//XCUIElementTypeActivityIndicator[@label='In progress' or @label='En cours']";

	String strAccount = getTestdata("Account");
	String strAcc[] = strAccount.split(":");

	String platformName = CL.getTestDataInstance().getMobilePlatForm();

	public synchronized static InvestingAccountSummary get() {
		if (InvestingAccountSummary == null) {
			InvestingAccountSummary = new InvestingAccountSummary();
		}
		return InvestingAccountSummary;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will click on the Logout French button
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifySummaryScenario() {
		Decorator();
		boolean flag = true;
		try {

			if (platformName.equalsIgnoreCase("Android")) {

				while (flag) {
					try {
						String accountToSelect = "//*[contains(@text,'" + strAcc[0] + "')]";
						MobileElement accountToSelected = (MobileElement) ((AppiumDriver) CL.GetDriver())
								.findElement(By.xpath(accountToSelect));
						if (accountToSelected.isDisplayed() && llbBalance.isDisplayed()) {
							flag = false;
							break;
						} else {
							mobileAction.FunctionSwipe("left", 2000, 30);
							mobileAction.waitForElementToDisappear(progressBar);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("left", 2000, 30);
						mobileAction.waitForElementToDisappear(progressBar);
					}
				}
				flag = true;
				while (flag) {

					try {
						String accountToSelect = "//*[contains(@text,'" + strAcc[1] + "')]";
						MobileElement accountToSelected = (MobileElement) ((AppiumDriver) CL.GetDriver())
								.findElement(By.xpath(accountToSelect));
						if (accountToSelected.isDisplayed() && llbBalance.isDisplayed()) {
							flag = false;
							break;
						} else {
							mobileAction.FunctionSwipe("right", 2000, 30);
							mobileAction.waitForElementToDisappear(progressBar);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("right", 2000, 30);
						mobileAction.waitForElementToDisappear(progressBar);
					}
				}

			} else {

				while (flag) {
					try {
						String accountToSelect = "//*[contains(@label,'" + strAcc[0] + "')]";
						MobileElement accountToSelected = (MobileElement) ((AppiumDriver) CL.GetDriver())
								.findElement(By.xpath(accountToSelect));
						if (accountToSelected.isDisplayed() && llbBalance.isDisplayed()) {
							flag = false;
							break;
						} else {
							mobileAction.FunctionSwipe("left", 2000, 30);
							mobileAction.waitForElementToDisappear(iOSProgressBar);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("left", 2000, 30);
						mobileAction.waitForElementToDisappear(iOSProgressBar);
					}
				}
				flag = true;
				while (flag) {

					try {
						String accountToSelect = "//*[contains(@label,'" + strAcc[1] + "')]";
						MobileElement accountToSelected = (MobileElement) ((AppiumDriver) CL.GetDriver())
								.findElement(By.xpath(accountToSelect));
						if (accountToSelected.isDisplayed() && llbBalance.isDisplayed()) {
							flag = false;
							break;
						} else {
							mobileAction.FunctionSwipe("right", 2000, 30);
							mobileAction.waitForElementToDisappear(iOSProgressBar);
						}
					} catch (NoSuchElementException e) {
						mobileAction.FunctionSwipe("right", 2000, 30);
						mobileAction.waitForElementToDisappear(iOSProgressBar);
					}
				}
			}
		} catch (Exception e1) {

		}
	}
}
