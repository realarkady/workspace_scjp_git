package com.algorithms.problems;

import com.algorithms.datastructures.generic.LinkedList;
import com.algorithms.datastructures.generic.Node;

public class p_02_02_nth_to_last_elem_linked_list {
	
	public p_02_02_nth_to_last_elem_linked_list() {	}
	
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < 15; i++) {
			int n = (int) (Math.random() * 100);
			l.addToTail(n);
		}
		System.out.println(l.toString());
		
		System.out.println(nThToLast(l, 15));
	}
	
	public static Node<Integer> nThToLast(LinkedList<Integer> lList, int nThToLast){
		if(lList.head == null)
			return null;
		
		if(lList.head.next == null)
			return lList.head; 
		
		Node<Integer> node = lList.head;
		
		while(node.next != null){
			
			node = node.next;
		}
		
		return null;
	}
	
}
