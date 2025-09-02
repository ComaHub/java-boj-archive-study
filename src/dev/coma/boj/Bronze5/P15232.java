package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P15232 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int numR = scanner.nextInt();
			int numC = scanner.nextInt();
			for (int i = 0; i < numR; i++) {
			  System.out.println("*".repeat(numC));
			}
		}
  }
}
