package com.td.test.TDI;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;
import com.td.test.CDNMobile.pages.GoogleVoiceWebPage;
import com.td.test.CDNMobile.pages.Login;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TDIHomescreen extends _CommonPage {

	private static TDIHomescreen TDIHomescreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Manage  Policies']")
	@AndroidFindBy(id = "com.td.insurance:id/panel_my_insurance")
	private MobileElement managePolicies;

	// vishal
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Menu']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@content-desc,'Insurance Menu Button')]")
	private MobileElement menu;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Homepage']")
	@AndroidFindBy(id = "com.td.insurance:id/lblListHeader")
	private MobileElement menuVerify;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Start a Claim']")
	@AndroidFindBy(id = "com.td.insurance:id/panel_start_a_claim")
	private MobileElement homeClaim;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='Enter PIN']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td.insurance:id/textView_pin_header']")
	private MobileElement enterPIN;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert//following::XCUIElementTypeButton[@label='Create PIN']")
	@AndroidFindBy(id = "com.td.insurance:id/btn_pin_create")
	private MobileElement createPIN;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Get a Quote']")
	@AndroidFindBy(id = "com.td.insurance:id/panel_get_a_quote")
	private MobileElement getQuote;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='TD MyAdvantage']")
	@AndroidFindBy(id = "com.td.insurance:id/panel_my_advantage")
	private MobileElement tdMyAdvantage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[contains(@label, 'Auto Shops')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Preferred Auto Shops']")
	private MobileElement autoShops;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[contains(@label, 'Insurance')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Insurance Card']")
	private MobileElement insuranceCard;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[contains(@label, 'Accident Reports')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Accident Reports']")
	private MobileElement accReport;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[contains(@label, 'FAQs')]")
	@AndroidFindBy(id = "com.td.insurance:id/txt_insuranceFAQs")
	private MobileElement homeFaq;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label= 'Contact Us']")
	@AndroidFindBy(id = "com.td.insurance:id/txt_contactUs")
	private MobileElement contactUs;

	// TODO@iOSXCUITFindBy(xpath="")
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='start a claim online.']")
	private MobileElement claimLink;

	// TODO@iOSXCUITFindBy(xpath="")
	@AndroidFindBy(id = "com.td.insurance:id/cta_button_text")
	private MobileElement accAssist;

	public synchronized static TDIHomescreen get() {
		if (TDIHomescreen == null) {
			TDIHomescreen = new TDIHomescreen();
		}
		return TDIHomescreen;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}

	/**
	 * This method will click on manage policies on the home screen.
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
	public void clickManagePolicies() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(managePolicies, "Manage Policies");
		} catch (Exception e) {
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

	// vishal---------
	/**
	 * This method will click on the menu in the home screen.
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
	public void clickMenu() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(menu, "click on menu");
			mobileAction.verifyElementIsDisplayed(menuVerify, "menu opened");
		} catch (Exception e) {
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
	 * This method will click on start a claim in the home screen,create a PIN or
	 * enter PIN.
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
	public void clickStartClaim() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(homeClaim, "Start a claim");
			String pin = getTestdata("PIN", "UserIDs");
			if (mobileAction.verifyElementIsPresent(enterPIN)) {
				if (CL.GetAppiumDriver().getPlatformName().equalsIgnoreCase("Android")) {
					((MobileElement) CL.GetDriver().findElement(By.id("com.td.insurance:id/textView_pin_header")))
							.setValue(pin);
				} else {
					mobileAction.FuncSendKeys(pin);
				}
			} else {
				mobileAction.FuncClick(createPIN, "create a PIN");
				if (CL.GetAppiumDriver().getPlatformName().equalsIgnoreCase("Android")) {
					((MobileElement) CL.GetDriver().findElement(By.id("com.td.insurance:id/textView_pin_header")))
							.setValue(pin);
					((MobileElement) CL.GetDriver().findElement(By.id("com.td.insurance:id/textView_pin_header")))
							.setValue(pin);
				} else {
					mobileAction.FuncSendKeys(pin);
					mobileAction.FuncSendKeys(pin);
				}
			}
		} catch (Exception e) {
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
	 * This method will click on get quote on home screen.
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
	public void getQuote() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(getQuote, "Get a Quote");

		} catch (Exception e) {
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
	 * This method will click on TD My Advantage on the home screen.
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
	public void TDMyAdvantage() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(tdMyAdvantage, "TD My Advantage");

		} catch (Exception e) {
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
	 * This method will click on the preferred auto shops.
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
	public void preAutoShops() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(autoShops, "Auto shops");

		} catch (Exception e) {
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
	 * This method will click on the Insurance card on the Home screen.
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
	public void insuranceCard() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(insuranceCard, "Insurance card");
			String pin = getTestdata("PIN", "UserIDs");
			if (mobileAction.verifyElementIsPresent(enterPIN)) {
				if (CL.GetAppiumDriver().getPlatformName().equalsIgnoreCase("Android")) {
					((MobileElement) CL.GetDriver().findElement(By.id("com.td.insurance:id/textView_pin_header")))
							.setValue(pin);
				} else {
					mobileAction.FuncSendKeys(pin);
				}
			} else {
				mobileAction.FuncClick(createPIN, "create a PIN");
				if (CL.GetAppiumDriver().getPlatformName().equalsIgnoreCase("Android")) {
					((MobileElement) CL.GetDriver().findElement(By.id("com.td.insurance:id/textView_pin_header")))
							.setValue(pin);
					((MobileElement) CL.GetDriver().findElement(By.id("com.td.insurance:id/textView_pin_header")))
							.setValue(pin);
				} else {
					mobileAction.FuncSendKeys(pin);
					mobileAction.FuncSendKeys(pin);
				}
			}
		} catch (Exception e) {
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
	 * This method will click on the Accident Report.
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
	public void accidentReport() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(accReport, "Accident report");
			String pin = getTestdata("PIN", "UserIDs");
			if (mobileAction.verifyElementIsPresent(enterPIN)) {
				if (CL.GetAppiumDriver().getPlatformName().equalsIgnoreCase("Android")) {
					((MobileElement) CL.GetDriver().findElement(By.id("com.td.insurance:id/textView_pin_header")))
							.setValue(pin);
				} else {
					mobileAction.FuncSendKeys(pin);
				}
			} else {
				mobileAction.FuncClick(createPIN, "create a PIN");
				if (CL.GetAppiumDriver().getPlatformName().equalsIgnoreCase("Android")) {
					((MobileElement) CL.GetDriver().findElement(By.id("com.td.insurance:id/textView_pin_header")))
							.setValue(pin);
					((MobileElement) CL.GetDriver().findElement(By.id("com.td.insurance:id/textView_pin_header")))
							.setValue(pin);
				} else {
					mobileAction.FuncSendKeys(pin);
					mobileAction.FuncSendKeys(pin);
				}
			}
		} catch (Exception e) {
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
	 * This method will click on the Home Screen Frequently asked questions.
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
	public void homeFAQ() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(homeFaq, "Frequently asked questions");
		} catch (Exception e) {
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
	 * This method will click on the home screen contact US.
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
	public void homeContactUs() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncClick(contactUs, "Contact Us");
		} catch (Exception e) {
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
	 * This method will verify and click on Start a claim link.
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
	public void startClaimLink() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(claimLink, "Start a claim link");
			mobileAction.FuncClick(claimLink, "Start a claim link");
		} catch (Exception e) {
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
	 * This method will verify and click on call accident assistance.
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
	public void accidentAssistance() {
		Decorator();
		try {
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(accAssist, "call accident assistance");
			mobileAction.FuncClick(accAssist, "call accident assistance");
		} catch (Exception e) {
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