package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.entity.mime.Header;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td._CommonPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Receipt extends _CommonPage {
	private static Receipt Receipt;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement receiptHeader;

	@iOSFindBy(accessibility = "QUICKACCESS_CELL_MENU_ICON_HOME")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='GO BACK HOME']")
	private MobileElement homeBtn;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmationNo;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'REWARDS REDEMPTION')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='REWARDS REDEMPTION']")
	private MobileElement from_PayWithRewards;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'To')]/../XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='To']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@resource-id='com.td:id/item_row_subvalue']")
	private MobileElement payeeAccount;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Amount')]/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'$')]")
	private MobileElement paymentAmount;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Amount')]/../XCUIElementTypeStaticText[3]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'TD Points')]")
	private MobileElement redeemedPoints;

	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Date')]/../XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Date']/following-sibling::android.widget.LinearLayout/android.widget.TextView[@resource-id='com.td:id/item_row_value_main']")
	private MobileElement date;

	@iOSFindBy(accessibility = "QUICKACCESS_CELL_MENU_ICON_ACCOUNTS")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='VIEW MY ACCOUNTS']")
	private MobileElement viewMyAccounts_Btn;

	@iOSFindBy(xpath = "//*[@name='bg_receipt_success']/following-sibling::XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/thank_you']")
	private MobileElement subheader_thanksyou;

	@iOSFindBy(xpath = "//*[@name='bg_receipt_success']/following-sibling::XCUIElementTypeStaticText[2]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message']")
	private MobileElement reply_message;

	@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[12]/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/footer_txt_note']")
	private MobileElement foot_note;

	public synchronized static Receipt get() {
		if (Receipt == null) {
			Receipt = new Receipt();
		}
		return Receipt;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(8, TimeUnit.SECONDS)),
				this);

	}

	public void verifyReceiptHeader() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(receiptHeader, "Cancel Button");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void verifyAmountRedeemed() {
		Decorator();
		try {
			mobileAction.FuncClick(homeBtn, "Go Back Home Button");
			HomeScreen.get().clickAccountsTab();
			Accounts.get().verifyAccountsPage();
			Accounts.get().selectAccountInAccountSheet();

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public boolean verifyCurrentDate() {
		Decorator();
		String dt = "";
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd,yyyy"); //
		dt = mobileAction.getValue(date);
		// if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
		// dt = date.getAttribute("label");//"Apr 21,2017";
		// }else{
		// dt = date.getAttribute("text");
		// }
		Date d = null;
		Date d1 = null;
		String today = new SimpleDateFormat("MMMM dd,yyyy").format(new Date());
		try {
			// System.out.println("expdate>> "+date);
			System.out.println("Date captured >> " + dt);
			System.out.println("today>> " + today + "\n\n");
			d = sdf.parse(dt);
			d1 = sdf.parse(today);
			if (d1.compareTo(d) == 0) {// not expired
				System.out.println("true");
				return true;
			} else {
				System.out.println("false");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void verifyRedemptionDetails() {
		Decorator();
		String payee = "";
		try {
			verifyReceiptHeader();
			mobileAction.verifyElementIsDisplayed(confirmationNo, "Confirmation Number");
			mobileAction.verifyElementIsDisplayed(from_PayWithRewards, "Pay With Rewards");
			mobileAction.verifyElementIsDisplayed(payeeAccount, "Payee Account");
			payee = mobileAction.getValue(payeeAccount);
			// if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
			// payee=payeeAccount.getAttribute("label");
			// }else{
			// payee=payeeAccount.getAttribute("text");
			// }

			String maskedCreditCardNo = payee.substring(0, 4);
			System.out.println("maskedCreditCardNo:" + maskedCreditCardNo);
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyTextEquality(maskedCreditCardNo, ConstantClass.maskedValue_Android);
			} else {
				mobileAction.verifyTextEquality(maskedCreditCardNo, ConstantClass.maskedValue_iOS);
			}
			mobileAction.verifyElementTextContains(paymentAmount, ConstantClass.dollarSign);
			mobileAction.verifyElementTextContains(redeemedPoints, ConstantClass.points);
			if (verifyCurrentDate()) {
				mobileAction.Report_Pass_Verified("Date");
			} else {
				mobileAction.Report_Fail("Fail: date is not verified");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void ClickGoBackHomeBtn() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String homeBtnxpath = "//android.widget.Button[@text='RETOURNER À L’ACCUEIL' or @text='"
						+ mobileAction.getAppString("quick_links_go_back_home") + "']";
				System.out.println("Go back home:" + homeBtnxpath);
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(homeBtnxpath, true, 10, "up");

			} else {
				mobileAction.FuncSwipeWhileElementNotFound(homeBtn, true, 10, "up");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void ClickViewMyAccountsBtn() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {

				String viewMyAccountXpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='"
						+ mobileAction.getAppString("feedback_quick_link_my_accounts") + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(viewMyAccountXpath, true, 10, "up");

			}else{
				mobileAction.FuncSwipeWhileElementNotFound(viewMyAccounts_Btn, true, 10, "up");
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void VerifyConfirmationPageHeader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(receiptHeader, "Receipt|Reçu|收据|收據");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyReceiptDetailChineseContent() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(receiptHeader, "Receipt|Reçu|收据|收據");
			mobileAction.verifyElementTextIsDisplayed(subheader_thanksyou, " 谢谢！| 謝謝您！");
			mobileAction.verifyElementTextIsDisplayed(reply_message,
					"我们已经开始处理您的购买。如有问题，我们将与您联系。|我們已開始處理您的購買。如有問題，我們將與您聯絡。");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String[] detailInfomation = { "后续流程|後續流程", "下午 3 点之前的购买 |下午 3 時之前的購買",
						"如果您在工作日东部时间下午 3 点之前购买，将按当天价格交易。 | 如果在工作日的東部時間下午 3 時之前購買，將按當天價格交易。", "下午 3 点之后的购买 |下午 3 時之後的購買",
						"如果您在东部时间下午 3 点之后或在周末购买，将按照下一个工作日的收市价交易。|如果在東部時間下午 3 時之後或在週末購買，將按下一個工作日的收市價交易。", "购买确认|購買確認",
						"我们处理完您的购买之后，您能够即刻在您的互惠基金账户结余中看到新的基金。|我們處理完您的購買之後，您便能在您的互惠基金賬戶結餘中看到新的基金。", "购买详情|購買詳情",
						"购买详情|購買詳情","参考编号|參考號碼", "基金|基金", "金额|金額", "发送请求时间|請求送出時間", "转出账户|轉出賬戶", "转入互惠基金账户|轉入互惠基金賬戶"

				};
				List<MobileElement> detailList = ((MobileDriver) CL.GetDriver()).findElementsByXPath(
						"//android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView");

				int size = detailList.size();
				if (size > detailInfomation.length) {
					System.out.println("Detail info is not completed, need double check");
					mobileAction.Report_Fail("Detail info doesn't match");
					return;
				}
				for (int i = 0; i < size; i++) {
					String textInfo = mobileAction.getValue(detailList.get(i));
					System.out.println("Text " + i + " " + textInfo);
					mobileAction.verifyElementTextIsDisplayed(detailList.get(i), detailInfomation[i]);
				}
				mobileAction.FuncSwipeWhileElementNotFound(foot_note, false, 5, "up");
				detailList = ((MobileDriver) CL.GetDriver()).findElementsByXPath(
						"//android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView");

				int size1 = detailList.size();
				if (size1 != detailInfomation.length - size) {
					System.out.println("Remaining info doesn't match");
					for (int i = 0; i < size1; i++) {
						String textInfo = mobileAction.getValue(detailList.get(i));
						System.out.println("Text " + i + " " + textInfo);
					}
					return;
				}
				for (int i = 1; i < size1; i++) {
					mobileAction.verifyElementTextIsDisplayed(detailList.get(i), detailInfomation[i + size]);
				}
			}else{
				List<MobileElement> detailList = ((MobileDriver) CL.GetDriver()).findElementsByXPath(
						"//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText");
				String[] detailInfomation = { "后续流程|後續流程", "下午 3 点之前的购买 |下午 3 時之前的購買",
						"如果您在工作日东部时间下午 3 点之前购买，将按当天价格交易。 | 如果在工作日的東部時間下午 3 時之前購買，將按當天價格交易。", "下午 3 点之后的购买 |下午 3 時之後的購買",
						"如果您在东部时间下午 3 点之后或在周末购买，将按照下一个工作日的收市价交易。|如果在東部時間下午 3 時之後或在週末購買，將按下一個工作日的收市價交易。", "购买确认|購買確認",
						"我们处理完您的购买之后，您能够即刻在您的互惠基金账户结余中看到新的基金|我們處理完您的購買之後，您便能在您的互惠基金賬戶結餘中看到新的基金", "购买详情|購買詳情",
						"购买详情|購買詳情", "参考编号|參考號碼", "ignore","基金|基金","ignore", "ignore","金额|金額","ignore", "发送请求时间|請求送出時間","ignore", "ignore",
						"转出账户|轉出賬戶","ignore","ignore","ignore", "转入互惠基金账户|轉入互惠基金賬戶","ignore","ignore","您的账户结余没有显示您购买的基金。我们处理完您的购买后，您的账户结余将会即刻更新。"+
						"|您的賬戶結餘沒有顯示您購買的基金。我們處理完您的購買後，您的賬戶結餘便會更新。"

				};
				int size = detailList.size();
				System.out.println("size of data:"+size);
				for(int i=0; i<size; i++){
					if(detailInfomation[i].equalsIgnoreCase("ignore")){
						System.out.println("ignore index "+ i);
						continue;
					}else{
						if(!mobileAction.verifyElementIsPresent(detailList.get(i))){
							mobileAction.FuncSwipeWhileElementNotFound(detailList.get(i), false, 5, "up");							
						}
						mobileAction.verifyElementTextIsDisplayed(detailList.get(i), detailInfomation[i]);
					}
					//System.out.println("Text "+ i+" "+detailList.get(i).getText() );
				}
			}

			// mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView",
			// 3, "down");
			String footnote = "您的账户结余没有显示您购买的基金。我们处理完您的购买后，您的账户结余将会即刻更新。 | 您的賬戶結餘沒有顯示您購買的基金。我們處理完您的購買後，您的賬戶結餘便會更新。 ";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.verifyElementTextIsDisplayed(foot_note, footnote);
			}
			mobileAction.FuncSwipeUpTillScreenBottom(homeBtn);
			String[] button_text = { "返回主页|返回首頁", "查看我的账户|查看我的賬戶" };
			List<MobileElement> btnList=null;
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				btnList = ((MobileDriver) CL.GetDriver()).findElementsByXPath(
						"//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button']");
			}else{
				btnList =((MobileDriver) CL.GetDriver()).findElementsByXPath("//XCUIElementTypeCollectionView/XCUIElementTypeCell");
			}
				
			int size = btnList.size();
			if (size < button_text.length) {
				System.out.println("Failed due to button not match");
				mobileAction.Report_Fail("Bottom Button number doesn't match");
				return;
			}
			for (int i = 0; i < button_text.length; i++) {
				mobileAction.verifyElementTextIsDisplayed(btnList.get(i), button_text[i]);
			}
			

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

}
