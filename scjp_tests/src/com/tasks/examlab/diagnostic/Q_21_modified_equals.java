package com.tasks.examlab.diagnostic;

class Profile {

	private int a;

	public Profile(int a) {
		this.a = a;
	}
	
	private Boolean equals(Profile p) {
		return p.a == this.a;
	}

}

public class Q_21_modified_equals {

	public static void main(String args[]) {
		Profile pf1 = new Profile(4);
		Profile pf2 = new Profile(4);
		//private Boolean equals() -->> is private so the equals from superclass will be called:
		Object ob = pf1.equals(pf2);
		System.out.print(ob);
	}

}