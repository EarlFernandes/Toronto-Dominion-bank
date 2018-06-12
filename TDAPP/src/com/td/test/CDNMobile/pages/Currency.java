package com.td.test.CDNMobile.pages;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.td.StringArray;
import com.td._CommonPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.TimeOutDuration;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Currency extends _CommonPage {

	private static Currency currency;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeNavigationBar/XCUIElementTypeButton")
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='android:id/up']")
	private MobileElement cancel_currency_button;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/title_text']")
	private List<MobileElement> currency_list;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeNavigationBar/XCUIElementTypeOther")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/action_bar_title']")
	private MobileElement currency_header;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.td:id/empty_view_message']")
	private MobileElement search_disclaimer;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]//XCUIElementTypeSearchField")
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.td:id/searchField']")
	private MobileElement search_field;

	public synchronized static Currency get() {
		if (currency == null) {
			currency = new Currency();
		}
		return currency;
	}

	private void Decorator() {
		PageFactory.initElements(
				new AppiumFieldDecorator((CL.GetAppiumDriver()), new TimeOutDuration(15, TimeUnit.SECONDS)), this);

	}

	private Set<String> Currency_Set_En = new HashSet<String>();
	private Set<String> Currency_Set_FR = new HashSet<String>();

	private void init_currency_set() {
		Currency_Set_En.addAll(Arrays.asList(new String[] { "Aruba Florin (AWG)", "Australian Dollar (AUD)",
				"Bahraini Dinar (BHD)", "Barbados Dollar (BBD)", "Belize Dollar (BZD)", "Bermuda Dollar (BMD)",
				"Brazil Real (BRL)", "Bruneian Dollar (BND)", "Bulgarian Lev (BGN)", "Caymanian Dollar (KYD)",
				"Chilean Peso (CLP)", "Chinese Renminbi (CNY)", "Colombian Peso (COP)", "Costa Rican Colon (CRC)",
				"Croatian Kuna (HRK)", "Czech Koruna (CZK)", "Danish Krone (DKK)", "Dominican Peso (DOP)",
				"Dutch Guilder (ANG)", "East Caribbean Dollar (XCD)", "Euro (EUR)", "Fiji Dollar (FJD)",
				"Great Britain Pound (GBP)", "Guatemala Quetzal (GTQ)", "Hong Kong Dollar (HKD)",
				"Hungarian Forint (HUF)", "Icelandic Krona (ISK)", "Indonesian Rupiah (IDR)", "Jamaican Dollar (JMD)",
				"Japanese Yen (JPY)", "Jordanian Dinar (JOD)", "Kenya Shilling (KES)", "Kuwaiti Dinar (KWD)",
				"Malaysian Ringgit (MYR)", "Mexican Peso (MXN)", "New Israeli Sheqel (ILS)", "New Zealand Dollar (NZD)",
				"Nicaragua Cordoba (NIO)", "North Irish Pound (INP)", "Norwegian Krone (NOK)", "Omani Rial (OMR)",
				"Peruvian Nuevo Sol (PEN)", "Philippine Peso (PHP)", "Polish Zloty (PLN)", "Romanian Leu (RON)",
				"Russian Ruble (RUB)", "Saudi Riyal (SAR)", "Scottish Pound (SCO)", "Singapore Dollar (SGD)",
				"South African Rand (ZAR)", "South Korean Won (KRW)", "Swedish Krona (SEK)", "Swiss Franc (CHF)",
				"Tahitian Franc (XPF)", "Taiwan New Dollar (TWD)", "Thai Baht (THB)", "Turkish Lira (TRY)",
				"United Arab Emirates Dirham (AED)", "United States Dollar (USD)", "Uruguayan Peso (UYU)",
				"Vietnamese Dong (VND)" }));

		Currency_Set_FR.addAll(Arrays.asList(new String[] { "Baht thaïlandais (THB)", "Colon costaricain (CRC)",
				"Cordoba nicaraguayen (NIO)", "Couronne danoise (DKK)", "Couronne islandaise (ISK)",
				"Couronne norvégienne (NOK)", "Couronne suédoise (SEK)", "Couronne tchèque (CZK)",
				"Dinar bahreïni (BHD)", "Dinar jordanien (JOD)", "Dinar koweïtien (KWD)",
				"Dirham des Émirats arabes unis (AED)", "Dollar américain (USD)", "Dollar australien (AUD)",
				"Dollar barbadien (BBD)", "Dollar bermudien (BMD)", "Dollar brunéien (BND)", "Dollar bélizien (BZD)",
				"Dollar de Hong Kong (HKD)", "Dollar des îles Caïmans (KYD)", "Dollar est-caribéen (XCD)",
				"Dollar fidjien (FJD)", "Dollar jamaïcain (JMD)", "Dollar néo-zélandais (NZD)",
				"Dollar singapourien (SGD)", "Dong vietnamien (VND)", "Euro (EUR)", "Florin arubais (AWG)",
				"Florin néerlandais (ANG)", "Forint hongrois (HUF)", "Franc CFP (XPF)", "Franc suisse (CHF)",
				"Kuna croate (HRK)", "Leu roumain (RON)", "Lev bulgare (BGN)", "Livre sterling (Irlande du Nord) (INP)",
				"Livre sterling (Royaume-Uni) (GBP)", "Livre sterling (Écosse) (SCO)", "Livre turque (TRY)",
				"Nouveau dollar de Taïwan (TWD)", "Nouveau sol péruvien (PEN)", "Peso chilien (CLP)",
				"Peso colombien (COP)", "Peso dominicain (DOP)", "Peso mexicain (MXN)", "Peso philippin (PHP)",
				"Peso uruguayen (UYU)", "Quetzal guatémaltèque (GTQ)", "Rand sud-africain (ZAR)", "Rial omanais (OMR)",
				"Ringgit malaisien (MYR)", "Riyal saoudien (SAR)", "Rouble russe (RUB)", "Roupie indonésienne (IDR)",
				"Réal brésilien (BRL)", "Shekel de l’État d’Israël (ILS)", "Shilling kényan (KES)",
				"Won sud-coréen (KRW)", "Yen japonais (JPY)", "Yuan chinois (CNY)", "Zloty polonais (PLN)" }));
	}

	public void VerifyCurrencyPageHeader() {
		Decorator();
		try {
			String titleText = titleText = getTextInCurrentLocale(StringArray.ARRAY_OFX_CURRENCY_TITLE);
			// if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
			// titleText = getTextInCurrentLocale(StringArray.ARRAY_OFX_CURRENCY_TITLE_IOS);
			// } else {
			// titleText = getTextInCurrentLocale(StringArray.ARRAY_OFX_CURRENCY_TITLE);
			// }

			mobileAction.verifyElementTextIsDisplayed(currency_header, titleText);
		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void randomSelectCurrency() {
		Decorator();
		try {
			int list_size = currency_list.size();
			System.out.println("List size:" + list_size);
			if (list_size == 0) {
				mobileAction.Report_Fail("Failed...No Currency in list");
				System.out.println("Failed...No Currency in list");
				return;
			}

			int randonm = getRandomInRange(0, list_size - 1);
			System.out.println("Random index is:" + randonm);
			String selectedCurrency = mobileAction.getValue(currency_list.get(randonm));
			System.out.println("Currency is selected:" + selectedCurrency);
			// Save to Description for further verification
			CL.getTestDataInstance().TCParameters.put("Description", selectedCurrency);

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String expectedXpath = "//XCUIElementTypeStaticText[@label='" + selectedCurrency + "']";
				mobileAction.FuncSwipeWhileElementNotFoundByxpath(expectedXpath, true, 20, "up");
			} else {
				mobileAction.FuncSwipeWhileElementNotFound(currency_list.get(randonm), true, 20, "up");
			}

			// mobileAction.FuncClick(currency_list.get(randonm),
			// selectedCurrency);

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

	public void cancelSelection() {
		Decorator();
		try {
			mobileAction.FuncClick(cancel_currency_button, "X - Cancel Selection");
		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyDefaultCurrenyUSD() {
		Decorator();
		try {
			String usdXapth = "";
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				usdXapth = "//XCUIElementTypeStaticText[contains(@label,'(USD)')]/..";
			} else {
				usdXapth = "//android.widget.TextView[contains(@text,'(USD)')]/../android.widget.ImageView[@resource-id='com.td:id/action_sheet_checkmark']";
			}

			mobileAction.FuncSwipeWhileElementNotFoundByxpath(usdXapth, false, 30, "up");

			MobileElement usdItem = mobileAction.verifyElementUsingXPath(usdXapth, "USD Currency");

			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("ios")) {
				String usdLabel = mobileAction.getValue(usdItem);
				String expectedUSD = "";
				if (currentLocale.equalsIgnoreCase("fr")) {
					expectedUSD = "Sélectionnée\\s*Dollar\\s*américain";
				} else {
					expectedUSD = "Selected\\s*United\\s*States\\s*Dollar";
				}
				if (usdLabel.matches(expectedUSD)) {
					mobileAction.Report_Pass_Verified("Default Currency is USD");
				} else {
					mobileAction.Report_Fail("Failed to verify default currency USD");
				}
			} else {
				mobileAction.Report_Pass_Verified("Default Currency is USD");
			}

		} catch (NoSuchElementException | IOException e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifySearchDisclaimer() {
		Decorator();
		try {
			mobileAction.FuncSendKeys(search_field, "ABC");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			mobileAction.verifyElementTextIsDisplayed(search_disclaimer,
					getTextInCurrentLocale(StringArray.ARRAY_OFX_SEARCH_DISCLAIMER));

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifySearchEntryFunctional() {
		Decorator();
		try {
			mobileAction.FuncSendKeys(search_field, "chi");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}

			int listSize = currency_list.size();
			boolean isResultVerified = true;

			for (int i = 0; i < listSize; i++) {
				String capturedStr = mobileAction.getValue(currency_list.get(0));
				if (capturedStr.toLowerCase().contains("chi")) {
					isResultVerified = isResultVerified && true;
				} else {
					isResultVerified = isResultVerified && false;
				}
			}

			if (isResultVerified) {
				mobileAction.Report_Pass_Verified("Search result with 'chi'");
			} else {
				mobileAction.Report_Fail("Failed to verify search resut with 'chi'");
				return;
			}

			mobileAction.FuncSendKeys(search_field, "chin");
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				mobileAction.FuncHideKeyboard();
			} else {
				mobileAction.FuncClickDone();
			}
			listSize = currency_list.size();
			for (int i = 0; i < listSize; i++) {
				String capturedStr = mobileAction.getValue(currency_list.get(0));
				if (capturedStr.toLowerCase().contains("chi")) {
					isResultVerified = isResultVerified && true;
				} else {
					isResultVerified = isResultVerified && false;
				}
			}

			if (isResultVerified) {
				mobileAction.Report_Pass_Verified("Search result with 'chin'");
			} else {
				mobileAction.Report_Fail("Failed to verify search resut with 'chin'");
				return;
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}

	public void VerifyCurrencyContent() {
		Decorator();
		init_currency_set();
		Set<String> captured_Currency_Set = new HashSet<String>();

		try {
			if (CL.getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				String finalCurrencyXpath = "";
				if (currentLocale.equalsIgnoreCase("fr")) {
					finalCurrencyXpath = "//android.widget.TextView[@text='Zloty polonais (PLN)']";
				} else {
					finalCurrencyXpath = "//android.widget.TextView[@text='Vietnamese Dong (VND)']";
				}

				while (true) {
					int listSize = currency_list.size();
					for (int i = 0; i < listSize; i++) {
						String capturedCurrency = mobileAction.getText(currency_list.get(i));
						captured_Currency_Set.add(capturedCurrency);
					}
					if (mobileAction.verifyElementIsPresentByXpath(finalCurrencyXpath)) {
						break;
					} else {
						mobileAction.FuncSwipeOnce("up");
					}
				}

			} else {
				int listSize = currency_list.size();
				for (int i = 0; i < listSize; i++) {
					String capturedCurrency = mobileAction.getText(currency_list.get(i));
					captured_Currency_Set.add(capturedCurrency);
				}
			}

			int setSize = captured_Currency_Set.size();
			System.out.println("Captured set size:" + setSize);
			if (currentLocale.equalsIgnoreCase("fr")) {
				if (captured_Currency_Set.equals(Currency_Set_FR)) {
					mobileAction.Report_Pass_Verified("Currency Content verified");
				} else {
					int setSizeFR = Currency_Set_FR.size();
					if(setSizeFR >= setSize) {
						System.out.println(Currency_Set_FR.removeAll(captured_Currency_Set));
					} else {
						System.out.println(captured_Currency_Set.removeAll(Currency_Set_FR));
					}					
					mobileAction.Report_Fail("Failed to verify currency content");
				}
			} else {
				if (captured_Currency_Set.equals(Currency_Set_En)) {
					mobileAction.Report_Pass_Verified("Currency Content verified");
				} else {
					int setSizeEN = Currency_Set_En.size();
					if(setSizeEN >= setSize) {
						System.out.println(Currency_Set_En.removeAll(captured_Currency_Set));
					} else {
						System.out.println(captured_Currency_Set.removeAll(Currency_Set_En));
					}
					mobileAction.Report_Fail("Failed to verify currency content");
				}
			}

		} catch (Exception e) {
			System.err.println("TestCase has failed.");
			CL.getGlobalVarriablesInstance().bStopNextFunction = false;
		}
	}
}
