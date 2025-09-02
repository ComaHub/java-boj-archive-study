package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P2446 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();

			for (int i = 1; i < (number * 2); i++) {
			  if (i <= number) {
			    for (int j = 1; j < i; j++) {
			      System.out.print(" ");
			    }

			    for (int j = 1; j <= (number * 2) - ((2 * i) - 1); j++) {
			      System.out.print("*");
			    }
			  } else {
			    for (int j = 1; j < (number * 2) - i; j++) {
			      System.out.print(" ");
			    }

			    for (int j = 1; j <= (2 * (i - number) + 1); j++) {
			      System.out.print("*");
			    }
			  }

			  System.out.println();
			}
		}
  }
}
