package com.td;

import java.time.Instant;

import org.bson.Document;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.td.test.framework.CommonLib;
import io.appium.java_client.MobileElement;

public class Performance extends CommonLib {

	public final int MaxTimeoutInSec = 20;
	private long startTime = 0L;
	private long endTime = 0L;
	private int MONGODB_PORT = 27017;
	// private String MONGODB_IP = "49.21.140.247"; //Macbook
	private String MONGODB_IP = "49.21.15.29"; // Jenkins
	private String MONGODB_DB = "performance";
	private String MONGODB_COLLECTION = "cmob_performance";

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
			double dur = this.getDuration(expectedText);
			System.out.println("processing took: " + dur);

			GetReporting().FuncReport("Pass",
					"The element <b>" + expectedText + " </b> is displayed at time: " + endTime);
			GetReporting().FuncReport("Pass", "Duration is: " + dur);

		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception for Verify Visibility on element <b>" + expectedText + "</b>");
		}
	}

	private double getDuration(String metricName) {
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

		this.transmitResults();

	}

	public void transmitResults() {
		// send results to file or DB
		MongoClient mongoClient = null;
		MongoCursor<Document> cursor = null;
		try {
			mongoClient = new MongoClient(MONGODB_IP, MONGODB_PORT);
			MongoDatabase database = mongoClient.getDatabase(MONGODB_DB);
			MongoCollection<Document> collection = database.getCollection(MONGODB_COLLECTION);

			String timestamp = new java.text.SimpleDateFormat("yyyyMMddHHmmss")
					.format(new java.util.Date(Instant.now().toEpochMilli()));
			Document doc = new Document("Testcase ID", getTestDataInstance().TestCaseID);
			doc.append("Timestamp", Double.parseDouble(timestamp));
			String[] durations = getTestDataInstance().TCParameters.get("Timeout").split(";");
			for (String dur : durations) {
				String[] metric = dur.split(":");
				doc.append(metric[0], Double.parseDouble(metric[1]));
			}
			// doc.append("Durations",
			// getTestDataInstance().TCParameters.get("Timeout"));
			collection.insertOne(doc);

			cursor = collection.find().iterator();
			while (cursor.hasNext()) {
				System.out.println(cursor.next().toJson());
			}
			System.out.println(collection.count());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cursor.close();
			mongoClient.close();
		}
	}

	private String[] getMetricNames(String testID) {
		String[] result = null;

		switch (testID) {
		case "Test1 Transfer":
			result = new String[] { "Metric - Between My Account screen", "Metric - Confirm screen",
					"Metric - Transfer Receipt screen" };
			break;

		case "Test2 Pay Bill":
			result = new String[] { "Metric - Pay Canadian Bill screen", "Metric - Confirm screen",
					"Metric - Bill Receipt screen" };
			break;

		case "Test3 Account Activity":
			result = new String[] { "Metric - Account Activity tab" };
			break;

		case "Test4 Quick Access":
			result = new String[] { "Metric - Quick Access screen" };
			break;

		case "Test5 Credit card":
			result = new String[] { "Metric - Credit Account screen", "Metric - Rewards screen",
					"Metric - Pay with Rewards screen" };
			break;

		case "Test6 P2P":
			result = new String[] { "Metric - Send Money screen", "Metric - Recipient Selected screen",
					"Metric - P2P Receipt screen" };
			break;

		case "Test7 My Accounts with/out Login":
			result = new String[] { "Metric - Login with authentication My Accounts screen",
					"Metric - Login without authentication My Accounts screen" };
			break;

		case "Test8 MIT Stock Sell":
			result = new String[] { "Metric - From Account list", "Metric - Stock Symbol Search screen",
					"Metric - Stock Symbol Selected screen", "Metric - Price Type list",
					"Metric - Confirm Order screen", "Metric - Trade Receipt screen" };
			break;

		case "Test9 MIT Stock Buy":
			result = new String[] { "Metric - From Account list", "Metric - Stock Symbol Search screen",
					"Metric - Stock Symbol Selected screen", "Metric - Price Type list",
					"Metric - Confirm Order screen", "Metric - Trade Receipt screen" };
			break;

		case "Test10 MIT Mutual Funds Buy":
			result = new String[] { "Metric - From Account list", "Metric - Stock Symbol Search screen",
					"Metric - Stock Symbol Selected screen", "Metric - Confirm Order screen",
					"Metric - Trade Receipt screen" };
			break;

		case "Test11 MIT Options":
			result = new String[] { "Metric - From Account list", "Metric - Stock Symbol Search screen",
					"Metric - Stock Symbol Selected screen", "Metric - Confirm Order screen",
					"Metric - Trade Receipt screen" };
			break;

		case "Test12 MIT Order Details":
			result = new String[] { "Metric - Investing Account screen", "Metric - Orders tab" };
			break;

		case "Test13 MIT Watchlists":
			result = new String[] { "Metric - Watchlists screen" };
			break;

		case "Test14 MIT Trade with/out Login":
			result = new String[] { "Metric - Login with authentication Trade screen",
					"Metric - Login without authentication Trade screen" };
			break;
		}

		return result;

	}
}
