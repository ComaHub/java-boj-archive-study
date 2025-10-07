package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P11282 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println((char) ('가' + scanner.nextInt() - 1));
		}
	}
}