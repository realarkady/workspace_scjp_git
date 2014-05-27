package com.test.whizlabs.exam1;

import java.util.Vector;

public class Q_20_AddToGenericList {
	public static void main(String[] args) {
		Vector<Shape> picture = new Vector<Shape>(); // 1 
		picture.add(new Circle()); // 2 
		picture.add(new Rectangle()); // 3 
		Rectangle rect = (Rectangle) picture.get(1); // 4 
	}
}