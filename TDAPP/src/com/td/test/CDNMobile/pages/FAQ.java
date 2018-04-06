package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class FAQ extends _CommonPage {

	private static FAQ faq;

	// Elements of FAQ's PAGE from Menu

	// Elements of Select Topic Page

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	private MobileElement HamMenu;

	@iOSXCUITFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement title;

	@iOSXCUITFindBy(accessibility = "NAVIGATION_ITEM_BACK")
	@AndroidFindBy(id = "android:id/up")
	private MobileElement backButton;

	@AndroidFindBy(id = "android:id/search_edit_frame")
	private MobileElement searchEditFrame;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	@AndroidFindBy(id = "android:id/search_src_text")
	private MobileElement searchBar;

	@AndroidFindBy(id = "android:id/search_mag_icon")
	private MobileElement searchIcon;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[16]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[12]")
	private MobileElement lastTopic;

	// Elements of Apple Pay Screen

	@AndroidFindBy(id = "com.td:id/tdmoneyfit")
	private MobileElement tdMySpendSymbol;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"TD Canada\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[7]")
	private MobileElement lastQuestion;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[7]/android.widget.ImageView")
	private MobileElement lastQuestionQuestionMark;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[7]/android.widget.TextView")
	private MobileElement lastQuestionQuestionText;

	// Elements of Answer Page

	@AndroidFindBy(id = "com.td:id/faq_answer_rating_layout")
	private MobileElement RatingLayout;

	@iOSXCUITFindBy(xpath = "XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[22]")
	@AndroidFindBy(id = "com.td:id/faq_rating_fragment")
	private MobileElement RatingFragment;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please rate this answer']")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")
	private MobileElement RatingFragmentText;

	@AndroidFindBy(id = "com.td:id/faq_rating_description_textview")
	private MobileElement RatingText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='1 star' or @name='1 étoile']")
	@AndroidFindBy(id = "com.td:id/faq_ratingbar_poor")
	private MobileElement Rating1Stars;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='2 stars' or @name='2 étoiles']")
	@AndroidFindBy(id = "com.td:id/faq_ratingbar_belowaverage")
	private MobileElement Rating2Stars;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='3 stars' or @name='3 étoiles']")
	@AndroidFindBy(id = "com.td:id/faq_ratingbar_average")
	private MobileElement Rating3Stars;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='4 stars' or @name='4 étoiles']")
	@AndroidFindBy(id = "com.td:id/faq_ratingbar_aboveaverage")
	private MobileElement Rating4Stars;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='5 stars' or @name='5 étoiles']")
	@AndroidFindBy(id = "com.td:id/faq_ratingbar_excellent")
	private MobileElement Rating5Stars;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name='TD Canada']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView")
	private MobileElement AnswerWebView;

	@AndroidFindBy(id = "com.td:id/faq_answer_question")
	private MobileElement QuestionInAnswerPage;

	// Elements of FAQ's PAGE from Menu END

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	private MobileElement optionChatbot;

	public synchronized static FAQ get() {
		if (faq == null) {
			faq = new FAQ();
		}
		return faq;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);

	}

	public void clickChatbot() {
		Decorator();
		try {

			mobileAction.FuncClick(optionChatbot, "Chatbot option");

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

	public void VerirfyFAQPage() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(title, "Verifying FAQ Page Title");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(HamMenu, "Verifying Navigation Menu");
			} else {
				mobileAction.verifyElementIsDisplayed(backButton, "Verifying back Button");
				mobileAction.verifyElementIsDisplayed(searchIcon, "Verifying Search Text icon");
			}
			mobileAction.verifyElementIsDisplayed(searchBar, "Verifying Search Text box");
			mobileAction.FuncSwipeUpTillScreenBottom(lastTopic);
			mobileAction.verifyElementIsDisplayed(lastTopic, "Verifying last topic in the Table or Layout");
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

	public void VerirfyQuestionsPage() {
		Decorator();
		try {
			mobileAction.FuncSwipeUpTillScreenBottom(lastTopic);
			mobileAction.FuncClick(lastTopic, "Clicking on Last Topic");
			mobileAction.waitProgressBarVanish();
			mobileAction.verifyElementIsDisplayed(title, "Verifying Title");
			mobileAction.verifyElementIsDisplayed(backButton, "Verifying Back Button");
			mobileAction.verifyElementIsDisplayed(searchBar, "Verifying search bar");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(tdMySpendSymbol, "Verifying TD myspend symbol");
				mobileAction.verifyElementIsDisplayed(searchIcon, "Verifying icon");
			}

			mobileAction.FuncSwipeUpTillScreenBottom(lastQuestion);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				mobileAction.verifyElementIsDisplayed(lastQuestion, "Verifying last question in the Table or Layout");
			}

			else {
				mobileAction.verifyElementIsDisplayed(lastQuestion, "Verifying last question in the Table or Layout");
				mobileAction.verifyElementIsDisplayed(lastQuestionQuestionMark, "Verifying question mark symbol");
				mobileAction.verifyElementIsDisplayed(lastQuestionQuestionText, "Verifying question text");
			}

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

	public void verifyAnswerPage() {
		Decorator();
		try {
			// mobileAction.FuncSwipeUpTillScreenBottom(lastQuestion);
			mobileAction.FuncClick(lastQuestion, "Clicking on Last Question");
			mobileAction.verifyElementIsDisplayed(title, "Verifying Title");
			mobileAction.verifyElementIsDisplayed(backButton, "Verifying Back Button");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(tdMySpendSymbol, "Verifying TD myspend symbol");
				mobileAction.verifyElementIsDisplayed(QuestionInAnswerPage, "Verifying Question In Answer Page");
			}
			mobileAction.verifyElementIsDisplayed(AnswerWebView, "Verifying  Answer web Page");
			mobileAction.FuncSwipeUpTillScreenBottom(RatingFragment);
			mobileAction.FuncSwipeUpTillScreenBottom(RatingFragment);
			// mobileAction.verifyElementIsDisplayed(RatingFragment, "Verifying rating
			// Fragment");
			mobileAction.verifyElementIsDisplayed(RatingFragmentText, "Verifying  rating Fragment text");
			mobileAction.verifyElementIsDisplayed(Rating1Stars, "Verifying 1 star");
			mobileAction.verifyElementIsDisplayed(Rating2Stars, "Verifying 2 stars");
			mobileAction.verifyElementIsDisplayed(Rating3Stars, "Verifying 3 stars");
			mobileAction.verifyElementIsDisplayed(Rating4Stars, "Verifying 4 stars");
			mobileAction.verifyElementIsDisplayed(Rating5Stars, "Verifying 5 stars");
			mobileAction.FuncClick(Rating3Stars, "Clicking on 3rd Star");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementIsDisplayed(RatingText, "Verifying  rating text");
			}

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
