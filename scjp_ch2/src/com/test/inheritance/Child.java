package com.test.inheritance;

class Parent {
	static {
		System.out.println("Parent sStatic");
	}

	{
		System.out.println("Parent Init");
	}

	Parent() {
		System.out.println("Parent Const");
	}
}

public class Child extends Parent {
	static {
		System.out.println("Child sStatic");
	}

	{
		System.out.println("Child Init");
	}

	Child() {
		System.out.println("Child Const");
	}

	public static void main(String[] args) {
		new Child();
	}

}
