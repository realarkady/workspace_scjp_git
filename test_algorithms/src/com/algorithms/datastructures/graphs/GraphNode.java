package com.algorithms.datastructures.graphs;

import java.util.List;

public class GraphNode {
	private int val;
	private GraphNode next; //used in the Queue
	private List<GraphNode> neighbors;
	private boolean visited;
	
	GraphNode(int x) {
		this.val = x;
	}
	
	GraphNode(int x, List<GraphNode> n) {
		this.val = x;
		this.neighbors = n;
	}
	
	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public GraphNode getNext() {
		return next;
	}
	
	public void setNext(GraphNode next) {
		this.next = next;
	}
	
	public List<GraphNode> getNeighbors() {
		return neighbors;
	}
	
	public void setNeighbors(List<GraphNode> neighbors) {
		this.neighbors = neighbors;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public String toString() {
		return "value: " + this.val;
	}
	
}
