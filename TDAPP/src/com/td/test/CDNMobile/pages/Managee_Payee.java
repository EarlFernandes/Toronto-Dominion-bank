package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Managee_Payee extends _CommonPage {

	private static Managee_Payee Managee_Payee;

	@iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[@label='Access Card']/../../XCUIElementTypeOther[2]")
	private MobileElement accesscard;

	@iOSFindBy(xpath = "//*[@label='MY PAYEES']")
	private MobileElement myPayees;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText[@label='ACCESS CARD']/../../XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/listView']/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement secondAccessCard;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText[@label='ACCESS CARD']/../../XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='com.td:id/listView']/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement thirdAccessCard;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Add Canadian')]")
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Add Canadian Payee'] | //android.widget.TextView[@content-desc='Add Canadian Payee']")
	private MobileElement addCanadianPayee;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Manage Payees']")
	private MobileElement managePayeeHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='TDVIEW_TITLE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement managePayees;

	// For nexus addpayee class is not a button; for tab3, the class is View not
	// ViewGroup to consolidate that, change to
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.LinearLayout[@index='1'] | //android.view.View/android.widget.LinearLayout[@index='1']")
	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeButton[2]")
	private MobileElement addPayee;

	public synchronized static Managee_Payee get() {
		if (Managee_Payee == null) {
			Managee_Payee = new Managee_Payee();
		}
		return Managee_Payee;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will verify text within elements for the manage payees page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyMyPayeesTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("billsNavRowManagePayee") + "']", "Manage Payees title");

			} else {
				mobileAction
						.verifyElementUsingXPath(
								"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
										+ mobileAction.getAppString("billsNavRowManagePayee") + "']",
								"Manage Payees title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				// System.out.println("source : "+ ((AppiumDriver)
				// CL.GetDriver()).getPageSource());
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("manage_payees_search_hint") + "']",
						"Search for payee");

				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for a specific payee page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifySpecificPayeeTextElements() {
		Decorator();
		try {
			clickSpecificPayee();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				MobileElement header = mobileAction
						.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE']", "header");
				mobileAction.verifyTextEquality(header.getText(), mobileAction.getAppString("mng_payee_view_title"));
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_payee_name") + "']",
						"payee name");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_payee_account") + "']",
						"payee accont");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeStaticText[@value='" + mobileAction.getAppString("str_description") + "']",
						"description");
			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				mobileAction.verifyWebElementUsingXPath(
						"//div[contains(text(),'" + mobileAction.getAppString("str_payee_name") + "')]", "name");
				// final WebElement address =
				// mobileAction.verifyWebElementUsingXPath("(//div[@class='column1
				// ng-binding'])[2]", "address");
				mobileAction.verifyWebElementUsingXPath(
						"//div[contains(text(),'" + mobileAction.getAppString("str_payee_account") + "')]", "account");
				mobileAction.verifyWebElementUsingXPath(
						"//div[contains(text(),'" + mobileAction.getAppString("str_description") + "')]",
						"description");
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void clickSpecificPayee() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String from_accountNo = "//XCUIElementTypeLink[@label='" + getTestdata("Payee") + "']";

				MobileElement fromAccountval = (MobileElement) (CL.GetAppiumDriver())

						.findElement(By.xpath(from_accountNo));
				fromAccountval.click();
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("mng_payee_view_title") + "']", "View title");

			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				String mypayee = getTestdata("Payee");
				mypayee = mypayee.replaceAll(" ", "");
				final WebElement firstPayee = mobileAction.verifyWebElementUsingXPath(
						"//div[@ng-if='payee.AccountNO' and text()='" + mypayee + "']", "Payee");
				firstPayee.click();
				mobileAction.waitProgressBarVanish();
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("mng_payee_view_title") + "']",
						"View title");
			}
		} catch (Exception e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the search payees page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifySearchPayeesTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeOther[@name='TDVIEW_TITLE' and @label='"
						+ mobileAction.getAppString("add_payee_title") + "']", "Add Payee title");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeTextField[@label='" + mobileAction.getAppString("add_cdn_payee_hint") + "']",
						"Search payee");
				final String payeeCountry = mobileAction.getAppString("payee_country");
				if (!StringUtils.isEmpty(payeeCountry)) {
					mobileAction.verifyElementUsingXPath(
							"//XCUIElementTypeStaticText[@label='" + payeeCountry.toUpperCase() + "']",
							"Payee country");
				}
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("canada") + "']", "Canada");
				mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("us") + "']", "US");
				mobileAction.verifyElementUsingXPath("//XCUIElementTypeStaticText[@label='"
						+ mobileAction.getAppString("add_payee_search_instruction") + "']", "Please enter");
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("add_payee_title") + "']",
						"Add Payee title");
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				// System.out.println("source : "+ ((AppiumDriver)
				// CL.GetDriver()).getPageSource());
				mobileAction.verifyWebElementUsingXPath(
						"//input[@placeholder='" + mobileAction.getAppString("add_cdn_payee_hint") + "']",
						"Search for Canadian payee");
				final WebElement payeeCountry = mobileAction
						.verifyWebElementUsingXPath("//div[@class='switch-title ng-binding']", "Payee Country");
				final WebElement canada = mobileAction
						.verifyWebElementUsingXPath("(//li[@ng-repeat='label in labels'])[1]", "Canada");
				final WebElement us = mobileAction.verifyWebElementUsingXPath("(//li[@ng-repeat='label in labels'])[2]",
						"US");
				final WebElement note = mobileAction
						.verifyWebElementUsingXPath("//div[@class='placeholder ng-binding']", "My payees");
				if (!mobileAction.verifyTextEquality(payeeCountry.getText().trim(),
						mobileAction.getAppString("payee_country"))
						|| !mobileAction.verifyTextEquality(canada.getText().trim(), mobileAction.getAppString("ca"))
						|| !mobileAction.verifyTextEquality(us.getText().trim(), mobileAction.getAppString("us"))
						|| !mobileAction.verifyTextEquality(note.getText().trim(),
								mobileAction.getAppString("add_payee_search_instruction"))) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (Exception e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verifyMultipleAccessCards in ManagePayee
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

	public void verifyMultipleAccessCard() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				boolean flag = accesscard.isDisplayed();

				if (flag) {
					mobileAction.verifyElementIsDisplayed(myPayees, "My Payees");
					mobileAction.FuncClick(accesscard, "Accesscard");
					mobileAction.FuncClick(secondAccessCard, "Second Access Card");
					Thread.sleep(2000);
					mobileAction.verifyElementIsDisplayed(myPayees, "My Payees");
					mobileAction.FuncClick(accesscard, "Accesscard");
					mobileAction.FuncClick(thirdAccessCard, "Third Access Card");
					Thread.sleep(2000);
					mobileAction.verifyElementIsDisplayed(addCanadianPayee, "Add Payee");
				}
			} else {
				// For android, using webview to handle

				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				WebElement accessCard = CL.GetDriver().findElement(By.cssSelector("div.dropdown-holder"));
				accessCard.click();
				Thread.sleep(2000);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(secondAccessCard, "Second Access Card");
				Thread.sleep(2000);
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				WebElement mypayees_android = CL.GetDriver().findElement(By.id("myPayees"));
				mobileAction.verifyElementIsDisplayed((MobileElement) mypayees_android, "My Payees");
				accessCard = CL.GetDriver().findElement(By.cssSelector("div.dropdown-holder"));
				accessCard.click();

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(thirdAccessCard, "Second Access Card");
				Thread.sleep(2000);
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				WebElement addPayeeButton = CL.GetDriver()
						.findElement(By.cssSelector("button.primary-button.ng-binding.ng-scope"));
				mobileAction.verifyElementIsDisplayed((MobileElement) addPayeeButton, "Add Payee");
				mobileAction.switchAppiumContext("NATIVE_APP");

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
	 * This method verify the Add canadian Payee Now button
	 * 
	 * 
	 *
	 * In case an exception occurs while clicking over the element.
	 * 
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyAddCanadianPayeeButton() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(managePayees, "Manage Payees Header");
			mobileAction.verifyElementIsDisplayed(addPayee, "Add Payee");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on add US payee button
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

	public void addUSPayee() {
		Decorator();
		// Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyElementIsDisplayed(managePayees, "Manage Payees Header");
				final MobileElement usElement = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeButton[@label='" + mobileAction.getAppString("us") + "']",
						"US banner button");
				usElement.click();
				addPayee = mobileAction
						.verifyElementUsingXPath(
								"//XCUIElementTypeNavigationBar/XCUIElementTypeButton[@label='"
										+ getTextInCurrentLocale(StringArray.ARRAY_ADD_US_PAYEE) + "']",
								"Add Canadian Payee");
				mobileAction.FuncClick(addPayee, "Add US Payee");
				Thread.sleep(10000);
			} else {
				mobileAction.verifyElementIsDisplayed(managePayees, "Manage Payees Header");
				// Switch to webview and click on U.S.
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				final WebElement usWebElement = mobileAction
						.verifyWebElementUsingXPath("(//li[@ng-repeat='label in labels'])[3]", "US banner button");
				usWebElement.click();
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(addPayee, "Add US Payee");
				mobileAction.waitProgressBarVanish();
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			try {
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				try {
					mobileAction.GetReporting().FuncReport("Fail",
							"No such element was found on screen: " + e.getMessage());
				} catch (Exception ex) {
					System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			} catch (Exception exx) {

			}
		}
	}

	/**
	 * This method will click on add payee button
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

	public void addPayee() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(managePayees, "Manage Payees Header");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				addPayee = mobileAction.verifyElementUsingXPath(
						"//XCUIElementTypeNavigationBar/XCUIElementTypeButton[@label='"
								+ getTextInCurrentLocale(StringArray.ARRAY_ADD_CANADIAN_PAYEE) + "']",
						"Add Canadian Payee");
			}
			mobileAction.FuncClick(addPayee, "Add Payee");
			mobileAction.waitProgressBarVanish();

			Thread.sleep(10000);

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
