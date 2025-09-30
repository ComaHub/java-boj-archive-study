package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P8760 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
				int row = scanner.nextInt();
				int col = scanner.nextInt();
				
				if (row == 1 && col == 1) System.out.println(0);
				else if (row % 2 != 0 && col % 2 != 0) System.out.println((row * col - 1) / 2);
				else System.out.println((row * col) / 2);
			}
		}
	}
}
