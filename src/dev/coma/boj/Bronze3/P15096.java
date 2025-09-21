package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P15096 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			
			double sum = 0;
			int count = 0;
			for (int i = 0; i < testCase; i++) {
				double input = scanner.nextDouble();
				if (input != -1) {
					sum += input;
					count++;
				}
			}
			
			System.out.println(sum / count);
		}
	}
}
