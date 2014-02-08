package com.algorithms.datastructures.generic;

public class Node<T> {
	public Node<T> next;
	public T value;
	
	public Node() {	}
	
	public Node(T value) {
		super();
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value + "";
	}
	
}
