package com.test.whizlabs.diagnostic;

public class Q_32_try_catch_finally {

	public Q_32_try_catch_finally() {	}
	
	public static void main(String[] args) {
		int i = 0;
		try {
			for (;true; i++) {
				if(i/i++ > 0)
					break;
			}
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
		} //catch (ArithmeticException e) {
			//System.out.println("ArithmeticException");  
		//} // unreachable code (ArithmeticException extends RuntimeException)
		catch (Exception e) {
			System.out.println("Exception");
		}
		finally {
			System.out.println("finally2");
		}
		
	}
	
}
