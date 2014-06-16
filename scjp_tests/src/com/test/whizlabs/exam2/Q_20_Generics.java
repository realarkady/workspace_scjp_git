package com.test.whizlabs.exam2;

import java.util.LinkedList;
import java.util.List;

public class Q_20_Generics {
	public static void main(String[] args) {
		List<Object> list = new LinkedList<Object>();
		list.add("A");
		addToList("B", list);
		System.out.println(list);
	}

	static void addToList(Object o, List<?> l) {
		//l.add(o); compiler error!
	}
}