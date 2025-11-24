package dev.coma.boj.Bronze2;

import java.util.Scanner;

public class P7789 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int input = scanner.nextInt();
			boolean isPrime = true;
			
			for (int i = 2; i * i <= input; i++) {
				if (input % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			int newInput = scanner.nextInt();
			int newNumber = Integer.parseInt(newInput + String.valueOf(input));
			System.out.println(newNumber);
			boolean isNewPrime = true;
			
			for (int i = 2; i * i <= newNumber; i++) {
				if (newNumber % i == 0) {
					isNewPrime = false;
					break;
				}
			}
			
			if (isPrime && isNewPrime) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
