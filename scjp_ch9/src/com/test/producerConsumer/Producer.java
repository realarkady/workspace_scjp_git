package com.test.producerConsumer;

public class Producer implements Runnable{
	private int i = 0;
	private Consumer consumer;
	
	public Producer() {	}
	
	public Producer(Consumer consumer) {
		super();
		this.consumer = consumer;
	}
	
	@Override
	public void run() {
		while(true){
			consumer.add("job_" + i);
			i++;
		}
	}
	
}
