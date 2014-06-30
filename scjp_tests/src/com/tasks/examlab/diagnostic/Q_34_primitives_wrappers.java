package com.tasks.examlab.diagnostic;

import java.util.*;

public class Q_34_primitives_wrappers {
	public static void main(String... args) {
		int i = (byte) 4;
		byte b = (byte) i;
		short s = b;
		char c = (char) s;
		//java.lang.Character c2 = (Byte) (new java.lang.Byte("4")); //Compiler ERROR!!!
		char c3 = new Character('A').charValue();
		//byte b2 = new java.lang.Byte(4); //Compiler ERROR!!!
		java.lang.Float ft = Float.valueOf("45").floatValue(); //RunTime ERROR!!!
		//java.lang.Float ft2 = Float.parseFloat("45T").floatValue("32F"); //Compiler ERROR!!!
		
		System.out.println(new java.lang.Byte("4"));
		System.out.println(new java.lang.Byte((byte) 144));
		System.out.println(new java.lang.Short("4"));
		System.out.println(new java.lang.Short((short) 4));
		System.out.println(new java.lang.Integer("4"));
		System.out.println(new java.lang.Integer(4));
		System.out.println(new java.lang.Long("4"));
		System.out.println(new java.lang.Long(44444444444444l));
		
	}

}