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

public class Receipt extends _CommonPage{
	private static Receipt Receipt;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='Receipt']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement receiptHeader;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'HOME')]") 
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='GO BACK HOME']")
	private MobileElement homeBtn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Confirmation #')]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/confirmation_val']")
	private MobileElement confirmationNo;
	
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'PAY WITH REWARDS')]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PAY WITH REWARDS']")
	private MobileElement from_PayWithRewards;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'To')]/../XCUIElementTypeStaticText[3]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_subvalue']")
	private MobileElement payeeAccount;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Amount')]/../XCUIElementTypeStaticText[2]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'$')]")
	private MobileElement paymentAmount;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Amount')]/../XCUIElementTypeStaticText[3]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'TD Points')]")
	private MobileElement redeemedPoints;
	
	@iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@label,'Date')]/../XCUIElementTypeStaticText[2]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/item_row_value_main']")
	private MobileElement date;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'HOME')]") 
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='VIEW MY ACCOUNTS']")
	private MobileElement viewMyAccounts_Btn;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'HOME')]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/thank_you']")
	private MobileElement subheader_thanksyou;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'HOME')]") 
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/message']")
	private MobileElement reply_message;
	
	@iOSFindBy(xpath = "//XCUIElementTypeOther[contains(@label,'HOME')]") 
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
	
	public void verifyAmountRedeemed()   {
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
	
	public void verifyCurrentDate()   {
		Decorator();
		String dt="";
		SimpleDateFormat sdf =  new SimpleDateFormat("MMMMM dd,yyyy"); //
		if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
			 dt = date.getAttribute("label");//"Apr 21,2017";
		}else{
			dt = date.getAttribute("text");
		}
               Date d= null;
               Date d1= null;
            String today=   new SimpleDateFormat("MMMMM dd,yyyy").format(new Date());
            try {
                //System.out.println("expdate>> "+date);
                System.out.println("today>> "+today+"\n\n");
                d = sdf.parse(dt);
                d1 = sdf.parse(today);
                if(d1.compareTo(d) == 0){// not expired
                    System.out.println("false");
                 }
                 else
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                	 
                  System.out.println("true");
            }
            catch(Exception e) {
             e.printStackTrace();
           }
     }



	
	public void verifyRedemptionDetails()   {
		Decorator();
		String payee="";
		try {
			verifyReceiptHeader();
			mobileAction.verifyElementIsDisplayed(confirmationNo, "Confirmation Number");
			mobileAction.verifyElementIsDisplayed(from_PayWithRewards, "Pay With Rewards");
			mobileAction.verifyElementIsDisplayed(payeeAccount, "Payee Account");
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")){
				 payee=payeeAccount.getAttribute("label");
			}else{
				payee=payeeAccount.getAttribute("text");
			}
			
			String maskedCreditCardNo=payee.substring(0,4);
			mobileAction.verifyTextEquality(maskedCreditCardNo, ConstantClass.maskedValue);
			mobileAction.verifyElementTextContains(paymentAmount,ConstantClass.dollarSign);
			mobileAction.verifyElementTextContains(redeemedPoints, ConstantClass.points);
			verifyCurrentDate();
			
			
			

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void ClickGoBackHomeBtn()   {
		Decorator();
		try {
				
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView", 3, "down");
				homeBtn = mobileAction.verifyElementUsingXPath("//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='" + mobileAction.getAppString(locale_used, "quick_links_go_back_home") + "']", "GO BACK HOME");			
			}


			mobileAction.FuncClick(homeBtn, "Go Back Home Button");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}

	public void ClickViewMyAccountsBtn()   {
		Decorator();
		try {
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				
				mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView", 3, "down");
				viewMyAccounts_Btn = mobileAction.verifyElementUsingXPath("//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button' and @text='" + mobileAction.getAppString(locale_used, "feedback_quick_link_my_accounts") + "']", "VIEW MY ACCOUNTS");			
			}

			mobileAction.FuncClick(viewMyAccounts_Btn, "View My Accounts");

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}

	}
	
	public void VerifyConfirmationPageHeader() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(receiptHeader, "Receipt|收据|收據");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	public void VerifyReceiptDetailChineseContent() {
		Decorator();
		try {
			mobileAction.verifyElementTextIsDisplayed(receiptHeader, "Receipt|收据|收據");
			mobileAction.verifyElementTextIsDisplayed(subheader_thanksyou, " 谢谢！| 謝謝您！");
			mobileAction.verifyElementTextIsDisplayed(reply_message, "我们已经开始处理您的购买。如有问题，我们将与您联系。|我們已開始處理您的購買。如有問題，我們將與您聯絡。");
			
			String [] detailInfomation ={ "后续流程|後續流程",
					"下午 3 点之前的购买 |下午 3 時之前的購買",
					"如果您在工作日东部时间下午 3 点之前购买，将按当天价格交易。 | 如果在工作日的東部時間下午 3 時之前購買，將按當天價格交易。",
					"下午 3 点之后的购买 |下午 3 時之後的購買",
					"如果您在东部时间下午 3 点之后或在周末购买，将按照下一个工作日的收市价交易。|如果在東部時間下午 3 時之後或在週末購買，將按下一個工作日的收市價交易。",
					"购买确认|購買確認",
					"我们处理完您的购买之后，您能够即刻在您的互惠基金账户结余中看到新的基金。|我們處理完您的購買之後，您便能在您的互惠基金賬戶結餘中看到新的基金。",
					"-购买详情|購買詳情",
					"-购买详情|購買詳情",
					"参考编号|參考號碼",
					"基金|基金",
					"金额|金額",
					"发送请求时间|請求送出時間",
					"转出账户|轉出賬戶",
					"转入互惠基金账户|轉入互惠基金賬戶"
			
			};
			
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				List<MobileElement> detailList = ((MobileDriver) CL.GetDriver()).findElementsByXPath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView");
				
				int size= detailList.size();
				if(size > detailInfomation.length){
					System.out.println("Detail info is not completed, need double check");
					mobileAction.Report_Fail("Detail info doesn't match");
					return;
				}
				for (int i=0; i< size; i++){
					String textInfo = mobileAction.getValue(detailList.get(i));
					System.out.println("Text " +i +" " + textInfo);	
					mobileAction.verifyElementTextIsDisplayed(detailList.get(i),detailInfomation[i]);
				}
				mobileAction.FuncSwipeWhileElementNotFound(foot_note, false, 5, "up");				
				detailList = ((MobileDriver) CL.GetDriver()).findElementsByXPath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.TextView");
				
				int size1= detailList.size();
				if(size1 != detailInfomation.length - size){
					System.out.println("Remaining info doesn't match");
					for (int i=0; i< size1; i++){
						String textInfo = mobileAction.getValue(detailList.get(i));
						System.out.println("Text " +i +" " + textInfo);			
					}
					return;
				}
				for (int i=1; i< size1; i++){
					mobileAction.verifyElementTextIsDisplayed(detailList.get(i),detailInfomation[i+size]);
				}
			}
			
			//mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView", 3, "down");
			String footnote= "您的账户结余没有显示您购买的基金。我们处理完您的购买后，您的账户结余将会即刻更新。 | 您的賬戶結餘沒有顯示您購買的基金。我們處理完您的購買後，您的賬戶結餘便會更新。 ";
			mobileAction.verifyElementTextIsDisplayed(foot_note, footnote);
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				mobileAction.SwipeWithinElement("//android.support.v7.widget.RecyclerView", 1, "down");
			}
			
			String [] button_text={"返回主页|返回首頁", "查看我的账户|查看我的賬戶"};
			if(CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")){
				List<MobileElement> btnList = ((MobileDriver) CL.GetDriver()).findElementsByXPath("//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button']");				
				int size= btnList.size();
				if(size < button_text.length){
					System.out.println("Failed due to button not match");
					mobileAction.Report_Fail("Bottom Button number doesn't match");
					return;
				}
				for(int i=0; i< button_text.length; i++){
					mobileAction.verifyElementTextIsDisplayed(btnList.get(i), button_text[i]);
				}
			}
			
			
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
	
	
}
