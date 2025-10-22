package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P31654 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			int numC = scanner.nextInt();
			
			System.out.println((numA + numB) == numC ? "correct!" : "wrong!");
		}
	}
}
