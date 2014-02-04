package com.algorithms.datastructures;

public class Stack {
	private Node first;
	public Stack() {	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("1");
		s.push("2");
		s.push("3");
		s.pop();
		s.push("4");
		s.push("5");
		s.push("6");
		s.push("7");
		s.pop();
		s.push("8");
		System.out.println(s.toString());
		s.push("9");
		s.push("10");
		s.push("11");
		System.out.println(s.toString());
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.toString());
	}
	
	public void push(String value){
		if(first == null){
			first = new Node(value);
		} else {
			Node node = new Node(value);
			node.next = first;
			first = node;
		}
	}
	
	public Node pop(){
		if(first == null)
			return null;
		
		Node node = first.next;
		first = node;
		return node;
	}
	
	@Override
	public String toString() {
		if(first == null)
			return null;
		StringBuilder sb = new StringBuilder();
		Node n = first;
		while(n.next!=null){
			sb.append(n);
			sb.append(" -> ");
			n = n.next;
		}
		sb.append(n);
		
		return sb.toString();
	}
}
