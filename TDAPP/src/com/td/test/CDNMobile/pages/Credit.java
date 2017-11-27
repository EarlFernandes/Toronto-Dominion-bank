package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class Credit extends _CommonPage {

	private static Credit Credit;

	@iOSFindBy(xpath = "//*[@name='DVIEW_TITLE'] | //XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement creditHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[1]")
	@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button'])[1]")
	private MobileElement payBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCollectionView[1]/XCUIElementTypeCell[3]")
	@AndroidFindBy(xpath = "(//android.widget.Button[@resource-id='com.td:id/quick_link_item_layout_button'])[3]")
	private MobileElement rewardBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]//XCUIElementTypeButton[3]")
	@AndroidFindBy(id = "com.td:id/statementTab")
	private MobileElement stmtBtn;

	@iOSFindBy(xpath = "//*[@label='Accounts']")
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.td:id/last_statement_details']")
	private MobileElement stmtDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Summary']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/summaryTab']")
	private MobileElement summaryDetails;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@label='cash back rewards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title' and @text='cash back rewards']")
	private MobileElement txtCashBackRwd;

	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[contains(@label,'Cash Back Dollars')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/account_rewards_balance']")
	private MobileElement dollarSign;

	// By dollarSign=By.xpath("//XCUIElementTypeStaticText[contains(@label,'Cash
	// Back Dollars')]");
	// By androidDollarSign=
	// By.xpath("//android.widget.TextView[@resource-id='com.td:id/account_rewards_balance");

	@iOSFindBy(xpath = "//XCUIElementTypeButton[@label='Activity']")
	// @AndroidFindBy(xpath =
	// "//android.widget.RelativeLayout[@resource-id='com.td:id/last_statement_details']")
	private MobileElement activityDetails;

	By iosStmtDetails = By
			.xpath("//XCUIElementTypeTable[1]//XCUIElementTypeCell[2][contains(@label,'Minimum Payment')]");

	By iosSummaryDetails = By.xpath("//*[@label='Summary']");

	By iosActivityDetails = By.xpath("//XCUIElementTypeOther[@label='Activity']");

	By iosVerifyLang = By.xpath("//XCUIElementTypeStaticText[contains(@label,'Dollars')]");

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	@AndroidFindBy(id = "com.td:id/last_statement")
	private MobileElement latestStatementDetail;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[3]")
	@AndroidFindBy(id = "com.td:id/account_rewards_balance")
	private MobileElement tdPointsBalance;

	@iOSXCUITFindBy(accessibility = "RVB_STATEMENT_CELL_TITLE0")
	@AndroidFindBy(id = "com.td:id/last_statement")
	private MobileElement statementTitle1;

	@iOSXCUITFindBy(accessibility = "RVB_STATEMENT_CELL_TITLE3")
	@AndroidFindBy(id = "com.td:id/two_statements_ago")
	private MobileElement statementTitle2;

	@iOSXCUITFindBy(accessibility = "RVB_STATEMENT_CELL_TITLE4")
	@AndroidFindBy(id = "com.td:id/three_statements_ago")
	private MobileElement statementTitle3;

	private MobileElement more_link;

	public synchronized static Credit get() {
		if (Credit == null) {
			Credit = new Credit();
		}
		return Credit;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	/**
	 * This method will check the credit Header is present or not
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void credit_Header() {
		Decorator();
		try {

			mobileAction.verifyElementTextIsDisplayed(creditHeader,
					getTextInCurrentLocale(StringArray.ARRAY_CREDIT_HEADER));

		} catch (NoSuchElementException e) {

			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void clickPay() {
		Decorator();
		try {
			mobileAction.FuncClick(payBtn, "Pay button");

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
	 * This method will click the Rewards Button in Credit Page
	 * 
	 * @throws NoSuchElementException
	 * @
	 * 
	 */

	public void clickReward() {
		Decorator();
		try {
			mobileAction.FuncClick(rewardBtn, "Rewards");

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
	 * This method will click the Statements button in Credit Page
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void clickStatment() {
		Decorator();
		try {
			Thread.sleep(2000);
			mobileAction.FuncClick(stmtBtn, "Statements");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * 
	 * This method will click the Statements last generated in Credit Page
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void clickStatmentTab() {
		Decorator();
		try {
			mobileAction.FuncClick(stmtBtn, "Statements Tab");

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

	public void clickSummaryTab() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				CL.GetDriver().findElement(iosSummaryDetails).click();
			} else {
				mobileAction.FuncClick(summaryDetails, "Summary Details ");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}
	}

	public void clickActivityTab() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("IOS")) {
				CL.GetDriver().findElement(iosActivityDetails).click();
			} else {
				mobileAction.FuncClick(activityDetails, "Activity Details ");
			}
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			e.printStackTrace();

		}

	}

	public void rewardsNotVisible() {
		Decorator();
		try {
			rewardBtn.isDisplayed();
		} catch (NoSuchElementException e) {
			try {
				CL.GetReporting().FuncReport("PASS", "The '" + "REWARDS button" + "' is not displayed");
			} catch (IOException e1) {
				System.out.println("IOException from Method" + this.getClass().toString() + " " + e.getCause());
			}
		}
	}

	public void verifyCashbackTxt() {
		Decorator();
		try {
			String value = mobileAction.verifyElementUsingBy(iosVerifyLang);
			System.out.println(value);
			value.contains(ConstantClass.t_cashBack);
			CL.GetReporting().FuncReport("Pass", "The element <b>- " + ConstantClass.t_cashBack + "</b> is displayed");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}

	}

	/**
	 * This method will verify the rewards button in Credit Page
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */
	public void rewardVisible() {
		Decorator();
		try {

			mobileAction.FuncISDisplayed(rewardBtn, "Rewards");
		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}

	}

	/**
	 * This method will verify the cash back rewards text under Summary tab in
	 * Credit Page
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */
	public void verifyCashBack() {
		Decorator();
		try {

			mobileAction.FuncISDisplayed(txtCashBackRwd, "Cash back rewards");

		} catch (NoSuchElementException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will verify the dollar reward balance in Credit Page
	 * 
	 * @throws IOException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void verifyDollarRewardBalance() {
		Decorator();
		try {
			String verifydollarSign = mobileAction.getValue(dollarSign);

			if (verifydollarSign.startsWith(ConstantClass.dollarSign)) {
				CL.GetReporting().FuncReport("Pass",
						"The element <b>- " + ConstantClass.dollarSign + "</b> is present in Cash back dollar ");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	/**
	 * This method will verify the currency value has not exceeded two decimals
	 * in Credit Page
	 * 
	 * @throws IOException
	 * 
	 * @throws NoSuchElementException
	 * 
	 * 
	 */

	public void verifyDollarDecimalValue() {

		Decorator();
		String decimalValue = "";
		try {
			decimalValue = mobileAction.getValue(dollarSign);
			// if
			// (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios"))
			// {
			// decimalValue=mobileAction.verifyElementUsingBy(dollarSign);
			// }else{
			// decimalValue=mobileAction.verifyElementUsingBy(androidDollarSign);
			// }
			String decVal[] = decimalValue.split(" ");
			System.out.println(decVal[0]);
			String decVal1 = decVal[0].replaceAll("[$,]", "");
			System.out.println(decVal1);

			if (String.valueOf(decVal1).split("\\.")[1].length() == 2) {
				CL.GetReporting().FuncReport("PASS", "The Currency value has not exceeded two decimals");
			}
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;

		}
	}

	public void VerifyMoreLinkPresent() {
		Decorator();
		String moreText = getTextInCurrentLocale(StringArray.ARRAY_MORE_LINK);
		String moreXpath = "";
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			moreXpath = "//*[@label='" + moreText + "']";
		} else {
			moreXpath = "//android.widget.Button[@text='" + moreText + "']";
		}

		try {
			more_link = mobileAction.verifyElementUsingXPath(moreXpath, moreText);
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void ClickMoreLink() {
		Decorator();
		String moreText = getTextInCurrentLocale(StringArray.ARRAY_MORE_LINK);
		String moreXpath = "";
		if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			moreXpath = "//*[@label='" + moreText + "']";

		} else {
			moreXpath = "//android.widget.Button[@text='" + moreText + "']";
		}

		try {
			more_link = mobileAction.verifyElementUsingXPath(moreXpath, moreText);
			mobileAction.FuncClick(more_link, moreText);
		} catch (NoSuchElementException | IOException | InterruptedException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			return;
		}
	}

	public void clickLatestStatement() {
		Decorator();
		try {

			mobileAction.FuncClick(latestStatementDetail, "Latest Statement Detail button");
			mobileAction.waitProgressBarVanish();

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

	public void getTDPointsBalance() {
		Decorator();
		try {
			String ptsBalance = "0";
			boolean hasRewards = mobileAction.verifyElementIsPresent(tdPointsBalance);
			if (hasRewards) {
				ptsBalance = mobileAction.FuncGetText(tdPointsBalance);
			}
			CL.getTestDataInstance().TCParameters.put("Amount", ptsBalance);

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

	public void verifyNoTDPointsBalance() {
		Decorator();
		try {

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String rewardText = mobileAction.FuncGetText(tdPointsBalance);
				boolean hasTDPoints = rewardText.contains(getTextInCurrentLocale(StringArray.ARRAY_TD_POINTS));
				boolean hasCBDollars = rewardText.contains(getTextInCurrentLocale(StringArray.ARRAY_CASH_BACK_DOLLARS));
				if (hasTDPoints || hasCBDollars) {
					mobileAction.GetReporting().FuncReport("Fail", "Has TD Points or Cash Back Dollars");
				} else {
					mobileAction.GetReporting().FuncReport("Pass", "No TD Points or Cash Back Dollars");
				}
			} else {
				mobileAction.verifyElementNotPresent(tdPointsBalance, "TD Rewards Balance");
			}

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

	public void testSecondCard() {
		Decorator();
		try {

			String secondCard = getTestdata("AccessCard");
			CL.getTestDataInstance().TCParameters.put("ToAccount", secondCard);

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

	public void verifyTDRewardsDollarsBalanceUpdated() {
		Decorator();
		try {
			double previousBalance = parseCashBackDollars(getTestdata("Amount"));
			String ptsText = mobileAction.FuncGetText(tdPointsBalance);
			double balance = parseCashBackDollars(ptsText);

			// Need to round 2 decimal places after operation
			double newBalance = (double) Math.round((previousBalance - 25.00) * 100d) / 100d;

			if (Double.compare(balance, newBalance) != 0) {
				System.out.println(balance + " != " + newBalance);
				mobileAction.GetReporting().FuncReport("Fail",
						"New Cash Back Dollars balance incorrect. Previous balance: " + previousBalance
								+ " New balance: " + balance);
			} else {
				mobileAction.GetReporting().FuncReport("Pass", "New Cash Back Dollars balance is correct");
			}

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

	public void verifyTDRewardsPointsBalanceUpdated() {
		Decorator();
		try {
			int previousBalance = parseRewardsPoints(getTestdata("Amount"));
			String ptsText = mobileAction.FuncGetText(tdPointsBalance);
			int balance = parseRewardsPoints(ptsText);

			int newBalance = previousBalance - 10000;

			if (Integer.compare(balance, newBalance) != 0) {
				System.out.println(balance + " != " + newBalance);
				mobileAction.GetReporting().FuncReport("Fail", "New Points balance incorrect. Previous balance: "
						+ previousBalance + " New balance: " + balance);
			} else {
				mobileAction.GetReporting().FuncReport("Pass", "New Points balance is correct");
			}

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

	private double parseCashBackDollars(String rewardText) {
		double result = 0.00;

		if (currentLocale.equalsIgnoreCase("fr")) {
			rewardText = rewardText.substring(0, rewardText.indexOf("$")).trim();
			rewardText = rewardText.replace(",", ".");
			rewardText = rewardText.replace(" ", "");
		} else {
			// en, chinese have same format
			rewardText = rewardText.substring(0, rewardText.indexOf(" "));
			rewardText = rewardText.replace(",", "");
			rewardText = rewardText.replace("$", "");
		}
		result = Double.parseDouble(rewardText);

		return result;

	}

	private int parseRewardsPoints(String rewardText) {
		int result = 0;

		if (currentLocale.equalsIgnoreCase("fr")) {
			rewardText = rewardText.substring(0, rewardText.indexOf("Points")).trim();
			rewardText = rewardText.replace(" ", "");
		} else {
			// en, chinese have same format
			rewardText = rewardText.substring(0, rewardText.indexOf("TD")).trim();
			rewardText = rewardText.replace(",", "");
		}
		result = Integer.parseInt(rewardText);

		return result;

	}

	public void verifyLastThreeStatements() {
		Decorator();
		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("android")) {
				mobileAction.FunctionSwipe("up", 2000, 0);
			}
			mobileAction.verifyElementIsDisplayed(statementTitle1, "1st Statement");
			mobileAction.verifyElementIsDisplayed(statementTitle2, "2nd Statement");
			mobileAction.verifyElementIsDisplayed(statementTitle3, "3rd Statement");

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

}
