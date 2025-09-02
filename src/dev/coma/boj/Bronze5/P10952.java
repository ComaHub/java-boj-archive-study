package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P10952 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			  int a = scanner.nextInt();
			  int b = scanner.nextInt();

			  if (a == 0 && b == 0) break;

			  System.out.println(a + b);
			}
		}
  }
}
