package com.tasks.examlab.exam1;

class XSync implements Runnable {
	public void run() {
		synchronized ("x") {
			System.out.print("X ");
			this.run2();
		}
	}

	public void run2() {
		synchronized ("x") {
			System.out.print("X2 ");
		}
	}
}

public class Q_15_Thread_lock_on_same_string {
	public static void main(String args[]) {
		XSync ns = new XSync();
		Thread t1 = new Thread(ns);
		Thread t2 = new Thread(ns);
		t1.start();
		t2.start();
	}
}