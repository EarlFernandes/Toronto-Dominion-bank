package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FundDetails extends _CommonPage {
	private static FundDetails fundDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement FundDetails_header;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Purchase' or @label='Acheter']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/purchaseBtn']")
	private MobileElement Purchase;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Call' or @label='Appeler']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/callBtn']")
	private MobileElement CallBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Quote' or @label='Cote']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quoteBtn']")
	private MobileElement QuoteBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/fund_facts_view']//android.widget.TextView[@index='0']")
	private MobileElement fund_facts_view_text;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout/android.widget.TextView[@index='0']")
	private List<MobileElement> InfoList;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/fund_category']")
	private MobileElement fund_category;

	@iOSFindBy(xpath = "//*[@name='conversion_rate_label']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/conversion_rate_used']")
	private MobileElement usd_conversion_rate;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/cad_market_value']")
	private MobileElement CAD_Market_Value;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/usd_market_value']")
	private MobileElement USD_Market_Value;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/book_value']")
	private MobileElement Book_Value;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/timestamp']")
	private MobileElement time_stamp;

	public synchronized static FundDetails get() {
		if (fundDetails == null) {
			fundDetails = new FundDetails();
		}
		return fundDetails;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(5, TimeUnit.SECONDS)),
				this);
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				String investingTitle = mobileAction.getAppString("str_Holding_Detail");
				FundDetails_header = mobileAction.verifyElementUsingXPath("//*[@label='" + investingTitle + "']",
						"Investing");
			}
		} catch (Exception e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click Purchase button in FundDetails page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void click_PurchaseButton() {

		Decorator();
		try {
			mobileAction.FuncClick(Purchase, "Purchase");
			mobileAction.waitForElementToVanish(progressBar);

		} catch (IOException | NoSuchElementException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void VerifyFundDetailsPageHeader() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(FundDetails_header,
					"Fund Details | Détails sur le fonds|基金详情|基金詳情");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyFundCategory() {
		Decorator();
		try {
			String fundCategory = mobileAction.getValue(fund_category);
			System.out.println("fundCategory:" + fundCategory);
			mobileAction.verifyElementIsDisplayed(fund_category, fundCategory);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyFundDetailsInformationInChinese() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				// System.out.println(mobileAction.getAppString(locale_used,"str_BUY"));
				// System.out.println(mobileAction.getAppString(locale_used,"call"));
				// System.out.println(mobileAction.getAppString(locale_used,"str_QUOTE"));
				Purchase = mobileAction
						.verifyElementUsingXPath("//*[@label='" + mobileAction.getAppString("str_BUY") + "']", "Buy");
				CallBtn = mobileAction
						.verifyElementUsingXPath("//*[@label='" + mobileAction.getAppString("call") + "']", "Call");
				QuoteBtn = mobileAction.verifyElementUsingXPath(
						"//*[@label='" + mobileAction.getAppString("str_QUOTE") + "']", "Quote");
			}
			mobileAction.verifyElementTextIsDisplayed(Purchase, "买入| 買入");
			mobileAction.verifyElementTextIsDisplayed(CallBtn, "致电 | 致電 ");
			mobileAction.verifyElementTextIsDisplayed(QuoteBtn, "报价| 報價 ");

			String[] expectedText = { "市场价值 |市場價值", "账面价值 | 賬面價值", "此账户的投资组合百分比 | 此賬戶的投資組合百分比", "所持单位数 |所持單位數",
					"单位价格 | 單位價格", "未实现收益/亏损 | 未實現收益/虧損 " };
			int lengthOfText = expectedText.length;
			System.out.println("Expected fund details number:" + lengthOfText);
			int size = InfoList.size();
			System.out.println("Capture fund details number:" + size);
			if (lengthOfText > size) {
				System.out.println("Captured info size is less than expected,something wrong");
				mobileAction.Report_Fail("Captured info size is less than expected");
				return;
			}

			for (int i = 0; i < lengthOfText; i++) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					if (!mobileAction.verifyElementIsPresent(InfoList.get(i))) {
						mobileAction.FuncSwipeWhileElementNotFound(InfoList.get(i), false, 3, "up");
					}
					mobileAction.verifyElementTextIsDisplayed(InfoList.get(i), expectedText[i]);
					// mobileAction.SwipeWithinElement("//android.widget.ScrollView",
					// 1, "down");
				} else {
					if (!mobileAction.verifyElementIsPresent(InfoList.get(i + 1))) {
						mobileAction.FuncSwipeWhileElementNotFound(InfoList.get(i + 1), false, 3, "up");
					}
					mobileAction.verifyElementTextIsDisplayed(InfoList.get(i + 1), expectedText[i]);
				}
			}

			if (!mobileAction.verifyElementIsPresent(fund_facts_view_text)) {
				mobileAction.FuncSwipeWhileElementNotFound(fund_facts_view_text, false, 3, "up");
			}

			mobileAction.verifyElementTextIsDisplayed(fund_facts_view_text, "查看基金概况（表现和费用）| 查看基金概況（表現和費用） ");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void ClickfundFacts() {
		Decorator();
		try {
			mobileAction.FuncSwipeWhileElementNotFound(fund_facts_view_text, true, 5, "up");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed to ClickfundFacts.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			mobileAction.Report_Fail("Exception for ClickfundFacts");
		}
	}

	// public void VerifyfundfactsDoc(){
	// Decorator();
	// try {
	// mobileAction.verifyElementTextIsDisplayed(fund_facts_page_title, "fund
	// facts.pdf");
	// } catch ( Exception e) {
	// System.err.println("TestCase has failed to verifyfundfactsDoc.");
	// CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	// mobileAction.Report_Fail("Exception for verifyfundfactsDoc");
	// }
	// }

	public void VerifyCallFuntionality() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				CallBtn = mobileAction
						.verifyElementUsingXPath("//*[@label='" + mobileAction.getAppString("call") + "']", "Call");
			}
			mobileAction.verifyElementTextIsDisplayed(CallBtn, "Call | Appeler");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyPurchaseButtonNotpresent() {
		try {
			Decorator();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				Purchase = mobileAction
						.verifyElementUsingXPath("//*[@label='" + mobileAction.getAppString("str_BUY") + "']", "Buy");
			}
			if (!mobileAction.verifyElementIsPresent(Purchase)) {
				mobileAction.Report_Pass_Verified("Purchase is not present for Zero account");
			} else {
				mobileAction.Report_Fail("Failed:Purchase is present for Zero account");
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyUSDConversionRatePresent() {
		try {
			Decorator();
			mobileAction.FuncSwipeWhileElementNotFound(usd_conversion_rate, false, 10, "up");
			String conversionText = mobileAction.getValue(usd_conversion_rate);
			conversionText = conversionText.replaceAll(" ", " "); // French
																	// space to
																	// english
																	// space
			// System.out.println("Found USD conversion rate:"+conversionText);
			String expectedTextReg = "U\\.S\\. conversion rate used\\s*:\\s*\\d+\\.\\d+";
			if (currentLocale.equalsIgnoreCase("FR")) {
				expectedTextReg = "Taux de conversion US utilisé\\s*:\\s*\\d+\\.\\d+";
			}
			String expectedText = mobileAction.FuncGetValByRegx(conversionText, expectedTextReg);
			if (!expectedText.isEmpty()) {
				System.out.println(expectedText);
				mobileAction.Report_Pass_Verified(expectedText);
			} else {
				mobileAction.Report_Fail("Conversion rate not found");
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void VerifyCADValueForMarketAndBookValue() {
		try {
			Decorator();

			if (!mobileAction.verifyElementIsPresent(CAD_Market_Value)) {
				System.out.println("Failed: CAD Market value not found");
				mobileAction.Report_Fail("Failed to find CAD market value for US MF");
				return;
			} else {
				String cadMarketValue = mobileAction.getValue(CAD_Market_Value);
				mobileAction.Report_Pass_Verified("Market CAD value:" + cadMarketValue);
			}

			if (!mobileAction.verifyElementIsPresent(USD_Market_Value)) {
				System.out.println("Failed: USD Market value not found");
				mobileAction.Report_Fail("Failed to find USD market value for US MF");
				return;
			} else {
				String cadMarketValue = mobileAction.getValue(USD_Market_Value);
				mobileAction.Report_Pass_Verified("Market USD value:" + cadMarketValue);
			}

			if (!mobileAction.verifyElementIsPresent(Book_Value)) {
				System.out.println("Failed: CAD book value not found");
				mobileAction.Report_Fail("Failed to find CAD book value for US MF");
				return;
			} else {
				String USD_bookvalue = mobileAction.getValue(Book_Value);
				if (USD_bookvalue.contains("US")) {
					mobileAction.Report_Pass_Verified("Book USD value:" + USD_bookvalue);
				} else {
					mobileAction.Report_Fail("USD fund of book value:" + USD_bookvalue);
				}
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void VerifyClosingDayDisclaimer() {
		try {
			Decorator();

			String timeStamp = mobileAction.getValue(time_stamp);
			System.out.println("TimeStamp:" + timeStamp);

			String disclaimerReg;
			if (currentLocale.equalsIgnoreCase("fr")) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
					disclaimerReg = "Au .{3,5}\\s*\\d{1,2},\\s*\\d{4} à \\d{1,2}:\\d{1,2}:\\d{1,2}.*";
				}else{
					disclaimerReg = "Au \\d{1,2} .{3,5}\\s*\\d{4} à \\d{1,2}:\\d{1,2}:\\d{1,2}.*";
				}
			} else {
				disclaimerReg = "As of [A-Za-z]{3}\\s*\\d{1,2},\\s*\\d{4} at \\d{1,2}:\\d{1,2}:\\d{1,2}.*";
			}

			if (timeStamp.matches(disclaimerReg)) {
				mobileAction.Report_Pass_Verified(timeStamp);
			} else {
				mobileAction.Report_Fail_Not_Verified(timeStamp);
			}

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

}
