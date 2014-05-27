package com.test.whizlabs.exam1;

class Parent { }
class DerivedOne extends Parent { } 
class DerivedTwo extends Parent { } 

public class Q_18_SiblingCastTest {
	public static void main(String[] args) {
		Parent p = new Parent(); 
		DerivedOne d1 = new DerivedOne();
		DerivedTwo d2 = new DerivedTwo(); 
		//compile error:
		//d1 = (DerivedOne)d2;
	}
}
