package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Profile extends _CommonPage {

	private static Profile Profile;

	String profileStr = "Profile | Profil";
	String contactInfo = "CONTACT INFORMATION | COORDONNES";
	String profileScrollView = "//android.widget.ScrollView[@resource-id='com.td:id/scrollView']";
	String emailReg ="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}";
	String androidphoneReg ="\\(\\*{3}\\)\\*{3}-\\d{4}";
	String iosphoneReg = "\\(\\{3}\\) \\{3} - \\d{4}";
	String extReg = "\\d+";
	String emailPlaceHolder = "example@address.com";
	String phonePlaceHolder ="Enter number";
	String extPlaceHolder ="Enter extension";
	int MAX_EMAIL_LENGTH =60;
	int MAX_NAME_LENGTH = 40;
	
	@iOSFindBy(xpath = "//*[@label='Profile']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and (@text='Profile' or @text='Profil')]")
	private MobileElement profile_Header;

	@iOSFindBy(xpath = "//*[@label='CONTACT INFORMATION']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title_text' and (@text='CONTACT INFORMATION' or @text='COORDONNES')]")
	private MobileElement profile_contact_info_header;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Home Phone']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Home Phone' or @text='No de tl. (domicile)')]")
	private MobileElement home_phone_label;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Home Phone']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/home_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement home_phone_info;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Work Phone']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Work Phone' or @text='No de tl. (travail)')]")
	private MobileElement work_phone_label;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Work Phone']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/work_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement work_phone_info;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mobile Phone']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Mobile Phone' or @text='No de tl. (cell.)')]")
	private MobileElement mobile_phone_label;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Mobile Phone']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/mobile_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement mobile_phone_info;
	
	
	@iOSFindBy(xpath = "//*[@label='Business Phone']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Business Phone' or @text='No de tl. (entreprise)']")
	private MobileElement business_phone_label;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Business Phone']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/business_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement business_phone_info;
	
	@iOSFindBy(xpath = "//*[@label='Fax']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Fax' or @text='Tlcopieur')]")
	private MobileElement fax_label;
	
	@iOSFindBy(xpath = "//*[@label='Fax']")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/fax_number']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement fax_info;
	
	@iOSFindBy(xpath = "//*[@label='Ext. (optional)']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Ext. (optional)' or @text='Poste (facultatif)')]")
	private MobileElement extention_label;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Ext. (optional)']/../XCUIElementTypeTextField[2]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/business_extension']//android.widget.EditText[@resource-id='com.td:id/extension']")
	private MobileElement business_extension_info;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Ext. (optional)']/../XCUIElementTypeTextField[2]")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/work_extension']//android.widget.EditText[@resource-id='com.td:id/extension']")
	private MobileElement work_extension_info;
	
	@iOSFindBy(xpath = "//*[@label='Email']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/label' and (@text='Email' or @text='Adresse courriel')]")
	private MobileElement email_label;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Email']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/business_email']//android.widget.EditText[@resource-id='com.td:id/description']")
	private MobileElement business_email_info;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Email']/../XCUIElementTypeTextField")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/personal_email']//android.widget.EditText[@resource-id='com.td:id/description']")
	private MobileElement personal_email_info;
	
	@iOSFindBy(xpath = "//*[@label='ADDRESS']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title_text' and (@text='ADDRESS' or @text='ADRESSE')]")
	private MobileElement address_header;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/address']/android.widget.TextView[@resource-id='com.td:id/description']")
	private MobileElement address_detail;
	
	@iOSFindBy(xpath = "//*[@id='initial']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/initial']")
	private MobileElement name_initial;
	
	@iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/user']")
	private MobileElement name_detail;
	
	@iOSFindBy(xpath = "//*[@label='Save']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_primary']")
	private MobileElement save_button;
	
	@iOSFindBy(xpath = "//*[@name='error-circle']/../XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/banner_info']")
	private MobileElement error_message;
	
	@iOSFindBy(xpath = "//*[@id='banner_info']")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement back_arrow;	
	
	@iOSFindBy(xpath = "//*[@label='Cancel']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private MobileElement cancel_button;	
	
	@iOSFindBy(xpath = "//*[@id='banner_info']")
	@AndroidFindBy(xpath = "//android.widget.ScrollView[@resource-id='com.td:id/scrollView']/android.widget.TextView")
	private List<MobileElement> text_Edit;
	
	@iOSFindBy(xpath = "//*[@label='Done']")
	//@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.td:id/work_phone']//android.widget.EditText[@resource-id='com.td:id/phone_number']")
	private MobileElement done;

	public synchronized static Profile get() {
		if (Profile == null) {
			Profile = new Profile();
		}
		return Profile;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}
	
	/**
	 * This method will verify click business profile Details button
	 * then go to personal profile details page
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

			mobileAction.verifyHeaderIsDisplayed(profile_Header, profileStr);

		} catch (NoSuchElementException | IOException e) {
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	

	/**
	 * This method will verify click business profile Details button
	 * then go to personal profile details page
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

			mobileAction.verifyHeaderIsDisplayed(profile_contact_info_header, contactInfo);

		} catch (NoSuchElementException | IOException e){ 
				System.err.println("TestCase has failed.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	/**
	 * This method will get all profile info
	 * Address, phone, email, etc
	 * then go to personal profile details page
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
	public String  get_name_initial_info() {
		
		try {

			String nameInitial = mobileAction.getText(name_initial);
			if(!nameInitial.isEmpty()){
				System.out.println("nameInitial:" + nameInitial);
				return nameInitial;
			}

		} catch (NoSuchElementException e) {
			System.out.println("nameInitial is empty");
		}
		return "";
	}
	
	
	public String get_name_detail_info() {
		
		try {

			String nameDetail = mobileAction.getText(name_detail);
			if(!nameDetail.isEmpty()){
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
			if(!addressDetail.isEmpty())
				System.out.println("addressDetail:" + addressDetail);

		} catch (NoSuchElementException e) {
			System.out.println("addressDetail is empty");
		}	
	}
	
	
	public String get_home_phone_info() {
			
		try {
			
			String homePhome = mobileAction.getValue(home_phone_info);
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				homePhome = mobileAction.getMatchedString(homePhome, androidphoneReg);
			}else{
				homePhome = mobileAction.getMatchedString(homePhome, iosphoneReg);
			}
			System.out.println("homePhome :" +homePhome);
			return homePhome;
			
		} catch (NoSuchElementException e) {
			System.out.println("homePhome is empty");
		}
		return "";
	}
	
	public String get_mobile_phone_info() {
		
		try {

			String mobilePhone = mobileAction.getValue(mobile_phone_info);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobilePhone = mobileAction.getMatchedString(mobilePhone, androidphoneReg);
			}else{
				mobilePhone = mobileAction.getMatchedString(mobilePhone, iosphoneReg);
			}
			System.out.println("mobilephone :" +mobilePhone);
			return mobilePhone;

		} catch (NoSuchElementException e) {
			System.out.println("mobilePhone is empty");
		}
		return "";
	}
	
	public String get_work_phone_info() {
		
		try {

			String workPhone = mobileAction.getValue(work_phone_info);
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				workPhone = mobileAction.getMatchedString(workPhone, androidphoneReg);
			}else{
				workPhone = mobileAction.getMatchedString(workPhone, iosphoneReg);
			}
			System.out.println("workphone :" +workPhone);
			return workPhone;

		} catch (NoSuchElementException e) {
			System.out.println("workPhone is empty");
		}
		return "";
	}
	
	public String get_work_extension_info() {
		
		try {

			String extension = mobileAction.getValue(work_extension_info);
			if(!extension.isEmpty()){
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
			
			if(!extension.isEmpty()){
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
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				business = mobileAction.getMatchedString(business, androidphoneReg);
			}else{
				business = mobileAction.getMatchedString(business, iosphoneReg);
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
			if(!fax.isEmpty()){
				System.out.println("fax:" + fax);
				return fax;
			}
			else{
				System.out.println("fax is empty" );
			}
				
		} catch (NoSuchElementException e) {
			System.out.println("fax not found");
		}
		return "";
	}
	
	
	public String get_business_email_info() {
		
	try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){	
				mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
			}
			String emailInfo = mobileAction.getValue(business_email_info);
			
			
			emailInfo = emailInfo.replace(emailPlaceHolder, "");
			emailInfo = mobileAction.getMatchedString(emailInfo, emailReg);
			System.out.println("email:" + emailInfo);
			return emailInfo;


		} catch (NoSuchElementException e) {
			System.out.println("business email is empty");
		}
		return "";
	}
	
	public String get_personal_email_info() {
		
    try {
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
		}
		
		String emailInfo = mobileAction.getValue(personal_email_info);
		

		//Remove placeholder
		emailInfo = emailInfo.replace(emailPlaceHolder, "");
		
		emailInfo= mobileAction.getMatchedString(emailInfo, emailReg);
		System.out.println("email:" + emailInfo);
		return emailInfo;


	} catch (NoSuchElementException e) {
		System.out.println("personal email is empty");
	}
	return "";
}

	
	private String get_extension_info(){
		try{
			if(business_extension_info.isDisplayed()){
				return get_business_extension_info();
				
			}else{
				return get_work_extension_info();
			}
		}catch (Exception e){
			return get_work_extension_info();
		}
	}
	
	private String get_email_info(){
		try{
			if(business_email_info.isDisplayed()){
				return get_business_email_info();
				
			}else{
				return get_personal_email_info();
			}
		}catch (Exception e){
			return get_personal_email_info();
		}
	}
	
	/**
	 * This method will get all profile info
	 * Address, phone, email, etc
	 * then go to personal profile details page
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
		if(intial_name.length() == 2){
			mobileAction.Report_Pass_Verified(intial_name);
			
		}else{
			
			mobileAction.Report_Fail_Not_Verified(intial_name);
			System.err.println("TestCase has failed for invalid initial name format");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
	public void VerifyInitialNameforBusinessUser() {
		Decorator();
		String intial_name = get_name_initial_info();
		String detail_name = get_name_detail_info();
		System.out.println("intial_name:"+ intial_name);
		System.out.println("detail_name:"+ detail_name);
		if(intial_name.equals(detail_name.substring(0, 1).toUpperCase())){	
			mobileAction.Report_Pass_Verified(intial_name);
		}
		else {
			mobileAction.Report_Fail_Not_Verified(intial_name);
			System.err.println("TestCase has failed for invalid initial name format");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void VerifyHomePhoneMasked() {
		Decorator();
		String homenumber = get_home_phone_info();
    	boolean matched = false;
    	if (homenumber.matches(androidphoneReg)){
    		matched = true;
    	}else if (homenumber.matches(iosphoneReg)){
    		matched = true;
    	}
		if(matched){
			mobileAction.Report_Pass_Verified(homenumber);
		}else{
			mobileAction.Report_Fail_Not_Verified(homenumber);
			System.err.println("TestCase has failed for invalid masked phone");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}		
	}
	
	public void checkExtensionNotMasked(String extension) {
		Decorator();
		extension = extension.replace(extPlaceHolder, "");
		
		if(extension.contains("*") || extension.contains("")){
			mobileAction.Report_Fail_Not_Verified(extension);
			System.err.println("TestCase has failed for masked extension "+extension);
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		String extensionDigit = mobileAction.getMatchedString(extension, extReg);
		if(!extensionDigit.isEmpty()){
			mobileAction.Report_Pass_Verified(extensionDigit);
		}else{
			mobileAction.Report_Fail("No extension found");
			System.err.println("TestCase has failed for no extension found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	
	public void VerifyExtensionNotMasked(){
		String extension="";
		try{
			if(work_extension_info.isDisplayed()){
				extension =get_work_extension_info();
				checkExtensionNotMasked(extension);
			}
			else{
				extension = get_business_extension_info();
				checkExtensionNotMasked(extension);
				//VerifyBusinessExtensionNotMasked();
			}
		}catch (Exception e){
			extension = get_business_extension_info();
			checkExtensionNotMasked(extension);
		}
	}
	
	
	public void VerifyInitialNameInUpperCase() {
		Decorator();
		String intial_name = get_name_initial_info();
		System.out.println("Profile initial name:"+ intial_name);
		if(intial_name.equals(intial_name.toUpperCase())){
			mobileAction.Report_Pass_Verified(intial_name);
		}else{
			mobileAction.Report_Fail_Not_Verified(intial_name);
			System.err.println("TestCase has failed for initial not in upper case.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
		
	}
	
	public void VerifyProfileNameLength(){
		Decorator();
		String detail_name = get_name_detail_info();
		System.out.println("Profile name:"+ detail_name);
		if(detail_name.length() <= MAX_NAME_LENGTH){
			mobileAction.Report_Pass_Verified("The length of profile name " + detail_name.length());
		}else{
			mobileAction.Report_Fail_Not_Verified("The length of profile name "+ detail_name.length());
			System.err.println("TestCase has failed for two long name.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}		
	}
	
	
	public void EditBusinessEmailAddress(String email){
		Decorator();
		try{
			mobileAction.FuncClick(business_email_info, "Email");
			
			mobileAction.FuncSendKeys(business_email_info, email);
	        if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
	        	mobileAction.FuncHideKeyboard();	       
	        }else{
	        	mobileAction.FuncClick(done, "Done");
	        }
			
		}catch (NoSuchElementException | InterruptedException | IOException e) {
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	    } 
	}
	
	public void pressSaveButton(){
		try{
	        mobileAction.FuncClick(save_button, "Save");			
		}catch (NoSuchElementException | InterruptedException | IOException e) {
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	    } 
	}
	
	
	public void EditPersonalEmailAddress(String email){
		Decorator();
		try{
			mobileAction.FuncClick(personal_email_info, "Email");
			
			mobileAction.FuncSendKeys(personal_email_info, email);
	        if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
	        	mobileAction.FuncHideKeyboard();	       
	        }else{
	        	mobileAction.FuncClick(done, "Done");
	        }
		}catch (NoSuchElementException | InterruptedException | IOException e) {
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	    } 
	}
	
	private void removeEmail(){
		try{
			if(personal_email_info.isDisplayed()){
				EditPersonalEmailAddress("");
				//pressSaveButton();
			}else {
				EditBusinessEmailAddress("");
				//pressSaveButton();
			}
		}catch (Exception e){
			EditBusinessEmailAddress("");
			//pressSaveButton();
		}
	}
	
	public void EditEmailAddress(String email){
		try{
			if(personal_email_info.isDisplayed()){
				EditPersonalEmailAddress(email);
			}else {
				EditBusinessEmailAddress(email);
			}
		}catch (Exception e){
			EditBusinessEmailAddress(email);
		}
	}
	
	public void EditEmailAddressWithoutSave(){
		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		System.out.println("Email got from Data table:" + EmailAddress);
		if(EmailAddress.isEmpty()){
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		System.out.println("Email :" + EmailAddress);
		
		try{
			if(personal_email_info.isDisplayed()){
				EditPersonalEmailAddress(EmailAddress);
			}else {
				EditBusinessEmailAddress(EmailAddress);
			}
		}catch (Exception e){
			EditBusinessEmailAddress(EmailAddress);
		}
		
	}
	
	public void EditEmailAddressWithlonger60Char(){
		String email= "qwwwwqeerrttytytyyffdddDDDDDDttttyyiiurtot@ttrrytrthbT123.com";
		EditEmailAddress(email);
	}
	
	public void EditEmailAddressWithNolonger60Char(){
		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		System.out.println("Email got from Data table:" + EmailAddress);
		if(EmailAddress.isEmpty()){
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		EditEmailAddress(EmailAddress);
	}
	public void EditEmailAddressWithInvalidChar(){
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
		}
		
		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		
		if(EmailAddress.isEmpty()){
			
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		System.out.println("Email address from Data table:" + EmailAddress);
		EditEmailAddress(EmailAddress);
	}
	
	
	public void EditEmailAddressWithNonAformat(){
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
		}
		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		System.out.println("Email got from Data table:" + EmailAddress);
		if(EmailAddress.isEmpty()){
			System.err.println("TestCase has failed for email address not found.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
		EditEmailAddress(EmailAddress);
	}	
	

	public void AddVaildEmail(){
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
		}
		String EmailAddress = CL.getTestDataInstance().TCParameters.get("EmailProfile");
		System.out.println("Email from data table:" + EmailAddress);
		EditEmailAddress(EmailAddress);
		try{
			String errorMessage = mobileAction.getText(error_message);
			//System.out.println("Found error message:" + errorMessage );
			System.err.println("TestCase has failed with error '"+errorMessage +"' found.");
			mobileAction.Report_Fail(errorMessage);
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}catch (NoSuchElementException e) {
			return;
	    } 
	}
	public String getEmailInfo(){
		String emailAddress="";
		try{
			emailAddress = get_personal_email_info();
		}catch (Exception e){
			emailAddress = get_business_email_info();
		}
		
		return emailAddress;
	}
	
	public void VerifyEmailAddedSuccesful(){

		try{
			String errorMessage = mobileAction.getText(error_message);
			System.out.println("Found error message:" + errorMessage );
			mobileAction.Report_Fail(errorMessage); 
		}catch (NoSuchElementException e) {
			String emailAddress = getEmailInfo();
			String emailFromdataTable= CL.getTestDataInstance().TCParameters.get("EmailProfile");

			if(emailAddress.equalsIgnoreCase(emailFromdataTable)){
				mobileAction.Report_Pass_Verified("Added email:" +emailAddress);
			}else{
				mobileAction.Report_Fail_Not_Verified(emailAddress);
		        System.err.println("TestCase has failed.");
		        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
			
	    } 
	}
	
	
	public void VerifyBlankEmailNotSuccesful(){
		
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
		}
		
		removeEmail();
		
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			pressSaveButton();
		}

		try{
			
			String errorMessage = mobileAction.getText(error_message);
			if(!errorMessage.isEmpty()){
				System.out.println("Found error message:" + errorMessage );
				mobileAction.Report_Pass_Verified(errorMessage);
			}else{
				mobileAction.Report_Fail("Empty error message found");
		        System.err.println("TestCase has failed.");
		        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		}catch (NoSuchElementException e) {
			mobileAction.Report_Fail("No error message found");
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	    } 
		
	}
	
	public void VerifyErrorMessage(){
		Decorator();
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			pressSaveButton();
		}
		try{
			String errorMessage = mobileAction.getValue(error_message);
			if(!errorMessage.isEmpty()){
				System.out.println("Found error message:" + errorMessage );
				mobileAction.Report_Pass_Verified(errorMessage);
			}else{
				mobileAction.Report_Fail("No error message found ");
		        System.err.println("TestCase has failed with empty error message.");
		        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
			
		}catch (NoSuchElementException e) {
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	    } 
	}
	
	public void VerifyEmailFormat(){
		Decorator();
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
		}

		String email_address= "";
		try{
			if(personal_email_info.isDisplayed()){
				email_address =  mobileAction.getValue(personal_email_info);
			}else{
				email_address =  mobileAction.getValue(business_email_info);
			}
		}catch (Exception e){
			email_address =  mobileAction.getValue(business_email_info);
		}
		
		if(!email_address.isEmpty() ){
			email_address = email_address.replace(emailPlaceHolder, "");			
			String emailInfo1 = mobileAction.getMatchedString(email_address, emailReg);
			
			if(!emailInfo1.isEmpty()){
				mobileAction.Report_Pass_Verified(emailInfo1);
			}else{
				mobileAction.Report_Fail_Not_Verified(email_address);
				System.err.println("TestCase has failed for email address format.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;	
			}
		}
		else {
				System.err.println("TestCase has failed for email address not found.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
			
	}
	
	public void VerifyEmailIDLength(){
		Decorator();
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
			mobileAction.SwipeWithinElement(profileScrollView, 1, "down");
		}
		String email_address= "";
		try{
			if(personal_email_info.isDisplayed()){
				email_address =  mobileAction.getValue(personal_email_info);
			}else{
				email_address =  mobileAction.getValue(business_email_info);
			}
		}catch (Exception e){
			email_address =  mobileAction.getValue(business_email_info);
		}
		
		if(!email_address.isEmpty() ){
			email_address = email_address.replace(emailPlaceHolder, "");			
			String emailInfo1 = mobileAction.getMatchedString(email_address, emailReg);
			if(!emailInfo1.isEmpty()){
				System.out.println("Email:"+ emailInfo1);
				if(emailInfo1.length() <= MAX_EMAIL_LENGTH){
					mobileAction.Report_Pass_Verified(emailInfo1 + ":length " + emailInfo1.length());
				}else{
					mobileAction.Report_Fail_Not_Verified(emailInfo1 + ":length " + emailInfo1.length());
					System.err.println("TestCase has failed for email address length invalid.");
					CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				}
			}else{
				System.err.println("TestCase has failed for invalid email address format ." + email_address);
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		}
		else {
				System.err.println("TestCase has failed for email address not found.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
			
	}
	

	public void VerifyEmailIDBlankorNot(){
		Decorator();

		String email_address= null;
		try{
			if(personal_email_info.isDisplayed()){
				email_address =  mobileAction.getValue(personal_email_info);
			}else{
				email_address =  mobileAction.getValue(business_email_info);
			}
		}catch (Exception e){
			email_address =  mobileAction.getValue(business_email_info);
		}
		
		if(email_address != null && !email_address.isEmpty()){
			email_address = email_address.replace(emailPlaceHolder, "");			
			String emailInfo1 = mobileAction.getMatchedString(email_address, emailReg);
			if(!emailInfo1.isEmpty()){
				System.out.println("Email:"+ emailInfo1);
				mobileAction.Report_Pass_Verified(emailInfo1);
			}else{
				mobileAction.Report_Pass_Verified("Blank email ");
			}
		}
		else {
				System.err.println("TestCase has failed for email address not found.");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}	
		
	}
	
	public void NavigationBackToProfileandSettingPage(){
		
		Decorator();
		try{
			//mobileAction.FuncClick(back_arrow, "<");
			mobileAction.FuncClickBackButton();
			Thread.sleep(3000);
				
		}catch (NoSuchElementException |  IOException e) {
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;
	    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void VerifyErrorMessageOrLength(){
		
		Decorator();
		try{
			String errorMessage = mobileAction.getText(error_message);
			if(errorMessage !=null && !errorMessage.isEmpty()){
				System.out.println("Found error message:" + errorMessage );
				mobileAction.Report_Pass_Verified(errorMessage);
			}else{
				System.err.println("TestCase has failed for empty error message");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}
			
		}catch (NoSuchElementException e) {
			VerifyEmailIDLength();
	    }  
	}

	public void VerifyPopUpWithCancelButton(){
		
		Decorator();
		try{
			mobileAction.verifyElementIsDisplayed(cancel_button, "Cancel");

		}catch (NoSuchElementException | IOException e) {
	        System.err.println("TestCase has failed.");
	        CL.getGlobalVarriablesInstance().bStopNextFunction = false;			
	    }  
	}
	
	
}
