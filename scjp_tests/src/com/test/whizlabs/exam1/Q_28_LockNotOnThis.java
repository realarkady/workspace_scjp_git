package com.test.whizlabs.exam1;

public class Q_28_LockNotOnThis implements Runnable {
	public void run() {
		String str = "hello";
		synchronized (str) {
			try {
				System.out.print(Thread.currentThread().getName());
				Thread.sleep(500);
				System.out.print(Thread.currentThread().getName());
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {
		new Thread(new Q_28_LockNotOnThis(), "A").start();
		new Thread(new Q_28_LockNotOnThis(), "B").start();
	}
}