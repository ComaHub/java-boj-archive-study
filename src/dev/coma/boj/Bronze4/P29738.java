package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P29738 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
				printRound(i, scanner.nextInt());
			}
		}
	}
	
	private static void printRound(int num, int rank) {
		if (rank > 4500) {
			System.out.printf("Case #%d: Round 1\n", num + 1);
		} else if (rank > 1000) {
			System.out.printf("Case #%d: Round 2\n", num + 1);
		} else if (rank > 25) {
			System.out.printf("Case #%d: Round 3\n", num + 1);
		} else {
			System.out.printf("Case #%d: World Finals\n", num + 1);
		}
	}
}
