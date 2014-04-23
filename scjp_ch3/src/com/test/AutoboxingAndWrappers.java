package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AutoboxingAndWrappers {

	public AutoboxingAndWrappers() {
	}

	public static void main(String[] args) {
		int in = 11;

		Byte byt = new Byte((byte) 11);
		Short sho = new Short((short) 11);
		Long lon = new Long(in);
		Float flo = new Float(11.5);
		Double dou = new Double(11.5);
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(1);
		l.add(5);
		System.out.println(sum(l));
		
	}

	public static int sum(List<Integer> list) {
		int sum = 0;
		for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
			int i = iter.next();
			sum += i;
		}
		return sum;
	}

}
