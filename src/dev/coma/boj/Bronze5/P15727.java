package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P15727 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();

			int result = n / 5;
			if ((n % 5) != 0) {
			  result++;
			}

			System.out.println(result);
		}
  }
}
