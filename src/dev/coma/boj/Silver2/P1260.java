package dev.coma.boj.Silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class P1260 {
	private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	private static final List<String> RESULT_LIST = new ArrayList<>();
	
	private static class Node {
		int number;
		boolean visited = false;
		List<Node> linkedNodeList = new ArrayList<>();
		
		Node(int number) {
			this.number = number;
		}
	}
	
	public static void main(String[] args) {
		try (BR) {
			String[] settings = BR.readLine().split(" ");
			int nodeNum = Integer.parseInt(settings[0]);
			int graphNum = Integer.parseInt(settings[1]);
			int startNode = Integer.parseInt(settings[2]);
			
			Node[] nodeArr = new Node[nodeNum + 1];
			for (int i = 0; i < nodeArr.length; i++) {
				nodeArr[i] = new Node(i);
			}
			
			for (int i = 0; i < graphNum; i++) {
				String[] input = BR.readLine().split(" ");
				Node leftNode = nodeArr[Integer.parseInt(input[0])];
				Node rightNode = nodeArr[Integer.parseInt(input[1])];
				
				leftNode.linkedNodeList.add(rightNode);
				rightNode.linkedNodeList.add(leftNode);
			}
			
			dfs(nodeArr[startNode]);
			System.out.println(String.join(" ", RESULT_LIST));
			
			for (Node node : nodeArr) {
				node.visited = false;
			}
			RESULT_LIST.clear();
			
			bfs(nodeArr[startNode]);
			System.out.println(String.join(" ", RESULT_LIST));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void dfs(Node startNode) {
		ArrayDeque<Node> stack = new ArrayDeque<>();
		stack.push(startNode);
		
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			if (node.visited) continue;
			
			RESULT_LIST.add(String.valueOf(node.number));
			node.visited = true;
			
			node.linkedNodeList.sort((o1, o2) -> Integer.compare(o2.number, o1.number));
			for (Node linkedNode : node.linkedNodeList) {
				if (!linkedNode.visited) {
					stack.push(linkedNode);
				}
			}
		}
	}
	
	private static void bfs(Node startNode) {
		Queue<Node> queue = new ArrayDeque<>();
		queue.offer(startNode);
		
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			if (node.visited) continue;
			
			RESULT_LIST.add(String.valueOf(node.number));
			node.visited = true;
			
			node.linkedNodeList.sort((o1, o2) -> Integer.compare(o1.number, o2.number));
			for (Node linkedNode : node.linkedNodeList) {
				if (!linkedNode.visited) {
					queue.offer(linkedNode);
				}
			}
		}
	}
	
}
