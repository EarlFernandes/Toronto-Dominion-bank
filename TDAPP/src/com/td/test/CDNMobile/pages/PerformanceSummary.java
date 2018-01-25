package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.td.MobileAction2;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PerformanceSummary extends _CommonPage {

	private static PerformanceSummary performanceSummary;

	public synchronized static PerformanceSummary get() {
		if (performanceSummary == null) {
			performanceSummary = new PerformanceSummary();
		}
		return performanceSummary;
	}

	public void getDurationSummary() {
		performance.durationSummary();
	}

}
