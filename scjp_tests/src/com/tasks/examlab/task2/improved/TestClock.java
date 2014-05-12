package com.tasks.examlab.task2.improved;

public class TestClock {
	
	public TestClock() {	}
	
	public static void main(String[] args) {
		Clock clock = new Clock();
		ClockRunnable clockRunnable = new ClockRunnable(clock);
		Thread t = new Thread(clockRunnable);
		t.start();
	}
	
}
