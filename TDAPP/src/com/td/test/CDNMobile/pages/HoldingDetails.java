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

public class HoldingDetails extends _CommonPage {
	private static HoldingDetails HoldingDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Buy' or @label='Acheter']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/buyBtn']")
	private MobileElement Buy;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Sell' or @label='Vendre']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/sellBtn']")
	private MobileElement Sell;

	// @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Trade']")
	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Trade' or @label='Négociation']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement trade_header;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Holding Details']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Holding Details']")
	private MobileElement HoldingDetails_header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Day') or @label='Jour']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and (@text='Day' or @text='Jour')]")
	private MobileElement Good;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Agree' or @label='Accepte']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and (@text='Agree' or @text='Accepte') ]")
	private MobileElement AgreeButton;

	public synchronized static HoldingDetails get() {
		if (HoldingDetails == null) {
			HoldingDetails = new HoldingDetails();
		}
		return HoldingDetails;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)), this);

	}

	public void verify_Account_CADCash() {
		String FromAccount = getTestdata("FromAccount");
		String accountName = null;
		String action_buy = null;
		String action_sell = null;
		try {
			Decorator();
			mobileAction.FuncClick(Buy, "Buy");
			Thread.sleep(3000);
			mobileAction.waitProgressBarVanish();
			String verify_trade = "Verifying Trade Page Header";
			mobileAction.verifyElementIsDisplayed(trade_header, verify_trade);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				accountName = "//XCUIElementTypeStaticText[@label='" + FromAccount + "']";
			} else {
				accountName = "//android.widget.TextView[@resource-id='com.td:id/selectedValue' and @text='"
						+ FromAccount + "']";
			}
			MobileElement accountXpath = mobileAction.mobileElementUsingXPath(accountName);
			mobileAction.verifyElementIsDisplayed(accountXpath, "Selected Account");

			String s = getTestdata("Action");
			String s1[] = s.split(":");

			mobileAction.FuncSwipeOnce("up");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				action_buy = "//XCUIElementTypeStaticText[@label='" + s1[0] + "']";
			} else {
				action_buy = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='" + s1[0]
						+ "']";
			}
			MobileElement actionBuy = mobileAction.mobileElementUsingXPath(action_buy);

			mobileAction.verifyElementIsDisplayed(actionBuy, "Action Buy");

			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(Good, "Good 'til, Day");
			mobileAction.FuncClickBackButton();
			mobileAction.FuncClick(AgreeButton, "Agree");
			mobileAction.waitProgressBarVanish();
			mobileAction.FuncClick(Sell, "Sell");
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(accountXpath, "Selected Account");

			mobileAction.FuncSwipeOnce("up");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				action_sell = "//XCUIElementTypeStaticText[@label='" + s1[1] + "']";

			} else {

				action_sell = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='" + s1[1]
						+ "']";
			}

			MobileElement actionSell = mobileAction.mobileElementUsingXPath(action_sell);

			mobileAction.verifyElementIsDisplayed(actionSell, "Action Sell");

			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(Good, "Good 'til, Day");
			Thread.sleep(3000);
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

	public void verify_Account_US_MarginShort() {
		String FromAccount = getTestdata("FromAccount");
		String accountName = null;
		String action_buy = null;
		String action_sell = null;
		try {
			Decorator();
			mobileAction.FuncClick(Buy, "Buy");
			Thread.sleep(3000);
			String verify_trade = "Verifying Trade Page Header";
			mobileAction.verifyElementIsDisplayed(trade_header, verify_trade);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				accountName = "//XCUIElementTypeStaticText[@label='" + FromAccount + "']";
			} else {
				accountName = "//android.widget.TextView[@resource-id='com.td:id/selectedValue' and @text='"
						+ FromAccount + "']";
			}
			MobileElement accountXpath = mobileAction.mobileElementUsingXPath(accountName);
			mobileAction.verifyElementIsDisplayed(accountXpath, "Selected Account");
			String s = getTestdata("Action");
			String s1[] = s.split(":");
			mobileAction.FuncSwipeOnce("up");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				action_buy = "//XCUIElementTypeStaticText[@label='" + s1[0] + "']";

			} else {

				action_buy = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='" + s1[0]
						+ "']";
			}

			MobileElement actionBuy = mobileAction.mobileElementUsingXPath(action_buy);

			mobileAction.verifyElementIsDisplayed(actionBuy, "Action Buy");
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(Good, "Good 'til, Day");
			mobileAction.FuncClickBackButton();

			if (mobileAction.verifyElementIsPresent(AgreeButton)) {
				mobileAction.FuncClick(AgreeButton, "Agree");
			}

			mobileAction.waitProgressBarVanish();

			mobileAction.FuncClick(Sell, "Sell");
			mobileAction.waitProgressBarVanish();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				accountName = "//XCUIElementTypeStaticText[@label='" + FromAccount + "']";
			} else {
				accountName = "//android.widget.TextView[@resource-id='com.td:id/selectedValue' and @text='"
						+ FromAccount + "']";
			}
			MobileElement accountXpath1 = mobileAction.mobileElementUsingXPath(accountName);
			mobileAction.verifyElementIsDisplayed(accountXpath1, "Selected Account");
			mobileAction.FuncSwipeOnce("up");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				action_sell = "//XCUIElementTypeStaticText[@label='" + s1[1] + "']";

			} else {

				action_sell = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='" + s1[1]
						+ "']";
			}

			MobileElement actionSell = mobileAction.mobileElementUsingXPath(action_sell);

			mobileAction.verifyElementIsDisplayed(actionSell, "Action Sell");
			mobileAction.FunctionSwipe("up", 200, 200);
			mobileAction.verifyElementIsDisplayed(Good, "Good 'til, Day");
			Thread.sleep(3000);
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

	/**
	 * This method will click Buy button in HoldingDetails page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void click_BuyButton() {

		try {
			Decorator();
			String verify_HoldingDetails = "Verifying HoldingDetails Page Header";
			mobileAction.verifyElementIsDisplayed(HoldingDetails_header, verify_HoldingDetails);
			mobileAction.FuncClick(Buy, "Buy");

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
