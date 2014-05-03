/* *****
 * 
 * Write code to remove duplicates from an unsorted linked list
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 */

package com.algorithms.problems;

import com.algorithms.datastructures.generic.LinkedList;
import com.algorithms.datastructures.generic.Node;

public class p_02_01_remove_dups_in_unsorted_linked_list {
	
	public p_02_01_remove_dups_in_unsorted_linked_list() {	}
	
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < 15; i++) {
			int n = (int) (Math.random() * 100);
			l.addToTail(n);
		}
		System.out.println(l.toString());
		removeDuplicates(l);
		System.out.println(l.toString());
	}
	
	public static void removeDuplicates(LinkedList<Integer> lList){
		if(lList.head == null)
			return;
		
		if(lList.head.next == null)
			return; 
		
		Node<Integer> previousNode = lList.head;
		Node<Integer> currentNode = previousNode.next;
		
		while(currentNode != null){
			Node<Integer> runningNode = lList.head;
			while(runningNode != currentNode){
				if(runningNode.value == currentNode.value){
					System.out.println("duplicate value found: " + runningNode.value); 
					Node<Integer> temp = currentNode.next;
					previousNode.next = temp;
					currentNode = temp;
					break;
				}
				runningNode = runningNode.next;
			}
			if(runningNode == currentNode){
				previousNode = currentNode;
				currentNode = runningNode.next;
			}
		}
		
	}
	
}
