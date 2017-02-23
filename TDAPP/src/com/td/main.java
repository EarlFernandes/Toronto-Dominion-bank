package com.td;

public class main extends Thread {

	public static com.td.test.runner.ParallelRunManager pm = new com.td.test.runner.ParallelRunManager();

	public static void main(String[] args) {
		pm.instancesrequired = 1; // max 5
		pm.main(args);
	}

}
