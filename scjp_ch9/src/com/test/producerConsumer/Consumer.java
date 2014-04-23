package com.test.producerConsumer;

import java.util.List;

public class Consumer implements Runnable{
	private List<String> jobs;
	
	public Consumer() {	}
	
	public Consumer(List<String> jobs) {
		super();
		this.jobs = jobs;
	}

	public void add(String job) {
		synchronized (jobs) {
			jobs.add(job);
			jobs.notifyAll();
			System.out.println("added: " + job + " by " + Thread.currentThread().getName());
		}
		
	}

	@Override
	public void run() {
		while(true){
			synchronized (jobs) {
				while(!jobs.isEmpty()){
					System.out.println("processed: " + jobs.remove(0) + " by " + Thread.currentThread().getName());
					System.out.println("processed: " + jobs.size());
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
