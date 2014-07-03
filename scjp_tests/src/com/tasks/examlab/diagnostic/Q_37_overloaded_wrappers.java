package com.tasks.examlab.diagnostic;

public class Q_37_overloaded_wrappers {
	public static void tMeth(Integer[] i) {
		System.out.print("A");
	}

	public static void tMeth(int[] i) {
		System.out.print("B");
	}

	public static void main(String args[]){
		//compiler ERROR!!! 
		//tMeth(Integer.valueOf("7"));
		
		//OK
		tMeth(new Integer[]{1, 2}); //A
		tMeth(new int[]{1, 2}); //B
		
    }
}