package com.algorithms.problems;

import java.util.ArrayList;

public class p_08_05_print_rec_paranthesis {
	
	public p_08_05_print_rec_paranthesis() { }
	
	public static void main(String[] args) {
		getPerms("abcdefgh");
	}
	
	public static ArrayList<String> getPerms(String s) {
		ArrayList<String> permutations = new ArrayList<String>();
		if (s == null) { // error case
			return null;
		} else if (s.length() == 0) { // base case
			permutations.add("");
			return permutations;
		}
		
		char first = s.charAt(0); // get the first character
		String remainder = s.substring(1); // remove the first character
		ArrayList<String> words = getPerms(remainder);
		
		for (String word : words) {
			for (int j = 0; j <= word.length(); j++) {
				permutations.add(insertCharAt(word, first, j));
			}
		}
		System.out.println(permutations);
		return permutations;
	}
	
	public static String insertCharAt(String word, char c, int i) {
		String start = word.substring(0, i);
		String end = word.substring(i);
		return start + c + end;
	}
	
}