package com.td.test.myspend;

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

public class TourPage extends _CommonPage {

	private static TourPage TourPage;

	public synchronized static TourPage get() {
		if (TourPage == null) {
			TourPage = new TourPage();
		}
		return TourPage;
	}

	String platform = null;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Connect using your TD bank app') or contains(@content-desc,'Connect')]")
	private MobileElement connectBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Continue' or @label='Continuer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/skittles_feature_button']")
	private MobileElement continueBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Get Started' or @label='Commencer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/skittles_feature_button']")
	private MobileElement getStartedBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Accept' or @label='Acceptez']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/acceptButton']")
	private MobileElement acceptBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progresssBar;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Open TD MySpend' or @label='Acceptez']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button']")
	private MobileElement openTDMySpend;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Loading your accounts') or contains(@content-desc,'Analyzing your transactions')]")
	private MobileElement loadingAccounts;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'TD MySpend is ready to go') or contains(@label,'Dépense TD peut maintenant être utilisée')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'TD MySpend is ready to go')]")
	private MobileElement MySpendReadyToGo;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'See the TD MySpend') or contains(@label,'Pour en savoir plus')]")
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='fxMsgHeader']")
	private MobileElement fxMsgHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='OK']")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'OK')]")
	private MobileElement okBtn;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	/**
	 * This method will click on the 'Connect using your TD Bank app' button.
	 * 
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void clickConnectTDApp() {

		Decorator();

		try {
			mobileAction.FuncClick(connectBtn, "Connect button");

		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "InterruptedException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "IOException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will go through the registration flow
	 * 
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void registrationFlow() {

		Decorator();

		try {
			mobileAction.FuncClick(continueBtn, "Continue");
			mobileAction.FuncClick(continueBtn, "Continue");
			mobileAction.FuncClick(getStartedBtn, "Get Started");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.FuncClick(acceptBtn, "Accept");
			mobileAction.waitForElementToVanish(progresssBar);
			mobileAction.FuncClick(openTDMySpend, "Open TD My Spend");
			mobileAction.FunctionSwipe("Left", 200, 200);
			mobileAction.FunctionSwipe("Left", 200, 200);
			mobileAction.FunctionSwipe("Left", 200, 200);
			mobileAction.FunctionSwipe("Left", 200, 200);
			mobileAction.FuncClick(MySpendReadyToGo, "TD My Spend is ready to go");
			if (mobileAction.verifyElementIsPresent(fxMsgHeader)) {
				mobileAction.FuncClick(okBtn, "OK");
			}

		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "InterruptedException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "IOException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

}
