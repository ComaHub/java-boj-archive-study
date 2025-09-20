package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P7130 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int milk = scanner.nextInt();
			int honey = scanner.nextInt();
			
			int testCase = scanner.nextInt();
			int sum = 0;
			for (int i = 0; i < testCase; i++) {
				sum += Math.max(scanner.nextInt() * milk, scanner.nextInt() * honey);
			}
			
			System.out.println(sum);
		}
	}
}
