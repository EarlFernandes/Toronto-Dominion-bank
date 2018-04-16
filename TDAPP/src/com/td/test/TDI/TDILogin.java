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
import com.td.test.framework.MobileAction;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TDILogin extends _CommonPage {

	private static TDILogin TDILogin;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[contains(@label,'Username')]")
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='username101']")
	private MobileElement username;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Password']//following::XCUIElementTypeSecureTextField")
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='password']")
	private MobileElement password;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label='Login']")
	@AndroidFindBy(xpath="//android.widget.Button[contains(@text,'Login')]")
	private MobileElement loginBtn;
	
	@iOSXCUITFindBy(xpath = "//*[contains(@label,'select the Forgot your Username or Password? link below to reset')]")
	//TODO@AndroidFindBy(xpath="")
	private MobileElement error;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='My Policies']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='My Policies']")
	private MobileElement loggedhead;
	
	//TODO@iOSXCUITFindBy(xpath = "")
	//TODO@AndroidFindBy(xpath = "")
	private MobileElement sysErr;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@label='Logout']")
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.td.insurance:id/lblListHeader' and @text='Logout']")
	private MobileElement logout;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='Logged Out']")
	//TODO@AndroidFindBy(xpath="//android.widget.TextView[@text='']")
	private MobileElement loggedOut;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@label='Maintenance Operations']")
	//TODO@AndroidFindBy(xpath="//android.widget.TextView[@text='']")
	private MobileElement maintenanceErr;
	
	
	public synchronized static TDILogin get() {
		if (TDILogin == null) {
			TDILogin = new TDILogin();
		}
		return TDILogin;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(6, TimeUnit.SECONDS)), this);
	}
	/**
	 * This method will click send the user name and password and click on login button, 
	 * also verifies the loginError.
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
	public void login() {
		Decorator();
		try {
			//TODO::Access Card to be handled
			mobileAction.FuncClick(username, "Username");
			mobileAction.FuncSendKeys(username, getTestdata("UserID"));
			mobileAction.FuncClick(password, "Password");
			mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
			mobileAction.FuncClick(loginBtn, "Login");
			mobileAction.waitTDIProgressBarVanish();
			mobileAction.FuncHideKeyboard();
			loginFail();
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
	 * This method will click the menu and click on the logout button in the menu.
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
	public void logout() {
		Decorator();
		try {
			TDIHomescreen.get().clickMenu();
			if(mobileAction.verifyElementIsPresent(logout)){
				mobileAction.FuncClick(logout, "Logout");
			}else
			{
				mobileAction.FuncSwipeWhileElementNotFound(logout, true, 1, "down");
			}mobileAction.waitTDIProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(loggedOut, "logged out successfully");
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
	 * This method will check the error type and re-enter the password if it's system error and 
	 * click login button.
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
	private void loginFail(){
		Decorator();
		try {
			if(ErrorType()){
				mobileAction.FuncSendKeys(password, getTestdata("Password"));
				mobileAction.FuncClick(loginBtn, "Login");
			}else{
				mobileAction.verifyElementIsDisplayed(loggedhead,"My Policies");
				System.out.println("Logged in successfully");
		//dummy - to select between accounts
				
				if(CL.GetAppiumDriver().getPlatformName().equalsIgnoreCase("ios")){
				MobileElement acNo = (MobileElement) (CL.GetAppiumDriver())
						.findElement(By.xpath("(//XCUIElementTypeStaticText[contains(@value,'choose the account')]"
								                                       + "//following::XCUIElementTypeOther)[1]"));
				String AccountNo = acNo.getAttribute("name");
				System.out.println(AccountNo);
				String acn = AccountNo.substring(8, AccountNo.length()-1);
				MobileElement actoclick = (MobileElement) (CL.GetAppiumDriver())
						.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@value,'"+acn+"')]"));
				mobileAction.FuncClick(actoclick, "acc clicked");
				}else
					{
					MobileElement actoclick = (MobileElement) (CL.GetAppiumDriver())
							.findElement(By.xpath("(//android.view.View/following::android.view.View[contains(@text,'2481844')])[2]"));
					mobileAction.FuncClick(actoclick, "acc clicked");
				}
				Thread.sleep(2000);
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
	 * This method will validate the error type.
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
	private boolean ErrorType(){
		Decorator();
		MobileElement wrgCrederror = null;
		boolean value=false;
		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")){
				wrgCrederror = mobileAction.mobileElementUsingXPath("//*[contains(@label,'"
													+getTextInCurrentLocale(StringArray.LOGIN_ERROR_MSG)+"')]");
			}else{
				wrgCrederror = mobileAction.mobileElementUsingXPath("//android.view.View[@resource-id='errorMsg']");
			}
		if(mobileAction.verifyElementIsPresent(sysErr)){ // system error
			System.out.println("System Exception occured");
			value= true;
			
		}
		else if(mobileAction.verifyElementIsPresent(wrgCrederror)){ //error due to wrong credentials
			CL.GetReporting().FuncReport("Fail", "Wrong Credentials");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			value=false;
		}
	}
	 catch (Exception e) {
		try {
			CL.GetReporting().FuncReport("Fail",
					"NoSuchElementException from Method " + this.getClass().toString());
		} catch (IOException e1) {
			System.err.println("Failed to write in report.");
		}
		CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
	}
		return value;
	
	}
}

