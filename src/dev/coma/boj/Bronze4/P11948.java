package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P11948 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int sum = 0;
			int min = 100;
			for (int i = 0; i < 4; i++) {
				int input = scanner.nextInt();
				sum += input;
				if (input < min) min = input;
			}
			
			int max = scanner.nextInt();
			max = Math.max(max, scanner.nextInt());
			
			System.out.println(sum - min + max);
		}
	}
}
