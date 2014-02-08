package com.algorithms.datastructures.generic;

public class Queue<T> {
	private Node<T> first;
	private Node<T> last;
	
	public Queue() {	}
	
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>();
		q.enqueue("1");
		q.enqueue("2");
		q.enqueue("3");
		q.enqueue("4");
		q.enqueue("5");
		q.enqueue("6");
		q.enqueue("7");
		q.enqueue("8");
		q.enqueue("1");
		System.out.println(q.toString());
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println(q.toString());
		
	}
	
	public void enqueue(T value) {
		if(last == null){
			last = first = new Node<T>(value);
		} else {
			//Node node = new Node(value);
			last.next = new Node<T>(value);
			last = last.next;
		}
	}
	
	public Node<T> dequeue() {
		if(first != null){
			Node<T> node = first;
			first = first.next;
			return node;
		}
		return null;
	}
	
	@Override
	public String toString() {
		if (first == null)
			return null;
		StringBuilder sb = new StringBuilder();
		Node<T> n = first;
		while (n.next != null) {
			sb.append(n);
			sb.append(" -> ");
			n = n.next;
		}
		sb.append(n);

		return sb.toString();
	}

}
