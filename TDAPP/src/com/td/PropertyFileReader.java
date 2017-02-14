package com.td;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;





public class PropertyFileReader {
	
	private String propFileName = null;
	
	public PropertyFileReader(String FileName)
	{
		propFileName = FileName;
	}
	
	public String getProperty(String Key)
	{
		String Parameters = "Key : "+Key+"\n";
		String result = "";
		try
		{
			Properties prop = new Properties();
			
			InputStream inputStream = new FileInputStream(propFileName);
			
			prop.load(inputStream);
			
			result = prop.getProperty(Key);
			if(result == null)
			{
				throw new Exception("The Key - "+Key+" Is not found in the File -  "+propFileName+"\n\n");
			}
		}
		catch(Exception exception)
		{
			
			System.out.println(exception.toString());
		}
		
		
		return result;
	}
	
}


