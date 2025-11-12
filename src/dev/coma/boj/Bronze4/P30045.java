package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P30045 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = Integer.parseInt(scanner.nextLine());
			int count = 0;
			
			for (int i = 0; i < testCase; i++) {
				String input = scanner.nextLine();
				if (input.contains("01") || input.contains("OI")) count++;
			}
			
			System.out.println(count);
		}
	}
}
