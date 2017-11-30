package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AccountDetails extends _CommonPage {

	private static AccountDetails accountDetails;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[2]")
	@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button'])[2]")
	private MobileElement quickLinkTransferButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button'])[1]")
	private MobileElement quickLinkPayButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "com.td:id/current_balance")
	private MobileElement acctBalance;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/amount']")
	private MobileElement lastTransactionAmt;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(id = "com.td:id/posted_date_val")
	private MobileElement postedDate;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]//XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/activityTab")
	private MobileElement activityTab;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]//XCUIElementTypeButton[2]")
	@AndroidFindBy(id = "com.td:id/summaryTab")
	private MobileElement summaryTab;

	public synchronized static AccountDetails get() {
		if (accountDetails == null) {
			accountDetails = new AccountDetails();
		}
		return accountDetails;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	public void clickQuickLinkTransfer() {
		Decorator();
		try {

			mobileAction.FuncClick(quickLinkTransferButton, "Quick Link Transfer button");
			mobileAction.sleep(3000);
			MobileElement headerText = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(headerText, "Transfer");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void clickQuickLinkPay() {
		Decorator();
		try {

			mobileAction.FuncClick(quickLinkPayButton, "Quick Link Pay button");
			mobileAction.sleep(3000);
			MobileElement headerText = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(headerText, "Pay Bill");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void getAccountBalance() {
		Decorator();
		try {

			String balanceStr = mobileAction.FuncGetText(acctBalance);
			balanceStr = StringUtils.remove(balanceStr, "$").trim();
			if (currentLocale.equalsIgnoreCase("fr")) {
				balanceStr = balanceStr.replace(",", ".");
				balanceStr = balanceStr.replace(" ", ",");
			}
			double balance = Double.parseDouble(balanceStr);

			// Save current acct balance for late verification
			CL.getTestDataInstance().TCParameters.put("Accounts", Double.toString(balance));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void verifyAccountBalance() {
		Decorator();
		try {

			String balanceStr = mobileAction.FuncGetText(acctBalance);
			balanceStr = StringUtils.remove(balanceStr, "$").trim();
			if (currentLocale.equalsIgnoreCase("fr")) {
				balanceStr = balanceStr.replace(",", ".");
				balanceStr = balanceStr.replace(" ", ",");
			}
			double balance = Double.parseDouble(balanceStr);

			double previousBalance = Double.parseDouble(getTestdata("Accounts"));
			double amt = Double.parseDouble(getTestdata("Amount"));

			// Need to round 2 decimal places after operation
			double newBalance = (double) Math.round((previousBalance - amt) * 100d) / 100d;

			if (Double.compare(balance, newBalance) != 0) {
				System.out.println(balance + " != " + newBalance);
				double delta = balance - newBalance;
				mobileAction.GetReporting().FuncReport("Fail", "Incorrect balance after transaction. Previous balance: "
						+ balance + " New balance: " + newBalance + " Delta: " + delta);
			} else {
				mobileAction.GetReporting().FuncReport("Pass", "Correct balance after transaction");
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
		}
	}

	public void verifyTransactionPosted() {
		Decorator();
		try {

			String amt = getTestdata("Amount");
			String lastTrxnXpath = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				lastTrxnXpath = "//android.widget.TextView[@resource-id='com.td:id/amount' and contains(@text,'" + amt
						+ "')]";
			} else {
				lastTrxnXpath = "//XCUIElementTypeTable[1]//XCUIElementTypeCell[contains(@label,'" + amt + "')]";
			}

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(lastTrxnXpath, false, 10, "up");
			lastTransactionAmt = mobileAction.verifyElementUsingXPath(lastTrxnXpath,
					"Last Posted Transaction Amount field");
			mobileAction.verifyElementTextContains(lastTransactionAmt, amt);

			mobileAction.FuncClick(lastTransactionAmt, "Last posted transaction");

			mobileAction.verifyElementIsDisplayed(postedDate, "Posted Date field");
			mobileAction.verifyElementTextIsDisplayed(postedDate,
					getTextInCurrentLocale(StringArray.ARRAY_TRANSACTION_PENDING));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void verifyActivityTab() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(activityTab, "Activity Tab");
			mobileAction.verifyElementTextIsDisplayed(activityTab,
					getTextInCurrentLocale(StringArray.ARRAY_TAB_ACTIVITY));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

	public void verifySummaryTab() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(summaryTab, "Summary Tab");
			mobileAction.verifyElementTextIsDisplayed(summaryTab,
					getTextInCurrentLocale(StringArray.ARRAY_TAB_SUMMARY));

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
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