package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P23037 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] numbers = scanner.nextLine().split("");
			int result = 0;
			
			for (String input : numbers) {
				int number = Integer.parseInt(input);
				result += Math.pow(number, 5);
			}
			
			System.out.println(result);
		}
	}
}
