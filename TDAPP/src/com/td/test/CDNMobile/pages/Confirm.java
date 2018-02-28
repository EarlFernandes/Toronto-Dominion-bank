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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Confirm extends _CommonPage {

	private static Confirm ConfirmPage;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='--From']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_from_account_bal']")
	private MobileElement fromAccountValue_review;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-From']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_from_account_name']")
	private MobileElement fromAccountName_review;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-To']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_to_account_name']")
	private MobileElement toAccountName_review;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='--To']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_to_account_bal']")
	private MobileElement toAccountValue_review;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='-Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_amount_value']")
	private MobileElement amount_review_main;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='--Amount']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/myaccounts_amount_second_value']")
	private MobileElement amount_review_second;
	
	@iOSXCUITFindBy(accessibility = "BETWEEN_ACCOUNTS__CONFIRM_FINISH_BUTTON")
	@AndroidFindBy(id = "com.td:id/myaccounts_entry_btn_confirm")
	private MobileElement btnFinish_transfer;

	public synchronized static Confirm get() {
		if (ConfirmPage == null) {
			ConfirmPage = new Confirm();
		}
		return ConfirmPage;
	}

	private void Decorator() {
		PageFactory.initElements(

				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	

	public void verifyConfirmPage() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(PageHeader.get().getHeaderTextElement(), "Confirm");



		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
//		} catch (InterruptedException e) {
//			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
//			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	private void calculateBalance() {
		String fromAccountValueBefore = mobileAction.getValue(fromAccountValue_review);
		String toAccountValueBefore = mobileAction.getValue(toAccountValue_review);
		String transferValueMain = mobileAction.getValue(amount_review_main);
		
		String fromAccountName = mobileAction.getValue(fromAccountName_review);
		String toAccountName = mobileAction.getValue(toAccountName_review);
		boolean isFromAccountLOC = false;
		boolean isToAccountLOC = false;
		if(fromAccountName.contains("LINE OF CREDIT")) {
			isFromAccountLOC = true;
		}
		if(toAccountName.contains("LINE OF CREDIT")) {
			isToAccountLOC = true;
		}
		
		String transferValueUS = "";
		String transferValueCAD = "";
		double fromAccountBalance =0.00;
		double toAccountBalance =0.00;

		boolean is_fromaccount_usd = false;
		boolean is_toaccount_usd = false;
		if (fromAccountValueBefore.contains("USD")) {
			is_fromaccount_usd = true;
		}

		if (toAccountValueBefore.contains("USD")) {
			is_toaccount_usd = true;
		}

		if (is_fromaccount_usd && is_toaccount_usd) {
			transferValueUS = transferValueMain;
		} else if (!is_fromaccount_usd && !is_toaccount_usd) {
			transferValueCAD = transferValueMain;
		} else if (is_fromaccount_usd && !is_toaccount_usd) {
			transferValueUS = transferValueMain;
			transferValueCAD = mobileAction.getValue(amount_review_second);
		} else {
			transferValueCAD = transferValueMain;
			transferValueUS = mobileAction.getValue(amount_review_second);
		}

		double fromAccountValueBefore_d, toAccountValueBefore_d, transferValueCAN_d = 0.0, transferValueUS_d = 0.0;
		fromAccountValueBefore_d = mobileAction.convertStringAmountTodouble(fromAccountValueBefore);
		System.out.println("From account value before transfer:" + fromAccountValueBefore_d);
		toAccountValueBefore_d = mobileAction.convertStringAmountTodouble(toAccountValueBefore);
		System.out.println("To account value before transfer:" + toAccountValueBefore_d);

		if (!transferValueCAD.isEmpty()) {
			transferValueCAN_d = mobileAction.convertStringAmountTodouble(transferValueCAD);
			System.out.println("transfer amount CAN:" + transferValueCAN_d);
			if(isFromAccountLOC) {
				fromAccountBalance = fromAccountValueBefore_d + transferValueCAN_d;
			} else {
				fromAccountBalance = fromAccountValueBefore_d - transferValueCAN_d;
			}
			
			if(isToAccountLOC) {
				toAccountBalance = toAccountValueBefore_d - transferValueCAN_d;
			} else {
				toAccountBalance = toAccountValueBefore_d + transferValueCAN_d;
			}
			
		}

		if (!transferValueUS.isEmpty()) {
			transferValueUS_d = mobileAction.convertStringAmountTodouble(transferValueUS);
			System.out.println("transfer amount USA:" + transferValueUS_d);
			
			if(isFromAccountLOC) {
				fromAccountBalance = fromAccountValueBefore_d + transferValueUS_d;
			} else {
				fromAccountBalance = fromAccountValueBefore_d - transferValueUS_d;
			}
			
			if(isToAccountLOC) {
				toAccountBalance = toAccountValueBefore_d - transferValueUS_d;
			} else {
				toAccountBalance = toAccountValueBefore_d + transferValueUS_d;
			}
			
		}
		///Need to round 
		fromAccountBalance = mobileAction.RoundTo2Decimals(fromAccountBalance);
		toAccountBalance = mobileAction.RoundTo2Decimals(toAccountBalance);
		
		System.out.println("From account balance:" + fromAccountBalance);
		System.out.println("To account balance:" + toAccountBalance);
		CL.getTestDataInstance().TCParameters.put("Dividend", Double.toString(fromAccountBalance));
		CL.getTestDataInstance().TCParameters.put("Quantity", Double.toString(toAccountBalance));
	}


	public void verifyConfirmPageAndTransfer() {

		try {
			Decorator();

			verifyConfirmPage();
			
			//calculate the balance:
			calculateBalance();
			
			mobileAction.FuncClick(btnFinish_transfer, "Finish Transfer");
			
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

