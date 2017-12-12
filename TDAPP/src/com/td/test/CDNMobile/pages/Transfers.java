package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Transfers extends _CommonPage {

	private static Transfers Transfers;

	public synchronized static Transfers get() {
		if (Transfers == null) {
			Transfers = new Transfers();
		}
		return Transfers;
	}

	@iOSFindBy(accessibility = "TRANSFERVIEW_PENDING")

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'View pending and cancelled Interac e-Transfers')]")

	private MobileElement pending_Transfer;

	@iOSFindBy(accessibility = "TRANSFERVIEW_PENDING_DES")
	private MobileElement pending_transfer_desc;

	@iOSFindBy(accessibility = "TDVIEW_TITLE")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement transfers_header;

	@iOSFindBy(accessibility = "TRANSFERVIEW_ETRANSFER")
	private MobileElement Interac_e_Transfer_button;

	@iOSFindBy(accessibility = "TRANSFERVIEW_ETRANSFER_DES")
	private MobileElement Interac_e_Transfer_button_desc;

	@iOSXCUITFindBy(accessibility = "TRANSFERVIEW_BETWEENACCOUNTS")
	private MobileElement btw_my_accnts;

	@iOSFindBy(accessibility = "TRANSFERVIEW_BETWEENACCOUNTS_DES")
	private MobileElement btw_my_accnts_desc;

	@iOSFindBy(xpath = "//XCUIElementTypeActivityIndicator[@value='1']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/progress']")
	private MobileElement progress_bar;

	@iOSFindBy(accessibility = "TRANSFERVIEW_RECIPIENTS")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage Recipients']")
	private MobileElement manageRecipient;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='com.td' and @instance='2']")
	private MobileElement TD;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Always']")
	private MobileElement alwaysBtn;

	@iOSFindBy(accessibility = "TRANSFERVIEW_RECIPIENTS_DES")
	private MobileElement manageRecipientDesc;

	String transfer_Header_Value = "Transfers";
	String confirm_Header = "Confirm";

	String confirm_transfer_value = "Thank you!";

	@iOSFindBy(accessibility = "TRANSFERVIEW_RECIPIENTS")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/transfer_manage_contacts']")
	private MobileElement manageContacts;

	@iOSFindBy(accessibility = "TRANSFERVIEW_PENDING")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/transfers_history']")
	private MobileElement transferHistory;

	@iOSFindBy(xpath = "//XCUIElementTypeOther[@label='Between My Accounts']")
	@AndroidFindBy(id = "android:id/action_bar_title")
	private MobileElement betweenMyAccountsHeader;

	@iOSFindBy(accessibility = "TRANSFERVIEW_ETRANSFER")
	@iOSXCUITFindBy(iOSClassChain = "**/*[`name=='TRANSFERVIEW_ETRANSFER' and (label=='Request Money' or label=='Demander des fonds')`]")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/interac_request_money']")
	private MobileElement requestMoney;

	/**
	 * This method will click on Between my accounts button
	 * 
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 */
	public void clickBetweenMyAccountsTransfers() {
		try {
			Decorator();

			MobileElement pageHeader = PageHeader.get().getHeaderTextElement();
			mobileAction.verifyElementIsDisplayed(pageHeader, "Transfer header");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				btw_my_accnts = mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[contains(@text,'"
								+ getTextInCurrentLocale(StringArray.ARRAY_BETWEEN_MY_ACCOUNTS_HEADER) + "')]",
						"Transfer Between");
			}
			mobileAction.FuncClick(btw_my_accnts, "Between my Accounts");
			mobileAction.waitProgressBarVanish();

			mobileAction.verifyElementIsDisplayed(pageHeader, "Between My Accounts header");
			mobileAction.verifyElementTextContains(pageHeader,
					getTextInCurrentLocale(StringArray.ARRAY_BETWEEN_MY_ACCOUNTS_HEADER));
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				mobileAction.GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will click on Interac e-transfers button
	 * 
	 * 
	 * @return void
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 */
	public void clickInterac_e_Transfer() {
		Decorator();
		initElementInteracETransfer();
		try {
			Thread.sleep(5000);
			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer Header");
			mobileAction.FuncClick(Interac_e_Transfer_button, "Interac e_Transfer");

			// mobileAction.waitForElementToVanish(progrees_Bar);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will click on Manage Recipients
	 * 
	 * 
	 * @return void
	 *
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 */
	public void clickManageRecipients() {
		try {
			Decorator();
			initElementManageRecipients();
			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer Header");
			mobileAction.FuncClick(manageRecipient, "Manage Recipients Link");
			mobileAction.waitProgressBarVanish();
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	/**
	 * This method will click on Pending Transfers button
	 * 
	 * 
	 * @return void
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 * 
	 */
	public void clickPendingTransfers() {
		try {
			Decorator();
			initElementPendingTransfer();
			// mobileAction.FuncClick(TD, "TDAPP");
			// mobileAction.FuncClick(alwaysBtn, "Always");
			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer");
			mobileAction.FuncClick(pending_Transfer, "Pending Transfers");
			Thread.sleep(5000);
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	private void initElementPendingTransfer() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				pending_Transfer = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("transfersTransfersHintTextPendingInteracETransfer")
								.replaceAll("\\<.*?>", "")
						+ "']", "Pending and Completed");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void initElementInteracETransfer() {
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				System.out.println(mobileAction.getAppString("transfersTransfersNavRowHeaderInteracETransfer"));

				/*
				 * Interac_e_Transfer_button =
				 * mobileAction.verifyElementUsingXPath(
				 * "//android.widget.TextView[@text='"
				 * 
				 * Interac_e_Transfer_button =
				 * mobileAction.verifyElementUsingXPath(
				 * "//android.widget.TextView[@text='" >>>>>>>
				 * 384be1910d268ff2c307e639bef8370e6ac28c42 +
				 * mobileAction.getAppString(
				 * "transfersTransfersNavRowHeaderInteracETransfer")
				 * .replaceAll("\\<.*?>", "") + "']", "Send Money");
				 */
				final String iEMTButton1 = mobileAction.getAppString("transfersTransfersNavRowHeaderInteracETransfer");
				final String iEMTButton2 = mobileAction.getAppString("transfersTransfersNavRowHeaderSendMoney");
				if (!StringUtils.isEmpty(iEMTButton1)) {
					Interac_e_Transfer_button = mobileAction.verifyElementUsingXPath(
							"//android.widget.TextView[@text='" + iEMTButton1.replaceAll("\\<.*?>", "") + "']",
							"Send Money");
				} else {
					Interac_e_Transfer_button = mobileAction.verifyElementUsingXPath(
							"//android.widget.TextView[@text='" + iEMTButton2.replaceAll("\\<.*?>", "") + "']",
							"Send Money");
				}
			}
		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void initElementManageRecipients() {
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				manageRecipient = mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("imtNavRowManageRecipients") + "']", "Manage Recipients");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);
	}

	/**
	 * This method will click on verify the Transfer Header
	 * 
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */
	public void verifyTransferHeader() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer");

		} catch (Exception e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail", "No Transfer screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * This method will verify text within elements for the transfer page
	 * 
	 * @return void
	 * 
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void verifyTransferTextElements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				mobileAction.verifyTextEquality(transfers_header.getText(), mobileAction.getAppString("transfers_str"));
				mobileAction.verifyTextEquality(btw_my_accnts.getText(),
						mobileAction.getAppString("transfersTransfersNavRowHeaderBetweenMyAccounts"));
				mobileAction.verifyTextEquality(btw_my_accnts_desc.getText(),
						mobileAction.getAppString("transfersTransfersHintTextBetweenMyAccounts"));
				mobileAction.verifyTextEquality(Interac_e_Transfer_button.getText(),
						mobileAction.getAppString("e_transfer_str").replaceAll("\\<.*?>", ""));
				mobileAction.verifyTextEquality(Interac_e_Transfer_button_desc.getText(), mobileAction
						.getAppString("transfersTransfersHintTextInteracETransfer").replaceAll("\\<.*?>", ""));
				// mobileAction.verifyTextEquality(pending_transfer.getText(),
				// mobileAction.getAppString("str_pending_interact_etransfer").replaceAll("\\<.*?>",""));
				mobileAction.verifyTextEquality(pending_transfer_desc.getText(), mobileAction
						.getAppString("transfersTransfersHintTextPendingInteracETransfer").replaceAll("\\<.*?>", ""));
				mobileAction.verifyTextEquality(manageRecipient.getText(),
						mobileAction.getAppString("imtNavRowManageRecipients"));
				mobileAction.verifyTextEquality(manageRecipientDesc.getText(),
						mobileAction.getAppString("imtHintTextManageRecipients").replaceAll("\\<.*?>", ""));
			} else {
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@resource-id='android:id/action_bar_title' and @text='"
								+ mobileAction.getAppString("transfers_str") + "']",
						"Transfers title");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("transfersTransfersNavRowHeaderBetweenMyAccounts") + "']",
						"Between My accounts");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("transfersTransfersHintTextBetweenMyAccounts") + "']",
						"Move money quickly");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='"
								+ mobileAction.getAppString("transfersTransfersHintTextInteracETransfer") + "']",
						"Email money quickly");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("imtNavRowManageRecipients") + "']", "Manage recipients");
				mobileAction.verifyElementUsingXPath(
						"//android.widget.TextView[@text='" + mobileAction.getAppString("transfer_faq_question") + "']",
						"Transfer faq");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='"
						+ mobileAction.getAppString("imtHintTextManageRecipients").replaceAll("\\<.*?>", "") + "']",
						"Add, edit or delete");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction
						.getAppString("transfersTransfersHintTextPendingInteracETransfer").replaceAll("\\<.*?>", "")
						+ "']", "View pending");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction
						.getAppString("transfersTransfersNavRowHeaderPendingInteracETransfer").replaceAll("\\<.*?>", "")
						+ "']", "Pending interact");
				mobileAction.verifyElementUsingXPath("//android.widget.TextView[@text='" + mobileAction
						.getAppString("transfersTransfersNavRowHeaderInteracETransfer").replaceAll("\\<.*?>", "")
						+ "']", "Interac e-transfer");
			}
		} catch (NoSuchElementException | IOException e) {
			try {
				mobileAction.GetReporting().FuncReport("Fail",
						"No such element was found on screen: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	/**
	 * @author Ashraf This method will click on Manage Contacts Link.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickManageContactsLink() {

		Decorator();
		try {

			mobileAction.verifyElementIsDisplayed(transfers_header, "Transfer Header");
			mobileAction.FuncClick(manageContacts, "Manage Contacts Link");
			mobileAction.waitProgressBarVanish();

		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will click on Transfer History Link.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickTransferHistoryLink() {

		Decorator();
		try {

			mobileAction.FuncClick(transferHistory, "Transfer History Link");
			mobileAction.waitProgressBarVanish();
		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * @author Ashraf This method will click on Transfer History Link.
	 * 
	 * 
	 * @return NoSuchElementException
	 * @return IOException
	 */
	public void clickRequestMoneyLink() {

		Decorator();
		try {

			mobileAction.FuncClick(requestMoney, "Request Money Link");
			mobileAction.waitProgressBarVanish();
		} catch (NoSuchElementException | IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (InterruptedException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("InterruptedException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

}
