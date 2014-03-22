package com.test.inheritance_protected;

import com.test.inheritance.ParentProtected;

public class TestProtected {

	public TestProtected() {	}

	public static void main(String[] args) {
		ParentProtected pp = new ChildProtected();
		ChildProtected cp = new ChildProtected();
		//pp.myProtected();
		cp.myProtected();
	}

}
