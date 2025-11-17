package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P13752 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
				int repeatCount = scanner.nextInt();
				System.out.println("=".repeat(repeatCount));
			}
		}
	}
}
