package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P13623 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			int numC = scanner.nextInt();
			
			if (numA == numB && numB == numC) System.out.println("*");
			else if (numA == numB) System.out.println("C");
			else if (numA == numC) System.out.println("B");
			else if (numC == numB) System.out.println("A");
		}
	}
}
