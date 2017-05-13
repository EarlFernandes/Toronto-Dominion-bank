package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class WatchLists extends _CommonPage {

	private static WatchLists WatchLists;

	@iOSFindBy(xpath = "//*[@label='Add symbol to watchlist']")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/edt_search_field_view_mode']")
	private MobileElement searchBar;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/editcancel']")
	private MobileElement editBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/btn_delete']")
	private MobileElement deleteBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.td:id/btn_tick_done']")
	private MobileElement confirmTick;

	@iOSFindBy(xpath = "//*[@label='RECENT SEARCHES']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='RECENT SEARCHES']")
	private MobileElement recentSearches;

	@iOSFindBy(xpath = "//*[@label='Watchlists']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/classificationTexView' and @text='RECENT SEARCHES']")
	private MobileElement WatchList_Header;

	String t_recent_searches = "RECENT SEARCHES";

	String symbolXL = getTestdata("Symbol");
	String symbolXpath = "//android.widget.TextView[@resource-id='com.td:id/market_name' and @text='" + symbolXL + "']";
	@SuppressWarnings("unchecked")
	MobileElement symbol = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(symbolXpath));

	@iOSFindBy(xpath = "//*[contains(@label,'CA']")
	private MobileElement symbol_td;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/txt_tradingPassword']")
	private MobileElement progressBar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/btn_cancel']")
	private MobileElement CancelBtn;

	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='android:id/list']")
	private MobileElement listView;

	String symbolInWatchListXpath = "//android.widget.TextView[@resource-id='com.td:id/symbol' and @text='" + symbolXL
			+ "']";
	@SuppressWarnings("unchecked")
	MobileElement symbolinWatchList = (MobileElement) ((AppiumDriver) CL.GetDriver())
			.findElement(By.xpath(symbolInWatchListXpath)); // once

	String SymbolsXL = getTestdata("Symbols");
	String[] symbolList = SymbolsXL.split(":");

	int numberOfWatchlists = Integer.parseInt(getTestdata("WatchListNum"));

	@iOSFindBy(xpath = "//*[contains(@label,'CA']")
	private MobileElement symbolInWatchList;

	public synchronized static WatchLists get() {
		if (WatchLists == null) {
			WatchLists = new WatchLists();
		}
		return WatchLists;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator(((AppiumDriver) CL.GetDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)),
				this);

	}

	/**
	 * This method will verify the WatchListHeder is displayed or Not
	 * 
	 * The element is not displayed it will
	 * 
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 * 
	 * @throws Exception
	 *             If there is problem while finding that element.
	 */

	public void verifyWatchListHeader() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(WatchList_Header, "WatchList_Header");
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void clickSearchBar() {
		Decorator();
		try {
			mobileAction.FuncClick(searchBar, "Symbol Search Bar");
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

	public void verifyRecentSearches() {
		Decorator();
		try {
			mobileAction.verifyElement(recentSearches, t_recent_searches);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void verifySymbol() {
		Decorator();

		mobileAction.verifyElement(symbol, symbolXL);
	}

	public void AddSymbolToWatchListSymbol() {
		Decorator();
		try {

			for (int i = 0; i < numberOfWatchlists; i++) {

				mobileAction.FuncClick(symbol, symbolXL);

				String WishListXpath = "//android.widget.LinearLayout[@index='" + i + "']";
				MobileElement wishList = (MobileElement) ((AppiumDriver) CL.GetDriver())
						.findElement(By.xpath(WishListXpath));

				mobileAction.FuncClick(wishList, "WishList " + i);

				mobileAction.waitForElementToVanish(progressBar);

			}

			clickCancel();

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

	public void clickCancel() {
		Decorator();
		try {
			mobileAction.FuncClick(CancelBtn, "Cancel Button");
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

	public void verifySymbolAdded() {
		Decorator();
		try {
			for (int i = 0; i < numberOfWatchlists; i++) {
				mobileAction.verifyElement(symbolinWatchList, symbolXL);
				mobileAction.FunctionSwipe("left", 2, 100);
			}
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void clickEditButton() {
		Decorator();
		try {
			mobileAction.FuncClick(editBtn, "Cancel Button");
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

	public void deleteSymbolsFromList() {
		Decorator();

		int symbolSize = symbolList.length;

		for (int i = 0; i < symbolSize; i++) {

			String SymbolXpath = "//android.widget.TextView[@resource-id='com.td:id/symbol' and contains(@text,'"
					+ symbolList[i] + "')]";
			MobileElement Symbol = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(SymbolXpath));

			try {
				// mobileAction.FuncClick(Symbol, symbolList[i]);
				mobileAction.FuncElementSwipeWhileNotFound(listView, Symbol, 3, "up", true);
			}  catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			}  catch (IOException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			} catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}

		try {
			mobileAction.FuncClick(deleteBtn, "Delete Button");
			mobileAction.FuncClick(confirmTick, "Confirm tick");
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

	public void verifySymbolNotPresent() {
		Decorator();
		int symbolSize = symbolList.length;

		for (int i = 0; i < symbolSize; i++) {

			String SymbolXpath = "//android.widget.TextView[@resource-id='com.td:id/symbol' and contains(@text,'"
					+ symbolList[i] + "')]";
			MobileElement Symbol = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(SymbolXpath));

			try {
				mobileAction.verifyElementNotPresent(Symbol, symbolList[i]);
			}  catch (NoSuchElementException e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
			}  catch (Exception e) {
				CL.getGlobalVarriablesInstance().bStopNextFunction = false;
				System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}

	}

	public void verify_newOrderFlow_Watchlists() {
		Decorator();
		try {
			for (int i = 0; i < numberOfWatchlists; i++) {
				mobileAction.verifyElement(symbolInWatchList, symbolXL);
				mobileAction.FuncClick(symbolInWatchList, symbolXL);

			}
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

	public void swipeToNextWatchList() {
		Decorator();
		try {
			mobileAction.FunctionSwipe("left", 2, 20);
		} catch (NoSuchElementException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("NoSuchElementException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (IOException e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		} catch (Exception e) {
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

}
