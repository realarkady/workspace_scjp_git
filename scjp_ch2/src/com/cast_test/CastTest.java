package com.cast_test;

public class CastTest {

	public CastTest() {	}

	public static void main(String[] args) {
		Animal d = new Dog("Belka");
		getSound(d);
	}
	
	public static void getSound(Object obj) {
		if(obj instanceof Animal){
			((Dog)obj).makeSound();
			((Dog)obj).getName();
		}
			//System.out.println("!");
	}
	
}

class Animal {

	public Animal() {	}

	public void makeSound() {
		System.out.println("General Animal Sound!");
	}

}
class Dog extends Animal{
	private String name;
	
	public Dog() {	}
	
	public Dog(String name) {
		super();
		this.name = name;
	}

	public void makeSound() {
		System.out.println("Bark!");
	}

	public void getName() {
		System.out.println(name);
	}
	
	
}
