package com.algorithms.problems;

public class Palindrome {
	
	public Palindrome() {	}
	
	public static void main(String[] args) {
		System.out.println("-----");
		Palindrome rp = new Palindrome();
		
		System.out.println(rp.isPalindrome("abccbad"));
	}
	
	public boolean isPalindrome(String s){
		if(s == null || s.length() == 0)
			return false;
		
		for (int i = 0, j = s.length() - 1; i < s.length()/2; i++, j--) {
			if(s.charAt(i) != s.charAt(j))
				return false;
		}
		
		return true;
	}
	
}
