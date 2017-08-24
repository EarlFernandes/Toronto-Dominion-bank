package com.td.test.CDNMobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MIT_PNSViewAlertsLandingPage extends _CommonPage {

	private static MIT_PNSViewAlertsLandingPage MIT_PNSViewAlertsLandingPage;

	public synchronized static MIT_PNSViewAlertsLandingPage get() {
		if (MIT_PNSViewAlertsLandingPage == null) {
			MIT_PNSViewAlertsLandingPage = new MIT_PNSViewAlertsLandingPage();
		}
		return MIT_PNSViewAlertsLandingPage;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	private By ED_Alerts_Symbolfilter = By.id("symbol-filter");
	private By LBL_Alert_criteria = By.xpath("(//*[contains(text(),'Price drops below')])[1]");
	// private By LBL_PriceDropsBelow_Parent =
	// By.xpath("((//*[contains(text(),'Price drops below') or
	// contains(text(),'Baisse de cours
	// sous')])[1]/ancestor::div[@class='row'])[1]");
	/*
	 * private By LBL_PriceDropsBelow_Parent = By.
	 * xpath("(//*[contains(text(),'Price drops below')])[1]/parent::div/parent::div/parent::div/parent::div"
	 * );
	 * 
	 * private By LBL_PriceRisesAbove_Parent = By.
	 * xpath("((//*[contains(text(),'Price rises above') or contains(text(),'Hausse de cours au-dessus de')])[1]/ancestor::div[@class='row'])[1]"
	 * );
	 */
	private By LBL_CompanySymbol = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/*[1]/*[@class='company-symbol']");
	private By LBL_flagCA = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/*[1]/*[@class='sprite flag flag-ca']");
	private By LBL_flagUS = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/*[1]/*[@class='sprite flag flag-us']");
	private By LBL_CompanyName = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/*[1]/*[@class='text-prominent span-sub company-name wrap-fix']");
	private By BTN_Expand = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/parent::div/parent::div/*[2]/*[@class='sprite sprite-alert-expand']");
	private By BTN_Collapse = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/parent::div/parent::div/*[2]/*[@class='sprite sprite-alert-collapse']");
	// private By BTN_Quote = By.xpath("(//*[contains(text(),'drops below') or
	// contains(text(),'Baisse
	// de')])[1]/parent::div/parent::div/parent::div/*[2]/*[1]/*[1]/*[1]/*[@class='sprite
	// sprite-quote']");
	private By BTN_Quote = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/parent::div/*[2]/*[1]/*[1]/*[1]");
	// private By BTN_Pencil = By.xpath("(//*[contains(text(),'drops below') or
	// contains(text(),'Baisse
	// de')])[1]/parent::div/parent::div/parent::div/*[2]/*[1]/*[1]/*[2]/*[@class='sprite
	// sprite-pencil']");
	private By BTN_Pencil = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/parent::div/*[2]/*[1]/*[1]/*[2]");
	private By BTN_Buy = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/parent::div/*[2]/*[2]/*[1]/*[@class='btn btn-success buy']");
	private By BTN_Sell = By.xpath(
			"(//*[contains(text(),'drops below') or contains(text(),'Baisse de')])[1]/parent::div/parent::div/parent::div/*[2]/*[2]/*[1]/*[@class='btn btn-danger sell']");

	private By LBL_CompanySymbol_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/*[1]/*[@class='company-symbol']");
	private By LBL_flagCA_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/*[1]/*[@class='sprite flag flag-ca']");
	private By LBL_flagUS_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/*[1]/*[@class='sprite flag flag-us']");
	private By LBL_CompanyName_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/*[1]/*[@class='text-prominent span-sub company-name wrap-fix']");
	private By BTN_Expand_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/parent::div/parent::div/*[2]/*[@class='sprite sprite-alert-expand']");
	private By BTN_Collapse_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/parent::div/parent::div/*[2]/*[@class='sprite sprite-alert-collapse']");
	// private By BTN_Quote_PriceAbove = By.xpath("(//*[contains(text(),'rises
	// above') or contains(text(),'Hausse
	// de')])[1]/parent::div/parent::div/parent::div/*[2]/*[1]/*[1]/*[1]/*[@class='sprite
	// sprite-quote']");
	private By BTN_Quote_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/parent::div/*[2]/*[1]/*[1]/*[1]");
	// private By BTN_Pencil_PriceAbove = By.xpath("(//*[contains(text(),'rises
	// above') or contains(text(),'Hausse
	// de')])[1]/parent::div/parent::div/parent::div/*[2]/*[1]/*[1]/*[2]/*[@class='sprite
	// sprite-pencil']");
	private By BTN_Pencil_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/parent::div/*[2]/*[1]/*[1]/*[2]");
	private By BTN_Buy_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/parent::div/*[2]/*[2]/*[1]/*[@class='btn btn-success buy']");
	private By BTN_Sell_PriceAbove = By.xpath(
			"(//*[contains(text(),'rises above') or contains(text(),'Hausse de')])[1]/parent::div/parent::div/parent::div/*[2]/*[2]/*[1]/*[@class='btn btn-danger sell']");

	private By TAB_ActiveAlerts = By.xpath("//*[text()='Active Alerts' or text()='Alertes actives']");
	private By TAB_TriggeredAlerts = By.xpath("//*[text()='Triggered Alerts' or text()='Alertes d�clench�es']");

	@iOSFindBy(xpath = "//*[@label='Back' or @label='Retour']") // @Author -
																// Sushil
																// 07-Mar-2017
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement backButton;

	@iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@label,'Alerts') or contains(@label,'Alertes')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and (contains(@text,'Alerts') or contains(@text,'Alertes'))]")
	private MobileElement LBL_Alerts;

	public void verifyPriceDropsBelow() {
		Decorator();
		String symbolName = "";
		try {
			tapAlert();

			MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());
			mobileAction.verifyElementIsDisplayed(getMobileElement(TAB_ActiveAlerts), "Active Alerts");

			if (getTestdata("AlertType", XLSheetUserIDs).equalsIgnoreCase("Triggered"))
				mobileAction.FuncClick(getMobileElement(TAB_TriggeredAlerts), "Triggered Alerts");

			String[] sSymbolList = getTestdata("Symbol", XLSheetUserIDs).split(";");
			for (int i = 0; i < sSymbolList.length; i++) {
				symbolName = sSymbolList[i];
				CL.GetDriver().findElement(ED_Alerts_Symbolfilter).click();
				mobileAction.FuncSendKeys(getMobileElement(ED_Alerts_Symbolfilter), symbolName);
				// TradeMultiLeg.get().handleKeyboard();
				/*
				 * for(WebElement criteria:CL.GetDriver().findElement(
				 * LBL_PriceDropsBelow_Parent).findElements(By.
				 * xpath("@class='sprite sprite-quote'"))) {
				 * System.out.println(criteria.getText()); }
				 */

				// mobileAction.FuncSwipeWhileElementNotFound(getMobileElement(LBL_CompanyName),
				// false, 5, "down");
				if (mobileAction.isObjExists(getMobileElement(BTN_Collapse))) {
					mobileAction.FuncClick(getMobileElement(BTN_Collapse), "Collapse Button");
				}
				// CL.GetDriver().findElement(BTN_Expand).click();
				mobileAction.FuncClick(getMobileElement(BTN_Expand), "Expand Button");
				// CL.GetDriver().findElement(BTN_Collapse).click();
				mobileAction.FuncClick(getMobileElement(BTN_Collapse), "Collapse Button");
				// CL.GetDriver().findElement(BTN_Expand).click();
				mobileAction.FuncClick(getMobileElement(BTN_Expand), "Expand Button");

				// System.out.println(CL.GetDriver().findElement(LBL_Alert_criteria).getText());
				mobileAction.verifyElement((MobileElement) CL.GetDriver().findElement(LBL_CompanySymbol), symbolName);

				if (mobileAction.isObjExists(getMobileElement(LBL_flagCA)))
					mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_flagCA), "CA Flag");
				else
					mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_flagUS), "US Flag");

				mobileAction.FuncGetText(getMobileElement(LBL_CompanyName));

				// CL.GetDriver().findElement(BTN_Quote).click();
				mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_Quote), "Quote Button");
				mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_Pencil), "Pencil Button");
				mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_Buy), "Buy Button");
				mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_Sell), "Sell Button");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPriceRisesAbove() {
		Decorator();
		String symbolName = "";
		try {
			/*
			 * mobileAction.FuncClick(backButton, "backButton");
			 * mobileAction.FuncClick(LBL_Alerts, "Alerts");
			 * 
			 * Thread.sleep(5000);
			 */
			tapAlert();

			MIT_PNSAccessAlerts.get().FuncSwitchContext(MIT_PNSAccessAlerts.get().getWebViewContextString());
			mobileAction.verifyElementIsDisplayed(getMobileElement(TAB_ActiveAlerts), "Active Alerts");

			if (getTestdata("AlertType", XLSheetUserIDs).equalsIgnoreCase("Triggered"))
				mobileAction.FuncClick(getMobileElement(TAB_TriggeredAlerts), "Triggered Alerts");

			String[] sSymbolList = getTestdata("Symbol", XLSheetUserIDs).split(";");
			for (int i = 0; i < sSymbolList.length; i++) {
				symbolName = sSymbolList[i];
				CL.GetDriver().findElement(ED_Alerts_Symbolfilter).click();
				mobileAction.FuncSendKeys(getMobileElement(ED_Alerts_Symbolfilter), symbolName);

				if (mobileAction.isObjExists(getMobileElement(BTN_Collapse_PriceAbove))) {
					mobileAction.FuncClick(getMobileElement(BTN_Collapse_PriceAbove), "Collapse Button");
				}

				mobileAction.FuncClick(getMobileElement(BTN_Expand_PriceAbove), "Expand Button");

				mobileAction.FuncClick(getMobileElement(BTN_Collapse_PriceAbove), "Collapse Button");

				mobileAction.FuncClick(getMobileElement(BTN_Expand_PriceAbove), "Expand Button");

				mobileAction.verifyElement(getMobileElement(LBL_CompanySymbol_PriceAbove), symbolName);

				if (mobileAction.isObjExists(getMobileElement(LBL_flagCA_PriceAbove)))
					mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_flagCA_PriceAbove), "CA Flag");
				else
					mobileAction.verifyElementIsDisplayed(getMobileElement(LBL_flagUS_PriceAbove), "US Flag");

				mobileAction.FuncGetText(getMobileElement(LBL_CompanyName_PriceAbove));

				mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_Quote_PriceAbove), "Quote Button");
				mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_Pencil_PriceAbove), "Pencil Button");
				mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_Buy_PriceAbove), "Buy Button");
				mobileAction.verifyElementIsDisplayed(getMobileElement(BTN_Sell_PriceAbove), "Sell Button");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public MobileElement getMobileElement(By element) {
		try {
			return (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(element);
		} catch (Exception e) {
			return null;
		}
	}

	public void tapAlert() {
		Decorator();
		try {
			mobileAction.FuncClick(backButton, "backButton");
			mobileAction.FuncClick(LBL_Alerts, "Alerts");

			Thread.sleep(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
