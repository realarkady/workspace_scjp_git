package com.tasks.examlab.diagnostic;

public class Q_28_constructor_overloading {
	public Q_28_constructor_overloading(Object o) {
		System.out.println("Object In");
	}

	public Q_28_constructor_overloading(Integer o) {
		System.out.println("Integer In");
	}

	public Q_28_constructor_overloading(Number o) {
		System.out.println("Number In");
	}
	
	//Compiler ERROR!!! if this constructor is uncommented ->> String is not in the same hierarchy
	//"The constructor Q_28_constructor_overloading(Object) is ambiguous"
	/*
	public Q_28_constructor_overloading(String o) {
		System.out.println("String In");
	}
	*/
	
	public static void main(String args[]) {
		//output: Integer In
		new Q_28_constructor_overloading(null);
	}
}