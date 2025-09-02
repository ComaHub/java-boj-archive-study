package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P2443 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			for (int i = 1; i <= number; i++) {
			  for (int j = 1; j < i; j++) {
			    System.out.print(" ");
			  }

			  for (int j = 1; j <= (2 * number) - (2 * i) + 1; j++) {
			    System.out.print("*");
			  }

			  System.out.println();
			}
		}
  }
}
