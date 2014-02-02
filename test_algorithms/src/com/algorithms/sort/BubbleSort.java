package com.algorithms.sort;

public class BubbleSort {
	public static String ASCENDING = "ASC";
	public static String DESCENDING = "DESC";
	
	public BubbleSort() {	}
	
	public static void main(String[] args) {
		int[] arr = {5,2,12,99,8,3,50,0,11,6};
		sort(arr, ASCENDING);
		for(int i : arr)
			System.out.print(i+" ");
		
		System.out.println();
		
		sort(arr, DESCENDING);
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	/**{input_1: int array,
	 *  input_2: String sort order,
	 *  output : sorted int array
	 * }
	*/
	public static int[] sort(int[] array, String sortOrder){
		if(sortOrder == ASCENDING)
			return sortAscending(array);
		else if(sortOrder == DESCENDING)
			return sortDescending(array);
		else return null;
	}
	
	/**{input_1: int array,
	 *  output : sorted int array ascending
	 * }
	*/
	public static int[] sortAscending(int[] array){
		boolean isSorted = false;
		int temp = 0;
		while(!isSorted){
			isSorted = true;
			for(int i = 1; i < array.length; i++){
				if(array[i]<array[i-1]){
					temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
					isSorted = false;
				}
			}
		}
		return array;
	}
	
	/**{input_1: int array,
	 *  output : sorted int array descending
	 * }
	*/
	public static int[] sortDescending(int[] array){
		boolean isSorted = false;
		int temp = 0;
		while(!isSorted){
			isSorted = true;
			for(int i = 1; i < array.length; i++){
				if(array[i]>array[i-1]){
					temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
					isSorted = false;
				}
			}
		}
		return array;
	}
}
