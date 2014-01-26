package com.test.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortCollections {

	public TestSortCollections() {	}

	public static void main(String[] args) {
		List s = new ArrayList();
		s.add("CH12");
		s.add("CH21");
		s.add("CH");
		Collections.sort(s);
		System.out.println(s);
		// for (String string : s) {
		// System.out.println(string);
		// }

		List<Animal> a = new ArrayList();
		a.add(new Animal(4));
		a.add(new Animal(9));
		a.add(new Animal(1));
		a.add(new Animal(0));
		Comparator<Animal> c = new MyComparator();
		Collections.sort(a, c);
		for (Animal animal : a) {
			System.out.println(animal);
		}
	}
}

class Animal implements Comparable<Animal> {
	private int i;

	public Animal() {
	}

	public Animal(int i) {
		this.i = i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	@Override
	public int compareTo(Animal a) {
		return 0;
	}
	
	@Override
	public String toString() {
		return ""+this.i;
	}
}

class MyComparator implements Comparator<Animal> {

	@Override
	public int compare(Animal a1, Animal a2) {
		if(a1.getI() > a2.getI()){
			return 1;
		} else if(a1.getI() < a2.getI()){
			return -1;
		} else {
			return 0;
		}
		
	}

}
