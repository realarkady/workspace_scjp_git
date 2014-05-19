package com.test.producerConsumer.warmup;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{
	private List<String> jobs = new ArrayList<String>();
	private volatile int i;
	
	public Producer() {	}
	
	public Producer(List<String> jobs) {
		super();
		this.jobs = jobs;
	}
	
	@Override
	public void run() {
		while(true){
			synchronized (jobs) {
				String s = "j_" + i++;
				//System.out.println(s);
				System.out.println("a: " + jobs.size());
				jobs.add(s);
				jobs.notifyAll();
			}
			
		}
	}
	
}
