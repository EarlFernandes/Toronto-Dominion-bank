package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Manage_Payee extends _CommonPage {

	private static Manage_Payee Manage_Payee;

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

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name='TDVIEW_TITLE']")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement managePayees;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeButton[2] | "
			+ "//XCUIElementTypeNavigationBar/XCUIElementTypeOther[@name='PAYBILL_VIEW_ADD_PAYEE'] | "
			+ "//XCUIElementTypeNavigationBar/XCUIElementTypeOther[@name='PAYUSBILL_VIEW_ADD_PAYEE']")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
	private MobileElement addPayee;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeActivityIndicator[1]")
	@AndroidFindBy(id = "android:id/progress")
	private MobileElement progressBar;

	private WebElement payeeAcctNumber;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
	private MobileElement deletePayeeBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='1']")
	private MobileElement editPayeeBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[1]//XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement confirmYes;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
	@FindBy(xpath = "//div[contains(@ng-repeat,'alerts.S')]")
	private WebElement deleteMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[7]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "//div[@class='column2']/span")
	private WebElement viewDescriptionField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[8]/XCUIElementTypeStaticText[1]")
	@FindBy(xpath = "(//div[@class='column2'])[2]/span")
	private WebElement viewDescriptionUSField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[8]/XCUIElementTypeTextField[1] | "
			+ "//XCUIElementTypeWebView[1]//XCUIElementTypeOther[9]/XCUIElementTypeTextField[1]")
	@FindBy(name = "description")
	private WebElement payeeDescriptionField;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[@index='0']")
	private MobileElement editPayeeCheckButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeKeyboard[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[2]")
	private MobileElement keyboardTypeBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeKeyboard[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[4]")
	private MobileElement keyboardGoBtn;

	public synchronized static Manage_Payee get() {
		if (Manage_Payee == null) {
			Manage_Payee = new Manage_Payee();
		}
		return Manage_Payee;
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
				mobileAction.switchToWebView();
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
				mobileAction.switchToWebView();
				final WebElement name = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[1]", "name");
				// final WebElement address =
				// mobileAction.verifyWebElementUsingXPath("(//div[@class='column1
				// ng-binding'])[2]", "address");
				final WebElement account = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[3]", "account");
				final WebElement description = mobileAction
						.verifyWebElementUsingXPath("(//div[@class='column1 ng-binding'])[4]", "description");
				if (!mobileAction.verifyTextEquality(name.getText().trim(), mobileAction.getAppString("str_payee_name"))
						||
						// !mobileAction.verifyTextEquality(address.getText().trim(),
						// mobileAction.getAppString("str_payee_address")) ||
						!mobileAction.verifyTextEquality(account.getText().trim(),
								mobileAction.getAppString("str_payee_account"))
						|| !mobileAction.verifyTextEquality(description.getText().trim(),
								mobileAction.getAppString("str_description"))) {
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
				mobileAction.switchToWebView();
				final WebElement firstPayee = mobileAction.verifyWebElementUsingXPath(
						"//div[@ng-if='payee.AccountNO' and text()='" + getTestdata("Payee") + "']", "Payee");
				firstPayee.click();
				mobileAction.waitForElementToVanish(progressBar);
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
				mobileAction.switchToWebView();
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
					mobileAction.FuncClick(thirdAccessCard, "Second Access Card");
					Thread.sleep(2000);
					mobileAction.verifyElementIsDisplayed(addPayee, "Add Payee");
				}
			} else {
				// For android, using webview to handle

				mobileAction.switchToWebView();
				WebElement accessCard = CL.GetDriver().findElement(By.cssSelector("div.dropdown-holder"));
				accessCard.click();
				Thread.sleep(2000);
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(secondAccessCard, "Second Access Card");
				Thread.sleep(2000);
				mobileAction.switchToWebView();
				WebElement mypayees_android = CL.GetDriver().findElement(By.id("myPayees"));
				mobileAction.verifyElementIsDisplayed((MobileElement) mypayees_android, "My Payees");
				accessCard = CL.GetDriver().findElement(By.cssSelector("div.dropdown-holder"));
				accessCard.click();

				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(thirdAccessCard, "Second Access Card");
				Thread.sleep(2000);
				mobileAction.switchToWebView();
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
				mobileAction.FuncClick(addPayee, "Add US Payee");
				Thread.sleep(10000);
			} else {
				mobileAction.verifyElementIsDisplayed(managePayees, "Manage Payees Header");
				// Switch to webview and click on U.S.
				mobileAction.switchToWebView();
				final WebElement usWebElement = mobileAction
						.verifyWebElementUsingXPath("(//li[@ng-repeat='label in labels'])[3]", "US banner button");
				usWebElement.click();
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncClick(addPayee, "Add US Payee");
				mobileAction.waitForElementToVanish(progressBar);
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

			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Manage Payees Header");
			mobileAction.FuncClick(addPayee, "Add Payee");
			mobileAction.waitProgressBarVanish();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void clickPayeeByAcctNumber() {
		Decorator();
		try {

			String acctNum = getTestdata("Accounts");
			String usAccount = getTestdata("USAccount");
			if (acctNum == null && usAccount != null) {
				// It's a US account
				acctNum = getTestdata("FromAccount");
			}

			System.out.println("Click Payee acct: " + acctNum);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
				payeeAcctNumber = mobileAction.verifyElementUsingXPath(
						"//div[@ng-if='payee.AccountNO' and text()='" + acctNum + "']", "Payee Acct Number");

				mobileAction.FuncScrollIntoView(payeeAcctNumber, "Payee Acct Number");
				mobileAction.FuncClick(payeeAcctNumber, "Payee Acct Number");

			} else {
				String acctNumIos = "";
				for (int i = 0; i < acctNum.length(); i++) {
					acctNumIos += acctNum.charAt(i) + " ";
				}

				String payeeAcctXpath = "//XCUIElementTypeLink[@name='" + acctNumIos.trim() + "']";
				mobileAction.swipeAndSearchByxpath(payeeAcctXpath, true, 10, "up");
				mobileAction.waitForElementToVanish(PageHeader.get().getProgressBar());
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void deletePayee() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(editPayeeBtn, "Edit Payee button");
				mobileAction.waitProgressBarVanish();
			}

			mobileAction.FuncClick(deletePayeeBtn, "Delete Payee button");
			mobileAction.FuncClick(confirmYes, "Confirm dialog, Yes button");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.waitProgressBarVanish();
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void editPayee() {
		Decorator();
		try {

			mobileAction.FuncClick(editPayeeBtn, "Edit Payee button");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.waitForElementToVanish(PageHeader.get().getProgressBar());
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void editPayeeDescription() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			String payee = getTestdata("Payee");
			mobileAction.FuncClick(payeeDescriptionField, "Payee Description Field");
			mobileAction.FuncSendKeys(payeeDescriptionField, payee);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchAppiumContext("NATIVE_APP");
				mobileAction.FuncHideKeyboard();
			} else {
				if (currentLocale.toLowerCase().startsWith("zh")) {
					switchToEnglishKeyboard();
				}
				mobileAction.HideKeyBoard_IOS();
			}

			String acctNum = getTestdata("Accounts");
			String usAccount = getTestdata("USAccount");
			if (acctNum == null && usAccount != null) {
				// US account, click Check button twice
				mobileAction.FuncClick(editPayeeCheckButton, "Edit Payee check button");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.sleep(5000);
				}

				mobileAction.FuncClick(editPayeeCheckButton, "Edit Payee check button");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.sleep(5000);
				}

			} else {
				mobileAction.FuncClick(editPayeeCheckButton, "Edit Payee check button");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.sleep(5000);
				}
			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void verifyCanadianPayeeDeleted() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.verifyElementIsDisplayed(deleteMsg, "Delete Message Canadian");
			mobileAction.verifyElementTextContains(deleteMsg,
					getTextInCurrentLocale(StringArray.ARRAY_CANADIAN_PAYEE_DELETED));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void verifyUSPayeeDeleted() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			mobileAction.verifyElementIsDisplayed(deleteMsg, "Delete Message US");
			mobileAction.verifyElementTextContains(deleteMsg,
					getTextInCurrentLocale(StringArray.ARRAY_US_PAYEE_DELETED));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	public void verifyPayeeEdited() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.switchToWebView();
			}

			String payee = getTestdata("Payee");
			String acctNum = getTestdata("Accounts");
			String usAccount = getTestdata("USAccount");
			if (acctNum == null && usAccount != null) {
				// US account
				mobileAction.verifyElementIsDisplayed(viewDescriptionUSField, "View Description US field");
				mobileAction.verifyElementTextContains(viewDescriptionUSField, payee);
			} else {
				// Cdn account
				mobileAction.verifyElementIsDisplayed(viewDescriptionField, "View Description field");
				mobileAction.verifyElementTextContains(viewDescriptionField, payee);

			}

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
			mobileAction.switchAppiumContext("NATIVE_APP");
		}

	}

	private void switchToEnglishKeyboard() {
		try {
			// Switch to English keyboard for correct text input
			String keyboardGoBtnText = keyboardGoBtn.getAttribute("label");
			if (keyboardGoBtnText.contains("确认")) {
				mobileAction.FuncClick(keyboardTypeBtn, "Switch to English keyboard");
				mobileAction.sleep(500);
			}

		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

}
