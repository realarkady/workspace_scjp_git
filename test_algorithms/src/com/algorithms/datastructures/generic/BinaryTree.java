package com.algorithms.datastructures.generic;

public class BinaryTree {
	private BTNode root;
	
	public BinaryTree() {	}

	public BinaryTree(BTNode root) {
		super();
		this.root = root;
	}

	public static void main(String[] args) {
		BTNode treeRoot = new BTNode(50);
		BinaryTree bTree = new BinaryTree(treeRoot);
		bTree.insert(60);
		bTree.insert(65);
		bTree.insert(84);
		bTree.insert(85);
		bTree.insert(70);
		bTree.insert(55);
		bTree.insert(51);
		bTree.insert(62);
		bTree.insert(45);
		bTree.insert(30);
		bTree.insert(35);
		bTree.insert(44);
		bTree.insert(11);
		bTree.insert(10);
		bTree.insert(25);
		bTree.insert(38);
		bTree.insert(16);
		bTree.insert(10);
		bTree.insert(12);
		bTree.insert(1);
		
		bTree.find(99);
		
	}
	
	public BTNode find(int value) {
		return this.findNode(root, value); 
	}
	
	public boolean insert(int value) {
		return this.insertNode(root, value);
	}
	
	private boolean insertNode(BTNode node, int value) {
		if(node.getValue() == value){
			System.out.println("node exists, value: " + value);
			return false;
		}
		else if(value < node.getValue()){
			if(node.getLeftNode() != null){
				insertNode(node.getLeftNode(), value);
			} else {
				BTNode n = new BTNode(value);
				node.setLeftNode(n);
				System.out.println("node inserte to left, value: " + value);
				return true;
			}
		} else if(value > node.getValue()){
			if(node.getRightNode() != null){
				insertNode(node.getRightNode(), value);
			} else {
				BTNode n = new BTNode(value);
				node.setRightNode(n);
				System.out.println("node inserte to right, value: " + value);
				return true;
			}
		}
		
		return false;
		
	}
	
	public BTNode findNode(BTNode node, int value){
		if(node.getValue() == value){
			System.out.println("node found, value: " + value);
			return node;
		}
		
		if(value < node.getValue() && node.getLeftNode() != null){
			findNode(node.getLeftNode(), value);
			return null;
		} else if(value > node.getValue() && node.getRightNode() != null){
			findNode(node.getRightNode(), value);
			return null;
		}
		
		System.out.println("node not found!");
		return null;
	}
	
	public BTNode getRoot() {
		return root;
	}
	
	public void setRoot(BTNode root) {
		this.root = root;
	}
	
	
}
