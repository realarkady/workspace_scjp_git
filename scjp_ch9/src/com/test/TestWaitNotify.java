package com.test;

public class TestWaitNotify {

	public TestWaitNotify() {	}

	public static void main(String[] args) {
		TestWaitNotify twn = new TestWaitNotify();
		twn.waitForSignal();
	}

	void waitForSignal() {
		Object obj = new Object();
		synchronized (Thread.currentThread()) {
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//obj.notify();
		}

	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		
	}

}
