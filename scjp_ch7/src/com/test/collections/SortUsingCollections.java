package com.test.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class SortUsingCollections {
	
	public SortUsingCollections() {	}
	
	public static void main(String[] args) {
		MyObject mo = new MyObject(1, "name_1");
		List<MyObject> mol = new ArrayList<MyObject>();
		mol.add(mo);
		mol.add(new MyObject(3, "name_3"));
		mol.add(new MyObject(5, "name_5"));
		mol.add(new MyObject(2, "name_2"));
		mol.add(new MyObject(1, "name_1"));
		mol.add(new MyObject(9, "name_9"));
		mol.add(new MyObject(6, "name_6"));
		
		MyObjectComparatorAsc mocAsc = new MyObjectComparatorAsc();
		MyObjectComparatorDesc mocDesc = new MyObjectComparatorDesc();
		
		Collections.sort(mol);
		System.out.println(mol);
		
		Collections.sort(mol, mocDesc);
		System.out.println(mol);
		
		
		MyObject[] moa = mol.toArray(new MyObject[mol.size()]); //new MyObject[mol.size()];
		Arrays.sort(moa, mocAsc);
		for (MyObject myObject : moa) {
			System.out.println("myObject: " + myObject);
		}
		
	}
	
	
}

class MyObject implements Comparable<MyObject>{
	private Integer id;
	private String name;
	
	public MyObject(){ }
	
	public MyObject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int compareTo(MyObject mo) {
		return Integer.valueOf(name.length()).compareTo(mo.getName().length());
	}

	@Override
	public String toString() {
		return "\n{ id: " + id +", name: " + name + " }";
	}
	
}

class MyObjectComparatorAsc implements Comparator<MyObject>{

	@Override
	public int compare(MyObject o1, MyObject o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class MyObjectComparatorDesc implements Comparator<MyObject>{

	@Override
	public int compare(MyObject o1, MyObject o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}
