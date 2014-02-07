package com.algorithms.datastructures;

public class LinkedList {
	Node head;
	
	public LinkedList() {	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addToTail("1");
		l.addToTail("2");
		l.addToTail("3");
		l.addToTail("4");
		l.addToTail("5");
		l.addToTail("6");
		l.addToTail("7");
		l.addToTail("8");
		l.addToTail("9");
		l.addToTail("1");
		System.out.println(l.toString());
		//l.removeNode("4");
		//l.removeNode("7");
		System.out.println(l.removeNode("4"));
		System.out.println(l.removeNode("7"));
		System.out.println(l.toString());
		l.addToTail("11");
		l.addToTail("12");
		System.out.println(l.toString());
		
	}
	
	public void addToTail(String value){
		if(head == null){
			head = new Node(value);
		} else {
			Node node = new Node(value);
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public Node removeNode(String value){
		if(head == null)
			return null;
		
		Node n = head;
		
		if(n.value == value){
			head = n.next;
			return n;
		}
		
		while(n.next != null){
			if(n.next.value == value){
				Node tempN = n.next;
				n.next = n.next.next;
				return tempN;
			}
			n = n.next;
		}
		return null;
	}
	
	@Override
	public String toString() {
		if(head == null)
			return null;
		StringBuilder sb = new StringBuilder();
		Node n = head;
		while(n.next!=null){
			sb.append(n);
			sb.append(" -> ");
			n = n.next;
		}
		sb.append(n);
		
		return sb.toString();
	}
	
}
