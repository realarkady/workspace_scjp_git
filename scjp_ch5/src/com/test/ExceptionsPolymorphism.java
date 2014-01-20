package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsPolymorphism {

	public ExceptionsPolymorphism() {	}

	public static void main(String[] args) throws RuntimeException{
		int[] x={0,1,2,3,4,5,6,7,8,9};
		Object[] o={0,1,2,3,4,5,6,7,8,9};
		
		try {
			new ExceptionsPolymorphism().go();
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		//Object y = 0;
		for (Object y : o) {
			
		}
		//assert(false): new Object();
		for (int i = 0, z=0; i < args.length; i++) {
			String string = args[i];
			
		}
	}
	
	void go(){
		go();
	}

}


class Animal{
	public void makeNoise() throws IOException{
		System.out.println("General Noise...");
	}
}

class Dog extends Animal{
	public void makeNoise() throws FileNotFoundException{
		System.out.println("General Noise...");
	}
}