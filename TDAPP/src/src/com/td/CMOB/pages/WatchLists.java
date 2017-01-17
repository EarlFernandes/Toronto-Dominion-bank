package com.td.CMOB.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.test.CDNMobile._CommonPage;

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

	String symbolXL = getTestdata("Symbol", "UserIDs");
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

	String SymbolsXL = getTestdata("Symbols", "UserIDs");
	String[] symbolList = SymbolsXL.split(":");

	int numberOfWatchlists = Integer.parseInt(getTestdata("WatchListNum", "UserIDs"));

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
		System.out.println("Decorator method has been finished");
	}

	/**
	 * This method will verify the WatchListHeder is displayed or Not
	 * 
	 * The element is not displayed it will
	 * 
	 * @throws NoSuchElementException and IOException
	 */

	public void verifyWatchListHeader() {
		Decorator();
		try {
			mobileAction.verifyElementIsDisplayed(WatchList_Header, "WatchList_Header");
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void clickSearchBar() {
		Decorator();
		try {
			mobileAction.FuncClick(searchBar, "Symbol Search Bar");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println(e.toString());
		}
	}

	public void verifyRecentSearches() {
		Decorator();
		try {
			mobileAction.verifyElement(recentSearches, t_recent_searches);
		} catch (NoSuchElementException e) {
			System.out.println(e.toString());
		}
	}

	public void verifySymbol() {
		Decorator();

		mobileAction.verifyElement(symbol, symbolXL);
	}

	public void AddSymbolToWatchListSymbol() {
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

		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println(e.toString());
		}
	}

	public void clickCancel() {

		try {
			mobileAction.FuncClick(CancelBtn, "Cancel Button");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println(e.toString());
		}
	}

	public void verifySymbolAdded() {

		try {
			for (int i = 0; i < numberOfWatchlists; i++) {
				mobileAction.verifyElement(symbolinWatchList, symbolXL);
				mobileAction.FunctionSwipe("left", 2, 100);
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

	public void clickEditButton() {
		try {
			mobileAction.FuncClick(editBtn, "Cancel Button");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			System.out.println(e.toString());
		}
	}

	public void deleteSymbolsFromList() {

		int symbolSize = symbolList.length;

		for (int i = 0; i < symbolSize; i++) {

			String SymbolXpath = "//android.widget.TextView[@resource-id='com.td:id/symbol' and contains(@text,'"
					+ symbolList[i] + "')]";
			MobileElement Symbol = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(SymbolXpath));

			try {
				// mobileAction.FuncClick(Symbol, symbolList[i]);
				mobileAction.FuncElementSwipeWhileNotFound(listView, Symbol, 3, "up", true);
			} catch (NoSuchElementException | IOException e) {
				System.out.println(e.toString());
			}
		}

		try {
			mobileAction.FuncClick(deleteBtn, "Delete Button");
			mobileAction.FuncClick(confirmTick, "Confirm tick");
		} catch (NoSuchElementException | InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void verifySymbolNotPresent() {

		int symbolSize = symbolList.length;

		for (int i = 0; i < symbolSize; i++) {

			String SymbolXpath = "//android.widget.TextView[@resource-id='com.td:id/symbol' and contains(@text,'"
					+ symbolList[i] + "')]";
			MobileElement Symbol = (MobileElement) ((AppiumDriver) CL.GetDriver()).findElement(By.xpath(SymbolXpath));

			try {
				mobileAction.verifyElementNotPresent(Symbol, symbolList[i]);
			} catch (NoSuchElementException e) {
				System.out.println(e.toString());
			}
		}

	}

	public void swipeToNextWatchList() {

		try {
			mobileAction.FunctionSwipe("left", 2, 20);
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
