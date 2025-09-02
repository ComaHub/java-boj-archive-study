package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P5565 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
			int fullPrice = scanner.nextInt();
			for (int i = 0; i < 9; i++) {
			  fullPrice -= scanner.nextInt();
			}

			System.out.println(fullPrice);
		}
  }
}
