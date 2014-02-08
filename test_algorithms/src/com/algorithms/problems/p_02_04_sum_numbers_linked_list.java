package com.algorithms.problems;

import com.algorithms.datastructures.generic.LinkedList;
import com.algorithms.datastructures.generic.Node;

public class p_02_04_sum_numbers_linked_list {

	public p_02_04_sum_numbers_linked_list() {	}

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.addToTail(2);
		l1.addToTail(2);
		l1.addToTail(2);
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.addToTail(3);
		l2.addToTail(3);
		l2.addToTail(3);
		
		System.out.println(sum(l1, l2));
	}
	
	public static int sum(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		int num1 = 0;
		int num2 = 0;
		int z = 10;
		int i = 0;
		Node<Integer> n1 = l1.head;
		Node<Integer> n2 = l2.head;
		
		while(n1 != null){
			num1 += (int) (n1.value * Math.pow(z, i++));
			n1 = n1.next;
		}
		
		i = 0; // reset power
		while(n2 != null){
			num2 += (int) (n2.value * Math.pow(z, i++));
			n2 = n2.next;
		}
		
		return num1 + num2;
	}
}
