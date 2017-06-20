package com.td.mainframe;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;


public class HostEvents extends Robot {

	public int TabWait = 100;
	public int EnterWait = 2000;
	public int PauseBreakWait = 400;
	public int F9Wait = 800;
	public int F10Wait = 1000;
	public int F12Wait = 1500;
	public int RightArrowWait = 100;
	public int LeftArrowWait = 100;
	public int UpArrowWait = 100;
	public int DownArrowWait = 100;
	
	public HostEvents() throws AWTException {
		super();
	}

	public File setFile(String SessionPath) {
		File file = new File(SessionPath);
		return file;
	}

	/**
	 * Method to open host session by passing the host file path.
	 * 
	 * @param SessionPath
	 */
	public void openSession(String SessionPath) {

		try {
			System.out.println("FilePath: "+SessionPath);
			Desktop.getDesktop().open(setFile(SessionPath));
			Thread.sleep(5000);
		} catch (Exception e) {
			System.err.println("Failed to create a session");
		}
	}

	/**
	 * This method will write the data to clipboard.
	 * 
	 * @param s
	 */
	private void writeToClipboard(String s) {
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Transferable transferable = new StringSelection(s);
		clipboard.setContents(transferable, null);
	}

	/**
	 * This method will paste the clipboard content.
	 */
	public void pasteClipboard() {

		try{
		
		keyPress(KeyEvent.VK_CONTROL);
		keyPress(KeyEvent.VK_V);
		delay(50);
		keyRelease(KeyEvent.VK_V);
		keyRelease(KeyEvent.VK_CONTROL);
		
		}catch(Exception e){
			System.err.println("Failed to paste to clipboard");
		}
	}

	/**
	 * This method will write the content to where the mouse is present.
	 * 
	 * @param text
	 */
	public void sendKeys(String text) {
		try {
			
			writeToClipboard(text);
			pasteClipboard();
			Thread.sleep(500);
		} catch (Exception e) {
			System.err.println("Failed to send text: "+text);
		}

	}

	/**
	 * Method to move mouse pointer to the specific coordinates
	 * 
	 * @param x
	 * @param y
	 */
	public void moveMouse(int x, int y) {
		
		try{
		mouseMove(x, y);
		mousePress(InputEvent.BUTTON1_MASK);
		mouseRelease(InputEvent.BUTTON1_MASK);
		}catch(Exception e){
			System.err.println("Failed to move mouse");
		}
	}

	/**
	 * @author Ashraf Method to copy a text from host through given coordinates.
	 * @param x
	 * @param y
	 * @param x1
	 * @param y1
	 * @param label
	 * @return
	 */
	public String copyText(int x, int y, int x1, int y1, String label) {

		String result = null;

		try {
			mouseMove(x, y);
			mousePress(InputEvent.BUTTON1_MASK);
			mouseMove(x1, y1);
			mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(400);
			keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(400);
			keyPress(KeyEvent.VK_C);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_C);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(400);

			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			result = (String) clipboard.getData(DataFlavor.stringFlavor);

			System.out.println("Copied " + label + " : " + result);

		} catch (Exception e) {
			System.err.println("Failed to copy screen text");
		}

		return result;
	}

	/**
	 * @author Ashraf Method to move mouse pointer to specified coordinates and
	 *         double click.
	 * 
	 * @param x
	 * @param y
	 */
	public void doubleClick(int x, int y) {
		try{
		
		mouseMove(x, y);
		mousePress(InputEvent.BUTTON1_MASK);
		mouseRelease(InputEvent.BUTTON1_MASK);
		mousePress(InputEvent.BUTTON1_MASK);
		mouseRelease(InputEvent.BUTTON1_MASK);
		
		}catch(Exception e){
			System.err.println("Failed to Double click");
		}
	}

	/**
	 * @author Ashraf Method to perform Tab action.
	 * @param count
	 */
	public void hitTab(int count) {
		try {
			for (int i = 0; i < count; i++) {
				keyPress(KeyEvent.VK_TAB);
				Thread.sleep(TabWait);
			}
		} catch (Exception e) {
			System.err.println("Failed to hit Tab");
		}
	}

	/**
	 * @author Ashraf Method to perform Enter action.
	 */
	public void hitEnter() {
		try {
			keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(EnterWait);
		} catch (Exception e) {
			System.err.println("Failed to hit Enter");
		}
	}

	/**
	 * @author Ashraf Method to perform [F9] action.
	 */
	public void hitF9() {
		try {
			keyPress(KeyEvent.VK_F9);
			Thread.sleep(F9Wait);
		} catch (Exception e) {
			System.err.println("Failed to hit F9");
		}
	}

	/**
	 * @author Ashraf Method to perform [F10] action.
	 */
	public void hitF10() {
		try {
			keyPress(KeyEvent.VK_F10);
			Thread.sleep(F10Wait);
		} catch (Exception e) {
			System.err.println("Failed to hit F10");
		}
	}

	/**
	 * @author Ashraf Method to perform [F12] action.
	 */
	public void hitF12() {
		try {
			keyPress(KeyEvent.VK_F12);
			Thread.sleep(F12Wait);
		} catch (Exception e) {
			System.err.println("Failed to hit F12");
		}
	}

	/**
	 * @author Ashraf Method to perform [Pause/Break] action.
	 */
	public void hitPauseBreak() {
		try {
			keyPress(KeyEvent.VK_PAUSE);
			Thread.sleep(PauseBreakWait);
		} catch (Exception e) {
			System.err.println("Failed to hit Pause key");
		}
	}

	/**
	 * @author Ashraf Method to perform [DELETE] action.
	 * @param count
	 */
	public void hitDelete(int count) {
		try {
			for (int i = 0; i < count; i++) {
				keyPress(KeyEvent.VK_DELETE);
				Thread.sleep(300);
			}
		} catch (Exception e) {
			System.err.println("Failed to hit DELETE key");
		}
	}

	/**
	 * @author Ashraf Method to perform [RIGHT] arrow key action.
	 * @param count
	 */
	public void hitRightKey(int count) {
		try {
			for (int i = 0; i < count; i++) {
				keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(RightArrowWait);
			}
		} catch (Exception e) {
			System.err.println("Failed to hit Right Arrow key");
		}
	}

	/**
	 * @author Ashraf Method to perform [LEFT] arrow key action.
	 */
	public void hitLeftKey() {
		try {
			keyPress(KeyEvent.VK_LEFT);
			Thread.sleep(LeftArrowWait);
		} catch (Exception e) {
			System.err.println("Failed to hit Left arrow key");
		}
	}

	/**
	 * @author Ashraf Method to perform [UP] arrow key action.
	 */
	public void hitUpKey() {
		try {
			keyPress(KeyEvent.VK_UP);
			Thread.sleep(UpArrowWait);
		} catch (Exception e) {
			System.err.println("Failed to hit UP arrow key");
		}
	}

	/**
	 * @author Ashraf Method to perform [DOWN] arrow key action.
	 * @param count
	 */
	public void hitDownKey(int count) {
		try {
			for (int i = 0; i < count; i++) {
				keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(DownArrowWait);
			}
		} catch (Exception e) {
			System.err.println("Failed to hit Down arrow key");
		}
	}

	/**
	 * @author Ashraf Method to close the current application window.
	 */
	public void closeApplication() {
		try {
			keyPress(KeyEvent.VK_ALT);
			keyPress(KeyEvent.VK_F4);
			keyRelease(KeyEvent.VK_F4);
			keyRelease(KeyEvent.VK_ALT);

			Thread.sleep(300);
		} catch (Exception e) {
			System.err.println("Failed to hit Pause key");
		}
	}
	
	
	/**
	 * @author Ashraf Method to check whether the text is present in the current screen.
	 */
	public boolean isTextPresent(String text) {
		
		String result=null;
		boolean flag=false;
		
		try {
			Thread.sleep(400);
			keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(400);
			keyPress(KeyEvent.VK_A);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_A);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(400);
			
			keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(400);
			keyPress(KeyEvent.VK_C);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_C);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(400);
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			result = (String) clipboard.getData(DataFlavor.stringFlavor);

			
			if(result.contains(text)){
				flag=true;
			}else{
				flag=false;
			}
			
			
			
		} catch (Exception e) {
			System.err.println("Failed to hit Pause key");
		}
		
		return flag;
	}
	
	
	
	
	/**
	 * @author Ashraf Method to copy screen text.
	 */
	public String copyScreen() {
		
		String result=null;
		
		try {
			Thread.sleep(400);
			keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(400);
			keyPress(KeyEvent.VK_A);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_A);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(400);
			
			keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(400);
			keyPress(KeyEvent.VK_C);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_C);
			Thread.sleep(400);
			keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(400);
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Clipboard clipboard = toolkit.getSystemClipboard();
			result = (String) clipboard.getData(DataFlavor.stringFlavor);

			
			
			
		} catch (Exception e) {
			System.err.println("Failed to hit Pause key");
		}
		
		return result;
	}

	
	/**
	 * @author Ashraf Method to minimize the window.
	 */
	public void minimizeWindow() {
		
		try {
			keyPress(KeyEvent.VK_ALT);
			keyPress(KeyEvent.VK_SPACE);
			keyPress(KeyEvent.VK_N);
			keyRelease(KeyEvent.VK_N);
			keyRelease(KeyEvent.VK_SPACE);
			keyRelease(KeyEvent.VK_ALT);
			
		} catch (Exception e) {
			System.err.println("Failed to hit Pause key");
		}
		
	}

	
}
