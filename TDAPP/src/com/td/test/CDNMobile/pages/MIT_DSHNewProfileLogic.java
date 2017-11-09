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
import io.appium.java_client.pagefactory.iOSFindBy;
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

	@iOSFindBy(xpath = "//*[@label='Logout' or @label='Fermer la session' or @label='退出' or @label='登出']")
	@AndroidFindBy(xpath = "//*[(@text='Logout' or @text='Fermer la session' or @text='退出' or @text='登出') and @resource-id='com.td:id/textview_flyout_menu_item']")
	private MobileElement FLY_Logout;
	
	@iOSXCUITFindBy(accessibility = "QuickLinkLeftNavButton")
	@AndroidFindBy(id = "com.td:id/hamburger")
	MobileElement BT_Home_HamburgerMenu;
	

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
				String[] aFlyoutAndroid = { getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_LOGOUT),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_HOME),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_MYACCOUNTS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TRANSFERS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_BILLS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_MOBILEPAYMENT),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDMYSPEND),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDMOBILEDEPOSIT),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDFORME),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TRADE),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_CROSSBORDERBANKING),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_PROFILESETTINGS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_LOCATIONS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_GIVEFEEDBACK),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_CONTACTUS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_FAQ),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_PRIVACYSECURITY)};

				verifyFlyoutOrder(aFlyoutAndroid);

			} else {
				String[] aFlyoutiOS = { getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_LOGOUT),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_HOME),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_MYACCOUNTS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TRANSFERS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_BILLS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_APPLEPAY),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDMYSPEND),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDMOBILEDEPOSIT),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TDFORME),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_TRADE),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_CROSSBORDERBANKING),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_PROFILESETTINGS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_APPLEWATCH),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_LOCATIONS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_GIVEFEEDBACK),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_CONTACTUS),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_FAQ),
						getTextInCurrentLocale(StringArray.ARRAY_DASHBOARD_FLYOUT_PRIVACYSECURITY)};

				verifyFlyoutOrder(aFlyoutiOS);
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
			if (Maps.difference(mActual, mExpected).areEqual()) {
				CL.GetReporting().FuncReport(PASS, "</b>Quick links are in order.</b>");
			} else {
				CL.GetReporting().FuncReport(FAIL, "</b>Quick links are not in order." + Maps.difference(mActual, mExpected) + "</b>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyFlyoutOrder(String[] aFlyout) {
		Decorator();
		HashMap<String, Integer> mActual = new HashMap<String, Integer>();
		HashMap<String, Integer> mExpected = new HashMap<String, Integer>();
		int iIndex = 0;
		String sQLName = null;

		try {
			mobileAction.FuncClick(BT_Home_HamburgerMenu, "BT_Home_HamburgerMenu");
			
			for (int i = 0; i < aFlyout.length; i++) {
				if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
					String xpathFlyout = "//*[@text='" + aFlyout[i]
							+ "' and @resource-id='com.td:id/textview_flyout_menu_item']";
					mobileAction.FuncSwipeWhileElementNotFoundByxpath(xpathFlyout, false, 4, "up");
					for (WebElement mEle : CL.GetDriver()
							.findElements(By.xpath("//*[@resource-id='com.td:id/textview_flyout_menu_item']"))) {
						sQLName = mobileAction.FuncGetElementText(mEle);
						if (!mActual.containsKey(sQLName)) {
							mActual.put(sQLName, iIndex);
							iIndex++;
						}
					}

				} else {
					if (MIT_DSHQuickLinks.get().verifyQuickLinkExistsByXpath("//*[@name='NAV_DRAWER_ITEMS_" + i + "']",
							aFlyout[i])) {
						sQLName = mobileAction.FuncGetElementText(
								CL.GetDriver().findElement(By.xpath("//*[@name='NAV_DRAWER_ITEMS_" + i + "']")));
						if (!mActual.containsKey(sQLName)) {
							mActual.put(sQLName, iIndex);
							iIndex++;
						}
					}

				}
				mExpected.put(aFlyout[i], i);
			}

			System.out.println(Maps.difference(mActual, mExpected));
			if (Maps.difference(mActual, mExpected).areEqual()) {
				CL.GetReporting().FuncReport(PASS, "</b>Flyout Menu are in order.</b>");
			} else {
				CL.GetReporting().FuncReport(FAIL, "</b>Flyout Menu are not in order." + Maps.difference(mActual, mExpected) + "</b>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyQLFlyoutBlendedInvestingFocus() {
		Decorator();
		try {
				MIT_DSHQuickLinks.get().verifyQL_TRADE(false);
				//My Account flyout ?? //FIXME
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
