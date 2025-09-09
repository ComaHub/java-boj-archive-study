package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P32326 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println((scanner.nextInt() * 3) + (scanner.nextInt() * 4) + (scanner.nextInt() * 5));
		}
	}
}
