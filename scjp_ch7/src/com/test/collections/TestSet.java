package com.test.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public TestSet() {
		
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("brand1", "model1", 1);
		Vehicle v2 = new Vehicle("brand2", "model2", 2);
		Vehicle v3 = new Vehicle("brand3", "model1", 1);
		Set<Vehicle> set = new HashSet<Vehicle>();
		set.add(v1);
		set.add(v2);
		set.add(v3);
		
		System.out.println("set.size(): "+set.size());
		
		Vehicle v4 = new Vehicle("brand4", "model1", 1);
		System.out.println("set.contains(v4): "+set.contains(v4));
		System.out.println("v1.equals(v4): "+v1.equals(v4));
	}

}
class Vehicle {
	private String brand;
	private String model;
	private int year;
	
	public Vehicle() {	}

	public Vehicle(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	@Override
	public boolean equals(Object o) {
		if(o!=null && o instanceof Vehicle
				&& ((Vehicle)o).brand == this.brand
				&& ((Vehicle)o).model == this.model
				&& ((Vehicle)o).year == this.year){
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public int hashCode() {
		return 31*year+brand.length()+model.length();
	}
	
}
