package com.td.test.CDNMobile.pages;

import com.td._CommonPage;

public class PerformanceSummary extends _CommonPage {

	private static PerformanceSummary performanceSummary;

	public synchronized static PerformanceSummary get() {
		if (performanceSummary == null) {
			performanceSummary = new PerformanceSummary();
		}
		return performanceSummary;
	}

	public void setStartTime() {
		performance.setStartTime();
	}

	public void setEndTime() {
		performance.setEndTime();
	}

	public void getDurationSummary() {
		performance.durationSummary();
	}

	public void generateReport() {
		performance.generateReport();
	}
}
