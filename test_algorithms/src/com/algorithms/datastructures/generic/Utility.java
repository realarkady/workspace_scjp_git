package com.algorithms.datastructures.generic;

public class Utility {

	public Utility() {	}

	public static void main(String[] args) {
		
	}
	
	//create and populate a new int[] with random integers up to limit
	public static int[] populateRandomArray(int length, int limitOfRandom){
		int[] a = new int[length];
		
		for (int i = 0; i < length; i++) {
			a[i] = (int) (Math.random() * limitOfRandom);
		}
		
		return a;
	}
	
	//print array data
		public static void printArray(int[] a){
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " "); 
			}
		}
	//print array data
	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
		
}
