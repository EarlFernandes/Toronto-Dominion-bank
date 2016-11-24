package com.td.test.CDNMobile.Page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class CMOB_Env_Settings extends _CommonPage {

    private static CMOB_Env_Settings Env_Settings;

    String t_home="//android.widget.TextView[@resource-id='com.td:id/navText' and @text='Home']";
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
    private MobileElement menu;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='Network Settings']")
    private MobileElement network_settings;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/preference_summary_text'and @index='1']")
    private MobileElement env_set;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText'and @text='Network Settings']")
    private MobileElement env_need_to_set;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/preference_title_text'and @text='Configuration']")
    private MobileElement configuration;
    
    @AndroidFindBy(xpath = "//*[@resource-id='com.td:id/select_dialog_listview']")
    private MobileElement envList;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title'and @text='sys50_no_macm']")
    private MobileElement envToSetup;
    

    String env_need_set = getTestdata("Env", "UserIDs");

    String cnfgrn = "//android.widget.TextView[@resource-id='com.td:id/title'and @text='" + env_need_set + "']";

    String network = "Network Settings";
    
    
    public synchronized static CMOB_Env_Settings get() {
        if (Env_Settings == null) {
            Env_Settings = new CMOB_Env_Settings();
        }
        return Env_Settings;
    }

    private void Decorator() {
        PageFactory.initElements(
                new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
                this);
        System.out.println("Decorator method has been finished");

    }

    public void set_environment() {
        System.out.println("Trial for Page factory class");
        Decorator();
        System.out.println(env_need_set);
        System.out.println("in env settings");
        try {
            mobileAction.FuncClick(menu,"Menu");
            mobileAction.FuncScrollToText(network);
            mobileAction.FuncClick(network_settings,"Network Settings");
            String env_exist = mobileAction.getText(env_set);
            if (env_exist.equalsIgnoreCase(env_need_set)) {
                System.out.println("Environment is set as required");
            } else {
                mobileAction.FuncClick(configuration,"Configuration");
                mobileAction.FuncElementSwipeWhileNotFound(envList, cnfgrn, 5, "down", true);
            }
            mobileAction.FuncClickBackButton();
        } catch (NoSuchElementException e) {
        
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
