package com.td.test.myspend;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;
import com.td.test.CDNMobile.pages.GetDate;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;

public class SpendingGraph extends _CommonPage {

	private static SpendingGraph SpendingGraph;

	public synchronized static SpendingGraph get() {
		if (SpendingGraph == null) {
			SpendingGraph = new SpendingGraph();
		}
		return SpendingGraph;
	}

	String platform = null;

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
		platform = CL.getTestDataInstance().getMobilePlatForm();

	}

	@AndroidFindBy(xpath = "//android.view.View[@resource-id='moneyPathChartOuter' or contains(@content-desc,'As of today')]")
	private MobileElement spendingDetails;

	/**
	 * This method will verify the Spending Spike page details.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * 
	 */
	public void verifySpendingGraphPageDetails() {
		Decorator();
		String currentMonth = GetDate.getCurrentMonth();
		String graphPageHeader = "//android.view.View[contains(@content-desc,'" + currentMonth + " Spending')]";

		try {
			MobileElement spendingGraphHeaderElement = (MobileElement) (CL.GetAppiumDriver())
					.findElement(By.xpath(graphPageHeader));
			String headerText = spendingGraphHeaderElement.getAttribute("name");
			mobileAction.verifyElementIsDisplayed(spendingGraphHeaderElement, headerText);

			String spendingDetailsText = spendingDetails.getAttribute("name");
			String[] spendingTextArr = spendingDetailsText.split(". ");
			mobileAction.stringToReport("Pass", "Spending Status: " + spendingTextArr[0] + " is verified");
			mobileAction.stringToReport("Pass", "Total Spending: " + spendingTextArr[1] + " is verified");
			mobileAction.stringToReport("Pass", "Typical Spending: " + spendingTextArr[2] + " is verified");
			mobileAction.stringToReport("Pass", "Spending Spike: " + spendingTextArr[3] + " is verified");
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("Fail",
						"NoSuchElementException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			try {
				CL.GetReporting().FuncReport("Fail", "IOException from Method " + this.getClass().toString());
			} catch (IOException e1) {
				System.err.println("Failed to write in report.");
			}
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}
}
