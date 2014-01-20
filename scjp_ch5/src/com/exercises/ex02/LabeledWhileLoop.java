package com.exercises.ex02;

public class LabeledWhileLoop {

	public LabeledWhileLoop() {	}

	public static void main(String[] args) {
		int outer = 5;
		int inner = 10;
		
		outer:
			for (int i = 0; i < outer; i++) {
				for (int j = 0; j < inner; j++) {
					if(j == 2){
						//continue outer;
					} 
					if(i>3){
						break outer;
					}
					System.out.println("Inner: " + j);
				}
				System.out.println("Outer: " + i);
			}
	}

}
