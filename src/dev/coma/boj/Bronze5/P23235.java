package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P23235 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int count = 1;
			
			while (true) {
				String input = scanner.nextLine();
				if (input.equals("0")) break;
				
				System.out.printf("Case %d: Sorting... done!\n", count++);
			}
		}
	}
}
