package com.tasks.examlab.diagnostic;

public class Q_51_exceptions {

	public static void main(String args[]) throws Throwable {
		try {
			getMe();
		} catch (ArithmeticException ae) {
			System.out.print(1);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.print(2);
		} catch (NullPointerException ae) {
			System.out.print(3);
		} catch (RuntimeException ae) {
			System.out.print(4);
		} catch (Exception ae) {
			System.out.print(5);
		}
	}

	public static void getMe() throws ArithmeticException {
		if (true)
			throw new NullPointerException();
		throw new ArrayIndexOutOfBoundsException();
	}

}