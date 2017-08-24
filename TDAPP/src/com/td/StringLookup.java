package com.td;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringLookup {
	public final static String INVESTING_ACCOUNTS = "investing_accounts";
	public final static String MOBILE_PAYMENT = "mobile_payment";
	public final static String PRIVACY_SECURITY_LEGAL = "privacy_security_legal";
	public final static String SEND_FEEDBACK = "send_feedback";
	public static final String FORGOT_PASSWORD = "forgot_password";
	public static final String ALLOW_CONTACTS_ACCESS_HEADER = "allow_contacts_access_header";
	public static final String ALLOW_CONTACTS_ACCCESS_BODY = "allow_contacts_access_body";
	public static final String ALLOW_CONTACTS_OK = "allow_contacts_ok";
	public static final String ALLOW_CONTACTS_REFUSE = "allow_contacts_refuse";

	public static final String OTP_CHALLENGE_UNABLE_TO_VERIFY_CODE = "otp_challenge_unable_to_verify_code";
	public static final String OTP_CHALLENGE_TOO_MANY_SECURITY_CODES_REQUESTED = "otp_challenge_too_many_security_codes_requested";
	
	public static final String FM_TO_ACCOUNT = "MF_to_account";
	public static final String FM_FROM_ACCOUNT = "MF_from_account";
	public static final String FM_EMAIL = "MF_email";
	public static final String FM_PHONE = "MF_phone_number";
	public static final String MF_ACCEPTED_FUND_DETAIL="MF_Accepted_Fund_Details_Fees";
	public static final String PROFILE_AND_PREFERENCE="Profile & Settings";
	public static final String PREFERENCE_QUICK_ACCESS_SETTINGS="Quick Access Settings";
	public static final String PREFERENCE_QUICK_ACCESS_SWITCH_AND="Quick Access Switch";
	public static final String CONTACT_INFORMATION = "Contact Information";
	public static final String HOME_PHONE = "Home Phone";
	public static final String WORK_PHONE = "WORK Phone";
	public static final String MOBILE_PHONE = "Mobile Phone";
	public static final String BUSINESS_PHONE = "Business Phone";
	public static final String FAX_NUMBER = "Fax Number";
	public static final String EXTENSION_NUMBER = "Extension Number";
	public static final String SAVE_BUTTON = "Save Button";
	public static final String CLEAR_PHONE_ICON ="Clear Phone Icon";
	
	private static final Map<String, String> mapEN;
	private static final Map<String, String> mapFR;
	private static final Map<String, String> mapZHHANS;
	private static final Map<String, String> mapZHHANT;

	private StringLookup() {
		// Utils class
	}

	static {
		Map<String, String> aMap = new HashMap<>();
		Map<String, String> bMap = new HashMap<>();
		Map<String, String> cMap = new HashMap<>();
		Map<String, String> dMap = new HashMap<>();

		aMap.put(INVESTING_ACCOUNTS, StringArray.ARRAY_INVESTING_ACCOUNTS[0]);
		aMap.put(MOBILE_PAYMENT, StringArray.ARRAY_MOBILE_PAYMENT[0]);
		aMap.put(PRIVACY_SECURITY_LEGAL, StringArray.ARRAY_PRIVACY_SECURITY_LEGAL[0]);
		aMap.put(SEND_FEEDBACK, StringArray.ARRAY_CUSTOMER_FEEDBACK[0]);
		aMap.put(FORGOT_PASSWORD, StringArray.ARRAY_FORGOT_PASSWORD[0]);
		aMap.put(ALLOW_CONTACTS_OK, StringArray.ARRAY_ALLOW_CONTACTS_OK[0]);
		aMap.put(ALLOW_CONTACTS_REFUSE, StringArray.ARRAY_ALLOW_CONTACTS_REFUSE[0]);
		aMap.put(OTP_CHALLENGE_UNABLE_TO_VERIFY_CODE, StringArray.ARRAY_OTP_CHALLENGE_UNABLE_TO_VERIFY_CODE[0]);
		aMap.put(OTP_CHALLENGE_TOO_MANY_SECURITY_CODES_REQUESTED, StringArray.ARRAY_OTP_CHALLENGE_TOO_MANY_SECURITY_CODES_REQUESTED[0]);
		aMap.put(FM_TO_ACCOUNT, StringArray.ARRAY_MF_TO_ACCOUNT[0]);
		aMap.put(FM_FROM_ACCOUNT, StringArray.ARRAY_MF_FROM_ACCOUNT[0]);
		aMap.put(FM_EMAIL, StringArray.ARRAY_MF_EMAIL[0]);
		aMap.put(FM_PHONE, StringArray.ARRAY_MF_PHONE[0]);
		aMap.put(MF_ACCEPTED_FUND_DETAIL, StringArray.ARRAY_MF_ACCEPTED_FUND_DETAIL_FEE[0]);
		aMap.put(PROFILE_AND_PREFERENCE, StringArray.ARRAY_PROFILE_AND_PREFERENCE[0]);
		aMap.put(PREFERENCE_QUICK_ACCESS_SETTINGS, StringArray.ARRAY_QUICK_ACCESS_SETTINGS[0]);
		aMap.put(PREFERENCE_QUICK_ACCESS_SWITCH_AND, StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND[0]);
		aMap.put(CONTACT_INFORMATION, StringArray.ARRAY_MF_CONTACT_INFO[0]);
		aMap.put(HOME_PHONE, StringArray.ARRAY_HOME_PHONE[0]);
		aMap.put(WORK_PHONE, StringArray.ARRAY_WORK_PHONE[0]);
		aMap.put(MOBILE_PHONE, StringArray.ARRAY_MOBILE_PHONE[0]);
		aMap.put(BUSINESS_PHONE, StringArray.ARRAY_BUSINESS_PHONE[0]);
		aMap.put(FAX_NUMBER, StringArray.ARRAY_FAX_NUMBER[0]);
		aMap.put(EXTENSION_NUMBER, StringArray.ARRAY_EXTENSION_NUMBER[0]);
		aMap.put(SAVE_BUTTON, StringArray.ARRAY_SAVE_BUTTON[0]);
		aMap.put(CLEAR_PHONE_ICON, StringArray.ARRAY_CLEAR_PHONE_ICON[0]);
		mapEN = Collections.unmodifiableMap(aMap);
		bMap.put(INVESTING_ACCOUNTS, StringArray.ARRAY_INVESTING_ACCOUNTS[1]);
		bMap.put(MOBILE_PAYMENT,StringArray.ARRAY_MOBILE_PAYMENT[1]);
		bMap.put(PRIVACY_SECURITY_LEGAL, StringArray.ARRAY_PRIVACY_SECURITY_LEGAL[1]);
		bMap.put(SEND_FEEDBACK, StringArray.ARRAY_CUSTOMER_FEEDBACK[1]);
		bMap.put(FORGOT_PASSWORD, StringArray.ARRAY_FORGOT_PASSWORD[1]);
		bMap.put(ALLOW_CONTACTS_OK, StringArray.ARRAY_ALLOW_CONTACTS_OK[1]);
		bMap.put(ALLOW_CONTACTS_REFUSE, StringArray.ARRAY_ALLOW_CONTACTS_REFUSE[1]);
		bMap.put(FM_TO_ACCOUNT, StringArray.ARRAY_MF_TO_ACCOUNT[1]);
		bMap.put(FM_FROM_ACCOUNT, StringArray.ARRAY_MF_FROM_ACCOUNT[1]);
		bMap.put(FM_EMAIL, StringArray.ARRAY_MF_EMAIL[1]);
		bMap.put(FM_PHONE, StringArray.ARRAY_MF_PHONE[1]);
		bMap.put(MF_ACCEPTED_FUND_DETAIL, StringArray.ARRAY_MF_ACCEPTED_FUND_DETAIL_FEE[1]);
		bMap.put(PROFILE_AND_PREFERENCE, StringArray.ARRAY_PROFILE_AND_PREFERENCE[1]);
		bMap.put(PREFERENCE_QUICK_ACCESS_SETTINGS, StringArray.ARRAY_QUICK_ACCESS_SETTINGS[1]);
		bMap.put(PREFERENCE_QUICK_ACCESS_SWITCH_AND, StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND[1]);
		bMap.put(CONTACT_INFORMATION, StringArray.ARRAY_MF_CONTACT_INFO[1]);
		bMap.put(HOME_PHONE, StringArray.ARRAY_HOME_PHONE[1]);
		bMap.put(WORK_PHONE, StringArray.ARRAY_WORK_PHONE[1]);
		bMap.put(MOBILE_PHONE, StringArray.ARRAY_MOBILE_PHONE[1]);
		bMap.put(BUSINESS_PHONE, StringArray.ARRAY_BUSINESS_PHONE[1]);
		bMap.put(FAX_NUMBER, StringArray.ARRAY_FAX_NUMBER[1]);
		bMap.put(EXTENSION_NUMBER, StringArray.ARRAY_EXTENSION_NUMBER[1]);
		bMap.put(SAVE_BUTTON, StringArray.ARRAY_SAVE_BUTTON[1]);
		bMap.put(CLEAR_PHONE_ICON, StringArray.ARRAY_CLEAR_PHONE_ICON[1]);
		mapFR = Collections.unmodifiableMap(bMap);
		cMap.put(INVESTING_ACCOUNTS, StringArray.ARRAY_INVESTING_ACCOUNTS[2]);
		cMap.put(MOBILE_PAYMENT, StringArray.ARRAY_MOBILE_PAYMENT[2]);
		cMap.put(PRIVACY_SECURITY_LEGAL, StringArray.ARRAY_PRIVACY_SECURITY_LEGAL[2]);
		cMap.put(SEND_FEEDBACK, StringArray.ARRAY_CUSTOMER_FEEDBACK[2]);
		cMap.put(FORGOT_PASSWORD, StringArray.ARRAY_FORGOT_PASSWORD[2]);
		cMap.put(ALLOW_CONTACTS_ACCESS_HEADER, StringArray.ARRAY_ALLOW_CONTACTS_ACCESS_HEADER[2]);
		cMap.put(ALLOW_CONTACTS_ACCCESS_BODY, StringArray.ARRAY_ALLOW_CONTACTS_ACCCESS_BODY[2]);
		cMap.put(ALLOW_CONTACTS_OK, StringArray.ARRAY_ALLOW_CONTACTS_OK[2]);
		cMap.put(ALLOW_CONTACTS_REFUSE, StringArray.ARRAY_ALLOW_CONTACTS_REFUSE[2]);
		cMap.put(FM_TO_ACCOUNT, StringArray.ARRAY_MF_TO_ACCOUNT[2]);
		cMap.put(FM_FROM_ACCOUNT, StringArray.ARRAY_MF_FROM_ACCOUNT[2]);
		cMap.put(FM_EMAIL, StringArray.ARRAY_MF_EMAIL[2]);
		cMap.put(FM_PHONE, StringArray.ARRAY_MF_PHONE[2]);
		cMap.put(MF_ACCEPTED_FUND_DETAIL, StringArray.ARRAY_MF_ACCEPTED_FUND_DETAIL_FEE[2]);
		cMap.put(PROFILE_AND_PREFERENCE, StringArray.ARRAY_PROFILE_AND_PREFERENCE[2]);
		cMap.put(PREFERENCE_QUICK_ACCESS_SETTINGS, StringArray.ARRAY_QUICK_ACCESS_SETTINGS[2]);
		cMap.put(PREFERENCE_QUICK_ACCESS_SWITCH_AND, StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND[2]);
		cMap.put(CONTACT_INFORMATION, StringArray.ARRAY_MF_CONTACT_INFO[2]);
		cMap.put(HOME_PHONE, StringArray.ARRAY_HOME_PHONE[2]);
		cMap.put(WORK_PHONE, StringArray.ARRAY_WORK_PHONE[2]);
		cMap.put(MOBILE_PHONE, StringArray.ARRAY_MOBILE_PHONE[2]);
		cMap.put(BUSINESS_PHONE, StringArray.ARRAY_BUSINESS_PHONE[2]);
		cMap.put(FAX_NUMBER, StringArray.ARRAY_FAX_NUMBER[2]);
		cMap.put(EXTENSION_NUMBER, StringArray.ARRAY_EXTENSION_NUMBER[2]);
		cMap.put(SAVE_BUTTON, StringArray.ARRAY_SAVE_BUTTON[2]);
		cMap.put(CLEAR_PHONE_ICON, StringArray.ARRAY_CLEAR_PHONE_ICON[2]);
		mapZHHANS = Collections.unmodifiableMap(cMap);
		dMap.put(INVESTING_ACCOUNTS, StringArray.ARRAY_INVESTING_ACCOUNTS[3]);
		dMap.put(MOBILE_PAYMENT,StringArray.ARRAY_MOBILE_PAYMENT[3] );
		dMap.put(PRIVACY_SECURITY_LEGAL, StringArray.ARRAY_PRIVACY_SECURITY_LEGAL[3]);
		dMap.put(SEND_FEEDBACK, StringArray.ARRAY_CUSTOMER_FEEDBACK[3]);
		dMap.put(FORGOT_PASSWORD, StringArray.ARRAY_FORGOT_PASSWORD[3]);
		dMap.put(ALLOW_CONTACTS_ACCESS_HEADER, StringArray.ARRAY_ALLOW_CONTACTS_ACCESS_HEADER[3]);
		dMap.put(ALLOW_CONTACTS_ACCCESS_BODY, StringArray.ARRAY_ALLOW_CONTACTS_ACCCESS_BODY[3]);
		dMap.put(ALLOW_CONTACTS_OK, StringArray.ARRAY_ALLOW_CONTACTS_OK[3]);
		dMap.put(ALLOW_CONTACTS_REFUSE, StringArray.ARRAY_ALLOW_CONTACTS_REFUSE[3]);
		dMap.put(FM_TO_ACCOUNT, StringArray.ARRAY_MF_TO_ACCOUNT[3]);
		dMap.put(FM_FROM_ACCOUNT, StringArray.ARRAY_MF_FROM_ACCOUNT[3]);
		dMap.put(FM_EMAIL, StringArray.ARRAY_MF_EMAIL[3]);
		dMap.put(FM_PHONE, StringArray.ARRAY_MF_PHONE[3]);
		dMap.put(MF_ACCEPTED_FUND_DETAIL, StringArray.ARRAY_MF_ACCEPTED_FUND_DETAIL_FEE[3]);
		dMap.put(PROFILE_AND_PREFERENCE, StringArray.ARRAY_PROFILE_AND_PREFERENCE[3]);
		dMap.put(PREFERENCE_QUICK_ACCESS_SETTINGS, StringArray.ARRAY_QUICK_ACCESS_SETTINGS[3]);
		dMap.put(PREFERENCE_QUICK_ACCESS_SWITCH_AND, StringArray.ARRAY_QUICK_ACCESS_SWITCH_AND[3]);
		dMap.put(CONTACT_INFORMATION, StringArray.ARRAY_MF_CONTACT_INFO[3]);
		dMap.put(HOME_PHONE, StringArray.ARRAY_HOME_PHONE[3]);
		dMap.put(WORK_PHONE, StringArray.ARRAY_WORK_PHONE[3]);
		dMap.put(MOBILE_PHONE, StringArray.ARRAY_MOBILE_PHONE[3]);
		dMap.put(BUSINESS_PHONE, StringArray.ARRAY_BUSINESS_PHONE[3]);
		dMap.put(FAX_NUMBER, StringArray.ARRAY_FAX_NUMBER[3]);
		dMap.put(EXTENSION_NUMBER, StringArray.ARRAY_EXTENSION_NUMBER[3]);
		dMap.put(SAVE_BUTTON, StringArray.ARRAY_SAVE_BUTTON[3]);
		dMap.put(CLEAR_PHONE_ICON, StringArray.ARRAY_CLEAR_PHONE_ICON[3]);
		mapZHHANT = Collections.unmodifiableMap(dMap);
	}

	public static String lookupString(final String locale, final String key) {
		String s = null;
		switch (locale) {
		case "EN":
		case "en":
			s = mapEN.get(key);
			break;
		case "FR":
		case "fr":
			s = mapFR.get(key);
			break;
		case "zh":
		case "zh-Hans":
			s = mapZHHANS.get(key);
			break;
		case "zh-rHK":
		case "zh-rTW":
		case "zh-Hant":
			s = mapZHHANT.get(key);
			break;
		}
		return s;
	}
}
