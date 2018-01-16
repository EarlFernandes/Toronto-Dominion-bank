package com.td.test.CDNMobile.pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Calendar extends _CommonPage {

	private static Calendar myCalendar;
	private final int COLUMN_CALENDAR = 7;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//com.prolificinteractive.materialcalendarview.MaterialCalendarView/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement month_date;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Go to next']")
	private MobileElement next_Month_Btn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Go to previous']")
	private MobileElement previous_Month_Btn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView")
	@AndroidFindBy(xpath = "//com.prolificinteractive.materialcalendarview.e[@content-desc='Calendar']")
	private MobileElement calendarGrid;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/negative_button']")
	private MobileElement calendar_Cancel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]")
	private MobileElement calendar_confirm_btn;

	private enum frequency_enum {
		Weekly, Bi_weekly, Month_end, Monthly, Semi_monthly, Quarterly
	};

	@SuppressWarnings("serial")
	static final HashMap<String, frequency_enum> frequencyToenumMap = new HashMap<String, frequency_enum>() {
		{
			put("Weekly", frequency_enum.Weekly);
			put("Bi-Weekly", frequency_enum.Bi_weekly);
			put("Month-end", frequency_enum.Month_end);
			put("Monthly", frequency_enum.Monthly);
			put("Semi-Monthly", frequency_enum.Semi_monthly);
			put("Quarterly", frequency_enum.Quarterly);
			put("Bi-weekly", frequency_enum.Bi_weekly);
			put("Semi-monthly", frequency_enum.Semi_monthly);

		}
	};

	@SuppressWarnings("serial")
	static final HashMap<String, Integer> stringToMonthMap = new HashMap<String, Integer>() {
		{
			put("Jan", 1);
			put("Feb", 2);
			put("Mar", 3);
			put("Apr", 4);
			put("May", 5);
			put("Jun", 6);
			put("Jul", 7);
			put("Aug", 8);
			put("Sep", 9);
			put("Oct", 10);
			put("Nov", 11);
			put("Dec", 12);

		}
	};

	@SuppressWarnings("serial") // this map is used to calculate the row and
								// column of the date in calendar
	static final HashMap<String, Integer> calendarMap = new HashMap<String, Integer>() {
		{
			put("2017-12-1-col", 6);
			put("2018-1-1-col", 2);
			put("2018-2-1-col", 5);
			put("2018-3-1-col", 5);
			put("2018-4-1-col", 1);
			put("2018-5-1-col", 3);
			put("2018-6-1-col", 6);
			put("2018-7-1-col", 1);
			put("2018-8-1-col", 4);
			put("2018-9-1-col", 7);
			put("2018-10-1-col", 2);
			put("2018-11-1-col", 5);
			put("2018-12-1-col", 7);
			put("2019-1-1-col", 3);
			put("2019-2-1-col", 6);
			put("2019-3-1-col", 6);
			put("2019-4-1-col", 2);
			put("2019-5-1-col", 4);
			put("2019-6-1-col", 7);
			put("2019-7-1-col", 2);
			put("2019-8-1-col", 5);
			put("2019-9-1-col", 1);
			put("2019-10-1-col", 3);
			put("2019-11-1-col", 6);
			put("2019-12-1-col", 1);
		}
	};

	@SuppressWarnings("serial") // this map is be used to calculate MAXROWs in
								// each month
	static final HashMap<String, Integer> monthDaysMap = new HashMap<String, Integer>() {
		{
			put("Jan", 31);
			put("Feb", 28); // February may be 29 for some year, will
							// recalculate it.
			put("Mar", 31);
			put("Apr", 30);
			put("May", 31);
			put("Jun", 30);
			put("Jul", 31);
			put("Aug", 31);
			put("Sep", 30);
			put("Oct", 31);
			put("Nov", 30);
			put("Dec", 31);

		}
	};

	static int[] holiday_array = { 20180101, 20180219, 20180223, 20180330, 20180402, 20180521, 20180621, 20180625,
			20180702, 20180806, 20180903, 20181008, 20181112, 20181225, 20181226 };

	static Integer[] DigitTorNumber = { 0, // 0 mapping empty
			31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	static final String[] DigitToStr = { "", // 0 mapping empty
			"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	public synchronized static Calendar get() {
		if (myCalendar == null) {
			myCalendar = new Calendar();
		}
		return myCalendar;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)), this);

	}

	private boolean foundHoliday(int expectedDay) {
		Arrays.sort(holiday_array);
		for (int i = 0; i < holiday_array.length; i++) {
			if (holiday_array[i] == expectedDay) {
				return true;
			} else if (holiday_array[i] > expectedDay) {
				return false;
			}
		}
		return false;
	}

	private String getCurrentMonthYear() {
		Decorator();
		try {

			String currentMonthYear = mobileAction.getValue(month_date);
			System.out.println("currentMonthYear:" + currentMonthYear);

			return currentMonthYear;

		} catch (Exception e) {
			return "";
		}
	}

	private int maxDayOfMonth(String year, String month) {
		int lastDayOfMonth;
		if (month.equalsIgnoreCase("Feb")) {
			if (Integer.parseInt(year) % 4 == 0) {
				lastDayOfMonth = 29;
			} else {
				lastDayOfMonth = 28;
			}
			System.out.println("Feb:" + lastDayOfMonth);
		} else {
			lastDayOfMonth = monthDaysMap.get(month);
		}
		return lastDayOfMonth;
	}

	private int maxDayOfFeb(int year) {
		int lastDayOfMonth;

		if (year % 4 == 0) {
			lastDayOfMonth = 29;
		} else {
			lastDayOfMonth = 28;
		}
		System.out.println("Feb:" + lastDayOfMonth);

		return lastDayOfMonth;
	}

	// year: digit; month: characters
	private int getMaxiumRowInMonth(String year, String month) {

		return 6;
		// if
		// (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
		// {
		// // For android, the calendar is fixed 6 x7 metric
		// return 6;
		// }
		// if (month.length() != 3) {
		// month = month.substring(0, 3);
		// }
		// int month_in = stringToMonthMap.get(month);
		// String strOf1stday = year + "-" + month_in + "-1-col";
		// int colOf1Stday = calendarMap.get(strOf1stday);
		// int dayOf1stRowLastCol = (COLUMN_CALENDAR - colOf1Stday) + 1;
		// int rowOf1stday = 1;
		// // get the last day of the month
		// int lastDayOfMonth = maxDayOfMonth(year, month);
		//
		// int maxRowOfMonth = (lastDayOfMonth - dayOf1stRowLastCol +
		// COLUMN_CALENDAR - 1) / COLUMN_CALENDAR + rowOf1stday;
		// return maxRowOfMonth;
	}

	// The Calendar is a 5 X 7 or 6 X 7 metrix,
	// so Row 1,2,3,4,5, 6
	// Col: 1,2,3,4,5,6,7
	private Point get5x7PointOfCalendar(MobileElement calendarGrid, int gridMaxRow, int row, int col) {
		Point upperLeft = calendarGrid.getLocation();
		Dimension dimensions = calendarGrid.getSize();
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			return new Point(upperLeft.getX() + dimensions.getWidth() * (2 * col - 1) / (2 * COLUMN_CALENDAR),
					upperLeft.getY() + dimensions.getHeight() * (2 * row - 1) / (2 * gridMaxRow));
		} else {
			// For Android, the first row is Sun,Mon, Tue, Wed, Thu,Fri, Sat, so
			// need to add one row to calculate the point
			return new Point(upperLeft.getX() + dimensions.getWidth() * (2 * col - 1) / (2 * COLUMN_CALENDAR),
					upperLeft.getY() + dimensions.getHeight() * (2 * (row + 1) - 1) / (2 * (gridMaxRow + 1)));
		}
	}

	// year, month and day are all in digit format
	private int getRowOfSomeDay(String year, String month, String day) {
		// Note the row of the 1st day in any month is 1;

		String strOf1stday = year + "-" + month + "-1-col";
		int colOf1Stday = calendarMap.get(strOf1stday);
		int dayOf1stRowLastCol = (COLUMN_CALENDAR - colOf1Stday) + 1;
		int rowOf1stday = 1;
		int day_int = Integer.parseInt(day);

		int rowoftheday = (day_int - dayOf1stRowLastCol + COLUMN_CALENDAR - 1) / COLUMN_CALENDAR + rowOf1stday;
		return rowoftheday;
	}

	// year, month and day are all in digit format
	private int getColOfSomeDay(String year, String month, String day) {
		String strOf1stday = year + "-" + month + "-1-col";
		int colOf1Stday = calendarMap.get(strOf1stday);
		int day_int = Integer.parseInt(day);
		int colOftheDay = (day_int - 1) % COLUMN_CALENDAR + colOf1Stday;
		if (colOftheDay > COLUMN_CALENDAR) {
			colOftheDay = colOftheDay % COLUMN_CALENDAR;
		}
		return colOftheDay;
	}

	// year: digit 2018, month: chars, December; day: digit 18
	public Point getPositionInCalendar(String year, String month, String day) {

		int maxRowOfRequiredMonth = getMaxiumRowInMonth(year, month);
		System.out.println("Max Row of " + month + ":" + maxRowOfRequiredMonth);
		int requiredMonth_in = stringToMonthMap.get(month);

		String requiredMonth_digit = Integer.toString(requiredMonth_in);
		int row = getRowOfSomeDay(year, requiredMonth_digit, day);
		int col = getColOfSomeDay(year, requiredMonth_digit, day);
		if (col == 1 || col == COLUMN_CALENDAR) {
			mobileAction.Report_Fail("Selected day is not a working day");
			return null;
		}
		System.out.println("Row x Col:" + row + "x" + col);
		Point checkPoint = get5x7PointOfCalendar(calendarGrid, maxRowOfRequiredMonth, row, col);

		return checkPoint;
	}

	private int getMonthGap(String currentYear, String currentMonth, String selectedYear, String selectedMonth) {

		int currentYear_int = Integer.parseInt(currentYear);
		int selectedYear_int = Integer.parseInt(selectedYear);
		int currentmonth_int = stringToMonthMap.get(currentMonth);
		int selectedMonth_int = stringToMonthMap.get(selectedMonth);
		if (selectedYear_int < currentYear_int) {
			System.out.println("Selected Year is less then current year");
			return -1;
		}
		int gap = 12 * (selectedYear_int - currentYear_int) + selectedMonth_int - currentmonth_int;
		return gap;
	}

	public String selectTodaysFollowingHoliday() {
		LocalDate localDate = LocalDate.now();
		String currentDate = DateTimeFormatter.ofPattern("MMM dd, yyyy").format(localDate);
		currentDate = currentDate.replace(" 0", " ");
		currentDate = currentDate.replace(",", "");
		System.out.println("Today is:" + currentDate);
		String[] todayStr = currentDate.split(" ");
		String yearOfToday = todayStr[2];
		String monthOfToday = todayStr[0];
		String dayOfToday = todayStr[1];

		String sToday = yearOfToday + add0iflengthOfStrIs1(Integer.toString(stringToMonthMap.get(monthOfToday)))
				+ add0iflengthOfStrIs1(dayOfToday);
		int iToday = Integer.parseInt(sToday);
		Arrays.sort(holiday_array);
		boolean foundHoliday = false;
		int iHoliday = 0;
		for (int i = 0; i < holiday_array.length; i++) {
			if (holiday_array[i] > iToday) {
				foundHoliday = true;
				iHoliday = holiday_array[i];
				break;
			}
		}

		if (foundHoliday) {
			String sHoliday = Integer.toString(iHoliday);
			String sHolidayYear = sHoliday.substring(0, 4);
			String sHolidayMonth = sHoliday.substring(4, 6);
			String sHolidayDay = sHoliday.substring(6, 8);

			return DigitToStr[Integer.parseInt(sHolidayMonth)] + " "
					+ Integer.parseInt(sHolidayDay) +  ", " + sHolidayYear ;
		}
		return "";
	}

	// return day: 2018 Mar 2; input has the same format
	// No matter if today is a working day or not, select the next working day
	// of today
	public String selectTodaysFollowingWorkDay() {
		LocalDate localDate = LocalDate.now();
		String currentDate = DateTimeFormatter.ofPattern("MMM dd, yyyy").format(localDate);
		currentDate = currentDate.replace(" 0", " ");
		currentDate = currentDate.replace(",", "");
		System.out.println("Today is:" + currentDate);
		String[] todayStr = currentDate.split(" ");
		String yearOfToday = todayStr[2];
		String monthOfToday = todayStr[0];
		String dayOfToday = todayStr[1];

		int expectedMonth = stringToMonthMap.get(monthOfToday);
		int colOfToday = getColOfSomeDay(yearOfToday, Integer.toString(expectedMonth), dayOfToday);

		int maxDayOfThisMonth = maxDayOfMonth(yearOfToday, monthOfToday);
		int expectedDay;
		int expectedYear = Integer.parseInt(yearOfToday);
		int today_int = Integer.parseInt(dayOfToday);
		if (colOfToday == COLUMN_CALENDAR - 1) {
			expectedDay = today_int + 3;
		} else if (colOfToday == COLUMN_CALENDAR) {
			expectedDay = today_int + 2;
		} else {
			expectedDay = today_int + 1;
		}

		if (expectedDay > maxDayOfThisMonth) {
			expectedDay = expectedDay % maxDayOfThisMonth;
			expectedMonth = expectedMonth + 1;
		}
		if (expectedMonth > 12) {
			expectedMonth = expectedMonth % 12;
			expectedYear = expectedYear + 1;
		}
//		String expected = expectedYear + " " + DigitToStr[expectedMonth] + " " + expectedDay;
		return selectFollowingWorkDayIfGivenDayisNot(expectedYear, expectedMonth, expectedDay);
	}

	private int getMonthDays(int month_int, int month_year) {
		if (month_int == 2) {
			return maxDayOfFeb(month_year);
		} else {
			return DigitTorNumber[month_int];
		}
	}

	// Frequency is month-end
	private String getEndofDateInmonthEnd(String startYear, String startMonth, String startDay, int numberOfpayments) {
		if (numberOfpayments > 12) {
			System.out.println("Failed, too long... ");
			return "";
		}
		// update days of Feb
		int startMonth_int = stringToMonthMap.get(startMonth);
		int startYear_int = Integer.parseInt(startYear);
		int expectedYear_int = startYear_int;
		int expectedmonth = startMonth_int + numberOfpayments;

		if (expectedmonth > 12) {
			expectedmonth = expectedmonth % 12;
			expectedYear_int = expectedYear_int + 1;
		}
		int expectedDay_int = getMonthDays(expectedmonth, expectedYear_int);

		// circle_month is destin month
		// return DigitToStr[expectedmonth] + " " + expectedDay_int + " " +
		// expectedYear_int;
		return selectFollowingWorkDayIfGivenDayisNot(expectedYear_int, expectedmonth, expectedDay_int);

	}

	// Frequency is month-end
	private String getStartDateInmonthEnd(String startYear, String startMonth, String startDay) {

		// update days of Feb
		int startMonth_int = stringToMonthMap.get(startMonth);
		int startYear_int = Integer.parseInt(startYear);

		int expectedDay_int = getMonthDays(startMonth_int, startYear_int);

		// circle_month is destin month
		// return startMonth + " " + expectedDay_int + " " + startYear;
		return selectFollowingWorkDayIfGivenDayisNot(startYear_int, startMonth_int, expectedDay_int);

	}

	// Frequency is semi-month
	private String getStartDateInsemi_monthly(String startYear, String startMonth, String startDay) {

		// update days of Feb
		int startMonth_int = stringToMonthMap.get(startMonth);
		int startYear_int = Integer.parseInt(startYear);
		int startDay_int = Integer.parseInt(startDay);

		int expectedDay_int = startDay_int;
		if (expectedDay_int < 15) {
			expectedDay_int = 15;
		} else if (expectedDay_int > 15) {
			expectedDay_int = getMonthDays(startMonth_int, startYear_int);
		}

		// circle_month is destin month
		// return startMonth + " " + expectedDay_int + " " + startYear;
		return selectFollowingWorkDayIfGivenDayisNot(startYear_int, startMonth_int, expectedDay_int);

	}

	// Frequency is semi-month
	private String getEndofDateInsemi_monthly(String startYear, String startMonth, String startDay,
			int numberOfpayments) {
		if (numberOfpayments > 24) {
			System.out.println("Failed, too long... ");
			return "";
		}
		// update days of Feb
		int startMonth_int = stringToMonthMap.get(startMonth);
		int startYear_int = Integer.parseInt(startYear);
		int expectedYear_int = startYear_int;
		int startDay_int = Integer.parseInt(startDay);
		int expectedmonth = startMonth_int + numberOfpayments / 2;

		if (expectedmonth > 12) {
			expectedmonth = expectedmonth % 12;
			expectedYear_int = expectedYear_int + 1;
		}

		int expectedDay_int = startDay_int;
		if (startDay_int < 15) {
			startDay_int = 15;
		} else if (startDay_int > 15) {
			startDay_int = getMonthDays(startMonth_int, startYear_int);
		}

		if (numberOfpayments % 2 == 0) {
			if (startDay_int == 15) {
				expectedDay_int = 15;
			} else {
				expectedDay_int = getMonthDays(expectedmonth, expectedYear_int);
			}
		} else {
			if (startDay_int == 15) {
				expectedDay_int = getMonthDays(expectedmonth, expectedYear_int);
			} else {
				expectedDay_int = 15;
			}
		}

		// circle_month is destin month
		// return DigitToStr[expectedmonth] + " " + expectedDay_int + " " +
		// expectedYear_int;
		return selectFollowingWorkDayIfGivenDayisNot(expectedYear_int, expectedmonth, expectedDay_int);

	}

	// Frequency is month-ly
	private String getEndofDateInXmonthslater(String startYear, String startMonth, String startDay, int monthLater) {
		if (monthLater > 12) {
			System.out.println("Failed, too long... ");
			return "";
		}
		// update days of Feb
		int startMonth_int = stringToMonthMap.get(startMonth);
		int startYear_int = Integer.parseInt(startYear);
		int expectedYear_int = startYear_int;
		int startDay_int = Integer.parseInt(startDay);
		int expectedmonth = startMonth_int + monthLater;
		int expectedDay_int = startDay_int;

		if (expectedmonth > 12) {
			expectedmonth = expectedmonth % 12;
			expectedYear_int = expectedYear_int + 1;
		}

		int maxDayInExpectedMonth = getMonthDays(expectedmonth, expectedYear_int);
		if (expectedDay_int > maxDayInExpectedMonth) {
			expectedDay_int = maxDayInExpectedMonth;
		}

		// circle_month is destin month
		// return DigitToStr[expectedmonth] + " " + expectedDay_int + " " +
		// expectedYear_int;
		return selectFollowingWorkDayIfGivenDayisNot(expectedYear_int, expectedmonth, expectedDay_int);

	}

	//
	private String getEndofDateInXDayslater(String startYear, String startMonth, String startDay, int daysLater) {
		if (daysLater > 365) {
			System.out.println("Failed, too long... ");
			return "";
		}
		// update days of Feb
		int startMonth_int = stringToMonthMap.get(startMonth);
		int startYear_int = Integer.parseInt(startYear);
		int expectedYear_int = startYear_int;
		int startDay_int = Integer.parseInt(startDay);
		int remainDays = startDay_int + daysLater;
		int circle_month = startMonth_int;
		while (true) {
			if (circle_month > 12) {
				circle_month = circle_month % 12;
				expectedYear_int = expectedYear_int + 1;
			}
			if (remainDays <= getMonthDays(circle_month, expectedYear_int)) {
				// circle_month is destin month
				return selectFollowingWorkDayIfGivenDayisNot(expectedYear_int, circle_month, remainDays);
			} else {
				remainDays = remainDays - getMonthDays(circle_month, expectedYear_int);
				circle_month++;
			}
		}
	}

	// Get end of date when 'Will to End' selected 'Number of Payments'
	public String getEndOfDateWhenNumberOfPaymentSelected(String startOfDate, int numOfpayments, String frequency) {
		String[] thisMonthDay_Array = startOfDate.replace(",", "").split(" ");
		String thisMonth = thisMonthDay_Array[0].trim();
		String thisYear = thisMonthDay_Array[2].trim();
		String thisDay = thisMonthDay_Array[1].trim();
		int daysLater = 0;

		switch (frequencyToenumMap.get(frequency)) {
		case Weekly:
			daysLater = 7 * (numOfpayments - 1);
			return getEndofDateInXDayslater(thisYear, thisMonth, thisDay, daysLater);
		case Bi_weekly:
			daysLater = 14 * (numOfpayments - 1);
			return getEndofDateInXDayslater(thisYear, thisMonth, thisDay, daysLater);
		case Month_end:
			return getEndofDateInmonthEnd(thisYear, thisMonth, thisDay, (numOfpayments - 1));
		case Monthly:
			return getEndofDateInXmonthslater(thisYear, thisMonth, thisDay, (numOfpayments - 1));
		case Semi_monthly:
			return getEndofDateInsemi_monthly(thisYear, thisMonth, thisDay, (numOfpayments - 1));
		case Quarterly:
			return getEndofDateInXmonthslater(thisYear, thisMonth, thisDay, 3 * (numOfpayments - 1));
		}
		System.out.println("Frequency is not found: " + frequency);
		return "";
	}

	// Get start date for different frequency
	public String getStartDateInAnyCase(String startOfDate, String frequency) {
		String[] thisMonthDay_Array = startOfDate.replace(",", "").split(" ");
		String thisMonth = thisMonthDay_Array[0].trim();
		String thisYear = thisMonthDay_Array[2].trim();
		String thisDay = thisMonthDay_Array[1].trim();
		int thisMonth_int = stringToMonthMap.get(thisMonth);

		switch (frequencyToenumMap.get(frequency)) {
		case Weekly:
		case Bi_weekly:
		case Monthly:
		case Quarterly:
			return selectFollowingWorkDayIfGivenDayisNot(Integer.parseInt(thisYear), thisMonth_int,
					Integer.parseInt(thisDay));
		case Month_end:
			return getStartDateInmonthEnd(thisYear, thisMonth, thisDay);
		case Semi_monthly:
			return getStartDateInsemi_monthly(thisYear, thisMonth, thisDay);

		}
		System.out.println("Frequency is not found: " + frequency);
		return "";
	}

	// Get number of payments when 'Will to End' selected 'On a specific day'
	public int getNumberOfpaymentsWhenOnSpecificDayClicked(String startOfDate, String EndOfDate, String frequency) {
		String[] thisMonthDay_Array = startOfDate.replace(",", "").split(" ");
		String thisMonth = thisMonthDay_Array[0].trim();
		int thisYear_int = Integer.parseInt(thisMonthDay_Array[2].trim());
		int thisDay_int = Integer.parseInt(thisMonthDay_Array[1].trim());
		int thisMonth_int = stringToMonthMap.get(thisMonth);

		String[] endMonthDay_Array = EndOfDate.replace(",", "").split(" ");
		String endMonth = endMonthDay_Array[0].trim();
		int endYear_int = Integer.parseInt(endMonthDay_Array[2].trim());
		int endDay_int = Integer.parseInt(endMonthDay_Array[1].trim());
		int endMonth_int = stringToMonthMap.get(endMonth);

		int daysGap = getDaysBetweenEndStartDate(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
				endDay_int);
		System.out.println("DaysGap between startdate and endDate:" + daysGap);

		switch (frequencyToenumMap.get(frequency)) {
		case Weekly:
			return daysGap / 7 + 1;
		case Bi_weekly:
			return daysGap / 14 + 1;
		case Month_end:
			return getNumberOfPaymentsInmonthEnd(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
					endDay_int);
		case Monthly:
			return getNumberOfPaymentsInmonthly(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
					endDay_int);
		case Semi_monthly:
			return getNumberOfPaymentsInsemi_month(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
					endDay_int);
		case Quarterly:
			return getNumberOfPaymentsInQuarterly(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
					endDay_int);
		}
		System.out.println("Frequency is not found: " + frequency);
		return 0;
	}

	// Get start of date when 'Will to End' selected 'On a specific day' and
	// frequency is Month_end
	public String geStartOfDateInMonthEnd(int thisYear_int, int thisMonth_int, int thisDay_int) {

		int expectedDay = getMonthDays(thisMonth_int, thisYear_int);
		String endDayExpected = selectFollowingWorkDayIfGivenDayisNot(thisYear_int, thisMonth_int, expectedDay);
		System.out.println("Start date in Month-end:" + endDayExpected);
		return endDayExpected;
	}

	// Get start of date when 'Will to End' selected 'On a specific day' and
	// frequency is Semi-Monthly
	public String geStartOfDateInSemi_Monthly(int thisYear_int, int thisMonth_int, int thisDay_int) {

		int expectedDay = 15;
		if (thisDay_int > 15) {
			expectedDay = getMonthDays(thisMonth_int, thisYear_int);
		}

		String endDayExpected = selectFollowingWorkDayIfGivenDayisNot(thisYear_int, thisMonth_int, expectedDay);
		System.out.println("Start date in Semi-Monthly:" + endDayExpected);
		return endDayExpected;
	}

	// Get end of date when 'Will to End' selected 'On a specific day'
	public String geEndOfDateWhenOnSpecificDayClicked(String startOfDate, String EndOfDate, String frequency) {
		String[] thisMonthDay_Array = startOfDate.replace(",", "").split(" ");
		String thisMonth = thisMonthDay_Array[0].trim();
		int thisYear_int = Integer.parseInt(thisMonthDay_Array[2].trim());
		int thisDay_int = Integer.parseInt(thisMonthDay_Array[1].trim());
		int thisMonth_int = stringToMonthMap.get(thisMonth);

		String[] endMonthDay_Array = EndOfDate.replace(",", "").split(" ");
		String endMonth = endMonthDay_Array[0].trim();
		int endYear_int = Integer.parseInt(endMonthDay_Array[2].trim());
		int endDay_int = Integer.parseInt(endMonthDay_Array[1].trim());
		int endMonth_int = stringToMonthMap.get(endMonth);

		int daysGap = getDaysBetweenEndStartDate(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
				endDay_int);
		System.out.println("DaysGap between startdate and endDate:" + daysGap);

		switch (frequencyToenumMap.get(frequency)) {
		case Weekly:
			return getEndOfDateInWeekly(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int, endDay_int,
					0);
		case Bi_weekly:
			return getEndOfDateInWeekly(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int, endDay_int,
					1);
		case Month_end:
			return getEndOfDateInMonth_end(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
					endDay_int);
		case Monthly:
			return getEndOfDateInMonthly(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
					endDay_int);
		case Semi_monthly:
			return getEndOfDateInSemi_Monthly(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
					endDay_int);
		case Quarterly:
			return getEndOfDateInQuarterly(thisYear_int, thisMonth_int, thisDay_int, endYear_int, endMonth_int,
					endDay_int);
		}
		System.out.println("Frequency is not found: " + frequency);
		return "";
	}

	// // Get Start of date in any case
	// public String geStartOfDate(String startOfDate, String frequency){
	// String[] thisMonthDay_Array = startOfDate.replace(",", "").split(" ");
	// String thisMonth = thisMonthDay_Array[0].trim();
	// int thisYear_int = Integer.parseInt(thisMonthDay_Array[2].trim());
	// int thisDay_int = Integer.parseInt(thisMonthDay_Array[1].trim());
	// int thisMonth_int = stringToMonthMap.get(thisMonth);
	//
	//
	// switch (frequencyToenumMap.get(frequency)) {
	// case Weekly:
	//
	// case Bi_weekly:
	// return
	// selectFollowingWorkDayIfGivenDayisNot(thisYear_int,thisMonth_int,thisDay_int);
	// case Month_end:
	// return geStartOfDateInMonthEnd(thisYear_int,thisMonth_int,thisDay_int);
	// case Monthly:
	// return
	// selectFollowingWorkDayIfGivenDayisNot(thisYear_int,thisMonth_int,thisDay_int);
	// case Semi_monthly:
	// return
	// geStartOfDateInSemi_Monthly(thisYear_int,thisMonth_int,thisDay_int);
	// case Quarterly:
	// return
	// selectFollowingWorkDayIfGivenDayisNot(thisYear_int,thisMonth_int,thisDay_int);
	// }
	// System.out.println("Frequency is not found: "+ frequency);
	// return "";
	// }

	// Weekly or semi-weekly. freq, 0 - weekly; 1 - semi-weekly
	private String getEndOfDateInWeekly(int startY_int, int startM_int, int startD_int, int endY_int, int endM_int,
			int endD_int, int freq) {
		int daysGap = getDaysBetweenEndStartDate(startY_int, startM_int, startD_int, endY_int, endM_int, endD_int);
		int colGap = 0;
		if (freq == 0) {
			colGap = daysGap % 7;
		} else {
			colGap = daysGap % 14;
		}
		int expectedY = endY_int;
		int expectdM = endM_int;
		int endDay = endD_int - colGap;
		if (endDay < 0) {
			expectdM = expectdM - 1;
			if (expectdM == 0) {
				expectdM = 12;
				expectedY = expectedY - 1;
			}
			endDay = getMonthDays(expectdM, expectedY) + endDay;
		}
		String endDayExpected = selectFollowingWorkDayIfGivenDayisNot(expectedY, expectdM, endDay);
		if (freq == 0) {
			System.out.println("End day in Weekly:" + endDayExpected);
		} else {
			System.out.println("End day in Semi-Weekly:" + endDayExpected);
		}
		return endDayExpected;
	}

	// Quarterly: end of date
	private String getEndOfDateInQuarterly(int startY_int, int startM_int, int startD_int, int endY_int, int endM_int,
			int endD_int) {
		int yearGap = endY_int - startY_int;
		int monthGap = yearGap * 12 + endM_int - startM_int; // this does not
																// include
																// start-Month

		int expectedY = endY_int;
		int expectdM = endM_int;

		if (monthGap % 3 == 0 && endD_int < startD_int) {
			expectdM = expectdM - 3;
			if (expectdM <= 0) {
				expectdM = 12 + expectdM;
				expectedY = expectedY - 1;
			}
		} else if (monthGap % 3 != 0) {
			int monthGap_int = monthGap % 3;
			expectdM = expectdM - monthGap_int;
			if (expectdM <= 0) {
				expectdM = 12 + expectdM;
				expectedY = expectedY - 1;
			}
		}

		int endDay = startD_int;
		if (endDay > getMonthDays(expectdM, expectedY)) {
			endDay = getMonthDays(expectdM, expectedY);
		}

		String endDayExpected = selectFollowingWorkDayIfGivenDayisNot(expectedY, expectdM, endDay);
		System.out.println("End day in Month-end:" + endDayExpected);
		return endDayExpected;
	}

	// Semi-Monthly: end of date
	private String getEndOfDateInSemi_Monthly(int startY_int, int startM_int, int startD_int, int endY_int,
			int endM_int, int endD_int) {
		// int yearGap = endY_int - startY_int;
		// int monthGap = yearGap *12 + endM_int - startM_int ; //this does not
		// include start-Month
		//
		// if(monthGap == 0 || (monthGap==1 && endD_int < startD_int)) {
		// System.out.println("Wrong...end date is too short");
		// return "";
		// }
		int expectedY = endY_int;
		int expectdM = endM_int;
		int endDay = endD_int;
		if (endDay < 15) {
			expectdM = expectdM - 1;
			if (expectdM == 0) {
				expectdM = 12;
				expectedY = expectedY - 1;
			}
			endDay = getMonthDays(expectdM, expectedY);
		} else if (endDay >= 15 && endDay < getMonthDays(expectdM, expectedY)) {
			endDay = 15;
		} else {
			endDay = getMonthDays(expectdM, expectedY);
		}

		String endDayExpected = selectFollowingWorkDayIfGivenDayisNot(expectedY, expectdM, endDay);
		System.out.println("End day in Month-end:" + endDayExpected);
		return endDayExpected;
	}

	// Monthly: end of date
	private String getEndOfDateInMonthly(int startY_int, int startM_int, int startD_int, int endY_int, int endM_int,
			int endD_int) {
		int yearGap = endY_int - startY_int;
		int monthGap = yearGap * 12 + endM_int - startM_int; // this does not
																// include
																// start-Month

		if (monthGap == 0 || (monthGap == 1 && endD_int < startD_int)) {
			System.out.println("Wrong...end date is too short");
			return "";
		}

		int expectedY = endY_int;
		int expectdM = endM_int;
		int endDay = endD_int;
		if (endDay < startD_int) {
			expectdM = expectdM - 1;
			if (expectdM == 0) {
				expectdM = 12;
				expectedY = expectedY - 1;
			}
		}
		endDay = startD_int;
		if (endDay > getMonthDays(expectdM, expectedY)) {
			endDay = getMonthDays(expectdM, expectedY);
		}

		String endDayExpected = selectFollowingWorkDayIfGivenDayisNot(expectedY, expectdM, endDay);
		System.out.println("End day in Month-end:" + endDayExpected);
		return endDayExpected;
	}

	// Month-end: end of date
	private String getEndOfDateInMonth_end(int startY_int, int startM_int, int startD_int, int endY_int, int endM_int,
			int endD_int) {
		int yearGap = endY_int - startY_int;
		int monthGap = yearGap * 12 + endM_int - startM_int; // this does not
																// include
																// start-Month

		int endDateOfMonth = getMonthDays(endM_int, endY_int);

		if (monthGap == 0 || (monthGap == 1 && endD_int < endDateOfMonth)) {
			System.out.println("Wrong...end date is too short");
			return "";
		}

		int expectedY = endY_int;
		int expectdM = endM_int;
		int endDay = endD_int;
		if (endDay < endDateOfMonth) {
			expectdM = expectdM - 1;
			if (expectdM == 0) {
				expectdM = 12;
				expectedY = expectedY - 1;
			}
			endDay = getMonthDays(expectdM, expectedY);
		}

		String endDayExpected = selectFollowingWorkDayIfGivenDayisNot(expectedY, expectdM, endDay);
		System.out.println("End day in Month-end:" + endDayExpected);
		return endDayExpected;
	}

	private int getDaysBetweenEndStartDate(int startY_int, int startM_int, int startD_int, int endY_int, int endM_int,
			int endD_int) {
		int yearGap = endY_int - startY_int;
		int monthGap = yearGap * 12 + endM_int - startM_int - 1; // this does
																	// not
																	// include
																	// start-Month
																	// and
																	// end-month
		if (monthGap == -1) {
			return endD_int - startD_int;
		}
		int remaindaysOfStartMonth;
		remaindaysOfStartMonth = getMonthDays(startM_int, startY_int) - startD_int;
		int totalDays = remaindaysOfStartMonth;
		int looping_startMonth = startM_int + 1;
		int looping_startyear = startY_int;

		for (int i = 0; i < monthGap; i++) {
			if (looping_startMonth + i > 12) {
				looping_startMonth = looping_startMonth % 12;
				looping_startyear = looping_startyear + 1;
			}
			totalDays = totalDays + getMonthDays(looping_startMonth + i, looping_startyear);
		}

		totalDays = totalDays + endD_int;
		return totalDays;

	}

	private int getNumberOfPaymentsInmonthEnd(int startY_int, int startM_int, int startD_int, int endY_int,
			int endM_int, int endD_int) {
		int yearGap = endY_int - startY_int;
		int monthGap = yearGap * 12 + endM_int - startM_int - 1; // this does
																	// not
																	// include
																	// start-Month
																	// and
																	// end-month

		if (endD_int == getMonthDays(endM_int, endY_int)) {
			return 2 + monthGap; // including the end of month
		} else {
			return 1 + monthGap;
		}
	}

	private int getNumberOfPaymentsInmonthly(int startY_int, int startM_int, int startD_int, int endY_int, int endM_int,
			int endD_int) {
		int yearGap = endY_int - startY_int;
		int monthGap = yearGap * 12 + endM_int - startM_int - 1; // this does
																	// not
																	// include
																	// start-Month
																	// and
																	// end-month

		if (endD_int >= startD_int) {
			return 2 + monthGap; // including the end of month
		} else {
			return 1 + monthGap;
		}
	}

	private int getNumberOfPaymentsInQuarterly(int startY_int, int startM_int, int startD_int, int endY_int,
			int endM_int, int endD_int) {
		int yearGap = endY_int - startY_int;
		int monthGap = yearGap * 12 + endM_int - startM_int - 1; // this does
																	// not
																	// include
																	// start-Month
																	// and
																	// end-month

		if (monthGap < 2 || (monthGap == 2 && endD_int < startD_int)) {
			System.out.println("Wrong...Gap is less then a quarter");
			return 0;
		}

		int numberOfpayments = (monthGap + 1) / 3;
		if ((monthGap + 1) % 3 == 0) {
			if (endD_int >= startD_int) {
				numberOfpayments++;
			}
		} else {
			numberOfpayments++;
		}

		return numberOfpayments;
	}

	private int getNumberOfPaymentsInsemi_month(int startY_int, int startM_int, int startD_int, int endY_int,
			int endM_int, int endD_int) {
		int yearGap = endY_int - startY_int;
		int monthGap = yearGap * 12 + endM_int - startM_int - 1; // this does
																	// not
																	// include
																	// start-Month
																	// and
																	// end-month

		if (monthGap == -1) {
			return 0;
		}
		int number = 0;
		if (startD_int <= 15) {
			number = 2;
		} else {
			number = 1;
		}
		if (endD_int < 15) {
			number = number + monthGap * 2;
		} else if (endD_int != getMonthDays(endM_int, endY_int)) {
			number = number + monthGap * 2 + 1;
		} else {
			number = number + monthGap * 2 + 2;
		}
		return number;
	}

	// thisMonthDay : Dec 12,2017; return the same format
	public String getThisMonthsLastWorkingDay(String thisMonthday) {
		String[] thisMonthDay_Array = thisMonthday.replace(",", "").split(" ");
		String thisMonth = thisMonthDay_Array[0].trim();
		String thisYear = thisMonthDay_Array[2].trim();
		String lastdayThisMonth = monthDaysMap.get(thisMonth).toString();
		return selectFollowingWorkDayIfGivenDayisNot(thisYear, thisMonth, lastdayThisMonth);
	}

	private String add0iflengthOfStrIs1(String monthOrDay) {
		if (monthOrDay.length() == 1) {
			return "0" + monthOrDay;
		} else {
			return monthOrDay;
		}
	}

	// return day: 2018 Mar 2; input has the same format
	// No matter if today is a working day or not, select the next working day
	public String selectFollowingWorkDayIfGivenDayisNot(int yearOfDay, int monthOfDay, int dayOfDay) {

		int expectedMonth = monthOfDay;
		int expectedDay = dayOfDay;
		int expectedYear = yearOfDay;
		int colOfToday = getColOfSomeDay(Integer.toString(expectedYear), Integer.toString(expectedMonth),
				Integer.toString(expectedDay));

		int maxDayOfThisMonth = maxDayOfMonth(Integer.toString(expectedYear), DigitToStr[expectedMonth]);

		if (colOfToday != 1 && colOfToday != COLUMN_CALENDAR) {
			String expectedworkingday = expectedYear + add0iflengthOfStrIs1(Integer.toString(expectedMonth))
					+ add0iflengthOfStrIs1(Integer.toString(expectedDay));

			if (foundHoliday(Integer.parseInt(expectedworkingday))) {
				expectedDay = expectedDay + 1;
				if (expectedDay > maxDayOfThisMonth) {
					expectedDay = expectedDay % maxDayOfThisMonth;
					expectedMonth = expectedMonth + 1;
				}
				if (expectedMonth > 12) {
					expectedMonth = 1;
					expectedYear = expectedYear + 1;
				}
				return selectFollowingWorkDayIfGivenDayisNot(expectedYear, expectedMonth, expectedDay);
			} else {
				return (DigitToStr[expectedMonth] + " " + add0iflengthOfStrIs1(Integer.toString(expectedDay)) + ", "
						+ expectedYear);
			}
		}

		if (colOfToday == COLUMN_CALENDAR) {
			expectedDay = expectedDay + 2;
		} else {
			expectedDay = expectedDay + 1;
		}

		if (expectedDay > maxDayOfThisMonth) {
			expectedDay = expectedDay % maxDayOfThisMonth;
			expectedMonth = expectedMonth + 1;
		}
		if (expectedMonth > 12) {
			expectedMonth = 1;
			expectedYear = expectedYear + 1;
		}

		String expectedworkingday = expectedYear + add0iflengthOfStrIs1(Integer.toString(expectedMonth))
				+ add0iflengthOfStrIs1(Integer.toString(expectedDay));

		if (foundHoliday(Integer.parseInt(expectedworkingday))) {
			expectedDay = expectedDay + 1;
			if (expectedDay > maxDayOfMonth(Integer.toString(expectedYear), DigitToStr[expectedMonth])) {
				expectedDay = 1;
				expectedMonth = expectedMonth + 1;
			}
			if (expectedMonth > 12) {
				expectedMonth = 1;
				expectedYear = expectedYear + 1;
			}

			return selectFollowingWorkDayIfGivenDayisNot(expectedYear, expectedMonth, expectedDay);
		}

		String expected = DigitToStr[expectedMonth] + " " + add0iflengthOfStrIs1(Integer.toString(expectedDay)) + ", "
				+ expectedYear;
		return expected;
	}

	// return day: 2018 Mar 2; input has the same format
	// No matter if today is a working day or not, select the next working day
	public String selectFollowingWorkDayIfGivenDayisNot(String yearOfDay, String monthOfDay, String dayOfDay) {

		int expectedMonth = stringToMonthMap.get(monthOfDay);
		int expectedYear = Integer.parseInt(yearOfDay);
		int expectedDay = Integer.parseInt(dayOfDay);

		return selectFollowingWorkDayIfGivenDayisNot(expectedYear, expectedMonth, expectedDay);
	}

	// currentYear :2017; currentMonth: Dec; xMonthLater: 5;
	// return should be: someday in May 2018
	public String selectRandomDayInXmonthLater(String currentYear, String currentMonth, String currentDay,
			int xMonthLater) {

		int calculateMonthLater = xMonthLater;
		int startDayIndex = 1;
		if (xMonthLater == 0) {

			int day_int = Integer.parseInt(currentDay);
			if (day_int == maxDayOfMonth(currentYear, currentMonth)) {
				// Today is the end day of the month
				System.out.println("Today is end of the month:" + currentDay);
				calculateMonthLater = calculateMonthLater + 1;
			} else {
				startDayIndex = day_int + 1;
			}
		}

		int requiredMonth_int = stringToMonthMap.get(currentMonth) + calculateMonthLater;
		int requiredYear_int = Integer.parseInt(currentYear);
		if (requiredMonth_int > 12) {
			requiredYear_int = requiredYear_int + 1;
			requiredMonth_int = requiredMonth_int % 12;
		}
		int maxDayOfMonth = maxDayOfMonth(Integer.toString(requiredYear_int), DigitToStr[requiredMonth_int]);

		int randFund = getRandomInRange(startDayIndex, maxDayOfMonth);

		return selectFollowingWorkDayIfGivenDayisNot(requiredYear_int, requiredMonth_int, randFund);
	}

	public void selectDate(String requiredYear, String requiredMonth, String requireddate) {
		Decorator();
		try {

			System.out.println("Required date is " + requiredYear + " " + requiredMonth + " " + requireddate);

			String currentMonthYear = getCurrentMonthYear();
			String[] currentMonthYear_Array = currentMonthYear.split(" ");
			String currentMonth = currentMonthYear_Array[0].trim();
			String currentYear = currentMonthYear_Array[1].trim();

			String currentMonth_Abbr = currentMonth.substring(0, 3);
			//String requiredMonth_Abbr = requiredMonth.substring(0, 3);
			int monthGap = getMonthGap(currentYear, currentMonth_Abbr, requiredYear, requiredMonth);
			if (monthGap == -1) {
				mobileAction.Report_Fail("Selected year is not correct");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				return;
			}

			for (int i = 0; i < monthGap; i++) {
				System.out.println("Click Next month Button");
				mobileAction.FuncClick(next_Month_Btn, ">");
			}

			String currentMonthYearAfter = getCurrentMonthYear();
			if (currentMonthYearAfter.contains(requiredMonth) && currentMonthYearAfter.contains(requiredYear)) {
				// Select Date

				// if
				// (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))
				// {

				Point checkPoint = getPositionInCalendar(requiredYear, requiredMonth, requireddate);
				mobileAction.TapCoOrdinates(checkPoint.getX(), checkPoint.getY(),
						"Calendar date:" + requiredMonth + "-" + requireddate + " clicked");
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
					mobileAction.FuncClick(calendar_confirm_btn, "Confirm");
				}
				mobileAction.Report_Pass_Verified("Date selected:" + requireddate);
				// } else {
				// String dateXpath = "//android.widget.CheckedTextView[@text
				// ='" +
				// requireddate + "']";
				// try {
				// List<MobileElement> textItem = ((AppiumDriver)
				// CL.GetDriver()).findElements(By.xpath(dateXpath));
				// if(textItem.size() ==1 ) {
				// System.out.println("Only 1 text found in calendar");
				// textItem.get(0).click();
				// } else if (textItem.size()>1 ){
				// if(Integer.parseInt(requireddate) > 15) {
				// System.out.println("Big day");
				// textItem.get(1).click();
				// } else {
				// System.out.println("Small day");
				// textItem.get(0).click();
				// }
				// } else {
				// System.out.println("Something wrong");
				// return;
				// }
				// Thread.sleep(2000);
				// mobileAction.Report_Pass_Verified("Date selected:" +
				// requiredMonth + " " + requireddate);
				// } catch (Exception e1) {
				// System.out.println("date cannot be clicked");
				// }
				// }
			} else {
				System.err.println("Failed to check the month, year");
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickCalendarCancel() {
		Decorator();
		try {
			mobileAction.FuncClick(calendar_Cancel, "Canlendar Cancel Cliked");

		} catch (Exception e) {

		}
	}

}
