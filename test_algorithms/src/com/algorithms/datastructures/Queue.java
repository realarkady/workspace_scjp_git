package com.algorithms.datastructures;

public class Queue {
	private Node first;
	private Node last;
	
	public Queue() {	}
	
	public static void main(String[] args) {

	}
	
	public void enqueue(String value) {
		if(last == null){
			last = new Node(value);
		} else {
			
		}
	}
	
	public Node dequeue() {
		
		return null;
	}
	
	@Override
	public String toString() {
		if (first == null)
			return null;
		StringBuilder sb = new StringBuilder();
		Node n = first;
		while (n.next != null) {
			sb.append(n);
			sb.append(" -> ");
			n = n.next;
		}
		sb.append(n);

		return sb.toString();
	}

}
