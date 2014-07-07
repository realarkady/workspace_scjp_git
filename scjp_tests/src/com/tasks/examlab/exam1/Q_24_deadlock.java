package com.tasks.examlab.exam1;

class A {
	synchronized void doTask1() {
		System.out.print(1);
	}
}

class B extends Thread {
	A a;
	Thread t;

	B(A a, Thread t) {
		this.a = a;
		this.t = t;
	}

	public void run() {
		doTask2();
	}

	public void doTask2() {
		synchronized (a) {
			try {
				t.join();
			} catch (Exception e) {
			}
		}
	}

	public void doTask3() {
		synchronized (a) {
			System.out.print(2);
		}
	}

}

public class Q_24_deadlock {
	
	public static void main(String args[]) throws Exception {
		A a = new A();
		B b = new B(a, Thread.currentThread());
		b.start();
		Thread.sleep(1000);
		a.doTask1();
		b.doTask3();
	}
	
}