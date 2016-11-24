package com.td.test.CDNMobile.Page;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.*;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
import com.td.test.*;

public class MainScreen extends _CommonPage {
  



	@iOSFindBy(className="") // ipgone locator strat
	@AndroidFindBy(className="android.widget.Button")
	private  MobileElement  btnContinue;

	@iOSFindBy(id=" ")
	@AndroidFindBy(id="com.td:id/laterButton")
	private  MobileElement  btnLater;

	@iOSFindBy(id=" ")
	@AndroidFindBy(id="com.td:id/loginEditText")
	private  MobileElement  EditUser;

	@iOSFindBy(id=" ")
	@AndroidFindBy(id="com.td:id/password_input")
	private  MobileElement  Password;

	@iOSFindBy(id=" ")
	@AndroidFindBy(id="com.td:id/remember_switch")
	private  MobileElement  RememberME;

	@iOSFindBy(id=" ")
	@AndroidFindBy(id="com.td:id/loginBtnText")
	private  MobileElement  btnLogin;

	@iOSFindBy(id=" ")
	@AndroidFindBy(id="android:id/action_bar_title")
	private  MobileElement  tapHome;



	@AndroidFindBy(xpath="//android.widget.Button[@text='Accounts']")
	private  MobileElement  accountBtn;

	@iOSFindBy(id=" ")
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.tdbank:id/core_clearable_edit_text' and @index='0']")

	//@AndroidFindBy(name="123")
	private  MobileElement  password;
	private void Decorator()
	{
		PageFactory.initElements(new AppiumFieldDecorator(((AppiumDriver)CL.GetDriver()), 
				new TimeOutDuration(15,TimeUnit.SECONDS)),this) ;	

	}

	public void Splash_Conitnue() throws IOException 
	
	{
	/*	int a=10;int b=0;
		a++;
		System.out.print(a);
		++a;
		b=a;
		System.out.print(b);*/
	 
	  
	  
		CL.getTestDataInstance().Initialize(CL.getTestDataInstance().getMasterTestData());

		
		CL.getTestDataInstance().SetAppFilePath("/Users/MIIPL/Desktop/banking-wealth-debug.apk"); 
		
		System.out.println("The App Path is"+CL.getTestDataInstance().getAppFilePath());
		 
		CL.mobileApp("http://0.0.0.0:4723/wd/hub"); 

		Decorator();
	}



	/* ********* ********* ********* ********* ********* ********* ********* *********
	 * Components supporting the Java singleton pattern for the Page Object Model    
	 * ********* ********* ********* ********* ********* ********* ********* ********* */
	// Singleton object of self 
	private static  MainScreen MainScreen;

	/**
	 * <p>Getter method for singleton instance.</p>
	 * @return singleton instance of <b>this</b>
	 */
	public synchronized  static  MainScreen get() {
		if (MainScreen == null) {
			MainScreen = new MainScreen();
		}
		return MainScreen;
	}

}
