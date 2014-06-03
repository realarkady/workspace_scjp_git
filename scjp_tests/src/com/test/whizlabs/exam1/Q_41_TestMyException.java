package com.test.whizlabs.exam1;

class MyException extends Exception {
}

public class Q_41_TestMyException {
	void f() throws MyException {
		throw new MyException();
	}

	public static void main(String[] args) throws MyException {
		//fix: initialized e1 with null:
		MyException e1 = null;
		Q_41_TestMyException t = new Q_41_TestMyException();
		try {
			t.f();
		} catch (MyException e) {
			e1 = e;
			System.out.print("catch1 ");
		} finally {
			try {
				//compiler error: e1 needs to be initialized (either with null or any other valid value)
				throw e1;
			} catch (Exception ex) {
				System.out.print("catch2 ");
			}
		}
		System.out.print("End");
	}
}