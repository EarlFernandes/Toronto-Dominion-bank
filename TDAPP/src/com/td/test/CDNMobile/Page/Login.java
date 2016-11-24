package com.td.test.CDNMobile.Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.tsp.GenTimeAccuracy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Login extends _CommonPage {

	private static Login Login;
	
	
	@iOSFindBy(xpath="//*[value='Password']") 
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id= 'com.td:id/password_input' and @index='1']")
    private MobileElement password;



    @iOSFindBy(xpath="//*[value='Password']") 
    @AndroidFindBy(xpath = "//android.widget.ProgressBar[@resource-id= 'android:id/progress' and @index='0']")
    private MobileElement progress_button;

	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='com.tdbank:id/login_remember_me_switch' and @index='0']")
	private MobileElement rememberMe;

	@iOSFindBy(xpath="//*[value='Username or Access Card']") 
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/loginEditText' and @index='1']")
    private MobileElement username;

	@iOSFindBy(xpath="//*[label='Login']") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id= 'com.td:id/loginBtnText' and @index='0']")
    private MobileElement login;
    
	private String progressBar = "//android.widget.TextView[@resource-id='com.tdbank:id/loading_indicator_textview'and @text='Please wait']";

	
	


	public synchronized static Login get() {
		if (Login == null) {
			Login = new Login();
		}
		return Login;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
		System.out.println("Decorator method has been finished");

	}

	public void login() {
	  System.out.println("Trial for Page factory class");
	  Decorator();
	  try {
	  mobileAction.FuncClick(username,"USERNAME");
	  String userid=getTestdata("UserID", "UserIDs");
	  mobileAction.FuncSendKeys(username, userid);
	  System.out.println("username entered");
	  mobileAction.FuncClick(password,"PASSWORD");
	  mobileAction.FuncSendKeys(password, CL.getTestDataInstance().UserPassword);
	  System.out.println("password entered");
	
	  
	  mobileAction.FuncHideKeyboard();
	  System.out.println("keyboard hidden");
	  mobileAction.FuncClick(login,"LOGIN");
	 
	  mobileAction.waitForElementToVanish(progress_button);
	  System.out.println("Login has been completed");
	  
	  } catch (NoSuchElementException e) {
	  // TODO Auto-generated catch bloc
	  e.printStackTrace();
	  } catch (InterruptedException e) {
	  // TODO Auto-generated catch block
	  e.printStackTrace();
	  } catch (IOException e) {
	  // TODO Auto-generated catch block
	  e.printStackTrace();
	  }
}
	/**
    * Function to login 'N' times
    *
    * @return nothing
    */
	public void loginNTimes() {
     boolean flag=true;
     String[] users=null;
     String[] passwords=null;
     int i=0,counter=0;
        if (flag) {
           String  connectID = getTestdata("ConnectID", "UserIDs");
            String password = getTestdata("Password", "UserIDs");
            if ((connectID.contains(","))) {
            String []   userid = connectID.split(",");
              String []  pwd = password.split(",");
                userid = connectID.split(",");
                users=userid;
                passwords=pwd;
                for (; counter < userid.length; counter++) ;
                flag = false;
            }
        }
        if (i <= counter) {
        	try{
           mobileAction.FuncClick(username,"USERNAME");
         
           mobileAction.FuncSendKeys(username,users[i]);
           mobileAction.FuncClick(password,"PASSWORD");
           mobileAction.FuncSendKeys(password,passwords[i]);
          // mobileAction.FuncClick(rememberMe,"Remember Me");
           mobileAction.FuncHideKeyboard();
           mobileAction.FuncClick(login,"LOGIN");
           mobileAction.waitForElementToVanish(progress_button);
     	   System.out.println("Login has been completed");
     	   logout();
        	}catch(Exception e){
        		e.printStackTrace();
        	}
           
           
 
        }
        if(i==15){
        	System.out.println("The Login and Logout has done for 15 time:"+i);
        }
    }
	

        
    }
	

