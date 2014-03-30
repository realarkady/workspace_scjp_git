package com.algorithms.problems;

import com.algorithms.datastructures.generic.Stack;

public class p_03_05_implement_queue_using_2stacks {

	public p_03_05_implement_queue_using_2stacks() {
	}

	public static void main(String[] args) {
		System.out.println("-------------------------");
		MyQueue<Integer> myQueue = new MyQueue<>();
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);
		myQueue.enqueue(4);
		myQueue.enqueue(5);
		myQueue.enqueue(6);
		myQueue.enqueue(7);
		myQueue.enqueue(8);
		myQueue.enqueue(9);
		myQueue.enqueue(10);
		
		System.out.println(myQueue.toString());
		
		myQueue.dequeue();
		myQueue.dequeue();
		
		System.out.println(myQueue.toString());
	}

}

class MyQueue<T> {
	Stack<T> stackOne = new Stack<>();
	Stack<T> stackTwo = new Stack<>();
	
	public void enqueue(T value) { //enqueue only on stackOne
		stackTwoToStackOne();
		stackOne.push(value);
	}
	
	public T dequeue() { //dequeue only on stackTwo
		stackOneToStackTwo();
		return stackTwo.pop();
	}
	
	private void stackOneToStackTwo(){//move all from stackOne to stackTwo
		while(!stackOne.isEmpty()){
			stackTwo.push(stackOne.pop());
		}
	}
	
	private void stackTwoToStackOne(){//move all from stackTwo to stackOne
		while(!stackTwo.isEmpty()){
			stackOne.push(stackTwo.pop());
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("stackOne: ");
		sb.append(stackOne.toString());
		sb.append("stackTwo: : ");
		sb.append(stackTwo.toString());
		
		return sb.toString();
	}
}
