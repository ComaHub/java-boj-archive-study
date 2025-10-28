package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P13866 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			int numC = scanner.nextInt();
			int numD = scanner.nextInt();
			
			System.out.println(Math.abs((numA + numD) - (numB + numC)));
		}
	}
}
