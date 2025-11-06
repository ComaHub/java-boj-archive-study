package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P31048 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
				int input = scanner.nextInt();
				int result = 1;
				
				for (int j = 1; j <= input; j++) {
					result *= j;
					result %= 10;
				}
				
				System.out.println(result);
			}
		}
	}
}
