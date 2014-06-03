package com.test.whizlabs.exam1;

public class Q_25_RunnableThread<T> {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.print("Cat");
			}
		};
		
		Thread t = new Thread(r) {
			public void run() {
				System.out.print("Dog");
			}
		};
		t.start(); //output: Dog
	}
	
}