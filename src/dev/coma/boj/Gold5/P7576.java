package dev.coma.boj.Gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P7576 {
	private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	private static List<Node> ripingTomatoes = new ArrayList<>();
	private static int ripeDays = 0;
	
	private static class Node {
		int state;
		Node topNode;
		Node downNode;
		Node leftNode;
		Node rightNode;
		
		Node(int state) {
			this.state = state;
		}
	}
	
	public static void main(String[] args) {
		try (BR) {
			String[] settings = BR.readLine().split(" ");
			int col = Integer.parseInt(settings[0]);
			int row = Integer.parseInt(settings[1]);
			
			Node[][] tomatoBox = new Node[row][col];
			StringTokenizer stringTokenizer;
			for (int i = 0; i < tomatoBox.length; i++) {
				stringTokenizer = new StringTokenizer(BR.readLine(), " ");
				
				for (int j = 0; j < tomatoBox[i].length; j++) {
					int state = Integer.parseInt(stringTokenizer.nextToken());
					Node node = state != -1 ? new Node(state) : null;
					tomatoBox[i][j] = node;
					
					if (state == 1) {
						ripingTomatoes.add(node);
					}
				}
			}
			
			for (int i = 0; i < tomatoBox.length; i++) {
				for (int j = 0; j < tomatoBox[i].length; j++) {
					Node node = tomatoBox[i][j];
					
					if (node != null) {
						if (i != 0) node.topNode = tomatoBox[i - 1][j];
						if (j != 0) node.leftNode = tomatoBox[i][j - 1];
						if (j != col - 1) node.rightNode = tomatoBox[i][j + 1];
						if (i != row - 1) node.downNode = tomatoBox[i + 1][j];											
					}
				}
			}
			
			ripeTomato();
			
			for (int i = 0; i < tomatoBox.length; i++) {
				for (int j = 0; j < tomatoBox[i].length; j++) {
					if (tomatoBox[i][j] != null && tomatoBox[i][j].state == 0) {
						System.out.println(-1);
						return;
					}
				}
			}
			
			System.out.println(ripeDays);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void ripeTomato() {
		if (ripingTomatoes.size() == 0) return;
		
		while (true) {
			List<Node> newRipingTomatoes = new ArrayList<>();
			for (Node tomato : ripingTomatoes) {
				if (tomato.topNode != null && tomato.topNode.state != 1 && tomato.topNode.state != -1) {
					tomato.topNode.state = 1;
					newRipingTomatoes.add(tomato.topNode);
				}
				
				if (tomato.downNode != null && tomato.downNode.state != 1 && tomato.downNode.state != -1) {
					tomato.downNode.state = 1;
					newRipingTomatoes.add(tomato.downNode);
				}
				
				if (tomato.leftNode != null && tomato.leftNode.state != 1 && tomato.leftNode.state != -1) {
					tomato.leftNode.state = 1;
					newRipingTomatoes.add(tomato.leftNode);
				}
				
				if (tomato.rightNode != null && tomato.rightNode.state != 1 && tomato.rightNode.state != -1) {
					tomato.rightNode.state = 1;
					newRipingTomatoes.add(tomato.rightNode);
				}
			}
			
			if (!newRipingTomatoes.isEmpty()) {
				ripeDays++;
				ripingTomatoes = newRipingTomatoes;				
			} else {
				break;
			}
		}
		
	}
	
}
