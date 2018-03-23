package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
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

public class ExploreProducts extends _CommonPage {

	private static ExploreProducts productPage;


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText")
	//@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.td:id/scheduledPaymentsListView']/android.widget.RelativeLayout")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/landing_row_title']")
	private List<MobileElement> products_List;



	public synchronized static ExploreProducts get() {
		if (productPage == null) {
			productPage = new ExploreProducts();
		}
		return productPage;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void VerifyProductlandingPageHeader() {
		Decorator();
		try {

			String titleText = getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_LANDING_PAGE_HEADER);
			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(), titleText);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void VerifyProductlandingPageContent() {
		Decorator();
		try {

//			String titleText = getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_LANDING_PAGE_HEADER);
//			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(), titleText);
			String[] expectedTextArray = {
					getTextInCurrentLocale(StringArray.ARRAY_EXPLORE_BANK_ACCOUNT),
					getTextInCurrentLocale(StringArray.ARRAY_EXPLORE_CREDIT_CARD),
					getTextInCurrentLocale(StringArray.ARRAY_EXPLORE_MORTGAGES),
					getTextInCurrentLocale(StringArray.ARRAY_EXPLORE_BORROWING),
					getTextInCurrentLocale(StringArray.ARRAY_EXPLORE_PERSONAL_INVESTING),
					getTextInCurrentLocale(StringArray.ARRAY_EXPLORE_TRAVEL_INSURANCET)
			};
			
			int size = products_List.size();
			if(size != expectedTextArray.length) {
				System.out.println("size error");
				return;
			}
			
			for (int i=0; i< size; i++) {
				mobileAction.verifyElementTextIsDisplayed(products_List.get(i), expectedTextArray[i]);
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void clickBankAccountslink() {
		Decorator();
		try {

			mobileAction.FuncClick(products_List.get(0), "Bank Accounts");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void clickCreditCardslink() {
		Decorator();
		try {

			mobileAction.FuncClick(products_List.get(1), "Credit Cards");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void clickMortgageslink() {
		Decorator();
		try {

			mobileAction.FuncClick(products_List.get(2), "Mortgages");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void clickBorrowinglink() {
		Decorator();
		try {

			mobileAction.FuncClick(products_List.get(3), "Borrowing");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void clickPersonalInvestinglink() {
		Decorator();
		try {

			mobileAction.FuncClick(products_List.get(4), "Personal Investing");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void clickTravelMedicalInsurancelink() {
		Decorator();
		try {

			mobileAction.FuncClick(products_List.get(5), "Travel Medical Insurance");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}

