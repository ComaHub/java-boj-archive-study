package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P32314 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int ampere = scanner.nextInt();
			int watt = scanner.nextInt();
			int volt = scanner.nextInt();
			
			System.out.println((watt / volt) >= ampere ? 1 : 0);
		}
	}
}
