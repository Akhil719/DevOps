package oops.S2_30_03.Multithreading;

/**
 * Project: CoreJava Author: Akhil Note: To change this template use File |
 * Settings | File Templates.
 */
// File Name : DisplayMessage.java
// Create a thread to implement Runnable
public class DisplayMessage implements Runnable {
	private String message;

	public DisplayMessage(String message) {
		this.message = message;
	}

	public void run() {
		while (true) {
			System.out.println(message);
		}
	}
}
