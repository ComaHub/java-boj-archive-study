package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P17356 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int wookPower = scanner.nextInt();
			int jePower = scanner.nextInt();

			double num_M = (double) (jePower - wookPower) / 400;
			double result = 1 / (1 + Math.pow(10, num_M));

			System.out.println(result);
		}
  }
}
