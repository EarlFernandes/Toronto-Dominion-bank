package com.td;

import java.time.Instant;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td.test.framework.CommonLib;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Performance extends CommonLib {

	public final int MaxTimeoutInSec = 20;
	private long startTime = 0L;
	private long endTime = 0L;

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

	public void tapCoordinates(int x, int y, String element) throws Exception {
		try {

			TouchAction action = new TouchAction(((MobileDriver) GetDriver()));
			action.tap(x, y).perform();
			startTime = Instant.now().toEpochMilli();

			GetReporting().FuncReport("Pass", "The element <b>  " + element + " </b> Clicked");
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception for Tap on co-ordinates for <b>" + element + " </b>");
		}
	}

	public void startClock(String text) throws Exception {
		try {

			startTime = Instant.now().toEpochMilli();
			getTestDataInstance().TCParameters.put("Amount", Long.toString(startTime));
			System.out.println("Clock started for <b>  " + text + " </b> at time: " + startTime);
			GetReporting().FuncReport("Pass", "Clock started for <b>  " + text + " </b> at time: " + startTime);
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception for Start Clock for <b>" + text + " </b>");

		}
	}

	public void verifyElementIsDisplayed(MobileElement mobileElement, String metricName) throws Exception {
		try {

			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			endTime = Instant.now().toEpochMilli();

			System.out.println("The element <b> " + metricName + " </b> is displayed at time: " + endTime);
			GetReporting().FuncReport("Pass",
					"The element <b>" + metricName + " </b> is displayed at time: " + endTime);

			double dur = this.getDuration(metricName);
			System.out.println("processing took: " + dur);
			GetReporting().FuncReport("Pass", "Duration is: " + dur);

		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception for Verify Visibility on element <b>" + metricName
					+ "</b><br/>" + e.getLocalizedMessage());
		}
	}

	private double getDuration(String metricName) {
		// For App Launch startTime saved in xls
		String isLaunch = getTestDataInstance().TCParameters.get("Env");
		if (isLaunch != null && isLaunch.equals("Launch")) {
			startTime = Long.parseLong(getTestDataInstance().TCParameters.get("Amount"));
			getTestDataInstance().TCParameters.put("Env", null);
		}

		double dur = (double) ((endTime - startTime) / 1000.0);
		this.startTime = 0L;
		this.endTime = 0L;

		// Append new duration into record
		String record = getTestDataInstance().TCParameters.get("Timeout");
		if (record == null) {
			// Empty cell in datasheet returns Null
			record = "";
		}
		record += metricName + ":" + Double.toString(dur) + ";";
		getTestDataInstance().TCParameters.put("Timeout", record);
		return dur;
	}

	public void durationSummary() {

		String testID = this.getTestDataInstance().TestCaseID;
		String timestamp = new java.text.SimpleDateFormat("yyyyMMddHHmmss")
				.format(new java.util.Date(Instant.now().toEpochMilli()));
		String durations = getTestDataInstance().TCParameters.get("Timeout");
		System.out.println("Testcase ID: " + testID);
		System.out.println("Timestamp: " + timestamp);
		System.out.println("All durations: " + durations);

	}

}
