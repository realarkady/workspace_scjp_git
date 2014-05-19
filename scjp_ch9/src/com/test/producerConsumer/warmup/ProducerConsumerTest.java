package com.test.producerConsumer.warmup;

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
		
		Producer producerRunnable1 = new Producer(jobs);
		Producer producerRunnable2 = new Producer(jobs);
		Consumer consumerRunnable1 = new Consumer(jobs);
		Consumer consumerRunnable2 = new Consumer(jobs);
		
		Thread producerThread1 = new Thread(producerRunnable1);
		Thread producerThread2 = new Thread(producerRunnable2);
		Thread consumerThread1 = new Thread(consumerRunnable1);
		Thread consumerThread2 = new Thread(consumerRunnable2);
		
		producerThread1.start();
		producerThread2.start();
		consumerThread1.start();
		consumerThread2.start();
		
		
	}
	
}
