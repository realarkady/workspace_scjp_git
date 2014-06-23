package com.tasks.examlab.exam1;

public class Q_05_TrickySleep implements Runnable {
	public void run() {
		try {
			System.out.print("A");
			// sleep(1000); -->> Compile Error!!!
			Thread.sleep(1000);
			System.out.print("B");
		} catch (InterruptedException ie) {
			System.out.print("Thread Interrupted");
		}
	}
	
	public static void main(String args[]) {
		Thread t = new Thread(new Q_05_TrickySleep());
		t.start();
		t.interrupt();
	}
}
