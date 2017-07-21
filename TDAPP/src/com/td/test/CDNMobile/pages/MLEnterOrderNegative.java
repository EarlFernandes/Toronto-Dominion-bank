package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MLEnterOrderNegative extends _CommonPage {

	private static MLEnterOrderNegative MLEnterOrderNegative;

	public synchronized static MLEnterOrderNegative get() {
		if (MLEnterOrderNegative == null) {
			MLEnterOrderNegative = new MLEnterOrderNegative();
		}
		return MLEnterOrderNegative;
	}

	private void Decorator() {
		PageFactory.initElements(

				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'is not eligible for') or contains(@label,'pas admissible à ce')]") // @Author
																																		// -
																																		// Sushil
																																		// 03-Mar-2017
	// @AndroidFindBy(id="android:id/message")
	@AndroidFindBy(id = "com.td:id/error_text") // @Author - Shahbaaz
												// 17-Apr-2017
	private MobileElement messageNegative;

	@iOSFindBy(xpath = "//*[contains(@label,'Order') or contains(@label,'Type')]")
	@AndroidFindBy(xpath = "//*[contains(@text,'Order') or contains(@text,'Type')]")
	private MobileElement orderTypeSelected;

	@iOSFindBy(xpath = " //*[contains(@label,'Account') or contains(@label,'Compte')]") // @Author
																						// -
																						// Sushil
																						// 06-Feb-2017
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='com.td:id/selectedText' and
	// @index='0']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText2']/../*[@resource-id='com.td:id/selectedValue']") // @Author
																																				// -
																																				// Sushil
																																				// 16-Jun-2017
	private MobileElement defaultTradeAccount;

	@iOSFindBy(xpath = "(//XCUIElementTypeOther[contains(@label,'CALLS Ask') or contains(@label,'ACHAT Vendeur')])[1]") // @Author
																														// -
																														// Sushil
																														// 17-Feb-2017
	@AndroidFindBy(xpath = "//*[@resource-id='com.td:id/textview_info' and @index=1]")
	private MobileElement firstAskCALLS;

	@iOSFindBy(xpath = "//XCUIElementTypeImage[contains(@name,'error')]/../*[1]") // @Author
																					// -
																					// Sushil
																					// 29-Mar-2017
	@AndroidFindBy(id = "com.td:id/error_text")
	private MobileElement ErrTradingPwd;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'Preview Order') or contains(@label,'Aperçu de')]") // @Author
																													// -
																													// Sushil
																													// 03-Mar-2017
	@AndroidFindBy(id = "com.td:id/orderEntryPreviewButton")
	private MobileElement previewOrderButton;

	public void searchAndSelectAccountRapcode() {
		Decorator();
		String[] aRapcode = getTestdata("Rapcode", XLSheetUserIDs).split(";");
		String xpathAccount = "";
		boolean flag = false;
		String sAccount = "";
		int sCount = 0;
		int sSwipeCount = 0;
		int sSwipes = 60;
		String temp = "";
		String sExpectedAccount = "";

		for (int iCnt = 0; iCnt < aRapcode.length; iCnt++) {
			flag = false;
			try {

				String sRapcode = aRapcode[iCnt];

				mobileAction.waitForElement(defaultTradeAccount);
				mobileAction.selectItemFromList(orderTypeSelected, getTestdata("OrderType", XLSheetUserIDs));
				mobileAction.FuncClick(defaultTradeAccount, "defaultTradeAccount");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					xpathAccount = "//*[@resource-id='com.td:id/txtAccountNumber']";
					while (!flag && sSwipeCount < sSwipes) {
						for (int i = 0; i < CL.GetDriver().findElements(By.xpath(xpathAccount)).size(); i++) {
							sAccount = CL.GetDriver().findElements(By.xpath(xpathAccount)).get(i).getText();

							if (getMatchedAccount(sAccount, sRapcode).length() > 0) {
								flag = true;
								CL.GetDriver().findElements(By.xpath(xpathAccount)).get(i).click();
								sExpectedAccount = sAccount;
								break;
							}
							sCount = i;

						}
						if (sCount + 1 >= CL.GetDriver().findElements(By.xpath(xpathAccount)).size()) {
							mobileAction.FuncSwipeOnce("up");
							sSwipeCount++;
						}
					}
				} else {
					for (int iAcc = 1; iAcc < 100; iAcc++) {
						try {

							xpathAccount = "//*[@label='ACCOUNT' or @label='COMPTE']/../../XCUIElementTypeCell[" + iAcc
									+ "]/*[1]";
							temp = getMatchedAccount(
									CL.GetDriver().findElement(By.xpath(xpathAccount)).getAttribute("label"), sRapcode);
							if (temp.length() > 0) {
								String sFullAccount = CL.GetDriver().findElement(By.xpath(xpathAccount))
										.getAttribute("label");
								String sAccNumber = sFullAccount.substring(sFullAccount.length() - 7,
										sFullAccount.length());
								String xpathAccNumber = "//*[contains(@label,'" + sAccNumber + "')]";
								mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathAccNumber, true, 100, "up");
								flag = true;
								sExpectedAccount = sAccNumber;
								break;
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}

				if (flag) {
					CL.GetReporting().FuncReport("Pass",
							sExpectedAccount + " with rapcode <b>" + sRapcode + "</b> selected.");
					mobileAction.verifyElement(messageNegative, getTestdata("WarningMessage", XLSheetUserIDs));
				} else
					CL.GetReporting().FuncReport("Fail", "No account with rapcode <b>" + sRapcode + "</b> found.");
			} catch (Exception e) {
				try {
					CL.GetReporting().FuncReport("Fail",
							"Exception.No account with rapcode <b>" + aRapcode[iCnt] + "</b> found.");
					e.printStackTrace();
				} catch (Exception e1) {

				}

			}
		}
	}

	public String getMatchedAccount(String sAccountNum, String sRapCode) {
		String sReturnPrice = "";
		String sPattern = "";
		try {
			sPattern = sRapCode + "$";
			Pattern p = Pattern.compile("(" + sPattern + ")");
			Matcher m = p.matcher(sAccountNum);

			// if an occurrence if a pattern was found in a given string...
			if (m.find()) {
				// ...then you can use group() methods.
				// System.out.println(m.group(0)); // whole matched expression
				/*
				 * if(m.group(0).contains(",")) sReturnPrice =
				 * m.group(0).replaceAll(",", ".").trim(); else
				 */
				sReturnPrice = m.group(0).trim();
			}
		}
		// }
		catch (Exception e) {
			e.printStackTrace();
		}
		return sReturnPrice;
	}

	public void verifyInvalidTradingPassword() {
		Decorator();
		try {
			TradeMultiLeg.get().fillStockOptionOrder(firstAskCALLS, "firstAskCALLS");

			mobileAction.FuncClick(previewOrderButton, "previewOrderButton");

			mobileAction.verifyElement(ErrTradingPwd, getTestdata("WarningMessage", XLSheetUserIDs));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * public static void main(String args[]){ //MainScreenMIT.get().OpenApp();
	 * Test();
	 */

	// }
}
