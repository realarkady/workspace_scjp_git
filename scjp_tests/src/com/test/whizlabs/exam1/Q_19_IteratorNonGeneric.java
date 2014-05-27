package com.test.whizlabs.exam1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Q_19_IteratorNonGeneric {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(4);
		list.add(-4);
		
		//Compiler error: i.next() return Object:
		//for (Iterator i = list.iterator(); i.hasNext();) {
		//	Integer in = i.next();
		//	System.out.println(in);
		//}
		
		//fix:
		for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
			Integer in = i.next();
			System.out.println(in);
		}
		
	}
}