package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P10995 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			
			for (int i = 0; i < number; i++) {
				if (i % 2 == 0) {
					printLeftStar(number);
				} else {
					printRightStar(number);
				}
			}
		}
	}
	
	private static void printRightStar(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print(" *");
		}
		
		System.out.println();
	}
	
	private static void printLeftStar(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
