package com.td.test.CDNMobile;

import com.td.test.framework.*;
import com.td.test.runner.*;
import java.util.concurrent.TimeUnit;

public class main extends Thread {

	public static  com.td.test.runner.ParallelRunManager pm = new com.td.test.runner.ParallelRunManager();
	
       public static  void main(String[] args) {
              // TODO Auto-generated method stub
              // com.td.test.framework.MainScript.main(args);
    	    
    	      
              pm.instancesrequired=1; // max 5
              pm.main(args);
              //pm.instancesrequired
              
       }

       
 
   	
}