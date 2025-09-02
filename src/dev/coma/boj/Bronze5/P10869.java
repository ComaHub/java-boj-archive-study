package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P10869 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a % b);
		}
  }
}
