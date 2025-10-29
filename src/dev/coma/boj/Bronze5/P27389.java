package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P27389 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double input = scanner.nextDouble();
			
			System.out.printf("%.2f", input / 4);
		}
	}
}
