package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P11966 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long number = scanner.nextLong();
			
			while (number > 1) {
				if (number % 2 != 0) {
					System.out.println(0);
					return;
				}
				
				number /= 2;
			}
			
			System.out.println(1);
		}
	}
}
