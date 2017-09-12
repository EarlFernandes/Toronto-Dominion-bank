package com.td.test.CDNMobile.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td._CommonPage;

public class GoogleVoiceWebPage extends _CommonPage{
	final String TD_BANK_VERIFICATION_CODE_EN = "is your TD security code";
	final String TD_BANK_VERIFICATION_CODE_NON_EN = "Votre code de s?curit? TD pour test de votre num?ro de t?l?phone de s?curit? est le";
	
	@FindBy(xpath = "//a[@class='signUpLink' and contains(text(),'Sign In')]")	
	private WebElement signInButton;
	
	@FindBy(xpath = "//input[@name='identifier' and @id='identifierId']")	
	private WebElement loginEmailField;
	
	@FindBy(xpath = "//div[@id='identifierNext']")	
	private WebElement loginNextButton;
	
	@FindBy(xpath = "//input[@name='password']")	
	private WebElement loginPasswordField;
	
	@FindBy(xpath = "//div[@id='passwordNext']")	
	private WebElement passwordNextButton;
	
	@FindBy(xpath = "//gv-nav-button[@icon='message']")	
	private WebElement gv_nav_messages;
	
	@FindBy(xpath = "//gv-conversation-list")	
	private WebElement gv_conversation_list;
	
	@FindBy(xpath = "((//gv-thread-item)[1]//gv-annotation)[1]")	
	private WebElement gv_first_phone_number;
	
	@FindBy(xpath = "((//gv-thread-item)[1]//gv-annotation)[2]")	
	private WebElement gv_first_message;

	private WebDriver driver; 
	
	private void Decorator() {
		PageFactory.initElements(driver, this);
	}
	
	public GoogleVoiceWebPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickSignIn(){
		Decorator();

		signInButton.click();
	}
	
	public void login(String email, String password){
		Decorator();

		try {
			this.waitForElementVisible(loginEmailField);
			loginEmailField.sendKeys(email);
			loginNextButton.click();

			this.waitForElementVisible(loginPasswordField);
			loginPasswordField.sendKeys(password);
			passwordNextButton.click();
			mobileAction.GetReporting().FuncReport("Pass", "Logged into Google Voice successfully");

		}catch(Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}		
		}
	}
	
	public String getFirstMessage(){
		String passcode = null;
		
		try {
			this.waitForElementVisible(this.gv_conversation_list);
			this.waitForElementVisible(this.gv_first_message);
			
			//currentLocale = "en";
			if(currentLocale.equals("fr")) {
				int index = this.TD_BANK_VERIFICATION_CODE_NON_EN.length();
				passcode = this.gv_first_message.getText().substring(index).trim();
				
			}else {
				int index = this.gv_first_message.getText().indexOf(TD_BANK_VERIFICATION_CODE_EN);
				passcode = this.gv_first_message.getText().substring(0, index).trim();
			}
		
			mobileAction.GetReporting().FuncReport("Pass", "Retrieved passcode from Google Voice successfully");

		}catch(Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Cannot retrieve passcode from Google Voice: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}		
		}

		return passcode;
	}
	
	public void waitForElementVisible(WebElement element){
				
		try{
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}catch(Exception e){
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}		
		}
		
	}
}
