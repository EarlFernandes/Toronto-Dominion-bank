package com.td.test.TDI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class TDIManagePolicies extends _CommonPage {

	private static TDIManagePolicies TDIManagePolicies;
	
	
	
	
	
	public synchronized static TDIManagePolicies get() {
		if (TDIManagePolicies == null) {
			TDIManagePolicies = new TDIManagePolicies();
		}
		return TDIManagePolicies;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}


	
	
}
