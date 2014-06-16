package com.test.whizlabs.exam2;

import java.util.PriorityQueue;

public class Q_14_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String>pq = new PriorityQueue<String>(); 
		pq.add("banana");
		pq.add("pear");
		pq.add("apple");
		System.out.println(pq);
		System.out.println(pq.poll() + " " + pq.peek());
		System.out.println(pq.size());
	}
}