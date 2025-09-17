package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P15610 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double input = scanner.nextDouble();
			
			System.out.println(Math.sqrt(input) * 4);
		}
	}
}
