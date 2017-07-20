package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ManageContacts extends _CommonPage {

	private static ManageContacts ManageContacts;

	@iOSFindBy(xpath = "//XCUIElementTypeSearchField[@name='Search for a contact']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/manage_contacts_search_field' and @text='Search']")
	private MobileElement searchTextFiled;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='Manage Contacts']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='Manage Contacts']")
	private MobileElement pageHeader;

	public synchronized static ManageContacts get() {
		if (ManageContacts == null) {
			ManageContacts = new ManageContacts();
		}
		return ManageContacts;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);
	}

	/**
	 * @author Ashraf This method will verify Search Button and textField on
	 *         Manage Contacts
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen
	 * @throws IOException
	 *             If there is problem while reporting
	 * @return void
	 * 
	 */
	public void verifyPageHeader() {
		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(pageHeader, "Manage Contacts Header");
			mobileAction.verifyElementIsDisplayed(searchTextFiled, "Search Text Filed");

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
