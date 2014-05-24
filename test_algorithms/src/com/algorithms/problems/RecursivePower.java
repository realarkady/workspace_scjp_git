package com.algorithms.problems;

public class RecursivePower {
	
	public RecursivePower() {	}
	
	public static void main(String[] args) {
		System.out.println("-----");
		RecursivePower rp = new RecursivePower();
		
		System.out.println(rp.rPower(2, 4));
	}
	
	public long rPower(int x, int y){
		if(y==1)
			return x;
		
		return x * rPower(x, --y);
	}
	
}
