package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddCanadian_Payee extends _CommonPage {

	private static AddCanadian_Payee AddCanadian_Payee;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Add Canadian Payee']")
	private MobileElement addCanadianPayee_Header;

	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[5]/XCUIElementTypeTextField[1] | "
			+ "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[6]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='accountNumber']")
	private MobileElement payee_AccountNum;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[8]/XCUIElementTypeTextField[1] | "
			+ "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[9]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='description_label']/../android.widget.EditText")

	private MobileElement description;
	

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Done']")
	private MobileElement done;

	@iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeWebView[1]/**/XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='btn']")
	private MobileElement continue_Button;

	@iOSFindBy(xpath = "//*[@label='Search for Canadian payees']")
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@text,'Search for Canadian payees')]")
	private MobileElement search_payee_editbox;

	public synchronized static AddCanadian_Payee get() {
		if (AddCanadian_Payee == null) {
			AddCanadian_Payee = new AddCanadian_Payee();
		}
		return AddCanadian_Payee;
	}

	private void Decorator() {
		PageFactory.initElements(

				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(20, TimeUnit.SECONDS)), this);

	}
	
	private boolean init_search_payee() {

		String searchForText = getTextInCurrentLocale(StringArray.ARRAY_SEARCH_FOR);
		String searchforxpath = "//android.widget.EditText[contains(@text,'" + searchForText
				+ "') or contains(@content-desc,'" + searchForText + "') or @index='0']";
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			searchforxpath = "//*[contains(@label,'"+searchForText+"')]";
		}

		try {
			mobileAction.sleep(5000);
			search_payee_editbox =(MobileElement) mobileAction.verifyWebElementUsingXPath(searchforxpath, "Search payee field");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * This method will add canadian payee
	 * 
	 * @return void
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
	public void addCanadianPayee_page() {
		try {
			Decorator();

			// String payee_value=getTestdata("Payee");
			String payee_value = getTestdata("Payee");
			String payee_number = mobileAction.FuncGetValByRegx(payee_value, "\\d+");
			String payee_name = payee_value.replaceAll(payee_number, "").trim();

			// generate a random payee number with the given length
			int length_payeeNumber = payee_number.length();
			String newPayeeNumber = "";
			int randFund;
			for (int i = 0; i < length_payeeNumber; i++) {
				randFund = (int) (Math.random() * 9);
				newPayeeNumber = newPayeeNumber + randFund;
			}
			System.out.println("New payee number:" + newPayeeNumber);

			// Save the new payee number for late verification
			CL.getTestDataInstance().TCParameters.put("Payee", newPayeeNumber);

			String firstThreeChars = payee_name.substring(0, 3);
			if(!init_search_payee()) {
				mobileAction.Report_Fail("Init Search Payee Element");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
			mobileAction.FuncSendKeys(search_payee_editbox, firstThreeChars);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}

			String selectedPayee;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				selectedPayee = "//*[@label='" + payee_name + "']";
			} else {
				selectedPayee = "//android.widget.Button[@content-desc='" + payee_name + "' or @text='" + payee_name
						+ "']";
			}
			mobileAction.FuncSwipeWhileElementNotFoundByxpath(selectedPayee, true, 10, "up");

			Thread.sleep(2000);

			mobileAction.FuncClick(payee_AccountNum, "PayeeAccount");

			mobileAction.FuncSendKeys(payee_AccountNum, newPayeeNumber);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}

			// String description_value=getTestdata("Description");
			String description_value = getTestdata("Description");
			mobileAction.FuncClick(description, "Description");
			mobileAction.FuncSendKeys(description, description_value);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClickDone();
			} else {
				mobileAction.FuncHideKeyboard();
			}

			mobileAction.FuncClick(continue_Button, "Continue");
			Thread.sleep(5000);
			mobileAction.waitProgressBarVanish();

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
