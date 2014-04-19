package com.test.generics;

import java.util.ArrayList;
import java.util.List;

import com.test.beans.*;

public class TestWildcards {

	public TestWildcards() {	}
	
	public static void main(String[] args) {
		TestWildcards tw = new TestWildcards();
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Animal());
		animals.add(new Animal());
		animals.add(new Animal());
		
		tw.readFromAnimalList(animals);
		tw.addToAnimalList(animals);
		tw.readFromAnimalList(animals);
		
		List<? extends Animal> aList1 = new ArrayList<Animal>();
		List<? super Object> aList2 = new ArrayList<Object>();
		List<Animal> aList3 = new ArrayList<Animal>();
		List<Animal> aList4 = new ArrayList<Animal>();
		List<Animal> aList5 = new ArrayList<Animal>();
		
		
	}
	
	public void readFromAnimalList(List<? extends Animal> animals){
		for (Animal animal : animals) {
			animal.makeNoise(); 
		}
		
		return;
	}
	
	public void addToAnimalList(List<? super Animal> animals){
		animals.add(new Cat());
		
		return;
	}
}
