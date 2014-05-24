package com.algorithms.problems;

public class RecursiveReverseString {
	StringBuilder sb = new StringBuilder();
	
	public RecursiveReverseString() {	}
	
	public static void main(String[] args) {
		System.out.println("-----");
		RecursiveReverseString rr = new RecursiveReverseString();
		String s = "abccbad";
		
		rr.recursiveReverse(s, s.length());
		System.out.println(rr.sb);
	}
	
	public void recursiveReverse(String s, int i){
		if(s == null || s.length() == 0)
			return;
		
		if(i == 0)
			return;
		i--;
		System.out.println(i);
		sb.append(s.charAt(i));
		recursiveReverse(s, i);
	}
	
}
