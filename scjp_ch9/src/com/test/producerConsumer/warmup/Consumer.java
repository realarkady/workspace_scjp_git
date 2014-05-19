package com.test.producerConsumer.warmup;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable{
	private List<String> jobs = new ArrayList<String>();
	
	public Consumer() {	}
	
	public Consumer(List<String> jobs) {
		super();
		this.jobs = jobs;
	}
	
	@Override
	public void run() {
		while(true){
			synchronized (jobs) {
				while(!jobs.isEmpty()){
					System.out.println("r: " + jobs.size());
					jobs.remove(0);
				}
				try {
					jobs.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
