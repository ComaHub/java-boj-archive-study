package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P15178 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
				int numA = scanner.nextInt();
				int numB = scanner.nextInt();
				int numC = scanner.nextInt();
				System.out.print(numA + " " + numB + " " + numC + " ");
				
				int sum = numA + numB + numC;
				System.out.println(sum == 180 ? "Seems OK" : "Check");
			}
		}
	}
}
