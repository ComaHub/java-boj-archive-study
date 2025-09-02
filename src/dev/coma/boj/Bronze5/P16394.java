package dev.coma.boj.Bronze5;

import java.util.Scanner;

public class P16394 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int HONGIK_YEAR = 1946;
			int year = scanner.nextInt();

			System.out.println(year - HONGIK_YEAR);
		}
  }
}