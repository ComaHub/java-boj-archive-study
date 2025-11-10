package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P14545 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
				int number = scanner.nextInt();
				int sum = 0;
				
				for (int j = 1; j <= number; j++) {
					sum += j * j;
				}
				
				System.out.println(sum);
			}
		}
	}
}
