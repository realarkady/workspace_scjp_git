package com.test.collections;

import java.util.HashSet;
import java.util.Set;

public class TestSetEqualsHashcode {

	public static void main(String[] args) {
		Set<NameObject> set = new HashSet<NameObject>();
		
		NameObject o1 = new NameObject("ion");
		NameObject o2 = new NameObject("ion2");
		System.out.println(o1.equals(o2));
		
		set.add(o1);
		set.add(o2);
		System.out.println(set.size());
	}

}


class NameObject {
	String name;
	
	public NameObject(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return -1;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || ! (obj instanceof MyObject))
			return false;
		
		if(this == obj)
			return true;
		
		return this.name == ((MyObject) obj).getName();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}