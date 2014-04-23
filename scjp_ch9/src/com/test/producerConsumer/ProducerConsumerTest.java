package com.test.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerTest {
	
	public ProducerConsumerTest() {	}
	
	public static void main(String[] args) {
		System.out.println("ProducerConsumerTest ");
		
		List<String> jobs = new ArrayList<>();
		jobs.add("j1");
		jobs.add("j2");
		jobs.add("j3");
		
		Consumer consumerRunnable = new Consumer(jobs);
		Producer producerRunnable = new Producer(consumerRunnable);
		
		Thread producerThread1 = new Thread(producerRunnable);
		Thread producerThread2 = new Thread(producerRunnable);
		Thread consumerThread = new Thread(consumerRunnable);
		
		producerThread1.setPriority(Thread.MIN_PRIORITY);
		producerThread2.setPriority(Thread.MAX_PRIORITY);
		consumerThread.setPriority(Thread.MAX_PRIORITY);
		
		
		producerThread1.start();
		producerThread2.start();
		consumerThread.start();
		
	}
	
}
