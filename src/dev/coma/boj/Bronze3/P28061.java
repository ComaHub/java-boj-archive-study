package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P28061 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int treeCount = scanner.nextInt();
			int maxLemon = -1;
			
			for (int i = 0; i < treeCount; i++) {
				int lemon = scanner.nextInt() - (treeCount - i);
				lemon = lemon >= 0 ? lemon : 0;
				
				if (lemon > maxLemon) maxLemon = lemon;
			}
			
			System.out.println(maxLemon);
		}
	}
}
