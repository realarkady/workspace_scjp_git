package com.test.whizlabs.exam1;

public class Q_24_MyGenericClass<T> {
	
	//compiler error: no static member can use a type parameter declared by the enclosing class
	//static T obj2;
	
	//static T getObj() { return new T() }
	
	//static void showObj() {
	//	T obj = new T();
	//	obj.show();
	//}
	
	//However, static generic methods can be used which define their own type parameters. 
	static <E> E showObj() {
		return null;
		//E obj = new E();
		//obj.show();
	}
	
}