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

public class Confirm_Payee extends _CommonPage {

	private static Confirm_Payee Confirm_Payee;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Confirm']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Confirm']")
	private MobileElement confirm_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Payee Name']")
	private MobileElement payee_Name;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Access Card']")
	private MobileElement access_Card;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Add Payee']")
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Add Payee']")
	private MobileElement addPayee_Btn;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay This Payee']")
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Pay This Payee']")
	private MobileElement payThisPayee;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Thank You!')]")
	private MobileElement successMsg;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pay Bill']")
	private MobileElement payBill_Header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Select Payee']")
	private MobileElement select_Payee;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Pay Bill']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Pay Bill']")
	private MobileElement pay_Bill;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Invalid transaction amount.')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement errorMsg;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtPayee']")
	private MobileElement payee_Table;

	@iOSFindBy(xpath = "//*[@name='PAYBILL_VIEW_PAYEE']/../XCUIElementTypeStaticText[2]")
	private MobileElement ios_payee_Table_name;

	@iOSFindBy(xpath = "//*[@name='PAYBILL_VIEW_PAYEE']/../XCUIElementTypeStaticText[3]")
	private MobileElement ios_payee_Table_number;

	public synchronized static Confirm_Payee get() {
		if (Confirm_Payee == null) {
			Confirm_Payee = new Confirm_Payee();
		}
		return Confirm_Payee;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will confirms the canadian payee is added
	 * 
	 * @return void
	 * @throws Exception
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyConfirmPage() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(confirm_Header, "Confirm");
			// mobileAction.verifyElementIsDisplayed(payee_Name, "Payee Name");
			// mobileAction.verifyElementIsDisplayed(access_card, "Access
			// Card");
			mobileAction.FuncClick(addPayee_Btn, "AddPayee");
			mobileAction.waitForElementToVanish(progressBar);

			// mobileAction.verifyElementIsDisplayed(successMsg, "Thank You!");
			mobileAction.FuncSwipeWhileElementNotFound(payThisPayee, true, 5, "up");
			mobileAction.waitForElementToVanish(progressBar);
			if (mobileAction.verifyElementIsPresent(payBill_Header)) {
				String addedPayee;
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					addedPayee = mobileAction.getValue(ios_payee_Table_name);
					addedPayee = addedPayee + " " + mobileAction.getValue(ios_payee_Table_number);
				} else {
					addedPayee = mobileAction.getValue(payee_Table);
				}

				System.out.println("Captured Added payee:" + addedPayee);
				String expectedPayee = getTestdata("Description") + " "
						+ CL.getTestDataInstance().TCParameters.get("Payee");
				System.out.println("Expected added payee:" + expectedPayee);
				mobileAction.verifyTextEquality(addedPayee, expectedPayee);
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

	/**
	 * This method will verify the error message when invalid amount is entered
	 * 
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 */

	public void ConfirmPayee_InvalidAmount() {

		try {
			Decorator();

			mobileAction.verifyElementIsDisplayed(confirm_Header, "Confirm");
			mobileAction.FuncClick(pay_Bill, "Pay Bill");
			mobileAction.waitForElementToVanish(progressBar);
			String err = mobileAction.getValue(errorMsg);
			mobileAction.verifyElementIsDisplayed(errorMsg, err);

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