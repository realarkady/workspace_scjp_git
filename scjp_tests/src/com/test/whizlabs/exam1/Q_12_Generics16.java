package com.test.whizlabs.exam1;

import java.util.Vector;

class Shape {}
class Circle extends Shape {}
class Rectangle extends Shape {}

public class Q_12_Generics16 {
	public static void main(String[] args) {
		Vector picture = new Vector<Shape>();
		picture.add(new Circle());
		picture.add(new Rectangle());
		Rectangle rect = (Rectangle) picture.get(1);
	}
}
