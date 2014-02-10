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
		
		System.out.println(nThToLast(l, 5));
	}
	
	public static Node<Integer> nThToLast(LinkedList<Integer> lList, int nThToLast){
		if(lList.head == null)
			return null;
		
		if(lList.head.next == null)
			return lList.head; 
		
		int i = 0;
		
		//create two pointers:
		Node<Integer> p1 = lList.head;
		Node<Integer> p2 = lList.head;
		
		while(p1 != null && i < nThToLast){
			p1 = p1.next;
			i++;
		}
		
		while(p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
	}
	
}
