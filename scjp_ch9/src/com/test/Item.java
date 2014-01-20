package com.test;

public class Item {
	private String name;
	private String description;
	private int priority;
	
	public Item() {	}
	
	public Item(String name, String description, int priority) {
		super();
		this.name = name;
		this.description = description;
		this.priority = priority;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "name: " + this.name + "\tdescription: " + this.description + "\tpriority: " + this.priority;
	}

	
}
