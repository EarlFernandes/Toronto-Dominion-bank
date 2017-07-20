package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

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
			mobileAction.verifyElementTextIsDisplayed(transactionDetailsHeader,
					"Transaction Details | Détails de l’opération");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifyTransactionDetails() {
		Decorator();
		try {
			// mobileAction.verifyElementTextIsDisplayed(transactionDetailsHeader,
			// "Transaction Details | Détails de l'opération");
			if (mobileAction.verifyElementIsPresent(transacDate_title)) {
				mobileAction.verifyElementTextIsDisplayed(transacDate_title, "Date | Date");
			}
			if (mobileAction.verifyElementIsPresent(ptransactionType_title)) {
				mobileAction.verifyElementTextIsDisplayed(ptransactionType_title,
						"Transaction Type | Type d’opération");
			}

			if (mobileAction.verifyElementIsPresent(grossAmount_title)) {
				mobileAction.verifyElementTextIsDisplayed(grossAmount_title, "Gross Amount | Montant brut");
			}

			if (mobileAction.verifyElementIsPresent(transactionCharge_title)) {
				mobileAction.verifyElementTextIsDisplayed(transactionCharge_title,
						"Transaction Charge |Frais d’opération");
			}

			if (mobileAction.verifyElementIsPresent(netAmount_title)) {
				mobileAction.verifyElementTextIsDisplayed(netAmount_title, "Net Amount| Montant net");
			}

			if (mobileAction.verifyElementIsPresent(unitPrice_title)) {
				mobileAction.verifyElementTextIsDisplayed(unitPrice_title, "Unit Price| Prix par part");
			}

			if (mobileAction.verifyElementIsPresent(transactionUnit_title)) {
				mobileAction.verifyElementTextIsDisplayed(transactionUnit_title,
						"Transaction Units|Parts visées par l’opération");
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
			mobileAction.verifyElementTextIsDisplayed(transactionDetailsHeader, "交易详情 | 交易詳情");

			if (mobileAction.verifyElementIsPresent(transacDate_title)) {
				mobileAction.verifyElementTextIsDisplayed(transacDate_title, "日期  | 日期 ");
			}

			if (mobileAction.verifyElementIsPresent(ptransactionType_title)) {
				mobileAction.verifyElementTextIsDisplayed(ptransactionType_title, "交易类型 | 交易類型常 ");
			}

			if (mobileAction.verifyElementIsPresent(grossAmount_title)) {
				mobileAction.verifyElementTextIsDisplayed(grossAmount_title, "总金额 | 總金額");
			}

			if (mobileAction.verifyElementIsPresent(transactionCharge_title)) {
				mobileAction.verifyElementTextIsDisplayed(transactionCharge_title, "交易收费 | 交易費用");
			}

			if (mobileAction.verifyElementIsPresent(netAmount_title)) {
				mobileAction.verifyElementTextIsDisplayed(netAmount_title, "净额 | 淨額 ");
			}

			if (mobileAction.verifyElementIsPresent(unitPrice_title)) {
				mobileAction.verifyElementTextIsDisplayed(unitPrice_title, "单位价格 | 單位價格");
			}

			if (mobileAction.verifyElementIsPresent(transactionUnit_title)) {
				mobileAction.verifyElementTextIsDisplayed(transactionUnit_title, "交易单位数量 | 交易單位數");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
