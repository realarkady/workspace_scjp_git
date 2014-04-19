package com.test.beans;

public class Animal implements IAnimal{
	private int id;
	private String name;
	
	public Animal() {
		
	}
	
	public Animal(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Animal general noise!");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
