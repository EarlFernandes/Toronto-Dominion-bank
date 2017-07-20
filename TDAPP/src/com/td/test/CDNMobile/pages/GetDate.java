package com.td.test.CDNMobile.pages;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
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
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
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

}
