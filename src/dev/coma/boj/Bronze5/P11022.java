package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P11022 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			for (int i = 0; i < testCase; i++) {
			  int a = scanner.nextInt();
			  int b = scanner.nextInt();

			  System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));
			}
		}
  }
}
