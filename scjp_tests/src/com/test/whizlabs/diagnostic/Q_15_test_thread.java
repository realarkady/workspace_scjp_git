package com.test.whizlabs.diagnostic;

public class Q_15_test_thread extends Thread {
	
	public Q_15_test_thread() {	}
	
	public static void main(String[] args) {
		Q_15_test_thread t1 = new Q_15_test_thread();
		t1.start();
	}
	
	public void run() {
		System.out.println("Java Threads");
		start();
	}
	
	
}
