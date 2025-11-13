package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P25915 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char input = scanner.nextLine().charAt(0);
			
			int firstLength = Math.abs('I' - input);
			System.out.println(firstLength + 84);
		}
	}
}
