package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class FundDetails extends _CommonPage {
	private static FundDetails fundDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText | //XCUIElementTypeNavigationBar/XCUIElementTypeOther")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement FundDetails_header;

	@iOSFindBy(xpath = "//XCUIElementTypeWebView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement quote_FundDetails_header;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/purchaseBtn']")
	private MobileElement Purchase;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/callBtn']")
	private MobileElement CallBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quoteBtn']")
	private MobileElement QuoteBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/fund_facts_view']//android.widget.TextView[@index='0']")
	private MobileElement fund_facts_view_text;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[@index='2']/android.widget.LinearLayout/android.widget.TextView[@index='0']")
	private List<MobileElement> InfoList;

	@iOSFindBy(xpath = "//*[@name='short_term_fee_label']")
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[@index='5']/android.widget.TextView")
	private MobileElement footnote_mimholding_fee;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/fund_category']")
	private MobileElement fund_category;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='conversion_rate_label'] | //XCUIElementTypeOther[@name='conversion_rate_label']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/conversion_rate_used']")
	private MobileElement usd_conversion_rate;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/cad_market_value']")
	private MobileElement CAD_Market_Value;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/usd_market_value']")
	private MobileElement USD_Market_Value;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/book_value']")
	private MobileElement Book_Value;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]//XCUIElementTypeTable/XCUIElementTypeStaticText[1]")
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
		// try {
		// if
		// (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS"))
		// {
		// String investingTitle =
		// mobileAction.getAppString("str_Holding_Detail");
		// FundDetails_header =
		// mobileAction.verifyElementUsingXPath("//*[@label='" + investingTitle
		// + "']",
		// "Investing");
		// }
		// } catch (Exception e) {
		// System.out.println("Exception from Method " +
		// this.getClass().toString() + " " + e.getCause());
		// }
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
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				Purchase = mobileAction.verifyElementUsingXPath(
						"//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_DETAIL_PURCHASE) + "']",
						"Purchase");
			}
			mobileAction.FuncClick(Purchase, "Purchase");
			mobileAction.waitProgressBarVanish();

		} catch (IOException | NoSuchElementException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void VerifyFundDetailsPageHeader() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(PageHeader.get().getHeaderTextElement(),
					getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_DETAIL_HEADER));

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void VerifyQuoteFundDetailsPageHeader() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// Web view page, need to handle when page is available
				String myheader = mobileAction.getValue(quote_FundDetails_header);
				if (myheader != null && myheader.equals("System Unavailable")) {
					mobileAction.Report_Fail("Failed with 'System Unavailable'");
				} else {
					mobileAction.Report_Pass_Verified("Quote Fund Details");
				}

			} else {
				mobileAction.verifyElementTextIsDisplayed(quote_FundDetails_header,
						getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_DETAIL_HEADER));
			}

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

			String purchaseText = getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_DETAIL_PURCHASE);
			String callText = getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_DETAIL_CALL);
			String quoteText = getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_DETAIL_QUOTE);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				Purchase = mobileAction.verifyElementUsingXPath("//*[@label='" + purchaseText + "']", "Purchase");
				CallBtn = mobileAction.verifyElementUsingXPath("//*[@label='" + callText + "']", "Call");
				QuoteBtn = mobileAction.verifyElementUsingXPath("//*[@label='" + quoteText + "']", "Quote");
			}
			mobileAction.verifyElementIsDisplayed(Purchase, purchaseText);
			mobileAction.verifyElementTextIsDisplayed(CallBtn, callText);
			mobileAction.verifyElementTextIsDisplayed(QuoteBtn, quoteText);

			String[] expectedText = { getTextInCurrentLocale(StringArray.ARRAY_MF_FD_MARKETVALUE),
					getTextInCurrentLocale(StringArray.ARRAY_MF_FD_BOOKVALUE),
					getTextInCurrentLocale(StringArray.ARRAY_MF_FD_PERCENTAGE_PORTFOLIO),
					getTextInCurrentLocale(StringArray.ARRAY_MF_FD_UNITS_HELD),
					getTextInCurrentLocale(StringArray.ARRAY_MF_FD_UNIT_PRICE),
					getTextInCurrentLocale(StringArray.ARRAY_MF_FD_GAIN_LOSS) };
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

			mobileAction.verifyElementTextIsDisplayed(fund_facts_view_text,
					getTextInCurrentLocale(StringArray.ARRAY_MF_FD_VIEW_PERFORMANCE));
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementTextIsDisplayed(footnote_mimholding_fee,
						getTextInCurrentLocale(StringArray.ARRAY_MF_TRADE_FEE_DISCLAIMER));
			} else {
				mobileAction.FuncSwipeOnce("up");
				mobileAction.Report_Pass_Verified("Need to check disclaimer manually");
			}

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
			mobileAction.verifyElementTextIsDisplayed(CallBtn,
					getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_DETAIL_CALL));
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
				Purchase = mobileAction.verifyElementUsingXPath(
						"//*[@label='" + getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_DETAIL_PURCHASE) + "']",
						"Purchase");
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
//			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
//				mobileAction.FuncSwipeOnce("up");
//				mobileAction.Report_Pass_Verified("IOS usd conversion rate, need to check manually");
//				return;
//			}
//			mobileAction.FuncSwipeWhileElementNotFound(usd_conversion_rate, false, 10, "up");
			mobileAction.FuncSwipeOnce("up");
			String conversionText = mobileAction.getValue(usd_conversion_rate);
			String expectedTextReg = getTextInCurrentLocale(StringArray.ARRAY_MF_USD_CONVERSION_RATE);
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

			String disclaimerReg = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				disclaimerReg = getTextInCurrentLocale(StringArray.ARRAY_MF_DISCLAIMER_IOS);
			} else {
				disclaimerReg = getTextInCurrentLocale(StringArray.ARRAY_MF_DISCLAIMER_AND);
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

	public void ClickQuoteButton() {
		try {
			Decorator();

			String quoteText = getTextInCurrentLocale(StringArray.ARRAY_MF_FUND_DETAIL_QUOTE);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				QuoteBtn = mobileAction.verifyElementUsingXPath("//*[@label='" + quoteText + "']", "Quote");
			}
			mobileAction.FuncClick(QuoteBtn, quoteText);
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

}
