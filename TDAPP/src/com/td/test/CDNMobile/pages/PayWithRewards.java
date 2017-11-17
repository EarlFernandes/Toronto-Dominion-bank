package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PayWithRewards extends _CommonPage {

	private static PayWithRewards PayWithRewards;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Pay With Rewards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Pay With Rewards']")
	private MobileElement payWithRewardsHeader;

	@iOSFindBy(xpath = "//*[@label='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/quick_link_item_layout_button' and @text='REWARDS']")
	private MobileElement rewardBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Other']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/other_payment_text']")
	private MobileElement otherBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Please select a redemption amount between $25 and $')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/error_text']")
	private MobileElement errortext;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeTextField[1]")
	@AndroidFindBy(id = "com.td:id/amount_payment_value")
	private MobileElement amountValue;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
	@AndroidFindBy(id = "com.td:id/btn_continue")
	private MobileElement continueBtn;

	By rewardPayee = By
			.xpath("//XCUIElementTypeTable/preceding-sibling::XCUIElementTypeOther/XCUIElementTypeStaticText[1]");

	By iosMaxBtn = By
			.xpath("//XCUIElementTypeStaticText[@label='Maximum']/preceding-sibling::XCUIElementTypeButton[1]");
	By androidMaxBtn = By.xpath("//android.widget.TextView[@resource-id='com.td:id/maximum_payment_value']");
	By androidMinBtn = By.xpath("//android.widget.TextView[@resource-id='com.td:id/minimum_payment_value']");
	By iosMinBtn = By
			.xpath("//XCUIElementTypeStaticText[@label='Minimum']/preceding-sibling::XCUIElementTypeButton[1]");
	By iosamountXpath = By.xpath("//XCUIElementTypeCell[1]/XCUIElementTypeTextField[1]");
	By androidAmountValue = By.xpath("//android.widget.EditText[@resource-id='com.td:id/amount_payment_value']");
	By androidpayee = By.xpath("//android.widget.TextView[@resource-id='com.td:id/account_description']");

	String amountXL = getTestdata("Amount");

	public synchronized static PayWithRewards get() {
		if (PayWithRewards == null) {
			PayWithRewards = new PayWithRewards();
		}
		return PayWithRewards;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will check the Pay With Regards Header is present or not
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void verifyPayWithRewardsHeader() {
		Decorator();
		try {
			mobileAction.FuncISDisplayed(payWithRewardsHeader, "Pay With Rewards Header");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	/**
	 * This method will validate and enter the Amount in Pay With Regards
	 * screen.
	 * 
	 * If the amount is not valid it will throws error text.
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */
	public void validateAndEnterAmount() throws InterruptedException, IOException {
		Decorator();

		try {
			String value = "";
			amountXL = getTestdata("Amount");
			System.out.println("Amount:" + amountXL);
			int i = Integer.parseInt(amountXL);

			// value=
			// CL.GetDriver().findElement(By.xpath("//XCUIElementTypeSegmentedControl[1]/XCUIElementTypeButton[3]")).getAttribute("label");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				value = mobileAction.verifyElementUsingBy(iosMaxBtn);
			} else {
				value = mobileAction.verifyElementUsingBy(androidMaxBtn);
			}

			String replaceValue = value.replaceAll("[^0-9]", "");
			int maxValue = Integer.parseInt(replaceValue);
			System.out.println("maxValue:" + maxValue);

			if (i > ConstantClass.minimum_Value & i < maxValue) {
				mobileAction.FuncClick(otherBtn, "Amount");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
					CL.GetDriver().findElement(iosamountXpath).click();
					CL.GetReporting().FuncReport("Pass", "<b>" + "amount" + "</b> is clicked.");
					CL.GetDriver().findElement(iosamountXpath).clear();
					CL.GetDriver().findElement(iosamountXpath).sendKeys(amountXL);
					CL.GetReporting().FuncReport("Pass", "<b>" + amountXL + "</b> is entered.");

					mobileAction.FuncClickDone();
					mobileAction.FuncClick(continueBtn, "Continue");

				}

				else {
					mobileAction.FuncClick(amountValue, "Amount");
					mobileAction.FuncSendKeys(amountXL);
					// CL.GetDriver().findElement(androidAmountValue).click();
					// //CL.GetDriver().findElement(androidAmountValue).clear();
					// CL.GetDriver().findElement(androidAmountValue).sendKeys("26");
					mobileAction.clickCoOrdinatesPercentage(0.90f, 0.95f, 1);

					mobileAction.FuncClick(continueBtn, "Continue");
				}
			} else {

				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
					CL.GetDriver().findElement(iosamountXpath).click();
					CL.GetReporting().FuncReport("Pass", "<b>" + "amount" + "</b> is clicked.");
					CL.GetDriver().findElement(iosamountXpath).clear();
					CL.GetDriver().findElement(iosamountXpath).sendKeys(amountXL);
					CL.GetReporting().FuncReport("Pass", "<b>" + amountXL + "</b> is entered.");
					mobileAction.FuncClickDone();

					mobileAction.verifyElementIsDisplayed(errortext, ConstantClass.error_msg);

				}

				else {

					mobileAction.FuncClick(amountValue, "Amount");

					// CL.GetDriver()
					// .findElement(By
					// .xpath("//android.widget.EditText[@resource-id='com.td:id/amount_payment_value']"))
					// .sendKeys(amountXL);
					mobileAction.FuncSendKeys(amountXL);
					mobileAction.clickCoOrdinatesPercentage(0.90f, 0.95f, 1);
					mobileAction.verifyElementIsDisplayed(errortext, ConstantClass.error_msg + maxValue);

				}

			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void validateMinAndMaxButton() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				MobileElement minbtn = (MobileElement) CL.GetDriver().findElement(iosMinBtn);
				mobileAction.verifyElementIsDisplayed(minbtn, "Minimum Button");
				MobileElement maxBtn = (MobileElement) CL.GetDriver().findElement(iosMaxBtn);
				mobileAction.verifyElementIsDisplayed(maxBtn, "Maximum Button");

			} else {
				MobileElement element = (MobileElement) CL.GetDriver().findElement(androidMinBtn);
				mobileAction.verifyElementIsDisplayed(element, "Minimum Button");
				MobileElement maxBtn = (MobileElement) CL.GetDriver().findElement(androidMaxBtn);
				mobileAction.verifyElementIsDisplayed(maxBtn, "Maximum Button");

			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void validateMinimumPayment() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				MobileElement minbtn = (MobileElement) CL.GetDriver().findElement(iosMinBtn);
				mobileAction.verifyElementIsDisplayed(minbtn, "Minimum Button");
			} else {
				MobileElement element = (MobileElement) CL.GetDriver().findElement(androidMinBtn);
				mobileAction.verifyElementIsDisplayed(element, "Minimum Button");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyAmountAndContinueIsDisabled() {
		Decorator();
		try {
			String value = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				value = CL.GetDriver().findElement(iosamountXpath).getAttribute("value");
			} else {
				value = mobileAction.verifyElementUsingBy(androidAmountValue);
			}
			if (value.equals(ConstantClass.t_amountValue)) {
				boolean flag = continueBtn.isEnabled();
				if (flag) {
					CL.GetReporting().FuncReport("Pass", "The element <b>- " + " Continue" + "</b> is not Enabled");
				} else {
					CL.GetReporting().FuncReport("Fail", "The element <b>- " + " Continue" + "</b> is not Enabled");
				}
			}
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will validate and enter the Amount in Pay With Regards
	 * screen.
	 * 
	 * If the amount is not valid it will throws error text.
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void verifyRewardPayee() {
		Decorator();
		try {
			String value = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				value = CL.GetDriver().findElement(rewardPayee).getAttribute("label");
			} else {
				value = mobileAction.verifyElementUsingBy(androidpayee);
			}
			String rewardPayeeXL = getTestdata("FromAccount");
			if (value.equals(rewardPayeeXL)) {

				CL.GetReporting().FuncReport("Pass", "The element <b>- " + rewardPayeeXL + "</b> is verified");
			} else {
				CL.GetReporting().FuncReport("Fail", "The element <b>- " + rewardPayeeXL + "</b> is not verified");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void enterRedemptionAmount() {
		Decorator();
		try {

			String amt = "25";
			mobileAction.FuncClick(amountValue, "Amount");
			mobileAction.FuncSendKeys(amountValue, amt);
			mobileAction.FuncClick(continueBtn, "Continue");
			mobileAction.sleep(5000);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		} finally {
		}
	}

}
