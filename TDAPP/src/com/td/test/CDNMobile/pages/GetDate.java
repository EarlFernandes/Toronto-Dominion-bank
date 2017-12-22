package com.td.test.CDNMobile.pages;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class GetDate extends _CommonPage {

	private static GetDate GetTodaysDate;

	public synchronized static GetDate get() {
		if (GetTodaysDate == null) {
			GetTodaysDate = new GetDate();
		}
		return GetTodaysDate;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	public int getTodaysDate() {
		Decorator();
		Calendar cal = Calendar.getInstance();
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		return dayOfMonth;
	}

	public int getTomorrowsDate() {
		Decorator();
		Calendar cal = Calendar.getInstance();
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		return (dayOfMonth + 1);
	}

	/**
	 * This method will calculate the tommorow's day.
	 * 
	 * @return dayOfMonth Element will return the today's date
	 */
	public static String getCurrentMonth() {

		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		month = month + 1;
		String monthRe = null;
		switch (month) {

		case 1:
			monthRe = "January";
			break;

		case 2:
			monthRe = "February";
			break;

		case 3:
			monthRe = "March";
			break;

		case 4:
			monthRe = "April";
			break;

		case 5:
			monthRe = "May";
			break;

		case 6:
			monthRe = "June";
			break;

		case 7:
			monthRe = "July";
			break;

		case 8:
			monthRe = "August";
			break;

		case 9:
			monthRe = "September";
			break;

		case 10:
			monthRe = "October";
			break;

		case 11:
			monthRe = "November";
			break;

		case 12:
			monthRe = "December";
			break;

		}

		return (monthRe);
	}

	/**
	 * This method will calculate the current year.
	 * 
	 * @return dayOfMonth Element will return the today's date
	 */
	public static int currentYear() {

		Calendar c = Calendar.getInstance();
		int currentYear = c.get(Calendar.YEAR);
		return currentYear;
	}

	
	/**
	 * This method will calculate the tommorow's day.
	 * 
	 * @return dayOfMonth Element will return the today's date
	 */
	public String getCurrentMonthShort() {

		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		month = month + 1;
		String monthRe = null;
		switch (month) {

		case 1:
			monthRe = "Jan";
			break;

		case 2:
			monthRe = "Feb";
			break;

		case 3:
			monthRe = "Mar";
			break;

		case 4:
			monthRe = "Apr";
			break;

		case 5:
			monthRe = "May";
			break;

		case 6:
			monthRe = "Jun";
			break;

		case 7:
			monthRe = "Jul";
			break;

		case 8:
			monthRe = "Aug";
			break;

		case 9:
			monthRe = "Sept";
			break;

		case 10:
			monthRe = "Oct";
			break;

		case 11:
			monthRe = "Nov";
			break;

		case 12:
			monthRe = "Dec";
			break;

		}

		return (monthRe);
	}
	
}
