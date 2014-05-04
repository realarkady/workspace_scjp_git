package com.test.whizlabs.diagnostic;

public class Q_13_test_thread extends Thread {
	private int x = 2;
	
	public Q_13_test_thread() {	
		x = 5;
		start();
	}
	
	public static void main(String[] args) throws Exception {
		new Q_13_test_thread().makeItSo();
	}
	
	public void makeItSo() throws Exception {
		join();
		x = x - 1;
		System.out.println("makeItSo: "+x);
	}
	
	public void run() {
		x *= 2;
		System.out.println("run: "+x);
	}
	
	
}
