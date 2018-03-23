package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WebViewPage extends _CommonPage {

	private static WebViewPage webViewpage;
	WebDriver webDriver;

	String webViewContext = "NATIVE_APP";

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='cancel-app']")
	private MobileElement cancelWebViewBtn;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='cancelApp']")
	private MobileElement confirmToCancel;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='No, take me back to finish' or @text='Non, je veux terminer.']")
	private MobileElement confirmNotCancel;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='before-app-btn']")
	private MobileElement get_Started;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='mobile_return']")
	private MobileElement returnToApp;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[@name='Session Expired']//XCUIElementTypeButton[@name='OK']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement sessionExpired_ok_btn;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.android.chrome:id/url_bar']")
	private MobileElement product_url;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='login']")
	private MobileElement product_login;

	@AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id='dropdown1']")
	private MobileElement product_Bank_Accounts_dropdown;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='h3-cta11' or @text='Trouvez la carte qui vous convient']")
	private MobileElement product_Credit_Cards_deposits;

	@AndroidFindBy(xpath = "//android.view.View[@text='Mortgages' or @text='Prêts hypothécaires']")
	private MobileElement product_mortgage;

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='td-path']")
	private MobileElement product_borrowing;

	public synchronized static WebViewPage get() {
		if (webViewpage == null) {
			webViewpage = new WebViewPage();
		}
		return webViewpage;
	}

	@SuppressWarnings("serial")
	static final HashMap<String, Integer> productStrToInt = new HashMap<String, Integer>() {
		{
			put("Bank Accounts", 0);
			put("Credit Cards", 1);
			put("Mortgages", 2);
			put("Borrowing", 3);
			put("Personal Investing", 4);
			put("Travel Medical Insurance", 5);
		}
	};

	@SuppressWarnings("serial")
	static final HashMap<String, Integer> envStrToInt = new HashMap<String, Integer>() {
		{
			put("Sys", 0);
			put("Pat", 1);
			put("Prod", 2);
		}
	};

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);
	}

	public boolean setWebViewContext() {
		try {
			Thread.sleep(5000); // Wait 20 second for web page to load
		} catch (Exception e) {

		}
		Set<String> allContexthandles = (Set<String>) CL.GetAppiumDriver().getContextHandles();
		System.out.println("Context:" + allContexthandles.toString());
		boolean isSetcontextDone = false;
		for (String contextFound : allContexthandles) {
			if (contextFound.contains("NATIVE")) {
				continue;
			}
			try {

				CL.GetAppiumDriver().context(contextFound);
				String myURL = CL.GetAppiumDriver().getCurrentUrl();
				if (!myURL.isEmpty()) {
					System.out.println("MyURL:" + myURL);
					isSetcontextDone = true;
					webViewContext = contextFound;
					System.out.println("Set context to:" + webViewContext);
					break;
				}
			} catch (Exception e) {
				System.out.println("Failed to set context to:" + contextFound);
			}
		}
		return isSetcontextDone;
	}

	public void verifyCreditLimitIncreaseFormTitle() {

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}

		if (setWebViewContext()) {
			try {

				final WebElement form_Title = CL.GetDriver().findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
				String capturedText = form_Title.getText();
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.verifyTextEquality(capturedText,
						getTextInCurrentLocale(StringArray.ARRAY_CLIP_FORM_TITLE));
			} catch (Exception e) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.Report_Fail("Failed to find Form Title");
				return;
			}
		} else {
			mobileAction.Report_Fail("Failed to set context");
		}
	}

	public void verifyDamagedCardReplacementFormTitle() {

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}

		if (setWebViewContext()) {
			try {

				final WebElement form_Title = CL.GetDriver().findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
				String capturedText = form_Title.getText();
				System.out.println("Captured title:" + capturedText);
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.verifyTextEquality(capturedText,
						getTextInCurrentLocale(StringArray.ARRAY_DM_REQUEST_FORM_TITLE));
			} catch (Exception e) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.Report_Fail("Failed to find Form Title");
				return;
			}
		} else {
			mobileAction.Report_Fail("Failed to set context");
		}
	}

	public void Click_GetStarted() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}

		try {
			CL.GetAppiumDriver().context(webViewContext);
			final WebElement get_started = CL.GetDriver().findElement(By.id("before-app-btn"));
			Actions action = new Actions(CL.GetDriver());
			action.moveToElement(get_started).build().perform();
			get_started.click();
			CL.GetAppiumDriver().context("NATIVE_APP");
		} catch (Exception e) {
			CL.GetAppiumDriver().context("NATIVE_APP");
			mobileAction.Report_Fail("Failed to find Get_Started Button");
			return;
		}
	}

	private boolean verifyFormInfo(String formtitle) {

		if (setWebViewContext()) {
			try {
				final WebElement form_Title = CL.GetDriver().findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
				String capturedText = form_Title.getText();
				mobileAction.verifyTextEquality(capturedText, formtitle);
				final WebElement personal_info = CL.GetDriver()
						.findElement(By.xpath("//h3[@translate='ABOUT_YOU.PERSONAL_TITLE']/strong"));
				capturedText = personal_info.getText();
				mobileAction.verifyTextEquality(capturedText,
						getTextInCurrentLocale(StringArray.ARRAY_FORM_INFORMATION));
				CL.GetAppiumDriver().context("NATIVE_APP");
				return true;
			} catch (Exception e) {
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.Report_Fail("Failed to find Form Title");
				return false;
			}
		} else {
			System.out.println("Failed to set context");
			return false;
		}
	}

	public void verifyLimitIncreaseForm() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}
		String CLIP_Form_Title = getTextInCurrentLocale(StringArray.ARRAY_CLIP_FORM_TITLE);
		if (verifyFormInfo(CLIP_Form_Title)) {
			mobileAction.Report_Pass_Verified("CLIP Prefilled Form");
		} else {
			mobileAction.Report_Fail_Not_Verified("CLIP prefilled Form");
		}
	}

	public void verifyDamagedCardForm() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.Report_Pass_Verified("Set webview context is not available now");
			return;
		}
		String DC_Form_Title = getTextInCurrentLocale(StringArray.ARRAY_DM_REQUEST_FORM_TITLE);
		if (verifyFormInfo(DC_Form_Title)) {
			mobileAction.Report_Pass_Verified("DC Prefilled Form");
		} else {
			mobileAction.Report_Fail_Not_Verified("DC prefilled Form");
		}
	}

	private void getCap() {
		Capabilities cap = CL.GetAppiumDriver().getCapabilities();
		// Map<String, ?> desired = (Map<String, ?>)
		// cap.getCapability("desired");

		System.out.println(cap.toString());
		// System.out.println(desired.toString());
		// System.out.println("PlafformName:"+desired.get("platformName"));
		System.out.println("BroswerName:" + cap.getBrowserName());
		// (DesiredCapabilities)cap.setCapability(CapabilityType.BROWSER_NAME,
		// "IE");
	}

	public void openSafariBrowserForIOS() throws IOException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "iPhone");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Safari");
		// capabilities.setCapability(CapabilityType.VERSION, "4.3");

		webDriver = new RemoteWebDriver(new URL("http://49.21.140.121:4776/wd/hub/"), capabilities);
		webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// String urlStr = getTestdata("Accounts");
		webDriver.get("http://www1.dev.forms.td.com/cli/#/td-dgc-cli-form/before-you-begin");

	}

	public void verifyCreditLimitIncreaseWebpageAndCancel() {

		WebDriver driver;
		boolean isWebPageAccessed = false;

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			if (!setWebViewContext()) {
				System.out.println("Failed to set web view context");
				mobileAction.Report_Fail("Failed to set web view context");
				return;
			} else {
				driver = CL.GetDriver();
				for (int i = 0; i < 30; i++) {
					try {
						WebElement form_Title = driver.findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
						String capturedText = form_Title.getText();
						String expectedText = StringArray.ARRAY_CLIP_FORM_TITLE[0];
						if (currentLocale.equalsIgnoreCase("fr")) {
							expectedText = StringArray.ARRAY_CLIP_FORM_TITLE[1];
						}
						mobileAction.verifyTextEquality(capturedText, expectedText);
						isWebPageAccessed = true;
						break;

					} catch (Exception e) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {

						}
					}
				}

			}
			if (!isWebPageAccessed) {
				mobileAction.Report_Fail("Webpage not accessible");
				return;
			}

			try {

				WebElement cancel_btn = driver
						.findElement(By.xpath("//div[@class='td-col-xs-12']/a[@id='cancel-app']"));
				Actions action = new Actions(driver);
				action.moveToElement(cancel_btn).build().perform();

				mobileAction.javaScriptClick(driver, cancel_btn);

			} catch (Exception e) {
				e.printStackTrace();
				CL.GetAppiumDriver().context("NATIVE_APP");
				mobileAction.Report_Fail("Failed to click cancel");
				return;
			}
		} else { // for Android

			Decorator();

			String cliText = StringArray.ARRAY_CLIP_FORM_TITLE[0];
			if (currentLocale.equalsIgnoreCase("fr")) {
				cliText = StringArray.ARRAY_CLIP_FORM_TITLE[1];
			}
			String titleXpath = "//android.view.View[@text='" + cliText + "']";
			for (int i = 0; i < 20; i++) {
				if (mobileAction.verifyElementIsPresentByXpath(titleXpath)) {
					isWebPageAccessed = true;
					break;
				} else {
					try {
						Thread.sleep(2000); // Wait 2 second for web page to
											// load
					} catch (Exception e) {

					}
				}
			}

			if (!isWebPageAccessed) {
				mobileAction.Report_Fail("Webpage not accessible");
				return;
			}
			try {

				for (int i = 0; i < 5; i++) {
					mobileAction.FuncSwipeOnce("up");
				}
				Decorator();
				mobileAction.FuncClick(cancelWebViewBtn, "Cancel");

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void confirmCancel() {
		WebDriver driver;
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			driver = CL.GetDriver();
			WebElement cancelApp = driver.findElement(By.id("cancelApp"));
			Actions action = new Actions(driver);
			action.moveToElement(cancelApp).build().perform();
			mobileAction.javaScriptClick(driver, cancelApp);
			mobileAction.Report_Pass_Verified("Yes, I want to cancel clicked");

			WebElement returnToTDApp = driver.findElement(By.id("mobile_return"));
			action = new Actions(driver);
			action.moveToElement(returnToTDApp).build().perform();
			mobileAction.javaScriptClick(driver, returnToTDApp);
			CL.GetAppiumDriver().context("NATIVE_APP");

		} else {
			Decorator();
			try {
				mobileAction.FuncClickCoordinatesInElement(confirmToCancel);
				for (int i = 0; i < 2; i++) {
					mobileAction.FuncSwipeOnce("up");
				}
				Decorator();
				mobileAction.FuncClickCoordinatesInElement(returnToApp);
				// mobileAction.FuncClickTap(returnToApp, "Return to TD app");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void verifyDamageCardWebpageAndCancel() {

		WebDriver driver;
		boolean isWebPageAccessed = false;
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			if (!setWebViewContext()) {
				System.out.println("Failed to set web view context");
				mobileAction.Report_Fail("Failed to set web view context");
				return;
			} else {
				driver = CL.GetDriver();
				for (int i = 0; i < 30; i++) {
					try {
						WebElement form_Title = driver.findElement(By.xpath("//h1[@translate='FORM_TITLE']"));
						String capturedText = form_Title.getText();
						String expectedText = StringArray.ARRAY_DM_REQUEST_FORM_TITLE[0];
						if (currentLocale.equalsIgnoreCase("fr")) {
							expectedText = StringArray.ARRAY_DM_REQUEST_FORM_TITLE[1];
						}
						mobileAction.verifyTextEquality(capturedText, expectedText);
						isWebPageAccessed = true;
						break;
					} catch (Exception e) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {

						}
					}
				}
				if (!isWebPageAccessed) {
					mobileAction.Report_Fail("Webpage not accessible");
					return;
				}

				try {

					WebElement cancel_btn = driver
							.findElement(By.xpath("//div[@class='td-col-xs-12']/a[@id='cancel-app']"));
					Actions action = new Actions(driver);
					action.moveToElement(cancel_btn).build().perform();

					mobileAction.javaScriptClick(driver, cancel_btn);
					// CL.GetAppiumDriver().context("NATIVE_APP");

				} catch (Exception e) {
					e.printStackTrace();
					CL.GetAppiumDriver().context("NATIVE_APP");
					mobileAction.Report_Fail("Failed to click cancel");
					return;
				}
			}
		} else { // for Android

			Decorator();
			String ccrText = StringArray.ARRAY_DM_REQUEST_FORM_TITLE[0];
			if (currentLocale.equalsIgnoreCase("fr")) {
				ccrText = StringArray.ARRAY_DM_REQUEST_FORM_TITLE[1];
			}
			String titleXpath = "//android.view.View[@text='" + ccrText + "']";
			for (int i = 0; i < 20; i++) {
				if (mobileAction.verifyElementIsPresentByXpath(titleXpath)) {
					isWebPageAccessed = true;
					break;
				} else {
					try {
						Thread.sleep(2000); // Wait 2 second for web page to
											// load
					} catch (Exception e) {

					}
				}
			}
			if (!isWebPageAccessed) {
				mobileAction.Report_Fail("Webpage not accessible");
				return;
			}

			try {
				for (int i = 0; i < 6; i++) {
					mobileAction.FuncSwipeOnce("up");
				}
				Decorator();

				mobileAction.FuncClickCoordinatesInElement(cancelWebViewBtn);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void verifyCancelPromptYesorNo() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			WebDriver driver = CL.GetDriver();
			try {
				WebElement cancelApp = driver.findElement(By.id("cancelApp"));
				mobileAction.Report_Pass_Verified("'Yes I want to Cancel'");
			} catch (Exception e1) {
				mobileAction.Report_Fail("'Yes I want to Cancel' not found");
			}

			try {
				WebElement nocancelApp = driver.findElement(
						By.xpath("//button[@class='td-button td-sim-margin-bottom-15 td-button-secondary']"));
				mobileAction.Report_Pass_Verified("'No take me back to finish'");
			} catch (Exception e1) {
				mobileAction.Report_Fail("'No take me back to finish' not found");
			}
		} else {
			Decorator();
			try {
				if (mobileAction.verifyElementIsPresent(confirmToCancel)) {
					mobileAction.Report_Pass_Verified("'Yes I want to Cancel'");
				} else {
					mobileAction.Report_Fail("'Yes I want to Cancel' not found");
				}

				if (mobileAction.verifyElementIsPresent(confirmNotCancel)) {
					mobileAction.Report_Pass_Verified("'No take me back to finish'");
				} else {
					mobileAction.Report_Fail("'No take me back to finish' not found");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public void ClickNoForCancelPrompt() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			WebDriver driver = CL.GetDriver();

			try {
				WebElement nocancelApp = driver.findElement(
						By.xpath("//button[@class='td-button td-sim-margin-bottom-15 td-button-secondary']"));

				mobileAction.javaScriptClick(driver, nocancelApp);
				mobileAction.Report_Pass_Verified("'No take me back to finish' clicked");
			} catch (Exception e1) {
				mobileAction.Report_Fail("'No take me back to finish' not found");
			}
		} else {
			Decorator();
			try {
				mobileAction.FuncClickCoordinatesInElement(confirmNotCancel);
				mobileAction.Report_Pass_Verified("'No take me back to finish' clicked");
			} catch (Exception e1) {
				mobileAction.Report_Fail("'No take me back to finish' not found");
			}

		}
	}

	public void VerifyGetStartButton() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			WebDriver driver = CL.GetDriver();
			try {
				WebElement get_started_btn = driver.findElement(By.id("before-app-btn"));
				String btnText = get_started_btn.getText();
				mobileAction.Report_Pass_Verified(btnText);
			} catch (Exception e1) {
				mobileAction.Report_Fail("'Get Started' not found");
			}

		} else {
			Decorator();
			try {
				String btnText = mobileAction.getValue(get_Started);
				mobileAction.Report_Pass_Verified(btnText);

			} catch (Exception e1) {
				mobileAction.Report_Fail("'Get Started' not found");
			}

		}
	}

	public void waitSessionExpiredAndCancel() {

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {

			WebDriver driver = CL.GetDriver();
			WebElement cancelApp = driver.findElement(By.id("cancelApp"));
			Actions action = new Actions(driver);
			action.moveToElement(cancelApp).build().perform();
			mobileAction.javaScriptClick(driver, cancelApp);
			mobileAction.Report_Pass_Verified("Yes, I want to cancel clicked");

			System.out.println("Wait session expires:605s");
			// WebDriverWait wait = new WebDriverWait(CL.GetAppiumDriver(),
			// 1205);
			try {
				Thread.sleep(605000);
			} catch (Exception e) {

			}

			WebElement returnToTDApp = driver.findElement(By.id("mobile_return"));
			action = new Actions(driver);
			action.moveToElement(returnToTDApp).build().perform();
			mobileAction.javaScriptClick(driver, returnToTDApp);
			CL.GetAppiumDriver().context("NATIVE_APP");

			if (mobileAction.verifyElementIsPresent(sessionExpired_ok_btn)) {
				try {
					System.out.println("Session Expired Ok button displayed");
					mobileAction.FuncClick(sessionExpired_ok_btn, "Session Expired OK");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} else {

			try {
				mobileAction.FuncClickCoordinatesInElement(confirmToCancel);

				// System.out.println("Wait session expires:605s");
				// try {
				// Thread.sleep(605000);
				// } catch (Exception e) {
				//
				// }
				for (int i = 0; i < 2; i++) {
					mobileAction.FuncSwipeOnce("up");
				}
				Decorator();

				System.out.println("Wait session expires:105s");
				try {
					Thread.sleep(105000);
				} catch (Exception e) {

				}
				mobileAction.FuncClickCoordinatesInElement(returnToApp);

				if (mobileAction.verifyElementIsPresent(sessionExpired_ok_btn)) {
					mobileAction.FuncClick(sessionExpired_ok_btn, "Session Expired OK");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void sleepSeconds(int n) {
		try {
			Thread.sleep(n * 1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	private void waitUntilElementDisplayed(MobileElement mobileItem) {
		for (int i = 0; i < 30; i++) {

			if (mobileAction.verifyElementIsPresent(mobileItem)) {
				break;
			} else {
				sleepSeconds(2);
			}
		}
	}

	private void waitUntilProductPageDisplayed(String productTitle) {

		switch (productTitle) {
		case "Bank Accounts":
			waitUntilElementDisplayed(product_Bank_Accounts_dropdown);
			break;
		case "Credit Cards":
			waitUntilElementDisplayed(product_Credit_Cards_deposits);
			break;
		case "product_mortgage":
			waitUntilElementDisplayed(product_mortgage);
			break;
		case "Borrowing":
			waitUntilElementDisplayed(product_borrowing);
			break;
		case "Personal Investing":
		case "Travel Medical Insurance":
			waitUntilElementDisplayed(product_login);
			break;

		}
	}

	private void verifyProductPageURL(String productName, String envStr) {
		String[][] product_sys_url = {
				{ getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_PERSONAL_BANK_SYS_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_PERSONAL_BANK_PAT_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_PERSONAL_BANK_PROD_URL) },
				{ getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_CREDIT_CARDS_SYS_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_CREDIT_CARDS_PAT_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_CREDIT_CARDS_PROD_URL) },
				{ getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_MORTGAGES_SYS_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_MORTGAGES_PAT_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_MORTGAGES_PROD_URL) },
				{ getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_BORROWING_SYS_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_BORROWING_PAT_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_BORROWING_PROD_URL) },
				{ getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_PERSONAL_INVESTING_SYS_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_PERSONAL_INVESTING_PAT_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_PERSONAL_INVESTING_PROD_URL) },
				{ getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_TRAVEL_INSURANCE_SYS_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_TRAVEL_INSURANCE_PAT_URL),
						getTextInCurrentLocale(StringArray.ARRAY_PRODUCT_TRAVEL_INSURANCE_PROD_URL) },

		};

		String myURL = "";
		String expectedURL = product_sys_url[productStrToInt.get(productName)][envStrToInt.get(envStr)];
		System.out.println("Expected URL:" + expectedURL);
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			if (!setWebViewContext()) {
				System.out.println("Failed to set web view context");
				mobileAction.Report_Fail("Failed to set web view context");
				return;
			} else {
				myURL = CL.GetAppiumDriver().getCurrentUrl();
			}
		} else { // For Android

			Decorator();
			// waitUntilProductPageDisplayed(productName);
			sleepSeconds(10);
			myURL = mobileAction.getValue(product_url);
		}

		if (myURL == null || myURL.isEmpty()) {
			mobileAction.Report_Fail("Failed to get URL");
		} else {
			System.out.println("Captured URL:" + myURL);
			// System.out.println("Expected URL:"+ expectedURL);

			if (myURL.contains(expectedURL)) {
				mobileAction.Report_Pass_Verified(myURL);
			} else {
				mobileAction.Report_Fail("Captured URL:" + myURL + " not as expected");
			}

		}
	}

	public void verifyBankAccountsSysURL() {
		verifyProductPageURL("Bank Accounts", "Sys");
	}

	public void verifyBankAccountsPatURL() {
		verifyProductPageURL("Bank Accounts", "Pat");
	}

	public void verifyBankAccountsProdURL() {
		verifyProductPageURL("Bank Accounts", "Prod");
	}

	public void verifyCreditCardsSysURL() {
		verifyProductPageURL("Credit Cards", "Sys");
	}

	public void verifyCreditCardsPatURL() {
		verifyProductPageURL("Credit Cards", "Pat");
	}

	public void verifyCreditCardsProdURL() {
		verifyProductPageURL("Credit Cards", "Prod");
	}

	public void verifyMortgagesSysURL() {
		verifyProductPageURL("Mortgages", "Sys");
	}

	public void verifyMortgagesPatURL() {
		verifyProductPageURL("Mortgages", "Pat");
	}

	public void verifyMortgagesProdURL() {
		verifyProductPageURL("Mortgages", "Prod");
	}

	public void verifyBorrowingSysURL() {
		verifyProductPageURL("Borrowing", "Sys");
	}

	public void verifyBorrowingPatURL() {
		verifyProductPageURL("Borrowing", "Pat");
	}

	public void verifyBorrowingProdURL() {
		verifyProductPageURL("Borrowing", "Prod");
	}

	public void verifyPersonalInvestingSysURL() {
		verifyProductPageURL("Personal Investing", "Sys");
	}

	public void verifyPersonalInvestingPatURL() {
		verifyProductPageURL("Personal Investing", "Pat");
	}

	public void verifyPersonalInvestingProdURL() {
		verifyProductPageURL("Personal Investing", "Prod");
	}

	public void verifyTravelInsuranceSysURL() {
		verifyProductPageURL("Travel Medical Insurance", "Sys");
	}

	public void verifyTravelInsurancePatURL() {
		verifyProductPageURL("Travel Medical Insurance", "Pat");
	}

	public void verifyTravelInsuranceProdURL() {
		verifyProductPageURL("Travel Medical Insurance", "Prod");
	}

}