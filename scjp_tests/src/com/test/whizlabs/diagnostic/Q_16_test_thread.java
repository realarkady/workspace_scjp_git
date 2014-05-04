package com.test.whizlabs.diagnostic;

public class Q_16_test_thread {
	private int count = 1;
	
	public Q_16_test_thread() {	}
	
	public static void main(String[] args) {
		Q_16_test_thread demo = new Q_16_test_thread();
		Thread a1 = new A(demo);
		Thread a2 = new A(demo);
		a1.start();
		a2.start();
	}
	
	public synchronized void doSomething() {
		for (int i = 0; i < 10; i++) {
			System.out.println(count++);
		}
		
	}
	
}

class A extends Thread {
	Q_16_test_thread demo;
	
	public A(Q_16_test_thread td){
		demo = td;
	}
	
	public void run() {
		demo.doSomething();
	}
}