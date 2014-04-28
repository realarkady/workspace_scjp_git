package com.algorithms.datastructures.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
	private GraphNode node;
	
	public ShortestPath(GraphNode node) {
		super();
		this.node = node;
	}
	
	public int dijkstra(int value){
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
}
