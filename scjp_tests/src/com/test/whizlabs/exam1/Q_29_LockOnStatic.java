package com.test.whizlabs.exam1;

public class Q_29_LockOnStatic extends Thread {
	private int i;
	static String s = new String("hi");

	Q_29_LockOnStatic(String s) {
		super(s);
	}

	public String getObj() {
		return s;
	}

	public void run() {
		try {
			synchronized (this.getObj()) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		Q_29_LockOnStatic t1 = new Q_29_LockOnStatic("A");
		Q_29_LockOnStatic t2 = new Q_29_LockOnStatic("B");
		t1.start();
		t2.start();
	}
}