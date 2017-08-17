package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CrossBorder extends _CommonPage {

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText")
	private List<MobileElement> staticTextsWelcomePage;

	@iOSFindBy(xpath = "//XCUIElementTypeLink")
	private List<MobileElement> links;

	private static CrossBorder CrossBorder;

	public synchronized static CrossBorder get() {
		if (CrossBorder == null) {
			CrossBorder = new CrossBorder();
		}
		return CrossBorder;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will click on login to cross border banking
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void clickLogin() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				// TODO: iOS elements
			} else {
				// Set<String> contextNames = ((AppiumDriver)
				// CL.GetDriver()).getContextHandles();
				// for (String contextName : contextNames) {
				// System.out.println(contextNames); //prints out something like
				// NATIVE_APP \n WEBVIEW_1
				// }
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				// System.out.println("source : "+ ((AppiumDriver)
				// CL.GetDriver()).getPageSource());
				final WebElement loginButton = (WebElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.id("callLoginpopup"));
				loginButton.click();
			}

			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
		} catch (NoSuchElementException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	private static final String WELCOME_EXPECTED_TEXT_EN = "Cross-Border Banking\n  TRANSFER MONEY\nTRAVEL INSURANCE\nORDER U.S. CASH\nBORDER INFORMATION\nWherever you roam, bank like you’re at home\nLearn more about TD Cross-Border Banking\nOpen a U.S. based account with TD Bank, N.A.†\nTo login to TD Bank, N.A.†. you need to register for Online Banking. Sign up.\n  View current exchange rates\nNeed help?\nCall the TD Cross-Border Banking Support Line at 1-877-700-2913\nTD Bank, N.A.† Account Login\n† TD Bank, N.A. is a wholly-owned U.S. subsidiary of The Toronto Dominion Bank.\nFAQs Privacy and Security Legal";
	private static final String WELCOME_EXPECTED_TEXT_ZH_SIMP = "跨境理财服务\n  转账\n旅行保险\n订购美金\n跨境信息\n无论身处何地，理财一样便捷\n了解有关道明跨境理财服务的更多信息\n开通北美道明银行的美国账户。†\n登录北美道明银行†账户前，请先注册网上理财服务。注册。\n  查看当前汇率\n需要帮助？\n致电道明跨境理财服务服务热线：1-877-700-2913\n北美道明银行†账户登录\n†北美道明银行是道明银行(The Toronto Dominion Bank)的全资美国子公司。\n常见问答 隐私与安全 法律声明";
	private static final String WELCOME_EXPECTED_TEXT_ZH_TRAD = "跨國理財服務\n  轉賬\n旅行保險\n訂購美元現金\n跨國資訊\n無論身處何地，理財一樣便捷\n了解道明跨國理財服務的詳情\n開設在美國的TD Bank, N.A.†賬戶\n想登入TD Bank, N.A.†，請先註冊網上理財服務。註冊。\n  查看目前匯率\n需要幫助？\n請致電道明跨國理財服務專線：1-877-700-2913\nTD Bank, N.A.†賬戶登入\n†TD Bank, N.A.是道明銀行(The Toronto Dominion Bank)的全資美國子公司。\n常見問題 隱私權和安全性 法律條文";

	private static final String POPUP_EXPECTED_TEXT_EN = "Cross-Border Banking\n  TRANSFER MONEY\nTRAVEL INSURANCE\nORDER U.S. CASH\nBORDER INFORMATION\nWherever you roam, bank like you’re at home\nLearn more about TD Cross-Border Banking\nOpen a U.S. based account with TD Bank, N.A.†\nTo login to TD Bank, N.A.†. you need to register for Online Banking. Sign up.\n  View current exchange rates\nNeed help?\nCall the TD Cross-Border Banking Support Line at 1-877-700-2913\nTD Bank, N.A.† Account Login\n† TD Bank, N.A. is a wholly-owned U.S. subsidiary of The Toronto Dominion Bank.\nFAQs Privacy and Security Legal"
			+ "\n\n\n\n\nConnecting to TD Bank, America's Most Convenient Bank online banking website\nYou are about to leave the Canadian TD mobile app. The Online Privacy Code for TD Bank, America's Most Convenient Bank will apply while using the U.S. online banking website.\nCancel\n   Continue\n\nOR\nDownload TD Bank (US) App";
	private static final String POPUP_EXPECTED_TEXT_ZH_SIMP = "跨境理财服务\n  转账\n旅行保险\n订购美金\n跨境信息\n无论身处何地，理财一样便捷\n了解有关道明跨境理财服务的更多信息\n开通北美道明银行的美国账户。†\n登录北美道明银行†账户前，请先注册网上理财服务。注册。\n  查看当前汇率\n需要帮助？\n致电道明跨境理财服务服务热线：1-877-700-2913\n北美道明银行†账户登录\n†北美道明银行是道明银行(The Toronto Dominion Bank)的全资美国子公司。\n常见问答 隐私与安全 法律声明"
			+ "\n\n\n\n\n连接至TD Bank, America's Most Convenient Bank网上理财服务网站\n您即将退出加拿大道明移动应用程序。使用美国网上理财服务网站时，应遵循TD Bank, America's Most Convenient Bank的网上隐私权规范。\n取消\n   继续\n\n或\n下载道明银行（美国）应用";
	private static final String POPUP_EXPECTED_TEXT_ZH_TRAD = "跨國理財服務\n  轉賬\n旅行保險\n訂購美元現金\n跨國資訊\n無論身處何地，理財一樣便捷\n了解道明跨國理財服務的詳情\n開設在美國的TD Bank, N.A.†賬戶\n想登入TD Bank, N.A.†，請先註冊網上理財服務。註冊。\n  查看目前匯率\n需要幫助？\n請致電道明跨國理財服務專線：1-877-700-2913\nTD Bank, N.A.†賬戶登入\n†TD Bank, N.A.是道明銀行(The Toronto Dominion Bank)的全資美國子公司。\n常見問題 隱私權和安全性 法律條文"
			+ "\n\n\n\n\n連結至TD Bank, America's Most Convenient Bank 網上理財服務網站\n您即將退出加拿大道明流動應用程式。使用美國網上理財服務網站時，應遵循TD Bank, America's Most Convenient Bank的網上隱私權規範。\n取消\n   下一步\n\n或\n下載道明銀行（美國）應用程式";

	public void verifyCrossBorderWelcomeTextElements() {
		Decorator();
		// Set<String> contextNames = CL.GetAppiumDriver().getContextHandles();
		// for (String contextName : contextNames) {
		// System.out.println("DAVID>>>>" + contextNames); //prints out
		// something like [NATIVE_APP, WEBVIEW_<APP_PKG_NAME>]
		// }
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String expectedText = "";
				switch (currentLocale) {
				case "EN":
				case "en":
					expectedText = POPUP_EXPECTED_TEXT_EN;
					break;
				case "zh-Hans":
					expectedText = POPUP_EXPECTED_TEXT_ZH_SIMP;
					break;
				case "zh-Hant":
					expectedText = POPUP_EXPECTED_TEXT_ZH_TRAD;
					break;
				}
				for (MobileElement e : staticTextsWelcomePage) {
					if (e != null && e.getText() != null) {
						if (!expectedText.contains(e.getText())) {
							throw new NoSuchElementException(
									"Expected text: " + expectedText + " did not contain: " + e.getText());
						}
						break;
					}
				}

				for (MobileElement f : links) {
					if (!StringUtils.isEmpty(f.getText())) {
						if (!expectedText.contains(f.getText())) {
							throw new NoSuchElementException(
									"Expected text: " + expectedText + " did not contain: " + f.getText());
						}
						break;
					}
				}
			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				// System.out.println("DAVID >>>>" +
				// CL.GetAppiumDriver().getPageSource());
				final String text = ((AppiumDriver) CL.GetDriver()).findElement(By.cssSelector("body")).getText();
				// System.out.println(text);
				String expectedText = "";
				switch (currentLocale) {
				case "EN":
				case "en":
					expectedText = WELCOME_EXPECTED_TEXT_EN;
					break;
				case "zh":
					expectedText = WELCOME_EXPECTED_TEXT_ZH_SIMP;
					break;
				case "zh-rHK":
					expectedText = WELCOME_EXPECTED_TEXT_ZH_TRAD;
					break;
				}
				// System.out.println(text);
				if (!text.trim().equals(expectedText)) {
					throw new NoSuchElementException(
							"Text were not equal, expected: " + expectedText + " was: " + text);
				}
				// Switch back to native to get proper screenshots
				mobileAction.switchAppiumContext("NATIVE_APP");
			}
		} catch (NoSuchElementException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void verifyCrossBorderLoginPopupTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String expectedText = "";
				switch (currentLocale) {
				case "EN":
				case "en":
					expectedText = POPUP_EXPECTED_TEXT_EN;
					break;
				case "zh-Hans":
					expectedText = POPUP_EXPECTED_TEXT_ZH_SIMP;
					break;
				case "zh-Hant":
					expectedText = POPUP_EXPECTED_TEXT_ZH_TRAD;
					break;
				}
				for (MobileElement e : staticTextsWelcomePage) {
					if (e != null && e.getText() != null) {
						if (!expectedText.contains(e.getText())) {
							throw new NoSuchElementException(
									"Expected text: " + expectedText + " did not contain: " + e.getText());
						}
						break;
					}
				}

				for (MobileElement f : links) {
					if (!StringUtils.isEmpty(f.getText())) {
						if (!expectedText.contains(f.getText())) {
							throw new NoSuchElementException(
									"Expected text: " + expectedText + " did not contain: " + f.getText());
						}
						break;
					}
				}
			} else {
				// Switching to webview
				mobileAction.switchAppiumContext("WEBVIEW_com.td");
				// System.out.println("source : "+ ((AppiumDriver)
				// CL.GetDriver()).getPageSource());
				final String text = ((AppiumDriver) CL.GetDriver()).findElement(By.cssSelector("body")).getText();
				// System.out.println(text);
				String expectedText = "";
				switch (currentLocale) {
				case "EN":
				case "en":
					expectedText = POPUP_EXPECTED_TEXT_EN;
					break;
				case "zh":
					expectedText = POPUP_EXPECTED_TEXT_ZH_SIMP;
					break;
				case "zh-rHK":
					expectedText = POPUP_EXPECTED_TEXT_ZH_TRAD;
					break;
				}
				// System.out.println(text);
				if (!text.trim().equals(expectedText)) {
					throw new NoSuchElementException(
							"Text were not equal, expected: " + expectedText + " was: " + text);
				}
			}

			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
		} catch (NoSuchElementException e) {
			// Switch back to native to get proper screenshots
			mobileAction.switchAppiumContext("NATIVE_APP");
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
}
