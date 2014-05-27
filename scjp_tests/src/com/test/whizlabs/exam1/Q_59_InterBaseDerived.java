package com.test.whizlabs.exam1;

interface Inter {
}

class Base implements Inter {
}

class Derived extends Base {
}

public class Q_59_InterBaseDerived {
	public static void main(String[] args) {
		Base b = new Base();
		Derived d = new Derived();
		Inter i = (Base) b; // 1
		i = (Base) d; // 2
		
		//ClassCastException:
		Derived bd = (Derived) b; // 3
		
		b = (Base) i; // 4
	}
}