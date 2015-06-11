package messpace.bcubedplayer.common;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Robot bot = new Robot();
		int command = scan.nextInt();
		switch(command) {
			case 1:
				Thread.sleep(5000);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyRelease(KeyEvent.VK_RIGHT);
				runMain();
				break;
			case 2:
				Thread.sleep(5000);
				bot.keyPress(KeyEvent.VK_LEFT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_LEFT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_UP);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_LEFT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_LEFT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_LEFT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_LEFT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(500);
				bot.keyPress(KeyEvent.VK_UP);
				runMain();
				break;
				
		}
	}
	
	public static void runMain() throws Exception {
		main(null);
	}

}
