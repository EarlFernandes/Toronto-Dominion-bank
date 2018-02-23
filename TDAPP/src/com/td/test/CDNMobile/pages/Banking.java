package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Banking  extends _CommonPage {

	private static Banking banking;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeCollectionView/XCUIElementTypeCell")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button']")
	private List<MobileElement> quicklinkbutton_List;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]//XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/current_balance']")
	private MobileElement account_Balance;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ACCOUNT_DETAIL_SUMMARY_AVAILABLE']/following-sibling::XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/availableBalance']")
	private MobileElement account_summary_Balance;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/summaryTab']")
	private MobileElement summary_tab;

	public synchronized static Banking get() {
		if (banking == null) {
			banking = new Banking();
		}
		return banking;
	}

	private void Decorator() {

		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void verifyBankingHeader() {
		Decorator();
		String expectedText = getTextInCurrentLocale(StringArray.ARRAY_BANKING_HEADER);
		try {
			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(), expectedText);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	public void clickPayBillQuickLink() {
		Decorator();

		try {
			mobileAction.FuncClick(quicklinkbutton_List.get(0), "Pay Bill");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	private void verifyBankingAccountBalance(String expectedBalance) {
		Decorator();
		try {
			double balanceExpected = Double.parseDouble(expectedBalance);
			String capturedBalance= mobileAction.getValue(account_Balance);
			double capturedBalance_d = mobileAction.convertStringAmountTodouble(capturedBalance);
			if(capturedBalance_d == balanceExpected) {
				mobileAction.Report_Pass_Verified("Account balance verified:"+capturedBalance);
			} else {
				mobileAction.Report_Fail("Account balance not verified:" + capturedBalance);
			}
		}catch(Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Failed to find account balance");
			return;
		}
	}
	
	public void verifyFromAccountBankingBalance () {
		String expectedBalance = CL.getTestDataInstance().TCParameters.get("Dividend");
		System.out.println("Expected From account balance:"+ expectedBalance);
		verifyBankingAccountBalance(expectedBalance);
	}
	
	public void verifyToAccountBankingBalance () {
		String expectedBalance = CL.getTestDataInstance().TCParameters.get("Quantity");
		System.out.println("Expected To account balance:"+ expectedBalance);
		verifyBankingAccountBalance(expectedBalance);
	}
	
	
	private void verifyAccountSummaryBalance(String expectedBalance) {
		Decorator();
		try {
			mobileAction.FuncClick(summary_tab, "Summary");
		} catch (Exception e){
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Failed to click Summary");
			return;
		}
		try {
			double balanceExpected = Double.parseDouble(expectedBalance);
			String capturedBalance= mobileAction.getValue(account_summary_Balance);
			double capturedBalance_d = mobileAction.convertStringAmountTodouble(capturedBalance);
			if(capturedBalance_d == balanceExpected) {
				mobileAction.Report_Pass_Verified("Account balance verified:"+capturedBalance);
			} else {
				mobileAction.Report_Fail("Account balance not verified:" + capturedBalance);
			}
		}catch(Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Failed to find account summary balance");
			return;
		}
	}
	
	public void verifyFromAccountSummaryBalance () {
		String expectedBalance = CL.getTestDataInstance().TCParameters.get("Dividend");
		System.out.println("Expected From account balance:"+ expectedBalance);
		verifyAccountSummaryBalance(expectedBalance);
	}
	
	public void verifyToAccountSummaryBalance () {
		String expectedBalance = CL.getTestDataInstance().TCParameters.get("Quantity");
		System.out.println("Expected To account balance:"+ expectedBalance);
		verifyAccountSummaryBalance(expectedBalance);
	}
	
	public void GoBackToAccountPage() {
		int count = 10;
		String account_xpath = "";

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			String myAccountText = mobileAction.getAppString("str_My_Accounts");
			account_xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"+myAccountText+"']";
		} else {
			String myAccountText = mobileAction.getAppString("accountsPageHeader");
			account_xpath = "//*[@label='"+myAccountText+"']";
		}

		while (mobileAction.isBackButtonPresent() && count != 0) {
			mobileAction.ClickBackButton();
			try {
				((AppiumDriver) CL.GetDriver()).findElement(By.xpath(account_xpath));
				System.out.println("Go back to My Account already");
				break;
			} catch (Exception e) {
				count--;
			}
		}
		if (count != 0) {
			mobileAction.Report_Pass_Verified("Got Home Page dashboard");
		} else {
			mobileAction.Report_Fail("Failed to Home page dashboard");
		}
	}

}

