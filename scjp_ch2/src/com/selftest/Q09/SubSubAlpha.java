package com.selftest.Q09;

class Alpha {
	static String s = " ";
	protected Alpha() {
		s += "alpha";
	}
}

class SubAlpha extends Alpha{
	static String s = "sub ";
	private SubAlpha() {
		s += "alpha";
	}
}

public class SubSubAlpha extends Alpha{
	static String s = "subsub ";
	private SubSubAlpha() {
		s += "alpha";
	}
	
	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}
