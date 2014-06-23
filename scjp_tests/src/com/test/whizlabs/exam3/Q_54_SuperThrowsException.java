package com.test.whizlabs.exam3;

class SuperClassTest {
	SuperClassTest() throws Exception {
	}
	
	int f() {
		return 0;
	}
}

public class Q_54_SuperThrowsException extends SuperClassTest {
	int i;
	
	int f() {
		return i;
	}
	// Compiler Error!!! (if no "throws")
	Q_54_SuperThrowsException(int i) throws Exception {
		super();
		this.i = i;
	}
	
	public static void main(String[] args) {
		SuperClassTest t;
		// Compiler Error!!! Must handle Exception
		try {
			t = new Q_54_SuperThrowsException(5);
			System.out.println(t.f());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}