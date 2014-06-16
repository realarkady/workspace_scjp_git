package com.test.whizlabs.exam2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q_22_generic_static_methods {
	public static void main(String[] args) {
		System.out.println("--------");
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		//System.out.println(((ArrayList) al).size());
		
		List<Integer> ll = new LinkedList<>();
		ll.add(5);
		//System.out.println(((ArrayList) ll).size());
		
		
		boolean instanceOf = ll instanceof List;
		
		
		Throwable t = new Exception("t1");
		System.out.println(((Exception) t).getMessage());
		
	}
	
	public synchronized static <X, Y extends X> boolean isPresent(X x, Y[] y) {
		return false;
	}
}