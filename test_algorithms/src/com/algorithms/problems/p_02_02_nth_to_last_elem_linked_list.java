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
		
		Node<Integer> currentNode = lList.head;
		Node<Integer> backNode = lList.head;
		
		while(currentNode != null){
			while(backNode.next != currentNode){
				if(backNode.next.value == currentNode.value){
					backNode.next = backNode.next.next;
				}
				backNode = backNode.next;
			}
			currentNode = currentNode.next;
		}
		
		return null;
	}
	
}
