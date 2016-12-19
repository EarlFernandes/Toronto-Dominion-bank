package com.td.test.CDNMobile;

public class main extends Thread {

	public static com.td.test.runner.ParallelRunManager pm = new com.td.test.runner.ParallelRunManager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// com.td.test.framework.MainScript.main(args);
		pm.instancesrequired = 1; // max 5
		pm.main(args);

	}

}