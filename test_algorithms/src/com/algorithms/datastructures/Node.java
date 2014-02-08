package com.algorithms.datastructures;

@Deprecated
public class Node {
	public Node next;
	public String value;
	
	public Node() {	}
	
	public Node(String value) {
		super();
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
