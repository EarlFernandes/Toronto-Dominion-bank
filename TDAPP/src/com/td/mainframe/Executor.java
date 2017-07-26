package com.td.mainframe;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td.MainScreen;
import com.td._CommonPage;

/**
 * 
 * @author Ashraf Mulla
 * 
 *         This class contains methods to create Personal, Business,
 *         Multiprofile connect IDs followed by 'loginEasyWeb' method to reset
 *         the passsword.
 * 
 *         Methods: selector,createPersonalProfile,createBusinessProfile,
 *         createMultiProfile,loginEasyWeb.
 */

public class Executor extends _CommonPage {

	private static Executor Executor;

	public synchronized static Executor get() {
		if (Executor == null) {
			Executor = new Executor();
		}
		return Executor;
	}

	WebDriver driver;
	HostEvents sr;

	/**************************************************************************************************************/

	public String AccountType = getTestdata("ProfileType");
	public String profileName = getTestdata("ProfileName");
	public String accountHolderName;
	public String shortName = getTestdata("ShortName");
	public String firstName = getTestdata("FirstName");
	public String sirname = getTestdata("Sirname");
	public String title = getTestdata("Title");

	public String webStartPath = getTestdata("HostPath");
	public String username = getTestdata("HostUserName");
	public String password = getTestdata("HostPassword");
	public String groupUser = getTestdata("GroupUser");
	public String groupPassword = getTestdata("GroupPassword");
	public String testSet = getTestdata("TestSet");
	public String IMSTX = "tc" + testSet + "0003";

	/*********************
	 * for MultiProfileOnly
	 **********************************************************************/

	public String PersonalAccountACS = getTestdata("PersonalAccountACS");
	public String PersonalAccountName = getTestdata("PersonalAccountName");
	public String BusinessAccountACSFirst = getTestdata("BusinessAccountACSFirst");
	public String BusinessFirstName = getTestdata("BusinessFirstName");
	public String BusinessAccountACSSecond = getTestdata("BusinessAccountACSSecond");
	public String BusinessSecondName = getTestdata("BusinessSecondName");
	public String MultiGroupUser = getTestdata("MultiGroupUser");
	public String businessEmailID = getTestdata("BusinessEmailID");

	/**************************************************************************************************************/

	public static String acsNo = null;
	public String easyWebTempPass = null;
	public String branchNo = null;
	public String accountNo = null;
	public String screenText = null;
	public String multiConnectID = null;

	String[] data = new String[5];
	static String strFilePath = "ConnectIDs.csv";

	public Executor() {

		try {
			sr = new HostEvents();
		} catch (AWTException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will create a personal profile.
	 * 
	 * @throws InterruptedException
	 */
	public void createPersonalProfile() {

		acsNo = null;
		easyWebTempPass = null;
		branchNo = null;
		accountNo = null;

		try {

			accountHolderName = "test*" + profileName + "*";

			System.out.println("Creating personal profile");

			sr.openSession(webStartPath);
			Thread.sleep(8000);
			sr.hitTab(1);
			sr.hitEnter();
			Thread.sleep(4000);
			sr.sendKeys(username);
			sr.hitTab(1);
			sr.sendKeys(password);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** Multiple Application Interface Selection Menu ******/

			sr.hitTab(2);
			sr.sendKeys("S");
			sr.hitEnter();

			/*****
			 * T O R O N T O D O M I N I O N B A N K B A N Q U E T O R O N T O D
			 * O M I N I O N
			 ******/

			sr.sendKeys(groupUser);
			sr.hitTab(1);
			sr.sendKeys(groupPassword);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** blank screen ******/

			sr.sendKeys("/for tstmai");
			sr.hitEnter();

			/***** MAI LINK TRANSACTION ******/

			sr.sendKeys(testSet);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** Blank screen ******/

			sr.sendKeys("/test mfs");
			sr.hitEnter();
			sr.sendKeys("/for moc001aa");
			sr.hitEnter();

			/***** APPL_TRAN_SCREEN ******/

			sr.hitTab(4);
			sr.sendKeys(IMSTX);
			sr.hitTab(1);
			sr.sendKeys("CPA");
			sr.hitTab(1);
			sr.sendKeys("OPEN");
			sr.hitEnter();

			/***** CPA ACCOUNT OPEN ******/

			sr.sendKeys("12");
			sr.hitTab(1);
			sr.sendKeys("00");
			sr.hitTab(2);
			sr.sendKeys("n");
			sr.hitTab(3);
			sr.sendKeys("99");
			sr.hitTab(1);
			sr.sendKeys("other");
			sr.hitTab(4);
			sr.sendKeys(accountHolderName);
			sr.hitEnter();
			Thread.sleep(2000);

			/***** MAINTAIN CUSTOMER INFORMATION ******/

			sr.sendKeys("mr");
			sr.hitRightKey(2);
			sr.hitDelete(6);
			sr.hitTab(6);
			sr.sendKeys("56 Wellington st");
			sr.hitTab(1);
			sr.sendKeys("Toronto");
			sr.hitTab(1);
			sr.sendKeys("on");
			sr.hitTab(1);
			sr.sendKeys("m5k1A2");
			sr.hitTab(1);
			sr.sendKeys("can");
			sr.hitTab(2);
			sr.sendKeys("254");
			sr.hitTab(1);
			sr.sendKeys("123");
			sr.hitTab(1);
			sr.sendKeys("6258");
			sr.hitEnter();
			Thread.sleep(1000);

			/***** ACCOUNT OPEN - CUSTOMER LIST ******/

			sr.hitF9();
			Thread.sleep(1000);

			/***** MAINTAIN CUSTOMER INFORMATION ******/

			sr.sendKeys("Y");
			sr.hitEnter();
			Thread.sleep(1000);

			/***** MAINTAIN EMPLOYMENT INFORMATION ******/

			sr.sendKeys("U");
			sr.hitTab(1);
			sr.sendKeys("mar/1991");
			sr.hitEnter();
			Thread.sleep(1000);

			/***** MAINTAIN OTHER CUSTOMER INFORMATION ******/

			sr.sendKeys("mar181993");
			sr.hitTab(1);
			sr.sendKeys("111111118");
			sr.hitRightKey(9);
			sr.hitDelete(2);
			sr.hitEnter();
			Thread.sleep(1000);

			/***** MAINTAIN CUSTOMER IDENTIFICATION ******/

			sr.sendKeys("PND");
			sr.hitEnter();
			Thread.sleep(1000);

			/***** ACCOUNT OPEN - DETAIL ******/

			sr.hitF9();
			Thread.sleep(1000);

			/***** CPA ACCOUNT MAINTENANCE OPTIONS/FEATURES ******/

			sr.hitTab(9);
			sr.sendKeys("cp1");
			sr.hitTab(1);
			sr.sendKeys("etot");
			sr.hitEnter();
			Thread.sleep(1000);

			/***** TOTAL ACCOUNTS ENQUIRY ******/

			sr.hitTab(3);
			sr.sendKeys("cp1");
			sr.hitTab(1);
			sr.sendKeys("Open");
			sr.hitEnter();
			Thread.sleep(1000);

			/***** ACCOUNT OPEN - CUSTOMER LIST ******/

			sr.sendKeys("A");
			sr.hitTab(3);
			sr.sendKeys("ACS");
			sr.hitTab(2);
			sr.sendKeys("A");
			sr.hitF9();
			Thread.sleep(1000);

			/***** MAINTAIN CUSTOMER INFORMATION ******/

			sr.hitTab(1);
			sr.sendKeys("Y");
			sr.hitEnter();
			Thread.sleep(1000);

			/***** MAINTAIN CUSTOMER IDENTIFICATION ******/

			sr.hitTab(9);
			sr.sendKeys("PND");
			sr.hitEnter();
			Thread.sleep(1000);

			/***** ACCOUNT OPEN - DETAIL ******/

			sr.hitF9();
			Thread.sleep(1000);

			/***** CUSTOMER ACCESS REGISTRATION ******/

			sr.hitTab(3);
			sr.sendKeys("Y");
			sr.hitTab(1);
			sr.sendKeys("Y");
			sr.hitTab(1);
			sr.sendKeys("Y");
			sr.hitTab(4);
			sr.sendKeys("Y");
			sr.hitF9();
			Thread.sleep(1000);

			/***** MAINTAIN PROFILE - ACCESS CARD SYSTEM ******/

			sr.hitF9();
			Thread.sleep(1000);

			/***** MAINTAIN ACCOUNTS - ACCESS CARD SYSTEM ******/

			sr.hitTab(3);
			sr.sendKeys("S");
			sr.hitEnter();
			Thread.sleep(1000);

			/***** MAINTAIN ACCOUNTS - ACCESS CARD SYSTEM ******/

			sr.hitF9();
			Thread.sleep(1000);

			/***** CUSTOMER ACCESS REGISTRATION ******/

			screenText = sr.copyScreen();
			acsNo = screenText.substring(34, 53);
			easyWebTempPass = screenText.substring(1504, 1510);

			System.out.println("ACS No: " + acsNo);
			System.out.println("Easyweb Password: " + easyWebTempPass);

			sr.hitTab(4);
			sr.sendKeys("cp1");
			sr.hitTab(1);
			sr.sendKeys("etot");
			sr.hitEnter();
			Thread.sleep(2000);

			/***** TOTAL ACCOUNTS ENQUIRY ******/

			screenText = sr.copyScreen();
			accountNo = screenText.substring(749, 756);
			branchNo = screenText.substring(88, 92);

			System.out.println("Account No: " + accountNo);
			System.out.println("Branch No: " + branchNo);

			sr.hitF12();
			sr.closeApplication();
			sr.closeApplication();
			acsNo = acsNo.replaceAll("\\s", "");
			easyWebTempPass = easyWebTempPass.replaceAll("\\s", "");

			try {
				loginEasyWeb(acsNo, easyWebTempPass);
			} catch (Exception e) {
				System.err.println("Exception in EasyWeb: " + e.toString());
			}

			data[0] = AccountType;
			data[1] = Executor.acsNo;
			data[2] = Executor.accountNo;
			data[3] = Executor.branchNo;
			data[4] = accountHolderName;

			CsvWriter.CsvWrite(data, strFilePath);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will create a business profile.
	 * 
	 * @throws InterruptedException
	 */
	public void createBusinessProfile() {

		acsNo = null;
		easyWebTempPass = null;
		branchNo = null;
		accountNo = null;

		try {

			accountHolderName = profileName + " inc";

			System.out.println("Creating Business profile");

			sr.openSession(webStartPath);
			Thread.sleep(8000);
			sr.hitTab(1);
			sr.hitEnter();
			Thread.sleep(4000);
			sr.sendKeys(username);
			sr.hitTab(1);
			sr.sendKeys(password);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** Multiple Application Interface Selection Menu ******/

			sr.hitTab(2);
			sr.sendKeys("S");
			sr.hitEnter();

			/*****
			 * T O R O N T O D O M I N I O N B A N K B A N Q U E T O R O N T O D
			 * O M I N I O N
			 ******/

			sr.sendKeys(groupUser);
			sr.hitTab(1);
			sr.sendKeys(groupPassword);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** blank screen ******/

			sr.sendKeys("/for tstmai");
			sr.hitEnter();

			/***** MAI LINK TRANSACTION ******/

			sr.sendKeys(testSet);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** Blank screen ******/

			sr.sendKeys("/test mfs");
			sr.hitEnter();
			sr.sendKeys("/for moc001aa");
			sr.hitEnter();

			/***** APPL_TRAN_SCREEN ******/

			sr.hitTab(4);
			sr.sendKeys(IMSTX);
			sr.hitTab(1);
			sr.sendKeys("CPA");
			sr.hitTab(1);
			sr.sendKeys("OPEN");
			sr.hitEnter();

			/***** CPA ACCOUNT OPEN ******/

			sr.sendKeys("32");
			sr.hitTab(1);
			sr.sendKeys("10");
			sr.hitTab(2);
			sr.sendKeys("n");
			sr.hitTab(3);
			sr.sendKeys("99");
			sr.hitTab(1);
			sr.sendKeys("other");
			sr.hitTab(4);
			sr.sendKeys(accountHolderName);
			sr.hitEnter();
			Thread.sleep(4000);

			sr.hitLeftKey();
			sr.hitRightKey(1);

			if (sr.isTextPresent("EXACT MATCH")) {
				sr.sendKeys("0");
				sr.hitEnter();
			}

			/***** MAINTAIN CUSTOMER INFORMATION ******/

			sr.hitTab(6);
			sr.sendKeys("56 wellington st");
			sr.hitTab(1);
			sr.sendKeys("toronto");
			sr.hitTab(1);
			sr.sendKeys("on");
			sr.hitTab(1);
			sr.sendKeys("m5k1a2");
			sr.hitTab(1);
			sr.sendKeys("can");
			sr.hitTab(1);
			sr.sendKeys("516");
			sr.hitTab(1);
			sr.sendKeys("918");
			sr.hitTab(1);
			sr.sendKeys("4256");
			sr.hitTab(2);
			sr.sendKeys("425");
			sr.hitTab(1);
			sr.sendKeys("846");
			sr.hitTab(1);
			sr.sendKeys("1256");
			sr.hitEnter();

			/***** ACCOUNT OPEN - CUSTOMER LIST ******/

			screenText = null;
			screenText = sr.copyScreen();
			accountNo = screenText.substring(1569, 1577);
			branchNo = screenText.substring(88, 92);
			accountNo = accountNo.replaceAll("\\s", "");
			branchNo = branchNo.replaceAll("\\s", "");

			System.out.println("Account No: " + accountNo);
			System.out.println("Branch No: " + branchNo);

			sr.hitF9();

			/***** MAINTAIN OTHER CUSTOMER INFORMATION ******/

			sr.hitUpKey();
			sr.hitUpKey();
			sr.hitRightKey(8);
			sr.sendKeys("500");
			sr.hitTab(1);
			sr.sendKeys("9999");
			sr.hitTab(1);
			sr.sendKeys("P");
			sr.hitTab(1);
			sr.sendKeys("CR");
			sr.hitTab(1);
			sr.sendKeys("11111111111118");
			sr.hitTab(1);
			sr.sendKeys("ON");
			sr.hitTab(1);
			sr.sendKeys("CAN");
			sr.hitTab(1);
			sr.sendKeys("111111118");
			sr.hitTab(5);
			sr.sendKeys("M$B");
			sr.hitTab(4);
			sr.sendKeys("NO");
			sr.hitEnter();

			/***** ACCOUNT OPEN - DETAIL ******/

			sr.hitTab(5);
			sr.sendKeys(accountHolderName);
			sr.hitEnter();

			/***** ACCOUNT OPEN - DETAIL ******/

			sr.hitF9();

			/***** CPA ACCOUNT MAINTENANCE OPTIONS/FEATURES ******/

			sr.hitTab(22);
			sr.sendKeys("cpa");
			sr.hitTab(1);
			sr.sendKeys("menuc");
			sr.hitEnter();

			/***** COMMERCIAL PERSONAL ACCOUNTING CONDITIONS MENU ******/

			sr.sendKeys("4F");
			sr.hitTab(1);
			sr.sendKeys(accountNo);
			sr.hitTab(1);
			sr.sendKeys(branchNo);
			sr.hitEnter();

			/***** CPA ACCOUNT CONDITIONS ENQUIRY ******/

			sr.hitTab(5);
			sr.sendKeys("menup");
			sr.hitEnter();

			/***** COMMERCIAL PERSONAL ACCOUNTING COMPLIANCE MENU ******/

			sr.sendKeys("1");
			sr.hitTab(1);
			sr.sendKeys(accountNo);
			sr.hitTab(1);
			sr.sendKeys(branchNo);
			sr.hitEnter();

			/***** ACCOUNT COMPLIANCE VERIFICATION AND MAINTENANCE ******/

			sr.hitF10();
			sr.sendKeys("tstgrp2");
			sr.hitTab(1);
			sr.sendKeys("tstgroup");
			sr.hitF9();

			/***** ACCOUNT COMPLIANCE VERIFICATION AND MAINTENANCE ******/

			Thread.sleep(2000);
			screenText = sr.copyScreen();
			System.out.println("Freeze Release status: " + screenText.substring(1702, 1730));

			sr.sendKeys("cpa");
			sr.hitTab(1);
			sr.sendKeys("menuc");
			sr.hitEnter();

			/***** COMMERCIAL PERSONAL ACCOUNTING CONDITIONS MENU ******/

			sr.sendKeys("4f");
			sr.hitTab(1);
			sr.sendKeys(accountNo);
			sr.hitTab(1);
			sr.sendKeys(branchNo);
			sr.hitEnter();

			/***** CPA ACCOUNT CONDITIONS ENQUIRY ******/

			sr.hitF12();

			/***** Multiple Application Interface Selection Menu ******/

			sr.hitTab(2);
			sr.sendKeys("S");
			sr.hitEnter();

			/*****
			 * T O R O N T O D O M I N I O N B A N K B A N Q U E T O R O N T O D
			 * O M I N I O N
			 ******/

			sr.sendKeys(groupUser);
			sr.hitTab(1);
			sr.sendKeys(groupPassword);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** blank screen ******/

			sr.sendKeys("/for tstmai");
			sr.hitEnter();

			/***** MAI LINK TRANSACTION ******/

			sr.sendKeys(testSet);
			sr.hitDownKey(5);
			sr.sendKeys("TCPA7770");
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** Blank screen ******/

			sr.sendKeys("/test mfs");
			sr.hitEnter();
			sr.sendKeys("/for moc001aa");
			sr.hitEnter();

			/***** APPL_TRAN_SCREEN ******/

			sr.hitTab(4);
			sr.sendKeys(IMSTX);
			sr.hitTab(1);
			sr.sendKeys("CIF");
			sr.hitTab(1);
			sr.sendKeys("ETOT");
			sr.hitEnter();

			/***** DETAILED ACCOUNT ENQUIRY ******/

			sr.sendKeys("CDA " + accountNo);
			sr.hitEnter();

			/***** ACCOUNT INFORMATION CORRECTION ******/

			sr.sendKeys("1020");
			sr.hitEnter();

			/***** TOTAL ACCOUNTS ENQUIRY ******/

			sr.hitTab(4);
			sr.sendKeys("OPEN");
			sr.hitEnter();

			/***** ACCOUNT OPEN - CUSTOMER LIST ******/

			Thread.sleep(2000);
			sr.sendKeys("A");
			sr.hitTab(3);
			sr.sendKeys("ACS");
			sr.hitTab(2);
			sr.sendKeys("A");
			sr.hitF9();

			/***** ACCOUNT OPEN - DETAIL ******/

			sr.hitTab(5);
			sr.sendKeys(shortName);
			sr.hitF9();

			/***** CUSTOMER ACCESS REGISTRATION ******/

			sr.hitTab(7);
			sr.sendKeys("Y");
			sr.hitTab(1);
			sr.sendKeys("Y");
			sr.hitTab(1);
			sr.sendKeys("Y");
			sr.hitTab(4);
			sr.sendKeys("Y");
			sr.hitF9();

			/***** CUSTOMER ACCESS REGISTRATION ******/

			sr.sendKeys(firstName);
			sr.hitTab(1);
			sr.sendKeys(sirname);
			sr.hitTab(1);
			sr.sendKeys(title);
			sr.hitEnter();
			sr.hitF9();

			/***** MAINTAIN PROFILE - ACCESS CARD SYSTEM ******/
			// Test
			sr.hitTab(5);
			sr.sendKeys("Y");
			sr.hitEnter();
			sr.sendKeys(title);
			sr.hitEnter();
			sr.hitF9();

			/**** MAINTAIN ACCOUNTS - ACCESS CARD SYSTEM *******/

			sr.hitTab(3);
			sr.sendKeys("c");
			sr.hitEnter();
			sr.hitF9();

			/***** CUSTOMER ACCESS REGISTRATION ******/

			Thread.sleep(2000);
			screenText = sr.copyScreen();
			acsNo = screenText.substring(34, 53);
			easyWebTempPass = screenText.substring(1504, 1510);

			System.out.println("ACS No: " + acsNo);
			System.out.println("Easyweb Password: " + easyWebTempPass);

			sr.hitF12();

			/***** Multiple Application Interface Selection Menu ******/

			sr.hitTab(2);
			sr.sendKeys("S");
			sr.hitEnter();

			/*****
			 * T O R O N T O D O M I N I O N B A N K B A N Q U E T O R O N T O D
			 * O M I N I O N
			 ******/

			sr.sendKeys(groupUser);
			sr.hitTab(1);
			sr.sendKeys(groupPassword);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** blank screen ******/

			sr.sendKeys("/for tstmai");
			sr.hitEnter();

			/***** MAI LINK TRANSACTION ******/

			sr.sendKeys(testSet);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** Blank screen ******/

			sr.sendKeys("/test mfs");
			sr.hitEnter();
			sr.sendKeys("/for moc001aa");
			sr.hitEnter();

			/***** APPL_TRAN_SCREEN ******/

			sr.hitTab(4);
			sr.sendKeys(IMSTX);
			sr.hitTab(1);
			sr.sendKeys("CIF");
			sr.hitTab(1);
			sr.sendKeys("MCPL");
			sr.hitEnter();

			/***** MAINTAIN CUSTOMER COMPLIANCE ****/

			sr.sendKeys("CDA " + accountNo);
			sr.hitEnter();

			/**** ACCOUNT INFORMATION CORRECTION ****/

			sr.sendKeys("1020");
			sr.hitEnter();

			/**** MAINTAIN CUSTOMER COMPLIANCE AUTOUSERBIZC INC ****/

			sr.sendKeys(shortName);
			sr.hitTab(1);
			sr.sendKeys(shortName);
			sr.hitEnter();
			sr.hitF12();

			sr.closeApplication();
			sr.closeApplication();

			acsNo = acsNo.replaceAll("\\s", "");
			easyWebTempPass = easyWebTempPass.replaceAll("\\s", "");

			try {
				loginEasyWeb(acsNo, easyWebTempPass);
			} catch (Exception e) {
				System.err.println("Exception in EasyWeb: " + e.toString());
			}

			data[0] = AccountType;
			data[1] = Executor.acsNo;
			data[2] = Executor.accountNo;
			data[3] = Executor.branchNo;
			data[4] = accountHolderName;

			CsvWriter.CsvWrite(data, strFilePath);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will create a multi profile.
	 * 
	 * @throws InterruptedException
	 */
	public void createMultiProfile() {

		acsNo = null;
		easyWebTempPass = null;
		branchNo = null;
		accountNo = null;

		try {

			accountHolderName = "test*" + profileName + "*";

			System.out.println("Creating Multi profile");

			sr.openSession(webStartPath);
			Thread.sleep(8000);
			sr.hitTab(1);
			sr.hitEnter();
			Thread.sleep(4000);
			sr.sendKeys(username);
			sr.hitTab(1);
			sr.sendKeys(password);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** Multiple Application Interface Selection Menu ******/

			sr.hitTab(2);
			sr.sendKeys("S");
			sr.hitEnter();

			/*****
			 * T O R O N T O D O M I N I O N B A N K B A N Q U E T O R O N T O D
			 * O M I N I O N
			 ******/

			sr.sendKeys(groupUser);
			sr.hitTab(1);
			sr.sendKeys(groupPassword);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** blank screen ******/

			sr.sendKeys("/for tstmai");
			sr.hitEnter();

			/***** MAI LINK TRANSACTION ******/

			sr.sendKeys(testSet);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** Blank screen ******/

			sr.sendKeys("/test mfs");
			sr.hitEnter();
			sr.sendKeys("/for moc001aa");
			sr.hitEnter();

			/***** APPL_TRAN_SCREEN ******/

			sr.hitTab(4);
			sr.sendKeys(IMSTX);
			sr.hitTab(1);
			sr.sendKeys("acs");
			sr.hitTab(1);
			sr.sendKeys("eacs");
			sr.hitTab(1);
			sr.sendKeys("ACS " + PersonalAccountACS);
			sr.hitEnter();

			/***** ENQUIRE - ACCESS CARD SYSTEM ******/

			sr.hitTab(1);
			sr.sendKeys("ACS " + BusinessAccountACSFirst);
			sr.hitEnter();
			sr.sendKeys("MPRO");
			sr.hitEnter();

			/***** MAINTAIN PROFILE - ACCESS CARD SYSTEM ******/

			sr.hitTab(3);
			sr.sendKeys(PersonalAccountName);
			sr.hitEnter();
			sr.hitF9();
			sr.sendKeys("cars");
			sr.hitEnter();

			/***** CUSTOMER ACCESS REGISTRATION ******/

			sr.hitTab(13);
			sr.sendKeys("N");
			sr.hitF9();

			/***** CUSTOMER ACCESS REGISTRATION ******/

			sr.hitTab(4);
			sr.sendKeys("CIF");
			sr.hitTab(1);
			sr.sendKeys("ETOT");
			sr.hitEnter();

			/***** TOTAL ACCOUNTS ENQUIRY ******/

			sr.hitTab(3);
			sr.sendKeys("CIF");
			sr.hitTab(1);
			sr.sendKeys("CREL");
			sr.hitEnter();

			/***** CREATE CUSTOMER RELATIONSHIPS ******/

			sr.sendKeys("mr " + accountHolderName);
			sr.hitEnter();

			/***** CUSTOMER SELECTION ******/

			sr.sendKeys("1");
			sr.hitEnter();

			/***** CREATE CUSTOMER RELATIONSHIPS ******/

			sr.hitTab(1);
			sr.sendKeys("10");
			sr.hitF9();

			/***** CREATE CUSTOMER RELATIONSHIPS ******/

			sr.hitTab(5);
			sr.sendKeys("CP1");
			sr.hitTab(1);
			sr.sendKeys("EREl");
			sr.hitEnter();
			sr.hitF12();

			/***** Multiple Application Interface Selection Menu ******/

			sr.hitTab(2);
			sr.sendKeys("S");
			sr.hitEnter();

			/*****
			 * T O R O N T O D O M I N I O N B A N K B A N Q U E T O R O N T O D
			 * O M I N I O N
			 ******/

			sr.sendKeys(MultiGroupUser);
			sr.hitTab(1);
			sr.sendKeys(MultiGroupUser);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** blank screen ******/

			sr.sendKeys("/for tstmai");
			sr.hitEnter();

			/***** MAI LINK TRANSACTION ******/

			sr.sendKeys(testSet);
			sr.hitTab(1);
			sr.sendKeys("M5600393");
			sr.hitEnter();
			sr.hitPauseBreak();

			sr.sendKeys("/test mfs");
			sr.hitEnter();
			sr.sendKeys("uyp1d00");
			sr.hitEnter();

			/***** TD ACCESS ADMINISTRATION MENU ******/

			sr.sendKeys("1");
			sr.hitEnter();
			sr.sendKeys("5");
			sr.hitEnter();

			sr.sendKeys(PersonalAccountACS);
			sr.hitEnter();
			sr.sendKeys("c");
			sr.hitEnter();

			/***** WEB BANKING UPDATE CLIENT SERVICES ******/

			sr.hitTab(1);
			sr.sendKeys("S");
			sr.hitEnter();

			sr.sendKeys(BusinessAccountACSFirst);
			sr.hitEnter();

			sr.hitTab(18);
			sr.sendKeys(BusinessFirstName);
			sr.hitTab(16);
			sr.sendKeys(businessEmailID);

			sr.hitF9();

			screenText = sr.copyScreen();
			multiConnectID = screenText.substring(1507, 1515);
			System.out.println("Connect ID: " + multiConnectID);
			sr.hitF12();

			/*********************
			 * Adding second Business ID
			 ********************************/

			/***** Multiple Application Interface Selection Menu ******/

			sr.hitTab(2);
			sr.sendKeys("S");
			sr.hitEnter();

			/*****
			 * T O R O N T O D O M I N I O N B A N K B A N Q U E T O R O N T O D
			 * O M I N I O N
			 ******/

			sr.sendKeys(groupUser);
			sr.hitTab(1);
			sr.sendKeys(groupPassword);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** blank screen ******/

			sr.sendKeys("/for tstmai");
			sr.hitEnter();

			/***** MAI LINK TRANSACTION ******/

			sr.sendKeys(testSet);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** Blank screen ******/

			sr.sendKeys("/test mfs");
			sr.hitEnter();
			sr.sendKeys("/for moc001aa");
			sr.hitEnter();

			/***** APPL_TRAN_SCREEN ******/

			sr.hitTab(4);
			sr.sendKeys(IMSTX);
			sr.hitTab(1);
			sr.sendKeys("acs");
			sr.hitTab(1);
			sr.sendKeys("eacs");
			sr.hitTab(1);
			sr.sendKeys("ACS " + PersonalAccountACS);
			sr.hitEnter();

			/***** ENQUIRE - ACCESS CARD SYSTEM ******/

			sr.hitTab(1);
			sr.sendKeys("ACS " + BusinessAccountACSSecond);
			sr.hitEnter();
			sr.sendKeys("MPRO");
			sr.hitEnter();

			/***** MAINTAIN PROFILE - ACCESS CARD SYSTEM ******/

			sr.hitTab(3);
			sr.sendKeys(PersonalAccountName);
			sr.hitEnter();
			sr.hitF9();
			sr.sendKeys("cars");
			sr.hitEnter();

			/***** CUSTOMER ACCESS REGISTRATION ******/

			sr.hitTab(13);
			sr.sendKeys("N");
			sr.hitF9();

			/***** CUSTOMER ACCESS REGISTRATION ******/

			sr.hitTab(4);
			sr.sendKeys("CIF");
			sr.hitTab(1);
			sr.sendKeys("ETOT");
			sr.hitEnter();

			/***** TOTAL ACCOUNTS ENQUIRY ******/

			sr.hitTab(3);
			sr.sendKeys("CIF");
			sr.hitTab(1);
			sr.sendKeys("CREL");
			sr.hitEnter();

			/***** CREATE CUSTOMER RELATIONSHIPS ******/

			sr.sendKeys("mr " + accountHolderName);
			sr.hitEnter();

			/***** CUSTOMER SELECTION ******/

			sr.sendKeys("1");
			sr.hitEnter();

			/***** CREATE CUSTOMER RELATIONSHIPS ******/

			sr.hitTab(1);
			sr.sendKeys("10");
			sr.hitF9();

			/***** CREATE CUSTOMER RELATIONSHIPS ******/

			sr.hitTab(5);
			sr.sendKeys("CP1");
			sr.hitTab(1);
			sr.sendKeys("EREl");
			sr.hitEnter();
			sr.hitF12();

			/***** Multiple Application Interface Selection Menu ******/

			sr.hitTab(2);
			sr.sendKeys("S");
			sr.hitEnter();

			/*****
			 * T O R O N T O D O M I N I O N B A N K B A N Q U E T O R O N T O D
			 * O M I N I O N
			 ******/

			sr.sendKeys(MultiGroupUser);
			sr.hitTab(1);
			sr.sendKeys(MultiGroupUser);
			sr.hitEnter();
			sr.hitPauseBreak();

			/***** blank screen ******/

			sr.sendKeys("/for tstmai");
			sr.hitEnter();

			/***** MAI LINK TRANSACTION ******/

			sr.sendKeys(testSet);
			sr.hitTab(1);
			sr.sendKeys("M5600393");
			sr.hitEnter();
			sr.hitPauseBreak();

			sr.sendKeys("/test mfs");
			sr.hitEnter();
			sr.sendKeys("uyp1d00");
			sr.hitEnter();

			/***** TD ACCESS ADMINISTRATION MENU ******/

			sr.sendKeys("1");
			sr.hitEnter();
			sr.sendKeys("5");
			sr.hitEnter();

			sr.sendKeys(PersonalAccountACS);
			sr.hitEnter();
			sr.sendKeys("c");
			sr.hitEnter();

			/***** WEB BANKING UPDATE CLIENT SERVICES ******/

			sr.hitTab(1);
			sr.sendKeys("S");
			sr.hitEnter();

			sr.sendKeys("A");
			sr.hitTab(1);
			sr.sendKeys(BusinessAccountACSSecond);
			sr.hitEnter();
			sr.hitF9();

			sr.hitF12();
			sr.closeApplication();
			sr.closeApplication();

			data[0] = AccountType;
			data[1] = multiConnectID;
			data[2] = "NA";
			data[3] = "NA";
			data[4] = "NA";

			CsvWriter.CsvWrite(data, strFilePath);

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void loginEasyWeb(String acsNo, String easyWebPass) {

		try {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 5);

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://easyweb61.sys.td.com/waw/idp/login.htm?execution=e1s1");

			driver.findElement(By.id("login:AccessCard")).click();
			driver.findElement(By.id("login:AccessCard")).sendKeys(acsNo);
			driver.findElement(By.id("login:Webpassword")).click();
			driver.findElement(By.id("login:Webpassword")).sendKeys(easyWebPass);
			driver.findElement(By.xpath("//input[@id='login' and @type='submit']")).click();

			String nextButton = "//input[@id='challengeInfo:next' and @value='Next']";

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nextButton)));
			driver.findElement(By.xpath(nextButton)).click();

			/************* first MFA ************************/

			String mfaFirstDropDown = "//select[@id='MFAsetupForm:repeatId:0:selectBox']";
			String firstOption = "//select[@id='MFAsetupForm:repeatId:0:selectBox']/option[2]";
			String firstAnswer = "//input[@id='MFAsetupForm:repeatId:0:answer']";
			String firstAnswerConf = "//input[@id='MFAsetupForm:repeatId:0:confirmAnswer']";

			driver.findElement(By.xpath(mfaFirstDropDown)).click();
			driver.findElement(By.xpath(firstOption)).click();
			driver.findElement(By.xpath(firstAnswer)).sendKeys("abcde");
			driver.findElement(By.xpath(firstAnswerConf)).sendKeys("abcde");

			/************* second MFA ************************/

			String mfaSecondDropDown = "//select[@id='MFAsetupForm:repeatId:1:selectBox']";
			String secondOption = "//select[@id='MFAsetupForm:repeatId:1:selectBox']/option[2]";
			String secondAnswer = "//input[@id='MFAsetupForm:repeatId:1:answer']";
			String secondAnswerConf = "//input[@id='MFAsetupForm:repeatId:1:confirmAnswer']";

			driver.findElement(By.xpath(mfaSecondDropDown)).click();
			driver.findElement(By.xpath(secondOption)).click();
			driver.findElement(By.xpath(secondAnswer)).sendKeys("abcde");
			driver.findElement(By.xpath(secondAnswerConf)).sendKeys("abcde");

			/************* Third MFA ************************/

			String mfaThirdDropDown = "//select[@id='MFAsetupForm:repeatId:2:selectBox']";
			String thirdOption = "//select[@id='MFAsetupForm:repeatId:2:selectBox']/option[2]";
			String thirdAnswer = "//input[@id='MFAsetupForm:repeatId:2:answer']";
			String thirdAnswerConf = "//input[@id='MFAsetupForm:repeatId:2:confirmAnswer']";

			driver.findElement(By.xpath(mfaThirdDropDown)).click();
			driver.findElement(By.xpath(thirdOption)).click();
			driver.findElement(By.xpath(thirdAnswer)).sendKeys("abcde");
			driver.findElement(By.xpath(thirdAnswerConf)).sendKeys("abcde");

			/************* Forth MFA ************************/

			String mfaForthDropDown = "//select[@id='MFAsetupForm:repeatId:3:selectBox']";
			String forthOption = "//select[@id='MFAsetupForm:repeatId:3:selectBox']/option[2]";
			String forthAnswer = "//input[@id='MFAsetupForm:repeatId:3:answer']";
			String forthAnswerConf = "//input[@id='MFAsetupForm:repeatId:3:confirmAnswer']";

			driver.findElement(By.xpath(mfaForthDropDown)).click();
			driver.findElement(By.xpath(forthOption)).click();
			driver.findElement(By.xpath(forthAnswer)).sendKeys("abcde");
			driver.findElement(By.xpath(forthAnswerConf)).sendKeys("abcde");

			/************* Fifth MFA ************************/

			String mfaFifthDropDown = "//select[@id='MFAsetupForm:repeatId:4:selectBox']";
			String fifthOption = "//select[@id='MFAsetupForm:repeatId:4:selectBox']/option[2]";
			String fifthAnswer = "//input[@id='MFAsetupForm:repeatId:4:answer']";
			String fifthAnswerConf = "//input[@id='MFAsetupForm:repeatId:4:confirmAnswer']";

			driver.findElement(By.xpath(mfaFifthDropDown)).click();
			driver.findElement(By.xpath(fifthOption)).click();
			driver.findElement(By.xpath(fifthAnswer)).sendKeys("abcde");
			driver.findElement(By.xpath(fifthAnswerConf)).sendKeys("abcde");

			String saveSettingsBtn = "//input[@id='MFAsetupForm:login' and @value='Save Settings']";

			driver.findElement(By.xpath(saveSettingsBtn)).click();

			String continueToEasyWeb = "//input[@id='challengeConfirmation:continue' or @id='cancelChallengeSetup:continue']";
			String tempPassword = "//input[@id='changePwdForm:currentPassword']";
			String newPassword = "//input[@id='changePwdForm:password']";
			String confirmPassword = "//input[@id='changePwdForm:confirmPassword']";
			String submit = "//input[@id='changePwdForm:resetPassword' and @value='Submit']";

			driver.findElement(By.xpath(continueToEasyWeb)).click();

			driver.findElement(By.xpath(tempPassword)).sendKeys(easyWebPass);
			driver.findElement(By.xpath(newPassword)).sendKeys("abcde123");
			driver.findElement(By.xpath(confirmPassword)).sendKeys("abcde123");
			driver.findElement(By.xpath(submit)).click();

			driver.quit();

		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
