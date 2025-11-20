package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P6438 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = Integer.parseInt(scanner.nextLine());
			for (int i = 0; i < testCase; i++) {
				String input = scanner.nextLine();
				
				System.out.println(new StringBuilder(input).reverse().toString());
			}
		}
	}
}
