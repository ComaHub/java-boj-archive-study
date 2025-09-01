package dev.coma.Gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7576 {
	private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	
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
				}
			}
			
			for (int i = 0; i < tomatoBox.length; i++) {
				for (int j = 0; j < tomatoBox[i].length; j++) {
					Node node = tomatoBox[i][j];
					
					if (i != 0) node.topNode = tomatoBox[i - 1][j];
					if (j != 0) node.leftNode = tomatoBox[i][j - 1];
					if (j != col - 1) node.rightNode = tomatoBox[i][j + 1];
					if (i != row - 1) node.downNode = tomatoBox[i + 1][j];					
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
