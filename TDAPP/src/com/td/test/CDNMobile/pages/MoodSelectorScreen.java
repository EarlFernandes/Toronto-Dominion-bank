package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.EnglishStrings;
import com.td.FrenchStrings;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MoodSelectorScreen extends _CommonPage {

	private static MoodSelectorScreen MoodSelector;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title']")
	private MobileElement feedback_title;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progrees_bar;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/nav_row_profile_title']")
	private MobileElement great_link;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/nav_row_profile_title']")
	private MobileElement couldvebeenbetter_link;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/nav_row_profile_title' and (@text='Elle ne fonctionnait pas' or @text=\"It wasn't working\")]")
	private MobileElement itwasntworking_link;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_primary']")
	private MobileElement send_feedback_now;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/header' or @resource-id='com.td:id/title']")
	private MobileElement post_survey;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/header' or @resource-id='com.td:id/title']")
	private MobileElement post_survey_great;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/google_play_btn']")
	private MobileElement rate_us_on_google_Or_App_Store;

	// @iOSFindBy(xpath = "//*[@label='Go Back Home' or @label='Avis']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.android.vending:id/question_text' or @resource-id='com.android.vending:id/user_display_name']")
	private MobileElement google_play_rate_text;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/go_home_btn']")
	private MobileElement go_back_home_btn;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button']")
	private MobileElement quick_link_go_back_home_btn;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button']")
	private MobileElement quick_link_view_my_accounts_btn;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/header']")
	private MobileElement error_screen_header;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement error_screen_description;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/checkbox_form_container']")
	private MobileElement check_box_container;

	/*******************************************************/
	@iOSFindBy(accessibility = "NAVIGATION_ITEM_MENU")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up'and @index='0']")
	private MobileElement menu;

	@iOSFindBy(xpath = "//*[@label='" + EnglishStrings.FLYOUT_MENU_GIVE_FEEDBACK + "' or @label ='"
			+ FrenchStrings.FLYOUT_MENU_GIVE_FEEDBACK + "']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/navText' and (@text='"
			+ EnglishStrings.FLYOUT_MENU_GIVE_FEEDBACK + "' or @text='" + FrenchStrings.FLYOUT_MENU_GIVE_FEEDBACK
			+ "')]")
	private MobileElement give_feedback;

	// and (@text='Rate this app' or @text='Notez cette application')
	public synchronized static MoodSelectorScreen get() {
		if (MoodSelector == null) {
			MoodSelector = new MoodSelectorScreen();
		}
		return MoodSelector;
	}

	private void Decorator() {

		// System.out.println("Print Map table");
		// System.out.println(((AppiumDriver)
		// CL.GetDriver()).getAppStringMap().toString());
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	public void VerifyMoodSelectorScreen() {
		Decorator();
		// try{
		// if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
		// String xpath = "//android.widget.TextView[@text='" +
		// mobileAction.getAppString("feedback_default_title") + "']";
		// System.out.println("xpath:" + xpath);
		// feedback_title = mobileAction.verifyElementUsingXPath(xpath,
		// "Feedback Title");
		// }else{
		// String xpath = "//*[@label='" +
		// mobileAction.getAppString("nav_drawer_items_feedback") + "']";
		// System.out.println("xpath:" + xpath);
		// feedback_title = mobileAction.verifyElementUsingXPath(xpath,
		// "Feedback Title");
		// }
		// }catch (NoSuchElementException | IOException e) {
		// try {
		// mobileAction.GetReporting().FuncReport("Fail", "No such element was
		// found on screen: " + e.getMessage());
		// } catch (IOException ex) {
		// System.out.print("IOException from Method " +
		// this.getClass().toString() + " " + e.getCause());
		// }
		// System.err.println("TestCase has failed.");
		// CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		// return;
		// }

		try {
			Thread.sleep(2000);
			String title = mobileAction.getValue(feedback_title);
			System.out.println("Mood Selector title:" + title);
			mobileAction.verifyElementTextIsDisplayed(feedback_title,
					"How was your TD app experience today? | Comment était votre expérience avec l’appli TD aujourd’hui?");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyEmotionsAnimateFromTopToBottom() {
		Decorator();
		List<MobileElement> moodList = null;
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				moodList = ((AppiumDriver) CL.GetDriver()).findElements(
						By.xpath("//android.widget.TextView[@resource-id='com.td:id/nav_row_profile_title']"));
			} else {
				String xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText";
				moodList = ((AppiumDriver) CL.GetDriver()).findElements(By.xpath(xpath));
			}
		} catch (Exception e) {

		}

		String moodSequence = "";
		int size = moodList.size();
		for (int i = 0; i < size; i++) {
			String idText = moodList.get(i).getText();

			moodSequence = moodSequence + idText;
			if (i < size - 1) {
				moodSequence = moodSequence + "/";
			}
		}
		System.out.println("Mood Text:" + moodSequence);
		if (moodSequence.contains("Great/Could've been better/It wasn't working")
				|| moodSequence.contains("Excellente!/Ça aurait pu être mieux/Elle ne fonctionnait pas")) {
			mobileAction.Report_Pass_Verified(moodSequence);
		} else {
			mobileAction.Report_Fail_Not_Verified(moodSequence);
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void ClickGreatLink() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String xpath = "//android.widget.TextView[@resource-id='com.td:id/nav_row_profile_title' and @text='"
						+ mobileAction.getAppString("feedback_mood_great") + "']";
				System.out.println("xpath:" + xpath);
				great_link = mobileAction.verifyElementUsingXPath(xpath, "Great Link");
			} else {
				// For IOS, keep the great_link as defined
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		try {
			String elementText = mobileAction.getValue(great_link);
			System.out.println("ElementText:" + elementText);
			mobileAction.FuncClick(great_link, elementText);

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void VerifyPostSurveyScreen() {
		// try{
		// if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
		// // for android, just use default post_survey element
		// }else{
		//
		// }
		// }catch (NoSuchElementException | IOException e) {
		// try {
		// mobileAction.GetReporting().FuncReport("Fail", "No such element was
		// found on screen: " + e.getMessage());
		// } catch (IOException ex) {
		// System.out.print("IOException from Method " +
		// this.getClass().toString() + " " + e.getCause());
		// }
		// System.err.println("TestCase has failed.");
		// CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		// return;
		// }

		try {
			String elementText = mobileAction.getValue(post_survey);
			System.out.println("ElementText:" + elementText);

			String expectedPostSurvey = CL.getTestDataInstance().TCParameters.get("PostSurveyText");
			System.out.println("Expected survey text:" + expectedPostSurvey);
			mobileAction.verifyElementTextIsDisplayed(post_survey, expectedPostSurvey);

		} catch (Exception e) {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("iOS")) {
				try {
					String elementText = mobileAction.getValue(post_survey_great);
					System.out.println("ElementText:" + elementText);

					String expectedPostSurvey = CL.getTestDataInstance().TCParameters.get("PostSurveyText");
					System.out.println("Expected survey text:" + expectedPostSurvey);
					mobileAction.verifyElementTextIsDisplayed(post_survey_great, expectedPostSurvey);
				} catch (Exception e1) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
					return;
				}
			} else {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
		}
	}

	public void ClickCouldvebeenBetterLink() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String xpath = "//android.widget.TextView[@resource-id='com.td:id/nav_row_profile_title' and @text=\""
						+ mobileAction.getAppString("negative_feedback_action_bar") + "\"]";
				xpath = xpath.replaceAll("’", "'");
				System.out.println("xpath:" + xpath);
				couldvebeenbetter_link = mobileAction.verifyElementUsingXPath(xpath, "Could've been better Link");
			} else {
				// String xpath = "//*[@label='" +
				// mobileAction.getAppString("nav_drawer_items_feedback") +
				// "']";
				// System.out.println("xpath:" + xpath);
				// couldvebeenbetter_link =
				// mobileAction.verifyElementUsingXPath(xpath, "Great Link");
				// For IOS, keep the couldvebeenbetter_link as defined
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		try {
			String elementText = mobileAction.getValue(couldvebeenbetter_link);
			System.out.println("ElementText:" + elementText);
			mobileAction.FuncClick(couldvebeenbetter_link, elementText);

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void ClickItwasntWorkingLink() {
		Decorator();
		// try{
		// if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
		// String xpath =
		// "//android.widget.TextView[@resource-id='com.td:id/nav_row_profile_title'
		// and @text='" +
		// mobileAction.getAppString("somethings_broken_action_bar") + "']";
		// System.out.println("xpath:" + xpath);
		// itwasntworking_link = mobileAction.verifyElementUsingXPath(xpath,
		// "Somethings broken Link");
		// }else{
		//// String xpath = "//*[@label='" +
		// mobileAction.getAppString("nav_drawer_items_feedback") + "']";
		//// System.out.println("xpath:" + xpath);
		//// itwasntworking_link = mobileAction.verifyElementUsingXPath(xpath,
		// "Somethings broken Link");
		// }
		// }catch (NoSuchElementException | IOException e) {
		// try {
		// mobileAction.GetReporting().FuncReport("Fail", "No such element was
		// found on screen: " + e.getMessage());
		// } catch (IOException ex) {
		// System.out.print("IOException from Method " +
		// this.getClass().toString() + " " + e.getCause());
		// }
		// System.err.println("TestCase has failed.");
		// CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		// return;
		// }

		try {
			Thread.sleep(5000);
			String elementText = mobileAction.getValue(itwasntworking_link);
			System.out.println("ElementText:" + elementText);
			mobileAction.FuncClick(itwasntworking_link, elementText);

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

	}

	public void ClickBackFromMoodSelector() {
		Decorator();

		String back_xpath = "";

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			try {
				mobileAction.FuncClickBackButton();
				return;
			} catch (Exception e) {
				back_xpath = "//android.widget.ImageView[@resource-id='android:id/up']";
			}

		} else {
			back_xpath = "//*[@label='Back' or @label='Retour']";
		}
		try {
			MobileElement back_arrow = (MobileElement) CL.GetDriver().findElement(By.xpath(back_xpath));
			mobileAction.FuncClick(back_arrow, "<");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void ClickBackFromAppOrGooglePage() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncClickBackButton();
			} else {
				// for IOS do nothing...

			}
			return;
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void ClickBackFromPostSurvey() {
		Decorator();
		try {

			String goBackHome = mobileAction.getValue(go_back_home_btn);
			mobileAction.FuncClick(go_back_home_btn, goBackHome);
		} catch (Exception e) {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					mobileAction.FuncClickBackButton();
				} catch (Exception e1) {
					System.err.println("TestCase has failed.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
			} else {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
		}
	}

	public void ClickSendFeedbackNow() {
		Decorator();
		try {
			List<MobileElement> checkboxList = null;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// checkboxList =
				// check_box_container.findElements(By.xpath("//android.widget.CheckBox"));
				checkboxList = (CL.GetAppiumDriver()).findElements(By.xpath(
						"//android.widget.LinearLayout[@resource-id='com.td:id/checkbox_form_container']//android.widget.CheckBox"));
				for (int i = 0; i < checkboxList.size(); i++) {
					mobileAction.FuncClick(checkboxList.get(i), "Check box " + (i + 1));
				}
			} else {
				for (int i = 1; i <= 3; i++) {
					MobileElement checkbox = check_box_container
							.findElement(By.xpath("//XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText"));
					mobileAction.FuncClick(checkbox, "Check box " + (i + 1));
				}

			}
			String elementText = mobileAction.getValue(send_feedback_now);
			System.out.println("ElementText:" + elementText);
			mobileAction.FuncClick(send_feedback_now, elementText);

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

	}

	public void VerifyRateUsOnGooglePlayButton() {
		Decorator();

		try {
			String elementText = mobileAction.getValue(rate_us_on_google_Or_App_Store);
			System.out.println("ElementText:" + elementText);
			mobileAction.verifyElementIsDisplayed(rate_us_on_google_Or_App_Store, elementText);

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void VerifyGooglePlayRatePage() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// For Android
				try {
					if (post_survey_great.isDisplayed()) {
						mobileAction.Report_Fail("Not going to Google Store ");
					} else {
						mobileAction.Report_Pass_Verified("Going to Google Store");
					}
				} catch (Exception e) {
					mobileAction.Report_Pass_Verified("Going to Google Store");
				}

			} else {
				// For IOS,
				try {
					if (post_survey_great.isDisplayed()) {
						mobileAction.Report_Fail("Not going to App Store ");
					} else {
						mobileAction.Report_Pass_Verified("Going to App Store");
					}
				} catch (Exception e) {
					mobileAction.Report_Pass_Verified("Going to App Store");
				}
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void Verify_quick_link_go_back_home() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String xpath = "//android.widget.Button[@text='"
						+ mobileAction.getAppString("feedback_quick_link_go_home") + "']";
				System.out.println("xpath:" + xpath);
				quick_link_go_back_home_btn = mobileAction.verifyElementUsingXPath(xpath, "Go BACK HOME");
			} else {
				// String xpath = "//*[@label='" +
				// mobileAction.getAppString("btn_go_back_home") + "']";
				// System.out.println("xpath:" + xpath);
				// quick_link_go_back_home_btn =
				// mobileAction.verifyElementUsingXPath(xpath, "Go BACK HOME");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		try {
			mobileAction.verifyElementTextIsDisplayed(quick_link_go_back_home_btn, "GO BACK HOME | RETOUR À L'ACCUEIL");
		} catch (Exception e) {
			System.err.println("TestCase has failed while clicking 'Go BACK HOME'");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void Verify_quick_link_view_myaccounts() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String xpath = "//android.widget.Button[@text='"
						+ mobileAction.getAppString("feedback_quick_link_my_accounts") + "']";
				System.out.println("xpath:" + xpath);
				quick_link_view_my_accounts_btn = mobileAction.verifyElementUsingXPath(xpath, "VIEW MYACCOUNTS");
			} else {
				// String xpath = "//*[@label='" +
				// mobileAction.getAppString("btn_go_back_home") + "']";
				// System.out.println("xpath:" + xpath);
				// quick_link_view_my_accounts_btn =
				// mobileAction.verifyElementUsingXPath(xpath, "VIEW
				// MYACCOUNTS");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		try {
			mobileAction.verifyElementTextIsDisplayed(quick_link_view_my_accounts_btn,
					"VIEW MY ACCOUNTS | CONSULTER MES COMPTES");
		} catch (Exception e) {
			System.err.println("TestCase has failed while clicking 'VIEW MY ACCOUNT'");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void Verify_error_screen() {
		Decorator();
		try {
			String error_header = "Hmmm, something's not working right now. | Hum, quelque chose ne fonctionne pas pour l’instant.";
			mobileAction.verifyElementTextIsDisplayed(error_screen_header, error_header);
		} catch (Exception e) {
			System.err.println("TestCase has failed while verifying error header");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		try {
			String error_header = "Please try again the next time you visit the TD app. | Veuillez essayer de nouveau la prochaine fois que vous utiliserez l’appli TD.";
			mobileAction.verifyElementTextIsDisplayed(error_screen_description, error_header);
		} catch (Exception e) {
			System.err.println("TestCase has failed while verifying error description");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void VerifyFeedBackNTimes() {
		Decorator();
		int count = 200;
		int failedCount = 0;
		for (int i = 0; i < count; i++) {
			try {
				String title = mobileAction.getValue(feedback_title);
				// System.out.println("Mood Selector title:" + title);
				if (!title.equalsIgnoreCase("How was your TD app experience today?")) {
					failedCount++;
					System.out.println("Failed times:" + failedCount);
					mobileAction.Report_Pass_Verified("Error message found");
				}
			} catch (Exception e) {
				failedCount++;
				System.out.println("Failed times:" + failedCount);
				mobileAction.Report_Pass_Verified("Error message found");
			}
			ClickBackFromMoodSelector();

			try {
				Decorator();
				// mobileAction.FuncClick(menu, "menu");
				menu.click();
			} catch (Exception e) {
				System.out.println("failed to click menu");
				break;
			}

			try {
				// mobileAction.FuncClick(give_feedback, "feed back");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					mobileAction.SwipeWithinElement("//android.support.v4.widget.DrawerLayout", 1, "down");
				}
				Decorator();
				give_feedback.click();
			} catch (Exception e) {
				System.out.println("failed to click menu");
				break;
			}

		}
		System.out.println("Total Failed times:" + failedCount + "/" + count);
	}

}
