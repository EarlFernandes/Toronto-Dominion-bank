package com.td.test.TDI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class TDIInsuranceCard extends _CommonPage {

	private static TDIInsuranceCard TDIInsuranceCard;
	
	
	
	public synchronized static TDIInsuranceCard get() {
		if (TDIInsuranceCard == null) {
			TDIInsuranceCard = new TDIInsuranceCard();
		}
		return TDIInsuranceCard;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

}
