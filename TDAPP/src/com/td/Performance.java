package com.td;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.AggregationOutput;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.mongodb.util.JSON;
import com.td.test.framework.CommonLib;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class Performance extends CommonLib {

	public final int MaxTimeoutInSec = 20;
	private long startTime = 0L;
	private long endTime = 0L;
	private int MONGODB_PORT = 27017;
	// private String MONGODB_IP = "49.21.140.247"; //Macbook
	private String MONGODB_IP = "49.21.15.29"; // Jenkins
	private String MONGODB_DB = "performance";
	private String COLLECTION_PEFORMANCE = "cmob_performance";
	private String COLLECTION_EXECUTIONS = "executions";

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
			MongoCollection<Document> coll_performance = database.getCollection(COLLECTION_PEFORMANCE);
			MongoCollection<Document> coll_executions = database.getCollection(COLLECTION_EXECUTIONS);

			System.out.println("Device name: " + this.getTestDataInstance().getDeviceName());
			System.out.println("Device udid: " + this.getTestDataInstance().getDeviceUdid());

			Document doc = new Document("Testcase ID", getTestDataInstance().TestCaseID);
			doc.append("Device Name", this.getTestDataInstance().getDeviceName());
			doc.append("Device UDID", this.getTestDataInstance().getDeviceUdid());
			doc.append("Timestamp", new java.util.Date(Instant.now().toEpochMilli()));
			String[] durations = getTestDataInstance().TCParameters.get("Timeout").split(";");
			for (String dur : durations) {
				String[] metric = dur.split(":");
				doc.append(metric[0], Double.parseDouble(metric[1]));
			}
			coll_performance.insertOne(doc);

			// this.listAllDocs(this.COLLECTION_PEFORMANCE);

		} catch (Exception e) {
			e.printStackTrace();
			try {
				GetReporting().FuncReport("Fail", "Failed to transmit results: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
		} finally {
			mongoClient.close();
		}
	}

	public void setStartTime() {
		// send results to file or DB
		MongoClient mongoClient = null;
		try {
			mongoClient = new MongoClient(MONGODB_IP, MONGODB_PORT);
			MongoDatabase database = mongoClient.getDatabase(MONGODB_DB);
			MongoCollection<Document> coll_executions = database.getCollection(COLLECTION_EXECUTIONS);

			Date startTime = new java.util.Date(Instant.now().toEpochMilli());
			Document doc = new Document("start_time", startTime);
			doc.append("end_time", startTime);
			coll_executions.insertOne(doc);

			// this.listAllDocs(this.COLLECTION_EXECUTIONS);
			GetReporting().FuncReport("Pass", "Execution Start Time: " + startTime);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}
	}

	public void setEndTime() {
		// send results to file or DB
		MongoClient mongoClient = null;
		MongoCursor<Document> cursor = null;

		try {
			mongoClient = new MongoClient(MONGODB_IP, MONGODB_PORT);
			MongoDatabase database = mongoClient.getDatabase(MONGODB_DB);
			MongoCollection<Document> coll_executions = database.getCollection(COLLECTION_EXECUTIONS);

			// Find last(current) execution start time
			cursor = coll_executions.find().sort(new Document("start_time", -1)).limit(1).iterator();
			Document d = cursor.next();
			Date startDate = (Date) d.get("start_time");
			String doc = d.toJson() + "<br>\n";
			doc += "Current Start time: " + startDate + "<br>\n";
			System.out.print(doc);
			cursor.close();

			// update end time for current execution
			Date endTime = new java.util.Date();
			coll_executions.updateOne(Filters.eq("start_time", startDate),
					new Document("$set", new Document("end_time", endTime)));

			// this.listAllDocs(this.COLLECTION_EXECUTIONS);
			GetReporting().FuncReport("Pass", "Execution End Time: " + endTime);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}
	}

	public void generateReport() {
		MongoClient mongoClient = null;
		MongoCursor<Document> cursor = null;
		// String[] testcaseIDs = { "Test1 Transfer" };
		String[] testcaseIDs = this.getTestcaseList();

		try {
			mongoClient = new MongoClient(MONGODB_IP, MONGODB_PORT);
			MongoDatabase database = mongoClient.getDatabase(MONGODB_DB);
			MongoCollection<Document> coll_performance = database.getCollection(COLLECTION_PEFORMANCE);
			MongoCollection<Document> coll_executions = database.getCollection(COLLECTION_EXECUTIONS);

			// Find current execution start, end times
			cursor = coll_executions.find().sort(new Document("start_time", -1)).limit(1).iterator();
			Document d = cursor.next();
			Date startDate = (Date) d.get("start_time");
			Date endDate = (Date) d.get("end_time");

			String doc = "<b>Performance Test Execution</b><br>\n";
			doc += "Start time: " + startDate + "<br>\n";
			doc += "End time: " + endDate + "<br>\n";
			System.out.println(doc);
			GetReporting().FuncReport("Pass", doc);

			for (String id : testcaseIDs) {
				int numPerf = this.listAllPerformancesByExec(id, startDate, endDate);

				if (numPerf > 0) {
					String[] metricList = this.getMetricNames(id);
					String firstDoc = "<b>Metrics Avg - : " + id + "</b><br>\n";
					for (String metric : metricList) {
						// Group by Testcase ID then find metric avgs
						AggregateIterable<Document> output = coll_performance.aggregate(Arrays.asList(
								Aggregates.match(Filters.eq("Testcase ID", id)),
								Aggregates.match(Filters.gte("Timestamp", new java.util.Date(startDate.getTime()))),
								Aggregates.match(Filters.lte("Timestamp", new java.util.Date(endDate.getTime()))),
								Aggregates.group("$Testcase ID", Accumulators.avg(metric, "$" + metric)),
								Aggregates.project(Projections.excludeId())));

						// firstDoc += output.first().toJson() + "<br>\n";
						firstDoc += metric + ": " + output.first().get(metric) + "<br>\n";
					}

					System.out.println(firstDoc);
					GetReporting().FuncReport("Pass", firstDoc);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cursor.close();
			mongoClient.close();
		}
	}

	public void listAllDocs(String collectionName) {
		MongoClient mongoClient = null;
		MongoCursor<Document> cursor = null;
		try {
			mongoClient = new MongoClient(MONGODB_IP, MONGODB_PORT);
			MongoDatabase database = mongoClient.getDatabase(MONGODB_DB);
			MongoCollection<Document> collection = database.getCollection(collectionName);

			String doc = "";
			cursor = collection.find().iterator();
			while (cursor.hasNext()) {
				doc += cursor.next().toJson() + "<br>\n";
			}
			System.out.println(doc);
			System.out.println(collection.count());
			GetReporting().FuncReport("Pass", doc);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cursor.close();
			mongoClient.close();
		}
	}

	public int listAllPerformancesByExec(String testcaseID, Date startDate, Date endDate) {
		MongoClient mongoClient = null;
		MongoCursor<Document> cursor = null;
		int count = 0;
		try {
			mongoClient = new MongoClient(MONGODB_IP, MONGODB_PORT);
			MongoDatabase database = mongoClient.getDatabase(MONGODB_DB);
			MongoCollection<Document> collection = database.getCollection(this.COLLECTION_PEFORMANCE);

			Bson query = Filters.and(Filters.eq("Testcase ID", testcaseID), Filters.gte("Timestamp", startDate),
					Filters.lte("Timestamp", endDate));
			cursor = collection.find(query).projection(Projections.exclude("_id", "Testcase ID")).iterator();

			String doc = "<b>Test Runs - " + testcaseID + " </b><br>\n";
			while (cursor.hasNext()) {
				doc += cursor.next().toJson() + "<br>\n";
				count++;
			}
			doc += "Number of iterations: " + count;
			if (count > 0) {
				System.out.println(doc);
				GetReporting().FuncReport("Pass", doc);
			} else {
				GetReporting().FuncReport("Pass", "No executions for: " + testcaseID);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cursor.close();
			mongoClient.close();
		}

		return count;
	}

	private String[] getTestcaseList() {
		String[] list = new String[] { "Test1 Transfer", "Test2 Pay Bill", "Test3 Account Activity",
				"Test4 Quick Access", "Test5 Credit card", "Test6 P2P", "Test7 My Accounts without Login",
				"Test8 MIT Stock Sell", "Test9 MIT Stock Buy", "Test10 MIT Mutual Funds Buy", "Test11 MIT Options",
				"Test12 MIT Order Details", "Test13 MIT Watchlists", "Test14 MIT Trade without Login" };

		return list;
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

		case "Test7 My Accounts without Login":
			// result = new String[] { "Metric - Login with authentication My
			// Accounts screen",
			// "Metric - Login without authentication My Accounts screen" };
			result = new String[] { "Metric - Login without authentication My Accounts screen" };
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

		case "Test14 MIT Trade without Login":
			result = new String[] { "Metric - Login with authentication Trade screen",
					"Metric - Login without authentication Trade screen" };
			break;
		}

		return result;

	}

}
