package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P11549 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int answer = scanner.nextInt();
			int correctCount = 0;
			
			for (int i = 0; i < 5; i++) {
				int input = scanner.nextInt();
				if (answer == input) correctCount++;
			}
			
			System.out.println(correctCount);
		}
	}
}
