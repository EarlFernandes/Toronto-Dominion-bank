package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
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

public class Profile extends _CommonPage {

	private static Profile Profile;

	String profileStr = "Profile | Profil";
	String contactInfo = "CONTACT INFORMATION | COORDONNÉES";
	String profileScrollView = "//android.widget.ScrollView[@resource-id='com.td:id/scrollView']";
	String emailReg = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}";
	String androidphoneReg = "\\(\\•{3}\\)\\•{3}-\\d{4}";
	String iosphoneReg = "\\(\\•{3}\\) \\•{3} - \\d{4}";
	String extReg = "\\d+";
	String emailPlaceHolder = "example@address.com | exemple@adresse.com";
	String phonePlaceHolder = "Enter number | Entrer le numéro";
	String extPlaceHolder = "Enter extension | Entrer n° de poste";
	int MAX_EMAIL_LENGTH = 60;
	int MAX_NAME_LENGTH = 40;
	String ori_email = "";
	String ori_phone = "";
	boolean isPersonalUser = false;
	boolean isBusinessUser = false;

	@iOSFindBy(xpath = "//*[@label='Profile' or @label='Profil']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (@text='Profile' or @text='Profil')]")
	private MobileElement profile_Header;

	@iOSFindBy(xpath = "//*[@label='In progress']")
	// @AndroidFindBy(xpath =
	// "//android.widget.TextView[@resource-id='android:id/message' and
	// @text='Loading']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private MobileElement progressBar;

	@iOSFindBy(xpath = "//*[@label='CONTACT INFORMATION' or @label='COORDONNÉES']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title_text' and (@text='CONTACT INFORMATION' or @text='COORDONNÉES')]")
	private MobileElement profile_contact_info_header;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Home Phone']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Home Phone' or @text='No de tél. (domicile)')]")
	private MobileElement home_phone_label;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Home Phone' or @label='N° de tél. (domicile)']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/home_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement home_phone_info;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Work Phone']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Work Phone' or @text='No de tél. (travail)')]")
	private MobileElement work_phone_label;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Work Phone' or @label='No de tél. (travail)]/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/work_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement work_phone_info;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mobile Phone']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Mobile Phone' or @text='No de tél. (cell.)')]")
	private MobileElement mobile_phone_label;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mobile Phone' or @label='N° de tél. (cell.)']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/mobile_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement mobile_phone_info;

	@iOSFindBy(xpath = "//*[@label='Business Phone']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Business Phone' or @text='No de tél. (entreprise)']")
	private MobileElement business_phone_label;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Business Phone' or @label='N° de tél. (entreprise)']/../XCUIElementTypeTextField[1]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/business_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement business_phone_info;

	@iOSFindBy(xpath = "//*[@label='Fax' or @label='Télécopieur']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Fax' or @text='Télécopieur')]")
	private MobileElement fax_label;

	@iOSFindBy(xpath = "//*[@label='Fax' or @label='Télécopieur']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/fax_number']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement fax_info;

	@iOSFindBy(xpath = "//*[@label='Ext. (optional)' or @label='Poste (facultatif)']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Ext. (optional)' or @text='Poste (facultatif)')]")
	private MobileElement extention_label;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Ext. (optional)' or @label='Poste (facultatif)']/../XCUIElementTypeTextField[2]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/business_extension']//android.widget.EditText[@resource-id='com.td:id/extension']")
	private MobileElement business_extension_info;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Ext. (optional)' or @label='Poste (facultatif)']/../XCUIElementTypeTextField[2]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/work_extension']//android.widget.EditText[@resource-id='com.td:id/extension']")
	private MobileElement work_extension_info;

	@iOSFindBy(xpath = "//*[@label='Email']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Email' or @text='Adresse courriel')]")
	private MobileElement email_label;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Email' or @label='Adresse courriel']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/business_email']//android.widget.EditText[@resource-id='com.td:id/description']")
	private MobileElement business_email_info;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Email' or @label='Adresse courriel']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/personal_email']//android.widget.EditText[@resource-id='com.td:id/description']")
	private MobileElement personal_email_info;

	@iOSFindBy(xpath = "//*[@label='ADDRESS' or @label='ADRESSE']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title_text' and (@text='ADDRESS' or @text='ADRESSE')]")
	private MobileElement address_header;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/address']/android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement address_detail;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/initial']")
	private MobileElement name_initial;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/user']")
	private MobileElement name_detail;

	@iOSFindBy(xpath = "//*[@label='Save' or @label='Enregistrer']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_primary']")
	private MobileElement save_button;

	@iOSFindBy(xpath = "//*[@name='error-circle']/../XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement error_message;

	@iOSFindBy(xpath = "//*[@id='Retour']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_arrow;

	@iOSFindBy(xpath = "//*[@label='Cancel' or @label='Annuler']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private MobileElement cancel_button;

	@iOSFindBy(xpath = "//*[@label='Yes, go back' or @label='Oui']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private MobileElement goback_button;

	@iOSFindBy(xpath = "//*[@id='banner_info']")
	@AndroidFindBy(xpath = "//android.widget.ScrollView[@resource-id='com.td:id/scrollView']/android.widget.TextView")
	private List<MobileElement> text_Edit;

	@iOSFindBy(xpath = "//*[@label='Done' or @label='OK']")
	// @AndroidFindBy(xpath =
	// "//android.widget.LinearLayout[@resource-id='com.td:id/work_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[@label='Clear text' or @label='Effacer le texte']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/phone_number_icon']")
	private MobileElement clearText_button;

	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//*[@text='Address is Read-Only' or @text='Profile Updated' or @text='L’adresse ne peut être modifiée' or @text='Profil mis à jour']")
	private MobileElement toast_message;

	public synchronized static Profile get() {
		if (Profile == null) {
			Profile = new Profile();
		}
		return Profile;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will verify click business profile Details button then go to
	 * personal profile details page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verify_profile_header() {

		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(profile_Header, profileStr);

			String initial_name = get_name_initial_info();
			if (initial_name.length() == 1) {
				isBusinessUser = true;
				isPersonalUser = false;
				System.out.println("Business User");
			} else if (initial_name.length() == 2) {
				isPersonalUser = true;
				isBusinessUser = false;
				System.out.println("Personal User");
			} else {
				System.err.println("TestCase has failed with unrecongnized initial name.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify click business profile Details button then go to
	 * personal profile details page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verify_contact_information_header() {

		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(profile_contact_info_header, contactInfo);

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will get all profile info Address, phone, email, etc then go
	 * to personal profile details page
	 * 
	 * @return initial name or null
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public String get_name_initial_info() {

		try {

			String nameInitial = mobileAction.getText(name_initial);

			if (!nameInitial.isEmpty()) {
				System.out.println("nameInitial:" + nameInitial);
				return nameInitial;
			}

		} catch (NoSuchElementException e) {
			System.out.println("nameInitial is empty");
		}
		return "";
	}

	private String get_phone_info() {

		// String phone="";
		try {
			if (isPersonalUser) {
				return get_home_phone_info();
			} else {
				return get_business_info();
			}
		} catch (Exception e) {
			return get_business_info();
		}
	}

	public String get_name_detail_info() {

		try {

			String nameDetail = mobileAction.getText(name_detail);
			if (!nameDetail.isEmpty()) {
				System.out.println("nameDetail:" + nameDetail);
				return nameDetail;
			}

		} catch (NoSuchElementException e) {
			System.out.println("nameDetail is empty");
		}
		return "";
	}

	public void get_address_detail_info() {

		try {

			String addressDetail = mobileAction.getValue(address_detail);
			if (!addressDetail.isEmpty())
				System.out.println("addressDetail:" + addressDetail);

		} catch (NoSuchElementException e) {
			System.out.println("addressDetail is empty");
		}
	}

	private String replacePlaceholderToNothing(String text, String placeHolder) {
		String[] replaceHolderList = placeHolder.split("\\|");
		String returnedStr = text;
		for (int i = 0; i < replaceHolderList.length; i++) {
			returnedStr = returnedStr.replaceAll(replaceHolderList[i].trim(), "");
		}
		return returnedStr;
	}

	public String get_home_phone_info() {

		try {

			String homePhome = mobileAction.getValue(home_phone_info);

			// homePhome = homePhome.replaceAll(phonePlaceHolder, "");
			homePhome = replacePlaceholderToNothing(homePhome, phonePlaceHolder);
			if (homePhome.isEmpty()) {
				System.out.println("homePhome is empty");
				return "";
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				homePhome = mobileAction.FuncGetValByRegx(homePhome, androidphoneReg);
			} else {
				homePhome = mobileAction.FuncGetValByRegx(homePhome, iosphoneReg);
			}
			System.out.println("homePhome :" + homePhome);
			return homePhome;

		} catch (NoSuchElementException e) {
			System.out.println("homePhome is empty");
		}
		return "";
	}

	public String get_mobile_phone_info() {

		try {

			String mobilePhone = mobileAction.getValue(mobile_phone_info);
			// mobilePhone = mobilePhone.replaceAll(phonePlaceHolder, "");
			mobilePhone = replacePlaceholderToNothing(mobilePhone, phonePlaceHolder);
			if (mobilePhone.isEmpty()) {
				System.out.println("mobilePhone is empty");
				return "";
			}
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobilePhone = mobileAction.FuncGetValByRegx(mobilePhone, androidphoneReg);
			} else {
				mobilePhone = mobileAction.FuncGetValByRegx(mobilePhone, iosphoneReg);
			}
			System.out.println("mobilephone :" + mobilePhone);
			return mobilePhone;

		} catch (NoSuchElementException e) {
			System.out.println("mobilePhone is empty");
		}
		return "";
	}

	public String get_work_phone_info() {

		try {

			String workPhone = mobileAction.getValue(work_phone_info);
			// workPhone = workPhone.replaceAll(phonePlaceHolder, "");
			workPhone = replacePlaceholderToNothing(workPhone, phonePlaceHolder);
			if (workPhone.isEmpty()) {
				System.out.println("workphone is empty");
				return "";
			}

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				workPhone = mobileAction.FuncGetValByRegx(workPhone, androidphoneReg);
			} else {
				workPhone = mobileAction.FuncGetValByRegx(workPhone, iosphoneReg);
			}
			System.out.println("workphone :" + workPhone);
			return workPhone;

		} catch (NoSuchElementException e) {
			System.out.println("workPhone is empty");
		}
		return "";
	}

	public String get_work_extension_info() {

		try {

			String extension = mobileAction.getValue(work_extension_info);
			if (!extension.isEmpty()) {
				System.out.println("extension:" + extension);
				return extension;
			}

		} catch (NoSuchElementException e) {
			System.out.println("extension is empty");
		}
		return "";
	}

	public String get_business_extension_info() {

		try {

			String extension = mobileAction.getValue(business_extension_info);

			if (!extension.isEmpty()) {
				System.out.println("extension:" + extension);
				return extension;
			}

		} catch (NoSuchElementException e) {
			System.out.println("extension is empty");
		}
		return "";
	}

	public String get_business_info() {

		try {

			String business = mobileAction.getValue(business_phone_info);
			// business = business.replaceAll(phonePlaceHolder, "");
			business = replacePlaceholderToNothing(business, phonePlaceHolder);
			if (business.isEmpty()) {
				System.out.println("business phone is empty");
				return "";
			}
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				business = mobileAction.FuncGetValByRegx(business, androidphoneReg);
			} else {
				business = mobileAction.FuncGetValByRegx(business, iosphoneReg);
			}
			System.out.println("business phone :" + business);
			return business;

		} catch (NoSuchElementException e) {
			System.out.println("business phone not found");
		}
		return "";
	}

	public String get_fax_info() {

		try {

			String fax = mobileAction.getValue(fax_info);
			if (!fax.isEmpty()) {
				System.out.println("fax:" + fax);
				return fax;
			} else {
				System.out.println("fax is empty");
			}

		} catch (NoSuchElementException e) {
			System.out.println("fax not found");
		}
		return "";
	}

	public String get_business_email_info() {

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.SwipeWithinElement(profileScrollView, 1, "down");

				// mobileAction.FunctionSwipe("down", 2, 500);
				System.out.println("Swipe");

			}
			String emailInfo = mobileAction.getValue(business_email_info);

			emailInfo = replacePlaceholderToNothing(emailInfo, emailPlaceHolder);
			if (emailInfo.isEmpty()) {
				System.out.println("Business email is empty");
				return "";
			}

			emailInfo = mobileAction.FuncGetValByRegx(emailInfo, emailReg);
			System.out.println("email:" + emailInfo);
			return emailInfo;

		} catch (NoSuchElementException e) {
			System.out.println("business email is empty");
		}
		return "";
	}

	public String get_personal_email_info() {

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
				// mobileAction.FunctionSwipe("down", 2, 500);
				System.out.println("Swipe");
			}

			String emailInfo = mobileAction.getValue(personal_email_info);

			// Remove placeholder

			emailInfo = replacePlaceholderToNothing(emailInfo, emailPlaceHolder);
			if (emailInfo.isEmpty()) {
				System.out.println("Personal email is empty");

				return "";
			}
			emailInfo = mobileAction.FuncGetValByRegx(emailInfo, emailReg);
			System.out.println("email:" + emailInfo);
			return emailInfo;

		} catch (NoSuchElementException e) {
			System.out.println("personal email is empty");
		}
		return "";
	}

	private String get_extension_info() {
		try {
			if (business_extension_info.isDisplayed()) {
				return get_business_extension_info();

			} else {
				return get_work_extension_info();
			}
		} catch (Exception e) {
			return get_work_extension_info();
		}
	}

	private String get_email_info() {

		try {
			if (business_email_info.isDisplayed()) {
				return get_business_email_info();

			} else {
				return get_personal_email_info();
			}
		} catch (Exception e) {
			return get_personal_email_info();
		}
	}

	/**
	 * This method will get all profile info Address, phone, email, etc then go
	 * to personal profile details page
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */

	public void get_profile_info() {
		Decorator();
		get_name_initial_info();
		get_name_detail_info();
		get_address_detail_info();
		get_home_phone_info();
		get_mobile_phone_info();
		get_work_phone_info();
		get_business_info();
		get_extension_info();
		get_fax_info();
		get_email_info();
	}

	/**
	 * This method will verify initial name in profile
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void VerifyInitialNameforIndividual() {
		Decorator();
		String intial_name = get_name_initial_info();
		if (intial_name.length() == 2) {
			mobileAction.Report_Pass_Verified(intial_name);

		} else {

			mobileAction.Report_Fail_Not_Verified(intial_name);
			System.err.println("TestCase has failed for invalid initial name format");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyInitialNameforBusinessUser() {
		Decorator();
		String intial_name = get_name_initial_info();
		String detail_name = get_name_detail_info();

		if (intial_name.isEmpty() || detail_name.isEmpty()) {
			mobileAction.Report_Fail("Failed for empty name");
			System.err.println("TestCase has failed for empty name");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		System.out.println("intial_name:" + intial_name);
		System.out.println("detail_name:" + detail_name);
		if (intial_name.equals(detail_name.substring(0, 1).toUpperCase())) {
			mobileAction.Report_Pass_Verified(intial_name);
		} else {
			mobileAction.Report_Fail_Not_Verified(intial_name);
			System.err.println("TestCase has failed for invalid initial name format");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyHomePhoneMasked() {
		Decorator();
		String homenumber = get_home_phone_info();
		System.out.println("Homephone:" + homenumber);
		if (homenumber.isEmpty()) {
			mobileAction.Report_Pass_Verified("Home phone is empty");
			return;
		}
		boolean matched = false;
		if (homenumber.matches(androidphoneReg)) {
			matched = true;
		} else if (homenumber.matches(iosphoneReg)) {
			matched = true;
		}
		if (matched) {
			mobileAction.Report_Pass_Verified(homenumber);
		} else {
			mobileAction.Report_Fail_Not_Verified(homenumber);
			System.err.println("TestCase has failed for invalid masked phone");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void checkExtensionNotMasked(String extension) {
		Decorator();
		extension = replacePlaceholderToNothing(extension, extPlaceHolder);
		System.out.println("Extension:" + extension);

		if (extension.contains("*") || extension.contains("•")) {
			mobileAction.Report_Fail_Not_Verified(extension);
			System.err.println("TestCase has failed for masked extension " + extension);
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		if (extension.isEmpty()) {
			mobileAction.Report_Pass_Verified("Empty extension");
			return;
		}
		String extensionDigit = mobileAction.FuncGetValByRegx(extension, extReg);
		if (!extensionDigit.isEmpty()) {
			mobileAction.Report_Pass_Verified(extensionDigit);
		} else {
			mobileAction.Report_Fail("No extension found");
			System.err.println("TestCase has failed for no extension found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyExtensionNotMasked() {
		String extension = "";
		try {
			if (isPersonalUser) {
				extension = get_work_extension_info();
				checkExtensionNotMasked(extension);
			} else {
				extension = get_business_extension_info();
				checkExtensionNotMasked(extension);
				// VerifyBusinessExtensionNotMasked();
			}
		} catch (Exception e) {
			extension = get_business_extension_info();
			checkExtensionNotMasked(extension);
		}
	}

	public void VerifyInitialNameInUpperCase() {
		Decorator();
		String intial_name = get_name_initial_info();
		System.out.println("Profile initial name:" + intial_name);
		if (intial_name.equals(intial_name.toUpperCase())) {
			mobileAction.Report_Pass_Verified(intial_name);
		} else {
			mobileAction.Report_Fail_Not_Verified(intial_name);
			System.err.println("TestCase has failed for initial not in upper case.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void VerifyProfileNameLength() {
		Decorator();
		String detail_name = get_name_detail_info();
		System.out.println("Profile name:" + detail_name);
		if (detail_name.length() <= MAX_NAME_LENGTH) {
			mobileAction.Report_Pass_Verified("The length of profile name " + detail_name.length());
		} else {
			mobileAction.Report_Fail_Not_Verified("The length of profile name " + detail_name.length());
			System.err.println("TestCase has failed for two long name.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void EditBusinessEmailAddress(String email) {
		Decorator();
		try {
			mobileAction.FuncClick(business_email_info, "Email");

			mobileAction.FuncSendKeys(business_email_info, email);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void pressSaveButton() {
		try {
			mobileAction.FuncClick(save_button, "Save");
			mobileAction.waitForElementToVanish(progressBar);
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

		// try{
		// String errorMessage = mobileAction.getText(error_message);
		// System.out.println("Found error message: " + errorMessage);
		// System.err.println("TestCase has failed with error message:" +
		// errorMessage);
		// CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		// }catch (Exception e){
		// System.out.println("No error message found");
		// }
	}

	public void EditPersonalEmailAddress(String email) {
		Decorator();
		try {

			mobileAction.FuncClick(personal_email_info, "Email");

			mobileAction.FuncSendKeys(personal_email_info, email);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void removeEmail() {
		try {
			if (personal_email_info.isDisplayed()) {
				EditPersonalEmailAddress("");
				// pressSaveButton();
			} else {
				EditBusinessEmailAddress("");
				// pressSaveButton();
			}
		} catch (Exception e) {
			EditBusinessEmailAddress("");
			// pressSaveButton();
		}
	}

	public void EditEmailAddress(String email) {

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
			// mobileAction.FuncSwipeOnce("down");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		// If the update email is the same as the original one, update will
		// fail, so need to change
		// the email when it is the same as ori one
		ori_email = get_email_info();
		if (ori_email.equalsIgnoreCase(email)) {
			String[] emailArray = email.split("@");
			email = (new StringBuffer(emailArray[0]).reverse().toString()) + "@" + emailArray[1];
			System.out.println("Update the email to:" + email);
		}

		try {
			if (personal_email_info.isDisplayed()) {
				EditPersonalEmailAddress(email);
			} else {
				EditBusinessEmailAddress(email);
			}
		} catch (Exception e) {
			EditBusinessEmailAddress(email);
		}
	}

	public void EditEmailAddressWithoutSave() {
		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		System.out.println("Email got from Data table:" + EmailAddress);
		if (EmailAddress.isEmpty()) {
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		System.out.println("Email :" + EmailAddress);

		EditEmailAddress(EmailAddress);

	}

	public void EditEmailAddressWithlonger60Char() {
		String email = "qwwwwqeerrttytytyyffdddDDDDDDttttyyiiurtot@ttrrytrthbT123.com";
		EditEmailAddress(email);
	}

	public void EditEmailAddressWithNolonger60Char() {
		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		System.out.println("Email got from Data table:" + EmailAddress);
		if (EmailAddress.isEmpty()) {
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		EditEmailAddress(EmailAddress);
	}

	public void EditEmailAddressWithInvalidChar() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
			// mobileAction.FuncSwipeOnce("down");
		}

		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");

		if (EmailAddress.isEmpty()) {

			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		System.out.println("Email address from Data table:" + EmailAddress);
		EditEmailAddress(EmailAddress);
	}

	public void EditEmailAddressWithNonAformat() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
			// mobileAction.FuncSwipeOnce("down");
		}
		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		System.out.println("Email got from Data table:" + EmailAddress);
		if (EmailAddress.isEmpty()) {
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		EditEmailAddress(EmailAddress);
	}

	public void AddVaildEmail() {
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
			// mobileAction.FuncSwipeOnce("down");
		}
		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		System.out.println("Email from data table:" + EmailAddress);
		EditEmailAddress(EmailAddress);
		try {
			String errorMessage = mobileAction.getText(error_message);
			// System.out.println("Found error message:" + errorMessage );
			System.err.println("TestCase has failed with error '" + errorMessage + "' found.");
			mobileAction.Report_Fail(errorMessage);
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		} catch (NoSuchElementException e) {
			return;
		}
	}

	public String getEmailInfo() {
		String emailAddress = "";
		try {
			emailAddress = get_personal_email_info();
		} catch (Exception e) {
			emailAddress = get_business_email_info();
		}

		return emailAddress;
	}

	public void VerifyEmailAddedSuccesful() {

		VerifyToastmessageDisplayed();

		try {
			String errorMessage = mobileAction.getText(error_message);
			System.out.println("Found error message:" + errorMessage);
			mobileAction.Report_Fail(errorMessage);
		} catch (NoSuchElementException e) {
			String emailAddress = getEmailInfo();
			String emailFromdataTable = CL.getTestDataInstance().TCParameters.get("EmailProfile");

			if (emailAddress.equalsIgnoreCase(emailFromdataTable)) {
				mobileAction.Report_Pass_Verified("Added email:" + emailAddress);
			} else {
				mobileAction.Report_Fail_Not_Verified(emailAddress);
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		}
	}

	public void VerifyBlankEmailNotSuccesful() {

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
			// mobileAction.FuncSwipeOnce("down");
		}

		removeEmail();

		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			pressSaveButton();
		}

		try {

			String errorMessage = mobileAction.getText(error_message);
			if (!errorMessage.isEmpty()) {
				System.out.println("Found error message:" + errorMessage);
				mobileAction.Report_Pass_Verified(errorMessage);
			} else {
				mobileAction.Report_Fail("Empty error message found");
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		} catch (NoSuchElementException e) {
			mobileAction.Report_Fail("No error message found");
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void VerifyErrorMessage() {
		Decorator();
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			pressSaveButton();
		}
		try {
			String errorMessage = mobileAction.getValue(error_message);
			if (!errorMessage.isEmpty()) {
				System.out.println("Found error message:" + errorMessage);
				mobileAction.Report_Pass_Verified(errorMessage);
			} else {
				mobileAction.Report_Fail("No error message found ");
				System.err.println("TestCase has failed with empty error message.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyEmailFormat() {
		Decorator();
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
			// mobileAction.FuncSwipeOnce("down");
		}

		String email_address = "";
		try {
			if (personal_email_info.isDisplayed()) {
				email_address = mobileAction.getValue(personal_email_info);
			} else {
				email_address = mobileAction.getValue(business_email_info);
			}
		} catch (Exception e) {
			email_address = mobileAction.getValue(business_email_info);
		}

		if (!email_address.isEmpty()) {
			email_address = replacePlaceholderToNothing(email_address, emailPlaceHolder);

			if (email_address.isEmpty()) {
				mobileAction.Report_Pass_Verified("Empty Email address");
				return;
			}
			String emailInfo1 = mobileAction.FuncGetValByRegx(email_address, emailReg);

			if (!emailInfo1.isEmpty()) {
				mobileAction.Report_Pass_Verified(emailInfo1);
			} else {
				mobileAction.Report_Fail_Not_Verified(email_address);
				System.err.println("TestCase has failed for email address format.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
		} else {
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void VerifyEmailIDLength() {
		Decorator();
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
			// mobileAction.FuncSwipeOnce("down");
		}
		String email_address = "";
		try {
			if (personal_email_info.isDisplayed()) {
				email_address = mobileAction.getValue(personal_email_info);
			} else {
				email_address = mobileAction.getValue(business_email_info);
			}
		} catch (Exception e) {
			email_address = mobileAction.getValue(business_email_info);
		}

		if (!email_address.isEmpty()) {
			email_address = email_address.replace(emailPlaceHolder, "");
			String emailInfo1 = mobileAction.FuncGetValByRegx(email_address, emailReg);
			if (!emailInfo1.isEmpty()) {
				System.out.println("Email:" + emailInfo1);
				if (emailInfo1.length() <= MAX_EMAIL_LENGTH) {
					mobileAction.Report_Pass_Verified(emailInfo1 + ":length " + emailInfo1.length());
				} else {
					mobileAction.Report_Fail_Not_Verified(emailInfo1 + ":length " + emailInfo1.length());
					System.err.println("TestCase has failed for email address length invalid.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
			} else {
				System.err.println("TestCase has failed for invalid email address format ." + email_address);
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		} else {
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void VerifyEmailIDBlankorNot() {

		Decorator();
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
			// mobileAction.FuncSwipeOnce("down");
		}
		String email_address = null;
		try {
			if (personal_email_info.isDisplayed()) {
				email_address = mobileAction.getValue(personal_email_info);
			} else {
				email_address = mobileAction.getValue(business_email_info);
			}
		} catch (Exception e) {
			email_address = mobileAction.getValue(business_email_info);
		}

		if (email_address != null && !email_address.isEmpty()) {
			email_address = email_address.replace(emailPlaceHolder, "");
			String emailInfo1 = mobileAction.FuncGetValByRegx(email_address, emailReg);
			if (!emailInfo1.isEmpty()) {
				System.out.println("Email:" + emailInfo1);
				mobileAction.Report_Pass_Verified(emailInfo1);
			} else {
				mobileAction.Report_Pass_Verified("Blank email ");
			}
		} else {
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void NavigationBackToProfileandSettingPage() {

		Decorator();
		String back_xpath = "";
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				// back_xpath =
				// "//android.widget.ImageView[@resource-id='android:id/up']";
				mobileAction.FuncClickBackButton();
			} else {
				back_xpath = "//*[@label='Back' or @label='Retour']";
				MobileElement back_arrow = (MobileElement) CL.GetDriver().findElement(By.xpath(back_xpath));
				mobileAction.FuncClick(back_arrow, "<");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void VerifyErrorMessageOrLength() {

		Decorator();
		try {
			String errorMessage = mobileAction.getText(error_message);
			if (errorMessage != null && !errorMessage.isEmpty()) {
				System.out.println("Found error message:" + errorMessage);
				mobileAction.Report_Pass_Verified(errorMessage);
			} else {
				System.err.println("TestCase has failed for empty error message");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		} catch (NoSuchElementException e) {
			VerifyEmailIDLength();
		}
	}

	public void VerifyPopUpWithCancelButton() {

		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(cancel_button, "Cancel");

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void ClickPhoneNumber() {
		Decorator();
		// save ori_phone here before clear it.

		try {
			if (isPersonalUser) {
				ori_phone = get_home_phone_info();
				mobileAction.FuncClick(home_phone_info, "Home Phone");
			} else {
				ori_phone = get_business_info();
				mobileAction.FuncClick(business_phone_info, "Business Phone");
			}
		} catch (Exception e) {
			try {
				ori_phone = get_business_info();
				mobileAction.FuncClick(business_phone_info, "Business Phone");
			} catch (Exception e1) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
		}
	}

	public void VerifyClearTextIconDisplayed() {
		Decorator();
		try {
			if (clearText_button.isDisplayed()) {
				mobileAction.Report_Pass_Verified("Clear Text Button");
			} else {
				mobileAction.Report_Fail_Not_Verified("Clear Text Button");
			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyPhoneNumberIsEmpty() {
		Decorator();
		String phoneNumber = get_phone_info();

		if (phoneNumber.isEmpty()) {
			mobileAction.Report_Pass_Verified("Empty Phone Number");
		} else {
			mobileAction.Report_Fail_Not_Verified("Empty Phone Number");
		}
	}

	public void ClickClearText() {

		Decorator();
		try {
			mobileAction.FuncClick(clearText_button, "Clear Text Button");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyPlaceHolderDisplayed() {

		Decorator();
		String phoneNumber = "";
		try {
			if (isPersonalUser) {

				phoneNumber = mobileAction.getValue(home_phone_info);
			} else {
				phoneNumber = mobileAction.getValue(business_phone_info);
			}
		} catch (Exception e) {
			try {
				phoneNumber = mobileAction.getValue(business_phone_info);
			} catch (Exception e1) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
		}

		if (phonePlaceHolder.contains(phoneNumber)) {
			mobileAction.Report_Pass_Verified("Place holder:" + phoneNumber);
		} else {
			mobileAction.Report_Fail_Not_Verified("Place holder:" + phoneNumber);
		}

	}

	public void EditPhoneNumber() {

		Decorator();
		String phoneNumber = CL.getTestDataInstance().TCParameters.get("PhoneProfile");
		System.out.println("Phone from data table:" + phoneNumber);
		if (phoneNumber.length() == 10) {
			// this is a valid number, need to check this number is the same as
			// the original one
			String last_4_digit = mobileAction.FuncGetValByRegx(ori_phone, extReg);
			if (!last_4_digit.isEmpty() && phoneNumber.contains(last_4_digit)) {
				// possible the same phone
				String reverse_4_digit = new StringBuffer(last_4_digit).reverse().toString();
				phoneNumber = phoneNumber.replaceAll(last_4_digit, reverse_4_digit);
				System.out.println("Phone changed since last 4 digit is the same as original one:" + phoneNumber);
			}
		}

		try {
			if (isPersonalUser) {
				mobileAction.FuncSendKeys(home_phone_info, phoneNumber);
			} else {

				mobileAction.FuncSendKeys(business_phone_info, phoneNumber);
			}
		} catch (Exception e) {
			try {
				mobileAction.FuncSendKeys(business_phone_info, phoneNumber);
			} catch (Exception e1) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
		}

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void ClickAddressDetail() {
		Decorator();
		try {
			if (address_detail.isDisplayed()) {
				mobileAction.FuncClick(address_detail, "Address");
			} else {
				System.err.println("TestCase has failed, no address found");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
		} catch (Exception e) {
			System.err.println("TestCase has failed");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void VerifyToastmessageDisplayed() {
		Decorator();
		String toastMessage = "";

		try {

			toastMessage = mobileAction.getValue(toast_message);
			System.out.println("toastMessage:" + toastMessage);
			if (!toastMessage.isEmpty()) {
				mobileAction.Report_Pass_Verified(toastMessage);
			} else {
				System.err.println("TestCase has failed, no toast message found");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}
		} catch (Exception e) {

			try {
				String errorMessage = mobileAction.getValue(error_message);
				System.err.println("TestCase has failed with error :" + errorMessage);
				mobileAction.Report_Fail(errorMessage);
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			} catch (Exception e1) {
				mobileAction.Report_Pass_Verified("No error message found, need manual verification");
			}

		}

	}

	public void GetEmailAndPhoneNumber() {
		Decorator();

		ori_phone = get_phone_info();
		ori_email = get_email_info();

		System.out.println("ori_phone:" + ori_phone);
		System.out.println("ori_email:" + ori_email);
		mobileAction.Report_Pass_Verified("ori_phone:" + ori_phone);
		mobileAction.Report_Pass_Verified("ori_email:" + ori_email);

	}

	public void ClickPopupGoBackButton() {
		Decorator();
		try {
			mobileAction.FuncClick(goback_button, "Yes, Go Back");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void VerifyPhoneEmailNotChanged() {
		Decorator();
		String phone_after = "";
		String email_after = "";
		phone_after = get_phone_info();

		try {
			email_after = get_email_info();
		} catch (Exception e) {
			System.err.println("TestCase has failed for getting email.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}

		if (phone_after.equalsIgnoreCase(ori_phone)) {
			mobileAction.Report_Pass_Verified("phone:" + ori_phone + " not changed");
		} else {
			mobileAction.Report_Fail_Not_Verified("phone:" + phone_after + " changed");
		}
		if (email_after.equalsIgnoreCase(ori_email)) {
			mobileAction.Report_Pass_Verified("email:" + email_after + " not changed");
		} else {
			mobileAction.Report_Fail_Not_Verified("email:" + email_after + " changed");
		}
	}
}