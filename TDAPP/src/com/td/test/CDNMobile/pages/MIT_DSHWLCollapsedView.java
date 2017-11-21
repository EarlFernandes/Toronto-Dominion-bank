package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class MIT_DSHWLCollapsedView extends _CommonPage {

	private static MIT_DSHWLCollapsedView MIT_DSHWLCollapsedView;

	public synchronized static MIT_DSHWLCollapsedView get() {
		if (MIT_DSHWLCollapsedView == null) {
			MIT_DSHWLCollapsedView = new MIT_DSHWLCollapsedView();
		}
		return MIT_DSHWLCollapsedView;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}
	
	
}
