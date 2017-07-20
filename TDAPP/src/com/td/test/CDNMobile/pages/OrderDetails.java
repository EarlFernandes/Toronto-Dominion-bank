package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OrderDetails extends _CommonPage {
	private static OrderDetails OrderDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Change Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Change Order']")
	private MobileElement changeOrderButton;

	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter your trading password']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/editTextPassword']")
	private MobileElement tradingPasswordEditText;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Preview Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btnContinue' and @text='Preview Order']")
	private MobileElement previewOrderButton;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Send Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Send Order']")
	private MobileElement sendOrderButton;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Agree']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Agree']")
	private MobileElement agreeButton;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='done']")
	private MobileElement doneButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'The change to your order was received')]")
	private MobileElement changeOrderMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Cancel Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/cancel_order_btn' and @text='Cancel Order']")
	private MobileElement cancelOrderButton;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Your request to cancel the order was received.']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Your request to cancel the order was received.']")
	private MobileElement verifySuccessMessageCancelOrder;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	int i = 1;
	String price_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + i + Secondpart;

	public synchronized static OrderDetails get() {
		if (OrderDetails == null) {
			OrderDetails = new OrderDetails();
		}
		return OrderDetails;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	/**
	 * This method will click on Change Order Button
	 * 
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

	public void performChangeorder() {
		Decorator();

		try {

			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(changeOrderButton, "Change Order Clicked");
			mobileAction.waitForElementToVanish(progressBar);

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
	 * This method will click on the Cancel Order Button and verify the order is
	 * Cancelled Successfully
	 * 
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

	public void performCancelOrder() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(cancelOrderButton, "Cancel Order Clicked");
				mobileAction.waitForElementToVanish(progressBar);

				mobileAction.FunCSwipeandScroll(tradingPasswordEditText, true);
				mobileAction.FuncClick(tradingPasswordEditText, "tradingPasswordEditText");

				String tradingPasswordEditText_value = getTestdata("tradingPasswordEditText");
				mobileAction.FuncSendKeys(tradingPasswordEditText, tradingPasswordEditText_value);

				mobileAction.FuncClick(doneButton, "doneButton");

				mobileAction.FuncClick(cancelOrderButton, "Cancel order");

				mobileAction.waitForElementToVanish(progressBar);

				mobileAction.verifyElementIsDisplayed(verifySuccessMessageCancelOrder, "Cancel Order");

			} else {
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.FuncClick(cancelOrderButton, "Cancel Order Clicked");
				mobileAction.waitForElementToVanish(progressBar);
				if (!mobileAction.FuncIsDisplayed(tradingPasswordEditText)) {
					mobileAction.FunctionSwipe("up", 200, 100);
				}
				mobileAction.FuncClick(tradingPasswordEditText, "tradingPasswordEditText");
				String tradingPasswordEditText_value = getTestdata("tradingPasswordEditText");
				mobileAction.FuncSendKeys(tradingPasswordEditText, tradingPasswordEditText_value);
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(cancelOrderButton, "Cancel order");
				mobileAction.waitForElementToVanish(progressBar);
				mobileAction.verifyElementIsDisplayed(verifySuccessMessageCancelOrder, "Cancel Order");
			}
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
