package com.algorithms.datastructures.generic;

public class BTNode {
	private int value;
	private BTNode leftNode;
	private BTNode rightNode;
	
	public BTNode() {	}
	
	public BTNode(int value) {
		super();
		this.value = value;
	}
	
	public BTNode(int value, BTNode leftNode, BTNode rightNode) {
		super();
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public BTNode getLeftNode() {
		return leftNode;
	}
	
	public void setLeftNode(BTNode leftNode) {
		this.leftNode = leftNode;
	}
	
	public BTNode getRightNode() {
		return rightNode;
	}
	
	public void setRightNode(BTNode rightNode) {
		this.rightNode = rightNode;
	}
	
}
