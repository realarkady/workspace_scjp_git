package com.test.collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SortUsingCollections {
	
	public SortUsingCollections() {	}
	
	public static void main(String[] args) {
		SortableObject so = new SortableObject(1, "name_1");
		List<SortableObject> sol = new ArrayList<SortableObject>();
		sol.add(so);
		sol.add(new SortableObject(3, "name_3"));
		sol.add(new SortableObject(5, "name_5"));
		sol.add(new SortableObject(2, "name_2"));
		sol.add(new SortableObject(1, "name_1"));
		sol.add(new SortableObject(9, "name_9"));
		sol.add(new SortableObject(6, "name_6"));
		
		Collections.sort(sol);
		
		System.out.println(sol);
		
	}
	
	
}

class SortableObject implements Comparable<SortableObject>{
	private Integer id;
	private String name;
	
	public SortableObject(){ }
	
	public SortableObject(int id, String name) {
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
	public int compareTo(SortableObject so) {
		return id.compareTo(so.getId());
	}

	@Override
	public String toString() {
		return "\n{ id: " + id +", name: " + name + " }";
	}
	
}
