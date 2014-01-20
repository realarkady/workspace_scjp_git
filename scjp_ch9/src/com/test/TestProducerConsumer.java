package com.test;

import java.util.ArrayList;
import java.util.List;

public class TestProducerConsumer {
	
	public TestProducerConsumer() {	}
	
	public static void main(String[] args) {
		List items = new ArrayList<>();
		Producer p = new Producer(items);
		Consumer c= new Consumer(items);
		Thread tp = new Thread(p);
		Thread tc = new Thread(c);
		tp.start();
		tc.start();
	}
	
}
