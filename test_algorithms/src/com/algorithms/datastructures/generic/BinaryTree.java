package com.algorithms.datastructures.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;

public class BinaryTree {
	private BTNode root;
	
	public BinaryTree() {	}

	public BinaryTree(BTNode root) {
		super();
		this.root = root;
	}
	
	public BinaryTree(int rootValue) {
		super();
		this.root = new BTNode();
		root.setValue(rootValue); 
	}

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(2);
		set.add(4);
		set.add(1);
		
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next()); 
		}
		
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
	
	public static void print(BTNode root, int level){
	    if(root==null)
	         return;
	    print(root.getRightNode(), level+1);
	    if(level!=0){
	        for(int i=0;i<level-1;i++)
	            System.out.print("|\t");
	            System.out.println("|-------"+root.getValue());
	    }
	    else
	        System.out.println(root.getValue());
	    print(root.getLeftNode(), level+1);
	}  
	
	public BTNode getRoot() {
		return root;
	}
	
	public void setRoot(BTNode root) {
		this.root = root;
	}
	
	
}
