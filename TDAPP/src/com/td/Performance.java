package com.td;

import java.io.IOException;
import java.time.Instant;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.td.test.CDNMobile.pages.Login;
import com.td.test.framework.CommonLib;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy.ByIosClassChain;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Performance extends CommonLib {

	public final int MaxTimeoutInSec = 10;
	private long startTime = 0L;
	private long endTime = 0L;
	private ArrayList<Double> durations = new ArrayList<Double>();

	public void click(WebElement objElement, String text) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(objElement));

			objElement.click();
			startTime = Instant.now().toEpochMilli();

			System.out.println("The element <b>  " + text + " </b> Clicked at time: " + startTime);
			GetReporting().FuncReport("Pass", "The element <b>  " + text + " </b> Clicked at time: " + startTime);
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception for Click on element <b>" + text + " </b>");

		}
	}

	public void verifyElementIsDisplayed(MobileElement mobileElement, String expectedText) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			endTime = Instant.now().toEpochMilli();

			System.out.println("The element <b> " + expectedText + " </b> is displayed at time: " + endTime);
			double dur = this.getDuration();
			System.out.println("processing took: " + dur);

			GetReporting().FuncReport("Pass",
					"The element <b>" + expectedText + " </b> is displayed at time: " + endTime);
			GetReporting().FuncReport("Pass", "Duration is: " + dur);

		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception for Verify Visibility on element <b>" + expectedText + "</b>");
		}
	}

	private double getDuration() {
		double dur = (double) ((endTime - startTime) / 1000.0);
		durations.add(dur);
		System.out.println("All durations: " + Arrays.toString(durations.toArray()));
		return dur;
	}

	public void durationSummary() {
		System.out.println("All durations: " + Arrays.toString(durations.toArray()));
		this.startTime = 0L;
		this.endTime = 0L;

	}

	public void transmitResults() {
		// send results to file or DB
	}
}
