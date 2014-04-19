package com.test.beans;

public class Dog extends Animal{
	
	public Dog() { }
	
	@Override
	public void makeNoise() {
		System.out.println("Dog Noise!");
	}
	
	public void myDogMethod() {
		System.out.println("Dog Method...");
	}
}
