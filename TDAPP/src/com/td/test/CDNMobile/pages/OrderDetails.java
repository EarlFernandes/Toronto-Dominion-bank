package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.MainScreen;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OrderDetails extends _CommonPage {
	private static OrderDetails OrderDetails;

	@iOSFindBy(xpath = "//*[@label='Change Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/action_bar_title' and @text='Change Order']")
	private MobileElement btnchangeorder;

	@iOSFindBy(xpath = "//*[@value='Enter your trading password']")
	private MobileElement trading_pwd;

	@iOSFindBy(xpath = "//*[@label='Preview Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btnContinue' and @text='Preview Order']")
	private MobileElement preview_order;

	@iOSFindBy(xpath = "//*[@label='Send Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/btn_continue' and @text='Send Order']")
	private MobileElement send_order;

	@iOSFindBy(xpath = "//*[@label='Agree']")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='Agree']")
	private MobileElement AgreeButton;

	@iOSFindBy(xpath = "//*[@label='Done']")
	private MobileElement done;

	@iOSFindBy(xpath = "//*[contains(@label,'The change to your order was received')]")
	private MobileElement changeOrder_Msg;

	@iOSFindBy(xpath = "//*[@label='Cancel Order']")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Cancel Order']")
	private MobileElement btncancelorder;

	@iOSFindBy(xpath = "//*[@label='In Progress']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message' and @text='Loading']")
	private MobileElement progressBar;


	@iOSFindBy(xpath = "//*[contains(@label,'Price')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/selectedText' and @text='Market']")
	private MobileElement selectPrice;
	
	int i = 1;
	String price_table = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]";
	String Firstpart = "//XCUIElementTypeCell[";
	String Secondpart = "]/XCUIElementTypeStaticText[1]";
	String Finalpart = Firstpart + i + Secondpart;
	
	public synchronized static OrderDetails get() {
		if (OrderDetails == null) {
			OrderDetails = new OrderDetails();
		}
		return OrderDetails;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	public void clickChangeorder() throws Exception {

		try {
			Decorator();
			mobileAction.FuncClick(btnchangeorder, "Change order");
			Thread.sleep(3000);
			mobileAction.FunCSwipeandScroll(trading_pwd, true);
			mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

			String trading_pwd_value = getTestdata("Trading_Pwd");
			mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
			mobileAction.FuncClick(done, "Done");
			mobileAction.FuncClick(preview_order, "preview_Order");
			mobileAction.FuncClick(AgreeButton, "Agree Button");
			mobileAction.FuncClick(send_order, "Send_Order");
			mobileAction.FuncClick(send_order, "Send_Order");

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}
	}

	public void cancelOrder() throws Exception {
		Decorator();
		try {
			mobileAction.FuncClick(btncancelorder, "Cancel order");
			Thread.sleep(3000);
			mobileAction.FunCSwipeandScroll(trading_pwd, true);
			mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

			String trading_pwd_value = getTestdata("Trading_Pwd");
			mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);

			mobileAction.FuncClick(done, "Done");

			mobileAction.waitForElementToVanish(progressBar);

			mobileAction.FuncClick(btncancelorder, "Cancel order");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will stock change order confirm screen in HoldingDetails
	 * page.
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyStockChangeorderConfirmScreen() throws Exception {

		try {
			Decorator();
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.FuncClick(btnchangeorder, "Change order");
				Thread.sleep(3000);
				mobileAction.FuncClick(selectPrice, "Price Selected");

				String price_value = getTestdata("Price");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				mobileAction.FunCSwipeandScroll(trading_pwd, true);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

				String trading_pwd_value = getTestdata("Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				mobileAction.FuncClick(done, "Done");
				mobileAction.FuncClick(preview_order, "preview_Order");
				Thread.sleep(3000);
				mobileAction.FuncClick(AgreeButton, "Agree Button");
			} else {
				mobileAction.FuncClick(btnchangeorder, "Change order");
				Thread.sleep(3000);
				mobileAction.FuncClick(selectPrice, "Price Selected");

				String price_value = getTestdata("Price");
				mobileAction.FuncSelectElementInTable(price_table, Firstpart, Secondpart, price_value);
				mobileAction.FunCSwipeandScroll(trading_pwd, true);
				mobileAction.FuncClick(trading_pwd, "Trading_Pwd");

				String trading_pwd_value = getTestdata("Trading_Pwd");
				mobileAction.FuncSendKeys(trading_pwd, trading_pwd_value);
				// mobileAction.FuncClick(done, "Done");
				mobileAction.FuncHideKeyboard();
				mobileAction.FuncClick(preview_order, "preview_Order");
				Thread.sleep(3000);
				mobileAction.FuncClick(AgreeButton, "Agree Button");

			}

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}
	}

}
