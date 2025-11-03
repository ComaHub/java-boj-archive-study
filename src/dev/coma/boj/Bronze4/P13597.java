package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P13597 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int cardA = scanner.nextInt();
			int cardB = scanner.nextInt();
			
			if (cardA == cardB) System.out.println(cardA);
			else System.out.println(Math.max(cardA, cardB));
		}
	}
}
