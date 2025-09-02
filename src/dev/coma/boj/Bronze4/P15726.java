package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P15726 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int num_A = scanner.nextInt();
			int num_B = scanner.nextInt();
			int num_C = scanner.nextInt();

			double result = (double) num_A * Math.max(num_B, num_C) / Math.min(num_B, num_C);

			System.out.println((int) result);
		}
  }
}
