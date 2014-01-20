package com.test;

import java.util.List;

public class Producer implements Runnable {
	private List<Item> items;

	public Producer() {
	}

	public Producer(List<Item> items) {
		super();
		this.items = items;
	}

	public void run() {
		while (true) {
			this.create();
		}
	}

	public void create() {
		synchronized (items) {
			System.out.println("PRODUCER");
			int priority = (int) (Math.random() * 100);
			String name = "name-" + priority;
			String description = "...description...";
			items.add(new Item(name, description, priority));
			items.notifyAll();
		}
	}
}
