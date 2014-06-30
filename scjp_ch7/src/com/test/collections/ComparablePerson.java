package com.test.collections;

public class ComparablePerson implements Comparable<ComparablePerson>{
	private String name;
	private int age;
	
	public ComparablePerson() {	}
	
	public ComparablePerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(ComparablePerson o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return this.name;// + ", Age: " + this.age;
	}
	
}
