package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P26592 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
				double numA = scanner.nextDouble();
				double numB = scanner.nextDouble();
				
				System.out.printf("The height of the triangle is %.2f units\n", (numA * 2) / numB);
			}
		}
	}
}
