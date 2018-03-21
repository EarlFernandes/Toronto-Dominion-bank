package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TransactionDetails extends _CommonPage {

	private static TransactionDetails Transactiondetails;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement transactionDetailsHeader;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/date']")
	private MobileElement transacDate;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transaction_type']")
	private MobileElement ptransactionType;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/gross_amount']")
	private MobileElement grossAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transaction_charge']")
	private MobileElement transactionCharge;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/net_amount']")
	private MobileElement netAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/unit_price']")
	private MobileElement unitPrice;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transaction_units']")
	private MobileElement transactionUnit;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/date']/../android.widget.TextView[@index='0']")
	private MobileElement transacDate_title;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transaction_type']/../../android.widget.TextView[@index='0']")
	private MobileElement ptransactionType_title;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/gross_amount']/../../android.widget.TextView[@index='0']")
	private MobileElement grossAmount_title;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transaction_charge']/../android.widget.TextView[@index='0']")
	private MobileElement transactionCharge_title;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/net_amount']/../../android.widget.TextView[@index='0']")
	private MobileElement netAmount_title;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/unit_price']/../../android.widget.TextView[@index='0']")
	private MobileElement unitPrice_title;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/transaction_units']/../android.widget.TextView[@index='0']")
	private MobileElement transactionUnit_title;

	public synchronized static TransactionDetails get() {
		if (Transactiondetails == null) {
			Transactiondetails = new TransactionDetails();
		}
		return Transactiondetails;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will verify the transaction page button.
	 * 
	 * @return void
	 * @throws InterruptedException
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyTransactionHeader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(),
					getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_DETAIL));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyTransactionDetails() {
		Decorator();
		try {

			if (mobileAction.verifyElementIsPresent(transacDate_title)) {
				mobileAction.verifyElementTextIsDisplayed(transacDate_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_DATE));
			}
			if (mobileAction.verifyElementIsPresent(ptransactionType_title)) {
				mobileAction.verifyElementTextIsDisplayed(ptransactionType_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_TYPE));
			}

			if (mobileAction.verifyElementIsPresent(grossAmount_title)) {
				mobileAction.verifyElementTextIsDisplayed(grossAmount_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_GROSS_AMOUNT));
			}

			if (mobileAction.verifyElementIsPresent(transactionCharge_title)) {
				mobileAction.verifyElementTextIsDisplayed(transactionCharge_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_CHARGE));
			}

			if (mobileAction.verifyElementIsPresent(netAmount_title)) {
				mobileAction.verifyElementTextIsDisplayed(netAmount_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_NET_AMOUNT));
			}

			if (mobileAction.verifyElementIsPresent(unitPrice_title)) {
				mobileAction.verifyElementTextIsDisplayed(unitPrice_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_UNIT_PRICE));
			}

			if (mobileAction.verifyElementIsPresent(transactionUnit_title)) {
				mobileAction.verifyElementTextIsDisplayed(transactionUnit_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_UNIT));
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyTransactionDetailsInChinese() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(transactionDetailsHeader,
					getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_DETAIL));

			if (mobileAction.verifyElementIsPresent(transacDate_title)) {
				mobileAction.verifyElementTextIsDisplayed(transacDate_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_DATE));
			}
			if (mobileAction.verifyElementIsPresent(ptransactionType_title)) {
				mobileAction.verifyElementTextIsDisplayed(ptransactionType_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_TYPE));
			}

			if (mobileAction.verifyElementIsPresent(grossAmount_title)) {
				mobileAction.verifyElementTextIsDisplayed(grossAmount_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_GROSS_AMOUNT));
			}

			if (mobileAction.verifyElementIsPresent(transactionCharge_title)) {
				mobileAction.verifyElementTextIsDisplayed(transactionCharge_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_CHARGE));
			}

			if (mobileAction.verifyElementIsPresent(netAmount_title)) {
				mobileAction.verifyElementTextIsDisplayed(netAmount_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_NET_AMOUNT));
			}

			if (mobileAction.verifyElementIsPresent(unitPrice_title)) {
				mobileAction.verifyElementTextIsDisplayed(unitPrice_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_UNIT_PRICE));
			}

			if (mobileAction.verifyElementIsPresent(transactionUnit_title)) {
				mobileAction.verifyElementTextIsDisplayed(transactionUnit_title,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRANSACTION_UNIT));
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
