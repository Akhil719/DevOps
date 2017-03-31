package oops.S2_30_03.Multithreading;

/**
 * Project: CoreJava Author: Akhil Note: To change this template use File |
 * Settings | File Templates
 */
class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;

	ThreadDemo(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}

public class TestThread {
	public static void main(String args[]) {

		ThreadDemo T1 = new ThreadDemo("Akhil");
		T1.start();

		ThreadDemo T2 = new ThreadDemo("Ravi");
		T2.start();
	}
}