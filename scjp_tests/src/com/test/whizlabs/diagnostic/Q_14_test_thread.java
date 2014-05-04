package com.test.whizlabs.diagnostic;

public class Q_14_test_thread extends Thread {
	private volatile int i;
	
	public Q_14_test_thread() {	}
	
	public static void main(String[] args) {
		Q_14_test_thread a = new Q_14_test_thread();
		a.run();
		System.out.println(a.i);
		a.start();
		System.out.println(a.i);
	}
	
	public void run() {
		i++;
		System.out.println("run: "+i);
	}
	
	
}
