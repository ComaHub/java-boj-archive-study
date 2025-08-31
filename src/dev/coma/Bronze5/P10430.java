package dev.coma.Bronze5;

import java.util.Scanner;

public class P10430 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			System.out.println((a + b) % c);
			System.out.println(((a % c) + (b % c)) % c);
			System.out.println((a * b) % c);
			System.out.println(((a % c) * (b % c)) % c);
		}
  }
}
