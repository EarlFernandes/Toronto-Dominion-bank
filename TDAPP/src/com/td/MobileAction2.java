package com.td;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.td.test.CDNMobile.pages.Login;
import com.td.test.framework.CommonLib;
import com.td.test.framework.MobileAction;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy.ByIosClassChain;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileAction2 extends CommonLib {

	public final int MaxTimeoutInSec = 10;

	public static final int TYPE_YYYY_MM_DD = 1;
	public static final int TYPE_YYYY_MM_DD_WEEKDATE = 2;
	public static final int TYPE_MM_YYYY = 3;
	public static final int TYPE_YYYY_MM_DD_TODAY = 4;
	public static final int TYPE_YYYY_MM_DD_HOUR = 5;
	public static final int TYPE_YYYY_MM_DD_RANGE = 6;

	/**
	 * This method will look for an element on the screen to be clickable within
	 * the given timeout and then click over the element.
	 * 
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 * @throws IllegalArgumentException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void FuncClick(WebElement objElement, String text)
			throws InterruptedException, IOException, NoSuchElementException {
		try {

			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(objElement));

			objElement.click();

			GetReporting().FuncReport("Pass", "The element <b>  " + text + " </b> Clicked");
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "The element <b>- " + text + "</b> not present in current page");
			} catch (IOException e1) {

				e1.printStackTrace();
			}
			throw e;
		}
	}

	/**
	 * This method will click on the back button on the screen. If in any
	 * application, it will navigate to the previous page.
	 * 
	 * @throws IOException
	 *             If there is problem while reporting..
	 */
	public void FuncClickBackButton() throws IOException {
		try {
			((AppiumDriver) GetDriver()).navigate().back();
			GetReporting().FuncReport("Pass", "The back button has been clicked.");
		} catch (IllegalArgumentException e) {
			try {
				GetReporting().FuncReport("Fail", "IllegalArgumentException");
			} catch (IOException e1) {

				e1.printStackTrace();
			}
			throw e;
		} catch (NoSuchElementException n) {
			try {
				GetReporting().FuncReport("Fail", "Element not displayed");
			} catch (IOException e) {

				e.printStackTrace();
			}
			throw n;
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "The element not present in current page");
			} catch (IOException e1) {

				e1.printStackTrace();
			}
			throw e;
		}
	}
	
	

	/**
	 * This method will click over a particular coordinate the number of times
	 * it has been specified with a delay of 80 ms between each click.
	 * 
	 * @param x
	 *            The abscissa of the click coordinates.
	 * @param y
	 *            The ordinates of the click coordinates.
	 * @param clickCount
	 *            The number of times to be clicked.
	 * @throws Exception
	 *             If an exception occurs while clicking over the element or if
	 *             there is a problem in reporting the event.
	 */
	public void FuncClickCoordinates(int x, int y, int clickCount) throws Exception {
		try {
			int i = 0;
			TouchAction action = new TouchAction(((MobileDriver) GetDriver()));
			while (i < clickCount) {
				action.tap(x, y).perform();

				i++;
				Thread.sleep(80);
			}
			GetReporting().FuncReport("Pass",
					"Successfully clicked over coordinates '(" + x + "," + y + ")' " + clickCount + " times");
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
			throw e;
		} catch (NoSuchElementException n) {
			GetReporting().FuncReport("Fail", "Element not displayed");
			throw n;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception <b>- " + e.toString()
					+ "</b> occured while trying click over coordinates '(" + x + "," + y + ")'.");
			throw e;
		}
	}

	public void FuncClickElementCoordinates(MobileElement objElement, String text) {
		int iAbscissa = 0;
		int iOrdinate = 0;
		try {

			iAbscissa = objElement.getRect().getHeight();
			iOrdinate = objElement.getRect().getY();

			FuncClickCoordinates(iAbscissa, iOrdinate, 1);

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "Exception <b>- " + e.toString()
						+ "</b> occured while trying click over coordinates '(" + iAbscissa + "," + iOrdinate + ")'.");
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}
	}

	/**
	 * This method will look for an element on the screen to be clickable within
	 * the given timeout and then click over the element.
	 * 
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 * @throws IllegalArgumentException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void FuncClickTap(MobileElement objElement, String text)
			throws InterruptedException, IOException, NoSuchElementException {
		try {

			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.elementToBeClickable(objElement));
			objElement.tap(1, 2000);
			GetReporting().FuncReport("Pass", "The element <b>  " + text + " </b> Clicked");
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "IllegalArgumentException");
			throw e;
		} catch (NoSuchElementException n) {
			GetReporting().FuncReport("Fail", "Element not displayed" + text);
			throw n;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "The element <b>- " + text + "</b> not present in current page");
			throw e;
		}
	}

	public void FuncElementSwipeWhileNotFound(int x, int y, int width, int hieght, MobileElement swipeForElement,
			int maxSwipes, String direction) {
		int locationX = x;
		int locationY = y;
		int dimensionX = width;
		int dimensionY = hieght;

		int startx, starty, endx, endy;
		if (direction.equalsIgnoreCase("up")) {
			startx = locationX + dimensionX / 2;
			endx = startx;
			starty = locationY + dimensionY - 5;
			endy = locationY + 10;
		} else {
			startx = locationX + dimensionX / 2;
			endx = startx;
			starty = locationY + dimensionY - 10;
			endy = locationY + 10;
		}

		boolean elementFound = false;
		for (int i = 1; i <= maxSwipes; i++) {
			try {
				elementFound = swipeForElement.isDisplayed();
				swipeForElement.click();
				if (elementFound)
					break;
				else
					throw new NoSuchElementException("");
			} catch (NoSuchElementException e) {

				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty, endx, endy, 3000);
			}

		}
	}

	/**
	 * This function will swipe within a given element to find the element that
	 * has bee specified. It will swipe only within the particular element you
	 * have specified.
	 * 
	 * @param swipeWithinElement
	 *            The element within which elementToFind is located. We need to
	 *            swipe within this element. Please also make sure that the
	 *            element is swipeable, otherwise it will throw an error.
	 * @param elementToFind
	 *            The element that has to be found with the swipes.
	 * @param maxSwipes
	 *            The maximum number of times you want to swipe until the
	 *            element has been found.
	 * @param direction
	 *            The direction of swipe. It is either 'up', 'down', 'left' or
	 *            'right'. If the direction is something else, an
	 *            IllegalArgumentException is thrown and the test will fail.
	 * @param clickOnElement
	 *            A boolean value specifying weather you want to click on the
	 *            element after it has been found.
	 * 
	 * @throws IOException
	 *             If some error comes in reporting.
	 */
	public void FuncElementSwipeWhileNotFound(MobileElement swipeWithinElement, MobileElement elementToFind,
			int maxSwipes, String direction, boolean clickOnElement) throws IOException {
		try {
			Dimension dimensionOfSwipingElement = swipeWithinElement.getSize();
			Point locationOfSwipingElement = swipeWithinElement.getLocation();
			int startx, starty, endx, endy;
			if (direction.equalsIgnoreCase("down")) {
				startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
				;
				starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height - 20;
				endx = startx;
				endy = locationOfSwipingElement.getY() + 20;
			} else if (direction.equalsIgnoreCase("up")) {
				startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
				starty = locationOfSwipingElement.getY() + 20;
				endx = startx;
				endy = locationOfSwipingElement.getY() + dimensionOfSwipingElement.getHeight() - 20;
			} else if (direction.equalsIgnoreCase("right")) {
				startx = locationOfSwipingElement.getX() + 10;
				starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
				endx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
				endy = starty;
			} else if (direction.equalsIgnoreCase("left")) {
				startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
				starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
				endx = locationOfSwipingElement.getX() + 10;
				endy = starty;
			} else {
				throw new IllegalArgumentException("The direction given is '" + direction
						+ "' is wrong. Please give either 'up', 'down', 'left' or 'right'.");
			}

			for (int i = 0; i < maxSwipes; i++) {
				boolean elementFound = false;
				try {
					elementFound = elementToFind.isDisplayed();
				} catch (NoSuchElementException e) {
					((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty, endx, endy, 3000);
				}
				if (elementFound) {
					if (clickOnElement)
						elementToFind.click();
					break;
				}
			}
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "Error occured in swipeWhileNotFound. \n" + e.toString());
			throw e;
		} catch (NoSuchElementException e) {
			GetReporting().FuncReport("Fail",
					"Could not find element: '" + elementToFind.toString() + "' in '" + maxSwipes + "' swipes.");
			throw e;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail",
					"Exception '" + e.toString() + "' occurred while trying to use swipeWhileNotFound.");
			throw e;
		}
	}

	/**
	 * This function will swipe within a given element to find the text that has
	 * bee specified. It will swipe only within the particular element you have
	 * specified.
	 * 
	 * @param swipeWithinElement
	 *            The element within which elementToFind is located. We need to
	 *            swipe within this element. Please also make sure that the
	 *            element is swipeable, otherwise it will throw an error.
	 * @param elementToFind
	 *            The element that has to be found with the swipes.
	 * @param maxSwipes
	 *            The maximum number of times you want to swipe until the
	 *            element has been found.
	 * @param direction
	 *            The direction of swipe. It is either 'up', 'down', 'left' or
	 *            'right'. If the direction is something else, an
	 *            IllegalArgumentException is thrown and the test will fail.
	 * @param clickOnElement
	 *            A boolean value specifying weather you want to click on the
	 *            element after it has been found.
	 * 
	 * @throws IOException
	 *             If some error comes in reporting.
	 */
	public void FuncElementSwipeWhileNotFound(MobileElement swipeWithinElement, String xpathOfElement, int maxSwipes,
			String direction, boolean clickOnElement) throws IOException {
		try {
			new WebDriverWait(GetDriver(), MaxTimeoutInSec).until(ExpectedConditions.visibilityOf(swipeWithinElement));

			Dimension dimensionOfSwipingElement = swipeWithinElement.getSize();
			Point locationOfSwipingElement = swipeWithinElement.getLocation();
			int startx, starty, endx, endy;
			if (direction.equalsIgnoreCase("down")) {
				startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
				;
				starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height - 20;
				endx = startx;
				endy = locationOfSwipingElement.getY() + 20;
			} else if (direction.equalsIgnoreCase("up")) {
				startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
				starty = locationOfSwipingElement.getY() + 20;
				endx = startx;
				endy = locationOfSwipingElement.getY() + dimensionOfSwipingElement.getHeight() - 20;
			} else if (direction.equalsIgnoreCase("right")) {
				startx = locationOfSwipingElement.getX() + 10;
				starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
				endx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
				endy = starty;
			} else if (direction.equalsIgnoreCase("left")) {
				startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
				starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
				endx = locationOfSwipingElement.getX() + 10;
				endy = starty;
			} else {
				throw new IllegalArgumentException("The direction given is '" + direction
						+ "' is wrong. Please give either 'up', 'down', 'left' or 'right'.");
			}

			for (int i = 0; i < maxSwipes; i++) {
				boolean elementFound = false;
				WebElement elementToFind = null;
				try {
					elementToFind = ((AppiumDriver<WebElement>) GetDriver()).findElement(By.xpath(xpathOfElement));
					elementFound = elementToFind.isDisplayed();

				} catch (NoSuchElementException e) {
					((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty, endx, endy, 3000);
				}
				if (elementFound) {
					if (clickOnElement)
						elementToFind.click();
					break;
				}
			}
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "Error occured in swipeWhileNotFound. \n" + e.toString());
			throw e;
		} catch (NoSuchElementException e) {
			GetReporting().FuncReport("Fail",
					"Could not find element: '" + xpathOfElement + "' in '" + maxSwipes + "' swipes.");
			throw e;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail",
					"Exception '" + e.toString() + "' occurred while trying to use swipeWhileNotFound.");
			throw e;
		}
	}

	/**
	 * This function will check if the given element is NOT in the list. Pass if
	 * it is not found, FAIL if it is found
	 * 
	 * @param swipeWithinElement
	 *            The element within which elementToFind is located. We need to
	 *            swipe within this element. Please also make sure that the
	 *            element is swipeable, otherwise it will throw an error.
	 * @param elementToFind
	 *            The element that has to be found with the swipes.
	 * @param maxSwipes
	 *            The maximum number of times you want to swipe until the
	 *            element has been found.
	 * @param direction
	 *            The direction of swipe. It is either 'up', 'down', 'left' or
	 *            'right'. If the direction is something else, an
	 *            IllegalArgumentException is thrown and the test will fail.
	 * 
	 * @throws IOException
	 *             If some error comes in reporting.
	 */
	public boolean FuncElementNotInListSwipe(MobileElement swipeWithinElement, String xpathOfElement, int maxSwipes,
			String direction) throws IOException {
		try {
			Dimension dimensionOfSwipingElement = swipeWithinElement.getSize();
			Point locationOfSwipingElement = swipeWithinElement.getLocation();
			int startx, starty, endx, endy;
			if (direction.equalsIgnoreCase("down")) {
				startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
				;
				starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height - 20;
				endx = startx;
				endy = locationOfSwipingElement.getY() + 20;
			} else if (direction.equalsIgnoreCase("up")) {
				startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() / 2;
				starty = locationOfSwipingElement.getY() + 20;
				endx = startx;
				endy = locationOfSwipingElement.getY() + dimensionOfSwipingElement.getHeight() - 20;
			} else if (direction.equalsIgnoreCase("right")) {
				startx = locationOfSwipingElement.getX() + 10;
				starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
				endx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
				endy = starty;
			} else if (direction.equalsIgnoreCase("left")) {
				startx = locationOfSwipingElement.getX() + dimensionOfSwipingElement.getWidth() - 10;
				starty = locationOfSwipingElement.getY() + dimensionOfSwipingElement.height / 2;
				endx = locationOfSwipingElement.getX() + 10;
				endy = starty;
			} else {
				throw new IllegalArgumentException("The direction given is '" + direction
						+ "' is wrong. Please give either 'up', 'down', 'left' or 'right'.");
			}

			for (int i = 0; i < maxSwipes; i++) {
				boolean elementFound = false;
				WebElement elementToFind = null;
				try {
					elementToFind = ((AppiumDriver<WebElement>) GetDriver()).findElement(By.xpath(xpathOfElement));
					elementFound = elementToFind.isDisplayed();

				} catch (NoSuchElementException e) {
					((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty, endx, endy, 3000);
				}
				if (elementFound) {
					GetReporting().FuncReport("Fail", "Element was found when it should not be in list! \n");
					return false;
				}
			}
			GetReporting().FuncReport("Pass",
					"Could not find element: '" + xpathOfElement + "' in '" + maxSwipes + "' swipes.");
			return true;
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "Error occured in swipeWhileNotFound. \n" + e.toString());
			throw e;
		} catch (NoSuchElementException e) {
			GetReporting().FuncReport("Pass",
					"Could not find element: '" + xpathOfElement + "' in '" + maxSwipes + "' swipes.");
			return true;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail",
					"Exception '" + e.toString() + "' occurred while trying to use swipeWhileNotFound.");
			throw e;
		}
	}

	/**
	 * This method will return the text of the element which has been specified
	 * and print it in the report as well.
	 * 
	 * @param objElement
	 *            The element for which the text is to be printed in the report.
	 * @return The String value of the Text in the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 */
	public String FuncGetText(MobileElement objElement) {// throws IOException
															// {//@Author -
															// Sushil
															// 13-Apr-2017
		String textToReturn = null;
		try {

			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(objElement));

			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					textToReturn = objElement.getText();
					GetReporting().FuncReport("Pass", "Text of the element : <b> " + textToReturn + "</b>");
				} catch (Exception e) {
					GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
				}
			} else {
				try {
					textToReturn = objElement.getAttribute("label");
					GetReporting().FuncReport("Pass", "Text of the element : <b> " + textToReturn + "</b>");
				} catch (Exception e) {
					try {
						textToReturn = objElement.getAttribute("value");
						GetReporting().FuncReport("Pass", "Text of the element : <b> " + textToReturn + "</b>");
					} catch (Exception e1) {
						try {
							textToReturn = objElement.getAttribute("name");
							GetReporting().FuncReport("Pass", "Text of the element : <b> " + textToReturn + "</b>");
						} catch (Exception e2) {
							GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
						}
					}
				}
			}
		} catch (IOException e) {
			try {
				GetReporting().FuncReport("Fail", "Exception in FuncGetText(). getText() failed.");
			} catch (IOException e1) {

				e1.printStackTrace();
			}
			// throw e;
		}
		return textToReturn;
	}

	/**
	 * This method will close the keyboard if it is open. <br>
	 * <p>
	 * <b> Please use this method only when the keyboard is open as it used
	 * navigate.back in the backend and will navigate to the previous page if
	 * the keyboard is not open. </b>
	 * </p>
	 * 
	 * @throws IOException
	 */
	public void FuncHideKeyboard() throws IOException {

		try {
			// ((AppiumDriver) GetDriver()).navigate().back();
			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				(GetAppiumDriver()).hideKeyboard();
			else
				FuncClickDone();
			GetReporting().FuncReport("Pass", "Keyboard has been closed.");
		} catch (WebDriverException e) {
			System.out.println("WebDriverException occured while while closing keyboard, but ignor it");
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception '" + e.toString() + "' occurred while closing keyboard.");
			try {
				throw e;
			} catch (Exception e1) {
				System.out.println("Exception caught: " + e1.toString());
			}
		}
	}

	/**
	 * This method will can be used in case FuncSwipeAndScroll is throwing any
	 * exception.
	 * 
	 * @param elementToFind
	 * @param clickYorN
	 * @throws Exception
	 */
	public void FunCnewSwipe(MobileElement elementToFind, boolean clickYorN, int swipes) throws Exception {
		Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
		int startx = size.width;
		int starty = size.height;
		boolean flag = true;
		int count = 0;
		try {
			while (flag && count < swipes) {

				try {
					if (elementToFind.isDisplayed()) {

						flag = false;
					} else {

						((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx / 2, starty - starty / 4,
								startx / 2, starty / 4, 600);
						count++;
					}
				} catch (Exception e) {
					System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());

					((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx / 2, starty - starty / 4,
							startx / 2, starty / 4, 600);
					count++;
				}

			}

		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
			throw e;
		} catch (NoSuchElementException n) {
			GetReporting().FuncReport("Fail", "Element not displayed");
			throw n;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail",
					"Exception <b>- " + e.toString() + "</b> occured while trying launch the application.");
			throw e;
		}
		if (clickYorN) {
			elementToFind.click();
		}

	}

	/**
	 * This method will run the currently running app in background
	 * 
	 * @param timeout
	 *            The seconds for which the app will be running in background .
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	@SuppressWarnings("deprecation")
	public void FuncRunAppInBackground(int timeout) throws IOException {
		try {
			// ((InteractsWithApps) GetDriver()).runAppInBackground(timeout);
			GetAppiumDriver().runAppInBackground(timeout);
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "<b>- " + "</b> Error in running app in background.");
			throw e;
		}
	}

	/**
	 * This function will return the int array of the screen size as (x,y).
	 * 
	 * @return The screensize int array.
	 * @throws IOException
	 *             if there is a problem in reporting.
	 */
	public int[] FuncScreenSize() throws IOException {
		try {
			Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
			int x = size.width;
			int y = size.height;
			int[] returnVal = { x, y };
			return returnVal;
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
			throw e;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception <b>- " + e.toString() + "</b> occured while GET screen size.");
			throw e;
		}
	}

	/**
	 * This method will click particular element from the table.
	 * 
	 * @param The
	 *            element which has to be identified
	 * 
	 * @param Text
	 *            to print in report
	 * 
	 * @return boolean
	 * 
	 *         true if element is displayed or false
	 * 
	 */

	public void FuncSelectElementInTable(String element, String cellAddress1, String cellAddress2,
			String valueToSelect) {
		try {
			MobileElement dropdown = (MobileElement) ((AppiumDriver) GetDriver()).findElement(By.xpath(element));
			for (int i = 1; i < 100; i++) {
				String Firstpart = cellAddress1;
				String Secondpart = cellAddress2;
				String Finalpart = Firstpart + i + Secondpart;

				MobileElement options = dropdown.findElement(By.xpath(Finalpart));

				if (options.getText().contains(valueToSelect)) {
					options.click();

					GetReporting().FuncReport("Pass", "The element <b>  " + valueToSelect + " </b> Clicked");
					break;
				}
			}
		} catch (IllegalArgumentException | IOException e) {
			try {
				GetReporting().FuncReport("Fail", "IllegalArgumentException");
			} catch (IOException e1) {

				e1.printStackTrace();
			}
		}
	}

	/**
	 * Forcefully send character sequence by opening up the keyboard even if you
	 * are not on any text element.
	 * 
	 * @param charctersToSend
	 *            The character sequence to send.
	 * @throws IOException
	 *             If there is a problem while reporting
	 */
	public void FuncSendKeys(CharSequence charctersToSend) throws IOException {
		try {
			((AppiumDriver) GetDriver()).getKeyboard().sendKeys(charctersToSend);
			GetReporting().FuncReport("Pass", "Character seuence '" + charctersToSend + "' sent successfully.");
		} catch (WebDriverException e) {
			GetReporting().FuncReport("Fail", "WebDriverException occured while sending the key events.");
			throw e;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception '" + e.toString() + "' occurred while sending key events.");
			throw e;
		}
	}

	/**
	 * This method will send a text or type some text to the element that has
	 * been specified in the objElement.
	 * 
	 * @param objElement
	 *            The Mobile element to which we want to send the text.
	 * @param sTextToSend
	 *            The text that has t be sent to the element.
	 * @throws InterruptedException
	 *             In case there is an error while executing the command.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws TimeoutException
	 *             In case the element is not found within the specified
	 *             timeout.
	 */
	public void FuncSendKeys(WebElement objElement, String sTextToSend)
			throws InterruptedException, IOException, TimeoutException {
		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.elementToBeClickable(objElement));
			objElement.clear();
			objElement.sendKeys(new CharSequence[] { sTextToSend });
			GetReporting().FuncReport("Pass", sTextToSend + " Entered");
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "IllegalArgumentException Exception occurred");
			throw e;
		} catch (TimeoutException e) {
			GetReporting().FuncReport("Fail", "<b>- " + objElement.toString() + "</b> Time Out waiting for element");
			throw e;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "<b>- " + objElement.toString() + "</b> not present in current page");
			throw e;
		}
	}

	/**
	 * Force change the Orientation of the device to Landscape.
	 * 
	 * @throws IOException
	 *             If there is a problem while reporting
	 */
	public void FuncSetLandscapeOrientation() throws IOException {
		try {
			((AppiumDriver) GetDriver()).rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
			GetReporting().FuncReport("Pass", "Device Orientation has been set to Landscape");
		} catch (WebDriverException e) {
			GetReporting().FuncReport("Fail", "WebDriverException occured while changing orientation to landscape.");
			throw e;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail",
					"Exception '" + e.toString() + "' occurred while changing orientation to Landscape.");
			throw e;
		}
	}

	/**
	 * Force change the Orientation of the device to Potrait.
	 * 
	 * @throws IOException
	 *             If there is a problem while reporting
	 */
	public void FuncSetPotraitOrientation() throws IOException {
		try {
			((AppiumDriver) GetDriver()).rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
			GetReporting().FuncReport("Pass", "Device Orientation has been set to Potrait");
		} catch (WebDriverException e) {
			GetReporting().FuncReport("Fail", "WebDriverException occured while chenging orientation to Potrait.");
			throw e;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail",
					"Exception '" + e.toString() + "' occurred while changing orientation to Potrait.");
			throw e;
		}
	}

	public void FunCSwipeandScroll(MobileElement elementToFind, boolean clickYorN) throws Exception {
		try {
			Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
			int startx = size.width;
			int starty = size.height;
			int j = 0;
			while (!elementToFind.isDisplayed() && j < 30) {
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx / 2, starty - starty / 4,
						startx / 2, starty / 4, 600);
				j++;
			}
			if (j == 30) {
				throw new Exception("Not able to find element in list");
			}
			if (clickYorN) {
				elementToFind.tap(1, 3000);
			}
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "Did not find element in list");
			} catch (IOException e1) {
				throw e1;
			}
			throw e;
		}
	}

	/**
	 * This method will swipe either up, Down, left or Right according to the
	 * direction specified. This method takes the size of the screen and uses
	 * the swipe function present in the Appium driver to swipe on the screen
	 * with a particular timeout. There is one more method to implement swipe
	 * using touch actions, which is not put up here.
	 * 
	 * @param Direction
	 *            The direction we need to swipe in.
	 * @param swipeTime
	 *            The swipe time, ie the time for which the driver is supposed
	 *            to swipe.
	 * @param Offset
	 *            The offset for the driver, eg. If you want to swipe 'up', then
	 *            the offset is the number of pixels you want to leave from the
	 *            bottom of the screen t start the swipe.
	 * @throws IOException
	 *             If there is problem while reporting.
	 */
	public void FunctionSwipe(String Direction, int swipeTime, int Offset) throws IOException {
		try {

			Dimension size;
			size = ((AppiumDriver) GetDriver()).manage().window().getSize();
			int starty = (int) (size.height * 0.80);
			int endy = (int) (size.height * 0.20);
			int startx = size.width / 2;
			if (Direction.equalsIgnoreCase("Up")) {
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty - Offset, startx, endy,
						swipeTime);
			} else if (Direction.equalsIgnoreCase("Down")) {
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, endy + Offset, startx, starty,
						swipeTime);
			} else if (Direction.equalsIgnoreCase("Right")) {
				starty = size.height / 2;
				endy = size.height / 2;
				startx = (int) (size.width * 0.10);
				int endx = (int) (size.width * 0.90);
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx + Offset, starty, endx, endy,
						swipeTime);
			} else if (Direction.equalsIgnoreCase("Left")) {
				starty = size.height / 2;
				endy = size.height / 2;
				startx = (int) (size.width * 0.90);
				int endx = (int) (size.width * 0.10);
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx - Offset, starty, endx, endy,
						swipeTime);
			}
			GetReporting().FuncReport("Pass", "Swipe <b> " + Direction + " </b> Successful");

		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "<b>- " + "</b> not present in current page");
			throw e;
		}

	}

	/**
	 * This function waits for an element to appear in the screen. It waits
	 * until the element is visible on the screen within the given timeout.
	 * 
	 * @param objElement
	 *            The element to wait for.
	 * @param timeout
	 *            The timeout in seconds for which you want to wait for the
	 *            element to be visible on the screen.
	 * @throws IOException
	 *             If there is problem while reporting .
	 */
	public void FuncWaitForElement(MobileElement objElement, long timeout, String text) throws IOException {
		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), timeout);
			wait.until(ExpectedConditions.visibilityOf(objElement));
			GetReporting().FuncReport("Pass", "The element '" + text + "' is found on the screen.");
		} catch (NoSuchElementException e) {
			GetReporting().FuncReport("Fail", "The element '" + text + "' is not found.");
			throw e;
		} catch (TimeoutException e) {
			GetReporting().FuncReport("Fail",
					"The element '" + text + "' is not found withing the given timeout of '" + timeout + " seconds.'");
			throw e;
		} catch (WebDriverException e) {
			GetReporting().FuncReport("Fail", "A WebDriverEception has occurred. Please check connection.");
			throw e;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "Exception '" + text + "' occurred while waiting for element.");
			throw e;
		}
	}

	/**
	 * This method will return the text associated with the mobile element.
	 * 
	 * @param The
	 *            element whose text has to be retrieved.
	 * 
	 * @return String The text that is associated with the mobile element
	 * 
	 */
	public String getText(MobileElement objElement) {
		return objElement.getText();

	}

	public void quitDriver() {

		((AppiumDriver) GetDriver()).quit();

	}

	/**
	 * This method will verify the text of the element is same as the expected
	 * text
	 * 
	 * @param The
	 *            element which has to be identified
	 * 
	 * @param The
	 *            expected text
	 * 
	 * @return boolean
	 * 
	 *         true if element is displayed or false
	 * 
	 */
	public boolean verifyElement(MobileElement mobileElement, String text) { // @Author
																				// -
																				// Sushil
																				// 17-Feb-2017
																				// (Modified)

		try {
			String elementText = "";

			boolean verifyFlag = true;

			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.elementToBeClickable(mobileElement));

			/*
			 * if(getTestDataInstance().getMobilePlatForm().equalsIgnoreCase(
			 * "Android")) elementText = mobileElement.getText(); else {
			 * elementText = mobileElement.getAttribute("label"); if(elementText
			 * == null) elementText = mobileElement.getAttribute("value"); }
			 */
			elementText = FuncGetElementText(mobileElement);
			if (elementText != null) {
				if (elementText.equalsIgnoreCase(text)) {
					try {
						GetReporting().FuncReport("Pass", "The element <b>  " + elementText + " </b> is verified");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
					return true;
				} else {
					try {
						GetReporting().FuncReport("Fail", "The element <b>  " + elementText + " </b> does not match.");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
			} else {
				elementText = "";
				if (elementText.equalsIgnoreCase(text)) {
					try {
						GetReporting().FuncReport("Pass", "The element <b>  " + elementText + " </b> is verified");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
					return true;
				} else {
					try {
						GetReporting().FuncReport("Fail", "The element <b>  " + elementText + " </b> does not match.");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
			}
		} catch (Exception e1) {
			try {
				GetReporting().FuncReport("Fail", "The element does not exists. " + text);
				e1.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return false;
	}

	/**
	 * This method will verify the element is displayed on the screen.
	 * 
	 * @param The
	 *            element which has to be identified
	 * 
	 * @param Text
	 *            to print in report
	 * 
	 * @return boolean
	 * 
	 *         true if element is displayed or false
	 * 
	 */
	public void verifyElementIsDisplayed(WebElement mobileElement, String expectedText) throws IOException { // @Author
																												// -
																												// Sushil
																												// 03-Feb-2017
																												// (Modified)
		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			if (mobileElement.isDisplayed())
				GetReporting().FuncReport("Pass", "The element <b>- " + expectedText + "</b> is displayed.");
			else
				GetReporting().FuncReport("Fail", "The element <b>- " + expectedText + "</b> is not displayed");
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "The element <b>- " + expectedText + "</b> is not displayed");
			// e.printStackTrace(); //commented
			throw e;
		}
	}

	/**
	 * This method will verify the element is displayed on the screen.
	 * 
	 * @param The
	 *            element which has to be identified
	 * 
	 * @param Text
	 *            to print in report
	 * 
	 * @return boolean
	 * 
	 *         true if element is displayed or false
	 * 
	 */
	public void verifyElementIsDisplayed(MobileElement mobileElement, String expectedText) throws IOException { // @Author
																												// -
																												// Sushil
																												// 03-Feb-2017
																												// (Modified)
		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			if (mobileElement.isDisplayed())
				GetReporting().FuncReport("Pass", "The element <b>- " + expectedText + "</b> is displayed.");
			else
				GetReporting().FuncReport("Fail", "The element <b>- " + expectedText + "</b> is not displayed");
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "The element <b>- " + expectedText + "</b> is not displayed");
			// e.printStackTrace(); //commented
			throw e;
		}
	}

	public boolean verifyElementNotPresent(WebElement mobileElement, String expectedText) {

		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.elementToBeClickable(mobileElement));

			if (mobileElement.isDisplayed() == true) {
				try {
					GetReporting().FuncReport("Fail", "The '" + expectedText + "' is verified");
				} catch (IOException e) {
					System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				return true;
			} else {
				try {
					GetReporting().FuncReport("Pass", "The '" + expectedText + "' is not verified");
				} catch (IOException e) {
					System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
				}
				return false;
			}

		} catch (Exception ex) {
			try {
				GetReporting().FuncReport("Pass", "The '" + expectedText + "' is not present");
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			return false;
		}

	}

	/**
	 * This method will verify the text contained in another String.
	 * 
	 *
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             In case the element is not found over the screen.
	 */
	public void verifyElementTextContains(WebElement objElement, String text) {// throws
																				// IOException
																				// {
																				// //@Author
																				// -
																				// Sushil
																				// 31-Mar-2017
																				// Modified
		try {
			String sEleText = FuncGetElementText(objElement);
			// for French, sometimes the captured text contains french space,
			// need to replace it to English space
			sEleText = sEleText.replace(" ", " "); // they looks like the same,
													// but they are different
			if (sEleText != null) {
				if (sEleText.contains(text))
					GetReporting().FuncReport("Pass",
							"Element contains expected text<b> " + text + "</b> .Element text:" + sEleText);
				else
					GetReporting().FuncReport("Fail",
							"Element text <b>" + sEleText + "</b> does not contain expected text. <b>" + text + "</b>");
			} else {
				sEleText = "";
				if (sEleText.contains(text))
					GetReporting().FuncReport("Pass",
							"Element contains text<b> " + text + "</b> .Element text:" + sEleText);
				else
					GetReporting().FuncReport("Fail",
							"Element text <b>" + sEleText + "</b> does not contain expected text. <b>" + text + "</b>");
			}
		} catch (IOException e) {
			try {
				GetReporting().FuncReport("Fail", "Element does not contain expected text:" + text);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			// throw e;
		}
	}

	/**
	 * verify login for 5 times
	 * 
	 * @param The
	 *            element which has to be identified
	 * 
	 * @return void
	 * @throws IOException
	 * 
	 */
	public boolean verifyLoginErrorOccured(String mobileElement) throws InterruptedException, IOException {
		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mobileElement)));

			GetReporting().FuncReport("Pass",
					"Your login information does not match what we have on file message is shown");

			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public boolean verifySymbol(String text, String delimiter) {
		if (text.startsWith(delimiter)) {
			try {
				GetReporting().FuncReport("Pass", "The symbol'" + delimiter + "' is verified");
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			return true;
		} else {
			try {
				GetReporting().FuncReport("Fail", "The symbol'" + delimiter + "' is not verified");
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			return false;
		}

	}

	/**
	 * 
	 * THis method will return true if element contains some part of expected
	 * text.
	 * 
	 * @param retrivedText
	 * @param expectedText
	 * @return
	 */

	public boolean verifyTextContains(WebElement mobileElement, String expectedText) {
		String retrivedText = FuncGetElementText(mobileElement);

		if (retrivedText.contains(expectedText)) {
			try {
				GetReporting().FuncReport("Pass", "The text '" + expectedText + "' is verified");
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			return true;
		} else {
			try {
				GetReporting().FuncReport("Fail", "The text '" + expectedText + "' is not verified");
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			return false;
		}
	}

	public boolean verifyTextEquality(String text1, String text2) {
		if (text1.equalsIgnoreCase(text2)) {
			try {
				GetReporting().FuncReport("Pass", "The text " + text1 + " is verified");
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			return true;
		} else {
			try {
				GetReporting().FuncReport("Fail", "The text " + text1 + " is not verified");
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			return false;
		}

	}

	/**
	 * @author Ashraf This method will verify if the text1 contains the value
	 *         present in text2.
	 * @param text1
	 * @param text2
	 * @return
	 */
	public boolean verifyTextContains(String text1, String text2) {
		if (text1.contains(text2) || text1.contains(text2.toUpperCase()) || text1.contains(text2.toLowerCase())) {
			try {
				GetReporting().FuncReport("Pass", "The text " + text1 + " is verified");
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			return true;
		} else {
			try {
				GetReporting().FuncReport("Fail", "The text " + text1 + " is not verified");
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			return false;
		}

	}

	/**
	 * This method will wait for the element to appear on the screen.
	 * 
	 * @param The
	 *            element which has to be identified
	 * 
	 * @return void
	 * @throws IOException
	 * 
	 */
	public void waitForElementToAppear(String locater, String text) throws InterruptedException, IOException {
		long timeoutInSeconds = 660;
		try {
			System.out.println("Wait for " + timeoutInSeconds + "s");
			WebDriverWait wait = new WebDriverWait(GetDriver(), timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locater)));
			GetReporting().FuncReport("Pass", "The text '" + text + "' is visible");
		} catch (NoSuchElementException e) {
			GetReporting().FuncReport("Fail", "The text '" + text + "' has not appeared");
		} catch (IOException e) {
			GetReporting().FuncReport("Fail", "The text '" + text + "' has not appeared");
			e.printStackTrace();
		}
	}

	/**
	 * This method will wait for the element to disappear from the screen.
	 * 
	 * @param The
	 *            element which has to disappear
	 * 
	 * @return void
	 * 
	 */
	public void waitForElementToDisappear(String xpath) throws InterruptedException {
		boolean flag = false;
		while (flag == false) {
			try {
				WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));

				flag = true;
			} catch (Exception e) {

				flag = false;
			}
		}
	}

	/**
	 * This method will wait for the element to disappear from the screen.
	 * 
	 * @param The
	 *            element which has to disappear
	 * 
	 * @return void
	 * 
	 */
	public void waitForElementToVanish(MobileElement elementToVanish) {
		try {
			int count = 0;
			boolean isElementDisplayed = FuncIsDisplayed(elementToVanish);
			while (isElementDisplayed && count <= 45) {
				sleep(1000);
				count++;
				isElementDisplayed = FuncIsDisplayed(elementToVanish);
			}
		} catch (Exception e) {
			System.out.println("Exception from Method " + this.getClass().toString());
		}
	}

	/**
	 * This method will verify the Element present using XPATH.
	 * 
	 *
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             In case the element is not found over the screen.
	 */
	public MobileElement verifyElementUsingXPath(String objElement, String text) throws IOException {
		try {

			MobileElement objMobileElement = (MobileElement) ((AppiumDriver) GetDriver())
					.findElement(By.xpath(objElement));
			verifyElementIsDisplayed(objMobileElement, text);
			return objMobileElement;
		} catch (IOException e) {
			GetReporting().FuncReport("Fail", "IOException Exception occurred");
			return null;
		}
	}

	/**
	 * This method will verify the Element present using XPATH.
	 * 
	 *
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             In case the element is not found over the screen.
	 */
	public WebElement verifyWebElementUsingXPath(String objElement, String text) throws IOException {
		try {

			WebElement objMobileElement = (WebElement) ((AppiumDriver) GetDriver()).findElement(By.xpath(objElement));
			verifyElementIsDisplayed(objMobileElement, text);
			return objMobileElement;
		} catch (IOException e) {
			GetReporting().FuncReport("Fail", "IOException Exception occurred");
			return null;
		}
	}

	/**
	 * This method will convert the String to mobileElement and do swipe
	 * function
	 * 
	 * @param The
	 *            element which has to disappear
	 * 
	 * @return void
	 * 
	 */
	public void changeToMobileElementAndSwipe(String element, boolean clickable) {
		try {
			MobileElement elementVal = (MobileElement) ((AppiumDriver) GetDriver()).findElement(By.xpath(element));
			FunCSwipeandScroll(elementVal, clickable);

		} catch (Exception e) {
			System.out.println("Exception from Method " + this.getClass().toString());
		}
	}

	/**
	 * This method will click on allow button.
	 * 
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void FuncClickAllow() {
		if (((AndroidDriver) GetDriver()).currentActivity().contains("GrantPermissionsActivity")) {
			GetDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			GetDriver().findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		}
	}

	public boolean FuncIsDisplayed(MobileElement elementToFind) {

		try {
			if (elementToFind.isDisplayed()) {
				return true;
			} else {
				return false;

			}
		} catch (Exception e) {

			return false;
		}
	}

	public boolean FuncIsDisplayed(MobileElement elementToFind, String value) {
		try {
			if (elementToFind.isDisplayed()) {
				GetReporting().FuncReport("Pass", "The text '" + value + "' is Displayed");
				return true;
			} else {
				GetReporting().FuncReport("Fail", "The text '" + value + "' is not appeared");
				return false;

			}
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "The text '" + value + "' is not appeared");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();

			return false;
		}
	}

	private void FuncSwipeAlittleFurther(int startx, int starty, int endx, int endy, int height, String direction) {
		int heightPer = (height * 10 / 100);
		if (direction.equalsIgnoreCase("up"))
			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty, endx, endy - heightPer,
					2000);
		else if (direction.equalsIgnoreCase("down"))
			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty, endx, endy + heightPer,
					2000);
	}

	public void FuncSwipeWhileElementNotFound(MobileElement elementToFind, boolean clickYorN, int swipes,
			String direction, boolean needFurtherSwipe) {// throws Exception
															// {//@Author -
															// Sushil
		// 24-Feb-2017
		Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
		int startx = size.width;
		int endx = size.width;
		int starty = size.height;
		int endy = size.height;
		int heightPer = (endy * 25 / 100);
		boolean flag = true;
		int count = 0;
		String sEleName = "";
		boolean isSwiped = false;
		try {
			while (flag && count <= swipes) {

				try {
					WebDriverWait wait = new WebDriverWait(GetDriver(), 2L);
					wait.until(ExpectedConditions.visibilityOf(elementToFind));
					if (isSwiped && needFurtherSwipe) {
						// To swipe a little further only when swipe is done at
						// least once
						FuncSwipeAlittleFurther(startx / 2, starty / 2, startx / 2, endy / 2, endy, direction);
					}
					flag = false;
					sEleName = FuncGetElementText(elementToFind);

				} catch (Exception e) {
					performSwipeAction(direction, startx, endx, starty, endy);
					count++;
					isSwiped = true;
				}

			}

			if (!flag) {
				GetReporting().FuncReport("Pass",
						"Swiped " + direction + " till element found. Element : <b>" + sEleName + "</b>");
				if (clickYorN)
					FuncClick(elementToFind, sEleName);
			} else
				GetReporting().FuncReport("Fail",
						"Exception: Swiped " + direction + " but element not found. Swipes : " + count);

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail",
						"Exception: Swiped " + direction + " but element not found. Swipes : " + count);
			} catch (IOException e1) {

				e1.printStackTrace();
			}
		}
	}

	public void FuncSwipeWhileElementNotFound(MobileElement elementToFind, boolean clickYorN, int swipes,
			String direction) {
		FuncSwipeWhileElementNotFound(elementToFind, clickYorN, swipes, direction, false);
	}

	public void FuncSwipeWhileElementNotFoundByxpath(String xpathEle, boolean clickYorN, int swipes, String direction,
			boolean needFurtherSwipe) {// throws Exception @Author - Sushil
										// 01-Mar-2017

		Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
		int startx = size.width;
		int endx = size.width;
		int starty = size.height;
		int endy = size.height;
		int heightPer = (endy * 25 / 100);
		boolean flag = true;
		int count = 0;
		String sEleName = "";
		boolean isSwiped = false;
		try {
			while (flag && count <= swipes) {

				try {
					WebDriverWait wait = new WebDriverWait(GetDriver(), 2L);
					wait.until(ExpectedConditions.visibilityOf(GetDriver().findElement(By.xpath(xpathEle))));
					if (isSwiped && needFurtherSwipe) {
						// To swipe a little further only when swipe is done at
						// least once
						FuncSwipeAlittleFurther(startx / 2, starty / 2, startx / 2, endy / 2, endy, direction);
					}
					flag = false;
					sEleName = FuncGetTextByxpath(xpathEle);

				} catch (Exception e) {
					performSwipeAction(direction, startx, endx, starty, endy);
					count++;
					isSwiped = true;
				}

			}

			if (!flag) {
				GetReporting().FuncReport("Pass",
						"Swiped " + direction + " till element found. Element : <b>" + sEleName + "</b>");
				if (clickYorN) {
					Thread.sleep(4000);
					FuncClick((MobileElement) GetDriver().findElement(By.xpath(xpathEle)), sEleName);
				}
			} else
				GetReporting().FuncReport("Fail", "Swiped " + direction + " but element not found. Swipes : " + count);

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail",
						"Exception: Swiped " + direction + " but element not found. Swipes : " + count);
			} catch (IOException e1) {

				e1.printStackTrace();
			}
		}

	}

	private void performSwipeAction(String direction, int startx, int endx, int starty, int endy) {
		if (direction.equalsIgnoreCase("up"))
			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx / 2, starty / 2, startx / 2,
					(int) (endy * 0.25), 2000);

		else if (direction.equalsIgnoreCase("down"))
			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx / 2, endy / 2, startx / 2,
					(int) (endy * 0.75), 2000);
		if (direction.equalsIgnoreCase("left"))
			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe((int) (startx * 0.5), starty / 2,
					(int) (endx * 0.35), endy / 2, 2000);
		else if (direction.equalsIgnoreCase("right"))
			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe((int) (startx * 0.5), starty / 2,
					(int) (endx * 0.65), endy / 2, 2000);
	}

	public void FuncSwipeWhileElementNotFoundByxpath(String xpathEle, boolean clickYorN, int swipes, String direction) {
		FuncSwipeWhileElementNotFoundByxpath(xpathEle, clickYorN, swipes, direction, false);
	}

	/**
	 * Makes sure that an element IS NOT in the list
	 * 
	 * @param xpathEle
	 * @param clickYorN
	 * @param swipes
	 * @param direction
	 */
	public boolean FuncSwipeEnsureElementNotFoundByxpath(String xpathEle, int swipes, String direction) {// throws
																											// Exception
																											// {//@Author
																											// -
																											// Sushil
																											// 01-Mar-2017

		Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
		int startx = size.width;
		int endx = size.width;
		int starty = size.height;
		int endy = size.height;
		int heightPer = (endy * 25 / 100);
		boolean flag = true;
		int count = 0;
		String sEleName = "";
		try {
			while (flag && count <= swipes) {

				try {
					WebDriverWait wait = new WebDriverWait(GetDriver(), 2L);
					wait.until(ExpectedConditions.visibilityOf(GetDriver().findElement(By.xpath(xpathEle))));

					flag = false;
					sEleName = FuncGetTextByxpath(xpathEle);

				} catch (Exception e) {
					performSwipeAction(direction, startx, endx, starty, endy);
					count++;
				}

			}

			if (!flag) {
				GetReporting().FuncReport("Fail", "Swiped " + direction
						+ "  element was found when it shouldn't be there. Element : <b>" + sEleName + "</b>");
				return false;
			} else {
				GetReporting().FuncReport("Pass", "Swiped " + direction + "  element not found. Swipes : " + count);
				return true;
			}

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Pass",
						"Exception: Swiped " + direction + " element not found. Swipes : " + count);
			} catch (IOException e1) {

				e1.printStackTrace();
			}
			return true;
		}

	}

	/**
	 * This method will verify the element is not present on the screen.
	 * 
	 * @param element
	 *            Element to be printed.
	 * 
	 * @param text
	 *            Description of the element.
	 * 
	 * @throws IOException
	 */
	public boolean verifyElementVisible(MobileElement objElement, String text) throws IOException {
		boolean flag = false;
		try {
			if (objElement.isDisplayed()) {
				GetReporting().FuncReport("Pass", "Element " + text + " is present");
				flag = true;
			}
		} catch (NoSuchElementException e) {
			// GetReporting().FuncReport("Pass", "Element " + text + " is not
			// present");
			flag = false;
		}
		return flag;

	}

	/**
	 * This method will verify the expected text is displayed on the screen.
	 * 
	 * @param The
	 *            element which has to be identified
	 * 
	 * @param expectedText
	 *            The expected text in this format like: "CONTACT INFORMATION |
	 *            COORDONNES" if language is English then "CONTACT INFORMATION
	 *            "to be printed in report if language is French then
	 *            "COORDONNES" to be printed in report
	 * 
	 * @return nothing
	 * 
	 * 
	 */
	public void verifyElementTextIsDisplayed(MobileElement mobileElement, String expectedText) throws IOException {
		String[] expectedHeadertext = expectedText.split("\\|");

		try {
			boolean verified = false;
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.elementToBeClickable(mobileElement));
			String capturedText = getValue(mobileElement);
			capturedText = capturedText.trim().replaceAll("\n ", "");
			capturedText = capturedText.trim().replaceAll("\n", "");
			capturedText = capturedText.replaceAll(" ", " "); // replace any
																// french space
																// with english
																// space
			for (int i = 0; i < expectedHeadertext.length; i++) {
				if (capturedText.contentEquals(expectedHeadertext[i].trim())) {
					System.out.println("Expected matched:" + capturedText);
					GetReporting().FuncReport("Pass", "The '" + expectedHeadertext[i].trim() + "' is verified");
					verified = true;
					break;
				} else if (capturedText.matches(expectedHeadertext[i].trim())) {
					System.out.println("Expected matched:" + capturedText);
					GetReporting().FuncReport("Pass", "The '" + capturedText + "' is verified");
					verified = true;
					break;
				}
			}
			if (!verified) {
				System.out.println("Not matched, Captured:" + capturedText + ", but expected is " + expectedText);
				GetReporting().FuncReport("Fail", "expected text not matched:" + expectedText);

			}
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "IllegalArgumentException");
			throw e;

		} catch (NoSuchElementException n) {
			GetReporting().FuncReport("Fail", "Element not displayed: " + expectedText);
			throw n;
		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "The element <b>- " + expectedText + "</b> not present in current page");
			throw e;
		}
	}

	/**
	 * This method will return the text associated with the mobile element.
	 * 
	 * @param The
	 *            element whose text has to be retrieved.
	 * 
	 * @return String The text that is associated with the mobile element or
	 *         value for iOS device
	 * 
	 */
	public String getValue(MobileElement objElement) {
		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			return objElement.getText();
		} else {
			String value = objElement.getAttribute("label");
			if (value == null || value.isEmpty()) {
				value = objElement.getAttribute("value");
			}
			return value;
		}
	}

	/**
	 * This method will swipe within an element
	 * 
	 * @param swipeWithinElement
	 *            The element identified by xpath maxSwipes: maximum times swipe
	 *            direction: swipe direction: down , up, etc
	 * 
	 * @return nothing
	 * 
	 */
	public void SwipeWithinElement(String swipeWithinElement, int maxSwipes, String direction) {

		Point elementWithinLocation = ((AppiumDriver) GetDriver()).findElement(By.xpath(swipeWithinElement))
				.getLocation();
		Dimension elementWithinDimension = ((AppiumDriver) GetDriver()).findElement(By.xpath(swipeWithinElement))
				.getSize();
		int locationX = elementWithinLocation.getX();
		int locationY = elementWithinLocation.getY();
		int dimensionX = elementWithinDimension.width;
		int dimensionY = elementWithinDimension.height;

		int startx, starty, endx, endy;
		if (direction.equalsIgnoreCase("up")) {
			startx = locationX + dimensionX / 2;
			endx = startx;
			starty = locationY + dimensionY - 5;
			endy = locationY + 10;
		} else {
			startx = locationX + dimensionX / 2;
			endx = startx;
			starty = locationY + dimensionY - 10;
			endy = locationY + 10;
		}

		boolean elementFound = false;
		for (int i = 1; i <= maxSwipes; i++) {

			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty, endx, endy, 3000);
		}
	}

	public void FuncSwipeOnce(String sDirection) {
		try {
			Dimension size = (GetDriver()).manage().window().getSize();
			int startx = size.width;
			int starty = size.height;
			int endy = size.height;
			int endx = size.width;
			int heightPer = (endy * 25 / 100);

			if (sDirection.equalsIgnoreCase("up")) {
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx / 2, starty / 2, startx / 2,
						(int) (endy * 0.15), 2000);
				GetReporting().FuncReport("Pass", "Swipe Up once.");
			} else if (sDirection.equalsIgnoreCase("down")) {
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx / 2, endy / 2, startx / 2,
						(int) (endy * 0.85), 2000);
				GetReporting().FuncReport("Pass", "Swipe Down once.");
			} else if (sDirection.equalsIgnoreCase("left")) {
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe((int) (startx * 0.90),
						(int) (starty * 0.50), (int) (endx * 0.15), (int) (endy * 0.50), 200);
				GetReporting().FuncReport("Pass", "Swiped extreme Left.");
			} else if (sDirection.equalsIgnoreCase("right")) {
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe((int) (startx * 0.15),
						(int) (starty * 0.50), (int) (endx * 0.90), (int) (endy * 0.50), 200);
				GetReporting().FuncReport("Pass", "Swiped extreme Right.");
			} else
				GetReporting().FuncReport("Fail", "Invalid direction given.");
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "Exception occurred.Swiped failed.");
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}

	public boolean isObjExists(MobileElement element) // throws Exception
														// @Author - Sushil
														// 01-Mar-2017
	{
		try {
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(element));

			if (element == null)
				GetReporting().FuncReport("Fail", "Object not found.");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void waitForElement(MobileElement ele)// @Author - Sushil 06-Feb-2017
	{
		boolean foundFlag = false;
		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(ele));
			if (ele.isDisplayed()) {
				foundFlag = true;
			}
		} catch (Exception e) {
			foundFlag = false;
		}
		try {
			if (foundFlag)
				GetReporting().FuncReport("Pass", "Element Loaded");
			else
				GetReporting().FuncReport("Fail", "Element not Loaded.Timeout reached.");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public void selectItemFromList(MobileElement defaultItem, String item) // throws
																			// Exception
																			// //@Author
																			// -
																			// Sushil
																			// 06-Feb-2017
	{
		boolean Err = false;
		String xpathExpression = "";
		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
			xpathExpression = "//*[@text='" + item + "']";
		else
			xpathExpression = "//*[@label='" + item + "']";
		try {
			// waitForElement(defaultItem);
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(defaultItem));
			FuncClick(defaultItem, "defaultItem");

			// if(GetDriver().findElement(By.xpath(xpathExpression)).isDisplayed())
			Thread.sleep(3000);
			GetDriver().findElement(By.xpath(xpathExpression)).click();

		} catch (Exception e1) {
			Err = true;
		}
		try {
			if (!Err)
				GetReporting().FuncReport("Pass", String.format("<b> %s </b> list item selected", item));
			else
				GetReporting().FuncReport("Fail", String.format("<b> %s </b> list item not selected", item));
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	public String FuncGetValByRegx(String sText, String sPattern) // @Author -
																	// Sushil
																	// 14-Mar-2017
	{
		String sReturnVal = "";
		try {
			// Pattern p = Pattern.compile("([0-9]+)([.|,])([0-9]+)");
			Pattern p = Pattern.compile(sPattern);

			Matcher m = p.matcher(sText);

			// if an occurrence if a pattern was found in a given string...
			if (m.find()) {
				sReturnVal = m.group(0).trim();
				GetReporting().FuncReport("Pass", "Regular expression return value: " + sReturnVal);
			} else {
				GetReporting().FuncReport("Fail", "Regular expression failed for Text:" + sText);
			}
		}
		// }
		catch (Exception e) {
			e.printStackTrace();
		}
		return sReturnVal;
	}

	/**
	 * This method will report failure
	 * 
	 * @param Text
	 *            text which is not verified.
	 * 
	 * @return void
	 * 
	 */
	public void Report_Fail_Not_Verified(String text) {
		try {
			GetReporting().FuncReport("Fail", "'" + text + "' is not verified");
		} catch (IOException e) {
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will report failure with error message
	 * 
	 * @param Text
	 *            text : error message
	 * 
	 * @return void
	 * 
	 */
	public void Report_Fail(String text) {
		try {
			GetReporting().FuncReport("Fail", text);
		} catch (IOException e) {
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	/**
	 * This method will report pass
	 * 
	 * @param Text
	 *            text which is verified.
	 * 
	 * @return void
	 * 
	 */

	public void Report_Pass_Verified(String text) {
		try {
			GetReporting().FuncReport("Pass", "'" + text + "' is verified");
		} catch (IOException e) {
			System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public boolean isObjExists(MobileElement element, int iTimeOut) // throws
																	// Exception
																	// @Author -
																	// Sushil
																	// 01-Mar-2017
	{
		try {
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(GetDriver(), iTimeOut);
			wait.until(ExpectedConditions.visibilityOf(element));

			if (element == null)
				// throw new Exception("Object not found.");
				GetReporting().FuncReport("Fail", "Object not found.");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public void verifyItemInList(String sItem)// @Author-Sushil 27-Feb-2017
	{
		String xpathExpression = "";
		try {
			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				xpathExpression = "//*[@text='" + sItem + "']";
			else
				xpathExpression = "//*[@label='" + sItem + "']";

			verifyElement((MobileElement) (GetDriver()).findElement(By.xpath(xpathExpression)), sItem);
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", sItem + " not found.");
			} catch (Exception e1) {
				e.printStackTrace();
			}
		}
	}

	public void FuncVerifyBlankValue(MobileElement objMobileElement, String sDesc) // @Author
																					// -
																					// Sushil
																					// 06-Mar-2017
	{
		String sText = "";
		try {
			sText = objMobileElement.getText();
			if (sText != null) {
				if (sText.equalsIgnoreCase(""))
					GetReporting().FuncReport("Pass", "<b>" + sDesc + "</b> is blank.");
				else
					GetReporting().FuncReport("Fail", sDesc + " should be blank.");
			} else {
				sText = FuncGetElementText(objMobileElement);
				if (sText.equalsIgnoreCase(""))
					GetReporting().FuncReport("Pass", "<b>" + sDesc + "</b> is blank.");
				else
					GetReporting().FuncReport("Fail", sDesc + " should be blank.");
			}
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "Exception occurred." + sDesc + " Blank value not verified.");
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	public void FuncVerifyNonBlankValue(MobileElement objMobileElement, String sDesc) // @Author
																						// -
																						// Sushil
																						// 06-Mar-2017
	{
		String sText = "";
		try {
			sText = objMobileElement.getText();
			if (sText != null) {
				if (sText.length() > 0)
					GetReporting().FuncReport("Pass", sDesc + " is not blank. " + sText);
				else
					GetReporting().FuncReport("Fail", sDesc + " should not blank.");
			} else {
				sText = FuncGetElementText(objMobileElement);
				if (sText.length() > 0)
					GetReporting().FuncReport("Pass", sDesc + " is not blank. " + sText);
				else
					GetReporting().FuncReport("Fail", sDesc + " should not blank.");
			}
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "Exception occurred." + sDesc + " Non Blank value not verified.");
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	public void FuncIsElementEnabled(MobileElement objMobileElement, String sDesc)// @Author
																					// -
																					// Sushil
																					// 06-Mar-2017
	{
		WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
		wait.until(ExpectedConditions.visibilityOf(objMobileElement));

		try {
			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (objMobileElement.isEnabled())
					GetReporting().FuncReport("Pass", "<b>" + sDesc + "</b> is enabled.");
				else
					GetReporting().FuncReport("Fail", "<b>" + sDesc + "</b> is not enabled.");
			} else {
				if (objMobileElement.isDisplayed())
					GetReporting().FuncReport("Pass", "<b>" + sDesc + "</b> is enabled.");
				else
					GetReporting().FuncReport("Fail", "<b>" + sDesc + "</b> is not enabled.");

			}
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "<b>" + sDesc + "</b> is not enabled.");
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * This method will return the text of the element which has been specified
	 * and print it in the report as well.
	 * 
	 * @param objElement
	 *            The element for which the text is to be printed in the report.
	 * @return The String value of the Text in the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 */
	public String FuncGetElementText(MobileElement objElement) { // @Author -
																	// Sushil
																	// 13-Apr-2017
		String textToReturn = null;
		try {

			WebDriverWait wait = new WebDriverWait(GetDriver(), 10L);
			wait.until(ExpectedConditions.visibilityOf(objElement));

			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					textToReturn = objElement.getText();
				} catch (Exception e) {
					GetReporting().FuncReport("Fail", "Exception in FuncGetElementText(). getText() failed.");
				}
			} else {
				try {
					textToReturn = objElement.getAttribute("label");
				} catch (Exception e) {
					try {
						textToReturn = objElement.getAttribute("value");
					} catch (Exception e1) {
						try {
							textToReturn = objElement.getAttribute("name");
						} catch (Exception e2) {
							GetReporting().FuncReport("Fail", "Exception in FuncGetElementText(). getText() failed.");
						}
					}
				}
				if (textToReturn == null) {
					textToReturn = objElement.getAttribute("value");
				}
			}

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "Exception in FuncGetElementText(). getText() failed.");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return textToReturn;

	}

	public String FuncGetTextByxpath(String xpathEle)// @Author - Sushil
														// 13-Apr-2017
	{
		String sEleText = "";
		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			try {
				sEleText = GetDriver().findElement(By.xpath(xpathEle)).getText();
			} catch (Exception e) {
				try {
					GetReporting().FuncReport("Fail", "Exception in FuncGetTextByxpath(). getText() failed.");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} else {
			try {
				sEleText = GetDriver().findElement(By.xpath(xpathEle)).getAttribute("label");
			} catch (Exception e) {
				try {
					sEleText = GetDriver().findElement(By.xpath(xpathEle)).getAttribute("value");
				} catch (Exception e1) {
					try {
						sEleText = GetDriver().findElement(By.xpath(xpathEle)).getAttribute("name");
					} catch (Exception e2) {
						try {
							GetReporting().FuncReport("Fail", "Exception in FuncGetTextByxpath(). getText() failed.");
						} catch (IOException e3) {
							e3.printStackTrace();
						}
					}
				}
			}
			if (sEleText == null) {
				sEleText = GetDriver().findElement(By.xpath(xpathEle)).getAttribute("value");
			}
		}
		return sEleText;
	}

	/**
	 * This method will return the text of the element which has been specified
	 * and print it in the report as well.
	 * 
	 * @param objElement
	 *            The element for which the text is to be printed in the report.
	 * @return The String value of the Text in the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 */
	public String FuncGetElementText(WebElement objElement) { // @Author -
																// Sushil
																// 13-Apr-2017
		String textToReturn = null;
		try {

			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(objElement));

			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				try {
					textToReturn = objElement.getText();
				} catch (Exception e) {
					GetReporting().FuncReport("Fail", "Exception in FuncGetElementText(). getText() failed.");
				}
			} else {
				try {
					textToReturn = objElement.getAttribute("label");
				} catch (Exception e) {
					try {
						textToReturn = objElement.getAttribute("value");
					} catch (Exception e1) {
						try {
							textToReturn = objElement.getAttribute("name");
						} catch (Exception e2) {
							GetReporting().FuncReport("Fail", "Exception in FuncGetElementText(). getText() failed.");
						}
					}
				}
				if (textToReturn == null) {
					textToReturn = objElement.getAttribute("value");
				}
			}
		} catch (IOException e) {
			try {
				GetReporting().FuncReport("Fail", "Exception in FuncGetElementText(). getText() failed.");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			// throw e;
		} catch (NoSuchElementException e) {
			try {
				GetReporting().FuncReport("Fail", "Exception in FuncGetElementText(). getText() failed.");
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		} // throw e;
		return textToReturn;
	}

	/**
	 * This method will get the Mobile element from XPATH
	 * 
	 *
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             In case the element is not found over the screen.
	 */
	public MobileElement mobileElementUsingXPath(String objElement) throws IOException {

		MobileElement objMobileElement = null;

		try {
			objMobileElement = (MobileElement) ((AppiumDriver) GetDriver()).findElement(By.xpath(objElement));
		} catch (Exception e) {
			System.err.println("Element not found");
		}
		return objMobileElement;

	}

	/**
	 * This method will get the Mobile element from IOSClassChain
	 * 
	 *
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             In case the element is not found over the screen.
	 */
	public MobileElement mobileElementUsingIOSClassChain(String objElement) {

		MobileElement objMobileElement = null;

		try {
			objMobileElement = (MobileElement) ((AppiumDriver) GetDriver())
					.findElement(ByIosClassChain.iOSClassChain(objElement));

		} catch (Exception e) {
			System.err.println("Element not found");
		}

		return objMobileElement;
	}

	public String verifyElementUsingBy(By value) {

		String elementText = "";
		// boolean verifyFlag = true;
		try {

			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.elementToBeClickable(value));

			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				elementText = ((AndroidDriver) GetDriver()).findElement(value).getAttribute("text");
			} else {
				elementText = ((IOSDriver) GetDriver()).findElement(value).getAttribute("label");

			}

		} catch (NoSuchElementException e) {

		}
		return elementText;

	}

	public boolean FuncISDisplayed(MobileElement elementToFind, String text) {
		try {
			if (elementToFind.isDisplayed()) {
				GetReporting().FuncReport("Pass", "The text '" + text + "' is Displayed");
				return true;
			} else

				return false;

		} catch (Exception e) {

			return false;
		}

	}

	/**
	 * This method will click on the element according to coordinates.
	 *
	 * 
	 * @param widthCord
	 *            Width of the element
	 * @param HeightCord
	 *            Height of the element
	 * @param TapCount
	 *            Number of times to tap
	 * 
	 * @throws IOException
	 */
	public void clickCoOrdinatesPercentage(float widthCord, float HeightCord, int TapCount) {

		Dimension size;
		size = ((AppiumDriver) GetDriver()).manage().window().getSize();
		int startx = (int) (size.width * widthCord);
		int starty = (int) (size.height * HeightCord);

		TouchAction action = new TouchAction(((MobileDriver) GetDriver()));
		for (int i = 0; i < TapCount; i++) {
			action.tap(startx, starty).perform();
		}
	}

	/**
	 * This method will get current switch element status //fengfr6
	 *
	 * 
	 * @param MobileElement
	 *            switch mobile element for android device, attribute "checked"
	 *            is the switch status, true or false for iOS device, attribute
	 *            "value" is the switch status, true or false
	 * 
	 * @throws IOException
	 */
	public String getSwitchStatus(MobileElement switchElement) {
		String status = "";
		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			status = switchElement.getAttribute("checked");
		} else {
			status = switchElement.getAttribute("value");
		}
		// for iPad landscape, the status is 1 or 0, need to change it to true
		// or false
		if (status.equals("1")) {
			status = "true";
		} else if (status.equals("0")) {
			status = "false";
		}
		return status;
	}

	public void FuncSwipeUpTillScreenBottom(MobileElement mEle) // @Author -
																// Sushil
																// 10-May-2017
	{
		try {
			FunctionSwipe("up", 200, 100);
			if (!mEle.isDisplayed()) {
				FunctionSwipe("up", 200, 100);
			}
		} catch (Exception e) {
			try {
				FunctionSwipe("up", 200, 100);
			} catch (IOException e1) {
				e1.printStackTrace();
				try {
					GetReporting().FuncReport("Fail", "Exception : FuncSwipeUpTillScreenBottom Failed.");
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}

	public void FuncSwipeDownTillScreenTop(MobileElement mEle) // @Author -
																// Sushil
																// 10-May-2017
	{
		try {
			FunctionSwipe("down", 200, 200);
			if (!mEle.isDisplayed()) {
				FunctionSwipe("down", 200, 200);
			}
		} catch (Exception e) {
			try {
				FunctionSwipe("down", 200, 200);
			} catch (IOException e1) {

				e1.printStackTrace();
				try {
					GetReporting().FuncReport("Fail", "Exception : FuncSwipeDownTillScreenTop Failed.");
				} catch (IOException e2) {

					e2.printStackTrace();
				}
			}
		}
	}

	public void verifyItemInListContains(String sItem)// @Author-Sushil
														// 11-May-2017
	{
		String xpathExpression = "";
		try {
			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android"))
				xpathExpression = "//*[contains(@text,'" + sItem + "')]";
			else
				xpathExpression = "//*[contains(@label,'" + sItem + "')]";

			verifyElementTextContains((MobileElement) (GetDriver()).findElement(By.xpath(xpathExpression)), sItem);
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", sItem + " not found.");
			} catch (Exception e1) {
				e.printStackTrace();
			}
		}
	}

	// Add a common function here, we may need to click back button from any
	// page, but the function is the same
	public void ClickBackButton() {

		String back_xpath = "";

		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			try {
				FuncClickBackButton();
				return;
			} catch (Exception e) {
				back_xpath = "//android.widget.ImageView[@resource-id='android:id/up']";
				try {
					MobileElement back_arrow = (MobileElement) GetDriver().findElement(By.xpath(back_xpath));
					FuncClick(back_arrow, "<");

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

		} else {
			back_xpath = "//XCUIElementTypeButton[@name='NAVIGATION_ITEM_BACK' or @label='p2p header caret']";
			try {
				MobileElement back_arrow = (MobileElement) GetDriver().findElement(By.xpath(back_xpath));
				FuncClick(back_arrow, "Back Arrow : <");

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

	public boolean verifyElementIsPresentByXpath(String elementXpath) {

		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(GetDriver().findElement(By.xpath(elementXpath))));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isBackButtonPresent() {
		String back_xpath = "";
		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			back_xpath = "//android.widget.ImageView[@resource-id='android:id/up']";
		} else {
			back_xpath = "//*[@name='NAVIGATION_ITEM_BACK' or @label='p2p header caret']";
		}

		try {
			MobileElement back_button = (MobileElement) GetDriver().findElement(By.xpath(back_xpath));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean verifyElementIsPresent(WebElement elementToFind) {

		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(elementToFind));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * This method will swipe either up, Down, left or Right according to the
	 * direction specified. This method takes the size of the screen and uses
	 * the swipe function present in the Appium driver to swipe on the screen
	 * with a particular timeout. There is one more method to implement swipe
	 * using touch actions, which is not put up here.
	 * 
	 * @param Direction
	 *            The direction we need to swipe in.
	 * @param swipeTime
	 *            The swipe time, ie the time for which the driver is supposed
	 *            to swipe.
	 * @param Offset
	 *            The offset for the driver, eg. If you want to swipe 'up', then
	 *            the offset is the number of pixels you want to leave from the
	 *            bottom of the screen t start the swipe.
	 * @throws IOException
	 *             If there is problem while reporting.
	 */
	public void SwipeQuickLinks(int swipeTime, int Offset) throws IOException {
		try {

			Dimension size;
			size = ((AppiumDriver) GetDriver()).manage().window().getSize();

			int starty = (int) (size.height * 0.20);
			int endy = (int) (size.height * 0.20);
			int startx = (int) (size.width * 0.90);
			int endx = (int) (size.width * 0.10);
			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx - Offset, starty, endx, endy,
					swipeTime);

			GetReporting().FuncReport("Pass", "Swipe <b> left </b> Successful");

		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "<b>- " + "</b> not present in current page");
			throw e;
		}

	}

	public void SwipeQuickLinksInDirection(String direction, int swipeTime, int Offset) throws IOException {
		try {

			Dimension size;
			size = ((AppiumDriver) GetDriver()).manage().window().getSize();

			if (direction.equalsIgnoreCase("left")) {

				int starty = (int) (size.height * 0.20);
				int endy = (int) (size.height * 0.20);
				int startx = (int) (size.width * 0.90);
				int endx = (int) (size.width * 0.10);
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx - Offset, starty, endx, endy,
						swipeTime);

				GetReporting().FuncReport("Pass", "Swipe <b> left </b> Successful");

			}

			if (direction.equalsIgnoreCase("right")) {

				int starty = (int) (size.height * 0.20);
				int endy = (int) (size.height * 0.20);
				int startx = (int) (size.width * 0.80);
				int endx = (int) (size.width * 0.10);
				((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(endx, starty, startx - Offset, endy,
						swipeTime);

				GetReporting().FuncReport("Pass", "Swipe <b> right </b> Successful");

			}

		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "<b>- " + "</b> not present in current page");
			throw e;
		}

	}

	/**
	 * This method will verify the text contained in another String.
	 * 
	 *
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * @throws Exception
	 *             In case an exception occurs while clicking over the element.
	 *             In case the element is not found over the screen.
	 */
	public void verifyElementTextContainsReverse(MobileElement objElement, String text) {// throws
																							// IOException
																							// {
																							// //@Author
																							// -
																							// Sushil
																							// 31-Mar-2017
																							// Modified
		try {
			String sEleText = FuncGetElementText(objElement);
			if (sEleText != null) {
				if (text.contains(sEleText))
					GetReporting().FuncReport("Pass",
							"Element contains text<b> " + text + "</b> .Element text:" + sEleText);
				else
					GetReporting().FuncReport("Fail", "Element does not contain expected text. <b>" + text + "</b>");
			} else {
				sEleText = "";
				if (text.contains(sEleText))
					GetReporting().FuncReport("Pass",
							"Element contains text<b> " + text + "</b> .Element text:" + sEleText);
				else
					GetReporting().FuncReport("Fail", "Element does not contain expected text. <b>" + text + "</b>");
			}
		} catch (IOException e) {
			try {
				GetReporting().FuncReport("Fail", "Element does not contain expected text:" + text);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			// throw e;
		}
	}

	public String getAppString(final String key) {
		String s = (String) _CommonPage.appStringMap.get(key);
		// System.out.println("String returned from key is: " + s);
		return s;
	}

	public void verifyDateFormat(final String dateStr, final int type) {
		if (_CommonPage.currentLocale.startsWith("zh")) {
			switch (type) {
			case (TYPE_YYYY_MM_DD):
				if (dateStr.matches(StringArray.PATTERN_ZH_YYYY_MM_DD)) {
					try {
						GetReporting().FuncReport("Pass", "Correct date format found");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				} else {
					try {
						GetReporting().FuncReport("Fail", "Incorrect date format: " + dateStr);
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
				break;
			case (TYPE_YYYY_MM_DD_WEEKDATE):
				if (dateStr.matches(StringArray.PATTERN_ZH_YYYY_MM_DD_WEEKDATE)) {
					try {
						GetReporting().FuncReport("Pass", "Correct date format found");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				} else {
					try {
						GetReporting().FuncReport("Fail", "Incorrect date format: " + dateStr);
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
				break;
			case (TYPE_MM_YYYY):
				if (dateStr.matches(StringArray.PATTERN_ZH_MM_YYYY)) {
					try {
						GetReporting().FuncReport("Pass", "Correct date format found");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				} else {
					try {
						GetReporting().FuncReport("Fail", "Incorrect date format: " + dateStr);
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
				break;
			case (TYPE_YYYY_MM_DD_TODAY):
				if (dateStr.matches(StringArray.PATTERN_ZH_YYYY_MM_DD_TODAY)) {
					try {
						GetReporting().FuncReport("Pass", "Correct date format found");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				} else {
					try {
						GetReporting().FuncReport("Fail", "Incorrect date format: " + dateStr);
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
				break;
			case (TYPE_YYYY_MM_DD_HOUR):
				if (dateStr.matches(StringArray.PATTERN_ZH_YY_MM_DD_HOUR)) {
					try {
						GetReporting().FuncReport("Pass", "Correct date format found");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				} else {
					try {
						GetReporting().FuncReport("Fail", "Incorrect date format: " + dateStr);
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
				break;
			case (TYPE_YYYY_MM_DD_RANGE):
				if (dateStr.matches(StringArray.PATTERN_ZH_YYYY_MM_DD_RANGE)) {
					try {
						GetReporting().FuncReport("Pass", "Correct date format found");
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				} else {
					try {
						GetReporting().FuncReport("Fail", "Incorrect date format: " + dateStr);
					} catch (IOException e) {
						System.out
								.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
					}
				}
				break;
			}

		} else if (_CommonPage.currentLocale.equalsIgnoreCase("EN")
				|| _CommonPage.currentLocale.equalsIgnoreCase("fr")) {
			// Don't need to test this for now
		} else {
			try {
				GetReporting().FuncReport("Fail",
						"Unknown locale found to test against date string: " + _CommonPage.currentLocale);
			} catch (IOException e) {
				System.out.println("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
		}
	}

	/**
	 * This will allow the user to switch between Appium Driver contextes such
	 * as NATIVE_APP or WEBVIEW
	 * 
	 * @param targetContext
	 */
	public void switchAppiumContext(final String targetContext) {
		((AppiumDriver) GetDriver()).context(targetContext);
	}

	public void containsHanScript(String s) throws IOException {
		if (_CommonPage.currentLocale.startsWith("zh")) {
			for (int i = 0; i < s.length();) {
				int codepoint = s.codePointAt(i);
				i += Character.charCount(codepoint);
				if (Character.UnicodeScript.of(codepoint) == Character.UnicodeScript.HAN) {
					GetReporting().FuncReport("Pass", "Element contains han characters");
					return;
				}
			}
			GetReporting().FuncReport("Fail", "Element does not contain han characters");
		}
	}

	/**
	 * @author Ashraf This method will convert the string xpath to
	 *         MobileElement. Then Swipe and click on it once found.
	 * 
	 * @param elementXpath
	 *            = String xpath of element
	 * @param elementName
	 *            = Name of element to be printed in report
	 * @param swipeCount
	 *            = number of swipe to search for element.
	 */
	public boolean swipeAndSelect(String elementXpath, String elementName, int swipeCount) {

		boolean flag = true;
		int count = 0;

		while (flag && count < swipeCount) {
			try {
				MobileElement element = (MobileElement) ((AppiumDriver) GetDriver())
						.findElement(By.xpath(elementXpath));
				if (element.isDisplayed()) {
					FuncClick(element, "Account Number");
					flag = false;
				} else {
					FunctionSwipe("up", 1000, 200);
					count++;
				}
			} catch (Exception e) {
				try {
					FunctionSwipe("up", 1000, 200);
				} catch (IOException e1) {
					System.err.println("Failed to swipe");
				}
				count++;
			}

			if (count == swipeCount) {
				stringToReport("Fail", elementName + " Not found after swiping " + swipeCount + " times.");
			}

		}

		return flag;
	}

	/**
	 * @author Ashraf This method will print the given string to report
	 * 
	 * @param element
	 *            Element to be printed.
	 * 
	 * @param text
	 *            Description of the element.
	 * @throws IOException
	 */
	public void stringToReport(String status, String string) {
		try {
			GetReporting().FuncReport(status, string);

		} catch (NullPointerException | IOException e) {
			try {
				GetReporting().FuncReport("Fail", string + " Returned null value");
			} catch (IOException e1) {
				System.out.println("Failed to Write in report for element: " + string);
			}
		}
	}

	/**
	 * This method will use the Actions class to click on a web element
	 * 
	 * @param objElement
	 * @param text
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws NoSuchElementException
	 */
	public void FuncClickWithActions(WebElement objElement, String text)
			throws InterruptedException, IOException, NoSuchElementException {
		try {
			Actions actions = new Actions(GetAppiumDriver());
			actions.moveToElement(objElement).click().perform();
			GetReporting().FuncReport("Pass", "The element <b>  " + text + " </b> Clicked");
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "The element <b>- " + text + "</b> not present in current page");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			throw e;
		}
	}

	/**
	 * This method will hide keyboard for both IOS and Androd if keyboard opened
	 * unwanted Sometimes when Swipe is invoked and focused element is a
	 * textEdit like phone, email then the keyboard will be opened
	 * 
	 * @throws NoSuchElementException
	 */
	public void handleUnwantedKeyBoard() {
		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			try {
				(GetAppiumDriver()).hideKeyboard();
			} catch (Exception e) {
				// normal
			}
		} else {
			try {
				String donePath = "//*[@name='Go' or @label='Done' or @label='OK' or @label='"
						+ getAppString("secureLoginEditButtonDone") + "']";
				MobileElement Done = (MobileElement) GetAppiumDriver().findElement(By.xpath(donePath));
				if (isOrientationLandscape() && isGoOnKeyBoard()) {
					HideKeyBoard_IOS();
				} else {
					Done.click();
				}
			} catch (Exception e) {
				// normal
			}
		}
	}

	/**
	 * This method will Click Done in IOS device Keyboard
	 * 
	 * @throws NoSuchElementException
	 */
	public void FuncClickDone() throws InterruptedException, IOException, NoSuchElementException {
		// Generally, it's "Done" on keyboard screen;
		// in French it's OK; For Chinese, use secureLoginEditButtonDone mapping
		// but sometimes it's Go (The good thing is the Name is 'Go' no matter
		// what language)

		try {

			if (isOrientationLandscape() && isGoOnKeyBoard()) {
				HideKeyBoard_IOS();
				GetReporting().FuncReport("Pass", "The Key board was hidden");
			} else {

				String donePath = "//*[@name='Go' or @label='Done' or @name='Done' or @label='OK' or @name='Toolbar Done Button' or @label='Toolbar Done Button' or @label='"
						+ getAppString("secureLoginEditButtonDone") + "']";
				MobileElement Done = (MobileElement) GetAppiumDriver().findElement(By.xpath(donePath));
				Done.click();
				GetReporting().FuncReport("Pass", "The element <b>  Done </b> Clicked");
			}

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "The element <b> Done </b> not present in current page");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			throw e;
		}
	}

	/**
	 * This method will look for an element on the screen to be tappable within
	 * the given timeout and then click over the element.
	 * 
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * 
	 * @param text
	 *            The text of element objElement clicked.
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void TapCoOrdinates(int x, int y, String element)
			throws InterruptedException, IOException, NoSuchElementException {
		try {

			TouchAction action = new TouchAction(((MobileDriver) GetDriver()));
			action.tap(x, y).perform();

			GetReporting().FuncReport("Pass", "The element <b>  " + element + " </b> Clicked");
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "IllegalArgumentException");

		} catch (NoSuchElementException n) {
			GetReporting().FuncReport("Fail", "Element not displayed" + element);

		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "The element <b>- " + element + "</b> not present in current page");

		}
	}

	/**
	 * This method will look for an element on the screen to be tappable within
	 * the given timeout and then click over the element based on the
	 * coordinates.
	 * 
	 * @param objElement
	 *            The MobileElement on which the click action has to be
	 *            performed.
	 * 
	 * @param text
	 *            The text of element objElement clicked.
	 * @throws InterruptedException
	 *             In case an exception occurs while clicking over the element.
	 * @throws IOException
	 *             If there is problem while reporting.
	 * @throws NoSuchElementException
	 *             In case the element is not found over the screen.
	 */
	public void FuncTapCord(MobileElement objElement, String text)
			throws InterruptedException, IOException, NoSuchElementException {
		try {
			WebDriverWait wait = new WebDriverWait((AppiumDriver) GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.elementToBeClickable(objElement));

			int leftX = objElement.getLocation().getX();
			int rightX = leftX + objElement.getSize().getWidth();
			int middleX = (rightX + leftX) / 2;
			int upperY = objElement.getLocation().getY();
			int lowerY = upperY + objElement.getSize().getHeight();
			int middleY = (upperY + lowerY) / 2;
			int transMiddleY = middleY;
			int transMiddleX = middleX;

			TapCoOrdinates(transMiddleX, transMiddleY, text);

			GetReporting().FuncReport("Pass", "The element <b>  " + text + " </b> Clicked");
		} catch (IllegalArgumentException e) {
			GetReporting().FuncReport("Fail", "IllegalArgumentException");

		} catch (NoSuchElementException n) {
			GetReporting().FuncReport("Fail", "Element not displayed" + text);

		} catch (Exception e) {
			GetReporting().FuncReport("Fail", "The element <b>- " + text + "</b> not present in current page");

		}
	}

	public boolean verifyTextIsContained(WebElement mobileElement, String expectedText) {
		String retrivedText = "";
		try {
			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				retrivedText = mobileElement.getText();
			} else {
				retrivedText = mobileElement.getAttribute("label");
			}
			if (retrivedText.contains(expectedText)) {
				return true;
			} else {

				return false;

			}
		} catch (Exception e) {

			return false;
		}
	}

	public void FuncIsElementNotEnabled(MobileElement objMobileElement, String sDesc)// @Author
																						// -
																						// Sushil
																						// 06-Mar-2017
	{
		WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
		wait.until(ExpectedConditions.visibilityOf(objMobileElement));

		try {
			if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
				if (!objMobileElement.isEnabled())
					GetReporting().FuncReport("Pass", "<b>" + sDesc + "</b> is not enabled.");
				else
					GetReporting().FuncReport("Fail", "<b>" + sDesc + "</b> is enabled.");
			} else {
				if (!objMobileElement.isDisplayed())
					GetReporting().FuncReport("Pass", "<b>" + sDesc + "</b> is not enabled.");
				else
					GetReporting().FuncReport("Fail", "<b>" + sDesc + "</b> is enabled.");
			}
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "<b>" + sDesc + "</b> is not enabled.");
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	public void getPageSource() {

		try {
			Thread.sleep(3000);
			System.out.println(GetDriver().getPageSource());
		} catch (InterruptedException e) {
			System.err.println("Failed to fetch the page source");
		}

	}

	public void dumpAppKeys() {
		Iterator<String> itr = _CommonPage.appStringMap.keySet().iterator();
		Iterator<String> itr1 = _CommonPage.appStringMap.values().iterator();
		while (itr.hasNext() && itr1.hasNext()) {
			System.out.println(itr.next() + " = " + itr1.next());
		}
	}

	public void FuncVerifyTextEquals(MobileElement mElement, String sExpected) // Author
																				// -
																				// Sushil
																				// 28-Aug-2017
	{
		String sActual = "";
		try {
			sActual = FuncGetElementText(mElement);
			if (sActual.equals(sExpected))
				GetReporting().FuncReport("Pass", "Expected : " + sExpected + " Actual : " + sActual);
			else
				GetReporting().FuncReport("Fail", "Expected : " + sExpected + " Actual : " + sActual);

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "<b> Exception in FuncVerifyTextEquals()" + "</b>");
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	public double convertStringAmountTodouble(String amount) {
		String amount_no_char = amount.replaceAll("\\$", "");
		amount_no_char = amount_no_char.replaceAll("USD", "");
		amount_no_char = amount_no_char.replaceAll(",", "");
		return Double.parseDouble(amount_no_char.trim());
	}

	public void HideKeyBoard_IOS() {
		IOSDriver<WebElement> ios_driver = (IOSDriver) (GetAppiumDriver());
		ios_driver.getKeyboard().sendKeys(Keys.RETURN);
		System.out.println("Hide IOS key Board");
	}

	public boolean isOrientationLandscape() {
		try {
			ScreenOrientation currentOrientation = GetAppiumDriver().getOrientation();
			System.out.println("Orientation:" + currentOrientation);
			if (currentOrientation == ScreenOrientation.LANDSCAPE) {
				return true;
			} else {
				return false;
			}
		} catch (WebDriverException e) {
			// Rotating screen to right may get exception here
			System.out.println("Orientation:landscaperight");
			return true;
		} catch (Exception e) {
			System.out.println("Unknown exception");
			return true;
		}
	}

	public boolean isGoOnKeyBoard() {
		try {
			String goePath = "//*[@name='Go']";
			MobileElement GoOnKeyBoard = (MobileElement) GetAppiumDriver().findElement(By.xpath(goePath));
			System.out.println("Go is found on keyboard");
			return true;
		} catch (Exception e) {
			System.out.println("Done is found on keyboard");
			return false;
		}
	}

	/**
	 * This method will scroll element into view
	 * 
	 * @param objElement
	 * @param text
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws NoSuchElementException
	 */
	public void FuncScrollIntoView(WebElement objElement, String text) {
		try {
			WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
			wait.until(ExpectedConditions.visibilityOf(objElement));

			((JavascriptExecutor) GetDriver()).executeScript("arguments[0].scrollIntoView(true);", objElement);
			GetReporting().FuncReport("Pass", "The element <b>  " + text + " </b> is scrolled into view");
		} catch (Exception e) {
			System.out.println(
					"Exception from FuncScrollIntoView Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public MobileElement getMobileElement(By element) {

		try {

			return (MobileElement) ((AppiumDriver) GetDriver()).findElement(element);

		} catch (Exception e) {

			return null;

		}

	}

	public List<MobileElement> getElementsList(String elementsXpath) {

		List<MobileElement> list = null;

		try {
			list = ((AppiumDriver) GetDriver()).findElements(By.xpath(elementsXpath));

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "Cannot find list of " + elementsXpath + ": " + e.getMessage());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

		return list;
	}

	public MobileElement swipeAndSearchByxpath(String xpath, boolean clickYorN, int numSwipes, String direction) {

		boolean isFound = false;
		MobileElement elementFound = null;

		try {
			Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
			int startx = size.width / 2;
			int starty = (int) (size.height * 0.85);
			int endy = (int) (size.height * 0.15);

			int count = 0;
			String sEleName = "";
			boolean isSwiped = false;

			while (!isFound && count <= numSwipes) {

				isFound = this.verifyElementIsPresentByXpath(xpath);
				if (!isFound) {
					TouchAction touchAction = new TouchAction((AppiumDriver) GetDriver());
					if (direction.equalsIgnoreCase("up")) {
						// touchAction.press(startx, starty).moveTo(startx,
						// endy).release().perform();
						((AppiumDriver) GetDriver()).swipe(startx, starty, startx, endy, 2000);
					} else if (direction.equalsIgnoreCase("down")) {
						// touchAction.press(startx, endy).moveTo(startx,
						// starty).release().perform();
						((AppiumDriver) GetDriver()).swipe(startx, endy, startx, starty, 2000);
					}
					count++;
				}
			}
			if (isFound) {
				sEleName = FuncGetTextByxpath(xpath);
				elementFound = verifyElementUsingXPath(xpath, "Swipe and found element");

				if (clickYorN) {
					sleep(2000);
					FuncClick(elementFound, sEleName);
				}
				GetReporting().FuncReport("Pass", "Swiped " + direction + " till element found. Swipes: " + count
						+ " Element : <b>" + sEleName + "</b>");

			} else if (!isFound) {
				System.out.println("Swiped " + direction + " but element not found. Xpath : " + xpath);
			}

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "Cannot find element after swipes " + xpath + ": " + e.getMessage());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
		return elementFound;

	}

	/**
	 * This is specifically for P2P related pages only
	 */
	public void waitP2PProgressBarVanish() {

		WebDriverWait wait = new WebDriverWait(GetDriver(), MaxTimeoutInSec);
		int counter = 0;
		while (counter < 6 && verifyElementIsPresent(Login.get().progressBar)) {

			try {
				wait.until(ExpectedConditions.invisibilityOf(Login.get().progressBar));
				counter++;

			} catch (Exception e) {
				counter++;

			}
		}
	}

	public void waitProgressBarVanish() {
		MobileElement progressBar = null;
		String progressbarXpath = "";
		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			progressbarXpath = "//android.widget.TextView[@resource-id='android:id/message' or @resource-id='com.td:id/loading_indicator_textview']";
		} else {
			progressbarXpath = "//XCUIElementTypeActivityIndicator[@value='1']";
		}

		try {
			progressBar = (MobileElement) ((AppiumDriver) GetDriver()).findElement(By.xpath(progressbarXpath));
		} catch (Exception e) {
			System.out.println("Progress bar not found");
			return;
		}
		System.out.println("Waiting for progress vanishing");
		waitForElementToVanish(progressBar);
	}

	public void waitTDIProgressBarVanish() {
		MobileElement progressBar = null;
		String progressbarXpath = "";
		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			progressbarXpath = "//android.widget.TextView[@resource-id='android:id/message' or @resource-id='com.td:id/loading_indicator_textview']";
		} else {
			progressbarXpath = "//XCUIElementTypeActivityIndicator[@value='One moment please']";
		}

		try {
			progressBar = (MobileElement) ((AppiumDriver) GetDriver()).findElement(By.xpath(progressbarXpath));
		} catch (Exception e) {
			System.out.println("Progress bar not found");
			return;
		}
		System.out.println("Waiting for progress vanishing");
		waitForElementToVanish(progressBar);
	}

	public void clickMenuButton() {

		// Not clear why it failed to click menu on iPad, so let's try max 5
		// times
		MobileElement menu = null;
		String menuXpath = "";
		String menuSlideXpath = "";

		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			menuXpath = "//android.widget.ImageView[@resource-id='android:id/up' or @resource-id='com.td:id/hamburger']";
			menuSlideXpath = "//android.widget.ListView[@resource-id='com.td:id/list_slidermenu' or @index='1']";
		} else {
			menuXpath = "//XCUIElementTypeButton[@name ='NAVIGATION_ITEM_MENU' or @name='QuickLinkLeftNavButton']";
			menuSlideXpath = "//*[@name='NAV_DRAWER_ITEMS_HOME' or @name='NAV_DRAWER_ITEMS_0']";
		}
		boolean isMenuOpened = false;
		try {
			menu = (MobileElement) ((AppiumDriver) GetDriver()).findElement(By.xpath(menuXpath));
			int icnt = 1;
			while (icnt <= 5) {
				menu.click();
				try {
					((AppiumDriver) GetDriver()).findElement(By.xpath(menuSlideXpath));
					isMenuOpened = true;
					break;
				} catch (Exception e1) {
					// Added for R18.3
					if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
						menuSlideXpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.td:id/flyout_menu_dashboard' or @resource-id='com.td:id/flyout_menu']";
						try {
							((AppiumDriver) GetDriver()).findElement(By.xpath(menuSlideXpath));
							isMenuOpened = true;
							break;
						} catch (Exception e2) {

						}
					}
				}
				icnt++;
			}
			if (isMenuOpened) {
				Report_Pass_Verified("Menu opened");
			} else {
				Report_Fail("Failed to click menau");
			}

		} catch (Exception e) {
			Report_Fail("Exception to click menau");
		}

	}

	public void closeApp() {
		try {
			((MobileDriver) GetAppiumDriver()).closeApp();
			GetReporting().FuncReport("Pass", "App closed");

		} catch (Exception e) {
			getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void runAppInBackGround() {
		try {
			// ((MobileDriver) GetAppiumDriver()).runrunAppInBackground(10);
			((MobileDriver) GetAppiumDriver()).runAppInBackground(Duration.ofSeconds(MaxTimeoutInSec));
			GetReporting().FuncReport("Pass", "App pushed to background");

		} catch (Exception e) {
			getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void reopenApp() {
		try {
			((MobileDriver) GetAppiumDriver()).launchApp();
			GetReporting().FuncReport("Pass", "App relaunched");

		} catch (Exception e) {
			getGlobalVarriablesInstance().bStopNextFunction = false;
			try {
				GetReporting().FuncReport("Fail", "Test failed: " + e.getMessage());
			} catch (IOException ex) {
				System.out.print("IOException from Method " + this.getClass().toString() + " " + e.getCause());
			}
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}
	}

	public void switchToWebView() {
		try {
			Set<String> contextNames = ((AppiumDriver) GetDriver()).getContextHandles();
			sleep(3000); // WebView needs time to load
			String lastContextView = (String) contextNames.toArray()[contextNames.size() - 1];
			System.out.println(contextNames);

			System.out.println("Before Webview Switch: " + lastContextView);
			if (lastContextView.contains("WEBVIEW_com.td")) {
				((AppiumDriver) GetDriver()).context(lastContextView);
			} else if (lastContextView.contains("WEBVIEW_R") || lastContextView.contains("WEBVIEW_S")) {
				((AppiumDriver) GetDriver()).context("WEBVIEW_R");
			} else {
				System.out.println("No Webview found");
			}
			sleep(5000); // WebView needs time to load
			System.out.println("After Webview Switch");

		} catch (Exception e) {
			System.out.println("Exception from Method " + this.getClass().toString() + " " + e.getCause());
		}

	}

	public void FuncSwipeWhileElementNotFoundByxpathOnActivityTab(String xpathEle, boolean clickYorN, int swipes,
			String direction) {

		Dimension size = ((AppiumDriver) GetDriver()).manage().window().getSize();
		int startx = size.width;
		int starty = size.height;
		int endy = size.height;
		int heightPer = (endy * 25 / 100);
		boolean flag = true;
		int count = 0;
		String sEleName = "";
		try {
			while (flag && count <= swipes) {

				try {
					WebDriverWait wait = new WebDriverWait(GetDriver(), 2L);
					wait.until(ExpectedConditions.visibilityOf(GetDriver().findElement(By.xpath(xpathEle))));

					flag = false;
					sEleName = FuncGetTextByxpath(xpathEle);

				} catch (Exception e) {
					performSwipeActionOnTab(direction, startx, starty, endy, heightPer);
					count++;
				}

			}

			if (!flag) {
				GetReporting().FuncReport("Pass",
						"Swiped " + direction + " till element found. Element : <b>" + sEleName + "</b>");
				if (clickYorN)
					FuncClick((MobileElement) GetDriver().findElement(By.xpath(xpathEle)), sEleName);
			} else
				GetReporting().FuncReport("Fail", "Swiped " + direction + " but element not found. Swipes : " + count);

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail",
						"Exception: Swiped " + direction + " but element not found. Swipes : " + count);
			} catch (IOException e1) {

				e1.printStackTrace();
			}
		}

	}

	private void performSwipeActionOnTab(String direction, int startx, int starty, int endy, int heightPer) {
		if (direction.equalsIgnoreCase("up"))
			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe((int) (startx * 0.25), starty / 2,
					startx / 2, endy / 2 - heightPer, 2000);
		else if (direction.equalsIgnoreCase("down"))
			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx / 2, endy / 2, startx / 2,
					endy / 2 + heightPer, 2000);
	}

	public void GoBackToHomePage() {
		int count = 10;
		String Home_dashboard_xpath = "";
		if (getTestDataInstance().getMobilePlatForm().equalsIgnoreCase("Android")) {
			Home_dashboard_xpath = "//*[@resource-id='com.td:id/easy_access' or @resource-id='com.td:id/easy_access_button']";
		} else {
			Home_dashboard_xpath = "//*[@name='NAVIGATION_ITEM_QUICK_ACCESS' or @name='QuickLinkRightNavButton']";
		}

		while (isBackButtonPresent() && count != 0) {
			ClickBackButton();
			try {
				((AppiumDriver) GetDriver()).findElement(By.xpath(Home_dashboard_xpath));
				System.out.println("Go back to home already");
				break;
			} catch (Exception e) {
				count--;
			}
		}
		if (count != 0) {
			Report_Pass_Verified("Got Home Page dashboard");
		} else {
			Report_Fail("Failed to Home page dashboard");
		}
	}

	public void SwipeWhileQuickLinkNotFound(MobileElement elementToFind, boolean clickYorN, int swipes,
			String direction) throws IOException {

		Dimension size;
		size = ((AppiumDriver) GetDriver()).manage().window().getSize();

		int startx = size.width;
		int endx = size.width;
		int starty = size.height;
		int endy = size.height;

		boolean flag = true;
		int count = 0;
		String sEleName = "";
		boolean isSwiped = false;
		try {
			while (flag && count <= swipes) {

				try {
					WebDriverWait wait = new WebDriverWait(GetDriver(), 2L);
					wait.until(ExpectedConditions.visibilityOf(elementToFind));

					flag = false;
					sEleName = FuncGetElementText(elementToFind);

				} catch (Exception e) {
					if (direction.equalsIgnoreCase("left"))
						((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe((int) (startx * 0.5),
								(int) (starty * 0.20), (int) (endx * 0.35), (int) (endy * 0.20), 2000);
					else if (direction.equalsIgnoreCase("right"))
						((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe((int) (startx * 0.5),
								(int) (starty * 0.20), (int) (endx * 0.65), (int) (endy * 0.20), 2000);
					count++;
					isSwiped = true;
				}

			}

			if (!flag) {
				GetReporting().FuncReport("Pass",
						"Swiped " + direction + " till element found. Element : <b>" + sEleName + "</b>");
				if (clickYorN)
					FuncClick(elementToFind, sEleName);
			} else
				GetReporting().FuncReport("Fail",
						"Exception: Swiped " + direction + " but element not found. Swipes : " + count);

		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail",
						"Exception: Swiped " + direction + " but element not found. Swipes : " + count);
			} catch (IOException e1) {

				e1.printStackTrace();
			}
		}

	}

	public void FuncSwipeOneScreenWithInElement(MobileElement swipeWithinElement, String sDirection) {

		Point elementWithinLocation = swipeWithinElement.getLocation();
		Dimension elementWithinDimension = swipeWithinElement.getSize();
		int locationX = elementWithinLocation.getX();
		int locationY = elementWithinLocation.getY();
		int dimensionX = elementWithinDimension.width;
		int dimensionY = elementWithinDimension.height;

		int startx, starty, endx, endy;
		if (sDirection.equalsIgnoreCase("up")) {
			startx = locationX + dimensionX / 2;
			endx = startx;
			starty = locationY + (int) (dimensionY * 0.95);
			endy = locationY + (int) (dimensionY * 0.083);
		} else {
			startx = locationX + dimensionX / 2;
			endx = startx;
			starty = locationY + (int) (dimensionY * 0.08);
			endy = locationY + (int) (dimensionY * 0.95);
		}
		try {

			((AppiumDriver<WebElement>) ((AppiumDriver) GetDriver())).swipe(startx, starty, endx, endy, 2000);
		} catch (Exception e) {
			try {
				GetReporting().FuncReport("Fail", "Exception occurred.Swiped failed.");
				e.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}

	public double RoundTo2Decimals(double val) {
		DecimalFormat df2 = new DecimalFormat("###.##");
		return Double.valueOf(df2.format(val));
	}

	public void javaScriptClick(WebDriver driver, WebElement item) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", item);

	}

	public void FuncClickCoordinatesInElement(MobileElement ElementToBeClicked) throws Exception {
		Point elementWithinLocation = ElementToBeClicked.getLocation();
		Dimension elementWithinDimension = ElementToBeClicked.getSize();
		int locationX = elementWithinLocation.getX();
		int locationY = elementWithinLocation.getY();
		int dimensionX = elementWithinDimension.width;
		int dimensionY = elementWithinDimension.height;

		FuncClickCoordinates(locationX + dimensionX / 2, locationY + dimensionY / 2, 1);

	}

}
