package com.test.beans;

public class Cat extends Animal{
	
	public Cat() { }
	
	@Override
	public void makeNoise() {
		System.out.println("Cat Noise!");
	}
	
	public void myCatMethod() {
		System.out.println("Cat Method...");
	}
	
}
