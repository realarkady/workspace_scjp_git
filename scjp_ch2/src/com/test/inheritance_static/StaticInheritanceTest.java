package com.test.inheritance_static;

public class StaticInheritanceTest {

	public StaticInheritanceTest() {	}

	public static void main(String[] args) {
		Animal d = new Dog("Belka");
		Animal a = new Animal();
		((Dog)d).makeSound();
		((Dog)a).makeSound();
		Animal.makeSound();
		Dog.makeSound();
	}
	
}

class Animal {

	public Animal() {	}

	public static void makeSound() {
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

	public static void makeSound() {
		System.out.println("Bark!");
	}

	public void getName() {
		System.out.println(name);
	}
	
	
}
