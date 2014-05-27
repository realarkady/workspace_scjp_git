package com.algorithms.datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphTest {
	
	public GraphTest() {	}
	
	public static void main(String[] args) {
		GraphNode node_01 = new GraphNode(1);
		GraphNode node_02 = new GraphNode(2);
		GraphNode node_03 = new GraphNode(3);
		GraphNode node_04 = new GraphNode(4);
		GraphNode node_05 = new GraphNode(5);
		GraphNode node_06 = new GraphNode(6);
		GraphNode node_07 = new GraphNode(7);
		GraphNode node_08 = new GraphNode(8);
		GraphNode node_09 = new GraphNode(9);
		GraphNode node_10 = new GraphNode(10);
		GraphNode node_11 = new GraphNode(11);
		GraphNode node_12 = new GraphNode(12);
		GraphNode node_13 = new GraphNode(13);
		GraphNode node_14 = new GraphNode(14);
		GraphNode node_15 = new GraphNode(15);
		
		List<GraphNode> ln_01 = new ArrayList<GraphNode>();
		List<GraphNode> ln_02 = new ArrayList<GraphNode>();
		List<GraphNode> ln_03 = new ArrayList<GraphNode>();
		List<GraphNode> ln_04 = new ArrayList<GraphNode>();
		List<GraphNode> ln_06 = new ArrayList<GraphNode>();
		List<GraphNode> ln_07 = new ArrayList<GraphNode>();
		List<GraphNode> ln_09 = new ArrayList<GraphNode>();
		
		ln_01.add(node_02);
		ln_01.add(node_03);
		ln_01.add(node_04);
		
		ln_02.add(node_05);
		ln_02.add(node_06);
		
		ln_03.add(node_07);
		
		//ln_04.add(node_07);
		ln_04.add(node_08);
		ln_04.add(node_09);
		ln_04.add(node_10);
		
		ln_06.add(node_11);
		
		ln_07.add(node_12);
		ln_07.add(node_13);
		ln_07.add(node_14);
		
		ln_09.add(node_15);
		
		node_01.setNeighbors(ln_01);
		node_02.setNeighbors(ln_02);
		node_03.setNeighbors(ln_03);
		node_04.setNeighbors(ln_04);
		node_06.setNeighbors(ln_06);
		node_07.setNeighbors(ln_07);
		node_09.setNeighbors(ln_09);
		
		GraphTraverser gt = new GraphTraverser(node_01);
		//gt.bfs(15);
		gt.dfs(5);
		
		int i = 40 * 2100000000;
		System.out.println(i); 
	}
	
}
