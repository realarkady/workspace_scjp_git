package com.algorithms.problems;

public class StringContainsDuplicates {
	
	public StringContainsDuplicates() {	}
	
	public static void main(String[] args) {
		String inputString = "qwertyuiopasdfghjklzxcvbnmm";
		int[] a = new int[1];
		a[0]++;
		a[0]++;
		System.out.println(a[0]);
		System.out.println(inputString);
		System.out.print("has duplicates? - ");
		System.out.print(hasDuplicates(inputString));
		
	}
	
	public static boolean hasDuplicates(String inputString) {
		boolean[] bArr = new boolean[256];
		
		for(int i = 0; i < inputString.length(); i++){
			char c = inputString.charAt(i);
			if(bArr[c]){
				return true;
			}
			bArr[c] = true;
		}
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i]);
		}
		
		return false;
	}
	
}
