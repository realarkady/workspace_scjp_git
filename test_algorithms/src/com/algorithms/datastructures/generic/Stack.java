package com.algorithms.datastructures.generic;

public class Stack<T> {
	private Node<T> first;
	public Stack() {	}

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
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
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.toString());
	}
	
	public void push(T value){
		if(first == null){
			first = new Node<T>(value);
		} else {
			Node<T> node = new Node<T>(value);
			node.next = first;
			first = node;
		}
	}
	
	public T pop(){
		if(first == null)
			return null;
		
		if(first.next == null){
			T value = first.value;
			first = null;
			return value;
		}
		
		Node<T> node = first.next;
		first = node;
		return node.value;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	@Override
	public String toString() {
		if(first == null)
			return null;
		StringBuilder sb = new StringBuilder();
		Node<T> n = first;
		while(n.next!=null){
			sb.append(n);
			sb.append(" -> ");
			n = n.next;
		}
		sb.append(n);
		
		return sb.toString();
	}
}
