package com.algorithms.datastructures.generic;

public class BTNode<T> {
	private T value;
	private BTNode<T> leftNode;
	private BTNode<T> rightNode;
	
	public BTNode() {	}
	
	public BTNode(T value) {
		super();
		this.value = value;
	}
	
	public BTNode(T value, BTNode<T> leftNode, BTNode<T> rightNode) {
		super();
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public BTNode<T> getLeftNode() {
		return leftNode;
	}
	
	public void setLeftNode(BTNode<T> leftNode) {
		this.leftNode = leftNode;
	}
	
	public BTNode<T> getRightNode() {
		return rightNode;
	}
	
	public void setRightNode(BTNode<T> rightNode) {
		this.rightNode = rightNode;
	}
	
}
