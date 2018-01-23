package com.td;

import java.time.Instant;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.td.test.framework.CommonLib;
import io.appium.java_client.MobileElement;
import java.util.ArrayList;
import java.util.Arrays;

public class Performance extends CommonLib {

	public final int MaxTimeoutInSec = 20;
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
