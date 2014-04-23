package com.test.generics;

import java.util.ArrayList;
import java.util.List;

import com.test.beans.*;

public class TestWildcards {

	public TestWildcards() {	}
	
	public static void main(String[] args) {
		int h = 10;
		h ^= (h >>> 20) ^ (h >>> 12);
		System.out.println("h: " + h);
		h = h ^ (h >>> 7) ^ (h >>> 4);
		System.out.println("h: " + h);
		System.out.println(309 & 31);
		//System.out.println(4<<2);
		
		TestWildcards tw = new TestWildcards();
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Animal());
		animals.add(new Animal());
		animals.add(new Animal());
		
		tw.readFromAnimalList(animals);
		tw.addToAnimalList(animals);
		tw.readFromAnimalList(animals);
		
		List<? extends Animal> aList1 = new ArrayList<Animal>();
		List<? super Animal> aList2 = new ArrayList<Animal>();
		
		//aList1.add(new Animal());
		//aList2.add(new Animal());
		//Animal a1 = aList1.get(0);
		//Animal a2 = aList2.get(0);
		
		
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
