package com.td.test.CDNMobile.pages;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.Maps;
import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MIT_DSHNewProfileLogic extends _CommonPage {

	private static MIT_DSHNewProfileLogic MIT_DSHNewProfileLogic;

	public synchronized static MIT_DSHNewProfileLogic get() {
		if (MIT_DSHNewProfileLogic == null) {
			MIT_DSHNewProfileLogic = new MIT_DSHNewProfileLogic();
		}
		return MIT_DSHNewProfileLogic;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	@iOSXCUITFindBy(xpath = "//*[@name='actionSheetCancelButton']/../../XCUIElementTypeCell/*[1]")
	@AndroidFindBy(xpath = "//*[@resource-id='android.widget.LinearLayout']")
	private List<MobileElement> LST_WLFlyout;

	public void verifyQLOrderBlendedInvestingFocus() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String[] aQuickLinksAndroid = { getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRADE),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_HOLDINGS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_ORDERS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_SENDMONEY),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRANSFER),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_DEPOSIT),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_PAYBILL),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_PAYNOW) };
				
				verifyQuickLinksOrder(aQuickLinksAndroid);
				
			} else {
				String[] aQuickLinksiOS = { getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRADE),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_HOLDINGS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_ORDERS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_SENDMONEY),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRANSFER),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_DEPOSIT),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_PAYBILL),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_APPLEPAY) };
				
				verifyQuickLinksOrder(aQuickLinksiOS);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verifyFlyoutOrderBlendedInvestingFocus() {
		Decorator();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String[] aQuickLinksAndroid = { getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRADE),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_HOLDINGS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_ORDERS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_SENDMONEY),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRANSFER),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_DEPOSIT),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_PAYBILL),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_PAYNOW) };
				
				verifyQuickLinksOrder(aQuickLinksAndroid);
				
			} else {
				String[] aQuickLinksiOS = { getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRADE),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_HOLDINGS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_ORDERS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_SENDMONEY),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_TRANSFER),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_DEPOSIT),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_PAYBILL),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_QUICKLINK_APPLEPAY) };
				
				verifyQuickLinksOrder(aQuickLinksiOS);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQuickLinksOrder(String[] aQL) {
		Decorator();
		HashMap<String, Integer> mActual = new HashMap<String, Integer>();
		HashMap<String, Integer> mExpected = new HashMap<String, Integer>();
		int iIndex = 0;
		String sQLName = null;

		try {
			for (int i = 0; i < aQL.length; i++) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					String xpathQuickLink = "//*[@text='" + aQL[i] + "']";
					if (MIT_DSHQuickLinks.get().verifyQuickLinkExistsByXpath(xpathQuickLink, aQL[i])) {

						for (WebElement mEle : CL.GetDriver()
								.findElements(By.xpath("//*[@resource-id='com.td:id/quick_link']/*[2]"))) {
							sQLName = mobileAction.FuncGetElementText(mEle);
							if (!mActual.containsKey(sQLName)) {
								mActual.put(sQLName, iIndex);
								iIndex++;
							}
						}
					}

				} else {
					if (MIT_DSHQuickLinks.get().verifyQuickLinkExistsByXpath("//*[@name='QuickLink " + i + "']",
							aQL[i])) {
						sQLName = mobileAction.FuncGetElementText(
								CL.GetDriver().findElement(By.xpath("//*[@name='QuickLink " + i + "']")));
						if (!mActual.containsKey(sQLName)) {
							mActual.put(sQLName, iIndex);
							iIndex++;
						}
					}

				}
				mExpected.put(aQL[i], i);
			}

			System.out.println(Maps.difference(mActual, mExpected));
			if (Maps.difference(mActual, mExpected) != null) {
				CL.GetReporting().FuncReport(PASS, "</b>Quick links are in order.</b>");
			} else {
				CL.GetReporting().FuncReport(FAIL, "</b>Quick links are not in order.</b>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
