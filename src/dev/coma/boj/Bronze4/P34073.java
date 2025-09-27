package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P34073 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int words = Integer.parseInt(scanner.nextLine());
			String[] input = scanner.nextLine().split(" ");
			for (int i = 0; i < words; i++) {
				input[i] = input[i] + "DORO";
			}
			
			System.out.println(String.join(" ", input));
		}
	}
}
