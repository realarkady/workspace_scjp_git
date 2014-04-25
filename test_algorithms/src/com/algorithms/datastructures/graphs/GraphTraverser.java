package com.algorithms.datastructures.graphs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphTraverser {
	private GraphNode node;
	
	public GraphTraverser(GraphNode node) {
		super();
		this.node = node;
	}
	
	public int bfs(int value){
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		q.add(node);
		while(!q.isEmpty()){
			GraphNode n = q.poll();
			
			if(n.isVisited()){
				System.out.println(n.toString() + " was visited before...");
				continue;
			}
			
			if(value == n.getVal()){
				System.out.println(n.toString() + " found! stopping...");
				return n.getVal();
			}
			
			System.out.println(n.toString());
			
			n.setVisited(true);
			if(n.getNeighbors() == null)
				continue;
			
			for (GraphNode gNode : n.getNeighbors()) {
				q.add(gNode);
			}
			
		}
		
		return -1;
	}
	
	public int dfs(int value){
		Stack<GraphNode> s = new Stack();
		s.push(node);
		while(!s.isEmpty()){
			GraphNode n = s.pop();
			
			if(n.isVisited()){
				System.out.println(n.toString() + " was visited before...");
				continue;
			}
			

			if(value == n.getVal()){
				System.out.println(n.toString() + " found! stopping...");
				return n.getVal();
			}
			
			System.out.println(n.toString());
			
			n.setVisited(true);
			if(n.getNeighbors() == null)
				continue;
			
			for (GraphNode gNode : n.getNeighbors()) {
				s.push(gNode);
			}
			
		}
		return -1;
	}
	
}
