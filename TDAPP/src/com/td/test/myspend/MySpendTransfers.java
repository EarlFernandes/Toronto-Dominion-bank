package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import com.td.test.CDNMobile.pages.Between_My_accounts;
import com.td.test.CDNMobile.pages.HomeScreen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MySpendTransfers extends _CommonPage {
	
	private static MySpendTransfers MySpendTransfers;

	public synchronized static MySpendTransfers get() {
		if (MySpendTransfers == null) {
			MySpendTransfers = new MySpendTransfers();
		}
		return MySpendTransfers;
	}
	
	@iOSXCUITFindBy(accessibility = "TRANSFERVIEW_BETWEENACCOUNTS")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Between My Accounts']")
	private MobileElement betweenMyAccounts;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Transfer successful' or @label='Virement effectué avec succès']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message' and @text='Transfer Successful']")
	private MobileElement txtTrnsfrSucssfl;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #') or contains(@label,'de confirmation')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmation_Val;
	
	@iOSXCUITFindBy(xpath = "//*[@label='TD MySpend' or @label='Dépense TD']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='TD MySpend' or @text='Dépense TD')]")
	private MobileElement TDMySpend;
	
	@iOSXCUITFindBy(accessibility = "BETWEENMYACCOUNTS_FROM0")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtFromAccount']")
	private MobileElement txtFrom_acnt;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable")
	private MobileElement ios_account_dropdown_window;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'To Account') or contains(@label, 'Compte de Destination') or contains(@label, '转入账户') or contains(@label, '轉入賬戶')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/edtToAccount']")
	private MobileElement txtto_Acnt;
	
	@AndroidFindBy(xpath = "//android.widget.ListView[@index='1']")
	private MobileElement acntsList;
	
	@iOSXCUITFindBy(accessibility = "BETWEENMYACCOUNTS_AMOUNT")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/edtAmount']")
	private MobileElement txtAmount;
	
	@iOSXCUITFindBy(xpath = "//*[@name='Go' or @label='Done' or @label='OK']")
	private MobileElement doneBtn;
	
	
	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}
	
	/**
	 * This method will click on between my accounts in the transfer page
	 * header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void clickBetweenMyAccounts() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				CL.GetAppiumDriver().context("NATIVE_APP");
			}
			mobileAction.FuncClick(betweenMyAccounts, "Between My Accounts");
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will perform the transfer successfully
	 * header.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void performTransfer() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				String from_AccountNo = getTestdata("FromAccount");
				System.out.println("From account:" + from_AccountNo);
				String account_value = "//XCUIElementTypeStaticText[contains(@label,'" + from_AccountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
				if (mobileAction.verifyElementIsPresent(ios_account_dropdown_window)) {
					mobileAction.FuncSwipeOnce("up");
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 2, "down");
				}
				mobileAction.FuncClick(txtto_Acnt, "To Account");
				String to_accountNo = getTestdata("ToAccount");
				System.out.println("To account:" + to_accountNo);
				account_value = "//XCUIElementTypeStaticText[contains(@label,'" + to_accountNo + "')]";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 25, "Up");
				if (mobileAction.verifyElementIsPresent(ios_account_dropdown_window)) {
					mobileAction.FuncSwipeOnce("up");
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(account_value, true, 2, "down");
				}
			} else {
				String from_Account = getTestdata("FromAccount");

				String select_from_acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
						+ from_Account + "']";
				mobileAction.FuncClick(txtFrom_acnt, "From Account");
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_from_acnt, 10, "down", true);
				mobileAction.waitForElementToDisappear(select_from_acnt);

				mobileAction.FuncClick(txtto_Acnt, "To Account");
				String to_account = getTestdata("ToAccount");
				String select_to_Acnt = "//android.widget.TextView[@resource-id='com.td:id/txtAccountNumber' and @text='"
						+ to_account + "']";
				mobileAction.FuncElementSwipeWhileNotFound(acntsList, select_to_Acnt, 10, "down", true);
				mobileAction.waitForElementToDisappear(select_to_Acnt);

			}

			mobileAction.FuncClick(txtAmount, "Amount");
			mobileAction.FuncSendKeys(txtAmount, getTestdata("Amount"));
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(doneBtn, "Done");
			} else {
				mobileAction.FuncHideKeyboard();
			}
			Between_My_accounts.get().continueButton();
			Between_My_accounts.get().FinishButton();
		//	mobileAction.FuncClick(btnFinish_transfer, "Finish");
			mobileAction.verifyElementIsDisplayed(txtTrnsfrSucssfl, "Transfer Successful");
			mobileAction.verifyElementIsDisplayed(confirmation_Val, "Confirmation Value");
			HomeScreen.get().clickMenu();
			mobileAction.FuncClick(TDMySpend, "TD My Spend");
			Thread.sleep(3000);
			
		}catch (Exception e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
