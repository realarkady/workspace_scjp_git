package com.algorithms.problems;

import java.util.Arrays;

import com.algorithms.datastructures.generic.BinaryTree;

public class p_04_03_tree_from_sorted_array_min_height {
	static BinaryTree bTree;
	
	public p_04_03_tree_from_sorted_array_min_height() {	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		arrayToBT(arr);
	}
	
	public static BinaryTree arrayToBT(int[] arr) {
		if(isArraySorted(arr) == false)
			return null;
		int root = arr[arr.length/2];
		bTree = new BinaryTree(root);
		
		return bTree;
	}
	
	public static void arrayToBTRecursive(int[] arr) {
		if(arr.length == 0)
			return;
		
		if(arr.length == 1){
			bTree.insert(arr[0]);
			return;
		}
		int half = arr.length/2;
		
		int[] leftSubArray = Arrays.copyOfRange(arr, 0, half-1);
		int[] rightSubArray = Arrays.copyOfRange(arr, half, arr.length);
		
		arrayToBTRecursive(leftSubArray);
		arrayToBTRecursive(rightSubArray);
		
	}
	
	public static boolean isArraySorted(int[] arr) {
		if(arr.length == 0)
			return false;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] > arr[i])
				return false;
			
		}
		return true;
	}
	
}
