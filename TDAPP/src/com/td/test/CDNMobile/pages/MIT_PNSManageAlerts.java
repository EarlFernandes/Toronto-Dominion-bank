package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MIT_PNSManageAlerts extends _CommonPage {
	private static MIT_PNSManageAlerts MIT_PNSManageAlerts;

	public synchronized static MIT_PNSManageAlerts get() {
		if (MIT_PNSManageAlerts == null) {
			MIT_PNSManageAlerts = new MIT_PNSManageAlerts();
		}
		return MIT_PNSManageAlerts;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	private By BTN_Expand_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/parent::div/parent::div/*[2]/*[@class='sprite sprite-alert-expand']");
	private By BTN_Pencil_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/parent::div/*[2]/*[1]/*[1]/*[2]/*[@class='sprite sprite-pencil']");
	private By BTN_Pencil_Edit = By.xpath("(//*[@class='sprite sprite-pencil'])[1]");
	private By BTN_Quote = By.xpath("(//*[@class='sprite sprite-quote'])[1]");
	private By BTN_Buy = By.xpath("(//*[@class='btn btn-success buy'])[1]");
	private By BTN_Sell = By.xpath("(//*[@class='btn btn-danger sell'])[1]");
	private By LBL_Symbol = By.xpath("(//*[@class='symbol'])[1]");
	private By LBL_lastPrice = By.xpath("(//*[@class='lastPrice'])[1]");
	private By LBL_companyName = By.xpath("//*[@class='text-prominent companyName wrap-fix']");
	private By LBL_fiftyTwoWeekRangeBar = By.xpath("//*[@class='fiftyTwoWeekRangeBar']");
	private By LBL_VOL = By.xpath("//*[@class='dataList']/li[1]/*[@class='sub-text']");
	private By LBL_AvgVOL = By.xpath("//*[@class='dataList']/li[2]/*[@class='sub-text']");
	private By LBL_PERatio = By.xpath("//*[@class='dataList']/li[2]/*[@class='sub-text']");
	private By LBL_AlertCondition = By.xpath("//*[@class='heading-4 condition-name']");
	private By ED_Price = By.id("Price");
	private By IMG_BellIcon = By.xpath("//*[@class='img-responsive']");
	private By LBL_ChangeCondition = By.xpath("//*[@class='symbol pull-left']");
	private By LBL_DeliveryPreference = By.xpath("//*[@class='tablesorter-header delivery-method-header']");
	private By LBL_PushNotification = By.xpath("(//*[@class='symbol'])[2]");
	private By BTN_PushNotificationToggle = By
			.xpath(("(//*[@class='symbol'])[2]/../../*[@class='text-right delivery-switch']"));
	private By LBL_PrimaryEmail = By.xpath("(//*[@class='symbol'])[3]");
	private By BTN_PrimaryEmailToggle = By
			.xpath(("//*[@class='symbol'])[3]/../../*[@class='text-right delivery-switch']"));
	private By LBL_SecondaryEmail = By.xpath("(//*[@class='symbol'])[4]");
	private By BTN_SecondaryEmailToggle = By
			.xpath(("//*[@class='symbol'])[4]/../../*[@class='text-right delivery-switch']"));
	private By BTN_SaveChanges = By.xpath("(//*[@type='submit'])[1]");
	private By LBL_PriceRisesAbove = By.xpath("(//*[@class='symbol'])[3]");
	private By LBL_PriceAbove = By.xpath("(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]");
	private By TAB_TriggeredAlerts = By.xpath("//*[text()='Triggered Alerts' or text()='Alertes déclenchées']");

	@iOSFindBy(xpath = "//*[@label='Trade' or @label='Négociation']") // @Author
																		// -
																		// Sushil
																		// 08-Feb-2017
	@AndroidFindBy(xpath = "//*[@text='Trade' or @text='Négociation']")
	private MobileElement titleTrade;

	public void verifyEditAlertUI() {
		Decorator();
		try {
			// MIT_PNSViewAlertsLandingPage.get().tapAlert();

			MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());

			// mobileAction.FuncClick(getMobileElement(BTN_Expand_PriceAbove),
			// "BTN_Expand_PriceAbove");
			/*
			 * try{ CL.GetDriver().findElement(BTN_Expand_PriceAbove).click(); }
			 * catch(Exception e1) {
			 * 
			 * } //getMobileElement(BTN_Expand_PriceAbove).click();
			 * //FuncSwipeWhileElementNotFound_WebView(BTN_Expand_PriceAbove,7,
			 * "up","BTN_Expand_PriceAbove"); FuncSwipeOnce_WebView("up");
			 */
			FuncScrollToElement(BTN_Expand_PriceAbove);

			mobileAction.FuncClick(getMobileElement(BTN_Expand_PriceAbove), "BTN_Expand_PriceAbove");
			mobileAction.FuncClick(getMobileElement(BTN_Pencil_PriceAbove), "Pencil Edit Button");
			mobileAction.FuncGetText(getMobileElement(LBL_Symbol));
			mobileAction.FuncGetText(getMobileElement(LBL_lastPrice));
			mobileAction.FuncGetText(getMobileElement(LBL_companyName));
			mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_fiftyTwoWeekRangeBar), "fiftyTwoWeekRangeBar");
			mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_VOL), "VOL");
			mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_AvgVOL), "AVG VOL");
			mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_PERatio), "P/E Ratio");
			mobileAction.FuncGetText(getMobileElement(LBL_AlertCondition));
			mobileAction.FuncGetText(getMobileElement(ED_Price));
			mobileAction.verifyElementIsDisplayed(getMobileElement(IMG_BellIcon), "Bell Icon");
			mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_ChangeCondition), "Change Condition");
			mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_DeliveryPreference), "Delivery Preference");
			FuncScrollToElement(LBL_PushNotification);
			mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_PushNotification), "Push Notification");
			mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_PushNotificationToggle),
					"Push Notification Toggle Button");
			FuncScrollToElement(LBL_PrimaryEmail);
			mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_PrimaryEmail), "Primary Email");
			mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_PrimaryEmailToggle),
					"Primary Email Toggle Button");
			FuncScrollToElement(LBL_SecondaryEmail);
			mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_SecondaryEmail), "Secondary Email");
			mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_SecondaryEmailToggle),
					"Secondary Email Toggle Button");
			mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_SaveChanges), "Save Changes Button");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDefaultWhenAlertConditionChange() {
		Decorator();
		try {
			MIT_PNSViewAlertsLandingPage.get().tapAlert();

			MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());

			mobileAction.FuncClick(getMobileElement(BTN_Pencil_Edit), "Pencil Edit Button");

			mobileAction.FuncClick(getMobileElement(LBL_ChangeCondition), "Change Condition");
			mobileAction.FuncClick(getMobileElement(LBL_PriceRisesAbove), "Price Rises Above Condition");
			mobileAction.FuncVerifyBlankValue(getMobileElement(ED_Price), "Amount");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPriceChangesFromPreviousClose() {
		Decorator();
		try {
			MIT_PNSViewAlertsLandingPage.get().tapAlert();

			MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());

			mobileAction.FuncClick(getMobileElement(BTN_Pencil_Edit), "Pencil Edit Button");

			mobileAction.FuncClick(getMobileElement(LBL_ChangeCondition), "Change Condition");
			mobileAction.FuncClick(getMobileElement(LBL_PriceRisesAbove), "Price Rises Above Condition");
			mobileAction.FuncSendKeys(getMobileElement(ED_Price), String.valueOf(getPriceAboveCurrentPrice()));
			mobileAction.FuncClick(getMobileElement(BTN_SaveChanges), "Save Changes");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPriceEarningRatioDropsBelow() {
		Decorator();
		try {
			MIT_PNSViewAlertsLandingPage.get().tapAlert();

			MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());

			mobileAction.FuncClick(getMobileElement(BTN_Pencil_Edit), "Pencil Edit Button");

			mobileAction.FuncClick(getMobileElement(LBL_ChangeCondition), "Change Condition");
			mobileAction.FuncClick(getMobileElement(LBL_PriceRisesAbove), "Price Rises Above Condition");
			mobileAction.FuncSendKeys(getMobileElement(ED_Price), String.valueOf(getPriceAboveCurrentPrice()));
			String sNewPrice = String.valueOf(getPriceAboveCurrentPrice());
			mobileAction.FuncClick(getMobileElement(BTN_SaveChanges), "Save Changes");
			Thread.sleep(5000);
			mobileAction.verifyElementTextContains(getMobileElement(LBL_PriceAbove), sNewPrice);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyExceedDailyVolume() {
		Decorator();
		try {
			MIT_PNSViewAlertsLandingPage.get().tapAlert();

			MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());

			mobileAction.FuncClick(getMobileElement(BTN_Pencil_Edit), "Pencil Edit Button");

			mobileAction.FuncClick(getMobileElement(LBL_ChangeCondition), "Change Condition");
			mobileAction.FuncClick(getMobileElement(LBL_PriceRisesAbove), "Price Rises Above Condition");
			mobileAction.FuncSendKeys(getMobileElement(ED_Price), String.valueOf(getPriceAboveCurrentPrice()));
			mobileAction.FuncClick(getMobileElement(BTN_SaveChanges), "Save Changes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToQuotePage() {
		Decorator();
		try {
			MIT_PNSViewAlertsLandingPage.get().tapAlert();

			MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());

			if (getTestdata("AlertType", XLSheetUserIDs).equalsIgnoreCase("Triggered"))
				mobileAction.FuncClick(getMobileElement(TAB_TriggeredAlerts), "Triggered Alerts");

			mobileAction.FuncClick(getMobileElement(BTN_Quote), "Quote Button");

			mobileAction.verifyElementUsingXPath(
					"//button[@class='btn btn-default create-alert glyphicon glyphicon-bell']", "Alert Icon");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void navigateToOrderForm() {
		Decorator();
		try {
			MIT_PNSViewAlertsLandingPage.get().tapAlert();

			MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());

			if (getTestdata("AlertType", XLSheetUserIDs).equalsIgnoreCase("Triggered"))
				mobileAction.FuncClick(getMobileElement(TAB_TriggeredAlerts), "Triggered Alerts");

			if (!getTestdata("Action", XLSheetUserIDs).equalsIgnoreCase("Sell"))
				mobileAction.FuncClick(getMobileElement(BTN_Buy), "Buy Button");
			else
				mobileAction.FuncClick(getMobileElement(BTN_Sell), "Sell Button");

			MIT_PNSAccessAlerts.get().FuncSwitchContext("NATIVE_APP");

			mobileAction.verifyElementIsDisplayed(titleTrade, "Trade Header");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double getPriceAboveCurrentPrice() {
		String sAbovePrice = "";
		try {
			sAbovePrice = CL.GetDriver().findElement(LBL_lastPrice).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Double.parseDouble(sAbovePrice) + 1;
	}

	public double getPriceBelowCurrentPrice() {
		String sBelowPrice = "";
		try {
			sBelowPrice = CL.GetDriver().findElement(LBL_lastPrice).getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Double.parseDouble(sBelowPrice) - 1;
	}

	public MobileElement getMobileElement(By element) {
		try {
			return (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(element);
		} catch (Exception e) {
			return null;
		}
	}

	public void FuncScrollToElement(By Element) {
		try {
			CL.GetDriver().findElement(Element).click();
		} catch (Exception e1) {

		}
		FuncSwipeOnce_WebView("up");
	}

	public void FuncSwipeOnce_WebView(String sDirection) {
		try {
			MIT_PNSAccessAlerts.get().FuncSwitchContext("NATIVE_APP");

			mobileAction.FuncSwipeOnce(sDirection);
		} catch (Exception e) {
			e.printStackTrace();
		}

		MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());
	}

}
