package com.tasks.examlab.diagnostic;

public class Q_19_checked_exception {
	public static void main(String args[]) {
		int i = 4;
		try {
			i = i / 0;
		//this does not compile!!! because try does not have any line that throws a checked exception
		//} catch (InterruptedException e) {
		//	System.out.print("ie ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("aioob ");
		} catch (RuntimeException e) {
			System.out.print("re ");
		} catch (Exception e) {
			System.out.print("e ");
		}

	}
}