package com.test;

public class TestThreadStartFromConstructor extends Thread{
	
	public TestThreadStartFromConstructor() {
		setName("test");
		//start();
		
		//if (Thread.currentThread().getName() != "main") {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.currentThread().join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//} 
		
		
	}

	public static void main(String[] args) {
		TestThreadStartFromConstructor t = new TestThreadStartFromConstructor();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
	}
	
	public void run() {
		
		int i = 0;
		while(i<100){
			System.out.println(Thread.currentThread().getName() + " - " + i);
			i++;
		}
	}
	
}
