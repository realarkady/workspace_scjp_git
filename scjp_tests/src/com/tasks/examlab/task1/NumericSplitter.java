package com.tasks.examlab.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NumericSplitter {
	
	public NumericSplitter() {	}
	
	public static void main(String[] args) {
		//System.out.println(getCalculationsList(6));
		List<String> list= getCalculationsList(50);
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	public static List<String> getCalculationsList(int num){
		if(num <= 1)
			return null;
		
		List<String> l = new ArrayList<String>();
		
		l.addAll(getSumCalculationsList(num));
		l.addAll(getMultiplicationCalculationsList(num, l));
		
		return l;
	}
	
	private static Set<String> getSumCalculationsList(int num){
		Set<String> set = new TreeSet<String>();
		for (int i = 1; i <= num/2; i++) {
			set.add(i + " + " + (num - i) + " = " + num);
			set.add((num - i) + " + " + i + " = " + num);
		}
		return set;
	}
	
	private static Set<String> getMultiplicationCalculationsList(int num, List<String> l){
		Set<String> set = new TreeSet<String>();
		int sqrtNum = (int) Math.sqrt(num);
		for (int i = 1; i <= sqrtNum; i++) {
			if(num%i == 0) {
				set.add(i + " * " + (num/i) + " = " + num);
				set.add((num/i) + " * " + i + " = " + num);
			}
		}
		return set;
	}
	
	
	
}
