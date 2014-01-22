package com.tests;

public class TestModifiers {

	public TestModifiers() {	}
	
	public static void main(String[] args) {
		
	}
}


class A{
	public A(){
		
	}
	
	public void myFunc(){
		
	}
}
class B extends A{
	public B(){
		this(1);
	}
	
	public B(int i){
		
	}
	
	public void myFunc() throws Error{
		
	}
}
