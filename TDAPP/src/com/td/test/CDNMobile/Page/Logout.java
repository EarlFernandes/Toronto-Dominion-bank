package com.td.test.CDNMobile.Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;


	public class Logout extends _CommonPage {

		private static Logout Logout;
		
		
		@iOSFindBy(xpath="//*[value='Password']") 
		@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id= 'android:id/up' and @index='0']")
	    private MobileElement homeButton;



	    @iOSFindBy(xpath="//*[value='Password']") 
	    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/navText' and @text='Logout']")
	    private MobileElement logout_button;

		


		public synchronized static Logout get() {
			if (Logout == null) {
				Logout = new Logout();
			}
			return Logout;
		}

		private void Decorator() {
			PageFactory.initElements(
					new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
					this);
			System.out.println("Decorator method has been finished");

		}
		
		public void logout(){
			Decorator();
			
			try {
				mobileAction.FuncClick(homeButton, "HomeButton");
				mobileAction.FuncClick(logout_button, "Logout");
				
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
