package com.td;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MainScreen extends _CommonPage {

	public PropertyFileReader reader;

	@AndroidFindBy(className = "android.widget.Button")
	private MobileElement btnContinue;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/laterButton")
	private MobileElement btnLater;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/loginEditText")
	private MobileElement EditUser;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/password_input")
	private MobileElement Password;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/remember_switch")
	private MobileElement RememberME;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "com.td:id/loginBtnText")
	private MobileElement btnLogin;

	@iOSFindBy(id = " ")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement tapHome;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Accounts']")
	private MobileElement accountBtn;

	@iOSFindBy(id = " ")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.tdbank:id/core_clearable_edit_text' and @index='0']")

	private MobileElement password;

	public static HashMap<String, String> valueMap = new HashMap<String, String>();

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	int findRow(HSSFSheet sheet, String cellContent) {
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					if (cell.getRichStringCellValue().getString().trim().equals(cellContent)) {
						return row.getRowNum();
					}
				}
			}
		}
		return 0;
	}

	public static boolean isCellEmpty(final Cell cell) {
		if (cell == null || cell.getCellType() == Cell.CELL_TYPE_BLANK) {
			return true;
		}
		if (cell.getCellType() == Cell.CELL_TYPE_STRING && cell.getStringCellValue().isEmpty()) {
			return true;
		}
		return false;
	}

	public void readFirstRow(String sheetno) {
		String filename = CL.getTestDataInstance().getMasterTestData();
		List<String> fieldsArrayList = new ArrayList<String>();
		List<String> valueArrayList = new ArrayList<String>();

		try {

			FileInputStream myInput = new FileInputStream(new File(filename));

			Workbook workBook = null;

			workBook = new HSSFWorkbook(myInput);

			HSSFSheet sheet = (HSSFSheet) workBook.getSheetAt(Integer.parseInt(sheetno));

			Row firstRow = sheet.getRow(0);
			int length = firstRow.getLastCellNum();

			Cell cell = null;

			String testCaseID = CL.getTestDataInstance().TestCaseID;

			// Row valueRow=sheet.getRow(CL.getTestDataInstance().TestCaseID);
			for (int i = 0; i < length; i++)

			{
				cell = firstRow.getCell(i);

				fieldsArrayList.add(cell.toString());

			}

			int testCaseIdRow = findRow(sheet, testCaseID);

			Row valueRow = sheet.getRow(testCaseIdRow);

			for (int i = 0; i < length; i++)

			{
				if (isCellEmpty(valueRow.getCell(i))) {
					valueArrayList.add("");

				} else {
					cell = valueRow.getCell(i);
					valueArrayList.add(cell.toString());
				}
			}

			for (int i = 0; i < fieldsArrayList.size(); i++) {
				valueMap.put(fieldsArrayList.get(i), valueArrayList.get(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Splash_Conitnue() throws IOException {
		reader = new PropertyFileReader("/Users/MIIPL/Documents/workspace/TDAPP/Test.properties");

		// initialize and load all data, Data will be available under TD class

		CL.getTestDataInstance().Initialize(CL.getTestDataInstance().getMasterTestData());

		CL.getTestDataInstance().setALMUser(reader.getProperty("AlmUser"));
		CL.getTestDataInstance().setALMUserpwd(reader.getProperty("AlmPwd"));
		CL.getTestDataInstance().setALMDomain(reader.getProperty("AlmDomain"));
		CL.getTestDataInstance().setALMHost(reader.getProperty("AlmHost"));
		CL.getTestDataInstance().setALMProject(reader.getProperty("AlmProject"));
		System.out.println("ALM Project" + CL.getTestDataInstance().getALMProject() + "ALMhost "
				+ CL.getTestDataInstance().getALMHost() + "ALM Domain " + CL.getTestDataInstance().getALMDomain()
				+ "ALM User" + CL.getTestDataInstance().getALMUser());
		CL.getTestDataInstance().Initialize(CL.getTestDataInstance().getMasterTestData());

		System.out.println("ALM Project" + CL.getTestDataInstance().getALMProject() + "ALMhost "
				+ CL.getTestDataInstance().getALMHost() + "ALM Domain " + CL.getTestDataInstance().getALMDomain()
				+ "ALM User" + CL.getTestDataInstance().getALMUser());

		CL.getTestDataInstance().Initialize(CL.getTestDataInstance().getMasterTestData());
//		if (getTestdata("MobilePlatform", "Batch Run").equals("")) {
			readFirstRow("2");
//		} else {
//			System.out.println("sheet value :" + getTestdata("MobilePlatform", "Batch Run"));
//			readFirstRow(getTestdata("MobilePlatform", "Batch Run"));
//		}

		String udid = CL.getTestDataInstance().getDeviceUdid();

		if (udid.equalsIgnoreCase("3d8b025ce19ab79fd4fc535b566f70df57747b9a")) {

			try {
				if (CL.getTestDataInstance().getAppFilePath() == null
						|| CL.getTestDataInstance().getAppFilePath().length() < 1) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_ANDROID"));
					else
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_IOS"));
				}
				CL.mobileApp("http://127.0.0.1:4723/wd/hub");
				Decorator();
			} catch (Exception e) {
				System.err.println("Unable to load APP file Path Exiting");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;

			}
		} else {

			try {
				if (CL.getTestDataInstance().getAppFilePath() == null
						|| CL.getTestDataInstance().getAppFilePath().length() < 1) {
					if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_ANDROID"));
					else
						CL.getTestDataInstance().SetAppFilePath(CL.LoadData("Value",
								CL.getTestDataInstance().getSetupFile(), "AppURL", "Name", "APP_IOS"));
				}
				CL.mobileApp("http://0.0.0.0:4725/wd/hub");
				// Decorator();
			} catch (Exception e) {
				System.err.println("Unable to load APP file Path Exiting");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;

			}
		}
	}

	/*
	 * 
	 * 
	 * Object Model Components supporting the Java singleton pattern for the
	 * Page
	 * 
	 */
	// Singleton object of self
	private static MainScreen MainScreen;

	/**
	 * <p>
	 * Getter method for singleton instance.
	 * </p>
	 * 
	 * @return singleton instance of <b>this</b>
	 */
	public synchronized static MainScreen get() {
		if (MainScreen == null) {
			MainScreen = new MainScreen();
		}
		return MainScreen;
	}

}
