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
		aMap.put(INVESTING_ACCOUNTS, "Investing Accounts");
		aMap.put(MOBILE_PAYMENT, "TD Mobile Payment");
		aMap.put(PRIVACY_SECURITY_LEGAL, "Privacy, Security & Legal");
		aMap.put(SEND_FEEDBACK, "Give Feedback");
		aMap.put(FORGOT_PASSWORD, "Forgot password?");
		aMap.put(ALLOW_CONTACTS_OK, "OK");
		aMap.put(ALLOW_CONTACTS_REFUSE, "Cancel");
		aMap.put(OTP_CHALLENGE_UNABLE_TO_VERIFY_CODE, EnglishStrings.OTP_CHALLENGE_UNABLE_TO_VERIFY_CODE);
		aMap.put(OTP_CHALLENGE_TOO_MANY_SECURITY_CODES_REQUESTED,
				EnglishStrings.OTP_CHALLENGE_TOO_MANY_SECURITY_CODES_REQUESTED);
		mapEN = Collections.unmodifiableMap(aMap);
		bMap.put(INVESTING_ACCOUNTS, "Comptes Placements directs TD");
		bMap.put(MOBILE_PAYMENT, "Paiement mobile TD");
		bMap.put(PRIVACY_SECURITY_LEGAL, "Confidentialité, sécurité et avis juridique");
		bMap.put(SEND_FEEDBACK, "Fournir des commentaires");
		bMap.put(FORGOT_PASSWORD, "Mot de passe oublié?");
		bMap.put(ALLOW_CONTACTS_OK, "Oui");
		bMap.put(ALLOW_CONTACTS_REFUSE, "Non");

		mapFR = Collections.unmodifiableMap(bMap);
		cMap.put(INVESTING_ACCOUNTS, "投资账户");
		cMap.put(MOBILE_PAYMENT, "道明移动支付");
		cMap.put(PRIVACY_SECURITY_LEGAL, "隐私、安全与法律声明");
		cMap.put(SEND_FEEDBACK, "发送意见回馈");
		cMap.put(FORGOT_PASSWORD, "忘记密码？");
		cMap.put(ALLOW_CONTACTS_ACCESS_HEADER, "“TD Canada”想访问您的通讯录");
		cMap.put(ALLOW_CONTACTS_ACCCESS_BODY, "用于读取联系人信息以添加 Interac 电子转账收款人，以及添加道明服务代表为联系人。");
		cMap.put(ALLOW_CONTACTS_OK, "好");
		cMap.put(ALLOW_CONTACTS_REFUSE, "不允许");
		mapZHHANS = Collections.unmodifiableMap(cMap);
		dMap.put(INVESTING_ACCOUNTS, "投資賬戶");
		dMap.put(MOBILE_PAYMENT, "道明移動支付");
		dMap.put(PRIVACY_SECURITY_LEGAL, "私隱、安全和法律聲明");
		dMap.put(SEND_FEEDBACK, "發送意見");
		dMap.put(FORGOT_PASSWORD, "忘記密碼？");
		dMap.put(ALLOW_CONTACTS_ACCESS_HEADER, "“TD Canada”想訪問您的通訊錄");
		dMap.put(ALLOW_CONTACTS_ACCCESS_BODY, "用於讀取聯繫人信息以添加 Interac 電子轉賬收款人，以及添加道明服務代表為聯繫人。");
		dMap.put(ALLOW_CONTACTS_OK, "好");
		dMap.put(ALLOW_CONTACTS_REFUSE, "不允許");
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
