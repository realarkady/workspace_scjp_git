package com.test;

import java.util.HashMap;
import java.util.Map;

public class TestEqualsHashCode {

	public TestEqualsHashCode() {	}

	public static void main(String[] args) {
		System.out.println("----- start\n");
		
		Map<Person, Person> ps = new HashMap<>();
		Person p1= new Person("Joe", "Moe", 25);
		Person p2= new Person("Ion", "Rusu", 26);
		Person p3= new Person("Angela", "Ionel", 25);
		Person p4= new Person("Ion", "Ng", 28);
		Person p5= new Person("Joe", "Moe", 35);
		
		ps.put(p1, p1);
		ps.put(p2, p2);
		ps.put(p3, p3);
		ps.put(p4, p4);
		ps.put(p5, p5);
		
		/*
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		System.out.println(p1.equals(p5));
		System.out.println(p2.equals(p4));
		*/
		
		Employee pSearch= new Employee("Joe", "Moe", 25);
		
		System.out.println();
		System.out.println(ps.get(p1));
		System.out.println(ps.get(p3));
		System.out.println(ps.get(pSearch));
		
		System.out.println("\n----- end");
	}
	
	
}

class Person {
	private String fName;
	private String lName;
	private int age;
	
	public Person() {	}
	
	public Person(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	public boolean equals(Object o) {
		if((o instanceof Person) 
				&& (((Person)o).getfName() == this.fName)
				&& (((Person)o).getlName() == this.lName)
				&& (((Person)o).getAge() == this.age)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode(){
		return age;
	}
	
	@Override
	public String toString() {
		return this.fName + "/" + this.lName + "/" + this.age;
	}
	//--------------------------------------------------------------------------
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class Employee extends Person {
	public Employee(String fName, String lName, int age) {
		super(fName, lName, age);
	}
	
	public boolean equals(Object o) {
		if((o instanceof Person) 
				&& (((Person)o).getAge() == this.getAge())) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode(){
		return getAge();
	}
	
}