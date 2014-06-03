package com.test.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSetEqualsHashcode {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		
		Person p1 = new Person("John");
		Person p2 = new Person("John");
		System.out.println(p1.equals(p2));
		
		set.add(p1);
		set.add(p2);
		System.out.println(set.size());
	}

}

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return -1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || ! (obj instanceof Person))
			return false;
		
		if(this == obj)
			return true;
		
		return this.name == ((Person) obj).getName();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}