package com.test;

import java.util.List;

public class Consumer implements Runnable {
	private List<Item> items;

	public Consumer() {
	}

	public Consumer(List<Item> items) {
		super();
		this.items = items;
	}

	public void run() {
		while (true) {
			synchronized (items) {
				while (items.isEmpty()) {
					try {
						items.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				this.process(items.remove(0));
			}
		}
	}

	public void process(Item item) {
		System.out.println("CONSUMER -> " + items.size());
		System.out.println(item.toString());
	}
}
