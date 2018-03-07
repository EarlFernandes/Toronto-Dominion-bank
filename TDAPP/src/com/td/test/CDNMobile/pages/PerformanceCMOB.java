package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;
import com.td._CommonPage;

public class PerformanceCMOB extends _CommonPage {

	private int MONGODB_PORT = 27017;
	private String MONGODB_IP = "49.21.15.29"; // Jenkins
	private String MONGODB_DB = "performance";
	private String COLLECTION_PEFORMANCE = "cmob_performance";
	private String COLLECTION_EXECUTIONS = "executions";

	private static PerformanceCMOB performanceCMOB;

	public synchronized static PerformanceCMOB get() {
		if (performanceCMOB == null) {
			performanceCMOB = new PerformanceCMOB();
		}
		return performanceCMOB;
	}

	public void transmitDurationSummary() {
		try {
			performance.durationSummary();

			MongoClient mongoClient = new MongoClient(MONGODB_IP, MONGODB_PORT);
			MongoDatabase database = mongoClient.getDatabase(MONGODB_DB);
			MongoCollection<Document> coll_performance = database.getCollection(COLLECTION_PEFORMANCE);

			System.out.println("Device name: " + getTestdata("AccessCard"));
			System.out.println("Device udid: " + getTestdata("Description"));
			System.out.println("App Version: " + getTestdata("Payee"));

			Document doc = new Document("Testcase ID", CL.getTestDataInstance().TestCaseID);
			doc.append("Device Name", getTestdata("AccessCard"));
			doc.append("Device UDID", getTestdata("Description"));
			doc.append("App Version", getTestdata("Payee"));
			doc.append("Timestamp", new java.util.Date(Instant.now().toEpochMilli()));
			String[] durations = CL.getTestDataInstance().TCParameters.get("Timeout").split(";");
			for (String dur : durations) {
				String[] metric = dur.split(":");
				doc.append(metric[0], Double.parseDouble(metric[1]));
			}

			coll_performance.insertOne(doc);

			mongoClient.close();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				CL.GetReporting().FuncReport("Fail", "Failed to transmit results: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
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
			CL.GetReporting().FuncReport("Pass", "Execution Start Time: " + startTime);

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
			CL.GetReporting().FuncReport("Pass", "Execution End Time: " + endTime);

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
			CL.GetReporting().FuncReport("Pass", doc);

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
					CL.GetReporting().FuncReport("Pass", firstDoc);
				}
			}

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
				CL.GetReporting().FuncReport("Pass", doc);
			} else {
				CL.GetReporting().FuncReport("Pass", "No executions for: " + testcaseID);
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
				"Test4 Quick Access", "Test5 Credit card", "Test6 P2P", "Test7 My Accounts with and without Login",
				"Test8 MIT Stock Sell", "Test9 MIT Stock Buy", "Test10 MIT Mutual Funds Buy", "Test11 MIT Options",
				"Test12 MIT Order Details", "Test13 MIT Watchlists", "Test14 MIT Trade with and without Login" };

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

		case "Test7 My Accounts with and without Login":
			result = new String[] { "Metric - Launch App, Metric - Login with authentication My Accounts screen",
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
					"Metric - Option Selected screen", "Metric - Confirm Order screen",
					"Metric - Trade Receipt screen" };
			break;

		case "Test12 MIT Order Details":
			result = new String[] { "Metric - Investing Account screen", "Metric - Orders tab" };
			break;

		case "Test13 MIT Watchlists":
			result = new String[] { "Metric - Watchlists screen" };
			break;

		case "Test14 MIT Trade with and without Login":
			result = new String[] { "Metric - Launch App, Metric - Login with authentication Trade screen",
					"Metric - Login without authentication Trade screen" };
			break;
		}

		return result;

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
			CL.GetReporting().FuncReport("Pass", doc);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			cursor.close();
			mongoClient.close();
		}
	}

}
