package com.td;

import java.util.HashMap;



public class RetrieveTestData extends _CommonPage{
	
	private RetrieveTestData RetrieveTestData;
	static HashMap<String,String> hm=null;
	
	public RetrieveTestData() {
		 hm=CL.getTestDataInstance().TCParameters;
	}
	
	public synchronized static String get(String key){
		
		return hm.get(key);
		
	}
	

}
