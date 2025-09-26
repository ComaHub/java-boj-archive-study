package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P13129 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numA = scanner.nextInt(), numB = scanner.nextInt(), count = scanner.nextInt();
			
			int sum = numA * count;
			for (int i = 1; i <= count; i++) {
				System.out.print((sum + (numB * i)) + " ");
			}
			
		}
	}
}
