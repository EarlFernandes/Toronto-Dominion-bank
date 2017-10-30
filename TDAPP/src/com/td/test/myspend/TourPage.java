package com.td.test.myspend;

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

public class TourPage extends _CommonPage {

	private static TourPage TourPage;

	public synchronized static TourPage get() {
		if (TourPage == null) {
			TourPage = new TourPage();
		}
		return TourPage;
	}

	String platform = null;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Connect using your TD bank app') or contains(@content-desc,'Connect')]")
	private MobileElement connectBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Continue' or @label='Continuer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/skittles_feature_button']")
	private MobileElement continueBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Get Started' or @label='Commencer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/skittles_feature_button']")
	private MobileElement getStartedBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Accept' or @label='Acceptez']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/acceptButton']")
	private MobileElement acceptBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeActivityIndicator[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progresssBar;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Open TD MySpend' or @label='Acceptez']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/button']")
	private MobileElement openTDMySpend;

	@AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Loading your accounts') or contains(@content-desc,'Analyzing your transactions')]")
	private MobileElement loadingAccounts;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@label,'TD MySpend is ready to go') or contains(@label,'Dépense TD peut maintenant être utilisée')]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'TD MySpend is ready to go')]")
	private MobileElement MySpendReadyToGo;

	@iOSXCUITFindBy(xpath = "//*[contains(@label,'See the TD MySpend') or contains(@label,'Pour en savoir plus')]")
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='fxMsgHeader']")
	private MobileElement fxMsgHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='OK']")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'OK')]")
	private MobileElement okBtn;
	
	@iOSXCUITFindBy(iOSClassChain = "**/*[`name=='Save' or name=='Enregistrer'`]")
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,'Save') or contains(@content-desc,'Enregistrer')]")
	private MobileElement saveBtn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Allow' or @label='Autoriser']")
	private MobileElement allowBtn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Like to Send You Notifications') or contains(@label,'à vous envoyer des notifications')]")
	private MobileElement sendNotification;
	
	@iOSXCUITFindBy(xpath = "//*[contains(@label,'Username or Access Card') or contains(@value,'Username or Access Card') or contains(@label,'Access Card or Username') or @name='LOGIN_USERNAME']")
	private MobileElement username;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name='Password']")
	private MobileElement password;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Login']")
	private MobileElement login;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	private MobileElement select_accesscard;
	
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name='Add Username or Access Card']")
	private MobileElement addUser;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	/**
	 * This method will click on the 'Connect using your TD Bank app' button.
	 * 
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void clickConnectTDApp() {

		Decorator();

		try {
			mobileAction.FuncClick(connectBtn, "Connect button");

		}   catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}


	}

	/**
	 * This method will go through the registration flow
	 * 
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void registrationFlow() {

		Decorator();

		try {
			if(mobileAction.verifyElementIsPresent(continueBtn)){
				mobileAction.FuncClick(continueBtn, "Continue");
				mobileAction.FuncClick(continueBtn, "Continue");
				mobileAction.FuncClick(getStartedBtn, "Get Started");
				mobileAction.waitForElementToVanish(progresssBar);
				mobileAction.FuncClick(acceptBtn, "Accept");
				mobileAction.waitForElementToVanish(progresssBar);
				mobileAction.FuncClick(openTDMySpend, "Open TD My Spend");
			}
			mobileAction.FunctionSwipe("Left", 200, 200);
			mobileAction.FunctionSwipe("Left", 200, 200);
			mobileAction.FunctionSwipe("Left", 200, 200);
			mobileAction.FunctionSwipe("Left", 200, 200);
			if (mobileAction.verifyElementIsPresent(MySpendReadyToGo)) {
				mobileAction.FuncClick(MySpendReadyToGo, "TD My Spend is ready to go");
			}
			if (mobileAction.verifyElementIsPresent(fxMsgHeader)) {
				mobileAction.FuncClick(okBtn, "OK");
			}
			if(mobileAction.verifyElementIsPresent(saveBtn)){
				mobileAction.FuncClick(saveBtn, "Save");
			}
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				if(mobileAction.verifyElementIsPresent(sendNotification)){
					mobileAction.FuncClick(allowBtn, "Allow");
			}
				}

		}  catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}
	
	/**
	 * This method will login into mySpend 
	 * 
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 */
	public void mySpendLogin() {

		Decorator();

		try {
			
			if(mobileAction.verifyElementIsPresent(select_accesscard)){
				mobileAction.FuncClick(select_accesscard, "Select Accesscard");
				mobileAction.FuncClick(addUser, "AddUser");
			}
			mobileAction.FuncSendKeys(username, CL.getTestDataInstance().Userid);
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
			mobileAction.FuncClick(login, "Login");

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}


}
