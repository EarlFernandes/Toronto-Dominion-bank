package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ApplePay extends _CommonPage {

	private static ApplePay ApplePay;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Add a Card']")
	private MobileElement addACard;

	@iOSFindBy(xpath = "//*[@label='Tap a Card to Add to Apple Pay']")
	private MobileElement tapCardHeader;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;

	// @iOSFindBy(xpath =
	// "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[@name='TDMobilePayment.bundle/card_TEF_E']")
	// private MobileElement FirstCard;
	//

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
	private MobileElement firstCard;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
	private MobileElement secondCard;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
	private MobileElement thirdCard;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
	private MobileElement fourthCard;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement doneButton;

	@iOSFindBy(xpath = "//*[contains(@label,'Yourcard is ready to use with Apple Pay.')]")
	private MobileElement cardAddedMessage;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton")
	private MobileElement setUpPayButton;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]//XCUIElementTypeButton[2]")
	private MobileElement payButton;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]//XCUIElementTypeButton[1]")
	private MobileElement defaultCard;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
	private MobileElement defaultCardName;

	@iOSFindBy(xpath = "//*[contains(@label,'Sorry, none of your cards are eligible to use Apple Pay')]")
	private MobileElement noEligibleCardMessage;

	@iOSFindBy(xpath = " //*[@label='Continue')]")
	private MobileElement continueButton;

	@iOSFindBy(xpath = " //*[@label='Get Started')]")
	private MobileElement getStartedButton;

	public synchronized static ApplePay get() {
		if (ApplePay == null) {
			ApplePay = new ApplePay();
		}
		return ApplePay;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	/**
	 * This method will click on the add on card in apple pay page
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
	public void clickAddCard() {

		infoPage();
		Decorator();
		try {
			mobileAction.FuncClick(addACard, "Add A Card");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void infoPage() {

		mobileAction.waitForElementToVanish(progressBar);

		Decorator();
		try {

			if (continueButton.isDisplayed()) {
				mobileAction.FuncClick(continueButton, "Continue");
				mobileAction.FuncClick(getStartedButton, "Get Started");
			}
		} catch (Exception e) {
			System.out.print("Exception from Method " + this.getClass().toString());
		}
	}

	/**
	 * This method will select a card from list of cards
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
	public void selectCard() {

		infoPage();
		Decorator();
		try {
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(firstCard, "Select the card");

			mobileAction.FuncClick(setUpPayButton, "Set Up Pay");

			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(doneButton, "Done");

			mobileAction.waitForElementToVanish(progressBar);

			mobileAction.FuncClick(payButton, "Pay");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void changeDefaultCard() {

		Decorator();
		try {
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(firstCard, "Select the card");
			mobileAction.FuncClick(setUpPayButton, "Set Up Pay");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(doneButton, "Done");
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(defaultCard, "Default Card");
			mobileAction.FuncClick(payButton, "Pay");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void checkEligibleCard() {

		infoPage();
		Decorator();
		try {
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.verifyElementIsDisplayed(noEligibleCardMessage, "No Eligible card");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void checkPersonalCard() {

		infoPage();
		Decorator();
		try {
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(firstCard, "Select the card");
			mobileAction.verifyElementTextContains(defaultCardName, "Aeroplane");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void checkBusinessCard() {

		infoPage();
		Decorator();
		try {
			mobileAction.waitForElementToVanish(progressBar);
			mobileAction.FuncClick(firstCard, "Select the card");
			mobileAction.verifyElementTextContains(defaultCardName, "Business");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
}
