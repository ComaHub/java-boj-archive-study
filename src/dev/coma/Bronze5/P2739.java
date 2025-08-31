package dev.coma.Bronze5;

import java.util.Scanner;

public class P2739 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();

			for (int i = 1; i <= 9; i++) {
			  System.out.println(n + " * " + i + " = " + (n * i));
			}
		}
  }
}
