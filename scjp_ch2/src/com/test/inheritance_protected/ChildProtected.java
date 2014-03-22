package com.test.inheritance_protected;

import com.test.inheritance.ParentProtected;

public class ChildProtected extends ParentProtected{

	public ChildProtected() {
		
	}

	protected String myProtected() {
		System.out.println("ChildProtected.myProtected()");
		return "ChildProtected.myProtected()";
	} 

}
